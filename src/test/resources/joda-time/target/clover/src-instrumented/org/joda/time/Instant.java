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
import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.InstantConverter;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * Instant is the standard implementation of a fully immutable instant in time.
 * <p>
 * <code>Instant</code> is an implementation of {@link ReadableInstant}.
 * As with all instants, it represents an exact point on the time-line,
 * but limited to the precision of milliseconds. An <code>Instant</code>
 * should be used to represent a point in time irrespective of any other
 * factor, such as chronology or time zone.
 * <p>
 * Internally, the class holds one piece of data, the instant as milliseconds
 * from the Java epoch of 1970-01-01T00:00:00Z.
 * <p>
 * For example, an Instant can be used to compare two <code>DateTime</code>
 * objects irrespective of chronology or time zone.
 * <pre>
 * boolean sameInstant = dt1.toInstant().equals(dt2.toInstant());
 * </pre>
 * Note that the following code will also perform the same check:
 * <pre>
 * boolean sameInstant = dt1.isEqual(dt2);
 * </pre>
 * <p>
 * Instant is thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @since 1.0
 */
public final class Instant
        extends AbstractInstant
        implements ReadableInstant, Serializable {public static class __CLR4_4_11u71u7lgchoq97{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,2442,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The Java epoch of 1970-01-01T00:00:00Z.
     *
     * @since 2.10
     */
    public static final Instant EPOCH = new Instant(0L);

    /**
     * Serialization lock
     */
    private static final long serialVersionUID = 3299096530934209741L;

    /**
     * The millis from 1970-01-01T00:00:00Z
     */
    private final long iMillis;

    //-----------------------------------------------------------------------

    /**
     * Obtains an {@code Instant} set to the current system millisecond time.
     *
     * @return the current instant, not null
     * @since 2.0
     */
    public static Instant now() {try{__CLR4_4_11u71u7lgchoq97.R.inc(2383);
        __CLR4_4_11u71u7lgchoq97.R.inc(2384);return new Instant();
    }finally{__CLR4_4_11u71u7lgchoq97.R.flushNeeded();}}

    /**
     * Obtains an {@code Instant} set to the milliseconds from 1970-01-01T00:00:00Z.
     *
     * @param epochMilli the milliseconds from 1970-01-01T00:00:00Z
     * @since 2.10
     */
    public static Instant ofEpochMilli(long epochMilli) {try{__CLR4_4_11u71u7lgchoq97.R.inc(2385);
        __CLR4_4_11u71u7lgchoq97.R.inc(2386);return new Instant(epochMilli);
    }finally{__CLR4_4_11u71u7lgchoq97.R.flushNeeded();}}

    /**
     * Obtains an {@code Instant} set to the seconds from 1970-01-01T00:00:00Z.
     *
     * @param epochSecond the seconds from 1970-01-01T00:00:00Z
     * @throws ArithmeticException if the new instant exceeds the capacity of a long
     * @since 2.10
     */
    public static Instant ofEpochSecond(long epochSecond) {try{__CLR4_4_11u71u7lgchoq97.R.inc(2387);
        __CLR4_4_11u71u7lgchoq97.R.inc(2388);return new Instant(FieldUtils.safeMultiply(epochSecond, 1000));
    }finally{__CLR4_4_11u71u7lgchoq97.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Parses an {@code Instant} from the specified string.
     * <p>
     * This uses {@link ISODateTimeFormat#dateTimeParser()}.
     *
     * @param str the string to parse, not null
     * @since 2.0
     */
    @FromString
    public static Instant parse(String str) {try{__CLR4_4_11u71u7lgchoq97.R.inc(2389);
        __CLR4_4_11u71u7lgchoq97.R.inc(2390);return parse(str, ISODateTimeFormat.dateTimeParser());
    }finally{__CLR4_4_11u71u7lgchoq97.R.flushNeeded();}}

    /**
     * Parses an {@code Instant} from the specified string using a formatter.
     *
     * @param str       the string to parse, not null
     * @param formatter the formatter to use, not null
     * @since 2.0
     */
    public static Instant parse(String str, DateTimeFormatter formatter) {try{__CLR4_4_11u71u7lgchoq97.R.inc(2391);
        __CLR4_4_11u71u7lgchoq97.R.inc(2392);return formatter.parseDateTime(str).toInstant();
    }finally{__CLR4_4_11u71u7lgchoq97.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Constructs an instance set to the current system millisecond time.
     *
     * @see #now()
     */
    public Instant() {
        super();__CLR4_4_11u71u7lgchoq97.R.inc(2394);try{__CLR4_4_11u71u7lgchoq97.R.inc(2393);
        __CLR4_4_11u71u7lgchoq97.R.inc(2395);iMillis = DateTimeUtils.currentTimeMillis();
    }finally{__CLR4_4_11u71u7lgchoq97.R.flushNeeded();}}

    /**
     * Constructs an instance set to the milliseconds from 1970-01-01T00:00:00Z.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z
     */
    public Instant(long instant) {
        super();__CLR4_4_11u71u7lgchoq97.R.inc(2397);try{__CLR4_4_11u71u7lgchoq97.R.inc(2396);
        __CLR4_4_11u71u7lgchoq97.R.inc(2398);iMillis = instant;
    }finally{__CLR4_4_11u71u7lgchoq97.R.flushNeeded();}}

    /**
     * Constructs an instance from an Object that represents a datetime.
     * <p>
     * The recognised object types are defined in {@link ConverterManager} and
     * include String, Calendar and Date.
     *
     * @param instant the datetime object, null means now
     * @throws IllegalArgumentException if the instant is invalid
     */
    public Instant(Object instant) {
        super();__CLR4_4_11u71u7lgchoq97.R.inc(2400);try{__CLR4_4_11u71u7lgchoq97.R.inc(2399);
        __CLR4_4_11u71u7lgchoq97.R.inc(2401);InstantConverter converter = ConverterManager.getInstance().getInstantConverter(instant);
        __CLR4_4_11u71u7lgchoq97.R.inc(2402);iMillis = converter.getInstantMillis(instant, ISOChronology.getInstanceUTC());
    }finally{__CLR4_4_11u71u7lgchoq97.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get this object as an Instant by returning <code>this</code>.
     *
     * @return <code>this</code>
     */
    public Instant toInstant() {try{__CLR4_4_11u71u7lgchoq97.R.inc(2403);
        __CLR4_4_11u71u7lgchoq97.R.inc(2404);return this;
    }finally{__CLR4_4_11u71u7lgchoq97.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets a copy of this instant with different millis.
     * <p>
     * The returned object will be either be a new Instant or <code>this</code>.
     * <p>
     * Note that this replaces the entire state of the <code>Instant</code>.
     * To manage the sub-second part of the instant, use {@link #toDateTime()}
     * and {@link DateTime#withMillisOfSecond(int)}.
     *
     * @param newMillis the new millis, from 1970-01-01T00:00:00Z
     * @return a copy of this instant with different millis
     */
    public Instant withMillis(long newMillis) {try{__CLR4_4_11u71u7lgchoq97.R.inc(2405);
        __CLR4_4_11u71u7lgchoq97.R.inc(2406);return ((((newMillis == iMillis )&&(__CLR4_4_11u71u7lgchoq97.R.iget(2407)!=0|true))||(__CLR4_4_11u71u7lgchoq97.R.iget(2408)==0&false))? this : new Instant(newMillis));
    }finally{__CLR4_4_11u71u7lgchoq97.R.flushNeeded();}}

    /**
     * Gets a copy of this instant with the specified duration added.
     * <p>
     * If the addition is zero, then <code>this</code> is returned.
     *
     * @param durationToAdd the duration to add to this one
     * @param scalar        the amount of times to add, such as -1 to subtract once
     * @return a copy of this instant with the duration added
     * @throws ArithmeticException if the new instant exceeds the capacity of a long
     */
    public Instant withDurationAdded(long durationToAdd, int scalar) {try{__CLR4_4_11u71u7lgchoq97.R.inc(2409);
        __CLR4_4_11u71u7lgchoq97.R.inc(2410);if ((((durationToAdd == 0 || scalar == 0)&&(__CLR4_4_11u71u7lgchoq97.R.iget(2411)!=0|true))||(__CLR4_4_11u71u7lgchoq97.R.iget(2412)==0&false))) {{
            __CLR4_4_11u71u7lgchoq97.R.inc(2413);return this;
        }
        }__CLR4_4_11u71u7lgchoq97.R.inc(2414);long instant = getChronology().add(getMillis(), durationToAdd, scalar);
        __CLR4_4_11u71u7lgchoq97.R.inc(2415);return withMillis(instant);
    }finally{__CLR4_4_11u71u7lgchoq97.R.flushNeeded();}}

    /**
     * Gets a copy of this instant with the specified duration added.
     * <p>
     * If the addition is zero, then <code>this</code> is returned.
     *
     * @param durationToAdd the duration to add to this one, null means zero
     * @param scalar        the amount of times to add, such as -1 to subtract once
     * @return a copy of this instant with the duration added
     * @throws ArithmeticException if the new instant exceeds the capacity of a long
     */
    public Instant withDurationAdded(ReadableDuration durationToAdd, int scalar) {try{__CLR4_4_11u71u7lgchoq97.R.inc(2416);
        __CLR4_4_11u71u7lgchoq97.R.inc(2417);if ((((durationToAdd == null || scalar == 0)&&(__CLR4_4_11u71u7lgchoq97.R.iget(2418)!=0|true))||(__CLR4_4_11u71u7lgchoq97.R.iget(2419)==0&false))) {{
            __CLR4_4_11u71u7lgchoq97.R.inc(2420);return this;
        }
        }__CLR4_4_11u71u7lgchoq97.R.inc(2421);return withDurationAdded(durationToAdd.getMillis(), scalar);
    }finally{__CLR4_4_11u71u7lgchoq97.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets a copy of this instant with the specified duration added.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     *
     * @param duration the duration to add to this one
     * @return a copy of this instant with the duration added
     * @throws ArithmeticException if the new instant exceeds the capacity of a long
     */
    public Instant plus(long duration) {try{__CLR4_4_11u71u7lgchoq97.R.inc(2422);
        __CLR4_4_11u71u7lgchoq97.R.inc(2423);return withDurationAdded(duration, 1);
    }finally{__CLR4_4_11u71u7lgchoq97.R.flushNeeded();}}

    /**
     * Gets a copy of this instant with the specified duration added.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     *
     * @param duration the duration to add to this one, null means zero
     * @return a copy of this instant with the duration added
     * @throws ArithmeticException if the new instant exceeds the capacity of a long
     */
    public Instant plus(ReadableDuration duration) {try{__CLR4_4_11u71u7lgchoq97.R.inc(2424);
        __CLR4_4_11u71u7lgchoq97.R.inc(2425);return withDurationAdded(duration, 1);
    }finally{__CLR4_4_11u71u7lgchoq97.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets a copy of this instant with the specified duration taken away.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     *
     * @param duration the duration to reduce this instant by
     * @return a copy of this instant with the duration taken away
     * @throws ArithmeticException if the new instant exceeds the capacity of a long
     */
    public Instant minus(long duration) {try{__CLR4_4_11u71u7lgchoq97.R.inc(2426);
        __CLR4_4_11u71u7lgchoq97.R.inc(2427);return withDurationAdded(duration, -1);
    }finally{__CLR4_4_11u71u7lgchoq97.R.flushNeeded();}}

    /**
     * Gets a copy of this instant with the specified duration taken away.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     *
     * @param duration the duration to reduce this instant by
     * @return a copy of this instant with the duration taken away
     * @throws ArithmeticException if the new instant exceeds the capacity of a long
     */
    public Instant minus(ReadableDuration duration) {try{__CLR4_4_11u71u7lgchoq97.R.inc(2428);
        __CLR4_4_11u71u7lgchoq97.R.inc(2429);return withDurationAdded(duration, -1);
    }finally{__CLR4_4_11u71u7lgchoq97.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the milliseconds of the instant.
     *
     * @return the number of milliseconds since 1970-01-01T00:00:00Z
     */
    public long getMillis() {try{__CLR4_4_11u71u7lgchoq97.R.inc(2430);
        __CLR4_4_11u71u7lgchoq97.R.inc(2431);return iMillis;
    }finally{__CLR4_4_11u71u7lgchoq97.R.flushNeeded();}}

    /**
     * Gets the chronology of the instant, which is ISO in the UTC zone.
     * <p>
     * This method returns {@link ISOChronology#getInstanceUTC()} which
     * corresponds to the definition of the Java epoch 1970-01-01T00:00:00Z.
     *
     * @return ISO in the UTC zone
     */
    public Chronology getChronology() {try{__CLR4_4_11u71u7lgchoq97.R.inc(2432);
        __CLR4_4_11u71u7lgchoq97.R.inc(2433);return ISOChronology.getInstanceUTC();
    }finally{__CLR4_4_11u71u7lgchoq97.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get this object as a DateTime using ISOChronology in the default zone.
     * <p>
     * This method returns a DateTime object in the default zone.
     * This differs from the similarly named method on DateTime, DateMidnight
     * or MutableDateTime which retains the time zone. The difference is
     * because Instant really represents a time <i>without</i> a zone,
     * thus calling this method we really have no zone to 'retain' and
     * hence expect to switch to the default zone.
     * <p>
     * This method definition preserves compatibility with earlier versions
     * of Joda-Time.
     *
     * @return a DateTime using the same millis
     */
    public DateTime toDateTime() {try{__CLR4_4_11u71u7lgchoq97.R.inc(2434);
        __CLR4_4_11u71u7lgchoq97.R.inc(2435);return new DateTime(getMillis(), ISOChronology.getInstance());
    }finally{__CLR4_4_11u71u7lgchoq97.R.flushNeeded();}}

    /**
     * Get this object as a DateTime using ISOChronology in the default zone.
     * This method is identical to <code>toDateTime()</code>.
     * <p>
     * This method returns a DateTime object in the default zone.
     * This differs from the similarly named method on DateTime, DateMidnight
     * or MutableDateTime which retains the time zone. The difference is
     * because Instant really represents a time <i>without</i> a zone,
     * thus calling this method we really have no zone to 'retain' and
     * hence expect to switch to the default zone.
     * <p>
     * This method is deprecated because it is a duplicate of {@link #toDateTime()}.
     * However, removing it would cause the superclass implementation to be used,
     * which would create silent bugs in any caller depending on this implementation.
     * As such, the method itself is not currently planned to be removed.
     * <p>
     * This method definition preserves compatibility with earlier versions
     * of Joda-Time.
     *
     * @return a DateTime using the same millis with ISOChronology
     * @deprecated Use toDateTime() as it is identical
     */
    @Deprecated
    public DateTime toDateTimeISO() {try{__CLR4_4_11u71u7lgchoq97.R.inc(2436);
        __CLR4_4_11u71u7lgchoq97.R.inc(2437);return toDateTime();
    }finally{__CLR4_4_11u71u7lgchoq97.R.flushNeeded();}}

    /**
     * Get this object as a MutableDateTime using ISOChronology in the default zone.
     * <p>
     * This method returns a MutableDateTime object in the default zone.
     * This differs from the similarly named method on DateTime, DateMidnight
     * or MutableDateTime which retains the time zone. The difference is
     * because Instant really represents a time <i>without</i> a zone,
     * thus calling this method we really have no zone to 'retain' and
     * hence expect to switch to the default zone.
     * <p>
     * This method definition preserves compatibility with earlier versions
     * of Joda-Time.
     *
     * @return a MutableDateTime using the same millis
     */
    public MutableDateTime toMutableDateTime() {try{__CLR4_4_11u71u7lgchoq97.R.inc(2438);
        __CLR4_4_11u71u7lgchoq97.R.inc(2439);return new MutableDateTime(getMillis(), ISOChronology.getInstance());
    }finally{__CLR4_4_11u71u7lgchoq97.R.flushNeeded();}}

    /**
     * Get this object as a MutableDateTime using ISOChronology in the default zone.
     * This method is identical to <code>toMutableDateTime()</code>.
     * <p>
     * This method returns a MutableDateTime object in the default zone.
     * This differs from the similarly named method on DateTime, DateMidnight
     * or MutableDateTime which retains the time zone. The difference is
     * because Instant really represents a time <i>without</i> a zone,
     * thus calling this method we really have no zone to 'retain' and
     * hence expect to switch to the default zone.
     * <p>
     * This method is deprecated because it is a duplicate of {@link #toMutableDateTime()}.
     * However, removing it would cause the superclass implementation to be used,
     * which would create silent bugs in any caller depending on this implementation.
     * As such, the method itself is not currently planned to be removed.
     * <p>
     * This method definition preserves compatibility with earlier versions
     * of Joda-Time.
     *
     * @return a MutableDateTime using the same millis with ISOChronology
     * @deprecated Use toMutableDateTime() as it is identical
     */
    @Deprecated
    public MutableDateTime toMutableDateTimeISO() {try{__CLR4_4_11u71u7lgchoq97.R.inc(2440);
        __CLR4_4_11u71u7lgchoq97.R.inc(2441);return toMutableDateTime();
    }finally{__CLR4_4_11u71u7lgchoq97.R.flushNeeded();}}

}
