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

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/**
 * <code>DelegatedDurationField</code> delegates each method call to the
 * duration field it wraps.
 * <p>
 * DelegatedDurationField is thread-safe and immutable, and its subclasses must
 * be as well.
 *
 * @author Brian S O'Neill
 * @see DecoratedDurationField
 * @since 1.0
 */
public class DelegatedDurationField extends DurationField implements Serializable {public static class __CLR4_4_1autautlgchoqxo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,14131,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization lock.
     */
    private static final long serialVersionUID = -5576443481242007829L;

    /**
     * The DurationField being wrapped
     */
    private final DurationField iField;
    /**
     * The field type
     */
    private final DurationFieldType iType;

    /**
     * Constructor.
     *
     * @param field the base field
     */
    protected DelegatedDurationField(DurationField field) {
        this(field, null);__CLR4_4_1autautlgchoqxo.R.inc(14070);try{__CLR4_4_1autautlgchoqxo.R.inc(14069);
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

    /**
     * Constructor.
     *
     * @param field the base field
     * @param type  the field type to use
     */
    protected DelegatedDurationField(DurationField field, DurationFieldType type) {
        super();__CLR4_4_1autautlgchoqxo.R.inc(14072);try{__CLR4_4_1autautlgchoqxo.R.inc(14071);
        __CLR4_4_1autautlgchoqxo.R.inc(14073);if ((((field == null)&&(__CLR4_4_1autautlgchoqxo.R.iget(14074)!=0|true))||(__CLR4_4_1autautlgchoqxo.R.iget(14075)==0&false))) {{
            __CLR4_4_1autautlgchoqxo.R.inc(14076);throw new IllegalArgumentException("The field must not be null");
        }
        }__CLR4_4_1autautlgchoqxo.R.inc(14077);iField = field;
        __CLR4_4_1autautlgchoqxo.R.inc(14078);iType = ((((type == null )&&(__CLR4_4_1autautlgchoqxo.R.iget(14079)!=0|true))||(__CLR4_4_1autautlgchoqxo.R.iget(14080)==0&false))? field.getType() : type);
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the wrapped duration field.
     *
     * @return the wrapped DurationField
     */
    public final DurationField getWrappedField() {try{__CLR4_4_1autautlgchoqxo.R.inc(14081);
        __CLR4_4_1autautlgchoqxo.R.inc(14082);return iField;
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

    public DurationFieldType getType() {try{__CLR4_4_1autautlgchoqxo.R.inc(14083);
        __CLR4_4_1autautlgchoqxo.R.inc(14084);return iType;
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

    public String getName() {try{__CLR4_4_1autautlgchoqxo.R.inc(14085);
        __CLR4_4_1autautlgchoqxo.R.inc(14086);return iType.getName();
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

    /**
     * Returns true if this field is supported.
     */
    public boolean isSupported() {try{__CLR4_4_1autautlgchoqxo.R.inc(14087);
        __CLR4_4_1autautlgchoqxo.R.inc(14088);return iField.isSupported();
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

    public boolean isPrecise() {try{__CLR4_4_1autautlgchoqxo.R.inc(14089);
        __CLR4_4_1autautlgchoqxo.R.inc(14090);return iField.isPrecise();
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

    public int getValue(long duration) {try{__CLR4_4_1autautlgchoqxo.R.inc(14091);
        __CLR4_4_1autautlgchoqxo.R.inc(14092);return iField.getValue(duration);
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

    public long getValueAsLong(long duration) {try{__CLR4_4_1autautlgchoqxo.R.inc(14093);
        __CLR4_4_1autautlgchoqxo.R.inc(14094);return iField.getValueAsLong(duration);
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

    public int getValue(long duration, long instant) {try{__CLR4_4_1autautlgchoqxo.R.inc(14095);
        __CLR4_4_1autautlgchoqxo.R.inc(14096);return iField.getValue(duration, instant);
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

    public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1autautlgchoqxo.R.inc(14097);
        __CLR4_4_1autautlgchoqxo.R.inc(14098);return iField.getValueAsLong(duration, instant);
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

    public long getMillis(int value) {try{__CLR4_4_1autautlgchoqxo.R.inc(14099);
        __CLR4_4_1autautlgchoqxo.R.inc(14100);return iField.getMillis(value);
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

    public long getMillis(long value) {try{__CLR4_4_1autautlgchoqxo.R.inc(14101);
        __CLR4_4_1autautlgchoqxo.R.inc(14102);return iField.getMillis(value);
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

    public long getMillis(int value, long instant) {try{__CLR4_4_1autautlgchoqxo.R.inc(14103);
        __CLR4_4_1autautlgchoqxo.R.inc(14104);return iField.getMillis(value, instant);
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

    public long getMillis(long value, long instant) {try{__CLR4_4_1autautlgchoqxo.R.inc(14105);
        __CLR4_4_1autautlgchoqxo.R.inc(14106);return iField.getMillis(value, instant);
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

    public long add(long instant, int value) {try{__CLR4_4_1autautlgchoqxo.R.inc(14107);
        __CLR4_4_1autautlgchoqxo.R.inc(14108);return iField.add(instant, value);
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

    public long add(long instant, long value) {try{__CLR4_4_1autautlgchoqxo.R.inc(14109);
        __CLR4_4_1autautlgchoqxo.R.inc(14110);return iField.add(instant, value);
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

    public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1autautlgchoqxo.R.inc(14111);
        __CLR4_4_1autautlgchoqxo.R.inc(14112);return iField.getDifference(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1autautlgchoqxo.R.inc(14113);
        __CLR4_4_1autautlgchoqxo.R.inc(14114);return iField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

    public long getUnitMillis() {try{__CLR4_4_1autautlgchoqxo.R.inc(14115);
        __CLR4_4_1autautlgchoqxo.R.inc(14116);return iField.getUnitMillis();
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

    public int compareTo(DurationField durationField) {try{__CLR4_4_1autautlgchoqxo.R.inc(14117);
        __CLR4_4_1autautlgchoqxo.R.inc(14118);return iField.compareTo(durationField);
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

    public boolean equals(Object obj) {try{__CLR4_4_1autautlgchoqxo.R.inc(14119);
        __CLR4_4_1autautlgchoqxo.R.inc(14120);if ((((obj instanceof DelegatedDurationField)&&(__CLR4_4_1autautlgchoqxo.R.iget(14121)!=0|true))||(__CLR4_4_1autautlgchoqxo.R.iget(14122)==0&false))) {{
            __CLR4_4_1autautlgchoqxo.R.inc(14123);return iField.equals(((DelegatedDurationField) obj).iField);
        }
        }__CLR4_4_1autautlgchoqxo.R.inc(14124);return false;
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

    public int hashCode() {try{__CLR4_4_1autautlgchoqxo.R.inc(14125);
        __CLR4_4_1autautlgchoqxo.R.inc(14126);return iField.hashCode() ^ iType.hashCode();
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

    public String toString() {try{__CLR4_4_1autautlgchoqxo.R.inc(14127);
        __CLR4_4_1autautlgchoqxo.R.inc(14128);return ((((iType == null) )&&(__CLR4_4_1autautlgchoqxo.R.iget(14129)!=0|true))||(__CLR4_4_1autautlgchoqxo.R.iget(14130)==0&false))? iField.toString() :
                ("DurationField[" + iType + ']');
    }finally{__CLR4_4_1autautlgchoqxo.R.flushNeeded();}}

}
