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

import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.MutableInterval;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * AbstractInterval provides the common behaviour for time intervals.
 * <p>
 * This class should generally not be used directly by API users. The
 * {@link ReadableInterval} interface should be used when different
 * kinds of intervals are to be referenced.
 * <p>
 * AbstractInterval subclasses may be mutable and not thread-safe.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.0
 */
public abstract class AbstractInterval implements ReadableInterval {public static class __CLR4_4_15rs5rslgchoql9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,7604,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constructor.
     */
    protected AbstractInterval() {
        super();__CLR4_4_15rs5rslgchoql9.R.inc(7481);try{__CLR4_4_15rs5rslgchoql9.R.inc(7480);
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Validates an interval.
     *
     * @param start the start instant in milliseconds
     * @param end   the end instant in milliseconds
     * @throws IllegalArgumentException if the interval is invalid
     */
    protected void checkInterval(long start, long end) {try{__CLR4_4_15rs5rslgchoql9.R.inc(7482);
        __CLR4_4_15rs5rslgchoql9.R.inc(7483);if ((((end < start)&&(__CLR4_4_15rs5rslgchoql9.R.iget(7484)!=0|true))||(__CLR4_4_15rs5rslgchoql9.R.iget(7485)==0&false))) {{
            __CLR4_4_15rs5rslgchoql9.R.inc(7486);throw new IllegalArgumentException("The end instant must be greater than the start instant");
        }
    }}finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the start of this time interval, which is inclusive, as a DateTime.
     *
     * @return the start of the time interval
     */
    public DateTime getStart() {try{__CLR4_4_15rs5rslgchoql9.R.inc(7487);
        __CLR4_4_15rs5rslgchoql9.R.inc(7488);return new DateTime(getStartMillis(), getChronology());
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    /**
     * Gets the end of this time interval, which is exclusive, as a DateTime.
     *
     * @return the end of the time interval
     */
    public DateTime getEnd() {try{__CLR4_4_15rs5rslgchoql9.R.inc(7489);
        __CLR4_4_15rs5rslgchoql9.R.inc(7490);return new DateTime(getEndMillis(), getChronology());
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Does this time interval contain the specified millisecond instant.
     * <p>
     * Non-zero duration intervals are inclusive of the start instant and
     * exclusive of the end. A zero duration interval cannot contain anything.
     *
     * @param millisInstant the instant to compare to,
     *                      millisecond instant from 1970-01-01T00:00:00Z
     * @return true if this time interval contains the millisecond
     */
    public boolean contains(long millisInstant) {try{__CLR4_4_15rs5rslgchoql9.R.inc(7491);
        __CLR4_4_15rs5rslgchoql9.R.inc(7492);long thisStart = getStartMillis();
        __CLR4_4_15rs5rslgchoql9.R.inc(7493);long thisEnd = getEndMillis();
        __CLR4_4_15rs5rslgchoql9.R.inc(7494);return (millisInstant >= thisStart && millisInstant < thisEnd);
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    /**
     * Does this time interval contain the current instant.
     * <p>
     * Non-zero duration intervals are inclusive of the start instant and
     * exclusive of the end. A zero duration interval cannot contain anything.
     *
     * @return true if this time interval contains the current instant
     */
    public boolean containsNow() {try{__CLR4_4_15rs5rslgchoql9.R.inc(7495);
        __CLR4_4_15rs5rslgchoql9.R.inc(7496);return contains(DateTimeUtils.currentTimeMillis());
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    /**
     * Does this time interval contain the specified instant.
     * <p>
     * Non-zero duration intervals are inclusive of the start instant and
     * exclusive of the end. A zero duration interval cannot contain anything.
     * <p>
     * For example:
     * <pre>
     * [09:00 to 10:00) contains 08:59  = false (before start)
     * [09:00 to 10:00) contains 09:00  = true
     * [09:00 to 10:00) contains 09:59  = true
     * [09:00 to 10:00) contains 10:00  = false (equals end)
     * [09:00 to 10:00) contains 10:01  = false (after end)
     *
     * [14:00 to 14:00) contains 14:00  = false (zero duration contains nothing)
     * </pre>
     * Passing in a <code>null</code> parameter will have the same effect as
     * calling {@link #containsNow()}.
     *
     * @param instant the instant, null means now
     * @return true if this time interval contains the instant
     */
    public boolean contains(ReadableInstant instant) {try{__CLR4_4_15rs5rslgchoql9.R.inc(7497);
        __CLR4_4_15rs5rslgchoql9.R.inc(7498);if ((((instant == null)&&(__CLR4_4_15rs5rslgchoql9.R.iget(7499)!=0|true))||(__CLR4_4_15rs5rslgchoql9.R.iget(7500)==0&false))) {{
            __CLR4_4_15rs5rslgchoql9.R.inc(7501);return containsNow();
        }
        }__CLR4_4_15rs5rslgchoql9.R.inc(7502);return contains(instant.getMillis());
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    /**
     * Does this time interval contain the specified time interval.
     * <p>
     * Non-zero duration intervals are inclusive of the start instant and
     * exclusive of the end. The other interval is contained if this interval
     * wholly contains, starts, finishes or equals it.
     * A zero duration interval cannot contain anything.
     * <p>
     * When two intervals are compared the result is one of three states:
     * (a) they abut, (b) there is a gap between them, (c) they overlap.
     * The <code>contains</code> method is not related to these states.
     * In particular, a zero duration interval is contained at the start of
     * a larger interval, but does not overlap (it abuts instead).
     * <p>
     * For example:
     * <pre>
     * [09:00 to 10:00) contains [09:00 to 10:00)  = true
     * [09:00 to 10:00) contains [09:00 to 09:30)  = true
     * [09:00 to 10:00) contains [09:30 to 10:00)  = true
     * [09:00 to 10:00) contains [09:15 to 09:45)  = true
     * [09:00 to 10:00) contains [09:00 to 09:00)  = true
     *
     * [09:00 to 10:00) contains [08:59 to 10:00)  = false (otherStart before thisStart)
     * [09:00 to 10:00) contains [09:00 to 10:01)  = false (otherEnd after thisEnd)
     * [09:00 to 10:00) contains [10:00 to 10:00)  = false (otherStart equals thisEnd)
     *
     * [14:00 to 14:00) contains [14:00 to 14:00)  = false (zero duration contains nothing)
     * </pre>
     * Passing in a <code>null</code> parameter will have the same effect as
     * calling {@link #containsNow()}.
     *
     * @param interval the time interval to compare to, null means a zero duration interval now
     * @return true if this time interval contains the time interval
     */
    public boolean contains(ReadableInterval interval) {try{__CLR4_4_15rs5rslgchoql9.R.inc(7503);
        __CLR4_4_15rs5rslgchoql9.R.inc(7504);if ((((interval == null)&&(__CLR4_4_15rs5rslgchoql9.R.iget(7505)!=0|true))||(__CLR4_4_15rs5rslgchoql9.R.iget(7506)==0&false))) {{
            __CLR4_4_15rs5rslgchoql9.R.inc(7507);return containsNow();
        }
        }__CLR4_4_15rs5rslgchoql9.R.inc(7508);long otherStart = interval.getStartMillis();
        __CLR4_4_15rs5rslgchoql9.R.inc(7509);long otherEnd = interval.getEndMillis();
        __CLR4_4_15rs5rslgchoql9.R.inc(7510);long thisStart = getStartMillis();
        __CLR4_4_15rs5rslgchoql9.R.inc(7511);long thisEnd = getEndMillis();
        __CLR4_4_15rs5rslgchoql9.R.inc(7512);return (thisStart <= otherStart && otherStart < thisEnd && otherEnd <= thisEnd);
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    /**
     * Does this time interval overlap the specified time interval.
     * <p>
     * Intervals are inclusive of the start instant and exclusive of the end.
     * An interval overlaps another if it shares some common part of the
     * datetime continuum.
     * <p>
     * When two intervals are compared the result is one of three states:
     * (a) they abut, (b) there is a gap between them, (c) they overlap.
     * The abuts state takes precedence over the other two, thus a zero duration
     * interval at the start of a larger interval abuts and does not overlap.
     * <p>
     * For example:
     * <pre>
     * [09:00 to 10:00) overlaps [08:00 to 08:30)  = false (completely before)
     * [09:00 to 10:00) overlaps [08:00 to 09:00)  = false (abuts before)
     * [09:00 to 10:00) overlaps [08:00 to 09:30)  = true
     * [09:00 to 10:00) overlaps [08:00 to 10:00)  = true
     * [09:00 to 10:00) overlaps [08:00 to 11:00)  = true
     *
     * [09:00 to 10:00) overlaps [09:00 to 09:00)  = false (abuts before)
     * [09:00 to 10:00) overlaps [09:00 to 09:30)  = true
     * [09:00 to 10:00) overlaps [09:00 to 10:00)  = true
     * [09:00 to 10:00) overlaps [09:00 to 11:00)  = true
     *
     * [09:00 to 10:00) overlaps [09:30 to 09:30)  = true
     * [09:00 to 10:00) overlaps [09:30 to 10:00)  = true
     * [09:00 to 10:00) overlaps [09:30 to 11:00)  = true
     *
     * [09:00 to 10:00) overlaps [10:00 to 10:00)  = false (abuts after)
     * [09:00 to 10:00) overlaps [10:00 to 11:00)  = false (abuts after)
     *
     * [09:00 to 10:00) overlaps [10:30 to 11:00)  = false (completely after)
     *
     * [14:00 to 14:00) overlaps [14:00 to 14:00)  = false (abuts before and after)
     * [14:00 to 14:00) overlaps [13:00 to 15:00)  = true
     * </pre>
     *
     * @param interval the time interval to compare to, null means a zero length interval now
     * @return true if the time intervals overlap
     */
    public boolean overlaps(ReadableInterval interval) {try{__CLR4_4_15rs5rslgchoql9.R.inc(7513);
        __CLR4_4_15rs5rslgchoql9.R.inc(7514);long thisStart = getStartMillis();
        __CLR4_4_15rs5rslgchoql9.R.inc(7515);long thisEnd = getEndMillis();
        __CLR4_4_15rs5rslgchoql9.R.inc(7516);if ((((interval == null)&&(__CLR4_4_15rs5rslgchoql9.R.iget(7517)!=0|true))||(__CLR4_4_15rs5rslgchoql9.R.iget(7518)==0&false))) {{
            __CLR4_4_15rs5rslgchoql9.R.inc(7519);long now = DateTimeUtils.currentTimeMillis();
            __CLR4_4_15rs5rslgchoql9.R.inc(7520);return (thisStart < now && now < thisEnd);
        } }else {{
            __CLR4_4_15rs5rslgchoql9.R.inc(7521);long otherStart = interval.getStartMillis();
            __CLR4_4_15rs5rslgchoql9.R.inc(7522);long otherEnd = interval.getEndMillis();
            __CLR4_4_15rs5rslgchoql9.R.inc(7523);return (thisStart < otherEnd && otherStart < thisEnd);
        }
    }}finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Is this interval equal to the specified interval ignoring the chronology.
     * <p>
     * This compares the underlying instants, ignoring the chronology.
     *
     * @param other a readable interval to check against
     * @return true if the intervals are equal comparing the start and end millis
     * @since 2.3
     */
    public boolean isEqual(ReadableInterval other) {try{__CLR4_4_15rs5rslgchoql9.R.inc(7524);
        __CLR4_4_15rs5rslgchoql9.R.inc(7525);return getStartMillis() == other.getStartMillis() &&
                getEndMillis() == other.getEndMillis();
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    /**
     * Is this time interval before the specified millisecond instant.
     * <p>
     * Intervals are inclusive of the start instant and exclusive of the end.
     *
     * @param millisInstant the instant to compare to,
     *                      millisecond instant from 1970-01-01T00:00:00Z
     * @return true if this time interval is before the instant
     */
    public boolean isBefore(long millisInstant) {try{__CLR4_4_15rs5rslgchoql9.R.inc(7526);
        __CLR4_4_15rs5rslgchoql9.R.inc(7527);return (getEndMillis() <= millisInstant);
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    /**
     * Is this time interval before the current instant.
     * <p>
     * Intervals are inclusive of the start instant and exclusive of the end.
     *
     * @return true if this time interval is before the current instant
     */
    public boolean isBeforeNow() {try{__CLR4_4_15rs5rslgchoql9.R.inc(7528);
        __CLR4_4_15rs5rslgchoql9.R.inc(7529);return isBefore(DateTimeUtils.currentTimeMillis());
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    /**
     * Is this time interval before the specified instant.
     * <p>
     * Intervals are inclusive of the start instant and exclusive of the end.
     *
     * @param instant the instant to compare to, null means now
     * @return true if this time interval is before the instant
     */
    public boolean isBefore(ReadableInstant instant) {try{__CLR4_4_15rs5rslgchoql9.R.inc(7530);
        __CLR4_4_15rs5rslgchoql9.R.inc(7531);if ((((instant == null)&&(__CLR4_4_15rs5rslgchoql9.R.iget(7532)!=0|true))||(__CLR4_4_15rs5rslgchoql9.R.iget(7533)==0&false))) {{
            __CLR4_4_15rs5rslgchoql9.R.inc(7534);return isBeforeNow();
        }
        }__CLR4_4_15rs5rslgchoql9.R.inc(7535);return isBefore(instant.getMillis());
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    /**
     * Is this time interval entirely before the specified instant.
     * <p>
     * Intervals are inclusive of the start instant and exclusive of the end.
     *
     * @param interval the interval to compare to, null means now
     * @return true if this time interval is before the interval specified
     */
    public boolean isBefore(ReadableInterval interval) {try{__CLR4_4_15rs5rslgchoql9.R.inc(7536);
        __CLR4_4_15rs5rslgchoql9.R.inc(7537);if ((((interval == null)&&(__CLR4_4_15rs5rslgchoql9.R.iget(7538)!=0|true))||(__CLR4_4_15rs5rslgchoql9.R.iget(7539)==0&false))) {{
            __CLR4_4_15rs5rslgchoql9.R.inc(7540);return isBeforeNow();
        }
        }__CLR4_4_15rs5rslgchoql9.R.inc(7541);return isBefore(interval.getStartMillis());
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Is this time interval after the specified millisecond instant.
     * <p>
     * Intervals are inclusive of the start instant and exclusive of the end.
     *
     * @param millisInstant the instant to compare to,
     *                      millisecond instant from 1970-01-01T00:00:00Z
     * @return true if this time interval is after the instant
     */
    public boolean isAfter(long millisInstant) {try{__CLR4_4_15rs5rslgchoql9.R.inc(7542);
        __CLR4_4_15rs5rslgchoql9.R.inc(7543);return (getStartMillis() > millisInstant);
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    /**
     * Is this time interval after the current instant.
     * <p>
     * Intervals are inclusive of the start instant and exclusive of the end.
     *
     * @return true if this time interval is after the current instant
     */
    public boolean isAfterNow() {try{__CLR4_4_15rs5rslgchoql9.R.inc(7544);
        __CLR4_4_15rs5rslgchoql9.R.inc(7545);return isAfter(DateTimeUtils.currentTimeMillis());
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    /**
     * Is this time interval after the specified instant.
     * <p>
     * Intervals are inclusive of the start instant and exclusive of the end.
     *
     * @param instant the instant to compare to, null means now
     * @return true if this time interval is after the instant
     */
    public boolean isAfter(ReadableInstant instant) {try{__CLR4_4_15rs5rslgchoql9.R.inc(7546);
        __CLR4_4_15rs5rslgchoql9.R.inc(7547);if ((((instant == null)&&(__CLR4_4_15rs5rslgchoql9.R.iget(7548)!=0|true))||(__CLR4_4_15rs5rslgchoql9.R.iget(7549)==0&false))) {{
            __CLR4_4_15rs5rslgchoql9.R.inc(7550);return isAfterNow();
        }
        }__CLR4_4_15rs5rslgchoql9.R.inc(7551);return isAfter(instant.getMillis());
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    /**
     * Is this time interval entirely after the specified interval.
     * <p>
     * Intervals are inclusive of the start instant and exclusive of the end.
     * Only the end time of the specified interval is used in the comparison.
     *
     * @param interval the interval to compare to, null means now
     * @return true if this time interval is after the interval specified
     */
    public boolean isAfter(ReadableInterval interval) {try{__CLR4_4_15rs5rslgchoql9.R.inc(7552);
        __CLR4_4_15rs5rslgchoql9.R.inc(7553);long endMillis;
        __CLR4_4_15rs5rslgchoql9.R.inc(7554);if ((((interval == null)&&(__CLR4_4_15rs5rslgchoql9.R.iget(7555)!=0|true))||(__CLR4_4_15rs5rslgchoql9.R.iget(7556)==0&false))) {{
            __CLR4_4_15rs5rslgchoql9.R.inc(7557);endMillis = DateTimeUtils.currentTimeMillis();
        } }else {{
            __CLR4_4_15rs5rslgchoql9.R.inc(7558);endMillis = interval.getEndMillis();
        }
        }__CLR4_4_15rs5rslgchoql9.R.inc(7559);return (getStartMillis() >= endMillis);
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get this interval as an immutable <code>Interval</code> object.
     *
     * @return the interval as an Interval object
     */
    public Interval toInterval() {try{__CLR4_4_15rs5rslgchoql9.R.inc(7560);
        __CLR4_4_15rs5rslgchoql9.R.inc(7561);return new Interval(getStartMillis(), getEndMillis(), getChronology());
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    /**
     * Get this time interval as a <code>MutableInterval</code>.
     * <p>
     * This will always return a new <code>MutableInterval</code> with the same interval.
     *
     * @return the time interval as a MutableInterval object
     */
    public MutableInterval toMutableInterval() {try{__CLR4_4_15rs5rslgchoql9.R.inc(7562);
        __CLR4_4_15rs5rslgchoql9.R.inc(7563);return new MutableInterval(getStartMillis(), getEndMillis(), getChronology());
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the duration of this time interval in milliseconds.
     * <p>
     * The duration is equal to the end millis minus the start millis.
     *
     * @return the duration of the time interval in milliseconds
     * @throws ArithmeticException if the duration exceeds the capacity of a long
     */
    public long toDurationMillis() {try{__CLR4_4_15rs5rslgchoql9.R.inc(7564);
        __CLR4_4_15rs5rslgchoql9.R.inc(7565);return FieldUtils.safeSubtract(getEndMillis(), getStartMillis());
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    /**
     * Gets the duration of this time interval.
     * <p>
     * The duration is equal to the end millis minus the start millis.
     *
     * @return the duration of the time interval
     * @throws ArithmeticException if the duration exceeds the capacity of a long
     */
    public Duration toDuration() {try{__CLR4_4_15rs5rslgchoql9.R.inc(7566);
        __CLR4_4_15rs5rslgchoql9.R.inc(7567);long durMillis = toDurationMillis();
        __CLR4_4_15rs5rslgchoql9.R.inc(7568);if ((((durMillis == 0)&&(__CLR4_4_15rs5rslgchoql9.R.iget(7569)!=0|true))||(__CLR4_4_15rs5rslgchoql9.R.iget(7570)==0&false))) {{
            __CLR4_4_15rs5rslgchoql9.R.inc(7571);return Duration.ZERO;
        } }else {{
            __CLR4_4_15rs5rslgchoql9.R.inc(7572);return new Duration(durMillis);
        }
    }}finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts the duration of the interval to a <code>Period</code> using the
     * All period type.
     * <p>
     * This method should be used to extract the field values describing the
     * difference between the start and end instants.
     *
     * @return a time period derived from the interval
     */
    public Period toPeriod() {try{__CLR4_4_15rs5rslgchoql9.R.inc(7573);
        __CLR4_4_15rs5rslgchoql9.R.inc(7574);return new Period(getStartMillis(), getEndMillis(), getChronology());
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    /**
     * Converts the duration of the interval to a <code>Period</code> using the
     * specified period type.
     * <p>
     * This method should be used to extract the field values describing the
     * difference between the start and end instants.
     *
     * @param type the requested type of the duration, null means AllType
     * @return a time period derived from the interval
     */
    public Period toPeriod(PeriodType type) {try{__CLR4_4_15rs5rslgchoql9.R.inc(7575);
        __CLR4_4_15rs5rslgchoql9.R.inc(7576);return new Period(getStartMillis(), getEndMillis(), type, getChronology());
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Compares this object with the specified object for equality based
     * on start and end millis plus the chronology.
     * All ReadableInterval instances are accepted.
     * <p>
     * To compare the duration of two time intervals, use {@link #toDuration()}
     * to get the durations and compare those.
     *
     * @param readableInterval a readable interval to check against
     * @return true if the intervals are equal comparing the start millis,
     * end millis and chronology
     */
    public boolean equals(Object readableInterval) {try{__CLR4_4_15rs5rslgchoql9.R.inc(7577);
        __CLR4_4_15rs5rslgchoql9.R.inc(7578);if ((((this == readableInterval)&&(__CLR4_4_15rs5rslgchoql9.R.iget(7579)!=0|true))||(__CLR4_4_15rs5rslgchoql9.R.iget(7580)==0&false))) {{
            __CLR4_4_15rs5rslgchoql9.R.inc(7581);return true;
        }
        }__CLR4_4_15rs5rslgchoql9.R.inc(7582);if ((((readableInterval instanceof ReadableInterval == false)&&(__CLR4_4_15rs5rslgchoql9.R.iget(7583)!=0|true))||(__CLR4_4_15rs5rslgchoql9.R.iget(7584)==0&false))) {{
            __CLR4_4_15rs5rslgchoql9.R.inc(7585);return false;
        }
        }__CLR4_4_15rs5rslgchoql9.R.inc(7586);ReadableInterval other = (ReadableInterval) readableInterval;
        __CLR4_4_15rs5rslgchoql9.R.inc(7587);return
                getStartMillis() == other.getStartMillis() &&
                        getEndMillis() == other.getEndMillis() &&
                        FieldUtils.equals(getChronology(), other.getChronology());
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    /**
     * Hashcode compatible with equals method.
     *
     * @return suitable hashcode
     */
    public int hashCode() {try{__CLR4_4_15rs5rslgchoql9.R.inc(7588);
        __CLR4_4_15rs5rslgchoql9.R.inc(7589);long start = getStartMillis();
        __CLR4_4_15rs5rslgchoql9.R.inc(7590);long end = getEndMillis();
        __CLR4_4_15rs5rslgchoql9.R.inc(7591);int result = 97;
        __CLR4_4_15rs5rslgchoql9.R.inc(7592);result = 31 * result + ((int) (start ^ (start >>> 32)));
        __CLR4_4_15rs5rslgchoql9.R.inc(7593);result = 31 * result + ((int) (end ^ (end >>> 32)));
        __CLR4_4_15rs5rslgchoql9.R.inc(7594);result = 31 * result + getChronology().hashCode();
        __CLR4_4_15rs5rslgchoql9.R.inc(7595);return result;
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

    /**
     * Output a string in ISO8601 interval format.
     * <p>
     * From version 2.1, the string includes the time zone offset.
     *
     * @return re-parsable string (in the default zone)
     */
    public String toString() {try{__CLR4_4_15rs5rslgchoql9.R.inc(7596);
        __CLR4_4_15rs5rslgchoql9.R.inc(7597);DateTimeFormatter printer = ISODateTimeFormat.dateTime();
        __CLR4_4_15rs5rslgchoql9.R.inc(7598);printer = printer.withChronology(getChronology());
        __CLR4_4_15rs5rslgchoql9.R.inc(7599);StringBuffer buf = new StringBuffer(48);
        __CLR4_4_15rs5rslgchoql9.R.inc(7600);printer.printTo(buf, getStartMillis());
        __CLR4_4_15rs5rslgchoql9.R.inc(7601);buf.append('/');
        __CLR4_4_15rs5rslgchoql9.R.inc(7602);printer.printTo(buf, getEndMillis());
        __CLR4_4_15rs5rslgchoql9.R.inc(7603);return buf.toString();
    }finally{__CLR4_4_15rs5rslgchoql9.R.flushNeeded();}}

}
