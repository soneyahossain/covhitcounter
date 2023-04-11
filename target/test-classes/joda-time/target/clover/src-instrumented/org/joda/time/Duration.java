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

import java.io.Serializable;
import java.math.RoundingMode;

import org.joda.convert.FromString;
import org.joda.time.base.BaseDuration;
import org.joda.time.field.FieldUtils;

/**
 * An immutable duration specifying a length of time in milliseconds.
 * <p>
 * A duration is defined by a fixed number of milliseconds.
 * There is no concept of fields, such as days or seconds, as these fields can vary in length.
 * <p>
 * A duration may be converted to a {@link Period} to obtain field values.
 * This conversion will typically cause a loss of precision.
 * <p>
 * Duration is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.0
 */
public final class Duration
        extends BaseDuration
        implements ReadableDuration, Serializable {public static class __CLR4_4_11fj1fjlgchoq85{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,1983,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constant representing zero millisecond duration
     */
    public static final Duration ZERO = new Duration(0L);

    /**
     * Serialization version
     */
    private static final long serialVersionUID = 2471658376918L;

    //-----------------------------------------------------------------------

    /**
     * Parses a {@code Duration} from the specified string.
     * <p>
     * This parses the format {@code PTa.bS}, as per {@link #toString()}.
     *
     * @param str the string to parse, not null
     * @since 2.0
     */
    @FromString
    public static Duration parse(String str) {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1855);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1856);return new Duration(str);
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Create a duration with the specified number of days assuming that
     * there are the standard number of milliseconds in a day.
     * <p>
     * This method assumes that there are 24 hours in a day,
     * 60 minutes in an hour, 60 seconds in a minute and 1000 milliseconds in
     * a second. This will be true for most days, however days with Daylight
     * Savings changes will not have 24 hours, so use this method with care.
     * <p>
     * A Duration is a representation of an amount of time. If you want to express
     * the concept of 'days' you should consider using the {@link Days} class.
     *
     * @param days the number of standard days in this duration
     * @return the duration, never null
     * @throws ArithmeticException if the days value is too large
     * @since 1.6
     */
    public static Duration standardDays(long days) {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1857);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1858);if ((((days == 0)&&(__CLR4_4_11fj1fjlgchoq85.R.iget(1859)!=0|true))||(__CLR4_4_11fj1fjlgchoq85.R.iget(1860)==0&false))) {{
            __CLR4_4_11fj1fjlgchoq85.R.inc(1861);return ZERO;
        }
        }__CLR4_4_11fj1fjlgchoq85.R.inc(1862);return new Duration(FieldUtils.safeMultiply(days, DateTimeConstants.MILLIS_PER_DAY));
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Create a duration with the specified number of hours assuming that
     * there are the standard number of milliseconds in an hour.
     * <p>
     * This method assumes that there are 60 minutes in an hour,
     * 60 seconds in a minute and 1000 milliseconds in a second.
     * All currently supplied chronologies use this definition.
     * <p>
     * A Duration is a representation of an amount of time. If you want to express
     * the concept of 'hours' you should consider using the {@link Hours} class.
     *
     * @param hours the number of standard hours in this duration
     * @return the duration, never null
     * @throws ArithmeticException if the hours value is too large
     * @since 1.6
     */
    public static Duration standardHours(long hours) {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1863);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1864);if ((((hours == 0)&&(__CLR4_4_11fj1fjlgchoq85.R.iget(1865)!=0|true))||(__CLR4_4_11fj1fjlgchoq85.R.iget(1866)==0&false))) {{
            __CLR4_4_11fj1fjlgchoq85.R.inc(1867);return ZERO;
        }
        }__CLR4_4_11fj1fjlgchoq85.R.inc(1868);return new Duration(FieldUtils.safeMultiply(hours, DateTimeConstants.MILLIS_PER_HOUR));
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Create a duration with the specified number of minutes assuming that
     * there are the standard number of milliseconds in a minute.
     * <p>
     * This method assumes that there are 60 seconds in a minute and
     * 1000 milliseconds in a second.
     * All currently supplied chronologies use this definition.
     * <p>
     * A Duration is a representation of an amount of time. If you want to express
     * the concept of 'minutes' you should consider using the {@link Minutes} class.
     *
     * @param minutes the number of standard minutes in this duration
     * @return the duration, never null
     * @throws ArithmeticException if the minutes value is too large
     * @since 1.6
     */
    public static Duration standardMinutes(long minutes) {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1869);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1870);if ((((minutes == 0)&&(__CLR4_4_11fj1fjlgchoq85.R.iget(1871)!=0|true))||(__CLR4_4_11fj1fjlgchoq85.R.iget(1872)==0&false))) {{
            __CLR4_4_11fj1fjlgchoq85.R.inc(1873);return ZERO;
        }
        }__CLR4_4_11fj1fjlgchoq85.R.inc(1874);return new Duration(FieldUtils.safeMultiply(minutes, DateTimeConstants.MILLIS_PER_MINUTE));
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Create a duration with the specified number of seconds assuming that
     * there are the standard number of milliseconds in a second.
     * <p>
     * This method assumes that there are 1000 milliseconds in a second.
     * All currently supplied chronologies use this definition.
     * <p>
     * A Duration is a representation of an amount of time. If you want to express
     * the concept of 'seconds' you should consider using the {@link Seconds} class.
     *
     * @param seconds the number of standard seconds in this duration
     * @return the duration, never null
     * @throws ArithmeticException if the seconds value is too large
     * @since 1.6
     */
    public static Duration standardSeconds(long seconds) {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1875);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1876);if ((((seconds == 0)&&(__CLR4_4_11fj1fjlgchoq85.R.iget(1877)!=0|true))||(__CLR4_4_11fj1fjlgchoq85.R.iget(1878)==0&false))) {{
            __CLR4_4_11fj1fjlgchoq85.R.inc(1879);return ZERO;
        }
        }__CLR4_4_11fj1fjlgchoq85.R.inc(1880);return new Duration(FieldUtils.safeMultiply(seconds, DateTimeConstants.MILLIS_PER_SECOND));
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Create a duration with the specified number of milliseconds.
     *
     * @param millis the number of standard milliseconds in this duration
     * @return the duration, never null
     * @since 2.0
     */
    public static Duration millis(long millis) {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1881);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1882);if ((((millis == 0)&&(__CLR4_4_11fj1fjlgchoq85.R.iget(1883)!=0|true))||(__CLR4_4_11fj1fjlgchoq85.R.iget(1884)==0&false))) {{
            __CLR4_4_11fj1fjlgchoq85.R.inc(1885);return ZERO;
        }
        }__CLR4_4_11fj1fjlgchoq85.R.inc(1886);return new Duration(millis);
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a duration from the given millisecond duration.
     *
     * @param duration the duration, in milliseconds
     */
    public Duration(long duration) {
        super(duration);__CLR4_4_11fj1fjlgchoq85.R.inc(1888);try{__CLR4_4_11fj1fjlgchoq85.R.inc(1887);
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Creates a duration from the given interval endpoints.
     *
     * @param startInstant interval start, in milliseconds
     * @param endInstant   interval end, in milliseconds
     * @throws ArithmeticException if the duration exceeds a 64-bit long
     */
    public Duration(long startInstant, long endInstant) {
        super(startInstant, endInstant);__CLR4_4_11fj1fjlgchoq85.R.inc(1890);try{__CLR4_4_11fj1fjlgchoq85.R.inc(1889);
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Creates a duration from the given interval endpoints.
     *
     * @param start interval start, null means now
     * @param end   interval end, null means now
     * @throws ArithmeticException if the duration exceeds a 64-bit long
     */
    public Duration(ReadableInstant start, ReadableInstant end) {
        super(start, end);__CLR4_4_11fj1fjlgchoq85.R.inc(1892);try{__CLR4_4_11fj1fjlgchoq85.R.inc(1891);
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Creates a duration from the specified object using the
     * {@link org.joda.time.convert.ConverterManager ConverterManager}.
     *
     * @param duration duration to convert
     * @throws IllegalArgumentException if duration is invalid
     */
    public Duration(Object duration) {
        super(duration);__CLR4_4_11fj1fjlgchoq85.R.inc(1894);try{__CLR4_4_11fj1fjlgchoq85.R.inc(1893);
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the length of this duration in days assuming that there are the
     * standard number of milliseconds in a day.
     * <p>
     * This method assumes that there are 24 hours in a day,
     * 60 minutes in an hour, 60 seconds in a minute and 1000 milliseconds in
     * a second. This will be true for most days, however days with Daylight
     * Savings changes will not have 24 hours, so use this method with care.
     * <p>
     * This returns <code>getMillis() / MILLIS_PER_DAY</code>.
     * The result is an integer division, thus excess milliseconds are truncated.
     *
     * @return the length of the duration in standard days
     * @since 2.0
     */
    public long getStandardDays() {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1895);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1896);return getMillis() / DateTimeConstants.MILLIS_PER_DAY;
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Gets the length of this duration in hours assuming that there are the
     * standard number of milliseconds in an hour.
     * <p>
     * This method assumes that there are 60 minutes in an hour,
     * 60 seconds in a minute and 1000 milliseconds in a second.
     * All currently supplied chronologies use this definition.
     * <p>
     * This returns <code>getMillis() / MILLIS_PER_HOUR</code>.
     * The result is an integer division, thus excess milliseconds are truncated.
     *
     * @return the length of the duration in standard hours
     * @since 2.0
     */
    public long getStandardHours() {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1897);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1898);return getMillis() / DateTimeConstants.MILLIS_PER_HOUR;
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Gets the length of this duration in minutes assuming that there are the
     * standard number of milliseconds in a minute.
     * <p>
     * This method assumes that there are 60 seconds in a minute and
     * 1000 milliseconds in a second.
     * All currently supplied chronologies use this definition.
     * <p>
     * This returns <code>getMillis() / MILLIS_PER_MINUTE</code>.
     * The result is an integer division, thus excess milliseconds are truncated.
     *
     * @return the length of the duration in standard minutes
     * @since 2.0
     */
    public long getStandardMinutes() {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1899);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1900);return getMillis() / DateTimeConstants.MILLIS_PER_MINUTE;
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Gets the length of this duration in seconds assuming that there are the
     * standard number of milliseconds in a second.
     * <p>
     * This method assumes that there are 1000 milliseconds in a second.
     * All currently supplied chronologies use this definition.
     * <p>
     * This returns <code>getMillis() / 1000</code>.
     * The result is an integer division, so 2999 millis returns 2 seconds.
     *
     * @return the length of the duration in standard seconds
     * @since 1.6
     */
    public long getStandardSeconds() {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1901);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1902);return getMillis() / DateTimeConstants.MILLIS_PER_SECOND;
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get this duration as an immutable <code>Duration</code> object
     * by returning <code>this</code>.
     *
     * @return <code>this</code>
     */
    public Duration toDuration() {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1903);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1904);return this;
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Converts this duration to a period in days assuming that there are the
     * standard number of milliseconds in a day.
     * <p>
     * This method assumes that there are 24 hours in a day,
     * 60 minutes in an hour, 60 seconds in a minute and 1000 milliseconds in
     * a second. This will be true for most days, however days with Daylight
     * Savings changes will not have 24 hours, so use this method with care.
     *
     * @return a period representing the number of standard days in this period, never null
     * @throws ArithmeticException if the number of days is too large to be represented
     * @since 2.0
     */
    public Days toStandardDays() {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1905);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1906);long days = getStandardDays();
        __CLR4_4_11fj1fjlgchoq85.R.inc(1907);return Days.days(FieldUtils.safeToInt(days));
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Converts this duration to a period in hours assuming that there are the
     * standard number of milliseconds in an hour.
     * <p>
     * This method assumes that there are 60 minutes in an hour,
     * 60 seconds in a minute and 1000 milliseconds in a second.
     * All currently supplied chronologies use this definition.
     *
     * @return a period representing the number of standard hours in this period, never null
     * @throws ArithmeticException if the number of hours is too large to be represented
     * @since 2.0
     */
    public Hours toStandardHours() {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1908);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1909);long hours = getStandardHours();
        __CLR4_4_11fj1fjlgchoq85.R.inc(1910);return Hours.hours(FieldUtils.safeToInt(hours));
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Converts this duration to a period in minutes assuming that there are the
     * standard number of milliseconds in a minute.
     * <p>
     * This method assumes that there are 60 seconds in a minute and
     * 1000 milliseconds in a second.
     * All currently supplied chronologies use this definition.
     *
     * @return a period representing the number of standard minutes in this period, never null
     * @throws ArithmeticException if the number of minutes is too large to be represented
     * @since 2.0
     */
    public Minutes toStandardMinutes() {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1911);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1912);long minutes = getStandardMinutes();
        __CLR4_4_11fj1fjlgchoq85.R.inc(1913);return Minutes.minutes(FieldUtils.safeToInt(minutes));
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Converts this duration to a period in seconds assuming that there are the
     * standard number of milliseconds in a second.
     * <p>
     * This method assumes that there are 1000 milliseconds in a second.
     * All currently supplied chronologies use this definition.
     *
     * @return a period representing the number of standard seconds in this period, never null
     * @throws ArithmeticException if the number of seconds is too large to be represented
     * @since 1.6
     */
    public Seconds toStandardSeconds() {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1914);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1915);long seconds = getStandardSeconds();
        __CLR4_4_11fj1fjlgchoq85.R.inc(1916);return Seconds.seconds(FieldUtils.safeToInt(seconds));
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a new Duration instance with a different millisecond length.
     *
     * @param duration the new length of the duration
     * @return the new duration instance
     */
    public Duration withMillis(long duration) {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1917);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1918);if ((((duration == getMillis())&&(__CLR4_4_11fj1fjlgchoq85.R.iget(1919)!=0|true))||(__CLR4_4_11fj1fjlgchoq85.R.iget(1920)==0&false))) {{
            __CLR4_4_11fj1fjlgchoq85.R.inc(1921);return this;
        }
        }__CLR4_4_11fj1fjlgchoq85.R.inc(1922);return new Duration(duration);
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Returns a new duration with this length plus that specified multiplied by the scalar.
     * This instance is immutable and is not altered.
     * <p>
     * If the addition is zero, this instance is returned.
     *
     * @param durationToAdd the duration to add to this one
     * @param scalar        the amount of times to add, such as -1 to subtract once
     * @return the new duration instance
     */
    public Duration withDurationAdded(long durationToAdd, int scalar) {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1923);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1924);if ((((durationToAdd == 0 || scalar == 0)&&(__CLR4_4_11fj1fjlgchoq85.R.iget(1925)!=0|true))||(__CLR4_4_11fj1fjlgchoq85.R.iget(1926)==0&false))) {{
            __CLR4_4_11fj1fjlgchoq85.R.inc(1927);return this;
        }
        }__CLR4_4_11fj1fjlgchoq85.R.inc(1928);long add = FieldUtils.safeMultiply(durationToAdd, scalar);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1929);long duration = FieldUtils.safeAdd(getMillis(), add);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1930);return new Duration(duration);
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Returns a new duration with this length plus that specified multiplied by the scalar.
     * This instance is immutable and is not altered.
     * <p>
     * If the addition is zero, this instance is returned.
     *
     * @param durationToAdd the duration to add to this one, null means zero
     * @param scalar        the amount of times to add, such as -1 to subtract once
     * @return the new duration instance
     */
    public Duration withDurationAdded(ReadableDuration durationToAdd, int scalar) {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1931);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1932);if ((((durationToAdd == null || scalar == 0)&&(__CLR4_4_11fj1fjlgchoq85.R.iget(1933)!=0|true))||(__CLR4_4_11fj1fjlgchoq85.R.iget(1934)==0&false))) {{
            __CLR4_4_11fj1fjlgchoq85.R.inc(1935);return this;
        }
        }__CLR4_4_11fj1fjlgchoq85.R.inc(1936);return withDurationAdded(durationToAdd.getMillis(), scalar);
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new duration with this length plus that specified.
     * This instance is immutable and is not altered.
     * <p>
     * If the addition is zero, this instance is returned.
     *
     * @param amount the duration to add to this one
     * @return the new duration instance
     */
    public Duration plus(long amount) {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1937);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1938);return withDurationAdded(amount, 1);
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Returns a new duration with this length plus that specified.
     * This instance is immutable and is not altered.
     * <p>
     * If the amount is zero, this instance is returned.
     *
     * @param amount the duration to add to this one, null means zero
     * @return the new duration instance
     */
    public Duration plus(ReadableDuration amount) {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1939);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1940);if ((((amount == null)&&(__CLR4_4_11fj1fjlgchoq85.R.iget(1941)!=0|true))||(__CLR4_4_11fj1fjlgchoq85.R.iget(1942)==0&false))) {{
            __CLR4_4_11fj1fjlgchoq85.R.inc(1943);return this;
        }
        }__CLR4_4_11fj1fjlgchoq85.R.inc(1944);return withDurationAdded(amount.getMillis(), 1);
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Returns a new duration with this length minus that specified.
     * This instance is immutable and is not altered.
     * <p>
     * If the addition is zero, this instance is returned.
     *
     * @param amount the duration to take away from this one
     * @return the new duration instance
     */
    public Duration minus(long amount) {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1945);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1946);return withDurationAdded(amount, -1);
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Returns a new duration with this length minus that specified.
     * This instance is immutable and is not altered.
     * <p>
     * If the amount is zero, this instance is returned.
     *
     * @param amount the duration to take away from this one, null means zero
     * @return the new duration instance
     */
    public Duration minus(ReadableDuration amount) {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1947);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1948);if ((((amount == null)&&(__CLR4_4_11fj1fjlgchoq85.R.iget(1949)!=0|true))||(__CLR4_4_11fj1fjlgchoq85.R.iget(1950)==0&false))) {{
            __CLR4_4_11fj1fjlgchoq85.R.inc(1951);return this;
        }
        }__CLR4_4_11fj1fjlgchoq85.R.inc(1952);return withDurationAdded(amount.getMillis(), -1);
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Returns a new duration with this length multiplied by the
     * specified multiplicand.
     * This instance is immutable and is not altered.
     * <p>
     * If the multiplicand is one, this instance is returned.
     *
     * @param multiplicand the multiplicand to multiply this one by
     * @return the new duration instance
     */
    public Duration multipliedBy(long multiplicand) {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1953);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1954);if ((((multiplicand == 1)&&(__CLR4_4_11fj1fjlgchoq85.R.iget(1955)!=0|true))||(__CLR4_4_11fj1fjlgchoq85.R.iget(1956)==0&false))) {{
            __CLR4_4_11fj1fjlgchoq85.R.inc(1957);return this;
        }
        }__CLR4_4_11fj1fjlgchoq85.R.inc(1958);return new Duration(FieldUtils.safeMultiply(getMillis(), multiplicand));
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Returns a new duration with this length divided by the
     * specified divisor.
     * This instance is immutable and is not altered.
     * <p>
     * If the divisor is one, this instance is returned.
     *
     * @param divisor the divisor to divide this one by
     * @return the new duration instance
     */
    public Duration dividedBy(long divisor) {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1959);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1960);if ((((divisor == 1)&&(__CLR4_4_11fj1fjlgchoq85.R.iget(1961)!=0|true))||(__CLR4_4_11fj1fjlgchoq85.R.iget(1962)==0&false))) {{
            __CLR4_4_11fj1fjlgchoq85.R.inc(1963);return this;
        }
        }__CLR4_4_11fj1fjlgchoq85.R.inc(1964);return new Duration(FieldUtils.safeDivide(getMillis(), divisor));
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Returns a new duration with its length divided by the
     * specified divisor. {@code RoundingMode} can be specified.
     * This instance is immutable and is not altered.
     * <p>
     * If the divisor is one, this instance is returned.
     *
     * @param divisor      the divisor to divide this one by
     * @param roundingMode the type of rounding desired
     * @return the new duration instance
     */
    public Duration dividedBy(long divisor, RoundingMode roundingMode) {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1965);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1966);if ((((divisor == 1)&&(__CLR4_4_11fj1fjlgchoq85.R.iget(1967)!=0|true))||(__CLR4_4_11fj1fjlgchoq85.R.iget(1968)==0&false))) {{
            __CLR4_4_11fj1fjlgchoq85.R.inc(1969);return this;
        }
        }__CLR4_4_11fj1fjlgchoq85.R.inc(1970);return new Duration(FieldUtils.safeDivide(getMillis(), divisor, roundingMode));
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Returns a new duration with this length negated.
     * This instance is immutable and is not altered.
     *
     * @return the new duration instance
     */
    public Duration negated() {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1971);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1972);if ((((getMillis() == Long.MIN_VALUE)&&(__CLR4_4_11fj1fjlgchoq85.R.iget(1973)!=0|true))||(__CLR4_4_11fj1fjlgchoq85.R.iget(1974)==0&false))) {{
            __CLR4_4_11fj1fjlgchoq85.R.inc(1975);throw new ArithmeticException("Negation of this duration would overflow");
        }
        }__CLR4_4_11fj1fjlgchoq85.R.inc(1976);return new Duration(-getMillis());
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

    /**
     * Returns a duration that has a positive or zero number of milliseconds.
     * <p>
     * This instance is immutable and is not altered.
     *
     * @return the absolute duration instance
     * @since 2.10
     */
    public Duration abs() {try{__CLR4_4_11fj1fjlgchoq85.R.inc(1977);
        __CLR4_4_11fj1fjlgchoq85.R.inc(1978);if ((((getMillis() < 0)&&(__CLR4_4_11fj1fjlgchoq85.R.iget(1979)!=0|true))||(__CLR4_4_11fj1fjlgchoq85.R.iget(1980)==0&false))) {{
            __CLR4_4_11fj1fjlgchoq85.R.inc(1981);return negated();
        }
        }__CLR4_4_11fj1fjlgchoq85.R.inc(1982);return this;
    }finally{__CLR4_4_11fj1fjlgchoq85.R.flushNeeded();}}

}
