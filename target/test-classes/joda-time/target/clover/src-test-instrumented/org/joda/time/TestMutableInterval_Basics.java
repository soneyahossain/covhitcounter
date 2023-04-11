/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2011 Stephen Colebourne
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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.base.AbstractInterval;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestMutableInterval_Basics {static class __CLR4_4_1zy6zy6lgchos9g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,46955,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

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

    public static void main(String[] args) throws Exception {try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46590);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46591);TestMutableInterval_Basics TB = new TestMutableInterval_Basics();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46592);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46593);TB.testTest();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46594);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46595);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46596);TB.testGetMillis();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46597);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46598);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46599);TB.testGetDuration1();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46600);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46601);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46602);TB.testGetDuration2();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46603);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46604);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46605);TB.testEqualsHashCode();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46606);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46607);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46608);TB.testContains_long();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46609);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46610);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46611);TB.testContainsNow();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46612);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46613);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46614);TB.testContains_RI();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46615);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46616);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46617);TB.testContains_RInterval();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46618);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46619);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46620);TB.testOverlaps_RInterval();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46621);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46622);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46623);TB.testIsBefore_long();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46624);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46625);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46626);TB.testIsBeforeNow();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46627);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46628);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46629);TB.testIsBefore_RI();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46630);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46631);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46632);TB.testIsBefore_RInterval();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46633);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46634);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46635);TB.testIsAfter_long();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46636);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46637);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46638);TB.testIsAfterNow();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46639);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46640);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46641);TB.testIsAfter_RI();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46642);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46643);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46644);TB.testIsAfter_RInterval();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46645);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46646);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46647);TB.testToInterval1();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46648);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46649);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46650);TB.testToMutableInterval1();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46651);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46652);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46653);TB.testToPeriod();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46654);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46655);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46656);TB.testToPeriod_PeriodType1();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46657);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46658);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46659);TB.testToPeriod_PeriodType2();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46660);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46661);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46662);TB.testSerialization();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46663);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46664);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46665);TB.testToString();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46666);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46667);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46668);TB.testCopy();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46669);TB.tearDown();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46670);TB.setUp();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46671);TB.testClone();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46672);TB.tearDown();

    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestMutableInterval_Basics.class);
    }

    public TestMutableInterval_Basics(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46673);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46674);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46675);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46676);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46677);originalLocale = Locale.getDefault();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46678);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46679);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46680);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46681);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46682);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46683);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46684);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46685);Locale.setDefault(originalLocale);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46686);originalDateTimeZone = null;
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46687);originalTimeZone = null;
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46688);originalLocale = null;
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqj100x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqj100x(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46689);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46690);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46691);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46692);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetMillis() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18msyj51011();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testGetMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18msyj51011(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46693);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46694);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46695);assertEquals(TEST_TIME1, test.getStartMillis());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46696);assertEquals(TEST_TIME1, test.getStart().getMillis());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46697);assertEquals(TEST_TIME2, test.getEndMillis());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46698);assertEquals(TEST_TIME2, test.getEnd().getMillis());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46699);assertEquals(TEST_TIME2 - TEST_TIME1, test.toDurationMillis());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46700);assertEquals(TEST_TIME2 - TEST_TIME1, test.toDuration().getMillis());
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    @Test
    public void testGetDuration1() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m16ym81019();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testGetDuration1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m16ym81019(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46701);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46702);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46703);assertEquals(TEST_TIME2 - TEST_TIME1, test.toDurationMillis());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46704);assertEquals(TEST_TIME2 - TEST_TIME1, test.toDuration().getMillis());
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    @Test
    public void testGetDuration2() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1is6ztr101d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testGetDuration2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1is6ztr101d(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46705);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46706);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME1);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46707);assertSame(Duration.ZERO, test.toDuration());
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    @Test
    public void testEqualsHashCode() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77101g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46708,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77101g(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46708);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46709);MutableInterval test1 = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46710);MutableInterval test2 = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46711);assertEquals(true, test1.equals(test2));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46712);assertEquals(true, test2.equals(test1));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46713);assertEquals(true, test1.equals(test1));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46714);assertEquals(true, test2.equals(test2));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46715);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46716);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46717);assertEquals(true, test2.hashCode() == test2.hashCode());

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46718);MutableInterval test3 = new MutableInterval(TEST_TIME_NOW, TEST_TIME2);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46719);assertEquals(false, test1.equals(test3));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46720);assertEquals(false, test2.equals(test3));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46721);assertEquals(false, test3.equals(test1));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46722);assertEquals(false, test3.equals(test2));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46723);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46724);assertEquals(false, test2.hashCode() == test3.hashCode());

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46725);MutableInterval test4 = new MutableInterval(TEST_TIME1, TEST_TIME2, GJChronology.getInstance());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46726);assertEquals(true, test4.equals(test4));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46727);assertEquals(false, test1.equals(test4));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46728);assertEquals(false, test2.equals(test4));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46729);assertEquals(false, test4.equals(test1));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46730);assertEquals(false, test4.equals(test2));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46731);assertEquals(false, test1.hashCode() == test4.hashCode());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46732);assertEquals(false, test2.hashCode() == test4.hashCode());

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46733);MutableInterval test5 = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46734);assertEquals(true, test1.equals(test5));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46735);assertEquals(true, test2.equals(test5));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46736);assertEquals(false, test3.equals(test5));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46737);assertEquals(true, test5.equals(test1));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46738);assertEquals(true, test5.equals(test2));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46739);assertEquals(false, test5.equals(test3));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46740);assertEquals(true, test1.hashCode() == test5.hashCode());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46741);assertEquals(true, test2.hashCode() == test5.hashCode());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46742);assertEquals(false, test3.hashCode() == test5.hashCode());

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46743);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46744);assertEquals(true, test1.equals(new MockInterval()));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46745);assertEquals(false, test1.equals(new DateTime(TEST_TIME1)));
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    class MockInterval extends AbstractInterval {
        public MockInterval() {
            super();__CLR4_4_1zy6zy6lgchos9g.R.inc(46747);try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46746);
        }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

        public Chronology getChronology() {try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46748);
            __CLR4_4_1zy6zy6lgchos9g.R.inc(46749);return ISOChronology.getInstance();
        }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

        public long getStartMillis() {try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46750);
            __CLR4_4_1zy6zy6lgchos9g.R.inc(46751);return TEST_TIME1;
        }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

        public long getEndMillis() {try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46752);
            __CLR4_4_1zy6zy6lgchos9g.R.inc(46753);return TEST_TIME2;
        }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    @Test
    public void testContains_long() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1651dm9102q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testContains_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1651dm9102q(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46754);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46755);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46756);assertEquals(true, test.contains(TEST_TIME1));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46757);assertEquals(false, test.contains(TEST_TIME1 - 1));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46758);assertEquals(true, test.contains(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46759);assertEquals(false, test.contains(TEST_TIME2));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46760);assertEquals(true, test.contains(TEST_TIME2 - 1));
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    @Test
    public void testContainsNow() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ee80lw102x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testContainsNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ee80lw102x(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46761);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46762);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46763);DateTimeUtils.setCurrentMillisFixed(TEST_TIME1);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46764);assertEquals(true, test.containsNow());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46765);DateTimeUtils.setCurrentMillisFixed(TEST_TIME1 - 1);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46766);assertEquals(false, test.containsNow());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46767);DateTimeUtils.setCurrentMillisFixed(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46768);assertEquals(true, test.containsNow());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46769);DateTimeUtils.setCurrentMillisFixed(TEST_TIME2);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46770);assertEquals(false, test.containsNow());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46771);DateTimeUtils.setCurrentMillisFixed(TEST_TIME2 - 1);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46772);assertEquals(true, test.containsNow());
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    @Test
    public void testContains_RI() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13g4e8c1039();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testContains_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13g4e8c1039(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46773);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46774);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46775);assertEquals(true, test.contains(new Instant(TEST_TIME1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46776);assertEquals(false, test.contains(new Instant(TEST_TIME1 - 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46777);assertEquals(true, test.contains(new Instant(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46778);assertEquals(false, test.contains(new Instant(TEST_TIME2)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46779);assertEquals(true, test.contains(new Instant(TEST_TIME2 - 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46780);assertEquals(true, test.contains((ReadableInstant) null));
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testContains_RInterval() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13h7jbk103h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testContains_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13h7jbk103h(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46781);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46782);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46783);assertEquals(true, test.contains(new Interval(TEST_TIME1, TEST_TIME1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46784);assertEquals(false, test.contains(new Interval(TEST_TIME1 - 1, TEST_TIME1)));

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46785);assertEquals(true, test.contains(new Interval(TEST_TIME1, TEST_TIME1 + 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46786);assertEquals(false, test.contains(new Interval(TEST_TIME1 - 1, TEST_TIME1 + 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46787);assertEquals(true, test.contains(new Interval(TEST_TIME1 + 1, TEST_TIME1 + 1)));

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46788);assertEquals(true, test.contains(new Interval(TEST_TIME1, TEST_TIME2)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46789);assertEquals(false, test.contains(new Interval(TEST_TIME1 - 1, TEST_TIME2)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46790);assertEquals(true, test.contains(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46791);assertEquals(false, test.contains(new Interval(TEST_TIME2, TEST_TIME2)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46792);assertEquals(true, test.contains(new Interval(TEST_TIME2 - 1, TEST_TIME2)));

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46793);assertEquals(true, test.contains(new Interval(TEST_TIME1, TEST_TIME2 - 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46794);assertEquals(false, test.contains(new Interval(TEST_TIME1 - 1, TEST_TIME2 - 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46795);assertEquals(true, test.contains(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2 - 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46796);assertEquals(true, test.contains(new Interval(TEST_TIME2 - 1, TEST_TIME2 - 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46797);assertEquals(true, test.contains(new Interval(TEST_TIME2 - 2, TEST_TIME2 - 1)));

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46798);assertEquals(false, test.contains(new Interval(TEST_TIME1, TEST_TIME2 + 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46799);assertEquals(false, test.contains(new Interval(TEST_TIME1 - 1, TEST_TIME2 + 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46800);assertEquals(false, test.contains(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2 + 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46801);assertEquals(false, test.contains(new Interval(TEST_TIME2, TEST_TIME2 + 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46802);assertEquals(false, test.contains(new Interval(TEST_TIME2 - 1, TEST_TIME2 + 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46803);assertEquals(false, test.contains(new Interval(TEST_TIME1 - 2, TEST_TIME1 - 1)));

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46804);assertEquals(true, test.contains((ReadableInterval) null));
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    @Test
    public void testOverlaps_RInterval() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hyewlf1045();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testOverlaps_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hyewlf1045(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46805);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46806);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46807);assertEquals(false, test.overlaps(new Interval(TEST_TIME1, TEST_TIME1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46808);assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1)));

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46809);assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME1 + 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46810);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 + 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46811);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + 1, TEST_TIME1 + 1)));

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46812);assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME2)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46813);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME2)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46814);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46815);assertEquals(false, test.overlaps(new Interval(TEST_TIME2, TEST_TIME2)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46816);assertEquals(true, test.overlaps(new Interval(TEST_TIME2 - 1, TEST_TIME2)));

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46817);assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME2 + 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46818);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME2 + 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46819);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2 + 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46820);assertEquals(false, test.overlaps(new Interval(TEST_TIME2, TEST_TIME2 + 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46821);assertEquals(true, test.overlaps(new Interval(TEST_TIME2 - 1, TEST_TIME2 + 1)));

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46822);assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 - 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46823);assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46824);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 + 1)));

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46825);assertEquals(true, test.overlaps((ReadableInterval) null));

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46826);MutableInterval empty = new MutableInterval(TEST_TIME1, TEST_TIME1);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46827);assertEquals(false, empty.overlaps(empty));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46828);assertEquals(false, empty.overlaps(test));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46829);assertEquals(false, test.overlaps(empty));
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsBefore_long() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ie6mpz104u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsBefore_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ie6mpz104u(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46830);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46831);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46832);assertEquals(false, test.isBefore(TEST_TIME1 - 1));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46833);assertEquals(false, test.isBefore(TEST_TIME1));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46834);assertEquals(false, test.isBefore(TEST_TIME1 + 1));

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46835);assertEquals(false, test.isBefore(TEST_TIME2 - 1));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46836);assertEquals(true, test.isBefore(TEST_TIME2));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46837);assertEquals(true, test.isBefore(TEST_TIME2 + 1));
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    @Test
    public void testIsBeforeNow() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nh1we61052();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsBeforeNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nh1we61052(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46838);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46839);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46840);DateTimeUtils.setCurrentMillisFixed(TEST_TIME2 - 1);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46841);assertEquals(false, test.isBeforeNow());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46842);DateTimeUtils.setCurrentMillisFixed(TEST_TIME2);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46843);assertEquals(true, test.isBeforeNow());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46844);DateTimeUtils.setCurrentMillisFixed(TEST_TIME2 + 1);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46845);assertEquals(true, test.isBeforeNow());
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    @Test
    public void testIsBefore_RI() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15mphjy105a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsBefore_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15mphjy105a(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46846);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46847);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46848);assertEquals(false, test.isBefore(new Instant(TEST_TIME1 - 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46849);assertEquals(false, test.isBefore(new Instant(TEST_TIME1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46850);assertEquals(false, test.isBefore(new Instant(TEST_TIME1 + 1)));

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46851);assertEquals(false, test.isBefore(new Instant(TEST_TIME2 - 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46852);assertEquals(true, test.isBefore(new Instant(TEST_TIME2)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46853);assertEquals(true, test.isBefore(new Instant(TEST_TIME2 + 1)));

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46854);assertEquals(false, test.isBefore((ReadableInstant) null));
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    @Test
    public void testIsBefore_RInterval() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14qlycm105j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsBefore_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14qlycm105j(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46855);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46856);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46857);assertEquals(false, test.isBefore(new Interval(Long.MIN_VALUE, TEST_TIME1 - 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46858);assertEquals(false, test.isBefore(new Interval(Long.MIN_VALUE, TEST_TIME1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46859);assertEquals(false, test.isBefore(new Interval(Long.MIN_VALUE, TEST_TIME1 + 1)));

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46860);assertEquals(false, test.isBefore(new Interval(TEST_TIME2 - 1, Long.MAX_VALUE)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46861);assertEquals(true, test.isBefore(new Interval(TEST_TIME2, Long.MAX_VALUE)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46862);assertEquals(true, test.isBefore(new Interval(TEST_TIME2 + 1, Long.MAX_VALUE)));

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46863);assertEquals(false, test.isBefore((ReadableInterval) null));
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsAfter_long() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ehltpa105s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsAfter_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ehltpa105s(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46864);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46865);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46866);assertEquals(true, test.isAfter(TEST_TIME1 - 1));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46867);assertEquals(false, test.isAfter(TEST_TIME1));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46868);assertEquals(false, test.isAfter(TEST_TIME1 + 1));

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46869);assertEquals(false, test.isAfter(TEST_TIME2 - 1));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46870);assertEquals(false, test.isAfter(TEST_TIME2));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46871);assertEquals(false, test.isAfter(TEST_TIME2 + 1));
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    @Test
    public void testIsAfterNow() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15bglzx1060();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsAfterNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15bglzx1060(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46872);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46873);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46874);DateTimeUtils.setCurrentMillisFixed(TEST_TIME1 - 1);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46875);assertEquals(true, test.isAfterNow());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46876);DateTimeUtils.setCurrentMillisFixed(TEST_TIME1);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46877);assertEquals(false, test.isAfterNow());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46878);DateTimeUtils.setCurrentMillisFixed(TEST_TIME1 + 1);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46879);assertEquals(false, test.isAfterNow());
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    @Test
    public void testIsAfter_RI() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n5t0u51068();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsAfter_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n5t0u51068(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46880);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46881);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46882);assertEquals(true, test.isAfter(new Instant(TEST_TIME1 - 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46883);assertEquals(false, test.isAfter(new Instant(TEST_TIME1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46884);assertEquals(false, test.isAfter(new Instant(TEST_TIME1 + 1)));

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46885);assertEquals(false, test.isAfter(new Instant(TEST_TIME2 - 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46886);assertEquals(false, test.isAfter(new Instant(TEST_TIME2)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46887);assertEquals(false, test.isAfter(new Instant(TEST_TIME2 + 1)));

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46888);assertEquals(false, test.isAfter((ReadableInstant) null));
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    @Test
    public void testIsAfter_RInterval() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q8rfvl106h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsAfter_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46889,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q8rfvl106h(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46889);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46890);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46891);assertEquals(true, test.isAfter(new Interval(Long.MIN_VALUE, TEST_TIME1 - 1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46892);assertEquals(true, test.isAfter(new Interval(Long.MIN_VALUE, TEST_TIME1)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46893);assertEquals(false, test.isAfter(new Interval(Long.MIN_VALUE, TEST_TIME1 + 1)));

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46894);assertEquals(false, test.isAfter(new Interval(TEST_TIME2 - 1, Long.MAX_VALUE)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46895);assertEquals(false, test.isAfter(new Interval(TEST_TIME2, Long.MAX_VALUE)));
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46896);assertEquals(false, test.isAfter(new Interval(TEST_TIME2 + 1, Long.MAX_VALUE)));

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46897);assertEquals(false, test.isAfter((ReadableInterval) null));
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToInterval1() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11u3ccm106q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testToInterval1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11u3ccm106q(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46898);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46899);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46900);Interval result = test.toInterval();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46901);assertEquals(test, result);
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToMutableInterval1() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukyyfa106u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testToMutableInterval1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46902,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukyyfa106u(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46902);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46903);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46904);MutableInterval result = test.toMutableInterval();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46905);assertEquals(test, result);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46906);assertNotSame(test, result);
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToPeriod() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cvhk17106z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testToPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cvhk17106z(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46907);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46908);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, COPTIC_PARIS);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46909);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, COPTIC_PARIS);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46910);MutableInterval base = new MutableInterval(dt1, dt2);

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46911);Period test = base.toPeriod();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46912);Period expected = new Period(dt1, dt2, PeriodType.standard());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46913);assertEquals(expected, test);
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToPeriod_PeriodType1() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iiup2s1076();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testToPeriod_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iiup2s1076(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46914);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46915);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, COPTIC_PARIS);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46916);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, COPTIC_PARIS);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46917);MutableInterval base = new MutableInterval(dt1, dt2);

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46918);Period test = base.toPeriod(null);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46919);Period expected = new Period(dt1, dt2, PeriodType.standard());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46920);assertEquals(expected, test);
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    @Test
    public void testToPeriod_PeriodType2() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f9uqab107d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testToPeriod_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f9uqab107d(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46921);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46922);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46923);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46924);MutableInterval base = new MutableInterval(dt1, dt2);

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46925);Period test = base.toPeriod(PeriodType.yearWeekDayTime());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46926);Period expected = new Period(dt1, dt2, PeriodType.yearWeekDayTime());
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46927);assertEquals(expected, test);
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9107k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9107k() throws Exception{try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46928);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46929);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46930);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46931);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46932);oos.writeObject(test);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46933);oos.close();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46934);byte[] bytes = baos.toByteArray();

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46935);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46936);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46937);MutableInterval result = (MutableInterval) ois.readObject();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46938);ois.close();

        __CLR4_4_1zy6zy6lgchos9g.R.inc(46939);assertEquals(test, result);
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid107w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid107w(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46940);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46941);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, DateTimeZone.UTC);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46942);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, DateTimeZone.UTC);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46943);MutableInterval test = new MutableInterval(dt1, dt2);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46944);assertEquals("2004-06-09T07:08:09.010Z/2005-08-13T12:14:16.018Z", test.toString());
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testCopy() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukax6a1081();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukax6a1081(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46945);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46946);MutableInterval test = new MutableInterval(123L, 456L, COPTIC_PARIS);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46947);MutableInterval cloned = test.copy();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46948);assertEquals(test, cloned);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46949);assertNotSame(test, cloned);
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}

    @Test
    public void testClone() {__CLR4_4_1zy6zy6lgchos9g.R.globalSliceStart(getClass().getName(),46950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1csyejy1086();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zy6zy6lgchos9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zy6zy6lgchos9g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testClone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1csyejy1086(){try{__CLR4_4_1zy6zy6lgchos9g.R.inc(46950);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46951);MutableInterval test = new MutableInterval(123L, 456L, COPTIC_PARIS);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46952);MutableInterval cloned = (MutableInterval) test.clone();
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46953);assertEquals(test, cloned);
        __CLR4_4_1zy6zy6lgchos9g.R.inc(46954);assertNotSame(test, cloned);
    }finally{__CLR4_4_1zy6zy6lgchos9g.R.flushNeeded();}}


}
