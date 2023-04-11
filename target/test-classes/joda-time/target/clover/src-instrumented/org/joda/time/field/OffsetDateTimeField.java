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

/**
 * Generic offset adjusting datetime field.
 * <p>
 * OffsetDateTimeField is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
public class OffsetDateTimeField extends DecoratedDateTimeField {public static class __CLR4_4_1b6rb6rlgchoqyg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,14561,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @SuppressWarnings("unused")
    private static final long serialVersionUID = 3145790132623583142L;

    private final int iOffset;

    private final int iMin;
    private final int iMax;

    /**
     * Constructor.
     *
     * @param field  the field to wrap, like "year()".
     * @param offset offset to add to field values
     * @throws IllegalArgumentException if offset is zero
     */
    public OffsetDateTimeField(DateTimeField field, int offset) {
        this(field, ((((field == null )&&(__CLR4_4_1b6rb6rlgchoqyg.R.iget(14500)!=0|true))||(__CLR4_4_1b6rb6rlgchoqyg.R.iget(14501)==0&false))? null : field.getType()), offset, Integer.MIN_VALUE, Integer.MAX_VALUE);__CLR4_4_1b6rb6rlgchoqyg.R.inc(14502);try{__CLR4_4_1b6rb6rlgchoqyg.R.inc(14499);
    }finally{__CLR4_4_1b6rb6rlgchoqyg.R.flushNeeded();}}

    /**
     * Constructor.
     *
     * @param field  the field to wrap, like "year()".
     * @param type   the field type this field actually uses
     * @param offset offset to add to field values
     * @throws IllegalArgumentException if offset is zero
     */
    public OffsetDateTimeField(DateTimeField field, DateTimeFieldType type, int offset) {
        this(field, type, offset, Integer.MIN_VALUE, Integer.MAX_VALUE);__CLR4_4_1b6rb6rlgchoqyg.R.inc(14504);try{__CLR4_4_1b6rb6rlgchoqyg.R.inc(14503);
    }finally{__CLR4_4_1b6rb6rlgchoqyg.R.flushNeeded();}}

    /**
     * Constructor.
     *
     * @param field    the field to wrap, like "year()".
     * @param type     the field type this field actually uses
     * @param offset   offset to add to field values
     * @param minValue minimum allowed value
     * @param maxValue maximum allowed value
     * @throws IllegalArgumentException if offset is zero
     */
    public OffsetDateTimeField(DateTimeField field, DateTimeFieldType type, int offset,
                               int minValue, int maxValue) {
        super(field, type);__CLR4_4_1b6rb6rlgchoqyg.R.inc(14506);try{__CLR4_4_1b6rb6rlgchoqyg.R.inc(14505);

        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14507);if ((((offset == 0)&&(__CLR4_4_1b6rb6rlgchoqyg.R.iget(14508)!=0|true))||(__CLR4_4_1b6rb6rlgchoqyg.R.iget(14509)==0&false))) {{
            __CLR4_4_1b6rb6rlgchoqyg.R.inc(14510);throw new IllegalArgumentException("The offset cannot be zero");
        }

        }__CLR4_4_1b6rb6rlgchoqyg.R.inc(14511);iOffset = offset;

        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14512);if ((((minValue < (field.getMinimumValue() + offset))&&(__CLR4_4_1b6rb6rlgchoqyg.R.iget(14513)!=0|true))||(__CLR4_4_1b6rb6rlgchoqyg.R.iget(14514)==0&false))) {{
            __CLR4_4_1b6rb6rlgchoqyg.R.inc(14515);iMin = field.getMinimumValue() + offset;
        } }else {{
            __CLR4_4_1b6rb6rlgchoqyg.R.inc(14516);iMin = minValue;
        }
        }__CLR4_4_1b6rb6rlgchoqyg.R.inc(14517);if ((((maxValue > (field.getMaximumValue() + offset))&&(__CLR4_4_1b6rb6rlgchoqyg.R.iget(14518)!=0|true))||(__CLR4_4_1b6rb6rlgchoqyg.R.iget(14519)==0&false))) {{
            __CLR4_4_1b6rb6rlgchoqyg.R.inc(14520);iMax = field.getMaximumValue() + offset;
        } }else {{
            __CLR4_4_1b6rb6rlgchoqyg.R.inc(14521);iMax = maxValue;
        }
    }}finally{__CLR4_4_1b6rb6rlgchoqyg.R.flushNeeded();}}

    /**
     * Get the amount of offset units from the specified time instant.
     *
     * @param instant the time instant in millis to query.
     * @return the amount of units extracted from the input.
     */
    public int get(long instant) {try{__CLR4_4_1b6rb6rlgchoqyg.R.inc(14522);
        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14523);return super.get(instant) + iOffset;
    }finally{__CLR4_4_1b6rb6rlgchoqyg.R.flushNeeded();}}

    /**
     * Add the specified amount of offset units to the specified time
     * instant. The amount added may be negative.
     *
     * @param instant the time instant in millis to update.
     * @param amount  the amount of units to add (can be negative).
     * @return the updated time instant.
     */
    public long add(long instant, int amount) {try{__CLR4_4_1b6rb6rlgchoqyg.R.inc(14524);
        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14525);instant = super.add(instant, amount);
        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14526);FieldUtils.verifyValueBounds(this, get(instant), iMin, iMax);
        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14527);return instant;
    }finally{__CLR4_4_1b6rb6rlgchoqyg.R.flushNeeded();}}

    /**
     * Add the specified amount of offset units to the specified time
     * instant. The amount added may be negative.
     *
     * @param instant the time instant in millis to update.
     * @param amount  the amount of units to add (can be negative).
     * @return the updated time instant.
     */
    public long add(long instant, long amount) {try{__CLR4_4_1b6rb6rlgchoqyg.R.inc(14528);
        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14529);instant = super.add(instant, amount);
        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14530);FieldUtils.verifyValueBounds(this, get(instant), iMin, iMax);
        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14531);return instant;
    }finally{__CLR4_4_1b6rb6rlgchoqyg.R.flushNeeded();}}

    /**
     * Add to the offset component of the specified time instant,
     * wrapping around within that component if necessary.
     *
     * @param instant the time instant in millis to update.
     * @param amount  the amount of units to add (can be negative).
     * @return the updated time instant.
     */
    public long addWrapField(long instant, int amount) {try{__CLR4_4_1b6rb6rlgchoqyg.R.inc(14532);
        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14533);return set(instant, FieldUtils.getWrappedValue(get(instant), amount, iMin, iMax));
    }finally{__CLR4_4_1b6rb6rlgchoqyg.R.flushNeeded();}}

    /**
     * Set the specified amount of offset units to the specified time instant.
     *
     * @param instant the time instant in millis to update.
     * @param value   value of units to set.
     * @return the updated time instant.
     * @throws IllegalArgumentException if value is too large or too small.
     */
    public long set(long instant, int value) {try{__CLR4_4_1b6rb6rlgchoqyg.R.inc(14534);
        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14535);FieldUtils.verifyValueBounds(this, value, iMin, iMax);
        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14536);return super.set(instant, value - iOffset);
    }finally{__CLR4_4_1b6rb6rlgchoqyg.R.flushNeeded();}}

    public boolean isLeap(long instant) {try{__CLR4_4_1b6rb6rlgchoqyg.R.inc(14537);
        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14538);return getWrappedField().isLeap(instant);
    }finally{__CLR4_4_1b6rb6rlgchoqyg.R.flushNeeded();}}

    public int getLeapAmount(long instant) {try{__CLR4_4_1b6rb6rlgchoqyg.R.inc(14539);
        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14540);return getWrappedField().getLeapAmount(instant);
    }finally{__CLR4_4_1b6rb6rlgchoqyg.R.flushNeeded();}}

    public DurationField getLeapDurationField() {try{__CLR4_4_1b6rb6rlgchoqyg.R.inc(14541);
        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14542);return getWrappedField().getLeapDurationField();
    }finally{__CLR4_4_1b6rb6rlgchoqyg.R.flushNeeded();}}

    /**
     * Get the minimum value for the field.
     *
     * @return the minimum value
     */
    public int getMinimumValue() {try{__CLR4_4_1b6rb6rlgchoqyg.R.inc(14543);
        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14544);return iMin;
    }finally{__CLR4_4_1b6rb6rlgchoqyg.R.flushNeeded();}}

    /**
     * Get the maximum value for the field.
     *
     * @return the maximum value
     */
    public int getMaximumValue() {try{__CLR4_4_1b6rb6rlgchoqyg.R.inc(14545);
        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14546);return iMax;
    }finally{__CLR4_4_1b6rb6rlgchoqyg.R.flushNeeded();}}

    public long roundFloor(long instant) {try{__CLR4_4_1b6rb6rlgchoqyg.R.inc(14547);
        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14548);return getWrappedField().roundFloor(instant);
    }finally{__CLR4_4_1b6rb6rlgchoqyg.R.flushNeeded();}}

    public long roundCeiling(long instant) {try{__CLR4_4_1b6rb6rlgchoqyg.R.inc(14549);
        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14550);return getWrappedField().roundCeiling(instant);
    }finally{__CLR4_4_1b6rb6rlgchoqyg.R.flushNeeded();}}

    public long roundHalfFloor(long instant) {try{__CLR4_4_1b6rb6rlgchoqyg.R.inc(14551);
        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14552);return getWrappedField().roundHalfFloor(instant);
    }finally{__CLR4_4_1b6rb6rlgchoqyg.R.flushNeeded();}}

    public long roundHalfCeiling(long instant) {try{__CLR4_4_1b6rb6rlgchoqyg.R.inc(14553);
        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14554);return getWrappedField().roundHalfCeiling(instant);
    }finally{__CLR4_4_1b6rb6rlgchoqyg.R.flushNeeded();}}

    public long roundHalfEven(long instant) {try{__CLR4_4_1b6rb6rlgchoqyg.R.inc(14555);
        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14556);return getWrappedField().roundHalfEven(instant);
    }finally{__CLR4_4_1b6rb6rlgchoqyg.R.flushNeeded();}}

    public long remainder(long instant) {try{__CLR4_4_1b6rb6rlgchoqyg.R.inc(14557);
        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14558);return getWrappedField().remainder(instant);
    }finally{__CLR4_4_1b6rb6rlgchoqyg.R.flushNeeded();}}

    /**
     * Returns the offset added to the field values.
     *
     * @return the offset
     */
    public int getOffset() {try{__CLR4_4_1b6rb6rlgchoqyg.R.inc(14559);
        __CLR4_4_1b6rb6rlgchoqyg.R.inc(14560);return iOffset;
    }finally{__CLR4_4_1b6rb6rlgchoqyg.R.flushNeeded();}}
}
