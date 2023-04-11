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
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.ISOChronology;

/**
 * ReadableInstantConverter extracts milliseconds and chronology from a ReadableInstant.
 *
 * @author Stephen Colebourne
 * @since 1.0
 */
class ReadableInstantConverter extends AbstractConverter
        implements InstantConverter, PartialConverter {public static class __CLR4_4_1a5aa5algchoqvy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,13179,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Singleton instance.
     */
    static final ReadableInstantConverter INSTANCE = new ReadableInstantConverter();

    /**
     * Restricted constructor.
     */
    protected ReadableInstantConverter() {
        super();__CLR4_4_1a5aa5algchoqvy.R.inc(13151);try{__CLR4_4_1a5aa5algchoqvy.R.inc(13150);
    }finally{__CLR4_4_1a5aa5algchoqvy.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the chronology, which is taken from the ReadableInstant.
     * If the chronology on the instant is null, the ISOChronology in the
     * specified time zone is used.
     * If the chronology on the instant is not in the specified zone, it is
     * adapted.
     *
     * @param object the ReadableInstant to convert, must not be null
     * @param zone   the specified zone to use, null means default zone
     * @return the chronology, never null
     */
    public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_1a5aa5algchoqvy.R.inc(13152);
        __CLR4_4_1a5aa5algchoqvy.R.inc(13153);Chronology chrono = ((ReadableInstant) object).getChronology();
        __CLR4_4_1a5aa5algchoqvy.R.inc(13154);if ((((chrono == null)&&(__CLR4_4_1a5aa5algchoqvy.R.iget(13155)!=0|true))||(__CLR4_4_1a5aa5algchoqvy.R.iget(13156)==0&false))) {{
            __CLR4_4_1a5aa5algchoqvy.R.inc(13157);return ISOChronology.getInstance(zone);
        }
        }__CLR4_4_1a5aa5algchoqvy.R.inc(13158);DateTimeZone chronoZone = chrono.getZone();
        __CLR4_4_1a5aa5algchoqvy.R.inc(13159);if ((((chronoZone != zone)&&(__CLR4_4_1a5aa5algchoqvy.R.iget(13160)!=0|true))||(__CLR4_4_1a5aa5algchoqvy.R.iget(13161)==0&false))) {{
            __CLR4_4_1a5aa5algchoqvy.R.inc(13162);chrono = chrono.withZone(zone);
            __CLR4_4_1a5aa5algchoqvy.R.inc(13163);if ((((chrono == null)&&(__CLR4_4_1a5aa5algchoqvy.R.iget(13164)!=0|true))||(__CLR4_4_1a5aa5algchoqvy.R.iget(13165)==0&false))) {{
                __CLR4_4_1a5aa5algchoqvy.R.inc(13166);return ISOChronology.getInstance(zone);
            }
        }}
        }__CLR4_4_1a5aa5algchoqvy.R.inc(13167);return chrono;
    }finally{__CLR4_4_1a5aa5algchoqvy.R.flushNeeded();}}

    /**
     * Gets the chronology, which is taken from the ReadableInstant.
     * <p>
     * If the passed in chronology is non-null, it is used.
     * Otherwise the chronology from the instant is used.
     *
     * @param object the ReadableInstant to convert, must not be null
     * @param chrono the chronology to use, null means use that from object
     * @return the chronology, never null
     */
    public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_1a5aa5algchoqvy.R.inc(13168);
        __CLR4_4_1a5aa5algchoqvy.R.inc(13169);if ((((chrono == null)&&(__CLR4_4_1a5aa5algchoqvy.R.iget(13170)!=0|true))||(__CLR4_4_1a5aa5algchoqvy.R.iget(13171)==0&false))) {{
            __CLR4_4_1a5aa5algchoqvy.R.inc(13172);chrono = ((ReadableInstant) object).getChronology();
            __CLR4_4_1a5aa5algchoqvy.R.inc(13173);chrono = DateTimeUtils.getChronology(chrono);
        }
        }__CLR4_4_1a5aa5algchoqvy.R.inc(13174);return chrono;
    }finally{__CLR4_4_1a5aa5algchoqvy.R.flushNeeded();}}

    /**
     * Extracts the millis from an object of this converter's type.
     *
     * @param object the ReadableInstant to convert, must not be null
     * @param chrono the non-null result of getChronology
     * @return the millisecond value
     * @throws NullPointerException if the object is null
     * @throws ClassCastException   if the object is an invalid type
     */
    public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_1a5aa5algchoqvy.R.inc(13175);
        __CLR4_4_1a5aa5algchoqvy.R.inc(13176);return ((ReadableInstant) object).getMillis();
    }finally{__CLR4_4_1a5aa5algchoqvy.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns ReadableInstant.class.
     *
     * @return ReadableInstant.class
     */
    public Class<?> getSupportedType() {try{__CLR4_4_1a5aa5algchoqvy.R.inc(13177);
        __CLR4_4_1a5aa5algchoqvy.R.inc(13178);return ReadableInstant.class;
    }finally{__CLR4_4_1a5aa5algchoqvy.R.flushNeeded();}}

}
