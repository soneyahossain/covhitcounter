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
package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableDuration;

/**
 * ReadableDurationConverter extracts milliseconds and chronology from a ReadableDuration.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
class ReadableDurationConverter extends AbstractConverter
        implements DurationConverter, PeriodConverter {public static class __CLR4_4_1a4va4vlgchoqvw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,13150,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Singleton instance.
     */
    static final ReadableDurationConverter INSTANCE = new ReadableDurationConverter();

    /**
     * Restricted constructor.
     */
    protected ReadableDurationConverter() {
        super();__CLR4_4_1a4va4vlgchoqvw.R.inc(13136);try{__CLR4_4_1a4va4vlgchoqvw.R.inc(13135);
    }finally{__CLR4_4_1a4va4vlgchoqvw.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Extracts the millis from an object of this converter's type.
     *
     * @param object the object to convert, must not be null
     * @return the millisecond value
     * @throws NullPointerException     if the object is null
     * @throws ClassCastException       if the object is an invalid type
     * @throws IllegalArgumentException if the object is invalid
     */
    public long getDurationMillis(Object object) {try{__CLR4_4_1a4va4vlgchoqvw.R.inc(13137);
        __CLR4_4_1a4va4vlgchoqvw.R.inc(13138);return ((ReadableDuration) object).getMillis();
    }finally{__CLR4_4_1a4va4vlgchoqvw.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Extracts duration values from an object of this converter's type, and
     * sets them into the given ReadWritableDuration.
     *
     * @param writablePeriod period to get modified
     * @param object         the object to convert, must not be null
     * @param chrono         the chronology to use, must not be null
     * @throws NullPointerException     if the duration or object is null
     * @throws ClassCastException       if the object is an invalid type
     * @throws IllegalArgumentException if the object is invalid
     */
    public void setInto(ReadWritablePeriod writablePeriod, Object object, Chronology chrono) {try{__CLR4_4_1a4va4vlgchoqvw.R.inc(13139);
        __CLR4_4_1a4va4vlgchoqvw.R.inc(13140);ReadableDuration dur = (ReadableDuration) object;
        __CLR4_4_1a4va4vlgchoqvw.R.inc(13141);chrono = DateTimeUtils.getChronology(chrono);
        __CLR4_4_1a4va4vlgchoqvw.R.inc(13142);long duration = dur.getMillis();
        __CLR4_4_1a4va4vlgchoqvw.R.inc(13143);int[] values = chrono.get(writablePeriod, duration);
        __CLR4_4_1a4va4vlgchoqvw.R.inc(13144);for (int i = 0; (((i < values.length)&&(__CLR4_4_1a4va4vlgchoqvw.R.iget(13145)!=0|true))||(__CLR4_4_1a4va4vlgchoqvw.R.iget(13146)==0&false)); i++) {{
            __CLR4_4_1a4va4vlgchoqvw.R.inc(13147);writablePeriod.setValue(i, values[i]);
        }
    }}finally{__CLR4_4_1a4va4vlgchoqvw.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns ReadableDuration.class.
     *
     * @return ReadableDuration.class
     */
    public Class<?> getSupportedType() {try{__CLR4_4_1a4va4vlgchoqvw.R.inc(13148);
        __CLR4_4_1a4va4vlgchoqvw.R.inc(13149);return ReadableDuration.class;
    }finally{__CLR4_4_1a4va4vlgchoqvw.R.flushNeeded();}}

}
