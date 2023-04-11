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
package org.joda.time;

/**
 * A DateTimeZone implementation for UTC.
 * <p>
 * This exists instead of using FixedDateTimeZone to avoid deadlocks.
 * https://github.com/JodaOrg/joda-time/issues/171
 */
final class UTCDateTimeZone extends DateTimeZone {public static class __CLR4_4_153a53algchoqjb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,6620,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static final DateTimeZone INSTANCE = new UTCDateTimeZone();
    private static final long serialVersionUID = -3513011772763289092L;

    public UTCDateTimeZone() {
        super("UTC");__CLR4_4_153a53algchoqjb.R.inc(6599);try{__CLR4_4_153a53algchoqjb.R.inc(6598);
    }finally{__CLR4_4_153a53algchoqjb.R.flushNeeded();}}

    @Override
    public String getNameKey(long instant) {try{__CLR4_4_153a53algchoqjb.R.inc(6600);
        __CLR4_4_153a53algchoqjb.R.inc(6601);return "UTC";
    }finally{__CLR4_4_153a53algchoqjb.R.flushNeeded();}}

    @Override
    public int getOffset(long instant) {try{__CLR4_4_153a53algchoqjb.R.inc(6602);
        __CLR4_4_153a53algchoqjb.R.inc(6603);return 0;
    }finally{__CLR4_4_153a53algchoqjb.R.flushNeeded();}}

    @Override
    public int getStandardOffset(long instant) {try{__CLR4_4_153a53algchoqjb.R.inc(6604);
        __CLR4_4_153a53algchoqjb.R.inc(6605);return 0;
    }finally{__CLR4_4_153a53algchoqjb.R.flushNeeded();}}

    @Override
    public int getOffsetFromLocal(long instantLocal) {try{__CLR4_4_153a53algchoqjb.R.inc(6606);
        __CLR4_4_153a53algchoqjb.R.inc(6607);return 0;
    }finally{__CLR4_4_153a53algchoqjb.R.flushNeeded();}}

    @Override
    public boolean isFixed() {try{__CLR4_4_153a53algchoqjb.R.inc(6608);
        __CLR4_4_153a53algchoqjb.R.inc(6609);return true;
    }finally{__CLR4_4_153a53algchoqjb.R.flushNeeded();}}

    @Override
    public long nextTransition(long instant) {try{__CLR4_4_153a53algchoqjb.R.inc(6610);
        __CLR4_4_153a53algchoqjb.R.inc(6611);return instant;
    }finally{__CLR4_4_153a53algchoqjb.R.flushNeeded();}}

    @Override
    public long previousTransition(long instant) {try{__CLR4_4_153a53algchoqjb.R.inc(6612);
        __CLR4_4_153a53algchoqjb.R.inc(6613);return instant;
    }finally{__CLR4_4_153a53algchoqjb.R.flushNeeded();}}

    @Override
    public java.util.TimeZone toTimeZone() {try{__CLR4_4_153a53algchoqjb.R.inc(6614);
        __CLR4_4_153a53algchoqjb.R.inc(6615);return new java.util.SimpleTimeZone(0, getID());
    }finally{__CLR4_4_153a53algchoqjb.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_4_153a53algchoqjb.R.inc(6616);
        __CLR4_4_153a53algchoqjb.R.inc(6617);return (obj instanceof UTCDateTimeZone);
    }finally{__CLR4_4_153a53algchoqjb.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_153a53algchoqjb.R.inc(6618);
        __CLR4_4_153a53algchoqjb.R.inc(6619);return getID().hashCode();
    }finally{__CLR4_4_153a53algchoqjb.R.flushNeeded();}}

}
