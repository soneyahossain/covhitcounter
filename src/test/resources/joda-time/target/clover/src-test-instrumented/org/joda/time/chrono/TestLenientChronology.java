/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2007 Stephen Colebourne
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
import org.joda.time.MockZone;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Brian S O'Neill
 * @author Blair Martin
 */
public class TestLenientChronology {static class __CLR4_4_11d4d1d4dlgchoso5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,63762,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;//extends TestCase {

    public static void main(String[] args) throws Exception {try{__CLR4_4_11d4d1d4dlgchoso5.R.inc(63661);
        //junit.textui.TestRunner.run(suite());

        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63662);TestLenientChronology TB = new TestLenientChronology();

        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63663);TB.setUp();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63664);TB.test_setYear();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63665);TB.tearDown();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63666);TB.setUp();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63667);TB.test_setMonthOfYear();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63668);TB.tearDown();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63669);TB.setUp();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63670);TB.test_setDayOfMonth();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63671);TB.tearDown();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63672);TB.setUp();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63673);TB.test_setHourOfDay();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63674);TB.tearDown();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63675);TB.setUp();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63676);TB.testNearDstTransition();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63677);TB.tearDown();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63678);TB.setUp();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63679);TB.test_MockTurkIsCorrect();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63680);TB.tearDown();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63681);TB.setUp();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63682);TB.test_lenientChrononolgy_Chicago();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63683);TB.tearDown();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63684);TB.setUp();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63685);TB.test_lenientChrononolgy_Turk();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63686);TB.tearDown();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63687);TB.setUp();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63688);TB.test_strictChrononolgy_Chicago();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63689);TB.tearDown();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63690);TB.setUp();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63691);TB.test_isoChrononolgy_Chicago();
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63692);TB.tearDown();

    }finally{__CLR4_4_11d4d1d4dlgchoso5.R.flushNeeded();}}

    /*
        public static TestSuite suite() {
            return new TestSuite(TestLenientChronology.class);
        }

        public TestLenientChronology(String name) {
            super(name);
        }

     */
    @Before
    public void setUp() throws Exception {try{__CLR4_4_11d4d1d4dlgchoso5.R.inc(63693);
    }finally{__CLR4_4_11d4d1d4dlgchoso5.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11d4d1d4dlgchoso5.R.inc(63694);
    }finally{__CLR4_4_11d4d1d4dlgchoso5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_setYear() {__CLR4_4_11d4d1d4dlgchoso5.R.globalSliceStart(getClass().getName(),63695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tpoaah1d5b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11d4d1d4dlgchoso5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11d4d1d4dlgchoso5.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestLenientChronology.test_setYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tpoaah1d5b(){try{__CLR4_4_11d4d1d4dlgchoso5.R.inc(63695);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63696);Chronology zone = LenientChronology.getInstance(ISOChronology.getInstanceUTC());
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63697);DateTime dt = new DateTime(2007, 1, 1, 0, 0, 0, 0, zone);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63698);assertEquals("2007-01-01T00:00:00.000Z", dt.toString());
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63699);dt = dt.withYear(2008);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63700);assertEquals("2008-01-01T00:00:00.000Z", dt.toString());
    }finally{__CLR4_4_11d4d1d4dlgchoso5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_setMonthOfYear() {__CLR4_4_11d4d1d4dlgchoso5.R.globalSliceStart(getClass().getName(),63701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jqwiwq1d5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11d4d1d4dlgchoso5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11d4d1d4dlgchoso5.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestLenientChronology.test_setMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jqwiwq1d5h(){try{__CLR4_4_11d4d1d4dlgchoso5.R.inc(63701);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63702);Chronology zone = LenientChronology.getInstance(ISOChronology.getInstanceUTC());
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63703);DateTime dt = new DateTime(2007, 1, 1, 0, 0, 0, 0, zone);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63704);assertEquals("2007-01-01T00:00:00.000Z", dt.toString());
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63705);dt = dt.withMonthOfYear(13);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63706);assertEquals("2008-01-01T00:00:00.000Z", dt.toString());
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63707);dt = dt.withMonthOfYear(0);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63708);assertEquals("2007-12-01T00:00:00.000Z", dt.toString());
    }finally{__CLR4_4_11d4d1d4dlgchoso5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_setDayOfMonth() {__CLR4_4_11d4d1d4dlgchoso5.R.globalSliceStart(getClass().getName(),63709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izb2h1d5p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11d4d1d4dlgchoso5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11d4d1d4dlgchoso5.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestLenientChronology.test_setDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izb2h1d5p(){try{__CLR4_4_11d4d1d4dlgchoso5.R.inc(63709);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63710);Chronology zone = LenientChronology.getInstance(ISOChronology.getInstanceUTC());
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63711);DateTime dt = new DateTime(2007, 1, 1, 0, 0, 0, 0, zone);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63712);assertEquals("2007-01-01T00:00:00.000Z", dt.toString());
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63713);dt = dt.withDayOfMonth(32);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63714);assertEquals("2007-02-01T00:00:00.000Z", dt.toString());
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63715);dt = dt.withDayOfMonth(0);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63716);assertEquals("2007-01-31T00:00:00.000Z", dt.toString());
    }finally{__CLR4_4_11d4d1d4dlgchoso5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_setHourOfDay() {__CLR4_4_11d4d1d4dlgchoso5.R.globalSliceStart(getClass().getName(),63717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dn0hjn1d5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11d4d1d4dlgchoso5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11d4d1d4dlgchoso5.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestLenientChronology.test_setHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dn0hjn1d5x(){try{__CLR4_4_11d4d1d4dlgchoso5.R.inc(63717);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63718);Chronology zone = LenientChronology.getInstance(ISOChronology.getInstanceUTC());
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63719);DateTime dt = new DateTime(2007, 1, 1, 0, 0, 0, 0, zone);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63720);assertEquals("2007-01-01T00:00:00.000Z", dt.toString());
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63721);dt = dt.withHourOfDay(24);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63722);assertEquals("2007-01-02T00:00:00.000Z", dt.toString());
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63723);dt = dt.withHourOfDay(-1);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63724);assertEquals("2007-01-01T23:00:00.000Z", dt.toString());
    }finally{__CLR4_4_11d4d1d4dlgchoso5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //------------------------ Bug ------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testNearDstTransition() {__CLR4_4_11d4d1d4dlgchoso5.R.globalSliceStart(getClass().getName(),63725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ugohh51d65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11d4d1d4dlgchoso5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11d4d1d4dlgchoso5.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestLenientChronology.testNearDstTransition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ugohh51d65(){try{__CLR4_4_11d4d1d4dlgchoso5.R.inc(63725);
        // This is just a regression test. Test case provided by Blair Martin.

        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63726);int hour = 23;
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63727);DateTime dt;

        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63728);dt = new DateTime(2006, 10, 29, hour, 0, 0, 0,
                ISOChronology.getInstance(DateTimeZone.forID("America/Los_Angeles")));
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63729);assertEquals(hour, dt.getHourOfDay()); // OK - no LenientChronology

        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63730);dt = new DateTime(2006, 10, 29, hour, 0, 0, 0,
                LenientChronology.getInstance
                        (ISOChronology.getInstance(DateTimeZone.forOffsetHours(-8))));
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63731);assertEquals(hour, dt.getHourOfDay()); // OK - no TZ ID

        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63732);dt = new DateTime(2006, 10, 29, hour, 0, 0, 0,
                LenientChronology.getInstance
                        (ISOChronology.getInstance(DateTimeZone.forID("America/Los_Angeles"))));

        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63733);assertEquals(hour, dt.getHourOfDay()); // Used to fail - hour was 22
    }finally{__CLR4_4_11d4d1d4dlgchoso5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //------------------------ Bug [1755161] --------------------------------
    //-----------------------------------------------------------------------
    /**
     * Mock zone simulating America/Grand_Turk cutover at midnight 2007-04-01
     */
    private static long CUTOVER_TURK = 1175403600000L;
    private static int OFFSET_TURK = -18000000;  // -05:00
    private static final DateTimeZone MOCK_TURK = new MockZone(CUTOVER_TURK, OFFSET_TURK, 3600);

    //-----------------------------------------------------------------------
    @Test
    public void test_MockTurkIsCorrect() {__CLR4_4_11d4d1d4dlgchoso5.R.globalSliceStart(getClass().getName(),63734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gjm8zu1d6e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11d4d1d4dlgchoso5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11d4d1d4dlgchoso5.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestLenientChronology.test_MockTurkIsCorrect",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gjm8zu1d6e(){try{__CLR4_4_11d4d1d4dlgchoso5.R.inc(63734);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63735);DateTime pre = new DateTime(CUTOVER_TURK - 1L, MOCK_TURK);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63736);assertEquals("2007-03-31T23:59:59.999-05:00", pre.toString());
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63737);DateTime at = new DateTime(CUTOVER_TURK, MOCK_TURK);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63738);assertEquals("2007-04-01T01:00:00.000-04:00", at.toString());
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63739);DateTime post = new DateTime(CUTOVER_TURK + 1L, MOCK_TURK);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63740);assertEquals("2007-04-01T01:00:00.001-04:00", post.toString());
    }finally{__CLR4_4_11d4d1d4dlgchoso5.R.flushNeeded();}}

    @Test
    public void test_lenientChrononolgy_Chicago() {__CLR4_4_11d4d1d4dlgchoso5.R.globalSliceStart(getClass().getName(),63741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m71mo21d6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11d4d1d4dlgchoso5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11d4d1d4dlgchoso5.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestLenientChronology.test_lenientChrononolgy_Chicago",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m71mo21d6l(){try{__CLR4_4_11d4d1d4dlgchoso5.R.inc(63741);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63742);DateTimeZone zone = DateTimeZone.forID("America/Chicago");
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63743);Chronology lenient = LenientChronology.getInstance(ISOChronology.getInstance(zone));
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63744);DateTime dt = new DateTime(2007, 3, 11, 2, 30, 0, 0, lenient);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63745);assertEquals("2007-03-11T03:30:00.000-05:00", dt.toString());
    }finally{__CLR4_4_11d4d1d4dlgchoso5.R.flushNeeded();}}

    @Test
    public void test_lenientChrononolgy_Turk() {__CLR4_4_11d4d1d4dlgchoso5.R.globalSliceStart(getClass().getName(),63746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p8sexc1d6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11d4d1d4dlgchoso5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11d4d1d4dlgchoso5.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestLenientChronology.test_lenientChrononolgy_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63746,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p8sexc1d6q(){try{__CLR4_4_11d4d1d4dlgchoso5.R.inc(63746);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63747);Chronology lenient = LenientChronology.getInstance(ISOChronology.getInstance(MOCK_TURK));
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63748);DateTime dt = new DateTime(2007, 4, 1, 0, 30, 0, 0, lenient);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63749);assertEquals("2007-04-01T01:30:00.000-04:00", dt.toString());
    }finally{__CLR4_4_11d4d1d4dlgchoso5.R.flushNeeded();}}

    @Test
    public void test_strictChrononolgy_Chicago() {__CLR4_4_11d4d1d4dlgchoso5.R.globalSliceStart(getClass().getName(),63750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k19nii1d6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11d4d1d4dlgchoso5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11d4d1d4dlgchoso5.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestLenientChronology.test_strictChrononolgy_Chicago",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k19nii1d6u(){try{__CLR4_4_11d4d1d4dlgchoso5.R.inc(63750);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63751);DateTimeZone zone = DateTimeZone.forID("America/Chicago");
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63752);Chronology lenient = StrictChronology.getInstance(ISOChronology.getInstance(zone));
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63753);try {
            __CLR4_4_11d4d1d4dlgchoso5.R.inc(63754);new DateTime(2007, 3, 11, 2, 30, 0, 0, lenient);
            __CLR4_4_11d4d1d4dlgchoso5.R.inc(63755);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11d4d1d4dlgchoso5.R.flushNeeded();}}

    @Test
    public void test_isoChrononolgy_Chicago() {__CLR4_4_11d4d1d4dlgchoso5.R.globalSliceStart(getClass().getName(),63756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yjf52s1d70();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11d4d1d4dlgchoso5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11d4d1d4dlgchoso5.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestLenientChronology.test_isoChrononolgy_Chicago",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63756,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yjf52s1d70(){try{__CLR4_4_11d4d1d4dlgchoso5.R.inc(63756);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63757);DateTimeZone zone = DateTimeZone.forID("America/Chicago");
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63758);Chronology lenient = ISOChronology.getInstance(zone);
        __CLR4_4_11d4d1d4dlgchoso5.R.inc(63759);try {
            __CLR4_4_11d4d1d4dlgchoso5.R.inc(63760);new DateTime(2007, 3, 11, 2, 30, 0, 0, lenient);
            __CLR4_4_11d4d1d4dlgchoso5.R.inc(63761);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11d4d1d4dlgchoso5.R.flushNeeded();}}

}
