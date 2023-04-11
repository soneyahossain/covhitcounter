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

import java.io.Serializable;

/**
 * Identifies a field, such as year or minuteOfHour, in a chronology-neutral way.
 * <p>
 * A field type defines the type of the field, such as hourOfDay.
 * If does not directly enable any calculations, however it does provide a
 * {@link #getField(Chronology)} method that returns the actual calculation engine
 * for a particular chronology.
 * It also provides access to the related {@link DurationFieldType}s.
 * <p>
 * Instances of <code>DateTimeFieldType</code> are singletons.
 * They can be compared using <code>==</code>.
 * <p>
 * If required, you can create your own field, for example a quarterOfYear.
 * You must create a subclass of <code>DateTimeFieldType</code> that defines the field type.
 * This class returns the actual calculation engine from {@link #getField(Chronology)}.
 * The subclass should implement equals and hashCode.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public abstract class DateTimeFieldType implements Serializable {public static class __CLR4_4_1mgmglgchoq63{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,985,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization version
     */
    private static final long serialVersionUID = -42615285973990L;

    /**
     * Ordinal values for standard field types.
     */
    static final byte
            ERA = 1,
            YEAR_OF_ERA = 2,
            CENTURY_OF_ERA = 3,
            YEAR_OF_CENTURY = 4,
            YEAR = 5,
            DAY_OF_YEAR = 6,
            MONTH_OF_YEAR = 7,
            DAY_OF_MONTH = 8,
            WEEKYEAR_OF_CENTURY = 9,
            WEEKYEAR = 10,
            WEEK_OF_WEEKYEAR = 11,
            DAY_OF_WEEK = 12,
            HALFDAY_OF_DAY = 13,
            HOUR_OF_HALFDAY = 14,
            CLOCKHOUR_OF_HALFDAY = 15,
            CLOCKHOUR_OF_DAY = 16,
            HOUR_OF_DAY = 17,
            MINUTE_OF_DAY = 18,
            MINUTE_OF_HOUR = 19,
            SECOND_OF_DAY = 20,
            SECOND_OF_MINUTE = 21,
            MILLIS_OF_DAY = 22,
            MILLIS_OF_SECOND = 23;

    /**
     * The era field type.
     */
    private static final DateTimeFieldType ERA_TYPE = new StandardDateTimeFieldType(
            "era", ERA, DurationFieldType.eras(), null);
    /**
     * The yearOfEra field type.
     */
    private static final DateTimeFieldType YEAR_OF_ERA_TYPE = new StandardDateTimeFieldType(
            "yearOfEra", YEAR_OF_ERA, DurationFieldType.years(), DurationFieldType.eras());
    /**
     * The centuryOfEra field type.
     */
    private static final DateTimeFieldType CENTURY_OF_ERA_TYPE = new StandardDateTimeFieldType(
            "centuryOfEra", CENTURY_OF_ERA, DurationFieldType.centuries(), DurationFieldType.eras());
    /**
     * The yearOfCentury field type.
     */
    private static final DateTimeFieldType YEAR_OF_CENTURY_TYPE = new StandardDateTimeFieldType(
            "yearOfCentury", YEAR_OF_CENTURY, DurationFieldType.years(), DurationFieldType.centuries());
    /**
     * The year field type.
     */
    private static final DateTimeFieldType YEAR_TYPE = new StandardDateTimeFieldType(
            "year", YEAR, DurationFieldType.years(), null);
    /**
     * The dayOfYear field type.
     */
    private static final DateTimeFieldType DAY_OF_YEAR_TYPE = new StandardDateTimeFieldType(
            "dayOfYear", DAY_OF_YEAR, DurationFieldType.days(), DurationFieldType.years());
    /**
     * The monthOfYear field type.
     */
    private static final DateTimeFieldType MONTH_OF_YEAR_TYPE = new StandardDateTimeFieldType(
            "monthOfYear", MONTH_OF_YEAR, DurationFieldType.months(), DurationFieldType.years());
    /**
     * The dayOfMonth field type.
     */
    private static final DateTimeFieldType DAY_OF_MONTH_TYPE = new StandardDateTimeFieldType(
            "dayOfMonth", DAY_OF_MONTH, DurationFieldType.days(), DurationFieldType.months());
    /**
     * The weekyearOfCentury field type.
     */
    private static final DateTimeFieldType WEEKYEAR_OF_CENTURY_TYPE = new StandardDateTimeFieldType(
            "weekyearOfCentury", WEEKYEAR_OF_CENTURY, DurationFieldType.weekyears(), DurationFieldType.centuries());
    /**
     * The weekyear field type.
     */
    private static final DateTimeFieldType WEEKYEAR_TYPE = new StandardDateTimeFieldType(
            "weekyear", WEEKYEAR, DurationFieldType.weekyears(), null);
    /**
     * The weekOfWeekyear field type.
     */
    private static final DateTimeFieldType WEEK_OF_WEEKYEAR_TYPE = new StandardDateTimeFieldType(
            "weekOfWeekyear", WEEK_OF_WEEKYEAR, DurationFieldType.weeks(), DurationFieldType.weekyears());
    /**
     * The dayOfWeek field type.
     */
    private static final DateTimeFieldType DAY_OF_WEEK_TYPE = new StandardDateTimeFieldType(
            "dayOfWeek", DAY_OF_WEEK, DurationFieldType.days(), DurationFieldType.weeks());

    /**
     * The halfday field type.
     */
    private static final DateTimeFieldType HALFDAY_OF_DAY_TYPE = new StandardDateTimeFieldType(
            "halfdayOfDay", HALFDAY_OF_DAY, DurationFieldType.halfdays(), DurationFieldType.days());
    /**
     * The hourOfHalfday field type.
     */
    private static final DateTimeFieldType HOUR_OF_HALFDAY_TYPE = new StandardDateTimeFieldType(
            "hourOfHalfday", HOUR_OF_HALFDAY, DurationFieldType.hours(), DurationFieldType.halfdays());
    /**
     * The clockhourOfHalfday field type.
     */
    private static final DateTimeFieldType CLOCKHOUR_OF_HALFDAY_TYPE = new StandardDateTimeFieldType(
            "clockhourOfHalfday", CLOCKHOUR_OF_HALFDAY, DurationFieldType.hours(), DurationFieldType.halfdays());
    /**
     * The clockhourOfDay field type.
     */
    private static final DateTimeFieldType CLOCKHOUR_OF_DAY_TYPE = new StandardDateTimeFieldType(
            "clockhourOfDay", CLOCKHOUR_OF_DAY, DurationFieldType.hours(), DurationFieldType.days());
    /**
     * The hourOfDay field type.
     */
    private static final DateTimeFieldType HOUR_OF_DAY_TYPE = new StandardDateTimeFieldType(
            "hourOfDay", HOUR_OF_DAY, DurationFieldType.hours(), DurationFieldType.days());
    /**
     * The minuteOfDay field type.
     */
    private static final DateTimeFieldType MINUTE_OF_DAY_TYPE = new StandardDateTimeFieldType(
            "minuteOfDay", MINUTE_OF_DAY, DurationFieldType.minutes(), DurationFieldType.days());
    /**
     * The minuteOfHour field type.
     */
    private static final DateTimeFieldType MINUTE_OF_HOUR_TYPE = new StandardDateTimeFieldType(
            "minuteOfHour", MINUTE_OF_HOUR, DurationFieldType.minutes(), DurationFieldType.hours());
    /**
     * The secondOfDay field type.
     */
    private static final DateTimeFieldType SECOND_OF_DAY_TYPE = new StandardDateTimeFieldType(
            "secondOfDay", SECOND_OF_DAY, DurationFieldType.seconds(), DurationFieldType.days());
    /**
     * The secondOfMinute field type.
     */
    private static final DateTimeFieldType SECOND_OF_MINUTE_TYPE = new StandardDateTimeFieldType(
            "secondOfMinute", SECOND_OF_MINUTE, DurationFieldType.seconds(), DurationFieldType.minutes());
    /**
     * The millisOfDay field type.
     */
    private static final DateTimeFieldType MILLIS_OF_DAY_TYPE = new StandardDateTimeFieldType(
            "millisOfDay", MILLIS_OF_DAY, DurationFieldType.millis(), DurationFieldType.days());
    /**
     * The millisOfSecond field type.
     */
    private static final DateTimeFieldType MILLIS_OF_SECOND_TYPE = new StandardDateTimeFieldType(
            "millisOfSecond", MILLIS_OF_SECOND, DurationFieldType.millis(), DurationFieldType.seconds());

    /**
     * The name of the field.
     */
    private final String iName;

    //-----------------------------------------------------------------------

    /**
     * Constructor.
     *
     * @param name the name to use
     */
    protected DateTimeFieldType(String name) {
        super();__CLR4_4_1mgmglgchoq63.R.inc(809);try{__CLR4_4_1mgmglgchoq63.R.inc(808);
        __CLR4_4_1mgmglgchoq63.R.inc(810);iName = name;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the millis of second field type.
     *
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType millisOfSecond() {try{__CLR4_4_1mgmglgchoq63.R.inc(811);
        __CLR4_4_1mgmglgchoq63.R.inc(812);return MILLIS_OF_SECOND_TYPE;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    /**
     * Get the millis of day field type.
     * <p>
     * This measures the milliseconds from the start of the day on the <b>local</b> time-line.
     * On a daylight saving date, this means that some values will be missed (in spring)
     * or duplicated (in autumn/fall).
     *
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType millisOfDay() {try{__CLR4_4_1mgmglgchoq63.R.inc(813);
        __CLR4_4_1mgmglgchoq63.R.inc(814);return MILLIS_OF_DAY_TYPE;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    /**
     * Get the second of minute field type.
     *
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType secondOfMinute() {try{__CLR4_4_1mgmglgchoq63.R.inc(815);
        __CLR4_4_1mgmglgchoq63.R.inc(816);return SECOND_OF_MINUTE_TYPE;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    /**
     * Get the second of day field type.
     * <p>
     * This measures the seconds from the start of the day on the <b>local</b> time-line.
     * On a daylight saving date, this means that some values will be missed (in spring)
     * or duplicated (in autumn/fall).
     *
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType secondOfDay() {try{__CLR4_4_1mgmglgchoq63.R.inc(817);
        __CLR4_4_1mgmglgchoq63.R.inc(818);return SECOND_OF_DAY_TYPE;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    /**
     * Get the minute of hour field type.
     *
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType minuteOfHour() {try{__CLR4_4_1mgmglgchoq63.R.inc(819);
        __CLR4_4_1mgmglgchoq63.R.inc(820);return MINUTE_OF_HOUR_TYPE;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    /**
     * Get the minute of day field type.
     * <p>
     * This measures the minutes from the start of the day on the <b>local</b> time-line.
     * On a daylight saving date, this means that some values will be missed (in spring)
     * or duplicated (in autumn/fall).
     *
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType minuteOfDay() {try{__CLR4_4_1mgmglgchoq63.R.inc(821);
        __CLR4_4_1mgmglgchoq63.R.inc(822);return MINUTE_OF_DAY_TYPE;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    /**
     * Get the hour of day (0-23) field type.
     *
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType hourOfDay() {try{__CLR4_4_1mgmglgchoq63.R.inc(823);
        __CLR4_4_1mgmglgchoq63.R.inc(824);return HOUR_OF_DAY_TYPE;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    /**
     * Get the hour of day (offset to 1-24) field type.
     *
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType clockhourOfDay() {try{__CLR4_4_1mgmglgchoq63.R.inc(825);
        __CLR4_4_1mgmglgchoq63.R.inc(826);return CLOCKHOUR_OF_DAY_TYPE;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    /**
     * Get the hour of am/pm (0-11) field type.
     *
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType hourOfHalfday() {try{__CLR4_4_1mgmglgchoq63.R.inc(827);
        __CLR4_4_1mgmglgchoq63.R.inc(828);return HOUR_OF_HALFDAY_TYPE;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    /**
     * Get the hour of am/pm (offset to 1-12) field type.
     *
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType clockhourOfHalfday() {try{__CLR4_4_1mgmglgchoq63.R.inc(829);
        __CLR4_4_1mgmglgchoq63.R.inc(830);return CLOCKHOUR_OF_HALFDAY_TYPE;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    /**
     * Get the AM(0) PM(1) field type.
     *
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType halfdayOfDay() {try{__CLR4_4_1mgmglgchoq63.R.inc(831);
        __CLR4_4_1mgmglgchoq63.R.inc(832);return HALFDAY_OF_DAY_TYPE;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the day of week field type.
     *
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType dayOfWeek() {try{__CLR4_4_1mgmglgchoq63.R.inc(833);
        __CLR4_4_1mgmglgchoq63.R.inc(834);return DAY_OF_WEEK_TYPE;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    /**
     * Get the day of month field type.
     *
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType dayOfMonth() {try{__CLR4_4_1mgmglgchoq63.R.inc(835);
        __CLR4_4_1mgmglgchoq63.R.inc(836);return DAY_OF_MONTH_TYPE;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    /**
     * Get the day of year field type.
     *
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType dayOfYear() {try{__CLR4_4_1mgmglgchoq63.R.inc(837);
        __CLR4_4_1mgmglgchoq63.R.inc(838);return DAY_OF_YEAR_TYPE;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    /**
     * Get the week of a week based year field type.
     *
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType weekOfWeekyear() {try{__CLR4_4_1mgmglgchoq63.R.inc(839);
        __CLR4_4_1mgmglgchoq63.R.inc(840);return WEEK_OF_WEEKYEAR_TYPE;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    /**
     * Get the year of a week based year field type.
     *
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType weekyear() {try{__CLR4_4_1mgmglgchoq63.R.inc(841);
        __CLR4_4_1mgmglgchoq63.R.inc(842);return WEEKYEAR_TYPE;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    /**
     * Get the year of a week based year within a century field type.
     *
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType weekyearOfCentury() {try{__CLR4_4_1mgmglgchoq63.R.inc(843);
        __CLR4_4_1mgmglgchoq63.R.inc(844);return WEEKYEAR_OF_CENTURY_TYPE;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    /**
     * Get the month of year field type.
     *
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType monthOfYear() {try{__CLR4_4_1mgmglgchoq63.R.inc(845);
        __CLR4_4_1mgmglgchoq63.R.inc(846);return MONTH_OF_YEAR_TYPE;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    /**
     * Get the year field type.
     *
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType year() {try{__CLR4_4_1mgmglgchoq63.R.inc(847);
        __CLR4_4_1mgmglgchoq63.R.inc(848);return YEAR_TYPE;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    /**
     * Get the year of era field type.
     *
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType yearOfEra() {try{__CLR4_4_1mgmglgchoq63.R.inc(849);
        __CLR4_4_1mgmglgchoq63.R.inc(850);return YEAR_OF_ERA_TYPE;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    /**
     * Get the year of century field type.
     *
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType yearOfCentury() {try{__CLR4_4_1mgmglgchoq63.R.inc(851);
        __CLR4_4_1mgmglgchoq63.R.inc(852);return YEAR_OF_CENTURY_TYPE;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    /**
     * Get the century of era field type.
     *
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType centuryOfEra() {try{__CLR4_4_1mgmglgchoq63.R.inc(853);
        __CLR4_4_1mgmglgchoq63.R.inc(854);return CENTURY_OF_ERA_TYPE;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    /**
     * Get the era field type.
     *
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType era() {try{__CLR4_4_1mgmglgchoq63.R.inc(855);
        __CLR4_4_1mgmglgchoq63.R.inc(856);return ERA_TYPE;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the name of the field.
     * <p>
     * By convention, names follow a pattern of "dddOfRrr", where "ddd" represents
     * the (singular) duration unit field name and "Rrr" represents the (singular)
     * duration range field name. If the range field is not applicable, then
     * the name of the field is simply the (singular) duration field name.
     *
     * @return field name
     */
    public String getName() {try{__CLR4_4_1mgmglgchoq63.R.inc(857);
        __CLR4_4_1mgmglgchoq63.R.inc(858);return iName;
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    /**
     * Get the duration unit of the field.
     *
     * @return duration unit of the field, never null
     */
    public abstract DurationFieldType getDurationType();

    /**
     * Get the duration range of the field.
     *
     * @return duration range of the field, null if unbounded
     */
    public abstract DurationFieldType getRangeDurationType();

    /**
     * Gets a suitable field for this type from the given Chronology.
     *
     * @param chronology the chronology to use, null means ISOChronology in default zone
     * @return a suitable field
     */
    public abstract DateTimeField getField(Chronology chronology);

    /**
     * Checks whether this field supported in the given Chronology.
     *
     * @param chronology the chronology to use, null means ISOChronology in default zone
     * @return true if supported
     */
    public boolean isSupported(Chronology chronology) {try{__CLR4_4_1mgmglgchoq63.R.inc(859);
        __CLR4_4_1mgmglgchoq63.R.inc(860);return getField(chronology).isSupported();
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    /**
     * Get a suitable debug string.
     *
     * @return debug string
     */
    public String toString() {try{__CLR4_4_1mgmglgchoq63.R.inc(861);
        __CLR4_4_1mgmglgchoq63.R.inc(862);return getName();
    }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

    private static class StandardDateTimeFieldType extends DateTimeFieldType {
        /**
         * Serialization version
         */
        private static final long serialVersionUID = -9937958251642L;

        /**
         * The ordinal of the standard field type, for switch statements
         */
        private final byte iOrdinal;

        /**
         * The unit duration of the field.
         */
        private final transient DurationFieldType iUnitType;
        /**
         * The range duration of the field.
         */
        private final transient DurationFieldType iRangeType;

        /**
         * Constructor.
         *
         * @param name      the name to use
         * @param ordinal   the byte value for the ordinal index
         * @param unitType  the unit duration type
         * @param rangeType the range duration type
         */
        StandardDateTimeFieldType(String name, byte ordinal,
                                  DurationFieldType unitType, DurationFieldType rangeType) {
            super(name);__CLR4_4_1mgmglgchoq63.R.inc(864);try{__CLR4_4_1mgmglgchoq63.R.inc(863);
            __CLR4_4_1mgmglgchoq63.R.inc(865);iOrdinal = ordinal;
            __CLR4_4_1mgmglgchoq63.R.inc(866);iUnitType = unitType;
            __CLR4_4_1mgmglgchoq63.R.inc(867);iRangeType = rangeType;
        }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

        /**
         * @inheritdoc
         */
        public DurationFieldType getDurationType() {try{__CLR4_4_1mgmglgchoq63.R.inc(868);
            __CLR4_4_1mgmglgchoq63.R.inc(869);return iUnitType;
        }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

        /**
         * @inheritdoc
         */
        public DurationFieldType getRangeDurationType() {try{__CLR4_4_1mgmglgchoq63.R.inc(870);
            __CLR4_4_1mgmglgchoq63.R.inc(871);return iRangeType;
        }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

        /**
         * @inheritdoc
         */
        @Override
        public boolean equals(Object obj) {try{__CLR4_4_1mgmglgchoq63.R.inc(872);
            __CLR4_4_1mgmglgchoq63.R.inc(873);if ((((this == obj)&&(__CLR4_4_1mgmglgchoq63.R.iget(874)!=0|true))||(__CLR4_4_1mgmglgchoq63.R.iget(875)==0&false))) {{
                __CLR4_4_1mgmglgchoq63.R.inc(876);return true;
            }
            }__CLR4_4_1mgmglgchoq63.R.inc(877);if ((((obj instanceof StandardDateTimeFieldType)&&(__CLR4_4_1mgmglgchoq63.R.iget(878)!=0|true))||(__CLR4_4_1mgmglgchoq63.R.iget(879)==0&false))) {{
                __CLR4_4_1mgmglgchoq63.R.inc(880);return iOrdinal == ((StandardDateTimeFieldType) obj).iOrdinal;
            }
            }__CLR4_4_1mgmglgchoq63.R.inc(881);return false;
        }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

        /**
         * @inheritdoc
         */
        @Override
        public int hashCode() {try{__CLR4_4_1mgmglgchoq63.R.inc(882);
            __CLR4_4_1mgmglgchoq63.R.inc(883);return (1 << iOrdinal);
        }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

        /**
         * @inheritdoc
         */
        public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1mgmglgchoq63.R.inc(884);
            __CLR4_4_1mgmglgchoq63.R.inc(885);chronology = DateTimeUtils.getChronology(chronology);

            boolean __CLB4_4_1_bool0=false;__CLR4_4_1mgmglgchoq63.R.inc(886);switch (iOrdinal) {
                case ERA:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(887);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(888);return chronology.era();
                case YEAR_OF_ERA:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(889);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(890);return chronology.yearOfEra();
                case CENTURY_OF_ERA:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(891);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(892);return chronology.centuryOfEra();
                case YEAR_OF_CENTURY:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(893);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(894);return chronology.yearOfCentury();
                case YEAR:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(895);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(896);return chronology.year();
                case DAY_OF_YEAR:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(897);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(898);return chronology.dayOfYear();
                case MONTH_OF_YEAR:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(899);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(900);return chronology.monthOfYear();
                case DAY_OF_MONTH:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(901);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(902);return chronology.dayOfMonth();
                case WEEKYEAR_OF_CENTURY:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(903);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(904);return chronology.weekyearOfCentury();
                case WEEKYEAR:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(905);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(906);return chronology.weekyear();
                case WEEK_OF_WEEKYEAR:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(907);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(908);return chronology.weekOfWeekyear();
                case DAY_OF_WEEK:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(909);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(910);return chronology.dayOfWeek();
                case HALFDAY_OF_DAY:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(911);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(912);return chronology.halfdayOfDay();
                case HOUR_OF_HALFDAY:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(913);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(914);return chronology.hourOfHalfday();
                case CLOCKHOUR_OF_HALFDAY:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(915);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(916);return chronology.clockhourOfHalfday();
                case CLOCKHOUR_OF_DAY:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(917);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(918);return chronology.clockhourOfDay();
                case HOUR_OF_DAY:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(919);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(920);return chronology.hourOfDay();
                case MINUTE_OF_DAY:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(921);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(922);return chronology.minuteOfDay();
                case MINUTE_OF_HOUR:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(923);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(924);return chronology.minuteOfHour();
                case SECOND_OF_DAY:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(925);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(926);return chronology.secondOfDay();
                case SECOND_OF_MINUTE:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(927);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(928);return chronology.secondOfMinute();
                case MILLIS_OF_DAY:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(929);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(930);return chronology.millisOfDay();
                case MILLIS_OF_SECOND:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(931);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(932);return chronology.millisOfSecond();
                default:if (!__CLB4_4_1_bool0) {__CLR4_4_1mgmglgchoq63.R.inc(933);__CLB4_4_1_bool0=true;}
                    // Shouldn't happen.
                    __CLR4_4_1mgmglgchoq63.R.inc(934);throw new InternalError();
            }
        }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}

        /**
         * Ensure a singleton is returned.
         *
         * @return the singleton type
         */
        private Object readResolve() {try{__CLR4_4_1mgmglgchoq63.R.inc(935);
            boolean __CLB4_4_1_bool1=false;__CLR4_4_1mgmglgchoq63.R.inc(936);switch (iOrdinal) {
                case ERA:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(937);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(938);return ERA_TYPE;
                case YEAR_OF_ERA:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(939);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(940);return YEAR_OF_ERA_TYPE;
                case CENTURY_OF_ERA:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(941);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(942);return CENTURY_OF_ERA_TYPE;
                case YEAR_OF_CENTURY:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(943);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(944);return YEAR_OF_CENTURY_TYPE;
                case YEAR:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(945);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(946);return YEAR_TYPE;
                case DAY_OF_YEAR:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(947);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(948);return DAY_OF_YEAR_TYPE;
                case MONTH_OF_YEAR:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(949);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(950);return MONTH_OF_YEAR_TYPE;
                case DAY_OF_MONTH:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(951);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(952);return DAY_OF_MONTH_TYPE;
                case WEEKYEAR_OF_CENTURY:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(953);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(954);return WEEKYEAR_OF_CENTURY_TYPE;
                case WEEKYEAR:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(955);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(956);return WEEKYEAR_TYPE;
                case WEEK_OF_WEEKYEAR:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(957);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(958);return WEEK_OF_WEEKYEAR_TYPE;
                case DAY_OF_WEEK:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(959);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(960);return DAY_OF_WEEK_TYPE;
                case HALFDAY_OF_DAY:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(961);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(962);return HALFDAY_OF_DAY_TYPE;
                case HOUR_OF_HALFDAY:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(963);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(964);return HOUR_OF_HALFDAY_TYPE;
                case CLOCKHOUR_OF_HALFDAY:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(965);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(966);return CLOCKHOUR_OF_HALFDAY_TYPE;
                case CLOCKHOUR_OF_DAY:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(967);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(968);return CLOCKHOUR_OF_DAY_TYPE;
                case HOUR_OF_DAY:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(969);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(970);return HOUR_OF_DAY_TYPE;
                case MINUTE_OF_DAY:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(971);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(972);return MINUTE_OF_DAY_TYPE;
                case MINUTE_OF_HOUR:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(973);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(974);return MINUTE_OF_HOUR_TYPE;
                case SECOND_OF_DAY:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(975);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(976);return SECOND_OF_DAY_TYPE;
                case SECOND_OF_MINUTE:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(977);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(978);return SECOND_OF_MINUTE_TYPE;
                case MILLIS_OF_DAY:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(979);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(980);return MILLIS_OF_DAY_TYPE;
                case MILLIS_OF_SECOND:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(981);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mgmglgchoq63.R.inc(982);return MILLIS_OF_SECOND_TYPE;
                default:if (!__CLB4_4_1_bool1) {__CLR4_4_1mgmglgchoq63.R.inc(983);__CLB4_4_1_bool1=true;}
                    // Shouldn't happen.
                    __CLR4_4_1mgmglgchoq63.R.inc(984);return this;
            }
        }finally{__CLR4_4_1mgmglgchoq63.R.flushNeeded();}}
    }

}
