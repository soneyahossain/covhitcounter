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
package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;

/**
 * Wraps another field such that zero values are replaced with one more than
 * it's maximum. This is particularly useful for implementing an clockhourOfDay
 * field, where the midnight value of 0 is replaced with 24.
 * <p>
 * ZeroIsMaxDateTimeField is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
public final class ZeroIsMaxDateTimeField extends DecoratedDateTimeField {public static class __CLR4_4_1bnkbnklgchoqzj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,15171,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @SuppressWarnings("unused")
    private static final long serialVersionUID = 961749798233026866L;

    /**
     * Constructor.
     *
     * @param field the base field
     * @param type  the field type this field will actually use
     * @throws IllegalArgumentException if wrapped field's minimum value is not zero
     */
    public ZeroIsMaxDateTimeField(DateTimeField field, DateTimeFieldType type) {
        super(field, type);__CLR4_4_1bnkbnklgchoqzj.R.inc(15105);try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15104);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15106);if ((((field.getMinimumValue() != 0)&&(__CLR4_4_1bnkbnklgchoqzj.R.iget(15107)!=0|true))||(__CLR4_4_1bnkbnklgchoqzj.R.iget(15108)==0&false))) {{
            __CLR4_4_1bnkbnklgchoqzj.R.inc(15109);throw new IllegalArgumentException("Wrapped field's minumum value must be zero");
        }
    }}finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    public int get(long instant) {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15110);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15111);int value = getWrappedField().get(instant);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15112);if ((((value == 0)&&(__CLR4_4_1bnkbnklgchoqzj.R.iget(15113)!=0|true))||(__CLR4_4_1bnkbnklgchoqzj.R.iget(15114)==0&false))) {{
            __CLR4_4_1bnkbnklgchoqzj.R.inc(15115);value = getMaximumValue();
        }
        }__CLR4_4_1bnkbnklgchoqzj.R.inc(15116);return value;
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    public long add(long instant, int value) {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15117);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15118);return getWrappedField().add(instant, value);
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    public long add(long instant, long value) {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15119);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15120);return getWrappedField().add(instant, value);
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    public long addWrapField(long instant, int value) {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15121);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15122);return getWrappedField().addWrapField(instant, value);
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    public int[] addWrapField(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15123);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15124);return getWrappedField().addWrapField(instant, fieldIndex, values, valueToAdd);
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15125);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15126);return getWrappedField().getDifference(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15127);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15128);return getWrappedField().getDifferenceAsLong(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    public long set(long instant, int value) {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15129);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15130);int max = getMaximumValue();
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15131);FieldUtils.verifyValueBounds(this, value, 1, max);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15132);if ((((value == max)&&(__CLR4_4_1bnkbnklgchoqzj.R.iget(15133)!=0|true))||(__CLR4_4_1bnkbnklgchoqzj.R.iget(15134)==0&false))) {{
            __CLR4_4_1bnkbnklgchoqzj.R.inc(15135);value = 0;
        }
        }__CLR4_4_1bnkbnklgchoqzj.R.inc(15136);return getWrappedField().set(instant, value);
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    public boolean isLeap(long instant) {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15137);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15138);return getWrappedField().isLeap(instant);
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    public int getLeapAmount(long instant) {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15139);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15140);return getWrappedField().getLeapAmount(instant);
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    public DurationField getLeapDurationField() {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15141);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15142);return getWrappedField().getLeapDurationField();
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    /**
     * Always returns 1.
     *
     * @return the minimum value of 1
     */
    public int getMinimumValue() {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15143);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15144);return 1;
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    /**
     * Always returns 1.
     *
     * @return the minimum value of 1
     */
    public int getMinimumValue(long instant) {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15145);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15146);return 1;
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    /**
     * Always returns 1.
     *
     * @return the minimum value of 1
     */
    public int getMinimumValue(ReadablePartial instant) {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15147);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15148);return 1;
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    /**
     * Always returns 1.
     *
     * @return the minimum value of 1
     */
    public int getMinimumValue(ReadablePartial instant, int[] values) {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15149);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15150);return 1;
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    /**
     * Get the maximum value for the field, which is one more than the wrapped
     * field's maximum value.
     *
     * @return the maximum value
     */
    public int getMaximumValue() {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15151);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15152);return getWrappedField().getMaximumValue() + 1;
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    /**
     * Get the maximum value for the field, which is one more than the wrapped
     * field's maximum value.
     *
     * @return the maximum value
     */
    public int getMaximumValue(long instant) {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15153);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15154);return getWrappedField().getMaximumValue(instant) + 1;
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    /**
     * Get the maximum value for the field, which is one more than the wrapped
     * field's maximum value.
     *
     * @return the maximum value
     */
    public int getMaximumValue(ReadablePartial instant) {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15155);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15156);return getWrappedField().getMaximumValue(instant) + 1;
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    /**
     * Get the maximum value for the field, which is one more than the wrapped
     * field's maximum value.
     *
     * @return the maximum value
     */
    public int getMaximumValue(ReadablePartial instant, int[] values) {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15157);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15158);return getWrappedField().getMaximumValue(instant, values) + 1;
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    public long roundFloor(long instant) {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15159);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15160);return getWrappedField().roundFloor(instant);
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    public long roundCeiling(long instant) {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15161);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15162);return getWrappedField().roundCeiling(instant);
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    public long roundHalfFloor(long instant) {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15163);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15164);return getWrappedField().roundHalfFloor(instant);
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    public long roundHalfCeiling(long instant) {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15165);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15166);return getWrappedField().roundHalfCeiling(instant);
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    public long roundHalfEven(long instant) {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15167);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15168);return getWrappedField().roundHalfEven(instant);
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

    public long remainder(long instant) {try{__CLR4_4_1bnkbnklgchoqzj.R.inc(15169);
        __CLR4_4_1bnkbnklgchoqzj.R.inc(15170);return getWrappedField().remainder(instant);
    }finally{__CLR4_4_1bnkbnklgchoqzj.R.flushNeeded();}}

}
