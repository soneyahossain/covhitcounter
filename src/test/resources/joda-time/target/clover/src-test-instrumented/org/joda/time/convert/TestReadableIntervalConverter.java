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
package org.joda.time.convert;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInterval;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a JUnit test for ReadableIntervalConverter.
 *
 * @author Stephen Colebourne
 */
public class TestReadableIntervalConverter {static class __CLR4_4_11f2j1f2jlgchosqr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,66310,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11f2j1f2jlgchosqr.R.inc(66187);
        //junit.textui.TestRunner.run(suite());


        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66188);TestReadableIntervalConverter TB = new TestReadableIntervalConverter();

        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66189);TB.setUp();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66190);TB.testSingleton();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66191);TB.tearDown();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66192);TB.setUp();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66193);TB.testSupportedType();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66194);TB.tearDown();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66195);TB.setUp();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66196);TB.testGetDurationMillis_Object();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66197);TB.tearDown();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66198);TB.setUp();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66199);TB.testGetPeriodType_Object();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66200);TB.tearDown();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66201);TB.setUp();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66202);TB.testSetIntoPeriod_Object1();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66203);TB.tearDown();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66204);TB.setUp();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66205);TB.testSetIntoPeriod_Object2();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66206);TB.tearDown();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66207);TB.setUp();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66208);TB.testIsReadableInterval_Object_Chronology();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66209);TB.tearDown();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66210);TB.setUp();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66211);TB.testSetIntoInterval_Object1();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66212);TB.tearDown();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66213);TB.setUp();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66214);TB.testSetIntoInterval_Object2();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66215);TB.tearDown();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66216);TB.setUp();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66217);TB.testSetIntoInterval_Object3();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66218);TB.tearDown();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66219);TB.setUp();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66220);TB.testSetIntoInterval_Object4();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66221);TB.tearDown();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66222);TB.setUp();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66223);TB.testToString();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66224);TB.tearDown();
    }finally{__CLR4_4_11f2j1f2jlgchosqr.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestReadableIntervalConverter.class);
    }

    public TestReadableIntervalConverter(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11f2j1f2jlgchosqr.R.inc(66225);
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66226);JULIAN = JulianChronology.getInstance();
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66227);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_11f2j1f2jlgchosqr.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11f2j1f2jlgchosqr.R.inc(66228);

    }finally{__CLR4_4_11f2j1f2jlgchosqr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSingleton() throws Exception {__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceStart(getClass().getName(),66229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmk8jk1f3p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f2j1f2jlgchosqr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testSingleton",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66229,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmk8jk1f3p() throws Exception{try{__CLR4_4_11f2j1f2jlgchosqr.R.inc(66229);
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66230);Class cls = ReadableIntervalConverter.class;
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66231);assertEquals(false, Modifier.isPublic(cls.getModifiers()));
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66232);assertEquals(false, Modifier.isProtected(cls.getModifiers()));
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66233);assertEquals(false, Modifier.isPrivate(cls.getModifiers()));

        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66234);Constructor con = cls.getDeclaredConstructor((Class[]) null);
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66235);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66236);assertEquals(true, Modifier.isProtected(con.getModifiers()));

        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66237);Field fld = cls.getDeclaredField("INSTANCE");
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66238);assertEquals(false, Modifier.isPublic(fld.getModifiers()));
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66239);assertEquals(false, Modifier.isProtected(fld.getModifiers()));
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66240);assertEquals(false, Modifier.isPrivate(fld.getModifiers()));
    }finally{__CLR4_4_11f2j1f2jlgchosqr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSupportedType() throws Exception {__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceStart(getClass().getName(),66241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fthtzx1f41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f2j1f2jlgchosqr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testSupportedType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fthtzx1f41() throws Exception{try{__CLR4_4_11f2j1f2jlgchosqr.R.inc(66241);
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66242);assertEquals(ReadableInterval.class, ReadableIntervalConverter.INSTANCE.getSupportedType());
    }finally{__CLR4_4_11f2j1f2jlgchosqr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetDurationMillis_Object() throws Exception {__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceStart(getClass().getName(),66243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0aumf1f43();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f2j1f2jlgchosqr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testGetDurationMillis_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0aumf1f43() throws Exception{try{__CLR4_4_11f2j1f2jlgchosqr.R.inc(66243);
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66244);Interval i = new Interval(100L, 223L);
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66245);assertEquals(123L, ReadableIntervalConverter.INSTANCE.getDurationMillis(i));
    }finally{__CLR4_4_11f2j1f2jlgchosqr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetPeriodType_Object() throws Exception {__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceStart(getClass().getName(),66246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nzp2xm1f46();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f2j1f2jlgchosqr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testGetPeriodType_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nzp2xm1f46() throws Exception{try{__CLR4_4_11f2j1f2jlgchosqr.R.inc(66246);
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66247);Interval i = new Interval(100L, 223L);
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66248);assertEquals(PeriodType.standard(),
                ReadableIntervalConverter.INSTANCE.getPeriodType(i));
    }finally{__CLR4_4_11f2j1f2jlgchosqr.R.flushNeeded();}}

    @Test
    public void testSetIntoPeriod_Object1() throws Exception {__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceStart(getClass().getName(),66249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oyzab91f49();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f2j1f2jlgchosqr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testSetIntoPeriod_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oyzab91f49() throws Exception{try{__CLR4_4_11f2j1f2jlgchosqr.R.inc(66249);
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66250);Interval i = new Interval(100L, 223L);
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66251);MutablePeriod m = new MutablePeriod(PeriodType.millis());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66252);ReadableIntervalConverter.INSTANCE.setInto(m, i, null);
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66253);assertEquals(0, m.getYears());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66254);assertEquals(0, m.getMonths());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66255);assertEquals(0, m.getWeeks());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66256);assertEquals(0, m.getDays());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66257);assertEquals(0, m.getHours());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66258);assertEquals(0, m.getMinutes());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66259);assertEquals(0, m.getSeconds());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66260);assertEquals(123, m.getMillis());
    }finally{__CLR4_4_11f2j1f2jlgchosqr.R.flushNeeded();}}

    @Test
    public void testSetIntoPeriod_Object2() throws Exception {__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceStart(getClass().getName(),66261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lpzbis1f4l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f2j1f2jlgchosqr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testSetIntoPeriod_Object2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lpzbis1f4l() throws Exception{try{__CLR4_4_11f2j1f2jlgchosqr.R.inc(66261);
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66262);Interval i = new Interval(100L, 223L);
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66263);MutablePeriod m = new MutablePeriod(PeriodType.millis());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66264);ReadableIntervalConverter.INSTANCE.setInto(m, i, CopticChronology.getInstance());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66265);assertEquals(0, m.getYears());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66266);assertEquals(0, m.getMonths());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66267);assertEquals(0, m.getWeeks());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66268);assertEquals(0, m.getDays());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66269);assertEquals(0, m.getHours());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66270);assertEquals(0, m.getMinutes());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66271);assertEquals(0, m.getSeconds());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66272);assertEquals(123, m.getMillis());
    }finally{__CLR4_4_11f2j1f2jlgchosqr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsReadableInterval_Object_Chronology() throws Exception {__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceStart(getClass().getName(),66273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p8udfz1f4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f2j1f2jlgchosqr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testIsReadableInterval_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p8udfz1f4x() throws Exception{try{__CLR4_4_11f2j1f2jlgchosqr.R.inc(66273);
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66274);Interval i = new Interval(1234L, 5678L);
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66275);assertEquals(true, ReadableIntervalConverter.INSTANCE.isReadableInterval(i, null));
    }finally{__CLR4_4_11f2j1f2jlgchosqr.R.flushNeeded();}}

    @Test
    public void testSetIntoInterval_Object1() throws Exception {__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceStart(getClass().getName(),66276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13hs49b1f50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f2j1f2jlgchosqr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testSetIntoInterval_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13hs49b1f50() throws Exception{try{__CLR4_4_11f2j1f2jlgchosqr.R.inc(66276);
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66277);Interval i = new Interval(0L, 123L, CopticChronology.getInstance());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66278);MutableInterval m = new MutableInterval(-1000L, 1000L, BuddhistChronology.getInstance());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66279);ReadableIntervalConverter.INSTANCE.setInto(m, i, null);
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66280);assertEquals(0L, m.getStartMillis());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66281);assertEquals(123L, m.getEndMillis());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66282);assertEquals(CopticChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_11f2j1f2jlgchosqr.R.flushNeeded();}}

    @Test
    public void testSetIntoInterval_Object2() throws Exception {__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceStart(getClass().getName(),66283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qs31s1f57();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f2j1f2jlgchosqr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testSetIntoInterval_Object2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66283,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qs31s1f57() throws Exception{try{__CLR4_4_11f2j1f2jlgchosqr.R.inc(66283);
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66284);Interval i = new Interval(0L, 123L, CopticChronology.getInstance());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66285);MutableInterval m = new MutableInterval(-1000L, 1000L, BuddhistChronology.getInstance());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66286);ReadableIntervalConverter.INSTANCE.setInto(m, i, GJChronology.getInstance());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66287);assertEquals(0L, m.getStartMillis());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66288);assertEquals(123L, m.getEndMillis());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66289);assertEquals(GJChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_11f2j1f2jlgchosqr.R.flushNeeded();}}

    @Test
    public void testSetIntoInterval_Object3() throws Exception {__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceStart(getClass().getName(),66290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19zs1u91f5e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f2j1f2jlgchosqr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testSetIntoInterval_Object3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19zs1u91f5e() throws Exception{try{__CLR4_4_11f2j1f2jlgchosqr.R.inc(66290);
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66291);MutableInterval i = new MutableInterval(0L, 123L) {
            public Chronology getChronology() {try{__CLR4_4_11f2j1f2jlgchosqr.R.inc(66292);
                __CLR4_4_11f2j1f2jlgchosqr.R.inc(66293);return null; // bad
            }finally{__CLR4_4_11f2j1f2jlgchosqr.R.flushNeeded();}}
        };
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66294);MutableInterval m = new MutableInterval(-1000L, 1000L, BuddhistChronology.getInstance());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66295);ReadableIntervalConverter.INSTANCE.setInto(m, i, GJChronology.getInstance());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66296);assertEquals(0L, m.getStartMillis());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66297);assertEquals(123L, m.getEndMillis());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66298);assertEquals(GJChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_11f2j1f2jlgchosqr.R.flushNeeded();}}

    @Test
    public void testSetIntoInterval_Object4() throws Exception {__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceStart(getClass().getName(),66299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d8s0mq1f5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f2j1f2jlgchosqr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testSetIntoInterval_Object4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d8s0mq1f5n() throws Exception{try{__CLR4_4_11f2j1f2jlgchosqr.R.inc(66299);
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66300);MutableInterval i = new MutableInterval(0L, 123L) {
            public Chronology getChronology() {try{__CLR4_4_11f2j1f2jlgchosqr.R.inc(66301);
                __CLR4_4_11f2j1f2jlgchosqr.R.inc(66302);return null; // bad
            }finally{__CLR4_4_11f2j1f2jlgchosqr.R.flushNeeded();}}
        };
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66303);MutableInterval m = new MutableInterval(-1000L, 1000L, BuddhistChronology.getInstance());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66304);ReadableIntervalConverter.INSTANCE.setInto(m, i, null);
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66305);assertEquals(0L, m.getStartMillis());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66306);assertEquals(123L, m.getEndMillis());
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66307);assertEquals(ISOChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_11f2j1f2jlgchosqr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceStart(getClass().getName(),66308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1f5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f2j1f2jlgchosqr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f2j1f2jlgchosqr.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1f5w(){try{__CLR4_4_11f2j1f2jlgchosqr.R.inc(66308);
        __CLR4_4_11f2j1f2jlgchosqr.R.inc(66309);assertEquals("Converter[org.joda.time.ReadableInterval]", ReadableIntervalConverter.INSTANCE.toString());
    }finally{__CLR4_4_11f2j1f2jlgchosqr.R.flushNeeded();}}

}
