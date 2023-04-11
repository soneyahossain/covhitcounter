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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.MutableDateTime.Property;
import org.joda.time.ReadablePartial;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDateTimeField;

/**
 * Factory that creates complex instances of DateTimeFormatter via method calls.
 * <p>
 * Datetime formatting is performed by the {@link DateTimeFormatter} class.
 * Three classes provide factory methods to create formatters, and this is one.
 * The others are {@link DateTimeFormat} and {@link ISODateTimeFormat}.
 * <p>
 * DateTimeFormatterBuilder is used for constructing formatters which are then
 * used to print or parse. The formatters are built by appending specific fields
 * or other formatters to an instance of this builder.
 * <p>
 * For example, a formatter that prints month and year, like "January 1970",
 * can be constructed as follows:
 * <p>
 * <pre>
 * DateTimeFormatter monthAndYear = new DateTimeFormatterBuilder()
 *     .appendMonthOfYearText()
 *     .appendLiteral(' ')
 *     .appendYear(4, 4)
 *     .toFormatter();
 * </pre>
 * <p>
 * DateTimeFormatterBuilder itself is mutable and not thread-safe, but the
 * formatters that it builds are thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @author Fredrik Borgh
 * @see DateTimeFormat
 * @see ISODateTimeFormat
 * @since 1.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class DateTimeFormatterBuilder {public static class __CLR4_4_1c9nc9nlgchor27{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,17432,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Array of printers and parsers (alternating).
     */
    private ArrayList<Object> iElementPairs;
    /**
     * Cache of the last returned formatter.
     */
    private Object iFormatter;

    //-----------------------------------------------------------------------

    /**
     * Creates a DateTimeFormatterBuilder.
     */
    public DateTimeFormatterBuilder() {
        super();__CLR4_4_1c9nc9nlgchor27.R.inc(15900);try{__CLR4_4_1c9nc9nlgchor27.R.inc(15899);
        __CLR4_4_1c9nc9nlgchor27.R.inc(15901);iElementPairs = new ArrayList<Object>();
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs a DateTimeFormatter using all the appended elements.
     * <p>
     * This is the main method used by applications at the end of the build
     * process to create a usable formatter.
     * <p>
     * Subsequent changes to this builder do not affect the returned formatter.
     * <p>
     * The returned formatter may not support both printing and parsing.
     * The methods {@link DateTimeFormatter#isPrinter()} and
     * {@link DateTimeFormatter#isParser()} will help you determine the state
     * of the formatter.
     *
     * @throws UnsupportedOperationException if neither printing nor parsing is supported
     */
    public DateTimeFormatter toFormatter() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(15902);
        __CLR4_4_1c9nc9nlgchor27.R.inc(15903);Object f = getFormatter();
        __CLR4_4_1c9nc9nlgchor27.R.inc(15904);InternalPrinter printer = null;
        __CLR4_4_1c9nc9nlgchor27.R.inc(15905);if ((((isPrinter(f))&&(__CLR4_4_1c9nc9nlgchor27.R.iget(15906)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(15907)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(15908);printer = (InternalPrinter) f;
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(15909);InternalParser parser = null;
        __CLR4_4_1c9nc9nlgchor27.R.inc(15910);if ((((isParser(f))&&(__CLR4_4_1c9nc9nlgchor27.R.iget(15911)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(15912)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(15913);parser = (InternalParser) f;
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(15914);if ((((printer != null || parser != null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(15915)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(15916)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(15917);return new DateTimeFormatter(printer, parser);
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(15918);throw new UnsupportedOperationException("Both printing and parsing not supported");
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Internal method to create a DateTimePrinter instance using all the
     * appended elements.
     * <p>
     * Most applications will not use this method.
     * If you want a printer in an application, call {@link #toFormatter()}
     * and just use the printing API.
     * <p>
     * Subsequent changes to this builder do not affect the returned printer.
     *
     * @throws UnsupportedOperationException if printing is not supported
     */
    public DateTimePrinter toPrinter() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(15919);
        __CLR4_4_1c9nc9nlgchor27.R.inc(15920);Object f = getFormatter();
        __CLR4_4_1c9nc9nlgchor27.R.inc(15921);if ((((isPrinter(f))&&(__CLR4_4_1c9nc9nlgchor27.R.iget(15922)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(15923)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(15924);InternalPrinter ip = (InternalPrinter) f;
            __CLR4_4_1c9nc9nlgchor27.R.inc(15925);return InternalPrinterDateTimePrinter.of(ip);
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(15926);throw new UnsupportedOperationException("Printing is not supported");
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Internal method to create a DateTimeParser instance using all the
     * appended elements.
     * <p>
     * Most applications will not use this method.
     * If you want a parser in an application, call {@link #toFormatter()}
     * and just use the parsing API.
     * <p>
     * Subsequent changes to this builder do not affect the returned parser.
     *
     * @throws UnsupportedOperationException if parsing is not supported
     */
    public DateTimeParser toParser() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(15927);
        __CLR4_4_1c9nc9nlgchor27.R.inc(15928);Object f = getFormatter();
        __CLR4_4_1c9nc9nlgchor27.R.inc(15929);if ((((isParser(f))&&(__CLR4_4_1c9nc9nlgchor27.R.iget(15930)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(15931)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(15932);InternalParser ip = (InternalParser) f;
            __CLR4_4_1c9nc9nlgchor27.R.inc(15933);return InternalParserDateTimeParser.of(ip);
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(15934);throw new UnsupportedOperationException("Parsing is not supported");
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns true if toFormatter can be called without throwing an
     * UnsupportedOperationException.
     *
     * @return true if a formatter can be built
     */
    public boolean canBuildFormatter() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(15935);
        __CLR4_4_1c9nc9nlgchor27.R.inc(15936);return isFormatter(getFormatter());
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Returns true if toPrinter can be called without throwing an
     * UnsupportedOperationException.
     *
     * @return true if a printer can be built
     */
    public boolean canBuildPrinter() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(15937);
        __CLR4_4_1c9nc9nlgchor27.R.inc(15938);return isPrinter(getFormatter());
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Returns true if toParser can be called without throwing an
     * UnsupportedOperationException.
     *
     * @return true if a parser can be built
     */
    public boolean canBuildParser() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(15939);
        __CLR4_4_1c9nc9nlgchor27.R.inc(15940);return isParser(getFormatter());
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Clears out all the appended elements, allowing this builder to be
     * reused.
     */
    public void clear() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(15941);
        __CLR4_4_1c9nc9nlgchor27.R.inc(15942);iFormatter = null;
        __CLR4_4_1c9nc9nlgchor27.R.inc(15943);iElementPairs.clear();
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Appends another formatter.
     * <p>
     * This extracts the underlying printer and parser and appends them
     * The printer and parser interfaces are the low-level part of the formatting API.
     * Normally, instances are extracted from another formatter.
     * Note however that any formatter specific information, such as the locale,
     * time-zone, chronology, offset parsing or pivot/default year, will not be
     * extracted by this method.
     *
     * @param formatter the formatter to add
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if formatter is null or of an invalid type
     */
    public DateTimeFormatterBuilder append(DateTimeFormatter formatter) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(15944);
        __CLR4_4_1c9nc9nlgchor27.R.inc(15945);if ((((formatter == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(15946)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(15947)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(15948);throw new IllegalArgumentException("No formatter supplied");
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(15949);return append0(formatter.getPrinter0(), formatter.getParser0());
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Appends just a printer. With no matching parser, a parser cannot be
     * built from this DateTimeFormatterBuilder.
     * <p>
     * The printer interface is part of the low-level part of the formatting API.
     * Normally, instances are extracted from another formatter.
     * Note however that any formatter specific information, such as the locale,
     * time-zone, chronology, offset parsing or pivot/default year, will not be
     * extracted by this method.
     *
     * @param printer the printer to add, not null
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if printer is null or of an invalid type
     */
    public DateTimeFormatterBuilder append(DateTimePrinter printer) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(15950);
        __CLR4_4_1c9nc9nlgchor27.R.inc(15951);checkPrinter(printer);
        __CLR4_4_1c9nc9nlgchor27.R.inc(15952);return append0(DateTimePrinterInternalPrinter.of(printer), null);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Appends just a parser. With no matching printer, a printer cannot be
     * built from this builder.
     * <p>
     * The parser interface is part of the low-level part of the formatting API.
     * Normally, instances are extracted from another formatter.
     * Note however that any formatter specific information, such as the locale,
     * time-zone, chronology, offset parsing or pivot/default year, will not be
     * extracted by this method.
     *
     * @param parser the parser to add, not null
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if parser is null or of an invalid type
     */
    public DateTimeFormatterBuilder append(DateTimeParser parser) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(15953);
        __CLR4_4_1c9nc9nlgchor27.R.inc(15954);checkParser(parser);
        __CLR4_4_1c9nc9nlgchor27.R.inc(15955);return append0(null, DateTimeParserInternalParser.of(parser));
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Appends a printer/parser pair.
     * <p>
     * The printer and parser interfaces are the low-level part of the formatting API.
     * Normally, instances are extracted from another formatter.
     * Note however that any formatter specific information, such as the locale,
     * time-zone, chronology, offset parsing or pivot/default year, will not be
     * extracted by this method.
     *
     * @param printer the printer to add, not null
     * @param parser  the parser to add, not null
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if printer or parser is null or of an invalid type
     */
    public DateTimeFormatterBuilder append(DateTimePrinter printer, DateTimeParser parser) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(15956);
        __CLR4_4_1c9nc9nlgchor27.R.inc(15957);checkPrinter(printer);
        __CLR4_4_1c9nc9nlgchor27.R.inc(15958);checkParser(parser);
        __CLR4_4_1c9nc9nlgchor27.R.inc(15959);return append0(DateTimePrinterInternalPrinter.of(printer), DateTimeParserInternalParser.of(parser));
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Appends a printer and a set of matching parsers. When parsing, the first
     * parser in the list is selected for parsing. If it fails, the next is
     * chosen, and so on. If none of these parsers succeeds, then the failed
     * position of the parser that made the greatest progress is returned.
     * <p>
     * Only the printer is optional. In addition, it is illegal for any but the
     * last of the parser array elements to be null. If the last element is
     * null, this represents the empty parser. The presence of an empty parser
     * indicates that the entire array of parse formats is optional.
     * <p>
     * The printer and parser interfaces are the low-level part of the formatting API.
     * Normally, instances are extracted from another formatter.
     * Note however that any formatter specific information, such as the locale,
     * time-zone, chronology, offset parsing or pivot/default year, will not be
     * extracted by this method.
     *
     * @param printer the printer to add
     * @param parsers the parsers to add
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if any printer or parser is of an invalid type
     * @throws IllegalArgumentException if any parser element but the last is null
     */
    public DateTimeFormatterBuilder append(DateTimePrinter printer, DateTimeParser[] parsers) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(15960);
        __CLR4_4_1c9nc9nlgchor27.R.inc(15961);if ((((printer != null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(15962)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(15963)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(15964);checkPrinter(printer);
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(15965);if ((((parsers == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(15966)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(15967)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(15968);throw new IllegalArgumentException("No parsers supplied");
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(15969);int length = parsers.length;
        __CLR4_4_1c9nc9nlgchor27.R.inc(15970);if ((((length == 1)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(15971)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(15972)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(15973);if ((((parsers[0] == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(15974)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(15975)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(15976);throw new IllegalArgumentException("No parser supplied");
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(15977);return append0(DateTimePrinterInternalPrinter.of(printer), DateTimeParserInternalParser.of(parsers[0]));
        }

        }__CLR4_4_1c9nc9nlgchor27.R.inc(15978);InternalParser[] copyOfParsers = new InternalParser[length];
        __CLR4_4_1c9nc9nlgchor27.R.inc(15979);int i;
        __CLR4_4_1c9nc9nlgchor27.R.inc(15980);for (i = 0; (((i < length - 1)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(15981)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(15982)==0&false)); i++) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(15983);if ((copyOfParsers[i] = DateTimeParserInternalParser.of(parsers[i])) == null) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(15986);throw new IllegalArgumentException("Incomplete parser array");
            }
        }}
        }__CLR4_4_1c9nc9nlgchor27.R.inc(15987);copyOfParsers[i] = DateTimeParserInternalParser.of(parsers[i]);

        __CLR4_4_1c9nc9nlgchor27.R.inc(15988);return append0(DateTimePrinterInternalPrinter.of(printer), new MatchingParser(copyOfParsers));
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Appends just a parser element which is optional. With no matching
     * printer, a printer cannot be built from this DateTimeFormatterBuilder.
     * <p>
     * The parser interface is part of the low-level part of the formatting API.
     * Normally, instances are extracted from another formatter.
     * Note however that any formatter specific information, such as the locale,
     * time-zone, chronology, offset parsing or pivot/default year, will not be
     * extracted by this method.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if parser is null or of an invalid type
     */
    public DateTimeFormatterBuilder appendOptional(DateTimeParser parser) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(15989);
        __CLR4_4_1c9nc9nlgchor27.R.inc(15990);checkParser(parser);
        __CLR4_4_1c9nc9nlgchor27.R.inc(15991);InternalParser[] parsers = new InternalParser[]{DateTimeParserInternalParser.of(parser), null};
        __CLR4_4_1c9nc9nlgchor27.R.inc(15992);return append0(null, new MatchingParser(parsers));
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Checks if the parser is non null and a provider.
     *
     * @param parser the parser to check
     */
    private void checkParser(DateTimeParser parser) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(15993);
        __CLR4_4_1c9nc9nlgchor27.R.inc(15994);if ((((parser == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(15995)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(15996)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(15997);throw new IllegalArgumentException("No parser supplied");
        }
    }}finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Checks if the printer is non null and a provider.
     *
     * @param printer the printer to check
     */
    private void checkPrinter(DateTimePrinter printer) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(15998);
        __CLR4_4_1c9nc9nlgchor27.R.inc(15999);if ((((printer == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16000)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16001)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16002);throw new IllegalArgumentException("No printer supplied");
        }
    }}finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    private DateTimeFormatterBuilder append0(Object element) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16003);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16004);iFormatter = null;
        // Add the element as both a printer and parser.
        __CLR4_4_1c9nc9nlgchor27.R.inc(16005);iElementPairs.add(element);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16006);iElementPairs.add(element);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16007);return this;
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    private DateTimeFormatterBuilder append0(
            InternalPrinter printer, InternalParser parser) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16008);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16009);iFormatter = null;
        __CLR4_4_1c9nc9nlgchor27.R.inc(16010);iElementPairs.add(printer);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16011);iElementPairs.add(parser);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16012);return this;
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Instructs the printer to emit a specific character, and the parser to
     * expect it. The parser is case-insensitive.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendLiteral(char c) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16013);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16014);return append0(new CharacterLiteral(c));
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit specific text, and the parser to expect
     * it. The parser is case-insensitive.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if text is null
     */
    public DateTimeFormatterBuilder appendLiteral(String text) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16015);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16016);if ((((text == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16017)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16018)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16019);throw new IllegalArgumentException("Literal must not be null");
        }
        }boolean __CLB4_4_1_bool0=false;__CLR4_4_1c9nc9nlgchor27.R.inc(16020);switch (text.length()) {
            case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_1c9nc9nlgchor27.R.inc(16021);__CLB4_4_1_bool0=true;}
                __CLR4_4_1c9nc9nlgchor27.R.inc(16022);return this;
            case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_1c9nc9nlgchor27.R.inc(16023);__CLB4_4_1_bool0=true;}
                __CLR4_4_1c9nc9nlgchor27.R.inc(16024);return append0(new CharacterLiteral(text.charAt(0)));
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_1c9nc9nlgchor27.R.inc(16025);__CLB4_4_1_bool0=true;}
                __CLR4_4_1c9nc9nlgchor27.R.inc(16026);return append0(new StringLiteral(text));
        }
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a field value as a decimal number, and the
     * parser to expect an unsigned decimal number.
     *
     * @param fieldType type of field to append
     * @param minDigits minimum number of digits to <i>print</i>
     * @param maxDigits maximum number of digits to <i>parse</i>, or the estimated
     *                  maximum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if field type is null
     */
    public DateTimeFormatterBuilder appendDecimal(
            DateTimeFieldType fieldType, int minDigits, int maxDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16027);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16028);if ((((fieldType == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16029)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16030)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16031);throw new IllegalArgumentException("Field type must not be null");
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(16032);if ((((maxDigits < minDigits)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16033)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16034)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16035);maxDigits = minDigits;
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(16036);if ((((minDigits < 0 || maxDigits <= 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16037)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16038)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16039);throw new IllegalArgumentException();
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(16040);if ((((minDigits <= 1)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16041)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16042)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16043);return append0(new UnpaddedNumber(fieldType, maxDigits, false));
        } }else {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16044);return append0(new PaddedNumber(fieldType, maxDigits, false, minDigits));
        }
    }}finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a field value as a fixed-width decimal
     * number (smaller numbers will be left-padded with zeros), and the parser
     * to expect an unsigned decimal number with the same fixed width.
     *
     * @param fieldType type of field to append
     * @param numDigits the exact number of digits to parse or print, except if
     *                  printed value requires more digits
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if field type is null or if <code>numDigits <= 0</code>
     * @since 1.5
     */
    public DateTimeFormatterBuilder appendFixedDecimal(
            DateTimeFieldType fieldType, int numDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16045);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16046);if ((((fieldType == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16047)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16048)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16049);throw new IllegalArgumentException("Field type must not be null");
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(16050);if ((((numDigits <= 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16051)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16052)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16053);throw new IllegalArgumentException("Illegal number of digits: " + numDigits);
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(16054);return append0(new FixedNumber(fieldType, numDigits, false));
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a field value as a decimal number, and the
     * parser to expect a signed decimal number.
     *
     * @param fieldType type of field to append
     * @param minDigits minimum number of digits to <i>print</i>
     * @param maxDigits maximum number of digits to <i>parse</i>, or the estimated
     *                  maximum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if field type is null
     */
    public DateTimeFormatterBuilder appendSignedDecimal(
            DateTimeFieldType fieldType, int minDigits, int maxDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16055);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16056);if ((((fieldType == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16057)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16058)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16059);throw new IllegalArgumentException("Field type must not be null");
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(16060);if ((((maxDigits < minDigits)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16061)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16062)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16063);maxDigits = minDigits;
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(16064);if ((((minDigits < 0 || maxDigits <= 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16065)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16066)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16067);throw new IllegalArgumentException();
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(16068);if ((((minDigits <= 1)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16069)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16070)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16071);return append0(new UnpaddedNumber(fieldType, maxDigits, true));
        } }else {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16072);return append0(new PaddedNumber(fieldType, maxDigits, true, minDigits));
        }
    }}finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a field value as a fixed-width decimal
     * number (smaller numbers will be left-padded with zeros), and the parser
     * to expect an signed decimal number with the same fixed width.
     *
     * @param fieldType type of field to append
     * @param numDigits the exact number of digits to parse or print, except if
     *                  printed value requires more digits
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if field type is null or if <code>numDigits <= 0</code>
     * @since 1.5
     */
    public DateTimeFormatterBuilder appendFixedSignedDecimal(
            DateTimeFieldType fieldType, int numDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16073);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16074);if ((((fieldType == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16075)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16076)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16077);throw new IllegalArgumentException("Field type must not be null");
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(16078);if ((((numDigits <= 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16079)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16080)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16081);throw new IllegalArgumentException("Illegal number of digits: " + numDigits);
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(16082);return append0(new FixedNumber(fieldType, numDigits, true));
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a field value as text, and the
     * parser to expect text.
     *
     * @param fieldType type of field to append
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if field type is null
     */
    public DateTimeFormatterBuilder appendText(DateTimeFieldType fieldType) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16083);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16084);if ((((fieldType == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16085)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16086)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16087);throw new IllegalArgumentException("Field type must not be null");
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(16088);return append0(new TextField(fieldType, false));
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a field value as short text, and the
     * parser to expect text.
     *
     * @param fieldType type of field to append
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if field type is null
     */
    public DateTimeFormatterBuilder appendShortText(DateTimeFieldType fieldType) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16089);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16090);if ((((fieldType == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16091)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16092)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16093);throw new IllegalArgumentException("Field type must not be null");
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(16094);return append0(new TextField(fieldType, true));
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a remainder of time as a decimal fraction,
     * without decimal point. For example, if the field is specified as
     * minuteOfHour and the time is 12:30:45, the value printed is 75. A
     * decimal point is implied, so the fraction is 0.75, or three-quarters of
     * a minute.
     *
     * @param fieldType type of field to append
     * @param minDigits minimum number of digits to print.
     * @param maxDigits maximum number of digits to print or parse.
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if field type is null
     */
    public DateTimeFormatterBuilder appendFraction(
            DateTimeFieldType fieldType, int minDigits, int maxDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16095);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16096);if ((((fieldType == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16097)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16098)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16099);throw new IllegalArgumentException("Field type must not be null");
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(16100);if ((((maxDigits < minDigits)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16101)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16102)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16103);maxDigits = minDigits;
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(16104);if ((((minDigits < 0 || maxDigits <= 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16105)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16106)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16107);throw new IllegalArgumentException();
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(16108);return append0(new Fraction(fieldType, minDigits, maxDigits));
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Appends the print/parse of a fractional second.
     * <p>
     * This reliably handles the case where fractional digits are being handled
     * beyond a visible decimal point. The digits parsed will always be treated
     * as the most significant (numerically largest) digits.
     * Thus '23' will be parsed as 230 milliseconds.
     * Contrast this behaviour to {@link #appendMillisOfSecond}.
     * This method does not print or parse the decimal point itself.
     *
     * @param minDigits minimum number of digits to print
     * @param maxDigits maximum number of digits to print or parse
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendFractionOfSecond(int minDigits, int maxDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16109);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16110);return appendFraction(DateTimeFieldType.secondOfDay(), minDigits, maxDigits);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Appends the print/parse of a fractional minute.
     * <p>
     * This reliably handles the case where fractional digits are being handled
     * beyond a visible decimal point. The digits parsed will always be treated
     * as the most significant (numerically largest) digits.
     * Thus '23' will be parsed as 0.23 minutes (converted to milliseconds).
     * This method does not print or parse the decimal point itself.
     *
     * @param minDigits minimum number of digits to print
     * @param maxDigits maximum number of digits to print or parse
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendFractionOfMinute(int minDigits, int maxDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16111);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16112);return appendFraction(DateTimeFieldType.minuteOfDay(), minDigits, maxDigits);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Appends the print/parse of a fractional hour.
     * <p>
     * This reliably handles the case where fractional digits are being handled
     * beyond a visible decimal point. The digits parsed will always be treated
     * as the most significant (numerically largest) digits.
     * Thus '23' will be parsed as 0.23 hours (converted to milliseconds).
     * This method does not print or parse the decimal point itself.
     *
     * @param minDigits minimum number of digits to print
     * @param maxDigits maximum number of digits to print or parse
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendFractionOfHour(int minDigits, int maxDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16113);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16114);return appendFraction(DateTimeFieldType.hourOfDay(), minDigits, maxDigits);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Appends the print/parse of a fractional day.
     * <p>
     * This reliably handles the case where fractional digits are being handled
     * beyond a visible decimal point. The digits parsed will always be treated
     * as the most significant (numerically largest) digits.
     * Thus '23' will be parsed as 0.23 days (converted to milliseconds).
     * This method does not print or parse the decimal point itself.
     *
     * @param minDigits minimum number of digits to print
     * @param maxDigits maximum number of digits to print or parse
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendFractionOfDay(int minDigits, int maxDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16115);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16116);return appendFraction(DateTimeFieldType.dayOfYear(), minDigits, maxDigits);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric millisOfSecond field.
     * <p>
     * This method will append a field that prints a three digit value.
     * During parsing the value that is parsed is assumed to be three digits.
     * If less than three digits are present then they will be counted as the
     * smallest parts of the millisecond. This is probably not what you want
     * if you are using the field as a fraction. Instead, a fractional
     * millisecond should be produced using {@link #appendFractionOfSecond}.
     *
     * @param minDigits minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendMillisOfSecond(int minDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16117);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16118);return appendDecimal(DateTimeFieldType.millisOfSecond(), minDigits, 3);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric millisOfDay field.
     *
     * @param minDigits minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendMillisOfDay(int minDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16119);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16120);return appendDecimal(DateTimeFieldType.millisOfDay(), minDigits, 8);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric secondOfMinute field.
     *
     * @param minDigits minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendSecondOfMinute(int minDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16121);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16122);return appendDecimal(DateTimeFieldType.secondOfMinute(), minDigits, 2);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric secondOfDay field.
     *
     * @param minDigits minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendSecondOfDay(int minDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16123);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16124);return appendDecimal(DateTimeFieldType.secondOfDay(), minDigits, 5);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric minuteOfHour field.
     *
     * @param minDigits minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendMinuteOfHour(int minDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16125);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16126);return appendDecimal(DateTimeFieldType.minuteOfHour(), minDigits, 2);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric minuteOfDay field.
     *
     * @param minDigits minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendMinuteOfDay(int minDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16127);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16128);return appendDecimal(DateTimeFieldType.minuteOfDay(), minDigits, 4);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric hourOfDay field.
     *
     * @param minDigits minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendHourOfDay(int minDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16129);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16130);return appendDecimal(DateTimeFieldType.hourOfDay(), minDigits, 2);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric clockhourOfDay field.
     *
     * @param minDigits minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendClockhourOfDay(int minDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16131);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16132);return appendDecimal(DateTimeFieldType.clockhourOfDay(), minDigits, 2);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric hourOfHalfday field.
     *
     * @param minDigits minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendHourOfHalfday(int minDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16133);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16134);return appendDecimal(DateTimeFieldType.hourOfHalfday(), minDigits, 2);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric clockhourOfHalfday field.
     *
     * @param minDigits minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendClockhourOfHalfday(int minDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16135);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16136);return appendDecimal(DateTimeFieldType.clockhourOfHalfday(), minDigits, 2);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric dayOfWeek field.
     *
     * @param minDigits minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendDayOfWeek(int minDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16137);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16138);return appendDecimal(DateTimeFieldType.dayOfWeek(), minDigits, 1);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric dayOfMonth field.
     *
     * @param minDigits minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendDayOfMonth(int minDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16139);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16140);return appendDecimal(DateTimeFieldType.dayOfMonth(), minDigits, 2);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric dayOfYear field.
     *
     * @param minDigits minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendDayOfYear(int minDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16141);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16142);return appendDecimal(DateTimeFieldType.dayOfYear(), minDigits, 3);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric weekOfWeekyear field.
     *
     * @param minDigits minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendWeekOfWeekyear(int minDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16143);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16144);return appendDecimal(DateTimeFieldType.weekOfWeekyear(), minDigits, 2);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric weekyear field.
     *
     * @param minDigits minimum number of digits to <i>print</i>
     * @param maxDigits maximum number of digits to <i>parse</i>, or the estimated
     *                  maximum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendWeekyear(int minDigits, int maxDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16145);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16146);return appendSignedDecimal(DateTimeFieldType.weekyear(), minDigits, maxDigits);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric monthOfYear field.
     *
     * @param minDigits minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendMonthOfYear(int minDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16147);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16148);return appendDecimal(DateTimeFieldType.monthOfYear(), minDigits, 2);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric year field.
     *
     * @param minDigits minimum number of digits to <i>print</i>
     * @param maxDigits maximum number of digits to <i>parse</i>, or the estimated
     *                  maximum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendYear(int minDigits, int maxDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16149);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16150);return appendSignedDecimal(DateTimeFieldType.year(), minDigits, maxDigits);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric year field which always prints
     * and parses two digits. A pivot year is used during parsing to determine
     * the range of supported years as <code>(pivot - 50) .. (pivot + 49)</code>.
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
     * @param pivot pivot year to use when parsing
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendTwoDigitYear(int pivot) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16151);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16152);return appendTwoDigitYear(pivot, false);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric year field which always prints
     * two digits. A pivot year is used during parsing to determine the range
     * of supported years as <code>(pivot - 50) .. (pivot + 49)</code>. If
     * parse is instructed to be lenient and the digit count is not two, it is
     * treated as an absolute year. With lenient parsing, specifying a positive
     * or negative sign before the year also makes it absolute.
     *
     * @param pivot        pivot year to use when parsing
     * @param lenientParse when true, if digit count is not two, it is treated
     *                     as an absolute year
     * @return this DateTimeFormatterBuilder, for chaining
     * @since 1.1
     */
    public DateTimeFormatterBuilder appendTwoDigitYear(int pivot, boolean lenientParse) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16153);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16154);return append0(new TwoDigitYear(DateTimeFieldType.year(), pivot, lenientParse));
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric weekyear field which always prints
     * and parses two digits. A pivot year is used during parsing to determine
     * the range of supported years as <code>(pivot - 50) .. (pivot + 49)</code>.
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
     * @param pivot pivot weekyear to use when parsing
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int pivot) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16155);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16156);return appendTwoDigitWeekyear(pivot, false);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric weekyear field which always prints
     * two digits. A pivot year is used during parsing to determine the range
     * of supported years as <code>(pivot - 50) .. (pivot + 49)</code>. If
     * parse is instructed to be lenient and the digit count is not two, it is
     * treated as an absolute weekyear. With lenient parsing, specifying a positive
     * or negative sign before the weekyear also makes it absolute.
     *
     * @param pivot        pivot weekyear to use when parsing
     * @param lenientParse when true, if digit count is not two, it is treated
     *                     as an absolute weekyear
     * @return this DateTimeFormatterBuilder, for chaining
     * @since 1.1
     */
    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int pivot, boolean lenientParse) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16157);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16158);return append0(new TwoDigitYear(DateTimeFieldType.weekyear(), pivot, lenientParse));
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric yearOfEra field.
     *
     * @param minDigits minimum number of digits to <i>print</i>
     * @param maxDigits maximum number of digits to <i>parse</i>, or the estimated
     *                  maximum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendYearOfEra(int minDigits, int maxDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16159);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16160);return appendDecimal(DateTimeFieldType.yearOfEra(), minDigits, maxDigits);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric year of century field.
     *
     * @param minDigits minimum number of digits to print
     * @param maxDigits maximum number of digits to <i>parse</i>, or the estimated
     *                  maximum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendYearOfCentury(int minDigits, int maxDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16161);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16162);return appendDecimal(DateTimeFieldType.yearOfCentury(), minDigits, maxDigits);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric century of era field.
     *
     * @param minDigits minimum number of digits to print
     * @param maxDigits maximum number of digits to <i>parse</i>, or the estimated
     *                  maximum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendCenturyOfEra(int minDigits, int maxDigits) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16163);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16164);return appendSignedDecimal(DateTimeFieldType.centuryOfEra(), minDigits, maxDigits);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a locale-specific AM/PM text, and the
     * parser to expect it. The parser is case-insensitive.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendHalfdayOfDayText() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16165);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16166);return appendText(DateTimeFieldType.halfdayOfDay());
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a locale-specific dayOfWeek text. The
     * parser will accept a long or short dayOfWeek text, case-insensitive.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendDayOfWeekText() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16167);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16168);return appendText(DateTimeFieldType.dayOfWeek());
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a short locale-specific dayOfWeek
     * text. The parser will accept a long or short dayOfWeek text,
     * case-insensitive.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendDayOfWeekShortText() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16169);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16170);return appendShortText(DateTimeFieldType.dayOfWeek());
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a short locale-specific monthOfYear
     * text. The parser will accept a long or short monthOfYear text,
     * case-insensitive.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendMonthOfYearText() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16171);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16172);return appendText(DateTimeFieldType.monthOfYear());
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a locale-specific monthOfYear text. The
     * parser will accept a long or short monthOfYear text, case-insensitive.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendMonthOfYearShortText() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16173);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16174);return appendShortText(DateTimeFieldType.monthOfYear());
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a locale-specific era text (BC/AD), and
     * the parser to expect it. The parser is case-insensitive.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendEraText() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16175);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16176);return appendText(DateTimeFieldType.era());
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a locale-specific time zone name.
     * Using this method prevents parsing, because time zone names are not unique.
     * See {@link #appendTimeZoneName(Map)}.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendTimeZoneName() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16177);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16178);return append0(new TimeZoneName(TimeZoneName.LONG_NAME, null), null);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a locale-specific time zone name, providing a lookup for parsing.
     * Time zone names are not unique, thus the API forces you to supply the lookup.
     * The names are searched in the order of the map, thus it is strongly recommended
     * to use a {@code LinkedHashMap} or similar.
     *
     * @param parseLookup the table of names, not null
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendTimeZoneName(Map<String, DateTimeZone> parseLookup) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16179);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16180);TimeZoneName pp = new TimeZoneName(TimeZoneName.LONG_NAME, parseLookup);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16181);return append0(pp, pp);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a short locale-specific time zone name.
     * Using this method prevents parsing, because time zone names are not unique.
     * See {@link #appendTimeZoneShortName(Map)}.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendTimeZoneShortName() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16182);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16183);return append0(new TimeZoneName(TimeZoneName.SHORT_NAME, null), null);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a short locale-specific time zone
     * name, providing a lookup for parsing.
     * Time zone names are not unique, thus the API forces you to supply the lookup.
     * The names are searched in the order of the map, thus it is strongly recommended
     * to use a {@code LinkedHashMap} or similar.
     *
     * @param parseLookup the table of names, null to use the {@link DateTimeUtils#getDefaultTimeZoneNames() default names}
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendTimeZoneShortName(Map<String, DateTimeZone> parseLookup) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16184);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16185);TimeZoneName pp = new TimeZoneName(TimeZoneName.SHORT_NAME, parseLookup);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16186);return append0(pp, pp);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit the identifier of the time zone.
     * From version 2.0, this field can be parsed.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendTimeZoneId() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16187);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16188);return append0(TimeZoneId.INSTANCE, TimeZoneId.INSTANCE);
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit text and numbers to display time zone
     * offset from UTC. A parser will use the parsed time zone offset to adjust
     * the datetime.
     * <p>
     * If zero offset text is supplied, then it will be printed when the zone is zero.
     * During parsing, either the zero offset text, or the offset will be parsed.
     *
     * @param zeroOffsetText the text to use if time zone offset is zero. If
     *                       null, offset is always shown.
     * @param showSeparators if true, prints ':' separator before minute and
     *                       second field and prints '.' separator before fraction field.
     * @param minFields      minimum number of fields to print, stopping when no
     *                       more precision is required. 1=hours, 2=minutes, 3=seconds, 4=fraction
     * @param maxFields      maximum number of fields to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendTimeZoneOffset(
            String zeroOffsetText, boolean showSeparators,
            int minFields, int maxFields) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16189);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16190);return append0(new TimeZoneOffset
                (zeroOffsetText, zeroOffsetText, showSeparators, minFields, maxFields));
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    /**
     * Instructs the printer to emit text and numbers to display time zone
     * offset from UTC. A parser will use the parsed time zone offset to adjust
     * the datetime.
     * <p>
     * If zero offset print text is supplied, then it will be printed when the zone is zero.
     * If zero offset parse text is supplied, then either it or the offset will be parsed.
     *
     * @param zeroOffsetPrintText the text to print if time zone offset is zero. If
     *                            null, offset is always shown.
     * @param zeroOffsetParseText the text to optionally parse to indicate that the time
     *                            zone offset is zero. If null, then always use the offset.
     * @param showSeparators      if true, prints ':' separator before minute and
     *                            second field and prints '.' separator before fraction field.
     * @param minFields           minimum number of fields to print, stopping when no
     *                            more precision is required. 1=hours, 2=minutes, 3=seconds, 4=fraction
     * @param maxFields           maximum number of fields to print
     * @return this DateTimeFormatterBuilder, for chaining
     * @since 2.0
     */
    public DateTimeFormatterBuilder appendTimeZoneOffset(
            String zeroOffsetPrintText, String zeroOffsetParseText, boolean showSeparators,
            int minFields, int maxFields) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16191);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16192);return append0(new TimeZoneOffset
                (zeroOffsetPrintText, zeroOffsetParseText, showSeparators, minFields, maxFields));
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Calls upon {@link DateTimeFormat} to parse the pattern and append the
     * results into this builder.
     *
     * @param pattern pattern specification
     * @throws IllegalArgumentException if the pattern is invalid
     * @see DateTimeFormat
     */
    public DateTimeFormatterBuilder appendPattern(String pattern) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16193);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16194);DateTimeFormat.appendPatternTo(this, pattern);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16195);return this;
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private Object getFormatter() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16196);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16197);Object f = iFormatter;

        __CLR4_4_1c9nc9nlgchor27.R.inc(16198);if ((((f == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16199)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16200)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16201);if ((((iElementPairs.size() == 2)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16202)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16203)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16204);Object printer = iElementPairs.get(0);
                __CLR4_4_1c9nc9nlgchor27.R.inc(16205);Object parser = iElementPairs.get(1);

                __CLR4_4_1c9nc9nlgchor27.R.inc(16206);if ((((printer != null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16207)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16208)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16209);if ((((printer == parser || parser == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16210)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16211)==0&false))) {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16212);f = printer;
                    }
                }} }else {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16213);f = parser;
                }
            }}

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16214);if ((((f == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16215)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16216)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16217);f = new Composite(iElementPairs);
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16218);iFormatter = f;
        }

        }__CLR4_4_1c9nc9nlgchor27.R.inc(16219);return f;
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    private boolean isPrinter(Object f) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16220);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16221);if ((((f instanceof InternalPrinter)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16222)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16223)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16224);if ((((f instanceof Composite)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16225)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16226)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16227);return ((Composite) f).isPrinter();
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16228);return true;
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(16229);return false;
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    private boolean isParser(Object f) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16230);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16231);if ((((f instanceof InternalParser)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16232)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16233)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16234);if ((((f instanceof Composite)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16235)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16236)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16237);return ((Composite) f).isParser();
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16238);return true;
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(16239);return false;
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    private boolean isFormatter(Object f) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16240);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16241);return (isPrinter(f) || isParser(f));
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    static void appendUnknownString(Appendable appendable, int len) throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16242);
        __CLR4_4_1c9nc9nlgchor27.R.inc(16243);for (int i = len; (((--i >= 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16244)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16245)==0&false)); ) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(16246);appendable.append('\ufffd');
        }
    }}finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    static class CharacterLiteral
            implements InternalPrinter, InternalParser {

        private final char iValue;

        CharacterLiteral(char value) {
            super();__CLR4_4_1c9nc9nlgchor27.R.inc(16248);try{__CLR4_4_1c9nc9nlgchor27.R.inc(16247);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16249);iValue = value;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int estimatePrintedLength() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16250);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16251);return 1;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public void printTo(
                Appendable appendable, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16252);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16253);appendable.append(iValue);
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public void printTo(Appendable appendable, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16254);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16255);appendable.append(iValue);
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16256);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16257);return 1;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int parseInto(DateTimeParserBucket bucket, CharSequence text, int position) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16258);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16259);if ((((position >= text.length())&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16260)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16261)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16262);return ~position;
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16263);char a = text.charAt(position);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16264);char b = iValue;

            __CLR4_4_1c9nc9nlgchor27.R.inc(16265);if ((((a != b)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16266)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16267)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16268);a = Character.toUpperCase(a);
                __CLR4_4_1c9nc9nlgchor27.R.inc(16269);b = Character.toUpperCase(b);
                __CLR4_4_1c9nc9nlgchor27.R.inc(16270);if ((((a != b)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16271)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16272)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16273);a = Character.toLowerCase(a);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16274);b = Character.toLowerCase(b);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16275);if ((((a != b)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16276)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16277)==0&false))) {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16278);return ~position;
                    }
                }}
            }}

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16279);return position + 1;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class StringLiteral
            implements InternalPrinter, InternalParser {

        private final String iValue;

        StringLiteral(String value) {
            super();__CLR4_4_1c9nc9nlgchor27.R.inc(16281);try{__CLR4_4_1c9nc9nlgchor27.R.inc(16280);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16282);iValue = value;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int estimatePrintedLength() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16283);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16284);return iValue.length();
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public void printTo(
                Appendable appendable, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16285);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16286);appendable.append(iValue);
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public void printTo(Appendable appendable, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16287);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16288);appendable.append(iValue);
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16289);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16290);return iValue.length();
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int parseInto(DateTimeParserBucket bucket, CharSequence text, int position) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16291);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16292);if ((((csStartsWithIgnoreCase(text, position, iValue))&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16293)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16294)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16295);return position + iValue.length();
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16296);return ~position;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static abstract class NumberFormatter
            implements InternalPrinter, InternalParser {
        protected final DateTimeFieldType iFieldType;
        protected final int iMaxParsedDigits;
        protected final boolean iSigned;

        NumberFormatter(DateTimeFieldType fieldType,
                        int maxParsedDigits, boolean signed) {
            super();__CLR4_4_1c9nc9nlgchor27.R.inc(16298);try{__CLR4_4_1c9nc9nlgchor27.R.inc(16297);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16299);iFieldType = fieldType;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16300);iMaxParsedDigits = maxParsedDigits;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16301);iSigned = signed;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16302);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16303);return iMaxParsedDigits;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int parseInto(DateTimeParserBucket bucket, CharSequence text, int position) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16304);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16305);int limit = Math.min(iMaxParsedDigits, text.length() - position);

            __CLR4_4_1c9nc9nlgchor27.R.inc(16306);boolean negative = false;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16307);boolean positive = false;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16308);int length = 0;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16309);while ((((length < limit)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16310)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16311)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16312);char c = text.charAt(position + length);
                __CLR4_4_1c9nc9nlgchor27.R.inc(16313);if ((((length == 0 && (c == '-' || c == '+') && iSigned)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16314)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16315)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16316);negative = c == '-';
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16317);positive = c == '+';

                    // Next character must be a digit.
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16318);if (length + 1 >= limit ||
                            (c = text.charAt(position + length + 1)) < '0' || c > '9') {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16321);break;
                    }
                    }__CLR4_4_1c9nc9nlgchor27.R.inc(16322);length++;

                    // Expand the limit to disregard the sign character.
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16323);limit = Math.min(limit + 1, text.length() - position);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16324);continue;
                }
                }__CLR4_4_1c9nc9nlgchor27.R.inc(16325);if ((((c < '0' || c > '9')&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16326)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16327)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16328);break;
                }
                }__CLR4_4_1c9nc9nlgchor27.R.inc(16329);length++;
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16330);if ((((length == 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16331)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16332)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16333);return ~position;
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16334);int value;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16335);if ((((length >= 9)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16336)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16337)==0&false))) {{
                // Since value may exceed integer limits, use stock parser
                // which checks for this.
                __CLR4_4_1c9nc9nlgchor27.R.inc(16338);if ((((positive)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16339)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16340)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16341);value = Integer.parseInt(text.subSequence(position + 1, position += length).toString());
                } }else {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16342);value = Integer.parseInt(text.subSequence(position, position += length).toString());
                }
//                value = Integer.parseInt(text.subSequence(position, position += length).toString());
            }} }else {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16343);int i = position;
                __CLR4_4_1c9nc9nlgchor27.R.inc(16344);if ((((negative || positive)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16345)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16346)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16347);i++;
                }
                }__CLR4_4_1c9nc9nlgchor27.R.inc(16348);try {
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16349);value = text.charAt(i++) - '0';
                } catch (StringIndexOutOfBoundsException e) {
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16350);return ~position;
                }
                __CLR4_4_1c9nc9nlgchor27.R.inc(16351);position += length;
                __CLR4_4_1c9nc9nlgchor27.R.inc(16352);while ((((i < position)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16353)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16354)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16355);value = ((value << 3) + (value << 1)) + text.charAt(i++) - '0';
                }
                }__CLR4_4_1c9nc9nlgchor27.R.inc(16356);if ((((negative)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16357)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16358)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16359);value = -value;
                }
            }}

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16360);bucket.saveField(iFieldType, value);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16361);return position;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class UnpaddedNumber extends NumberFormatter {

        protected UnpaddedNumber(DateTimeFieldType fieldType,
                                 int maxParsedDigits, boolean signed) {
            super(fieldType, maxParsedDigits, signed);__CLR4_4_1c9nc9nlgchor27.R.inc(16363);try{__CLR4_4_1c9nc9nlgchor27.R.inc(16362);
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int estimatePrintedLength() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16364);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16365);return iMaxParsedDigits;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public void printTo(
                Appendable appendable, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16366);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16367);try {
                __CLR4_4_1c9nc9nlgchor27.R.inc(16368);DateTimeField field = iFieldType.getField(chrono);
                __CLR4_4_1c9nc9nlgchor27.R.inc(16369);FormatUtils.appendUnpaddedInteger(appendable, field.get(instant));
            } catch (RuntimeException e) {
                __CLR4_4_1c9nc9nlgchor27.R.inc(16370);appendable.append('\ufffd');
            }
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public void printTo(Appendable appendable, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16371);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16372);if ((((partial.isSupported(iFieldType))&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16373)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16374)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16375);try {
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16376);FormatUtils.appendUnpaddedInteger(appendable, partial.get(iFieldType));
                } catch (RuntimeException e) {
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16377);appendable.append('\ufffd');
                }
            } }else {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16378);appendable.append('\ufffd');
            }
        }}finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class PaddedNumber extends NumberFormatter {

        protected final int iMinPrintedDigits;

        protected PaddedNumber(DateTimeFieldType fieldType, int maxParsedDigits,
                               boolean signed, int minPrintedDigits) {
            super(fieldType, maxParsedDigits, signed);__CLR4_4_1c9nc9nlgchor27.R.inc(16380);try{__CLR4_4_1c9nc9nlgchor27.R.inc(16379);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16381);iMinPrintedDigits = minPrintedDigits;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int estimatePrintedLength() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16382);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16383);return iMaxParsedDigits;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public void printTo(
                Appendable appendable, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16384);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16385);try {
                __CLR4_4_1c9nc9nlgchor27.R.inc(16386);DateTimeField field = iFieldType.getField(chrono);
                __CLR4_4_1c9nc9nlgchor27.R.inc(16387);FormatUtils.appendPaddedInteger(appendable, field.get(instant), iMinPrintedDigits);
            } catch (RuntimeException e) {
                __CLR4_4_1c9nc9nlgchor27.R.inc(16388);appendUnknownString(appendable, iMinPrintedDigits);
            }
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public void printTo(Appendable appendable, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16389);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16390);if ((((partial.isSupported(iFieldType))&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16391)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16392)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16393);try {
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16394);FormatUtils.appendPaddedInteger(appendable, partial.get(iFieldType), iMinPrintedDigits);
                } catch (RuntimeException e) {
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16395);appendUnknownString(appendable, iMinPrintedDigits);
                }
            } }else {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16396);appendUnknownString(appendable, iMinPrintedDigits);
            }
        }}finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class FixedNumber extends PaddedNumber {

        protected FixedNumber(DateTimeFieldType fieldType, int numDigits, boolean signed) {
            super(fieldType, numDigits, signed, numDigits);__CLR4_4_1c9nc9nlgchor27.R.inc(16398);try{__CLR4_4_1c9nc9nlgchor27.R.inc(16397);
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        @Override
        public int parseInto(DateTimeParserBucket bucket, CharSequence text, int position) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16399);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16400);int newPos = super.parseInto(bucket, text, position);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16401);if ((((newPos < 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16402)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16403)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16404);return newPos;
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16405);int expectedPos = position + iMaxParsedDigits;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16406);if ((((newPos != expectedPos)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16407)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16408)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16409);if ((((iSigned)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16410)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16411)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16412);char c = text.charAt(position);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16413);if ((((c == '-' || c == '+')&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16414)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16415)==0&false))) {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16416);expectedPos++;
                    }
                }}
                }__CLR4_4_1c9nc9nlgchor27.R.inc(16417);if ((((newPos > expectedPos)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16418)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16419)==0&false))) {{
                    // The failure is at the position of the first extra digit.
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16420);return ~(expectedPos + 1);
                } }else {__CLR4_4_1c9nc9nlgchor27.R.inc(16421);if ((((newPos < expectedPos)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16422)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16423)==0&false))) {{
                    // The failure is at the position where the next digit should be.
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16424);return ~newPos;
                }
            }}}
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16425);return newPos;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class TwoDigitYear
            implements InternalPrinter, InternalParser {

        /**
         * The field to print/parse.
         */
        private final DateTimeFieldType iType;
        /**
         * The pivot year.
         */
        private final int iPivot;
        private final boolean iLenientParse;

        TwoDigitYear(DateTimeFieldType type, int pivot, boolean lenientParse) {
            super();__CLR4_4_1c9nc9nlgchor27.R.inc(16427);try{__CLR4_4_1c9nc9nlgchor27.R.inc(16426);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16428);iType = type;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16429);iPivot = pivot;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16430);iLenientParse = lenientParse;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16431);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16432);return (((iLenientParse )&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16433)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16434)==0&false))? 4 : 2;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int parseInto(DateTimeParserBucket bucket, CharSequence text, int position) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16435);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16436);int limit = text.length() - position;

            __CLR4_4_1c9nc9nlgchor27.R.inc(16437);if ((((!iLenientParse)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16438)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16439)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16440);limit = Math.min(2, limit);
                __CLR4_4_1c9nc9nlgchor27.R.inc(16441);if ((((limit < 2)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16442)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16443)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16444);return ~position;
                }
            }} }else {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16445);boolean hasSignChar = false;
                __CLR4_4_1c9nc9nlgchor27.R.inc(16446);boolean negative = false;
                __CLR4_4_1c9nc9nlgchor27.R.inc(16447);int length = 0;
                __CLR4_4_1c9nc9nlgchor27.R.inc(16448);while ((((length < limit)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16449)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16450)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16451);char c = text.charAt(position + length);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16452);if ((((length == 0 && (c == '-' || c == '+'))&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16453)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16454)==0&false))) {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16455);hasSignChar = true;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16456);negative = c == '-';
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16457);if ((((negative)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16458)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16459)==0&false))) {{
                            __CLR4_4_1c9nc9nlgchor27.R.inc(16460);length++;
                        } }else {{
                            // Skip the '+' for parseInt to succeed.
                            __CLR4_4_1c9nc9nlgchor27.R.inc(16461);position++;
                            __CLR4_4_1c9nc9nlgchor27.R.inc(16462);limit--;
                        }
                        }__CLR4_4_1c9nc9nlgchor27.R.inc(16463);continue;
                    }
                    }__CLR4_4_1c9nc9nlgchor27.R.inc(16464);if ((((c < '0' || c > '9')&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16465)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16466)==0&false))) {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16467);break;
                    }
                    }__CLR4_4_1c9nc9nlgchor27.R.inc(16468);length++;
                }

                }__CLR4_4_1c9nc9nlgchor27.R.inc(16469);if ((((length == 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16470)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16471)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16472);return ~position;
                }

                }__CLR4_4_1c9nc9nlgchor27.R.inc(16473);if ((((hasSignChar || length != 2)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16474)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16475)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16476);int value;
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16477);if ((((length >= 9)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16478)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16479)==0&false))) {{
                        // Since value may exceed integer limits, use stock
                        // parser which checks for this.
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16480);value = Integer.parseInt(text.subSequence(position, position += length).toString());
                    } }else {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16481);int i = position;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16482);if ((((negative)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16483)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16484)==0&false))) {{
                            __CLR4_4_1c9nc9nlgchor27.R.inc(16485);i++;
                        }
                        }__CLR4_4_1c9nc9nlgchor27.R.inc(16486);try {
                            __CLR4_4_1c9nc9nlgchor27.R.inc(16487);value = text.charAt(i++) - '0';
                        } catch (StringIndexOutOfBoundsException e) {
                            __CLR4_4_1c9nc9nlgchor27.R.inc(16488);return ~position;
                        }
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16489);position += length;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16490);while ((((i < position)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16491)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16492)==0&false))) {{
                            __CLR4_4_1c9nc9nlgchor27.R.inc(16493);value = ((value << 3) + (value << 1)) + text.charAt(i++) - '0';
                        }
                        }__CLR4_4_1c9nc9nlgchor27.R.inc(16494);if ((((negative)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16495)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16496)==0&false))) {{
                            __CLR4_4_1c9nc9nlgchor27.R.inc(16497);value = -value;
                        }
                    }}

                    }__CLR4_4_1c9nc9nlgchor27.R.inc(16498);bucket.saveField(iType, value);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16499);return position;
                }
            }}

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16500);int year;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16501);char c = text.charAt(position);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16502);if ((((c < '0' || c > '9')&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16503)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16504)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16505);return ~position;
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16506);year = c - '0';
            __CLR4_4_1c9nc9nlgchor27.R.inc(16507);c = text.charAt(position + 1);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16508);if ((((c < '0' || c > '9')&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16509)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16510)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16511);return ~position;
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16512);year = ((year << 3) + (year << 1)) + c - '0';

            __CLR4_4_1c9nc9nlgchor27.R.inc(16513);int pivot = iPivot;
            // If the bucket pivot year is non-null, use that when parsing
            __CLR4_4_1c9nc9nlgchor27.R.inc(16514);if ((((bucket.getPivotYear() != null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16515)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16516)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16517);pivot = bucket.getPivotYear().intValue();
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16518);int low = pivot - 50;

            __CLR4_4_1c9nc9nlgchor27.R.inc(16519);int t;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16520);if ((((low >= 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16521)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16522)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16523);t = low % 100;
            } }else {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16524);t = 99 + ((low + 1) % 100);
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16525);year += low + (((((year < t) )&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16526)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16527)==0&false))? 100 : 0) - t;

            __CLR4_4_1c9nc9nlgchor27.R.inc(16528);bucket.saveField(iType, year);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16529);return position + 2;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int estimatePrintedLength() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16530);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16531);return 2;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public void printTo(
                Appendable appendable, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16532);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16533);int year = getTwoDigitYear(instant, chrono);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16534);if ((((year < 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16535)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16536)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16537);appendable.append('\ufffd');
                __CLR4_4_1c9nc9nlgchor27.R.inc(16538);appendable.append('\ufffd');
            } }else {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16539);FormatUtils.appendPaddedInteger(appendable, year, 2);
            }
        }}finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        private int getTwoDigitYear(long instant, Chronology chrono) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16540);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16541);try {
                __CLR4_4_1c9nc9nlgchor27.R.inc(16542);int year = iType.getField(chrono).get(instant);
                __CLR4_4_1c9nc9nlgchor27.R.inc(16543);if ((((year < 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16544)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16545)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16546);year = -year;
                }
                }__CLR4_4_1c9nc9nlgchor27.R.inc(16547);return year % 100;
            } catch (RuntimeException e) {
                __CLR4_4_1c9nc9nlgchor27.R.inc(16548);return -1;
            }
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public void printTo(Appendable appendable, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16549);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16550);int year = getTwoDigitYear(partial);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16551);if ((((year < 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16552)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16553)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16554);appendable.append('\ufffd');
                __CLR4_4_1c9nc9nlgchor27.R.inc(16555);appendable.append('\ufffd');
            } }else {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16556);FormatUtils.appendPaddedInteger(appendable, year, 2);
            }
        }}finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        private int getTwoDigitYear(ReadablePartial partial) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16557);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16558);if ((((partial.isSupported(iType))&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16559)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16560)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16561);try {
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16562);int year = partial.get(iType);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16563);if ((((year < 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16564)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16565)==0&false))) {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16566);year = -year;
                    }
                    }__CLR4_4_1c9nc9nlgchor27.R.inc(16567);return year % 100;
                } catch (RuntimeException e) {
                }
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16568);return -1;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class TextField
            implements InternalPrinter, InternalParser {

        private static Map<Locale, Map<DateTimeFieldType, Object[]>> cParseCache =
                new ConcurrentHashMap<Locale, Map<DateTimeFieldType, Object[]>>();
        private final DateTimeFieldType iFieldType;
        private final boolean iShort;

        TextField(DateTimeFieldType fieldType, boolean isShort) {
            super();__CLR4_4_1c9nc9nlgchor27.R.inc(16570);try{__CLR4_4_1c9nc9nlgchor27.R.inc(16569);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16571);iFieldType = fieldType;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16572);iShort = isShort;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int estimatePrintedLength() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16573);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16574);return (((iShort )&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16575)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16576)==0&false))? 6 : 20;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public void printTo(
                Appendable appendable, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16577);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16578);try {
                __CLR4_4_1c9nc9nlgchor27.R.inc(16579);appendable.append(print(instant, chrono, locale));
            } catch (RuntimeException e) {
                __CLR4_4_1c9nc9nlgchor27.R.inc(16580);appendable.append('\ufffd');
            }
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public void printTo(Appendable appendable, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16581);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16582);try {
                __CLR4_4_1c9nc9nlgchor27.R.inc(16583);appendable.append(print(partial, locale));
            } catch (RuntimeException e) {
                __CLR4_4_1c9nc9nlgchor27.R.inc(16584);appendable.append('\ufffd');
            }
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        private String print(long instant, Chronology chrono, Locale locale) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16585);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16586);DateTimeField field = iFieldType.getField(chrono);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16587);if ((((iShort)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16588)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16589)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16590);return field.getAsShortText(instant, locale);
            } }else {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16591);return field.getAsText(instant, locale);
            }
        }}finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        private String print(ReadablePartial partial, Locale locale) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16592);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16593);if ((((partial.isSupported(iFieldType))&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16594)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16595)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16596);DateTimeField field = iFieldType.getField(partial.getChronology());
                __CLR4_4_1c9nc9nlgchor27.R.inc(16597);if ((((iShort)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16598)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16599)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16600);return field.getAsShortText(partial, locale);
                } }else {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16601);return field.getAsText(partial, locale);
                }
            }} }else {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16602);return "\ufffd";
            }
        }}finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16603);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16604);return estimatePrintedLength();
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        @SuppressWarnings("unchecked")
        public int parseInto(DateTimeParserBucket bucket, CharSequence text, int position) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16605);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16606);Locale locale = bucket.getLocale();
            // handle languages which might have non ASCII A-Z or punctuation
            // bug 1788282
            __CLR4_4_1c9nc9nlgchor27.R.inc(16607);Map<String, Boolean> validValues = null;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16608);int maxLength = 0;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16609);Map<DateTimeFieldType, Object[]> innerMap = cParseCache.get(locale);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16610);if ((((innerMap == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16611)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16612)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16613);innerMap = new ConcurrentHashMap<DateTimeFieldType, Object[]>();
                __CLR4_4_1c9nc9nlgchor27.R.inc(16614);cParseCache.put(locale, innerMap);
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16615);Object[] array = innerMap.get(iFieldType);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16616);if ((((array == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16617)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16618)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16619);validValues = new ConcurrentHashMap<String, Boolean>(32);  // use map as no concurrent Set
                __CLR4_4_1c9nc9nlgchor27.R.inc(16620);MutableDateTime dt = new MutableDateTime(0L, DateTimeZone.UTC);
                __CLR4_4_1c9nc9nlgchor27.R.inc(16621);Property property = dt.property(iFieldType);
                __CLR4_4_1c9nc9nlgchor27.R.inc(16622);int min = property.getMinimumValueOverall();
                __CLR4_4_1c9nc9nlgchor27.R.inc(16623);int max = property.getMaximumValueOverall();
                __CLR4_4_1c9nc9nlgchor27.R.inc(16624);if ((((max - min > 32)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16625)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16626)==0&false))) {{  // protect against invalid fields
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16627);return ~position;
                }
                }__CLR4_4_1c9nc9nlgchor27.R.inc(16628);maxLength = property.getMaximumTextLength(locale);
                __CLR4_4_1c9nc9nlgchor27.R.inc(16629);for (int i = min; (((i <= max)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16630)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16631)==0&false)); i++) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16632);property.set(i);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16633);validValues.put(property.getAsShortText(locale), Boolean.TRUE);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16634);validValues.put(property.getAsShortText(locale).toLowerCase(locale), Boolean.TRUE);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16635);validValues.put(property.getAsShortText(locale).toUpperCase(locale), Boolean.TRUE);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16636);validValues.put(property.getAsText(locale), Boolean.TRUE);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16637);validValues.put(property.getAsText(locale).toLowerCase(locale), Boolean.TRUE);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16638);validValues.put(property.getAsText(locale).toUpperCase(locale), Boolean.TRUE);
                }
                }__CLR4_4_1c9nc9nlgchor27.R.inc(16639);if (((("en".equals(locale.getLanguage()) && iFieldType == DateTimeFieldType.era())&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16640)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16641)==0&false))) {{
                    // hack to support for parsing "BCE" and "CE" if the language is English
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16642);validValues.put("BCE", Boolean.TRUE);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16643);validValues.put("bce", Boolean.TRUE);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16644);validValues.put("CE", Boolean.TRUE);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16645);validValues.put("ce", Boolean.TRUE);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16646);maxLength = 3;
                }
                }__CLR4_4_1c9nc9nlgchor27.R.inc(16647);array = new Object[]{validValues, Integer.valueOf(maxLength)};
                __CLR4_4_1c9nc9nlgchor27.R.inc(16648);innerMap.put(iFieldType, array);
            } }else {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16649);validValues = (Map<String, Boolean>) array[0];
                __CLR4_4_1c9nc9nlgchor27.R.inc(16650);maxLength = ((Integer) array[1]).intValue();
            }
            // match the longest string first using our knowledge of the max length
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16651);int limit = Math.min(text.length(), position + maxLength);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16652);for (int i = limit; (((i > position)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16653)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16654)==0&false)); i--) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16655);String match = text.subSequence(position, i).toString();
                __CLR4_4_1c9nc9nlgchor27.R.inc(16656);if ((((validValues.containsKey(match))&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16657)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16658)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16659);bucket.saveField(iFieldType, match, locale);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16660);return i;
                }
            }}
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16661);return ~position;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class Fraction
            implements InternalPrinter, InternalParser {

        private final DateTimeFieldType iFieldType;
        protected int iMinDigits;
        protected int iMaxDigits;

        protected Fraction(DateTimeFieldType fieldType, int minDigits, int maxDigits) {
            super();__CLR4_4_1c9nc9nlgchor27.R.inc(16663);try{__CLR4_4_1c9nc9nlgchor27.R.inc(16662);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16664);iFieldType = fieldType;
            // Limit the precision requirements.
            __CLR4_4_1c9nc9nlgchor27.R.inc(16665);if ((((maxDigits > 18)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16666)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16667)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16668);maxDigits = 18;
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16669);iMinDigits = minDigits;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16670);iMaxDigits = maxDigits;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int estimatePrintedLength() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16671);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16672);return iMaxDigits;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public void printTo(
                Appendable appendable, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16673);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16674);printTo(appendable, instant, chrono);
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public void printTo(Appendable appendable, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16675);
            // removed check whether field is supported, as input field is typically
            // secondOfDay which is unsupported by TimeOfDay
            __CLR4_4_1c9nc9nlgchor27.R.inc(16676);long millis = partial.getChronology().set(partial, 0L);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16677);printTo(appendable, millis, partial.getChronology());
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        protected void printTo(Appendable appendable, long instant, Chronology chrono)
                throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16678);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16679);DateTimeField field = iFieldType.getField(chrono);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16680);int minDigits = iMinDigits;

            __CLR4_4_1c9nc9nlgchor27.R.inc(16681);long fraction;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16682);try {
                __CLR4_4_1c9nc9nlgchor27.R.inc(16683);fraction = field.remainder(instant);
            } catch (RuntimeException e) {
                __CLR4_4_1c9nc9nlgchor27.R.inc(16684);appendUnknownString(appendable, minDigits);
                __CLR4_4_1c9nc9nlgchor27.R.inc(16685);return;
            }

            __CLR4_4_1c9nc9nlgchor27.R.inc(16686);if ((((fraction == 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16687)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16688)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16689);while ((((--minDigits >= 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16690)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16691)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16692);appendable.append('0');
                }
                }__CLR4_4_1c9nc9nlgchor27.R.inc(16693);return;
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16694);String str;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16695);long[] fractionData = getFractionData(fraction, field);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16696);long scaled = fractionData[0];
            __CLR4_4_1c9nc9nlgchor27.R.inc(16697);int maxDigits = (int) fractionData[1];

            __CLR4_4_1c9nc9nlgchor27.R.inc(16698);if (((((scaled & 0x7fffffff) == scaled)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16699)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16700)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16701);str = Integer.toString((int) scaled);
            } }else {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16702);str = Long.toString(scaled);
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16703);int length = str.length();
            __CLR4_4_1c9nc9nlgchor27.R.inc(16704);int digits = maxDigits;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16705);while ((((length < digits)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16706)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16707)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16708);appendable.append('0');
                __CLR4_4_1c9nc9nlgchor27.R.inc(16709);minDigits--;
                __CLR4_4_1c9nc9nlgchor27.R.inc(16710);digits--;
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16711);if ((((minDigits < digits)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16712)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16713)==0&false))) {{
                // Chop off as many trailing zero digits as necessary.
                __CLR4_4_1c9nc9nlgchor27.R.inc(16714);while ((((minDigits < digits)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16715)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16716)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16717);if ((((length <= 1 || str.charAt(length - 1) != '0')&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16718)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16719)==0&false))) {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16720);break;
                    }
                    }__CLR4_4_1c9nc9nlgchor27.R.inc(16721);digits--;
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16722);length--;
                }
                }__CLR4_4_1c9nc9nlgchor27.R.inc(16723);if ((((length < str.length())&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16724)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16725)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16726);for (int i = 0; (((i < length)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16727)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16728)==0&false)); i++) {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16729);appendable.append(str.charAt(i));
                    }
                    }__CLR4_4_1c9nc9nlgchor27.R.inc(16730);return;
                }
            }}

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16731);appendable.append(str);
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        private long[] getFractionData(long fraction, DateTimeField field) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16732);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16733);long rangeMillis = field.getDurationField().getUnitMillis();
            __CLR4_4_1c9nc9nlgchor27.R.inc(16734);long scalar;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16735);int maxDigits = iMaxDigits;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16736);while (true) {{
                boolean __CLB4_4_1_bool1=false;__CLR4_4_1c9nc9nlgchor27.R.inc(16737);switch (maxDigits) {
                    default:if (!__CLB4_4_1_bool1) {__CLR4_4_1c9nc9nlgchor27.R.inc(16738);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16739);scalar = 1L;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16740);break;
                    case 1:if (!__CLB4_4_1_bool1) {__CLR4_4_1c9nc9nlgchor27.R.inc(16741);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16742);scalar = 10L;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16743);break;
                    case 2:if (!__CLB4_4_1_bool1) {__CLR4_4_1c9nc9nlgchor27.R.inc(16744);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16745);scalar = 100L;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16746);break;
                    case 3:if (!__CLB4_4_1_bool1) {__CLR4_4_1c9nc9nlgchor27.R.inc(16747);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16748);scalar = 1000L;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16749);break;
                    case 4:if (!__CLB4_4_1_bool1) {__CLR4_4_1c9nc9nlgchor27.R.inc(16750);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16751);scalar = 10000L;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16752);break;
                    case 5:if (!__CLB4_4_1_bool1) {__CLR4_4_1c9nc9nlgchor27.R.inc(16753);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16754);scalar = 100000L;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16755);break;
                    case 6:if (!__CLB4_4_1_bool1) {__CLR4_4_1c9nc9nlgchor27.R.inc(16756);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16757);scalar = 1000000L;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16758);break;
                    case 7:if (!__CLB4_4_1_bool1) {__CLR4_4_1c9nc9nlgchor27.R.inc(16759);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16760);scalar = 10000000L;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16761);break;
                    case 8:if (!__CLB4_4_1_bool1) {__CLR4_4_1c9nc9nlgchor27.R.inc(16762);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16763);scalar = 100000000L;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16764);break;
                    case 9:if (!__CLB4_4_1_bool1) {__CLR4_4_1c9nc9nlgchor27.R.inc(16765);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16766);scalar = 1000000000L;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16767);break;
                    case 10:if (!__CLB4_4_1_bool1) {__CLR4_4_1c9nc9nlgchor27.R.inc(16768);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16769);scalar = 10000000000L;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16770);break;
                    case 11:if (!__CLB4_4_1_bool1) {__CLR4_4_1c9nc9nlgchor27.R.inc(16771);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16772);scalar = 100000000000L;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16773);break;
                    case 12:if (!__CLB4_4_1_bool1) {__CLR4_4_1c9nc9nlgchor27.R.inc(16774);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16775);scalar = 1000000000000L;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16776);break;
                    case 13:if (!__CLB4_4_1_bool1) {__CLR4_4_1c9nc9nlgchor27.R.inc(16777);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16778);scalar = 10000000000000L;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16779);break;
                    case 14:if (!__CLB4_4_1_bool1) {__CLR4_4_1c9nc9nlgchor27.R.inc(16780);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16781);scalar = 100000000000000L;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16782);break;
                    case 15:if (!__CLB4_4_1_bool1) {__CLR4_4_1c9nc9nlgchor27.R.inc(16783);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16784);scalar = 1000000000000000L;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16785);break;
                    case 16:if (!__CLB4_4_1_bool1) {__CLR4_4_1c9nc9nlgchor27.R.inc(16786);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16787);scalar = 10000000000000000L;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16788);break;
                    case 17:if (!__CLB4_4_1_bool1) {__CLR4_4_1c9nc9nlgchor27.R.inc(16789);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16790);scalar = 100000000000000000L;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16791);break;
                    case 18:if (!__CLB4_4_1_bool1) {__CLR4_4_1c9nc9nlgchor27.R.inc(16792);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16793);scalar = 1000000000000000000L;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16794);break;
                }
                __CLR4_4_1c9nc9nlgchor27.R.inc(16795);if ((((((rangeMillis * scalar) / scalar) == rangeMillis)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16796)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16797)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16798);break;
                }
                // Overflowed: scale down.
                }__CLR4_4_1c9nc9nlgchor27.R.inc(16799);maxDigits--;
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16800);return new long[]{fraction * scalar / rangeMillis, maxDigits};
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16801);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16802);return iMaxDigits;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int parseInto(DateTimeParserBucket bucket, CharSequence text, int position) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16803);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16804);DateTimeField field = iFieldType.getField(bucket.getChronology());

            __CLR4_4_1c9nc9nlgchor27.R.inc(16805);int limit = Math.min(iMaxDigits, text.length() - position);

            __CLR4_4_1c9nc9nlgchor27.R.inc(16806);long value = 0;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16807);long n = field.getDurationField().getUnitMillis() * 10;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16808);int length = 0;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16809);while ((((length < limit)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16810)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16811)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16812);char c = text.charAt(position + length);
                __CLR4_4_1c9nc9nlgchor27.R.inc(16813);if ((((c < '0' || c > '9')&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16814)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16815)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16816);break;
                }
                }__CLR4_4_1c9nc9nlgchor27.R.inc(16817);length++;
                __CLR4_4_1c9nc9nlgchor27.R.inc(16818);long nn = n / 10;
                __CLR4_4_1c9nc9nlgchor27.R.inc(16819);value += (c - '0') * nn;
                __CLR4_4_1c9nc9nlgchor27.R.inc(16820);n = nn;
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16821);value /= 10;

            __CLR4_4_1c9nc9nlgchor27.R.inc(16822);if ((((length == 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16823)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16824)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16825);return ~position;
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16826);if ((((value > Integer.MAX_VALUE)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16827)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16828)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16829);return ~position;
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16830);DateTimeField parseField = new PreciseDateTimeField(
                    DateTimeFieldType.millisOfSecond(),
                    MillisDurationField.INSTANCE,
                    field.getDurationField());

            __CLR4_4_1c9nc9nlgchor27.R.inc(16831);bucket.saveField(parseField, (int) value);

            __CLR4_4_1c9nc9nlgchor27.R.inc(16832);return position + length;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class TimeZoneOffset
            implements InternalPrinter, InternalParser {

        private final String iZeroOffsetPrintText;
        private final String iZeroOffsetParseText;
        private final boolean iShowSeparators;
        private final int iMinFields;
        private final int iMaxFields;

        TimeZoneOffset(String zeroOffsetPrintText, String zeroOffsetParseText,
                       boolean showSeparators,
                       int minFields, int maxFields) {
            super();__CLR4_4_1c9nc9nlgchor27.R.inc(16834);try{__CLR4_4_1c9nc9nlgchor27.R.inc(16833);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16835);iZeroOffsetPrintText = zeroOffsetPrintText;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16836);iZeroOffsetParseText = zeroOffsetParseText;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16837);iShowSeparators = showSeparators;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16838);if ((((minFields <= 0 || maxFields < minFields)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16839)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16840)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16841);throw new IllegalArgumentException();
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16842);if ((((minFields > 4)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16843)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16844)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16845);minFields = 4;
                __CLR4_4_1c9nc9nlgchor27.R.inc(16846);maxFields = 4;
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16847);iMinFields = minFields;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16848);iMaxFields = maxFields;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int estimatePrintedLength() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16849);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16850);int est = 1 + iMinFields << 1;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16851);if ((((iShowSeparators)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16852)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16853)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16854);est += iMinFields - 1;
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16855);if ((((iZeroOffsetPrintText != null && iZeroOffsetPrintText.length() > est)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16856)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16857)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16858);est = iZeroOffsetPrintText.length();
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16859);return est;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public void printTo(
                Appendable buf, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16860);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16861);if ((((displayZone == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16862)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16863)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16864);return;  // no zone
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16865);if ((((displayOffset == 0 && iZeroOffsetPrintText != null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16866)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16867)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16868);buf.append(iZeroOffsetPrintText);
                __CLR4_4_1c9nc9nlgchor27.R.inc(16869);return;
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16870);if ((((displayOffset >= 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16871)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16872)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16873);buf.append('+');
            } }else {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16874);buf.append('-');
                __CLR4_4_1c9nc9nlgchor27.R.inc(16875);displayOffset = -displayOffset;
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16876);int hours = displayOffset / DateTimeConstants.MILLIS_PER_HOUR;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16877);FormatUtils.appendPaddedInteger(buf, hours, 2);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16878);if ((((iMaxFields == 1)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16879)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16880)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16881);return;
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16882);displayOffset -= hours * (int) DateTimeConstants.MILLIS_PER_HOUR;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16883);if ((((displayOffset == 0 && iMinFields <= 1)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16884)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16885)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16886);return;
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16887);int minutes = displayOffset / DateTimeConstants.MILLIS_PER_MINUTE;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16888);if ((((iShowSeparators)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16889)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16890)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16891);buf.append(':');
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16892);FormatUtils.appendPaddedInteger(buf, minutes, 2);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16893);if ((((iMaxFields == 2)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16894)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16895)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16896);return;
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16897);displayOffset -= minutes * DateTimeConstants.MILLIS_PER_MINUTE;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16898);if ((((displayOffset == 0 && iMinFields <= 2)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16899)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16900)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16901);return;
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16902);int seconds = displayOffset / DateTimeConstants.MILLIS_PER_SECOND;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16903);if ((((iShowSeparators)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16904)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16905)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16906);buf.append(':');
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16907);FormatUtils.appendPaddedInteger(buf, seconds, 2);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16908);if ((((iMaxFields == 3)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16909)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16910)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16911);return;
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16912);displayOffset -= seconds * DateTimeConstants.MILLIS_PER_SECOND;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16913);if ((((displayOffset == 0 && iMinFields <= 3)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16914)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16915)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16916);return;
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16917);if ((((iShowSeparators)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16918)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16919)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16920);buf.append('.');
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16921);FormatUtils.appendPaddedInteger(buf, displayOffset, 3);
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public void printTo(Appendable appendable, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16922);
            // no zone info
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16923);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16924);return estimatePrintedLength();
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int parseInto(DateTimeParserBucket bucket, CharSequence text, int position) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(16925);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16926);int limit = text.length() - position;

            __CLR4_4_1c9nc9nlgchor27.R.inc(16927);zeroOffset:
            if ((((iZeroOffsetParseText != null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16928)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16929)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16930);if ((((iZeroOffsetParseText.length() == 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16931)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16932)==0&false))) {{
                    // Peek ahead, looking for sign character.
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16933);if ((((limit > 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16934)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16935)==0&false))) {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16936);char c = text.charAt(position);
                        __CLR4_4_1c9nc9nlgchor27.R.inc(16937);if ((((c == '-' || c == '+')&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16938)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16939)==0&false))) {{
                            __CLR4_4_1c9nc9nlgchor27.R.inc(16940);break zeroOffset;
                        }
                    }}
                    }__CLR4_4_1c9nc9nlgchor27.R.inc(16941);bucket.setOffset(Integer.valueOf(0));
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16942);return position;
                }
                }__CLR4_4_1c9nc9nlgchor27.R.inc(16943);if ((((csStartsWithIgnoreCase(text, position, iZeroOffsetParseText))&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16944)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16945)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16946);bucket.setOffset(Integer.valueOf(0));
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16947);return position + iZeroOffsetParseText.length();
                }
            }}

            // Format to expect is sign character followed by at least one digit.

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16948);if ((((limit <= 1)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16949)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16950)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16951);return ~position;
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16952);boolean negative;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16953);char c = text.charAt(position);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16954);if ((((c == '-')&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16955)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16956)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16957);negative = true;
            } }else {__CLR4_4_1c9nc9nlgchor27.R.inc(16958);if ((((c == '+')&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16959)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16960)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16961);negative = false;
            } }else {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16962);return ~position;
            }

            }}__CLR4_4_1c9nc9nlgchor27.R.inc(16963);limit--;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16964);position++;

            // Format following sign is one of:
            //
            // hh
            // hhmm
            // hhmmss
            // hhmmssSSS
            // hh:mm
            // hh:mm:ss
            // hh:mm:ss.SSS

            // First parse hours.

            __CLR4_4_1c9nc9nlgchor27.R.inc(16965);if ((((digitCount(text, position, 2) < 2)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16966)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16967)==0&false))) {{
                // Need two digits for hour.
                __CLR4_4_1c9nc9nlgchor27.R.inc(16968);return ~position;
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(16969);int offset;

            __CLR4_4_1c9nc9nlgchor27.R.inc(16970);int hours = FormatUtils.parseTwoDigits(text, position);
            __CLR4_4_1c9nc9nlgchor27.R.inc(16971);if ((((hours > 23)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16972)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16973)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(16974);return ~position;
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(16975);offset = hours * DateTimeConstants.MILLIS_PER_HOUR;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16976);limit -= 2;
            __CLR4_4_1c9nc9nlgchor27.R.inc(16977);position += 2;

            __CLR4_4_1c9nc9nlgchor27.R.inc(16978);parse:
            {
                // Need to decide now if separators are expected or parsing
                // stops at hour field.

                __CLR4_4_1c9nc9nlgchor27.R.inc(16979);if ((((limit <= 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16980)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16981)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16982);break parse;
                }

                }__CLR4_4_1c9nc9nlgchor27.R.inc(16983);boolean expectSeparators;
                __CLR4_4_1c9nc9nlgchor27.R.inc(16984);c = text.charAt(position);
                __CLR4_4_1c9nc9nlgchor27.R.inc(16985);if ((((c == ':')&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16986)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16987)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16988);expectSeparators = true;
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16989);limit--;
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16990);position++;
                } }else {__CLR4_4_1c9nc9nlgchor27.R.inc(16991);if ((((c >= '0' && c <= '9')&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16992)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16993)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16994);expectSeparators = false;
                } }else {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(16995);break parse;
                }

                // Proceed to parse minutes.

                }}__CLR4_4_1c9nc9nlgchor27.R.inc(16996);int count = digitCount(text, position, 2);
                __CLR4_4_1c9nc9nlgchor27.R.inc(16997);if ((((count == 0 && !expectSeparators)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(16998)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(16999)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17000);break parse;
                } }else {__CLR4_4_1c9nc9nlgchor27.R.inc(17001);if ((((count < 2)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17002)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17003)==0&false))) {{
                    // Need two digits for minute.
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17004);return ~position;
                }

                }}__CLR4_4_1c9nc9nlgchor27.R.inc(17005);int minutes = FormatUtils.parseTwoDigits(text, position);
                __CLR4_4_1c9nc9nlgchor27.R.inc(17006);if ((((minutes > 59)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17007)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17008)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17009);return ~position;
                }
                }__CLR4_4_1c9nc9nlgchor27.R.inc(17010);offset += minutes * DateTimeConstants.MILLIS_PER_MINUTE;
                __CLR4_4_1c9nc9nlgchor27.R.inc(17011);limit -= 2;
                __CLR4_4_1c9nc9nlgchor27.R.inc(17012);position += 2;

                // Proceed to parse seconds.

                __CLR4_4_1c9nc9nlgchor27.R.inc(17013);if ((((limit <= 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17014)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17015)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17016);break parse;
                }

                }__CLR4_4_1c9nc9nlgchor27.R.inc(17017);if ((((expectSeparators)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17018)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17019)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17020);if ((((text.charAt(position) != ':')&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17021)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17022)==0&false))) {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(17023);break parse;
                    }
                    }__CLR4_4_1c9nc9nlgchor27.R.inc(17024);limit--;
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17025);position++;
                }

                }__CLR4_4_1c9nc9nlgchor27.R.inc(17026);count = digitCount(text, position, 2);
                __CLR4_4_1c9nc9nlgchor27.R.inc(17027);if ((((count == 0 && !expectSeparators)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17028)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17029)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17030);break parse;
                } }else {__CLR4_4_1c9nc9nlgchor27.R.inc(17031);if ((((count < 2)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17032)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17033)==0&false))) {{
                    // Need two digits for second.
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17034);return ~position;
                }

                }}__CLR4_4_1c9nc9nlgchor27.R.inc(17035);int seconds = FormatUtils.parseTwoDigits(text, position);
                __CLR4_4_1c9nc9nlgchor27.R.inc(17036);if ((((seconds > 59)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17037)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17038)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17039);return ~position;
                }
                }__CLR4_4_1c9nc9nlgchor27.R.inc(17040);offset += seconds * DateTimeConstants.MILLIS_PER_SECOND;
                __CLR4_4_1c9nc9nlgchor27.R.inc(17041);limit -= 2;
                __CLR4_4_1c9nc9nlgchor27.R.inc(17042);position += 2;

                // Proceed to parse fraction of second.

                __CLR4_4_1c9nc9nlgchor27.R.inc(17043);if ((((limit <= 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17044)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17045)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17046);break parse;
                }

                }__CLR4_4_1c9nc9nlgchor27.R.inc(17047);if ((((expectSeparators)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17048)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17049)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17050);if ((((text.charAt(position) != '.' && text.charAt(position) != ',')&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17051)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17052)==0&false))) {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(17053);break parse;
                    }
                    }__CLR4_4_1c9nc9nlgchor27.R.inc(17054);limit--;
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17055);position++;
                }

                }__CLR4_4_1c9nc9nlgchor27.R.inc(17056);count = digitCount(text, position, 3);
                __CLR4_4_1c9nc9nlgchor27.R.inc(17057);if ((((count == 0 && !expectSeparators)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17058)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17059)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17060);break parse;
                } }else {__CLR4_4_1c9nc9nlgchor27.R.inc(17061);if ((((count < 1)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17062)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17063)==0&false))) {{
                    // Need at least one digit for fraction of second.
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17064);return ~position;
                }

                }}__CLR4_4_1c9nc9nlgchor27.R.inc(17065);offset += (text.charAt(position++) - '0') * 100;
                __CLR4_4_1c9nc9nlgchor27.R.inc(17066);if ((((count > 1)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17067)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17068)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17069);offset += (text.charAt(position++) - '0') * 10;
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17070);if ((((count > 2)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17071)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17072)==0&false))) {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(17073);offset += text.charAt(position++) - '0';
                    }
                }}
            }}

            __CLR4_4_1c9nc9nlgchor27.R.inc(17074);bucket.setOffset(Integer.valueOf((((negative )&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17075)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17076)==0&false))? -offset : offset));
            __CLR4_4_1c9nc9nlgchor27.R.inc(17077);return position;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        /**
         * Returns actual amount of digits to parse, but no more than original
         * 'amount' parameter.
         */
        private int digitCount(CharSequence text, int position, int amount) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17078);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17079);int limit = Math.min(text.length() - position, amount);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17080);amount = 0;
            __CLR4_4_1c9nc9nlgchor27.R.inc(17081);for (; (((limit > 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17082)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17083)==0&false)); limit--) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17084);char c = text.charAt(position + amount);
                __CLR4_4_1c9nc9nlgchor27.R.inc(17085);if ((((c < '0' || c > '9')&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17086)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17087)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17088);break;
                }
                }__CLR4_4_1c9nc9nlgchor27.R.inc(17089);amount++;
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(17090);return amount;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class TimeZoneName
            implements InternalPrinter, InternalParser {

        static final int LONG_NAME = 0;
        static final int SHORT_NAME = 1;

        private final Map<String, DateTimeZone> iParseLookup;
        private final int iType;

        TimeZoneName(int type, Map<String, DateTimeZone> parseLookup) {
            super();__CLR4_4_1c9nc9nlgchor27.R.inc(17092);try{__CLR4_4_1c9nc9nlgchor27.R.inc(17091);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17093);iType = type;
            __CLR4_4_1c9nc9nlgchor27.R.inc(17094);iParseLookup = parseLookup;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int estimatePrintedLength() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17095);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17096);return ((((iType == SHORT_NAME )&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17097)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17098)==0&false))? 4 : 20);
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public void printTo(
                Appendable appendable, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17099);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17100);appendable.append(print(instant - displayOffset, displayZone, locale));
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        private String print(long instant, DateTimeZone displayZone, Locale locale) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17101);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17102);if ((((displayZone == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17103)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17104)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17105);return "";  // no zone
            }
            }boolean __CLB4_4_1_bool2=false;__CLR4_4_1c9nc9nlgchor27.R.inc(17106);switch (iType) {
                case LONG_NAME:if (!__CLB4_4_1_bool2) {__CLR4_4_1c9nc9nlgchor27.R.inc(17107);__CLB4_4_1_bool2=true;}
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17108);return displayZone.getName(instant, locale);
                case SHORT_NAME:if (!__CLB4_4_1_bool2) {__CLR4_4_1c9nc9nlgchor27.R.inc(17109);__CLB4_4_1_bool2=true;}
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17110);return displayZone.getShortName(instant, locale);
            }
            __CLR4_4_1c9nc9nlgchor27.R.inc(17111);return "";
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public void printTo(Appendable appendable, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17112);
            // no zone info
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17113);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17114);return ((((iType == SHORT_NAME )&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17115)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17116)==0&false))? 4 : 20);
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int parseInto(DateTimeParserBucket bucket, CharSequence text, int position) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17117);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17118);Map<String, DateTimeZone> parseLookup = iParseLookup;
            __CLR4_4_1c9nc9nlgchor27.R.inc(17119);parseLookup = ((((parseLookup != null )&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17120)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17121)==0&false))? parseLookup : DateTimeUtils.getDefaultTimeZoneNames());
            __CLR4_4_1c9nc9nlgchor27.R.inc(17122);String matched = null;
            __CLR4_4_1c9nc9nlgchor27.R.inc(17123);for (String name : parseLookup.keySet()) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17124);if ((((csStartsWith(text, position, name))&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17125)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17126)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17127);if ((((matched == null || name.length() > matched.length())&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17128)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17129)==0&false))) {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(17130);matched = name;
                    }
                }}
            }}
            }__CLR4_4_1c9nc9nlgchor27.R.inc(17131);if ((((matched != null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17132)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17133)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17134);bucket.setZone(parseLookup.get(matched));
                __CLR4_4_1c9nc9nlgchor27.R.inc(17135);return position + matched.length();
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(17136);return ~position;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static enum TimeZoneId
            implements InternalPrinter, InternalParser {

        INSTANCE;
        private static final List<String> ALL_IDS;
        // groups are "Europe/A", "Europe/B", "Europe/C", etc
        // group of "" is for zones that do not have a "/" in the name
        private static final Map<String, List<String>> GROUPED_IDS;
        private static final List<String> BASE_GROUPED_IDS = new ArrayList<String>();
        static final int MAX_LENGTH;
        static final int MAX_PREFIX_LENGTH;

        static {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17137);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17138);ALL_IDS = new ArrayList<String>(DateTimeZone.getAvailableIDs());
            __CLR4_4_1c9nc9nlgchor27.R.inc(17139);Collections.sort(ALL_IDS);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17140);GROUPED_IDS = new HashMap<String, List<String>>();
            __CLR4_4_1c9nc9nlgchor27.R.inc(17141);int max = 0;
            __CLR4_4_1c9nc9nlgchor27.R.inc(17142);int maxPrefix = 0;
            __CLR4_4_1c9nc9nlgchor27.R.inc(17143);for (String id : ALL_IDS) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17144);int pos = id.indexOf('/');
                __CLR4_4_1c9nc9nlgchor27.R.inc(17145);if ((((pos >= 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17146)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17147)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17148);if ((((pos < id.length())&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17149)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17150)==0&false))) {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(17151);pos++;
                    }
                    }__CLR4_4_1c9nc9nlgchor27.R.inc(17152);maxPrefix = Math.max(maxPrefix, pos);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17153);String prefix = id.substring(0, pos + 1);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17154);String suffix = id.substring(pos);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17155);if ((((!GROUPED_IDS.containsKey(prefix))&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17156)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17157)==0&false))) {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(17158);GROUPED_IDS.put(prefix, new ArrayList<String>());
                    }
                    }__CLR4_4_1c9nc9nlgchor27.R.inc(17159);GROUPED_IDS.get(prefix).add(suffix);
                } }else {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17160);BASE_GROUPED_IDS.add(id);
                }
                }__CLR4_4_1c9nc9nlgchor27.R.inc(17161);max = Math.max(max, id.length());
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(17162);MAX_LENGTH = max;
            __CLR4_4_1c9nc9nlgchor27.R.inc(17163);MAX_PREFIX_LENGTH = maxPrefix;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int estimatePrintedLength() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17164);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17165);return MAX_LENGTH;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public void printTo(
                Appendable appendable, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17166);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17167);appendable.append((((displayZone != null )&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17168)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17169)==0&false))? displayZone.getID() : "");
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public void printTo(Appendable appendable, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17170);
            // no zone info
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17171);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17172);return MAX_LENGTH;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int parseInto(DateTimeParserBucket bucket, CharSequence text, int position) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17173);
            // select the base set of identifiers that do not have a slash
            __CLR4_4_1c9nc9nlgchor27.R.inc(17174);List<String> suffixSet = BASE_GROUPED_IDS;
            // hunt for a slash only as far as the max prefix length
            __CLR4_4_1c9nc9nlgchor27.R.inc(17175);int textLen = text.length();
            __CLR4_4_1c9nc9nlgchor27.R.inc(17176);int matchLen = Math.min(textLen, position + MAX_PREFIX_LENGTH);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17177);int pos = position;
            __CLR4_4_1c9nc9nlgchor27.R.inc(17178);String prefix = "";
            __CLR4_4_1c9nc9nlgchor27.R.inc(17179);for (int i = pos; (((i < matchLen)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17180)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17181)==0&false)); i++) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17182);if ((((text.charAt(i) == '/')&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17183)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17184)==0&false))) {{
                    // when a slash is found, determine the prefix, such as "Europe/A" and lookup to get suffixes
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17185);prefix = text.subSequence(pos, i + 1).toString();
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17186);pos += prefix.length();
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17187);String prefixLookup = prefix;
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17188);if ((((i < textLen)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17189)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17190)==0&false))) {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(17191);prefixLookup += text.charAt(i + 1);
                    }
                    }__CLR4_4_1c9nc9nlgchor27.R.inc(17192);suffixSet = GROUPED_IDS.get(prefixLookup);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17193);if ((((suffixSet == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17194)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17195)==0&false))) {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(17196);return ~position;
                    }
                    }__CLR4_4_1c9nc9nlgchor27.R.inc(17197);break;
                }
            }}
            // search all suffixes, hopefully a relatively small number due to prefix search
            }__CLR4_4_1c9nc9nlgchor27.R.inc(17198);String best = null;
            __CLR4_4_1c9nc9nlgchor27.R.inc(17199);for (int i = 0; (((i < suffixSet.size())&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17200)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17201)==0&false)); i++) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17202);String suffix = suffixSet.get(i);
                __CLR4_4_1c9nc9nlgchor27.R.inc(17203);if ((((csStartsWith(text, pos, suffix))&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17204)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17205)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17206);if ((((best == null || suffix.length() > best.length())&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17207)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17208)==0&false))) {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(17209);best = suffix;
                    }
                }}
            }}
            // if found then store, else fail
            }__CLR4_4_1c9nc9nlgchor27.R.inc(17210);if ((((best != null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17211)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17212)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17213);bucket.setZone(DateTimeZone.forID(prefix + best));
                __CLR4_4_1c9nc9nlgchor27.R.inc(17214);return pos + best.length();
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(17215);return ~position;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    }

    //-----------------------------------------------------------------------
    static class Composite
            implements InternalPrinter, InternalParser {

        private final InternalPrinter[] iPrinters;
        private final InternalParser[] iParsers;

        private final int iPrintedLengthEstimate;
        private final int iParsedLengthEstimate;

        Composite(List<Object> elementPairs) {
            super();__CLR4_4_1c9nc9nlgchor27.R.inc(17217);try{__CLR4_4_1c9nc9nlgchor27.R.inc(17216);

            __CLR4_4_1c9nc9nlgchor27.R.inc(17218);List<Object> printerList = new ArrayList<Object>();
            __CLR4_4_1c9nc9nlgchor27.R.inc(17219);List<Object> parserList = new ArrayList<Object>();

            __CLR4_4_1c9nc9nlgchor27.R.inc(17220);decompose(elementPairs, printerList, parserList);

            __CLR4_4_1c9nc9nlgchor27.R.inc(17221);if ((((printerList.contains(null) || printerList.isEmpty())&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17222)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17223)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17224);iPrinters = null;
                __CLR4_4_1c9nc9nlgchor27.R.inc(17225);iPrintedLengthEstimate = 0;
            } }else {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17226);int size = printerList.size();
                __CLR4_4_1c9nc9nlgchor27.R.inc(17227);iPrinters = new InternalPrinter[size];
                __CLR4_4_1c9nc9nlgchor27.R.inc(17228);int printEst = 0;
                __CLR4_4_1c9nc9nlgchor27.R.inc(17229);for (int i = 0; (((i < size)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17230)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17231)==0&false)); i++) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17232);InternalPrinter printer = (InternalPrinter) printerList.get(i);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17233);printEst += printer.estimatePrintedLength();
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17234);iPrinters[i] = printer;
                }
                }__CLR4_4_1c9nc9nlgchor27.R.inc(17235);iPrintedLengthEstimate = printEst;
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(17236);if ((((parserList.contains(null) || parserList.isEmpty())&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17237)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17238)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17239);iParsers = null;
                __CLR4_4_1c9nc9nlgchor27.R.inc(17240);iParsedLengthEstimate = 0;
            } }else {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17241);int size = parserList.size();
                __CLR4_4_1c9nc9nlgchor27.R.inc(17242);iParsers = new InternalParser[size];
                __CLR4_4_1c9nc9nlgchor27.R.inc(17243);int parseEst = 0;
                __CLR4_4_1c9nc9nlgchor27.R.inc(17244);for (int i = 0; (((i < size)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17245)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17246)==0&false)); i++) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17247);InternalParser parser = (InternalParser) parserList.get(i);
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17248);parseEst += parser.estimateParsedLength();
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17249);iParsers[i] = parser;
                }
                }__CLR4_4_1c9nc9nlgchor27.R.inc(17250);iParsedLengthEstimate = parseEst;
            }
        }}finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int estimatePrintedLength() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17251);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17252);return iPrintedLengthEstimate;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public void printTo(
                Appendable appendable, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17253);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17254);InternalPrinter[] elements = iPrinters;
            __CLR4_4_1c9nc9nlgchor27.R.inc(17255);if ((((elements == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17256)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17257)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17258);throw new UnsupportedOperationException();
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(17259);if ((((locale == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17260)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17261)==0&false))) {{
                // Guard against default locale changing concurrently.
                __CLR4_4_1c9nc9nlgchor27.R.inc(17262);locale = Locale.getDefault();
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(17263);int len = elements.length;
            __CLR4_4_1c9nc9nlgchor27.R.inc(17264);for (int i = 0; (((i < len)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17265)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17266)==0&false)); i++) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17267);elements[i].printTo(appendable, instant, chrono, displayOffset, displayZone, locale);
            }
        }}finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public void printTo(Appendable appendable, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17268);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17269);InternalPrinter[] elements = iPrinters;
            __CLR4_4_1c9nc9nlgchor27.R.inc(17270);if ((((elements == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17271)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17272)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17273);throw new UnsupportedOperationException();
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(17274);if ((((locale == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17275)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17276)==0&false))) {{
                // Guard against default locale changing concurrently.
                __CLR4_4_1c9nc9nlgchor27.R.inc(17277);locale = Locale.getDefault();
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(17278);int len = elements.length;
            __CLR4_4_1c9nc9nlgchor27.R.inc(17279);for (int i = 0; (((i < len)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17280)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17281)==0&false)); i++) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17282);elements[i].printTo(appendable, partial, locale);
            }
        }}finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17283);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17284);return iParsedLengthEstimate;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int parseInto(DateTimeParserBucket bucket, CharSequence text, int position) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17285);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17286);InternalParser[] elements = iParsers;
            __CLR4_4_1c9nc9nlgchor27.R.inc(17287);if ((((elements == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17288)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17289)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17290);throw new UnsupportedOperationException();
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(17291);int len = elements.length;
            __CLR4_4_1c9nc9nlgchor27.R.inc(17292);for (int i = 0; (((i < len && position >= 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17293)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17294)==0&false)); i++) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17295);position = elements[i].parseInto(bucket, text, position);
            }
            }__CLR4_4_1c9nc9nlgchor27.R.inc(17296);return position;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        boolean isPrinter() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17297);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17298);return iPrinters != null;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        boolean isParser() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17299);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17300);return iParsers != null;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        /**
         * Processes the element pairs, putting results into the given printer
         * and parser lists.
         */
        private void decompose(List<Object> elementPairs, List<Object> printerList, List<Object> parserList) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17301);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17302);int size = elementPairs.size();
            __CLR4_4_1c9nc9nlgchor27.R.inc(17303);for (int i = 0; (((i < size)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17304)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17305)==0&false)); i += 2) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17306);Object element = elementPairs.get(i);
                __CLR4_4_1c9nc9nlgchor27.R.inc(17307);if ((((element instanceof Composite)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17308)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17309)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17310);addArrayToList(printerList, ((Composite) element).iPrinters);
                } }else {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17311);printerList.add(element);
                }

                }__CLR4_4_1c9nc9nlgchor27.R.inc(17312);element = elementPairs.get(i + 1);
                __CLR4_4_1c9nc9nlgchor27.R.inc(17313);if ((((element instanceof Composite)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17314)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17315)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17316);addArrayToList(parserList, ((Composite) element).iParsers);
                } }else {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17317);parserList.add(element);
                }
            }}
        }}finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        private void addArrayToList(List<Object> list, Object[] array) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17318);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17319);if ((((array != null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17320)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17321)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17322);for (int i = 0; (((i < array.length)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17323)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17324)==0&false)); i++) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17325);list.add(array[i]);
                }
            }}
        }}finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MatchingParser
            implements InternalParser {

        private final InternalParser[] iParsers;
        private final int iParsedLengthEstimate;

        MatchingParser(InternalParser[] parsers) {
            super();__CLR4_4_1c9nc9nlgchor27.R.inc(17327);try{__CLR4_4_1c9nc9nlgchor27.R.inc(17326);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17328);iParsers = parsers;
            __CLR4_4_1c9nc9nlgchor27.R.inc(17329);int est = 0;
            __CLR4_4_1c9nc9nlgchor27.R.inc(17330);for (int i = parsers.length; (((--i >= 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17331)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17332)==0&false)); ) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17333);InternalParser parser = parsers[i];
                __CLR4_4_1c9nc9nlgchor27.R.inc(17334);if ((((parser != null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17335)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17336)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17337);int len = parser.estimateParsedLength();
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17338);if ((((len > est)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17339)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17340)==0&false))) {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(17341);est = len;
                    }
                }}
            }}
            }__CLR4_4_1c9nc9nlgchor27.R.inc(17342);iParsedLengthEstimate = est;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17343);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17344);return iParsedLengthEstimate;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

        public int parseInto(DateTimeParserBucket bucket, CharSequence text, int position) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17345);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17346);InternalParser[] parsers = iParsers;
            __CLR4_4_1c9nc9nlgchor27.R.inc(17347);int length = parsers.length;

            __CLR4_4_1c9nc9nlgchor27.R.inc(17348);final Object originalState = bucket.saveState();
            __CLR4_4_1c9nc9nlgchor27.R.inc(17349);boolean isOptional = false;

            __CLR4_4_1c9nc9nlgchor27.R.inc(17350);int bestValidPos = position;
            __CLR4_4_1c9nc9nlgchor27.R.inc(17351);Object bestValidState = null;

            __CLR4_4_1c9nc9nlgchor27.R.inc(17352);int bestInvalidPos = position;

            __CLR4_4_1c9nc9nlgchor27.R.inc(17353);for (int i = 0; (((i < length)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17354)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17355)==0&false)); i++) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17356);InternalParser parser = parsers[i];
                __CLR4_4_1c9nc9nlgchor27.R.inc(17357);if ((((parser == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17358)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17359)==0&false))) {{
                    // The empty parser wins only if nothing is better.
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17360);if ((((bestValidPos <= position)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17361)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17362)==0&false))) {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(17363);return position;
                    }
                    }__CLR4_4_1c9nc9nlgchor27.R.inc(17364);isOptional = true;
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17365);break;
                }
                }__CLR4_4_1c9nc9nlgchor27.R.inc(17366);int parsePos = parser.parseInto(bucket, text, position);
                __CLR4_4_1c9nc9nlgchor27.R.inc(17367);if ((((parsePos >= position)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17368)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17369)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17370);if ((((parsePos > bestValidPos)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17371)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17372)==0&false))) {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(17373);if ((((parsePos >= text.length() ||
                                (i + 1) >= length || parsers[i + 1] == null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17374)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17375)==0&false))) {{

                            // Completely parsed text or no more parsers to
                            // check. Skip the rest.
                            __CLR4_4_1c9nc9nlgchor27.R.inc(17376);return parsePos;
                        }
                        }__CLR4_4_1c9nc9nlgchor27.R.inc(17377);bestValidPos = parsePos;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(17378);bestValidState = bucket.saveState();
                    }
                }} }else {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17379);if ((((parsePos < 0)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17380)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17381)==0&false))) {{
                        __CLR4_4_1c9nc9nlgchor27.R.inc(17382);parsePos = ~parsePos;
                        __CLR4_4_1c9nc9nlgchor27.R.inc(17383);if ((((parsePos > bestInvalidPos)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17384)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17385)==0&false))) {{
                            __CLR4_4_1c9nc9nlgchor27.R.inc(17386);bestInvalidPos = parsePos;
                        }
                    }}
                }}
                }__CLR4_4_1c9nc9nlgchor27.R.inc(17387);bucket.restoreState(originalState);
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(17388);if ((((bestValidPos > position || (bestValidPos == position && isOptional))&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17389)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17390)==0&false))) {{
                // Restore the state to the best valid parse.
                __CLR4_4_1c9nc9nlgchor27.R.inc(17391);if ((((bestValidState != null)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17392)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17393)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17394);bucket.restoreState(bestValidState);
                }
                }__CLR4_4_1c9nc9nlgchor27.R.inc(17395);return bestValidPos;
            }

            }__CLR4_4_1c9nc9nlgchor27.R.inc(17396);return ~bestInvalidPos;
        }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}
    }

    static boolean csStartsWith(CharSequence text, int position, String search) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17397);
        __CLR4_4_1c9nc9nlgchor27.R.inc(17398);int searchLen = search.length();
        __CLR4_4_1c9nc9nlgchor27.R.inc(17399);if (((((text.length() - position) < searchLen)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17400)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17401)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(17402);return false;
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(17403);for (int i = 0; (((i < searchLen)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17404)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17405)==0&false)); i++) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(17406);if ((((text.charAt(position + i) != search.charAt(i))&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17407)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17408)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17409);return false;
            }
        }}
        }__CLR4_4_1c9nc9nlgchor27.R.inc(17410);return true;
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

    static boolean csStartsWithIgnoreCase(CharSequence text, int position, String search) {try{__CLR4_4_1c9nc9nlgchor27.R.inc(17411);
        __CLR4_4_1c9nc9nlgchor27.R.inc(17412);int searchLen = search.length();
        __CLR4_4_1c9nc9nlgchor27.R.inc(17413);if (((((text.length() - position) < searchLen)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17414)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17415)==0&false))) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(17416);return false;
        }
        }__CLR4_4_1c9nc9nlgchor27.R.inc(17417);for (int i = 0; (((i < searchLen)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17418)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17419)==0&false)); i++) {{
            __CLR4_4_1c9nc9nlgchor27.R.inc(17420);char ch1 = text.charAt(position + i);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17421);char ch2 = search.charAt(i);
            __CLR4_4_1c9nc9nlgchor27.R.inc(17422);if ((((ch1 != ch2)&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17423)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17424)==0&false))) {{
                __CLR4_4_1c9nc9nlgchor27.R.inc(17425);char u1 = Character.toUpperCase(ch1);
                __CLR4_4_1c9nc9nlgchor27.R.inc(17426);char u2 = Character.toUpperCase(ch2);
                __CLR4_4_1c9nc9nlgchor27.R.inc(17427);if ((((u1 != u2 && Character.toLowerCase(u1) != Character.toLowerCase(u2))&&(__CLR4_4_1c9nc9nlgchor27.R.iget(17428)!=0|true))||(__CLR4_4_1c9nc9nlgchor27.R.iget(17429)==0&false))) {{
                    __CLR4_4_1c9nc9nlgchor27.R.inc(17430);return false;
                }
            }}
        }}
        }__CLR4_4_1c9nc9nlgchor27.R.inc(17431);return true;
    }finally{__CLR4_4_1c9nc9nlgchor27.R.flushNeeded();}}

}
