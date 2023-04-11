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

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.DecoratedDateTimeField;
import org.joda.time.field.FieldUtils;

/**
 * This field is not publicly exposed by ISOChronology, but rather it is used to
 * build the yearOfCentury and centuryOfEra fields. It merely drops the sign of
 * the year.
 *
 * @author Brian S O'Neill
 * @see GJYearOfEraDateTimeField
 * @since 1.0
 */
class ISOYearOfEraDateTimeField extends DecoratedDateTimeField {public static class __CLR4_4_18sj8sjlgchoqsq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,11435,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @SuppressWarnings("unused")
    private static final long serialVersionUID = 7037524068969447317L;

    /**
     * Singleton instance
     */
    static final DateTimeField INSTANCE = new ISOYearOfEraDateTimeField();

    /**
     * Restricted constructor.
     */
    private ISOYearOfEraDateTimeField() {
        super(GregorianChronology.getInstanceUTC().year(), DateTimeFieldType.yearOfEra());__CLR4_4_18sj8sjlgchoqsq.R.inc(11396);try{__CLR4_4_18sj8sjlgchoqsq.R.inc(11395);
    }finally{__CLR4_4_18sj8sjlgchoqsq.R.flushNeeded();}}

    @Override
    public DurationField getRangeDurationField() {try{__CLR4_4_18sj8sjlgchoqsq.R.inc(11397);
        __CLR4_4_18sj8sjlgchoqsq.R.inc(11398);return GregorianChronology.getInstanceUTC().eras();
    }finally{__CLR4_4_18sj8sjlgchoqsq.R.flushNeeded();}}

    public int get(long instant) {try{__CLR4_4_18sj8sjlgchoqsq.R.inc(11399);
        __CLR4_4_18sj8sjlgchoqsq.R.inc(11400);int year = getWrappedField().get(instant);
        __CLR4_4_18sj8sjlgchoqsq.R.inc(11401);return (((year < 0 )&&(__CLR4_4_18sj8sjlgchoqsq.R.iget(11402)!=0|true))||(__CLR4_4_18sj8sjlgchoqsq.R.iget(11403)==0&false))? -year : year;
    }finally{__CLR4_4_18sj8sjlgchoqsq.R.flushNeeded();}}

    public long add(long instant, int years) {try{__CLR4_4_18sj8sjlgchoqsq.R.inc(11404);
        __CLR4_4_18sj8sjlgchoqsq.R.inc(11405);return getWrappedField().add(instant, years);
    }finally{__CLR4_4_18sj8sjlgchoqsq.R.flushNeeded();}}

    public long add(long instant, long years) {try{__CLR4_4_18sj8sjlgchoqsq.R.inc(11406);
        __CLR4_4_18sj8sjlgchoqsq.R.inc(11407);return getWrappedField().add(instant, years);
    }finally{__CLR4_4_18sj8sjlgchoqsq.R.flushNeeded();}}

    public long addWrapField(long instant, int years) {try{__CLR4_4_18sj8sjlgchoqsq.R.inc(11408);
        __CLR4_4_18sj8sjlgchoqsq.R.inc(11409);return getWrappedField().addWrapField(instant, years);
    }finally{__CLR4_4_18sj8sjlgchoqsq.R.flushNeeded();}}

    public int[] addWrapField(ReadablePartial instant, int fieldIndex, int[] values, int years) {try{__CLR4_4_18sj8sjlgchoqsq.R.inc(11410);
        __CLR4_4_18sj8sjlgchoqsq.R.inc(11411);return getWrappedField().addWrapField(instant, fieldIndex, values, years);
    }finally{__CLR4_4_18sj8sjlgchoqsq.R.flushNeeded();}}

    public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_18sj8sjlgchoqsq.R.inc(11412);
        __CLR4_4_18sj8sjlgchoqsq.R.inc(11413);return getWrappedField().getDifference(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_18sj8sjlgchoqsq.R.flushNeeded();}}

    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_18sj8sjlgchoqsq.R.inc(11414);
        __CLR4_4_18sj8sjlgchoqsq.R.inc(11415);return getWrappedField().getDifferenceAsLong(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_18sj8sjlgchoqsq.R.flushNeeded();}}

    public long set(long instant, int year) {try{__CLR4_4_18sj8sjlgchoqsq.R.inc(11416);
        __CLR4_4_18sj8sjlgchoqsq.R.inc(11417);FieldUtils.verifyValueBounds(this, year, 0, getMaximumValue());
        __CLR4_4_18sj8sjlgchoqsq.R.inc(11418);if ((((getWrappedField().get(instant) < 0)&&(__CLR4_4_18sj8sjlgchoqsq.R.iget(11419)!=0|true))||(__CLR4_4_18sj8sjlgchoqsq.R.iget(11420)==0&false))) {{
            __CLR4_4_18sj8sjlgchoqsq.R.inc(11421);year = -year;
        }
        }__CLR4_4_18sj8sjlgchoqsq.R.inc(11422);return super.set(instant, year);
    }finally{__CLR4_4_18sj8sjlgchoqsq.R.flushNeeded();}}

    public int getMinimumValue() {try{__CLR4_4_18sj8sjlgchoqsq.R.inc(11423);
        __CLR4_4_18sj8sjlgchoqsq.R.inc(11424);return 0;
    }finally{__CLR4_4_18sj8sjlgchoqsq.R.flushNeeded();}}

    public int getMaximumValue() {try{__CLR4_4_18sj8sjlgchoqsq.R.inc(11425);
        __CLR4_4_18sj8sjlgchoqsq.R.inc(11426);return getWrappedField().getMaximumValue();
    }finally{__CLR4_4_18sj8sjlgchoqsq.R.flushNeeded();}}

    public long roundFloor(long instant) {try{__CLR4_4_18sj8sjlgchoqsq.R.inc(11427);
        __CLR4_4_18sj8sjlgchoqsq.R.inc(11428);return getWrappedField().roundFloor(instant);
    }finally{__CLR4_4_18sj8sjlgchoqsq.R.flushNeeded();}}

    public long roundCeiling(long instant) {try{__CLR4_4_18sj8sjlgchoqsq.R.inc(11429);
        __CLR4_4_18sj8sjlgchoqsq.R.inc(11430);return getWrappedField().roundCeiling(instant);
    }finally{__CLR4_4_18sj8sjlgchoqsq.R.flushNeeded();}}

    public long remainder(long instant) {try{__CLR4_4_18sj8sjlgchoqsq.R.inc(11431);
        __CLR4_4_18sj8sjlgchoqsq.R.inc(11432);return getWrappedField().remainder(instant);
    }finally{__CLR4_4_18sj8sjlgchoqsq.R.flushNeeded();}}

    /**
     * Serialization singleton
     */
    private Object readResolve() {try{__CLR4_4_18sj8sjlgchoqsq.R.inc(11433);
        __CLR4_4_18sj8sjlgchoqsq.R.inc(11434);return INSTANCE;
    }finally{__CLR4_4_18sj8sjlgchoqsq.R.flushNeeded();}}
}
