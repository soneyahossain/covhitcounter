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
 * This class is a Junit unit test for Months.
 *
 * @author Stephen Colebourne
 */
public class TestMonths {static class __CLR4_4_1xogxoglgchos66{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,43949,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) throws Exception {try{__CLR4_4_1xogxoglgchos66.R.inc(43648);
        __CLR4_4_1xogxoglgchos66.R.inc(43649);TestMonths TB = new TestMonths();
        __CLR4_4_1xogxoglgchos66.R.inc(43650);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43651);TB.testConstants();
        __CLR4_4_1xogxoglgchos66.R.inc(43652);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43653);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43654);TB.testFactory_months_int();
        __CLR4_4_1xogxoglgchos66.R.inc(43655);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43656);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43657);TB.testFactory_monthsBetween_RInstant();
        __CLR4_4_1xogxoglgchos66.R.inc(43658);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43659);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43660);TB.testFactory_monthsBetween_RInstant_LocalDate_EndMonth();
        __CLR4_4_1xogxoglgchos66.R.inc(43661);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43662);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43663);TB.testFactory_monthsBetween_RPartial_LocalDate();
        __CLR4_4_1xogxoglgchos66.R.inc(43664);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43665);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43666);TB.testFactory_monthsBetween_RPartial_LocalDate_EndMonth();
        __CLR4_4_1xogxoglgchos66.R.inc(43667);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43668);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43669);TB.testFactory_monthsBetween_RPartial_YearMonth();
        __CLR4_4_1xogxoglgchos66.R.inc(43670);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43671);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43672);TB.testFactory_monthsBetween_RPartial_MonthDay();
        __CLR4_4_1xogxoglgchos66.R.inc(43673);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43674);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43675);TB.testFactory_monthsIn_RInterval();
        __CLR4_4_1xogxoglgchos66.R.inc(43676);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43677);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43678);TB.testFactory_parseMonths_String();
        __CLR4_4_1xogxoglgchos66.R.inc(43679);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43680);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43681);TB.testGetMethods();
        __CLR4_4_1xogxoglgchos66.R.inc(43682);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43683);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43684);TB.testGetFieldType();
        __CLR4_4_1xogxoglgchos66.R.inc(43685);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43686);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43687);TB.testGetPeriodType();
        __CLR4_4_1xogxoglgchos66.R.inc(43688);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43689);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43690);TB.testIsGreaterThan();
        __CLR4_4_1xogxoglgchos66.R.inc(43691);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43692);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43693);TB.testIsLessThan();
        __CLR4_4_1xogxoglgchos66.R.inc(43694);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43695);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43696);TB.testToString();
        __CLR4_4_1xogxoglgchos66.R.inc(43697);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43698);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43699);TB.testSerialization();
        __CLR4_4_1xogxoglgchos66.R.inc(43700);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43701);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43702);TB.testPlus_int();
        __CLR4_4_1xogxoglgchos66.R.inc(43703);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43704);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43705);TB.testPlus_Months();
        __CLR4_4_1xogxoglgchos66.R.inc(43706);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43707);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43708);TB.testMinus_int();
        __CLR4_4_1xogxoglgchos66.R.inc(43709);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43710);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43711);TB.testMinus_Months();
        __CLR4_4_1xogxoglgchos66.R.inc(43712);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43713);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43714);TB.testMultipliedBy_int();
        __CLR4_4_1xogxoglgchos66.R.inc(43715);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43716);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43717);TB.testDividedBy_int();
        __CLR4_4_1xogxoglgchos66.R.inc(43718);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43719);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43720);TB.testNegated();
        __CLR4_4_1xogxoglgchos66.R.inc(43721);TB.tearDown();
        __CLR4_4_1xogxoglgchos66.R.inc(43722);TB.setUp();
        __CLR4_4_1xogxoglgchos66.R.inc(43723);TB.testAddToLocalDate();
        __CLR4_4_1xogxoglgchos66.R.inc(43724);TB.tearDown();

    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestMonths.class);
    }

    public TestMonths(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1xogxoglgchos66.R.inc(43725);
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1xogxoglgchos66.R.inc(43726);
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstants() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15epzlwxqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testConstants",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43727,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15epzlwxqn(){try{__CLR4_4_1xogxoglgchos66.R.inc(43727);
        __CLR4_4_1xogxoglgchos66.R.inc(43728);assertEquals(0, Months.ZERO.getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43729);assertEquals(1, Months.ONE.getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43730);assertEquals(2, Months.TWO.getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43731);assertEquals(3, Months.THREE.getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43732);assertEquals(4, Months.FOUR.getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43733);assertEquals(5, Months.FIVE.getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43734);assertEquals(6, Months.SIX.getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43735);assertEquals(7, Months.SEVEN.getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43736);assertEquals(8, Months.EIGHT.getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43737);assertEquals(9, Months.NINE.getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43738);assertEquals(10, Months.TEN.getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43739);assertEquals(11, Months.ELEVEN.getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43740);assertEquals(12, Months.TWELVE.getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43741);assertEquals(Integer.MAX_VALUE, Months.MAX_VALUE.getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43742);assertEquals(Integer.MIN_VALUE, Months.MIN_VALUE.getMonths());
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_months_int() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18yr969xr3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_months_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18yr969xr3(){try{__CLR4_4_1xogxoglgchos66.R.inc(43743);
        __CLR4_4_1xogxoglgchos66.R.inc(43744);assertSame(Months.ZERO, Months.months(0));
        __CLR4_4_1xogxoglgchos66.R.inc(43745);assertSame(Months.ONE, Months.months(1));
        __CLR4_4_1xogxoglgchos66.R.inc(43746);assertSame(Months.TWO, Months.months(2));
        __CLR4_4_1xogxoglgchos66.R.inc(43747);assertSame(Months.THREE, Months.months(3));
        __CLR4_4_1xogxoglgchos66.R.inc(43748);assertSame(Months.FOUR, Months.months(4));
        __CLR4_4_1xogxoglgchos66.R.inc(43749);assertSame(Months.FIVE, Months.months(5));
        __CLR4_4_1xogxoglgchos66.R.inc(43750);assertSame(Months.SIX, Months.months(6));
        __CLR4_4_1xogxoglgchos66.R.inc(43751);assertSame(Months.SEVEN, Months.months(7));
        __CLR4_4_1xogxoglgchos66.R.inc(43752);assertSame(Months.EIGHT, Months.months(8));
        __CLR4_4_1xogxoglgchos66.R.inc(43753);assertSame(Months.NINE, Months.months(9));
        __CLR4_4_1xogxoglgchos66.R.inc(43754);assertSame(Months.TEN, Months.months(10));
        __CLR4_4_1xogxoglgchos66.R.inc(43755);assertSame(Months.ELEVEN, Months.months(11));
        __CLR4_4_1xogxoglgchos66.R.inc(43756);assertSame(Months.TWELVE, Months.months(12));
        __CLR4_4_1xogxoglgchos66.R.inc(43757);assertSame(Months.MAX_VALUE, Months.months(Integer.MAX_VALUE));
        __CLR4_4_1xogxoglgchos66.R.inc(43758);assertSame(Months.MIN_VALUE, Months.months(Integer.MIN_VALUE));
        __CLR4_4_1xogxoglgchos66.R.inc(43759);assertEquals(-1, Months.months(-1).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43760);assertEquals(13, Months.months(13).getMonths());
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_monthsBetween_RInstant() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ru34yvxrl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ru34yvxrl(){try{__CLR4_4_1xogxoglgchos66.R.inc(43761);
        __CLR4_4_1xogxoglgchos66.R.inc(43762);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_1xogxoglgchos66.R.inc(43763);DateTime end1 = new DateTime(2006, 9, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_1xogxoglgchos66.R.inc(43764);DateTime end2 = new DateTime(2006, 12, 9, 12, 0, 0, 0, PARIS);

        __CLR4_4_1xogxoglgchos66.R.inc(43765);assertEquals(3, Months.monthsBetween(start, end1).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43766);assertEquals(0, Months.monthsBetween(start, start).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43767);assertEquals(0, Months.monthsBetween(end1, end1).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43768);assertEquals(-3, Months.monthsBetween(end1, start).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43769);assertEquals(6, Months.monthsBetween(start, end2).getMonths());
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    @Test
    public void testFactory_monthsBetween_RInstant_LocalDate_EndMonth() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kdbz4fxru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RInstant_LocalDate_EndMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kdbz4fxru(){try{__CLR4_4_1xogxoglgchos66.R.inc(43770);
        __CLR4_4_1xogxoglgchos66.R.inc(43771);assertEquals(0, Months.monthsBetween(
                new DateTime(2006, 1, 31, 0, 0, 0, PARIS), new DateTime(2006, 2, 27, 0, 0, 0, PARIS)).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43772);assertEquals(1, Months.monthsBetween(
                new DateTime(2006, 1, 28, 0, 0, 0, PARIS), new DateTime(2006, 2, 28, 0, 0, 0, PARIS)).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43773);assertEquals(1, Months.monthsBetween(
                new DateTime(2006, 1, 29, 0, 0, 0, PARIS), new DateTime(2006, 2, 28, 0, 0, 0, PARIS)).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43774);assertEquals(1, Months.monthsBetween(
                new DateTime(2006, 1, 30, 0, 0, 0, PARIS), new DateTime(2006, 2, 28, 0, 0, 0, PARIS)).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43775);assertEquals(1, Months.monthsBetween(
                new DateTime(2006, 1, 31, 0, 0, 0, PARIS), new DateTime(2006, 2, 28, 0, 0, 0, PARIS)).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43776);assertEquals(1, Months.monthsBetween(
                new DateTime(2006, 1, 31, 0, 0, 0, PARIS), new DateTime(2006, 3, 1, 0, 0, 0, PARIS)).getMonths());
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    //-------------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testFactory_monthsBetween_RPartial_LocalDate() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kc58wxxs1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RPartial_LocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43777,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kc58wxxs1(){try{__CLR4_4_1xogxoglgchos66.R.inc(43777);
        __CLR4_4_1xogxoglgchos66.R.inc(43778);LocalDate start = new LocalDate(2006, 6, 9);
        __CLR4_4_1xogxoglgchos66.R.inc(43779);LocalDate end1 = new LocalDate(2006, 9, 9);
        __CLR4_4_1xogxoglgchos66.R.inc(43780);YearMonthDay end2 = new YearMonthDay(2006, 12, 9);

        __CLR4_4_1xogxoglgchos66.R.inc(43781);assertEquals(3, Months.monthsBetween(start, end1).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43782);assertEquals(0, Months.monthsBetween(start, start).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43783);assertEquals(0, Months.monthsBetween(end1, end1).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43784);assertEquals(-3, Months.monthsBetween(end1, start).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43785);assertEquals(6, Months.monthsBetween(start, end2).getMonths());
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    @Test
    public void testFactory_monthsBetween_RPartial_LocalDate_EndMonth() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1byjt8xxsa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RPartial_LocalDate_EndMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1byjt8xxsa(){try{__CLR4_4_1xogxoglgchos66.R.inc(43786);
        __CLR4_4_1xogxoglgchos66.R.inc(43787);assertEquals(0, Months.monthsBetween(new LocalDate(2006, 1, 31), new LocalDate(2006, 2, 27)).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43788);assertEquals(1, Months.monthsBetween(new LocalDate(2006, 1, 28), new LocalDate(2006, 2, 28)).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43789);assertEquals(1, Months.monthsBetween(new LocalDate(2006, 1, 29), new LocalDate(2006, 2, 28)).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43790);assertEquals(1, Months.monthsBetween(new LocalDate(2006, 1, 30), new LocalDate(2006, 2, 28)).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43791);assertEquals(1, Months.monthsBetween(new LocalDate(2006, 1, 31), new LocalDate(2006, 2, 28)).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43792);assertEquals(1, Months.monthsBetween(new LocalDate(2006, 1, 31), new LocalDate(2006, 3, 1)).getMonths());
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    @Test
    public void testFactory_monthsBetween_RPartial_YearMonth() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k9s7u3xsh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RPartial_YearMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k9s7u3xsh(){try{__CLR4_4_1xogxoglgchos66.R.inc(43793);
        __CLR4_4_1xogxoglgchos66.R.inc(43794);YearMonth start1 = new YearMonth(2011, 1);
        __CLR4_4_1xogxoglgchos66.R.inc(43795);for (int i = 0; (((i < 6)&&(__CLR4_4_1xogxoglgchos66.R.iget(43796)!=0|true))||(__CLR4_4_1xogxoglgchos66.R.iget(43797)==0&false)); i++) {{
            __CLR4_4_1xogxoglgchos66.R.inc(43798);YearMonth start2 = new YearMonth(2011 + i, 1);
            __CLR4_4_1xogxoglgchos66.R.inc(43799);YearMonth end = new YearMonth(2011 + i, 3);
            __CLR4_4_1xogxoglgchos66.R.inc(43800);assertEquals(i * 12 + 2, Months.monthsBetween(start1, end).getMonths());
            __CLR4_4_1xogxoglgchos66.R.inc(43801);assertEquals(2, Months.monthsBetween(start2, end).getMonths());
        }
    }}finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    @Test
    public void testFactory_monthsBetween_RPartial_MonthDay() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ruvefyxsq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RPartial_MonthDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43802,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ruvefyxsq(){try{__CLR4_4_1xogxoglgchos66.R.inc(43802);
        __CLR4_4_1xogxoglgchos66.R.inc(43803);MonthDay start = new MonthDay(2, 1);
        __CLR4_4_1xogxoglgchos66.R.inc(43804);MonthDay end1 = new MonthDay(2, 28);
        __CLR4_4_1xogxoglgchos66.R.inc(43805);MonthDay end2 = new MonthDay(2, 29);
        __CLR4_4_1xogxoglgchos66.R.inc(43806);MonthDay end3 = new MonthDay(3, 1);

        __CLR4_4_1xogxoglgchos66.R.inc(43807);assertEquals(0, Months.monthsBetween(start, end1).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43808);assertEquals(0, Months.monthsBetween(start, end2).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43809);assertEquals(1, Months.monthsBetween(start, end3).getMonths());

        __CLR4_4_1xogxoglgchos66.R.inc(43810);assertEquals(0, Months.monthsBetween(end1, start).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43811);assertEquals(0, Months.monthsBetween(end2, start).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43812);assertEquals(-1, Months.monthsBetween(end3, start).getMonths());
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    //-------------------------------------------------------------------------
    @Test
    public void testFactory_monthsIn_RInterval() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1981vkuxt1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsIn_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43813,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1981vkuxt1(){try{__CLR4_4_1xogxoglgchos66.R.inc(43813);
        __CLR4_4_1xogxoglgchos66.R.inc(43814);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_1xogxoglgchos66.R.inc(43815);DateTime end1 = new DateTime(2006, 9, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_1xogxoglgchos66.R.inc(43816);DateTime end2 = new DateTime(2006, 12, 9, 12, 0, 0, 0, PARIS);

        __CLR4_4_1xogxoglgchos66.R.inc(43817);assertEquals(0, Months.monthsIn((ReadableInterval) null).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43818);assertEquals(3, Months.monthsIn(new Interval(start, end1)).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43819);assertEquals(0, Months.monthsIn(new Interval(start, start)).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43820);assertEquals(0, Months.monthsIn(new Interval(end1, end1)).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43821);assertEquals(6, Months.monthsIn(new Interval(start, end2)).getMonths());
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    @Test
    public void testFactory_parseMonths_String() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rcdnpkxta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_parseMonths_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rcdnpkxta(){try{__CLR4_4_1xogxoglgchos66.R.inc(43822);
        __CLR4_4_1xogxoglgchos66.R.inc(43823);assertEquals(0, Months.parseMonths((String) null).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43824);assertEquals(0, Months.parseMonths("P0M").getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43825);assertEquals(1, Months.parseMonths("P1M").getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43826);assertEquals(-3, Months.parseMonths("P-3M").getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43827);assertEquals(2, Months.parseMonths("P0Y2M").getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43828);assertEquals(2, Months.parseMonths("P2MT0H0M").getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43829);try {
            __CLR4_4_1xogxoglgchos66.R.inc(43830);Months.parseMonths("P1Y1D");
            __CLR4_4_1xogxoglgchos66.R.inc(43831);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1xogxoglgchos66.R.inc(43832);try {
            __CLR4_4_1xogxoglgchos66.R.inc(43833);Months.parseMonths("P1MT1H");
            __CLR4_4_1xogxoglgchos66.R.inc(43834);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetMethods() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sjdmzxtn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testGetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sjdmzxtn(){try{__CLR4_4_1xogxoglgchos66.R.inc(43835);
        __CLR4_4_1xogxoglgchos66.R.inc(43836);Months test = Months.months(20);
        __CLR4_4_1xogxoglgchos66.R.inc(43837);assertEquals(20, test.getMonths());
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    @Test
    public void testGetFieldType() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mvxtq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mvxtq(){try{__CLR4_4_1xogxoglgchos66.R.inc(43838);
        __CLR4_4_1xogxoglgchos66.R.inc(43839);Months test = Months.months(20);
        __CLR4_4_1xogxoglgchos66.R.inc(43840);assertEquals(DurationFieldType.months(), test.getFieldType());
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    @Test
    public void testGetPeriodType() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivat1ixtt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testGetPeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43841,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivat1ixtt(){try{__CLR4_4_1xogxoglgchos66.R.inc(43841);
        __CLR4_4_1xogxoglgchos66.R.inc(43842);Months test = Months.months(20);
        __CLR4_4_1xogxoglgchos66.R.inc(43843);assertEquals(PeriodType.months(), test.getPeriodType());
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsGreaterThan() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5pnomxtw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testIsGreaterThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43844,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5pnomxtw(){try{__CLR4_4_1xogxoglgchos66.R.inc(43844);
        __CLR4_4_1xogxoglgchos66.R.inc(43845);assertEquals(true, Months.THREE.isGreaterThan(Months.TWO));
        __CLR4_4_1xogxoglgchos66.R.inc(43846);assertEquals(false, Months.THREE.isGreaterThan(Months.THREE));
        __CLR4_4_1xogxoglgchos66.R.inc(43847);assertEquals(false, Months.TWO.isGreaterThan(Months.THREE));
        __CLR4_4_1xogxoglgchos66.R.inc(43848);assertEquals(true, Months.ONE.isGreaterThan(null));
        __CLR4_4_1xogxoglgchos66.R.inc(43849);assertEquals(false, Months.months(-1).isGreaterThan(null));
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    @Test
    public void testIsLessThan() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmk0kdxu2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testIsLessThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43850,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmk0kdxu2(){try{__CLR4_4_1xogxoglgchos66.R.inc(43850);
        __CLR4_4_1xogxoglgchos66.R.inc(43851);assertEquals(false, Months.THREE.isLessThan(Months.TWO));
        __CLR4_4_1xogxoglgchos66.R.inc(43852);assertEquals(false, Months.THREE.isLessThan(Months.THREE));
        __CLR4_4_1xogxoglgchos66.R.inc(43853);assertEquals(true, Months.TWO.isLessThan(Months.THREE));
        __CLR4_4_1xogxoglgchos66.R.inc(43854);assertEquals(false, Months.ONE.isLessThan(null));
        __CLR4_4_1xogxoglgchos66.R.inc(43855);assertEquals(true, Months.months(-1).isLessThan(null));
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidxu8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43856,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidxu8(){try{__CLR4_4_1xogxoglgchos66.R.inc(43856);
        __CLR4_4_1xogxoglgchos66.R.inc(43857);Months test = Months.months(20);
        __CLR4_4_1xogxoglgchos66.R.inc(43858);assertEquals("P20M", test.toString());

        __CLR4_4_1xogxoglgchos66.R.inc(43859);test = Months.months(-20);
        __CLR4_4_1xogxoglgchos66.R.inc(43860);assertEquals("P-20M", test.toString());
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9xud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9xud() throws Exception{try{__CLR4_4_1xogxoglgchos66.R.inc(43861);
        __CLR4_4_1xogxoglgchos66.R.inc(43862);Months test = Months.THREE;

        __CLR4_4_1xogxoglgchos66.R.inc(43863);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1xogxoglgchos66.R.inc(43864);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1xogxoglgchos66.R.inc(43865);oos.writeObject(test);
        __CLR4_4_1xogxoglgchos66.R.inc(43866);oos.close();
        __CLR4_4_1xogxoglgchos66.R.inc(43867);byte[] bytes = baos.toByteArray();

        __CLR4_4_1xogxoglgchos66.R.inc(43868);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1xogxoglgchos66.R.inc(43869);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1xogxoglgchos66.R.inc(43870);Months result = (Months) ois.readObject();
        __CLR4_4_1xogxoglgchos66.R.inc(43871);ois.close();

        __CLR4_4_1xogxoglgchos66.R.inc(43872);assertSame(test, result);
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPlus_int() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1scc4ebxup();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testPlus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1scc4ebxup(){try{__CLR4_4_1xogxoglgchos66.R.inc(43873);
        __CLR4_4_1xogxoglgchos66.R.inc(43874);Months test2 = Months.months(2);
        __CLR4_4_1xogxoglgchos66.R.inc(43875);Months result = test2.plus(3);
        __CLR4_4_1xogxoglgchos66.R.inc(43876);assertEquals(2, test2.getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43877);assertEquals(5, result.getMonths());

        __CLR4_4_1xogxoglgchos66.R.inc(43878);assertEquals(1, Months.ONE.plus(0).getMonths());

        __CLR4_4_1xogxoglgchos66.R.inc(43879);try {
            __CLR4_4_1xogxoglgchos66.R.inc(43880);Months.MAX_VALUE.plus(1);
            __CLR4_4_1xogxoglgchos66.R.inc(43881);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    @Test
    public void testPlus_Months() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zcwq25xuy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testPlus_Months",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zcwq25xuy(){try{__CLR4_4_1xogxoglgchos66.R.inc(43882);
        __CLR4_4_1xogxoglgchos66.R.inc(43883);Months test2 = Months.months(2);
        __CLR4_4_1xogxoglgchos66.R.inc(43884);Months test3 = Months.months(3);
        __CLR4_4_1xogxoglgchos66.R.inc(43885);Months result = test2.plus(test3);
        __CLR4_4_1xogxoglgchos66.R.inc(43886);assertEquals(2, test2.getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43887);assertEquals(3, test3.getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43888);assertEquals(5, result.getMonths());

        __CLR4_4_1xogxoglgchos66.R.inc(43889);assertEquals(1, Months.ONE.plus(Months.ZERO).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43890);assertEquals(1, Months.ONE.plus((Months) null).getMonths());

        __CLR4_4_1xogxoglgchos66.R.inc(43891);try {
            __CLR4_4_1xogxoglgchos66.R.inc(43892);Months.MAX_VALUE.plus(Months.ONE);
            __CLR4_4_1xogxoglgchos66.R.inc(43893);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    @Test
    public void testMinus_int() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118wkvpxva();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testMinus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118wkvpxva(){try{__CLR4_4_1xogxoglgchos66.R.inc(43894);
        __CLR4_4_1xogxoglgchos66.R.inc(43895);Months test2 = Months.months(2);
        __CLR4_4_1xogxoglgchos66.R.inc(43896);Months result = test2.minus(3);
        __CLR4_4_1xogxoglgchos66.R.inc(43897);assertEquals(2, test2.getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43898);assertEquals(-1, result.getMonths());

        __CLR4_4_1xogxoglgchos66.R.inc(43899);assertEquals(1, Months.ONE.minus(0).getMonths());

        __CLR4_4_1xogxoglgchos66.R.inc(43900);try {
            __CLR4_4_1xogxoglgchos66.R.inc(43901);Months.MIN_VALUE.minus(1);
            __CLR4_4_1xogxoglgchos66.R.inc(43902);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    @Test
    public void testMinus_Months() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xqcf97xvj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testMinus_Months",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xqcf97xvj(){try{__CLR4_4_1xogxoglgchos66.R.inc(43903);
        __CLR4_4_1xogxoglgchos66.R.inc(43904);Months test2 = Months.months(2);
        __CLR4_4_1xogxoglgchos66.R.inc(43905);Months test3 = Months.months(3);
        __CLR4_4_1xogxoglgchos66.R.inc(43906);Months result = test2.minus(test3);
        __CLR4_4_1xogxoglgchos66.R.inc(43907);assertEquals(2, test2.getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43908);assertEquals(3, test3.getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43909);assertEquals(-1, result.getMonths());

        __CLR4_4_1xogxoglgchos66.R.inc(43910);assertEquals(1, Months.ONE.minus(Months.ZERO).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43911);assertEquals(1, Months.ONE.minus((Months) null).getMonths());

        __CLR4_4_1xogxoglgchos66.R.inc(43912);try {
            __CLR4_4_1xogxoglgchos66.R.inc(43913);Months.MIN_VALUE.minus(Months.ONE);
            __CLR4_4_1xogxoglgchos66.R.inc(43914);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    @Test
    public void testMultipliedBy_int() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1szpsdpxvv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testMultipliedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1szpsdpxvv(){try{__CLR4_4_1xogxoglgchos66.R.inc(43915);
        __CLR4_4_1xogxoglgchos66.R.inc(43916);Months test = Months.months(2);
        __CLR4_4_1xogxoglgchos66.R.inc(43917);assertEquals(6, test.multipliedBy(3).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43918);assertEquals(2, test.getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43919);assertEquals(-6, test.multipliedBy(-3).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43920);assertSame(test, test.multipliedBy(1));

        __CLR4_4_1xogxoglgchos66.R.inc(43921);Months halfMax = Months.months(Integer.MAX_VALUE / 2 + 1);
        __CLR4_4_1xogxoglgchos66.R.inc(43922);try {
            __CLR4_4_1xogxoglgchos66.R.inc(43923);halfMax.multipliedBy(2);
            __CLR4_4_1xogxoglgchos66.R.inc(43924);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    @Test
    public void testDividedBy_int() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9i8qvxw5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testDividedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9i8qvxw5(){try{__CLR4_4_1xogxoglgchos66.R.inc(43925);
        __CLR4_4_1xogxoglgchos66.R.inc(43926);Months test = Months.months(12);
        __CLR4_4_1xogxoglgchos66.R.inc(43927);assertEquals(6, test.dividedBy(2).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43928);assertEquals(12, test.getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43929);assertEquals(4, test.dividedBy(3).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43930);assertEquals(3, test.dividedBy(4).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43931);assertEquals(2, test.dividedBy(5).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43932);assertEquals(2, test.dividedBy(6).getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43933);assertSame(test, test.dividedBy(1));

        __CLR4_4_1xogxoglgchos66.R.inc(43934);try {
            __CLR4_4_1xogxoglgchos66.R.inc(43935);Months.ONE.dividedBy(0);
            __CLR4_4_1xogxoglgchos66.R.inc(43936);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    @Test
    public void testNegated() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av3307xwh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testNegated",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av3307xwh(){try{__CLR4_4_1xogxoglgchos66.R.inc(43937);
        __CLR4_4_1xogxoglgchos66.R.inc(43938);Months test = Months.months(12);
        __CLR4_4_1xogxoglgchos66.R.inc(43939);assertEquals(-12, test.negated().getMonths());
        __CLR4_4_1xogxoglgchos66.R.inc(43940);assertEquals(12, test.getMonths());

        __CLR4_4_1xogxoglgchos66.R.inc(43941);try {
            __CLR4_4_1xogxoglgchos66.R.inc(43942);Months.MIN_VALUE.negated();
            __CLR4_4_1xogxoglgchos66.R.inc(43943);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddToLocalDate() {__CLR4_4_1xogxoglgchos66.R.globalSliceStart(getClass().getName(),43944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thm5yuxwo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xogxoglgchos66.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xogxoglgchos66.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testAddToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43944,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thm5yuxwo(){try{__CLR4_4_1xogxoglgchos66.R.inc(43944);
        __CLR4_4_1xogxoglgchos66.R.inc(43945);Months test = Months.months(3);
        __CLR4_4_1xogxoglgchos66.R.inc(43946);LocalDate date = new LocalDate(2006, 6, 1);
        __CLR4_4_1xogxoglgchos66.R.inc(43947);LocalDate expected = new LocalDate(2006, 9, 1);
        __CLR4_4_1xogxoglgchos66.R.inc(43948);assertEquals(expected, date.plus(test));
    }finally{__CLR4_4_1xogxoglgchos66.R.flushNeeded();}}

}
