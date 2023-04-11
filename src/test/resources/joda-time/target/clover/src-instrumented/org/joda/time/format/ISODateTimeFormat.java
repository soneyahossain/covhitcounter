/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.joda.time.DateTimeFieldType;

/**
 * Factory that creates instances of DateTimeFormatter based on the ISO8601 standard.
 * <p>
 * Date-time formatting is performed by the {@link DateTimeFormatter} class.
 * Three classes provide factory methods to create formatters, and this is one.
 * The others are {@link DateTimeFormat} and {@link DateTimeFormatterBuilder}.
 * <p>
 * ISO8601 is the international standard for data interchange. It defines a
 * framework, rather than an absolute standard. As a result this provider has a
 * number of methods that represent common uses of the framework. The most common
 * formats are {@link #date() date}, {@link #time() time}, and {@link #dateTime() dateTime}.
 * <p>
 * For example, to format a date time in ISO format:
 * <pre>
 * DateTime dt = new DateTime();
 * DateTimeFormatter fmt = ISODateTimeFormat.dateTime();
 * String str = fmt.print(dt);
 * </pre>
 * <p>
 * Note that these formatters mostly follow the ISO8601 standard for printing.
 * For parsing, the formatters are more lenient and allow formats that are not
 * in strict compliance with the standard.
 * <p>
 * It is important to understand that these formatters are not linked to
 * the <code>ISOChronology</code>. These formatters may be used with any
 * chronology, however there may be certain side effects with more unusual
 * chronologies. For example, the ISO formatters rely on dayOfWeek being
 * single digit, dayOfMonth being two digit and dayOfYear being three digit.
 * A chronology with a ten day week would thus cause issues. However, in
 * general, it is safe to use these formatters with other chronologies.
 * <p>
 * ISODateTimeFormat is thread-safe and immutable, and the formatters it
 * returns are as well.
 *
 * @author Brian S O'Neill
 * @see DateTimeFormat
 * @see DateTimeFormatterBuilder
 * @since 1.0
 */
public class ISODateTimeFormat {public static class __CLR4_4_1dw8dw8lgchor4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,18712,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constructor.
     *
     * @since 1.1 (previously private)
     */
    protected ISODateTimeFormat() {
        super();__CLR4_4_1dw8dw8lgchor4k.R.inc(18009);try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18008);
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a formatter that outputs only those fields specified.
     * <p>
     * This method examines the fields provided and returns an ISO-style
     * formatter that best fits. This can be useful for outputting
     * less-common ISO styles, such as YearMonth (YYYY-MM) or MonthDay (--MM-DD).
     * <p>
     * Note that parsing is often not supported by the resulting formatter, especially in basic mode.
     * <p>
     * The list provided may have overlapping fields, such as dayOfWeek and
     * dayOfMonth. In this case, the style is chosen based on the following
     * list, thus in the example, the calendar style is chosen as dayOfMonth
     * is higher in priority than dayOfWeek:
     * <ul>
     * <li>monthOfYear - calendar date style
     * <li>dayOfYear - ordinal date style
     * <li>weekOfWeekYear - week date style
     * <li>dayOfMonth - calendar date style
     * <li>dayOfWeek - week date style
     * <li>year
     * <li>weekyear
     * </ul>
     * The supported formats are:
     * <pre>
     * Extended      Basic       Fields
     * 2005-03-25    20050325    year/monthOfYear/dayOfMonth
     * 2005-03       2005-03     year/monthOfYear
     * 2005--25      2005--25    year/dayOfMonth *
     * 2005          2005        year
     * --03-25       --0325      monthOfYear/dayOfMonth
     * --03          --03        monthOfYear
     * ---03         ---03       dayOfMonth
     * 2005-084      2005084     year/dayOfYear
     * -084          -084        dayOfYear
     * 2005-W12-5    2005W125    weekyear/weekOfWeekyear/dayOfWeek
     * 2005-W-5      2005W-5     weekyear/dayOfWeek *
     * 2005-W12      2005W12     weekyear/weekOfWeekyear
     * -W12-5        -W125       weekOfWeekyear/dayOfWeek
     * -W12          -W12        weekOfWeekyear
     * -W-5          -W-5        dayOfWeek
     * 10:20:30.040  102030.040  hour/minute/second/milli
     * 10:20:30      102030      hour/minute/second
     * 10:20         1020        hour/minute
     * 10            10          hour
     * -20:30.040    -2030.040   minute/second/milli
     * -20:30        -2030       minute/second
     * -20           -20         minute
     * --30.040      --30.040    second/milli
     * --30          --30        second
     * ---.040       ---.040     milli *
     * 10-30.040     10-30.040   hour/second/milli *
     * 10:20-.040    1020-.040   hour/minute/milli *
     * 10-30         10-30       hour/second *
     * 10--.040      10--.040    hour/milli *
     * -20-.040      -20-.040    minute/milli *
     *   plus datetime formats like {date}T{time}
     * </pre>
     * * indicates that this is not an official ISO format and can be excluded
     * by passing in <code>strictISO</code> as <code>true</code>.
     * <p>
     * This method can side effect the input collection of fields.
     * If the input collection is modifiable, then each field that was added to
     * the formatter will be removed from the collection, including any duplicates.
     * If the input collection is unmodifiable then no side effect occurs.
     * <p>
     * This side effect processing is useful if you need to know whether all
     * the fields were converted into the formatter or not. To achieve this,
     * pass in a modifiable list, and check that it is empty on exit.
     *
     * @param fields    the fields to get a formatter for, not null,
     *                  updated by the method call unless unmodifiable,
     *                  removing those fields built in the formatter
     * @param extended  true to use the extended format (with separators)
     * @param strictISO true to stick exactly to ISO8601, false to include additional formats
     * @return a suitable formatter
     * @throws IllegalArgumentException if there is no format for the fields
     * @since 1.1
     */
    public static DateTimeFormatter forFields(
            Collection<DateTimeFieldType> fields,
            boolean extended,
            boolean strictISO) {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18010);

        __CLR4_4_1dw8dw8lgchor4k.R.inc(18011);if ((((fields == null || fields.size() == 0)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18012)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18013)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18014);throw new IllegalArgumentException("The fields must not be null or empty");
        }
        }__CLR4_4_1dw8dw8lgchor4k.R.inc(18015);Set<DateTimeFieldType> workingFields = new HashSet<DateTimeFieldType>(fields);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18016);int inputSize = workingFields.size();
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18017);boolean reducedPrec = false;
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18018);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        // date
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18019);if ((((workingFields.contains(DateTimeFieldType.monthOfYear()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18020)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18021)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18022);reducedPrec = dateByMonth(bld, workingFields, extended, strictISO);
        } }else {__CLR4_4_1dw8dw8lgchor4k.R.inc(18023);if ((((workingFields.contains(DateTimeFieldType.dayOfYear()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18024)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18025)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18026);reducedPrec = dateByOrdinal(bld, workingFields, extended, strictISO);
        } }else {__CLR4_4_1dw8dw8lgchor4k.R.inc(18027);if ((((workingFields.contains(DateTimeFieldType.weekOfWeekyear()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18028)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18029)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18030);reducedPrec = dateByWeek(bld, workingFields, extended, strictISO);
        } }else {__CLR4_4_1dw8dw8lgchor4k.R.inc(18031);if ((((workingFields.contains(DateTimeFieldType.dayOfMonth()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18032)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18033)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18034);reducedPrec = dateByMonth(bld, workingFields, extended, strictISO);
        } }else {__CLR4_4_1dw8dw8lgchor4k.R.inc(18035);if ((((workingFields.contains(DateTimeFieldType.dayOfWeek()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18036)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18037)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18038);reducedPrec = dateByWeek(bld, workingFields, extended, strictISO);
        } }else {__CLR4_4_1dw8dw8lgchor4k.R.inc(18039);if ((((workingFields.remove(DateTimeFieldType.year()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18040)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18041)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18042);bld.append(Constants.ye);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18043);reducedPrec = true;
        } }else {__CLR4_4_1dw8dw8lgchor4k.R.inc(18044);if ((((workingFields.remove(DateTimeFieldType.weekyear()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18045)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18046)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18047);bld.append(Constants.we);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18048);reducedPrec = true;
        }
        }}}}}}}__CLR4_4_1dw8dw8lgchor4k.R.inc(18049);boolean datePresent = (workingFields.size() < inputSize);

        // time
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18050);time(bld, workingFields, extended, strictISO, reducedPrec, datePresent);

        // result
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18051);if ((((bld.canBuildFormatter() == false)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18052)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18053)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18054);throw new IllegalArgumentException("No valid format for fields: " + fields);
        }

        // side effect the input collection to indicate the processed fields
        // handling unmodifiable collections with no side effect
        }__CLR4_4_1dw8dw8lgchor4k.R.inc(18055);try {
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18056);fields.retainAll(workingFields);
        } catch (UnsupportedOperationException ex) {
            // ignore, so we can handle unmodifiable collections
        }
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18057);return bld.toFormatter();
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a date using the calendar date format.
     * Specification reference: 5.2.1.
     *
     * @param bld       the builder
     * @param fields    the fields
     * @param extended  true to use extended format
     * @param strictISO true to only allow ISO formats
     * @return true if reduced precision
     * @since 1.1
     */
    private static boolean dateByMonth(
            DateTimeFormatterBuilder bld,
            Collection<DateTimeFieldType> fields,
            boolean extended,
            boolean strictISO) {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18058);

        __CLR4_4_1dw8dw8lgchor4k.R.inc(18059);boolean reducedPrec = false;
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18060);if ((((fields.remove(DateTimeFieldType.year()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18061)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18062)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18063);bld.append(Constants.ye);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18064);if ((((fields.remove(DateTimeFieldType.monthOfYear()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18065)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18066)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18067);if ((((fields.remove(DateTimeFieldType.dayOfMonth()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18068)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18069)==0&false))) {{
                    // YYYY-MM-DD/YYYYMMDD
                    __CLR4_4_1dw8dw8lgchor4k.R.inc(18070);appendSeparator(bld, extended);
                    __CLR4_4_1dw8dw8lgchor4k.R.inc(18071);bld.appendMonthOfYear(2);
                    __CLR4_4_1dw8dw8lgchor4k.R.inc(18072);appendSeparator(bld, extended);
                    __CLR4_4_1dw8dw8lgchor4k.R.inc(18073);bld.appendDayOfMonth(2);
                } }else {{
                    // YYYY-MM/YYYY-MM
                    __CLR4_4_1dw8dw8lgchor4k.R.inc(18074);bld.appendLiteral('-');
                    __CLR4_4_1dw8dw8lgchor4k.R.inc(18075);bld.appendMonthOfYear(2);
                    __CLR4_4_1dw8dw8lgchor4k.R.inc(18076);reducedPrec = true;
                }
            }} }else {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18077);if ((((fields.remove(DateTimeFieldType.dayOfMonth()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18078)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18079)==0&false))) {{
                    // YYYY--DD/YYYY--DD (non-iso)
                    __CLR4_4_1dw8dw8lgchor4k.R.inc(18080);checkNotStrictISO(fields, strictISO);
                    __CLR4_4_1dw8dw8lgchor4k.R.inc(18081);bld.appendLiteral('-');
                    __CLR4_4_1dw8dw8lgchor4k.R.inc(18082);bld.appendLiteral('-');
                    __CLR4_4_1dw8dw8lgchor4k.R.inc(18083);bld.appendDayOfMonth(2);
                } }else {{
                    // YYYY/YYYY
                    __CLR4_4_1dw8dw8lgchor4k.R.inc(18084);reducedPrec = true;
                }
            }}

        }} }else {__CLR4_4_1dw8dw8lgchor4k.R.inc(18085);if ((((fields.remove(DateTimeFieldType.monthOfYear()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18086)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18087)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18088);bld.appendLiteral('-');
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18089);bld.appendLiteral('-');
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18090);bld.appendMonthOfYear(2);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18091);if ((((fields.remove(DateTimeFieldType.dayOfMonth()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18092)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18093)==0&false))) {{
                // --MM-DD/--MMDD
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18094);appendSeparator(bld, extended);
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18095);bld.appendDayOfMonth(2);
            } }else {{
                // --MM/--MM
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18096);reducedPrec = true;
            }
        }} }else {__CLR4_4_1dw8dw8lgchor4k.R.inc(18097);if ((((fields.remove(DateTimeFieldType.dayOfMonth()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18098)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18099)==0&false))) {{
            // ---DD/---DD
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18100);bld.appendLiteral('-');
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18101);bld.appendLiteral('-');
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18102);bld.appendLiteral('-');
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18103);bld.appendDayOfMonth(2);
        }
        }}}__CLR4_4_1dw8dw8lgchor4k.R.inc(18104);return reducedPrec;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a date using the ordinal date format.
     * Specification reference: 5.2.2.
     *
     * @param bld       the builder
     * @param fields    the fields
     * @param extended  true to use extended format
     * @param strictISO true to only allow ISO formats
     * @since 1.1
     */
    private static boolean dateByOrdinal(
            DateTimeFormatterBuilder bld,
            Collection<DateTimeFieldType> fields,
            boolean extended,
            boolean strictISO) {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18105);

        __CLR4_4_1dw8dw8lgchor4k.R.inc(18106);boolean reducedPrec = false;
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18107);if ((((fields.remove(DateTimeFieldType.year()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18108)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18109)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18110);bld.append(Constants.ye);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18111);if ((((fields.remove(DateTimeFieldType.dayOfYear()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18112)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18113)==0&false))) {{
                // YYYY-DDD/YYYYDDD
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18114);appendSeparator(bld, extended);
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18115);bld.appendDayOfYear(3);
            } }else {{
                // YYYY/YYYY
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18116);reducedPrec = true;
            }

        }} }else {__CLR4_4_1dw8dw8lgchor4k.R.inc(18117);if ((((fields.remove(DateTimeFieldType.dayOfYear()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18118)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18119)==0&false))) {{
            // -DDD/-DDD
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18120);bld.appendLiteral('-');
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18121);bld.appendDayOfYear(3);
        }
        }}__CLR4_4_1dw8dw8lgchor4k.R.inc(18122);return reducedPrec;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a date using the calendar date format.
     * Specification reference: 5.2.3.
     *
     * @param bld       the builder
     * @param fields    the fields
     * @param extended  true to use extended format
     * @param strictISO true to only allow ISO formats
     * @since 1.1
     */
    private static boolean dateByWeek(
            DateTimeFormatterBuilder bld,
            Collection<DateTimeFieldType> fields,
            boolean extended,
            boolean strictISO) {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18123);

        __CLR4_4_1dw8dw8lgchor4k.R.inc(18124);boolean reducedPrec = false;
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18125);if ((((fields.remove(DateTimeFieldType.weekyear()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18126)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18127)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18128);bld.append(Constants.we);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18129);if ((((fields.remove(DateTimeFieldType.weekOfWeekyear()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18130)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18131)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18132);appendSeparator(bld, extended);
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18133);bld.appendLiteral('W');
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18134);bld.appendWeekOfWeekyear(2);
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18135);if ((((fields.remove(DateTimeFieldType.dayOfWeek()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18136)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18137)==0&false))) {{
                    // YYYY-WWW-D/YYYYWWWD
                    __CLR4_4_1dw8dw8lgchor4k.R.inc(18138);appendSeparator(bld, extended);
                    __CLR4_4_1dw8dw8lgchor4k.R.inc(18139);bld.appendDayOfWeek(1);
                } }else {{
                    // YYYY-WWW/YYYY-WWW
                    __CLR4_4_1dw8dw8lgchor4k.R.inc(18140);reducedPrec = true;
                }
            }} }else {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18141);if ((((fields.remove(DateTimeFieldType.dayOfWeek()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18142)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18143)==0&false))) {{
                    // YYYY-W-D/YYYYW-D (non-iso)
                    __CLR4_4_1dw8dw8lgchor4k.R.inc(18144);checkNotStrictISO(fields, strictISO);
                    __CLR4_4_1dw8dw8lgchor4k.R.inc(18145);appendSeparator(bld, extended);
                    __CLR4_4_1dw8dw8lgchor4k.R.inc(18146);bld.appendLiteral('W');
                    __CLR4_4_1dw8dw8lgchor4k.R.inc(18147);bld.appendLiteral('-');
                    __CLR4_4_1dw8dw8lgchor4k.R.inc(18148);bld.appendDayOfWeek(1);
                } }else {{
                    // YYYY/YYYY
                    __CLR4_4_1dw8dw8lgchor4k.R.inc(18149);reducedPrec = true;
                }
            }}

        }} }else {__CLR4_4_1dw8dw8lgchor4k.R.inc(18150);if ((((fields.remove(DateTimeFieldType.weekOfWeekyear()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18151)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18152)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18153);bld.appendLiteral('-');
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18154);bld.appendLiteral('W');
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18155);bld.appendWeekOfWeekyear(2);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18156);if ((((fields.remove(DateTimeFieldType.dayOfWeek()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18157)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18158)==0&false))) {{
                // -WWW-D/-WWWD
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18159);appendSeparator(bld, extended);
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18160);bld.appendDayOfWeek(1);
            } }else {{
                // -WWW/-WWW
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18161);reducedPrec = true;
            }
        }} }else {__CLR4_4_1dw8dw8lgchor4k.R.inc(18162);if ((((fields.remove(DateTimeFieldType.dayOfWeek()))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18163)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18164)==0&false))) {{
            // -W-D/-W-D
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18165);bld.appendLiteral('-');
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18166);bld.appendLiteral('W');
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18167);bld.appendLiteral('-');
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18168);bld.appendDayOfWeek(1);
        }
        }}}__CLR4_4_1dw8dw8lgchor4k.R.inc(18169);return reducedPrec;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Adds the time fields to the builder.
     * Specification reference: 5.3.1.
     *
     * @param bld         the builder
     * @param fields      the fields
     * @param extended    whether to use the extended format
     * @param strictISO   whether to be strict
     * @param reducedPrec whether the date was reduced precision
     * @param datePresent whether there was a date
     * @since 1.1
     */
    private static void time(
            DateTimeFormatterBuilder bld,
            Collection<DateTimeFieldType> fields,
            boolean extended,
            boolean strictISO,
            boolean reducedPrec,
            boolean datePresent) {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18170);

        __CLR4_4_1dw8dw8lgchor4k.R.inc(18171);boolean hour = fields.remove(DateTimeFieldType.hourOfDay());
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18172);boolean minute = fields.remove(DateTimeFieldType.minuteOfHour());
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18173);boolean second = fields.remove(DateTimeFieldType.secondOfMinute());
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18174);boolean milli = fields.remove(DateTimeFieldType.millisOfSecond());
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18175);if ((((!hour && !minute && !second && !milli)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18176)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18177)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18178);return;
        }
        }__CLR4_4_1dw8dw8lgchor4k.R.inc(18179);if ((((hour || minute || second || milli)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18180)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18181)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18182);if ((((strictISO && reducedPrec)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18183)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18184)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18185);throw new IllegalArgumentException("No valid ISO8601 format for fields because Date was reduced precision: " + fields);
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18186);if ((((datePresent)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18187)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18188)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18189);bld.appendLiteral('T');
            }
        }}
        }__CLR4_4_1dw8dw8lgchor4k.R.inc(18190);if ((((hour && minute && second || (hour && !second && !milli))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18191)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18192)==0&false))) {{
            // OK - HMSm/HMS/HM/H - valid in combination with date
        } }else {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18193);if ((((strictISO && datePresent)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18194)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18195)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18196);throw new IllegalArgumentException("No valid ISO8601 format for fields because Time was truncated: " + fields);
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18197);if ((((!hour && (minute && second || (minute && !milli) || second))&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18198)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18199)==0&false))) {{
                // OK - MSm/MS/M/Sm/S - valid ISO formats
            } }else {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18200);if ((((strictISO)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18201)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18202)==0&false))) {{
                    __CLR4_4_1dw8dw8lgchor4k.R.inc(18203);throw new IllegalArgumentException("No valid ISO8601 format for fields: " + fields);
                }
            }}
        }}
        }__CLR4_4_1dw8dw8lgchor4k.R.inc(18204);if ((((hour)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18205)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18206)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18207);bld.appendHourOfDay(2);
        } }else {__CLR4_4_1dw8dw8lgchor4k.R.inc(18208);if ((((minute || second || milli)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18209)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18210)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18211);bld.appendLiteral('-');
        }
        }}__CLR4_4_1dw8dw8lgchor4k.R.inc(18212);if ((((extended && hour && minute)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18213)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18214)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18215);bld.appendLiteral(':');
        }
        }__CLR4_4_1dw8dw8lgchor4k.R.inc(18216);if ((((minute)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18217)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18218)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18219);bld.appendMinuteOfHour(2);
        } }else {__CLR4_4_1dw8dw8lgchor4k.R.inc(18220);if ((((second || milli)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18221)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18222)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18223);bld.appendLiteral('-');
        }
        }}__CLR4_4_1dw8dw8lgchor4k.R.inc(18224);if ((((extended && minute && second)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18225)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18226)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18227);bld.appendLiteral(':');
        }
        }__CLR4_4_1dw8dw8lgchor4k.R.inc(18228);if ((((second)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18229)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18230)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18231);bld.appendSecondOfMinute(2);
        } }else {__CLR4_4_1dw8dw8lgchor4k.R.inc(18232);if ((((milli)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18233)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18234)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18235);bld.appendLiteral('-');
        }
        }}__CLR4_4_1dw8dw8lgchor4k.R.inc(18236);if ((((milli)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18237)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18238)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18239);bld.appendLiteral('.');
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18240);bld.appendMillisOfSecond(3);
        }
    }}finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Checks that the iso only flag is not set, throwing an exception if it is.
     *
     * @param fields    the fields
     * @param strictISO true if only ISO formats allowed
     * @since 1.1
     */
    private static void checkNotStrictISO(Collection<DateTimeFieldType> fields, boolean strictISO) {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18241);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18242);if ((((strictISO)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18243)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18244)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18245);throw new IllegalArgumentException("No valid ISO8601 format for fields: " + fields);
        }
    }}finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Appends the separator if necessary.
     *
     * @param bld      the builder
     * @param extended whether to append the separator
     * @param sep      the separator
     * @since 1.1
     */
    private static void appendSeparator(DateTimeFormatterBuilder bld, boolean extended) {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18246);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18247);if ((((extended)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18248)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18249)==0&false))) {{
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18250);bld.appendLiteral('-');
        }
    }}finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a generic ISO date parser for parsing dates with a possible zone.
     * <p>
     * The returned formatter can only be used for parsing, printing is unsupported.
     * <p>
     * It accepts formats described by the following syntax:
     * <pre>
     * date              = date-element ['T' offset]
     * date-element      = std-date-element | ord-date-element | week-date-element
     * std-date-element  = yyyy ['-' MM ['-' dd]]
     * ord-date-element  = yyyy ['-' DDD]
     * week-date-element = xxxx '-W' ww ['-' e]
     * offset            = 'Z' | (('+' | '-') HH [':' mm [':' ss [('.' | ',') SSS]]])
     * </pre>
     */
    public static DateTimeFormatter dateParser() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18251);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18252);return Constants.dp;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a generic ISO date parser for parsing local dates.
     * <p>
     * The returned formatter can only be used for parsing, printing is unsupported.
     * <p>
     * This parser is initialised with the local (UTC) time zone.
     * <p>
     * It accepts formats described by the following syntax:
     * <pre>
     * date-element      = std-date-element | ord-date-element | week-date-element
     * std-date-element  = yyyy ['-' MM ['-' dd]]
     * ord-date-element  = yyyy ['-' DDD]
     * week-date-element = xxxx '-W' ww ['-' e]
     * </pre>
     *
     * @since 1.3
     */
    public static DateTimeFormatter localDateParser() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18253);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18254);return Constants.ldp;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a generic ISO date parser for parsing dates.
     * <p>
     * The returned formatter can only be used for parsing, printing is unsupported.
     * <p>
     * It accepts formats described by the following syntax:
     * <pre>
     * date-element      = std-date-element | ord-date-element | week-date-element
     * std-date-element  = yyyy ['-' MM ['-' dd]]
     * ord-date-element  = yyyy ['-' DDD]
     * week-date-element = xxxx '-W' ww ['-' e]
     * </pre>
     */
    public static DateTimeFormatter dateElementParser() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18255);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18256);return Constants.dpe;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a generic ISO time parser for parsing times with a possible zone.
     * <p>
     * The returned formatter can only be used for parsing, printing is unsupported.
     * <p>
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * It accepts formats described by the following syntax:
     * <pre>
     * time           = ['T'] time-element [offset]
     * time-element   = HH [minute-element] | [fraction]
     * minute-element = ':' mm [second-element] | [fraction]
     * second-element = ':' ss [fraction]
     * fraction       = ('.' | ',') digit+
     * offset         = 'Z' | (('+' | '-') HH [':' mm [':' ss [('.' | ',') SSS]]])
     * </pre>
     */
    public static DateTimeFormatter timeParser() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18257);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18258);return Constants.tp;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a generic ISO time parser for parsing local times.
     * <p>
     * The returned formatter can only be used for parsing, printing is unsupported.
     * <p>
     * This parser is initialised with the local (UTC) time zone.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * It accepts formats described by the following syntax:
     * <pre>
     * time           = ['T'] time-element
     * time-element   = HH [minute-element] | [fraction]
     * minute-element = ':' mm [second-element] | [fraction]
     * second-element = ':' ss [fraction]
     * fraction       = ('.' | ',') digit+
     * </pre>
     *
     * @since 1.3
     */
    public static DateTimeFormatter localTimeParser() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18259);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18260);return Constants.ltp;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a generic ISO time parser.
     * <p>
     * The returned formatter can only be used for parsing, printing is unsupported.
     * <p>
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * It accepts formats described by the following syntax:
     * <pre>
     * time-element   = HH [minute-element] | [fraction]
     * minute-element = ':' mm [second-element] | [fraction]
     * second-element = ':' ss [fraction]
     * fraction       = ('.' | ',') digit+
     * </pre>
     */
    public static DateTimeFormatter timeElementParser() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18261);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18262);return Constants.tpe;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a generic ISO datetime parser which parses either a date or a time or both.
     * <p>
     * The returned formatter can only be used for parsing, printing is unsupported.
     * <p>
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * It accepts formats described by the following syntax:
     * <pre>
     * datetime          = time | date-opt-time
     * time              = 'T' time-element [offset]
     * date-opt-time     = date-element ['T' [time-element] [offset]]
     * date-element      = std-date-element | ord-date-element | week-date-element
     * std-date-element  = yyyy ['-' MM ['-' dd]]
     * ord-date-element  = yyyy ['-' DDD]
     * week-date-element = xxxx '-W' ww ['-' e]
     * time-element      = HH [minute-element] | [fraction]
     * minute-element    = ':' mm [second-element] | [fraction]
     * second-element    = ':' ss [fraction]
     * fraction          = ('.' | ',') digit+
     * offset            = 'Z' | (('+' | '-') HH [':' mm [':' ss [('.' | ',') SSS]]])
     * </pre>
     */
    public static DateTimeFormatter dateTimeParser() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18263);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18264);return Constants.dtp;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a generic ISO datetime parser where the date is mandatory and the time is optional.
     * <p>
     * The returned formatter can only be used for parsing, printing is unsupported.
     * <p>
     * This parser can parse zoned datetimes.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * It accepts formats described by the following syntax:
     * <pre>
     * date-opt-time     = date-element ['T' [time-element] [offset]]
     * date-element      = std-date-element | ord-date-element | week-date-element
     * std-date-element  = yyyy ['-' MM ['-' dd]]
     * ord-date-element  = yyyy ['-' DDD]
     * week-date-element = xxxx '-W' ww ['-' e]
     * time-element      = HH [minute-element] | [fraction]
     * minute-element    = ':' mm [second-element] | [fraction]
     * second-element    = ':' ss [fraction]
     * fraction          = ('.' | ',') digit+
     * </pre>
     *
     * @since 1.3
     */
    public static DateTimeFormatter dateOptionalTimeParser() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18265);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18266);return Constants.dotp;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a generic ISO datetime parser where the date is mandatory and the time is optional.
     * <p>
     * The returned formatter can only be used for parsing, printing is unsupported.
     * <p>
     * This parser only parses local datetimes.
     * This parser is initialised with the local (UTC) time zone.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * It accepts formats described by the following syntax:
     * <pre>
     * datetime          = date-element ['T' time-element]
     * date-element      = std-date-element | ord-date-element | week-date-element
     * std-date-element  = yyyy ['-' MM ['-' dd]]
     * ord-date-element  = yyyy ['-' DDD]
     * week-date-element = xxxx '-W' ww ['-' e]
     * time-element      = HH [minute-element] | [fraction]
     * minute-element    = ':' mm [second-element] | [fraction]
     * second-element    = ':' ss [fraction]
     * fraction          = ('.' | ',') digit+
     * </pre>
     *
     * @since 1.3
     */
    public static DateTimeFormatter localDateOptionalTimeParser() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18267);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18268);return Constants.ldotp;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a formatter for a full date as four digit year, two digit month
     * of year, and two digit day of month (yyyy-MM-dd).
     * <p>
     * The returned formatter prints and parses only this format.
     * See {@link #dateParser()} for a more flexible parser that accepts different formats.
     *
     * @return a formatter for yyyy-MM-dd
     */
    public static DateTimeFormatter date() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18269);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18270);return yearMonthDay();
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter for a two digit hour of day, two digit minute of
     * hour, two digit second of minute, three digit fraction of second, and
     * time zone offset (HH:mm:ss.SSSZZ).
     * <p>
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HH:mm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * The returned formatter prints and parses only this format, which includes milliseconds.
     * See {@link #timeParser()} for a more flexible parser that accepts different formats.
     *
     * @return a formatter for HH:mm:ss.SSSZZ
     */
    public static DateTimeFormatter time() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18271);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18272);return Constants.t;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter for a two digit hour of day, two digit minute of
     * hour, two digit second of minute, and time zone offset (HH:mm:ssZZ).
     * <p>
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HH:mm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * The returned formatter prints and parses only this format, which excludes milliseconds.
     * See {@link #timeParser()} for a more flexible parser that accepts different formats.
     *
     * @return a formatter for HH:mm:ssZZ
     */
    public static DateTimeFormatter timeNoMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18273);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18274);return Constants.tx;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter for a two digit hour of day, two digit minute of
     * hour, two digit second of minute, three digit fraction of second, and
     * time zone offset prefixed by 'T' ('T'HH:mm:ss.SSSZZ).
     * <p>
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HH:mm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * The returned formatter prints and parses only this format, which includes milliseconds.
     * See {@link #timeParser()} for a more flexible parser that accepts different formats.
     *
     * @return a formatter for 'T'HH:mm:ss.SSSZZ
     */
    public static DateTimeFormatter tTime() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18275);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18276);return Constants.tt;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter for a two digit hour of day, two digit minute of
     * hour, two digit second of minute, and time zone offset prefixed
     * by 'T' ('T'HH:mm:ssZZ).
     * <p>
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HH:mm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * The returned formatter prints and parses only this format, which excludes milliseconds.
     * See {@link #timeParser()} for a more flexible parser that accepts different formats.
     *
     * @return a formatter for 'T'HH:mm:ssZZ
     */
    public static DateTimeFormatter tTimeNoMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18277);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18278);return Constants.ttx;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter that combines a full date and time, separated by a 'T'
     * (yyyy-MM-dd'T'HH:mm:ss.SSSZZ).
     * <p>
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HH:mm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * The returned formatter prints and parses only this format, which includes milliseconds.
     * See {@link #dateTimeParser()} for a more flexible parser that accepts different formats.
     *
     * @return a formatter for yyyy-MM-dd'T'HH:mm:ss.SSSZZ
     */
    public static DateTimeFormatter dateTime() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18279);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18280);return Constants.dt;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter that combines a full date and time without millis,
     * separated by a 'T' (yyyy-MM-dd'T'HH:mm:ssZZ).
     * <p>
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HH:mm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * The returned formatter prints and parses only this format, which excludes milliseconds.
     * See {@link #dateTimeParser()} for a more flexible parser that accepts different formats.
     *
     * @return a formatter for yyyy-MM-dd'T'HH:mm:ssZZ
     */
    public static DateTimeFormatter dateTimeNoMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18281);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18282);return Constants.dtx;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter for a full ordinal date, using a four
     * digit year and three digit dayOfYear (yyyy-DDD).
     * <p>
     * The returned formatter prints and parses only this format.
     * See {@link #dateParser()} for a more flexible parser that accepts different formats.
     *
     * @return a formatter for yyyy-DDD
     * @since 1.1
     */
    public static DateTimeFormatter ordinalDate() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18283);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18284);return Constants.od;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter for a full ordinal date and time, using a four
     * digit year and three digit dayOfYear (yyyy-DDD'T'HH:mm:ss.SSSZZ).
     * <p>
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HH:mm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * The returned formatter prints and parses only this format, which includes milliseconds.
     * See {@link #dateTimeParser()} for a more flexible parser that accepts different formats.
     *
     * @return a formatter for yyyy-DDD'T'HH:mm:ss.SSSZZ
     * @since 1.1
     */
    public static DateTimeFormatter ordinalDateTime() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18285);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18286);return Constants.odt;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter for a full ordinal date and time without millis,
     * using a four digit year and three digit dayOfYear (yyyy-DDD'T'HH:mm:ssZZ).
     * <p>
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HH:mm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * The returned formatter prints and parses only this format, which excludes milliseconds.
     * See {@link #dateTimeParser()} for a more flexible parser that accepts different formats.
     *
     * @return a formatter for yyyy-DDD'T'HH:mm:ssZZ
     * @since 1.1
     */
    public static DateTimeFormatter ordinalDateTimeNoMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18287);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18288);return Constants.odtx;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter for a full date as four digit weekyear, two digit
     * week of weekyear, and one digit day of week (xxxx-'W'ww-e).
     * <p>
     * The returned formatter prints and parses only this format.
     * See {@link #dateParser()} for a more flexible parser that accepts different formats.
     *
     * @return a formatter for xxxx-'W'ww-e
     */
    public static DateTimeFormatter weekDate() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18289);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18290);return Constants.wwd;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter that combines a full weekyear date and time,
     * separated by a 'T' (xxxx-'W'ww-e'T'HH:mm:ss.SSSZZ).
     * <p>
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HH:mm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * The returned formatter prints and parses only this format, which includes milliseconds.
     * See {@link #dateTimeParser()} for a more flexible parser that accepts different formats.
     *
     * @return a formatter for xxxx-'W'ww-e'T'HH:mm:ss.SSSZZ
     */
    public static DateTimeFormatter weekDateTime() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18291);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18292);return Constants.wdt;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter that combines a full weekyear date and time without millis,
     * separated by a 'T' (xxxx-'W'ww-e'T'HH:mm:ssZZ).
     * <p>
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HH:mm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * The returned formatter prints and parses only this format, which excludes milliseconds.
     * See {@link #dateTimeParser()} for a more flexible parser that accepts different formats.
     *
     * @return a formatter for xxxx-'W'ww-e'T'HH:mm:ssZZ
     */
    public static DateTimeFormatter weekDateTimeNoMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18293);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18294);return Constants.wdtx;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a basic formatter for a full date as four digit year, two digit
     * month of year, and two digit day of month (yyyyMMdd).
     * <p>
     * The returned formatter prints and parses only this format.
     *
     * @return a formatter for yyyyMMdd
     */
    public static DateTimeFormatter basicDate() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18295);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18296);return Constants.bd;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a basic formatter for a two digit hour of day, two digit minute
     * of hour, two digit second of minute, three digit millis, and time zone
     * offset (HHmmss.SSSZ).
     * <p>
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HHmm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * The returned formatter prints and parses only this format, which includes milliseconds.
     *
     * @return a formatter for HHmmss.SSSZ
     */
    public static DateTimeFormatter basicTime() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18297);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18298);return Constants.bt;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a basic formatter for a two digit hour of day, two digit minute
     * of hour, two digit second of minute, and time zone offset (HHmmssZ).
     * <p>
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HHmm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * The returned formatter prints and parses only this format, which excludes milliseconds.
     *
     * @return a formatter for HHmmssZ
     */
    public static DateTimeFormatter basicTimeNoMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18299);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18300);return Constants.btx;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a basic formatter for a two digit hour of day, two digit minute
     * of hour, two digit second of minute, three digit millis, and time zone
     * offset prefixed by 'T' ('T'HHmmss.SSSZ).
     * <p>
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HHmm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * The returned formatter prints and parses only this format, which includes milliseconds.
     *
     * @return a formatter for 'T'HHmmss.SSSZ
     */
    public static DateTimeFormatter basicTTime() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18301);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18302);return Constants.btt;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a basic formatter for a two digit hour of day, two digit minute
     * of hour, two digit second of minute, and time zone offset prefixed by 'T'
     * ('T'HHmmssZ).
     * <p>
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HHmm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * The returned formatter prints and parses only this format, which excludes milliseconds.
     *
     * @return a formatter for 'T'HHmmssZ
     */
    public static DateTimeFormatter basicTTimeNoMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18303);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18304);return Constants.bttx;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a basic formatter that combines a basic date and time, separated
     * by a 'T' (yyyyMMdd'T'HHmmss.SSSZ).
     * <p>
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HHmm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * The returned formatter prints and parses only this format, which includes milliseconds.
     *
     * @return a formatter for yyyyMMdd'T'HHmmss.SSSZ
     */
    public static DateTimeFormatter basicDateTime() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18305);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18306);return Constants.bdt;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a basic formatter that combines a basic date and time without millis,
     * separated by a 'T' (yyyyMMdd'T'HHmmssZ).
     * <p>
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HHmm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * The returned formatter prints and parses only this format, which excludes milliseconds.
     *
     * @return a formatter for yyyyMMdd'T'HHmmssZ
     */
    public static DateTimeFormatter basicDateTimeNoMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18307);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18308);return Constants.bdtx;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter for a full ordinal date, using a four
     * digit year and three digit dayOfYear (yyyyDDD).
     * <p>
     * The returned formatter prints and parses only this format.
     *
     * @return a formatter for yyyyDDD
     * @since 1.1
     */
    public static DateTimeFormatter basicOrdinalDate() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18309);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18310);return Constants.bod;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter for a full ordinal date and time, using a four
     * digit year and three digit dayOfYear (yyyyDDD'T'HHmmss.SSSZ).
     * <p>
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HHmm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * The returned formatter prints and parses only this format, which includes milliseconds.
     *
     * @return a formatter for yyyyDDD'T'HHmmss.SSSZ
     * @since 1.1
     */
    public static DateTimeFormatter basicOrdinalDateTime() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18311);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18312);return Constants.bodt;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter for a full ordinal date and time without millis,
     * using a four digit year and three digit dayOfYear (yyyyDDD'T'HHmmssZ).
     * <p>
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HHmm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * The returned formatter prints and parses only this format, which excludes milliseconds.
     *
     * @return a formatter for yyyyDDD'T'HHmmssZ
     * @since 1.1
     */
    public static DateTimeFormatter basicOrdinalDateTimeNoMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18313);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18314);return Constants.bodtx;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a basic formatter for a full date as four digit weekyear, two
     * digit week of weekyear, and one digit day of week (xxxx'W'wwe).
     * <p>
     * The returned formatter prints and parses only this format.
     *
     * @return a formatter for xxxx'W'wwe
     */
    public static DateTimeFormatter basicWeekDate() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18315);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18316);return Constants.bwd;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a basic formatter that combines a basic weekyear date and time,
     * separated by a 'T' (xxxx'W'wwe'T'HHmmss.SSSZ).
     * <p>
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HHmm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * The returned formatter prints and parses only this format, which includes milliseconds.
     *
     * @return a formatter for xxxx'W'wwe'T'HHmmss.SSSZ
     */
    public static DateTimeFormatter basicWeekDateTime() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18317);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18318);return Constants.bwdt;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a basic formatter that combines a basic weekyear date and time
     * without millis, separated by a 'T' (xxxx'W'wwe'T'HHmmssZ).
     * <p>
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HHmm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * The returned formatter prints and parses only this format, which excludes milliseconds.
     *
     * @return a formatter for xxxx'W'wwe'T'HHmmssZ
     */
    public static DateTimeFormatter basicWeekDateTimeNoMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18319);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18320);return Constants.bwdtx;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a formatter for a four digit year. (yyyy)
     *
     * @return a formatter for yyyy
     */
    public static DateTimeFormatter year() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18321);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18322);return Constants.ye;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter for a four digit year and two digit month of
     * year. (yyyy-MM)
     *
     * @return a formatter for yyyy-MM
     */
    public static DateTimeFormatter yearMonth() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18323);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18324);return Constants.ym;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter for a four digit year, two digit month of year, and
     * two digit day of month. (yyyy-MM-dd)
     *
     * @return a formatter for yyyy-MM-dd
     */
    public static DateTimeFormatter yearMonthDay() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18325);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18326);return Constants.ymd;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter for a four digit weekyear. (xxxx)
     *
     * @return a formatter for xxxx
     */
    public static DateTimeFormatter weekyear() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18327);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18328);return Constants.we;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter for a four digit weekyear and two digit week of
     * weekyear. (xxxx-'W'ww)
     *
     * @return a formatter for xxxx-'W'ww
     */
    public static DateTimeFormatter weekyearWeek() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18329);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18330);return Constants.ww;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter for a four digit weekyear, two digit week of
     * weekyear, and one digit day of week. (xxxx-'W'ww-e)
     *
     * @return a formatter for xxxx-'W'ww-e
     */
    public static DateTimeFormatter weekyearWeekDay() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18331);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18332);return Constants.wwd;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter for a two digit hour of day. (HH)
     *
     * @return a formatter for HH
     */
    public static DateTimeFormatter hour() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18333);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18334);return Constants.hde;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter for a two digit hour of day and two digit minute of
     * hour. (HH:mm)
     *
     * @return a formatter for HH:mm
     */
    public static DateTimeFormatter hourMinute() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18335);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18336);return Constants.hm;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter for a two digit hour of day, two digit minute of
     * hour, and two digit second of minute. (HH:mm:ss)
     *
     * @return a formatter for HH:mm:ss
     */
    public static DateTimeFormatter hourMinuteSecond() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18337);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18338);return Constants.hms;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter for a two digit hour of day, two digit minute of
     * hour, two digit second of minute, and three digit fraction of
     * second (HH:mm:ss.SSS). Parsing will parse up to 3 fractional second
     * digits.
     *
     * @return a formatter for HH:mm:ss.SSS
     */
    public static DateTimeFormatter hourMinuteSecondMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18339);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18340);return Constants.hmsl;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter for a two digit hour of day, two digit minute of
     * hour, two digit second of minute, and three digit fraction of
     * second (HH:mm:ss.SSS). Parsing will parse up to 9 fractional second
     * digits, throwing away all except the first three.
     *
     * @return a formatter for HH:mm:ss.SSS
     */
    public static DateTimeFormatter hourMinuteSecondFraction() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18341);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18342);return Constants.hmsf;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter that combines a full date and two digit hour of
     * day. (yyyy-MM-dd'T'HH)
     *
     * @return a formatter for yyyy-MM-dd'T'HH
     */
    public static DateTimeFormatter dateHour() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18343);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18344);return Constants.dh;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter that combines a full date, two digit hour of day,
     * and two digit minute of hour. (yyyy-MM-dd'T'HH:mm)
     *
     * @return a formatter for yyyy-MM-dd'T'HH:mm
     */
    public static DateTimeFormatter dateHourMinute() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18345);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18346);return Constants.dhm;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter that combines a full date, two digit hour of day,
     * two digit minute of hour, and two digit second of
     * minute. (yyyy-MM-dd'T'HH:mm:ss)
     *
     * @return a formatter for yyyy-MM-dd'T'HH:mm:ss
     */
    public static DateTimeFormatter dateHourMinuteSecond() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18347);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18348);return Constants.dhms;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter that combines a full date, two digit hour of day,
     * two digit minute of hour, two digit second of minute, and three digit
     * fraction of second (yyyy-MM-dd'T'HH:mm:ss.SSS). Parsing will parse up
     * to 3 fractional second digits.
     *
     * @return a formatter for yyyy-MM-dd'T'HH:mm:ss.SSS
     */
    public static DateTimeFormatter dateHourMinuteSecondMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18349);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18350);return Constants.dhmsl;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    /**
     * Returns a formatter that combines a full date, two digit hour of day,
     * two digit minute of hour, two digit second of minute, and three digit
     * fraction of second (yyyy-MM-dd'T'HH:mm:ss.SSS). Parsing will parse up
     * to 9 fractional second digits, throwing away all except the first three.
     *
     * @return a formatter for yyyy-MM-dd'T'HH:mm:ss.SSS
     */
    public static DateTimeFormatter dateHourMinuteSecondFraction() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18351);
        __CLR4_4_1dw8dw8lgchor4k.R.inc(18352);return Constants.dhmsf;
    }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    static final class Constants {
        private static final DateTimeFormatter
                ye = yearElement(),  // year element (yyyy)
                mye = monthElement(), // monthOfYear element (-MM)
                dme = dayOfMonthElement(), // dayOfMonth element (-dd)
                we = weekyearElement(),  // weekyear element (xxxx)
                wwe = weekElement(), // weekOfWeekyear element (-ww)
                dwe = dayOfWeekElement(), // dayOfWeek element (-ee)
                dye = dayOfYearElement(), // dayOfYear element (-DDD)
                hde = hourElement(), // hourOfDay element (HH)
                mhe = minuteElement(), // minuteOfHour element (:mm)
                sme = secondElement(), // secondOfMinute element (:ss)
                fse = fractionElement(), // fractionOfSecond element (.SSSSSSSSS)
                ze = offsetElement(),  // zone offset element
                lte = literalTElement(), // literal 'T' element

        //y,   // year (same as year element)
        ym = yearMonth(),  // year month
                ymd = yearMonthDay(), // year month day

        //w,   // weekyear (same as weekyear element)
        ww = weekyearWeek(),  // weekyear week
                wwd = weekyearWeekDay(), // weekyear week day

        //h,    // hour (same as hour element)
        hm = hourMinute(),   // hour minute
                hms = hourMinuteSecond(),  // hour minute second
                hmsl = hourMinuteSecondMillis(), // hour minute second millis
                hmsf = hourMinuteSecondFraction(), // hour minute second fraction

        dh = dateHour(),    // date hour
                dhm = dateHourMinute(),   // date hour minute
                dhms = dateHourMinuteSecond(),  // date hour minute second
                dhmsl = dateHourMinuteSecondMillis(), // date hour minute second millis
                dhmsf = dateHourMinuteSecondFraction(), // date hour minute second fraction

        //d,  // date (same as ymd)
        t = time(),  // time
                tx = timeNoMillis(),  // time no millis
                tt = tTime(),  // Ttime
                ttx = tTimeNoMillis(),  // Ttime no millis
                dt = dateTime(), // date time
                dtx = dateTimeNoMillis(), // date time no millis

        //wd,  // week date (same as wwd)
        wdt = weekDateTime(), // week date time
                wdtx = weekDateTimeNoMillis(), // week date time no millis

        od = ordinalDate(),  // ordinal date (same as yd)
                odt = ordinalDateTime(), // ordinal date time
                odtx = ordinalDateTimeNoMillis(), // ordinal date time no millis

        bd = basicDate(),  // basic date
                bt = basicTime(),  // basic time
                btx = basicTimeNoMillis(),  // basic time no millis
                btt = basicTTime(), // basic Ttime
                bttx = basicTTimeNoMillis(), // basic Ttime no millis
                bdt = basicDateTime(), // basic date time
                bdtx = basicDateTimeNoMillis(), // basic date time no millis

        bod = basicOrdinalDate(),  // basic ordinal date
                bodt = basicOrdinalDateTime(), // basic ordinal date time
                bodtx = basicOrdinalDateTimeNoMillis(), // basic ordinal date time no millis

        bwd = basicWeekDate(),  // basic week date
                bwdt = basicWeekDateTime(), // basic week date time
                bwdtx = basicWeekDateTimeNoMillis(), // basic week date time no millis

        dpe = dateElementParser(), // date parser element
                tpe = timeElementParser(), // time parser element
                dp = dateParser(),  // date parser
                ldp = localDateParser(), // local date parser
                tp = timeParser(),  // time parser
                ltp = localTimeParser(), // local time parser
                dtp = dateTimeParser(), // date time parser
                dotp = dateOptionalTimeParser(), // date optional time parser
                ldotp = localDateOptionalTimeParser(); // local date optional time parser

        //-----------------------------------------------------------------------
        private static DateTimeFormatter dateParser() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18353);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18354);if ((((dp == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18355)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18356)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18357);DateTimeParser tOffset = new DateTimeFormatterBuilder()
                        .appendLiteral('T')
                        .append(offsetElement()).toParser();
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18358);return new DateTimeFormatterBuilder()
                        .append(dateElementParser())
                        .appendOptional(tOffset)
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18359);return dp;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter localDateParser() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18360);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18361);if ((((ldp == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18362)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18363)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18364);return dateElementParser().withZoneUTC();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18365);return ldp;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter dateElementParser() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18366);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18367);if ((((dpe == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18368)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18369)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18370);return new DateTimeFormatterBuilder()
                        .append(null, new DateTimeParser[]{
                                new DateTimeFormatterBuilder()
                                        .append(yearElement())
                                        .appendOptional
                                                (new DateTimeFormatterBuilder()
                                                        .append(monthElement())
                                                        .appendOptional(dayOfMonthElement().getParser())
                                                        .toParser())
                                        .toParser(),
                                new DateTimeFormatterBuilder()
                                        .append(weekyearElement())
                                        .append(weekElement())
                                        .appendOptional(dayOfWeekElement().getParser())
                                        .toParser(),
                                new DateTimeFormatterBuilder()
                                        .append(yearElement())
                                        .append(dayOfYearElement())
                                        .toParser()
                        })
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18371);return dpe;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter timeParser() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18372);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18373);if ((((tp == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18374)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18375)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18376);return new DateTimeFormatterBuilder()
                        .appendOptional(literalTElement().getParser())
                        .append(timeElementParser())
                        .appendOptional(offsetElement().getParser())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18377);return tp;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter localTimeParser() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18378);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18379);if ((((ltp == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18380)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18381)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18382);return new DateTimeFormatterBuilder()
                        .appendOptional(literalTElement().getParser())
                        .append(timeElementParser())
                        .toFormatter().withZoneUTC();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18383);return ltp;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter timeElementParser() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18384);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18385);if ((((tpe == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18386)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18387)==0&false))) {{
                // Decimal point can be either '.' or ','
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18388);DateTimeParser decimalPoint = new DateTimeFormatterBuilder()
                        .append(null, new DateTimeParser[]{
                                new DateTimeFormatterBuilder()
                                        .appendLiteral('.')
                                        .toParser(),
                                new DateTimeFormatterBuilder()
                                        .appendLiteral(',')
                                        .toParser()
                        })
                        .toParser();

                __CLR4_4_1dw8dw8lgchor4k.R.inc(18389);return new DateTimeFormatterBuilder()
                        // time-element
                        .append(hourElement())
                        .append
                                (null, new DateTimeParser[]{
                                        new DateTimeFormatterBuilder()
                                                // minute-element
                                                .append(minuteElement())
                                                .append
                                                        (null, new DateTimeParser[]{
                                                                new DateTimeFormatterBuilder()
                                                                        // second-element
                                                                        .append(secondElement())
                                                                        // second fraction
                                                                        .appendOptional(new DateTimeFormatterBuilder()
                                                                                .append(decimalPoint)
                                                                                .appendFractionOfSecond(1, 9)
                                                                                .toParser())
                                                                        .toParser(),
                                                                // minute fraction
                                                                new DateTimeFormatterBuilder()
                                                                        .append(decimalPoint)
                                                                        .appendFractionOfMinute(1, 9)
                                                                        .toParser(),
                                                                null
                                                        })
                                                .toParser(),
                                        // hour fraction
                                        new DateTimeFormatterBuilder()
                                                .append(decimalPoint)
                                                .appendFractionOfHour(1, 9)
                                                .toParser(),
                                        null
                                })
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18390);return tpe;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter dateTimeParser() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18391);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18392);if ((((dtp == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18393)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18394)==0&false))) {{
                // This is different from the general time parser in that the 'T'
                // is required.
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18395);DateTimeParser time = new DateTimeFormatterBuilder()
                        .appendLiteral('T')
                        .append(timeElementParser())
                        .appendOptional(offsetElement().getParser())
                        .toParser();
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18396);return new DateTimeFormatterBuilder()
                        .append(null, new DateTimeParser[]{time, dateOptionalTimeParser().getParser()})
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18397);return dtp;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter dateOptionalTimeParser() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18398);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18399);if ((((dotp == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18400)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18401)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18402);DateTimeParser timeOrOffset = new DateTimeFormatterBuilder()
                        .appendLiteral('T')
                        .appendOptional(timeElementParser().getParser())
                        .appendOptional(offsetElement().getParser())
                        .toParser();
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18403);return new DateTimeFormatterBuilder()
                        .append(dateElementParser())
                        .appendOptional(timeOrOffset)
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18404);return dotp;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter localDateOptionalTimeParser() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18405);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18406);if ((((ldotp == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18407)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18408)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18409);DateTimeParser time = new DateTimeFormatterBuilder()
                        .appendLiteral('T')
                        .append(timeElementParser())
                        .toParser();
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18410);return new DateTimeFormatterBuilder()
                        .append(dateElementParser())
                        .appendOptional(time)
                        .toFormatter().withZoneUTC();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18411);return ldotp;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        //-----------------------------------------------------------------------
        private static DateTimeFormatter time() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18412);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18413);if ((((t == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18414)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18415)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18416);return new DateTimeFormatterBuilder()
                        .append(hourMinuteSecondFraction())
                        .append(offsetElement())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18417);return t;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter timeNoMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18418);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18419);if ((((tx == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18420)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18421)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18422);return new DateTimeFormatterBuilder()
                        .append(hourMinuteSecond())
                        .append(offsetElement())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18423);return tx;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter tTime() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18424);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18425);if ((((tt == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18426)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18427)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18428);return new DateTimeFormatterBuilder()
                        .append(literalTElement())
                        .append(time())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18429);return tt;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter tTimeNoMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18430);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18431);if ((((ttx == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18432)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18433)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18434);return new DateTimeFormatterBuilder()
                        .append(literalTElement())
                        .append(timeNoMillis())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18435);return ttx;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter dateTime() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18436);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18437);if ((((dt == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18438)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18439)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18440);return new DateTimeFormatterBuilder()
                        .append(date())
                        .append(tTime())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18441);return dt;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter dateTimeNoMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18442);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18443);if ((((dtx == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18444)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18445)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18446);return new DateTimeFormatterBuilder()
                        .append(date())
                        .append(tTimeNoMillis())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18447);return dtx;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter ordinalDate() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18448);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18449);if ((((od == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18450)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18451)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18452);return new DateTimeFormatterBuilder()
                        .append(yearElement())
                        .append(dayOfYearElement())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18453);return od;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter ordinalDateTime() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18454);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18455);if ((((odt == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18456)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18457)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18458);return new DateTimeFormatterBuilder()
                        .append(ordinalDate())
                        .append(tTime())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18459);return odt;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter ordinalDateTimeNoMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18460);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18461);if ((((odtx == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18462)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18463)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18464);return new DateTimeFormatterBuilder()
                        .append(ordinalDate())
                        .append(tTimeNoMillis())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18465);return odtx;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter weekDateTime() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18466);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18467);if ((((wdt == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18468)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18469)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18470);return new DateTimeFormatterBuilder()
                        .append(weekDate())
                        .append(tTime())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18471);return wdt;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter weekDateTimeNoMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18472);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18473);if ((((wdtx == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18474)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18475)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18476);return new DateTimeFormatterBuilder()
                        .append(weekDate())
                        .append(tTimeNoMillis())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18477);return wdtx;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        //-----------------------------------------------------------------------
        private static DateTimeFormatter basicDate() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18478);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18479);if ((((bd == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18480)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18481)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18482);return new DateTimeFormatterBuilder()
                        .appendYear(4, 4)
                        .appendFixedDecimal(DateTimeFieldType.monthOfYear(), 2)
                        .appendFixedDecimal(DateTimeFieldType.dayOfMonth(), 2)
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18483);return bd;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter basicTime() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18484);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18485);if ((((bt == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18486)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18487)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18488);return new DateTimeFormatterBuilder()
                        .appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2)
                        .appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2)
                        .appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2)
                        .appendLiteral('.')
                        .appendFractionOfSecond(3, 9)
                        .appendTimeZoneOffset("Z", false, 2, 2)
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18489);return bt;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter basicTimeNoMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18490);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18491);if ((((btx == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18492)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18493)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18494);return new DateTimeFormatterBuilder()
                        .appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2)
                        .appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2)
                        .appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2)
                        .appendTimeZoneOffset("Z", false, 2, 2)
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18495);return btx;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter basicTTime() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18496);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18497);if ((((btt == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18498)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18499)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18500);return new DateTimeFormatterBuilder()
                        .append(literalTElement())
                        .append(basicTime())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18501);return btt;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter basicTTimeNoMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18502);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18503);if ((((bttx == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18504)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18505)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18506);return new DateTimeFormatterBuilder()
                        .append(literalTElement())
                        .append(basicTimeNoMillis())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18507);return bttx;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter basicDateTime() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18508);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18509);if ((((bdt == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18510)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18511)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18512);return new DateTimeFormatterBuilder()
                        .append(basicDate())
                        .append(basicTTime())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18513);return bdt;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter basicDateTimeNoMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18514);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18515);if ((((bdtx == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18516)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18517)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18518);return new DateTimeFormatterBuilder()
                        .append(basicDate())
                        .append(basicTTimeNoMillis())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18519);return bdtx;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter basicOrdinalDate() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18520);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18521);if ((((bod == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18522)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18523)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18524);return new DateTimeFormatterBuilder()
                        .appendYear(4, 4)
                        .appendFixedDecimal(DateTimeFieldType.dayOfYear(), 3)
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18525);return bod;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter basicOrdinalDateTime() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18526);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18527);if ((((bodt == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18528)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18529)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18530);return new DateTimeFormatterBuilder()
                        .append(basicOrdinalDate())
                        .append(basicTTime())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18531);return bodt;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter basicOrdinalDateTimeNoMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18532);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18533);if ((((bodtx == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18534)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18535)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18536);return new DateTimeFormatterBuilder()
                        .append(basicOrdinalDate())
                        .append(basicTTimeNoMillis())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18537);return bodtx;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter basicWeekDate() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18538);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18539);if ((((bwd == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18540)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18541)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18542);return new DateTimeFormatterBuilder()
                        .appendWeekyear(4, 4)
                        .appendLiteral('W')
                        .appendFixedDecimal(DateTimeFieldType.weekOfWeekyear(), 2)
                        .appendFixedDecimal(DateTimeFieldType.dayOfWeek(), 1)
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18543);return bwd;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter basicWeekDateTime() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18544);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18545);if ((((bwdt == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18546)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18547)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18548);return new DateTimeFormatterBuilder()
                        .append(basicWeekDate())
                        .append(basicTTime())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18549);return bwdt;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter basicWeekDateTimeNoMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18550);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18551);if ((((bwdtx == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18552)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18553)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18554);return new DateTimeFormatterBuilder()
                        .append(basicWeekDate())
                        .append(basicTTimeNoMillis())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18555);return bwdtx;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        //-----------------------------------------------------------------------
        private static DateTimeFormatter yearMonth() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18556);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18557);if ((((ym == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18558)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18559)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18560);return new DateTimeFormatterBuilder()
                        .append(yearElement())
                        .append(monthElement())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18561);return ym;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter yearMonthDay() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18562);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18563);if ((((ymd == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18564)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18565)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18566);return new DateTimeFormatterBuilder()
                        .append(yearElement())
                        .append(monthElement())
                        .append(dayOfMonthElement())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18567);return ymd;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter weekyearWeek() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18568);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18569);if ((((ww == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18570)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18571)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18572);return new DateTimeFormatterBuilder()
                        .append(weekyearElement())
                        .append(weekElement())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18573);return ww;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter weekyearWeekDay() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18574);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18575);if ((((wwd == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18576)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18577)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18578);return new DateTimeFormatterBuilder()
                        .append(weekyearElement())
                        .append(weekElement())
                        .append(dayOfWeekElement())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18579);return wwd;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter hourMinute() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18580);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18581);if ((((hm == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18582)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18583)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18584);return new DateTimeFormatterBuilder()
                        .append(hourElement())
                        .append(minuteElement())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18585);return hm;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter hourMinuteSecond() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18586);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18587);if ((((hms == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18588)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18589)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18590);return new DateTimeFormatterBuilder()
                        .append(hourElement())
                        .append(minuteElement())
                        .append(secondElement())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18591);return hms;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter hourMinuteSecondMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18592);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18593);if ((((hmsl == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18594)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18595)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18596);return new DateTimeFormatterBuilder()
                        .append(hourElement())
                        .append(minuteElement())
                        .append(secondElement())
                        .appendLiteral('.')
                        .appendFractionOfSecond(3, 3)
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18597);return hmsl;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter hourMinuteSecondFraction() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18598);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18599);if ((((hmsf == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18600)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18601)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18602);return new DateTimeFormatterBuilder()
                        .append(hourElement())
                        .append(minuteElement())
                        .append(secondElement())
                        .append(fractionElement())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18603);return hmsf;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter dateHour() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18604);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18605);if ((((dh == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18606)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18607)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18608);return new DateTimeFormatterBuilder()
                        .append(date())
                        .append(literalTElement())
                        .append(hour())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18609);return dh;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter dateHourMinute() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18610);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18611);if ((((dhm == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18612)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18613)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18614);return new DateTimeFormatterBuilder()
                        .append(date())
                        .append(literalTElement())
                        .append(hourMinute())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18615);return dhm;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter dateHourMinuteSecond() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18616);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18617);if ((((dhms == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18618)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18619)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18620);return new DateTimeFormatterBuilder()
                        .append(date())
                        .append(literalTElement())
                        .append(hourMinuteSecond())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18621);return dhms;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter dateHourMinuteSecondMillis() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18622);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18623);if ((((dhmsl == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18624)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18625)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18626);return new DateTimeFormatterBuilder()
                        .append(date())
                        .append(literalTElement())
                        .append(hourMinuteSecondMillis())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18627);return dhmsl;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter dateHourMinuteSecondFraction() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18628);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18629);if ((((dhmsf == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18630)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18631)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18632);return new DateTimeFormatterBuilder()
                        .append(date())
                        .append(literalTElement())
                        .append(hourMinuteSecondFraction())
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18633);return dhmsf;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        //-----------------------------------------------------------------------
        private static DateTimeFormatter yearElement() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18634);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18635);if ((((ye == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18636)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18637)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18638);return new DateTimeFormatterBuilder()
                        .appendYear(4, 9)
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18639);return ye;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter monthElement() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18640);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18641);if ((((mye == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18642)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18643)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18644);return new DateTimeFormatterBuilder()
                        .appendLiteral('-')
                        .appendMonthOfYear(2)
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18645);return mye;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter dayOfMonthElement() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18646);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18647);if ((((dme == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18648)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18649)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18650);return new DateTimeFormatterBuilder()
                        .appendLiteral('-')
                        .appendDayOfMonth(2)
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18651);return dme;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter weekyearElement() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18652);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18653);if ((((we == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18654)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18655)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18656);return new DateTimeFormatterBuilder()
                        .appendWeekyear(4, 9)
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18657);return we;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter weekElement() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18658);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18659);if ((((wwe == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18660)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18661)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18662);return new DateTimeFormatterBuilder()
                        .appendLiteral("-W")
                        .appendWeekOfWeekyear(2)
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18663);return wwe;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter dayOfWeekElement() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18664);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18665);if ((((dwe == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18666)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18667)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18668);return new DateTimeFormatterBuilder()
                        .appendLiteral('-')
                        .appendDayOfWeek(1)
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18669);return dwe;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter dayOfYearElement() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18670);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18671);if ((((dye == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18672)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18673)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18674);return new DateTimeFormatterBuilder()
                        .appendLiteral('-')
                        .appendDayOfYear(3)
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18675);return dye;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter literalTElement() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18676);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18677);if ((((lte == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18678)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18679)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18680);return new DateTimeFormatterBuilder()
                        .appendLiteral('T')
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18681);return lte;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter hourElement() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18682);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18683);if ((((hde == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18684)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18685)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18686);return new DateTimeFormatterBuilder()
                        .appendHourOfDay(2)
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18687);return hde;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter minuteElement() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18688);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18689);if ((((mhe == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18690)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18691)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18692);return new DateTimeFormatterBuilder()
                        .appendLiteral(':')
                        .appendMinuteOfHour(2)
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18693);return mhe;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter secondElement() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18694);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18695);if ((((sme == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18696)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18697)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18698);return new DateTimeFormatterBuilder()
                        .appendLiteral(':')
                        .appendSecondOfMinute(2)
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18699);return sme;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter fractionElement() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18700);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18701);if ((((fse == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18702)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18703)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18704);return new DateTimeFormatterBuilder()
                        .appendLiteral('.')
                        // Support parsing up to nanosecond precision even though
                        // those extra digits will be dropped.
                        .appendFractionOfSecond(3, 9)
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18705);return fse;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

        private static DateTimeFormatter offsetElement() {try{__CLR4_4_1dw8dw8lgchor4k.R.inc(18706);
            __CLR4_4_1dw8dw8lgchor4k.R.inc(18707);if ((((ze == null)&&(__CLR4_4_1dw8dw8lgchor4k.R.iget(18708)!=0|true))||(__CLR4_4_1dw8dw8lgchor4k.R.iget(18709)==0&false))) {{
                __CLR4_4_1dw8dw8lgchor4k.R.inc(18710);return new DateTimeFormatterBuilder()
                        .appendTimeZoneOffset("Z", true, 2, 4)
                        .toFormatter();
            }
            }__CLR4_4_1dw8dw8lgchor4k.R.inc(18711);return ze;
        }finally{__CLR4_4_1dw8dw8lgchor4k.R.flushNeeded();}}

    }

}
