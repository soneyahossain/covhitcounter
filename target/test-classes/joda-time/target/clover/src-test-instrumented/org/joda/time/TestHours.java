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
package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is a Junit unit test for Hours.
 *
 * @author Stephen Colebourne
 */
public class TestHours {static class __CLR4_4_1p0vp0vlgchorto{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,32737,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) throws Exception {try{__CLR4_4_1p0vp0vlgchorto.R.inc(32431);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32432);TestHours TB = new TestHours();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32433);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32434);TB.testConstants();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32435);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32436);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32437);TB.testFactory_hours_int();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32438);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32439);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32440);TB.testFactory_hoursBetween_RInstant();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32441);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32442);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32443);TB.testFactory_hoursBetween_RPartial();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32444);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32445);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32446);TB.testFactory_hoursIn_RInterval();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32447);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32448);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32449);TB.testFactory_standardHoursIn_RPeriod();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32450);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32451);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32452);TB.testFactory_parseHours_String();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32453);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32454);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32455);TB.testGetMethods();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32456);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32457);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32458);TB.testGetFieldType();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32459);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32460);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32461);TB.testGetPeriodType();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32462);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32463);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32464);TB.testIsGreaterThan();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32465);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32466);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32467);TB.testIsLessThan();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32468);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32469);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32470);TB.testToString();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32471);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32472);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32473);TB.testSerialization();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32474);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32475);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32476);TB.testToStandardWeeks();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32477);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32478);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32479);TB.testToStandardDays();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32480);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32481);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32482);TB.testToStandardMinutes();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32483);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32484);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32485);TB.testToStandardSeconds();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32486);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32487);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32488);TB.testToStandardDuration();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32489);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32490);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32491);TB.testPlus_int();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32492);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32493);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32494);TB.testPlus_Hours();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32495);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32496);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32497);TB.testMinus_int();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32498);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32499);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32500);TB.testMinus_Hours();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32501);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32502);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32503);TB.testMultipliedBy_int();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32504);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32505);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32506);TB.testDividedBy_int();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32507);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32508);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32509);TB.testNegated();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32510);TB.tearDown();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32511);TB.setUp();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32512);TB.testAddToLocalDate();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32513);TB.tearDown();

    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestHours.class);
    }

    public TestHours(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1p0vp0vlgchorto.R.inc(32514);
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1p0vp0vlgchorto.R.inc(32515);
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstants() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15epzlwp38();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testConstants",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15epzlwp38(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32516);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32517);assertEquals(0, Hours.ZERO.getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32518);assertEquals(1, Hours.ONE.getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32519);assertEquals(2, Hours.TWO.getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32520);assertEquals(3, Hours.THREE.getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32521);assertEquals(4, Hours.FOUR.getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32522);assertEquals(5, Hours.FIVE.getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32523);assertEquals(6, Hours.SIX.getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32524);assertEquals(7, Hours.SEVEN.getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32525);assertEquals(8, Hours.EIGHT.getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32526);assertEquals(Integer.MAX_VALUE, Hours.MAX_VALUE.getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32527);assertEquals(Integer.MIN_VALUE, Hours.MIN_VALUE.getHours());
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_hours_int() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kel8ynp3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hours_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kel8ynp3k(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32528);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32529);assertSame(Hours.ZERO, Hours.hours(0));
        __CLR4_4_1p0vp0vlgchorto.R.inc(32530);assertSame(Hours.ONE, Hours.hours(1));
        __CLR4_4_1p0vp0vlgchorto.R.inc(32531);assertSame(Hours.TWO, Hours.hours(2));
        __CLR4_4_1p0vp0vlgchorto.R.inc(32532);assertSame(Hours.THREE, Hours.hours(3));
        __CLR4_4_1p0vp0vlgchorto.R.inc(32533);assertSame(Hours.FOUR, Hours.hours(4));
        __CLR4_4_1p0vp0vlgchorto.R.inc(32534);assertSame(Hours.FIVE, Hours.hours(5));
        __CLR4_4_1p0vp0vlgchorto.R.inc(32535);assertSame(Hours.SIX, Hours.hours(6));
        __CLR4_4_1p0vp0vlgchorto.R.inc(32536);assertSame(Hours.SEVEN, Hours.hours(7));
        __CLR4_4_1p0vp0vlgchorto.R.inc(32537);assertSame(Hours.EIGHT, Hours.hours(8));
        __CLR4_4_1p0vp0vlgchorto.R.inc(32538);assertSame(Hours.MAX_VALUE, Hours.hours(Integer.MAX_VALUE));
        __CLR4_4_1p0vp0vlgchorto.R.inc(32539);assertSame(Hours.MIN_VALUE, Hours.hours(Integer.MIN_VALUE));
        __CLR4_4_1p0vp0vlgchorto.R.inc(32540);assertEquals(-1, Hours.hours(-1).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32541);assertEquals(9, Hours.hours(9).getHours());
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_hoursBetween_RInstant() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_120ilp1p3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hoursBetween_RInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_120ilp1p3y(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32542);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32543);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32544);DateTime end1 = new DateTime(2006, 6, 9, 15, 0, 0, 0, PARIS);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32545);DateTime end2 = new DateTime(2006, 6, 9, 18, 0, 0, 0, PARIS);

        __CLR4_4_1p0vp0vlgchorto.R.inc(32546);assertEquals(3, Hours.hoursBetween(start, end1).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32547);assertEquals(0, Hours.hoursBetween(start, start).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32548);assertEquals(0, Hours.hoursBetween(end1, end1).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32549);assertEquals(-3, Hours.hoursBetween(end1, start).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32550);assertEquals(6, Hours.hoursBetween(start, end2).getHours());
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    @Test
    public void testFactory_hoursBetween_RPartial() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ihma5xp47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hoursBetween_RPartial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ihma5xp47(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32551);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32552);LocalTime start = new LocalTime(12, 0);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32553);LocalTime end1 = new LocalTime(15, 0);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32554);@SuppressWarnings("deprecation")
        TimeOfDay end2 = new TimeOfDay(18, 0);

        __CLR4_4_1p0vp0vlgchorto.R.inc(32555);assertEquals(3, Hours.hoursBetween(start, end1).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32556);assertEquals(0, Hours.hoursBetween(start, start).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32557);assertEquals(0, Hours.hoursBetween(end1, end1).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32558);assertEquals(-3, Hours.hoursBetween(end1, start).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32559);assertEquals(6, Hours.hoursBetween(start, end2).getHours());
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    @Test
    public void testFactory_hoursIn_RInterval() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1662vf0p4g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hoursIn_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1662vf0p4g(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32560);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32561);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32562);DateTime end1 = new DateTime(2006, 6, 9, 15, 0, 0, 0, PARIS);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32563);DateTime end2 = new DateTime(2006, 6, 9, 18, 0, 0, 0, PARIS);

        __CLR4_4_1p0vp0vlgchorto.R.inc(32564);assertEquals(0, Hours.hoursIn((ReadableInterval) null).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32565);assertEquals(3, Hours.hoursIn(new Interval(start, end1)).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32566);assertEquals(0, Hours.hoursIn(new Interval(start, start)).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32567);assertEquals(0, Hours.hoursIn(new Interval(end1, end1)).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32568);assertEquals(6, Hours.hoursIn(new Interval(start, end2)).getHours());
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    @Test
    public void testFactory_standardHoursIn_RPeriod() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18bwylnp4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_standardHoursIn_RPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18bwylnp4p(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32569);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32570);assertEquals(0, Hours.standardHoursIn((ReadablePeriod) null).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32571);assertEquals(0, Hours.standardHoursIn(Period.ZERO).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32572);assertEquals(1, Hours.standardHoursIn(new Period(0, 0, 0, 0, 1, 0, 0, 0)).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32573);assertEquals(123, Hours.standardHoursIn(Period.hours(123)).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32574);assertEquals(-987, Hours.standardHoursIn(Period.hours(-987)).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32575);assertEquals(1, Hours.standardHoursIn(Period.minutes(119)).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32576);assertEquals(2, Hours.standardHoursIn(Period.minutes(120)).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32577);assertEquals(2, Hours.standardHoursIn(Period.minutes(121)).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32578);assertEquals(48, Hours.standardHoursIn(Period.days(2)).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32579);try {
            __CLR4_4_1p0vp0vlgchorto.R.inc(32580);Hours.standardHoursIn(Period.months(1));
            __CLR4_4_1p0vp0vlgchorto.R.inc(32581);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    @Test
    public void testFactory_parseHours_String() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17surxwp52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_parseHours_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17surxwp52(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32582);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32583);assertEquals(0, Hours.parseHours((String) null).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32584);assertEquals(0, Hours.parseHours("PT0H").getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32585);assertEquals(1, Hours.parseHours("PT1H").getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32586);assertEquals(-3, Hours.parseHours("PT-3H").getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32587);assertEquals(2, Hours.parseHours("P0Y0M0DT2H").getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32588);assertEquals(2, Hours.parseHours("PT2H0M").getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32589);try {
            __CLR4_4_1p0vp0vlgchorto.R.inc(32590);Hours.parseHours("P1Y1D");
            __CLR4_4_1p0vp0vlgchorto.R.inc(32591);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1p0vp0vlgchorto.R.inc(32592);try {
            __CLR4_4_1p0vp0vlgchorto.R.inc(32593);Hours.parseHours("P1DT1H");
            __CLR4_4_1p0vp0vlgchorto.R.inc(32594);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetMethods() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sjdmzp5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testGetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32595,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sjdmzp5f(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32595);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32596);Hours test = Hours.hours(20);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32597);assertEquals(20, test.getHours());
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    @Test
    public void testGetFieldType() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mvp5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mvp5i(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32598);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32599);Hours test = Hours.hours(20);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32600);assertEquals(DurationFieldType.hours(), test.getFieldType());
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    @Test
    public void testGetPeriodType() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivat1ip5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testGetPeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32601,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivat1ip5l(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32601);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32602);Hours test = Hours.hours(20);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32603);assertEquals(PeriodType.hours(), test.getPeriodType());
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsGreaterThan() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5pnomp5o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testIsGreaterThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5pnomp5o(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32604);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32605);assertEquals(true, Hours.THREE.isGreaterThan(Hours.TWO));
        __CLR4_4_1p0vp0vlgchorto.R.inc(32606);assertEquals(false, Hours.THREE.isGreaterThan(Hours.THREE));
        __CLR4_4_1p0vp0vlgchorto.R.inc(32607);assertEquals(false, Hours.TWO.isGreaterThan(Hours.THREE));
        __CLR4_4_1p0vp0vlgchorto.R.inc(32608);assertEquals(true, Hours.ONE.isGreaterThan(null));
        __CLR4_4_1p0vp0vlgchorto.R.inc(32609);assertEquals(false, Hours.hours(-1).isGreaterThan(null));
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    @Test
    public void testIsLessThan() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmk0kdp5u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testIsLessThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmk0kdp5u(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32610);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32611);assertEquals(false, Hours.THREE.isLessThan(Hours.TWO));
        __CLR4_4_1p0vp0vlgchorto.R.inc(32612);assertEquals(false, Hours.THREE.isLessThan(Hours.THREE));
        __CLR4_4_1p0vp0vlgchorto.R.inc(32613);assertEquals(true, Hours.TWO.isLessThan(Hours.THREE));
        __CLR4_4_1p0vp0vlgchorto.R.inc(32614);assertEquals(false, Hours.ONE.isLessThan(null));
        __CLR4_4_1p0vp0vlgchorto.R.inc(32615);assertEquals(true, Hours.hours(-1).isLessThan(null));
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidp60();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32616,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidp60(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32616);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32617);Hours test = Hours.hours(20);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32618);assertEquals("PT20H", test.toString());

        __CLR4_4_1p0vp0vlgchorto.R.inc(32619);test = Hours.hours(-20);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32620);assertEquals("PT-20H", test.toString());
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9p65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9p65() throws Exception{try{__CLR4_4_1p0vp0vlgchorto.R.inc(32621);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32622);Hours test = Hours.SEVEN;

        __CLR4_4_1p0vp0vlgchorto.R.inc(32623);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32624);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32625);oos.writeObject(test);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32626);oos.close();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32627);byte[] bytes = baos.toByteArray();

        __CLR4_4_1p0vp0vlgchorto.R.inc(32628);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32629);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32630);Hours result = (Hours) ois.readObject();
        __CLR4_4_1p0vp0vlgchorto.R.inc(32631);ois.close();

        __CLR4_4_1p0vp0vlgchorto.R.inc(32632);assertSame(test, result);
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToStandardWeeks() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pfkyx0p6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pfkyx0p6h(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32633);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32634);Hours test = Hours.hours(24 * 7 * 2);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32635);Weeks expected = Weeks.weeks(2);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32636);assertEquals(expected, test.toStandardWeeks());
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    @Test
    public void testToStandardDays() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eftdm0p6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32637,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eftdm0p6l(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32637);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32638);Hours test = Hours.hours(24 * 2);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32639);Days expected = Days.days(2);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32640);assertEquals(expected, test.toStandardDays());
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    @Test
    public void testToStandardMinutes() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0kt44p6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0kt44p6p(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32641);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32642);Hours test = Hours.hours(3);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32643);Minutes expected = Minutes.minutes(3 * 60);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32644);assertEquals(expected, test.toStandardMinutes());

        __CLR4_4_1p0vp0vlgchorto.R.inc(32645);try {
            __CLR4_4_1p0vp0vlgchorto.R.inc(32646);Hours.MAX_VALUE.toStandardMinutes();
            __CLR4_4_1p0vp0vlgchorto.R.inc(32647);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    @Test
    public void testToStandardSeconds() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1emeoqsp6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32648,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1emeoqsp6w(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32648);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32649);Hours test = Hours.hours(3);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32650);Seconds expected = Seconds.seconds(3 * 60 * 60);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32651);assertEquals(expected, test.toStandardSeconds());

        __CLR4_4_1p0vp0vlgchorto.R.inc(32652);try {
            __CLR4_4_1p0vp0vlgchorto.R.inc(32653);Hours.MAX_VALUE.toStandardSeconds();
            __CLR4_4_1p0vp0vlgchorto.R.inc(32654);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    @Test
    public void testToStandardDuration() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izmvnpp73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izmvnpp73(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32655);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32656);Hours test = Hours.hours(20);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32657);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_HOUR);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32658);assertEquals(expected, test.toStandardDuration());

        __CLR4_4_1p0vp0vlgchorto.R.inc(32659);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_HOUR);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32660);assertEquals(expected, Hours.MAX_VALUE.toStandardDuration());
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPlus_int() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1scc4ebp79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testPlus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32661,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1scc4ebp79(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32661);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32662);Hours test2 = Hours.hours(2);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32663);Hours result = test2.plus(3);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32664);assertEquals(2, test2.getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32665);assertEquals(5, result.getHours());

        __CLR4_4_1p0vp0vlgchorto.R.inc(32666);assertEquals(1, Hours.ONE.plus(0).getHours());

        __CLR4_4_1p0vp0vlgchorto.R.inc(32667);try {
            __CLR4_4_1p0vp0vlgchorto.R.inc(32668);Hours.MAX_VALUE.plus(1);
            __CLR4_4_1p0vp0vlgchorto.R.inc(32669);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    @Test
    public void testPlus_Hours() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pmgrulp7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testPlus_Hours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pmgrulp7i(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32670);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32671);Hours test2 = Hours.hours(2);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32672);Hours test3 = Hours.hours(3);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32673);Hours result = test2.plus(test3);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32674);assertEquals(2, test2.getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32675);assertEquals(3, test3.getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32676);assertEquals(5, result.getHours());

        __CLR4_4_1p0vp0vlgchorto.R.inc(32677);assertEquals(1, Hours.ONE.plus(Hours.ZERO).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32678);assertEquals(1, Hours.ONE.plus((Hours) null).getHours());

        __CLR4_4_1p0vp0vlgchorto.R.inc(32679);try {
            __CLR4_4_1p0vp0vlgchorto.R.inc(32680);Hours.MAX_VALUE.plus(Hours.ONE);
            __CLR4_4_1p0vp0vlgchorto.R.inc(32681);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    @Test
    public void testMinus_int() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118wkvpp7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testMinus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118wkvpp7u(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32682);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32683);Hours test2 = Hours.hours(2);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32684);Hours result = test2.minus(3);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32685);assertEquals(2, test2.getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32686);assertEquals(-1, result.getHours());

        __CLR4_4_1p0vp0vlgchorto.R.inc(32687);assertEquals(1, Hours.ONE.minus(0).getHours());

        __CLR4_4_1p0vp0vlgchorto.R.inc(32688);try {
            __CLR4_4_1p0vp0vlgchorto.R.inc(32689);Hours.MIN_VALUE.minus(1);
            __CLR4_4_1p0vp0vlgchorto.R.inc(32690);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    @Test
    public void testMinus_Hours() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143zd9xp83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testMinus_Hours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143zd9xp83(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32691);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32692);Hours test2 = Hours.hours(2);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32693);Hours test3 = Hours.hours(3);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32694);Hours result = test2.minus(test3);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32695);assertEquals(2, test2.getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32696);assertEquals(3, test3.getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32697);assertEquals(-1, result.getHours());

        __CLR4_4_1p0vp0vlgchorto.R.inc(32698);assertEquals(1, Hours.ONE.minus(Hours.ZERO).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32699);assertEquals(1, Hours.ONE.minus((Hours) null).getHours());

        __CLR4_4_1p0vp0vlgchorto.R.inc(32700);try {
            __CLR4_4_1p0vp0vlgchorto.R.inc(32701);Hours.MIN_VALUE.minus(Hours.ONE);
            __CLR4_4_1p0vp0vlgchorto.R.inc(32702);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    @Test
    public void testMultipliedBy_int() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1szpsdpp8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testMultipliedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1szpsdpp8f(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32703);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32704);Hours test = Hours.hours(2);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32705);assertEquals(6, test.multipliedBy(3).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32706);assertEquals(2, test.getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32707);assertEquals(-6, test.multipliedBy(-3).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32708);assertSame(test, test.multipliedBy(1));

        __CLR4_4_1p0vp0vlgchorto.R.inc(32709);Hours halfMax = Hours.hours(Integer.MAX_VALUE / 2 + 1);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32710);try {
            __CLR4_4_1p0vp0vlgchorto.R.inc(32711);halfMax.multipliedBy(2);
            __CLR4_4_1p0vp0vlgchorto.R.inc(32712);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    @Test
    public void testDividedBy_int() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9i8qvp8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testDividedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32713,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9i8qvp8p(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32713);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32714);Hours test = Hours.hours(12);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32715);assertEquals(6, test.dividedBy(2).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32716);assertEquals(12, test.getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32717);assertEquals(4, test.dividedBy(3).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32718);assertEquals(3, test.dividedBy(4).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32719);assertEquals(2, test.dividedBy(5).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32720);assertEquals(2, test.dividedBy(6).getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32721);assertSame(test, test.dividedBy(1));

        __CLR4_4_1p0vp0vlgchorto.R.inc(32722);try {
            __CLR4_4_1p0vp0vlgchorto.R.inc(32723);Hours.ONE.dividedBy(0);
            __CLR4_4_1p0vp0vlgchorto.R.inc(32724);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    @Test
    public void testNegated() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av3307p91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testNegated",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av3307p91(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32725);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32726);Hours test = Hours.hours(12);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32727);assertEquals(-12, test.negated().getHours());
        __CLR4_4_1p0vp0vlgchorto.R.inc(32728);assertEquals(12, test.getHours());

        __CLR4_4_1p0vp0vlgchorto.R.inc(32729);try {
            __CLR4_4_1p0vp0vlgchorto.R.inc(32730);Hours.MIN_VALUE.negated();
            __CLR4_4_1p0vp0vlgchorto.R.inc(32731);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddToLocalDate() {__CLR4_4_1p0vp0vlgchorto.R.globalSliceStart(getClass().getName(),32732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thm5yup98();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p0vp0vlgchorto.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p0vp0vlgchorto.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testAddToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32732,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thm5yup98(){try{__CLR4_4_1p0vp0vlgchorto.R.inc(32732);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32733);Hours test = Hours.hours(26);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32734);LocalDateTime date = new LocalDateTime(2006, 6, 1, 0, 0, 0, 0);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32735);LocalDateTime expected = new LocalDateTime(2006, 6, 2, 2, 0, 0, 0);
        __CLR4_4_1p0vp0vlgchorto.R.inc(32736);assertEquals(expected, date.plus(test));
    }finally{__CLR4_4_1p0vp0vlgchorto.R.flushNeeded();}}

}
