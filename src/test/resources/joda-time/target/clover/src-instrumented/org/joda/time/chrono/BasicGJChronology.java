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
package org.joda.time.chrono;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;

/**
 * Abstract Chronology for implementing chronologies based on Gregorian/Julian formulae.
 * Most of the utility methods required by subclasses are package-private,
 * reflecting the intention that they be defined in the same package.
 * <p>
 * BasicGJChronology is thread-safe and immutable, and all subclasses must
 * be as well.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @author Guy Allard
 * @since 1.2, refactored from CommonGJChronology
 */
abstract class BasicGJChronology extends BasicChronology {public static class __CLR4_4_17au7aulgchoqp4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,9593,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization lock
     */
    private static final long serialVersionUID = 538276888268L;

    // These arrays are NOT public. We trust ourselves not to alter the array.
    // They use zero-based array indexes so the that valid range of months is
    // automatically checked.
    private static final int[] MIN_DAYS_PER_MONTH_ARRAY = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    private static final int[] MAX_DAYS_PER_MONTH_ARRAY = {
            31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    private static final long[] MIN_TOTAL_MILLIS_BY_MONTH_ARRAY;
    private static final long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY;
    private static final long FEB_29 = (31L + 29 - 1) * DateTimeConstants.MILLIS_PER_DAY;

    static {try{__CLR4_4_17au7aulgchoqp4.R.inc(9462);
        __CLR4_4_17au7aulgchoqp4.R.inc(9463);MIN_TOTAL_MILLIS_BY_MONTH_ARRAY = new long[12];
        __CLR4_4_17au7aulgchoqp4.R.inc(9464);MAX_TOTAL_MILLIS_BY_MONTH_ARRAY = new long[12];

        __CLR4_4_17au7aulgchoqp4.R.inc(9465);long minSum = 0;
        __CLR4_4_17au7aulgchoqp4.R.inc(9466);long maxSum = 0;
        __CLR4_4_17au7aulgchoqp4.R.inc(9467);for (int i = 0; (((i < 11)&&(__CLR4_4_17au7aulgchoqp4.R.iget(9468)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9469)==0&false)); i++) {{
            __CLR4_4_17au7aulgchoqp4.R.inc(9470);long millis = MIN_DAYS_PER_MONTH_ARRAY[i]
                    * (long) DateTimeConstants.MILLIS_PER_DAY;
            __CLR4_4_17au7aulgchoqp4.R.inc(9471);minSum += millis;
            __CLR4_4_17au7aulgchoqp4.R.inc(9472);MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[i + 1] = minSum;

            __CLR4_4_17au7aulgchoqp4.R.inc(9473);millis = MAX_DAYS_PER_MONTH_ARRAY[i]
                    * (long) DateTimeConstants.MILLIS_PER_DAY;
            __CLR4_4_17au7aulgchoqp4.R.inc(9474);maxSum += millis;
            __CLR4_4_17au7aulgchoqp4.R.inc(9475);MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[i + 1] = maxSum;
        }
    }}finally{__CLR4_4_17au7aulgchoqp4.R.flushNeeded();}}

    /**
     * Constructor.
     */
    BasicGJChronology(Chronology base, Object param, int minDaysInFirstWeek) {
        super(base, param, minDaysInFirstWeek);__CLR4_4_17au7aulgchoqp4.R.inc(9477);try{__CLR4_4_17au7aulgchoqp4.R.inc(9476);
    }finally{__CLR4_4_17au7aulgchoqp4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Override
    boolean isLeapDay(long instant) {try{__CLR4_4_17au7aulgchoqp4.R.inc(9478);
        __CLR4_4_17au7aulgchoqp4.R.inc(9479);return dayOfMonth().get(instant) == 29 && monthOfYear().isLeap(instant);
    }finally{__CLR4_4_17au7aulgchoqp4.R.flushNeeded();}}

    int getMonthOfYear(long millis, int year) {try{__CLR4_4_17au7aulgchoqp4.R.inc(9480);
        // Perform a binary search to get the month. To make it go even faster,
        // compare using ints instead of longs. The number of milliseconds per
        // year exceeds the limit of a 32-bit int's capacity, so divide by
        // 1024. No precision is lost (except time of day) since the number of
        // milliseconds per day contains 1024 as a factor. After the division,
        // the instant isn't measured in milliseconds, but in units of
        // (128/125)seconds.

        __CLR4_4_17au7aulgchoqp4.R.inc(9481);int i = (int) ((millis - getYearMillis(year)) >> 10);

        // There are 86400000 milliseconds per day, but divided by 1024 is
        // 84375. There are 84375 (128/125)seconds per day.

        __CLR4_4_17au7aulgchoqp4.R.inc(9482);return
                ((((isLeapYear(year))
                        )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9483)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9484)==0&false))? (((((i < 182 * 84375)
                        )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9485)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9486)==0&false))? (((((i < 91 * 84375)
                        )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9487)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9488)==0&false))? (((((i < 31 * 84375) )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9489)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9490)==0&false))? 1 : ((((i < 60 * 84375) )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9491)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9492)==0&false))? 2 : 3)
                        : (((((i < 121 * 84375) )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9493)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9494)==0&false))? 4 : ((((i < 152 * 84375) )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9495)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9496)==0&false))? 5 : 6))
                        : (((((i < 274 * 84375)
                        )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9497)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9498)==0&false))? (((((i < 213 * 84375) )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9499)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9500)==0&false))? 7 : ((((i < 244 * 84375) )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9501)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9502)==0&false))? 8 : 9)
                        : (((((i < 305 * 84375) )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9503)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9504)==0&false))? 10 : ((((i < 335 * 84375) )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9505)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9506)==0&false))? 11 : 12)))
                        : (((((i < 181 * 84375)
                        )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9507)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9508)==0&false))? (((((i < 90 * 84375)
                        )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9509)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9510)==0&false))? (((((i < 31 * 84375) )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9511)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9512)==0&false))? 1 : ((((i < 59 * 84375) )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9513)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9514)==0&false))? 2 : 3)
                        : (((((i < 120 * 84375) )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9515)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9516)==0&false))? 4 : ((((i < 151 * 84375) )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9517)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9518)==0&false))? 5 : 6))
                        : (((((i < 273 * 84375)
                        )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9519)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9520)==0&false))? (((((i < 212 * 84375) )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9521)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9522)==0&false))? 7 : ((((i < 243 * 84375) )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9523)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9524)==0&false))? 8 : 9)
                        : (((((i < 304 * 84375) )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9525)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9526)==0&false))? 10 : ((((i < 334 * 84375) )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9527)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9528)==0&false))? 11 : 12)));
    }finally{__CLR4_4_17au7aulgchoqp4.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the number of days in the specified month and year.
     *
     * @param year  the year
     * @param month the month
     * @return the number of days
     */
    int getDaysInYearMonth(int year, int month) {try{__CLR4_4_17au7aulgchoqp4.R.inc(9529);
        __CLR4_4_17au7aulgchoqp4.R.inc(9530);if ((((isLeapYear(year))&&(__CLR4_4_17au7aulgchoqp4.R.iget(9531)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9532)==0&false))) {{
            __CLR4_4_17au7aulgchoqp4.R.inc(9533);return MAX_DAYS_PER_MONTH_ARRAY[month - 1];
        } }else {{
            __CLR4_4_17au7aulgchoqp4.R.inc(9534);return MIN_DAYS_PER_MONTH_ARRAY[month - 1];
        }
    }}finally{__CLR4_4_17au7aulgchoqp4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getDaysInMonthMax(int month) {try{__CLR4_4_17au7aulgchoqp4.R.inc(9535);
        __CLR4_4_17au7aulgchoqp4.R.inc(9536);return MAX_DAYS_PER_MONTH_ARRAY[month - 1];
    }finally{__CLR4_4_17au7aulgchoqp4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getDaysInMonthMaxForSet(long instant, int value) {try{__CLR4_4_17au7aulgchoqp4.R.inc(9537);
        __CLR4_4_17au7aulgchoqp4.R.inc(9538);return (((((value > 28 || value < 1) )&&(__CLR4_4_17au7aulgchoqp4.R.iget(9539)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9540)==0&false))? getDaysInMonthMax(instant) : 28);
    }finally{__CLR4_4_17au7aulgchoqp4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    long getTotalMillisByYearMonth(int year, int month) {try{__CLR4_4_17au7aulgchoqp4.R.inc(9541);
        __CLR4_4_17au7aulgchoqp4.R.inc(9542);if ((((isLeapYear(year))&&(__CLR4_4_17au7aulgchoqp4.R.iget(9543)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9544)==0&false))) {{
            __CLR4_4_17au7aulgchoqp4.R.inc(9545);return MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[month - 1];
        } }else {{
            __CLR4_4_17au7aulgchoqp4.R.inc(9546);return MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[month - 1];
        }
    }}finally{__CLR4_4_17au7aulgchoqp4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    long getYearDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_17au7aulgchoqp4.R.inc(9547);
        __CLR4_4_17au7aulgchoqp4.R.inc(9548);int minuendYear = getYear(minuendInstant);
        __CLR4_4_17au7aulgchoqp4.R.inc(9549);int subtrahendYear = getYear(subtrahendInstant);

        // Inlined remainder method to avoid duplicate calls to get.
        __CLR4_4_17au7aulgchoqp4.R.inc(9550);long minuendRem = minuendInstant - getYearMillis(minuendYear);
        __CLR4_4_17au7aulgchoqp4.R.inc(9551);long subtrahendRem = subtrahendInstant - getYearMillis(subtrahendYear);

        // Balance leap year differences on remainders.
        __CLR4_4_17au7aulgchoqp4.R.inc(9552);if ((((subtrahendRem >= FEB_29)&&(__CLR4_4_17au7aulgchoqp4.R.iget(9553)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9554)==0&false))) {{
            __CLR4_4_17au7aulgchoqp4.R.inc(9555);if ((((isLeapYear(subtrahendYear))&&(__CLR4_4_17au7aulgchoqp4.R.iget(9556)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9557)==0&false))) {{
                __CLR4_4_17au7aulgchoqp4.R.inc(9558);if ((((!isLeapYear(minuendYear))&&(__CLR4_4_17au7aulgchoqp4.R.iget(9559)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9560)==0&false))) {{
                    __CLR4_4_17au7aulgchoqp4.R.inc(9561);subtrahendRem -= DateTimeConstants.MILLIS_PER_DAY;
                }
            }} }else {__CLR4_4_17au7aulgchoqp4.R.inc(9562);if ((((minuendRem >= FEB_29 && isLeapYear(minuendYear))&&(__CLR4_4_17au7aulgchoqp4.R.iget(9563)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9564)==0&false))) {{
                __CLR4_4_17au7aulgchoqp4.R.inc(9565);minuendRem -= DateTimeConstants.MILLIS_PER_DAY;
            }
        }}}

        }__CLR4_4_17au7aulgchoqp4.R.inc(9566);int difference = minuendYear - subtrahendYear;
        __CLR4_4_17au7aulgchoqp4.R.inc(9567);if ((((minuendRem < subtrahendRem)&&(__CLR4_4_17au7aulgchoqp4.R.iget(9568)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9569)==0&false))) {{
            __CLR4_4_17au7aulgchoqp4.R.inc(9570);difference--;
        }
        }__CLR4_4_17au7aulgchoqp4.R.inc(9571);return difference;
    }finally{__CLR4_4_17au7aulgchoqp4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    long setYear(long instant, int year) {try{__CLR4_4_17au7aulgchoqp4.R.inc(9572);
        __CLR4_4_17au7aulgchoqp4.R.inc(9573);int thisYear = getYear(instant);
        __CLR4_4_17au7aulgchoqp4.R.inc(9574);int dayOfYear = getDayOfYear(instant, thisYear);
        __CLR4_4_17au7aulgchoqp4.R.inc(9575);int millisOfDay = getMillisOfDay(instant);

        __CLR4_4_17au7aulgchoqp4.R.inc(9576);if ((((dayOfYear > (31 + 28))&&(__CLR4_4_17au7aulgchoqp4.R.iget(9577)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9578)==0&false))) {{ // after Feb 28
            __CLR4_4_17au7aulgchoqp4.R.inc(9579);if ((((isLeapYear(thisYear))&&(__CLR4_4_17au7aulgchoqp4.R.iget(9580)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9581)==0&false))) {{
                // Current date is Feb 29 or later.
                __CLR4_4_17au7aulgchoqp4.R.inc(9582);if ((((!isLeapYear(year))&&(__CLR4_4_17au7aulgchoqp4.R.iget(9583)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9584)==0&false))) {{
                    // Moving to a non-leap year, Feb 29 does not exist.
                    __CLR4_4_17au7aulgchoqp4.R.inc(9585);dayOfYear--;
                }
            }} }else {{
                // Current date is Mar 01 or later.
                __CLR4_4_17au7aulgchoqp4.R.inc(9586);if ((((isLeapYear(year))&&(__CLR4_4_17au7aulgchoqp4.R.iget(9587)!=0|true))||(__CLR4_4_17au7aulgchoqp4.R.iget(9588)==0&false))) {{
                    // Moving to a leap year, account for Feb 29.
                    __CLR4_4_17au7aulgchoqp4.R.inc(9589);dayOfYear++;
                }
            }}
        }}

        }__CLR4_4_17au7aulgchoqp4.R.inc(9590);instant = getYearMonthDayMillis(year, 1, dayOfYear);
        __CLR4_4_17au7aulgchoqp4.R.inc(9591);instant += millisOfDay;

        __CLR4_4_17au7aulgchoqp4.R.inc(9592);return instant;
    }finally{__CLR4_4_17au7aulgchoqp4.R.flushNeeded();}}

}
