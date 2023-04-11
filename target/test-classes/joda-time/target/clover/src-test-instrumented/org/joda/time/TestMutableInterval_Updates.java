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
package org.joda.time;

import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.base.AbstractInterval;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestMutableInterval_Updates {static class __CLR4_4_110o610o6lgchosab{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,47845,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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

    public static void main(String[] args) throws Exception {try{__CLR4_4_110o610o6lgchosab.R.inc(47526);
        __CLR4_4_110o610o6lgchosab.R.inc(47527);TestMutableInterval_Updates TB = new TestMutableInterval_Updates();
        __CLR4_4_110o610o6lgchosab.R.inc(47528);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47529);TB.testTest();
        __CLR4_4_110o610o6lgchosab.R.inc(47530);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47531);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47532);TB.testSetInterval_long_long1();
        __CLR4_4_110o610o6lgchosab.R.inc(47533);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47534);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47535);TB.testSetInterval_long_long2();
        __CLR4_4_110o610o6lgchosab.R.inc(47536);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47537);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47538);TB.testSetInterval_RI_RI1();
        __CLR4_4_110o610o6lgchosab.R.inc(47539);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47540);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47541);TB.testSetInterval_RI_RI2();
        __CLR4_4_110o610o6lgchosab.R.inc(47542);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47543);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47544);TB.testSetInterval_RI_RI3();
        __CLR4_4_110o610o6lgchosab.R.inc(47545);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47546);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47547);TB.testSetInterval_RI_RI4();
        __CLR4_4_110o610o6lgchosab.R.inc(47548);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47549);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47550);TB.testSetInterval_RI_RI5();
        __CLR4_4_110o610o6lgchosab.R.inc(47551);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47552);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47553);TB.testSetInterval_RInterval1();
        __CLR4_4_110o610o6lgchosab.R.inc(47554);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47555);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47556);TB.testSetInterval_RInterval2();
        __CLR4_4_110o610o6lgchosab.R.inc(47557);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47558);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47559);TB.testSetInterval_RInterval3();
        __CLR4_4_110o610o6lgchosab.R.inc(47560);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47561);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47562);TB.testSetStartMillis_long1();
        __CLR4_4_110o610o6lgchosab.R.inc(47563);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47564);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47565);TB.testSetStartMillis_long2();
        __CLR4_4_110o610o6lgchosab.R.inc(47566);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47567);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47568);TB.testSetStart_RI1();
        __CLR4_4_110o610o6lgchosab.R.inc(47569);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47570);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47571);TB.testSetStart_RI2();
        __CLR4_4_110o610o6lgchosab.R.inc(47572);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47573);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47574);TB.testSetStart_RI3();
        __CLR4_4_110o610o6lgchosab.R.inc(47575);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47576);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47577);TB.testSetEndMillis_long1();
        __CLR4_4_110o610o6lgchosab.R.inc(47578);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47579);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47580);TB.testSetEndMillis_long2();
        __CLR4_4_110o610o6lgchosab.R.inc(47581);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47582);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47583);TB.testSetEnd_RI1();
        __CLR4_4_110o610o6lgchosab.R.inc(47584);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47585);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47586);TB.testSetEnd_RI2();
        __CLR4_4_110o610o6lgchosab.R.inc(47587);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47588);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47589);TB.testSetEnd_RI3();
        __CLR4_4_110o610o6lgchosab.R.inc(47590);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47591);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47592);TB.testSetDurationAfterStart_long1();
        __CLR4_4_110o610o6lgchosab.R.inc(47593);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47594);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47595);TB.testSeDurationAfterStart_long2();
        __CLR4_4_110o610o6lgchosab.R.inc(47596);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47597);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47598);TB.testSetDurationAfterStart_RI1();
        __CLR4_4_110o610o6lgchosab.R.inc(47599);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47600);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47601);TB.testSeDurationAfterStart_RI2();
        __CLR4_4_110o610o6lgchosab.R.inc(47602);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47603);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47604);TB.testSetDurationAfterStart_RI3();
        __CLR4_4_110o610o6lgchosab.R.inc(47605);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47606);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47607);TB.testSetDurationBeforeEnd_long1();
        __CLR4_4_110o610o6lgchosab.R.inc(47608);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47609);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47610);TB.testSeDurationBeforeEnd_long2();
        __CLR4_4_110o610o6lgchosab.R.inc(47611);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47612);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47613);TB.testSetDurationBeforeEnd_RI1();
        __CLR4_4_110o610o6lgchosab.R.inc(47614);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47615);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47616);TB.testSeDurationBeforeEnd_RI2();
        __CLR4_4_110o610o6lgchosab.R.inc(47617);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47618);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47619);TB.testSetDurationBeforeEnd_RI3();
        __CLR4_4_110o610o6lgchosab.R.inc(47620);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47621);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47622);TB.testSetPeriodAfterStart_RI1();
        __CLR4_4_110o610o6lgchosab.R.inc(47623);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47624);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47625);TB.testSePeriodAfterStart_RI2();
        __CLR4_4_110o610o6lgchosab.R.inc(47626);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47627);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47628);TB.testSetPeriodAfterStart_RI3();
        __CLR4_4_110o610o6lgchosab.R.inc(47629);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47630);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47631);TB.testSetPeriodBeforeEnd_RI1();
        __CLR4_4_110o610o6lgchosab.R.inc(47632);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47633);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47634);TB.testSePeriodBeforeEnd_RI2();
        __CLR4_4_110o610o6lgchosab.R.inc(47635);TB.tearDown();
        __CLR4_4_110o610o6lgchosab.R.inc(47636);TB.setUp();
        __CLR4_4_110o610o6lgchosab.R.inc(47637);TB.testSetPeriodBeforeEnd_RI3();
        __CLR4_4_110o610o6lgchosab.R.inc(47638);TB.tearDown();

    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestMutableInterval_Updates.class);
    }

    public TestMutableInterval_Updates(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_110o610o6lgchosab.R.inc(47639);
        __CLR4_4_110o610o6lgchosab.R.inc(47640);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_110o610o6lgchosab.R.inc(47641);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_110o610o6lgchosab.R.inc(47642);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_110o610o6lgchosab.R.inc(47643);originalLocale = Locale.getDefault();
        __CLR4_4_110o610o6lgchosab.R.inc(47644);DateTimeZone.setDefault(LONDON);
        __CLR4_4_110o610o6lgchosab.R.inc(47645);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_110o610o6lgchosab.R.inc(47646);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_110o610o6lgchosab.R.inc(47647);
        __CLR4_4_110o610o6lgchosab.R.inc(47648);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_110o610o6lgchosab.R.inc(47649);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_110o610o6lgchosab.R.inc(47650);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_110o610o6lgchosab.R.inc(47651);Locale.setDefault(originalLocale);
        __CLR4_4_110o610o6lgchosab.R.inc(47652);originalDateTimeZone = null;
        __CLR4_4_110o610o6lgchosab.R.inc(47653);originalTimeZone = null;
        __CLR4_4_110o610o6lgchosab.R.inc(47654);originalLocale = null;
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqj10rr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqj10rr(){try{__CLR4_4_110o610o6lgchosab.R.inc(47655);
        __CLR4_4_110o610o6lgchosab.R.inc(47656);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_110o610o6lgchosab.R.inc(47657);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_110o610o6lgchosab.R.inc(47658);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetInterval_long_long1() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15np4tf10rv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_long_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15np4tf10rv(){try{__CLR4_4_110o610o6lgchosab.R.inc(47659);
        __CLR4_4_110o610o6lgchosab.R.inc(47660);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47661);test.setInterval(TEST_TIME1 - 1, TEST_TIME2 + 1);
        __CLR4_4_110o610o6lgchosab.R.inc(47662);assertEquals(TEST_TIME1 - 1, test.getStartMillis());
        __CLR4_4_110o610o6lgchosab.R.inc(47663);assertEquals(TEST_TIME2 + 1, test.getEndMillis());
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    @Test
    public void testSetInterval_long_long2() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18wp3lw10s0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_long_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47664,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18wp3lw10s0(){try{__CLR4_4_110o610o6lgchosab.R.inc(47664);
        __CLR4_4_110o610o6lgchosab.R.inc(47665);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47666);try {
            __CLR4_4_110o610o6lgchosab.R.inc(47667);test.setInterval(TEST_TIME1 - 1, TEST_TIME1 - 2);
            __CLR4_4_110o610o6lgchosab.R.inc(47668);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetInterval_RI_RI1() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1om0b0j10s5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RI_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47669,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1om0b0j10s5(){try{__CLR4_4_110o610o6lgchosab.R.inc(47669);
        __CLR4_4_110o610o6lgchosab.R.inc(47670);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47671);test.setInterval(new Instant(TEST_TIME1 - 1), new Instant(TEST_TIME2 + 1));
        __CLR4_4_110o610o6lgchosab.R.inc(47672);assertEquals(TEST_TIME1 - 1, test.getStartMillis());
        __CLR4_4_110o610o6lgchosab.R.inc(47673);assertEquals(TEST_TIME2 + 1, test.getEndMillis());
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    @Test
    public void testSetInterval_RI_RI2() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rv09t010sa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RI_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rv09t010sa(){try{__CLR4_4_110o610o6lgchosab.R.inc(47674);
        __CLR4_4_110o610o6lgchosab.R.inc(47675);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47676);try {
            __CLR4_4_110o610o6lgchosab.R.inc(47677);test.setInterval(new Instant(TEST_TIME1 - 1), new Instant(TEST_TIME1 - 2));
            __CLR4_4_110o610o6lgchosab.R.inc(47678);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    @Test
    public void testSetInterval_RI_RI3() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v408lh10sf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RI_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v408lh10sf(){try{__CLR4_4_110o610o6lgchosab.R.inc(47679);
        __CLR4_4_110o610o6lgchosab.R.inc(47680);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47681);test.setInterval(null, new Instant(TEST_TIME2 + 1));
        __CLR4_4_110o610o6lgchosab.R.inc(47682);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_110o610o6lgchosab.R.inc(47683);assertEquals(TEST_TIME2 + 1, test.getEndMillis());
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    @Test
    public void testSetInterval_RI_RI4() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yd07dy10sk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RI_RI4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yd07dy10sk(){try{__CLR4_4_110o610o6lgchosab.R.inc(47684);
        __CLR4_4_110o610o6lgchosab.R.inc(47685);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47686);test.setInterval(new Instant(TEST_TIME1 - 1), null);
        __CLR4_4_110o610o6lgchosab.R.inc(47687);assertEquals(TEST_TIME1 - 1, test.getStartMillis());
        __CLR4_4_110o610o6lgchosab.R.inc(47688);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    @Test
    public void testSetInterval_RI_RI5() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xf3vsp10sp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RI_RI5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xf3vsp10sp(){try{__CLR4_4_110o610o6lgchosab.R.inc(47689);
        __CLR4_4_110o610o6lgchosab.R.inc(47690);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47691);test.setInterval(null, null);
        __CLR4_4_110o610o6lgchosab.R.inc(47692);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_110o610o6lgchosab.R.inc(47693);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetInterval_RInterval1() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hx0x5710su();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RInterval1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hx0x5710su(){try{__CLR4_4_110o610o6lgchosab.R.inc(47694);
        __CLR4_4_110o610o6lgchosab.R.inc(47695);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47696);test.setInterval(new Interval(TEST_TIME1 - 1, TEST_TIME2 + 1));
        __CLR4_4_110o610o6lgchosab.R.inc(47697);assertEquals(TEST_TIME1 - 1, test.getStartMillis());
        __CLR4_4_110o610o6lgchosab.R.inc(47698);assertEquals(TEST_TIME2 + 1, test.getEndMillis());
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    @Test
    public void testSetInterval_RInterval2() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l60vxo10sz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RInterval2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l60vxo10sz(){try{__CLR4_4_110o610o6lgchosab.R.inc(47699);
        __CLR4_4_110o610o6lgchosab.R.inc(47700);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47701);try {
            __CLR4_4_110o610o6lgchosab.R.inc(47702);test.setInterval(new MockBadInterval());
            __CLR4_4_110o610o6lgchosab.R.inc(47703);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    class MockBadInterval extends AbstractInterval {
        public Chronology getChronology() {try{__CLR4_4_110o610o6lgchosab.R.inc(47704);
            __CLR4_4_110o610o6lgchosab.R.inc(47705);return ISOChronology.getInstance();
        }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

        public long getStartMillis() {try{__CLR4_4_110o610o6lgchosab.R.inc(47706);
            __CLR4_4_110o610o6lgchosab.R.inc(47707);return TEST_TIME1 - 1;
        }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

        public long getEndMillis() {try{__CLR4_4_110o610o6lgchosab.R.inc(47708);
            __CLR4_4_110o610o6lgchosab.R.inc(47709);return TEST_TIME1 - 2;
        }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}
    }

    @Test
    public void testSetInterval_RInterval3() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1of0uq510ta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RInterval3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47710,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1of0uq510ta(){try{__CLR4_4_110o610o6lgchosab.R.inc(47710);
        __CLR4_4_110o610o6lgchosab.R.inc(47711);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47712);try {
            __CLR4_4_110o610o6lgchosab.R.inc(47713);test.setInterval(null);
            __CLR4_4_110o610o6lgchosab.R.inc(47714);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetStartMillis_long1() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wqei5x10tf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetStartMillis_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47715,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wqei5x10tf(){try{__CLR4_4_110o610o6lgchosab.R.inc(47715);
        __CLR4_4_110o610o6lgchosab.R.inc(47716);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47717);test.setStartMillis(TEST_TIME1 - 1);
        __CLR4_4_110o610o6lgchosab.R.inc(47718);assertEquals(TEST_TIME1 - 1, test.getStartMillis());
        __CLR4_4_110o610o6lgchosab.R.inc(47719);assertEquals(TEST_TIME2, test.getEndMillis());
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    @Test
    public void testSetStartMillis_long2() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z1pl0q10tk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetStartMillis_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47720,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z1pl0q10tk(){try{__CLR4_4_110o610o6lgchosab.R.inc(47720);
        __CLR4_4_110o610o6lgchosab.R.inc(47721);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47722);try {
            __CLR4_4_110o610o6lgchosab.R.inc(47723);test.setStartMillis(TEST_TIME2 + 1);
            __CLR4_4_110o610o6lgchosab.R.inc(47724);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetStart_RI1() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r7ekbw10tp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetStart_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r7ekbw10tp(){try{__CLR4_4_110o610o6lgchosab.R.inc(47725);
        __CLR4_4_110o610o6lgchosab.R.inc(47726);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47727);test.setStart(new Instant(TEST_TIME1 - 1));
        __CLR4_4_110o610o6lgchosab.R.inc(47728);assertEquals(TEST_TIME1 - 1, test.getStartMillis());
        __CLR4_4_110o610o6lgchosab.R.inc(47729);assertEquals(TEST_TIME2, test.getEndMillis());
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    @Test
    public void testSetStart_RI2() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nyeljf10tu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetStart_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nyeljf10tu(){try{__CLR4_4_110o610o6lgchosab.R.inc(47730);
        __CLR4_4_110o610o6lgchosab.R.inc(47731);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47732);try {
            __CLR4_4_110o610o6lgchosab.R.inc(47733);test.setStart(new Instant(TEST_TIME2 + 1));
            __CLR4_4_110o610o6lgchosab.R.inc(47734);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    @Test
    public void testSetStart_RI3() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kpemqy10tz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetStart_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kpemqy10tz(){try{__CLR4_4_110o610o6lgchosab.R.inc(47735);
        __CLR4_4_110o610o6lgchosab.R.inc(47736);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47737);test.setStart(null);
        __CLR4_4_110o610o6lgchosab.R.inc(47738);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_110o610o6lgchosab.R.inc(47739);assertEquals(TEST_TIME2, test.getEndMillis());
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetEndMillis_long1() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kb9zri10u4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetEndMillis_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47740,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kb9zri10u4(){try{__CLR4_4_110o610o6lgchosab.R.inc(47740);
        __CLR4_4_110o610o6lgchosab.R.inc(47741);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47742);test.setEndMillis(TEST_TIME2 + 1);
        __CLR4_4_110o610o6lgchosab.R.inc(47743);assertEquals(TEST_TIME1, test.getStartMillis());
        __CLR4_4_110o610o6lgchosab.R.inc(47744);assertEquals(TEST_TIME2 + 1, test.getEndMillis());
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    @Test
    public void testSetEndMillis_long2() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nk9yjz10u9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetEndMillis_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nk9yjz10u9(){try{__CLR4_4_110o610o6lgchosab.R.inc(47745);
        __CLR4_4_110o610o6lgchosab.R.inc(47746);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47747);try {
            __CLR4_4_110o610o6lgchosab.R.inc(47748);test.setEndMillis(TEST_TIME1 - 1);
            __CLR4_4_110o610o6lgchosab.R.inc(47749);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetEnd_RI1() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izmfe510ue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetEnd_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izmfe510ue(){try{__CLR4_4_110o610o6lgchosab.R.inc(47750);
        __CLR4_4_110o610o6lgchosab.R.inc(47751);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47752);test.setEnd(new Instant(TEST_TIME2 + 1));
        __CLR4_4_110o610o6lgchosab.R.inc(47753);assertEquals(TEST_TIME1, test.getStartMillis());
        __CLR4_4_110o610o6lgchosab.R.inc(47754);assertEquals(TEST_TIME2 + 1, test.getEndMillis());
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    @Test
    public void testSetEnd_RI2() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m8me6m10uj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetEnd_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m8me6m10uj(){try{__CLR4_4_110o610o6lgchosab.R.inc(47755);
        __CLR4_4_110o610o6lgchosab.R.inc(47756);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47757);try {
            __CLR4_4_110o610o6lgchosab.R.inc(47758);test.setEnd(new Instant(TEST_TIME1 - 1));
            __CLR4_4_110o610o6lgchosab.R.inc(47759);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    @Test
    public void testSetEnd_RI3() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1phmcz310uo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetEnd_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47760,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1phmcz310uo(){try{__CLR4_4_110o610o6lgchosab.R.inc(47760);
        __CLR4_4_110o610o6lgchosab.R.inc(47761);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47762);test.setEnd(null);
        __CLR4_4_110o610o6lgchosab.R.inc(47763);assertEquals(TEST_TIME1, test.getStartMillis());
        __CLR4_4_110o610o6lgchosab.R.inc(47764);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetDurationAfterStart_long1() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hqwmxz10ut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationAfterStart_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47765,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hqwmxz10ut(){try{__CLR4_4_110o610o6lgchosab.R.inc(47765);
        __CLR4_4_110o610o6lgchosab.R.inc(47766);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47767);test.setDurationAfterStart(123L);
        __CLR4_4_110o610o6lgchosab.R.inc(47768);assertEquals(TEST_TIME1, test.getStartMillis());
        __CLR4_4_110o610o6lgchosab.R.inc(47769);assertEquals(TEST_TIME1 + 123L, test.getEndMillis());
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    @Test
    public void testSeDurationAfterStart_long2() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fmhcbg10uy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSeDurationAfterStart_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fmhcbg10uy(){try{__CLR4_4_110o610o6lgchosab.R.inc(47770);
        __CLR4_4_110o610o6lgchosab.R.inc(47771);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47772);try {
            __CLR4_4_110o610o6lgchosab.R.inc(47773);test.setDurationAfterStart(-1);
            __CLR4_4_110o610o6lgchosab.R.inc(47774);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetDurationAfterStart_RI1() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15oxywc10v3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationAfterStart_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15oxywc10v3(){try{__CLR4_4_110o610o6lgchosab.R.inc(47775);
        __CLR4_4_110o610o6lgchosab.R.inc(47776);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47777);test.setDurationAfterStart(new Duration(123L));
        __CLR4_4_110o610o6lgchosab.R.inc(47778);assertEquals(TEST_TIME1, test.getStartMillis());
        __CLR4_4_110o610o6lgchosab.R.inc(47779);assertEquals(TEST_TIME1 + 123L, test.getEndMillis());
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    @Test
    public void testSeDurationAfterStart_RI2() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fj0fxb10v8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSeDurationAfterStart_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fj0fxb10v8(){try{__CLR4_4_110o610o6lgchosab.R.inc(47780);
        __CLR4_4_110o610o6lgchosab.R.inc(47781);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47782);try {
            __CLR4_4_110o610o6lgchosab.R.inc(47783);test.setDurationAfterStart(new Duration(-1));
            __CLR4_4_110o610o6lgchosab.R.inc(47784);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    @Test
    public void testSetDurationAfterStart_RI3() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c6xwha10vd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationAfterStart_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47785,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c6xwha10vd(){try{__CLR4_4_110o610o6lgchosab.R.inc(47785);
        __CLR4_4_110o610o6lgchosab.R.inc(47786);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47787);test.setDurationAfterStart(null);
        __CLR4_4_110o610o6lgchosab.R.inc(47788);assertEquals(TEST_TIME1, test.getStartMillis());
        __CLR4_4_110o610o6lgchosab.R.inc(47789);assertEquals(TEST_TIME1, test.getEndMillis());
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetDurationBeforeEnd_long1() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ves4wl10vi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationBeforeEnd_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ves4wl10vi(){try{__CLR4_4_110o610o6lgchosab.R.inc(47790);
        __CLR4_4_110o610o6lgchosab.R.inc(47791);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47792);test.setDurationBeforeEnd(123L);
        __CLR4_4_110o610o6lgchosab.R.inc(47793);assertEquals(TEST_TIME2 - 123L, test.getStartMillis());
        __CLR4_4_110o610o6lgchosab.R.inc(47794);assertEquals(TEST_TIME2, test.getEndMillis());
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    @Test
    public void testSeDurationBeforeEnd_long2() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dmp2la10vn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSeDurationBeforeEnd_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dmp2la10vn(){try{__CLR4_4_110o610o6lgchosab.R.inc(47795);
        __CLR4_4_110o610o6lgchosab.R.inc(47796);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47797);try {
            __CLR4_4_110o610o6lgchosab.R.inc(47798);test.setDurationBeforeEnd(-1);
            __CLR4_4_110o610o6lgchosab.R.inc(47799);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetDurationBeforeEnd_RI1() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ndply10vs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationBeforeEnd_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ndply10vs(){try{__CLR4_4_110o610o6lgchosab.R.inc(47800);
        __CLR4_4_110o610o6lgchosab.R.inc(47801);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47802);test.setDurationBeforeEnd(new Duration(123L));
        __CLR4_4_110o610o6lgchosab.R.inc(47803);assertEquals(TEST_TIME2 - 123L, test.getStartMillis());
        __CLR4_4_110o610o6lgchosab.R.inc(47804);assertEquals(TEST_TIME2, test.getEndMillis());
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    @Test
    public void testSeDurationBeforeEnd_RI2() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u9mhp510vx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSeDurationBeforeEnd_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u9mhp510vx(){try{__CLR4_4_110o610o6lgchosab.R.inc(47805);
        __CLR4_4_110o610o6lgchosab.R.inc(47806);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47807);try {
            __CLR4_4_110o610o6lgchosab.R.inc(47808);test.setDurationBeforeEnd(new Duration(-1));
            __CLR4_4_110o610o6lgchosab.R.inc(47809);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    @Test
    public void testSetDurationBeforeEnd_RI3() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15um7z010w2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationBeforeEnd_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15um7z010w2(){try{__CLR4_4_110o610o6lgchosab.R.inc(47810);
        __CLR4_4_110o610o6lgchosab.R.inc(47811);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47812);test.setDurationBeforeEnd(null);
        __CLR4_4_110o610o6lgchosab.R.inc(47813);assertEquals(TEST_TIME2, test.getStartMillis());
        __CLR4_4_110o610o6lgchosab.R.inc(47814);assertEquals(TEST_TIME2, test.getEndMillis());
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetPeriodAfterStart_RI1() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qc8q0p10w7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetPeriodAfterStart_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qc8q0p10w7(){try{__CLR4_4_110o610o6lgchosab.R.inc(47815);
        __CLR4_4_110o610o6lgchosab.R.inc(47816);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47817);test.setPeriodAfterStart(new Period(123L));
        __CLR4_4_110o610o6lgchosab.R.inc(47818);assertEquals(TEST_TIME1, test.getStartMillis());
        __CLR4_4_110o610o6lgchosab.R.inc(47819);assertEquals(TEST_TIME1 + 123L, test.getEndMillis());
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    @Test
    public void testSePeriodAfterStart_RI2() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1af7r2q10wc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSePeriodAfterStart_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1af7r2q10wc(){try{__CLR4_4_110o610o6lgchosab.R.inc(47820);
        __CLR4_4_110o610o6lgchosab.R.inc(47821);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47822);try {
            __CLR4_4_110o610o6lgchosab.R.inc(47823);test.setPeriodAfterStart(new Period(-1L));
            __CLR4_4_110o610o6lgchosab.R.inc(47824);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    @Test
    public void testSetPeriodAfterStart_RI3() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wu8nln10wh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetPeriodAfterStart_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wu8nln10wh(){try{__CLR4_4_110o610o6lgchosab.R.inc(47825);
        __CLR4_4_110o610o6lgchosab.R.inc(47826);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47827);test.setPeriodAfterStart(null);
        __CLR4_4_110o610o6lgchosab.R.inc(47828);assertEquals(TEST_TIME1, test.getStartMillis());
        __CLR4_4_110o610o6lgchosab.R.inc(47829);assertEquals(TEST_TIME1, test.getEndMillis());
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetPeriodBeforeEnd_RI1() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lh2l10wm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetPeriodBeforeEnd_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lh2l10wm(){try{__CLR4_4_110o610o6lgchosab.R.inc(47830);
        __CLR4_4_110o610o6lgchosab.R.inc(47831);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47832);test.setPeriodBeforeEnd(new Period(123L));
        __CLR4_4_110o610o6lgchosab.R.inc(47833);assertEquals(TEST_TIME2 - 123L, test.getStartMillis());
        __CLR4_4_110o610o6lgchosab.R.inc(47834);assertEquals(TEST_TIME2, test.getEndMillis());
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    @Test
    public void testSePeriodBeforeEnd_RI2() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0ji4a10wr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSePeriodBeforeEnd_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0ji4a10wr(){try{__CLR4_4_110o610o6lgchosab.R.inc(47835);
        __CLR4_4_110o610o6lgchosab.R.inc(47836);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47837);try {
            __CLR4_4_110o610o6lgchosab.R.inc(47838);test.setPeriodBeforeEnd(new Period(-1L));
            __CLR4_4_110o610o6lgchosab.R.inc(47839);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

    @Test
    public void testSetPeriodBeforeEnd_RI3() {__CLR4_4_110o610o6lgchosab.R.globalSliceStart(getClass().getName(),47840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ilenj10ww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110o610o6lgchosab.R.rethrow($CLV_t2$);}finally{__CLR4_4_110o610o6lgchosab.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetPeriodBeforeEnd_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ilenj10ww(){try{__CLR4_4_110o610o6lgchosab.R.inc(47840);
        __CLR4_4_110o610o6lgchosab.R.inc(47841);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_110o610o6lgchosab.R.inc(47842);test.setPeriodBeforeEnd(null);
        __CLR4_4_110o610o6lgchosab.R.inc(47843);assertEquals(TEST_TIME2, test.getStartMillis());
        __CLR4_4_110o610o6lgchosab.R.inc(47844);assertEquals(TEST_TIME2, test.getEndMillis());
    }finally{__CLR4_4_110o610o6lgchosab.R.flushNeeded();}}

}
