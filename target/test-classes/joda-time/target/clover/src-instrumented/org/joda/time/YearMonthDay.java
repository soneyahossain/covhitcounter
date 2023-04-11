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

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISODateTimeFormat;

/**
 * YearMonthDay is an immutable partial supporting the year, monthOfYear
 * and dayOfMonth fields.
 * <p>
 * NOTE: This class only supports the three fields listed above. Thus, you
 * cannot query the dayOfWeek or centuryOfEra fields for example.
 * The new <code>LocalDate</code> class removes this restriction.
 * <p>
 * Calculations on YearMonthDay are performed using a {@link Chronology}.
 * This chronology is set to be in the UTC time zone for all calculations.
 * <p>
 * Each individual field can be queried in two ways:
 * <ul>
 * <li><code>getMonthOfYear()</code>
 * <li><code>monthOfYear().get()</code>
 * </ul>
 * The second technique also provides access to other useful methods on the
 * field:
 * <ul>
 * <li>numeric value - <code>monthOfYear().get()</code>
 * <li>text value - <code>monthOfYear().getAsText()</code>
 * <li>short text value - <code>monthOfYear().getAsShortText()</code>
 * <li>maximum/minimum values - <code>monthOfYear().getMaximumValue()</code>
 * <li>add/subtract - <code>monthOfYear().addToCopy()</code>
 * <li>set - <code>monthOfYear().setCopy()</code>
 * </ul>
 * <p>
 * YearMonthDay is thread-safe and immutable, provided that the Chronology is as well.
 * All standard Chronology classes supplied are thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @since 1.0
 * @deprecated Use LocalDate which has a much better internal implementation and
 * has been available since 1.3
 */
@java.lang.SuppressWarnings({"fallthrough"}) @Deprecated
public final class YearMonthDay
        extends BasePartial
        implements ReadablePartial, Serializable {public static class __CLR4_4_15ci5cilgchoqkd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,7137,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization version
     */
    private static final long serialVersionUID = 797544782896179L;
    /**
     * The singleton set of field types
     */
    private static final DateTimeFieldType[] FIELD_TYPES = new DateTimeFieldType[]{
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth(),
    };

    /**
     * The index of the year field in the field array
     */
    public static final int YEAR = 0;
    /**
     * The index of the monthOfYear field in the field array
     */
    public static final int MONTH_OF_YEAR = 1;
    /**
     * The index of the dayOfMonth field in the field array
     */
    public static final int DAY_OF_MONTH = 2;

    //-----------------------------------------------------------------------

    /**
     * Constructs a YearMonthDay from a <code>java.util.Calendar</code>
     * using exactly the same field values avoiding any time zone effects.
     * <p>
     * Each field is queried from the Calendar and assigned to the YearMonthDay.
     * This is useful if you have been using the Calendar as a local date,
     * ignoring the zone.
     * <p>
     * This factory method ignores the type of the calendar and always
     * creates a YearMonthDay with ISO chronology. It is expected that you
     * will only pass in instances of <code>GregorianCalendar</code> however
     * this is not validated.
     *
     * @param calendar the Calendar to extract fields from
     * @return the created YearMonthDay
     * @throws IllegalArgumentException if the calendar is null
     * @throws IllegalArgumentException if the date is invalid for the ISO chronology
     * @since 1.2
     */
    public static YearMonthDay fromCalendarFields(Calendar calendar) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(6930);
        __CLR4_4_15ci5cilgchoqkd.R.inc(6931);if ((((calendar == null)&&(__CLR4_4_15ci5cilgchoqkd.R.iget(6932)!=0|true))||(__CLR4_4_15ci5cilgchoqkd.R.iget(6933)==0&false))) {{
            __CLR4_4_15ci5cilgchoqkd.R.inc(6934);throw new IllegalArgumentException("The calendar must not be null");
        }
        }__CLR4_4_15ci5cilgchoqkd.R.inc(6935);return new YearMonthDay(
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH) + 1,
                calendar.get(Calendar.DAY_OF_MONTH)
        );
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Constructs a YearMonthDay from a <code>java.util.Date</code>
     * using exactly the same field values avoiding any time zone effects.
     * <p>
     * Each field is queried from the Date and assigned to the YearMonthDay.
     * This is useful if you have been using the Date as a local date,
     * ignoring the zone.
     * <p>
     * This factory method always creates a YearMonthDay with ISO chronology.
     *
     * @param date the Date to extract fields from
     * @return the created YearMonthDay
     * @throws IllegalArgumentException if the calendar is null
     * @throws IllegalArgumentException if the date is invalid for the ISO chronology
     * @since 1.2
     */
    public static YearMonthDay fromDateFields(Date date) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(6936);
        __CLR4_4_15ci5cilgchoqkd.R.inc(6937);if ((((date == null)&&(__CLR4_4_15ci5cilgchoqkd.R.iget(6938)!=0|true))||(__CLR4_4_15ci5cilgchoqkd.R.iget(6939)==0&false))) {{
            __CLR4_4_15ci5cilgchoqkd.R.inc(6940);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_15ci5cilgchoqkd.R.inc(6941);return new YearMonthDay(
                date.getYear() + 1900,
                date.getMonth() + 1,
                date.getDate()
        );
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs a YearMonthDay with the current date, using ISOChronology in
     * the default zone to extract the fields.
     * <p>
     * The constructor uses the default time zone, resulting in the local time
     * being initialised. Once the constructor is complete, all further calculations
     * are performed without reference to a timezone (by switching to UTC).
     */
    public YearMonthDay() {
        super();__CLR4_4_15ci5cilgchoqkd.R.inc(6943);try{__CLR4_4_15ci5cilgchoqkd.R.inc(6942);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Constructs a YearMonthDay with the current date, using ISOChronology in
     * the specified zone to extract the fields.
     * <p>
     * The constructor uses the specified time zone to obtain the current date.
     * Once the constructor is complete, all further calculations
     * are performed without reference to a timezone (by switching to UTC).
     *
     * @param zone the zone to use, null means default zone
     * @since 1.1
     */
    public YearMonthDay(DateTimeZone zone) {
        super(ISOChronology.getInstance(zone));__CLR4_4_15ci5cilgchoqkd.R.inc(6945);try{__CLR4_4_15ci5cilgchoqkd.R.inc(6944);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Constructs a YearMonthDay with the current date, using the specified chronology
     * and zone to extract the fields.
     * <p>
     * The constructor uses the time zone of the chronology specified.
     * Once the constructor is complete, all further calculations are performed
     * without reference to a timezone (by switching to UTC).
     *
     * @param chronology the chronology, null means ISOChronology in the default zone
     */
    public YearMonthDay(Chronology chronology) {
        super(chronology);__CLR4_4_15ci5cilgchoqkd.R.inc(6947);try{__CLR4_4_15ci5cilgchoqkd.R.inc(6946);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Constructs a YearMonthDay extracting the partial fields from the specified
     * milliseconds using the ISOChronology in the default zone.
     * <p>
     * The constructor uses the default time zone, resulting in the local time
     * being initialised. Once the constructor is complete, all further calculations
     * are performed without reference to a timezone (by switching to UTC).
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z
     */
    public YearMonthDay(long instant) {
        super(instant);__CLR4_4_15ci5cilgchoqkd.R.inc(6949);try{__CLR4_4_15ci5cilgchoqkd.R.inc(6948);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Constructs a YearMonthDay extracting the partial fields from the specified
     * milliseconds using the chronology provided.
     * <p>
     * The constructor uses the time zone of the chronology specified.
     * Once the constructor is complete, all further calculations are performed
     * without reference to a timezone (by switching to UTC).
     *
     * @param instant    the milliseconds from 1970-01-01T00:00:00Z
     * @param chronology the chronology, null means ISOChronology in the default zone
     */
    public YearMonthDay(long instant, Chronology chronology) {
        super(instant, chronology);__CLR4_4_15ci5cilgchoqkd.R.inc(6951);try{__CLR4_4_15ci5cilgchoqkd.R.inc(6950);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Constructs a YearMonthDay from an Object that represents a time.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadableInstant, String, Calendar and Date.
     * The String formats are described by {@link ISODateTimeFormat#dateOptionalTimeParser()}.
     * <p>
     * The chronology used will be derived from the object, defaulting to ISO.
     * <p>
     * NOTE: Prior to v1.3 the string format was described by
     * {@link ISODateTimeFormat#dateTimeParser()}. Time only strings are now rejected.
     *
     * @param instant the datetime object, null means now
     * @throws IllegalArgumentException if the instant is invalid
     */
    public YearMonthDay(Object instant) {
        super(instant, null, ISODateTimeFormat.dateOptionalTimeParser());__CLR4_4_15ci5cilgchoqkd.R.inc(6953);try{__CLR4_4_15ci5cilgchoqkd.R.inc(6952);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Constructs a YearMonthDay from an Object that represents a time, using the
     * specified chronology.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadableInstant, String, Calendar and Date.
     * The String formats are described by {@link ISODateTimeFormat#dateOptionalTimeParser()}.
     * <p>
     * The constructor uses the time zone of the chronology specified.
     * Once the constructor is complete, all further calculations are performed
     * without reference to a timezone (by switching to UTC).
     * The specified chronology overrides that of the object.
     * <p>
     * NOTE: Prior to v1.3 the string format was described by
     * {@link ISODateTimeFormat#dateTimeParser()}. Time only strings are now rejected.
     *
     * @param instant    the datetime object, null means now
     * @param chronology the chronology, null means ISO default
     * @throws IllegalArgumentException if the instant is invalid
     */
    public YearMonthDay(Object instant, Chronology chronology) {
        super(instant, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.dateOptionalTimeParser());__CLR4_4_15ci5cilgchoqkd.R.inc(6955);try{__CLR4_4_15ci5cilgchoqkd.R.inc(6954);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Constructs a YearMonthDay with specified time field values
     * using <code>ISOChronology</code> in the default zone.
     * <p>
     * The constructor uses the no time zone initialising the fields as provided.
     * Once the constructor is complete, all further calculations
     * are performed without reference to a timezone (by switching to UTC).
     *
     * @param year        the year
     * @param monthOfYear the month of the year
     * @param dayOfMonth  the day of the month
     */
    public YearMonthDay(int year, int monthOfYear, int dayOfMonth) {
        this(year, monthOfYear, dayOfMonth, null);__CLR4_4_15ci5cilgchoqkd.R.inc(6957);try{__CLR4_4_15ci5cilgchoqkd.R.inc(6956);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Constructs a YearMonthDay with specified time field values.
     * <p>
     * The constructor uses the time zone of the chronology specified.
     * Once the constructor is complete, all further calculations are performed
     * without reference to a timezone (by switching to UTC).
     *
     * @param year        the year
     * @param monthOfYear the month of the year
     * @param dayOfMonth  the day of the month
     * @param chronology  the chronology, null means ISOChronology in the default zone
     */
    public YearMonthDay(int year, int monthOfYear, int dayOfMonth, Chronology chronology) {
        super(new int[]{year, monthOfYear, dayOfMonth}, chronology);__CLR4_4_15ci5cilgchoqkd.R.inc(6959);try{__CLR4_4_15ci5cilgchoqkd.R.inc(6958);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Constructs a YearMonthDay with chronology from this instance and new values.
     *
     * @param partial the partial to base this new instance on
     * @param values  the new set of values
     */
    YearMonthDay(YearMonthDay partial, int[] values) {
        super(partial, values);__CLR4_4_15ci5cilgchoqkd.R.inc(6961);try{__CLR4_4_15ci5cilgchoqkd.R.inc(6960);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Constructs a YearMonthDay with values from this instance and a new chronology.
     *
     * @param partial the partial to base this new instance on
     * @param chrono  the new chronology
     */
    YearMonthDay(YearMonthDay partial, Chronology chrono) {
        super(partial, chrono);__CLR4_4_15ci5cilgchoqkd.R.inc(6963);try{__CLR4_4_15ci5cilgchoqkd.R.inc(6962);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the number of fields in this partial.
     *
     * @return the field count
     */
    public int size() {try{__CLR4_4_15ci5cilgchoqkd.R.inc(6964);
        __CLR4_4_15ci5cilgchoqkd.R.inc(6965);return 3;
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Gets the field for a specific index in the chronology specified.
     * <p>
     * This method must not use any instance variables.
     *
     * @param index  the index to retrieve
     * @param chrono the chronology to use
     * @return the field
     */
    protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(6966);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_15ci5cilgchoqkd.R.inc(6967);switch (index) {
            case YEAR:if (!__CLB4_4_1_bool0) {__CLR4_4_15ci5cilgchoqkd.R.inc(6968);__CLB4_4_1_bool0=true;}
                __CLR4_4_15ci5cilgchoqkd.R.inc(6969);return chrono.year();
            case MONTH_OF_YEAR:if (!__CLB4_4_1_bool0) {__CLR4_4_15ci5cilgchoqkd.R.inc(6970);__CLB4_4_1_bool0=true;}
                __CLR4_4_15ci5cilgchoqkd.R.inc(6971);return chrono.monthOfYear();
            case DAY_OF_MONTH:if (!__CLB4_4_1_bool0) {__CLR4_4_15ci5cilgchoqkd.R.inc(6972);__CLB4_4_1_bool0=true;}
                __CLR4_4_15ci5cilgchoqkd.R.inc(6973);return chrono.dayOfMonth();
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_15ci5cilgchoqkd.R.inc(6974);__CLB4_4_1_bool0=true;}
                __CLR4_4_15ci5cilgchoqkd.R.inc(6975);throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Gets the field type at the specified index.
     *
     * @param index the index to retrieve
     * @return the field at the specified index
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public DateTimeFieldType getFieldType(int index) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(6976);
        __CLR4_4_15ci5cilgchoqkd.R.inc(6977);return FIELD_TYPES[index];
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Gets an array of the field type of each of the fields that this partial supports.
     * <p>
     * The fields are returned largest to smallest, Year, Month, Day
     *
     * @return the array of field types (cloned), largest to smallest
     */
    public DateTimeFieldType[] getFieldTypes() {try{__CLR4_4_15ci5cilgchoqkd.R.inc(6978);
        __CLR4_4_15ci5cilgchoqkd.R.inc(6979);return (DateTimeFieldType[]) FIELD_TYPES.clone();
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this date with the specified chronology.
     * This instance is immutable and unaffected by this method call.
     * <p>
     * This method retains the values of the fields, thus the result will
     * typically refer to a different instant.
     * <p>
     * The time zone of the specified chronology is ignored, as YearMonthDay
     * operates without a time zone.
     *
     * @param newChronology the new chronology, null means ISO
     * @return a copy of this datetime with a different chronology
     * @throws IllegalArgumentException if the values are invalid for the new chronology
     */
    public YearMonthDay withChronologyRetainFields(Chronology newChronology) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(6980);
        __CLR4_4_15ci5cilgchoqkd.R.inc(6981);newChronology = DateTimeUtils.getChronology(newChronology);
        __CLR4_4_15ci5cilgchoqkd.R.inc(6982);newChronology = newChronology.withUTC();
        __CLR4_4_15ci5cilgchoqkd.R.inc(6983);if ((((newChronology == getChronology())&&(__CLR4_4_15ci5cilgchoqkd.R.iget(6984)!=0|true))||(__CLR4_4_15ci5cilgchoqkd.R.iget(6985)==0&false))) {{
            __CLR4_4_15ci5cilgchoqkd.R.inc(6986);return this;
        } }else {{
            __CLR4_4_15ci5cilgchoqkd.R.inc(6987);YearMonthDay newYearMonthDay = new YearMonthDay(this, newChronology);
            __CLR4_4_15ci5cilgchoqkd.R.inc(6988);newChronology.validate(newYearMonthDay, getValues());
            __CLR4_4_15ci5cilgchoqkd.R.inc(6989);return newYearMonthDay;
        }
    }}finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the specified field set to a new value.
     * <p>
     * For example, if the field type is <code>dayOfMonth</code> then the day
     * would be changed in the returned instance.
     * <p>
     * These three lines are equivalent:
     * <pre>
     * YearMonthDay updated = ymd.withField(DateTimeFieldType.dayOfMonth(), 6);
     * YearMonthDay updated = ymd.dayOfMonth().setCopy(6);
     * YearMonthDay updated = ymd.property(DateTimeFieldType.dayOfMonth()).setCopy(6);
     * </pre>
     *
     * @param fieldType the field type to set, not null
     * @param value     the value to set
     * @return a copy of this instance with the field set
     * @throws IllegalArgumentException if the value is null or invalid
     */
    public YearMonthDay withField(DateTimeFieldType fieldType, int value) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(6990);
        __CLR4_4_15ci5cilgchoqkd.R.inc(6991);int index = indexOfSupported(fieldType);
        __CLR4_4_15ci5cilgchoqkd.R.inc(6992);if ((((value == getValue(index))&&(__CLR4_4_15ci5cilgchoqkd.R.iget(6993)!=0|true))||(__CLR4_4_15ci5cilgchoqkd.R.iget(6994)==0&false))) {{
            __CLR4_4_15ci5cilgchoqkd.R.inc(6995);return this;
        }
        }__CLR4_4_15ci5cilgchoqkd.R.inc(6996);int[] newValues = getValues();
        __CLR4_4_15ci5cilgchoqkd.R.inc(6997);newValues = getField(index).set(this, index, newValues, value);
        __CLR4_4_15ci5cilgchoqkd.R.inc(6998);return new YearMonthDay(this, newValues);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the value of the specified field increased.
     * <p>
     * If the addition is zero, then <code>this</code> is returned.
     * <p>
     * These three lines are equivalent:
     * <pre>
     * YearMonthDay added = ymd.withFieldAdded(DurationFieldType.days(), 6);
     * YearMonthDay added = ymd.plusDays(6);
     * YearMonthDay added = ymd.dayOfMonth().addToCopy(6);
     * </pre>
     *
     * @param fieldType the field type to add to, not null
     * @param amount    the amount to add
     * @return a copy of this instance with the field updated
     * @throws IllegalArgumentException if the value is null or invalid
     * @throws ArithmeticException      if the new datetime exceeds the capacity
     */
    public YearMonthDay withFieldAdded(DurationFieldType fieldType, int amount) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(6999);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7000);int index = indexOfSupported(fieldType);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7001);if ((((amount == 0)&&(__CLR4_4_15ci5cilgchoqkd.R.iget(7002)!=0|true))||(__CLR4_4_15ci5cilgchoqkd.R.iget(7003)==0&false))) {{
            __CLR4_4_15ci5cilgchoqkd.R.inc(7004);return this;
        }
        }__CLR4_4_15ci5cilgchoqkd.R.inc(7005);int[] newValues = getValues();
        __CLR4_4_15ci5cilgchoqkd.R.inc(7006);newValues = getField(index).add(this, index, newValues, amount);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7007);return new YearMonthDay(this, newValues);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the specified period added.
     * <p>
     * If the addition is zero, then <code>this</code> is returned.
     * Fields in the period that aren't present in the partial are ignored.
     * <p>
     * This method is typically used to add multiple copies of complex
     * period instances. Adding one field is best achieved using methods
     * like {@link #withFieldAdded(DurationFieldType, int)}
     * or {@link #plusYears(int)}.
     *
     * @param period the period to add to this one, null means zero
     * @param scalar the amount of times to add, such as -1 to subtract once
     * @return a copy of this instance with the period added
     * @throws ArithmeticException if the new datetime exceeds the capacity
     */
    public YearMonthDay withPeriodAdded(ReadablePeriod period, int scalar) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7008);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7009);if ((((period == null || scalar == 0)&&(__CLR4_4_15ci5cilgchoqkd.R.iget(7010)!=0|true))||(__CLR4_4_15ci5cilgchoqkd.R.iget(7011)==0&false))) {{
            __CLR4_4_15ci5cilgchoqkd.R.inc(7012);return this;
        }
        }__CLR4_4_15ci5cilgchoqkd.R.inc(7013);int[] newValues = getValues();
        __CLR4_4_15ci5cilgchoqkd.R.inc(7014);for (int i = 0; (((i < period.size())&&(__CLR4_4_15ci5cilgchoqkd.R.iget(7015)!=0|true))||(__CLR4_4_15ci5cilgchoqkd.R.iget(7016)==0&false)); i++) {{
            __CLR4_4_15ci5cilgchoqkd.R.inc(7017);DurationFieldType fieldType = period.getFieldType(i);
            __CLR4_4_15ci5cilgchoqkd.R.inc(7018);int index = indexOf(fieldType);
            __CLR4_4_15ci5cilgchoqkd.R.inc(7019);if ((((index >= 0)&&(__CLR4_4_15ci5cilgchoqkd.R.iget(7020)!=0|true))||(__CLR4_4_15ci5cilgchoqkd.R.iget(7021)==0&false))) {{
                __CLR4_4_15ci5cilgchoqkd.R.inc(7022);newValues = getField(index).add(this, index, newValues,
                        FieldUtils.safeMultiply(period.getValue(i), scalar));
            }
        }}
        }__CLR4_4_15ci5cilgchoqkd.R.inc(7023);return new YearMonthDay(this, newValues);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this date with the specified period added.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * <p>
     * This method is typically used to add complex period instances.
     * Adding one field is best achieved using methods
     * like {@link #plusYears(int)}.
     *
     * @param period the duration to add to this one, null means zero
     * @return a copy of this instance with the period added
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public YearMonthDay plus(ReadablePeriod period) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7024);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7025);return withPeriodAdded(period, 1);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this date plus the specified number of years.
     * <p>
     * This date instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * YearMonthDay added = dt.plusYears(6);
     * YearMonthDay added = dt.plus(Period.years(6));
     * YearMonthDay added = dt.withFieldAdded(DurationFieldType.years(), 6);
     * </pre>
     *
     * @param years the amount of years to add, may be negative
     * @return the new date plus the increased years
     * @since 1.1
     */
    public YearMonthDay plusYears(int years) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7026);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7027);return withFieldAdded(DurationFieldType.years(), years);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Returns a copy of this date plus the specified number of months.
     * <p>
     * This date instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * YearMonthDay added = dt.plusMonths(6);
     * YearMonthDay added = dt.plus(Period.months(6));
     * YearMonthDay added = dt.withFieldAdded(DurationFieldType.months(), 6);
     * </pre>
     *
     * @param months the amount of months to add, may be negative
     * @return the new date plus the increased months
     * @since 1.1
     */
    public YearMonthDay plusMonths(int months) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7028);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7029);return withFieldAdded(DurationFieldType.months(), months);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Returns a copy of this date plus the specified number of days.
     * <p>
     * This date instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * YearMonthDay added = dt.plusDays(6);
     * YearMonthDay added = dt.plus(Period.days(6));
     * YearMonthDay added = dt.withFieldAdded(DurationFieldType.days(), 6);
     * </pre>
     *
     * @param days the amount of days to add, may be negative
     * @return the new date plus the increased days
     * @since 1.1
     */
    public YearMonthDay plusDays(int days) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7030);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7031);return withFieldAdded(DurationFieldType.days(), days);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this date with the specified period taken away.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * <p>
     * This method is typically used to subtract complex period instances.
     * Subtracting one field is best achieved using methods
     * like {@link #minusYears(int)}.
     *
     * @param period the period to reduce this instant by
     * @return a copy of this instance with the period taken away
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public YearMonthDay minus(ReadablePeriod period) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7032);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7033);return withPeriodAdded(period, -1);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this date minus the specified number of years.
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * YearMonthDay subtracted = dt.minusYears(6);
     * YearMonthDay subtracted = dt.minus(Period.years(6));
     * YearMonthDay subtracted = dt.withFieldAdded(DurationFieldType.years(), -6);
     * </pre>
     *
     * @param years the amount of years to subtract, may be negative
     * @return the new datetime minus the increased years
     * @since 1.1
     */
    public YearMonthDay minusYears(int years) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7034);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7035);return withFieldAdded(DurationFieldType.years(), FieldUtils.safeNegate(years));
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Returns a copy of this date minus the specified number of months.
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * YearMonthDay subtracted = dt.minusMonths(6);
     * YearMonthDay subtracted = dt.minus(Period.months(6));
     * YearMonthDay subtracted = dt.withFieldAdded(DurationFieldType.months(), -6);
     * </pre>
     *
     * @param months the amount of months to subtract, may be negative
     * @return the new datetime minus the increased months
     * @since 1.1
     */
    public YearMonthDay minusMonths(int months) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7036);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7037);return withFieldAdded(DurationFieldType.months(), FieldUtils.safeNegate(months));
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Returns a copy of this date minus the specified number of days.
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * YearMonthDay subtracted = dt.minusDays(6);
     * YearMonthDay subtracted = dt.minus(Period.days(6));
     * YearMonthDay subtracted = dt.withFieldAdded(DurationFieldType.days(), -6);
     * </pre>
     *
     * @param days the amount of days to subtract, may be negative
     * @return the new datetime minus the increased days
     * @since 1.1
     */
    public YearMonthDay minusDays(int days) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7038);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7039);return withFieldAdded(DurationFieldType.days(), FieldUtils.safeNegate(days));
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the property object for the specified type, which contains
     * many useful methods.
     *
     * @param type the field type to get the property for
     * @return the property object
     * @throws IllegalArgumentException if the field is null or unsupported
     */
    public Property property(DateTimeFieldType type) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7040);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7041);return new Property(this, indexOfSupported(type));
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this object to a LocalDate with the same date and chronology.
     *
     * @return a LocalDate with the same date and chronology
     * @since 1.3
     */
    public LocalDate toLocalDate() {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7042);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7043);return new LocalDate(getYear(), getMonthOfYear(), getDayOfMonth(), getChronology());
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this YearMonthDay to a full datetime at midnight using the
     * default time zone.
     *
     * @return this date as a datetime at midnight
     */
    public DateTime toDateTimeAtMidnight() {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7044);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7045);return toDateTimeAtMidnight(null);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Converts this YearMonthDay to a full datetime at midnight using the
     * specified time zone.
     * <p>
     * This method uses the chronology from this instance plus the time zone
     * specified.
     *
     * @param zone the zone to use, null means default
     * @return this date as a datetime at midnight
     */
    public DateTime toDateTimeAtMidnight(DateTimeZone zone) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7046);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7047);Chronology chrono = getChronology().withZone(zone);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7048);return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), 0, 0, 0, 0, chrono);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this partial to a full datetime using the default time zone
     * setting the date fields from this instance and the time fields from
     * the current time.
     *
     * @return this date as a datetime with the time as the current time
     */
    public DateTime toDateTimeAtCurrentTime() {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7049);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7050);return toDateTimeAtCurrentTime(null);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Converts this partial to a full datetime using the specified time zone
     * setting the date fields from this instance and the time fields from
     * the current time.
     * <p>
     * This method uses the chronology from this instance plus the time zone
     * specified.
     *
     * @param zone the zone to use, null means default
     * @return this date as a datetime with the time as the current time
     */
    public DateTime toDateTimeAtCurrentTime(DateTimeZone zone) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7051);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7052);Chronology chrono = getChronology().withZone(zone);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7053);long instantMillis = DateTimeUtils.currentTimeMillis();
        __CLR4_4_15ci5cilgchoqkd.R.inc(7054);long resolved = chrono.set(this, instantMillis);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7055);return new DateTime(resolved, chrono);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this object to a DateMidnight in the default time zone.
     *
     * @return the DateMidnight instance in the default zone
     */
    public DateMidnight toDateMidnight() {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7056);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7057);return toDateMidnight(null);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Converts this object to a DateMidnight.
     *
     * @param zone the zone to get the DateMidnight in, null means default
     * @return the DateMidnight instance
     */
    public DateMidnight toDateMidnight(DateTimeZone zone) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7058);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7059);Chronology chrono = getChronology().withZone(zone);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7060);return new DateMidnight(getYear(), getMonthOfYear(), getDayOfMonth(), chrono);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this object to a DateTime using a TimeOfDay to fill in the
     * missing fields and using the default time zone.
     * This instance is immutable and unaffected by this method call.
     * <p>
     * The resulting chronology is determined by the chronology of this
     * YearMonthDay plus the time zone.
     * The chronology of the time is ignored - only the field values are used.
     *
     * @param time the time of day to use, null means current time
     * @return the DateTime instance
     */
    public DateTime toDateTime(TimeOfDay time) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7061);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7062);return toDateTime(time, null);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Converts this object to a DateTime using a TimeOfDay to fill in the
     * missing fields.
     * This instance is immutable and unaffected by this method call.
     * <p>
     * The resulting chronology is determined by the chronology of this
     * YearMonthDay plus the time zone.
     * The chronology of the time is ignored - only the field values are used.
     *
     * @param time the time of day to use, null means current time
     * @param zone the zone to get the DateTime in, null means default
     * @return the DateTime instance
     */
    public DateTime toDateTime(TimeOfDay time, DateTimeZone zone) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7063);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7064);Chronology chrono = getChronology().withZone(zone);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7065);long instant = DateTimeUtils.currentTimeMillis();
        __CLR4_4_15ci5cilgchoqkd.R.inc(7066);instant = chrono.set(this, instant);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7067);if ((((time != null)&&(__CLR4_4_15ci5cilgchoqkd.R.iget(7068)!=0|true))||(__CLR4_4_15ci5cilgchoqkd.R.iget(7069)==0&false))) {{
            __CLR4_4_15ci5cilgchoqkd.R.inc(7070);instant = chrono.set(time, instant);
        }
        }__CLR4_4_15ci5cilgchoqkd.R.inc(7071);return new DateTime(instant, chrono);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this object to an Interval representing the whole day
     * in the default time zone.
     *
     * @return a interval over the day
     */
    public Interval toInterval() {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7072);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7073);return toInterval(null);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Converts this object to an Interval representing the whole day.
     *
     * @param zone the zone to get the Interval in, null means default
     * @return a interval over the day
     */
    public Interval toInterval(DateTimeZone zone) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7074);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7075);zone = DateTimeUtils.getZone(zone);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7076);return toDateMidnight(zone).toInterval();
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the year field value.
     *
     * @return the year
     */
    public int getYear() {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7077);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7078);return getValue(YEAR);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Get the month of year field value.
     *
     * @return the month of year
     */
    public int getMonthOfYear() {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7079);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7080);return getValue(MONTH_OF_YEAR);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Get the day of month field value.
     *
     * @return the day of month
     */
    public int getDayOfMonth() {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7081);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7082);return getValue(DAY_OF_MONTH);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a copy of this date with the year field updated.
     * <p>
     * YearMonthDay is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * year changed.
     *
     * @param year the year to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public YearMonthDay withYear(int year) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7083);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7084);int[] newValues = getValues();
        __CLR4_4_15ci5cilgchoqkd.R.inc(7085);newValues = getChronology().year().set(this, YEAR, newValues, year);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7086);return new YearMonthDay(this, newValues);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the month of year field updated.
     * <p>
     * YearMonthDay is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * month of year changed.
     *
     * @param monthOfYear the month of year to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public YearMonthDay withMonthOfYear(int monthOfYear) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7087);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7088);int[] newValues = getValues();
        __CLR4_4_15ci5cilgchoqkd.R.inc(7089);newValues = getChronology().monthOfYear().set(this, MONTH_OF_YEAR, newValues, monthOfYear);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7090);return new YearMonthDay(this, newValues);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the day of month field updated.
     * <p>
     * YearMonthDay is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * day of month changed.
     *
     * @param dayOfMonth the day of month to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public YearMonthDay withDayOfMonth(int dayOfMonth) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7091);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7092);int[] newValues = getValues();
        __CLR4_4_15ci5cilgchoqkd.R.inc(7093);newValues = getChronology().dayOfMonth().set(this, DAY_OF_MONTH, newValues, dayOfMonth);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7094);return new YearMonthDay(this, newValues);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the year field property which provides access to advanced functionality.
     *
     * @return the year property
     */
    public Property year() {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7095);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7096);return new Property(this, YEAR);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Get the month of year field property which provides access to advanced functionality.
     *
     * @return the month of year property
     */
    public Property monthOfYear() {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7097);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7098);return new Property(this, MONTH_OF_YEAR);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    /**
     * Get the day of month field property which provides access to advanced functionality.
     *
     * @return the day of month property
     */
    public Property dayOfMonth() {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7099);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7100);return new Property(this, DAY_OF_MONTH);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Output the date in the ISO8601 format YYYY-MM-DD.
     *
     * @return ISO8601 formatted string
     */
    public String toString() {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7101);
        __CLR4_4_15ci5cilgchoqkd.R.inc(7102);return ISODateTimeFormat.yearMonthDay().print(this);
    }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * The property class for <code>YearMonthDay</code>.
     * <p>
     * This class binds a <code>YearMonthDay</code> to a <code>DateTimeField</code>.
     *
     * @author Stephen Colebourne
     * @since 1.0
     * @deprecated Use LocalDate which has a much better internal implementation
     */
    @Deprecated
    public static class Property extends AbstractPartialFieldProperty implements Serializable {

        /**
         * Serialization version
         */
        private static final long serialVersionUID = 5727734012190224363L;

        /**
         * The partial
         */
        private final YearMonthDay iYearMonthDay;
        /**
         * The field index
         */
        private final int iFieldIndex;

        /**
         * Constructs a property.
         *
         * @param partial    the partial instance
         * @param fieldIndex the index in the partial
         */
        Property(YearMonthDay partial, int fieldIndex) {
            super();__CLR4_4_15ci5cilgchoqkd.R.inc(7104);try{__CLR4_4_15ci5cilgchoqkd.R.inc(7103);
            __CLR4_4_15ci5cilgchoqkd.R.inc(7105);iYearMonthDay = partial;
            __CLR4_4_15ci5cilgchoqkd.R.inc(7106);iFieldIndex = fieldIndex;
        }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

        /**
         * Gets the field that this property uses.
         *
         * @return the field
         */
        public DateTimeField getField() {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7107);
            __CLR4_4_15ci5cilgchoqkd.R.inc(7108);return iYearMonthDay.getField(iFieldIndex);
        }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

        /**
         * Gets the partial that this property belongs to.
         *
         * @return the partial
         */
        protected ReadablePartial getReadablePartial() {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7109);
            __CLR4_4_15ci5cilgchoqkd.R.inc(7110);return iYearMonthDay;
        }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

        /**
         * Gets the partial that this property belongs to.
         *
         * @return the partial
         */
        public YearMonthDay getYearMonthDay() {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7111);
            __CLR4_4_15ci5cilgchoqkd.R.inc(7112);return iYearMonthDay;
        }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

        /**
         * Gets the value of this field.
         *
         * @return the field value
         */
        public int get() {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7113);
            __CLR4_4_15ci5cilgchoqkd.R.inc(7114);return iYearMonthDay.getValue(iFieldIndex);
        }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Adds to the value of this field in a copy of this YearMonthDay.
         * <p>
         * The value will be added to this field. If the value is too large to be
         * added solely to this field then it will affect larger fields.
         * Smaller fields are unaffected.
         * <p>
         * If the result would be too large, beyond the maximum year, then an
         * IllegalArgumentException is thrown.
         * <p>
         * The YearMonthDay attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         *
         * @param valueToAdd the value to add to the field in the copy
         * @return a copy of the YearMonthDay with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public YearMonthDay addToCopy(int valueToAdd) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7115);
            __CLR4_4_15ci5cilgchoqkd.R.inc(7116);int[] newValues = iYearMonthDay.getValues();
            __CLR4_4_15ci5cilgchoqkd.R.inc(7117);newValues = getField().add(iYearMonthDay, iFieldIndex, newValues, valueToAdd);
            __CLR4_4_15ci5cilgchoqkd.R.inc(7118);return new YearMonthDay(iYearMonthDay, newValues);
        }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

        /**
         * Adds to the value of this field in a copy of this YearMonthDay wrapping
         * within this field if the maximum value is reached.
         * <p>
         * The value will be added to this field. If the value is too large to be
         * added solely to this field then it wraps within this field.
         * Other fields are unaffected.
         * <p>
         * For example,
         * <code>2004-12-20</code> addWrapField one month returns <code>2004-01-20</code>.
         * <p>
         * The YearMonthDay attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         *
         * @param valueToAdd the value to add to the field in the copy
         * @return a copy of the YearMonthDay with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public YearMonthDay addWrapFieldToCopy(int valueToAdd) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7119);
            __CLR4_4_15ci5cilgchoqkd.R.inc(7120);int[] newValues = iYearMonthDay.getValues();
            __CLR4_4_15ci5cilgchoqkd.R.inc(7121);newValues = getField().addWrapField(iYearMonthDay, iFieldIndex, newValues, valueToAdd);
            __CLR4_4_15ci5cilgchoqkd.R.inc(7122);return new YearMonthDay(iYearMonthDay, newValues);
        }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Sets this field in a copy of the YearMonthDay.
         * <p>
         * The YearMonthDay attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         *
         * @param value the value to set the field in the copy to
         * @return a copy of the YearMonthDay with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public YearMonthDay setCopy(int value) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7123);
            __CLR4_4_15ci5cilgchoqkd.R.inc(7124);int[] newValues = iYearMonthDay.getValues();
            __CLR4_4_15ci5cilgchoqkd.R.inc(7125);newValues = getField().set(iYearMonthDay, iFieldIndex, newValues, value);
            __CLR4_4_15ci5cilgchoqkd.R.inc(7126);return new YearMonthDay(iYearMonthDay, newValues);
        }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

        /**
         * Sets this field in a copy of the YearMonthDay to a parsed text value.
         * <p>
         * The YearMonthDay attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         *
         * @param text   the text value to set
         * @param locale optional locale to use for selecting a text symbol
         * @return a copy of the YearMonthDay with the field value changed
         * @throws IllegalArgumentException if the text value isn't valid
         */
        public YearMonthDay setCopy(String text, Locale locale) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7127);
            __CLR4_4_15ci5cilgchoqkd.R.inc(7128);int[] newValues = iYearMonthDay.getValues();
            __CLR4_4_15ci5cilgchoqkd.R.inc(7129);newValues = getField().set(iYearMonthDay, iFieldIndex, newValues, text, locale);
            __CLR4_4_15ci5cilgchoqkd.R.inc(7130);return new YearMonthDay(iYearMonthDay, newValues);
        }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

        /**
         * Sets this field in a copy of the YearMonthDay to a parsed text value.
         * <p>
         * The YearMonthDay attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         *
         * @param text the text value to set
         * @return a copy of the YearMonthDay with the field value changed
         * @throws IllegalArgumentException if the text value isn't valid
         */
        public YearMonthDay setCopy(String text) {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7131);
            __CLR4_4_15ci5cilgchoqkd.R.inc(7132);return setCopy(text, null);
        }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Returns a new YearMonthDay with this field set to the maximum value
         * for this field.
         * <p>
         * This operation is useful for obtaining a DateTime on the last day
         * of the month, as month lengths vary.
         * <pre>
         * YearMonthDay lastDayOfMonth = dt.dayOfMonth().withMaximumValue();
         * </pre>
         * <p>
         * The YearMonthDay attached to this property is unchanged by this call.
         *
         * @return a copy of the YearMonthDay with this field set to its maximum
         * @since 1.2
         */
        public YearMonthDay withMaximumValue() {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7133);
            __CLR4_4_15ci5cilgchoqkd.R.inc(7134);return setCopy(getMaximumValue());
        }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}

        /**
         * Returns a new YearMonthDay with this field set to the minimum value
         * for this field.
         * <p>
         * The YearMonthDay attached to this property is unchanged by this call.
         *
         * @return a copy of the YearMonthDay with this field set to its minimum
         * @since 1.2
         */
        public YearMonthDay withMinimumValue() {try{__CLR4_4_15ci5cilgchoqkd.R.inc(7135);
            __CLR4_4_15ci5cilgchoqkd.R.inc(7136);return setCopy(getMinimumValue());
        }finally{__CLR4_4_15ci5cilgchoqkd.R.flushNeeded();}}
    }

}
