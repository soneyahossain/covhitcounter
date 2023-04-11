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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.convert.StringConvert;
import org.joda.time.chrono.ISOChronology;

/**
 * Test string conversion.
 *
 * @author Stephen Colebourne
 */
public class TestStringConvert {static class __CLR4_4_116lw16lwlgchosgl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,55384,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone ZONE = DateTimeZone.forID("+02:00");

    public static void main(String[] args) throws Exception {try{__CLR4_4_116lw16lwlgchosgl.R.inc(55220);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55221);TestStringConvert TB = new TestStringConvert();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55222);TB.setUp();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55223);TB.testDateMidnight();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55224);TB.tearDown();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55225);TB.setUp();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55226);TB.testDateTime();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55227);TB.tearDown();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55228);TB.setUp();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55229);TB.testMutableDateTime();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55230);TB.tearDown();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55231);TB.setUp();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55232);TB.testLocalDateTime();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55233);TB.tearDown();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55234);TB.setUp();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55235);TB.testLocalDate();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55236);TB.tearDown();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55237);TB.setUp();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55238);TB.testLocalTime();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55239);TB.tearDown();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55240);TB.setUp();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55241);TB.testYearMonth();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55242);TB.tearDown();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55243);TB.setUp();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55244);TB.testMonthDay();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55245);TB.tearDown();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55246);TB.setUp();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55247);TB.testMonthDay_leapDay();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55248);TB.tearDown();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55249);TB.setUp();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55250);TB.testTimeZone();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55251);TB.tearDown();
//    TB.setUp(); TB.testInterval(); TB.tearDown();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55252);TB.setUp();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55253);TB.testDuration();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55254);TB.tearDown();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55255);TB.setUp();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55256);TB.testPeriod();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55257);TB.tearDown();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55258);TB.setUp();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55259);TB.testMutablePeriod();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55260);TB.tearDown();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55261);TB.setUp();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55262);TB.testYears();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55263);TB.tearDown();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55264);TB.setUp();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55265);TB.testMonths();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55266);TB.tearDown();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55267);TB.setUp();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55268);TB.testWeeks();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55269);TB.tearDown();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55270);TB.setUp();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55271);TB.testDays();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55272);TB.tearDown();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55273);TB.setUp();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55274);TB.testHours();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55275);TB.tearDown();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55276);TB.setUp();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55277);TB.testMinutes();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55278);TB.tearDown();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55279);TB.setUp();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55280);TB.testSeconds();
        __CLR4_4_116lw16lwlgchosgl.R.inc(55281);TB.tearDown();

    }finally{__CLR4_4_116lw16lwlgchosgl.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestStringConvert.class);
    }

    public TestStringConvert(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_116lw16lwlgchosgl.R.inc(55282);
    }finally{__CLR4_4_116lw16lwlgchosgl.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_116lw16lwlgchosgl.R.inc(55283);
    }finally{__CLR4_4_116lw16lwlgchosgl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testDateMidnight() {__CLR4_4_116lw16lwlgchosgl.R.globalSliceStart(getClass().getName(),55284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m65my116no();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116lw16lwlgchosgl.R.rethrow($CLV_t2$);}finally{__CLR4_4_116lw16lwlgchosgl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testDateMidnight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m65my116no(){try{__CLR4_4_116lw16lwlgchosgl.R.inc(55284);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55285);DateMidnight test = new DateMidnight(2010, 6, 30, ISOChronology.getInstance(ZONE));
        __CLR4_4_116lw16lwlgchosgl.R.inc(55286);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55287);assertEquals("2010-06-30T00:00:00.000+02:00", str);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55288);assertEquals(test, StringConvert.INSTANCE.convertFromString(DateMidnight.class, str));
    }finally{__CLR4_4_116lw16lwlgchosgl.R.flushNeeded();}}

    @Test
    public void testDateTime() {__CLR4_4_116lw16lwlgchosgl.R.globalSliceStart(getClass().getName(),55289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jx9slo16nt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116lw16lwlgchosgl.R.rethrow($CLV_t2$);}finally{__CLR4_4_116lw16lwlgchosgl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55289,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jx9slo16nt(){try{__CLR4_4_116lw16lwlgchosgl.R.inc(55289);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55290);DateTime test = new DateTime(2010, 6, 30, 2, 30, 50, 678, ISOChronology.getInstance(ZONE));
        __CLR4_4_116lw16lwlgchosgl.R.inc(55291);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55292);assertEquals("2010-06-30T02:30:50.678+02:00", str);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55293);assertEquals(test, StringConvert.INSTANCE.convertFromString(DateTime.class, str));
    }finally{__CLR4_4_116lw16lwlgchosgl.R.flushNeeded();}}

    @Test
    public void testMutableDateTime() {__CLR4_4_116lw16lwlgchosgl.R.globalSliceStart(getClass().getName(),55294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rdx1li16ny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116lw16lwlgchosgl.R.rethrow($CLV_t2$);}finally{__CLR4_4_116lw16lwlgchosgl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMutableDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55294,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rdx1li16ny(){try{__CLR4_4_116lw16lwlgchosgl.R.inc(55294);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55295);MutableDateTime test = new MutableDateTime(2010, 6, 30, 2, 30, 50, 678, ISOChronology.getInstance(ZONE));
        __CLR4_4_116lw16lwlgchosgl.R.inc(55296);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55297);assertEquals("2010-06-30T02:30:50.678+02:00", str);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55298);assertEquals(test, StringConvert.INSTANCE.convertFromString(MutableDateTime.class, str));
    }finally{__CLR4_4_116lw16lwlgchosgl.R.flushNeeded();}}

    @Test
    public void testLocalDateTime() {__CLR4_4_116lw16lwlgchosgl.R.globalSliceStart(getClass().getName(),55299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qh5x1h16o3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116lw16lwlgchosgl.R.rethrow($CLV_t2$);}finally{__CLR4_4_116lw16lwlgchosgl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testLocalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qh5x1h16o3(){try{__CLR4_4_116lw16lwlgchosgl.R.inc(55299);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55300);LocalDateTime test = new LocalDateTime(2010, 6, 30, 2, 30);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55301);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55302);assertEquals("2010-06-30T02:30:00.000", str);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55303);assertEquals(test, StringConvert.INSTANCE.convertFromString(LocalDateTime.class, str));
    }finally{__CLR4_4_116lw16lwlgchosgl.R.flushNeeded();}}

    @Test
    public void testLocalDate() {__CLR4_4_116lw16lwlgchosgl.R.globalSliceStart(getClass().getName(),55304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18pi2616o8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116lw16lwlgchosgl.R.rethrow($CLV_t2$);}finally{__CLR4_4_116lw16lwlgchosgl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55304,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18pi2616o8(){try{__CLR4_4_116lw16lwlgchosgl.R.inc(55304);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55305);LocalDate test = new LocalDate(2010, 6, 30);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55306);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55307);assertEquals("2010-06-30", str);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55308);assertEquals(test, StringConvert.INSTANCE.convertFromString(LocalDate.class, str));
    }finally{__CLR4_4_116lw16lwlgchosgl.R.flushNeeded();}}

    @Test
    public void testLocalTime() {__CLR4_4_116lw16lwlgchosgl.R.globalSliceStart(getClass().getName(),55309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_155xxcj16od();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116lw16lwlgchosgl.R.rethrow($CLV_t2$);}finally{__CLR4_4_116lw16lwlgchosgl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testLocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55309,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_155xxcj16od(){try{__CLR4_4_116lw16lwlgchosgl.R.inc(55309);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55310);LocalTime test = new LocalTime(2, 30, 50, 678);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55311);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55312);assertEquals("02:30:50.678", str);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55313);assertEquals(test, StringConvert.INSTANCE.convertFromString(LocalTime.class, str));
    }finally{__CLR4_4_116lw16lwlgchosgl.R.flushNeeded();}}

    @Test
    public void testYearMonth() {__CLR4_4_116lw16lwlgchosgl.R.globalSliceStart(getClass().getName(),55314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16cgzc16oi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116lw16lwlgchosgl.R.rethrow($CLV_t2$);}finally{__CLR4_4_116lw16lwlgchosgl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testYearMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16cgzc16oi(){try{__CLR4_4_116lw16lwlgchosgl.R.inc(55314);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55315);YearMonth test = new YearMonth(2010, 6);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55316);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55317);assertEquals("2010-06", str);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55318);assertEquals(test, StringConvert.INSTANCE.convertFromString(YearMonth.class, str));
    }finally{__CLR4_4_116lw16lwlgchosgl.R.flushNeeded();}}

    @Test
    public void testMonthDay() {__CLR4_4_116lw16lwlgchosgl.R.globalSliceStart(getClass().getName(),55319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1era7yj16on();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116lw16lwlgchosgl.R.rethrow($CLV_t2$);}finally{__CLR4_4_116lw16lwlgchosgl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMonthDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1era7yj16on(){try{__CLR4_4_116lw16lwlgchosgl.R.inc(55319);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55320);MonthDay test = new MonthDay(6, 30);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55321);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55322);assertEquals("--06-30", str);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55323);assertEquals(test, StringConvert.INSTANCE.convertFromString(MonthDay.class, str));
    }finally{__CLR4_4_116lw16lwlgchosgl.R.flushNeeded();}}

    @Test
    public void testMonthDay_leapDay() {__CLR4_4_116lw16lwlgchosgl.R.globalSliceStart(getClass().getName(),55324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18x3yi216os();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116lw16lwlgchosgl.R.rethrow($CLV_t2$);}finally{__CLR4_4_116lw16lwlgchosgl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMonthDay_leapDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18x3yi216os(){try{__CLR4_4_116lw16lwlgchosgl.R.inc(55324);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55325);MonthDay test = new MonthDay(2, 29);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55326);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55327);assertEquals("--02-29", str);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55328);assertEquals(test, StringConvert.INSTANCE.convertFromString(MonthDay.class, str));
    }finally{__CLR4_4_116lw16lwlgchosgl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTimeZone() {__CLR4_4_116lw16lwlgchosgl.R.globalSliceStart(getClass().getName(),55329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iwcgni16ox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116lw16lwlgchosgl.R.rethrow($CLV_t2$);}finally{__CLR4_4_116lw16lwlgchosgl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iwcgni16ox(){try{__CLR4_4_116lw16lwlgchosgl.R.inc(55329);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55330);DateTimeZone test = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_116lw16lwlgchosgl.R.inc(55331);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55332);assertEquals("Europe/Paris", str);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55333);assertEquals(test, StringConvert.INSTANCE.convertFromString(DateTimeZone.class, str));
    }finally{__CLR4_4_116lw16lwlgchosgl.R.flushNeeded();}}

//    @Test public void testInterval() {
//        DateTime a = new DateTime(2010, 6, 30, 2, 30, 50, 678, ISOChronology.getInstance(ZONE));
//        DateTime b = new DateTime(2011, 9, 10, 4, 20, 40, 234, ISOChronology.getInstance(ZONE));
//        Interval test = new Interval(a, b);
//        String str = StringConvert.INSTANCE.convertToString(test);
//        assertEquals("2010-06-30T02:30:50.678+02:00/2011-09-10T04:20:40.234+02:00", str);
//        assertEquals(test, StringConvert.INSTANCE.convertFromString(Interval.class, str));
//    }

    @Test
    public void testDuration() {__CLR4_4_116lw16lwlgchosgl.R.globalSliceStart(getClass().getName(),55334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gv0z0316p2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116lw16lwlgchosgl.R.rethrow($CLV_t2$);}finally{__CLR4_4_116lw16lwlgchosgl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55334,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gv0z0316p2(){try{__CLR4_4_116lw16lwlgchosgl.R.inc(55334);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55335);Duration test = new Duration(12345678L);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55336);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55337);assertEquals("PT12345.678S", str);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55338);assertEquals(test, StringConvert.INSTANCE.convertFromString(Duration.class, str));
    }finally{__CLR4_4_116lw16lwlgchosgl.R.flushNeeded();}}

    @Test
    public void testPeriod() {__CLR4_4_116lw16lwlgchosgl.R.globalSliceStart(getClass().getName(),55339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w8wo2i16p7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116lw16lwlgchosgl.R.rethrow($CLV_t2$);}finally{__CLR4_4_116lw16lwlgchosgl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w8wo2i16p7(){try{__CLR4_4_116lw16lwlgchosgl.R.inc(55339);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55340);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55341);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55342);assertEquals("P1Y2M3W4DT5H6M7.008S", str);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55343);assertEquals(test, StringConvert.INSTANCE.convertFromString(Period.class, str));
    }finally{__CLR4_4_116lw16lwlgchosgl.R.flushNeeded();}}

    @Test
    public void testMutablePeriod() {__CLR4_4_116lw16lwlgchosgl.R.globalSliceStart(getClass().getName(),55344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w2p3gc16pc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116lw16lwlgchosgl.R.rethrow($CLV_t2$);}finally{__CLR4_4_116lw16lwlgchosgl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMutablePeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w2p3gc16pc(){try{__CLR4_4_116lw16lwlgchosgl.R.inc(55344);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55345);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55346);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55347);assertEquals("P1Y2M3W4DT5H6M7.008S", str);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55348);assertEquals(test, StringConvert.INSTANCE.convertFromString(MutablePeriod.class, str));
    }finally{__CLR4_4_116lw16lwlgchosgl.R.flushNeeded();}}

    @Test
    public void testYears() {__CLR4_4_116lw16lwlgchosgl.R.globalSliceStart(getClass().getName(),55349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nq13v916ph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116lw16lwlgchosgl.R.rethrow($CLV_t2$);}finally{__CLR4_4_116lw16lwlgchosgl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nq13v916ph(){try{__CLR4_4_116lw16lwlgchosgl.R.inc(55349);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55350);Years test = Years.years(5);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55351);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55352);assertEquals("P5Y", str);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55353);assertEquals(test, StringConvert.INSTANCE.convertFromString(Years.class, str));
    }finally{__CLR4_4_116lw16lwlgchosgl.R.flushNeeded();}}

    @Test
    public void testMonths() {__CLR4_4_116lw16lwlgchosgl.R.globalSliceStart(getClass().getName(),55354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bildmc16pm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116lw16lwlgchosgl.R.rethrow($CLV_t2$);}finally{__CLR4_4_116lw16lwlgchosgl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bildmc16pm(){try{__CLR4_4_116lw16lwlgchosgl.R.inc(55354);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55355);Months test = Months.months(5);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55356);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55357);assertEquals("P5M", str);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55358);assertEquals(test, StringConvert.INSTANCE.convertFromString(Months.class, str));
    }finally{__CLR4_4_116lw16lwlgchosgl.R.flushNeeded();}}

    @Test
    public void testWeeks() {__CLR4_4_116lw16lwlgchosgl.R.globalSliceStart(getClass().getName(),55359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r409pw16pr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116lw16lwlgchosgl.R.rethrow($CLV_t2$);}finally{__CLR4_4_116lw16lwlgchosgl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r409pw16pr(){try{__CLR4_4_116lw16lwlgchosgl.R.inc(55359);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55360);Weeks test = Weeks.weeks(5);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55361);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55362);assertEquals("P5W", str);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55363);assertEquals(test, StringConvert.INSTANCE.convertFromString(Weeks.class, str));
    }finally{__CLR4_4_116lw16lwlgchosgl.R.flushNeeded();}}

    @Test
    public void testDays() {__CLR4_4_116lw16lwlgchosgl.R.globalSliceStart(getClass().getName(),55364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vzehn416pw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116lw16lwlgchosgl.R.rethrow($CLV_t2$);}finally{__CLR4_4_116lw16lwlgchosgl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vzehn416pw(){try{__CLR4_4_116lw16lwlgchosgl.R.inc(55364);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55365);Days test = Days.days(5);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55366);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55367);assertEquals("P5D", str);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55368);assertEquals(test, StringConvert.INSTANCE.convertFromString(Days.class, str));
    }finally{__CLR4_4_116lw16lwlgchosgl.R.flushNeeded();}}

    @Test
    public void testHours() {__CLR4_4_116lw16lwlgchosgl.R.globalSliceStart(getClass().getName(),55369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hyy94s16q1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116lw16lwlgchosgl.R.rethrow($CLV_t2$);}finally{__CLR4_4_116lw16lwlgchosgl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hyy94s16q1(){try{__CLR4_4_116lw16lwlgchosgl.R.inc(55369);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55370);Hours test = Hours.hours(5);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55371);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55372);assertEquals("PT5H", str);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55373);assertEquals(test, StringConvert.INSTANCE.convertFromString(Hours.class, str));
    }finally{__CLR4_4_116lw16lwlgchosgl.R.flushNeeded();}}

    @Test
    public void testMinutes() {__CLR4_4_116lw16lwlgchosgl.R.globalSliceStart(getClass().getName(),55374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z1oajw16q6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116lw16lwlgchosgl.R.rethrow($CLV_t2$);}finally{__CLR4_4_116lw16lwlgchosgl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z1oajw16q6(){try{__CLR4_4_116lw16lwlgchosgl.R.inc(55374);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55375);Minutes test = Minutes.minutes(5);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55376);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55377);assertEquals("PT5M", str);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55378);assertEquals(test, StringConvert.INSTANCE.convertFromString(Minutes.class, str));
    }finally{__CLR4_4_116lw16lwlgchosgl.R.flushNeeded();}}

    @Test
    public void testSeconds() {__CLR4_4_116lw16lwlgchosgl.R.globalSliceStart(getClass().getName(),55379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mni66k16qb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116lw16lwlgchosgl.R.rethrow($CLV_t2$);}finally{__CLR4_4_116lw16lwlgchosgl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestStringConvert.testSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mni66k16qb(){try{__CLR4_4_116lw16lwlgchosgl.R.inc(55379);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55380);Seconds test = Seconds.seconds(5);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55381);String str = StringConvert.INSTANCE.convertToString(test);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55382);assertEquals("PT5S", str);
        __CLR4_4_116lw16lwlgchosgl.R.inc(55383);assertEquals(test, StringConvert.INSTANCE.convertFromString(Seconds.class, str));
    }finally{__CLR4_4_116lw16lwlgchosgl.R.flushNeeded();}}

}
