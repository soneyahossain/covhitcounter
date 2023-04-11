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
 * This class is a Junit unit test for Minutes.
 *
 * @author Stephen Colebourne
 */
public class TestMinutes {static class __CLR4_4_1wguwgulgchos4o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,42371,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) throws Exception {try{__CLR4_4_1wguwgulgchos4o.R.inc(42078);
        __CLR4_4_1wguwgulgchos4o.R.inc(42079);TestMinutes TB = new TestMinutes();
        __CLR4_4_1wguwgulgchos4o.R.inc(42080);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42081);TB.testConstants();
        __CLR4_4_1wguwgulgchos4o.R.inc(42082);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42083);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42084);TB.testFactory_minutes_int();
        __CLR4_4_1wguwgulgchos4o.R.inc(42085);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42086);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42087);TB.testFactory_minutesBetween_RInstant();
        __CLR4_4_1wguwgulgchos4o.R.inc(42088);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42089);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42090);TB.testFactory_minutesBetween_RPartial();
        __CLR4_4_1wguwgulgchos4o.R.inc(42091);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42092);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42093);TB.testFactory_minutesIn_RInterval();
        __CLR4_4_1wguwgulgchos4o.R.inc(42094);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42095);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42096);TB.testFactory_standardMinutesIn_RPeriod();
        __CLR4_4_1wguwgulgchos4o.R.inc(42097);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42098);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42099);TB.testFactory_parseMinutes_String();
        __CLR4_4_1wguwgulgchos4o.R.inc(42100);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42101);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42102);TB.testGetMethods();
        __CLR4_4_1wguwgulgchos4o.R.inc(42103);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42104);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42105);TB.testGetFieldType();
        __CLR4_4_1wguwgulgchos4o.R.inc(42106);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42107);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42108);TB.testGetPeriodType();
        __CLR4_4_1wguwgulgchos4o.R.inc(42109);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42110);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42111);TB.testIsGreaterThan();
        __CLR4_4_1wguwgulgchos4o.R.inc(42112);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42113);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42114);TB.testIsLessThan();
        __CLR4_4_1wguwgulgchos4o.R.inc(42115);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42116);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42117);TB.testToString();
        __CLR4_4_1wguwgulgchos4o.R.inc(42118);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42119);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42120);TB.testSerialization();
        __CLR4_4_1wguwgulgchos4o.R.inc(42121);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42122);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42123);TB.testToStandardWeeks();
        __CLR4_4_1wguwgulgchos4o.R.inc(42124);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42125);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42126);TB.testToStandardDays();
        __CLR4_4_1wguwgulgchos4o.R.inc(42127);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42128);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42129);TB.testToStandardHours();
        __CLR4_4_1wguwgulgchos4o.R.inc(42130);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42131);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42132);TB.testToStandardSeconds();
        __CLR4_4_1wguwgulgchos4o.R.inc(42133);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42134);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42135);TB.testToStandardDuration();
        __CLR4_4_1wguwgulgchos4o.R.inc(42136);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42137);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42138);TB.testPlus_int();
        __CLR4_4_1wguwgulgchos4o.R.inc(42139);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42140);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42141);TB.testPlus_Minutes();
        __CLR4_4_1wguwgulgchos4o.R.inc(42142);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42143);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42144);TB.testMinus_int();
        __CLR4_4_1wguwgulgchos4o.R.inc(42145);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42146);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42147);TB.testMinus_Minutes();
        __CLR4_4_1wguwgulgchos4o.R.inc(42148);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42149);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42150);TB.testMultipliedBy_int();
        __CLR4_4_1wguwgulgchos4o.R.inc(42151);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42152);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42153);TB.testDividedBy_int();
        __CLR4_4_1wguwgulgchos4o.R.inc(42154);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42155);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42156);TB.testNegated();
        __CLR4_4_1wguwgulgchos4o.R.inc(42157);TB.tearDown();
        __CLR4_4_1wguwgulgchos4o.R.inc(42158);TB.setUp();
        __CLR4_4_1wguwgulgchos4o.R.inc(42159);TB.testAddToLocalDate();
        __CLR4_4_1wguwgulgchos4o.R.inc(42160);TB.tearDown();

    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestMinutes.class);
    }

    public TestMinutes(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1wguwgulgchos4o.R.inc(42161);
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1wguwgulgchos4o.R.inc(42162);
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstants() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15epzlwwj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testConstants",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42163,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15epzlwwj7(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42163);
        __CLR4_4_1wguwgulgchos4o.R.inc(42164);assertEquals(0, Minutes.ZERO.getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42165);assertEquals(1, Minutes.ONE.getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42166);assertEquals(2, Minutes.TWO.getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42167);assertEquals(3, Minutes.THREE.getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42168);assertEquals(Integer.MAX_VALUE, Minutes.MAX_VALUE.getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42169);assertEquals(Integer.MIN_VALUE, Minutes.MIN_VALUE.getMinutes());
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_minutes_int() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lwdd5dwje();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutes_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lwdd5dwje(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42170);
        __CLR4_4_1wguwgulgchos4o.R.inc(42171);assertSame(Minutes.ZERO, Minutes.minutes(0));
        __CLR4_4_1wguwgulgchos4o.R.inc(42172);assertSame(Minutes.ONE, Minutes.minutes(1));
        __CLR4_4_1wguwgulgchos4o.R.inc(42173);assertSame(Minutes.TWO, Minutes.minutes(2));
        __CLR4_4_1wguwgulgchos4o.R.inc(42174);assertSame(Minutes.THREE, Minutes.minutes(3));
        __CLR4_4_1wguwgulgchos4o.R.inc(42175);assertSame(Minutes.MAX_VALUE, Minutes.minutes(Integer.MAX_VALUE));
        __CLR4_4_1wguwgulgchos4o.R.inc(42176);assertSame(Minutes.MIN_VALUE, Minutes.minutes(Integer.MIN_VALUE));
        __CLR4_4_1wguwgulgchos4o.R.inc(42177);assertEquals(-1, Minutes.minutes(-1).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42178);assertEquals(4, Minutes.minutes(4).getMinutes());
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_minutesBetween_RInstant() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x5b21nwjn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesBetween_RInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x5b21nwjn(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42179);
        __CLR4_4_1wguwgulgchos4o.R.inc(42180);DateTime start = new DateTime(2006, 6, 9, 12, 3, 0, 0, PARIS);
        __CLR4_4_1wguwgulgchos4o.R.inc(42181);DateTime end1 = new DateTime(2006, 6, 9, 12, 6, 0, 0, PARIS);
        __CLR4_4_1wguwgulgchos4o.R.inc(42182);DateTime end2 = new DateTime(2006, 6, 9, 12, 9, 0, 0, PARIS);

        __CLR4_4_1wguwgulgchos4o.R.inc(42183);assertEquals(3, Minutes.minutesBetween(start, end1).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42184);assertEquals(0, Minutes.minutesBetween(start, start).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42185);assertEquals(0, Minutes.minutesBetween(end1, end1).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42186);assertEquals(-3, Minutes.minutesBetween(end1, start).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42187);assertEquals(6, Minutes.minutesBetween(start, end2).getMinutes());
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    @Test
    public void testFactory_minutesBetween_RPartial() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1go7dkrwjw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesBetween_RPartial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1go7dkrwjw(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42188);
        __CLR4_4_1wguwgulgchos4o.R.inc(42189);LocalTime start = new LocalTime(12, 3);
        __CLR4_4_1wguwgulgchos4o.R.inc(42190);LocalTime end1 = new LocalTime(12, 6);
        __CLR4_4_1wguwgulgchos4o.R.inc(42191);@SuppressWarnings("deprecation")
        TimeOfDay end2 = new TimeOfDay(12, 9);

        __CLR4_4_1wguwgulgchos4o.R.inc(42192);assertEquals(3, Minutes.minutesBetween(start, end1).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42193);assertEquals(0, Minutes.minutesBetween(start, start).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42194);assertEquals(0, Minutes.minutesBetween(end1, end1).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42195);assertEquals(-3, Minutes.minutesBetween(end1, start).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42196);assertEquals(6, Minutes.minutesBetween(start, end2).getMinutes());
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    @Test
    public void testFactory_minutesIn_RInterval() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cr4b8kwk5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesIn_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cr4b8kwk5(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42197);
        __CLR4_4_1wguwgulgchos4o.R.inc(42198);DateTime start = new DateTime(2006, 6, 9, 12, 3, 0, 0, PARIS);
        __CLR4_4_1wguwgulgchos4o.R.inc(42199);DateTime end1 = new DateTime(2006, 6, 9, 12, 6, 0, 0, PARIS);
        __CLR4_4_1wguwgulgchos4o.R.inc(42200);DateTime end2 = new DateTime(2006, 6, 9, 12, 9, 0, 0, PARIS);

        __CLR4_4_1wguwgulgchos4o.R.inc(42201);assertEquals(0, Minutes.minutesIn((ReadableInterval) null).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42202);assertEquals(3, Minutes.minutesIn(new Interval(start, end1)).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42203);assertEquals(0, Minutes.minutesIn(new Interval(start, start)).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42204);assertEquals(0, Minutes.minutesIn(new Interval(end1, end1)).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42205);assertEquals(6, Minutes.minutesIn(new Interval(start, end2)).getMinutes());
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    @Test
    public void testFactory_standardMinutesIn_RPeriod() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bkisxnwke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_standardMinutesIn_RPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bkisxnwke(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42206);
        __CLR4_4_1wguwgulgchos4o.R.inc(42207);assertEquals(0, Minutes.standardMinutesIn((ReadablePeriod) null).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42208);assertEquals(0, Minutes.standardMinutesIn(Period.ZERO).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42209);assertEquals(1, Minutes.standardMinutesIn(new Period(0, 0, 0, 0, 0, 1, 0, 0)).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42210);assertEquals(123, Minutes.standardMinutesIn(Period.minutes(123)).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42211);assertEquals(-987, Minutes.standardMinutesIn(Period.minutes(-987)).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42212);assertEquals(1, Minutes.standardMinutesIn(Period.seconds(119)).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42213);assertEquals(2, Minutes.standardMinutesIn(Period.seconds(120)).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42214);assertEquals(2, Minutes.standardMinutesIn(Period.seconds(121)).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42215);assertEquals(120, Minutes.standardMinutesIn(Period.hours(2)).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42216);try {
            __CLR4_4_1wguwgulgchos4o.R.inc(42217);Minutes.standardMinutesIn(Period.months(1));
            __CLR4_4_1wguwgulgchos4o.R.inc(42218);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    @Test
    public void testFactory_parseMinutes_String() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1694qhwwkr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_parseMinutes_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1694qhwwkr(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42219);
        __CLR4_4_1wguwgulgchos4o.R.inc(42220);assertEquals(0, Minutes.parseMinutes((String) null).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42221);assertEquals(0, Minutes.parseMinutes("PT0M").getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42222);assertEquals(1, Minutes.parseMinutes("PT1M").getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42223);assertEquals(-3, Minutes.parseMinutes("PT-3M").getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42224);assertEquals(2, Minutes.parseMinutes("P0Y0M0DT2M").getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42225);assertEquals(2, Minutes.parseMinutes("PT0H2M").getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42226);try {
            __CLR4_4_1wguwgulgchos4o.R.inc(42227);Minutes.parseMinutes("P1Y1D");
            __CLR4_4_1wguwgulgchos4o.R.inc(42228);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1wguwgulgchos4o.R.inc(42229);try {
            __CLR4_4_1wguwgulgchos4o.R.inc(42230);Minutes.parseMinutes("P1DT1M");
            __CLR4_4_1wguwgulgchos4o.R.inc(42231);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetMethods() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sjdmzwl4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testGetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42232,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sjdmzwl4(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42232);
        __CLR4_4_1wguwgulgchos4o.R.inc(42233);Minutes test = Minutes.minutes(20);
        __CLR4_4_1wguwgulgchos4o.R.inc(42234);assertEquals(20, test.getMinutes());
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    @Test
    public void testGetFieldType() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mvwl7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42235,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mvwl7(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42235);
        __CLR4_4_1wguwgulgchos4o.R.inc(42236);Minutes test = Minutes.minutes(20);
        __CLR4_4_1wguwgulgchos4o.R.inc(42237);assertEquals(DurationFieldType.minutes(), test.getFieldType());
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    @Test
    public void testGetPeriodType() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivat1iwla();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testGetPeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivat1iwla(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42238);
        __CLR4_4_1wguwgulgchos4o.R.inc(42239);Minutes test = Minutes.minutes(20);
        __CLR4_4_1wguwgulgchos4o.R.inc(42240);assertEquals(PeriodType.minutes(), test.getPeriodType());
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsGreaterThan() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5pnomwld();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testIsGreaterThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5pnomwld(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42241);
        __CLR4_4_1wguwgulgchos4o.R.inc(42242);assertEquals(true, Minutes.THREE.isGreaterThan(Minutes.TWO));
        __CLR4_4_1wguwgulgchos4o.R.inc(42243);assertEquals(false, Minutes.THREE.isGreaterThan(Minutes.THREE));
        __CLR4_4_1wguwgulgchos4o.R.inc(42244);assertEquals(false, Minutes.TWO.isGreaterThan(Minutes.THREE));
        __CLR4_4_1wguwgulgchos4o.R.inc(42245);assertEquals(true, Minutes.ONE.isGreaterThan(null));
        __CLR4_4_1wguwgulgchos4o.R.inc(42246);assertEquals(false, Minutes.minutes(-1).isGreaterThan(null));
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    @Test
    public void testIsLessThan() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmk0kdwlj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testIsLessThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmk0kdwlj(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42247);
        __CLR4_4_1wguwgulgchos4o.R.inc(42248);assertEquals(false, Minutes.THREE.isLessThan(Minutes.TWO));
        __CLR4_4_1wguwgulgchos4o.R.inc(42249);assertEquals(false, Minutes.THREE.isLessThan(Minutes.THREE));
        __CLR4_4_1wguwgulgchos4o.R.inc(42250);assertEquals(true, Minutes.TWO.isLessThan(Minutes.THREE));
        __CLR4_4_1wguwgulgchos4o.R.inc(42251);assertEquals(false, Minutes.ONE.isLessThan(null));
        __CLR4_4_1wguwgulgchos4o.R.inc(42252);assertEquals(true, Minutes.minutes(-1).isLessThan(null));
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidwlp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidwlp(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42253);
        __CLR4_4_1wguwgulgchos4o.R.inc(42254);Minutes test = Minutes.minutes(20);
        __CLR4_4_1wguwgulgchos4o.R.inc(42255);assertEquals("PT20M", test.toString());

        __CLR4_4_1wguwgulgchos4o.R.inc(42256);test = Minutes.minutes(-20);
        __CLR4_4_1wguwgulgchos4o.R.inc(42257);assertEquals("PT-20M", test.toString());
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9wlu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42258,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9wlu() throws Exception{try{__CLR4_4_1wguwgulgchos4o.R.inc(42258);
        __CLR4_4_1wguwgulgchos4o.R.inc(42259);Minutes test = Minutes.THREE;

        __CLR4_4_1wguwgulgchos4o.R.inc(42260);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1wguwgulgchos4o.R.inc(42261);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1wguwgulgchos4o.R.inc(42262);oos.writeObject(test);
        __CLR4_4_1wguwgulgchos4o.R.inc(42263);oos.close();
        __CLR4_4_1wguwgulgchos4o.R.inc(42264);byte[] bytes = baos.toByteArray();

        __CLR4_4_1wguwgulgchos4o.R.inc(42265);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1wguwgulgchos4o.R.inc(42266);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1wguwgulgchos4o.R.inc(42267);Minutes result = (Minutes) ois.readObject();
        __CLR4_4_1wguwgulgchos4o.R.inc(42268);ois.close();

        __CLR4_4_1wguwgulgchos4o.R.inc(42269);assertSame(test, result);
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToStandardWeeks() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pfkyx0wm6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42270,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pfkyx0wm6(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42270);
        __CLR4_4_1wguwgulgchos4o.R.inc(42271);Minutes test = Minutes.minutes(60 * 24 * 7 * 2);
        __CLR4_4_1wguwgulgchos4o.R.inc(42272);Weeks expected = Weeks.weeks(2);
        __CLR4_4_1wguwgulgchos4o.R.inc(42273);assertEquals(expected, test.toStandardWeeks());
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    @Test
    public void testToStandardDays() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eftdm0wma();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42274,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eftdm0wma(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42274);
        __CLR4_4_1wguwgulgchos4o.R.inc(42275);Minutes test = Minutes.minutes(60 * 24 * 2);
        __CLR4_4_1wguwgulgchos4o.R.inc(42276);Days expected = Days.days(2);
        __CLR4_4_1wguwgulgchos4o.R.inc(42277);assertEquals(expected, test.toStandardDays());
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    @Test
    public void testToStandardHours() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ikk7gwme();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ikk7gwme(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42278);
        __CLR4_4_1wguwgulgchos4o.R.inc(42279);Minutes test = Minutes.minutes(3 * 60);
        __CLR4_4_1wguwgulgchos4o.R.inc(42280);Hours expected = Hours.hours(3);
        __CLR4_4_1wguwgulgchos4o.R.inc(42281);assertEquals(expected, test.toStandardHours());
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    @Test
    public void testToStandardSeconds() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1emeoqswmi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1emeoqswmi(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42282);
        __CLR4_4_1wguwgulgchos4o.R.inc(42283);Minutes test = Minutes.minutes(3);
        __CLR4_4_1wguwgulgchos4o.R.inc(42284);Seconds expected = Seconds.seconds(3 * 60);
        __CLR4_4_1wguwgulgchos4o.R.inc(42285);assertEquals(expected, test.toStandardSeconds());

        __CLR4_4_1wguwgulgchos4o.R.inc(42286);try {
            __CLR4_4_1wguwgulgchos4o.R.inc(42287);Minutes.MAX_VALUE.toStandardSeconds();
            __CLR4_4_1wguwgulgchos4o.R.inc(42288);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    @Test
    public void testToStandardDuration() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izmvnpwmp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42289,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izmvnpwmp(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42289);
        __CLR4_4_1wguwgulgchos4o.R.inc(42290);Minutes test = Minutes.minutes(20);
        __CLR4_4_1wguwgulgchos4o.R.inc(42291);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_MINUTE);
        __CLR4_4_1wguwgulgchos4o.R.inc(42292);assertEquals(expected, test.toStandardDuration());

        __CLR4_4_1wguwgulgchos4o.R.inc(42293);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_MINUTE);
        __CLR4_4_1wguwgulgchos4o.R.inc(42294);assertEquals(expected, Minutes.MAX_VALUE.toStandardDuration());
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPlus_int() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1scc4ebwmv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testPlus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42295,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1scc4ebwmv(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42295);
        __CLR4_4_1wguwgulgchos4o.R.inc(42296);Minutes test2 = Minutes.minutes(2);
        __CLR4_4_1wguwgulgchos4o.R.inc(42297);Minutes result = test2.plus(3);
        __CLR4_4_1wguwgulgchos4o.R.inc(42298);assertEquals(2, test2.getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42299);assertEquals(5, result.getMinutes());

        __CLR4_4_1wguwgulgchos4o.R.inc(42300);assertEquals(1, Minutes.ONE.plus(0).getMinutes());

        __CLR4_4_1wguwgulgchos4o.R.inc(42301);try {
            __CLR4_4_1wguwgulgchos4o.R.inc(42302);Minutes.MAX_VALUE.plus(1);
            __CLR4_4_1wguwgulgchos4o.R.inc(42303);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    @Test
    public void testPlus_Minutes() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12jc7zhwn4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testPlus_Minutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42304,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12jc7zhwn4(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42304);
        __CLR4_4_1wguwgulgchos4o.R.inc(42305);Minutes test2 = Minutes.minutes(2);
        __CLR4_4_1wguwgulgchos4o.R.inc(42306);Minutes test3 = Minutes.minutes(3);
        __CLR4_4_1wguwgulgchos4o.R.inc(42307);Minutes result = test2.plus(test3);
        __CLR4_4_1wguwgulgchos4o.R.inc(42308);assertEquals(2, test2.getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42309);assertEquals(3, test3.getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42310);assertEquals(5, result.getMinutes());

        __CLR4_4_1wguwgulgchos4o.R.inc(42311);assertEquals(1, Minutes.ONE.plus(Minutes.ZERO).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42312);assertEquals(1, Minutes.ONE.plus((Minutes) null).getMinutes());

        __CLR4_4_1wguwgulgchos4o.R.inc(42313);try {
            __CLR4_4_1wguwgulgchos4o.R.inc(42314);Minutes.MAX_VALUE.plus(Minutes.ONE);
            __CLR4_4_1wguwgulgchos4o.R.inc(42315);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    @Test
    public void testMinus_int() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118wkvpwng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testMinus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42316,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118wkvpwng(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42316);
        __CLR4_4_1wguwgulgchos4o.R.inc(42317);Minutes test2 = Minutes.minutes(2);
        __CLR4_4_1wguwgulgchos4o.R.inc(42318);Minutes result = test2.minus(3);
        __CLR4_4_1wguwgulgchos4o.R.inc(42319);assertEquals(2, test2.getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42320);assertEquals(-1, result.getMinutes());

        __CLR4_4_1wguwgulgchos4o.R.inc(42321);assertEquals(1, Minutes.ONE.minus(0).getMinutes());

        __CLR4_4_1wguwgulgchos4o.R.inc(42322);try {
            __CLR4_4_1wguwgulgchos4o.R.inc(42323);Minutes.MIN_VALUE.minus(1);
            __CLR4_4_1wguwgulgchos4o.R.inc(42324);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    @Test
    public void testMinus_Minutes() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i2aj2dwnp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testMinus_Minutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i2aj2dwnp(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42325);
        __CLR4_4_1wguwgulgchos4o.R.inc(42326);Minutes test2 = Minutes.minutes(2);
        __CLR4_4_1wguwgulgchos4o.R.inc(42327);Minutes test3 = Minutes.minutes(3);
        __CLR4_4_1wguwgulgchos4o.R.inc(42328);Minutes result = test2.minus(test3);
        __CLR4_4_1wguwgulgchos4o.R.inc(42329);assertEquals(2, test2.getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42330);assertEquals(3, test3.getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42331);assertEquals(-1, result.getMinutes());

        __CLR4_4_1wguwgulgchos4o.R.inc(42332);assertEquals(1, Minutes.ONE.minus(Minutes.ZERO).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42333);assertEquals(1, Minutes.ONE.minus((Minutes) null).getMinutes());

        __CLR4_4_1wguwgulgchos4o.R.inc(42334);try {
            __CLR4_4_1wguwgulgchos4o.R.inc(42335);Minutes.MIN_VALUE.minus(Minutes.ONE);
            __CLR4_4_1wguwgulgchos4o.R.inc(42336);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    @Test
    public void testMultipliedBy_int() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1szpsdpwo1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testMultipliedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42337,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1szpsdpwo1(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42337);
        __CLR4_4_1wguwgulgchos4o.R.inc(42338);Minutes test = Minutes.minutes(2);
        __CLR4_4_1wguwgulgchos4o.R.inc(42339);assertEquals(6, test.multipliedBy(3).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42340);assertEquals(2, test.getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42341);assertEquals(-6, test.multipliedBy(-3).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42342);assertSame(test, test.multipliedBy(1));

        __CLR4_4_1wguwgulgchos4o.R.inc(42343);Minutes halfMax = Minutes.minutes(Integer.MAX_VALUE / 2 + 1);
        __CLR4_4_1wguwgulgchos4o.R.inc(42344);try {
            __CLR4_4_1wguwgulgchos4o.R.inc(42345);halfMax.multipliedBy(2);
            __CLR4_4_1wguwgulgchos4o.R.inc(42346);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    @Test
    public void testDividedBy_int() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9i8qvwob();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testDividedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9i8qvwob(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42347);
        __CLR4_4_1wguwgulgchos4o.R.inc(42348);Minutes test = Minutes.minutes(12);
        __CLR4_4_1wguwgulgchos4o.R.inc(42349);assertEquals(6, test.dividedBy(2).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42350);assertEquals(12, test.getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42351);assertEquals(4, test.dividedBy(3).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42352);assertEquals(3, test.dividedBy(4).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42353);assertEquals(2, test.dividedBy(5).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42354);assertEquals(2, test.dividedBy(6).getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42355);assertSame(test, test.dividedBy(1));

        __CLR4_4_1wguwgulgchos4o.R.inc(42356);try {
            __CLR4_4_1wguwgulgchos4o.R.inc(42357);Minutes.ONE.dividedBy(0);
            __CLR4_4_1wguwgulgchos4o.R.inc(42358);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    @Test
    public void testNegated() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av3307won();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testNegated",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av3307won(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42359);
        __CLR4_4_1wguwgulgchos4o.R.inc(42360);Minutes test = Minutes.minutes(12);
        __CLR4_4_1wguwgulgchos4o.R.inc(42361);assertEquals(-12, test.negated().getMinutes());
        __CLR4_4_1wguwgulgchos4o.R.inc(42362);assertEquals(12, test.getMinutes());

        __CLR4_4_1wguwgulgchos4o.R.inc(42363);try {
            __CLR4_4_1wguwgulgchos4o.R.inc(42364);Minutes.MIN_VALUE.negated();
            __CLR4_4_1wguwgulgchos4o.R.inc(42365);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddToLocalDate() {__CLR4_4_1wguwgulgchos4o.R.globalSliceStart(getClass().getName(),42366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thm5yuwou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wguwgulgchos4o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wguwgulgchos4o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testAddToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thm5yuwou(){try{__CLR4_4_1wguwgulgchos4o.R.inc(42366);
        __CLR4_4_1wguwgulgchos4o.R.inc(42367);Minutes test = Minutes.minutes(26);
        __CLR4_4_1wguwgulgchos4o.R.inc(42368);LocalDateTime date = new LocalDateTime(2006, 6, 1, 0, 0, 0, 0);
        __CLR4_4_1wguwgulgchos4o.R.inc(42369);LocalDateTime expected = new LocalDateTime(2006, 6, 1, 0, 26, 0, 0);
        __CLR4_4_1wguwgulgchos4o.R.inc(42370);assertEquals(expected, date.plus(test));
    }finally{__CLR4_4_1wguwgulgchos4o.R.flushNeeded();}}

}
