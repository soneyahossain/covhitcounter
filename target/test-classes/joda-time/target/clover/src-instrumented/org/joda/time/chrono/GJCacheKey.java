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

import org.joda.time.DateTimeZone;
import org.joda.time.Instant;

/**
 * For internal usage in GJChronology only.
 */
class GJCacheKey {public static class __CLR4_4_17y17y1lgchoqqx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,10353,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final DateTimeZone zone;
    private final Instant cutoverInstant;
    private final int minDaysInFirstWeek;

    GJCacheKey(DateTimeZone zone, Instant cutoverInstant, int minDaysInFirstWeek) {try{__CLR4_4_17y17y1lgchoqqx.R.inc(10297);
        __CLR4_4_17y17y1lgchoqqx.R.inc(10298);this.zone = zone;
        __CLR4_4_17y17y1lgchoqqx.R.inc(10299);this.cutoverInstant = cutoverInstant;
        __CLR4_4_17y17y1lgchoqqx.R.inc(10300);this.minDaysInFirstWeek = minDaysInFirstWeek;
    }finally{__CLR4_4_17y17y1lgchoqqx.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_17y17y1lgchoqqx.R.inc(10301);
        __CLR4_4_17y17y1lgchoqqx.R.inc(10302);final int prime = 31;
        __CLR4_4_17y17y1lgchoqqx.R.inc(10303);int result = 1;
        __CLR4_4_17y17y1lgchoqqx.R.inc(10304);result = prime * result + (((((cutoverInstant == null) )&&(__CLR4_4_17y17y1lgchoqqx.R.iget(10305)!=0|true))||(__CLR4_4_17y17y1lgchoqqx.R.iget(10306)==0&false))? 0 : cutoverInstant.hashCode());
        __CLR4_4_17y17y1lgchoqqx.R.inc(10307);result = prime * result + minDaysInFirstWeek;
        __CLR4_4_17y17y1lgchoqqx.R.inc(10308);result = prime * result + (((((zone == null) )&&(__CLR4_4_17y17y1lgchoqqx.R.iget(10309)!=0|true))||(__CLR4_4_17y17y1lgchoqqx.R.iget(10310)==0&false))? 0 : zone.hashCode());
        __CLR4_4_17y17y1lgchoqqx.R.inc(10311);return result;
    }finally{__CLR4_4_17y17y1lgchoqqx.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_4_17y17y1lgchoqqx.R.inc(10312);
        __CLR4_4_17y17y1lgchoqqx.R.inc(10313);if ((((this == obj)&&(__CLR4_4_17y17y1lgchoqqx.R.iget(10314)!=0|true))||(__CLR4_4_17y17y1lgchoqqx.R.iget(10315)==0&false))) {{
            __CLR4_4_17y17y1lgchoqqx.R.inc(10316);return true;
        }
        }__CLR4_4_17y17y1lgchoqqx.R.inc(10317);if ((((obj == null)&&(__CLR4_4_17y17y1lgchoqqx.R.iget(10318)!=0|true))||(__CLR4_4_17y17y1lgchoqqx.R.iget(10319)==0&false))) {{
            __CLR4_4_17y17y1lgchoqqx.R.inc(10320);return false;
        }
        }__CLR4_4_17y17y1lgchoqqx.R.inc(10321);if ((((!(obj instanceof GJCacheKey))&&(__CLR4_4_17y17y1lgchoqqx.R.iget(10322)!=0|true))||(__CLR4_4_17y17y1lgchoqqx.R.iget(10323)==0&false))) {{
            __CLR4_4_17y17y1lgchoqqx.R.inc(10324);return false;
        }
        }__CLR4_4_17y17y1lgchoqqx.R.inc(10325);GJCacheKey other = (GJCacheKey) obj;
        __CLR4_4_17y17y1lgchoqqx.R.inc(10326);if ((((cutoverInstant == null)&&(__CLR4_4_17y17y1lgchoqqx.R.iget(10327)!=0|true))||(__CLR4_4_17y17y1lgchoqqx.R.iget(10328)==0&false))) {{
            __CLR4_4_17y17y1lgchoqqx.R.inc(10329);if ((((other.cutoverInstant != null)&&(__CLR4_4_17y17y1lgchoqqx.R.iget(10330)!=0|true))||(__CLR4_4_17y17y1lgchoqqx.R.iget(10331)==0&false))) {{
                __CLR4_4_17y17y1lgchoqqx.R.inc(10332);return false;
            }
        }} }else {__CLR4_4_17y17y1lgchoqqx.R.inc(10333);if ((((!cutoverInstant.equals(other.cutoverInstant))&&(__CLR4_4_17y17y1lgchoqqx.R.iget(10334)!=0|true))||(__CLR4_4_17y17y1lgchoqqx.R.iget(10335)==0&false))) {{
            __CLR4_4_17y17y1lgchoqqx.R.inc(10336);return false;
        }
        }}__CLR4_4_17y17y1lgchoqqx.R.inc(10337);if ((((minDaysInFirstWeek != other.minDaysInFirstWeek)&&(__CLR4_4_17y17y1lgchoqqx.R.iget(10338)!=0|true))||(__CLR4_4_17y17y1lgchoqqx.R.iget(10339)==0&false))) {{
            __CLR4_4_17y17y1lgchoqqx.R.inc(10340);return false;
        }
        }__CLR4_4_17y17y1lgchoqqx.R.inc(10341);if ((((zone == null)&&(__CLR4_4_17y17y1lgchoqqx.R.iget(10342)!=0|true))||(__CLR4_4_17y17y1lgchoqqx.R.iget(10343)==0&false))) {{
            __CLR4_4_17y17y1lgchoqqx.R.inc(10344);if ((((other.zone != null)&&(__CLR4_4_17y17y1lgchoqqx.R.iget(10345)!=0|true))||(__CLR4_4_17y17y1lgchoqqx.R.iget(10346)==0&false))) {{
                __CLR4_4_17y17y1lgchoqqx.R.inc(10347);return false;
            }
        }} }else {__CLR4_4_17y17y1lgchoqqx.R.inc(10348);if ((((!zone.equals(other.zone))&&(__CLR4_4_17y17y1lgchoqqx.R.iget(10349)!=0|true))||(__CLR4_4_17y17y1lgchoqqx.R.iget(10350)==0&false))) {{
            __CLR4_4_17y17y1lgchoqqx.R.inc(10351);return false;
        }
        }}__CLR4_4_17y17y1lgchoqqx.R.inc(10352);return true;
    }finally{__CLR4_4_17y17y1lgchoqqx.R.flushNeeded();}}

}