/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2014 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;

/**
 * Controls the printing and parsing of a datetime to and from a string.
 * <p>
 * This class is the main API for printing and parsing used by most applications.
 * Instances of this class are created via one of three factory classes:
 * <ul>
 * <li>{@link DateTimeFormat} - formats by pattern and style</li>
 * <li>{@link ISODateTimeFormat} - ISO8601 formats</li>
 * <li>{@link DateTimeFormatterBuilder} - complex formats created via method calls</li>
 * </ul>
 * <p>
 * An instance of this class holds a reference internally to one printer and
 * one parser. It is possible that one of these may be null, in which case the
 * formatter cannot print/parse. This can be checked via the {@link #isPrinter()}
 * and {@link #isParser()} methods.
 * <p>
 * The underlying printer/parser can be altered to behave exactly as required
 * by using one of the decorator modifiers:
 * <ul>
 * <li>{@link #withLocale(Locale)} - returns a new formatter that uses the specified locale</li>
 * <li>{@link #withZone(DateTimeZone)} - returns a new formatter that uses the specified time zone</li>
 * <li>{@link #withChronology(Chronology)} - returns a new formatter that uses the specified chronology</li>
 * <li>{@link #withOffsetParsed()} - returns a new formatter that returns the parsed time zone offset</li>
 * <li>{@link #withPivotYear(int)} - returns a new formatter with the specified pivot year</li>
 * <li>{@link #withDefaultYear(int)} - returns a new formatter with the specified default year</li>
 * </ul>
 * Each of these returns a new formatter (instances of this class are immutable).
 * <p>
 * The main methods of the class are the <code>printXxx</code> and
 * <code>parseXxx</code> methods. These are used as follows:
 * <pre>
 * // print using the defaults (default locale, chronology/zone of the datetime)
 * String dateStr = formatter.print(dt);
 * // print using the French locale
 * String dateStr = formatter.withLocale(Locale.FRENCH).print(dt);
 * // print using the UTC zone
 * String dateStr = formatter.withZone(DateTimeZone.UTC).print(dt);
 *
 * // parse using the Paris zone
 * DateTime date = formatter.withZone(DateTimeZone.forID("Europe/Paris")).parseDateTime(str);
 * </pre>
 * <p>
 * Parsing builds up the resultant instant by 'setting' the value of each parsed field
 * from largest to smallest onto an initial instant, typically 1970-01-01T00:00Z.
 * This design means that day-of-month is set before day-of-week.
 * As such, if both the day-of-month and day-of-week are parsed, and the day-of-week
 * is incorrect, then the day-of-week overrides the day-of-month.
 * <p>
 * This has a side effect if the input is not consistent.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @author Fredrik Borgh
 * @since 1.0
 */
public class DateTimeFormatter {public static class __CLR4_4_1c1dc1dlgchor0g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,15899,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The internal printer used to output the datetime.
     */
    private final InternalPrinter iPrinter;
    /**
     * The internal parser used to output the datetime.
     */
    private final InternalParser iParser;
    /**
     * The locale to use for printing and parsing.
     */
    private final Locale iLocale;
    /**
     * Whether the offset is parsed.
     */
    private final boolean iOffsetParsed;
    /**
     * The chronology to use as an override.
     */
    private final Chronology iChrono;
    /**
     * The zone to use as an override.
     */
    private final DateTimeZone iZone;
    /**
     * The pivot year to use for two-digit year parsing.
     */
    private final Integer iPivotYear;
    /**
     * The default year for parsing month/day without year.
     */
    private final int iDefaultYear;

    /**
     * Creates a new formatter, however you will normally use the factory
     * or the builder.
     *
     * @param printer the internal printer, null if cannot print
     * @param parser  the internal parser, null if cannot parse
     */
    public DateTimeFormatter(
            DateTimePrinter printer, DateTimeParser parser) {
        this(DateTimePrinterInternalPrinter.of(printer), DateTimeParserInternalParser.of(parser));__CLR4_4_1c1dc1dlgchor0g.R.inc(15602);try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15601);
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Creates a new formatter, however you will normally use the factory
     * or the builder.
     *
     * @param printer the internal printer, null if cannot print
     * @param parser  the internal parser, null if cannot parse
     */
    DateTimeFormatter(
            InternalPrinter printer, InternalParser parser) {
        super();__CLR4_4_1c1dc1dlgchor0g.R.inc(15604);try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15603);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15605);iPrinter = printer;
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15606);iParser = parser;
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15607);iLocale = null;
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15608);iOffsetParsed = false;
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15609);iChrono = null;
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15610);iZone = null;
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15611);iPivotYear = null;
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15612);iDefaultYear = 2000;
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Constructor.
     */
    private DateTimeFormatter(
            InternalPrinter printer, InternalParser parser,
            Locale locale, boolean offsetParsed,
            Chronology chrono, DateTimeZone zone,
            Integer pivotYear, int defaultYear) {
        super();__CLR4_4_1c1dc1dlgchor0g.R.inc(15614);try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15613);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15615);iPrinter = printer;
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15616);iParser = parser;
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15617);iLocale = locale;
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15618);iOffsetParsed = offsetParsed;
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15619);iChrono = chrono;
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15620);iZone = zone;
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15621);iPivotYear = pivotYear;
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15622);iDefaultYear = defaultYear;
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Is this formatter capable of printing.
     *
     * @return true if this is a printer
     */
    public boolean isPrinter() {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15623);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15624);return (iPrinter != null);
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Gets the internal printer object that performs the real printing work.
     *
     * @return the internal printer; is null if printing not supported
     */
    public DateTimePrinter getPrinter() {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15625);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15626);return InternalPrinterDateTimePrinter.of(iPrinter);
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Gets the internal printer object that performs the real printing work.
     *
     * @return the internal printer; is null if printing not supported
     */
    InternalPrinter getPrinter0() {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15627);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15628);return iPrinter;
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Is this formatter capable of parsing.
     *
     * @return true if this is a parser
     */
    public boolean isParser() {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15629);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15630);return (iParser != null);
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Gets the internal parser object that performs the real parsing work.
     *
     * @return the internal parser; is null if parsing not supported
     */
    public DateTimeParser getParser() {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15631);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15632);return InternalParserDateTimeParser.of(iParser);
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    InternalParser getParser0() {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15633);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15634);return iParser;
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new formatter with a different locale that will be used
     * for printing and parsing.
     * <p>
     * A DateTimeFormatter is immutable, so a new instance is returned,
     * and the original is unaltered and still usable.
     *
     * @param locale the locale to use; if null, formatter uses default locale
     *               at invocation time
     * @return the new formatter
     */
    public DateTimeFormatter withLocale(Locale locale) {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15635);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15636);if ((((locale == getLocale() || (locale != null && locale.equals(getLocale())))&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15637)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15638)==0&false))) {{
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15639);return this;
        }
        }__CLR4_4_1c1dc1dlgchor0g.R.inc(15640);return new DateTimeFormatter(iPrinter, iParser, locale,
                iOffsetParsed, iChrono, iZone, iPivotYear, iDefaultYear);
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Gets the locale that will be used for printing and parsing.
     *
     * @return the locale to use; if null, formatter uses default locale at
     * invocation time
     */
    public Locale getLocale() {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15641);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15642);return iLocale;
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new formatter that will create a datetime with a time zone
     * equal to that of the offset of the parsed string.
     * <p>
     * After calling this method, a string '2004-06-09T10:20:30-08:00' will
     * create a datetime with a zone of -08:00 (a fixed zone, with no daylight
     * savings rules). If the parsed string represents a local time (no zone
     * offset) the parsed datetime will be in the default zone.
     * <p>
     * Calling this method sets the override zone to null.
     * Calling the override zone method sets this flag off.
     *
     * @return the new formatter
     */
    public DateTimeFormatter withOffsetParsed() {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15643);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15644);if ((((iOffsetParsed == true)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15645)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15646)==0&false))) {{
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15647);return this;
        }
        }__CLR4_4_1c1dc1dlgchor0g.R.inc(15648);return new DateTimeFormatter(iPrinter, iParser, iLocale,
                true, iChrono, null, iPivotYear, iDefaultYear);
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Checks whether the offset from the string is used as the zone of
     * the parsed datetime.
     *
     * @return true if the offset from the string is used as the zone
     */
    public boolean isOffsetParsed() {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15649);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15650);return iOffsetParsed;
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new formatter that will use the specified chronology in
     * preference to that of the printed object, or ISO on a parse.
     * <p>
     * When printing, this chronology will be used in preference to the chronology
     * from the datetime that would otherwise be used.
     * <p>
     * When parsing, this chronology will be set on the parsed datetime.
     * <p>
     * A null chronology means no-override.
     * If both an override chronology and an override zone are set, the
     * override zone will take precedence over the zone in the chronology.
     *
     * @param chrono the chronology to use as an override
     * @return the new formatter
     */
    public DateTimeFormatter withChronology(Chronology chrono) {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15651);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15652);if ((((iChrono == chrono)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15653)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15654)==0&false))) {{
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15655);return this;
        }
        }__CLR4_4_1c1dc1dlgchor0g.R.inc(15656);return new DateTimeFormatter(iPrinter, iParser, iLocale,
                iOffsetParsed, chrono, iZone, iPivotYear, iDefaultYear);
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Gets the chronology to use as an override.
     *
     * @return the chronology to use as an override
     */
    public Chronology getChronology() {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15657);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15658);return iChrono;
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Gets the chronology to use as an override.
     *
     * @return the chronology to use as an override
     * @deprecated Use the method with the correct spelling
     */
    @Deprecated
    public Chronology getChronolgy() {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15659);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15660);return iChrono;
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new formatter that will use the UTC zone in preference
     * to the zone of the printed object, or default zone on a parse.
     * <p>
     * When printing, UTC will be used in preference to the zone
     * from the datetime that would otherwise be used.
     * <p>
     * When parsing, UTC will be set on the parsed datetime.
     * <p>
     * If both an override chronology and an override zone are set, the
     * override zone will take precedence over the zone in the chronology.
     *
     * @return the new formatter, never null
     * @since 2.0
     */
    public DateTimeFormatter withZoneUTC() {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15661);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15662);return withZone(DateTimeZone.UTC);
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Returns a new formatter that will use the specified zone in preference
     * to the zone of the printed object, or default zone on a parse.
     * <p>
     * When printing, this zone will be used in preference to the zone
     * from the datetime that would otherwise be used.
     * <p>
     * When parsing, this zone will be set on the parsed datetime.
     * <p>
     * A null zone means of no-override.
     * If both an override chronology and an override zone are set, the
     * override zone will take precedence over the zone in the chronology.
     *
     * @param zone the zone to use as an override
     * @return the new formatter
     */
    public DateTimeFormatter withZone(DateTimeZone zone) {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15663);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15664);if ((((iZone == zone)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15665)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15666)==0&false))) {{
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15667);return this;
        }
        }__CLR4_4_1c1dc1dlgchor0g.R.inc(15668);return new DateTimeFormatter(iPrinter, iParser, iLocale,
                false, iChrono, zone, iPivotYear, iDefaultYear);
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Gets the zone to use as an override.
     *
     * @return the zone to use as an override
     */
    public DateTimeZone getZone() {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15669);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15670);return iZone;
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new formatter that will use the specified pivot year for two
     * digit year parsing in preference to that stored in the parser.
     * <p>
     * This setting is useful for changing the pivot year of formats built
     * using a pattern - {@link DateTimeFormat#forPattern(String)}.
     * <p>
     * When parsing, this pivot year is used. Null means no-override.
     * There is no effect when printing.
     * <p>
     * The pivot year enables a two digit year to be converted to a four
     * digit year. The pivot represents the year in the middle of the
     * supported range of years. Thus the full range of years that will
     * be built is <code>(pivot - 50) .. (pivot + 49)</code>.
     *
     * <pre>
     * pivot   supported range   00 is   20 is   40 is   60 is   80 is
     * ---------------------------------------------------------------
     * 1950      1900..1999      1900    1920    1940    1960    1980
     * 1975      1925..2024      2000    2020    1940    1960    1980
     * 2000      1950..2049      2000    2020    2040    1960    1980
     * 2025      1975..2074      2000    2020    2040    2060    1980
     * 2050      2000..2099      2000    2020    2040    2060    2080
     * </pre>
     *
     * @param pivotYear the pivot year to use as an override when parsing
     * @return the new formatter
     * @since 1.1
     */
    public DateTimeFormatter withPivotYear(Integer pivotYear) {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15671);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15672);if ((((iPivotYear == pivotYear || (iPivotYear != null && iPivotYear.equals(pivotYear)))&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15673)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15674)==0&false))) {{
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15675);return this;
        }
        }__CLR4_4_1c1dc1dlgchor0g.R.inc(15676);return new DateTimeFormatter(iPrinter, iParser, iLocale,
                iOffsetParsed, iChrono, iZone, pivotYear, iDefaultYear);
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Returns a new formatter that will use the specified pivot year for two
     * digit year parsing in preference to that stored in the parser.
     * <p>
     * This setting is useful for changing the pivot year of formats built
     * using a pattern - {@link DateTimeFormat#forPattern(String)}.
     * <p>
     * When parsing, this pivot year is used.
     * There is no effect when printing.
     * <p>
     * The pivot year enables a two digit year to be converted to a four
     * digit year. The pivot represents the year in the middle of the
     * supported range of years. Thus the full range of years that will
     * be built is <code>(pivot - 50) .. (pivot + 49)</code>.
     *
     * <pre>
     * pivot   supported range   00 is   20 is   40 is   60 is   80 is
     * ---------------------------------------------------------------
     * 1950      1900..1999      1900    1920    1940    1960    1980
     * 1975      1925..2024      2000    2020    1940    1960    1980
     * 2000      1950..2049      2000    2020    2040    1960    1980
     * 2025      1975..2074      2000    2020    2040    2060    1980
     * 2050      2000..2099      2000    2020    2040    2060    2080
     * </pre>
     *
     * @param pivotYear the pivot year to use as an override when parsing
     * @return the new formatter
     * @since 1.1
     */
    public DateTimeFormatter withPivotYear(int pivotYear) {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15677);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15678);return withPivotYear(Integer.valueOf(pivotYear));
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Gets the pivot year to use as an override.
     *
     * @return the pivot year to use as an override
     * @since 1.1
     */
    public Integer getPivotYear() {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15679);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15680);return iPivotYear;
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new formatter that will use the specified default year.
     * <p>
     * The default year is used when parsing in the case where there is a
     * month or a day but not a year. Specifically, it is used if there is
     * a field parsed with a duration between the length of a month and the
     * length of a day inclusive.
     * <p>
     * This value is typically used to move the year from 1970 to a leap year
     * to enable February 29th to be parsed.
     * Unless customised, the year 2000 is used.
     * <p>
     * This setting has no effect when printing.
     *
     * @param defaultYear the default year to use
     * @return the new formatter, not null
     * @since 2.0
     */
    public DateTimeFormatter withDefaultYear(int defaultYear) {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15681);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15682);return new DateTimeFormatter(iPrinter, iParser, iLocale,
                iOffsetParsed, iChrono, iZone, iPivotYear, defaultYear);
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Gets the default year for parsing months and days.
     *
     * @return the default year for parsing months and days
     * @since 2.0
     */
    public int getDefaultYear() {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15683);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15684);return iDefaultYear;
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Prints a ReadableInstant, using the chronology supplied by the instant.
     *
     * @param buf     the destination to format to, not null
     * @param instant instant to format, null means now
     */
    public void printTo(StringBuffer buf, ReadableInstant instant) {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15685);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15686);try {
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15687);printTo((Appendable) buf, instant);
        } catch (IOException ex) {
            // StringBuffer does not throw IOException
        }
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Prints a ReadableInstant, using the chronology supplied by the instant.
     *
     * @param buf     the destination to format to, not null
     * @param instant instant to format, null means now
     */
    public void printTo(StringBuilder buf, ReadableInstant instant) {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15688);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15689);try {
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15690);printTo((Appendable) buf, instant);
        } catch (IOException ex) {
            // StringBuilder does not throw IOException
        }
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Prints a ReadableInstant, using the chronology supplied by the instant.
     *
     * @param out     the destination to format to, not null
     * @param instant instant to format, null means now
     */
    public void printTo(Writer out, ReadableInstant instant) throws IOException {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15691);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15692);printTo((Appendable) out, instant);
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Prints a ReadableInstant, using the chronology supplied by the instant.
     *
     * @param appendable the destination to format to, not null
     * @param instant    instant to format, null means now
     * @since 2.0
     */
    public void printTo(Appendable appendable, ReadableInstant instant) throws IOException {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15693);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15694);long millis = DateTimeUtils.getInstantMillis(instant);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15695);Chronology chrono = DateTimeUtils.getInstantChronology(instant);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15696);printTo(appendable, millis, chrono);
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Prints an instant from milliseconds since 1970-01-01T00:00:00Z,
     * using ISO chronology in the default DateTimeZone.
     *
     * @param buf     the destination to format to, not null
     * @param instant millis since 1970-01-01T00:00:00Z
     */
    public void printTo(StringBuffer buf, long instant) {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15697);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15698);try {
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15699);printTo((Appendable) buf, instant);
        } catch (IOException ex) {
            // StringBuffer does not throw IOException
        }
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Prints an instant from milliseconds since 1970-01-01T00:00:00Z,
     * using ISO chronology in the default DateTimeZone.
     *
     * @param buf     the destination to format to, not null
     * @param instant millis since 1970-01-01T00:00:00Z
     */
    public void printTo(StringBuilder buf, long instant) {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15700);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15701);try {
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15702);printTo((Appendable) buf, instant);
        } catch (IOException ex) {
            // StringBuilder does not throw IOException
        }
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Prints an instant from milliseconds since 1970-01-01T00:00:00Z,
     * using ISO chronology in the default DateTimeZone.
     *
     * @param out     the destination to format to, not null
     * @param instant millis since 1970-01-01T00:00:00Z
     */
    public void printTo(Writer out, long instant) throws IOException {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15703);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15704);printTo((Appendable) out, instant);
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Prints an instant from milliseconds since 1970-01-01T00:00:00Z,
     * using ISO chronology in the default DateTimeZone.
     *
     * @param appendable the destination to format to, not null
     * @param instant    millis since 1970-01-01T00:00:00Z
     * @since 2.0
     */
    public void printTo(Appendable appendable, long instant) throws IOException {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15705);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15706);printTo(appendable, instant, null);
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Prints a ReadablePartial.
     * <p>
     * Neither the override chronology nor the override zone are used
     * by this method.
     *
     * @param buf     the destination to format to, not null
     * @param partial partial to format
     */
    public void printTo(StringBuffer buf, ReadablePartial partial) {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15707);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15708);try {
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15709);printTo((Appendable) buf, partial);
        } catch (IOException ex) {
            // StringBuffer does not throw IOException
        }
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Prints a ReadablePartial.
     * <p>
     * Neither the override chronology nor the override zone are used
     * by this method.
     *
     * @param buf     the destination to format to, not null
     * @param partial partial to format
     */
    public void printTo(StringBuilder buf, ReadablePartial partial) {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15710);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15711);try {
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15712);printTo((Appendable) buf, partial);
        } catch (IOException ex) {
            // StringBuilder does not throw IOException
        }
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Prints a ReadablePartial.
     * <p>
     * Neither the override chronology nor the override zone are used
     * by this method.
     *
     * @param out     the destination to format to, not null
     * @param partial partial to format
     */
    public void printTo(Writer out, ReadablePartial partial) throws IOException {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15713);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15714);printTo((Appendable) out, partial);
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Prints a ReadablePartial.
     * <p>
     * Neither the override chronology nor the override zone are used
     * by this method.
     *
     * @param appendable the destination to format to, not null
     * @param partial    partial to format
     * @since 2.0
     */
    public void printTo(Appendable appendable, ReadablePartial partial) throws IOException {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15715);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15716);InternalPrinter printer = requirePrinter();
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15717);if ((((partial == null)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15718)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15719)==0&false))) {{
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15720);throw new IllegalArgumentException("The partial must not be null");
        }
        }__CLR4_4_1c1dc1dlgchor0g.R.inc(15721);printer.printTo(appendable, partial, iLocale);
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Prints a ReadableInstant to a String.
     * <p>
     * This method will use the override zone and the override chronology if
     * they are set. Otherwise it will use the chronology and zone of the instant.
     *
     * @param instant instant to format, null means now
     * @return the printed result
     */
    public String print(ReadableInstant instant) {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15722);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15723);StringBuilder buf = new StringBuilder(requirePrinter().estimatePrintedLength());
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15724);try {
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15725);printTo((Appendable) buf, instant);
        } catch (IOException ex) {
            // StringBuilder does not throw IOException
        }
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15726);return buf.toString();
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Prints a millisecond instant to a String.
     * <p>
     * This method will use the override zone and the override chronology if
     * they are set. Otherwise it will use the ISO chronology and default zone.
     *
     * @param instant millis since 1970-01-01T00:00:00Z
     * @return the printed result
     */
    public String print(long instant) {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15727);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15728);StringBuilder buf = new StringBuilder(requirePrinter().estimatePrintedLength());
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15729);try {
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15730);printTo((Appendable) buf, instant);
        } catch (IOException ex) {
            // StringBuilder does not throw IOException
        }
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15731);return buf.toString();
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Prints a ReadablePartial to a new String.
     * <p>
     * Neither the override chronology nor the override zone are used
     * by this method.
     *
     * @param partial partial to format
     * @return the printed result
     */
    public String print(ReadablePartial partial) {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15732);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15733);StringBuilder buf = new StringBuilder(requirePrinter().estimatePrintedLength());
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15734);try {
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15735);printTo((Appendable) buf, partial);
        } catch (IOException ex) {
            // StringBuilder does not throw IOException
        }
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15736);return buf.toString();
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    private void printTo(Appendable appendable, long instant, Chronology chrono) throws IOException {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15737);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15738);InternalPrinter printer = requirePrinter();
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15739);chrono = selectChronology(chrono);
        // Shift instant into local time (UTC) to avoid excessive offset
        // calculations when printing multiple fields in a composite printer.
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15740);DateTimeZone zone = chrono.getZone();
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15741);int offset = zone.getOffset(instant);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15742);long adjustedInstant = instant + offset;
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15743);if (((((instant ^ adjustedInstant) < 0 && (instant ^ offset) >= 0)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15744)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15745)==0&false))) {{
            // Time zone offset overflow, so revert to UTC.
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15746);zone = DateTimeZone.UTC;
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15747);offset = 0;
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15748);adjustedInstant = instant;
        }
        }__CLR4_4_1c1dc1dlgchor0g.R.inc(15749);printer.printTo(appendable, adjustedInstant, chrono.withUTC(), offset, zone, iLocale);
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Checks whether printing is supported.
     *
     * @throws UnsupportedOperationException if printing is not supported
     */
    private InternalPrinter requirePrinter() {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15750);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15751);InternalPrinter printer = iPrinter;
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15752);if ((((printer == null)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15753)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15754)==0&false))) {{
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15755);throw new UnsupportedOperationException("Printing not supported");
        }
        }__CLR4_4_1c1dc1dlgchor0g.R.inc(15756);return printer;
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Parses a datetime from the given text, at the given position, saving the
     * result into the fields of the given ReadWritableInstant. If the parse
     * succeeds, the return value is the new text position. Note that the parse
     * may succeed without fully reading the text and in this case those fields
     * that were read will be set.
     * <p>
     * Only those fields present in the string will be changed in the specified
     * instant. All other fields will remain unaltered. Thus if the string only
     * contains a year and a month, then the day and time will be retained from
     * the input instant. If this is not the behaviour you want, then reset the
     * fields before calling this method, or use {@link #parseDateTime(String)}
     * or {@link #parseMutableDateTime(String)}.
     * <p>
     * If it fails, the return value is negative, but the instant may still be
     * modified. To determine the position where the parse failed, apply the
     * one's complement operator (~) on the return value.
     * <p>
     * This parse method ignores the {@link #getDefaultYear() default year} and
     * parses using the year from the supplied instant based on the chronology
     * and time-zone of the supplied instant.
     * <p>
     * The parse will use the chronology of the instant.
     *
     * @param instant  an instant that will be modified, not null
     * @param text     the text to parse
     * @param position position to start parsing from
     * @return new position, negative value means parse failed -
     * apply complement operator (~) to get position of failure
     * @throws UnsupportedOperationException if parsing is not supported
     * @throws IllegalArgumentException      if the instant is null
     * @throws IllegalArgumentException      if any field is out of range
     */
    public int parseInto(ReadWritableInstant instant, String text, int position) {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15757);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15758);InternalParser parser = requireParser();
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15759);if ((((instant == null)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15760)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15761)==0&false))) {{
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15762);throw new IllegalArgumentException("Instant must not be null");
        }

        }__CLR4_4_1c1dc1dlgchor0g.R.inc(15763);long instantMillis = instant.getMillis();
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15764);Chronology chrono = instant.getChronology();
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15765);int defaultYear = DateTimeUtils.getChronology(chrono).year().get(instantMillis);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15766);long instantLocal = instantMillis + chrono.getZone().getOffset(instantMillis);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15767);chrono = selectChronology(chrono);

        __CLR4_4_1c1dc1dlgchor0g.R.inc(15768);DateTimeParserBucket bucket = new DateTimeParserBucket(
                instantLocal, chrono, iLocale, iPivotYear, defaultYear);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15769);int newPos = parser.parseInto(bucket, text, position);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15770);instant.setMillis(bucket.computeMillis(false, text));
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15771);if ((((iOffsetParsed && bucket.getOffsetInteger() != null)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15772)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15773)==0&false))) {{
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15774);int parsedOffset = bucket.getOffsetInteger();
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15775);DateTimeZone parsedZone = DateTimeZone.forOffsetMillis(parsedOffset);
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15776);chrono = chrono.withZone(parsedZone);
        } }else {__CLR4_4_1c1dc1dlgchor0g.R.inc(15777);if ((((bucket.getZone() != null)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15778)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15779)==0&false))) {{
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15780);chrono = chrono.withZone(bucket.getZone());
        }
        }}__CLR4_4_1c1dc1dlgchor0g.R.inc(15781);instant.setChronology(chrono);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15782);if ((((iZone != null)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15783)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15784)==0&false))) {{
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15785);instant.setZone(iZone);
        }
        }__CLR4_4_1c1dc1dlgchor0g.R.inc(15786);return newPos;
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Parses a datetime from the given text, returning the number of
     * milliseconds since the epoch, 1970-01-01T00:00:00Z.
     * <p>
     * The parse will use the ISO chronology, and the default time zone.
     * If the text contains a time zone string then that will be taken into account.
     *
     * @param text the text to parse, not null
     * @return parsed value expressed in milliseconds since the epoch
     * @throws UnsupportedOperationException if parsing is not supported
     * @throws IllegalArgumentException      if the text to parse is invalid
     */
    public long parseMillis(String text) {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15787);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15788);InternalParser parser = requireParser();
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15789);Chronology chrono = selectChronology(iChrono);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15790);DateTimeParserBucket bucket = new DateTimeParserBucket(0, chrono, iLocale, iPivotYear, iDefaultYear);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15791);return bucket.doParseMillis(parser, text);
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Parses only the local date from the given text, returning a new LocalDate.
     * <p>
     * This will parse the text fully according to the formatter, using the UTC zone.
     * Once parsed, only the local date will be used.
     * This means that any parsed time, time-zone or offset field is completely ignored.
     * It also means that the zone and offset-parsed settings are ignored.
     *
     * @param text the text to parse, not null
     * @return the parsed date, never null
     * @throws UnsupportedOperationException if parsing is not supported
     * @throws IllegalArgumentException      if the text to parse is invalid
     * @since 2.0
     */
    public LocalDate parseLocalDate(String text) {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15792);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15793);return parseLocalDateTime(text).toLocalDate();
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Parses only the local time from the given text, returning a new LocalTime.
     * <p>
     * This will parse the text fully according to the formatter, using the UTC zone.
     * Once parsed, only the local time will be used.
     * This means that any parsed date, time-zone or offset field is completely ignored.
     * It also means that the zone and offset-parsed settings are ignored.
     *
     * @param text the text to parse, not null
     * @return the parsed time, never null
     * @throws UnsupportedOperationException if parsing is not supported
     * @throws IllegalArgumentException      if the text to parse is invalid
     * @since 2.0
     */
    public LocalTime parseLocalTime(String text) {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15794);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15795);return parseLocalDateTime(text).toLocalTime();
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Parses only the local date-time from the given text, returning a new LocalDateTime.
     * <p>
     * This will parse the text fully according to the formatter, using the UTC zone.
     * Once parsed, only the local date-time will be used.
     * This means that any parsed time-zone or offset field is completely ignored.
     * It also means that the zone and offset-parsed settings are ignored.
     *
     * @param text the text to parse, not null
     * @return the parsed date-time, never null
     * @throws UnsupportedOperationException if parsing is not supported
     * @throws IllegalArgumentException      if the text to parse is invalid
     * @since 2.0
     */
    public LocalDateTime parseLocalDateTime(String text) {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15796);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15797);InternalParser parser = requireParser();

        __CLR4_4_1c1dc1dlgchor0g.R.inc(15798);Chronology chrono = selectChronology(null).withUTC();  // always use UTC, avoiding DST gaps
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15799);DateTimeParserBucket bucket = new DateTimeParserBucket(0, chrono, iLocale, iPivotYear, iDefaultYear);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15800);int newPos = parser.parseInto(bucket, text, 0);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15801);if ((((newPos >= 0)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15802)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15803)==0&false))) {{
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15804);if ((((newPos >= text.length())&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15805)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15806)==0&false))) {{
                __CLR4_4_1c1dc1dlgchor0g.R.inc(15807);long millis = bucket.computeMillis(true, text);
                __CLR4_4_1c1dc1dlgchor0g.R.inc(15808);if ((((bucket.getOffsetInteger() != null)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15809)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15810)==0&false))) {{  // treat withOffsetParsed() as being true
                    __CLR4_4_1c1dc1dlgchor0g.R.inc(15811);int parsedOffset = bucket.getOffsetInteger();
                    __CLR4_4_1c1dc1dlgchor0g.R.inc(15812);DateTimeZone parsedZone = DateTimeZone.forOffsetMillis(parsedOffset);
                    __CLR4_4_1c1dc1dlgchor0g.R.inc(15813);chrono = chrono.withZone(parsedZone);
                } }else {__CLR4_4_1c1dc1dlgchor0g.R.inc(15814);if ((((bucket.getZone() != null)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15815)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15816)==0&false))) {{
                    __CLR4_4_1c1dc1dlgchor0g.R.inc(15817);chrono = chrono.withZone(bucket.getZone());
                }
                }}__CLR4_4_1c1dc1dlgchor0g.R.inc(15818);return new LocalDateTime(millis, chrono);
            }
        }} }else {{
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15819);newPos = ~newPos;
        }
        }__CLR4_4_1c1dc1dlgchor0g.R.inc(15820);throw new IllegalArgumentException(FormatUtils.createErrorMessage(text, newPos));
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Parses a date-time from the given text, returning a new DateTime.
     * <p>
     * The parse will use the zone and chronology specified on this formatter.
     * <p>
     * If the text contains a time zone string then that will be taken into
     * account in adjusting the time of day as follows.
     * If the {@link #withOffsetParsed()} has been called, then the resulting
     * DateTime will have a fixed offset based on the parsed time zone.
     * Otherwise the resulting DateTime will have the zone of this formatter,
     * but the parsed zone may have caused the time to be adjusted.
     *
     * @param text the text to parse, not null
     * @return the parsed date-time, never null
     * @throws UnsupportedOperationException if parsing is not supported
     * @throws IllegalArgumentException      if the text to parse is invalid
     */
    public DateTime parseDateTime(String text) {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15821);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15822);InternalParser parser = requireParser();

        __CLR4_4_1c1dc1dlgchor0g.R.inc(15823);Chronology chrono = selectChronology(null);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15824);DateTimeParserBucket bucket = new DateTimeParserBucket(0, chrono, iLocale, iPivotYear, iDefaultYear);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15825);int newPos = parser.parseInto(bucket, text, 0);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15826);if ((((newPos >= 0)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15827)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15828)==0&false))) {{
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15829);if ((((newPos >= text.length())&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15830)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15831)==0&false))) {{
                __CLR4_4_1c1dc1dlgchor0g.R.inc(15832);long millis = bucket.computeMillis(true, text);
                __CLR4_4_1c1dc1dlgchor0g.R.inc(15833);if ((((iOffsetParsed && bucket.getOffsetInteger() != null)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15834)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15835)==0&false))) {{
                    __CLR4_4_1c1dc1dlgchor0g.R.inc(15836);int parsedOffset = bucket.getOffsetInteger();
                    __CLR4_4_1c1dc1dlgchor0g.R.inc(15837);DateTimeZone parsedZone = DateTimeZone.forOffsetMillis(parsedOffset);
                    __CLR4_4_1c1dc1dlgchor0g.R.inc(15838);chrono = chrono.withZone(parsedZone);
                } }else {__CLR4_4_1c1dc1dlgchor0g.R.inc(15839);if ((((bucket.getZone() != null)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15840)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15841)==0&false))) {{
                    __CLR4_4_1c1dc1dlgchor0g.R.inc(15842);chrono = chrono.withZone(bucket.getZone());
                }
                }}__CLR4_4_1c1dc1dlgchor0g.R.inc(15843);DateTime dt = new DateTime(millis, chrono);
                __CLR4_4_1c1dc1dlgchor0g.R.inc(15844);if ((((iZone != null)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15845)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15846)==0&false))) {{
                    __CLR4_4_1c1dc1dlgchor0g.R.inc(15847);dt = dt.withZone(iZone);
                }
                }__CLR4_4_1c1dc1dlgchor0g.R.inc(15848);return dt;
            }
        }} }else {{
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15849);newPos = ~newPos;
        }
        }__CLR4_4_1c1dc1dlgchor0g.R.inc(15850);throw new IllegalArgumentException(FormatUtils.createErrorMessage(text, newPos));
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Parses a date-time from the given text, returning a new MutableDateTime.
     * <p>
     * The parse will use the zone and chronology specified on this formatter.
     * <p>
     * If the text contains a time zone string then that will be taken into
     * account in adjusting the time of day as follows.
     * If the {@link #withOffsetParsed()} has been called, then the resulting
     * DateTime will have a fixed offset based on the parsed time zone.
     * Otherwise the resulting DateTime will have the zone of this formatter,
     * but the parsed zone may have caused the time to be adjusted.
     *
     * @param text the text to parse, not null
     * @return the parsed date-time, never null
     * @throws UnsupportedOperationException if parsing is not supported
     * @throws IllegalArgumentException      if the text to parse is invalid
     */
    public MutableDateTime parseMutableDateTime(String text) {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15851);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15852);InternalParser parser = requireParser();

        __CLR4_4_1c1dc1dlgchor0g.R.inc(15853);Chronology chrono = selectChronology(null);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15854);DateTimeParserBucket bucket = new DateTimeParserBucket(0, chrono, iLocale, iPivotYear, iDefaultYear);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15855);int newPos = parser.parseInto(bucket, text, 0);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15856);if ((((newPos >= 0)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15857)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15858)==0&false))) {{
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15859);if ((((newPos >= text.length())&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15860)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15861)==0&false))) {{
                __CLR4_4_1c1dc1dlgchor0g.R.inc(15862);long millis = bucket.computeMillis(true, text);
                __CLR4_4_1c1dc1dlgchor0g.R.inc(15863);if ((((iOffsetParsed && bucket.getOffsetInteger() != null)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15864)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15865)==0&false))) {{
                    __CLR4_4_1c1dc1dlgchor0g.R.inc(15866);int parsedOffset = bucket.getOffsetInteger();
                    __CLR4_4_1c1dc1dlgchor0g.R.inc(15867);DateTimeZone parsedZone = DateTimeZone.forOffsetMillis(parsedOffset);
                    __CLR4_4_1c1dc1dlgchor0g.R.inc(15868);chrono = chrono.withZone(parsedZone);
                } }else {__CLR4_4_1c1dc1dlgchor0g.R.inc(15869);if ((((bucket.getZone() != null)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15870)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15871)==0&false))) {{
                    __CLR4_4_1c1dc1dlgchor0g.R.inc(15872);chrono = chrono.withZone(bucket.getZone());
                }
                }}__CLR4_4_1c1dc1dlgchor0g.R.inc(15873);MutableDateTime dt = new MutableDateTime(millis, chrono);
                __CLR4_4_1c1dc1dlgchor0g.R.inc(15874);if ((((iZone != null)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15875)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15876)==0&false))) {{
                    __CLR4_4_1c1dc1dlgchor0g.R.inc(15877);dt.setZone(iZone);
                }
                }__CLR4_4_1c1dc1dlgchor0g.R.inc(15878);return dt;
            }
        }} }else {{
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15879);newPos = ~newPos;
        }
        }__CLR4_4_1c1dc1dlgchor0g.R.inc(15880);throw new IllegalArgumentException(FormatUtils.createErrorMessage(text, newPos));
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    /**
     * Checks whether parsing is supported.
     *
     * @throws UnsupportedOperationException if parsing is not supported
     */
    private InternalParser requireParser() {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15881);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15882);InternalParser parser = iParser;
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15883);if ((((parser == null)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15884)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15885)==0&false))) {{
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15886);throw new UnsupportedOperationException("Parsing not supported");
        }
        }__CLR4_4_1c1dc1dlgchor0g.R.inc(15887);return parser;
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Determines the correct chronology to use.
     *
     * @param chrono the proposed chronology
     * @return the actual chronology
     */
    private Chronology selectChronology(Chronology chrono) {try{__CLR4_4_1c1dc1dlgchor0g.R.inc(15888);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15889);chrono = DateTimeUtils.getChronology(chrono);
        __CLR4_4_1c1dc1dlgchor0g.R.inc(15890);if ((((iChrono != null)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15891)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15892)==0&false))) {{
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15893);chrono = iChrono;
        }
        }__CLR4_4_1c1dc1dlgchor0g.R.inc(15894);if ((((iZone != null)&&(__CLR4_4_1c1dc1dlgchor0g.R.iget(15895)!=0|true))||(__CLR4_4_1c1dc1dlgchor0g.R.iget(15896)==0&false))) {{
            __CLR4_4_1c1dc1dlgchor0g.R.inc(15897);chrono = chrono.withZone(iZone);
        }
        }__CLR4_4_1c1dc1dlgchor0g.R.inc(15898);return chrono;
    }finally{__CLR4_4_1c1dc1dlgchor0g.R.flushNeeded();}}

}
