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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;

import org.joda.time.DateTimeConstants;
import org.joda.time.DurationFieldType;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

/**
 * Factory that creates complex instances of PeriodFormatter via method calls.
 * <p>
 * Period formatting is performed by the {@link PeriodFormatter} class.
 * Three classes provide factory methods to create formatters, and this is one.
 * The others are {@link PeriodFormat} and {@link ISOPeriodFormat}.
 * <p>
 * PeriodFormatterBuilder is used for constructing formatters which are then
 * used to print or parse. The formatters are built by appending specific fields
 * or other formatters to an instance of this builder.
 * <p>
 * For example, a formatter that prints years and months, like "15 years and 8 months",
 * can be constructed as follows:
 * <p>
 * <pre>
 * PeriodFormatter yearsAndMonths = new PeriodFormatterBuilder()
 *     .printZeroAlways()
 *     .appendYears()
 *     .appendSuffix(" year", " years")
 *     .appendSeparator(" and ")
 *     .printZeroRarelyLast()
 *     .appendMonths()
 *     .appendSuffix(" month", " months")
 *     .toFormatter();
 * </pre>
 * <p>
 * PeriodFormatterBuilder itself is mutable and not thread-safe, but the
 * formatters that it builds are thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @see PeriodFormat
 * @since 1.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class PeriodFormatterBuilder {public static class __CLR4_4_1eomeomlgchor6o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,20290,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final int PRINT_ZERO_RARELY_FIRST = 1;
    private static final int PRINT_ZERO_RARELY_LAST = 2;
    private static final int PRINT_ZERO_IF_SUPPORTED = 3;
    private static final int PRINT_ZERO_ALWAYS = 4;
    private static final int PRINT_ZERO_NEVER = 5;

    private static final int YEARS = 0;
    private static final int MONTHS = 1;
    private static final int WEEKS = 2;
    private static final int DAYS = 3;
    private static final int HOURS = 4;
    private static final int MINUTES = 5;
    private static final int SECONDS = 6;
    private static final int MILLIS = 7;
    private static final int SECONDS_MILLIS = 8;
    private static final int SECONDS_OPTIONAL_MILLIS = 9;
    private static final int MAX_FIELD = SECONDS_OPTIONAL_MILLIS;

    private static final ConcurrentMap<String, Pattern> PATTERNS = new ConcurrentHashMap<String, Pattern>();

    private int iMinPrintedDigits;
    private int iPrintZeroSetting;
    private int iMaxParsedDigits;
    private boolean iRejectSignedValues;

    private PeriodFieldAffix iPrefix;

    // List of Printers and Parsers used to build a final formatter.
    private List<Object> iElementPairs;
    /**
     * Set to true if the formatter is not a printer.
     */
    private boolean iNotPrinter;
    /**
     * Set to true if the formatter is not a parser.
     */
    private boolean iNotParser;

    // Last PeriodFormatter appended of each field type.
    private FieldFormatter[] iFieldFormatters;

    public PeriodFormatterBuilder() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19030);
        __CLR4_4_1eomeomlgchor6o.R.inc(19031);clear();
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs a PeriodFormatter using all the appended elements.
     * <p>
     * This is the main method used by applications at the end of the build
     * process to create a usable formatter.
     * <p>
     * Once this method has been called, the builder is in an invalid state.
     * <p>
     * The returned formatter may not support both printing and parsing.
     * The methods {@link PeriodFormatter#isPrinter()} and
     * {@link PeriodFormatter#isParser()} will help you determine the state
     * of the formatter.
     *
     * @return the newly created formatter
     * @throws IllegalStateException if the builder can produce neither a printer nor a parser
     */
    public PeriodFormatter toFormatter() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19032);
        __CLR4_4_1eomeomlgchor6o.R.inc(19033);PeriodFormatter formatter = toFormatter(iElementPairs, iNotPrinter, iNotParser);
        __CLR4_4_1eomeomlgchor6o.R.inc(19034);for (FieldFormatter fieldFormatter : iFieldFormatters) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19035);if ((((fieldFormatter != null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19036)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19037)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19038);fieldFormatter.finish(iFieldFormatters);
            }
        }}
        }__CLR4_4_1eomeomlgchor6o.R.inc(19039);iFieldFormatters = (FieldFormatter[]) iFieldFormatters.clone();
        __CLR4_4_1eomeomlgchor6o.R.inc(19040);return formatter;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Internal method to create a PeriodPrinter instance using all the
     * appended elements.
     * <p>
     * Most applications will not use this method.
     * If you want a printer in an application, call {@link #toFormatter()}
     * and just use the printing API.
     * <p>
     * Subsequent changes to this builder do not affect the returned printer.
     *
     * @return the newly created printer, null if builder cannot create a printer
     */
    public PeriodPrinter toPrinter() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19041);
        __CLR4_4_1eomeomlgchor6o.R.inc(19042);if ((((iNotPrinter)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19043)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19044)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19045);return null;
        }
        }__CLR4_4_1eomeomlgchor6o.R.inc(19046);return toFormatter().getPrinter();
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Internal method to create a PeriodParser instance using all the
     * appended elements.
     * <p>
     * Most applications will not use this method.
     * If you want a printer in an application, call {@link #toFormatter()}
     * and just use the printing API.
     * <p>
     * Subsequent changes to this builder do not affect the returned parser.
     *
     * @return the newly created parser, null if builder cannot create a parser
     */
    public PeriodParser toParser() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19047);
        __CLR4_4_1eomeomlgchor6o.R.inc(19048);if ((((iNotParser)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19049)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19050)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19051);return null;
        }
        }__CLR4_4_1eomeomlgchor6o.R.inc(19052);return toFormatter().getParser();
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Clears out all the appended elements, allowing this builder to be reused.
     */
    public void clear() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19053);
        __CLR4_4_1eomeomlgchor6o.R.inc(19054);iMinPrintedDigits = 1;
        __CLR4_4_1eomeomlgchor6o.R.inc(19055);iPrintZeroSetting = PRINT_ZERO_RARELY_LAST;
        __CLR4_4_1eomeomlgchor6o.R.inc(19056);iMaxParsedDigits = 10;
        __CLR4_4_1eomeomlgchor6o.R.inc(19057);iRejectSignedValues = false;
        __CLR4_4_1eomeomlgchor6o.R.inc(19058);iPrefix = null;
        __CLR4_4_1eomeomlgchor6o.R.inc(19059);if ((((iElementPairs == null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19060)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19061)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19062);iElementPairs = new ArrayList<Object>();
        } }else {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19063);iElementPairs.clear();
        }
        }__CLR4_4_1eomeomlgchor6o.R.inc(19064);iNotPrinter = false;
        __CLR4_4_1eomeomlgchor6o.R.inc(19065);iNotParser = false;
        __CLR4_4_1eomeomlgchor6o.R.inc(19066);iFieldFormatters = new FieldFormatter[10];
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Appends another formatter.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder append(PeriodFormatter formatter) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19067);
        __CLR4_4_1eomeomlgchor6o.R.inc(19068);if ((((formatter == null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19069)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19070)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19071);throw new IllegalArgumentException("No formatter supplied");
        }
        }__CLR4_4_1eomeomlgchor6o.R.inc(19072);clearPrefix();
        __CLR4_4_1eomeomlgchor6o.R.inc(19073);append0(formatter.getPrinter(), formatter.getParser());
        __CLR4_4_1eomeomlgchor6o.R.inc(19074);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Appends a printer parser pair.
     * <p>
     * Either the printer or the parser may be null, in which case the builder will
     * be unable to produce a parser or printer respectively.
     *
     * @param printer appends a printer to the builder, null if printing is not supported
     * @param parser  appends a parser to the builder, null if parsing is not supported
     * @return this PeriodFormatterBuilder
     * @throws IllegalArgumentException if both the printer and parser are null
     */
    public PeriodFormatterBuilder append(PeriodPrinter printer, PeriodParser parser) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19075);
        __CLR4_4_1eomeomlgchor6o.R.inc(19076);if ((((printer == null && parser == null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19077)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19078)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19079);throw new IllegalArgumentException("No printer or parser supplied");
        }
        }__CLR4_4_1eomeomlgchor6o.R.inc(19080);clearPrefix();
        __CLR4_4_1eomeomlgchor6o.R.inc(19081);append0(printer, parser);
        __CLR4_4_1eomeomlgchor6o.R.inc(19082);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Instructs the printer to emit specific text, and the parser to expect it.
     * The parser is case-insensitive.
     *
     * @return this PeriodFormatterBuilder
     * @throws IllegalArgumentException if text is null
     */
    public PeriodFormatterBuilder appendLiteral(String text) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19083);
        __CLR4_4_1eomeomlgchor6o.R.inc(19084);if ((((text == null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19085)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19086)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19087);throw new IllegalArgumentException("Literal must not be null");
        }
        }__CLR4_4_1eomeomlgchor6o.R.inc(19088);clearPrefix();
        __CLR4_4_1eomeomlgchor6o.R.inc(19089);Literal literal = new Literal(text);
        __CLR4_4_1eomeomlgchor6o.R.inc(19090);append0(literal, literal);
        __CLR4_4_1eomeomlgchor6o.R.inc(19091);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Set the minimum digits printed for the next and following appended
     * fields. By default, the minimum digits printed is one. If the field value
     * is zero, it is not printed unless a printZero rule is applied.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder minimumPrintedDigits(int minDigits) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19092);
        __CLR4_4_1eomeomlgchor6o.R.inc(19093);iMinPrintedDigits = minDigits;
        __CLR4_4_1eomeomlgchor6o.R.inc(19094);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Set the maximum digits parsed for the next and following appended
     * fields. By default, the maximum digits parsed is ten.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder maximumParsedDigits(int maxDigits) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19095);
        __CLR4_4_1eomeomlgchor6o.R.inc(19096);iMaxParsedDigits = maxDigits;
        __CLR4_4_1eomeomlgchor6o.R.inc(19097);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Reject signed values when parsing the next and following appended fields.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder rejectSignedValues(boolean v) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19098);
        __CLR4_4_1eomeomlgchor6o.R.inc(19099);iRejectSignedValues = v;
        __CLR4_4_1eomeomlgchor6o.R.inc(19100);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Never print zero values for the next and following appended fields,
     * unless no fields would be printed. If no fields are printed, the printer
     * forces the last "printZeroRarely" field to print a zero.
     * <p>
     * This field setting is the default.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder printZeroRarelyLast() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19101);
        __CLR4_4_1eomeomlgchor6o.R.inc(19102);iPrintZeroSetting = PRINT_ZERO_RARELY_LAST;
        __CLR4_4_1eomeomlgchor6o.R.inc(19103);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Never print zero values for the next and following appended fields,
     * unless no fields would be printed. If no fields are printed, the printer
     * forces the first "printZeroRarely" field to print a zero.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder printZeroRarelyFirst() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19104);
        __CLR4_4_1eomeomlgchor6o.R.inc(19105);iPrintZeroSetting = PRINT_ZERO_RARELY_FIRST;
        __CLR4_4_1eomeomlgchor6o.R.inc(19106);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Print zero values for the next and following appended fields only if the
     * period supports it.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder printZeroIfSupported() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19107);
        __CLR4_4_1eomeomlgchor6o.R.inc(19108);iPrintZeroSetting = PRINT_ZERO_IF_SUPPORTED;
        __CLR4_4_1eomeomlgchor6o.R.inc(19109);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Always print zero values for the next and following appended fields,
     * even if the period doesn't support it. The parser requires values for
     * fields that always print zero.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder printZeroAlways() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19110);
        __CLR4_4_1eomeomlgchor6o.R.inc(19111);iPrintZeroSetting = PRINT_ZERO_ALWAYS;
        __CLR4_4_1eomeomlgchor6o.R.inc(19112);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Never print zero values for the next and following appended fields,
     * unless no fields would be printed. If no fields are printed, the printer
     * forces the last "printZeroRarely" field to print a zero.
     * <p>
     * This field setting is the default.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder printZeroNever() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19113);
        __CLR4_4_1eomeomlgchor6o.R.inc(19114);iPrintZeroSetting = PRINT_ZERO_NEVER;
        __CLR4_4_1eomeomlgchor6o.R.inc(19115);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Append a field prefix which applies only to the next appended field. If
     * the field is not printed, neither is the prefix.
     *
     * @param text text to print before field only if field is printed
     * @return this PeriodFormatterBuilder
     * @see #appendSuffix
     */
    public PeriodFormatterBuilder appendPrefix(String text) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19116);
        __CLR4_4_1eomeomlgchor6o.R.inc(19117);if ((((text == null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19118)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19119)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19120);throw new IllegalArgumentException();
        }
        }__CLR4_4_1eomeomlgchor6o.R.inc(19121);return appendPrefix(new SimpleAffix(text));
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Append a field prefix which applies only to the next appended field. If
     * the field is not printed, neither is the prefix.
     * <p>
     * During parsing, the singular and plural versions are accepted whether
     * or not the actual value matches plurality.
     *
     * @param singularText text to print if field value is one
     * @param pluralText   text to print if field value is not one
     * @return this PeriodFormatterBuilder
     * @see #appendSuffix
     */
    public PeriodFormatterBuilder appendPrefix(String singularText,
                                               String pluralText) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19122);
        __CLR4_4_1eomeomlgchor6o.R.inc(19123);if ((((singularText == null || pluralText == null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19124)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19125)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19126);throw new IllegalArgumentException();
        }
        }__CLR4_4_1eomeomlgchor6o.R.inc(19127);return appendPrefix(new PluralAffix(singularText, pluralText));
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Append a field prefix which applies only to the next appended field.
     * If the field is not printed, neither is the prefix.
     * <p>
     * The value is converted to String. During parsing, the prefix is selected based
     * on the match with the regular expression. The index of the first regular
     * expression that matches value converted to String nominates the prefix. If
     * none of the regular expressions match the value converted to String then the
     * last prefix is selected.
     * <p>
     * An example usage for English might look like this:
     *
     * <pre>
     * appendPrefix(new String[] { &quot;&circ;1$&quot;, &quot;.*&quot; }, new String[] { &quot; year&quot;, &quot; years&quot; })
     * </pre>
     *
     * <p>
     * Please note that for languages with simple mapping (singular and plural prefix
     * only - like the one above) the {@link #appendPrefix(String, String)} method
     * will produce in a slightly faster formatter and that
     * {@link #appendPrefix(String[], String[])} method should be only used when the
     * mapping between values and prefixes is more complicated than the difference between
     * singular and plural.
     *
     * @param regularExpressions an array of regular expressions, at least one
     *                           element, length has to match the length of prefixes parameter
     * @param prefixes           an array of prefixes, at least one element, length has to
     *                           match the length of regularExpressions parameter
     * @return this PeriodFormatterBuilder
     * @throws IllegalStateException if no field exists to append to
     * @see #appendPrefix
     * @since 2.5
     */
    public PeriodFormatterBuilder appendPrefix(String[] regularExpressions, String[] prefixes) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19128);
        __CLR4_4_1eomeomlgchor6o.R.inc(19129);if ((((regularExpressions == null || prefixes == null ||
                regularExpressions.length < 1 || regularExpressions.length != prefixes.length)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19130)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19131)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19132);throw new IllegalArgumentException();
        }
        }__CLR4_4_1eomeomlgchor6o.R.inc(19133);return appendPrefix(new RegExAffix(regularExpressions, prefixes));
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Append a field prefix which applies only to the next appended field. If
     * the field is not printed, neither is the prefix.
     *
     * @param prefix custom prefix
     * @return this PeriodFormatterBuilder
     * @see #appendSuffix
     */
    private PeriodFormatterBuilder appendPrefix(PeriodFieldAffix prefix) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19134);
        __CLR4_4_1eomeomlgchor6o.R.inc(19135);if ((((prefix == null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19136)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19137)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19138);throw new IllegalArgumentException();
        }
        }__CLR4_4_1eomeomlgchor6o.R.inc(19139);if ((((iPrefix != null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19140)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19141)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19142);prefix = new CompositeAffix(iPrefix, prefix);
        }
        }__CLR4_4_1eomeomlgchor6o.R.inc(19143);iPrefix = prefix;
        __CLR4_4_1eomeomlgchor6o.R.inc(19144);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Instruct the printer to emit an integer years field, if supported.
     * <p>
     * The number of printed and parsed digits can be controlled using
     * {@link #minimumPrintedDigits(int)} and {@link #maximumParsedDigits(int)}.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder appendYears() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19145);
        __CLR4_4_1eomeomlgchor6o.R.inc(19146);appendField(YEARS);
        __CLR4_4_1eomeomlgchor6o.R.inc(19147);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Instruct the printer to emit an integer months field, if supported.
     * <p>
     * The number of printed and parsed digits can be controlled using
     * {@link #minimumPrintedDigits(int)} and {@link #maximumParsedDigits(int)}.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder appendMonths() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19148);
        __CLR4_4_1eomeomlgchor6o.R.inc(19149);appendField(MONTHS);
        __CLR4_4_1eomeomlgchor6o.R.inc(19150);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Instruct the printer to emit an integer weeks field, if supported.
     * <p>
     * The number of printed and parsed digits can be controlled using
     * {@link #minimumPrintedDigits(int)} and {@link #maximumParsedDigits(int)}.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder appendWeeks() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19151);
        __CLR4_4_1eomeomlgchor6o.R.inc(19152);appendField(WEEKS);
        __CLR4_4_1eomeomlgchor6o.R.inc(19153);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Instruct the printer to emit an integer days field, if supported.
     * <p>
     * The number of printed and parsed digits can be controlled using
     * {@link #minimumPrintedDigits(int)} and {@link #maximumParsedDigits(int)}.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder appendDays() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19154);
        __CLR4_4_1eomeomlgchor6o.R.inc(19155);appendField(DAYS);
        __CLR4_4_1eomeomlgchor6o.R.inc(19156);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Instruct the printer to emit an integer hours field, if supported.
     * <p>
     * The number of printed and parsed digits can be controlled using
     * {@link #minimumPrintedDigits(int)} and {@link #maximumParsedDigits(int)}.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder appendHours() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19157);
        __CLR4_4_1eomeomlgchor6o.R.inc(19158);appendField(HOURS);
        __CLR4_4_1eomeomlgchor6o.R.inc(19159);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Instruct the printer to emit an integer minutes field, if supported.
     * <p>
     * The number of printed and parsed digits can be controlled using
     * {@link #minimumPrintedDigits(int)} and {@link #maximumParsedDigits(int)}.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder appendMinutes() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19160);
        __CLR4_4_1eomeomlgchor6o.R.inc(19161);appendField(MINUTES);
        __CLR4_4_1eomeomlgchor6o.R.inc(19162);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Instruct the printer to emit an integer seconds field, if supported.
     * <p>
     * The number of printed and parsed digits can be controlled using
     * {@link #minimumPrintedDigits(int)} and {@link #maximumParsedDigits(int)}.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder appendSeconds() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19163);
        __CLR4_4_1eomeomlgchor6o.R.inc(19164);appendField(SECONDS);
        __CLR4_4_1eomeomlgchor6o.R.inc(19165);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Instruct the printer to emit a combined seconds and millis field, if supported.
     * The millis will overflow into the seconds if necessary.
     * The millis are always output.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder appendSecondsWithMillis() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19166);
        __CLR4_4_1eomeomlgchor6o.R.inc(19167);appendField(SECONDS_MILLIS);
        __CLR4_4_1eomeomlgchor6o.R.inc(19168);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Instruct the printer to emit a combined seconds and millis field, if supported.
     * The millis will overflow into the seconds if necessary.
     * The millis are only output if non-zero.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder appendSecondsWithOptionalMillis() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19169);
        __CLR4_4_1eomeomlgchor6o.R.inc(19170);appendField(SECONDS_OPTIONAL_MILLIS);
        __CLR4_4_1eomeomlgchor6o.R.inc(19171);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Instruct the printer to emit an integer millis field, if supported.
     * <p>
     * The number of printed and parsed digits can be controlled using
     * {@link #minimumPrintedDigits(int)} and {@link #maximumParsedDigits(int)}.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder appendMillis() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19172);
        __CLR4_4_1eomeomlgchor6o.R.inc(19173);appendField(MILLIS);
        __CLR4_4_1eomeomlgchor6o.R.inc(19174);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Instruct the printer to emit an integer millis field, if supported.
     * <p>
     * The number of parsed digits can be controlled using {@link #maximumParsedDigits(int)}.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder appendMillis3Digit() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19175);
        __CLR4_4_1eomeomlgchor6o.R.inc(19176);appendField(7, 3);
        __CLR4_4_1eomeomlgchor6o.R.inc(19177);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    private void appendField(int type) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19178);
        __CLR4_4_1eomeomlgchor6o.R.inc(19179);appendField(type, iMinPrintedDigits);
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    private void appendField(int type, int minPrinted) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19180);
        __CLR4_4_1eomeomlgchor6o.R.inc(19181);FieldFormatter field = new FieldFormatter(minPrinted, iPrintZeroSetting,
                iMaxParsedDigits, iRejectSignedValues, type, iFieldFormatters, iPrefix, null);
        __CLR4_4_1eomeomlgchor6o.R.inc(19182);append0(field, field);
        __CLR4_4_1eomeomlgchor6o.R.inc(19183);iFieldFormatters[type] = field;
        __CLR4_4_1eomeomlgchor6o.R.inc(19184);iPrefix = null;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Append a field suffix which applies only to the last appended field. If
     * the field is not printed, neither is the suffix.
     *
     * @param text text to print after field only if field is printed
     * @return this PeriodFormatterBuilder
     * @throws IllegalStateException if no field exists to append to
     * @see #appendPrefix
     */
    public PeriodFormatterBuilder appendSuffix(String text) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19185);
        __CLR4_4_1eomeomlgchor6o.R.inc(19186);if ((((text == null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19187)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19188)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19189);throw new IllegalArgumentException();
        }
        }__CLR4_4_1eomeomlgchor6o.R.inc(19190);return appendSuffix(new SimpleAffix(text));
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Append a field suffix which applies only to the last appended field. If
     * the field is not printed, neither is the suffix.
     * <p>
     * During parsing, the singular and plural versions are accepted whether or
     * not the actual value matches plurality.
     *
     * @param singularText text to print if field value is one
     * @param pluralText   text to print if field value is not one
     * @return this PeriodFormatterBuilder
     * @throws IllegalStateException if no field exists to append to
     * @see #appendPrefix
     */
    public PeriodFormatterBuilder appendSuffix(String singularText,
                                               String pluralText) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19191);
        __CLR4_4_1eomeomlgchor6o.R.inc(19192);if ((((singularText == null || pluralText == null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19193)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19194)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19195);throw new IllegalArgumentException();
        }
        }__CLR4_4_1eomeomlgchor6o.R.inc(19196);return appendSuffix(new PluralAffix(singularText, pluralText));
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Append a field suffix which applies only to the last appended field.
     * If the field is not printed, neither is the suffix.
     * <p>
     * The value is converted to String. During parsing, the suffix is selected based
     * on the match with the regular expression. The index of the first regular
     * expression that matches value converted to String nominates the suffix. If
     * none of the regular expressions match the value converted to String then the
     * last suffix is selected.
     * <p>
     * An example usage for English might look like this:
     *
     * <pre>
     * appendSuffix(new String[] { &quot;&circ;1$&quot;, &quot;.*&quot; }, new String[] { &quot; year&quot;, &quot; years&quot; })
     * </pre>
     *
     * <p>
     * Please note that for languages with simple mapping (singular and plural suffix
     * only - like the one above) the {@link #appendSuffix(String, String)} method
     * will result in a slightly faster formatter and that
     * {@link #appendSuffix(String[], String[])} method should be only used when the
     * mapping between values and prefixes is more complicated than the difference between
     * singular and plural.
     *
     * @param regularExpressions an array of regular expressions, at least one
     *                           element, length has to match the length of suffixes parameter
     * @param suffixes           an array of suffixes, at least one element, length has to
     *                           match the length of regularExpressions parameter
     * @return this PeriodFormatterBuilder
     * @throws IllegalStateException if no field exists to append to
     * @see #appendPrefix
     * @since 2.5
     */
    public PeriodFormatterBuilder appendSuffix(String[] regularExpressions, String[] suffixes) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19197);
        __CLR4_4_1eomeomlgchor6o.R.inc(19198);if ((((regularExpressions == null || suffixes == null ||
                regularExpressions.length < 1 || regularExpressions.length != suffixes.length)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19199)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19200)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19201);throw new IllegalArgumentException();
        }
        }__CLR4_4_1eomeomlgchor6o.R.inc(19202);return appendSuffix(new RegExAffix(regularExpressions, suffixes));
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Append a field suffix which applies only to the last appended field. If
     * the field is not printed, neither is the suffix.
     *
     * @param suffix custom suffix
     * @return this PeriodFormatterBuilder
     * @throws IllegalStateException if no field exists to append to
     * @see #appendPrefix
     */
    private PeriodFormatterBuilder appendSuffix(PeriodFieldAffix suffix) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19203);
        __CLR4_4_1eomeomlgchor6o.R.inc(19204);final Object originalPrinter;
        __CLR4_4_1eomeomlgchor6o.R.inc(19205);final Object originalParser;
        __CLR4_4_1eomeomlgchor6o.R.inc(19206);if ((((iElementPairs.size() > 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19207)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19208)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19209);originalPrinter = iElementPairs.get(iElementPairs.size() - 2);
            __CLR4_4_1eomeomlgchor6o.R.inc(19210);originalParser = iElementPairs.get(iElementPairs.size() - 1);
        } }else {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19211);originalPrinter = null;
            __CLR4_4_1eomeomlgchor6o.R.inc(19212);originalParser = null;
        }

        }__CLR4_4_1eomeomlgchor6o.R.inc(19213);if ((((originalPrinter == null || originalParser == null ||
                originalPrinter != originalParser ||
                !(originalPrinter instanceof FieldFormatter))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19214)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19215)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19216);throw new IllegalStateException("No field to apply suffix to");
        }

        }__CLR4_4_1eomeomlgchor6o.R.inc(19217);clearPrefix();
        __CLR4_4_1eomeomlgchor6o.R.inc(19218);FieldFormatter newField = new FieldFormatter((FieldFormatter) originalPrinter, suffix);
        __CLR4_4_1eomeomlgchor6o.R.inc(19219);iElementPairs.set(iElementPairs.size() - 2, newField);
        __CLR4_4_1eomeomlgchor6o.R.inc(19220);iElementPairs.set(iElementPairs.size() - 1, newField);
        __CLR4_4_1eomeomlgchor6o.R.inc(19221);iFieldFormatters[newField.getFieldType()] = newField;

        __CLR4_4_1eomeomlgchor6o.R.inc(19222);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Append a separator, which is output if fields are printed both before
     * and after the separator.
     * <p>
     * For example, <code>builder.appendDays().appendSeparator(",").appendHours()</code>
     * will only output the comma if both the days and hours fields are output.
     * <p>
     * The text will be parsed case-insensitively.
     * <p>
     * Note: appending a separator discontinues any further work on the latest
     * appended field.
     *
     * @param text the text to use as a separator
     * @return this PeriodFormatterBuilder
     * @throws IllegalStateException if this separator follows a previous one
     */
    public PeriodFormatterBuilder appendSeparator(String text) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19223);
        __CLR4_4_1eomeomlgchor6o.R.inc(19224);return appendSeparator(text, text, null, true, true);
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Append a separator, which is output only if fields are printed after the separator.
     * <p>
     * For example,
     * <code>builder.appendDays().appendSeparatorIfFieldsAfter(",").appendHours()</code>
     * will only output the comma if the hours fields is output.
     * <p>
     * The text will be parsed case-insensitively.
     * <p>
     * Note: appending a separator discontinues any further work on the latest
     * appended field.
     *
     * @param text the text to use as a separator
     * @return this PeriodFormatterBuilder
     * @throws IllegalStateException if this separator follows a previous one
     */
    public PeriodFormatterBuilder appendSeparatorIfFieldsAfter(String text) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19225);
        __CLR4_4_1eomeomlgchor6o.R.inc(19226);return appendSeparator(text, text, null, false, true);
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Append a separator, which is output only if fields are printed before the separator.
     * <p>
     * For example,
     * <code>builder.appendDays().appendSeparatorIfFieldsBefore(",").appendHours()</code>
     * will only output the comma if the days fields is output.
     * <p>
     * The text will be parsed case-insensitively.
     * <p>
     * Note: appending a separator discontinues any further work on the latest
     * appended field.
     *
     * @param text the text to use as a separator
     * @return this PeriodFormatterBuilder
     * @throws IllegalStateException if this separator follows a previous one
     */
    public PeriodFormatterBuilder appendSeparatorIfFieldsBefore(String text) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19227);
        __CLR4_4_1eomeomlgchor6o.R.inc(19228);return appendSeparator(text, text, null, true, false);
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Append a separator, which is output if fields are printed both before
     * and after the separator.
     * <p>
     * This method changes the separator depending on whether it is the last separator
     * to be output.
     * <p>
     * For example, <code>builder.appendDays().appendSeparator(",", "&").appendHours().appendSeparator(",", "&").appendMinutes()</code>
     * will output '1,2&3' if all three fields are output, '1&2' if two fields are output
     * and '1' if just one field is output.
     * <p>
     * The text will be parsed case-insensitively.
     * <p>
     * Note: appending a separator discontinues any further work on the latest
     * appended field.
     *
     * @param text      the text to use as a separator
     * @param finalText the text used used if this is the final separator to be printed
     * @return this PeriodFormatterBuilder
     * @throws IllegalStateException if this separator follows a previous one
     */
    public PeriodFormatterBuilder appendSeparator(String text, String finalText) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19229);
        __CLR4_4_1eomeomlgchor6o.R.inc(19230);return appendSeparator(text, finalText, null, true, true);
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    /**
     * Append a separator, which is output if fields are printed both before
     * and after the separator.
     * <p>
     * This method changes the separator depending on whether it is the last separator
     * to be output.
     * <p>
     * For example, <code>builder.appendDays().appendSeparator(",", "&").appendHours().appendSeparator(",", "&").appendMinutes()</code>
     * will output '1,2&3' if all three fields are output, '1&2' if two fields are output
     * and '1' if just one field is output.
     * <p>
     * The text will be parsed case-insensitively.
     * <p>
     * Note: appending a separator discontinues any further work on the latest
     * appended field.
     *
     * @param text      the text to use as a separator
     * @param finalText the text used used if this is the final separator to be printed
     * @param variants  set of text values which are also acceptable when parsed
     * @return this PeriodFormatterBuilder
     * @throws IllegalStateException if this separator follows a previous one
     */
    public PeriodFormatterBuilder appendSeparator(String text, String finalText,
                                                  String[] variants) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19231);
        __CLR4_4_1eomeomlgchor6o.R.inc(19232);return appendSeparator(text, finalText, variants, true, true);
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    private PeriodFormatterBuilder appendSeparator(String text, String finalText,
                                                   String[] variants,
                                                   boolean useBefore, boolean useAfter) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19233);
        __CLR4_4_1eomeomlgchor6o.R.inc(19234);if ((((text == null || finalText == null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19235)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19236)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19237);throw new IllegalArgumentException();
        }

        }__CLR4_4_1eomeomlgchor6o.R.inc(19238);clearPrefix();

        // optimise zero formatter case
        __CLR4_4_1eomeomlgchor6o.R.inc(19239);List<Object> pairs = iElementPairs;
        __CLR4_4_1eomeomlgchor6o.R.inc(19240);if ((((pairs.size() == 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19241)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19242)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19243);if ((((useAfter && useBefore == false)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19244)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19245)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19246);Separator separator = new Separator(
                        text, finalText, variants,
                        Literal.EMPTY, Literal.EMPTY, useBefore, useAfter);
                __CLR4_4_1eomeomlgchor6o.R.inc(19247);append0(separator, separator);
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(19248);return this;
        }

        // find the last separator added
        }__CLR4_4_1eomeomlgchor6o.R.inc(19249);int i;
        __CLR4_4_1eomeomlgchor6o.R.inc(19250);Separator lastSeparator = null;
        __CLR4_4_1eomeomlgchor6o.R.inc(19251);for (i = pairs.size(); (((--i >= 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19252)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19253)==0&false)); ) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19254);if ((((pairs.get(i) instanceof Separator)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19255)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19256)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19257);lastSeparator = (Separator) pairs.get(i);
                __CLR4_4_1eomeomlgchor6o.R.inc(19258);pairs = pairs.subList(i + 1, pairs.size());
                __CLR4_4_1eomeomlgchor6o.R.inc(19259);break;
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(19260);i--;  // element pairs
        }

        // merge formatters
        }__CLR4_4_1eomeomlgchor6o.R.inc(19261);if ((((lastSeparator != null && pairs.size() == 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19262)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19263)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19264);throw new IllegalStateException("Cannot have two adjacent separators");
        } }else {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19265);Object[] comp = createComposite(pairs);
            __CLR4_4_1eomeomlgchor6o.R.inc(19266);pairs.clear();
            __CLR4_4_1eomeomlgchor6o.R.inc(19267);Separator separator = new Separator(
                    text, finalText, variants,
                    (PeriodPrinter) comp[0], (PeriodParser) comp[1],
                    useBefore, useAfter);
            __CLR4_4_1eomeomlgchor6o.R.inc(19268);pairs.add(separator);
            __CLR4_4_1eomeomlgchor6o.R.inc(19269);pairs.add(separator);
        }

        }__CLR4_4_1eomeomlgchor6o.R.inc(19270);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void clearPrefix() throws IllegalStateException {try{__CLR4_4_1eomeomlgchor6o.R.inc(19271);
        __CLR4_4_1eomeomlgchor6o.R.inc(19272);if ((((iPrefix != null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19273)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19274)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19275);throw new IllegalStateException("Prefix not followed by field");
        }
        }__CLR4_4_1eomeomlgchor6o.R.inc(19276);iPrefix = null;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    private PeriodFormatterBuilder append0(PeriodPrinter printer, PeriodParser parser) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19277);
        __CLR4_4_1eomeomlgchor6o.R.inc(19278);iElementPairs.add(printer);
        __CLR4_4_1eomeomlgchor6o.R.inc(19279);iElementPairs.add(parser);
        __CLR4_4_1eomeomlgchor6o.R.inc(19280);iNotPrinter |= (printer == null);
        __CLR4_4_1eomeomlgchor6o.R.inc(19281);iNotParser |= (parser == null);
        __CLR4_4_1eomeomlgchor6o.R.inc(19282);return this;
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private static PeriodFormatter toFormatter(List<Object> elementPairs, boolean notPrinter, boolean notParser) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19283);
        __CLR4_4_1eomeomlgchor6o.R.inc(19284);if ((((notPrinter && notParser)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19285)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19286)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19287);throw new IllegalStateException("Builder has created neither a printer nor a parser");
        }
        }__CLR4_4_1eomeomlgchor6o.R.inc(19288);int size = elementPairs.size();
        __CLR4_4_1eomeomlgchor6o.R.inc(19289);if ((((size >= 2 && elementPairs.get(0) instanceof Separator)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19290)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19291)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19292);Separator sep = (Separator) elementPairs.get(0);
            __CLR4_4_1eomeomlgchor6o.R.inc(19293);if ((((sep.iAfterParser == null && sep.iAfterPrinter == null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19294)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19295)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19296);PeriodFormatter f = toFormatter(elementPairs.subList(2, size), notPrinter, notParser);
                __CLR4_4_1eomeomlgchor6o.R.inc(19297);sep = sep.finish(f.getPrinter(), f.getParser());
                __CLR4_4_1eomeomlgchor6o.R.inc(19298);return new PeriodFormatter(sep, sep);
            }
        }}
        }__CLR4_4_1eomeomlgchor6o.R.inc(19299);Object[] comp = createComposite(elementPairs);
        __CLR4_4_1eomeomlgchor6o.R.inc(19300);if ((((notPrinter)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19301)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19302)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19303);return new PeriodFormatter(null, (PeriodParser) comp[1]);
        } }else {__CLR4_4_1eomeomlgchor6o.R.inc(19304);if ((((notParser)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19305)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19306)==0&false))) {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19307);return new PeriodFormatter((PeriodPrinter) comp[0], null);
        } }else {{
            __CLR4_4_1eomeomlgchor6o.R.inc(19308);return new PeriodFormatter((PeriodPrinter) comp[0], (PeriodParser) comp[1]);
        }
    }}}finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    private static Object[] createComposite(List<Object> elementPairs) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19309);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_1eomeomlgchor6o.R.inc(19310);switch (elementPairs.size()) {
            case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_1eomeomlgchor6o.R.inc(19311);__CLB4_4_1_bool0=true;}
                __CLR4_4_1eomeomlgchor6o.R.inc(19312);return new Object[]{Literal.EMPTY, Literal.EMPTY};
            case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_1eomeomlgchor6o.R.inc(19313);__CLB4_4_1_bool0=true;}
                __CLR4_4_1eomeomlgchor6o.R.inc(19314);return new Object[]{elementPairs.get(0), elementPairs.get(1)};
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_1eomeomlgchor6o.R.inc(19315);__CLB4_4_1_bool0=true;}
                __CLR4_4_1eomeomlgchor6o.R.inc(19316);Composite comp = new Composite(elementPairs);
                __CLR4_4_1eomeomlgchor6o.R.inc(19317);return new Object[]{comp, comp};
        }
    }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Defines a formatted field's prefix or suffix text.
     * This can be used for fields such as 'n hours' or 'nH' or 'Hour:n'.
     */
    static interface PeriodFieldAffix {
        int calculatePrintedLength(int value);

        void printTo(StringBuffer buf, int value);

        void printTo(Writer out, int value) throws IOException;

        /**
         * @return new position after parsing affix, or ~position of failure
         */
        int parse(String periodStr, int position);

        /**
         * @return position where affix starts, or original ~position if not found
         */
        int scan(String periodStr, int position);

        /**
         * @return a copy of array of affixes
         */
        String[] getAffixes();

        /**
         * This method should be called only once.
         * After first call consecutive calls to this methods will have no effect.
         * Causes this affix to ignore a match (parse and scan
         * methods) if there is an affix in the passed list that holds
         * affix text which satisfy both following conditions:
         * - the affix text is also a match
         * - the affix text is longer than the match from this object
         *
         * @param affixesToIgnore
         */
        void finish(Set<PeriodFieldAffix> affixesToIgnore);
    }

    /**
     * An affix that can be ignored.
     */
    static abstract class IgnorableAffix implements PeriodFieldAffix {
        private volatile String[] iOtherAffixes;

        public void finish(Set<PeriodFieldAffix> periodFieldAffixesToIgnore) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19318);
            __CLR4_4_1eomeomlgchor6o.R.inc(19319);if ((((iOtherAffixes == null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19320)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19321)==0&false))) {{
                // Calculate the shortest affix in this instance.
                __CLR4_4_1eomeomlgchor6o.R.inc(19322);int shortestAffixLength = Integer.MAX_VALUE;
                __CLR4_4_1eomeomlgchor6o.R.inc(19323);String shortestAffix = null;
                __CLR4_4_1eomeomlgchor6o.R.inc(19324);for (String affix : getAffixes()) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19325);if ((((affix.length() < shortestAffixLength)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19326)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19327)==0&false))) {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(19328);shortestAffixLength = affix.length();
                        __CLR4_4_1eomeomlgchor6o.R.inc(19329);shortestAffix = affix;
                    }
                }}

                // Pick only affixes that are longer than the shortest affix in this instance.
                // This will reduce the number of parse operations and thus speed up the PeriodFormatter.
                // also need to pick affixes that differ only in case (but not those that are identical)
                }__CLR4_4_1eomeomlgchor6o.R.inc(19330);Set<String> affixesToIgnore = new HashSet<String>();
                __CLR4_4_1eomeomlgchor6o.R.inc(19331);for (PeriodFieldAffix periodFieldAffixToIgnore : periodFieldAffixesToIgnore) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19332);if ((((periodFieldAffixToIgnore != null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19333)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19334)==0&false))) {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(19335);for (String affixToIgnore : periodFieldAffixToIgnore.getAffixes()) {{
                            __CLR4_4_1eomeomlgchor6o.R.inc(19336);if ((((affixToIgnore.length() > shortestAffixLength ||
                                    (affixToIgnore.equalsIgnoreCase(shortestAffix) && !affixToIgnore.equals(shortestAffix)))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19337)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19338)==0&false))) {{
                                __CLR4_4_1eomeomlgchor6o.R.inc(19339);affixesToIgnore.add(affixToIgnore);
                            }
                        }}
                    }}
                }}
                }__CLR4_4_1eomeomlgchor6o.R.inc(19340);iOtherAffixes = affixesToIgnore.toArray(new String[affixesToIgnore.size()]);
            }
        }}finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        /**
         * Checks if there is a match among the other affixes (stored internally)
         * that is longer than the passed value (textLength).
         *
         * @param textLength the length of the match
         * @param periodStr  the Period string that will be parsed
         * @param position   the position in the Period string at which the parsing should be started.
         * @return true if the other affixes (stored internally) contain a match
         * that is longer than the textLength parameter, false otherwise
         */
        protected boolean matchesOtherAffix(int textLength, String periodStr, int position) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19341);
            __CLR4_4_1eomeomlgchor6o.R.inc(19342);if ((((iOtherAffixes != null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19343)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19344)==0&false))) {{
                // ignore case when affix length differs
                // match case when affix length is same
                __CLR4_4_1eomeomlgchor6o.R.inc(19345);for (String affixToIgnore : iOtherAffixes) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19346);int textToIgnoreLength = affixToIgnore.length();
                    __CLR4_4_1eomeomlgchor6o.R.inc(19347);if (((((textLength < textToIgnoreLength && periodStr.regionMatches(true, position, affixToIgnore, 0, textToIgnoreLength)) ||
                            (textLength == textToIgnoreLength && periodStr.regionMatches(false, position, affixToIgnore, 0, textToIgnoreLength)))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19348)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19349)==0&false))) {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(19350);return true;
                    }
                }}
            }}
            }__CLR4_4_1eomeomlgchor6o.R.inc(19351);return false;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------

    /**
     * Implements an affix where the text does not vary by the amount.
     */
    static class SimpleAffix extends IgnorableAffix {
        private final String iText;

        SimpleAffix(String text) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19352);
            __CLR4_4_1eomeomlgchor6o.R.inc(19353);iText = text;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int calculatePrintedLength(int value) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19354);
            __CLR4_4_1eomeomlgchor6o.R.inc(19355);return iText.length();
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public void printTo(StringBuffer buf, int value) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19356);
            __CLR4_4_1eomeomlgchor6o.R.inc(19357);buf.append(iText);
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public void printTo(Writer out, int value) throws IOException {try{__CLR4_4_1eomeomlgchor6o.R.inc(19358);
            __CLR4_4_1eomeomlgchor6o.R.inc(19359);out.write(iText);
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int parse(String periodStr, int position) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19360);
            __CLR4_4_1eomeomlgchor6o.R.inc(19361);String text = iText;
            __CLR4_4_1eomeomlgchor6o.R.inc(19362);int textLength = text.length();
            __CLR4_4_1eomeomlgchor6o.R.inc(19363);if ((((periodStr.regionMatches(true, position, text, 0, textLength))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19364)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19365)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19366);if ((((!matchesOtherAffix(textLength, periodStr, position))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19367)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19368)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19369);return position + textLength;
                }
            }}
            }__CLR4_4_1eomeomlgchor6o.R.inc(19370);return ~position;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int scan(String periodStr, final int position) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19371);
            __CLR4_4_1eomeomlgchor6o.R.inc(19372);String text = iText;
            __CLR4_4_1eomeomlgchor6o.R.inc(19373);int textLength = text.length();
            __CLR4_4_1eomeomlgchor6o.R.inc(19374);int sourceLength = periodStr.length();
            __CLR4_4_1eomeomlgchor6o.R.inc(19375);search:
            for (int pos = position; (((pos < sourceLength)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19376)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19377)==0&false)); pos++) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19378);if ((((periodStr.regionMatches(true, pos, text, 0, textLength))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19379)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19380)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19381);if ((((!matchesOtherAffix(textLength, periodStr, pos))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19382)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19383)==0&false))) {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(19384);return pos;
                    }
                }}
                // Only allow number characters to be skipped in search of suffix.
                }boolean __CLB4_4_1_bool1=false;__CLR4_4_1eomeomlgchor6o.R.inc(19385);switch (periodStr.charAt(pos)) {
                    case '0':if (!__CLB4_4_1_bool1) {__CLR4_4_1eomeomlgchor6o.R.inc(19386);__CLB4_4_1_bool1=true;}
                    case '1':if (!__CLB4_4_1_bool1) {__CLR4_4_1eomeomlgchor6o.R.inc(19387);__CLB4_4_1_bool1=true;}
                    case '2':if (!__CLB4_4_1_bool1) {__CLR4_4_1eomeomlgchor6o.R.inc(19388);__CLB4_4_1_bool1=true;}
                    case '3':if (!__CLB4_4_1_bool1) {__CLR4_4_1eomeomlgchor6o.R.inc(19389);__CLB4_4_1_bool1=true;}
                    case '4':if (!__CLB4_4_1_bool1) {__CLR4_4_1eomeomlgchor6o.R.inc(19390);__CLB4_4_1_bool1=true;}
                    case '5':if (!__CLB4_4_1_bool1) {__CLR4_4_1eomeomlgchor6o.R.inc(19391);__CLB4_4_1_bool1=true;}
                    case '6':if (!__CLB4_4_1_bool1) {__CLR4_4_1eomeomlgchor6o.R.inc(19392);__CLB4_4_1_bool1=true;}
                    case '7':if (!__CLB4_4_1_bool1) {__CLR4_4_1eomeomlgchor6o.R.inc(19393);__CLB4_4_1_bool1=true;}
                    case '8':if (!__CLB4_4_1_bool1) {__CLR4_4_1eomeomlgchor6o.R.inc(19394);__CLB4_4_1_bool1=true;}
                    case '9':if (!__CLB4_4_1_bool1) {__CLR4_4_1eomeomlgchor6o.R.inc(19395);__CLB4_4_1_bool1=true;}
                    case '.':if (!__CLB4_4_1_bool1) {__CLR4_4_1eomeomlgchor6o.R.inc(19396);__CLB4_4_1_bool1=true;}
                    case ',':if (!__CLB4_4_1_bool1) {__CLR4_4_1eomeomlgchor6o.R.inc(19397);__CLB4_4_1_bool1=true;}
                    case '+':if (!__CLB4_4_1_bool1) {__CLR4_4_1eomeomlgchor6o.R.inc(19398);__CLB4_4_1_bool1=true;}
                    case '-':if (!__CLB4_4_1_bool1) {__CLR4_4_1eomeomlgchor6o.R.inc(19399);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1eomeomlgchor6o.R.inc(19400);break;
                    default:if (!__CLB4_4_1_bool1) {__CLR4_4_1eomeomlgchor6o.R.inc(19401);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1eomeomlgchor6o.R.inc(19402);break search;
                }
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(19403);return ~position;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public String[] getAffixes() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19404);
            __CLR4_4_1eomeomlgchor6o.R.inc(19405);return new String[]{iText};
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------

    /**
     * Implements an affix where the text varies by the amount of the field.
     * Only singular (1) and plural (not 1) are supported.
     */
    static class PluralAffix extends IgnorableAffix {
        private final String iSingularText;
        private final String iPluralText;

        PluralAffix(String singularText, String pluralText) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19406);
            __CLR4_4_1eomeomlgchor6o.R.inc(19407);iSingularText = singularText;
            __CLR4_4_1eomeomlgchor6o.R.inc(19408);iPluralText = pluralText;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int calculatePrintedLength(int value) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19409);
            __CLR4_4_1eomeomlgchor6o.R.inc(19410);return ((((value == 1 )&&(__CLR4_4_1eomeomlgchor6o.R.iget(19411)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19412)==0&false))? iSingularText : iPluralText).length();
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public void printTo(StringBuffer buf, int value) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19413);
            __CLR4_4_1eomeomlgchor6o.R.inc(19414);buf.append((((value == 1 )&&(__CLR4_4_1eomeomlgchor6o.R.iget(19415)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19416)==0&false))? iSingularText : iPluralText);
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public void printTo(Writer out, int value) throws IOException {try{__CLR4_4_1eomeomlgchor6o.R.inc(19417);
            __CLR4_4_1eomeomlgchor6o.R.inc(19418);out.write((((value == 1 )&&(__CLR4_4_1eomeomlgchor6o.R.iget(19419)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19420)==0&false))? iSingularText : iPluralText);
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int parse(String periodStr, int position) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19421);
            __CLR4_4_1eomeomlgchor6o.R.inc(19422);String text1 = iPluralText;
            __CLR4_4_1eomeomlgchor6o.R.inc(19423);String text2 = iSingularText;

            __CLR4_4_1eomeomlgchor6o.R.inc(19424);if ((((text1.length() < text2.length())&&(__CLR4_4_1eomeomlgchor6o.R.iget(19425)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19426)==0&false))) {{
                // Swap in order to match longer one first.
                __CLR4_4_1eomeomlgchor6o.R.inc(19427);String temp = text1;
                __CLR4_4_1eomeomlgchor6o.R.inc(19428);text1 = text2;
                __CLR4_4_1eomeomlgchor6o.R.inc(19429);text2 = temp;
            }

            }__CLR4_4_1eomeomlgchor6o.R.inc(19430);if ((((periodStr.regionMatches(true, position, text1, 0, text1.length()))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19431)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19432)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19433);if ((((!matchesOtherAffix(text1.length(), periodStr, position))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19434)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19435)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19436);return position + text1.length();
                }
            }}
            }__CLR4_4_1eomeomlgchor6o.R.inc(19437);if ((((periodStr.regionMatches(true, position, text2, 0, text2.length()))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19438)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19439)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19440);if ((((!matchesOtherAffix(text2.length(), periodStr, position))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19441)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19442)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19443);return position + text2.length();
                }
            }}

            }__CLR4_4_1eomeomlgchor6o.R.inc(19444);return ~position;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int scan(String periodStr, final int position) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19445);
            __CLR4_4_1eomeomlgchor6o.R.inc(19446);String text1 = iPluralText;
            __CLR4_4_1eomeomlgchor6o.R.inc(19447);String text2 = iSingularText;

            __CLR4_4_1eomeomlgchor6o.R.inc(19448);if ((((text1.length() < text2.length())&&(__CLR4_4_1eomeomlgchor6o.R.iget(19449)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19450)==0&false))) {{
                // Swap in order to match longer one first.
                __CLR4_4_1eomeomlgchor6o.R.inc(19451);String temp = text1;
                __CLR4_4_1eomeomlgchor6o.R.inc(19452);text1 = text2;
                __CLR4_4_1eomeomlgchor6o.R.inc(19453);text2 = temp;
            }

            }__CLR4_4_1eomeomlgchor6o.R.inc(19454);int textLength1 = text1.length();
            __CLR4_4_1eomeomlgchor6o.R.inc(19455);int textLength2 = text2.length();

            __CLR4_4_1eomeomlgchor6o.R.inc(19456);int sourceLength = periodStr.length();
            __CLR4_4_1eomeomlgchor6o.R.inc(19457);for (int pos = position; (((pos < sourceLength)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19458)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19459)==0&false)); pos++) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19460);if ((((periodStr.regionMatches(true, pos, text1, 0, textLength1))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19461)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19462)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19463);if ((((!matchesOtherAffix(text1.length(), periodStr, pos))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19464)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19465)==0&false))) {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(19466);return pos;
                    }
                }}
                }__CLR4_4_1eomeomlgchor6o.R.inc(19467);if ((((periodStr.regionMatches(true, pos, text2, 0, textLength2))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19468)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19469)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19470);if ((((!matchesOtherAffix(text2.length(), periodStr, pos))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19471)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19472)==0&false))) {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(19473);return pos;
                    }
                }}
            }}
            }__CLR4_4_1eomeomlgchor6o.R.inc(19474);return ~position;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public String[] getAffixes() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19475);
            __CLR4_4_1eomeomlgchor6o.R.inc(19476);return new String[]{iSingularText, iPluralText};
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}
    }

    // -----------------------------------------------------------------------

    /**
     * Implements an affix where the text varies by the amount of the field.
     * Different amounts are supported based on the provided parameters.
     */
    static class RegExAffix extends IgnorableAffix {
        private static final Comparator<String> LENGTH_DESC_COMPARATOR = new Comparator<String>() {
            public int compare(String o1, String o2) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19477);
                __CLR4_4_1eomeomlgchor6o.R.inc(19478);return o2.length() - o1.length();
            }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}
        };

        private final String[] iSuffixes;
        private final Pattern[] iPatterns;

        // The parse method has to iterate over the suffixes from the longest one to the shortest one
        // Otherwise it might consume not enough characters.
        private final String[] iSuffixesSortedDescByLength;

        RegExAffix(String[] regExes, String[] texts) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19479);
            __CLR4_4_1eomeomlgchor6o.R.inc(19480);iSuffixes = texts.clone();
            __CLR4_4_1eomeomlgchor6o.R.inc(19481);iPatterns = new Pattern[regExes.length];
            __CLR4_4_1eomeomlgchor6o.R.inc(19482);for (int i = 0; (((i < regExes.length)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19483)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19484)==0&false)); i++) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19485);Pattern pattern = PATTERNS.get(regExes[i]);
                __CLR4_4_1eomeomlgchor6o.R.inc(19486);if ((((pattern == null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19487)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19488)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19489);pattern = Pattern.compile(regExes[i]);
                    __CLR4_4_1eomeomlgchor6o.R.inc(19490);PATTERNS.putIfAbsent(regExes[i], pattern);
                }
                }__CLR4_4_1eomeomlgchor6o.R.inc(19491);iPatterns[i] = pattern;
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(19492);iSuffixesSortedDescByLength = iSuffixes.clone();
            __CLR4_4_1eomeomlgchor6o.R.inc(19493);Arrays.sort(iSuffixesSortedDescByLength, LENGTH_DESC_COMPARATOR);
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        private int selectSuffixIndex(int value) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19494);
            __CLR4_4_1eomeomlgchor6o.R.inc(19495);String valueString = String.valueOf(value);
            __CLR4_4_1eomeomlgchor6o.R.inc(19496);for (int i = 0; (((i < iPatterns.length)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19497)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19498)==0&false)); i++) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19499);if ((((iPatterns[i].matcher(valueString).matches())&&(__CLR4_4_1eomeomlgchor6o.R.iget(19500)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19501)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19502);return i;
                }
            }}
            }__CLR4_4_1eomeomlgchor6o.R.inc(19503);return iPatterns.length - 1;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int calculatePrintedLength(int value) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19504);
            __CLR4_4_1eomeomlgchor6o.R.inc(19505);return iSuffixes[selectSuffixIndex(value)].length();
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public void printTo(StringBuffer buf, int value) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19506);
            __CLR4_4_1eomeomlgchor6o.R.inc(19507);buf.append(iSuffixes[selectSuffixIndex(value)]);
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public void printTo(Writer out, int value) throws IOException {try{__CLR4_4_1eomeomlgchor6o.R.inc(19508);
            __CLR4_4_1eomeomlgchor6o.R.inc(19509);out.write(iSuffixes[selectSuffixIndex(value)]);
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int parse(String periodStr, int position) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19510);
            __CLR4_4_1eomeomlgchor6o.R.inc(19511);for (String text : iSuffixesSortedDescByLength) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19512);if ((((periodStr.regionMatches(true, position, text, 0, text.length()))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19513)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19514)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19515);if ((((!matchesOtherAffix(text.length(), periodStr, position))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19516)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19517)==0&false))) {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(19518);return position + text.length();
                    }
                }}
            }}
            }__CLR4_4_1eomeomlgchor6o.R.inc(19519);return ~position;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int scan(String periodStr, final int position) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19520);
            __CLR4_4_1eomeomlgchor6o.R.inc(19521);int sourceLength = periodStr.length();
            __CLR4_4_1eomeomlgchor6o.R.inc(19522);for (int pos = position; (((pos < sourceLength)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19523)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19524)==0&false)); pos++) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19525);for (String text : iSuffixesSortedDescByLength) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19526);if ((((periodStr.regionMatches(true, pos, text, 0, text.length()))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19527)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19528)==0&false))) {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(19529);if ((((!matchesOtherAffix(text.length(), periodStr, pos))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19530)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19531)==0&false))) {{
                            __CLR4_4_1eomeomlgchor6o.R.inc(19532);return pos;
                        }
                    }}
                }}
            }}
            }__CLR4_4_1eomeomlgchor6o.R.inc(19533);return ~position;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public String[] getAffixes() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19534);
            __CLR4_4_1eomeomlgchor6o.R.inc(19535);return iSuffixes.clone();
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------

    /**
     * Builds a composite affix by merging two other affix implementations.
     */
    static class CompositeAffix extends IgnorableAffix {
        private final PeriodFieldAffix iLeft;
        private final PeriodFieldAffix iRight;
        private final String[] iLeftRightCombinations;

        CompositeAffix(PeriodFieldAffix left, PeriodFieldAffix right) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19536);
            __CLR4_4_1eomeomlgchor6o.R.inc(19537);iLeft = left;
            __CLR4_4_1eomeomlgchor6o.R.inc(19538);iRight = right;

            // We need to construct all possible combinations of left and right.
            // We are doing it once in constructor so that getAffixes() is quicker.
            __CLR4_4_1eomeomlgchor6o.R.inc(19539);Set<String> result = new HashSet<String>();
            __CLR4_4_1eomeomlgchor6o.R.inc(19540);for (String leftText : iLeft.getAffixes()) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19541);for (String rightText : iRight.getAffixes()) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19542);result.add(leftText + rightText);
                }
            }}
            }__CLR4_4_1eomeomlgchor6o.R.inc(19543);iLeftRightCombinations = result.toArray(new String[result.size()]);
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int calculatePrintedLength(int value) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19544);
            __CLR4_4_1eomeomlgchor6o.R.inc(19545);return iLeft.calculatePrintedLength(value)
                    + iRight.calculatePrintedLength(value);
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public void printTo(StringBuffer buf, int value) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19546);
            __CLR4_4_1eomeomlgchor6o.R.inc(19547);iLeft.printTo(buf, value);
            __CLR4_4_1eomeomlgchor6o.R.inc(19548);iRight.printTo(buf, value);
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public void printTo(Writer out, int value) throws IOException {try{__CLR4_4_1eomeomlgchor6o.R.inc(19549);
            __CLR4_4_1eomeomlgchor6o.R.inc(19550);iLeft.printTo(out, value);
            __CLR4_4_1eomeomlgchor6o.R.inc(19551);iRight.printTo(out, value);
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int parse(String periodStr, int position) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19552);
            __CLR4_4_1eomeomlgchor6o.R.inc(19553);int pos = iLeft.parse(periodStr, position);
            __CLR4_4_1eomeomlgchor6o.R.inc(19554);if ((((pos >= 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19555)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19556)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19557);pos = iRight.parse(periodStr, pos);
                __CLR4_4_1eomeomlgchor6o.R.inc(19558);if ((((pos >= 0 && matchesOtherAffix(parse(periodStr, pos) - pos, periodStr, position))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19559)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19560)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19561);return ~position;
                }
            }}
            }__CLR4_4_1eomeomlgchor6o.R.inc(19562);return pos;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int scan(String periodStr, final int position) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19563);
            __CLR4_4_1eomeomlgchor6o.R.inc(19564);int leftPosition = iLeft.scan(periodStr, position);
            __CLR4_4_1eomeomlgchor6o.R.inc(19565);if ((((leftPosition >= 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19566)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19567)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19568);int rightPosition = iRight.scan(periodStr, iLeft.parse(periodStr, leftPosition));
                __CLR4_4_1eomeomlgchor6o.R.inc(19569);if ((((!(rightPosition >= 0 && matchesOtherAffix(iRight.parse(periodStr, rightPosition) - leftPosition, periodStr, position)))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19570)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19571)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19572);if ((((leftPosition > 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19573)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19574)==0&false))) {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(19575);return leftPosition;
                    } }else {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(19576);return rightPosition;
                    }
                }}
            }}
            }__CLR4_4_1eomeomlgchor6o.R.inc(19577);return ~position;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public String[] getAffixes() {try{__CLR4_4_1eomeomlgchor6o.R.inc(19578);
            __CLR4_4_1eomeomlgchor6o.R.inc(19579);return iLeftRightCombinations.clone();
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------

    /**
     * Formats the numeric value of a field, potentially with prefix/suffix.
     */
    static class FieldFormatter
            implements PeriodPrinter, PeriodParser {
        private final int iMinPrintedDigits;
        private final int iPrintZeroSetting;
        private final int iMaxParsedDigits;
        private final boolean iRejectSignedValues;

        /**
         * The index of the field type, 0=year, etc.
         */
        private final int iFieldType;
        /**
         * The array of the latest formatter added for each type.
         * This is shared between all the field formatters in a formatter.
         */
        private final FieldFormatter[] iFieldFormatters;

        private final PeriodFieldAffix iPrefix;
        private final PeriodFieldAffix iSuffix;

        FieldFormatter(int minPrintedDigits, int printZeroSetting,
                       int maxParsedDigits, boolean rejectSignedValues,
                       int fieldType, FieldFormatter[] fieldFormatters,
                       PeriodFieldAffix prefix, PeriodFieldAffix suffix) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19580);
            __CLR4_4_1eomeomlgchor6o.R.inc(19581);iMinPrintedDigits = minPrintedDigits;
            __CLR4_4_1eomeomlgchor6o.R.inc(19582);iPrintZeroSetting = printZeroSetting;
            __CLR4_4_1eomeomlgchor6o.R.inc(19583);iMaxParsedDigits = maxParsedDigits;
            __CLR4_4_1eomeomlgchor6o.R.inc(19584);iRejectSignedValues = rejectSignedValues;
            __CLR4_4_1eomeomlgchor6o.R.inc(19585);iFieldType = fieldType;
            __CLR4_4_1eomeomlgchor6o.R.inc(19586);iFieldFormatters = fieldFormatters;
            __CLR4_4_1eomeomlgchor6o.R.inc(19587);iPrefix = prefix;
            __CLR4_4_1eomeomlgchor6o.R.inc(19588);iSuffix = suffix;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        FieldFormatter(FieldFormatter field, PeriodFieldAffix suffix) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19589);
            __CLR4_4_1eomeomlgchor6o.R.inc(19590);iMinPrintedDigits = field.iMinPrintedDigits;
            __CLR4_4_1eomeomlgchor6o.R.inc(19591);iPrintZeroSetting = field.iPrintZeroSetting;
            __CLR4_4_1eomeomlgchor6o.R.inc(19592);iMaxParsedDigits = field.iMaxParsedDigits;
            __CLR4_4_1eomeomlgchor6o.R.inc(19593);iRejectSignedValues = field.iRejectSignedValues;
            __CLR4_4_1eomeomlgchor6o.R.inc(19594);iFieldType = field.iFieldType;
            __CLR4_4_1eomeomlgchor6o.R.inc(19595);iFieldFormatters = field.iFieldFormatters;
            __CLR4_4_1eomeomlgchor6o.R.inc(19596);iPrefix = field.iPrefix;
            __CLR4_4_1eomeomlgchor6o.R.inc(19597);if ((((field.iSuffix != null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19598)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19599)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19600);suffix = new CompositeAffix(field.iSuffix, suffix);
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(19601);iSuffix = suffix;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public void finish(FieldFormatter[] fieldFormatters) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19602);
            // find all other affixes that are in use
            __CLR4_4_1eomeomlgchor6o.R.inc(19603);Set<PeriodFieldAffix> prefixesToIgnore = new HashSet<PeriodFieldAffix>();
            __CLR4_4_1eomeomlgchor6o.R.inc(19604);Set<PeriodFieldAffix> suffixesToIgnore = new HashSet<PeriodFieldAffix>();
            __CLR4_4_1eomeomlgchor6o.R.inc(19605);for (FieldFormatter fieldFormatter : fieldFormatters) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19606);if ((((fieldFormatter != null && !this.equals(fieldFormatter))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19607)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19608)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19609);prefixesToIgnore.add(fieldFormatter.iPrefix);
                    __CLR4_4_1eomeomlgchor6o.R.inc(19610);suffixesToIgnore.add(fieldFormatter.iSuffix);
                }
            }}
            // if we have a prefix then allow ignore behaviour
            }__CLR4_4_1eomeomlgchor6o.R.inc(19611);if ((((iPrefix != null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19612)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19613)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19614);iPrefix.finish(prefixesToIgnore);
            }
            // if we have a suffix then allow ignore behaviour
            }__CLR4_4_1eomeomlgchor6o.R.inc(19615);if ((((iSuffix != null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19616)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19617)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19618);iSuffix.finish(suffixesToIgnore);
            }
        }}finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int countFieldsToPrint(ReadablePeriod period, int stopAt, Locale locale) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19619);
            __CLR4_4_1eomeomlgchor6o.R.inc(19620);if ((((stopAt <= 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19621)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19622)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19623);return 0;
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(19624);if ((((iPrintZeroSetting == PRINT_ZERO_ALWAYS || getFieldValue(period) != Long.MAX_VALUE)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19625)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19626)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19627);return 1;
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(19628);return 0;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int calculatePrintedLength(ReadablePeriod period, Locale locale) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19629);
            __CLR4_4_1eomeomlgchor6o.R.inc(19630);long valueLong = getFieldValue(period);
            __CLR4_4_1eomeomlgchor6o.R.inc(19631);if ((((valueLong == Long.MAX_VALUE)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19632)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19633)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19634);return 0;
            }

            }__CLR4_4_1eomeomlgchor6o.R.inc(19635);int sum = Math.max(FormatUtils.calculateDigitCount(valueLong), iMinPrintedDigits);
            __CLR4_4_1eomeomlgchor6o.R.inc(19636);if ((((iFieldType >= SECONDS_MILLIS)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19637)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19638)==0&false))) {{
                // valueLong contains the seconds and millis fields
                // the minimum output is 0.000, which is 4 or 5 digits with a negative
                __CLR4_4_1eomeomlgchor6o.R.inc(19639);sum = ((((valueLong < 0 )&&(__CLR4_4_1eomeomlgchor6o.R.iget(19640)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19641)==0&false))? Math.max(sum, 5) : Math.max(sum, 4));
                // plus one for the decimal point
                __CLR4_4_1eomeomlgchor6o.R.inc(19642);sum++;
                __CLR4_4_1eomeomlgchor6o.R.inc(19643);if ((((iFieldType == SECONDS_OPTIONAL_MILLIS &&
                        (Math.abs(valueLong) % DateTimeConstants.MILLIS_PER_SECOND) == 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19644)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19645)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19646);sum -= 4; // remove three digits and decimal point
                }
                // reset valueLong to refer to the seconds part for the prefic/suffix calculation
                }__CLR4_4_1eomeomlgchor6o.R.inc(19647);valueLong = valueLong / DateTimeConstants.MILLIS_PER_SECOND;
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(19648);int value = (int) valueLong;

            __CLR4_4_1eomeomlgchor6o.R.inc(19649);if ((((iPrefix != null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19650)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19651)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19652);sum += iPrefix.calculatePrintedLength(value);
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(19653);if ((((iSuffix != null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19654)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19655)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19656);sum += iSuffix.calculatePrintedLength(value);
            }

            }__CLR4_4_1eomeomlgchor6o.R.inc(19657);return sum;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public void printTo(StringBuffer buf, ReadablePeriod period, Locale locale) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19658);
            __CLR4_4_1eomeomlgchor6o.R.inc(19659);long valueLong = getFieldValue(period);
            __CLR4_4_1eomeomlgchor6o.R.inc(19660);if ((((valueLong == Long.MAX_VALUE)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19661)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19662)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19663);return;
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(19664);int value = (int) valueLong;
            __CLR4_4_1eomeomlgchor6o.R.inc(19665);if ((((iFieldType >= SECONDS_MILLIS)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19666)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19667)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19668);value = (int) (valueLong / DateTimeConstants.MILLIS_PER_SECOND);
            }

            }__CLR4_4_1eomeomlgchor6o.R.inc(19669);if ((((iPrefix != null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19670)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19671)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19672);iPrefix.printTo(buf, value);
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(19673);int bufLen = buf.length();
            __CLR4_4_1eomeomlgchor6o.R.inc(19674);int minDigits = iMinPrintedDigits;
            __CLR4_4_1eomeomlgchor6o.R.inc(19675);if ((((minDigits <= 1)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19676)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19677)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19678);FormatUtils.appendUnpaddedInteger(buf, value);
            } }else {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19679);FormatUtils.appendPaddedInteger(buf, value, minDigits);
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(19680);if ((((iFieldType >= SECONDS_MILLIS)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19681)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19682)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19683);int dp = (int) (Math.abs(valueLong) % DateTimeConstants.MILLIS_PER_SECOND);
                __CLR4_4_1eomeomlgchor6o.R.inc(19684);if ((((iFieldType == SECONDS_MILLIS || dp > 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19685)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19686)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19687);if ((((valueLong < 0 && valueLong > -DateTimeConstants.MILLIS_PER_SECOND)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19688)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19689)==0&false))) {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(19690);buf.insert(bufLen, '-');
                    }
                    }__CLR4_4_1eomeomlgchor6o.R.inc(19691);buf.append('.');
                    __CLR4_4_1eomeomlgchor6o.R.inc(19692);FormatUtils.appendPaddedInteger(buf, dp, 3);
                }
            }}
            }__CLR4_4_1eomeomlgchor6o.R.inc(19693);if ((((iSuffix != null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19694)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19695)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19696);iSuffix.printTo(buf, value);
            }
        }}finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public void printTo(Writer out, ReadablePeriod period, Locale locale) throws IOException {try{__CLR4_4_1eomeomlgchor6o.R.inc(19697);
            __CLR4_4_1eomeomlgchor6o.R.inc(19698);long valueLong = getFieldValue(period);
            __CLR4_4_1eomeomlgchor6o.R.inc(19699);if ((((valueLong == Long.MAX_VALUE)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19700)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19701)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19702);return;
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(19703);int value = (int) valueLong;
            __CLR4_4_1eomeomlgchor6o.R.inc(19704);if ((((iFieldType >= SECONDS_MILLIS)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19705)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19706)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19707);value = (int) (valueLong / DateTimeConstants.MILLIS_PER_SECOND);
            }

            }__CLR4_4_1eomeomlgchor6o.R.inc(19708);if ((((iPrefix != null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19709)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19710)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19711);iPrefix.printTo(out, value);
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(19712);int minDigits = iMinPrintedDigits;
            __CLR4_4_1eomeomlgchor6o.R.inc(19713);if ((((minDigits <= 1)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19714)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19715)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19716);FormatUtils.writeUnpaddedInteger(out, value);
            } }else {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19717);FormatUtils.writePaddedInteger(out, value, minDigits);
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(19718);if ((((iFieldType >= SECONDS_MILLIS)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19719)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19720)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19721);int dp = (int) (Math.abs(valueLong) % DateTimeConstants.MILLIS_PER_SECOND);
                __CLR4_4_1eomeomlgchor6o.R.inc(19722);if ((((iFieldType == SECONDS_MILLIS || dp > 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19723)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19724)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19725);out.write('.');
                    __CLR4_4_1eomeomlgchor6o.R.inc(19726);FormatUtils.writePaddedInteger(out, dp, 3);
                }
            }}
            }__CLR4_4_1eomeomlgchor6o.R.inc(19727);if ((((iSuffix != null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19728)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19729)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19730);iSuffix.printTo(out, value);
            }
        }}finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int parseInto(
                ReadWritablePeriod period, String text,
                int position, Locale locale) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19731);

            __CLR4_4_1eomeomlgchor6o.R.inc(19732);boolean mustParse = (iPrintZeroSetting == PRINT_ZERO_ALWAYS);

            // Shortcut test.
            __CLR4_4_1eomeomlgchor6o.R.inc(19733);if ((((position >= text.length())&&(__CLR4_4_1eomeomlgchor6o.R.iget(19734)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19735)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19736);return (((mustParse )&&(__CLR4_4_1eomeomlgchor6o.R.iget(19737)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19738)==0&false))? ~position : position;
            }

            }__CLR4_4_1eomeomlgchor6o.R.inc(19739);if ((((iPrefix != null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19740)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19741)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19742);position = iPrefix.parse(text, position);
                __CLR4_4_1eomeomlgchor6o.R.inc(19743);if ((((position >= 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19744)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19745)==0&false))) {{
                    // If prefix is found, then the parse must finish.
                    __CLR4_4_1eomeomlgchor6o.R.inc(19746);mustParse = true;
                } }else {{
                    // Prefix not found, so bail.
                    __CLR4_4_1eomeomlgchor6o.R.inc(19747);if ((((!mustParse)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19748)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19749)==0&false))) {{
                        // It's okay because parsing of this field is not
                        // required. Don't return an error. Fields down the
                        // chain can continue on, trying to parse.
                        __CLR4_4_1eomeomlgchor6o.R.inc(19750);return ~position;
                    }
                    }__CLR4_4_1eomeomlgchor6o.R.inc(19751);return position;
                }
            }}

            }__CLR4_4_1eomeomlgchor6o.R.inc(19752);int suffixPos = -1;
            __CLR4_4_1eomeomlgchor6o.R.inc(19753);if ((((iSuffix != null && !mustParse)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19754)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19755)==0&false))) {{
                // Pre-scan the suffix, to help determine if this field must be
                // parsed.
                __CLR4_4_1eomeomlgchor6o.R.inc(19756);suffixPos = iSuffix.scan(text, position);
                __CLR4_4_1eomeomlgchor6o.R.inc(19757);if ((((suffixPos >= 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19758)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19759)==0&false))) {{
                    // If suffix is found, then parse must finish.
                    __CLR4_4_1eomeomlgchor6o.R.inc(19760);mustParse = true;
                } }else {{
                    // Suffix not found, so bail.
                    __CLR4_4_1eomeomlgchor6o.R.inc(19761);if ((((!mustParse)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19762)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19763)==0&false))) {{
                        // It's okay because parsing of this field is not
                        // required. Don't return an error. Fields down the
                        // chain can continue on, trying to parse.
                        __CLR4_4_1eomeomlgchor6o.R.inc(19764);return ~suffixPos;
                    }
                    }__CLR4_4_1eomeomlgchor6o.R.inc(19765);return suffixPos;
                }
            }}

            }__CLR4_4_1eomeomlgchor6o.R.inc(19766);if ((((!mustParse && !isSupported(period.getPeriodType(), iFieldType))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19767)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19768)==0&false))) {{
                // If parsing is not required and the field is not supported,
                // exit gracefully so that another parser can continue on.
                __CLR4_4_1eomeomlgchor6o.R.inc(19769);return position;
            }

            }__CLR4_4_1eomeomlgchor6o.R.inc(19770);int limit;
            __CLR4_4_1eomeomlgchor6o.R.inc(19771);if ((((suffixPos > 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19772)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19773)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19774);limit = Math.min(iMaxParsedDigits, suffixPos - position);
            } }else {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19775);limit = Math.min(iMaxParsedDigits, text.length() - position);
            }

            // validate input number
            }__CLR4_4_1eomeomlgchor6o.R.inc(19776);int length = 0;
            __CLR4_4_1eomeomlgchor6o.R.inc(19777);int fractPos = -1;
            __CLR4_4_1eomeomlgchor6o.R.inc(19778);boolean hasDigits = false;
            __CLR4_4_1eomeomlgchor6o.R.inc(19779);boolean negative = false;
            __CLR4_4_1eomeomlgchor6o.R.inc(19780);while ((((length < limit)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19781)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19782)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19783);char c = text.charAt(position + length);
                // leading sign
                __CLR4_4_1eomeomlgchor6o.R.inc(19784);if ((((length == 0 && (c == '-' || c == '+') && !iRejectSignedValues)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19785)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19786)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19787);negative = c == '-';

                    // Next character must be a digit.
                    __CLR4_4_1eomeomlgchor6o.R.inc(19788);if (length + 1 >= limit ||
                            (c = text.charAt(position + length + 1)) < '0' || c > '9') {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(19791);break;
                    }

                    }__CLR4_4_1eomeomlgchor6o.R.inc(19792);if ((((negative)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19793)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19794)==0&false))) {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(19795);length++;
                    } }else {{
                        // Skip the '+' for parseInt to succeed.
                        __CLR4_4_1eomeomlgchor6o.R.inc(19796);position++;
                    }
                    // Expand the limit to disregard the sign character.
                    }__CLR4_4_1eomeomlgchor6o.R.inc(19797);limit = Math.min(limit + 1, text.length() - position);
                    __CLR4_4_1eomeomlgchor6o.R.inc(19798);continue;
                }
                // main number
                }__CLR4_4_1eomeomlgchor6o.R.inc(19799);if ((((c >= '0' && c <= '9')&&(__CLR4_4_1eomeomlgchor6o.R.iget(19800)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19801)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19802);hasDigits = true;
                } }else {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19803);if (((((c == '.' || c == ',')
                            && (iFieldType == SECONDS_MILLIS || iFieldType == SECONDS_OPTIONAL_MILLIS))&&(__CLR4_4_1eomeomlgchor6o.R.iget(19804)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19805)==0&false))) {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(19806);if ((((fractPos >= 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19807)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19808)==0&false))) {{
                            // can't have two decimals
                            __CLR4_4_1eomeomlgchor6o.R.inc(19809);break;
                        }
                        }__CLR4_4_1eomeomlgchor6o.R.inc(19810);fractPos = position + length + 1;
                        // Expand the limit to disregard the decimal point.
                        __CLR4_4_1eomeomlgchor6o.R.inc(19811);limit = Math.min(limit + 1, text.length() - position);
                    } }else {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(19812);break;
                    }
                }}
                }__CLR4_4_1eomeomlgchor6o.R.inc(19813);length++;
            }

            }__CLR4_4_1eomeomlgchor6o.R.inc(19814);if ((((!hasDigits)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19815)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19816)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19817);return ~position;
            }

            }__CLR4_4_1eomeomlgchor6o.R.inc(19818);if ((((suffixPos >= 0 && position + length != suffixPos)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19819)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19820)==0&false))) {{
                // If there are additional non-digit characters before the
                // suffix is reached, then assume that the suffix found belongs
                // to a field not yet reached. Return original position so that
                // another parser can continue on.
                __CLR4_4_1eomeomlgchor6o.R.inc(19821);return position;
            }

            }__CLR4_4_1eomeomlgchor6o.R.inc(19822);if ((((iFieldType != SECONDS_MILLIS && iFieldType != SECONDS_OPTIONAL_MILLIS)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19823)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19824)==0&false))) {{
                // Handle common case.
                __CLR4_4_1eomeomlgchor6o.R.inc(19825);setFieldValue(period, iFieldType, parseInt(text, position, length));
            } }else {__CLR4_4_1eomeomlgchor6o.R.inc(19826);if ((((fractPos < 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19827)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19828)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19829);setFieldValue(period, SECONDS, parseInt(text, position, length));
                __CLR4_4_1eomeomlgchor6o.R.inc(19830);setFieldValue(period, MILLIS, 0);
            } }else {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19831);int wholeValue = parseInt(text, position, fractPos - position - 1);
                __CLR4_4_1eomeomlgchor6o.R.inc(19832);setFieldValue(period, SECONDS, wholeValue);

                __CLR4_4_1eomeomlgchor6o.R.inc(19833);int fractLen = position + length - fractPos;
                __CLR4_4_1eomeomlgchor6o.R.inc(19834);int fractValue;
                __CLR4_4_1eomeomlgchor6o.R.inc(19835);if ((((fractLen <= 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19836)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19837)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19838);fractValue = 0;
                } }else {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19839);if ((((fractLen >= 3)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19840)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19841)==0&false))) {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(19842);fractValue = parseInt(text, fractPos, 3);
                    } }else {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(19843);fractValue = parseInt(text, fractPos, fractLen);
                        __CLR4_4_1eomeomlgchor6o.R.inc(19844);if ((((fractLen == 1)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19845)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19846)==0&false))) {{
                            __CLR4_4_1eomeomlgchor6o.R.inc(19847);fractValue *= 100;
                        } }else {{
                            __CLR4_4_1eomeomlgchor6o.R.inc(19848);fractValue *= 10;
                        }
                    }}
                    }__CLR4_4_1eomeomlgchor6o.R.inc(19849);if ((((negative || wholeValue < 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19850)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19851)==0&false))) {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(19852);fractValue = -fractValue;
                    }
                }}

                }__CLR4_4_1eomeomlgchor6o.R.inc(19853);setFieldValue(period, MILLIS, fractValue);
            }

            }}__CLR4_4_1eomeomlgchor6o.R.inc(19854);position += length;

            __CLR4_4_1eomeomlgchor6o.R.inc(19855);if ((((position >= 0 && iSuffix != null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19856)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19857)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19858);position = iSuffix.parse(text, position);
            }

            }__CLR4_4_1eomeomlgchor6o.R.inc(19859);return position;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        /**
         * @param text     text to parse
         * @param position position in text
         * @param length   exact count of characters to parse
         * @return parsed int value
         */
        private int parseInt(String text, int position, int length) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19860);
            __CLR4_4_1eomeomlgchor6o.R.inc(19861);if ((((length >= 10)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19862)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19863)==0&false))) {{
                // Since value may exceed max, use stock parser which checks for this.
                __CLR4_4_1eomeomlgchor6o.R.inc(19864);return Integer.parseInt(text.substring(position, position + length));
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(19865);if ((((length <= 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19866)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19867)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19868);return 0;
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(19869);int value = text.charAt(position++);
            __CLR4_4_1eomeomlgchor6o.R.inc(19870);length--;
            __CLR4_4_1eomeomlgchor6o.R.inc(19871);boolean negative;
            __CLR4_4_1eomeomlgchor6o.R.inc(19872);if ((((value == '-')&&(__CLR4_4_1eomeomlgchor6o.R.iget(19873)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19874)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19875);if ((((--length < 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19876)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19877)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19878);return 0;
                }
                }__CLR4_4_1eomeomlgchor6o.R.inc(19879);negative = true;
                __CLR4_4_1eomeomlgchor6o.R.inc(19880);value = text.charAt(position++);
            } }else {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19881);negative = false;
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(19882);value -= '0';
            __CLR4_4_1eomeomlgchor6o.R.inc(19883);while ((((length-- > 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19884)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19885)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19886);value = ((value << 3) + (value << 1)) + text.charAt(position++) - '0';
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(19887);return (((negative )&&(__CLR4_4_1eomeomlgchor6o.R.iget(19888)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19889)==0&false))? -value : value;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        /**
         * @return Long.MAX_VALUE if nothing to print, otherwise value
         */
        long getFieldValue(ReadablePeriod period) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19890);
            __CLR4_4_1eomeomlgchor6o.R.inc(19891);PeriodType type;
            __CLR4_4_1eomeomlgchor6o.R.inc(19892);if ((((iPrintZeroSetting == PRINT_ZERO_ALWAYS)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19893)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19894)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19895);type = null; // Don't need to check if supported.
            } }else {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19896);type = period.getPeriodType();
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(19897);if ((((type != null && isSupported(type, iFieldType) == false)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19898)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19899)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19900);return Long.MAX_VALUE;
            }

            }__CLR4_4_1eomeomlgchor6o.R.inc(19901);long value;

            boolean __CLB4_4_1_bool2=false;__CLR4_4_1eomeomlgchor6o.R.inc(19902);switch (iFieldType) {
                default:if (!__CLB4_4_1_bool2) {__CLR4_4_1eomeomlgchor6o.R.inc(19903);__CLB4_4_1_bool2=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(19904);return Long.MAX_VALUE;
                case YEARS:if (!__CLB4_4_1_bool2) {__CLR4_4_1eomeomlgchor6o.R.inc(19905);__CLB4_4_1_bool2=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(19906);value = period.get(DurationFieldType.years());
                    __CLR4_4_1eomeomlgchor6o.R.inc(19907);break;
                case MONTHS:if (!__CLB4_4_1_bool2) {__CLR4_4_1eomeomlgchor6o.R.inc(19908);__CLB4_4_1_bool2=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(19909);value = period.get(DurationFieldType.months());
                    __CLR4_4_1eomeomlgchor6o.R.inc(19910);break;
                case WEEKS:if (!__CLB4_4_1_bool2) {__CLR4_4_1eomeomlgchor6o.R.inc(19911);__CLB4_4_1_bool2=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(19912);value = period.get(DurationFieldType.weeks());
                    __CLR4_4_1eomeomlgchor6o.R.inc(19913);break;
                case DAYS:if (!__CLB4_4_1_bool2) {__CLR4_4_1eomeomlgchor6o.R.inc(19914);__CLB4_4_1_bool2=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(19915);value = period.get(DurationFieldType.days());
                    __CLR4_4_1eomeomlgchor6o.R.inc(19916);break;
                case HOURS:if (!__CLB4_4_1_bool2) {__CLR4_4_1eomeomlgchor6o.R.inc(19917);__CLB4_4_1_bool2=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(19918);value = period.get(DurationFieldType.hours());
                    __CLR4_4_1eomeomlgchor6o.R.inc(19919);break;
                case MINUTES:if (!__CLB4_4_1_bool2) {__CLR4_4_1eomeomlgchor6o.R.inc(19920);__CLB4_4_1_bool2=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(19921);value = period.get(DurationFieldType.minutes());
                    __CLR4_4_1eomeomlgchor6o.R.inc(19922);break;
                case SECONDS:if (!__CLB4_4_1_bool2) {__CLR4_4_1eomeomlgchor6o.R.inc(19923);__CLB4_4_1_bool2=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(19924);value = period.get(DurationFieldType.seconds());
                    __CLR4_4_1eomeomlgchor6o.R.inc(19925);break;
                case MILLIS:if (!__CLB4_4_1_bool2) {__CLR4_4_1eomeomlgchor6o.R.inc(19926);__CLB4_4_1_bool2=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(19927);value = period.get(DurationFieldType.millis());
                    __CLR4_4_1eomeomlgchor6o.R.inc(19928);break;
                case SECONDS_MILLIS:if (!__CLB4_4_1_bool2) {__CLR4_4_1eomeomlgchor6o.R.inc(19929);__CLB4_4_1_bool2=true;} // drop through
                case SECONDS_OPTIONAL_MILLIS:if (!__CLB4_4_1_bool2) {__CLR4_4_1eomeomlgchor6o.R.inc(19930);__CLB4_4_1_bool2=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(19931);int seconds = period.get(DurationFieldType.seconds());
                    __CLR4_4_1eomeomlgchor6o.R.inc(19932);int millis = period.get(DurationFieldType.millis());
                    __CLR4_4_1eomeomlgchor6o.R.inc(19933);value = (seconds * (long) DateTimeConstants.MILLIS_PER_SECOND) + millis;
                    __CLR4_4_1eomeomlgchor6o.R.inc(19934);break;
            }

            // determine if period is zero and this is the last field
            __CLR4_4_1eomeomlgchor6o.R.inc(19935);if ((((value == 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19936)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19937)==0&false))) {{
                boolean __CLB4_4_1_bool3=false;__CLR4_4_1eomeomlgchor6o.R.inc(19938);switch (iPrintZeroSetting) {
                    case PRINT_ZERO_NEVER:if (!__CLB4_4_1_bool3) {__CLR4_4_1eomeomlgchor6o.R.inc(19939);__CLB4_4_1_bool3=true;}
                        __CLR4_4_1eomeomlgchor6o.R.inc(19940);return Long.MAX_VALUE;
                    case PRINT_ZERO_RARELY_LAST:if (!__CLB4_4_1_bool3) {__CLR4_4_1eomeomlgchor6o.R.inc(19941);__CLB4_4_1_bool3=true;}
                        __CLR4_4_1eomeomlgchor6o.R.inc(19942);if ((((isZero(period) && iFieldFormatters[iFieldType] == this)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19943)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19944)==0&false))) {{
                            __CLR4_4_1eomeomlgchor6o.R.inc(19945);for (int i = iFieldType + 1; (((i <= MAX_FIELD)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19946)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19947)==0&false)); i++) {{
                                __CLR4_4_1eomeomlgchor6o.R.inc(19948);if ((((isSupported(type, i) && iFieldFormatters[i] != null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19949)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19950)==0&false))) {{
                                    __CLR4_4_1eomeomlgchor6o.R.inc(19951);return Long.MAX_VALUE;
                                }
                            }}
                        }} }else {{
                            __CLR4_4_1eomeomlgchor6o.R.inc(19952);return Long.MAX_VALUE;
                        }
                        }__CLR4_4_1eomeomlgchor6o.R.inc(19953);break;
                    case PRINT_ZERO_RARELY_FIRST:if (!__CLB4_4_1_bool3) {__CLR4_4_1eomeomlgchor6o.R.inc(19954);__CLB4_4_1_bool3=true;}
                        __CLR4_4_1eomeomlgchor6o.R.inc(19955);if ((((isZero(period) && iFieldFormatters[iFieldType] == this)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19956)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19957)==0&false))) {{
                            __CLR4_4_1eomeomlgchor6o.R.inc(19958);int i = Math.min(iFieldType, 8);  // line split out for IBM JDK
                            __CLR4_4_1eomeomlgchor6o.R.inc(19959);i--;                              // see bug 1660490
                            __CLR4_4_1eomeomlgchor6o.R.inc(19960);for (; (((i >= 0 && i <= MAX_FIELD)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19961)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19962)==0&false)); i--) {{
                                __CLR4_4_1eomeomlgchor6o.R.inc(19963);if ((((isSupported(type, i) && iFieldFormatters[i] != null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19964)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19965)==0&false))) {{
                                    __CLR4_4_1eomeomlgchor6o.R.inc(19966);return Long.MAX_VALUE;
                                }
                            }}
                        }} }else {{
                            __CLR4_4_1eomeomlgchor6o.R.inc(19967);return Long.MAX_VALUE;
                        }
                        }__CLR4_4_1eomeomlgchor6o.R.inc(19968);break;
                }
            }

            }__CLR4_4_1eomeomlgchor6o.R.inc(19969);return value;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        boolean isZero(ReadablePeriod period) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19970);
            __CLR4_4_1eomeomlgchor6o.R.inc(19971);for (int i = 0, isize = period.size(); (((i < isize)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19972)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19973)==0&false)); i++) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(19974);if ((((period.getValue(i) != 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(19975)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(19976)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(19977);return false;
                }
            }}
            }__CLR4_4_1eomeomlgchor6o.R.inc(19978);return true;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        boolean isSupported(PeriodType type, int field) {try{__CLR4_4_1eomeomlgchor6o.R.inc(19979);
            boolean __CLB4_4_1_bool4=false;__CLR4_4_1eomeomlgchor6o.R.inc(19980);switch (field) {
                default:if (!__CLB4_4_1_bool4) {__CLR4_4_1eomeomlgchor6o.R.inc(19981);__CLB4_4_1_bool4=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(19982);return false;
                case YEARS:if (!__CLB4_4_1_bool4) {__CLR4_4_1eomeomlgchor6o.R.inc(19983);__CLB4_4_1_bool4=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(19984);return type.isSupported(DurationFieldType.years());
                case MONTHS:if (!__CLB4_4_1_bool4) {__CLR4_4_1eomeomlgchor6o.R.inc(19985);__CLB4_4_1_bool4=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(19986);return type.isSupported(DurationFieldType.months());
                case WEEKS:if (!__CLB4_4_1_bool4) {__CLR4_4_1eomeomlgchor6o.R.inc(19987);__CLB4_4_1_bool4=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(19988);return type.isSupported(DurationFieldType.weeks());
                case DAYS:if (!__CLB4_4_1_bool4) {__CLR4_4_1eomeomlgchor6o.R.inc(19989);__CLB4_4_1_bool4=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(19990);return type.isSupported(DurationFieldType.days());
                case HOURS:if (!__CLB4_4_1_bool4) {__CLR4_4_1eomeomlgchor6o.R.inc(19991);__CLB4_4_1_bool4=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(19992);return type.isSupported(DurationFieldType.hours());
                case MINUTES:if (!__CLB4_4_1_bool4) {__CLR4_4_1eomeomlgchor6o.R.inc(19993);__CLB4_4_1_bool4=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(19994);return type.isSupported(DurationFieldType.minutes());
                case SECONDS:if (!__CLB4_4_1_bool4) {__CLR4_4_1eomeomlgchor6o.R.inc(19995);__CLB4_4_1_bool4=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(19996);return type.isSupported(DurationFieldType.seconds());
                case MILLIS:if (!__CLB4_4_1_bool4) {__CLR4_4_1eomeomlgchor6o.R.inc(19997);__CLB4_4_1_bool4=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(19998);return type.isSupported(DurationFieldType.millis());
                case SECONDS_MILLIS:if (!__CLB4_4_1_bool4) {__CLR4_4_1eomeomlgchor6o.R.inc(19999);__CLB4_4_1_bool4=true;} // drop through
                case SECONDS_OPTIONAL_MILLIS:if (!__CLB4_4_1_bool4) {__CLR4_4_1eomeomlgchor6o.R.inc(20000);__CLB4_4_1_bool4=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(20001);return type.isSupported(DurationFieldType.seconds()) ||
                            type.isSupported(DurationFieldType.millis());
            }
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        void setFieldValue(ReadWritablePeriod period, int field, int value) {try{__CLR4_4_1eomeomlgchor6o.R.inc(20002);
            boolean __CLB4_4_1_bool5=false;__CLR4_4_1eomeomlgchor6o.R.inc(20003);switch (field) {
                default:if (!__CLB4_4_1_bool5) {__CLR4_4_1eomeomlgchor6o.R.inc(20004);__CLB4_4_1_bool5=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(20005);break;
                case YEARS:if (!__CLB4_4_1_bool5) {__CLR4_4_1eomeomlgchor6o.R.inc(20006);__CLB4_4_1_bool5=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(20007);period.setYears(value);
                    __CLR4_4_1eomeomlgchor6o.R.inc(20008);break;
                case MONTHS:if (!__CLB4_4_1_bool5) {__CLR4_4_1eomeomlgchor6o.R.inc(20009);__CLB4_4_1_bool5=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(20010);period.setMonths(value);
                    __CLR4_4_1eomeomlgchor6o.R.inc(20011);break;
                case WEEKS:if (!__CLB4_4_1_bool5) {__CLR4_4_1eomeomlgchor6o.R.inc(20012);__CLB4_4_1_bool5=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(20013);period.setWeeks(value);
                    __CLR4_4_1eomeomlgchor6o.R.inc(20014);break;
                case DAYS:if (!__CLB4_4_1_bool5) {__CLR4_4_1eomeomlgchor6o.R.inc(20015);__CLB4_4_1_bool5=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(20016);period.setDays(value);
                    __CLR4_4_1eomeomlgchor6o.R.inc(20017);break;
                case HOURS:if (!__CLB4_4_1_bool5) {__CLR4_4_1eomeomlgchor6o.R.inc(20018);__CLB4_4_1_bool5=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(20019);period.setHours(value);
                    __CLR4_4_1eomeomlgchor6o.R.inc(20020);break;
                case MINUTES:if (!__CLB4_4_1_bool5) {__CLR4_4_1eomeomlgchor6o.R.inc(20021);__CLB4_4_1_bool5=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(20022);period.setMinutes(value);
                    __CLR4_4_1eomeomlgchor6o.R.inc(20023);break;
                case SECONDS:if (!__CLB4_4_1_bool5) {__CLR4_4_1eomeomlgchor6o.R.inc(20024);__CLB4_4_1_bool5=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(20025);period.setSeconds(value);
                    __CLR4_4_1eomeomlgchor6o.R.inc(20026);break;
                case MILLIS:if (!__CLB4_4_1_bool5) {__CLR4_4_1eomeomlgchor6o.R.inc(20027);__CLB4_4_1_bool5=true;}
                    __CLR4_4_1eomeomlgchor6o.R.inc(20028);period.setMillis(value);
                    __CLR4_4_1eomeomlgchor6o.R.inc(20029);break;
            }
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        int getFieldType() {try{__CLR4_4_1eomeomlgchor6o.R.inc(20030);
            __CLR4_4_1eomeomlgchor6o.R.inc(20031);return iFieldType;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------

    /**
     * Handles a simple literal piece of text.
     */
    static class Literal
            implements PeriodPrinter, PeriodParser {
        static final Literal EMPTY = new Literal("");
        private final String iText;

        Literal(String text) {try{__CLR4_4_1eomeomlgchor6o.R.inc(20032);
            __CLR4_4_1eomeomlgchor6o.R.inc(20033);iText = text;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int countFieldsToPrint(ReadablePeriod period, int stopAt, Locale locale) {try{__CLR4_4_1eomeomlgchor6o.R.inc(20034);
            __CLR4_4_1eomeomlgchor6o.R.inc(20035);return 0;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int calculatePrintedLength(ReadablePeriod period, Locale locale) {try{__CLR4_4_1eomeomlgchor6o.R.inc(20036);
            __CLR4_4_1eomeomlgchor6o.R.inc(20037);return iText.length();
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public void printTo(StringBuffer buf, ReadablePeriod period, Locale locale) {try{__CLR4_4_1eomeomlgchor6o.R.inc(20038);
            __CLR4_4_1eomeomlgchor6o.R.inc(20039);buf.append(iText);
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public void printTo(Writer out, ReadablePeriod period, Locale locale) throws IOException {try{__CLR4_4_1eomeomlgchor6o.R.inc(20040);
            __CLR4_4_1eomeomlgchor6o.R.inc(20041);out.write(iText);
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int parseInto(
                ReadWritablePeriod period, String periodStr,
                int position, Locale locale) {try{__CLR4_4_1eomeomlgchor6o.R.inc(20042);
            __CLR4_4_1eomeomlgchor6o.R.inc(20043);if ((((periodStr.regionMatches(true, position, iText, 0, iText.length()))&&(__CLR4_4_1eomeomlgchor6o.R.iget(20044)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20045)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(20046);return position + iText.length();
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(20047);return ~position;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------

    /**
     * Handles a separator, that splits the fields into multiple parts.
     * For example, the 'T' in the ISO8601 standard.
     */
    static class Separator
            implements PeriodPrinter, PeriodParser {
        private final String iText;
        private final String iFinalText;
        private final String[] iParsedForms;

        private final boolean iUseBefore;
        private final boolean iUseAfter;

        private final PeriodPrinter iBeforePrinter;
        private volatile PeriodPrinter iAfterPrinter;
        private final PeriodParser iBeforeParser;
        private volatile PeriodParser iAfterParser;

        Separator(String text, String finalText, String[] variants,
                  PeriodPrinter beforePrinter, PeriodParser beforeParser,
                  boolean useBefore, boolean useAfter) {try{__CLR4_4_1eomeomlgchor6o.R.inc(20048);
            __CLR4_4_1eomeomlgchor6o.R.inc(20049);iText = text;
            __CLR4_4_1eomeomlgchor6o.R.inc(20050);iFinalText = finalText;

            __CLR4_4_1eomeomlgchor6o.R.inc(20051);if (((((finalText == null || text.equals(finalText)) &&
                    (variants == null || variants.length == 0))&&(__CLR4_4_1eomeomlgchor6o.R.iget(20052)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20053)==0&false))) {{

                __CLR4_4_1eomeomlgchor6o.R.inc(20054);iParsedForms = new String[]{text};
            } }else {{
                // Filter and reverse sort the parsed forms.
                __CLR4_4_1eomeomlgchor6o.R.inc(20055);TreeSet<String> parsedSet = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
                __CLR4_4_1eomeomlgchor6o.R.inc(20056);parsedSet.add(text);
                __CLR4_4_1eomeomlgchor6o.R.inc(20057);parsedSet.add(finalText);
                __CLR4_4_1eomeomlgchor6o.R.inc(20058);if ((((variants != null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20059)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20060)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(20061);for (int i = variants.length; (((--i >= 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20062)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20063)==0&false)); ) {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(20064);parsedSet.add(variants[i]);
                    }
                }}
                }__CLR4_4_1eomeomlgchor6o.R.inc(20065);ArrayList<String> parsedList = new ArrayList<String>(parsedSet);
                __CLR4_4_1eomeomlgchor6o.R.inc(20066);Collections.reverse(parsedList);
                __CLR4_4_1eomeomlgchor6o.R.inc(20067);iParsedForms = parsedList.toArray(new String[parsedList.size()]);
            }

            }__CLR4_4_1eomeomlgchor6o.R.inc(20068);iBeforePrinter = beforePrinter;
            __CLR4_4_1eomeomlgchor6o.R.inc(20069);iBeforeParser = beforeParser;
            __CLR4_4_1eomeomlgchor6o.R.inc(20070);iUseBefore = useBefore;
            __CLR4_4_1eomeomlgchor6o.R.inc(20071);iUseAfter = useAfter;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int countFieldsToPrint(ReadablePeriod period, int stopAt, Locale locale) {try{__CLR4_4_1eomeomlgchor6o.R.inc(20072);
            __CLR4_4_1eomeomlgchor6o.R.inc(20073);int sum = iBeforePrinter.countFieldsToPrint(period, stopAt, locale);
            __CLR4_4_1eomeomlgchor6o.R.inc(20074);if ((((sum < stopAt)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20075)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20076)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(20077);sum += iAfterPrinter.countFieldsToPrint(period, stopAt, locale);
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(20078);return sum;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int calculatePrintedLength(ReadablePeriod period, Locale locale) {try{__CLR4_4_1eomeomlgchor6o.R.inc(20079);
            __CLR4_4_1eomeomlgchor6o.R.inc(20080);PeriodPrinter before = iBeforePrinter;
            __CLR4_4_1eomeomlgchor6o.R.inc(20081);PeriodPrinter after = iAfterPrinter;

            __CLR4_4_1eomeomlgchor6o.R.inc(20082);int sum = before.calculatePrintedLength(period, locale)
                    + after.calculatePrintedLength(period, locale);

            __CLR4_4_1eomeomlgchor6o.R.inc(20083);if ((((iUseBefore)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20084)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20085)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(20086);if ((((before.countFieldsToPrint(period, 1, locale) > 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20087)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20088)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(20089);if ((((iUseAfter)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20090)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20091)==0&false))) {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(20092);int afterCount = after.countFieldsToPrint(period, 2, locale);
                        __CLR4_4_1eomeomlgchor6o.R.inc(20093);if ((((afterCount > 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20094)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20095)==0&false))) {{
                            __CLR4_4_1eomeomlgchor6o.R.inc(20096);sum += ((((afterCount > 1 )&&(__CLR4_4_1eomeomlgchor6o.R.iget(20097)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20098)==0&false))? iText : iFinalText).length();
                        }
                    }} }else {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(20099);sum += iText.length();
                    }
                }}
            }} }else {__CLR4_4_1eomeomlgchor6o.R.inc(20100);if ((((iUseAfter && after.countFieldsToPrint(period, 1, locale) > 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20101)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20102)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(20103);sum += iText.length();
            }

            }}__CLR4_4_1eomeomlgchor6o.R.inc(20104);return sum;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public void printTo(StringBuffer buf, ReadablePeriod period, Locale locale) {try{__CLR4_4_1eomeomlgchor6o.R.inc(20105);
            __CLR4_4_1eomeomlgchor6o.R.inc(20106);PeriodPrinter before = iBeforePrinter;
            __CLR4_4_1eomeomlgchor6o.R.inc(20107);PeriodPrinter after = iAfterPrinter;

            __CLR4_4_1eomeomlgchor6o.R.inc(20108);before.printTo(buf, period, locale);
            __CLR4_4_1eomeomlgchor6o.R.inc(20109);if ((((iUseBefore)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20110)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20111)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(20112);if ((((before.countFieldsToPrint(period, 1, locale) > 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20113)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20114)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(20115);if ((((iUseAfter)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20116)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20117)==0&false))) {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(20118);int afterCount = after.countFieldsToPrint(period, 2, locale);
                        __CLR4_4_1eomeomlgchor6o.R.inc(20119);if ((((afterCount > 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20120)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20121)==0&false))) {{
                            __CLR4_4_1eomeomlgchor6o.R.inc(20122);buf.append((((afterCount > 1 )&&(__CLR4_4_1eomeomlgchor6o.R.iget(20123)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20124)==0&false))? iText : iFinalText);
                        }
                    }} }else {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(20125);buf.append(iText);
                    }
                }}
            }} }else {__CLR4_4_1eomeomlgchor6o.R.inc(20126);if ((((iUseAfter && after.countFieldsToPrint(period, 1, locale) > 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20127)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20128)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(20129);buf.append(iText);
            }
            }}__CLR4_4_1eomeomlgchor6o.R.inc(20130);after.printTo(buf, period, locale);
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public void printTo(Writer out, ReadablePeriod period, Locale locale) throws IOException {try{__CLR4_4_1eomeomlgchor6o.R.inc(20131);
            __CLR4_4_1eomeomlgchor6o.R.inc(20132);PeriodPrinter before = iBeforePrinter;
            __CLR4_4_1eomeomlgchor6o.R.inc(20133);PeriodPrinter after = iAfterPrinter;

            __CLR4_4_1eomeomlgchor6o.R.inc(20134);before.printTo(out, period, locale);
            __CLR4_4_1eomeomlgchor6o.R.inc(20135);if ((((iUseBefore)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20136)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20137)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(20138);if ((((before.countFieldsToPrint(period, 1, locale) > 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20139)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20140)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(20141);if ((((iUseAfter)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20142)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20143)==0&false))) {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(20144);int afterCount = after.countFieldsToPrint(period, 2, locale);
                        __CLR4_4_1eomeomlgchor6o.R.inc(20145);if ((((afterCount > 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20146)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20147)==0&false))) {{
                            __CLR4_4_1eomeomlgchor6o.R.inc(20148);out.write((((afterCount > 1 )&&(__CLR4_4_1eomeomlgchor6o.R.iget(20149)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20150)==0&false))? iText : iFinalText);
                        }
                    }} }else {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(20151);out.write(iText);
                    }
                }}
            }} }else {__CLR4_4_1eomeomlgchor6o.R.inc(20152);if ((((iUseAfter && after.countFieldsToPrint(period, 1, locale) > 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20153)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20154)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(20155);out.write(iText);
            }
            }}__CLR4_4_1eomeomlgchor6o.R.inc(20156);after.printTo(out, period, locale);
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int parseInto(
                ReadWritablePeriod period, String periodStr,
                int position, Locale locale) {try{__CLR4_4_1eomeomlgchor6o.R.inc(20157);
            __CLR4_4_1eomeomlgchor6o.R.inc(20158);int oldPos = position;
            __CLR4_4_1eomeomlgchor6o.R.inc(20159);position = iBeforeParser.parseInto(period, periodStr, position, locale);

            __CLR4_4_1eomeomlgchor6o.R.inc(20160);if ((((position < 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20161)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20162)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(20163);return position;
            }

            }__CLR4_4_1eomeomlgchor6o.R.inc(20164);boolean found = false;
            __CLR4_4_1eomeomlgchor6o.R.inc(20165);int parsedFormLength = -1;
            __CLR4_4_1eomeomlgchor6o.R.inc(20166);if ((((position > oldPos)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20167)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20168)==0&false))) {{
                // Consume this separator.
                __CLR4_4_1eomeomlgchor6o.R.inc(20169);String[] parsedForms = iParsedForms;
                __CLR4_4_1eomeomlgchor6o.R.inc(20170);int length = parsedForms.length;
                __CLR4_4_1eomeomlgchor6o.R.inc(20171);for (int i = 0; (((i < length)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20172)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20173)==0&false)); i++) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(20174);String parsedForm = parsedForms[i];
                    __CLR4_4_1eomeomlgchor6o.R.inc(20175);if (((((parsedForm == null || parsedForm.length() == 0) ||
                            periodStr.regionMatches(true, position, parsedForm, 0, parsedForm.length()))&&(__CLR4_4_1eomeomlgchor6o.R.iget(20176)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20177)==0&false))) {{

                        __CLR4_4_1eomeomlgchor6o.R.inc(20178);parsedFormLength = ((((parsedForm == null )&&(__CLR4_4_1eomeomlgchor6o.R.iget(20179)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20180)==0&false))? 0 : parsedForm.length());
                        __CLR4_4_1eomeomlgchor6o.R.inc(20181);position += parsedFormLength;
                        __CLR4_4_1eomeomlgchor6o.R.inc(20182);found = true;
                        __CLR4_4_1eomeomlgchor6o.R.inc(20183);break;
                    }
                }}
            }}

            }__CLR4_4_1eomeomlgchor6o.R.inc(20184);oldPos = position;
            __CLR4_4_1eomeomlgchor6o.R.inc(20185);position = iAfterParser.parseInto(period, periodStr, position, locale);

            __CLR4_4_1eomeomlgchor6o.R.inc(20186);if ((((position < 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20187)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20188)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(20189);return position;
            }

            }__CLR4_4_1eomeomlgchor6o.R.inc(20190);if ((((found && position == oldPos && parsedFormLength > 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20191)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20192)==0&false))) {{
                // Separator should not have been supplied.
                __CLR4_4_1eomeomlgchor6o.R.inc(20193);return ~oldPos;
            }

            }__CLR4_4_1eomeomlgchor6o.R.inc(20194);if ((((position > oldPos && !found && !iUseBefore)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20195)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20196)==0&false))) {{
                // Separator was required.
                __CLR4_4_1eomeomlgchor6o.R.inc(20197);return ~oldPos;
            }

            }__CLR4_4_1eomeomlgchor6o.R.inc(20198);return position;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        Separator finish(PeriodPrinter afterPrinter, PeriodParser afterParser) {try{__CLR4_4_1eomeomlgchor6o.R.inc(20199);
            __CLR4_4_1eomeomlgchor6o.R.inc(20200);iAfterPrinter = afterPrinter;
            __CLR4_4_1eomeomlgchor6o.R.inc(20201);iAfterParser = afterParser;
            __CLR4_4_1eomeomlgchor6o.R.inc(20202);return this;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------

    /**
     * Composite implementation that merges other fields to create a full pattern.
     */
    static class Composite
            implements PeriodPrinter, PeriodParser {

        private final PeriodPrinter[] iPrinters;
        private final PeriodParser[] iParsers;

        Composite(List<Object> elementPairs) {try{__CLR4_4_1eomeomlgchor6o.R.inc(20203);
            __CLR4_4_1eomeomlgchor6o.R.inc(20204);List<Object> printerList = new ArrayList<Object>();
            __CLR4_4_1eomeomlgchor6o.R.inc(20205);List<Object> parserList = new ArrayList<Object>();

            __CLR4_4_1eomeomlgchor6o.R.inc(20206);decompose(elementPairs, printerList, parserList);

            __CLR4_4_1eomeomlgchor6o.R.inc(20207);if ((((printerList.size() <= 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20208)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20209)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(20210);iPrinters = null;
            } }else {{
                __CLR4_4_1eomeomlgchor6o.R.inc(20211);iPrinters = printerList.toArray(
                        new PeriodPrinter[printerList.size()]);
            }

            }__CLR4_4_1eomeomlgchor6o.R.inc(20212);if ((((parserList.size() <= 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20213)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20214)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(20215);iParsers = null;
            } }else {{
                __CLR4_4_1eomeomlgchor6o.R.inc(20216);iParsers = parserList.toArray(
                        new PeriodParser[parserList.size()]);
            }
        }}finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int countFieldsToPrint(ReadablePeriod period, int stopAt, Locale locale) {try{__CLR4_4_1eomeomlgchor6o.R.inc(20217);
            __CLR4_4_1eomeomlgchor6o.R.inc(20218);int sum = 0;
            __CLR4_4_1eomeomlgchor6o.R.inc(20219);PeriodPrinter[] printers = iPrinters;
            __CLR4_4_1eomeomlgchor6o.R.inc(20220);for (int i = printers.length; (((sum < stopAt && --i >= 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20221)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20222)==0&false)); ) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(20223);sum += printers[i].countFieldsToPrint(period, Integer.MAX_VALUE, locale);
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(20224);return sum;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int calculatePrintedLength(ReadablePeriod period, Locale locale) {try{__CLR4_4_1eomeomlgchor6o.R.inc(20225);
            __CLR4_4_1eomeomlgchor6o.R.inc(20226);int sum = 0;
            __CLR4_4_1eomeomlgchor6o.R.inc(20227);PeriodPrinter[] printers = iPrinters;
            __CLR4_4_1eomeomlgchor6o.R.inc(20228);for (int i = printers.length; (((--i >= 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20229)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20230)==0&false)); ) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(20231);sum += printers[i].calculatePrintedLength(period, locale);
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(20232);return sum;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public void printTo(StringBuffer buf, ReadablePeriod period, Locale locale) {try{__CLR4_4_1eomeomlgchor6o.R.inc(20233);
            __CLR4_4_1eomeomlgchor6o.R.inc(20234);PeriodPrinter[] printers = iPrinters;
            __CLR4_4_1eomeomlgchor6o.R.inc(20235);int len = printers.length;
            __CLR4_4_1eomeomlgchor6o.R.inc(20236);for (int i = 0; (((i < len)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20237)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20238)==0&false)); i++) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(20239);printers[i].printTo(buf, period, locale);
            }
        }}finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public void printTo(Writer out, ReadablePeriod period, Locale locale) throws IOException {try{__CLR4_4_1eomeomlgchor6o.R.inc(20240);
            __CLR4_4_1eomeomlgchor6o.R.inc(20241);PeriodPrinter[] printers = iPrinters;
            __CLR4_4_1eomeomlgchor6o.R.inc(20242);int len = printers.length;
            __CLR4_4_1eomeomlgchor6o.R.inc(20243);for (int i = 0; (((i < len)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20244)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20245)==0&false)); i++) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(20246);printers[i].printTo(out, period, locale);
            }
        }}finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        public int parseInto(
                ReadWritablePeriod period, String periodStr,
                int position, Locale locale) {try{__CLR4_4_1eomeomlgchor6o.R.inc(20247);
            __CLR4_4_1eomeomlgchor6o.R.inc(20248);PeriodParser[] parsers = iParsers;
            __CLR4_4_1eomeomlgchor6o.R.inc(20249);if ((((parsers == null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20250)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20251)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(20252);throw new UnsupportedOperationException();
            }

            }__CLR4_4_1eomeomlgchor6o.R.inc(20253);int len = parsers.length;
            __CLR4_4_1eomeomlgchor6o.R.inc(20254);for (int i = 0; (((i < len && position >= 0)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20255)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20256)==0&false)); i++) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(20257);position = parsers[i].parseInto(period, periodStr, position, locale);
            }
            }__CLR4_4_1eomeomlgchor6o.R.inc(20258);return position;
        }finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        private void decompose(List<Object> elementPairs, List<Object> printerList, List<Object> parserList) {try{__CLR4_4_1eomeomlgchor6o.R.inc(20259);
            __CLR4_4_1eomeomlgchor6o.R.inc(20260);int size = elementPairs.size();
            __CLR4_4_1eomeomlgchor6o.R.inc(20261);for (int i = 0; (((i < size)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20262)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20263)==0&false)); i += 2) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(20264);Object element = elementPairs.get(i);
                __CLR4_4_1eomeomlgchor6o.R.inc(20265);if ((((element instanceof PeriodPrinter)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20266)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20267)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(20268);if ((((element instanceof Composite)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20269)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20270)==0&false))) {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(20271);addArrayToList(printerList, ((Composite) element).iPrinters);
                    } }else {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(20272);printerList.add(element);
                    }
                }}

                }__CLR4_4_1eomeomlgchor6o.R.inc(20273);element = elementPairs.get(i + 1);
                __CLR4_4_1eomeomlgchor6o.R.inc(20274);if ((((element instanceof PeriodParser)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20275)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20276)==0&false))) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(20277);if ((((element instanceof Composite)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20278)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20279)==0&false))) {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(20280);addArrayToList(parserList, ((Composite) element).iParsers);
                    } }else {{
                        __CLR4_4_1eomeomlgchor6o.R.inc(20281);parserList.add(element);
                    }
                }}
            }}
        }}finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}

        private void addArrayToList(List<Object> list, Object[] array) {try{__CLR4_4_1eomeomlgchor6o.R.inc(20282);
            __CLR4_4_1eomeomlgchor6o.R.inc(20283);if ((((array != null)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20284)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20285)==0&false))) {{
                __CLR4_4_1eomeomlgchor6o.R.inc(20286);for (int i = 0; (((i < array.length)&&(__CLR4_4_1eomeomlgchor6o.R.iget(20287)!=0|true))||(__CLR4_4_1eomeomlgchor6o.R.iget(20288)==0&false)); i++) {{
                    __CLR4_4_1eomeomlgchor6o.R.inc(20289);list.add(array[i]);
                }
            }}
        }}finally{__CLR4_4_1eomeomlgchor6o.R.flushNeeded();}}
    }

}
