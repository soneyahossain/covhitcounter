/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2011 Stephen Colebourne
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

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseLocal;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PartialConverter;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * LocalTime is an immutable time class representing a time
 * without a time zone.
 * <p>
 * LocalTime implements the {@link ReadablePartial} interface.
 * To do this, the interface methods focus on the key fields -
 * HourOfDay, MinuteOfHour, SecondOfMinute and MillisOfSecond.
 * However, <b>all</b> time fields may in fact be queried.
 * <p>
 * Calculations on LocalTime are performed using a {@link Chronology}.
 * This chronology will be set internally to be in the UTC time zone
 * for all calculations.
 *
 * <p>Each individual field can be queried in two ways:
 * <ul>
 * <li><code>getHourOfDay()</code>
 * <li><code>hourOfDay().get()</code>
 * </ul>
 * The second technique also provides access to other useful methods on the
 * field:
 * <ul>
 * <li>numeric value
 * <li>text value
 * <li>short text value
 * <li>maximum/minimum values
 * <li>add/subtract
 * <li>set
 * <li>rounding
 * </ul>
 *
 * <p>
 * LocalTime is thread-safe and immutable, provided that the Chronology is as well.
 * All standard Chronology classes supplied are thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @since 1.3
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class LocalTime
        extends BaseLocal
        implements ReadablePartial, Serializable {public static class __CLR4_4_12up2uplgchoqct{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,4102,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization lock
     */
    private static final long serialVersionUID = -12873158713873L;

    /**
     * Constant for midnight.
     */
    public static final LocalTime MIDNIGHT = new LocalTime(0, 0, 0, 0);

    /**
     * The index of the hourOfDay field in the field array
     */
    private static final int HOUR_OF_DAY = 0;
    /**
     * The index of the minuteOfHour field in the field array
     */
    private static final int MINUTE_OF_HOUR = 1;
    /**
     * The index of the secondOfMinute field in the field array
     */
    private static final int SECOND_OF_MINUTE = 2;
    /**
     * The index of the millisOfSecond field in the field array
     */
    private static final int MILLIS_OF_SECOND = 3;
    /**
     * Set of known duration types.
     */
    private static final Set<DurationFieldType> TIME_DURATION_TYPES = new HashSet<DurationFieldType>();

    static {try{__CLR4_4_12up2uplgchoqct.R.inc(3697);
        __CLR4_4_12up2uplgchoqct.R.inc(3698);TIME_DURATION_TYPES.add(DurationFieldType.millis());
        __CLR4_4_12up2uplgchoqct.R.inc(3699);TIME_DURATION_TYPES.add(DurationFieldType.seconds());
        __CLR4_4_12up2uplgchoqct.R.inc(3700);TIME_DURATION_TYPES.add(DurationFieldType.minutes());
        __CLR4_4_12up2uplgchoqct.R.inc(3701);TIME_DURATION_TYPES.add(DurationFieldType.hours());
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * The local millis from 1970-01-01T00:00:00
     */
    private final long iLocalMillis;
    /**
     * The chronology to use, in UTC
     */
    private final Chronology iChronology;

    //-----------------------------------------------------------------------

    /**
     * Obtains a {@code LocalTime} set to the current system millisecond time
     * using <code>ISOChronology</code> in the default time zone.
     * The resulting object does not use the zone.
     *
     * @return the current time, not null
     * @since 2.0
     */
    public static LocalTime now() {try{__CLR4_4_12up2uplgchoqct.R.inc(3702);
        __CLR4_4_12up2uplgchoqct.R.inc(3703);return new LocalTime();
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Obtains a {@code LocalTime} set to the current system millisecond time
     * using <code>ISOChronology</code> in the specified time zone.
     * The resulting object does not use the zone.
     *
     * @param zone the time zone, not null
     * @return the current time, not null
     * @since 2.0
     */
    public static LocalTime now(DateTimeZone zone) {try{__CLR4_4_12up2uplgchoqct.R.inc(3704);
        __CLR4_4_12up2uplgchoqct.R.inc(3705);if ((((zone == null)&&(__CLR4_4_12up2uplgchoqct.R.iget(3706)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3707)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3708);throw new NullPointerException("Zone must not be null");
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3709);return new LocalTime(zone);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Obtains a {@code LocalTime} set to the current system millisecond time
     * using the specified chronology.
     * The resulting object does not use the zone.
     *
     * @param chronology the chronology, not null
     * @return the current time, not null
     * @since 2.0
     */
    public static LocalTime now(Chronology chronology) {try{__CLR4_4_12up2uplgchoqct.R.inc(3710);
        __CLR4_4_12up2uplgchoqct.R.inc(3711);if ((((chronology == null)&&(__CLR4_4_12up2uplgchoqct.R.iget(3712)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3713)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3714);throw new NullPointerException("Chronology must not be null");
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3715);return new LocalTime(chronology);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Parses a {@code LocalTime} from the specified string.
     * <p>
     * This uses {@link ISODateTimeFormat#localTimeParser()}.
     *
     * @param str the string to parse, not null
     * @since 2.0
     */
    @FromString
    public static LocalTime parse(String str) {try{__CLR4_4_12up2uplgchoqct.R.inc(3716);
        __CLR4_4_12up2uplgchoqct.R.inc(3717);return parse(str, ISODateTimeFormat.localTimeParser());
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Parses a {@code LocalTime} from the specified string using a formatter.
     *
     * @param str       the string to parse, not null
     * @param formatter the formatter to use, not null
     * @since 2.0
     */
    public static LocalTime parse(String str, DateTimeFormatter formatter) {try{__CLR4_4_12up2uplgchoqct.R.inc(3718);
        __CLR4_4_12up2uplgchoqct.R.inc(3719);return formatter.parseLocalTime(str);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs a LocalTime from the specified millis of day using the
     * ISO chronology.
     * <p>
     * The millisOfDay value may exceed the number of millis in one day,
     * but additional days will be ignored.
     * This method uses the UTC time zone internally.
     *
     * @param millisOfDay the number of milliseconds into a day to convert
     */
    public static LocalTime fromMillisOfDay(long millisOfDay) {try{__CLR4_4_12up2uplgchoqct.R.inc(3720);
        __CLR4_4_12up2uplgchoqct.R.inc(3721);return fromMillisOfDay(millisOfDay, null);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Constructs a LocalTime from the specified millis of day using the
     * specified chronology.
     * <p>
     * The millisOfDay value may exceed the number of millis in one day,
     * but additional days will be ignored.
     * This method uses the UTC time zone internally.
     *
     * @param millisOfDay the number of milliseconds into a day to convert
     * @param chrono      the chronology, null means ISO chronology
     */
    public static LocalTime fromMillisOfDay(long millisOfDay, Chronology chrono) {try{__CLR4_4_12up2uplgchoqct.R.inc(3722);
        __CLR4_4_12up2uplgchoqct.R.inc(3723);chrono = DateTimeUtils.getChronology(chrono).withUTC();
        __CLR4_4_12up2uplgchoqct.R.inc(3724);return new LocalTime(millisOfDay, chrono);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs a LocalTime from a <code>java.util.Calendar</code>
     * using exactly the same field values.
     * <p>
     * Each field is queried from the Calendar and assigned to the LocalTime.
     * This is useful if you have been using the Calendar as a local time,
     * ignoring the zone.
     * <p>
     * One advantage of this method is that this method is unaffected if the
     * version of the time zone data differs between the JDK and Joda-Time.
     * That is because the local field values are transferred, calculated using
     * the JDK time zone data and without using the Joda-Time time zone data.
     * <p>
     * This factory method ignores the type of the calendar and always
     * creates a LocalTime with ISO chronology. It is expected that you
     * will only pass in instances of <code>GregorianCalendar</code> however
     * this is not validated.
     *
     * @param calendar the Calendar to extract fields from
     * @return the created LocalTime
     * @throws IllegalArgumentException if the calendar is null
     * @throws IllegalArgumentException if the date is invalid for the ISO chronology
     */
    public static LocalTime fromCalendarFields(Calendar calendar) {try{__CLR4_4_12up2uplgchoqct.R.inc(3725);
        __CLR4_4_12up2uplgchoqct.R.inc(3726);if ((((calendar == null)&&(__CLR4_4_12up2uplgchoqct.R.iget(3727)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3728)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3729);throw new IllegalArgumentException("The calendar must not be null");
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3730);return new LocalTime(
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE),
                calendar.get(Calendar.SECOND),
                calendar.get(Calendar.MILLISECOND)
        );
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Constructs a LocalTime from a <code>java.util.Date</code>
     * using exactly the same field values.
     * <p>
     * Each field is queried from the Date and assigned to the LocalTime.
     * This is useful if you have been using the Date as a local time,
     * ignoring the zone.
     * <p>
     * One advantage of this method is that this method is unaffected if the
     * version of the time zone data differs between the JDK and Joda-Time.
     * That is because the local field values are transferred, calculated using
     * the JDK time zone data and without using the Joda-Time time zone data.
     * <p>
     * This factory method always creates a LocalTime with ISO chronology.
     *
     * @param date the Date to extract fields from
     * @return the created LocalTime
     * @throws IllegalArgumentException if the calendar is null
     * @throws IllegalArgumentException if the date is invalid for the ISO chronology
     */
    @SuppressWarnings("deprecation")
    public static LocalTime fromDateFields(Date date) {try{__CLR4_4_12up2uplgchoqct.R.inc(3731);
        __CLR4_4_12up2uplgchoqct.R.inc(3732);if ((((date == null)&&(__CLR4_4_12up2uplgchoqct.R.iget(3733)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3734)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3735);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3736);return new LocalTime(
                date.getHours(),
                date.getMinutes(),
                date.getSeconds(),
                (((int) (date.getTime() % 1000)) + 1000) % 1000
        );
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs an instance set to the current local time evaluated using
     * ISO chronology in the default zone.
     * <p>
     * Once the constructor is completed, the zone is no longer used.
     *
     * @see #now()
     */
    public LocalTime() {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance());__CLR4_4_12up2uplgchoqct.R.inc(3738);try{__CLR4_4_12up2uplgchoqct.R.inc(3737);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Constructs an instance set to the current local time evaluated using
     * ISO chronology in the specified zone.
     * <p>
     * If the specified time zone is null, the default zone is used.
     * Once the constructor is completed, the zone is no longer used.
     *
     * @param zone the time zone, null means default zone
     * @see #now(DateTimeZone)
     */
    public LocalTime(DateTimeZone zone) {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance(zone));__CLR4_4_12up2uplgchoqct.R.inc(3740);try{__CLR4_4_12up2uplgchoqct.R.inc(3739);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Constructs an instance set to the current local time evaluated using
     * specified chronology and zone.
     * <p>
     * If the chronology is null, ISO chronology in the default time zone is used.
     * Once the constructor is completed, the zone is no longer used.
     *
     * @param chronology the chronology, null means ISOChronology in default zone
     * @see #now(Chronology)
     */
    public LocalTime(Chronology chronology) {
        this(DateTimeUtils.currentTimeMillis(), chronology);__CLR4_4_12up2uplgchoqct.R.inc(3742);try{__CLR4_4_12up2uplgchoqct.R.inc(3741);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs an instance set to the local time defined by the specified
     * instant evaluated using ISO chronology in the default zone.
     * <p>
     * Once the constructor is completed, the zone is no longer used.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z
     */
    public LocalTime(long instant) {
        this(instant, ISOChronology.getInstance());__CLR4_4_12up2uplgchoqct.R.inc(3744);try{__CLR4_4_12up2uplgchoqct.R.inc(3743);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Constructs an instance set to the local time defined by the specified
     * instant evaluated using ISO chronology in the specified zone.
     * <p>
     * If the specified time zone is null, the default zone is used.
     * Once the constructor is completed, the zone is no longer used.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z
     * @param zone    the time zone, null means default zone
     */
    public LocalTime(long instant, DateTimeZone zone) {
        this(instant, ISOChronology.getInstance(zone));__CLR4_4_12up2uplgchoqct.R.inc(3746);try{__CLR4_4_12up2uplgchoqct.R.inc(3745);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Constructs an instance set to the local time defined by the specified
     * instant evaluated using the specified chronology.
     * <p>
     * If the chronology is null, ISO chronology in the default zone is used.
     * Once the constructor is completed, the zone is no longer used.
     *
     * @param instant    the milliseconds from 1970-01-01T00:00:00Z
     * @param chronology the chronology, null means ISOChronology in default zone
     */
    public LocalTime(long instant, Chronology chronology) {try{__CLR4_4_12up2uplgchoqct.R.inc(3747);
        __CLR4_4_12up2uplgchoqct.R.inc(3748);chronology = DateTimeUtils.getChronology(chronology);

        __CLR4_4_12up2uplgchoqct.R.inc(3749);long localMillis = chronology.getZone().getMillisKeepLocal(DateTimeZone.UTC, instant);
        __CLR4_4_12up2uplgchoqct.R.inc(3750);chronology = chronology.withUTC();
        __CLR4_4_12up2uplgchoqct.R.inc(3751);iLocalMillis = chronology.millisOfDay().get(localMillis);
        __CLR4_4_12up2uplgchoqct.R.inc(3752);iChronology = chronology;
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs an instance from an Object that represents a datetime.
     * <p>
     * If the object contains no chronology, <code>ISOChronology</code> is used.
     * If the object contains no time zone, the default zone is used.
     * Once the constructor is completed, the zone is no longer used.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadablePartial, ReadableInstant, String, Calendar and Date.
     * The String formats are described by {@link ISODateTimeFormat#localTimeParser()}.
     * The default String converter ignores the zone and only parses the field values.
     *
     * @param instant the datetime object
     * @throws IllegalArgumentException if the instant is invalid
     */
    public LocalTime(Object instant) {
        this(instant, (Chronology) null);__CLR4_4_12up2uplgchoqct.R.inc(3754);try{__CLR4_4_12up2uplgchoqct.R.inc(3753);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Constructs an instance from an Object that represents a datetime,
     * forcing the time zone to that specified.
     * <p>
     * If the object contains no chronology, <code>ISOChronology</code> is used.
     * If the specified time zone is null, the default zone is used.
     * Once the constructor is completed, the zone is no longer used.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadablePartial, ReadableInstant, String, Calendar and Date.
     * The String formats are described by {@link ISODateTimeFormat#localTimeParser()}.
     * The default String converter ignores the zone and only parses the field values.
     *
     * @param instant the datetime object
     * @param zone    the time zone
     * @throws IllegalArgumentException if the instant is invalid
     */
    public LocalTime(Object instant, DateTimeZone zone) {try{__CLR4_4_12up2uplgchoqct.R.inc(3755);
        __CLR4_4_12up2uplgchoqct.R.inc(3756);PartialConverter converter = ConverterManager.getInstance().getPartialConverter(instant);
        __CLR4_4_12up2uplgchoqct.R.inc(3757);Chronology chronology = converter.getChronology(instant, zone);
        __CLR4_4_12up2uplgchoqct.R.inc(3758);chronology = DateTimeUtils.getChronology(chronology);
        __CLR4_4_12up2uplgchoqct.R.inc(3759);iChronology = chronology.withUTC();
        __CLR4_4_12up2uplgchoqct.R.inc(3760);int[] values = converter.getPartialValues(this, instant, chronology, ISODateTimeFormat.localTimeParser());
        __CLR4_4_12up2uplgchoqct.R.inc(3761);iLocalMillis = iChronology.getDateTimeMillis(0L, values[0], values[1], values[2], values[3]);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Constructs an instance from an Object that represents a datetime,
     * using the specified chronology.
     * <p>
     * If the chronology is null, ISO in the default time zone is used.
     * Once the constructor is completed, the zone is no longer used.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadablePartial, ReadableInstant, String, Calendar and Date.
     * The String formats are described by {@link ISODateTimeFormat#localTimeParser()}.
     * The default String converter ignores the zone and only parses the field values.
     *
     * @param instant    the datetime object
     * @param chronology the chronology
     * @throws IllegalArgumentException if the instant is invalid
     */
    public LocalTime(Object instant, Chronology chronology) {try{__CLR4_4_12up2uplgchoqct.R.inc(3762);
        __CLR4_4_12up2uplgchoqct.R.inc(3763);PartialConverter converter = ConverterManager.getInstance().getPartialConverter(instant);
        __CLR4_4_12up2uplgchoqct.R.inc(3764);chronology = converter.getChronology(instant, chronology);
        __CLR4_4_12up2uplgchoqct.R.inc(3765);chronology = DateTimeUtils.getChronology(chronology);
        __CLR4_4_12up2uplgchoqct.R.inc(3766);iChronology = chronology.withUTC();
        __CLR4_4_12up2uplgchoqct.R.inc(3767);int[] values = converter.getPartialValues(this, instant, chronology, ISODateTimeFormat.localTimeParser());
        __CLR4_4_12up2uplgchoqct.R.inc(3768);iLocalMillis = iChronology.getDateTimeMillis(0L, values[0], values[1], values[2], values[3]);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs an instance set to the specified time
     * using <code>ISOChronology</code>.
     *
     * @param hourOfDay    the hour of the day, from 0 to 23
     * @param minuteOfHour the minute of the hour, from 0 to 59
     */
    public LocalTime(
            int hourOfDay,
            int minuteOfHour) {
        this(hourOfDay, minuteOfHour, 0, 0, ISOChronology.getInstanceUTC());__CLR4_4_12up2uplgchoqct.R.inc(3770);try{__CLR4_4_12up2uplgchoqct.R.inc(3769);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Constructs an instance set to the specified time
     * using <code>ISOChronology</code>.
     *
     * @param hourOfDay      the hour of the day, from 0 to 23
     * @param minuteOfHour   the minute of the hour, from 0 to 59
     * @param secondOfMinute the second of the minute, from 0 to 59
     */
    public LocalTime(
            int hourOfDay,
            int minuteOfHour,
            int secondOfMinute) {
        this(hourOfDay, minuteOfHour, secondOfMinute, 0, ISOChronology.getInstanceUTC());__CLR4_4_12up2uplgchoqct.R.inc(3772);try{__CLR4_4_12up2uplgchoqct.R.inc(3771);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Constructs an instance set to the specified time
     * using <code>ISOChronology</code>.
     *
     * @param hourOfDay      the hour of the day, from 0 to 23
     * @param minuteOfHour   the minute of the hour, from 0 to 59
     * @param secondOfMinute the second of the minute, from 0 to 59
     * @param millisOfSecond the millisecond of the second, from 0 to 999
     */
    public LocalTime(
            int hourOfDay,
            int minuteOfHour,
            int secondOfMinute,
            int millisOfSecond) {
        this(hourOfDay, minuteOfHour, secondOfMinute,
                millisOfSecond, ISOChronology.getInstanceUTC());__CLR4_4_12up2uplgchoqct.R.inc(3774);try{__CLR4_4_12up2uplgchoqct.R.inc(3773);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Constructs an instance set to the specified time
     * using the specified chronology, whose zone is ignored.
     * <p>
     * If the chronology is null, <code>ISOChronology</code> is used.
     *
     * @param hourOfDay      the hour of the day, valid values defined by the chronology
     * @param minuteOfHour   the minute of the hour, valid values defined by the chronology
     * @param secondOfMinute the second of the minute, valid values defined by the chronology
     * @param millisOfSecond the millisecond of the second, valid values defined by the chronology
     * @param chronology     the chronology, null means ISOChronology in default zone
     */
    public LocalTime(
            int hourOfDay,
            int minuteOfHour,
            int secondOfMinute,
            int millisOfSecond,
            Chronology chronology) {
        super();__CLR4_4_12up2uplgchoqct.R.inc(3776);try{__CLR4_4_12up2uplgchoqct.R.inc(3775);
        __CLR4_4_12up2uplgchoqct.R.inc(3777);chronology = DateTimeUtils.getChronology(chronology).withUTC();
        __CLR4_4_12up2uplgchoqct.R.inc(3778);long instant = chronology.getDateTimeMillis(
                0L, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
        __CLR4_4_12up2uplgchoqct.R.inc(3779);iChronology = chronology;
        __CLR4_4_12up2uplgchoqct.R.inc(3780);iLocalMillis = instant;
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Handle broken serialization from other tools.
     *
     * @return the resolved object, not null
     */
    private Object readResolve() {try{__CLR4_4_12up2uplgchoqct.R.inc(3781);
        __CLR4_4_12up2uplgchoqct.R.inc(3782);if ((((iChronology == null)&&(__CLR4_4_12up2uplgchoqct.R.iget(3783)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3784)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3785);return new LocalTime(iLocalMillis, ISOChronology.getInstanceUTC());
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3786);if ((((DateTimeZone.UTC.equals(iChronology.getZone()) == false)&&(__CLR4_4_12up2uplgchoqct.R.iget(3787)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3788)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3789);return new LocalTime(iLocalMillis, iChronology.withUTC());
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3790);return this;
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the number of fields in this partial, which is four.
     * The supported fields are HourOfDay, MinuteOfHour, SecondOfMinute
     * and MillisOfSecond.
     *
     * @return the field count, four
     */
    public int size() {try{__CLR4_4_12up2uplgchoqct.R.inc(3791);
        __CLR4_4_12up2uplgchoqct.R.inc(3792);return 4;
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Gets the field for a specific index in the chronology specified.
     * <p>
     * This method must not use any instance variables.
     *
     * @param index  the index to retrieve
     * @param chrono the chronology to use
     * @return the field
     */
    protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_12up2uplgchoqct.R.inc(3793);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_12up2uplgchoqct.R.inc(3794);switch (index) {
            case HOUR_OF_DAY:if (!__CLB4_4_1_bool0) {__CLR4_4_12up2uplgchoqct.R.inc(3795);__CLB4_4_1_bool0=true;}
                __CLR4_4_12up2uplgchoqct.R.inc(3796);return chrono.hourOfDay();
            case MINUTE_OF_HOUR:if (!__CLB4_4_1_bool0) {__CLR4_4_12up2uplgchoqct.R.inc(3797);__CLB4_4_1_bool0=true;}
                __CLR4_4_12up2uplgchoqct.R.inc(3798);return chrono.minuteOfHour();
            case SECOND_OF_MINUTE:if (!__CLB4_4_1_bool0) {__CLR4_4_12up2uplgchoqct.R.inc(3799);__CLB4_4_1_bool0=true;}
                __CLR4_4_12up2uplgchoqct.R.inc(3800);return chrono.secondOfMinute();
            case MILLIS_OF_SECOND:if (!__CLB4_4_1_bool0) {__CLR4_4_12up2uplgchoqct.R.inc(3801);__CLB4_4_1_bool0=true;}
                __CLR4_4_12up2uplgchoqct.R.inc(3802);return chrono.millisOfSecond();
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_12up2uplgchoqct.R.inc(3803);__CLB4_4_1_bool0=true;}
                __CLR4_4_12up2uplgchoqct.R.inc(3804);throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Gets the value of the field at the specified index.
     * <p>
     * This method is required to support the <code>ReadablePartial</code>
     * interface. The supported fields are HourOfDay, MinuteOfHour,
     * SecondOfMinute and MillisOfSecond.
     *
     * @param index the index, zero to three
     * @return the value
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public int getValue(int index) {try{__CLR4_4_12up2uplgchoqct.R.inc(3805);
        boolean __CLB4_4_1_bool1=false;__CLR4_4_12up2uplgchoqct.R.inc(3806);switch (index) {
            case HOUR_OF_DAY:if (!__CLB4_4_1_bool1) {__CLR4_4_12up2uplgchoqct.R.inc(3807);__CLB4_4_1_bool1=true;}
                __CLR4_4_12up2uplgchoqct.R.inc(3808);return getChronology().hourOfDay().get(getLocalMillis());
            case MINUTE_OF_HOUR:if (!__CLB4_4_1_bool1) {__CLR4_4_12up2uplgchoqct.R.inc(3809);__CLB4_4_1_bool1=true;}
                __CLR4_4_12up2uplgchoqct.R.inc(3810);return getChronology().minuteOfHour().get(getLocalMillis());
            case SECOND_OF_MINUTE:if (!__CLB4_4_1_bool1) {__CLR4_4_12up2uplgchoqct.R.inc(3811);__CLB4_4_1_bool1=true;}
                __CLR4_4_12up2uplgchoqct.R.inc(3812);return getChronology().secondOfMinute().get(getLocalMillis());
            case MILLIS_OF_SECOND:if (!__CLB4_4_1_bool1) {__CLR4_4_12up2uplgchoqct.R.inc(3813);__CLB4_4_1_bool1=true;}
                __CLR4_4_12up2uplgchoqct.R.inc(3814);return getChronology().millisOfSecond().get(getLocalMillis());
            default:if (!__CLB4_4_1_bool1) {__CLR4_4_12up2uplgchoqct.R.inc(3815);__CLB4_4_1_bool1=true;}
                __CLR4_4_12up2uplgchoqct.R.inc(3816);throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the value of one of the fields of time.
     * <p>
     * This method gets the value of the specified field.
     * For example:
     * <pre>
     * DateTime dt = new DateTime();
     * int hourOfDay = dt.get(DateTimeFieldType.hourOfDay());
     * </pre>
     *
     * @param fieldType a field type, usually obtained from DateTimeFieldType, not null
     * @return the value of that field
     * @throws IllegalArgumentException if the field type is null
     */
    public int get(DateTimeFieldType fieldType) {try{__CLR4_4_12up2uplgchoqct.R.inc(3817);
        __CLR4_4_12up2uplgchoqct.R.inc(3818);if ((((fieldType == null)&&(__CLR4_4_12up2uplgchoqct.R.iget(3819)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3820)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3821);throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3822);if ((((isSupported(fieldType) == false)&&(__CLR4_4_12up2uplgchoqct.R.iget(3823)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3824)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3825);throw new IllegalArgumentException("Field '" + fieldType + "' is not supported");
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3826);return fieldType.getField(getChronology()).get(getLocalMillis());
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Checks if the field type specified is supported by this
     * local time and chronology.
     * This can be used to avoid exceptions in {@link #get(DateTimeFieldType)}.
     *
     * @param type a field type, usually obtained from DateTimeFieldType
     * @return true if the field type is supported
     */
    public boolean isSupported(DateTimeFieldType type) {try{__CLR4_4_12up2uplgchoqct.R.inc(3827);
        __CLR4_4_12up2uplgchoqct.R.inc(3828);if ((((type == null)&&(__CLR4_4_12up2uplgchoqct.R.iget(3829)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3830)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3831);return false;
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3832);if ((((isSupported(type.getDurationType()) == false)&&(__CLR4_4_12up2uplgchoqct.R.iget(3833)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3834)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3835);return false;
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3836);DurationFieldType range = type.getRangeDurationType();
        __CLR4_4_12up2uplgchoqct.R.inc(3837);return (isSupported(range) || range == DurationFieldType.days());
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Checks if the duration type specified is supported by this
     * local time and chronology.
     *
     * @param type a duration type, usually obtained from DurationFieldType
     * @return true if the field type is supported
     */
    public boolean isSupported(DurationFieldType type) {try{__CLR4_4_12up2uplgchoqct.R.inc(3838);
        __CLR4_4_12up2uplgchoqct.R.inc(3839);if ((((type == null)&&(__CLR4_4_12up2uplgchoqct.R.iget(3840)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3841)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3842);return false;
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3843);DurationField field = type.getField(getChronology());
        __CLR4_4_12up2uplgchoqct.R.inc(3844);if ((((TIME_DURATION_TYPES.contains(type) ||
                field.getUnitMillis() < getChronology().days().getUnitMillis())&&(__CLR4_4_12up2uplgchoqct.R.iget(3845)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3846)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3847);return field.isSupported();
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3848);return false;
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the local milliseconds from the Java epoch
     * of 1970-01-01T00:00:00 (not fixed to any specific time zone).
     *
     * @return the number of milliseconds since 1970-01-01T00:00:00
     * @since 1.5 (previously private)
     */
    protected long getLocalMillis() {try{__CLR4_4_12up2uplgchoqct.R.inc(3849);
        __CLR4_4_12up2uplgchoqct.R.inc(3850);return iLocalMillis;
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Gets the chronology of the time.
     *
     * @return the Chronology that the time is using
     */
    public Chronology getChronology() {try{__CLR4_4_12up2uplgchoqct.R.inc(3851);
        __CLR4_4_12up2uplgchoqct.R.inc(3852);return iChronology;
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Compares this ReadablePartial with another returning true if the chronology,
     * field types and values are equal.
     *
     * @param partial an object to check against
     * @return true if fields and values are equal
     */
    public boolean equals(Object partial) {try{__CLR4_4_12up2uplgchoqct.R.inc(3853);
        // override to perform faster
        __CLR4_4_12up2uplgchoqct.R.inc(3854);if ((((this == partial)&&(__CLR4_4_12up2uplgchoqct.R.iget(3855)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3856)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3857);return true;
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3858);if ((((partial instanceof LocalTime)&&(__CLR4_4_12up2uplgchoqct.R.iget(3859)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3860)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3861);LocalTime other = (LocalTime) partial;
            __CLR4_4_12up2uplgchoqct.R.inc(3862);if ((((iChronology.equals(other.iChronology))&&(__CLR4_4_12up2uplgchoqct.R.iget(3863)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3864)==0&false))) {{
                __CLR4_4_12up2uplgchoqct.R.inc(3865);return iLocalMillis == other.iLocalMillis;
            }
        }}
        }__CLR4_4_12up2uplgchoqct.R.inc(3866);return super.equals(partial);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Compares this partial with another returning an integer
     * indicating the order.
     * <p>
     * The fields are compared in order, from largest to smallest.
     * The first field that is non-equal is used to determine the result.
     * <p>
     * The specified object must be a partial instance whose field types
     * match those of this partial.
     *
     * @param partial an object to check against
     * @return negative if this is less, zero if equal, positive if greater
     * @throws ClassCastException   if the partial is the wrong class
     *                              or if it has field types that don't match
     * @throws NullPointerException if the partial is null
     */
    public int compareTo(ReadablePartial partial) {try{__CLR4_4_12up2uplgchoqct.R.inc(3867);
        // override to perform faster
        __CLR4_4_12up2uplgchoqct.R.inc(3868);if ((((this == partial)&&(__CLR4_4_12up2uplgchoqct.R.iget(3869)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3870)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3871);return 0;
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3872);if ((((partial instanceof LocalTime)&&(__CLR4_4_12up2uplgchoqct.R.iget(3873)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3874)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3875);LocalTime other = (LocalTime) partial;
            __CLR4_4_12up2uplgchoqct.R.inc(3876);if ((((iChronology.equals(other.iChronology))&&(__CLR4_4_12up2uplgchoqct.R.iget(3877)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3878)==0&false))) {{
                __CLR4_4_12up2uplgchoqct.R.inc(3879);return ((((iLocalMillis < other.iLocalMillis )&&(__CLR4_4_12up2uplgchoqct.R.iget(3880)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3881)==0&false))? -1 :
                        ((((iLocalMillis == other.iLocalMillis )&&(__CLR4_4_12up2uplgchoqct.R.iget(3882)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3883)==0&false))? 0 : 1));

            }
        }}
        }__CLR4_4_12up2uplgchoqct.R.inc(3884);return super.compareTo(partial);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this time with different local millis.
     * <p>
     * The returned object will be a new instance of the same type.
     * Only the millis will change, the chronology is kept.
     * The returned object will be either be a new instance or <code>this</code>.
     *
     * @param newMillis the new millis, from 1970-01-01T00:00:00
     * @return a copy of this time with different millis
     */
    LocalTime withLocalMillis(long newMillis) {try{__CLR4_4_12up2uplgchoqct.R.inc(3885);
        __CLR4_4_12up2uplgchoqct.R.inc(3886);return ((((newMillis == getLocalMillis() )&&(__CLR4_4_12up2uplgchoqct.R.iget(3887)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3888)==0&false))? this : new LocalTime(newMillis, getChronology()));
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this time with the partial set of fields replacing
     * those from this instance.
     * <p>
     * For example, if the partial contains an hour and minute then those two
     * fields will be changed in the returned instance.
     * Unsupported fields are ignored.
     * If the partial is null, then <code>this</code> is returned.
     *
     * @param partial the partial set of fields to apply to this time, null ignored
     * @return a copy of this time with a different set of fields
     * @throws IllegalArgumentException if any value is invalid
     */
    public LocalTime withFields(ReadablePartial partial) {try{__CLR4_4_12up2uplgchoqct.R.inc(3889);
        __CLR4_4_12up2uplgchoqct.R.inc(3890);if ((((partial == null)&&(__CLR4_4_12up2uplgchoqct.R.iget(3891)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3892)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3893);return this;
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3894);return withLocalMillis(getChronology().set(partial, getLocalMillis()));
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Returns a copy of this time with the specified field set
     * to a new value.
     * <p>
     * For example, if the field type is <code>hourOfDay</code> then the hour of day
     * field would be changed in the returned instance.
     * If the field type is null, then <code>this</code> is returned.
     * <p>
     * These lines are equivalent:
     * <pre>
     * LocalTime updated = dt.withHourOfDay(6);
     * LocalTime updated = dt.withField(DateTimeFieldType.hourOfDay(), 6);
     * </pre>
     *
     * @param fieldType the field type to set, not null
     * @param value     the value to set
     * @return a copy of this time with the field set
     * @throws IllegalArgumentException if the value is null or invalid
     */
    public LocalTime withField(DateTimeFieldType fieldType, int value) {try{__CLR4_4_12up2uplgchoqct.R.inc(3895);
        __CLR4_4_12up2uplgchoqct.R.inc(3896);if ((((fieldType == null)&&(__CLR4_4_12up2uplgchoqct.R.iget(3897)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3898)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3899);throw new IllegalArgumentException("Field must not be null");
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3900);if ((((isSupported(fieldType) == false)&&(__CLR4_4_12up2uplgchoqct.R.iget(3901)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3902)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3903);throw new IllegalArgumentException("Field '" + fieldType + "' is not supported");
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3904);long instant = fieldType.getField(getChronology()).set(getLocalMillis(), value);
        __CLR4_4_12up2uplgchoqct.R.inc(3905);return withLocalMillis(instant);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Returns a copy of this time with the value of the specified
     * field increased.
     * <p>
     * If the addition is zero or the field is null, then <code>this</code>
     * is returned.
     * <p>
     * If the addition causes the maximum value of the field to be exceeded,
     * then the value will wrap. Thus 23:59 plus two minutes yields 00:01.
     * <p>
     * These lines are equivalent:
     * <pre>
     * LocalTime added = dt.plusHours(6);
     * LocalTime added = dt.withFieldAdded(DurationFieldType.hours(), 6);
     * </pre>
     *
     * @param fieldType the field type to add to, not null
     * @param amount    the amount to add
     * @return a copy of this time with the field updated
     * @throws IllegalArgumentException if the value is null or invalid
     * @throws ArithmeticException      if the result exceeds the internal capacity
     */
    public LocalTime withFieldAdded(DurationFieldType fieldType, int amount) {try{__CLR4_4_12up2uplgchoqct.R.inc(3906);
        __CLR4_4_12up2uplgchoqct.R.inc(3907);if ((((fieldType == null)&&(__CLR4_4_12up2uplgchoqct.R.iget(3908)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3909)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3910);throw new IllegalArgumentException("Field must not be null");
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3911);if ((((isSupported(fieldType) == false)&&(__CLR4_4_12up2uplgchoqct.R.iget(3912)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3913)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3914);throw new IllegalArgumentException("Field '" + fieldType + "' is not supported");
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3915);if ((((amount == 0)&&(__CLR4_4_12up2uplgchoqct.R.iget(3916)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3917)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3918);return this;
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3919);long instant = fieldType.getField(getChronology()).add(getLocalMillis(), amount);
        __CLR4_4_12up2uplgchoqct.R.inc(3920);return withLocalMillis(instant);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this time with the specified period added.
     * <p>
     * If the addition is zero, then <code>this</code> is returned.
     * <p>
     * This method is typically used to add multiple copies of complex
     * period instances. Adding one field is best achieved using methods
     * like {@link #withFieldAdded(DurationFieldType, int)}
     * or {@link #plusHours(int)}.
     *
     * @param period the period to add to this one, null means zero
     * @param scalar the amount of times to add, such as -1 to subtract once
     * @return a copy of this time with the period added
     * @throws ArithmeticException if the result exceeds the internal capacity
     */
    public LocalTime withPeriodAdded(ReadablePeriod period, int scalar) {try{__CLR4_4_12up2uplgchoqct.R.inc(3921);
        __CLR4_4_12up2uplgchoqct.R.inc(3922);if ((((period == null || scalar == 0)&&(__CLR4_4_12up2uplgchoqct.R.iget(3923)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3924)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3925);return this;
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3926);long instant = getChronology().add(period, getLocalMillis(), scalar);
        __CLR4_4_12up2uplgchoqct.R.inc(3927);return withLocalMillis(instant);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this time with the specified period added.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * <p>
     * This method is typically used to add complex period instances.
     * Adding one field is best achieved using methods
     * like {@link #plusHours(int)}.
     *
     * @param period the period to add to this one, null means zero
     * @return a copy of this time with the period added
     * @throws ArithmeticException if the result exceeds the internal capacity
     */
    public LocalTime plus(ReadablePeriod period) {try{__CLR4_4_12up2uplgchoqct.R.inc(3928);
        __CLR4_4_12up2uplgchoqct.R.inc(3929);return withPeriodAdded(period, 1);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this time plus the specified number of hours.
     * <p>
     * This LocalTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalTime added = dt.plusHours(6);
     * LocalTime added = dt.plus(Period.hours(6));
     * LocalTime added = dt.withFieldAdded(DurationFieldType.hours(), 6);
     * </pre>
     *
     * @param hours the amount of hours to add, may be negative
     * @return the new LocalTime plus the increased hours
     */
    public LocalTime plusHours(int hours) {try{__CLR4_4_12up2uplgchoqct.R.inc(3930);
        __CLR4_4_12up2uplgchoqct.R.inc(3931);if ((((hours == 0)&&(__CLR4_4_12up2uplgchoqct.R.iget(3932)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3933)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3934);return this;
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3935);long instant = getChronology().hours().add(getLocalMillis(), hours);
        __CLR4_4_12up2uplgchoqct.R.inc(3936);return withLocalMillis(instant);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Returns a copy of this time plus the specified number of minutes.
     * <p>
     * This LocalTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalTime added = dt.plusMinutes(6);
     * LocalTime added = dt.plus(Period.minutes(6));
     * LocalTime added = dt.withFieldAdded(DurationFieldType.minutes(), 6);
     * </pre>
     *
     * @param minutes the amount of minutes to add, may be negative
     * @return the new LocalTime plus the increased minutes
     */
    public LocalTime plusMinutes(int minutes) {try{__CLR4_4_12up2uplgchoqct.R.inc(3937);
        __CLR4_4_12up2uplgchoqct.R.inc(3938);if ((((minutes == 0)&&(__CLR4_4_12up2uplgchoqct.R.iget(3939)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3940)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3941);return this;
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3942);long instant = getChronology().minutes().add(getLocalMillis(), minutes);
        __CLR4_4_12up2uplgchoqct.R.inc(3943);return withLocalMillis(instant);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Returns a copy of this time plus the specified number of seconds.
     * <p>
     * This LocalTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalTime added = dt.plusSeconds(6);
     * LocalTime added = dt.plus(Period.seconds(6));
     * LocalTime added = dt.withFieldAdded(DurationFieldType.seconds(), 6);
     * </pre>
     *
     * @param seconds the amount of seconds to add, may be negative
     * @return the new LocalTime plus the increased seconds
     */
    public LocalTime plusSeconds(int seconds) {try{__CLR4_4_12up2uplgchoqct.R.inc(3944);
        __CLR4_4_12up2uplgchoqct.R.inc(3945);if ((((seconds == 0)&&(__CLR4_4_12up2uplgchoqct.R.iget(3946)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3947)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3948);return this;
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3949);long instant = getChronology().seconds().add(getLocalMillis(), seconds);
        __CLR4_4_12up2uplgchoqct.R.inc(3950);return withLocalMillis(instant);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Returns a copy of this time plus the specified number of millis.
     * <p>
     * This LocalTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalTime added = dt.plusMillis(6);
     * LocalTime added = dt.plus(Period.millis(6));
     * LocalTime added = dt.withFieldAdded(DurationFieldType.millis(), 6);
     * </pre>
     *
     * @param millis the amount of millis to add, may be negative
     * @return the new LocalTime plus the increased millis
     */
    public LocalTime plusMillis(int millis) {try{__CLR4_4_12up2uplgchoqct.R.inc(3951);
        __CLR4_4_12up2uplgchoqct.R.inc(3952);if ((((millis == 0)&&(__CLR4_4_12up2uplgchoqct.R.iget(3953)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3954)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3955);return this;
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3956);long instant = getChronology().millis().add(getLocalMillis(), millis);
        __CLR4_4_12up2uplgchoqct.R.inc(3957);return withLocalMillis(instant);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this time with the specified period taken away.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * <p>
     * This method is typically used to subtract complex period instances.
     * Subtracting one field is best achieved using methods
     * like {@link #minusHours(int)}.
     *
     * @param period the period to reduce this instant by
     * @return a copy of this time with the period taken away
     * @throws ArithmeticException if the result exceeds the internal capacity
     */
    public LocalTime minus(ReadablePeriod period) {try{__CLR4_4_12up2uplgchoqct.R.inc(3958);
        __CLR4_4_12up2uplgchoqct.R.inc(3959);return withPeriodAdded(period, -1);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this time minus the specified number of hours.
     * <p>
     * This LocalTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalTime subtracted = dt.minusHours(6);
     * LocalTime subtracted = dt.minus(Period.hours(6));
     * LocalTime subtracted = dt.withFieldAdded(DurationFieldType.hours(), -6);
     * </pre>
     *
     * @param hours the amount of hours to subtract, may be negative
     * @return the new LocalTime minus the increased hours
     */
    public LocalTime minusHours(int hours) {try{__CLR4_4_12up2uplgchoqct.R.inc(3960);
        __CLR4_4_12up2uplgchoqct.R.inc(3961);if ((((hours == 0)&&(__CLR4_4_12up2uplgchoqct.R.iget(3962)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3963)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3964);return this;
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3965);long instant = getChronology().hours().subtract(getLocalMillis(), hours);
        __CLR4_4_12up2uplgchoqct.R.inc(3966);return withLocalMillis(instant);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Returns a copy of this time minus the specified number of minutes.
     * <p>
     * This LocalTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalTime subtracted = dt.minusMinutes(6);
     * LocalTime subtracted = dt.minus(Period.minutes(6));
     * LocalTime subtracted = dt.withFieldAdded(DurationFieldType.minutes(), -6);
     * </pre>
     *
     * @param minutes the amount of minutes to subtract, may be negative
     * @return the new LocalTime minus the increased minutes
     */
    public LocalTime minusMinutes(int minutes) {try{__CLR4_4_12up2uplgchoqct.R.inc(3967);
        __CLR4_4_12up2uplgchoqct.R.inc(3968);if ((((minutes == 0)&&(__CLR4_4_12up2uplgchoqct.R.iget(3969)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3970)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3971);return this;
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3972);long instant = getChronology().minutes().subtract(getLocalMillis(), minutes);
        __CLR4_4_12up2uplgchoqct.R.inc(3973);return withLocalMillis(instant);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Returns a copy of this time minus the specified number of seconds.
     * <p>
     * This LocalTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalTime subtracted = dt.minusSeconds(6);
     * LocalTime subtracted = dt.minus(Period.seconds(6));
     * LocalTime subtracted = dt.withFieldAdded(DurationFieldType.seconds(), -6);
     * </pre>
     *
     * @param seconds the amount of seconds to subtract, may be negative
     * @return the new LocalTime minus the increased seconds
     */
    public LocalTime minusSeconds(int seconds) {try{__CLR4_4_12up2uplgchoqct.R.inc(3974);
        __CLR4_4_12up2uplgchoqct.R.inc(3975);if ((((seconds == 0)&&(__CLR4_4_12up2uplgchoqct.R.iget(3976)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3977)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3978);return this;
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3979);long instant = getChronology().seconds().subtract(getLocalMillis(), seconds);
        __CLR4_4_12up2uplgchoqct.R.inc(3980);return withLocalMillis(instant);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Returns a copy of this time minus the specified number of millis.
     * <p>
     * This LocalTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalTime subtracted = dt.minusMillis(6);
     * LocalTime subtracted = dt.minus(Period.millis(6));
     * LocalTime subtracted = dt.withFieldAdded(DurationFieldType.millis(), -6);
     * </pre>
     *
     * @param millis the amount of millis to subtract, may be negative
     * @return the new LocalTime minus the increased millis
     */
    public LocalTime minusMillis(int millis) {try{__CLR4_4_12up2uplgchoqct.R.inc(3981);
        __CLR4_4_12up2uplgchoqct.R.inc(3982);if ((((millis == 0)&&(__CLR4_4_12up2uplgchoqct.R.iget(3983)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3984)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3985);return this;
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3986);long instant = getChronology().millis().subtract(getLocalMillis(), millis);
        __CLR4_4_12up2uplgchoqct.R.inc(3987);return withLocalMillis(instant);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the property object for the specified type, which contains
     * many useful methods.
     *
     * @param fieldType the field type to get the chronology for
     * @return the property object
     * @throws IllegalArgumentException if the field is null or unsupported
     */
    public Property property(DateTimeFieldType fieldType) {try{__CLR4_4_12up2uplgchoqct.R.inc(3988);
        __CLR4_4_12up2uplgchoqct.R.inc(3989);if ((((fieldType == null)&&(__CLR4_4_12up2uplgchoqct.R.iget(3990)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3991)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3992);throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3993);if ((((isSupported(fieldType) == false)&&(__CLR4_4_12up2uplgchoqct.R.iget(3994)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(3995)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(3996);throw new IllegalArgumentException("Field '" + fieldType + "' is not supported");
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(3997);return new Property(this, fieldType.getField(getChronology()));
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the hour of day field value.
     *
     * @return the hour of day
     */
    public int getHourOfDay() {try{__CLR4_4_12up2uplgchoqct.R.inc(3998);
        __CLR4_4_12up2uplgchoqct.R.inc(3999);return getChronology().hourOfDay().get(getLocalMillis());
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Get the minute of hour field value.
     *
     * @return the minute of hour
     */
    public int getMinuteOfHour() {try{__CLR4_4_12up2uplgchoqct.R.inc(4000);
        __CLR4_4_12up2uplgchoqct.R.inc(4001);return getChronology().minuteOfHour().get(getLocalMillis());
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Get the second of minute field value.
     *
     * @return the second of minute
     */
    public int getSecondOfMinute() {try{__CLR4_4_12up2uplgchoqct.R.inc(4002);
        __CLR4_4_12up2uplgchoqct.R.inc(4003);return getChronology().secondOfMinute().get(getLocalMillis());
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Get the millis of second field value.
     *
     * @return the millis of second
     */
    public int getMillisOfSecond() {try{__CLR4_4_12up2uplgchoqct.R.inc(4004);
        __CLR4_4_12up2uplgchoqct.R.inc(4005);return getChronology().millisOfSecond().get(getLocalMillis());
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Get the millis of day field value.
     *
     * @return the millis of day
     */
    public int getMillisOfDay() {try{__CLR4_4_12up2uplgchoqct.R.inc(4006);
        __CLR4_4_12up2uplgchoqct.R.inc(4007);return getChronology().millisOfDay().get(getLocalMillis());
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this time with the hour of day field updated.
     * <p>
     * LocalTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * hour of day changed.
     *
     * @param hour the hour of day to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalTime withHourOfDay(int hour) {try{__CLR4_4_12up2uplgchoqct.R.inc(4008);
        __CLR4_4_12up2uplgchoqct.R.inc(4009);return withLocalMillis(getChronology().hourOfDay().set(getLocalMillis(), hour));
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Returns a copy of this time with the minute of hour field updated.
     * <p>
     * LocalTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * minute of hour changed.
     *
     * @param minute the minute of hour to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalTime withMinuteOfHour(int minute) {try{__CLR4_4_12up2uplgchoqct.R.inc(4010);
        __CLR4_4_12up2uplgchoqct.R.inc(4011);return withLocalMillis(getChronology().minuteOfHour().set(getLocalMillis(), minute));
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Returns a copy of this time with the second of minute field updated.
     * <p>
     * LocalTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * second of minute changed.
     *
     * @param second the second of minute to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalTime withSecondOfMinute(int second) {try{__CLR4_4_12up2uplgchoqct.R.inc(4012);
        __CLR4_4_12up2uplgchoqct.R.inc(4013);return withLocalMillis(getChronology().secondOfMinute().set(getLocalMillis(), second));
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Returns a copy of this time with the millis of second field updated.
     * <p>
     * LocalTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * millis of second changed.
     *
     * @param millis the millis of second to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalTime withMillisOfSecond(int millis) {try{__CLR4_4_12up2uplgchoqct.R.inc(4014);
        __CLR4_4_12up2uplgchoqct.R.inc(4015);return withLocalMillis(getChronology().millisOfSecond().set(getLocalMillis(), millis));
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Returns a copy of this time with the millis of day field updated.
     * <p>
     * LocalTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * millis of day changed.
     *
     * @param millis the millis of day to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalTime withMillisOfDay(int millis) {try{__CLR4_4_12up2uplgchoqct.R.inc(4016);
        __CLR4_4_12up2uplgchoqct.R.inc(4017);return withLocalMillis(getChronology().millisOfDay().set(getLocalMillis(), millis));
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the hour of day field property which provides access to advanced functionality.
     *
     * @return the hour of day property
     */
    public Property hourOfDay() {try{__CLR4_4_12up2uplgchoqct.R.inc(4018);
        __CLR4_4_12up2uplgchoqct.R.inc(4019);return new Property(this, getChronology().hourOfDay());
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Get the minute of hour field property which provides access to advanced functionality.
     *
     * @return the minute of hour property
     */
    public Property minuteOfHour() {try{__CLR4_4_12up2uplgchoqct.R.inc(4020);
        __CLR4_4_12up2uplgchoqct.R.inc(4021);return new Property(this, getChronology().minuteOfHour());
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Get the second of minute field property which provides access to advanced functionality.
     *
     * @return the second of minute property
     */
    public Property secondOfMinute() {try{__CLR4_4_12up2uplgchoqct.R.inc(4022);
        __CLR4_4_12up2uplgchoqct.R.inc(4023);return new Property(this, getChronology().secondOfMinute());
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Get the millis of second property which provides access to advanced functionality.
     *
     * @return the millis of second property
     */
    public Property millisOfSecond() {try{__CLR4_4_12up2uplgchoqct.R.inc(4024);
        __CLR4_4_12up2uplgchoqct.R.inc(4025);return new Property(this, getChronology().millisOfSecond());
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Get the millis of day property which provides access to advanced functionality.
     *
     * @return the millis of day property
     */
    public Property millisOfDay() {try{__CLR4_4_12up2uplgchoqct.R.inc(4026);
        __CLR4_4_12up2uplgchoqct.R.inc(4027);return new Property(this, getChronology().millisOfDay());
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this LocalTime to a full datetime using the default time zone
     * setting the time fields from this instance and the date fields from
     * the current date.
     *
     * @return this time as a datetime using today's date
     */
    public DateTime toDateTimeToday() {try{__CLR4_4_12up2uplgchoqct.R.inc(4028);
        __CLR4_4_12up2uplgchoqct.R.inc(4029);return toDateTimeToday(null);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Converts this LocalTime to a full datetime using the specified time zone
     * setting the time fields from this instance and the date fields from
     * the current time.
     * <p>
     * This method uses the chronology from this instance plus the time zone
     * specified.
     *
     * @param zone the zone to use, null means default
     * @return this time as a datetime using today's date
     */
    public DateTime toDateTimeToday(DateTimeZone zone) {try{__CLR4_4_12up2uplgchoqct.R.inc(4030);
        __CLR4_4_12up2uplgchoqct.R.inc(4031);Chronology chrono = getChronology().withZone(zone);
        __CLR4_4_12up2uplgchoqct.R.inc(4032);long instantMillis = DateTimeUtils.currentTimeMillis();
        __CLR4_4_12up2uplgchoqct.R.inc(4033);long resolved = chrono.set(this, instantMillis);
        __CLR4_4_12up2uplgchoqct.R.inc(4034);return new DateTime(resolved, chrono);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Output the time in ISO8601 format (HH:mm:ss.SSS).
     *
     * @return ISO8601 time formatted string.
     */
    @ToString
    public String toString() {try{__CLR4_4_12up2uplgchoqct.R.inc(4035);
        __CLR4_4_12up2uplgchoqct.R.inc(4036);return ISODateTimeFormat.time().print(this);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Output the time using the specified format pattern.
     *
     * @param pattern the pattern specification, null means use <code>toString</code>
     * @see org.joda.time.format.DateTimeFormat
     */
    public String toString(String pattern) {try{__CLR4_4_12up2uplgchoqct.R.inc(4037);
        __CLR4_4_12up2uplgchoqct.R.inc(4038);if ((((pattern == null)&&(__CLR4_4_12up2uplgchoqct.R.iget(4039)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(4040)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(4041);return toString();
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(4042);return DateTimeFormat.forPattern(pattern).print(this);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    /**
     * Output the time using the specified format pattern.
     *
     * @param pattern the pattern specification, null means use <code>toString</code>
     * @param locale  Locale to use, null means default
     * @see org.joda.time.format.DateTimeFormat
     */
    public String toString(String pattern, Locale locale) throws IllegalArgumentException {try{__CLR4_4_12up2uplgchoqct.R.inc(4043);
        __CLR4_4_12up2uplgchoqct.R.inc(4044);if ((((pattern == null)&&(__CLR4_4_12up2uplgchoqct.R.iget(4045)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(4046)==0&false))) {{
            __CLR4_4_12up2uplgchoqct.R.inc(4047);return toString();
        }
        }__CLR4_4_12up2uplgchoqct.R.inc(4048);return DateTimeFormat.forPattern(pattern).withLocale(locale).print(this);
    }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * LocalTime.Property binds a LocalTime to a DateTimeField allowing
     * powerful datetime functionality to be easily accessed.
     * <p>
     * The simplest use of this class is as an alternative get method, here used to
     * get the minute '30'.
     * <pre>
     * LocalTime dt = new LocalTime(12, 30);
     * int year = dt.minuteOfHour().get();
     * </pre>
     * <p>
     * Methods are also provided that allow time modification. These return
     * new instances of LocalTime - they do not modify the original. The example
     * below yields two independent immutable date objects 2 hours apart.
     * <pre>
     * LocalTime dt1230 = new LocalTime(12, 30);
     * LocalTime dt1430 = dt1230.hourOfDay().setCopy(14);
     * </pre>
     * <p>
     * LocalTime.Property itself is thread-safe and immutable, as well as the
     * LocalTime being operated on.
     *
     * @author Stephen Colebourne
     * @author Brian S O'Neill
     * @since 1.3
     */
    public static final class Property extends AbstractReadableInstantFieldProperty {

        /**
         * Serialization version
         */
        private static final long serialVersionUID = -325842547277223L;

        /**
         * The instant this property is working against
         */
        private transient LocalTime iInstant;
        /**
         * The field this property is working against
         */
        private transient DateTimeField iField;

        /**
         * Constructor.
         *
         * @param instant the instant to set
         * @param field   the field to use
         */
        Property(LocalTime instant, DateTimeField field) {
            super();__CLR4_4_12up2uplgchoqct.R.inc(4050);try{__CLR4_4_12up2uplgchoqct.R.inc(4049);
            __CLR4_4_12up2uplgchoqct.R.inc(4051);iInstant = instant;
            __CLR4_4_12up2uplgchoqct.R.inc(4052);iField = field;
        }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

        /**
         * Writes the property in a safe serialization format.
         */
        private void writeObject(ObjectOutputStream oos) throws IOException {try{__CLR4_4_12up2uplgchoqct.R.inc(4053);
            __CLR4_4_12up2uplgchoqct.R.inc(4054);oos.writeObject(iInstant);
            __CLR4_4_12up2uplgchoqct.R.inc(4055);oos.writeObject(iField.getType());
        }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

        /**
         * Reads the property from a safe serialization format.
         */
        private void readObject(ObjectInputStream oos) throws IOException, ClassNotFoundException {try{__CLR4_4_12up2uplgchoqct.R.inc(4056);
            __CLR4_4_12up2uplgchoqct.R.inc(4057);iInstant = (LocalTime) oos.readObject();
            __CLR4_4_12up2uplgchoqct.R.inc(4058);DateTimeFieldType type = (DateTimeFieldType) oos.readObject();
            __CLR4_4_12up2uplgchoqct.R.inc(4059);iField = type.getField(iInstant.getChronology());
        }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Gets the field being used.
         *
         * @return the field
         */
        public DateTimeField getField() {try{__CLR4_4_12up2uplgchoqct.R.inc(4060);
            __CLR4_4_12up2uplgchoqct.R.inc(4061);return iField;
        }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

        /**
         * Gets the milliseconds of the time that this property is linked to.
         *
         * @return the milliseconds
         */
        protected long getMillis() {try{__CLR4_4_12up2uplgchoqct.R.inc(4062);
            __CLR4_4_12up2uplgchoqct.R.inc(4063);return iInstant.getLocalMillis();
        }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

        /**
         * Gets the chronology of the datetime that this property is linked to.
         *
         * @return the chronology
         * @since 1.4
         */
        protected Chronology getChronology() {try{__CLR4_4_12up2uplgchoqct.R.inc(4064);
            __CLR4_4_12up2uplgchoqct.R.inc(4065);return iInstant.getChronology();
        }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

        /**
         * Gets the LocalTime object linked to this property.
         *
         * @return the linked LocalTime
         */
        public LocalTime getLocalTime() {try{__CLR4_4_12up2uplgchoqct.R.inc(4066);
            __CLR4_4_12up2uplgchoqct.R.inc(4067);return iInstant;
        }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Adds to this field in a copy of this LocalTime.
         * <p>
         * The LocalTime attached to this property is unchanged by this call.
         *
         * @param value the value to add to the field in the copy
         * @return a copy of the LocalTime with the field value changed
         */
        public LocalTime addCopy(int value) {try{__CLR4_4_12up2uplgchoqct.R.inc(4068);
            __CLR4_4_12up2uplgchoqct.R.inc(4069);return iInstant.withLocalMillis(iField.add(iInstant.getLocalMillis(), value));
        }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

        /**
         * Adds to this field in a copy of this LocalTime.
         * If the addition exceeds the maximum value (eg. 23:59) it will
         * wrap to the minimum value (eg. 00:00).
         * <p>
         * The LocalTime attached to this property is unchanged by this call.
         *
         * @param value the value to add to the field in the copy
         * @return a copy of the LocalTime with the field value changed
         */
        public LocalTime addCopy(long value) {try{__CLR4_4_12up2uplgchoqct.R.inc(4070);
            __CLR4_4_12up2uplgchoqct.R.inc(4071);return iInstant.withLocalMillis(iField.add(iInstant.getLocalMillis(), value));
        }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

        /**
         * Adds to this field in a copy of this LocalTime.
         * If the addition exceeds the maximum value (eg. 23:59) then
         * an exception will be thrown.
         * Contrast this behaviour to {@link #addCopy(int)}.
         * <p>
         * The LocalTime attached to this property is unchanged by this call.
         *
         * @param value the value to add to the field in the copy
         * @return a copy of the LocalTime with the field value changed
         * @throws IllegalArgumentException if the result is invalid
         */
        public LocalTime addNoWrapToCopy(int value) {try{__CLR4_4_12up2uplgchoqct.R.inc(4072);
            __CLR4_4_12up2uplgchoqct.R.inc(4073);long millis = iField.add(iInstant.getLocalMillis(), value);
            __CLR4_4_12up2uplgchoqct.R.inc(4074);long rounded = iInstant.getChronology().millisOfDay().get(millis);
            __CLR4_4_12up2uplgchoqct.R.inc(4075);if ((((rounded != millis)&&(__CLR4_4_12up2uplgchoqct.R.iget(4076)!=0|true))||(__CLR4_4_12up2uplgchoqct.R.iget(4077)==0&false))) {{
                __CLR4_4_12up2uplgchoqct.R.inc(4078);throw new IllegalArgumentException("The addition exceeded the boundaries of LocalTime");
            }
            }__CLR4_4_12up2uplgchoqct.R.inc(4079);return iInstant.withLocalMillis(millis);
        }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

        /**
         * Adds to this field, possibly wrapped, in a copy of this LocalTime.
         * A field wrapped operation only changes this field.
         * Thus 10:59 plusWrapField one minute goes to 10:00.
         * <p>
         * The LocalTime attached to this property is unchanged by this call.
         *
         * @param value the value to add to the field in the copy
         * @return a copy of the LocalTime with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public LocalTime addWrapFieldToCopy(int value) {try{__CLR4_4_12up2uplgchoqct.R.inc(4080);
            __CLR4_4_12up2uplgchoqct.R.inc(4081);return iInstant.withLocalMillis(iField.addWrapField(iInstant.getLocalMillis(), value));
        }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Sets this field in a copy of the LocalTime.
         * <p>
         * The LocalTime attached to this property is unchanged by this call.
         *
         * @param value the value to set the field in the copy to
         * @return a copy of the LocalTime with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public LocalTime setCopy(int value) {try{__CLR4_4_12up2uplgchoqct.R.inc(4082);
            __CLR4_4_12up2uplgchoqct.R.inc(4083);return iInstant.withLocalMillis(iField.set(iInstant.getLocalMillis(), value));
        }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

        /**
         * Sets this field in a copy of the LocalTime to a parsed text value.
         * <p>
         * The LocalTime attached to this property is unchanged by this call.
         *
         * @param text   the text value to set
         * @param locale optional locale to use for selecting a text symbol
         * @return a copy of the LocalTime with the field value changed
         * @throws IllegalArgumentException if the text value isn't valid
         */
        public LocalTime setCopy(String text, Locale locale) {try{__CLR4_4_12up2uplgchoqct.R.inc(4084);
            __CLR4_4_12up2uplgchoqct.R.inc(4085);return iInstant.withLocalMillis(iField.set(iInstant.getLocalMillis(), text, locale));
        }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

        /**
         * Sets this field in a copy of the LocalTime to a parsed text value.
         * <p>
         * The LocalTime attached to this property is unchanged by this call.
         *
         * @param text the text value to set
         * @return a copy of the LocalTime with the field value changed
         * @throws IllegalArgumentException if the text value isn't valid
         */
        public LocalTime setCopy(String text) {try{__CLR4_4_12up2uplgchoqct.R.inc(4086);
            __CLR4_4_12up2uplgchoqct.R.inc(4087);return setCopy(text, null);
        }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Returns a new LocalTime with this field set to the maximum value
         * for this field.
         * <p>
         * The LocalTime attached to this property is unchanged by this call.
         *
         * @return a copy of the LocalTime with this field set to its maximum
         */
        public LocalTime withMaximumValue() {try{__CLR4_4_12up2uplgchoqct.R.inc(4088);
            __CLR4_4_12up2uplgchoqct.R.inc(4089);return setCopy(getMaximumValue());
        }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

        /**
         * Returns a new LocalTime with this field set to the minimum value
         * for this field.
         * <p>
         * The LocalTime attached to this property is unchanged by this call.
         *
         * @return a copy of the LocalTime with this field set to its minimum
         */
        public LocalTime withMinimumValue() {try{__CLR4_4_12up2uplgchoqct.R.inc(4090);
            __CLR4_4_12up2uplgchoqct.R.inc(4091);return setCopy(getMinimumValue());
        }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Rounds to the lowest whole unit of this field on a copy of this
         * LocalTime.
         * <p>
         * For example, rounding floor on the hourOfDay field of a LocalTime
         * where the time is 10:30 would result in new LocalTime with the
         * time of 10:00.
         *
         * @return a copy of the LocalTime with the field value changed
         */
        public LocalTime roundFloorCopy() {try{__CLR4_4_12up2uplgchoqct.R.inc(4092);
            __CLR4_4_12up2uplgchoqct.R.inc(4093);return iInstant.withLocalMillis(iField.roundFloor(iInstant.getLocalMillis()));
        }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

        /**
         * Rounds to the highest whole unit of this field on a copy of this
         * LocalTime.
         * <p>
         * For example, rounding floor on the hourOfDay field of a LocalTime
         * where the time is 10:30 would result in new LocalTime with the
         * time of 11:00.
         *
         * @return a copy of the LocalTime with the field value changed
         */
        public LocalTime roundCeilingCopy() {try{__CLR4_4_12up2uplgchoqct.R.inc(4094);
            __CLR4_4_12up2uplgchoqct.R.inc(4095);return iInstant.withLocalMillis(iField.roundCeiling(iInstant.getLocalMillis()));
        }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

        /**
         * Rounds to the nearest whole unit of this field on a copy of this
         * LocalTime, favoring the floor if halfway.
         *
         * @return a copy of the LocalTime with the field value changed
         */
        public LocalTime roundHalfFloorCopy() {try{__CLR4_4_12up2uplgchoqct.R.inc(4096);
            __CLR4_4_12up2uplgchoqct.R.inc(4097);return iInstant.withLocalMillis(iField.roundHalfFloor(iInstant.getLocalMillis()));
        }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

        /**
         * Rounds to the nearest whole unit of this field on a copy of this
         * LocalTime, favoring the ceiling if halfway.
         *
         * @return a copy of the LocalTime with the field value changed
         */
        public LocalTime roundHalfCeilingCopy() {try{__CLR4_4_12up2uplgchoqct.R.inc(4098);
            __CLR4_4_12up2uplgchoqct.R.inc(4099);return iInstant.withLocalMillis(iField.roundHalfCeiling(iInstant.getLocalMillis()));
        }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}

        /**
         * Rounds to the nearest whole unit of this field on a copy of this
         * LocalTime.  If halfway, the ceiling is favored over the floor
         * only if it makes this field's value even.
         *
         * @return a copy of the LocalTime with the field value changed
         */
        public LocalTime roundHalfEvenCopy() {try{__CLR4_4_12up2uplgchoqct.R.inc(4100);
            __CLR4_4_12up2uplgchoqct.R.inc(4101);return iInstant.withLocalMillis(iField.roundHalfEven(iInstant.getLocalMillis()));
        }finally{__CLR4_4_12up2uplgchoqct.R.flushNeeded();}}
    }

}
