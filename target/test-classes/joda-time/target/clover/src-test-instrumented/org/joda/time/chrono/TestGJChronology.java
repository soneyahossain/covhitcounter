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

import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.Period;
import org.joda.time.TimeOfDay;
import org.joda.time.YearMonthDay;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is a Junit unit test for GJChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestGJChronology {static class __CLR4_4_11bj21bj2lgchosmk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,62052,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

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

    public static void main(String[] args) throws Exception {try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61598);

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61599);TestGJChronology TB = new TestGJChronology();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61600);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61601);TB.testFactoryUTC();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61602);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61603);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61604);TB.testFactory();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61605);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61606);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61607);TB.testFactory_Zone();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61608);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61609);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61610);TB.testFactory_Zone_long_int();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61611);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61612);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61613);TB.testFactory_Zone_RI();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61614);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61615);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61616);TB.testFactory_Zone_RI_int();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61617);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61618);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61619);TB.testEquality();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61620);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61621);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61622);TB.testWithUTC();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61623);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61624);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61625);TB.testWithZone();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61626);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61627);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61628);TB.testToString();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61629);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61630);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61631);TB.testDurationFields();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61632);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61633);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61634);TB.testDateFields();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61635);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61636);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61637);TB.testTimeFields();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61638);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61639);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61640);TB.testCutoverAddYears();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61641);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61642);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61643);TB.testIllegalDates();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61644);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61645);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61646);TB.testParseEquivalence();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61647);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61648);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61649);TB.testCutoverAddWeekyears();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61650);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61651);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61652);TB.testCutoverAddMonths();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61653);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61654);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61655);TB.testCutoverAddWeeks();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61656);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61657);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61658);TB.testCutoverAddDays();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61659);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61660);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61661);TB.testYearEndAddDays();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61662);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61663);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61664);TB.testSubtractDays();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61665);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61666);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61667);TB.testTimeOfDayAdd();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61668);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61669);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61670);TB.testMaximumValue();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61671);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61672);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61673);TB.testPartialGetAsText();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61674);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61675);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61676);TB.testLeapYearRulesConstruction();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61677);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61678);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61679);TB.testLeapYearRulesConstructionInvalid();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61680);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61681);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61682);TB.testLeap_28feb();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61683);TB.tearDown();

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61684);TB.setUp();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61685);TB.testLeap_29feb();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61686);TB.tearDown();

    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestGJChronology.class);
    }

    public TestGJChronology(String name) {
        super(name);
    }
     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61687);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61688);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61689);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61690);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61691);originalLocale = Locale.getDefault();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61692);DateTimeZone.setDefault(LONDON);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61693);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61694);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61695);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61696);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61697);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61698);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61699);Locale.setDefault(originalLocale);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61700);originalDateTimeZone = null;
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61701);originalTimeZone = null;
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61702);originalLocale = null;
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactoryUTC() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),61703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19knvhv1blz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testFactoryUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19knvhv1blz(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61703);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61704);assertEquals(DateTimeZone.UTC, GJChronology.getInstanceUTC().getZone());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61705);assertSame(GJChronology.class, GJChronology.getInstanceUTC().getClass());
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    @Test
    public void testFactory() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),61706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116tztt1bm2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testFactory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116tztt1bm2(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61706);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61707);assertEquals(LONDON, GJChronology.getInstance().getZone());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61708);assertSame(GJChronology.class, GJChronology.getInstance().getClass());
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    @Test
    public void testFactory_Zone() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),61709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yy5ime1bm5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testFactory_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yy5ime1bm5(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61709);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61710);assertEquals(TOKYO, GJChronology.getInstance(TOKYO).getZone());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61711);assertEquals(PARIS, GJChronology.getInstance(PARIS).getZone());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61712);assertEquals(LONDON, GJChronology.getInstance(null).getZone());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61713);assertSame(GJChronology.class, GJChronology.getInstance(TOKYO).getClass());
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    @Test
    public void testFactory_Zone_long_int() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),61714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16bh80x1bma();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testFactory_Zone_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61714,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16bh80x1bma(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61714);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61715);GJChronology chrono = GJChronology.getInstance(TOKYO, 0L, 2);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61716);assertEquals(TOKYO, chrono.getZone());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61717);assertEquals(new Instant(0L), chrono.getGregorianCutover());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61718);assertEquals(2, chrono.getMinimumDaysInFirstWeek());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61719);assertSame(GJChronology.class, GJChronology.getInstance(TOKYO, 0L, 2).getClass());

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61720);try {
            __CLR4_4_11bj21bj2lgchosmk.R.inc(61721);GJChronology.getInstance(TOKYO, 0L, 0);
            __CLR4_4_11bj21bj2lgchosmk.R.inc(61722);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61723);try {
            __CLR4_4_11bj21bj2lgchosmk.R.inc(61724);GJChronology.getInstance(TOKYO, 0L, 8);
            __CLR4_4_11bj21bj2lgchosmk.R.inc(61725);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    @Test
    public void testFactory_Zone_RI() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),61726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ytide21bmm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testFactory_Zone_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ytide21bmm(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61726);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61727);GJChronology chrono = GJChronology.getInstance(TOKYO, new Instant(0L));
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61728);assertEquals(TOKYO, chrono.getZone());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61729);assertEquals(new Instant(0L), chrono.getGregorianCutover());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61730);assertSame(GJChronology.class, GJChronology.getInstance(TOKYO, new Instant(0L)).getClass());

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61731);DateTime cutover = new DateTime(1582, 10, 15, 0, 0, 0, 0, DateTimeZone.UTC);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61732);chrono = GJChronology.getInstance(TOKYO, null);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61733);assertEquals(TOKYO, chrono.getZone());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61734);assertEquals(cutover.toInstant(), chrono.getGregorianCutover());
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    @Test
    public void testFactory_Zone_RI_int() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),61735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nohw561bmv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testFactory_Zone_RI_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nohw561bmv(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61735);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61736);GJChronology chrono = GJChronology.getInstance(TOKYO, new Instant(0L), 2);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61737);assertEquals(TOKYO, chrono.getZone());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61738);assertEquals(new Instant(0L), chrono.getGregorianCutover());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61739);assertEquals(2, chrono.getMinimumDaysInFirstWeek());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61740);assertSame(GJChronology.class, GJChronology.getInstance(TOKYO, new Instant(0L), 2).getClass());

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61741);DateTime cutover = new DateTime(1582, 10, 15, 0, 0, 0, 0, DateTimeZone.UTC);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61742);chrono = GJChronology.getInstance(TOKYO, null, 2);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61743);assertEquals(TOKYO, chrono.getZone());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61744);assertEquals(cutover.toInstant(), chrono.getGregorianCutover());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61745);assertEquals(2, chrono.getMinimumDaysInFirstWeek());

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61746);try {
            __CLR4_4_11bj21bj2lgchosmk.R.inc(61747);GJChronology.getInstance(TOKYO, new Instant(0L), 0);
            __CLR4_4_11bj21bj2lgchosmk.R.inc(61748);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61749);try {
            __CLR4_4_11bj21bj2lgchosmk.R.inc(61750);GJChronology.getInstance(TOKYO, new Instant(0L), 8);
            __CLR4_4_11bj21bj2lgchosmk.R.inc(61751);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEquality() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),61752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12agdql1bnc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testEquality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61752,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12agdql1bnc(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61752);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61753);assertSame(GJChronology.getInstance(TOKYO), GJChronology.getInstance(TOKYO));
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61754);assertSame(GJChronology.getInstance(LONDON), GJChronology.getInstance(LONDON));
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61755);assertSame(GJChronology.getInstance(PARIS), GJChronology.getInstance(PARIS));
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61756);assertSame(GJChronology.getInstanceUTC(), GJChronology.getInstanceUTC());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61757);assertSame(GJChronology.getInstance(), GJChronology.getInstance(LONDON));
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    @Test
    public void testWithUTC() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),61758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19orv831bni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testWithUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19orv831bni(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61758);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61759);assertSame(GJChronology.getInstanceUTC(), GJChronology.getInstance(LONDON).withUTC());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61760);assertSame(GJChronology.getInstanceUTC(), GJChronology.getInstance(TOKYO).withUTC());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61761);assertSame(GJChronology.getInstanceUTC(), GJChronology.getInstanceUTC().withUTC());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61762);assertSame(GJChronology.getInstanceUTC(), GJChronology.getInstance().withUTC());
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    @Test
    public void testWithZone() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),61763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1me3iet1bnn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testWithZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1me3iet1bnn(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61763);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61764);assertSame(GJChronology.getInstance(TOKYO), GJChronology.getInstance(TOKYO).withZone(TOKYO));
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61765);assertSame(GJChronology.getInstance(LONDON), GJChronology.getInstance(TOKYO).withZone(LONDON));
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61766);assertSame(GJChronology.getInstance(PARIS), GJChronology.getInstance(TOKYO).withZone(PARIS));
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61767);assertSame(GJChronology.getInstance(LONDON), GJChronology.getInstance(TOKYO).withZone(null));
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61768);assertSame(GJChronology.getInstance(PARIS), GJChronology.getInstance().withZone(PARIS));
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61769);assertSame(GJChronology.getInstance(PARIS), GJChronology.getInstanceUTC().withZone(PARIS));
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),61770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1bnu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1bnu(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61770);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61771);assertEquals("GJChronology[Europe/London]", GJChronology.getInstance(LONDON).toString());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61772);assertEquals("GJChronology[Asia/Tokyo]", GJChronology.getInstance(TOKYO).toString());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61773);assertEquals("GJChronology[Europe/London]", GJChronology.getInstance().toString());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61774);assertEquals("GJChronology[UTC]", GJChronology.getInstanceUTC().toString());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61775);assertEquals("GJChronology[UTC,cutover=1970-01-01]", GJChronology.getInstance(DateTimeZone.UTC, 0L, 4).toString());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61776);assertEquals("GJChronology[UTC,cutover=1970-01-01T00:00:00.001Z,mdfw=2]", GJChronology.getInstance(DateTimeZone.UTC, 1L, 2).toString());
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDurationFields() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),61777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnkzye1bo1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testDurationFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61777,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnkzye1bo1(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61777);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61778);final GJChronology gj = GJChronology.getInstance();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61779);assertEquals("eras", gj.eras().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61780);assertEquals("centuries", gj.centuries().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61781);assertEquals("years", gj.years().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61782);assertEquals("weekyears", gj.weekyears().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61783);assertEquals("months", gj.months().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61784);assertEquals("weeks", gj.weeks().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61785);assertEquals("halfdays", gj.halfdays().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61786);assertEquals("days", gj.days().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61787);assertEquals("hours", gj.hours().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61788);assertEquals("minutes", gj.minutes().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61789);assertEquals("seconds", gj.seconds().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61790);assertEquals("millis", gj.millis().getName());

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61791);assertEquals(false, gj.eras().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61792);assertEquals(true, gj.centuries().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61793);assertEquals(true, gj.years().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61794);assertEquals(true, gj.weekyears().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61795);assertEquals(true, gj.months().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61796);assertEquals(true, gj.weeks().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61797);assertEquals(true, gj.days().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61798);assertEquals(true, gj.halfdays().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61799);assertEquals(true, gj.hours().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61800);assertEquals(true, gj.minutes().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61801);assertEquals(true, gj.seconds().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61802);assertEquals(true, gj.millis().isSupported());

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61803);assertEquals(false, gj.centuries().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61804);assertEquals(false, gj.years().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61805);assertEquals(false, gj.weekyears().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61806);assertEquals(false, gj.months().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61807);assertEquals(false, gj.weeks().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61808);assertEquals(false, gj.days().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61809);assertEquals(false, gj.halfdays().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61810);assertEquals(true, gj.hours().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61811);assertEquals(true, gj.minutes().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61812);assertEquals(true, gj.seconds().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61813);assertEquals(true, gj.millis().isPrecise());

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61814);final GJChronology gjUTC = GJChronology.getInstanceUTC();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61815);assertEquals(false, gjUTC.centuries().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61816);assertEquals(false, gjUTC.years().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61817);assertEquals(false, gjUTC.weekyears().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61818);assertEquals(false, gjUTC.months().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61819);assertEquals(true, gjUTC.weeks().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61820);assertEquals(true, gjUTC.days().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61821);assertEquals(true, gjUTC.halfdays().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61822);assertEquals(true, gjUTC.hours().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61823);assertEquals(true, gjUTC.minutes().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61824);assertEquals(true, gjUTC.seconds().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61825);assertEquals(true, gjUTC.millis().isPrecise());

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61826);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61827);final GJChronology gjGMT = GJChronology.getInstance(gmt);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61828);assertEquals(false, gjGMT.centuries().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61829);assertEquals(false, gjGMT.years().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61830);assertEquals(false, gjGMT.weekyears().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61831);assertEquals(false, gjGMT.months().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61832);assertEquals(true, gjGMT.weeks().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61833);assertEquals(true, gjGMT.days().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61834);assertEquals(true, gjGMT.halfdays().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61835);assertEquals(true, gjGMT.hours().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61836);assertEquals(true, gjGMT.minutes().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61837);assertEquals(true, gjGMT.seconds().isPrecise());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61838);assertEquals(true, gjGMT.millis().isPrecise());
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    @Test
    public void testDateFields() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),61839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gkspeo1bpr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testDateFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gkspeo1bpr(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61839);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61840);final GJChronology gj = GJChronology.getInstance();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61841);assertEquals("era", gj.era().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61842);assertEquals("centuryOfEra", gj.centuryOfEra().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61843);assertEquals("yearOfCentury", gj.yearOfCentury().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61844);assertEquals("yearOfEra", gj.yearOfEra().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61845);assertEquals("year", gj.year().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61846);assertEquals("monthOfYear", gj.monthOfYear().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61847);assertEquals("weekyearOfCentury", gj.weekyearOfCentury().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61848);assertEquals("weekyear", gj.weekyear().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61849);assertEquals("weekOfWeekyear", gj.weekOfWeekyear().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61850);assertEquals("dayOfYear", gj.dayOfYear().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61851);assertEquals("dayOfMonth", gj.dayOfMonth().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61852);assertEquals("dayOfWeek", gj.dayOfWeek().getName());

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61853);assertEquals(true, gj.era().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61854);assertEquals(true, gj.centuryOfEra().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61855);assertEquals(true, gj.yearOfCentury().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61856);assertEquals(true, gj.yearOfEra().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61857);assertEquals(true, gj.year().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61858);assertEquals(true, gj.monthOfYear().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61859);assertEquals(true, gj.weekyearOfCentury().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61860);assertEquals(true, gj.weekyear().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61861);assertEquals(true, gj.weekOfWeekyear().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61862);assertEquals(true, gj.dayOfYear().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61863);assertEquals(true, gj.dayOfMonth().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61864);assertEquals(true, gj.dayOfWeek().isSupported());

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61865);assertEquals(gj.eras(), gj.era().getDurationField());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61866);assertEquals(gj.centuries(), gj.centuryOfEra().getDurationField());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61867);assertEquals(gj.years(), gj.yearOfCentury().getDurationField());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61868);assertEquals(gj.years(), gj.yearOfEra().getDurationField());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61869);assertEquals(gj.years(), gj.year().getDurationField());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61870);assertEquals(gj.months(), gj.monthOfYear().getDurationField());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61871);assertEquals(gj.weekyears(), gj.weekyearOfCentury().getDurationField());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61872);assertEquals(gj.weekyears(), gj.weekyear().getDurationField());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61873);assertEquals(gj.weeks(), gj.weekOfWeekyear().getDurationField());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61874);assertEquals(gj.days(), gj.dayOfYear().getDurationField());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61875);assertEquals(gj.days(), gj.dayOfMonth().getDurationField());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61876);assertEquals(gj.days(), gj.dayOfWeek().getDurationField());

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61877);assertEquals(null, gj.era().getRangeDurationField());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61878);assertEquals(gj.eras(), gj.centuryOfEra().getRangeDurationField());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61879);assertEquals(gj.centuries(), gj.yearOfCentury().getRangeDurationField());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61880);assertEquals(gj.eras(), gj.yearOfEra().getRangeDurationField());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61881);assertEquals(null, gj.year().getRangeDurationField());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61882);assertEquals(gj.years(), gj.monthOfYear().getRangeDurationField());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61883);assertEquals(gj.centuries(), gj.weekyearOfCentury().getRangeDurationField());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61884);assertEquals(null, gj.weekyear().getRangeDurationField());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61885);assertEquals(gj.weekyears(), gj.weekOfWeekyear().getRangeDurationField());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61886);assertEquals(gj.years(), gj.dayOfYear().getRangeDurationField());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61887);assertEquals(gj.months(), gj.dayOfMonth().getRangeDurationField());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61888);assertEquals(gj.weeks(), gj.dayOfWeek().getRangeDurationField());
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    @Test
    public void testTimeFields() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),61889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r11up1br5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testTimeFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61889,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r11up1br5(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61889);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61890);final GJChronology gj = GJChronology.getInstance();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61891);assertEquals("halfdayOfDay", gj.halfdayOfDay().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61892);assertEquals("clockhourOfHalfday", gj.clockhourOfHalfday().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61893);assertEquals("hourOfHalfday", gj.hourOfHalfday().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61894);assertEquals("clockhourOfDay", gj.clockhourOfDay().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61895);assertEquals("hourOfDay", gj.hourOfDay().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61896);assertEquals("minuteOfDay", gj.minuteOfDay().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61897);assertEquals("minuteOfHour", gj.minuteOfHour().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61898);assertEquals("secondOfDay", gj.secondOfDay().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61899);assertEquals("secondOfMinute", gj.secondOfMinute().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61900);assertEquals("millisOfDay", gj.millisOfDay().getName());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61901);assertEquals("millisOfSecond", gj.millisOfSecond().getName());

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61902);assertEquals(true, gj.halfdayOfDay().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61903);assertEquals(true, gj.clockhourOfHalfday().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61904);assertEquals(true, gj.hourOfHalfday().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61905);assertEquals(true, gj.clockhourOfDay().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61906);assertEquals(true, gj.hourOfDay().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61907);assertEquals(true, gj.minuteOfDay().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61908);assertEquals(true, gj.minuteOfHour().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61909);assertEquals(true, gj.secondOfDay().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61910);assertEquals(true, gj.secondOfMinute().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61911);assertEquals(true, gj.millisOfDay().isSupported());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61912);assertEquals(true, gj.millisOfSecond().isSupported());
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    @Test
    public void testIllegalDates() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),61913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fftx881brt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testIllegalDates",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fftx881brt(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61913);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61914);try {
            __CLR4_4_11bj21bj2lgchosmk.R.inc(61915);new DateTime(1582, 10, 5, 0, 0, 0, 0, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_11bj21bj2lgchosmk.R.inc(61916);fail("Constructed illegal date");
        } catch (IllegalArgumentException e) { /* good */ }

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61917);try {
            __CLR4_4_11bj21bj2lgchosmk.R.inc(61918);new DateTime(1582, 10, 14, 0, 0, 0, 0, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_11bj21bj2lgchosmk.R.inc(61919);fail("Constructed illegal date");
        } catch (IllegalArgumentException e) { /* good */ }
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    @Test
    public void testParseEquivalence() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),61920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c5g6b21bs0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testParseEquivalence",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61920,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c5g6b21bs0(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61920);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61921);testParse("1581-01-01T01:23:45.678", 1581, 1, 1, 1, 23, 45, 678);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61922);testParse("1581-06-30", 1581, 6, 30, 0, 0, 0, 0);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61923);testParse("1582-01-01T01:23:45.678", 1582, 1, 1, 1, 23, 45, 678);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61924);testParse("1582-06-30T01:23:45.678", 1582, 6, 30, 1, 23, 45, 678);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61925);testParse("1582-10-04", 1582, 10, 4, 0, 0, 0, 0);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61926);testParse("1582-10-15", 1582, 10, 15, 0, 0, 0, 0);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61927);testParse("1582-12-31", 1582, 12, 31, 0, 0, 0, 0);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61928);testParse("1583-12-31", 1583, 12, 31, 0, 0, 0, 0);
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}


    private void testParse(String str,
                           int year, int month, int day,
                           int hour, int minute, int second, int millis) {try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61929);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61930);assertEquals(new DateTime(str, GJChronology.getInstance(DateTimeZone.UTC)),
                new DateTime(year, month, day, hour, minute, second, millis,
                        GJChronology.getInstance(DateTimeZone.UTC)));
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    @Test
    public void testCutoverAddYears() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),61931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jhk7og1bsb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61931,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jhk7og1bsb(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61931);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61932);testAdd("1582-01-01", DurationFieldType.years(), 1, "1583-01-01");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61933);testAdd("1582-02-15", DurationFieldType.years(), 1, "1583-02-15");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61934);testAdd("1582-02-28", DurationFieldType.years(), 1, "1583-02-28");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61935);testAdd("1582-03-01", DurationFieldType.years(), 1, "1583-03-01");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61936);testAdd("1582-09-30", DurationFieldType.years(), 1, "1583-09-30");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61937);testAdd("1582-10-01", DurationFieldType.years(), 1, "1583-10-01");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61938);testAdd("1582-10-04", DurationFieldType.years(), 1, "1583-10-04");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61939);testAdd("1582-10-15", DurationFieldType.years(), 1, "1583-10-15");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61940);testAdd("1582-10-16", DurationFieldType.years(), 1, "1583-10-16");

        // Leap years...
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61941);testAdd("1580-01-01", DurationFieldType.years(), 4, "1584-01-01");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61942);testAdd("1580-02-29", DurationFieldType.years(), 4, "1584-02-29");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61943);testAdd("1580-10-01", DurationFieldType.years(), 4, "1584-10-01");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61944);testAdd("1580-10-10", DurationFieldType.years(), 4, "1584-10-10");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61945);testAdd("1580-10-15", DurationFieldType.years(), 4, "1584-10-15");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61946);testAdd("1580-12-31", DurationFieldType.years(), 4, "1584-12-31");
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    @Test
    public void testCutoverAddWeekyears() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),61947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ydlu3w1bsr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddWeekyears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61947,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ydlu3w1bsr(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61947);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61948);testAdd("1582-W01-1", DurationFieldType.weekyears(), 1, "1583-W01-1");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61949);testAdd("1582-W39-1", DurationFieldType.weekyears(), 1, "1583-W39-1");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61950);testAdd("1583-W45-1", DurationFieldType.weekyears(), 1, "1584-W45-1");

        // This test fails, but I'm not sure if its worth fixing. The date
        // falls after the cutover, but in the cutover year. The add operation
        // is performed completely within the gregorian calendar, with no
        // crossing of the cutover. As a result, no special correction is
        // applied. Since the full gregorian year of 1582 has a different week
        // numbers than the full julian year of 1582, the week number is off by
        // one after the addition.
        //
        //testAdd("1582-W42-1", DurationFieldType.weekyears(), 1, "1583-W42-1");

        // Leap years...
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61951);testAdd("1580-W01-1", DurationFieldType.weekyears(), 4, "1584-W01-1");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61952);testAdd("1580-W30-7", DurationFieldType.weekyears(), 4, "1584-W30-7");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61953);testAdd("1580-W50-7", DurationFieldType.weekyears(), 4, "1584-W50-7");
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    @Test
    public void testCutoverAddMonths() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),61954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ma9rpl1bsy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ma9rpl1bsy(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61954);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61955);testAdd("1582-01-01", DurationFieldType.months(), 1, "1582-02-01");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61956);testAdd("1582-01-01", DurationFieldType.months(), 6, "1582-07-01");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61957);testAdd("1582-01-01", DurationFieldType.months(), 12, "1583-01-01");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61958);testAdd("1582-11-15", DurationFieldType.months(), 1, "1582-12-15");

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61959);testAdd("1582-09-04", DurationFieldType.months(), 2, "1582-11-04");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61960);testAdd("1582-09-05", DurationFieldType.months(), 2, "1582-11-05");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61961);testAdd("1582-09-10", DurationFieldType.months(), 2, "1582-11-10");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61962);testAdd("1582-09-15", DurationFieldType.months(), 2, "1582-11-15");


        // Leap years...
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61963);testAdd("1580-01-01", DurationFieldType.months(), 48, "1584-01-01");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61964);testAdd("1580-02-29", DurationFieldType.months(), 48, "1584-02-29");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61965);testAdd("1580-10-01", DurationFieldType.months(), 48, "1584-10-01");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61966);testAdd("1580-10-10", DurationFieldType.months(), 48, "1584-10-10");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61967);testAdd("1580-10-15", DurationFieldType.months(), 48, "1584-10-15");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61968);testAdd("1580-12-31", DurationFieldType.months(), 48, "1584-12-31");
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}


    @Test
    public void testCutoverAddWeeks() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),61969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vch5wp1btd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vch5wp1btd(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61969);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61970);testAdd("1582-01-01", DurationFieldType.weeks(), 1, "1582-01-08");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61971);testAdd("1583-01-01", DurationFieldType.weeks(), 1, "1583-01-08");

        // Weeks are precise, and so cutover is not ignored.
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61972);testAdd("1582-10-01", DurationFieldType.weeks(), 2, "1582-10-25");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61973);testAdd("1582-W01-1", DurationFieldType.weeks(), 51, "1583-W01-1");
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}


    @Test
    public void testCutoverAddDays() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),61974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r9ibtx1bti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r9ibtx1bti(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61974);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61975);testAdd("1582-10-03", DurationFieldType.days(), 1, "1582-10-04");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61976);testAdd("1582-10-04", DurationFieldType.days(), 1, "1582-10-15");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61977);testAdd("1582-10-15", DurationFieldType.days(), 1, "1582-10-16");

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61978);testAdd("1582-09-30", DurationFieldType.days(), 10, "1582-10-20");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61979);testAdd("1582-10-04", DurationFieldType.days(), 10, "1582-10-24");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61980);testAdd("1582-10-15", DurationFieldType.days(), 10, "1582-10-25");
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}


    @Test
    public void testYearEndAddDays() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),61981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iulrxp1btp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testYearEndAddDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iulrxp1btp(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61981);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61982);testAdd("1582-11-05", DurationFieldType.days(), 28, "1582-12-03");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61983);testAdd("1582-12-05", DurationFieldType.days(), 28, "1583-01-02");

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61984);testAdd("2005-11-05", DurationFieldType.days(), 28, "2005-12-03");
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61985);testAdd("2005-12-05", DurationFieldType.days(), 28, "2006-01-02");
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}


    @Test
    public void testSubtractDays() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),61986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12k0un01btu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testSubtractDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61986,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12k0un01btu(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61986);
        // This is a test for a bug in version 1.0. The dayOfMonth range
        // duration field did not match the monthOfYear duration field. This
        // caused an exception to be thrown when subtracting days.
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61987);DateTime dt = new DateTime
                (1112306400000L, GJChronology.getInstance(DateTimeZone.forID("Europe/Berlin")));
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61988);YearMonthDay ymd = dt.toYearMonthDay();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61989);while ((((ymd.toDateTimeAtMidnight().getDayOfWeek() != DateTimeConstants.MONDAY)&&(__CLR4_4_11bj21bj2lgchosmk.R.iget(61990)!=0|true))||(__CLR4_4_11bj21bj2lgchosmk.R.iget(61991)==0&false))) {{
            __CLR4_4_11bj21bj2lgchosmk.R.inc(61992);ymd = ymd.minus(Period.days(1));
        }
    }}finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}


    private void testAdd(String start, DurationFieldType type, int amt, String end) {try{__CLR4_4_11bj21bj2lgchosmk.R.inc(61993);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61994);DateTime dtStart = new DateTime(start, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61995);DateTime dtEnd = new DateTime(end, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61996);assertEquals(dtEnd, dtStart.withFieldAdded(type, amt));
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61997);assertEquals(dtStart, dtEnd.withFieldAdded(type, -amt));

        __CLR4_4_11bj21bj2lgchosmk.R.inc(61998);DurationField field = type.getField(GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_11bj21bj2lgchosmk.R.inc(61999);int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62000);assertEquals(amt, diff);

        __CLR4_4_11bj21bj2lgchosmk.R.inc(62001);if ((((type == DurationFieldType.years() ||
                type == DurationFieldType.months() ||
                type == DurationFieldType.days())&&(__CLR4_4_11bj21bj2lgchosmk.R.iget(62002)!=0|true))||(__CLR4_4_11bj21bj2lgchosmk.R.iget(62003)==0&false))) {{
            __CLR4_4_11bj21bj2lgchosmk.R.inc(62004);YearMonthDay ymdStart = new YearMonthDay(start, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_11bj21bj2lgchosmk.R.inc(62005);YearMonthDay ymdEnd = new YearMonthDay(end, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_11bj21bj2lgchosmk.R.inc(62006);assertEquals(ymdEnd, ymdStart.withFieldAdded(type, amt));
            __CLR4_4_11bj21bj2lgchosmk.R.inc(62007);assertEquals(ymdStart, ymdEnd.withFieldAdded(type, -amt));
        }
    }}finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    @Test
    public void testTimeOfDayAdd() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),62008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c1zvq61bug();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testTimeOfDayAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c1zvq61bug(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(62008);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62009);TimeOfDay start = new TimeOfDay(12, 30, GJChronology.getInstance());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62010);TimeOfDay end = new TimeOfDay(10, 30, GJChronology.getInstance());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62011);assertEquals(end, start.plusHours(22));
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62012);assertEquals(start, end.minusHours(22));
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62013);assertEquals(end, start.plusMinutes(22 * 60));
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62014);assertEquals(start, end.minusMinutes(22 * 60));
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    @Test
    public void testMaximumValue() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),62015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qnw3be1bun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testMaximumValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qnw3be1bun(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(62015);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62016);DateMidnight dt = new DateMidnight(1570, 1, 1, GJChronology.getInstance());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62017);while ((((dt.getYear() < 1590)&&(__CLR4_4_11bj21bj2lgchosmk.R.iget(62018)!=0|true))||(__CLR4_4_11bj21bj2lgchosmk.R.iget(62019)==0&false))) {{
            __CLR4_4_11bj21bj2lgchosmk.R.inc(62020);dt = dt.plusDays(1);
            __CLR4_4_11bj21bj2lgchosmk.R.inc(62021);YearMonthDay ymd = dt.toYearMonthDay();
            __CLR4_4_11bj21bj2lgchosmk.R.inc(62022);assertEquals(dt.year().getMaximumValue(), ymd.year().getMaximumValue());
            __CLR4_4_11bj21bj2lgchosmk.R.inc(62023);assertEquals(dt.monthOfYear().getMaximumValue(), ymd.monthOfYear().getMaximumValue());
            __CLR4_4_11bj21bj2lgchosmk.R.inc(62024);assertEquals(dt.dayOfMonth().getMaximumValue(), ymd.dayOfMonth().getMaximumValue());
        }
    }}finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    @Test
    public void testPartialGetAsText() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),62025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gbm3831bux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testPartialGetAsText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62025,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gbm3831bux(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(62025);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62026);GJChronology chrono = GJChronology.getInstance(TOKYO);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62027);assertEquals("January", new YearMonthDay("2005-01-01", chrono).monthOfYear().getAsText());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62028);assertEquals("Jan", new YearMonthDay("2005-01-01", chrono).monthOfYear().getAsShortText());
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    @Test
    public void testLeapYearRulesConstruction() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),62029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14eiwuw1bv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testLeapYearRulesConstruction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62029,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14eiwuw1bv1(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(62029);
        // 1500 not leap in Gregorian, but is leap in Julian
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62030);DateMidnight dt = new DateMidnight(1500, 2, 29, GJChronology.getInstanceUTC());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62031);assertEquals(dt.getYear(), 1500);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62032);assertEquals(dt.getMonthOfYear(), 2);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62033);assertEquals(dt.getDayOfMonth(), 29);
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    @Test
    public void testLeapYearRulesConstructionInvalid() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),62034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yvlo31bv6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testLeapYearRulesConstructionInvalid",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yvlo31bv6(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(62034);
        // 1500 not leap in Gregorian, but is leap in Julian
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62035);try {
            __CLR4_4_11bj21bj2lgchosmk.R.inc(62036);new DateMidnight(1500, 2, 30, GJChronology.getInstanceUTC());
            __CLR4_4_11bj21bj2lgchosmk.R.inc(62037);fail();
        } catch (IllegalFieldValueException ex) {
            // good
        }
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    @Test
    public void testLeap_28feb() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),62038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_149q6ov1bva();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testLeap_28feb",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_149q6ov1bva(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(62038);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62039);Chronology chrono = GJChronology.getInstance();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62040);DateTime dt = new DateTime(2012, 2, 28, 0, 0, chrono);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62041);assertEquals(true, dt.year().isLeap());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62042);assertEquals(true, dt.monthOfYear().isLeap());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62043);assertEquals(false, dt.dayOfMonth().isLeap());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62044);assertEquals(false, dt.dayOfYear().isLeap());
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}

    @Test
    public void testLeap_29feb() {__CLR4_4_11bj21bj2lgchosmk.R.globalSliceStart(getClass().getName(),62045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_194etwe1bvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bj21bj2lgchosmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bj21bj2lgchosmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testLeap_29feb",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_194etwe1bvh(){try{__CLR4_4_11bj21bj2lgchosmk.R.inc(62045);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62046);Chronology chrono = GJChronology.getInstance();
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62047);DateTime dt = new DateTime(2012, 2, 29, 0, 0, chrono);
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62048);assertEquals(true, dt.year().isLeap());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62049);assertEquals(true, dt.monthOfYear().isLeap());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62050);assertEquals(true, dt.dayOfMonth().isLeap());
        __CLR4_4_11bj21bj2lgchosmk.R.inc(62051);assertEquals(true, dt.dayOfYear().isLeap());
    }finally{__CLR4_4_11bj21bj2lgchosmk.R.flushNeeded();}}


}
