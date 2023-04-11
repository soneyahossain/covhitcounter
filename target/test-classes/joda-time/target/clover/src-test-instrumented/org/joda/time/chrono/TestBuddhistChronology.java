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
import org.joda.time.Period;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is a Junit unit test for BuddhistChronology.
 *
 * @author Stephen Colebourne
 */
public class TestBuddhistChronology {static class __CLR4_4_11ail1aillgchosla{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,60603,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; // extends TestCase {

    private static int SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology GJ_UTC = GJChronology.getInstanceUTC();
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

    public static void main(String[] args) throws Exception {try{__CLR4_4_11ail1aillgchosla.R.inc(60285);
        __CLR4_4_11ail1aillgchosla.R.inc(60286);SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;


        //org.junit.runner.JUnitCore.main("org.joda.time.chrono.TestBuddhistChronology");
        //junit.textui.TestRunner.run(suite());

        __CLR4_4_11ail1aillgchosla.R.inc(60287);TestBuddhistChronology TB = new TestBuddhistChronology();

        __CLR4_4_11ail1aillgchosla.R.inc(60288);TB.setUp();
        __CLR4_4_11ail1aillgchosla.R.inc(60289);TB.testFactoryUTC();
        __CLR4_4_11ail1aillgchosla.R.inc(60290);TB.tearDown();

        __CLR4_4_11ail1aillgchosla.R.inc(60291);TB.setUp();
        __CLR4_4_11ail1aillgchosla.R.inc(60292);TB.testFactory();
        __CLR4_4_11ail1aillgchosla.R.inc(60293);TB.tearDown();

        __CLR4_4_11ail1aillgchosla.R.inc(60294);TB.setUp();
        __CLR4_4_11ail1aillgchosla.R.inc(60295);TB.testFactory_Zone();
        __CLR4_4_11ail1aillgchosla.R.inc(60296);TB.tearDown();

        __CLR4_4_11ail1aillgchosla.R.inc(60297);TB.setUp();
        __CLR4_4_11ail1aillgchosla.R.inc(60298);TB.testEquality();
        __CLR4_4_11ail1aillgchosla.R.inc(60299);TB.tearDown();

        __CLR4_4_11ail1aillgchosla.R.inc(60300);TB.setUp();
        __CLR4_4_11ail1aillgchosla.R.inc(60301);TB.testWithUTC();
        __CLR4_4_11ail1aillgchosla.R.inc(60302);TB.tearDown();

        __CLR4_4_11ail1aillgchosla.R.inc(60303);TB.setUp();
        __CLR4_4_11ail1aillgchosla.R.inc(60304);TB.testCalendar(); //excluded from slice generation as this test produces a very big trace file
        __CLR4_4_11ail1aillgchosla.R.inc(60305);TB.tearDown();

        __CLR4_4_11ail1aillgchosla.R.inc(60306);TB.setUp();
        __CLR4_4_11ail1aillgchosla.R.inc(60307);TB.testKeyYears();
        __CLR4_4_11ail1aillgchosla.R.inc(60308);TB.tearDown();

        __CLR4_4_11ail1aillgchosla.R.inc(60309);TB.setUp();
        __CLR4_4_11ail1aillgchosla.R.inc(60310);TB.testEra();
        __CLR4_4_11ail1aillgchosla.R.inc(60311);TB.tearDown();

        __CLR4_4_11ail1aillgchosla.R.inc(60312);TB.setUp();
        __CLR4_4_11ail1aillgchosla.R.inc(60313);TB.testEpoch();
        __CLR4_4_11ail1aillgchosla.R.inc(60314);TB.tearDown();

        __CLR4_4_11ail1aillgchosla.R.inc(60315);TB.setUp();
        __CLR4_4_11ail1aillgchosla.R.inc(60316);TB.testTimeFields();
        __CLR4_4_11ail1aillgchosla.R.inc(60317);TB.tearDown();

        __CLR4_4_11ail1aillgchosla.R.inc(60318);TB.setUp();
        __CLR4_4_11ail1aillgchosla.R.inc(60319);TB.testDateFields();
        __CLR4_4_11ail1aillgchosla.R.inc(60320);TB.tearDown();

        __CLR4_4_11ail1aillgchosla.R.inc(60321);TB.setUp();
        __CLR4_4_11ail1aillgchosla.R.inc(60322);TB.testToString();
        __CLR4_4_11ail1aillgchosla.R.inc(60323);TB.tearDown();

        __CLR4_4_11ail1aillgchosla.R.inc(60324);TB.setUp();
        __CLR4_4_11ail1aillgchosla.R.inc(60325);TB.testDurationFields();
        __CLR4_4_11ail1aillgchosla.R.inc(60326);TB.tearDown();

        __CLR4_4_11ail1aillgchosla.R.inc(60327);TB.setUp();
        __CLR4_4_11ail1aillgchosla.R.inc(60328);TB.testWithZone();
        __CLR4_4_11ail1aillgchosla.R.inc(60329);TB.tearDown();
    }finally{__CLR4_4_11ail1aillgchosla.R.flushNeeded();}}

    /*
        public static TestSuite suite() {
            return new TestSuite(TestBuddhistChronology.class);
        }

        public TestBuddhistChronology(String name) {
            super(name);
        }
     */
    @Before
    public void setUp() throws Exception {try{__CLR4_4_11ail1aillgchosla.R.inc(60330);
        __CLR4_4_11ail1aillgchosla.R.inc(60331);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_11ail1aillgchosla.R.inc(60332);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11ail1aillgchosla.R.inc(60333);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11ail1aillgchosla.R.inc(60334);originalLocale = Locale.getDefault();
        __CLR4_4_11ail1aillgchosla.R.inc(60335);DateTimeZone.setDefault(LONDON);
        __CLR4_4_11ail1aillgchosla.R.inc(60336);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11ail1aillgchosla.R.inc(60337);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_11ail1aillgchosla.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11ail1aillgchosla.R.inc(60338);
        __CLR4_4_11ail1aillgchosla.R.inc(60339);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_11ail1aillgchosla.R.inc(60340);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11ail1aillgchosla.R.inc(60341);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11ail1aillgchosla.R.inc(60342);Locale.setDefault(originalLocale);
        __CLR4_4_11ail1aillgchosla.R.inc(60343);originalDateTimeZone = null;
        __CLR4_4_11ail1aillgchosla.R.inc(60344);originalTimeZone = null;
        __CLR4_4_11ail1aillgchosla.R.inc(60345);originalLocale = null;
    }finally{__CLR4_4_11ail1aillgchosla.R.flushNeeded();}}

    //-----------------------------------------------------------------------


    @Test
    public void testFactoryUTC() {__CLR4_4_11ail1aillgchosla.R.globalSliceStart(getClass().getName(),60346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19knvhv1aka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ail1aillgchosla.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ail1aillgchosla.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testFactoryUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19knvhv1aka(){try{__CLR4_4_11ail1aillgchosla.R.inc(60346);
        __CLR4_4_11ail1aillgchosla.R.inc(60347);assertEquals(DateTimeZone.UTC, BuddhistChronology.getInstanceUTC().getZone());
        __CLR4_4_11ail1aillgchosla.R.inc(60348);assertSame(BuddhistChronology.class, BuddhistChronology.getInstanceUTC().getClass());
    }finally{__CLR4_4_11ail1aillgchosla.R.flushNeeded();}}


    @Test
    public void testFactory() {__CLR4_4_11ail1aillgchosla.R.globalSliceStart(getClass().getName(),60349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116tztt1akd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ail1aillgchosla.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ail1aillgchosla.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testFactory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116tztt1akd(){try{__CLR4_4_11ail1aillgchosla.R.inc(60349);
        __CLR4_4_11ail1aillgchosla.R.inc(60350);assertEquals(LONDON, BuddhistChronology.getInstance().getZone());
        __CLR4_4_11ail1aillgchosla.R.inc(60351);assertSame(BuddhistChronology.class, BuddhistChronology.getInstance().getClass());
    }finally{__CLR4_4_11ail1aillgchosla.R.flushNeeded();}}


    @Test
    public void testFactory_Zone() {__CLR4_4_11ail1aillgchosla.R.globalSliceStart(getClass().getName(),60352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yy5ime1akg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ail1aillgchosla.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ail1aillgchosla.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testFactory_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yy5ime1akg(){try{__CLR4_4_11ail1aillgchosla.R.inc(60352);
        __CLR4_4_11ail1aillgchosla.R.inc(60353);assertEquals(TOKYO, BuddhistChronology.getInstance(TOKYO).getZone());
        __CLR4_4_11ail1aillgchosla.R.inc(60354);assertEquals(PARIS, BuddhistChronology.getInstance(PARIS).getZone());
        __CLR4_4_11ail1aillgchosla.R.inc(60355);assertEquals(LONDON, BuddhistChronology.getInstance(null).getZone());
        __CLR4_4_11ail1aillgchosla.R.inc(60356);assertSame(BuddhistChronology.class, BuddhistChronology.getInstance(TOKYO).getClass());
    }finally{__CLR4_4_11ail1aillgchosla.R.flushNeeded();}}


    //-----------------------------------------------------------------------
    @Test
    public void testEquality() {__CLR4_4_11ail1aillgchosla.R.globalSliceStart(getClass().getName(),60357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12agdql1akl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ail1aillgchosla.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ail1aillgchosla.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testEquality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12agdql1akl(){try{__CLR4_4_11ail1aillgchosla.R.inc(60357);
        __CLR4_4_11ail1aillgchosla.R.inc(60358);assertSame(BuddhistChronology.getInstance(TOKYO), BuddhistChronology.getInstance(TOKYO));
        __CLR4_4_11ail1aillgchosla.R.inc(60359);assertSame(BuddhistChronology.getInstance(LONDON), BuddhistChronology.getInstance(LONDON));
        __CLR4_4_11ail1aillgchosla.R.inc(60360);assertSame(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstance(PARIS));
        __CLR4_4_11ail1aillgchosla.R.inc(60361);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstanceUTC());
        __CLR4_4_11ail1aillgchosla.R.inc(60362);assertSame(BuddhistChronology.getInstance(), BuddhistChronology.getInstance(LONDON));
    }finally{__CLR4_4_11ail1aillgchosla.R.flushNeeded();}}


    @Test
    public void testWithUTC() {__CLR4_4_11ail1aillgchosla.R.globalSliceStart(getClass().getName(),60363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19orv831akr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ail1aillgchosla.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ail1aillgchosla.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testWithUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60363,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19orv831akr(){try{__CLR4_4_11ail1aillgchosla.R.inc(60363);
        __CLR4_4_11ail1aillgchosla.R.inc(60364);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstance(LONDON).withUTC());
        __CLR4_4_11ail1aillgchosla.R.inc(60365);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstance(TOKYO).withUTC());
        __CLR4_4_11ail1aillgchosla.R.inc(60366);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstanceUTC().withUTC());
        __CLR4_4_11ail1aillgchosla.R.inc(60367);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstance().withUTC());
    }finally{__CLR4_4_11ail1aillgchosla.R.flushNeeded();}}


    @Test
    public void testWithZone() {__CLR4_4_11ail1aillgchosla.R.globalSliceStart(getClass().getName(),60368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1me3iet1akw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ail1aillgchosla.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ail1aillgchosla.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testWithZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1me3iet1akw(){try{__CLR4_4_11ail1aillgchosla.R.inc(60368);
        __CLR4_4_11ail1aillgchosla.R.inc(60369);assertSame(BuddhistChronology.getInstance(TOKYO), BuddhistChronology.getInstance(TOKYO).withZone(TOKYO));
        __CLR4_4_11ail1aillgchosla.R.inc(60370);assertSame(BuddhistChronology.getInstance(LONDON), BuddhistChronology.getInstance(TOKYO).withZone(LONDON));
        __CLR4_4_11ail1aillgchosla.R.inc(60371);assertSame(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstance(TOKYO).withZone(PARIS));
        __CLR4_4_11ail1aillgchosla.R.inc(60372);assertSame(BuddhistChronology.getInstance(LONDON), BuddhistChronology.getInstance(TOKYO).withZone(null));
        __CLR4_4_11ail1aillgchosla.R.inc(60373);assertSame(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstance().withZone(PARIS));
        __CLR4_4_11ail1aillgchosla.R.inc(60374);assertSame(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstanceUTC().withZone(PARIS));
    }finally{__CLR4_4_11ail1aillgchosla.R.flushNeeded();}}


    @Test
    public void testToString() {__CLR4_4_11ail1aillgchosla.R.globalSliceStart(getClass().getName(),60375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1al3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ail1aillgchosla.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ail1aillgchosla.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60375,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1al3(){try{__CLR4_4_11ail1aillgchosla.R.inc(60375);
        __CLR4_4_11ail1aillgchosla.R.inc(60376);assertEquals("BuddhistChronology[Europe/London]", BuddhistChronology.getInstance(LONDON).toString());
        __CLR4_4_11ail1aillgchosla.R.inc(60377);assertEquals("BuddhistChronology[Asia/Tokyo]", BuddhistChronology.getInstance(TOKYO).toString());
        __CLR4_4_11ail1aillgchosla.R.inc(60378);assertEquals("BuddhistChronology[Europe/London]", BuddhistChronology.getInstance().toString());
        __CLR4_4_11ail1aillgchosla.R.inc(60379);assertEquals("BuddhistChronology[UTC]", BuddhistChronology.getInstanceUTC().toString());
    }finally{__CLR4_4_11ail1aillgchosla.R.flushNeeded();}}
    //-----------------------------------------------------------------------

    @Test
    public void testDurationFields() {__CLR4_4_11ail1aillgchosla.R.globalSliceStart(getClass().getName(),60380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnkzye1al8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ail1aillgchosla.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ail1aillgchosla.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testDurationFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnkzye1al8(){try{__CLR4_4_11ail1aillgchosla.R.inc(60380);
        __CLR4_4_11ail1aillgchosla.R.inc(60381);final BuddhistChronology buddhist = BuddhistChronology.getInstance();
        __CLR4_4_11ail1aillgchosla.R.inc(60382);assertEquals("eras", buddhist.eras().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60383);assertEquals("centuries", buddhist.centuries().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60384);assertEquals("years", buddhist.years().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60385);assertEquals("weekyears", buddhist.weekyears().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60386);assertEquals("months", buddhist.months().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60387);assertEquals("weeks", buddhist.weeks().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60388);assertEquals("days", buddhist.days().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60389);assertEquals("halfdays", GregorianChronology.getInstance().halfdays().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60390);assertEquals("hours", buddhist.hours().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60391);assertEquals("minutes", buddhist.minutes().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60392);assertEquals("seconds", buddhist.seconds().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60393);assertEquals("millis", buddhist.millis().getName());

        __CLR4_4_11ail1aillgchosla.R.inc(60394);assertEquals(false, buddhist.eras().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60395);assertEquals(true, buddhist.centuries().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60396);assertEquals(true, buddhist.years().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60397);assertEquals(true, buddhist.weekyears().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60398);assertEquals(true, buddhist.months().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60399);assertEquals(true, buddhist.weeks().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60400);assertEquals(true, buddhist.days().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60401);assertEquals(true, buddhist.halfdays().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60402);assertEquals(true, buddhist.hours().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60403);assertEquals(true, buddhist.minutes().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60404);assertEquals(true, buddhist.seconds().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60405);assertEquals(true, buddhist.millis().isSupported());

        __CLR4_4_11ail1aillgchosla.R.inc(60406);assertEquals(false, buddhist.centuries().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60407);assertEquals(false, buddhist.years().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60408);assertEquals(false, buddhist.weekyears().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60409);assertEquals(false, buddhist.months().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60410);assertEquals(false, buddhist.weeks().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60411);assertEquals(false, buddhist.days().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60412);assertEquals(false, buddhist.halfdays().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60413);assertEquals(true, buddhist.hours().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60414);assertEquals(true, buddhist.minutes().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60415);assertEquals(true, buddhist.seconds().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60416);assertEquals(true, buddhist.millis().isPrecise());

        __CLR4_4_11ail1aillgchosla.R.inc(60417);final BuddhistChronology buddhistUTC = BuddhistChronology.getInstanceUTC();
        __CLR4_4_11ail1aillgchosla.R.inc(60418);assertEquals(false, buddhistUTC.centuries().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60419);assertEquals(false, buddhistUTC.years().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60420);assertEquals(false, buddhistUTC.weekyears().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60421);assertEquals(false, buddhistUTC.months().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60422);assertEquals(true, buddhistUTC.weeks().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60423);assertEquals(true, buddhistUTC.days().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60424);assertEquals(true, buddhistUTC.halfdays().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60425);assertEquals(true, buddhistUTC.hours().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60426);assertEquals(true, buddhistUTC.minutes().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60427);assertEquals(true, buddhistUTC.seconds().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60428);assertEquals(true, buddhistUTC.millis().isPrecise());

        __CLR4_4_11ail1aillgchosla.R.inc(60429);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        __CLR4_4_11ail1aillgchosla.R.inc(60430);final BuddhistChronology buddhistGMT = BuddhistChronology.getInstance(gmt);
        __CLR4_4_11ail1aillgchosla.R.inc(60431);assertEquals(false, buddhistGMT.centuries().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60432);assertEquals(false, buddhistGMT.years().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60433);assertEquals(false, buddhistGMT.weekyears().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60434);assertEquals(false, buddhistGMT.months().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60435);assertEquals(true, buddhistGMT.weeks().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60436);assertEquals(true, buddhistGMT.days().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60437);assertEquals(true, buddhistGMT.halfdays().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60438);assertEquals(true, buddhistGMT.hours().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60439);assertEquals(true, buddhistGMT.minutes().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60440);assertEquals(true, buddhistGMT.seconds().isPrecise());
        __CLR4_4_11ail1aillgchosla.R.inc(60441);assertEquals(true, buddhistGMT.millis().isPrecise());
    }finally{__CLR4_4_11ail1aillgchosla.R.flushNeeded();}}


    @Test
    public void testDateFields() {__CLR4_4_11ail1aillgchosla.R.globalSliceStart(getClass().getName(),60442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gkspeo1amy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ail1aillgchosla.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ail1aillgchosla.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testDateFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gkspeo1amy(){try{__CLR4_4_11ail1aillgchosla.R.inc(60442);
        __CLR4_4_11ail1aillgchosla.R.inc(60443);final BuddhistChronology buddhist = BuddhistChronology.getInstance();
        __CLR4_4_11ail1aillgchosla.R.inc(60444);assertEquals("era", buddhist.era().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60445);assertEquals("centuryOfEra", buddhist.centuryOfEra().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60446);assertEquals("yearOfCentury", buddhist.yearOfCentury().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60447);assertEquals("yearOfEra", buddhist.yearOfEra().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60448);assertEquals("year", buddhist.year().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60449);assertEquals("monthOfYear", buddhist.monthOfYear().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60450);assertEquals("weekyearOfCentury", buddhist.weekyearOfCentury().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60451);assertEquals("weekyear", buddhist.weekyear().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60452);assertEquals("weekOfWeekyear", buddhist.weekOfWeekyear().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60453);assertEquals("dayOfYear", buddhist.dayOfYear().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60454);assertEquals("dayOfMonth", buddhist.dayOfMonth().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60455);assertEquals("dayOfWeek", buddhist.dayOfWeek().getName());

        __CLR4_4_11ail1aillgchosla.R.inc(60456);assertEquals(true, buddhist.era().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60457);assertEquals(true, buddhist.centuryOfEra().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60458);assertEquals(true, buddhist.yearOfCentury().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60459);assertEquals(true, buddhist.yearOfEra().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60460);assertEquals(true, buddhist.year().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60461);assertEquals(true, buddhist.monthOfYear().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60462);assertEquals(true, buddhist.weekyearOfCentury().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60463);assertEquals(true, buddhist.weekyear().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60464);assertEquals(true, buddhist.weekOfWeekyear().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60465);assertEquals(true, buddhist.dayOfYear().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60466);assertEquals(true, buddhist.dayOfMonth().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60467);assertEquals(true, buddhist.dayOfWeek().isSupported());

        __CLR4_4_11ail1aillgchosla.R.inc(60468);assertEquals(buddhist.eras(), buddhist.era().getDurationField());
        __CLR4_4_11ail1aillgchosla.R.inc(60469);assertEquals(buddhist.centuries(), buddhist.centuryOfEra().getDurationField());
        __CLR4_4_11ail1aillgchosla.R.inc(60470);assertEquals(buddhist.years(), buddhist.yearOfCentury().getDurationField());
        __CLR4_4_11ail1aillgchosla.R.inc(60471);assertEquals(buddhist.years(), buddhist.yearOfEra().getDurationField());
        __CLR4_4_11ail1aillgchosla.R.inc(60472);assertEquals(buddhist.years(), buddhist.year().getDurationField());
        __CLR4_4_11ail1aillgchosla.R.inc(60473);assertEquals(buddhist.months(), buddhist.monthOfYear().getDurationField());
        __CLR4_4_11ail1aillgchosla.R.inc(60474);assertEquals(buddhist.weekyears(), buddhist.weekyearOfCentury().getDurationField());
        __CLR4_4_11ail1aillgchosla.R.inc(60475);assertEquals(buddhist.weekyears(), buddhist.weekyear().getDurationField());
        __CLR4_4_11ail1aillgchosla.R.inc(60476);assertEquals(buddhist.weeks(), buddhist.weekOfWeekyear().getDurationField());
        __CLR4_4_11ail1aillgchosla.R.inc(60477);assertEquals(buddhist.days(), buddhist.dayOfYear().getDurationField());
        __CLR4_4_11ail1aillgchosla.R.inc(60478);assertEquals(buddhist.days(), buddhist.dayOfMonth().getDurationField());
        __CLR4_4_11ail1aillgchosla.R.inc(60479);assertEquals(buddhist.days(), buddhist.dayOfWeek().getDurationField());

        __CLR4_4_11ail1aillgchosla.R.inc(60480);assertEquals(null, buddhist.era().getRangeDurationField());
        __CLR4_4_11ail1aillgchosla.R.inc(60481);assertEquals(buddhist.eras(), buddhist.centuryOfEra().getRangeDurationField());
        __CLR4_4_11ail1aillgchosla.R.inc(60482);assertEquals(buddhist.centuries(), buddhist.yearOfCentury().getRangeDurationField());
        __CLR4_4_11ail1aillgchosla.R.inc(60483);assertEquals(buddhist.eras(), buddhist.yearOfEra().getRangeDurationField());
        __CLR4_4_11ail1aillgchosla.R.inc(60484);assertEquals(null, buddhist.year().getRangeDurationField());
        __CLR4_4_11ail1aillgchosla.R.inc(60485);assertEquals(buddhist.years(), buddhist.monthOfYear().getRangeDurationField());
        __CLR4_4_11ail1aillgchosla.R.inc(60486);assertEquals(buddhist.centuries(), buddhist.weekyearOfCentury().getRangeDurationField());
        __CLR4_4_11ail1aillgchosla.R.inc(60487);assertEquals(null, buddhist.weekyear().getRangeDurationField());
        __CLR4_4_11ail1aillgchosla.R.inc(60488);assertEquals(buddhist.weekyears(), buddhist.weekOfWeekyear().getRangeDurationField());
        __CLR4_4_11ail1aillgchosla.R.inc(60489);assertEquals(buddhist.years(), buddhist.dayOfYear().getRangeDurationField());
        __CLR4_4_11ail1aillgchosla.R.inc(60490);assertEquals(buddhist.months(), buddhist.dayOfMonth().getRangeDurationField());
        __CLR4_4_11ail1aillgchosla.R.inc(60491);assertEquals(buddhist.weeks(), buddhist.dayOfWeek().getRangeDurationField());
    }finally{__CLR4_4_11ail1aillgchosla.R.flushNeeded();}}


    @Test
    public void testTimeFields() {__CLR4_4_11ail1aillgchosla.R.globalSliceStart(getClass().getName(),60492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r11up1aoc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ail1aillgchosla.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ail1aillgchosla.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testTimeFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r11up1aoc(){try{__CLR4_4_11ail1aillgchosla.R.inc(60492);
        __CLR4_4_11ail1aillgchosla.R.inc(60493);final BuddhistChronology buddhist = BuddhistChronology.getInstance();
        __CLR4_4_11ail1aillgchosla.R.inc(60494);assertEquals("halfdayOfDay", buddhist.halfdayOfDay().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60495);assertEquals("clockhourOfHalfday", buddhist.clockhourOfHalfday().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60496);assertEquals("hourOfHalfday", buddhist.hourOfHalfday().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60497);assertEquals("clockhourOfDay", buddhist.clockhourOfDay().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60498);assertEquals("hourOfDay", buddhist.hourOfDay().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60499);assertEquals("minuteOfDay", buddhist.minuteOfDay().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60500);assertEquals("minuteOfHour", buddhist.minuteOfHour().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60501);assertEquals("secondOfDay", buddhist.secondOfDay().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60502);assertEquals("secondOfMinute", buddhist.secondOfMinute().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60503);assertEquals("millisOfDay", buddhist.millisOfDay().getName());
        __CLR4_4_11ail1aillgchosla.R.inc(60504);assertEquals("millisOfSecond", buddhist.millisOfSecond().getName());

        __CLR4_4_11ail1aillgchosla.R.inc(60505);assertEquals(true, buddhist.halfdayOfDay().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60506);assertEquals(true, buddhist.clockhourOfHalfday().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60507);assertEquals(true, buddhist.hourOfHalfday().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60508);assertEquals(true, buddhist.clockhourOfDay().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60509);assertEquals(true, buddhist.hourOfDay().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60510);assertEquals(true, buddhist.minuteOfDay().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60511);assertEquals(true, buddhist.minuteOfHour().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60512);assertEquals(true, buddhist.secondOfDay().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60513);assertEquals(true, buddhist.secondOfMinute().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60514);assertEquals(true, buddhist.millisOfDay().isSupported());
        __CLR4_4_11ail1aillgchosla.R.inc(60515);assertEquals(true, buddhist.millisOfSecond().isSupported());
    }finally{__CLR4_4_11ail1aillgchosla.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    @Test
    public void testEpoch() {__CLR4_4_11ail1aillgchosla.R.globalSliceStart(getClass().getName(),60516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19p7wci1ap0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ail1aillgchosla.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ail1aillgchosla.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testEpoch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19p7wci1ap0(){try{__CLR4_4_11ail1aillgchosla.R.inc(60516);
        __CLR4_4_11ail1aillgchosla.R.inc(60517);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
        __CLR4_4_11ail1aillgchosla.R.inc(60518);assertEquals(new DateTime(-543, 1, 1, 0, 0, 0, 0, JULIAN_UTC), epoch.withChronology(JULIAN_UTC));
    }finally{__CLR4_4_11ail1aillgchosla.R.flushNeeded();}}

    @Test
    public void testEra() {__CLR4_4_11ail1aillgchosla.R.globalSliceStart(getClass().getName(),60519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13euvzd1ap3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ail1aillgchosla.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ail1aillgchosla.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13euvzd1ap3(){try{__CLR4_4_11ail1aillgchosla.R.inc(60519);
        __CLR4_4_11ail1aillgchosla.R.inc(60520);assertEquals(1, BuddhistChronology.BE);
        __CLR4_4_11ail1aillgchosla.R.inc(60521);try {
            __CLR4_4_11ail1aillgchosla.R.inc(60522);new DateTime(-1, 13, 5, 0, 0, 0, 0, BUDDHIST_UTC);
            __CLR4_4_11ail1aillgchosla.R.inc(60523);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11ail1aillgchosla.R.flushNeeded();}}


    @Test
    public void testKeyYears() {__CLR4_4_11ail1aillgchosla.R.globalSliceStart(getClass().getName(),60524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_134eu7k1ap8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ail1aillgchosla.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ail1aillgchosla.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testKeyYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_134eu7k1ap8(){try{__CLR4_4_11ail1aillgchosla.R.inc(60524);
        __CLR4_4_11ail1aillgchosla.R.inc(60525);DateTime bd = new DateTime(2513, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
        __CLR4_4_11ail1aillgchosla.R.inc(60526);DateTime jd = new DateTime(1970, 1, 1, 0, 0, 0, 0, GJ_UTC);
        __CLR4_4_11ail1aillgchosla.R.inc(60527);assertEquals(jd, bd.withChronology(GJ_UTC));
        __CLR4_4_11ail1aillgchosla.R.inc(60528);assertEquals(2513, bd.getYear());
        __CLR4_4_11ail1aillgchosla.R.inc(60529);assertEquals(2513, bd.getYearOfEra());
        __CLR4_4_11ail1aillgchosla.R.inc(60530);assertEquals(2513, bd.plus(Period.weeks(1)).getWeekyear());

        __CLR4_4_11ail1aillgchosla.R.inc(60531);bd = new DateTime(2126, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
        __CLR4_4_11ail1aillgchosla.R.inc(60532);jd = new DateTime(1583, 1, 1, 0, 0, 0, 0, GJ_UTC);
        __CLR4_4_11ail1aillgchosla.R.inc(60533);assertEquals(jd, bd.withChronology(GJ_UTC));
        __CLR4_4_11ail1aillgchosla.R.inc(60534);assertEquals(2126, bd.getYear());
        __CLR4_4_11ail1aillgchosla.R.inc(60535);assertEquals(2126, bd.getYearOfEra());
        __CLR4_4_11ail1aillgchosla.R.inc(60536);assertEquals(2126, bd.plus(Period.weeks(1)).getWeekyear());

        __CLR4_4_11ail1aillgchosla.R.inc(60537);bd = new DateTime(2125, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
        __CLR4_4_11ail1aillgchosla.R.inc(60538);jd = new DateTime(1582, 1, 1, 0, 0, 0, 0, GJ_UTC);
        __CLR4_4_11ail1aillgchosla.R.inc(60539);assertEquals(jd, bd.withChronology(GJ_UTC));
        __CLR4_4_11ail1aillgchosla.R.inc(60540);assertEquals(2125, bd.getYear());
        __CLR4_4_11ail1aillgchosla.R.inc(60541);assertEquals(2125, bd.getYearOfEra());
        __CLR4_4_11ail1aillgchosla.R.inc(60542);assertEquals(2125, bd.plus(Period.weeks(1)).getWeekyear());

        __CLR4_4_11ail1aillgchosla.R.inc(60543);bd = new DateTime(544, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
        __CLR4_4_11ail1aillgchosla.R.inc(60544);jd = new DateTime(1, 1, 1, 0, 0, 0, 0, GJ_UTC);
        __CLR4_4_11ail1aillgchosla.R.inc(60545);assertEquals(jd, bd.withChronology(GJ_UTC));
        __CLR4_4_11ail1aillgchosla.R.inc(60546);assertEquals(544, bd.getYear());
        __CLR4_4_11ail1aillgchosla.R.inc(60547);assertEquals(544, bd.getYearOfEra());
        __CLR4_4_11ail1aillgchosla.R.inc(60548);assertEquals(544, bd.plus(Period.weeks(1)).getWeekyear());

        __CLR4_4_11ail1aillgchosla.R.inc(60549);bd = new DateTime(543, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
        __CLR4_4_11ail1aillgchosla.R.inc(60550);jd = new DateTime(-1, 1, 1, 0, 0, 0, 0, GJ_UTC);
        __CLR4_4_11ail1aillgchosla.R.inc(60551);assertEquals(jd, bd.withChronology(GJ_UTC));
        __CLR4_4_11ail1aillgchosla.R.inc(60552);assertEquals(543, bd.getYear());
        __CLR4_4_11ail1aillgchosla.R.inc(60553);assertEquals(543, bd.getYearOfEra());
        __CLR4_4_11ail1aillgchosla.R.inc(60554);assertEquals(543, bd.plus(Period.weeks(1)).getWeekyear());

        __CLR4_4_11ail1aillgchosla.R.inc(60555);bd = new DateTime(1, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
        __CLR4_4_11ail1aillgchosla.R.inc(60556);jd = new DateTime(-543, 1, 1, 0, 0, 0, 0, GJ_UTC);
        __CLR4_4_11ail1aillgchosla.R.inc(60557);assertEquals(jd, bd.withChronology(GJ_UTC));
        __CLR4_4_11ail1aillgchosla.R.inc(60558);assertEquals(1, bd.getYear());
        __CLR4_4_11ail1aillgchosla.R.inc(60559);assertEquals(1, bd.getYearOfEra());
        __CLR4_4_11ail1aillgchosla.R.inc(60560);assertEquals(1, bd.plus(Period.weeks(1)).getWeekyear());
    }finally{__CLR4_4_11ail1aillgchosla.R.flushNeeded();}}


    @Test
    public void testCalendar() {__CLR4_4_11ail1aillgchosla.R.globalSliceStart(getClass().getName(),60561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1odnsqf1aq9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ail1aillgchosla.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ail1aillgchosla.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testCalendar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1odnsqf1aq9(){try{__CLR4_4_11ail1aillgchosla.R.inc(60561);
        __CLR4_4_11ail1aillgchosla.R.inc(60562);if ((((TestAll.FAST)&&(__CLR4_4_11ail1aillgchosla.R.iget(60563)!=0|true))||(__CLR4_4_11ail1aillgchosla.R.iget(60564)==0&false))) {{
            __CLR4_4_11ail1aillgchosla.R.inc(60565);return;
        }
        }__CLR4_4_11ail1aillgchosla.R.inc(60566);System.out.println("\nTestBuddhistChronology.testCalendar");
        __CLR4_4_11ail1aillgchosla.R.inc(60567);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
        __CLR4_4_11ail1aillgchosla.R.inc(60568);long millis = epoch.getMillis();
        __CLR4_4_11ail1aillgchosla.R.inc(60569);long end = new DateTime(3000, 1, 1, 0, 0, 0, 0, ISO_UTC).getMillis();
        __CLR4_4_11ail1aillgchosla.R.inc(60570);DateTimeField dayOfWeek = BUDDHIST_UTC.dayOfWeek();
        __CLR4_4_11ail1aillgchosla.R.inc(60571);DateTimeField weekOfWeekyear = GJ_UTC.weekOfWeekyear();
        __CLR4_4_11ail1aillgchosla.R.inc(60572);DateTimeField dayOfYear = BUDDHIST_UTC.dayOfYear();
        __CLR4_4_11ail1aillgchosla.R.inc(60573);DateTimeField dayOfMonth = BUDDHIST_UTC.dayOfMonth();
        __CLR4_4_11ail1aillgchosla.R.inc(60574);DateTimeField monthOfYear = BUDDHIST_UTC.monthOfYear();
        __CLR4_4_11ail1aillgchosla.R.inc(60575);DateTimeField year = BUDDHIST_UTC.year();
        __CLR4_4_11ail1aillgchosla.R.inc(60576);DateTimeField yearOfEra = BUDDHIST_UTC.yearOfEra();
        __CLR4_4_11ail1aillgchosla.R.inc(60577);DateTimeField era = BUDDHIST_UTC.era();
        __CLR4_4_11ail1aillgchosla.R.inc(60578);DateTimeField gjDayOfWeek = GJ_UTC.dayOfWeek();
        __CLR4_4_11ail1aillgchosla.R.inc(60579);DateTimeField gjWeekOfWeekyear = GJ_UTC.weekOfWeekyear();
        __CLR4_4_11ail1aillgchosla.R.inc(60580);DateTimeField gjDayOfYear = GJ_UTC.dayOfYear();
        __CLR4_4_11ail1aillgchosla.R.inc(60581);DateTimeField gjDayOfMonth = GJ_UTC.dayOfMonth();
        __CLR4_4_11ail1aillgchosla.R.inc(60582);DateTimeField gjMonthOfYear = GJ_UTC.monthOfYear();
        __CLR4_4_11ail1aillgchosla.R.inc(60583);DateTimeField gjYear = GJ_UTC.year();
        __CLR4_4_11ail1aillgchosla.R.inc(60584);while ((((millis < end)&&(__CLR4_4_11ail1aillgchosla.R.iget(60585)!=0|true))||(__CLR4_4_11ail1aillgchosla.R.iget(60586)==0&false))) {{
            __CLR4_4_11ail1aillgchosla.R.inc(60587);assertEquals(gjDayOfWeek.get(millis), dayOfWeek.get(millis));
            __CLR4_4_11ail1aillgchosla.R.inc(60588);assertEquals(gjDayOfYear.get(millis), dayOfYear.get(millis));
            __CLR4_4_11ail1aillgchosla.R.inc(60589);assertEquals(gjDayOfMonth.get(millis), dayOfMonth.get(millis));
            __CLR4_4_11ail1aillgchosla.R.inc(60590);assertEquals(gjMonthOfYear.get(millis), monthOfYear.get(millis));
            __CLR4_4_11ail1aillgchosla.R.inc(60591);assertEquals(gjWeekOfWeekyear.get(millis), weekOfWeekyear.get(millis));
            __CLR4_4_11ail1aillgchosla.R.inc(60592);assertEquals(1, era.get(millis));
            __CLR4_4_11ail1aillgchosla.R.inc(60593);int yearValue = gjYear.get(millis);
            __CLR4_4_11ail1aillgchosla.R.inc(60594);if ((((yearValue <= 0)&&(__CLR4_4_11ail1aillgchosla.R.iget(60595)!=0|true))||(__CLR4_4_11ail1aillgchosla.R.iget(60596)==0&false))) {{
                __CLR4_4_11ail1aillgchosla.R.inc(60597);yearValue++;
            }
            }__CLR4_4_11ail1aillgchosla.R.inc(60598);yearValue += 543;
            __CLR4_4_11ail1aillgchosla.R.inc(60599);assertEquals(yearValue, year.get(millis));
            __CLR4_4_11ail1aillgchosla.R.inc(60600);assertEquals(yearValue, yearOfEra.get(millis));
            __CLR4_4_11ail1aillgchosla.R.inc(60601);millis += SKIP;
            __CLR4_4_11ail1aillgchosla.R.inc(60602);break; // SBH:added this line to exit from loop, this was only required to generate a smaller trace
        }
    }}finally{__CLR4_4_11ail1aillgchosla.R.flushNeeded();}}

}
