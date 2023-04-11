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
 * This class is a Junit unit test for Days.
 *
 * @author Stephen Colebourne
 */
public class TestDays {static class __CLR4_4_1nymnymlgchors1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,31389,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) throws Exception {try{__CLR4_4_1nymnymlgchors1.R.inc(31054);
        __CLR4_4_1nymnymlgchors1.R.inc(31055);TestDays TB = new TestDays();
        __CLR4_4_1nymnymlgchors1.R.inc(31056);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31057);TB.testConstants();
        __CLR4_4_1nymnymlgchors1.R.inc(31058);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31059);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31060);TB.testFactory_days_int();
        __CLR4_4_1nymnymlgchors1.R.inc(31061);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31062);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31063);TB.testFactory_daysBetween_RInstant();
        __CLR4_4_1nymnymlgchors1.R.inc(31064);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31065);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31066);TB.testFactory_daysBetween_RPartial_LocalDate();
        __CLR4_4_1nymnymlgchors1.R.inc(31067);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31068);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31069);TB.testFactory_daysBetween_RPartial_YearMonth();
        __CLR4_4_1nymnymlgchors1.R.inc(31070);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31071);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31072);TB.testFactory_daysBetween_RPartial_MonthDay();
        __CLR4_4_1nymnymlgchors1.R.inc(31073);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31074);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31075);TB.testFactory_daysIn_RInterval();
        __CLR4_4_1nymnymlgchors1.R.inc(31076);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31077);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31078);TB.testFactory_standardDaysIn_RPeriod();
        __CLR4_4_1nymnymlgchors1.R.inc(31079);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31080);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31081);TB.testFactory_parseDays_String();
        __CLR4_4_1nymnymlgchors1.R.inc(31082);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31083);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31084);TB.testGetMethods();
        __CLR4_4_1nymnymlgchors1.R.inc(31085);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31086);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31087);TB.testGetFieldType();
        __CLR4_4_1nymnymlgchors1.R.inc(31088);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31089);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31090);TB.testGetPeriodType();
        __CLR4_4_1nymnymlgchors1.R.inc(31091);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31092);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31093);TB.testIsGreaterThan();
        __CLR4_4_1nymnymlgchors1.R.inc(31094);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31095);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31096);TB.testIsLessThan();
        __CLR4_4_1nymnymlgchors1.R.inc(31097);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31098);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31099);TB.testToString();
        __CLR4_4_1nymnymlgchors1.R.inc(31100);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31101);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31102);TB.testSerialization();
        __CLR4_4_1nymnymlgchors1.R.inc(31103);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31104);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31105);TB.testToStandardWeeks();
        __CLR4_4_1nymnymlgchors1.R.inc(31106);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31107);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31108);TB.testToStandardHours();
        __CLR4_4_1nymnymlgchors1.R.inc(31109);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31110);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31111);TB.testToStandardMinutes();
        __CLR4_4_1nymnymlgchors1.R.inc(31112);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31113);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31114);TB.testToStandardSeconds();
        __CLR4_4_1nymnymlgchors1.R.inc(31115);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31116);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31117);TB.testToStandardDuration();
        __CLR4_4_1nymnymlgchors1.R.inc(31118);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31119);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31120);TB.testPlus_int();
        __CLR4_4_1nymnymlgchors1.R.inc(31121);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31122);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31123);TB.testPlus_Days();
        __CLR4_4_1nymnymlgchors1.R.inc(31124);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31125);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31126);TB.testMinus_int();
        __CLR4_4_1nymnymlgchors1.R.inc(31127);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31128);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31129);TB.testMinus_Days();
        __CLR4_4_1nymnymlgchors1.R.inc(31130);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31131);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31132);TB.testMultipliedBy_int();
        __CLR4_4_1nymnymlgchors1.R.inc(31133);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31134);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31135);TB.testDividedBy_int();
        __CLR4_4_1nymnymlgchors1.R.inc(31136);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31137);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31138);TB.testNegated();
        __CLR4_4_1nymnymlgchors1.R.inc(31139);TB.tearDown();
        __CLR4_4_1nymnymlgchors1.R.inc(31140);TB.setUp();
        __CLR4_4_1nymnymlgchors1.R.inc(31141);TB.testAddToLocalDate();
        __CLR4_4_1nymnymlgchors1.R.inc(31142);TB.tearDown();

    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

/*
    public static TestSuite suite() {
        return new TestSuite(TestDays.class);
    }

    public TestDays(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1nymnymlgchors1.R.inc(31143);
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1nymnymlgchors1.R.inc(31144);
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstants() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15epzlwo15();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testConstants",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31145,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15epzlwo15(){try{__CLR4_4_1nymnymlgchors1.R.inc(31145);
        __CLR4_4_1nymnymlgchors1.R.inc(31146);assertEquals(0, Days.ZERO.getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31147);assertEquals(1, Days.ONE.getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31148);assertEquals(2, Days.TWO.getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31149);assertEquals(3, Days.THREE.getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31150);assertEquals(4, Days.FOUR.getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31151);assertEquals(5, Days.FIVE.getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31152);assertEquals(6, Days.SIX.getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31153);assertEquals(7, Days.SEVEN.getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31154);assertEquals(Integer.MAX_VALUE, Days.MAX_VALUE.getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31155);assertEquals(Integer.MIN_VALUE, Days.MIN_VALUE.getDays());
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_days_int() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tvjcizo1g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_days_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31156,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tvjcizo1g(){try{__CLR4_4_1nymnymlgchors1.R.inc(31156);
        __CLR4_4_1nymnymlgchors1.R.inc(31157);assertSame(Days.ZERO, Days.days(0));
        __CLR4_4_1nymnymlgchors1.R.inc(31158);assertSame(Days.ONE, Days.days(1));
        __CLR4_4_1nymnymlgchors1.R.inc(31159);assertSame(Days.TWO, Days.days(2));
        __CLR4_4_1nymnymlgchors1.R.inc(31160);assertSame(Days.THREE, Days.days(3));
        __CLR4_4_1nymnymlgchors1.R.inc(31161);assertSame(Days.FOUR, Days.days(4));
        __CLR4_4_1nymnymlgchors1.R.inc(31162);assertSame(Days.FIVE, Days.days(5));
        __CLR4_4_1nymnymlgchors1.R.inc(31163);assertSame(Days.SIX, Days.days(6));
        __CLR4_4_1nymnymlgchors1.R.inc(31164);assertSame(Days.SEVEN, Days.days(7));
        __CLR4_4_1nymnymlgchors1.R.inc(31165);assertSame(Days.MAX_VALUE, Days.days(Integer.MAX_VALUE));
        __CLR4_4_1nymnymlgchors1.R.inc(31166);assertSame(Days.MIN_VALUE, Days.days(Integer.MIN_VALUE));
        __CLR4_4_1nymnymlgchors1.R.inc(31167);assertEquals(-1, Days.days(-1).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31168);assertEquals(8, Days.days(8).getDays());
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_daysBetween_RInstant() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14clw8lo1t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysBetween_RInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14clw8lo1t(){try{__CLR4_4_1nymnymlgchors1.R.inc(31169);
        __CLR4_4_1nymnymlgchors1.R.inc(31170);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_1nymnymlgchors1.R.inc(31171);DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, 0, PARIS);
        __CLR4_4_1nymnymlgchors1.R.inc(31172);DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, 0, PARIS);

        __CLR4_4_1nymnymlgchors1.R.inc(31173);assertEquals(3, Days.daysBetween(start, end1).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31174);assertEquals(0, Days.daysBetween(start, start).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31175);assertEquals(0, Days.daysBetween(end1, end1).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31176);assertEquals(-3, Days.daysBetween(end1, start).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31177);assertEquals(6, Days.daysBetween(start, end2).getDays());
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testFactory_daysBetween_RPartial_LocalDate() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1885qezo22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysBetween_RPartial_LocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1885qezo22(){try{__CLR4_4_1nymnymlgchors1.R.inc(31178);
        __CLR4_4_1nymnymlgchors1.R.inc(31179);LocalDate start = new LocalDate(2006, 6, 9);
        __CLR4_4_1nymnymlgchors1.R.inc(31180);LocalDate end1 = new LocalDate(2006, 6, 12);
        __CLR4_4_1nymnymlgchors1.R.inc(31181);YearMonthDay end2 = new YearMonthDay(2006, 6, 15);

        __CLR4_4_1nymnymlgchors1.R.inc(31182);assertEquals(3, Days.daysBetween(start, end1).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31183);assertEquals(0, Days.daysBetween(start, start).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31184);assertEquals(0, Days.daysBetween(end1, end1).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31185);assertEquals(-3, Days.daysBetween(end1, start).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31186);assertEquals(6, Days.daysBetween(start, end2).getDays());
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    @Test
    public void testFactory_daysBetween_RPartial_YearMonth() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18airhto2b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysBetween_RPartial_YearMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18airhto2b(){try{__CLR4_4_1nymnymlgchors1.R.inc(31187);
        __CLR4_4_1nymnymlgchors1.R.inc(31188);YearMonth start1 = new YearMonth(2011, 1);
        __CLR4_4_1nymnymlgchors1.R.inc(31189);YearMonth start2 = new YearMonth(2012, 1);
        __CLR4_4_1nymnymlgchors1.R.inc(31190);YearMonth end1 = new YearMonth(2011, 3);
        __CLR4_4_1nymnymlgchors1.R.inc(31191);YearMonth end2 = new YearMonth(2012, 3);

        __CLR4_4_1nymnymlgchors1.R.inc(31192);assertEquals(59, Days.daysBetween(start1, end1).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31193);assertEquals(60, Days.daysBetween(start2, end2).getDays());

        __CLR4_4_1nymnymlgchors1.R.inc(31194);assertEquals(-59, Days.daysBetween(end1, start1).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31195);assertEquals(-60, Days.daysBetween(end2, start2).getDays());
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    @Test
    public void testFactory_daysBetween_RPartial_MonthDay() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_185nlz6o2k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysBetween_RPartial_MonthDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_185nlz6o2k(){try{__CLR4_4_1nymnymlgchors1.R.inc(31196);
        __CLR4_4_1nymnymlgchors1.R.inc(31197);MonthDay start1 = new MonthDay(2, 1);
        __CLR4_4_1nymnymlgchors1.R.inc(31198);MonthDay start2 = new MonthDay(2, 28);
        __CLR4_4_1nymnymlgchors1.R.inc(31199);MonthDay end1 = new MonthDay(2, 28);
        __CLR4_4_1nymnymlgchors1.R.inc(31200);MonthDay end2 = new MonthDay(2, 29);

        __CLR4_4_1nymnymlgchors1.R.inc(31201);assertEquals(27, Days.daysBetween(start1, end1).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31202);assertEquals(28, Days.daysBetween(start1, end2).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31203);assertEquals(0, Days.daysBetween(start2, end1).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31204);assertEquals(1, Days.daysBetween(start2, end2).getDays());

        __CLR4_4_1nymnymlgchors1.R.inc(31205);assertEquals(-27, Days.daysBetween(end1, start1).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31206);assertEquals(-28, Days.daysBetween(end2, start1).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31207);assertEquals(0, Days.daysBetween(end1, start2).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31208);assertEquals(-1, Days.daysBetween(end2, start2).getDays());
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_daysIn_RInterval() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ccy282o2x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysIn_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31209,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ccy282o2x(){try{__CLR4_4_1nymnymlgchors1.R.inc(31209);
        __CLR4_4_1nymnymlgchors1.R.inc(31210);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_1nymnymlgchors1.R.inc(31211);DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, 0, PARIS);
        __CLR4_4_1nymnymlgchors1.R.inc(31212);DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, 0, PARIS);

        __CLR4_4_1nymnymlgchors1.R.inc(31213);assertEquals(0, Days.daysIn((ReadableInterval) null).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31214);assertEquals(3, Days.daysIn(new Interval(start, end1)).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31215);assertEquals(0, Days.daysIn(new Interval(start, start)).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31216);assertEquals(0, Days.daysIn(new Interval(end1, end1)).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31217);assertEquals(6, Days.daysIn(new Interval(start, end2)).getDays());
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_standardDaysIn_RPeriod() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13el4cbo36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_standardDaysIn_RPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13el4cbo36(){try{__CLR4_4_1nymnymlgchors1.R.inc(31218);
        __CLR4_4_1nymnymlgchors1.R.inc(31219);assertEquals(0, Days.standardDaysIn((ReadablePeriod) null).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31220);assertEquals(0, Days.standardDaysIn(Period.ZERO).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31221);assertEquals(1, Days.standardDaysIn(new Period(0, 0, 0, 1, 0, 0, 0, 0)).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31222);assertEquals(123, Days.standardDaysIn(Period.days(123)).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31223);assertEquals(-987, Days.standardDaysIn(Period.days(-987)).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31224);assertEquals(1, Days.standardDaysIn(Period.hours(47)).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31225);assertEquals(2, Days.standardDaysIn(Period.hours(48)).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31226);assertEquals(2, Days.standardDaysIn(Period.hours(49)).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31227);assertEquals(14, Days.standardDaysIn(Period.weeks(2)).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31228);try {
            __CLR4_4_1nymnymlgchors1.R.inc(31229);Days.standardDaysIn(Period.months(1));
            __CLR4_4_1nymnymlgchors1.R.inc(31230);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    @Test
    public void testFactory_parseDays_String() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r32aco3j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_parseDays_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r32aco3j(){try{__CLR4_4_1nymnymlgchors1.R.inc(31231);
        __CLR4_4_1nymnymlgchors1.R.inc(31232);assertEquals(0, Days.parseDays((String) null).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31233);assertEquals(0, Days.parseDays("P0D").getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31234);assertEquals(1, Days.parseDays("P1D").getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31235);assertEquals(-3, Days.parseDays("P-3D").getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31236);assertEquals(2, Days.parseDays("P0Y0M2D").getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31237);assertEquals(2, Days.parseDays("P2DT0H0M").getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31238);try {
            __CLR4_4_1nymnymlgchors1.R.inc(31239);Days.parseDays("P1Y1D");
            __CLR4_4_1nymnymlgchors1.R.inc(31240);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1nymnymlgchors1.R.inc(31241);try {
            __CLR4_4_1nymnymlgchors1.R.inc(31242);Days.parseDays("P1DT1H");
            __CLR4_4_1nymnymlgchors1.R.inc(31243);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetMethods() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sjdmzo3w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testGetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31244,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sjdmzo3w(){try{__CLR4_4_1nymnymlgchors1.R.inc(31244);
        __CLR4_4_1nymnymlgchors1.R.inc(31245);Days test = Days.days(20);
        __CLR4_4_1nymnymlgchors1.R.inc(31246);assertEquals(20, test.getDays());
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    @Test
    public void testGetFieldType() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mvo3z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mvo3z(){try{__CLR4_4_1nymnymlgchors1.R.inc(31247);
        __CLR4_4_1nymnymlgchors1.R.inc(31248);Days test = Days.days(20);
        __CLR4_4_1nymnymlgchors1.R.inc(31249);assertEquals(DurationFieldType.days(), test.getFieldType());
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    @Test
    public void testGetPeriodType() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivat1io42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testGetPeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31250,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivat1io42(){try{__CLR4_4_1nymnymlgchors1.R.inc(31250);
        __CLR4_4_1nymnymlgchors1.R.inc(31251);Days test = Days.days(20);
        __CLR4_4_1nymnymlgchors1.R.inc(31252);assertEquals(PeriodType.days(), test.getPeriodType());
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsGreaterThan() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5pnomo45();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testIsGreaterThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5pnomo45(){try{__CLR4_4_1nymnymlgchors1.R.inc(31253);
        __CLR4_4_1nymnymlgchors1.R.inc(31254);assertEquals(true, Days.THREE.isGreaterThan(Days.TWO));
        __CLR4_4_1nymnymlgchors1.R.inc(31255);assertEquals(false, Days.THREE.isGreaterThan(Days.THREE));
        __CLR4_4_1nymnymlgchors1.R.inc(31256);assertEquals(false, Days.TWO.isGreaterThan(Days.THREE));
        __CLR4_4_1nymnymlgchors1.R.inc(31257);assertEquals(true, Days.ONE.isGreaterThan(null));
        __CLR4_4_1nymnymlgchors1.R.inc(31258);assertEquals(false, Days.days(-1).isGreaterThan(null));
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    @Test
    public void testIsLessThan() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmk0kdo4b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testIsLessThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31259,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmk0kdo4b(){try{__CLR4_4_1nymnymlgchors1.R.inc(31259);
        __CLR4_4_1nymnymlgchors1.R.inc(31260);assertEquals(false, Days.THREE.isLessThan(Days.TWO));
        __CLR4_4_1nymnymlgchors1.R.inc(31261);assertEquals(false, Days.THREE.isLessThan(Days.THREE));
        __CLR4_4_1nymnymlgchors1.R.inc(31262);assertEquals(true, Days.TWO.isLessThan(Days.THREE));
        __CLR4_4_1nymnymlgchors1.R.inc(31263);assertEquals(false, Days.ONE.isLessThan(null));
        __CLR4_4_1nymnymlgchors1.R.inc(31264);assertEquals(true, Days.days(-1).isLessThan(null));
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdido4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdido4h(){try{__CLR4_4_1nymnymlgchors1.R.inc(31265);
        __CLR4_4_1nymnymlgchors1.R.inc(31266);Days test = Days.days(20);
        __CLR4_4_1nymnymlgchors1.R.inc(31267);assertEquals("P20D", test.toString());

        __CLR4_4_1nymnymlgchors1.R.inc(31268);test = Days.days(-20);
        __CLR4_4_1nymnymlgchors1.R.inc(31269);assertEquals("P-20D", test.toString());
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9o4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31270,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9o4m() throws Exception{try{__CLR4_4_1nymnymlgchors1.R.inc(31270);
        __CLR4_4_1nymnymlgchors1.R.inc(31271);Days test = Days.SEVEN;

        __CLR4_4_1nymnymlgchors1.R.inc(31272);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1nymnymlgchors1.R.inc(31273);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1nymnymlgchors1.R.inc(31274);oos.writeObject(test);
        __CLR4_4_1nymnymlgchors1.R.inc(31275);oos.close();
        __CLR4_4_1nymnymlgchors1.R.inc(31276);byte[] bytes = baos.toByteArray();

        __CLR4_4_1nymnymlgchors1.R.inc(31277);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1nymnymlgchors1.R.inc(31278);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1nymnymlgchors1.R.inc(31279);Days result = (Days) ois.readObject();
        __CLR4_4_1nymnymlgchors1.R.inc(31280);ois.close();

        __CLR4_4_1nymnymlgchors1.R.inc(31281);assertSame(test, result);
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToStandardWeeks() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pfkyx0o4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pfkyx0o4y(){try{__CLR4_4_1nymnymlgchors1.R.inc(31282);
        __CLR4_4_1nymnymlgchors1.R.inc(31283);Days test = Days.days(14);
        __CLR4_4_1nymnymlgchors1.R.inc(31284);Weeks expected = Weeks.weeks(2);
        __CLR4_4_1nymnymlgchors1.R.inc(31285);assertEquals(expected, test.toStandardWeeks());
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    @Test
    public void testToStandardHours() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ikk7go52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ikk7go52(){try{__CLR4_4_1nymnymlgchors1.R.inc(31286);
        __CLR4_4_1nymnymlgchors1.R.inc(31287);Days test = Days.days(2);
        __CLR4_4_1nymnymlgchors1.R.inc(31288);Hours expected = Hours.hours(2 * 24);
        __CLR4_4_1nymnymlgchors1.R.inc(31289);assertEquals(expected, test.toStandardHours());

        __CLR4_4_1nymnymlgchors1.R.inc(31290);try {
            __CLR4_4_1nymnymlgchors1.R.inc(31291);Days.MAX_VALUE.toStandardHours();
            __CLR4_4_1nymnymlgchors1.R.inc(31292);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    @Test
    public void testToStandardMinutes() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0kt44o59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0kt44o59(){try{__CLR4_4_1nymnymlgchors1.R.inc(31293);
        __CLR4_4_1nymnymlgchors1.R.inc(31294);Days test = Days.days(2);
        __CLR4_4_1nymnymlgchors1.R.inc(31295);Minutes expected = Minutes.minutes(2 * 24 * 60);
        __CLR4_4_1nymnymlgchors1.R.inc(31296);assertEquals(expected, test.toStandardMinutes());

        __CLR4_4_1nymnymlgchors1.R.inc(31297);try {
            __CLR4_4_1nymnymlgchors1.R.inc(31298);Days.MAX_VALUE.toStandardMinutes();
            __CLR4_4_1nymnymlgchors1.R.inc(31299);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    @Test
    public void testToStandardSeconds() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1emeoqso5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1emeoqso5g(){try{__CLR4_4_1nymnymlgchors1.R.inc(31300);
        __CLR4_4_1nymnymlgchors1.R.inc(31301);Days test = Days.days(2);
        __CLR4_4_1nymnymlgchors1.R.inc(31302);Seconds expected = Seconds.seconds(2 * 24 * 60 * 60);
        __CLR4_4_1nymnymlgchors1.R.inc(31303);assertEquals(expected, test.toStandardSeconds());

        __CLR4_4_1nymnymlgchors1.R.inc(31304);try {
            __CLR4_4_1nymnymlgchors1.R.inc(31305);Days.MAX_VALUE.toStandardSeconds();
            __CLR4_4_1nymnymlgchors1.R.inc(31306);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    @Test
    public void testToStandardDuration() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izmvnpo5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31307,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izmvnpo5n(){try{__CLR4_4_1nymnymlgchors1.R.inc(31307);
        __CLR4_4_1nymnymlgchors1.R.inc(31308);Days test = Days.days(20);
        __CLR4_4_1nymnymlgchors1.R.inc(31309);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_DAY);
        __CLR4_4_1nymnymlgchors1.R.inc(31310);assertEquals(expected, test.toStandardDuration());

        __CLR4_4_1nymnymlgchors1.R.inc(31311);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_DAY);
        __CLR4_4_1nymnymlgchors1.R.inc(31312);assertEquals(expected, Days.MAX_VALUE.toStandardDuration());
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPlus_int() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1scc4ebo5t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testPlus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31313,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1scc4ebo5t(){try{__CLR4_4_1nymnymlgchors1.R.inc(31313);
        __CLR4_4_1nymnymlgchors1.R.inc(31314);Days test2 = Days.days(2);
        __CLR4_4_1nymnymlgchors1.R.inc(31315);Days result = test2.plus(3);
        __CLR4_4_1nymnymlgchors1.R.inc(31316);assertEquals(2, test2.getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31317);assertEquals(5, result.getDays());

        __CLR4_4_1nymnymlgchors1.R.inc(31318);assertEquals(1, Days.ONE.plus(0).getDays());

        __CLR4_4_1nymnymlgchors1.R.inc(31319);try {
            __CLR4_4_1nymnymlgchors1.R.inc(31320);Days.MAX_VALUE.plus(1);
            __CLR4_4_1nymnymlgchors1.R.inc(31321);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    @Test
    public void testPlus_Days() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170xe27o62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testPlus_Days",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170xe27o62(){try{__CLR4_4_1nymnymlgchors1.R.inc(31322);
        __CLR4_4_1nymnymlgchors1.R.inc(31323);Days test2 = Days.days(2);
        __CLR4_4_1nymnymlgchors1.R.inc(31324);Days test3 = Days.days(3);
        __CLR4_4_1nymnymlgchors1.R.inc(31325);Days result = test2.plus(test3);
        __CLR4_4_1nymnymlgchors1.R.inc(31326);assertEquals(2, test2.getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31327);assertEquals(3, test3.getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31328);assertEquals(5, result.getDays());

        __CLR4_4_1nymnymlgchors1.R.inc(31329);assertEquals(1, Days.ONE.plus(Days.ZERO).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31330);assertEquals(1, Days.ONE.plus((Days) null).getDays());

        __CLR4_4_1nymnymlgchors1.R.inc(31331);try {
            __CLR4_4_1nymnymlgchors1.R.inc(31332);Days.MAX_VALUE.plus(Days.ONE);
            __CLR4_4_1nymnymlgchors1.R.inc(31333);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    @Test
    public void testMinus_int() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118wkvpo6e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testMinus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31334,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118wkvpo6e(){try{__CLR4_4_1nymnymlgchors1.R.inc(31334);
        __CLR4_4_1nymnymlgchors1.R.inc(31335);Days test2 = Days.days(2);
        __CLR4_4_1nymnymlgchors1.R.inc(31336);Days result = test2.minus(3);
        __CLR4_4_1nymnymlgchors1.R.inc(31337);assertEquals(2, test2.getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31338);assertEquals(-1, result.getDays());

        __CLR4_4_1nymnymlgchors1.R.inc(31339);assertEquals(1, Days.ONE.minus(0).getDays());

        __CLR4_4_1nymnymlgchors1.R.inc(31340);try {
            __CLR4_4_1nymnymlgchors1.R.inc(31341);Days.MIN_VALUE.minus(1);
            __CLR4_4_1nymnymlgchors1.R.inc(31342);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    @Test
    public void testMinus_Days() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15e1gm7o6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testMinus_Days",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15e1gm7o6n(){try{__CLR4_4_1nymnymlgchors1.R.inc(31343);
        __CLR4_4_1nymnymlgchors1.R.inc(31344);Days test2 = Days.days(2);
        __CLR4_4_1nymnymlgchors1.R.inc(31345);Days test3 = Days.days(3);
        __CLR4_4_1nymnymlgchors1.R.inc(31346);Days result = test2.minus(test3);
        __CLR4_4_1nymnymlgchors1.R.inc(31347);assertEquals(2, test2.getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31348);assertEquals(3, test3.getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31349);assertEquals(-1, result.getDays());

        __CLR4_4_1nymnymlgchors1.R.inc(31350);assertEquals(1, Days.ONE.minus(Days.ZERO).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31351);assertEquals(1, Days.ONE.minus((Days) null).getDays());

        __CLR4_4_1nymnymlgchors1.R.inc(31352);try {
            __CLR4_4_1nymnymlgchors1.R.inc(31353);Days.MIN_VALUE.minus(Days.ONE);
            __CLR4_4_1nymnymlgchors1.R.inc(31354);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    @Test
    public void testMultipliedBy_int() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1szpsdpo6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testMultipliedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31355,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1szpsdpo6z(){try{__CLR4_4_1nymnymlgchors1.R.inc(31355);
        __CLR4_4_1nymnymlgchors1.R.inc(31356);Days test = Days.days(2);
        __CLR4_4_1nymnymlgchors1.R.inc(31357);assertEquals(6, test.multipliedBy(3).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31358);assertEquals(2, test.getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31359);assertEquals(-6, test.multipliedBy(-3).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31360);assertSame(test, test.multipliedBy(1));

        __CLR4_4_1nymnymlgchors1.R.inc(31361);Days halfMax = Days.days(Integer.MAX_VALUE / 2 + 1);
        __CLR4_4_1nymnymlgchors1.R.inc(31362);try {
            __CLR4_4_1nymnymlgchors1.R.inc(31363);halfMax.multipliedBy(2);
            __CLR4_4_1nymnymlgchors1.R.inc(31364);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    @Test
    public void testDividedBy_int() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9i8qvo79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testDividedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9i8qvo79(){try{__CLR4_4_1nymnymlgchors1.R.inc(31365);
        __CLR4_4_1nymnymlgchors1.R.inc(31366);Days test = Days.days(12);
        __CLR4_4_1nymnymlgchors1.R.inc(31367);assertEquals(6, test.dividedBy(2).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31368);assertEquals(12, test.getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31369);assertEquals(4, test.dividedBy(3).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31370);assertEquals(3, test.dividedBy(4).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31371);assertEquals(2, test.dividedBy(5).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31372);assertEquals(2, test.dividedBy(6).getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31373);assertSame(test, test.dividedBy(1));

        __CLR4_4_1nymnymlgchors1.R.inc(31374);try {
            __CLR4_4_1nymnymlgchors1.R.inc(31375);Days.ONE.dividedBy(0);
            __CLR4_4_1nymnymlgchors1.R.inc(31376);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    @Test
    public void testNegated() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av3307o7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testNegated",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31377,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av3307o7l(){try{__CLR4_4_1nymnymlgchors1.R.inc(31377);
        __CLR4_4_1nymnymlgchors1.R.inc(31378);Days test = Days.days(12);
        __CLR4_4_1nymnymlgchors1.R.inc(31379);assertEquals(-12, test.negated().getDays());
        __CLR4_4_1nymnymlgchors1.R.inc(31380);assertEquals(12, test.getDays());

        __CLR4_4_1nymnymlgchors1.R.inc(31381);try {
            __CLR4_4_1nymnymlgchors1.R.inc(31382);Days.MIN_VALUE.negated();
            __CLR4_4_1nymnymlgchors1.R.inc(31383);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddToLocalDate() {__CLR4_4_1nymnymlgchors1.R.globalSliceStart(getClass().getName(),31384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thm5yuo7s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nymnymlgchors1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nymnymlgchors1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testAddToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31384,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thm5yuo7s(){try{__CLR4_4_1nymnymlgchors1.R.inc(31384);
        __CLR4_4_1nymnymlgchors1.R.inc(31385);Days test = Days.days(20);
        __CLR4_4_1nymnymlgchors1.R.inc(31386);LocalDate date = new LocalDate(2006, 6, 1);
        __CLR4_4_1nymnymlgchors1.R.inc(31387);LocalDate expected = new LocalDate(2006, 6, 21);
        __CLR4_4_1nymnymlgchors1.R.inc(31388);assertEquals(expected, date.plus(test));
    }finally{__CLR4_4_1nymnymlgchors1.R.flushNeeded();}}

}
