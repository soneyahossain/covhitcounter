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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.CopticChronology;

/**
 * This class is a Junit unit test for DurationFieldType.
 *
 * @author Stephen Colebourne
 */
public class TestDurationFieldType {static class __CLR4_4_1o8eo8elgchors9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,31532,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    public static void main(String[] args) throws Exception {try{__CLR4_4_1o8eo8elgchors9.R.inc(31406);
        __CLR4_4_1o8eo8elgchors9.R.inc(31407);TestDurationFieldType TB = new TestDurationFieldType();
        __CLR4_4_1o8eo8elgchors9.R.inc(31408);TB.setUp();
        __CLR4_4_1o8eo8elgchors9.R.inc(31409);TB.test_eras();
        __CLR4_4_1o8eo8elgchors9.R.inc(31410);TB.tearDown();
        __CLR4_4_1o8eo8elgchors9.R.inc(31411);TB.setUp();
        __CLR4_4_1o8eo8elgchors9.R.inc(31412);TB.test_centuries();
        __CLR4_4_1o8eo8elgchors9.R.inc(31413);TB.tearDown();
        __CLR4_4_1o8eo8elgchors9.R.inc(31414);TB.setUp();
        __CLR4_4_1o8eo8elgchors9.R.inc(31415);TB.test_years();
        __CLR4_4_1o8eo8elgchors9.R.inc(31416);TB.tearDown();
        __CLR4_4_1o8eo8elgchors9.R.inc(31417);TB.setUp();
        __CLR4_4_1o8eo8elgchors9.R.inc(31418);TB.test_months();
        __CLR4_4_1o8eo8elgchors9.R.inc(31419);TB.tearDown();
        __CLR4_4_1o8eo8elgchors9.R.inc(31420);TB.setUp();
        __CLR4_4_1o8eo8elgchors9.R.inc(31421);TB.test_weekyears();
        __CLR4_4_1o8eo8elgchors9.R.inc(31422);TB.tearDown();
        __CLR4_4_1o8eo8elgchors9.R.inc(31423);TB.setUp();
        __CLR4_4_1o8eo8elgchors9.R.inc(31424);TB.test_weeks();
        __CLR4_4_1o8eo8elgchors9.R.inc(31425);TB.tearDown();
        __CLR4_4_1o8eo8elgchors9.R.inc(31426);TB.setUp();
        __CLR4_4_1o8eo8elgchors9.R.inc(31427);TB.test_days();
        __CLR4_4_1o8eo8elgchors9.R.inc(31428);TB.tearDown();
        __CLR4_4_1o8eo8elgchors9.R.inc(31429);TB.setUp();
        __CLR4_4_1o8eo8elgchors9.R.inc(31430);TB.test_halfdays();
        __CLR4_4_1o8eo8elgchors9.R.inc(31431);TB.tearDown();
        __CLR4_4_1o8eo8elgchors9.R.inc(31432);TB.setUp();
        __CLR4_4_1o8eo8elgchors9.R.inc(31433);TB.test_hours();
        __CLR4_4_1o8eo8elgchors9.R.inc(31434);TB.tearDown();
        __CLR4_4_1o8eo8elgchors9.R.inc(31435);TB.setUp();
        __CLR4_4_1o8eo8elgchors9.R.inc(31436);TB.test_minutes();
        __CLR4_4_1o8eo8elgchors9.R.inc(31437);TB.tearDown();
        __CLR4_4_1o8eo8elgchors9.R.inc(31438);TB.setUp();
        __CLR4_4_1o8eo8elgchors9.R.inc(31439);TB.test_seconds();
        __CLR4_4_1o8eo8elgchors9.R.inc(31440);TB.tearDown();
        __CLR4_4_1o8eo8elgchors9.R.inc(31441);TB.setUp();
        __CLR4_4_1o8eo8elgchors9.R.inc(31442);TB.test_millis();
        __CLR4_4_1o8eo8elgchors9.R.inc(31443);TB.tearDown();
        //TB.setUp(); TB.test_other(); TB.tearDown();

    }finally{__CLR4_4_1o8eo8elgchors9.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestDurationFieldType.class);
    }

    public TestDurationFieldType(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1o8eo8elgchors9.R.inc(31444);
    }finally{__CLR4_4_1o8eo8elgchors9.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1o8eo8elgchors9.R.inc(31445);
    }finally{__CLR4_4_1o8eo8elgchors9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_eras() throws Exception {__CLR4_4_1o8eo8elgchors9.R.globalSliceStart(getClass().getName(),31446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1huckr1o9i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8eo8elgchors9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8eo8elgchors9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_eras",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31446,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1huckr1o9i() throws Exception{try{__CLR4_4_1o8eo8elgchors9.R.inc(31446);
        __CLR4_4_1o8eo8elgchors9.R.inc(31447);assertEquals(DurationFieldType.eras(), DurationFieldType.eras());
        __CLR4_4_1o8eo8elgchors9.R.inc(31448);assertEquals("eras", DurationFieldType.eras().getName());
        __CLR4_4_1o8eo8elgchors9.R.inc(31449);assertEquals(CopticChronology.getInstanceUTC().eras(), DurationFieldType.eras().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31450);assertEquals(CopticChronology.getInstanceUTC().eras().isSupported(), DurationFieldType.eras().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31451);assertSerialization(DurationFieldType.eras());
    }finally{__CLR4_4_1o8eo8elgchors9.R.flushNeeded();}}

    @Test
    public void test_centuries() throws Exception {__CLR4_4_1o8eo8elgchors9.R.globalSliceStart(getClass().getName(),31452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_136us4o9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8eo8elgchors9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8eo8elgchors9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_centuries",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31452,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_136us4o9o() throws Exception{try{__CLR4_4_1o8eo8elgchors9.R.inc(31452);
        __CLR4_4_1o8eo8elgchors9.R.inc(31453);assertEquals(DurationFieldType.centuries(), DurationFieldType.centuries());
        __CLR4_4_1o8eo8elgchors9.R.inc(31454);assertEquals("centuries", DurationFieldType.centuries().getName());
        __CLR4_4_1o8eo8elgchors9.R.inc(31455);assertEquals(CopticChronology.getInstanceUTC().centuries(), DurationFieldType.centuries().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31456);assertEquals(CopticChronology.getInstanceUTC().centuries().isSupported(), DurationFieldType.centuries().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31457);assertSerialization(DurationFieldType.centuries());
    }finally{__CLR4_4_1o8eo8elgchors9.R.flushNeeded();}}

    @Test
    public void test_years() throws Exception {__CLR4_4_1o8eo8elgchors9.R.globalSliceStart(getClass().getName(),31458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bkxey8o9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8eo8elgchors9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8eo8elgchors9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_years",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31458,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bkxey8o9u() throws Exception{try{__CLR4_4_1o8eo8elgchors9.R.inc(31458);
        __CLR4_4_1o8eo8elgchors9.R.inc(31459);assertEquals(DurationFieldType.years(), DurationFieldType.years());
        __CLR4_4_1o8eo8elgchors9.R.inc(31460);assertEquals("years", DurationFieldType.years().getName());
        __CLR4_4_1o8eo8elgchors9.R.inc(31461);assertEquals(CopticChronology.getInstanceUTC().years(), DurationFieldType.years().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31462);assertEquals(CopticChronology.getInstanceUTC().years().isSupported(), DurationFieldType.years().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31463);assertSerialization(DurationFieldType.years());
    }finally{__CLR4_4_1o8eo8elgchors9.R.flushNeeded();}}

    @Test
    public void test_months() throws Exception {__CLR4_4_1o8eo8elgchors9.R.globalSliceStart(getClass().getName(),31464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19q0sxzoa0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8eo8elgchors9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8eo8elgchors9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_months",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19q0sxzoa0() throws Exception{try{__CLR4_4_1o8eo8elgchors9.R.inc(31464);
        __CLR4_4_1o8eo8elgchors9.R.inc(31465);assertEquals(DurationFieldType.months(), DurationFieldType.months());
        __CLR4_4_1o8eo8elgchors9.R.inc(31466);assertEquals("months", DurationFieldType.months().getName());
        __CLR4_4_1o8eo8elgchors9.R.inc(31467);assertEquals(CopticChronology.getInstanceUTC().months(), DurationFieldType.months().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31468);assertEquals(CopticChronology.getInstanceUTC().months().isSupported(), DurationFieldType.months().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31469);assertSerialization(DurationFieldType.months());
    }finally{__CLR4_4_1o8eo8elgchors9.R.flushNeeded();}}

    @Test
    public void test_weekyears() throws Exception {__CLR4_4_1o8eo8elgchors9.R.globalSliceStart(getClass().getName(),31470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hgrj8oa6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8eo8elgchors9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8eo8elgchors9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_weekyears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31470,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hgrj8oa6() throws Exception{try{__CLR4_4_1o8eo8elgchors9.R.inc(31470);
        __CLR4_4_1o8eo8elgchors9.R.inc(31471);assertEquals(DurationFieldType.weekyears(), DurationFieldType.weekyears());
        __CLR4_4_1o8eo8elgchors9.R.inc(31472);assertEquals("weekyears", DurationFieldType.weekyears().getName());
        __CLR4_4_1o8eo8elgchors9.R.inc(31473);assertEquals(CopticChronology.getInstanceUTC().weekyears(), DurationFieldType.weekyears().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31474);assertEquals(CopticChronology.getInstanceUTC().weekyears().isSupported(), DurationFieldType.weekyears().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31475);assertSerialization(DurationFieldType.weekyears());
    }finally{__CLR4_4_1o8eo8elgchors9.R.flushNeeded();}}

    @Test
    public void test_weeks() throws Exception {__CLR4_4_1o8eo8elgchors9.R.globalSliceStart(getClass().getName(),31476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vs03c7oac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8eo8elgchors9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8eo8elgchors9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_weeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vs03c7oac() throws Exception{try{__CLR4_4_1o8eo8elgchors9.R.inc(31476);
        __CLR4_4_1o8eo8elgchors9.R.inc(31477);assertEquals(DurationFieldType.weeks(), DurationFieldType.weeks());
        __CLR4_4_1o8eo8elgchors9.R.inc(31478);assertEquals("weeks", DurationFieldType.weeks().getName());
        __CLR4_4_1o8eo8elgchors9.R.inc(31479);assertEquals(CopticChronology.getInstanceUTC().weeks(), DurationFieldType.weeks().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31480);assertEquals(CopticChronology.getInstanceUTC().weeks().isSupported(), DurationFieldType.weeks().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31481);assertSerialization(DurationFieldType.weeks());
    }finally{__CLR4_4_1o8eo8elgchors9.R.flushNeeded();}}

    @Test
    public void test_days() throws Exception {__CLR4_4_1o8eo8elgchors9.R.globalSliceStart(getClass().getName(),31482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gixnzfoai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8eo8elgchors9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8eo8elgchors9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_days",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gixnzfoai() throws Exception{try{__CLR4_4_1o8eo8elgchors9.R.inc(31482);
        __CLR4_4_1o8eo8elgchors9.R.inc(31483);assertEquals(DurationFieldType.days(), DurationFieldType.days());
        __CLR4_4_1o8eo8elgchors9.R.inc(31484);assertEquals("days", DurationFieldType.days().getName());
        __CLR4_4_1o8eo8elgchors9.R.inc(31485);assertEquals(CopticChronology.getInstanceUTC().days(), DurationFieldType.days().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31486);assertEquals(CopticChronology.getInstanceUTC().days().isSupported(), DurationFieldType.days().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31487);assertSerialization(DurationFieldType.days());
    }finally{__CLR4_4_1o8eo8elgchors9.R.flushNeeded();}}

    @Test
    public void test_halfdays() throws Exception {__CLR4_4_1o8eo8elgchors9.R.globalSliceStart(getClass().getName(),31488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ixuoaqoao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8eo8elgchors9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8eo8elgchors9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_halfdays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ixuoaqoao() throws Exception{try{__CLR4_4_1o8eo8elgchors9.R.inc(31488);
        __CLR4_4_1o8eo8elgchors9.R.inc(31489);assertEquals(DurationFieldType.halfdays(), DurationFieldType.halfdays());
        __CLR4_4_1o8eo8elgchors9.R.inc(31490);assertEquals("halfdays", DurationFieldType.halfdays().getName());
        __CLR4_4_1o8eo8elgchors9.R.inc(31491);assertEquals(CopticChronology.getInstanceUTC().halfdays(), DurationFieldType.halfdays().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31492);assertEquals(CopticChronology.getInstanceUTC().halfdays().isSupported(), DurationFieldType.halfdays().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31493);assertSerialization(DurationFieldType.halfdays());
    }finally{__CLR4_4_1o8eo8elgchors9.R.flushNeeded();}}

    @Test
    public void test_hours() throws Exception {__CLR4_4_1o8eo8elgchors9.R.globalSliceStart(getClass().getName(),31494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15tuk7roau();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8eo8elgchors9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8eo8elgchors9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_hours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15tuk7roau() throws Exception{try{__CLR4_4_1o8eo8elgchors9.R.inc(31494);
        __CLR4_4_1o8eo8elgchors9.R.inc(31495);assertEquals(DurationFieldType.hours(), DurationFieldType.hours());
        __CLR4_4_1o8eo8elgchors9.R.inc(31496);assertEquals("hours", DurationFieldType.hours().getName());
        __CLR4_4_1o8eo8elgchors9.R.inc(31497);assertEquals(CopticChronology.getInstanceUTC().hours(), DurationFieldType.hours().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31498);assertEquals(CopticChronology.getInstanceUTC().hours().isSupported(), DurationFieldType.hours().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31499);assertSerialization(DurationFieldType.hours());
    }finally{__CLR4_4_1o8eo8elgchors9.R.flushNeeded();}}

    @Test
    public void test_minutes() throws Exception {__CLR4_4_1o8eo8elgchors9.R.globalSliceStart(getClass().getName(),31500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fwl4ufob0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8eo8elgchors9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8eo8elgchors9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_minutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fwl4ufob0() throws Exception{try{__CLR4_4_1o8eo8elgchors9.R.inc(31500);
        __CLR4_4_1o8eo8elgchors9.R.inc(31501);assertEquals(DurationFieldType.minutes(), DurationFieldType.minutes());
        __CLR4_4_1o8eo8elgchors9.R.inc(31502);assertEquals("minutes", DurationFieldType.minutes().getName());
        __CLR4_4_1o8eo8elgchors9.R.inc(31503);assertEquals(CopticChronology.getInstanceUTC().minutes(), DurationFieldType.minutes().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31504);assertEquals(CopticChronology.getInstanceUTC().minutes().isSupported(), DurationFieldType.minutes().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31505);assertSerialization(DurationFieldType.minutes());
    }finally{__CLR4_4_1o8eo8elgchors9.R.flushNeeded();}}

    @Test
    public void test_seconds() throws Exception {__CLR4_4_1o8eo8elgchors9.R.globalSliceStart(getClass().getName(),31506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13if0h3ob6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8eo8elgchors9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8eo8elgchors9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_seconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13if0h3ob6() throws Exception{try{__CLR4_4_1o8eo8elgchors9.R.inc(31506);
        __CLR4_4_1o8eo8elgchors9.R.inc(31507);assertEquals(DurationFieldType.seconds(), DurationFieldType.seconds());
        __CLR4_4_1o8eo8elgchors9.R.inc(31508);assertEquals("seconds", DurationFieldType.seconds().getName());
        __CLR4_4_1o8eo8elgchors9.R.inc(31509);assertEquals(CopticChronology.getInstanceUTC().seconds(), DurationFieldType.seconds().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31510);assertEquals(CopticChronology.getInstanceUTC().seconds().isSupported(), DurationFieldType.seconds().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31511);assertSerialization(DurationFieldType.seconds());
    }finally{__CLR4_4_1o8eo8elgchors9.R.flushNeeded();}}

    @Test
    public void test_millis() throws Exception {__CLR4_4_1o8eo8elgchors9.R.globalSliceStart(getClass().getName(),31512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13cnb7qobc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8eo8elgchors9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8eo8elgchors9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_millis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13cnb7qobc() throws Exception{try{__CLR4_4_1o8eo8elgchors9.R.inc(31512);
        __CLR4_4_1o8eo8elgchors9.R.inc(31513);assertEquals(DurationFieldType.millis(), DurationFieldType.millis());
        __CLR4_4_1o8eo8elgchors9.R.inc(31514);assertEquals("millis", DurationFieldType.millis().getName());
        __CLR4_4_1o8eo8elgchors9.R.inc(31515);assertEquals(CopticChronology.getInstanceUTC().millis(), DurationFieldType.millis().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31516);assertEquals(CopticChronology.getInstanceUTC().millis().isSupported(), DurationFieldType.millis().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1o8eo8elgchors9.R.inc(31517);assertSerialization(DurationFieldType.millis());
    }finally{__CLR4_4_1o8eo8elgchors9.R.flushNeeded();}}

    /*
        @Test public void test_other() throws Exception {
            assertEquals(1, DurationFieldType.class.getDeclaredClasses().length);
            Class cls = DurationFieldType.class.getDeclaredClasses()[0];
            assertEquals(1, cls.getDeclaredConstructors().length);
            Constructor con = cls.getDeclaredConstructors()[0];
            Object[] params = new Object[] {"other", new Byte((byte) 128)};
            DurationFieldType type = (DurationFieldType) con.newInstance(params);

            assertEquals("other", type.getName());
            try {
                type.getField(CopticChronology.getInstanceUTC());
                fail();
            } catch (InternalError ex) {}
            DurationFieldType result = doSerialization(type);
            assertEquals(type.getName(), result.getName());
            assertNotSame(type, result);
        }


     */
    //-----------------------------------------------------------------------
    private void assertSerialization(DurationFieldType type) throws Exception {try{__CLR4_4_1o8eo8elgchors9.R.inc(31518);
        __CLR4_4_1o8eo8elgchors9.R.inc(31519);DurationFieldType result = doSerialization(type);
        __CLR4_4_1o8eo8elgchors9.R.inc(31520);assertSame(type, result);
    }finally{__CLR4_4_1o8eo8elgchors9.R.flushNeeded();}}

    private DurationFieldType doSerialization(DurationFieldType type) throws Exception {try{__CLR4_4_1o8eo8elgchors9.R.inc(31521);
        __CLR4_4_1o8eo8elgchors9.R.inc(31522);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1o8eo8elgchors9.R.inc(31523);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1o8eo8elgchors9.R.inc(31524);oos.writeObject(type);
        __CLR4_4_1o8eo8elgchors9.R.inc(31525);oos.close();
        __CLR4_4_1o8eo8elgchors9.R.inc(31526);byte[] bytes = baos.toByteArray();

        __CLR4_4_1o8eo8elgchors9.R.inc(31527);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1o8eo8elgchors9.R.inc(31528);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1o8eo8elgchors9.R.inc(31529);DurationFieldType result = (DurationFieldType) ois.readObject();
        __CLR4_4_1o8eo8elgchors9.R.inc(31530);ois.close();
        __CLR4_4_1o8eo8elgchors9.R.inc(31531);return result;
    }finally{__CLR4_4_1o8eo8elgchors9.R.flushNeeded();}}

}
