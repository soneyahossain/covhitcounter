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

import org.joda.time.DurationFieldType;

/**
 * Duration field class representing a field with a fixed unit length.
 * <p>
 * PreciseDurationField is thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
public class PreciseDurationField extends BaseDurationField {public static class __CLR4_4_1bambamlgchoqyq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,14676,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -8346152187724495365L;

    /**
     * The size of the unit
     */
    private final long iUnitMillis;

    /**
     * Constructor.
     *
     * @param type       the field type
     * @param unitMillis the unit milliseconds
     */
    public PreciseDurationField(DurationFieldType type, long unitMillis) {
        super(type);__CLR4_4_1bambamlgchoqyq.R.inc(14639);try{__CLR4_4_1bambamlgchoqyq.R.inc(14638);
        __CLR4_4_1bambamlgchoqyq.R.inc(14640);iUnitMillis = unitMillis;
    }finally{__CLR4_4_1bambamlgchoqyq.R.flushNeeded();}}

    //------------------------------------------------------------------------

    /**
     * This field is precise.
     *
     * @return true always
     */
    public final boolean isPrecise() {try{__CLR4_4_1bambamlgchoqyq.R.inc(14641);
        __CLR4_4_1bambamlgchoqyq.R.inc(14642);return true;
    }finally{__CLR4_4_1bambamlgchoqyq.R.flushNeeded();}}

    /**
     * Returns the amount of milliseconds per unit value of this field.
     *
     * @return the unit size of this field, in milliseconds
     */
    public final long getUnitMillis() {try{__CLR4_4_1bambamlgchoqyq.R.inc(14643);
        __CLR4_4_1bambamlgchoqyq.R.inc(14644);return iUnitMillis;
    }finally{__CLR4_4_1bambamlgchoqyq.R.flushNeeded();}}

    //------------------------------------------------------------------------

    /**
     * Get the value of this field from the milliseconds.
     *
     * @param duration the milliseconds to query, which may be negative
     * @param instant  ignored
     * @return the value of the field, in the units of the field, which may be
     * negative
     */
    public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1bambamlgchoqyq.R.inc(14645);
        __CLR4_4_1bambamlgchoqyq.R.inc(14646);return duration / iUnitMillis;  // safe
    }finally{__CLR4_4_1bambamlgchoqyq.R.flushNeeded();}}

    /**
     * Get the millisecond duration of this field from its value.
     *
     * @param value   the value of the field, which may be negative
     * @param instant ignored
     * @return the milliseconds that the field represents, which may be
     * negative
     */
    public long getMillis(int value, long instant) {try{__CLR4_4_1bambamlgchoqyq.R.inc(14647);
        __CLR4_4_1bambamlgchoqyq.R.inc(14648);return value * iUnitMillis;  // safe
    }finally{__CLR4_4_1bambamlgchoqyq.R.flushNeeded();}}

    /**
     * Get the millisecond duration of this field from its value.
     *
     * @param value   the value of the field, which may be negative
     * @param instant ignored
     * @return the milliseconds that the field represents, which may be
     * negative
     */
    public long getMillis(long value, long instant) {try{__CLR4_4_1bambamlgchoqyq.R.inc(14649);
        __CLR4_4_1bambamlgchoqyq.R.inc(14650);return FieldUtils.safeMultiply(value, iUnitMillis);
    }finally{__CLR4_4_1bambamlgchoqyq.R.flushNeeded();}}

    public long add(long instant, int value) {try{__CLR4_4_1bambamlgchoqyq.R.inc(14651);
        __CLR4_4_1bambamlgchoqyq.R.inc(14652);long addition = value * iUnitMillis;  // safe
        __CLR4_4_1bambamlgchoqyq.R.inc(14653);return FieldUtils.safeAdd(instant, addition);
    }finally{__CLR4_4_1bambamlgchoqyq.R.flushNeeded();}}

    public long add(long instant, long value) {try{__CLR4_4_1bambamlgchoqyq.R.inc(14654);
        __CLR4_4_1bambamlgchoqyq.R.inc(14655);long addition = FieldUtils.safeMultiply(value, iUnitMillis);
        __CLR4_4_1bambamlgchoqyq.R.inc(14656);return FieldUtils.safeAdd(instant, addition);
    }finally{__CLR4_4_1bambamlgchoqyq.R.flushNeeded();}}

    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1bambamlgchoqyq.R.inc(14657);
        __CLR4_4_1bambamlgchoqyq.R.inc(14658);long difference = FieldUtils.safeSubtract(minuendInstant, subtrahendInstant);
        __CLR4_4_1bambamlgchoqyq.R.inc(14659);return difference / iUnitMillis;
    }finally{__CLR4_4_1bambamlgchoqyq.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Compares this duration field to another.
     * Two fields are equal if of the same type and duration.
     *
     * @param obj the object to compare to
     * @return if equal
     */
    public boolean equals(Object obj) {try{__CLR4_4_1bambamlgchoqyq.R.inc(14660);
        __CLR4_4_1bambamlgchoqyq.R.inc(14661);if ((((this == obj)&&(__CLR4_4_1bambamlgchoqyq.R.iget(14662)!=0|true))||(__CLR4_4_1bambamlgchoqyq.R.iget(14663)==0&false))) {{
            __CLR4_4_1bambamlgchoqyq.R.inc(14664);return true;
        } }else {__CLR4_4_1bambamlgchoqyq.R.inc(14665);if ((((obj instanceof PreciseDurationField)&&(__CLR4_4_1bambamlgchoqyq.R.iget(14666)!=0|true))||(__CLR4_4_1bambamlgchoqyq.R.iget(14667)==0&false))) {{
            __CLR4_4_1bambamlgchoqyq.R.inc(14668);PreciseDurationField other = (PreciseDurationField) obj;
            __CLR4_4_1bambamlgchoqyq.R.inc(14669);return (getType() == other.getType()) && (iUnitMillis == other.iUnitMillis);
        }
        }}__CLR4_4_1bambamlgchoqyq.R.inc(14670);return false;
    }finally{__CLR4_4_1bambamlgchoqyq.R.flushNeeded();}}

    /**
     * Gets a hash code for this instance.
     *
     * @return a suitable hashcode
     */
    public int hashCode() {try{__CLR4_4_1bambamlgchoqyq.R.inc(14671);
        __CLR4_4_1bambamlgchoqyq.R.inc(14672);long millis = iUnitMillis;
        __CLR4_4_1bambamlgchoqyq.R.inc(14673);int hash = (int) (millis ^ (millis >>> 32));
        __CLR4_4_1bambamlgchoqyq.R.inc(14674);hash += getType().hashCode();
        __CLR4_4_1bambamlgchoqyq.R.inc(14675);return hash;
    }finally{__CLR4_4_1bambamlgchoqyq.R.flushNeeded();}}

}
