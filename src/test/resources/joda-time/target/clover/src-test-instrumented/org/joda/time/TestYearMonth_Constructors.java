/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Constructors {static class __CLR4_4_119w919w9lgchoski{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,59760,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    private long TEST_TIME1 =
            (31L + 28L + 31L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 12L * DateTimeConstants.MILLIS_PER_HOUR
                    + 24L * DateTimeConstants.MILLIS_PER_MINUTE;

    private long TEST_TIME2 =
            (365L + 31L + 28L + 31L + 30L + 7L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 14L * DateTimeConstants.MILLIS_PER_HOUR
                    + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Throwable {try{__CLR4_4_119w919w9lgchoski.R.inc(59481);
        __CLR4_4_119w919w9lgchoski.R.inc(59482);TestYearMonth_Constructors TB = new TestYearMonth_Constructors();
        __CLR4_4_119w919w9lgchoski.R.inc(59483);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59484);TB.testParse_noFormatter();
        __CLR4_4_119w919w9lgchoski.R.inc(59485);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59486);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59487);TB.testParse_formatter();
        __CLR4_4_119w919w9lgchoski.R.inc(59488);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59489);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59490);TB.testFactory_FromCalendarFields();
        __CLR4_4_119w919w9lgchoski.R.inc(59491);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59492);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59493);TB.testFactory_FromDateFields();
        __CLR4_4_119w919w9lgchoski.R.inc(59494);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59495);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59496);TB.testConstructor();
        __CLR4_4_119w919w9lgchoski.R.inc(59497);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59498);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59499);TB.testConstructor_DateTimeZone();
        __CLR4_4_119w919w9lgchoski.R.inc(59500);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59501);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59502);TB.testConstructor_nullDateTimeZone();
        __CLR4_4_119w919w9lgchoski.R.inc(59503);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59504);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59505);TB.testConstructor_Chronology();
        __CLR4_4_119w919w9lgchoski.R.inc(59506);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59507);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59508);TB.testConstructor_nullChronology();
        __CLR4_4_119w919w9lgchoski.R.inc(59509);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59510);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59511);TB.testConstructor_long1();
        __CLR4_4_119w919w9lgchoski.R.inc(59512);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59513);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59514);TB.testConstructor_long2();
        __CLR4_4_119w919w9lgchoski.R.inc(59515);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59516);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59517);TB.testConstructor_long1_Chronology();
        __CLR4_4_119w919w9lgchoski.R.inc(59518);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59519);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59520);TB.testConstructor_long2_Chronology();
        __CLR4_4_119w919w9lgchoski.R.inc(59521);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59522);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59523);TB.testConstructor_long_nullChronology();
        __CLR4_4_119w919w9lgchoski.R.inc(59524);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59525);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59526);TB.testConstructor_Object();
        __CLR4_4_119w919w9lgchoski.R.inc(59527);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59528);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59529);TB.testConstructor_nullObject();
        __CLR4_4_119w919w9lgchoski.R.inc(59530);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59531);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59532);TB.testConstructor_ObjectString1();
        __CLR4_4_119w919w9lgchoski.R.inc(59533);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59534);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59535);TB.testConstructor_ObjectString5();
        __CLR4_4_119w919w9lgchoski.R.inc(59536);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59537);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59538);TB.testConstructor_ObjectStringEx1();
        __CLR4_4_119w919w9lgchoski.R.inc(59539);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59540);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59541);TB.testConstructor_ObjectStringEx2();
        __CLR4_4_119w919w9lgchoski.R.inc(59542);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59543);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59544);TB.testConstructor_ObjectStringEx3();
        __CLR4_4_119w919w9lgchoski.R.inc(59545);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59546);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59547);TB.testConstructor_ObjectStringEx4();
        __CLR4_4_119w919w9lgchoski.R.inc(59548);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59549);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59550);TB.testConstructor_Object_Chronology();
        __CLR4_4_119w919w9lgchoski.R.inc(59551);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59552);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59553);TB.testConstructor_nullObject_Chronology();
        __CLR4_4_119w919w9lgchoski.R.inc(59554);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59555);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59556);TB.testConstructor_Object_nullChronology();
        __CLR4_4_119w919w9lgchoski.R.inc(59557);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59558);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59559);TB.testConstructor_nullObject_nullChronology();
        __CLR4_4_119w919w9lgchoski.R.inc(59560);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59561);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59562);TB.testConstructor_int_int();
        __CLR4_4_119w919w9lgchoski.R.inc(59563);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59564);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59565);TB.testConstructor_int_int_Chronology();
        __CLR4_4_119w919w9lgchoski.R.inc(59566);TB.tearDown();
        __CLR4_4_119w919w9lgchoski.R.inc(59567);TB.setUp();
        __CLR4_4_119w919w9lgchoski.R.inc(59568);TB.testConstructor_int_int_nullChronology();
        __CLR4_4_119w919w9lgchoski.R.inc(59569);TB.tearDown();

    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestYearMonth_Constructors.class);
    }

    public TestYearMonth_Constructors(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_119w919w9lgchoski.R.inc(59570);
        __CLR4_4_119w919w9lgchoski.R.inc(59571);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_119w919w9lgchoski.R.inc(59572);zone = DateTimeZone.getDefault();
        __CLR4_4_119w919w9lgchoski.R.inc(59573);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_119w919w9lgchoski.R.inc(59574);
        __CLR4_4_119w919w9lgchoski.R.inc(59575);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_119w919w9lgchoski.R.inc(59576);DateTimeZone.setDefault(zone);
        __CLR4_4_119w919w9lgchoski.R.inc(59577);zone = null;
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParse_noFormatter() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqvi19yy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqvi19yy() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59578);
        __CLR4_4_119w919w9lgchoski.R.inc(59579);assertEquals(new YearMonth(2010, 6), YearMonth.parse("2010-06-30"));
        __CLR4_4_119w919w9lgchoski.R.inc(59580);assertEquals(new YearMonth(2010, 1), YearMonth.parse("2010-002"));
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    @Test
    public void testParse_formatter() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wvtnx19z1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testParse_formatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wvtnx19z1() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59581);
        __CLR4_4_119w919w9lgchoski.R.inc(59582);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--MM").withChronology(ISOChronology.getInstance(PARIS));
        __CLR4_4_119w919w9lgchoski.R.inc(59583);assertEquals(new YearMonth(2010, 6), YearMonth.parse("2010--06", f));
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_FromCalendarFields() throws Exception {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxckb319z4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testFactory_FromCalendarFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxckb319z4() throws Exception{try{__CLR4_4_119w919w9lgchoski.R.inc(59584);
        __CLR4_4_119w919w9lgchoski.R.inc(59585);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_119w919w9lgchoski.R.inc(59586);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_119w919w9lgchoski.R.inc(59587);YearMonth expected = new YearMonth(1970, 2);
        __CLR4_4_119w919w9lgchoski.R.inc(59588);assertEquals(expected, YearMonth.fromCalendarFields(cal));
        __CLR4_4_119w919w9lgchoski.R.inc(59589);try {
            __CLR4_4_119w919w9lgchoski.R.inc(59590);YearMonth.fromCalendarFields(null);
            __CLR4_4_119w919w9lgchoski.R.inc(59591);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_FromDateFields() throws Exception {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16u5j2719zc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testFactory_FromDateFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16u5j2719zc() throws Exception{try{__CLR4_4_119w919w9lgchoski.R.inc(59592);
        __CLR4_4_119w919w9lgchoski.R.inc(59593);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_119w919w9lgchoski.R.inc(59594);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_119w919w9lgchoski.R.inc(59595);YearMonth expected = new YearMonth(1970, 2);
        __CLR4_4_119w919w9lgchoski.R.inc(59596);assertEquals(expected, YearMonth.fromDateFields(cal.getTime()));
        __CLR4_4_119w919w9lgchoski.R.inc(59597);try {
            __CLR4_4_119w919w9lgchoski.R.inc(59598);YearMonth.fromDateFields(null);
            __CLR4_4_119w919w9lgchoski.R.inc(59599);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor ()
     */
    @Test
    public void testConstructor() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8h19zk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59600,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8h19zk() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59600);
        __CLR4_4_119w919w9lgchoski.R.inc(59601);YearMonth test = new YearMonth();
        __CLR4_4_119w919w9lgchoski.R.inc(59602);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_119w919w9lgchoski.R.inc(59603);assertEquals(1970, test.getYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59604);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59605);assertEquals(test, YearMonth.now());
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone)
     */
    @Test
    public void testConstructor_DateTimeZone() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4m1k519zq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4m1k519zq() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59606);
        __CLR4_4_119w919w9lgchoski.R.inc(59607);DateTime dt = new DateTime(2005, 6, 30, 23, 59, 0, 0, LONDON);
        __CLR4_4_119w919w9lgchoski.R.inc(59608);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris

        __CLR4_4_119w919w9lgchoski.R.inc(59609);YearMonth test = new YearMonth(LONDON);
        __CLR4_4_119w919w9lgchoski.R.inc(59610);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_119w919w9lgchoski.R.inc(59611);assertEquals(2005, test.getYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59612);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59613);assertEquals(test, YearMonth.now(LONDON));

        __CLR4_4_119w919w9lgchoski.R.inc(59614);test = new YearMonth(PARIS);
        __CLR4_4_119w919w9lgchoski.R.inc(59615);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_119w919w9lgchoski.R.inc(59616);assertEquals(2005, test.getYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59617);assertEquals(7, test.getMonthOfYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59618);assertEquals(test, YearMonth.now(PARIS));
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone=null)
     */
    @Test
    public void testConstructor_nullDateTimeZone() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zs1ro1a03();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zs1ro1a03() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59619);
        __CLR4_4_119w919w9lgchoski.R.inc(59620);DateTime dt = new DateTime(2005, 6, 30, 23, 59, 0, 0, LONDON);
        __CLR4_4_119w919w9lgchoski.R.inc(59621);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris

        __CLR4_4_119w919w9lgchoski.R.inc(59622);YearMonth test = new YearMonth((DateTimeZone) null);
        __CLR4_4_119w919w9lgchoski.R.inc(59623);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_119w919w9lgchoski.R.inc(59624);assertEquals(2005, test.getYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59625);assertEquals(6, test.getMonthOfYear());
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    /**
     * Test constructor (Chronology)
     */
    @Test
    public void testConstructor_Chronology() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15931ti1a0a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15931ti1a0a() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59626);
        __CLR4_4_119w919w9lgchoski.R.inc(59627);YearMonth test = new YearMonth(GREGORIAN_PARIS);
        __CLR4_4_119w919w9lgchoski.R.inc(59628);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_119w919w9lgchoski.R.inc(59629);assertEquals(1970, test.getYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59630);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59631);assertEquals(test, YearMonth.now(GREGORIAN_PARIS));
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    /**
     * Test constructor (Chronology=null)
     */
    @Test
    public void testConstructor_nullChronology() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qcb6r1a0g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qcb6r1a0g() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59632);
        __CLR4_4_119w919w9lgchoski.R.inc(59633);YearMonth test = new YearMonth((Chronology) null);
        __CLR4_4_119w919w9lgchoski.R.inc(59634);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_119w919w9lgchoski.R.inc(59635);assertEquals(1970, test.getYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59636);assertEquals(6, test.getMonthOfYear());
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (long)
     */
    @Test
    public void testConstructor_long1() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13cr1a0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59637,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13cr1a0l() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59637);
        __CLR4_4_119w919w9lgchoski.R.inc(59638);YearMonth test = new YearMonth(TEST_TIME1);
        __CLR4_4_119w919w9lgchoski.R.inc(59639);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_119w919w9lgchoski.R.inc(59640);assertEquals(1970, test.getYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59641);assertEquals(4, test.getMonthOfYear());
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    /**
     * Test constructor (long)
     */
    @Test
    public void testConstructor_long2() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914ka1a0q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914ka1a0q() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59642);
        __CLR4_4_119w919w9lgchoski.R.inc(59643);YearMonth test = new YearMonth(TEST_TIME2);
        __CLR4_4_119w919w9lgchoski.R.inc(59644);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_119w919w9lgchoski.R.inc(59645);assertEquals(1971, test.getYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59646);assertEquals(5, test.getMonthOfYear());
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    @Test
    public void testConstructor_long1_Chronology() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115wn5s1a0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_long1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115wn5s1a0v() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59647);
        __CLR4_4_119w919w9lgchoski.R.inc(59648);YearMonth test = new YearMonth(TEST_TIME1, GREGORIAN_PARIS);
        __CLR4_4_119w919w9lgchoski.R.inc(59649);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_119w919w9lgchoski.R.inc(59650);assertEquals(1970, test.getYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59651);assertEquals(4, test.getMonthOfYear());
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    @Test
    public void testConstructor_long2_Chronology() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14nqmkh1a10();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_long2_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59652,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14nqmkh1a10() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59652);
        __CLR4_4_119w919w9lgchoski.R.inc(59653);YearMonth test = new YearMonth(TEST_TIME2, GREGORIAN_PARIS);
        __CLR4_4_119w919w9lgchoski.R.inc(59654);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_119w919w9lgchoski.R.inc(59655);assertEquals(1971, test.getYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59656);assertEquals(5, test.getMonthOfYear());
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology=null)
     */
    @Test
    public void testConstructor_long_nullChronology() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnhcku1a15();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59657,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnhcku1a15() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59657);
        __CLR4_4_119w919w9lgchoski.R.inc(59658);YearMonth test = new YearMonth(TEST_TIME1, null);
        __CLR4_4_119w919w9lgchoski.R.inc(59659);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_119w919w9lgchoski.R.inc(59660);assertEquals(1970, test.getYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59661);assertEquals(4, test.getMonthOfYear());
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_Object() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eplceb1a1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59662,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eplceb1a1a() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59662);
        __CLR4_4_119w919w9lgchoski.R.inc(59663);Date date = new Date(TEST_TIME1);
        __CLR4_4_119w919w9lgchoski.R.inc(59664);YearMonth test = new YearMonth(date);
        __CLR4_4_119w919w9lgchoski.R.inc(59665);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_119w919w9lgchoski.R.inc(59666);assertEquals(1970, test.getYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59667);assertEquals(4, test.getMonthOfYear());
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    @Test
    public void testConstructor_nullObject() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt59uk1a1g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_nullObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59668,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt59uk1a1g() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59668);
        __CLR4_4_119w919w9lgchoski.R.inc(59669);YearMonth test = new YearMonth((Object) null);
        __CLR4_4_119w919w9lgchoski.R.inc(59670);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_119w919w9lgchoski.R.inc(59671);assertEquals(1970, test.getYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59672);assertEquals(6, test.getMonthOfYear());
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString1() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11c2b5d1a1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_ObjectString1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11c2b5d1a1l() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59673);
        __CLR4_4_119w919w9lgchoski.R.inc(59674);YearMonth test = new YearMonth("1972-12");
        __CLR4_4_119w919w9lgchoski.R.inc(59675);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_119w919w9lgchoski.R.inc(59676);assertEquals(1972, test.getYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59677);assertEquals(12, test.getMonthOfYear());
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString5() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ec26b91a1q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_ObjectString5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ec26b91a1q() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59678);
        __CLR4_4_119w919w9lgchoski.R.inc(59679);YearMonth test = new YearMonth("10");
        __CLR4_4_119w919w9lgchoski.R.inc(59680);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_119w919w9lgchoski.R.inc(59681);assertEquals(10, test.getYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59682);assertEquals(1, test.getMonthOfYear());
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx1() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11daule1a1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_ObjectStringEx1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11daule1a1v() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59683);
        __CLR4_4_119w919w9lgchoski.R.inc(59684);try {
            __CLR4_4_119w919w9lgchoski.R.inc(59685);new YearMonth("T10:20:30.040");
            __CLR4_4_119w919w9lgchoski.R.inc(59686);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx2() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vp4731a1z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_ObjectStringEx2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59687,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vp4731a1z() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59687);
        __CLR4_4_119w919w9lgchoski.R.inc(59688);try {
            __CLR4_4_119w919w9lgchoski.R.inc(59689);new YearMonth("T10:20:30.040+14:00");
            __CLR4_4_119w919w9lgchoski.R.inc(59690);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx3() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_154p2zk1a23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_ObjectStringEx3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_154p2zk1a23() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59691);
        __CLR4_4_119w919w9lgchoski.R.inc(59692);try {
            __CLR4_4_119w919w9lgchoski.R.inc(59693);new YearMonth("10:20:30.040");
            __CLR4_4_119w919w9lgchoski.R.inc(59694);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx4() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18dp1s11a27();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_ObjectStringEx4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18dp1s11a27() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59695);
        __CLR4_4_119w919w9lgchoski.R.inc(59696);try {
            __CLR4_4_119w919w9lgchoski.R.inc(59697);new YearMonth("10:20:30.040+14:00");
            __CLR4_4_119w919w9lgchoski.R.inc(59698);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (Object, Chronology)
     */
    @Test
    public void testConstructor_Object_Chronology() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vmnvd41a2b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vmnvd41a2b() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59699);
        __CLR4_4_119w919w9lgchoski.R.inc(59700);Date date = new Date(TEST_TIME1);
        __CLR4_4_119w919w9lgchoski.R.inc(59701);YearMonth test = new YearMonth(date, GREGORIAN_PARIS);
        __CLR4_4_119w919w9lgchoski.R.inc(59702);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_119w919w9lgchoski.R.inc(59703);assertEquals(1970, test.getYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59704);assertEquals(4, test.getMonthOfYear());
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology)
     */
    @Test
    public void testConstructor_nullObject_Chronology() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q0uyn1a2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_nullObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q0uyn1a2h() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59705);
        __CLR4_4_119w919w9lgchoski.R.inc(59706);YearMonth test = new YearMonth((Object) null, GREGORIAN_PARIS);
        __CLR4_4_119w919w9lgchoski.R.inc(59707);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_119w919w9lgchoski.R.inc(59708);assertEquals(1970, test.getYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59709);assertEquals(6, test.getMonthOfYear());
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology=null)
     */
    @Test
    public void testConstructor_Object_nullChronology() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yccijz1a2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59710,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yccijz1a2m() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59710);
        __CLR4_4_119w919w9lgchoski.R.inc(59711);Date date = new Date(TEST_TIME1);
        __CLR4_4_119w919w9lgchoski.R.inc(59712);YearMonth test = new YearMonth(date, null);
        __CLR4_4_119w919w9lgchoski.R.inc(59713);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_119w919w9lgchoski.R.inc(59714);assertEquals(1970, test.getYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59715);assertEquals(4, test.getMonthOfYear());
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    @Test
    public void testConstructor_nullObject_nullChronology() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dtve01a2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_nullObject_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dtve01a2s() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59716);
        __CLR4_4_119w919w9lgchoski.R.inc(59717);YearMonth test = new YearMonth((Object) null, null);
        __CLR4_4_119w919w9lgchoski.R.inc(59718);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_119w919w9lgchoski.R.inc(59719);assertEquals(1970, test.getYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59720);assertEquals(6, test.getMonthOfYear());
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (int, int)
     */
    @Test
    public void testConstructor_int_int() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5ioxb1a2x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59721,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5ioxb1a2x() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59721);
        __CLR4_4_119w919w9lgchoski.R.inc(59722);YearMonth test = new YearMonth(1970, 6);
        __CLR4_4_119w919w9lgchoski.R.inc(59723);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_119w919w9lgchoski.R.inc(59724);assertEquals(1970, test.getYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59725);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59726);try {
            __CLR4_4_119w919w9lgchoski.R.inc(59727);new YearMonth(Integer.MIN_VALUE, 6);
            __CLR4_4_119w919w9lgchoski.R.inc(59728);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_119w919w9lgchoski.R.inc(59729);try {
            __CLR4_4_119w919w9lgchoski.R.inc(59730);new YearMonth(Integer.MAX_VALUE, 6);
            __CLR4_4_119w919w9lgchoski.R.inc(59731);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_119w919w9lgchoski.R.inc(59732);try {
            __CLR4_4_119w919w9lgchoski.R.inc(59733);new YearMonth(1970, 0);
            __CLR4_4_119w919w9lgchoski.R.inc(59734);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_119w919w9lgchoski.R.inc(59735);try {
            __CLR4_4_119w919w9lgchoski.R.inc(59736);new YearMonth(1970, 13);
            __CLR4_4_119w919w9lgchoski.R.inc(59737);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    /**
     * Test constructor (int, int, Chronology)
     */
    @Test
    public void testConstructor_int_int_Chronology() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bb8f3e1a3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bb8f3e1a3e() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59738);
        __CLR4_4_119w919w9lgchoski.R.inc(59739);YearMonth test = new YearMonth(1970, 6, GREGORIAN_PARIS);
        __CLR4_4_119w919w9lgchoski.R.inc(59740);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_119w919w9lgchoski.R.inc(59741);assertEquals(1970, test.getYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59742);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59743);try {
            __CLR4_4_119w919w9lgchoski.R.inc(59744);new YearMonth(Integer.MIN_VALUE, 6, GREGORIAN_PARIS);
            __CLR4_4_119w919w9lgchoski.R.inc(59745);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_119w919w9lgchoski.R.inc(59746);try {
            __CLR4_4_119w919w9lgchoski.R.inc(59747);new YearMonth(Integer.MAX_VALUE, 6, GREGORIAN_PARIS);
            __CLR4_4_119w919w9lgchoski.R.inc(59748);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_119w919w9lgchoski.R.inc(59749);try {
            __CLR4_4_119w919w9lgchoski.R.inc(59750);new YearMonth(1970, 0, GREGORIAN_PARIS);
            __CLR4_4_119w919w9lgchoski.R.inc(59751);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_119w919w9lgchoski.R.inc(59752);try {
            __CLR4_4_119w919w9lgchoski.R.inc(59753);new YearMonth(1970, 13, GREGORIAN_PARIS);
            __CLR4_4_119w919w9lgchoski.R.inc(59754);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

    /**
     * Test constructor (int, int, Chronology=null)
     */
    @Test
    public void testConstructor_int_int_nullChronology() throws Throwable {__CLR4_4_119w919w9lgchoski.R.globalSliceStart(getClass().getName(),59755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b34hdv1a3v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119w919w9lgchoski.R.rethrow($CLV_t2$);}finally{__CLR4_4_119w919w9lgchoski.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b34hdv1a3v() throws Throwable{try{__CLR4_4_119w919w9lgchoski.R.inc(59755);
        __CLR4_4_119w919w9lgchoski.R.inc(59756);YearMonth test = new YearMonth(1970, 6, null);
        __CLR4_4_119w919w9lgchoski.R.inc(59757);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_119w919w9lgchoski.R.inc(59758);assertEquals(1970, test.getYear());
        __CLR4_4_119w919w9lgchoski.R.inc(59759);assertEquals(6, test.getMonthOfYear());
    }finally{__CLR4_4_119w919w9lgchoski.R.flushNeeded();}}

}
