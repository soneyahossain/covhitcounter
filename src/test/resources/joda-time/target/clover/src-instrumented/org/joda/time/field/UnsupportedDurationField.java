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

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/**
 * A placeholder implementation to use when a duration field is not supported.
 * <p>
 * UnsupportedDurationField is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
public final class UnsupportedDurationField extends DurationField implements Serializable {public static class __CLR4_4_1blhblhlgchoqzf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,15104,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization lock.
     */
    private static final long serialVersionUID = -6390301302770925357L;

    /**
     * The cache of unsupported duration field instances
     */
    private static HashMap<DurationFieldType, UnsupportedDurationField> cCache;

    /**
     * Gets an instance of UnsupportedDurationField for a specific named field.
     * The returned instance is cached.
     *
     * @param type the type to obtain
     * @return the instance
     */
    public static synchronized UnsupportedDurationField getInstance(DurationFieldType type) {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15029);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15030);UnsupportedDurationField field;
        __CLR4_4_1blhblhlgchoqzf.R.inc(15031);if ((((cCache == null)&&(__CLR4_4_1blhblhlgchoqzf.R.iget(15032)!=0|true))||(__CLR4_4_1blhblhlgchoqzf.R.iget(15033)==0&false))) {{
            __CLR4_4_1blhblhlgchoqzf.R.inc(15034);cCache = new HashMap<DurationFieldType, UnsupportedDurationField>(7);
            __CLR4_4_1blhblhlgchoqzf.R.inc(15035);field = null;
        } }else {{
            __CLR4_4_1blhblhlgchoqzf.R.inc(15036);field = cCache.get(type);
        }
        }__CLR4_4_1blhblhlgchoqzf.R.inc(15037);if ((((field == null)&&(__CLR4_4_1blhblhlgchoqzf.R.iget(15038)!=0|true))||(__CLR4_4_1blhblhlgchoqzf.R.iget(15039)==0&false))) {{
            __CLR4_4_1blhblhlgchoqzf.R.inc(15040);field = new UnsupportedDurationField(type);
            __CLR4_4_1blhblhlgchoqzf.R.inc(15041);cCache.put(type, field);
        }
        }__CLR4_4_1blhblhlgchoqzf.R.inc(15042);return field;
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    /**
     * The name of the field
     */
    private final DurationFieldType iType;

    /**
     * Constructor.
     *
     * @param type the type to use
     */
    private UnsupportedDurationField(DurationFieldType type) {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15043);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15044);iType = type;
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // Design note: Simple Accessors return a suitable value, but methods
    // intended to perform calculations throw an UnsupportedOperationException.

    public final DurationFieldType getType() {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15045);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15046);return iType;
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    public String getName() {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15047);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15048);return iType.getName();
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    /**
     * This field is not supported.
     *
     * @return false always
     */
    public boolean isSupported() {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15049);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15050);return false;
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    /**
     * This field is precise.
     *
     * @return true always
     */
    public boolean isPrecise() {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15051);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15052);return true;
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getValue(long duration) {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15053);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15054);throw unsupported();
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long getValueAsLong(long duration) {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15055);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15056);throw unsupported();
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getValue(long duration, long instant) {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15057);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15058);throw unsupported();
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15059);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15060);throw unsupported();
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long getMillis(int value) {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15061);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15062);throw unsupported();
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long getMillis(long value) {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15063);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15064);throw unsupported();
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long getMillis(int value, long instant) {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15065);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15066);throw unsupported();
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long getMillis(long value, long instant) {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15067);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15068);throw unsupported();
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long add(long instant, int value) {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15069);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15070);throw unsupported();
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long add(long instant, long value) {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15071);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15072);throw unsupported();
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15073);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15074);throw unsupported();
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15075);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15076);throw unsupported();
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    /**
     * Always returns zero.
     *
     * @return zero always
     */
    public long getUnitMillis() {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15077);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15078);return 0;
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    /**
     * Always returns zero, indicating that sort order is not relevant.
     *
     * @return zero always
     */
    public int compareTo(DurationField durationField) {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15079);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15080);return 0;
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    //------------------------------------------------------------------------

    /**
     * Compares this duration field to another.
     *
     * @param obj the object to compare to
     * @return true if equal
     */
    public boolean equals(Object obj) {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15081);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15082);if ((((this == obj)&&(__CLR4_4_1blhblhlgchoqzf.R.iget(15083)!=0|true))||(__CLR4_4_1blhblhlgchoqzf.R.iget(15084)==0&false))) {{
            __CLR4_4_1blhblhlgchoqzf.R.inc(15085);return true;
        } }else {__CLR4_4_1blhblhlgchoqzf.R.inc(15086);if ((((obj instanceof UnsupportedDurationField)&&(__CLR4_4_1blhblhlgchoqzf.R.iget(15087)!=0|true))||(__CLR4_4_1blhblhlgchoqzf.R.iget(15088)==0&false))) {{
            __CLR4_4_1blhblhlgchoqzf.R.inc(15089);UnsupportedDurationField other = (UnsupportedDurationField) obj;
            __CLR4_4_1blhblhlgchoqzf.R.inc(15090);if ((((other.getName() == null)&&(__CLR4_4_1blhblhlgchoqzf.R.iget(15091)!=0|true))||(__CLR4_4_1blhblhlgchoqzf.R.iget(15092)==0&false))) {{
                __CLR4_4_1blhblhlgchoqzf.R.inc(15093);return (getName() == null);
            }
            }__CLR4_4_1blhblhlgchoqzf.R.inc(15094);return (other.getName().equals(getName()));
        }
        }}__CLR4_4_1blhblhlgchoqzf.R.inc(15095);return false;
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    /**
     * Gets a suitable hashcode.
     *
     * @return the hashcode
     */
    public int hashCode() {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15096);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15097);return getName().hashCode();
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    /**
     * Get a suitable debug string.
     *
     * @return debug string
     */
    public String toString() {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15098);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15099);return "UnsupportedDurationField[" + getName() + ']';
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    /**
     * Ensure proper singleton serialization
     */
    private Object readResolve() {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15100);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15101);return getInstance(iType);
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

    private UnsupportedOperationException unsupported() {try{__CLR4_4_1blhblhlgchoqzf.R.inc(15102);
        __CLR4_4_1blhblhlgchoqzf.R.inc(15103);return new UnsupportedOperationException(iType + " field is unsupported");
    }finally{__CLR4_4_1blhblhlgchoqzf.R.flushNeeded();}}

}
