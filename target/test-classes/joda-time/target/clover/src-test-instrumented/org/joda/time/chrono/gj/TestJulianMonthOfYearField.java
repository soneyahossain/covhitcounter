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
package org.joda.time.chrono.gj;

/**
 * @author Brian S O'Neill
 */
class TestJulianMonthOfYearField extends TestGJMonthOfYearField {static class __CLR4_4_11dul1dullgchosp6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,64640,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public TestJulianMonthOfYearField(TestJulianChronology chrono) {
        super(chrono);__CLR4_4_11dul1dullgchosp6.R.inc(64606);try{__CLR4_4_11dul1dullgchosp6.R.inc(64605);
    }finally{__CLR4_4_11dul1dullgchosp6.R.flushNeeded();}}

    public int get(long millis) {try{__CLR4_4_11dul1dullgchosp6.R.inc(64607);
        __CLR4_4_11dul1dullgchosp6.R.inc(64608);return iChronology.gjFromMillis(millis)[1];
    }finally{__CLR4_4_11dul1dullgchosp6.R.flushNeeded();}}

    public long add(long millis, long value) {try{__CLR4_4_11dul1dullgchosp6.R.inc(64609);
        __CLR4_4_11dul1dullgchosp6.R.inc(64610);int year = iChronology.year().get(millis);
        __CLR4_4_11dul1dullgchosp6.R.inc(64611);int newYear = year + (int) TestGJChronology.div(value, 12);
        __CLR4_4_11dul1dullgchosp6.R.inc(64612);if ((((year < 0)&&(__CLR4_4_11dul1dullgchosp6.R.iget(64613)!=0|true))||(__CLR4_4_11dul1dullgchosp6.R.iget(64614)==0&false))) {{
            __CLR4_4_11dul1dullgchosp6.R.inc(64615);if ((((newYear >= 0)&&(__CLR4_4_11dul1dullgchosp6.R.iget(64616)!=0|true))||(__CLR4_4_11dul1dullgchosp6.R.iget(64617)==0&false))) {{
                __CLR4_4_11dul1dullgchosp6.R.inc(64618);newYear++;
            }
        }} }else {{
            __CLR4_4_11dul1dullgchosp6.R.inc(64619);if ((((newYear <= 0)&&(__CLR4_4_11dul1dullgchosp6.R.iget(64620)!=0|true))||(__CLR4_4_11dul1dullgchosp6.R.iget(64621)==0&false))) {{
                __CLR4_4_11dul1dullgchosp6.R.inc(64622);newYear--;
            }
        }}
        }__CLR4_4_11dul1dullgchosp6.R.inc(64623);int newMonth = get(millis) + (int) TestGJChronology.mod(value, 12);
        __CLR4_4_11dul1dullgchosp6.R.inc(64624);if ((((newMonth > 12)&&(__CLR4_4_11dul1dullgchosp6.R.iget(64625)!=0|true))||(__CLR4_4_11dul1dullgchosp6.R.iget(64626)==0&false))) {{
            __CLR4_4_11dul1dullgchosp6.R.inc(64627);if ((((newYear == -1)&&(__CLR4_4_11dul1dullgchosp6.R.iget(64628)!=0|true))||(__CLR4_4_11dul1dullgchosp6.R.iget(64629)==0&false))) {{
                __CLR4_4_11dul1dullgchosp6.R.inc(64630);newYear = 1;
            } }else {{
                __CLR4_4_11dul1dullgchosp6.R.inc(64631);newYear++;
            }
            }__CLR4_4_11dul1dullgchosp6.R.inc(64632);newMonth -= 12;
        }
        }__CLR4_4_11dul1dullgchosp6.R.inc(64633);int newDay = iChronology.dayOfMonth().get(millis);
        __CLR4_4_11dul1dullgchosp6.R.inc(64634);millis = iChronology.getTimeOnlyMillis(millis)
                + iChronology.millisFromGJ(newYear, newMonth, newDay);
        __CLR4_4_11dul1dullgchosp6.R.inc(64635);while ((((get(millis) != newMonth)&&(__CLR4_4_11dul1dullgchosp6.R.iget(64636)!=0|true))||(__CLR4_4_11dul1dullgchosp6.R.iget(64637)==0&false))) {{
            __CLR4_4_11dul1dullgchosp6.R.inc(64638);millis = iChronology.dayOfYear().add(millis, -1);
        }
        }__CLR4_4_11dul1dullgchosp6.R.inc(64639);return millis;
    }finally{__CLR4_4_11dul1dullgchosp6.R.flushNeeded();}}
}
