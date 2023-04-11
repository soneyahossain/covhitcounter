/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;

/**
 * A placeholder implementation to use when a datetime field is not supported.
 * <p>
 * UnsupportedDateTimeField is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
public final class UnsupportedDateTimeField extends DateTimeField implements Serializable {public static class __CLR4_4_1bhwbhwlgchoqzb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,15029,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization version
     */
    private static final long serialVersionUID = -1934618396111902255L;

    /**
     * The cache of unsupported datetime field instances
     */
    private static HashMap<DateTimeFieldType, UnsupportedDateTimeField> cCache;

    /**
     * Gets an instance of UnsupportedDateTimeField for a specific named field.
     * Names should be of standard format, such as 'monthOfYear' or 'hourOfDay'.
     * The returned instance is cached.
     *
     * @param type the type to obtain
     * @return the instance
     * @throws IllegalArgumentException if durationField is null
     */
    public static synchronized UnsupportedDateTimeField getInstance(
            DateTimeFieldType type, DurationField durationField) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14900);

        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14901);UnsupportedDateTimeField field;
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14902);if ((((cCache == null)&&(__CLR4_4_1bhwbhwlgchoqzb.R.iget(14903)!=0|true))||(__CLR4_4_1bhwbhwlgchoqzb.R.iget(14904)==0&false))) {{
            __CLR4_4_1bhwbhwlgchoqzb.R.inc(14905);cCache = new HashMap<DateTimeFieldType, UnsupportedDateTimeField>(7);
            __CLR4_4_1bhwbhwlgchoqzb.R.inc(14906);field = null;
        } }else {{
            __CLR4_4_1bhwbhwlgchoqzb.R.inc(14907);field = cCache.get(type);
            __CLR4_4_1bhwbhwlgchoqzb.R.inc(14908);if ((((field != null && field.getDurationField() != durationField)&&(__CLR4_4_1bhwbhwlgchoqzb.R.iget(14909)!=0|true))||(__CLR4_4_1bhwbhwlgchoqzb.R.iget(14910)==0&false))) {{
                __CLR4_4_1bhwbhwlgchoqzb.R.inc(14911);field = null;
            }
        }}
        }__CLR4_4_1bhwbhwlgchoqzb.R.inc(14912);if ((((field == null)&&(__CLR4_4_1bhwbhwlgchoqzb.R.iget(14913)!=0|true))||(__CLR4_4_1bhwbhwlgchoqzb.R.iget(14914)==0&false))) {{
            __CLR4_4_1bhwbhwlgchoqzb.R.inc(14915);field = new UnsupportedDateTimeField(type, durationField);
            __CLR4_4_1bhwbhwlgchoqzb.R.inc(14916);cCache.put(type, field);
        }
        }__CLR4_4_1bhwbhwlgchoqzb.R.inc(14917);return field;
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * The field type
     */
    private final DateTimeFieldType iType;
    /**
     * The duration of the datetime field
     */
    private final DurationField iDurationField;

    /**
     * Constructor.
     *
     * @param type          the field type
     * @param durationField the duration to use
     */
    private UnsupportedDateTimeField(DateTimeFieldType type, DurationField durationField) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14918);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14919);if ((((type == null || durationField == null)&&(__CLR4_4_1bhwbhwlgchoqzb.R.iget(14920)!=0|true))||(__CLR4_4_1bhwbhwlgchoqzb.R.iget(14921)==0&false))) {{
            __CLR4_4_1bhwbhwlgchoqzb.R.inc(14922);throw new IllegalArgumentException();
        }
        }__CLR4_4_1bhwbhwlgchoqzb.R.inc(14923);iType = type;
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14924);iDurationField = durationField;
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // Design note: Simple accessors return a suitable value, but methods
    // intended to perform calculations throw an UnsupportedOperationException.

    public DateTimeFieldType getType() {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14925);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14926);return iType;
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    public String getName() {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14927);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14928);return iType.getName();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * This field is not supported.
     *
     * @return false always
     */
    public boolean isSupported() {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14929);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14930);return false;
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * This field is not lenient.
     *
     * @return false always
     */
    public boolean isLenient() {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14931);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14932);return false;
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int get(long instant) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14933);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14934);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public String getAsText(long instant, Locale locale) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14935);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14936);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public String getAsText(long instant) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14937);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14938);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public String getAsText(ReadablePartial partial, int fieldValue, Locale locale) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14939);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14940);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public String getAsText(ReadablePartial partial, Locale locale) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14941);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14942);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public String getAsText(int fieldValue, Locale locale) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14943);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14944);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public String getAsShortText(long instant, Locale locale) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14945);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14946);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public String getAsShortText(long instant) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14947);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14948);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public String getAsShortText(ReadablePartial partial, int fieldValue, Locale locale) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14949);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14950);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public String getAsShortText(ReadablePartial partial, Locale locale) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14951);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14952);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public String getAsShortText(int fieldValue, Locale locale) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14953);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14954);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Delegates to the duration field.
     *
     * @throws UnsupportedOperationException if the duration is unsupported
     */
    public long add(long instant, int value) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14955);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14956);return getDurationField().add(instant, value);
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Delegates to the duration field.
     *
     * @throws UnsupportedOperationException if the duration is unsupported
     */
    public long add(long instant, long value) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14957);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14958);return getDurationField().add(instant, value);
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int[] add(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14959);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14960);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int[] addWrapPartial(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14961);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14962);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long addWrapField(long instant, int value) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14963);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14964);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int[] addWrapField(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14965);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14966);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Delegates to the duration field.
     *
     * @throws UnsupportedOperationException if the duration is unsupported
     */
    public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14967);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14968);return getDurationField().getDifference(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Delegates to the duration field.
     *
     * @throws UnsupportedOperationException if the duration is unsupported
     */
    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14969);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14970);return getDurationField().getDifferenceAsLong(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long set(long instant, int value) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14971);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14972);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int[] set(ReadablePartial instant, int fieldIndex, int[] values, int newValue) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14973);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14974);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long set(long instant, String text, Locale locale) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14975);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14976);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long set(long instant, String text) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14977);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14978);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int[] set(ReadablePartial instant, int fieldIndex, int[] values, String text, Locale locale) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14979);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14980);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Even though this DateTimeField is unsupported, the duration field might
     * be supported.
     *
     * @return a possibly supported DurationField
     */
    public DurationField getDurationField() {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14981);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14982);return iDurationField;
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always returns null.
     *
     * @return null always
     */
    public DurationField getRangeDurationField() {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14983);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14984);return null;
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public boolean isLeap(long instant) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14985);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14986);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getLeapAmount(long instant) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14987);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14988);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always returns null.
     *
     * @return null always
     */
    public DurationField getLeapDurationField() {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14989);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14990);return null;
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getMinimumValue() {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14991);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14992);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getMinimumValue(long instant) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14993);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14994);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getMinimumValue(ReadablePartial instant) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14995);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14996);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getMinimumValue(ReadablePartial instant, int[] values) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14997);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(14998);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getMaximumValue() {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(14999);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(15000);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getMaximumValue(long instant) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(15001);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(15002);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getMaximumValue(ReadablePartial instant) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(15003);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(15004);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getMaximumValue(ReadablePartial instant, int[] values) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(15005);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(15006);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getMaximumTextLength(Locale locale) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(15007);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(15008);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getMaximumShortTextLength(Locale locale) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(15009);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(15010);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long roundFloor(long instant) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(15011);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(15012);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long roundCeiling(long instant) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(15013);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(15014);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long roundHalfFloor(long instant) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(15015);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(15016);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long roundHalfCeiling(long instant) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(15017);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(15018);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long roundHalfEven(long instant) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(15019);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(15020);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long remainder(long instant) {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(15021);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(15022);throw unsupported();
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    //------------------------------------------------------------------------

    /**
     * Get a suitable debug string.
     *
     * @return debug string
     */
    public String toString() {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(15023);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(15024);return "UnsupportedDateTimeField";
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    /**
     * Ensure proper singleton serialization
     */
    private Object readResolve() {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(15025);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(15026);return getInstance(iType, iDurationField);
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

    private UnsupportedOperationException unsupported() {try{__CLR4_4_1bhwbhwlgchoqzb.R.inc(15027);
        __CLR4_4_1bhwbhwlgchoqzb.R.inc(15028);return new UnsupportedOperationException(iType + " field is unsupported");
    }finally{__CLR4_4_1bhwbhwlgchoqzb.R.flushNeeded();}}

}
