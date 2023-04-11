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
 * This class is a Junit unit test for Years.
 *
 * @author Stephen Colebourne
 */
public class TestYears {static class __CLR4_4_11abs1abslgchoskz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,60277,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) throws Exception {try{__CLR4_4_11abs1abslgchoskz.R.inc(60040);
        __CLR4_4_11abs1abslgchoskz.R.inc(60041);TestYears TB = new TestYears();
        __CLR4_4_11abs1abslgchoskz.R.inc(60042);TB.setUp();
        __CLR4_4_11abs1abslgchoskz.R.inc(60043);TB.testConstants();
        __CLR4_4_11abs1abslgchoskz.R.inc(60044);TB.tearDown();
        __CLR4_4_11abs1abslgchoskz.R.inc(60045);TB.setUp();
        __CLR4_4_11abs1abslgchoskz.R.inc(60046);TB.testFactory_years_int();
        __CLR4_4_11abs1abslgchoskz.R.inc(60047);TB.tearDown();
        __CLR4_4_11abs1abslgchoskz.R.inc(60048);TB.setUp();
        __CLR4_4_11abs1abslgchoskz.R.inc(60049);TB.testFactory_yearsBetween_RInstant();
        __CLR4_4_11abs1abslgchoskz.R.inc(60050);TB.tearDown();
        __CLR4_4_11abs1abslgchoskz.R.inc(60051);TB.setUp();
        __CLR4_4_11abs1abslgchoskz.R.inc(60052);TB.testFactory_yearsBetween_RPartial();
        __CLR4_4_11abs1abslgchoskz.R.inc(60053);TB.tearDown();
        __CLR4_4_11abs1abslgchoskz.R.inc(60054);TB.setUp();
        __CLR4_4_11abs1abslgchoskz.R.inc(60055);TB.testFactory_yearsIn_RInterval();
        __CLR4_4_11abs1abslgchoskz.R.inc(60056);TB.tearDown();
        __CLR4_4_11abs1abslgchoskz.R.inc(60057);TB.setUp();
        __CLR4_4_11abs1abslgchoskz.R.inc(60058);TB.testFactory_parseYears_String();
        __CLR4_4_11abs1abslgchoskz.R.inc(60059);TB.tearDown();
        __CLR4_4_11abs1abslgchoskz.R.inc(60060);TB.setUp();
        __CLR4_4_11abs1abslgchoskz.R.inc(60061);TB.testGetMethods();
        __CLR4_4_11abs1abslgchoskz.R.inc(60062);TB.tearDown();
        __CLR4_4_11abs1abslgchoskz.R.inc(60063);TB.setUp();
        __CLR4_4_11abs1abslgchoskz.R.inc(60064);TB.testGetFieldType();
        __CLR4_4_11abs1abslgchoskz.R.inc(60065);TB.tearDown();
        __CLR4_4_11abs1abslgchoskz.R.inc(60066);TB.setUp();
        __CLR4_4_11abs1abslgchoskz.R.inc(60067);TB.testGetPeriodType();
        __CLR4_4_11abs1abslgchoskz.R.inc(60068);TB.tearDown();
        __CLR4_4_11abs1abslgchoskz.R.inc(60069);TB.setUp();
        __CLR4_4_11abs1abslgchoskz.R.inc(60070);TB.testIsGreaterThan();
        __CLR4_4_11abs1abslgchoskz.R.inc(60071);TB.tearDown();
        __CLR4_4_11abs1abslgchoskz.R.inc(60072);TB.setUp();
        __CLR4_4_11abs1abslgchoskz.R.inc(60073);TB.testIsLessThan();
        __CLR4_4_11abs1abslgchoskz.R.inc(60074);TB.tearDown();
        __CLR4_4_11abs1abslgchoskz.R.inc(60075);TB.setUp();
        __CLR4_4_11abs1abslgchoskz.R.inc(60076);TB.testToString();
        __CLR4_4_11abs1abslgchoskz.R.inc(60077);TB.tearDown();
        __CLR4_4_11abs1abslgchoskz.R.inc(60078);TB.setUp();
        __CLR4_4_11abs1abslgchoskz.R.inc(60079);TB.testSerialization();
        __CLR4_4_11abs1abslgchoskz.R.inc(60080);TB.tearDown();
        __CLR4_4_11abs1abslgchoskz.R.inc(60081);TB.setUp();
        __CLR4_4_11abs1abslgchoskz.R.inc(60082);TB.testPlus_int();
        __CLR4_4_11abs1abslgchoskz.R.inc(60083);TB.tearDown();
        __CLR4_4_11abs1abslgchoskz.R.inc(60084);TB.setUp();
        __CLR4_4_11abs1abslgchoskz.R.inc(60085);TB.testPlus_Years();
        __CLR4_4_11abs1abslgchoskz.R.inc(60086);TB.tearDown();
        __CLR4_4_11abs1abslgchoskz.R.inc(60087);TB.setUp();
        __CLR4_4_11abs1abslgchoskz.R.inc(60088);TB.testMinus_int();
        __CLR4_4_11abs1abslgchoskz.R.inc(60089);TB.tearDown();
        __CLR4_4_11abs1abslgchoskz.R.inc(60090);TB.setUp();
        __CLR4_4_11abs1abslgchoskz.R.inc(60091);TB.testMinus_Years();
        __CLR4_4_11abs1abslgchoskz.R.inc(60092);TB.tearDown();
        __CLR4_4_11abs1abslgchoskz.R.inc(60093);TB.setUp();
        __CLR4_4_11abs1abslgchoskz.R.inc(60094);TB.testMultipliedBy_int();
        __CLR4_4_11abs1abslgchoskz.R.inc(60095);TB.tearDown();
        __CLR4_4_11abs1abslgchoskz.R.inc(60096);TB.setUp();
        __CLR4_4_11abs1abslgchoskz.R.inc(60097);TB.testDividedBy_int();
        __CLR4_4_11abs1abslgchoskz.R.inc(60098);TB.tearDown();
        __CLR4_4_11abs1abslgchoskz.R.inc(60099);TB.setUp();
        __CLR4_4_11abs1abslgchoskz.R.inc(60100);TB.testNegated();
        __CLR4_4_11abs1abslgchoskz.R.inc(60101);TB.tearDown();
        __CLR4_4_11abs1abslgchoskz.R.inc(60102);TB.setUp();
        __CLR4_4_11abs1abslgchoskz.R.inc(60103);TB.testAddToLocalDate();
        __CLR4_4_11abs1abslgchoskz.R.inc(60104);TB.tearDown();

    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

/*
    public static TestSuite suite() {
        return new TestSuite(TestYears.class);
    }

    public TestYears(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11abs1abslgchoskz.R.inc(60105);
    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11abs1abslgchoskz.R.inc(60106);
    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstants() {__CLR4_4_11abs1abslgchoskz.R.globalSliceStart(getClass().getName(),60107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15epzlw1adn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11abs1abslgchoskz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11abs1abslgchoskz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testConstants",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15epzlw1adn(){try{__CLR4_4_11abs1abslgchoskz.R.inc(60107);

        __CLR4_4_11abs1abslgchoskz.R.inc(60108);assertEquals(0, Years.ZERO.getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60109);assertEquals(1, Years.ONE.getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60110);assertEquals(2, Years.TWO.getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60111);assertEquals(3, Years.THREE.getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60112);assertEquals(Integer.MAX_VALUE, Years.MAX_VALUE.getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60113);assertEquals(Integer.MIN_VALUE, Years.MIN_VALUE.getYears());
    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_years_int() {__CLR4_4_11abs1abslgchoskz.R.globalSliceStart(getClass().getName(),60114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iu2va1adu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11abs1abslgchoskz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11abs1abslgchoskz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_years_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iu2va1adu(){try{__CLR4_4_11abs1abslgchoskz.R.inc(60114);
        __CLR4_4_11abs1abslgchoskz.R.inc(60115);assertSame(Years.ZERO, Years.years(0));
        __CLR4_4_11abs1abslgchoskz.R.inc(60116);assertSame(Years.ONE, Years.years(1));
        __CLR4_4_11abs1abslgchoskz.R.inc(60117);assertSame(Years.TWO, Years.years(2));
        __CLR4_4_11abs1abslgchoskz.R.inc(60118);assertSame(Years.THREE, Years.years(3));
        __CLR4_4_11abs1abslgchoskz.R.inc(60119);assertSame(Years.MAX_VALUE, Years.years(Integer.MAX_VALUE));
        __CLR4_4_11abs1abslgchoskz.R.inc(60120);assertSame(Years.MIN_VALUE, Years.years(Integer.MIN_VALUE));
        __CLR4_4_11abs1abslgchoskz.R.inc(60121);assertEquals(-1, Years.years(-1).getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60122);assertEquals(4, Years.years(4).getYears());
    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_yearsBetween_RInstant() {__CLR4_4_11abs1abslgchoskz.R.globalSliceStart(getClass().getName(),60123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t79c8s1ae3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11abs1abslgchoskz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11abs1abslgchoskz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_yearsBetween_RInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t79c8s1ae3(){try{__CLR4_4_11abs1abslgchoskz.R.inc(60123);
        __CLR4_4_11abs1abslgchoskz.R.inc(60124);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_11abs1abslgchoskz.R.inc(60125);DateTime end1 = new DateTime(2009, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_11abs1abslgchoskz.R.inc(60126);DateTime end2 = new DateTime(2012, 6, 9, 12, 0, 0, 0, PARIS);

        __CLR4_4_11abs1abslgchoskz.R.inc(60127);assertEquals(3, Years.yearsBetween(start, end1).getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60128);assertEquals(0, Years.yearsBetween(start, start).getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60129);assertEquals(0, Years.yearsBetween(end1, end1).getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60130);assertEquals(-3, Years.yearsBetween(end1, start).getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60131);assertEquals(6, Years.yearsBetween(start, end2).getYears());
    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testFactory_yearsBetween_RPartial() {__CLR4_4_11abs1abslgchoskz.R.globalSliceStart(getClass().getName(),60132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pcr19g1aec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11abs1abslgchoskz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11abs1abslgchoskz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_yearsBetween_RPartial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pcr19g1aec(){try{__CLR4_4_11abs1abslgchoskz.R.inc(60132);
        __CLR4_4_11abs1abslgchoskz.R.inc(60133);LocalDate start = new LocalDate(2006, 6, 9);
        __CLR4_4_11abs1abslgchoskz.R.inc(60134);LocalDate end1 = new LocalDate(2009, 6, 9);
        __CLR4_4_11abs1abslgchoskz.R.inc(60135);YearMonthDay end2 = new YearMonthDay(2012, 6, 9);

        __CLR4_4_11abs1abslgchoskz.R.inc(60136);assertEquals(3, Years.yearsBetween(start, end1).getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60137);assertEquals(0, Years.yearsBetween(start, start).getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60138);assertEquals(0, Years.yearsBetween(end1, end1).getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60139);assertEquals(-3, Years.yearsBetween(end1, start).getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60140);assertEquals(6, Years.yearsBetween(start, end2).getYears());
    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

    @Test
    public void testFactory_yearsIn_RInterval() {__CLR4_4_11abs1abslgchoskz.R.globalSliceStart(getClass().getName(),60141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d3db0t1ael();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11abs1abslgchoskz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11abs1abslgchoskz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_yearsIn_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d3db0t1ael(){try{__CLR4_4_11abs1abslgchoskz.R.inc(60141);
        __CLR4_4_11abs1abslgchoskz.R.inc(60142);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_11abs1abslgchoskz.R.inc(60143);DateTime end1 = new DateTime(2009, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_11abs1abslgchoskz.R.inc(60144);DateTime end2 = new DateTime(2012, 6, 9, 12, 0, 0, 0, PARIS);

        __CLR4_4_11abs1abslgchoskz.R.inc(60145);assertEquals(0, Years.yearsIn((ReadableInterval) null).getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60146);assertEquals(3, Years.yearsIn(new Interval(start, end1)).getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60147);assertEquals(0, Years.yearsIn(new Interval(start, start)).getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60148);assertEquals(0, Years.yearsIn(new Interval(end1, end1)).getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60149);assertEquals(6, Years.yearsIn(new Interval(start, end2)).getYears());
    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

    @Test
    public void testFactory_parseYears_String() {__CLR4_4_11abs1abslgchoskz.R.globalSliceStart(getClass().getName(),60150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmswml1aeu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11abs1abslgchoskz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11abs1abslgchoskz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_parseYears_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmswml1aeu(){try{__CLR4_4_11abs1abslgchoskz.R.inc(60150);
        __CLR4_4_11abs1abslgchoskz.R.inc(60151);assertEquals(0, Years.parseYears((String) null).getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60152);assertEquals(0, Years.parseYears("P0Y").getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60153);assertEquals(1, Years.parseYears("P1Y").getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60154);assertEquals(-3, Years.parseYears("P-3Y").getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60155);assertEquals(2, Years.parseYears("P2Y0M").getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60156);assertEquals(2, Years.parseYears("P2YT0H0M").getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60157);try {
            __CLR4_4_11abs1abslgchoskz.R.inc(60158);Years.parseYears("P1M1D");
            __CLR4_4_11abs1abslgchoskz.R.inc(60159);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_11abs1abslgchoskz.R.inc(60160);try {
            __CLR4_4_11abs1abslgchoskz.R.inc(60161);Years.parseYears("P1YT1H");
            __CLR4_4_11abs1abslgchoskz.R.inc(60162);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetMethods() {__CLR4_4_11abs1abslgchoskz.R.globalSliceStart(getClass().getName(),60163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sjdmz1af7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11abs1abslgchoskz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11abs1abslgchoskz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testGetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60163,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sjdmz1af7(){try{__CLR4_4_11abs1abslgchoskz.R.inc(60163);
        __CLR4_4_11abs1abslgchoskz.R.inc(60164);Years test = Years.years(20);
        __CLR4_4_11abs1abslgchoskz.R.inc(60165);assertEquals(20, test.getYears());
    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

    @Test
    public void testGetFieldType() {__CLR4_4_11abs1abslgchoskz.R.globalSliceStart(getClass().getName(),60166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mv1afa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11abs1abslgchoskz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11abs1abslgchoskz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mv1afa(){try{__CLR4_4_11abs1abslgchoskz.R.inc(60166);
        __CLR4_4_11abs1abslgchoskz.R.inc(60167);Years test = Years.years(20);
        __CLR4_4_11abs1abslgchoskz.R.inc(60168);assertEquals(DurationFieldType.years(), test.getFieldType());
    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

    @Test
    public void testGetPeriodType() {__CLR4_4_11abs1abslgchoskz.R.globalSliceStart(getClass().getName(),60169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivat1i1afd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11abs1abslgchoskz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11abs1abslgchoskz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testGetPeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivat1i1afd(){try{__CLR4_4_11abs1abslgchoskz.R.inc(60169);
        __CLR4_4_11abs1abslgchoskz.R.inc(60170);Years test = Years.years(20);
        __CLR4_4_11abs1abslgchoskz.R.inc(60171);assertEquals(PeriodType.years(), test.getPeriodType());
    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsGreaterThan() {__CLR4_4_11abs1abslgchoskz.R.globalSliceStart(getClass().getName(),60172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5pnom1afg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11abs1abslgchoskz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11abs1abslgchoskz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testIsGreaterThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60172,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5pnom1afg(){try{__CLR4_4_11abs1abslgchoskz.R.inc(60172);
        __CLR4_4_11abs1abslgchoskz.R.inc(60173);assertEquals(true, Years.THREE.isGreaterThan(Years.TWO));
        __CLR4_4_11abs1abslgchoskz.R.inc(60174);assertEquals(false, Years.THREE.isGreaterThan(Years.THREE));
        __CLR4_4_11abs1abslgchoskz.R.inc(60175);assertEquals(false, Years.TWO.isGreaterThan(Years.THREE));
        __CLR4_4_11abs1abslgchoskz.R.inc(60176);assertEquals(true, Years.ONE.isGreaterThan(null));
        __CLR4_4_11abs1abslgchoskz.R.inc(60177);assertEquals(false, Years.years(-1).isGreaterThan(null));
    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

    @Test
    public void testIsLessThan() {__CLR4_4_11abs1abslgchoskz.R.globalSliceStart(getClass().getName(),60178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmk0kd1afm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11abs1abslgchoskz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11abs1abslgchoskz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testIsLessThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmk0kd1afm(){try{__CLR4_4_11abs1abslgchoskz.R.inc(60178);
        __CLR4_4_11abs1abslgchoskz.R.inc(60179);assertEquals(false, Years.THREE.isLessThan(Years.TWO));
        __CLR4_4_11abs1abslgchoskz.R.inc(60180);assertEquals(false, Years.THREE.isLessThan(Years.THREE));
        __CLR4_4_11abs1abslgchoskz.R.inc(60181);assertEquals(true, Years.TWO.isLessThan(Years.THREE));
        __CLR4_4_11abs1abslgchoskz.R.inc(60182);assertEquals(false, Years.ONE.isLessThan(null));
        __CLR4_4_11abs1abslgchoskz.R.inc(60183);assertEquals(true, Years.years(-1).isLessThan(null));
    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_11abs1abslgchoskz.R.globalSliceStart(getClass().getName(),60184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1afs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11abs1abslgchoskz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11abs1abslgchoskz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1afs(){try{__CLR4_4_11abs1abslgchoskz.R.inc(60184);
        __CLR4_4_11abs1abslgchoskz.R.inc(60185);Years test = Years.years(20);
        __CLR4_4_11abs1abslgchoskz.R.inc(60186);assertEquals("P20Y", test.toString());

        __CLR4_4_11abs1abslgchoskz.R.inc(60187);test = Years.years(-20);
        __CLR4_4_11abs1abslgchoskz.R.inc(60188);assertEquals("P-20Y", test.toString());
    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_11abs1abslgchoskz.R.globalSliceStart(getClass().getName(),60189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on91afx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11abs1abslgchoskz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11abs1abslgchoskz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on91afx() throws Exception{try{__CLR4_4_11abs1abslgchoskz.R.inc(60189);
        __CLR4_4_11abs1abslgchoskz.R.inc(60190);Years test = Years.THREE;

        __CLR4_4_11abs1abslgchoskz.R.inc(60191);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_11abs1abslgchoskz.R.inc(60192);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_11abs1abslgchoskz.R.inc(60193);oos.writeObject(test);
        __CLR4_4_11abs1abslgchoskz.R.inc(60194);oos.close();
        __CLR4_4_11abs1abslgchoskz.R.inc(60195);byte[] bytes = baos.toByteArray();

        __CLR4_4_11abs1abslgchoskz.R.inc(60196);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_11abs1abslgchoskz.R.inc(60197);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_11abs1abslgchoskz.R.inc(60198);Years result = (Years) ois.readObject();
        __CLR4_4_11abs1abslgchoskz.R.inc(60199);ois.close();

        __CLR4_4_11abs1abslgchoskz.R.inc(60200);assertSame(test, result);
    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPlus_int() {__CLR4_4_11abs1abslgchoskz.R.globalSliceStart(getClass().getName(),60201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1scc4eb1ag9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11abs1abslgchoskz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11abs1abslgchoskz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testPlus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60201,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1scc4eb1ag9(){try{__CLR4_4_11abs1abslgchoskz.R.inc(60201);
        __CLR4_4_11abs1abslgchoskz.R.inc(60202);Years test2 = Years.years(2);
        __CLR4_4_11abs1abslgchoskz.R.inc(60203);Years result = test2.plus(3);
        __CLR4_4_11abs1abslgchoskz.R.inc(60204);assertEquals(2, test2.getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60205);assertEquals(5, result.getYears());

        __CLR4_4_11abs1abslgchoskz.R.inc(60206);assertEquals(1, Years.ONE.plus(0).getYears());

        __CLR4_4_11abs1abslgchoskz.R.inc(60207);try {
            __CLR4_4_11abs1abslgchoskz.R.inc(60208);Years.MAX_VALUE.plus(1);
            __CLR4_4_11abs1abslgchoskz.R.inc(60209);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

    @Test
    public void testPlus_Years() {__CLR4_4_11abs1abslgchoskz.R.globalSliceStart(getClass().getName(),60210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vdjml21agi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11abs1abslgchoskz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11abs1abslgchoskz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testPlus_Years",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vdjml21agi(){try{__CLR4_4_11abs1abslgchoskz.R.inc(60210);
        __CLR4_4_11abs1abslgchoskz.R.inc(60211);Years test2 = Years.years(2);
        __CLR4_4_11abs1abslgchoskz.R.inc(60212);Years test3 = Years.years(3);
        __CLR4_4_11abs1abslgchoskz.R.inc(60213);Years result = test2.plus(test3);
        __CLR4_4_11abs1abslgchoskz.R.inc(60214);assertEquals(2, test2.getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60215);assertEquals(3, test3.getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60216);assertEquals(5, result.getYears());

        __CLR4_4_11abs1abslgchoskz.R.inc(60217);assertEquals(1, Years.ONE.plus(Years.ZERO).getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60218);assertEquals(1, Years.ONE.plus((Years) null).getYears());

        __CLR4_4_11abs1abslgchoskz.R.inc(60219);try {
            __CLR4_4_11abs1abslgchoskz.R.inc(60220);Years.MAX_VALUE.plus(Years.ONE);
            __CLR4_4_11abs1abslgchoskz.R.inc(60221);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

    @Test
    public void testMinus_int() {__CLR4_4_11abs1abslgchoskz.R.globalSliceStart(getClass().getName(),60222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118wkvp1agu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11abs1abslgchoskz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11abs1abslgchoskz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testMinus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60222,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118wkvp1agu(){try{__CLR4_4_11abs1abslgchoskz.R.inc(60222);
        __CLR4_4_11abs1abslgchoskz.R.inc(60223);Years test2 = Years.years(2);
        __CLR4_4_11abs1abslgchoskz.R.inc(60224);Years result = test2.minus(3);
        __CLR4_4_11abs1abslgchoskz.R.inc(60225);assertEquals(2, test2.getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60226);assertEquals(-1, result.getYears());

        __CLR4_4_11abs1abslgchoskz.R.inc(60227);assertEquals(1, Years.ONE.minus(0).getYears());

        __CLR4_4_11abs1abslgchoskz.R.inc(60228);try {
            __CLR4_4_11abs1abslgchoskz.R.inc(60229);Years.MIN_VALUE.minus(1);
            __CLR4_4_11abs1abslgchoskz.R.inc(60230);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

    @Test
    public void testMinus_Years() {__CLR4_4_11abs1abslgchoskz.R.globalSliceStart(getClass().getName(),60231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11n3hgk1ah3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11abs1abslgchoskz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11abs1abslgchoskz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testMinus_Years",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11n3hgk1ah3(){try{__CLR4_4_11abs1abslgchoskz.R.inc(60231);
        __CLR4_4_11abs1abslgchoskz.R.inc(60232);Years test2 = Years.years(2);
        __CLR4_4_11abs1abslgchoskz.R.inc(60233);Years test3 = Years.years(3);
        __CLR4_4_11abs1abslgchoskz.R.inc(60234);Years result = test2.minus(test3);
        __CLR4_4_11abs1abslgchoskz.R.inc(60235);assertEquals(2, test2.getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60236);assertEquals(3, test3.getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60237);assertEquals(-1, result.getYears());

        __CLR4_4_11abs1abslgchoskz.R.inc(60238);assertEquals(1, Years.ONE.minus(Years.ZERO).getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60239);assertEquals(1, Years.ONE.minus((Years) null).getYears());

        __CLR4_4_11abs1abslgchoskz.R.inc(60240);try {
            __CLR4_4_11abs1abslgchoskz.R.inc(60241);Years.MIN_VALUE.minus(Years.ONE);
            __CLR4_4_11abs1abslgchoskz.R.inc(60242);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

    @Test
    public void testMultipliedBy_int() {__CLR4_4_11abs1abslgchoskz.R.globalSliceStart(getClass().getName(),60243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1szpsdp1ahf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11abs1abslgchoskz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11abs1abslgchoskz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testMultipliedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1szpsdp1ahf(){try{__CLR4_4_11abs1abslgchoskz.R.inc(60243);
        __CLR4_4_11abs1abslgchoskz.R.inc(60244);Years test = Years.years(2);
        __CLR4_4_11abs1abslgchoskz.R.inc(60245);assertEquals(6, test.multipliedBy(3).getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60246);assertEquals(2, test.getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60247);assertEquals(-6, test.multipliedBy(-3).getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60248);assertSame(test, test.multipliedBy(1));

        __CLR4_4_11abs1abslgchoskz.R.inc(60249);Years halfMax = Years.years(Integer.MAX_VALUE / 2 + 1);
        __CLR4_4_11abs1abslgchoskz.R.inc(60250);try {
            __CLR4_4_11abs1abslgchoskz.R.inc(60251);halfMax.multipliedBy(2);
            __CLR4_4_11abs1abslgchoskz.R.inc(60252);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

    @Test
    public void testDividedBy_int() {__CLR4_4_11abs1abslgchoskz.R.globalSliceStart(getClass().getName(),60253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9i8qv1ahp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11abs1abslgchoskz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11abs1abslgchoskz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testDividedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9i8qv1ahp(){try{__CLR4_4_11abs1abslgchoskz.R.inc(60253);
        __CLR4_4_11abs1abslgchoskz.R.inc(60254);Years test = Years.years(12);
        __CLR4_4_11abs1abslgchoskz.R.inc(60255);assertEquals(6, test.dividedBy(2).getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60256);assertEquals(12, test.getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60257);assertEquals(4, test.dividedBy(3).getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60258);assertEquals(3, test.dividedBy(4).getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60259);assertEquals(2, test.dividedBy(5).getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60260);assertEquals(2, test.dividedBy(6).getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60261);assertSame(test, test.dividedBy(1));

        __CLR4_4_11abs1abslgchoskz.R.inc(60262);try {
            __CLR4_4_11abs1abslgchoskz.R.inc(60263);Years.ONE.dividedBy(0);
            __CLR4_4_11abs1abslgchoskz.R.inc(60264);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

    @Test
    public void testNegated() {__CLR4_4_11abs1abslgchoskz.R.globalSliceStart(getClass().getName(),60265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av33071ai1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11abs1abslgchoskz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11abs1abslgchoskz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testNegated",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av33071ai1(){try{__CLR4_4_11abs1abslgchoskz.R.inc(60265);
        __CLR4_4_11abs1abslgchoskz.R.inc(60266);Years test = Years.years(12);
        __CLR4_4_11abs1abslgchoskz.R.inc(60267);assertEquals(-12, test.negated().getYears());
        __CLR4_4_11abs1abslgchoskz.R.inc(60268);assertEquals(12, test.getYears());

        __CLR4_4_11abs1abslgchoskz.R.inc(60269);try {
            __CLR4_4_11abs1abslgchoskz.R.inc(60270);Years.MIN_VALUE.negated();
            __CLR4_4_11abs1abslgchoskz.R.inc(60271);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddToLocalDate() {__CLR4_4_11abs1abslgchoskz.R.globalSliceStart(getClass().getName(),60272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thm5yu1ai8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11abs1abslgchoskz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11abs1abslgchoskz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testAddToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thm5yu1ai8(){try{__CLR4_4_11abs1abslgchoskz.R.inc(60272);
        __CLR4_4_11abs1abslgchoskz.R.inc(60273);Years test = Years.years(3);
        __CLR4_4_11abs1abslgchoskz.R.inc(60274);LocalDate date = new LocalDate(2006, 6, 1);
        __CLR4_4_11abs1abslgchoskz.R.inc(60275);LocalDate expected = new LocalDate(2009, 6, 1);
        __CLR4_4_11abs1abslgchoskz.R.inc(60276);assertEquals(expected, date.plus(test));
    }finally{__CLR4_4_11abs1abslgchoskz.R.flushNeeded();}}

}
