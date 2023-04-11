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
package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Locale;

import org.joda.convert.FromString;
import org.joda.time.base.BaseDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * MutableDateTime is the standard implementation of a modifiable datetime class.
 * It holds the datetime as milliseconds from the Java epoch of 1970-01-01T00:00:00Z.
 * <p>
 * This class uses a Chronology internally. The Chronology determines how the
 * millisecond instant value is converted into the date time fields.
 * The default Chronology is <code>ISOChronology</code> which is the agreed
 * international standard and compatible with the modern Gregorian calendar.
 * <p>
 * Each individual field can be accessed in two ways:
 * <ul>
 * <li><code>getHourOfDay()</code>
 * <li><code>hourOfDay().get()</code>
 * </ul>
 * The second technique also provides access to other useful methods on the
 * field:
 * <ul>
 * <li>get numeric value
 * <li>set numeric value
 * <li>add to numeric value
 * <li>add to numeric value wrapping with the field
 * <li>get text value
 * <li>get short text value
 * <li>set text value
 * <li>field maximum value
 * <li>field minimum value
 * </ul>
 *
 * <p>
 * MutableDateTime is mutable and not thread-safe, unless concurrent threads
 * are not invoking mutator methods.
 *
 * @author Guy Allard
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @author Mike Schrag
 * @see DateTime
 * @since 1.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class MutableDateTime
        extends BaseDateTime
        implements ReadWritableDateTime, Cloneable, Serializable {public static class __CLR4_4_13hm3hmlgchoqeu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,4870,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization version
     */
    private static final long serialVersionUID = 2852608688135209575L;

    /**
     * Rounding is disabled
     */
    public static final int ROUND_NONE = 0;
    /**
     * Rounding mode as described by {@link DateTimeField#roundFloor}
     */
    public static final int ROUND_FLOOR = 1;
    /**
     * Rounding mode as described by {@link DateTimeField#roundCeiling}
     */
    public static final int ROUND_CEILING = 2;
    /**
     * Rounding mode as described by {@link DateTimeField#roundHalfFloor}
     */
    public static final int ROUND_HALF_FLOOR = 3;
    /**
     * Rounding mode as described by {@link DateTimeField#roundHalfCeiling}
     */
    public static final int ROUND_HALF_CEILING = 4;
    /**
     * Rounding mode as described by {@link DateTimeField#roundHalfEven}
     */
    public static final int ROUND_HALF_EVEN = 5;

    /**
     * The field to round on
     */
    private DateTimeField iRoundingField;
    /**
     * The mode of rounding
     */
    private int iRoundingMode;

    //-----------------------------------------------------------------------

    /**
     * Obtains a {@code MutableDateTime} set to the current system millisecond time
     * using <code>ISOChronology</code> in the default time zone.
     *
     * @return the current date-time, not null
     * @since 2.0
     */
    public static MutableDateTime now() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4522);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4523);return new MutableDateTime();
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Obtains a {@code MutableDateTime} set to the current system millisecond time
     * using <code>ISOChronology</code> in the specified time zone.
     *
     * @param zone the time zone, not null
     * @return the current date-time, not null
     * @since 2.0
     */
    public static MutableDateTime now(DateTimeZone zone) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4524);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4525);if ((((zone == null)&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4526)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4527)==0&false))) {{
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4528);throw new NullPointerException("Zone must not be null");
        }
        }__CLR4_4_13hm3hmlgchoqeu.R.inc(4529);return new MutableDateTime(zone);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Obtains a {@code MutableDateTime} set to the current system millisecond time
     * using the specified chronology.
     *
     * @param chronology the chronology, not null
     * @return the current date-time, not null
     * @since 2.0
     */
    public static MutableDateTime now(Chronology chronology) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4530);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4531);if ((((chronology == null)&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4532)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4533)==0&false))) {{
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4534);throw new NullPointerException("Chronology must not be null");
        }
        }__CLR4_4_13hm3hmlgchoqeu.R.inc(4535);return new MutableDateTime(chronology);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Parses a {@code MutableDateTime} from the specified string.
     * <p>
     * This uses {@link ISODateTimeFormat#dateTimeParser()}.
     *
     * @param str the string to parse, not null
     * @since 2.0
     */
    @FromString
    public static MutableDateTime parse(String str) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4536);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4537);return parse(str, ISODateTimeFormat.dateTimeParser().withOffsetParsed());
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Parses a {@code MutableDateTime} from the specified string using a formatter.
     *
     * @param str       the string to parse, not null
     * @param formatter the formatter to use, not null
     * @since 2.0
     */
    public static MutableDateTime parse(String str, DateTimeFormatter formatter) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4538);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4539);return formatter.parseDateTime(str).toMutableDateTime();
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs an instance set to the current system millisecond time
     * using <code>ISOChronology</code> in the default time zone.
     *
     * @see #now()
     */
    public MutableDateTime() {
        super();__CLR4_4_13hm3hmlgchoqeu.R.inc(4541);try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4540);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Constructs an instance set to the current system millisecond time
     * using <code>ISOChronology</code> in the specified time zone.
     * <p>
     * If the specified time zone is null, the default zone is used.
     *
     * @param zone the time zone, null means default zone
     * @see #now(DateTimeZone)
     */
    public MutableDateTime(DateTimeZone zone) {
        super(zone);__CLR4_4_13hm3hmlgchoqeu.R.inc(4543);try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4542);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Constructs an instance set to the current system millisecond time
     * using the specified chronology.
     * <p>
     * If the chronology is null, <code>ISOChronology</code>
     * in the default time zone is used.
     *
     * @param chronology the chronology, null means ISOChronology in default zone
     * @see #now(Chronology)
     */
    public MutableDateTime(Chronology chronology) {
        super(chronology);__CLR4_4_13hm3hmlgchoqeu.R.inc(4545);try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4544);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs an instance set to the milliseconds from 1970-01-01T00:00:00Z
     * using <code>ISOChronology</code> in the default time zone.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z
     */
    public MutableDateTime(long instant) {
        super(instant);__CLR4_4_13hm3hmlgchoqeu.R.inc(4547);try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4546);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Constructs an instance set to the milliseconds from 1970-01-01T00:00:00Z
     * using <code>ISOChronology</code> in the specified time zone.
     * <p>
     * If the specified time zone is null, the default zone is used.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z
     * @param zone    the time zone, null means default zone
     */
    public MutableDateTime(long instant, DateTimeZone zone) {
        super(instant, zone);__CLR4_4_13hm3hmlgchoqeu.R.inc(4549);try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4548);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Constructs an instance set to the milliseconds from 1970-01-01T00:00:00Z
     * using the specified chronology.
     * <p>
     * If the chronology is null, <code>ISOChronology</code>
     * in the default time zone is used.
     *
     * @param instant    the milliseconds from 1970-01-01T00:00:00Z
     * @param chronology the chronology, null means ISOChronology in default zone
     */
    public MutableDateTime(long instant, Chronology chronology) {
        super(instant, chronology);__CLR4_4_13hm3hmlgchoqeu.R.inc(4551);try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4550);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs an instance from an Object that represents a datetime.
     * <p>
     * If the object implies a chronology (such as GregorianCalendar does),
     * then that chronology will be used. Otherwise, ISO default is used.
     * Thus if a GregorianCalendar is passed in, the chronology used will
     * be GJ, but if a Date is passed in the chronology will be ISO.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadableInstant, String, Calendar and Date.
     *
     * @param instant the datetime object, null means now
     * @throws IllegalArgumentException if the instant is invalid
     */
    public MutableDateTime(Object instant) {
        super(instant, (Chronology) null);__CLR4_4_13hm3hmlgchoqeu.R.inc(4553);try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4552);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Constructs an instance from an Object that represents a datetime,
     * forcing the time zone to that specified.
     * <p>
     * If the object implies a chronology (such as GregorianCalendar does),
     * then that chronology will be used, but with the time zone adjusted.
     * Otherwise, ISO is used in the specified time zone.
     * If the specified time zone is null, the default zone is used.
     * Thus if a GregorianCalendar is passed in, the chronology used will
     * be GJ, but if a Date is passed in the chronology will be ISO.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadableInstant, String, Calendar and Date.
     *
     * @param instant the datetime object, null means now
     * @param zone    the time zone, null means default time zone
     * @throws IllegalArgumentException if the instant is invalid
     */
    public MutableDateTime(Object instant, DateTimeZone zone) {
        super(instant, zone);__CLR4_4_13hm3hmlgchoqeu.R.inc(4555);try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4554);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Constructs an instance from an Object that represents a datetime,
     * using the specified chronology.
     * <p>
     * If the chronology is null, ISO in the default time zone is used.
     * Any chronology implied by the object (such as GregorianCalendar does)
     * is ignored.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadableInstant, String, Calendar and Date.
     *
     * @param instant    the datetime object, null means now
     * @param chronology the chronology, null means ISOChronology in default zone
     * @throws IllegalArgumentException if the instant is invalid
     */
    public MutableDateTime(Object instant, Chronology chronology) {
        super(instant, DateTimeUtils.getChronology(chronology));__CLR4_4_13hm3hmlgchoqeu.R.inc(4557);try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4556);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs an instance from datetime field values
     * using <code>ISOChronology</code> in the default time zone.
     *
     * @param year           the year
     * @param monthOfYear    the month of the year
     * @param dayOfMonth     the day of the month
     * @param hourOfDay      the hour of the day
     * @param minuteOfHour   the minute of the hour
     * @param secondOfMinute the second of the minute
     * @param millisOfSecond the millisecond of the second
     */
    public MutableDateTime(
            int year,
            int monthOfYear,
            int dayOfMonth,
            int hourOfDay,
            int minuteOfHour,
            int secondOfMinute,
            int millisOfSecond) {
        super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);__CLR4_4_13hm3hmlgchoqeu.R.inc(4559);try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4558);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Constructs an instance from datetime field values
     * using <code>ISOChronology</code> in the specified time zone.
     * <p>
     * If the specified time zone is null, the default zone is used.
     *
     * @param year           the year
     * @param monthOfYear    the month of the year
     * @param dayOfMonth     the day of the month
     * @param hourOfDay      the hour of the day
     * @param minuteOfHour   the minute of the hour
     * @param secondOfMinute the second of the minute
     * @param millisOfSecond the millisecond of the second
     * @param zone           the time zone, null means default time zone
     */
    public MutableDateTime(
            int year,
            int monthOfYear,
            int dayOfMonth,
            int hourOfDay,
            int minuteOfHour,
            int secondOfMinute,
            int millisOfSecond,
            DateTimeZone zone) {
        super(year, monthOfYear, dayOfMonth,
                hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, zone);__CLR4_4_13hm3hmlgchoqeu.R.inc(4561);try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4560);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Constructs an instance from datetime field values
     * using the specified chronology.
     * <p>
     * If the chronology is null, <code>ISOChronology</code>
     * in the default time zone is used.
     *
     * @param year           the year
     * @param monthOfYear    the month of the year
     * @param dayOfMonth     the day of the month
     * @param hourOfDay      the hour of the day
     * @param minuteOfHour   the minute of the hour
     * @param secondOfMinute the second of the minute
     * @param millisOfSecond the millisecond of the second
     * @param chronology     the chronology, null means ISOChronology in default zone
     */
    public MutableDateTime(
            int year,
            int monthOfYear,
            int dayOfMonth,
            int hourOfDay,
            int minuteOfHour,
            int secondOfMinute,
            int millisOfSecond,
            Chronology chronology) {
        super(year, monthOfYear, dayOfMonth,
                hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, chronology);__CLR4_4_13hm3hmlgchoqeu.R.inc(4563);try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4562);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the field used for rounding this instant, returning null if rounding
     * is not enabled.
     *
     * @return the rounding field
     */
    public DateTimeField getRoundingField() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4564);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4565);return iRoundingField;
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Gets the rounding mode for this instant, returning ROUND_NONE if rounding
     * is not enabled.
     *
     * @return the rounding mode constant
     */
    public int getRoundingMode() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4566);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4567);return iRoundingMode;
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Sets the status of rounding to use the specified field and ROUND_FLOOR mode.
     * A null field will disable rounding.
     * Once set, the instant is then rounded using the new field and mode.
     * <p>
     * Enabling rounding will cause all subsequent calls to {@link #setMillis(long)}
     * to be rounded. This can be used to control the precision of the instant,
     * for example by setting a rounding field of minuteOfDay, the seconds and
     * milliseconds will always be zero.
     *
     * @param field rounding field or null to disable
     */
    public void setRounding(DateTimeField field) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4568);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4569);setRounding(field, MutableDateTime.ROUND_FLOOR);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Sets the status of rounding to use the specified field and mode.
     * A null field or mode of ROUND_NONE will disable rounding.
     * Once set, the instant is then rounded using the new field and mode.
     * <p>
     * Enabling rounding will cause all subsequent calls to {@link #setMillis(long)}
     * to be rounded. This can be used to control the precision of the instant,
     * for example by setting a rounding field of minuteOfDay, the seconds and
     * milliseconds will always be zero.
     *
     * @param field rounding field or null to disable
     * @param mode  rounding mode or ROUND_NONE to disable
     * @throws IllegalArgumentException if mode is unknown, no exception if field is null
     */
    public void setRounding(DateTimeField field, int mode) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4570);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4571);if ((((field != null && (mode < ROUND_NONE || mode > ROUND_HALF_EVEN))&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4572)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4573)==0&false))) {{
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4574);throw new IllegalArgumentException("Illegal rounding mode: " + mode);
        }
        }__CLR4_4_13hm3hmlgchoqeu.R.inc(4575);iRoundingField = ((((mode == ROUND_NONE )&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4576)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4577)==0&false))? null : field);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4578);iRoundingMode = ((((field == null )&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4579)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4580)==0&false))? ROUND_NONE : mode);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4581);setMillis(getMillis());
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Set the milliseconds of the datetime.
     * <p>
     * All changes to the millisecond field occurs via this method.
     *
     * @param instant the milliseconds since 1970-01-01T00:00:00Z to set the
     *                datetime to
     */
    public void setMillis(long instant) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4582);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_13hm3hmlgchoqeu.R.inc(4583);switch (iRoundingMode) {
            case ROUND_NONE:if (!__CLB4_4_1_bool0) {__CLR4_4_13hm3hmlgchoqeu.R.inc(4584);__CLB4_4_1_bool0=true;}
                __CLR4_4_13hm3hmlgchoqeu.R.inc(4585);break;
            case ROUND_FLOOR:if (!__CLB4_4_1_bool0) {__CLR4_4_13hm3hmlgchoqeu.R.inc(4586);__CLB4_4_1_bool0=true;}
                __CLR4_4_13hm3hmlgchoqeu.R.inc(4587);instant = iRoundingField.roundFloor(instant);
                __CLR4_4_13hm3hmlgchoqeu.R.inc(4588);break;
            case ROUND_CEILING:if (!__CLB4_4_1_bool0) {__CLR4_4_13hm3hmlgchoqeu.R.inc(4589);__CLB4_4_1_bool0=true;}
                __CLR4_4_13hm3hmlgchoqeu.R.inc(4590);instant = iRoundingField.roundCeiling(instant);
                __CLR4_4_13hm3hmlgchoqeu.R.inc(4591);break;
            case ROUND_HALF_FLOOR:if (!__CLB4_4_1_bool0) {__CLR4_4_13hm3hmlgchoqeu.R.inc(4592);__CLB4_4_1_bool0=true;}
                __CLR4_4_13hm3hmlgchoqeu.R.inc(4593);instant = iRoundingField.roundHalfFloor(instant);
                __CLR4_4_13hm3hmlgchoqeu.R.inc(4594);break;
            case ROUND_HALF_CEILING:if (!__CLB4_4_1_bool0) {__CLR4_4_13hm3hmlgchoqeu.R.inc(4595);__CLB4_4_1_bool0=true;}
                __CLR4_4_13hm3hmlgchoqeu.R.inc(4596);instant = iRoundingField.roundHalfCeiling(instant);
                __CLR4_4_13hm3hmlgchoqeu.R.inc(4597);break;
            case ROUND_HALF_EVEN:if (!__CLB4_4_1_bool0) {__CLR4_4_13hm3hmlgchoqeu.R.inc(4598);__CLB4_4_1_bool0=true;}
                __CLR4_4_13hm3hmlgchoqeu.R.inc(4599);instant = iRoundingField.roundHalfEven(instant);
                __CLR4_4_13hm3hmlgchoqeu.R.inc(4600);break;
        }
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4601);super.setMillis(instant);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Sets the millisecond instant of this instant from another.
     * <p>
     * This method does not change the chronology of this instant, just the
     * millisecond instant.
     *
     * @param instant the instant to use, null means now
     */
    public void setMillis(ReadableInstant instant) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4602);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4603);long instantMillis = DateTimeUtils.getInstantMillis(instant);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4604);setMillis(instantMillis);  // set via this class not super
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Add an amount of time to the datetime.
     *
     * @param duration the millis to add
     * @throws ArithmeticException if the result exceeds the capacity of the instant
     */
    public void add(long duration) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4605);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4606);setMillis(FieldUtils.safeAdd(getMillis(), duration));  // set via this class not super
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Adds a duration to this instant.
     * <p>
     * This will typically change the value of most fields.
     *
     * @param duration the duration to add, null means add zero
     * @throws ArithmeticException if the result exceeds the capacity of the instant
     */
    public void add(ReadableDuration duration) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4607);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4608);add(duration, 1);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Adds a duration to this instant specifying how many times to add.
     * <p>
     * This will typically change the value of most fields.
     *
     * @param duration the duration to add, null means add zero
     * @param scalar   direction and amount to add, which may be negative
     * @throws ArithmeticException if the result exceeds the capacity of the instant
     */
    public void add(ReadableDuration duration, int scalar) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4609);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4610);if ((((duration != null)&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4611)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4612)==0&false))) {{
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4613);add(FieldUtils.safeMultiply(duration.getMillis(), scalar));
        }
    }}finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Adds a period to this instant.
     * <p>
     * This will typically change the value of most fields.
     *
     * @param period the period to add, null means add zero
     * @throws ArithmeticException if the result exceeds the capacity of the instant
     */
    public void add(ReadablePeriod period) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4614);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4615);add(period, 1);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Adds a period to this instant specifying how many times to add.
     * <p>
     * This will typically change the value of most fields.
     *
     * @param period the period to add, null means add zero
     * @param scalar direction and amount to add, which may be negative
     * @throws ArithmeticException if the result exceeds the capacity of the instant
     */
    public void add(ReadablePeriod period, int scalar) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4616);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4617);if ((((period != null)&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4618)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4619)==0&false))) {{
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4620);setMillis(getChronology().add(period, getMillis(), scalar));  // set via this class not super
        }
    }}finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Set the chronology of the datetime.
     * <p>
     * All changes to the chronology occur via this method.
     *
     * @param chronology the chronology to use, null means ISOChronology in default zone
     */
    public void setChronology(Chronology chronology) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4621);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4622);super.setChronology(chronology);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Sets the time zone of the datetime, changing the chronology and field values.
     * <p>
     * Changing the zone using this method retains the millisecond instant.
     * The millisecond instant is adjusted in the new zone to compensate.
     * <p>
     * chronology. Setting the time zone does not affect the millisecond value
     * of this instant.
     * <p>
     * If the chronology already has this time zone, no change occurs.
     *
     * @param newZone the time zone to use, null means default zone
     * @see #setZoneRetainFields
     */
    public void setZone(DateTimeZone newZone) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4623);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4624);newZone = DateTimeUtils.getZone(newZone);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4625);Chronology chrono = getChronology();
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4626);if ((((chrono.getZone() != newZone)&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4627)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4628)==0&false))) {{
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4629);setChronology(chrono.withZone(newZone));  // set via this class not super
        }
    }}finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Sets the time zone of the datetime, changing the chronology and millisecond.
     * <p>
     * Changing the zone using this method retains the field values.
     * The millisecond instant is adjusted in the new zone to compensate.
     * <p>
     * If the chronology already has this time zone, no change occurs.
     *
     * @param newZone the time zone to use, null means default zone
     * @see #setZone
     */
    public void setZoneRetainFields(DateTimeZone newZone) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4630);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4631);newZone = DateTimeUtils.getZone(newZone);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4632);DateTimeZone originalZone = DateTimeUtils.getZone(getZone());
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4633);if ((((newZone == originalZone)&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4634)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4635)==0&false))) {{
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4636);return;
        }

        }__CLR4_4_13hm3hmlgchoqeu.R.inc(4637);long millis = originalZone.getMillisKeepLocal(newZone, getMillis());
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4638);setChronology(getChronology().withZone(newZone));  // set via this class not super
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4639);setMillis(millis);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Sets the value of one of the fields of the instant, such as hourOfDay.
     *
     * @param type  a field type, usually obtained from DateTimeFieldType, not null
     * @param value the value to set the field to
     * @throws IllegalArgumentException if the value is null or invalid
     */
    public void set(DateTimeFieldType type, int value) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4640);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4641);if ((((type == null)&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4642)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4643)==0&false))) {{
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4644);throw new IllegalArgumentException("Field must not be null");
        }
        }__CLR4_4_13hm3hmlgchoqeu.R.inc(4645);setMillis(type.getField(getChronology()).set(getMillis(), value));
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Adds to the instant specifying the duration and multiple to add.
     *
     * @param type   a field type, usually obtained from DateTimeFieldType, not null
     * @param amount the amount to add of this duration
     * @throws IllegalArgumentException if the value is null or invalid
     * @throws ArithmeticException      if the result exceeds the capacity of the instant
     */
    public void add(DurationFieldType type, int amount) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4646);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4647);if ((((type == null)&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4648)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4649)==0&false))) {{
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4650);throw new IllegalArgumentException("Field must not be null");
        }
        }__CLR4_4_13hm3hmlgchoqeu.R.inc(4651);if ((((amount != 0)&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4652)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4653)==0&false))) {{
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4654);setMillis(type.getField(getChronology()).add(getMillis(), amount));
        }
    }}finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Set the year to the specified value.
     *
     * @param year the year
     * @throws IllegalArgumentException if the value is invalid
     */
    public void setYear(final int year) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4655);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4656);setMillis(getChronology().year().set(getMillis(), year));
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Add a number of years to the date.
     *
     * @param years the years to add
     * @throws IllegalArgumentException if the value is invalid
     */
    public void addYears(final int years) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4657);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4658);if ((((years != 0)&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4659)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4660)==0&false))) {{
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4661);setMillis(getChronology().years().add(getMillis(), years));
        }
    }}finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Set the weekyear to the specified value.
     *
     * @param weekyear the weekyear
     * @throws IllegalArgumentException if the value is invalid
     */
    public void setWeekyear(final int weekyear) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4662);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4663);setMillis(getChronology().weekyear().set(getMillis(), weekyear));
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Add a number of weekyears to the date.
     *
     * @param weekyears the weekyears to add
     * @throws IllegalArgumentException if the value is invalid
     */
    public void addWeekyears(final int weekyears) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4664);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4665);if ((((weekyears != 0)&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4666)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4667)==0&false))) {{
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4668);setMillis(getChronology().weekyears().add(getMillis(), weekyears));
        }
    }}finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Set the month of the year to the specified value.
     *
     * @param monthOfYear the month of the year
     * @throws IllegalArgumentException if the value is invalid
     */
    public void setMonthOfYear(final int monthOfYear) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4669);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4670);setMillis(getChronology().monthOfYear().set(getMillis(), monthOfYear));
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Add a number of months to the date.
     *
     * @param months the months to add
     * @throws IllegalArgumentException if the value is invalid
     */
    public void addMonths(final int months) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4671);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4672);if ((((months != 0)&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4673)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4674)==0&false))) {{
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4675);setMillis(getChronology().months().add(getMillis(), months));
        }
    }}finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Set the week of weekyear to the specified value.
     *
     * @param weekOfWeekyear the week of the weekyear
     * @throws IllegalArgumentException if the value is invalid
     */
    public void setWeekOfWeekyear(final int weekOfWeekyear) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4676);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4677);setMillis(getChronology().weekOfWeekyear().set(getMillis(), weekOfWeekyear));
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Add a number of weeks to the date.
     *
     * @param weeks the weeks to add
     * @throws IllegalArgumentException if the value is invalid
     */
    public void addWeeks(final int weeks) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4678);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4679);if ((((weeks != 0)&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4680)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4681)==0&false))) {{
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4682);setMillis(getChronology().weeks().add(getMillis(), weeks));
        }
    }}finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Set the day of year to the specified value.
     *
     * @param dayOfYear the day of the year
     * @throws IllegalArgumentException if the value is invalid
     */
    public void setDayOfYear(final int dayOfYear) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4683);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4684);setMillis(getChronology().dayOfYear().set(getMillis(), dayOfYear));
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Set the day of the month to the specified value.
     *
     * @param dayOfMonth the day of the month
     * @throws IllegalArgumentException if the value is invalid
     */
    public void setDayOfMonth(final int dayOfMonth) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4685);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4686);setMillis(getChronology().dayOfMonth().set(getMillis(), dayOfMonth));
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Set the day of week to the specified value.
     *
     * @param dayOfWeek the day of the week
     * @throws IllegalArgumentException if the value is invalid
     */
    public void setDayOfWeek(final int dayOfWeek) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4687);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4688);setMillis(getChronology().dayOfWeek().set(getMillis(), dayOfWeek));
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Add a number of days to the date.
     *
     * @param days the days to add
     * @throws IllegalArgumentException if the value is invalid
     */
    public void addDays(final int days) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4689);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4690);if ((((days != 0)&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4691)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4692)==0&false))) {{
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4693);setMillis(getChronology().days().add(getMillis(), days));
        }
    }}finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Set the hour of the day to the specified value.
     *
     * @param hourOfDay the hour of day
     * @throws IllegalArgumentException if the value is invalid
     */
    public void setHourOfDay(final int hourOfDay) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4694);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4695);setMillis(getChronology().hourOfDay().set(getMillis(), hourOfDay));
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Add a number of hours to the date.
     *
     * @param hours the hours to add
     * @throws IllegalArgumentException if the value is invalid
     */
    public void addHours(final int hours) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4696);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4697);if ((((hours != 0)&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4698)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4699)==0&false))) {{
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4700);setMillis(getChronology().hours().add(getMillis(), hours));
        }
    }}finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Set the minute of the day to the specified value.
     * <p>
     * Setting this will replace the values of minute-of-hour and hour-of-day.
     *
     * @param minuteOfDay the minute of day
     * @throws IllegalArgumentException if the value is invalid
     */
    public void setMinuteOfDay(final int minuteOfDay) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4701);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4702);setMillis(getChronology().minuteOfDay().set(getMillis(), minuteOfDay));
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Set the minute of the hour to the specified value.
     *
     * @param minuteOfHour the minute of hour
     * @throws IllegalArgumentException if the value is invalid
     */
    public void setMinuteOfHour(final int minuteOfHour) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4703);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4704);setMillis(getChronology().minuteOfHour().set(getMillis(), minuteOfHour));
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Add a number of minutes to the date.
     *
     * @param minutes the minutes to add
     * @throws IllegalArgumentException if the value is invalid
     */
    public void addMinutes(final int minutes) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4705);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4706);if ((((minutes != 0)&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4707)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4708)==0&false))) {{
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4709);setMillis(getChronology().minutes().add(getMillis(), minutes));
        }
    }}finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Set the second of the day to the specified value.
     * <p>
     * Setting this will replace the values of second-of-minute, minute-of-hour and hour-of-day.
     *
     * @param secondOfDay the second of day
     * @throws IllegalArgumentException if the value is invalid
     */
    public void setSecondOfDay(final int secondOfDay) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4710);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4711);setMillis(getChronology().secondOfDay().set(getMillis(), secondOfDay));
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Set the second of the minute to the specified value.
     *
     * @param secondOfMinute the second of minute
     * @throws IllegalArgumentException if the value is invalid
     */
    public void setSecondOfMinute(final int secondOfMinute) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4712);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4713);setMillis(getChronology().secondOfMinute().set(getMillis(), secondOfMinute));
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Add a number of seconds to the date.
     *
     * @param seconds the seconds to add
     * @throws IllegalArgumentException if the value is invalid
     */
    public void addSeconds(final int seconds) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4714);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4715);if ((((seconds != 0)&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4716)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4717)==0&false))) {{
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4718);setMillis(getChronology().seconds().add(getMillis(), seconds));
        }
    }}finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Set the millis of the day to the specified value.
     * <p>
     * Setting this will replace the values of milli-of-second, second-of-minute, minute-of-hour and hour-of-day.
     *
     * @param millisOfDay the millis of day
     * @throws IllegalArgumentException if the value is invalid
     */
    public void setMillisOfDay(final int millisOfDay) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4719);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4720);setMillis(getChronology().millisOfDay().set(getMillis(), millisOfDay));
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Set the millis of the second to the specified value.
     *
     * @param millisOfSecond the millis of second
     * @throws IllegalArgumentException if the value is invalid
     */
    public void setMillisOfSecond(final int millisOfSecond) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4721);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4722);setMillis(getChronology().millisOfSecond().set(getMillis(), millisOfSecond));
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Add a number of milliseconds to the date. The implementation of this
     * method differs from the {@link #add(long)} method in that a
     * DateTimeField performs the addition.
     *
     * @param millis the milliseconds to add
     * @throws IllegalArgumentException if the value is invalid
     */
    public void addMillis(final int millis) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4723);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4724);if ((((millis != 0)&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4725)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4726)==0&false))) {{
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4727);setMillis(getChronology().millis().add(getMillis(), millis));
        }
    }}finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Set the date from milliseconds.
     * The time part of this object will be unaffected.
     *
     * @param instant an instant to copy the date from, time part ignored
     * @throws IllegalArgumentException if the value is invalid
     */
    public void setDate(final long instant) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4728);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4729);setMillis(getChronology().millisOfDay().set(instant, getMillisOfDay()));
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Set the date from another instant.
     * The time part of this object will be unaffected.
     * <p>
     * If the input is a {@code ReadableDateTime} then it is converted to the
     * same time-zone as this object before using the instant millis.
     *
     * @param instant an instant to copy the date from, time part ignored
     * @throws IllegalArgumentException if the object is invalid
     */
    public void setDate(final ReadableInstant instant) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4730);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4731);long instantMillis = DateTimeUtils.getInstantMillis(instant);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4732);if ((((instant instanceof ReadableDateTime)&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4733)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4734)==0&false))) {{
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4735);ReadableDateTime rdt = (ReadableDateTime) instant;
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4736);Chronology instantChrono = DateTimeUtils.getChronology(rdt.getChronology());
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4737);DateTimeZone zone = instantChrono.getZone();
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4738);if ((((zone != null)&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4739)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4740)==0&false))) {{
                __CLR4_4_13hm3hmlgchoqeu.R.inc(4741);instantMillis = zone.getMillisKeepLocal(getZone(), instantMillis);
            }
        }}
        }__CLR4_4_13hm3hmlgchoqeu.R.inc(4742);setDate(instantMillis);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Set the date from fields.
     * The time part of this object will be unaffected.
     *
     * @param year        the year
     * @param monthOfYear the month of the year
     * @param dayOfMonth  the day of the month
     * @throws IllegalArgumentException if the value is invalid
     */
    public void setDate(
            final int year,
            final int monthOfYear,
            final int dayOfMonth) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4743);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4744);Chronology c = getChronology();
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4745);long instantMidnight = c.getDateTimeMillis(year, monthOfYear, dayOfMonth, 0);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4746);setDate(instantMidnight);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Set the time from milliseconds.
     * The date part of this object will be unaffected.
     *
     * @param millis an instant to copy the time from, date part ignored
     * @throws IllegalArgumentException if the value is invalid
     */
    public void setTime(final long millis) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4747);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4748);int millisOfDay = ISOChronology.getInstanceUTC().millisOfDay().get(millis);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4749);setMillis(getChronology().millisOfDay().set(getMillis(), millisOfDay));
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Set the time from another instant.
     * The date part of this object will be unaffected.
     *
     * @param instant an instant to copy the time from, date part ignored
     * @throws IllegalArgumentException if the object is invalid
     */
    public void setTime(final ReadableInstant instant) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4750);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4751);long instantMillis = DateTimeUtils.getInstantMillis(instant);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4752);Chronology instantChrono = DateTimeUtils.getInstantChronology(instant);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4753);DateTimeZone zone = instantChrono.getZone();
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4754);if ((((zone != null)&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4755)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4756)==0&false))) {{
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4757);instantMillis = zone.getMillisKeepLocal(DateTimeZone.UTC, instantMillis);
        }
        }__CLR4_4_13hm3hmlgchoqeu.R.inc(4758);setTime(instantMillis);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Set the time from fields.
     * The date part of this object will be unaffected.
     *
     * @param hour           the hour
     * @param minuteOfHour   the minute of the hour
     * @param secondOfMinute the second of the minute
     * @param millisOfSecond the millisecond of the second
     * @throws IllegalArgumentException if the value is invalid
     */
    public void setTime(
            final int hour,
            final int minuteOfHour,
            final int secondOfMinute,
            final int millisOfSecond) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4759);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4760);long instant = getChronology().getDateTimeMillis(
                getMillis(), hour, minuteOfHour, secondOfMinute, millisOfSecond);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4761);setMillis(instant);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Set the date and time from fields.
     *
     * @param year           the year
     * @param monthOfYear    the month of the year
     * @param dayOfMonth     the day of the month
     * @param hourOfDay      the hour of the day
     * @param minuteOfHour   the minute of the hour
     * @param secondOfMinute the second of the minute
     * @param millisOfSecond the millisecond of the second
     * @throws IllegalArgumentException if the value is invalid
     */
    public void setDateTime(
            final int year,
            final int monthOfYear,
            final int dayOfMonth,
            final int hourOfDay,
            final int minuteOfHour,
            final int secondOfMinute,
            final int millisOfSecond) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4762);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4763);long instant = getChronology().getDateTimeMillis(
                year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4764);setMillis(instant);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the property object for the specified type, which contains many useful methods.
     *
     * @param type the field type to get the chronology for
     * @return the property object
     * @throws IllegalArgumentException if the field is null or unsupported
     * @since 1.2
     */
    public Property property(DateTimeFieldType type) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4765);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4766);if ((((type == null)&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4767)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4768)==0&false))) {{
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4769);throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        }__CLR4_4_13hm3hmlgchoqeu.R.inc(4770);DateTimeField field = type.getField(getChronology());
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4771);if ((((field.isSupported() == false)&&(__CLR4_4_13hm3hmlgchoqeu.R.iget(4772)!=0|true))||(__CLR4_4_13hm3hmlgchoqeu.R.iget(4773)==0&false))) {{
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4774);throw new IllegalArgumentException("Field '" + type + "' is not supported");
        }
        }__CLR4_4_13hm3hmlgchoqeu.R.inc(4775);return new Property(this, field);
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Get the era property.
     *
     * @return the era property
     */
    public Property era() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4776);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4777);return new Property(this, getChronology().era());
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Get the century of era property.
     *
     * @return the year of era property
     */
    public Property centuryOfEra() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4778);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4779);return new Property(this, getChronology().centuryOfEra());
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Get the year of century property.
     *
     * @return the year of era property
     */
    public Property yearOfCentury() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4780);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4781);return new Property(this, getChronology().yearOfCentury());
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Get the year of era property.
     *
     * @return the year of era property
     */
    public Property yearOfEra() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4782);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4783);return new Property(this, getChronology().yearOfEra());
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Get the year property.
     *
     * @return the year property
     */
    public Property year() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4784);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4785);return new Property(this, getChronology().year());
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Get the year of a week based year property.
     *
     * @return the year of a week based year property
     */
    public Property weekyear() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4786);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4787);return new Property(this, getChronology().weekyear());
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Get the month of year property.
     *
     * @return the month of year property
     */
    public Property monthOfYear() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4788);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4789);return new Property(this, getChronology().monthOfYear());
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Get the week of a week based year property.
     *
     * @return the week of a week based year property
     */
    public Property weekOfWeekyear() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4790);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4791);return new Property(this, getChronology().weekOfWeekyear());
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Get the day of year property.
     *
     * @return the day of year property
     */
    public Property dayOfYear() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4792);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4793);return new Property(this, getChronology().dayOfYear());
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Get the day of month property.
     * <p>
     * The values for day of month are defined in {@link DateTimeConstants}.
     *
     * @return the day of month property
     */
    public Property dayOfMonth() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4794);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4795);return new Property(this, getChronology().dayOfMonth());
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Get the day of week property.
     * <p>
     * The values for day of week are defined in {@link DateTimeConstants}.
     *
     * @return the day of week property
     */
    public Property dayOfWeek() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4796);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4797);return new Property(this, getChronology().dayOfWeek());
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the hour of day field property
     *
     * @return the hour of day property
     */
    public Property hourOfDay() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4798);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4799);return new Property(this, getChronology().hourOfDay());
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Get the minute of day property
     * <p>
     * Calling a setter on the property will replace the values of
     * minute-of-hour and hour-of-day.
     *
     * @return the minute of day property
     */
    public Property minuteOfDay() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4800);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4801);return new Property(this, getChronology().minuteOfDay());
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Get the minute of hour field property
     *
     * @return the minute of hour property
     */
    public Property minuteOfHour() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4802);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4803);return new Property(this, getChronology().minuteOfHour());
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Get the second of day property
     * <p>
     * Calling a setter on the property will replace the values of
     * second-of-minute, minute-of-hour and hour-of-day.
     *
     * @return the second of day property
     */
    public Property secondOfDay() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4804);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4805);return new Property(this, getChronology().secondOfDay());
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Get the second of minute field property
     *
     * @return the second of minute property
     */
    public Property secondOfMinute() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4806);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4807);return new Property(this, getChronology().secondOfMinute());
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Get the millis of day property
     * <p>
     * Calling a setter on the property will replace the values of
     * milli-of-second, second-of-minute, minute-of-hour and hour-of-day.
     *
     * @return the millis of day property
     */
    public Property millisOfDay() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4808);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4809);return new Property(this, getChronology().millisOfDay());
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * Get the millis of second property
     *
     * @return the millis of second property
     */
    public Property millisOfSecond() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4810);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4811);return new Property(this, getChronology().millisOfSecond());
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Clone this object without having to cast the returned object.
     *
     * @return a clone of the this object.
     */
    public MutableDateTime copy() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4812);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4813);return (MutableDateTime) clone();
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Clone this object.
     *
     * @return a clone of this object.
     */
    public Object clone() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4814);
        __CLR4_4_13hm3hmlgchoqeu.R.inc(4815);try {
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4816);return super.clone();
        } catch (CloneNotSupportedException ex) {
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4817);throw new InternalError("Clone error");
        }
    }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

    /**
     * MutableDateTime.Property binds a MutableDateTime to a
     * DateTimeField allowing powerful datetime functionality to be easily
     * accessed.
     * <p>
     * The example below shows how to use the property to change the value of a
     * MutableDateTime object.
     * <pre>
     * MutableDateTime dt = new MutableDateTime(1972, 12, 3, 13, 32, 19, 123);
     * dt.year().add(20);
     * dt.second().roundFloor().minute().set(10);
     * </pre>
     * <p>
     * MutableDateTime.Propery itself is thread-safe and immutable, but the
     * MutableDateTime being operated on is not.
     *
     * @author Stephen Colebourne
     * @author Brian S O'Neill
     * @since 1.0
     */
    public static final class Property extends AbstractReadableInstantFieldProperty {

        /**
         * Serialization version
         */
        private static final long serialVersionUID = -4481126543819298617L;

        /**
         * The instant this property is working against
         */
        private MutableDateTime iInstant;
        /**
         * The field this property is working against
         */
        private DateTimeField iField;

        /**
         * Constructor.
         *
         * @param instant the instant to set
         * @param field   the field to use
         */
        Property(MutableDateTime instant, DateTimeField field) {
            super();__CLR4_4_13hm3hmlgchoqeu.R.inc(4819);try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4818);
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4820);iInstant = instant;
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4821);iField = field;
        }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

        /**
         * Writes the property in a safe serialization format.
         */
        private void writeObject(ObjectOutputStream oos) throws IOException {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4822);
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4823);oos.writeObject(iInstant);
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4824);oos.writeObject(iField.getType());
        }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

        /**
         * Reads the property from a safe serialization format.
         */
        private void readObject(ObjectInputStream oos) throws IOException, ClassNotFoundException {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4825);
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4826);iInstant = (MutableDateTime) oos.readObject();
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4827);DateTimeFieldType type = (DateTimeFieldType) oos.readObject();
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4828);iField = type.getField(iInstant.getChronology());
        }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Gets the field being used.
         *
         * @return the field
         */
        public DateTimeField getField() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4829);
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4830);return iField;
        }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

        /**
         * Gets the milliseconds of the datetime that this property is linked to.
         *
         * @return the milliseconds
         */
        protected long getMillis() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4831);
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4832);return iInstant.getMillis();
        }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

        /**
         * Gets the chronology of the datetime that this property is linked to.
         *
         * @return the chronology
         * @since 1.4
         */
        protected Chronology getChronology() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4833);
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4834);return iInstant.getChronology();
        }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

        /**
         * Gets the mutable datetime being used.
         *
         * @return the mutable datetime
         */
        public MutableDateTime getMutableDateTime() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4835);
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4836);return iInstant;
        }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Adds a value to the millis value.
         *
         * @param value the value to add
         * @return the mutable datetime being used, so calls can be chained
         * @see DateTimeField#add(long, int)
         */
        public MutableDateTime add(int value) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4837);
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4838);iInstant.setMillis(getField().add(iInstant.getMillis(), value));
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4839);return iInstant;
        }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

        /**
         * Adds a value to the millis value.
         *
         * @param value the value to add
         * @return the mutable datetime being used, so calls can be chained
         * @see DateTimeField#add(long, long)
         */
        public MutableDateTime add(long value) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4840);
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4841);iInstant.setMillis(getField().add(iInstant.getMillis(), value));
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4842);return iInstant;
        }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

        /**
         * Adds a value, possibly wrapped, to the millis value.
         *
         * @param value the value to add
         * @return the mutable datetime being used, so calls can be chained
         * @see DateTimeField#addWrapField
         */
        public MutableDateTime addWrapField(int value) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4843);
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4844);iInstant.setMillis(getField().addWrapField(iInstant.getMillis(), value));
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4845);return iInstant;
        }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Sets a value.
         *
         * @param value the value to set.
         * @return the mutable datetime being used, so calls can be chained
         * @see DateTimeField#set(long, int)
         */
        public MutableDateTime set(int value) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4846);
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4847);iInstant.setMillis(getField().set(iInstant.getMillis(), value));
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4848);return iInstant;
        }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

        /**
         * Sets a text value.
         *
         * @param text   the text value to set
         * @param locale optional locale to use for selecting a text symbol
         * @return the mutable datetime being used, so calls can be chained
         * @throws IllegalArgumentException if the text value isn't valid
         * @see DateTimeField#set(long, java.lang.String, java.util.Locale)
         */
        public MutableDateTime set(String text, Locale locale) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4849);
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4850);iInstant.setMillis(getField().set(iInstant.getMillis(), text, locale));
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4851);return iInstant;
        }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

        /**
         * Sets a text value.
         *
         * @param text the text value to set
         * @return the mutable datetime being used, so calls can be chained
         * @throws IllegalArgumentException if the text value isn't valid
         * @see DateTimeField#set(long, java.lang.String)
         */
        public MutableDateTime set(String text) {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4852);
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4853);set(text, null);
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4854);return iInstant;
        }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Round to the lowest whole unit of this field.
         *
         * @return the mutable datetime being used, so calls can be chained
         * @see DateTimeField#roundFloor
         */
        public MutableDateTime roundFloor() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4855);
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4856);iInstant.setMillis(getField().roundFloor(iInstant.getMillis()));
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4857);return iInstant;
        }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

        /**
         * Round to the highest whole unit of this field.
         *
         * @return the mutable datetime being used, so calls can be chained
         * @see DateTimeField#roundCeiling
         */
        public MutableDateTime roundCeiling() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4858);
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4859);iInstant.setMillis(getField().roundCeiling(iInstant.getMillis()));
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4860);return iInstant;
        }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

        /**
         * Round to the nearest whole unit of this field, favoring the floor if
         * halfway.
         *
         * @return the mutable datetime being used, so calls can be chained
         * @see DateTimeField#roundHalfFloor
         */
        public MutableDateTime roundHalfFloor() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4861);
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4862);iInstant.setMillis(getField().roundHalfFloor(iInstant.getMillis()));
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4863);return iInstant;
        }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

        /**
         * Round to the nearest whole unit of this field, favoring the ceiling if
         * halfway.
         *
         * @return the mutable datetime being used, so calls can be chained
         * @see DateTimeField#roundHalfCeiling
         */
        public MutableDateTime roundHalfCeiling() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4864);
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4865);iInstant.setMillis(getField().roundHalfCeiling(iInstant.getMillis()));
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4866);return iInstant;
        }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}

        /**
         * Round to the nearest whole unit of this field. If halfway, the ceiling
         * is favored over the floor only if it makes this field's value even.
         *
         * @return the mutable datetime being used, so calls can be chained
         * @see DateTimeField#roundHalfEven
         */
        public MutableDateTime roundHalfEven() {try{__CLR4_4_13hm3hmlgchoqeu.R.inc(4867);
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4868);iInstant.setMillis(getField().roundHalfEven(iInstant.getMillis()));
            __CLR4_4_13hm3hmlgchoqeu.R.inc(4869);return iInstant;
        }finally{__CLR4_4_13hm3hmlgchoqeu.R.flushNeeded();}}
    }

}
