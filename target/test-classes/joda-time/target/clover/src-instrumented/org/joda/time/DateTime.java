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
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * DateTime is the standard implementation of an unmodifiable datetime class.
 * <p>
 * <code>DateTime</code> is the most widely used implementation of
 * {@link ReadableInstant}. As with all instants, it represents an exact
 * point on the time-line, but limited to the precision of milliseconds.
 * A <code>DateTime</code> calculates its fields with respect to a
 * {@link DateTimeZone time zone}.
 * <p>
 * Internally, the class holds two pieces of data. Firstly, it holds the
 * datetime as milliseconds from the Java epoch of 1970-01-01T00:00:00Z.
 * Secondly, it holds a {@link Chronology} which determines how the
 * millisecond instant value is converted into the date time fields.
 * The default Chronology is {@link ISOChronology} which is the agreed
 * international standard and compatible with the modern Gregorian calendar.
 * <p>
 * Each individual field can be queried in two ways:
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
 * <p>
 * DateTime is thread-safe and immutable, provided that the Chronology is as well.
 * All standard Chronology classes supplied are thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @author Kandarp Shah
 * @author Brian S O'Neill
 * @see MutableDateTime
 * @since 1.0
 */
public final class DateTime
        extends BaseDateTime
        implements ReadableDateTime, Serializable {public static class __CLR4_4_17w7wlgchoq4g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,718,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization lock
     */
    private static final long serialVersionUID = -5171125899451703815L;

    //-----------------------------------------------------------------------

    /**
     * Obtains a {@code DateTime} set to the current system millisecond time
     * using <code>ISOChronology</code> in the default time zone.
     *
     * @return the current date-time, not null
     * @since 2.0
     */
    public static DateTime now() {try{__CLR4_4_17w7wlgchoq4g.R.inc(284);
        __CLR4_4_17w7wlgchoq4g.R.inc(285);return new DateTime();
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Obtains a {@code DateTime} set to the current system millisecond time
     * using <code>ISOChronology</code> in the specified time zone.
     *
     * @param zone the time zone, not null
     * @return the current date-time, not null
     * @since 2.0
     */
    public static DateTime now(DateTimeZone zone) {try{__CLR4_4_17w7wlgchoq4g.R.inc(286);
        __CLR4_4_17w7wlgchoq4g.R.inc(287);if ((((zone == null)&&(__CLR4_4_17w7wlgchoq4g.R.iget(288)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(289)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(290);throw new NullPointerException("Zone must not be null");
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(291);return new DateTime(zone);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Obtains a {@code DateTime} set to the current system millisecond time
     * using the specified chronology.
     *
     * @param chronology the chronology, not null
     * @return the current date-time, not null
     * @since 2.0
     */
    public static DateTime now(Chronology chronology) {try{__CLR4_4_17w7wlgchoq4g.R.inc(292);
        __CLR4_4_17w7wlgchoq4g.R.inc(293);if ((((chronology == null)&&(__CLR4_4_17w7wlgchoq4g.R.iget(294)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(295)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(296);throw new NullPointerException("Chronology must not be null");
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(297);return new DateTime(chronology);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Parses a {@code DateTime} from the specified string.
     * <p>
     * This uses {@link ISODateTimeFormat#dateTimeParser()}{@code .withOffsetParsed()}
     * which is different to passing a {@code String} to the constructor.
     * <p>
     * Sometimes this method and {@code new DateTime(str)} return different results.
     * This can be confusing as the difference is not visible in {@link #toString()}.
     * <p>
     * When passed a date-time string without an offset, such as '2010-06-30T01:20',
     * both the constructor and this method use the default time-zone.
     * As such, {@code DateTime.parse("2010-06-30T01:20")} and
     * {@code new DateTime("2010-06-30T01:20"))} are equal.
     * <p>
     * However, when this method is passed a date-time string with an offset,
     * the offset is directly parsed and stored.
     * As such, {@code DateTime.parse("2010-06-30T01:20+02:00")} and
     * {@code new DateTime("2010-06-30T01:20+02:00"))} are NOT equal.
     * The object produced via this method has a zone of {@code DateTimeZone.forOffsetHours(2)}.
     * The object produced via the constructor has a zone of {@code DateTimeZone.getDefault()}.
     *
     * @param str the string to parse, not null
     * @since 2.0
     */
    @FromString
    public static DateTime parse(String str) {try{__CLR4_4_17w7wlgchoq4g.R.inc(298);
        __CLR4_4_17w7wlgchoq4g.R.inc(299);return parse(str, ISODateTimeFormat.dateTimeParser().withOffsetParsed());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Parses a {@code DateTime} from the specified string using a formatter.
     *
     * @param str       the string to parse, not null
     * @param formatter the formatter to use, not null
     * @since 2.0
     */
    public static DateTime parse(String str, DateTimeFormatter formatter) {try{__CLR4_4_17w7wlgchoq4g.R.inc(300);
        __CLR4_4_17w7wlgchoq4g.R.inc(301);return formatter.parseDateTime(str);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs an instance set to the current system millisecond time
     * using <code>ISOChronology</code> in the default time zone.
     *
     * @see #now()
     */
    public DateTime() {
        super();__CLR4_4_17w7wlgchoq4g.R.inc(303);try{__CLR4_4_17w7wlgchoq4g.R.inc(302);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Constructs an instance set to the current system millisecond time
     * using <code>ISOChronology</code> in the specified time zone.
     * <p>
     * If the specified time zone is null, the default zone is used.
     *
     * @param zone the time zone, null means default zone
     * @see #now(DateTimeZone)
     */
    public DateTime(DateTimeZone zone) {
        super(zone);__CLR4_4_17w7wlgchoq4g.R.inc(305);try{__CLR4_4_17w7wlgchoq4g.R.inc(304);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

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
    public DateTime(Chronology chronology) {
        super(chronology);__CLR4_4_17w7wlgchoq4g.R.inc(307);try{__CLR4_4_17w7wlgchoq4g.R.inc(306);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs an instance set to the milliseconds from 1970-01-01T00:00:00Z
     * using <code>ISOChronology</code> in the default time zone.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z
     */
    public DateTime(long instant) {
        super(instant);__CLR4_4_17w7wlgchoq4g.R.inc(309);try{__CLR4_4_17w7wlgchoq4g.R.inc(308);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Constructs an instance set to the milliseconds from 1970-01-01T00:00:00Z
     * using <code>ISOChronology</code> in the specified time zone.
     * <p>
     * If the specified time zone is null, the default zone is used.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z
     * @param zone    the time zone, null means default zone
     */
    public DateTime(long instant, DateTimeZone zone) {
        super(instant, zone);__CLR4_4_17w7wlgchoq4g.R.inc(311);try{__CLR4_4_17w7wlgchoq4g.R.inc(310);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

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
    public DateTime(long instant, Chronology chronology) {
        super(instant, chronology);__CLR4_4_17w7wlgchoq4g.R.inc(313);try{__CLR4_4_17w7wlgchoq4g.R.inc(312);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

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
     * The String formats are described by {@link ISODateTimeFormat#dateTimeParser()}.
     *
     * @param instant the datetime object, null means now
     * @throws IllegalArgumentException if the instant is invalid
     */
    public DateTime(Object instant) {
        super(instant, (Chronology) null);__CLR4_4_17w7wlgchoq4g.R.inc(315);try{__CLR4_4_17w7wlgchoq4g.R.inc(314);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

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
     * The String formats are described by {@link ISODateTimeFormat#dateTimeParser()}.
     *
     * @param instant the datetime object, null means now
     * @param zone    the time zone, null means default time zone
     * @throws IllegalArgumentException if the instant is invalid
     */
    public DateTime(Object instant, DateTimeZone zone) {
        super(instant, zone);__CLR4_4_17w7wlgchoq4g.R.inc(317);try{__CLR4_4_17w7wlgchoq4g.R.inc(316);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

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
     * The String formats are described by {@link ISODateTimeFormat#dateTimeParser()}.
     *
     * @param instant    the datetime object, null means now
     * @param chronology the chronology, null means ISO in default zone
     * @throws IllegalArgumentException if the instant is invalid
     */
    public DateTime(Object instant, Chronology chronology) {
        super(instant, DateTimeUtils.getChronology(chronology));__CLR4_4_17w7wlgchoq4g.R.inc(319);try{__CLR4_4_17w7wlgchoq4g.R.inc(318);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs an instance from datetime field values
     * using <code>ISOChronology</code> in the default time zone.
     *
     * @param year         the year
     * @param monthOfYear  the month of the year, from 1 to 12
     * @param dayOfMonth   the day of the month, from 1 to 31
     * @param hourOfDay    the hour of the day, from 0 to 23
     * @param minuteOfHour the minute of the hour, from 0 to 59
     * @since 2.0
     */
    public DateTime(
            int year,
            int monthOfYear,
            int dayOfMonth,
            int hourOfDay,
            int minuteOfHour) {
        super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, 0, 0);__CLR4_4_17w7wlgchoq4g.R.inc(321);try{__CLR4_4_17w7wlgchoq4g.R.inc(320);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Constructs an instance from datetime field values
     * using <code>ISOChronology</code> in the specified time zone.
     * <p>
     * If the specified time zone is null, the default zone is used.
     *
     * @param year         the year
     * @param monthOfYear  the month of the year, from 1 to 12
     * @param dayOfMonth   the day of the month, from 1 to 31
     * @param hourOfDay    the hour of the day, from 0 to 23
     * @param minuteOfHour the minute of the hour, from 0 to 59
     * @param zone         the time zone, null means default time zone
     * @since 2.0
     */
    public DateTime(
            int year,
            int monthOfYear,
            int dayOfMonth,
            int hourOfDay,
            int minuteOfHour,
            DateTimeZone zone) {
        super(year, monthOfYear, dayOfMonth,
                hourOfDay, minuteOfHour, 0, 0, zone);__CLR4_4_17w7wlgchoq4g.R.inc(323);try{__CLR4_4_17w7wlgchoq4g.R.inc(322);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Constructs an instance from datetime field values
     * using the specified chronology.
     * <p>
     * If the chronology is null, <code>ISOChronology</code>
     * in the default time zone is used.
     *
     * @param year         the year, valid values defined by the chronology
     * @param monthOfYear  the month of the year, valid values defined by the chronology
     * @param dayOfMonth   the day of the month, valid values defined by the chronology
     * @param hourOfDay    the hour of the day, valid values defined by the chronology
     * @param minuteOfHour the minute of the hour, valid values defined by the chronology
     * @param chronology   the chronology, null means ISOChronology in default zone
     * @since 2.0
     */
    public DateTime(
            int year,
            int monthOfYear,
            int dayOfMonth,
            int hourOfDay,
            int minuteOfHour,
            Chronology chronology) {
        super(year, monthOfYear, dayOfMonth,
                hourOfDay, minuteOfHour, 0, 0, chronology);__CLR4_4_17w7wlgchoq4g.R.inc(325);try{__CLR4_4_17w7wlgchoq4g.R.inc(324);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs an instance from datetime field values
     * using <code>ISOChronology</code> in the default time zone.
     *
     * @param year           the year
     * @param monthOfYear    the month of the year, from 1 to 12
     * @param dayOfMonth     the day of the month, from 1 to 31
     * @param hourOfDay      the hour of the day, from 0 to 23
     * @param minuteOfHour   the minute of the hour, from 0 to 59
     * @param secondOfMinute the second of the minute, from 0 to 59
     * @since 2.0
     */
    public DateTime(
            int year,
            int monthOfYear,
            int dayOfMonth,
            int hourOfDay,
            int minuteOfHour,
            int secondOfMinute) {
        super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, 0);__CLR4_4_17w7wlgchoq4g.R.inc(327);try{__CLR4_4_17w7wlgchoq4g.R.inc(326);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Constructs an instance from datetime field values
     * using <code>ISOChronology</code> in the specified time zone.
     * <p>
     * If the specified time zone is null, the default zone is used.
     *
     * @param year           the year
     * @param monthOfYear    the month of the year, from 1 to 12
     * @param dayOfMonth     the day of the month, from 1 to 31
     * @param hourOfDay      the hour of the day, from 0 to 23
     * @param minuteOfHour   the minute of the hour, from 0 to 59
     * @param secondOfMinute the second of the minute, from 0 to 59
     * @param zone           the time zone, null means default time zone
     * @since 2.0
     */
    public DateTime(
            int year,
            int monthOfYear,
            int dayOfMonth,
            int hourOfDay,
            int minuteOfHour,
            int secondOfMinute,
            DateTimeZone zone) {
        super(year, monthOfYear, dayOfMonth,
                hourOfDay, minuteOfHour, secondOfMinute, 0, zone);__CLR4_4_17w7wlgchoq4g.R.inc(329);try{__CLR4_4_17w7wlgchoq4g.R.inc(328);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Constructs an instance from datetime field values
     * using the specified chronology.
     * <p>
     * If the chronology is null, <code>ISOChronology</code>
     * in the default time zone is used.
     *
     * @param year           the year, valid values defined by the chronology
     * @param monthOfYear    the month of the year, valid values defined by the chronology
     * @param dayOfMonth     the day of the month, valid values defined by the chronology
     * @param hourOfDay      the hour of the day, valid values defined by the chronology
     * @param minuteOfHour   the minute of the hour, valid values defined by the chronology
     * @param secondOfMinute the second of the minute, valid values defined by the chronology
     * @param chronology     the chronology, null means ISOChronology in default zone
     * @since 2.0
     */
    public DateTime(
            int year,
            int monthOfYear,
            int dayOfMonth,
            int hourOfDay,
            int minuteOfHour,
            int secondOfMinute,
            Chronology chronology) {
        super(year, monthOfYear, dayOfMonth,
                hourOfDay, minuteOfHour, secondOfMinute, 0, chronology);__CLR4_4_17w7wlgchoq4g.R.inc(331);try{__CLR4_4_17w7wlgchoq4g.R.inc(330);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs an instance from datetime field values
     * using <code>ISOChronology</code> in the default time zone.
     *
     * @param year           the year
     * @param monthOfYear    the month of the year, from 1 to 12
     * @param dayOfMonth     the day of the month, from 1 to 31
     * @param hourOfDay      the hour of the day, from 0 to 23
     * @param minuteOfHour   the minute of the hour, from 0 to 59
     * @param secondOfMinute the second of the minute, from 0 to 59
     * @param millisOfSecond the millisecond of the second, from 0 to 999
     */
    public DateTime(
            int year,
            int monthOfYear,
            int dayOfMonth,
            int hourOfDay,
            int minuteOfHour,
            int secondOfMinute,
            int millisOfSecond) {
        super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);__CLR4_4_17w7wlgchoq4g.R.inc(333);try{__CLR4_4_17w7wlgchoq4g.R.inc(332);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Constructs an instance from datetime field values
     * using <code>ISOChronology</code> in the specified time zone.
     * <p>
     * If the specified time zone is null, the default zone is used.
     *
     * @param year           the year
     * @param monthOfYear    the month of the year, from 1 to 12
     * @param dayOfMonth     the day of the month, from 1 to 31
     * @param hourOfDay      the hour of the day, from 0 to 23
     * @param minuteOfHour   the minute of the hour, from 0 to 59
     * @param secondOfMinute the second of the minute, from 0 to 59
     * @param millisOfSecond the millisecond of the second, from 0 to 999
     * @param zone           the time zone, null means default time zone
     */
    public DateTime(
            int year,
            int monthOfYear,
            int dayOfMonth,
            int hourOfDay,
            int minuteOfHour,
            int secondOfMinute,
            int millisOfSecond,
            DateTimeZone zone) {
        super(year, monthOfYear, dayOfMonth,
                hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, zone);__CLR4_4_17w7wlgchoq4g.R.inc(335);try{__CLR4_4_17w7wlgchoq4g.R.inc(334);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Constructs an instance from datetime field values
     * using the specified chronology.
     * <p>
     * If the chronology is null, <code>ISOChronology</code>
     * in the default time zone is used.
     *
     * @param year           the year, valid values defined by the chronology
     * @param monthOfYear    the month of the year, valid values defined by the chronology
     * @param dayOfMonth     the day of the month, valid values defined by the chronology
     * @param hourOfDay      the hour of the day, valid values defined by the chronology
     * @param minuteOfHour   the minute of the hour, valid values defined by the chronology
     * @param secondOfMinute the second of the minute, valid values defined by the chronology
     * @param millisOfSecond the millisecond of the second, valid values defined by the chronology
     * @param chronology     the chronology, null means ISOChronology in default zone
     */
    public DateTime(
            int year,
            int monthOfYear,
            int dayOfMonth,
            int hourOfDay,
            int minuteOfHour,
            int secondOfMinute,
            int millisOfSecond,
            Chronology chronology) {
        super(year, monthOfYear, dayOfMonth,
                hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, chronology);__CLR4_4_17w7wlgchoq4g.R.inc(337);try{__CLR4_4_17w7wlgchoq4g.R.inc(336);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get this object as a DateTime by returning <code>this</code>.
     *
     * @return <code>this</code>
     */
    public DateTime toDateTime() {try{__CLR4_4_17w7wlgchoq4g.R.inc(338);
        __CLR4_4_17w7wlgchoq4g.R.inc(339);return this;
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Get this object as a DateTime using ISOChronology in the default zone,
     * returning <code>this</code> if possible.
     *
     * @return a DateTime using the same millis
     */
    public DateTime toDateTimeISO() {try{__CLR4_4_17w7wlgchoq4g.R.inc(340);
        __CLR4_4_17w7wlgchoq4g.R.inc(341);if ((((getChronology() == ISOChronology.getInstance())&&(__CLR4_4_17w7wlgchoq4g.R.iget(342)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(343)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(344);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(345);return super.toDateTimeISO();
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Get this object as a DateTime, returning <code>this</code> if possible.
     *
     * @param zone time zone to apply, or default if null
     * @return a DateTime using the same millis
     */
    public DateTime toDateTime(DateTimeZone zone) {try{__CLR4_4_17w7wlgchoq4g.R.inc(346);
        __CLR4_4_17w7wlgchoq4g.R.inc(347);zone = DateTimeUtils.getZone(zone);
        __CLR4_4_17w7wlgchoq4g.R.inc(348);if ((((getZone() == zone)&&(__CLR4_4_17w7wlgchoq4g.R.iget(349)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(350)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(351);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(352);return super.toDateTime(zone);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Get this object as a DateTime, returning <code>this</code> if possible.
     *
     * @param chronology chronology to apply, or ISOChronology if null
     * @return a DateTime using the same millis
     */
    public DateTime toDateTime(Chronology chronology) {try{__CLR4_4_17w7wlgchoq4g.R.inc(353);
        __CLR4_4_17w7wlgchoq4g.R.inc(354);chronology = DateTimeUtils.getChronology(chronology);
        __CLR4_4_17w7wlgchoq4g.R.inc(355);if ((((getChronology() == chronology)&&(__CLR4_4_17w7wlgchoq4g.R.iget(356)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(357)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(358);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(359);return super.toDateTime(chronology);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this datetime with different millis.
     * <p>
     * The returned object will be either be a new instance or <code>this</code>.
     * Only the millis will change, the chronology and time zone are kept.
     *
     * @param newMillis the new millis, from 1970-01-01T00:00:00Z
     * @return a copy of this datetime with different millis
     */
    public DateTime withMillis(long newMillis) {try{__CLR4_4_17w7wlgchoq4g.R.inc(360);
        __CLR4_4_17w7wlgchoq4g.R.inc(361);return ((((newMillis == getMillis() )&&(__CLR4_4_17w7wlgchoq4g.R.iget(362)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(363)==0&false))? this : new DateTime(newMillis, getChronology()));
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with a different chronology.
     * <p>
     * The returned object will be either be a new instance or <code>this</code>.
     * Only the chronology will change, the millis are kept.
     *
     * @param newChronology the new chronology, null means ISO default
     * @return a copy of this datetime with a different chronology
     */
    public DateTime withChronology(Chronology newChronology) {try{__CLR4_4_17w7wlgchoq4g.R.inc(364);
        __CLR4_4_17w7wlgchoq4g.R.inc(365);newChronology = DateTimeUtils.getChronology(newChronology);
        __CLR4_4_17w7wlgchoq4g.R.inc(366);return ((((newChronology == getChronology() )&&(__CLR4_4_17w7wlgchoq4g.R.iget(367)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(368)==0&false))? this : new DateTime(getMillis(), newChronology));
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this datetime with a different time zone, preserving the
     * millisecond instant.
     * <p>
     * This method is useful for finding the local time in another timezone.
     * For example, if this instant holds 12:30 in Europe/London, the result
     * from this method with Europe/Paris would be 13:30.
     * <p>
     * The returned object will be a new instance of the same implementation type.
     * This method changes the time zone, and does not change the
     * millisecond instant, with the effect that the field values usually change.
     * The returned object will be either be a new instance or <code>this</code>.
     *
     * @param newZone the new time zone
     * @return a copy of this datetime with a different time zone
     * @see #withZoneRetainFields
     */
    public DateTime withZone(DateTimeZone newZone) {try{__CLR4_4_17w7wlgchoq4g.R.inc(369);
        __CLR4_4_17w7wlgchoq4g.R.inc(370);return withChronology(getChronology().withZone(newZone));
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with a different time zone, preserving the
     * field values.
     * <p>
     * This method is useful for finding the millisecond time in another timezone.
     * For example, if this instant holds 12:30 in Europe/London (ie. 12:30Z),
     * the result from this method with Europe/Paris would be 12:30 (ie. 11:30Z).
     * <p>
     * The returned object will be a new instance of the same implementation type.
     * This method changes the time zone and the millisecond instant to keep
     * the field values the same.
     * The returned object will be either be a new instance or <code>this</code>.
     *
     * @param newZone the new time zone, null means default
     * @return a copy of this datetime with a different time zone
     * @see #withZone
     */
    public DateTime withZoneRetainFields(DateTimeZone newZone) {try{__CLR4_4_17w7wlgchoq4g.R.inc(371);
        __CLR4_4_17w7wlgchoq4g.R.inc(372);newZone = DateTimeUtils.getZone(newZone);
        __CLR4_4_17w7wlgchoq4g.R.inc(373);DateTimeZone originalZone = DateTimeUtils.getZone(getZone());
        __CLR4_4_17w7wlgchoq4g.R.inc(374);if ((((newZone == originalZone)&&(__CLR4_4_17w7wlgchoq4g.R.iget(375)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(376)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(377);return this;
        }

        }__CLR4_4_17w7wlgchoq4g.R.inc(378);long millis = originalZone.getMillisKeepLocal(newZone, getMillis());
        __CLR4_4_17w7wlgchoq4g.R.inc(379);return new DateTime(millis, getChronology().withZone(newZone));
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this ZonedDateTime changing the zone offset to the earlier
     * of the two valid offsets at a local time-line overlap.
     * <p>
     * This method only has any effect when the local time-line overlaps, such as at
     * an autumn daylight savings cutover. In this scenario, there are two valid offsets
     * for the local date-time. Calling this method will return a date-time with the
     * earlier of the two selected.
     * <p>
     * If this method is called when it is not an overlap, this is returned.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @return a copy of this datetime with the earliest valid offset for the local datetime
     */
    public DateTime withEarlierOffsetAtOverlap() {try{__CLR4_4_17w7wlgchoq4g.R.inc(380);
        __CLR4_4_17w7wlgchoq4g.R.inc(381);long newMillis = getZone().adjustOffset(getMillis(), false);
        __CLR4_4_17w7wlgchoq4g.R.inc(382);return withMillis(newMillis);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this ZonedDateTime changing the zone offset to the later
     * of the two valid offsets at a local time-line overlap.
     * <p>
     * This method only has any effect when the local time-line overlaps, such as at
     * an autumn daylight savings cutover. In this scenario, there are two valid offsets
     * for the local date-time. Calling this method will return a date-time with the
     * later of the two selected.
     * <p>
     * If this method is called when it is not an overlap, this is returned.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @return a copy of this datetime with the latest valid offset for the local datetime
     */
    public DateTime withLaterOffsetAtOverlap() {try{__CLR4_4_17w7wlgchoq4g.R.inc(383);
        __CLR4_4_17w7wlgchoq4g.R.inc(384);long newMillis = getZone().adjustOffset(getMillis(), true);
        __CLR4_4_17w7wlgchoq4g.R.inc(385);return withMillis(newMillis);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this datetime with the specified date, retaining the time fields.
     * <p>
     * If the date is already the date passed in, then <code>this</code> is returned.
     * <p>
     * To set a single field use the properties, for example:
     * <pre>
     * DateTime set = monthOfYear().setCopy(6);
     * </pre>
     * <p>
     * If the time is invalid on the new date due to the time-zone, the time will be adjusted.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param year        the new year value
     * @param monthOfYear the new monthOfYear value
     * @param dayOfMonth  the new dayOfMonth value
     * @return a copy of this datetime with a different date
     * @throws IllegalArgumentException if any value if invalid
     */
    public DateTime withDate(int year, int monthOfYear, int dayOfMonth) {try{__CLR4_4_17w7wlgchoq4g.R.inc(386);
        __CLR4_4_17w7wlgchoq4g.R.inc(387);Chronology chrono = getChronology();
        __CLR4_4_17w7wlgchoq4g.R.inc(388);long localInstant = chrono.withUTC().getDateTimeMillis(year, monthOfYear, dayOfMonth, getMillisOfDay());
        __CLR4_4_17w7wlgchoq4g.R.inc(389);return withMillis(chrono.getZone().convertLocalToUTC(localInstant, false, getMillis()));
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the specified date, retaining the time fields.
     * <p>
     * If the time is invalid on the new date due to the time-zone, the time will be adjusted.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param date the local date
     * @return a copy of this datetime with a different date
     * @throws IllegalArgumentException if the time-of-day is invalid for the date
     * @throws NullPointerException     if the date is null
     */
    public DateTime withDate(LocalDate date) {try{__CLR4_4_17w7wlgchoq4g.R.inc(390);
        __CLR4_4_17w7wlgchoq4g.R.inc(391);return withDate(
                date.getYear(), date.getMonthOfYear(), date.getDayOfMonth());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the specified time, retaining the date fields.
     * <p>
     * If the time is already the time passed in, then <code>this</code> is returned.
     * <p>
     * To set a single field use the properties, for example:
     * <pre>
     * DateTime set = dt.hourOfDay().setCopy(6);
     * </pre>
     * <p>
     * If the new time is invalid due to the time-zone, the time will be adjusted.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param hourOfDay      the hour of the day
     * @param minuteOfHour   the minute of the hour
     * @param secondOfMinute the second of the minute
     * @param millisOfSecond the millisecond of the second
     * @return a copy of this datetime with a different time
     * @throws IllegalArgumentException if any value if invalid
     */
    public DateTime withTime(int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) {try{__CLR4_4_17w7wlgchoq4g.R.inc(392);
        __CLR4_4_17w7wlgchoq4g.R.inc(393);Chronology chrono = getChronology();
        __CLR4_4_17w7wlgchoq4g.R.inc(394);long localInstant = chrono.withUTC().getDateTimeMillis(
                getYear(), getMonthOfYear(), getDayOfMonth(), hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
        __CLR4_4_17w7wlgchoq4g.R.inc(395);return withMillis(chrono.getZone().convertLocalToUTC(localInstant, false, getMillis()));
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the specified time, retaining the date fields.
     * <p>
     * If the new time is invalid due to the time-zone, the time will be adjusted.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param time the local time
     * @return a copy of this datetime with a different time
     * @throws IllegalArgumentException if the time-of-day is invalid for the date
     * @throws NullPointerException     if the time is null
     */
    public DateTime withTime(LocalTime time) {try{__CLR4_4_17w7wlgchoq4g.R.inc(396);
        __CLR4_4_17w7wlgchoq4g.R.inc(397);return withTime(
                time.getHourOfDay(), time.getMinuteOfHour(), time.getSecondOfMinute(), time.getMillisOfSecond());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the time set to the start of the day.
     * <p>
     * The time will normally be midnight, as that is the earliest time on
     * any given day. However, in some time zones when Daylight Savings Time
     * starts, there is no midnight because time jumps from 11:59 to 01:00.
     * This method handles that situation by returning 01:00 on that date.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @return a copy of this datetime with the time set to the start of the day, not null
     */
    public DateTime withTimeAtStartOfDay() {try{__CLR4_4_17w7wlgchoq4g.R.inc(398);
        __CLR4_4_17w7wlgchoq4g.R.inc(399);return toLocalDate().toDateTimeAtStartOfDay(getZone());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this datetime with the partial set of fields replacing those
     * from this instance.
     * <p>
     * For example, if the partial is a <code>TimeOfDay</code> then the time fields
     * would be changed in the returned instance.
     * If the partial is null, then <code>this</code> is returned.
     *
     * @param partial the partial set of fields to apply to this datetime, null ignored
     * @return a copy of this datetime with a different set of fields
     * @throws IllegalArgumentException if any value is invalid
     */
    public DateTime withFields(ReadablePartial partial) {try{__CLR4_4_17w7wlgchoq4g.R.inc(400);
        __CLR4_4_17w7wlgchoq4g.R.inc(401);if ((((partial == null)&&(__CLR4_4_17w7wlgchoq4g.R.iget(402)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(403)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(404);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(405);return withMillis(getChronology().set(partial, getMillis()));
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the specified field set to a new value.
     * <p>
     * For example, if the field type is <code>hourOfDay</code> then the hour of day
     * field would be changed in the returned instance.
     * If the field type is null, then <code>this</code> is returned.
     * <p>
     * These three lines are equivalent:
     * <pre>
     * DateTime updated = dt.withField(DateTimeFieldType.dayOfMonth(), 6);
     * DateTime updated = dt.dayOfMonth().setCopy(6);
     * DateTime updated = dt.property(DateTimeFieldType.dayOfMonth()).setCopy(6);
     * </pre>
     *
     * @param fieldType the field type to set, not null
     * @param value     the value to set
     * @return a copy of this datetime with the field set
     * @throws IllegalArgumentException if the value is null or invalid
     */
    public DateTime withField(DateTimeFieldType fieldType, int value) {try{__CLR4_4_17w7wlgchoq4g.R.inc(406);
        __CLR4_4_17w7wlgchoq4g.R.inc(407);if ((((fieldType == null)&&(__CLR4_4_17w7wlgchoq4g.R.iget(408)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(409)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(410);throw new IllegalArgumentException("Field must not be null");
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(411);long instant = fieldType.getField(getChronology()).set(getMillis(), value);
        __CLR4_4_17w7wlgchoq4g.R.inc(412);return withMillis(instant);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the value of the specified field increased.
     * <p>
     * If the addition is zero or the field is null, then <code>this</code> is returned.
     * <p>
     * These three lines are equivalent:
     * <pre>
     * DateTime added = dt.withFieldAdded(DurationFieldType.years(), 6);
     * DateTime added = dt.plusYears(6);
     * DateTime added = dt.plus(Period.years(6));
     * </pre>
     *
     * @param fieldType the field type to add to, not null
     * @param amount    the amount to add
     * @return a copy of this datetime with the field updated
     * @throws IllegalArgumentException if the value is null or invalid
     * @throws ArithmeticException      if the new datetime exceeds the capacity of a long
     */
    public DateTime withFieldAdded(DurationFieldType fieldType, int amount) {try{__CLR4_4_17w7wlgchoq4g.R.inc(413);
        __CLR4_4_17w7wlgchoq4g.R.inc(414);if ((((fieldType == null)&&(__CLR4_4_17w7wlgchoq4g.R.iget(415)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(416)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(417);throw new IllegalArgumentException("Field must not be null");
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(418);if ((((amount == 0)&&(__CLR4_4_17w7wlgchoq4g.R.iget(419)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(420)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(421);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(422);long instant = fieldType.getField(getChronology()).add(getMillis(), amount);
        __CLR4_4_17w7wlgchoq4g.R.inc(423);return withMillis(instant);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this datetime with the specified duration added.
     * <p>
     * If the addition is zero, then <code>this</code> is returned.
     *
     * @param durationToAdd the duration to add to this one
     * @param scalar        the amount of times to add, such as -1 to subtract once
     * @return a copy of this datetime with the duration added
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public DateTime withDurationAdded(long durationToAdd, int scalar) {try{__CLR4_4_17w7wlgchoq4g.R.inc(424);
        __CLR4_4_17w7wlgchoq4g.R.inc(425);if ((((durationToAdd == 0 || scalar == 0)&&(__CLR4_4_17w7wlgchoq4g.R.iget(426)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(427)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(428);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(429);long instant = getChronology().add(getMillis(), durationToAdd, scalar);
        __CLR4_4_17w7wlgchoq4g.R.inc(430);return withMillis(instant);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the specified duration added.
     * <p>
     * If the addition is zero, then <code>this</code> is returned.
     *
     * @param durationToAdd the duration to add to this one, null means zero
     * @param scalar        the amount of times to add, such as -1 to subtract once
     * @return a copy of this datetime with the duration added
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public DateTime withDurationAdded(ReadableDuration durationToAdd, int scalar) {try{__CLR4_4_17w7wlgchoq4g.R.inc(431);
        __CLR4_4_17w7wlgchoq4g.R.inc(432);if ((((durationToAdd == null || scalar == 0)&&(__CLR4_4_17w7wlgchoq4g.R.iget(433)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(434)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(435);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(436);return withDurationAdded(durationToAdd.getMillis(), scalar);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the specified period added.
     * <p>
     * If the addition is zero, then <code>this</code> is returned.
     * <p>
     * This method is typically used to add multiple copies of complex
     * period instances. Adding one field is best achieved using methods
     * like {@link #withFieldAdded(DurationFieldType, int)}
     * or {@link #plusYears(int)}.
     *
     * @param period the period to add to this one, null means zero
     * @param scalar the amount of times to add, such as -1 to subtract once
     * @return a copy of this datetime with the period added
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public DateTime withPeriodAdded(ReadablePeriod period, int scalar) {try{__CLR4_4_17w7wlgchoq4g.R.inc(437);
        __CLR4_4_17w7wlgchoq4g.R.inc(438);if ((((period == null || scalar == 0)&&(__CLR4_4_17w7wlgchoq4g.R.iget(439)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(440)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(441);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(442);long instant = getChronology().add(period, getMillis(), scalar);
        __CLR4_4_17w7wlgchoq4g.R.inc(443);return withMillis(instant);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this datetime with the specified duration added.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * This datetime instance is immutable and unaffected by this method call.
     *
     * @param duration the duration, in millis, to add to this one
     * @return a copy of this datetime with the duration added
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public DateTime plus(long duration) {try{__CLR4_4_17w7wlgchoq4g.R.inc(444);
        __CLR4_4_17w7wlgchoq4g.R.inc(445);return withDurationAdded(duration, 1);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the specified duration added.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * This datetime instance is immutable and unaffected by this method call.
     *
     * @param duration the duration to add to this one, null means zero
     * @return a copy of this datetime with the duration added
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public DateTime plus(ReadableDuration duration) {try{__CLR4_4_17w7wlgchoq4g.R.inc(446);
        __CLR4_4_17w7wlgchoq4g.R.inc(447);return withDurationAdded(duration, 1);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the specified period added.
     * <p>
     * This method will add each element of the period one by one, from largest
     * to smallest, adjusting the datetime to be accurate between each.
     * <p>
     * Thus, adding a period of one month and one day to 2007-03-31 will
     * work as follows:
     * First add one month and adjust, resulting in 2007-04-30
     * Then add one day and adjust, resulting in 2007-05-01.
     * <p>
     * This method is typically used to add complex period instances.
     * Adding one field is best achieved using methods
     * like {@link #plusYears(int)}.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * This datetime instance is immutable and unaffected by this method call.
     *
     * @param period the duration to add to this one, null means zero
     * @return a copy of this datetime with the period added
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public DateTime plus(ReadablePeriod period) {try{__CLR4_4_17w7wlgchoq4g.R.inc(448);
        __CLR4_4_17w7wlgchoq4g.R.inc(449);return withPeriodAdded(period, 1);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this datetime plus the specified number of years.
     * <p>
     * The calculation will do its best to only change the year field
     * retaining the same month of year.
     * However, in certain circumstances, it may be necessary to alter
     * smaller fields. For example, 2008-02-29 plus one year cannot result
     * in 2009-02-29, so the day of month is adjusted to 2009-02-28.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateTime added = dt.plusYears(6);
     * DateTime added = dt.plus(Period.years(6));
     * DateTime added = dt.withFieldAdded(DurationFieldType.years(), 6);
     * </pre>
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     *
     * @param years the amount of years to add, may be negative
     * @return the new datetime plus the increased years
     * @since 1.1
     */
    public DateTime plusYears(int years) {try{__CLR4_4_17w7wlgchoq4g.R.inc(450);
        __CLR4_4_17w7wlgchoq4g.R.inc(451);if ((((years == 0)&&(__CLR4_4_17w7wlgchoq4g.R.iget(452)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(453)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(454);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(455);long instant = getChronology().years().add(getMillis(), years);
        __CLR4_4_17w7wlgchoq4g.R.inc(456);return withMillis(instant);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime plus the specified number of months.
     * <p>
     * The calculation will do its best to only change the month field
     * retaining the same day of month.
     * However, in certain circumstances, it may be necessary to alter
     * smaller fields. For example, 2007-03-31 plus one month cannot result
     * in 2007-04-31, so the day of month is adjusted to 2007-04-30.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateTime added = dt.plusMonths(6);
     * DateTime added = dt.plus(Period.months(6));
     * DateTime added = dt.withFieldAdded(DurationFieldType.months(), 6);
     * </pre>
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     *
     * @param months the amount of months to add, may be negative
     * @return the new datetime plus the increased months
     * @since 1.1
     */
    public DateTime plusMonths(int months) {try{__CLR4_4_17w7wlgchoq4g.R.inc(457);
        __CLR4_4_17w7wlgchoq4g.R.inc(458);if ((((months == 0)&&(__CLR4_4_17w7wlgchoq4g.R.iget(459)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(460)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(461);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(462);long instant = getChronology().months().add(getMillis(), months);
        __CLR4_4_17w7wlgchoq4g.R.inc(463);return withMillis(instant);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime plus the specified number of weeks.
     * <p>
     * The calculation operates as if it were adding the equivalent in days.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateTime added = dt.plusWeeks(6);
     * DateTime added = dt.plus(Period.weeks(6));
     * DateTime added = dt.withFieldAdded(DurationFieldType.weeks(), 6);
     * </pre>
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     *
     * @param weeks the amount of weeks to add, may be negative
     * @return the new datetime plus the increased weeks
     * @since 1.1
     */
    public DateTime plusWeeks(int weeks) {try{__CLR4_4_17w7wlgchoq4g.R.inc(464);
        __CLR4_4_17w7wlgchoq4g.R.inc(465);if ((((weeks == 0)&&(__CLR4_4_17w7wlgchoq4g.R.iget(466)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(467)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(468);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(469);long instant = getChronology().weeks().add(getMillis(), weeks);
        __CLR4_4_17w7wlgchoq4g.R.inc(470);return withMillis(instant);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime plus the specified number of days.
     * <p>
     * The calculation will do its best to only change the day field
     * retaining the same time of day.
     * However, in certain circumstances, typically daylight savings cutover,
     * it may be necessary to alter the time fields.
     * <p>
     * In spring an hour is typically removed. If adding one day results in
     * the time being within the cutover then the time is adjusted to be
     * within summer time. For example, if the cutover is from 01:59 to 03:00
     * and the result of this method would have been 02:30, then the result
     * will be adjusted to 03:30.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateTime added = dt.plusDays(6);
     * DateTime added = dt.plus(Period.days(6));
     * DateTime added = dt.withFieldAdded(DurationFieldType.days(), 6);
     * </pre>
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     *
     * @param days the amount of days to add, may be negative
     * @return the new datetime plus the increased days
     * @since 1.1
     */
    public DateTime plusDays(int days) {try{__CLR4_4_17w7wlgchoq4g.R.inc(471);
        __CLR4_4_17w7wlgchoq4g.R.inc(472);if ((((days == 0)&&(__CLR4_4_17w7wlgchoq4g.R.iget(473)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(474)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(475);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(476);long instant = getChronology().days().add(getMillis(), days);
        __CLR4_4_17w7wlgchoq4g.R.inc(477);return withMillis(instant);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime plus the specified number of hours.
     * <p>
     * The calculation will add a duration equivalent to the number of hours
     * expressed in milliseconds.
     * <p>
     * For example, if a spring daylight savings cutover is from 01:59 to 03:00
     * then adding one hour to 01:30 will result in 03:30. This is a duration
     * of one hour later, even though the hour field value changed from 1 to 3.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateTime added = dt.plusHours(6);
     * DateTime added = dt.plus(Period.hours(6));
     * DateTime added = dt.withFieldAdded(DurationFieldType.hours(), 6);
     * </pre>
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     *
     * @param hours the amount of hours to add, may be negative
     * @return the new datetime plus the increased hours
     * @since 1.1
     */
    public DateTime plusHours(int hours) {try{__CLR4_4_17w7wlgchoq4g.R.inc(478);
        __CLR4_4_17w7wlgchoq4g.R.inc(479);if ((((hours == 0)&&(__CLR4_4_17w7wlgchoq4g.R.iget(480)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(481)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(482);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(483);long instant = getChronology().hours().add(getMillis(), hours);
        __CLR4_4_17w7wlgchoq4g.R.inc(484);return withMillis(instant);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime plus the specified number of minutes.
     * <p>
     * The calculation will add a duration equivalent to the number of minutes
     * expressed in milliseconds.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateTime added = dt.plusMinutes(6);
     * DateTime added = dt.plus(Period.minutes(6));
     * DateTime added = dt.withFieldAdded(DurationFieldType.minutes(), 6);
     * </pre>
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     *
     * @param minutes the amount of minutes to add, may be negative
     * @return the new datetime plus the increased minutes
     * @since 1.1
     */
    public DateTime plusMinutes(int minutes) {try{__CLR4_4_17w7wlgchoq4g.R.inc(485);
        __CLR4_4_17w7wlgchoq4g.R.inc(486);if ((((minutes == 0)&&(__CLR4_4_17w7wlgchoq4g.R.iget(487)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(488)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(489);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(490);long instant = getChronology().minutes().add(getMillis(), minutes);
        __CLR4_4_17w7wlgchoq4g.R.inc(491);return withMillis(instant);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime plus the specified number of seconds.
     * <p>
     * The calculation will add a duration equivalent to the number of seconds
     * expressed in milliseconds.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateTime added = dt.plusSeconds(6);
     * DateTime added = dt.plus(Period.seconds(6));
     * DateTime added = dt.withFieldAdded(DurationFieldType.seconds(), 6);
     * </pre>
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     *
     * @param seconds the amount of seconds to add, may be negative
     * @return the new datetime plus the increased seconds
     * @since 1.1
     */
    public DateTime plusSeconds(int seconds) {try{__CLR4_4_17w7wlgchoq4g.R.inc(492);
        __CLR4_4_17w7wlgchoq4g.R.inc(493);if ((((seconds == 0)&&(__CLR4_4_17w7wlgchoq4g.R.iget(494)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(495)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(496);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(497);long instant = getChronology().seconds().add(getMillis(), seconds);
        __CLR4_4_17w7wlgchoq4g.R.inc(498);return withMillis(instant);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime plus the specified number of millis.
     * <p>
     * The calculation will add a duration equivalent to the number of milliseconds.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateTime added = dt.plusMillis(6);
     * DateTime added = dt.plus(Period.millis(6));
     * DateTime added = dt.withFieldAdded(DurationFieldType.millis(), 6);
     * </pre>
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     *
     * @param millis the amount of millis to add, may be negative
     * @return the new datetime plus the increased millis
     * @since 1.1
     */
    public DateTime plusMillis(int millis) {try{__CLR4_4_17w7wlgchoq4g.R.inc(499);
        __CLR4_4_17w7wlgchoq4g.R.inc(500);if ((((millis == 0)&&(__CLR4_4_17w7wlgchoq4g.R.iget(501)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(502)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(503);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(504);long instant = getChronology().millis().add(getMillis(), millis);
        __CLR4_4_17w7wlgchoq4g.R.inc(505);return withMillis(instant);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this datetime with the specified duration taken away.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * This datetime instance is immutable and unaffected by this method call.
     *
     * @param duration the duration, in millis, to reduce this instant by
     * @return a copy of this datetime with the duration taken away
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public DateTime minus(long duration) {try{__CLR4_4_17w7wlgchoq4g.R.inc(506);
        __CLR4_4_17w7wlgchoq4g.R.inc(507);return withDurationAdded(duration, -1);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the specified duration taken away.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * This datetime instance is immutable and unaffected by this method call.
     *
     * @param duration the duration to reduce this instant by
     * @return a copy of this datetime with the duration taken away
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public DateTime minus(ReadableDuration duration) {try{__CLR4_4_17w7wlgchoq4g.R.inc(508);
        __CLR4_4_17w7wlgchoq4g.R.inc(509);return withDurationAdded(duration, -1);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the specified period taken away.
     * <p>
     * This method will subtract each element of the period one by one, from
     * largest to smallest, adjusting the datetime to be accurate between each.
     * <p>
     * Thus, subtracting a period of one month and one day from 2007-05-31 will
     * work as follows:
     * First subtract one month and adjust, resulting in 2007-04-30
     * Then subtract one day and adjust, resulting in 2007-04-29.
     * Note that the day has been adjusted by two.
     * <p>
     * This method is typically used to subtract complex period instances.
     * Subtracting one field is best achieved using methods
     * like {@link #minusYears(int)}.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * This datetime instance is immutable and unaffected by this method call.
     *
     * @param period the period to reduce this instant by
     * @return a copy of this datetime with the period taken away
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public DateTime minus(ReadablePeriod period) {try{__CLR4_4_17w7wlgchoq4g.R.inc(510);
        __CLR4_4_17w7wlgchoq4g.R.inc(511);return withPeriodAdded(period, -1);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this datetime minus the specified number of years.
     * <p>
     * The calculation will do its best to only change the year field
     * retaining the same month of year.
     * However, in certain circumstances, it may be necessary to alter
     * smaller fields. For example, 2008-02-29 minus one year cannot result
     * in 2007-02-29, so the day of month is adjusted to 2007-02-28.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateTime subtracted = dt.minusYears(6);
     * DateTime subtracted = dt.minus(Period.years(6));
     * DateTime subtracted = dt.withFieldAdded(DurationFieldType.years(), -6);
     * </pre>
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     *
     * @param years the amount of years to subtract, may be negative
     * @return the new datetime minus the increased years
     * @since 1.1
     */
    public DateTime minusYears(int years) {try{__CLR4_4_17w7wlgchoq4g.R.inc(512);
        __CLR4_4_17w7wlgchoq4g.R.inc(513);if ((((years == 0)&&(__CLR4_4_17w7wlgchoq4g.R.iget(514)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(515)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(516);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(517);long instant = getChronology().years().subtract(getMillis(), years);
        __CLR4_4_17w7wlgchoq4g.R.inc(518);return withMillis(instant);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime minus the specified number of months.
     * <p>
     * The calculation will do its best to only change the month field
     * retaining the same day of month.
     * However, in certain circumstances, it may be necessary to alter
     * smaller fields. For example, 2007-05-31 minus one month cannot result
     * in 2007-04-31, so the day of month is adjusted to 2007-04-30.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateTime subtracted = dt.minusMonths(6);
     * DateTime subtracted = dt.minus(Period.months(6));
     * DateTime subtracted = dt.withFieldAdded(DurationFieldType.months(), -6);
     * </pre>
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     *
     * @param months the amount of months to subtract, may be negative
     * @return the new datetime minus the increased months
     * @since 1.1
     */
    public DateTime minusMonths(int months) {try{__CLR4_4_17w7wlgchoq4g.R.inc(519);
        __CLR4_4_17w7wlgchoq4g.R.inc(520);if ((((months == 0)&&(__CLR4_4_17w7wlgchoq4g.R.iget(521)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(522)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(523);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(524);long instant = getChronology().months().subtract(getMillis(), months);
        __CLR4_4_17w7wlgchoq4g.R.inc(525);return withMillis(instant);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime minus the specified number of weeks.
     * <p>
     * The calculation operates as if it were subtracting the equivalent in days.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateTime subtracted = dt.minusWeeks(6);
     * DateTime subtracted = dt.minus(Period.weeks(6));
     * DateTime subtracted = dt.withFieldAdded(DurationFieldType.weeks(), -6);
     * </pre>
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     *
     * @param weeks the amount of weeks to subtract, may be negative
     * @return the new datetime minus the increased weeks
     * @since 1.1
     */
    public DateTime minusWeeks(int weeks) {try{__CLR4_4_17w7wlgchoq4g.R.inc(526);
        __CLR4_4_17w7wlgchoq4g.R.inc(527);if ((((weeks == 0)&&(__CLR4_4_17w7wlgchoq4g.R.iget(528)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(529)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(530);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(531);long instant = getChronology().weeks().subtract(getMillis(), weeks);
        __CLR4_4_17w7wlgchoq4g.R.inc(532);return withMillis(instant);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime minus the specified number of days.
     * <p>
     * The calculation will do its best to only change the day field
     * retaining the same time of day.
     * However, in certain circumstances, typically daylight savings cutover,
     * it may be necessary to alter the time fields.
     * <p>
     * In spring an hour is typically removed. If subtracting one day results
     * in the time being within the cutover then the time is adjusted to be
     * within summer time. For example, if the cutover is from 01:59 to 03:00
     * and the result of this method would have been 02:30, then the result
     * will be adjusted to 03:30.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateTime subtracted = dt.minusDays(6);
     * DateTime subtracted = dt.minus(Period.days(6));
     * DateTime subtracted = dt.withFieldAdded(DurationFieldType.days(), -6);
     * </pre>
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     *
     * @param days the amount of days to subtract, may be negative
     * @return the new datetime minus the increased days
     * @since 1.1
     */
    public DateTime minusDays(int days) {try{__CLR4_4_17w7wlgchoq4g.R.inc(533);
        __CLR4_4_17w7wlgchoq4g.R.inc(534);if ((((days == 0)&&(__CLR4_4_17w7wlgchoq4g.R.iget(535)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(536)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(537);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(538);long instant = getChronology().days().subtract(getMillis(), days);
        __CLR4_4_17w7wlgchoq4g.R.inc(539);return withMillis(instant);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime minus the specified number of hours.
     * <p>
     * The calculation will subtract a duration equivalent to the number of
     * hours expressed in milliseconds.
     * <p>
     * For example, if a spring daylight savings cutover is from 01:59 to 03:00
     * then subtracting one hour from 03:30 will result in 01:30. This is a
     * duration of one hour earlier, even though the hour field value changed
     * from 3 to 1.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateTime subtracted = dt.minusHours(6);
     * DateTime subtracted = dt.minus(Period.hours(6));
     * DateTime subtracted = dt.withFieldAdded(DurationFieldType.hours(), -6);
     * </pre>
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     *
     * @param hours the amount of hours to subtract, may be negative
     * @return the new datetime minus the increased hours
     * @since 1.1
     */
    public DateTime minusHours(int hours) {try{__CLR4_4_17w7wlgchoq4g.R.inc(540);
        __CLR4_4_17w7wlgchoq4g.R.inc(541);if ((((hours == 0)&&(__CLR4_4_17w7wlgchoq4g.R.iget(542)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(543)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(544);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(545);long instant = getChronology().hours().subtract(getMillis(), hours);
        __CLR4_4_17w7wlgchoq4g.R.inc(546);return withMillis(instant);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime minus the specified number of minutes.
     * <p>
     * The calculation will subtract a duration equivalent to the number of
     * minutes expressed in milliseconds.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateTime subtracted = dt.minusMinutes(6);
     * DateTime subtracted = dt.minus(Period.minutes(6));
     * DateTime subtracted = dt.withFieldAdded(DurationFieldType.minutes(), -6);
     * </pre>
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     *
     * @param minutes the amount of minutes to subtract, may be negative
     * @return the new datetime minus the increased minutes
     * @since 1.1
     */
    public DateTime minusMinutes(int minutes) {try{__CLR4_4_17w7wlgchoq4g.R.inc(547);
        __CLR4_4_17w7wlgchoq4g.R.inc(548);if ((((minutes == 0)&&(__CLR4_4_17w7wlgchoq4g.R.iget(549)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(550)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(551);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(552);long instant = getChronology().minutes().subtract(getMillis(), minutes);
        __CLR4_4_17w7wlgchoq4g.R.inc(553);return withMillis(instant);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime minus the specified number of seconds.
     * <p>
     * The calculation will subtract a duration equivalent to the number of
     * seconds expressed in milliseconds.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateTime subtracted = dt.minusSeconds(6);
     * DateTime subtracted = dt.minus(Period.seconds(6));
     * DateTime subtracted = dt.withFieldAdded(DurationFieldType.seconds(), -6);
     * </pre>
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     *
     * @param seconds the amount of seconds to subtract, may be negative
     * @return the new datetime minus the increased seconds
     * @since 1.1
     */
    public DateTime minusSeconds(int seconds) {try{__CLR4_4_17w7wlgchoq4g.R.inc(554);
        __CLR4_4_17w7wlgchoq4g.R.inc(555);if ((((seconds == 0)&&(__CLR4_4_17w7wlgchoq4g.R.iget(556)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(557)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(558);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(559);long instant = getChronology().seconds().subtract(getMillis(), seconds);
        __CLR4_4_17w7wlgchoq4g.R.inc(560);return withMillis(instant);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime minus the specified number of millis.
     * <p>
     * The calculation will subtract a duration equivalent to the number of
     * milliseconds.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateTime subtracted = dt.minusMillis(6);
     * DateTime subtracted = dt.minus(Period.millis(6));
     * DateTime subtracted = dt.withFieldAdded(DurationFieldType.millis(), -6);
     * </pre>
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     *
     * @param millis the amount of millis to subtract, may be negative
     * @return the new datetime minus the increased millis
     * @since 1.1
     */
    public DateTime minusMillis(int millis) {try{__CLR4_4_17w7wlgchoq4g.R.inc(561);
        __CLR4_4_17w7wlgchoq4g.R.inc(562);if ((((millis == 0)&&(__CLR4_4_17w7wlgchoq4g.R.iget(563)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(564)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(565);return this;
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(566);long instant = getChronology().millis().subtract(getMillis(), millis);
        __CLR4_4_17w7wlgchoq4g.R.inc(567);return withMillis(instant);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the property object for the specified type, which contains many useful methods.
     *
     * @param type the field type to get the chronology for
     * @return the property object
     * @throws IllegalArgumentException if the field is null or unsupported
     */
    public Property property(DateTimeFieldType type) {try{__CLR4_4_17w7wlgchoq4g.R.inc(568);
        __CLR4_4_17w7wlgchoq4g.R.inc(569);if ((((type == null)&&(__CLR4_4_17w7wlgchoq4g.R.iget(570)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(571)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(572);throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(573);DateTimeField field = type.getField(getChronology());
        __CLR4_4_17w7wlgchoq4g.R.inc(574);if ((((field.isSupported() == false)&&(__CLR4_4_17w7wlgchoq4g.R.iget(575)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(576)==0&false))) {{
            __CLR4_4_17w7wlgchoq4g.R.inc(577);throw new IllegalArgumentException("Field '" + type + "' is not supported");
        }
        }__CLR4_4_17w7wlgchoq4g.R.inc(578);return new Property(this, field);
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this object to a <code>DateMidnight</code> using the
     * same millis and chronology.
     *
     * @return a DateMidnight using the same millis and chronology
     * @deprecated DateMidnight is deprecated
     */
    @Deprecated
    public DateMidnight toDateMidnight() {try{__CLR4_4_17w7wlgchoq4g.R.inc(579);
        __CLR4_4_17w7wlgchoq4g.R.inc(580);return new DateMidnight(getMillis(), getChronology());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Converts this object to a <code>YearMonthDay</code> using the
     * same millis and chronology.
     *
     * @return a YearMonthDay using the same millis and chronology
     * @deprecated Use LocalDate instead of YearMonthDay
     */
    @Deprecated
    public YearMonthDay toYearMonthDay() {try{__CLR4_4_17w7wlgchoq4g.R.inc(581);
        __CLR4_4_17w7wlgchoq4g.R.inc(582);return new YearMonthDay(getMillis(), getChronology());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Converts this object to a <code>TimeOfDay</code> using the
     * same millis and chronology.
     *
     * @return a TimeOfDay using the same millis and chronology
     * @deprecated Use LocalTime instead of TimeOfDay
     */
    @Deprecated
    public TimeOfDay toTimeOfDay() {try{__CLR4_4_17w7wlgchoq4g.R.inc(583);
        __CLR4_4_17w7wlgchoq4g.R.inc(584);return new TimeOfDay(getMillis(), getChronology());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Converts this object to a <code>LocalDateTime</code> with
     * the same datetime and chronology.
     *
     * @return a LocalDateTime with the same datetime and chronology
     * @since 1.3
     */
    public LocalDateTime toLocalDateTime() {try{__CLR4_4_17w7wlgchoq4g.R.inc(585);
        __CLR4_4_17w7wlgchoq4g.R.inc(586);return new LocalDateTime(getMillis(), getChronology());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Converts this object to a <code>LocalDate</code> with the
     * same date and chronology.
     *
     * @return a LocalDate with the same date and chronology
     * @since 1.3
     */
    public LocalDate toLocalDate() {try{__CLR4_4_17w7wlgchoq4g.R.inc(587);
        __CLR4_4_17w7wlgchoq4g.R.inc(588);return new LocalDate(getMillis(), getChronology());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Converts this object to a <code>LocalTime</code> with the
     * same time and chronology.
     *
     * @return a LocalTime with the same time and chronology
     * @since 1.3
     */
    public LocalTime toLocalTime() {try{__CLR4_4_17w7wlgchoq4g.R.inc(589);
        __CLR4_4_17w7wlgchoq4g.R.inc(590);return new LocalTime(getMillis(), getChronology());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this datetime with the era field updated.
     * <p>
     * DateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * era changed.
     *
     * @param era the era to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateTime withEra(int era) {try{__CLR4_4_17w7wlgchoq4g.R.inc(591);
        __CLR4_4_17w7wlgchoq4g.R.inc(592);return withMillis(getChronology().era().set(getMillis(), era));
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the century of era field updated.
     * <p>
     * DateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * century of era changed.
     *
     * @param centuryOfEra the century of era to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateTime withCenturyOfEra(int centuryOfEra) {try{__CLR4_4_17w7wlgchoq4g.R.inc(593);
        __CLR4_4_17w7wlgchoq4g.R.inc(594);return withMillis(getChronology().centuryOfEra().set(getMillis(), centuryOfEra));
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the year of era field updated.
     * <p>
     * DateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * year of era changed.
     *
     * @param yearOfEra the year of era to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateTime withYearOfEra(int yearOfEra) {try{__CLR4_4_17w7wlgchoq4g.R.inc(595);
        __CLR4_4_17w7wlgchoq4g.R.inc(596);return withMillis(getChronology().yearOfEra().set(getMillis(), yearOfEra));
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the year of century field updated.
     * <p>
     * DateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * year of century changed.
     *
     * @param yearOfCentury the year of century to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateTime withYearOfCentury(int yearOfCentury) {try{__CLR4_4_17w7wlgchoq4g.R.inc(597);
        __CLR4_4_17w7wlgchoq4g.R.inc(598);return withMillis(getChronology().yearOfCentury().set(getMillis(), yearOfCentury));
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the year field updated.
     * <p>
     * DateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * year changed.
     *
     * @param year the year to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateTime withYear(int year) {try{__CLR4_4_17w7wlgchoq4g.R.inc(599);
        __CLR4_4_17w7wlgchoq4g.R.inc(600);return withMillis(getChronology().year().set(getMillis(), year));
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the weekyear field updated.
     * <p>
     * The weekyear is the year that matches with the weekOfWeekyear field.
     * In the standard ISO8601 week algorithm, the first week of the year
     * is that in which at least 4 days are in the year. As a result of this
     * definition, day 1 of the first week may be in the previous year.
     * The weekyear allows you to query the effective year for that day.
     * <p>
     * DateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * weekyear changed.
     *
     * @param weekyear the weekyear to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateTime withWeekyear(int weekyear) {try{__CLR4_4_17w7wlgchoq4g.R.inc(601);
        __CLR4_4_17w7wlgchoq4g.R.inc(602);return withMillis(getChronology().weekyear().set(getMillis(), weekyear));
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the month of year field updated.
     * <p>
     * DateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * month of year changed.
     *
     * @param monthOfYear the month of year to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateTime withMonthOfYear(int monthOfYear) {try{__CLR4_4_17w7wlgchoq4g.R.inc(603);
        __CLR4_4_17w7wlgchoq4g.R.inc(604);return withMillis(getChronology().monthOfYear().set(getMillis(), monthOfYear));
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the week of weekyear field updated.
     * <p>
     * This field is associated with the "weekyear" via {@link #withWeekyear(int)}.
     * In the standard ISO8601 week algorithm, the first week of the year
     * is that in which at least 4 days are in the year. As a result of this
     * definition, day 1 of the first week may be in the previous year.
     * <p>
     * DateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * week of weekyear changed.
     *
     * @param weekOfWeekyear the week of weekyear to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateTime withWeekOfWeekyear(int weekOfWeekyear) {try{__CLR4_4_17w7wlgchoq4g.R.inc(605);
        __CLR4_4_17w7wlgchoq4g.R.inc(606);return withMillis(getChronology().weekOfWeekyear().set(getMillis(), weekOfWeekyear));
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the day of year field updated.
     * <p>
     * DateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * day of year changed.
     *
     * @param dayOfYear the day of year to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateTime withDayOfYear(int dayOfYear) {try{__CLR4_4_17w7wlgchoq4g.R.inc(607);
        __CLR4_4_17w7wlgchoq4g.R.inc(608);return withMillis(getChronology().dayOfYear().set(getMillis(), dayOfYear));
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the day of month field updated.
     * <p>
     * DateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * day of month changed.
     *
     * @param dayOfMonth the day of month to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateTime withDayOfMonth(int dayOfMonth) {try{__CLR4_4_17w7wlgchoq4g.R.inc(609);
        __CLR4_4_17w7wlgchoq4g.R.inc(610);return withMillis(getChronology().dayOfMonth().set(getMillis(), dayOfMonth));
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the day of week field updated.
     * <p>
     * DateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * day of week changed.
     *
     * @param dayOfWeek the day of week to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateTime withDayOfWeek(int dayOfWeek) {try{__CLR4_4_17w7wlgchoq4g.R.inc(611);
        __CLR4_4_17w7wlgchoq4g.R.inc(612);return withMillis(getChronology().dayOfWeek().set(getMillis(), dayOfWeek));
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this datetime with the hour of day field updated.
     * <p>
     * DateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * hour of day changed.
     *
     * @param hour the hour of day to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateTime withHourOfDay(int hour) {try{__CLR4_4_17w7wlgchoq4g.R.inc(613);
        __CLR4_4_17w7wlgchoq4g.R.inc(614);return withMillis(getChronology().hourOfDay().set(getMillis(), hour));
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the minute of hour updated.
     * <p>
     * DateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * minute of hour changed.
     *
     * @param minute the minute of hour to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateTime withMinuteOfHour(int minute) {try{__CLR4_4_17w7wlgchoq4g.R.inc(615);
        __CLR4_4_17w7wlgchoq4g.R.inc(616);return withMillis(getChronology().minuteOfHour().set(getMillis(), minute));
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the second of minute field updated.
     * <p>
     * DateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * second of minute changed.
     *
     * @param second the second of minute to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateTime withSecondOfMinute(int second) {try{__CLR4_4_17w7wlgchoq4g.R.inc(617);
        __CLR4_4_17w7wlgchoq4g.R.inc(618);return withMillis(getChronology().secondOfMinute().set(getMillis(), second));
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the millis of second field updated.
     * <p>
     * DateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * millis of second changed.
     *
     * @param millis the millis of second to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateTime withMillisOfSecond(int millis) {try{__CLR4_4_17w7wlgchoq4g.R.inc(619);
        __CLR4_4_17w7wlgchoq4g.R.inc(620);return withMillis(getChronology().millisOfSecond().set(getMillis(), millis));
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the millis of day field updated.
     * <p>
     * DateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * millis of day changed.
     *
     * @param millis the millis of day to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateTime withMillisOfDay(int millis) {try{__CLR4_4_17w7wlgchoq4g.R.inc(621);
        __CLR4_4_17w7wlgchoq4g.R.inc(622);return withMillis(getChronology().millisOfDay().set(getMillis(), millis));
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    // Date properties
    //-----------------------------------------------------------------------

    /**
     * Get the era property which provides access to advanced functionality.
     *
     * @return the era property
     */
    public Property era() {try{__CLR4_4_17w7wlgchoq4g.R.inc(623);
        __CLR4_4_17w7wlgchoq4g.R.inc(624);return new Property(this, getChronology().era());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Get the century of era property which provides access to advanced functionality.
     *
     * @return the year of era property
     */
    public Property centuryOfEra() {try{__CLR4_4_17w7wlgchoq4g.R.inc(625);
        __CLR4_4_17w7wlgchoq4g.R.inc(626);return new Property(this, getChronology().centuryOfEra());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Get the year of century property which provides access to advanced functionality.
     *
     * @return the year of era property
     */
    public Property yearOfCentury() {try{__CLR4_4_17w7wlgchoq4g.R.inc(627);
        __CLR4_4_17w7wlgchoq4g.R.inc(628);return new Property(this, getChronology().yearOfCentury());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Get the year of era property which provides access to advanced functionality.
     *
     * @return the year of era property
     */
    public Property yearOfEra() {try{__CLR4_4_17w7wlgchoq4g.R.inc(629);
        __CLR4_4_17w7wlgchoq4g.R.inc(630);return new Property(this, getChronology().yearOfEra());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Get the year property which provides access to advanced functionality.
     *
     * @return the year property
     */
    public Property year() {try{__CLR4_4_17w7wlgchoq4g.R.inc(631);
        __CLR4_4_17w7wlgchoq4g.R.inc(632);return new Property(this, getChronology().year());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Get the year of a week based year property which provides access to advanced functionality.
     *
     * @return the year of a week based year property
     */
    public Property weekyear() {try{__CLR4_4_17w7wlgchoq4g.R.inc(633);
        __CLR4_4_17w7wlgchoq4g.R.inc(634);return new Property(this, getChronology().weekyear());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Get the month of year property which provides access to advanced functionality.
     *
     * @return the month of year property
     */
    public Property monthOfYear() {try{__CLR4_4_17w7wlgchoq4g.R.inc(635);
        __CLR4_4_17w7wlgchoq4g.R.inc(636);return new Property(this, getChronology().monthOfYear());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Get the week of a week based year property which provides access to advanced functionality.
     *
     * @return the week of a week based year property
     */
    public Property weekOfWeekyear() {try{__CLR4_4_17w7wlgchoq4g.R.inc(637);
        __CLR4_4_17w7wlgchoq4g.R.inc(638);return new Property(this, getChronology().weekOfWeekyear());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Get the day of year property which provides access to advanced functionality.
     *
     * @return the day of year property
     */
    public Property dayOfYear() {try{__CLR4_4_17w7wlgchoq4g.R.inc(639);
        __CLR4_4_17w7wlgchoq4g.R.inc(640);return new Property(this, getChronology().dayOfYear());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Get the day of month property which provides access to advanced functionality.
     *
     * @return the day of month property
     */
    public Property dayOfMonth() {try{__CLR4_4_17w7wlgchoq4g.R.inc(641);
        __CLR4_4_17w7wlgchoq4g.R.inc(642);return new Property(this, getChronology().dayOfMonth());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Get the day of week property which provides access to advanced functionality.
     *
     * @return the day of week property
     */
    public Property dayOfWeek() {try{__CLR4_4_17w7wlgchoq4g.R.inc(643);
        __CLR4_4_17w7wlgchoq4g.R.inc(644);return new Property(this, getChronology().dayOfWeek());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    // Time properties
    //-----------------------------------------------------------------------

    /**
     * Get the hour of day field property which provides access to advanced functionality.
     *
     * @return the hour of day property
     */
    public Property hourOfDay() {try{__CLR4_4_17w7wlgchoq4g.R.inc(645);
        __CLR4_4_17w7wlgchoq4g.R.inc(646);return new Property(this, getChronology().hourOfDay());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Get the minute of day property which provides access to advanced functionality.
     *
     * @return the minute of day property
     */
    public Property minuteOfDay() {try{__CLR4_4_17w7wlgchoq4g.R.inc(647);
        __CLR4_4_17w7wlgchoq4g.R.inc(648);return new Property(this, getChronology().minuteOfDay());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Get the minute of hour field property which provides access to advanced functionality.
     *
     * @return the minute of hour property
     */
    public Property minuteOfHour() {try{__CLR4_4_17w7wlgchoq4g.R.inc(649);
        __CLR4_4_17w7wlgchoq4g.R.inc(650);return new Property(this, getChronology().minuteOfHour());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Get the second of day property which provides access to advanced functionality.
     *
     * @return the second of day property
     */
    public Property secondOfDay() {try{__CLR4_4_17w7wlgchoq4g.R.inc(651);
        __CLR4_4_17w7wlgchoq4g.R.inc(652);return new Property(this, getChronology().secondOfDay());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Get the second of minute field property which provides access to advanced functionality.
     *
     * @return the second of minute property
     */
    public Property secondOfMinute() {try{__CLR4_4_17w7wlgchoq4g.R.inc(653);
        __CLR4_4_17w7wlgchoq4g.R.inc(654);return new Property(this, getChronology().secondOfMinute());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Get the millis of day property which provides access to advanced functionality.
     *
     * @return the millis of day property
     */
    public Property millisOfDay() {try{__CLR4_4_17w7wlgchoq4g.R.inc(655);
        __CLR4_4_17w7wlgchoq4g.R.inc(656);return new Property(this, getChronology().millisOfDay());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    /**
     * Get the millis of second property which provides access to advanced functionality.
     *
     * @return the millis of second property
     */
    public Property millisOfSecond() {try{__CLR4_4_17w7wlgchoq4g.R.inc(657);
        __CLR4_4_17w7wlgchoq4g.R.inc(658);return new Property(this, getChronology().millisOfSecond());
    }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * DateTime.Property binds a DateTime to a DateTimeField allowing powerful
     * datetime functionality to be easily accessed.
     * <p>
     * The simplest use of this class is as an alternative get method, here used to
     * get the year '1972' (as an int) and the month 'December' (as a String).
     * <pre>
     * DateTime dt = new DateTime(1972, 12, 3, 0, 0, 0, 0);
     * int year = dt.year().get();
     * String monthStr = dt.month().getAsText();
     * </pre>
     * <p>
     * Methods are also provided that allow date modification. These return new instances
     * of DateTime - they do not modify the original. The example below yields two
     * independent immutable date objects 20 years apart.
     * <pre>
     * DateTime dt = new DateTime(1972, 12, 3, 0, 0, 0, 0);
     * DateTime dt20 = dt.year().addToCopy(20);
     * </pre>
     * Serious modification of dates (ie. more than just changing one or two fields)
     * should use the {@link org.joda.time.MutableDateTime MutableDateTime} class.
     * <p>
     * DateTime.Propery itself is thread-safe and immutable, as well as the
     * DateTime being operated on.
     *
     * @author Stephen Colebourne
     * @author Brian S O'Neill
     * @since 1.0
     */
    public static final class Property extends AbstractReadableInstantFieldProperty {

        /**
         * Serialization version
         */
        private static final long serialVersionUID = -6983323811635733510L;

        /**
         * The instant this property is working against
         */
        private DateTime iInstant;
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
        Property(DateTime instant, DateTimeField field) {
            super();__CLR4_4_17w7wlgchoq4g.R.inc(660);try{__CLR4_4_17w7wlgchoq4g.R.inc(659);
            __CLR4_4_17w7wlgchoq4g.R.inc(661);iInstant = instant;
            __CLR4_4_17w7wlgchoq4g.R.inc(662);iField = field;
        }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

        /**
         * Writes the property in a safe serialization format.
         */
        private void writeObject(ObjectOutputStream oos) throws IOException {try{__CLR4_4_17w7wlgchoq4g.R.inc(663);
            __CLR4_4_17w7wlgchoq4g.R.inc(664);oos.writeObject(iInstant);
            __CLR4_4_17w7wlgchoq4g.R.inc(665);oos.writeObject(iField.getType());
        }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

        /**
         * Reads the property from a safe serialization format.
         */
        private void readObject(ObjectInputStream oos) throws IOException, ClassNotFoundException {try{__CLR4_4_17w7wlgchoq4g.R.inc(666);
            __CLR4_4_17w7wlgchoq4g.R.inc(667);iInstant = (DateTime) oos.readObject();
            __CLR4_4_17w7wlgchoq4g.R.inc(668);DateTimeFieldType type = (DateTimeFieldType) oos.readObject();
            __CLR4_4_17w7wlgchoq4g.R.inc(669);iField = type.getField(iInstant.getChronology());
        }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Gets the field being used.
         *
         * @return the field
         */
        public DateTimeField getField() {try{__CLR4_4_17w7wlgchoq4g.R.inc(670);
            __CLR4_4_17w7wlgchoq4g.R.inc(671);return iField;
        }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

        /**
         * Gets the milliseconds of the datetime that this property is linked to.
         *
         * @return the milliseconds
         */
        protected long getMillis() {try{__CLR4_4_17w7wlgchoq4g.R.inc(672);
            __CLR4_4_17w7wlgchoq4g.R.inc(673);return iInstant.getMillis();
        }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

        /**
         * Gets the chronology of the datetime that this property is linked to.
         *
         * @return the chronology
         * @since 1.4
         */
        protected Chronology getChronology() {try{__CLR4_4_17w7wlgchoq4g.R.inc(674);
            __CLR4_4_17w7wlgchoq4g.R.inc(675);return iInstant.getChronology();
        }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

        /**
         * Gets the datetime being used.
         *
         * @return the datetime
         */
        public DateTime getDateTime() {try{__CLR4_4_17w7wlgchoq4g.R.inc(676);
            __CLR4_4_17w7wlgchoq4g.R.inc(677);return iInstant;
        }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Adds to this field in a copy of this DateTime.
         * <p>
         * The DateTime attached to this property is unchanged by this call.
         * This operation is faster than converting a DateTime to a MutableDateTime
         * and back again when setting one field. When setting multiple fields,
         * it is generally quicker to make the conversion to MutableDateTime.
         *
         * @param value the value to add to the field in the copy
         * @return a copy of the DateTime with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public DateTime addToCopy(int value) {try{__CLR4_4_17w7wlgchoq4g.R.inc(678);
            __CLR4_4_17w7wlgchoq4g.R.inc(679);return iInstant.withMillis(iField.add(iInstant.getMillis(), value));
        }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

        /**
         * Adds to this field in a copy of this DateTime.
         * <p>
         * The DateTime attached to this property is unchanged by this call.
         * This operation is faster than converting a DateTime to a MutableDateTime
         * and back again when setting one field. When setting multiple fields,
         * it is generally quicker to make the conversion to MutableDateTime.
         *
         * @param value the value to add to the field in the copy
         * @return a copy of the DateTime with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public DateTime addToCopy(long value) {try{__CLR4_4_17w7wlgchoq4g.R.inc(680);
            __CLR4_4_17w7wlgchoq4g.R.inc(681);return iInstant.withMillis(iField.add(iInstant.getMillis(), value));
        }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

        /**
         * Adds to this field, possibly wrapped, in a copy of this DateTime.
         * A wrapped operation only changes this field.
         * Thus 31st January addWrapField one day goes to the 1st January.
         * <p>
         * The DateTime attached to this property is unchanged by this call.
         * This operation is faster than converting a DateTime to a MutableDateTime
         * and back again when setting one field. When setting multiple fields,
         * it is generally quicker to make the conversion to MutableDateTime.
         *
         * @param value the value to add to the field in the copy
         * @return a copy of the DateTime with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public DateTime addWrapFieldToCopy(int value) {try{__CLR4_4_17w7wlgchoq4g.R.inc(682);
            __CLR4_4_17w7wlgchoq4g.R.inc(683);return iInstant.withMillis(iField.addWrapField(iInstant.getMillis(), value));
        }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Sets this field in a copy of the DateTime.
         * <p>
         * The DateTime attached to this property is unchanged by this call.
         * This operation is faster than converting a DateTime to a MutableDateTime
         * and back again when setting one field. When setting multiple fields,
         * it is generally quicker to make the conversion to MutableDateTime.
         *
         * @param value the value to set the field in the copy to
         * @return a copy of the DateTime with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public DateTime setCopy(int value) {try{__CLR4_4_17w7wlgchoq4g.R.inc(684);
            __CLR4_4_17w7wlgchoq4g.R.inc(685);return iInstant.withMillis(iField.set(iInstant.getMillis(), value));
        }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

        /**
         * Sets this field in a copy of the DateTime to a parsed text value.
         * <p>
         * The DateTime attached to this property is unchanged by this call.
         * This operation is faster than converting a DateTime to a MutableDateTime
         * and back again when setting one field. When setting multiple fields,
         * it is generally quicker to make the conversion to MutableDateTime.
         *
         * @param text   the text value to set
         * @param locale optional locale to use for selecting a text symbol
         * @return a copy of the DateTime with the field value changed
         * @throws IllegalArgumentException if the text value isn't valid
         */
        public DateTime setCopy(String text, Locale locale) {try{__CLR4_4_17w7wlgchoq4g.R.inc(686);
            __CLR4_4_17w7wlgchoq4g.R.inc(687);return iInstant.withMillis(iField.set(iInstant.getMillis(), text, locale));
        }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

        /**
         * Sets this field in a copy of the DateTime to a parsed text value.
         * <p>
         * The DateTime attached to this property is unchanged by this call.
         * This operation is faster than converting a DateTime to a MutableDateTime
         * and back again when setting one field. When setting multiple fields,
         * it is generally quicker to make the conversion to MutableDateTime.
         *
         * @param text the text value to set
         * @return a copy of the DateTime with the field value changed
         * @throws IllegalArgumentException if the text value isn't valid
         */
        public DateTime setCopy(String text) {try{__CLR4_4_17w7wlgchoq4g.R.inc(688);
            __CLR4_4_17w7wlgchoq4g.R.inc(689);return setCopy(text, null);
        }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Returns a new DateTime with this field set to the maximum value
         * for this field.
         * <p>
         * This operation is useful for obtaining a DateTime on the last day
         * of the month, as month lengths vary.
         * <pre>
         * DateTime lastDayOfMonth = dt.dayOfMonth().withMaximumValue();
         * </pre>
         * <p>
         * Where possible, the offset from UTC will be retained, thus applications
         * may need to call {@link DateTime#withLaterOffsetAtOverlap()} on the result
         * to force the later time during a DST overlap if desired.
         * <p>
         * From v2.2, this method handles a daylight savings time gap, setting the
         * time to the last instant before the gap.
         * <p>
         * The DateTime attached to this property is unchanged by this call.
         *
         * @return a copy of the DateTime with this field set to its maximum
         * @since 1.2
         */
        public DateTime withMaximumValue() {try{__CLR4_4_17w7wlgchoq4g.R.inc(690);
            __CLR4_4_17w7wlgchoq4g.R.inc(691);try {
                __CLR4_4_17w7wlgchoq4g.R.inc(692);return setCopy(getMaximumValue());
            } catch (RuntimeException ex) {
                __CLR4_4_17w7wlgchoq4g.R.inc(693);if ((((IllegalInstantException.isIllegalInstant(ex))&&(__CLR4_4_17w7wlgchoq4g.R.iget(694)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(695)==0&false))) {{
                    // adding MILLIS_PER_DAY is not perfect, but will work in almost all situations
                    __CLR4_4_17w7wlgchoq4g.R.inc(696);long beforeGap = getChronology().getZone().previousTransition(getMillis() + DateTimeConstants.MILLIS_PER_DAY);
                    __CLR4_4_17w7wlgchoq4g.R.inc(697);return new DateTime(beforeGap, getChronology());
                }
                }__CLR4_4_17w7wlgchoq4g.R.inc(698);throw ex;
            }
        }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

        /**
         * Returns a new DateTime with this field set to the minimum value
         * for this field.
         * <p>
         * Where possible, the offset from UTC will be retained, thus applications
         * may need to call {@link DateTime#withEarlierOffsetAtOverlap()} on the result
         * to force the earlier time during a DST overlap if desired.
         * <p>
         * From v2.2, this method handles a daylight savings time gap, setting the
         * time to the first instant after the gap.
         * <p>
         * The DateTime attached to this property is unchanged by this call.
         *
         * @return a copy of the DateTime with this field set to its minimum
         * @since 1.2
         */
        public DateTime withMinimumValue() {try{__CLR4_4_17w7wlgchoq4g.R.inc(699);
            __CLR4_4_17w7wlgchoq4g.R.inc(700);try {
                __CLR4_4_17w7wlgchoq4g.R.inc(701);return setCopy(getMinimumValue());
            } catch (RuntimeException ex) {
                __CLR4_4_17w7wlgchoq4g.R.inc(702);if ((((IllegalInstantException.isIllegalInstant(ex))&&(__CLR4_4_17w7wlgchoq4g.R.iget(703)!=0|true))||(__CLR4_4_17w7wlgchoq4g.R.iget(704)==0&false))) {{
                    // subtracting MILLIS_PER_DAY is not perfect, but will work in almost all situations
                    __CLR4_4_17w7wlgchoq4g.R.inc(705);long afterGap = getChronology().getZone().nextTransition(getMillis() - DateTimeConstants.MILLIS_PER_DAY);
                    __CLR4_4_17w7wlgchoq4g.R.inc(706);return new DateTime(afterGap, getChronology());
                }
                }__CLR4_4_17w7wlgchoq4g.R.inc(707);throw ex;
            }
        }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Rounds to the lowest whole unit of this field on a copy of this DateTime.
         *
         * @return a copy of the DateTime with the field value changed
         */
        public DateTime roundFloorCopy() {try{__CLR4_4_17w7wlgchoq4g.R.inc(708);
            __CLR4_4_17w7wlgchoq4g.R.inc(709);return iInstant.withMillis(iField.roundFloor(iInstant.getMillis()));
        }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

        /**
         * Rounds to the highest whole unit of this field on a copy of this DateTime.
         *
         * @return a copy of the DateTime with the field value changed
         */
        public DateTime roundCeilingCopy() {try{__CLR4_4_17w7wlgchoq4g.R.inc(710);
            __CLR4_4_17w7wlgchoq4g.R.inc(711);return iInstant.withMillis(iField.roundCeiling(iInstant.getMillis()));
        }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

        /**
         * Rounds to the nearest whole unit of this field on a copy of this DateTime,
         * favoring the floor if halfway.
         *
         * @return a copy of the DateTime with the field value changed
         */
        public DateTime roundHalfFloorCopy() {try{__CLR4_4_17w7wlgchoq4g.R.inc(712);
            __CLR4_4_17w7wlgchoq4g.R.inc(713);return iInstant.withMillis(iField.roundHalfFloor(iInstant.getMillis()));
        }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

        /**
         * Rounds to the nearest whole unit of this field on a copy of this DateTime,
         * favoring the ceiling if halfway.
         *
         * @return a copy of the DateTime with the field value changed
         */
        public DateTime roundHalfCeilingCopy() {try{__CLR4_4_17w7wlgchoq4g.R.inc(714);
            __CLR4_4_17w7wlgchoq4g.R.inc(715);return iInstant.withMillis(iField.roundHalfCeiling(iInstant.getMillis()));
        }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}

        /**
         * Rounds to the nearest whole unit of this field on a copy of this
         * DateTime.  If halfway, the ceiling is favored over the floor only if
         * it makes this field's value even.
         *
         * @return a copy of the DateTime with the field value changed
         */
        public DateTime roundHalfEvenCopy() {try{__CLR4_4_17w7wlgchoq4g.R.inc(716);
            __CLR4_4_17w7wlgchoq4g.R.inc(717);return iInstant.withMillis(iField.roundHalfEven(iInstant.getMillis()));
        }finally{__CLR4_4_17w7wlgchoq4g.R.flushNeeded();}}
    }

}
