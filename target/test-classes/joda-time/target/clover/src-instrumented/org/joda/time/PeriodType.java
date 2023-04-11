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
package org.joda.time;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.field.FieldUtils;

/**
 * Controls a period implementation by specifying which duration fields are to be used.
 * <p>
 * The following implementations are provided:
 * <ul>
 * <li>Standard - years, months, weeks, days, hours, minutes, seconds, millis
 * <li>YearMonthDayTime - years, months, days, hours, minutes, seconds, millis
 * <li>YearMonthDay - years, months, days
 * <li>YearWeekDayTime - years, weeks, days, hours, minutes, seconds, millis
 * <li>YearWeekDay - years, weeks, days
 * <li>YearDayTime - years, days, hours, minutes, seconds, millis
 * <li>YearDay - years, days, hours
 * <li>DayTime - days, hours, minutes, seconds, millis
 * <li>Time - hours, minutes, seconds, millis
 * <li>plus one for each single type
 * </ul>
 *
 * <p>
 * PeriodType is thread-safe and immutable, and all subclasses must be as well.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.0
 */
public class PeriodType implements Serializable {public static class __CLR4_4_14kr4krlgchoqho{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,6275,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Serialization version
     */
    private static final long serialVersionUID = 2274324892792009998L;

    /**
     * Cache of all the known types.
     */
    private static final Map<PeriodType, Object> cTypes = new HashMap<PeriodType, Object>(32);

    static int YEAR_INDEX = 0;
    static int MONTH_INDEX = 1;
    static int WEEK_INDEX = 2;
    static int DAY_INDEX = 3;
    static int HOUR_INDEX = 4;
    static int MINUTE_INDEX = 5;
    static int SECOND_INDEX = 6;
    static int MILLI_INDEX = 7;

    private static PeriodType cStandard;
    private static PeriodType cYMDTime;
    private static PeriodType cYMD;
    private static PeriodType cYWDTime;
    private static PeriodType cYWD;
    private static PeriodType cYDTime;
    private static PeriodType cYD;
    private static PeriodType cDTime;
    private static PeriodType cTime;

    private static PeriodType cYears;
    private static PeriodType cMonths;
    private static PeriodType cWeeks;
    private static PeriodType cDays;
    private static PeriodType cHours;
    private static PeriodType cMinutes;
    private static PeriodType cSeconds;
    private static PeriodType cMillis;

    /**
     * Gets a type that defines all standard fields.
     * <ul>
     * <li>years
     * <li>months
     * <li>weeks
     * <li>days
     * <li>hours
     * <li>minutes
     * <li>seconds
     * <li>milliseconds
     * </ul>
     *
     * @return the period type
     */
    public static PeriodType standard() {try{__CLR4_4_14kr4krlgchoqho.R.inc(5931);
        __CLR4_4_14kr4krlgchoqho.R.inc(5932);PeriodType type = cStandard;
        __CLR4_4_14kr4krlgchoqho.R.inc(5933);if ((((type == null)&&(__CLR4_4_14kr4krlgchoqho.R.iget(5934)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(5935)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(5936);type = new PeriodType(
                    "Standard",
                    new DurationFieldType[]{
                            DurationFieldType.years(), DurationFieldType.months(),
                            DurationFieldType.weeks(), DurationFieldType.days(),
                            DurationFieldType.hours(), DurationFieldType.minutes(),
                            DurationFieldType.seconds(), DurationFieldType.millis(),
                    },
                    new int[]{0, 1, 2, 3, 4, 5, 6, 7,}
            );
            __CLR4_4_14kr4krlgchoqho.R.inc(5937);cStandard = type;
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(5938);return type;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Gets a type that defines all standard fields except weeks.
     * <ul>
     * <li>years
     * <li>months
     * <li>days
     * <li>hours
     * <li>minutes
     * <li>seconds
     * <li>milliseconds
     * </ul>
     *
     * @return the period type
     */
    public static PeriodType yearMonthDayTime() {try{__CLR4_4_14kr4krlgchoqho.R.inc(5939);
        __CLR4_4_14kr4krlgchoqho.R.inc(5940);PeriodType type = cYMDTime;
        __CLR4_4_14kr4krlgchoqho.R.inc(5941);if ((((type == null)&&(__CLR4_4_14kr4krlgchoqho.R.iget(5942)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(5943)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(5944);type = new PeriodType(
                    "YearMonthDayTime",
                    new DurationFieldType[]{
                            DurationFieldType.years(), DurationFieldType.months(),
                            DurationFieldType.days(),
                            DurationFieldType.hours(), DurationFieldType.minutes(),
                            DurationFieldType.seconds(), DurationFieldType.millis(),
                    },
                    new int[]{0, 1, -1, 2, 3, 4, 5, 6,}
            );
            __CLR4_4_14kr4krlgchoqho.R.inc(5945);cYMDTime = type;
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(5946);return type;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Gets a type that defines the year, month and day fields.
     * <ul>
     * <li>years
     * <li>months
     * <li>days
     * </ul>
     *
     * @return the period type
     * @since 1.1
     */
    public static PeriodType yearMonthDay() {try{__CLR4_4_14kr4krlgchoqho.R.inc(5947);
        __CLR4_4_14kr4krlgchoqho.R.inc(5948);PeriodType type = cYMD;
        __CLR4_4_14kr4krlgchoqho.R.inc(5949);if ((((type == null)&&(__CLR4_4_14kr4krlgchoqho.R.iget(5950)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(5951)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(5952);type = new PeriodType(
                    "YearMonthDay",
                    new DurationFieldType[]{
                            DurationFieldType.years(), DurationFieldType.months(),
                            DurationFieldType.days(),
                    },
                    new int[]{0, 1, -1, 2, -1, -1, -1, -1,}
            );
            __CLR4_4_14kr4krlgchoqho.R.inc(5953);cYMD = type;
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(5954);return type;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Gets a type that defines all standard fields except months.
     * <ul>
     * <li>years
     * <li>weeks
     * <li>days
     * <li>hours
     * <li>minutes
     * <li>seconds
     * <li>milliseconds
     * </ul>
     *
     * @return the period type
     */
    public static PeriodType yearWeekDayTime() {try{__CLR4_4_14kr4krlgchoqho.R.inc(5955);
        __CLR4_4_14kr4krlgchoqho.R.inc(5956);PeriodType type = cYWDTime;
        __CLR4_4_14kr4krlgchoqho.R.inc(5957);if ((((type == null)&&(__CLR4_4_14kr4krlgchoqho.R.iget(5958)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(5959)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(5960);type = new PeriodType(
                    "YearWeekDayTime",
                    new DurationFieldType[]{
                            DurationFieldType.years(),
                            DurationFieldType.weeks(), DurationFieldType.days(),
                            DurationFieldType.hours(), DurationFieldType.minutes(),
                            DurationFieldType.seconds(), DurationFieldType.millis(),
                    },
                    new int[]{0, -1, 1, 2, 3, 4, 5, 6,}
            );
            __CLR4_4_14kr4krlgchoqho.R.inc(5961);cYWDTime = type;
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(5962);return type;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Gets a type that defines year, week and day fields.
     * <ul>
     * <li>years
     * <li>weeks
     * <li>days
     * </ul>
     *
     * @return the period type
     * @since 1.1
     */
    public static PeriodType yearWeekDay() {try{__CLR4_4_14kr4krlgchoqho.R.inc(5963);
        __CLR4_4_14kr4krlgchoqho.R.inc(5964);PeriodType type = cYWD;
        __CLR4_4_14kr4krlgchoqho.R.inc(5965);if ((((type == null)&&(__CLR4_4_14kr4krlgchoqho.R.iget(5966)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(5967)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(5968);type = new PeriodType(
                    "YearWeekDay",
                    new DurationFieldType[]{
                            DurationFieldType.years(),
                            DurationFieldType.weeks(), DurationFieldType.days(),
                    },
                    new int[]{0, -1, 1, 2, -1, -1, -1, -1,}
            );
            __CLR4_4_14kr4krlgchoqho.R.inc(5969);cYWD = type;
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(5970);return type;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Gets a type that defines all standard fields except months and weeks.
     * <ul>
     * <li>years
     * <li>days
     * <li>hours
     * <li>minutes
     * <li>seconds
     * <li>milliseconds
     * </ul>
     *
     * @return the period type
     */
    public static PeriodType yearDayTime() {try{__CLR4_4_14kr4krlgchoqho.R.inc(5971);
        __CLR4_4_14kr4krlgchoqho.R.inc(5972);PeriodType type = cYDTime;
        __CLR4_4_14kr4krlgchoqho.R.inc(5973);if ((((type == null)&&(__CLR4_4_14kr4krlgchoqho.R.iget(5974)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(5975)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(5976);type = new PeriodType(
                    "YearDayTime",
                    new DurationFieldType[]{
                            DurationFieldType.years(), DurationFieldType.days(),
                            DurationFieldType.hours(), DurationFieldType.minutes(),
                            DurationFieldType.seconds(), DurationFieldType.millis(),
                    },
                    new int[]{0, -1, -1, 1, 2, 3, 4, 5,}
            );
            __CLR4_4_14kr4krlgchoqho.R.inc(5977);cYDTime = type;
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(5978);return type;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Gets a type that defines the year and day fields.
     * <ul>
     * <li>years
     * <li>days
     * </ul>
     *
     * @return the period type
     * @since 1.1
     */
    public static PeriodType yearDay() {try{__CLR4_4_14kr4krlgchoqho.R.inc(5979);
        __CLR4_4_14kr4krlgchoqho.R.inc(5980);PeriodType type = cYD;
        __CLR4_4_14kr4krlgchoqho.R.inc(5981);if ((((type == null)&&(__CLR4_4_14kr4krlgchoqho.R.iget(5982)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(5983)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(5984);type = new PeriodType(
                    "YearDay",
                    new DurationFieldType[]{
                            DurationFieldType.years(), DurationFieldType.days(),
                    },
                    new int[]{0, -1, -1, 1, -1, -1, -1, -1,}
            );
            __CLR4_4_14kr4krlgchoqho.R.inc(5985);cYD = type;
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(5986);return type;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Gets a type that defines all standard fields from days downwards.
     * <ul>
     * <li>days
     * <li>hours
     * <li>minutes
     * <li>seconds
     * <li>milliseconds
     * </ul>
     *
     * @return the period type
     */
    public static PeriodType dayTime() {try{__CLR4_4_14kr4krlgchoqho.R.inc(5987);
        __CLR4_4_14kr4krlgchoqho.R.inc(5988);PeriodType type = cDTime;
        __CLR4_4_14kr4krlgchoqho.R.inc(5989);if ((((type == null)&&(__CLR4_4_14kr4krlgchoqho.R.iget(5990)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(5991)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(5992);type = new PeriodType(
                    "DayTime",
                    new DurationFieldType[]{
                            DurationFieldType.days(),
                            DurationFieldType.hours(), DurationFieldType.minutes(),
                            DurationFieldType.seconds(), DurationFieldType.millis(),
                    },
                    new int[]{-1, -1, -1, 0, 1, 2, 3, 4,}
            );
            __CLR4_4_14kr4krlgchoqho.R.inc(5993);cDTime = type;
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(5994);return type;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Gets a type that defines all standard time fields.
     * <ul>
     * <li>hours
     * <li>minutes
     * <li>seconds
     * <li>milliseconds
     * </ul>
     *
     * @return the period type
     */
    public static PeriodType time() {try{__CLR4_4_14kr4krlgchoqho.R.inc(5995);
        __CLR4_4_14kr4krlgchoqho.R.inc(5996);PeriodType type = cTime;
        __CLR4_4_14kr4krlgchoqho.R.inc(5997);if ((((type == null)&&(__CLR4_4_14kr4krlgchoqho.R.iget(5998)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(5999)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6000);type = new PeriodType(
                    "Time",
                    new DurationFieldType[]{
                            DurationFieldType.hours(), DurationFieldType.minutes(),
                            DurationFieldType.seconds(), DurationFieldType.millis(),
                    },
                    new int[]{-1, -1, -1, -1, 0, 1, 2, 3,}
            );
            __CLR4_4_14kr4krlgchoqho.R.inc(6001);cTime = type;
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6002);return type;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Gets a type that defines just the years field.
     *
     * @return the period type
     */
    public static PeriodType years() {try{__CLR4_4_14kr4krlgchoqho.R.inc(6003);
        __CLR4_4_14kr4krlgchoqho.R.inc(6004);PeriodType type = cYears;
        __CLR4_4_14kr4krlgchoqho.R.inc(6005);if ((((type == null)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6006)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6007)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6008);type = new PeriodType(
                    "Years",
                    new DurationFieldType[]{DurationFieldType.years()},
                    new int[]{0, -1, -1, -1, -1, -1, -1, -1,}
            );
            __CLR4_4_14kr4krlgchoqho.R.inc(6009);cYears = type;
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6010);return type;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Gets a type that defines just the months field.
     *
     * @return the period type
     */
    public static PeriodType months() {try{__CLR4_4_14kr4krlgchoqho.R.inc(6011);
        __CLR4_4_14kr4krlgchoqho.R.inc(6012);PeriodType type = cMonths;
        __CLR4_4_14kr4krlgchoqho.R.inc(6013);if ((((type == null)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6014)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6015)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6016);type = new PeriodType(
                    "Months",
                    new DurationFieldType[]{DurationFieldType.months()},
                    new int[]{-1, 0, -1, -1, -1, -1, -1, -1,}
            );
            __CLR4_4_14kr4krlgchoqho.R.inc(6017);cMonths = type;
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6018);return type;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Gets a type that defines just the weeks field.
     *
     * @return the period type
     */
    public static PeriodType weeks() {try{__CLR4_4_14kr4krlgchoqho.R.inc(6019);
        __CLR4_4_14kr4krlgchoqho.R.inc(6020);PeriodType type = cWeeks;
        __CLR4_4_14kr4krlgchoqho.R.inc(6021);if ((((type == null)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6022)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6023)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6024);type = new PeriodType(
                    "Weeks",
                    new DurationFieldType[]{DurationFieldType.weeks()},
                    new int[]{-1, -1, 0, -1, -1, -1, -1, -1,}
            );
            __CLR4_4_14kr4krlgchoqho.R.inc(6025);cWeeks = type;
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6026);return type;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Gets a type that defines just the days field.
     *
     * @return the period type
     */
    public static PeriodType days() {try{__CLR4_4_14kr4krlgchoqho.R.inc(6027);
        __CLR4_4_14kr4krlgchoqho.R.inc(6028);PeriodType type = cDays;
        __CLR4_4_14kr4krlgchoqho.R.inc(6029);if ((((type == null)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6030)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6031)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6032);type = new PeriodType(
                    "Days",
                    new DurationFieldType[]{DurationFieldType.days()},
                    new int[]{-1, -1, -1, 0, -1, -1, -1, -1,}
            );
            __CLR4_4_14kr4krlgchoqho.R.inc(6033);cDays = type;
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6034);return type;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Gets a type that defines just the hours field.
     *
     * @return the period type
     */
    public static PeriodType hours() {try{__CLR4_4_14kr4krlgchoqho.R.inc(6035);
        __CLR4_4_14kr4krlgchoqho.R.inc(6036);PeriodType type = cHours;
        __CLR4_4_14kr4krlgchoqho.R.inc(6037);if ((((type == null)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6038)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6039)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6040);type = new PeriodType(
                    "Hours",
                    new DurationFieldType[]{DurationFieldType.hours()},
                    new int[]{-1, -1, -1, -1, 0, -1, -1, -1,}
            );
            __CLR4_4_14kr4krlgchoqho.R.inc(6041);cHours = type;
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6042);return type;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Gets a type that defines just the minutes field.
     *
     * @return the period type
     */
    public static PeriodType minutes() {try{__CLR4_4_14kr4krlgchoqho.R.inc(6043);
        __CLR4_4_14kr4krlgchoqho.R.inc(6044);PeriodType type = cMinutes;
        __CLR4_4_14kr4krlgchoqho.R.inc(6045);if ((((type == null)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6046)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6047)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6048);type = new PeriodType(
                    "Minutes",
                    new DurationFieldType[]{DurationFieldType.minutes()},
                    new int[]{-1, -1, -1, -1, -1, 0, -1, -1,}
            );
            __CLR4_4_14kr4krlgchoqho.R.inc(6049);cMinutes = type;
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6050);return type;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Gets a type that defines just the seconds field.
     *
     * @return the period type
     */
    public static PeriodType seconds() {try{__CLR4_4_14kr4krlgchoqho.R.inc(6051);
        __CLR4_4_14kr4krlgchoqho.R.inc(6052);PeriodType type = cSeconds;
        __CLR4_4_14kr4krlgchoqho.R.inc(6053);if ((((type == null)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6054)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6055)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6056);type = new PeriodType(
                    "Seconds",
                    new DurationFieldType[]{DurationFieldType.seconds()},
                    new int[]{-1, -1, -1, -1, -1, -1, 0, -1,}
            );
            __CLR4_4_14kr4krlgchoqho.R.inc(6057);cSeconds = type;
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6058);return type;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Gets a type that defines just the millis field.
     *
     * @return the period type
     */
    public static PeriodType millis() {try{__CLR4_4_14kr4krlgchoqho.R.inc(6059);
        __CLR4_4_14kr4krlgchoqho.R.inc(6060);PeriodType type = cMillis;
        __CLR4_4_14kr4krlgchoqho.R.inc(6061);if ((((type == null)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6062)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6063)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6064);type = new PeriodType(
                    "Millis",
                    new DurationFieldType[]{DurationFieldType.millis()},
                    new int[]{-1, -1, -1, -1, -1, -1, -1, 0,}
            );
            __CLR4_4_14kr4krlgchoqho.R.inc(6065);cMillis = type;
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6066);return type;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Gets a period type that contains the duration types of the array.
     * <p>
     * Only the 8 standard duration field types are supported.
     *
     * @param types the types to include in the array.
     * @return the period type
     * @since 1.1
     */
    public static synchronized PeriodType forFields(DurationFieldType[] types) {try{__CLR4_4_14kr4krlgchoqho.R.inc(6067);
        __CLR4_4_14kr4krlgchoqho.R.inc(6068);if ((((types == null || types.length == 0)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6069)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6070)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6071);throw new IllegalArgumentException("Types array must not be null or empty");
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6072);for (int i = 0; (((i < types.length)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6073)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6074)==0&false)); i++) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6075);if ((((types[i] == null)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6076)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6077)==0&false))) {{
                __CLR4_4_14kr4krlgchoqho.R.inc(6078);throw new IllegalArgumentException("Types array must not contain null");
            }
        }}
        }__CLR4_4_14kr4krlgchoqho.R.inc(6079);Map<PeriodType, Object> cache = cTypes;
        __CLR4_4_14kr4krlgchoqho.R.inc(6080);if ((((cache.isEmpty())&&(__CLR4_4_14kr4krlgchoqho.R.iget(6081)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6082)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6083);cache.put(standard(), standard());
            __CLR4_4_14kr4krlgchoqho.R.inc(6084);cache.put(yearMonthDayTime(), yearMonthDayTime());
            __CLR4_4_14kr4krlgchoqho.R.inc(6085);cache.put(yearMonthDay(), yearMonthDay());
            __CLR4_4_14kr4krlgchoqho.R.inc(6086);cache.put(yearWeekDayTime(), yearWeekDayTime());
            __CLR4_4_14kr4krlgchoqho.R.inc(6087);cache.put(yearWeekDay(), yearWeekDay());
            __CLR4_4_14kr4krlgchoqho.R.inc(6088);cache.put(yearDayTime(), yearDayTime());
            __CLR4_4_14kr4krlgchoqho.R.inc(6089);cache.put(yearDay(), yearDay());
            __CLR4_4_14kr4krlgchoqho.R.inc(6090);cache.put(dayTime(), dayTime());
            __CLR4_4_14kr4krlgchoqho.R.inc(6091);cache.put(time(), time());
            __CLR4_4_14kr4krlgchoqho.R.inc(6092);cache.put(years(), years());
            __CLR4_4_14kr4krlgchoqho.R.inc(6093);cache.put(months(), months());
            __CLR4_4_14kr4krlgchoqho.R.inc(6094);cache.put(weeks(), weeks());
            __CLR4_4_14kr4krlgchoqho.R.inc(6095);cache.put(days(), days());
            __CLR4_4_14kr4krlgchoqho.R.inc(6096);cache.put(hours(), hours());
            __CLR4_4_14kr4krlgchoqho.R.inc(6097);cache.put(minutes(), minutes());
            __CLR4_4_14kr4krlgchoqho.R.inc(6098);cache.put(seconds(), seconds());
            __CLR4_4_14kr4krlgchoqho.R.inc(6099);cache.put(millis(), millis());
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6100);PeriodType inPartType = new PeriodType(null, types, null);
        __CLR4_4_14kr4krlgchoqho.R.inc(6101);Object cached = cache.get(inPartType);
        __CLR4_4_14kr4krlgchoqho.R.inc(6102);if ((((cached instanceof PeriodType)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6103)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6104)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6105);return (PeriodType) cached;
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6106);if ((((cached != null)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6107)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6108)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6109);throw new IllegalArgumentException("PeriodType does not support fields: " + cached);
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6110);PeriodType type = standard();
        __CLR4_4_14kr4krlgchoqho.R.inc(6111);List<DurationFieldType> list = new ArrayList<DurationFieldType>(Arrays.asList(types));
        __CLR4_4_14kr4krlgchoqho.R.inc(6112);if ((((list.remove(DurationFieldType.years()) == false)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6113)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6114)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6115);type = type.withYearsRemoved();
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6116);if ((((list.remove(DurationFieldType.months()) == false)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6117)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6118)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6119);type = type.withMonthsRemoved();
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6120);if ((((list.remove(DurationFieldType.weeks()) == false)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6121)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6122)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6123);type = type.withWeeksRemoved();
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6124);if ((((list.remove(DurationFieldType.days()) == false)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6125)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6126)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6127);type = type.withDaysRemoved();
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6128);if ((((list.remove(DurationFieldType.hours()) == false)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6129)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6130)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6131);type = type.withHoursRemoved();
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6132);if ((((list.remove(DurationFieldType.minutes()) == false)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6133)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6134)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6135);type = type.withMinutesRemoved();
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6136);if ((((list.remove(DurationFieldType.seconds()) == false)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6137)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6138)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6139);type = type.withSecondsRemoved();
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6140);if ((((list.remove(DurationFieldType.millis()) == false)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6141)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6142)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6143);type = type.withMillisRemoved();
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6144);if ((((list.size() > 0)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6145)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6146)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6147);cache.put(inPartType, list);
            __CLR4_4_14kr4krlgchoqho.R.inc(6148);throw new IllegalArgumentException("PeriodType does not support fields: " + list);
        }
        // recheck cache in case initial array order was wrong
        }__CLR4_4_14kr4krlgchoqho.R.inc(6149);PeriodType checkPartType = new PeriodType(null, type.iTypes, null);
        __CLR4_4_14kr4krlgchoqho.R.inc(6150);PeriodType checkedType = (PeriodType) cache.get(checkPartType);
        __CLR4_4_14kr4krlgchoqho.R.inc(6151);if ((((checkedType != null)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6152)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6153)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6154);cache.put(checkPartType, checkedType);
            __CLR4_4_14kr4krlgchoqho.R.inc(6155);return checkedType;
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6156);cache.put(checkPartType, type);
        __CLR4_4_14kr4krlgchoqho.R.inc(6157);return type;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    //-----------------------------------------------------------------------    
    /**
     * The name of the type
     */
    private final String iName;
    /**
     * The array of types
     */
    private final DurationFieldType[] iTypes;
    /**
     * The array of indices
     */
    private final int[] iIndices;

    /**
     * Constructor.
     *
     * @param name    the name
     * @param types   the types
     * @param indices the indices
     */
    protected PeriodType(String name, DurationFieldType[] types, int[] indices) {
        super();__CLR4_4_14kr4krlgchoqho.R.inc(6159);try{__CLR4_4_14kr4krlgchoqho.R.inc(6158);
        __CLR4_4_14kr4krlgchoqho.R.inc(6160);iName = name;
        __CLR4_4_14kr4krlgchoqho.R.inc(6161);iTypes = types;
        __CLR4_4_14kr4krlgchoqho.R.inc(6162);iIndices = indices;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the name of the period type.
     *
     * @return the name
     */
    public String getName() {try{__CLR4_4_14kr4krlgchoqho.R.inc(6163);
        __CLR4_4_14kr4krlgchoqho.R.inc(6164);return iName;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Gets the number of fields in the period type.
     *
     * @return the number of fields
     */
    public int size() {try{__CLR4_4_14kr4krlgchoqho.R.inc(6165);
        __CLR4_4_14kr4krlgchoqho.R.inc(6166);return iTypes.length;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Gets the field type by index.
     *
     * @param index the index to retrieve
     * @return the field type
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public DurationFieldType getFieldType(int index) {try{__CLR4_4_14kr4krlgchoqho.R.inc(6167);
        __CLR4_4_14kr4krlgchoqho.R.inc(6168);return iTypes[index];
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Checks whether the field specified is supported by this period.
     *
     * @param type the type to check, may be null which returns false
     * @return true if the field is supported
     */
    public boolean isSupported(DurationFieldType type) {try{__CLR4_4_14kr4krlgchoqho.R.inc(6169);
        __CLR4_4_14kr4krlgchoqho.R.inc(6170);return (indexOf(type) >= 0);
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Gets the index of the field in this period.
     *
     * @param type the type to check, may be null which returns -1
     * @return the index of -1 if not supported
     */
    public int indexOf(DurationFieldType type) {try{__CLR4_4_14kr4krlgchoqho.R.inc(6171);
        __CLR4_4_14kr4krlgchoqho.R.inc(6172);for (int i = 0, isize = size(); (((i < isize)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6173)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6174)==0&false)); i++) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6175);if ((((iTypes[i] == type)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6176)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6177)==0&false))) {{
                __CLR4_4_14kr4krlgchoqho.R.inc(6178);return i;
            }
        }}
        }__CLR4_4_14kr4krlgchoqho.R.inc(6179);return -1;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Gets a debugging to string.
     *
     * @return a string
     */
    public String toString() {try{__CLR4_4_14kr4krlgchoqho.R.inc(6180);
        __CLR4_4_14kr4krlgchoqho.R.inc(6181);return "PeriodType[" + getName() + "]";
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the indexed field part of the period.
     *
     * @param period the period to query
     * @param index  the index to use
     * @return the value of the field, zero if unsupported
     */
    int getIndexedField(ReadablePeriod period, int index) {try{__CLR4_4_14kr4krlgchoqho.R.inc(6182);
        __CLR4_4_14kr4krlgchoqho.R.inc(6183);int realIndex = iIndices[index];
        __CLR4_4_14kr4krlgchoqho.R.inc(6184);return ((((realIndex == -1 )&&(__CLR4_4_14kr4krlgchoqho.R.iget(6185)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6186)==0&false))? 0 : period.getValue(realIndex));
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Sets the indexed field part of the period.
     *
     * @param period   the period to query
     * @param index    the index to use
     * @param values   the array to populate
     * @param newValue the value to set
     * @throws UnsupportedOperationException if not supported
     */
    boolean setIndexedField(ReadablePeriod period, int index, int[] values, int newValue) {try{__CLR4_4_14kr4krlgchoqho.R.inc(6187);
        __CLR4_4_14kr4krlgchoqho.R.inc(6188);int realIndex = iIndices[index];
        __CLR4_4_14kr4krlgchoqho.R.inc(6189);if ((((realIndex == -1)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6190)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6191)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6192);throw new UnsupportedOperationException("Field is not supported");
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6193);values[realIndex] = newValue;
        __CLR4_4_14kr4krlgchoqho.R.inc(6194);return true;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Adds to the indexed field part of the period.
     *
     * @param period     the period to query
     * @param index      the index to use
     * @param values     the array to populate
     * @param valueToAdd the value to add
     * @return true if the array is updated
     * @throws UnsupportedOperationException if not supported
     */
    boolean addIndexedField(ReadablePeriod period, int index, int[] values, int valueToAdd) {try{__CLR4_4_14kr4krlgchoqho.R.inc(6195);
        __CLR4_4_14kr4krlgchoqho.R.inc(6196);if ((((valueToAdd == 0)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6197)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6198)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6199);return false;
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6200);int realIndex = iIndices[index];
        __CLR4_4_14kr4krlgchoqho.R.inc(6201);if ((((realIndex == -1)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6202)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6203)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6204);throw new UnsupportedOperationException("Field is not supported");
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6205);values[realIndex] = FieldUtils.safeAdd(values[realIndex], valueToAdd);
        __CLR4_4_14kr4krlgchoqho.R.inc(6206);return true;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a version of this PeriodType instance that does not support years.
     *
     * @return a new period type that supports the original set of fields except years
     */
    public PeriodType withYearsRemoved() {try{__CLR4_4_14kr4krlgchoqho.R.inc(6207);
        __CLR4_4_14kr4krlgchoqho.R.inc(6208);return withFieldRemoved(0, "NoYears");
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Returns a version of this PeriodType instance that does not support months.
     *
     * @return a new period type that supports the original set of fields except months
     */
    public PeriodType withMonthsRemoved() {try{__CLR4_4_14kr4krlgchoqho.R.inc(6209);
        __CLR4_4_14kr4krlgchoqho.R.inc(6210);return withFieldRemoved(1, "NoMonths");
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Returns a version of this PeriodType instance that does not support weeks.
     *
     * @return a new period type that supports the original set of fields except weeks
     */
    public PeriodType withWeeksRemoved() {try{__CLR4_4_14kr4krlgchoqho.R.inc(6211);
        __CLR4_4_14kr4krlgchoqho.R.inc(6212);return withFieldRemoved(2, "NoWeeks");
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Returns a version of this PeriodType instance that does not support days.
     *
     * @return a new period type that supports the original set of fields except days
     */
    public PeriodType withDaysRemoved() {try{__CLR4_4_14kr4krlgchoqho.R.inc(6213);
        __CLR4_4_14kr4krlgchoqho.R.inc(6214);return withFieldRemoved(3, "NoDays");
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Returns a version of this PeriodType instance that does not support hours.
     *
     * @return a new period type that supports the original set of fields except hours
     */
    public PeriodType withHoursRemoved() {try{__CLR4_4_14kr4krlgchoqho.R.inc(6215);
        __CLR4_4_14kr4krlgchoqho.R.inc(6216);return withFieldRemoved(4, "NoHours");
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Returns a version of this PeriodType instance that does not support minutes.
     *
     * @return a new period type that supports the original set of fields except minutes
     */
    public PeriodType withMinutesRemoved() {try{__CLR4_4_14kr4krlgchoqho.R.inc(6217);
        __CLR4_4_14kr4krlgchoqho.R.inc(6218);return withFieldRemoved(5, "NoMinutes");
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Returns a version of this PeriodType instance that does not support seconds.
     *
     * @return a new period type that supports the original set of fields except seconds
     */
    public PeriodType withSecondsRemoved() {try{__CLR4_4_14kr4krlgchoqho.R.inc(6219);
        __CLR4_4_14kr4krlgchoqho.R.inc(6220);return withFieldRemoved(6, "NoSeconds");
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Returns a version of this PeriodType instance that does not support milliseconds.
     *
     * @return a new period type that supports the original set of fields except milliseconds
     */
    public PeriodType withMillisRemoved() {try{__CLR4_4_14kr4krlgchoqho.R.inc(6221);
        __CLR4_4_14kr4krlgchoqho.R.inc(6222);return withFieldRemoved(7, "NoMillis");
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Removes the field specified by indices index.
     *
     * @param indicesIndex the index to remove
     * @param name         the name addition
     * @return the new type
     */
    private PeriodType withFieldRemoved(int indicesIndex, String name) {try{__CLR4_4_14kr4krlgchoqho.R.inc(6223);
        __CLR4_4_14kr4krlgchoqho.R.inc(6224);int fieldIndex = iIndices[indicesIndex];
        __CLR4_4_14kr4krlgchoqho.R.inc(6225);if ((((fieldIndex == -1)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6226)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6227)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6228);return this;
        }

        }__CLR4_4_14kr4krlgchoqho.R.inc(6229);DurationFieldType[] types = new DurationFieldType[size() - 1];
        __CLR4_4_14kr4krlgchoqho.R.inc(6230);for (int i = 0; (((i < iTypes.length)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6231)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6232)==0&false)); i++) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6233);if ((((i < fieldIndex)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6234)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6235)==0&false))) {{
                __CLR4_4_14kr4krlgchoqho.R.inc(6236);types[i] = iTypes[i];
            } }else {__CLR4_4_14kr4krlgchoqho.R.inc(6237);if ((((i > fieldIndex)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6238)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6239)==0&false))) {{
                __CLR4_4_14kr4krlgchoqho.R.inc(6240);types[i - 1] = iTypes[i];
            }
        }}}

        }__CLR4_4_14kr4krlgchoqho.R.inc(6241);int[] indices = new int[8];
        __CLR4_4_14kr4krlgchoqho.R.inc(6242);for (int i = 0; (((i < indices.length)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6243)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6244)==0&false)); i++) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6245);if ((((i < indicesIndex)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6246)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6247)==0&false))) {{
                __CLR4_4_14kr4krlgchoqho.R.inc(6248);indices[i] = iIndices[i];
            } }else {__CLR4_4_14kr4krlgchoqho.R.inc(6249);if ((((i > indicesIndex)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6250)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6251)==0&false))) {{
                __CLR4_4_14kr4krlgchoqho.R.inc(6252);indices[i] = ((((iIndices[i] == -1 )&&(__CLR4_4_14kr4krlgchoqho.R.iget(6253)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6254)==0&false))? -1 : iIndices[i] - 1);
            } }else {{
                __CLR4_4_14kr4krlgchoqho.R.inc(6255);indices[i] = -1;
            }
        }}}
        }__CLR4_4_14kr4krlgchoqho.R.inc(6256);return new PeriodType(getName() + name, types, indices);
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Compares this type to another object.
     * To be equal, the object must be a PeriodType with the same set of fields.
     *
     * @param obj the object to compare to
     * @return true if equal
     */
    public boolean equals(Object obj) {try{__CLR4_4_14kr4krlgchoqho.R.inc(6257);
        __CLR4_4_14kr4krlgchoqho.R.inc(6258);if ((((this == obj)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6259)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6260)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6261);return true;
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6262);if ((((obj instanceof PeriodType == false)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6263)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6264)==0&false))) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6265);return false;
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6266);PeriodType other = (PeriodType) obj;
        __CLR4_4_14kr4krlgchoqho.R.inc(6267);return (Arrays.equals(iTypes, other.iTypes));
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

    /**
     * Returns a hashcode based on the field types.
     *
     * @return a suitable hashcode
     */
    public int hashCode() {try{__CLR4_4_14kr4krlgchoqho.R.inc(6268);
        __CLR4_4_14kr4krlgchoqho.R.inc(6269);int hash = 0;
        __CLR4_4_14kr4krlgchoqho.R.inc(6270);for (int i = 0; (((i < iTypes.length)&&(__CLR4_4_14kr4krlgchoqho.R.iget(6271)!=0|true))||(__CLR4_4_14kr4krlgchoqho.R.iget(6272)==0&false)); i++) {{
            __CLR4_4_14kr4krlgchoqho.R.inc(6273);hash += iTypes[i].hashCode();
        }
        }__CLR4_4_14kr4krlgchoqho.R.inc(6274);return hash;
    }finally{__CLR4_4_14kr4krlgchoqho.R.flushNeeded();}}

}
