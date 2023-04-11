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
package org.joda.time.base;

import java.io.Serializable;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.Interval;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.DurationConverter;
import org.joda.time.field.FieldUtils;

/**
 * BaseDuration is an abstract implementation of ReadableDuration that stores
 * data in a <code>long</code> duration milliseconds field.
 * <p>
 * This class should generally not be used directly by API users.
 * The {@link ReadableDuration} interface should be used when different
 * kinds of duration objects are to be referenced.
 * <p>
 * BaseDuration subclasses may be mutable and not thread-safe.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.0
 */
public abstract class BaseDuration
        extends AbstractDuration
        implements ReadableDuration, Serializable {public static class __CLR4_4_162z62zlgchoqlw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,7924,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization version
     */
    private static final long serialVersionUID = 2581698638990L;

    /**
     * The duration length
     */
    private volatile long iMillis;

    /**
     * Creates a duration from the given millisecond duration.
     *
     * @param duration the duration, in milliseconds
     */
    protected BaseDuration(long duration) {
        super();__CLR4_4_162z62zlgchoqlw.R.inc(7884);try{__CLR4_4_162z62zlgchoqlw.R.inc(7883);
        __CLR4_4_162z62zlgchoqlw.R.inc(7885);iMillis = duration;
    }finally{__CLR4_4_162z62zlgchoqlw.R.flushNeeded();}}

    /**
     * Creates a duration from the given interval endpoints.
     *
     * @param startInstant interval start, in milliseconds
     * @param endInstant   interval end, in milliseconds
     * @throws ArithmeticException if the duration exceeds a 64-bit long
     */
    protected BaseDuration(long startInstant, long endInstant) {
        super();__CLR4_4_162z62zlgchoqlw.R.inc(7887);try{__CLR4_4_162z62zlgchoqlw.R.inc(7886);
        __CLR4_4_162z62zlgchoqlw.R.inc(7888);iMillis = FieldUtils.safeSubtract(endInstant, startInstant);
    }finally{__CLR4_4_162z62zlgchoqlw.R.flushNeeded();}}

    /**
     * Creates a duration from the given interval endpoints.
     *
     * @param start interval start, null means now
     * @param end   interval end, null means now
     * @throws ArithmeticException if the duration exceeds a 64-bit long
     */
    protected BaseDuration(ReadableInstant start, ReadableInstant end) {
        super();__CLR4_4_162z62zlgchoqlw.R.inc(7890);try{__CLR4_4_162z62zlgchoqlw.R.inc(7889);
        __CLR4_4_162z62zlgchoqlw.R.inc(7891);if ((((start == end)&&(__CLR4_4_162z62zlgchoqlw.R.iget(7892)!=0|true))||(__CLR4_4_162z62zlgchoqlw.R.iget(7893)==0&false))) {{
            __CLR4_4_162z62zlgchoqlw.R.inc(7894);iMillis = 0L;
        } }else {{
            __CLR4_4_162z62zlgchoqlw.R.inc(7895);long startMillis = DateTimeUtils.getInstantMillis(start);
            __CLR4_4_162z62zlgchoqlw.R.inc(7896);long endMillis = DateTimeUtils.getInstantMillis(end);
            __CLR4_4_162z62zlgchoqlw.R.inc(7897);iMillis = FieldUtils.safeSubtract(endMillis, startMillis);
        }
    }}finally{__CLR4_4_162z62zlgchoqlw.R.flushNeeded();}}

    /**
     * Creates a duration from the specified object using the
     * {@link org.joda.time.convert.ConverterManager ConverterManager}.
     *
     * @param duration duration to convert
     * @throws IllegalArgumentException if duration is invalid
     */
    protected BaseDuration(Object duration) {
        super();__CLR4_4_162z62zlgchoqlw.R.inc(7899);try{__CLR4_4_162z62zlgchoqlw.R.inc(7898);
        __CLR4_4_162z62zlgchoqlw.R.inc(7900);DurationConverter converter = ConverterManager.getInstance().getDurationConverter(duration);
        __CLR4_4_162z62zlgchoqlw.R.inc(7901);iMillis = converter.getDurationMillis(duration);
    }finally{__CLR4_4_162z62zlgchoqlw.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the length of this duration in milliseconds.
     *
     * @return the length of the duration in milliseconds.
     */
    public long getMillis() {try{__CLR4_4_162z62zlgchoqlw.R.inc(7902);
        __CLR4_4_162z62zlgchoqlw.R.inc(7903);return iMillis;
    }finally{__CLR4_4_162z62zlgchoqlw.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Sets the length of this duration in milliseconds.
     *
     * @param duration the new length of the duration
     */
    protected void setMillis(long duration) {try{__CLR4_4_162z62zlgchoqlw.R.inc(7904);
        __CLR4_4_162z62zlgchoqlw.R.inc(7905);iMillis = duration;
    }finally{__CLR4_4_162z62zlgchoqlw.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this duration to a Period instance using the specified period type
     * and the ISO chronology.
     * <p>
     * Only precise fields in the period type will be used.
     * At most these are hours, minutes, seconds and millis - the period
     * type may restrict the selection further.
     * <p>
     * For more control over the conversion process, you must pair the duration with
     * an instant, see {@link #toPeriodFrom(ReadableInstant, PeriodType)}.
     *
     * @param type the period type to use, null means standard
     * @return a Period created using the millisecond duration from this instance
     */
    public Period toPeriod(PeriodType type) {try{__CLR4_4_162z62zlgchoqlw.R.inc(7906);
        __CLR4_4_162z62zlgchoqlw.R.inc(7907);return new Period(getMillis(), type);
    }finally{__CLR4_4_162z62zlgchoqlw.R.flushNeeded();}}

    /**
     * Converts this duration to a Period instance using the standard period type
     * and the specified chronology.
     * <p>
     * Only precise fields in the period type will be used.
     * Exactly which fields are precise depends on the chronology.
     * Only the time fields are precise for ISO chronology with a time zone.
     * However, ISO UTC also has precise days and weeks.
     * <p>
     * For more control over the conversion process, you must pair the duration with
     * an instant, see {@link #toPeriodFrom(ReadableInstant)} and
     * {@link #toPeriodTo(ReadableInstant)}
     *
     * @param chrono the chronology to use, null means ISO default
     * @return a Period created using the millisecond duration from this instance
     */
    public Period toPeriod(Chronology chrono) {try{__CLR4_4_162z62zlgchoqlw.R.inc(7908);
        __CLR4_4_162z62zlgchoqlw.R.inc(7909);return new Period(getMillis(), chrono);
    }finally{__CLR4_4_162z62zlgchoqlw.R.flushNeeded();}}

    /**
     * Converts this duration to a Period instance using the specified period type
     * and chronology.
     * <p>
     * Only precise fields in the period type will be used.
     * Exactly which fields are precise depends on the chronology.
     * Only the time fields are precise for ISO chronology with a time zone.
     * However, ISO UTC also has precise days and weeks.
     * <p>
     * For more control over the conversion process, you must pair the duration with
     * an instant, see {@link #toPeriodFrom(ReadableInstant, PeriodType)} and
     * {@link #toPeriodTo(ReadableInstant, PeriodType)}
     *
     * @param type   the period type to use, null means standard
     * @param chrono the chronology to use, null means ISO default
     * @return a Period created using the millisecond duration from this instance
     */
    public Period toPeriod(PeriodType type, Chronology chrono) {try{__CLR4_4_162z62zlgchoqlw.R.inc(7910);
        __CLR4_4_162z62zlgchoqlw.R.inc(7911);return new Period(getMillis(), type, chrono);
    }finally{__CLR4_4_162z62zlgchoqlw.R.flushNeeded();}}

    /**
     * Converts this duration to a Period instance by adding the duration to a start
     * instant to obtain an interval using the standard period type.
     * <p>
     * This conversion will determine the fields of a period accurately.
     * The results are based on the instant millis, the chronology of the instant,
     * the standard period type and the length of this duration.
     *
     * @param startInstant the instant to calculate the period from, null means now
     * @return a Period created using the millisecond duration from this instance
     */
    public Period toPeriodFrom(ReadableInstant startInstant) {try{__CLR4_4_162z62zlgchoqlw.R.inc(7912);
        __CLR4_4_162z62zlgchoqlw.R.inc(7913);return new Period(startInstant, this);
    }finally{__CLR4_4_162z62zlgchoqlw.R.flushNeeded();}}

    /**
     * Converts this duration to a Period instance by adding the duration to a start
     * instant to obtain an interval.
     * <p>
     * This conversion will determine the fields of a period accurately.
     * The results are based on the instant millis, the chronology of the instant,
     * the period type and the length of this duration.
     *
     * @param startInstant the instant to calculate the period from, null means now
     * @param type         the period type determining how to split the duration into fields, null means All type
     * @return a Period created using the millisecond duration from this instance
     */
    public Period toPeriodFrom(ReadableInstant startInstant, PeriodType type) {try{__CLR4_4_162z62zlgchoqlw.R.inc(7914);
        __CLR4_4_162z62zlgchoqlw.R.inc(7915);return new Period(startInstant, this, type);
    }finally{__CLR4_4_162z62zlgchoqlw.R.flushNeeded();}}

    /**
     * Converts this duration to a Period instance by subtracting the duration
     * from an end instant to obtain an interval using the standard period
     * type.
     * <p>
     * This conversion will determine the fields of a period accurately.
     * The results are based on the instant millis, the chronology of the instant,
     * the standard period type and the length of this duration.
     *
     * @param endInstant the instant to calculate the period to, null means now
     * @return a Period created using the millisecond duration from this instance
     */
    public Period toPeriodTo(ReadableInstant endInstant) {try{__CLR4_4_162z62zlgchoqlw.R.inc(7916);
        __CLR4_4_162z62zlgchoqlw.R.inc(7917);return new Period(this, endInstant);
    }finally{__CLR4_4_162z62zlgchoqlw.R.flushNeeded();}}

    /**
     * Converts this duration to a Period instance by subtracting the duration
     * from an end instant to obtain an interval using the standard period
     * type.
     * <p>
     * This conversion will determine the fields of a period accurately.
     * The results are based on the instant millis, the chronology of the instant,
     * the period type and the length of this duration.
     *
     * @param endInstant the instant to calculate the period to, null means now
     * @param type       the period type determining how to split the duration into fields, null means All type
     * @return a Period created using the millisecond duration from this instance
     */
    public Period toPeriodTo(ReadableInstant endInstant, PeriodType type) {try{__CLR4_4_162z62zlgchoqlw.R.inc(7918);
        __CLR4_4_162z62zlgchoqlw.R.inc(7919);return new Period(this, endInstant, type);
    }finally{__CLR4_4_162z62zlgchoqlw.R.flushNeeded();}}

    /**
     * Converts this duration to an Interval starting at the specified instant.
     *
     * @param startInstant the instant to start the interval at, null means now
     * @return an Interval starting at the specified instant
     */
    public Interval toIntervalFrom(ReadableInstant startInstant) {try{__CLR4_4_162z62zlgchoqlw.R.inc(7920);
        __CLR4_4_162z62zlgchoqlw.R.inc(7921);return new Interval(startInstant, this);
    }finally{__CLR4_4_162z62zlgchoqlw.R.flushNeeded();}}

    /**
     * Converts this duration to an Interval ending at the specified instant.
     *
     * @param endInstant the instant to end the interval at, null means now
     * @return an Interval ending at the specified instant
     */
    public Interval toIntervalTo(ReadableInstant endInstant) {try{__CLR4_4_162z62zlgchoqlw.R.inc(7922);
        __CLR4_4_162z62zlgchoqlw.R.inc(7923);return new Interval(this, endInstant);
    }finally{__CLR4_4_162z62zlgchoqlw.R.flushNeeded();}}

}
