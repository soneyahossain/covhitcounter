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
 * An immutable time period representing a number of months.
 * <p>
 * <code>Months</code> is an immutable period that can only store months.
 * It does not store years, days or hours for example. As such it is a
 * type-safe way of representing a number of months in an application.
 * <p>
 * The number of months is set in the constructor, and may be queried using
 * <code>getMonths()</code>. Basic mathematical operations are provided -
 * <code>plus()</code>, <code>minus()</code>, <code>multipliedBy()</code> and
 * <code>dividedBy()</code>.
 * <p>
 * <code>Months</code> is thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @since 1.4
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class Months extends BaseSingleFieldPeriod {public static class __CLR4_4_13eg3eglgchoqe2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,4522,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constant representing zero months.
     */
    public static final Months ZERO = new Months(0);
    /**
     * Constant representing one month.
     */
    public static final Months ONE = new Months(1);
    /**
     * Constant representing two months.
     */
    public static final Months TWO = new Months(2);
    /**
     * Constant representing three months.
     */
    public static final Months THREE = new Months(3);
    /**
     * Constant representing four months.
     */
    public static final Months FOUR = new Months(4);
    /**
     * Constant representing five months.
     */
    public static final Months FIVE = new Months(5);
    /**
     * Constant representing six months.
     */
    public static final Months SIX = new Months(6);
    /**
     * Constant representing seven months.
     */
    public static final Months SEVEN = new Months(7);
    /**
     * Constant representing eight months.
     */
    public static final Months EIGHT = new Months(8);
    /**
     * Constant representing nine months.
     */
    public static final Months NINE = new Months(9);
    /**
     * Constant representing ten months.
     */
    public static final Months TEN = new Months(10);
    /**
     * Constant representing eleven months.
     */
    public static final Months ELEVEN = new Months(11);
    /**
     * Constant representing twelve months.
     */
    public static final Months TWELVE = new Months(12);
    /**
     * Constant representing the maximum number of months that can be stored in this object.
     */
    public static final Months MAX_VALUE = new Months(Integer.MAX_VALUE);
    /**
     * Constant representing the minimum number of months that can be stored in this object.
     */
    public static final Months MIN_VALUE = new Months(Integer.MIN_VALUE);

    /**
     * The parser to use for this class.
     */
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.months());
    /**
     * Serialization version.
     */
    private static final long serialVersionUID = 87525275727380867L;

    //-----------------------------------------------------------------------

    /**
     * Obtains an instance of <code>Months</code> that may be cached.
     * <code>Months</code> is immutable, so instances can be cached and shared.
     * This factory method provides access to shared instances.
     *
     * @param months the number of months to obtain an instance for
     * @return the instance of Months
     */
    public static Months months(int months) {try{__CLR4_4_13eg3eglgchoqe2.R.inc(4408);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_13eg3eglgchoqe2.R.inc(4409);switch (months) {
            case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_13eg3eglgchoqe2.R.inc(4410);__CLB4_4_1_bool0=true;}
                __CLR4_4_13eg3eglgchoqe2.R.inc(4411);return ZERO;
            case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_13eg3eglgchoqe2.R.inc(4412);__CLB4_4_1_bool0=true;}
                __CLR4_4_13eg3eglgchoqe2.R.inc(4413);return ONE;
            case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_13eg3eglgchoqe2.R.inc(4414);__CLB4_4_1_bool0=true;}
                __CLR4_4_13eg3eglgchoqe2.R.inc(4415);return TWO;
            case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_13eg3eglgchoqe2.R.inc(4416);__CLB4_4_1_bool0=true;}
                __CLR4_4_13eg3eglgchoqe2.R.inc(4417);return THREE;
            case 4:if (!__CLB4_4_1_bool0) {__CLR4_4_13eg3eglgchoqe2.R.inc(4418);__CLB4_4_1_bool0=true;}
                __CLR4_4_13eg3eglgchoqe2.R.inc(4419);return FOUR;
            case 5:if (!__CLB4_4_1_bool0) {__CLR4_4_13eg3eglgchoqe2.R.inc(4420);__CLB4_4_1_bool0=true;}
                __CLR4_4_13eg3eglgchoqe2.R.inc(4421);return FIVE;
            case 6:if (!__CLB4_4_1_bool0) {__CLR4_4_13eg3eglgchoqe2.R.inc(4422);__CLB4_4_1_bool0=true;}
                __CLR4_4_13eg3eglgchoqe2.R.inc(4423);return SIX;
            case 7:if (!__CLB4_4_1_bool0) {__CLR4_4_13eg3eglgchoqe2.R.inc(4424);__CLB4_4_1_bool0=true;}
                __CLR4_4_13eg3eglgchoqe2.R.inc(4425);return SEVEN;
            case 8:if (!__CLB4_4_1_bool0) {__CLR4_4_13eg3eglgchoqe2.R.inc(4426);__CLB4_4_1_bool0=true;}
                __CLR4_4_13eg3eglgchoqe2.R.inc(4427);return EIGHT;
            case 9:if (!__CLB4_4_1_bool0) {__CLR4_4_13eg3eglgchoqe2.R.inc(4428);__CLB4_4_1_bool0=true;}
                __CLR4_4_13eg3eglgchoqe2.R.inc(4429);return NINE;
            case 10:if (!__CLB4_4_1_bool0) {__CLR4_4_13eg3eglgchoqe2.R.inc(4430);__CLB4_4_1_bool0=true;}
                __CLR4_4_13eg3eglgchoqe2.R.inc(4431);return TEN;
            case 11:if (!__CLB4_4_1_bool0) {__CLR4_4_13eg3eglgchoqe2.R.inc(4432);__CLB4_4_1_bool0=true;}
                __CLR4_4_13eg3eglgchoqe2.R.inc(4433);return ELEVEN;
            case 12:if (!__CLB4_4_1_bool0) {__CLR4_4_13eg3eglgchoqe2.R.inc(4434);__CLB4_4_1_bool0=true;}
                __CLR4_4_13eg3eglgchoqe2.R.inc(4435);return TWELVE;
            case Integer.MAX_VALUE:if (!__CLB4_4_1_bool0) {__CLR4_4_13eg3eglgchoqe2.R.inc(4436);__CLB4_4_1_bool0=true;}
                __CLR4_4_13eg3eglgchoqe2.R.inc(4437);return MAX_VALUE;
            case Integer.MIN_VALUE:if (!__CLB4_4_1_bool0) {__CLR4_4_13eg3eglgchoqe2.R.inc(4438);__CLB4_4_1_bool0=true;}
                __CLR4_4_13eg3eglgchoqe2.R.inc(4439);return MIN_VALUE;
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_13eg3eglgchoqe2.R.inc(4440);__CLB4_4_1_bool0=true;}
                __CLR4_4_13eg3eglgchoqe2.R.inc(4441);return new Months(months);
        }
    }finally{__CLR4_4_13eg3eglgchoqe2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a <code>Months</code> representing the number of whole months
     * between the two specified datetimes. This method correctly handles
     * any daylight savings time changes that may occur during the interval.
     * <p>
     * This method calculates by adding months to the start date until the result
     * is past the end date. As such, a period from the end of a "long" month to
     * the end of a "short" month is counted as a whole month.
     *
     * @param start the start instant, must not be null
     * @param end   the end instant, must not be null
     * @return the period in months
     * @throws IllegalArgumentException if the instants are null or invalid
     */
    public static Months monthsBetween(ReadableInstant start, ReadableInstant end) {try{__CLR4_4_13eg3eglgchoqe2.R.inc(4442);
        __CLR4_4_13eg3eglgchoqe2.R.inc(4443);int amount = BaseSingleFieldPeriod.between(start, end, DurationFieldType.months());
        __CLR4_4_13eg3eglgchoqe2.R.inc(4444);return Months.months(amount);
    }finally{__CLR4_4_13eg3eglgchoqe2.R.flushNeeded();}}

    /**
     * Creates a <code>Months</code> representing the number of whole months
     * between the two specified partial datetimes.
     * <p>
     * The two partials must contain the same fields, for example you can specify
     * two <code>LocalDate</code> objects.
     * <p>
     * This method calculates by adding months to the start date until the result
     * is past the end date. As such, a period from the end of a "long" month to
     * the end of a "short" month is counted as a whole month.
     *
     * @param start the start partial date, must not be null
     * @param end   the end partial date, must not be null
     * @return the period in months
     * @throws IllegalArgumentException if the partials are null or invalid
     */
    public static Months monthsBetween(ReadablePartial start, ReadablePartial end) {try{__CLR4_4_13eg3eglgchoqe2.R.inc(4445);
        __CLR4_4_13eg3eglgchoqe2.R.inc(4446);if ((((start instanceof LocalDate && end instanceof LocalDate)&&(__CLR4_4_13eg3eglgchoqe2.R.iget(4447)!=0|true))||(__CLR4_4_13eg3eglgchoqe2.R.iget(4448)==0&false))) {{
            __CLR4_4_13eg3eglgchoqe2.R.inc(4449);Chronology chrono = DateTimeUtils.getChronology(start.getChronology());
            __CLR4_4_13eg3eglgchoqe2.R.inc(4450);int months = chrono.months().getDifference(
                    ((LocalDate) end).getLocalMillis(), ((LocalDate) start).getLocalMillis());
            __CLR4_4_13eg3eglgchoqe2.R.inc(4451);return Months.months(months);
        }
        }__CLR4_4_13eg3eglgchoqe2.R.inc(4452);int amount = BaseSingleFieldPeriod.between(start, end, ZERO);
        __CLR4_4_13eg3eglgchoqe2.R.inc(4453);return Months.months(amount);
    }finally{__CLR4_4_13eg3eglgchoqe2.R.flushNeeded();}}

    /**
     * Creates a <code>Months</code> representing the number of whole months
     * in the specified interval. This method correctly handles any daylight
     * savings time changes that may occur during the interval.
     *
     * @param interval the interval to extract months from, null returns zero
     * @return the period in months
     * @throws IllegalArgumentException if the partials are null or invalid
     */
    public static Months monthsIn(ReadableInterval interval) {try{__CLR4_4_13eg3eglgchoqe2.R.inc(4454);
        __CLR4_4_13eg3eglgchoqe2.R.inc(4455);if ((((interval == null)&&(__CLR4_4_13eg3eglgchoqe2.R.iget(4456)!=0|true))||(__CLR4_4_13eg3eglgchoqe2.R.iget(4457)==0&false))) {{
            __CLR4_4_13eg3eglgchoqe2.R.inc(4458);return Months.ZERO;
        }
        }__CLR4_4_13eg3eglgchoqe2.R.inc(4459);int amount = BaseSingleFieldPeriod.between(interval.getStart(), interval.getEnd(), DurationFieldType.months());
        __CLR4_4_13eg3eglgchoqe2.R.inc(4460);return Months.months(amount);
    }finally{__CLR4_4_13eg3eglgchoqe2.R.flushNeeded();}}

    /**
     * Creates a new <code>Months</code> by parsing a string in the ISO8601 format 'PnM'.
     * <p>
     * The parse will accept the full ISO syntax of PnYnMnWnDTnHnMnS however only the
     * months component may be non-zero. If any other component is non-zero, an exception
     * will be thrown.
     *
     * @param periodStr the period string, null returns zero
     * @return the period in months
     * @throws IllegalArgumentException if the string format is invalid
     */
    @FromString
    public static Months parseMonths(String periodStr) {try{__CLR4_4_13eg3eglgchoqe2.R.inc(4461);
        __CLR4_4_13eg3eglgchoqe2.R.inc(4462);if ((((periodStr == null)&&(__CLR4_4_13eg3eglgchoqe2.R.iget(4463)!=0|true))||(__CLR4_4_13eg3eglgchoqe2.R.iget(4464)==0&false))) {{
            __CLR4_4_13eg3eglgchoqe2.R.inc(4465);return Months.ZERO;
        }
        }__CLR4_4_13eg3eglgchoqe2.R.inc(4466);Period p = PARSER.parsePeriod(periodStr);
        __CLR4_4_13eg3eglgchoqe2.R.inc(4467);return Months.months(p.getMonths());
    }finally{__CLR4_4_13eg3eglgchoqe2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a new instance representing a number of months.
     * You should consider using the factory method {@link #months(int)}
     * instead of the constructor.
     *
     * @param months the number of months to represent
     */
    private Months(int months) {
        super(months);__CLR4_4_13eg3eglgchoqe2.R.inc(4469);try{__CLR4_4_13eg3eglgchoqe2.R.inc(4468);
    }finally{__CLR4_4_13eg3eglgchoqe2.R.flushNeeded();}}

    /**
     * Resolves singletons.
     *
     * @return the singleton instance
     */
    private Object readResolve() {try{__CLR4_4_13eg3eglgchoqe2.R.inc(4470);
        __CLR4_4_13eg3eglgchoqe2.R.inc(4471);return Months.months(getValue());
    }finally{__CLR4_4_13eg3eglgchoqe2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the duration field type, which is <code>months</code>.
     *
     * @return the period type
     */
    public DurationFieldType getFieldType() {try{__CLR4_4_13eg3eglgchoqe2.R.inc(4472);
        __CLR4_4_13eg3eglgchoqe2.R.inc(4473);return DurationFieldType.months();
    }finally{__CLR4_4_13eg3eglgchoqe2.R.flushNeeded();}}

    /**
     * Gets the period type, which is <code>months</code>.
     *
     * @return the period type
     */
    public PeriodType getPeriodType() {try{__CLR4_4_13eg3eglgchoqe2.R.inc(4474);
        __CLR4_4_13eg3eglgchoqe2.R.inc(4475);return PeriodType.months();
    }finally{__CLR4_4_13eg3eglgchoqe2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the number of months that this period represents.
     *
     * @return the number of months in the period
     */
    public int getMonths() {try{__CLR4_4_13eg3eglgchoqe2.R.inc(4476);
        __CLR4_4_13eg3eglgchoqe2.R.inc(4477);return getValue();
    }finally{__CLR4_4_13eg3eglgchoqe2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new instance with the specified number of months added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param months the amount of months to add, may be negative
     * @return the new period plus the specified number of months
     * @throws ArithmeticException if the result overflows an int
     */
    public Months plus(int months) {try{__CLR4_4_13eg3eglgchoqe2.R.inc(4478);
        __CLR4_4_13eg3eglgchoqe2.R.inc(4479);if ((((months == 0)&&(__CLR4_4_13eg3eglgchoqe2.R.iget(4480)!=0|true))||(__CLR4_4_13eg3eglgchoqe2.R.iget(4481)==0&false))) {{
            __CLR4_4_13eg3eglgchoqe2.R.inc(4482);return this;
        }
        }__CLR4_4_13eg3eglgchoqe2.R.inc(4483);return Months.months(FieldUtils.safeAdd(getValue(), months));
    }finally{__CLR4_4_13eg3eglgchoqe2.R.flushNeeded();}}

    /**
     * Returns a new instance with the specified number of months added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param months the amount of months to add, may be negative, null means zero
     * @return the new period plus the specified number of months
     * @throws ArithmeticException if the result overflows an int
     */
    public Months plus(Months months) {try{__CLR4_4_13eg3eglgchoqe2.R.inc(4484);
        __CLR4_4_13eg3eglgchoqe2.R.inc(4485);if ((((months == null)&&(__CLR4_4_13eg3eglgchoqe2.R.iget(4486)!=0|true))||(__CLR4_4_13eg3eglgchoqe2.R.iget(4487)==0&false))) {{
            __CLR4_4_13eg3eglgchoqe2.R.inc(4488);return this;
        }
        }__CLR4_4_13eg3eglgchoqe2.R.inc(4489);return plus(months.getValue());
    }finally{__CLR4_4_13eg3eglgchoqe2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new instance with the specified number of months taken away.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param months the amount of months to take away, may be negative
     * @return the new period minus the specified number of months
     * @throws ArithmeticException if the result overflows an int
     */
    public Months minus(int months) {try{__CLR4_4_13eg3eglgchoqe2.R.inc(4490);
        __CLR4_4_13eg3eglgchoqe2.R.inc(4491);return plus(FieldUtils.safeNegate(months));
    }finally{__CLR4_4_13eg3eglgchoqe2.R.flushNeeded();}}

    /**
     * Returns a new instance with the specified number of months taken away.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param months the amount of months to take away, may be negative, null means zero
     * @return the new period minus the specified number of months
     * @throws ArithmeticException if the result overflows an int
     */
    public Months minus(Months months) {try{__CLR4_4_13eg3eglgchoqe2.R.inc(4492);
        __CLR4_4_13eg3eglgchoqe2.R.inc(4493);if ((((months == null)&&(__CLR4_4_13eg3eglgchoqe2.R.iget(4494)!=0|true))||(__CLR4_4_13eg3eglgchoqe2.R.iget(4495)==0&false))) {{
            __CLR4_4_13eg3eglgchoqe2.R.inc(4496);return this;
        }
        }__CLR4_4_13eg3eglgchoqe2.R.inc(4497);return minus(months.getValue());
    }finally{__CLR4_4_13eg3eglgchoqe2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new instance with the months multiplied by the specified scalar.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param scalar the amount to multiply by, may be negative
     * @return the new period multiplied by the specified scalar
     * @throws ArithmeticException if the result overflows an int
     */
    public Months multipliedBy(int scalar) {try{__CLR4_4_13eg3eglgchoqe2.R.inc(4498);
        __CLR4_4_13eg3eglgchoqe2.R.inc(4499);return Months.months(FieldUtils.safeMultiply(getValue(), scalar));
    }finally{__CLR4_4_13eg3eglgchoqe2.R.flushNeeded();}}

    /**
     * Returns a new instance with the months divided by the specified divisor.
     * The calculation uses integer division, thus 3 divided by 2 is 1.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param divisor the amount to divide by, may be negative
     * @return the new period divided by the specified divisor
     * @throws ArithmeticException if the divisor is zero
     */
    public Months dividedBy(int divisor) {try{__CLR4_4_13eg3eglgchoqe2.R.inc(4500);
        __CLR4_4_13eg3eglgchoqe2.R.inc(4501);if ((((divisor == 1)&&(__CLR4_4_13eg3eglgchoqe2.R.iget(4502)!=0|true))||(__CLR4_4_13eg3eglgchoqe2.R.iget(4503)==0&false))) {{
            __CLR4_4_13eg3eglgchoqe2.R.inc(4504);return this;
        }
        }__CLR4_4_13eg3eglgchoqe2.R.inc(4505);return Months.months(getValue() / divisor);
    }finally{__CLR4_4_13eg3eglgchoqe2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new instance with the months value negated.
     *
     * @return the new period with a negated value
     * @throws ArithmeticException if the result overflows an int
     */
    public Months negated() {try{__CLR4_4_13eg3eglgchoqe2.R.inc(4506);
        __CLR4_4_13eg3eglgchoqe2.R.inc(4507);return Months.months(FieldUtils.safeNegate(getValue()));
    }finally{__CLR4_4_13eg3eglgchoqe2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Is this months instance greater than the specified number of months.
     *
     * @param other the other period, null means zero
     * @return true if this months instance is greater than the specified one
     */
    public boolean isGreaterThan(Months other) {try{__CLR4_4_13eg3eglgchoqe2.R.inc(4508);
        __CLR4_4_13eg3eglgchoqe2.R.inc(4509);if ((((other == null)&&(__CLR4_4_13eg3eglgchoqe2.R.iget(4510)!=0|true))||(__CLR4_4_13eg3eglgchoqe2.R.iget(4511)==0&false))) {{
            __CLR4_4_13eg3eglgchoqe2.R.inc(4512);return getValue() > 0;
        }
        }__CLR4_4_13eg3eglgchoqe2.R.inc(4513);return getValue() > other.getValue();
    }finally{__CLR4_4_13eg3eglgchoqe2.R.flushNeeded();}}

    /**
     * Is this months instance less than the specified number of months.
     *
     * @param other the other period, null means zero
     * @return true if this months instance is less than the specified one
     */
    public boolean isLessThan(Months other) {try{__CLR4_4_13eg3eglgchoqe2.R.inc(4514);
        __CLR4_4_13eg3eglgchoqe2.R.inc(4515);if ((((other == null)&&(__CLR4_4_13eg3eglgchoqe2.R.iget(4516)!=0|true))||(__CLR4_4_13eg3eglgchoqe2.R.iget(4517)==0&false))) {{
            __CLR4_4_13eg3eglgchoqe2.R.inc(4518);return getValue() < 0;
        }
        }__CLR4_4_13eg3eglgchoqe2.R.inc(4519);return getValue() < other.getValue();
    }finally{__CLR4_4_13eg3eglgchoqe2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets this instance as a String in the ISO8601 duration format.
     * <p>
     * For example, "P4M" represents 4 months.
     *
     * @return the value as an ISO8601 string
     */
    @ToString
    public String toString() {try{__CLR4_4_13eg3eglgchoqe2.R.inc(4520);
        __CLR4_4_13eg3eglgchoqe2.R.inc(4521);return "P" + String.valueOf(getValue()) + "M";
    }finally{__CLR4_4_13eg3eglgchoqe2.R.flushNeeded();}}

}
