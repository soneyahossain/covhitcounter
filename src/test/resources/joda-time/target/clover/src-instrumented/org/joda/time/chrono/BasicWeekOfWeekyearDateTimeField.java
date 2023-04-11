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
package org.joda.time.chrono;

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.PreciseDurationDateTimeField;

/**
 * Provides time calculations for the week of a week based year component of time.
 *
 * @author Guy Allard
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.1, refactored from GJWeekOfWeekyearDateTimeField
 */
final class BasicWeekOfWeekyearDateTimeField extends PreciseDurationDateTimeField {public static class __CLR4_4_17ko7kolgchoqpq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,9860,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @SuppressWarnings("unused")
    private static final long serialVersionUID = -1587436826395135328L;

    private final BasicChronology iChronology;

    /**
     * Restricted constructor
     */
    BasicWeekOfWeekyearDateTimeField(BasicChronology chronology, DurationField weeks) {
        super(DateTimeFieldType.weekOfWeekyear(), weeks);__CLR4_4_17ko7kolgchoqpq.R.inc(9817);try{__CLR4_4_17ko7kolgchoqpq.R.inc(9816);
        __CLR4_4_17ko7kolgchoqpq.R.inc(9818);iChronology = chronology;
    }finally{__CLR4_4_17ko7kolgchoqpq.R.flushNeeded();}}

    /**
     * Get the week of a week based year component of the specified time instant.
     *
     * @param instant the time instant in millis to query.
     * @return the week of the year extracted from the input.
     * @see org.joda.time.DateTimeField#get(long)
     */
    public int get(long instant) {try{__CLR4_4_17ko7kolgchoqpq.R.inc(9819);
        __CLR4_4_17ko7kolgchoqpq.R.inc(9820);return iChronology.getWeekOfWeekyear(instant);
    }finally{__CLR4_4_17ko7kolgchoqpq.R.flushNeeded();}}

    public DurationField getRangeDurationField() {try{__CLR4_4_17ko7kolgchoqpq.R.inc(9821);
        __CLR4_4_17ko7kolgchoqpq.R.inc(9822);return iChronology.weekyears();
    }finally{__CLR4_4_17ko7kolgchoqpq.R.flushNeeded();}}

    // 1970-01-01 is day of week 4, Thursday. The rounding methods need to
    // apply a corrective alignment since weeks begin on day of week 1, Monday.

    public long roundFloor(long instant) {try{__CLR4_4_17ko7kolgchoqpq.R.inc(9823);
        __CLR4_4_17ko7kolgchoqpq.R.inc(9824);return super.roundFloor(instant + 3 * DateTimeConstants.MILLIS_PER_DAY)
                - 3 * DateTimeConstants.MILLIS_PER_DAY;
    }finally{__CLR4_4_17ko7kolgchoqpq.R.flushNeeded();}}

    public long roundCeiling(long instant) {try{__CLR4_4_17ko7kolgchoqpq.R.inc(9825);
        __CLR4_4_17ko7kolgchoqpq.R.inc(9826);return super.roundCeiling(instant + 3 * DateTimeConstants.MILLIS_PER_DAY)
                - 3 * DateTimeConstants.MILLIS_PER_DAY;
    }finally{__CLR4_4_17ko7kolgchoqpq.R.flushNeeded();}}

    public long remainder(long instant) {try{__CLR4_4_17ko7kolgchoqpq.R.inc(9827);
        __CLR4_4_17ko7kolgchoqpq.R.inc(9828);return super.remainder(instant + 3 * DateTimeConstants.MILLIS_PER_DAY);
    }finally{__CLR4_4_17ko7kolgchoqpq.R.flushNeeded();}}

    public int getMinimumValue() {try{__CLR4_4_17ko7kolgchoqpq.R.inc(9829);
        __CLR4_4_17ko7kolgchoqpq.R.inc(9830);return 1;
    }finally{__CLR4_4_17ko7kolgchoqpq.R.flushNeeded();}}

    public int getMaximumValue() {try{__CLR4_4_17ko7kolgchoqpq.R.inc(9831);
        __CLR4_4_17ko7kolgchoqpq.R.inc(9832);return 53;
    }finally{__CLR4_4_17ko7kolgchoqpq.R.flushNeeded();}}

    public int getMaximumValue(long instant) {try{__CLR4_4_17ko7kolgchoqpq.R.inc(9833);
        __CLR4_4_17ko7kolgchoqpq.R.inc(9834);int weekyear = iChronology.getWeekyear(instant);
        __CLR4_4_17ko7kolgchoqpq.R.inc(9835);return iChronology.getWeeksInYear(weekyear);
    }finally{__CLR4_4_17ko7kolgchoqpq.R.flushNeeded();}}

    public int getMaximumValue(ReadablePartial partial) {try{__CLR4_4_17ko7kolgchoqpq.R.inc(9836);
        __CLR4_4_17ko7kolgchoqpq.R.inc(9837);if ((((partial.isSupported(DateTimeFieldType.weekyear()))&&(__CLR4_4_17ko7kolgchoqpq.R.iget(9838)!=0|true))||(__CLR4_4_17ko7kolgchoqpq.R.iget(9839)==0&false))) {{
            __CLR4_4_17ko7kolgchoqpq.R.inc(9840);int weekyear = partial.get(DateTimeFieldType.weekyear());
            __CLR4_4_17ko7kolgchoqpq.R.inc(9841);return iChronology.getWeeksInYear(weekyear);
        }
        }__CLR4_4_17ko7kolgchoqpq.R.inc(9842);return 53;
    }finally{__CLR4_4_17ko7kolgchoqpq.R.flushNeeded();}}

    public int getMaximumValue(ReadablePartial partial, int[] values) {try{__CLR4_4_17ko7kolgchoqpq.R.inc(9843);
        __CLR4_4_17ko7kolgchoqpq.R.inc(9844);int size = partial.size();
        __CLR4_4_17ko7kolgchoqpq.R.inc(9845);for (int i = 0; (((i < size)&&(__CLR4_4_17ko7kolgchoqpq.R.iget(9846)!=0|true))||(__CLR4_4_17ko7kolgchoqpq.R.iget(9847)==0&false)); i++) {{
            __CLR4_4_17ko7kolgchoqpq.R.inc(9848);if ((((partial.getFieldType(i) == DateTimeFieldType.weekyear())&&(__CLR4_4_17ko7kolgchoqpq.R.iget(9849)!=0|true))||(__CLR4_4_17ko7kolgchoqpq.R.iget(9850)==0&false))) {{
                __CLR4_4_17ko7kolgchoqpq.R.inc(9851);int weekyear = values[i];
                __CLR4_4_17ko7kolgchoqpq.R.inc(9852);return iChronology.getWeeksInYear(weekyear);
            }
        }}
        }__CLR4_4_17ko7kolgchoqpq.R.inc(9853);return 53;
    }finally{__CLR4_4_17ko7kolgchoqpq.R.flushNeeded();}}

    protected int getMaximumValueForSet(long instant, int value) {try{__CLR4_4_17ko7kolgchoqpq.R.inc(9854);
        __CLR4_4_17ko7kolgchoqpq.R.inc(9855);return (((value > 52 )&&(__CLR4_4_17ko7kolgchoqpq.R.iget(9856)!=0|true))||(__CLR4_4_17ko7kolgchoqpq.R.iget(9857)==0&false))? getMaximumValue(instant) : 52;
    }finally{__CLR4_4_17ko7kolgchoqpq.R.flushNeeded();}}

    /**
     * Serialization singleton
     */
    private Object readResolve() {try{__CLR4_4_17ko7kolgchoqpq.R.inc(9858);
        __CLR4_4_17ko7kolgchoqpq.R.inc(9859);return iChronology.weekOfWeekyear();
    }finally{__CLR4_4_17ko7kolgchoqpq.R.flushNeeded();}}
}
