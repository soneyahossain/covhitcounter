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

//import junit.framework.TestCase;
//import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test.
 */
public class TestGJDate {static class __CLR4_4_11bvo1bvolgchosmp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,62115,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;//extends TestCase {

    private static final Chronology GJ_CHRONOLOGY = GJChronology.getInstanceUTC();


    public static void main(String[] args) {try{__CLR4_4_11bvo1bvolgchosmp.R.inc(62052);

        //junit.textui.TestRunner.run(suite());
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62053);new TestGJDate().test_plusYears_positiveToZero_crossCutover();
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62054);new TestGJDate().test_plusYears_negativeToPositive_crossCutover();
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62055);new TestGJDate().test_plusYears_positiveToZero();
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62056);new TestGJDate().test_cutoverPreZero();
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62057);new TestGJDate().test_plusYears_positiveToNegative_crossCutover();

        __CLR4_4_11bvo1bvolgchosmp.R.inc(62058);new TestGJDate().test_plusWeekyears_positiveToNegative_crossCutover();
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62059);new TestGJDate().test_plusYears_negativeToNegative();
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62060);new TestGJDate().test_plusYears_positiveToNegative();
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62061);new TestGJDate().test_plusWeekyears_positiveToZero_crossCutover();

        //org.junit.runner.JUnitCore.main("org.joda.time.chrono.TestGJDate");
    }finally{__CLR4_4_11bvo1bvolgchosmp.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestGJDate.class);
    }

    public TestGJDate(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }
*/
    //-----------------------------------------------------------------------

    //-----------------------------------------------------------------------
    @Test
    public void test_plusYears_positiveToPositive() {__CLR4_4_11bvo1bvolgchosmp.R.globalSliceStart(getClass().getName(),62062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kdqyl81bvy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bvo1bvolgchosmp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bvo1bvolgchosmp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusYears_positiveToPositive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62062,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kdqyl81bvy(){try{__CLR4_4_11bvo1bvolgchosmp.R.inc(62062);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62063);LocalDate date = new LocalDate(3, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62064);LocalDate expected = new LocalDate(7, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62065);assertEquals(expected, date.plusYears(4));
    }finally{__CLR4_4_11bvo1bvolgchosmp.R.flushNeeded();}}

    @Test
    public void test_plusYears_positiveToZero() {__CLR4_4_11bvo1bvolgchosmp.R.globalSliceStart(getClass().getName(),62066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1na1vpp1bw2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bvo1bvolgchosmp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bvo1bvolgchosmp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusYears_positiveToZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1na1vpp1bw2(){try{__CLR4_4_11bvo1bvolgchosmp.R.inc(62066);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62067);LocalDate date = new LocalDate(3, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62068);LocalDate expected = new LocalDate(-1, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62069);assertEquals(expected, date.plusYears(-3));
    }finally{__CLR4_4_11bvo1bvolgchosmp.R.flushNeeded();}}

    @Test
    public void test_plusYears_positiveToNegative() {__CLR4_4_11bvo1bvolgchosmp.R.globalSliceStart(getClass().getName(),62070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u6ls801bw6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bvo1bvolgchosmp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bvo1bvolgchosmp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusYears_positiveToNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u6ls801bw6(){try{__CLR4_4_11bvo1bvolgchosmp.R.inc(62070);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62071);LocalDate date = new LocalDate(3, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62072);LocalDate expected = new LocalDate(-2, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62073);assertEquals(expected, date.plusYears(-4));
    }finally{__CLR4_4_11bvo1bvolgchosmp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_plusYears_negativeToNegative() {__CLR4_4_11bvo1bvolgchosmp.R.globalSliceStart(getClass().getName(),62074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1164yxo1bwa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bvo1bvolgchosmp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bvo1bvolgchosmp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusYears_negativeToNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62074,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1164yxo1bwa(){try{__CLR4_4_11bvo1bvolgchosmp.R.inc(62074);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62075);LocalDate date = new LocalDate(-3, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62076);LocalDate expected = new LocalDate(-1, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62077);assertEquals(expected, date.plusYears(2));
    }finally{__CLR4_4_11bvo1bvolgchosmp.R.flushNeeded();}}

    @Test
    public void test_plusYears_negativeToZero() {__CLR4_4_11bvo1bvolgchosmp.R.globalSliceStart(getClass().getName(),62078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nuf2lr1bwe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bvo1bvolgchosmp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bvo1bvolgchosmp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusYears_negativeToZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62078,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nuf2lr1bwe(){try{__CLR4_4_11bvo1bvolgchosmp.R.inc(62078);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62079);LocalDate date = new LocalDate(-3, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62080);LocalDate expected = new LocalDate(1, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62081);assertEquals(expected, date.plusYears(3));
    }finally{__CLR4_4_11bvo1bvolgchosmp.R.flushNeeded();}}

    @Test
    public void test_plusYears_negativeToPositive() {__CLR4_4_11bvo1bvolgchosmp.R.globalSliceStart(getClass().getName(),62082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmwa3k1bwi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bvo1bvolgchosmp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bvo1bvolgchosmp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusYears_negativeToPositive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmwa3k1bwi(){try{__CLR4_4_11bvo1bvolgchosmp.R.inc(62082);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62083);LocalDate date = new LocalDate(-3, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62084);LocalDate expected = new LocalDate(2, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62085);assertEquals(expected, date.plusYears(4));
    }finally{__CLR4_4_11bvo1bvolgchosmp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_plusYears_positiveToPositive_crossCutover() {__CLR4_4_11bvo1bvolgchosmp.R.globalSliceStart(getClass().getName(),62086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1au07up1bwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bvo1bvolgchosmp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bvo1bvolgchosmp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusYears_positiveToPositive_crossCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1au07up1bwm(){try{__CLR4_4_11bvo1bvolgchosmp.R.inc(62086);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62087);LocalDate date = new LocalDate(3, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62088);LocalDate expected = new LocalDate(2007, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62089);assertEquals(expected, date.plusYears(2004));
    }finally{__CLR4_4_11bvo1bvolgchosmp.R.flushNeeded();}}

    @Test
    public void test_plusYears_positiveToZero_crossCutover() {__CLR4_4_11bvo1bvolgchosmp.R.globalSliceStart(getClass().getName(),62090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vlstv41bwq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bvo1bvolgchosmp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bvo1bvolgchosmp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusYears_positiveToZero_crossCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vlstv41bwq(){try{__CLR4_4_11bvo1bvolgchosmp.R.inc(62090);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62091);LocalDate date = new LocalDate(2003, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62092);LocalDate expected = new LocalDate(-1, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62093);assertEquals(expected, date.plusYears(-2003));
    }finally{__CLR4_4_11bvo1bvolgchosmp.R.flushNeeded();}}

    @Test
    public void test_plusYears_positiveToNegative_crossCutover() {__CLR4_4_11bvo1bvolgchosmp.R.globalSliceStart(getClass().getName(),62094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w94ef11bwu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bvo1bvolgchosmp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bvo1bvolgchosmp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusYears_positiveToNegative_crossCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w94ef11bwu(){try{__CLR4_4_11bvo1bvolgchosmp.R.inc(62094);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62095);LocalDate date = new LocalDate(2003, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62096);LocalDate expected = new LocalDate(-2, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62097);assertEquals(expected, date.plusYears(-2004));
    }finally{__CLR4_4_11bvo1bvolgchosmp.R.flushNeeded();}}

    @Test
    public void test_plusYears_negativeToPositive_crossCutover() {__CLR4_4_11bvo1bvolgchosmp.R.globalSliceStart(getClass().getName(),62098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vja0hp1bwy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bvo1bvolgchosmp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bvo1bvolgchosmp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusYears_negativeToPositive_crossCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62098,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vja0hp1bwy(){try{__CLR4_4_11bvo1bvolgchosmp.R.inc(62098);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62099);LocalDate date = new LocalDate(-3, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62100);LocalDate expected = new LocalDate(2002, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62101);assertEquals(expected, date.plusYears(2004));
    }finally{__CLR4_4_11bvo1bvolgchosmp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_plusWeekyears_positiveToZero_crossCutover() {__CLR4_4_11bvo1bvolgchosmp.R.globalSliceStart(getClass().getName(),62102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d8e4kk1bx2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bvo1bvolgchosmp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bvo1bvolgchosmp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusWeekyears_positiveToZero_crossCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d8e4kk1bx2(){try{__CLR4_4_11bvo1bvolgchosmp.R.inc(62102);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62103);LocalDate date = new LocalDate(2003, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62104);LocalDate expected = new LocalDate(-1, 6, 30, GJ_CHRONOLOGY).withWeekOfWeekyear(date.getWeekOfWeekyear()).withDayOfWeek(date.getDayOfWeek());
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62105);assertEquals(expected, date.weekyear().addToCopy(-2003));
    }finally{__CLR4_4_11bvo1bvolgchosmp.R.flushNeeded();}}

    @Test
    public void test_plusWeekyears_positiveToNegative_crossCutover() {__CLR4_4_11bvo1bvolgchosmp.R.globalSliceStart(getClass().getName(),62106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lpam4v1bx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bvo1bvolgchosmp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bvo1bvolgchosmp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusWeekyears_positiveToNegative_crossCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62106,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lpam4v1bx6(){try{__CLR4_4_11bvo1bvolgchosmp.R.inc(62106);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62107);LocalDate date = new LocalDate(2003, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62108);LocalDate expected = new LocalDate(-2, 6, 30, GJ_CHRONOLOGY).withWeekOfWeekyear(date.getWeekOfWeekyear()).withDayOfWeek(date.getDayOfWeek());
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62109);assertEquals(expected, date.weekyear().addToCopy(-2004));
    }finally{__CLR4_4_11bvo1bvolgchosmp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_cutoverPreZero() {__CLR4_4_11bvo1bvolgchosmp.R.globalSliceStart(getClass().getName(),62110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17lwd6f1bxa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bvo1bvolgchosmp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bvo1bvolgchosmp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_cutoverPreZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17lwd6f1bxa(){try{__CLR4_4_11bvo1bvolgchosmp.R.inc(62110);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62111);DateTime cutover = new LocalDate(-2, 6, 30, ISOChronology.getInstanceUTC()).toDateTimeAtStartOfDay(DateTimeZone.UTC);
        __CLR4_4_11bvo1bvolgchosmp.R.inc(62112);try {
            __CLR4_4_11bvo1bvolgchosmp.R.inc(62113);GJChronology.getInstance(DateTimeZone.UTC, cutover);
            __CLR4_4_11bvo1bvolgchosmp.R.inc(62114);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11bvo1bvolgchosmp.R.flushNeeded();}}

}
