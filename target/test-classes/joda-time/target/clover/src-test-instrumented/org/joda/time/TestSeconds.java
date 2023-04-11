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
 * This class is a Junit unit test for Seconds.
 *
 * @author Stephen Colebourne
 */
public class TestSeconds {static class __CLR4_4_1167i167ilgchosg8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,54989,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) throws Exception {try{__CLR4_4_1167i167ilgchosg8.R.inc(54702);
        __CLR4_4_1167i167ilgchosg8.R.inc(54703);TestSeconds TB = new TestSeconds();
        __CLR4_4_1167i167ilgchosg8.R.inc(54704);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54705);TB.testConstants();
        __CLR4_4_1167i167ilgchosg8.R.inc(54706);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54707);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54708);TB.testFactory_seconds_int();
        __CLR4_4_1167i167ilgchosg8.R.inc(54709);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54710);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54711);TB.testFactory_secondsBetween_RInstant();
        __CLR4_4_1167i167ilgchosg8.R.inc(54712);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54713);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54714);TB.testFactory_secondsBetween_RPartial();
        __CLR4_4_1167i167ilgchosg8.R.inc(54715);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54716);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54717);TB.testFactory_secondsIn_RInterval();
        __CLR4_4_1167i167ilgchosg8.R.inc(54718);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54719);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54720);TB.testFactory_standardSecondsIn_RPeriod();
        __CLR4_4_1167i167ilgchosg8.R.inc(54721);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54722);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54723);TB.testFactory_parseSeconds_String();
        __CLR4_4_1167i167ilgchosg8.R.inc(54724);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54725);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54726);TB.testGetMethods();
        __CLR4_4_1167i167ilgchosg8.R.inc(54727);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54728);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54729);TB.testGetFieldType();
        __CLR4_4_1167i167ilgchosg8.R.inc(54730);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54731);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54732);TB.testGetPeriodType();
        __CLR4_4_1167i167ilgchosg8.R.inc(54733);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54734);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54735);TB.testIsGreaterThan();
        __CLR4_4_1167i167ilgchosg8.R.inc(54736);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54737);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54738);TB.testIsLessThan();
        __CLR4_4_1167i167ilgchosg8.R.inc(54739);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54740);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54741);TB.testToString();
        __CLR4_4_1167i167ilgchosg8.R.inc(54742);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54743);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54744);TB.testSerialization();
        __CLR4_4_1167i167ilgchosg8.R.inc(54745);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54746);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54747);TB.testToStandardWeeks();
        __CLR4_4_1167i167ilgchosg8.R.inc(54748);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54749);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54750);TB.testToStandardDays();
        __CLR4_4_1167i167ilgchosg8.R.inc(54751);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54752);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54753);TB.testToStandardHours();
        __CLR4_4_1167i167ilgchosg8.R.inc(54754);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54755);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54756);TB.testToStandardMinutes();
        __CLR4_4_1167i167ilgchosg8.R.inc(54757);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54758);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54759);TB.testToStandardDuration();
        __CLR4_4_1167i167ilgchosg8.R.inc(54760);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54761);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54762);TB.testPlus_int();
        __CLR4_4_1167i167ilgchosg8.R.inc(54763);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54764);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54765);TB.testPlus_Seconds();
        __CLR4_4_1167i167ilgchosg8.R.inc(54766);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54767);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54768);TB.testMinus_int();
        __CLR4_4_1167i167ilgchosg8.R.inc(54769);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54770);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54771);TB.testMinus_Seconds();
        __CLR4_4_1167i167ilgchosg8.R.inc(54772);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54773);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54774);TB.testMultipliedBy_int();
        __CLR4_4_1167i167ilgchosg8.R.inc(54775);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54776);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54777);TB.testDividedBy_int();
        __CLR4_4_1167i167ilgchosg8.R.inc(54778);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54779);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54780);TB.testNegated();
        __CLR4_4_1167i167ilgchosg8.R.inc(54781);TB.tearDown();
        __CLR4_4_1167i167ilgchosg8.R.inc(54782);TB.setUp();
        __CLR4_4_1167i167ilgchosg8.R.inc(54783);TB.testAddToLocalDate();
        __CLR4_4_1167i167ilgchosg8.R.inc(54784);TB.tearDown();

    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestSeconds.class);
    }

    public TestSeconds(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1167i167ilgchosg8.R.inc(54785);
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1167i167ilgchosg8.R.inc(54786);
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstants() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15epzlw169v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testConstants",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15epzlw169v(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54787);
        __CLR4_4_1167i167ilgchosg8.R.inc(54788);assertEquals(0, Seconds.ZERO.getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54789);assertEquals(1, Seconds.ONE.getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54790);assertEquals(2, Seconds.TWO.getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54791);assertEquals(3, Seconds.THREE.getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54792);assertEquals(Integer.MAX_VALUE, Seconds.MAX_VALUE.getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54793);assertEquals(Integer.MIN_VALUE, Seconds.MIN_VALUE.getSeconds());
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_seconds_int() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w1dscv16a2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_seconds_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w1dscv16a2(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54794);
        __CLR4_4_1167i167ilgchosg8.R.inc(54795);assertSame(Seconds.ZERO, Seconds.seconds(0));
        __CLR4_4_1167i167ilgchosg8.R.inc(54796);assertSame(Seconds.ONE, Seconds.seconds(1));
        __CLR4_4_1167i167ilgchosg8.R.inc(54797);assertSame(Seconds.TWO, Seconds.seconds(2));
        __CLR4_4_1167i167ilgchosg8.R.inc(54798);assertSame(Seconds.THREE, Seconds.seconds(3));
        __CLR4_4_1167i167ilgchosg8.R.inc(54799);assertSame(Seconds.MAX_VALUE, Seconds.seconds(Integer.MAX_VALUE));
        __CLR4_4_1167i167ilgchosg8.R.inc(54800);assertSame(Seconds.MIN_VALUE, Seconds.seconds(Integer.MIN_VALUE));
        __CLR4_4_1167i167ilgchosg8.R.inc(54801);assertEquals(-1, Seconds.seconds(-1).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54802);assertEquals(4, Seconds.seconds(4).getSeconds());
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_secondsBetween_RInstant() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x55zzv16ab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_secondsBetween_RInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x55zzv16ab(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54803);
        __CLR4_4_1167i167ilgchosg8.R.inc(54804);DateTime start = new DateTime(2006, 6, 9, 12, 0, 3, 0, PARIS);
        __CLR4_4_1167i167ilgchosg8.R.inc(54805);DateTime end1 = new DateTime(2006, 6, 9, 12, 0, 6, 0, PARIS);
        __CLR4_4_1167i167ilgchosg8.R.inc(54806);DateTime end2 = new DateTime(2006, 6, 9, 12, 0, 9, 0, PARIS);

        __CLR4_4_1167i167ilgchosg8.R.inc(54807);assertEquals(3, Seconds.secondsBetween(start, end1).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54808);assertEquals(0, Seconds.secondsBetween(start, start).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54809);assertEquals(0, Seconds.secondsBetween(end1, end1).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54810);assertEquals(-3, Seconds.secondsBetween(end1, start).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54811);assertEquals(6, Seconds.secondsBetween(start, end2).getSeconds());
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    @Test
    public void testFactory_secondsBetween_RPartial() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1go2biz16ak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_secondsBetween_RPartial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1go2biz16ak(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54812);
        __CLR4_4_1167i167ilgchosg8.R.inc(54813);LocalTime start = new LocalTime(12, 0, 3);
        __CLR4_4_1167i167ilgchosg8.R.inc(54814);LocalTime end1 = new LocalTime(12, 0, 6);
        __CLR4_4_1167i167ilgchosg8.R.inc(54815);@SuppressWarnings("deprecation")
        TimeOfDay end2 = new TimeOfDay(12, 0, 9);

        __CLR4_4_1167i167ilgchosg8.R.inc(54816);assertEquals(3, Seconds.secondsBetween(start, end1).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54817);assertEquals(0, Seconds.secondsBetween(start, start).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54818);assertEquals(0, Seconds.secondsBetween(end1, end1).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54819);assertEquals(-3, Seconds.secondsBetween(end1, start).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54820);assertEquals(6, Seconds.secondsBetween(start, end2).getSeconds());
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    @Test
    public void testFactory_secondsIn_RInterval() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vnr6ik16at();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_secondsIn_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vnr6ik16at(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54821);
        __CLR4_4_1167i167ilgchosg8.R.inc(54822);DateTime start = new DateTime(2006, 6, 9, 12, 0, 3, 0, PARIS);
        __CLR4_4_1167i167ilgchosg8.R.inc(54823);DateTime end1 = new DateTime(2006, 6, 9, 12, 0, 6, 0, PARIS);
        __CLR4_4_1167i167ilgchosg8.R.inc(54824);DateTime end2 = new DateTime(2006, 6, 9, 12, 0, 9, 0, PARIS);

        __CLR4_4_1167i167ilgchosg8.R.inc(54825);assertEquals(0, Seconds.secondsIn((ReadableInterval) null).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54826);assertEquals(3, Seconds.secondsIn(new Interval(start, end1)).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54827);assertEquals(0, Seconds.secondsIn(new Interval(start, start)).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54828);assertEquals(0, Seconds.secondsIn(new Interval(end1, end1)).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54829);assertEquals(6, Seconds.secondsIn(new Interval(start, end2)).getSeconds());
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    @Test
    public void testFactory_standardSecondsIn_RPeriod() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_138nhb916b2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_standardSecondsIn_RPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_138nhb916b2(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54830);
        __CLR4_4_1167i167ilgchosg8.R.inc(54831);assertEquals(0, Seconds.standardSecondsIn((ReadablePeriod) null).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54832);assertEquals(0, Seconds.standardSecondsIn(Period.ZERO).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54833);assertEquals(1, Seconds.standardSecondsIn(new Period(0, 0, 0, 0, 0, 0, 1, 0)).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54834);assertEquals(123, Seconds.standardSecondsIn(Period.seconds(123)).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54835);assertEquals(-987, Seconds.standardSecondsIn(Period.seconds(-987)).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54836);assertEquals(2 * 24 * 60 * 60, Seconds.standardSecondsIn(Period.days(2)).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54837);try {
            __CLR4_4_1167i167ilgchosg8.R.inc(54838);Seconds.standardSecondsIn(Period.months(1));
            __CLR4_4_1167i167ilgchosg8.R.inc(54839);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    @Test
    public void testFactory_parseSeconds_String() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nwzgk16bc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_parseSeconds_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nwzgk16bc(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54840);
        __CLR4_4_1167i167ilgchosg8.R.inc(54841);assertEquals(0, Seconds.parseSeconds((String) null).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54842);assertEquals(0, Seconds.parseSeconds("PT0S").getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54843);assertEquals(1, Seconds.parseSeconds("PT1S").getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54844);assertEquals(-3, Seconds.parseSeconds("PT-3S").getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54845);assertEquals(2, Seconds.parseSeconds("P0Y0M0DT2S").getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54846);assertEquals(2, Seconds.parseSeconds("PT0H2S").getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54847);try {
            __CLR4_4_1167i167ilgchosg8.R.inc(54848);Seconds.parseSeconds("P1Y1D");
            __CLR4_4_1167i167ilgchosg8.R.inc(54849);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1167i167ilgchosg8.R.inc(54850);try {
            __CLR4_4_1167i167ilgchosg8.R.inc(54851);Seconds.parseSeconds("P1DT1S");
            __CLR4_4_1167i167ilgchosg8.R.inc(54852);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetMethods() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sjdmz16bp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testGetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sjdmz16bp(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54853);
        __CLR4_4_1167i167ilgchosg8.R.inc(54854);Seconds test = Seconds.seconds(20);
        __CLR4_4_1167i167ilgchosg8.R.inc(54855);assertEquals(20, test.getSeconds());
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    @Test
    public void testGetFieldType() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mv16bs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54856,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mv16bs(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54856);
        __CLR4_4_1167i167ilgchosg8.R.inc(54857);Seconds test = Seconds.seconds(20);
        __CLR4_4_1167i167ilgchosg8.R.inc(54858);assertEquals(DurationFieldType.seconds(), test.getFieldType());
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    @Test
    public void testGetPeriodType() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivat1i16bv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testGetPeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivat1i16bv(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54859);
        __CLR4_4_1167i167ilgchosg8.R.inc(54860);Seconds test = Seconds.seconds(20);
        __CLR4_4_1167i167ilgchosg8.R.inc(54861);assertEquals(PeriodType.seconds(), test.getPeriodType());
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsGreaterThan() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5pnom16by();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testIsGreaterThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5pnom16by(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54862);
        __CLR4_4_1167i167ilgchosg8.R.inc(54863);assertEquals(true, Seconds.THREE.isGreaterThan(Seconds.TWO));
        __CLR4_4_1167i167ilgchosg8.R.inc(54864);assertEquals(false, Seconds.THREE.isGreaterThan(Seconds.THREE));
        __CLR4_4_1167i167ilgchosg8.R.inc(54865);assertEquals(false, Seconds.TWO.isGreaterThan(Seconds.THREE));
        __CLR4_4_1167i167ilgchosg8.R.inc(54866);assertEquals(true, Seconds.ONE.isGreaterThan(null));
        __CLR4_4_1167i167ilgchosg8.R.inc(54867);assertEquals(false, Seconds.seconds(-1).isGreaterThan(null));
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    @Test
    public void testIsLessThan() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmk0kd16c4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testIsLessThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54868,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmk0kd16c4(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54868);
        __CLR4_4_1167i167ilgchosg8.R.inc(54869);assertEquals(false, Seconds.THREE.isLessThan(Seconds.TWO));
        __CLR4_4_1167i167ilgchosg8.R.inc(54870);assertEquals(false, Seconds.THREE.isLessThan(Seconds.THREE));
        __CLR4_4_1167i167ilgchosg8.R.inc(54871);assertEquals(true, Seconds.TWO.isLessThan(Seconds.THREE));
        __CLR4_4_1167i167ilgchosg8.R.inc(54872);assertEquals(false, Seconds.ONE.isLessThan(null));
        __CLR4_4_1167i167ilgchosg8.R.inc(54873);assertEquals(true, Seconds.seconds(-1).isLessThan(null));
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid16ca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid16ca(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54874);
        __CLR4_4_1167i167ilgchosg8.R.inc(54875);Seconds test = Seconds.seconds(20);
        __CLR4_4_1167i167ilgchosg8.R.inc(54876);assertEquals("PT20S", test.toString());

        __CLR4_4_1167i167ilgchosg8.R.inc(54877);test = Seconds.seconds(-20);
        __CLR4_4_1167i167ilgchosg8.R.inc(54878);assertEquals("PT-20S", test.toString());
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on916cf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on916cf() throws Exception{try{__CLR4_4_1167i167ilgchosg8.R.inc(54879);
        __CLR4_4_1167i167ilgchosg8.R.inc(54880);Seconds test = Seconds.THREE;

        __CLR4_4_1167i167ilgchosg8.R.inc(54881);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1167i167ilgchosg8.R.inc(54882);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1167i167ilgchosg8.R.inc(54883);oos.writeObject(test);
        __CLR4_4_1167i167ilgchosg8.R.inc(54884);oos.close();
        __CLR4_4_1167i167ilgchosg8.R.inc(54885);byte[] bytes = baos.toByteArray();

        __CLR4_4_1167i167ilgchosg8.R.inc(54886);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1167i167ilgchosg8.R.inc(54887);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1167i167ilgchosg8.R.inc(54888);Seconds result = (Seconds) ois.readObject();
        __CLR4_4_1167i167ilgchosg8.R.inc(54889);ois.close();

        __CLR4_4_1167i167ilgchosg8.R.inc(54890);assertSame(test, result);
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToStandardWeeks() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pfkyx016cr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pfkyx016cr(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54891);
        __CLR4_4_1167i167ilgchosg8.R.inc(54892);Seconds test = Seconds.seconds(60 * 60 * 24 * 7 * 2);
        __CLR4_4_1167i167ilgchosg8.R.inc(54893);Weeks expected = Weeks.weeks(2);
        __CLR4_4_1167i167ilgchosg8.R.inc(54894);assertEquals(expected, test.toStandardWeeks());
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    @Test
    public void testToStandardDays() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eftdm016cv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54895,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eftdm016cv(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54895);
        __CLR4_4_1167i167ilgchosg8.R.inc(54896);Seconds test = Seconds.seconds(60 * 60 * 24 * 2);
        __CLR4_4_1167i167ilgchosg8.R.inc(54897);Days expected = Days.days(2);
        __CLR4_4_1167i167ilgchosg8.R.inc(54898);assertEquals(expected, test.toStandardDays());
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    @Test
    public void testToStandardHours() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ikk7g16cz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54899,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ikk7g16cz(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54899);
        __CLR4_4_1167i167ilgchosg8.R.inc(54900);Seconds test = Seconds.seconds(60 * 60 * 2);
        __CLR4_4_1167i167ilgchosg8.R.inc(54901);Hours expected = Hours.hours(2);
        __CLR4_4_1167i167ilgchosg8.R.inc(54902);assertEquals(expected, test.toStandardHours());
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    @Test
    public void testToStandardMinutes() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0kt4416d3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0kt4416d3(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54903);
        __CLR4_4_1167i167ilgchosg8.R.inc(54904);Seconds test = Seconds.seconds(60 * 2);
        __CLR4_4_1167i167ilgchosg8.R.inc(54905);Minutes expected = Minutes.minutes(2);
        __CLR4_4_1167i167ilgchosg8.R.inc(54906);assertEquals(expected, test.toStandardMinutes());
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    @Test
    public void testToStandardDuration() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izmvnp16d7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izmvnp16d7(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54907);
        __CLR4_4_1167i167ilgchosg8.R.inc(54908);Seconds test = Seconds.seconds(20);
        __CLR4_4_1167i167ilgchosg8.R.inc(54909);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_SECOND);
        __CLR4_4_1167i167ilgchosg8.R.inc(54910);assertEquals(expected, test.toStandardDuration());

        __CLR4_4_1167i167ilgchosg8.R.inc(54911);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_SECOND);
        __CLR4_4_1167i167ilgchosg8.R.inc(54912);assertEquals(expected, Seconds.MAX_VALUE.toStandardDuration());
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPlus_int() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1scc4eb16dd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testPlus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1scc4eb16dd(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54913);
        __CLR4_4_1167i167ilgchosg8.R.inc(54914);Seconds test2 = Seconds.seconds(2);
        __CLR4_4_1167i167ilgchosg8.R.inc(54915);Seconds result = test2.plus(3);
        __CLR4_4_1167i167ilgchosg8.R.inc(54916);assertEquals(2, test2.getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54917);assertEquals(5, result.getSeconds());

        __CLR4_4_1167i167ilgchosg8.R.inc(54918);assertEquals(1, Seconds.ONE.plus(0).getSeconds());

        __CLR4_4_1167i167ilgchosg8.R.inc(54919);try {
            __CLR4_4_1167i167ilgchosg8.R.inc(54920);Seconds.MAX_VALUE.plus(1);
            __CLR4_4_1167i167ilgchosg8.R.inc(54921);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    @Test
    public void testPlus_Seconds() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19utwdv16dm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testPlus_Seconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19utwdv16dm(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54922);
        __CLR4_4_1167i167ilgchosg8.R.inc(54923);Seconds test2 = Seconds.seconds(2);
        __CLR4_4_1167i167ilgchosg8.R.inc(54924);Seconds test3 = Seconds.seconds(3);
        __CLR4_4_1167i167ilgchosg8.R.inc(54925);Seconds result = test2.plus(test3);
        __CLR4_4_1167i167ilgchosg8.R.inc(54926);assertEquals(2, test2.getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54927);assertEquals(3, test3.getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54928);assertEquals(5, result.getSeconds());

        __CLR4_4_1167i167ilgchosg8.R.inc(54929);assertEquals(1, Seconds.ONE.plus(Seconds.ZERO).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54930);assertEquals(1, Seconds.ONE.plus((Seconds) null).getSeconds());

        __CLR4_4_1167i167ilgchosg8.R.inc(54931);try {
            __CLR4_4_1167i167ilgchosg8.R.inc(54932);Seconds.MAX_VALUE.plus(Seconds.ONE);
            __CLR4_4_1167i167ilgchosg8.R.inc(54933);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    @Test
    public void testMinus_int() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118wkvp16dy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testMinus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118wkvp16dy(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54934);
        __CLR4_4_1167i167ilgchosg8.R.inc(54935);Seconds test2 = Seconds.seconds(2);
        __CLR4_4_1167i167ilgchosg8.R.inc(54936);Seconds result = test2.minus(3);
        __CLR4_4_1167i167ilgchosg8.R.inc(54937);assertEquals(2, test2.getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54938);assertEquals(-1, result.getSeconds());

        __CLR4_4_1167i167ilgchosg8.R.inc(54939);assertEquals(1, Seconds.ONE.minus(0).getSeconds());

        __CLR4_4_1167i167ilgchosg8.R.inc(54940);try {
            __CLR4_4_1167i167ilgchosg8.R.inc(54941);Seconds.MIN_VALUE.minus(1);
            __CLR4_4_1167i167ilgchosg8.R.inc(54942);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    @Test
    public void testMinus_Seconds() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uggnfp16e7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testMinus_Seconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uggnfp16e7(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54943);
        __CLR4_4_1167i167ilgchosg8.R.inc(54944);Seconds test2 = Seconds.seconds(2);
        __CLR4_4_1167i167ilgchosg8.R.inc(54945);Seconds test3 = Seconds.seconds(3);
        __CLR4_4_1167i167ilgchosg8.R.inc(54946);Seconds result = test2.minus(test3);
        __CLR4_4_1167i167ilgchosg8.R.inc(54947);assertEquals(2, test2.getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54948);assertEquals(3, test3.getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54949);assertEquals(-1, result.getSeconds());

        __CLR4_4_1167i167ilgchosg8.R.inc(54950);assertEquals(1, Seconds.ONE.minus(Seconds.ZERO).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54951);assertEquals(1, Seconds.ONE.minus((Seconds) null).getSeconds());

        __CLR4_4_1167i167ilgchosg8.R.inc(54952);try {
            __CLR4_4_1167i167ilgchosg8.R.inc(54953);Seconds.MIN_VALUE.minus(Seconds.ONE);
            __CLR4_4_1167i167ilgchosg8.R.inc(54954);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    @Test
    public void testMultipliedBy_int() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1szpsdp16ej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testMultipliedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1szpsdp16ej(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54955);
        __CLR4_4_1167i167ilgchosg8.R.inc(54956);Seconds test = Seconds.seconds(2);
        __CLR4_4_1167i167ilgchosg8.R.inc(54957);assertEquals(6, test.multipliedBy(3).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54958);assertEquals(2, test.getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54959);assertEquals(-6, test.multipliedBy(-3).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54960);assertSame(test, test.multipliedBy(1));

        __CLR4_4_1167i167ilgchosg8.R.inc(54961);Seconds halfMax = Seconds.seconds(Integer.MAX_VALUE / 2 + 1);
        __CLR4_4_1167i167ilgchosg8.R.inc(54962);try {
            __CLR4_4_1167i167ilgchosg8.R.inc(54963);halfMax.multipliedBy(2);
            __CLR4_4_1167i167ilgchosg8.R.inc(54964);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    @Test
    public void testDividedBy_int() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9i8qv16et();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testDividedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54965,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9i8qv16et(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54965);
        __CLR4_4_1167i167ilgchosg8.R.inc(54966);Seconds test = Seconds.seconds(12);
        __CLR4_4_1167i167ilgchosg8.R.inc(54967);assertEquals(6, test.dividedBy(2).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54968);assertEquals(12, test.getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54969);assertEquals(4, test.dividedBy(3).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54970);assertEquals(3, test.dividedBy(4).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54971);assertEquals(2, test.dividedBy(5).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54972);assertEquals(2, test.dividedBy(6).getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54973);assertSame(test, test.dividedBy(1));

        __CLR4_4_1167i167ilgchosg8.R.inc(54974);try {
            __CLR4_4_1167i167ilgchosg8.R.inc(54975);Seconds.ONE.dividedBy(0);
            __CLR4_4_1167i167ilgchosg8.R.inc(54976);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    @Test
    public void testNegated() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av330716f5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testNegated",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av330716f5(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54977);
        __CLR4_4_1167i167ilgchosg8.R.inc(54978);Seconds test = Seconds.seconds(12);
        __CLR4_4_1167i167ilgchosg8.R.inc(54979);assertEquals(-12, test.negated().getSeconds());
        __CLR4_4_1167i167ilgchosg8.R.inc(54980);assertEquals(12, test.getSeconds());

        __CLR4_4_1167i167ilgchosg8.R.inc(54981);try {
            __CLR4_4_1167i167ilgchosg8.R.inc(54982);Seconds.MIN_VALUE.negated();
            __CLR4_4_1167i167ilgchosg8.R.inc(54983);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddToLocalDate() {__CLR4_4_1167i167ilgchosg8.R.globalSliceStart(getClass().getName(),54984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thm5yu16fc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1167i167ilgchosg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1167i167ilgchosg8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testAddToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thm5yu16fc(){try{__CLR4_4_1167i167ilgchosg8.R.inc(54984);
        __CLR4_4_1167i167ilgchosg8.R.inc(54985);Seconds test = Seconds.seconds(26);
        __CLR4_4_1167i167ilgchosg8.R.inc(54986);LocalDateTime date = new LocalDateTime(2006, 6, 1, 0, 0, 0, 0);
        __CLR4_4_1167i167ilgchosg8.R.inc(54987);LocalDateTime expected = new LocalDateTime(2006, 6, 1, 0, 0, 26, 0);
        __CLR4_4_1167i167ilgchosg8.R.inc(54988);assertEquals(expected, date.plus(test));
    }finally{__CLR4_4_1167i167ilgchosg8.R.flushNeeded();}}

}
