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
package org.joda.time.format;

import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/**
 * This class is a Junit unit test for ISOPeriodFormat.
 *
 * @author Stephen Colebourne
 */
public class TestISOPeriodFormatParsing {static class __CLR4_4_11lws1lwslgchot0o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,75179,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final Period PERIOD = new Period(1, 2, 3, 4, 5, 6, 7, 8);
    private static final Period EMPTY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0);
    private static final Period YEAR_DAY_PERIOD = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
    private static final Period EMPTY_YEAR_DAY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.yearDayTime());
    private static final Period TIME_PERIOD = new Period(0, 0, 0, 0, 5, 6, 7, 8);
    private static final Period DATE_PERIOD = new Period(1, 2, 3, 4, 0, 0, 0, 0);

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 +
            365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW = (y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11lws1lwslgchot0o.R.inc(75052);
        __CLR4_4_11lws1lwslgchot0o.R.inc(75053);TestISOPeriodFormatParsing TB = new TestISOPeriodFormatParsing();

        __CLR4_4_11lws1lwslgchot0o.R.inc(75054);TB.setUp();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75055);TB.testParseStandard1();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75056);TB.tearDown();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75057);TB.setUp();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75058);TB.testParseStandard2();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75059);TB.tearDown();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75060);TB.setUp();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75061);TB.testParseStandard3();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75062);TB.tearDown();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75063);TB.setUp();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75064);TB.testParseStandard4();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75065);TB.tearDown();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75066);TB.setUp();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75067);TB.testParseStandard5();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75068);TB.tearDown();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75069);TB.setUp();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75070);TB.testParseStandard6();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75071);TB.tearDown();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75072);TB.setUp();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75073);TB.testParseStandard7();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75074);TB.tearDown();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75075);TB.setUp();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75076);TB.testParseStandard8();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75077);TB.tearDown();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75078);TB.setUp();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75079);TB.testParseStandard9();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75080);TB.tearDown();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75081);TB.setUp();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75082);TB.testParseStandard10();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75083);TB.tearDown();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75084);TB.setUp();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75085);TB.testParseStandard11();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75086);TB.tearDown();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75087);TB.setUp();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75088);TB.testParseStandardFail1();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75089);TB.tearDown();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75090);TB.setUp();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75091);TB.testParseStandardFail2();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75092);TB.tearDown();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75093);TB.setUp();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75094);TB.testParseStandardFail3();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75095);TB.tearDown();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75096);TB.setUp();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75097);TB.testParseStandardFail4();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75098);TB.tearDown();

    }finally{__CLR4_4_11lws1lwslgchot0o.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestISOPeriodFormatParsing.class);
    }

    public TestISOPeriodFormatParsing(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11lws1lwslgchot0o.R.inc(75099);
        __CLR4_4_11lws1lwslgchot0o.R.inc(75100);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_11lws1lwslgchot0o.R.inc(75101);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75102);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75103);originalLocale = Locale.getDefault();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75104);DateTimeZone.setDefault(LONDON);
        __CLR4_4_11lws1lwslgchot0o.R.inc(75105);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11lws1lwslgchot0o.R.inc(75106);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_11lws1lwslgchot0o.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11lws1lwslgchot0o.R.inc(75107);
        __CLR4_4_11lws1lwslgchot0o.R.inc(75108);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75109);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11lws1lwslgchot0o.R.inc(75110);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11lws1lwslgchot0o.R.inc(75111);Locale.setDefault(originalLocale);
        __CLR4_4_11lws1lwslgchot0o.R.inc(75112);originalDateTimeZone = null;
        __CLR4_4_11lws1lwslgchot0o.R.inc(75113);originalTimeZone = null;
        __CLR4_4_11lws1lwslgchot0o.R.inc(75114);originalLocale = null;
    }finally{__CLR4_4_11lws1lwslgchot0o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseStandard1() {__CLR4_4_11lws1lwslgchot0o.R.globalSliceStart(getClass().getName(),75115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1paoime1lyj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lws1lwslgchot0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lws1lwslgchot0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandard1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75115,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1paoime1lyj(){try{__CLR4_4_11lws1lwslgchot0o.R.inc(75115);
        __CLR4_4_11lws1lwslgchot0o.R.inc(75116);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75117);Period p = parser.parsePeriod("P1Y2M3W4DT5H6M7.008S");
        __CLR4_4_11lws1lwslgchot0o.R.inc(75118);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), p);
    }finally{__CLR4_4_11lws1lwslgchot0o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseStandard2() {__CLR4_4_11lws1lwslgchot0o.R.globalSliceStart(getClass().getName(),75119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1ojtx1lyn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lws1lwslgchot0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lws1lwslgchot0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandard2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1ojtx1lyn(){try{__CLR4_4_11lws1lwslgchot0o.R.inc(75119);
        __CLR4_4_11lws1lwslgchot0o.R.inc(75120);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75121);Period p = parser.parsePeriod("P0Y0M0W0DT5H6M7.008S");
        __CLR4_4_11lws1lwslgchot0o.R.inc(75122);assertEquals(new Period(0, 0, 0, 0, 5, 6, 7, 8), p);
    }finally{__CLR4_4_11lws1lwslgchot0o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseStandard3() {__CLR4_4_11lws1lwslgchot0o.R.globalSliceStart(getClass().getName(),75123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1isol1g1lyr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lws1lwslgchot0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lws1lwslgchot0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandard3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1isol1g1lyr(){try{__CLR4_4_11lws1lwslgchot0o.R.inc(75123);
        __CLR4_4_11lws1lwslgchot0o.R.inc(75124);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75125);Period p = parser.parsePeriod("P0DT5H6M7.008S");
        __CLR4_4_11lws1lwslgchot0o.R.inc(75126);assertEquals(new Period(0, 0, 0, 0, 5, 6, 7, 8), p);
    }finally{__CLR4_4_11lws1lwslgchot0o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseStandard4() {__CLR4_4_11lws1lwslgchot0o.R.globalSliceStart(getClass().getName(),75127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fjom8z1lyv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lws1lwslgchot0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lws1lwslgchot0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandard4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fjom8z1lyv(){try{__CLR4_4_11lws1lwslgchot0o.R.inc(75127);
        __CLR4_4_11lws1lwslgchot0o.R.inc(75128);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75129);Period p = parser.parsePeriod("P2Y3DT5H6M7.008S");
        __CLR4_4_11lws1lwslgchot0o.R.inc(75130);assertEquals(new Period(2, 0, 0, 3, 5, 6, 7, 8), p);
    }finally{__CLR4_4_11lws1lwslgchot0o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseStandard5() {__CLR4_4_11lws1lwslgchot0o.R.globalSliceStart(getClass().getName(),75131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1caongi1lyz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lws1lwslgchot0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lws1lwslgchot0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandard5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75131,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1caongi1lyz(){try{__CLR4_4_11lws1lwslgchot0o.R.inc(75131);
        __CLR4_4_11lws1lwslgchot0o.R.inc(75132);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75133);Period p = parser.parsePeriod("P2YT5H6M7.008S");
        __CLR4_4_11lws1lwslgchot0o.R.inc(75134);assertEquals(new Period(2, 0, 0, 0, 5, 6, 7, 8), p);
    }finally{__CLR4_4_11lws1lwslgchot0o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseStandard6() {__CLR4_4_11lws1lwslgchot0o.R.globalSliceStart(getClass().getName(),75135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_191ooo11lz3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lws1lwslgchot0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lws1lwslgchot0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandard6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_191ooo11lz3(){try{__CLR4_4_11lws1lwslgchot0o.R.inc(75135);
        __CLR4_4_11lws1lwslgchot0o.R.inc(75136);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75137);Period p = parser.parsePeriod("PT5H6M7.008S");
        __CLR4_4_11lws1lwslgchot0o.R.inc(75138);assertEquals(new Period(0, 0, 0, 0, 5, 6, 7, 8), p);
    }finally{__CLR4_4_11lws1lwslgchot0o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseStandard7() {__CLR4_4_11lws1lwslgchot0o.R.globalSliceStart(getClass().getName(),75139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15sopvk1lz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lws1lwslgchot0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lws1lwslgchot0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandard7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15sopvk1lz7(){try{__CLR4_4_11lws1lwslgchot0o.R.inc(75139);
        __CLR4_4_11lws1lwslgchot0o.R.inc(75140);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75141);Period p = parser.parsePeriod("P1Y2M3W4D");
        __CLR4_4_11lws1lwslgchot0o.R.inc(75142);assertEquals(new Period(1, 2, 3, 4, 0, 0, 0, 0), p);
    }finally{__CLR4_4_11lws1lwslgchot0o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseStandard8() {__CLR4_4_11lws1lwslgchot0o.R.globalSliceStart(getClass().getName(),75143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12jor331lzb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lws1lwslgchot0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lws1lwslgchot0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandard8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12jor331lzb(){try{__CLR4_4_11lws1lwslgchot0o.R.inc(75143);
        __CLR4_4_11lws1lwslgchot0o.R.inc(75144);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75145);Period p = parser.parsePeriod("PT5H6M7S");
        __CLR4_4_11lws1lwslgchot0o.R.inc(75146);assertEquals(new Period(0, 0, 0, 0, 5, 6, 7, 0), p);
    }finally{__CLR4_4_11lws1lwslgchot0o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseStandard9() {__CLR4_4_11lws1lwslgchot0o.R.globalSliceStart(getClass().getName(),75147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pb7pe1lzf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lws1lwslgchot0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lws1lwslgchot0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandard9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75147,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pb7pe1lzf(){try{__CLR4_4_11lws1lwslgchot0o.R.inc(75147);
        __CLR4_4_11lws1lwslgchot0o.R.inc(75148);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75149);Period p = parser.parsePeriod("PT0S");
        __CLR4_4_11lws1lwslgchot0o.R.inc(75150);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 0), p);
    }finally{__CLR4_4_11lws1lwslgchot0o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseStandard10() {__CLR4_4_11lws1lwslgchot0o.R.globalSliceStart(getClass().getName(),75151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xfkvhg1lzj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lws1lwslgchot0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lws1lwslgchot0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandard10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75151,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xfkvhg1lzj(){try{__CLR4_4_11lws1lwslgchot0o.R.inc(75151);
        __CLR4_4_11lws1lwslgchot0o.R.inc(75152);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75153);Period p = parser.parsePeriod("P0D");
        __CLR4_4_11lws1lwslgchot0o.R.inc(75154);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 0), p);
    }finally{__CLR4_4_11lws1lwslgchot0o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseStandard11() {__CLR4_4_11lws1lwslgchot0o.R.globalSliceStart(getClass().getName(),75155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ycj7p71lzn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lws1lwslgchot0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lws1lwslgchot0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandard11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ycj7p71lzn(){try{__CLR4_4_11lws1lwslgchot0o.R.inc(75155);
        __CLR4_4_11lws1lwslgchot0o.R.inc(75156);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75157);Period p = parser.parsePeriod("P0Y");
        __CLR4_4_11lws1lwslgchot0o.R.inc(75158);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 0), p);
    }finally{__CLR4_4_11lws1lwslgchot0o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseStandardFail1() {__CLR4_4_11lws1lwslgchot0o.R.globalSliceStart(getClass().getName(),75159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sve9z81lzr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lws1lwslgchot0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lws1lwslgchot0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandardFail1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75159,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sve9z81lzr(){try{__CLR4_4_11lws1lwslgchot0o.R.inc(75159);
        __CLR4_4_11lws1lwslgchot0o.R.inc(75160);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75161);try {
            __CLR4_4_11lws1lwslgchot0o.R.inc(75162);parser.parsePeriod("P1Y2S");
            __CLR4_4_11lws1lwslgchot0o.R.inc(75163);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11lws1lwslgchot0o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseStandardFail2() {__CLR4_4_11lws1lwslgchot0o.R.globalSliceStart(getClass().getName(),75164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pmeb6r1lzw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lws1lwslgchot0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lws1lwslgchot0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandardFail2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pmeb6r1lzw(){try{__CLR4_4_11lws1lwslgchot0o.R.inc(75164);
        __CLR4_4_11lws1lwslgchot0o.R.inc(75165);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75166);try {
            __CLR4_4_11lws1lwslgchot0o.R.inc(75167);parser.parsePeriod("PS");
            __CLR4_4_11lws1lwslgchot0o.R.inc(75168);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11lws1lwslgchot0o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseStandardFail3() {__CLR4_4_11lws1lwslgchot0o.R.globalSliceStart(getClass().getName(),75169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mdecea1m01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lws1lwslgchot0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lws1lwslgchot0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandardFail3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mdecea1m01(){try{__CLR4_4_11lws1lwslgchot0o.R.inc(75169);
        __CLR4_4_11lws1lwslgchot0o.R.inc(75170);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75171);try {
            __CLR4_4_11lws1lwslgchot0o.R.inc(75172);parser.parsePeriod("PTS");
            __CLR4_4_11lws1lwslgchot0o.R.inc(75173);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11lws1lwslgchot0o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseStandardFail4() {__CLR4_4_11lws1lwslgchot0o.R.globalSliceStart(getClass().getName(),75174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j4edlt1m06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lws1lwslgchot0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lws1lwslgchot0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormatParsing.testParseStandardFail4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j4edlt1m06(){try{__CLR4_4_11lws1lwslgchot0o.R.inc(75174);
        __CLR4_4_11lws1lwslgchot0o.R.inc(75175);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_11lws1lwslgchot0o.R.inc(75176);try {
            __CLR4_4_11lws1lwslgchot0o.R.inc(75177);parser.parsePeriod("PXS");
            __CLR4_4_11lws1lwslgchot0o.R.inc(75178);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11lws1lwslgchot0o.R.flushNeeded();}}

}
