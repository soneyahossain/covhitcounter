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

import org.joda.convert.FromString;
import org.joda.time.base.BasePeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/**
 * Standard mutable time period implementation.
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
 * MutablePeriod is mutable and not thread-safe, unless concurrent threads
 * are not invoking mutator methods.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @see Period
 * @since 1.0
 */
public class MutablePeriod
        extends BasePeriod
        implements ReadWritablePeriod, Cloneable, Serializable {public static class __CLR4_4_13tl3tllgchoqfk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,5120,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization version
     */
    private static final long serialVersionUID = 3436451121567212165L;

    //-----------------------------------------------------------------------

    /**
     * Parses a {@code MutablePeriod} from the specified string.
     * <p>
     * This uses {@link ISOPeriodFormat#standard()}.
     *
     * @param str the string to parse, not null
     * @since 2.0
     */
    @FromString
    public static MutablePeriod parse(String str) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(4953);
        __CLR4_4_13tl3tllgchoqfk.R.inc(4954);return parse(str, ISOPeriodFormat.standard());
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Parses a {@code MutablePeriod} from the specified string using a formatter.
     *
     * @param str       the string to parse, not null
     * @param formatter the formatter to use, not null
     * @since 2.0
     */
    public static MutablePeriod parse(String str, PeriodFormatter formatter) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(4955);
        __CLR4_4_13tl3tllgchoqfk.R.inc(4956);return formatter.parsePeriod(str).toMutablePeriod();
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a zero-length period using the standard period type.
     */
    public MutablePeriod() {
        super(0L, null, null);__CLR4_4_13tl3tllgchoqfk.R.inc(4958);try{__CLR4_4_13tl3tllgchoqfk.R.inc(4957);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Creates a zero-length period using the specified period type.
     *
     * @param type which set of fields this period supports
     */
    public MutablePeriod(PeriodType type) {
        super(0L, type, null);__CLR4_4_13tl3tllgchoqfk.R.inc(4960);try{__CLR4_4_13tl3tllgchoqfk.R.inc(4959);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Create a period from a set of field values using the standard set of fields.
     *
     * @param hours   amount of hours in this period
     * @param minutes amount of minutes in this period
     * @param seconds amount of seconds in this period
     * @param millis  amount of milliseconds in this period
     */
    public MutablePeriod(int hours, int minutes, int seconds, int millis) {
        super(0, 0, 0, 0, hours, minutes, seconds, millis, PeriodType.standard());__CLR4_4_13tl3tllgchoqfk.R.inc(4962);try{__CLR4_4_13tl3tllgchoqfk.R.inc(4961);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

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
    public MutablePeriod(int years, int months, int weeks, int days,
                         int hours, int minutes, int seconds, int millis) {
        super(years, months, weeks, days, hours, minutes, seconds, millis, PeriodType.standard());__CLR4_4_13tl3tllgchoqfk.R.inc(4964);try{__CLR4_4_13tl3tllgchoqfk.R.inc(4963);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Create a period from a set of field values.
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
    public MutablePeriod(int years, int months, int weeks, int days,
                         int hours, int minutes, int seconds, int millis, PeriodType type) {
        super(years, months, weeks, days, hours, minutes, seconds, millis, type);__CLR4_4_13tl3tllgchoqfk.R.inc(4966);try{__CLR4_4_13tl3tllgchoqfk.R.inc(4965);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

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
     * fields, such as the UTC or precise types.
     * </ul>
     *
     * @param duration the duration, in milliseconds
     */
    public MutablePeriod(long duration) {
        super(duration);__CLR4_4_13tl3tllgchoqfk.R.inc(4968);try{__CLR4_4_13tl3tllgchoqfk.R.inc(4967);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

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
    public MutablePeriod(long duration, PeriodType type) {
        super(duration, type, null);__CLR4_4_13tl3tllgchoqfk.R.inc(4970);try{__CLR4_4_13tl3tllgchoqfk.R.inc(4969);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

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
    public MutablePeriod(long duration, Chronology chronology) {
        super(duration, null, chronology);__CLR4_4_13tl3tllgchoqfk.R.inc(4972);try{__CLR4_4_13tl3tllgchoqfk.R.inc(4971);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

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
    public MutablePeriod(long duration, PeriodType type, Chronology chronology) {
        super(duration, type, chronology);__CLR4_4_13tl3tllgchoqfk.R.inc(4974);try{__CLR4_4_13tl3tllgchoqfk.R.inc(4973);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Creates a period from the given interval endpoints using the standard
     * set of fields.
     *
     * @param startInstant interval start, in milliseconds
     * @param endInstant   interval end, in milliseconds
     */
    public MutablePeriod(long startInstant, long endInstant) {
        super(startInstant, endInstant, null, null);__CLR4_4_13tl3tllgchoqfk.R.inc(4976);try{__CLR4_4_13tl3tllgchoqfk.R.inc(4975);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Creates a period from the given interval endpoints.
     *
     * @param startInstant interval start, in milliseconds
     * @param endInstant   interval end, in milliseconds
     * @param type         which set of fields this period supports, null means standard
     */
    public MutablePeriod(long startInstant, long endInstant, PeriodType type) {
        super(startInstant, endInstant, type, null);__CLR4_4_13tl3tllgchoqfk.R.inc(4978);try{__CLR4_4_13tl3tllgchoqfk.R.inc(4977);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Creates a period from the given interval endpoints using the standard
     * set of fields.
     *
     * @param startInstant interval start, in milliseconds
     * @param endInstant   interval end, in milliseconds
     * @param chrono       the chronology to use, null means ISO in default zone
     */
    public MutablePeriod(long startInstant, long endInstant, Chronology chrono) {
        super(startInstant, endInstant, null, chrono);__CLR4_4_13tl3tllgchoqfk.R.inc(4980);try{__CLR4_4_13tl3tllgchoqfk.R.inc(4979);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Creates a period from the given interval endpoints.
     *
     * @param startInstant interval start, in milliseconds
     * @param endInstant   interval end, in milliseconds
     * @param type         which set of fields this period supports, null means standard
     * @param chrono       the chronology to use, null means ISO in default zone
     */
    public MutablePeriod(long startInstant, long endInstant, PeriodType type, Chronology chrono) {
        super(startInstant, endInstant, type, chrono);__CLR4_4_13tl3tllgchoqfk.R.inc(4982);try{__CLR4_4_13tl3tllgchoqfk.R.inc(4981);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Creates a period from the given interval endpoints using the standard
     * set of fields.
     * <p>
     * The chronology of the start instant is used, unless that is null when the
     * chronology of the end instant is used instead.
     *
     * @param startInstant interval start, null means now
     * @param endInstant   interval end, null means now
     */
    public MutablePeriod(ReadableInstant startInstant, ReadableInstant endInstant) {
        super(startInstant, endInstant, null);__CLR4_4_13tl3tllgchoqfk.R.inc(4984);try{__CLR4_4_13tl3tllgchoqfk.R.inc(4983);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Creates a period from the given interval endpoints.
     * <p>
     * The chronology of the start instant is used, unless that is null when the
     * chronology of the end instant is used instead.
     *
     * @param startInstant interval start, null means now
     * @param endInstant   interval end, null means now
     * @param type         which set of fields this period supports, null means AllType
     */
    public MutablePeriod(ReadableInstant startInstant, ReadableInstant endInstant, PeriodType type) {
        super(startInstant, endInstant, type);__CLR4_4_13tl3tllgchoqfk.R.inc(4986);try{__CLR4_4_13tl3tllgchoqfk.R.inc(4985);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Creates a period from the given start point and the duration.
     *
     * @param startInstant the interval start, null means now
     * @param duration     the duration of the interval, null means zero-length
     */
    public MutablePeriod(ReadableInstant startInstant, ReadableDuration duration) {
        super(startInstant, duration, null);__CLR4_4_13tl3tllgchoqfk.R.inc(4988);try{__CLR4_4_13tl3tllgchoqfk.R.inc(4987);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Creates a period from the given start point and the duration.
     *
     * @param startInstant the interval start, null means now
     * @param duration     the duration of the interval, null means zero-length
     * @param type         which set of fields this period supports, null means standard
     */
    public MutablePeriod(ReadableInstant startInstant, ReadableDuration duration, PeriodType type) {
        super(startInstant, duration, type);__CLR4_4_13tl3tllgchoqfk.R.inc(4990);try{__CLR4_4_13tl3tllgchoqfk.R.inc(4989);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Creates a period from the given duration and end point.
     *
     * @param duration   the duration of the interval, null means zero-length
     * @param endInstant the interval end, null means now
     */
    public MutablePeriod(ReadableDuration duration, ReadableInstant endInstant) {
        super(duration, endInstant, null);__CLR4_4_13tl3tllgchoqfk.R.inc(4992);try{__CLR4_4_13tl3tllgchoqfk.R.inc(4991);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Creates a period from the given duration and end point.
     *
     * @param duration   the duration of the interval, null means zero-length
     * @param endInstant the interval end, null means now
     * @param type       which set of fields this period supports, null means standard
     */
    public MutablePeriod(ReadableDuration duration, ReadableInstant endInstant, PeriodType type) {
        super(duration, endInstant, type);__CLR4_4_13tl3tllgchoqfk.R.inc(4994);try{__CLR4_4_13tl3tllgchoqfk.R.inc(4993);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

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
    public MutablePeriod(Object period) {
        super(period, null, null);__CLR4_4_13tl3tllgchoqfk.R.inc(4996);try{__CLR4_4_13tl3tllgchoqfk.R.inc(4995);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

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
    public MutablePeriod(Object period, PeriodType type) {
        super(period, type, null);__CLR4_4_13tl3tllgchoqfk.R.inc(4998);try{__CLR4_4_13tl3tllgchoqfk.R.inc(4997);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

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
    public MutablePeriod(Object period, Chronology chrono) {
        super(period, null, chrono);__CLR4_4_13tl3tllgchoqfk.R.inc(5000);try{__CLR4_4_13tl3tllgchoqfk.R.inc(4999);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

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
    public MutablePeriod(Object period, PeriodType type, Chronology chrono) {
        super(period, type, chrono);__CLR4_4_13tl3tllgchoqfk.R.inc(5002);try{__CLR4_4_13tl3tllgchoqfk.R.inc(5001);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Clears the period, setting all values back to zero.
     */
    public void clear() {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5003);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5004);super.setValues(new int[size()]);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Sets the value of one of the fields by index.
     *
     * @param index the field index
     * @param value the new value for the field
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public void setValue(int index, int value) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5005);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5006);super.setValue(index, value);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Sets the value of one of the fields.
     * <p>
     * The field type specified must be one of those that is supported by the period.
     *
     * @param field a DurationFieldType instance that is supported by this period, not null
     * @param value the new value for the field
     * @throws IllegalArgumentException if the field is null or not supported
     */
    public void set(DurationFieldType field, int value) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5007);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5008);super.setField(field, value);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Sets all the fields in one go from another ReadablePeriod.
     *
     * @param period the period to set, null means zero length period
     * @throws IllegalArgumentException if an unsupported field's value is non-zero
     */
    public void setPeriod(ReadablePeriod period) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5009);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5010);super.setPeriod(period);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Sets all the fields in one go.
     *
     * @param years   amount of years in this period, which must be zero if unsupported
     * @param months  amount of months in this period, which must be zero if unsupported
     * @param weeks   amount of weeks in this period, which must be zero if unsupported
     * @param days    amount of days in this period, which must be zero if unsupported
     * @param hours   amount of hours in this period, which must be zero if unsupported
     * @param minutes amount of minutes in this period, which must be zero if unsupported
     * @param seconds amount of seconds in this period, which must be zero if unsupported
     * @param millis  amount of milliseconds in this period, which must be zero if unsupported
     * @throws IllegalArgumentException if an unsupported field's value is non-zero
     */
    public void setPeriod(int years, int months, int weeks, int days,
                          int hours, int minutes, int seconds, int millis) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5011);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5012);super.setPeriod(years, months, weeks, days, hours, minutes, seconds, millis);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Sets all the fields in one go from an interval using the ISO chronology
     * and dividing the fields using the period type.
     *
     * @param interval the interval to set, null means zero length
     * @throws ArithmeticException if the set exceeds the capacity of the period
     */
    public void setPeriod(ReadableInterval interval) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5013);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5014);if ((((interval == null)&&(__CLR4_4_13tl3tllgchoqfk.R.iget(5015)!=0|true))||(__CLR4_4_13tl3tllgchoqfk.R.iget(5016)==0&false))) {{
            __CLR4_4_13tl3tllgchoqfk.R.inc(5017);setPeriod(0L);
        } }else {{
            __CLR4_4_13tl3tllgchoqfk.R.inc(5018);Chronology chrono = DateTimeUtils.getChronology(interval.getChronology());
            __CLR4_4_13tl3tllgchoqfk.R.inc(5019);setPeriod(interval.getStartMillis(), interval.getEndMillis(), chrono);
        }
    }}finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Sets all the fields in one go from two instants representing an interval.
     * <p>
     * The chronology of the start instant is used, unless that is null when the
     * chronology of the end instant is used instead.
     *
     * @param start the start instant, null means now
     * @param end   the end instant, null means now
     * @throws ArithmeticException if the set exceeds the capacity of the period
     */
    public void setPeriod(ReadableInstant start, ReadableInstant end) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5020);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5021);if ((((start == end)&&(__CLR4_4_13tl3tllgchoqfk.R.iget(5022)!=0|true))||(__CLR4_4_13tl3tllgchoqfk.R.iget(5023)==0&false))) {{
            __CLR4_4_13tl3tllgchoqfk.R.inc(5024);setPeriod(0L);
        } }else {{
            __CLR4_4_13tl3tllgchoqfk.R.inc(5025);long startMillis = DateTimeUtils.getInstantMillis(start);
            __CLR4_4_13tl3tllgchoqfk.R.inc(5026);long endMillis = DateTimeUtils.getInstantMillis(end);
            __CLR4_4_13tl3tllgchoqfk.R.inc(5027);Chronology chrono = DateTimeUtils.getIntervalChronology(start, end);
            __CLR4_4_13tl3tllgchoqfk.R.inc(5028);setPeriod(startMillis, endMillis, chrono);
        }
    }}finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Sets all the fields in one go from a millisecond interval using ISOChronology
     * and dividing the fields using the period type.
     *
     * @param startInstant interval start, in milliseconds
     * @param endInstant   interval end, in milliseconds
     * @throws ArithmeticException if the set exceeds the capacity of the period
     */
    public void setPeriod(long startInstant, long endInstant) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5029);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5030);setPeriod(startInstant, endInstant, null);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Sets all the fields in one go from a millisecond interval.
     *
     * @param startInstant interval start, in milliseconds
     * @param endInstant   interval end, in milliseconds
     * @param chrono       the chronology to use, null means ISO chronology
     * @throws ArithmeticException if the set exceeds the capacity of the period
     */
    public void setPeriod(long startInstant, long endInstant, Chronology chrono) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5031);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5032);chrono = DateTimeUtils.getChronology(chrono);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5033);setValues(chrono.get(this, startInstant, endInstant));
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Sets all the fields in one go from a duration dividing the
     * fields using the period type.
     * <p>
     * When dividing the duration, only precise fields in the period type will be used.
     * For large durations, all the remaining duration will be stored in the largest
     * available precise field.
     *
     * @param duration the duration to set, null means zero length
     * @throws ArithmeticException if the set exceeds the capacity of the period
     */
    public void setPeriod(ReadableDuration duration) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5034);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5035);setPeriod(duration, null);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Sets all the fields in one go from a duration dividing the
     * fields using the period type.
     * <p>
     * When dividing the duration, only precise fields in the period type will be used.
     * For large durations, all the remaining duration will be stored in the largest
     * available precise field.
     *
     * @param duration the duration to set, null means zero length
     * @param chrono   the chronology to use, null means ISO default
     * @throws ArithmeticException if the set exceeds the capacity of the period
     */
    public void setPeriod(ReadableDuration duration, Chronology chrono) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5036);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5037);long durationMillis = DateTimeUtils.getDurationMillis(duration);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5038);setPeriod(durationMillis, chrono);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Sets all the fields in one go from a millisecond duration dividing the
     * fields using the period type.
     * <p>
     * When dividing the duration, only precise fields in the period type will be used.
     * For large durations, all the remaining duration will be stored in the largest
     * available precise field.
     *
     * @param duration the duration, in milliseconds
     * @throws ArithmeticException if the set exceeds the capacity of the period
     */
    public void setPeriod(long duration) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5039);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5040);setPeriod(duration, null);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Sets all the fields in one go from a millisecond duration.
     * <p>
     * When dividing the duration, only precise fields in the period type will be used.
     * For large durations, all the remaining duration will be stored in the largest
     * available precise field.
     *
     * @param duration the duration, in milliseconds
     * @param chrono   the chronology to use, null means ISO chronology
     * @throws ArithmeticException if the set exceeds the capacity of the period
     */
    public void setPeriod(long duration, Chronology chrono) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5041);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5042);chrono = DateTimeUtils.getChronology(chrono);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5043);setValues(chrono.get(this, duration));
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Adds to the value of one of the fields.
     * <p>
     * The field type specified must be one of those that is supported by the period.
     *
     * @param field a DurationFieldType instance that is supported by this period, not null
     * @param value the value to add to the field
     * @throws IllegalArgumentException if the field is null or not supported
     */
    public void add(DurationFieldType field, int value) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5044);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5045);super.addField(field, value);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Adds a period to this one by adding each field in turn.
     *
     * @param period the period to add, null means add nothing
     * @throws IllegalArgumentException if the period being added contains a field
     *                                  not supported by this period
     * @throws ArithmeticException      if the addition exceeds the capacity of the period
     */
    public void add(ReadablePeriod period) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5046);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5047);super.addPeriod(period);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Adds to each field of this period.
     *
     * @param years   amount of years to add to this period, which must be zero if unsupported
     * @param months  amount of months to add to this period, which must be zero if unsupported
     * @param weeks   amount of weeks to add to this period, which must be zero if unsupported
     * @param days    amount of days to add to this period, which must be zero if unsupported
     * @param hours   amount of hours to add to this period, which must be zero if unsupported
     * @param minutes amount of minutes to add to this period, which must be zero if unsupported
     * @param seconds amount of seconds to add to this period, which must be zero if unsupported
     * @param millis  amount of milliseconds to add to this period, which must be zero if unsupported
     * @throws IllegalArgumentException if the period being added contains a field
     *                                  not supported by this period
     * @throws ArithmeticException      if the addition exceeds the capacity of the period
     */
    public void add(int years, int months, int weeks, int days,
                    int hours, int minutes, int seconds, int millis) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5048);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5049);setPeriod(
                FieldUtils.safeAdd(getYears(), years),
                FieldUtils.safeAdd(getMonths(), months),
                FieldUtils.safeAdd(getWeeks(), weeks),
                FieldUtils.safeAdd(getDays(), days),
                FieldUtils.safeAdd(getHours(), hours),
                FieldUtils.safeAdd(getMinutes(), minutes),
                FieldUtils.safeAdd(getSeconds(), seconds),
                FieldUtils.safeAdd(getMillis(), millis)
        );
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Adds an interval to this one by dividing the interval into
     * fields and calling {@link #add(ReadablePeriod)}.
     *
     * @param interval the interval to add, null means add nothing
     * @throws ArithmeticException if the addition exceeds the capacity of the period
     */
    public void add(ReadableInterval interval) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5050);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5051);if ((((interval != null)&&(__CLR4_4_13tl3tllgchoqfk.R.iget(5052)!=0|true))||(__CLR4_4_13tl3tllgchoqfk.R.iget(5053)==0&false))) {{
            __CLR4_4_13tl3tllgchoqfk.R.inc(5054);add(interval.toPeriod(getPeriodType()));
        }
    }}finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Adds a duration to this one by dividing the duration into
     * fields and calling {@link #add(ReadablePeriod)}.
     *
     * @param duration the duration to add, null means add nothing
     * @throws ArithmeticException if the addition exceeds the capacity of the period
     */
    public void add(ReadableDuration duration) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5055);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5056);if ((((duration != null)&&(__CLR4_4_13tl3tllgchoqfk.R.iget(5057)!=0|true))||(__CLR4_4_13tl3tllgchoqfk.R.iget(5058)==0&false))) {{
            __CLR4_4_13tl3tllgchoqfk.R.inc(5059);add(new Period(duration.getMillis(), getPeriodType()));
        }
    }}finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Adds a millisecond duration to this one by dividing the duration into
     * fields and calling {@link #add(ReadablePeriod)}.
     * <p>
     * When dividing the duration, only precise fields in the period type will be used.
     * For large durations, all the remaining duration will be stored in the largest
     * available precise field.
     *
     * @param duration the duration, in milliseconds
     * @throws ArithmeticException if the addition exceeds the capacity of the period
     */
    public void add(long duration) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5060);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5061);add(new Period(duration, getPeriodType()));
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Adds a millisecond duration to this one by dividing the duration into
     * fields and calling {@link #add(ReadablePeriod)}.
     * <p>
     * When dividing the duration, only precise fields in the period type will be used.
     * For large durations, all the remaining duration will be stored in the largest
     * available precise field.
     *
     * @param duration the duration, in milliseconds
     * @param chrono   the chronology to use, null means ISO default
     * @throws ArithmeticException if the addition exceeds the capacity of the period
     */
    public void add(long duration, Chronology chrono) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5062);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5063);add(new Period(duration, getPeriodType(), chrono));
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Merges all the fields from the specified period into this one.
     * <p>
     * Fields that are not present in the specified period are left unaltered.
     *
     * @param period the period to set, null ignored
     * @throws IllegalArgumentException if an unsupported field's value is non-zero
     */
    public void mergePeriod(ReadablePeriod period) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5064);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5065);super.mergePeriod(period);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the years field part of the period.
     *
     * @return the number of years in the period, zero if unsupported
     */
    public int getYears() {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5066);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5067);return getPeriodType().getIndexedField(this, PeriodType.YEAR_INDEX);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Gets the months field part of the period.
     *
     * @return the number of months in the period, zero if unsupported
     */
    public int getMonths() {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5068);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5069);return getPeriodType().getIndexedField(this, PeriodType.MONTH_INDEX);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Gets the weeks field part of the period.
     *
     * @return the number of weeks in the period, zero if unsupported
     */
    public int getWeeks() {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5070);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5071);return getPeriodType().getIndexedField(this, PeriodType.WEEK_INDEX);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Gets the days field part of the period.
     *
     * @return the number of days in the period, zero if unsupported
     */
    public int getDays() {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5072);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5073);return getPeriodType().getIndexedField(this, PeriodType.DAY_INDEX);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the hours field part of the period.
     *
     * @return the number of hours in the period, zero if unsupported
     */
    public int getHours() {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5074);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5075);return getPeriodType().getIndexedField(this, PeriodType.HOUR_INDEX);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Gets the minutes field part of the period.
     *
     * @return the number of minutes in the period, zero if unsupported
     */
    public int getMinutes() {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5076);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5077);return getPeriodType().getIndexedField(this, PeriodType.MINUTE_INDEX);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Gets the seconds field part of the period.
     *
     * @return the number of seconds in the period, zero if unsupported
     */
    public int getSeconds() {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5078);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5079);return getPeriodType().getIndexedField(this, PeriodType.SECOND_INDEX);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Gets the millis field part of the period.
     *
     * @return the number of millis in the period, zero if unsupported
     */
    public int getMillis() {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5080);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5081);return getPeriodType().getIndexedField(this, PeriodType.MILLI_INDEX);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Sets the number of years of the period.
     *
     * @param years the number of years
     * @throws IllegalArgumentException if field is not supported and the value is non-zero
     */
    public void setYears(int years) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5082);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5083);super.setField(DurationFieldType.years(), years);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Adds the specified years to the number of years in the period.
     *
     * @param years the number of years
     * @throws IllegalArgumentException if field is not supported and the value is non-zero
     * @throws ArithmeticException      if the addition exceeds the capacity of the period
     */
    public void addYears(int years) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5084);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5085);super.addField(DurationFieldType.years(), years);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Sets the number of months of the period.
     *
     * @param months the number of months
     * @throws IllegalArgumentException if field is not supported and the value is non-zero
     */
    public void setMonths(int months) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5086);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5087);super.setField(DurationFieldType.months(), months);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Adds the specified months to the number of months in the period.
     *
     * @param months the number of months
     * @throws IllegalArgumentException if field is not supported and the value is non-zero
     * @throws ArithmeticException      if the addition exceeds the capacity of the period
     */
    public void addMonths(int months) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5088);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5089);super.addField(DurationFieldType.months(), months);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Sets the number of weeks of the period.
     *
     * @param weeks the number of weeks
     * @throws IllegalArgumentException if field is not supported and the value is non-zero
     */
    public void setWeeks(int weeks) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5090);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5091);super.setField(DurationFieldType.weeks(), weeks);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Adds the specified weeks to the number of weeks in the period.
     *
     * @param weeks the number of weeks
     * @throws IllegalArgumentException if field is not supported and the value is non-zero
     * @throws ArithmeticException      if the addition exceeds the capacity of the period
     */
    public void addWeeks(int weeks) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5092);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5093);super.addField(DurationFieldType.weeks(), weeks);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Sets the number of days of the period.
     *
     * @param days the number of days
     * @throws IllegalArgumentException if field is not supported and the value is non-zero
     */
    public void setDays(int days) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5094);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5095);super.setField(DurationFieldType.days(), days);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Adds the specified days to the number of days in the period.
     *
     * @param days the number of days
     * @throws IllegalArgumentException if field is not supported and the value is non-zero
     * @throws ArithmeticException      if the addition exceeds the capacity of the period
     */
    public void addDays(int days) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5096);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5097);super.addField(DurationFieldType.days(), days);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Sets the number of hours of the period.
     *
     * @param hours the number of hours
     * @throws IllegalArgumentException if field is not supported and the value is non-zero
     */
    public void setHours(int hours) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5098);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5099);super.setField(DurationFieldType.hours(), hours);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Adds the specified hours to the number of hours in the period.
     *
     * @param hours the number of hours
     * @throws IllegalArgumentException if field is not supported and the value is non-zero
     * @throws ArithmeticException      if the addition exceeds the capacity of the period
     */
    public void addHours(int hours) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5100);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5101);super.addField(DurationFieldType.hours(), hours);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Sets the number of minutes of the period.
     *
     * @param minutes the number of minutes
     * @throws IllegalArgumentException if field is not supported and the value is non-zero
     */
    public void setMinutes(int minutes) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5102);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5103);super.setField(DurationFieldType.minutes(), minutes);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Adds the specified minutes to the number of minutes in the period.
     *
     * @param minutes the number of minutes
     * @throws IllegalArgumentException if field is not supported and the value is non-zero
     * @throws ArithmeticException      if the addition exceeds the capacity of the period
     */
    public void addMinutes(int minutes) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5104);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5105);super.addField(DurationFieldType.minutes(), minutes);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Sets the number of seconds of the period.
     *
     * @param seconds the number of seconds
     * @throws IllegalArgumentException if field is not supported and the value is non-zero
     */
    public void setSeconds(int seconds) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5106);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5107);super.setField(DurationFieldType.seconds(), seconds);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Adds the specified seconds to the number of seconds in the period.
     *
     * @param seconds the number of seconds
     * @throws IllegalArgumentException if field is not supported and the value is non-zero
     * @throws ArithmeticException      if the addition exceeds the capacity of the period
     */
    public void addSeconds(int seconds) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5108);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5109);super.addField(DurationFieldType.seconds(), seconds);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Sets the number of millis of the period.
     *
     * @param millis the number of millis
     * @throws IllegalArgumentException if field is not supported and the value is non-zero
     */
    public void setMillis(int millis) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5110);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5111);super.setField(DurationFieldType.millis(), millis);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Adds the specified millis to the number of millis in the period.
     *
     * @param millis the number of millis
     * @throws IllegalArgumentException if field is not supported and the value is non-zero
     * @throws ArithmeticException      if the addition exceeds the capacity of the period
     */
    public void addMillis(int millis) {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5112);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5113);super.addField(DurationFieldType.millis(), millis);
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    // Misc
    //-----------------------------------------------------------------------

    /**
     * Clone this object without having to cast the returned object.
     *
     * @return a clone of the this object.
     */
    public MutablePeriod copy() {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5114);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5115);return (MutablePeriod) clone();
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

    /**
     * Clone this object.
     *
     * @return a clone of this object.
     */
    public Object clone() {try{__CLR4_4_13tl3tllgchoqfk.R.inc(5116);
        __CLR4_4_13tl3tllgchoqfk.R.inc(5117);try {
            __CLR4_4_13tl3tllgchoqfk.R.inc(5118);return super.clone();
        } catch (CloneNotSupportedException ex) {
            __CLR4_4_13tl3tllgchoqfk.R.inc(5119);throw new InternalError("Clone error");
        }
    }finally{__CLR4_4_13tl3tllgchoqfk.R.flushNeeded();}}

}
