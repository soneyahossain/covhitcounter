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

import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestPeriod_Constructors {static class __CLR4_4_1152z152zlgchosfu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,54702,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

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

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Throwable {try{__CLR4_4_1152z152zlgchosfu.R.inc(53243);
        __CLR4_4_1152z152zlgchosfu.R.inc(53244);TestPeriod_Constructors TB = new TestPeriod_Constructors();
        __CLR4_4_1152z152zlgchosfu.R.inc(53245);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53246);TB.testConstants();
        __CLR4_4_1152z152zlgchosfu.R.inc(53247);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53248);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53249);TB.testParse_noFormatter();
        __CLR4_4_1152z152zlgchosfu.R.inc(53250);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53251);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53252);TB.testConstructor1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53253);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53254);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53255);TB.testConstructor_long1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53256);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53257);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53258);TB.testConstructor_long2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53259);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53260);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53261);TB.testConstructor_long3();
        __CLR4_4_1152z152zlgchosfu.R.inc(53262);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53263);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53264);TB.testConstructor_long_fixedZone();
        __CLR4_4_1152z152zlgchosfu.R.inc(53265);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53266);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53267);TB.testConstructor_long_PeriodType1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53268);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53269);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53270);TB.testConstructor_long_PeriodType2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53271);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53272);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53273);TB.testConstructor_long_PeriodType3();
        __CLR4_4_1152z152zlgchosfu.R.inc(53274);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53275);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53276);TB.testConstructor_long_PeriodType4();
        __CLR4_4_1152z152zlgchosfu.R.inc(53277);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53278);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53279);TB.testConstructor_long_Chronology1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53280);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53281);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53282);TB.testConstructor_long_Chronology2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53283);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53284);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53285);TB.testConstructor_long_Chronology3();
        __CLR4_4_1152z152zlgchosfu.R.inc(53286);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53287);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53288);TB.testConstructor_long_PeriodType_Chronology1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53289);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53290);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53291);TB.testConstructor_long_PeriodType_Chronology2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53292);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53293);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53294);TB.testConstructor_long_PeriodType_Chronology3();
        __CLR4_4_1152z152zlgchosfu.R.inc(53295);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53296);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53297);TB.testConstructor_long_PeriodType_Chronology4();
        __CLR4_4_1152z152zlgchosfu.R.inc(53298);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53299);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53300);TB.testConstructor_4int1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53301);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53302);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53303);TB.testConstructor_8int1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53304);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53305);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53306);TB.testConstructor_8int__PeriodType1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53307);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53308);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53309);TB.testConstructor_8int__PeriodType2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53310);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53311);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53312);TB.testConstructor_8int__PeriodType3();
        __CLR4_4_1152z152zlgchosfu.R.inc(53313);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53314);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53315);TB.testConstructor_long_long1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53316);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53317);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53318);TB.testConstructor_long_long2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53319);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53320);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53321);TB.testConstructor_long_long_PeriodType1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53322);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53323);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53324);TB.testConstructor_long_long_PeriodType2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53325);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53326);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53327);TB.testConstructor_long_long_PeriodType3();
        __CLR4_4_1152z152zlgchosfu.R.inc(53328);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53329);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53330);TB.testToPeriod_PeriodType3();
        __CLR4_4_1152z152zlgchosfu.R.inc(53331);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53332);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53333);TB.testConstructor_long_long_Chronology1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53334);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53335);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53336);TB.testConstructor_long_long_Chronology2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53337);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53338);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53339);TB.testConstructor_long_long_PeriodType_Chronology1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53340);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53341);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53342);TB.testConstructor_long_long_PeriodType_Chronology2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53343);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53344);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53345);TB.testConstructor_RI_RI1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53346);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53347);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53348);TB.testConstructor_RI_RI2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53349);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53350);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53351);TB.testConstructor_RI_RI3();
        __CLR4_4_1152z152zlgchosfu.R.inc(53352);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53353);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53354);TB.testConstructor_RI_RI4();
        __CLR4_4_1152z152zlgchosfu.R.inc(53355);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53356);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53357);TB.testConstructor_RI_RI5();
        __CLR4_4_1152z152zlgchosfu.R.inc(53358);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53359);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53360);TB.testConstructor_RI_RI6();
        __CLR4_4_1152z152zlgchosfu.R.inc(53361);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53362);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53363);TB.testConstructor_RI_RI7();
        __CLR4_4_1152z152zlgchosfu.R.inc(53364);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53365);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53366);TB.testConstructor_RI_RI_PeriodType1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53367);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53368);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53369);TB.testConstructor_RI_RI_PeriodType2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53370);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53371);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53372);TB.testConstructor_RI_RI_PeriodType3();
        __CLR4_4_1152z152zlgchosfu.R.inc(53373);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53374);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53375);TB.testConstructor_RI_RI_PeriodType4();
        __CLR4_4_1152z152zlgchosfu.R.inc(53376);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53377);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53378);TB.testConstructor_RI_RI_PeriodType5();
        __CLR4_4_1152z152zlgchosfu.R.inc(53379);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53380);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53381);TB.testConstructor_RP_RP1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53382);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53383);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53384);TB.testConstructor_RP_RP2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53385);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53386);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53387);TB.testConstructor_RP_RP2Local();
        __CLR4_4_1152z152zlgchosfu.R.inc(53388);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53389);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53390);TB.testConstructor_RP_RP3();
        __CLR4_4_1152z152zlgchosfu.R.inc(53391);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53392);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53393);TB.testConstructor_RP_RP4();
        __CLR4_4_1152z152zlgchosfu.R.inc(53394);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53395);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53396);TB.testConstructor_RP_RP5();
        __CLR4_4_1152z152zlgchosfu.R.inc(53397);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53398);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53399);TB.testConstructor_RP_RP6();
        __CLR4_4_1152z152zlgchosfu.R.inc(53400);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53401);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53402);TB.testConstructor_RP_RP7();
        __CLR4_4_1152z152zlgchosfu.R.inc(53403);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53404);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53405);TB.testConstructor_RP_RP8();
        __CLR4_4_1152z152zlgchosfu.R.inc(53406);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53407);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53408);TB.testConstructor_RP_RP_PeriodType1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53409);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53410);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53411);TB.testConstructor_RP_RP_PeriodType2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53412);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53413);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53414);TB.testConstructor_RP_RP_PeriodType2Local();
        __CLR4_4_1152z152zlgchosfu.R.inc(53415);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53416);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53417);TB.testConstructor_RP_RP_PeriodType3();
        __CLR4_4_1152z152zlgchosfu.R.inc(53418);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53419);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53420);TB.testConstructor_RP_RP_PeriodType4();
        __CLR4_4_1152z152zlgchosfu.R.inc(53421);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53422);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53423);TB.testConstructor_RP_RP_PeriodType5();
        __CLR4_4_1152z152zlgchosfu.R.inc(53424);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53425);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53426);TB.testConstructor_RP_RP_PeriodType6();
        __CLR4_4_1152z152zlgchosfu.R.inc(53427);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53428);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53429);TB.testConstructor_RP_RP_PeriodType7();
        __CLR4_4_1152z152zlgchosfu.R.inc(53430);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53431);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53432);TB.testConstructor_RP_RP_PeriodType8();
        __CLR4_4_1152z152zlgchosfu.R.inc(53433);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53434);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53435);TB.testConstructor_RI_RD1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53436);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53437);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53438);TB.testConstructor_RI_RD2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53439);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53440);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53441);TB.testConstructor_RI_RD_PeriodType1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53442);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53443);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53444);TB.testConstructor_RI_RD_PeriodType2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53445);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53446);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53447);TB.testConstructor_RD_RI1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53448);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53449);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53450);TB.testConstructor_RD_RI2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53451);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53452);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53453);TB.testConstructor_RD_RI_PeriodType1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53454);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53455);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53456);TB.testConstructor_RD_RI_PeriodType2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53457);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53458);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53459);TB.testConstructor_Object1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53460);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53461);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53462);TB.testConstructor_Object2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53463);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53464);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53465);TB.testConstructor_Object3();
        __CLR4_4_1152z152zlgchosfu.R.inc(53466);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53467);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53468);TB.testConstructor_Object4();
        __CLR4_4_1152z152zlgchosfu.R.inc(53469);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53470);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53471);TB.testConstructor_Object_PeriodType1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53472);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53473);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53474);TB.testConstructor_Object_PeriodType2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53475);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53476);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53477);TB.testConstructor_Object_PeriodType3();
        __CLR4_4_1152z152zlgchosfu.R.inc(53478);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53479);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53480);TB.testConstructor_Object_PeriodType4();
        __CLR4_4_1152z152zlgchosfu.R.inc(53481);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53482);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53483);TB.testFactoryYears();
        __CLR4_4_1152z152zlgchosfu.R.inc(53484);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53485);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53486);TB.testFactoryMonths();
        __CLR4_4_1152z152zlgchosfu.R.inc(53487);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53488);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53489);TB.testFactoryWeeks();
        __CLR4_4_1152z152zlgchosfu.R.inc(53490);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53491);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53492);TB.testFactoryDays();
        __CLR4_4_1152z152zlgchosfu.R.inc(53493);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53494);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53495);TB.testFactoryHours();
        __CLR4_4_1152z152zlgchosfu.R.inc(53496);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53497);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53498);TB.testFactoryMinutes();
        __CLR4_4_1152z152zlgchosfu.R.inc(53499);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53500);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53501);TB.testFactorySeconds();
        __CLR4_4_1152z152zlgchosfu.R.inc(53502);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53503);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53504);TB.testFactoryMillis();
        __CLR4_4_1152z152zlgchosfu.R.inc(53505);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53506);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53507);TB.testConstructor_trickyDifferences_RI_RI_toFeb_standardYear();
        __CLR4_4_1152z152zlgchosfu.R.inc(53508);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53509);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53510);TB.testConstructor_trickyDifferences_RI_RI_toFeb_leapYear();
        __CLR4_4_1152z152zlgchosfu.R.inc(53511);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53512);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53513);TB.testConstructor_trickyDifferences_RI_RI_toFeb_exactMonths();
        __CLR4_4_1152z152zlgchosfu.R.inc(53514);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53515);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53516);TB.testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53517);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53518);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53519);TB.testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53520);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53521);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53522);TB.testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth3();
        __CLR4_4_1152z152zlgchosfu.R.inc(53523);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53524);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53525);TB.testConstructor_trickyDifferences_RI_RI_toMar_endOfMonth1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53526);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53527);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53528);TB.testConstructor_trickyDifferences_RI_RI_toMar_endOfMonth2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53529);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53530);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53531);TB.testConstructor_trickyDifferences_LD_LD_toFeb_standardYear();
        __CLR4_4_1152z152zlgchosfu.R.inc(53532);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53533);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53534);TB.testConstructor_trickyDifferences_LD_LD_toFeb_leapYear();
        __CLR4_4_1152z152zlgchosfu.R.inc(53535);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53536);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53537);TB.testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths();
        __CLR4_4_1152z152zlgchosfu.R.inc(53538);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53539);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53540);TB.testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53541);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53542);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53543);TB.testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53544);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53545);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53546);TB.testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth3();
        __CLR4_4_1152z152zlgchosfu.R.inc(53547);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53548);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53549);TB.testConstructor_trickyDifferences_LD_LD_toMar_endOfMonth1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53550);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53551);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53552);TB.testConstructor_trickyDifferences_LD_LD_toMar_endOfMonth2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53553);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53554);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53555);TB.testFactoryFieldDifference1();
        __CLR4_4_1152z152zlgchosfu.R.inc(53556);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53557);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53558);TB.testFactoryFieldDifference2();
        __CLR4_4_1152z152zlgchosfu.R.inc(53559);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53560);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53561);TB.testFactoryFieldDifference3();
        __CLR4_4_1152z152zlgchosfu.R.inc(53562);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53563);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53564);TB.testFactoryFieldDifference4();
        __CLR4_4_1152z152zlgchosfu.R.inc(53565);TB.tearDown();
        __CLR4_4_1152z152zlgchosfu.R.inc(53566);TB.setUp();
        __CLR4_4_1152z152zlgchosfu.R.inc(53567);TB.testFactoryFieldDifference5();
        __CLR4_4_1152z152zlgchosfu.R.inc(53568);TB.tearDown();

    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestPeriod_Constructors.class);
    }

    public TestPeriod_Constructors(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1152z152zlgchosfu.R.inc(53569);
        __CLR4_4_1152z152zlgchosfu.R.inc(53570);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1152z152zlgchosfu.R.inc(53571);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1152z152zlgchosfu.R.inc(53572);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1152z152zlgchosfu.R.inc(53573);originalLocale = Locale.getDefault();
        __CLR4_4_1152z152zlgchosfu.R.inc(53574);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1152z152zlgchosfu.R.inc(53575);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1152z152zlgchosfu.R.inc(53576);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1152z152zlgchosfu.R.inc(53577);
        __CLR4_4_1152z152zlgchosfu.R.inc(53578);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1152z152zlgchosfu.R.inc(53579);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1152z152zlgchosfu.R.inc(53580);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1152z152zlgchosfu.R.inc(53581);Locale.setDefault(originalLocale);
        __CLR4_4_1152z152zlgchosfu.R.inc(53582);originalDateTimeZone = null;
        __CLR4_4_1152z152zlgchosfu.R.inc(53583);originalTimeZone = null;
        __CLR4_4_1152z152zlgchosfu.R.inc(53584);originalLocale = null;
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstants() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15epzlw15ch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstants",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53585,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15epzlw15ch() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53585);
        __CLR4_4_1152z152zlgchosfu.R.inc(53586);Period test = Period.ZERO;
        __CLR4_4_1152z152zlgchosfu.R.inc(53587);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53588);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53589);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53590);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53591);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53592);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53593);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53594);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53595);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqvi15cs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqvi15cs() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53596);
        __CLR4_4_1152z152zlgchosfu.R.inc(53597);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 890), Period.parse("P1Y2M3W4DT5H6M7.890S"));
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kibo7k15cu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kibo7k15cu() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53598);
        __CLR4_4_1152z152zlgchosfu.R.inc(53599);Period test = new Period();
        __CLR4_4_1152z152zlgchosfu.R.inc(53600);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53601);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53602);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53603);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53604);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53605);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53606);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53607);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53608);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13cr15d5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13cr15d5() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53609);
        __CLR4_4_1152z152zlgchosfu.R.inc(53610);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1152z152zlgchosfu.R.inc(53611);Period test = new Period(length);
        __CLR4_4_1152z152zlgchosfu.R.inc(53612);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53613);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53614);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53615);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53616);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53617);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53618);assertEquals(6, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53619);assertEquals(7, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53620);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_long2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914ka15dh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914ka15dh() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53621);
        __CLR4_4_1152z152zlgchosfu.R.inc(53622);long length =
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                        6 * DateTimeConstants.MILLIS_PER_MINUTE +
                        7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1152z152zlgchosfu.R.inc(53623);Period test = new Period(length);
        __CLR4_4_1152z152zlgchosfu.R.inc(53624);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53625);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53626);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53627);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53628);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53629);assertEquals(5, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53630);assertEquals(6, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53631);assertEquals(7, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53632);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_long3() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q015rt15dt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q015rt15dt() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53633);
        __CLR4_4_1152z152zlgchosfu.R.inc(53634);long length =
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                        5L * DateTimeConstants.MILLIS_PER_HOUR +
                        6L * DateTimeConstants.MILLIS_PER_MINUTE +
                        7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1152z152zlgchosfu.R.inc(53635);Period test = new Period(length);
        __CLR4_4_1152z152zlgchosfu.R.inc(53636);assertEquals(PeriodType.standard(), test.getPeriodType());
        // only time fields are precise in AllType
        __CLR4_4_1152z152zlgchosfu.R.inc(53637);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
        __CLR4_4_1152z152zlgchosfu.R.inc(53638);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53639);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53640);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53641);assertEquals((450 * 24) + 5, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53642);assertEquals(6, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53643);assertEquals(7, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53644);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_long_fixedZone() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n9v6jp15e5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_fixedZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53645,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n9v6jp15e5() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53645);
        __CLR4_4_1152z152zlgchosfu.R.inc(53646);DateTimeZone zone = DateTimeZone.getDefault();
        __CLR4_4_1152z152zlgchosfu.R.inc(53647);try {
            __CLR4_4_1152z152zlgchosfu.R.inc(53648);DateTimeZone.setDefault(DateTimeZone.forOffsetHours(2));
            __CLR4_4_1152z152zlgchosfu.R.inc(53649);long length =
                    (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                            5L * DateTimeConstants.MILLIS_PER_HOUR +
                            6L * DateTimeConstants.MILLIS_PER_MINUTE +
                            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
            __CLR4_4_1152z152zlgchosfu.R.inc(53650);Period test = new Period(length);
            __CLR4_4_1152z152zlgchosfu.R.inc(53651);assertEquals(PeriodType.standard(), test.getPeriodType());
            // only time fields are precise in AllType
            __CLR4_4_1152z152zlgchosfu.R.inc(53652);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
            __CLR4_4_1152z152zlgchosfu.R.inc(53653);assertEquals(0, test.getMonths());
            __CLR4_4_1152z152zlgchosfu.R.inc(53654);assertEquals(0, test.getWeeks());
            __CLR4_4_1152z152zlgchosfu.R.inc(53655);assertEquals(0, test.getDays());
            __CLR4_4_1152z152zlgchosfu.R.inc(53656);assertEquals((450 * 24) + 5, test.getHours());
            __CLR4_4_1152z152zlgchosfu.R.inc(53657);assertEquals(6, test.getMinutes());
            __CLR4_4_1152z152zlgchosfu.R.inc(53658);assertEquals(7, test.getSeconds());
            __CLR4_4_1152z152zlgchosfu.R.inc(53659);assertEquals(8, test.getMillis());
        } finally {
            __CLR4_4_1152z152zlgchosfu.R.inc(53660);DateTimeZone.setDefault(zone);
        }
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long_PeriodType1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dqhe5t15el();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53661,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dqhe5t15el() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53661);
        __CLR4_4_1152z152zlgchosfu.R.inc(53662);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1152z152zlgchosfu.R.inc(53663);Period test = new Period(length, (PeriodType) null);
        __CLR4_4_1152z152zlgchosfu.R.inc(53664);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53665);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53666);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53667);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53668);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53669);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53670);assertEquals(6, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53671);assertEquals(7, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53672);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_long_PeriodType2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gzhcya15ex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gzhcya15ex() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53673);
        __CLR4_4_1152z152zlgchosfu.R.inc(53674);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1152z152zlgchosfu.R.inc(53675);Period test = new Period(length, PeriodType.millis());
        __CLR4_4_1152z152zlgchosfu.R.inc(53676);assertEquals(PeriodType.millis(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53677);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53678);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53679);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53680);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53681);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53682);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53683);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53684);assertEquals(length, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_long_PeriodType3() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k8hbqr15f9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53685,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k8hbqr15f9() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53685);
        __CLR4_4_1152z152zlgchosfu.R.inc(53686);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1152z152zlgchosfu.R.inc(53687);Period test = new Period(length, PeriodType.dayTime());
        __CLR4_4_1152z152zlgchosfu.R.inc(53688);assertEquals(PeriodType.dayTime(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53689);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53690);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53691);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53692);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53693);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53694);assertEquals(6, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53695);assertEquals(7, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53696);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_long_PeriodType4() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nhhaj815fl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_PeriodType4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53697,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nhhaj815fl() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53697);
        __CLR4_4_1152z152zlgchosfu.R.inc(53698);long length =
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                        6 * DateTimeConstants.MILLIS_PER_MINUTE +
                        7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1152z152zlgchosfu.R.inc(53699);Period test = new Period(length, PeriodType.standard().withMillisRemoved());
        __CLR4_4_1152z152zlgchosfu.R.inc(53700);assertEquals(PeriodType.standard().withMillisRemoved(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53701);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53702);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53703);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53704);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53705);assertEquals(5, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53706);assertEquals(6, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53707);assertEquals(7, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53708);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long_Chronology1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wcl59w15fx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wcl59w15fx() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53709);
        __CLR4_4_1152z152zlgchosfu.R.inc(53710);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1152z152zlgchosfu.R.inc(53711);Period test = new Period(length, ISOChronology.getInstance());
        __CLR4_4_1152z152zlgchosfu.R.inc(53712);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53713);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53714);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53715);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53716);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53717);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53718);assertEquals(6, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53719);assertEquals(7, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53720);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_long_Chronology2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zfixwr15g9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53721,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zfixwr15g9() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53721);
        __CLR4_4_1152z152zlgchosfu.R.inc(53722);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1152z152zlgchosfu.R.inc(53723);Period test = new Period(length, ISOChronology.getInstanceUTC());
        __CLR4_4_1152z152zlgchosfu.R.inc(53724);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53725);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53726);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53727);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53728);assertEquals(4, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53729);assertEquals(5, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53730);assertEquals(6, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53731);assertEquals(7, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53732);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_long_Chronology3() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w6iz4a15gl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_Chronology3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w6iz4a15gl() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53733);
        __CLR4_4_1152z152zlgchosfu.R.inc(53734);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1152z152zlgchosfu.R.inc(53735);Period test = new Period(length, (Chronology) null);
        __CLR4_4_1152z152zlgchosfu.R.inc(53736);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53737);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53738);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53739);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53740);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53741);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53742);assertEquals(6, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53743);assertEquals(7, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53744);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long_PeriodType_Chronology1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13o11o815gx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_PeriodType_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13o11o815gx() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53745);
        __CLR4_4_1152z152zlgchosfu.R.inc(53746);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1152z152zlgchosfu.R.inc(53747);Period test = new Period(length, PeriodType.time().withMillisRemoved(), ISOChronology.getInstance());
        __CLR4_4_1152z152zlgchosfu.R.inc(53748);assertEquals(PeriodType.time().withMillisRemoved(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53749);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53750);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53751);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53752);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53753);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53754);assertEquals(6, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53755);assertEquals(7, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53756);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_long_PeriodType_Chronology2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f12vr15h9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_PeriodType_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53757,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f12vr15h9() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53757);
        __CLR4_4_1152z152zlgchosfu.R.inc(53758);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1152z152zlgchosfu.R.inc(53759);Period test = new Period(length, PeriodType.standard(), ISOChronology.getInstanceUTC());
        __CLR4_4_1152z152zlgchosfu.R.inc(53760);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53761);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53762);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53763);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53764);assertEquals(4, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53765);assertEquals(5, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53766);assertEquals(6, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53767);assertEquals(7, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53768);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_long_PeriodType_Chronology3() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12tyvwq15hl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_PeriodType_Chronology3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12tyvwq15hl() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53769);
        __CLR4_4_1152z152zlgchosfu.R.inc(53770);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1152z152zlgchosfu.R.inc(53771);Period test = new Period(length, PeriodType.standard(), (Chronology) null);
        __CLR4_4_1152z152zlgchosfu.R.inc(53772);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53773);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53774);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53775);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53776);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53777);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53778);assertEquals(6, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53779);assertEquals(7, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53780);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_long_PeriodType_Chronology4() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_162yup715hx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_PeriodType_Chronology4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_162yup715hx() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53781);
        __CLR4_4_1152z152zlgchosfu.R.inc(53782);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1152z152zlgchosfu.R.inc(53783);Period test = new Period(length, (PeriodType) null, (Chronology) null);
        __CLR4_4_1152z152zlgchosfu.R.inc(53784);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53785);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53786);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53787);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53788);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53789);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53790);assertEquals(6, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53791);assertEquals(7, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53792);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (4ints)
     */
    @Test
    public void testConstructor_4int1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11fk5dm15i9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_4int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11fk5dm15i9() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53793);
        __CLR4_4_1152z152zlgchosfu.R.inc(53794);Period test = new Period(5, 6, 7, 8);
        __CLR4_4_1152z152zlgchosfu.R.inc(53795);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53796);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53797);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53798);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53799);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53800);assertEquals(5, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53801);assertEquals(6, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53802);assertEquals(7, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53803);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (8ints)
     */
    @Test
    public void testConstructor_8int1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w0fcqy15ik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_8int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53804,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w0fcqy15ik() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53804);
        __CLR4_4_1152z152zlgchosfu.R.inc(53805);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1152z152zlgchosfu.R.inc(53806);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53807);assertEquals(1, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53808);assertEquals(2, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53809);assertEquals(3, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53810);assertEquals(4, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53811);assertEquals(5, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53812);assertEquals(6, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53813);assertEquals(7, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53814);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (8ints)
     */
    @Test
    public void testConstructor_8int__PeriodType1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mrz59r15iv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_8int__PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mrz59r15iv() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53815);
        __CLR4_4_1152z152zlgchosfu.R.inc(53816);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, null);
        __CLR4_4_1152z152zlgchosfu.R.inc(53817);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53818);assertEquals(1, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53819);assertEquals(2, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53820);assertEquals(3, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53821);assertEquals(4, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53822);assertEquals(5, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53823);assertEquals(6, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53824);assertEquals(7, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53825);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_8int__PeriodType2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q0z42815j6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_8int__PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q0z42815j6() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53826);
        __CLR4_4_1152z152zlgchosfu.R.inc(53827);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.dayTime());
        __CLR4_4_1152z152zlgchosfu.R.inc(53828);assertEquals(PeriodType.dayTime(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53829);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53830);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53831);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53832);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53833);assertEquals(5, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53834);assertEquals(6, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53835);assertEquals(7, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53836);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_8int__PeriodType3() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t9z2up15jh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_8int__PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53837,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t9z2up15jh() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53837);
        __CLR4_4_1152z152zlgchosfu.R.inc(53838);try {
            __CLR4_4_1152z152zlgchosfu.R.inc(53839);new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.dayTime());
            __CLR4_4_1152z152zlgchosfu.R.inc(53840);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long_long1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ifbf415jl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53841,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ifbf415jl() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53841);
        __CLR4_4_1152z152zlgchosfu.R.inc(53842);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(53843);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1152z152zlgchosfu.R.inc(53844);Period test = new Period(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_1152z152zlgchosfu.R.inc(53845);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53846);assertEquals(1, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53847);assertEquals(1, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53848);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53849);assertEquals(1, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53850);assertEquals(1, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53851);assertEquals(1, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53852);assertEquals(1, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53853);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_long_long2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129fcmn15jy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129fcmn15jy() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53854);
        __CLR4_4_1152z152zlgchosfu.R.inc(53855);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(53856);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1152z152zlgchosfu.R.inc(53857);Period test = new Period(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_1152z152zlgchosfu.R.inc(53858);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53859);assertEquals(1, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53860);assertEquals(1, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53861);assertEquals(1, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53862);assertEquals(1, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53863);assertEquals(1, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53864);assertEquals(1, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53865);assertEquals(1, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53866);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long_long_PeriodType1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ifrgre15kb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ifrgre15kb() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53867);
        __CLR4_4_1152z152zlgchosfu.R.inc(53868);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(53869);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1152z152zlgchosfu.R.inc(53870);Period test = new Period(dt1.getMillis(), dt2.getMillis(), (PeriodType) null);
        __CLR4_4_1152z152zlgchosfu.R.inc(53871);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53872);assertEquals(1, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53873);assertEquals(1, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53874);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53875);assertEquals(1, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53876);assertEquals(1, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53877);assertEquals(1, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53878);assertEquals(1, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53879);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_long_long_PeriodType2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6rhyx15ko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6rhyx15ko() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53880);
        __CLR4_4_1152z152zlgchosfu.R.inc(53881);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(53882);DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1152z152zlgchosfu.R.inc(53883);Period test = new Period(dt1.getMillis(), dt2.getMillis(), PeriodType.dayTime());
        __CLR4_4_1152z152zlgchosfu.R.inc(53884);assertEquals(PeriodType.dayTime(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53885);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53886);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53887);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53888);assertEquals(31, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53889);assertEquals(1, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53890);assertEquals(1, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53891);assertEquals(1, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53892);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_long_long_PeriodType3() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxrj6g15l1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long_PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53893,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxrj6g15l1() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53893);
        __CLR4_4_1152z152zlgchosfu.R.inc(53894);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(53895);DateTime dt2 = new DateTime(2004, 6, 9, 1, 1, 1, 1);
        __CLR4_4_1152z152zlgchosfu.R.inc(53896);Period test = new Period(dt1.getMillis(), dt2.getMillis(), PeriodType.standard().withMillisRemoved());
        __CLR4_4_1152z152zlgchosfu.R.inc(53897);assertEquals(PeriodType.standard().withMillisRemoved(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53898);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53899);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53900);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53901);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53902);assertEquals(1, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53903);assertEquals(1, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53904);assertEquals(1, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53905);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testToPeriod_PeriodType3() {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c0urhu15le();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testToPeriod_PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c0urhu15le(){try{__CLR4_4_1152z152zlgchosfu.R.inc(53906);
        __CLR4_4_1152z152zlgchosfu.R.inc(53907);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10);
        __CLR4_4_1152z152zlgchosfu.R.inc(53908);DateTime dt2 = new DateTime(2005, 6, 9, 12, 14, 16, 18);
        __CLR4_4_1152z152zlgchosfu.R.inc(53909);Period test = new Period(dt1.getMillis(), dt2.getMillis(), PeriodType.yearWeekDayTime());

        __CLR4_4_1152z152zlgchosfu.R.inc(53910);assertEquals(PeriodType.yearWeekDayTime(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53911);assertEquals(1, test.getYears());  // tests using years and not weekyears
        __CLR4_4_1152z152zlgchosfu.R.inc(53912);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53913);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53914);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53915);assertEquals(5, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53916);assertEquals(6, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53917);assertEquals(7, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53918);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long_long_Chronology1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16cacp15lr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53919,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16cacp15lr() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53919);
        __CLR4_4_1152z152zlgchosfu.R.inc(53920);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance());
        __CLR4_4_1152z152zlgchosfu.R.inc(53921);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, CopticChronology.getInstance());
        __CLR4_4_1152z152zlgchosfu.R.inc(53922);Period test = new Period(dt1.getMillis(), dt2.getMillis(), CopticChronology.getInstance());
        __CLR4_4_1152z152zlgchosfu.R.inc(53923);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53924);assertEquals(1, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53925);assertEquals(1, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53926);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53927);assertEquals(1, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53928);assertEquals(1, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53929);assertEquals(1, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53930);assertEquals(1, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53931);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_long_long_Chronology2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13fc95615m4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13fc95615m4() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53932);
        __CLR4_4_1152z152zlgchosfu.R.inc(53933);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(53934);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1152z152zlgchosfu.R.inc(53935);Period test = new Period(dt1.getMillis(), dt2.getMillis(), (Chronology) null);
        __CLR4_4_1152z152zlgchosfu.R.inc(53936);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53937);assertEquals(1, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53938);assertEquals(1, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53939);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53940);assertEquals(1, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53941);assertEquals(1, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53942);assertEquals(1, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53943);assertEquals(1, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53944);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long_long_PeriodType_Chronology1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g1lwlp15mh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long_PeriodType_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g1lwlp15mh() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53945);
        __CLR4_4_1152z152zlgchosfu.R.inc(53946);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance());
        __CLR4_4_1152z152zlgchosfu.R.inc(53947);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, CopticChronology.getInstance());
        __CLR4_4_1152z152zlgchosfu.R.inc(53948);Period test = new Period(dt1.getMillis(), dt2.getMillis(), (PeriodType) null, CopticChronology.getInstance());
        __CLR4_4_1152z152zlgchosfu.R.inc(53949);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53950);assertEquals(1, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53951);assertEquals(1, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53952);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53953);assertEquals(1, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53954);assertEquals(1, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53955);assertEquals(1, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53956);assertEquals(1, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53957);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_long_long_PeriodType_Chronology2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cslxt815mu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long_PeriodType_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cslxt815mu() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53958);
        __CLR4_4_1152z152zlgchosfu.R.inc(53959);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(53960);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1152z152zlgchosfu.R.inc(53961);Period test = new Period(dt1.getMillis(), dt2.getMillis(), (PeriodType) null, null);
        __CLR4_4_1152z152zlgchosfu.R.inc(53962);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53963);assertEquals(1, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53964);assertEquals(1, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53965);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53966);assertEquals(1, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53967);assertEquals(1, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53968);assertEquals(1, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53969);assertEquals(1, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53970);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_RI_RI1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n7qods15n7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n7qods15n7() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53971);
        __CLR4_4_1152z152zlgchosfu.R.inc(53972);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(53973);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1152z152zlgchosfu.R.inc(53974);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(53975);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53976);assertEquals(1, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53977);assertEquals(1, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53978);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53979);assertEquals(1, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53980);assertEquals(1, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53981);assertEquals(1, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53982);assertEquals(1, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53983);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jyqplb15nk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jyqplb15nk() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53984);
        __CLR4_4_1152z152zlgchosfu.R.inc(53985);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(53986);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1152z152zlgchosfu.R.inc(53987);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(53988);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(53989);assertEquals(1, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(53990);assertEquals(1, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(53991);assertEquals(1, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(53992);assertEquals(1, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(53993);assertEquals(1, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(53994);assertEquals(1, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(53995);assertEquals(1, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(53996);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI3() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),53997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gpqqsu15nx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53997,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gpqqsu15nx() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(53997);
        __CLR4_4_1152z152zlgchosfu.R.inc(53998);DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1152z152zlgchosfu.R.inc(53999);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1152z152zlgchosfu.R.inc(54000);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54001);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54002);assertEquals(3, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54003);assertEquals(1, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54004);assertEquals(1, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54005);assertEquals(1, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54006);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54007);assertEquals(1, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54008);assertEquals(1, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54009);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI4() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dgqs0d15oa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dgqs0d15oa() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54010);
        __CLR4_4_1152z152zlgchosfu.R.inc(54011);DateTime dt1 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1152z152zlgchosfu.R.inc(54012);DateTime dt2 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1152z152zlgchosfu.R.inc(54013);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54014);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54015);assertEquals(-3, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54016);assertEquals(-1, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54017);assertEquals(-1, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54018);assertEquals(-1, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54019);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54020);assertEquals(-1, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54021);assertEquals(-1, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54022);assertEquals(-1, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI5() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a7qt7w15on();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54023,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a7qt7w15on() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54023);
        __CLR4_4_1152z152zlgchosfu.R.inc(54024);DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1152z152zlgchosfu.R.inc(54025);DateTime dt2 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1152z152zlgchosfu.R.inc(54026);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54027);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54028);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54029);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54030);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54031);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54032);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54033);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54034);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54035);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI6() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16yquff15p0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16yquff15p0() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54036);
        __CLR4_4_1152z152zlgchosfu.R.inc(54037);DateTimeZone zone = PARIS;
        __CLR4_4_1152z152zlgchosfu.R.inc(54038);DateTime dt1 = new DateTime(2013, 10, 27, 2, 0, 0, zone).withLaterOffsetAtOverlap();
        __CLR4_4_1152z152zlgchosfu.R.inc(54039);DateTime dt2 = new DateTime(2013, 10, 27, 2, 15, 0, zone).withLaterOffsetAtOverlap();
        __CLR4_4_1152z152zlgchosfu.R.inc(54040);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54041);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54042);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54043);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54044);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54045);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54046);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54047);assertEquals(15, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54048);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54049);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI7() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13pqvmy15pe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54050,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13pqvmy15pe() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54050);
        __CLR4_4_1152z152zlgchosfu.R.inc(54051);DateTimeZone zone = PARIS;
        __CLR4_4_1152z152zlgchosfu.R.inc(54052);DateTime dt1 = new DateTime(2013, 10, 27, 2, 0, 0, zone).withEarlierOffsetAtOverlap();
        __CLR4_4_1152z152zlgchosfu.R.inc(54053);DateTime dt2 = new DateTime(2013, 10, 27, 2, 15, 0, zone).withLaterOffsetAtOverlap();
        __CLR4_4_1152z152zlgchosfu.R.inc(54054);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54055);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54056);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54057);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54058);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54059);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54060);assertEquals(1, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54061);assertEquals(15, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54062);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54063);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_RI_RI_PeriodType1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bl9f0a15ps();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54064,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bl9f0a15ps() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54064);
        __CLR4_4_1152z152zlgchosfu.R.inc(54065);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54066);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1152z152zlgchosfu.R.inc(54067);Period test = new Period(dt1, dt2, null);
        __CLR4_4_1152z152zlgchosfu.R.inc(54068);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54069);assertEquals(1, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54070);assertEquals(1, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54071);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54072);assertEquals(1, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54073);assertEquals(1, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54074);assertEquals(1, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54075);assertEquals(1, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54076);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI_PeriodType2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18c9g7t15q5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18c9g7t15q5() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54077);
        __CLR4_4_1152z152zlgchosfu.R.inc(54078);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54079);DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1152z152zlgchosfu.R.inc(54080);Period test = new Period(dt1, dt2, PeriodType.dayTime());
        __CLR4_4_1152z152zlgchosfu.R.inc(54081);assertEquals(PeriodType.dayTime(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54082);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54083);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54084);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54085);assertEquals(31, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54086);assertEquals(1, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54087);assertEquals(1, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54088);assertEquals(1, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54089);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI_PeriodType3() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1539hfc15qi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI_PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1539hfc15qi() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54090);
        __CLR4_4_1152z152zlgchosfu.R.inc(54091);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54092);DateTime dt2 = new DateTime(2004, 6, 9, 1, 1, 1, 1);
        __CLR4_4_1152z152zlgchosfu.R.inc(54093);Period test = new Period(dt1, dt2, PeriodType.standard().withMillisRemoved());
        __CLR4_4_1152z152zlgchosfu.R.inc(54094);assertEquals(PeriodType.standard().withMillisRemoved(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54095);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54096);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54097);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54098);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54099);assertEquals(1, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54100);assertEquals(1, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54101);assertEquals(1, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54102);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI_PeriodType4() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11u9imv15qv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI_PeriodType4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11u9imv15qv() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54103);
        __CLR4_4_1152z152zlgchosfu.R.inc(54104);DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1152z152zlgchosfu.R.inc(54105);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1152z152zlgchosfu.R.inc(54106);Period test = new Period(dt1, dt2, PeriodType.standard());
        __CLR4_4_1152z152zlgchosfu.R.inc(54107);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54108);assertEquals(3, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54109);assertEquals(1, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54110);assertEquals(1, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54111);assertEquals(1, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54112);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54113);assertEquals(1, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54114);assertEquals(1, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54115);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI_PeriodType5() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11eqg5m15r8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI_PeriodType5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54116,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11eqg5m15r8() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54116);
        __CLR4_4_1152z152zlgchosfu.R.inc(54117);DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1152z152zlgchosfu.R.inc(54118);DateTime dt2 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1152z152zlgchosfu.R.inc(54119);Period test = new Period(dt1, dt2, PeriodType.standard());
        __CLR4_4_1152z152zlgchosfu.R.inc(54120);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54121);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54122);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54123);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54124);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54125);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54126);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54127);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54128);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testConstructor_RP_RP1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u8wm7k15rl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54129,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u8wm7k15rl() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54129);
        __CLR4_4_1152z152zlgchosfu.R.inc(54130);YearMonthDay dt1 = new YearMonthDay(2004, 6, 9);
        __CLR4_4_1152z152zlgchosfu.R.inc(54131);YearMonthDay dt2 = new YearMonthDay(2005, 7, 10);
        __CLR4_4_1152z152zlgchosfu.R.inc(54132);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54133);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54134);assertEquals(1, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54135);assertEquals(1, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54136);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54137);assertEquals(1, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54138);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54139);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54140);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54141);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructor_RP_RP2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xhwl0115ry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xhwl0115ry() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54142);
        __CLR4_4_1152z152zlgchosfu.R.inc(54143);YearMonthDay dt1 = new YearMonthDay(2004, 6, 9);
        __CLR4_4_1152z152zlgchosfu.R.inc(54144);YearMonthDay dt2 = new YearMonthDay(2005, 5, 17);
        __CLR4_4_1152z152zlgchosfu.R.inc(54145);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54146);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54147);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54148);assertEquals(11, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54149);assertEquals(1, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54150);assertEquals(1, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54151);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54152);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54153);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54154);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_RP_RP2Local() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a2ef6w15sb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP2Local",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a2ef6w15sb() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54155);
        __CLR4_4_1152z152zlgchosfu.R.inc(54156);LocalDate dt1 = new LocalDate(2004, 6, 9);
        __CLR4_4_1152z152zlgchosfu.R.inc(54157);LocalDate dt2 = new LocalDate(2005, 5, 17);
        __CLR4_4_1152z152zlgchosfu.R.inc(54158);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54159);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54160);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54161);assertEquals(11, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54162);assertEquals(1, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54163);assertEquals(1, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54164);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54165);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54166);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54167);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructor_RP_RP3() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ya7i6m15so();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ya7i6m15so() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54168);
        __CLR4_4_1152z152zlgchosfu.R.inc(54169);YearMonthDay dt1 = null;
        __CLR4_4_1152z152zlgchosfu.R.inc(54170);YearMonthDay dt2 = new YearMonthDay(2005, 7, 17);
        __CLR4_4_1152z152zlgchosfu.R.inc(54171);try {
            __CLR4_4_1152z152zlgchosfu.R.inc(54172);new Period(dt1, dt2);
            __CLR4_4_1152z152zlgchosfu.R.inc(54173);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructor_RP_RP4() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v17je515su();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v17je515su() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54174);
        __CLR4_4_1152z152zlgchosfu.R.inc(54175);YearMonthDay dt1 = new YearMonthDay(2005, 7, 17);
        __CLR4_4_1152z152zlgchosfu.R.inc(54176);YearMonthDay dt2 = null;
        __CLR4_4_1152z152zlgchosfu.R.inc(54177);try {
            __CLR4_4_1152z152zlgchosfu.R.inc(54178);new Period(dt1, dt2);
            __CLR4_4_1152z152zlgchosfu.R.inc(54179);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructor_RP_RP5() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rs7klo15t0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rs7klo15t0() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54180);
        __CLR4_4_1152z152zlgchosfu.R.inc(54181);YearMonthDay dt1 = null;
        __CLR4_4_1152z152zlgchosfu.R.inc(54182);YearMonthDay dt2 = null;
        __CLR4_4_1152z152zlgchosfu.R.inc(54183);try {
            __CLR4_4_1152z152zlgchosfu.R.inc(54184);new Period(dt1, dt2);
            __CLR4_4_1152z152zlgchosfu.R.inc(54185);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructor_RP_RP6() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oj7lt715t6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oj7lt715t6() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54186);
        __CLR4_4_1152z152zlgchosfu.R.inc(54187);YearMonthDay dt1 = new YearMonthDay(2005, 7, 17);
        __CLR4_4_1152z152zlgchosfu.R.inc(54188);TimeOfDay dt2 = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1152z152zlgchosfu.R.inc(54189);try {
            __CLR4_4_1152z152zlgchosfu.R.inc(54190);new Period(dt1, dt2);
            __CLR4_4_1152z152zlgchosfu.R.inc(54191);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_RP_RP7() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1la7n0q15tc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1la7n0q15tc() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54192);
        __CLR4_4_1152z152zlgchosfu.R.inc(54193);Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.monthOfYear(), 12);
        __CLR4_4_1152z152zlgchosfu.R.inc(54194);Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14);
        __CLR4_4_1152z152zlgchosfu.R.inc(54195);try {
            __CLR4_4_1152z152zlgchosfu.R.inc(54196);new Period(dt1, dt2);
            __CLR4_4_1152z152zlgchosfu.R.inc(54197);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_RP_RP8() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i17o8915ti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i17o8915ti() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54198);
        __CLR4_4_1152z152zlgchosfu.R.inc(54199);Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 12);
        __CLR4_4_1152z152zlgchosfu.R.inc(54200);Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14);
        __CLR4_4_1152z152zlgchosfu.R.inc(54201);try {
            __CLR4_4_1152z152zlgchosfu.R.inc(54202);new Period(dt1, dt2);
            __CLR4_4_1152z152zlgchosfu.R.inc(54203);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testConstructor_RP_RP_PeriodType1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1we6tui15to();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54204,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1we6tui15to() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54204);
        __CLR4_4_1152z152zlgchosfu.R.inc(54205);YearMonthDay dt1 = new YearMonthDay(2004, 6, 9);
        __CLR4_4_1152z152zlgchosfu.R.inc(54206);YearMonthDay dt2 = new YearMonthDay(2005, 7, 10);
        __CLR4_4_1152z152zlgchosfu.R.inc(54207);Period test = new Period(dt1, dt2, PeriodType.standard());
        __CLR4_4_1152z152zlgchosfu.R.inc(54208);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54209);assertEquals(1, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54210);assertEquals(1, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54211);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54212);assertEquals(1, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54213);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54214);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54215);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54216);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructor_RP_RP_PeriodType2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t56v2115u1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t56v2115u1() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54217);
        __CLR4_4_1152z152zlgchosfu.R.inc(54218);YearMonthDay dt1 = new YearMonthDay(2004, 6, 9);
        __CLR4_4_1152z152zlgchosfu.R.inc(54219);YearMonthDay dt2 = new YearMonthDay(2005, 5, 17);
        __CLR4_4_1152z152zlgchosfu.R.inc(54220);Period test = new Period(dt1, dt2, PeriodType.yearMonthDay());
        __CLR4_4_1152z152zlgchosfu.R.inc(54221);assertEquals(PeriodType.yearMonthDay(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54222);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54223);assertEquals(11, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54224);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54225);assertEquals(8, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54226);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54227);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54228);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54229);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_RP_RP_PeriodType2Local() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cj99gy15ue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType2Local",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cj99gy15ue() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54230);
        __CLR4_4_1152z152zlgchosfu.R.inc(54231);LocalDate dt1 = new LocalDate(2004, 6, 9);
        __CLR4_4_1152z152zlgchosfu.R.inc(54232);LocalDate dt2 = new LocalDate(2005, 5, 17);
        __CLR4_4_1152z152zlgchosfu.R.inc(54233);Period test = new Period(dt1, dt2, PeriodType.yearMonthDay());
        __CLR4_4_1152z152zlgchosfu.R.inc(54234);assertEquals(PeriodType.yearMonthDay(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54235);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54236);assertEquals(11, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54237);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54238);assertEquals(8, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54239);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54240);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54241);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54242);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructor_RP_RP_PeriodType3() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pw6w9k15ur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pw6w9k15ur() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54243);
        __CLR4_4_1152z152zlgchosfu.R.inc(54244);YearMonthDay dt1 = null;
        __CLR4_4_1152z152zlgchosfu.R.inc(54245);YearMonthDay dt2 = new YearMonthDay(2005, 7, 17);
        __CLR4_4_1152z152zlgchosfu.R.inc(54246);try {
            __CLR4_4_1152z152zlgchosfu.R.inc(54247);new Period(dt1, dt2, PeriodType.standard());
            __CLR4_4_1152z152zlgchosfu.R.inc(54248);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructor_RP_RP_PeriodType4() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mn6xh315ux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mn6xh315ux() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54249);
        __CLR4_4_1152z152zlgchosfu.R.inc(54250);YearMonthDay dt1 = new YearMonthDay(2005, 7, 17);
        __CLR4_4_1152z152zlgchosfu.R.inc(54251);YearMonthDay dt2 = null;
        __CLR4_4_1152z152zlgchosfu.R.inc(54252);try {
            __CLR4_4_1152z152zlgchosfu.R.inc(54253);new Period(dt1, dt2);
            __CLR4_4_1152z152zlgchosfu.R.inc(54254);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructor_RP_RP_PeriodType5() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1je6yom15v3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54255,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1je6yom15v3() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54255);
        __CLR4_4_1152z152zlgchosfu.R.inc(54256);YearMonthDay dt1 = null;
        __CLR4_4_1152z152zlgchosfu.R.inc(54257);YearMonthDay dt2 = null;
        __CLR4_4_1152z152zlgchosfu.R.inc(54258);try {
            __CLR4_4_1152z152zlgchosfu.R.inc(54259);new Period(dt1, dt2, PeriodType.standard());
            __CLR4_4_1152z152zlgchosfu.R.inc(54260);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructor_RP_RP_PeriodType6() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g56zw515v9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g56zw515v9() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54261);
        __CLR4_4_1152z152zlgchosfu.R.inc(54262);YearMonthDay dt1 = new YearMonthDay(2005, 7, 17);
        __CLR4_4_1152z152zlgchosfu.R.inc(54263);TimeOfDay dt2 = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1152z152zlgchosfu.R.inc(54264);try {
            __CLR4_4_1152z152zlgchosfu.R.inc(54265);new Period(dt1, dt2, PeriodType.standard());
            __CLR4_4_1152z152zlgchosfu.R.inc(54266);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_RP_RP_PeriodType7() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cw713o15vf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cw713o15vf() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54267);
        __CLR4_4_1152z152zlgchosfu.R.inc(54268);Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.monthOfYear(), 12);
        __CLR4_4_1152z152zlgchosfu.R.inc(54269);Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14);
        __CLR4_4_1152z152zlgchosfu.R.inc(54270);try {
            __CLR4_4_1152z152zlgchosfu.R.inc(54271);new Period(dt1, dt2, PeriodType.standard());
            __CLR4_4_1152z152zlgchosfu.R.inc(54272);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_RP_RP_PeriodType8() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19n72b715vl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19n72b715vl() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54273);
        __CLR4_4_1152z152zlgchosfu.R.inc(54274);Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 12);
        __CLR4_4_1152z152zlgchosfu.R.inc(54275);Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14);
        __CLR4_4_1152z152zlgchosfu.R.inc(54276);try {
            __CLR4_4_1152z152zlgchosfu.R.inc(54277);new Period(dt1, dt2, PeriodType.standard());
            __CLR4_4_1152z152zlgchosfu.R.inc(54278);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_RI_RD1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqt35715vr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RD1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqt35715vr() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54279);
        __CLR4_4_1152z152zlgchosfu.R.inc(54280);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54281);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1152z152zlgchosfu.R.inc(54282);Duration dur = new Interval(dt1, dt2).toDuration();
        __CLR4_4_1152z152zlgchosfu.R.inc(54283);Period test = new Period(dt1, dur);
        __CLR4_4_1152z152zlgchosfu.R.inc(54284);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54285);assertEquals(1, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54286);assertEquals(1, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54287);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54288);assertEquals(1, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54289);assertEquals(1, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54290);assertEquals(1, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54291);assertEquals(1, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54292);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RD2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qht4cq15w5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RD2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qht4cq15w5() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54293);
        __CLR4_4_1152z152zlgchosfu.R.inc(54294);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54295);Duration dur = null;
        __CLR4_4_1152z152zlgchosfu.R.inc(54296);Period test = new Period(dt1, dur);
        __CLR4_4_1152z152zlgchosfu.R.inc(54297);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54298);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54299);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54300);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54301);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54302);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54303);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54304);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54305);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_RI_RD_PeriodType1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wz1nfl15wi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RD_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wz1nfl15wi() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54306);
        __CLR4_4_1152z152zlgchosfu.R.inc(54307);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54308);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1152z152zlgchosfu.R.inc(54309);Duration dur = new Interval(dt1, dt2).toDuration();
        __CLR4_4_1152z152zlgchosfu.R.inc(54310);Period test = new Period(dt1, dur, PeriodType.yearDayTime());
        __CLR4_4_1152z152zlgchosfu.R.inc(54311);assertEquals(PeriodType.yearDayTime(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54312);assertEquals(1, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54313);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54314);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54315);assertEquals(31, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54316);assertEquals(1, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54317);assertEquals(1, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54318);assertEquals(1, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54319);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RD_PeriodType2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yt2fr215ww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RD_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yt2fr215ww() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54320);
        __CLR4_4_1152z152zlgchosfu.R.inc(54321);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54322);Duration dur = null;
        __CLR4_4_1152z152zlgchosfu.R.inc(54323);Period test = new Period(dt1, dur, (PeriodType) null);
        __CLR4_4_1152z152zlgchosfu.R.inc(54324);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54325);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54326);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54327);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54328);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54329);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54330);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54331);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54332);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_RD_RI1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_160dzxn15x9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RD_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_160dzxn15x9() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54333);
        __CLR4_4_1152z152zlgchosfu.R.inc(54334);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54335);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1152z152zlgchosfu.R.inc(54336);Duration dur = new Interval(dt1, dt2).toDuration();
        __CLR4_4_1152z152zlgchosfu.R.inc(54337);Period test = new Period(dur, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54338);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54339);assertEquals(1, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54340);assertEquals(1, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54341);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54342);assertEquals(1, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54343);assertEquals(1, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54344);assertEquals(1, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54345);assertEquals(1, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54346);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_RD_RI2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_199dyq415xn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RD_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_199dyq415xn() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54347);
        __CLR4_4_1152z152zlgchosfu.R.inc(54348);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54349);Duration dur = null;
        __CLR4_4_1152z152zlgchosfu.R.inc(54350);Period test = new Period(dur, dt1);
        __CLR4_4_1152z152zlgchosfu.R.inc(54351);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54352);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54353);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54354);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54355);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54356);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54357);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54358);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54359);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_RD_RI_PeriodType1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqhpzf15y0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RD_RI_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54360,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqhpzf15y0() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54360);
        __CLR4_4_1152z152zlgchosfu.R.inc(54361);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54362);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1152z152zlgchosfu.R.inc(54363);Duration dur = new Interval(dt1, dt2).toDuration();
        __CLR4_4_1152z152zlgchosfu.R.inc(54364);Period test = new Period(dur, dt2, PeriodType.yearDayTime());
        __CLR4_4_1152z152zlgchosfu.R.inc(54365);assertEquals(PeriodType.yearDayTime(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54366);assertEquals(1, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54367);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54368);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54369);assertEquals(31, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54370);assertEquals(1, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54371);assertEquals(1, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54372);assertEquals(1, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54373);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_RD_RI_PeriodType2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wzhorw15ye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RD_RI_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wzhorw15ye() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54374);
        __CLR4_4_1152z152zlgchosfu.R.inc(54375);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54376);Duration dur = null;
        __CLR4_4_1152z152zlgchosfu.R.inc(54377);Period test = new Period(dur, dt1, (PeriodType) null);
        __CLR4_4_1152z152zlgchosfu.R.inc(54378);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54379);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54380);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54381);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54382);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54383);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54384);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54385);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54386);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (Object)
     */
    @Test
    public void testConstructor_Object1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19oqxcy15yr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54387,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19oqxcy15yr() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54387);
        __CLR4_4_1152z152zlgchosfu.R.inc(54388);Period test = new Period("P1Y2M3D");
        __CLR4_4_1152z152zlgchosfu.R.inc(54389);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54390);assertEquals(1, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54391);assertEquals(2, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54392);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54393);assertEquals(3, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54394);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54395);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54396);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54397);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_Object2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxqw5f15z2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54398,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxqw5f15z2() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54398);
        __CLR4_4_1152z152zlgchosfu.R.inc(54399);Period test = new Period((Object) null);
        __CLR4_4_1152z152zlgchosfu.R.inc(54400);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54401);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54402);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54403);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54404);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54405);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54406);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54407);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54408);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_Object3() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g6quxw15zd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g6quxw15zd() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54409);
        __CLR4_4_1152z152zlgchosfu.R.inc(54410);Period test = new Period(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()));
        __CLR4_4_1152z152zlgchosfu.R.inc(54411);assertEquals(PeriodType.dayTime(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54412);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54413);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54414);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54415);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54416);assertEquals(1, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54417);assertEquals(2, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54418);assertEquals(3, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54419);assertEquals(4, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_Object4() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jfqtqd15zo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jfqtqd15zo() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54420);
        __CLR4_4_1152z152zlgchosfu.R.inc(54421);Period base = new Period(1, 1, 0, 1, 1, 1, 1, 1, PeriodType.standard());
        __CLR4_4_1152z152zlgchosfu.R.inc(54422);Period test = new Period(base);
        __CLR4_4_1152z152zlgchosfu.R.inc(54423);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54424);assertEquals(1, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54425);assertEquals(1, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54426);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54427);assertEquals(1, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54428);assertEquals(1, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54429);assertEquals(1, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54430);assertEquals(1, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54431);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (Object)
     */
    @Test
    public void testConstructor_Object_PeriodType1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170brck1600();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170brck1600() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54432);
        __CLR4_4_1152z152zlgchosfu.R.inc(54433);Period test = new Period("P1Y2M3D", PeriodType.yearMonthDayTime());
        __CLR4_4_1152z152zlgchosfu.R.inc(54434);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54435);assertEquals(1, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54436);assertEquals(2, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54437);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54438);assertEquals(3, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54439);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54440);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54441);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54442);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_Object_PeriodType2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9bq51160b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54443,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9bq51160b() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54443);
        __CLR4_4_1152z152zlgchosfu.R.inc(54444);Period test = new Period((Object) null, PeriodType.yearMonthDayTime());
        __CLR4_4_1152z152zlgchosfu.R.inc(54445);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54446);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54447);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54448);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54449);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54450);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54451);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54452);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54453);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_Object_PeriodType3() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1diboxi160m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object_PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1diboxi160m() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54454);
        __CLR4_4_1152z152zlgchosfu.R.inc(54455);Period test = new Period(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()), PeriodType.yearMonthDayTime());
        __CLR4_4_1152z152zlgchosfu.R.inc(54456);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54457);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54458);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54459);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54460);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54461);assertEquals(1, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54462);assertEquals(2, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54463);assertEquals(3, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54464);assertEquals(4, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_Object_PeriodType4() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1grbnpz160x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object_PeriodType4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54465,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1grbnpz160x() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54465);
        __CLR4_4_1152z152zlgchosfu.R.inc(54466);Period test = new Period(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()), (PeriodType) null);
        __CLR4_4_1152z152zlgchosfu.R.inc(54467);assertEquals(PeriodType.dayTime(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54468);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54469);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54470);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54471);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54472);assertEquals(1, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54473);assertEquals(2, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54474);assertEquals(3, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54475);assertEquals(4, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactoryYears() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kgj0v91618();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kgj0v91618() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54476);
        __CLR4_4_1152z152zlgchosfu.R.inc(54477);Period test = Period.years(6);
        __CLR4_4_1152z152zlgchosfu.R.inc(54478);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54479);assertEquals(6, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54480);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54481);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54482);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54483);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54484);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54485);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54486);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testFactoryMonths() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18jlno2161j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18jlno2161j() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54487);
        __CLR4_4_1152z152zlgchosfu.R.inc(54488);Period test = Period.months(6);
        __CLR4_4_1152z152zlgchosfu.R.inc(54489);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54490);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54491);assertEquals(6, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54492);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54493);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54494);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54495);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54496);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54497);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testFactoryWeeks() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19gcha161u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19gcha161u() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54498);
        __CLR4_4_1152z152zlgchosfu.R.inc(54499);Period test = Period.weeks(6);
        __CLR4_4_1152z152zlgchosfu.R.inc(54500);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54501);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54502);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54503);assertEquals(6, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54504);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54505);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54506);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54507);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54508);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testFactoryDays() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eiojd61625();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eiojd61625() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54509);
        __CLR4_4_1152z152zlgchosfu.R.inc(54510);Period test = Period.days(6);
        __CLR4_4_1152z152zlgchosfu.R.inc(54511);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54512);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54513);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54514);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54515);assertEquals(6, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54516);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54517);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54518);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54519);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testFactoryHours() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q7lvlq162g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q7lvlq162g() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54520);
        __CLR4_4_1152z152zlgchosfu.R.inc(54521);Period test = Period.hours(6);
        __CLR4_4_1152z152zlgchosfu.R.inc(54522);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54523);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54524);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54525);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54526);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54527);assertEquals(6, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54528);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54529);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54530);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testFactoryMinutes() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ilhdla162r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54531,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ilhdla162r() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54531);
        __CLR4_4_1152z152zlgchosfu.R.inc(54532);Period test = Period.minutes(6);
        __CLR4_4_1152z152zlgchosfu.R.inc(54533);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54534);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54535);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54536);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54537);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54538);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54539);assertEquals(6, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54540);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54541);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testFactorySeconds() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uznhym1632();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactorySeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uznhym1632() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54542);
        __CLR4_4_1152z152zlgchosfu.R.inc(54543);Period test = Period.seconds(6);
        __CLR4_4_1152z152zlgchosfu.R.inc(54544);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54545);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54546);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54547);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54548);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54549);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54550);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54551);assertEquals(6, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54552);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testFactoryMillis() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14j2ghn163d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54553,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14j2ghn163d() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54553);
        __CLR4_4_1152z152zlgchosfu.R.inc(54554);Period test = Period.millis(6);
        __CLR4_4_1152z152zlgchosfu.R.inc(54555);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54556);assertEquals(0, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54557);assertEquals(0, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54558);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54559);assertEquals(0, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54560);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54561);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54562);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54563);assertEquals(6, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-------------------------------------------------------------------------
    @Test
    public void testConstructor_trickyDifferences_RI_RI_toFeb_standardYear() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h795cu163o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_RI_RI_toFeb_standardYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h795cu163o() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54564);
        __CLR4_4_1152z152zlgchosfu.R.inc(54565);DateTime dt1 = new DateTime(2011, 1, 1, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54566);DateTime dt2 = new DateTime(2011, 2, 28, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54567);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54568);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54569);assertEquals(new Period(0, 1, 3, 6, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_trickyDifferences_RI_RI_toFeb_leapYear() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ohbsyf163u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_RI_RI_toFeb_leapYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ohbsyf163u() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54570);
        __CLR4_4_1152z152zlgchosfu.R.inc(54571);DateTime dt1 = new DateTime(2012, 1, 1, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54572);DateTime dt2 = new DateTime(2012, 2, 29, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54573);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54574);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54575);assertEquals(new Period(0, 1, 4, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_trickyDifferences_RI_RI_toFeb_exactMonths() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j2mkjg1640();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_RI_RI_toFeb_exactMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j2mkjg1640() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54576);
        __CLR4_4_1152z152zlgchosfu.R.inc(54577);DateTime dt1 = new DateTime(2004, 12, 28, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54578);DateTime dt2 = new DateTime(2005, 2, 28, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54579);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54580);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54581);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r87j831646();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r87j831646() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54582);
        __CLR4_4_1152z152zlgchosfu.R.inc(54583);DateTime dt1 = new DateTime(2004, 12, 29, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54584);DateTime dt2 = new DateTime(2005, 2, 28, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54585);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54586);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54587);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nz7kfm164c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nz7kfm164c() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54588);
        __CLR4_4_1152z152zlgchosfu.R.inc(54589);DateTime dt1 = new DateTime(2004, 12, 30, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54590);DateTime dt2 = new DateTime(2005, 2, 28, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54591);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54592);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54593);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth3() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kq7ln5164i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kq7ln5164i() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54594);
        __CLR4_4_1152z152zlgchosfu.R.inc(54595);DateTime dt1 = new DateTime(2004, 12, 31, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54596);DateTime dt2 = new DateTime(2005, 2, 28, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54597);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54598);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54599);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_trickyDifferences_RI_RI_toMar_endOfMonth1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xx1qlk164o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_RI_RI_toMar_endOfMonth1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54600,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xx1qlk164o() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54600);
        __CLR4_4_1152z152zlgchosfu.R.inc(54601);DateTime dt1 = new DateTime(2013, 1, 31, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54602);DateTime dt2 = new DateTime(2013, 3, 30, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54603);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54604);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54605);assertEquals(new Period(0, 1, 4, 2, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_trickyDifferences_RI_RI_toMar_endOfMonth2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xv2cl3164u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_RI_RI_toMar_endOfMonth2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xv2cl3164u() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54606);
        __CLR4_4_1152z152zlgchosfu.R.inc(54607);DateTime dt1 = new DateTime(2013, 1, 31, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54608);DateTime dt2 = new DateTime(2013, 3, 31, 0, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54609);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54610);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54611);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-------------------------------------------------------------------------
    @Test
    public void testConstructor_trickyDifferences_LD_LD_toFeb_standardYear() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n51ngi1650();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_standardYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n51ngi1650() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54612);
        __CLR4_4_1152z152zlgchosfu.R.inc(54613);LocalDate dt1 = new LocalDate(2011, 1, 1);
        __CLR4_4_1152z152zlgchosfu.R.inc(54614);LocalDate dt2 = new LocalDate(2011, 2, 28);
        __CLR4_4_1152z152zlgchosfu.R.inc(54615);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54616);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54617);assertEquals(new Period(0, 1, 3, 6, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_trickyDifferences_LD_LD_toFeb_leapYear() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13e9jg71656();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_leapYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54618,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13e9jg71656() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54618);
        __CLR4_4_1152z152zlgchosfu.R.inc(54619);LocalDate dt1 = new LocalDate(2012, 1, 1);
        __CLR4_4_1152z152zlgchosfu.R.inc(54620);LocalDate dt2 = new LocalDate(2012, 2, 29);
        __CLR4_4_1152z152zlgchosfu.R.inc(54621);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54622);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54623);assertEquals(new Period(0, 1, 4, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wmy2p0165c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54624,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wmy2p0165c() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54624);
        __CLR4_4_1152z152zlgchosfu.R.inc(54625);LocalDate dt1 = new LocalDate(2004, 12, 28);
        __CLR4_4_1152z152zlgchosfu.R.inc(54626);LocalDate dt2 = new LocalDate(2005, 2, 28);
        __CLR4_4_1152z152zlgchosfu.R.inc(54627);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54628);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54629);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17wo4hf165i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17wo4hf165i() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54630);
        __CLR4_4_1152z152zlgchosfu.R.inc(54631);LocalDate dt1 = new LocalDate(2004, 12, 29);
        __CLR4_4_1152z152zlgchosfu.R.inc(54632);LocalDate dt2 = new LocalDate(2005, 2, 28);
        __CLR4_4_1152z152zlgchosfu.R.inc(54633);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54634);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54635);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14no5oy165o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54636,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14no5oy165o() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54636);
        __CLR4_4_1152z152zlgchosfu.R.inc(54637);LocalDate dt1 = new LocalDate(2004, 12, 30);
        __CLR4_4_1152z152zlgchosfu.R.inc(54638);LocalDate dt2 = new LocalDate(2005, 2, 28);
        __CLR4_4_1152z152zlgchosfu.R.inc(54639);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54640);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54641);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth3() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11eo6wh165u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11eo6wh165u() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54642);
        __CLR4_4_1152z152zlgchosfu.R.inc(54643);LocalDate dt1 = new LocalDate(2004, 12, 31);
        __CLR4_4_1152z152zlgchosfu.R.inc(54644);LocalDate dt2 = new LocalDate(2005, 2, 28);
        __CLR4_4_1152z152zlgchosfu.R.inc(54645);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54646);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54647);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_trickyDifferences_LD_LD_toMar_endOfMonth1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hsiwmw1660();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toMar_endOfMonth1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54648,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hsiwmw1660() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54648);
        __CLR4_4_1152z152zlgchosfu.R.inc(54649);LocalDate dt1 = new LocalDate(2013, 1, 31);
        __CLR4_4_1152z152zlgchosfu.R.inc(54650);LocalDate dt2 = new LocalDate(2013, 3, 30);
        __CLR4_4_1152z152zlgchosfu.R.inc(54651);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54652);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54653);assertEquals(new Period(0, 1, 4, 2, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testConstructor_trickyDifferences_LD_LD_toMar_endOfMonth2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ejixuf1666();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toMar_endOfMonth2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ejixuf1666() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54654);
        __CLR4_4_1152z152zlgchosfu.R.inc(54655);LocalDate dt1 = new LocalDate(2013, 1, 31);
        __CLR4_4_1152z152zlgchosfu.R.inc(54656);LocalDate dt2 = new LocalDate(2013, 3, 31);
        __CLR4_4_1152z152zlgchosfu.R.inc(54657);Period test = new Period(dt1, dt2);
        __CLR4_4_1152z152zlgchosfu.R.inc(54658);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54659);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testFactoryFieldDifference1() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qkwu4n166c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qkwu4n166c() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54660);
        __CLR4_4_1152z152zlgchosfu.R.inc(54661);YearMonthDay start = new YearMonthDay(2005, 4, 9);
        __CLR4_4_1152z152zlgchosfu.R.inc(54662);DateTimeFieldType[] types = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.dayOfMonth(),
        };
        __CLR4_4_1152z152zlgchosfu.R.inc(54663);Partial end = new Partial(types, new int[]{2004, 6, 7});
        __CLR4_4_1152z152zlgchosfu.R.inc(54664);Period test = Period.fieldDifference(start, end);
        __CLR4_4_1152z152zlgchosfu.R.inc(54665);assertEquals(PeriodType.yearMonthDay(), test.getPeriodType());
        __CLR4_4_1152z152zlgchosfu.R.inc(54666);assertEquals(-1, test.getYears());
        __CLR4_4_1152z152zlgchosfu.R.inc(54667);assertEquals(2, test.getMonths());
        __CLR4_4_1152z152zlgchosfu.R.inc(54668);assertEquals(0, test.getWeeks());
        __CLR4_4_1152z152zlgchosfu.R.inc(54669);assertEquals(-2, test.getDays());
        __CLR4_4_1152z152zlgchosfu.R.inc(54670);assertEquals(0, test.getHours());
        __CLR4_4_1152z152zlgchosfu.R.inc(54671);assertEquals(0, test.getMinutes());
        __CLR4_4_1152z152zlgchosfu.R.inc(54672);assertEquals(0, test.getSeconds());
        __CLR4_4_1152z152zlgchosfu.R.inc(54673);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testFactoryFieldDifference2() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbwvc6166q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbwvc6166q() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54674);
        __CLR4_4_1152z152zlgchosfu.R.inc(54675);YearMonthDay ymd = new YearMonthDay(2005, 4, 9);
        __CLR4_4_1152z152zlgchosfu.R.inc(54676);try {
            __CLR4_4_1152z152zlgchosfu.R.inc(54677);Period.fieldDifference(ymd, (ReadablePartial) null);
            __CLR4_4_1152z152zlgchosfu.R.inc(54678);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1152z152zlgchosfu.R.inc(54679);try {
            __CLR4_4_1152z152zlgchosfu.R.inc(54680);Period.fieldDifference((ReadablePartial) null, ymd);
            __CLR4_4_1152z152zlgchosfu.R.inc(54681);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testFactoryFieldDifference3() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k2wwjp166y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k2wwjp166y() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54682);
        __CLR4_4_1152z152zlgchosfu.R.inc(54683);YearMonthDay start = new YearMonthDay(2005, 4, 9);
        __CLR4_4_1152z152zlgchosfu.R.inc(54684);TimeOfDay endTime = new TimeOfDay(12, 30, 40, 0);
        __CLR4_4_1152z152zlgchosfu.R.inc(54685);try {
            __CLR4_4_1152z152zlgchosfu.R.inc(54686);Period.fieldDifference(start, endTime);
            __CLR4_4_1152z152zlgchosfu.R.inc(54687);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testFactoryFieldDifference4() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gtwxr81674();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54688,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gtwxr81674() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54688);
        __CLR4_4_1152z152zlgchosfu.R.inc(54689);DateTimeFieldType[] types = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.dayOfWeek(),
        };
        __CLR4_4_1152z152zlgchosfu.R.inc(54690);YearMonthDay start = new YearMonthDay(2005, 4, 9);
        __CLR4_4_1152z152zlgchosfu.R.inc(54691);Partial end = new Partial(types, new int[]{1, 2, 3});
        __CLR4_4_1152z152zlgchosfu.R.inc(54692);try {
            __CLR4_4_1152z152zlgchosfu.R.inc(54693);Period.fieldDifference(start, end);
            __CLR4_4_1152z152zlgchosfu.R.inc(54694);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

    @Test
    public void testFactoryFieldDifference5() throws Throwable {__CLR4_4_1152z152zlgchosfu.R.globalSliceStart(getClass().getName(),54695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dkwyyr167b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1152z152zlgchosfu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1152z152zlgchosfu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dkwyyr167b() throws Throwable{try{__CLR4_4_1152z152zlgchosfu.R.inc(54695);
        __CLR4_4_1152z152zlgchosfu.R.inc(54696);DateTimeFieldType[] types = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
                DateTimeFieldType.dayOfMonth(),
                DateTimeFieldType.dayOfWeek(),
        };
        __CLR4_4_1152z152zlgchosfu.R.inc(54697);Partial start = new Partial(types, new int[]{1, 2, 3});
        __CLR4_4_1152z152zlgchosfu.R.inc(54698);Partial end = new Partial(types, new int[]{1, 2, 3});
        __CLR4_4_1152z152zlgchosfu.R.inc(54699);try {
            __CLR4_4_1152z152zlgchosfu.R.inc(54700);Period.fieldDifference(start, end);
            __CLR4_4_1152z152zlgchosfu.R.inc(54701);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1152z152zlgchosfu.R.flushNeeded();}}

}
