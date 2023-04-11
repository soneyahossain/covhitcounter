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

import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Adds {static class __CLR4_4_1xwtxwtlgchos6i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,44282,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 +
            365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 +
            365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365 + 365;

    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 12L * DateTimeConstants.MILLIS_PER_HOUR
                    + 24L * DateTimeConstants.MILLIS_PER_MINUTE;

    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 14L * DateTimeConstants.MILLIS_PER_HOUR
                    + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_1xwtxwtlgchos6i.R.inc(43949);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43950);TestMutableDateTime_Adds TB = new TestMutableDateTime_Adds();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43951);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43952);TB.testTest();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43953);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43954);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43955);TB.testAdd_long1();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43956);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43957);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43958);TB.testAdd_RD1();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43959);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43960);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43961);TB.testAdd_RD2();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43962);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43963);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43964);TB.testAdd_RD_int1();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43965);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43966);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43967);TB.testAdd_RD_int2();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43968);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43969);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43970);TB.testAdd_RP1();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43971);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43972);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43973);TB.testAdd_RP2();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43974);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43975);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43976);TB.testAdd_RP_int1();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43977);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43978);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43979);TB.testAdd_RP_int2();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43980);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43981);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43982);TB.testAdd_DurationFieldType_int1();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43983);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43984);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43985);TB.testAdd_DurationFieldType_int_dstOverlapSummer_addZero();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43986);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43987);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43988);TB.testAdd_DurationFieldType_int_dstOverlapWinter_addZero();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43989);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43990);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43991);TB.testAdd_DurationFieldType_int2();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43992);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43993);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43994);TB.testAdd_DurationFieldType_int3();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43995);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43996);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43997);TB.testAddYears_int1();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43998);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(43999);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44000);TB.testAddYears_int_dstOverlapSummer_addZero();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44001);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44002);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44003);TB.testAddYears_int_dstOverlapWinter_addZero();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44004);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44005);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44006);TB.testAddMonths_int1();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44007);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44008);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44009);TB.testAddMonths_int_dstOverlapSummer_addZero();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44010);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44011);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44012);TB.testAddMonths_int_dstOverlapWinter_addZero();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44013);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44014);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44015);TB.testAddDays_int1();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44016);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44017);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44018);TB.testAddDays_int_dstOverlapSummer_addZero();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44019);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44020);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44021);TB.testAddDays_int_dstOverlapWinter_addZero();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44022);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44023);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44024);TB.testAddWeekyears_int1();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44025);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44026);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44027);TB.testAddWeeks_int1();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44028);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44029);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44030);TB.testAddWeeks_int_dstOverlapSummer_addZero();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44031);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44032);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44033);TB.testAddWeeks_int_dstOverlapWinter_addZero();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44034);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44035);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44036);TB.testAddHours_int1();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44037);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44038);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44039);TB.testAddHours_int_dstOverlapSummer_addZero();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44040);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44041);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44042);TB.testAddHours_int_dstOverlapWinter_addZero();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44043);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44044);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44045);TB.testAddMinutes_int1();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44046);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44047);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44048);TB.testAddMinutes_int_dstOverlapSummer_addZero();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44049);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44050);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44051);TB.testAddMinutes_int_dstOverlapWinter_addZero();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44052);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44053);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44054);TB.testAddSeconds_int1();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44055);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44056);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44057);TB.testAddSeconds_int_dstOverlapSummer_addZero();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44058);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44059);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44060);TB.testAddSeconds_int_dstOverlapWinter_addZero();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44061);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44062);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44063);TB.testAddMillis_int1();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44064);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44065);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44066);TB.testAddMillis_int_dstOverlapSummer_addZero();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44067);TB.tearDown();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44068);TB.setUp();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44069);TB.testAddMillis_int_dstOverlapWinter_addZero();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44070);TB.tearDown();

    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestMutableDateTime_Adds.class);
    }

    public TestMutableDateTime_Adds(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44071);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44072);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44073);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44074);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44075);originalLocale = Locale.getDefault();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44076);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44077);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44078);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44079);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44080);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44081);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44082);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44083);Locale.setDefault(originalLocale);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44084);originalDateTimeZone = null;
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44085);originalTimeZone = null;
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44086);originalLocale = null;
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjy0n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjy0n(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44087);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44088);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44089);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44090);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAdd_long1() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x1ijiky0r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44091,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x1ijiky0r(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44091);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44092);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44093);test.add(123456L);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44094);assertEquals(TEST_TIME1 + 123456L, test.getMillis());
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44095);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAdd_RD1() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1owfs46y0w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RD1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44096,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1owfs46y0w(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44096);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44097);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44098);test.add(new Duration(123456L));
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44099);assertEquals(TEST_TIME1 + 123456L, test.getMillis());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAdd_RD2() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5fqwny10();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RD2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5fqwny10(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44100);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44101);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44102);test.add((ReadableDuration) null);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44103);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAdd_RD_int1() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tzz6cmy14();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RD_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tzz6cmy14(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44104);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44105);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44106);test.add(new Duration(123456L), -2);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44107);assertEquals(TEST_TIME1 - (2L * 123456L), test.getMillis());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAdd_RD_int2() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x8z553y18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RD_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x8z553y18(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44108);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44109);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44110);test.add((ReadableDuration) null, 1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44111);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAdd_RP1() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qd6cqyy1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RP1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qd6cqyy1c(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44112);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44113);Period d = new Period(1, 1, 0, 1, 1, 1, 1, 1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44114);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44115);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44116);test.add(d);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44117);assertEquals("2003-07-10T06:07:08.009+01:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAdd_RP2() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tm6bjfy1i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RP2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tm6bjfy1i(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44118);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44119);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44120);test.add((ReadablePeriod) null);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44121);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAdd_RP_int1() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1exql7ey1m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RP_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1exql7ey1m(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44122);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44123);Period d = new Period(0, 0, 0, 0, 0, 0, 1, 2);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44124);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44125);test.add(d, -2);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44126);assertEquals(TEST_TIME1 - (2L * 1002L), test.getMillis());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAdd_RP_int2() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i6qjzvy1r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RP_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i6qjzvy1r(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44127);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44128);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44129);test.add((ReadablePeriod) null, 1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44130);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAdd_DurationFieldType_int1() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7idvcy1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_DurationFieldType_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44131,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7idvcy1v(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44131);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44132);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44133);test.add(DurationFieldType.years(), 8);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44134);assertEquals(2010, test.getYear());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAdd_DurationFieldType_int_dstOverlapSummer_addZero() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1utxu9ty1z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_DurationFieldType_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1utxu9ty1z(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44135);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44136);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44137);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44138);test.add(DurationFieldType.years(), 0);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44139);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAdd_DurationFieldType_int_dstOverlapWinter_addZero() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e1bx07y24();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_DurationFieldType_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e1bx07y24(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44140);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44141);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44142);test.addHours(1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44143);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44144);test.add(DurationFieldType.years(), 0);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44145);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAdd_DurationFieldType_int2() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lgicnty2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_DurationFieldType_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lgicnty2a(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44146);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44147);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44148);try {
            __CLR4_4_1xwtxwtlgchos6i.R.inc(44149);test.add((DurationFieldType) null, 0);
            __CLR4_4_1xwtxwtlgchos6i.R.inc(44150);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44151);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAdd_DurationFieldType_int3() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1opibgay2g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_DurationFieldType_int3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44152,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1opibgay2g(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44152);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44153);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44154);try {
            __CLR4_4_1xwtxwtlgchos6i.R.inc(44155);test.add((DurationFieldType) null, 6);
            __CLR4_4_1xwtxwtlgchos6i.R.inc(44156);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44157);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddYears_int1() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eqvugxy2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddYears_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eqvugxy2m(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44158);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44159);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44160);test.addYears(8);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44161);assertEquals("2010-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAddYears_int_dstOverlapSummer_addZero() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18vjj1yy2q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddYears_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18vjj1yy2q(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44162);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44163);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44164);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44165);test.addYears(0);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44166);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAddYears_int_dstOverlapWinter_addZero() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1po5gbky2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddYears_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44167,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1po5gbky2v(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44167);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44168);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44169);test.addHours(1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44170);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44171);test.addYears(0);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44172);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddMonths_int1() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uj5x3uy31();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMonths_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44173,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uj5x3uy31(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44173);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44174);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44175);test.addMonths(6);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44176);assertEquals("2002-12-09T05:06:07.008Z", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAddMonths_int_dstOverlapSummer_addZero() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eq4ufly35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMonths_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eq4ufly35(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44177);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44178);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44179);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44180);test.addMonths(0);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44181);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAddMonths_int_dstOverlapWinter_addZero() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1viqrp7y3a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMonths_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1viqrp7y3a(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44182);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44183);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44184);test.addHours(1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44185);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44186);test.addMonths(0);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44187);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddDays_int1() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qej9j2y3g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddDays_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qej9j2y3g(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44188);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44189);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44190);test.addDays(17);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44191);assertEquals("2002-06-26T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAddDays_int_dstOverlapSummer_addZero() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14g9i5xy3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddDays_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14g9i5xy3k(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44192);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44193);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44194);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44195);test.addDays(0);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44196);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAddDays_int_dstOverlapWinter_addZero() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l8vffjy3p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddDays_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l8vffjy3p(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44197);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44198);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44199);test.addHours(1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44200);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44201);test.addDays(0);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44202);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddWeekyears_int1() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zgs35hy3v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddWeekyears_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zgs35hy3v(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44203);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44204);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44205);test.addWeekyears(-1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44206);assertEquals("2001-06-10T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddWeeks_int1() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jr23jcy3z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddWeeks_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jr23jcy3z(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44207);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44208);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44209);test.addWeeks(-21);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44210);assertEquals("2002-01-13T05:06:07.008Z", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAddWeeks_int_dstOverlapSummer_addZero() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1al77hby43();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddWeeks_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1al77hby43(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44211);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44212);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44213);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44214);test.addWeeks(0);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44215);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAddWeeks_int_dstOverlapWinter_addZero() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rdt4qxy48();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddWeeks_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rdt4qxy48(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44216);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44217);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44218);test.addHours(1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44219);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44220);test.addWeeks(0);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44221);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddHours_int1() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_186qeewy4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddHours_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44222,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_186qeewy4e(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44222);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44223);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44224);test.addHours(13);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44225);assertEquals("2002-06-09T18:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAddHours_int_dstOverlapSummer_addZero() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cilwofy4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddHours_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cilwofy4i(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44226);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44227);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44228);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44229);test.addHours(0);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44230);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAddHours_int_dstOverlapWinter_addZero() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tb7ty1y4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddHours_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tb7ty1y4n(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44231);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44232);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44233);test.addHours(1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44234);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44235);test.addHours(0);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44236);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddMinutes_int1() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18kexh4y4t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMinutes_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44237,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18kexh4y4t(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44237);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44238);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44239);test.addMinutes(13);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44240);assertEquals("2002-06-09T05:19:07.008+01:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAddMinutes_int_dstOverlapSummer_addZero() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zghfeny4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMinutes_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zghfeny4x(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44241);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44242);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44243);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44244);test.addMinutes(0);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44245);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAddMinutes_int_dstOverlapWinter_addZero() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1is0pavy52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMinutes_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1is0pavy52(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44246);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44247);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44248);test.addHours(1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44249);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44250);test.addMinutes(0);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44251);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddSeconds_int1() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o3wn8oy58();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddSeconds_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o3wn8oy58(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44252);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44253);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44254);test.addSeconds(13);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44255);assertEquals("2002-06-09T05:06:20.008+01:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAddSeconds_int_dstOverlapSummer_addZero() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tmwx5ry5c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddSeconds_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tmwx5ry5c(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44256);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44257);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44258);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44259);test.addSeconds(0);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44260);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAddSeconds_int_dstOverlapWinter_addZero() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oll7jry5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddSeconds_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oll7jry5h(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44261);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44262);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44263);test.addHours(1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44264);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44265);test.addSeconds(0);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44266);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddMillis_int1() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uufoq5y5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMillis_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uufoq5y5n(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44267);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44268);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44269);test.addMillis(13);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44270);assertEquals("2002-06-09T05:06:07.021+01:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAddMillis_int_dstOverlapSummer_addZero() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jql8m4y5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMillis_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44271,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jql8m4y5r(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44271);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44272);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44273);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44274);test.addMillis(0);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44275);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

    @Test
    public void testAddMillis_int_dstOverlapWinter_addZero() {__CLR4_4_1xwtxwtlgchos6i.R.globalSliceStart(getClass().getName(),44276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12xzbciy5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xwtxwtlgchos6i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xwtxwtlgchos6i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMillis_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12xzbciy5w(){try{__CLR4_4_1xwtxwtlgchos6i.R.inc(44276);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44277);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44278);test.addHours(1);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44279);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44280);test.addMillis(0);
        __CLR4_4_1xwtxwtlgchos6i.R.inc(44281);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1xwtxwtlgchos6i.R.flushNeeded();}}

}
