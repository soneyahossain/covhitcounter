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
 * This class is a Junit unit test for Chronology.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeFieldType {static class __CLR4_4_1jl3jl3lgchork6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,25654,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    public static void main(String[] args) throws Exception {try{__CLR4_4_1jl3jl3lgchork6.R.inc(25383);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25384);TestDateTimeFieldType TB = new TestDateTimeFieldType();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25385);TB.setUp();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25386);TB.test_era();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25387);TB.tearDown();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25388);TB.setUp();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25389);TB.test_centuryOfEra();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25390);TB.tearDown();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25391);TB.setUp();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25392);TB.test_yearOfCentury();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25393);TB.tearDown();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25394);TB.setUp();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25395);TB.test_yearOfEra();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25396);TB.tearDown();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25397);TB.setUp();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25398);TB.test_year();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25399);TB.tearDown();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25400);TB.setUp();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25401);TB.test_monthOfYear();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25402);TB.tearDown();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25403);TB.setUp();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25404);TB.test_weekyearOfCentury();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25405);TB.tearDown();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25406);TB.setUp();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25407);TB.test_weekyear();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25408);TB.tearDown();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25409);TB.setUp();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25410);TB.test_weekOfWeekyear();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25411);TB.tearDown();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25412);TB.setUp();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25413);TB.test_dayOfYear();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25414);TB.tearDown();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25415);TB.setUp();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25416);TB.test_dayOfMonth();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25417);TB.tearDown();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25418);TB.setUp();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25419);TB.test_dayOfWeek();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25420);TB.tearDown();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25421);TB.setUp();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25422);TB.test_halfdayOfDay();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25423);TB.tearDown();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25424);TB.setUp();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25425);TB.test_clockhourOfDay();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25426);TB.tearDown();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25427);TB.setUp();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25428);TB.test_clockhourOfHalfday();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25429);TB.tearDown();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25430);TB.setUp();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25431);TB.test_hourOfHalfday();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25432);TB.tearDown();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25433);TB.setUp();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25434);TB.test_hourOfDay();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25435);TB.tearDown();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25436);TB.setUp();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25437);TB.test_minuteOfDay();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25438);TB.tearDown();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25439);TB.setUp();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25440);TB.test_minuteOfHour();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25441);TB.tearDown();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25442);TB.setUp();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25443);TB.test_secondOfDay();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25444);TB.tearDown();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25445);TB.setUp();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25446);TB.test_secondOfMinute();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25447);TB.tearDown();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25448);TB.setUp();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25449);TB.test_millisOfDay();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25450);TB.tearDown();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25451);TB.setUp();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25452);TB.test_millisOfSecond();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25453);TB.tearDown();
        //TB.setUp(); TB.test_other(); TB.tearDown();

    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestDateTimeFieldType.class);
    }

    public TestDateTimeFieldType(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1jl3jl3lgchork6.R.inc(25454);
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1jl3jl3lgchork6.R.inc(25455);
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_era() throws Exception {__CLR4_4_1jl3jl3lgchork6.R.globalSliceStart(getClass().getName(),25456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xz3gj6jn4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jl3jl3lgchork6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jl3jl3lgchork6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_era",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xz3gj6jn4() throws Exception{try{__CLR4_4_1jl3jl3lgchork6.R.inc(25456);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25457);assertEquals(DateTimeFieldType.era(), DateTimeFieldType.era());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25458);assertEquals("era", DateTimeFieldType.era().getName());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25459);assertEquals(DurationFieldType.eras(), DateTimeFieldType.era().getDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25460);assertEquals(null, DateTimeFieldType.era().getRangeDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25461);assertEquals(CopticChronology.getInstanceUTC().era(), DateTimeFieldType.era().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25462);assertEquals(CopticChronology.getInstanceUTC().era().isSupported(), DateTimeFieldType.era().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25463);assertSerialization(DateTimeFieldType.era());
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    @Test
    public void test_centuryOfEra() throws Exception {__CLR4_4_1jl3jl3lgchork6.R.globalSliceStart(getClass().getName(),25464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kwu9wdjnc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jl3jl3lgchork6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jl3jl3lgchork6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_centuryOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kwu9wdjnc() throws Exception{try{__CLR4_4_1jl3jl3lgchork6.R.inc(25464);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25465);assertEquals(DateTimeFieldType.centuryOfEra(), DateTimeFieldType.centuryOfEra());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25466);assertEquals("centuryOfEra", DateTimeFieldType.centuryOfEra().getName());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25467);assertEquals(DurationFieldType.centuries(), DateTimeFieldType.centuryOfEra().getDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25468);assertEquals(DurationFieldType.eras(), DateTimeFieldType.centuryOfEra().getRangeDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25469);assertEquals(CopticChronology.getInstanceUTC().centuryOfEra(), DateTimeFieldType.centuryOfEra().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25470);assertEquals(CopticChronology.getInstanceUTC().centuryOfEra().isSupported(), DateTimeFieldType.centuryOfEra().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25471);assertSerialization(DateTimeFieldType.centuryOfEra());
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    @Test
    public void test_yearOfCentury() throws Exception {__CLR4_4_1jl3jl3lgchork6.R.globalSliceStart(getClass().getName(),25472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fn4atijnk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jl3jl3lgchork6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jl3jl3lgchork6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_yearOfCentury",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fn4atijnk() throws Exception{try{__CLR4_4_1jl3jl3lgchork6.R.inc(25472);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25473);assertEquals(DateTimeFieldType.yearOfCentury(), DateTimeFieldType.yearOfCentury());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25474);assertEquals("yearOfCentury", DateTimeFieldType.yearOfCentury().getName());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25475);assertEquals(DurationFieldType.years(), DateTimeFieldType.yearOfCentury().getDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25476);assertEquals(DurationFieldType.centuries(), DateTimeFieldType.yearOfCentury().getRangeDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25477);assertEquals(CopticChronology.getInstanceUTC().yearOfCentury(), DateTimeFieldType.yearOfCentury().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25478);assertEquals(CopticChronology.getInstanceUTC().yearOfCentury().isSupported(), DateTimeFieldType.yearOfCentury().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25479);assertSerialization(DateTimeFieldType.yearOfCentury());
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    @Test
    public void test_yearOfEra() throws Exception {__CLR4_4_1jl3jl3lgchork6.R.globalSliceStart(getClass().getName(),25480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nmfop2jns();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jl3jl3lgchork6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jl3jl3lgchork6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_yearOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nmfop2jns() throws Exception{try{__CLR4_4_1jl3jl3lgchork6.R.inc(25480);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25481);assertEquals(DateTimeFieldType.yearOfEra(), DateTimeFieldType.yearOfEra());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25482);assertEquals("yearOfEra", DateTimeFieldType.yearOfEra().getName());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25483);assertEquals(DurationFieldType.years(), DateTimeFieldType.yearOfEra().getDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25484);assertEquals(DurationFieldType.eras(), DateTimeFieldType.yearOfEra().getRangeDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25485);assertEquals(CopticChronology.getInstanceUTC().yearOfEra(), DateTimeFieldType.yearOfEra().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25486);assertEquals(CopticChronology.getInstanceUTC().yearOfEra().isSupported(), DateTimeFieldType.yearOfEra().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25487);assertSerialization(DateTimeFieldType.yearOfEra());
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    @Test
    public void test_year() throws Exception {__CLR4_4_1jl3jl3lgchork6.R.globalSliceStart(getClass().getName(),25488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wob9w1jo0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jl3jl3lgchork6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jl3jl3lgchork6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_year",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wob9w1jo0() throws Exception{try{__CLR4_4_1jl3jl3lgchork6.R.inc(25488);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25489);assertEquals(DateTimeFieldType.year(), DateTimeFieldType.year());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25490);assertEquals("year", DateTimeFieldType.year().getName());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25491);assertEquals(DurationFieldType.years(), DateTimeFieldType.year().getDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25492);assertEquals(null, DateTimeFieldType.year().getRangeDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25493);assertEquals(CopticChronology.getInstanceUTC().year(), DateTimeFieldType.year().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25494);assertEquals(CopticChronology.getInstanceUTC().year().isSupported(), DateTimeFieldType.year().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25495);assertSerialization(DateTimeFieldType.year());
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    @Test
    public void test_monthOfYear() throws Exception {__CLR4_4_1jl3jl3lgchork6.R.globalSliceStart(getClass().getName(),25496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u2rvxujo8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jl3jl3lgchork6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jl3jl3lgchork6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_monthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25496,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u2rvxujo8() throws Exception{try{__CLR4_4_1jl3jl3lgchork6.R.inc(25496);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25497);assertEquals(DateTimeFieldType.monthOfYear(), DateTimeFieldType.monthOfYear());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25498);assertEquals("monthOfYear", DateTimeFieldType.monthOfYear().getName());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25499);assertEquals(DurationFieldType.months(), DateTimeFieldType.monthOfYear().getDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25500);assertEquals(DurationFieldType.years(), DateTimeFieldType.monthOfYear().getRangeDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25501);assertEquals(CopticChronology.getInstanceUTC().monthOfYear(), DateTimeFieldType.monthOfYear().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25502);assertEquals(CopticChronology.getInstanceUTC().monthOfYear().isSupported(), DateTimeFieldType.monthOfYear().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25503);assertSerialization(DateTimeFieldType.monthOfYear());
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    @Test
    public void test_weekyearOfCentury() throws Exception {__CLR4_4_1jl3jl3lgchork6.R.globalSliceStart(getClass().getName(),25504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vymmrqjog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jl3jl3lgchork6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jl3jl3lgchork6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_weekyearOfCentury",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25504,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vymmrqjog() throws Exception{try{__CLR4_4_1jl3jl3lgchork6.R.inc(25504);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25505);assertEquals(DateTimeFieldType.weekyearOfCentury(), DateTimeFieldType.weekyearOfCentury());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25506);assertEquals("weekyearOfCentury", DateTimeFieldType.weekyearOfCentury().getName());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25507);assertEquals(DurationFieldType.weekyears(), DateTimeFieldType.weekyearOfCentury().getDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25508);assertEquals(DurationFieldType.centuries(), DateTimeFieldType.weekyearOfCentury().getRangeDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25509);assertEquals(CopticChronology.getInstanceUTC().weekyearOfCentury(), DateTimeFieldType.weekyearOfCentury().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25510);assertEquals(CopticChronology.getInstanceUTC().weekyearOfCentury().isSupported(), DateTimeFieldType.weekyearOfCentury().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25511);assertSerialization(DateTimeFieldType.weekyearOfCentury());
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    @Test
    public void test_weekyear() throws Exception {__CLR4_4_1jl3jl3lgchork6.R.globalSliceStart(getClass().getName(),25512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hdixq3joo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jl3jl3lgchork6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jl3jl3lgchork6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_weekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hdixq3joo() throws Exception{try{__CLR4_4_1jl3jl3lgchork6.R.inc(25512);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25513);assertEquals(DateTimeFieldType.weekyear(), DateTimeFieldType.weekyear());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25514);assertEquals("weekyear", DateTimeFieldType.weekyear().getName());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25515);assertEquals(DurationFieldType.weekyears(), DateTimeFieldType.weekyear().getDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25516);assertEquals(null, DateTimeFieldType.weekyear().getRangeDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25517);assertEquals(CopticChronology.getInstanceUTC().weekyear(), DateTimeFieldType.weekyear().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25518);assertEquals(CopticChronology.getInstanceUTC().weekyear().isSupported(), DateTimeFieldType.weekyear().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25519);assertSerialization(DateTimeFieldType.weekyear());
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    @Test
    public void test_weekOfWeekyear() throws Exception {__CLR4_4_1jl3jl3lgchork6.R.globalSliceStart(getClass().getName(),25520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1balis0jow();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jl3jl3lgchork6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jl3jl3lgchork6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_weekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1balis0jow() throws Exception{try{__CLR4_4_1jl3jl3lgchork6.R.inc(25520);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25521);assertEquals(DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.weekOfWeekyear());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25522);assertEquals("weekOfWeekyear", DateTimeFieldType.weekOfWeekyear().getName());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25523);assertEquals(DurationFieldType.weeks(), DateTimeFieldType.weekOfWeekyear().getDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25524);assertEquals(DurationFieldType.weekyears(), DateTimeFieldType.weekOfWeekyear().getRangeDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25525);assertEquals(CopticChronology.getInstanceUTC().weekOfWeekyear(), DateTimeFieldType.weekOfWeekyear().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25526);assertEquals(CopticChronology.getInstanceUTC().weekOfWeekyear().isSupported(), DateTimeFieldType.weekOfWeekyear().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25527);assertSerialization(DateTimeFieldType.weekOfWeekyear());
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    @Test
    public void test_dayOfYear() throws Exception {__CLR4_4_1jl3jl3lgchork6.R.globalSliceStart(getClass().getName(),25528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kct4bajp4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jl3jl3lgchork6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jl3jl3lgchork6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_dayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kct4bajp4() throws Exception{try{__CLR4_4_1jl3jl3lgchork6.R.inc(25528);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25529);assertEquals(DateTimeFieldType.dayOfYear(), DateTimeFieldType.dayOfYear());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25530);assertEquals("dayOfYear", DateTimeFieldType.dayOfYear().getName());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25531);assertEquals(DurationFieldType.days(), DateTimeFieldType.dayOfYear().getDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25532);assertEquals(DurationFieldType.years(), DateTimeFieldType.dayOfYear().getRangeDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25533);assertEquals(CopticChronology.getInstanceUTC().dayOfYear(), DateTimeFieldType.dayOfYear().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25534);assertEquals(CopticChronology.getInstanceUTC().dayOfYear().isSupported(), DateTimeFieldType.dayOfYear().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25535);assertSerialization(DateTimeFieldType.dayOfYear());
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    @Test
    public void test_dayOfMonth() throws Exception {__CLR4_4_1jl3jl3lgchork6.R.globalSliceStart(getClass().getName(),25536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16oh6ynjpc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jl3jl3lgchork6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jl3jl3lgchork6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_dayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16oh6ynjpc() throws Exception{try{__CLR4_4_1jl3jl3lgchork6.R.inc(25536);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25537);assertEquals(DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfMonth());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25538);assertEquals("dayOfMonth", DateTimeFieldType.dayOfMonth().getName());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25539);assertEquals(DurationFieldType.days(), DateTimeFieldType.dayOfMonth().getDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25540);assertEquals(DurationFieldType.months(), DateTimeFieldType.dayOfMonth().getRangeDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25541);assertEquals(CopticChronology.getInstanceUTC().dayOfMonth(), DateTimeFieldType.dayOfMonth().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25542);assertEquals(CopticChronology.getInstanceUTC().dayOfMonth().isSupported(), DateTimeFieldType.dayOfMonth().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25543);assertSerialization(DateTimeFieldType.dayOfMonth());
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    @Test
    public void test_dayOfWeek() throws Exception {__CLR4_4_1jl3jl3lgchork6.R.globalSliceStart(getClass().getName(),25544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14yum2njpk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jl3jl3lgchork6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jl3jl3lgchork6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_dayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14yum2njpk() throws Exception{try{__CLR4_4_1jl3jl3lgchork6.R.inc(25544);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25545);assertEquals(DateTimeFieldType.dayOfWeek(), DateTimeFieldType.dayOfWeek());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25546);assertEquals("dayOfWeek", DateTimeFieldType.dayOfWeek().getName());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25547);assertEquals(DurationFieldType.days(), DateTimeFieldType.dayOfWeek().getDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25548);assertEquals(DurationFieldType.weeks(), DateTimeFieldType.dayOfWeek().getRangeDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25549);assertEquals(CopticChronology.getInstanceUTC().dayOfWeek(), DateTimeFieldType.dayOfWeek().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25550);assertEquals(CopticChronology.getInstanceUTC().dayOfWeek().isSupported(), DateTimeFieldType.dayOfWeek().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25551);assertSerialization(DateTimeFieldType.dayOfWeek());
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    @Test
    public void test_halfdayOfDay() throws Exception {__CLR4_4_1jl3jl3lgchork6.R.globalSliceStart(getClass().getName(),25552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qoqfaojps();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jl3jl3lgchork6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jl3jl3lgchork6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_halfdayOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qoqfaojps() throws Exception{try{__CLR4_4_1jl3jl3lgchork6.R.inc(25552);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25553);assertEquals(DateTimeFieldType.halfdayOfDay(), DateTimeFieldType.halfdayOfDay());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25554);assertEquals("halfdayOfDay", DateTimeFieldType.halfdayOfDay().getName());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25555);assertEquals(DurationFieldType.halfdays(), DateTimeFieldType.halfdayOfDay().getDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25556);assertEquals(DurationFieldType.days(), DateTimeFieldType.halfdayOfDay().getRangeDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25557);assertEquals(CopticChronology.getInstanceUTC().halfdayOfDay(), DateTimeFieldType.halfdayOfDay().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25558);assertEquals(CopticChronology.getInstanceUTC().halfdayOfDay().isSupported(), DateTimeFieldType.halfdayOfDay().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25559);assertSerialization(DateTimeFieldType.halfdayOfDay());
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    @Test
    public void test_clockhourOfDay() throws Exception {__CLR4_4_1jl3jl3lgchork6.R.globalSliceStart(getClass().getName(),25560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c2lwxzjq0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jl3jl3lgchork6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jl3jl3lgchork6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_clockhourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c2lwxzjq0() throws Exception{try{__CLR4_4_1jl3jl3lgchork6.R.inc(25560);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25561);assertEquals(DateTimeFieldType.clockhourOfDay(), DateTimeFieldType.clockhourOfDay());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25562);assertEquals("clockhourOfDay", DateTimeFieldType.clockhourOfDay().getName());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25563);assertEquals(DurationFieldType.hours(), DateTimeFieldType.clockhourOfDay().getDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25564);assertEquals(DurationFieldType.days(), DateTimeFieldType.clockhourOfDay().getRangeDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25565);assertEquals(CopticChronology.getInstanceUTC().clockhourOfDay(), DateTimeFieldType.clockhourOfDay().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25566);assertEquals(CopticChronology.getInstanceUTC().clockhourOfDay().isSupported(), DateTimeFieldType.clockhourOfDay().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25567);assertSerialization(DateTimeFieldType.clockhourOfDay());
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    @Test
    public void test_clockhourOfHalfday() throws Exception {__CLR4_4_1jl3jl3lgchork6.R.globalSliceStart(getClass().getName(),25568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_148n4gkjq8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jl3jl3lgchork6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jl3jl3lgchork6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_clockhourOfHalfday",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25568,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_148n4gkjq8() throws Exception{try{__CLR4_4_1jl3jl3lgchork6.R.inc(25568);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25569);assertEquals(DateTimeFieldType.clockhourOfHalfday(), DateTimeFieldType.clockhourOfHalfday());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25570);assertEquals("clockhourOfHalfday", DateTimeFieldType.clockhourOfHalfday().getName());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25571);assertEquals(DurationFieldType.hours(), DateTimeFieldType.clockhourOfHalfday().getDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25572);assertEquals(DurationFieldType.halfdays(), DateTimeFieldType.clockhourOfHalfday().getRangeDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25573);assertEquals(CopticChronology.getInstanceUTC().clockhourOfHalfday(), DateTimeFieldType.clockhourOfHalfday().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25574);assertEquals(CopticChronology.getInstanceUTC().clockhourOfHalfday().isSupported(), DateTimeFieldType.clockhourOfHalfday().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25575);assertSerialization(DateTimeFieldType.clockhourOfHalfday());
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    @Test
    public void test_hourOfHalfday() throws Exception {__CLR4_4_1jl3jl3lgchork6.R.globalSliceStart(getClass().getName(),25576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1neiy5kjqg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jl3jl3lgchork6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jl3jl3lgchork6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_hourOfHalfday",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1neiy5kjqg() throws Exception{try{__CLR4_4_1jl3jl3lgchork6.R.inc(25576);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25577);assertEquals(DateTimeFieldType.hourOfHalfday(), DateTimeFieldType.hourOfHalfday());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25578);assertEquals("hourOfHalfday", DateTimeFieldType.hourOfHalfday().getName());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25579);assertEquals(DurationFieldType.hours(), DateTimeFieldType.hourOfHalfday().getDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25580);assertEquals(DurationFieldType.halfdays(), DateTimeFieldType.hourOfHalfday().getRangeDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25581);assertEquals(CopticChronology.getInstanceUTC().hourOfHalfday(), DateTimeFieldType.hourOfHalfday().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25582);assertEquals(CopticChronology.getInstanceUTC().hourOfHalfday().isSupported(), DateTimeFieldType.hourOfHalfday().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25583);assertSerialization(DateTimeFieldType.hourOfHalfday());
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    @Test
    public void test_hourOfDay() throws Exception {__CLR4_4_1jl3jl3lgchork6.R.globalSliceStart(getClass().getName(),25584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12mro4ljqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jl3jl3lgchork6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jl3jl3lgchork6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_hourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12mro4ljqo() throws Exception{try{__CLR4_4_1jl3jl3lgchork6.R.inc(25584);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25585);assertEquals(DateTimeFieldType.hourOfDay(), DateTimeFieldType.hourOfDay());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25586);assertEquals("hourOfDay", DateTimeFieldType.hourOfDay().getName());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25587);assertEquals(DurationFieldType.hours(), DateTimeFieldType.hourOfDay().getDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25588);assertEquals(DurationFieldType.days(), DateTimeFieldType.hourOfDay().getRangeDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25589);assertEquals(CopticChronology.getInstanceUTC().hourOfDay(), DateTimeFieldType.hourOfDay().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25590);assertEquals(CopticChronology.getInstanceUTC().hourOfDay().isSupported(), DateTimeFieldType.hourOfDay().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25591);assertSerialization(DateTimeFieldType.hourOfDay());
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    @Test
    public void test_minuteOfDay() throws Exception {__CLR4_4_1jl3jl3lgchork6.R.globalSliceStart(getClass().getName(),25592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jt78yzjqw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jl3jl3lgchork6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jl3jl3lgchork6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_minuteOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jt78yzjqw() throws Exception{try{__CLR4_4_1jl3jl3lgchork6.R.inc(25592);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25593);assertEquals(DateTimeFieldType.minuteOfDay(), DateTimeFieldType.minuteOfDay());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25594);assertEquals("minuteOfDay", DateTimeFieldType.minuteOfDay().getName());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25595);assertEquals(DurationFieldType.minutes(), DateTimeFieldType.minuteOfDay().getDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25596);assertEquals(DurationFieldType.days(), DateTimeFieldType.minuteOfDay().getRangeDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25597);assertEquals(CopticChronology.getInstanceUTC().minuteOfDay(), DateTimeFieldType.minuteOfDay().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25598);assertEquals(CopticChronology.getInstanceUTC().minuteOfDay().isSupported(), DateTimeFieldType.minuteOfDay().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25599);assertSerialization(DateTimeFieldType.minuteOfDay());
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    @Test
    public void test_minuteOfHour() throws Exception {__CLR4_4_1jl3jl3lgchork6.R.globalSliceStart(getClass().getName(),25600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p9vk6bjr4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jl3jl3lgchork6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jl3jl3lgchork6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_minuteOfHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25600,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p9vk6bjr4() throws Exception{try{__CLR4_4_1jl3jl3lgchork6.R.inc(25600);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25601);assertEquals(DateTimeFieldType.minuteOfHour(), DateTimeFieldType.minuteOfHour());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25602);assertEquals("minuteOfHour", DateTimeFieldType.minuteOfHour().getName());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25603);assertEquals(DurationFieldType.minutes(), DateTimeFieldType.minuteOfHour().getDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25604);assertEquals(DurationFieldType.hours(), DateTimeFieldType.minuteOfHour().getRangeDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25605);assertEquals(CopticChronology.getInstanceUTC().minuteOfHour(), DateTimeFieldType.minuteOfHour().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25606);assertEquals(CopticChronology.getInstanceUTC().minuteOfHour().isSupported(), DateTimeFieldType.minuteOfHour().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25607);assertSerialization(DateTimeFieldType.minuteOfHour());
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    @Test
    public void test_secondOfDay() throws Exception {__CLR4_4_1jl3jl3lgchork6.R.globalSliceStart(getClass().getName(),25608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12puci3jrc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jl3jl3lgchork6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jl3jl3lgchork6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_secondOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25608,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12puci3jrc() throws Exception{try{__CLR4_4_1jl3jl3lgchork6.R.inc(25608);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25609);assertEquals(DateTimeFieldType.secondOfDay(), DateTimeFieldType.secondOfDay());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25610);assertEquals("secondOfDay", DateTimeFieldType.secondOfDay().getName());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25611);assertEquals(DurationFieldType.seconds(), DateTimeFieldType.secondOfDay().getDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25612);assertEquals(DurationFieldType.days(), DateTimeFieldType.secondOfDay().getRangeDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25613);assertEquals(CopticChronology.getInstanceUTC().secondOfDay(), DateTimeFieldType.secondOfDay().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25614);assertEquals(CopticChronology.getInstanceUTC().secondOfDay().isSupported(), DateTimeFieldType.secondOfDay().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25615);assertSerialization(DateTimeFieldType.secondOfDay());
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    @Test
    public void test_secondOfMinute() throws Exception {__CLR4_4_1jl3jl3lgchork6.R.globalSliceStart(getClass().getName(),25616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14bhyerjrk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jl3jl3lgchork6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jl3jl3lgchork6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_secondOfMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25616,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14bhyerjrk() throws Exception{try{__CLR4_4_1jl3jl3lgchork6.R.inc(25616);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25617);assertEquals(DateTimeFieldType.secondOfMinute(), DateTimeFieldType.secondOfMinute());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25618);assertEquals("secondOfMinute", DateTimeFieldType.secondOfMinute().getName());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25619);assertEquals(DurationFieldType.seconds(), DateTimeFieldType.secondOfMinute().getDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25620);assertEquals(DurationFieldType.minutes(), DateTimeFieldType.secondOfMinute().getRangeDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25621);assertEquals(CopticChronology.getInstanceUTC().secondOfMinute(), DateTimeFieldType.secondOfMinute().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25622);assertEquals(CopticChronology.getInstanceUTC().secondOfMinute().isSupported(), DateTimeFieldType.secondOfMinute().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25623);assertSerialization(DateTimeFieldType.secondOfMinute());
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    @Test
    public void test_millisOfDay() throws Exception {__CLR4_4_1jl3jl3lgchork6.R.globalSliceStart(getClass().getName(),25624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ugkhh5jrs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jl3jl3lgchork6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jl3jl3lgchork6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_millisOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25624,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ugkhh5jrs() throws Exception{try{__CLR4_4_1jl3jl3lgchork6.R.inc(25624);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25625);assertEquals(DateTimeFieldType.millisOfDay(), DateTimeFieldType.millisOfDay());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25626);assertEquals("millisOfDay", DateTimeFieldType.millisOfDay().getName());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25627);assertEquals(DurationFieldType.millis(), DateTimeFieldType.millisOfDay().getDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25628);assertEquals(DurationFieldType.days(), DateTimeFieldType.millisOfDay().getRangeDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25629);assertEquals(CopticChronology.getInstanceUTC().millisOfDay(), DateTimeFieldType.millisOfDay().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25630);assertEquals(CopticChronology.getInstanceUTC().millisOfDay().isSupported(), DateTimeFieldType.millisOfDay().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25631);assertSerialization(DateTimeFieldType.millisOfDay());
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    @Test
    public void test_millisOfSecond() throws Exception {__CLR4_4_1jl3jl3lgchork6.R.globalSliceStart(getClass().getName(),25632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gqahsrjs0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jl3jl3lgchork6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jl3jl3lgchork6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_millisOfSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gqahsrjs0() throws Exception{try{__CLR4_4_1jl3jl3lgchork6.R.inc(25632);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25633);assertEquals(DateTimeFieldType.millisOfSecond(), DateTimeFieldType.millisOfSecond());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25634);assertEquals("millisOfSecond", DateTimeFieldType.millisOfSecond().getName());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25635);assertEquals(DurationFieldType.millis(), DateTimeFieldType.millisOfSecond().getDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25636);assertEquals(DurationFieldType.seconds(), DateTimeFieldType.millisOfSecond().getRangeDurationType());
        __CLR4_4_1jl3jl3lgchork6.R.inc(25637);assertEquals(CopticChronology.getInstanceUTC().millisOfSecond(), DateTimeFieldType.millisOfSecond().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25638);assertEquals(CopticChronology.getInstanceUTC().millisOfSecond().isSupported(), DateTimeFieldType.millisOfSecond().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1jl3jl3lgchork6.R.inc(25639);assertSerialization(DateTimeFieldType.millisOfSecond());
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}
/*
    @Test public void test_other() throws Exception {
        assertEquals(1, DateTimeFieldType.class.getDeclaredClasses().length);
        Class cls = DateTimeFieldType.class.getDeclaredClasses()[0];
        assertEquals(1, cls.getDeclaredConstructors().length);
        Constructor con = cls.getDeclaredConstructors()[0];
        Object[] params = new Object[] {
            "other", new Byte((byte) 128), DurationFieldType.hours(), DurationFieldType.months()};
        con.setAccessible(true);  // for Apache Harmony JVM
        DateTimeFieldType type = (DateTimeFieldType) con.newInstance(params);
        
        assertEquals("other", type.getName());
        assertSame(DurationFieldType.hours(), type.getDurationType());
        assertSame(DurationFieldType.months(), type.getRangeDurationType());
        try {
            type.getField(CopticChronology.getInstanceUTC());
            fail();
        } catch (InternalError ex) {}
        DateTimeFieldType result = doSerialization(type);
        assertEquals(type.getName(), result.getName());
        assertNotSame(type, result);
    }

    */

    //-----------------------------------------------------------------------
    private void assertSerialization(DateTimeFieldType type) throws Exception {try{__CLR4_4_1jl3jl3lgchork6.R.inc(25640);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25641);DateTimeFieldType result = doSerialization(type);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25642);assertSame(type, result);
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

    private DateTimeFieldType doSerialization(DateTimeFieldType type) throws Exception {try{__CLR4_4_1jl3jl3lgchork6.R.inc(25643);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25644);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25645);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25646);oos.writeObject(type);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25647);oos.close();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25648);byte[] bytes = baos.toByteArray();

        __CLR4_4_1jl3jl3lgchork6.R.inc(25649);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25650);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1jl3jl3lgchork6.R.inc(25651);DateTimeFieldType result = (DateTimeFieldType) ois.readObject();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25652);ois.close();
        __CLR4_4_1jl3jl3lgchork6.R.inc(25653);return result;
    }finally{__CLR4_4_1jl3jl3lgchork6.R.flushNeeded();}}

}
