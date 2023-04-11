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
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDate.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDate_Basics {static class __CLR4_4_1t9dt9dlgchos13{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,38886,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    //private static final int OFFSET = 1;
    private static final GJChronology GJ_UTC = GJChronology.getInstanceUTC();
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    //private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
    private static final Chronology ISO_NEW_YORK = ISOChronology.getInstance(NEW_YORK);
    //private static final Chronology ISO_TOKYO = ISOChronology.getInstance(TOKYO);
    //private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    //private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();

    /**
     * Mock zone simulating Asia/Gaza cutover at midnight 2007-04-01
     */
    private static long CUTOVER_GAZA = 1175378400000L;
    private static int OFFSET_GAZA = 7200000;  // +02:00
    private static final DateTimeZone MOCK_GAZA = new MockZone(CUTOVER_GAZA, OFFSET_GAZA, 3600);

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

//    private long TEST_TIME1 =
//        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 12L * DateTimeConstants.MILLIS_PER_HOUR
//        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//        
//    private long TEST_TIME2 =
//        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 14L * DateTimeConstants.MILLIS_PER_HOUR
//        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_1t9dt9dlgchos13.R.inc(37921);
        __CLR4_4_1t9dt9dlgchos13.R.inc(37922);TestLocalDate_Basics TB = new TestLocalDate_Basics();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37923);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37924);TB.testGet_DateTimeFieldType();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37925);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37926);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37927);TB.testSize();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37928);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37929);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37930);TB.testGetFieldType_int();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37931);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37932);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37933);TB.testGetFieldTypes();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37934);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37935);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37936);TB.testGetField_int();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37937);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37938);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37939);TB.testGetFields();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37940);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37941);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37942);TB.testGetValue_int();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37943);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37944);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37945);TB.testGetValues();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37946);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37947);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37948);TB.testIsSupported_DateTimeFieldType();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37949);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37950);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37951);TB.testIsSupported_DurationFieldType();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37952);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37953);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37954);TB.testEqualsHashCode();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37955);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37956);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37957);TB.testEqualsHashCodeLenient();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37958);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37959);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37960);TB.testEqualsHashCodeStrict();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37961);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37962);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37963);TB.testEqualsHashCodeAPI();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37964);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37965);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37966);TB.testCompareTo();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37967);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37968);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37969);TB.testIsEqual_LocalDate();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37970);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37971);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37972);TB.testIsBefore_LocalDate();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37973);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37974);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37975);TB.testIsAfter_LocalDate();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37976);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37977);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37978);TB.testWithField_DateTimeFieldType_int_1();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37979);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37980);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37981);TB.testWithField_DateTimeFieldType_int_2();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37982);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37983);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37984);TB.testWithField_DateTimeFieldType_int_3();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37985);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37986);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37987);TB.testWithField_DateTimeFieldType_int_4();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37988);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37989);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37990);TB.testWithFieldAdded_DurationFieldType_int_1();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37991);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37992);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37993);TB.testWithFieldAdded_DurationFieldType_int_2();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37994);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37995);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37996);TB.testWithFieldAdded_DurationFieldType_int_3();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37997);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37998);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(37999);TB.testWithFieldAdded_DurationFieldType_int_4();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38000);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38001);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38002);TB.testWithFieldAdded_DurationFieldType_int_5();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38003);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38004);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38005);TB.testPlus_RP();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38006);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38007);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38008);TB.testPlusYears_int();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38009);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38010);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38011);TB.testPlusMonths_int();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38012);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38013);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38014);TB.testPlusWeeks_int();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38015);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38016);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38017);TB.testPlusDays_int();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38018);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38019);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38020);TB.testMinus_RP();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38021);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38022);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38023);TB.testMinusYears_int();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38024);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38025);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38026);TB.testMinusMonths_int();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38027);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38028);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38029);TB.testMinusWeeks_int();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38030);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38031);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38032);TB.testMinusDays_int();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38033);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38034);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38035);TB.testGetters();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38036);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38037);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38038);TB.testWithers();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38039);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38040);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38041);TB.testToDateTimeAtStartOfDay();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38042);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38043);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38044);TB.testToDateTimeAtStartOfDay_avoidDST();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38045);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38046);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38047);TB.testToDateTimeAtStartOfDay_handleMidnightDST();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38048);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38049);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38050);TB.testToDateTimeAtStartOfDay_Zone();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38051);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38052);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38053);TB.testToDateTimeAtStartOfDay_Zone_avoidDST();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38054);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38055);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38056);TB.testToDateTimeAtStartOfDay_nullZone();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38057);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38058);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38059);TB.testToDateTimeAtMidnight();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38060);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38061);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38062);TB.testToDateTimeAtMidnight_Zone();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38063);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38064);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38065);TB.testToDateTimeAtMidnight_nullZone();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38066);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38067);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38068);TB.testToDateTimeAtCurrentTime();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38069);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38070);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38071);TB.testToDateTimeAtCurrentTime_Zone();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38072);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38073);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38074);TB.testToDateTimeAtCurrentTime_nullZone();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38075);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38076);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38077);TB.testToLocalDateTime_LocalTime();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38078);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38079);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38080);TB.testToLocalDateTime_nullLocalTime();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38081);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38082);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38083);TB.testToLocalDateTime_wrongChronologyLocalTime();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38084);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38085);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38086);TB.testToDateTime_LocalTime();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38087);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38088);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38089);TB.testToDateTime_nullLocalTime();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38090);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38091);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38092);TB.testToDateTime_LocalTime_Zone();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38093);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38094);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38095);TB.testToDateTime_LocalTime_nullZone();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38096);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38097);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38098);TB.testToDateTime_nullLocalTime_Zone();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38099);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38100);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38101);TB.testToDateTime_LocalTime_Zone_dstGap();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38102);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38103);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38104);TB.testToDateTime_LocalTime_Zone_dstOverlap();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38105);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38106);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38107);TB.testToDateTime_LocalTime_Zone_dstOverlap_NewYork();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38108);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38109);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38110);TB.testToDateTime_wrongChronoLocalTime_Zone();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38111);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38112);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38113);TB.testToDateMidnight();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38114);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38115);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38116);TB.testToDateMidnight_Zone();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38117);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38118);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38119);TB.testToDateMidnight_nullZone();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38120);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38121);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38122);TB.testToDateTime_RI();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38123);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38124);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38125);TB.testToDateTime_nullRI();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38126);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38127);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38128);TB.testToInterval();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38129);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38130);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38131);TB.testToInterval_Zone();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38132);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38133);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38134);TB.testToInterval_Zone_noMidnight();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38135);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38136);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38137);TB.testToInterval_nullZone();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38138);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38139);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38140);TB.testToDate_summer();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38141);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38142);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38143);TB.testToDate_winter();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38144);TB.tearDown();
        //TB.setUp(); TB.testToDate_springDST(); TB.tearDown(); //Method code too large!
        //TB.setUp(); TB.testToDate_springDST_2Hour40Savings(); TB.tearDown(); //Method code too large!
        //TB.setUp(); TB.testToDate_autumnDST(); TB.tearDown(); //Method code too large!
        __CLR4_4_1t9dt9dlgchos13.R.inc(38145);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38146);TB.testProperty();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38147);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38148);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38149);TB.testSerialization();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38150);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38151);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38152);TB.testToString();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38153);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38154);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38155);TB.testToString_String();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38156);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38157);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38158);TB.testToString_String_Locale();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38159);TB.tearDown();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38160);TB.setUp();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38161);TB.testToString_DTFormatter();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38162);TB.tearDown();

    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestLocalDate_Basics.class);
    }

    public TestLocalDate_Basics(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1t9dt9dlgchos13.R.inc(38163);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38164);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38165);zone = DateTimeZone.getDefault();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38166);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38167);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38168);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1t9dt9dlgchos13.R.inc(38169);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38170);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38171);DateTimeZone.setDefault(zone);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38172);zone = null;
        __CLR4_4_1t9dt9dlgchos13.R.inc(38173);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38174);systemDefaultLocale = null;
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGet_DateTimeFieldType() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyir3vtgf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGet_DateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyir3vtgf(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38175);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38176);LocalDate test = new LocalDate();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38177);assertEquals(1970, test.get(DateTimeFieldType.year()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38178);assertEquals(6, test.get(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38179);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38180);assertEquals(2, test.get(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38181);assertEquals(160, test.get(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38182);assertEquals(24, test.get(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38183);assertEquals(1970, test.get(DateTimeFieldType.weekyear()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38184);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38185);test.get(null);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38186);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1t9dt9dlgchos13.R.inc(38187);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38188);test.get(DateTimeFieldType.hourOfDay());
            __CLR4_4_1t9dt9dlgchos13.R.inc(38189);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testSize() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xx122tgu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xx122tgu(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38190);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38191);LocalDate test = new LocalDate();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38192);assertEquals(3, test.size());
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testGetFieldType_int() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v547gntgx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetFieldType_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38193,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v547gntgx(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38193);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38194);LocalDate test = new LocalDate(COPTIC_PARIS);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38195);assertSame(DateTimeFieldType.year(), test.getFieldType(0));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38196);assertSame(DateTimeFieldType.monthOfYear(), test.getFieldType(1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38197);assertSame(DateTimeFieldType.dayOfMonth(), test.getFieldType(2));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38198);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38199);test.getFieldType(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_1t9dt9dlgchos13.R.inc(38200);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38201);test.getFieldType(3);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testGetFieldTypes() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5ndvuth6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetFieldTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5ndvuth6(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38202);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38203);LocalDate test = new LocalDate(COPTIC_PARIS);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38204);DateTimeFieldType[] fields = test.getFieldTypes();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38205);assertSame(DateTimeFieldType.year(), fields[0]);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38206);assertSame(DateTimeFieldType.monthOfYear(), fields[1]);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38207);assertSame(DateTimeFieldType.dayOfMonth(), fields[2]);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38208);assertNotSame(test.getFieldTypes(), test.getFieldTypes());
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testGetField_int() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1esjyjxthd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetField_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38209,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1esjyjxthd(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38209);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38210);LocalDate test = new LocalDate(COPTIC_PARIS);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38211);assertSame(COPTIC_UTC.year(), test.getField(0));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38212);assertSame(COPTIC_UTC.monthOfYear(), test.getField(1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38213);assertSame(COPTIC_UTC.dayOfMonth(), test.getField(2));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38214);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38215);test.getField(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_1t9dt9dlgchos13.R.inc(38216);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38217);test.getField(3);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testGetFields() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmeasthm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmeasthm(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38218);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38219);LocalDate test = new LocalDate(COPTIC_PARIS);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38220);DateTimeField[] fields = test.getFields();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38221);assertSame(COPTIC_UTC.year(), fields[0]);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38222);assertSame(COPTIC_UTC.monthOfYear(), fields[1]);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38223);assertSame(COPTIC_UTC.dayOfMonth(), fields[2]);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38224);assertNotSame(test.getFields(), test.getFields());
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testGetValue_int() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gmp610tht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetValue_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gmp610tht(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38225);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38226);LocalDate test = new LocalDate();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38227);assertEquals(1970, test.getValue(0));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38228);assertEquals(6, test.getValue(1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38229);assertEquals(9, test.getValue(2));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38230);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38231);test.getValue(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_1t9dt9dlgchos13.R.inc(38232);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38233);test.getValue(3);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testGetValues() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gduelti2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gduelti2(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38234);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38235);LocalDate test = new LocalDate();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38236);int[] values = test.getValues();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38237);assertEquals(1970, values[0]);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38238);assertEquals(6, values[1]);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38239);assertEquals(9, values[2]);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38240);assertNotSame(test.getValues(), test.getValues());
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testIsSupported_DateTimeFieldType() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iyuedvti9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsSupported_DateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iyuedvti9(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38241);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38242);LocalDate test = new LocalDate(COPTIC_PARIS);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38243);assertEquals(true, test.isSupported(DateTimeFieldType.year()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38244);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38245);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38246);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38247);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38248);assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38249);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38250);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38251);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38252);assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38253);assertEquals(true, test.isSupported(DateTimeFieldType.weekyearOfCentury()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38254);assertEquals(true, test.isSupported(DateTimeFieldType.era()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38255);assertEquals(false, test.isSupported(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38256);assertEquals(false, test.isSupported((DateTimeFieldType) null));
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testIsSupported_DurationFieldType() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3fm3etip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsSupported_DurationFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38257,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3fm3etip(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38257);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38258);LocalDate test = new LocalDate(1970, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38259);assertEquals(false, test.isSupported(DurationFieldType.eras()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38260);assertEquals(true, test.isSupported(DurationFieldType.centuries()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38261);assertEquals(true, test.isSupported(DurationFieldType.years()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38262);assertEquals(true, test.isSupported(DurationFieldType.months()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38263);assertEquals(true, test.isSupported(DurationFieldType.weekyears()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38264);assertEquals(true, test.isSupported(DurationFieldType.weeks()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38265);assertEquals(true, test.isSupported(DurationFieldType.days()));

        __CLR4_4_1t9dt9dlgchos13.R.inc(38266);assertEquals(false, test.isSupported(DurationFieldType.hours()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38267);assertEquals(false, test.isSupported((DurationFieldType) null));
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testEqualsHashCode() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77tj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38268,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77tj0(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38268);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38269);LocalDate test1 = new LocalDate(1970, 6, 9, COPTIC_PARIS);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38270);LocalDate test2 = new LocalDate(1970, 6, 9, COPTIC_PARIS);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38271);assertEquals(true, test1.equals(test2));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38272);assertEquals(true, test2.equals(test1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38273);assertEquals(true, test1.equals(test1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38274);assertEquals(true, test2.equals(test2));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38275);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38276);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38277);assertEquals(true, test2.hashCode() == test2.hashCode());

        __CLR4_4_1t9dt9dlgchos13.R.inc(38278);LocalDate test3 = new LocalDate(1971, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38279);assertEquals(false, test1.equals(test3));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38280);assertEquals(false, test2.equals(test3));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38281);assertEquals(false, test3.equals(test1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38282);assertEquals(false, test3.equals(test2));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38283);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38284);assertEquals(false, test2.hashCode() == test3.hashCode());

        __CLR4_4_1t9dt9dlgchos13.R.inc(38285);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38286);assertEquals(true, test1.equals(new MockInstant()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38287);assertEquals(true, test1.equals(new YearMonthDay(1970, 6, 9, COPTIC_PARIS)));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38288);assertEquals(true, test1.hashCode() == new YearMonthDay(1970, 6, 9, COPTIC_PARIS).hashCode());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38289);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE));
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1t9dt9dlgchos13.R.inc(38290);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38291);return COPTIC_UTC;
        }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

        public DateTimeField[] getFields() {try{__CLR4_4_1t9dt9dlgchos13.R.inc(38292);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38293);return new DateTimeField[]{
                    COPTIC_UTC.year(),
                    COPTIC_UTC.monthOfYear(),
                    COPTIC_UTC.dayOfMonth(),
            };
        }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

        public int[] getValues() {try{__CLR4_4_1t9dt9dlgchos13.R.inc(38294);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38295);return new int[]{1970, 6, 9};
        }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}
    }

    @Test
    public void testEqualsHashCodeLenient() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zr7n2tjs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testEqualsHashCodeLenient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38296,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zr7n2tjs(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38296);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38297);LocalDate test1 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38298);LocalDate test2 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38299);assertEquals(true, test1.equals(test2));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38300);assertEquals(true, test2.equals(test1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38301);assertEquals(true, test1.equals(test1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38302);assertEquals(true, test2.equals(test2));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38303);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38304);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38305);assertEquals(true, test2.hashCode() == test2.hashCode());
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testEqualsHashCodeStrict() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b60798tk2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testEqualsHashCodeStrict",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b60798tk2(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38306);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38307);LocalDate test1 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38308);LocalDate test2 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38309);assertEquals(true, test1.equals(test2));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38310);assertEquals(true, test2.equals(test1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38311);assertEquals(true, test1.equals(test1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38312);assertEquals(true, test2.equals(test2));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38313);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38314);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38315);assertEquals(true, test2.hashCode() == test2.hashCode());
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testEqualsHashCodeAPI() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdct05tkc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testEqualsHashCodeAPI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38316,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdct05tkc(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38316);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38317);LocalDate test = new LocalDate(1970, 6, 9, COPTIC_PARIS);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38318);int expected = 157;
        __CLR4_4_1t9dt9dlgchos13.R.inc(38319);expected = 23 * expected + 1970;
        __CLR4_4_1t9dt9dlgchos13.R.inc(38320);expected = 23 * expected + COPTIC_UTC.year().getType().hashCode();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38321);expected = 23 * expected + 6;
        __CLR4_4_1t9dt9dlgchos13.R.inc(38322);expected = 23 * expected + COPTIC_UTC.monthOfYear().getType().hashCode();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38323);expected = 23 * expected + 9;
        __CLR4_4_1t9dt9dlgchos13.R.inc(38324);expected = 23 * expected + COPTIC_UTC.dayOfMonth().getType().hashCode();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38325);expected += COPTIC_UTC.hashCode();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38326);assertEquals(expected, test.hashCode());
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testCompareTo() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfvtkn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38327,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfvtkn(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38327);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38328);LocalDate test1 = new LocalDate(2005, 6, 2);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38329);LocalDate test1a = new LocalDate(2005, 6, 2);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38330);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38331);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38332);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38333);assertEquals(0, test1a.compareTo(test1a));

        __CLR4_4_1t9dt9dlgchos13.R.inc(38334);LocalDate test2 = new LocalDate(2005, 7, 2);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38335);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38336);assertEquals(+1, test2.compareTo(test1));

        __CLR4_4_1t9dt9dlgchos13.R.inc(38337);LocalDate test3 = new LocalDate(2005, 7, 2, GregorianChronology.getInstanceUTC());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38338);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38339);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38340);assertEquals(0, test3.compareTo(test2));

        __CLR4_4_1t9dt9dlgchos13.R.inc(38341);DateTimeFieldType[] types = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.dayOfMonth(),
        };
        __CLR4_4_1t9dt9dlgchos13.R.inc(38342);int[] values = new int[]{2005, 6, 2};
        __CLR4_4_1t9dt9dlgchos13.R.inc(38343);Partial p = new Partial(types, values);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38344);assertEquals(0, test1.compareTo(p));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38345);assertEquals(0, test1.compareTo(new YearMonthDay(2005, 6, 2)));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38346);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38347);test1.compareTo(null);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38348);fail();
        } catch (NullPointerException ex) {
        }
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
        __CLR4_4_1t9dt9dlgchos13.R.inc(38349);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38350);test1.compareTo(new TimeOfDay());
            __CLR4_4_1t9dt9dlgchos13.R.inc(38351);fail();
        } catch (ClassCastException ex) {
        }
        __CLR4_4_1t9dt9dlgchos13.R.inc(38352);Partial partial = new Partial()
                .with(DateTimeFieldType.centuryOfEra(), 1)
                .with(DateTimeFieldType.halfdayOfDay(), 0)
                .with(DateTimeFieldType.dayOfMonth(), 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38353);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38354);new LocalDate(1970, 6, 9).compareTo(partial);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38355);fail();
        } catch (ClassCastException ex) {
        }
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsEqual_LocalDate() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wj0wpztlg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsEqual_LocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wj0wpztlg(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38356);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38357);LocalDate test1 = new LocalDate(2005, 6, 2);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38358);LocalDate test1a = new LocalDate(2005, 6, 2);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38359);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38360);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38361);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38362);assertEquals(true, test1a.isEqual(test1a));

        __CLR4_4_1t9dt9dlgchos13.R.inc(38363);LocalDate test2 = new LocalDate(2005, 7, 2);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38364);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38365);assertEquals(false, test2.isEqual(test1));

        __CLR4_4_1t9dt9dlgchos13.R.inc(38366);LocalDate test3 = new LocalDate(2005, 7, 2, GregorianChronology.getInstanceUTC());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38367);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38368);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38369);assertEquals(true, test3.isEqual(test2));

        __CLR4_4_1t9dt9dlgchos13.R.inc(38370);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38371);new LocalDate(2005, 7, 2).isEqual(null);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38372);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsBefore_LocalDate() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_197zwn8tlx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsBefore_LocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_197zwn8tlx(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38373);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38374);LocalDate test1 = new LocalDate(2005, 6, 2);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38375);LocalDate test1a = new LocalDate(2005, 6, 2);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38376);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38377);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38378);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38379);assertEquals(false, test1a.isBefore(test1a));

        __CLR4_4_1t9dt9dlgchos13.R.inc(38380);LocalDate test2 = new LocalDate(2005, 7, 2);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38381);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38382);assertEquals(false, test2.isBefore(test1));

        __CLR4_4_1t9dt9dlgchos13.R.inc(38383);LocalDate test3 = new LocalDate(2005, 7, 2, GregorianChronology.getInstanceUTC());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38384);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38385);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38386);assertEquals(false, test3.isBefore(test2));

        __CLR4_4_1t9dt9dlgchos13.R.inc(38387);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38388);new LocalDate(2005, 7, 2).isBefore(null);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38389);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsAfter_LocalDate() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uq5e67tme();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testIsAfter_LocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38390,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uq5e67tme(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38390);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38391);LocalDate test1 = new LocalDate(2005, 6, 2);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38392);LocalDate test1a = new LocalDate(2005, 6, 2);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38393);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38394);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38395);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38396);assertEquals(false, test1a.isAfter(test1a));

        __CLR4_4_1t9dt9dlgchos13.R.inc(38397);LocalDate test2 = new LocalDate(2005, 7, 2);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38398);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38399);assertEquals(true, test2.isAfter(test1));

        __CLR4_4_1t9dt9dlgchos13.R.inc(38400);LocalDate test3 = new LocalDate(2005, 7, 2, GregorianChronology.getInstanceUTC());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38401);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38402);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38403);assertEquals(false, test3.isAfter(test2));

        __CLR4_4_1t9dt9dlgchos13.R.inc(38404);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38405);new LocalDate(2005, 7, 2).isAfter(null);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38406);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithField_DateTimeFieldType_int_1() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1apbcyjtmv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38407,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1apbcyjtmv(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38407);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38408);LocalDate test = new LocalDate(2004, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38409);LocalDate result = test.withField(DateTimeFieldType.year(), 2006);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38410);assertEquals(new LocalDate(2004, 6, 9), test);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38411);assertEquals(new LocalDate(2006, 6, 9), result);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testWithField_DateTimeFieldType_int_2() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17gbe62tn0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38412,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17gbe62tn0(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38412);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38413);LocalDate test = new LocalDate(2004, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38414);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38415);test.withField(null, 6);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38416);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testWithField_DateTimeFieldType_int_3() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_147bfdltn5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_147bfdltn5(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38417);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38418);LocalDate test = new LocalDate(2004, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38419);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38420);test.withField(DateTimeFieldType.hourOfDay(), 6);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38421);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testWithField_DateTimeFieldType_int_4() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ybgl4tna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithField_DateTimeFieldType_int_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ybgl4tna(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38422);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38423);LocalDate test = new LocalDate(2004, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38424);LocalDate result = test.withField(DateTimeFieldType.year(), 2004);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38425);assertEquals(new LocalDate(2004, 6, 9), test);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38426);assertSame(test, result);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithFieldAdded_DurationFieldType_int_1() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cp4lfctnf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cp4lfctnf(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38427);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38428);LocalDate test = new LocalDate(2004, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38429);LocalDate result = test.withFieldAdded(DurationFieldType.years(), 6);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38430);assertEquals(new LocalDate(2004, 6, 9), test);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38431);assertEquals(new LocalDate(2010, 6, 9), result);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded_DurationFieldType_int_2() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19g4mmvtnk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19g4mmvtnk(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38432);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38433);LocalDate test = new LocalDate(2004, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38434);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38435);test.withFieldAdded(null, 0);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38436);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded_DurationFieldType_int_3() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1674nuetnp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1674nuetnp(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38437);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38438);LocalDate test = new LocalDate(2004, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38439);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38440);test.withFieldAdded(null, 6);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38441);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded_DurationFieldType_int_4() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12y4p1xtnu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12y4p1xtnu(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38442);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38443);LocalDate test = new LocalDate(2004, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38444);LocalDate result = test.withFieldAdded(DurationFieldType.years(), 0);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38445);assertSame(test, result);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded_DurationFieldType_int_5() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av9qktny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithFieldAdded_DurationFieldType_int_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38446,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av9qktny(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38446);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38447);LocalDate test = new LocalDate(2004, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38448);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38449);test.withFieldAdded(DurationFieldType.hours(), 6);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38450);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPlus_RP() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz83igto3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz83igto3(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38451);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38452);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38453);LocalDate result = test.plus(new Period(1, 2, 3, 4, 29, 6, 7, 8));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38454);LocalDate expected = new LocalDate(2003, 7, 28, BUDDHIST_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38455);assertEquals(expected, result);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38456);result = test.plus((ReadablePeriod) null);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38457);assertSame(test, result);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testPlusYears_int() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mx5kpttoa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38458,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mx5kpttoa(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38458);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38459);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38460);LocalDate result = test.plusYears(1);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38461);LocalDate expected = new LocalDate(2003, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38462);assertEquals(expected, result);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38463);result = test.plusYears(0);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38464);assertSame(test, result);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testPlusMonths_int() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170gxaitoh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38465,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170gxaitoh(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38465);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38466);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38467);LocalDate result = test.plusMonths(1);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38468);LocalDate expected = new LocalDate(2002, 6, 3, BUDDHIST_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38469);assertEquals(expected, result);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38470);result = test.plusMonths(0);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38471);assertSame(test, result);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testPlusWeeks_int() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eupheetoo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusWeeks_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eupheetoo(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38472);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38473);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38474);LocalDate result = test.plusWeeks(1);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38475);LocalDate expected = new LocalDate(2002, 5, 10, BUDDHIST_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38476);assertEquals(expected, result);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38477);result = test.plusWeeks(0);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38478);assertSame(test, result);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testPlusDays_int() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpmvkqtov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testPlusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpmvkqtov(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38479);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38480);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38481);LocalDate result = test.plusDays(1);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38482);LocalDate expected = new LocalDate(2002, 5, 4, BUDDHIST_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38483);assertEquals(expected, result);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38484);result = test.plusDays(0);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38485);assertSame(test, result);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMinus_RP() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112cpdmtp2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112cpdmtp2(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38486);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38487);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38488);LocalDate result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));

        // TODO breaks because it subtracts millis now, and thus goes
        // into the previous day

        __CLR4_4_1t9dt9dlgchos13.R.inc(38489);LocalDate expected = new LocalDate(2001, 3, 26, BUDDHIST_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38490);assertEquals(expected, result);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38491);result = test.minus((ReadablePeriod) null);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38492);assertSame(test, result);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testMinusYears_int() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9qdintp9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9qdintp9(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38493);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38494);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38495);LocalDate result = test.minusYears(1);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38496);LocalDate expected = new LocalDate(2001, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38497);assertEquals(expected, result);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38498);result = test.minusYears(0);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38499);assertSame(test, result);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testMinusMonths_int() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6k4gotpg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6k4gotpg(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38500);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38501);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38502);LocalDate result = test.minusMonths(1);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38503);LocalDate expected = new LocalDate(2002, 4, 3, BUDDHIST_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38504);assertEquals(expected, result);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38505);result = test.minusMonths(0);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38506);assertSame(test, result);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testMinusWeeks_int() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fi4olktpn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusWeeks_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fi4olktpn(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38507);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38508);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38509);LocalDate result = test.minusWeeks(1);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38510);LocalDate expected = new LocalDate(2002, 4, 26, BUDDHIST_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38511);assertEquals(expected, result);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38512);result = test.minusWeeks(0);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38513);assertSame(test, result);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testMinusDays_int() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hpufcktpu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testMinusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hpufcktpu(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38514);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38515);LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38516);LocalDate result = test.minusDays(1);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38517);LocalDate expected = new LocalDate(2002, 5, 2, BUDDHIST_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38518);assertEquals(expected, result);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38519);result = test.minusDays(0);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38520);assertSame(test, result);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetters() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jiqsv7tq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testGetters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jiqsv7tq1(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38521);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38522);LocalDate test = new LocalDate(1970, 6, 9, GJ_UTC);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38523);assertEquals(1970, test.getYear());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38524);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38525);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38526);assertEquals(160, test.getDayOfYear());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38527);assertEquals(2, test.getDayOfWeek());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38528);assertEquals(24, test.getWeekOfWeekyear());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38529);assertEquals(1970, test.getWeekyear());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38530);assertEquals(70, test.getYearOfCentury());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38531);assertEquals(20, test.getCenturyOfEra());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38532);assertEquals(1970, test.getYearOfEra());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38533);assertEquals(DateTimeConstants.AD, test.getEra());
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithers() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn9jzptqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testWithers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn9jzptqe(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38534);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38535);LocalDate test = new LocalDate(1970, 6, 9, GJ_UTC);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38536);check(test.withYear(2000), 2000, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38537);check(test.withMonthOfYear(2), 1970, 2, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38538);check(test.withDayOfMonth(2), 1970, 6, 2);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38539);check(test.withDayOfYear(6), 1970, 1, 6);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38540);check(test.withDayOfWeek(6), 1970, 6, 13);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38541);check(test.withWeekOfWeekyear(6), 1970, 2, 3);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38542);check(test.withWeekyear(1971), 1971, 6, 15);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38543);check(test.withYearOfCentury(60), 1960, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38544);check(test.withCenturyOfEra(21), 2070, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38545);check(test.withYearOfEra(1066), 1066, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38546);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38547);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38548);test.withMonthOfYear(0);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38549);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1t9dt9dlgchos13.R.inc(38550);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38551);test.withMonthOfYear(13);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38552);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTimeAtStartOfDay() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wquoittqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtStartOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38553,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wquoittqx(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38553);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38554);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38555);DateTime test = base.toDateTimeAtStartOfDay();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38556);check(base, 2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38557);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testToDateTimeAtStartOfDay_avoidDST() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14j43pktr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtStartOfDay_avoidDST",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38558,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14j43pktr2(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38558);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38559);LocalDate base = new LocalDate(2007, 4, 1);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38560);DateTimeZone.setDefault(MOCK_GAZA);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38561);DateTime test = base.toDateTimeAtStartOfDay();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38562);check(base, 2007, 4, 1);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38563);assertEquals(new DateTime(2007, 4, 1, 1, 0, 0, 0, MOCK_GAZA), test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testToDateTimeAtStartOfDay_handleMidnightDST() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vvc1gztr8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtStartOfDay_handleMidnightDST",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vvc1gztr8(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38564);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38565);LocalDate test = new LocalDate(2018, 10, 28);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38566);DateTime result = test.toDateTimeAtStartOfDay(DateTimeZone.forID("Atlantic/Azores"));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38567);DateTime expected = new DateTime(2018, 10, 28, 0, 0, DateTimeZone.forID("Atlantic/Azores"));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38568);assertEquals(expected, result);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTimeAtStartOfDay_Zone() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17pjz78trd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtStartOfDay_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17pjz78trd(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38569);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38570);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38571);DateTime test = base.toDateTimeAtStartOfDay(TOKYO);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38572);check(base, 2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38573);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_TOKYO), test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testToDateTimeAtStartOfDay_Zone_avoidDST() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b24unrtri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtStartOfDay_Zone_avoidDST",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b24unrtri(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38574);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38575);LocalDate base = new LocalDate(2007, 4, 1);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38576);DateTime test = base.toDateTimeAtStartOfDay(MOCK_GAZA);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38577);check(base, 2007, 4, 1);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38578);assertEquals(new DateTime(2007, 4, 1, 1, 0, 0, 0, MOCK_GAZA), test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testToDateTimeAtStartOfDay_nullZone() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g20wpntrn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtStartOfDay_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g20wpntrn(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38579);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38580);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38581);DateTime test = base.toDateTimeAtStartOfDay((DateTimeZone) null);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38582);check(base, 2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38583);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testToDateTimeAtMidnight() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15kwl0utrs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtMidnight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15kwl0utrs(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38584);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38585);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38586);DateTime test = base.toDateTimeAtMidnight();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38587);check(base, 2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38588);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testToDateTimeAtMidnight_Zone() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1baa121trx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtMidnight_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38589,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1baa121trx(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38589);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38590);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38591);DateTime test = base.toDateTimeAtMidnight(TOKYO);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38592);check(base, 2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38593);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_TOKYO), test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testToDateTimeAtMidnight_nullZone() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wkup1qts2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtMidnight_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wkup1qts2(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38594);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38595);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38596);DateTime test = base.toDateTimeAtMidnight((DateTimeZone) null);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38597);check(base, 2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38598);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTimeAtCurrentTime() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nxkflats7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtCurrentTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nxkflats7(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38599);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38600);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1t9dt9dlgchos13.R.inc(38601);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38602);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());

        __CLR4_4_1t9dt9dlgchos13.R.inc(38603);DateTime test = base.toDateTimeAtCurrentTime();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38604);check(base, 2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38605);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38606);expected = expected.year().setCopy(2005);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38607);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38608);expected = expected.dayOfMonth().setCopy(9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38609);assertEquals(expected, test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTimeAtCurrentTime_Zone() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pbzvx5tsi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtCurrentTime_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pbzvx5tsi(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38610);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38611);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1t9dt9dlgchos13.R.inc(38612);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38613);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());

        __CLR4_4_1t9dt9dlgchos13.R.inc(38614);DateTime test = base.toDateTimeAtCurrentTime(TOKYO);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38615);check(base, 2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38616);DateTime expected = new DateTime(dt.getMillis(), COPTIC_TOKYO);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38617);expected = expected.year().setCopy(2005);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38618);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38619);expected = expected.dayOfMonth().setCopy(9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38620);assertEquals(expected, test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testToDateTimeAtCurrentTime_nullZone() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sccwr2tst();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTimeAtCurrentTime_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sccwr2tst(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38621);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38622);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1t9dt9dlgchos13.R.inc(38623);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38624);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());

        __CLR4_4_1t9dt9dlgchos13.R.inc(38625);DateTime test = base.toDateTimeAtCurrentTime((DateTimeZone) null);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38626);check(base, 2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38627);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38628);expected = expected.year().setCopy(2005);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38629);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38630);expected = expected.dayOfMonth().setCopy(9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38631);assertEquals(expected, test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToLocalDateTime_LocalTime() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_133rb0ntt4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToLocalDateTime_LocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_133rb0ntt4(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38632);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38633);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1t9dt9dlgchos13.R.inc(38634);LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38635);LocalDateTime test = base.toLocalDateTime(tod);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38636);check(base, 2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38637);LocalDateTime expected = new LocalDateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_UTC);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38638);assertEquals(expected, test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testToLocalDateTime_nullLocalTime() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6656attb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToLocalDateTime_nullLocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6656attb(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38639);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38640);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant

        __CLR4_4_1t9dt9dlgchos13.R.inc(38641);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38642);base.toLocalDateTime((LocalTime) null);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38643);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testToLocalDateTime_wrongChronologyLocalTime() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cokra8ttg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToLocalDateTime_wrongChronologyLocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38644,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cokra8ttg(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38644);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38645);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1t9dt9dlgchos13.R.inc(38646);LocalTime tod = new LocalTime(12, 13, 14, 15, BUDDHIST_PARIS); // PARIS irrelevant

        __CLR4_4_1t9dt9dlgchos13.R.inc(38647);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38648);base.toLocalDateTime(tod);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38649);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTime_LocalTime() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bmsit4ttm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_LocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38650,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bmsit4ttm(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38650);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38651);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1t9dt9dlgchos13.R.inc(38652);LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38653);DateTime test = base.toDateTime(tod);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38654);check(base, 2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38655);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38656);assertEquals(expected, test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testToDateTime_nullLocalTime() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ld55z3ttt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_nullLocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38657,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ld55z3ttt(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38657);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38658);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1t9dt9dlgchos13.R.inc(38659);long now = new DateTime(2004, 5, 8, 12, 13, 14, 15, COPTIC_LONDON).getMillis();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38660);DateTimeUtils.setCurrentMillisFixed(now);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38661);DateTime test = base.toDateTime((LocalTime) null);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38662);check(base, 2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38663);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38664);assertEquals(expected, test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTime_LocalTime_Zone() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fwng1tu1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_LocalTime_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fwng1tu1(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38665);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38666);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1t9dt9dlgchos13.R.inc(38667);LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38668);DateTime test = base.toDateTime(tod, TOKYO);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38669);check(base, 2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38670);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_TOKYO);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38671);assertEquals(expected, test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testToDateTime_LocalTime_nullZone() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_130hbkotu8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_LocalTime_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38672,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_130hbkotu8(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38672);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38673);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1t9dt9dlgchos13.R.inc(38674);LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38675);DateTime test = base.toDateTime(tod, null);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38676);check(base, 2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38677);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38678);assertEquals(expected, test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testToDateTime_nullLocalTime_Zone() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xs4m08tuf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_nullLocalTime_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xs4m08tuf(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38679);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38680);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1t9dt9dlgchos13.R.inc(38681);long now = new DateTime(2004, 5, 8, 12, 13, 14, 15, COPTIC_TOKYO).getMillis();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38682);DateTimeUtils.setCurrentMillisFixed(now);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38683);DateTime test = base.toDateTime((LocalTime) null, TOKYO);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38684);check(base, 2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38685);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_TOKYO);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38686);assertEquals(expected, test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testToDateTime_LocalTime_Zone_dstGap() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vcqrn7tun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_LocalTime_Zone_dstGap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38687,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vcqrn7tun(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38687);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38688);LocalDate base = new LocalDate(2014, 3, 30, ISO_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38689);LocalTime tod = new LocalTime(1, 30, 0, 0, ISO_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38690);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38691);base.toDateTime(tod, LONDON);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38692);fail();
        } catch (IllegalInstantException ex) {
        }
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testToDateTime_LocalTime_Zone_dstOverlap() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1emx5iatut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_LocalTime_Zone_dstOverlap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1emx5iatut(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38693);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38694);LocalDate base = new LocalDate(2014, 10, 26, ISO_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38695);LocalTime tod = new LocalTime(1, 30, 0, 0, ISO_LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38696);DateTime test = base.toDateTime(tod, LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38697);DateTime expected = new DateTime(2014, 10, 26, 1, 30, ISO_LONDON).withEarlierOffsetAtOverlap();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38698);assertEquals(expected, test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testToDateTime_LocalTime_Zone_dstOverlap_NewYork() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pr6776tuz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_LocalTime_Zone_dstOverlap_NewYork",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pr6776tuz(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38699);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38700);LocalDate base = new LocalDate(2007, 11, 4, ISO_NEW_YORK);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38701);LocalTime tod = new LocalTime(1, 30, 0, 0, ISO_NEW_YORK);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38702);DateTime test = base.toDateTime(tod, NEW_YORK);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38703);DateTime expected = new DateTime(2007, 11, 4, 1, 30, ISO_NEW_YORK).withEarlierOffsetAtOverlap();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38704);assertEquals(expected, test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testToDateTime_wrongChronoLocalTime_Zone() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xurivntv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_wrongChronoLocalTime_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xurivntv5(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38705);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38706);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1t9dt9dlgchos13.R.inc(38707);LocalTime tod = new LocalTime(12, 13, 14, 15, BUDDHIST_TOKYO);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38708);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38709);base.toDateTime(tod, LONDON);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38710);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testToDateMidnight() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1osch5etvb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateMidnight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1osch5etvb(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38711);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38712);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38713);DateMidnight test = base.toDateMidnight();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38714);check(base, 2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38715);assertEquals(new DateMidnight(2005, 6, 9, COPTIC_LONDON), test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testToDateMidnight_Zone() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11f3vmvtvg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateMidnight_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11f3vmvtvg(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38716);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38717);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38718);DateMidnight test = base.toDateMidnight(TOKYO);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38719);check(base, 2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38720);assertEquals(new DateMidnight(2005, 6, 9, COPTIC_TOKYO), test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testToDateMidnight_nullZone() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15031fytvl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateMidnight_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38721,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15031fytvl(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38721);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38722);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38723);DateMidnight test = base.toDateMidnight((DateTimeZone) null);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38724);check(base, 2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38725);assertEquals(new DateMidnight(2005, 6, 9, COPTIC_LONDON), test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTime_RI() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1584tmdtvq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1584tmdtvq(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38726);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38727);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38728);DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38729);DateTime test = base.toDateTime(dt);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38730);check(base, 2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38731);DateTime expected = dt;
        __CLR4_4_1t9dt9dlgchos13.R.inc(38732);expected = expected.year().setCopy(2005);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38733);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38734);expected = expected.dayOfMonth().setCopy(9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38735);assertEquals(expected, test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testToDateTime_nullRI() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xlns4tw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDateTime_nullRI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xlns4tw0(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38736);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38737);LocalDate base = new LocalDate(2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38738);DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38739);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());

        __CLR4_4_1t9dt9dlgchos13.R.inc(38740);DateTime test = base.toDateTime((ReadableInstant) null);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38741);check(base, 2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38742);DateTime expected = dt;
        __CLR4_4_1t9dt9dlgchos13.R.inc(38743);expected = expected.year().setCopy(2005);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38744);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38745);expected = expected.dayOfMonth().setCopy(9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38746);assertEquals(expected, test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToInterval() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cj50gptwb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cj50gptwb(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38747);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38748);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1t9dt9dlgchos13.R.inc(38749);Interval test = base.toInterval();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38750);check(base, 2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38751);DateTime start = base.toDateTimeAtStartOfDay();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38752);DateTime end = start.plus(Period.days(1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38753);Interval expected = new Interval(start, end);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38754);assertEquals(expected, test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToInterval_Zone() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpa0zktwj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToInterval_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpa0zktwj(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38755);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38756);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1t9dt9dlgchos13.R.inc(38757);Interval test = base.toInterval(TOKYO);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38758);check(base, 2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38759);DateTime start = base.toDateTimeAtStartOfDay(TOKYO);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38760);DateTime end = start.plus(Period.days(1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38761);Interval expected = new Interval(start, end);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38762);assertEquals(expected, test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testToInterval_Zone_noMidnight() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j7wbiatwr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToInterval_Zone_noMidnight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j7wbiatwr(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38763);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38764);LocalDate base = new LocalDate(2006, 4, 1, ISO_LONDON);  // LONDON irrelevant
        __CLR4_4_1t9dt9dlgchos13.R.inc(38765);DateTimeZone gaza = DateTimeZone.forID("Asia/Gaza");
        __CLR4_4_1t9dt9dlgchos13.R.inc(38766);Interval test = base.toInterval(gaza);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38767);check(base, 2006, 4, 1);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38768);DateTime start = new DateTime(2006, 4, 1, 1, 0, 0, 0, gaza);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38769);DateTime end = new DateTime(2006, 4, 2, 0, 0, 0, 0, gaza);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38770);Interval expected = new Interval(start, end);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38771);assertEquals(expected, test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testToInterval_nullZone() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19hp1i1tx0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToInterval_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19hp1i1tx0(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38772);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38773);LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1t9dt9dlgchos13.R.inc(38774);Interval test = base.toInterval(null);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38775);check(base, 2005, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38776);DateTime start = base.toDateTimeAtStartOfDay(LONDON);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38777);DateTime end = start.plus(Period.days(1));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38778);Interval expected = new Interval(start, end);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38779);assertEquals(expected, test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDate_summer() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gs4c6etx8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDate_summer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gs4c6etx8(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38780);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38781);LocalDate base = new LocalDate(2005, 7, 9, COPTIC_PARIS);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38782);Date test = base.toDate();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38783);check(base, 2005, 7, 9);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38784);GregorianCalendar gcal = new GregorianCalendar();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38785);gcal.clear();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38786);gcal.set(Calendar.YEAR, 2005);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38787);gcal.set(Calendar.MONTH, Calendar.JULY);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38788);gcal.set(Calendar.DAY_OF_MONTH, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38789);assertEquals(gcal.getTime(), test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    @Test
    public void testToDate_winter() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1du955ctxi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDate_winter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1du955ctxi(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38790);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38791);LocalDate base = new LocalDate(2005, 1, 9, COPTIC_PARIS);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38792);Date test = base.toDate();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38793);check(base, 2005, 1, 9);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38794);GregorianCalendar gcal = new GregorianCalendar();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38795);gcal.clear();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38796);gcal.set(Calendar.YEAR, 2005);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38797);gcal.set(Calendar.MONTH, Calendar.JANUARY);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38798);gcal.set(Calendar.DAY_OF_MONTH, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38799);assertEquals(gcal.getTime(), test);
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //@Test
    public void testToDate_springDST() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrtngltxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDate_springDST",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrtngltxs(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38800);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38801);LocalDate base = new LocalDate(2007, 4, 2);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38802);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38803);TimeZone currentZone = TimeZone.getDefault();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38804);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38805);TimeZone.setDefault(testZone);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38806);Date test = base.toDate();
            __CLR4_4_1t9dt9dlgchos13.R.inc(38807);check(base, 2007, 4, 2);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38808);assertEquals("Mon Apr 02 01:00:00 GMT+02:00 2007", test.toString());
        } finally {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38809);TimeZone.setDefault(currentZone);
        }
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //@Test
    public void testToDate_springDST_2Hour40Savings() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1168c4nty2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDate_springDST_2Hour40Savings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1168c4nty2(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38810);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38811);LocalDate base = new LocalDate(2007, 4, 2);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38812);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000, (3600000 / 6) * 16);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38813);TimeZone currentZone = TimeZone.getDefault();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38814);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38815);TimeZone.setDefault(testZone);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38816);Date test = base.toDate();
            __CLR4_4_1t9dt9dlgchos13.R.inc(38817);check(base, 2007, 4, 2);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38818);assertEquals("Mon Apr 02 02:40:00 GMT+03:40 2007", test.toString());
        } finally {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38819);TimeZone.setDefault(currentZone);
        }
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //@Test
    public void testToDate_autumnDST() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r4c67mtyc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToDate_autumnDST",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r4c67mtyc(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38820);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38821);LocalDate base = new LocalDate(2007, 10, 2);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38822);SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38823);TimeZone currentZone = TimeZone.getDefault();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38824);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38825);TimeZone.setDefault(testZone);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38826);Date test = base.toDate();
            __CLR4_4_1t9dt9dlgchos13.R.inc(38827);check(base, 2007, 10, 2);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38828);assertEquals("Tue Oct 02 00:00:00 GMT+02:00 2007", test.toString());
        } finally {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38829);TimeZone.setDefault(currentZone);
        }
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testProperty() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7neoitym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7neoitym(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38830);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38831);LocalDate test = new LocalDate(2005, 6, 9, GJ_UTC);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38832);assertEquals(test.year(), test.property(DateTimeFieldType.year()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38833);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38834);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38835);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38836);assertEquals(test.dayOfYear(), test.property(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38837);assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38838);assertEquals(test.weekyear(), test.property(DateTimeFieldType.weekyear()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38839);assertEquals(test.yearOfCentury(), test.property(DateTimeFieldType.yearOfCentury()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38840);assertEquals(test.yearOfEra(), test.property(DateTimeFieldType.yearOfEra()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38841);assertEquals(test.centuryOfEra(), test.property(DateTimeFieldType.centuryOfEra()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38842);assertEquals(test.era(), test.property(DateTimeFieldType.era()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38843);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38844);test.property(DateTimeFieldType.millisOfDay());
            __CLR4_4_1t9dt9dlgchos13.R.inc(38845);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1t9dt9dlgchos13.R.inc(38846);try {
            __CLR4_4_1t9dt9dlgchos13.R.inc(38847);test.property(null);
            __CLR4_4_1t9dt9dlgchos13.R.inc(38848);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9tz5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9tz5() throws Exception{try{__CLR4_4_1t9dt9dlgchos13.R.inc(38849);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38850);LocalDate test = new LocalDate(1972, 6, 9, COPTIC_PARIS);

        __CLR4_4_1t9dt9dlgchos13.R.inc(38851);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38852);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38853);oos.writeObject(test);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38854);oos.close();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38855);byte[] bytes = baos.toByteArray();

        __CLR4_4_1t9dt9dlgchos13.R.inc(38856);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38857);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38858);LocalDate result = (LocalDate) ois.readObject();
        __CLR4_4_1t9dt9dlgchos13.R.inc(38859);ois.close();

        __CLR4_4_1t9dt9dlgchos13.R.inc(38860);assertEquals(test, result);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38861);assertTrue(Arrays.equals(test.getValues(), result.getValues()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38862);assertTrue(Arrays.equals(test.getFields(), result.getFields()));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38863);assertEquals(test.getChronology(), result.getChronology());
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidtzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidtzk(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38864);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38865);LocalDate test = new LocalDate(2002, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38866);assertEquals("2002-06-09", test.toString());
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_String() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llkh2xtzn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llkh2xtzn(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38867);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38868);LocalDate test = new LocalDate(2002, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38869);assertEquals("2002 \ufffd\ufffd", test.toString("yyyy HH"));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38870);assertEquals("2002-06-09", test.toString((String) null));
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_String_Locale() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1afd64utzr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38871,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1afd64utzr(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38871);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38872);LocalDate test = new LocalDate(1970, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38873);assertEquals("Tue 9/6", test.toString("EEE d/M", Locale.ENGLISH));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38874);assertEquals("mar. 9/6", test.toString("EEE d/M", Locale.FRENCH));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38875);assertEquals("1970-06-09", test.toString(null, Locale.ENGLISH));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38876);assertEquals("Tue 9/6", test.toString("EEE d/M", null));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38877);assertEquals("1970-06-09", test.toString(null, null));
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_DTFormatter() {__CLR4_4_1t9dt9dlgchos13.R.globalSliceStart(getClass().getName(),38878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxbkpstzy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9dt9dlgchos13.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9dt9dlgchos13.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Basics.testToString_DTFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxbkpstzy(){try{__CLR4_4_1t9dt9dlgchos13.R.inc(38878);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38879);LocalDate test = new LocalDate(2002, 6, 9);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38880);assertEquals("2002 \ufffd\ufffd", test.toString(DateTimeFormat.forPattern("yyyy HH")));
        __CLR4_4_1t9dt9dlgchos13.R.inc(38881);assertEquals("2002-06-09", test.toString((DateTimeFormatter) null));
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(LocalDate test, int hour, int min, int sec) {try{__CLR4_4_1t9dt9dlgchos13.R.inc(38882);
        __CLR4_4_1t9dt9dlgchos13.R.inc(38883);assertEquals(hour, test.getYear());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38884);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1t9dt9dlgchos13.R.inc(38885);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1t9dt9dlgchos13.R.flushNeeded();}}
}
