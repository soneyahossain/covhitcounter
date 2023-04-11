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
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is a Junit unit test for JulianChronology.
 *
 * @author Stephen Colebourne
 */
public class TestJulianChronology {static class __CLR4_4_11cxd1cxdlgchoso1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,63661,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

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

    public static void main(String[] args) throws Exception {try{__CLR4_4_11cxd1cxdlgchoso1.R.inc(63409);
        //junit.textui.TestRunner.run(suite());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63410);TestJulianChronology TB = new TestJulianChronology();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63411);TB.setUp();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63412);TB.testFactoryUTC();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63413);TB.tearDown();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63414);TB.setUp();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63415);TB.testFactory();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63416);TB.tearDown();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63417);TB.setUp();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63418);TB.testFactory_Zone();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63419);TB.tearDown();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63420);TB.setUp();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63421);TB.testFactory_Zone_int();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63422);TB.tearDown();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63423);TB.setUp();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63424);TB.testEquality();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63425);TB.tearDown();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63426);TB.setUp();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63427);TB.testWithUTC();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63428);TB.tearDown();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63429);TB.setUp();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63430);TB.testWithZone();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63431);TB.tearDown();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63432);TB.setUp();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63433);TB.testToString();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63434);TB.tearDown();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63435);TB.setUp();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63436);TB.testDurationFields();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63437);TB.tearDown();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63438);TB.setUp();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63439);TB.testDateFields();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63440);TB.tearDown();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63441);TB.setUp();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63442);TB.testTimeFields();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63443);TB.tearDown();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63444);TB.setUp();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63445);TB.testLeap_28feb();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63446);TB.tearDown();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63447);TB.setUp();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63448);TB.testLeap_29feb();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63449);TB.tearDown();

    }finally{__CLR4_4_11cxd1cxdlgchoso1.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestJulianChronology.class);
    }

    public TestJulianChronology(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11cxd1cxdlgchoso1.R.inc(63450);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63451);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63452);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63453);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63454);originalLocale = Locale.getDefault();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63455);DateTimeZone.setDefault(LONDON);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63456);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63457);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_11cxd1cxdlgchoso1.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11cxd1cxdlgchoso1.R.inc(63458);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63459);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63460);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63461);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63462);Locale.setDefault(originalLocale);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63463);originalDateTimeZone = null;
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63464);originalTimeZone = null;
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63465);originalLocale = null;
    }finally{__CLR4_4_11cxd1cxdlgchoso1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactoryUTC() {__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceStart(getClass().getName(),63466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19knvhv1cyy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cxd1cxdlgchoso1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testFactoryUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19knvhv1cyy(){try{__CLR4_4_11cxd1cxdlgchoso1.R.inc(63466);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63467);assertEquals(DateTimeZone.UTC, JulianChronology.getInstanceUTC().getZone());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63468);assertSame(JulianChronology.class, JulianChronology.getInstanceUTC().getClass());
    }finally{__CLR4_4_11cxd1cxdlgchoso1.R.flushNeeded();}}

    @Test
    public void testFactory() {__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceStart(getClass().getName(),63469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116tztt1cz1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cxd1cxdlgchoso1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testFactory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116tztt1cz1(){try{__CLR4_4_11cxd1cxdlgchoso1.R.inc(63469);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63470);assertEquals(LONDON, JulianChronology.getInstance().getZone());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63471);assertSame(JulianChronology.class, JulianChronology.getInstance().getClass());
    }finally{__CLR4_4_11cxd1cxdlgchoso1.R.flushNeeded();}}

    @Test
    public void testFactory_Zone() {__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceStart(getClass().getName(),63472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yy5ime1cz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cxd1cxdlgchoso1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testFactory_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yy5ime1cz4(){try{__CLR4_4_11cxd1cxdlgchoso1.R.inc(63472);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63473);assertEquals(TOKYO, JulianChronology.getInstance(TOKYO).getZone());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63474);assertEquals(PARIS, JulianChronology.getInstance(PARIS).getZone());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63475);assertEquals(LONDON, JulianChronology.getInstance(null).getZone());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63476);assertSame(JulianChronology.class, JulianChronology.getInstance(TOKYO).getClass());
    }finally{__CLR4_4_11cxd1cxdlgchoso1.R.flushNeeded();}}

    @Test
    public void testFactory_Zone_int() {__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceStart(getClass().getName(),63477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rvgr121cz9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cxd1cxdlgchoso1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testFactory_Zone_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rvgr121cz9(){try{__CLR4_4_11cxd1cxdlgchoso1.R.inc(63477);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63478);JulianChronology chrono = JulianChronology.getInstance(TOKYO, 2);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63479);assertEquals(TOKYO, chrono.getZone());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63480);assertEquals(2, chrono.getMinimumDaysInFirstWeek());

        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63481);try {
            __CLR4_4_11cxd1cxdlgchoso1.R.inc(63482);JulianChronology.getInstance(TOKYO, 0);
            __CLR4_4_11cxd1cxdlgchoso1.R.inc(63483);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63484);try {
            __CLR4_4_11cxd1cxdlgchoso1.R.inc(63485);JulianChronology.getInstance(TOKYO, 8);
            __CLR4_4_11cxd1cxdlgchoso1.R.inc(63486);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11cxd1cxdlgchoso1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEquality() {__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceStart(getClass().getName(),63487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12agdql1czj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cxd1cxdlgchoso1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testEquality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12agdql1czj(){try{__CLR4_4_11cxd1cxdlgchoso1.R.inc(63487);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63488);assertSame(JulianChronology.getInstance(TOKYO), JulianChronology.getInstance(TOKYO));
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63489);assertSame(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(LONDON));
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63490);assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstance(PARIS));
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63491);assertSame(JulianChronology.getInstanceUTC(), JulianChronology.getInstanceUTC());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63492);assertSame(JulianChronology.getInstance(), JulianChronology.getInstance(LONDON));
    }finally{__CLR4_4_11cxd1cxdlgchoso1.R.flushNeeded();}}

    @Test
    public void testWithUTC() {__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceStart(getClass().getName(),63493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19orv831czp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cxd1cxdlgchoso1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testWithUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19orv831czp(){try{__CLR4_4_11cxd1cxdlgchoso1.R.inc(63493);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63494);assertSame(JulianChronology.getInstanceUTC(), JulianChronology.getInstance(LONDON).withUTC());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63495);assertSame(JulianChronology.getInstanceUTC(), JulianChronology.getInstance(TOKYO).withUTC());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63496);assertSame(JulianChronology.getInstanceUTC(), JulianChronology.getInstanceUTC().withUTC());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63497);assertSame(JulianChronology.getInstanceUTC(), JulianChronology.getInstance().withUTC());
    }finally{__CLR4_4_11cxd1cxdlgchoso1.R.flushNeeded();}}

    @Test
    public void testWithZone() {__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceStart(getClass().getName(),63498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1me3iet1czu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cxd1cxdlgchoso1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testWithZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1me3iet1czu(){try{__CLR4_4_11cxd1cxdlgchoso1.R.inc(63498);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63499);assertSame(JulianChronology.getInstance(TOKYO), JulianChronology.getInstance(TOKYO).withZone(TOKYO));
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63500);assertSame(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(TOKYO).withZone(LONDON));
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63501);assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstance(TOKYO).withZone(PARIS));
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63502);assertSame(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(TOKYO).withZone(null));
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63503);assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstance().withZone(PARIS));
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63504);assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstanceUTC().withZone(PARIS));
    }finally{__CLR4_4_11cxd1cxdlgchoso1.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceStart(getClass().getName(),63505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1d01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cxd1cxdlgchoso1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1d01(){try{__CLR4_4_11cxd1cxdlgchoso1.R.inc(63505);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63506);assertEquals("JulianChronology[Europe/London]", JulianChronology.getInstance(LONDON).toString());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63507);assertEquals("JulianChronology[Asia/Tokyo]", JulianChronology.getInstance(TOKYO).toString());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63508);assertEquals("JulianChronology[Europe/London]", JulianChronology.getInstance().toString());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63509);assertEquals("JulianChronology[UTC]", JulianChronology.getInstanceUTC().toString());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63510);assertEquals("JulianChronology[UTC,mdfw=2]", JulianChronology.getInstance(DateTimeZone.UTC, 2).toString());
    }finally{__CLR4_4_11cxd1cxdlgchoso1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDurationFields() {__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceStart(getClass().getName(),63511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnkzye1d07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cxd1cxdlgchoso1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testDurationFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnkzye1d07(){try{__CLR4_4_11cxd1cxdlgchoso1.R.inc(63511);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63512);final JulianChronology julian = JulianChronology.getInstance();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63513);assertEquals("eras", julian.eras().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63514);assertEquals("centuries", julian.centuries().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63515);assertEquals("years", julian.years().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63516);assertEquals("weekyears", julian.weekyears().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63517);assertEquals("months", julian.months().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63518);assertEquals("weeks", julian.weeks().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63519);assertEquals("days", julian.days().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63520);assertEquals("halfdays", julian.halfdays().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63521);assertEquals("hours", julian.hours().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63522);assertEquals("minutes", julian.minutes().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63523);assertEquals("seconds", julian.seconds().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63524);assertEquals("millis", julian.millis().getName());

        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63525);assertEquals(false, julian.eras().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63526);assertEquals(true, julian.centuries().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63527);assertEquals(true, julian.years().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63528);assertEquals(true, julian.weekyears().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63529);assertEquals(true, julian.months().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63530);assertEquals(true, julian.weeks().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63531);assertEquals(true, julian.days().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63532);assertEquals(true, julian.halfdays().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63533);assertEquals(true, julian.hours().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63534);assertEquals(true, julian.minutes().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63535);assertEquals(true, julian.seconds().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63536);assertEquals(true, julian.millis().isSupported());

        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63537);assertEquals(false, julian.centuries().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63538);assertEquals(false, julian.years().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63539);assertEquals(false, julian.weekyears().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63540);assertEquals(false, julian.months().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63541);assertEquals(false, julian.weeks().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63542);assertEquals(false, julian.days().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63543);assertEquals(false, julian.halfdays().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63544);assertEquals(true, julian.hours().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63545);assertEquals(true, julian.minutes().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63546);assertEquals(true, julian.seconds().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63547);assertEquals(true, julian.millis().isPrecise());

        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63548);final JulianChronology julianUTC = JulianChronology.getInstanceUTC();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63549);assertEquals(false, julianUTC.centuries().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63550);assertEquals(false, julianUTC.years().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63551);assertEquals(false, julianUTC.weekyears().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63552);assertEquals(false, julianUTC.months().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63553);assertEquals(true, julianUTC.weeks().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63554);assertEquals(true, julianUTC.days().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63555);assertEquals(true, julianUTC.halfdays().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63556);assertEquals(true, julianUTC.hours().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63557);assertEquals(true, julianUTC.minutes().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63558);assertEquals(true, julianUTC.seconds().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63559);assertEquals(true, julianUTC.millis().isPrecise());

        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63560);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63561);final JulianChronology julianGMT = JulianChronology.getInstance(gmt);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63562);assertEquals(false, julianGMT.centuries().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63563);assertEquals(false, julianGMT.years().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63564);assertEquals(false, julianGMT.weekyears().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63565);assertEquals(false, julianGMT.months().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63566);assertEquals(true, julianGMT.weeks().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63567);assertEquals(true, julianGMT.days().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63568);assertEquals(true, julianGMT.halfdays().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63569);assertEquals(true, julianGMT.hours().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63570);assertEquals(true, julianGMT.minutes().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63571);assertEquals(true, julianGMT.seconds().isPrecise());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63572);assertEquals(true, julianGMT.millis().isPrecise());
    }finally{__CLR4_4_11cxd1cxdlgchoso1.R.flushNeeded();}}

    @Test
    public void testDateFields() {__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceStart(getClass().getName(),63573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gkspeo1d1x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cxd1cxdlgchoso1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testDateFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gkspeo1d1x(){try{__CLR4_4_11cxd1cxdlgchoso1.R.inc(63573);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63574);final JulianChronology julian = JulianChronology.getInstance();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63575);assertEquals("era", julian.era().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63576);assertEquals("centuryOfEra", julian.centuryOfEra().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63577);assertEquals("yearOfCentury", julian.yearOfCentury().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63578);assertEquals("yearOfEra", julian.yearOfEra().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63579);assertEquals("year", julian.year().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63580);assertEquals("monthOfYear", julian.monthOfYear().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63581);assertEquals("weekyearOfCentury", julian.weekyearOfCentury().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63582);assertEquals("weekyear", julian.weekyear().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63583);assertEquals("weekOfWeekyear", julian.weekOfWeekyear().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63584);assertEquals("dayOfYear", julian.dayOfYear().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63585);assertEquals("dayOfMonth", julian.dayOfMonth().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63586);assertEquals("dayOfWeek", julian.dayOfWeek().getName());

        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63587);assertEquals(true, julian.era().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63588);assertEquals(true, julian.centuryOfEra().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63589);assertEquals(true, julian.yearOfCentury().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63590);assertEquals(true, julian.yearOfEra().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63591);assertEquals(true, julian.year().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63592);assertEquals(true, julian.monthOfYear().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63593);assertEquals(true, julian.weekyearOfCentury().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63594);assertEquals(true, julian.weekyear().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63595);assertEquals(true, julian.weekOfWeekyear().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63596);assertEquals(true, julian.dayOfYear().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63597);assertEquals(true, julian.dayOfMonth().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63598);assertEquals(true, julian.dayOfWeek().isSupported());

        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63599);assertEquals(julian.eras(), julian.era().getDurationField());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63600);assertEquals(julian.centuries(), julian.centuryOfEra().getDurationField());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63601);assertEquals(julian.years(), julian.yearOfCentury().getDurationField());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63602);assertEquals(julian.years(), julian.yearOfEra().getDurationField());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63603);assertEquals(julian.years(), julian.year().getDurationField());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63604);assertEquals(julian.months(), julian.monthOfYear().getDurationField());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63605);assertEquals(julian.weekyears(), julian.weekyearOfCentury().getDurationField());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63606);assertEquals(julian.weekyears(), julian.weekyear().getDurationField());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63607);assertEquals(julian.weeks(), julian.weekOfWeekyear().getDurationField());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63608);assertEquals(julian.days(), julian.dayOfYear().getDurationField());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63609);assertEquals(julian.days(), julian.dayOfMonth().getDurationField());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63610);assertEquals(julian.days(), julian.dayOfWeek().getDurationField());

        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63611);assertEquals(null, julian.era().getRangeDurationField());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63612);assertEquals(julian.eras(), julian.centuryOfEra().getRangeDurationField());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63613);assertEquals(julian.centuries(), julian.yearOfCentury().getRangeDurationField());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63614);assertEquals(julian.eras(), julian.yearOfEra().getRangeDurationField());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63615);assertEquals(null, julian.year().getRangeDurationField());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63616);assertEquals(julian.years(), julian.monthOfYear().getRangeDurationField());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63617);assertEquals(julian.centuries(), julian.weekyearOfCentury().getRangeDurationField());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63618);assertEquals(null, julian.weekyear().getRangeDurationField());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63619);assertEquals(julian.weekyears(), julian.weekOfWeekyear().getRangeDurationField());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63620);assertEquals(julian.years(), julian.dayOfYear().getRangeDurationField());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63621);assertEquals(julian.months(), julian.dayOfMonth().getRangeDurationField());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63622);assertEquals(julian.weeks(), julian.dayOfWeek().getRangeDurationField());
    }finally{__CLR4_4_11cxd1cxdlgchoso1.R.flushNeeded();}}

    @Test
    public void testTimeFields() {__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceStart(getClass().getName(),63623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r11up1d3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cxd1cxdlgchoso1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testTimeFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r11up1d3b(){try{__CLR4_4_11cxd1cxdlgchoso1.R.inc(63623);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63624);final JulianChronology julian = JulianChronology.getInstance();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63625);assertEquals("halfdayOfDay", julian.halfdayOfDay().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63626);assertEquals("clockhourOfHalfday", julian.clockhourOfHalfday().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63627);assertEquals("hourOfHalfday", julian.hourOfHalfday().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63628);assertEquals("clockhourOfDay", julian.clockhourOfDay().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63629);assertEquals("hourOfDay", julian.hourOfDay().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63630);assertEquals("minuteOfDay", julian.minuteOfDay().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63631);assertEquals("minuteOfHour", julian.minuteOfHour().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63632);assertEquals("secondOfDay", julian.secondOfDay().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63633);assertEquals("secondOfMinute", julian.secondOfMinute().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63634);assertEquals("millisOfDay", julian.millisOfDay().getName());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63635);assertEquals("millisOfSecond", julian.millisOfSecond().getName());

        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63636);assertEquals(true, julian.halfdayOfDay().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63637);assertEquals(true, julian.clockhourOfHalfday().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63638);assertEquals(true, julian.hourOfHalfday().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63639);assertEquals(true, julian.clockhourOfDay().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63640);assertEquals(true, julian.hourOfDay().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63641);assertEquals(true, julian.minuteOfDay().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63642);assertEquals(true, julian.minuteOfHour().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63643);assertEquals(true, julian.secondOfDay().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63644);assertEquals(true, julian.secondOfMinute().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63645);assertEquals(true, julian.millisOfDay().isSupported());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63646);assertEquals(true, julian.millisOfSecond().isSupported());
    }finally{__CLR4_4_11cxd1cxdlgchoso1.R.flushNeeded();}}


    @Test
    public void testLeap_28feb() {__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceStart(getClass().getName(),63647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_149q6ov1d3z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cxd1cxdlgchoso1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testLeap_28feb",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_149q6ov1d3z(){try{__CLR4_4_11cxd1cxdlgchoso1.R.inc(63647);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63648);Chronology chrono = JulianChronology.getInstance();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63649);DateTime dt = new DateTime(2012, 2, 28, 0, 0, chrono);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63650);assertEquals(true, dt.year().isLeap());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63651);assertEquals(true, dt.monthOfYear().isLeap());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63652);assertEquals(false, dt.dayOfMonth().isLeap());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63653);assertEquals(false, dt.dayOfYear().isLeap());
    }finally{__CLR4_4_11cxd1cxdlgchoso1.R.flushNeeded();}}


    @Test
    public void testLeap_29feb() {__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceStart(getClass().getName(),63654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_194etwe1d46();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cxd1cxdlgchoso1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cxd1cxdlgchoso1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testLeap_29feb",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_194etwe1d46(){try{__CLR4_4_11cxd1cxdlgchoso1.R.inc(63654);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63655);Chronology chrono = JulianChronology.getInstance();
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63656);DateTime dt = new DateTime(2012, 2, 29, 0, 0, chrono);
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63657);assertEquals(true, dt.year().isLeap());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63658);assertEquals(true, dt.monthOfYear().isLeap());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63659);assertEquals(true, dt.dayOfMonth().isLeap());
        __CLR4_4_11cxd1cxdlgchoso1.R.inc(63660);assertEquals(true, dt.dayOfYear().isLeap());
    }finally{__CLR4_4_11cxd1cxdlgchoso1.R.flushNeeded();}}

}
