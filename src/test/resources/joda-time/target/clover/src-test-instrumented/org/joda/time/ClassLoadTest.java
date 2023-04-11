/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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
package org.joda.time;

import org.joda.time.base.AbstractDateTime;
import org.joda.time.base.AbstractInstant;

/**
 * This class displays what the ClassLoader is up to.
 * Run using JVM -verbose:class.
 *
 * @author Stephen Colebourne
 */
public class ClassLoadTest {static class __CLR4_4_1hathatlgchordt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,22440,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // run using JVM -verbose:class
    public static void main(String[] args) {try{__CLR4_4_1hathatlgchordt.R.inc(22421);
        __CLR4_4_1hathatlgchordt.R.inc(22422);System.out.println("-----------------------------------------------");
        __CLR4_4_1hathatlgchordt.R.inc(22423);System.out.println("-----------AbstractInstant---------------------");
        __CLR4_4_1hathatlgchordt.R.inc(22424);Class cls = AbstractInstant.class;
        __CLR4_4_1hathatlgchordt.R.inc(22425);System.out.println("-----------ReadableDateTime--------------------");
        __CLR4_4_1hathatlgchordt.R.inc(22426);cls = ReadableDateTime.class;
        __CLR4_4_1hathatlgchordt.R.inc(22427);System.out.println("-----------AbstractDateTime--------------------");
        __CLR4_4_1hathatlgchordt.R.inc(22428);cls = AbstractDateTime.class;
        __CLR4_4_1hathatlgchordt.R.inc(22429);System.out.println("-----------DateTime----------------------------");
        __CLR4_4_1hathatlgchordt.R.inc(22430);cls = DateTime.class;
        __CLR4_4_1hathatlgchordt.R.inc(22431);System.out.println("-----------DateTimeZone------------------------");
        __CLR4_4_1hathatlgchordt.R.inc(22432);cls = DateTimeZone.class;
        __CLR4_4_1hathatlgchordt.R.inc(22433);System.out.println("-----------new DateTime()----------------------");
        __CLR4_4_1hathatlgchordt.R.inc(22434);DateTime dt = new DateTime();
        __CLR4_4_1hathatlgchordt.R.inc(22435);System.out.println("-----------new DateTime(ReadableInstant)-------");
        __CLR4_4_1hathatlgchordt.R.inc(22436);dt = new DateTime(dt);
        __CLR4_4_1hathatlgchordt.R.inc(22437);System.out.println("-----------new DateTime(Long)------------------");
        __CLR4_4_1hathatlgchordt.R.inc(22438);dt = new DateTime(new Long(0));
        __CLR4_4_1hathatlgchordt.R.inc(22439);System.out.println("-----------------------------------------------");
    }finally{__CLR4_4_1hathatlgchordt.R.flushNeeded();}}

}
