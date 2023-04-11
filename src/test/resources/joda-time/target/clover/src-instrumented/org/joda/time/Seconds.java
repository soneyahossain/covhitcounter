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

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/**
 * An immutable time period representing a number of seconds.
 * <p>
 * <code>Seconds</code> is an immutable period that can only store seconds.
 * It does not store years, months or hours for example. As such it is a
 * type-safe way of representing a number of seconds in an application.
 * <p>
 * The number of seconds is set in the constructor, and may be queried using
 * <code>getSeconds()</code>. Basic mathematical operations are provided -
 * <code>plus()</code>, <code>minus()</code>, <code>multipliedBy()</code> and
 * <code>dividedBy()</code>.
 * <p>
 * <code>Seconds</code> is thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @since 1.4
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class Seconds extends BaseSingleFieldPeriod {public static class __CLR4_4_14ub4ublgchoqip{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,6385,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constant representing zero seconds.
     */
    public static final Seconds ZERO = new Seconds(0);
    /**
     * Constant representing one second.
     */
    public static final Seconds ONE = new Seconds(1);
    /**
     * Constant representing two seconds.
     */
    public static final Seconds TWO = new Seconds(2);
    /**
     * Constant representing three seconds.
     */
    public static final Seconds THREE = new Seconds(3);
    /**
     * Constant representing the maximum number of seconds that can be stored in this object.
     */
    public static final Seconds MAX_VALUE = new Seconds(Integer.MAX_VALUE);
    /**
     * Constant representing the minimum number of seconds that can be stored in this object.
     */
    public static final Seconds MIN_VALUE = new Seconds(Integer.MIN_VALUE);

    /**
     * The parser to use for this class.
     */
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.seconds());
    /**
     * Serialization version.
     */
    private static final long serialVersionUID = 87525275727380862L;

    //-----------------------------------------------------------------------

    /**
     * Obtains an instance of <code>Seconds</code> that may be cached.
     * <code>Seconds</code> is immutable, so instances can be cached and shared.
     * This factory method provides access to shared instances.
     *
     * @param seconds the number of seconds to obtain an instance for
     * @return the instance of Seconds
     */
    public static Seconds seconds(int seconds) {try{__CLR4_4_14ub4ublgchoqip.R.inc(6275);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_14ub4ublgchoqip.R.inc(6276);switch (seconds) {
            case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_14ub4ublgchoqip.R.inc(6277);__CLB4_4_1_bool0=true;}
                __CLR4_4_14ub4ublgchoqip.R.inc(6278);return ZERO;
            case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_14ub4ublgchoqip.R.inc(6279);__CLB4_4_1_bool0=true;}
                __CLR4_4_14ub4ublgchoqip.R.inc(6280);return ONE;
            case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_14ub4ublgchoqip.R.inc(6281);__CLB4_4_1_bool0=true;}
                __CLR4_4_14ub4ublgchoqip.R.inc(6282);return TWO;
            case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_14ub4ublgchoqip.R.inc(6283);__CLB4_4_1_bool0=true;}
                __CLR4_4_14ub4ublgchoqip.R.inc(6284);return THREE;
            case Integer.MAX_VALUE:if (!__CLB4_4_1_bool0) {__CLR4_4_14ub4ublgchoqip.R.inc(6285);__CLB4_4_1_bool0=true;}
                __CLR4_4_14ub4ublgchoqip.R.inc(6286);return MAX_VALUE;
            case Integer.MIN_VALUE:if (!__CLB4_4_1_bool0) {__CLR4_4_14ub4ublgchoqip.R.inc(6287);__CLB4_4_1_bool0=true;}
                __CLR4_4_14ub4ublgchoqip.R.inc(6288);return MIN_VALUE;
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_14ub4ublgchoqip.R.inc(6289);__CLB4_4_1_bool0=true;}
                __CLR4_4_14ub4ublgchoqip.R.inc(6290);return new Seconds(seconds);
        }
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a <code>Seconds</code> representing the number of whole seconds
     * between the two specified datetimes.
     *
     * @param start the start instant, must not be null
     * @param end   the end instant, must not be null
     * @return the period in seconds
     * @throws IllegalArgumentException if the instants are null or invalid
     */
    public static Seconds secondsBetween(ReadableInstant start, ReadableInstant end) {try{__CLR4_4_14ub4ublgchoqip.R.inc(6291);
        __CLR4_4_14ub4ublgchoqip.R.inc(6292);int amount = BaseSingleFieldPeriod.between(start, end, DurationFieldType.seconds());
        __CLR4_4_14ub4ublgchoqip.R.inc(6293);return Seconds.seconds(amount);
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    /**
     * Creates a <code>Seconds</code> representing the number of whole seconds
     * between the two specified partial datetimes.
     * <p>
     * The two partials must contain the same fields, for example you can specify
     * two <code>LocalTime</code> objects.
     *
     * @param start the start partial date, must not be null
     * @param end   the end partial date, must not be null
     * @return the period in seconds
     * @throws IllegalArgumentException if the partials are null or invalid
     */
    public static Seconds secondsBetween(ReadablePartial start, ReadablePartial end) {try{__CLR4_4_14ub4ublgchoqip.R.inc(6294);
        __CLR4_4_14ub4ublgchoqip.R.inc(6295);if ((((start instanceof LocalTime && end instanceof LocalTime)&&(__CLR4_4_14ub4ublgchoqip.R.iget(6296)!=0|true))||(__CLR4_4_14ub4ublgchoqip.R.iget(6297)==0&false))) {{
            __CLR4_4_14ub4ublgchoqip.R.inc(6298);Chronology chrono = DateTimeUtils.getChronology(start.getChronology());
            __CLR4_4_14ub4ublgchoqip.R.inc(6299);int seconds = chrono.seconds().getDifference(
                    ((LocalTime) end).getLocalMillis(), ((LocalTime) start).getLocalMillis());
            __CLR4_4_14ub4ublgchoqip.R.inc(6300);return Seconds.seconds(seconds);
        }
        }__CLR4_4_14ub4ublgchoqip.R.inc(6301);int amount = BaseSingleFieldPeriod.between(start, end, ZERO);
        __CLR4_4_14ub4ublgchoqip.R.inc(6302);return Seconds.seconds(amount);
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    /**
     * Creates a <code>Seconds</code> representing the number of whole seconds
     * in the specified interval.
     *
     * @param interval the interval to extract seconds from, null returns zero
     * @return the period in seconds
     * @throws IllegalArgumentException if the partials are null or invalid
     */
    public static Seconds secondsIn(ReadableInterval interval) {try{__CLR4_4_14ub4ublgchoqip.R.inc(6303);
        __CLR4_4_14ub4ublgchoqip.R.inc(6304);if ((((interval == null)&&(__CLR4_4_14ub4ublgchoqip.R.iget(6305)!=0|true))||(__CLR4_4_14ub4ublgchoqip.R.iget(6306)==0&false))) {{
            __CLR4_4_14ub4ublgchoqip.R.inc(6307);return Seconds.ZERO;
        }
        }__CLR4_4_14ub4ublgchoqip.R.inc(6308);int amount = BaseSingleFieldPeriod.between(interval.getStart(), interval.getEnd(), DurationFieldType.seconds());
        __CLR4_4_14ub4ublgchoqip.R.inc(6309);return Seconds.seconds(amount);
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    /**
     * Creates a new <code>Seconds</code> representing the number of complete
     * standard length seconds in the specified period.
     * <p>
     * This factory method converts all fields from the period to hours using standardised
     * durations for each field. Only those fields which have a precise duration in
     * the ISO UTC chronology can be converted.
     * <ul>
     * <li>One week consists of 7 days.
     * <li>One day consists of 24 hours.
     * <li>One hour consists of 60 minutes.
     * <li>One minute consists of 60 seconds.
     * <li>One second consists of 1000 milliseconds.
     * </ul>
     * Months and Years are imprecise and periods containing these values cannot be converted.
     *
     * @param period the period to get the number of hours from, null returns zero
     * @return the period in seconds
     * @throws IllegalArgumentException if the period contains imprecise duration values
     */
    public static Seconds standardSecondsIn(ReadablePeriod period) {try{__CLR4_4_14ub4ublgchoqip.R.inc(6310);
        __CLR4_4_14ub4ublgchoqip.R.inc(6311);int amount = BaseSingleFieldPeriod.standardPeriodIn(period, DateTimeConstants.MILLIS_PER_SECOND);
        __CLR4_4_14ub4ublgchoqip.R.inc(6312);return Seconds.seconds(amount);
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    /**
     * Creates a new <code>Seconds</code> by parsing a string in the ISO8601 format 'PTnS'.
     * <p>
     * The parse will accept the full ISO syntax of PnYnMnWnDTnHnMnS however only the
     * seconds component may be non-zero. If any other component is non-zero, an exception
     * will be thrown.
     *
     * @param periodStr the period string, null returns zero
     * @return the period in seconds
     * @throws IllegalArgumentException if the string format is invalid
     */
    @FromString
    public static Seconds parseSeconds(String periodStr) {try{__CLR4_4_14ub4ublgchoqip.R.inc(6313);
        __CLR4_4_14ub4ublgchoqip.R.inc(6314);if ((((periodStr == null)&&(__CLR4_4_14ub4ublgchoqip.R.iget(6315)!=0|true))||(__CLR4_4_14ub4ublgchoqip.R.iget(6316)==0&false))) {{
            __CLR4_4_14ub4ublgchoqip.R.inc(6317);return Seconds.ZERO;
        }
        }__CLR4_4_14ub4ublgchoqip.R.inc(6318);Period p = PARSER.parsePeriod(periodStr);
        __CLR4_4_14ub4ublgchoqip.R.inc(6319);return Seconds.seconds(p.getSeconds());
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a new instance representing a number of seconds.
     * You should consider using the factory method {@link #seconds(int)}
     * instead of the constructor.
     *
     * @param seconds the number of seconds to represent
     */
    private Seconds(int seconds) {
        super(seconds);__CLR4_4_14ub4ublgchoqip.R.inc(6321);try{__CLR4_4_14ub4ublgchoqip.R.inc(6320);
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    /**
     * Resolves singletons.
     *
     * @return the singleton instance
     */
    private Object readResolve() {try{__CLR4_4_14ub4ublgchoqip.R.inc(6322);
        __CLR4_4_14ub4ublgchoqip.R.inc(6323);return Seconds.seconds(getValue());
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the duration field type, which is <code>seconds</code>.
     *
     * @return the period type
     */
    public DurationFieldType getFieldType() {try{__CLR4_4_14ub4ublgchoqip.R.inc(6324);
        __CLR4_4_14ub4ublgchoqip.R.inc(6325);return DurationFieldType.seconds();
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    /**
     * Gets the period type, which is <code>seconds</code>.
     *
     * @return the period type
     */
    public PeriodType getPeriodType() {try{__CLR4_4_14ub4ublgchoqip.R.inc(6326);
        __CLR4_4_14ub4ublgchoqip.R.inc(6327);return PeriodType.seconds();
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this period in seconds to a period in weeks assuming a
     * 7 day week, 24 hour day, 60 minute hour and 60 second minute.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all weeks are 7 days
     * long, all days are 24 hours long, all hours are 60 minutes long and
     * all minutes are 60 seconds long.
     * This is not true when daylight savings time is considered, and may also
     * not be true for some unusual chronologies. However, it is included as it
     * is a useful operation for many applications and business rules.
     *
     * @return a period representing the number of whole weeks for this number of seconds
     */
    public Weeks toStandardWeeks() {try{__CLR4_4_14ub4ublgchoqip.R.inc(6328);
        __CLR4_4_14ub4ublgchoqip.R.inc(6329);return Weeks.weeks(getValue() / DateTimeConstants.SECONDS_PER_WEEK);
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    /**
     * Converts this period in seconds to a period in days assuming a
     * 24 hour day, 60 minute hour and 60 second minute.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all days are 24 hours
     * long, all hours are 60 minutes long and all minutes are 60 seconds long.
     * This is not true when daylight savings is considered and may also not
     * be true for some unusual chronologies. However, it is included
     * as it is a useful operation for many applications and business rules.
     *
     * @return a period representing the number of days for this number of seconds
     */
    public Days toStandardDays() {try{__CLR4_4_14ub4ublgchoqip.R.inc(6330);
        __CLR4_4_14ub4ublgchoqip.R.inc(6331);return Days.days(getValue() / DateTimeConstants.SECONDS_PER_DAY);
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    /**
     * Converts this period in seconds to a period in hours assuming a
     * 60 minute hour and 60 second minute.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all hours are
     * 60 minutes long and all minutes are 60 seconds long.
     * This may not be true for some unusual chronologies. However, it is included
     * as it is a useful operation for many applications and business rules.
     *
     * @return a period representing the number of hours for this number of seconds
     */
    public Hours toStandardHours() {try{__CLR4_4_14ub4ublgchoqip.R.inc(6332);
        __CLR4_4_14ub4ublgchoqip.R.inc(6333);return Hours.hours(getValue() / DateTimeConstants.SECONDS_PER_HOUR);
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    /**
     * Converts this period in seconds to a period in minutes assuming a
     * 60 second minute.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all minutes are
     * 60 seconds long.
     * This may not be true for some unusual chronologies. However, it is included
     * as it is a useful operation for many applications and business rules.
     *
     * @return a period representing the number of minutes for this number of seconds
     */
    public Minutes toStandardMinutes() {try{__CLR4_4_14ub4ublgchoqip.R.inc(6334);
        __CLR4_4_14ub4ublgchoqip.R.inc(6335);return Minutes.minutes(getValue() / DateTimeConstants.SECONDS_PER_MINUTE);
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this period in seconds to a duration in milliseconds assuming a
     * 24 hour day, 60 minute hour and 60 second minute.
     * <p>
     * This method allows you to convert from a period to a duration.
     * However to achieve this it makes the assumption that all seconds are 24 hours
     * long, all hours are 60 minutes and all minutes are 60 seconds.
     * This is not true when daylight savings time is considered, and may also
     * not be true for some unusual chronologies. However, it is included as it
     * is a useful operation for many applications and business rules.
     *
     * @return a duration equivalent to this number of seconds
     */
    public Duration toStandardDuration() {try{__CLR4_4_14ub4ublgchoqip.R.inc(6336);
        __CLR4_4_14ub4ublgchoqip.R.inc(6337);long seconds = getValue();  // assign to a long
        __CLR4_4_14ub4ublgchoqip.R.inc(6338);return new Duration(seconds * DateTimeConstants.MILLIS_PER_SECOND);
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the number of seconds that this period represents.
     *
     * @return the number of seconds in the period
     */
    public int getSeconds() {try{__CLR4_4_14ub4ublgchoqip.R.inc(6339);
        __CLR4_4_14ub4ublgchoqip.R.inc(6340);return getValue();
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new instance with the specified number of seconds added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param seconds the amount of seconds to add, may be negative
     * @return the new period plus the specified number of seconds
     * @throws ArithmeticException if the result overflows an int
     */
    public Seconds plus(int seconds) {try{__CLR4_4_14ub4ublgchoqip.R.inc(6341);
        __CLR4_4_14ub4ublgchoqip.R.inc(6342);if ((((seconds == 0)&&(__CLR4_4_14ub4ublgchoqip.R.iget(6343)!=0|true))||(__CLR4_4_14ub4ublgchoqip.R.iget(6344)==0&false))) {{
            __CLR4_4_14ub4ublgchoqip.R.inc(6345);return this;
        }
        }__CLR4_4_14ub4ublgchoqip.R.inc(6346);return Seconds.seconds(FieldUtils.safeAdd(getValue(), seconds));
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    /**
     * Returns a new instance with the specified number of seconds added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param seconds the amount of seconds to add, may be negative, null means zero
     * @return the new period plus the specified number of seconds
     * @throws ArithmeticException if the result overflows an int
     */
    public Seconds plus(Seconds seconds) {try{__CLR4_4_14ub4ublgchoqip.R.inc(6347);
        __CLR4_4_14ub4ublgchoqip.R.inc(6348);if ((((seconds == null)&&(__CLR4_4_14ub4ublgchoqip.R.iget(6349)!=0|true))||(__CLR4_4_14ub4ublgchoqip.R.iget(6350)==0&false))) {{
            __CLR4_4_14ub4ublgchoqip.R.inc(6351);return this;
        }
        }__CLR4_4_14ub4ublgchoqip.R.inc(6352);return plus(seconds.getValue());
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new instance with the specified number of seconds taken away.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param seconds the amount of seconds to take away, may be negative
     * @return the new period minus the specified number of seconds
     * @throws ArithmeticException if the result overflows an int
     */
    public Seconds minus(int seconds) {try{__CLR4_4_14ub4ublgchoqip.R.inc(6353);
        __CLR4_4_14ub4ublgchoqip.R.inc(6354);return plus(FieldUtils.safeNegate(seconds));
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    /**
     * Returns a new instance with the specified number of seconds taken away.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param seconds the amount of seconds to take away, may be negative, null means zero
     * @return the new period minus the specified number of seconds
     * @throws ArithmeticException if the result overflows an int
     */
    public Seconds minus(Seconds seconds) {try{__CLR4_4_14ub4ublgchoqip.R.inc(6355);
        __CLR4_4_14ub4ublgchoqip.R.inc(6356);if ((((seconds == null)&&(__CLR4_4_14ub4ublgchoqip.R.iget(6357)!=0|true))||(__CLR4_4_14ub4ublgchoqip.R.iget(6358)==0&false))) {{
            __CLR4_4_14ub4ublgchoqip.R.inc(6359);return this;
        }
        }__CLR4_4_14ub4ublgchoqip.R.inc(6360);return minus(seconds.getValue());
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new instance with the seconds multiplied by the specified scalar.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param scalar the amount to multiply by, may be negative
     * @return the new period multiplied by the specified scalar
     * @throws ArithmeticException if the result overflows an int
     */
    public Seconds multipliedBy(int scalar) {try{__CLR4_4_14ub4ublgchoqip.R.inc(6361);
        __CLR4_4_14ub4ublgchoqip.R.inc(6362);return Seconds.seconds(FieldUtils.safeMultiply(getValue(), scalar));
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    /**
     * Returns a new instance with the seconds divided by the specified divisor.
     * The calculation uses integer division, thus 3 divided by 2 is 1.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param divisor the amount to divide by, may be negative
     * @return the new period divided by the specified divisor
     * @throws ArithmeticException if the divisor is zero
     */
    public Seconds dividedBy(int divisor) {try{__CLR4_4_14ub4ublgchoqip.R.inc(6363);
        __CLR4_4_14ub4ublgchoqip.R.inc(6364);if ((((divisor == 1)&&(__CLR4_4_14ub4ublgchoqip.R.iget(6365)!=0|true))||(__CLR4_4_14ub4ublgchoqip.R.iget(6366)==0&false))) {{
            __CLR4_4_14ub4ublgchoqip.R.inc(6367);return this;
        }
        }__CLR4_4_14ub4ublgchoqip.R.inc(6368);return Seconds.seconds(getValue() / divisor);
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new instance with the seconds value negated.
     *
     * @return the new period with a negated value
     * @throws ArithmeticException if the result overflows an int
     */
    public Seconds negated() {try{__CLR4_4_14ub4ublgchoqip.R.inc(6369);
        __CLR4_4_14ub4ublgchoqip.R.inc(6370);return Seconds.seconds(FieldUtils.safeNegate(getValue()));
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Is this seconds instance greater than the specified number of seconds.
     *
     * @param other the other period, null means zero
     * @return true if this seconds instance is greater than the specified one
     */
    public boolean isGreaterThan(Seconds other) {try{__CLR4_4_14ub4ublgchoqip.R.inc(6371);
        __CLR4_4_14ub4ublgchoqip.R.inc(6372);if ((((other == null)&&(__CLR4_4_14ub4ublgchoqip.R.iget(6373)!=0|true))||(__CLR4_4_14ub4ublgchoqip.R.iget(6374)==0&false))) {{
            __CLR4_4_14ub4ublgchoqip.R.inc(6375);return getValue() > 0;
        }
        }__CLR4_4_14ub4ublgchoqip.R.inc(6376);return getValue() > other.getValue();
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    /**
     * Is this seconds instance less than the specified number of seconds.
     *
     * @param other the other period, null means zero
     * @return true if this seconds instance is less than the specified one
     */
    public boolean isLessThan(Seconds other) {try{__CLR4_4_14ub4ublgchoqip.R.inc(6377);
        __CLR4_4_14ub4ublgchoqip.R.inc(6378);if ((((other == null)&&(__CLR4_4_14ub4ublgchoqip.R.iget(6379)!=0|true))||(__CLR4_4_14ub4ublgchoqip.R.iget(6380)==0&false))) {{
            __CLR4_4_14ub4ublgchoqip.R.inc(6381);return getValue() < 0;
        }
        }__CLR4_4_14ub4ublgchoqip.R.inc(6382);return getValue() < other.getValue();
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets this instance as a String in the ISO8601 duration format.
     * <p>
     * For example, "PT4S" represents 4 seconds.
     *
     * @return the value as an ISO8601 string
     */
    @ToString
    public String toString() {try{__CLR4_4_14ub4ublgchoqip.R.inc(6383);
        __CLR4_4_14ub4ublgchoqip.R.inc(6384);return "PT" + String.valueOf(getValue()) + "S";
    }finally{__CLR4_4_14ub4ublgchoqip.R.flushNeeded();}}

}
