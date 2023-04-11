/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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

import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

/**
 * Controls the printing and parsing of a time period to and from a string.
 * <p>
 * This class is the main API for printing and parsing used by most applications.
 * Instances of this class are created via one of three factory classes:
 * <ul>
 * <li>{@link PeriodFormat} - formats by pattern and style</li>
 * <li>{@link ISOPeriodFormat} - ISO8601 formats</li>
 * <li>{@link PeriodFormatterBuilder} - complex formats created via method calls</li>
 * </ul>
 * <p>
 * An instance of this class holds a reference internally to one printer and
 * one parser. It is possible that one of these may be null, in which case the
 * formatter cannot print/parse. This can be checked via the {@link #isPrinter()}
 * and {@link #isParser()} methods.
 * <p>
 * The underlying printer/parser can be altered to behave exactly as required
 * by using a decorator modifier:
 * <ul>
 * <li>{@link #withLocale(Locale)} - returns a new formatter that uses the specified locale</li>
 * </ul>
 * This returns a new formatter (instances of this class are immutable).
 * <p>
 * The main methods of the class are the <code>printXxx</code> and
 * <code>parseXxx</code> methods. These are used as follows:
 * <pre>
 * // print using the default locale
 * String periodStr = formatter.print(period);
 * // print using the French locale
 * String periodStr = formatter.withLocale(Locale.FRENCH).print(period);
 *
 * // parse using the French locale
 * Period date = formatter.withLocale(Locale.FRENCH).parsePeriod(str);
 * </pre>
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.0
 */
public class PeriodFormatter {public static class __CLR4_4_1em8em8lgchor5f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,19030,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The internal printer used to output the datetime.
     */
    private final PeriodPrinter iPrinter;
    /**
     * The internal parser used to output the datetime.
     */
    private final PeriodParser iParser;
    /**
     * The locale to use for printing and parsing.
     */
    private final Locale iLocale;
    /**
     * The period type used in parsing.
     */
    private final PeriodType iParseType;

    /**
     * Creates a new formatter, however you will normally use the factory
     * or the builder.
     *
     * @param printer the internal printer, null if cannot print
     * @param parser  the internal parser, null if cannot parse
     */
    public PeriodFormatter(
            PeriodPrinter printer, PeriodParser parser) {
        super();__CLR4_4_1em8em8lgchor5f.R.inc(18945);try{__CLR4_4_1em8em8lgchor5f.R.inc(18944);
        __CLR4_4_1em8em8lgchor5f.R.inc(18946);iPrinter = printer;
        __CLR4_4_1em8em8lgchor5f.R.inc(18947);iParser = parser;
        __CLR4_4_1em8em8lgchor5f.R.inc(18948);iLocale = null;
        __CLR4_4_1em8em8lgchor5f.R.inc(18949);iParseType = null;
    }finally{__CLR4_4_1em8em8lgchor5f.R.flushNeeded();}}

    /**
     * Constructor.
     *
     * @param printer the internal printer, null if cannot print
     * @param parser  the internal parser, null if cannot parse
     * @param locale  the locale to use
     * @param type    the parse period type
     */
    PeriodFormatter(
            PeriodPrinter printer, PeriodParser parser,
            Locale locale, PeriodType type) {
        super();__CLR4_4_1em8em8lgchor5f.R.inc(18951);try{__CLR4_4_1em8em8lgchor5f.R.inc(18950);
        __CLR4_4_1em8em8lgchor5f.R.inc(18952);iPrinter = printer;
        __CLR4_4_1em8em8lgchor5f.R.inc(18953);iParser = parser;
        __CLR4_4_1em8em8lgchor5f.R.inc(18954);iLocale = locale;
        __CLR4_4_1em8em8lgchor5f.R.inc(18955);iParseType = type;
    }finally{__CLR4_4_1em8em8lgchor5f.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Is this formatter capable of printing.
     *
     * @return true if this is a printer
     */
    public boolean isPrinter() {try{__CLR4_4_1em8em8lgchor5f.R.inc(18956);
        __CLR4_4_1em8em8lgchor5f.R.inc(18957);return (iPrinter != null);
    }finally{__CLR4_4_1em8em8lgchor5f.R.flushNeeded();}}

    /**
     * Gets the internal printer object that performs the real printing work.
     *
     * @return the internal printer
     */
    public PeriodPrinter getPrinter() {try{__CLR4_4_1em8em8lgchor5f.R.inc(18958);
        __CLR4_4_1em8em8lgchor5f.R.inc(18959);return iPrinter;
    }finally{__CLR4_4_1em8em8lgchor5f.R.flushNeeded();}}

    /**
     * Is this formatter capable of parsing.
     *
     * @return true if this is a parser
     */
    public boolean isParser() {try{__CLR4_4_1em8em8lgchor5f.R.inc(18960);
        __CLR4_4_1em8em8lgchor5f.R.inc(18961);return (iParser != null);
    }finally{__CLR4_4_1em8em8lgchor5f.R.flushNeeded();}}

    /**
     * Gets the internal parser object that performs the real parsing work.
     *
     * @return the internal parser
     */
    public PeriodParser getParser() {try{__CLR4_4_1em8em8lgchor5f.R.inc(18962);
        __CLR4_4_1em8em8lgchor5f.R.inc(18963);return iParser;
    }finally{__CLR4_4_1em8em8lgchor5f.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new formatter with a different locale that will be used
     * for printing and parsing.
     * <p>
     * A PeriodFormatter is immutable, so a new instance is returned,
     * and the original is unaltered and still usable.
     * <p>
     * A null locale indicates that no specific locale override is in use.
     *
     * @param locale the locale to use
     * @return the new formatter
     */
    public PeriodFormatter withLocale(Locale locale) {try{__CLR4_4_1em8em8lgchor5f.R.inc(18964);
        __CLR4_4_1em8em8lgchor5f.R.inc(18965);if ((((locale == getLocale() || (locale != null && locale.equals(getLocale())))&&(__CLR4_4_1em8em8lgchor5f.R.iget(18966)!=0|true))||(__CLR4_4_1em8em8lgchor5f.R.iget(18967)==0&false))) {{
            __CLR4_4_1em8em8lgchor5f.R.inc(18968);return this;
        }
        }__CLR4_4_1em8em8lgchor5f.R.inc(18969);return new PeriodFormatter(iPrinter, iParser, locale, iParseType);
    }finally{__CLR4_4_1em8em8lgchor5f.R.flushNeeded();}}

    /**
     * Gets the locale that will be used for printing and parsing.
     * <p>
     * A null locale indicates that no specific locale override is in use.
     *
     * @return the locale to use
     */
    public Locale getLocale() {try{__CLR4_4_1em8em8lgchor5f.R.inc(18970);
        __CLR4_4_1em8em8lgchor5f.R.inc(18971);return iLocale;
    }finally{__CLR4_4_1em8em8lgchor5f.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new formatter with a different PeriodType for parsing.
     * <p>
     * A PeriodFormatter is immutable, so a new instance is returned,
     * and the original is unaltered and still usable.
     *
     * @param type the type to use in parsing
     * @return the new formatter
     */
    public PeriodFormatter withParseType(PeriodType type) {try{__CLR4_4_1em8em8lgchor5f.R.inc(18972);
        __CLR4_4_1em8em8lgchor5f.R.inc(18973);if ((((type == iParseType)&&(__CLR4_4_1em8em8lgchor5f.R.iget(18974)!=0|true))||(__CLR4_4_1em8em8lgchor5f.R.iget(18975)==0&false))) {{
            __CLR4_4_1em8em8lgchor5f.R.inc(18976);return this;
        }
        }__CLR4_4_1em8em8lgchor5f.R.inc(18977);return new PeriodFormatter(iPrinter, iParser, iLocale, type);
    }finally{__CLR4_4_1em8em8lgchor5f.R.flushNeeded();}}

    /**
     * Gets the PeriodType that will be used for parsing.
     *
     * @return the parse type to use
     */
    public PeriodType getParseType() {try{__CLR4_4_1em8em8lgchor5f.R.inc(18978);
        __CLR4_4_1em8em8lgchor5f.R.inc(18979);return iParseType;
    }finally{__CLR4_4_1em8em8lgchor5f.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Prints a ReadablePeriod to a StringBuffer.
     *
     * @param buf    the formatted period is appended to this buffer
     * @param period the period to format, not null
     */
    public void printTo(StringBuffer buf, ReadablePeriod period) {try{__CLR4_4_1em8em8lgchor5f.R.inc(18980);
        __CLR4_4_1em8em8lgchor5f.R.inc(18981);checkPrinter();
        __CLR4_4_1em8em8lgchor5f.R.inc(18982);checkPeriod(period);

        __CLR4_4_1em8em8lgchor5f.R.inc(18983);getPrinter().printTo(buf, period, iLocale);
    }finally{__CLR4_4_1em8em8lgchor5f.R.flushNeeded();}}

    /**
     * Prints a ReadablePeriod to a Writer.
     *
     * @param out    the formatted period is written out
     * @param period the period to format, not null
     */
    public void printTo(Writer out, ReadablePeriod period) throws IOException {try{__CLR4_4_1em8em8lgchor5f.R.inc(18984);
        __CLR4_4_1em8em8lgchor5f.R.inc(18985);checkPrinter();
        __CLR4_4_1em8em8lgchor5f.R.inc(18986);checkPeriod(period);

        __CLR4_4_1em8em8lgchor5f.R.inc(18987);getPrinter().printTo(out, period, iLocale);
    }finally{__CLR4_4_1em8em8lgchor5f.R.flushNeeded();}}

    /**
     * Prints a ReadablePeriod to a new String.
     *
     * @param period the period to format, not null
     * @return the printed result
     */
    public String print(ReadablePeriod period) {try{__CLR4_4_1em8em8lgchor5f.R.inc(18988);
        __CLR4_4_1em8em8lgchor5f.R.inc(18989);checkPrinter();
        __CLR4_4_1em8em8lgchor5f.R.inc(18990);checkPeriod(period);

        __CLR4_4_1em8em8lgchor5f.R.inc(18991);PeriodPrinter printer = getPrinter();
        __CLR4_4_1em8em8lgchor5f.R.inc(18992);StringBuffer buf = new StringBuffer(printer.calculatePrintedLength(period, iLocale));
        __CLR4_4_1em8em8lgchor5f.R.inc(18993);printer.printTo(buf, period, iLocale);
        __CLR4_4_1em8em8lgchor5f.R.inc(18994);return buf.toString();
    }finally{__CLR4_4_1em8em8lgchor5f.R.flushNeeded();}}

    /**
     * Checks whether printing is supported.
     *
     * @throws UnsupportedOperationException if printing is not supported
     */
    private void checkPrinter() {try{__CLR4_4_1em8em8lgchor5f.R.inc(18995);
        __CLR4_4_1em8em8lgchor5f.R.inc(18996);if ((((iPrinter == null)&&(__CLR4_4_1em8em8lgchor5f.R.iget(18997)!=0|true))||(__CLR4_4_1em8em8lgchor5f.R.iget(18998)==0&false))) {{
            __CLR4_4_1em8em8lgchor5f.R.inc(18999);throw new UnsupportedOperationException("Printing not supported");
        }
    }}finally{__CLR4_4_1em8em8lgchor5f.R.flushNeeded();}}

    /**
     * Checks whether the period is non-null.
     *
     * @throws IllegalArgumentException if the period is null
     */
    private void checkPeriod(ReadablePeriod period) {try{__CLR4_4_1em8em8lgchor5f.R.inc(19000);
        __CLR4_4_1em8em8lgchor5f.R.inc(19001);if ((((period == null)&&(__CLR4_4_1em8em8lgchor5f.R.iget(19002)!=0|true))||(__CLR4_4_1em8em8lgchor5f.R.iget(19003)==0&false))) {{
            __CLR4_4_1em8em8lgchor5f.R.inc(19004);throw new IllegalArgumentException("Period must not be null");
        }
    }}finally{__CLR4_4_1em8em8lgchor5f.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Parses a period from the given text, at the given position, saving the
     * result into the fields of the given ReadWritablePeriod. If the parse
     * succeeds, the return value is the new text position. Note that the parse
     * may succeed without fully reading the text.
     * <p>
     * The parse type of the formatter is not used by this method.
     * <p>
     * If it fails, the return value is negative, but the period may still be
     * modified. To determine the position where the parse failed, apply the
     * one's complement operator (~) on the return value.
     *
     * @param period   a period that will be modified
     * @param text     text to parse
     * @param position position to start parsing from
     * @return new position, if negative, parse failed. Apply complement
     * operator (~) to get position of failure
     * @throws IllegalArgumentException if any field is out of range
     */
    public int parseInto(ReadWritablePeriod period, String text, int position) {try{__CLR4_4_1em8em8lgchor5f.R.inc(19005);
        __CLR4_4_1em8em8lgchor5f.R.inc(19006);checkParser();
        __CLR4_4_1em8em8lgchor5f.R.inc(19007);checkPeriod(period);

        __CLR4_4_1em8em8lgchor5f.R.inc(19008);return getParser().parseInto(period, text, position, iLocale);
    }finally{__CLR4_4_1em8em8lgchor5f.R.flushNeeded();}}

    /**
     * Parses a period from the given text, returning a new Period.
     *
     * @param text text to parse
     * @return parsed value in a Period object
     * @throws IllegalArgumentException if any field is out of range
     */
    public Period parsePeriod(String text) {try{__CLR4_4_1em8em8lgchor5f.R.inc(19009);
        __CLR4_4_1em8em8lgchor5f.R.inc(19010);checkParser();

        __CLR4_4_1em8em8lgchor5f.R.inc(19011);return parseMutablePeriod(text).toPeriod();
    }finally{__CLR4_4_1em8em8lgchor5f.R.flushNeeded();}}

    /**
     * Parses a period from the given text, returning a new MutablePeriod.
     *
     * @param text text to parse
     * @return parsed value in a MutablePeriod object
     * @throws IllegalArgumentException if any field is out of range
     */
    public MutablePeriod parseMutablePeriod(String text) {try{__CLR4_4_1em8em8lgchor5f.R.inc(19012);
        __CLR4_4_1em8em8lgchor5f.R.inc(19013);checkParser();

        __CLR4_4_1em8em8lgchor5f.R.inc(19014);MutablePeriod period = new MutablePeriod(0, iParseType);
        __CLR4_4_1em8em8lgchor5f.R.inc(19015);int newPos = getParser().parseInto(period, text, 0, iLocale);
        __CLR4_4_1em8em8lgchor5f.R.inc(19016);if ((((newPos >= 0)&&(__CLR4_4_1em8em8lgchor5f.R.iget(19017)!=0|true))||(__CLR4_4_1em8em8lgchor5f.R.iget(19018)==0&false))) {{
            __CLR4_4_1em8em8lgchor5f.R.inc(19019);if ((((newPos >= text.length())&&(__CLR4_4_1em8em8lgchor5f.R.iget(19020)!=0|true))||(__CLR4_4_1em8em8lgchor5f.R.iget(19021)==0&false))) {{
                __CLR4_4_1em8em8lgchor5f.R.inc(19022);return period;
            }
        }} }else {{
            __CLR4_4_1em8em8lgchor5f.R.inc(19023);newPos = ~newPos;
        }
        }__CLR4_4_1em8em8lgchor5f.R.inc(19024);throw new IllegalArgumentException(FormatUtils.createErrorMessage(text, newPos));
    }finally{__CLR4_4_1em8em8lgchor5f.R.flushNeeded();}}

    /**
     * Checks whether parsing is supported.
     *
     * @throws UnsupportedOperationException if parsing is not supported
     */
    private void checkParser() {try{__CLR4_4_1em8em8lgchor5f.R.inc(19025);
        __CLR4_4_1em8em8lgchor5f.R.inc(19026);if ((((iParser == null)&&(__CLR4_4_1em8em8lgchor5f.R.iget(19027)!=0|true))||(__CLR4_4_1em8em8lgchor5f.R.iget(19028)==0&false))) {{
            __CLR4_4_1em8em8lgchor5f.R.inc(19029);throw new UnsupportedOperationException("Parsing not supported");
        }
    }}finally{__CLR4_4_1em8em8lgchor5f.R.flushNeeded();}}

}
