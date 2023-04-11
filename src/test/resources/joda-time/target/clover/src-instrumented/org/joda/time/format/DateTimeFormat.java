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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

/**
 * Factory that creates instances of DateTimeFormatter from patterns and styles.
 * <p>
 * Datetime formatting is performed by the {@link DateTimeFormatter} class.
 * Three classes provide factory methods to create formatters, and this is one.
 * The others are {@link ISODateTimeFormat} and {@link DateTimeFormatterBuilder}.
 * <p>
 * This class provides two types of factory:
 * <ul>
 * <li>{@link #forPattern(String) Pattern} provides a DateTimeFormatter based on
 * a pattern string that is mostly compatible with the JDK date patterns.
 * <li>{@link #forStyle(String) Style} provides a DateTimeFormatter based on a
 * two character style, representing short, medium, long and full.
 * </ul>
 * <p>
 * For example, to use a pattern:
 * <pre>
 * DateTime dt = new DateTime();
 * DateTimeFormatter fmt = DateTimeFormat.forPattern("MMMM, yyyy");
 * String str = fmt.print(dt);
 * </pre>
 * <p>
 * The pattern syntax is mostly compatible with java.text.SimpleDateFormat -
 * time zone names cannot be parsed and a few more symbols are supported.
 * All ASCII letters are reserved as pattern letters, which are defined as follows:
 * <blockquote>
 * <pre>
 * Symbol  Meaning                      Presentation  Examples
 * ------  -------                      ------------  -------
 * G       era                          text          AD
 * C       century of era (&gt;=0)         number        20
 * Y       year of era (&gt;=0)            year          1996
 *
 * x       weekyear                     year          1996
 * w       week of weekyear             number        27
 * e       day of week                  number        2
 * E       day of week                  text          Tuesday; Tue
 *
 * y       year                         year          1996
 * D       day of year                  number        189
 * M       month of year                month         July; Jul; 07
 * d       day of month                 number        10
 *
 * a       halfday of day               text          PM
 * K       hour of halfday (0~11)       number        0
 * h       clockhour of halfday (1~12)  number        12
 *
 * H       hour of day (0~23)           number        0
 * k       clockhour of day (1~24)      number        24
 * m       minute of hour               number        30
 * s       second of minute             number        55
 * S       fraction of second           millis        978
 *
 * z       time zone                    text          Pacific Standard Time; PST
 * Z       time zone offset/id          zone          -0800; -08:00; America/Los_Angeles
 *
 * '       escape for text              delimiter
 * ''      single quote                 literal       '
 * </pre>
 * </blockquote>
 * The count of pattern letters determine the format.
 * <p>
 * <strong>Text</strong>: If the number of pattern letters is 4 or more,
 * the full form is used; otherwise a short or abbreviated form is used if
 * available.
 * <p>
 * <strong>Number</strong>: The minimum number of digits.
 * Shorter numbers are zero-padded to this amount.
 * When parsing, any number of digits are accepted.
 * <p>
 * <strong>Year</strong>: Numeric presentation for year and weekyear fields
 * are handled specially. For example, if the count of 'y' is 2, the year
 * will be displayed as the zero-based year of the century, which is two
 * digits.
 * <p>
 * <strong>Month</strong>: 3 or over, use text, otherwise use number.
 * <p>
 * <strong>Millis</strong>: The exact number of fractional digits.
 * If more millisecond digits are available then specified the number will be truncated,
 * if there are fewer than specified then the number will be zero-padded to the right.
 * When parsing, only the exact number of digits are accepted.
 * <p>
 * <strong>Zone</strong>: 'Z' outputs offset without a colon, 'ZZ' outputs
 * the offset with a colon, 'ZZZ' or more outputs the zone id.
 * <p>
 * <strong>Zone names</strong>: Time zone names ('z') cannot be parsed.
 * <p>
 * Any characters in the pattern that are not in the ranges of ['a'..'z']
 * and ['A'..'Z'] will be treated as quoted text. For instance, characters
 * like ':', '.', ' ', '#' and '?' will appear in the resulting time text
 * even they are not embraced within single quotes.
 * <p>
 * DateTimeFormat is thread-safe and immutable, and the formatters it returns
 * are as well.
 *
 * @author Brian S O'Neill
 * @author Maxim Zhao
 * @see ISODateTimeFormat
 * @see DateTimeFormatterBuilder
 * @since 1.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class DateTimeFormat {public static class __CLR4_4_1bpfbpflgchoqzy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,15601,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Style constant for FULL.
     */
    static final int FULL = 0;  // DateFormat.FULL
    /**
     * Style constant for LONG.
     */
    static final int LONG = 1;  // DateFormat.LONG
    /**
     * Style constant for MEDIUM.
     */
    static final int MEDIUM = 2;  // DateFormat.MEDIUM
    /**
     * Style constant for SHORT.
     */
    static final int SHORT = 3;  // DateFormat.SHORT
    /**
     * Style constant for NONE.
     */
    static final int NONE = 4;

    /**
     * Type constant for DATE only.
     */
    static final int DATE = 0;
    /**
     * Type constant for TIME only.
     */
    static final int TIME = 1;
    /**
     * Type constant for DATETIME.
     */
    static final int DATETIME = 2;

    /**
     * Maximum size of the pattern cache.
     */
    private static final int PATTERN_CACHE_SIZE = 500;
    /**
     * Maps patterns to formatters, patterns don't vary by locale. Size capped at PATTERN_CACHE_SIZE
     */
    private static final ConcurrentHashMap<String, DateTimeFormatter> cPatternCache = new ConcurrentHashMap<String, DateTimeFormatter>();
    /**
     * Maps patterns to formatters, patterns don't vary by locale.
     */
    private static final AtomicReferenceArray<DateTimeFormatter> cStyleCache = new AtomicReferenceArray<DateTimeFormatter>(25);

    //-----------------------------------------------------------------------

    /**
     * Factory to create a formatter from a pattern string.
     * The pattern string is described above in the class level javadoc.
     * It is very similar to SimpleDateFormat patterns.
     * <p>
     * The format may contain locale specific output, and this will change as
     * you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     * For example:
     * <pre>
     * DateTimeFormat.forPattern(pattern).withLocale(Locale.FRANCE).print(dt);
     * </pre>
     *
     * @param pattern pattern specification
     * @return the formatter
     * @throws IllegalArgumentException if the pattern is invalid
     */
    public static DateTimeFormatter forPattern(String pattern) {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15171);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15172);return createFormatterForPattern(pattern);
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    /**
     * Factory to create a format from a two character style pattern.
     * <p>
     * The first character is the date style, and the second character is the
     * time style. Specify a character of 'S' for short style, 'M' for medium,
     * 'L' for long, and 'F' for full.
     * A date or time may be omitted by specifying a style character '-'.
     * <p>
     * The returned formatter will dynamically adjust to the locale that
     * the print/parse takes place in. Thus you just call
     * {@link DateTimeFormatter#withLocale(Locale)} and the Short/Medium/Long/Full
     * style for that locale will be output. For example:
     * <pre>
     * DateTimeFormat.forStyle(style).withLocale(Locale.FRANCE).print(dt);
     * </pre>
     *
     * @param style two characters from the set {"S", "M", "L", "F", "-"}
     * @return the formatter
     * @throws IllegalArgumentException if the style is invalid
     */
    public static DateTimeFormatter forStyle(String style) {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15173);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15174);return createFormatterForStyle(style);
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    /**
     * Returns the pattern used by a particular style and locale.
     * <p>
     * The first character is the date style, and the second character is the
     * time style. Specify a character of 'S' for short style, 'M' for medium,
     * 'L' for long, and 'F' for full.
     * A date or time may be omitted by specifying a style character '-'.
     *
     * @param style  two characters from the set {"S", "M", "L", "F", "-"}
     * @param locale locale to use, null means default
     * @return the formatter
     * @throws IllegalArgumentException if the style is invalid
     * @since 1.3
     */
    public static String patternForStyle(String style, Locale locale) {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15175);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15176);DateTimeFormatter formatter = createFormatterForStyle(style);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15177);if ((((locale == null)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15178)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15179)==0&false))) {{
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15180);locale = Locale.getDefault();
        }
        // Not pretty, but it works.
        }__CLR4_4_1bpfbpflgchoqzy.R.inc(15181);return ((StyleFormatter) formatter.getPrinter0()).getPattern(locale);
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a format that outputs a short date format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     *
     * @return the formatter
     */
    public static DateTimeFormatter shortDate() {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15182);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15183);return createFormatterForStyleIndex(SHORT, NONE);
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    /**
     * Creates a format that outputs a short time format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     *
     * @return the formatter
     */
    public static DateTimeFormatter shortTime() {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15184);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15185);return createFormatterForStyleIndex(NONE, SHORT);
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    /**
     * Creates a format that outputs a short datetime format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     *
     * @return the formatter
     */
    public static DateTimeFormatter shortDateTime() {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15186);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15187);return createFormatterForStyleIndex(SHORT, SHORT);
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a format that outputs a medium date format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     *
     * @return the formatter
     */
    public static DateTimeFormatter mediumDate() {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15188);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15189);return createFormatterForStyleIndex(MEDIUM, NONE);
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    /**
     * Creates a format that outputs a medium time format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     *
     * @return the formatter
     */
    public static DateTimeFormatter mediumTime() {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15190);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15191);return createFormatterForStyleIndex(NONE, MEDIUM);
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    /**
     * Creates a format that outputs a medium datetime format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     *
     * @return the formatter
     */
    public static DateTimeFormatter mediumDateTime() {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15192);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15193);return createFormatterForStyleIndex(MEDIUM, MEDIUM);
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a format that outputs a long date format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     *
     * @return the formatter
     */
    public static DateTimeFormatter longDate() {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15194);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15195);return createFormatterForStyleIndex(LONG, NONE);
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    /**
     * Creates a format that outputs a long time format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     *
     * @return the formatter
     */
    public static DateTimeFormatter longTime() {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15196);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15197);return createFormatterForStyleIndex(NONE, LONG);
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    /**
     * Creates a format that outputs a long datetime format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     *
     * @return the formatter
     */
    public static DateTimeFormatter longDateTime() {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15198);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15199);return createFormatterForStyleIndex(LONG, LONG);
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a format that outputs a full date format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     *
     * @return the formatter
     */
    public static DateTimeFormatter fullDate() {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15200);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15201);return createFormatterForStyleIndex(FULL, NONE);
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    /**
     * Creates a format that outputs a full time format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     *
     * @return the formatter
     */
    public static DateTimeFormatter fullTime() {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15202);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15203);return createFormatterForStyleIndex(NONE, FULL);
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    /**
     * Creates a format that outputs a full datetime format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     *
     * @return the formatter
     */
    public static DateTimeFormatter fullDateTime() {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15204);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15205);return createFormatterForStyleIndex(FULL, FULL);
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Parses the given pattern and appends the rules to the given
     * DateTimeFormatterBuilder.
     *
     * @param pattern pattern specification
     * @throws IllegalArgumentException if the pattern is invalid
     */
    static void appendPatternTo(DateTimeFormatterBuilder builder, String pattern) {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15206);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15207);parsePatternTo(builder, pattern);
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructor.
     *
     * @since 1.1 (previously private)
     */
    protected DateTimeFormat() {
        super();__CLR4_4_1bpfbpflgchoqzy.R.inc(15209);try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15208);
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Parses the given pattern and appends the rules to the given
     * DateTimeFormatterBuilder.
     *
     * @param pattern pattern specification
     * @throws IllegalArgumentException if the pattern is invalid
     * @see #forPattern
     */
    private static void parsePatternTo(DateTimeFormatterBuilder builder, String pattern) {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15210);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15211);int length = pattern.length();
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15212);int[] indexRef = new int[1];

        __CLR4_4_1bpfbpflgchoqzy.R.inc(15213);for (int i = 0; (((i < length)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15214)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15215)==0&false)); i++) {{
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15216);indexRef[0] = i;
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15217);String token = parseToken(pattern, indexRef);
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15218);i = indexRef[0];

            __CLR4_4_1bpfbpflgchoqzy.R.inc(15219);int tokenLen = token.length();
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15220);if ((((tokenLen == 0)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15221)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15222)==0&false))) {{
                __CLR4_4_1bpfbpflgchoqzy.R.inc(15223);break;
            }
            }__CLR4_4_1bpfbpflgchoqzy.R.inc(15224);char c = token.charAt(0);

            boolean __CLB4_4_1_bool0=false;__CLR4_4_1bpfbpflgchoqzy.R.inc(15225);switch (c) {
                case 'G':if (!__CLB4_4_1_bool0) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15226);__CLB4_4_1_bool0=true;} // era designator (text)
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15227);builder.appendEraText();
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15228);break;
                case 'C':if (!__CLB4_4_1_bool0) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15229);__CLB4_4_1_bool0=true;} // century of era (number)
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15230);builder.appendCenturyOfEra(tokenLen, tokenLen);
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15231);break;
                case 'x':if (!__CLB4_4_1_bool0) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15232);__CLB4_4_1_bool0=true;} // weekyear (number)
                case 'y':if (!__CLB4_4_1_bool0) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15233);__CLB4_4_1_bool0=true;} // year (number)
                case 'Y':if (!__CLB4_4_1_bool0) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15234);__CLB4_4_1_bool0=true;} // year of era (number)
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15235);if ((((tokenLen == 2)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15236)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15237)==0&false))) {{
                        __CLR4_4_1bpfbpflgchoqzy.R.inc(15238);boolean lenientParse = true;

                        // Peek ahead to next token.
                        __CLR4_4_1bpfbpflgchoqzy.R.inc(15239);if ((((i + 1 < length)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15240)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15241)==0&false))) {{
                            __CLR4_4_1bpfbpflgchoqzy.R.inc(15242);indexRef[0]++;
                            __CLR4_4_1bpfbpflgchoqzy.R.inc(15243);if ((((isNumericToken(parseToken(pattern, indexRef)))&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15244)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15245)==0&false))) {{
                                // If next token is a number, cannot support
                                // lenient parse, because it will consume digits
                                // that it should not.
                                __CLR4_4_1bpfbpflgchoqzy.R.inc(15246);lenientParse = false;
                            }
                            }__CLR4_4_1bpfbpflgchoqzy.R.inc(15247);indexRef[0]--;
                        }

                        // Use pivots which are compatible with SimpleDateFormat.
                        }boolean __CLB4_4_1_bool1=false;__CLR4_4_1bpfbpflgchoqzy.R.inc(15248);switch (c) {
                            case 'x':if (!__CLB4_4_1_bool1) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15249);__CLB4_4_1_bool1=true;}
                                __CLR4_4_1bpfbpflgchoqzy.R.inc(15250);builder.appendTwoDigitWeekyear
                                        (new DateTime().getWeekyear() - 30, lenientParse);
                                __CLR4_4_1bpfbpflgchoqzy.R.inc(15251);break;
                            case 'y':if (!__CLB4_4_1_bool1) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15252);__CLB4_4_1_bool1=true;}
                            case 'Y':if (!__CLB4_4_1_bool1) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15253);__CLB4_4_1_bool1=true;}
                            default:if (!__CLB4_4_1_bool1) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15254);__CLB4_4_1_bool1=true;}
                                __CLR4_4_1bpfbpflgchoqzy.R.inc(15255);builder.appendTwoDigitYear(new DateTime().getYear() - 30, lenientParse);
                                __CLR4_4_1bpfbpflgchoqzy.R.inc(15256);break;
                        }
                    } }else {{
                        // Try to support long year values.
                        __CLR4_4_1bpfbpflgchoqzy.R.inc(15257);int maxDigits = 9;

                        // Peek ahead to next token.
                        __CLR4_4_1bpfbpflgchoqzy.R.inc(15258);if ((((i + 1 < length)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15259)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15260)==0&false))) {{
                            __CLR4_4_1bpfbpflgchoqzy.R.inc(15261);indexRef[0]++;
                            __CLR4_4_1bpfbpflgchoqzy.R.inc(15262);if ((((isNumericToken(parseToken(pattern, indexRef)))&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15263)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15264)==0&false))) {{
                                // If next token is a number, cannot support long years.
                                __CLR4_4_1bpfbpflgchoqzy.R.inc(15265);maxDigits = tokenLen;
                            }
                            }__CLR4_4_1bpfbpflgchoqzy.R.inc(15266);indexRef[0]--;
                        }

                        }boolean __CLB4_4_1_bool2=false;__CLR4_4_1bpfbpflgchoqzy.R.inc(15267);switch (c) {
                            case 'x':if (!__CLB4_4_1_bool2) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15268);__CLB4_4_1_bool2=true;}
                                __CLR4_4_1bpfbpflgchoqzy.R.inc(15269);builder.appendWeekyear(tokenLen, maxDigits);
                                __CLR4_4_1bpfbpflgchoqzy.R.inc(15270);break;
                            case 'y':if (!__CLB4_4_1_bool2) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15271);__CLB4_4_1_bool2=true;}
                                __CLR4_4_1bpfbpflgchoqzy.R.inc(15272);builder.appendYear(tokenLen, maxDigits);
                                __CLR4_4_1bpfbpflgchoqzy.R.inc(15273);break;
                            case 'Y':if (!__CLB4_4_1_bool2) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15274);__CLB4_4_1_bool2=true;}
                                __CLR4_4_1bpfbpflgchoqzy.R.inc(15275);builder.appendYearOfEra(tokenLen, maxDigits);
                                __CLR4_4_1bpfbpflgchoqzy.R.inc(15276);break;
                        }
                    }
                    }__CLR4_4_1bpfbpflgchoqzy.R.inc(15277);break;
                case 'M':if (!__CLB4_4_1_bool0) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15278);__CLB4_4_1_bool0=true;} // month of year (text and number)
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15279);if ((((tokenLen >= 3)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15280)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15281)==0&false))) {{
                        __CLR4_4_1bpfbpflgchoqzy.R.inc(15282);if ((((tokenLen >= 4)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15283)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15284)==0&false))) {{
                            __CLR4_4_1bpfbpflgchoqzy.R.inc(15285);builder.appendMonthOfYearText();
                        } }else {{
                            __CLR4_4_1bpfbpflgchoqzy.R.inc(15286);builder.appendMonthOfYearShortText();
                        }
                    }} }else {{
                        __CLR4_4_1bpfbpflgchoqzy.R.inc(15287);builder.appendMonthOfYear(tokenLen);
                    }
                    }__CLR4_4_1bpfbpflgchoqzy.R.inc(15288);break;
                case 'd':if (!__CLB4_4_1_bool0) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15289);__CLB4_4_1_bool0=true;} // day of month (number)
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15290);builder.appendDayOfMonth(tokenLen);
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15291);break;
                case 'a':if (!__CLB4_4_1_bool0) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15292);__CLB4_4_1_bool0=true;} // am/pm marker (text)
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15293);builder.appendHalfdayOfDayText();
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15294);break;
                case 'h':if (!__CLB4_4_1_bool0) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15295);__CLB4_4_1_bool0=true;} // clockhour of halfday (number, 1..12)
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15296);builder.appendClockhourOfHalfday(tokenLen);
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15297);break;
                case 'H':if (!__CLB4_4_1_bool0) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15298);__CLB4_4_1_bool0=true;} // hour of day (number, 0..23)
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15299);builder.appendHourOfDay(tokenLen);
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15300);break;
                case 'k':if (!__CLB4_4_1_bool0) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15301);__CLB4_4_1_bool0=true;} // clockhour of day (1..24)
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15302);builder.appendClockhourOfDay(tokenLen);
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15303);break;
                case 'K':if (!__CLB4_4_1_bool0) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15304);__CLB4_4_1_bool0=true;} // hour of halfday (0..11)
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15305);builder.appendHourOfHalfday(tokenLen);
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15306);break;
                case 'm':if (!__CLB4_4_1_bool0) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15307);__CLB4_4_1_bool0=true;} // minute of hour (number)
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15308);builder.appendMinuteOfHour(tokenLen);
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15309);break;
                case 's':if (!__CLB4_4_1_bool0) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15310);__CLB4_4_1_bool0=true;} // second of minute (number)
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15311);builder.appendSecondOfMinute(tokenLen);
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15312);break;
                case 'S':if (!__CLB4_4_1_bool0) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15313);__CLB4_4_1_bool0=true;} // fraction of second (number)
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15314);builder.appendFractionOfSecond(tokenLen, tokenLen);
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15315);break;
                case 'e':if (!__CLB4_4_1_bool0) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15316);__CLB4_4_1_bool0=true;} // day of week (number)
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15317);builder.appendDayOfWeek(tokenLen);
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15318);break;
                case 'E':if (!__CLB4_4_1_bool0) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15319);__CLB4_4_1_bool0=true;} // dayOfWeek (text)
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15320);if ((((tokenLen >= 4)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15321)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15322)==0&false))) {{
                        __CLR4_4_1bpfbpflgchoqzy.R.inc(15323);builder.appendDayOfWeekText();
                    } }else {{
                        __CLR4_4_1bpfbpflgchoqzy.R.inc(15324);builder.appendDayOfWeekShortText();
                    }
                    }__CLR4_4_1bpfbpflgchoqzy.R.inc(15325);break;
                case 'D':if (!__CLB4_4_1_bool0) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15326);__CLB4_4_1_bool0=true;} // day of year (number)
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15327);builder.appendDayOfYear(tokenLen);
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15328);break;
                case 'w':if (!__CLB4_4_1_bool0) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15329);__CLB4_4_1_bool0=true;} // week of weekyear (number)
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15330);builder.appendWeekOfWeekyear(tokenLen);
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15331);break;
                case 'z':if (!__CLB4_4_1_bool0) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15332);__CLB4_4_1_bool0=true;} // time zone (text)
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15333);if ((((tokenLen >= 4)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15334)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15335)==0&false))) {{
                        __CLR4_4_1bpfbpflgchoqzy.R.inc(15336);builder.appendTimeZoneName();
                    } }else {{
                        __CLR4_4_1bpfbpflgchoqzy.R.inc(15337);builder.appendTimeZoneShortName(null);
                    }
                    }__CLR4_4_1bpfbpflgchoqzy.R.inc(15338);break;
                case 'Z':if (!__CLB4_4_1_bool0) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15339);__CLB4_4_1_bool0=true;} // time zone offset
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15340);if ((((tokenLen == 1)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15341)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15342)==0&false))) {{
                        __CLR4_4_1bpfbpflgchoqzy.R.inc(15343);builder.appendTimeZoneOffset(null, "Z", false, 2, 2);
                    } }else {__CLR4_4_1bpfbpflgchoqzy.R.inc(15344);if ((((tokenLen == 2)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15345)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15346)==0&false))) {{
                        __CLR4_4_1bpfbpflgchoqzy.R.inc(15347);builder.appendTimeZoneOffset(null, "Z", true, 2, 2);
                    } }else {{
                        __CLR4_4_1bpfbpflgchoqzy.R.inc(15348);builder.appendTimeZoneId();
                    }
                    }}__CLR4_4_1bpfbpflgchoqzy.R.inc(15349);break;
                case '\'':if (!__CLB4_4_1_bool0) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15350);__CLB4_4_1_bool0=true;} // literal text
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15351);String sub = token.substring(1);
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15352);if ((((sub.length() == 1)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15353)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15354)==0&false))) {{
                        __CLR4_4_1bpfbpflgchoqzy.R.inc(15355);builder.appendLiteral(sub.charAt(0));
                    } }else {{
                        // Create copy of sub since otherwise the temporary quoted
                        // string would still be referenced internally.
                        __CLR4_4_1bpfbpflgchoqzy.R.inc(15356);builder.appendLiteral(new String(sub));
                    }
                    }__CLR4_4_1bpfbpflgchoqzy.R.inc(15357);break;
                default:if (!__CLB4_4_1_bool0) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15358);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15359);throw new IllegalArgumentException
                            ("Illegal pattern component: " + token);
            }
        }
    }}finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    /**
     * Parses an individual token.
     *
     * @param pattern  the pattern string
     * @param indexRef a single element array, where the input is the start
     *                 location and the output is the location after parsing the token
     * @return the parsed token
     */
    private static String parseToken(String pattern, int[] indexRef) {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15360);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15361);StringBuilder buf = new StringBuilder();

        __CLR4_4_1bpfbpflgchoqzy.R.inc(15362);int i = indexRef[0];
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15363);int length = pattern.length();

        __CLR4_4_1bpfbpflgchoqzy.R.inc(15364);char c = pattern.charAt(i);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15365);if ((((c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15366)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15367)==0&false))) {{
            // Scan a run of the same character, which indicates a time
            // pattern.
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15368);buf.append(c);

            __CLR4_4_1bpfbpflgchoqzy.R.inc(15369);while ((((i + 1 < length)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15370)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15371)==0&false))) {{
                __CLR4_4_1bpfbpflgchoqzy.R.inc(15372);char peek = pattern.charAt(i + 1);
                __CLR4_4_1bpfbpflgchoqzy.R.inc(15373);if ((((peek == c)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15374)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15375)==0&false))) {{
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15376);buf.append(c);
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15377);i++;
                } }else {{
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15378);break;
                }
            }}
        }} }else {{
            // This will identify token as text.
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15379);buf.append('\'');

            __CLR4_4_1bpfbpflgchoqzy.R.inc(15380);boolean inLiteral = false;

            __CLR4_4_1bpfbpflgchoqzy.R.inc(15381);for (; (((i < length)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15382)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15383)==0&false)); i++) {{
                __CLR4_4_1bpfbpflgchoqzy.R.inc(15384);c = pattern.charAt(i);

                __CLR4_4_1bpfbpflgchoqzy.R.inc(15385);if ((((c == '\'')&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15386)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15387)==0&false))) {{
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15388);if ((((i + 1 < length && pattern.charAt(i + 1) == '\'')&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15389)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15390)==0&false))) {{
                        // '' is treated as escaped '
                        __CLR4_4_1bpfbpflgchoqzy.R.inc(15391);i++;
                        __CLR4_4_1bpfbpflgchoqzy.R.inc(15392);buf.append(c);
                    } }else {{
                        __CLR4_4_1bpfbpflgchoqzy.R.inc(15393);inLiteral = !inLiteral;
                    }
                }} }else {__CLR4_4_1bpfbpflgchoqzy.R.inc(15394);if ((((!inLiteral &&
                        (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z'))&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15395)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15396)==0&false))) {{
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15397);i--;
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15398);break;
                } }else {{
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15399);buf.append(c);
                }
            }}}
        }}

        }__CLR4_4_1bpfbpflgchoqzy.R.inc(15400);indexRef[0] = i;
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15401);return buf.toString();
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    /**
     * Returns true if token should be parsed as a numeric field.
     *
     * @param token the token to parse
     * @return true if numeric field
     */
    private static boolean isNumericToken(String token) {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15402);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15403);int tokenLen = token.length();
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15404);if ((((tokenLen > 0)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15405)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15406)==0&false))) {{
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15407);char c = token.charAt(0);
            boolean __CLB4_4_1_bool3=false;__CLR4_4_1bpfbpflgchoqzy.R.inc(15408);switch (c) {
                case 'c':if (!__CLB4_4_1_bool3) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15409);__CLB4_4_1_bool3=true;} // century (number)
                case 'C':if (!__CLB4_4_1_bool3) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15410);__CLB4_4_1_bool3=true;} // century of era (number)
                case 'x':if (!__CLB4_4_1_bool3) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15411);__CLB4_4_1_bool3=true;} // weekyear (number)
                case 'y':if (!__CLB4_4_1_bool3) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15412);__CLB4_4_1_bool3=true;} // year (number)
                case 'Y':if (!__CLB4_4_1_bool3) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15413);__CLB4_4_1_bool3=true;} // year of era (number)
                case 'd':if (!__CLB4_4_1_bool3) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15414);__CLB4_4_1_bool3=true;} // day of month (number)
                case 'h':if (!__CLB4_4_1_bool3) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15415);__CLB4_4_1_bool3=true;} // hour of day (number, 1..12)
                case 'H':if (!__CLB4_4_1_bool3) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15416);__CLB4_4_1_bool3=true;} // hour of day (number, 0..23)
                case 'm':if (!__CLB4_4_1_bool3) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15417);__CLB4_4_1_bool3=true;} // minute of hour (number)
                case 's':if (!__CLB4_4_1_bool3) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15418);__CLB4_4_1_bool3=true;} // second of minute (number)
                case 'S':if (!__CLB4_4_1_bool3) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15419);__CLB4_4_1_bool3=true;} // fraction of second (number)
                case 'e':if (!__CLB4_4_1_bool3) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15420);__CLB4_4_1_bool3=true;} // day of week (number)
                case 'D':if (!__CLB4_4_1_bool3) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15421);__CLB4_4_1_bool3=true;} // day of year (number)
                case 'F':if (!__CLB4_4_1_bool3) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15422);__CLB4_4_1_bool3=true;} // day of week in month (number)
                case 'w':if (!__CLB4_4_1_bool3) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15423);__CLB4_4_1_bool3=true;} // week of year (number)
                case 'W':if (!__CLB4_4_1_bool3) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15424);__CLB4_4_1_bool3=true;} // week of month (number)
                case 'k':if (!__CLB4_4_1_bool3) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15425);__CLB4_4_1_bool3=true;} // hour of day (1..24)
                case 'K':if (!__CLB4_4_1_bool3) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15426);__CLB4_4_1_bool3=true;} // hour of day (0..11)
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15427);return true;
                case 'M':if (!__CLB4_4_1_bool3) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15428);__CLB4_4_1_bool3=true;} // month of year (text and number)
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15429);if ((((tokenLen <= 2)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15430)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15431)==0&false))) {{
                        __CLR4_4_1bpfbpflgchoqzy.R.inc(15432);return true;
                    }
            }}
        }

        }__CLR4_4_1bpfbpflgchoqzy.R.inc(15433);return false;
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Select a format from a custom pattern.
     *
     * @param pattern pattern specification
     * @throws IllegalArgumentException if the pattern is invalid
     * @see #appendPatternTo
     */
    private static DateTimeFormatter createFormatterForPattern(String pattern) {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15434);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15435);if ((((pattern == null || pattern.length() == 0)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15436)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15437)==0&false))) {{
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15438);throw new IllegalArgumentException("Invalid pattern specification");
        }
        }__CLR4_4_1bpfbpflgchoqzy.R.inc(15439);DateTimeFormatter formatter = cPatternCache.get(pattern);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15440);if ((((formatter == null)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15441)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15442)==0&false))) {{
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15443);DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15444);parsePatternTo(builder, pattern);
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15445);formatter = builder.toFormatter();
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15446);if ((((cPatternCache.size() < PATTERN_CACHE_SIZE)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15447)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15448)==0&false))) {{
                // the size check is not locked against concurrent access,
                // but is accepted to be slightly off in contention scenarios.
                __CLR4_4_1bpfbpflgchoqzy.R.inc(15449);DateTimeFormatter oldFormatter = cPatternCache.putIfAbsent(pattern, formatter);
                __CLR4_4_1bpfbpflgchoqzy.R.inc(15450);if ((((oldFormatter != null)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15451)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15452)==0&false))) {{
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15453);formatter = oldFormatter;
                }
            }}
        }}
        }__CLR4_4_1bpfbpflgchoqzy.R.inc(15454);return formatter;
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    /**
     * Select a format from a two character style pattern. The first character
     * is the date style, and the second character is the time style. Specify a
     * character of 'S' for short style, 'M' for medium, 'L' for long, and 'F'
     * for full. A date or time may be omitted by specifying a style character '-'.
     *
     * @param style two characters from the set {"S", "M", "L", "F", "-"}
     * @throws IllegalArgumentException if the style is invalid
     */
    private static DateTimeFormatter createFormatterForStyle(String style) {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15455);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15456);if ((((style == null || style.length() != 2)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15457)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15458)==0&false))) {{
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15459);throw new IllegalArgumentException("Invalid style specification: " + style);
        }
        }__CLR4_4_1bpfbpflgchoqzy.R.inc(15460);int dateStyle = selectStyle(style.charAt(0));
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15461);int timeStyle = selectStyle(style.charAt(1));
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15462);if ((((dateStyle == NONE && timeStyle == NONE)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15463)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15464)==0&false))) {{
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15465);throw new IllegalArgumentException("Style '--' is invalid");
        }
        }__CLR4_4_1bpfbpflgchoqzy.R.inc(15466);return createFormatterForStyleIndex(dateStyle, timeStyle);
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    /**
     * Gets the formatter for the specified style.
     *
     * @param dateStyle the date style
     * @param timeStyle the time style
     * @return the formatter
     */
    private static DateTimeFormatter createFormatterForStyleIndex(int dateStyle, int timeStyle) {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15467);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15468);int index = ((dateStyle << 2) + dateStyle) + timeStyle;  // (dateStyle * 5 + timeStyle);
        // Should never happen but do a double check...
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15469);if ((((index >= cStyleCache.length())&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15470)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15471)==0&false))) {{
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15472);return createDateTimeFormatter(dateStyle, timeStyle);
        }
        }__CLR4_4_1bpfbpflgchoqzy.R.inc(15473);DateTimeFormatter f = cStyleCache.get(index);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15474);if ((((f == null)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15475)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15476)==0&false))) {{
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15477);f = createDateTimeFormatter(dateStyle, timeStyle);
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15478);if ((((cStyleCache.compareAndSet(index, null, f) == false)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15479)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15480)==0&false))) {{
                __CLR4_4_1bpfbpflgchoqzy.R.inc(15481);f = cStyleCache.get(index);
            }
        }}
        }__CLR4_4_1bpfbpflgchoqzy.R.inc(15482);return f;
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    /**
     * Creates a formatter for the specified style.
     *
     * @param dateStyle the date style
     * @param timeStyle the time style
     * @return the formatter
     */
    private static DateTimeFormatter createDateTimeFormatter(int dateStyle, int timeStyle) {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15483);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15484);int type = DATETIME;
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15485);if ((((dateStyle == NONE)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15486)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15487)==0&false))) {{
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15488);type = TIME;
        } }else {__CLR4_4_1bpfbpflgchoqzy.R.inc(15489);if ((((timeStyle == NONE)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15490)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15491)==0&false))) {{
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15492);type = DATE;
        }
        }}__CLR4_4_1bpfbpflgchoqzy.R.inc(15493);StyleFormatter llf = new StyleFormatter(dateStyle, timeStyle, type);
        __CLR4_4_1bpfbpflgchoqzy.R.inc(15494);return new DateTimeFormatter(llf, llf);
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    /**
     * Gets the JDK style code from the Joda code.
     *
     * @param ch the Joda style code
     * @return the JDK style code
     */
    private static int selectStyle(char ch) {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15495);
        boolean __CLB4_4_1_bool4=false;__CLR4_4_1bpfbpflgchoqzy.R.inc(15496);switch (ch) {
            case 'S':if (!__CLB4_4_1_bool4) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15497);__CLB4_4_1_bool4=true;}
                __CLR4_4_1bpfbpflgchoqzy.R.inc(15498);return SHORT;
            case 'M':if (!__CLB4_4_1_bool4) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15499);__CLB4_4_1_bool4=true;}
                __CLR4_4_1bpfbpflgchoqzy.R.inc(15500);return MEDIUM;
            case 'L':if (!__CLB4_4_1_bool4) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15501);__CLB4_4_1_bool4=true;}
                __CLR4_4_1bpfbpflgchoqzy.R.inc(15502);return LONG;
            case 'F':if (!__CLB4_4_1_bool4) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15503);__CLB4_4_1_bool4=true;}
                __CLR4_4_1bpfbpflgchoqzy.R.inc(15504);return FULL;
            case '-':if (!__CLB4_4_1_bool4) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15505);__CLB4_4_1_bool4=true;}
                __CLR4_4_1bpfbpflgchoqzy.R.inc(15506);return NONE;
            default:if (!__CLB4_4_1_bool4) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15507);__CLB4_4_1_bool4=true;}
                __CLR4_4_1bpfbpflgchoqzy.R.inc(15508);throw new IllegalArgumentException("Invalid style character: " + ch);
        }
    }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    static class StyleFormatter
            implements InternalPrinter, InternalParser {

        private static final ConcurrentHashMap<StyleFormatterCacheKey, DateTimeFormatter> cCache = new ConcurrentHashMap<StyleFormatterCacheKey, DateTimeFormatter>();

        private final int iDateStyle;
        private final int iTimeStyle;
        private final int iType;

        StyleFormatter(int dateStyle, int timeStyle, int type) {
            super();__CLR4_4_1bpfbpflgchoqzy.R.inc(15510);try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15509);
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15511);iDateStyle = dateStyle;
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15512);iTimeStyle = timeStyle;
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15513);iType = type;
        }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

        public int estimatePrintedLength() {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15514);
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15515);return 40;  // guess
        }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

        public void printTo(
                Appendable appenadble, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15516);
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15517);InternalPrinter p = getFormatter(locale).getPrinter0();
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15518);p.printTo(appenadble, instant, chrono, displayOffset, displayZone, locale);
        }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

        public void printTo(Appendable appendable, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15519);
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15520);InternalPrinter p = getFormatter(locale).getPrinter0();
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15521);p.printTo(appendable, partial, locale);
        }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15522);
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15523);return 40;  // guess
        }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

        public int parseInto(DateTimeParserBucket bucket, CharSequence text, int position) {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15524);
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15525);InternalParser p = getFormatter(bucket.getLocale()).getParser0();
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15526);return p.parseInto(bucket, text, position);
        }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

        private DateTimeFormatter getFormatter(Locale locale) {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15527);
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15528);locale = ((((locale == null )&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15529)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15530)==0&false))? Locale.getDefault() : locale);
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15531);StyleFormatterCacheKey key = new StyleFormatterCacheKey(iType, iDateStyle, iTimeStyle, locale);
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15532);DateTimeFormatter f = cCache.get(key);
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15533);if ((((f == null)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15534)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15535)==0&false))) {{
                __CLR4_4_1bpfbpflgchoqzy.R.inc(15536);f = DateTimeFormat.forPattern(getPattern(locale));
                __CLR4_4_1bpfbpflgchoqzy.R.inc(15537);DateTimeFormatter oldFormatter = cCache.putIfAbsent(key, f);
                __CLR4_4_1bpfbpflgchoqzy.R.inc(15538);if ((((oldFormatter != null)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15539)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15540)==0&false))) {{
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15541);f = oldFormatter;
                }
            }}
            }__CLR4_4_1bpfbpflgchoqzy.R.inc(15542);return f;
        }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

        String getPattern(Locale locale) {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15543);
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15544);DateFormat f = null;
            boolean __CLB4_4_1_bool5=false;__CLR4_4_1bpfbpflgchoqzy.R.inc(15545);switch (iType) {
                case DATE:if (!__CLB4_4_1_bool5) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15546);__CLB4_4_1_bool5=true;}
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15547);f = DateFormat.getDateInstance(iDateStyle, locale);
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15548);break;
                case TIME:if (!__CLB4_4_1_bool5) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15549);__CLB4_4_1_bool5=true;}
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15550);f = DateFormat.getTimeInstance(iTimeStyle, locale);
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15551);break;
                case DATETIME:if (!__CLB4_4_1_bool5) {__CLR4_4_1bpfbpflgchoqzy.R.inc(15552);__CLB4_4_1_bool5=true;}
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15553);f = DateFormat.getDateTimeInstance(iDateStyle, iTimeStyle, locale);
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15554);break;
            }
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15555);if ((((f instanceof SimpleDateFormat == false)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15556)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15557)==0&false))) {{
                __CLR4_4_1bpfbpflgchoqzy.R.inc(15558);throw new IllegalArgumentException("No datetime pattern for locale: " + locale);
            }
            }__CLR4_4_1bpfbpflgchoqzy.R.inc(15559);return ((SimpleDateFormat) f).toPattern();
        }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}
    }

    static class StyleFormatterCacheKey {
        private final int combinedTypeAndStyle;
        private final Locale locale;

        public StyleFormatterCacheKey(int iType, int iDateStyle,
                                      int iTimeStyle, Locale locale) {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15560);
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15561);this.locale = locale;
            // keeping old key generation logic of shifting type and style
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15562);this.combinedTypeAndStyle = iType + (iDateStyle << 4) + (iTimeStyle << 8);
        }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15563);
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15564);final int prime = 31;
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15565);int result = 1;
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15566);result = prime * result + combinedTypeAndStyle;
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15567);result = prime * result + (((((locale == null) )&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15568)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15569)==0&false))? 0 : locale.hashCode());
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15570);return result;
        }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}

        @Override
        public boolean equals(Object obj) {try{__CLR4_4_1bpfbpflgchoqzy.R.inc(15571);
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15572);if ((((this == obj)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15573)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15574)==0&false))) {{
                __CLR4_4_1bpfbpflgchoqzy.R.inc(15575);return true;
            }
            }__CLR4_4_1bpfbpflgchoqzy.R.inc(15576);if ((((obj == null)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15577)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15578)==0&false))) {{
                __CLR4_4_1bpfbpflgchoqzy.R.inc(15579);return false;
            }
            }__CLR4_4_1bpfbpflgchoqzy.R.inc(15580);if ((((!(obj instanceof StyleFormatterCacheKey))&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15581)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15582)==0&false))) {{
                __CLR4_4_1bpfbpflgchoqzy.R.inc(15583);return false;
            }
            }__CLR4_4_1bpfbpflgchoqzy.R.inc(15584);StyleFormatterCacheKey other = (StyleFormatterCacheKey) obj;
            __CLR4_4_1bpfbpflgchoqzy.R.inc(15585);if ((((combinedTypeAndStyle != other.combinedTypeAndStyle)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15586)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15587)==0&false))) {{
                __CLR4_4_1bpfbpflgchoqzy.R.inc(15588);return false;
            }
            }__CLR4_4_1bpfbpflgchoqzy.R.inc(15589);if ((((locale == null)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15590)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15591)==0&false))) {{
                __CLR4_4_1bpfbpflgchoqzy.R.inc(15592);if ((((other.locale != null)&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15593)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15594)==0&false))) {{
                    __CLR4_4_1bpfbpflgchoqzy.R.inc(15595);return false;
                }
            }} }else {__CLR4_4_1bpfbpflgchoqzy.R.inc(15596);if ((((!locale.equals(other.locale))&&(__CLR4_4_1bpfbpflgchoqzy.R.iget(15597)!=0|true))||(__CLR4_4_1bpfbpflgchoqzy.R.iget(15598)==0&false))) {{
                __CLR4_4_1bpfbpflgchoqzy.R.inc(15599);return false;
            }
            }}__CLR4_4_1bpfbpflgchoqzy.R.inc(15600);return true;
        }finally{__CLR4_4_1bpfbpflgchoqzy.R.flushNeeded();}}
    }
}
