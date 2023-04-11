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
 * Provides time calculations for the day of the year component of time.
 *
 * @author Guy Allard
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.1, refactored from GJDayOfYearDateTimeField
 */
final class BasicDayOfYearDateTimeField extends PreciseDurationDateTimeField {public static class __CLR4_4_1783783lgchoqod{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,9404,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @SuppressWarnings("unused")
    private static final long serialVersionUID = -6821236822336841037L;

    private final BasicChronology iChronology;

    /**
     * Restricted constructor
     */
    BasicDayOfYearDateTimeField(BasicChronology chronology, DurationField days) {
        super(DateTimeFieldType.dayOfYear(), days);__CLR4_4_1783783lgchoqod.R.inc(9364);try{__CLR4_4_1783783lgchoqod.R.inc(9363);
        __CLR4_4_1783783lgchoqod.R.inc(9365);iChronology = chronology;
    }finally{__CLR4_4_1783783lgchoqod.R.flushNeeded();}}

    /**
     * Get the day of the year component of the specified time instant.
     *
     * @param instant the time instant in millis to query.
     * @return the day of the year extracted from the input.
     */
    public int get(long instant) {try{__CLR4_4_1783783lgchoqod.R.inc(9366);
        __CLR4_4_1783783lgchoqod.R.inc(9367);return iChronology.getDayOfYear(instant);
    }finally{__CLR4_4_1783783lgchoqod.R.flushNeeded();}}

    public DurationField getRangeDurationField() {try{__CLR4_4_1783783lgchoqod.R.inc(9368);
        __CLR4_4_1783783lgchoqod.R.inc(9369);return iChronology.years();
    }finally{__CLR4_4_1783783lgchoqod.R.flushNeeded();}}

    public int getMinimumValue() {try{__CLR4_4_1783783lgchoqod.R.inc(9370);
        __CLR4_4_1783783lgchoqod.R.inc(9371);return 1;
    }finally{__CLR4_4_1783783lgchoqod.R.flushNeeded();}}

    public int getMaximumValue() {try{__CLR4_4_1783783lgchoqod.R.inc(9372);
        __CLR4_4_1783783lgchoqod.R.inc(9373);return iChronology.getDaysInYearMax();
    }finally{__CLR4_4_1783783lgchoqod.R.flushNeeded();}}

    public int getMaximumValue(long instant) {try{__CLR4_4_1783783lgchoqod.R.inc(9374);
        __CLR4_4_1783783lgchoqod.R.inc(9375);int year = iChronology.getYear(instant);
        __CLR4_4_1783783lgchoqod.R.inc(9376);return iChronology.getDaysInYear(year);
    }finally{__CLR4_4_1783783lgchoqod.R.flushNeeded();}}

    public int getMaximumValue(ReadablePartial partial) {try{__CLR4_4_1783783lgchoqod.R.inc(9377);
        __CLR4_4_1783783lgchoqod.R.inc(9378);if ((((partial.isSupported(DateTimeFieldType.year()))&&(__CLR4_4_1783783lgchoqod.R.iget(9379)!=0|true))||(__CLR4_4_1783783lgchoqod.R.iget(9380)==0&false))) {{
            __CLR4_4_1783783lgchoqod.R.inc(9381);int year = partial.get(DateTimeFieldType.year());
            __CLR4_4_1783783lgchoqod.R.inc(9382);return iChronology.getDaysInYear(year);
        }
        }__CLR4_4_1783783lgchoqod.R.inc(9383);return iChronology.getDaysInYearMax();
    }finally{__CLR4_4_1783783lgchoqod.R.flushNeeded();}}

    public int getMaximumValue(ReadablePartial partial, int[] values) {try{__CLR4_4_1783783lgchoqod.R.inc(9384);
        __CLR4_4_1783783lgchoqod.R.inc(9385);int size = partial.size();
        __CLR4_4_1783783lgchoqod.R.inc(9386);for (int i = 0; (((i < size)&&(__CLR4_4_1783783lgchoqod.R.iget(9387)!=0|true))||(__CLR4_4_1783783lgchoqod.R.iget(9388)==0&false)); i++) {{
            __CLR4_4_1783783lgchoqod.R.inc(9389);if ((((partial.getFieldType(i) == DateTimeFieldType.year())&&(__CLR4_4_1783783lgchoqod.R.iget(9390)!=0|true))||(__CLR4_4_1783783lgchoqod.R.iget(9391)==0&false))) {{
                __CLR4_4_1783783lgchoqod.R.inc(9392);int year = values[i];
                __CLR4_4_1783783lgchoqod.R.inc(9393);return iChronology.getDaysInYear(year);
            }
        }}
        }__CLR4_4_1783783lgchoqod.R.inc(9394);return iChronology.getDaysInYearMax();
    }finally{__CLR4_4_1783783lgchoqod.R.flushNeeded();}}

    protected int getMaximumValueForSet(long instant, int value) {try{__CLR4_4_1783783lgchoqod.R.inc(9395);
        __CLR4_4_1783783lgchoqod.R.inc(9396);int maxLessOne = iChronology.getDaysInYearMax() - 1;
        __CLR4_4_1783783lgchoqod.R.inc(9397);return ((((value > maxLessOne || value < 1) )&&(__CLR4_4_1783783lgchoqod.R.iget(9398)!=0|true))||(__CLR4_4_1783783lgchoqod.R.iget(9399)==0&false))? getMaximumValue(instant) : maxLessOne;
    }finally{__CLR4_4_1783783lgchoqod.R.flushNeeded();}}

    @Override
    public boolean isLeap(long instant) {try{__CLR4_4_1783783lgchoqod.R.inc(9400);
        __CLR4_4_1783783lgchoqod.R.inc(9401);return iChronology.isLeapDay(instant);
    }finally{__CLR4_4_1783783lgchoqod.R.flushNeeded();}}

    /**
     * Serialization singleton
     */
    private Object readResolve() {try{__CLR4_4_1783783lgchoqod.R.inc(9402);
        __CLR4_4_1783783lgchoqod.R.inc(9403);return iChronology.dayOfYear();
    }finally{__CLR4_4_1783783lgchoqod.R.flushNeeded();}}
}
