/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2014 Stephen Colebourne
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
import org.joda.time.DateTime.Property;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is a Junit unit test for CopticChronology.
 *
 * @author Stephen Colebourne
 */
public class TestCopticChronology {static class __CLR4_4_11arf1arflgchoslq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,61101,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;//extends TestCase {

    private static final int MILLIS_PER_DAY = DateTimeConstants.MILLIS_PER_DAY;

    private static long SKIP = 1 * MILLIS_PER_DAY;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 +
            365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11arf1arflgchoslq.R.inc(60603);

        __CLR4_4_11arf1arflgchoslq.R.inc(60604);SKIP = 1 * MILLIS_PER_DAY;
        //junit.textui.TestRunner.run(suite());
        __CLR4_4_11arf1arflgchoslq.R.inc(60605);TestCopticChronology TB = new TestCopticChronology();

        __CLR4_4_11arf1arflgchoslq.R.inc(60606);TB.setUp();
        __CLR4_4_11arf1arflgchoslq.R.inc(60607);TB.testFactoryUTC();
        __CLR4_4_11arf1arflgchoslq.R.inc(60608);TB.tearDown();

        __CLR4_4_11arf1arflgchoslq.R.inc(60609);TB.setUp();
        __CLR4_4_11arf1arflgchoslq.R.inc(60610);TB.testFactory();
        __CLR4_4_11arf1arflgchoslq.R.inc(60611);TB.tearDown();

        __CLR4_4_11arf1arflgchoslq.R.inc(60612);TB.setUp();
        __CLR4_4_11arf1arflgchoslq.R.inc(60613);TB.testFactory_Zone();
        __CLR4_4_11arf1arflgchoslq.R.inc(60614);TB.tearDown();

        __CLR4_4_11arf1arflgchoslq.R.inc(60615);TB.setUp();
        __CLR4_4_11arf1arflgchoslq.R.inc(60616);TB.testEquality();
        __CLR4_4_11arf1arflgchoslq.R.inc(60617);TB.tearDown();


        __CLR4_4_11arf1arflgchoslq.R.inc(60618);TB.setUp();
        __CLR4_4_11arf1arflgchoslq.R.inc(60619);TB.testWithUTC();
        __CLR4_4_11arf1arflgchoslq.R.inc(60620);TB.tearDown();

        __CLR4_4_11arf1arflgchoslq.R.inc(60621);TB.setUp();
        __CLR4_4_11arf1arflgchoslq.R.inc(60622);TB.testWithZone();
        __CLR4_4_11arf1arflgchoslq.R.inc(60623);TB.tearDown();

        __CLR4_4_11arf1arflgchoslq.R.inc(60624);TB.setUp();
        __CLR4_4_11arf1arflgchoslq.R.inc(60625);TB.testToString();
        __CLR4_4_11arf1arflgchoslq.R.inc(60626);TB.tearDown();


        __CLR4_4_11arf1arflgchoslq.R.inc(60627);TB.setUp();
        __CLR4_4_11arf1arflgchoslq.R.inc(60628);TB.testDurationFields();
        __CLR4_4_11arf1arflgchoslq.R.inc(60629);TB.tearDown();

        __CLR4_4_11arf1arflgchoslq.R.inc(60630);TB.setUp();
        __CLR4_4_11arf1arflgchoslq.R.inc(60631);TB.testDateFields();
        __CLR4_4_11arf1arflgchoslq.R.inc(60632);TB.tearDown();

        __CLR4_4_11arf1arflgchoslq.R.inc(60633);TB.setUp();
        __CLR4_4_11arf1arflgchoslq.R.inc(60634);TB.testTimeFields();
        __CLR4_4_11arf1arflgchoslq.R.inc(60635);TB.tearDown();

        __CLR4_4_11arf1arflgchoslq.R.inc(60636);TB.setUp();
        __CLR4_4_11arf1arflgchoslq.R.inc(60637);TB.testEpoch();
        __CLR4_4_11arf1arflgchoslq.R.inc(60638);TB.tearDown();

        __CLR4_4_11arf1arflgchoslq.R.inc(60639);TB.setUp();
        __CLR4_4_11arf1arflgchoslq.R.inc(60640);TB.testCalendar();
        __CLR4_4_11arf1arflgchoslq.R.inc(60641);TB.tearDown();

        __CLR4_4_11arf1arflgchoslq.R.inc(60642);TB.setUp();
        __CLR4_4_11arf1arflgchoslq.R.inc(60643);TB.testEra();
        __CLR4_4_11arf1arflgchoslq.R.inc(60644);TB.tearDown();

        __CLR4_4_11arf1arflgchoslq.R.inc(60645);TB.setUp();
        __CLR4_4_11arf1arflgchoslq.R.inc(60646);TB.testSampleDate();
        __CLR4_4_11arf1arflgchoslq.R.inc(60647);TB.tearDown();


        __CLR4_4_11arf1arflgchoslq.R.inc(60648);TB.setUp();
        __CLR4_4_11arf1arflgchoslq.R.inc(60649);TB.testSampleDateWithZone();
        __CLR4_4_11arf1arflgchoslq.R.inc(60650);TB.tearDown();

        __CLR4_4_11arf1arflgchoslq.R.inc(60651);TB.setUp();
        __CLR4_4_11arf1arflgchoslq.R.inc(60652);TB.testDurationYear();
        __CLR4_4_11arf1arflgchoslq.R.inc(60653);TB.tearDown();

        __CLR4_4_11arf1arflgchoslq.R.inc(60654);TB.setUp();
        __CLR4_4_11arf1arflgchoslq.R.inc(60655);TB.testDurationMonth();
        __CLR4_4_11arf1arflgchoslq.R.inc(60656);TB.tearDown();

        __CLR4_4_11arf1arflgchoslq.R.inc(60657);TB.setUp();
        __CLR4_4_11arf1arflgchoslq.R.inc(60658);TB.testLeap_5_13();
        __CLR4_4_11arf1arflgchoslq.R.inc(60659);TB.tearDown();

        __CLR4_4_11arf1arflgchoslq.R.inc(60660);TB.setUp();
        __CLR4_4_11arf1arflgchoslq.R.inc(60661);TB.testLeap_6_13();
        __CLR4_4_11arf1arflgchoslq.R.inc(60662);TB.tearDown();
    }finally{__CLR4_4_11arf1arflgchoslq.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        SKIP = 1 * MILLIS_PER_DAY;
        return new TestSuite(TestCopticChronology.class);
    }

    public TestCopticChronology(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11arf1arflgchoslq.R.inc(60663);
        __CLR4_4_11arf1arflgchoslq.R.inc(60664);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_11arf1arflgchoslq.R.inc(60665);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11arf1arflgchoslq.R.inc(60666);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11arf1arflgchoslq.R.inc(60667);originalLocale = Locale.getDefault();
        __CLR4_4_11arf1arflgchoslq.R.inc(60668);DateTimeZone.setDefault(LONDON);
        __CLR4_4_11arf1arflgchoslq.R.inc(60669);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11arf1arflgchoslq.R.inc(60670);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_11arf1arflgchoslq.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11arf1arflgchoslq.R.inc(60671);
        __CLR4_4_11arf1arflgchoslq.R.inc(60672);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_11arf1arflgchoslq.R.inc(60673);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11arf1arflgchoslq.R.inc(60674);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11arf1arflgchoslq.R.inc(60675);Locale.setDefault(originalLocale);
        __CLR4_4_11arf1arflgchoslq.R.inc(60676);originalDateTimeZone = null;
        __CLR4_4_11arf1arflgchoslq.R.inc(60677);originalTimeZone = null;
        __CLR4_4_11arf1arflgchoslq.R.inc(60678);originalLocale = null;
    }finally{__CLR4_4_11arf1arflgchoslq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactoryUTC() {__CLR4_4_11arf1arflgchoslq.R.globalSliceStart(getClass().getName(),60679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19knvhv1atj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11arf1arflgchoslq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11arf1arflgchoslq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testFactoryUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19knvhv1atj(){try{__CLR4_4_11arf1arflgchoslq.R.inc(60679);
        __CLR4_4_11arf1arflgchoslq.R.inc(60680);assertEquals(DateTimeZone.UTC, CopticChronology.getInstanceUTC().getZone());
        __CLR4_4_11arf1arflgchoslq.R.inc(60681);assertSame(CopticChronology.class, CopticChronology.getInstanceUTC().getClass());
    }finally{__CLR4_4_11arf1arflgchoslq.R.flushNeeded();}}

    @Test
    public void testFactory() {__CLR4_4_11arf1arflgchoslq.R.globalSliceStart(getClass().getName(),60682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116tztt1atm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11arf1arflgchoslq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11arf1arflgchoslq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testFactory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116tztt1atm(){try{__CLR4_4_11arf1arflgchoslq.R.inc(60682);
        __CLR4_4_11arf1arflgchoslq.R.inc(60683);assertEquals(LONDON, CopticChronology.getInstance().getZone());
        __CLR4_4_11arf1arflgchoslq.R.inc(60684);assertSame(CopticChronology.class, CopticChronology.getInstance().getClass());
    }finally{__CLR4_4_11arf1arflgchoslq.R.flushNeeded();}}

    @Test
    public void testFactory_Zone() {__CLR4_4_11arf1arflgchoslq.R.globalSliceStart(getClass().getName(),60685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yy5ime1atp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11arf1arflgchoslq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11arf1arflgchoslq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testFactory_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60685,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yy5ime1atp(){try{__CLR4_4_11arf1arflgchoslq.R.inc(60685);
        __CLR4_4_11arf1arflgchoslq.R.inc(60686);assertEquals(TOKYO, CopticChronology.getInstance(TOKYO).getZone());
        __CLR4_4_11arf1arflgchoslq.R.inc(60687);assertEquals(PARIS, CopticChronology.getInstance(PARIS).getZone());
        __CLR4_4_11arf1arflgchoslq.R.inc(60688);assertEquals(LONDON, CopticChronology.getInstance(null).getZone());
        __CLR4_4_11arf1arflgchoslq.R.inc(60689);assertSame(CopticChronology.class, CopticChronology.getInstance(TOKYO).getClass());
    }finally{__CLR4_4_11arf1arflgchoslq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEquality() {__CLR4_4_11arf1arflgchoslq.R.globalSliceStart(getClass().getName(),60690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12agdql1atu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11arf1arflgchoslq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11arf1arflgchoslq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testEquality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12agdql1atu(){try{__CLR4_4_11arf1arflgchoslq.R.inc(60690);
        __CLR4_4_11arf1arflgchoslq.R.inc(60691);assertSame(CopticChronology.getInstance(TOKYO), CopticChronology.getInstance(TOKYO));
        __CLR4_4_11arf1arflgchoslq.R.inc(60692);assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(LONDON));
        __CLR4_4_11arf1arflgchoslq.R.inc(60693);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance(PARIS));
        __CLR4_4_11arf1arflgchoslq.R.inc(60694);assertSame(CopticChronology.getInstanceUTC(), CopticChronology.getInstanceUTC());
        __CLR4_4_11arf1arflgchoslq.R.inc(60695);assertSame(CopticChronology.getInstance(), CopticChronology.getInstance(LONDON));
    }finally{__CLR4_4_11arf1arflgchoslq.R.flushNeeded();}}

    @Test
    public void testWithUTC() {__CLR4_4_11arf1arflgchoslq.R.globalSliceStart(getClass().getName(),60696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19orv831au0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11arf1arflgchoslq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11arf1arflgchoslq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testWithUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19orv831au0(){try{__CLR4_4_11arf1arflgchoslq.R.inc(60696);
        __CLR4_4_11arf1arflgchoslq.R.inc(60697);assertSame(CopticChronology.getInstanceUTC(), CopticChronology.getInstance(LONDON).withUTC());
        __CLR4_4_11arf1arflgchoslq.R.inc(60698);assertSame(CopticChronology.getInstanceUTC(), CopticChronology.getInstance(TOKYO).withUTC());
        __CLR4_4_11arf1arflgchoslq.R.inc(60699);assertSame(CopticChronology.getInstanceUTC(), CopticChronology.getInstanceUTC().withUTC());
        __CLR4_4_11arf1arflgchoslq.R.inc(60700);assertSame(CopticChronology.getInstanceUTC(), CopticChronology.getInstance().withUTC());
    }finally{__CLR4_4_11arf1arflgchoslq.R.flushNeeded();}}

    @Test
    public void testWithZone() {__CLR4_4_11arf1arflgchoslq.R.globalSliceStart(getClass().getName(),60701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1me3iet1au5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11arf1arflgchoslq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11arf1arflgchoslq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testWithZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1me3iet1au5(){try{__CLR4_4_11arf1arflgchoslq.R.inc(60701);
        __CLR4_4_11arf1arflgchoslq.R.inc(60702);assertSame(CopticChronology.getInstance(TOKYO), CopticChronology.getInstance(TOKYO).withZone(TOKYO));
        __CLR4_4_11arf1arflgchoslq.R.inc(60703);assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(TOKYO).withZone(LONDON));
        __CLR4_4_11arf1arflgchoslq.R.inc(60704);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance(TOKYO).withZone(PARIS));
        __CLR4_4_11arf1arflgchoslq.R.inc(60705);assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(TOKYO).withZone(null));
        __CLR4_4_11arf1arflgchoslq.R.inc(60706);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance().withZone(PARIS));
        __CLR4_4_11arf1arflgchoslq.R.inc(60707);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstanceUTC().withZone(PARIS));
    }finally{__CLR4_4_11arf1arflgchoslq.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_4_11arf1arflgchoslq.R.globalSliceStart(getClass().getName(),60708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1auc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11arf1arflgchoslq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11arf1arflgchoslq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60708,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1auc(){try{__CLR4_4_11arf1arflgchoslq.R.inc(60708);
        __CLR4_4_11arf1arflgchoslq.R.inc(60709);assertEquals("CopticChronology[Europe/London]", CopticChronology.getInstance(LONDON).toString());
        __CLR4_4_11arf1arflgchoslq.R.inc(60710);assertEquals("CopticChronology[Asia/Tokyo]", CopticChronology.getInstance(TOKYO).toString());
        __CLR4_4_11arf1arflgchoslq.R.inc(60711);assertEquals("CopticChronology[Europe/London]", CopticChronology.getInstance().toString());
        __CLR4_4_11arf1arflgchoslq.R.inc(60712);assertEquals("CopticChronology[UTC]", CopticChronology.getInstanceUTC().toString());
    }finally{__CLR4_4_11arf1arflgchoslq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDurationFields() {__CLR4_4_11arf1arflgchoslq.R.globalSliceStart(getClass().getName(),60713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnkzye1auh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11arf1arflgchoslq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11arf1arflgchoslq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testDurationFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60713,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnkzye1auh(){try{__CLR4_4_11arf1arflgchoslq.R.inc(60713);
        __CLR4_4_11arf1arflgchoslq.R.inc(60714);final CopticChronology coptic = CopticChronology.getInstance();
        __CLR4_4_11arf1arflgchoslq.R.inc(60715);assertEquals("eras", coptic.eras().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60716);assertEquals("centuries", coptic.centuries().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60717);assertEquals("years", coptic.years().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60718);assertEquals("weekyears", coptic.weekyears().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60719);assertEquals("months", coptic.months().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60720);assertEquals("weeks", coptic.weeks().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60721);assertEquals("days", coptic.days().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60722);assertEquals("halfdays", coptic.halfdays().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60723);assertEquals("hours", coptic.hours().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60724);assertEquals("minutes", coptic.minutes().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60725);assertEquals("seconds", coptic.seconds().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60726);assertEquals("millis", coptic.millis().getName());

        __CLR4_4_11arf1arflgchoslq.R.inc(60727);assertEquals(false, coptic.eras().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60728);assertEquals(true, coptic.centuries().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60729);assertEquals(true, coptic.years().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60730);assertEquals(true, coptic.weekyears().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60731);assertEquals(true, coptic.months().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60732);assertEquals(true, coptic.weeks().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60733);assertEquals(true, coptic.days().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60734);assertEquals(true, coptic.halfdays().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60735);assertEquals(true, coptic.hours().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60736);assertEquals(true, coptic.minutes().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60737);assertEquals(true, coptic.seconds().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60738);assertEquals(true, coptic.millis().isSupported());

        __CLR4_4_11arf1arflgchoslq.R.inc(60739);assertEquals(false, coptic.centuries().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60740);assertEquals(false, coptic.years().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60741);assertEquals(false, coptic.weekyears().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60742);assertEquals(false, coptic.months().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60743);assertEquals(false, coptic.weeks().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60744);assertEquals(false, coptic.days().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60745);assertEquals(false, coptic.halfdays().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60746);assertEquals(true, coptic.hours().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60747);assertEquals(true, coptic.minutes().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60748);assertEquals(true, coptic.seconds().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60749);assertEquals(true, coptic.millis().isPrecise());

        __CLR4_4_11arf1arflgchoslq.R.inc(60750);final CopticChronology copticUTC = CopticChronology.getInstanceUTC();
        __CLR4_4_11arf1arflgchoslq.R.inc(60751);assertEquals(false, copticUTC.centuries().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60752);assertEquals(false, copticUTC.years().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60753);assertEquals(false, copticUTC.weekyears().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60754);assertEquals(false, copticUTC.months().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60755);assertEquals(true, copticUTC.weeks().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60756);assertEquals(true, copticUTC.days().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60757);assertEquals(true, copticUTC.halfdays().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60758);assertEquals(true, copticUTC.hours().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60759);assertEquals(true, copticUTC.minutes().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60760);assertEquals(true, copticUTC.seconds().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60761);assertEquals(true, copticUTC.millis().isPrecise());

        __CLR4_4_11arf1arflgchoslq.R.inc(60762);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        __CLR4_4_11arf1arflgchoslq.R.inc(60763);final CopticChronology copticGMT = CopticChronology.getInstance(gmt);
        __CLR4_4_11arf1arflgchoslq.R.inc(60764);assertEquals(false, copticGMT.centuries().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60765);assertEquals(false, copticGMT.years().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60766);assertEquals(false, copticGMT.weekyears().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60767);assertEquals(false, copticGMT.months().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60768);assertEquals(true, copticGMT.weeks().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60769);assertEquals(true, copticGMT.days().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60770);assertEquals(true, copticGMT.halfdays().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60771);assertEquals(true, copticGMT.hours().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60772);assertEquals(true, copticGMT.minutes().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60773);assertEquals(true, copticGMT.seconds().isPrecise());
        __CLR4_4_11arf1arflgchoslq.R.inc(60774);assertEquals(true, copticGMT.millis().isPrecise());
    }finally{__CLR4_4_11arf1arflgchoslq.R.flushNeeded();}}

    @Test
    public void testDateFields() {__CLR4_4_11arf1arflgchoslq.R.globalSliceStart(getClass().getName(),60775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gkspeo1aw7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11arf1arflgchoslq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11arf1arflgchoslq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testDateFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gkspeo1aw7(){try{__CLR4_4_11arf1arflgchoslq.R.inc(60775);
        __CLR4_4_11arf1arflgchoslq.R.inc(60776);final CopticChronology coptic = CopticChronology.getInstance();
        __CLR4_4_11arf1arflgchoslq.R.inc(60777);assertEquals("era", coptic.era().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60778);assertEquals("centuryOfEra", coptic.centuryOfEra().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60779);assertEquals("yearOfCentury", coptic.yearOfCentury().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60780);assertEquals("yearOfEra", coptic.yearOfEra().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60781);assertEquals("year", coptic.year().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60782);assertEquals("monthOfYear", coptic.monthOfYear().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60783);assertEquals("weekyearOfCentury", coptic.weekyearOfCentury().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60784);assertEquals("weekyear", coptic.weekyear().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60785);assertEquals("weekOfWeekyear", coptic.weekOfWeekyear().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60786);assertEquals("dayOfYear", coptic.dayOfYear().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60787);assertEquals("dayOfMonth", coptic.dayOfMonth().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60788);assertEquals("dayOfWeek", coptic.dayOfWeek().getName());

        __CLR4_4_11arf1arflgchoslq.R.inc(60789);assertEquals(true, coptic.era().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60790);assertEquals(true, coptic.centuryOfEra().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60791);assertEquals(true, coptic.yearOfCentury().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60792);assertEquals(true, coptic.yearOfEra().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60793);assertEquals(true, coptic.year().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60794);assertEquals(true, coptic.monthOfYear().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60795);assertEquals(true, coptic.weekyearOfCentury().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60796);assertEquals(true, coptic.weekyear().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60797);assertEquals(true, coptic.weekOfWeekyear().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60798);assertEquals(true, coptic.dayOfYear().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60799);assertEquals(true, coptic.dayOfMonth().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60800);assertEquals(true, coptic.dayOfWeek().isSupported());

        __CLR4_4_11arf1arflgchoslq.R.inc(60801);assertEquals(coptic.eras(), coptic.era().getDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60802);assertEquals(coptic.centuries(), coptic.centuryOfEra().getDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60803);assertEquals(coptic.years(), coptic.yearOfCentury().getDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60804);assertEquals(coptic.years(), coptic.yearOfEra().getDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60805);assertEquals(coptic.years(), coptic.year().getDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60806);assertEquals(coptic.months(), coptic.monthOfYear().getDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60807);assertEquals(coptic.weekyears(), coptic.weekyearOfCentury().getDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60808);assertEquals(coptic.weekyears(), coptic.weekyear().getDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60809);assertEquals(coptic.weeks(), coptic.weekOfWeekyear().getDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60810);assertEquals(coptic.days(), coptic.dayOfYear().getDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60811);assertEquals(coptic.days(), coptic.dayOfMonth().getDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60812);assertEquals(coptic.days(), coptic.dayOfWeek().getDurationField());

        __CLR4_4_11arf1arflgchoslq.R.inc(60813);assertEquals(null, coptic.era().getRangeDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60814);assertEquals(coptic.eras(), coptic.centuryOfEra().getRangeDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60815);assertEquals(coptic.centuries(), coptic.yearOfCentury().getRangeDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60816);assertEquals(coptic.eras(), coptic.yearOfEra().getRangeDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60817);assertEquals(null, coptic.year().getRangeDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60818);assertEquals(coptic.years(), coptic.monthOfYear().getRangeDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60819);assertEquals(coptic.centuries(), coptic.weekyearOfCentury().getRangeDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60820);assertEquals(null, coptic.weekyear().getRangeDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60821);assertEquals(coptic.weekyears(), coptic.weekOfWeekyear().getRangeDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60822);assertEquals(coptic.years(), coptic.dayOfYear().getRangeDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60823);assertEquals(coptic.months(), coptic.dayOfMonth().getRangeDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60824);assertEquals(coptic.weeks(), coptic.dayOfWeek().getRangeDurationField());
    }finally{__CLR4_4_11arf1arflgchoslq.R.flushNeeded();}}

    @Test
    public void testTimeFields() {__CLR4_4_11arf1arflgchoslq.R.globalSliceStart(getClass().getName(),60825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r11up1axl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11arf1arflgchoslq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11arf1arflgchoslq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testTimeFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r11up1axl(){try{__CLR4_4_11arf1arflgchoslq.R.inc(60825);
        __CLR4_4_11arf1arflgchoslq.R.inc(60826);final CopticChronology coptic = CopticChronology.getInstance();
        __CLR4_4_11arf1arflgchoslq.R.inc(60827);assertEquals("halfdayOfDay", coptic.halfdayOfDay().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60828);assertEquals("clockhourOfHalfday", coptic.clockhourOfHalfday().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60829);assertEquals("hourOfHalfday", coptic.hourOfHalfday().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60830);assertEquals("clockhourOfDay", coptic.clockhourOfDay().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60831);assertEquals("hourOfDay", coptic.hourOfDay().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60832);assertEquals("minuteOfDay", coptic.minuteOfDay().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60833);assertEquals("minuteOfHour", coptic.minuteOfHour().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60834);assertEquals("secondOfDay", coptic.secondOfDay().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60835);assertEquals("secondOfMinute", coptic.secondOfMinute().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60836);assertEquals("millisOfDay", coptic.millisOfDay().getName());
        __CLR4_4_11arf1arflgchoslq.R.inc(60837);assertEquals("millisOfSecond", coptic.millisOfSecond().getName());

        __CLR4_4_11arf1arflgchoslq.R.inc(60838);assertEquals(true, coptic.halfdayOfDay().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60839);assertEquals(true, coptic.clockhourOfHalfday().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60840);assertEquals(true, coptic.hourOfHalfday().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60841);assertEquals(true, coptic.clockhourOfDay().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60842);assertEquals(true, coptic.hourOfDay().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60843);assertEquals(true, coptic.minuteOfDay().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60844);assertEquals(true, coptic.minuteOfHour().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60845);assertEquals(true, coptic.secondOfDay().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60846);assertEquals(true, coptic.secondOfMinute().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60847);assertEquals(true, coptic.millisOfDay().isSupported());
        __CLR4_4_11arf1arflgchoslq.R.inc(60848);assertEquals(true, coptic.millisOfSecond().isSupported());
    }finally{__CLR4_4_11arf1arflgchoslq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEpoch() {__CLR4_4_11arf1arflgchoslq.R.globalSliceStart(getClass().getName(),60849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19p7wci1ay9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11arf1arflgchoslq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11arf1arflgchoslq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testEpoch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19p7wci1ay9(){try{__CLR4_4_11arf1arflgchoslq.R.inc(60849);
        __CLR4_4_11arf1arflgchoslq.R.inc(60850);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, COPTIC_UTC);
        __CLR4_4_11arf1arflgchoslq.R.inc(60851);assertEquals(new DateTime(284, 8, 29, 0, 0, 0, 0, JULIAN_UTC), epoch.withChronology(JULIAN_UTC));
    }finally{__CLR4_4_11arf1arflgchoslq.R.flushNeeded();}}

    @Test
    public void testEra() {__CLR4_4_11arf1arflgchoslq.R.globalSliceStart(getClass().getName(),60852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13euvzd1ayc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11arf1arflgchoslq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11arf1arflgchoslq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13euvzd1ayc(){try{__CLR4_4_11arf1arflgchoslq.R.inc(60852);
        __CLR4_4_11arf1arflgchoslq.R.inc(60853);assertEquals(1, CopticChronology.AM);
        __CLR4_4_11arf1arflgchoslq.R.inc(60854);try {
            __CLR4_4_11arf1arflgchoslq.R.inc(60855);new DateTime(-1, 13, 5, 0, 0, 0, 0, COPTIC_UTC);
            __CLR4_4_11arf1arflgchoslq.R.inc(60856);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11arf1arflgchoslq.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    @Test
    public void testCalendar() {__CLR4_4_11arf1arflgchoslq.R.globalSliceStart(getClass().getName(),60857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1odnsqf1ayh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11arf1arflgchoslq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11arf1arflgchoslq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testCalendar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1odnsqf1ayh(){try{__CLR4_4_11arf1arflgchoslq.R.inc(60857);
        __CLR4_4_11arf1arflgchoslq.R.inc(60858);if ((((TestAll.FAST)&&(__CLR4_4_11arf1arflgchoslq.R.iget(60859)!=0|true))||(__CLR4_4_11arf1arflgchoslq.R.iget(60860)==0&false))) {{
            __CLR4_4_11arf1arflgchoslq.R.inc(60861);return;
        }
        }__CLR4_4_11arf1arflgchoslq.R.inc(60862);System.out.println("\nTestCopticChronology.testCalendar");
        __CLR4_4_11arf1arflgchoslq.R.inc(60863);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, COPTIC_UTC);
        __CLR4_4_11arf1arflgchoslq.R.inc(60864);long millis = epoch.getMillis();
        __CLR4_4_11arf1arflgchoslq.R.inc(60865);long end = new DateTime(3000, 1, 1, 0, 0, 0, 0, ISO_UTC).getMillis();
        __CLR4_4_11arf1arflgchoslq.R.inc(60866);DateTimeField dayOfWeek = COPTIC_UTC.dayOfWeek();
        __CLR4_4_11arf1arflgchoslq.R.inc(60867);DateTimeField dayOfYear = COPTIC_UTC.dayOfYear();
        __CLR4_4_11arf1arflgchoslq.R.inc(60868);DateTimeField dayOfMonth = COPTIC_UTC.dayOfMonth();
        __CLR4_4_11arf1arflgchoslq.R.inc(60869);DateTimeField monthOfYear = COPTIC_UTC.monthOfYear();
        __CLR4_4_11arf1arflgchoslq.R.inc(60870);DateTimeField year = COPTIC_UTC.year();
        __CLR4_4_11arf1arflgchoslq.R.inc(60871);DateTimeField yearOfEra = COPTIC_UTC.yearOfEra();
        __CLR4_4_11arf1arflgchoslq.R.inc(60872);DateTimeField era = COPTIC_UTC.era();
        __CLR4_4_11arf1arflgchoslq.R.inc(60873);int expectedDOW = new DateTime(284, 8, 29, 0, 0, 0, 0, JULIAN_UTC).getDayOfWeek();
        __CLR4_4_11arf1arflgchoslq.R.inc(60874);int expectedDOY = 1;
        __CLR4_4_11arf1arflgchoslq.R.inc(60875);int expectedDay = 1;
        __CLR4_4_11arf1arflgchoslq.R.inc(60876);int expectedMonth = 1;
        __CLR4_4_11arf1arflgchoslq.R.inc(60877);int expectedYear = 1;
        __CLR4_4_11arf1arflgchoslq.R.inc(60878);while ((((millis < end)&&(__CLR4_4_11arf1arflgchoslq.R.iget(60879)!=0|true))||(__CLR4_4_11arf1arflgchoslq.R.iget(60880)==0&false))) {{
            __CLR4_4_11arf1arflgchoslq.R.inc(60881);int dowValue = dayOfWeek.get(millis);
            __CLR4_4_11arf1arflgchoslq.R.inc(60882);int doyValue = dayOfYear.get(millis);
            __CLR4_4_11arf1arflgchoslq.R.inc(60883);int dayValue = dayOfMonth.get(millis);
            __CLR4_4_11arf1arflgchoslq.R.inc(60884);int monthValue = monthOfYear.get(millis);
            __CLR4_4_11arf1arflgchoslq.R.inc(60885);int yearValue = year.get(millis);
            __CLR4_4_11arf1arflgchoslq.R.inc(60886);int yearOfEraValue = yearOfEra.get(millis);
            __CLR4_4_11arf1arflgchoslq.R.inc(60887);int monthLen = dayOfMonth.getMaximumValue(millis);
            __CLR4_4_11arf1arflgchoslq.R.inc(60888);if ((((monthValue < 1 || monthValue > 13)&&(__CLR4_4_11arf1arflgchoslq.R.iget(60889)!=0|true))||(__CLR4_4_11arf1arflgchoslq.R.iget(60890)==0&false))) {{
                __CLR4_4_11arf1arflgchoslq.R.inc(60891);fail("Bad month: " + millis);
            }

            // test era
            }__CLR4_4_11arf1arflgchoslq.R.inc(60892);assertEquals(1, era.get(millis));
            __CLR4_4_11arf1arflgchoslq.R.inc(60893);assertEquals("AM", era.getAsText(millis));
            __CLR4_4_11arf1arflgchoslq.R.inc(60894);assertEquals("AM", era.getAsShortText(millis));

            // test date
            __CLR4_4_11arf1arflgchoslq.R.inc(60895);assertEquals(expectedYear, yearValue);
            __CLR4_4_11arf1arflgchoslq.R.inc(60896);assertEquals(expectedYear, yearOfEraValue);
            __CLR4_4_11arf1arflgchoslq.R.inc(60897);assertEquals(expectedMonth, monthValue);
            __CLR4_4_11arf1arflgchoslq.R.inc(60898);assertEquals(expectedDay, dayValue);
            __CLR4_4_11arf1arflgchoslq.R.inc(60899);assertEquals(expectedDOW, dowValue);
            __CLR4_4_11arf1arflgchoslq.R.inc(60900);assertEquals(expectedDOY, doyValue);

            // test leap year
            __CLR4_4_11arf1arflgchoslq.R.inc(60901);assertEquals(yearValue % 4 == 3, year.isLeap(millis));

            // test month length
            __CLR4_4_11arf1arflgchoslq.R.inc(60902);if ((((monthValue == 13)&&(__CLR4_4_11arf1arflgchoslq.R.iget(60903)!=0|true))||(__CLR4_4_11arf1arflgchoslq.R.iget(60904)==0&false))) {{
                __CLR4_4_11arf1arflgchoslq.R.inc(60905);assertEquals(yearValue % 4 == 3, monthOfYear.isLeap(millis));
                __CLR4_4_11arf1arflgchoslq.R.inc(60906);if ((((yearValue % 4 == 3)&&(__CLR4_4_11arf1arflgchoslq.R.iget(60907)!=0|true))||(__CLR4_4_11arf1arflgchoslq.R.iget(60908)==0&false))) {{
                    __CLR4_4_11arf1arflgchoslq.R.inc(60909);assertEquals(6, monthLen);
                } }else {{
                    __CLR4_4_11arf1arflgchoslq.R.inc(60910);assertEquals(5, monthLen);
                }
            }} }else {{
                __CLR4_4_11arf1arflgchoslq.R.inc(60911);assertEquals(30, monthLen);
            }

            // recalculate date
            }__CLR4_4_11arf1arflgchoslq.R.inc(60912);expectedDOW = (((expectedDOW + 1) - 1) % 7) + 1;
            __CLR4_4_11arf1arflgchoslq.R.inc(60913);expectedDay++;
            __CLR4_4_11arf1arflgchoslq.R.inc(60914);expectedDOY++;
            __CLR4_4_11arf1arflgchoslq.R.inc(60915);if ((((expectedDay == 31 && expectedMonth < 13)&&(__CLR4_4_11arf1arflgchoslq.R.iget(60916)!=0|true))||(__CLR4_4_11arf1arflgchoslq.R.iget(60917)==0&false))) {{
                __CLR4_4_11arf1arflgchoslq.R.inc(60918);expectedDay = 1;
                __CLR4_4_11arf1arflgchoslq.R.inc(60919);expectedMonth++;
            } }else {__CLR4_4_11arf1arflgchoslq.R.inc(60920);if ((((expectedMonth == 13)&&(__CLR4_4_11arf1arflgchoslq.R.iget(60921)!=0|true))||(__CLR4_4_11arf1arflgchoslq.R.iget(60922)==0&false))) {{
                __CLR4_4_11arf1arflgchoslq.R.inc(60923);if ((((expectedYear % 4 == 3 && expectedDay == 7)&&(__CLR4_4_11arf1arflgchoslq.R.iget(60924)!=0|true))||(__CLR4_4_11arf1arflgchoslq.R.iget(60925)==0&false))) {{
                    __CLR4_4_11arf1arflgchoslq.R.inc(60926);expectedDay = 1;
                    __CLR4_4_11arf1arflgchoslq.R.inc(60927);expectedMonth = 1;
                    __CLR4_4_11arf1arflgchoslq.R.inc(60928);expectedYear++;
                    __CLR4_4_11arf1arflgchoslq.R.inc(60929);expectedDOY = 1;
                } }else {__CLR4_4_11arf1arflgchoslq.R.inc(60930);if ((((expectedYear % 4 != 3 && expectedDay == 6)&&(__CLR4_4_11arf1arflgchoslq.R.iget(60931)!=0|true))||(__CLR4_4_11arf1arflgchoslq.R.iget(60932)==0&false))) {{
                    __CLR4_4_11arf1arflgchoslq.R.inc(60933);expectedDay = 1;
                    __CLR4_4_11arf1arflgchoslq.R.inc(60934);expectedMonth = 1;
                    __CLR4_4_11arf1arflgchoslq.R.inc(60935);expectedYear++;
                    __CLR4_4_11arf1arflgchoslq.R.inc(60936);expectedDOY = 1;
                }
            }}}
            }}__CLR4_4_11arf1arflgchoslq.R.inc(60937);millis += SKIP;
            __CLR4_4_11arf1arflgchoslq.R.inc(60938);break; // SBH:added this line to exit from loop, this was only required to generate a smaller trace
        }
    }}finally{__CLR4_4_11arf1arflgchoslq.R.flushNeeded();}}


    @Test
    public void testSampleDate() {__CLR4_4_11arf1arflgchoslq.R.globalSliceStart(getClass().getName(),60939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vytbnz1b0r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11arf1arflgchoslq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11arf1arflgchoslq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testSampleDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vytbnz1b0r(){try{__CLR4_4_11arf1arflgchoslq.R.inc(60939);
        __CLR4_4_11arf1arflgchoslq.R.inc(60940);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, ISO_UTC).withChronology(COPTIC_UTC);
        __CLR4_4_11arf1arflgchoslq.R.inc(60941);assertEquals(CopticChronology.AM, dt.getEra());
        __CLR4_4_11arf1arflgchoslq.R.inc(60942);assertEquals(18, dt.getCenturyOfEra());  // TODO confirm
        __CLR4_4_11arf1arflgchoslq.R.inc(60943);assertEquals(20, dt.getYearOfCentury());
        __CLR4_4_11arf1arflgchoslq.R.inc(60944);assertEquals(1720, dt.getYearOfEra());

        __CLR4_4_11arf1arflgchoslq.R.inc(60945);assertEquals(1720, dt.getYear());
        __CLR4_4_11arf1arflgchoslq.R.inc(60946);Property fld = dt.year();
        __CLR4_4_11arf1arflgchoslq.R.inc(60947);assertEquals(false, fld.isLeap());
        __CLR4_4_11arf1arflgchoslq.R.inc(60948);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_11arf1arflgchoslq.R.inc(60949);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType());
        __CLR4_4_11arf1arflgchoslq.R.inc(60950);assertEquals(new DateTime(1721, 10, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1));

        __CLR4_4_11arf1arflgchoslq.R.inc(60951);assertEquals(10, dt.getMonthOfYear());
        __CLR4_4_11arf1arflgchoslq.R.inc(60952);fld = dt.monthOfYear();
        __CLR4_4_11arf1arflgchoslq.R.inc(60953);assertEquals(false, fld.isLeap());
        __CLR4_4_11arf1arflgchoslq.R.inc(60954);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_11arf1arflgchoslq.R.inc(60955);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType());
        __CLR4_4_11arf1arflgchoslq.R.inc(60956);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_11arf1arflgchoslq.R.inc(60957);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_11arf1arflgchoslq.R.inc(60958);assertEquals(13, fld.getMaximumValue());
        __CLR4_4_11arf1arflgchoslq.R.inc(60959);assertEquals(13, fld.getMaximumValueOverall());
        __CLR4_4_11arf1arflgchoslq.R.inc(60960);assertEquals(new DateTime(1721, 1, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(4));
        __CLR4_4_11arf1arflgchoslq.R.inc(60961);assertEquals(new DateTime(1720, 1, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addWrapFieldToCopy(4));

        __CLR4_4_11arf1arflgchoslq.R.inc(60962);assertEquals(2, dt.getDayOfMonth());
        __CLR4_4_11arf1arflgchoslq.R.inc(60963);fld = dt.dayOfMonth();
        __CLR4_4_11arf1arflgchoslq.R.inc(60964);assertEquals(false, fld.isLeap());
        __CLR4_4_11arf1arflgchoslq.R.inc(60965);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_11arf1arflgchoslq.R.inc(60966);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60967);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_11arf1arflgchoslq.R.inc(60968);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_11arf1arflgchoslq.R.inc(60969);assertEquals(30, fld.getMaximumValue());
        __CLR4_4_11arf1arflgchoslq.R.inc(60970);assertEquals(30, fld.getMaximumValueOverall());
        __CLR4_4_11arf1arflgchoslq.R.inc(60971);assertEquals(new DateTime(1720, 10, 3, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1));

        __CLR4_4_11arf1arflgchoslq.R.inc(60972);assertEquals(DateTimeConstants.WEDNESDAY, dt.getDayOfWeek());
        __CLR4_4_11arf1arflgchoslq.R.inc(60973);fld = dt.dayOfWeek();
        __CLR4_4_11arf1arflgchoslq.R.inc(60974);assertEquals(false, fld.isLeap());
        __CLR4_4_11arf1arflgchoslq.R.inc(60975);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_11arf1arflgchoslq.R.inc(60976);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60977);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_11arf1arflgchoslq.R.inc(60978);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_11arf1arflgchoslq.R.inc(60979);assertEquals(7, fld.getMaximumValue());
        __CLR4_4_11arf1arflgchoslq.R.inc(60980);assertEquals(7, fld.getMaximumValueOverall());
        __CLR4_4_11arf1arflgchoslq.R.inc(60981);assertEquals(new DateTime(1720, 10, 3, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1));

        __CLR4_4_11arf1arflgchoslq.R.inc(60982);assertEquals(9 * 30 + 2, dt.getDayOfYear());
        __CLR4_4_11arf1arflgchoslq.R.inc(60983);fld = dt.dayOfYear();
        __CLR4_4_11arf1arflgchoslq.R.inc(60984);assertEquals(false, fld.isLeap());
        __CLR4_4_11arf1arflgchoslq.R.inc(60985);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_11arf1arflgchoslq.R.inc(60986);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_11arf1arflgchoslq.R.inc(60987);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_11arf1arflgchoslq.R.inc(60988);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_11arf1arflgchoslq.R.inc(60989);assertEquals(365, fld.getMaximumValue());
        __CLR4_4_11arf1arflgchoslq.R.inc(60990);assertEquals(366, fld.getMaximumValueOverall());
        __CLR4_4_11arf1arflgchoslq.R.inc(60991);assertEquals(new DateTime(1720, 10, 3, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1));

        __CLR4_4_11arf1arflgchoslq.R.inc(60992);assertEquals(0, dt.getHourOfDay());
        __CLR4_4_11arf1arflgchoslq.R.inc(60993);assertEquals(0, dt.getMinuteOfHour());
        __CLR4_4_11arf1arflgchoslq.R.inc(60994);assertEquals(0, dt.getSecondOfMinute());
        __CLR4_4_11arf1arflgchoslq.R.inc(60995);assertEquals(0, dt.getMillisOfSecond());
    }finally{__CLR4_4_11arf1arflgchoslq.R.flushNeeded();}}


    @Test
    public void testSampleDateWithZone() {__CLR4_4_11arf1arflgchoslq.R.globalSliceStart(getClass().getName(),60996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gh4f6l1b2c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11arf1arflgchoslq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11arf1arflgchoslq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testSampleDateWithZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gh4f6l1b2c(){try{__CLR4_4_11arf1arflgchoslq.R.inc(60996);
        __CLR4_4_11arf1arflgchoslq.R.inc(60997);DateTime dt = new DateTime(2004, 6, 9, 12, 0, 0, 0, PARIS).withChronology(COPTIC_UTC);
        __CLR4_4_11arf1arflgchoslq.R.inc(60998);assertEquals(CopticChronology.AM, dt.getEra());
        __CLR4_4_11arf1arflgchoslq.R.inc(60999);assertEquals(1720, dt.getYear());
        __CLR4_4_11arf1arflgchoslq.R.inc(61000);assertEquals(1720, dt.getYearOfEra());
        __CLR4_4_11arf1arflgchoslq.R.inc(61001);assertEquals(10, dt.getMonthOfYear());
        __CLR4_4_11arf1arflgchoslq.R.inc(61002);assertEquals(2, dt.getDayOfMonth());
        __CLR4_4_11arf1arflgchoslq.R.inc(61003);assertEquals(10, dt.getHourOfDay());  // PARIS is UTC+2 in summer (12-2=10)
        __CLR4_4_11arf1arflgchoslq.R.inc(61004);assertEquals(0, dt.getMinuteOfHour());
        __CLR4_4_11arf1arflgchoslq.R.inc(61005);assertEquals(0, dt.getSecondOfMinute());
        __CLR4_4_11arf1arflgchoslq.R.inc(61006);assertEquals(0, dt.getMillisOfSecond());
    }finally{__CLR4_4_11arf1arflgchoslq.R.flushNeeded();}}

    @Test
    public void testDurationYear() {__CLR4_4_11arf1arflgchoslq.R.globalSliceStart(getClass().getName(),61007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14rec961b2n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11arf1arflgchoslq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11arf1arflgchoslq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testDurationYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61007,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14rec961b2n(){try{__CLR4_4_11arf1arflgchoslq.R.inc(61007);
        // Leap 1723
        __CLR4_4_11arf1arflgchoslq.R.inc(61008);DateTime dt20 = new DateTime(1720, 10, 2, 0, 0, 0, 0, COPTIC_UTC);
        __CLR4_4_11arf1arflgchoslq.R.inc(61009);DateTime dt21 = new DateTime(1721, 10, 2, 0, 0, 0, 0, COPTIC_UTC);
        __CLR4_4_11arf1arflgchoslq.R.inc(61010);DateTime dt22 = new DateTime(1722, 10, 2, 0, 0, 0, 0, COPTIC_UTC);
        __CLR4_4_11arf1arflgchoslq.R.inc(61011);DateTime dt23 = new DateTime(1723, 10, 2, 0, 0, 0, 0, COPTIC_UTC);
        __CLR4_4_11arf1arflgchoslq.R.inc(61012);DateTime dt24 = new DateTime(1724, 10, 2, 0, 0, 0, 0, COPTIC_UTC);

        __CLR4_4_11arf1arflgchoslq.R.inc(61013);DurationField fld = dt20.year().getDurationField();
        __CLR4_4_11arf1arflgchoslq.R.inc(61014);assertEquals(COPTIC_UTC.years(), fld);
        __CLR4_4_11arf1arflgchoslq.R.inc(61015);assertEquals(1L * 365L * MILLIS_PER_DAY, fld.getMillis(1, dt20.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61016);assertEquals(2L * 365L * MILLIS_PER_DAY, fld.getMillis(2, dt20.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61017);assertEquals(3L * 365L * MILLIS_PER_DAY, fld.getMillis(3, dt20.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61018);assertEquals((4L * 365L + 1L) * MILLIS_PER_DAY, fld.getMillis(4, dt20.getMillis()));

        __CLR4_4_11arf1arflgchoslq.R.inc(61019);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getMillis(1));
        __CLR4_4_11arf1arflgchoslq.R.inc(61020);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 2, fld.getMillis(2));

        __CLR4_4_11arf1arflgchoslq.R.inc(61021);assertEquals(1L * 365L * MILLIS_PER_DAY, fld.getMillis(1L, dt20.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61022);assertEquals(2L * 365L * MILLIS_PER_DAY, fld.getMillis(2L, dt20.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61023);assertEquals(3L * 365L * MILLIS_PER_DAY, fld.getMillis(3L, dt20.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61024);assertEquals((4L * 365L + 1L) * MILLIS_PER_DAY, fld.getMillis(4L, dt20.getMillis()));

        __CLR4_4_11arf1arflgchoslq.R.inc(61025);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getMillis(1L));
        __CLR4_4_11arf1arflgchoslq.R.inc(61026);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 2, fld.getMillis(2L));

        __CLR4_4_11arf1arflgchoslq.R.inc(61027);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getUnitMillis());

        __CLR4_4_11arf1arflgchoslq.R.inc(61028);assertEquals(0, fld.getValue(1L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61029);assertEquals(1, fld.getValue(1L * 365L * MILLIS_PER_DAY, dt20.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61030);assertEquals(1, fld.getValue(1L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61031);assertEquals(1, fld.getValue(2L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61032);assertEquals(2, fld.getValue(2L * 365L * MILLIS_PER_DAY, dt20.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61033);assertEquals(2, fld.getValue(2L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61034);assertEquals(2, fld.getValue(3L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61035);assertEquals(3, fld.getValue(3L * 365L * MILLIS_PER_DAY, dt20.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61036);assertEquals(3, fld.getValue(3L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61037);assertEquals(3, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY - 1L, dt20.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61038);assertEquals(4, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY, dt20.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61039);assertEquals(4, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY + 1L, dt20.getMillis()));

        __CLR4_4_11arf1arflgchoslq.R.inc(61040);assertEquals(dt21.getMillis(), fld.add(dt20.getMillis(), 1));
        __CLR4_4_11arf1arflgchoslq.R.inc(61041);assertEquals(dt22.getMillis(), fld.add(dt20.getMillis(), 2));
        __CLR4_4_11arf1arflgchoslq.R.inc(61042);assertEquals(dt23.getMillis(), fld.add(dt20.getMillis(), 3));
        __CLR4_4_11arf1arflgchoslq.R.inc(61043);assertEquals(dt24.getMillis(), fld.add(dt20.getMillis(), 4));

        __CLR4_4_11arf1arflgchoslq.R.inc(61044);assertEquals(dt21.getMillis(), fld.add(dt20.getMillis(), 1L));
        __CLR4_4_11arf1arflgchoslq.R.inc(61045);assertEquals(dt22.getMillis(), fld.add(dt20.getMillis(), 2L));
        __CLR4_4_11arf1arflgchoslq.R.inc(61046);assertEquals(dt23.getMillis(), fld.add(dt20.getMillis(), 3L));
        __CLR4_4_11arf1arflgchoslq.R.inc(61047);assertEquals(dt24.getMillis(), fld.add(dt20.getMillis(), 4L));
    }finally{__CLR4_4_11arf1arflgchoslq.R.flushNeeded();}}

    @Test
    public void testDurationMonth() {__CLR4_4_11arf1arflgchoslq.R.globalSliceStart(getClass().getName(),61048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19eaj331b3s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11arf1arflgchoslq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11arf1arflgchoslq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testDurationMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61048,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19eaj331b3s(){try{__CLR4_4_11arf1arflgchoslq.R.inc(61048);
        // Leap 1723
        __CLR4_4_11arf1arflgchoslq.R.inc(61049);DateTime dt11 = new DateTime(1723, 11, 2, 0, 0, 0, 0, COPTIC_UTC);
        __CLR4_4_11arf1arflgchoslq.R.inc(61050);DateTime dt12 = new DateTime(1723, 12, 2, 0, 0, 0, 0, COPTIC_UTC);
        __CLR4_4_11arf1arflgchoslq.R.inc(61051);DateTime dt13 = new DateTime(1723, 13, 2, 0, 0, 0, 0, COPTIC_UTC);
        __CLR4_4_11arf1arflgchoslq.R.inc(61052);DateTime dt01 = new DateTime(1724, 1, 2, 0, 0, 0, 0, COPTIC_UTC);

        __CLR4_4_11arf1arflgchoslq.R.inc(61053);DurationField fld = dt11.monthOfYear().getDurationField();
        __CLR4_4_11arf1arflgchoslq.R.inc(61054);assertEquals(COPTIC_UTC.months(), fld);
        __CLR4_4_11arf1arflgchoslq.R.inc(61055);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1, dt11.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61056);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2, dt11.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61057);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3, dt11.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61058);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4, dt11.getMillis()));

        __CLR4_4_11arf1arflgchoslq.R.inc(61059);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1));
        __CLR4_4_11arf1arflgchoslq.R.inc(61060);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2));
        __CLR4_4_11arf1arflgchoslq.R.inc(61061);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13));

        __CLR4_4_11arf1arflgchoslq.R.inc(61062);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L, dt11.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61063);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L, dt11.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61064);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3L, dt11.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61065);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4L, dt11.getMillis()));

        __CLR4_4_11arf1arflgchoslq.R.inc(61066);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L));
        __CLR4_4_11arf1arflgchoslq.R.inc(61067);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L));
        __CLR4_4_11arf1arflgchoslq.R.inc(61068);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13L));

        __CLR4_4_11arf1arflgchoslq.R.inc(61069);assertEquals(0, fld.getValue(1L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61070);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY, dt11.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61071);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61072);assertEquals(1, fld.getValue(2L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61073);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY, dt11.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61074);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61075);assertEquals(2, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61076);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61077);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61078);assertEquals(3, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61079);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis()));
        __CLR4_4_11arf1arflgchoslq.R.inc(61080);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis()));

        __CLR4_4_11arf1arflgchoslq.R.inc(61081);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1));
        __CLR4_4_11arf1arflgchoslq.R.inc(61082);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2));
        __CLR4_4_11arf1arflgchoslq.R.inc(61083);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3));

        __CLR4_4_11arf1arflgchoslq.R.inc(61084);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1L));
        __CLR4_4_11arf1arflgchoslq.R.inc(61085);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2L));
        __CLR4_4_11arf1arflgchoslq.R.inc(61086);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3L));
    }finally{__CLR4_4_11arf1arflgchoslq.R.flushNeeded();}}


    @Test
    public void testLeap_5_13() {__CLR4_4_11arf1arflgchoslq.R.globalSliceStart(getClass().getName(),61087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bkcy941b4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11arf1arflgchoslq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11arf1arflgchoslq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testLeap_5_13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bkcy941b4v(){try{__CLR4_4_11arf1arflgchoslq.R.inc(61087);
        __CLR4_4_11arf1arflgchoslq.R.inc(61088);Chronology chrono = CopticChronology.getInstance();
        __CLR4_4_11arf1arflgchoslq.R.inc(61089);DateTime dt = new DateTime(3, 13, 5, 0, 0, chrono);
        __CLR4_4_11arf1arflgchoslq.R.inc(61090);assertEquals(true, dt.year().isLeap());
        __CLR4_4_11arf1arflgchoslq.R.inc(61091);assertEquals(true, dt.monthOfYear().isLeap());
        __CLR4_4_11arf1arflgchoslq.R.inc(61092);assertEquals(false, dt.dayOfMonth().isLeap());
        __CLR4_4_11arf1arflgchoslq.R.inc(61093);assertEquals(false, dt.dayOfYear().isLeap());
    }finally{__CLR4_4_11arf1arflgchoslq.R.flushNeeded();}}


    @Test
    public void testLeap_6_13() {__CLR4_4_11arf1arflgchoslq.R.globalSliceStart(getClass().getName(),61094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16pob1l1b52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11arf1arflgchoslq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11arf1arflgchoslq.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testLeap_6_13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16pob1l1b52(){try{__CLR4_4_11arf1arflgchoslq.R.inc(61094);
        __CLR4_4_11arf1arflgchoslq.R.inc(61095);Chronology chrono = CopticChronology.getInstance();
        __CLR4_4_11arf1arflgchoslq.R.inc(61096);DateTime dt = new DateTime(3, 13, 6, 0, 0, chrono);
        __CLR4_4_11arf1arflgchoslq.R.inc(61097);assertEquals(true, dt.year().isLeap());
        __CLR4_4_11arf1arflgchoslq.R.inc(61098);assertEquals(true, dt.monthOfYear().isLeap());
        __CLR4_4_11arf1arflgchoslq.R.inc(61099);assertEquals(true, dt.dayOfMonth().isLeap());
        __CLR4_4_11arf1arflgchoslq.R.inc(61100);assertEquals(true, dt.dayOfYear().isLeap());
    }finally{__CLR4_4_11arf1arflgchoslq.R.flushNeeded();}}

}
