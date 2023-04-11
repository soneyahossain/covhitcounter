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
package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestYearMonthDay_Basics {static class __CLR4_4_118cb18cblgchosj6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,58167,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_118cb18cblgchosj6.R.inc(57467);
        __CLR4_4_118cb18cblgchosj6.R.inc(57468);TestYearMonthDay_Basics TB = new TestYearMonthDay_Basics();
        __CLR4_4_118cb18cblgchosj6.R.inc(57469);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57470);TB.testGet();
        __CLR4_4_118cb18cblgchosj6.R.inc(57471);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57472);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57473);TB.testSize();
        __CLR4_4_118cb18cblgchosj6.R.inc(57474);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57475);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57476);TB.testGetFieldType();
        __CLR4_4_118cb18cblgchosj6.R.inc(57477);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57478);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57479);TB.testGetFieldTypes();
        __CLR4_4_118cb18cblgchosj6.R.inc(57480);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57481);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57482);TB.testGetField();
        __CLR4_4_118cb18cblgchosj6.R.inc(57483);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57484);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57485);TB.testGetFields();
        __CLR4_4_118cb18cblgchosj6.R.inc(57486);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57487);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57488);TB.testGetValue();
        __CLR4_4_118cb18cblgchosj6.R.inc(57489);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57490);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57491);TB.testGetValues();
        __CLR4_4_118cb18cblgchosj6.R.inc(57492);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57493);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57494);TB.testIsSupported();
        __CLR4_4_118cb18cblgchosj6.R.inc(57495);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57496);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57497);TB.testEqualsHashCode();
        __CLR4_4_118cb18cblgchosj6.R.inc(57498);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57499);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57500);TB.testCompareTo();
        __CLR4_4_118cb18cblgchosj6.R.inc(57501);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57502);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57503);TB.testIsEqual_YMD();
        __CLR4_4_118cb18cblgchosj6.R.inc(57504);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57505);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57506);TB.testIsBefore_YMD();
        __CLR4_4_118cb18cblgchosj6.R.inc(57507);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57508);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57509);TB.testIsAfter_YMD();
        __CLR4_4_118cb18cblgchosj6.R.inc(57510);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57511);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57512);TB.testWithChronologyRetainFields_Chrono();
        __CLR4_4_118cb18cblgchosj6.R.inc(57513);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57514);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57515);TB.testWithChronologyRetainFields_sameChrono();
        __CLR4_4_118cb18cblgchosj6.R.inc(57516);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57517);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57518);TB.testWithChronologyRetainFields_nullChrono();
        __CLR4_4_118cb18cblgchosj6.R.inc(57519);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57520);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57521);TB.testWithChronologyRetainFields_invalidInNewChrono();
        __CLR4_4_118cb18cblgchosj6.R.inc(57522);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57523);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57524);TB.testWithField1();
        __CLR4_4_118cb18cblgchosj6.R.inc(57525);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57526);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57527);TB.testWithField2();
        __CLR4_4_118cb18cblgchosj6.R.inc(57528);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57529);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57530);TB.testWithField3();
        __CLR4_4_118cb18cblgchosj6.R.inc(57531);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57532);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57533);TB.testWithField4();
        __CLR4_4_118cb18cblgchosj6.R.inc(57534);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57535);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57536);TB.testWithFieldAdded1();
        __CLR4_4_118cb18cblgchosj6.R.inc(57537);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57538);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57539);TB.testWithFieldAdded2();
        __CLR4_4_118cb18cblgchosj6.R.inc(57540);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57541);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57542);TB.testWithFieldAdded3();
        __CLR4_4_118cb18cblgchosj6.R.inc(57543);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57544);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57545);TB.testWithFieldAdded4();
        __CLR4_4_118cb18cblgchosj6.R.inc(57546);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57547);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57548);TB.testWithFieldAdded5();
        __CLR4_4_118cb18cblgchosj6.R.inc(57549);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57550);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57551);TB.testPlus_RP();
        __CLR4_4_118cb18cblgchosj6.R.inc(57552);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57553);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57554);TB.testPlusYears_int();
        __CLR4_4_118cb18cblgchosj6.R.inc(57555);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57556);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57557);TB.testPlusMonths_int();
        __CLR4_4_118cb18cblgchosj6.R.inc(57558);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57559);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57560);TB.testPlusDays_int();
        __CLR4_4_118cb18cblgchosj6.R.inc(57561);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57562);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57563);TB.testMinus_RP();
        __CLR4_4_118cb18cblgchosj6.R.inc(57564);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57565);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57566);TB.testMinusYears_int();
        __CLR4_4_118cb18cblgchosj6.R.inc(57567);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57568);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57569);TB.testMinusMonths_int();
        __CLR4_4_118cb18cblgchosj6.R.inc(57570);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57571);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57572);TB.testMinusDays_int();
        __CLR4_4_118cb18cblgchosj6.R.inc(57573);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57574);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57575);TB.testToLocalDate();
        __CLR4_4_118cb18cblgchosj6.R.inc(57576);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57577);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57578);TB.testToDateTimeAtMidnight();
        __CLR4_4_118cb18cblgchosj6.R.inc(57579);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57580);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57581);TB.testToDateTimeAtMidnight_Zone();
        __CLR4_4_118cb18cblgchosj6.R.inc(57582);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57583);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57584);TB.testToDateTimeAtMidnight_nullZone();
        __CLR4_4_118cb18cblgchosj6.R.inc(57585);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57586);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57587);TB.testToDateTimeAtCurrentTime();
        __CLR4_4_118cb18cblgchosj6.R.inc(57588);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57589);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57590);TB.testToDateTimeAtCurrentTime_Zone();
        __CLR4_4_118cb18cblgchosj6.R.inc(57591);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57592);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57593);TB.testToDateTimeAtCurrentTime_nullZone();
        __CLR4_4_118cb18cblgchosj6.R.inc(57594);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57595);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57596);TB.testToDateTime_TOD();
        __CLR4_4_118cb18cblgchosj6.R.inc(57597);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57598);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57599);TB.testToDateTime_nullTOD();
        __CLR4_4_118cb18cblgchosj6.R.inc(57600);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57601);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57602);TB.testToDateTime_TOD_Zone();
        __CLR4_4_118cb18cblgchosj6.R.inc(57603);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57604);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57605);TB.testToDateTime_TOD_nullZone();
        __CLR4_4_118cb18cblgchosj6.R.inc(57606);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57607);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57608);TB.testToDateTime_nullTOD_Zone();
        __CLR4_4_118cb18cblgchosj6.R.inc(57609);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57610);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57611);TB.testToDateMidnight();
        __CLR4_4_118cb18cblgchosj6.R.inc(57612);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57613);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57614);TB.testToDateMidnight_Zone();
        __CLR4_4_118cb18cblgchosj6.R.inc(57615);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57616);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57617);TB.testToDateMidnight_nullZone();
        __CLR4_4_118cb18cblgchosj6.R.inc(57618);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57619);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57620);TB.testToDateTime_RI();
        __CLR4_4_118cb18cblgchosj6.R.inc(57621);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57622);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57623);TB.testToDateTime_nullRI();
        __CLR4_4_118cb18cblgchosj6.R.inc(57624);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57625);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57626);TB.testToInterval();
        __CLR4_4_118cb18cblgchosj6.R.inc(57627);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57628);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57629);TB.testToInterval_Zone();
        __CLR4_4_118cb18cblgchosj6.R.inc(57630);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57631);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57632);TB.testToInterval_nullZone();
        __CLR4_4_118cb18cblgchosj6.R.inc(57633);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57634);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57635);TB.testWithers();
        __CLR4_4_118cb18cblgchosj6.R.inc(57636);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57637);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57638);TB.testProperty();
        __CLR4_4_118cb18cblgchosj6.R.inc(57639);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57640);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57641);TB.testSerialization();
        __CLR4_4_118cb18cblgchosj6.R.inc(57642);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57643);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57644);TB.testToString();
        __CLR4_4_118cb18cblgchosj6.R.inc(57645);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57646);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57647);TB.testToString_String();
        __CLR4_4_118cb18cblgchosj6.R.inc(57648);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57649);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57650);TB.testToString_String_Locale();
        __CLR4_4_118cb18cblgchosj6.R.inc(57651);TB.tearDown();
        __CLR4_4_118cb18cblgchosj6.R.inc(57652);TB.setUp();
        __CLR4_4_118cb18cblgchosj6.R.inc(57653);TB.testToString_DTFormatter();
        __CLR4_4_118cb18cblgchosj6.R.inc(57654);TB.tearDown();

    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestYearMonthDay_Basics.class);
    }

    public TestYearMonthDay_Basics(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_118cb18cblgchosj6.R.inc(57655);
        __CLR4_4_118cb18cblgchosj6.R.inc(57656);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_118cb18cblgchosj6.R.inc(57657);zone = DateTimeZone.getDefault();
        __CLR4_4_118cb18cblgchosj6.R.inc(57658);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_118cb18cblgchosj6.R.inc(57659);
        __CLR4_4_118cb18cblgchosj6.R.inc(57660);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_118cb18cblgchosj6.R.inc(57661);DateTimeZone.setDefault(zone);
        __CLR4_4_118cb18cblgchosj6.R.inc(57662);zone = null;
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGet() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tpje3v18hr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57663,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tpje3v18hr(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57663);
        __CLR4_4_118cb18cblgchosj6.R.inc(57664);YearMonthDay test = new YearMonthDay();
        __CLR4_4_118cb18cblgchosj6.R.inc(57665);assertEquals(1970, test.get(DateTimeFieldType.year()));
        __CLR4_4_118cb18cblgchosj6.R.inc(57666);assertEquals(6, test.get(DateTimeFieldType.monthOfYear()));
        __CLR4_4_118cb18cblgchosj6.R.inc(57667);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_118cb18cblgchosj6.R.inc(57668);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(57669);test.get(null);
            __CLR4_4_118cb18cblgchosj6.R.inc(57670);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_118cb18cblgchosj6.R.inc(57671);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(57672);test.get(DateTimeFieldType.hourOfDay());
            __CLR4_4_118cb18cblgchosj6.R.inc(57673);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testSize() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xx12218i2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xx12218i2(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57674);
        __CLR4_4_118cb18cblgchosj6.R.inc(57675);YearMonthDay test = new YearMonthDay();
        __CLR4_4_118cb18cblgchosj6.R.inc(57676);assertEquals(3, test.size());
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testGetFieldType() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mv18i5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57677,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mv18i5(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57677);
        __CLR4_4_118cb18cblgchosj6.R.inc(57678);YearMonthDay test = new YearMonthDay(COPTIC_PARIS);
        __CLR4_4_118cb18cblgchosj6.R.inc(57679);assertSame(DateTimeFieldType.year(), test.getFieldType(0));
        __CLR4_4_118cb18cblgchosj6.R.inc(57680);assertSame(DateTimeFieldType.monthOfYear(), test.getFieldType(1));
        __CLR4_4_118cb18cblgchosj6.R.inc(57681);assertSame(DateTimeFieldType.dayOfMonth(), test.getFieldType(2));
        __CLR4_4_118cb18cblgchosj6.R.inc(57682);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(57683);test.getFieldType(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_118cb18cblgchosj6.R.inc(57684);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(57685);test.getFieldType(3);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testGetFieldTypes() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5ndvu18ie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGetFieldTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57686,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5ndvu18ie(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57686);
        __CLR4_4_118cb18cblgchosj6.R.inc(57687);YearMonthDay test = new YearMonthDay(COPTIC_PARIS);
        __CLR4_4_118cb18cblgchosj6.R.inc(57688);DateTimeFieldType[] fields = test.getFieldTypes();
        __CLR4_4_118cb18cblgchosj6.R.inc(57689);assertSame(DateTimeFieldType.year(), fields[0]);
        __CLR4_4_118cb18cblgchosj6.R.inc(57690);assertSame(DateTimeFieldType.monthOfYear(), fields[1]);
        __CLR4_4_118cb18cblgchosj6.R.inc(57691);assertSame(DateTimeFieldType.dayOfMonth(), fields[2]);
        __CLR4_4_118cb18cblgchosj6.R.inc(57692);assertNotSame(test.getFieldTypes(), test.getFieldTypes());
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testGetField() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lx8n7n18il();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGetField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lx8n7n18il(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57693);
        __CLR4_4_118cb18cblgchosj6.R.inc(57694);YearMonthDay test = new YearMonthDay(COPTIC_PARIS);
        __CLR4_4_118cb18cblgchosj6.R.inc(57695);assertSame(COPTIC_UTC.year(), test.getField(0));
        __CLR4_4_118cb18cblgchosj6.R.inc(57696);assertSame(COPTIC_UTC.monthOfYear(), test.getField(1));
        __CLR4_4_118cb18cblgchosj6.R.inc(57697);assertSame(COPTIC_UTC.dayOfMonth(), test.getField(2));
        __CLR4_4_118cb18cblgchosj6.R.inc(57698);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(57699);test.getField(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_118cb18cblgchosj6.R.inc(57700);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(57701);test.getField(3);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testGetFields() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmeas18iu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGetFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmeas18iu(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57702);
        __CLR4_4_118cb18cblgchosj6.R.inc(57703);YearMonthDay test = new YearMonthDay(COPTIC_PARIS);
        __CLR4_4_118cb18cblgchosj6.R.inc(57704);DateTimeField[] fields = test.getFields();
        __CLR4_4_118cb18cblgchosj6.R.inc(57705);assertSame(COPTIC_UTC.year(), fields[0]);
        __CLR4_4_118cb18cblgchosj6.R.inc(57706);assertSame(COPTIC_UTC.monthOfYear(), fields[1]);
        __CLR4_4_118cb18cblgchosj6.R.inc(57707);assertSame(COPTIC_UTC.dayOfMonth(), fields[2]);
        __CLR4_4_118cb18cblgchosj6.R.inc(57708);assertNotSame(test.getFields(), test.getFields());
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testGetValue() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcksmk18j1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGetValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcksmk18j1(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57709);
        __CLR4_4_118cb18cblgchosj6.R.inc(57710);YearMonthDay test = new YearMonthDay();
        __CLR4_4_118cb18cblgchosj6.R.inc(57711);assertEquals(1970, test.getValue(0));
        __CLR4_4_118cb18cblgchosj6.R.inc(57712);assertEquals(6, test.getValue(1));
        __CLR4_4_118cb18cblgchosj6.R.inc(57713);assertEquals(9, test.getValue(2));
        __CLR4_4_118cb18cblgchosj6.R.inc(57714);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(57715);test.getValue(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_118cb18cblgchosj6.R.inc(57716);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(57717);test.getValue(3);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testGetValues() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gduel18ja();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGetValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gduel18ja(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57718);
        __CLR4_4_118cb18cblgchosj6.R.inc(57719);YearMonthDay test = new YearMonthDay();
        __CLR4_4_118cb18cblgchosj6.R.inc(57720);int[] values = test.getValues();
        __CLR4_4_118cb18cblgchosj6.R.inc(57721);assertEquals(1970, values[0]);
        __CLR4_4_118cb18cblgchosj6.R.inc(57722);assertEquals(6, values[1]);
        __CLR4_4_118cb18cblgchosj6.R.inc(57723);assertEquals(9, values[2]);
        __CLR4_4_118cb18cblgchosj6.R.inc(57724);assertNotSame(test.getValues(), test.getValues());
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testIsSupported() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hma24n18jh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testIsSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hma24n18jh(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57725);
        __CLR4_4_118cb18cblgchosj6.R.inc(57726);YearMonthDay test = new YearMonthDay(COPTIC_PARIS);
        __CLR4_4_118cb18cblgchosj6.R.inc(57727);assertEquals(true, test.isSupported(DateTimeFieldType.year()));
        __CLR4_4_118cb18cblgchosj6.R.inc(57728);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear()));
        __CLR4_4_118cb18cblgchosj6.R.inc(57729);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_118cb18cblgchosj6.R.inc(57730);assertEquals(false, test.isSupported(DateTimeFieldType.hourOfDay()));
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testEqualsHashCode() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in7718jn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in7718jn(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57731);
        __CLR4_4_118cb18cblgchosj6.R.inc(57732);YearMonthDay test1 = new YearMonthDay(1970, 6, 9, COPTIC_PARIS);
        __CLR4_4_118cb18cblgchosj6.R.inc(57733);YearMonthDay test2 = new YearMonthDay(1970, 6, 9, COPTIC_PARIS);
        __CLR4_4_118cb18cblgchosj6.R.inc(57734);assertEquals(true, test1.equals(test2));
        __CLR4_4_118cb18cblgchosj6.R.inc(57735);assertEquals(true, test2.equals(test1));
        __CLR4_4_118cb18cblgchosj6.R.inc(57736);assertEquals(true, test1.equals(test1));
        __CLR4_4_118cb18cblgchosj6.R.inc(57737);assertEquals(true, test2.equals(test2));
        __CLR4_4_118cb18cblgchosj6.R.inc(57738);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_118cb18cblgchosj6.R.inc(57739);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_118cb18cblgchosj6.R.inc(57740);assertEquals(true, test2.hashCode() == test2.hashCode());

        __CLR4_4_118cb18cblgchosj6.R.inc(57741);YearMonthDay test3 = new YearMonthDay(1971, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57742);assertEquals(false, test1.equals(test3));
        __CLR4_4_118cb18cblgchosj6.R.inc(57743);assertEquals(false, test2.equals(test3));
        __CLR4_4_118cb18cblgchosj6.R.inc(57744);assertEquals(false, test3.equals(test1));
        __CLR4_4_118cb18cblgchosj6.R.inc(57745);assertEquals(false, test3.equals(test2));
        __CLR4_4_118cb18cblgchosj6.R.inc(57746);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_118cb18cblgchosj6.R.inc(57747);assertEquals(false, test2.hashCode() == test3.hashCode());

        __CLR4_4_118cb18cblgchosj6.R.inc(57748);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_118cb18cblgchosj6.R.inc(57749);assertEquals(true, test1.equals(new MockInstant()));
        __CLR4_4_118cb18cblgchosj6.R.inc(57750);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE));
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_118cb18cblgchosj6.R.inc(57751);
            __CLR4_4_118cb18cblgchosj6.R.inc(57752);return COPTIC_UTC;
        }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

        public DateTimeField[] getFields() {try{__CLR4_4_118cb18cblgchosj6.R.inc(57753);
            __CLR4_4_118cb18cblgchosj6.R.inc(57754);return new DateTimeField[]{
                    COPTIC_UTC.year(),
                    COPTIC_UTC.monthOfYear(),
                    COPTIC_UTC.dayOfMonth(),
            };
        }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

        public int[] getValues() {try{__CLR4_4_118cb18cblgchosj6.R.inc(57755);
            __CLR4_4_118cb18cblgchosj6.R.inc(57756);return new int[]{1970, 6, 9};
        }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    @Test
    public void testCompareTo() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfv18kd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57757,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfv18kd(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57757);
        __CLR4_4_118cb18cblgchosj6.R.inc(57758);YearMonthDay test1 = new YearMonthDay(2005, 6, 2);
        __CLR4_4_118cb18cblgchosj6.R.inc(57759);YearMonthDay test1a = new YearMonthDay(2005, 6, 2);
        __CLR4_4_118cb18cblgchosj6.R.inc(57760);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_118cb18cblgchosj6.R.inc(57761);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_118cb18cblgchosj6.R.inc(57762);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_118cb18cblgchosj6.R.inc(57763);assertEquals(0, test1a.compareTo(test1a));

        __CLR4_4_118cb18cblgchosj6.R.inc(57764);YearMonthDay test2 = new YearMonthDay(2005, 7, 2);
        __CLR4_4_118cb18cblgchosj6.R.inc(57765);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_118cb18cblgchosj6.R.inc(57766);assertEquals(+1, test2.compareTo(test1));

        __CLR4_4_118cb18cblgchosj6.R.inc(57767);YearMonthDay test3 = new YearMonthDay(2005, 7, 2, GregorianChronology.getInstanceUTC());
        __CLR4_4_118cb18cblgchosj6.R.inc(57768);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_118cb18cblgchosj6.R.inc(57769);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_118cb18cblgchosj6.R.inc(57770);assertEquals(0, test3.compareTo(test2));

        __CLR4_4_118cb18cblgchosj6.R.inc(57771);DateTimeFieldType[] types = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.dayOfMonth(),
        };
        __CLR4_4_118cb18cblgchosj6.R.inc(57772);int[] values = new int[]{2005, 6, 2};
        __CLR4_4_118cb18cblgchosj6.R.inc(57773);Partial p = new Partial(types, values);
        __CLR4_4_118cb18cblgchosj6.R.inc(57774);assertEquals(0, test1.compareTo(p));
        __CLR4_4_118cb18cblgchosj6.R.inc(57775);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(57776);test1.compareTo(null);
            __CLR4_4_118cb18cblgchosj6.R.inc(57777);fail();
        } catch (NullPointerException ex) {
        }
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
        __CLR4_4_118cb18cblgchosj6.R.inc(57778);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(57779);test1.compareTo(new TimeOfDay());
            __CLR4_4_118cb18cblgchosj6.R.inc(57780);fail();
        } catch (ClassCastException ex) {
        }
        __CLR4_4_118cb18cblgchosj6.R.inc(57781);Partial partial = new Partial()
                .with(DateTimeFieldType.centuryOfEra(), 1)
                .with(DateTimeFieldType.halfdayOfDay(), 0)
                .with(DateTimeFieldType.dayOfMonth(), 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57782);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(57783);new YearMonthDay(1970, 6, 9).compareTo(partial);
            __CLR4_4_118cb18cblgchosj6.R.inc(57784);fail();
        } catch (ClassCastException ex) {
        }
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsEqual_YMD() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jnelao18l5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testIsEqual_YMD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57785,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jnelao18l5(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57785);
        __CLR4_4_118cb18cblgchosj6.R.inc(57786);YearMonthDay test1 = new YearMonthDay(2005, 6, 2);
        __CLR4_4_118cb18cblgchosj6.R.inc(57787);YearMonthDay test1a = new YearMonthDay(2005, 6, 2);
        __CLR4_4_118cb18cblgchosj6.R.inc(57788);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_118cb18cblgchosj6.R.inc(57789);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_118cb18cblgchosj6.R.inc(57790);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_118cb18cblgchosj6.R.inc(57791);assertEquals(true, test1a.isEqual(test1a));

        __CLR4_4_118cb18cblgchosj6.R.inc(57792);YearMonthDay test2 = new YearMonthDay(2005, 7, 2);
        __CLR4_4_118cb18cblgchosj6.R.inc(57793);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_118cb18cblgchosj6.R.inc(57794);assertEquals(false, test2.isEqual(test1));

        __CLR4_4_118cb18cblgchosj6.R.inc(57795);YearMonthDay test3 = new YearMonthDay(2005, 7, 2, GregorianChronology.getInstanceUTC());
        __CLR4_4_118cb18cblgchosj6.R.inc(57796);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_118cb18cblgchosj6.R.inc(57797);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_118cb18cblgchosj6.R.inc(57798);assertEquals(true, test3.isEqual(test2));

        __CLR4_4_118cb18cblgchosj6.R.inc(57799);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(57800);new YearMonthDay(2005, 7, 2).isEqual(null);
            __CLR4_4_118cb18cblgchosj6.R.inc(57801);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsBefore_YMD() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1unyasz18lm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testIsBefore_YMD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57802,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1unyasz18lm(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57802);
        __CLR4_4_118cb18cblgchosj6.R.inc(57803);YearMonthDay test1 = new YearMonthDay(2005, 6, 2);
        __CLR4_4_118cb18cblgchosj6.R.inc(57804);YearMonthDay test1a = new YearMonthDay(2005, 6, 2);
        __CLR4_4_118cb18cblgchosj6.R.inc(57805);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_118cb18cblgchosj6.R.inc(57806);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_118cb18cblgchosj6.R.inc(57807);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_118cb18cblgchosj6.R.inc(57808);assertEquals(false, test1a.isBefore(test1a));

        __CLR4_4_118cb18cblgchosj6.R.inc(57809);YearMonthDay test2 = new YearMonthDay(2005, 7, 2);
        __CLR4_4_118cb18cblgchosj6.R.inc(57810);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_118cb18cblgchosj6.R.inc(57811);assertEquals(false, test2.isBefore(test1));

        __CLR4_4_118cb18cblgchosj6.R.inc(57812);YearMonthDay test3 = new YearMonthDay(2005, 7, 2, GregorianChronology.getInstanceUTC());
        __CLR4_4_118cb18cblgchosj6.R.inc(57813);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_118cb18cblgchosj6.R.inc(57814);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_118cb18cblgchosj6.R.inc(57815);assertEquals(false, test3.isBefore(test2));

        __CLR4_4_118cb18cblgchosj6.R.inc(57816);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(57817);new YearMonthDay(2005, 7, 2).isBefore(null);
            __CLR4_4_118cb18cblgchosj6.R.inc(57818);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsAfter_YMD() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16kkqw18m3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testIsAfter_YMD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16kkqw18m3(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57819);
        __CLR4_4_118cb18cblgchosj6.R.inc(57820);YearMonthDay test1 = new YearMonthDay(2005, 6, 2);
        __CLR4_4_118cb18cblgchosj6.R.inc(57821);YearMonthDay test1a = new YearMonthDay(2005, 6, 2);
        __CLR4_4_118cb18cblgchosj6.R.inc(57822);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_118cb18cblgchosj6.R.inc(57823);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_118cb18cblgchosj6.R.inc(57824);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_118cb18cblgchosj6.R.inc(57825);assertEquals(false, test1a.isAfter(test1a));

        __CLR4_4_118cb18cblgchosj6.R.inc(57826);YearMonthDay test2 = new YearMonthDay(2005, 7, 2);
        __CLR4_4_118cb18cblgchosj6.R.inc(57827);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_118cb18cblgchosj6.R.inc(57828);assertEquals(true, test2.isAfter(test1));

        __CLR4_4_118cb18cblgchosj6.R.inc(57829);YearMonthDay test3 = new YearMonthDay(2005, 7, 2, GregorianChronology.getInstanceUTC());
        __CLR4_4_118cb18cblgchosj6.R.inc(57830);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_118cb18cblgchosj6.R.inc(57831);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_118cb18cblgchosj6.R.inc(57832);assertEquals(false, test3.isAfter(test2));

        __CLR4_4_118cb18cblgchosj6.R.inc(57833);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(57834);new YearMonthDay(2005, 7, 2).isAfter(null);
            __CLR4_4_118cb18cblgchosj6.R.inc(57835);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithChronologyRetainFields_Chrono() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143gerp18mk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithChronologyRetainFields_Chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143gerp18mk(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57836);
        __CLR4_4_118cb18cblgchosj6.R.inc(57837);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        __CLR4_4_118cb18cblgchosj6.R.inc(57838);YearMonthDay test = base.withChronologyRetainFields(BUDDHIST_TOKYO);
        __CLR4_4_118cb18cblgchosj6.R.inc(57839);check(base, 2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57840);assertEquals(COPTIC_UTC, base.getChronology());
        __CLR4_4_118cb18cblgchosj6.R.inc(57841);check(test, 2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57842);assertEquals(BUDDHIST_UTC, test.getChronology());
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testWithChronologyRetainFields_sameChrono() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15b1wdb18mr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithChronologyRetainFields_sameChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15b1wdb18mr(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57843);
        __CLR4_4_118cb18cblgchosj6.R.inc(57844);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        __CLR4_4_118cb18cblgchosj6.R.inc(57845);YearMonthDay test = base.withChronologyRetainFields(COPTIC_TOKYO);
        __CLR4_4_118cb18cblgchosj6.R.inc(57846);assertSame(base, test);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testWithChronologyRetainFields_nullChrono() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0ft9a18mv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithChronologyRetainFields_nullChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0ft9a18mv(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57847);
        __CLR4_4_118cb18cblgchosj6.R.inc(57848);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        __CLR4_4_118cb18cblgchosj6.R.inc(57849);YearMonthDay test = base.withChronologyRetainFields(null);
        __CLR4_4_118cb18cblgchosj6.R.inc(57850);check(base, 2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57851);assertEquals(COPTIC_UTC, base.getChronology());
        __CLR4_4_118cb18cblgchosj6.R.inc(57852);check(test, 2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57853);assertEquals(ISO_UTC, test.getChronology());
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testWithChronologyRetainFields_invalidInNewChrono() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a802bj18n2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithChronologyRetainFields_invalidInNewChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a802bj18n2(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57854);
        __CLR4_4_118cb18cblgchosj6.R.inc(57855);YearMonthDay base = new YearMonthDay(2005, 1, 31, ISO_UTC);
        __CLR4_4_118cb18cblgchosj6.R.inc(57856);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(57857);base.withChronologyRetainFields(COPTIC_UTC);
            __CLR4_4_118cb18cblgchosj6.R.inc(57858);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithField1() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lke16y18n7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithField1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lke16y18n7(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57859);
        __CLR4_4_118cb18cblgchosj6.R.inc(57860);YearMonthDay test = new YearMonthDay(2004, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57861);YearMonthDay result = test.withField(DateTimeFieldType.year(), 2006);

        __CLR4_4_118cb18cblgchosj6.R.inc(57862);assertEquals(new YearMonthDay(2004, 6, 9), test);
        __CLR4_4_118cb18cblgchosj6.R.inc(57863);assertEquals(new YearMonthDay(2006, 6, 9), result);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testWithField2() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ibe2eh18nc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithField2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ibe2eh18nc(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57864);
        __CLR4_4_118cb18cblgchosj6.R.inc(57865);YearMonthDay test = new YearMonthDay(2004, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57866);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(57867);test.withField(null, 6);
            __CLR4_4_118cb18cblgchosj6.R.inc(57868);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testWithField3() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2e3m018nh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithField3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57869,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2e3m018nh(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57869);
        __CLR4_4_118cb18cblgchosj6.R.inc(57870);YearMonthDay test = new YearMonthDay(2004, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57871);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(57872);test.withField(DateTimeFieldType.hourOfDay(), 6);
            __CLR4_4_118cb18cblgchosj6.R.inc(57873);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testWithField4() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bte4tj18nm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithField4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bte4tj18nm(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57874);
        __CLR4_4_118cb18cblgchosj6.R.inc(57875);YearMonthDay test = new YearMonthDay(2004, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57876);YearMonthDay result = test.withField(DateTimeFieldType.year(), 2004);
        __CLR4_4_118cb18cblgchosj6.R.inc(57877);assertEquals(new YearMonthDay(2004, 6, 9), test);
        __CLR4_4_118cb18cblgchosj6.R.inc(57878);assertSame(test, result);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithFieldAdded1() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rgt2218nr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithFieldAdded1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rgt2218nr(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57879);
        __CLR4_4_118cb18cblgchosj6.R.inc(57880);YearMonthDay test = new YearMonthDay(2004, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57881);YearMonthDay result = test.withFieldAdded(DurationFieldType.years(), 6);

        __CLR4_4_118cb18cblgchosj6.R.inc(57882);assertEquals(new YearMonthDay(2004, 6, 9), test);
        __CLR4_4_118cb18cblgchosj6.R.inc(57883);assertEquals(new YearMonthDay(2010, 6, 9), result);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded2() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_150gruj18nw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithFieldAdded2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57884,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_150gruj18nw(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57884);
        __CLR4_4_118cb18cblgchosj6.R.inc(57885);YearMonthDay test = new YearMonthDay(2004, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57886);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(57887);test.withFieldAdded(null, 0);
            __CLR4_4_118cb18cblgchosj6.R.inc(57888);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded3() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189gqn018o1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithFieldAdded3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57889,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189gqn018o1(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57889);
        __CLR4_4_118cb18cblgchosj6.R.inc(57890);YearMonthDay test = new YearMonthDay(2004, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57891);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(57892);test.withFieldAdded(null, 6);
            __CLR4_4_118cb18cblgchosj6.R.inc(57893);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded4() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bigpfh18o6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithFieldAdded4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bigpfh18o6(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57894);
        __CLR4_4_118cb18cblgchosj6.R.inc(57895);YearMonthDay test = new YearMonthDay(2004, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57896);YearMonthDay result = test.withFieldAdded(DurationFieldType.years(), 0);
        __CLR4_4_118cb18cblgchosj6.R.inc(57897);assertSame(test, result);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded5() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ergo7y18oa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithFieldAdded5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ergo7y18oa(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57898);
        __CLR4_4_118cb18cblgchosj6.R.inc(57899);YearMonthDay test = new YearMonthDay(2004, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57900);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(57901);test.withFieldAdded(DurationFieldType.hours(), 6);
            __CLR4_4_118cb18cblgchosj6.R.inc(57902);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPlus_RP() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz83ig18of();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz83ig18of(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57903);
        __CLR4_4_118cb18cblgchosj6.R.inc(57904);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        __CLR4_4_118cb18cblgchosj6.R.inc(57905);YearMonthDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        __CLR4_4_118cb18cblgchosj6.R.inc(57906);YearMonthDay expected = new YearMonthDay(2003, 7, 7, BuddhistChronology.getInstance());
        __CLR4_4_118cb18cblgchosj6.R.inc(57907);assertEquals(expected, result);

        __CLR4_4_118cb18cblgchosj6.R.inc(57908);result = test.plus((ReadablePeriod) null);
        __CLR4_4_118cb18cblgchosj6.R.inc(57909);assertSame(test, result);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testPlusYears_int() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mx5kpt18om();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mx5kpt18om(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57910);
        __CLR4_4_118cb18cblgchosj6.R.inc(57911);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        __CLR4_4_118cb18cblgchosj6.R.inc(57912);YearMonthDay result = test.plusYears(1);
        __CLR4_4_118cb18cblgchosj6.R.inc(57913);YearMonthDay expected = new YearMonthDay(2003, 5, 3, BuddhistChronology.getInstance());
        __CLR4_4_118cb18cblgchosj6.R.inc(57914);assertEquals(expected, result);

        __CLR4_4_118cb18cblgchosj6.R.inc(57915);result = test.plusYears(0);
        __CLR4_4_118cb18cblgchosj6.R.inc(57916);assertSame(test, result);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testPlusMonths_int() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170gxai18ot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170gxai18ot(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57917);
        __CLR4_4_118cb18cblgchosj6.R.inc(57918);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        __CLR4_4_118cb18cblgchosj6.R.inc(57919);YearMonthDay result = test.plusMonths(1);
        __CLR4_4_118cb18cblgchosj6.R.inc(57920);YearMonthDay expected = new YearMonthDay(2002, 6, 3, BuddhistChronology.getInstance());
        __CLR4_4_118cb18cblgchosj6.R.inc(57921);assertEquals(expected, result);

        __CLR4_4_118cb18cblgchosj6.R.inc(57922);result = test.plusMonths(0);
        __CLR4_4_118cb18cblgchosj6.R.inc(57923);assertSame(test, result);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testPlusDays_int() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpmvkq18p0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57924,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpmvkq18p0(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57924);
        __CLR4_4_118cb18cblgchosj6.R.inc(57925);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        __CLR4_4_118cb18cblgchosj6.R.inc(57926);YearMonthDay result = test.plusDays(1);
        __CLR4_4_118cb18cblgchosj6.R.inc(57927);YearMonthDay expected = new YearMonthDay(2002, 5, 4, BuddhistChronology.getInstance());
        __CLR4_4_118cb18cblgchosj6.R.inc(57928);assertEquals(expected, result);

        __CLR4_4_118cb18cblgchosj6.R.inc(57929);result = test.plusDays(0);
        __CLR4_4_118cb18cblgchosj6.R.inc(57930);assertSame(test, result);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMinus_RP() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112cpdm18p7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57931,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112cpdm18p7(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57931);
        __CLR4_4_118cb18cblgchosj6.R.inc(57932);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        __CLR4_4_118cb18cblgchosj6.R.inc(57933);YearMonthDay result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        __CLR4_4_118cb18cblgchosj6.R.inc(57934);YearMonthDay expected = new YearMonthDay(2001, 4, 2, BuddhistChronology.getInstance());
        __CLR4_4_118cb18cblgchosj6.R.inc(57935);assertEquals(expected, result);

        __CLR4_4_118cb18cblgchosj6.R.inc(57936);result = test.minus((ReadablePeriod) null);
        __CLR4_4_118cb18cblgchosj6.R.inc(57937);assertSame(test, result);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testMinusYears_int() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9qdin18pe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9qdin18pe(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57938);
        __CLR4_4_118cb18cblgchosj6.R.inc(57939);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        __CLR4_4_118cb18cblgchosj6.R.inc(57940);YearMonthDay result = test.minusYears(1);
        __CLR4_4_118cb18cblgchosj6.R.inc(57941);YearMonthDay expected = new YearMonthDay(2001, 5, 3, BuddhistChronology.getInstance());
        __CLR4_4_118cb18cblgchosj6.R.inc(57942);assertEquals(expected, result);

        __CLR4_4_118cb18cblgchosj6.R.inc(57943);result = test.minusYears(0);
        __CLR4_4_118cb18cblgchosj6.R.inc(57944);assertSame(test, result);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testMinusMonths_int() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6k4go18pl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6k4go18pl(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57945);
        __CLR4_4_118cb18cblgchosj6.R.inc(57946);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        __CLR4_4_118cb18cblgchosj6.R.inc(57947);YearMonthDay result = test.minusMonths(1);
        __CLR4_4_118cb18cblgchosj6.R.inc(57948);YearMonthDay expected = new YearMonthDay(2002, 4, 3, BuddhistChronology.getInstance());
        __CLR4_4_118cb18cblgchosj6.R.inc(57949);assertEquals(expected, result);

        __CLR4_4_118cb18cblgchosj6.R.inc(57950);result = test.minusMonths(0);
        __CLR4_4_118cb18cblgchosj6.R.inc(57951);assertSame(test, result);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testMinusDays_int() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hpufck18ps();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hpufck18ps(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57952);
        __CLR4_4_118cb18cblgchosj6.R.inc(57953);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        __CLR4_4_118cb18cblgchosj6.R.inc(57954);YearMonthDay result = test.minusDays(1);
        __CLR4_4_118cb18cblgchosj6.R.inc(57955);YearMonthDay expected = new YearMonthDay(2002, 5, 2, BuddhistChronology.getInstance());
        __CLR4_4_118cb18cblgchosj6.R.inc(57956);assertEquals(expected, result);

        __CLR4_4_118cb18cblgchosj6.R.inc(57957);result = test.minusDays(0);
        __CLR4_4_118cb18cblgchosj6.R.inc(57958);assertSame(test, result);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToLocalDate() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1orir18pz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57959,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1orir18pz(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57959);
        __CLR4_4_118cb18cblgchosj6.R.inc(57960);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_UTC);
        __CLR4_4_118cb18cblgchosj6.R.inc(57961);LocalDate test = base.toLocalDate();
        __CLR4_4_118cb18cblgchosj6.R.inc(57962);assertEquals(new LocalDate(2005, 6, 9, COPTIC_UTC), test);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTimeAtMidnight() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15kwl0u18q3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtMidnight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15kwl0u18q3(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57963);
        __CLR4_4_118cb18cblgchosj6.R.inc(57964);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);

        __CLR4_4_118cb18cblgchosj6.R.inc(57965);DateTime test = base.toDateTimeAtMidnight();
        __CLR4_4_118cb18cblgchosj6.R.inc(57966);check(base, 2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57967);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTimeAtMidnight_Zone() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1baa12118q8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtMidnight_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57968,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1baa12118q8(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57968);
        __CLR4_4_118cb18cblgchosj6.R.inc(57969);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);

        __CLR4_4_118cb18cblgchosj6.R.inc(57970);DateTime test = base.toDateTimeAtMidnight(TOKYO);
        __CLR4_4_118cb18cblgchosj6.R.inc(57971);check(base, 2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57972);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_TOKYO), test);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testToDateTimeAtMidnight_nullZone() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wkup1q18qd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtMidnight_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57973,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wkup1q18qd(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57973);
        __CLR4_4_118cb18cblgchosj6.R.inc(57974);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);

        __CLR4_4_118cb18cblgchosj6.R.inc(57975);DateTime test = base.toDateTimeAtMidnight((DateTimeZone) null);
        __CLR4_4_118cb18cblgchosj6.R.inc(57976);check(base, 2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57977);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTimeAtCurrentTime() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nxkfla18qi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtCurrentTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57978,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nxkfla18qi(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57978);
        __CLR4_4_118cb18cblgchosj6.R.inc(57979);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_118cb18cblgchosj6.R.inc(57980);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57981);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());

        __CLR4_4_118cb18cblgchosj6.R.inc(57982);DateTime test = base.toDateTimeAtCurrentTime();
        __CLR4_4_118cb18cblgchosj6.R.inc(57983);check(base, 2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57984);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON);
        __CLR4_4_118cb18cblgchosj6.R.inc(57985);expected = expected.year().setCopy(2005);
        __CLR4_4_118cb18cblgchosj6.R.inc(57986);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_118cb18cblgchosj6.R.inc(57987);expected = expected.dayOfMonth().setCopy(9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57988);assertEquals(expected, test);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTimeAtCurrentTime_Zone() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),57989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pbzvx518qt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtCurrentTime_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57989,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pbzvx518qt(){try{__CLR4_4_118cb18cblgchosj6.R.inc(57989);
        __CLR4_4_118cb18cblgchosj6.R.inc(57990);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_118cb18cblgchosj6.R.inc(57991);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57992);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());

        __CLR4_4_118cb18cblgchosj6.R.inc(57993);DateTime test = base.toDateTimeAtCurrentTime(TOKYO);
        __CLR4_4_118cb18cblgchosj6.R.inc(57994);check(base, 2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57995);DateTime expected = new DateTime(dt.getMillis(), COPTIC_TOKYO);
        __CLR4_4_118cb18cblgchosj6.R.inc(57996);expected = expected.year().setCopy(2005);
        __CLR4_4_118cb18cblgchosj6.R.inc(57997);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_118cb18cblgchosj6.R.inc(57998);expected = expected.dayOfMonth().setCopy(9);
        __CLR4_4_118cb18cblgchosj6.R.inc(57999);assertEquals(expected, test);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testToDateTimeAtCurrentTime_nullZone() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),58000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sccwr218r4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtCurrentTime_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sccwr218r4(){try{__CLR4_4_118cb18cblgchosj6.R.inc(58000);
        __CLR4_4_118cb18cblgchosj6.R.inc(58001);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_118cb18cblgchosj6.R.inc(58002);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58003);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());

        __CLR4_4_118cb18cblgchosj6.R.inc(58004);DateTime test = base.toDateTimeAtCurrentTime((DateTimeZone) null);
        __CLR4_4_118cb18cblgchosj6.R.inc(58005);check(base, 2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58006);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON);
        __CLR4_4_118cb18cblgchosj6.R.inc(58007);expected = expected.year().setCopy(2005);
        __CLR4_4_118cb18cblgchosj6.R.inc(58008);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_118cb18cblgchosj6.R.inc(58009);expected = expected.dayOfMonth().setCopy(9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58010);assertEquals(expected, test);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTime_TOD() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),58011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5cus918rf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTime_TOD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5cus918rf(){try{__CLR4_4_118cb18cblgchosj6.R.inc(58011);
        __CLR4_4_118cb18cblgchosj6.R.inc(58012);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_118cb18cblgchosj6.R.inc(58013);TimeOfDay tod = new TimeOfDay(12, 13, 14, 15, BUDDHIST_TOKYO);

        __CLR4_4_118cb18cblgchosj6.R.inc(58014);DateTime test = base.toDateTime(tod);
        __CLR4_4_118cb18cblgchosj6.R.inc(58015);check(base, 2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58016);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON);
        __CLR4_4_118cb18cblgchosj6.R.inc(58017);assertEquals(expected, test);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testToDateTime_nullTOD() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),58018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1te876a18rm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTime_nullTOD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58018,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1te876a18rm(){try{__CLR4_4_118cb18cblgchosj6.R.inc(58018);
        __CLR4_4_118cb18cblgchosj6.R.inc(58019);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_118cb18cblgchosj6.R.inc(58020);long now = new DateTime(2004, 5, 8, 12, 13, 14, 15, COPTIC_LONDON).getMillis();
        __CLR4_4_118cb18cblgchosj6.R.inc(58021);DateTimeUtils.setCurrentMillisFixed(now);

        __CLR4_4_118cb18cblgchosj6.R.inc(58022);DateTime test = base.toDateTime((TimeOfDay) null);
        __CLR4_4_118cb18cblgchosj6.R.inc(58023);check(base, 2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58024);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON);
        __CLR4_4_118cb18cblgchosj6.R.inc(58025);assertEquals(expected, test);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTime_TOD_Zone() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),58026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_123egu818ru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTime_TOD_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58026,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_123egu818ru(){try{__CLR4_4_118cb18cblgchosj6.R.inc(58026);
        __CLR4_4_118cb18cblgchosj6.R.inc(58027);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_118cb18cblgchosj6.R.inc(58028);TimeOfDay tod = new TimeOfDay(12, 13, 14, 15, BUDDHIST_TOKYO);

        __CLR4_4_118cb18cblgchosj6.R.inc(58029);DateTime test = base.toDateTime(tod, TOKYO);
        __CLR4_4_118cb18cblgchosj6.R.inc(58030);check(base, 2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58031);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_TOKYO);
        __CLR4_4_118cb18cblgchosj6.R.inc(58032);assertEquals(expected, test);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testToDateTime_TOD_nullZone() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),58033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a0m8dj18s1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTime_TOD_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58033,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a0m8dj18s1(){try{__CLR4_4_118cb18cblgchosj6.R.inc(58033);
        __CLR4_4_118cb18cblgchosj6.R.inc(58034);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_118cb18cblgchosj6.R.inc(58035);TimeOfDay tod = new TimeOfDay(12, 13, 14, 15, BUDDHIST_TOKYO);

        __CLR4_4_118cb18cblgchosj6.R.inc(58036);DateTime test = base.toDateTime(tod, null);
        __CLR4_4_118cb18cblgchosj6.R.inc(58037);check(base, 2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58038);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON);
        __CLR4_4_118cb18cblgchosj6.R.inc(58039);assertEquals(expected, test);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testToDateTime_nullTOD_Zone() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),58040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w71h9518s8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTime_nullTOD_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58040,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w71h9518s8(){try{__CLR4_4_118cb18cblgchosj6.R.inc(58040);
        __CLR4_4_118cb18cblgchosj6.R.inc(58041);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_118cb18cblgchosj6.R.inc(58042);long now = new DateTime(2004, 5, 8, 12, 13, 14, 15, COPTIC_TOKYO).getMillis();
        __CLR4_4_118cb18cblgchosj6.R.inc(58043);DateTimeUtils.setCurrentMillisFixed(now);

        __CLR4_4_118cb18cblgchosj6.R.inc(58044);DateTime test = base.toDateTime((TimeOfDay) null, TOKYO);
        __CLR4_4_118cb18cblgchosj6.R.inc(58045);check(base, 2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58046);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_TOKYO);
        __CLR4_4_118cb18cblgchosj6.R.inc(58047);assertEquals(expected, test);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateMidnight() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),58048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1osch5e18sg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateMidnight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58048,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1osch5e18sg(){try{__CLR4_4_118cb18cblgchosj6.R.inc(58048);
        __CLR4_4_118cb18cblgchosj6.R.inc(58049);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);

        __CLR4_4_118cb18cblgchosj6.R.inc(58050);DateMidnight test = base.toDateMidnight();
        __CLR4_4_118cb18cblgchosj6.R.inc(58051);check(base, 2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58052);assertEquals(new DateMidnight(2005, 6, 9, COPTIC_LONDON), test);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateMidnight_Zone() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),58053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11f3vmv18sl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateMidnight_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58053,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11f3vmv18sl(){try{__CLR4_4_118cb18cblgchosj6.R.inc(58053);
        __CLR4_4_118cb18cblgchosj6.R.inc(58054);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);

        __CLR4_4_118cb18cblgchosj6.R.inc(58055);DateMidnight test = base.toDateMidnight(TOKYO);
        __CLR4_4_118cb18cblgchosj6.R.inc(58056);check(base, 2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58057);assertEquals(new DateMidnight(2005, 6, 9, COPTIC_TOKYO), test);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testToDateMidnight_nullZone() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),58058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15031fy18sq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateMidnight_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58058,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15031fy18sq(){try{__CLR4_4_118cb18cblgchosj6.R.inc(58058);
        __CLR4_4_118cb18cblgchosj6.R.inc(58059);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);

        __CLR4_4_118cb18cblgchosj6.R.inc(58060);DateMidnight test = base.toDateMidnight((DateTimeZone) null);
        __CLR4_4_118cb18cblgchosj6.R.inc(58061);check(base, 2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58062);assertEquals(new DateMidnight(2005, 6, 9, COPTIC_LONDON), test);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTime_RI() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),58063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1584tmd18sv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTime_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1584tmd18sv(){try{__CLR4_4_118cb18cblgchosj6.R.inc(58063);
        __CLR4_4_118cb18cblgchosj6.R.inc(58064);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        __CLR4_4_118cb18cblgchosj6.R.inc(58065);DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);

        __CLR4_4_118cb18cblgchosj6.R.inc(58066);DateTime test = base.toDateTime(dt);
        __CLR4_4_118cb18cblgchosj6.R.inc(58067);check(base, 2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58068);DateTime expected = dt;
        __CLR4_4_118cb18cblgchosj6.R.inc(58069);expected = expected.year().setCopy(2005);
        __CLR4_4_118cb18cblgchosj6.R.inc(58070);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_118cb18cblgchosj6.R.inc(58071);expected = expected.dayOfMonth().setCopy(9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58072);assertEquals(expected, test);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testToDateTime_nullRI() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),58073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xlns418t5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTime_nullRI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58073,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xlns418t5(){try{__CLR4_4_118cb18cblgchosj6.R.inc(58073);
        __CLR4_4_118cb18cblgchosj6.R.inc(58074);YearMonthDay base = new YearMonthDay(2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58075);DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);
        __CLR4_4_118cb18cblgchosj6.R.inc(58076);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());

        __CLR4_4_118cb18cblgchosj6.R.inc(58077);DateTime test = base.toDateTime((ReadableInstant) null);
        __CLR4_4_118cb18cblgchosj6.R.inc(58078);check(base, 2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58079);DateTime expected = dt;
        __CLR4_4_118cb18cblgchosj6.R.inc(58080);expected = expected.year().setCopy(2005);
        __CLR4_4_118cb18cblgchosj6.R.inc(58081);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_118cb18cblgchosj6.R.inc(58082);expected = expected.dayOfMonth().setCopy(9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58083);assertEquals(expected, test);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToInterval() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),58084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cj50gp18tg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58084,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cj50gp18tg(){try{__CLR4_4_118cb18cblgchosj6.R.inc(58084);
        __CLR4_4_118cb18cblgchosj6.R.inc(58085);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_118cb18cblgchosj6.R.inc(58086);Interval test = base.toInterval();
        __CLR4_4_118cb18cblgchosj6.R.inc(58087);check(base, 2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58088);DateTime start = base.toDateTime(TimeOfDay.MIDNIGHT);
        __CLR4_4_118cb18cblgchosj6.R.inc(58089);DateTime end = start.plus(Period.days(1));
        __CLR4_4_118cb18cblgchosj6.R.inc(58090);Interval expected = new Interval(start, end);
        __CLR4_4_118cb18cblgchosj6.R.inc(58091);assertEquals(expected, test);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToInterval_Zone() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),58092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpa0zk18to();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToInterval_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpa0zk18to(){try{__CLR4_4_118cb18cblgchosj6.R.inc(58092);
        __CLR4_4_118cb18cblgchosj6.R.inc(58093);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_118cb18cblgchosj6.R.inc(58094);Interval test = base.toInterval(TOKYO);
        __CLR4_4_118cb18cblgchosj6.R.inc(58095);check(base, 2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58096);DateTime start = base.toDateTime(TimeOfDay.MIDNIGHT, TOKYO);
        __CLR4_4_118cb18cblgchosj6.R.inc(58097);DateTime end = start.plus(Period.days(1));
        __CLR4_4_118cb18cblgchosj6.R.inc(58098);Interval expected = new Interval(start, end);
        __CLR4_4_118cb18cblgchosj6.R.inc(58099);assertEquals(expected, test);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    @Test
    public void testToInterval_nullZone() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),58100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19hp1i118tw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToInterval_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19hp1i118tw(){try{__CLR4_4_118cb18cblgchosj6.R.inc(58100);
        __CLR4_4_118cb18cblgchosj6.R.inc(58101);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_118cb18cblgchosj6.R.inc(58102);Interval test = base.toInterval(null);
        __CLR4_4_118cb18cblgchosj6.R.inc(58103);check(base, 2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58104);DateTime start = base.toDateTime(TimeOfDay.MIDNIGHT, LONDON);
        __CLR4_4_118cb18cblgchosj6.R.inc(58105);DateTime end = start.plus(Period.days(1));
        __CLR4_4_118cb18cblgchosj6.R.inc(58106);Interval expected = new Interval(start, end);
        __CLR4_4_118cb18cblgchosj6.R.inc(58107);assertEquals(expected, test);
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithers() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),58108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn9jzp18u4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn9jzp18u4(){try{__CLR4_4_118cb18cblgchosj6.R.inc(58108);
        __CLR4_4_118cb18cblgchosj6.R.inc(58109);YearMonthDay test = new YearMonthDay(1970, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58110);check(test.withYear(2000), 2000, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58111);check(test.withMonthOfYear(2), 1970, 2, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58112);check(test.withDayOfMonth(2), 1970, 6, 2);
        __CLR4_4_118cb18cblgchosj6.R.inc(58113);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(58114);test.withMonthOfYear(0);
            __CLR4_4_118cb18cblgchosj6.R.inc(58115);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_118cb18cblgchosj6.R.inc(58116);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(58117);test.withMonthOfYear(13);
            __CLR4_4_118cb18cblgchosj6.R.inc(58118);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testProperty() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),58119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7neoi18uf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7neoi18uf(){try{__CLR4_4_118cb18cblgchosj6.R.inc(58119);
        __CLR4_4_118cb18cblgchosj6.R.inc(58120);YearMonthDay test = new YearMonthDay(2005, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58121);assertEquals(test.year(), test.property(DateTimeFieldType.year()));
        __CLR4_4_118cb18cblgchosj6.R.inc(58122);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear()));
        __CLR4_4_118cb18cblgchosj6.R.inc(58123);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_118cb18cblgchosj6.R.inc(58124);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(58125);test.property(DateTimeFieldType.millisOfDay());
            __CLR4_4_118cb18cblgchosj6.R.inc(58126);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_118cb18cblgchosj6.R.inc(58127);try {
            __CLR4_4_118cb18cblgchosj6.R.inc(58128);test.property(null);
            __CLR4_4_118cb18cblgchosj6.R.inc(58129);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),58130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on918uq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on918uq() throws Exception{try{__CLR4_4_118cb18cblgchosj6.R.inc(58130);
        __CLR4_4_118cb18cblgchosj6.R.inc(58131);YearMonthDay test = new YearMonthDay(1972, 6, 9, COPTIC_PARIS);

        __CLR4_4_118cb18cblgchosj6.R.inc(58132);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_118cb18cblgchosj6.R.inc(58133);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_118cb18cblgchosj6.R.inc(58134);oos.writeObject(test);
        __CLR4_4_118cb18cblgchosj6.R.inc(58135);oos.close();
        __CLR4_4_118cb18cblgchosj6.R.inc(58136);byte[] bytes = baos.toByteArray();

        __CLR4_4_118cb18cblgchosj6.R.inc(58137);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_118cb18cblgchosj6.R.inc(58138);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_118cb18cblgchosj6.R.inc(58139);YearMonthDay result = (YearMonthDay) ois.readObject();
        __CLR4_4_118cb18cblgchosj6.R.inc(58140);ois.close();

        __CLR4_4_118cb18cblgchosj6.R.inc(58141);assertEquals(test, result);
        __CLR4_4_118cb18cblgchosj6.R.inc(58142);assertTrue(Arrays.equals(test.getValues(), result.getValues()));
        __CLR4_4_118cb18cblgchosj6.R.inc(58143);assertTrue(Arrays.equals(test.getFields(), result.getFields()));
        __CLR4_4_118cb18cblgchosj6.R.inc(58144);assertEquals(test.getChronology(), result.getChronology());
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),58145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid18v5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58145,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid18v5(){try{__CLR4_4_118cb18cblgchosj6.R.inc(58145);
        __CLR4_4_118cb18cblgchosj6.R.inc(58146);YearMonthDay test = new YearMonthDay(2002, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58147);assertEquals("2002-06-09", test.toString());
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_String() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),58148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llkh2x18v8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToString_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llkh2x18v8(){try{__CLR4_4_118cb18cblgchosj6.R.inc(58148);
        __CLR4_4_118cb18cblgchosj6.R.inc(58149);YearMonthDay test = new YearMonthDay(2002, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58150);assertEquals("2002 \ufffd\ufffd", test.toString("yyyy HH"));
        __CLR4_4_118cb18cblgchosj6.R.inc(58151);assertEquals("2002-06-09", test.toString((String) null));
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_String_Locale() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),58152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1afd64u18vc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToString_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58152,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1afd64u18vc(){try{__CLR4_4_118cb18cblgchosj6.R.inc(58152);
        __CLR4_4_118cb18cblgchosj6.R.inc(58153);YearMonthDay test = new YearMonthDay(2002, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58154);assertEquals("\ufffd 9/6", test.toString("EEE d/M", Locale.ENGLISH));
        __CLR4_4_118cb18cblgchosj6.R.inc(58155);assertEquals("\ufffd 9/6", test.toString("EEE d/M", Locale.FRENCH));
        __CLR4_4_118cb18cblgchosj6.R.inc(58156);assertEquals("2002-06-09", test.toString(null, Locale.ENGLISH));
        __CLR4_4_118cb18cblgchosj6.R.inc(58157);assertEquals("\ufffd 9/6", test.toString("EEE d/M", null));
        __CLR4_4_118cb18cblgchosj6.R.inc(58158);assertEquals("2002-06-09", test.toString(null, null));
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_DTFormatter() {__CLR4_4_118cb18cblgchosj6.R.globalSliceStart(getClass().getName(),58159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxbkps18vj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118cb18cblgchosj6.R.rethrow($CLV_t2$);}finally{__CLR4_4_118cb18cblgchosj6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToString_DTFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58159,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxbkps18vj(){try{__CLR4_4_118cb18cblgchosj6.R.inc(58159);
        __CLR4_4_118cb18cblgchosj6.R.inc(58160);YearMonthDay test = new YearMonthDay(2002, 6, 9);
        __CLR4_4_118cb18cblgchosj6.R.inc(58161);assertEquals("2002 \ufffd\ufffd", test.toString(DateTimeFormat.forPattern("yyyy HH")));
        __CLR4_4_118cb18cblgchosj6.R.inc(58162);assertEquals("2002-06-09", test.toString((DateTimeFormatter) null));
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(YearMonthDay test, int hour, int min, int sec) {try{__CLR4_4_118cb18cblgchosj6.R.inc(58163);
        __CLR4_4_118cb18cblgchosj6.R.inc(58164);assertEquals(hour, test.getYear());
        __CLR4_4_118cb18cblgchosj6.R.inc(58165);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_118cb18cblgchosj6.R.inc(58166);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_118cb18cblgchosj6.R.flushNeeded();}}
}
