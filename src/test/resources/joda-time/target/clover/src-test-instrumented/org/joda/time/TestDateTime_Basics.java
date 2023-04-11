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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 */
public class TestDateTime_Basics {static class __CLR4_4_1lofloflgchorpg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,29237,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");

    // the default time zone is set to LONDON in setUp()
    // we have to hard code LONDON here (instead of ISOChronology.getInstance() etc.)
    // as TestAll sets up a different time zone for better all-round testing
    private static final ISOChronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final ISOChronology ISO_DEFAULT = ISOChronology.getInstance(LONDON);
    private static final ISOChronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final GJChronology GJ_DEFAULT = GJChronology.getInstance(LONDON);
    private static final GregorianChronology GREGORIAN_DEFAULT = GregorianChronology.getInstance(LONDON);
    private static final GregorianChronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    private static final BuddhistChronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final BuddhistChronology BUDDHIST_DEFAULT = BuddhistChronology.getInstance(LONDON);
    private static final CopticChronology COPTIC_DEFAULT = CopticChronology.getInstance(LONDON);

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

    public static void main(String[] args) throws Exception {try{__CLR4_4_1lofloflgchorpg.R.inc(28095);
        __CLR4_4_1lofloflgchorpg.R.inc(28096);TestDateTime_Basics TB = new TestDateTime_Basics();
        __CLR4_4_1lofloflgchorpg.R.inc(28097);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28098);TB.testTest();
        __CLR4_4_1lofloflgchorpg.R.inc(28099);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28100);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28101);TB.testGet_DateTimeField();
        __CLR4_4_1lofloflgchorpg.R.inc(28102);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28103);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28104);TB.testGet_DateTimeFieldType();
        __CLR4_4_1lofloflgchorpg.R.inc(28105);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28106);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28107);TB.testIsSupported_DateTimeFieldType();
        __CLR4_4_1lofloflgchorpg.R.inc(28108);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28109);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28110);TB.testGetters();
        __CLR4_4_1lofloflgchorpg.R.inc(28111);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28112);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28113);TB.testWithers();
        __CLR4_4_1lofloflgchorpg.R.inc(28114);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28115);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28116);TB.testEqualsHashCode();
        __CLR4_4_1lofloflgchorpg.R.inc(28117);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28118);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28119);TB.testCompareTo();
        __CLR4_4_1lofloflgchorpg.R.inc(28120);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28121);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28122);TB.testIsEqual_long();
        __CLR4_4_1lofloflgchorpg.R.inc(28123);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28124);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28125);TB.testIsEqualNow();
        __CLR4_4_1lofloflgchorpg.R.inc(28126);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28127);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28128);TB.testIsEqual_RI();
        __CLR4_4_1lofloflgchorpg.R.inc(28129);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28130);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28131);TB.testIsBefore_long();
        __CLR4_4_1lofloflgchorpg.R.inc(28132);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28133);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28134);TB.testIsBeforeNow();
        __CLR4_4_1lofloflgchorpg.R.inc(28135);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28136);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28137);TB.testIsBefore_RI();
        __CLR4_4_1lofloflgchorpg.R.inc(28138);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28139);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28140);TB.testIsAfter_long();
        __CLR4_4_1lofloflgchorpg.R.inc(28141);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28142);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28143);TB.testIsAfterNow();
        __CLR4_4_1lofloflgchorpg.R.inc(28144);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28145);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28146);TB.testIsAfter_RI();
        __CLR4_4_1lofloflgchorpg.R.inc(28147);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28148);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28149);TB.testSerialization();
        __CLR4_4_1lofloflgchorpg.R.inc(28150);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28151);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28152);TB.testToString();
        __CLR4_4_1lofloflgchorpg.R.inc(28153);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28154);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28155);TB.testToString_String();
        __CLR4_4_1lofloflgchorpg.R.inc(28156);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28157);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28158);TB.testToString_String_Locale();
        __CLR4_4_1lofloflgchorpg.R.inc(28159);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28160);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28161);TB.testToString_DTFormatter();
        __CLR4_4_1lofloflgchorpg.R.inc(28162);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28163);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28164);TB.testToInstant();
        __CLR4_4_1lofloflgchorpg.R.inc(28165);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28166);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28167);TB.testToDateTime();
        __CLR4_4_1lofloflgchorpg.R.inc(28168);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28169);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28170);TB.testToDateTimeISO();
        __CLR4_4_1lofloflgchorpg.R.inc(28171);TB.tearDown();
        //TB.setUp(); TB.testToDateTime_DateTimeZone(); TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28172);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28173);TB.testToDateTime_Chronology();
        __CLR4_4_1lofloflgchorpg.R.inc(28174);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28175);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28176);TB.testToMutableDateTime();
        __CLR4_4_1lofloflgchorpg.R.inc(28177);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28178);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28179);TB.testToMutableDateTimeISO();
        __CLR4_4_1lofloflgchorpg.R.inc(28180);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28181);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28182);TB.testToMutableDateTime_DateTimeZone();
        __CLR4_4_1lofloflgchorpg.R.inc(28183);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28184);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28185);TB.testToMutableDateTime_Chronology();
        __CLR4_4_1lofloflgchorpg.R.inc(28186);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28187);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28188);TB.testToDate();
        __CLR4_4_1lofloflgchorpg.R.inc(28189);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28190);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28191);TB.testToCalendar_Locale();
        __CLR4_4_1lofloflgchorpg.R.inc(28192);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28193);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28194);TB.testToGregorianCalendar();
        __CLR4_4_1lofloflgchorpg.R.inc(28195);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28196);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28197);TB.testToDateMidnight();
        __CLR4_4_1lofloflgchorpg.R.inc(28198);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28199);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28200);TB.testToYearMonthDay();
        __CLR4_4_1lofloflgchorpg.R.inc(28201);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28202);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28203);TB.testToTimeOfDay();
        __CLR4_4_1lofloflgchorpg.R.inc(28204);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28205);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28206);TB.testToLocalDateTime();
        __CLR4_4_1lofloflgchorpg.R.inc(28207);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28208);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28209);TB.testToLocalDate();
        __CLR4_4_1lofloflgchorpg.R.inc(28210);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28211);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28212);TB.testToLocalTime();
        __CLR4_4_1lofloflgchorpg.R.inc(28213);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28214);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28215);TB.testWithMillis_long();
        __CLR4_4_1lofloflgchorpg.R.inc(28216);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28217);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28218);TB.testWithChronology_Chronology();
        __CLR4_4_1lofloflgchorpg.R.inc(28219);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28220);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28221);TB.testWithZone_DateTimeZone();
        __CLR4_4_1lofloflgchorpg.R.inc(28222);TB.tearDown();
        //TB.setUp(); TB.testWithZoneRetainFields_DateTimeZone(); TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28223);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28224);TB.testWithDate_int_int_int();
        __CLR4_4_1lofloflgchorpg.R.inc(28225);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28226);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28227);TB.testWithDate_int_int_int_toDST1();
        __CLR4_4_1lofloflgchorpg.R.inc(28228);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28229);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28230);TB.testWithDate_int_int_int_toDST2();
        __CLR4_4_1lofloflgchorpg.R.inc(28231);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28232);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28233);TB.testWithDate_int_int_int_affectedByDST();
        __CLR4_4_1lofloflgchorpg.R.inc(28234);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28235);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28236);TB.testWithDate_LocalDate();
        __CLR4_4_1lofloflgchorpg.R.inc(28237);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28238);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28239);TB.testWithTime_int_int_int_int();
        __CLR4_4_1lofloflgchorpg.R.inc(28240);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28241);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28242);TB.testWithTime_int_int_int_int_toDST();
        __CLR4_4_1lofloflgchorpg.R.inc(28243);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28244);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28245);TB.testWithTime_LocalTime();
        __CLR4_4_1lofloflgchorpg.R.inc(28246);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28247);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28248);TB.testWithTimeAtStartOfDay();
        __CLR4_4_1lofloflgchorpg.R.inc(28249);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28250);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28251);TB.testWithFields_RPartial();
        __CLR4_4_1lofloflgchorpg.R.inc(28252);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28253);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28254);TB.testWithField1();
        __CLR4_4_1lofloflgchorpg.R.inc(28255);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28256);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28257);TB.testWithField2();
        __CLR4_4_1lofloflgchorpg.R.inc(28258);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28259);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28260);TB.testWithFieldAdded1();
        __CLR4_4_1lofloflgchorpg.R.inc(28261);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28262);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28263);TB.testWithFieldAdded2();
        __CLR4_4_1lofloflgchorpg.R.inc(28264);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28265);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28266);TB.testWithFieldAdded3();
        __CLR4_4_1lofloflgchorpg.R.inc(28267);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28268);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28269);TB.testWithFieldAdded4();
        __CLR4_4_1lofloflgchorpg.R.inc(28270);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28271);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28272);TB.testWithDurationAdded_long_int();
        __CLR4_4_1lofloflgchorpg.R.inc(28273);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28274);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28275);TB.testWithDurationAdded_RD_int();
        __CLR4_4_1lofloflgchorpg.R.inc(28276);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28277);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28278);TB.testWithDurationAdded_RP_int();
        __CLR4_4_1lofloflgchorpg.R.inc(28279);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28280);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28281);TB.testPlus_long();
        __CLR4_4_1lofloflgchorpg.R.inc(28282);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28283);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28284);TB.testPlus_RD();
        __CLR4_4_1lofloflgchorpg.R.inc(28285);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28286);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28287);TB.testPlus_RP();
        __CLR4_4_1lofloflgchorpg.R.inc(28288);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28289);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28290);TB.testPlusYears_int();
        __CLR4_4_1lofloflgchorpg.R.inc(28291);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28292);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28293);TB.testPlusMonths_int();
        __CLR4_4_1lofloflgchorpg.R.inc(28294);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28295);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28296);TB.testPlusMonths_intMax();
        __CLR4_4_1lofloflgchorpg.R.inc(28297);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28298);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28299);TB.testPlusMonths_intMin();
        __CLR4_4_1lofloflgchorpg.R.inc(28300);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28301);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28302);TB.testPlusWeeks_int();
        __CLR4_4_1lofloflgchorpg.R.inc(28303);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28304);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28305);TB.testPlusDays_int();
        __CLR4_4_1lofloflgchorpg.R.inc(28306);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28307);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28308);TB.testPlusHours_int();
        __CLR4_4_1lofloflgchorpg.R.inc(28309);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28310);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28311);TB.testPlusMinutes_int();
        __CLR4_4_1lofloflgchorpg.R.inc(28312);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28313);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28314);TB.testPlusSeconds_int();
        __CLR4_4_1lofloflgchorpg.R.inc(28315);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28316);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28317);TB.testPlusMillis_int();
        __CLR4_4_1lofloflgchorpg.R.inc(28318);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28319);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28320);TB.testMinus_long();
        __CLR4_4_1lofloflgchorpg.R.inc(28321);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28322);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28323);TB.testMinus_RD();
        __CLR4_4_1lofloflgchorpg.R.inc(28324);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28325);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28326);TB.testMinus_RP();
        __CLR4_4_1lofloflgchorpg.R.inc(28327);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28328);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28329);TB.testMinusYears_int();
        __CLR4_4_1lofloflgchorpg.R.inc(28330);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28331);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28332);TB.testMinusMonths_int();
        __CLR4_4_1lofloflgchorpg.R.inc(28333);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28334);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28335);TB.testMinusMonths_intMax();
        __CLR4_4_1lofloflgchorpg.R.inc(28336);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28337);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28338);TB.testMinusMonths_intMin();
        __CLR4_4_1lofloflgchorpg.R.inc(28339);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28340);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28341);TB.testMinusWeeks_int();
        __CLR4_4_1lofloflgchorpg.R.inc(28342);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28343);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28344);TB.testMinusDays_int();
        __CLR4_4_1lofloflgchorpg.R.inc(28345);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28346);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28347);TB.testMinusHours_int();
        __CLR4_4_1lofloflgchorpg.R.inc(28348);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28349);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28350);TB.testMinusMinutes_int();
        __CLR4_4_1lofloflgchorpg.R.inc(28351);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28352);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28353);TB.testMinusSeconds_int();
        __CLR4_4_1lofloflgchorpg.R.inc(28354);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28355);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28356);TB.testMinusMillis_int();
        __CLR4_4_1lofloflgchorpg.R.inc(28357);TB.tearDown();
        __CLR4_4_1lofloflgchorpg.R.inc(28358);TB.setUp();
        __CLR4_4_1lofloflgchorpg.R.inc(28359);TB.testProperty();
        __CLR4_4_1lofloflgchorpg.R.inc(28360);TB.tearDown();

    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestDateTime_Basics.class);
    }

    public TestDateTime_Basics(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1lofloflgchorpg.R.inc(28361);
        __CLR4_4_1lofloflgchorpg.R.inc(28362);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lofloflgchorpg.R.inc(28363);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1lofloflgchorpg.R.inc(28364);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1lofloflgchorpg.R.inc(28365);originalLocale = Locale.getDefault();
        __CLR4_4_1lofloflgchorpg.R.inc(28366);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1lofloflgchorpg.R.inc(28367);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1lofloflgchorpg.R.inc(28368);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1lofloflgchorpg.R.inc(28369);
        __CLR4_4_1lofloflgchorpg.R.inc(28370);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lofloflgchorpg.R.inc(28371);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1lofloflgchorpg.R.inc(28372);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1lofloflgchorpg.R.inc(28373);Locale.setDefault(originalLocale);
        __CLR4_4_1lofloflgchorpg.R.inc(28374);originalDateTimeZone = null;
        __CLR4_4_1lofloflgchorpg.R.inc(28375);originalTimeZone = null;
        __CLR4_4_1lofloflgchorpg.R.inc(28376);originalLocale = null;
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjlw9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28377,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjlw9(){try{__CLR4_4_1lofloflgchorpg.R.inc(28377);
        __CLR4_4_1lofloflgchorpg.R.inc(28378);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1lofloflgchorpg.R.inc(28379);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1lofloflgchorpg.R.inc(28380);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGet_DateTimeField() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zggkkrlwd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testGet_DateTimeField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28381,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zggkkrlwd(){try{__CLR4_4_1lofloflgchorpg.R.inc(28381);
        __CLR4_4_1lofloflgchorpg.R.inc(28382);DateTime test = new DateTime();
        __CLR4_4_1lofloflgchorpg.R.inc(28383);assertEquals(1, test.get(ISO_DEFAULT.era()));
        __CLR4_4_1lofloflgchorpg.R.inc(28384);assertEquals(20, test.get(ISO_DEFAULT.centuryOfEra()));
        __CLR4_4_1lofloflgchorpg.R.inc(28385);assertEquals(2, test.get(ISO_DEFAULT.yearOfCentury()));
        __CLR4_4_1lofloflgchorpg.R.inc(28386);assertEquals(2002, test.get(ISO_DEFAULT.yearOfEra()));
        __CLR4_4_1lofloflgchorpg.R.inc(28387);assertEquals(2002, test.get(ISO_DEFAULT.year()));
        __CLR4_4_1lofloflgchorpg.R.inc(28388);assertEquals(6, test.get(ISO_DEFAULT.monthOfYear()));
        __CLR4_4_1lofloflgchorpg.R.inc(28389);assertEquals(9, test.get(ISO_DEFAULT.dayOfMonth()));
        __CLR4_4_1lofloflgchorpg.R.inc(28390);assertEquals(2002, test.get(ISO_DEFAULT.weekyear()));
        __CLR4_4_1lofloflgchorpg.R.inc(28391);assertEquals(23, test.get(ISO_DEFAULT.weekOfWeekyear()));
        __CLR4_4_1lofloflgchorpg.R.inc(28392);assertEquals(7, test.get(ISO_DEFAULT.dayOfWeek()));
        __CLR4_4_1lofloflgchorpg.R.inc(28393);assertEquals(160, test.get(ISO_DEFAULT.dayOfYear()));
        __CLR4_4_1lofloflgchorpg.R.inc(28394);assertEquals(0, test.get(ISO_DEFAULT.halfdayOfDay()));
        __CLR4_4_1lofloflgchorpg.R.inc(28395);assertEquals(1, test.get(ISO_DEFAULT.hourOfHalfday()));
        __CLR4_4_1lofloflgchorpg.R.inc(28396);assertEquals(1, test.get(ISO_DEFAULT.clockhourOfDay()));
        __CLR4_4_1lofloflgchorpg.R.inc(28397);assertEquals(1, test.get(ISO_DEFAULT.clockhourOfHalfday()));
        __CLR4_4_1lofloflgchorpg.R.inc(28398);assertEquals(1, test.get(ISO_DEFAULT.hourOfDay()));
        __CLR4_4_1lofloflgchorpg.R.inc(28399);assertEquals(0, test.get(ISO_DEFAULT.minuteOfHour()));
        __CLR4_4_1lofloflgchorpg.R.inc(28400);assertEquals(60, test.get(ISO_DEFAULT.minuteOfDay()));
        __CLR4_4_1lofloflgchorpg.R.inc(28401);assertEquals(0, test.get(ISO_DEFAULT.secondOfMinute()));
        __CLR4_4_1lofloflgchorpg.R.inc(28402);assertEquals(60 * 60, test.get(ISO_DEFAULT.secondOfDay()));
        __CLR4_4_1lofloflgchorpg.R.inc(28403);assertEquals(0, test.get(ISO_DEFAULT.millisOfSecond()));
        __CLR4_4_1lofloflgchorpg.R.inc(28404);assertEquals(60 * 60 * 1000, test.get(ISO_DEFAULT.millisOfDay()));
        __CLR4_4_1lofloflgchorpg.R.inc(28405);try {
            __CLR4_4_1lofloflgchorpg.R.inc(28406);test.get((DateTimeField) null);
            __CLR4_4_1lofloflgchorpg.R.inc(28407);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testGet_DateTimeFieldType() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyir3vlx4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testGet_DateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28408,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyir3vlx4(){try{__CLR4_4_1lofloflgchorpg.R.inc(28408);
        __CLR4_4_1lofloflgchorpg.R.inc(28409);DateTime test = new DateTime();
        __CLR4_4_1lofloflgchorpg.R.inc(28410);assertEquals(1, test.get(DateTimeFieldType.era()));
        __CLR4_4_1lofloflgchorpg.R.inc(28411);assertEquals(20, test.get(DateTimeFieldType.centuryOfEra()));
        __CLR4_4_1lofloflgchorpg.R.inc(28412);assertEquals(2, test.get(DateTimeFieldType.yearOfCentury()));
        __CLR4_4_1lofloflgchorpg.R.inc(28413);assertEquals(2002, test.get(DateTimeFieldType.yearOfEra()));
        __CLR4_4_1lofloflgchorpg.R.inc(28414);assertEquals(2002, test.get(DateTimeFieldType.year()));
        __CLR4_4_1lofloflgchorpg.R.inc(28415);assertEquals(6, test.get(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1lofloflgchorpg.R.inc(28416);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1lofloflgchorpg.R.inc(28417);assertEquals(2002, test.get(DateTimeFieldType.weekyear()));
        __CLR4_4_1lofloflgchorpg.R.inc(28418);assertEquals(23, test.get(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1lofloflgchorpg.R.inc(28419);assertEquals(7, test.get(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1lofloflgchorpg.R.inc(28420);assertEquals(160, test.get(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1lofloflgchorpg.R.inc(28421);assertEquals(0, test.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1lofloflgchorpg.R.inc(28422);assertEquals(1, test.get(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1lofloflgchorpg.R.inc(28423);assertEquals(1, test.get(DateTimeFieldType.clockhourOfDay()));
        __CLR4_4_1lofloflgchorpg.R.inc(28424);assertEquals(1, test.get(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1lofloflgchorpg.R.inc(28425);assertEquals(1, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1lofloflgchorpg.R.inc(28426);assertEquals(0, test.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1lofloflgchorpg.R.inc(28427);assertEquals(60, test.get(DateTimeFieldType.minuteOfDay()));
        __CLR4_4_1lofloflgchorpg.R.inc(28428);assertEquals(0, test.get(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1lofloflgchorpg.R.inc(28429);assertEquals(60 * 60, test.get(DateTimeFieldType.secondOfDay()));
        __CLR4_4_1lofloflgchorpg.R.inc(28430);assertEquals(0, test.get(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1lofloflgchorpg.R.inc(28431);assertEquals(60 * 60 * 1000, test.get(DateTimeFieldType.millisOfDay()));
        __CLR4_4_1lofloflgchorpg.R.inc(28432);try {
            __CLR4_4_1lofloflgchorpg.R.inc(28433);test.get((DateTimeFieldType) null);
            __CLR4_4_1lofloflgchorpg.R.inc(28434);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testIsSupported_DateTimeFieldType() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iyuedvlxv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsSupported_DateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28435,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iyuedvlxv(){try{__CLR4_4_1lofloflgchorpg.R.inc(28435);
        __CLR4_4_1lofloflgchorpg.R.inc(28436);DateTime test = new DateTime();
        __CLR4_4_1lofloflgchorpg.R.inc(28437);assertEquals(true, test.isSupported(DateTimeFieldType.era()));
        __CLR4_4_1lofloflgchorpg.R.inc(28438);assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra()));
        __CLR4_4_1lofloflgchorpg.R.inc(28439);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury()));
        __CLR4_4_1lofloflgchorpg.R.inc(28440);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra()));
        __CLR4_4_1lofloflgchorpg.R.inc(28441);assertEquals(true, test.isSupported(DateTimeFieldType.year()));
        __CLR4_4_1lofloflgchorpg.R.inc(28442);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1lofloflgchorpg.R.inc(28443);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1lofloflgchorpg.R.inc(28444);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear()));
        __CLR4_4_1lofloflgchorpg.R.inc(28445);assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1lofloflgchorpg.R.inc(28446);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1lofloflgchorpg.R.inc(28447);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1lofloflgchorpg.R.inc(28448);assertEquals(true, test.isSupported(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1lofloflgchorpg.R.inc(28449);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1lofloflgchorpg.R.inc(28450);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfDay()));
        __CLR4_4_1lofloflgchorpg.R.inc(28451);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1lofloflgchorpg.R.inc(28452);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1lofloflgchorpg.R.inc(28453);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1lofloflgchorpg.R.inc(28454);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay()));
        __CLR4_4_1lofloflgchorpg.R.inc(28455);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1lofloflgchorpg.R.inc(28456);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay()));
        __CLR4_4_1lofloflgchorpg.R.inc(28457);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1lofloflgchorpg.R.inc(28458);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay()));
        __CLR4_4_1lofloflgchorpg.R.inc(28459);assertEquals(false, test.isSupported(null));
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetters() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jiqsv7lyk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testGetters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jiqsv7lyk(){try{__CLR4_4_1lofloflgchorpg.R.inc(28460);
        __CLR4_4_1lofloflgchorpg.R.inc(28461);DateTime test = new DateTime();

        __CLR4_4_1lofloflgchorpg.R.inc(28462);assertEquals(ISO_DEFAULT, test.getChronology());
        __CLR4_4_1lofloflgchorpg.R.inc(28463);assertEquals(LONDON, test.getZone());
        __CLR4_4_1lofloflgchorpg.R.inc(28464);assertEquals(TEST_TIME_NOW, test.getMillis());

        __CLR4_4_1lofloflgchorpg.R.inc(28465);assertEquals(1, test.getEra());
        __CLR4_4_1lofloflgchorpg.R.inc(28466);assertEquals(20, test.getCenturyOfEra());
        __CLR4_4_1lofloflgchorpg.R.inc(28467);assertEquals(2, test.getYearOfCentury());
        __CLR4_4_1lofloflgchorpg.R.inc(28468);assertEquals(2002, test.getYearOfEra());
        __CLR4_4_1lofloflgchorpg.R.inc(28469);assertEquals(2002, test.getYear());
        __CLR4_4_1lofloflgchorpg.R.inc(28470);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1lofloflgchorpg.R.inc(28471);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1lofloflgchorpg.R.inc(28472);assertEquals(2002, test.getWeekyear());
        __CLR4_4_1lofloflgchorpg.R.inc(28473);assertEquals(23, test.getWeekOfWeekyear());
        __CLR4_4_1lofloflgchorpg.R.inc(28474);assertEquals(7, test.getDayOfWeek());
        __CLR4_4_1lofloflgchorpg.R.inc(28475);assertEquals(160, test.getDayOfYear());
        __CLR4_4_1lofloflgchorpg.R.inc(28476);assertEquals(1, test.getHourOfDay());
        __CLR4_4_1lofloflgchorpg.R.inc(28477);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_1lofloflgchorpg.R.inc(28478);assertEquals(60, test.getMinuteOfDay());
        __CLR4_4_1lofloflgchorpg.R.inc(28479);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1lofloflgchorpg.R.inc(28480);assertEquals(60 * 60, test.getSecondOfDay());
        __CLR4_4_1lofloflgchorpg.R.inc(28481);assertEquals(0, test.getMillisOfSecond());
        __CLR4_4_1lofloflgchorpg.R.inc(28482);assertEquals(60 * 60 * 1000, test.getMillisOfDay());
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testWithers() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn9jzplz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn9jzplz7(){try{__CLR4_4_1lofloflgchorpg.R.inc(28483);
        __CLR4_4_1lofloflgchorpg.R.inc(28484);DateTime test = new DateTime(1970, 6, 9, 10, 20, 30, 40, GJ_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(28485);check(test.withYear(2000), 2000, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1lofloflgchorpg.R.inc(28486);check(test.withMonthOfYear(2), 1970, 2, 9, 10, 20, 30, 40);
        __CLR4_4_1lofloflgchorpg.R.inc(28487);check(test.withDayOfMonth(2), 1970, 6, 2, 10, 20, 30, 40);
        __CLR4_4_1lofloflgchorpg.R.inc(28488);check(test.withDayOfYear(6), 1970, 1, 6, 10, 20, 30, 40);
        __CLR4_4_1lofloflgchorpg.R.inc(28489);check(test.withDayOfWeek(6), 1970, 6, 13, 10, 20, 30, 40);
        __CLR4_4_1lofloflgchorpg.R.inc(28490);check(test.withWeekOfWeekyear(6), 1970, 2, 3, 10, 20, 30, 40);
        __CLR4_4_1lofloflgchorpg.R.inc(28491);check(test.withWeekyear(1971), 1971, 6, 15, 10, 20, 30, 40);
        __CLR4_4_1lofloflgchorpg.R.inc(28492);check(test.withYearOfCentury(60), 1960, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1lofloflgchorpg.R.inc(28493);check(test.withCenturyOfEra(21), 2070, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1lofloflgchorpg.R.inc(28494);check(test.withYearOfEra(1066), 1066, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1lofloflgchorpg.R.inc(28495);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1lofloflgchorpg.R.inc(28496);check(test.withHourOfDay(6), 1970, 6, 9, 6, 20, 30, 40);
        __CLR4_4_1lofloflgchorpg.R.inc(28497);check(test.withMinuteOfHour(6), 1970, 6, 9, 10, 6, 30, 40);
        __CLR4_4_1lofloflgchorpg.R.inc(28498);check(test.withSecondOfMinute(6), 1970, 6, 9, 10, 20, 6, 40);
        __CLR4_4_1lofloflgchorpg.R.inc(28499);check(test.withMillisOfSecond(6), 1970, 6, 9, 10, 20, 30, 6);
        __CLR4_4_1lofloflgchorpg.R.inc(28500);check(test.withMillisOfDay(61234), 1970, 6, 9, 0, 1, 1, 234);

        __CLR4_4_1lofloflgchorpg.R.inc(28501);try {
            __CLR4_4_1lofloflgchorpg.R.inc(28502);test.withMonthOfYear(0);
            __CLR4_4_1lofloflgchorpg.R.inc(28503);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1lofloflgchorpg.R.inc(28504);try {
            __CLR4_4_1lofloflgchorpg.R.inc(28505);test.withMonthOfYear(13);
            __CLR4_4_1lofloflgchorpg.R.inc(28506);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEqualsHashCode() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77lzv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77lzv(){try{__CLR4_4_1lofloflgchorpg.R.inc(28507);
        __CLR4_4_1lofloflgchorpg.R.inc(28508);DateTime test1 = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28509);DateTime test2 = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28510);assertEquals(true, test1.equals(test2));
        __CLR4_4_1lofloflgchorpg.R.inc(28511);assertEquals(true, test2.equals(test1));
        __CLR4_4_1lofloflgchorpg.R.inc(28512);assertEquals(true, test1.equals(test1));
        __CLR4_4_1lofloflgchorpg.R.inc(28513);assertEquals(true, test2.equals(test2));
        __CLR4_4_1lofloflgchorpg.R.inc(28514);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1lofloflgchorpg.R.inc(28515);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1lofloflgchorpg.R.inc(28516);assertEquals(true, test2.hashCode() == test2.hashCode());

        __CLR4_4_1lofloflgchorpg.R.inc(28517);DateTime test3 = new DateTime(TEST_TIME2);
        __CLR4_4_1lofloflgchorpg.R.inc(28518);assertEquals(false, test1.equals(test3));
        __CLR4_4_1lofloflgchorpg.R.inc(28519);assertEquals(false, test2.equals(test3));
        __CLR4_4_1lofloflgchorpg.R.inc(28520);assertEquals(false, test3.equals(test1));
        __CLR4_4_1lofloflgchorpg.R.inc(28521);assertEquals(false, test3.equals(test2));
        __CLR4_4_1lofloflgchorpg.R.inc(28522);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1lofloflgchorpg.R.inc(28523);assertEquals(false, test2.hashCode() == test3.hashCode());

        __CLR4_4_1lofloflgchorpg.R.inc(28524);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1lofloflgchorpg.R.inc(28525);assertEquals(true, test1.equals(new MockInstant()));
        __CLR4_4_1lofloflgchorpg.R.inc(28526);assertEquals(false, test1.equals(new DateTime(TEST_TIME1, GREGORIAN_DEFAULT)));
        __CLR4_4_1lofloflgchorpg.R.inc(28527);assertEquals(true, new DateTime(TEST_TIME1, new MockEqualsChronology()).equals(new DateTime(TEST_TIME1, new MockEqualsChronology())));
        __CLR4_4_1lofloflgchorpg.R.inc(28528);assertEquals(false, new DateTime(TEST_TIME1, new MockEqualsChronology()).equals(new DateTime(TEST_TIME1, ISO_DEFAULT)));
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1lofloflgchorpg.R.inc(28529);
            __CLR4_4_1lofloflgchorpg.R.inc(28530);return null;
        }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

        public long getMillis() {try{__CLR4_4_1lofloflgchorpg.R.inc(28531);
            __CLR4_4_1lofloflgchorpg.R.inc(28532);return TEST_TIME1;
        }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

        public Chronology getChronology() {try{__CLR4_4_1lofloflgchorpg.R.inc(28533);
            __CLR4_4_1lofloflgchorpg.R.inc(28534);return ISO_DEFAULT;
        }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}
    }

    class MockEqualsChronology extends BaseChronology {
        private static final long serialVersionUID = 1L;

        public boolean equals(Object obj) {try{__CLR4_4_1lofloflgchorpg.R.inc(28535);
            __CLR4_4_1lofloflgchorpg.R.inc(28536);return obj instanceof MockEqualsChronology;
        }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

        public DateTimeZone getZone() {try{__CLR4_4_1lofloflgchorpg.R.inc(28537);
            __CLR4_4_1lofloflgchorpg.R.inc(28538);return null;
        }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

        public Chronology withUTC() {try{__CLR4_4_1lofloflgchorpg.R.inc(28539);
            __CLR4_4_1lofloflgchorpg.R.inc(28540);return this;
        }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

        public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1lofloflgchorpg.R.inc(28541);
            __CLR4_4_1lofloflgchorpg.R.inc(28542);return this;
        }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

        public String toString() {try{__CLR4_4_1lofloflgchorpg.R.inc(28543);
            __CLR4_4_1lofloflgchorpg.R.inc(28544);return "";
        }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}
    }

    @Test
    public void testCompareTo() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfvm0x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfvm0x(){try{__CLR4_4_1lofloflgchorpg.R.inc(28545);
        __CLR4_4_1lofloflgchorpg.R.inc(28546);DateTime test1 = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28547);DateTime test1a = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28548);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_1lofloflgchorpg.R.inc(28549);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_1lofloflgchorpg.R.inc(28550);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_1lofloflgchorpg.R.inc(28551);assertEquals(0, test1a.compareTo(test1a));

        __CLR4_4_1lofloflgchorpg.R.inc(28552);DateTime test2 = new DateTime(TEST_TIME2);
        __CLR4_4_1lofloflgchorpg.R.inc(28553);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_1lofloflgchorpg.R.inc(28554);assertEquals(+1, test2.compareTo(test1));

        __CLR4_4_1lofloflgchorpg.R.inc(28555);DateTime test3 = new DateTime(TEST_TIME2, GREGORIAN_PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28556);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_1lofloflgchorpg.R.inc(28557);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_1lofloflgchorpg.R.inc(28558);assertEquals(0, test3.compareTo(test2));

        __CLR4_4_1lofloflgchorpg.R.inc(28559);assertEquals(+1, test2.compareTo(new MockInstant()));
        __CLR4_4_1lofloflgchorpg.R.inc(28560);assertEquals(0, test1.compareTo(new MockInstant()));

        __CLR4_4_1lofloflgchorpg.R.inc(28561);try {
            __CLR4_4_1lofloflgchorpg.R.inc(28562);test1.compareTo(null);
            __CLR4_4_1lofloflgchorpg.R.inc(28563);fail();
        } catch (NullPointerException ex) {
        }
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsEqual_long() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w2rxu2m1g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsEqual_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w2rxu2m1g(){try{__CLR4_4_1lofloflgchorpg.R.inc(28564);
        __CLR4_4_1lofloflgchorpg.R.inc(28565);assertEquals(false, new DateTime(TEST_TIME1).isEqual(TEST_TIME2));
        __CLR4_4_1lofloflgchorpg.R.inc(28566);assertEquals(true, new DateTime(TEST_TIME1).isEqual(TEST_TIME1));
        __CLR4_4_1lofloflgchorpg.R.inc(28567);assertEquals(false, new DateTime(TEST_TIME2).isEqual(TEST_TIME1));
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testIsEqualNow() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17sfjzvm1k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsEqualNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28568,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17sfjzvm1k(){try{__CLR4_4_1lofloflgchorpg.R.inc(28568);
        __CLR4_4_1lofloflgchorpg.R.inc(28569);assertEquals(false, new DateTime(TEST_TIME_NOW - 1).isEqualNow());
        __CLR4_4_1lofloflgchorpg.R.inc(28570);assertEquals(true, new DateTime(TEST_TIME_NOW).isEqualNow());
        __CLR4_4_1lofloflgchorpg.R.inc(28571);assertEquals(false, new DateTime(TEST_TIME_NOW + 1).isEqualNow());
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testIsEqual_RI() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1wuudm1o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsEqual_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28572,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1wuudm1o(){try{__CLR4_4_1lofloflgchorpg.R.inc(28572);
        __CLR4_4_1lofloflgchorpg.R.inc(28573);DateTime test1 = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28574);DateTime test1a = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28575);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_1lofloflgchorpg.R.inc(28576);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_1lofloflgchorpg.R.inc(28577);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_1lofloflgchorpg.R.inc(28578);assertEquals(true, test1a.isEqual(test1a));

        __CLR4_4_1lofloflgchorpg.R.inc(28579);DateTime test2 = new DateTime(TEST_TIME2);
        __CLR4_4_1lofloflgchorpg.R.inc(28580);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_1lofloflgchorpg.R.inc(28581);assertEquals(false, test2.isEqual(test1));

        __CLR4_4_1lofloflgchorpg.R.inc(28582);DateTime test3 = new DateTime(TEST_TIME2, GREGORIAN_PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28583);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_1lofloflgchorpg.R.inc(28584);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_1lofloflgchorpg.R.inc(28585);assertEquals(true, test3.isEqual(test2));

        __CLR4_4_1lofloflgchorpg.R.inc(28586);assertEquals(false, test2.isEqual(new MockInstant()));
        __CLR4_4_1lofloflgchorpg.R.inc(28587);assertEquals(true, test1.isEqual(new MockInstant()));

        __CLR4_4_1lofloflgchorpg.R.inc(28588);assertEquals(false, new DateTime(TEST_TIME_NOW + 1).isEqual(null));
        __CLR4_4_1lofloflgchorpg.R.inc(28589);assertEquals(true, new DateTime(TEST_TIME_NOW).isEqual(null));
        __CLR4_4_1lofloflgchorpg.R.inc(28590);assertEquals(false, new DateTime(TEST_TIME_NOW - 1).isEqual(null));
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsBefore_long() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ie6mpzm27();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsBefore_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28591,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ie6mpzm27(){try{__CLR4_4_1lofloflgchorpg.R.inc(28591);
        __CLR4_4_1lofloflgchorpg.R.inc(28592);assertEquals(true, new DateTime(TEST_TIME1).isBefore(TEST_TIME2));
        __CLR4_4_1lofloflgchorpg.R.inc(28593);assertEquals(false, new DateTime(TEST_TIME1).isBefore(TEST_TIME1));
        __CLR4_4_1lofloflgchorpg.R.inc(28594);assertEquals(false, new DateTime(TEST_TIME2).isBefore(TEST_TIME1));
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testIsBeforeNow() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nh1we6m2b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsBeforeNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28595,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nh1we6m2b(){try{__CLR4_4_1lofloflgchorpg.R.inc(28595);
        __CLR4_4_1lofloflgchorpg.R.inc(28596);assertEquals(true, new DateTime(TEST_TIME_NOW - 1).isBeforeNow());
        __CLR4_4_1lofloflgchorpg.R.inc(28597);assertEquals(false, new DateTime(TEST_TIME_NOW).isBeforeNow());
        __CLR4_4_1lofloflgchorpg.R.inc(28598);assertEquals(false, new DateTime(TEST_TIME_NOW + 1).isBeforeNow());
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testIsBefore_RI() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15mphjym2f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsBefore_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15mphjym2f(){try{__CLR4_4_1lofloflgchorpg.R.inc(28599);
        __CLR4_4_1lofloflgchorpg.R.inc(28600);DateTime test1 = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28601);DateTime test1a = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28602);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_1lofloflgchorpg.R.inc(28603);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_1lofloflgchorpg.R.inc(28604);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_1lofloflgchorpg.R.inc(28605);assertEquals(false, test1a.isBefore(test1a));

        __CLR4_4_1lofloflgchorpg.R.inc(28606);DateTime test2 = new DateTime(TEST_TIME2);
        __CLR4_4_1lofloflgchorpg.R.inc(28607);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_1lofloflgchorpg.R.inc(28608);assertEquals(false, test2.isBefore(test1));

        __CLR4_4_1lofloflgchorpg.R.inc(28609);DateTime test3 = new DateTime(TEST_TIME2, GREGORIAN_PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28610);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_1lofloflgchorpg.R.inc(28611);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_1lofloflgchorpg.R.inc(28612);assertEquals(false, test3.isBefore(test2));

        __CLR4_4_1lofloflgchorpg.R.inc(28613);assertEquals(false, test2.isBefore(new MockInstant()));
        __CLR4_4_1lofloflgchorpg.R.inc(28614);assertEquals(false, test1.isBefore(new MockInstant()));

        __CLR4_4_1lofloflgchorpg.R.inc(28615);assertEquals(false, new DateTime(TEST_TIME_NOW + 1).isBefore(null));
        __CLR4_4_1lofloflgchorpg.R.inc(28616);assertEquals(false, new DateTime(TEST_TIME_NOW).isBefore(null));
        __CLR4_4_1lofloflgchorpg.R.inc(28617);assertEquals(true, new DateTime(TEST_TIME_NOW - 1).isBefore(null));
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsAfter_long() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ehltpam2y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsAfter_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28618,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ehltpam2y(){try{__CLR4_4_1lofloflgchorpg.R.inc(28618);
        __CLR4_4_1lofloflgchorpg.R.inc(28619);assertEquals(false, new DateTime(TEST_TIME1).isAfter(TEST_TIME2));
        __CLR4_4_1lofloflgchorpg.R.inc(28620);assertEquals(false, new DateTime(TEST_TIME1).isAfter(TEST_TIME1));
        __CLR4_4_1lofloflgchorpg.R.inc(28621);assertEquals(true, new DateTime(TEST_TIME2).isAfter(TEST_TIME1));
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testIsAfterNow() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15bglzxm32();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsAfterNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15bglzxm32(){try{__CLR4_4_1lofloflgchorpg.R.inc(28622);
        __CLR4_4_1lofloflgchorpg.R.inc(28623);assertEquals(false, new DateTime(TEST_TIME_NOW - 1).isAfterNow());
        __CLR4_4_1lofloflgchorpg.R.inc(28624);assertEquals(false, new DateTime(TEST_TIME_NOW).isAfterNow());
        __CLR4_4_1lofloflgchorpg.R.inc(28625);assertEquals(true, new DateTime(TEST_TIME_NOW + 1).isAfterNow());
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testIsAfter_RI() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n5t0u5m36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsAfter_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n5t0u5m36(){try{__CLR4_4_1lofloflgchorpg.R.inc(28626);
        __CLR4_4_1lofloflgchorpg.R.inc(28627);DateTime test1 = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28628);DateTime test1a = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28629);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_1lofloflgchorpg.R.inc(28630);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_1lofloflgchorpg.R.inc(28631);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_1lofloflgchorpg.R.inc(28632);assertEquals(false, test1a.isAfter(test1a));

        __CLR4_4_1lofloflgchorpg.R.inc(28633);DateTime test2 = new DateTime(TEST_TIME2);
        __CLR4_4_1lofloflgchorpg.R.inc(28634);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_1lofloflgchorpg.R.inc(28635);assertEquals(true, test2.isAfter(test1));

        __CLR4_4_1lofloflgchorpg.R.inc(28636);DateTime test3 = new DateTime(TEST_TIME2, GREGORIAN_PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28637);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_1lofloflgchorpg.R.inc(28638);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_1lofloflgchorpg.R.inc(28639);assertEquals(false, test3.isAfter(test2));

        __CLR4_4_1lofloflgchorpg.R.inc(28640);assertEquals(true, test2.isAfter(new MockInstant()));
        __CLR4_4_1lofloflgchorpg.R.inc(28641);assertEquals(false, test1.isAfter(new MockInstant()));

        __CLR4_4_1lofloflgchorpg.R.inc(28642);assertEquals(true, new DateTime(TEST_TIME_NOW + 1).isAfter(null));
        __CLR4_4_1lofloflgchorpg.R.inc(28643);assertEquals(false, new DateTime(TEST_TIME_NOW).isAfter(null));
        __CLR4_4_1lofloflgchorpg.R.inc(28644);assertEquals(false, new DateTime(TEST_TIME_NOW - 1).isAfter(null));
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9m3p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28645,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9m3p() throws Exception{try{__CLR4_4_1lofloflgchorpg.R.inc(28645);
        __CLR4_4_1lofloflgchorpg.R.inc(28646);DateTime test = new DateTime(TEST_TIME_NOW);

        __CLR4_4_1lofloflgchorpg.R.inc(28647);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1lofloflgchorpg.R.inc(28648);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1lofloflgchorpg.R.inc(28649);oos.writeObject(test);
        __CLR4_4_1lofloflgchorpg.R.inc(28650);oos.close();
        __CLR4_4_1lofloflgchorpg.R.inc(28651);byte[] bytes = baos.toByteArray();

        __CLR4_4_1lofloflgchorpg.R.inc(28652);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1lofloflgchorpg.R.inc(28653);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1lofloflgchorpg.R.inc(28654);DateTime result = (DateTime) ois.readObject();
        __CLR4_4_1lofloflgchorpg.R.inc(28655);ois.close();

        __CLR4_4_1lofloflgchorpg.R.inc(28656);assertEquals(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidm41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28657,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidm41(){try{__CLR4_4_1lofloflgchorpg.R.inc(28657);
        __CLR4_4_1lofloflgchorpg.R.inc(28658);DateTime test = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1lofloflgchorpg.R.inc(28659);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString());

        __CLR4_4_1lofloflgchorpg.R.inc(28660);test = new DateTime(TEST_TIME_NOW, PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28661);assertEquals("2002-06-09T02:00:00.000+02:00", test.toString());
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testToString_String() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llkh2xm46();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToString_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28662,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llkh2xm46(){try{__CLR4_4_1lofloflgchorpg.R.inc(28662);
        __CLR4_4_1lofloflgchorpg.R.inc(28663);DateTime test = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1lofloflgchorpg.R.inc(28664);assertEquals("2002 01", test.toString("yyyy HH"));
        __CLR4_4_1lofloflgchorpg.R.inc(28665);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString((String) null));
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testToString_String_Locale() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1afd64um4a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToString_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1afd64um4a(){try{__CLR4_4_1lofloflgchorpg.R.inc(28666);
        __CLR4_4_1lofloflgchorpg.R.inc(28667);DateTime test = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1lofloflgchorpg.R.inc(28668);assertEquals("Sun 9/6", test.toString("EEE d/M", Locale.ENGLISH));
        __CLR4_4_1lofloflgchorpg.R.inc(28669);assertEquals("dim. 9/6", test.toString("EEE d/M", Locale.FRENCH));
        __CLR4_4_1lofloflgchorpg.R.inc(28670);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, Locale.ENGLISH));
        __CLR4_4_1lofloflgchorpg.R.inc(28671);assertEquals("Sun 9/6", test.toString("EEE d/M", null));
        __CLR4_4_1lofloflgchorpg.R.inc(28672);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, null));
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testToString_DTFormatter() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxbkpsm4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToString_DTFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxbkpsm4h(){try{__CLR4_4_1lofloflgchorpg.R.inc(28673);
        __CLR4_4_1lofloflgchorpg.R.inc(28674);DateMidnight test = new DateMidnight(TEST_TIME_NOW);
        __CLR4_4_1lofloflgchorpg.R.inc(28675);assertEquals("2002 00", test.toString(DateTimeFormat.forPattern("yyyy HH")));
        __CLR4_4_1lofloflgchorpg.R.inc(28676);assertEquals("2002-06-09T00:00:00.000+01:00", test.toString((DateTimeFormatter) null));
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToInstant() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yip9h7m4l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28677,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yip9h7m4l(){try{__CLR4_4_1lofloflgchorpg.R.inc(28677);
        __CLR4_4_1lofloflgchorpg.R.inc(28678);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28679);Instant result = test.toInstant();
        __CLR4_4_1lofloflgchorpg.R.inc(28680);assertEquals(TEST_TIME1, result.getMillis());
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testToDateTime() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hmtfovm4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hmtfovm4p(){try{__CLR4_4_1lofloflgchorpg.R.inc(28681);
        __CLR4_4_1lofloflgchorpg.R.inc(28682);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28683);DateTime result = test.toDateTime();
        __CLR4_4_1lofloflgchorpg.R.inc(28684);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testToDateTimeISO() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1udmnxgm4t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateTimeISO",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28685,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1udmnxgm4t(){try{__CLR4_4_1lofloflgchorpg.R.inc(28685);
        __CLR4_4_1lofloflgchorpg.R.inc(28686);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28687);DateTime result = test.toDateTimeISO();
        __CLR4_4_1lofloflgchorpg.R.inc(28688);assertSame(test, result);

        __CLR4_4_1lofloflgchorpg.R.inc(28689);test = new DateTime(TEST_TIME1, ISO_PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28690);result = test.toDateTimeISO();
        __CLR4_4_1lofloflgchorpg.R.inc(28691);assertSame(DateTime.class, result.getClass());
        __CLR4_4_1lofloflgchorpg.R.inc(28692);assertSame(ISOChronology.class, result.getChronology().getClass());
        __CLR4_4_1lofloflgchorpg.R.inc(28693);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28694);assertEquals(ISO_PARIS, result.getChronology());
        __CLR4_4_1lofloflgchorpg.R.inc(28695);assertNotSame(test, result);

        __CLR4_4_1lofloflgchorpg.R.inc(28696);test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(28697);result = test.toDateTimeISO();
        __CLR4_4_1lofloflgchorpg.R.inc(28698);assertSame(DateTime.class, result.getClass());
        __CLR4_4_1lofloflgchorpg.R.inc(28699);assertSame(ISOChronology.class, result.getChronology().getClass());
        __CLR4_4_1lofloflgchorpg.R.inc(28700);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28701);assertEquals(ISO_DEFAULT, result.getChronology());
        __CLR4_4_1lofloflgchorpg.R.inc(28702);assertNotSame(test, result);

        __CLR4_4_1lofloflgchorpg.R.inc(28703);test = new DateTime(TEST_TIME1, new MockNullZoneChronology());
        __CLR4_4_1lofloflgchorpg.R.inc(28704);result = test.toDateTimeISO();
        __CLR4_4_1lofloflgchorpg.R.inc(28705);assertSame(DateTime.class, result.getClass());
        __CLR4_4_1lofloflgchorpg.R.inc(28706);assertSame(ISOChronology.class, result.getChronology().getClass());
        __CLR4_4_1lofloflgchorpg.R.inc(28707);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28708);assertEquals(ISO_DEFAULT, result.getChronology());
        __CLR4_4_1lofloflgchorpg.R.inc(28709);assertNotSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    public void testToDateTime_DateTimeZone() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14hynetm5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateTime_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28710,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14hynetm5i(){try{__CLR4_4_1lofloflgchorpg.R.inc(28710);
        __CLR4_4_1lofloflgchorpg.R.inc(28711);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28712);DateTime result = test.toDateTime(LONDON);
        __CLR4_4_1lofloflgchorpg.R.inc(28713);assertSame(test, result);

        __CLR4_4_1lofloflgchorpg.R.inc(28714);test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28715);result = test.toDateTime(PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28716);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28717);assertEquals(PARIS, result.getZone());

        __CLR4_4_1lofloflgchorpg.R.inc(28718);test = new DateTime(TEST_TIME1, PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28719);result = test.toDateTime((DateTimeZone) null);
        __CLR4_4_1lofloflgchorpg.R.inc(28720);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28721);assertEquals(LONDON, result.getZone());

        __CLR4_4_1lofloflgchorpg.R.inc(28722);test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28723);result = test.toDateTime((DateTimeZone) null);
        __CLR4_4_1lofloflgchorpg.R.inc(28724);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testToDateTime_Chronology() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fzqjjem5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateTime_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fzqjjem5x(){try{__CLR4_4_1lofloflgchorpg.R.inc(28725);
        __CLR4_4_1lofloflgchorpg.R.inc(28726);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28727);DateTime result = test.toDateTime(ISO_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(28728);assertSame(test, result);

        __CLR4_4_1lofloflgchorpg.R.inc(28729);test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28730);result = test.toDateTime(GREGORIAN_PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28731);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28732);assertEquals(GREGORIAN_PARIS, result.getChronology());

        __CLR4_4_1lofloflgchorpg.R.inc(28733);test = new DateTime(TEST_TIME1, GREGORIAN_PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28734);result = test.toDateTime((Chronology) null);
        __CLR4_4_1lofloflgchorpg.R.inc(28735);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28736);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1lofloflgchorpg.R.inc(28737);test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28738);result = test.toDateTime((Chronology) null);
        __CLR4_4_1lofloflgchorpg.R.inc(28739);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testToMutableDateTime() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c071a3m6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToMutableDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28740,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c071a3m6c(){try{__CLR4_4_1lofloflgchorpg.R.inc(28740);
        __CLR4_4_1lofloflgchorpg.R.inc(28741);DateTime test = new DateTime(TEST_TIME1, PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28742);MutableDateTime result = test.toMutableDateTime();
        __CLR4_4_1lofloflgchorpg.R.inc(28743);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28744);assertEquals(ISO_PARIS, result.getChronology());
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testToMutableDateTimeISO() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c7exd4m6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToMutableDateTimeISO",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c7exd4m6h(){try{__CLR4_4_1lofloflgchorpg.R.inc(28745);
        __CLR4_4_1lofloflgchorpg.R.inc(28746);DateTime test = new DateTime(TEST_TIME1, PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28747);MutableDateTime result = test.toMutableDateTimeISO();
        __CLR4_4_1lofloflgchorpg.R.inc(28748);assertSame(MutableDateTime.class, result.getClass());
        __CLR4_4_1lofloflgchorpg.R.inc(28749);assertSame(ISOChronology.class, result.getChronology().getClass());
        __CLR4_4_1lofloflgchorpg.R.inc(28750);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28751);assertEquals(ISO_PARIS, result.getChronology());
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testToMutableDateTime_DateTimeZone() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0i321m6o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToMutableDateTime_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28752,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0i321m6o(){try{__CLR4_4_1lofloflgchorpg.R.inc(28752);
        __CLR4_4_1lofloflgchorpg.R.inc(28753);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28754);MutableDateTime result = test.toMutableDateTime(LONDON);
        __CLR4_4_1lofloflgchorpg.R.inc(28755);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28756);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1lofloflgchorpg.R.inc(28757);test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28758);result = test.toMutableDateTime(PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28759);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28760);assertEquals(ISO_PARIS, result.getChronology());

        __CLR4_4_1lofloflgchorpg.R.inc(28761);test = new DateTime(TEST_TIME1, PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28762);result = test.toMutableDateTime((DateTimeZone) null);
        __CLR4_4_1lofloflgchorpg.R.inc(28763);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28764);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1lofloflgchorpg.R.inc(28765);test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28766);result = test.toMutableDateTime((DateTimeZone) null);
        __CLR4_4_1lofloflgchorpg.R.inc(28767);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28768);assertEquals(ISO_DEFAULT, result.getChronology());
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testToMutableDateTime_Chronology() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yi6xe2m75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToMutableDateTime_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yi6xe2m75(){try{__CLR4_4_1lofloflgchorpg.R.inc(28769);
        __CLR4_4_1lofloflgchorpg.R.inc(28770);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28771);MutableDateTime result = test.toMutableDateTime(ISO_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(28772);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28773);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1lofloflgchorpg.R.inc(28774);test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28775);result = test.toMutableDateTime(GREGORIAN_PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28776);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28777);assertEquals(GREGORIAN_PARIS, result.getChronology());

        __CLR4_4_1lofloflgchorpg.R.inc(28778);test = new DateTime(TEST_TIME1, GREGORIAN_PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28779);result = test.toMutableDateTime((Chronology) null);
        __CLR4_4_1lofloflgchorpg.R.inc(28780);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28781);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1lofloflgchorpg.R.inc(28782);test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28783);result = test.toMutableDateTime((Chronology) null);
        __CLR4_4_1lofloflgchorpg.R.inc(28784);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28785);assertEquals(ISO_DEFAULT, result.getChronology());
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testToDate() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wvdkgym7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wvdkgym7m(){try{__CLR4_4_1lofloflgchorpg.R.inc(28786);
        __CLR4_4_1lofloflgchorpg.R.inc(28787);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28788);Date result = test.toDate();
        __CLR4_4_1lofloflgchorpg.R.inc(28789);assertEquals(test.getMillis(), result.getTime());
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testToCalendar_Locale() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ez8ojvm7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToCalendar_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ez8ojvm7q(){try{__CLR4_4_1lofloflgchorpg.R.inc(28790);
        __CLR4_4_1lofloflgchorpg.R.inc(28791);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28792);Calendar result = test.toCalendar(null);
        __CLR4_4_1lofloflgchorpg.R.inc(28793);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1lofloflgchorpg.R.inc(28794);assertEquals(TimeZone.getTimeZone("Europe/London"), result.getTimeZone());

        __CLR4_4_1lofloflgchorpg.R.inc(28795);test = new DateTime(TEST_TIME1, PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28796);result = test.toCalendar(null);
        __CLR4_4_1lofloflgchorpg.R.inc(28797);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1lofloflgchorpg.R.inc(28798);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());

        __CLR4_4_1lofloflgchorpg.R.inc(28799);test = new DateTime(TEST_TIME1, PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28800);result = test.toCalendar(Locale.UK);
        __CLR4_4_1lofloflgchorpg.R.inc(28801);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1lofloflgchorpg.R.inc(28802);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testToGregorianCalendar() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zoxa6m83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToGregorianCalendar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zoxa6m83(){try{__CLR4_4_1lofloflgchorpg.R.inc(28803);
        __CLR4_4_1lofloflgchorpg.R.inc(28804);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28805);GregorianCalendar result = test.toGregorianCalendar();
        __CLR4_4_1lofloflgchorpg.R.inc(28806);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1lofloflgchorpg.R.inc(28807);assertEquals(TimeZone.getTimeZone("Europe/London"), result.getTimeZone());

        __CLR4_4_1lofloflgchorpg.R.inc(28808);test = new DateTime(TEST_TIME1, PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28809);result = test.toGregorianCalendar();
        __CLR4_4_1lofloflgchorpg.R.inc(28810);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1lofloflgchorpg.R.inc(28811);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testToDateMidnight() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1osch5em8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateMidnight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1osch5em8c(){try{__CLR4_4_1lofloflgchorpg.R.inc(28812);
        __CLR4_4_1lofloflgchorpg.R.inc(28813);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(28814);DateMidnight test = base.toDateMidnight();
        __CLR4_4_1lofloflgchorpg.R.inc(28815);assertEquals(new DateMidnight(base, COPTIC_DEFAULT), test);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testToYearMonthDay() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c6rzn1m8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToYearMonthDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28816,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c6rzn1m8g(){try{__CLR4_4_1lofloflgchorpg.R.inc(28816);
        __CLR4_4_1lofloflgchorpg.R.inc(28817);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(28818);YearMonthDay test = base.toYearMonthDay();
        __CLR4_4_1lofloflgchorpg.R.inc(28819);assertEquals(new YearMonthDay(TEST_TIME1, COPTIC_DEFAULT), test);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testToTimeOfDay() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6fxsem8k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToTimeOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6fxsem8k(){try{__CLR4_4_1lofloflgchorpg.R.inc(28820);
        __CLR4_4_1lofloflgchorpg.R.inc(28821);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(28822);TimeOfDay test = base.toTimeOfDay();
        __CLR4_4_1lofloflgchorpg.R.inc(28823);assertEquals(new TimeOfDay(TEST_TIME1, COPTIC_DEFAULT), test);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testToLocalDateTime() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18m6ie8m8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToLocalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28824,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18m6ie8m8o(){try{__CLR4_4_1lofloflgchorpg.R.inc(28824);
        __CLR4_4_1lofloflgchorpg.R.inc(28825);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(28826);LocalDateTime test = base.toLocalDateTime();
        __CLR4_4_1lofloflgchorpg.R.inc(28827);assertEquals(new LocalDateTime(TEST_TIME1, COPTIC_DEFAULT), test);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testToLocalDate() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1orirm8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28828,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1orirm8s(){try{__CLR4_4_1lofloflgchorpg.R.inc(28828);
        __CLR4_4_1lofloflgchorpg.R.inc(28829);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(28830);LocalDate test = base.toLocalDate();
        __CLR4_4_1lofloflgchorpg.R.inc(28831);assertEquals(new LocalDate(TEST_TIME1, COPTIC_DEFAULT), test);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testToLocalTime() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mn1c42m8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToLocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28832,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mn1c42m8w(){try{__CLR4_4_1lofloflgchorpg.R.inc(28832);
        __CLR4_4_1lofloflgchorpg.R.inc(28833);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(28834);LocalTime test = base.toLocalTime();
        __CLR4_4_1lofloflgchorpg.R.inc(28835);assertEquals(new LocalTime(TEST_TIME1, COPTIC_DEFAULT), test);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithMillis_long() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n9ypzwm90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithMillis_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n9ypzwm90(){try{__CLR4_4_1lofloflgchorpg.R.inc(28836);
        __CLR4_4_1lofloflgchorpg.R.inc(28837);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28838);DateTime result = test.withMillis(TEST_TIME2);
        __CLR4_4_1lofloflgchorpg.R.inc(28839);assertEquals(TEST_TIME2, result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28840);assertEquals(test.getChronology(), result.getChronology());

        __CLR4_4_1lofloflgchorpg.R.inc(28841);test = new DateTime(TEST_TIME1, GREGORIAN_PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28842);result = test.withMillis(TEST_TIME2);
        __CLR4_4_1lofloflgchorpg.R.inc(28843);assertEquals(TEST_TIME2, result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28844);assertEquals(test.getChronology(), result.getChronology());

        __CLR4_4_1lofloflgchorpg.R.inc(28845);test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28846);result = test.withMillis(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28847);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testWithChronology_Chronology() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_133y836m9c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithChronology_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_133y836m9c(){try{__CLR4_4_1lofloflgchorpg.R.inc(28848);
        __CLR4_4_1lofloflgchorpg.R.inc(28849);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28850);DateTime result = test.withChronology(GREGORIAN_PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28851);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28852);assertEquals(GREGORIAN_PARIS, result.getChronology());

        __CLR4_4_1lofloflgchorpg.R.inc(28853);test = new DateTime(TEST_TIME1, GREGORIAN_PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28854);result = test.withChronology(null);
        __CLR4_4_1lofloflgchorpg.R.inc(28855);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28856);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1lofloflgchorpg.R.inc(28857);test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28858);result = test.withChronology(null);
        __CLR4_4_1lofloflgchorpg.R.inc(28859);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28860);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1lofloflgchorpg.R.inc(28861);test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28862);result = test.withChronology(ISO_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(28863);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testWithZone_DateTimeZone() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t4wnc9m9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithZone_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t4wnc9m9s(){try{__CLR4_4_1lofloflgchorpg.R.inc(28864);
        __CLR4_4_1lofloflgchorpg.R.inc(28865);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28866);DateTime result = test.withZone(PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28867);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28868);assertEquals(ISO_PARIS, result.getChronology());

        __CLR4_4_1lofloflgchorpg.R.inc(28869);test = new DateTime(TEST_TIME1, GREGORIAN_PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28870);result = test.withZone(null);
        __CLR4_4_1lofloflgchorpg.R.inc(28871);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28872);assertEquals(GREGORIAN_DEFAULT, result.getChronology());

        __CLR4_4_1lofloflgchorpg.R.inc(28873);test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28874);result = test.withZone(null);
        __CLR4_4_1lofloflgchorpg.R.inc(28875);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    public void testWithZoneRetainFields_DateTimeZone() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15pa2s5ma4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithZoneRetainFields_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15pa2s5ma4(){try{__CLR4_4_1lofloflgchorpg.R.inc(28876);
        __CLR4_4_1lofloflgchorpg.R.inc(28877);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28878);DateTime result = test.withZoneRetainFields(PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28879);assertEquals(test.getMillis() - DateTimeConstants.MILLIS_PER_HOUR, result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28880);assertEquals(ISO_PARIS, result.getChronology());

        __CLR4_4_1lofloflgchorpg.R.inc(28881);test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28882);result = test.withZoneRetainFields(LONDON);
        __CLR4_4_1lofloflgchorpg.R.inc(28883);assertSame(test, result);

        __CLR4_4_1lofloflgchorpg.R.inc(28884);test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28885);result = test.withZoneRetainFields(null);
        __CLR4_4_1lofloflgchorpg.R.inc(28886);assertSame(test, result);

        __CLR4_4_1lofloflgchorpg.R.inc(28887);test = new DateTime(TEST_TIME1, GREGORIAN_PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28888);result = test.withZoneRetainFields(null);
        __CLR4_4_1lofloflgchorpg.R.inc(28889);assertEquals(test.getMillis() + DateTimeConstants.MILLIS_PER_HOUR, result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28890);assertEquals(GREGORIAN_DEFAULT, result.getChronology());

        __CLR4_4_1lofloflgchorpg.R.inc(28891);test = new DateTime(TEST_TIME1, new MockNullZoneChronology());
        __CLR4_4_1lofloflgchorpg.R.inc(28892);result = test.withZoneRetainFields(LONDON);
        __CLR4_4_1lofloflgchorpg.R.inc(28893);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithDate_int_int_int() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1343719mam();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDate_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1343719mam(){try{__CLR4_4_1lofloflgchorpg.R.inc(28894);
        __CLR4_4_1lofloflgchorpg.R.inc(28895);DateTime test = new DateTime(2002, 4, 5, 1, 2, 3, 4, ISO_UTC);
        __CLR4_4_1lofloflgchorpg.R.inc(28896);DateTime result = test.withDate(2003, 5, 6);
        __CLR4_4_1lofloflgchorpg.R.inc(28897);DateTime expected = new DateTime(2003, 5, 6, 1, 2, 3, 4, ISO_UTC);
        __CLR4_4_1lofloflgchorpg.R.inc(28898);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(28899);test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28900);try {
            __CLR4_4_1lofloflgchorpg.R.inc(28901);test.withDate(2003, 13, 1);
            __CLR4_4_1lofloflgchorpg.R.inc(28902);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testWithDate_int_int_int_toDST1() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sgzvufmav();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDate_int_int_int_toDST1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sgzvufmav(){try{__CLR4_4_1lofloflgchorpg.R.inc(28903);
        // 2010-03-28T02:55 is DST time, need to change to 03:55
        __CLR4_4_1lofloflgchorpg.R.inc(28904);DateTime test = new DateTime(2015, 1, 10, 2, 55, 0, 0, ISO_PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28905);DateTime result = test.withDate(2010, 3, 28);
        __CLR4_4_1lofloflgchorpg.R.inc(28906);DateTime expected = new DateTime(2010, 3, 28, 3, 55, 0, 0, ISO_PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28907);assertEquals(expected, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testWithDate_int_int_int_toDST2() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vpzumwmb0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDate_int_int_int_toDST2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vpzumwmb0(){try{__CLR4_4_1lofloflgchorpg.R.inc(28908);
        // 2010-03-28T02:55 is DST time, need to change to 03:55
        __CLR4_4_1lofloflgchorpg.R.inc(28909);DateTime test = new DateTime(2015, 1, 28, 2, 55, 0, 0, ISO_PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28910);DateTime result = test.withDate(2010, 3, 28);
        __CLR4_4_1lofloflgchorpg.R.inc(28911);DateTime expected = new DateTime(2010, 3, 28, 3, 55, 0, 0, ISO_PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28912);assertEquals(expected, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testWithDate_int_int_int_affectedByDST() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1705vvsmb5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDate_int_int_int_affectedByDST",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1705vvsmb5(){try{__CLR4_4_1lofloflgchorpg.R.inc(28913);
        // 2010-03-28T02:55 is DST time, need to avoid time being changed to 03:55
        __CLR4_4_1lofloflgchorpg.R.inc(28914);DateTime test = new DateTime(2015, 1, 28, 2, 55, 0, 0, ISO_PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28915);DateTime result = test.withDate(2010, 3, 10);
        __CLR4_4_1lofloflgchorpg.R.inc(28916);DateTime expected = new DateTime(2010, 3, 10, 2, 55, 0, 0, ISO_PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28917);assertEquals(expected, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testWithDate_LocalDate() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1akalgnmba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDate_LocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1akalgnmba(){try{__CLR4_4_1lofloflgchorpg.R.inc(28918);
        __CLR4_4_1lofloflgchorpg.R.inc(28919);DateTime test = new DateTime(2002, 4, 5, 1, 2, 3, 4, ISO_UTC);
        __CLR4_4_1lofloflgchorpg.R.inc(28920);DateTime result = test.withDate(new LocalDate(2003, 5, 6));
        __CLR4_4_1lofloflgchorpg.R.inc(28921);DateTime expected = new DateTime(2003, 5, 6, 1, 2, 3, 4, ISO_UTC);
        __CLR4_4_1lofloflgchorpg.R.inc(28922);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(28923);test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28924);try {
            __CLR4_4_1lofloflgchorpg.R.inc(28925);test.withDate(new LocalDate(2003, 13, 1));
            __CLR4_4_1lofloflgchorpg.R.inc(28926);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithTime_int_int_int_int() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uqicdwmbj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithTime_int_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uqicdwmbj(){try{__CLR4_4_1lofloflgchorpg.R.inc(28927);
        __CLR4_4_1lofloflgchorpg.R.inc(28928);DateTime test = new DateTime(TEST_TIME1 - 12345L, BUDDHIST_UTC);
        __CLR4_4_1lofloflgchorpg.R.inc(28929);DateTime result = test.withTime(12, 24, 0, 0);
        __CLR4_4_1lofloflgchorpg.R.inc(28930);assertEquals(TEST_TIME1, result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28931);assertEquals(BUDDHIST_UTC, result.getChronology());

        __CLR4_4_1lofloflgchorpg.R.inc(28932);test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28933);try {
            __CLR4_4_1lofloflgchorpg.R.inc(28934);test.withTime(25, 1, 1, 1);
            __CLR4_4_1lofloflgchorpg.R.inc(28935);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testWithTime_int_int_int_int_toDST() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aksr9lmbs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithTime_int_int_int_int_toDST",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aksr9lmbs(){try{__CLR4_4_1lofloflgchorpg.R.inc(28936);
        // 2010-03-28T02:55 is DST time, need to change to 03:55
        __CLR4_4_1lofloflgchorpg.R.inc(28937);DateTime test = new DateTime(2010, 3, 28, 0, 0, 0, 0, ISO_PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28938);DateTime result = test.withTime(2, 55, 0, 0);
        __CLR4_4_1lofloflgchorpg.R.inc(28939);DateTime expected = new DateTime(2010, 3, 28, 3, 55, 0, 0, ISO_PARIS);
        __CLR4_4_1lofloflgchorpg.R.inc(28940);assertEquals(expected, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testWithTime_LocalTime() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u3vyfvmbx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithTime_LocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28941,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u3vyfvmbx(){try{__CLR4_4_1lofloflgchorpg.R.inc(28941);
        __CLR4_4_1lofloflgchorpg.R.inc(28942);DateTime test = new DateTime(TEST_TIME1 - 12345L, BUDDHIST_UTC);
        __CLR4_4_1lofloflgchorpg.R.inc(28943);DateTime result = test.withTime(new LocalTime(12, 24, 0, 0));
        __CLR4_4_1lofloflgchorpg.R.inc(28944);assertEquals(TEST_TIME1, result.getMillis());
        __CLR4_4_1lofloflgchorpg.R.inc(28945);assertEquals(BUDDHIST_UTC, result.getChronology());

        __CLR4_4_1lofloflgchorpg.R.inc(28946);test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28947);try {
            __CLR4_4_1lofloflgchorpg.R.inc(28948);test.withTime(new LocalTime(25, 1, 1, 1));
            __CLR4_4_1lofloflgchorpg.R.inc(28949);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testWithTimeAtStartOfDay() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ywrxxamc6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithTimeAtStartOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ywrxxamc6(){try{__CLR4_4_1lofloflgchorpg.R.inc(28950);
        __CLR4_4_1lofloflgchorpg.R.inc(28951);DateTime test = new DateTime(2018, 10, 28, 0, 0, DateTimeZone.forID("Atlantic/Azores"));
        __CLR4_4_1lofloflgchorpg.R.inc(28952);DateTime result = test.withTimeAtStartOfDay();
        __CLR4_4_1lofloflgchorpg.R.inc(28953);assertEquals(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testWithFields_RPartial() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1812bvomca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFields_RPartial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1812bvomca(){try{__CLR4_4_1lofloflgchorpg.R.inc(28954);
        __CLR4_4_1lofloflgchorpg.R.inc(28955);DateTime test = new DateTime(2004, 5, 6, 7, 8, 9, 0);
        __CLR4_4_1lofloflgchorpg.R.inc(28956);DateTime result = test.withFields(new YearMonthDay(2003, 4, 5));
        __CLR4_4_1lofloflgchorpg.R.inc(28957);DateTime expected = new DateTime(2003, 4, 5, 7, 8, 9, 0);
        __CLR4_4_1lofloflgchorpg.R.inc(28958);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(28959);test = new DateTime(TEST_TIME1);
        __CLR4_4_1lofloflgchorpg.R.inc(28960);result = test.withFields(null);
        __CLR4_4_1lofloflgchorpg.R.inc(28961);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithField1() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lke16ymci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithField1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lke16ymci(){try{__CLR4_4_1lofloflgchorpg.R.inc(28962);
        __CLR4_4_1lofloflgchorpg.R.inc(28963);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1lofloflgchorpg.R.inc(28964);DateTime result = test.withField(DateTimeFieldType.year(), 2006);

        __CLR4_4_1lofloflgchorpg.R.inc(28965);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), test);
        __CLR4_4_1lofloflgchorpg.R.inc(28966);assertEquals(new DateTime(2006, 6, 9, 0, 0, 0, 0), result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testWithField2() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ibe2ehmcn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithField2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ibe2ehmcn(){try{__CLR4_4_1lofloflgchorpg.R.inc(28967);
        __CLR4_4_1lofloflgchorpg.R.inc(28968);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1lofloflgchorpg.R.inc(28969);try {
            __CLR4_4_1lofloflgchorpg.R.inc(28970);test.withField(null, 6);
            __CLR4_4_1lofloflgchorpg.R.inc(28971);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithFieldAdded1() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rgt22mcs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28972,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rgt22mcs(){try{__CLR4_4_1lofloflgchorpg.R.inc(28972);
        __CLR4_4_1lofloflgchorpg.R.inc(28973);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1lofloflgchorpg.R.inc(28974);DateTime result = test.withFieldAdded(DurationFieldType.years(), 6);

        __CLR4_4_1lofloflgchorpg.R.inc(28975);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), test);
        __CLR4_4_1lofloflgchorpg.R.inc(28976);assertEquals(new DateTime(2010, 6, 9, 0, 0, 0, 0), result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded2() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_150grujmcx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_150grujmcx(){try{__CLR4_4_1lofloflgchorpg.R.inc(28977);
        __CLR4_4_1lofloflgchorpg.R.inc(28978);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1lofloflgchorpg.R.inc(28979);try {
            __CLR4_4_1lofloflgchorpg.R.inc(28980);test.withFieldAdded(null, 0);
            __CLR4_4_1lofloflgchorpg.R.inc(28981);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded3() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189gqn0md2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189gqn0md2(){try{__CLR4_4_1lofloflgchorpg.R.inc(28982);
        __CLR4_4_1lofloflgchorpg.R.inc(28983);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1lofloflgchorpg.R.inc(28984);try {
            __CLR4_4_1lofloflgchorpg.R.inc(28985);test.withFieldAdded(null, 6);
            __CLR4_4_1lofloflgchorpg.R.inc(28986);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded4() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bigpfhmd7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bigpfhmd7(){try{__CLR4_4_1lofloflgchorpg.R.inc(28987);
        __CLR4_4_1lofloflgchorpg.R.inc(28988);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1lofloflgchorpg.R.inc(28989);DateTime result = test.withFieldAdded(DurationFieldType.years(), 0);
        __CLR4_4_1lofloflgchorpg.R.inc(28990);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithDurationAdded_long_int() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),28991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q11w3imdb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDurationAdded_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28991,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q11w3imdb(){try{__CLR4_4_1lofloflgchorpg.R.inc(28991);
        __CLR4_4_1lofloflgchorpg.R.inc(28992);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(28993);DateTime result = test.withDurationAdded(123456789L, 1);
        __CLR4_4_1lofloflgchorpg.R.inc(28994);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(28995);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(28996);result = test.withDurationAdded(123456789L, 0);
        __CLR4_4_1lofloflgchorpg.R.inc(28997);assertSame(test, result);

        __CLR4_4_1lofloflgchorpg.R.inc(28998);result = test.withDurationAdded(123456789L, 2);
        __CLR4_4_1lofloflgchorpg.R.inc(28999);expected = new DateTime(TEST_TIME1 + (2L * 123456789L), BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29000);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29001);result = test.withDurationAdded(123456789L, -3);
        __CLR4_4_1lofloflgchorpg.R.inc(29002);expected = new DateTime(TEST_TIME1 - (3L * 123456789L), BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29003);assertEquals(expected, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithDurationAdded_RD_int() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hcnxxomdo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDurationAdded_RD_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hcnxxomdo(){try{__CLR4_4_1lofloflgchorpg.R.inc(29004);
        __CLR4_4_1lofloflgchorpg.R.inc(29005);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29006);DateTime result = test.withDurationAdded(new Duration(123456789L), 1);
        __CLR4_4_1lofloflgchorpg.R.inc(29007);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29008);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29009);result = test.withDurationAdded(null, 1);
        __CLR4_4_1lofloflgchorpg.R.inc(29010);assertSame(test, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29011);result = test.withDurationAdded(new Duration(123456789L), 0);
        __CLR4_4_1lofloflgchorpg.R.inc(29012);assertSame(test, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29013);result = test.withDurationAdded(new Duration(123456789L), 2);
        __CLR4_4_1lofloflgchorpg.R.inc(29014);expected = new DateTime(TEST_TIME1 + (2L * 123456789L), BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29015);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29016);result = test.withDurationAdded(new Duration(123456789L), -3);
        __CLR4_4_1lofloflgchorpg.R.inc(29017);expected = new DateTime(TEST_TIME1 - (3L * 123456789L), BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29018);assertEquals(expected, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithDurationAdded_RP_int() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1by6igwme3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDurationAdded_RP_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29019,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1by6igwme3(){try{__CLR4_4_1lofloflgchorpg.R.inc(29019);
        __CLR4_4_1lofloflgchorpg.R.inc(29020);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29021);DateTime result = test.withPeriodAdded(new Period(1, 2, 3, 4, 5, 6, 7, 8), 1);
        __CLR4_4_1lofloflgchorpg.R.inc(29022);DateTime expected = new DateTime(2003, 7, 28, 6, 8, 10, 12, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29023);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29024);result = test.withPeriodAdded(null, 1);
        __CLR4_4_1lofloflgchorpg.R.inc(29025);assertSame(test, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29026);result = test.withPeriodAdded(new Period(1, 2, 3, 4, 5, 6, 7, 8), 0);
        __CLR4_4_1lofloflgchorpg.R.inc(29027);assertSame(test, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29028);result = test.withPeriodAdded(new Period(1, 2, 0, 4, 5, 6, 7, 8), 3);
        __CLR4_4_1lofloflgchorpg.R.inc(29029);expected = new DateTime(2005, 11, 15, 16, 20, 24, 28, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29030);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29031);result = test.withPeriodAdded(new Period(1, 2, 0, 1, 1, 2, 3, 4), -1);
        __CLR4_4_1lofloflgchorpg.R.inc(29032);expected = new DateTime(2001, 3, 2, 0, 0, 0, 0, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29033);assertEquals(expected, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------    
    @Test
    public void testPlus_long() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dfcommei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlus_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dfcommei(){try{__CLR4_4_1lofloflgchorpg.R.inc(29034);
        __CLR4_4_1lofloflgchorpg.R.inc(29035);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29036);DateTime result = test.plus(123456789L);
        __CLR4_4_1lofloflgchorpg.R.inc(29037);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29038);assertEquals(expected, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testPlus_RD() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_121wcz0men();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlus_RD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_121wcz0men(){try{__CLR4_4_1lofloflgchorpg.R.inc(29039);
        __CLR4_4_1lofloflgchorpg.R.inc(29040);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29041);DateTime result = test.plus(new Duration(123456789L));
        __CLR4_4_1lofloflgchorpg.R.inc(29042);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29043);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29044);result = test.plus((ReadableDuration) null);
        __CLR4_4_1lofloflgchorpg.R.inc(29045);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testPlus_RP() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz83igmeu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29046,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz83igmeu(){try{__CLR4_4_1lofloflgchorpg.R.inc(29046);
        __CLR4_4_1lofloflgchorpg.R.inc(29047);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29048);DateTime result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        __CLR4_4_1lofloflgchorpg.R.inc(29049);DateTime expected = new DateTime(2003, 7, 28, 6, 8, 10, 12, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29050);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29051);result = test.plus((ReadablePeriod) null);
        __CLR4_4_1lofloflgchorpg.R.inc(29052);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testPlusYears_int() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mx5kptmf1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29053,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mx5kptmf1(){try{__CLR4_4_1lofloflgchorpg.R.inc(29053);
        __CLR4_4_1lofloflgchorpg.R.inc(29054);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29055);DateTime result = test.plusYears(1);
        __CLR4_4_1lofloflgchorpg.R.inc(29056);DateTime expected = new DateTime(2003, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29057);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29058);result = test.plusYears(0);
        __CLR4_4_1lofloflgchorpg.R.inc(29059);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testPlusMonths_int() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170gxaimf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170gxaimf8(){try{__CLR4_4_1lofloflgchorpg.R.inc(29060);
        __CLR4_4_1lofloflgchorpg.R.inc(29061);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29062);DateTime result = test.plusMonths(1);
        __CLR4_4_1lofloflgchorpg.R.inc(29063);DateTime expected = new DateTime(2002, 6, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29064);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29065);result = test.plusMonths(0);
        __CLR4_4_1lofloflgchorpg.R.inc(29066);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testPlusMonths_intMax() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15x38ucmff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMonths_intMax",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15x38ucmff(){try{__CLR4_4_1lofloflgchorpg.R.inc(29067);
        __CLR4_4_1lofloflgchorpg.R.inc(29068);DateTime test = new DateTime(2016, 2, 20, 1, 2, 3, 4, ISO_UTC);
        __CLR4_4_1lofloflgchorpg.R.inc(29069);assertEquals(new DateTime(178958986, 7, 20, 1, 2, 3, 4, ISO_UTC), test.plusMonths(Integer.MAX_VALUE - 2));
        __CLR4_4_1lofloflgchorpg.R.inc(29070);assertEquals(new DateTime(178958986, 8, 20, 1, 2, 3, 4, ISO_UTC), test.plusMonths(Integer.MAX_VALUE - 1));
        __CLR4_4_1lofloflgchorpg.R.inc(29071);assertEquals(new DateTime(178958986, 9, 20, 1, 2, 3, 4, ISO_UTC), test.plusMonths(Integer.MAX_VALUE));

        __CLR4_4_1lofloflgchorpg.R.inc(29072);assertEquals(new DateTime(178958986, 7, 20, 1, 2, 3, 4, ISO_UTC), test.monthOfYear().addToCopy(Integer.MAX_VALUE - 2));
        __CLR4_4_1lofloflgchorpg.R.inc(29073);assertEquals(new DateTime(178958986, 8, 20, 1, 2, 3, 4, ISO_UTC), test.monthOfYear().addToCopy(Integer.MAX_VALUE - 1));
        __CLR4_4_1lofloflgchorpg.R.inc(29074);assertEquals(new DateTime(178958986, 9, 20, 1, 2, 3, 4, ISO_UTC), test.monthOfYear().addToCopy(Integer.MAX_VALUE));
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testPlusMonths_intMin() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1drjuc6mfn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMonths_intMin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1drjuc6mfn(){try{__CLR4_4_1lofloflgchorpg.R.inc(29075);
        __CLR4_4_1lofloflgchorpg.R.inc(29076);DateTime test = new DateTime(2016, 2, 20, 1, 2, 3, 4, ISO_UTC);
        __CLR4_4_1lofloflgchorpg.R.inc(29077);assertEquals(new DateTime(-178954955, 8, 20, 1, 2, 3, 4, ISO_UTC), test.plusMonths(Integer.MIN_VALUE + 2));
        __CLR4_4_1lofloflgchorpg.R.inc(29078);assertEquals(new DateTime(-178954955, 7, 20, 1, 2, 3, 4, ISO_UTC), test.plusMonths(Integer.MIN_VALUE + 1));
        __CLR4_4_1lofloflgchorpg.R.inc(29079);assertEquals(new DateTime(-178954955, 6, 20, 1, 2, 3, 4, ISO_UTC), test.plusMonths(Integer.MIN_VALUE));

        __CLR4_4_1lofloflgchorpg.R.inc(29080);assertEquals(new DateTime(-178954955, 8, 20, 1, 2, 3, 4, ISO_UTC), test.monthOfYear().addToCopy(Integer.MIN_VALUE + 2));
        __CLR4_4_1lofloflgchorpg.R.inc(29081);assertEquals(new DateTime(-178954955, 7, 20, 1, 2, 3, 4, ISO_UTC), test.monthOfYear().addToCopy(Integer.MIN_VALUE + 1));
        __CLR4_4_1lofloflgchorpg.R.inc(29082);assertEquals(new DateTime(-178954955, 6, 20, 1, 2, 3, 4, ISO_UTC), test.monthOfYear().addToCopy(Integer.MIN_VALUE));
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testPlusWeeks_int() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eupheemfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusWeeks_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eupheemfv(){try{__CLR4_4_1lofloflgchorpg.R.inc(29083);
        __CLR4_4_1lofloflgchorpg.R.inc(29084);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29085);DateTime result = test.plusWeeks(1);
        __CLR4_4_1lofloflgchorpg.R.inc(29086);DateTime expected = new DateTime(2002, 5, 10, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29087);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29088);result = test.plusWeeks(0);
        __CLR4_4_1lofloflgchorpg.R.inc(29089);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testPlusDays_int() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpmvkqmg2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpmvkqmg2(){try{__CLR4_4_1lofloflgchorpg.R.inc(29090);
        __CLR4_4_1lofloflgchorpg.R.inc(29091);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29092);DateTime result = test.plusDays(1);
        __CLR4_4_1lofloflgchorpg.R.inc(29093);DateTime expected = new DateTime(2002, 5, 4, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29094);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29095);result = test.plusDays(0);
        __CLR4_4_1lofloflgchorpg.R.inc(29096);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testPlusHours_int() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s87b5ymg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusHours_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s87b5ymg9(){try{__CLR4_4_1lofloflgchorpg.R.inc(29097);
        __CLR4_4_1lofloflgchorpg.R.inc(29098);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29099);DateTime result = test.plusHours(1);
        __CLR4_4_1lofloflgchorpg.R.inc(29100);DateTime expected = new DateTime(2002, 5, 3, 2, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29101);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29102);result = test.plusHours(0);
        __CLR4_4_1lofloflgchorpg.R.inc(29103);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testPlusMinutes_int() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k0mjqumgg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMinutes_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k0mjqumgg(){try{__CLR4_4_1lofloflgchorpg.R.inc(29104);
        __CLR4_4_1lofloflgchorpg.R.inc(29105);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29106);DateTime result = test.plusMinutes(1);
        __CLR4_4_1lofloflgchorpg.R.inc(29107);DateTime expected = new DateTime(2002, 5, 3, 1, 3, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29108);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29109);result = test.plusMinutes(0);
        __CLR4_4_1lofloflgchorpg.R.inc(29110);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testPlusSeconds_int() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xx4lremgn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusSeconds_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xx4lremgn(){try{__CLR4_4_1lofloflgchorpg.R.inc(29111);
        __CLR4_4_1lofloflgchorpg.R.inc(29112);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29113);DateTime result = test.plusSeconds(1);
        __CLR4_4_1lofloflgchorpg.R.inc(29114);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 4, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29115);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29116);result = test.plusSeconds(0);
        __CLR4_4_1lofloflgchorpg.R.inc(29117);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testPlusMillis_int() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1blt447mgu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1blt447mgu(){try{__CLR4_4_1lofloflgchorpg.R.inc(29118);
        __CLR4_4_1lofloflgchorpg.R.inc(29119);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29120);DateTime result = test.plusMillis(1);
        __CLR4_4_1lofloflgchorpg.R.inc(29121);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 3, 5, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29122);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29123);result = test.plusMillis(0);
        __CLR4_4_1lofloflgchorpg.R.inc(29124);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------    
    @Test
    public void testMinus_long() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gse7d0mh1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinus_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gse7d0mh1(){try{__CLR4_4_1lofloflgchorpg.R.inc(29125);
        __CLR4_4_1lofloflgchorpg.R.inc(29126);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29127);DateTime result = test.minus(123456789L);
        __CLR4_4_1lofloflgchorpg.R.inc(29128);DateTime expected = new DateTime(TEST_TIME1 - 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29129);assertEquals(expected, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testMinus_RD() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uyrr3umh6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinus_RD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uyrr3umh6(){try{__CLR4_4_1lofloflgchorpg.R.inc(29130);
        __CLR4_4_1lofloflgchorpg.R.inc(29131);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29132);DateTime result = test.minus(new Duration(123456789L));
        __CLR4_4_1lofloflgchorpg.R.inc(29133);DateTime expected = new DateTime(TEST_TIME1 - 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29134);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29135);result = test.minus((ReadableDuration) null);
        __CLR4_4_1lofloflgchorpg.R.inc(29136);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testMinus_RP() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112cpdmmhd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112cpdmmhd(){try{__CLR4_4_1lofloflgchorpg.R.inc(29137);
        __CLR4_4_1lofloflgchorpg.R.inc(29138);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29139);DateTime result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        __CLR4_4_1lofloflgchorpg.R.inc(29140);DateTime expected = new DateTime(2001, 3, 26, 0, 1, 2, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29141);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29142);result = test.minus((ReadablePeriod) null);
        __CLR4_4_1lofloflgchorpg.R.inc(29143);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testMinusYears_int() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9qdinmhk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29144,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9qdinmhk(){try{__CLR4_4_1lofloflgchorpg.R.inc(29144);
        __CLR4_4_1lofloflgchorpg.R.inc(29145);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29146);DateTime result = test.minusYears(1);
        __CLR4_4_1lofloflgchorpg.R.inc(29147);DateTime expected = new DateTime(2001, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29148);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29149);result = test.minusYears(0);
        __CLR4_4_1lofloflgchorpg.R.inc(29150);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testMinusMonths_int() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6k4gomhr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29151,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6k4gomhr(){try{__CLR4_4_1lofloflgchorpg.R.inc(29151);
        __CLR4_4_1lofloflgchorpg.R.inc(29152);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29153);DateTime result = test.minusMonths(1);
        __CLR4_4_1lofloflgchorpg.R.inc(29154);DateTime expected = new DateTime(2002, 4, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29155);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29156);result = test.minusMonths(0);
        __CLR4_4_1lofloflgchorpg.R.inc(29157);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testMinusMonths_intMax() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e6qjsmmhy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMonths_intMax",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e6qjsmmhy(){try{__CLR4_4_1lofloflgchorpg.R.inc(29158);
        __CLR4_4_1lofloflgchorpg.R.inc(29159);DateTime test = new DateTime(2016, 2, 20, 1, 2, 3, 4, ISO_UTC);
        __CLR4_4_1lofloflgchorpg.R.inc(29160);assertEquals(new DateTime(-178954955, 9, 20, 1, 2, 3, 4, ISO_UTC), test.minusMonths(Integer.MAX_VALUE - 2));
        __CLR4_4_1lofloflgchorpg.R.inc(29161);assertEquals(new DateTime(-178954955, 8, 20, 1, 2, 3, 4, ISO_UTC), test.minusMonths(Integer.MAX_VALUE - 1));
        __CLR4_4_1lofloflgchorpg.R.inc(29162);assertEquals(new DateTime(-178954955, 7, 20, 1, 2, 3, 4, ISO_UTC), test.minusMonths(Integer.MAX_VALUE));
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testMinusMonths_intMin() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m175agmi3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMonths_intMin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29163,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m175agmi3(){try{__CLR4_4_1lofloflgchorpg.R.inc(29163);
        __CLR4_4_1lofloflgchorpg.R.inc(29164);DateTime test = new DateTime(2016, 2, 20, 1, 2, 3, 4, ISO_UTC);
        __CLR4_4_1lofloflgchorpg.R.inc(29165);assertEquals(new DateTime(178958986, 8, 20, 1, 2, 3, 4, ISO_UTC), test.minusMonths(Integer.MIN_VALUE + 2));
        __CLR4_4_1lofloflgchorpg.R.inc(29166);assertEquals(new DateTime(178958986, 9, 20, 1, 2, 3, 4, ISO_UTC), test.minusMonths(Integer.MIN_VALUE + 1));
        __CLR4_4_1lofloflgchorpg.R.inc(29167);assertEquals(new DateTime(178958986, 10, 20, 1, 2, 3, 4, ISO_UTC), test.minusMonths(Integer.MIN_VALUE));
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testMinusWeeks_int() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fi4olkmi8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusWeeks_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fi4olkmi8(){try{__CLR4_4_1lofloflgchorpg.R.inc(29168);
        __CLR4_4_1lofloflgchorpg.R.inc(29169);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29170);DateTime result = test.minusWeeks(1);
        __CLR4_4_1lofloflgchorpg.R.inc(29171);DateTime expected = new DateTime(2002, 4, 26, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29172);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29173);result = test.minusWeeks(0);
        __CLR4_4_1lofloflgchorpg.R.inc(29174);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testMinusDays_int() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hpufckmif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hpufckmif(){try{__CLR4_4_1lofloflgchorpg.R.inc(29175);
        __CLR4_4_1lofloflgchorpg.R.inc(29176);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29177);DateTime result = test.minusDays(1);
        __CLR4_4_1lofloflgchorpg.R.inc(29178);DateTime expected = new DateTime(2002, 5, 2, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29179);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29180);result = test.minusDays(0);
        __CLR4_4_1lofloflgchorpg.R.inc(29181);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testMinusHours_int() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svmid4mim();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusHours_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svmid4mim(){try{__CLR4_4_1lofloflgchorpg.R.inc(29182);
        __CLR4_4_1lofloflgchorpg.R.inc(29183);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29184);DateTime result = test.minusHours(1);
        __CLR4_4_1lofloflgchorpg.R.inc(29185);DateTime expected = new DateTime(2002, 5, 3, 0, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29186);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29187);result = test.minusHours(0);
        __CLR4_4_1lofloflgchorpg.R.inc(29188);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testMinusMinutes_int() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15zd8a0mit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMinutes_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15zd8a0mit(){try{__CLR4_4_1lofloflgchorpg.R.inc(29189);
        __CLR4_4_1lofloflgchorpg.R.inc(29190);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29191);DateTime result = test.minusMinutes(1);
        __CLR4_4_1lofloflgchorpg.R.inc(29192);DateTime expected = new DateTime(2002, 5, 3, 1, 1, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29193);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29194);result = test.minusMinutes(0);
        __CLR4_4_1lofloflgchorpg.R.inc(29195);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testMinusSeconds_int() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n2q4qwmj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusSeconds_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n2q4qwmj0(){try{__CLR4_4_1lofloflgchorpg.R.inc(29196);
        __CLR4_4_1lofloflgchorpg.R.inc(29197);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29198);DateTime result = test.minusSeconds(1);
        __CLR4_4_1lofloflgchorpg.R.inc(29199);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 2, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29200);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29201);result = test.minusSeconds(0);
        __CLR4_4_1lofloflgchorpg.R.inc(29202);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    @Test
    public void testMinusMillis_int() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vrwbadmj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vrwbadmj7(){try{__CLR4_4_1lofloflgchorpg.R.inc(29203);
        __CLR4_4_1lofloflgchorpg.R.inc(29204);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29205);DateTime result = test.minusMillis(1);
        __CLR4_4_1lofloflgchorpg.R.inc(29206);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 3, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1lofloflgchorpg.R.inc(29207);assertEquals(expected, result);

        __CLR4_4_1lofloflgchorpg.R.inc(29208);result = test.minusMillis(0);
        __CLR4_4_1lofloflgchorpg.R.inc(29209);assertSame(test, result);
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testProperty() {__CLR4_4_1lofloflgchorpg.R.globalSliceStart(getClass().getName(),29210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7neoimje();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lofloflgchorpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lofloflgchorpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7neoimje(){try{__CLR4_4_1lofloflgchorpg.R.inc(29210);
        __CLR4_4_1lofloflgchorpg.R.inc(29211);DateTime test = new DateTime();
        __CLR4_4_1lofloflgchorpg.R.inc(29212);assertEquals(test.year(), test.property(DateTimeFieldType.year()));
        __CLR4_4_1lofloflgchorpg.R.inc(29213);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1lofloflgchorpg.R.inc(29214);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1lofloflgchorpg.R.inc(29215);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1lofloflgchorpg.R.inc(29216);DateTimeFieldType bad = new DateTimeFieldType("bad") {
            private static final long serialVersionUID = 1L;

            public DurationFieldType getDurationType() {try{__CLR4_4_1lofloflgchorpg.R.inc(29217);
                __CLR4_4_1lofloflgchorpg.R.inc(29218);return DurationFieldType.weeks();
            }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

            public DurationFieldType getRangeDurationType() {try{__CLR4_4_1lofloflgchorpg.R.inc(29219);
                __CLR4_4_1lofloflgchorpg.R.inc(29220);return null;
            }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

            public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1lofloflgchorpg.R.inc(29221);
                __CLR4_4_1lofloflgchorpg.R.inc(29222);return UnsupportedDateTimeField.getInstance(this, UnsupportedDurationField.getInstance(getDurationType()));
            }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}
        };
        __CLR4_4_1lofloflgchorpg.R.inc(29223);try {
            __CLR4_4_1lofloflgchorpg.R.inc(29224);test.property(bad);
            __CLR4_4_1lofloflgchorpg.R.inc(29225);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1lofloflgchorpg.R.inc(29226);try {
            __CLR4_4_1lofloflgchorpg.R.inc(29227);test.property(null);
            __CLR4_4_1lofloflgchorpg.R.inc(29228);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(DateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1lofloflgchorpg.R.inc(29229);
        __CLR4_4_1lofloflgchorpg.R.inc(29230);assertEquals(year, test.getYear());
        __CLR4_4_1lofloflgchorpg.R.inc(29231);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1lofloflgchorpg.R.inc(29232);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1lofloflgchorpg.R.inc(29233);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1lofloflgchorpg.R.inc(29234);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1lofloflgchorpg.R.inc(29235);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1lofloflgchorpg.R.inc(29236);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1lofloflgchorpg.R.flushNeeded();}}

}
