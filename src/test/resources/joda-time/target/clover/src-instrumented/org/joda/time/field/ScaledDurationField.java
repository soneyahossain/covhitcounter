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

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/**
 * Scales a DurationField such that it's unit millis becomes larger in
 * magnitude.
 * <p>
 * ScaledDurationField is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @see PreciseDurationField
 * @since 1.0
 */
public class ScaledDurationField extends DecoratedDurationField {public static class __CLR4_4_1bdpbdplgchoqyz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,14807,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -3205227092378684157L;

    private final int iScalar;

    /**
     * Constructor
     *
     * @param field  the field to wrap, like "year()".
     * @param type   the type this field will actually use
     * @param scalar scalar, such as 100 years in a century
     * @throws IllegalArgumentException if scalar is zero or one.
     */
    public ScaledDurationField(DurationField field, DurationFieldType type, int scalar) {
        super(field, type);__CLR4_4_1bdpbdplgchoqyz.R.inc(14750);try{__CLR4_4_1bdpbdplgchoqyz.R.inc(14749);
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14751);if ((((scalar == 0 || scalar == 1)&&(__CLR4_4_1bdpbdplgchoqyz.R.iget(14752)!=0|true))||(__CLR4_4_1bdpbdplgchoqyz.R.iget(14753)==0&false))) {{
            __CLR4_4_1bdpbdplgchoqyz.R.inc(14754);throw new IllegalArgumentException("The scalar must not be 0 or 1");
        }
        }__CLR4_4_1bdpbdplgchoqyz.R.inc(14755);iScalar = scalar;
    }finally{__CLR4_4_1bdpbdplgchoqyz.R.flushNeeded();}}

    public int getValue(long duration) {try{__CLR4_4_1bdpbdplgchoqyz.R.inc(14756);
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14757);return getWrappedField().getValue(duration) / iScalar;
    }finally{__CLR4_4_1bdpbdplgchoqyz.R.flushNeeded();}}

    public long getValueAsLong(long duration) {try{__CLR4_4_1bdpbdplgchoqyz.R.inc(14758);
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14759);return getWrappedField().getValueAsLong(duration) / iScalar;
    }finally{__CLR4_4_1bdpbdplgchoqyz.R.flushNeeded();}}

    public int getValue(long duration, long instant) {try{__CLR4_4_1bdpbdplgchoqyz.R.inc(14760);
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14761);return getWrappedField().getValue(duration, instant) / iScalar;
    }finally{__CLR4_4_1bdpbdplgchoqyz.R.flushNeeded();}}

    public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1bdpbdplgchoqyz.R.inc(14762);
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14763);return getWrappedField().getValueAsLong(duration, instant) / iScalar;
    }finally{__CLR4_4_1bdpbdplgchoqyz.R.flushNeeded();}}

    public long getMillis(int value) {try{__CLR4_4_1bdpbdplgchoqyz.R.inc(14764);
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14765);long scaled = ((long) value) * ((long) iScalar);
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14766);return getWrappedField().getMillis(scaled);
    }finally{__CLR4_4_1bdpbdplgchoqyz.R.flushNeeded();}}

    public long getMillis(long value) {try{__CLR4_4_1bdpbdplgchoqyz.R.inc(14767);
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14768);long scaled = FieldUtils.safeMultiply(value, iScalar);
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14769);return getWrappedField().getMillis(scaled);
    }finally{__CLR4_4_1bdpbdplgchoqyz.R.flushNeeded();}}

    public long getMillis(int value, long instant) {try{__CLR4_4_1bdpbdplgchoqyz.R.inc(14770);
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14771);long scaled = ((long) value) * ((long) iScalar);
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14772);return getWrappedField().getMillis(scaled, instant);
    }finally{__CLR4_4_1bdpbdplgchoqyz.R.flushNeeded();}}

    public long getMillis(long value, long instant) {try{__CLR4_4_1bdpbdplgchoqyz.R.inc(14773);
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14774);long scaled = FieldUtils.safeMultiply(value, iScalar);
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14775);return getWrappedField().getMillis(scaled, instant);
    }finally{__CLR4_4_1bdpbdplgchoqyz.R.flushNeeded();}}

    public long add(long instant, int value) {try{__CLR4_4_1bdpbdplgchoqyz.R.inc(14776);
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14777);long scaled = ((long) value) * ((long) iScalar);
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14778);return getWrappedField().add(instant, scaled);
    }finally{__CLR4_4_1bdpbdplgchoqyz.R.flushNeeded();}}

    public long add(long instant, long value) {try{__CLR4_4_1bdpbdplgchoqyz.R.inc(14779);
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14780);long scaled = FieldUtils.safeMultiply(value, iScalar);
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14781);return getWrappedField().add(instant, scaled);
    }finally{__CLR4_4_1bdpbdplgchoqyz.R.flushNeeded();}}

    public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1bdpbdplgchoqyz.R.inc(14782);
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14783);return getWrappedField().getDifference(minuendInstant, subtrahendInstant) / iScalar;
    }finally{__CLR4_4_1bdpbdplgchoqyz.R.flushNeeded();}}

    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1bdpbdplgchoqyz.R.inc(14784);
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14785);return getWrappedField().getDifferenceAsLong(minuendInstant, subtrahendInstant) / iScalar;
    }finally{__CLR4_4_1bdpbdplgchoqyz.R.flushNeeded();}}

    public long getUnitMillis() {try{__CLR4_4_1bdpbdplgchoqyz.R.inc(14786);
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14787);return getWrappedField().getUnitMillis() * iScalar;
    }finally{__CLR4_4_1bdpbdplgchoqyz.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns the scalar applied, in the field's units.
     *
     * @return the scalar
     */
    public int getScalar() {try{__CLR4_4_1bdpbdplgchoqyz.R.inc(14788);
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14789);return iScalar;
    }finally{__CLR4_4_1bdpbdplgchoqyz.R.flushNeeded();}}

    /**
     * Compares this duration field to another.
     * Two fields are equal if of the same type and duration.
     *
     * @param obj the object to compare to
     * @return if equal
     */
    public boolean equals(Object obj) {try{__CLR4_4_1bdpbdplgchoqyz.R.inc(14790);
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14791);if ((((this == obj)&&(__CLR4_4_1bdpbdplgchoqyz.R.iget(14792)!=0|true))||(__CLR4_4_1bdpbdplgchoqyz.R.iget(14793)==0&false))) {{
            __CLR4_4_1bdpbdplgchoqyz.R.inc(14794);return true;
        } }else {__CLR4_4_1bdpbdplgchoqyz.R.inc(14795);if ((((obj instanceof ScaledDurationField)&&(__CLR4_4_1bdpbdplgchoqyz.R.iget(14796)!=0|true))||(__CLR4_4_1bdpbdplgchoqyz.R.iget(14797)==0&false))) {{
            __CLR4_4_1bdpbdplgchoqyz.R.inc(14798);ScaledDurationField other = (ScaledDurationField) obj;
            __CLR4_4_1bdpbdplgchoqyz.R.inc(14799);return (getWrappedField().equals(other.getWrappedField())) &&
                    (getType() == other.getType()) &&
                    (iScalar == other.iScalar);
        }
        }}__CLR4_4_1bdpbdplgchoqyz.R.inc(14800);return false;
    }finally{__CLR4_4_1bdpbdplgchoqyz.R.flushNeeded();}}

    /**
     * Gets a hash code for this instance.
     *
     * @return a suitable hashcode
     */
    public int hashCode() {try{__CLR4_4_1bdpbdplgchoqyz.R.inc(14801);
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14802);long scalar = iScalar;
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14803);int hash = (int) (scalar ^ (scalar >>> 32));
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14804);hash += getType().hashCode();
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14805);hash += getWrappedField().hashCode();
        __CLR4_4_1bdpbdplgchoqyz.R.inc(14806);return hash;
    }finally{__CLR4_4_1bdpbdplgchoqyz.R.flushNeeded();}}

}
