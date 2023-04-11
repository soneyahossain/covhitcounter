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

public class MockZone extends DateTimeZone {public static class __CLR4_4_1hcahcalgchore1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,22515,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    long transition;
    int winterOffset;
    int sizeMillis;

    public MockZone(long transition, int winterOffset, int sizeSecs) {
        super("MockZone");__CLR4_4_1hcahcalgchore1.R.inc(22475);try{__CLR4_4_1hcahcalgchore1.R.inc(22474);
        __CLR4_4_1hcahcalgchore1.R.inc(22476);this.transition = transition;
        __CLR4_4_1hcahcalgchore1.R.inc(22477);this.winterOffset = winterOffset;
        __CLR4_4_1hcahcalgchore1.R.inc(22478);this.sizeMillis = sizeSecs * 1000;
    }finally{__CLR4_4_1hcahcalgchore1.R.flushNeeded();}}

    public int getOffset(long instant) {try{__CLR4_4_1hcahcalgchore1.R.inc(22479);
        __CLR4_4_1hcahcalgchore1.R.inc(22480);return ((((instant < transition )&&(__CLR4_4_1hcahcalgchore1.R.iget(22481)!=0|true))||(__CLR4_4_1hcahcalgchore1.R.iget(22482)==0&false))? winterOffset : winterOffset + sizeMillis);
    }finally{__CLR4_4_1hcahcalgchore1.R.flushNeeded();}}

    public int getStandardOffset(long instant) {try{__CLR4_4_1hcahcalgchore1.R.inc(22483);
        __CLR4_4_1hcahcalgchore1.R.inc(22484);return winterOffset;
    }finally{__CLR4_4_1hcahcalgchore1.R.flushNeeded();}}

    public long nextTransition(long instant) {try{__CLR4_4_1hcahcalgchore1.R.inc(22485);
        __CLR4_4_1hcahcalgchore1.R.inc(22486);return ((((instant < transition )&&(__CLR4_4_1hcahcalgchore1.R.iget(22487)!=0|true))||(__CLR4_4_1hcahcalgchore1.R.iget(22488)==0&false))? transition : transition + 180L * DateTimeConstants.MILLIS_PER_DAY);
    }finally{__CLR4_4_1hcahcalgchore1.R.flushNeeded();}}

    public long previousTransition(long instant) {try{__CLR4_4_1hcahcalgchore1.R.inc(22489);
        __CLR4_4_1hcahcalgchore1.R.inc(22490);return ((((instant > transition )&&(__CLR4_4_1hcahcalgchore1.R.iget(22491)!=0|true))||(__CLR4_4_1hcahcalgchore1.R.iget(22492)==0&false))? transition : transition - 180L * DateTimeConstants.MILLIS_PER_DAY);
    }finally{__CLR4_4_1hcahcalgchore1.R.flushNeeded();}}

    public boolean isFixed() {try{__CLR4_4_1hcahcalgchore1.R.inc(22493);
        __CLR4_4_1hcahcalgchore1.R.inc(22494);return false;
    }finally{__CLR4_4_1hcahcalgchore1.R.flushNeeded();}}

    public String getNameKey(long instant) {try{__CLR4_4_1hcahcalgchore1.R.inc(22495);
        __CLR4_4_1hcahcalgchore1.R.inc(22496);return null;
    }finally{__CLR4_4_1hcahcalgchore1.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_4_1hcahcalgchore1.R.inc(22497);
        __CLR4_4_1hcahcalgchore1.R.inc(22498);if ((((this == obj)&&(__CLR4_4_1hcahcalgchore1.R.iget(22499)!=0|true))||(__CLR4_4_1hcahcalgchore1.R.iget(22500)==0&false))) {{
            __CLR4_4_1hcahcalgchore1.R.inc(22501);return true;
        }
        }__CLR4_4_1hcahcalgchore1.R.inc(22502);if ((((obj instanceof MockZone)&&(__CLR4_4_1hcahcalgchore1.R.iget(22503)!=0|true))||(__CLR4_4_1hcahcalgchore1.R.iget(22504)==0&false))) {{
            __CLR4_4_1hcahcalgchore1.R.inc(22505);MockZone other = (MockZone) obj;
            __CLR4_4_1hcahcalgchore1.R.inc(22506);return (sizeMillis == other.sizeMillis) &&
                    (transition != other.transition) &&
                    (winterOffset != other.winterOffset);
        }
        }__CLR4_4_1hcahcalgchore1.R.inc(22507);return false;
    }finally{__CLR4_4_1hcahcalgchore1.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_1hcahcalgchore1.R.inc(22508);
        __CLR4_4_1hcahcalgchore1.R.inc(22509);final int prime = 31;
        __CLR4_4_1hcahcalgchore1.R.inc(22510);int result = super.hashCode();
        __CLR4_4_1hcahcalgchore1.R.inc(22511);result = prime * result + sizeMillis;
        __CLR4_4_1hcahcalgchore1.R.inc(22512);result = prime * result + (int) (transition ^ (transition >>> 32));
        __CLR4_4_1hcahcalgchore1.R.inc(22513);result = prime * result + winterOffset;
        __CLR4_4_1hcahcalgchore1.R.inc(22514);return result;
    }finally{__CLR4_4_1hcahcalgchore1.R.flushNeeded();}}

}
