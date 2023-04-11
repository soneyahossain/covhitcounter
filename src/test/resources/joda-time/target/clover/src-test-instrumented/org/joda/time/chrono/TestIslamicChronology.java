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
package org.joda.time.chrono;

import java.util.Locale;
import java.util.TimeZone;

//import junit.framework.TestCase;
//import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.DateTime.Property;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is a Junit unit test for IslamicChronology.
 *
 * @author Stephen Colebourne
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class TestIslamicChronology {static class __CLR4_4_11cfe1cfelgchosnq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,63409,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static long SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology ISLAMIC_UTC = IslamicChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();

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

    public static void main(String[] args) throws Exception {try{__CLR4_4_11cfe1cfelgchosnq.R.inc(62762);
        //junit.textui.TestRunner.run(suite());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62763);TestIslamicChronology TB = new TestIslamicChronology();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62764);TB.setUp();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62765);TB.testFactoryUTC();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62766);TB.tearDown();


        __CLR4_4_11cfe1cfelgchosnq.R.inc(62767);TB.setUp();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62768);TB.testFactory();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62769);TB.tearDown();


        __CLR4_4_11cfe1cfelgchosnq.R.inc(62770);TB.setUp();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62771);TB.testFactory_Zone();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62772);TB.tearDown();


        __CLR4_4_11cfe1cfelgchosnq.R.inc(62773);TB.setUp();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62774);TB.testEquality();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62775);TB.tearDown();

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62776);TB.setUp();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62777);TB.testWithUTC();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62778);TB.tearDown();

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62779);TB.setUp();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62780);TB.testWithZone();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62781);TB.tearDown();

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62782);TB.setUp();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62783);TB.testToString();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62784);TB.tearDown();

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62785);TB.setUp();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62786);TB.testDurationFields();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62787);TB.tearDown();

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62788);TB.setUp();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62789);TB.testDateFields();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62790);TB.tearDown();

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62791);TB.setUp();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62792);TB.testTimeFields();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62793);TB.tearDown();

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62794);TB.setUp();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62795);TB.testEpoch();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62796);TB.tearDown();

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62797);TB.setUp();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62798);TB.testEra();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62799);TB.tearDown();

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62800);TB.setUp();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62801);TB.testFieldConstructor();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62802);TB.tearDown();

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62803);TB.setUp();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62804);TB.testCalendar();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62805);TB.tearDown();

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62806);TB.setUp();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62807);TB.testSampleDate1();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62808);TB.tearDown();

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62809);TB.setUp();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62810);TB.testSampleDate2();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62811);TB.tearDown();

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62812);TB.setUp();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62813);TB.testSampleDate3();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62814);TB.tearDown();

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62815);TB.setUp();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62816);TB.testSampleDateWithZone();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62817);TB.tearDown();

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62818);TB.setUp();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62819);TB.test15BasedLeapYear();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62820);TB.tearDown();

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62821);TB.setUp();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62822);TB.test16BasedLeapYear();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62823);TB.tearDown();

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62824);TB.setUp();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62825);TB.testIndianBasedLeapYear();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62826);TB.tearDown();

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62827);TB.setUp();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62828);TB.testHabashAlHasibBasedLeapYear();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62829);TB.tearDown();

    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}


    /*
    public static TestSuite suite() {
        SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
        return new TestSuite(TestIslamicChronology.class);
    }

    public TestIslamicChronology(String name) {
        super(name);
    }
    */
    @Before
    public void setUp() throws Exception {try{__CLR4_4_11cfe1cfelgchosnq.R.inc(62830);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62831);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62832);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62833);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62834);originalLocale = Locale.getDefault();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62835);DateTimeZone.setDefault(LONDON);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62836);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62837);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11cfe1cfelgchosnq.R.inc(62838);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62839);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62840);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62841);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62842);Locale.setDefault(originalLocale);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62843);originalDateTimeZone = null;
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62844);originalTimeZone = null;
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62845);originalLocale = null;
    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactoryUTC() {__CLR4_4_11cfe1cfelgchosnq.R.globalSliceStart(getClass().getName(),62846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19knvhv1chq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cfe1cfelgchosnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cfe1cfelgchosnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFactoryUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19knvhv1chq(){try{__CLR4_4_11cfe1cfelgchosnq.R.inc(62846);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62847);assertEquals(DateTimeZone.UTC, IslamicChronology.getInstanceUTC().getZone());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62848);assertSame(IslamicChronology.class, IslamicChronology.getInstanceUTC().getClass());
    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}

    @Test
    public void testFactory() {__CLR4_4_11cfe1cfelgchosnq.R.globalSliceStart(getClass().getName(),62849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116tztt1cht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cfe1cfelgchosnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cfe1cfelgchosnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFactory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116tztt1cht(){try{__CLR4_4_11cfe1cfelgchosnq.R.inc(62849);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62850);assertEquals(LONDON, IslamicChronology.getInstance().getZone());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62851);assertSame(IslamicChronology.class, IslamicChronology.getInstance().getClass());
    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}

    @Test
    public void testFactory_Zone() {__CLR4_4_11cfe1cfelgchosnq.R.globalSliceStart(getClass().getName(),62852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yy5ime1chw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cfe1cfelgchosnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cfe1cfelgchosnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFactory_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yy5ime1chw(){try{__CLR4_4_11cfe1cfelgchosnq.R.inc(62852);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62853);assertEquals(TOKYO, IslamicChronology.getInstance(TOKYO).getZone());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62854);assertEquals(PARIS, IslamicChronology.getInstance(PARIS).getZone());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62855);assertEquals(LONDON, IslamicChronology.getInstance(null).getZone());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62856);assertSame(IslamicChronology.class, IslamicChronology.getInstance(TOKYO).getClass());
    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEquality() {__CLR4_4_11cfe1cfelgchosnq.R.globalSliceStart(getClass().getName(),62857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12agdql1ci1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cfe1cfelgchosnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cfe1cfelgchosnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testEquality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12agdql1ci1(){try{__CLR4_4_11cfe1cfelgchosnq.R.inc(62857);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62858);assertSame(IslamicChronology.getInstance(TOKYO), IslamicChronology.getInstance(TOKYO));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62859);assertSame(IslamicChronology.getInstance(LONDON), IslamicChronology.getInstance(LONDON));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62860);assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstance(PARIS));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62861);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstanceUTC());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62862);assertSame(IslamicChronology.getInstance(), IslamicChronology.getInstance(LONDON));
    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}

    @Test
    public void testWithUTC() {__CLR4_4_11cfe1cfelgchosnq.R.globalSliceStart(getClass().getName(),62863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19orv831ci7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cfe1cfelgchosnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cfe1cfelgchosnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testWithUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19orv831ci7(){try{__CLR4_4_11cfe1cfelgchosnq.R.inc(62863);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62864);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance(LONDON).withUTC());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62865);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance(TOKYO).withUTC());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62866);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstanceUTC().withUTC());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62867);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance().withUTC());
    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}

    @Test
    public void testWithZone() {__CLR4_4_11cfe1cfelgchosnq.R.globalSliceStart(getClass().getName(),62868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1me3iet1cic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cfe1cfelgchosnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cfe1cfelgchosnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testWithZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62868,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1me3iet1cic(){try{__CLR4_4_11cfe1cfelgchosnq.R.inc(62868);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62869);assertSame(IslamicChronology.getInstance(TOKYO), IslamicChronology.getInstance(TOKYO).withZone(TOKYO));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62870);assertSame(IslamicChronology.getInstance(LONDON), IslamicChronology.getInstance(TOKYO).withZone(LONDON));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62871);assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstance(TOKYO).withZone(PARIS));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62872);assertSame(IslamicChronology.getInstance(LONDON), IslamicChronology.getInstance(TOKYO).withZone(null));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62873);assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstance().withZone(PARIS));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62874);assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstanceUTC().withZone(PARIS));
    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_4_11cfe1cfelgchosnq.R.globalSliceStart(getClass().getName(),62875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1cij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cfe1cfelgchosnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cfe1cfelgchosnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62875,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1cij(){try{__CLR4_4_11cfe1cfelgchosnq.R.inc(62875);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62876);assertEquals("IslamicChronology[Europe/London]", IslamicChronology.getInstance(LONDON).toString());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62877);assertEquals("IslamicChronology[Asia/Tokyo]", IslamicChronology.getInstance(TOKYO).toString());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62878);assertEquals("IslamicChronology[Europe/London]", IslamicChronology.getInstance().toString());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62879);assertEquals("IslamicChronology[UTC]", IslamicChronology.getInstanceUTC().toString());
    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDurationFields() {__CLR4_4_11cfe1cfelgchosnq.R.globalSliceStart(getClass().getName(),62880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnkzye1cio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cfe1cfelgchosnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cfe1cfelgchosnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testDurationFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnkzye1cio(){try{__CLR4_4_11cfe1cfelgchosnq.R.inc(62880);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62881);final IslamicChronology islamic = IslamicChronology.getInstance();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62882);assertEquals("eras", islamic.eras().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62883);assertEquals("centuries", islamic.centuries().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62884);assertEquals("years", islamic.years().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62885);assertEquals("weekyears", islamic.weekyears().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62886);assertEquals("months", islamic.months().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62887);assertEquals("weeks", islamic.weeks().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62888);assertEquals("days", islamic.days().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62889);assertEquals("halfdays", islamic.halfdays().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62890);assertEquals("hours", islamic.hours().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62891);assertEquals("minutes", islamic.minutes().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62892);assertEquals("seconds", islamic.seconds().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62893);assertEquals("millis", islamic.millis().getName());

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62894);assertEquals(false, islamic.eras().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62895);assertEquals(true, islamic.centuries().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62896);assertEquals(true, islamic.years().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62897);assertEquals(true, islamic.weekyears().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62898);assertEquals(true, islamic.months().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62899);assertEquals(true, islamic.weeks().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62900);assertEquals(true, islamic.days().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62901);assertEquals(true, islamic.halfdays().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62902);assertEquals(true, islamic.hours().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62903);assertEquals(true, islamic.minutes().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62904);assertEquals(true, islamic.seconds().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62905);assertEquals(true, islamic.millis().isSupported());

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62906);assertEquals(false, islamic.centuries().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62907);assertEquals(false, islamic.years().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62908);assertEquals(false, islamic.weekyears().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62909);assertEquals(false, islamic.months().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62910);assertEquals(false, islamic.weeks().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62911);assertEquals(false, islamic.days().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62912);assertEquals(false, islamic.halfdays().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62913);assertEquals(true, islamic.hours().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62914);assertEquals(true, islamic.minutes().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62915);assertEquals(true, islamic.seconds().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62916);assertEquals(true, islamic.millis().isPrecise());

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62917);final IslamicChronology islamicUTC = IslamicChronology.getInstanceUTC();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62918);assertEquals(false, islamicUTC.centuries().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62919);assertEquals(false, islamicUTC.years().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62920);assertEquals(false, islamicUTC.weekyears().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62921);assertEquals(false, islamicUTC.months().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62922);assertEquals(true, islamicUTC.weeks().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62923);assertEquals(true, islamicUTC.days().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62924);assertEquals(true, islamicUTC.halfdays().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62925);assertEquals(true, islamicUTC.hours().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62926);assertEquals(true, islamicUTC.minutes().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62927);assertEquals(true, islamicUTC.seconds().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62928);assertEquals(true, islamicUTC.millis().isPrecise());

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62929);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62930);final IslamicChronology islamicGMT = IslamicChronology.getInstance(gmt);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62931);assertEquals(false, islamicGMT.centuries().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62932);assertEquals(false, islamicGMT.years().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62933);assertEquals(false, islamicGMT.weekyears().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62934);assertEquals(false, islamicGMT.months().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62935);assertEquals(true, islamicGMT.weeks().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62936);assertEquals(true, islamicGMT.days().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62937);assertEquals(true, islamicGMT.halfdays().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62938);assertEquals(true, islamicGMT.hours().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62939);assertEquals(true, islamicGMT.minutes().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62940);assertEquals(true, islamicGMT.seconds().isPrecise());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62941);assertEquals(true, islamicGMT.millis().isPrecise());
    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}


    @Test
    public void testDateFields() {__CLR4_4_11cfe1cfelgchosnq.R.globalSliceStart(getClass().getName(),62942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gkspeo1cke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cfe1cfelgchosnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cfe1cfelgchosnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testDateFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62942,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gkspeo1cke(){try{__CLR4_4_11cfe1cfelgchosnq.R.inc(62942);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62943);final IslamicChronology islamic = IslamicChronology.getInstance();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62944);assertEquals("era", islamic.era().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62945);assertEquals("centuryOfEra", islamic.centuryOfEra().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62946);assertEquals("yearOfCentury", islamic.yearOfCentury().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62947);assertEquals("yearOfEra", islamic.yearOfEra().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62948);assertEquals("year", islamic.year().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62949);assertEquals("monthOfYear", islamic.monthOfYear().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62950);assertEquals("weekyearOfCentury", islamic.weekyearOfCentury().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62951);assertEquals("weekyear", islamic.weekyear().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62952);assertEquals("weekOfWeekyear", islamic.weekOfWeekyear().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62953);assertEquals("dayOfYear", islamic.dayOfYear().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62954);assertEquals("dayOfMonth", islamic.dayOfMonth().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62955);assertEquals("dayOfWeek", islamic.dayOfWeek().getName());

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62956);assertEquals(true, islamic.era().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62957);assertEquals(true, islamic.centuryOfEra().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62958);assertEquals(true, islamic.yearOfCentury().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62959);assertEquals(true, islamic.yearOfEra().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62960);assertEquals(true, islamic.year().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62961);assertEquals(true, islamic.monthOfYear().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62962);assertEquals(true, islamic.weekyearOfCentury().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62963);assertEquals(true, islamic.weekyear().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62964);assertEquals(true, islamic.weekOfWeekyear().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62965);assertEquals(true, islamic.dayOfYear().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62966);assertEquals(true, islamic.dayOfMonth().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62967);assertEquals(true, islamic.dayOfWeek().isSupported());

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62968);assertEquals(islamic.eras(), islamic.era().getDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62969);assertEquals(islamic.centuries(), islamic.centuryOfEra().getDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62970);assertEquals(islamic.years(), islamic.yearOfCentury().getDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62971);assertEquals(islamic.years(), islamic.yearOfEra().getDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62972);assertEquals(islamic.years(), islamic.year().getDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62973);assertEquals(islamic.months(), islamic.monthOfYear().getDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62974);assertEquals(islamic.weekyears(), islamic.weekyearOfCentury().getDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62975);assertEquals(islamic.weekyears(), islamic.weekyear().getDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62976);assertEquals(islamic.weeks(), islamic.weekOfWeekyear().getDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62977);assertEquals(islamic.days(), islamic.dayOfYear().getDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62978);assertEquals(islamic.days(), islamic.dayOfMonth().getDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62979);assertEquals(islamic.days(), islamic.dayOfWeek().getDurationField());

        __CLR4_4_11cfe1cfelgchosnq.R.inc(62980);assertEquals(null, islamic.era().getRangeDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62981);assertEquals(islamic.eras(), islamic.centuryOfEra().getRangeDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62982);assertEquals(islamic.centuries(), islamic.yearOfCentury().getRangeDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62983);assertEquals(islamic.eras(), islamic.yearOfEra().getRangeDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62984);assertEquals(null, islamic.year().getRangeDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62985);assertEquals(islamic.years(), islamic.monthOfYear().getRangeDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62986);assertEquals(islamic.centuries(), islamic.weekyearOfCentury().getRangeDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62987);assertEquals(null, islamic.weekyear().getRangeDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62988);assertEquals(islamic.weekyears(), islamic.weekOfWeekyear().getRangeDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62989);assertEquals(islamic.years(), islamic.dayOfYear().getRangeDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62990);assertEquals(islamic.months(), islamic.dayOfMonth().getRangeDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62991);assertEquals(islamic.weeks(), islamic.dayOfWeek().getRangeDurationField());
    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}

    @Test
    public void testTimeFields() {__CLR4_4_11cfe1cfelgchosnq.R.globalSliceStart(getClass().getName(),62992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r11up1cls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cfe1cfelgchosnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cfe1cfelgchosnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testTimeFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r11up1cls(){try{__CLR4_4_11cfe1cfelgchosnq.R.inc(62992);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62993);final IslamicChronology islamic = IslamicChronology.getInstance();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62994);assertEquals("halfdayOfDay", islamic.halfdayOfDay().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62995);assertEquals("clockhourOfHalfday", islamic.clockhourOfHalfday().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62996);assertEquals("hourOfHalfday", islamic.hourOfHalfday().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62997);assertEquals("clockhourOfDay", islamic.clockhourOfDay().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62998);assertEquals("hourOfDay", islamic.hourOfDay().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(62999);assertEquals("minuteOfDay", islamic.minuteOfDay().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63000);assertEquals("minuteOfHour", islamic.minuteOfHour().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63001);assertEquals("secondOfDay", islamic.secondOfDay().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63002);assertEquals("secondOfMinute", islamic.secondOfMinute().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63003);assertEquals("millisOfDay", islamic.millisOfDay().getName());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63004);assertEquals("millisOfSecond", islamic.millisOfSecond().getName());

        __CLR4_4_11cfe1cfelgchosnq.R.inc(63005);assertEquals(true, islamic.halfdayOfDay().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63006);assertEquals(true, islamic.clockhourOfHalfday().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63007);assertEquals(true, islamic.hourOfHalfday().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63008);assertEquals(true, islamic.clockhourOfDay().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63009);assertEquals(true, islamic.hourOfDay().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63010);assertEquals(true, islamic.minuteOfDay().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63011);assertEquals(true, islamic.minuteOfHour().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63012);assertEquals(true, islamic.secondOfDay().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63013);assertEquals(true, islamic.secondOfMinute().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63014);assertEquals(true, islamic.millisOfDay().isSupported());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63015);assertEquals(true, islamic.millisOfSecond().isSupported());
    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEpoch() {__CLR4_4_11cfe1cfelgchosnq.R.globalSliceStart(getClass().getName(),63016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19p7wci1cmg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cfe1cfelgchosnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cfe1cfelgchosnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testEpoch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19p7wci1cmg(){try{__CLR4_4_11cfe1cfelgchosnq.R.inc(63016);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63017);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ISLAMIC_UTC);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63018);DateTime expectedEpoch = new DateTime(622, 7, 16, 0, 0, 0, 0, JULIAN_UTC);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63019);assertEquals(expectedEpoch.getMillis(), epoch.getMillis());
    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}

    @Test
    public void testEra() {__CLR4_4_11cfe1cfelgchosnq.R.globalSliceStart(getClass().getName(),63020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13euvzd1cmk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cfe1cfelgchosnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cfe1cfelgchosnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13euvzd1cmk(){try{__CLR4_4_11cfe1cfelgchosnq.R.inc(63020);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63021);assertEquals(1, IslamicChronology.AH);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63022);try {
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63023);new DateTime(-1, 13, 5, 0, 0, 0, 0, ISLAMIC_UTC);
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63024);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFieldConstructor() {__CLR4_4_11cfe1cfelgchosnq.R.globalSliceStart(getClass().getName(),63025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1suazq11cmp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cfe1cfelgchosnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cfe1cfelgchosnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFieldConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63025,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1suazq11cmp(){try{__CLR4_4_11cfe1cfelgchosnq.R.inc(63025);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63026);DateTime date = new DateTime(1364, 12, 6, 0, 0, 0, 0, ISLAMIC_UTC);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63027);DateTime expectedDate = new DateTime(1945, 11, 12, 0, 0, 0, 0, ISO_UTC);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63028);assertEquals(expectedDate.getMillis(), date.getMillis());
    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    @Test
    public void testCalendar() {__CLR4_4_11cfe1cfelgchosnq.R.globalSliceStart(getClass().getName(),63029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1odnsqf1cmt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cfe1cfelgchosnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cfe1cfelgchosnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testCalendar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63029,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1odnsqf1cmt(){try{__CLR4_4_11cfe1cfelgchosnq.R.inc(63029);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63030);if ((((TestAll.FAST)&&(__CLR4_4_11cfe1cfelgchosnq.R.iget(63031)!=0|true))||(__CLR4_4_11cfe1cfelgchosnq.R.iget(63032)==0&false))) {{
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63033);return;
        }
        }__CLR4_4_11cfe1cfelgchosnq.R.inc(63034);System.out.println("\nTestIslamicChronology.testCalendar");
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63035);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ISLAMIC_UTC);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63036);long millis = epoch.getMillis();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63037);long end = new DateTime(3000, 1, 1, 0, 0, 0, 0, ISO_UTC).getMillis();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63038);DateTimeField dayOfWeek = ISLAMIC_UTC.dayOfWeek();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63039);DateTimeField dayOfYear = ISLAMIC_UTC.dayOfYear();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63040);DateTimeField dayOfMonth = ISLAMIC_UTC.dayOfMonth();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63041);DateTimeField monthOfYear = ISLAMIC_UTC.monthOfYear();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63042);DateTimeField year = ISLAMIC_UTC.year();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63043);DateTimeField yearOfEra = ISLAMIC_UTC.yearOfEra();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63044);DateTimeField era = ISLAMIC_UTC.era();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63045);int expectedDOW = new DateTime(622, 7, 16, 0, 0, 0, 0, JULIAN_UTC).getDayOfWeek();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63046);int expectedDOY = 1;
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63047);int expectedDay = 1;
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63048);int expectedMonth = 1;
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63049);int expectedYear = 1;
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63050);while ((((millis < end)&&(__CLR4_4_11cfe1cfelgchosnq.R.iget(63051)!=0|true))||(__CLR4_4_11cfe1cfelgchosnq.R.iget(63052)==0&false))) {{
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63053);int dowValue = dayOfWeek.get(millis);
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63054);int doyValue = dayOfYear.get(millis);
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63055);int dayValue = dayOfMonth.get(millis);
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63056);int monthValue = monthOfYear.get(millis);
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63057);int yearValue = year.get(millis);
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63058);int yearOfEraValue = yearOfEra.get(millis);
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63059);int dayOfYearLen = dayOfYear.getMaximumValue(millis);
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63060);int monthLen = dayOfMonth.getMaximumValue(millis);
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63061);if ((((monthValue < 1 || monthValue > 12)&&(__CLR4_4_11cfe1cfelgchosnq.R.iget(63062)!=0|true))||(__CLR4_4_11cfe1cfelgchosnq.R.iget(63063)==0&false))) {{
                __CLR4_4_11cfe1cfelgchosnq.R.inc(63064);fail("Bad month: " + millis);
            }

            // test era
            }__CLR4_4_11cfe1cfelgchosnq.R.inc(63065);assertEquals(1, era.get(millis));
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63066);assertEquals("AH", era.getAsText(millis));
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63067);assertEquals("AH", era.getAsShortText(millis));

            // test date
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63068);assertEquals(expectedDOY, doyValue);
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63069);assertEquals(expectedMonth, monthValue);
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63070);assertEquals(expectedDay, dayValue);
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63071);assertEquals(expectedDOW, dowValue);
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63072);assertEquals(expectedYear, yearValue);
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63073);assertEquals(expectedYear, yearOfEraValue);

            // test leap year
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63074);boolean leap = ((11 * yearValue + 14) % 30) < 11;
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63075);assertEquals(leap, year.isLeap(millis));

            // test month length
            boolean __CLB4_4_1_bool0=false;__CLR4_4_11cfe1cfelgchosnq.R.inc(63076);switch (monthValue) {
                case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_11cfe1cfelgchosnq.R.inc(63077);__CLB4_4_1_bool0=true;}
                case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_11cfe1cfelgchosnq.R.inc(63078);__CLB4_4_1_bool0=true;}
                case 5:if (!__CLB4_4_1_bool0) {__CLR4_4_11cfe1cfelgchosnq.R.inc(63079);__CLB4_4_1_bool0=true;}
                case 7:if (!__CLB4_4_1_bool0) {__CLR4_4_11cfe1cfelgchosnq.R.inc(63080);__CLB4_4_1_bool0=true;}
                case 9:if (!__CLB4_4_1_bool0) {__CLR4_4_11cfe1cfelgchosnq.R.inc(63081);__CLB4_4_1_bool0=true;}
                case 11:if (!__CLB4_4_1_bool0) {__CLR4_4_11cfe1cfelgchosnq.R.inc(63082);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11cfe1cfelgchosnq.R.inc(63083);assertEquals(30, monthLen);
                    __CLR4_4_11cfe1cfelgchosnq.R.inc(63084);break;
                case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_11cfe1cfelgchosnq.R.inc(63085);__CLB4_4_1_bool0=true;}
                case 4:if (!__CLB4_4_1_bool0) {__CLR4_4_11cfe1cfelgchosnq.R.inc(63086);__CLB4_4_1_bool0=true;}
                case 6:if (!__CLB4_4_1_bool0) {__CLR4_4_11cfe1cfelgchosnq.R.inc(63087);__CLB4_4_1_bool0=true;}
                case 8:if (!__CLB4_4_1_bool0) {__CLR4_4_11cfe1cfelgchosnq.R.inc(63088);__CLB4_4_1_bool0=true;}
                case 10:if (!__CLB4_4_1_bool0) {__CLR4_4_11cfe1cfelgchosnq.R.inc(63089);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11cfe1cfelgchosnq.R.inc(63090);assertEquals(29, monthLen);
                    __CLR4_4_11cfe1cfelgchosnq.R.inc(63091);break;
                case 12:if (!__CLB4_4_1_bool0) {__CLR4_4_11cfe1cfelgchosnq.R.inc(63092);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11cfe1cfelgchosnq.R.inc(63093);assertEquals(((((leap )&&(__CLR4_4_11cfe1cfelgchosnq.R.iget(63094)!=0|true))||(__CLR4_4_11cfe1cfelgchosnq.R.iget(63095)==0&false))? 30 : 29), monthLen);
                    __CLR4_4_11cfe1cfelgchosnq.R.inc(63096);break;
            }

            // test year length
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63097);assertEquals(((((leap )&&(__CLR4_4_11cfe1cfelgchosnq.R.iget(63098)!=0|true))||(__CLR4_4_11cfe1cfelgchosnq.R.iget(63099)==0&false))? 355 : 354), dayOfYearLen);

            // recalculate date
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63100);expectedDOW = (((expectedDOW + 1) - 1) % 7) + 1;
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63101);expectedDay++;
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63102);expectedDOY++;
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63103);if ((((expectedDay > monthLen)&&(__CLR4_4_11cfe1cfelgchosnq.R.iget(63104)!=0|true))||(__CLR4_4_11cfe1cfelgchosnq.R.iget(63105)==0&false))) {{
                __CLR4_4_11cfe1cfelgchosnq.R.inc(63106);expectedDay = 1;
                __CLR4_4_11cfe1cfelgchosnq.R.inc(63107);expectedMonth++;
                __CLR4_4_11cfe1cfelgchosnq.R.inc(63108);if ((((expectedMonth == 13)&&(__CLR4_4_11cfe1cfelgchosnq.R.iget(63109)!=0|true))||(__CLR4_4_11cfe1cfelgchosnq.R.iget(63110)==0&false))) {{
                    __CLR4_4_11cfe1cfelgchosnq.R.inc(63111);expectedMonth = 1;
                    __CLR4_4_11cfe1cfelgchosnq.R.inc(63112);expectedDOY = 1;
                    __CLR4_4_11cfe1cfelgchosnq.R.inc(63113);expectedYear++;
                }
            }}
            }__CLR4_4_11cfe1cfelgchosnq.R.inc(63114);millis += SKIP;
            __CLR4_4_11cfe1cfelgchosnq.R.inc(63115);break; // SBH:added this line to exit from loop, this was only required to generate a smaller trace
        }
    }}finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}


    @Test
    public void testSampleDate1() {__CLR4_4_11cfe1cfelgchosnq.R.globalSliceStart(getClass().getName(),63116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1c24y1cp8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cfe1cfelgchosnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cfe1cfelgchosnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDate1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63116,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1c24y1cp8(){try{__CLR4_4_11cfe1cfelgchosnq.R.inc(63116);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63117);DateTime dt = new DateTime(1945, 11, 12, 0, 0, 0, 0, ISO_UTC);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63118);dt = dt.withChronology(ISLAMIC_UTC);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63119);assertEquals(IslamicChronology.AH, dt.getEra());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63120);assertEquals(14, dt.getCenturyOfEra());  // TODO confirm
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63121);assertEquals(64, dt.getYearOfCentury());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63122);assertEquals(1364, dt.getYearOfEra());

        __CLR4_4_11cfe1cfelgchosnq.R.inc(63123);assertEquals(1364, dt.getYear());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63124);Property fld = dt.year();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63125);assertEquals(false, fld.isLeap());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63126);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63127);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63128);assertEquals(new DateTime(1365, 12, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1));

        __CLR4_4_11cfe1cfelgchosnq.R.inc(63129);assertEquals(12, dt.getMonthOfYear());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63130);fld = dt.monthOfYear();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63131);assertEquals(false, fld.isLeap());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63132);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63133);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63134);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63135);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63136);assertEquals(12, fld.getMaximumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63137);assertEquals(12, fld.getMaximumValueOverall());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63138);assertEquals(new DateTime(1365, 1, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63139);assertEquals(new DateTime(1364, 1, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addWrapFieldToCopy(1));

        __CLR4_4_11cfe1cfelgchosnq.R.inc(63140);assertEquals(6, dt.getDayOfMonth());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63141);fld = dt.dayOfMonth();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63142);assertEquals(false, fld.isLeap());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63143);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63144);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63145);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63146);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63147);assertEquals(29, fld.getMaximumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63148);assertEquals(30, fld.getMaximumValueOverall());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63149);assertEquals(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1));

        __CLR4_4_11cfe1cfelgchosnq.R.inc(63150);assertEquals(DateTimeConstants.MONDAY, dt.getDayOfWeek());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63151);fld = dt.dayOfWeek();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63152);assertEquals(false, fld.isLeap());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63153);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63154);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63155);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63156);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63157);assertEquals(7, fld.getMaximumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63158);assertEquals(7, fld.getMaximumValueOverall());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63159);assertEquals(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1));

        __CLR4_4_11cfe1cfelgchosnq.R.inc(63160);assertEquals(6 * 30 + 5 * 29 + 6, dt.getDayOfYear());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63161);fld = dt.dayOfYear();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63162);assertEquals(false, fld.isLeap());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63163);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63164);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63165);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63166);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63167);assertEquals(354, fld.getMaximumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63168);assertEquals(355, fld.getMaximumValueOverall());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63169);assertEquals(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1));

        __CLR4_4_11cfe1cfelgchosnq.R.inc(63170);assertEquals(0, dt.getHourOfDay());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63171);assertEquals(0, dt.getMinuteOfHour());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63172);assertEquals(0, dt.getSecondOfMinute());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63173);assertEquals(0, dt.getMillisOfSecond());
    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}

    @Test
    public void testSampleDate2() {__CLR4_4_11cfe1cfelgchosnq.R.globalSliceStart(getClass().getName(),63174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1osc3ch1cqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cfe1cfelgchosnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cfe1cfelgchosnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDate2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1osc3ch1cqu(){try{__CLR4_4_11cfe1cfelgchosnq.R.inc(63174);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63175);DateTime dt = new DateTime(2005, 11, 26, 0, 0, 0, 0, ISO_UTC);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63176);dt = dt.withChronology(ISLAMIC_UTC);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63177);assertEquals(IslamicChronology.AH, dt.getEra());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63178);assertEquals(15, dt.getCenturyOfEra());  // TODO confirm
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63179);assertEquals(26, dt.getYearOfCentury());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63180);assertEquals(1426, dt.getYearOfEra());

        __CLR4_4_11cfe1cfelgchosnq.R.inc(63181);assertEquals(1426, dt.getYear());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63182);Property fld = dt.year();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63183);assertEquals(true, fld.isLeap());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63184);assertEquals(1, fld.getLeapAmount());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63185);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType());

        __CLR4_4_11cfe1cfelgchosnq.R.inc(63186);assertEquals(10, dt.getMonthOfYear());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63187);fld = dt.monthOfYear();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63188);assertEquals(false, fld.isLeap());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63189);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63190);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63191);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63192);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63193);assertEquals(12, fld.getMaximumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63194);assertEquals(12, fld.getMaximumValueOverall());

        __CLR4_4_11cfe1cfelgchosnq.R.inc(63195);assertEquals(24, dt.getDayOfMonth());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63196);fld = dt.dayOfMonth();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63197);assertEquals(false, fld.isLeap());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63198);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63199);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63200);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63201);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63202);assertEquals(29, fld.getMaximumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63203);assertEquals(30, fld.getMaximumValueOverall());

        __CLR4_4_11cfe1cfelgchosnq.R.inc(63204);assertEquals(DateTimeConstants.SATURDAY, dt.getDayOfWeek());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63205);fld = dt.dayOfWeek();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63206);assertEquals(false, fld.isLeap());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63207);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63208);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63209);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63210);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63211);assertEquals(7, fld.getMaximumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63212);assertEquals(7, fld.getMaximumValueOverall());

        __CLR4_4_11cfe1cfelgchosnq.R.inc(63213);assertEquals(5 * 30 + 4 * 29 + 24, dt.getDayOfYear());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63214);fld = dt.dayOfYear();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63215);assertEquals(false, fld.isLeap());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63216);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63217);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63218);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63219);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63220);assertEquals(355, fld.getMaximumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63221);assertEquals(355, fld.getMaximumValueOverall());

        __CLR4_4_11cfe1cfelgchosnq.R.inc(63222);assertEquals(0, dt.getHourOfDay());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63223);assertEquals(0, dt.getMinuteOfHour());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63224);assertEquals(0, dt.getSecondOfMinute());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63225);assertEquals(0, dt.getMillisOfSecond());
    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}


    @Test
    public void testSampleDate3() {__CLR4_4_11cfe1cfelgchosnq.R.globalSliceStart(getClass().getName(),63226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ljc4k01csa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cfe1cfelgchosnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cfe1cfelgchosnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDate3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ljc4k01csa(){try{__CLR4_4_11cfe1cfelgchosnq.R.inc(63226);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63227);DateTime dt = new DateTime(1426, 12, 24, 0, 0, 0, 0, ISLAMIC_UTC);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63228);assertEquals(IslamicChronology.AH, dt.getEra());

        __CLR4_4_11cfe1cfelgchosnq.R.inc(63229);assertEquals(1426, dt.getYear());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63230);Property fld = dt.year();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63231);assertEquals(true, fld.isLeap());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63232);assertEquals(1, fld.getLeapAmount());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63233);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType());

        __CLR4_4_11cfe1cfelgchosnq.R.inc(63234);assertEquals(12, dt.getMonthOfYear());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63235);fld = dt.monthOfYear();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63236);assertEquals(true, fld.isLeap());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63237);assertEquals(1, fld.getLeapAmount());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63238);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63239);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63240);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63241);assertEquals(12, fld.getMaximumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63242);assertEquals(12, fld.getMaximumValueOverall());

        __CLR4_4_11cfe1cfelgchosnq.R.inc(63243);assertEquals(24, dt.getDayOfMonth());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63244);fld = dt.dayOfMonth();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63245);assertEquals(false, fld.isLeap());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63246);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63247);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63248);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63249);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63250);assertEquals(30, fld.getMaximumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63251);assertEquals(30, fld.getMaximumValueOverall());

        __CLR4_4_11cfe1cfelgchosnq.R.inc(63252);assertEquals(DateTimeConstants.TUESDAY, dt.getDayOfWeek());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63253);fld = dt.dayOfWeek();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63254);assertEquals(false, fld.isLeap());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63255);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63256);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63257);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63258);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63259);assertEquals(7, fld.getMaximumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63260);assertEquals(7, fld.getMaximumValueOverall());

        __CLR4_4_11cfe1cfelgchosnq.R.inc(63261);assertEquals(6 * 30 + 5 * 29 + 24, dt.getDayOfYear());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63262);fld = dt.dayOfYear();
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63263);assertEquals(false, fld.isLeap());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63264);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63265);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63266);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63267);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63268);assertEquals(355, fld.getMaximumValue());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63269);assertEquals(355, fld.getMaximumValueOverall());

        __CLR4_4_11cfe1cfelgchosnq.R.inc(63270);assertEquals(0, dt.getHourOfDay());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63271);assertEquals(0, dt.getMinuteOfHour());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63272);assertEquals(0, dt.getSecondOfMinute());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63273);assertEquals(0, dt.getMillisOfSecond());
    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}


    @Test
    public void testSampleDateWithZone() {__CLR4_4_11cfe1cfelgchosnq.R.globalSliceStart(getClass().getName(),63274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gh4f6l1ctm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cfe1cfelgchosnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cfe1cfelgchosnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDateWithZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63274,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gh4f6l1ctm(){try{__CLR4_4_11cfe1cfelgchosnq.R.inc(63274);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63275);DateTime dt = new DateTime(2005, 11, 26, 12, 0, 0, 0, PARIS).withChronology(ISLAMIC_UTC);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63276);assertEquals(IslamicChronology.AH, dt.getEra());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63277);assertEquals(1426, dt.getYear());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63278);assertEquals(10, dt.getMonthOfYear());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63279);assertEquals(24, dt.getDayOfMonth());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63280);assertEquals(11, dt.getHourOfDay());  // PARIS is UTC+1 in summer (12-1=11)
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63281);assertEquals(0, dt.getMinuteOfHour());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63282);assertEquals(0, dt.getSecondOfMinute());
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63283);assertEquals(0, dt.getMillisOfSecond());
    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}

    @Test
    public void test15BasedLeapYear() {__CLR4_4_11cfe1cfelgchosnq.R.globalSliceStart(getClass().getName(),63284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1isr1131ctw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cfe1cfelgchosnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cfe1cfelgchosnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.test15BasedLeapYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1isr1131ctw(){try{__CLR4_4_11cfe1cfelgchosnq.R.inc(63284);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63285);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(1));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63286);assertEquals(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(2));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63287);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(3));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63288);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(4));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63289);assertEquals(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(5));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63290);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(6));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63291);assertEquals(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(7));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63292);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(8));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63293);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(9));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63294);assertEquals(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(10));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63295);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(11));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63296);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(12));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63297);assertEquals(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(13));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63298);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(14));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63299);assertEquals(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(15));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63300);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(16));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63301);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(17));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63302);assertEquals(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(18));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63303);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(19));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63304);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(20));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63305);assertEquals(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(21));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63306);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(22));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63307);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(23));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63308);assertEquals(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(24));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63309);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(25));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63310);assertEquals(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(26));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63311);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(27));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63312);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(28));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63313);assertEquals(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(29));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63314);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(30));
    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}

    @Test
    public void test16BasedLeapYear() {__CLR4_4_11cfe1cfelgchosnq.R.globalSliceStart(getClass().getName(),63315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vn9eiw1cur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cfe1cfelgchosnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cfe1cfelgchosnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.test16BasedLeapYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vn9eiw1cur(){try{__CLR4_4_11cfe1cfelgchosnq.R.inc(63315);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63316);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(1));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63317);assertEquals(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(2));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63318);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(3));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63319);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(4));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63320);assertEquals(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(5));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63321);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(6));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63322);assertEquals(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(7));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63323);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(8));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63324);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(9));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63325);assertEquals(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(10));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63326);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(11));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63327);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(12));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63328);assertEquals(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(13));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63329);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(14));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63330);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(15));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63331);assertEquals(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(16));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63332);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(17));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63333);assertEquals(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(18));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63334);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(19));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63335);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(20));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63336);assertEquals(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(21));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63337);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(22));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63338);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(23));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63339);assertEquals(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(24));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63340);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(25));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63341);assertEquals(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(26));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63342);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(27));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63343);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(28));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63344);assertEquals(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(29));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63345);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(30));
    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}

    @Test
    public void testIndianBasedLeapYear() {__CLR4_4_11cfe1cfelgchosnq.R.globalSliceStart(getClass().getName(),63346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ekitrq1cvm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cfe1cfelgchosnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cfe1cfelgchosnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testIndianBasedLeapYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ekitrq1cvm(){try{__CLR4_4_11cfe1cfelgchosnq.R.inc(63346);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63347);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(1));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63348);assertEquals(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(2));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63349);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(3));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63350);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(4));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63351);assertEquals(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(5));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63352);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(6));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63353);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(7));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63354);assertEquals(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(8));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63355);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(9));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63356);assertEquals(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(10));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63357);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(11));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63358);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(12));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63359);assertEquals(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(13));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63360);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(14));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63361);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(15));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63362);assertEquals(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(16));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63363);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(17));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63364);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(18));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63365);assertEquals(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(19));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63366);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(20));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63367);assertEquals(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(21));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63368);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(22));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63369);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(23));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63370);assertEquals(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(24));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63371);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(25));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63372);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(26));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63373);assertEquals(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(27));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63374);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(28));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63375);assertEquals(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(29));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63376);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(30));
    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}

    @Test
    public void testHabashAlHasibBasedLeapYear() {__CLR4_4_11cfe1cfelgchosnq.R.globalSliceStart(getClass().getName(),63377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ghpnhy1cwh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cfe1cfelgchosnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cfe1cfelgchosnq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testHabashAlHasibBasedLeapYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63377,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ghpnhy1cwh(){try{__CLR4_4_11cfe1cfelgchosnq.R.inc(63377);
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63378);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(1));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63379);assertEquals(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(2));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63380);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(3));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63381);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(4));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63382);assertEquals(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(5));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63383);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(6));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63384);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(7));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63385);assertEquals(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(8));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63386);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(9));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63387);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(10));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63388);assertEquals(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(11));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63389);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(12));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63390);assertEquals(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(13));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63391);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(14));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63392);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(15));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63393);assertEquals(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(16));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63394);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(17));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63395);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(18));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63396);assertEquals(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(19));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63397);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(20));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63398);assertEquals(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(21));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63399);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(22));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63400);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(23));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63401);assertEquals(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(24));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63402);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(25));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63403);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(26));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63404);assertEquals(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(27));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63405);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(28));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63406);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(29));
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63407);assertEquals(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(30));

        /* test Leap Year Pattern an7s */
        __CLR4_4_11cfe1cfelgchosnq.R.inc(63408);assertEquals(3, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.index);
    }finally{__CLR4_4_11cfe1cfelgchosnq.R.flushNeeded();}}

}
