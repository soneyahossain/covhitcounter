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
 * An immutable time period representing a number of minutes.
 * <p>
 * <code>Minutes</code> is an immutable period that can only store minutes.
 * It does not store years, months or hours for example. As such it is a
 * type-safe way of representing a number of minutes in an application.
 * <p>
 * The number of minutes is set in the constructor, and may be queried using
 * <code>getMinutes()</code>. Basic mathematical operations are provided -
 * <code>plus()</code>, <code>minus()</code>, <code>multipliedBy()</code> and
 * <code>dividedBy()</code>.
 * <p>
 * <code>Minutes</code> is thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @since 1.4
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class Minutes extends BaseSingleFieldPeriod {public static class __CLR4_4_135y35ylgchoqd8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,4212,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constant representing zero minutes.
     */
    public static final Minutes ZERO = new Minutes(0);
    /**
     * Constant representing one minute.
     */
    public static final Minutes ONE = new Minutes(1);
    /**
     * Constant representing two minutes.
     */
    public static final Minutes TWO = new Minutes(2);
    /**
     * Constant representing three minutes.
     */
    public static final Minutes THREE = new Minutes(3);
    /**
     * Constant representing the maximum number of minutes that can be stored in this object.
     */
    public static final Minutes MAX_VALUE = new Minutes(Integer.MAX_VALUE);
    /**
     * Constant representing the minimum number of minutes that can be stored in this object.
     */
    public static final Minutes MIN_VALUE = new Minutes(Integer.MIN_VALUE);

    /**
     * The parser to use for this class.
     */
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.minutes());
    /**
     * Serialization version.
     */
    private static final long serialVersionUID = 87525275727380863L;

    //-----------------------------------------------------------------------

    /**
     * Obtains an instance of <code>Minutes</code> that may be cached.
     * <code>Minutes</code> is immutable, so instances can be cached and shared.
     * This factory method provides access to shared instances.
     *
     * @param minutes the number of minutes to obtain an instance for
     * @return the instance of Minutes
     */
    public static Minutes minutes(int minutes) {try{__CLR4_4_135y35ylgchoqd8.R.inc(4102);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_135y35ylgchoqd8.R.inc(4103);switch (minutes) {
            case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_135y35ylgchoqd8.R.inc(4104);__CLB4_4_1_bool0=true;}
                __CLR4_4_135y35ylgchoqd8.R.inc(4105);return ZERO;
            case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_135y35ylgchoqd8.R.inc(4106);__CLB4_4_1_bool0=true;}
                __CLR4_4_135y35ylgchoqd8.R.inc(4107);return ONE;
            case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_135y35ylgchoqd8.R.inc(4108);__CLB4_4_1_bool0=true;}
                __CLR4_4_135y35ylgchoqd8.R.inc(4109);return TWO;
            case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_135y35ylgchoqd8.R.inc(4110);__CLB4_4_1_bool0=true;}
                __CLR4_4_135y35ylgchoqd8.R.inc(4111);return THREE;
            case Integer.MAX_VALUE:if (!__CLB4_4_1_bool0) {__CLR4_4_135y35ylgchoqd8.R.inc(4112);__CLB4_4_1_bool0=true;}
                __CLR4_4_135y35ylgchoqd8.R.inc(4113);return MAX_VALUE;
            case Integer.MIN_VALUE:if (!__CLB4_4_1_bool0) {__CLR4_4_135y35ylgchoqd8.R.inc(4114);__CLB4_4_1_bool0=true;}
                __CLR4_4_135y35ylgchoqd8.R.inc(4115);return MIN_VALUE;
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_135y35ylgchoqd8.R.inc(4116);__CLB4_4_1_bool0=true;}
                __CLR4_4_135y35ylgchoqd8.R.inc(4117);return new Minutes(minutes);
        }
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a <code>Minutes</code> representing the number of whole minutes
     * between the two specified datetimes.
     *
     * @param start the start instant, must not be null
     * @param end   the end instant, must not be null
     * @return the period in minutes
     * @throws IllegalArgumentException if the instants are null or invalid
     */
    public static Minutes minutesBetween(ReadableInstant start, ReadableInstant end) {try{__CLR4_4_135y35ylgchoqd8.R.inc(4118);
        __CLR4_4_135y35ylgchoqd8.R.inc(4119);int amount = BaseSingleFieldPeriod.between(start, end, DurationFieldType.minutes());
        __CLR4_4_135y35ylgchoqd8.R.inc(4120);return Minutes.minutes(amount);
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    /**
     * Creates a <code>Minutes</code> representing the number of whole minutes
     * between the two specified partial datetimes.
     * <p>
     * The two partials must contain the same fields, for example you can specify
     * two <code>LocalTime</code> objects.
     *
     * @param start the start partial date, must not be null
     * @param end   the end partial date, must not be null
     * @return the period in minutes
     * @throws IllegalArgumentException if the partials are null or invalid
     */
    public static Minutes minutesBetween(ReadablePartial start, ReadablePartial end) {try{__CLR4_4_135y35ylgchoqd8.R.inc(4121);
        __CLR4_4_135y35ylgchoqd8.R.inc(4122);if ((((start instanceof LocalTime && end instanceof LocalTime)&&(__CLR4_4_135y35ylgchoqd8.R.iget(4123)!=0|true))||(__CLR4_4_135y35ylgchoqd8.R.iget(4124)==0&false))) {{
            __CLR4_4_135y35ylgchoqd8.R.inc(4125);Chronology chrono = DateTimeUtils.getChronology(start.getChronology());
            __CLR4_4_135y35ylgchoqd8.R.inc(4126);int minutes = chrono.minutes().getDifference(
                    ((LocalTime) end).getLocalMillis(), ((LocalTime) start).getLocalMillis());
            __CLR4_4_135y35ylgchoqd8.R.inc(4127);return Minutes.minutes(minutes);
        }
        }__CLR4_4_135y35ylgchoqd8.R.inc(4128);int amount = BaseSingleFieldPeriod.between(start, end, ZERO);
        __CLR4_4_135y35ylgchoqd8.R.inc(4129);return Minutes.minutes(amount);
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    /**
     * Creates a <code>Minutes</code> representing the number of whole minutes
     * in the specified interval.
     *
     * @param interval the interval to extract minutes from, null returns zero
     * @return the period in minutes
     * @throws IllegalArgumentException if the partials are null or invalid
     */
    public static Minutes minutesIn(ReadableInterval interval) {try{__CLR4_4_135y35ylgchoqd8.R.inc(4130);
        __CLR4_4_135y35ylgchoqd8.R.inc(4131);if ((((interval == null)&&(__CLR4_4_135y35ylgchoqd8.R.iget(4132)!=0|true))||(__CLR4_4_135y35ylgchoqd8.R.iget(4133)==0&false))) {{
            __CLR4_4_135y35ylgchoqd8.R.inc(4134);return Minutes.ZERO;
        }
        }__CLR4_4_135y35ylgchoqd8.R.inc(4135);int amount = BaseSingleFieldPeriod.between(interval.getStart(), interval.getEnd(), DurationFieldType.minutes());
        __CLR4_4_135y35ylgchoqd8.R.inc(4136);return Minutes.minutes(amount);
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    /**
     * Creates a new <code>Minutes</code> representing the number of complete
     * standard length minutes in the specified period.
     * <p>
     * This factory method converts all fields from the period to minutes using standardised
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
     * @param period the period to get the number of minutes from, null returns zero
     * @return the period in minutes
     * @throws IllegalArgumentException if the period contains imprecise duration values
     */
    public static Minutes standardMinutesIn(ReadablePeriod period) {try{__CLR4_4_135y35ylgchoqd8.R.inc(4137);
        __CLR4_4_135y35ylgchoqd8.R.inc(4138);int amount = BaseSingleFieldPeriod.standardPeriodIn(period, DateTimeConstants.MILLIS_PER_MINUTE);
        __CLR4_4_135y35ylgchoqd8.R.inc(4139);return Minutes.minutes(amount);
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    /**
     * Creates a new <code>Minutes</code> by parsing a string in the ISO8601 format 'PTnM'.
     * <p>
     * The parse will accept the full ISO syntax of PnYnMnWnDTnHnMnS however only the
     * minutes component may be non-zero. If any other component is non-zero, an exception
     * will be thrown.
     *
     * @param periodStr the period string, null returns zero
     * @return the period in minutes
     * @throws IllegalArgumentException if the string format is invalid
     */
    @FromString
    public static Minutes parseMinutes(String periodStr) {try{__CLR4_4_135y35ylgchoqd8.R.inc(4140);
        __CLR4_4_135y35ylgchoqd8.R.inc(4141);if ((((periodStr == null)&&(__CLR4_4_135y35ylgchoqd8.R.iget(4142)!=0|true))||(__CLR4_4_135y35ylgchoqd8.R.iget(4143)==0&false))) {{
            __CLR4_4_135y35ylgchoqd8.R.inc(4144);return Minutes.ZERO;
        }
        }__CLR4_4_135y35ylgchoqd8.R.inc(4145);Period p = PARSER.parsePeriod(periodStr);
        __CLR4_4_135y35ylgchoqd8.R.inc(4146);return Minutes.minutes(p.getMinutes());
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a new instance representing a number of minutes.
     * You should consider using the factory method {@link #minutes(int)}
     * instead of the constructor.
     *
     * @param minutes the number of minutes to represent
     */
    private Minutes(int minutes) {
        super(minutes);__CLR4_4_135y35ylgchoqd8.R.inc(4148);try{__CLR4_4_135y35ylgchoqd8.R.inc(4147);
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    /**
     * Resolves singletons.
     *
     * @return the singleton instance
     */
    private Object readResolve() {try{__CLR4_4_135y35ylgchoqd8.R.inc(4149);
        __CLR4_4_135y35ylgchoqd8.R.inc(4150);return Minutes.minutes(getValue());
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the duration field type, which is <code>minutes</code>.
     *
     * @return the period type
     */
    public DurationFieldType getFieldType() {try{__CLR4_4_135y35ylgchoqd8.R.inc(4151);
        __CLR4_4_135y35ylgchoqd8.R.inc(4152);return DurationFieldType.minutes();
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    /**
     * Gets the period type, which is <code>minutes</code>.
     *
     * @return the period type
     */
    public PeriodType getPeriodType() {try{__CLR4_4_135y35ylgchoqd8.R.inc(4153);
        __CLR4_4_135y35ylgchoqd8.R.inc(4154);return PeriodType.minutes();
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this period in minutes to a period in weeks assuming a
     * 7 days week, 24 hour day and 60 minute hour.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all weeks are
     * 7 days long, all days are 24 hours long and all hours are 60 minutes long.
     * This is not true when daylight savings is considered and may also not
     * be true for some unusual chronologies. However, it is included
     * as it is a useful operation for many applications and business rules.
     *
     * @return a period representing the number of whole weeks for this number of minutes
     */
    public Weeks toStandardWeeks() {try{__CLR4_4_135y35ylgchoqd8.R.inc(4155);
        __CLR4_4_135y35ylgchoqd8.R.inc(4156);return Weeks.weeks(getValue() / DateTimeConstants.MINUTES_PER_WEEK);
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    /**
     * Converts this period in minutes to a period in days assuming a
     * 24 hour day and 60 minute hour.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all days are
     * 24 hours long and all hours are 60 minutes long.
     * This is not true when daylight savings is considered and may also not
     * be true for some unusual chronologies. However, it is included
     * as it is a useful operation for many applications and business rules.
     *
     * @return a period representing the number of whole days for this number of minutes
     */
    public Days toStandardDays() {try{__CLR4_4_135y35ylgchoqd8.R.inc(4157);
        __CLR4_4_135y35ylgchoqd8.R.inc(4158);return Days.days(getValue() / DateTimeConstants.MINUTES_PER_DAY);
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    /**
     * Converts this period in minutes to a period in hours assuming a
     * 60 minute hour.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all hours are
     * 60 minutes long.
     * This may not be true for some unusual chronologies. However, it is included
     * as it is a useful operation for many applications and business rules.
     *
     * @return a period representing the number of hours for this number of minutes
     */
    public Hours toStandardHours() {try{__CLR4_4_135y35ylgchoqd8.R.inc(4159);
        __CLR4_4_135y35ylgchoqd8.R.inc(4160);return Hours.hours(getValue() / DateTimeConstants.MINUTES_PER_HOUR);
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    /**
     * Converts this period in minutes to a period in seconds assuming a
     * 60 second minute.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all minutes are
     * 60 seconds long.
     * This may not be true for some unusual chronologies. However, it is included
     * as it is a useful operation for many applications and business rules.
     *
     * @return a period representing the number of seconds for this number of minutes
     * @throws ArithmeticException if the number of seconds is too large to be represented
     */
    public Seconds toStandardSeconds() {try{__CLR4_4_135y35ylgchoqd8.R.inc(4161);
        __CLR4_4_135y35ylgchoqd8.R.inc(4162);return Seconds.seconds(FieldUtils.safeMultiply(getValue(), DateTimeConstants.SECONDS_PER_MINUTE));
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this period in minutes to a duration in milliseconds assuming a
     * 60 second minute.
     * <p>
     * This method allows you to convert from a period to a duration.
     * However to achieve this it makes the assumption that all minutes are
     * 60 seconds long. This might not be true for an unusual chronology,
     * for example one that takes leap seconds into account.
     * However, the method is included as it is a useful operation for many
     * applications and business rules.
     *
     * @return a duration equivalent to this number of minutes
     */
    public Duration toStandardDuration() {try{__CLR4_4_135y35ylgchoqd8.R.inc(4163);
        __CLR4_4_135y35ylgchoqd8.R.inc(4164);long minutes = getValue();  // assign to a long
        __CLR4_4_135y35ylgchoqd8.R.inc(4165);return new Duration(minutes * DateTimeConstants.MILLIS_PER_MINUTE);
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the number of minutes that this period represents.
     *
     * @return the number of minutes in the period
     */
    public int getMinutes() {try{__CLR4_4_135y35ylgchoqd8.R.inc(4166);
        __CLR4_4_135y35ylgchoqd8.R.inc(4167);return getValue();
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new instance with the specified number of minutes added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param minutes the amount of minutes to add, may be negative
     * @return the new period plus the specified number of minutes
     * @throws ArithmeticException if the result overflows an int
     */
    public Minutes plus(int minutes) {try{__CLR4_4_135y35ylgchoqd8.R.inc(4168);
        __CLR4_4_135y35ylgchoqd8.R.inc(4169);if ((((minutes == 0)&&(__CLR4_4_135y35ylgchoqd8.R.iget(4170)!=0|true))||(__CLR4_4_135y35ylgchoqd8.R.iget(4171)==0&false))) {{
            __CLR4_4_135y35ylgchoqd8.R.inc(4172);return this;
        }
        }__CLR4_4_135y35ylgchoqd8.R.inc(4173);return Minutes.minutes(FieldUtils.safeAdd(getValue(), minutes));
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    /**
     * Returns a new instance with the specified number of minutes added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param minutes the amount of minutes to add, may be negative, null means zero
     * @return the new period plus the specified number of minutes
     * @throws ArithmeticException if the result overflows an int
     */
    public Minutes plus(Minutes minutes) {try{__CLR4_4_135y35ylgchoqd8.R.inc(4174);
        __CLR4_4_135y35ylgchoqd8.R.inc(4175);if ((((minutes == null)&&(__CLR4_4_135y35ylgchoqd8.R.iget(4176)!=0|true))||(__CLR4_4_135y35ylgchoqd8.R.iget(4177)==0&false))) {{
            __CLR4_4_135y35ylgchoqd8.R.inc(4178);return this;
        }
        }__CLR4_4_135y35ylgchoqd8.R.inc(4179);return plus(minutes.getValue());
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new instance with the specified number of minutes taken away.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param minutes the amount of minutes to take away, may be negative
     * @return the new period minus the specified number of minutes
     * @throws ArithmeticException if the result overflows an int
     */
    public Minutes minus(int minutes) {try{__CLR4_4_135y35ylgchoqd8.R.inc(4180);
        __CLR4_4_135y35ylgchoqd8.R.inc(4181);return plus(FieldUtils.safeNegate(minutes));
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    /**
     * Returns a new instance with the specified number of minutes taken away.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param minutes the amount of minutes to take away, may be negative, null means zero
     * @return the new period minus the specified number of minutes
     * @throws ArithmeticException if the result overflows an int
     */
    public Minutes minus(Minutes minutes) {try{__CLR4_4_135y35ylgchoqd8.R.inc(4182);
        __CLR4_4_135y35ylgchoqd8.R.inc(4183);if ((((minutes == null)&&(__CLR4_4_135y35ylgchoqd8.R.iget(4184)!=0|true))||(__CLR4_4_135y35ylgchoqd8.R.iget(4185)==0&false))) {{
            __CLR4_4_135y35ylgchoqd8.R.inc(4186);return this;
        }
        }__CLR4_4_135y35ylgchoqd8.R.inc(4187);return minus(minutes.getValue());
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new instance with the minutes multiplied by the specified scalar.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param scalar the amount to multiply by, may be negative
     * @return the new period multiplied by the specified scalar
     * @throws ArithmeticException if the result overflows an int
     */
    public Minutes multipliedBy(int scalar) {try{__CLR4_4_135y35ylgchoqd8.R.inc(4188);
        __CLR4_4_135y35ylgchoqd8.R.inc(4189);return Minutes.minutes(FieldUtils.safeMultiply(getValue(), scalar));
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    /**
     * Returns a new instance with the minutes divided by the specified divisor.
     * The calculation uses integer division, thus 3 divided by 2 is 1.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param divisor the amount to divide by, may be negative
     * @return the new period divided by the specified divisor
     * @throws ArithmeticException if the divisor is zero
     */
    public Minutes dividedBy(int divisor) {try{__CLR4_4_135y35ylgchoqd8.R.inc(4190);
        __CLR4_4_135y35ylgchoqd8.R.inc(4191);if ((((divisor == 1)&&(__CLR4_4_135y35ylgchoqd8.R.iget(4192)!=0|true))||(__CLR4_4_135y35ylgchoqd8.R.iget(4193)==0&false))) {{
            __CLR4_4_135y35ylgchoqd8.R.inc(4194);return this;
        }
        }__CLR4_4_135y35ylgchoqd8.R.inc(4195);return Minutes.minutes(getValue() / divisor);
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new instance with the minutes value negated.
     *
     * @return the new period with a negated value
     * @throws ArithmeticException if the result overflows an int
     */
    public Minutes negated() {try{__CLR4_4_135y35ylgchoqd8.R.inc(4196);
        __CLR4_4_135y35ylgchoqd8.R.inc(4197);return Minutes.minutes(FieldUtils.safeNegate(getValue()));
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Is this minutes instance greater than the specified number of minutes.
     *
     * @param other the other period, null means zero
     * @return true if this minutes instance is greater than the specified one
     */
    public boolean isGreaterThan(Minutes other) {try{__CLR4_4_135y35ylgchoqd8.R.inc(4198);
        __CLR4_4_135y35ylgchoqd8.R.inc(4199);if ((((other == null)&&(__CLR4_4_135y35ylgchoqd8.R.iget(4200)!=0|true))||(__CLR4_4_135y35ylgchoqd8.R.iget(4201)==0&false))) {{
            __CLR4_4_135y35ylgchoqd8.R.inc(4202);return getValue() > 0;
        }
        }__CLR4_4_135y35ylgchoqd8.R.inc(4203);return getValue() > other.getValue();
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    /**
     * Is this minutes instance less than the specified number of minutes.
     *
     * @param other the other period, null means zero
     * @return true if this minutes instance is less than the specified one
     */
    public boolean isLessThan(Minutes other) {try{__CLR4_4_135y35ylgchoqd8.R.inc(4204);
        __CLR4_4_135y35ylgchoqd8.R.inc(4205);if ((((other == null)&&(__CLR4_4_135y35ylgchoqd8.R.iget(4206)!=0|true))||(__CLR4_4_135y35ylgchoqd8.R.iget(4207)==0&false))) {{
            __CLR4_4_135y35ylgchoqd8.R.inc(4208);return getValue() < 0;
        }
        }__CLR4_4_135y35ylgchoqd8.R.inc(4209);return getValue() < other.getValue();
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets this instance as a String in the ISO8601 duration format.
     * <p>
     * For example, "PT4M" represents 4 minutes.
     *
     * @return the value as an ISO8601 string
     */
    @ToString
    public String toString() {try{__CLR4_4_135y35ylgchoqd8.R.inc(4210);
        __CLR4_4_135y35ylgchoqd8.R.inc(4211);return "PT" + String.valueOf(getValue()) + "M";
    }finally{__CLR4_4_135y35ylgchoqd8.R.flushNeeded();}}

}
