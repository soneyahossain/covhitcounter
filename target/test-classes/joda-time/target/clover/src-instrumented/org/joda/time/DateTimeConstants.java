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
package org.joda.time;

/**
 * DateTimeConstants is a non-instantiable class of constants used in
 * the date time system. These are the ISO8601 constants, but should be
 * used by all chronologies.
 * <p>
 * DateTimeConstants is thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
public class DateTimeConstants {public static class __CLR4_4_1mdmdlgchoq5c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,806,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // These are ints not enumerations as they represent genuine int values
    /**
     * Constant (1) representing January, the first month (ISO)
     */
    public static final int JANUARY = 1;

    /**
     * Constant (2) representing February, the second month (ISO)
     */
    public static final int FEBRUARY = 2;

    /**
     * Constant (3) representing March, the third month (ISO)
     */
    public static final int MARCH = 3;

    /**
     * Constant (4) representing April, the fourth month (ISO)
     */
    public static final int APRIL = 4;

    /**
     * Constant (5) representing May, the fifth month (ISO)
     */
    public static final int MAY = 5;

    /**
     * Constant (6) representing June, the sixth month (ISO)
     */
    public static final int JUNE = 6;

    /**
     * Constant (7) representing July, the seventh month (ISO)
     */
    public static final int JULY = 7;

    /**
     * Constant (8) representing August, the eighth month (ISO)
     */
    public static final int AUGUST = 8;

    /**
     * Constant (9) representing September, the nineth month (ISO)
     */
    public static final int SEPTEMBER = 9;

    /**
     * Constant (10) representing October, the tenth month (ISO)
     */
    public static final int OCTOBER = 10;

    /**
     * Constant (11) representing November, the eleventh month (ISO)
     */
    public static final int NOVEMBER = 11;

    /**
     * Constant (12) representing December, the twelfth month (ISO)
     */
    public static final int DECEMBER = 12;

    // These are ints not enumerations as they represent genuine int values
    /**
     * Constant (1) representing Monday, the first day of the week (ISO)
     */
    public static final int MONDAY = 1;

    /**
     * Constant (2) representing Tuesday, the second day of the week (ISO)
     */
    public static final int TUESDAY = 2;

    /**
     * Constant (3) representing Wednesday, the third day of the week (ISO)
     */
    public static final int WEDNESDAY = 3;

    /**
     * Constant (4) representing Thursday, the fourth day of the week (ISO)
     */
    public static final int THURSDAY = 4;

    /**
     * Constant (5) representing Friday, the fifth day of the week (ISO)
     */
    public static final int FRIDAY = 5;

    /**
     * Constant (6) representing Saturday, the sixth day of the week (ISO)
     */
    public static final int SATURDAY = 6;

    /**
     * Constant (7) representing Sunday, the seventh day of the week (ISO)
     */
    public static final int SUNDAY = 7;


    /**
     * Constant (0) representing AM, the morning (from Calendar)
     */
    public static final int AM = 0;

    /**
     * Constant (1) representing PM, the afternoon (from Calendar)
     */
    public static final int PM = 1;


    /**
     * Constant (0) representing BC, years before zero (from Calendar)
     */
    public static final int BC = 0;
    /**
     * Alternative constant (0) representing BCE, Before Common Era (secular)
     */
    public static final int BCE = 0;

    /**
     * Constant (1) representing AD, years after zero (from Calendar).
     * <p>
     * All new chronologies with different Era values should try to assign
     * eras as follows. The era that was in force at 1970-01-01 (ISO) is assigned
     * the value 1. Earlier eras are assigned sequentially smaller numbers.
     * Later eras are assigned sequentially greater numbers.
     */
    public static final int AD = 1;
    /**
     * Alternative constant (1) representing CE, Common Era (secular).
     * <p>
     * All new chronologies with different Era values should try to assign
     * eras as follows. The era that was in force at 1970-01-01 (ISO) is assigned
     * the value 1. Earlier eras are assigned sequentially smaller numbers.
     * Later eras are assigned sequentially greater numbers.
     */
    public static final int CE = 1;


    /**
     * Milliseconds in one second (1000) (ISO)
     */
    public static final int MILLIS_PER_SECOND = 1000;

    /**
     * Seconds in one minute (60) (ISO)
     */
    public static final int SECONDS_PER_MINUTE = 60;
    /**
     * Milliseconds in one minute (ISO)
     */
    public static final int MILLIS_PER_MINUTE = MILLIS_PER_SECOND * SECONDS_PER_MINUTE;

    /**
     * Minutes in one hour (ISO)
     */
    public static final int MINUTES_PER_HOUR = 60;
    /**
     * Seconds in one hour (ISO)
     */
    public static final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;
    /**
     * Milliseconds in one hour (ISO)
     */
    public static final int MILLIS_PER_HOUR = MILLIS_PER_MINUTE * MINUTES_PER_HOUR;

    /**
     * Hours in a typical day (24) (ISO). Due to time zone offset changes, the
     * number of hours per day can vary.
     */
    public static final int HOURS_PER_DAY = 24;
    /**
     * Minutes in a typical day (ISO). Due to time zone offset changes, the number
     * of minutes per day can vary.
     */
    public static final int MINUTES_PER_DAY = MINUTES_PER_HOUR * HOURS_PER_DAY;
    /**
     * Seconds in a typical day (ISO). Due to time zone offset changes, the number
     * of seconds per day can vary.
     */
    public static final int SECONDS_PER_DAY = SECONDS_PER_HOUR * HOURS_PER_DAY;
    /**
     * Milliseconds in a typical day (ISO). Due to time zone offset changes, the
     * number of milliseconds per day can vary.
     */
    public static final int MILLIS_PER_DAY = MILLIS_PER_HOUR * HOURS_PER_DAY;

    /**
     * Days in one week (7) (ISO)
     */
    public static final int DAYS_PER_WEEK = 7;
    /**
     * Hours in a typical week. Due to time zone offset changes, the number of
     * hours per week can vary.
     */
    public static final int HOURS_PER_WEEK = HOURS_PER_DAY * DAYS_PER_WEEK;
    /**
     * Minutes in a typical week (ISO). Due to time zone offset changes, the number
     * of minutes per week can vary.
     */
    public static final int MINUTES_PER_WEEK = MINUTES_PER_DAY * DAYS_PER_WEEK;
    /**
     * Seconds in a typical week (ISO). Due to time zone offset changes, the number
     * of seconds per week can vary.
     */
    public static final int SECONDS_PER_WEEK = SECONDS_PER_DAY * DAYS_PER_WEEK;
    /**
     * Milliseconds in a typical week (ISO). Due to time zone offset changes, the
     * number of milliseconds per week can vary.
     */
    public static final int MILLIS_PER_WEEK = MILLIS_PER_DAY * DAYS_PER_WEEK;

    /**
     * Restrictive constructor
     */
    protected DateTimeConstants() {try{__CLR4_4_1mdmdlgchoq5c.R.inc(805);
    }finally{__CLR4_4_1mdmdlgchoq5c.R.flushNeeded();}}

}
