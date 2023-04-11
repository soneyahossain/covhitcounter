/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2010 Stephen Colebourne
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

import org.joda.convert.FromString;
import org.joda.time.base.BasePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/**
 * An immutable time period specifying a set of duration field values.
 * <p>
 * A time period is divided into a number of fields, such as hours and seconds.
 * Which fields are supported is defined by the PeriodType class.
 * The default is the standard period type, which supports years, months, weeks, days,
 * hours, minutes, seconds and millis.
 * <p>
 * When this time period is added to an instant, the effect is of adding each field in turn.
 * As a result, this takes into account daylight savings time.
 * Adding a time period of 1 day to the day before daylight savings starts will only add
 * 23 hours rather than 24 to ensure that the time remains the same.
 * If this is not the behaviour you want, then see {@link Duration}.
 * <p>
 * The definition of a period also affects the equals method. A period of 1
 * day is not equal to a period of 24 hours, nor 1 hour equal to 60 minutes.
 * This is because periods represent an abstracted definition of a time period
 * (eg. a day may not actually be 24 hours, it might be 23 or 25 at daylight
 * savings boundary). To compare the actual duration of two periods, convert
 * both to durations using toDuration, an operation that emphasises that the
 * result may differ according to the date you choose.
 * <p>
 * Period is thread-safe and immutable, provided that the PeriodType is as well.
 * All standard PeriodType classes supplied are thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @see MutablePeriod
 * @since 1.0
 */
public final class Period
        extends BasePeriod
        implements ReadablePeriod, Serializable {public static class __CLR4_4_149k49klgchoqgx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,5931,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * A period of zero length and standard period type.
     *
     * @since 1.4
     */
    public static final Period ZERO = new Period();

    /**
     * Serialization version
     */
    private static final long serialVersionUID = 741052353876488155L;

    //-----------------------------------------------------------------------

    /**
     * Parses a {@code Period} from the specified string.
     * <p>
     * This uses {@link ISOPeriodFormat#standard()}.
     *
     * @param str the string to parse, not null
     * @since 2.0
     */
    @FromString
    public static Period parse(String str) {try{__CLR4_4_149k49klgchoqgx.R.inc(5528);
        __CLR4_4_149k49klgchoqgx.R.inc(5529);return parse(str, ISOPeriodFormat.standard());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Parses a {@code Period} from the specified string using a formatter.
     *
     * @param str       the string to parse, not null
     * @param formatter the formatter to use, not null
     * @since 2.0
     */
    public static Period parse(String str, PeriodFormatter formatter) {try{__CLR4_4_149k49klgchoqgx.R.inc(5530);
        __CLR4_4_149k49klgchoqgx.R.inc(5531);return formatter.parsePeriod(str);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Create a period with a specified number of years.
     * <p>
     * The standard period type is used, thus you can add other fields such
     * as months or days using the <code>withXxx()</code> methods.
     * For example, <code>Period.years(2).withMonths(6);</code>
     * <p>
     * If you want a year-based period that cannot have other fields added,
     * then you should consider using {@link Years}.
     *
     * @param years the amount of years in this period
     * @return the period
     */
    public static Period years(int years) {try{__CLR4_4_149k49klgchoqgx.R.inc(5532);
        __CLR4_4_149k49klgchoqgx.R.inc(5533);return new Period(new int[]{years, 0, 0, 0, 0, 0, 0, 0}, PeriodType.standard());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Create a period with a specified number of months.
     * <p>
     * The standard period type is used, thus you can add other fields such
     * as years or days using the <code>withXxx()</code> methods.
     * For example, <code>Period.months(2).withDays(6);</code>
     * <p>
     * If you want a month-based period that cannot have other fields added,
     * then you should consider using {@link Months}.
     *
     * @param months the amount of months in this period
     * @return the period
     */
    public static Period months(int months) {try{__CLR4_4_149k49klgchoqgx.R.inc(5534);
        __CLR4_4_149k49klgchoqgx.R.inc(5535);return new Period(new int[]{0, months, 0, 0, 0, 0, 0, 0}, PeriodType.standard());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Create a period with a specified number of weeks.
     * <p>
     * The standard period type is used, thus you can add other fields such
     * as months or days using the <code>withXxx()</code> methods.
     * For example, <code>Period.weeks(2).withDays(6);</code>
     * <p>
     * If you want a week-based period that cannot have other fields added,
     * then you should consider using {@link Weeks}.
     *
     * @param weeks the amount of weeks in this period
     * @return the period
     */
    public static Period weeks(int weeks) {try{__CLR4_4_149k49klgchoqgx.R.inc(5536);
        __CLR4_4_149k49klgchoqgx.R.inc(5537);return new Period(new int[]{0, 0, weeks, 0, 0, 0, 0, 0}, PeriodType.standard());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Create a period with a specified number of days.
     * <p>
     * The standard period type is used, thus you can add other fields such
     * as months or weeks using the <code>withXxx()</code> methods.
     * For example, <code>Period.days(2).withHours(6);</code>
     * <p>
     * If you want a day-based period that cannot have other fields added,
     * then you should consider using {@link Days}.
     *
     * @param days the amount of days in this period
     * @return the period
     */
    public static Period days(int days) {try{__CLR4_4_149k49klgchoqgx.R.inc(5538);
        __CLR4_4_149k49klgchoqgx.R.inc(5539);return new Period(new int[]{0, 0, 0, days, 0, 0, 0, 0}, PeriodType.standard());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Create a period with a specified number of hours.
     * <p>
     * The standard period type is used, thus you can add other fields such
     * as months or days using the <code>withXxx()</code> methods.
     * For example, <code>Period.hours(2).withMinutes(30);</code>
     * <p>
     * If you want a hour-based period that cannot have other fields added,
     * then you should consider using {@link Hours}.
     *
     * @param hours the amount of hours in this period
     * @return the period
     */
    public static Period hours(int hours) {try{__CLR4_4_149k49klgchoqgx.R.inc(5540);
        __CLR4_4_149k49klgchoqgx.R.inc(5541);return new Period(new int[]{0, 0, 0, 0, hours, 0, 0, 0}, PeriodType.standard());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Create a period with a specified number of minutes.
     * <p>
     * The standard period type is used, thus you can add other fields such
     * as days or hours using the <code>withXxx()</code> methods.
     * For example, <code>Period.minutes(2).withSeconds(30);</code>
     * <p>
     * If you want a minute-based period that cannot have other fields added,
     * then you should consider using {@link Minutes}.
     *
     * @param minutes the amount of minutes in this period
     * @return the period
     */
    public static Period minutes(int minutes) {try{__CLR4_4_149k49klgchoqgx.R.inc(5542);
        __CLR4_4_149k49klgchoqgx.R.inc(5543);return new Period(new int[]{0, 0, 0, 0, 0, minutes, 0, 0}, PeriodType.standard());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Create a period with a specified number of seconds.
     * <p>
     * The standard period type is used, thus you can add other fields such
     * as days or hours using the <code>withXxx()</code> methods.
     * For example, <code>Period.seconds(2).withMillis(30);</code>
     * <p>
     * If you want a second-based period that cannot have other fields added,
     * then you should consider using {@link Seconds}.
     *
     * @param seconds the amount of seconds in this period
     * @return the period
     */
    public static Period seconds(int seconds) {try{__CLR4_4_149k49klgchoqgx.R.inc(5544);
        __CLR4_4_149k49klgchoqgx.R.inc(5545);return new Period(new int[]{0, 0, 0, 0, 0, 0, seconds, 0}, PeriodType.standard());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Create a period with a specified number of millis.
     * <p>
     * The standard period type is used, thus you can add other fields such
     * as days or hours using the <code>withXxx()</code> methods.
     * For example, <code>Period.millis(20).withSeconds(30);</code>
     *
     * @param millis the amount of millis in this period
     * @return the period
     */
    public static Period millis(int millis) {try{__CLR4_4_149k49klgchoqgx.R.inc(5546);
        __CLR4_4_149k49klgchoqgx.R.inc(5547);return new Period(new int[]{0, 0, 0, 0, 0, 0, 0, millis}, PeriodType.standard());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a period from two partially specified times, calculating
     * by field difference.
     * <p>
     * The two partials must contain the same fields, thus you can specify
     * two <code>LocalDate</code> objects, or two <code>LocalTime</code> objects,
     * but not one of each. Also, the partial may not contain overlapping
     * fields, such as dayOfWeek and dayOfMonth.
     * <p>
     * Calculation by field difference works by extracting the difference
     * one field at a time and not wrapping into other fields.
     * Thus 2005-06-09/2007-04-12 will yield P2Y-2M3D.
     * <p>
     * For example, you have an event that always runs from the 27th of
     * each month to the 2nd of the next month. If you calculate this
     * period using a standard constructor, then you will get between
     * P3D and P6D depending on the month. If you use this method, then
     * you will get P1M-25D. This field-difference based period can
     * be successfully applied to each month of the year to obtain the
     * correct end date for a given start date.
     *
     * @param start the start of the period, must not be null
     * @param end   the end of the period, must not be null
     * @throws IllegalArgumentException if the partials are null or invalid
     * @since 1.1
     */
    public static Period fieldDifference(ReadablePartial start, ReadablePartial end) {try{__CLR4_4_149k49klgchoqgx.R.inc(5548);
        __CLR4_4_149k49klgchoqgx.R.inc(5549);if ((((start == null || end == null)&&(__CLR4_4_149k49klgchoqgx.R.iget(5550)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5551)==0&false))) {{
            __CLR4_4_149k49klgchoqgx.R.inc(5552);throw new IllegalArgumentException("ReadablePartial objects must not be null");
        }
        }__CLR4_4_149k49klgchoqgx.R.inc(5553);if ((((start.size() != end.size())&&(__CLR4_4_149k49klgchoqgx.R.iget(5554)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5555)==0&false))) {{
            __CLR4_4_149k49klgchoqgx.R.inc(5556);throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
        }
        }__CLR4_4_149k49klgchoqgx.R.inc(5557);DurationFieldType[] types = new DurationFieldType[start.size()];
        __CLR4_4_149k49klgchoqgx.R.inc(5558);int[] values = new int[start.size()];
        __CLR4_4_149k49klgchoqgx.R.inc(5559);for (int i = 0, isize = start.size(); (((i < isize)&&(__CLR4_4_149k49klgchoqgx.R.iget(5560)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5561)==0&false)); i++) {{
            __CLR4_4_149k49klgchoqgx.R.inc(5562);if ((((start.getFieldType(i) != end.getFieldType(i))&&(__CLR4_4_149k49klgchoqgx.R.iget(5563)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5564)==0&false))) {{
                __CLR4_4_149k49klgchoqgx.R.inc(5565);throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
            }
            }__CLR4_4_149k49klgchoqgx.R.inc(5566);types[i] = start.getFieldType(i).getDurationType();
            __CLR4_4_149k49klgchoqgx.R.inc(5567);if ((((i > 0 && types[i - 1] == types[i])&&(__CLR4_4_149k49klgchoqgx.R.iget(5568)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5569)==0&false))) {{
                __CLR4_4_149k49klgchoqgx.R.inc(5570);throw new IllegalArgumentException("ReadablePartial objects must not have overlapping fields");
            }
            }__CLR4_4_149k49klgchoqgx.R.inc(5571);values[i] = end.getValue(i) - start.getValue(i);
        }
        }__CLR4_4_149k49klgchoqgx.R.inc(5572);return new Period(values, PeriodType.forFields(types));
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a new empty period with the standard set of fields.
     * <p>
     * One way to initialise a period is as follows:
     * <pre>
     * Period = new Period().withYears(6).withMonths(3).withSeconds(23);
     * </pre>
     * Bear in mind that this creates four period instances in total, three of
     * which are immediately discarded.
     * The alternative is more efficient, but less readable:
     * <pre>
     * Period = new Period(6, 3, 0, 0, 0, 0, 23, 0);
     * </pre>
     * The following is also slightly less wasteful:
     * <pre>
     * Period = Period.years(6).withMonths(3).withSeconds(23);
     * </pre>
     */
    public Period() {
        super(0L, null, null);__CLR4_4_149k49klgchoqgx.R.inc(5574);try{__CLR4_4_149k49klgchoqgx.R.inc(5573);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Create a period from a set of field values using the standard set of fields.
     * Note that the parameters specify the time fields hours, minutes,
     * seconds and millis, not the date fields.
     *
     * @param hours   amount of hours in this period
     * @param minutes amount of minutes in this period
     * @param seconds amount of seconds in this period
     * @param millis  amount of milliseconds in this period
     */
    public Period(int hours, int minutes, int seconds, int millis) {
        super(0, 0, 0, 0, hours, minutes, seconds, millis, PeriodType.standard());__CLR4_4_149k49klgchoqgx.R.inc(5576);try{__CLR4_4_149k49klgchoqgx.R.inc(5575);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Create a period from a set of field values using the standard set of fields.
     *
     * @param years   amount of years in this period
     * @param months  amount of months in this period
     * @param weeks   amount of weeks in this period
     * @param days    amount of days in this period
     * @param hours   amount of hours in this period
     * @param minutes amount of minutes in this period
     * @param seconds amount of seconds in this period
     * @param millis  amount of milliseconds in this period
     */
    public Period(int years, int months, int weeks, int days,
                  int hours, int minutes, int seconds, int millis) {
        super(years, months, weeks, days, hours, minutes, seconds, millis, PeriodType.standard());__CLR4_4_149k49klgchoqgx.R.inc(5578);try{__CLR4_4_149k49klgchoqgx.R.inc(5577);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Create a period from a set of field values.
     * <p>
     * There is usually little need to use this constructor.
     * The period type is used primarily to define how to split an interval into a period.
     * As this constructor already is split, the period type does no real work.
     *
     * @param years   amount of years in this period, which must be zero if unsupported
     * @param months  amount of months in this period, which must be zero if unsupported
     * @param weeks   amount of weeks in this period, which must be zero if unsupported
     * @param days    amount of days in this period, which must be zero if unsupported
     * @param hours   amount of hours in this period, which must be zero if unsupported
     * @param minutes amount of minutes in this period, which must be zero if unsupported
     * @param seconds amount of seconds in this period, which must be zero if unsupported
     * @param millis  amount of milliseconds in this period, which must be zero if unsupported
     * @param type    which set of fields this period supports, null means AllType
     * @throws IllegalArgumentException if an unsupported field's value is non-zero
     */
    public Period(int years, int months, int weeks, int days,
                  int hours, int minutes, int seconds, int millis, PeriodType type) {
        super(years, months, weeks, days, hours, minutes, seconds, millis, type);__CLR4_4_149k49klgchoqgx.R.inc(5580);try{__CLR4_4_149k49klgchoqgx.R.inc(5579);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Creates a period from the given millisecond duration using the standard
     * set of fields.
     * <p>
     * Only precise fields in the period type will be used.
     * For the standard period type this is the time fields only.
     * Thus the year, month, week and day fields will not be populated.
     * <p>
     * If the duration is small, less than one day, then this method will perform
     * as you might expect and split the fields evenly.
     * <p>
     * If the duration is larger than one day then all the remaining duration will
     * be stored in the largest available precise field, hours in this case.
     * <p>
     * For example, a duration equal to (365 + 60 + 5) days will be converted to
     * ((365 + 60 + 5) * 24) hours by this constructor.
     * <p>
     * For more control over the conversion process, you have two options:
     * <ul>
     * <li>convert the duration to an {@link Interval}, and from there obtain the period
     * <li>specify a period type that contains precise definitions of the day and larger
     * fields, such as UTC
     * </ul>
     *
     * @param duration the duration, in milliseconds
     */
    public Period(long duration) {
        super(duration);__CLR4_4_149k49klgchoqgx.R.inc(5582);try{__CLR4_4_149k49klgchoqgx.R.inc(5581);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Creates a period from the given millisecond duration.
     * <p>
     * Only precise fields in the period type will be used.
     * Imprecise fields will not be populated.
     * <p>
     * If the duration is small then this method will perform
     * as you might expect and split the fields evenly.
     * <p>
     * If the duration is large then all the remaining duration will
     * be stored in the largest available precise field.
     * For details as to which fields are precise, review the period type javadoc.
     *
     * @param duration the duration, in milliseconds
     * @param type     which set of fields this period supports, null means standard
     */
    public Period(long duration, PeriodType type) {
        super(duration, type, null);__CLR4_4_149k49klgchoqgx.R.inc(5584);try{__CLR4_4_149k49klgchoqgx.R.inc(5583);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Creates a period from the given millisecond duration using the standard
     * set of fields.
     * <p>
     * Only precise fields in the period type will be used.
     * Imprecise fields will not be populated.
     * <p>
     * If the duration is small then this method will perform
     * as you might expect and split the fields evenly.
     * <p>
     * If the duration is large then all the remaining duration will
     * be stored in the largest available precise field.
     * For details as to which fields are precise, review the period type javadoc.
     *
     * @param duration   the duration, in milliseconds
     * @param chronology the chronology to use to split the duration, null means ISO default
     */
    public Period(long duration, Chronology chronology) {
        super(duration, null, chronology);__CLR4_4_149k49klgchoqgx.R.inc(5586);try{__CLR4_4_149k49klgchoqgx.R.inc(5585);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Creates a period from the given millisecond duration.
     * <p>
     * Only precise fields in the period type will be used.
     * Imprecise fields will not be populated.
     * <p>
     * If the duration is small then this method will perform
     * as you might expect and split the fields evenly.
     * <p>
     * If the duration is large then all the remaining duration will
     * be stored in the largest available precise field.
     * For details as to which fields are precise, review the period type javadoc.
     *
     * @param duration   the duration, in milliseconds
     * @param type       which set of fields this period supports, null means standard
     * @param chronology the chronology to use to split the duration, null means ISO default
     */
    public Period(long duration, PeriodType type, Chronology chronology) {
        super(duration, type, chronology);__CLR4_4_149k49klgchoqgx.R.inc(5588);try{__CLR4_4_149k49klgchoqgx.R.inc(5587);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Creates a period from the given interval endpoints using the standard
     * set of fields.
     *
     * @param startInstant interval start, in milliseconds
     * @param endInstant   interval end, in milliseconds
     */
    public Period(long startInstant, long endInstant) {
        super(startInstant, endInstant, null, null);__CLR4_4_149k49klgchoqgx.R.inc(5590);try{__CLR4_4_149k49klgchoqgx.R.inc(5589);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Creates a period from the given interval endpoints.
     *
     * @param startInstant interval start, in milliseconds
     * @param endInstant   interval end, in milliseconds
     * @param type         which set of fields this period supports, null means standard
     */
    public Period(long startInstant, long endInstant, PeriodType type) {
        super(startInstant, endInstant, type, null);__CLR4_4_149k49klgchoqgx.R.inc(5592);try{__CLR4_4_149k49klgchoqgx.R.inc(5591);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Creates a period from the given interval endpoints using the standard
     * set of fields.
     *
     * @param startInstant interval start, in milliseconds
     * @param endInstant   interval end, in milliseconds
     * @param chrono       the chronology to use, null means ISO in default zone
     */
    public Period(long startInstant, long endInstant, Chronology chrono) {
        super(startInstant, endInstant, null, chrono);__CLR4_4_149k49klgchoqgx.R.inc(5594);try{__CLR4_4_149k49klgchoqgx.R.inc(5593);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Creates a period from the given interval endpoints.
     *
     * @param startInstant interval start, in milliseconds
     * @param endInstant   interval end, in milliseconds
     * @param type         which set of fields this period supports, null means standard
     * @param chrono       the chronology to use, null means ISO in default zone
     */
    public Period(long startInstant, long endInstant, PeriodType type, Chronology chrono) {
        super(startInstant, endInstant, type, chrono);__CLR4_4_149k49klgchoqgx.R.inc(5596);try{__CLR4_4_149k49klgchoqgx.R.inc(5595);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Creates a period between the given instants using the standard set of fields.
     * <p>
     * Most calculations performed by this method have obvious results.
     * The special case is where the calculation is from a "long" month to a "short" month.
     * Here, the result favours increasing the months field rather than the days.
     * For example, 2013-01-31 to 2013-02-28 is treated as one whole month.
     * By contrast, 2013-01-31 to 2013-03-30 is treated as one month and 30 days
     * (exposed as 4 weeks and 2 days).
     * The results are explained by considering that the start date plus the
     * calculated period result in the end date.
     * <p>
     * Another special case is around daylight savings. Consider the case where there
     * is a DST gap from 01:00 to 02:00. The period from 00:30 to 02:30 will return
     * one hour, not two, due to the missing hour.
     * However, once the period exceeds one day, a different effect comes into play.
     * Consider the period from 00:30 just before the DST gap to 02:30 one day later.
     * Since this exceeds a day, the algorithm first adds one day following normal period
     * rules, to get 00:30 one day later, and then adds 2 hours to reach 02:30.
     * In this way, the DST gap effectively "disappears".
     * In other words, the addition of days takes precedence over the addition of hours.
     *
     * @param startInstant interval start, null means now
     * @param endInstant   interval end, null means now
     */
    public Period(ReadableInstant startInstant, ReadableInstant endInstant) {
        super(startInstant, endInstant, null);__CLR4_4_149k49klgchoqgx.R.inc(5598);try{__CLR4_4_149k49klgchoqgx.R.inc(5597);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Creates a period between the given instants.
     * <p>
     * Most calculations performed by this method have obvious results.
     * The special case is where the calculation is from a "long" month to a "short" month.
     * Here, the result favours increasing the months field rather than the days.
     * For example, 2013-01-31 to 2013-02-28 is treated as one whole month.
     * By contrast, 2013-01-31 to 2013-03-30 is treated as one month and 30 days.
     * The results are explained by considering that the start date plus the
     * calculated period result in the end date.
     * <p>
     * Another special case is around daylight savings. Consider the case where there
     * is a DST gap from 01:00 to 02:00. The period from 00:30 to 02:30 will return
     * one hour, not two, due to the missing hour.
     * However, once the period exceeds one day, a different effect comes into play.
     * Consider the period from 00:30 just before the DST gap to 02:30 one day later.
     * Since this exceeds a day, the algorithm first adds one day following normal period
     * rules, to get 00:30 one day later, and then adds 2 hours to reach 02:30.
     * In this way, the DST gap effectively "disappears".
     * In other words, the addition of days takes precedence over the addition of hours.
     *
     * @param startInstant interval start, null means now
     * @param endInstant   interval end, null means now
     * @param type         which set of fields this period supports, null means standard
     */
    public Period(ReadableInstant startInstant, ReadableInstant endInstant, PeriodType type) {
        super(startInstant, endInstant, type);__CLR4_4_149k49klgchoqgx.R.inc(5600);try{__CLR4_4_149k49klgchoqgx.R.inc(5599);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Creates a period from two partially specified times.
     * <p>
     * The two partials must contain the same fields, thus you can specify
     * two <code>LocalDate</code> objects, or two <code>LocalTime</code> objects,
     * but not one of each.
     * As these are Partial objects, time zones have no effect on the result.
     * <p>
     * The two partials must also both be contiguous - see
     * {@link DateTimeUtils#isContiguous(ReadablePartial)} for a definition.
     * Both <code>LocalDate</code> and <code>LocalTime</code> are contiguous.
     * <p>
     * Most calculations performed by this method have obvious results.
     * The special case is where the calculation is from a "long" month to a "short" month.
     * Here, the result favours increasing the months field rather than the days.
     * For example, 2013-01-31 to 2013-02-28 is treated as one whole month.
     * By contrast, 2013-01-31 to 2013-03-30 is treated as one month and 30 days
     * (exposed as 4 weeks and 2 days).
     * The results are explained by considering that the start date plus the
     * calculated period result in the end date.
     * <p>
     * An alternative way of constructing a Period from two Partials
     * is {@link #fieldDifference(ReadablePartial, ReadablePartial)}.
     * That method handles all kinds of partials.
     *
     * @param start the start of the period, must not be null
     * @param end   the end of the period, must not be null
     * @throws IllegalArgumentException if the partials are null or invalid
     * @since 1.1
     */
    public Period(ReadablePartial start, ReadablePartial end) {
        super(start, end, null);__CLR4_4_149k49klgchoqgx.R.inc(5602);try{__CLR4_4_149k49klgchoqgx.R.inc(5601);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Creates a period from two partially specified times.
     * <p>
     * The two partials must contain the same fields, thus you can specify
     * two <code>LocalDate</code> objects, or two <code>LocalTime</code> objects,
     * but not one of each.
     * As these are Partial objects, time zones have no effect on the result.
     * <p>
     * The two partials must also both be contiguous - see
     * {@link DateTimeUtils#isContiguous(ReadablePartial)} for a definition.
     * Both <code>LocalDate</code> and <code>LocalTime</code> are contiguous.
     * <p>
     * Most calculations performed by this method have obvious results.
     * The special case is where the calculation is from a "long" month to a "short" month.
     * Here, the result favours increasing the months field rather than the days.
     * For example, 2013-01-31 to 2013-02-28 is treated as one whole month.
     * By contrast, 2013-01-31 to 2013-03-30 is treated as one month and 30 days.
     * The results are explained by considering that the start date plus the
     * calculated period result in the end date.
     * <p>
     * An alternative way of constructing a Period from two Partials
     * is {@link #fieldDifference(ReadablePartial, ReadablePartial)}.
     * That method handles all kinds of partials.
     *
     * @param start the start of the period, must not be null
     * @param end   the end of the period, must not be null
     * @param type  which set of fields this period supports, null means standard
     * @throws IllegalArgumentException if the partials are null or invalid
     * @since 1.1
     */
    public Period(ReadablePartial start, ReadablePartial end, PeriodType type) {
        super(start, end, type);__CLR4_4_149k49klgchoqgx.R.inc(5604);try{__CLR4_4_149k49klgchoqgx.R.inc(5603);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Creates a period from the given start point and the duration.
     *
     * @param startInstant the interval start, null means now
     * @param duration     the duration of the interval, null means zero-length
     */
    public Period(ReadableInstant startInstant, ReadableDuration duration) {
        super(startInstant, duration, null);__CLR4_4_149k49klgchoqgx.R.inc(5606);try{__CLR4_4_149k49klgchoqgx.R.inc(5605);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Creates a period from the given start point and the duration.
     *
     * @param startInstant the interval start, null means now
     * @param duration     the duration of the interval, null means zero-length
     * @param type         which set of fields this period supports, null means standard
     */
    public Period(ReadableInstant startInstant, ReadableDuration duration, PeriodType type) {
        super(startInstant, duration, type);__CLR4_4_149k49klgchoqgx.R.inc(5608);try{__CLR4_4_149k49klgchoqgx.R.inc(5607);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Creates a period from the given duration and end point.
     *
     * @param duration   the duration of the interval, null means zero-length
     * @param endInstant the interval end, null means now
     */
    public Period(ReadableDuration duration, ReadableInstant endInstant) {
        super(duration, endInstant, null);__CLR4_4_149k49klgchoqgx.R.inc(5610);try{__CLR4_4_149k49klgchoqgx.R.inc(5609);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Creates a period from the given duration and end point.
     *
     * @param duration   the duration of the interval, null means zero-length
     * @param endInstant the interval end, null means now
     * @param type       which set of fields this period supports, null means standard
     */
    public Period(ReadableDuration duration, ReadableInstant endInstant, PeriodType type) {
        super(duration, endInstant, type);__CLR4_4_149k49klgchoqgx.R.inc(5612);try{__CLR4_4_149k49klgchoqgx.R.inc(5611);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Creates a period by converting or copying from another object.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadablePeriod, ReadableInterval and String.
     * The String formats are described by {@link ISOPeriodFormat#standard()}.
     *
     * @param period period to convert
     * @throws IllegalArgumentException      if period is invalid
     * @throws UnsupportedOperationException if an unsupported field's value is non-zero
     */
    public Period(Object period) {
        super(period, null, null);__CLR4_4_149k49klgchoqgx.R.inc(5614);try{__CLR4_4_149k49klgchoqgx.R.inc(5613);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Creates a period by converting or copying from another object.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadablePeriod, ReadableInterval and String.
     * The String formats are described by {@link ISOPeriodFormat#standard()}.
     *
     * @param period period to convert
     * @param type   which set of fields this period supports, null means use converter
     * @throws IllegalArgumentException      if period is invalid
     * @throws UnsupportedOperationException if an unsupported field's value is non-zero
     */
    public Period(Object period, PeriodType type) {
        super(period, type, null);__CLR4_4_149k49klgchoqgx.R.inc(5616);try{__CLR4_4_149k49klgchoqgx.R.inc(5615);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Creates a period by converting or copying from another object.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadablePeriod, ReadableInterval and String.
     * The String formats are described by {@link ISOPeriodFormat#standard()}.
     *
     * @param period period to convert
     * @param chrono the chronology to use, null means ISO in default zone
     * @throws IllegalArgumentException      if period is invalid
     * @throws UnsupportedOperationException if an unsupported field's value is non-zero
     */
    public Period(Object period, Chronology chrono) {
        super(period, null, chrono);__CLR4_4_149k49klgchoqgx.R.inc(5618);try{__CLR4_4_149k49klgchoqgx.R.inc(5617);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Creates a period by converting or copying from another object.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadablePeriod, ReadableInterval and String.
     * The String formats are described by {@link ISOPeriodFormat#standard()}.
     *
     * @param period period to convert
     * @param type   which set of fields this period supports, null means use converter
     * @param chrono the chronology to use, null means ISO in default zone
     * @throws IllegalArgumentException      if period is invalid
     * @throws UnsupportedOperationException if an unsupported field's value is non-zero
     */
    public Period(Object period, PeriodType type, Chronology chrono) {
        super(period, type, chrono);__CLR4_4_149k49klgchoqgx.R.inc(5620);try{__CLR4_4_149k49klgchoqgx.R.inc(5619);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Constructor used when we trust ourselves.
     *
     * @param values the values to use, not null, not cloned
     * @param type   which set of fields this period supports, not null
     */
    private Period(int[] values, PeriodType type) {
        super(values, type);__CLR4_4_149k49klgchoqgx.R.inc(5622);try{__CLR4_4_149k49klgchoqgx.R.inc(5621);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get this period as an immutable <code>Period</code> object
     * by returning <code>this</code>.
     *
     * @return <code>this</code>
     */
    public Period toPeriod() {try{__CLR4_4_149k49klgchoqgx.R.inc(5623);
        __CLR4_4_149k49klgchoqgx.R.inc(5624);return this;
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the years field part of the period.
     *
     * @return the number of years in the period, zero if unsupported
     */
    public int getYears() {try{__CLR4_4_149k49klgchoqgx.R.inc(5625);
        __CLR4_4_149k49klgchoqgx.R.inc(5626);return getPeriodType().getIndexedField(this, PeriodType.YEAR_INDEX);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Gets the months field part of the period.
     *
     * @return the number of months in the period, zero if unsupported
     */
    public int getMonths() {try{__CLR4_4_149k49klgchoqgx.R.inc(5627);
        __CLR4_4_149k49klgchoqgx.R.inc(5628);return getPeriodType().getIndexedField(this, PeriodType.MONTH_INDEX);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Gets the weeks field part of the period.
     *
     * @return the number of weeks in the period, zero if unsupported
     */
    public int getWeeks() {try{__CLR4_4_149k49klgchoqgx.R.inc(5629);
        __CLR4_4_149k49klgchoqgx.R.inc(5630);return getPeriodType().getIndexedField(this, PeriodType.WEEK_INDEX);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Gets the days field part of the period.
     *
     * @return the number of days in the period, zero if unsupported
     */
    public int getDays() {try{__CLR4_4_149k49klgchoqgx.R.inc(5631);
        __CLR4_4_149k49klgchoqgx.R.inc(5632);return getPeriodType().getIndexedField(this, PeriodType.DAY_INDEX);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the hours field part of the period.
     *
     * @return the number of hours in the period, zero if unsupported
     */
    public int getHours() {try{__CLR4_4_149k49klgchoqgx.R.inc(5633);
        __CLR4_4_149k49klgchoqgx.R.inc(5634);return getPeriodType().getIndexedField(this, PeriodType.HOUR_INDEX);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Gets the minutes field part of the period.
     *
     * @return the number of minutes in the period, zero if unsupported
     */
    public int getMinutes() {try{__CLR4_4_149k49klgchoqgx.R.inc(5635);
        __CLR4_4_149k49klgchoqgx.R.inc(5636);return getPeriodType().getIndexedField(this, PeriodType.MINUTE_INDEX);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Gets the seconds field part of the period.
     *
     * @return the number of seconds in the period, zero if unsupported
     */
    public int getSeconds() {try{__CLR4_4_149k49klgchoqgx.R.inc(5637);
        __CLR4_4_149k49klgchoqgx.R.inc(5638);return getPeriodType().getIndexedField(this, PeriodType.SECOND_INDEX);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Gets the millis field part of the period.
     *
     * @return the number of millis in the period, zero if unsupported
     */
    public int getMillis() {try{__CLR4_4_149k49klgchoqgx.R.inc(5639);
        __CLR4_4_149k49klgchoqgx.R.inc(5640);return getPeriodType().getIndexedField(this, PeriodType.MILLI_INDEX);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a new Period instance with the same field values but
     * different PeriodType.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param type the period type to use, null means standard
     * @return the new period instance
     * @throws IllegalArgumentException if the new period won't accept all of the current fields
     */
    public Period withPeriodType(PeriodType type) {try{__CLR4_4_149k49klgchoqgx.R.inc(5641);
        __CLR4_4_149k49klgchoqgx.R.inc(5642);type = DateTimeUtils.getPeriodType(type);
        __CLR4_4_149k49klgchoqgx.R.inc(5643);if ((((type.equals(getPeriodType()))&&(__CLR4_4_149k49klgchoqgx.R.iget(5644)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5645)==0&false))) {{
            __CLR4_4_149k49klgchoqgx.R.inc(5646);return this;
        }
        }__CLR4_4_149k49klgchoqgx.R.inc(5647);return new Period(this, type);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Creates a new Period instance with the fields from the specified period
     * copied on top of those from this period.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param period the period to copy from, null ignored
     * @return the new period instance
     * @throws IllegalArgumentException if a field type is unsupported
     */
    public Period withFields(ReadablePeriod period) {try{__CLR4_4_149k49klgchoqgx.R.inc(5648);
        __CLR4_4_149k49klgchoqgx.R.inc(5649);if ((((period == null)&&(__CLR4_4_149k49klgchoqgx.R.iget(5650)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5651)==0&false))) {{
            __CLR4_4_149k49klgchoqgx.R.inc(5652);return this;
        }
        }__CLR4_4_149k49klgchoqgx.R.inc(5653);int[] newValues = getValues();  // cloned
        __CLR4_4_149k49klgchoqgx.R.inc(5654);newValues = super.mergePeriodInto(newValues, period);
        __CLR4_4_149k49klgchoqgx.R.inc(5655);return new Period(newValues, getPeriodType());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a new Period instance with the specified field set to a new value.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param field the field to set, not null
     * @param value the value to set to
     * @return the new period instance
     * @throws IllegalArgumentException if the field type is null or unsupported
     */
    public Period withField(DurationFieldType field, int value) {try{__CLR4_4_149k49klgchoqgx.R.inc(5656);
        __CLR4_4_149k49klgchoqgx.R.inc(5657);if ((((field == null)&&(__CLR4_4_149k49klgchoqgx.R.iget(5658)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5659)==0&false))) {{
            __CLR4_4_149k49klgchoqgx.R.inc(5660);throw new IllegalArgumentException("Field must not be null");
        }
        }__CLR4_4_149k49klgchoqgx.R.inc(5661);int[] newValues = getValues();  // cloned
        __CLR4_4_149k49klgchoqgx.R.inc(5662);super.setFieldInto(newValues, field, value);
        __CLR4_4_149k49klgchoqgx.R.inc(5663);return new Period(newValues, getPeriodType());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Creates a new Period instance with the valueToAdd added to the specified field.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param field the field to set, not null
     * @param value the value to add
     * @return the new period instance
     * @throws IllegalArgumentException if the field type is null or unsupported
     */
    public Period withFieldAdded(DurationFieldType field, int value) {try{__CLR4_4_149k49klgchoqgx.R.inc(5664);
        __CLR4_4_149k49klgchoqgx.R.inc(5665);if ((((field == null)&&(__CLR4_4_149k49klgchoqgx.R.iget(5666)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5667)==0&false))) {{
            __CLR4_4_149k49klgchoqgx.R.inc(5668);throw new IllegalArgumentException("Field must not be null");
        }
        }__CLR4_4_149k49klgchoqgx.R.inc(5669);if ((((value == 0)&&(__CLR4_4_149k49klgchoqgx.R.iget(5670)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5671)==0&false))) {{
            __CLR4_4_149k49klgchoqgx.R.inc(5672);return this;
        }
        }__CLR4_4_149k49klgchoqgx.R.inc(5673);int[] newValues = getValues();  // cloned
        __CLR4_4_149k49klgchoqgx.R.inc(5674);super.addFieldInto(newValues, field, value);
        __CLR4_4_149k49klgchoqgx.R.inc(5675);return new Period(newValues, getPeriodType());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new period with the specified number of years.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param years the amount of years to add, may be negative
     * @return the new period with the increased years
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period withYears(int years) {try{__CLR4_4_149k49klgchoqgx.R.inc(5676);
        __CLR4_4_149k49klgchoqgx.R.inc(5677);int[] values = getValues();  // cloned
        __CLR4_4_149k49klgchoqgx.R.inc(5678);getPeriodType().setIndexedField(this, PeriodType.YEAR_INDEX, values, years);
        __CLR4_4_149k49klgchoqgx.R.inc(5679);return new Period(values, getPeriodType());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Returns a new period with the specified number of months.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param months the amount of months to add, may be negative
     * @return the new period with the increased months
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period withMonths(int months) {try{__CLR4_4_149k49klgchoqgx.R.inc(5680);
        __CLR4_4_149k49klgchoqgx.R.inc(5681);int[] values = getValues();  // cloned
        __CLR4_4_149k49klgchoqgx.R.inc(5682);getPeriodType().setIndexedField(this, PeriodType.MONTH_INDEX, values, months);
        __CLR4_4_149k49klgchoqgx.R.inc(5683);return new Period(values, getPeriodType());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Returns a new period with the specified number of weeks.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param weeks the amount of weeks to add, may be negative
     * @return the new period with the increased weeks
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period withWeeks(int weeks) {try{__CLR4_4_149k49klgchoqgx.R.inc(5684);
        __CLR4_4_149k49klgchoqgx.R.inc(5685);int[] values = getValues();  // cloned
        __CLR4_4_149k49klgchoqgx.R.inc(5686);getPeriodType().setIndexedField(this, PeriodType.WEEK_INDEX, values, weeks);
        __CLR4_4_149k49klgchoqgx.R.inc(5687);return new Period(values, getPeriodType());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Returns a new period with the specified number of days.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param days the amount of days to add, may be negative
     * @return the new period with the increased days
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period withDays(int days) {try{__CLR4_4_149k49klgchoqgx.R.inc(5688);
        __CLR4_4_149k49klgchoqgx.R.inc(5689);int[] values = getValues();  // cloned
        __CLR4_4_149k49klgchoqgx.R.inc(5690);getPeriodType().setIndexedField(this, PeriodType.DAY_INDEX, values, days);
        __CLR4_4_149k49klgchoqgx.R.inc(5691);return new Period(values, getPeriodType());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Returns a new period with the specified number of hours.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param hours the amount of hours to add, may be negative
     * @return the new period with the increased hours
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period withHours(int hours) {try{__CLR4_4_149k49klgchoqgx.R.inc(5692);
        __CLR4_4_149k49klgchoqgx.R.inc(5693);int[] values = getValues();  // cloned
        __CLR4_4_149k49klgchoqgx.R.inc(5694);getPeriodType().setIndexedField(this, PeriodType.HOUR_INDEX, values, hours);
        __CLR4_4_149k49klgchoqgx.R.inc(5695);return new Period(values, getPeriodType());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Returns a new period with the specified number of minutes.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param minutes the amount of minutes to add, may be negative
     * @return the new period with the increased minutes
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period withMinutes(int minutes) {try{__CLR4_4_149k49klgchoqgx.R.inc(5696);
        __CLR4_4_149k49klgchoqgx.R.inc(5697);int[] values = getValues();  // cloned
        __CLR4_4_149k49klgchoqgx.R.inc(5698);getPeriodType().setIndexedField(this, PeriodType.MINUTE_INDEX, values, minutes);
        __CLR4_4_149k49klgchoqgx.R.inc(5699);return new Period(values, getPeriodType());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Returns a new period with the specified number of seconds.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param seconds the amount of seconds to add, may be negative
     * @return the new period with the increased seconds
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period withSeconds(int seconds) {try{__CLR4_4_149k49klgchoqgx.R.inc(5700);
        __CLR4_4_149k49klgchoqgx.R.inc(5701);int[] values = getValues();  // cloned
        __CLR4_4_149k49klgchoqgx.R.inc(5702);getPeriodType().setIndexedField(this, PeriodType.SECOND_INDEX, values, seconds);
        __CLR4_4_149k49klgchoqgx.R.inc(5703);return new Period(values, getPeriodType());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Returns a new period with the specified number of millis.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param millis the amount of millis to add, may be negative
     * @return the new period with the increased millis
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period withMillis(int millis) {try{__CLR4_4_149k49klgchoqgx.R.inc(5704);
        __CLR4_4_149k49klgchoqgx.R.inc(5705);int[] values = getValues();  // cloned
        __CLR4_4_149k49klgchoqgx.R.inc(5706);getPeriodType().setIndexedField(this, PeriodType.MILLI_INDEX, values, millis);
        __CLR4_4_149k49klgchoqgx.R.inc(5707);return new Period(values, getPeriodType());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new period with the specified period added.
     * <p>
     * Each field of the period is added separately. Thus a period of
     * 2 hours 30 minutes plus 3 hours 40 minutes will produce a result
     * of 5 hours 70 minutes - see {@link #normalizedStandard()}.
     * <p>
     * If the period being added contains a non-zero amount for a field that
     * is not supported in this period then an exception is thrown.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param period the period to add, null adds zero and returns this
     * @return the new updated period
     * @throws UnsupportedOperationException if any field is not supported
     * @since 1.5
     */
    public Period plus(ReadablePeriod period) {try{__CLR4_4_149k49klgchoqgx.R.inc(5708);
        __CLR4_4_149k49klgchoqgx.R.inc(5709);if ((((period == null)&&(__CLR4_4_149k49klgchoqgx.R.iget(5710)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5711)==0&false))) {{
            __CLR4_4_149k49klgchoqgx.R.inc(5712);return this;
        }
        }__CLR4_4_149k49klgchoqgx.R.inc(5713);int[] values = getValues();  // cloned
        __CLR4_4_149k49klgchoqgx.R.inc(5714);getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, period.get(DurationFieldType.YEARS_TYPE));
        __CLR4_4_149k49klgchoqgx.R.inc(5715);getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, period.get(DurationFieldType.MONTHS_TYPE));
        __CLR4_4_149k49klgchoqgx.R.inc(5716);getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, period.get(DurationFieldType.WEEKS_TYPE));
        __CLR4_4_149k49klgchoqgx.R.inc(5717);getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, period.get(DurationFieldType.DAYS_TYPE));
        __CLR4_4_149k49klgchoqgx.R.inc(5718);getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, period.get(DurationFieldType.HOURS_TYPE));
        __CLR4_4_149k49klgchoqgx.R.inc(5719);getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, period.get(DurationFieldType.MINUTES_TYPE));
        __CLR4_4_149k49klgchoqgx.R.inc(5720);getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, period.get(DurationFieldType.SECONDS_TYPE));
        __CLR4_4_149k49klgchoqgx.R.inc(5721);getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, period.get(DurationFieldType.MILLIS_TYPE));
        __CLR4_4_149k49klgchoqgx.R.inc(5722);return new Period(values, getPeriodType());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new period with the specified number of years added.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param years the amount of years to add, may be negative
     * @return the new period with the increased years
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period plusYears(int years) {try{__CLR4_4_149k49klgchoqgx.R.inc(5723);
        __CLR4_4_149k49klgchoqgx.R.inc(5724);if ((((years == 0)&&(__CLR4_4_149k49klgchoqgx.R.iget(5725)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5726)==0&false))) {{
            __CLR4_4_149k49klgchoqgx.R.inc(5727);return this;
        }
        }__CLR4_4_149k49klgchoqgx.R.inc(5728);int[] values = getValues();  // cloned
        __CLR4_4_149k49klgchoqgx.R.inc(5729);getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, years);
        __CLR4_4_149k49klgchoqgx.R.inc(5730);return new Period(values, getPeriodType());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Returns a new period plus the specified number of months added.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param months the amount of months to add, may be negative
     * @return the new period plus the increased months
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period plusMonths(int months) {try{__CLR4_4_149k49klgchoqgx.R.inc(5731);
        __CLR4_4_149k49klgchoqgx.R.inc(5732);if ((((months == 0)&&(__CLR4_4_149k49klgchoqgx.R.iget(5733)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5734)==0&false))) {{
            __CLR4_4_149k49klgchoqgx.R.inc(5735);return this;
        }
        }__CLR4_4_149k49klgchoqgx.R.inc(5736);int[] values = getValues();  // cloned
        __CLR4_4_149k49klgchoqgx.R.inc(5737);getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, months);
        __CLR4_4_149k49klgchoqgx.R.inc(5738);return new Period(values, getPeriodType());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Returns a new period plus the specified number of weeks added.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param weeks the amount of weeks to add, may be negative
     * @return the new period plus the increased weeks
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period plusWeeks(int weeks) {try{__CLR4_4_149k49klgchoqgx.R.inc(5739);
        __CLR4_4_149k49klgchoqgx.R.inc(5740);if ((((weeks == 0)&&(__CLR4_4_149k49klgchoqgx.R.iget(5741)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5742)==0&false))) {{
            __CLR4_4_149k49klgchoqgx.R.inc(5743);return this;
        }
        }__CLR4_4_149k49klgchoqgx.R.inc(5744);int[] values = getValues();  // cloned
        __CLR4_4_149k49klgchoqgx.R.inc(5745);getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, weeks);
        __CLR4_4_149k49klgchoqgx.R.inc(5746);return new Period(values, getPeriodType());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Returns a new period plus the specified number of days added.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param days the amount of days to add, may be negative
     * @return the new period plus the increased days
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period plusDays(int days) {try{__CLR4_4_149k49klgchoqgx.R.inc(5747);
        __CLR4_4_149k49klgchoqgx.R.inc(5748);if ((((days == 0)&&(__CLR4_4_149k49klgchoqgx.R.iget(5749)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5750)==0&false))) {{
            __CLR4_4_149k49klgchoqgx.R.inc(5751);return this;
        }
        }__CLR4_4_149k49klgchoqgx.R.inc(5752);int[] values = getValues();  // cloned
        __CLR4_4_149k49klgchoqgx.R.inc(5753);getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, days);
        __CLR4_4_149k49klgchoqgx.R.inc(5754);return new Period(values, getPeriodType());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Returns a new period plus the specified number of hours added.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param hours the amount of hours to add, may be negative
     * @return the new period plus the increased hours
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period plusHours(int hours) {try{__CLR4_4_149k49klgchoqgx.R.inc(5755);
        __CLR4_4_149k49klgchoqgx.R.inc(5756);if ((((hours == 0)&&(__CLR4_4_149k49klgchoqgx.R.iget(5757)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5758)==0&false))) {{
            __CLR4_4_149k49klgchoqgx.R.inc(5759);return this;
        }
        }__CLR4_4_149k49klgchoqgx.R.inc(5760);int[] values = getValues();  // cloned
        __CLR4_4_149k49klgchoqgx.R.inc(5761);getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, hours);
        __CLR4_4_149k49klgchoqgx.R.inc(5762);return new Period(values, getPeriodType());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Returns a new period plus the specified number of minutes added.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param minutes the amount of minutes to add, may be negative
     * @return the new period plus the increased minutes
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period plusMinutes(int minutes) {try{__CLR4_4_149k49klgchoqgx.R.inc(5763);
        __CLR4_4_149k49klgchoqgx.R.inc(5764);if ((((minutes == 0)&&(__CLR4_4_149k49klgchoqgx.R.iget(5765)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5766)==0&false))) {{
            __CLR4_4_149k49klgchoqgx.R.inc(5767);return this;
        }
        }__CLR4_4_149k49klgchoqgx.R.inc(5768);int[] values = getValues();  // cloned
        __CLR4_4_149k49klgchoqgx.R.inc(5769);getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, minutes);
        __CLR4_4_149k49klgchoqgx.R.inc(5770);return new Period(values, getPeriodType());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Returns a new period plus the specified number of seconds added.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param seconds the amount of seconds to add, may be negative
     * @return the new period plus the increased seconds
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period plusSeconds(int seconds) {try{__CLR4_4_149k49klgchoqgx.R.inc(5771);
        __CLR4_4_149k49klgchoqgx.R.inc(5772);if ((((seconds == 0)&&(__CLR4_4_149k49klgchoqgx.R.iget(5773)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5774)==0&false))) {{
            __CLR4_4_149k49klgchoqgx.R.inc(5775);return this;
        }
        }__CLR4_4_149k49klgchoqgx.R.inc(5776);int[] values = getValues();  // cloned
        __CLR4_4_149k49klgchoqgx.R.inc(5777);getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, seconds);
        __CLR4_4_149k49klgchoqgx.R.inc(5778);return new Period(values, getPeriodType());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Returns a new period plus the specified number of millis added.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param millis the amount of millis to add, may be negative
     * @return the new period plus the increased millis
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period plusMillis(int millis) {try{__CLR4_4_149k49klgchoqgx.R.inc(5779);
        __CLR4_4_149k49klgchoqgx.R.inc(5780);if ((((millis == 0)&&(__CLR4_4_149k49klgchoqgx.R.iget(5781)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5782)==0&false))) {{
            __CLR4_4_149k49klgchoqgx.R.inc(5783);return this;
        }
        }__CLR4_4_149k49klgchoqgx.R.inc(5784);int[] values = getValues();  // cloned
        __CLR4_4_149k49klgchoqgx.R.inc(5785);getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, millis);
        __CLR4_4_149k49klgchoqgx.R.inc(5786);return new Period(values, getPeriodType());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new period with the specified period subtracted.
     * <p>
     * Each field of the period is subtracted separately. Thus a period of
     * 3 hours 30 minutes minus 2 hours 40 minutes will produce a result
     * of 1 hour and -10 minutes - see {@link #normalizedStandard()}.
     * <p>
     * If the period being added contains a non-zero amount for a field that
     * is not supported in this period then an exception is thrown.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param period the period to add, null adds zero and returns this
     * @return the new updated period
     * @throws UnsupportedOperationException if any field is not supported
     * @since 1.5
     */
    public Period minus(ReadablePeriod period) {try{__CLR4_4_149k49klgchoqgx.R.inc(5787);
        __CLR4_4_149k49klgchoqgx.R.inc(5788);if ((((period == null)&&(__CLR4_4_149k49klgchoqgx.R.iget(5789)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5790)==0&false))) {{
            __CLR4_4_149k49klgchoqgx.R.inc(5791);return this;
        }
        }__CLR4_4_149k49klgchoqgx.R.inc(5792);int[] values = getValues();  // cloned
        __CLR4_4_149k49klgchoqgx.R.inc(5793);getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, -period.get(DurationFieldType.YEARS_TYPE));
        __CLR4_4_149k49klgchoqgx.R.inc(5794);getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, -period.get(DurationFieldType.MONTHS_TYPE));
        __CLR4_4_149k49klgchoqgx.R.inc(5795);getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, -period.get(DurationFieldType.WEEKS_TYPE));
        __CLR4_4_149k49klgchoqgx.R.inc(5796);getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, -period.get(DurationFieldType.DAYS_TYPE));
        __CLR4_4_149k49klgchoqgx.R.inc(5797);getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, -period.get(DurationFieldType.HOURS_TYPE));
        __CLR4_4_149k49klgchoqgx.R.inc(5798);getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, -period.get(DurationFieldType.MINUTES_TYPE));
        __CLR4_4_149k49klgchoqgx.R.inc(5799);getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, -period.get(DurationFieldType.SECONDS_TYPE));
        __CLR4_4_149k49klgchoqgx.R.inc(5800);getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, -period.get(DurationFieldType.MILLIS_TYPE));
        __CLR4_4_149k49klgchoqgx.R.inc(5801);return new Period(values, getPeriodType());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new period with the specified number of years taken away.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param years the amount of years to take away, may be negative
     * @return the new period with the increased years
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period minusYears(int years) {try{__CLR4_4_149k49klgchoqgx.R.inc(5802);
        __CLR4_4_149k49klgchoqgx.R.inc(5803);return plusYears(-years);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Returns a new period minus the specified number of months taken away.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param months the amount of months to take away, may be negative
     * @return the new period minus the increased months
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period minusMonths(int months) {try{__CLR4_4_149k49klgchoqgx.R.inc(5804);
        __CLR4_4_149k49klgchoqgx.R.inc(5805);return plusMonths(-months);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Returns a new period minus the specified number of weeks taken away.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param weeks the amount of weeks to take away, may be negative
     * @return the new period minus the increased weeks
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period minusWeeks(int weeks) {try{__CLR4_4_149k49klgchoqgx.R.inc(5806);
        __CLR4_4_149k49klgchoqgx.R.inc(5807);return plusWeeks(-weeks);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Returns a new period minus the specified number of days taken away.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param days the amount of days to take away, may be negative
     * @return the new period minus the increased days
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period minusDays(int days) {try{__CLR4_4_149k49klgchoqgx.R.inc(5808);
        __CLR4_4_149k49klgchoqgx.R.inc(5809);return plusDays(-days);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Returns a new period minus the specified number of hours taken away.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param hours the amount of hours to take away, may be negative
     * @return the new period minus the increased hours
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period minusHours(int hours) {try{__CLR4_4_149k49klgchoqgx.R.inc(5810);
        __CLR4_4_149k49klgchoqgx.R.inc(5811);return plusHours(-hours);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Returns a new period minus the specified number of minutes taken away.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param minutes the amount of minutes to take away, may be negative
     * @return the new period minus the increased minutes
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period minusMinutes(int minutes) {try{__CLR4_4_149k49klgchoqgx.R.inc(5812);
        __CLR4_4_149k49klgchoqgx.R.inc(5813);return plusMinutes(-minutes);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Returns a new period minus the specified number of seconds taken away.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param seconds the amount of seconds to take away, may be negative
     * @return the new period minus the increased seconds
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period minusSeconds(int seconds) {try{__CLR4_4_149k49klgchoqgx.R.inc(5814);
        __CLR4_4_149k49klgchoqgx.R.inc(5815);return plusSeconds(-seconds);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Returns a new period minus the specified number of millis taken away.
     * <p>
     * This period instance is immutable and unaffected by this method call.
     *
     * @param millis the amount of millis to take away, may be negative
     * @return the new period minus the increased millis
     * @throws UnsupportedOperationException if the field is not supported
     */
    public Period minusMillis(int millis) {try{__CLR4_4_149k49klgchoqgx.R.inc(5816);
        __CLR4_4_149k49klgchoqgx.R.inc(5817);return plusMillis(-millis);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new instance with each element in this period multiplied
     * by the specified scalar.
     *
     * @param scalar the scalar to multiply by, not null
     * @return a {@code Period} based on this period with the amounts multiplied by the scalar, never null
     * @throws ArithmeticException if the capacity of any field is exceeded
     * @since 2.1
     */
    public Period multipliedBy(int scalar) {try{__CLR4_4_149k49klgchoqgx.R.inc(5818);
        __CLR4_4_149k49klgchoqgx.R.inc(5819);if ((((this == ZERO || scalar == 1)&&(__CLR4_4_149k49klgchoqgx.R.iget(5820)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5821)==0&false))) {{
            __CLR4_4_149k49klgchoqgx.R.inc(5822);return this;
        }
        }__CLR4_4_149k49klgchoqgx.R.inc(5823);int[] values = getValues();  // cloned
        __CLR4_4_149k49klgchoqgx.R.inc(5824);for (int i = 0; (((i < values.length)&&(__CLR4_4_149k49klgchoqgx.R.iget(5825)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5826)==0&false)); i++) {{
            __CLR4_4_149k49klgchoqgx.R.inc(5827);values[i] = FieldUtils.safeMultiply(values[i], scalar);
        }
        }__CLR4_4_149k49klgchoqgx.R.inc(5828);return new Period(values, getPeriodType());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Returns a new instance with each amount in this period negated.
     *
     * @return a {@code Period} based on this period with the amounts negated, never null
     * @throws ArithmeticException if any field has the minimum value
     * @since 2.1
     */
    public Period negated() {try{__CLR4_4_149k49klgchoqgx.R.inc(5829);
        __CLR4_4_149k49klgchoqgx.R.inc(5830);return multipliedBy(-1);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this period to a period in weeks assuming a
     * 7 day week, 24 hour day, 60 minute hour and 60 second minute.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all
     * weeks are 7 days, all days are 24 hours, all hours are 60 minutes and
     * all minutes are 60 seconds. This is not true when daylight savings time
     * is considered, and may also not be true for some unusual chronologies.
     * However, it is included as it is a useful operation for many
     * applications and business rules.
     * <p>
     * If the period contains years or months, an exception will be thrown.
     *
     * @return a period representing the number of standard weeks in this period
     * @throws UnsupportedOperationException if the period contains years or months
     * @throws ArithmeticException           if the number of weeks is too large to be represented
     * @since 1.5
     */
    public Weeks toStandardWeeks() {try{__CLR4_4_149k49klgchoqgx.R.inc(5831);
        __CLR4_4_149k49klgchoqgx.R.inc(5832);checkYearsAndMonths("Weeks");
        __CLR4_4_149k49klgchoqgx.R.inc(5833);long millis = getMillis();  // assign to a long
        __CLR4_4_149k49klgchoqgx.R.inc(5834);millis += ((long) getSeconds()) * DateTimeConstants.MILLIS_PER_SECOND;
        __CLR4_4_149k49klgchoqgx.R.inc(5835);millis += ((long) getMinutes()) * DateTimeConstants.MILLIS_PER_MINUTE;
        __CLR4_4_149k49klgchoqgx.R.inc(5836);millis += ((long) getHours()) * DateTimeConstants.MILLIS_PER_HOUR;
        __CLR4_4_149k49klgchoqgx.R.inc(5837);millis += ((long) getDays()) * DateTimeConstants.MILLIS_PER_DAY;
        __CLR4_4_149k49klgchoqgx.R.inc(5838);long weeks = ((long) getWeeks()) + millis / DateTimeConstants.MILLIS_PER_WEEK;
        __CLR4_4_149k49klgchoqgx.R.inc(5839);return Weeks.weeks(FieldUtils.safeToInt(weeks));
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Converts this period to a period in days assuming a
     * 7 day week, 24 hour day, 60 minute hour and 60 second minute.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all
     * weeks are 7 days, all days are 24 hours, all hours are 60 minutes and
     * all minutes are 60 seconds. This is not true when daylight savings time
     * is considered, and may also not be true for some unusual chronologies.
     * However, it is included as it is a useful operation for many
     * applications and business rules.
     * <p>
     * If the period contains years or months, an exception will be thrown.
     *
     * @return a period representing the number of standard days in this period
     * @throws UnsupportedOperationException if the period contains years or months
     * @throws ArithmeticException           if the number of days is too large to be represented
     * @since 1.5
     */
    public Days toStandardDays() {try{__CLR4_4_149k49klgchoqgx.R.inc(5840);
        __CLR4_4_149k49klgchoqgx.R.inc(5841);checkYearsAndMonths("Days");
        __CLR4_4_149k49klgchoqgx.R.inc(5842);long millis = getMillis();  // assign to a long
        __CLR4_4_149k49klgchoqgx.R.inc(5843);millis += ((long) getSeconds()) * DateTimeConstants.MILLIS_PER_SECOND;
        __CLR4_4_149k49klgchoqgx.R.inc(5844);millis += ((long) getMinutes()) * DateTimeConstants.MILLIS_PER_MINUTE;
        __CLR4_4_149k49klgchoqgx.R.inc(5845);millis += ((long) getHours()) * DateTimeConstants.MILLIS_PER_HOUR;
        __CLR4_4_149k49klgchoqgx.R.inc(5846);long days = millis / DateTimeConstants.MILLIS_PER_DAY;
        __CLR4_4_149k49klgchoqgx.R.inc(5847);days = FieldUtils.safeAdd(days, getDays());
        __CLR4_4_149k49klgchoqgx.R.inc(5848);days = FieldUtils.safeAdd(days, ((long) getWeeks()) * ((long) DateTimeConstants.DAYS_PER_WEEK));
        __CLR4_4_149k49klgchoqgx.R.inc(5849);return Days.days(FieldUtils.safeToInt(days));
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Converts this period to a period in hours assuming a
     * 7 day week, 24 hour day, 60 minute hour and 60 second minute.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all
     * weeks are 7 days, all days are 24 hours, all hours are 60 minutes and
     * all minutes are 60 seconds. This is not true when daylight savings time
     * is considered, and may also not be true for some unusual chronologies.
     * However, it is included as it is a useful operation for many
     * applications and business rules.
     * <p>
     * If the period contains years or months, an exception will be thrown.
     *
     * @return a period representing the number of standard hours in this period
     * @throws UnsupportedOperationException if the period contains years or months
     * @throws ArithmeticException           if the number of hours is too large to be represented
     * @since 1.5
     */
    public Hours toStandardHours() {try{__CLR4_4_149k49klgchoqgx.R.inc(5850);
        __CLR4_4_149k49klgchoqgx.R.inc(5851);checkYearsAndMonths("Hours");
        __CLR4_4_149k49klgchoqgx.R.inc(5852);long millis = getMillis();  // assign to a long
        __CLR4_4_149k49klgchoqgx.R.inc(5853);millis += ((long) getSeconds()) * DateTimeConstants.MILLIS_PER_SECOND;
        __CLR4_4_149k49klgchoqgx.R.inc(5854);millis += ((long) getMinutes()) * DateTimeConstants.MILLIS_PER_MINUTE;
        __CLR4_4_149k49klgchoqgx.R.inc(5855);long hours = millis / DateTimeConstants.MILLIS_PER_HOUR;
        __CLR4_4_149k49klgchoqgx.R.inc(5856);hours = FieldUtils.safeAdd(hours, getHours());
        __CLR4_4_149k49klgchoqgx.R.inc(5857);hours = FieldUtils.safeAdd(hours, ((long) getDays()) * ((long) DateTimeConstants.HOURS_PER_DAY));
        __CLR4_4_149k49klgchoqgx.R.inc(5858);hours = FieldUtils.safeAdd(hours, ((long) getWeeks()) * ((long) DateTimeConstants.HOURS_PER_WEEK));
        __CLR4_4_149k49klgchoqgx.R.inc(5859);return Hours.hours(FieldUtils.safeToInt(hours));
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Converts this period to a period in minutes assuming a
     * 7 day week, 24 hour day, 60 minute hour and 60 second minute.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all
     * weeks are 7 days, all days are 24 hours, all hours are 60 minutes and
     * all minutes are 60 seconds. This is not true when daylight savings time
     * is considered, and may also not be true for some unusual chronologies.
     * However, it is included as it is a useful operation for many
     * applications and business rules.
     * <p>
     * If the period contains years or months, an exception will be thrown.
     *
     * @return a period representing the number of standard minutes in this period
     * @throws UnsupportedOperationException if the period contains years or months
     * @throws ArithmeticException           if the number of minutes is too large to be represented
     * @since 1.5
     */
    public Minutes toStandardMinutes() {try{__CLR4_4_149k49klgchoqgx.R.inc(5860);
        __CLR4_4_149k49klgchoqgx.R.inc(5861);checkYearsAndMonths("Minutes");
        __CLR4_4_149k49klgchoqgx.R.inc(5862);long millis = getMillis();  // assign to a long
        __CLR4_4_149k49klgchoqgx.R.inc(5863);millis += ((long) getSeconds()) * DateTimeConstants.MILLIS_PER_SECOND;
        __CLR4_4_149k49klgchoqgx.R.inc(5864);long minutes = millis / DateTimeConstants.MILLIS_PER_MINUTE;
        __CLR4_4_149k49klgchoqgx.R.inc(5865);minutes = FieldUtils.safeAdd(minutes, getMinutes());
        __CLR4_4_149k49klgchoqgx.R.inc(5866);minutes = FieldUtils.safeAdd(minutes, ((long) getHours()) * ((long) DateTimeConstants.MINUTES_PER_HOUR));
        __CLR4_4_149k49klgchoqgx.R.inc(5867);minutes = FieldUtils.safeAdd(minutes, ((long) getDays()) * ((long) DateTimeConstants.MINUTES_PER_DAY));
        __CLR4_4_149k49klgchoqgx.R.inc(5868);minutes = FieldUtils.safeAdd(minutes, ((long) getWeeks()) * ((long) DateTimeConstants.MINUTES_PER_WEEK));
        __CLR4_4_149k49klgchoqgx.R.inc(5869);return Minutes.minutes(FieldUtils.safeToInt(minutes));
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Converts this period to a period in seconds assuming a
     * 7 day week, 24 hour day, 60 minute hour and 60 second minute.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all
     * weeks are 7 days, all days are 24 hours, all hours are 60 minutes and
     * all minutes are 60 seconds. This is not true when daylight savings time
     * is considered, and may also not be true for some unusual chronologies.
     * However, it is included as it is a useful operation for many
     * applications and business rules.
     * <p>
     * If the period contains years or months, an exception will be thrown.
     *
     * @return a period representing the number of standard seconds in this period
     * @throws UnsupportedOperationException if the period contains years or months
     * @throws ArithmeticException           if the number of seconds is too large to be represented
     * @since 1.5
     */
    public Seconds toStandardSeconds() {try{__CLR4_4_149k49klgchoqgx.R.inc(5870);
        __CLR4_4_149k49klgchoqgx.R.inc(5871);checkYearsAndMonths("Seconds");
        __CLR4_4_149k49klgchoqgx.R.inc(5872);long seconds = getMillis() / DateTimeConstants.MILLIS_PER_SECOND;
        __CLR4_4_149k49klgchoqgx.R.inc(5873);seconds = FieldUtils.safeAdd(seconds, getSeconds());
        __CLR4_4_149k49klgchoqgx.R.inc(5874);seconds = FieldUtils.safeAdd(seconds, ((long) getMinutes()) * ((long) DateTimeConstants.SECONDS_PER_MINUTE));
        __CLR4_4_149k49klgchoqgx.R.inc(5875);seconds = FieldUtils.safeAdd(seconds, ((long) getHours()) * ((long) DateTimeConstants.SECONDS_PER_HOUR));
        __CLR4_4_149k49klgchoqgx.R.inc(5876);seconds = FieldUtils.safeAdd(seconds, ((long) getDays()) * ((long) DateTimeConstants.SECONDS_PER_DAY));
        __CLR4_4_149k49klgchoqgx.R.inc(5877);seconds = FieldUtils.safeAdd(seconds, ((long) getWeeks()) * ((long) DateTimeConstants.SECONDS_PER_WEEK));
        __CLR4_4_149k49klgchoqgx.R.inc(5878);return Seconds.seconds(FieldUtils.safeToInt(seconds));
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this period to a duration assuming a
     * 7 day week, 24 hour day, 60 minute hour and 60 second minute.
     * <p>
     * This method allows you to convert from a period to a duration.
     * However to achieve this it makes the assumption that all
     * weeks are 7 days, all days are 24 hours, all hours are 60 minutes and
     * all minutes are 60 seconds. This is not true when daylight savings time
     * is considered, and may also not be true for some unusual chronologies.
     * However, it is included as it is a useful operation for many
     * applications and business rules.
     * <p>
     * If the period contains years or months, an exception will be thrown.
     *
     * @return a duration equivalent to this period
     * @throws UnsupportedOperationException if the period contains years or months
     * @since 1.5
     */
    public Duration toStandardDuration() {try{__CLR4_4_149k49klgchoqgx.R.inc(5879);
        __CLR4_4_149k49klgchoqgx.R.inc(5880);checkYearsAndMonths("Duration");
        __CLR4_4_149k49klgchoqgx.R.inc(5881);long millis = getMillis();  // no overflow can happen, even with Integer.MAX_VALUEs
        __CLR4_4_149k49klgchoqgx.R.inc(5882);millis += (((long) getSeconds()) * ((long) DateTimeConstants.MILLIS_PER_SECOND));
        __CLR4_4_149k49klgchoqgx.R.inc(5883);millis += (((long) getMinutes()) * ((long) DateTimeConstants.MILLIS_PER_MINUTE));
        __CLR4_4_149k49klgchoqgx.R.inc(5884);millis += (((long) getHours()) * ((long) DateTimeConstants.MILLIS_PER_HOUR));
        __CLR4_4_149k49klgchoqgx.R.inc(5885);millis += (((long) getDays()) * ((long) DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_149k49klgchoqgx.R.inc(5886);millis += (((long) getWeeks()) * ((long) DateTimeConstants.MILLIS_PER_WEEK));
        __CLR4_4_149k49klgchoqgx.R.inc(5887);return new Duration(millis);
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    /**
     * Check that there are no years or months in the period.
     *
     * @param destintionType the destination type, not null
     * @throws UnsupportedOperationException if the period contains years or months
     */
    private void checkYearsAndMonths(String destintionType) {try{__CLR4_4_149k49klgchoqgx.R.inc(5888);
        __CLR4_4_149k49klgchoqgx.R.inc(5889);if ((((getMonths() != 0)&&(__CLR4_4_149k49klgchoqgx.R.iget(5890)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5891)==0&false))) {{
            __CLR4_4_149k49klgchoqgx.R.inc(5892);throw new UnsupportedOperationException("Cannot convert to " + destintionType + " as this period contains months and months vary in length");
        }
        }__CLR4_4_149k49klgchoqgx.R.inc(5893);if ((((getYears() != 0)&&(__CLR4_4_149k49klgchoqgx.R.iget(5894)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5895)==0&false))) {{
            __CLR4_4_149k49klgchoqgx.R.inc(5896);throw new UnsupportedOperationException("Cannot convert to " + destintionType + " as this period contains years and years vary in length");
        }
    }}finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Normalizes this period using standard rules, assuming a 12 month year,
     * 7 day week, 24 hour day, 60 minute hour and 60 second minute.
     * <p>
     * This method allows you to normalize a period.
     * However to achieve this it makes the assumption that all years are
     * 12 months, all weeks are 7 days, all days are 24 hours,
     * all hours are 60 minutes and all minutes are 60 seconds. This is not
     * true when daylight savings time is considered, and may also not be true
     * for some chronologies. However, it is included as it is a useful operation
     * for many applications and business rules.
     * <p>
     * If the period contains years or months, then the months will be
     * normalized to be between 0 and 11. The days field and below will be
     * normalized as necessary, however this will not overflow into the months
     * field. Thus a period of 1 year 15 months will normalize to 2 years 3 months.
     * But a period of 1 month 40 days will remain as 1 month 40 days.
     * <p>
     * The result will always have a <code>PeriodType</code> of standard, thus
     * days will be grouped into weeks.
     *
     * @return a normalized period equivalent to this period
     * @throws ArithmeticException if any field is too large to be represented
     * @since 1.5
     */
    public Period normalizedStandard() {try{__CLR4_4_149k49klgchoqgx.R.inc(5897);
        __CLR4_4_149k49klgchoqgx.R.inc(5898);return normalizedStandard(PeriodType.standard());
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Normalizes this period using standard rules, assuming a 12 month year,
     * 7 day week, 24 hour day, 60 minute hour and 60 second minute,
     * providing control over how the result is split into fields.
     * <p>
     * This method allows you to normalize a period.
     * However to achieve this it makes the assumption that all years are
     * 12 months, all weeks are 7 days, all days are 24 hours,
     * all hours are 60 minutes and all minutes are 60 seconds. This is not
     * true when daylight savings time is considered, and may also not be true
     * for some chronologies. However, it is included as it is a useful operation
     * for many applications and business rules.
     * <p>
     * If the period contains years or months, then the months will be
     * normalized to be between 0 and 11. The days field and below will be
     * normalized as necessary, however this will not overflow into the months
     * field. Thus a period of 1 year 15 months will normalize to 2 years 3 months.
     * But a period of 1 month 40 days will remain as 1 month 40 days.
     * <p>
     * The PeriodType parameter controls how the result is created. It allows
     * you to omit certain fields from the result if desired. For example,
     * you may not want the result to include weeks, in which case you pass
     * in <code>PeriodType.yearMonthDayTime()</code>.
     *
     * @param type the period type of the new period, null means standard type
     * @return a normalized period equivalent to this period
     * @throws ArithmeticException           if any field is too large to be represented
     * @throws UnsupportedOperationException if this period contains non-zero
     *                                       years or months but the specified period type does not support them
     * @since 1.5
     */
    public Period normalizedStandard(PeriodType type) {try{__CLR4_4_149k49klgchoqgx.R.inc(5899);
        __CLR4_4_149k49klgchoqgx.R.inc(5900);type = DateTimeUtils.getPeriodType(type);
        __CLR4_4_149k49klgchoqgx.R.inc(5901);long millis = getMillis();  // no overflow can happen, even with Integer.MAX_VALUEs
        __CLR4_4_149k49klgchoqgx.R.inc(5902);millis += (((long) getSeconds()) * ((long) DateTimeConstants.MILLIS_PER_SECOND));
        __CLR4_4_149k49klgchoqgx.R.inc(5903);millis += (((long) getMinutes()) * ((long) DateTimeConstants.MILLIS_PER_MINUTE));
        __CLR4_4_149k49klgchoqgx.R.inc(5904);millis += (((long) getHours()) * ((long) DateTimeConstants.MILLIS_PER_HOUR));
        __CLR4_4_149k49klgchoqgx.R.inc(5905);millis += (((long) getDays()) * ((long) DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_149k49klgchoqgx.R.inc(5906);millis += (((long) getWeeks()) * ((long) DateTimeConstants.MILLIS_PER_WEEK));
        __CLR4_4_149k49klgchoqgx.R.inc(5907);Period result = new Period(millis, type, ISOChronology.getInstanceUTC());
        __CLR4_4_149k49klgchoqgx.R.inc(5908);int years = getYears();
        __CLR4_4_149k49klgchoqgx.R.inc(5909);int months = getMonths();
        __CLR4_4_149k49klgchoqgx.R.inc(5910);if ((((years != 0 || months != 0)&&(__CLR4_4_149k49klgchoqgx.R.iget(5911)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5912)==0&false))) {{
            __CLR4_4_149k49klgchoqgx.R.inc(5913);long totalMonths = years * 12L + months;
            __CLR4_4_149k49klgchoqgx.R.inc(5914);if ((((type.isSupported(DurationFieldType.YEARS_TYPE))&&(__CLR4_4_149k49klgchoqgx.R.iget(5915)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5916)==0&false))) {{
                __CLR4_4_149k49klgchoqgx.R.inc(5917);int normalizedYears = FieldUtils.safeToInt(totalMonths / 12);
                __CLR4_4_149k49klgchoqgx.R.inc(5918);result = result.withYears(normalizedYears);
                __CLR4_4_149k49klgchoqgx.R.inc(5919);totalMonths = totalMonths - (normalizedYears * 12);
            }
            }__CLR4_4_149k49klgchoqgx.R.inc(5920);if ((((type.isSupported(DurationFieldType.MONTHS_TYPE))&&(__CLR4_4_149k49klgchoqgx.R.iget(5921)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5922)==0&false))) {{
                __CLR4_4_149k49klgchoqgx.R.inc(5923);int normalizedMonths = FieldUtils.safeToInt(totalMonths);
                __CLR4_4_149k49klgchoqgx.R.inc(5924);result = result.withMonths(normalizedMonths);
                __CLR4_4_149k49klgchoqgx.R.inc(5925);totalMonths = totalMonths - normalizedMonths;
            }
            }__CLR4_4_149k49klgchoqgx.R.inc(5926);if ((((totalMonths != 0)&&(__CLR4_4_149k49klgchoqgx.R.iget(5927)!=0|true))||(__CLR4_4_149k49klgchoqgx.R.iget(5928)==0&false))) {{
                __CLR4_4_149k49klgchoqgx.R.inc(5929);throw new UnsupportedOperationException("Unable to normalize as PeriodType is missing either years or months but period has a month/year amount: " + toString());
            }
        }}
        }__CLR4_4_149k49klgchoqgx.R.inc(5930);return result;
    }finally{__CLR4_4_149k49klgchoqgx.R.flushNeeded();}}

}
