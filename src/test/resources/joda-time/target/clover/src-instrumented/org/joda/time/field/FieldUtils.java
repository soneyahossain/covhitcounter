/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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
package org.joda.time.field;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/**
 * General utilities that don't fit elsewhere.
 * <p>
 * FieldUtils is thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @since 1.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class FieldUtils {public static class __CLR4_4_1az1az1lgchoqy1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,14361,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Restricted constructor.
     */
    private FieldUtils() {
        super();__CLR4_4_1az1az1lgchoqy1.R.inc(14222);try{__CLR4_4_1az1az1lgchoqy1.R.inc(14221);
    }finally{__CLR4_4_1az1az1lgchoqy1.R.flushNeeded();}}

    //------------------------------------------------------------------------

    /**
     * Negates the input throwing an exception if it can't negate it.
     *
     * @param value the value to negate
     * @return the negated value
     * @throws ArithmeticException if the value is Integer.MIN_VALUE
     * @since 1.1
     */
    public static int safeNegate(int value) {try{__CLR4_4_1az1az1lgchoqy1.R.inc(14223);
        __CLR4_4_1az1az1lgchoqy1.R.inc(14224);if ((((value == Integer.MIN_VALUE)&&(__CLR4_4_1az1az1lgchoqy1.R.iget(14225)!=0|true))||(__CLR4_4_1az1az1lgchoqy1.R.iget(14226)==0&false))) {{
            __CLR4_4_1az1az1lgchoqy1.R.inc(14227);throw new ArithmeticException("Integer.MIN_VALUE cannot be negated");
        }
        }__CLR4_4_1az1az1lgchoqy1.R.inc(14228);return -value;
    }finally{__CLR4_4_1az1az1lgchoqy1.R.flushNeeded();}}

    /**
     * Add two values throwing an exception if overflow occurs.
     *
     * @param val1 the first value
     * @param val2 the second value
     * @return the new total
     * @throws ArithmeticException if the value is too big or too small
     */
    public static int safeAdd(int val1, int val2) {try{__CLR4_4_1az1az1lgchoqy1.R.inc(14229);
        __CLR4_4_1az1az1lgchoqy1.R.inc(14230);int sum = val1 + val2;
        // If there is a sign change, but the two values have the same sign...
        __CLR4_4_1az1az1lgchoqy1.R.inc(14231);if (((((val1 ^ sum) < 0 && (val1 ^ val2) >= 0)&&(__CLR4_4_1az1az1lgchoqy1.R.iget(14232)!=0|true))||(__CLR4_4_1az1az1lgchoqy1.R.iget(14233)==0&false))) {{
            __CLR4_4_1az1az1lgchoqy1.R.inc(14234);throw new ArithmeticException
                    ("The calculation caused an overflow: " + val1 + " + " + val2);
        }
        }__CLR4_4_1az1az1lgchoqy1.R.inc(14235);return sum;
    }finally{__CLR4_4_1az1az1lgchoqy1.R.flushNeeded();}}

    /**
     * Add two values throwing an exception if overflow occurs.
     *
     * @param val1 the first value
     * @param val2 the second value
     * @return the new total
     * @throws ArithmeticException if the value is too big or too small
     */
    public static long safeAdd(long val1, long val2) {try{__CLR4_4_1az1az1lgchoqy1.R.inc(14236);
        __CLR4_4_1az1az1lgchoqy1.R.inc(14237);long sum = val1 + val2;
        // If there is a sign change, but the two values have the same sign...
        __CLR4_4_1az1az1lgchoqy1.R.inc(14238);if (((((val1 ^ sum) < 0 && (val1 ^ val2) >= 0)&&(__CLR4_4_1az1az1lgchoqy1.R.iget(14239)!=0|true))||(__CLR4_4_1az1az1lgchoqy1.R.iget(14240)==0&false))) {{
            __CLR4_4_1az1az1lgchoqy1.R.inc(14241);throw new ArithmeticException
                    ("The calculation caused an overflow: " + val1 + " + " + val2);
        }
        }__CLR4_4_1az1az1lgchoqy1.R.inc(14242);return sum;
    }finally{__CLR4_4_1az1az1lgchoqy1.R.flushNeeded();}}

    /**
     * Subtracts two values throwing an exception if overflow occurs.
     *
     * @param val1 the first value, to be taken away from
     * @param val2 the second value, the amount to take away
     * @return the new total
     * @throws ArithmeticException if the value is too big or too small
     */
    public static long safeSubtract(long val1, long val2) {try{__CLR4_4_1az1az1lgchoqy1.R.inc(14243);
        __CLR4_4_1az1az1lgchoqy1.R.inc(14244);long diff = val1 - val2;
        // If there is a sign change, but the two values have different signs...
        __CLR4_4_1az1az1lgchoqy1.R.inc(14245);if (((((val1 ^ diff) < 0 && (val1 ^ val2) < 0)&&(__CLR4_4_1az1az1lgchoqy1.R.iget(14246)!=0|true))||(__CLR4_4_1az1az1lgchoqy1.R.iget(14247)==0&false))) {{
            __CLR4_4_1az1az1lgchoqy1.R.inc(14248);throw new ArithmeticException
                    ("The calculation caused an overflow: " + val1 + " - " + val2);
        }
        }__CLR4_4_1az1az1lgchoqy1.R.inc(14249);return diff;
    }finally{__CLR4_4_1az1az1lgchoqy1.R.flushNeeded();}}

    /**
     * Multiply two values throwing an exception if overflow occurs.
     *
     * @param val1 the first value
     * @param val2 the second value
     * @return the new total
     * @throws ArithmeticException if the value is too big or too small
     * @since 1.2
     */
    public static int safeMultiply(int val1, int val2) {try{__CLR4_4_1az1az1lgchoqy1.R.inc(14250);
        __CLR4_4_1az1az1lgchoqy1.R.inc(14251);long total = (long) val1 * (long) val2;
        __CLR4_4_1az1az1lgchoqy1.R.inc(14252);if ((((total < Integer.MIN_VALUE || total > Integer.MAX_VALUE)&&(__CLR4_4_1az1az1lgchoqy1.R.iget(14253)!=0|true))||(__CLR4_4_1az1az1lgchoqy1.R.iget(14254)==0&false))) {{
            __CLR4_4_1az1az1lgchoqy1.R.inc(14255);throw new ArithmeticException("Multiplication overflows an int: " + val1 + " * " + val2);
        }
        }__CLR4_4_1az1az1lgchoqy1.R.inc(14256);return (int) total;
    }finally{__CLR4_4_1az1az1lgchoqy1.R.flushNeeded();}}

    /**
     * Multiply two values throwing an exception if overflow occurs.
     *
     * @param val1 the first value
     * @param val2 the second value
     * @return the new total
     * @throws ArithmeticException if the value is too big or too small
     * @since 1.2
     */
    public static long safeMultiply(long val1, int val2) {try{__CLR4_4_1az1az1lgchoqy1.R.inc(14257);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_1az1az1lgchoqy1.R.inc(14258);switch (val2) {
            case -1:if (!__CLB4_4_1_bool0) {__CLR4_4_1az1az1lgchoqy1.R.inc(14259);__CLB4_4_1_bool0=true;}
                __CLR4_4_1az1az1lgchoqy1.R.inc(14260);if ((((val1 == Long.MIN_VALUE)&&(__CLR4_4_1az1az1lgchoqy1.R.iget(14261)!=0|true))||(__CLR4_4_1az1az1lgchoqy1.R.iget(14262)==0&false))) {{
                    __CLR4_4_1az1az1lgchoqy1.R.inc(14263);throw new ArithmeticException("Multiplication overflows a long: " + val1 + " * " + val2);
                }
                }__CLR4_4_1az1az1lgchoqy1.R.inc(14264);return -val1;
            case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_1az1az1lgchoqy1.R.inc(14265);__CLB4_4_1_bool0=true;}
                __CLR4_4_1az1az1lgchoqy1.R.inc(14266);return 0L;
            case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_1az1az1lgchoqy1.R.inc(14267);__CLB4_4_1_bool0=true;}
                __CLR4_4_1az1az1lgchoqy1.R.inc(14268);return val1;
        }
        __CLR4_4_1az1az1lgchoqy1.R.inc(14269);long total = val1 * val2;
        __CLR4_4_1az1az1lgchoqy1.R.inc(14270);if ((((total / val2 != val1)&&(__CLR4_4_1az1az1lgchoqy1.R.iget(14271)!=0|true))||(__CLR4_4_1az1az1lgchoqy1.R.iget(14272)==0&false))) {{
            __CLR4_4_1az1az1lgchoqy1.R.inc(14273);throw new ArithmeticException("Multiplication overflows a long: " + val1 + " * " + val2);
        }
        }__CLR4_4_1az1az1lgchoqy1.R.inc(14274);return total;
    }finally{__CLR4_4_1az1az1lgchoqy1.R.flushNeeded();}}

    /**
     * Multiply two values throwing an exception if overflow occurs.
     *
     * @param val1 the first value
     * @param val2 the second value
     * @return the new total
     * @throws ArithmeticException if the value is too big or too small
     */
    public static long safeMultiply(long val1, long val2) {try{__CLR4_4_1az1az1lgchoqy1.R.inc(14275);
        __CLR4_4_1az1az1lgchoqy1.R.inc(14276);if ((((val2 == 1)&&(__CLR4_4_1az1az1lgchoqy1.R.iget(14277)!=0|true))||(__CLR4_4_1az1az1lgchoqy1.R.iget(14278)==0&false))) {{
            __CLR4_4_1az1az1lgchoqy1.R.inc(14279);return val1;
        }
        }__CLR4_4_1az1az1lgchoqy1.R.inc(14280);if ((((val1 == 1)&&(__CLR4_4_1az1az1lgchoqy1.R.iget(14281)!=0|true))||(__CLR4_4_1az1az1lgchoqy1.R.iget(14282)==0&false))) {{
            __CLR4_4_1az1az1lgchoqy1.R.inc(14283);return val2;
        }
        }__CLR4_4_1az1az1lgchoqy1.R.inc(14284);if ((((val1 == 0 || val2 == 0)&&(__CLR4_4_1az1az1lgchoqy1.R.iget(14285)!=0|true))||(__CLR4_4_1az1az1lgchoqy1.R.iget(14286)==0&false))) {{
            __CLR4_4_1az1az1lgchoqy1.R.inc(14287);return 0;
        }
        }__CLR4_4_1az1az1lgchoqy1.R.inc(14288);long total = val1 * val2;
        __CLR4_4_1az1az1lgchoqy1.R.inc(14289);if ((((total / val2 != val1 || val1 == Long.MIN_VALUE && val2 == -1 || val2 == Long.MIN_VALUE && val1 == -1)&&(__CLR4_4_1az1az1lgchoqy1.R.iget(14290)!=0|true))||(__CLR4_4_1az1az1lgchoqy1.R.iget(14291)==0&false))) {{
            __CLR4_4_1az1az1lgchoqy1.R.inc(14292);throw new ArithmeticException("Multiplication overflows a long: " + val1 + " * " + val2);
        }
        }__CLR4_4_1az1az1lgchoqy1.R.inc(14293);return total;
    }finally{__CLR4_4_1az1az1lgchoqy1.R.flushNeeded();}}

    /**
     * Divides the dividend by the divisor throwing an exception if
     * overflow occurs or the divisor is zero.
     *
     * @param dividend the dividend
     * @param divisor  the divisor
     * @return the new total
     * @throws ArithmeticException if the operation overflows or the divisor is zero
     */
    public static long safeDivide(long dividend, long divisor) {try{__CLR4_4_1az1az1lgchoqy1.R.inc(14294);
        __CLR4_4_1az1az1lgchoqy1.R.inc(14295);if ((((dividend == Long.MIN_VALUE && divisor == -1L)&&(__CLR4_4_1az1az1lgchoqy1.R.iget(14296)!=0|true))||(__CLR4_4_1az1az1lgchoqy1.R.iget(14297)==0&false))) {{
            __CLR4_4_1az1az1lgchoqy1.R.inc(14298);throw new ArithmeticException("Multiplication overflows a long: " + dividend + " / " + divisor);
        }
        }__CLR4_4_1az1az1lgchoqy1.R.inc(14299);return dividend / divisor;
    }finally{__CLR4_4_1az1az1lgchoqy1.R.flushNeeded();}}

    /**
     * Divides the dividend by divisor. Rounding of result occurs
     * as per the roundingMode.
     *
     * @param dividend     the dividend
     * @param divisor      the divisor
     * @param roundingMode the desired rounding mode
     * @return the division result as per the specified rounding mode
     * @throws ArithmeticException if the operation overflows or the divisor is zero
     */
    public static long safeDivide(long dividend, long divisor, RoundingMode roundingMode) {try{__CLR4_4_1az1az1lgchoqy1.R.inc(14300);
        __CLR4_4_1az1az1lgchoqy1.R.inc(14301);if ((((dividend == Long.MIN_VALUE && divisor == -1L)&&(__CLR4_4_1az1az1lgchoqy1.R.iget(14302)!=0|true))||(__CLR4_4_1az1az1lgchoqy1.R.iget(14303)==0&false))) {{
            __CLR4_4_1az1az1lgchoqy1.R.inc(14304);throw new ArithmeticException("Multiplication overflows a long: " + dividend + " / " + divisor);
        }

        }__CLR4_4_1az1az1lgchoqy1.R.inc(14305);BigDecimal dividendBigDecimal = new BigDecimal(dividend);
        __CLR4_4_1az1az1lgchoqy1.R.inc(14306);BigDecimal divisorBigDecimal = new BigDecimal(divisor);
        __CLR4_4_1az1az1lgchoqy1.R.inc(14307);return dividendBigDecimal.divide(divisorBigDecimal, roundingMode).longValue();
    }finally{__CLR4_4_1az1az1lgchoqy1.R.flushNeeded();}}

    /**
     * Casts to an int throwing an exception if overflow occurs.
     *
     * @param value the value
     * @return the value as an int
     * @throws ArithmeticException if the value is too big or too small
     */
    public static int safeToInt(long value) {try{__CLR4_4_1az1az1lgchoqy1.R.inc(14308);
        __CLR4_4_1az1az1lgchoqy1.R.inc(14309);if ((((Integer.MIN_VALUE <= value && value <= Integer.MAX_VALUE)&&(__CLR4_4_1az1az1lgchoqy1.R.iget(14310)!=0|true))||(__CLR4_4_1az1az1lgchoqy1.R.iget(14311)==0&false))) {{
            __CLR4_4_1az1az1lgchoqy1.R.inc(14312);return (int) value;
        }
        }__CLR4_4_1az1az1lgchoqy1.R.inc(14313);throw new ArithmeticException("Value cannot fit in an int: " + value);
    }finally{__CLR4_4_1az1az1lgchoqy1.R.flushNeeded();}}

    /**
     * Multiply two values to return an int throwing an exception if overflow occurs.
     *
     * @param val1 the first value
     * @param val2 the second value
     * @return the new total
     * @throws ArithmeticException if the value is too big or too small
     */
    public static int safeMultiplyToInt(long val1, long val2) {try{__CLR4_4_1az1az1lgchoqy1.R.inc(14314);
        __CLR4_4_1az1az1lgchoqy1.R.inc(14315);long val = FieldUtils.safeMultiply(val1, val2);
        __CLR4_4_1az1az1lgchoqy1.R.inc(14316);return FieldUtils.safeToInt(val);
    }finally{__CLR4_4_1az1az1lgchoqy1.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Verify that input values are within specified bounds.
     *
     * @param value      the value to check
     * @param lowerBound the lower bound allowed for value
     * @param upperBound the upper bound allowed for value
     * @throws IllegalFieldValueException if value is not in the specified bounds
     */
    public static void verifyValueBounds(DateTimeField field,
                                         int value, int lowerBound, int upperBound) {try{__CLR4_4_1az1az1lgchoqy1.R.inc(14317);
        __CLR4_4_1az1az1lgchoqy1.R.inc(14318);if (((((value < lowerBound) || (value > upperBound))&&(__CLR4_4_1az1az1lgchoqy1.R.iget(14319)!=0|true))||(__CLR4_4_1az1az1lgchoqy1.R.iget(14320)==0&false))) {{
            __CLR4_4_1az1az1lgchoqy1.R.inc(14321);throw new IllegalFieldValueException
                    (field.getType(), Integer.valueOf(value),
                            Integer.valueOf(lowerBound), Integer.valueOf(upperBound));
        }
    }}finally{__CLR4_4_1az1az1lgchoqy1.R.flushNeeded();}}

    /**
     * Verify that input values are within specified bounds.
     *
     * @param value      the value to check
     * @param lowerBound the lower bound allowed for value
     * @param upperBound the upper bound allowed for value
     * @throws IllegalFieldValueException if value is not in the specified bounds
     * @since 1.1
     */
    public static void verifyValueBounds(DateTimeFieldType fieldType,
                                         int value, int lowerBound, int upperBound) {try{__CLR4_4_1az1az1lgchoqy1.R.inc(14322);
        __CLR4_4_1az1az1lgchoqy1.R.inc(14323);if (((((value < lowerBound) || (value > upperBound))&&(__CLR4_4_1az1az1lgchoqy1.R.iget(14324)!=0|true))||(__CLR4_4_1az1az1lgchoqy1.R.iget(14325)==0&false))) {{
            __CLR4_4_1az1az1lgchoqy1.R.inc(14326);throw new IllegalFieldValueException
                    (fieldType, Integer.valueOf(value),
                            Integer.valueOf(lowerBound), Integer.valueOf(upperBound));
        }
    }}finally{__CLR4_4_1az1az1lgchoqy1.R.flushNeeded();}}

    /**
     * Verify that input values are within specified bounds.
     *
     * @param value      the value to check
     * @param lowerBound the lower bound allowed for value
     * @param upperBound the upper bound allowed for value
     * @throws IllegalFieldValueException if value is not in the specified bounds
     */
    public static void verifyValueBounds(String fieldName,
                                         int value, int lowerBound, int upperBound) {try{__CLR4_4_1az1az1lgchoqy1.R.inc(14327);
        __CLR4_4_1az1az1lgchoqy1.R.inc(14328);if (((((value < lowerBound) || (value > upperBound))&&(__CLR4_4_1az1az1lgchoqy1.R.iget(14329)!=0|true))||(__CLR4_4_1az1az1lgchoqy1.R.iget(14330)==0&false))) {{
            __CLR4_4_1az1az1lgchoqy1.R.inc(14331);throw new IllegalFieldValueException
                    (fieldName, Integer.valueOf(value),
                            Integer.valueOf(lowerBound), Integer.valueOf(upperBound));
        }
    }}finally{__CLR4_4_1az1az1lgchoqy1.R.flushNeeded();}}

    /**
     * Utility method used by addWrapField implementations to ensure the new
     * value lies within the field's legal value range.
     *
     * @param currentValue the current value of the data, which may lie outside
     *                     the wrapped value range
     * @param wrapValue    the value to add to current value before
     *                     wrapping.  This may be negative.
     * @param minValue     the wrap range minimum value.
     * @param maxValue     the wrap range maximum value.  This must be
     *                     greater than minValue (checked by the method).
     * @return the wrapped value
     * @throws IllegalArgumentException if minValue is greater
     *                                  than or equal to maxValue
     */
    public static int getWrappedValue(int currentValue, int wrapValue,
                                      int minValue, int maxValue) {try{__CLR4_4_1az1az1lgchoqy1.R.inc(14332);
        __CLR4_4_1az1az1lgchoqy1.R.inc(14333);return getWrappedValue(currentValue + wrapValue, minValue, maxValue);
    }finally{__CLR4_4_1az1az1lgchoqy1.R.flushNeeded();}}

    /**
     * Utility method that ensures the given value lies within the field's
     * legal value range.
     *
     * @param value    the value to fit into the wrapped value range
     * @param minValue the wrap range minimum value.
     * @param maxValue the wrap range maximum value.  This must be
     *                 greater than minValue (checked by the method).
     * @return the wrapped value
     * @throws IllegalArgumentException if minValue is greater
     *                                  than or equal to maxValue
     */
    public static int getWrappedValue(int value, int minValue, int maxValue) {try{__CLR4_4_1az1az1lgchoqy1.R.inc(14334);
        __CLR4_4_1az1az1lgchoqy1.R.inc(14335);if ((((minValue >= maxValue)&&(__CLR4_4_1az1az1lgchoqy1.R.iget(14336)!=0|true))||(__CLR4_4_1az1az1lgchoqy1.R.iget(14337)==0&false))) {{
            __CLR4_4_1az1az1lgchoqy1.R.inc(14338);throw new IllegalArgumentException("MIN > MAX");
        }

        }__CLR4_4_1az1az1lgchoqy1.R.inc(14339);int wrapRange = maxValue - minValue + 1;
        __CLR4_4_1az1az1lgchoqy1.R.inc(14340);value -= minValue;

        __CLR4_4_1az1az1lgchoqy1.R.inc(14341);if ((((value >= 0)&&(__CLR4_4_1az1az1lgchoqy1.R.iget(14342)!=0|true))||(__CLR4_4_1az1az1lgchoqy1.R.iget(14343)==0&false))) {{
            __CLR4_4_1az1az1lgchoqy1.R.inc(14344);return (value % wrapRange) + minValue;
        }

        }__CLR4_4_1az1az1lgchoqy1.R.inc(14345);int remByRange = (-value) % wrapRange;

        __CLR4_4_1az1az1lgchoqy1.R.inc(14346);if ((((remByRange == 0)&&(__CLR4_4_1az1az1lgchoqy1.R.iget(14347)!=0|true))||(__CLR4_4_1az1az1lgchoqy1.R.iget(14348)==0&false))) {{
            __CLR4_4_1az1az1lgchoqy1.R.inc(14349);return 0 + minValue;
        }
        }__CLR4_4_1az1az1lgchoqy1.R.inc(14350);return (wrapRange - remByRange) + minValue;
    }finally{__CLR4_4_1az1az1lgchoqy1.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Compares two objects as equals handling null.
     *
     * @param object1 the first object
     * @param object2 the second object
     * @return true if equal
     * @since 1.4
     */
    public static boolean equals(Object object1, Object object2) {try{__CLR4_4_1az1az1lgchoqy1.R.inc(14351);
        __CLR4_4_1az1az1lgchoqy1.R.inc(14352);if ((((object1 == object2)&&(__CLR4_4_1az1az1lgchoqy1.R.iget(14353)!=0|true))||(__CLR4_4_1az1az1lgchoqy1.R.iget(14354)==0&false))) {{
            __CLR4_4_1az1az1lgchoqy1.R.inc(14355);return true;
        }
        }__CLR4_4_1az1az1lgchoqy1.R.inc(14356);if ((((object1 == null || object2 == null)&&(__CLR4_4_1az1az1lgchoqy1.R.iget(14357)!=0|true))||(__CLR4_4_1az1az1lgchoqy1.R.iget(14358)==0&false))) {{
            __CLR4_4_1az1az1lgchoqy1.R.inc(14359);return false;
        }
        }__CLR4_4_1az1az1lgchoqy1.R.inc(14360);return object1.equals(object2);
    }finally{__CLR4_4_1az1az1lgchoqy1.R.flushNeeded();}}

}
