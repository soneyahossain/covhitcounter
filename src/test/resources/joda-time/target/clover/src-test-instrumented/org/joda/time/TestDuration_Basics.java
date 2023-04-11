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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.base.AbstractDuration;
import org.joda.time.base.BaseDuration;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestDuration_Basics {static class __CLR4_4_1obwobwlgchorsz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,32236,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

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

    public static void main(String[] args) throws Throwable {try{__CLR4_4_1obwobwlgchorsz.R.inc(31532);
        __CLR4_4_1obwobwlgchorsz.R.inc(31533);TestDuration_Basics TB = new TestDuration_Basics();
        __CLR4_4_1obwobwlgchorsz.R.inc(31534);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31535);TB.testTest();
        __CLR4_4_1obwobwlgchorsz.R.inc(31536);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31537);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31538);TB.testGetMillis();
        __CLR4_4_1obwobwlgchorsz.R.inc(31539);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31540);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31541);TB.testEqualsHashCode();
        __CLR4_4_1obwobwlgchorsz.R.inc(31542);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31543);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31544);TB.testCompareTo();
        __CLR4_4_1obwobwlgchorsz.R.inc(31545);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31546);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31547);TB.testIsEqual();
        __CLR4_4_1obwobwlgchorsz.R.inc(31548);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31549);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31550);TB.testIsBefore();
        __CLR4_4_1obwobwlgchorsz.R.inc(31551);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31552);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31553);TB.testIsAfter();
        __CLR4_4_1obwobwlgchorsz.R.inc(31554);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31555);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31556);TB.testSerialization();
        __CLR4_4_1obwobwlgchorsz.R.inc(31557);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31558);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31559);TB.testGetStandardSeconds();
        __CLR4_4_1obwobwlgchorsz.R.inc(31560);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31561);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31562);TB.testToString();
        __CLR4_4_1obwobwlgchorsz.R.inc(31563);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31564);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31565);TB.testToDuration1();
        __CLR4_4_1obwobwlgchorsz.R.inc(31566);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31567);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31568);TB.testToDuration2();
        __CLR4_4_1obwobwlgchorsz.R.inc(31569);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31570);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31571);TB.testToStandardDays();
        __CLR4_4_1obwobwlgchorsz.R.inc(31572);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31573);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31574);TB.testToStandardDays_overflow();
        __CLR4_4_1obwobwlgchorsz.R.inc(31575);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31576);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31577);TB.testToStandardHours();
        __CLR4_4_1obwobwlgchorsz.R.inc(31578);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31579);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31580);TB.testToStandardHours_overflow();
        __CLR4_4_1obwobwlgchorsz.R.inc(31581);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31582);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31583);TB.testToStandardMinutes();
        __CLR4_4_1obwobwlgchorsz.R.inc(31584);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31585);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31586);TB.testToStandardMinutes_overflow();
        __CLR4_4_1obwobwlgchorsz.R.inc(31587);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31588);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31589);TB.testToStandardSeconds();
        __CLR4_4_1obwobwlgchorsz.R.inc(31590);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31591);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31592);TB.testToStandardSeconds_overflow();
        __CLR4_4_1obwobwlgchorsz.R.inc(31593);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31594);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31595);TB.testToPeriod();
        __CLR4_4_1obwobwlgchorsz.R.inc(31596);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31597);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31598);TB.testToPeriod_fixedZone();
        __CLR4_4_1obwobwlgchorsz.R.inc(31599);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31600);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31601);TB.testToPeriod_PeriodType();
        __CLR4_4_1obwobwlgchorsz.R.inc(31602);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31603);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31604);TB.testToPeriod_Chronology();
        __CLR4_4_1obwobwlgchorsz.R.inc(31605);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31606);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31607);TB.testToPeriod_PeriodType_Chronology();
        __CLR4_4_1obwobwlgchorsz.R.inc(31608);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31609);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31610);TB.testToPeriodFrom();
        __CLR4_4_1obwobwlgchorsz.R.inc(31611);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31612);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31613);TB.testToPeriodFrom_PeriodType();
        __CLR4_4_1obwobwlgchorsz.R.inc(31614);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31615);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31616);TB.testToPeriodTo();
        __CLR4_4_1obwobwlgchorsz.R.inc(31617);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31618);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31619);TB.testToPeriodTo_PeriodType();
        __CLR4_4_1obwobwlgchorsz.R.inc(31620);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31621);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31622);TB.testToIntervalFrom();
        __CLR4_4_1obwobwlgchorsz.R.inc(31623);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31624);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31625);TB.testToIntervalTo();
        __CLR4_4_1obwobwlgchorsz.R.inc(31626);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31627);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31628);TB.testWithMillis1();
        __CLR4_4_1obwobwlgchorsz.R.inc(31629);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31630);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31631);TB.testWithMillis2();
        __CLR4_4_1obwobwlgchorsz.R.inc(31632);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31633);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31634);TB.testWithDurationAdded_long_int1();
        __CLR4_4_1obwobwlgchorsz.R.inc(31635);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31636);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31637);TB.testWithDurationAdded_long_int2();
        __CLR4_4_1obwobwlgchorsz.R.inc(31638);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31639);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31640);TB.testWithDurationAdded_long_int3();
        __CLR4_4_1obwobwlgchorsz.R.inc(31641);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31642);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31643);TB.testWithDurationAdded_long_int4();
        __CLR4_4_1obwobwlgchorsz.R.inc(31644);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31645);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31646);TB.testWithDurationAdded_long_int5();
        __CLR4_4_1obwobwlgchorsz.R.inc(31647);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31648);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31649);TB.testPlus_long1();
        __CLR4_4_1obwobwlgchorsz.R.inc(31650);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31651);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31652);TB.testPlus_long2();
        __CLR4_4_1obwobwlgchorsz.R.inc(31653);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31654);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31655);TB.testMinus_long1();
        __CLR4_4_1obwobwlgchorsz.R.inc(31656);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31657);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31658);TB.testMinus_long2();
        __CLR4_4_1obwobwlgchorsz.R.inc(31659);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31660);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31661);TB.testMultipliedBy_long1();
        __CLR4_4_1obwobwlgchorsz.R.inc(31662);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31663);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31664);TB.testMultipliedBy_long2();
        __CLR4_4_1obwobwlgchorsz.R.inc(31665);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31666);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31667);TB.testDividedBy_long1();
        __CLR4_4_1obwobwlgchorsz.R.inc(31668);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31669);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31670);TB.testDividedBy_long2();
        __CLR4_4_1obwobwlgchorsz.R.inc(31671);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31672);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31673);TB.testDividedByRoundingMode_long1();
        __CLR4_4_1obwobwlgchorsz.R.inc(31674);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31675);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31676);TB.testDividedByRoundingMode_long2();
        __CLR4_4_1obwobwlgchorsz.R.inc(31677);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31678);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31679);TB.testDividedByRoundingMode_long3();
        __CLR4_4_1obwobwlgchorsz.R.inc(31680);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31681);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31682);TB.testDividedByRoundingMode_long4();
        __CLR4_4_1obwobwlgchorsz.R.inc(31683);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31684);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31685);TB.testNegated_long1();
        __CLR4_4_1obwobwlgchorsz.R.inc(31686);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31687);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31688);TB.testNegated_long2();
        __CLR4_4_1obwobwlgchorsz.R.inc(31689);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31690);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31691);TB.testNegated_long3();
        __CLR4_4_1obwobwlgchorsz.R.inc(31692);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31693);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31694);TB.testAbs();
        __CLR4_4_1obwobwlgchorsz.R.inc(31695);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31696);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31697);TB.testWithDurationAdded_RD_int1();
        __CLR4_4_1obwobwlgchorsz.R.inc(31698);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31699);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31700);TB.testWithDurationAdded_RD_int2();
        __CLR4_4_1obwobwlgchorsz.R.inc(31701);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31702);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31703);TB.testWithDurationAdded_RD_int3();
        __CLR4_4_1obwobwlgchorsz.R.inc(31704);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31705);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31706);TB.testWithDurationAdded_RD_int4();
        __CLR4_4_1obwobwlgchorsz.R.inc(31707);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31708);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31709);TB.testWithDurationAdded_RD_int5();
        __CLR4_4_1obwobwlgchorsz.R.inc(31710);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31711);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31712);TB.testWithDurationAdded_RD_int6();
        __CLR4_4_1obwobwlgchorsz.R.inc(31713);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31714);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31715);TB.testPlus_RD1();
        __CLR4_4_1obwobwlgchorsz.R.inc(31716);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31717);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31718);TB.testPlus_RD2();
        __CLR4_4_1obwobwlgchorsz.R.inc(31719);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31720);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31721);TB.testPlus_RD3();
        __CLR4_4_1obwobwlgchorsz.R.inc(31722);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31723);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31724);TB.testMinus_RD1();
        __CLR4_4_1obwobwlgchorsz.R.inc(31725);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31726);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31727);TB.testMinus_RD2();
        __CLR4_4_1obwobwlgchorsz.R.inc(31728);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31729);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31730);TB.testMinus_RD3();
        __CLR4_4_1obwobwlgchorsz.R.inc(31731);TB.tearDown();
        __CLR4_4_1obwobwlgchorsz.R.inc(31732);TB.setUp();
        __CLR4_4_1obwobwlgchorsz.R.inc(31733);TB.testMutableDuration();
        __CLR4_4_1obwobwlgchorsz.R.inc(31734);TB.tearDown();

    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestDuration_Basics.class);
    }

    public TestDuration_Basics(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1obwobwlgchorsz.R.inc(31735);
        __CLR4_4_1obwobwlgchorsz.R.inc(31736);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1obwobwlgchorsz.R.inc(31737);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1obwobwlgchorsz.R.inc(31738);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1obwobwlgchorsz.R.inc(31739);originalLocale = Locale.getDefault();
        __CLR4_4_1obwobwlgchorsz.R.inc(31740);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1obwobwlgchorsz.R.inc(31741);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1obwobwlgchorsz.R.inc(31742);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1obwobwlgchorsz.R.inc(31743);
        __CLR4_4_1obwobwlgchorsz.R.inc(31744);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1obwobwlgchorsz.R.inc(31745);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1obwobwlgchorsz.R.inc(31746);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1obwobwlgchorsz.R.inc(31747);Locale.setDefault(originalLocale);
        __CLR4_4_1obwobwlgchorsz.R.inc(31748);originalDateTimeZone = null;
        __CLR4_4_1obwobwlgchorsz.R.inc(31749);originalTimeZone = null;
        __CLR4_4_1obwobwlgchorsz.R.inc(31750);originalLocale = null;
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),31751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjohz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjohz(){try{__CLR4_4_1obwobwlgchorsz.R.inc(31751);
        __CLR4_4_1obwobwlgchorsz.R.inc(31752);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1obwobwlgchorsz.R.inc(31753);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1obwobwlgchorsz.R.inc(31754);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetMillis() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),31755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18msyj5oi3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testGetMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18msyj5oi3(){try{__CLR4_4_1obwobwlgchorsz.R.inc(31755);
        __CLR4_4_1obwobwlgchorsz.R.inc(31756);Duration test = new Duration(0L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31757);assertEquals(0, test.getMillis());

        __CLR4_4_1obwobwlgchorsz.R.inc(31758);test = new Duration(1234567890L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31759);assertEquals(1234567890L, test.getMillis());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testEqualsHashCode() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),31760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77oi8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31760,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77oi8(){try{__CLR4_4_1obwobwlgchorsz.R.inc(31760);
        __CLR4_4_1obwobwlgchorsz.R.inc(31761);Duration test1 = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31762);Duration test2 = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31763);assertEquals(true, test1.equals(test2));
        __CLR4_4_1obwobwlgchorsz.R.inc(31764);assertEquals(true, test2.equals(test1));
        __CLR4_4_1obwobwlgchorsz.R.inc(31765);assertEquals(true, test1.equals(test1));
        __CLR4_4_1obwobwlgchorsz.R.inc(31766);assertEquals(true, test2.equals(test2));
        __CLR4_4_1obwobwlgchorsz.R.inc(31767);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1obwobwlgchorsz.R.inc(31768);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1obwobwlgchorsz.R.inc(31769);assertEquals(true, test2.hashCode() == test2.hashCode());

        __CLR4_4_1obwobwlgchorsz.R.inc(31770);Duration test3 = new Duration(321L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31771);assertEquals(false, test1.equals(test3));
        __CLR4_4_1obwobwlgchorsz.R.inc(31772);assertEquals(false, test2.equals(test3));
        __CLR4_4_1obwobwlgchorsz.R.inc(31773);assertEquals(false, test3.equals(test1));
        __CLR4_4_1obwobwlgchorsz.R.inc(31774);assertEquals(false, test3.equals(test2));
        __CLR4_4_1obwobwlgchorsz.R.inc(31775);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1obwobwlgchorsz.R.inc(31776);assertEquals(false, test2.hashCode() == test3.hashCode());

        __CLR4_4_1obwobwlgchorsz.R.inc(31777);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1obwobwlgchorsz.R.inc(31778);assertEquals(true, test1.equals(new MockDuration(123L)));
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    class MockDuration extends AbstractDuration {
        private final long iValue;

        public MockDuration(long value) {
            super();__CLR4_4_1obwobwlgchorsz.R.inc(31780);try{__CLR4_4_1obwobwlgchorsz.R.inc(31779);
            __CLR4_4_1obwobwlgchorsz.R.inc(31781);iValue = value;
        }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

        public long getMillis() {try{__CLR4_4_1obwobwlgchorsz.R.inc(31782);
            __CLR4_4_1obwobwlgchorsz.R.inc(31783);return iValue;
        }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}
    }

    @Test
    public void testCompareTo() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),31784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfvoiw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfvoiw(){try{__CLR4_4_1obwobwlgchorsz.R.inc(31784);
        __CLR4_4_1obwobwlgchorsz.R.inc(31785);Duration test1 = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31786);Duration test1a = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31787);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_1obwobwlgchorsz.R.inc(31788);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_1obwobwlgchorsz.R.inc(31789);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_1obwobwlgchorsz.R.inc(31790);assertEquals(0, test1a.compareTo(test1a));

        __CLR4_4_1obwobwlgchorsz.R.inc(31791);Duration test2 = new Duration(321L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31792);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_1obwobwlgchorsz.R.inc(31793);assertEquals(+1, test2.compareTo(test1));

        __CLR4_4_1obwobwlgchorsz.R.inc(31794);assertEquals(+1, test2.compareTo(new MockDuration(123L)));
        __CLR4_4_1obwobwlgchorsz.R.inc(31795);assertEquals(0, test1.compareTo(new MockDuration(123L)));

        __CLR4_4_1obwobwlgchorsz.R.inc(31796);try {
            __CLR4_4_1obwobwlgchorsz.R.inc(31797);test1.compareTo(null);
            __CLR4_4_1obwobwlgchorsz.R.inc(31798);fail();
        } catch (NullPointerException ex) {
        }
//        try {
//            test1.compareTo(new Long(123L));
//            fail();
//        } catch (ClassCastException ex) {}
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testIsEqual() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),31799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s9e1z3ojb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testIsEqual",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s9e1z3ojb(){try{__CLR4_4_1obwobwlgchorsz.R.inc(31799);
        __CLR4_4_1obwobwlgchorsz.R.inc(31800);Duration test1 = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31801);Duration test1a = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31802);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_1obwobwlgchorsz.R.inc(31803);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_1obwobwlgchorsz.R.inc(31804);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_1obwobwlgchorsz.R.inc(31805);assertEquals(true, test1a.isEqual(test1a));

        __CLR4_4_1obwobwlgchorsz.R.inc(31806);Duration test2 = new Duration(321L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31807);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_1obwobwlgchorsz.R.inc(31808);assertEquals(false, test2.isEqual(test1));

        __CLR4_4_1obwobwlgchorsz.R.inc(31809);assertEquals(false, test2.isEqual(new MockDuration(123L)));
        __CLR4_4_1obwobwlgchorsz.R.inc(31810);assertEquals(true, test1.isEqual(new MockDuration(123L)));
        __CLR4_4_1obwobwlgchorsz.R.inc(31811);assertEquals(false, test1.isEqual(null));
        __CLR4_4_1obwobwlgchorsz.R.inc(31812);assertEquals(true, new Duration(0L).isEqual(null));
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testIsBefore() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),31813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rmvj2ojp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testIsBefore",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31813,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rmvj2ojp(){try{__CLR4_4_1obwobwlgchorsz.R.inc(31813);
        __CLR4_4_1obwobwlgchorsz.R.inc(31814);Duration test1 = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31815);Duration test1a = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31816);assertEquals(false, test1.isShorterThan(test1a));
        __CLR4_4_1obwobwlgchorsz.R.inc(31817);assertEquals(false, test1a.isShorterThan(test1));
        __CLR4_4_1obwobwlgchorsz.R.inc(31818);assertEquals(false, test1.isShorterThan(test1));
        __CLR4_4_1obwobwlgchorsz.R.inc(31819);assertEquals(false, test1a.isShorterThan(test1a));

        __CLR4_4_1obwobwlgchorsz.R.inc(31820);Duration test2 = new Duration(321L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31821);assertEquals(true, test1.isShorterThan(test2));
        __CLR4_4_1obwobwlgchorsz.R.inc(31822);assertEquals(false, test2.isShorterThan(test1));

        __CLR4_4_1obwobwlgchorsz.R.inc(31823);assertEquals(false, test2.isShorterThan(new MockDuration(123L)));
        __CLR4_4_1obwobwlgchorsz.R.inc(31824);assertEquals(false, test1.isShorterThan(new MockDuration(123L)));
        __CLR4_4_1obwobwlgchorsz.R.inc(31825);assertEquals(false, test1.isShorterThan(null));
        __CLR4_4_1obwobwlgchorsz.R.inc(31826);assertEquals(false, new Duration(0L).isShorterThan(null));
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testIsAfter() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),31827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ax1icnok3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testIsAfter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ax1icnok3(){try{__CLR4_4_1obwobwlgchorsz.R.inc(31827);
        __CLR4_4_1obwobwlgchorsz.R.inc(31828);Duration test1 = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31829);Duration test1a = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31830);assertEquals(false, test1.isLongerThan(test1a));
        __CLR4_4_1obwobwlgchorsz.R.inc(31831);assertEquals(false, test1a.isLongerThan(test1));
        __CLR4_4_1obwobwlgchorsz.R.inc(31832);assertEquals(false, test1.isLongerThan(test1));
        __CLR4_4_1obwobwlgchorsz.R.inc(31833);assertEquals(false, test1a.isLongerThan(test1a));

        __CLR4_4_1obwobwlgchorsz.R.inc(31834);Duration test2 = new Duration(321L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31835);assertEquals(false, test1.isLongerThan(test2));
        __CLR4_4_1obwobwlgchorsz.R.inc(31836);assertEquals(true, test2.isLongerThan(test1));

        __CLR4_4_1obwobwlgchorsz.R.inc(31837);assertEquals(true, test2.isLongerThan(new MockDuration(123L)));
        __CLR4_4_1obwobwlgchorsz.R.inc(31838);assertEquals(false, test1.isLongerThan(new MockDuration(123L)));
        __CLR4_4_1obwobwlgchorsz.R.inc(31839);assertEquals(true, test1.isLongerThan(null));
        __CLR4_4_1obwobwlgchorsz.R.inc(31840);assertEquals(false, new Duration(0L).isLongerThan(null));
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),31841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9okh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31841,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9okh() throws Exception{try{__CLR4_4_1obwobwlgchorsz.R.inc(31841);
        __CLR4_4_1obwobwlgchorsz.R.inc(31842);Duration test = new Duration(123L);

        __CLR4_4_1obwobwlgchorsz.R.inc(31843);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1obwobwlgchorsz.R.inc(31844);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1obwobwlgchorsz.R.inc(31845);oos.writeObject(test);
        __CLR4_4_1obwobwlgchorsz.R.inc(31846);oos.close();
        __CLR4_4_1obwobwlgchorsz.R.inc(31847);byte[] bytes = baos.toByteArray();

        __CLR4_4_1obwobwlgchorsz.R.inc(31848);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1obwobwlgchorsz.R.inc(31849);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1obwobwlgchorsz.R.inc(31850);Duration result = (Duration) ois.readObject();
        __CLR4_4_1obwobwlgchorsz.R.inc(31851);ois.close();

        __CLR4_4_1obwobwlgchorsz.R.inc(31852);assertEquals(test, result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetStandardSeconds() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),31853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xedhmjokt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testGetStandardSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xedhmjokt(){try{__CLR4_4_1obwobwlgchorsz.R.inc(31853);
        __CLR4_4_1obwobwlgchorsz.R.inc(31854);Duration test = new Duration(0L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31855);assertEquals(0, test.getStandardSeconds());
        __CLR4_4_1obwobwlgchorsz.R.inc(31856);test = new Duration(1L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31857);assertEquals(0, test.getStandardSeconds());
        __CLR4_4_1obwobwlgchorsz.R.inc(31858);test = new Duration(999L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31859);assertEquals(0, test.getStandardSeconds());
        __CLR4_4_1obwobwlgchorsz.R.inc(31860);test = new Duration(1000L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31861);assertEquals(1, test.getStandardSeconds());
        __CLR4_4_1obwobwlgchorsz.R.inc(31862);test = new Duration(1001L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31863);assertEquals(1, test.getStandardSeconds());
        __CLR4_4_1obwobwlgchorsz.R.inc(31864);test = new Duration(1999L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31865);assertEquals(1, test.getStandardSeconds());
        __CLR4_4_1obwobwlgchorsz.R.inc(31866);test = new Duration(2000L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31867);assertEquals(2, test.getStandardSeconds());
        __CLR4_4_1obwobwlgchorsz.R.inc(31868);test = new Duration(-1L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31869);assertEquals(0, test.getStandardSeconds());
        __CLR4_4_1obwobwlgchorsz.R.inc(31870);test = new Duration(-999L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31871);assertEquals(0, test.getStandardSeconds());
        __CLR4_4_1obwobwlgchorsz.R.inc(31872);test = new Duration(-1000L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31873);assertEquals(-1, test.getStandardSeconds());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),31874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidole();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidole(){try{__CLR4_4_1obwobwlgchorsz.R.inc(31874);
        __CLR4_4_1obwobwlgchorsz.R.inc(31875);long length = (365L + 2L * 30L + 3L * 7L + 4L) * DateTimeConstants.MILLIS_PER_DAY +
                5L * DateTimeConstants.MILLIS_PER_HOUR +
                6L * DateTimeConstants.MILLIS_PER_MINUTE +
                7L * DateTimeConstants.MILLIS_PER_SECOND + 845L;
        __CLR4_4_1obwobwlgchorsz.R.inc(31876);Duration test = new Duration(length);
        __CLR4_4_1obwobwlgchorsz.R.inc(31877);assertEquals("PT" + (length / 1000) + "." + (length % 1000) + "S", test.toString());

        __CLR4_4_1obwobwlgchorsz.R.inc(31878);assertEquals("PT0S", new Duration(0L).toString());
        __CLR4_4_1obwobwlgchorsz.R.inc(31879);assertEquals("PT10S", new Duration(10000L).toString());
        __CLR4_4_1obwobwlgchorsz.R.inc(31880);assertEquals("PT1S", new Duration(1000L).toString());
        __CLR4_4_1obwobwlgchorsz.R.inc(31881);assertEquals("PT12.345S", new Duration(12345L).toString());
        __CLR4_4_1obwobwlgchorsz.R.inc(31882);assertEquals("PT-12.345S", new Duration(-12345L).toString());
        __CLR4_4_1obwobwlgchorsz.R.inc(31883);assertEquals("PT-1.123S", new Duration(-1123L).toString());
        __CLR4_4_1obwobwlgchorsz.R.inc(31884);assertEquals("PT-0.123S", new Duration(-123L).toString());
        __CLR4_4_1obwobwlgchorsz.R.inc(31885);assertEquals("PT-0.012S", new Duration(-12L).toString());
        __CLR4_4_1obwobwlgchorsz.R.inc(31886);assertEquals("PT-0.001S", new Duration(-1L).toString());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDuration1() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),31887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6q9xlolr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToDuration1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31887,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6q9xlolr(){try{__CLR4_4_1obwobwlgchorsz.R.inc(31887);
        __CLR4_4_1obwobwlgchorsz.R.inc(31888);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31889);Duration result = test.toDuration();
        __CLR4_4_1obwobwlgchorsz.R.inc(31890);assertSame(test, result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testToDuration2() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),31891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pxqb54olv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToDuration2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pxqb54olv(){try{__CLR4_4_1obwobwlgchorsz.R.inc(31891);
        __CLR4_4_1obwobwlgchorsz.R.inc(31892);MockDuration test = new MockDuration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31893);Duration result = test.toDuration();
        __CLR4_4_1obwobwlgchorsz.R.inc(31894);assertNotSame(test, result);
        __CLR4_4_1obwobwlgchorsz.R.inc(31895);assertEquals(test, result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToStandardDays() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),31896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eftdm0om0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31896,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eftdm0om0(){try{__CLR4_4_1obwobwlgchorsz.R.inc(31896);
        __CLR4_4_1obwobwlgchorsz.R.inc(31897);Duration test = new Duration(0L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31898);assertEquals(Days.days(0), test.toStandardDays());
        __CLR4_4_1obwobwlgchorsz.R.inc(31899);test = new Duration(1L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31900);assertEquals(Days.days(0), test.toStandardDays());
        __CLR4_4_1obwobwlgchorsz.R.inc(31901);test = new Duration(24 * 60 * 60000L - 1);
        __CLR4_4_1obwobwlgchorsz.R.inc(31902);assertEquals(Days.days(0), test.toStandardDays());
        __CLR4_4_1obwobwlgchorsz.R.inc(31903);test = new Duration(24 * 60 * 60000L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31904);assertEquals(Days.days(1), test.toStandardDays());
        __CLR4_4_1obwobwlgchorsz.R.inc(31905);test = new Duration(24 * 60 * 60000L + 1);
        __CLR4_4_1obwobwlgchorsz.R.inc(31906);assertEquals(Days.days(1), test.toStandardDays());
        __CLR4_4_1obwobwlgchorsz.R.inc(31907);test = new Duration(2 * 24 * 60 * 60000L - 1);
        __CLR4_4_1obwobwlgchorsz.R.inc(31908);assertEquals(Days.days(1), test.toStandardDays());
        __CLR4_4_1obwobwlgchorsz.R.inc(31909);test = new Duration(2 * 24 * 60 * 60000L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31910);assertEquals(Days.days(2), test.toStandardDays());
        __CLR4_4_1obwobwlgchorsz.R.inc(31911);test = new Duration(-1L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31912);assertEquals(Days.days(0), test.toStandardDays());
        __CLR4_4_1obwobwlgchorsz.R.inc(31913);test = new Duration(-24 * 60 * 60000L + 1);
        __CLR4_4_1obwobwlgchorsz.R.inc(31914);assertEquals(Days.days(0), test.toStandardDays());
        __CLR4_4_1obwobwlgchorsz.R.inc(31915);test = new Duration(-24 * 60 * 60000L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31916);assertEquals(Days.days(-1), test.toStandardDays());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testToStandardDays_overflow() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),31917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cz48ufoml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardDays_overflow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cz48ufoml(){try{__CLR4_4_1obwobwlgchorsz.R.inc(31917);
        __CLR4_4_1obwobwlgchorsz.R.inc(31918);Duration test = new Duration((((long) Integer.MAX_VALUE) + 1) * 24L * 60L * 60000L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31919);try {
            __CLR4_4_1obwobwlgchorsz.R.inc(31920);test.toStandardDays();
            __CLR4_4_1obwobwlgchorsz.R.inc(31921);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToStandardHours() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),31922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ikk7gomq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ikk7gomq(){try{__CLR4_4_1obwobwlgchorsz.R.inc(31922);
        __CLR4_4_1obwobwlgchorsz.R.inc(31923);Duration test = new Duration(0L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31924);assertEquals(Hours.hours(0), test.toStandardHours());
        __CLR4_4_1obwobwlgchorsz.R.inc(31925);test = new Duration(1L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31926);assertEquals(Hours.hours(0), test.toStandardHours());
        __CLR4_4_1obwobwlgchorsz.R.inc(31927);test = new Duration(3600000L - 1);
        __CLR4_4_1obwobwlgchorsz.R.inc(31928);assertEquals(Hours.hours(0), test.toStandardHours());
        __CLR4_4_1obwobwlgchorsz.R.inc(31929);test = new Duration(3600000L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31930);assertEquals(Hours.hours(1), test.toStandardHours());
        __CLR4_4_1obwobwlgchorsz.R.inc(31931);test = new Duration(3600000L + 1);
        __CLR4_4_1obwobwlgchorsz.R.inc(31932);assertEquals(Hours.hours(1), test.toStandardHours());
        __CLR4_4_1obwobwlgchorsz.R.inc(31933);test = new Duration(2 * 3600000L - 1);
        __CLR4_4_1obwobwlgchorsz.R.inc(31934);assertEquals(Hours.hours(1), test.toStandardHours());
        __CLR4_4_1obwobwlgchorsz.R.inc(31935);test = new Duration(2 * 3600000L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31936);assertEquals(Hours.hours(2), test.toStandardHours());
        __CLR4_4_1obwobwlgchorsz.R.inc(31937);test = new Duration(-1L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31938);assertEquals(Hours.hours(0), test.toStandardHours());
        __CLR4_4_1obwobwlgchorsz.R.inc(31939);test = new Duration(-3600000L + 1);
        __CLR4_4_1obwobwlgchorsz.R.inc(31940);assertEquals(Hours.hours(0), test.toStandardHours());
        __CLR4_4_1obwobwlgchorsz.R.inc(31941);test = new Duration(-3600000L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31942);assertEquals(Hours.hours(-1), test.toStandardHours());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testToStandardHours_overflow() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),31943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gymaxponb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardHours_overflow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gymaxponb(){try{__CLR4_4_1obwobwlgchorsz.R.inc(31943);
        __CLR4_4_1obwobwlgchorsz.R.inc(31944);Duration test = new Duration(((long) Integer.MAX_VALUE) * 3600000L + 3600000L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31945);try {
            __CLR4_4_1obwobwlgchorsz.R.inc(31946);test.toStandardHours();
            __CLR4_4_1obwobwlgchorsz.R.inc(31947);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToStandardMinutes() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),31948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0kt44ong();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31948,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0kt44ong(){try{__CLR4_4_1obwobwlgchorsz.R.inc(31948);
        __CLR4_4_1obwobwlgchorsz.R.inc(31949);Duration test = new Duration(0L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31950);assertEquals(Minutes.minutes(0), test.toStandardMinutes());
        __CLR4_4_1obwobwlgchorsz.R.inc(31951);test = new Duration(1L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31952);assertEquals(Minutes.minutes(0), test.toStandardMinutes());
        __CLR4_4_1obwobwlgchorsz.R.inc(31953);test = new Duration(60000L - 1);
        __CLR4_4_1obwobwlgchorsz.R.inc(31954);assertEquals(Minutes.minutes(0), test.toStandardMinutes());
        __CLR4_4_1obwobwlgchorsz.R.inc(31955);test = new Duration(60000L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31956);assertEquals(Minutes.minutes(1), test.toStandardMinutes());
        __CLR4_4_1obwobwlgchorsz.R.inc(31957);test = new Duration(60000L + 1);
        __CLR4_4_1obwobwlgchorsz.R.inc(31958);assertEquals(Minutes.minutes(1), test.toStandardMinutes());
        __CLR4_4_1obwobwlgchorsz.R.inc(31959);test = new Duration(2 * 60000L - 1);
        __CLR4_4_1obwobwlgchorsz.R.inc(31960);assertEquals(Minutes.minutes(1), test.toStandardMinutes());
        __CLR4_4_1obwobwlgchorsz.R.inc(31961);test = new Duration(2 * 60000L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31962);assertEquals(Minutes.minutes(2), test.toStandardMinutes());
        __CLR4_4_1obwobwlgchorsz.R.inc(31963);test = new Duration(-1L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31964);assertEquals(Minutes.minutes(0), test.toStandardMinutes());
        __CLR4_4_1obwobwlgchorsz.R.inc(31965);test = new Duration(-60000L + 1);
        __CLR4_4_1obwobwlgchorsz.R.inc(31966);assertEquals(Minutes.minutes(0), test.toStandardMinutes());
        __CLR4_4_1obwobwlgchorsz.R.inc(31967);test = new Duration(-60000L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31968);assertEquals(Minutes.minutes(-1), test.toStandardMinutes());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testToStandardMinutes_overflow() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),31969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mpi1g3oo1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardMinutes_overflow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mpi1g3oo1(){try{__CLR4_4_1obwobwlgchorsz.R.inc(31969);
        __CLR4_4_1obwobwlgchorsz.R.inc(31970);Duration test = new Duration(((long) Integer.MAX_VALUE) * 60000L + 60000L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31971);try {
            __CLR4_4_1obwobwlgchorsz.R.inc(31972);test.toStandardMinutes();
            __CLR4_4_1obwobwlgchorsz.R.inc(31973);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToStandardSeconds() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),31974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1emeoqsoo6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1emeoqsoo6(){try{__CLR4_4_1obwobwlgchorsz.R.inc(31974);
        __CLR4_4_1obwobwlgchorsz.R.inc(31975);Duration test = new Duration(0L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31976);assertEquals(Seconds.seconds(0), test.toStandardSeconds());
        __CLR4_4_1obwobwlgchorsz.R.inc(31977);test = new Duration(1L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31978);assertEquals(Seconds.seconds(0), test.toStandardSeconds());
        __CLR4_4_1obwobwlgchorsz.R.inc(31979);test = new Duration(999L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31980);assertEquals(Seconds.seconds(0), test.toStandardSeconds());
        __CLR4_4_1obwobwlgchorsz.R.inc(31981);test = new Duration(1000L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31982);assertEquals(Seconds.seconds(1), test.toStandardSeconds());
        __CLR4_4_1obwobwlgchorsz.R.inc(31983);test = new Duration(1001L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31984);assertEquals(Seconds.seconds(1), test.toStandardSeconds());
        __CLR4_4_1obwobwlgchorsz.R.inc(31985);test = new Duration(1999L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31986);assertEquals(Seconds.seconds(1), test.toStandardSeconds());
        __CLR4_4_1obwobwlgchorsz.R.inc(31987);test = new Duration(2000L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31988);assertEquals(Seconds.seconds(2), test.toStandardSeconds());
        __CLR4_4_1obwobwlgchorsz.R.inc(31989);test = new Duration(-1L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31990);assertEquals(Seconds.seconds(0), test.toStandardSeconds());
        __CLR4_4_1obwobwlgchorsz.R.inc(31991);test = new Duration(-999L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31992);assertEquals(Seconds.seconds(0), test.toStandardSeconds());
        __CLR4_4_1obwobwlgchorsz.R.inc(31993);test = new Duration(-1000L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31994);assertEquals(Seconds.seconds(-1), test.toStandardSeconds());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testToStandardSeconds_overflow() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),31995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1laykzxoor();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardSeconds_overflow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31995,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1laykzxoor(){try{__CLR4_4_1obwobwlgchorsz.R.inc(31995);
        __CLR4_4_1obwobwlgchorsz.R.inc(31996);Duration test = new Duration(((long) Integer.MAX_VALUE) * 1000L + 1000L);
        __CLR4_4_1obwobwlgchorsz.R.inc(31997);try {
            __CLR4_4_1obwobwlgchorsz.R.inc(31998);test.toStandardSeconds();
            __CLR4_4_1obwobwlgchorsz.R.inc(31999);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToPeriod() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cvhk17oow();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cvhk17oow(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32000);
        __CLR4_4_1obwobwlgchorsz.R.inc(32001);DateTimeZone zone = DateTimeZone.getDefault();
        __CLR4_4_1obwobwlgchorsz.R.inc(32002);try {
            __CLR4_4_1obwobwlgchorsz.R.inc(32003);DateTimeZone.setDefault(DateTimeZone.forID("Europe/Paris"));
            __CLR4_4_1obwobwlgchorsz.R.inc(32004);long length =
                    (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                            5L * DateTimeConstants.MILLIS_PER_HOUR +
                            6L * DateTimeConstants.MILLIS_PER_MINUTE +
                            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
            __CLR4_4_1obwobwlgchorsz.R.inc(32005);Duration dur = new Duration(length);
            __CLR4_4_1obwobwlgchorsz.R.inc(32006);Period test = dur.toPeriod();
            __CLR4_4_1obwobwlgchorsz.R.inc(32007);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
            __CLR4_4_1obwobwlgchorsz.R.inc(32008);assertEquals(0, test.getMonths());
            __CLR4_4_1obwobwlgchorsz.R.inc(32009);assertEquals(0, test.getWeeks());
            __CLR4_4_1obwobwlgchorsz.R.inc(32010);assertEquals(0, test.getDays());
            __CLR4_4_1obwobwlgchorsz.R.inc(32011);assertEquals((450 * 24) + 5, test.getHours());
            __CLR4_4_1obwobwlgchorsz.R.inc(32012);assertEquals(6, test.getMinutes());
            __CLR4_4_1obwobwlgchorsz.R.inc(32013);assertEquals(7, test.getSeconds());
            __CLR4_4_1obwobwlgchorsz.R.inc(32014);assertEquals(8, test.getMillis());
        } finally {
            __CLR4_4_1obwobwlgchorsz.R.inc(32015);DateTimeZone.setDefault(zone);
        }
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testToPeriod_fixedZone() throws Throwable {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tl9022opc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod_fixedZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tl9022opc() throws Throwable{try{__CLR4_4_1obwobwlgchorsz.R.inc(32016);
        __CLR4_4_1obwobwlgchorsz.R.inc(32017);DateTimeZone zone = DateTimeZone.getDefault();
        __CLR4_4_1obwobwlgchorsz.R.inc(32018);try {
            __CLR4_4_1obwobwlgchorsz.R.inc(32019);DateTimeZone.setDefault(DateTimeZone.forOffsetHours(2));
            __CLR4_4_1obwobwlgchorsz.R.inc(32020);long length =
                    (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                            5L * DateTimeConstants.MILLIS_PER_HOUR +
                            6L * DateTimeConstants.MILLIS_PER_MINUTE +
                            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
            __CLR4_4_1obwobwlgchorsz.R.inc(32021);Duration dur = new Duration(length);
            __CLR4_4_1obwobwlgchorsz.R.inc(32022);Period test = dur.toPeriod();
            __CLR4_4_1obwobwlgchorsz.R.inc(32023);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
            __CLR4_4_1obwobwlgchorsz.R.inc(32024);assertEquals(0, test.getMonths());
            __CLR4_4_1obwobwlgchorsz.R.inc(32025);assertEquals(0, test.getWeeks());
            __CLR4_4_1obwobwlgchorsz.R.inc(32026);assertEquals(0, test.getDays());
            __CLR4_4_1obwobwlgchorsz.R.inc(32027);assertEquals((450 * 24) + 5, test.getHours());
            __CLR4_4_1obwobwlgchorsz.R.inc(32028);assertEquals(6, test.getMinutes());
            __CLR4_4_1obwobwlgchorsz.R.inc(32029);assertEquals(7, test.getSeconds());
            __CLR4_4_1obwobwlgchorsz.R.inc(32030);assertEquals(8, test.getMillis());
        } finally {
            __CLR4_4_1obwobwlgchorsz.R.inc(32031);DateTimeZone.setDefault(zone);
        }
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToPeriod_PeriodType() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18qw3n1ops();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod_PeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32032,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18qw3n1ops(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32032);
        __CLR4_4_1obwobwlgchorsz.R.inc(32033);long length =
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                        5L * DateTimeConstants.MILLIS_PER_HOUR +
                        6L * DateTimeConstants.MILLIS_PER_MINUTE +
                        7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1obwobwlgchorsz.R.inc(32034);Duration test = new Duration(length);
        __CLR4_4_1obwobwlgchorsz.R.inc(32035);Period result = test.toPeriod(PeriodType.standard().withMillisRemoved());
        __CLR4_4_1obwobwlgchorsz.R.inc(32036);assertEquals(new Period(test, PeriodType.standard().withMillisRemoved()), result);
        __CLR4_4_1obwobwlgchorsz.R.inc(32037);assertEquals(new Period(test.getMillis(), PeriodType.standard().withMillisRemoved()), result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToPeriod_Chronology() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x3hzjkopy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x3hzjkopy(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32038);
        __CLR4_4_1obwobwlgchorsz.R.inc(32039);long length =
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                        5L * DateTimeConstants.MILLIS_PER_HOUR +
                        6L * DateTimeConstants.MILLIS_PER_MINUTE +
                        7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1obwobwlgchorsz.R.inc(32040);Duration test = new Duration(length);
        __CLR4_4_1obwobwlgchorsz.R.inc(32041);Period result = test.toPeriod(ISOChronology.getInstanceUTC());
        __CLR4_4_1obwobwlgchorsz.R.inc(32042);assertEquals(new Period(test, ISOChronology.getInstanceUTC()), result);
        __CLR4_4_1obwobwlgchorsz.R.inc(32043);assertEquals(new Period(test.getMillis(), ISOChronology.getInstanceUTC()), result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToPeriod_PeriodType_Chronology() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mvctlaoq4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod_PeriodType_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32044,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mvctlaoq4(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32044);
        __CLR4_4_1obwobwlgchorsz.R.inc(32045);long length =
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                        5L * DateTimeConstants.MILLIS_PER_HOUR +
                        6L * DateTimeConstants.MILLIS_PER_MINUTE +
                        7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1obwobwlgchorsz.R.inc(32046);Duration test = new Duration(length);
        __CLR4_4_1obwobwlgchorsz.R.inc(32047);Period result = test.toPeriod(PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC());
        __CLR4_4_1obwobwlgchorsz.R.inc(32048);assertEquals(new Period(test, PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC()), result);
        __CLR4_4_1obwobwlgchorsz.R.inc(32049);assertEquals(new Period(test.getMillis(), PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC()), result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToPeriodFrom() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oimx27oqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodFrom",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32050,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oimx27oqa(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32050);
        __CLR4_4_1obwobwlgchorsz.R.inc(32051);long length =
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                        5L * DateTimeConstants.MILLIS_PER_HOUR +
                        6L * DateTimeConstants.MILLIS_PER_MINUTE +
                        7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1obwobwlgchorsz.R.inc(32052);Duration test = new Duration(length);
        __CLR4_4_1obwobwlgchorsz.R.inc(32053);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1obwobwlgchorsz.R.inc(32054);Period result = test.toPeriodFrom(dt);
        __CLR4_4_1obwobwlgchorsz.R.inc(32055);assertEquals(new Period(dt, test), result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToPeriodFrom_PeriodType() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wha9mfoqg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodFrom_PeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wha9mfoqg(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32056);
        __CLR4_4_1obwobwlgchorsz.R.inc(32057);long length =
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                        5L * DateTimeConstants.MILLIS_PER_HOUR +
                        6L * DateTimeConstants.MILLIS_PER_MINUTE +
                        7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1obwobwlgchorsz.R.inc(32058);Duration test = new Duration(length);
        __CLR4_4_1obwobwlgchorsz.R.inc(32059);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1obwobwlgchorsz.R.inc(32060);Period result = test.toPeriodFrom(dt, PeriodType.standard().withMillisRemoved());
        __CLR4_4_1obwobwlgchorsz.R.inc(32061);assertEquals(new Period(dt, test, PeriodType.standard().withMillisRemoved()), result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToPeriodTo() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17og55coqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32062,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17og55coqm(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32062);
        __CLR4_4_1obwobwlgchorsz.R.inc(32063);long length =
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                        5L * DateTimeConstants.MILLIS_PER_HOUR +
                        6L * DateTimeConstants.MILLIS_PER_MINUTE +
                        7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1obwobwlgchorsz.R.inc(32064);Duration test = new Duration(length);
        __CLR4_4_1obwobwlgchorsz.R.inc(32065);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1obwobwlgchorsz.R.inc(32066);Period result = test.toPeriodTo(dt);
        __CLR4_4_1obwobwlgchorsz.R.inc(32067);assertEquals(new Period(test, dt), result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToPeriodTo_PeriodType() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x3ugvsoqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodTo_PeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32068,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x3ugvsoqs(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32068);
        __CLR4_4_1obwobwlgchorsz.R.inc(32069);long length =
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                        5L * DateTimeConstants.MILLIS_PER_HOUR +
                        6L * DateTimeConstants.MILLIS_PER_MINUTE +
                        7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1obwobwlgchorsz.R.inc(32070);Duration test = new Duration(length);
        __CLR4_4_1obwobwlgchorsz.R.inc(32071);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1obwobwlgchorsz.R.inc(32072);Period result = test.toPeriodTo(dt, PeriodType.standard().withMillisRemoved());
        __CLR4_4_1obwobwlgchorsz.R.inc(32073);assertEquals(new Period(test, dt, PeriodType.standard().withMillisRemoved()), result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToIntervalFrom() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14up6n1oqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToIntervalFrom",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32074,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14up6n1oqy(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32074);
        __CLR4_4_1obwobwlgchorsz.R.inc(32075);long length =
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                        5L * DateTimeConstants.MILLIS_PER_HOUR +
                        6L * DateTimeConstants.MILLIS_PER_MINUTE +
                        7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1obwobwlgchorsz.R.inc(32076);Duration test = new Duration(length);
        __CLR4_4_1obwobwlgchorsz.R.inc(32077);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1obwobwlgchorsz.R.inc(32078);Interval result = test.toIntervalFrom(dt);
        __CLR4_4_1obwobwlgchorsz.R.inc(32079);assertEquals(new Interval(dt, test), result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToIntervalTo() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bhtktoor4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToIntervalTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32080,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bhtktoor4(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32080);
        __CLR4_4_1obwobwlgchorsz.R.inc(32081);long length =
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                        5L * DateTimeConstants.MILLIS_PER_HOUR +
                        6L * DateTimeConstants.MILLIS_PER_MINUTE +
                        7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1obwobwlgchorsz.R.inc(32082);Duration test = new Duration(length);
        __CLR4_4_1obwobwlgchorsz.R.inc(32083);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1obwobwlgchorsz.R.inc(32084);Interval result = test.toIntervalTo(dt);
        __CLR4_4_1obwobwlgchorsz.R.inc(32085);assertEquals(new Interval(test, dt), result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithMillis1() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iq74e2ora();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithMillis1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iq74e2ora(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32086);
        __CLR4_4_1obwobwlgchorsz.R.inc(32087);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32088);Duration result = test.withMillis(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32089);assertSame(test, result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testWithMillis2() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lz736jore();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithMillis2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lz736jore(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32090);
        __CLR4_4_1obwobwlgchorsz.R.inc(32091);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32092);Duration result = test.withMillis(1234567890L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32093);assertEquals(1234567890L, result.getMillis());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithDurationAdded_long_int1() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15x9qv3ori();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_long_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15x9qv3ori(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32094);
        __CLR4_4_1obwobwlgchorsz.R.inc(32095);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32096);Duration result = test.withDurationAdded(8000L, 1);
        __CLR4_4_1obwobwlgchorsz.R.inc(32097);assertEquals(8123L, result.getMillis());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testWithDurationAdded_long_int2() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12o9s2morm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_long_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32098,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12o9s2morm(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32098);
        __CLR4_4_1obwobwlgchorsz.R.inc(32099);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32100);Duration result = test.withDurationAdded(8000L, 2);
        __CLR4_4_1obwobwlgchorsz.R.inc(32101);assertEquals(16123L, result.getMillis());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testWithDurationAdded_long_int3() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kq6pvorq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_long_int3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kq6pvorq(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32102);
        __CLR4_4_1obwobwlgchorsz.R.inc(32103);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32104);Duration result = test.withDurationAdded(8000L, -1);
        __CLR4_4_1obwobwlgchorsz.R.inc(32105);assertEquals((123L - 8000L), result.getMillis());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testWithDurationAdded_long_int4() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13tq5icoru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_long_int4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32106,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13tq5icoru(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32106);
        __CLR4_4_1obwobwlgchorsz.R.inc(32107);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32108);Duration result = test.withDurationAdded(0L, 1);
        __CLR4_4_1obwobwlgchorsz.R.inc(32109);assertSame(test, result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testWithDurationAdded_long_int5() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_172q4atory();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_long_int5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_172q4atory(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32110);
        __CLR4_4_1obwobwlgchorsz.R.inc(32111);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32112);Duration result = test.withDurationAdded(8000L, 0);
        __CLR4_4_1obwobwlgchorsz.R.inc(32113);assertSame(test, result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPlus_long1() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x1g32hos2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x1g32hos2(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32114);
        __CLR4_4_1obwobwlgchorsz.R.inc(32115);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32116);Duration result = test.plus(8000L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32117);assertEquals(8123L, result.getMillis());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testPlus_long2() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yqo046os6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yqo046os6(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32118);
        __CLR4_4_1obwobwlgchorsz.R.inc(32119);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32120);Duration result = test.plus(0L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32121);assertSame(test, result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMinus_long1() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1897ts5osa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1897ts5osa(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32122);
        __CLR4_4_1obwobwlgchorsz.R.inc(32123);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32124);Duration result = test.minus(8000L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32125);assertEquals(123L - 8000L, result.getMillis());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testMinus_long2() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1507uzoose();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1507uzoose(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32126);
        __CLR4_4_1obwobwlgchorsz.R.inc(32127);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32128);Duration result = test.minus(0L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32129);assertSame(test, result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMultipliedBy_long1() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gr9difosi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMultipliedBy_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gr9difosi(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32130);
        __CLR4_4_1obwobwlgchorsz.R.inc(32131);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32132);Duration result = test.multipliedBy(2L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32133);assertEquals(246L, result.getMillis());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testMultipliedBy_long2() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1di9epyosm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMultipliedBy_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32134,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1di9epyosm(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32134);
        __CLR4_4_1obwobwlgchorsz.R.inc(32135);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32136);Duration result = test.multipliedBy(1L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32137);assertSame(test, result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDividedBy_long1() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oczpjhosq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testDividedBy_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oczpjhosq(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32138);
        __CLR4_4_1obwobwlgchorsz.R.inc(32139);Duration test = new Duration(246L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32140);Duration result = test.dividedBy(2L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32141);assertEquals(123L, result.getMillis());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testDividedBy_long2() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlzobyosu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testDividedBy_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlzobyosu(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32142);
        __CLR4_4_1obwobwlgchorsz.R.inc(32143);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32144);Duration result = test.dividedBy(1L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32145);assertSame(test, result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDividedByRoundingMode_long1() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yu6rocosy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testDividedByRoundingMode_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yu6rocosy(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32146);
        __CLR4_4_1obwobwlgchorsz.R.inc(32147);Duration test = new Duration(246L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32148);Duration result = test.dividedBy(2L, RoundingMode.UNNECESSARY);
        __CLR4_4_1obwobwlgchorsz.R.inc(32149);assertEquals(123L, result.getMillis());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testDividedByRoundingMode_long2() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vl6svvot2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testDividedByRoundingMode_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vl6svvot2(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32150);
        __CLR4_4_1obwobwlgchorsz.R.inc(32151);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32152);Duration result = test.dividedBy(2L, RoundingMode.FLOOR);
        __CLR4_4_1obwobwlgchorsz.R.inc(32153);assertEquals(61L, result.getMillis());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testDividedByRoundingMode_long3() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sc6u3eot6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testDividedByRoundingMode_long3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sc6u3eot6(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32154);
        __CLR4_4_1obwobwlgchorsz.R.inc(32155);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32156);Duration result = test.dividedBy(7L, RoundingMode.CEILING);
        __CLR4_4_1obwobwlgchorsz.R.inc(32157);assertEquals(18L, result.getMillis());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testDividedByRoundingMode_long4() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p36vaxota();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testDividedByRoundingMode_long4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p36vaxota(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32158);
        __CLR4_4_1obwobwlgchorsz.R.inc(32159);Duration test = new Duration(33L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32160);Duration result = test.dividedBy(1L, RoundingMode.FLOOR);
        __CLR4_4_1obwobwlgchorsz.R.inc(32161);assertSame(test, result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNegated_long1() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1islf8tote();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testNegated_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1islf8tote(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32162);
        __CLR4_4_1obwobwlgchorsz.R.inc(32163);Duration test = new Duration(246L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32164);Duration result = test.negated();
        __CLR4_4_1obwobwlgchorsz.R.inc(32165);assertEquals(-246L, result.getMillis());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testNegated_long2() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1le1aoti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testNegated_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1le1aoti(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32166);
        __CLR4_4_1obwobwlgchorsz.R.inc(32167);Duration test = new Duration(-246L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32168);Duration result = test.negated();
        __CLR4_4_1obwobwlgchorsz.R.inc(32169);assertEquals(246L, result.getMillis());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testNegated_long3() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1palctrotm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testNegated_long3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1palctrotm(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32170);
        __CLR4_4_1obwobwlgchorsz.R.inc(32171);Duration test = new Duration(Long.MIN_VALUE);
        __CLR4_4_1obwobwlgchorsz.R.inc(32172);try {
            __CLR4_4_1obwobwlgchorsz.R.inc(32173);test.negated();
            __CLR4_4_1obwobwlgchorsz.R.inc(32174);fail();
        } catch (ArithmeticException e) {
            // expected
        }
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAbs() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l56wufotr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testAbs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l56wufotr(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32175);
        __CLR4_4_1obwobwlgchorsz.R.inc(32176);assertEquals(246L, new Duration(246L).abs().getMillis());
        __CLR4_4_1obwobwlgchorsz.R.inc(32177);assertEquals(0L, new Duration(0L).abs().getMillis());
        __CLR4_4_1obwobwlgchorsz.R.inc(32178);assertEquals(246L, new Duration(-246L).abs().getMillis());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithDurationAdded_RD_int1() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115dkc5otv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_RD_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115dkc5otv(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32179);
        __CLR4_4_1obwobwlgchorsz.R.inc(32180);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32181);Duration result = test.withDurationAdded(new Duration(8000L), 1);
        __CLR4_4_1obwobwlgchorsz.R.inc(32182);assertEquals(8123L, result.getMillis());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testWithDurationAdded_RD_int2() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_123megcotz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_RD_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32183,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_123megcotz(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32183);
        __CLR4_4_1obwobwlgchorsz.R.inc(32184);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32185);Duration result = test.withDurationAdded(new Duration(8000L), 2);
        __CLR4_4_1obwobwlgchorsz.R.inc(32186);assertEquals(16123L, result.getMillis());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testWithDurationAdded_RD_int3() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15cmd8tou3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_RD_int3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15cmd8tou3(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32187);
        __CLR4_4_1obwobwlgchorsz.R.inc(32188);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32189);Duration result = test.withDurationAdded(new Duration(8000L), -1);
        __CLR4_4_1obwobwlgchorsz.R.inc(32190);assertEquals((123L - 8000L), result.getMillis());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testWithDurationAdded_RD_int4() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18lmc1aou7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_RD_int4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32191,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18lmc1aou7(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32191);
        __CLR4_4_1obwobwlgchorsz.R.inc(32192);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32193);Duration result = test.withDurationAdded(new Duration(0L), 1);
        __CLR4_4_1obwobwlgchorsz.R.inc(32194);assertSame(test, result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testWithDurationAdded_RD_int5() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bumatroub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_RD_int5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bumatroub(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32195);
        __CLR4_4_1obwobwlgchorsz.R.inc(32196);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32197);Duration result = test.withDurationAdded(new Duration(8000L), 0);
        __CLR4_4_1obwobwlgchorsz.R.inc(32198);assertSame(test, result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testWithDurationAdded_RD_int6() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3m9m8ouf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_RD_int6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32199,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3m9m8ouf(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32199);
        __CLR4_4_1obwobwlgchorsz.R.inc(32200);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32201);Duration result = test.withDurationAdded(null, 0);
        __CLR4_4_1obwobwlgchorsz.R.inc(32202);assertSame(test, result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPlus_RD1() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w57dznouj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_RD1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w57dznouj(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32203);
        __CLR4_4_1obwobwlgchorsz.R.inc(32204);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32205);Duration result = test.plus(new Duration(8000L));
        __CLR4_4_1obwobwlgchorsz.R.inc(32206);assertEquals(8123L, result.getMillis());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testPlus_RD2() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ze7cs4oun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_RD2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ze7cs4oun(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32207);
        __CLR4_4_1obwobwlgchorsz.R.inc(32208);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32209);Duration result = test.plus(new Duration(0L));
        __CLR4_4_1obwobwlgchorsz.R.inc(32210);assertSame(test, result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testPlus_RD3() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wdwqejour();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_RD3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wdwqejour(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32211);
        __CLR4_4_1obwobwlgchorsz.R.inc(32212);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32213);Duration result = test.plus(null);
        __CLR4_4_1obwobwlgchorsz.R.inc(32214);assertSame(test, result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMinus_RD1() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151ruh1ouv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_RD1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32215,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151ruh1ouv(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32215);
        __CLR4_4_1obwobwlgchorsz.R.inc(32216);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32217);Duration result = test.minus(new Duration(8000L));
        __CLR4_4_1obwobwlgchorsz.R.inc(32218);assertEquals(123L - 8000L, result.getMillis());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testMinus_RD2() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18art9iouz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_RD2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18art9iouz(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32219);
        __CLR4_4_1obwobwlgchorsz.R.inc(32220);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32221);Duration result = test.minus(new Duration(0L));
        __CLR4_4_1obwobwlgchorsz.R.inc(32222);assertSame(test, result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    @Test
    public void testMinus_RD3() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bjrs1zov3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_RD3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bjrs1zov3(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32223);
        __CLR4_4_1obwobwlgchorsz.R.inc(32224);Duration test = new Duration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32225);Duration result = test.minus(null);
        __CLR4_4_1obwobwlgchorsz.R.inc(32226);assertSame(test, result);
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMutableDuration() {__CLR4_4_1obwobwlgchorsz.R.globalSliceStart(getClass().getName(),32227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ug5v73ov7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1obwobwlgchorsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1obwobwlgchorsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMutableDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32227,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ug5v73ov7(){try{__CLR4_4_1obwobwlgchorsz.R.inc(32227);
        // no MutableDuration, so...
        __CLR4_4_1obwobwlgchorsz.R.inc(32228);MockMutableDuration test = new MockMutableDuration(123L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32229);assertEquals(123L, test.getMillis());

        __CLR4_4_1obwobwlgchorsz.R.inc(32230);test.setMillis(2345L);
        __CLR4_4_1obwobwlgchorsz.R.inc(32231);assertEquals(2345L, test.getMillis());
    }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

    static class MockMutableDuration extends BaseDuration {
        public MockMutableDuration(long duration) {
            super(duration);__CLR4_4_1obwobwlgchorsz.R.inc(32233);try{__CLR4_4_1obwobwlgchorsz.R.inc(32232);
        }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}

        public void setMillis(long duration) {try{__CLR4_4_1obwobwlgchorsz.R.inc(32234);
            __CLR4_4_1obwobwlgchorsz.R.inc(32235);super.setMillis(duration);
        }finally{__CLR4_4_1obwobwlgchorsz.R.flushNeeded();}}
    }

}
