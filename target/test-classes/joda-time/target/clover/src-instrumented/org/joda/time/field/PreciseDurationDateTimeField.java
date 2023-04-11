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

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

/**
 * Precise datetime field, which has a precise unit duration field.
 * <p>
 * PreciseDurationDateTimeField is thread-safe and immutable, and its
 * subclasses must be as well.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
public abstract class PreciseDurationDateTimeField extends BaseDateTimeField {public static class __CLR4_4_1b9db9dlgchoqyn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,14638,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @SuppressWarnings("unused")
    private static final long serialVersionUID = 5004523158306266035L;

    /**
     * The fractional unit in millis
     */
    final long iUnitMillis;

    private final DurationField iUnitField;

    /**
     * Constructor.
     *
     * @param type the field type
     * @param unit precise unit duration, like "days()".
     * @throws IllegalArgumentException if duration field is imprecise
     * @throws IllegalArgumentException if unit milliseconds is less than one
     */
    public PreciseDurationDateTimeField(DateTimeFieldType type, DurationField unit) {
        super(type);__CLR4_4_1b9db9dlgchoqyn.R.inc(14594);try{__CLR4_4_1b9db9dlgchoqyn.R.inc(14593);

        __CLR4_4_1b9db9dlgchoqyn.R.inc(14595);if ((((!unit.isPrecise())&&(__CLR4_4_1b9db9dlgchoqyn.R.iget(14596)!=0|true))||(__CLR4_4_1b9db9dlgchoqyn.R.iget(14597)==0&false))) {{
            __CLR4_4_1b9db9dlgchoqyn.R.inc(14598);throw new IllegalArgumentException("Unit duration field must be precise");
        }

        }__CLR4_4_1b9db9dlgchoqyn.R.inc(14599);iUnitMillis = unit.getUnitMillis();
        __CLR4_4_1b9db9dlgchoqyn.R.inc(14600);if ((((iUnitMillis < 1)&&(__CLR4_4_1b9db9dlgchoqyn.R.iget(14601)!=0|true))||(__CLR4_4_1b9db9dlgchoqyn.R.iget(14602)==0&false))) {{
            __CLR4_4_1b9db9dlgchoqyn.R.inc(14603);throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        }

        }__CLR4_4_1b9db9dlgchoqyn.R.inc(14604);iUnitField = unit;
    }finally{__CLR4_4_1b9db9dlgchoqyn.R.flushNeeded();}}

    /**
     * Returns false by default.
     */
    public boolean isLenient() {try{__CLR4_4_1b9db9dlgchoqyn.R.inc(14605);
        __CLR4_4_1b9db9dlgchoqyn.R.inc(14606);return false;
    }finally{__CLR4_4_1b9db9dlgchoqyn.R.flushNeeded();}}

    /**
     * Set the specified amount of units to the specified time instant.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to set in
     * @param value   value of units to set.
     * @return the updated time instant.
     * @throws IllegalArgumentException if value is too large or too small.
     */
    public long set(long instant, int value) {try{__CLR4_4_1b9db9dlgchoqyn.R.inc(14607);
        __CLR4_4_1b9db9dlgchoqyn.R.inc(14608);FieldUtils.verifyValueBounds(this, value, getMinimumValue(),
                getMaximumValueForSet(instant, value));
        __CLR4_4_1b9db9dlgchoqyn.R.inc(14609);return instant + (value - get(instant)) * iUnitMillis;
    }finally{__CLR4_4_1b9db9dlgchoqyn.R.flushNeeded();}}

    /**
     * This method assumes that this field is properly rounded on
     * 1970-01-01T00:00:00. If the rounding alignment differs, override this
     * method as follows:
     * <pre>
     * return super.roundFloor(instant + ALIGNMENT_MILLIS) - ALIGNMENT_MILLIS;
     * </pre>
     */
    public long roundFloor(long instant) {try{__CLR4_4_1b9db9dlgchoqyn.R.inc(14610);
        __CLR4_4_1b9db9dlgchoqyn.R.inc(14611);if ((((instant >= 0)&&(__CLR4_4_1b9db9dlgchoqyn.R.iget(14612)!=0|true))||(__CLR4_4_1b9db9dlgchoqyn.R.iget(14613)==0&false))) {{
            __CLR4_4_1b9db9dlgchoqyn.R.inc(14614);return instant - instant % iUnitMillis;
        } }else {{
            __CLR4_4_1b9db9dlgchoqyn.R.inc(14615);instant += 1;
            __CLR4_4_1b9db9dlgchoqyn.R.inc(14616);return instant - instant % iUnitMillis - iUnitMillis;
        }
    }}finally{__CLR4_4_1b9db9dlgchoqyn.R.flushNeeded();}}

    /**
     * This method assumes that this field is properly rounded on
     * 1970-01-01T00:00:00. If the rounding alignment differs, override this
     * method as follows:
     * <pre>
     * return super.roundCeiling(instant + ALIGNMENT_MILLIS) - ALIGNMENT_MILLIS;
     * </pre>
     */
    public long roundCeiling(long instant) {try{__CLR4_4_1b9db9dlgchoqyn.R.inc(14617);
        __CLR4_4_1b9db9dlgchoqyn.R.inc(14618);if ((((instant > 0)&&(__CLR4_4_1b9db9dlgchoqyn.R.iget(14619)!=0|true))||(__CLR4_4_1b9db9dlgchoqyn.R.iget(14620)==0&false))) {{
            __CLR4_4_1b9db9dlgchoqyn.R.inc(14621);instant -= 1;
            __CLR4_4_1b9db9dlgchoqyn.R.inc(14622);return instant - instant % iUnitMillis + iUnitMillis;
        } }else {{
            __CLR4_4_1b9db9dlgchoqyn.R.inc(14623);return instant - instant % iUnitMillis;
        }
    }}finally{__CLR4_4_1b9db9dlgchoqyn.R.flushNeeded();}}

    /**
     * This method assumes that this field is properly rounded on
     * 1970-01-01T00:00:00. If the rounding alignment differs, override this
     * method as follows:
     * <pre>
     * return super.remainder(instant + ALIGNMENT_MILLIS);
     * </pre>
     */
    public long remainder(long instant) {try{__CLR4_4_1b9db9dlgchoqyn.R.inc(14624);
        __CLR4_4_1b9db9dlgchoqyn.R.inc(14625);if ((((instant >= 0)&&(__CLR4_4_1b9db9dlgchoqyn.R.iget(14626)!=0|true))||(__CLR4_4_1b9db9dlgchoqyn.R.iget(14627)==0&false))) {{
            __CLR4_4_1b9db9dlgchoqyn.R.inc(14628);return instant % iUnitMillis;
        } }else {{
            __CLR4_4_1b9db9dlgchoqyn.R.inc(14629);return (instant + 1) % iUnitMillis + iUnitMillis - 1;
        }
    }}finally{__CLR4_4_1b9db9dlgchoqyn.R.flushNeeded();}}

    /**
     * Returns the duration per unit value of this field. For example, if this
     * field represents "minute of hour", then the duration field is minutes.
     *
     * @return the duration of this field, or UnsupportedDurationField if field
     * has no duration
     */
    public DurationField getDurationField() {try{__CLR4_4_1b9db9dlgchoqyn.R.inc(14630);
        __CLR4_4_1b9db9dlgchoqyn.R.inc(14631);return iUnitField;
    }finally{__CLR4_4_1b9db9dlgchoqyn.R.flushNeeded();}}

    /**
     * Get the minimum value for the field.
     *
     * @return the minimum value
     */
    public int getMinimumValue() {try{__CLR4_4_1b9db9dlgchoqyn.R.inc(14632);
        __CLR4_4_1b9db9dlgchoqyn.R.inc(14633);return 0;
    }finally{__CLR4_4_1b9db9dlgchoqyn.R.flushNeeded();}}

    public final long getUnitMillis() {try{__CLR4_4_1b9db9dlgchoqyn.R.inc(14634);
        __CLR4_4_1b9db9dlgchoqyn.R.inc(14635);return iUnitMillis;
    }finally{__CLR4_4_1b9db9dlgchoqyn.R.flushNeeded();}}

    /**
     * Called by the set method to get the maximum allowed value. By default,
     * returns getMaximumValue(instant). Override to provide a faster
     * implementation.
     */
    protected int getMaximumValueForSet(long instant, int value) {try{__CLR4_4_1b9db9dlgchoqyn.R.inc(14636);
        __CLR4_4_1b9db9dlgchoqyn.R.inc(14637);return getMaximumValue(instant);
    }finally{__CLR4_4_1b9db9dlgchoqyn.R.flushNeeded();}}

}
