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
public class TestISOPeriodFormat {static class __CLR4_4_11ltg1ltglgchot0k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,75052,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

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
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11ltg1ltglgchot0k.R.inc(74932);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74933);TestISOPeriodFormat TB = new TestISOPeriodFormat();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74934);TB.setUp();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74935);TB.testSubclassableConstructor();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74936);TB.tearDown();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74937);TB.setUp();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74938);TB.testFormatStandard();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74939);TB.tearDown();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74940);TB.setUp();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74941);TB.testFormatStandard_negative();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74942);TB.tearDown();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74943);TB.setUp();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74944);TB.testFormatAlternate();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74945);TB.tearDown();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74946);TB.setUp();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74947);TB.testFormatAlternateExtended();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74948);TB.tearDown();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74949);TB.setUp();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74950);TB.testFormatAlternateWithWeeks();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74951);TB.tearDown();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74952);TB.setUp();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74953);TB.testFormatAlternateExtendedWithWeeks();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74954);TB.tearDown();

    }finally{__CLR4_4_11ltg1ltglgchot0k.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestISOPeriodFormat.class);
    }

    public TestISOPeriodFormat(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11ltg1ltglgchot0k.R.inc(74955);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74956);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74957);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74958);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74959);originalLocale = Locale.getDefault();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74960);DateTimeZone.setDefault(LONDON);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74961);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74962);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_11ltg1ltglgchot0k.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11ltg1ltglgchot0k.R.inc(74963);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74964);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74965);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74966);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74967);Locale.setDefault(originalLocale);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74968);originalDateTimeZone = null;
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74969);originalTimeZone = null;
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74970);originalLocale = null;
    }finally{__CLR4_4_11ltg1ltglgchot0k.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSubclassableConstructor() {__CLR4_4_11ltg1ltglgchot0k.R.globalSliceStart(getClass().getName(),74971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pm293x1luj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ltg1ltglgchot0k.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ltg1ltglgchot0k.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testSubclassableConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pm293x1luj(){try{__CLR4_4_11ltg1ltglgchot0k.R.inc(74971);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74972);ISOPeriodFormat f = new ISOPeriodFormat() {
            // test constructor is protected
        };
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74973);assertNotNull(f);
    }finally{__CLR4_4_11ltg1ltglgchot0k.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormatStandard() {__CLR4_4_11ltg1ltglgchot0k.R.globalSliceStart(getClass().getName(),74974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ermzcj1lum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ltg1ltglgchot0k.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ltg1ltglgchot0k.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatStandard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ermzcj1lum(){try{__CLR4_4_11ltg1ltglgchot0k.R.inc(74974);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74975);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74976);assertEquals("P1Y2M3W4DT5H6M7.008S", ISOPeriodFormat.standard().print(p));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74977);p = new Period(1, 2, 3, 4, 5, 6, 7, 0);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74978);assertEquals("P1Y2M3W4DT5H6M7S", ISOPeriodFormat.standard().print(p));

        __CLR4_4_11ltg1ltglgchot0k.R.inc(74979);p = new Period(0);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74980);assertEquals("PT0S", ISOPeriodFormat.standard().print(p));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74981);p = new Period(0, PeriodType.standard().withMillisRemoved().withSecondsRemoved());
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74982);assertEquals("PT0M", ISOPeriodFormat.standard().print(p));

        __CLR4_4_11ltg1ltglgchot0k.R.inc(74983);assertEquals("P1Y4DT5H6M7.008S", ISOPeriodFormat.standard().print(YEAR_DAY_PERIOD));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74984);assertEquals("PT0S", ISOPeriodFormat.standard().print(EMPTY_YEAR_DAY_PERIOD));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74985);assertEquals("P1Y2M3W4D", ISOPeriodFormat.standard().print(DATE_PERIOD));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74986);assertEquals("PT5H6M7.008S", ISOPeriodFormat.standard().print(TIME_PERIOD));
    }finally{__CLR4_4_11ltg1ltglgchot0k.R.flushNeeded();}}

    @Test
    public void testFormatStandard_negative() {__CLR4_4_11ltg1ltglgchot0k.R.globalSliceStart(getClass().getName(),74987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1einy231luz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ltg1ltglgchot0k.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ltg1ltglgchot0k.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatStandard_negative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1einy231luz(){try{__CLR4_4_11ltg1ltglgchot0k.R.inc(74987);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74988);Period p = new Period(-1, -2, -3, -4, -5, -6, -7, -8);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74989);assertEquals("P-1Y-2M-3W-4DT-5H-6M-7.008S", ISOPeriodFormat.standard().print(p));

        __CLR4_4_11ltg1ltglgchot0k.R.inc(74990);p = Period.years(-54);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74991);assertEquals("P-54Y", ISOPeriodFormat.standard().print(p));

        __CLR4_4_11ltg1ltglgchot0k.R.inc(74992);p = Period.seconds(4).withMillis(-8);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74993);assertEquals("PT3.992S", ISOPeriodFormat.standard().print(p));

        __CLR4_4_11ltg1ltglgchot0k.R.inc(74994);p = Period.seconds(-4).withMillis(8);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74995);assertEquals("PT-3.992S", ISOPeriodFormat.standard().print(p));

        __CLR4_4_11ltg1ltglgchot0k.R.inc(74996);p = Period.seconds(-23);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74997);assertEquals("PT-23S", ISOPeriodFormat.standard().print(p));

        __CLR4_4_11ltg1ltglgchot0k.R.inc(74998);p = Period.millis(-8);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(74999);assertEquals("PT-0.008S", ISOPeriodFormat.standard().print(p));
    }finally{__CLR4_4_11ltg1ltglgchot0k.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormatAlternate() {__CLR4_4_11ltg1ltglgchot0k.R.globalSliceStart(getClass().getName(),75000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lr4p41lvc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ltg1ltglgchot0k.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ltg1ltglgchot0k.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatAlternate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lr4p41lvc(){try{__CLR4_4_11ltg1ltglgchot0k.R.inc(75000);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75001);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75002);assertEquals("P00010204T050607.008", ISOPeriodFormat.alternate().print(p));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75003);p = new Period(1, 2, 3, 4, 5, 6, 7, 0);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75004);assertEquals("P00010204T050607", ISOPeriodFormat.alternate().print(p));

        __CLR4_4_11ltg1ltglgchot0k.R.inc(75005);p = new Period(0);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75006);assertEquals("P00000000T000000", ISOPeriodFormat.alternate().print(p));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75007);p = new Period(0, PeriodType.standard().withMillisRemoved().withSecondsRemoved());
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75008);assertEquals("P00000000T000000", ISOPeriodFormat.alternate().print(p));

        __CLR4_4_11ltg1ltglgchot0k.R.inc(75009);assertEquals("P00010004T050607.008", ISOPeriodFormat.alternate().print(YEAR_DAY_PERIOD));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75010);assertEquals("P00000000T000000", ISOPeriodFormat.alternate().print(EMPTY_YEAR_DAY_PERIOD));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75011);assertEquals("P00010204T000000", ISOPeriodFormat.alternate().print(DATE_PERIOD));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75012);assertEquals("P00000000T050607.008", ISOPeriodFormat.alternate().print(TIME_PERIOD));
    }finally{__CLR4_4_11ltg1ltglgchot0k.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormatAlternateExtended() {__CLR4_4_11ltg1ltglgchot0k.R.globalSliceStart(getClass().getName(),75013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vrxt8v1lvp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ltg1ltglgchot0k.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ltg1ltglgchot0k.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatAlternateExtended",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75013,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vrxt8v1lvp(){try{__CLR4_4_11ltg1ltglgchot0k.R.inc(75013);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75014);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75015);assertEquals("P0001-02-04T05:06:07.008", ISOPeriodFormat.alternateExtended().print(p));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75016);p = new Period(1, 2, 3, 4, 5, 6, 7, 0);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75017);assertEquals("P0001-02-04T05:06:07", ISOPeriodFormat.alternateExtended().print(p));

        __CLR4_4_11ltg1ltglgchot0k.R.inc(75018);p = new Period(0);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75019);assertEquals("P0000-00-00T00:00:00", ISOPeriodFormat.alternateExtended().print(p));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75020);p = new Period(0, PeriodType.standard().withMillisRemoved().withSecondsRemoved());
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75021);assertEquals("P0000-00-00T00:00:00", ISOPeriodFormat.alternateExtended().print(p));

        __CLR4_4_11ltg1ltglgchot0k.R.inc(75022);assertEquals("P0001-00-04T05:06:07.008", ISOPeriodFormat.alternateExtended().print(YEAR_DAY_PERIOD));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75023);assertEquals("P0000-00-00T00:00:00", ISOPeriodFormat.alternateExtended().print(EMPTY_YEAR_DAY_PERIOD));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75024);assertEquals("P0001-02-04T00:00:00", ISOPeriodFormat.alternateExtended().print(DATE_PERIOD));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75025);assertEquals("P0000-00-00T05:06:07.008", ISOPeriodFormat.alternateExtended().print(TIME_PERIOD));
    }finally{__CLR4_4_11ltg1ltglgchot0k.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormatAlternateWithWeeks() {__CLR4_4_11ltg1ltglgchot0k.R.globalSliceStart(getClass().getName(),75026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1an5kc11lw2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ltg1ltglgchot0k.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ltg1ltglgchot0k.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatAlternateWithWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75026,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1an5kc11lw2(){try{__CLR4_4_11ltg1ltglgchot0k.R.inc(75026);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75027);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75028);assertEquals("P0001W0304T050607.008", ISOPeriodFormat.alternateWithWeeks().print(p));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75029);p = new Period(1, 2, 3, 4, 5, 6, 7, 0);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75030);assertEquals("P0001W0304T050607", ISOPeriodFormat.alternateWithWeeks().print(p));

        __CLR4_4_11ltg1ltglgchot0k.R.inc(75031);p = new Period(0);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75032);assertEquals("P0000W0000T000000", ISOPeriodFormat.alternateWithWeeks().print(p));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75033);p = new Period(0, PeriodType.standard().withMillisRemoved().withSecondsRemoved());
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75034);assertEquals("P0000W0000T000000", ISOPeriodFormat.alternateWithWeeks().print(p));

        __CLR4_4_11ltg1ltglgchot0k.R.inc(75035);assertEquals("P0001W0004T050607.008", ISOPeriodFormat.alternateWithWeeks().print(YEAR_DAY_PERIOD));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75036);assertEquals("P0000W0000T000000", ISOPeriodFormat.alternateWithWeeks().print(EMPTY_YEAR_DAY_PERIOD));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75037);assertEquals("P0001W0304T000000", ISOPeriodFormat.alternateWithWeeks().print(DATE_PERIOD));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75038);assertEquals("P0000W0000T050607.008", ISOPeriodFormat.alternateWithWeeks().print(TIME_PERIOD));
    }finally{__CLR4_4_11ltg1ltglgchot0k.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormatAlternateExtendedWithWeeks() {__CLR4_4_11ltg1ltglgchot0k.R.globalSliceStart(getClass().getName(),75039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17j6rau1lwf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ltg1ltglgchot0k.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ltg1ltglgchot0k.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatAlternateExtendedWithWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17j6rau1lwf(){try{__CLR4_4_11ltg1ltglgchot0k.R.inc(75039);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75040);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75041);assertEquals("P0001-W03-04T05:06:07.008", ISOPeriodFormat.alternateExtendedWithWeeks().print(p));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75042);p = new Period(1, 2, 3, 4, 5, 6, 7, 0);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75043);assertEquals("P0001-W03-04T05:06:07", ISOPeriodFormat.alternateExtendedWithWeeks().print(p));

        __CLR4_4_11ltg1ltglgchot0k.R.inc(75044);p = new Period(0);
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75045);assertEquals("P0000-W00-00T00:00:00", ISOPeriodFormat.alternateExtendedWithWeeks().print(p));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75046);p = new Period(0, PeriodType.standard().withMillisRemoved().withSecondsRemoved());
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75047);assertEquals("P0000-W00-00T00:00:00", ISOPeriodFormat.alternateExtendedWithWeeks().print(p));

        __CLR4_4_11ltg1ltglgchot0k.R.inc(75048);assertEquals("P0001-W00-04T05:06:07.008", ISOPeriodFormat.alternateExtendedWithWeeks().print(YEAR_DAY_PERIOD));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75049);assertEquals("P0000-W00-00T00:00:00", ISOPeriodFormat.alternateExtendedWithWeeks().print(EMPTY_YEAR_DAY_PERIOD));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75050);assertEquals("P0001-W03-04T00:00:00", ISOPeriodFormat.alternateExtendedWithWeeks().print(DATE_PERIOD));
        __CLR4_4_11ltg1ltglgchot0k.R.inc(75051);assertEquals("P0000-W00-00T05:06:07.008", ISOPeriodFormat.alternateExtendedWithWeeks().print(TIME_PERIOD));
    }finally{__CLR4_4_11ltg1ltglgchot0k.R.flushNeeded();}}

}
