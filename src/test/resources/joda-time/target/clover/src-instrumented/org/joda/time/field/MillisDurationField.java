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
 * Duration field class representing a field with a fixed unit length of one
 * millisecond.
 * <p>
 * MillisDurationField is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
public final class MillisDurationField extends DurationField implements Serializable {public static class __CLR4_4_1b53b53lgchoqyb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,14499,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization lock.
     */
    private static final long serialVersionUID = 2656707858124633367L;

    /**
     * Singleton instance.
     */
    public static final DurationField INSTANCE = new MillisDurationField();

    /**
     * Restricted constructor.
     */
    private MillisDurationField() {
        super();__CLR4_4_1b53b53lgchoqyb.R.inc(14440);try{__CLR4_4_1b53b53lgchoqyb.R.inc(14439);
    }finally{__CLR4_4_1b53b53lgchoqyb.R.flushNeeded();}}

    //------------------------------------------------------------------------
    public DurationFieldType getType() {try{__CLR4_4_1b53b53lgchoqyb.R.inc(14441);
        __CLR4_4_1b53b53lgchoqyb.R.inc(14442);return DurationFieldType.millis();
    }finally{__CLR4_4_1b53b53lgchoqyb.R.flushNeeded();}}

    public String getName() {try{__CLR4_4_1b53b53lgchoqyb.R.inc(14443);
        __CLR4_4_1b53b53lgchoqyb.R.inc(14444);return "millis";
    }finally{__CLR4_4_1b53b53lgchoqyb.R.flushNeeded();}}

    /**
     * Returns true as this field is supported.
     *
     * @return true always
     */
    public boolean isSupported() {try{__CLR4_4_1b53b53lgchoqyb.R.inc(14445);
        __CLR4_4_1b53b53lgchoqyb.R.inc(14446);return true;
    }finally{__CLR4_4_1b53b53lgchoqyb.R.flushNeeded();}}

    /**
     * Returns true as this field is precise.
     *
     * @return true always
     */
    public final boolean isPrecise() {try{__CLR4_4_1b53b53lgchoqyb.R.inc(14447);
        __CLR4_4_1b53b53lgchoqyb.R.inc(14448);return true;
    }finally{__CLR4_4_1b53b53lgchoqyb.R.flushNeeded();}}

    /**
     * Returns the amount of milliseconds per unit value of this field.
     *
     * @return one always
     */
    public final long getUnitMillis() {try{__CLR4_4_1b53b53lgchoqyb.R.inc(14449);
        __CLR4_4_1b53b53lgchoqyb.R.inc(14450);return 1;
    }finally{__CLR4_4_1b53b53lgchoqyb.R.flushNeeded();}}

    //------------------------------------------------------------------------
    public int getValue(long duration) {try{__CLR4_4_1b53b53lgchoqyb.R.inc(14451);
        __CLR4_4_1b53b53lgchoqyb.R.inc(14452);return FieldUtils.safeToInt(duration);
    }finally{__CLR4_4_1b53b53lgchoqyb.R.flushNeeded();}}

    public long getValueAsLong(long duration) {try{__CLR4_4_1b53b53lgchoqyb.R.inc(14453);
        __CLR4_4_1b53b53lgchoqyb.R.inc(14454);return duration;
    }finally{__CLR4_4_1b53b53lgchoqyb.R.flushNeeded();}}

    public int getValue(long duration, long instant) {try{__CLR4_4_1b53b53lgchoqyb.R.inc(14455);
        __CLR4_4_1b53b53lgchoqyb.R.inc(14456);return FieldUtils.safeToInt(duration);
    }finally{__CLR4_4_1b53b53lgchoqyb.R.flushNeeded();}}

    public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1b53b53lgchoqyb.R.inc(14457);
        __CLR4_4_1b53b53lgchoqyb.R.inc(14458);return duration;
    }finally{__CLR4_4_1b53b53lgchoqyb.R.flushNeeded();}}

    public long getMillis(int value) {try{__CLR4_4_1b53b53lgchoqyb.R.inc(14459);
        __CLR4_4_1b53b53lgchoqyb.R.inc(14460);return value;
    }finally{__CLR4_4_1b53b53lgchoqyb.R.flushNeeded();}}

    public long getMillis(long value) {try{__CLR4_4_1b53b53lgchoqyb.R.inc(14461);
        __CLR4_4_1b53b53lgchoqyb.R.inc(14462);return value;
    }finally{__CLR4_4_1b53b53lgchoqyb.R.flushNeeded();}}

    public long getMillis(int value, long instant) {try{__CLR4_4_1b53b53lgchoqyb.R.inc(14463);
        __CLR4_4_1b53b53lgchoqyb.R.inc(14464);return value;
    }finally{__CLR4_4_1b53b53lgchoqyb.R.flushNeeded();}}

    public long getMillis(long value, long instant) {try{__CLR4_4_1b53b53lgchoqyb.R.inc(14465);
        __CLR4_4_1b53b53lgchoqyb.R.inc(14466);return value;
    }finally{__CLR4_4_1b53b53lgchoqyb.R.flushNeeded();}}

    public long add(long instant, int value) {try{__CLR4_4_1b53b53lgchoqyb.R.inc(14467);
        __CLR4_4_1b53b53lgchoqyb.R.inc(14468);return FieldUtils.safeAdd(instant, value);
    }finally{__CLR4_4_1b53b53lgchoqyb.R.flushNeeded();}}

    public long add(long instant, long value) {try{__CLR4_4_1b53b53lgchoqyb.R.inc(14469);
        __CLR4_4_1b53b53lgchoqyb.R.inc(14470);return FieldUtils.safeAdd(instant, value);
    }finally{__CLR4_4_1b53b53lgchoqyb.R.flushNeeded();}}

    public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1b53b53lgchoqyb.R.inc(14471);
        __CLR4_4_1b53b53lgchoqyb.R.inc(14472);return FieldUtils.safeToInt(FieldUtils.safeSubtract(minuendInstant, subtrahendInstant));
    }finally{__CLR4_4_1b53b53lgchoqyb.R.flushNeeded();}}

    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1b53b53lgchoqyb.R.inc(14473);
        __CLR4_4_1b53b53lgchoqyb.R.inc(14474);return FieldUtils.safeSubtract(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_1b53b53lgchoqyb.R.flushNeeded();}}

    //------------------------------------------------------------------------
    public int compareTo(DurationField otherField) {try{__CLR4_4_1b53b53lgchoqyb.R.inc(14475);
        __CLR4_4_1b53b53lgchoqyb.R.inc(14476);long otherMillis = otherField.getUnitMillis();
        __CLR4_4_1b53b53lgchoqyb.R.inc(14477);long thisMillis = getUnitMillis();
        // cannot do (thisMillis - otherMillis) as can overflow
        __CLR4_4_1b53b53lgchoqyb.R.inc(14478);if ((((thisMillis == otherMillis)&&(__CLR4_4_1b53b53lgchoqyb.R.iget(14479)!=0|true))||(__CLR4_4_1b53b53lgchoqyb.R.iget(14480)==0&false))) {{
            __CLR4_4_1b53b53lgchoqyb.R.inc(14481);return 0;
        }
        }__CLR4_4_1b53b53lgchoqyb.R.inc(14482);if ((((thisMillis < otherMillis)&&(__CLR4_4_1b53b53lgchoqyb.R.iget(14483)!=0|true))||(__CLR4_4_1b53b53lgchoqyb.R.iget(14484)==0&false))) {{
            __CLR4_4_1b53b53lgchoqyb.R.inc(14485);return -1;
        } }else {{
            __CLR4_4_1b53b53lgchoqyb.R.inc(14486);return 1;
        }
    }}finally{__CLR4_4_1b53b53lgchoqyb.R.flushNeeded();}}

    public boolean equals(Object obj) {try{__CLR4_4_1b53b53lgchoqyb.R.inc(14487);
        __CLR4_4_1b53b53lgchoqyb.R.inc(14488);if ((((obj instanceof MillisDurationField)&&(__CLR4_4_1b53b53lgchoqyb.R.iget(14489)!=0|true))||(__CLR4_4_1b53b53lgchoqyb.R.iget(14490)==0&false))) {{
            __CLR4_4_1b53b53lgchoqyb.R.inc(14491);return getUnitMillis() == ((MillisDurationField) obj).getUnitMillis();
        }
        }__CLR4_4_1b53b53lgchoqyb.R.inc(14492);return false;
    }finally{__CLR4_4_1b53b53lgchoqyb.R.flushNeeded();}}

    public int hashCode() {try{__CLR4_4_1b53b53lgchoqyb.R.inc(14493);
        __CLR4_4_1b53b53lgchoqyb.R.inc(14494);return (int) getUnitMillis();
    }finally{__CLR4_4_1b53b53lgchoqyb.R.flushNeeded();}}

    /**
     * Get a suitable debug string.
     *
     * @return debug string
     */
    public String toString() {try{__CLR4_4_1b53b53lgchoqyb.R.inc(14495);
        __CLR4_4_1b53b53lgchoqyb.R.inc(14496);return "DurationField[millis]";
    }finally{__CLR4_4_1b53b53lgchoqyb.R.flushNeeded();}}

    /**
     * Deserialize to the singleton.
     */
    private Object readResolve() {try{__CLR4_4_1b53b53lgchoqyb.R.inc(14497);
        __CLR4_4_1b53b53lgchoqyb.R.inc(14498);return INSTANCE;
    }finally{__CLR4_4_1b53b53lgchoqyb.R.flushNeeded();}}

}
