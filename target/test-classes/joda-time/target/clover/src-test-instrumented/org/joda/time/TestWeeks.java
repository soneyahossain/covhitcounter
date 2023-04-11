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
 * This class is a Junit unit test for Weeks.
 *
 * @author Stephen Colebourne
 */
public class TestWeeks {static class __CLR4_4_1183y183ylgchosik{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,57467,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) throws Exception {try{__CLR4_4_1183y183ylgchosik.R.inc(57166);
        __CLR4_4_1183y183ylgchosik.R.inc(57167);TestWeeks TB = new TestWeeks();
        __CLR4_4_1183y183ylgchosik.R.inc(57168);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57169);TB.testConstants();
        __CLR4_4_1183y183ylgchosik.R.inc(57170);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57171);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57172);TB.testFactory_weeks_int();
        __CLR4_4_1183y183ylgchosik.R.inc(57173);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57174);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57175);TB.testFactory_weeksBetween_RInstant();
        __CLR4_4_1183y183ylgchosik.R.inc(57176);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57177);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57178);TB.testFactory_weeksBetween_RPartial();
        __CLR4_4_1183y183ylgchosik.R.inc(57179);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57180);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57181);TB.testFactory_weeksIn_RInterval();
        __CLR4_4_1183y183ylgchosik.R.inc(57182);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57183);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57184);TB.testFactory_standardWeeksIn_RPeriod();
        __CLR4_4_1183y183ylgchosik.R.inc(57185);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57186);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57187);TB.testFactory_parseWeeks_String();
        __CLR4_4_1183y183ylgchosik.R.inc(57188);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57189);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57190);TB.testGetMethods();
        __CLR4_4_1183y183ylgchosik.R.inc(57191);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57192);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57193);TB.testGetFieldType();
        __CLR4_4_1183y183ylgchosik.R.inc(57194);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57195);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57196);TB.testGetPeriodType();
        __CLR4_4_1183y183ylgchosik.R.inc(57197);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57198);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57199);TB.testIsGreaterThan();
        __CLR4_4_1183y183ylgchosik.R.inc(57200);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57201);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57202);TB.testIsLessThan();
        __CLR4_4_1183y183ylgchosik.R.inc(57203);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57204);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57205);TB.testToString();
        __CLR4_4_1183y183ylgchosik.R.inc(57206);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57207);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57208);TB.testSerialization();
        __CLR4_4_1183y183ylgchosik.R.inc(57209);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57210);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57211);TB.testToStandardDays();
        __CLR4_4_1183y183ylgchosik.R.inc(57212);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57213);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57214);TB.testToStandardHours();
        __CLR4_4_1183y183ylgchosik.R.inc(57215);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57216);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57217);TB.testToStandardMinutes();
        __CLR4_4_1183y183ylgchosik.R.inc(57218);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57219);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57220);TB.testToStandardSeconds();
        __CLR4_4_1183y183ylgchosik.R.inc(57221);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57222);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57223);TB.testToStandardDuration();
        __CLR4_4_1183y183ylgchosik.R.inc(57224);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57225);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57226);TB.testPlus_int();
        __CLR4_4_1183y183ylgchosik.R.inc(57227);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57228);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57229);TB.testPlus_Weeks();
        __CLR4_4_1183y183ylgchosik.R.inc(57230);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57231);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57232);TB.testMinus_int();
        __CLR4_4_1183y183ylgchosik.R.inc(57233);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57234);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57235);TB.testMinus_Weeks();
        __CLR4_4_1183y183ylgchosik.R.inc(57236);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57237);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57238);TB.testMultipliedBy_int();
        __CLR4_4_1183y183ylgchosik.R.inc(57239);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57240);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57241);TB.testDividedBy_int();
        __CLR4_4_1183y183ylgchosik.R.inc(57242);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57243);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57244);TB.testNegated();
        __CLR4_4_1183y183ylgchosik.R.inc(57245);TB.tearDown();
        __CLR4_4_1183y183ylgchosik.R.inc(57246);TB.setUp();
        __CLR4_4_1183y183ylgchosik.R.inc(57247);TB.testAddToLocalDate();
        __CLR4_4_1183y183ylgchosik.R.inc(57248);TB.tearDown();

    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestWeeks.class);
    }

    public TestWeeks(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1183y183ylgchosik.R.inc(57249);
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1183y183ylgchosik.R.inc(57250);
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstants() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15epzlw186b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testConstants",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57251,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15epzlw186b(){try{__CLR4_4_1183y183ylgchosik.R.inc(57251);
        __CLR4_4_1183y183ylgchosik.R.inc(57252);assertEquals(0, Weeks.ZERO.getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57253);assertEquals(1, Weeks.ONE.getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57254);assertEquals(2, Weeks.TWO.getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57255);assertEquals(3, Weeks.THREE.getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57256);assertEquals(Integer.MAX_VALUE, Weeks.MAX_VALUE.getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57257);assertEquals(Integer.MIN_VALUE, Weeks.MIN_VALUE.getWeeks());
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_weeks_int() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xs32q7186i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeks_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57258,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xs32q7186i(){try{__CLR4_4_1183y183ylgchosik.R.inc(57258);
        __CLR4_4_1183y183ylgchosik.R.inc(57259);assertSame(Weeks.ZERO, Weeks.weeks(0));
        __CLR4_4_1183y183ylgchosik.R.inc(57260);assertSame(Weeks.ONE, Weeks.weeks(1));
        __CLR4_4_1183y183ylgchosik.R.inc(57261);assertSame(Weeks.TWO, Weeks.weeks(2));
        __CLR4_4_1183y183ylgchosik.R.inc(57262);assertSame(Weeks.THREE, Weeks.weeks(3));
        __CLR4_4_1183y183ylgchosik.R.inc(57263);assertSame(Weeks.MAX_VALUE, Weeks.weeks(Integer.MAX_VALUE));
        __CLR4_4_1183y183ylgchosik.R.inc(57264);assertSame(Weeks.MIN_VALUE, Weeks.weeks(Integer.MIN_VALUE));
        __CLR4_4_1183y183ylgchosik.R.inc(57265);assertEquals(-1, Weeks.weeks(-1).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57266);assertEquals(4, Weeks.weeks(4).getWeeks());
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_weeksBetween_RInstant() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fosy85186r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeksBetween_RInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fosy85186r(){try{__CLR4_4_1183y183ylgchosik.R.inc(57267);
        __CLR4_4_1183y183ylgchosik.R.inc(57268);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_1183y183ylgchosik.R.inc(57269);DateTime end1 = new DateTime(2006, 6, 30, 12, 0, 0, 0, PARIS);
        __CLR4_4_1183y183ylgchosik.R.inc(57270);DateTime end2 = new DateTime(2006, 7, 21, 12, 0, 0, 0, PARIS);

        __CLR4_4_1183y183ylgchosik.R.inc(57271);assertEquals(3, Weeks.weeksBetween(start, end1).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57272);assertEquals(0, Weeks.weeksBetween(start, start).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57273);assertEquals(0, Weeks.weeksBetween(end1, end1).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57274);assertEquals(-3, Weeks.weeksBetween(end1, start).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57275);assertEquals(6, Weeks.weeksBetween(start, end2).getWeeks());
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testFactory_weeksBetween_RPartial() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w5wmp11870();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeksBetween_RPartial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w5wmp11870(){try{__CLR4_4_1183y183ylgchosik.R.inc(57276);
        __CLR4_4_1183y183ylgchosik.R.inc(57277);LocalDate start = new LocalDate(2006, 6, 9);
        __CLR4_4_1183y183ylgchosik.R.inc(57278);LocalDate end1 = new LocalDate(2006, 6, 30);
        __CLR4_4_1183y183ylgchosik.R.inc(57279);YearMonthDay end2 = new YearMonthDay(2006, 7, 21);

        __CLR4_4_1183y183ylgchosik.R.inc(57280);assertEquals(3, Weeks.weeksBetween(start, end1).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57281);assertEquals(0, Weeks.weeksBetween(start, start).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57282);assertEquals(0, Weeks.weeksBetween(end1, end1).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57283);assertEquals(-3, Weeks.weeksBetween(end1, start).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57284);assertEquals(6, Weeks.weeksBetween(start, end2).getWeeks());
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    @Test
    public void testFactory_weeksIn_RInterval() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ldkzo1879();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeksIn_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57285,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ldkzo1879(){try{__CLR4_4_1183y183ylgchosik.R.inc(57285);
        __CLR4_4_1183y183ylgchosik.R.inc(57286);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_1183y183ylgchosik.R.inc(57287);DateTime end1 = new DateTime(2006, 6, 30, 12, 0, 0, 0, PARIS);
        __CLR4_4_1183y183ylgchosik.R.inc(57288);DateTime end2 = new DateTime(2006, 7, 21, 12, 0, 0, 0, PARIS);

        __CLR4_4_1183y183ylgchosik.R.inc(57289);assertEquals(0, Weeks.weeksIn((ReadableInterval) null).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57290);assertEquals(3, Weeks.weeksIn(new Interval(start, end1)).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57291);assertEquals(0, Weeks.weeksIn(new Interval(start, start)).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57292);assertEquals(0, Weeks.weeksIn(new Interval(end1, end1)).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57293);assertEquals(6, Weeks.weeksIn(new Interval(start, end2)).getWeeks());
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    @Test
    public void testFactory_standardWeeksIn_RPeriod() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1446xn187i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_standardWeeksIn_RPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57294,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1446xn187i(){try{__CLR4_4_1183y183ylgchosik.R.inc(57294);
        __CLR4_4_1183y183ylgchosik.R.inc(57295);assertEquals(0, Weeks.standardWeeksIn((ReadablePeriod) null).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57296);assertEquals(0, Weeks.standardWeeksIn(Period.ZERO).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57297);assertEquals(1, Weeks.standardWeeksIn(new Period(0, 0, 1, 0, 0, 0, 0, 0)).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57298);assertEquals(123, Weeks.standardWeeksIn(Period.weeks(123)).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57299);assertEquals(-987, Weeks.standardWeeksIn(Period.weeks(-987)).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57300);assertEquals(1, Weeks.standardWeeksIn(Period.days(13)).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57301);assertEquals(2, Weeks.standardWeeksIn(Period.days(14)).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57302);assertEquals(2, Weeks.standardWeeksIn(Period.days(15)).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57303);try {
            __CLR4_4_1183y183ylgchosik.R.inc(57304);Weeks.standardWeeksIn(Period.months(1));
            __CLR4_4_1183y183ylgchosik.R.inc(57305);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    @Test
    public void testFactory_parseWeeks_String() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oxubjw187u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_parseWeeks_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oxubjw187u(){try{__CLR4_4_1183y183ylgchosik.R.inc(57306);
        __CLR4_4_1183y183ylgchosik.R.inc(57307);assertEquals(0, Weeks.parseWeeks((String) null).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57308);assertEquals(0, Weeks.parseWeeks("P0W").getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57309);assertEquals(1, Weeks.parseWeeks("P1W").getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57310);assertEquals(-3, Weeks.parseWeeks("P-3W").getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57311);assertEquals(2, Weeks.parseWeeks("P0Y0M2W").getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57312);assertEquals(2, Weeks.parseWeeks("P2WT0H0M").getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57313);try {
            __CLR4_4_1183y183ylgchosik.R.inc(57314);Weeks.parseWeeks("P1Y1D");
            __CLR4_4_1183y183ylgchosik.R.inc(57315);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1183y183ylgchosik.R.inc(57316);try {
            __CLR4_4_1183y183ylgchosik.R.inc(57317);Weeks.parseWeeks("P1WT1H");
            __CLR4_4_1183y183ylgchosik.R.inc(57318);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetMethods() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sjdmz1887();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testGetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sjdmz1887(){try{__CLR4_4_1183y183ylgchosik.R.inc(57319);
        __CLR4_4_1183y183ylgchosik.R.inc(57320);Weeks test = Weeks.weeks(20);
        __CLR4_4_1183y183ylgchosik.R.inc(57321);assertEquals(20, test.getWeeks());
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    @Test
    public void testGetFieldType() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mv188a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mv188a(){try{__CLR4_4_1183y183ylgchosik.R.inc(57322);
        __CLR4_4_1183y183ylgchosik.R.inc(57323);Weeks test = Weeks.weeks(20);
        __CLR4_4_1183y183ylgchosik.R.inc(57324);assertEquals(DurationFieldType.weeks(), test.getFieldType());
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    @Test
    public void testGetPeriodType() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivat1i188d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testGetPeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivat1i188d(){try{__CLR4_4_1183y183ylgchosik.R.inc(57325);
        __CLR4_4_1183y183ylgchosik.R.inc(57326);Weeks test = Weeks.weeks(20);
        __CLR4_4_1183y183ylgchosik.R.inc(57327);assertEquals(PeriodType.weeks(), test.getPeriodType());
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsGreaterThan() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5pnom188g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testIsGreaterThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5pnom188g(){try{__CLR4_4_1183y183ylgchosik.R.inc(57328);
        __CLR4_4_1183y183ylgchosik.R.inc(57329);assertEquals(true, Weeks.THREE.isGreaterThan(Weeks.TWO));
        __CLR4_4_1183y183ylgchosik.R.inc(57330);assertEquals(false, Weeks.THREE.isGreaterThan(Weeks.THREE));
        __CLR4_4_1183y183ylgchosik.R.inc(57331);assertEquals(false, Weeks.TWO.isGreaterThan(Weeks.THREE));
        __CLR4_4_1183y183ylgchosik.R.inc(57332);assertEquals(true, Weeks.ONE.isGreaterThan(null));
        __CLR4_4_1183y183ylgchosik.R.inc(57333);assertEquals(false, Weeks.weeks(-1).isGreaterThan(null));
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    @Test
    public void testIsLessThan() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmk0kd188m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testIsLessThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57334,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmk0kd188m(){try{__CLR4_4_1183y183ylgchosik.R.inc(57334);
        __CLR4_4_1183y183ylgchosik.R.inc(57335);assertEquals(false, Weeks.THREE.isLessThan(Weeks.TWO));
        __CLR4_4_1183y183ylgchosik.R.inc(57336);assertEquals(false, Weeks.THREE.isLessThan(Weeks.THREE));
        __CLR4_4_1183y183ylgchosik.R.inc(57337);assertEquals(true, Weeks.TWO.isLessThan(Weeks.THREE));
        __CLR4_4_1183y183ylgchosik.R.inc(57338);assertEquals(false, Weeks.ONE.isLessThan(null));
        __CLR4_4_1183y183ylgchosik.R.inc(57339);assertEquals(true, Weeks.weeks(-1).isLessThan(null));
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid188s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid188s(){try{__CLR4_4_1183y183ylgchosik.R.inc(57340);
        __CLR4_4_1183y183ylgchosik.R.inc(57341);Weeks test = Weeks.weeks(20);
        __CLR4_4_1183y183ylgchosik.R.inc(57342);assertEquals("P20W", test.toString());

        __CLR4_4_1183y183ylgchosik.R.inc(57343);test = Weeks.weeks(-20);
        __CLR4_4_1183y183ylgchosik.R.inc(57344);assertEquals("P-20W", test.toString());
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9188x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9188x() throws Exception{try{__CLR4_4_1183y183ylgchosik.R.inc(57345);
        __CLR4_4_1183y183ylgchosik.R.inc(57346);Weeks test = Weeks.THREE;

        __CLR4_4_1183y183ylgchosik.R.inc(57347);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1183y183ylgchosik.R.inc(57348);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1183y183ylgchosik.R.inc(57349);oos.writeObject(test);
        __CLR4_4_1183y183ylgchosik.R.inc(57350);oos.close();
        __CLR4_4_1183y183ylgchosik.R.inc(57351);byte[] bytes = baos.toByteArray();

        __CLR4_4_1183y183ylgchosik.R.inc(57352);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1183y183ylgchosik.R.inc(57353);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1183y183ylgchosik.R.inc(57354);Weeks result = (Weeks) ois.readObject();
        __CLR4_4_1183y183ylgchosik.R.inc(57355);ois.close();

        __CLR4_4_1183y183ylgchosik.R.inc(57356);assertSame(test, result);
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToStandardDays() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eftdm01899();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eftdm01899(){try{__CLR4_4_1183y183ylgchosik.R.inc(57357);
        __CLR4_4_1183y183ylgchosik.R.inc(57358);Weeks test = Weeks.weeks(2);
        __CLR4_4_1183y183ylgchosik.R.inc(57359);Days expected = Days.days(14);
        __CLR4_4_1183y183ylgchosik.R.inc(57360);assertEquals(expected, test.toStandardDays());

        __CLR4_4_1183y183ylgchosik.R.inc(57361);try {
            __CLR4_4_1183y183ylgchosik.R.inc(57362);Weeks.MAX_VALUE.toStandardDays();
            __CLR4_4_1183y183ylgchosik.R.inc(57363);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    @Test
    public void testToStandardHours() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ikk7g189g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ikk7g189g(){try{__CLR4_4_1183y183ylgchosik.R.inc(57364);
        __CLR4_4_1183y183ylgchosik.R.inc(57365);Weeks test = Weeks.weeks(2);
        __CLR4_4_1183y183ylgchosik.R.inc(57366);Hours expected = Hours.hours(2 * 7 * 24);
        __CLR4_4_1183y183ylgchosik.R.inc(57367);assertEquals(expected, test.toStandardHours());

        __CLR4_4_1183y183ylgchosik.R.inc(57368);try {
            __CLR4_4_1183y183ylgchosik.R.inc(57369);Weeks.MAX_VALUE.toStandardHours();
            __CLR4_4_1183y183ylgchosik.R.inc(57370);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    @Test
    public void testToStandardMinutes() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0kt44189n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0kt44189n(){try{__CLR4_4_1183y183ylgchosik.R.inc(57371);
        __CLR4_4_1183y183ylgchosik.R.inc(57372);Weeks test = Weeks.weeks(2);
        __CLR4_4_1183y183ylgchosik.R.inc(57373);Minutes expected = Minutes.minutes(2 * 7 * 24 * 60);
        __CLR4_4_1183y183ylgchosik.R.inc(57374);assertEquals(expected, test.toStandardMinutes());

        __CLR4_4_1183y183ylgchosik.R.inc(57375);try {
            __CLR4_4_1183y183ylgchosik.R.inc(57376);Weeks.MAX_VALUE.toStandardMinutes();
            __CLR4_4_1183y183ylgchosik.R.inc(57377);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    @Test
    public void testToStandardSeconds() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1emeoqs189u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1emeoqs189u(){try{__CLR4_4_1183y183ylgchosik.R.inc(57378);
        __CLR4_4_1183y183ylgchosik.R.inc(57379);Weeks test = Weeks.weeks(2);
        __CLR4_4_1183y183ylgchosik.R.inc(57380);Seconds expected = Seconds.seconds(2 * 7 * 24 * 60 * 60);
        __CLR4_4_1183y183ylgchosik.R.inc(57381);assertEquals(expected, test.toStandardSeconds());

        __CLR4_4_1183y183ylgchosik.R.inc(57382);try {
            __CLR4_4_1183y183ylgchosik.R.inc(57383);Weeks.MAX_VALUE.toStandardSeconds();
            __CLR4_4_1183y183ylgchosik.R.inc(57384);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    @Test
    public void testToStandardDuration() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izmvnp18a1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izmvnp18a1(){try{__CLR4_4_1183y183ylgchosik.R.inc(57385);
        __CLR4_4_1183y183ylgchosik.R.inc(57386);Weeks test = Weeks.weeks(20);
        __CLR4_4_1183y183ylgchosik.R.inc(57387);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_WEEK);
        __CLR4_4_1183y183ylgchosik.R.inc(57388);assertEquals(expected, test.toStandardDuration());

        __CLR4_4_1183y183ylgchosik.R.inc(57389);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_WEEK);
        __CLR4_4_1183y183ylgchosik.R.inc(57390);assertEquals(expected, Weeks.MAX_VALUE.toStandardDuration());
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPlus_int() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1scc4eb18a7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testPlus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1scc4eb18a7(){try{__CLR4_4_1183y183ylgchosik.R.inc(57391);
        __CLR4_4_1183y183ylgchosik.R.inc(57392);Weeks test2 = Weeks.weeks(2);
        __CLR4_4_1183y183ylgchosik.R.inc(57393);Weeks result = test2.plus(3);
        __CLR4_4_1183y183ylgchosik.R.inc(57394);assertEquals(2, test2.getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57395);assertEquals(5, result.getWeeks());

        __CLR4_4_1183y183ylgchosik.R.inc(57396);assertEquals(1, Weeks.ONE.plus(0).getWeeks());

        __CLR4_4_1183y183ylgchosik.R.inc(57397);try {
            __CLR4_4_1183y183ylgchosik.R.inc(57398);Weeks.MAX_VALUE.plus(1);
            __CLR4_4_1183y183ylgchosik.R.inc(57399);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    @Test
    public void testPlus_Weeks() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jghr0318ag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testPlus_Weeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57400,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jghr0318ag(){try{__CLR4_4_1183y183ylgchosik.R.inc(57400);
        __CLR4_4_1183y183ylgchosik.R.inc(57401);Weeks test2 = Weeks.weeks(2);
        __CLR4_4_1183y183ylgchosik.R.inc(57402);Weeks test3 = Weeks.weeks(3);
        __CLR4_4_1183y183ylgchosik.R.inc(57403);Weeks result = test2.plus(test3);
        __CLR4_4_1183y183ylgchosik.R.inc(57404);assertEquals(2, test2.getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57405);assertEquals(3, test3.getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57406);assertEquals(5, result.getWeeks());

        __CLR4_4_1183y183ylgchosik.R.inc(57407);assertEquals(1, Weeks.ONE.plus(Weeks.ZERO).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57408);assertEquals(1, Weeks.ONE.plus((Weeks) null).getWeeks());

        __CLR4_4_1183y183ylgchosik.R.inc(57409);try {
            __CLR4_4_1183y183ylgchosik.R.inc(57410);Weeks.MAX_VALUE.plus(Weeks.ONE);
            __CLR4_4_1183y183ylgchosik.R.inc(57411);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    @Test
    public void testMinus_int() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118wkvp18as();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testMinus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57412,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118wkvp18as(){try{__CLR4_4_1183y183ylgchosik.R.inc(57412);
        __CLR4_4_1183y183ylgchosik.R.inc(57413);Weeks test2 = Weeks.weeks(2);
        __CLR4_4_1183y183ylgchosik.R.inc(57414);Weeks result = test2.minus(3);
        __CLR4_4_1183y183ylgchosik.R.inc(57415);assertEquals(2, test2.getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57416);assertEquals(-1, result.getWeeks());

        __CLR4_4_1183y183ylgchosik.R.inc(57417);assertEquals(1, Weeks.ONE.minus(0).getWeeks());

        __CLR4_4_1183y183ylgchosik.R.inc(57418);try {
            __CLR4_4_1183y183ylgchosik.R.inc(57419);Weeks.MIN_VALUE.minus(1);
            __CLR4_4_1183y183ylgchosik.R.inc(57420);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    @Test
    public void testMinus_Weeks() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lu65uj18b1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testMinus_Weeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lu65uj18b1(){try{__CLR4_4_1183y183ylgchosik.R.inc(57421);
        __CLR4_4_1183y183ylgchosik.R.inc(57422);Weeks test2 = Weeks.weeks(2);
        __CLR4_4_1183y183ylgchosik.R.inc(57423);Weeks test3 = Weeks.weeks(3);
        __CLR4_4_1183y183ylgchosik.R.inc(57424);Weeks result = test2.minus(test3);
        __CLR4_4_1183y183ylgchosik.R.inc(57425);assertEquals(2, test2.getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57426);assertEquals(3, test3.getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57427);assertEquals(-1, result.getWeeks());

        __CLR4_4_1183y183ylgchosik.R.inc(57428);assertEquals(1, Weeks.ONE.minus(Weeks.ZERO).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57429);assertEquals(1, Weeks.ONE.minus((Weeks) null).getWeeks());

        __CLR4_4_1183y183ylgchosik.R.inc(57430);try {
            __CLR4_4_1183y183ylgchosik.R.inc(57431);Weeks.MIN_VALUE.minus(Weeks.ONE);
            __CLR4_4_1183y183ylgchosik.R.inc(57432);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    @Test
    public void testMultipliedBy_int() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1szpsdp18bd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testMultipliedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1szpsdp18bd(){try{__CLR4_4_1183y183ylgchosik.R.inc(57433);
        __CLR4_4_1183y183ylgchosik.R.inc(57434);Weeks test = Weeks.weeks(2);
        __CLR4_4_1183y183ylgchosik.R.inc(57435);assertEquals(6, test.multipliedBy(3).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57436);assertEquals(2, test.getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57437);assertEquals(-6, test.multipliedBy(-3).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57438);assertSame(test, test.multipliedBy(1));

        __CLR4_4_1183y183ylgchosik.R.inc(57439);Weeks halfMax = Weeks.weeks(Integer.MAX_VALUE / 2 + 1);
        __CLR4_4_1183y183ylgchosik.R.inc(57440);try {
            __CLR4_4_1183y183ylgchosik.R.inc(57441);halfMax.multipliedBy(2);
            __CLR4_4_1183y183ylgchosik.R.inc(57442);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    @Test
    public void testDividedBy_int() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9i8qv18bn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testDividedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57443,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9i8qv18bn(){try{__CLR4_4_1183y183ylgchosik.R.inc(57443);
        __CLR4_4_1183y183ylgchosik.R.inc(57444);Weeks test = Weeks.weeks(12);
        __CLR4_4_1183y183ylgchosik.R.inc(57445);assertEquals(6, test.dividedBy(2).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57446);assertEquals(12, test.getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57447);assertEquals(4, test.dividedBy(3).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57448);assertEquals(3, test.dividedBy(4).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57449);assertEquals(2, test.dividedBy(5).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57450);assertEquals(2, test.dividedBy(6).getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57451);assertSame(test, test.dividedBy(1));

        __CLR4_4_1183y183ylgchosik.R.inc(57452);try {
            __CLR4_4_1183y183ylgchosik.R.inc(57453);Weeks.ONE.dividedBy(0);
            __CLR4_4_1183y183ylgchosik.R.inc(57454);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    @Test
    public void testNegated() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av330718bz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testNegated",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av330718bz(){try{__CLR4_4_1183y183ylgchosik.R.inc(57455);
        __CLR4_4_1183y183ylgchosik.R.inc(57456);Weeks test = Weeks.weeks(12);
        __CLR4_4_1183y183ylgchosik.R.inc(57457);assertEquals(-12, test.negated().getWeeks());
        __CLR4_4_1183y183ylgchosik.R.inc(57458);assertEquals(12, test.getWeeks());

        __CLR4_4_1183y183ylgchosik.R.inc(57459);try {
            __CLR4_4_1183y183ylgchosik.R.inc(57460);Weeks.MIN_VALUE.negated();
            __CLR4_4_1183y183ylgchosik.R.inc(57461);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddToLocalDate() {__CLR4_4_1183y183ylgchosik.R.globalSliceStart(getClass().getName(),57462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thm5yu18c6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1183y183ylgchosik.R.rethrow($CLV_t2$);}finally{__CLR4_4_1183y183ylgchosik.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testAddToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57462,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thm5yu18c6(){try{__CLR4_4_1183y183ylgchosik.R.inc(57462);
        __CLR4_4_1183y183ylgchosik.R.inc(57463);Weeks test = Weeks.weeks(3);
        __CLR4_4_1183y183ylgchosik.R.inc(57464);LocalDate date = new LocalDate(2006, 6, 1);
        __CLR4_4_1183y183ylgchosik.R.inc(57465);LocalDate expected = new LocalDate(2006, 6, 22);
        __CLR4_4_1183y183ylgchosik.R.inc(57466);assertEquals(expected, date.plus(test));
    }finally{__CLR4_4_1183y183ylgchosik.R.flushNeeded();}}

}
