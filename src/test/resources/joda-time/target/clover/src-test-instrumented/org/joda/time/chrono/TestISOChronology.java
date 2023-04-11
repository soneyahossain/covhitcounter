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
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Partial;
import org.joda.time.TimeOfDay;
import org.joda.time.YearMonthDay;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is a Junit unit test for ISOChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestISOChronology {static class __CLR4_4_11c4o1c4olgchosn7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,62762,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; // extends TestCase {

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

    public static void main(String[] args) throws Exception {try{__CLR4_4_11c4o1c4olgchosn7.R.inc(62376);
        //junit.textui.TestRunner.run(suite());

        __CLR4_4_11c4o1c4olgchosn7.R.inc(62377);TestISOChronology TB = new TestISOChronology();


        __CLR4_4_11c4o1c4olgchosn7.R.inc(62378);TB.setUp();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62379);TB.testFactoryUTC();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62380);TB.tearDown();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62381);TB.setUp();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62382);TB.testFactory();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62383);TB.tearDown();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62384);TB.setUp();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62385);TB.testFactory_Zone();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62386);TB.tearDown();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62387);TB.setUp();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62388);TB.testEquality();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62389);TB.tearDown();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62390);TB.setUp();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62391);TB.testWithUTC();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62392);TB.tearDown();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62393);TB.setUp();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62394);TB.testWithZone();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62395);TB.tearDown();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62396);TB.setUp();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62397);TB.testToString();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62398);TB.tearDown();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62399);TB.setUp();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62400);TB.testDurationFields();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62401);TB.tearDown();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62402);TB.setUp();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62403);TB.testDateFields();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62404);TB.tearDown();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62405);TB.setUp();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62406);TB.testTimeFields();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62407);TB.tearDown();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62408);TB.setUp();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62409);TB.testMaxYear();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62410);TB.tearDown();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62411);TB.setUp();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62412);TB.testMinYear();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62413);TB.tearDown();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62414);TB.setUp();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62415);TB.testCutoverAddYears();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62416);TB.tearDown();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62417);TB.setUp();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62418);TB.testAddMonths();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62419);TB.tearDown();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62420);TB.setUp();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62421);TB.testTimeOfDayAdd();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62422);TB.tearDown();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62423);TB.setUp();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62424);TB.testPartialDayOfYearAdd();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62425);TB.tearDown();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62426);TB.setUp();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62427);TB.testMaximumValue();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62428);TB.tearDown();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62429);TB.setUp();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62430);TB.testLeap_28feb();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62431);TB.tearDown();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62432);TB.setUp();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62433);TB.testLeap_29feb();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62434);TB.tearDown();
    }finally{__CLR4_4_11c4o1c4olgchosn7.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestISOChronology.class);
    }

    public TestISOChronology(String name) {
        super(name);
    }
*/
    @Before
    public void setUp() throws Exception {try{__CLR4_4_11c4o1c4olgchosn7.R.inc(62435);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62436);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62437);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62438);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62439);originalLocale = Locale.getDefault();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62440);DateTimeZone.setDefault(LONDON);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62441);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62442);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_11c4o1c4olgchosn7.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11c4o1c4olgchosn7.R.inc(62443);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62444);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62445);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62446);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62447);Locale.setDefault(originalLocale);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62448);originalDateTimeZone = null;
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62449);originalTimeZone = null;
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62450);originalLocale = null;
    }finally{__CLR4_4_11c4o1c4olgchosn7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactoryUTC() {__CLR4_4_11c4o1c4olgchosn7.R.globalSliceStart(getClass().getName(),62451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19knvhv1c6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4o1c4olgchosn7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4o1c4olgchosn7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testFactoryUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19knvhv1c6r(){try{__CLR4_4_11c4o1c4olgchosn7.R.inc(62451);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62452);assertEquals(DateTimeZone.UTC, ISOChronology.getInstanceUTC().getZone());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62453);assertSame(ISOChronology.class, ISOChronology.getInstanceUTC().getClass());
    }finally{__CLR4_4_11c4o1c4olgchosn7.R.flushNeeded();}}

    @Test
    public void testFactory() {__CLR4_4_11c4o1c4olgchosn7.R.globalSliceStart(getClass().getName(),62454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116tztt1c6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4o1c4olgchosn7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4o1c4olgchosn7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testFactory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116tztt1c6u(){try{__CLR4_4_11c4o1c4olgchosn7.R.inc(62454);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62455);assertEquals(LONDON, ISOChronology.getInstance().getZone());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62456);assertSame(ISOChronology.class, ISOChronology.getInstance().getClass());
    }finally{__CLR4_4_11c4o1c4olgchosn7.R.flushNeeded();}}

    @Test
    public void testFactory_Zone() {__CLR4_4_11c4o1c4olgchosn7.R.globalSliceStart(getClass().getName(),62457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yy5ime1c6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4o1c4olgchosn7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4o1c4olgchosn7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testFactory_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62457,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yy5ime1c6x(){try{__CLR4_4_11c4o1c4olgchosn7.R.inc(62457);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62458);assertEquals(TOKYO, ISOChronology.getInstance(TOKYO).getZone());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62459);assertEquals(PARIS, ISOChronology.getInstance(PARIS).getZone());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62460);assertEquals(LONDON, ISOChronology.getInstance(null).getZone());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62461);assertSame(ISOChronology.class, ISOChronology.getInstance(TOKYO).getClass());
    }finally{__CLR4_4_11c4o1c4olgchosn7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEquality() {__CLR4_4_11c4o1c4olgchosn7.R.globalSliceStart(getClass().getName(),62462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12agdql1c72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4o1c4olgchosn7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4o1c4olgchosn7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testEquality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62462,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12agdql1c72(){try{__CLR4_4_11c4o1c4olgchosn7.R.inc(62462);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62463);assertSame(ISOChronology.getInstance(TOKYO), ISOChronology.getInstance(TOKYO));
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62464);assertSame(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(LONDON));
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62465);assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstance(PARIS));
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62466);assertSame(ISOChronology.getInstanceUTC(), ISOChronology.getInstanceUTC());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62467);assertSame(ISOChronology.getInstance(), ISOChronology.getInstance(LONDON));
    }finally{__CLR4_4_11c4o1c4olgchosn7.R.flushNeeded();}}

    @Test
    public void testWithUTC() {__CLR4_4_11c4o1c4olgchosn7.R.globalSliceStart(getClass().getName(),62468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19orv831c78();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4o1c4olgchosn7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4o1c4olgchosn7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testWithUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19orv831c78(){try{__CLR4_4_11c4o1c4olgchosn7.R.inc(62468);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62469);assertSame(ISOChronology.getInstanceUTC(), ISOChronology.getInstance(LONDON).withUTC());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62470);assertSame(ISOChronology.getInstanceUTC(), ISOChronology.getInstance(TOKYO).withUTC());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62471);assertSame(ISOChronology.getInstanceUTC(), ISOChronology.getInstanceUTC().withUTC());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62472);assertSame(ISOChronology.getInstanceUTC(), ISOChronology.getInstance().withUTC());
    }finally{__CLR4_4_11c4o1c4olgchosn7.R.flushNeeded();}}

    @Test
    public void testWithZone() {__CLR4_4_11c4o1c4olgchosn7.R.globalSliceStart(getClass().getName(),62473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1me3iet1c7d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4o1c4olgchosn7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4o1c4olgchosn7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testWithZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1me3iet1c7d(){try{__CLR4_4_11c4o1c4olgchosn7.R.inc(62473);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62474);assertSame(ISOChronology.getInstance(TOKYO), ISOChronology.getInstance(TOKYO).withZone(TOKYO));
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62475);assertSame(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(TOKYO).withZone(LONDON));
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62476);assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstance(TOKYO).withZone(PARIS));
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62477);assertSame(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(TOKYO).withZone(null));
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62478);assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstance().withZone(PARIS));
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62479);assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstanceUTC().withZone(PARIS));
    }finally{__CLR4_4_11c4o1c4olgchosn7.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_4_11c4o1c4olgchosn7.R.globalSliceStart(getClass().getName(),62480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1c7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4o1c4olgchosn7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4o1c4olgchosn7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1c7k(){try{__CLR4_4_11c4o1c4olgchosn7.R.inc(62480);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62481);assertEquals("ISOChronology[Europe/London]", ISOChronology.getInstance(LONDON).toString());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62482);assertEquals("ISOChronology[Asia/Tokyo]", ISOChronology.getInstance(TOKYO).toString());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62483);assertEquals("ISOChronology[Europe/London]", ISOChronology.getInstance().toString());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62484);assertEquals("ISOChronology[UTC]", ISOChronology.getInstanceUTC().toString());
    }finally{__CLR4_4_11c4o1c4olgchosn7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDurationFields() {__CLR4_4_11c4o1c4olgchosn7.R.globalSliceStart(getClass().getName(),62485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnkzye1c7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4o1c4olgchosn7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4o1c4olgchosn7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testDurationFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62485,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnkzye1c7p(){try{__CLR4_4_11c4o1c4olgchosn7.R.inc(62485);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62486);final ISOChronology iso = ISOChronology.getInstance();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62487);assertEquals("eras", iso.eras().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62488);assertEquals("centuries", iso.centuries().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62489);assertEquals("years", iso.years().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62490);assertEquals("weekyears", iso.weekyears().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62491);assertEquals("months", iso.months().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62492);assertEquals("weeks", iso.weeks().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62493);assertEquals("days", iso.days().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62494);assertEquals("halfdays", iso.halfdays().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62495);assertEquals("hours", iso.hours().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62496);assertEquals("minutes", iso.minutes().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62497);assertEquals("seconds", iso.seconds().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62498);assertEquals("millis", iso.millis().getName());

        __CLR4_4_11c4o1c4olgchosn7.R.inc(62499);assertEquals(false, iso.eras().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62500);assertEquals(true, iso.centuries().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62501);assertEquals(true, iso.years().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62502);assertEquals(true, iso.weekyears().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62503);assertEquals(true, iso.months().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62504);assertEquals(true, iso.weeks().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62505);assertEquals(true, iso.days().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62506);assertEquals(true, iso.halfdays().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62507);assertEquals(true, iso.hours().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62508);assertEquals(true, iso.minutes().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62509);assertEquals(true, iso.seconds().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62510);assertEquals(true, iso.millis().isSupported());

        __CLR4_4_11c4o1c4olgchosn7.R.inc(62511);assertEquals(false, iso.centuries().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62512);assertEquals(false, iso.years().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62513);assertEquals(false, iso.weekyears().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62514);assertEquals(false, iso.months().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62515);assertEquals(false, iso.weeks().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62516);assertEquals(false, iso.days().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62517);assertEquals(false, iso.halfdays().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62518);assertEquals(true, iso.hours().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62519);assertEquals(true, iso.minutes().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62520);assertEquals(true, iso.seconds().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62521);assertEquals(true, iso.millis().isPrecise());

        __CLR4_4_11c4o1c4olgchosn7.R.inc(62522);final ISOChronology isoUTC = ISOChronology.getInstanceUTC();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62523);assertEquals(false, isoUTC.centuries().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62524);assertEquals(false, isoUTC.years().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62525);assertEquals(false, isoUTC.weekyears().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62526);assertEquals(false, isoUTC.months().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62527);assertEquals(true, isoUTC.weeks().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62528);assertEquals(true, isoUTC.days().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62529);assertEquals(true, isoUTC.halfdays().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62530);assertEquals(true, isoUTC.hours().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62531);assertEquals(true, isoUTC.minutes().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62532);assertEquals(true, isoUTC.seconds().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62533);assertEquals(true, isoUTC.millis().isPrecise());

        __CLR4_4_11c4o1c4olgchosn7.R.inc(62534);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62535);final ISOChronology isoGMT = ISOChronology.getInstance(gmt);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62536);assertEquals(false, isoGMT.centuries().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62537);assertEquals(false, isoGMT.years().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62538);assertEquals(false, isoGMT.weekyears().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62539);assertEquals(false, isoGMT.months().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62540);assertEquals(true, isoGMT.weeks().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62541);assertEquals(true, isoGMT.days().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62542);assertEquals(true, isoGMT.halfdays().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62543);assertEquals(true, isoGMT.hours().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62544);assertEquals(true, isoGMT.minutes().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62545);assertEquals(true, isoGMT.seconds().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62546);assertEquals(true, isoGMT.millis().isPrecise());

        __CLR4_4_11c4o1c4olgchosn7.R.inc(62547);final DateTimeZone offset = DateTimeZone.forOffsetHours(1);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62548);final ISOChronology isoOffset1 = ISOChronology.getInstance(offset);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62549);assertEquals(false, isoOffset1.centuries().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62550);assertEquals(false, isoOffset1.years().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62551);assertEquals(false, isoOffset1.weekyears().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62552);assertEquals(false, isoOffset1.months().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62553);assertEquals(true, isoOffset1.weeks().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62554);assertEquals(true, isoOffset1.days().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62555);assertEquals(true, isoOffset1.halfdays().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62556);assertEquals(true, isoOffset1.hours().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62557);assertEquals(true, isoOffset1.minutes().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62558);assertEquals(true, isoOffset1.seconds().isPrecise());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62559);assertEquals(true, isoOffset1.millis().isPrecise());
    }finally{__CLR4_4_11c4o1c4olgchosn7.R.flushNeeded();}}


    @Test
    public void testDateFields() {__CLR4_4_11c4o1c4olgchosn7.R.globalSliceStart(getClass().getName(),62560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gkspeo1c9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4o1c4olgchosn7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4o1c4olgchosn7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testDateFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gkspeo1c9s(){try{__CLR4_4_11c4o1c4olgchosn7.R.inc(62560);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62561);final ISOChronology iso = ISOChronology.getInstance();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62562);assertEquals("era", iso.era().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62563);assertEquals("centuryOfEra", iso.centuryOfEra().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62564);assertEquals("yearOfCentury", iso.yearOfCentury().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62565);assertEquals("yearOfEra", iso.yearOfEra().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62566);assertEquals("year", iso.year().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62567);assertEquals("monthOfYear", iso.monthOfYear().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62568);assertEquals("weekyearOfCentury", iso.weekyearOfCentury().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62569);assertEquals("weekyear", iso.weekyear().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62570);assertEquals("weekOfWeekyear", iso.weekOfWeekyear().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62571);assertEquals("dayOfYear", iso.dayOfYear().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62572);assertEquals("dayOfMonth", iso.dayOfMonth().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62573);assertEquals("dayOfWeek", iso.dayOfWeek().getName());

        __CLR4_4_11c4o1c4olgchosn7.R.inc(62574);assertEquals(true, iso.era().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62575);assertEquals(true, iso.centuryOfEra().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62576);assertEquals(true, iso.yearOfCentury().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62577);assertEquals(true, iso.yearOfEra().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62578);assertEquals(true, iso.year().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62579);assertEquals(true, iso.monthOfYear().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62580);assertEquals(true, iso.weekyearOfCentury().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62581);assertEquals(true, iso.weekyear().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62582);assertEquals(true, iso.weekOfWeekyear().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62583);assertEquals(true, iso.dayOfYear().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62584);assertEquals(true, iso.dayOfMonth().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62585);assertEquals(true, iso.dayOfWeek().isSupported());

        __CLR4_4_11c4o1c4olgchosn7.R.inc(62586);assertEquals(iso.eras(), iso.era().getDurationField());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62587);assertEquals(iso.centuries(), iso.centuryOfEra().getDurationField());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62588);assertEquals(iso.years(), iso.yearOfCentury().getDurationField());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62589);assertEquals(iso.years(), iso.yearOfEra().getDurationField());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62590);assertEquals(iso.years(), iso.year().getDurationField());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62591);assertEquals(iso.months(), iso.monthOfYear().getDurationField());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62592);assertEquals(iso.weekyears(), iso.weekyearOfCentury().getDurationField());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62593);assertEquals(iso.weekyears(), iso.weekyear().getDurationField());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62594);assertEquals(iso.weeks(), iso.weekOfWeekyear().getDurationField());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62595);assertEquals(iso.days(), iso.dayOfYear().getDurationField());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62596);assertEquals(iso.days(), iso.dayOfMonth().getDurationField());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62597);assertEquals(iso.days(), iso.dayOfWeek().getDurationField());

        __CLR4_4_11c4o1c4olgchosn7.R.inc(62598);assertEquals(null, iso.era().getRangeDurationField());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62599);assertEquals(iso.eras(), iso.centuryOfEra().getRangeDurationField());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62600);assertEquals(iso.centuries(), iso.yearOfCentury().getRangeDurationField());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62601);assertEquals(iso.eras(), iso.yearOfEra().getRangeDurationField());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62602);assertEquals(null, iso.year().getRangeDurationField());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62603);assertEquals(iso.years(), iso.monthOfYear().getRangeDurationField());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62604);assertEquals(iso.centuries(), iso.weekyearOfCentury().getRangeDurationField());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62605);assertEquals(null, iso.weekyear().getRangeDurationField());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62606);assertEquals(iso.weekyears(), iso.weekOfWeekyear().getRangeDurationField());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62607);assertEquals(iso.years(), iso.dayOfYear().getRangeDurationField());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62608);assertEquals(iso.months(), iso.dayOfMonth().getRangeDurationField());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62609);assertEquals(iso.weeks(), iso.dayOfWeek().getRangeDurationField());
    }finally{__CLR4_4_11c4o1c4olgchosn7.R.flushNeeded();}}


    @Test
    public void testTimeFields() {__CLR4_4_11c4o1c4olgchosn7.R.globalSliceStart(getClass().getName(),62610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r11up1cb6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4o1c4olgchosn7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4o1c4olgchosn7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testTimeFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r11up1cb6(){try{__CLR4_4_11c4o1c4olgchosn7.R.inc(62610);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62611);final ISOChronology iso = ISOChronology.getInstance();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62612);assertEquals("halfdayOfDay", iso.halfdayOfDay().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62613);assertEquals("clockhourOfHalfday", iso.clockhourOfHalfday().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62614);assertEquals("hourOfHalfday", iso.hourOfHalfday().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62615);assertEquals("clockhourOfDay", iso.clockhourOfDay().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62616);assertEquals("hourOfDay", iso.hourOfDay().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62617);assertEquals("minuteOfDay", iso.minuteOfDay().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62618);assertEquals("minuteOfHour", iso.minuteOfHour().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62619);assertEquals("secondOfDay", iso.secondOfDay().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62620);assertEquals("secondOfMinute", iso.secondOfMinute().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62621);assertEquals("millisOfDay", iso.millisOfDay().getName());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62622);assertEquals("millisOfSecond", iso.millisOfSecond().getName());

        __CLR4_4_11c4o1c4olgchosn7.R.inc(62623);assertEquals(true, iso.halfdayOfDay().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62624);assertEquals(true, iso.clockhourOfHalfday().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62625);assertEquals(true, iso.hourOfHalfday().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62626);assertEquals(true, iso.clockhourOfDay().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62627);assertEquals(true, iso.hourOfDay().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62628);assertEquals(true, iso.minuteOfDay().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62629);assertEquals(true, iso.minuteOfHour().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62630);assertEquals(true, iso.secondOfDay().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62631);assertEquals(true, iso.secondOfMinute().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62632);assertEquals(true, iso.millisOfDay().isSupported());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62633);assertEquals(true, iso.millisOfSecond().isSupported());
    }finally{__CLR4_4_11c4o1c4olgchosn7.R.flushNeeded();}}

    @Test
    public void testMaxYear() {__CLR4_4_11c4o1c4olgchosn7.R.globalSliceStart(getClass().getName(),62634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1xq9i1cbu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4o1c4olgchosn7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4o1c4olgchosn7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testMaxYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1xq9i1cbu(){try{__CLR4_4_11c4o1c4olgchosn7.R.inc(62634);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62635);final ISOChronology chrono = ISOChronology.getInstanceUTC();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62636);final int maxYear = chrono.year().getMaximumValue();

        __CLR4_4_11c4o1c4olgchosn7.R.inc(62637);DateTime start = new DateTime(maxYear, 1, 1, 0, 0, 0, 0, chrono);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62638);DateTime end = new DateTime(maxYear, 12, 31, 23, 59, 59, 999, chrono);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62639);assertTrue(start.getMillis() > 0);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62640);assertTrue(end.getMillis() > start.getMillis());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62641);assertEquals(maxYear, start.getYear());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62642);assertEquals(maxYear, end.getYear());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62643);long delta = end.getMillis() - start.getMillis();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62644);long expectedDelta =
                ((((start.year().isLeap() )&&(__CLR4_4_11c4o1c4olgchosn7.R.iget(62645)!=0|true))||(__CLR4_4_11c4o1c4olgchosn7.R.iget(62646)==0&false))? 366L : 365L) * DateTimeConstants.MILLIS_PER_DAY - 1;
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62647);assertEquals(expectedDelta, delta);

        __CLR4_4_11c4o1c4olgchosn7.R.inc(62648);assertEquals(start, new DateTime(maxYear + "-01-01T00:00:00.000Z", chrono));
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62649);assertEquals(end, new DateTime(maxYear + "-12-31T23:59:59.999Z", chrono));

        __CLR4_4_11c4o1c4olgchosn7.R.inc(62650);try {
            __CLR4_4_11c4o1c4olgchosn7.R.inc(62651);start.plusYears(1);
            __CLR4_4_11c4o1c4olgchosn7.R.inc(62652);fail();
        } catch (IllegalFieldValueException e) {
        }

        __CLR4_4_11c4o1c4olgchosn7.R.inc(62653);try {
            __CLR4_4_11c4o1c4olgchosn7.R.inc(62654);end.plusYears(1);
            __CLR4_4_11c4o1c4olgchosn7.R.inc(62655);fail();
        } catch (IllegalFieldValueException e) {
        }

        __CLR4_4_11c4o1c4olgchosn7.R.inc(62656);assertEquals(maxYear + 1, chrono.year().get(Long.MAX_VALUE));
    }finally{__CLR4_4_11c4o1c4olgchosn7.R.flushNeeded();}}


    @Test
    public void testMinYear() {__CLR4_4_11c4o1c4olgchosn7.R.globalSliceStart(getClass().getName(),62657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n3ynhg1cch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4o1c4olgchosn7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4o1c4olgchosn7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testMinYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62657,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n3ynhg1cch(){try{__CLR4_4_11c4o1c4olgchosn7.R.inc(62657);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62658);final ISOChronology chrono = ISOChronology.getInstanceUTC();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62659);final int minYear = chrono.year().getMinimumValue();

        __CLR4_4_11c4o1c4olgchosn7.R.inc(62660);DateTime start = new DateTime(minYear, 1, 1, 0, 0, 0, 0, chrono);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62661);DateTime end = new DateTime(minYear, 12, 31, 23, 59, 59, 999, chrono);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62662);assertTrue(start.getMillis() < 0);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62663);assertTrue(end.getMillis() > start.getMillis());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62664);assertEquals(minYear, start.getYear());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62665);assertEquals(minYear, end.getYear());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62666);long delta = end.getMillis() - start.getMillis();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62667);long expectedDelta =
                ((((start.year().isLeap() )&&(__CLR4_4_11c4o1c4olgchosn7.R.iget(62668)!=0|true))||(__CLR4_4_11c4o1c4olgchosn7.R.iget(62669)==0&false))? 366L : 365L) * DateTimeConstants.MILLIS_PER_DAY - 1;
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62670);assertEquals(expectedDelta, delta);

        __CLR4_4_11c4o1c4olgchosn7.R.inc(62671);assertEquals(start, new DateTime(minYear + "-01-01T00:00:00.000Z", chrono));
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62672);assertEquals(end, new DateTime(minYear + "-12-31T23:59:59.999Z", chrono));

        __CLR4_4_11c4o1c4olgchosn7.R.inc(62673);try {
            __CLR4_4_11c4o1c4olgchosn7.R.inc(62674);start.minusYears(1);
            __CLR4_4_11c4o1c4olgchosn7.R.inc(62675);fail();
        } catch (IllegalFieldValueException e) {
        }

        __CLR4_4_11c4o1c4olgchosn7.R.inc(62676);try {
            __CLR4_4_11c4o1c4olgchosn7.R.inc(62677);end.minusYears(1);
            __CLR4_4_11c4o1c4olgchosn7.R.inc(62678);fail();
        } catch (IllegalFieldValueException e) {
        }

        __CLR4_4_11c4o1c4olgchosn7.R.inc(62679);assertEquals(minYear - 1, chrono.year().get(Long.MIN_VALUE));
    }finally{__CLR4_4_11c4o1c4olgchosn7.R.flushNeeded();}}

    @Test
    public void testCutoverAddYears() {__CLR4_4_11c4o1c4olgchosn7.R.globalSliceStart(getClass().getName(),62680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jhk7og1cd4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4o1c4olgchosn7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4o1c4olgchosn7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testCutoverAddYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62680,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jhk7og1cd4(){try{__CLR4_4_11c4o1c4olgchosn7.R.inc(62680);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62681);testAdd("1582-01-01", DurationFieldType.years(), 1, "1583-01-01");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62682);testAdd("1582-02-15", DurationFieldType.years(), 1, "1583-02-15");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62683);testAdd("1582-02-28", DurationFieldType.years(), 1, "1583-02-28");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62684);testAdd("1582-03-01", DurationFieldType.years(), 1, "1583-03-01");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62685);testAdd("1582-09-30", DurationFieldType.years(), 1, "1583-09-30");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62686);testAdd("1582-10-01", DurationFieldType.years(), 1, "1583-10-01");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62687);testAdd("1582-10-04", DurationFieldType.years(), 1, "1583-10-04");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62688);testAdd("1582-10-15", DurationFieldType.years(), 1, "1583-10-15");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62689);testAdd("1582-10-16", DurationFieldType.years(), 1, "1583-10-16");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62690);testAdd("1580-01-01", DurationFieldType.years(), 4, "1584-01-01");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62691);testAdd("1580-02-29", DurationFieldType.years(), 4, "1584-02-29");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62692);testAdd("1580-10-01", DurationFieldType.years(), 4, "1584-10-01");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62693);testAdd("1580-10-10", DurationFieldType.years(), 4, "1584-10-10");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62694);testAdd("1580-10-15", DurationFieldType.years(), 4, "1584-10-15");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62695);testAdd("1580-12-31", DurationFieldType.years(), 4, "1584-12-31");
    }finally{__CLR4_4_11c4o1c4olgchosn7.R.flushNeeded();}}


    @Test
    public void testAddMonths() {__CLR4_4_11c4o1c4olgchosn7.R.globalSliceStart(getClass().getName(),62696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n5eqa11cdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4o1c4olgchosn7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4o1c4olgchosn7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testAddMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n5eqa11cdk(){try{__CLR4_4_11c4o1c4olgchosn7.R.inc(62696);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62697);testAdd("1582-01-01", DurationFieldType.months(), 1, "1582-02-01");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62698);testAdd("1582-01-01", DurationFieldType.months(), 6, "1582-07-01");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62699);testAdd("1582-01-01", DurationFieldType.months(), 12, "1583-01-01");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62700);testAdd("1582-11-15", DurationFieldType.months(), 1, "1582-12-15");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62701);testAdd("1582-09-04", DurationFieldType.months(), 2, "1582-11-04");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62702);testAdd("1582-09-05", DurationFieldType.months(), 2, "1582-11-05");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62703);testAdd("1582-09-10", DurationFieldType.months(), 2, "1582-11-10");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62704);testAdd("1582-09-15", DurationFieldType.months(), 2, "1582-11-15");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62705);testAdd("1580-01-01", DurationFieldType.months(), 48, "1584-01-01");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62706);testAdd("1580-02-29", DurationFieldType.months(), 48, "1584-02-29");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62707);testAdd("1580-10-01", DurationFieldType.months(), 48, "1584-10-01");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62708);testAdd("1580-10-10", DurationFieldType.months(), 48, "1584-10-10");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62709);testAdd("1580-10-15", DurationFieldType.months(), 48, "1584-10-15");
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62710);testAdd("1580-12-31", DurationFieldType.months(), 48, "1584-12-31");
    }finally{__CLR4_4_11c4o1c4olgchosn7.R.flushNeeded();}}

    private void testAdd(String start, DurationFieldType type, int amt, String end) {try{__CLR4_4_11c4o1c4olgchosn7.R.inc(62711);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62712);DateTime dtStart = new DateTime(start, ISOChronology.getInstanceUTC());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62713);DateTime dtEnd = new DateTime(end, ISOChronology.getInstanceUTC());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62714);assertEquals(dtEnd, dtStart.withFieldAdded(type, amt));
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62715);assertEquals(dtStart, dtEnd.withFieldAdded(type, -amt));

        __CLR4_4_11c4o1c4olgchosn7.R.inc(62716);DurationField field = type.getField(ISOChronology.getInstanceUTC());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62717);int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62718);assertEquals(amt, diff);

        __CLR4_4_11c4o1c4olgchosn7.R.inc(62719);if ((((type == DurationFieldType.years() ||
                type == DurationFieldType.months() ||
                type == DurationFieldType.days())&&(__CLR4_4_11c4o1c4olgchosn7.R.iget(62720)!=0|true))||(__CLR4_4_11c4o1c4olgchosn7.R.iget(62721)==0&false))) {{
            __CLR4_4_11c4o1c4olgchosn7.R.inc(62722);YearMonthDay ymdStart = new YearMonthDay(start, ISOChronology.getInstanceUTC());
            __CLR4_4_11c4o1c4olgchosn7.R.inc(62723);YearMonthDay ymdEnd = new YearMonthDay(end, ISOChronology.getInstanceUTC());
            __CLR4_4_11c4o1c4olgchosn7.R.inc(62724);assertEquals(ymdEnd, ymdStart.withFieldAdded(type, amt));
            __CLR4_4_11c4o1c4olgchosn7.R.inc(62725);assertEquals(ymdStart, ymdEnd.withFieldAdded(type, -amt));
        }
    }}finally{__CLR4_4_11c4o1c4olgchosn7.R.flushNeeded();}}

    @Test
    public void testTimeOfDayAdd() {__CLR4_4_11c4o1c4olgchosn7.R.globalSliceStart(getClass().getName(),62726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c1zvq61cee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4o1c4olgchosn7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4o1c4olgchosn7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testTimeOfDayAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c1zvq61cee(){try{__CLR4_4_11c4o1c4olgchosn7.R.inc(62726);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62727);TimeOfDay start = new TimeOfDay(12, 30);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62728);TimeOfDay end = new TimeOfDay(10, 30);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62729);assertEquals(end, start.plusHours(22));
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62730);assertEquals(start, end.minusHours(22));
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62731);assertEquals(end, start.plusMinutes(22 * 60));
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62732);assertEquals(start, end.minusMinutes(22 * 60));
    }finally{__CLR4_4_11c4o1c4olgchosn7.R.flushNeeded();}}


    @Test
    public void testPartialDayOfYearAdd() {__CLR4_4_11c4o1c4olgchosn7.R.globalSliceStart(getClass().getName(),62733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12worqx1cel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4o1c4olgchosn7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4o1c4olgchosn7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testPartialDayOfYearAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12worqx1cel(){try{__CLR4_4_11c4o1c4olgchosn7.R.inc(62733);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62734);Partial start = new Partial().with(DateTimeFieldType.year(), 2000).with(DateTimeFieldType.dayOfYear(), 366);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62735);Partial end = new Partial().with(DateTimeFieldType.year(), 2004).with(DateTimeFieldType.dayOfYear(), 366);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62736);assertEquals(end, start.withFieldAdded(DurationFieldType.days(), 365 + 365 + 365 + 366));
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62737);assertEquals(start, end.withFieldAdded(DurationFieldType.days(), -(365 + 365 + 365 + 366)));
    }finally{__CLR4_4_11c4o1c4olgchosn7.R.flushNeeded();}}

    @Test
    public void testMaximumValue() {__CLR4_4_11c4o1c4olgchosn7.R.globalSliceStart(getClass().getName(),62738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qnw3be1ceq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4o1c4olgchosn7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4o1c4olgchosn7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testMaximumValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qnw3be1ceq(){try{__CLR4_4_11c4o1c4olgchosn7.R.inc(62738);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62739);DateMidnight dt = new DateMidnight(1570, 1, 1);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62740);while ((((dt.getYear() < 1590)&&(__CLR4_4_11c4o1c4olgchosn7.R.iget(62741)!=0|true))||(__CLR4_4_11c4o1c4olgchosn7.R.iget(62742)==0&false))) {{
            __CLR4_4_11c4o1c4olgchosn7.R.inc(62743);dt = dt.plusDays(1);
            __CLR4_4_11c4o1c4olgchosn7.R.inc(62744);YearMonthDay ymd = dt.toYearMonthDay();
            __CLR4_4_11c4o1c4olgchosn7.R.inc(62745);assertEquals(dt.year().getMaximumValue(), ymd.year().getMaximumValue());
            __CLR4_4_11c4o1c4olgchosn7.R.inc(62746);assertEquals(dt.monthOfYear().getMaximumValue(), ymd.monthOfYear().getMaximumValue());
            __CLR4_4_11c4o1c4olgchosn7.R.inc(62747);assertEquals(dt.dayOfMonth().getMaximumValue(), ymd.dayOfMonth().getMaximumValue());
        }
    }}finally{__CLR4_4_11c4o1c4olgchosn7.R.flushNeeded();}}


    @Test
    public void testLeap_28feb() {__CLR4_4_11c4o1c4olgchosn7.R.globalSliceStart(getClass().getName(),62748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_149q6ov1cf0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4o1c4olgchosn7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4o1c4olgchosn7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testLeap_28feb",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62748,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_149q6ov1cf0(){try{__CLR4_4_11c4o1c4olgchosn7.R.inc(62748);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62749);Chronology chrono = ISOChronology.getInstance();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62750);DateTime dt = new DateTime(2012, 2, 28, 0, 0, chrono);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62751);assertEquals(true, dt.year().isLeap());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62752);assertEquals(true, dt.monthOfYear().isLeap());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62753);assertEquals(false, dt.dayOfMonth().isLeap());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62754);assertEquals(false, dt.dayOfYear().isLeap());
    }finally{__CLR4_4_11c4o1c4olgchosn7.R.flushNeeded();}}


    @Test
    public void testLeap_29feb() {__CLR4_4_11c4o1c4olgchosn7.R.globalSliceStart(getClass().getName(),62755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_194etwe1cf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4o1c4olgchosn7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4o1c4olgchosn7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testLeap_29feb",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_194etwe1cf7(){try{__CLR4_4_11c4o1c4olgchosn7.R.inc(62755);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62756);Chronology chrono = ISOChronology.getInstance();
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62757);DateTime dt = new DateTime(2012, 2, 29, 0, 0, chrono);
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62758);assertEquals(true, dt.year().isLeap());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62759);assertEquals(true, dt.monthOfYear().isLeap());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62760);assertEquals(true, dt.dayOfMonth().isLeap());
        __CLR4_4_11c4o1c4olgchosn7.R.inc(62761);assertEquals(true, dt.dayOfYear().isLeap());
    }finally{__CLR4_4_11c4o1c4olgchosn7.R.flushNeeded();}}

}
