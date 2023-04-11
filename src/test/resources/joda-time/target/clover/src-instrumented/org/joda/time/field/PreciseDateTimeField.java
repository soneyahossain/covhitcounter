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
 * Precise datetime field, composed of two precise duration fields.
 * <p>
 * This DateTimeField is useful for defining DateTimeFields that are composed
 * of precise durations, like time of day fields. If either duration field is
 * imprecise, then an {@link ImpreciseDateTimeField} may be used instead.
 * <p>
 * PreciseDateTimeField is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @see ImpreciseDateTimeField
 * @since 1.0
 */
public class PreciseDateTimeField extends PreciseDurationDateTimeField {public static class __CLR4_4_1b8hb8hlgchoqyk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,14593,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @SuppressWarnings("unused")
    private static final long serialVersionUID = -5586801265774496376L;

    /**
     * The maximum range in the correct units
     */
    private final int iRange;

    private final DurationField iRangeField;

    /**
     * Constructor.
     *
     * @param type  the field type this field uses
     * @param unit  precise unit duration, like "seconds()".
     * @param range precise range duration, preferably a multiple of the unit,
     *              like "minutes()".
     * @throws IllegalArgumentException if either duration field is imprecise
     * @throws IllegalArgumentException if unit milliseconds is less than one
     *                                  or effective value range is less than two.
     */
    public PreciseDateTimeField(DateTimeFieldType type,
                                DurationField unit, DurationField range) {
        super(type, unit);__CLR4_4_1b8hb8hlgchoqyk.R.inc(14562);try{__CLR4_4_1b8hb8hlgchoqyk.R.inc(14561);

        __CLR4_4_1b8hb8hlgchoqyk.R.inc(14563);if ((((!range.isPrecise())&&(__CLR4_4_1b8hb8hlgchoqyk.R.iget(14564)!=0|true))||(__CLR4_4_1b8hb8hlgchoqyk.R.iget(14565)==0&false))) {{
            __CLR4_4_1b8hb8hlgchoqyk.R.inc(14566);throw new IllegalArgumentException("Range duration field must be precise");
        }

        }__CLR4_4_1b8hb8hlgchoqyk.R.inc(14567);long rangeMillis = range.getUnitMillis();
        __CLR4_4_1b8hb8hlgchoqyk.R.inc(14568);iRange = (int) (rangeMillis / getUnitMillis());
        __CLR4_4_1b8hb8hlgchoqyk.R.inc(14569);if ((((iRange < 2)&&(__CLR4_4_1b8hb8hlgchoqyk.R.iget(14570)!=0|true))||(__CLR4_4_1b8hb8hlgchoqyk.R.iget(14571)==0&false))) {{
            __CLR4_4_1b8hb8hlgchoqyk.R.inc(14572);throw new IllegalArgumentException("The effective range must be at least 2");
        }

        }__CLR4_4_1b8hb8hlgchoqyk.R.inc(14573);iRangeField = range;
    }finally{__CLR4_4_1b8hb8hlgchoqyk.R.flushNeeded();}}

    /**
     * Get the amount of fractional units from the specified time instant.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to query
     * @return the amount of fractional units extracted from the input.
     */
    public int get(long instant) {try{__CLR4_4_1b8hb8hlgchoqyk.R.inc(14574);
        __CLR4_4_1b8hb8hlgchoqyk.R.inc(14575);if ((((instant >= 0)&&(__CLR4_4_1b8hb8hlgchoqyk.R.iget(14576)!=0|true))||(__CLR4_4_1b8hb8hlgchoqyk.R.iget(14577)==0&false))) {{
            __CLR4_4_1b8hb8hlgchoqyk.R.inc(14578);return (int) ((instant / getUnitMillis()) % iRange);
        } }else {{
            __CLR4_4_1b8hb8hlgchoqyk.R.inc(14579);return iRange - 1 + (int) (((instant + 1) / getUnitMillis()) % iRange);
        }
    }}finally{__CLR4_4_1b8hb8hlgchoqyk.R.flushNeeded();}}

    /**
     * Add to the component of the specified time instant, wrapping around
     * within that component if necessary.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to add to
     * @param amount  the amount of units to add (can be negative).
     * @return the updated time instant.
     */
    public long addWrapField(long instant, int amount) {try{__CLR4_4_1b8hb8hlgchoqyk.R.inc(14580);
        __CLR4_4_1b8hb8hlgchoqyk.R.inc(14581);int thisValue = get(instant);
        __CLR4_4_1b8hb8hlgchoqyk.R.inc(14582);int wrappedValue = FieldUtils.getWrappedValue
                (thisValue, amount, getMinimumValue(), getMaximumValue());
        // copy code from set() to avoid repeat call to get()
        __CLR4_4_1b8hb8hlgchoqyk.R.inc(14583);return instant + (wrappedValue - thisValue) * getUnitMillis();
    }finally{__CLR4_4_1b8hb8hlgchoqyk.R.flushNeeded();}}

    /**
     * Set the specified amount of units to the specified time instant.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to set in
     * @param value   value of units to set.
     * @return the updated time instant.
     * @throws IllegalArgumentException if value is too large or too small.
     */
    public long set(long instant, int value) {try{__CLR4_4_1b8hb8hlgchoqyk.R.inc(14584);
        __CLR4_4_1b8hb8hlgchoqyk.R.inc(14585);FieldUtils.verifyValueBounds(this, value, getMinimumValue(), getMaximumValue());
        __CLR4_4_1b8hb8hlgchoqyk.R.inc(14586);return instant + (value - get(instant)) * iUnitMillis;
    }finally{__CLR4_4_1b8hb8hlgchoqyk.R.flushNeeded();}}

    /**
     * Returns the range duration of this field. For example, if this field
     * represents "minute of hour", then the range duration field is an hours.
     *
     * @return the range duration of this field, or null if field has no range
     */
    public DurationField getRangeDurationField() {try{__CLR4_4_1b8hb8hlgchoqyk.R.inc(14587);
        __CLR4_4_1b8hb8hlgchoqyk.R.inc(14588);return iRangeField;
    }finally{__CLR4_4_1b8hb8hlgchoqyk.R.flushNeeded();}}

    /**
     * Get the maximum value for the field.
     *
     * @return the maximum value
     */
    public int getMaximumValue() {try{__CLR4_4_1b8hb8hlgchoqyk.R.inc(14589);
        __CLR4_4_1b8hb8hlgchoqyk.R.inc(14590);return iRange - 1;
    }finally{__CLR4_4_1b8hb8hlgchoqyk.R.flushNeeded();}}

    /**
     * Returns the range of the field in the field's units.
     * <p>
     * For example, 60 for seconds per minute. The field is allowed values
     * from 0 to range - 1.
     *
     * @return unit range
     */
    public int getRange() {try{__CLR4_4_1b8hb8hlgchoqyk.R.inc(14591);
        __CLR4_4_1b8hb8hlgchoqyk.R.inc(14592);return iRange;
    }finally{__CLR4_4_1b8hb8hlgchoqyk.R.flushNeeded();}}

}
