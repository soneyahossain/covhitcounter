/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2014 Stephen Colebourne
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

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.PreciseDurationDateTimeField;

/**
 * Provides time calculations for the day of the month component of time.
 *
 * @author Guy Allard
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.1, refactored from GJDayOfMonthDateTimeField
 */
final class BasicDayOfMonthDateTimeField extends PreciseDurationDateTimeField {public static class __CLR4_4_176p76plgchoqob{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,9363,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @SuppressWarnings("unused")
    private static final long serialVersionUID = -4677223814028011723L;

    private final BasicChronology iChronology;

    /**
     * Restricted constructor.
     */
    BasicDayOfMonthDateTimeField(BasicChronology chronology, DurationField days) {
        super(DateTimeFieldType.dayOfMonth(), days);__CLR4_4_176p76plgchoqob.R.inc(9314);try{__CLR4_4_176p76plgchoqob.R.inc(9313);
        __CLR4_4_176p76plgchoqob.R.inc(9315);iChronology = chronology;
    }finally{__CLR4_4_176p76plgchoqob.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public int get(long instant) {try{__CLR4_4_176p76plgchoqob.R.inc(9316);
        __CLR4_4_176p76plgchoqob.R.inc(9317);return iChronology.getDayOfMonth(instant);
    }finally{__CLR4_4_176p76plgchoqob.R.flushNeeded();}}

    public DurationField getRangeDurationField() {try{__CLR4_4_176p76plgchoqob.R.inc(9318);
        __CLR4_4_176p76plgchoqob.R.inc(9319);return iChronology.months();
    }finally{__CLR4_4_176p76plgchoqob.R.flushNeeded();}}

    public int getMinimumValue() {try{__CLR4_4_176p76plgchoqob.R.inc(9320);
        __CLR4_4_176p76plgchoqob.R.inc(9321);return 1;
    }finally{__CLR4_4_176p76plgchoqob.R.flushNeeded();}}

    public int getMaximumValue() {try{__CLR4_4_176p76plgchoqob.R.inc(9322);
        __CLR4_4_176p76plgchoqob.R.inc(9323);return iChronology.getDaysInMonthMax();
    }finally{__CLR4_4_176p76plgchoqob.R.flushNeeded();}}

    public int getMaximumValue(long instant) {try{__CLR4_4_176p76plgchoqob.R.inc(9324);
        __CLR4_4_176p76plgchoqob.R.inc(9325);return iChronology.getDaysInMonthMax(instant);
    }finally{__CLR4_4_176p76plgchoqob.R.flushNeeded();}}

    public int getMaximumValue(ReadablePartial partial) {try{__CLR4_4_176p76plgchoqob.R.inc(9326);
        __CLR4_4_176p76plgchoqob.R.inc(9327);if ((((partial.isSupported(DateTimeFieldType.monthOfYear()))&&(__CLR4_4_176p76plgchoqob.R.iget(9328)!=0|true))||(__CLR4_4_176p76plgchoqob.R.iget(9329)==0&false))) {{
            __CLR4_4_176p76plgchoqob.R.inc(9330);int month = partial.get(DateTimeFieldType.monthOfYear());
            __CLR4_4_176p76plgchoqob.R.inc(9331);if ((((partial.isSupported(DateTimeFieldType.year()))&&(__CLR4_4_176p76plgchoqob.R.iget(9332)!=0|true))||(__CLR4_4_176p76plgchoqob.R.iget(9333)==0&false))) {{
                __CLR4_4_176p76plgchoqob.R.inc(9334);int year = partial.get(DateTimeFieldType.year());
                __CLR4_4_176p76plgchoqob.R.inc(9335);return iChronology.getDaysInYearMonth(year, month);
            }
            }__CLR4_4_176p76plgchoqob.R.inc(9336);return iChronology.getDaysInMonthMax(month);
        }
        }__CLR4_4_176p76plgchoqob.R.inc(9337);return getMaximumValue();
    }finally{__CLR4_4_176p76plgchoqob.R.flushNeeded();}}

    public int getMaximumValue(ReadablePartial partial, int[] values) {try{__CLR4_4_176p76plgchoqob.R.inc(9338);
        __CLR4_4_176p76plgchoqob.R.inc(9339);int size = partial.size();
        __CLR4_4_176p76plgchoqob.R.inc(9340);for (int i = 0; (((i < size)&&(__CLR4_4_176p76plgchoqob.R.iget(9341)!=0|true))||(__CLR4_4_176p76plgchoqob.R.iget(9342)==0&false)); i++) {{
            __CLR4_4_176p76plgchoqob.R.inc(9343);if ((((partial.getFieldType(i) == DateTimeFieldType.monthOfYear())&&(__CLR4_4_176p76plgchoqob.R.iget(9344)!=0|true))||(__CLR4_4_176p76plgchoqob.R.iget(9345)==0&false))) {{
                __CLR4_4_176p76plgchoqob.R.inc(9346);int month = values[i];
                __CLR4_4_176p76plgchoqob.R.inc(9347);for (int j = 0; (((j < size)&&(__CLR4_4_176p76plgchoqob.R.iget(9348)!=0|true))||(__CLR4_4_176p76plgchoqob.R.iget(9349)==0&false)); j++) {{
                    __CLR4_4_176p76plgchoqob.R.inc(9350);if ((((partial.getFieldType(j) == DateTimeFieldType.year())&&(__CLR4_4_176p76plgchoqob.R.iget(9351)!=0|true))||(__CLR4_4_176p76plgchoqob.R.iget(9352)==0&false))) {{
                        __CLR4_4_176p76plgchoqob.R.inc(9353);int year = values[j];
                        __CLR4_4_176p76plgchoqob.R.inc(9354);return iChronology.getDaysInYearMonth(year, month);
                    }
                }}
                }__CLR4_4_176p76plgchoqob.R.inc(9355);return iChronology.getDaysInMonthMax(month);
            }
        }}
        }__CLR4_4_176p76plgchoqob.R.inc(9356);return getMaximumValue();
    }finally{__CLR4_4_176p76plgchoqob.R.flushNeeded();}}

    protected int getMaximumValueForSet(long instant, int value) {try{__CLR4_4_176p76plgchoqob.R.inc(9357);
        __CLR4_4_176p76plgchoqob.R.inc(9358);return iChronology.getDaysInMonthMaxForSet(instant, value);
    }finally{__CLR4_4_176p76plgchoqob.R.flushNeeded();}}

    @Override
    public boolean isLeap(long instant) {try{__CLR4_4_176p76plgchoqob.R.inc(9359);
        __CLR4_4_176p76plgchoqob.R.inc(9360);return iChronology.isLeapDay(instant);
    }finally{__CLR4_4_176p76plgchoqob.R.flushNeeded();}}

    /**
     * Serialization singleton
     */
    private Object readResolve() {try{__CLR4_4_176p76plgchoqob.R.inc(9361);
        __CLR4_4_176p76plgchoqob.R.inc(9362);return iChronology.dayOfMonth();
    }finally{__CLR4_4_176p76plgchoqob.R.flushNeeded();}}
}
