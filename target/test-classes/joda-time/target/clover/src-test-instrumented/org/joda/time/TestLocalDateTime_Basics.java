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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDate.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDateTime_Basics {static class __CLR4_4_1radradlgchory4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,36282,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final GJChronology GJ_UTC = GJChronology.getInstanceUTC();
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
    private static final Chronology ISO_NEW_YORK = ISOChronology.getInstance(NEW_YORK);
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);

//    private long TEST_TIME1 =
//        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 12L * DateTimeConstants.MILLIS_PER_HOUR
//        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//
//    private long TEST_TIME2 =
//        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 14L * DateTimeConstants.MILLIS_PER_HOUR
//        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private int MILLIS_OF_DAY_UTC =
            (int) (10L * DateTimeConstants.MILLIS_PER_HOUR
                    + 20L * DateTimeConstants.MILLIS_PER_MINUTE
                    + 30L * DateTimeConstants.MILLIS_PER_SECOND
                    + 40L);

    private long TEST_TIME_NOW_UTC =
            (31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY + MILLIS_OF_DAY_UTC;

    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_1radradlgchory4.R.inc(35365);
        __CLR4_4_1radradlgchory4.R.inc(35366);TestLocalDateTime_Basics TB = new TestLocalDateTime_Basics();
        __CLR4_4_1radradlgchory4.R.inc(35367);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35368);TB.testGet_DateTimeFieldType();
        __CLR4_4_1radradlgchory4.R.inc(35369);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35370);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35371);TB.testSize();
        __CLR4_4_1radradlgchory4.R.inc(35372);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35373);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35374);TB.testGetFieldType_int();
        __CLR4_4_1radradlgchory4.R.inc(35375);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35376);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35377);TB.testGetFieldTypes();
        __CLR4_4_1radradlgchory4.R.inc(35378);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35379);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35380);TB.testGetField_int();
        __CLR4_4_1radradlgchory4.R.inc(35381);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35382);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35383);TB.testGetFields();
        __CLR4_4_1radradlgchory4.R.inc(35384);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35385);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35386);TB.testGetValue_int();
        __CLR4_4_1radradlgchory4.R.inc(35387);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35388);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35389);TB.testGetValues();
        __CLR4_4_1radradlgchory4.R.inc(35390);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35391);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35392);TB.testIsSupported_DateTimeFieldType();
        __CLR4_4_1radradlgchory4.R.inc(35393);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35394);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35395);TB.testIsSupported_DurationFieldType();
        __CLR4_4_1radradlgchory4.R.inc(35396);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35397);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35398);TB.testEqualsHashCode();
        __CLR4_4_1radradlgchory4.R.inc(35399);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35400);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35401);TB.testCompareTo();
        __CLR4_4_1radradlgchory4.R.inc(35402);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35403);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35404);TB.testIsEqual_LocalDateTime();
        __CLR4_4_1radradlgchory4.R.inc(35405);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35406);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35407);TB.testIsBefore_LocalDateTime();
        __CLR4_4_1radradlgchory4.R.inc(35408);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35409);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35410);TB.testIsAfter_LocalDateTime();
        __CLR4_4_1radradlgchory4.R.inc(35411);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35412);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35413);TB.testWithDate();
        __CLR4_4_1radradlgchory4.R.inc(35414);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35415);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35416);TB.testWithTime();
        __CLR4_4_1radradlgchory4.R.inc(35417);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35418);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35419);TB.testWithField_DateTimeFieldType_int_1();
        __CLR4_4_1radradlgchory4.R.inc(35420);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35421);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35422);TB.testWithField_DateTimeFieldType_int_2();
        __CLR4_4_1radradlgchory4.R.inc(35423);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35424);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35425);TB.testWithField_DateTimeFieldType_int_3();
        __CLR4_4_1radradlgchory4.R.inc(35426);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35427);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35428);TB.testWithFieldAdded_DurationFieldType_int_1();
        __CLR4_4_1radradlgchory4.R.inc(35429);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35430);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35431);TB.testWithFieldAdded_DurationFieldType_int_2();
        __CLR4_4_1radradlgchory4.R.inc(35432);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35433);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35434);TB.testWithFieldAdded_DurationFieldType_int_3();
        __CLR4_4_1radradlgchory4.R.inc(35435);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35436);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35437);TB.testWithFieldAdded_DurationFieldType_int_4();
        __CLR4_4_1radradlgchory4.R.inc(35438);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35439);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35440);TB.testPlus_RP();
        __CLR4_4_1radradlgchory4.R.inc(35441);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35442);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35443);TB.testPlusYears_int();
        __CLR4_4_1radradlgchory4.R.inc(35444);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35445);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35446);TB.testPlusMonths_int();
        __CLR4_4_1radradlgchory4.R.inc(35447);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35448);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35449);TB.testPlusWeeks_int();
        __CLR4_4_1radradlgchory4.R.inc(35450);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35451);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35452);TB.testPlusDays_int();
        __CLR4_4_1radradlgchory4.R.inc(35453);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35454);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35455);TB.testPlusHours_int();
        __CLR4_4_1radradlgchory4.R.inc(35456);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35457);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35458);TB.testPlusMinutes_int();
        __CLR4_4_1radradlgchory4.R.inc(35459);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35460);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35461);TB.testPlusSeconds_int();
        __CLR4_4_1radradlgchory4.R.inc(35462);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35463);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35464);TB.testPlusMillis_int();
        __CLR4_4_1radradlgchory4.R.inc(35465);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35466);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35467);TB.testMinus_RP();
        __CLR4_4_1radradlgchory4.R.inc(35468);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35469);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35470);TB.testMinusYears_int();
        __CLR4_4_1radradlgchory4.R.inc(35471);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35472);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35473);TB.testMinusMonths_int();
        __CLR4_4_1radradlgchory4.R.inc(35474);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35475);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35476);TB.testMinusWeeks_int();
        __CLR4_4_1radradlgchory4.R.inc(35477);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35478);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35479);TB.testMinusDays_int();
        __CLR4_4_1radradlgchory4.R.inc(35480);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35481);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35482);TB.testMinusHours_int();
        __CLR4_4_1radradlgchory4.R.inc(35483);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35484);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35485);TB.testMinusMinutes_int();
        __CLR4_4_1radradlgchory4.R.inc(35486);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35487);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35488);TB.testMinusSeconds_int();
        __CLR4_4_1radradlgchory4.R.inc(35489);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35490);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35491);TB.testMinusMillis_int();
        __CLR4_4_1radradlgchory4.R.inc(35492);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35493);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35494);TB.testGetters();
        __CLR4_4_1radradlgchory4.R.inc(35495);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35496);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35497);TB.testWithers();
        __CLR4_4_1radradlgchory4.R.inc(35498);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35499);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35500);TB.testToDateTime();
        __CLR4_4_1radradlgchory4.R.inc(35501);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35502);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35503);TB.testToDateTime_Zone();
        __CLR4_4_1radradlgchory4.R.inc(35504);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35505);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35506);TB.testToDateTime_nullZone();
        __CLR4_4_1radradlgchory4.R.inc(35507);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35508);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35509);TB.testToDateTime_Zone_dstGap();
        __CLR4_4_1radradlgchory4.R.inc(35510);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35511);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35512);TB.testToDateTime_Zone_dstOverlap();
        __CLR4_4_1radradlgchory4.R.inc(35513);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35514);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35515);TB.testToDateTime_Zone_dstOverlap_NewYork();
        __CLR4_4_1radradlgchory4.R.inc(35516);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35517);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35518);TB.testToLocalDate();
        __CLR4_4_1radradlgchory4.R.inc(35519);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35520);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35521);TB.testToLocalTime();
        __CLR4_4_1radradlgchory4.R.inc(35522);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35523);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35524);TB.testToDateTime_RI();
        __CLR4_4_1radradlgchory4.R.inc(35525);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35526);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35527);TB.testToDateTime_nullRI();
        __CLR4_4_1radradlgchory4.R.inc(35528);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35529);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35530);TB.testToDate_summer();
        __CLR4_4_1radradlgchory4.R.inc(35531);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35532);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35533);TB.testToDate_winter();
        __CLR4_4_1radradlgchory4.R.inc(35534);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35535);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35536);TB.testToDate_springDST();
        __CLR4_4_1radradlgchory4.R.inc(35537);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35538);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35539);TB.testToDate_springDST_2Hour40Savings();
        __CLR4_4_1radradlgchory4.R.inc(35540);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35541);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35542);TB.testToDate_autumnDST();
        __CLR4_4_1radradlgchory4.R.inc(35543);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35544);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35545);TB.testToDate_summer_Zone();
        __CLR4_4_1radradlgchory4.R.inc(35546);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35547);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35548);TB.testToDate_winter_Zone();
        __CLR4_4_1radradlgchory4.R.inc(35549);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35550);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35551);TB.testToDate_springDST_Zone();
        __CLR4_4_1radradlgchory4.R.inc(35552);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35553);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35554);TB.testToDate_springDST_2Hour40Savings_Zone();
        __CLR4_4_1radradlgchory4.R.inc(35555);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35556);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35557);TB.testToDate_autumnDST_Zone();
        __CLR4_4_1radradlgchory4.R.inc(35558);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35559);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35560);TB.testProperty();
        __CLR4_4_1radradlgchory4.R.inc(35561);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35562);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35563);TB.testSerialization();
        __CLR4_4_1radradlgchory4.R.inc(35564);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35565);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35566);TB.testToString();
        __CLR4_4_1radradlgchory4.R.inc(35567);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35568);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35569);TB.testToString_String();
        __CLR4_4_1radradlgchory4.R.inc(35570);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35571);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35572);TB.testToString_String_Locale();
        __CLR4_4_1radradlgchory4.R.inc(35573);TB.tearDown();
        __CLR4_4_1radradlgchory4.R.inc(35574);TB.setUp();
        __CLR4_4_1radradlgchory4.R.inc(35575);TB.testToString_DTFormatter();
        __CLR4_4_1radradlgchory4.R.inc(35576);TB.tearDown();

    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestLocalDateTime_Basics.class);
    }

    public TestLocalDateTime_Basics(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1radradlgchory4.R.inc(35577);
        __CLR4_4_1radradlgchory4.R.inc(35578);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1radradlgchory4.R.inc(35579);zone = DateTimeZone.getDefault();
        __CLR4_4_1radradlgchory4.R.inc(35580);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35581);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1radradlgchory4.R.inc(35582);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1radradlgchory4.R.inc(35583);
        __CLR4_4_1radradlgchory4.R.inc(35584);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1radradlgchory4.R.inc(35585);DateTimeZone.setDefault(zone);
        __CLR4_4_1radradlgchory4.R.inc(35586);zone = null;
        __CLR4_4_1radradlgchory4.R.inc(35587);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1radradlgchory4.R.inc(35588);systemDefaultLocale = null;
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGet_DateTimeFieldType() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyir3vrgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGet_DateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35589,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyir3vrgl(){try{__CLR4_4_1radradlgchory4.R.inc(35589);
        __CLR4_4_1radradlgchory4.R.inc(35590);LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35591);assertEquals(1970, test.get(DateTimeFieldType.year()));
        __CLR4_4_1radradlgchory4.R.inc(35592);assertEquals(6, test.get(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1radradlgchory4.R.inc(35593);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1radradlgchory4.R.inc(35594);assertEquals(2, test.get(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1radradlgchory4.R.inc(35595);assertEquals(160, test.get(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1radradlgchory4.R.inc(35596);assertEquals(24, test.get(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1radradlgchory4.R.inc(35597);assertEquals(1970, test.get(DateTimeFieldType.weekyear()));
        __CLR4_4_1radradlgchory4.R.inc(35598);assertEquals(10, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1radradlgchory4.R.inc(35599);assertEquals(20, test.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1radradlgchory4.R.inc(35600);assertEquals(30, test.get(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1radradlgchory4.R.inc(35601);assertEquals(40, test.get(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1radradlgchory4.R.inc(35602);assertEquals(MILLIS_OF_DAY_UTC / 60000, test.get(DateTimeFieldType.minuteOfDay()));
        __CLR4_4_1radradlgchory4.R.inc(35603);assertEquals(MILLIS_OF_DAY_UTC / 1000, test.get(DateTimeFieldType.secondOfDay()));
        __CLR4_4_1radradlgchory4.R.inc(35604);assertEquals(MILLIS_OF_DAY_UTC, test.get(DateTimeFieldType.millisOfDay()));
        __CLR4_4_1radradlgchory4.R.inc(35605);assertEquals(10, test.get(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1radradlgchory4.R.inc(35606);assertEquals(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay()));

        __CLR4_4_1radradlgchory4.R.inc(35607);test = new LocalDateTime(1970, 6, 9, 12, 30);
        __CLR4_4_1radradlgchory4.R.inc(35608);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1radradlgchory4.R.inc(35609);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1radradlgchory4.R.inc(35610);assertEquals(12, test.get(DateTimeFieldType.clockhourOfDay()));
        __CLR4_4_1radradlgchory4.R.inc(35611);assertEquals(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1radradlgchory4.R.inc(35612);test = new LocalDateTime(1970, 6, 9, 14, 30);
        __CLR4_4_1radradlgchory4.R.inc(35613);assertEquals(2, test.get(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1radradlgchory4.R.inc(35614);assertEquals(2, test.get(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1radradlgchory4.R.inc(35615);assertEquals(14, test.get(DateTimeFieldType.clockhourOfDay()));
        __CLR4_4_1radradlgchory4.R.inc(35616);assertEquals(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1radradlgchory4.R.inc(35617);test = new LocalDateTime(1970, 6, 9, 0, 30);
        __CLR4_4_1radradlgchory4.R.inc(35618);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1radradlgchory4.R.inc(35619);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1radradlgchory4.R.inc(35620);assertEquals(24, test.get(DateTimeFieldType.clockhourOfDay()));
        __CLR4_4_1radradlgchory4.R.inc(35621);assertEquals(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1radradlgchory4.R.inc(35622);try {
            __CLR4_4_1radradlgchory4.R.inc(35623);test.get(null);
            __CLR4_4_1radradlgchory4.R.inc(35624);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testSize() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xx122rhl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35625,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xx122rhl(){try{__CLR4_4_1radradlgchory4.R.inc(35625);
        __CLR4_4_1radradlgchory4.R.inc(35626);LocalDateTime test = new LocalDateTime();
        __CLR4_4_1radradlgchory4.R.inc(35627);assertEquals(4, test.size());
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testGetFieldType_int() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v547gnrho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetFieldType_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35628,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v547gnrho(){try{__CLR4_4_1radradlgchory4.R.inc(35628);
        __CLR4_4_1radradlgchory4.R.inc(35629);LocalDateTime test = new LocalDateTime(COPTIC_PARIS);
        __CLR4_4_1radradlgchory4.R.inc(35630);assertSame(DateTimeFieldType.year(), test.getFieldType(0));
        __CLR4_4_1radradlgchory4.R.inc(35631);assertSame(DateTimeFieldType.monthOfYear(), test.getFieldType(1));
        __CLR4_4_1radradlgchory4.R.inc(35632);assertSame(DateTimeFieldType.dayOfMonth(), test.getFieldType(2));
        __CLR4_4_1radradlgchory4.R.inc(35633);assertSame(DateTimeFieldType.millisOfDay(), test.getFieldType(3));
        __CLR4_4_1radradlgchory4.R.inc(35634);try {
            __CLR4_4_1radradlgchory4.R.inc(35635);test.getFieldType(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_1radradlgchory4.R.inc(35636);try {
            __CLR4_4_1radradlgchory4.R.inc(35637);test.getFieldType(3);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testGetFieldTypes() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5ndvurhy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetFieldTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5ndvurhy(){try{__CLR4_4_1radradlgchory4.R.inc(35638);
        __CLR4_4_1radradlgchory4.R.inc(35639);LocalDateTime test = new LocalDateTime(COPTIC_PARIS);
        __CLR4_4_1radradlgchory4.R.inc(35640);DateTimeFieldType[] fields = test.getFieldTypes();
        __CLR4_4_1radradlgchory4.R.inc(35641);assertSame(DateTimeFieldType.year(), fields[0]);
        __CLR4_4_1radradlgchory4.R.inc(35642);assertSame(DateTimeFieldType.monthOfYear(), fields[1]);
        __CLR4_4_1radradlgchory4.R.inc(35643);assertSame(DateTimeFieldType.dayOfMonth(), fields[2]);
        __CLR4_4_1radradlgchory4.R.inc(35644);assertSame(DateTimeFieldType.millisOfDay(), fields[3]);
        __CLR4_4_1radradlgchory4.R.inc(35645);assertNotSame(test.getFieldTypes(), test.getFieldTypes());
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testGetField_int() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1esjyjxri6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetField_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35646,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1esjyjxri6(){try{__CLR4_4_1radradlgchory4.R.inc(35646);
        __CLR4_4_1radradlgchory4.R.inc(35647);LocalDateTime test = new LocalDateTime(COPTIC_PARIS);
        __CLR4_4_1radradlgchory4.R.inc(35648);assertSame(COPTIC_UTC.year(), test.getField(0));
        __CLR4_4_1radradlgchory4.R.inc(35649);assertSame(COPTIC_UTC.monthOfYear(), test.getField(1));
        __CLR4_4_1radradlgchory4.R.inc(35650);assertSame(COPTIC_UTC.dayOfMonth(), test.getField(2));
        __CLR4_4_1radradlgchory4.R.inc(35651);assertSame(COPTIC_UTC.millisOfDay(), test.getField(3));
        __CLR4_4_1radradlgchory4.R.inc(35652);try {
            __CLR4_4_1radradlgchory4.R.inc(35653);test.getField(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_1radradlgchory4.R.inc(35654);try {
            __CLR4_4_1radradlgchory4.R.inc(35655);test.getField(3);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testGetFields() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmeasrig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmeasrig(){try{__CLR4_4_1radradlgchory4.R.inc(35656);
        __CLR4_4_1radradlgchory4.R.inc(35657);LocalDateTime test = new LocalDateTime(COPTIC_PARIS);
        __CLR4_4_1radradlgchory4.R.inc(35658);DateTimeField[] fields = test.getFields();
        __CLR4_4_1radradlgchory4.R.inc(35659);assertSame(COPTIC_UTC.year(), fields[0]);
        __CLR4_4_1radradlgchory4.R.inc(35660);assertSame(COPTIC_UTC.monthOfYear(), fields[1]);
        __CLR4_4_1radradlgchory4.R.inc(35661);assertSame(COPTIC_UTC.dayOfMonth(), fields[2]);
        __CLR4_4_1radradlgchory4.R.inc(35662);assertSame(COPTIC_UTC.millisOfDay(), fields[3]);
        __CLR4_4_1radradlgchory4.R.inc(35663);assertNotSame(test.getFields(), test.getFields());
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testGetValue_int() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gmp610rio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetValue_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35664,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gmp610rio(){try{__CLR4_4_1radradlgchory4.R.inc(35664);
        __CLR4_4_1radradlgchory4.R.inc(35665);LocalDateTime test = new LocalDateTime(ISO_UTC);
        __CLR4_4_1radradlgchory4.R.inc(35666);assertEquals(1970, test.getValue(0));
        __CLR4_4_1radradlgchory4.R.inc(35667);assertEquals(6, test.getValue(1));
        __CLR4_4_1radradlgchory4.R.inc(35668);assertEquals(9, test.getValue(2));
        __CLR4_4_1radradlgchory4.R.inc(35669);assertEquals(MILLIS_OF_DAY_UTC, test.getValue(3));
        __CLR4_4_1radradlgchory4.R.inc(35670);try {
            __CLR4_4_1radradlgchory4.R.inc(35671);test.getValue(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_1radradlgchory4.R.inc(35672);try {
            __CLR4_4_1radradlgchory4.R.inc(35673);test.getValue(3);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testGetValues() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gduelriy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gduelriy(){try{__CLR4_4_1radradlgchory4.R.inc(35674);
        __CLR4_4_1radradlgchory4.R.inc(35675);LocalDateTime test = new LocalDateTime(ISO_UTC);
        __CLR4_4_1radradlgchory4.R.inc(35676);int[] values = test.getValues();
        __CLR4_4_1radradlgchory4.R.inc(35677);assertEquals(1970, values[0]);
        __CLR4_4_1radradlgchory4.R.inc(35678);assertEquals(6, values[1]);
        __CLR4_4_1radradlgchory4.R.inc(35679);assertEquals(9, values[2]);
        __CLR4_4_1radradlgchory4.R.inc(35680);assertEquals(MILLIS_OF_DAY_UTC, values[3]);
        __CLR4_4_1radradlgchory4.R.inc(35681);assertNotSame(test.getValues(), test.getValues());
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testIsSupported_DateTimeFieldType() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iyuedvrj6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsSupported_DateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iyuedvrj6(){try{__CLR4_4_1radradlgchory4.R.inc(35682);
        __CLR4_4_1radradlgchory4.R.inc(35683);LocalDateTime test = new LocalDateTime();
        __CLR4_4_1radradlgchory4.R.inc(35684);assertEquals(true, test.isSupported(DateTimeFieldType.year()));
        __CLR4_4_1radradlgchory4.R.inc(35685);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1radradlgchory4.R.inc(35686);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1radradlgchory4.R.inc(35687);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1radradlgchory4.R.inc(35688);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1radradlgchory4.R.inc(35689);assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1radradlgchory4.R.inc(35690);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear()));
        __CLR4_4_1radradlgchory4.R.inc(35691);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury()));
        __CLR4_4_1radradlgchory4.R.inc(35692);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra()));
        __CLR4_4_1radradlgchory4.R.inc(35693);assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra()));
        __CLR4_4_1radradlgchory4.R.inc(35694);assertEquals(true, test.isSupported(DateTimeFieldType.weekyearOfCentury()));
        __CLR4_4_1radradlgchory4.R.inc(35695);assertEquals(true, test.isSupported(DateTimeFieldType.era()));

        __CLR4_4_1radradlgchory4.R.inc(35696);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1radradlgchory4.R.inc(35697);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1radradlgchory4.R.inc(35698);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1radradlgchory4.R.inc(35699);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1radradlgchory4.R.inc(35700);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay()));
        __CLR4_4_1radradlgchory4.R.inc(35701);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay()));
        __CLR4_4_1radradlgchory4.R.inc(35702);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay()));
        __CLR4_4_1radradlgchory4.R.inc(35703);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1radradlgchory4.R.inc(35704);assertEquals(true, test.isSupported(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1radradlgchory4.R.inc(35705);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1radradlgchory4.R.inc(35706);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfDay()));

        __CLR4_4_1radradlgchory4.R.inc(35707);assertEquals(false, test.isSupported((DateTimeFieldType) null));
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testIsSupported_DurationFieldType() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3fm3erjw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsSupported_DurationFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35708,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3fm3erjw(){try{__CLR4_4_1radradlgchory4.R.inc(35708);
        __CLR4_4_1radradlgchory4.R.inc(35709);LocalDateTime test = new LocalDateTime();
        __CLR4_4_1radradlgchory4.R.inc(35710);assertEquals(false, test.isSupported(DurationFieldType.eras()));
        __CLR4_4_1radradlgchory4.R.inc(35711);assertEquals(true, test.isSupported(DurationFieldType.centuries()));
        __CLR4_4_1radradlgchory4.R.inc(35712);assertEquals(true, test.isSupported(DurationFieldType.years()));
        __CLR4_4_1radradlgchory4.R.inc(35713);assertEquals(true, test.isSupported(DurationFieldType.months()));
        __CLR4_4_1radradlgchory4.R.inc(35714);assertEquals(true, test.isSupported(DurationFieldType.weekyears()));
        __CLR4_4_1radradlgchory4.R.inc(35715);assertEquals(true, test.isSupported(DurationFieldType.weeks()));
        __CLR4_4_1radradlgchory4.R.inc(35716);assertEquals(true, test.isSupported(DurationFieldType.days()));

        __CLR4_4_1radradlgchory4.R.inc(35717);assertEquals(true, test.isSupported(DurationFieldType.hours()));
        __CLR4_4_1radradlgchory4.R.inc(35718);assertEquals(true, test.isSupported(DurationFieldType.minutes()));
        __CLR4_4_1radradlgchory4.R.inc(35719);assertEquals(true, test.isSupported(DurationFieldType.seconds()));
        __CLR4_4_1radradlgchory4.R.inc(35720);assertEquals(true, test.isSupported(DurationFieldType.millis()));
        __CLR4_4_1radradlgchory4.R.inc(35721);assertEquals(true, test.isSupported(DurationFieldType.halfdays()));

        __CLR4_4_1radradlgchory4.R.inc(35722);assertEquals(false, test.isSupported((DurationFieldType) null));
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testEqualsHashCode() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77rkb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77rkb(){try{__CLR4_4_1radradlgchory4.R.inc(35723);
        __CLR4_4_1radradlgchory4.R.inc(35724);LocalDateTime test1 = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_1radradlgchory4.R.inc(35725);LocalDateTime test2 = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_1radradlgchory4.R.inc(35726);assertEquals(true, test1.equals(test2));
        __CLR4_4_1radradlgchory4.R.inc(35727);assertEquals(true, test2.equals(test1));
        __CLR4_4_1radradlgchory4.R.inc(35728);assertEquals(true, test1.equals(test1));
        __CLR4_4_1radradlgchory4.R.inc(35729);assertEquals(true, test2.equals(test2));
        __CLR4_4_1radradlgchory4.R.inc(35730);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1radradlgchory4.R.inc(35731);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1radradlgchory4.R.inc(35732);assertEquals(true, test2.hashCode() == test2.hashCode());

        __CLR4_4_1radradlgchory4.R.inc(35733);LocalDateTime test3 = new LocalDateTime(1971, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35734);assertEquals(false, test1.equals(test3));
        __CLR4_4_1radradlgchory4.R.inc(35735);assertEquals(false, test2.equals(test3));
        __CLR4_4_1radradlgchory4.R.inc(35736);assertEquals(false, test3.equals(test1));
        __CLR4_4_1radradlgchory4.R.inc(35737);assertEquals(false, test3.equals(test2));
        __CLR4_4_1radradlgchory4.R.inc(35738);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1radradlgchory4.R.inc(35739);assertEquals(false, test2.hashCode() == test3.hashCode());

        __CLR4_4_1radradlgchory4.R.inc(35740);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1radradlgchory4.R.inc(35741);assertEquals(true, test1.equals(new MockInstant()));
        __CLR4_4_1radradlgchory4.R.inc(35742);Partial partial = new Partial(
                new DateTimeFieldType[]{
                        DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(),
                        DateTimeFieldType.dayOfMonth(), DateTimeFieldType.millisOfDay()},
                new int[]{1970, 6, 9, MILLIS_OF_DAY_UTC}, COPTIC_PARIS);
        __CLR4_4_1radradlgchory4.R.inc(35743);assertEquals(true, test1.equals(partial));
        __CLR4_4_1radradlgchory4.R.inc(35744);assertEquals(true, test1.hashCode() == partial.hashCode());
        __CLR4_4_1radradlgchory4.R.inc(35745);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE));
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1radradlgchory4.R.inc(35746);
            __CLR4_4_1radradlgchory4.R.inc(35747);return COPTIC_UTC;
        }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

        public DateTimeField[] getFields() {try{__CLR4_4_1radradlgchory4.R.inc(35748);
            __CLR4_4_1radradlgchory4.R.inc(35749);return new DateTimeField[]{
                    COPTIC_UTC.year(),
                    COPTIC_UTC.monthOfYear(),
                    COPTIC_UTC.dayOfMonth(),
                    COPTIC_UTC.millisOfDay(),
            };
        }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

        public int[] getValues() {try{__CLR4_4_1radradlgchory4.R.inc(35750);
            __CLR4_4_1radradlgchory4.R.inc(35751);return new int[]{1970, 6, 9, MILLIS_OF_DAY_UTC};
        }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    @Test
    public void testCompareTo() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfvrl4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35752,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfvrl4(){try{__CLR4_4_1radradlgchory4.R.inc(35752);
        __CLR4_4_1radradlgchory4.R.inc(35753);LocalDateTime test1 = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35754);LocalDateTime test1a = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35755);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_1radradlgchory4.R.inc(35756);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_1radradlgchory4.R.inc(35757);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_1radradlgchory4.R.inc(35758);assertEquals(0, test1a.compareTo(test1a));

        __CLR4_4_1radradlgchory4.R.inc(35759);LocalDateTime test2 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35760);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_1radradlgchory4.R.inc(35761);assertEquals(+1, test2.compareTo(test1));

        __CLR4_4_1radradlgchory4.R.inc(35762);LocalDateTime test3 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40, GREGORIAN_UTC);
        __CLR4_4_1radradlgchory4.R.inc(35763);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_1radradlgchory4.R.inc(35764);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_1radradlgchory4.R.inc(35765);assertEquals(0, test3.compareTo(test2));

        __CLR4_4_1radradlgchory4.R.inc(35766);DateTimeFieldType[] types = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.dayOfMonth(),
                DateTimeFieldType.millisOfDay(),
        };
        __CLR4_4_1radradlgchory4.R.inc(35767);int[] values = new int[]{2005, 6, 2, MILLIS_OF_DAY_UTC};
        __CLR4_4_1radradlgchory4.R.inc(35768);Partial p = new Partial(types, values);
        __CLR4_4_1radradlgchory4.R.inc(35769);assertEquals(0, test1.compareTo(p));
        __CLR4_4_1radradlgchory4.R.inc(35770);try {
            __CLR4_4_1radradlgchory4.R.inc(35771);test1.compareTo(null);
            __CLR4_4_1radradlgchory4.R.inc(35772);fail();
        } catch (NullPointerException ex) {
        }
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
        __CLR4_4_1radradlgchory4.R.inc(35773);try {
            __CLR4_4_1radradlgchory4.R.inc(35774);@SuppressWarnings("deprecation")
            YearMonthDay ymd = new YearMonthDay();
            __CLR4_4_1radradlgchory4.R.inc(35775);test1.compareTo(ymd);
            __CLR4_4_1radradlgchory4.R.inc(35776);fail();
        } catch (ClassCastException ex) {
        }
        __CLR4_4_1radradlgchory4.R.inc(35777);try {
            __CLR4_4_1radradlgchory4.R.inc(35778);@SuppressWarnings("deprecation")
            TimeOfDay tod = new TimeOfDay();
            __CLR4_4_1radradlgchory4.R.inc(35779);test1.compareTo(tod);
            __CLR4_4_1radradlgchory4.R.inc(35780);fail();
        } catch (ClassCastException ex) {
        }
        __CLR4_4_1radradlgchory4.R.inc(35781);Partial partial = new Partial()
                .with(DateTimeFieldType.centuryOfEra(), 1)
                .with(DateTimeFieldType.halfdayOfDay(), 0)
                .with(DateTimeFieldType.dayOfMonth(), 9);
        __CLR4_4_1radradlgchory4.R.inc(35782);try {
            __CLR4_4_1radradlgchory4.R.inc(35783);new LocalDateTime(1970, 6, 9, 10, 20, 30, 40).compareTo(partial);
            __CLR4_4_1radradlgchory4.R.inc(35784);fail();
        } catch (ClassCastException ex) {
        }
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsEqual_LocalDateTime() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kwc8d6rm1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsEqual_LocalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35785,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kwc8d6rm1(){try{__CLR4_4_1radradlgchory4.R.inc(35785);
        __CLR4_4_1radradlgchory4.R.inc(35786);LocalDateTime test1 = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35787);LocalDateTime test1a = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35788);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_1radradlgchory4.R.inc(35789);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_1radradlgchory4.R.inc(35790);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_1radradlgchory4.R.inc(35791);assertEquals(true, test1a.isEqual(test1a));

        __CLR4_4_1radradlgchory4.R.inc(35792);LocalDateTime test2 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35793);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_1radradlgchory4.R.inc(35794);assertEquals(false, test2.isEqual(test1));

        __CLR4_4_1radradlgchory4.R.inc(35795);LocalDateTime test3 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40, GREGORIAN_UTC);
        __CLR4_4_1radradlgchory4.R.inc(35796);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_1radradlgchory4.R.inc(35797);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_1radradlgchory4.R.inc(35798);assertEquals(true, test3.isEqual(test2));

        __CLR4_4_1radradlgchory4.R.inc(35799);try {
            __CLR4_4_1radradlgchory4.R.inc(35800);new LocalDateTime(2005, 7, 2, 10, 20, 30, 40).isEqual(null);
            __CLR4_4_1radradlgchory4.R.inc(35801);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsBefore_LocalDateTime() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ulqdlrmi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsBefore_LocalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35802,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ulqdlrmi(){try{__CLR4_4_1radradlgchory4.R.inc(35802);
        __CLR4_4_1radradlgchory4.R.inc(35803);LocalDateTime test1 = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35804);LocalDateTime test1a = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35805);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_1radradlgchory4.R.inc(35806);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_1radradlgchory4.R.inc(35807);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_1radradlgchory4.R.inc(35808);assertEquals(false, test1a.isBefore(test1a));

        __CLR4_4_1radradlgchory4.R.inc(35809);LocalDateTime test2 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35810);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_1radradlgchory4.R.inc(35811);assertEquals(false, test2.isBefore(test1));

        __CLR4_4_1radradlgchory4.R.inc(35812);LocalDateTime test3 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40, GREGORIAN_UTC);
        __CLR4_4_1radradlgchory4.R.inc(35813);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_1radradlgchory4.R.inc(35814);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_1radradlgchory4.R.inc(35815);assertEquals(false, test3.isBefore(test2));

        __CLR4_4_1radradlgchory4.R.inc(35816);try {
            __CLR4_4_1radradlgchory4.R.inc(35817);new LocalDateTime(2005, 7, 2, 10, 20, 30, 40).isBefore(null);
            __CLR4_4_1radradlgchory4.R.inc(35818);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsAfter_LocalDateTime() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12d0tdermz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testIsAfter_LocalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12d0tdermz(){try{__CLR4_4_1radradlgchory4.R.inc(35819);
        __CLR4_4_1radradlgchory4.R.inc(35820);LocalDateTime test1 = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35821);LocalDateTime test1a = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35822);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_1radradlgchory4.R.inc(35823);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_1radradlgchory4.R.inc(35824);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_1radradlgchory4.R.inc(35825);assertEquals(false, test1a.isAfter(test1a));

        __CLR4_4_1radradlgchory4.R.inc(35826);LocalDateTime test2 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35827);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_1radradlgchory4.R.inc(35828);assertEquals(true, test2.isAfter(test1));

        __CLR4_4_1radradlgchory4.R.inc(35829);LocalDateTime test3 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40, GREGORIAN_UTC);
        __CLR4_4_1radradlgchory4.R.inc(35830);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_1radradlgchory4.R.inc(35831);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_1radradlgchory4.R.inc(35832);assertEquals(false, test3.isAfter(test2));

        __CLR4_4_1radradlgchory4.R.inc(35833);try {
            __CLR4_4_1radradlgchory4.R.inc(35834);new LocalDateTime(2005, 7, 2, 10, 20, 30, 40).isAfter(null);
            __CLR4_4_1radradlgchory4.R.inc(35835);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithDate() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_180tcctrng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_180tcctrng(){try{__CLR4_4_1radradlgchory4.R.inc(35836);
        __CLR4_4_1radradlgchory4.R.inc(35837);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35838);LocalDateTime result = test.withDate(2006, 2, 1);

        __CLR4_4_1radradlgchory4.R.inc(35839);check(test, 2004, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35840);check(result, 2006, 2, 1, 10, 20, 30, 40);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithTime() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12m5wy4rnl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35841,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12m5wy4rnl(){try{__CLR4_4_1radradlgchory4.R.inc(35841);
        __CLR4_4_1radradlgchory4.R.inc(35842);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35843);LocalDateTime result = test.withTime(9, 8, 7, 6);

        __CLR4_4_1radradlgchory4.R.inc(35844);check(test, 2004, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35845);check(result, 2004, 6, 9, 9, 8, 7, 6);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithField_DateTimeFieldType_int_1() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1apbcyjrnq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithField_DateTimeFieldType_int_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1apbcyjrnq(){try{__CLR4_4_1radradlgchory4.R.inc(35846);
        __CLR4_4_1radradlgchory4.R.inc(35847);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35848);LocalDateTime result = test.withField(DateTimeFieldType.year(), 2006);

        __CLR4_4_1radradlgchory4.R.inc(35849);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30, 40), test);
        __CLR4_4_1radradlgchory4.R.inc(35850);assertEquals(new LocalDateTime(2006, 6, 9, 10, 20, 30, 40), result);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testWithField_DateTimeFieldType_int_2() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17gbe62rnv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithField_DateTimeFieldType_int_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17gbe62rnv(){try{__CLR4_4_1radradlgchory4.R.inc(35851);
        __CLR4_4_1radradlgchory4.R.inc(35852);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35853);try {
            __CLR4_4_1radradlgchory4.R.inc(35854);test.withField(null, 6);
            __CLR4_4_1radradlgchory4.R.inc(35855);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testWithField_DateTimeFieldType_int_3() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_147bfdlro0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithField_DateTimeFieldType_int_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35856,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_147bfdlro0(){try{__CLR4_4_1radradlgchory4.R.inc(35856);
        __CLR4_4_1radradlgchory4.R.inc(35857);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35858);LocalDateTime result = test.withField(DateTimeFieldType.year(), 2004);
        __CLR4_4_1radradlgchory4.R.inc(35859);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30, 40), test);
        __CLR4_4_1radradlgchory4.R.inc(35860);assertSame(test, result);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithFieldAdded_DurationFieldType_int_1() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cp4lfcro5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithFieldAdded_DurationFieldType_int_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cp4lfcro5(){try{__CLR4_4_1radradlgchory4.R.inc(35861);
        __CLR4_4_1radradlgchory4.R.inc(35862);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35863);LocalDateTime result = test.withFieldAdded(DurationFieldType.years(), 6);

        __CLR4_4_1radradlgchory4.R.inc(35864);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30, 40), test);
        __CLR4_4_1radradlgchory4.R.inc(35865);assertEquals(new LocalDateTime(2010, 6, 9, 10, 20, 30, 40), result);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded_DurationFieldType_int_2() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19g4mmvroa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithFieldAdded_DurationFieldType_int_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19g4mmvroa(){try{__CLR4_4_1radradlgchory4.R.inc(35866);
        __CLR4_4_1radradlgchory4.R.inc(35867);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35868);try {
            __CLR4_4_1radradlgchory4.R.inc(35869);test.withFieldAdded(null, 0);
            __CLR4_4_1radradlgchory4.R.inc(35870);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded_DurationFieldType_int_3() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1674nuerof();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithFieldAdded_DurationFieldType_int_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35871,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1674nuerof(){try{__CLR4_4_1radradlgchory4.R.inc(35871);
        __CLR4_4_1radradlgchory4.R.inc(35872);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35873);try {
            __CLR4_4_1radradlgchory4.R.inc(35874);test.withFieldAdded(null, 6);
            __CLR4_4_1radradlgchory4.R.inc(35875);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded_DurationFieldType_int_4() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12y4p1xrok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithFieldAdded_DurationFieldType_int_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12y4p1xrok(){try{__CLR4_4_1radradlgchory4.R.inc(35876);
        __CLR4_4_1radradlgchory4.R.inc(35877);LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(35878);LocalDateTime result = test.withFieldAdded(DurationFieldType.years(), 0);
        __CLR4_4_1radradlgchory4.R.inc(35879);assertSame(test, result);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPlus_RP() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz83igroo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz83igroo(){try{__CLR4_4_1radradlgchory4.R.inc(35880);
        __CLR4_4_1radradlgchory4.R.inc(35881);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35882);LocalDateTime result = test.plus(new Period(1, 2, 3, 4, 29, 6, 7, 8));
        __CLR4_4_1radradlgchory4.R.inc(35883);LocalDateTime expected = new LocalDateTime(2003, 7, 29, 15, 26, 37, 48, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35884);assertEquals(expected, result);

        __CLR4_4_1radradlgchory4.R.inc(35885);result = test.plus((ReadablePeriod) null);
        __CLR4_4_1radradlgchory4.R.inc(35886);assertSame(test, result);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testPlusYears_int() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mx5kptrov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35887,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mx5kptrov(){try{__CLR4_4_1radradlgchory4.R.inc(35887);
        __CLR4_4_1radradlgchory4.R.inc(35888);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35889);LocalDateTime result = test.plusYears(1);
        __CLR4_4_1radradlgchory4.R.inc(35890);LocalDateTime expected = new LocalDateTime(2003, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35891);assertEquals(expected, result);

        __CLR4_4_1radradlgchory4.R.inc(35892);result = test.plusYears(0);
        __CLR4_4_1radradlgchory4.R.inc(35893);assertSame(test, result);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testPlusMonths_int() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170gxairp2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170gxairp2(){try{__CLR4_4_1radradlgchory4.R.inc(35894);
        __CLR4_4_1radradlgchory4.R.inc(35895);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35896);LocalDateTime result = test.plusMonths(1);
        __CLR4_4_1radradlgchory4.R.inc(35897);LocalDateTime expected = new LocalDateTime(2002, 6, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35898);assertEquals(expected, result);

        __CLR4_4_1radradlgchory4.R.inc(35899);result = test.plusMonths(0);
        __CLR4_4_1radradlgchory4.R.inc(35900);assertSame(test, result);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testPlusWeeks_int() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eupheerp9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusWeeks_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35901,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eupheerp9(){try{__CLR4_4_1radradlgchory4.R.inc(35901);
        __CLR4_4_1radradlgchory4.R.inc(35902);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35903);LocalDateTime result = test.plusWeeks(1);
        __CLR4_4_1radradlgchory4.R.inc(35904);LocalDateTime expected = new LocalDateTime(2002, 5, 10, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35905);assertEquals(expected, result);

        __CLR4_4_1radradlgchory4.R.inc(35906);result = test.plusWeeks(0);
        __CLR4_4_1radradlgchory4.R.inc(35907);assertSame(test, result);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testPlusDays_int() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpmvkqrpg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpmvkqrpg(){try{__CLR4_4_1radradlgchory4.R.inc(35908);
        __CLR4_4_1radradlgchory4.R.inc(35909);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35910);LocalDateTime result = test.plusDays(1);
        __CLR4_4_1radradlgchory4.R.inc(35911);LocalDateTime expected = new LocalDateTime(2002, 5, 4, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35912);assertEquals(expected, result);

        __CLR4_4_1radradlgchory4.R.inc(35913);result = test.plusDays(0);
        __CLR4_4_1radradlgchory4.R.inc(35914);assertSame(test, result);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testPlusHours_int() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s87b5yrpn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusHours_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s87b5yrpn(){try{__CLR4_4_1radradlgchory4.R.inc(35915);
        __CLR4_4_1radradlgchory4.R.inc(35916);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35917);LocalDateTime result = test.plusHours(1);
        __CLR4_4_1radradlgchory4.R.inc(35918);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 11, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35919);assertEquals(expected, result);

        __CLR4_4_1radradlgchory4.R.inc(35920);result = test.plusHours(0);
        __CLR4_4_1radradlgchory4.R.inc(35921);assertSame(test, result);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testPlusMinutes_int() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k0mjqurpu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusMinutes_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k0mjqurpu(){try{__CLR4_4_1radradlgchory4.R.inc(35922);
        __CLR4_4_1radradlgchory4.R.inc(35923);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35924);LocalDateTime result = test.plusMinutes(1);
        __CLR4_4_1radradlgchory4.R.inc(35925);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 21, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35926);assertEquals(expected, result);

        __CLR4_4_1radradlgchory4.R.inc(35927);result = test.plusMinutes(0);
        __CLR4_4_1radradlgchory4.R.inc(35928);assertSame(test, result);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testPlusSeconds_int() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xx4lrerq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusSeconds_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35929,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xx4lrerq1(){try{__CLR4_4_1radradlgchory4.R.inc(35929);
        __CLR4_4_1radradlgchory4.R.inc(35930);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35931);LocalDateTime result = test.plusSeconds(1);
        __CLR4_4_1radradlgchory4.R.inc(35932);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 31, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35933);assertEquals(expected, result);

        __CLR4_4_1radradlgchory4.R.inc(35934);result = test.plusSeconds(0);
        __CLR4_4_1radradlgchory4.R.inc(35935);assertSame(test, result);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testPlusMillis_int() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1blt447rq8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testPlusMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1blt447rq8(){try{__CLR4_4_1radradlgchory4.R.inc(35936);
        __CLR4_4_1radradlgchory4.R.inc(35937);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35938);LocalDateTime result = test.plusMillis(1);
        __CLR4_4_1radradlgchory4.R.inc(35939);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 30, 41, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35940);assertEquals(expected, result);

        __CLR4_4_1radradlgchory4.R.inc(35941);result = test.plusMillis(0);
        __CLR4_4_1radradlgchory4.R.inc(35942);assertSame(test, result);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMinus_RP() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112cpdmrqf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112cpdmrqf(){try{__CLR4_4_1radradlgchory4.R.inc(35943);
        __CLR4_4_1radradlgchory4.R.inc(35944);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35945);LocalDateTime result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));

        __CLR4_4_1radradlgchory4.R.inc(35946);LocalDateTime expected = new LocalDateTime(2001, 3, 26, 9, 19, 29, 39, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35947);assertEquals(expected, result);

        __CLR4_4_1radradlgchory4.R.inc(35948);result = test.minus((ReadablePeriod) null);
        __CLR4_4_1radradlgchory4.R.inc(35949);assertSame(test, result);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testMinusYears_int() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9qdinrqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9qdinrqm(){try{__CLR4_4_1radradlgchory4.R.inc(35950);
        __CLR4_4_1radradlgchory4.R.inc(35951);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35952);LocalDateTime result = test.minusYears(1);
        __CLR4_4_1radradlgchory4.R.inc(35953);LocalDateTime expected = new LocalDateTime(2001, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35954);assertEquals(expected, result);

        __CLR4_4_1radradlgchory4.R.inc(35955);result = test.minusYears(0);
        __CLR4_4_1radradlgchory4.R.inc(35956);assertSame(test, result);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testMinusMonths_int() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6k4gorqt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35957,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6k4gorqt(){try{__CLR4_4_1radradlgchory4.R.inc(35957);
        __CLR4_4_1radradlgchory4.R.inc(35958);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35959);LocalDateTime result = test.minusMonths(1);
        __CLR4_4_1radradlgchory4.R.inc(35960);LocalDateTime expected = new LocalDateTime(2002, 4, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35961);assertEquals(expected, result);

        __CLR4_4_1radradlgchory4.R.inc(35962);result = test.minusMonths(0);
        __CLR4_4_1radradlgchory4.R.inc(35963);assertSame(test, result);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testMinusWeeks_int() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fi4olkrr0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusWeeks_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fi4olkrr0(){try{__CLR4_4_1radradlgchory4.R.inc(35964);
        __CLR4_4_1radradlgchory4.R.inc(35965);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35966);LocalDateTime result = test.minusWeeks(1);
        __CLR4_4_1radradlgchory4.R.inc(35967);LocalDateTime expected = new LocalDateTime(2002, 4, 26, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35968);assertEquals(expected, result);

        __CLR4_4_1radradlgchory4.R.inc(35969);result = test.minusWeeks(0);
        __CLR4_4_1radradlgchory4.R.inc(35970);assertSame(test, result);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testMinusDays_int() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hpufckrr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hpufckrr7(){try{__CLR4_4_1radradlgchory4.R.inc(35971);
        __CLR4_4_1radradlgchory4.R.inc(35972);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35973);LocalDateTime result = test.minusDays(1);
        __CLR4_4_1radradlgchory4.R.inc(35974);LocalDateTime expected = new LocalDateTime(2002, 5, 2, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35975);assertEquals(expected, result);

        __CLR4_4_1radradlgchory4.R.inc(35976);result = test.minusDays(0);
        __CLR4_4_1radradlgchory4.R.inc(35977);assertSame(test, result);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testMinusHours_int() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svmid4rre();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusHours_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35978,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svmid4rre(){try{__CLR4_4_1radradlgchory4.R.inc(35978);
        __CLR4_4_1radradlgchory4.R.inc(35979);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35980);LocalDateTime result = test.minusHours(1);
        __CLR4_4_1radradlgchory4.R.inc(35981);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 9, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35982);assertEquals(expected, result);

        __CLR4_4_1radradlgchory4.R.inc(35983);result = test.minusHours(0);
        __CLR4_4_1radradlgchory4.R.inc(35984);assertSame(test, result);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testMinusMinutes_int() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15zd8a0rrl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusMinutes_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15zd8a0rrl(){try{__CLR4_4_1radradlgchory4.R.inc(35985);
        __CLR4_4_1radradlgchory4.R.inc(35986);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35987);LocalDateTime result = test.minusMinutes(1);
        __CLR4_4_1radradlgchory4.R.inc(35988);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 19, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35989);assertEquals(expected, result);

        __CLR4_4_1radradlgchory4.R.inc(35990);result = test.minusMinutes(0);
        __CLR4_4_1radradlgchory4.R.inc(35991);assertSame(test, result);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testMinusSeconds_int() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n2q4qwrrs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusSeconds_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n2q4qwrrs(){try{__CLR4_4_1radradlgchory4.R.inc(35992);
        __CLR4_4_1radradlgchory4.R.inc(35993);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35994);LocalDateTime result = test.minusSeconds(1);
        __CLR4_4_1radradlgchory4.R.inc(35995);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 29, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(35996);assertEquals(expected, result);

        __CLR4_4_1radradlgchory4.R.inc(35997);result = test.minusSeconds(0);
        __CLR4_4_1radradlgchory4.R.inc(35998);assertSame(test, result);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testMinusMillis_int() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),35999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vrwbadrrz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testMinusMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35999,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vrwbadrrz(){try{__CLR4_4_1radradlgchory4.R.inc(35999);
        __CLR4_4_1radradlgchory4.R.inc(36000);LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(36001);LocalDateTime result = test.minusMillis(1);
        __CLR4_4_1radradlgchory4.R.inc(36002);LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 30, 39, BUDDHIST_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(36003);assertEquals(expected, result);

        __CLR4_4_1radradlgchory4.R.inc(36004);result = test.minusMillis(0);
        __CLR4_4_1radradlgchory4.R.inc(36005);assertSame(test, result);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetters() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jiqsv7rs6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testGetters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jiqsv7rs6(){try{__CLR4_4_1radradlgchory4.R.inc(36006);
        __CLR4_4_1radradlgchory4.R.inc(36007);LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40, GJ_UTC);
        __CLR4_4_1radradlgchory4.R.inc(36008);assertEquals(1970, test.getYear());
        __CLR4_4_1radradlgchory4.R.inc(36009);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1radradlgchory4.R.inc(36010);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1radradlgchory4.R.inc(36011);assertEquals(160, test.getDayOfYear());
        __CLR4_4_1radradlgchory4.R.inc(36012);assertEquals(2, test.getDayOfWeek());
        __CLR4_4_1radradlgchory4.R.inc(36013);assertEquals(24, test.getWeekOfWeekyear());
        __CLR4_4_1radradlgchory4.R.inc(36014);assertEquals(1970, test.getWeekyear());
        __CLR4_4_1radradlgchory4.R.inc(36015);assertEquals(70, test.getYearOfCentury());
        __CLR4_4_1radradlgchory4.R.inc(36016);assertEquals(20, test.getCenturyOfEra());
        __CLR4_4_1radradlgchory4.R.inc(36017);assertEquals(1970, test.getYearOfEra());
        __CLR4_4_1radradlgchory4.R.inc(36018);assertEquals(DateTimeConstants.AD, test.getEra());
        __CLR4_4_1radradlgchory4.R.inc(36019);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1radradlgchory4.R.inc(36020);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1radradlgchory4.R.inc(36021);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1radradlgchory4.R.inc(36022);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1radradlgchory4.R.inc(36023);assertEquals(MILLIS_OF_DAY_UTC, test.getMillisOfDay());
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithers() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn9jzprso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testWithers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36024,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn9jzprso(){try{__CLR4_4_1radradlgchory4.R.inc(36024);
        __CLR4_4_1radradlgchory4.R.inc(36025);LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40, GJ_UTC);
        __CLR4_4_1radradlgchory4.R.inc(36026);check(test.withYear(2000), 2000, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(36027);check(test.withMonthOfYear(2), 1970, 2, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(36028);check(test.withDayOfMonth(2), 1970, 6, 2, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(36029);check(test.withDayOfYear(6), 1970, 1, 6, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(36030);check(test.withDayOfWeek(6), 1970, 6, 13, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(36031);check(test.withWeekOfWeekyear(6), 1970, 2, 3, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(36032);check(test.withWeekyear(1971), 1971, 6, 15, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(36033);check(test.withYearOfCentury(60), 1960, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(36034);check(test.withCenturyOfEra(21), 2070, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(36035);check(test.withYearOfEra(1066), 1066, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(36036);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(36037);check(test.withHourOfDay(6), 1970, 6, 9, 6, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(36038);check(test.withMinuteOfHour(6), 1970, 6, 9, 10, 6, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(36039);check(test.withSecondOfMinute(6), 1970, 6, 9, 10, 20, 6, 40);
        __CLR4_4_1radradlgchory4.R.inc(36040);check(test.withMillisOfSecond(6), 1970, 6, 9, 10, 20, 30, 6);
        __CLR4_4_1radradlgchory4.R.inc(36041);check(test.withMillisOfDay(61234), 1970, 6, 9, 0, 1, 1, 234);
        __CLR4_4_1radradlgchory4.R.inc(36042);try {
            __CLR4_4_1radradlgchory4.R.inc(36043);test.withMonthOfYear(0);
            __CLR4_4_1radradlgchory4.R.inc(36044);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1radradlgchory4.R.inc(36045);try {
            __CLR4_4_1radradlgchory4.R.inc(36046);test.withMonthOfYear(13);
            __CLR4_4_1radradlgchory4.R.inc(36047);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTime() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hmtfovrtc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36048,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hmtfovrtc(){try{__CLR4_4_1radradlgchory4.R.inc(36048);
        __CLR4_4_1radradlgchory4.R.inc(36049);LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); // PARIS irrelevant

        __CLR4_4_1radradlgchory4.R.inc(36050);DateTime test = base.toDateTime();
        __CLR4_4_1radradlgchory4.R.inc(36051);check(base, 2005, 6, 9, 6, 7, 8, 9);
        __CLR4_4_1radradlgchory4.R.inc(36052);DateTime expected = new DateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(36053);assertEquals(expected, test);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTime_Zone() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnglp2rti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDateTime_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36054,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnglp2rti(){try{__CLR4_4_1radradlgchory4.R.inc(36054);
        __CLR4_4_1radradlgchory4.R.inc(36055);LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); // PARIS irrelevant

        __CLR4_4_1radradlgchory4.R.inc(36056);DateTime test = base.toDateTime(TOKYO);
        __CLR4_4_1radradlgchory4.R.inc(36057);check(base, 2005, 6, 9, 6, 7, 8, 9);
        __CLR4_4_1radradlgchory4.R.inc(36058);DateTime expected = new DateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_TOKYO);
        __CLR4_4_1radradlgchory4.R.inc(36059);assertEquals(expected, test);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testToDateTime_nullZone() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f9ddf3rto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDateTime_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f9ddf3rto(){try{__CLR4_4_1radradlgchory4.R.inc(36060);
        __CLR4_4_1radradlgchory4.R.inc(36061);LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); // PARIS irrelevant

        __CLR4_4_1radradlgchory4.R.inc(36062);DateTime test = base.toDateTime((DateTimeZone) null);
        __CLR4_4_1radradlgchory4.R.inc(36063);check(base, 2005, 6, 9, 6, 7, 8, 9);
        __CLR4_4_1radradlgchory4.R.inc(36064);DateTime expected = new DateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(36065);assertEquals(expected, test);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testToDateTime_Zone_dstGap() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t89cz8rtu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDateTime_Zone_dstGap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t89cz8rtu(){try{__CLR4_4_1radradlgchory4.R.inc(36066);
        __CLR4_4_1radradlgchory4.R.inc(36067);LocalDateTime base = new LocalDateTime(2014, 3, 30, 1, 30, 0, 0, ISO_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(36068);try {
            __CLR4_4_1radradlgchory4.R.inc(36069);base.toDateTime(LONDON);
            __CLR4_4_1radradlgchory4.R.inc(36070);fail();
        } catch (IllegalInstantException ex) {
        }
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testToDateTime_Zone_dstOverlap() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16sy6dhrtz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDateTime_Zone_dstOverlap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36071,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16sy6dhrtz(){try{__CLR4_4_1radradlgchory4.R.inc(36071);
        __CLR4_4_1radradlgchory4.R.inc(36072);LocalDateTime base = new LocalDateTime(2014, 10, 26, 1, 30, 0, 0, ISO_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(36073);DateTime test = base.toDateTime(LONDON);
        __CLR4_4_1radradlgchory4.R.inc(36074);DateTime expected = new DateTime(2014, 10, 26, 1, 30, ISO_LONDON).withEarlierOffsetAtOverlap();
        __CLR4_4_1radradlgchory4.R.inc(36075);assertEquals(expected, test);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testToDateTime_Zone_dstOverlap_NewYork() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16dl4i3ru4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDateTime_Zone_dstOverlap_NewYork",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16dl4i3ru4(){try{__CLR4_4_1radradlgchory4.R.inc(36076);
        __CLR4_4_1radradlgchory4.R.inc(36077);LocalDateTime base = new LocalDateTime(2007, 11, 4, 1, 30, 0, 0, ISO_NEW_YORK);
        __CLR4_4_1radradlgchory4.R.inc(36078);DateTime test = base.toDateTime(NEW_YORK);
        __CLR4_4_1radradlgchory4.R.inc(36079);DateTime expected = new DateTime(2007, 11, 4, 1, 30, ISO_NEW_YORK).withEarlierOffsetAtOverlap();
        __CLR4_4_1radradlgchory4.R.inc(36080);assertEquals(expected, test);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToLocalDate() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1orirru9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36081,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1orirru9(){try{__CLR4_4_1radradlgchory4.R.inc(36081);
        __CLR4_4_1radradlgchory4.R.inc(36082);LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1radradlgchory4.R.inc(36083);LocalDate expected = new LocalDate(2005, 6, 9, COPTIC_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(36084);assertEquals(expected, base.toLocalDate());
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testToLocalTime() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mn1c42rud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToLocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36085,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mn1c42rud(){try{__CLR4_4_1radradlgchory4.R.inc(36085);
        __CLR4_4_1radradlgchory4.R.inc(36086);LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1radradlgchory4.R.inc(36087);LocalTime expected = new LocalTime(6, 7, 8, 9, COPTIC_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(36088);assertEquals(expected, base.toLocalTime());
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTime_RI() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1584tmdruh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDateTime_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36089,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1584tmdruh(){try{__CLR4_4_1radradlgchory4.R.inc(36089);
        __CLR4_4_1radradlgchory4.R.inc(36090);LocalDateTime base = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_1radradlgchory4.R.inc(36091);DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7, BUDDHIST_TOKYO);

        __CLR4_4_1radradlgchory4.R.inc(36092);DateTime test = base.toDateTime(dt);
        __CLR4_4_1radradlgchory4.R.inc(36093);check(base, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(36094);DateTime expected = new DateTime(2005, 6, 9, 10, 20, 30, 40, BUDDHIST_TOKYO);
        __CLR4_4_1radradlgchory4.R.inc(36095);assertEquals(expected, test);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testToDateTime_nullRI() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xlns4ruo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDateTime_nullRI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36096,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xlns4ruo(){try{__CLR4_4_1radradlgchory4.R.inc(36096);
        __CLR4_4_1radradlgchory4.R.inc(36097);LocalDateTime base = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40, COPTIC_PARIS);

        __CLR4_4_1radradlgchory4.R.inc(36098);DateTime test = base.toDateTime((ReadableInstant) null);
        __CLR4_4_1radradlgchory4.R.inc(36099);check(base, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(36100);DateTime expected = new DateTime(2005, 6, 9, 10, 20, 30, 40, ISO_LONDON);
        __CLR4_4_1radradlgchory4.R.inc(36101);assertEquals(expected, test);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDate_summer() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gs4c6eruu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_summer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gs4c6eruu(){try{__CLR4_4_1radradlgchory4.R.inc(36102);
        __CLR4_4_1radradlgchory4.R.inc(36103);LocalDateTime base = new LocalDateTime(2005, 7, 9, 10, 20, 30, 40, COPTIC_PARIS);

        __CLR4_4_1radradlgchory4.R.inc(36104);Date test = base.toDate();
        __CLR4_4_1radradlgchory4.R.inc(36105);check(base, 2005, 7, 9, 10, 20, 30, 40);

        __CLR4_4_1radradlgchory4.R.inc(36106);GregorianCalendar gcal = new GregorianCalendar();
        __CLR4_4_1radradlgchory4.R.inc(36107);gcal.clear();
        __CLR4_4_1radradlgchory4.R.inc(36108);gcal.set(Calendar.YEAR, 2005);
        __CLR4_4_1radradlgchory4.R.inc(36109);gcal.set(Calendar.MONTH, Calendar.JULY);
        __CLR4_4_1radradlgchory4.R.inc(36110);gcal.set(Calendar.DAY_OF_MONTH, 9);
        __CLR4_4_1radradlgchory4.R.inc(36111);gcal.set(Calendar.HOUR_OF_DAY, 10);
        __CLR4_4_1radradlgchory4.R.inc(36112);gcal.set(Calendar.MINUTE, 20);
        __CLR4_4_1radradlgchory4.R.inc(36113);gcal.set(Calendar.SECOND, 30);
        __CLR4_4_1radradlgchory4.R.inc(36114);gcal.set(Calendar.MILLISECOND, 40);
        __CLR4_4_1radradlgchory4.R.inc(36115);assertEquals(gcal.getTime(), test);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testToDate_winter() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1du955crv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_winter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36116,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1du955crv8(){try{__CLR4_4_1radradlgchory4.R.inc(36116);
        __CLR4_4_1radradlgchory4.R.inc(36117);LocalDateTime base = new LocalDateTime(2005, 1, 9, 10, 20, 30, 40, COPTIC_PARIS);

        __CLR4_4_1radradlgchory4.R.inc(36118);Date test = base.toDate();
        __CLR4_4_1radradlgchory4.R.inc(36119);check(base, 2005, 1, 9, 10, 20, 30, 40);

        __CLR4_4_1radradlgchory4.R.inc(36120);GregorianCalendar gcal = new GregorianCalendar();
        __CLR4_4_1radradlgchory4.R.inc(36121);gcal.clear();
        __CLR4_4_1radradlgchory4.R.inc(36122);gcal.set(Calendar.YEAR, 2005);
        __CLR4_4_1radradlgchory4.R.inc(36123);gcal.set(Calendar.MONTH, Calendar.JANUARY);
        __CLR4_4_1radradlgchory4.R.inc(36124);gcal.set(Calendar.DAY_OF_MONTH, 9);
        __CLR4_4_1radradlgchory4.R.inc(36125);gcal.set(Calendar.HOUR_OF_DAY, 10);
        __CLR4_4_1radradlgchory4.R.inc(36126);gcal.set(Calendar.MINUTE, 20);
        __CLR4_4_1radradlgchory4.R.inc(36127);gcal.set(Calendar.SECOND, 30);
        __CLR4_4_1radradlgchory4.R.inc(36128);gcal.set(Calendar.MILLISECOND, 40);
        __CLR4_4_1radradlgchory4.R.inc(36129);assertEquals(gcal.getTime(), test);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testToDate_springDST() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrtnglrvm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_springDST",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrtnglrvm(){try{__CLR4_4_1radradlgchory4.R.inc(36130);
        __CLR4_4_1radradlgchory4.R.inc(36131);LocalDateTime base = new LocalDateTime(2007, 4, 2, 0, 20, 0, 0);

        __CLR4_4_1radradlgchory4.R.inc(36132);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000);
        __CLR4_4_1radradlgchory4.R.inc(36133);TimeZone currentZone = TimeZone.getDefault();
        __CLR4_4_1radradlgchory4.R.inc(36134);try {
            __CLR4_4_1radradlgchory4.R.inc(36135);TimeZone.setDefault(testZone);
            __CLR4_4_1radradlgchory4.R.inc(36136);Date test = base.toDate();
            __CLR4_4_1radradlgchory4.R.inc(36137);check(base, 2007, 4, 2, 0, 20, 0, 0);
            __CLR4_4_1radradlgchory4.R.inc(36138);assertEquals("Mon Apr 02 01:00:00 GMT+02:00 2007", test.toString());
        } finally {
            __CLR4_4_1radradlgchory4.R.inc(36139);TimeZone.setDefault(currentZone);
        }
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testToDate_springDST_2Hour40Savings() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1168c4nrvw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_springDST_2Hour40Savings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1168c4nrvw(){try{__CLR4_4_1radradlgchory4.R.inc(36140);
        __CLR4_4_1radradlgchory4.R.inc(36141);LocalDateTime base = new LocalDateTime(2007, 4, 2, 0, 20, 0, 0);

        __CLR4_4_1radradlgchory4.R.inc(36142);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000, (3600000 / 6) * 16);
        __CLR4_4_1radradlgchory4.R.inc(36143);TimeZone currentZone = TimeZone.getDefault();
        __CLR4_4_1radradlgchory4.R.inc(36144);try {
            __CLR4_4_1radradlgchory4.R.inc(36145);TimeZone.setDefault(testZone);
            __CLR4_4_1radradlgchory4.R.inc(36146);Date test = base.toDate();
            __CLR4_4_1radradlgchory4.R.inc(36147);check(base, 2007, 4, 2, 0, 20, 0, 0);
            __CLR4_4_1radradlgchory4.R.inc(36148);assertEquals("Mon Apr 02 02:40:00 GMT+03:40 2007", test.toString());
        } finally {
            __CLR4_4_1radradlgchory4.R.inc(36149);TimeZone.setDefault(currentZone);
        }
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testToDate_autumnDST() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r4c67mrw6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_autumnDST",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r4c67mrw6(){try{__CLR4_4_1radradlgchory4.R.inc(36150);
        __CLR4_4_1radradlgchory4.R.inc(36151);LocalDateTime base = new LocalDateTime(2007, 10, 2, 0, 20, 30, 0);

        __CLR4_4_1radradlgchory4.R.inc(36152);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000);
        __CLR4_4_1radradlgchory4.R.inc(36153);TimeZone currentZone = TimeZone.getDefault();
        __CLR4_4_1radradlgchory4.R.inc(36154);try {
            __CLR4_4_1radradlgchory4.R.inc(36155);TimeZone.setDefault(testZone);
            __CLR4_4_1radradlgchory4.R.inc(36156);Date test = base.toDate();
            __CLR4_4_1radradlgchory4.R.inc(36157);check(base, 2007, 10, 2, 0, 20, 30, 0);
            __CLR4_4_1radradlgchory4.R.inc(36158);assertEquals("Tue Oct 02 00:20:30 GMT+02:00 2007", test.toString());
        } finally {
            __CLR4_4_1radradlgchory4.R.inc(36159);TimeZone.setDefault(currentZone);
        }
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDate_summer_Zone() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1itpggxrwg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_summer_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36160,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1itpggxrwg(){try{__CLR4_4_1radradlgchory4.R.inc(36160);
        __CLR4_4_1radradlgchory4.R.inc(36161);LocalDateTime base = new LocalDateTime(2005, 7, 9, 10, 20, 30, 40, COPTIC_PARIS);

        __CLR4_4_1radradlgchory4.R.inc(36162);Date test = base.toDate(TimeZone.getDefault());
        __CLR4_4_1radradlgchory4.R.inc(36163);check(base, 2005, 7, 9, 10, 20, 30, 40);

        __CLR4_4_1radradlgchory4.R.inc(36164);GregorianCalendar gcal = new GregorianCalendar();
        __CLR4_4_1radradlgchory4.R.inc(36165);gcal.clear();
        __CLR4_4_1radradlgchory4.R.inc(36166);gcal.set(Calendar.YEAR, 2005);
        __CLR4_4_1radradlgchory4.R.inc(36167);gcal.set(Calendar.MONTH, Calendar.JULY);
        __CLR4_4_1radradlgchory4.R.inc(36168);gcal.set(Calendar.DAY_OF_MONTH, 9);
        __CLR4_4_1radradlgchory4.R.inc(36169);gcal.set(Calendar.HOUR_OF_DAY, 10);
        __CLR4_4_1radradlgchory4.R.inc(36170);gcal.set(Calendar.MINUTE, 20);
        __CLR4_4_1radradlgchory4.R.inc(36171);gcal.set(Calendar.SECOND, 30);
        __CLR4_4_1radradlgchory4.R.inc(36172);gcal.set(Calendar.MILLISECOND, 40);
        __CLR4_4_1radradlgchory4.R.inc(36173);assertEquals(gcal.getTime(), test);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testToDate_winter_Zone() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffeuk7rwu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_winter_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffeuk7rwu(){try{__CLR4_4_1radradlgchory4.R.inc(36174);
        __CLR4_4_1radradlgchory4.R.inc(36175);LocalDateTime base = new LocalDateTime(2005, 1, 9, 10, 20, 30, 40, COPTIC_PARIS);

        __CLR4_4_1radradlgchory4.R.inc(36176);Date test = base.toDate(TimeZone.getDefault());
        __CLR4_4_1radradlgchory4.R.inc(36177);check(base, 2005, 1, 9, 10, 20, 30, 40);

        __CLR4_4_1radradlgchory4.R.inc(36178);GregorianCalendar gcal = new GregorianCalendar();
        __CLR4_4_1radradlgchory4.R.inc(36179);gcal.clear();
        __CLR4_4_1radradlgchory4.R.inc(36180);gcal.set(Calendar.YEAR, 2005);
        __CLR4_4_1radradlgchory4.R.inc(36181);gcal.set(Calendar.MONTH, Calendar.JANUARY);
        __CLR4_4_1radradlgchory4.R.inc(36182);gcal.set(Calendar.DAY_OF_MONTH, 9);
        __CLR4_4_1radradlgchory4.R.inc(36183);gcal.set(Calendar.HOUR_OF_DAY, 10);
        __CLR4_4_1radradlgchory4.R.inc(36184);gcal.set(Calendar.MINUTE, 20);
        __CLR4_4_1radradlgchory4.R.inc(36185);gcal.set(Calendar.SECOND, 30);
        __CLR4_4_1radradlgchory4.R.inc(36186);gcal.set(Calendar.MILLISECOND, 40);
        __CLR4_4_1radradlgchory4.R.inc(36187);assertEquals(gcal.getTime(), test);
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testToDate_springDST_Zone() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e553z2rx8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_springDST_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e553z2rx8(){try{__CLR4_4_1radradlgchory4.R.inc(36188);
        __CLR4_4_1radradlgchory4.R.inc(36189);LocalDateTime base = new LocalDateTime(2007, 4, 2, 0, 20, 0, 0);

        __CLR4_4_1radradlgchory4.R.inc(36190);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000);
        __CLR4_4_1radradlgchory4.R.inc(36191);TimeZone currentZone = TimeZone.getDefault();
        __CLR4_4_1radradlgchory4.R.inc(36192);try {
            __CLR4_4_1radradlgchory4.R.inc(36193);TimeZone.setDefault(testZone);
            __CLR4_4_1radradlgchory4.R.inc(36194);Date test = base.toDate(TimeZone.getDefault());
            __CLR4_4_1radradlgchory4.R.inc(36195);check(base, 2007, 4, 2, 0, 20, 0, 0);
            __CLR4_4_1radradlgchory4.R.inc(36196);assertEquals("Mon Apr 02 01:00:00 GMT+02:00 2007", test.toString());
        } finally {
            __CLR4_4_1radradlgchory4.R.inc(36197);TimeZone.setDefault(currentZone);
        }
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testToDate_springDST_2Hour40Savings_Zone() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cg7zwgrxi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_springDST_2Hour40Savings_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cg7zwgrxi(){try{__CLR4_4_1radradlgchory4.R.inc(36198);
        __CLR4_4_1radradlgchory4.R.inc(36199);LocalDateTime base = new LocalDateTime(2007, 4, 2, 0, 20, 0, 0);

        __CLR4_4_1radradlgchory4.R.inc(36200);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000, (3600000 / 6) * 16);
        __CLR4_4_1radradlgchory4.R.inc(36201);TimeZone currentZone = TimeZone.getDefault();
        __CLR4_4_1radradlgchory4.R.inc(36202);try {
            __CLR4_4_1radradlgchory4.R.inc(36203);TimeZone.setDefault(testZone);
            __CLR4_4_1radradlgchory4.R.inc(36204);Date test = base.toDate(TimeZone.getDefault());
            __CLR4_4_1radradlgchory4.R.inc(36205);check(base, 2007, 4, 2, 0, 20, 0, 0);
            __CLR4_4_1radradlgchory4.R.inc(36206);assertEquals("Mon Apr 02 02:40:00 GMT+03:40 2007", test.toString());
        } finally {
            __CLR4_4_1radradlgchory4.R.inc(36207);TimeZone.setDefault(currentZone);
        }
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    @Test
    public void testToDate_autumnDST_Zone() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iio8xzrxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToDate_autumnDST_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iio8xzrxs(){try{__CLR4_4_1radradlgchory4.R.inc(36208);
        __CLR4_4_1radradlgchory4.R.inc(36209);LocalDateTime base = new LocalDateTime(2007, 10, 2, 0, 20, 30, 0);

        __CLR4_4_1radradlgchory4.R.inc(36210);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000);
        __CLR4_4_1radradlgchory4.R.inc(36211);TimeZone currentZone = TimeZone.getDefault();
        __CLR4_4_1radradlgchory4.R.inc(36212);try {
            __CLR4_4_1radradlgchory4.R.inc(36213);TimeZone.setDefault(testZone);
            __CLR4_4_1radradlgchory4.R.inc(36214);Date test = base.toDate(TimeZone.getDefault());
            __CLR4_4_1radradlgchory4.R.inc(36215);check(base, 2007, 10, 2, 0, 20, 30, 0);
            __CLR4_4_1radradlgchory4.R.inc(36216);assertEquals("Tue Oct 02 00:20:30 GMT+02:00 2007", test.toString());
        } finally {
            __CLR4_4_1radradlgchory4.R.inc(36217);TimeZone.setDefault(currentZone);
        }
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}


    //-----------------------------------------------------------------------
    @Test
    public void testProperty() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7neoiry2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7neoiry2(){try{__CLR4_4_1radradlgchory4.R.inc(36218);
        __CLR4_4_1radradlgchory4.R.inc(36219);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40, GJ_UTC);
        __CLR4_4_1radradlgchory4.R.inc(36220);assertEquals(test.year(), test.property(DateTimeFieldType.year()));
        __CLR4_4_1radradlgchory4.R.inc(36221);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1radradlgchory4.R.inc(36222);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1radradlgchory4.R.inc(36223);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1radradlgchory4.R.inc(36224);assertEquals(test.dayOfYear(), test.property(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1radradlgchory4.R.inc(36225);assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1radradlgchory4.R.inc(36226);assertEquals(test.weekyear(), test.property(DateTimeFieldType.weekyear()));
        __CLR4_4_1radradlgchory4.R.inc(36227);assertEquals(test.yearOfCentury(), test.property(DateTimeFieldType.yearOfCentury()));
        __CLR4_4_1radradlgchory4.R.inc(36228);assertEquals(test.yearOfEra(), test.property(DateTimeFieldType.yearOfEra()));
        __CLR4_4_1radradlgchory4.R.inc(36229);assertEquals(test.centuryOfEra(), test.property(DateTimeFieldType.centuryOfEra()));
        __CLR4_4_1radradlgchory4.R.inc(36230);assertEquals(test.era(), test.property(DateTimeFieldType.era()));
        __CLR4_4_1radradlgchory4.R.inc(36231);assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1radradlgchory4.R.inc(36232);assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1radradlgchory4.R.inc(36233);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1radradlgchory4.R.inc(36234);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1radradlgchory4.R.inc(36235);assertEquals(test.millisOfDay(), test.property(DateTimeFieldType.millisOfDay()));

        __CLR4_4_1radradlgchory4.R.inc(36236);try {
            __CLR4_4_1radradlgchory4.R.inc(36237);test.property(null);
            __CLR4_4_1radradlgchory4.R.inc(36238);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1radradlgchory4.R.inc(36239);assertEquals(test, test.property(DateTimeFieldType.minuteOfDay()).getLocalDateTime());
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9ryo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9ryo() throws Exception{try{__CLR4_4_1radradlgchory4.R.inc(36240);
        __CLR4_4_1radradlgchory4.R.inc(36241);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40, COPTIC_PARIS);

        __CLR4_4_1radradlgchory4.R.inc(36242);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1radradlgchory4.R.inc(36243);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1radradlgchory4.R.inc(36244);oos.writeObject(test);
        __CLR4_4_1radradlgchory4.R.inc(36245);oos.close();
        __CLR4_4_1radradlgchory4.R.inc(36246);byte[] bytes = baos.toByteArray();

        __CLR4_4_1radradlgchory4.R.inc(36247);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1radradlgchory4.R.inc(36248);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1radradlgchory4.R.inc(36249);LocalDateTime result = (LocalDateTime) ois.readObject();
        __CLR4_4_1radradlgchory4.R.inc(36250);ois.close();

        __CLR4_4_1radradlgchory4.R.inc(36251);assertEquals(test, result);
        __CLR4_4_1radradlgchory4.R.inc(36252);assertTrue(Arrays.equals(test.getValues(), result.getValues()));
        __CLR4_4_1radradlgchory4.R.inc(36253);assertTrue(Arrays.equals(test.getFields(), result.getFields()));
        __CLR4_4_1radradlgchory4.R.inc(36254);assertEquals(test.getChronology(), result.getChronology());
        __CLR4_4_1radradlgchory4.R.inc(36255);assertTrue(result.isSupported(DateTimeFieldType.dayOfMonth()));  // check deserialization
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidrz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidrz4(){try{__CLR4_4_1radradlgchory4.R.inc(36256);
        __CLR4_4_1radradlgchory4.R.inc(36257);LocalDateTime test = new LocalDateTime(2002, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(36258);assertEquals("2002-06-09T10:20:30.040", test.toString());
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_String() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llkh2xrz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToString_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36259,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llkh2xrz7(){try{__CLR4_4_1radradlgchory4.R.inc(36259);
        __CLR4_4_1radradlgchory4.R.inc(36260);LocalDateTime test = new LocalDateTime(2002, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(36261);assertEquals("2002 10", test.toString("yyyy HH"));
        __CLR4_4_1radradlgchory4.R.inc(36262);assertEquals("2002-06-09T10:20:30.040", test.toString((String) null));
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_String_Locale() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1afd64urzb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToString_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1afd64urzb(){try{__CLR4_4_1radradlgchory4.R.inc(36263);
        __CLR4_4_1radradlgchory4.R.inc(36264);LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(36265);assertEquals("Tue 9/6", test.toString("EEE d/M", Locale.ENGLISH));
        __CLR4_4_1radradlgchory4.R.inc(36266);assertEquals("mar. 9/6", test.toString("EEE d/M", Locale.FRENCH));
        __CLR4_4_1radradlgchory4.R.inc(36267);assertEquals("1970-06-09T10:20:30.040", test.toString(null, Locale.ENGLISH));
        __CLR4_4_1radradlgchory4.R.inc(36268);assertEquals("Tue 9/6", test.toString("EEE d/M", null));
        __CLR4_4_1radradlgchory4.R.inc(36269);assertEquals("1970-06-09T10:20:30.040", test.toString(null, null));
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_DTFormatter() {__CLR4_4_1radradlgchory4.R.globalSliceStart(getClass().getName(),36270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxbkpsrzi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1radradlgchory4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1radradlgchory4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Basics.testToString_DTFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36270,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxbkpsrzi(){try{__CLR4_4_1radradlgchory4.R.inc(36270);
        __CLR4_4_1radradlgchory4.R.inc(36271);LocalDateTime test = new LocalDateTime(2002, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1radradlgchory4.R.inc(36272);assertEquals("2002 10", test.toString(DateTimeFormat.forPattern("yyyy HH")));
        __CLR4_4_1radradlgchory4.R.inc(36273);assertEquals("2002-06-09T10:20:30.040", test.toString((DateTimeFormatter) null));
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1radradlgchory4.R.inc(36274);
        __CLR4_4_1radradlgchory4.R.inc(36275);assertEquals(year, test.getYear());
        __CLR4_4_1radradlgchory4.R.inc(36276);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1radradlgchory4.R.inc(36277);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1radradlgchory4.R.inc(36278);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1radradlgchory4.R.inc(36279);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1radradlgchory4.R.inc(36280);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1radradlgchory4.R.inc(36281);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1radradlgchory4.R.flushNeeded();}}
}
