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
 * This class is a Junit unit test for PeriodFormat.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodFormatParsing {static class __CLR4_4_11mmw1mmwlgchot1l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,76061,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

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

    public static void main(String[] args) throws Exception {try{__CLR4_4_11mmw1mmwlgchot1l.R.inc(75992);
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(75993);TestPeriodFormatParsing TB = new TestPeriodFormatParsing();
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(75994);TB.setUp();
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(75995);TB.testParseStandard1();
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(75996);TB.tearDown();
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(75997);TB.setUp();
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(75998);TB.testParseNegativeMillis1();
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(75999);TB.tearDown();
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76000);TB.setUp();
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76001);TB.testParseNegativeMillis2();
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76002);TB.tearDown();
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76003);TB.setUp();
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76004);TB.testParseCustom1();
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76005);TB.tearDown();
    }finally{__CLR4_4_11mmw1mmwlgchot1l.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestPeriodFormatParsing.class);
    }

    public TestPeriodFormatParsing(String name) {
        super(name);
    }
     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11mmw1mmwlgchot1l.R.inc(76006);
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76007);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76008);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76009);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76010);originalLocale = Locale.getDefault();
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76011);DateTimeZone.setDefault(LONDON);
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76012);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76013);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_11mmw1mmwlgchot1l.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11mmw1mmwlgchot1l.R.inc(76014);
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76015);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76016);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76017);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76018);Locale.setDefault(originalLocale);
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76019);originalDateTimeZone = null;
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76020);originalTimeZone = null;
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76021);originalLocale = null;
    }finally{__CLR4_4_11mmw1mmwlgchot1l.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseStandard1() {__CLR4_4_11mmw1mmwlgchot1l.R.globalSliceStart(getClass().getName(),76022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1paoime1mnq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mmw1mmwlgchot1l.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mmw1mmwlgchot1l.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatParsing.testParseStandard1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76022,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1paoime1mnq(){try{__CLR4_4_11mmw1mmwlgchot1l.R.inc(76022);
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76023);PeriodFormatter parser = PeriodFormat.getDefault();
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76024);Period p = parser.parsePeriod("6 years, 3 months and 2 days");
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76025);assertEquals(new Period(6, 3, 0, 2, 0, 0, 0, 0), p);
    }finally{__CLR4_4_11mmw1mmwlgchot1l.R.flushNeeded();}}

    @Test
    public void testParseNegativeMillis1() {__CLR4_4_11mmw1mmwlgchot1l.R.globalSliceStart(getClass().getName(),76026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12erpk41mnu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mmw1mmwlgchot1l.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mmw1mmwlgchot1l.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatParsing.testParseNegativeMillis1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76026,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12erpk41mnu(){try{__CLR4_4_11mmw1mmwlgchot1l.R.inc(76026);
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76027);Period period = new Period(0, 0, 0, -1);
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76028);String formatted = period.toString();
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76029);assertEquals("PT-0.001S", formatted);
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76030);Period parsed = Period.parse(formatted);
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76031);assertEquals(period, parsed);
    }finally{__CLR4_4_11mmw1mmwlgchot1l.R.flushNeeded();}}

    @Test
    public void testParseNegativeMillis2() {__CLR4_4_11mmw1mmwlgchot1l.R.globalSliceStart(getClass().getName(),76032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u898d1mo0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mmw1mmwlgchot1l.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mmw1mmwlgchot1l.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatParsing.testParseNegativeMillis2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76032,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u898d1mo0(){try{__CLR4_4_11mmw1mmwlgchot1l.R.inc(76032);
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76033);Period period = new Period(0, 0, 0, -999);
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76034);String formatted = period.toString();
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76035);assertEquals("PT-0.999S", formatted);
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76036);Period parsed = Period.parse(formatted);
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76037);assertEquals(period, parsed);
    }finally{__CLR4_4_11mmw1mmwlgchot1l.R.flushNeeded();}}

    @Test
    public void testParseCustom1() {__CLR4_4_11mmw1mmwlgchot1l.R.globalSliceStart(getClass().getName(),76038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12enhdy1mo6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mmw1mmwlgchot1l.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mmw1mmwlgchot1l.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatParsing.testParseCustom1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12enhdy1mo6(){try{__CLR4_4_11mmw1mmwlgchot1l.R.inc(76038);
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76039);PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways()
                .appendHours()
                .appendSuffix(":")
                .minimumPrintedDigits(2)
                .appendMinutes()
                .toFormatter();

        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76040);Period p;

        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76041);p = new Period(47, 55, 0, 0);
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76042);assertEquals("47:55", formatter.print(p));
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76043);assertEquals(p, formatter.parsePeriod("47:55"));
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76044);assertEquals(p, formatter.parsePeriod("047:055"));

        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76045);p = new Period(7, 5, 0, 0);
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76046);assertEquals("7:05", formatter.print(p));
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76047);assertEquals(p, formatter.parsePeriod("7:05"));
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76048);assertEquals(p, formatter.parsePeriod("7:5"));
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76049);assertEquals(p, formatter.parsePeriod("07:05"));

        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76050);p = new Period(0, 5, 0, 0);
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76051);assertEquals("0:05", formatter.print(p));
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76052);assertEquals(p, formatter.parsePeriod("0:05"));
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76053);assertEquals(p, formatter.parsePeriod("0:5"));
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76054);assertEquals(p, formatter.parsePeriod("00:005"));
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76055);assertEquals(p, formatter.parsePeriod("0:005"));

        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76056);p = new Period(0, 0, 0, 0);
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76057);assertEquals("0:00", formatter.print(p));
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76058);assertEquals(p, formatter.parsePeriod("0:00"));
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76059);assertEquals(p, formatter.parsePeriod("0:0"));
        __CLR4_4_11mmw1mmwlgchot1l.R.inc(76060);assertEquals(p, formatter.parsePeriod("00:00"));
    }finally{__CLR4_4_11mmw1mmwlgchot1l.R.flushNeeded();}}

}
