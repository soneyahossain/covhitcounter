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
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestInterval_Basics {static class __CLR4_4_1pwmpwmlgchorvt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,34681,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone MOSCOW = DateTimeZone.forID("Europe/Moscow");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private Interval interval37;
    private Interval interval33;

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

    public static void main(String[] args) throws Throwable {try{__CLR4_4_1pwmpwmlgchorvt.R.inc(33574);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33575);TestInterval_Basics TB = new TestInterval_Basics();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33576);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33577);TB.testTest();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33578);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33579);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33580);TB.testGetMillis();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33581);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33582);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33583);TB.testGetDuration1();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33584);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33585);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33586);TB.testGetDuration2();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33587);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33588);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33589);TB.testGetDuration3();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33590);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33591);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33592);TB.testEqualsHashCode();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33593);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33594);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33595);TB.testEqualsHashCodeLenient();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33596);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33597);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33598);TB.testEqualsHashCodeStrict();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33599);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33600);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33601);TB.test_useCase_ContainsOverlapAbutGap();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33602);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33603);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33604);TB.test_useCase_ContainsOverlapAbutGap_zeroDuration();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33605);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33606);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33607);TB.test_useCase_ContainsOverlapAbutGap_bothZeroDuration();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33608);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33609);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33610);TB.testContains_long();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33611);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33612);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33613);TB.testContains_long_zeroDuration();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33614);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33615);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33616);TB.testContainsNow();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33617);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33618);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33619);TB.testContains_RI();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33620);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33621);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33622);TB.testContains_RI_null();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33623);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33624);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33625);TB.testContains_RI_zeroDuration();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33626);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33627);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33628);TB.testContains_RInterval();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33629);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33630);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33631);TB.testContains_RInterval_null();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33632);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33633);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33634);TB.testContains_RInterval_zeroDuration();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33635);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33636);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33637);TB.testOverlaps_RInterval();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33638);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33639);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33640);TB.testOverlaps_RInterval_null();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33641);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33642);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33643);TB.testOverlaps_RInterval_zeroDuration();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33644);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33645);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33646);TB.testOverlap_RInterval();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33647);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33648);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33649);TB.testOverlap_RInterval_null();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33650);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33651);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33652);TB.testOverlap_RInterval_zone();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33653);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33654);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33655);TB.testOverlap_RInterval_zoneUTC();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33656);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33657);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33658);TB.testGap_RInterval();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33659);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33660);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33661);TB.testGap_RInterval_null();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33662);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33663);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33664);TB.testGap_RInterval_zone();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33665);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33666);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33667);TB.testGap_RInterval_zoneUTC();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33668);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33669);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33670);TB.testAbuts_RInterval();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33671);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33672);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33673);TB.testAbuts_RInterval_null();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33674);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33675);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33676);TB.testIsEqual_RI();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33677);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33678);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33679);TB.testIsBefore_long();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33680);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33681);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33682);TB.testIsBeforeNow();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33683);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33684);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33685);TB.testIsBefore_RI();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33686);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33687);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33688);TB.testIsBefore_RI_null();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33689);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33690);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33691);TB.testIsBefore_RInterval();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33692);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33693);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33694);TB.testIsBefore_RInterval_null();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33695);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33696);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33697);TB.testIsAfter_long();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33698);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33699);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33700);TB.testIsAfterNow();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33701);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33702);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33703);TB.testIsAfter_RI();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33704);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33705);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33706);TB.testIsAfter_RI_null();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33707);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33708);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33709);TB.testIsAfter_RInterval();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33710);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33711);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33712);TB.testIsAfter_RInterval_null();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33713);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33714);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33715);TB.testToInterval1();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33716);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33717);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33718);TB.testToMutableInterval1();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33719);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33720);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33721);TB.testToPeriod();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33722);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33723);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33724);TB.testToPeriod_PeriodType1();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33725);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33726);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33727);TB.testToPeriod_PeriodType2();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33728);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33729);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33730);TB.testSerialization();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33731);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33732);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33733);TB.testToString();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33734);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33735);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33736);TB.testToString_reparse();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33737);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33738);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33739);TB.testWithChronology1();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33740);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33741);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33742);TB.testWithChronology2();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33743);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33744);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33745);TB.testWithChronology3();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33746);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33747);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33748);TB.testWithStartMillis_long1();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33749);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33750);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33751);TB.testWithStartMillis_long2();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33752);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33753);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33754);TB.testWithStartMillis_long3();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33755);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33756);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33757);TB.testWithStartInstant_RI1();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33758);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33759);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33760);TB.testWithStartInstant_RI2();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33761);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33762);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33763);TB.testWithStartInstant_RI3();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33764);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33765);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33766);TB.testWithEndMillis_long1();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33767);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33768);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33769);TB.testWithEndMillis_long2();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33770);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33771);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33772);TB.testWithEndMillis_long3();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33773);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33774);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33775);TB.testWithEndInstant_RI1();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33776);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33777);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33778);TB.testWithEndInstant_RI2();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33779);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33780);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33781);TB.testWithEndInstant_RI3();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33782);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33783);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33784);TB.testWithDurationAfterStart1();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33785);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33786);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33787);TB.testWithDurationAfterStart2();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33788);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33789);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33790);TB.testWithDurationAfterStart3();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33791);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33792);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33793);TB.testWithDurationAfterStart4();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33794);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33795);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33796);TB.testWithDurationBeforeEnd1();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33797);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33798);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33799);TB.testWithDurationBeforeEnd2();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33800);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33801);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33802);TB.testWithDurationBeforeEnd3();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33803);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33804);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33805);TB.testWithDurationBeforeEnd4();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33806);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33807);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33808);TB.testWithPeriodAfterStart1();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33809);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33810);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33811);TB.testWithPeriodAfterStart2();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33812);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33813);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33814);TB.testWithPeriodAfterStart3();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33815);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33816);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33817);TB.testWithPeriodBeforeEnd1();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33818);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33819);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33820);TB.testWithPeriodBeforeEnd2();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33821);TB.tearDown();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33822);TB.setUp();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33823);TB.testWithPeriodBeforeEnd3();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33824);TB.tearDown();

    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestInterval_Basics.class);
    }

    public TestInterval_Basics(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1pwmpwmlgchorvt.R.inc(33825);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33826);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33827);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33828);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33829);originalLocale = Locale.getDefault();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33830);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33831);TimeZone.setDefault(PARIS.toTimeZone());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33832);Locale.setDefault(Locale.FRANCE);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33833);interval37 = new Interval(3, 7);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33834);interval33 = new Interval(3, 3);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1pwmpwmlgchorvt.R.inc(33835);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33836);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33837);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33838);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33839);Locale.setDefault(originalLocale);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33840);originalDateTimeZone = null;
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33841);originalTimeZone = null;
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33842);originalLocale = null;
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),33843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjq43();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjq43(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(33843);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33844);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33845);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33846);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetMillis() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),33847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18msyj5q47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGetMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18msyj5q47(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(33847);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33848);Interval test = new Interval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33849);assertEquals(TEST_TIME1, test.getStartMillis());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33850);assertEquals(TEST_TIME1, test.getStart().getMillis());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33851);assertEquals(TEST_TIME2, test.getEndMillis());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33852);assertEquals(TEST_TIME2, test.getEnd().getMillis());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33853);assertEquals(TEST_TIME2 - TEST_TIME1, test.toDurationMillis());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33854);assertEquals(TEST_TIME2 - TEST_TIME1, test.toDuration().getMillis());
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testGetDuration1() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),33855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m16ym8q4f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGetDuration1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m16ym8q4f(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(33855);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33856);Interval test = new Interval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33857);assertEquals(TEST_TIME2 - TEST_TIME1, test.toDurationMillis());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33858);assertEquals(TEST_TIME2 - TEST_TIME1, test.toDuration().getMillis());
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testGetDuration2() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),33859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1is6ztrq4j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGetDuration2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1is6ztrq4j(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(33859);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33860);Interval test = new Interval(TEST_TIME1, TEST_TIME1);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33861);assertSame(Duration.ZERO, test.toDuration());
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testGetDuration3() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),33862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fj711aq4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGetDuration3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fj711aq4m(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(33862);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33863);Interval test = new Interval(Long.MIN_VALUE, -2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33864);assertEquals(-2L - Long.MIN_VALUE, test.toDurationMillis());
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testEqualsHashCode() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),33865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77q4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33865,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77q4p(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(33865);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33866);Interval test1 = new Interval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33867);Interval test2 = new Interval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33868);assertEquals(true, test1.equals(test2));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33869);assertEquals(true, test2.equals(test1));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33870);assertEquals(true, test1.equals(test1));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33871);assertEquals(true, test2.equals(test2));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33872);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33873);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33874);assertEquals(true, test2.hashCode() == test2.hashCode());

        __CLR4_4_1pwmpwmlgchorvt.R.inc(33875);Interval test3 = new Interval(TEST_TIME_NOW, TEST_TIME2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33876);assertEquals(false, test1.equals(test3));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33877);assertEquals(false, test2.equals(test3));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33878);assertEquals(false, test3.equals(test1));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33879);assertEquals(false, test3.equals(test2));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33880);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33881);assertEquals(false, test2.hashCode() == test3.hashCode());

        __CLR4_4_1pwmpwmlgchorvt.R.inc(33882);Interval test4 = new Interval(TEST_TIME1, TEST_TIME2, GJChronology.getInstance());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33883);assertEquals(true, test4.equals(test4));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33884);assertEquals(false, test1.equals(test4));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33885);assertEquals(false, test2.equals(test4));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33886);assertEquals(false, test4.equals(test1));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33887);assertEquals(false, test4.equals(test2));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33888);assertEquals(false, test1.hashCode() == test4.hashCode());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33889);assertEquals(false, test2.hashCode() == test4.hashCode());

        __CLR4_4_1pwmpwmlgchorvt.R.inc(33890);MutableInterval test5 = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33891);assertEquals(true, test1.equals(test5));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33892);assertEquals(true, test2.equals(test5));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33893);assertEquals(false, test3.equals(test5));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33894);assertEquals(true, test5.equals(test1));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33895);assertEquals(true, test5.equals(test2));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33896);assertEquals(false, test5.equals(test3));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33897);assertEquals(true, test1.hashCode() == test5.hashCode());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33898);assertEquals(true, test2.hashCode() == test5.hashCode());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33899);assertEquals(false, test3.hashCode() == test5.hashCode());

        __CLR4_4_1pwmpwmlgchorvt.R.inc(33900);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33901);assertEquals(true, test1.equals(new MockInterval()));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33902);assertEquals(false, test1.equals(new DateTime(TEST_TIME1)));
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    class MockInterval extends AbstractInterval {
        public MockInterval() {
            super();__CLR4_4_1pwmpwmlgchorvt.R.inc(33904);try{__CLR4_4_1pwmpwmlgchorvt.R.inc(33903);
        }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

        public Chronology getChronology() {try{__CLR4_4_1pwmpwmlgchorvt.R.inc(33905);
            __CLR4_4_1pwmpwmlgchorvt.R.inc(33906);return ISOChronology.getInstance();
        }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

        public long getStartMillis() {try{__CLR4_4_1pwmpwmlgchorvt.R.inc(33907);
            __CLR4_4_1pwmpwmlgchorvt.R.inc(33908);return TEST_TIME1;
        }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

        public long getEndMillis() {try{__CLR4_4_1pwmpwmlgchorvt.R.inc(33909);
            __CLR4_4_1pwmpwmlgchorvt.R.inc(33910);return TEST_TIME2;
        }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}
    }

    @Test
    public void testEqualsHashCodeLenient() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),33911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zr7n2q5z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testEqualsHashCodeLenient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zr7n2q5z(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(33911);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33912);Interval test1 = new Interval(
                new DateTime(TEST_TIME1, LenientChronology.getInstance(COPTIC_PARIS)),
                new DateTime(TEST_TIME2, LenientChronology.getInstance(COPTIC_PARIS)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33913);Interval test2 = new Interval(
                new DateTime(TEST_TIME1, LenientChronology.getInstance(COPTIC_PARIS)),
                new DateTime(TEST_TIME2, LenientChronology.getInstance(COPTIC_PARIS)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33914);assertEquals(true, test1.equals(test2));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33915);assertEquals(true, test2.equals(test1));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33916);assertEquals(true, test1.equals(test1));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33917);assertEquals(true, test2.equals(test2));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33918);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33919);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33920);assertEquals(true, test2.hashCode() == test2.hashCode());
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testEqualsHashCodeStrict() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),33921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b60798q69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testEqualsHashCodeStrict",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b60798q69(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(33921);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33922);Interval test1 = new Interval(
                new DateTime(TEST_TIME1, LenientChronology.getInstance(COPTIC_PARIS)),
                new DateTime(TEST_TIME2, LenientChronology.getInstance(COPTIC_PARIS)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33923);Interval test2 = new Interval(
                new DateTime(TEST_TIME1, LenientChronology.getInstance(COPTIC_PARIS)),
                new DateTime(TEST_TIME2, LenientChronology.getInstance(COPTIC_PARIS)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33924);assertEquals(true, test1.equals(test2));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33925);assertEquals(true, test2.equals(test1));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33926);assertEquals(true, test1.equals(test1));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33927);assertEquals(true, test2.equals(test2));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33928);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33929);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33930);assertEquals(true, test2.hashCode() == test2.hashCode());
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_useCase_ContainsOverlapAbutGap() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),33931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t5uoraq6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.test_useCase_ContainsOverlapAbutGap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33931,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t5uoraq6j(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(33931);
        // this is a simple test to ensure that the use case of these methods is OK
        // when comparing any two intervals they can be in one and only one of these states
        // (a) have a gap between them, (b) abut or (c) overlap
        // contains is a subset of overlap
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33932);Interval test1020 = new Interval(10, 20);

        // [4,8) [10,20) - gap
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33933);Interval interval = new Interval(4, 8);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33934);assertNotNull(test1020.gap(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33935);assertEquals(false, test1020.abuts(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33936);assertEquals(false, test1020.overlaps(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33937);assertEquals(false, test1020.contains(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33938);assertNotNull(interval.gap(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33939);assertEquals(false, interval.abuts(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33940);assertEquals(false, interval.overlaps(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33941);assertEquals(false, interval.contains(test1020));

        // [6,10) [10,20) - abuts
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33942);interval = new Interval(6, 10);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33943);assertNull(test1020.gap(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33944);assertEquals(true, test1020.abuts(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33945);assertEquals(false, test1020.overlaps(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33946);assertEquals(false, test1020.contains(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33947);assertNull(interval.gap(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33948);assertEquals(true, interval.abuts(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33949);assertEquals(false, interval.overlaps(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33950);assertEquals(false, interval.contains(test1020));

        // [8,12) [10,20) - overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33951);interval = new Interval(8, 12);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33952);assertNull(test1020.gap(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33953);assertEquals(false, test1020.abuts(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33954);assertEquals(true, test1020.overlaps(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33955);assertEquals(false, test1020.contains(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33956);assertNull(interval.gap(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33957);assertEquals(false, interval.abuts(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33958);assertEquals(true, interval.overlaps(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33959);assertEquals(false, interval.contains(test1020));

        // [10,14) [10,20) - overlaps and contains-one-way
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33960);interval = new Interval(10, 14);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33961);assertNull(test1020.gap(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33962);assertEquals(false, test1020.abuts(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33963);assertEquals(true, test1020.overlaps(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33964);assertEquals(true, test1020.contains(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33965);assertNull(interval.gap(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33966);assertEquals(false, interval.abuts(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33967);assertEquals(true, interval.overlaps(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33968);assertEquals(false, interval.contains(test1020));

        // [10,20) [10,20) - overlaps and contains-both-ways
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33969);assertNull(test1020.gap(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33970);assertEquals(false, test1020.abuts(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33971);assertEquals(true, test1020.overlaps(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33972);assertEquals(true, test1020.contains(test1020));

        // [10,20) [16,20) - overlaps and contains-one-way
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33973);interval = new Interval(16, 20);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33974);assertNull(test1020.gap(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33975);assertEquals(false, test1020.abuts(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33976);assertEquals(true, test1020.overlaps(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33977);assertEquals(true, test1020.contains(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33978);assertNull(interval.gap(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33979);assertEquals(false, interval.abuts(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33980);assertEquals(true, interval.overlaps(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33981);assertEquals(false, interval.contains(test1020));

        // [10,20) [18,22) - overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33982);interval = new Interval(18, 22);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33983);assertNull(test1020.gap(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33984);assertEquals(false, test1020.abuts(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33985);assertEquals(true, test1020.overlaps(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33986);assertEquals(false, test1020.contains(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33987);assertNull(interval.gap(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33988);assertEquals(false, interval.abuts(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33989);assertEquals(true, interval.overlaps(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33990);assertEquals(false, interval.contains(test1020));

        // [10,20) [20,24) - abuts
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33991);interval = new Interval(20, 24);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33992);assertNull(test1020.gap(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33993);assertEquals(true, test1020.abuts(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33994);assertEquals(false, test1020.overlaps(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33995);assertEquals(false, test1020.contains(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33996);assertNull(interval.gap(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33997);assertEquals(true, interval.abuts(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33998);assertEquals(false, interval.overlaps(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(33999);assertEquals(false, interval.contains(test1020));

        // [10,20) [22,26) - gap
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34000);interval = new Interval(22, 26);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34001);assertNotNull(test1020.gap(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34002);assertEquals(false, test1020.abuts(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34003);assertEquals(false, test1020.overlaps(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34004);assertEquals(false, test1020.contains(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34005);assertNotNull(interval.gap(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34006);assertEquals(false, interval.abuts(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34007);assertEquals(false, interval.overlaps(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34008);assertEquals(false, interval.contains(test1020));
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_useCase_ContainsOverlapAbutGap_zeroDuration() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kxca3jq8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.test_useCase_ContainsOverlapAbutGap_zeroDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34009,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kxca3jq8p(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34009);
        // this is a simple test to ensure that the use case of these methods
        // is OK when considering a zero duration inerval
        // when comparing any two intervals they can be in one and only one of these states
        // (a) have a gap between them, (b) abut or (c) overlap
        // contains is a subset of overlap
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34010);Interval test1020 = new Interval(10, 20);

        // [8,8) [10,20) - gap
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34011);Interval interval = new Interval(8, 8);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34012);assertNotNull(test1020.gap(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34013);assertEquals(false, test1020.abuts(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34014);assertEquals(false, test1020.overlaps(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34015);assertEquals(false, test1020.contains(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34016);assertNotNull(interval.gap(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34017);assertEquals(false, interval.abuts(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34018);assertEquals(false, interval.overlaps(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34019);assertEquals(false, interval.contains(test1020));

        // [10,10) [10,20) - abuts and contains-one-way
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34020);interval = new Interval(10, 10);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34021);assertNull(test1020.gap(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34022);assertEquals(true, test1020.abuts(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34023);assertEquals(false, test1020.overlaps(interval));  // abuts, so can't overlap
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34024);assertEquals(true, test1020.contains(interval));  // normal contains zero-duration
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34025);assertNull(interval.gap(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34026);assertEquals(true, interval.abuts(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34027);assertEquals(false, interval.overlaps(test1020));  // abuts, so can't overlap
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34028);assertEquals(false, interval.contains(test1020));  // zero-duration does not contain normal

        // [12,12) [10,20) - contains-one-way and overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34029);interval = new Interval(12, 12);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34030);assertNull(test1020.gap(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34031);assertEquals(false, test1020.abuts(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34032);assertEquals(true, test1020.overlaps(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34033);assertEquals(true, test1020.contains(interval));  // normal contains zero-duration
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34034);assertNull(interval.gap(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34035);assertEquals(false, interval.abuts(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34036);assertEquals(true, interval.overlaps(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34037);assertEquals(false, interval.contains(test1020));  // zero-duration does not contain normal

        // [10,20) [20,20) - abuts
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34038);interval = new Interval(20, 20);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34039);assertNull(test1020.gap(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34040);assertEquals(true, test1020.abuts(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34041);assertEquals(false, test1020.overlaps(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34042);assertEquals(false, test1020.contains(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34043);assertNull(interval.gap(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34044);assertEquals(true, interval.abuts(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34045);assertEquals(false, interval.overlaps(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34046);assertEquals(false, interval.contains(test1020));

        // [10,20) [22,22) - gap
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34047);interval = new Interval(22, 22);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34048);assertNotNull(test1020.gap(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34049);assertEquals(false, test1020.abuts(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34050);assertEquals(false, test1020.overlaps(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34051);assertEquals(false, test1020.contains(interval));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34052);assertNotNull(interval.gap(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34053);assertEquals(false, interval.abuts(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34054);assertEquals(false, interval.overlaps(test1020));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34055);assertEquals(false, interval.contains(test1020));
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_useCase_ContainsOverlapAbutGap_bothZeroDuration() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1du6o80qa0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.test_useCase_ContainsOverlapAbutGap_bothZeroDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1du6o80qa0(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34056);
        // this is a simple test to ensure that the use case of these methods
        // is OK when considering two zero duration inervals
        // this is the simplest case, as the two intervals either have a gap or not
        // if not, then they are equal and abut
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34057);Interval test0808 = new Interval(8, 8);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34058);Interval test1010 = new Interval(10, 10);

        // [8,8) [10,10) - gap
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34059);assertNotNull(test1010.gap(test0808));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34060);assertEquals(false, test1010.abuts(test0808));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34061);assertEquals(false, test1010.overlaps(test0808));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34062);assertEquals(false, test1010.contains(test0808));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34063);assertNotNull(test0808.gap(test1010));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34064);assertEquals(false, test0808.abuts(test1010));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34065);assertEquals(false, test0808.overlaps(test1010));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34066);assertEquals(false, test0808.contains(test1010));

        // [10,10) [10,10) - abuts
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34067);assertNull(test1010.gap(test1010));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34068);assertEquals(true, test1010.abuts(test1010));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34069);assertEquals(false, test1010.overlaps(test1010));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34070);assertEquals(false, test1010.contains(test1010));
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testContains_long() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1651dm9qaf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34071,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1651dm9qaf(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34071);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34072);assertEquals(false, interval37.contains(2));  // value before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34073);assertEquals(true, interval37.contains(3));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34074);assertEquals(true, interval37.contains(4));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34075);assertEquals(true, interval37.contains(5));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34076);assertEquals(true, interval37.contains(6));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34077);assertEquals(false, interval37.contains(7));  // value after
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34078);assertEquals(false, interval37.contains(8));  // value after
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testContains_long_zeroDuration() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ql2cfsqan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_long_zeroDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34079,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ql2cfsqan(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34079);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34080);assertEquals(false, interval33.contains(2));  // value before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34081);assertEquals(false, interval33.contains(3));  // zero length duration contains nothing
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34082);assertEquals(false, interval33.contains(4));  // value after
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testContainsNow() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ee80lwqar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContainsNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ee80lwqar(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34083);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34084);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34085);assertEquals(false, interval37.containsNow());  // value before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34086);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34087);assertEquals(true, interval37.containsNow());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34088);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34089);assertEquals(true, interval37.containsNow());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34090);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34091);assertEquals(true, interval37.containsNow());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34092);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34093);assertEquals(false, interval37.containsNow());  // value after
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34094);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34095);assertEquals(false, interval37.containsNow());  // value after

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34096);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34097);assertEquals(false, interval33.containsNow());  // value before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34098);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34099);assertEquals(false, interval33.containsNow());  // zero length duration contains nothing
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34100);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34101);assertEquals(false, interval33.containsNow());  // value after
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testContains_RI() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13g4e8cqba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13g4e8cqba(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34102);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34103);assertEquals(false, interval37.contains(new Instant(2)));  // value before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34104);assertEquals(true, interval37.contains(new Instant(3)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34105);assertEquals(true, interval37.contains(new Instant(4)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34106);assertEquals(true, interval37.contains(new Instant(5)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34107);assertEquals(true, interval37.contains(new Instant(6)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34108);assertEquals(false, interval37.contains(new Instant(7)));  // value after
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34109);assertEquals(false, interval37.contains(new Instant(8)));  // value after
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testContains_RI_null() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fjzolkqbi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RI_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fjzolkqbi(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34110);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34111);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34112);assertEquals(false, interval37.contains((ReadableInstant) null));  // value before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34113);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34114);assertEquals(true, interval37.contains((ReadableInstant) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34115);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34116);assertEquals(true, interval37.contains((ReadableInstant) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34117);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34118);assertEquals(true, interval37.contains((ReadableInstant) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34119);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34120);assertEquals(false, interval37.contains((ReadableInstant) null));  // value after
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34121);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34122);assertEquals(false, interval37.contains((ReadableInstant) null));  // value after
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testContains_RI_zeroDuration() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ujsdq5qbv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RI_zeroDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ujsdq5qbv(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34123);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34124);assertEquals(false, interval33.contains(new Instant(2)));  // value before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34125);assertEquals(false, interval33.contains(new Instant(3)));  // zero length duration contains nothing
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34126);assertEquals(false, interval33.contains(new Instant(4)));  // value after
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testContains_RInterval() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13h7jbkqbz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13h7jbkqbz(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34127);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34128);assertEquals(false, interval37.contains(new Interval(1, 2)));  // gap before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34129);assertEquals(false, interval37.contains(new Interval(2, 2)));  // gap before

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34130);assertEquals(false, interval37.contains(new Interval(2, 3)));  // abuts before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34131);assertEquals(true, interval37.contains(new Interval(3, 3)));

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34132);assertEquals(false, interval37.contains(new Interval(2, 4)));  // starts before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34133);assertEquals(true, interval37.contains(new Interval(3, 4)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34134);assertEquals(true, interval37.contains(new Interval(4, 4)));

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34135);assertEquals(false, interval37.contains(new Interval(2, 6)));  // starts before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34136);assertEquals(true, interval37.contains(new Interval(3, 6)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34137);assertEquals(true, interval37.contains(new Interval(4, 6)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34138);assertEquals(true, interval37.contains(new Interval(5, 6)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34139);assertEquals(true, interval37.contains(new Interval(6, 6)));

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34140);assertEquals(false, interval37.contains(new Interval(2, 7)));  // starts before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34141);assertEquals(true, interval37.contains(new Interval(3, 7)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34142);assertEquals(true, interval37.contains(new Interval(4, 7)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34143);assertEquals(true, interval37.contains(new Interval(5, 7)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34144);assertEquals(true, interval37.contains(new Interval(6, 7)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34145);assertEquals(false, interval37.contains(new Interval(7, 7)));  // abuts after

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34146);assertEquals(false, interval37.contains(new Interval(2, 8)));  // ends after
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34147);assertEquals(false, interval37.contains(new Interval(3, 8)));  // ends after
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34148);assertEquals(false, interval37.contains(new Interval(4, 8)));  // ends after
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34149);assertEquals(false, interval37.contains(new Interval(5, 8)));  // ends after
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34150);assertEquals(false, interval37.contains(new Interval(6, 8)));  // ends after
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34151);assertEquals(false, interval37.contains(new Interval(7, 8)));  // abuts after
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34152);assertEquals(false, interval37.contains(new Interval(8, 8)));  // gap after

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34153);assertEquals(false, interval37.contains(new Interval(8, 9)));  // gap after
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34154);assertEquals(false, interval37.contains(new Interval(9, 9)));  // gap after
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testContains_RInterval_null() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19jj4bgqcr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RInterval_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19jj4bgqcr(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34155);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34156);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34157);assertEquals(false, interval37.contains((ReadableInterval) null));  // gap before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34158);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34159);assertEquals(true, interval37.contains((ReadableInterval) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34160);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34161);assertEquals(true, interval37.contains((ReadableInterval) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34162);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34163);assertEquals(true, interval37.contains((ReadableInterval) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34164);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34165);assertEquals(false, interval37.contains((ReadableInterval) null));  // abuts after
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34166);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34167);assertEquals(false, interval37.contains((ReadableInterval) null));  // gap after
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testContains_RInterval_zeroDuration() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f9uu8pqd4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RInterval_zeroDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f9uu8pqd4(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34168);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34169);assertEquals(false, interval33.contains(interval33));  // zero length duration contains nothing
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34170);assertEquals(false, interval33.contains(interval37));  // zero-duration cannot contain anything
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34171);assertEquals(true, interval37.contains(interval33));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34172);assertEquals(false, interval33.contains(new Interval(1, 2)));  // zero-duration cannot contain anything
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34173);assertEquals(false, interval33.contains(new Interval(8, 9)));  // zero-duration cannot contain anything
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34174);assertEquals(false, interval33.contains(new Interval(1, 9)));  // zero-duration cannot contain anything

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34175);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34176);assertEquals(false, interval33.contains((ReadableInterval) null));  // gap before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34177);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34178);assertEquals(false, interval33.contains((ReadableInterval) null));  // zero length duration contains nothing
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34179);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34180);assertEquals(false, interval33.contains((ReadableInterval) null));  // gap after
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testOverlaps_RInterval() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hyewlfqdh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testOverlaps_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34181,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hyewlfqdh(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34181);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34182);assertEquals(false, interval37.overlaps(new Interval(1, 2)));  // gap before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34183);assertEquals(false, interval37.overlaps(new Interval(2, 2)));  // gap before

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34184);assertEquals(false, interval37.overlaps(new Interval(2, 3)));  // abuts before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34185);assertEquals(false, interval37.overlaps(new Interval(3, 3)));  // abuts before

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34186);assertEquals(true, interval37.overlaps(new Interval(2, 4)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34187);assertEquals(true, interval37.overlaps(new Interval(3, 4)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34188);assertEquals(true, interval37.overlaps(new Interval(4, 4)));

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34189);assertEquals(true, interval37.overlaps(new Interval(2, 6)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34190);assertEquals(true, interval37.overlaps(new Interval(3, 6)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34191);assertEquals(true, interval37.overlaps(new Interval(4, 6)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34192);assertEquals(true, interval37.overlaps(new Interval(5, 6)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34193);assertEquals(true, interval37.overlaps(new Interval(6, 6)));

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34194);assertEquals(true, interval37.overlaps(new Interval(2, 7)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34195);assertEquals(true, interval37.overlaps(new Interval(3, 7)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34196);assertEquals(true, interval37.overlaps(new Interval(4, 7)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34197);assertEquals(true, interval37.overlaps(new Interval(5, 7)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34198);assertEquals(true, interval37.overlaps(new Interval(6, 7)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34199);assertEquals(false, interval37.overlaps(new Interval(7, 7)));  // abuts after

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34200);assertEquals(true, interval37.overlaps(new Interval(2, 8)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34201);assertEquals(true, interval37.overlaps(new Interval(3, 8)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34202);assertEquals(true, interval37.overlaps(new Interval(4, 8)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34203);assertEquals(true, interval37.overlaps(new Interval(5, 8)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34204);assertEquals(true, interval37.overlaps(new Interval(6, 8)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34205);assertEquals(false, interval37.overlaps(new Interval(7, 8)));  // abuts after
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34206);assertEquals(false, interval37.overlaps(new Interval(8, 8)));  // gap after

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34207);assertEquals(false, interval37.overlaps(new Interval(8, 9)));  // gap after
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34208);assertEquals(false, interval37.overlaps(new Interval(9, 9)));  // gap after
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testOverlaps_RInterval_null() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mbso09qe9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testOverlaps_RInterval_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34209,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mbso09qe9(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34209);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34210);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34211);assertEquals(false, interval37.overlaps((ReadableInterval) null));  // gap before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34212);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34213);assertEquals(false, interval37.overlaps((ReadableInterval) null));  // abuts before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34214);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34215);assertEquals(true, interval37.overlaps((ReadableInterval) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34216);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34217);assertEquals(true, interval37.overlaps((ReadableInterval) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34218);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34219);assertEquals(false, interval37.overlaps((ReadableInterval) null));  // abuts after
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34220);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34221);assertEquals(false, interval37.overlaps((ReadableInterval) null));  // gap after

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34222);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34223);assertEquals(false, interval33.overlaps((ReadableInterval) null));  // abuts before and after
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testOverlaps_RInterval_zeroDuration() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ffu50qeo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testOverlaps_RInterval_zeroDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34224,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ffu50qeo(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34224);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34225);assertEquals(false, interval33.overlaps(interval33));  // abuts before and after
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34226);assertEquals(false, interval33.overlaps(interval37));  // abuts before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34227);assertEquals(false, interval37.overlaps(interval33));  // abuts before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34228);assertEquals(false, interval33.overlaps(new Interval(1, 2)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34229);assertEquals(false, interval33.overlaps(new Interval(8, 9)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34230);assertEquals(true, interval33.overlaps(new Interval(1, 9)));
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testOverlap_RInterval() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nlic1gqev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testOverlap_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nlic1gqev(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34231);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34232);assertEquals(null, interval37.overlap(new Interval(1, 2)));  // gap before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34233);assertEquals(null, interval37.overlap(new Interval(2, 2)));  // gap before

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34234);assertEquals(null, interval37.overlap(new Interval(2, 3)));  // abuts before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34235);assertEquals(null, interval37.overlap(new Interval(3, 3)));  // abuts before

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34236);assertEquals(new Interval(3, 4), interval37.overlap(new Interval(2, 4)));  // truncated start
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34237);assertEquals(new Interval(3, 4), interval37.overlap(new Interval(3, 4)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34238);assertEquals(new Interval(4, 4), interval37.overlap(new Interval(4, 4)));

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34239);assertEquals(new Interval(3, 7), interval37.overlap(new Interval(2, 7)));  // truncated start
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34240);assertEquals(new Interval(3, 7), interval37.overlap(new Interval(3, 7)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34241);assertEquals(new Interval(4, 7), interval37.overlap(new Interval(4, 7)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34242);assertEquals(new Interval(5, 7), interval37.overlap(new Interval(5, 7)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34243);assertEquals(new Interval(6, 7), interval37.overlap(new Interval(6, 7)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34244);assertEquals(null, interval37.overlap(new Interval(7, 7)));  // abuts after

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34245);assertEquals(new Interval(3, 7), interval37.overlap(new Interval(2, 8)));  // truncated start and end
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34246);assertEquals(new Interval(3, 7), interval37.overlap(new Interval(3, 8)));  // truncated end
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34247);assertEquals(new Interval(4, 7), interval37.overlap(new Interval(4, 8)));  // truncated end
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34248);assertEquals(new Interval(5, 7), interval37.overlap(new Interval(5, 8)));  // truncated end
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34249);assertEquals(new Interval(6, 7), interval37.overlap(new Interval(6, 8)));  // truncated end
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34250);assertEquals(null, interval37.overlap(new Interval(7, 8)));  // abuts after
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34251);assertEquals(null, interval37.overlap(new Interval(8, 8)));  // gap after
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testOverlap_RInterval_null() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jfqu3kqfg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testOverlap_RInterval_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jfqu3kqfg(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34252);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34253);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34254);assertEquals(null, interval37.overlap((ReadableInterval) null));  // gap before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34255);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34256);assertEquals(null, interval37.overlap((ReadableInterval) null));  // abuts before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34257);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34258);assertEquals(new Interval(4, 4), interval37.overlap((ReadableInterval) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34259);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34260);assertEquals(new Interval(6, 6), interval37.overlap((ReadableInterval) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34261);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34262);assertEquals(null, interval37.overlap((ReadableInterval) null));  // abuts after
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34263);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34264);assertEquals(null, interval37.overlap((ReadableInterval) null));  // gap after

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34265);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34266);assertEquals(null, interval33.overlap((ReadableInterval) null));  // abuts before and after
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testOverlap_RInterval_zone() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ewfcm3qfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testOverlap_RInterval_zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ewfcm3qfv(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34267);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34268);Interval testA = new Interval(new DateTime(3, LONDON), new DateTime(7, LONDON));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34269);assertEquals(ISOChronology.getInstance(LONDON), testA.getChronology());

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34270);Interval testB = new Interval(new DateTime(4, MOSCOW), new DateTime(8, MOSCOW));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34271);assertEquals(ISOChronology.getInstance(MOSCOW), testB.getChronology());

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34272);Interval resultAB = testA.overlap(testB);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34273);assertEquals(ISOChronology.getInstance(LONDON), resultAB.getChronology());

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34274);Interval resultBA = testB.overlap(testA);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34275);assertEquals(ISOChronology.getInstance(MOSCOW), resultBA.getChronology());
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testOverlap_RInterval_zoneUTC() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1osnz4jqg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testOverlap_RInterval_zoneUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1osnz4jqg4(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34276);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34277);Interval testA = new Interval(new Instant(3), new Instant(7));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34278);assertEquals(ISOChronology.getInstanceUTC(), testA.getChronology());

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34279);Interval testB = new Interval(new Instant(4), new Instant(8));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34280);assertEquals(ISOChronology.getInstanceUTC(), testB.getChronology());

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34281);Interval result = testA.overlap(testB);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34282);assertEquals(ISOChronology.getInstanceUTC(), result.getChronology());
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGap_RInterval() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mq55zxqgb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGap_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34283,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mq55zxqgb(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34283);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34284);assertEquals(new Interval(1, 3), interval37.gap(new Interval(0, 1)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34285);assertEquals(new Interval(1, 3), interval37.gap(new Interval(1, 1)));

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34286);assertEquals(null, interval37.gap(new Interval(2, 3)));  // abuts before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34287);assertEquals(null, interval37.gap(new Interval(3, 3)));  // abuts before

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34288);assertEquals(null, interval37.gap(new Interval(4, 6)));  // overlaps

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34289);assertEquals(null, interval37.gap(new Interval(3, 7)));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34290);assertEquals(null, interval37.gap(new Interval(6, 7)));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34291);assertEquals(null, interval37.gap(new Interval(7, 7)));  // abuts after

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34292);assertEquals(null, interval37.gap(new Interval(6, 8)));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34293);assertEquals(null, interval37.gap(new Interval(7, 8)));  // abuts after
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34294);assertEquals(new Interval(7, 8), interval37.gap(new Interval(8, 8)));

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34295);assertEquals(null, interval37.gap(new Interval(6, 9)));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34296);assertEquals(null, interval37.gap(new Interval(7, 9)));  // abuts after
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34297);assertEquals(new Interval(7, 8), interval37.gap(new Interval(8, 9)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34298);assertEquals(new Interval(7, 9), interval37.gap(new Interval(9, 9)));
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testGap_RInterval_null() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sbyvypqgr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGap_RInterval_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sbyvypqgr(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34299);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34300);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34301);assertEquals(new Interval(2, 3), interval37.gap((ReadableInterval) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34302);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34303);assertEquals(null, interval37.gap((ReadableInterval) null));  // abuts before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34304);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34305);assertEquals(null, interval37.gap((ReadableInterval) null));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34306);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34307);assertEquals(null, interval37.gap((ReadableInterval) null));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34308);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34309);assertEquals(null, interval37.gap((ReadableInterval) null));  // abuts after
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34310);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34311);assertEquals(new Interval(7, 8), interval37.gap((ReadableInterval) null));
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testGap_RInterval_zone() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1607aqyqh4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGap_RInterval_zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34312,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1607aqyqh4(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34312);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34313);Interval testA = new Interval(new DateTime(3, LONDON), new DateTime(7, LONDON));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34314);assertEquals(ISOChronology.getInstance(LONDON), testA.getChronology());

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34315);Interval testB = new Interval(new DateTime(1, MOSCOW), new DateTime(2, MOSCOW));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34316);assertEquals(ISOChronology.getInstance(MOSCOW), testB.getChronology());

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34317);Interval resultAB = testA.gap(testB);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34318);assertEquals(ISOChronology.getInstance(LONDON), resultAB.getChronology());

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34319);Interval resultBA = testB.gap(testA);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34320);assertEquals(ISOChronology.getInstance(MOSCOW), resultBA.getChronology());
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testGap_RInterval_zoneUTC() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nwao9oqhd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGap_RInterval_zoneUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34321,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nwao9oqhd(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34321);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34322);Interval testA = new Interval(new Instant(3), new Instant(7));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34323);assertEquals(ISOChronology.getInstanceUTC(), testA.getChronology());

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34324);Interval testB = new Interval(new Instant(1), new Instant(2));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34325);assertEquals(ISOChronology.getInstanceUTC(), testB.getChronology());

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34326);Interval result = testA.gap(testB);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34327);assertEquals(ISOChronology.getInstanceUTC(), result.getChronology());
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAbuts_RInterval() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ci87a8qhk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testAbuts_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ci87a8qhk(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34328);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34329);assertEquals(false, interval37.abuts(new Interval(1, 2)));  // gap before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34330);assertEquals(false, interval37.abuts(new Interval(2, 2)));  // gap before

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34331);assertEquals(true, interval37.abuts(new Interval(2, 3)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34332);assertEquals(true, interval37.abuts(new Interval(3, 3)));

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34333);assertEquals(false, interval37.abuts(new Interval(2, 4)));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34334);assertEquals(false, interval37.abuts(new Interval(3, 4)));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34335);assertEquals(false, interval37.abuts(new Interval(4, 4)));  // overlaps

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34336);assertEquals(false, interval37.abuts(new Interval(2, 6)));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34337);assertEquals(false, interval37.abuts(new Interval(3, 6)));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34338);assertEquals(false, interval37.abuts(new Interval(4, 6)));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34339);assertEquals(false, interval37.abuts(new Interval(5, 6)));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34340);assertEquals(false, interval37.abuts(new Interval(6, 6)));  // overlaps

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34341);assertEquals(false, interval37.abuts(new Interval(2, 7)));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34342);assertEquals(false, interval37.abuts(new Interval(3, 7)));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34343);assertEquals(false, interval37.abuts(new Interval(4, 7)));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34344);assertEquals(false, interval37.abuts(new Interval(5, 7)));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34345);assertEquals(false, interval37.abuts(new Interval(6, 7)));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34346);assertEquals(true, interval37.abuts(new Interval(7, 7)));

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34347);assertEquals(false, interval37.abuts(new Interval(2, 8)));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34348);assertEquals(false, interval37.abuts(new Interval(3, 8)));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34349);assertEquals(false, interval37.abuts(new Interval(4, 8)));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34350);assertEquals(false, interval37.abuts(new Interval(5, 8)));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34351);assertEquals(false, interval37.abuts(new Interval(6, 8)));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34352);assertEquals(true, interval37.abuts(new Interval(7, 8)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34353);assertEquals(false, interval37.abuts(new Interval(8, 8)));  // gap after

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34354);assertEquals(false, interval37.abuts(new Interval(8, 9)));  // gap after
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34355);assertEquals(false, interval37.abuts(new Interval(9, 9)));  // gap after
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testAbuts_RInterval_null() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l1m824qic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testAbuts_RInterval_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l1m824qic(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34356);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34357);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34358);assertEquals(false, interval37.abuts((ReadableInterval) null));  // gap before
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34359);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34360);assertEquals(true, interval37.abuts((ReadableInterval) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34361);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34362);assertEquals(false, interval37.abuts((ReadableInterval) null));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34363);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34364);assertEquals(false, interval37.abuts((ReadableInterval) null));  // overlaps
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34365);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34366);assertEquals(true, interval37.abuts((ReadableInterval) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34367);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34368);assertEquals(false, interval37.abuts((ReadableInterval) null));  // gap after
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsEqual_RI() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1wuudqip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsEqual_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1wuudqip(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34369);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34370);assertEquals(false, interval37.isEqual(interval33));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34371);assertEquals(true, interval37.isEqual(interval37));
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsBefore_long() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ie6mpzqis();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBefore_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34372,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ie6mpzqis(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34372);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34373);assertEquals(false, interval37.isBefore(2));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34374);assertEquals(false, interval37.isBefore(3));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34375);assertEquals(false, interval37.isBefore(4));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34376);assertEquals(false, interval37.isBefore(5));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34377);assertEquals(false, interval37.isBefore(6));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34378);assertEquals(true, interval37.isBefore(7));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34379);assertEquals(true, interval37.isBefore(8));
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testIsBeforeNow() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nh1we6qj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBeforeNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nh1we6qj0(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34380);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34381);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34382);assertEquals(false, interval37.isBeforeNow());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34383);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34384);assertEquals(false, interval37.isBeforeNow());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34385);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34386);assertEquals(false, interval37.isBeforeNow());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34387);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34388);assertEquals(false, interval37.isBeforeNow());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34389);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34390);assertEquals(true, interval37.isBeforeNow());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34391);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34392);assertEquals(true, interval37.isBeforeNow());
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testIsBefore_RI() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15mphjyqjd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBefore_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34393,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15mphjyqjd(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34393);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34394);assertEquals(false, interval37.isBefore(new Instant(2)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34395);assertEquals(false, interval37.isBefore(new Instant(3)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34396);assertEquals(false, interval37.isBefore(new Instant(4)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34397);assertEquals(false, interval37.isBefore(new Instant(5)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34398);assertEquals(false, interval37.isBefore(new Instant(6)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34399);assertEquals(true, interval37.isBefore(new Instant(7)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34400);assertEquals(true, interval37.isBefore(new Instant(8)));
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testIsBefore_RI_null() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mt218uqjl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBefore_RI_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mt218uqjl(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34401);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34402);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34403);assertEquals(false, interval37.isBefore((ReadableInstant) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34404);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34405);assertEquals(false, interval37.isBefore((ReadableInstant) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34406);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34407);assertEquals(false, interval37.isBefore((ReadableInstant) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34408);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34409);assertEquals(false, interval37.isBefore((ReadableInstant) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34410);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34411);assertEquals(true, interval37.isBefore((ReadableInstant) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34412);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34413);assertEquals(true, interval37.isBefore((ReadableInstant) null));
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testIsBefore_RInterval() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14qlycmqjy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBefore_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14qlycmqjy(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34414);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34415);assertEquals(false, interval37.isBefore(new Interval(Long.MIN_VALUE, 2)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34416);assertEquals(false, interval37.isBefore(new Interval(Long.MIN_VALUE, 3)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34417);assertEquals(false, interval37.isBefore(new Interval(Long.MIN_VALUE, 4)));

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34418);assertEquals(false, interval37.isBefore(new Interval(6, Long.MAX_VALUE)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34419);assertEquals(true, interval37.isBefore(new Interval(7, Long.MAX_VALUE)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34420);assertEquals(true, interval37.isBefore(new Interval(8, Long.MAX_VALUE)));
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testIsBefore_RInterval_null() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12mij3uqk5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBefore_RInterval_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12mij3uqk5(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34421);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34422);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34423);assertEquals(false, interval37.isBefore((ReadableInterval) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34424);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34425);assertEquals(false, interval37.isBefore((ReadableInterval) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34426);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34427);assertEquals(false, interval37.isBefore((ReadableInterval) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34428);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34429);assertEquals(false, interval37.isBefore((ReadableInterval) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34430);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34431);assertEquals(true, interval37.isBefore((ReadableInterval) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34432);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34433);assertEquals(true, interval37.isBefore((ReadableInterval) null));
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsAfter_long() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ehltpaqki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34434,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ehltpaqki(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34434);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34435);assertEquals(true, interval37.isAfter(2));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34436);assertEquals(false, interval37.isAfter(3));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34437);assertEquals(false, interval37.isAfter(4));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34438);assertEquals(false, interval37.isAfter(5));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34439);assertEquals(false, interval37.isAfter(6));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34440);assertEquals(false, interval37.isAfter(7));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34441);assertEquals(false, interval37.isAfter(8));
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testIsAfterNow() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15bglzxqkq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfterNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15bglzxqkq(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34442);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34443);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34444);assertEquals(true, interval37.isAfterNow());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34445);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34446);assertEquals(false, interval37.isAfterNow());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34447);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34448);assertEquals(false, interval37.isAfterNow());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34449);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34450);assertEquals(false, interval37.isAfterNow());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34451);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34452);assertEquals(false, interval37.isAfterNow());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34453);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34454);assertEquals(false, interval37.isAfterNow());
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testIsAfter_RI() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n5t0u5ql3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n5t0u5ql3(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34455);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34456);assertEquals(true, interval37.isAfter(new Instant(2)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34457);assertEquals(false, interval37.isAfter(new Instant(3)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34458);assertEquals(false, interval37.isAfter(new Instant(4)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34459);assertEquals(false, interval37.isAfter(new Instant(5)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34460);assertEquals(false, interval37.isAfter(new Instant(6)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34461);assertEquals(false, interval37.isAfter(new Instant(7)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34462);assertEquals(false, interval37.isAfter(new Instant(8)));
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testIsAfter_RI_null() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fz3qevqlb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_RI_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fz3qevqlb(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34463);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34464);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34465);assertEquals(true, interval37.isAfter((ReadableInstant) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34466);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34467);assertEquals(false, interval37.isAfter((ReadableInstant) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34468);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34469);assertEquals(false, interval37.isAfter((ReadableInstant) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34470);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34471);assertEquals(false, interval37.isAfter((ReadableInstant) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34472);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34473);assertEquals(false, interval37.isAfter((ReadableInstant) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34474);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34475);assertEquals(false, interval37.isAfter((ReadableInstant) null));
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testIsAfter_RInterval() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q8rfvlqlo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q8rfvlqlo(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34476);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34477);assertEquals(true, interval37.isAfter(new Interval(Long.MIN_VALUE, 2)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34478);assertEquals(true, interval37.isAfter(new Interval(Long.MIN_VALUE, 3)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34479);assertEquals(false, interval37.isAfter(new Interval(Long.MIN_VALUE, 4)));

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34480);assertEquals(false, interval37.isAfter(new Interval(6, Long.MAX_VALUE)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34481);assertEquals(false, interval37.isAfter(new Interval(7, Long.MAX_VALUE)));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34482);assertEquals(false, interval37.isAfter(new Interval(8, Long.MAX_VALUE)));
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testIsAfter_RInterval_null() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116jqs5qlv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_RInterval_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116jqs5qlv(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34483);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34484);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34485);assertEquals(true, interval37.isAfter((ReadableInterval) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34486);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34487);assertEquals(true, interval37.isAfter((ReadableInterval) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34488);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34489);assertEquals(false, interval37.isAfter((ReadableInterval) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34490);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34491);assertEquals(false, interval37.isAfter((ReadableInterval) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34492);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34493);assertEquals(false, interval37.isAfter((ReadableInterval) null));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34494);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34495);assertEquals(false, interval37.isAfter((ReadableInterval) null));
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToInterval1() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11u3ccmqm8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToInterval1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34496,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11u3ccmqm8(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34496);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34497);Interval test = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34498);Interval result = test.toInterval();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34499);assertSame(test, result);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToMutableInterval1() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukyyfaqmc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToMutableInterval1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukyyfaqmc(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34500);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34501);Interval test = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34502);MutableInterval result = test.toMutableInterval();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34503);assertEquals(test, result);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToPeriod() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cvhk17qmg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34504,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cvhk17qmg(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34504);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34505);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34506);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34507);Interval base = new Interval(dt1, dt2);

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34508);Period test = base.toPeriod();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34509);Period expected = new Period(dt1, dt2, PeriodType.standard());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34510);assertEquals(expected, test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToPeriod_PeriodType1() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iiup2sqmn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToPeriod_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iiup2sqmn(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34511);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34512);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34513);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34514);Interval base = new Interval(dt1, dt2);

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34515);Period test = base.toPeriod(null);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34516);Period expected = new Period(dt1, dt2, PeriodType.standard());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34517);assertEquals(expected, test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testToPeriod_PeriodType2() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f9uqabqmu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToPeriod_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f9uqabqmu(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34518);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34519);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34520);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34521);Interval base = new Interval(dt1, dt2);

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34522);Period test = base.toPeriod(PeriodType.yearWeekDayTime());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34523);Period expected = new Period(dt1, dt2, PeriodType.yearWeekDayTime());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34524);assertEquals(expected, test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9qn1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9qn1() throws Exception{try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34525);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34526);Interval test = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34527);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34528);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34529);oos.writeObject(test);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34530);oos.close();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34531);byte[] bytes = baos.toByteArray();

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34532);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34533);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34534);Interval result = (Interval) ois.readObject();
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34535);ois.close();

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34536);assertEquals(test, result);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidqnd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34537,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidqnd(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34537);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34538);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, DateTimeZone.UTC);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34539);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, DateTimeZone.UTC);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34540);Interval test = new Interval(dt1, dt2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34541);assertEquals("2004-06-09T07:08:09.010Z/2005-08-13T12:14:16.018Z", test.toString());
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testToString_reparse() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ulq55yqni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToString_reparse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ulq55yqni(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34542);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34543);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, DateTimeZone.getDefault());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34544);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, DateTimeZone.getDefault());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34545);Interval test = new Interval(dt1, dt2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34546);assertEquals(test, new Interval(test.toString()));
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithChronology1() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gm8rsqnn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithChronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gm8rsqnn(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34547);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34548);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34549);Interval test = base.withChronology(BuddhistChronology.getInstance());
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34550);assertEquals(new Interval(TEST_TIME1, TEST_TIME2, BuddhistChronology.getInstance()), test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testWithChronology2() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18pm7k9qnr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithChronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18pm7k9qnr(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34551);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34552);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34553);Interval test = base.withChronology(null);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34554);assertEquals(new Interval(TEST_TIME1, TEST_TIME2, ISOChronology.getInstance()), test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testWithChronology3() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bym6cqqnv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithChronology3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bym6cqqnv(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34555);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34556);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34557);Interval test = base.withChronology(COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34558);assertSame(base, test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithStartMillis_long1() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kjz5ozqnz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartMillis_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kjz5ozqnz(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34559);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34560);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34561);Interval test = base.withStartMillis(TEST_TIME1 - 1);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34562);assertEquals(new Interval(TEST_TIME1 - 1, TEST_TIME2, COPTIC_PARIS), test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testWithStartMillis_long2() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1haz6wiqo3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartMillis_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34563,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1haz6wiqo3(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34563);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34564);Interval test = new Interval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34565);try {
            __CLR4_4_1pwmpwmlgchorvt.R.inc(34566);test.withStartMillis(TEST_TIME2 + 1);
            __CLR4_4_1pwmpwmlgchorvt.R.inc(34567);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testWithStartMillis_long3() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e1z841qo8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartMillis_long3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34568,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e1z841qo8(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34568);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34569);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34570);Interval test = base.withStartMillis(TEST_TIME1);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34571);assertSame(base, test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithStartInstant_RI1() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxvvdzqoc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartInstant_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34572,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxvvdzqoc(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34572);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34573);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34574);Interval test = base.withStart(new Instant(TEST_TIME1 - 1));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34575);assertEquals(new Interval(TEST_TIME1 - 1, TEST_TIME2, COPTIC_PARIS), test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testWithStartInstant_RI2() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tovwliqog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartInstant_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tovwliqog(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34576);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34577);Interval test = new Interval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34578);try {
            __CLR4_4_1pwmpwmlgchorvt.R.inc(34579);test.withStart(new Instant(TEST_TIME2 + 1));
            __CLR4_4_1pwmpwmlgchorvt.R.inc(34580);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testWithStartInstant_RI3() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qfvxt1qol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartInstant_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qfvxt1qol(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34581);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34582);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34583);Interval test = base.withStart(null);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34584);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS), test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithEndMillis_long1() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_136m6vaqop();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndMillis_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34585,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_136m6vaqop(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34585);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34586);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34587);Interval test = base.withEndMillis(TEST_TIME2 - 1);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34588);assertEquals(new Interval(TEST_TIME1, TEST_TIME2 - 1, COPTIC_PARIS), test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testWithEndMillis_long2() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16fm5nrqot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndMillis_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34589,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16fm5nrqot(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34589);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34590);Interval test = new Interval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34591);try {
            __CLR4_4_1pwmpwmlgchorvt.R.inc(34592);test.withEndMillis(TEST_TIME1 - 1);
            __CLR4_4_1pwmpwmlgchorvt.R.inc(34593);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testWithEndMillis_long3() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19om4g8qoy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndMillis_long3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19om4g8qoy(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34594);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34595);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34596);Interval test = base.withEndMillis(TEST_TIME2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34597);assertSame(base, test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithEndInstant_RI1() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pausgwqp2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndInstant_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pausgwqp2(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34598);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34599);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34600);Interval test = base.withEnd(new Instant(TEST_TIME2 - 1));
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34601);assertEquals(new Interval(TEST_TIME1, TEST_TIME2 - 1, COPTIC_PARIS), test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testWithEndInstant_RI2() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1utofqp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndInstant_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1utofqp6(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34602);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34603);Interval test = new Interval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34604);try {
            __CLR4_4_1pwmpwmlgchorvt.R.inc(34605);test.withEnd(new Instant(TEST_TIME1 - 1));
            __CLR4_4_1pwmpwmlgchorvt.R.inc(34606);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testWithEndInstant_RI3() {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1isuuvyqpb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndInstant_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34607,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1isuuvyqpb(){try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34607);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34608);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34609);Interval test = base.withEnd(null);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34610);assertEquals(new Interval(TEST_TIME1, TEST_TIME_NOW, COPTIC_PARIS), test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithDurationAfterStart1() throws Throwable {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xcst5yqpf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationAfterStart1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34611,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xcst5yqpf() throws Throwable{try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34611);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34612);Duration dur = new Duration(TEST_TIME2 - TEST_TIME_NOW);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34613);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34614);Interval test = base.withDurationAfterStart(dur);

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34615);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS), test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testWithDurationAfterStart2() throws Throwable {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yfba0pqpk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationAfterStart2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34616,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yfba0pqpk() throws Throwable{try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34616);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34617);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34618);Interval test = base.withDurationAfterStart(null);

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34619);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS), test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testWithDurationAfterStart3() throws Throwable {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v6bb88qpo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationAfterStart3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v6bb88qpo() throws Throwable{try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34620);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34621);Duration dur = new Duration(-1);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34622);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34623);try {
            __CLR4_4_1pwmpwmlgchorvt.R.inc(34624);base.withDurationAfterStart(dur);
            __CLR4_4_1pwmpwmlgchorvt.R.inc(34625);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testWithDurationAfterStart4() throws Throwable {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rxbcfrqpu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationAfterStart4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rxbcfrqpu() throws Throwable{try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34626);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34627);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34628);Interval test = base.withDurationAfterStart(base.toDuration());

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34629);assertSame(base, test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithDurationBeforeEnd1() throws Throwable {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14yew8oqpy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationBeforeEnd1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14yew8oqpy() throws Throwable{try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34630);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34631);Duration dur = new Duration(TEST_TIME_NOW - TEST_TIME1);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34632);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34633);Interval test = base.withDurationBeforeEnd(dur);

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34634);assertEquals(new Interval(TEST_TIME1, TEST_TIME_NOW, COPTIC_PARIS), test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testWithDurationBeforeEnd2() throws Throwable {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11pexg7qq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationBeforeEnd2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11pexg7qq3() throws Throwable{try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34635);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34636);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34637);Interval test = base.withDurationBeforeEnd(null);

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34638);assertEquals(new Interval(TEST_TIME2, TEST_TIME2, COPTIC_PARIS), test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testWithDurationBeforeEnd3() throws Throwable {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11jl1caqq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationBeforeEnd3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11jl1caqq7() throws Throwable{try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34639);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34640);Duration dur = new Duration(-1);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34641);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34642);try {
            __CLR4_4_1pwmpwmlgchorvt.R.inc(34643);base.withDurationBeforeEnd(dur);
            __CLR4_4_1pwmpwmlgchorvt.R.inc(34644);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testWithDurationBeforeEnd4() throws Throwable {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14sl04rqqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationBeforeEnd4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34645,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14sl04rqqd() throws Throwable{try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34645);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34646);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34647);Interval test = base.withDurationBeforeEnd(base.toDuration());

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34648);assertSame(base, test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithPeriodAfterStart1() throws Throwable {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qlqc55qqh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodAfterStart1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qlqc55qqh() throws Throwable{try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34649);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34650);DateTime dt = new DateTime(TEST_TIME_NOW, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34651);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34652);Interval base = new Interval(dt, dt);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34653);Interval test = base.withPeriodAfterStart(dur);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34654);assertEquals(new Interval(dt, dur), test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testWithPeriodAfterStart2() throws Throwable {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tuqaxmqqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodAfterStart2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tuqaxmqqn() throws Throwable{try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34655);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34656);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34657);Interval test = base.withPeriodAfterStart(null);

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34658);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS), test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testWithPeriodAfterStart3() throws Throwable {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x3q9q3qqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodAfterStart3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x3q9q3qqr() throws Throwable{try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34659);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34660);Period per = new Period(0, 0, 0, 0, 0, 0, 0, -1);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34661);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34662);try {
            __CLR4_4_1pwmpwmlgchorvt.R.inc(34663);base.withPeriodAfterStart(per);
            __CLR4_4_1pwmpwmlgchorvt.R.inc(34664);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithPeriodBeforeEnd1() throws Throwable {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av5ok5qqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodBeforeEnd1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av5ok5qqx() throws Throwable{try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34665);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34666);DateTime dt = new DateTime(TEST_TIME_NOW, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34667);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34668);Interval base = new Interval(dt, dt);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34669);Interval test = base.withPeriodBeforeEnd(dur);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34670);assertEquals(new Interval(dur, dt), test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testWithPeriodBeforeEnd2() throws Throwable {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e45ncmqr3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodBeforeEnd2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34671,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e45ncmqr3() throws Throwable{try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34671);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34672);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34673);Interval test = base.withPeriodBeforeEnd(null);

        __CLR4_4_1pwmpwmlgchorvt.R.inc(34674);assertEquals(new Interval(TEST_TIME2, TEST_TIME2, COPTIC_PARIS), test);
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

    @Test
    public void testWithPeriodBeforeEnd3() throws Throwable {__CLR4_4_1pwmpwmlgchorvt.R.globalSliceStart(getClass().getName(),34675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hd5m53qr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pwmpwmlgchorvt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pwmpwmlgchorvt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodBeforeEnd3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hd5m53qr7() throws Throwable{try{__CLR4_4_1pwmpwmlgchorvt.R.inc(34675);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34676);Period per = new Period(0, 0, 0, 0, 0, 0, 0, -1);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34677);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW);
        __CLR4_4_1pwmpwmlgchorvt.R.inc(34678);try {
            __CLR4_4_1pwmpwmlgchorvt.R.inc(34679);base.withPeriodBeforeEnd(per);
            __CLR4_4_1pwmpwmlgchorvt.R.inc(34680);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1pwmpwmlgchorvt.R.flushNeeded();}}

}
