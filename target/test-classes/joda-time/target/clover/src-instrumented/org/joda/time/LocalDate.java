/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseLocal;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PartialConverter;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * LocalDate is an immutable datetime class representing a date
 * without a time zone.
 * <p>
 * LocalDate implements the {@link ReadablePartial} interface.
 * To do this, the interface methods focus on the key fields -
 * Year, MonthOfYear and DayOfMonth.
 * However, <b>all</b> date fields may in fact be queried.
 * <p>
 * LocalDate differs from DateMidnight in that this class does not
 * have a time zone and does not represent a single instant in time.
 * <p>
 * Calculations on LocalDate are performed using a {@link Chronology}.
 * This chronology will be set internally to be in the UTC time zone
 * for all calculations.
 *
 * <p>Each individual field can be queried in two ways:
 * <ul>
 * <li><code>getMonthOfYear()</code>
 * <li><code>monthOfYear().get()</code>
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
 * LocalDate is thread-safe and immutable, provided that the Chronology is as well.
 * All standard Chronology classes supplied are thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @since 1.3
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class LocalDate
        extends BaseLocal
        implements ReadablePartial, Serializable {public static class __CLR4_4_120b20blgchoqae{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,3131,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization lock
     */
    private static final long serialVersionUID = -8775358157899L;

    /**
     * The index of the year field in the field array
     */
    private static final int YEAR = 0;
    /**
     * The index of the monthOfYear field in the field array
     */
    private static final int MONTH_OF_YEAR = 1;
    /**
     * The index of the dayOfMonth field in the field array
     */
    private static final int DAY_OF_MONTH = 2;
    /**
     * Set of known duration types.
     */
    private static final Set<DurationFieldType> DATE_DURATION_TYPES = new HashSet<DurationFieldType>();

    static {try{__CLR4_4_120b20blgchoqae.R.inc(2603);
        __CLR4_4_120b20blgchoqae.R.inc(2604);DATE_DURATION_TYPES.add(DurationFieldType.days());
        __CLR4_4_120b20blgchoqae.R.inc(2605);DATE_DURATION_TYPES.add(DurationFieldType.weeks());
        __CLR4_4_120b20blgchoqae.R.inc(2606);DATE_DURATION_TYPES.add(DurationFieldType.months());
        __CLR4_4_120b20blgchoqae.R.inc(2607);DATE_DURATION_TYPES.add(DurationFieldType.weekyears());
        __CLR4_4_120b20blgchoqae.R.inc(2608);DATE_DURATION_TYPES.add(DurationFieldType.years());
        __CLR4_4_120b20blgchoqae.R.inc(2609);DATE_DURATION_TYPES.add(DurationFieldType.centuries());
        // eras are supported, although the DurationField generally isn't
        __CLR4_4_120b20blgchoqae.R.inc(2610);DATE_DURATION_TYPES.add(DurationFieldType.eras());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * The local millis from 1970-01-01T00:00:00
     */
    private final long iLocalMillis;
    /**
     * The chronology to use in UTC.
     */
    private final Chronology iChronology;
    /**
     * The cached hash code.
     */
    private transient int iHash;

    //-----------------------------------------------------------------------

    /**
     * Obtains a {@code LocalDate} set to the current system millisecond time
     * using <code>ISOChronology</code> in the default time zone.
     *
     * @return the current date-time, not null
     * @since 2.0
     */
    public static LocalDate now() {try{__CLR4_4_120b20blgchoqae.R.inc(2611);
        __CLR4_4_120b20blgchoqae.R.inc(2612);return new LocalDate();
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Obtains a {@code LocalDate} set to the current system millisecond time
     * using <code>ISOChronology</code> in the specified time zone.
     *
     * @param zone the time zone, not null
     * @return the current date-time, not null
     * @since 2.0
     */
    public static LocalDate now(DateTimeZone zone) {try{__CLR4_4_120b20blgchoqae.R.inc(2613);
        __CLR4_4_120b20blgchoqae.R.inc(2614);if ((((zone == null)&&(__CLR4_4_120b20blgchoqae.R.iget(2615)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2616)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2617);throw new NullPointerException("Zone must not be null");
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2618);return new LocalDate(zone);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Obtains a {@code LocalDate} set to the current system millisecond time
     * using the specified chronology.
     *
     * @param chronology the chronology, not null
     * @return the current date-time, not null
     * @since 2.0
     */
    public static LocalDate now(Chronology chronology) {try{__CLR4_4_120b20blgchoqae.R.inc(2619);
        __CLR4_4_120b20blgchoqae.R.inc(2620);if ((((chronology == null)&&(__CLR4_4_120b20blgchoqae.R.iget(2621)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2622)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2623);throw new NullPointerException("Chronology must not be null");
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2624);return new LocalDate(chronology);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Parses a {@code LocalDate} from the specified string.
     * <p>
     * This uses {@link ISODateTimeFormat#localDateParser()}.
     *
     * @param str the string to parse, not null
     * @since 2.0
     */
    @FromString
    public static LocalDate parse(String str) {try{__CLR4_4_120b20blgchoqae.R.inc(2625);
        __CLR4_4_120b20blgchoqae.R.inc(2626);return parse(str, ISODateTimeFormat.localDateParser());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Parses a {@code LocalDate} from the specified string using a formatter.
     *
     * @param str       the string to parse, not null
     * @param formatter the formatter to use, not null
     * @since 2.0
     */
    public static LocalDate parse(String str, DateTimeFormatter formatter) {try{__CLR4_4_120b20blgchoqae.R.inc(2627);
        __CLR4_4_120b20blgchoqae.R.inc(2628);return formatter.parseLocalDate(str);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs a LocalDate from a <code>java.util.Calendar</code>
     * using exactly the same field values.
     * <p>
     * Each field is queried from the Calendar and assigned to the LocalDate.
     * This is useful if you have been using the Calendar as a local date,
     * ignoring the zone.
     * <p>
     * One advantage of this method is that this method is unaffected if the
     * version of the time zone data differs between the JDK and Joda-Time.
     * That is because the local field values are transferred, calculated using
     * the JDK time zone data and without using the Joda-Time time zone data.
     * <p>
     * This factory method ignores the type of the calendar and always
     * creates a LocalDate with ISO chronology. It is expected that you
     * will only pass in instances of <code>GregorianCalendar</code> however
     * this is not validated.
     *
     * @param calendar the Calendar to extract fields from, not null
     * @return the created local date, not null
     * @throws IllegalArgumentException if the calendar is null
     * @throws IllegalArgumentException if the date is invalid for the ISO chronology
     */
    public static LocalDate fromCalendarFields(Calendar calendar) {try{__CLR4_4_120b20blgchoqae.R.inc(2629);
        __CLR4_4_120b20blgchoqae.R.inc(2630);if ((((calendar == null)&&(__CLR4_4_120b20blgchoqae.R.iget(2631)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2632)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2633);throw new IllegalArgumentException("The calendar must not be null");
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2634);int era = calendar.get(Calendar.ERA);
        __CLR4_4_120b20blgchoqae.R.inc(2635);int yearOfEra = calendar.get(Calendar.YEAR);
        __CLR4_4_120b20blgchoqae.R.inc(2636);return new LocalDate(
                ((((era == GregorianCalendar.AD )&&(__CLR4_4_120b20blgchoqae.R.iget(2637)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2638)==0&false))? yearOfEra : 1 - yearOfEra),
                calendar.get(Calendar.MONTH) + 1,
                calendar.get(Calendar.DAY_OF_MONTH)
        );
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Constructs a LocalDate from a <code>java.util.Date</code>
     * using exactly the same field values.
     * <p>
     * Each field is queried from the Date and assigned to the LocalDate.
     * This is useful if you have been using the Date as a local date,
     * ignoring the zone.
     * <p>
     * One advantage of this method is that this method is unaffected if the
     * version of the time zone data differs between the JDK and Joda-Time.
     * That is because the local field values are transferred, calculated using
     * the JDK time zone data and without using the Joda-Time time zone data.
     * <p>
     * This factory method always creates a LocalDate with ISO chronology.
     *
     * @param date the Date to extract fields from, not null
     * @return the created local date, not null
     * @throws IllegalArgumentException if the calendar is null
     * @throws IllegalArgumentException if the date is invalid for the ISO chronology
     */
    @SuppressWarnings("deprecation")
    public static LocalDate fromDateFields(Date date) {try{__CLR4_4_120b20blgchoqae.R.inc(2639);
        __CLR4_4_120b20blgchoqae.R.inc(2640);if ((((date == null)&&(__CLR4_4_120b20blgchoqae.R.iget(2641)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2642)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2643);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2644);if ((((date.getTime() < 0)&&(__CLR4_4_120b20blgchoqae.R.iget(2645)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2646)==0&false))) {{
            // handle years in era BC
            __CLR4_4_120b20blgchoqae.R.inc(2647);GregorianCalendar cal = new GregorianCalendar();
            __CLR4_4_120b20blgchoqae.R.inc(2648);cal.setTime(date);
            __CLR4_4_120b20blgchoqae.R.inc(2649);return fromCalendarFields(cal);
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2650);return new LocalDate(
                date.getYear() + 1900,
                date.getMonth() + 1,
                date.getDate()
        );
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs an instance set to the current local time evaluated using
     * ISO chronology in the default zone.
     * <p>
     * Once the constructor is completed, the zone is no longer used.
     *
     * @see #now()
     */
    public LocalDate() {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance());__CLR4_4_120b20blgchoqae.R.inc(2652);try{__CLR4_4_120b20blgchoqae.R.inc(2651);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

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
    public LocalDate(DateTimeZone zone) {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance(zone));__CLR4_4_120b20blgchoqae.R.inc(2654);try{__CLR4_4_120b20blgchoqae.R.inc(2653);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Constructs an instance set to the current local time evaluated using
     * specified chronology.
     * <p>
     * If the chronology is null, ISO chronology in the default time zone is used.
     * Once the constructor is completed, the zone is no longer used.
     *
     * @param chronology the chronology, null means ISOChronology in default zone
     * @see #now(Chronology)
     */
    public LocalDate(Chronology chronology) {
        this(DateTimeUtils.currentTimeMillis(), chronology);__CLR4_4_120b20blgchoqae.R.inc(2656);try{__CLR4_4_120b20blgchoqae.R.inc(2655);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs an instance set to the local time defined by the specified
     * instant evaluated using ISO chronology in the default zone.
     * <p>
     * Once the constructor is completed, the zone is no longer used.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z
     */
    public LocalDate(long instant) {
        this(instant, ISOChronology.getInstance());__CLR4_4_120b20blgchoqae.R.inc(2658);try{__CLR4_4_120b20blgchoqae.R.inc(2657);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

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
    public LocalDate(long instant, DateTimeZone zone) {
        this(instant, ISOChronology.getInstance(zone));__CLR4_4_120b20blgchoqae.R.inc(2660);try{__CLR4_4_120b20blgchoqae.R.inc(2659);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

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
    public LocalDate(long instant, Chronology chronology) {try{__CLR4_4_120b20blgchoqae.R.inc(2661);
        __CLR4_4_120b20blgchoqae.R.inc(2662);chronology = DateTimeUtils.getChronology(chronology);

        __CLR4_4_120b20blgchoqae.R.inc(2663);long localMillis = chronology.getZone().getMillisKeepLocal(DateTimeZone.UTC, instant);
        __CLR4_4_120b20blgchoqae.R.inc(2664);chronology = chronology.withUTC();
        __CLR4_4_120b20blgchoqae.R.inc(2665);iLocalMillis = chronology.dayOfMonth().roundFloor(localMillis);
        __CLR4_4_120b20blgchoqae.R.inc(2666);iChronology = chronology;
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs an instance from an Object that represents a datetime.
     * The time zone will be retrieved from the object if possible,
     * otherwise the default time zone will be used.
     * <p>
     * If the object contains no chronology, <code>ISOChronology</code> is used.
     * Once the constructor is completed, the zone is no longer used.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadablePartial, ReadableInstant, String, Calendar and Date.
     * The String formats are described by {@link ISODateTimeFormat#localDateParser()}.
     * The default String converter ignores the zone and only parses the field values.
     *
     * @param instant the datetime object
     * @throws IllegalArgumentException if the instant is invalid
     */
    public LocalDate(Object instant) {
        this(instant, (Chronology) null);__CLR4_4_120b20blgchoqae.R.inc(2668);try{__CLR4_4_120b20blgchoqae.R.inc(2667);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

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
     * The String formats are described by {@link ISODateTimeFormat#localDateParser()}.
     * The default String converter ignores the zone and only parses the field values.
     *
     * @param instant the datetime object
     * @param zone    the time zone
     * @throws IllegalArgumentException if the instant is invalid
     */
    public LocalDate(Object instant, DateTimeZone zone) {try{__CLR4_4_120b20blgchoqae.R.inc(2669);
        __CLR4_4_120b20blgchoqae.R.inc(2670);PartialConverter converter = ConverterManager.getInstance().getPartialConverter(instant);
        __CLR4_4_120b20blgchoqae.R.inc(2671);Chronology chronology = converter.getChronology(instant, zone);
        __CLR4_4_120b20blgchoqae.R.inc(2672);chronology = DateTimeUtils.getChronology(chronology);
        __CLR4_4_120b20blgchoqae.R.inc(2673);iChronology = chronology.withUTC();
        __CLR4_4_120b20blgchoqae.R.inc(2674);int[] values = converter.getPartialValues(this, instant, chronology, ISODateTimeFormat.localDateParser());
        __CLR4_4_120b20blgchoqae.R.inc(2675);iLocalMillis = iChronology.getDateTimeMillis(values[0], values[1], values[2], 0);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Constructs an instance from an Object that represents a datetime,
     * using the specified chronology.
     * <p>
     * If the chronology is null, ISO in the default time zone is used.
     * Once the constructor is completed, the zone is no longer used.
     * If the instant contains a chronology, it will be ignored.
     * For example, passing a {@code LocalDate} and a different chronology
     * will return a date with the year/month/day from the date applied
     * unaltered to the specified chronology.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadablePartial, ReadableInstant, String, Calendar and Date.
     * The String formats are described by {@link ISODateTimeFormat#localDateParser()}.
     * The default String converter ignores the zone and only parses the field values.
     *
     * @param instant    the datetime object
     * @param chronology the chronology
     * @throws IllegalArgumentException if the instant is invalid
     */
    public LocalDate(Object instant, Chronology chronology) {try{__CLR4_4_120b20blgchoqae.R.inc(2676);
        __CLR4_4_120b20blgchoqae.R.inc(2677);PartialConverter converter = ConverterManager.getInstance().getPartialConverter(instant);
        __CLR4_4_120b20blgchoqae.R.inc(2678);chronology = converter.getChronology(instant, chronology);
        __CLR4_4_120b20blgchoqae.R.inc(2679);chronology = DateTimeUtils.getChronology(chronology);
        __CLR4_4_120b20blgchoqae.R.inc(2680);iChronology = chronology.withUTC();
        __CLR4_4_120b20blgchoqae.R.inc(2681);int[] values = converter.getPartialValues(this, instant, chronology, ISODateTimeFormat.localDateParser());
        __CLR4_4_120b20blgchoqae.R.inc(2682);iLocalMillis = iChronology.getDateTimeMillis(values[0], values[1], values[2], 0);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs an instance set to the specified date and time
     * using <code>ISOChronology</code>.
     *
     * @param year        the year
     * @param monthOfYear the month of the year, from 1 to 12
     * @param dayOfMonth  the day of the month, from 1 to 31
     */
    public LocalDate(
            int year,
            int monthOfYear,
            int dayOfMonth) {
        this(year, monthOfYear, dayOfMonth, ISOChronology.getInstanceUTC());__CLR4_4_120b20blgchoqae.R.inc(2684);try{__CLR4_4_120b20blgchoqae.R.inc(2683);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Constructs an instance set to the specified date and time
     * using the specified chronology, whose zone is ignored.
     * <p>
     * If the chronology is null, <code>ISOChronology</code> is used.
     *
     * @param year        the year, valid values defined by the chronology
     * @param monthOfYear the month of the year, valid values defined by the chronology
     * @param dayOfMonth  the day of the month, valid values defined by the chronology
     * @param chronology  the chronology, null means ISOChronology in default zone
     */
    public LocalDate(
            int year,
            int monthOfYear,
            int dayOfMonth,
            Chronology chronology) {
        super();__CLR4_4_120b20blgchoqae.R.inc(2686);try{__CLR4_4_120b20blgchoqae.R.inc(2685);
        __CLR4_4_120b20blgchoqae.R.inc(2687);chronology = DateTimeUtils.getChronology(chronology).withUTC();
        __CLR4_4_120b20blgchoqae.R.inc(2688);long instant = chronology.getDateTimeMillis(year, monthOfYear, dayOfMonth, 0);
        __CLR4_4_120b20blgchoqae.R.inc(2689);iChronology = chronology;
        __CLR4_4_120b20blgchoqae.R.inc(2690);iLocalMillis = instant;
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Handle broken serialization from other tools.
     *
     * @return the resolved object, not null
     */
    private Object readResolve() {try{__CLR4_4_120b20blgchoqae.R.inc(2691);
        __CLR4_4_120b20blgchoqae.R.inc(2692);if ((((iChronology == null)&&(__CLR4_4_120b20blgchoqae.R.iget(2693)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2694)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2695);return new LocalDate(iLocalMillis, ISOChronology.getInstanceUTC());
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2696);if ((((DateTimeZone.UTC.equals(iChronology.getZone()) == false)&&(__CLR4_4_120b20blgchoqae.R.iget(2697)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2698)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2699);return new LocalDate(iLocalMillis, iChronology.withUTC());
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2700);return this;
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the number of fields in this partial, which is three.
     * The supported fields are Year, MonthOfYear and DayOfMonth.
     * Note that all fields from day and above may in fact be queried via
     * other methods.
     *
     * @return the field count, three
     */
    public int size() {try{__CLR4_4_120b20blgchoqae.R.inc(2701);
        __CLR4_4_120b20blgchoqae.R.inc(2702);return 3;
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Gets the field for a specific index in the chronology specified.
     * <p>
     * This method must not use any instance variables.
     *
     * @param index  the index to retrieve
     * @param chrono the chronology to use
     * @return the field
     */
    protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_120b20blgchoqae.R.inc(2703);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_120b20blgchoqae.R.inc(2704);switch (index) {
            case YEAR:if (!__CLB4_4_1_bool0) {__CLR4_4_120b20blgchoqae.R.inc(2705);__CLB4_4_1_bool0=true;}
                __CLR4_4_120b20blgchoqae.R.inc(2706);return chrono.year();
            case MONTH_OF_YEAR:if (!__CLB4_4_1_bool0) {__CLR4_4_120b20blgchoqae.R.inc(2707);__CLB4_4_1_bool0=true;}
                __CLR4_4_120b20blgchoqae.R.inc(2708);return chrono.monthOfYear();
            case DAY_OF_MONTH:if (!__CLB4_4_1_bool0) {__CLR4_4_120b20blgchoqae.R.inc(2709);__CLB4_4_1_bool0=true;}
                __CLR4_4_120b20blgchoqae.R.inc(2710);return chrono.dayOfMonth();
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_120b20blgchoqae.R.inc(2711);__CLB4_4_1_bool0=true;}
                __CLR4_4_120b20blgchoqae.R.inc(2712);throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Gets the value of the field at the specified index.
     * <p>
     * This method is required to support the <code>ReadablePartial</code>
     * interface. The supported fields are Year, MonthOfYear and DayOfMonth.
     * Note that all fields from day and above may in fact be queried via
     * other methods.
     *
     * @param index the index, zero to two
     * @return the value
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public int getValue(int index) {try{__CLR4_4_120b20blgchoqae.R.inc(2713);
        boolean __CLB4_4_1_bool1=false;__CLR4_4_120b20blgchoqae.R.inc(2714);switch (index) {
            case YEAR:if (!__CLB4_4_1_bool1) {__CLR4_4_120b20blgchoqae.R.inc(2715);__CLB4_4_1_bool1=true;}
                __CLR4_4_120b20blgchoqae.R.inc(2716);return getChronology().year().get(getLocalMillis());
            case MONTH_OF_YEAR:if (!__CLB4_4_1_bool1) {__CLR4_4_120b20blgchoqae.R.inc(2717);__CLB4_4_1_bool1=true;}
                __CLR4_4_120b20blgchoqae.R.inc(2718);return getChronology().monthOfYear().get(getLocalMillis());
            case DAY_OF_MONTH:if (!__CLB4_4_1_bool1) {__CLR4_4_120b20blgchoqae.R.inc(2719);__CLB4_4_1_bool1=true;}
                __CLR4_4_120b20blgchoqae.R.inc(2720);return getChronology().dayOfMonth().get(getLocalMillis());
            default:if (!__CLB4_4_1_bool1) {__CLR4_4_120b20blgchoqae.R.inc(2721);__CLB4_4_1_bool1=true;}
                __CLR4_4_120b20blgchoqae.R.inc(2722);throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the value of one of the fields of a datetime.
     * <p>
     * This method gets the value of the specified field.
     * For example:
     * <pre>
     * LocalDate dt = LocalDate.nowDefaultZone();
     * int year = dt.get(DateTimeFieldType.year());
     * </pre>
     *
     * @param fieldType a field type, usually obtained from DateTimeFieldType, not null
     * @return the value of that field
     * @throws IllegalArgumentException if the field type is null or unsupported
     */
    public int get(DateTimeFieldType fieldType) {try{__CLR4_4_120b20blgchoqae.R.inc(2723);
        __CLR4_4_120b20blgchoqae.R.inc(2724);if ((((fieldType == null)&&(__CLR4_4_120b20blgchoqae.R.iget(2725)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2726)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2727);throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2728);if ((((isSupported(fieldType) == false)&&(__CLR4_4_120b20blgchoqae.R.iget(2729)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2730)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2731);throw new IllegalArgumentException("Field '" + fieldType + "' is not supported");
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2732);return fieldType.getField(getChronology()).get(getLocalMillis());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Checks if the field type specified is supported by this
     * local date and chronology.
     * This can be used to avoid exceptions in {@link #get(DateTimeFieldType)}.
     *
     * @param type a field type, usually obtained from DateTimeFieldType
     * @return true if the field type is supported
     */
    public boolean isSupported(DateTimeFieldType type) {try{__CLR4_4_120b20blgchoqae.R.inc(2733);
        __CLR4_4_120b20blgchoqae.R.inc(2734);if ((((type == null)&&(__CLR4_4_120b20blgchoqae.R.iget(2735)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2736)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2737);return false;
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2738);DurationFieldType durType = type.getDurationType();
        __CLR4_4_120b20blgchoqae.R.inc(2739);if ((((DATE_DURATION_TYPES.contains(durType) ||
                durType.getField(getChronology()).getUnitMillis() >=
                        getChronology().days().getUnitMillis())&&(__CLR4_4_120b20blgchoqae.R.iget(2740)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2741)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2742);return type.getField(getChronology()).isSupported();
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2743);return false;
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Checks if the duration type specified is supported by this
     * local date and chronology.
     *
     * @param type a duration type, usually obtained from DurationFieldType
     * @return true if the field type is supported
     */
    public boolean isSupported(DurationFieldType type) {try{__CLR4_4_120b20blgchoqae.R.inc(2744);
        __CLR4_4_120b20blgchoqae.R.inc(2745);if ((((type == null)&&(__CLR4_4_120b20blgchoqae.R.iget(2746)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2747)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2748);return false;
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2749);DurationField field = type.getField(getChronology());
        __CLR4_4_120b20blgchoqae.R.inc(2750);if ((((DATE_DURATION_TYPES.contains(type) ||
                field.getUnitMillis() >= getChronology().days().getUnitMillis())&&(__CLR4_4_120b20blgchoqae.R.iget(2751)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2752)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2753);return field.isSupported();
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2754);return false;
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the local milliseconds from the Java epoch
     * of 1970-01-01T00:00:00 (not fixed to any specific time zone).
     *
     * @return the number of milliseconds since 1970-01-01T00:00:00
     * @since 1.5 (previously private)
     */
    protected long getLocalMillis() {try{__CLR4_4_120b20blgchoqae.R.inc(2755);
        __CLR4_4_120b20blgchoqae.R.inc(2756);return iLocalMillis;
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Gets the chronology of the date.
     *
     * @return the Chronology that the date is using
     */
    public Chronology getChronology() {try{__CLR4_4_120b20blgchoqae.R.inc(2757);
        __CLR4_4_120b20blgchoqae.R.inc(2758);return iChronology;
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Compares this ReadablePartial with another returning true if the chronology,
     * field types and values are equal.
     *
     * @param partial an object to check against
     * @return true if fields and values are equal
     */
    public boolean equals(Object partial) {try{__CLR4_4_120b20blgchoqae.R.inc(2759);
        // override to perform faster
        __CLR4_4_120b20blgchoqae.R.inc(2760);if ((((this == partial)&&(__CLR4_4_120b20blgchoqae.R.iget(2761)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2762)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2763);return true;
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2764);if ((((partial instanceof LocalDate)&&(__CLR4_4_120b20blgchoqae.R.iget(2765)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2766)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2767);LocalDate other = (LocalDate) partial;
            __CLR4_4_120b20blgchoqae.R.inc(2768);if ((((iChronology.equals(other.iChronology))&&(__CLR4_4_120b20blgchoqae.R.iget(2769)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2770)==0&false))) {{
                __CLR4_4_120b20blgchoqae.R.inc(2771);return iLocalMillis == other.iLocalMillis;
            }
        }}
        }__CLR4_4_120b20blgchoqae.R.inc(2772);return super.equals(partial);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Gets a hash code for the instant as defined in <code>ReadablePartial</code>.
     *
     * @return a suitable hash code
     */
    public int hashCode() {try{__CLR4_4_120b20blgchoqae.R.inc(2773);
        // override for performance
        __CLR4_4_120b20blgchoqae.R.inc(2774);int hash = iHash;
        __CLR4_4_120b20blgchoqae.R.inc(2775);if ((((hash == 0)&&(__CLR4_4_120b20blgchoqae.R.iget(2776)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2777)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2778);hash = iHash = super.hashCode();
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2779);return hash;
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

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
    public int compareTo(ReadablePartial partial) {try{__CLR4_4_120b20blgchoqae.R.inc(2780);
        // override to perform faster
        __CLR4_4_120b20blgchoqae.R.inc(2781);if ((((this == partial)&&(__CLR4_4_120b20blgchoqae.R.iget(2782)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2783)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2784);return 0;
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2785);if ((((partial instanceof LocalDate)&&(__CLR4_4_120b20blgchoqae.R.iget(2786)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2787)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2788);LocalDate other = (LocalDate) partial;
            __CLR4_4_120b20blgchoqae.R.inc(2789);if ((((iChronology.equals(other.iChronology))&&(__CLR4_4_120b20blgchoqae.R.iget(2790)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2791)==0&false))) {{
                __CLR4_4_120b20blgchoqae.R.inc(2792);return ((((iLocalMillis < other.iLocalMillis )&&(__CLR4_4_120b20blgchoqae.R.iget(2793)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2794)==0&false))? -1 :
                        ((((iLocalMillis == other.iLocalMillis )&&(__CLR4_4_120b20blgchoqae.R.iget(2795)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2796)==0&false))? 0 : 1));

            }
        }}
        }__CLR4_4_120b20blgchoqae.R.inc(2797);return super.compareTo(partial);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this LocalDate to a full datetime at the earliest valid time
     * for the date using the default time zone.
     * <p>
     * The time will normally be midnight, as that is the earliest time on
     * any given day. However, in some time zones when Daylight Savings Time
     * starts, there is no midnight because time jumps from 11:59 to 01:00.
     * This method handles that situation by returning 01:00 on that date.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @return this date as a datetime at the start of the day
     * @since 1.5
     */
    public DateTime toDateTimeAtStartOfDay() {try{__CLR4_4_120b20blgchoqae.R.inc(2798);
        __CLR4_4_120b20blgchoqae.R.inc(2799);return toDateTimeAtStartOfDay(null);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Converts this LocalDate to a full datetime at the earliest valid time
     * for the date using the specified time zone.
     * <p>
     * The time will normally be midnight, as that is the earliest time on
     * any given day. However, in some time zones when Daylight Savings Time
     * starts, there is no midnight because time jumps from 11:59 to 01:00.
     * This method handles that situation by returning 01:00 on that date.
     * <p>
     * This method uses the chronology from this instance plus the time zone
     * specified.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param zone the zone to use, null means default zone
     * @return this date as a datetime at the start of the day
     * @since 1.5
     */
    public DateTime toDateTimeAtStartOfDay(DateTimeZone zone) {try{__CLR4_4_120b20blgchoqae.R.inc(2800);
        __CLR4_4_120b20blgchoqae.R.inc(2801);zone = DateTimeUtils.getZone(zone);
        __CLR4_4_120b20blgchoqae.R.inc(2802);Chronology chrono = getChronology().withZone(zone);
        __CLR4_4_120b20blgchoqae.R.inc(2803);long localMillis = getLocalMillis() + 6L * DateTimeConstants.MILLIS_PER_HOUR;
        __CLR4_4_120b20blgchoqae.R.inc(2804);long instant = zone.convertLocalToUTC(localMillis, false);
        __CLR4_4_120b20blgchoqae.R.inc(2805);instant = chrono.dayOfMonth().roundFloor(instant);
        __CLR4_4_120b20blgchoqae.R.inc(2806);return new DateTime(instant, chrono).withEarlierOffsetAtOverlap();
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this LocalDate to a full datetime at midnight using the default
     * time zone.
     * <p>
     * This method will throw an exception if the default time zone switches
     * to Daylight Savings Time at midnight and this LocalDate represents
     * that switchover date. The problem is that there is no such time as
     * midnight on the required date, and as such an exception is thrown.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @return this date as a datetime at midnight
     * @deprecated Use {@link #toDateTimeAtStartOfDay()} which won't throw an exception
     */
    @Deprecated
    public DateTime toDateTimeAtMidnight() {try{__CLR4_4_120b20blgchoqae.R.inc(2807);
        __CLR4_4_120b20blgchoqae.R.inc(2808);return toDateTimeAtMidnight(null);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Converts this LocalDate to a full datetime at midnight using the
     * specified time zone.
     * <p>
     * This method will throw an exception if the time zone switches
     * to Daylight Savings Time at midnight and this LocalDate represents
     * that switchover date. The problem is that there is no such time as
     * midnight on the required date, and as such an exception is thrown.
     * <p>
     * This method uses the chronology from this instance plus the time zone
     * specified.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param zone the zone to use, null means default zone
     * @return this date as a datetime at midnight
     * @deprecated Use {@link #toDateTimeAtStartOfDay(DateTimeZone)} which won't throw an exception
     */
    @Deprecated
    public DateTime toDateTimeAtMidnight(DateTimeZone zone) {try{__CLR4_4_120b20blgchoqae.R.inc(2809);
        __CLR4_4_120b20blgchoqae.R.inc(2810);zone = DateTimeUtils.getZone(zone);
        __CLR4_4_120b20blgchoqae.R.inc(2811);Chronology chrono = getChronology().withZone(zone);
        __CLR4_4_120b20blgchoqae.R.inc(2812);return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), 0, 0, 0, 0, chrono);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this LocalDate to a full datetime using the default time zone
     * setting the date fields from this instance and the time fields from
     * the current time.
     * <p>
     * This method will throw an exception if the datetime that would be
     * created does not exist when the time zone is taken into account.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @return this date as a datetime with the time as the current time
     */
    public DateTime toDateTimeAtCurrentTime() {try{__CLR4_4_120b20blgchoqae.R.inc(2813);
        __CLR4_4_120b20blgchoqae.R.inc(2814);return toDateTimeAtCurrentTime(null);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Converts this LocalDate to a full datetime using the specified time zone
     * setting the date fields from this instance and the time fields from
     * the current time.
     * <p>
     * This method uses the chronology from this instance plus the time zone
     * specified.
     * <p>
     * This method will throw an exception if the datetime that would be
     * created does not exist when the time zone is taken into account.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param zone the zone to use, null means default zone
     * @return this date as a datetime with the time as the current time
     */
    public DateTime toDateTimeAtCurrentTime(DateTimeZone zone) {try{__CLR4_4_120b20blgchoqae.R.inc(2815);
        __CLR4_4_120b20blgchoqae.R.inc(2816);zone = DateTimeUtils.getZone(zone);
        __CLR4_4_120b20blgchoqae.R.inc(2817);Chronology chrono = getChronology().withZone(zone);
        __CLR4_4_120b20blgchoqae.R.inc(2818);long instantMillis = DateTimeUtils.currentTimeMillis();
        __CLR4_4_120b20blgchoqae.R.inc(2819);long resolved = chrono.set(this, instantMillis);
        __CLR4_4_120b20blgchoqae.R.inc(2820);return new DateTime(resolved, chrono);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this LocalDate to a DateMidnight in the default time zone.
     * <p>
     * As from v1.5, you are recommended to avoid DateMidnight and use
     * {@link #toDateTimeAtStartOfDay()} instead because of the exception
     * detailed below.
     * <p>
     * This method will throw an exception if the default time zone switches
     * to Daylight Savings Time at midnight and this LocalDate represents
     * that switchover date. The problem is that there is no such time as
     * midnight on the required date, and as such an exception is thrown.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @return the DateMidnight instance in the default zone
     * @deprecated DateMidnight is deprecated
     */
    @Deprecated
    public DateMidnight toDateMidnight() {try{__CLR4_4_120b20blgchoqae.R.inc(2821);
        __CLR4_4_120b20blgchoqae.R.inc(2822);return toDateMidnight(null);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Converts this LocalDate to a DateMidnight.
     * <p>
     * As from v1.5, you are recommended to avoid DateMidnight and use
     * {@link #toDateTimeAtStartOfDay()} instead because of the exception
     * detailed below.
     * <p>
     * This method will throw an exception if the time zone switches
     * to Daylight Savings Time at midnight and this LocalDate represents
     * that switchover date. The problem is that there is no such time as
     * midnight on the required date, and as such an exception is thrown.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param zone the zone to get the DateMidnight in, null means default zone
     * @return the DateMidnight instance
     * @deprecated DateMidnight is deprecated
     */
    @Deprecated
    public DateMidnight toDateMidnight(DateTimeZone zone) {try{__CLR4_4_120b20blgchoqae.R.inc(2823);
        __CLR4_4_120b20blgchoqae.R.inc(2824);zone = DateTimeUtils.getZone(zone);
        __CLR4_4_120b20blgchoqae.R.inc(2825);Chronology chrono = getChronology().withZone(zone);
        __CLR4_4_120b20blgchoqae.R.inc(2826);return new DateMidnight(getYear(), getMonthOfYear(), getDayOfMonth(), chrono);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this object to a LocalDateTime using a LocalTime to fill in
     * the missing fields.
     * <p>
     * The resulting chronology is determined by the chronology of this
     * LocalDate. The chronology of the time must also match.
     * If the time is null an exception is thrown.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param time the time of day to use, must not be null
     * @return the LocalDateTime instance
     * @throws IllegalArgumentException if the time is null
     * @throws IllegalArgumentException if the chronology of the time does not match
     * @since 1.5
     */
    public LocalDateTime toLocalDateTime(LocalTime time) {try{__CLR4_4_120b20blgchoqae.R.inc(2827);
        __CLR4_4_120b20blgchoqae.R.inc(2828);if ((((time == null)&&(__CLR4_4_120b20blgchoqae.R.iget(2829)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2830)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2831);throw new IllegalArgumentException("The time must not be null");
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2832);if ((((getChronology() != time.getChronology())&&(__CLR4_4_120b20blgchoqae.R.iget(2833)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2834)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2835);throw new IllegalArgumentException("The chronology of the time does not match");
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2836);long localMillis = getLocalMillis() + time.getLocalMillis();
        __CLR4_4_120b20blgchoqae.R.inc(2837);return new LocalDateTime(localMillis, getChronology());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this object to a DateTime using a LocalTime to fill in the
     * missing fields and using the default time zone.
     * <p>
     * The resulting chronology is determined by the chronology of this
     * LocalDate. The chronology of the time must match.
     * <p>
     * If the time is null, this method delegates to {@link #toDateTimeAtCurrentTime(DateTimeZone)}
     * and the following documentation does not apply.
     * <p>
     * When the time zone is applied, the local date-time may be affected by daylight saving.
     * In a daylight saving gap, when the local time does not exist,
     * this method will throw an exception.
     * In a daylight saving overlap, when the same local time occurs twice,
     * this method returns the first occurrence of the local time.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param time the time of day to use, null uses current time
     * @return the DateTime instance
     * @throws IllegalArgumentException if the chronology of the time does not match
     * @throws IllegalInstantException  if the local time does not exist when the time zone is applied
     */
    public DateTime toDateTime(LocalTime time) {try{__CLR4_4_120b20blgchoqae.R.inc(2838);
        __CLR4_4_120b20blgchoqae.R.inc(2839);return toDateTime(time, null);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Converts this object to a DateTime using a LocalTime to fill in the
     * missing fields.
     * <p>
     * The resulting chronology is determined by the chronology of this
     * LocalDate plus the time zone. The chronology of the time must match.
     * <p>
     * If the time is null, this method delegates to {@link #toDateTimeAtCurrentTime(DateTimeZone)}
     * and the following documentation does not apply.
     * <p>
     * When the time zone is applied, the local date-time may be affected by daylight saving.
     * In a daylight saving gap, when the local time does not exist,
     * this method will throw an exception.
     * In a daylight saving overlap, when the same local time occurs twice,
     * this method returns the first occurrence of the local time.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param time the time of day to use, null uses current time
     * @param zone the zone to get the DateTime in, null means default
     * @return the DateTime instance
     * @throws IllegalArgumentException if the chronology of the time does not match
     * @throws IllegalInstantException  if the local time does not exist when the time zone is applied
     */
    public DateTime toDateTime(LocalTime time, DateTimeZone zone) {try{__CLR4_4_120b20blgchoqae.R.inc(2840);
        __CLR4_4_120b20blgchoqae.R.inc(2841);if ((((time == null)&&(__CLR4_4_120b20blgchoqae.R.iget(2842)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2843)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2844);return toDateTimeAtCurrentTime(zone);
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2845);if ((((getChronology() != time.getChronology())&&(__CLR4_4_120b20blgchoqae.R.iget(2846)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2847)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2848);throw new IllegalArgumentException("The chronology of the time does not match");
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2849);Chronology chrono = getChronology().withZone(zone);
        __CLR4_4_120b20blgchoqae.R.inc(2850);return new DateTime(
                getYear(), getMonthOfYear(), getDayOfMonth(),
                time.getHourOfDay(), time.getMinuteOfHour(),
                time.getSecondOfMinute(), time.getMillisOfSecond(), chrono);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this object to an Interval representing the whole day
     * in the default time zone.
     * <p>
     * The interval may have more or less than 24 hours if this is a daylight
     * savings cutover date.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @return a interval over the day
     */
    public Interval toInterval() {try{__CLR4_4_120b20blgchoqae.R.inc(2851);
        __CLR4_4_120b20blgchoqae.R.inc(2852);return toInterval(null);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Converts this object to an Interval representing the whole day.
     * <p>
     * The interval may have more or less than 24 hours if this is a daylight
     * savings cutover date.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param zone the zone to get the Interval in, null means default
     * @return a interval over the day
     */
    public Interval toInterval(DateTimeZone zone) {try{__CLR4_4_120b20blgchoqae.R.inc(2853);
        __CLR4_4_120b20blgchoqae.R.inc(2854);zone = DateTimeUtils.getZone(zone);
        __CLR4_4_120b20blgchoqae.R.inc(2855);DateTime start = toDateTimeAtStartOfDay(zone);
        __CLR4_4_120b20blgchoqae.R.inc(2856);DateTime end = plusDays(1).toDateTimeAtStartOfDay(zone);
        __CLR4_4_120b20blgchoqae.R.inc(2857);return new Interval(start, end);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the date time as a <code>java.util.Date</code>.
     * <p>
     * The <code>Date</code> object created has exactly the same year, month and day
     * as this date. The time will be set to the earliest valid time for that date.
     * <p>
     * Converting to a JDK Date is full of complications as the JDK Date constructor
     * doesn't behave as you might expect around DST transitions. This method works
     * by taking a first guess and then adjusting the JDK date until it has the
     * earliest valid instant. This also handles the situation where the JDK time
     * zone data differs from the Joda-Time time zone data.
     *
     * @return a Date initialised with this date, never null
     * @since 2.0
     */
    @SuppressWarnings("deprecation")
    public Date toDate() {try{__CLR4_4_120b20blgchoqae.R.inc(2858);
        __CLR4_4_120b20blgchoqae.R.inc(2859);int dom = getDayOfMonth();
        __CLR4_4_120b20blgchoqae.R.inc(2860);Date date = new Date(getYear() - 1900, getMonthOfYear() - 1, dom);
        __CLR4_4_120b20blgchoqae.R.inc(2861);LocalDate check = LocalDate.fromDateFields(date);
        __CLR4_4_120b20blgchoqae.R.inc(2862);if ((((check.isBefore(this))&&(__CLR4_4_120b20blgchoqae.R.iget(2863)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2864)==0&false))) {{
            // DST gap (no midnight)
            // move forward in units of one hour until date correct
            __CLR4_4_120b20blgchoqae.R.inc(2865);while ((((check.equals(this) == false)&&(__CLR4_4_120b20blgchoqae.R.iget(2866)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2867)==0&false))) {{
                __CLR4_4_120b20blgchoqae.R.inc(2868);date.setTime(date.getTime() + 3600000);
                __CLR4_4_120b20blgchoqae.R.inc(2869);check = LocalDate.fromDateFields(date);
            }
            // move back in units of one second until date wrong
            }__CLR4_4_120b20blgchoqae.R.inc(2870);while ((((date.getDate() == dom)&&(__CLR4_4_120b20blgchoqae.R.iget(2871)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2872)==0&false))) {{
                __CLR4_4_120b20blgchoqae.R.inc(2873);date.setTime(date.getTime() - 1000);
            }
            // fix result
            }__CLR4_4_120b20blgchoqae.R.inc(2874);date.setTime(date.getTime() + 1000);
        } }else {__CLR4_4_120b20blgchoqae.R.inc(2875);if ((((check.equals(this))&&(__CLR4_4_120b20blgchoqae.R.iget(2876)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2877)==0&false))) {{
            // check for DST overlap (two midnights)
            __CLR4_4_120b20blgchoqae.R.inc(2878);Date earlier = new Date(date.getTime() - TimeZone.getDefault().getDSTSavings());
            __CLR4_4_120b20blgchoqae.R.inc(2879);if ((((earlier.getDate() == dom)&&(__CLR4_4_120b20blgchoqae.R.iget(2880)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2881)==0&false))) {{
                __CLR4_4_120b20blgchoqae.R.inc(2882);date = earlier;
            }
        }}
        }}__CLR4_4_120b20blgchoqae.R.inc(2883);return date;
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this date with different local millis.
     * <p>
     * The returned object will be a new instance of the same type.
     * Only the millis will change, the chronology is kept.
     * The returned object will be either be a new instance or <code>this</code>.
     *
     * @param newMillis the new millis, from 1970-01-01T00:00:00
     * @return a copy of this date with different millis
     */
    LocalDate withLocalMillis(long newMillis) {try{__CLR4_4_120b20blgchoqae.R.inc(2884);
        __CLR4_4_120b20blgchoqae.R.inc(2885);newMillis = iChronology.dayOfMonth().roundFloor(newMillis);
        __CLR4_4_120b20blgchoqae.R.inc(2886);return ((((newMillis == getLocalMillis() )&&(__CLR4_4_120b20blgchoqae.R.iget(2887)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2888)==0&false))? this : new LocalDate(newMillis, getChronology()));
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this date with the partial set of fields replacing
     * those from this instance.
     * <p>
     * For example, if the partial contains a year and a month then those two
     * fields will be changed in the returned instance.
     * Unsupported fields are ignored.
     * If the partial is null, then <code>this</code> is returned.
     *
     * @param partial the partial set of fields to apply to this date, null ignored
     * @return a copy of this date with a different set of fields
     * @throws IllegalArgumentException if any value is invalid
     */
    public LocalDate withFields(ReadablePartial partial) {try{__CLR4_4_120b20blgchoqae.R.inc(2889);
        __CLR4_4_120b20blgchoqae.R.inc(2890);if ((((partial == null)&&(__CLR4_4_120b20blgchoqae.R.iget(2891)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2892)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2893);return this;
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2894);return withLocalMillis(getChronology().set(partial, getLocalMillis()));
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the specified field set to a new value.
     * <p>
     * For example, if the field type is <code>monthOfYear</code> then the
     * month of year field will be changed in the returned instance.
     * If the field type is null, then <code>this</code> is returned.
     * <p>
     * These two lines are equivalent:
     * <pre>
     * LocalDate updated = dt.withDayOfMonth(6);
     * LocalDate updated = dt.withField(DateTimeFieldType.dayOfMonth(), 6);
     * </pre>
     *
     * @param fieldType the field type to set, not null
     * @param value     the value to set
     * @return a copy of this date with the field set
     * @throws IllegalArgumentException if the field is null or unsupported
     */
    public LocalDate withField(DateTimeFieldType fieldType, int value) {try{__CLR4_4_120b20blgchoqae.R.inc(2895);
        __CLR4_4_120b20blgchoqae.R.inc(2896);if ((((fieldType == null)&&(__CLR4_4_120b20blgchoqae.R.iget(2897)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2898)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2899);throw new IllegalArgumentException("Field must not be null");
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2900);if ((((isSupported(fieldType) == false)&&(__CLR4_4_120b20blgchoqae.R.iget(2901)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2902)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2903);throw new IllegalArgumentException("Field '" + fieldType + "' is not supported");
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2904);long instant = fieldType.getField(getChronology()).set(getLocalMillis(), value);
        __CLR4_4_120b20blgchoqae.R.inc(2905);return withLocalMillis(instant);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the value of the specified field increased.
     * <p>
     * If the addition is zero or the field is null, then <code>this</code> is returned.
     * <p>
     * These three lines are equivalent:
     * <pre>
     * LocalDate added = dt.withFieldAdded(DurationFieldType.years(), 6);
     * LocalDate added = dt.plusYears(6);
     * LocalDate added = dt.plus(Period.years(6));
     * </pre>
     *
     * @param fieldType the field type to add to, not null
     * @param amount    the amount to add
     * @return a copy of this date with the field updated
     * @throws IllegalArgumentException if the field is null or unsupported
     * @throws ArithmeticException      if the result exceeds the internal capacity
     */
    public LocalDate withFieldAdded(DurationFieldType fieldType, int amount) {try{__CLR4_4_120b20blgchoqae.R.inc(2906);
        __CLR4_4_120b20blgchoqae.R.inc(2907);if ((((fieldType == null)&&(__CLR4_4_120b20blgchoqae.R.iget(2908)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2909)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2910);throw new IllegalArgumentException("Field must not be null");
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2911);if ((((isSupported(fieldType) == false)&&(__CLR4_4_120b20blgchoqae.R.iget(2912)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2913)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2914);throw new IllegalArgumentException("Field '" + fieldType + "' is not supported");
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2915);if ((((amount == 0)&&(__CLR4_4_120b20blgchoqae.R.iget(2916)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2917)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2918);return this;
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2919);long instant = fieldType.getField(getChronology()).add(getLocalMillis(), amount);
        __CLR4_4_120b20blgchoqae.R.inc(2920);return withLocalMillis(instant);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this date with the specified period added.
     * <p>
     * If the addition is zero, then <code>this</code> is returned.
     * <p>
     * This method is typically used to add multiple copies of complex
     * period instances. Adding one field is best achieved using methods
     * like {@link #withFieldAdded(DurationFieldType, int)}
     * or {@link #plusYears(int)}.
     * <p>
     * Unsupported time fields are ignored, thus adding a period of 24 hours
     * will not have any effect.
     *
     * @param period the period to add to this one, null means zero
     * @param scalar the amount of times to add, such as -1 to subtract once
     * @return a copy of this date with the period added
     * @throws ArithmeticException if the result exceeds the internal capacity
     */
    public LocalDate withPeriodAdded(ReadablePeriod period, int scalar) {try{__CLR4_4_120b20blgchoqae.R.inc(2921);
        __CLR4_4_120b20blgchoqae.R.inc(2922);if ((((period == null || scalar == 0)&&(__CLR4_4_120b20blgchoqae.R.iget(2923)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2924)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2925);return this;
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2926);long instant = getLocalMillis();
        __CLR4_4_120b20blgchoqae.R.inc(2927);Chronology chrono = getChronology();
        __CLR4_4_120b20blgchoqae.R.inc(2928);for (int i = 0; (((i < period.size())&&(__CLR4_4_120b20blgchoqae.R.iget(2929)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2930)==0&false)); i++) {{
            __CLR4_4_120b20blgchoqae.R.inc(2931);long value = FieldUtils.safeMultiply(period.getValue(i), scalar);
            __CLR4_4_120b20blgchoqae.R.inc(2932);DurationFieldType type = period.getFieldType(i);
            __CLR4_4_120b20blgchoqae.R.inc(2933);if ((((isSupported(type))&&(__CLR4_4_120b20blgchoqae.R.iget(2934)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2935)==0&false))) {{
                __CLR4_4_120b20blgchoqae.R.inc(2936);instant = type.getField(chrono).add(instant, value);
            }
        }}
        }__CLR4_4_120b20blgchoqae.R.inc(2937);return withLocalMillis(instant);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this date with the specified period added.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * <p>
     * This method is typically used to add complex period instances.
     * Adding one field is best achieved using methods
     * like {@link #plusYears(int)}.
     * <p>
     * Unsupported time fields are ignored, thus adding a period of 24 hours
     * will not have any effect.
     *
     * @param period the period to add to this one, null means zero
     * @return a copy of this date with the period added
     * @throws ArithmeticException if the result exceeds the internal capacity
     */
    public LocalDate plus(ReadablePeriod period) {try{__CLR4_4_120b20blgchoqae.R.inc(2938);
        __CLR4_4_120b20blgchoqae.R.inc(2939);return withPeriodAdded(period, 1);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this date plus the specified number of years.
     * <p>
     * This adds the specified number of years to the date.
     * If adding years makes the day-of-month invalid, it is adjusted to the last valid day in the month.
     * This LocalDate instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDate added = dt.plusYears(6);
     * LocalDate added = dt.plus(Period.years(6));
     * LocalDate added = dt.withFieldAdded(DurationFieldType.years(), 6);
     * </pre>
     *
     * @param years the amount of years to add, may be negative
     * @return the new LocalDate plus the increased years
     */
    public LocalDate plusYears(int years) {try{__CLR4_4_120b20blgchoqae.R.inc(2940);
        __CLR4_4_120b20blgchoqae.R.inc(2941);if ((((years == 0)&&(__CLR4_4_120b20blgchoqae.R.iget(2942)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2943)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2944);return this;
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2945);long instant = getChronology().years().add(getLocalMillis(), years);
        __CLR4_4_120b20blgchoqae.R.inc(2946);return withLocalMillis(instant);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Returns a copy of this date plus the specified number of months.
     * <p>
     * This adds the specified number of months to the date.
     * The addition may change the year, but the day-of-month is normally unchanged.
     * If adding months makes the day-of-month invalid, it is adjusted to the last valid day in the month.
     * This LocalDate instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDate added = dt.plusMonths(6);
     * LocalDate added = dt.plus(Period.months(6));
     * LocalDate added = dt.withFieldAdded(DurationFieldType.months(), 6);
     * </pre>
     *
     * @param months the amount of months to add, may be negative
     * @return the new LocalDate plus the increased months
     */
    public LocalDate plusMonths(int months) {try{__CLR4_4_120b20blgchoqae.R.inc(2947);
        __CLR4_4_120b20blgchoqae.R.inc(2948);if ((((months == 0)&&(__CLR4_4_120b20blgchoqae.R.iget(2949)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2950)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2951);return this;
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2952);long instant = getChronology().months().add(getLocalMillis(), months);
        __CLR4_4_120b20blgchoqae.R.inc(2953);return withLocalMillis(instant);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Returns a copy of this date plus the specified number of weeks.
     * <p>
     * This LocalDate instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDate added = dt.plusWeeks(6);
     * LocalDate added = dt.plus(Period.weeks(6));
     * LocalDate added = dt.withFieldAdded(DurationFieldType.weeks(), 6);
     * </pre>
     *
     * @param weeks the amount of weeks to add, may be negative
     * @return the new LocalDate plus the increased weeks
     */
    public LocalDate plusWeeks(int weeks) {try{__CLR4_4_120b20blgchoqae.R.inc(2954);
        __CLR4_4_120b20blgchoqae.R.inc(2955);if ((((weeks == 0)&&(__CLR4_4_120b20blgchoqae.R.iget(2956)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2957)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2958);return this;
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2959);long instant = getChronology().weeks().add(getLocalMillis(), weeks);
        __CLR4_4_120b20blgchoqae.R.inc(2960);return withLocalMillis(instant);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Returns a copy of this date plus the specified number of days.
     * <p>
     * This LocalDate instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDate added = dt.plusDays(6);
     * LocalDate added = dt.plus(Period.days(6));
     * LocalDate added = dt.withFieldAdded(DurationFieldType.days(), 6);
     * </pre>
     *
     * @param days the amount of days to add, may be negative
     * @return the new LocalDate plus the increased days
     */
    public LocalDate plusDays(int days) {try{__CLR4_4_120b20blgchoqae.R.inc(2961);
        __CLR4_4_120b20blgchoqae.R.inc(2962);if ((((days == 0)&&(__CLR4_4_120b20blgchoqae.R.iget(2963)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2964)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2965);return this;
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2966);long instant = getChronology().days().add(getLocalMillis(), days);
        __CLR4_4_120b20blgchoqae.R.inc(2967);return withLocalMillis(instant);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this date with the specified period taken away.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * <p>
     * This method is typically used to subtract complex period instances.
     * Subtracting one field is best achieved using methods
     * like {@link #minusYears(int)}.
     * <p>
     * Unsupported time fields are ignored, thus subtracting a period of 24 hours
     * will not have any effect.
     *
     * @param period the period to reduce this instant by
     * @return a copy of this LocalDate with the period taken away
     * @throws ArithmeticException if the result exceeds the internal capacity
     */
    public LocalDate minus(ReadablePeriod period) {try{__CLR4_4_120b20blgchoqae.R.inc(2968);
        __CLR4_4_120b20blgchoqae.R.inc(2969);return withPeriodAdded(period, -1);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this date minus the specified number of years.
     * <p>
     * This subtracts the specified number of years from the date.
     * If subtracting years makes the day-of-month invalid, it is adjusted to the last valid day in the month.
     * This LocalDate instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDate subtracted = dt.minusYears(6);
     * LocalDate subtracted = dt.minus(Period.years(6));
     * LocalDate subtracted = dt.withFieldAdded(DurationFieldType.years(), -6);
     * </pre>
     *
     * @param years the amount of years to subtract, may be negative
     * @return the new LocalDate minus the increased years
     */
    public LocalDate minusYears(int years) {try{__CLR4_4_120b20blgchoqae.R.inc(2970);
        __CLR4_4_120b20blgchoqae.R.inc(2971);if ((((years == 0)&&(__CLR4_4_120b20blgchoqae.R.iget(2972)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2973)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2974);return this;
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2975);long instant = getChronology().years().subtract(getLocalMillis(), years);
        __CLR4_4_120b20blgchoqae.R.inc(2976);return withLocalMillis(instant);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Returns a copy of this date minus the specified number of months.
     * <p>
     * This subtracts the specified number of months from the date.
     * The subtraction may change the year, but the day-of-month is normally unchanged.
     * If subtracting months makes the day-of-month invalid, it is adjusted to the last valid day in the month.
     * This LocalDate instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDate subtracted = dt.minusMonths(6);
     * LocalDate subtracted = dt.minus(Period.months(6));
     * LocalDate subtracted = dt.withFieldAdded(DurationFieldType.months(), -6);
     * </pre>
     *
     * @param months the amount of months to subtract, may be negative
     * @return the new LocalDate minus the increased months
     */
    public LocalDate minusMonths(int months) {try{__CLR4_4_120b20blgchoqae.R.inc(2977);
        __CLR4_4_120b20blgchoqae.R.inc(2978);if ((((months == 0)&&(__CLR4_4_120b20blgchoqae.R.iget(2979)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2980)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2981);return this;
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2982);long instant = getChronology().months().subtract(getLocalMillis(), months);
        __CLR4_4_120b20blgchoqae.R.inc(2983);return withLocalMillis(instant);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Returns a copy of this date minus the specified number of weeks.
     * <p>
     * This LocalDate instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDate subtracted = dt.minusWeeks(6);
     * LocalDate subtracted = dt.minus(Period.weeks(6));
     * LocalDate subtracted = dt.withFieldAdded(DurationFieldType.weeks(), -6);
     * </pre>
     *
     * @param weeks the amount of weeks to subtract, may be negative
     * @return the new LocalDate minus the increased weeks
     */
    public LocalDate minusWeeks(int weeks) {try{__CLR4_4_120b20blgchoqae.R.inc(2984);
        __CLR4_4_120b20blgchoqae.R.inc(2985);if ((((weeks == 0)&&(__CLR4_4_120b20blgchoqae.R.iget(2986)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2987)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2988);return this;
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2989);long instant = getChronology().weeks().subtract(getLocalMillis(), weeks);
        __CLR4_4_120b20blgchoqae.R.inc(2990);return withLocalMillis(instant);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Returns a copy of this date minus the specified number of days.
     * <p>
     * This LocalDate instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDate subtracted = dt.minusDays(6);
     * LocalDate subtracted = dt.minus(Period.days(6));
     * LocalDate subtracted = dt.withFieldAdded(DurationFieldType.days(), -6);
     * </pre>
     *
     * @param days the amount of days to subtract, may be negative
     * @return the new LocalDate minus the increased days
     */
    public LocalDate minusDays(int days) {try{__CLR4_4_120b20blgchoqae.R.inc(2991);
        __CLR4_4_120b20blgchoqae.R.inc(2992);if ((((days == 0)&&(__CLR4_4_120b20blgchoqae.R.iget(2993)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(2994)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(2995);return this;
        }
        }__CLR4_4_120b20blgchoqae.R.inc(2996);long instant = getChronology().days().subtract(getLocalMillis(), days);
        __CLR4_4_120b20blgchoqae.R.inc(2997);return withLocalMillis(instant);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the property object for the specified type, which contains many
     * useful methods.
     *
     * @param fieldType the field type to get the chronology for
     * @return the property object
     * @throws IllegalArgumentException if the field is null or unsupported
     */
    public Property property(DateTimeFieldType fieldType) {try{__CLR4_4_120b20blgchoqae.R.inc(2998);
        __CLR4_4_120b20blgchoqae.R.inc(2999);if ((((fieldType == null)&&(__CLR4_4_120b20blgchoqae.R.iget(3000)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(3001)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(3002);throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        }__CLR4_4_120b20blgchoqae.R.inc(3003);if ((((isSupported(fieldType) == false)&&(__CLR4_4_120b20blgchoqae.R.iget(3004)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(3005)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(3006);throw new IllegalArgumentException("Field '" + fieldType + "' is not supported");
        }
        }__CLR4_4_120b20blgchoqae.R.inc(3007);return new Property(this, fieldType.getField(getChronology()));
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the era field value.
     *
     * @return the era
     */
    public int getEra() {try{__CLR4_4_120b20blgchoqae.R.inc(3008);
        __CLR4_4_120b20blgchoqae.R.inc(3009);return getChronology().era().get(getLocalMillis());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Get the year of era field value.
     *
     * @return the year of era
     */
    public int getCenturyOfEra() {try{__CLR4_4_120b20blgchoqae.R.inc(3010);
        __CLR4_4_120b20blgchoqae.R.inc(3011);return getChronology().centuryOfEra().get(getLocalMillis());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Get the year of era field value.
     *
     * @return the year of era
     */
    public int getYearOfEra() {try{__CLR4_4_120b20blgchoqae.R.inc(3012);
        __CLR4_4_120b20blgchoqae.R.inc(3013);return getChronology().yearOfEra().get(getLocalMillis());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Get the year of century field value.
     *
     * @return the year of century
     */
    public int getYearOfCentury() {try{__CLR4_4_120b20blgchoqae.R.inc(3014);
        __CLR4_4_120b20blgchoqae.R.inc(3015);return getChronology().yearOfCentury().get(getLocalMillis());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Get the year field value.
     *
     * @return the year
     */
    public int getYear() {try{__CLR4_4_120b20blgchoqae.R.inc(3016);
        __CLR4_4_120b20blgchoqae.R.inc(3017);return getChronology().year().get(getLocalMillis());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Get the weekyear field value.
     * <p>
     * The weekyear is the year that matches with the weekOfWeekyear field.
     * In the standard ISO8601 week algorithm, the first week of the year
     * is that in which at least 4 days are in the year. As a result of this
     * definition, day 1 of the first week may be in the previous year.
     * The weekyear allows you to query the effective year for that day.
     *
     * @return the weekyear
     */
    public int getWeekyear() {try{__CLR4_4_120b20blgchoqae.R.inc(3018);
        __CLR4_4_120b20blgchoqae.R.inc(3019);return getChronology().weekyear().get(getLocalMillis());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Get the month of year field value.
     *
     * @return the month of year
     */
    public int getMonthOfYear() {try{__CLR4_4_120b20blgchoqae.R.inc(3020);
        __CLR4_4_120b20blgchoqae.R.inc(3021);return getChronology().monthOfYear().get(getLocalMillis());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Get the week of weekyear field value.
     * <p>
     * This field is associated with the "weekyear" via {@link #getWeekyear()}.
     * In the standard ISO8601 week algorithm, the first week of the year
     * is that in which at least 4 days are in the year. As a result of this
     * definition, day 1 of the first week may be in the previous year.
     *
     * @return the week of a week based year
     */
    public int getWeekOfWeekyear() {try{__CLR4_4_120b20blgchoqae.R.inc(3022);
        __CLR4_4_120b20blgchoqae.R.inc(3023);return getChronology().weekOfWeekyear().get(getLocalMillis());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Get the day of year field value.
     *
     * @return the day of year
     */
    public int getDayOfYear() {try{__CLR4_4_120b20blgchoqae.R.inc(3024);
        __CLR4_4_120b20blgchoqae.R.inc(3025);return getChronology().dayOfYear().get(getLocalMillis());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Get the day of month field value.
     * <p>
     * The values for the day of month are defined in {@link org.joda.time.DateTimeConstants}.
     *
     * @return the day of month
     */
    public int getDayOfMonth() {try{__CLR4_4_120b20blgchoqae.R.inc(3026);
        __CLR4_4_120b20blgchoqae.R.inc(3027);return getChronology().dayOfMonth().get(getLocalMillis());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Get the day of week field value.
     * <p>
     * The values for the day of week are defined in {@link org.joda.time.DateTimeConstants}.
     *
     * @return the day of week
     */
    public int getDayOfWeek() {try{__CLR4_4_120b20blgchoqae.R.inc(3028);
        __CLR4_4_120b20blgchoqae.R.inc(3029);return getChronology().dayOfWeek().get(getLocalMillis());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this date with the era field updated.
     * <p>
     * LocalDate is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * era changed.
     *
     * @param era the era to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDate withEra(int era) {try{__CLR4_4_120b20blgchoqae.R.inc(3030);
        __CLR4_4_120b20blgchoqae.R.inc(3031);return withLocalMillis(getChronology().era().set(getLocalMillis(), era));
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the century of era field updated.
     * <p>
     * LocalDate is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * century of era changed.
     *
     * @param centuryOfEra the century of era to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDate withCenturyOfEra(int centuryOfEra) {try{__CLR4_4_120b20blgchoqae.R.inc(3032);
        __CLR4_4_120b20blgchoqae.R.inc(3033);return withLocalMillis(getChronology().centuryOfEra().set(getLocalMillis(), centuryOfEra));
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the year of era field updated.
     * <p>
     * LocalDate is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * year of era changed.
     *
     * @param yearOfEra the year of era to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDate withYearOfEra(int yearOfEra) {try{__CLR4_4_120b20blgchoqae.R.inc(3034);
        __CLR4_4_120b20blgchoqae.R.inc(3035);return withLocalMillis(getChronology().yearOfEra().set(getLocalMillis(), yearOfEra));
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the year of century field updated.
     * <p>
     * LocalDate is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * year of century changed.
     *
     * @param yearOfCentury the year of century to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDate withYearOfCentury(int yearOfCentury) {try{__CLR4_4_120b20blgchoqae.R.inc(3036);
        __CLR4_4_120b20blgchoqae.R.inc(3037);return withLocalMillis(getChronology().yearOfCentury().set(getLocalMillis(), yearOfCentury));
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the year field updated.
     * <p>
     * LocalDate is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * year changed.
     *
     * @param year the year to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDate withYear(int year) {try{__CLR4_4_120b20blgchoqae.R.inc(3038);
        __CLR4_4_120b20blgchoqae.R.inc(3039);return withLocalMillis(getChronology().year().set(getLocalMillis(), year));
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the weekyear field updated.
     * <p>
     * The weekyear is the year that matches with the weekOfWeekyear field.
     * In the standard ISO8601 week algorithm, the first week of the year
     * is that in which at least 4 days are in the year. As a result of this
     * definition, day 1 of the first week may be in the previous year.
     * The weekyear allows you to query the effective year for that day.
     * <p>
     * LocalDate is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * weekyear changed.
     *
     * @param weekyear the weekyear to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDate withWeekyear(int weekyear) {try{__CLR4_4_120b20blgchoqae.R.inc(3040);
        __CLR4_4_120b20blgchoqae.R.inc(3041);return withLocalMillis(getChronology().weekyear().set(getLocalMillis(), weekyear));
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the month of year field updated.
     * <p>
     * LocalDate is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * month of year changed.
     *
     * @param monthOfYear the month of year to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDate withMonthOfYear(int monthOfYear) {try{__CLR4_4_120b20blgchoqae.R.inc(3042);
        __CLR4_4_120b20blgchoqae.R.inc(3043);return withLocalMillis(getChronology().monthOfYear().set(getLocalMillis(), monthOfYear));
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the week of weekyear field updated.
     * <p>
     * This field is associated with the "weekyear" via {@link #withWeekyear(int)}.
     * In the standard ISO8601 week algorithm, the first week of the year
     * is that in which at least 4 days are in the year. As a result of this
     * definition, day 1 of the first week may be in the previous year.
     * <p>
     * LocalDate is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * week of weekyear changed.
     *
     * @param weekOfWeekyear the week of weekyear to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDate withWeekOfWeekyear(int weekOfWeekyear) {try{__CLR4_4_120b20blgchoqae.R.inc(3044);
        __CLR4_4_120b20blgchoqae.R.inc(3045);return withLocalMillis(getChronology().weekOfWeekyear().set(getLocalMillis(), weekOfWeekyear));
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the day of year field updated.
     * <p>
     * LocalDate is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * day of year changed.
     *
     * @param dayOfYear the day of year to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDate withDayOfYear(int dayOfYear) {try{__CLR4_4_120b20blgchoqae.R.inc(3046);
        __CLR4_4_120b20blgchoqae.R.inc(3047);return withLocalMillis(getChronology().dayOfYear().set(getLocalMillis(), dayOfYear));
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the day of month field updated.
     * <p>
     * LocalDate is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * day of month changed.
     *
     * @param dayOfMonth the day of month to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDate withDayOfMonth(int dayOfMonth) {try{__CLR4_4_120b20blgchoqae.R.inc(3048);
        __CLR4_4_120b20blgchoqae.R.inc(3049);return withLocalMillis(getChronology().dayOfMonth().set(getLocalMillis(), dayOfMonth));
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the day of week field updated.
     * <p>
     * LocalDate is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * day of week changed.
     *
     * @param dayOfWeek the day of week to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDate withDayOfWeek(int dayOfWeek) {try{__CLR4_4_120b20blgchoqae.R.inc(3050);
        __CLR4_4_120b20blgchoqae.R.inc(3051);return withLocalMillis(getChronology().dayOfWeek().set(getLocalMillis(), dayOfWeek));
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the era property which provides access to advanced functionality.
     *
     * @return the era property
     */
    public Property era() {try{__CLR4_4_120b20blgchoqae.R.inc(3052);
        __CLR4_4_120b20blgchoqae.R.inc(3053);return new Property(this, getChronology().era());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Get the century of era property which provides access to advanced functionality.
     *
     * @return the year of era property
     */
    public Property centuryOfEra() {try{__CLR4_4_120b20blgchoqae.R.inc(3054);
        __CLR4_4_120b20blgchoqae.R.inc(3055);return new Property(this, getChronology().centuryOfEra());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Get the year of century property which provides access to advanced functionality.
     *
     * @return the year of era property
     */
    public Property yearOfCentury() {try{__CLR4_4_120b20blgchoqae.R.inc(3056);
        __CLR4_4_120b20blgchoqae.R.inc(3057);return new Property(this, getChronology().yearOfCentury());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Get the year of era property which provides access to advanced functionality.
     *
     * @return the year of era property
     */
    public Property yearOfEra() {try{__CLR4_4_120b20blgchoqae.R.inc(3058);
        __CLR4_4_120b20blgchoqae.R.inc(3059);return new Property(this, getChronology().yearOfEra());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Get the year property which provides access to advanced functionality.
     *
     * @return the year property
     */
    public Property year() {try{__CLR4_4_120b20blgchoqae.R.inc(3060);
        __CLR4_4_120b20blgchoqae.R.inc(3061);return new Property(this, getChronology().year());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Get the weekyear property which provides access to advanced functionality.
     *
     * @return the weekyear property
     */
    public Property weekyear() {try{__CLR4_4_120b20blgchoqae.R.inc(3062);
        __CLR4_4_120b20blgchoqae.R.inc(3063);return new Property(this, getChronology().weekyear());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Get the month of year property which provides access to advanced functionality.
     *
     * @return the month of year property
     */
    public Property monthOfYear() {try{__CLR4_4_120b20blgchoqae.R.inc(3064);
        __CLR4_4_120b20blgchoqae.R.inc(3065);return new Property(this, getChronology().monthOfYear());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Get the week of a week based year property which provides access to advanced functionality.
     *
     * @return the week of a week based year property
     */
    public Property weekOfWeekyear() {try{__CLR4_4_120b20blgchoqae.R.inc(3066);
        __CLR4_4_120b20blgchoqae.R.inc(3067);return new Property(this, getChronology().weekOfWeekyear());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Get the day of year property which provides access to advanced functionality.
     *
     * @return the day of year property
     */
    public Property dayOfYear() {try{__CLR4_4_120b20blgchoqae.R.inc(3068);
        __CLR4_4_120b20blgchoqae.R.inc(3069);return new Property(this, getChronology().dayOfYear());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Get the day of month property which provides access to advanced functionality.
     *
     * @return the day of month property
     */
    public Property dayOfMonth() {try{__CLR4_4_120b20blgchoqae.R.inc(3070);
        __CLR4_4_120b20blgchoqae.R.inc(3071);return new Property(this, getChronology().dayOfMonth());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Get the day of week property which provides access to advanced functionality.
     *
     * @return the day of week property
     */
    public Property dayOfWeek() {try{__CLR4_4_120b20blgchoqae.R.inc(3072);
        __CLR4_4_120b20blgchoqae.R.inc(3073);return new Property(this, getChronology().dayOfWeek());
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Output the date time in ISO8601 format (yyyy-MM-dd).
     *
     * @return ISO8601 time formatted string.
     */
    @ToString
    public String toString() {try{__CLR4_4_120b20blgchoqae.R.inc(3074);
        __CLR4_4_120b20blgchoqae.R.inc(3075);return ISODateTimeFormat.date().print(this);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Output the date using the specified format pattern.
     *
     * @param pattern the pattern specification, null means use <code>toString</code>
     * @see org.joda.time.format.DateTimeFormat
     */
    public String toString(String pattern) {try{__CLR4_4_120b20blgchoqae.R.inc(3076);
        __CLR4_4_120b20blgchoqae.R.inc(3077);if ((((pattern == null)&&(__CLR4_4_120b20blgchoqae.R.iget(3078)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(3079)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(3080);return toString();
        }
        }__CLR4_4_120b20blgchoqae.R.inc(3081);return DateTimeFormat.forPattern(pattern).print(this);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    /**
     * Output the date using the specified format pattern.
     *
     * @param pattern the pattern specification, null means use <code>toString</code>
     * @param locale  Locale to use, null means default
     * @see org.joda.time.format.DateTimeFormat
     */
    public String toString(String pattern, Locale locale) throws IllegalArgumentException {try{__CLR4_4_120b20blgchoqae.R.inc(3082);
        __CLR4_4_120b20blgchoqae.R.inc(3083);if ((((pattern == null)&&(__CLR4_4_120b20blgchoqae.R.iget(3084)!=0|true))||(__CLR4_4_120b20blgchoqae.R.iget(3085)==0&false))) {{
            __CLR4_4_120b20blgchoqae.R.inc(3086);return toString();
        }
        }__CLR4_4_120b20blgchoqae.R.inc(3087);return DateTimeFormat.forPattern(pattern).withLocale(locale).print(this);
    }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * LocalDate.Property binds a LocalDate to a DateTimeField allowing
     * powerful datetime functionality to be easily accessed.
     * <p>
     * The simplest use of this class is as an alternative get method, here used to
     * get the year '1972' (as an int) and the month 'December' (as a String).
     * <pre>
     * LocalDate dt = new LocalDate(1972, 12, 3, 0, 0);
     * int year = dt.year().get();
     * String monthStr = dt.month().getAsText();
     * </pre>
     * <p>
     * Methods are also provided that allow date modification. These return
     * new instances of LocalDate - they do not modify the original. The example
     * below yields two independent immutable date objects 20 years apart.
     * <pre>
     * LocalDate dt = new LocalDate(1972, 12, 3);
     * LocalDate dt1920 = dt.year().setCopy(1920);
     * </pre>
     * <p>
     * LocalDate.Property itself is thread-safe and immutable, as well as the
     * LocalDate being operated on.
     *
     * @author Stephen Colebourne
     * @author Brian S O'Neill
     * @since 1.3
     */
    public static final class Property extends AbstractReadableInstantFieldProperty {

        /**
         * Serialization version
         */
        private static final long serialVersionUID = -3193829732634L;

        /**
         * The instant this property is working against
         */
        private transient LocalDate iInstant;
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
        Property(LocalDate instant, DateTimeField field) {
            super();__CLR4_4_120b20blgchoqae.R.inc(3089);try{__CLR4_4_120b20blgchoqae.R.inc(3088);
            __CLR4_4_120b20blgchoqae.R.inc(3090);iInstant = instant;
            __CLR4_4_120b20blgchoqae.R.inc(3091);iField = field;
        }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

        /**
         * Writes the property in a safe serialization format.
         */
        private void writeObject(ObjectOutputStream oos) throws IOException {try{__CLR4_4_120b20blgchoqae.R.inc(3092);
            __CLR4_4_120b20blgchoqae.R.inc(3093);oos.writeObject(iInstant);
            __CLR4_4_120b20blgchoqae.R.inc(3094);oos.writeObject(iField.getType());
        }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

        /**
         * Reads the property from a safe serialization format.
         */
        private void readObject(ObjectInputStream oos) throws IOException, ClassNotFoundException {try{__CLR4_4_120b20blgchoqae.R.inc(3095);
            __CLR4_4_120b20blgchoqae.R.inc(3096);iInstant = (LocalDate) oos.readObject();
            __CLR4_4_120b20blgchoqae.R.inc(3097);DateTimeFieldType type = (DateTimeFieldType) oos.readObject();
            __CLR4_4_120b20blgchoqae.R.inc(3098);iField = type.getField(iInstant.getChronology());
        }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Gets the field being used.
         *
         * @return the field
         */
        public DateTimeField getField() {try{__CLR4_4_120b20blgchoqae.R.inc(3099);
            __CLR4_4_120b20blgchoqae.R.inc(3100);return iField;
        }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

        /**
         * Gets the milliseconds of the date that this property is linked to.
         *
         * @return the milliseconds
         */
        protected long getMillis() {try{__CLR4_4_120b20blgchoqae.R.inc(3101);
            __CLR4_4_120b20blgchoqae.R.inc(3102);return iInstant.getLocalMillis();
        }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

        /**
         * Gets the chronology of the datetime that this property is linked to.
         *
         * @return the chronology
         * @since 1.4
         */
        protected Chronology getChronology() {try{__CLR4_4_120b20blgchoqae.R.inc(3103);
            __CLR4_4_120b20blgchoqae.R.inc(3104);return iInstant.getChronology();
        }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

        /**
         * Gets the LocalDate object linked to this property.
         *
         * @return the linked LocalDate
         */
        public LocalDate getLocalDate() {try{__CLR4_4_120b20blgchoqae.R.inc(3105);
            __CLR4_4_120b20blgchoqae.R.inc(3106);return iInstant;
        }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Adds to this field in a copy of this LocalDate.
         * <p>
         * The LocalDate attached to this property is unchanged by this call.
         *
         * @param value the value to add to the field in the copy
         * @return a copy of the LocalDate with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public LocalDate addToCopy(int value) {try{__CLR4_4_120b20blgchoqae.R.inc(3107);
            __CLR4_4_120b20blgchoqae.R.inc(3108);return iInstant.withLocalMillis(iField.add(iInstant.getLocalMillis(), value));
        }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

        /**
         * Adds to this field, possibly wrapped, in a copy of this LocalDate.
         * A field wrapped operation only changes this field.
         * Thus 31st January addWrapField one day goes to the 1st January.
         * <p>
         * The LocalDate attached to this property is unchanged by this call.
         *
         * @param value the value to add to the field in the copy
         * @return a copy of the LocalDate with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public LocalDate addWrapFieldToCopy(int value) {try{__CLR4_4_120b20blgchoqae.R.inc(3109);
            __CLR4_4_120b20blgchoqae.R.inc(3110);return iInstant.withLocalMillis(iField.addWrapField(iInstant.getLocalMillis(), value));
        }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Sets this field in a copy of the LocalDate.
         * <p>
         * The LocalDate attached to this property is unchanged by this call.
         *
         * @param value the value to set the field in the copy to
         * @return a copy of the LocalDate with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public LocalDate setCopy(int value) {try{__CLR4_4_120b20blgchoqae.R.inc(3111);
            __CLR4_4_120b20blgchoqae.R.inc(3112);return iInstant.withLocalMillis(iField.set(iInstant.getLocalMillis(), value));
        }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

        /**
         * Sets this field in a copy of the LocalDate to a parsed text value.
         * <p>
         * The LocalDate attached to this property is unchanged by this call.
         *
         * @param text   the text value to set
         * @param locale optional locale to use for selecting a text symbol
         * @return a copy of the LocalDate with the field value changed
         * @throws IllegalArgumentException if the text value isn't valid
         */
        public LocalDate setCopy(String text, Locale locale) {try{__CLR4_4_120b20blgchoqae.R.inc(3113);
            __CLR4_4_120b20blgchoqae.R.inc(3114);return iInstant.withLocalMillis(iField.set(iInstant.getLocalMillis(), text, locale));
        }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

        /**
         * Sets this field in a copy of the LocalDate to a parsed text value.
         * <p>
         * The LocalDate attached to this property is unchanged by this call.
         *
         * @param text the text value to set
         * @return a copy of the LocalDate with the field value changed
         * @throws IllegalArgumentException if the text value isn't valid
         */
        public LocalDate setCopy(String text) {try{__CLR4_4_120b20blgchoqae.R.inc(3115);
            __CLR4_4_120b20blgchoqae.R.inc(3116);return setCopy(text, null);
        }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Returns a new LocalDate with this field set to the maximum value
         * for this field.
         * <p>
         * This operation is useful for obtaining a LocalDate on the last day
         * of the month, as month lengths vary.
         * <pre>
         * LocalDate lastDayOfMonth = dt.dayOfMonth().withMaximumValue();
         * </pre>
         * <p>
         * The LocalDate attached to this property is unchanged by this call.
         *
         * @return a copy of the LocalDate with this field set to its maximum
         */
        public LocalDate withMaximumValue() {try{__CLR4_4_120b20blgchoqae.R.inc(3117);
            __CLR4_4_120b20blgchoqae.R.inc(3118);return setCopy(getMaximumValue());
        }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

        /**
         * Returns a new LocalDate with this field set to the minimum value
         * for this field.
         * <p>
         * The LocalDate attached to this property is unchanged by this call.
         *
         * @return a copy of the LocalDate with this field set to its minimum
         */
        public LocalDate withMinimumValue() {try{__CLR4_4_120b20blgchoqae.R.inc(3119);
            __CLR4_4_120b20blgchoqae.R.inc(3120);return setCopy(getMinimumValue());
        }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Rounds to the lowest whole unit of this field on a copy of this
         * LocalDate.
         * <p>
         * For example, rounding floor on the hourOfDay field of a LocalDate
         * where the time is 10:30 would result in new LocalDate with the
         * time of 10:00.
         *
         * @return a copy of the LocalDate with the field value changed
         */
        public LocalDate roundFloorCopy() {try{__CLR4_4_120b20blgchoqae.R.inc(3121);
            __CLR4_4_120b20blgchoqae.R.inc(3122);return iInstant.withLocalMillis(iField.roundFloor(iInstant.getLocalMillis()));
        }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

        /**
         * Rounds to the highest whole unit of this field on a copy of this
         * LocalDate.
         * <p>
         * For example, rounding floor on the hourOfDay field of a LocalDate
         * where the time is 10:30 would result in new LocalDate with the
         * time of 11:00.
         *
         * @return a copy of the LocalDate with the field value changed
         */
        public LocalDate roundCeilingCopy() {try{__CLR4_4_120b20blgchoqae.R.inc(3123);
            __CLR4_4_120b20blgchoqae.R.inc(3124);return iInstant.withLocalMillis(iField.roundCeiling(iInstant.getLocalMillis()));
        }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

        /**
         * Rounds to the nearest whole unit of this field on a copy of this
         * LocalDate, favoring the floor if halfway.
         *
         * @return a copy of the LocalDate with the field value changed
         */
        public LocalDate roundHalfFloorCopy() {try{__CLR4_4_120b20blgchoqae.R.inc(3125);
            __CLR4_4_120b20blgchoqae.R.inc(3126);return iInstant.withLocalMillis(iField.roundHalfFloor(iInstant.getLocalMillis()));
        }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

        /**
         * Rounds to the nearest whole unit of this field on a copy of this
         * LocalDate, favoring the ceiling if halfway.
         *
         * @return a copy of the LocalDate with the field value changed
         */
        public LocalDate roundHalfCeilingCopy() {try{__CLR4_4_120b20blgchoqae.R.inc(3127);
            __CLR4_4_120b20blgchoqae.R.inc(3128);return iInstant.withLocalMillis(iField.roundHalfCeiling(iInstant.getLocalMillis()));
        }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}

        /**
         * Rounds to the nearest whole unit of this field on a copy of this
         * LocalDate.  If halfway, the ceiling is favored over the floor
         * only if it makes this field's value even.
         *
         * @return a copy of the LocalDate with the field value changed
         */
        public LocalDate roundHalfEvenCopy() {try{__CLR4_4_120b20blgchoqae.R.inc(3129);
            __CLR4_4_120b20blgchoqae.R.inc(3130);return iInstant.withLocalMillis(iField.roundHalfEven(iInstant.getLocalMillis()));
        }finally{__CLR4_4_120b20blgchoqae.R.flushNeeded();}}
    }

}
