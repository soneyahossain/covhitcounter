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
 * This class is a Junit unit test for DateMidnight.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestDateMidnight_Basics {static class __CLR4_4_1hs9hs9lgchorgi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,23868,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone NEWYORK = DateTimeZone.forID("America/New_York");

    // the default time zone is set to LONDON in setUp()
    // we have to hard code LONDON here (instead of ISOChronology.getInstance() etc.)
    // as TestAll sets up a different time zone for better all-round testing
    private static final ISOChronology ISO_DEFAULT = ISOChronology.getInstance(LONDON);
    private static final ISOChronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final GJChronology GJ_DEFAULT = GJChronology.getInstance(LONDON);
    private static final GregorianChronology GREGORIAN_DEFAULT = GregorianChronology.getInstance(LONDON);
    private static final GregorianChronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
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
    private long TEST_TIME_NOW_UTC =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;
    private long TEST_TIME_NOW_LONDON =
            TEST_TIME_NOW_UTC - DateTimeConstants.MILLIS_PER_HOUR;
//    private long TEST_TIME_NOW_PARIS =
//            TEST_TIME_NOW_UTC - 2*DateTimeConstants.MILLIS_PER_HOUR;

    // 2002-04-05
    private long TEST_TIME1_UTC =
            (y2002days + 31L + 28L + 31L + 5L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 12L * DateTimeConstants.MILLIS_PER_HOUR
                    + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME1_LONDON =
            (y2002days + 31L + 28L + 31L + 5L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME1_PARIS =
            (y2002days + 31L + 28L + 31L + 5L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    - 2 * DateTimeConstants.MILLIS_PER_HOUR;

    // 2003-05-06
    private long TEST_TIME2_UTC =
            (y2003days + 31L + 28L + 31L + 30L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 14L * DateTimeConstants.MILLIS_PER_HOUR
                    + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME2_LONDON =
            (y2003days + 31L + 28L + 31L + 30L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME2_PARIS =
            (y2003days + 31L + 28L + 31L + 30L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    - 2 * DateTimeConstants.MILLIS_PER_HOUR;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23049);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23050);TestDateMidnight_Basics TB = new TestDateMidnight_Basics();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23051);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23052);TB.testTest();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23053);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23054);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23055);TB.testGet_DateTimeField();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23056);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23057);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23058);TB.testGet_DateTimeFieldType();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23059);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23060);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23061);TB.testGetters();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23062);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23063);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23064);TB.testWithers();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23065);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23066);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23067);TB.testEqualsHashCode();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23068);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23069);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23070);TB.testCompareTo();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23071);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23072);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23073);TB.testIsEqual();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23074);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23075);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23076);TB.testIsBefore();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23077);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23078);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23079);TB.testIsAfter();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23080);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23081);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23082);TB.testSerialization();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23083);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23084);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23085);TB.testToString();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23086);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23087);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23088);TB.testToString_String();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23089);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23090);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23091);TB.testToString_String_String();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23092);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23093);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23094);TB.testToString_DTFormatter();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23095);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23096);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23097);TB.testToInstant();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23098);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23099);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23100);TB.testToDateTime();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23101);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23102);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23103);TB.testToDateTimeISO();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23104);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23105);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23106);TB.testToDateTime_DateTimeZone();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23107);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23108);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23109);TB.testToDateTime_Chronology();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23110);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23111);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23112);TB.testToMutableDateTime();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23113);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23114);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23115);TB.testToMutableDateTimeISO();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23116);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23117);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23118);TB.testToMutableDateTime_DateTimeZone();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23119);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23120);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23121);TB.testToMutableDateTime_Chronology();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23122);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23123);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23124);TB.testToDate();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23125);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23126);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23127);TB.testToCalendar_Locale();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23128);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23129);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23130);TB.testToGregorianCalendar();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23131);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23132);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23133);TB.testToYearMonthDay();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23134);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23135);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23136);TB.testToLocalDate();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23137);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23138);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23139);TB.testToInterval();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23140);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23141);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23142);TB.testWithMillis_long();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23143);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23144);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23145);TB.testWithChronology_Chronology();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23146);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23147);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23148);TB.testWithZoneRetainFields_DateTimeZone();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23149);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23150);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23151);TB.testWithFields_RPartial();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23152);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23153);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23154);TB.testWithField1();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23155);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23156);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23157);TB.testWithField2();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23158);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23159);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23160);TB.testWithFieldAdded1();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23161);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23162);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23163);TB.testWithFieldAdded2();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23164);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23165);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23166);TB.testWithFieldAdded3();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23167);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23168);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23169);TB.testWithFieldAdded4();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23170);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23171);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23172);TB.testWithDurationAdded_long_int();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23173);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23174);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23175);TB.testWithDurationAdded_RD_int();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23176);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23177);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23178);TB.testWithDurationAdded_RP_int();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23179);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23180);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23181);TB.testPlus_long();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23182);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23183);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23184);TB.testPlus_RD();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23185);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23186);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23187);TB.testPlus_RP();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23188);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23189);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23190);TB.testPlusYears_int();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23191);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23192);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23193);TB.testPlusMonths_int();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23194);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23195);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23196);TB.testPlusWeeks_int();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23197);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23198);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23199);TB.testPlusDays_int();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23200);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23201);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23202);TB.testMinus_long();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23203);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23204);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23205);TB.testMinus_RD();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23206);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23207);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23208);TB.testMinus_RP();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23209);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23210);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23211);TB.testMinusYears_int();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23212);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23213);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23214);TB.testMinusMonths_int();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23215);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23216);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23217);TB.testMinusWeeks_int();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23218);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23219);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23220);TB.testMinusDays_int();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23221);TB.tearDown();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23222);TB.setUp();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23223);TB.testProperty();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23224);TB.tearDown();

    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}
  /*
    public static TestSuite suite() {
        return new TestSuite(TestDateMidnight_Basics.class);
    }

    public TestDateMidnight_Basics(String name) {
        super(name);
    }
 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23225);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23226);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23227);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23228);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23229);originalLocale = Locale.getDefault();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23230);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23231);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23232);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23233);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23234);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23235);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23236);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23237);Locale.setDefault(originalLocale);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23238);originalDateTimeZone = null;
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23239);originalTimeZone = null;
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23240);originalLocale = null;
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjhxl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjhxl(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23241);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23242);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW_UTC).toString());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23243);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1_UTC).toString());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23244);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2_UTC).toString());
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGet_DateTimeField() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zggkkrhxp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testGet_DateTimeField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23245,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zggkkrhxp(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23245);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23246);DateMidnight test = new DateMidnight();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23247);assertEquals(1, test.get(ISO_DEFAULT.era()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23248);assertEquals(20, test.get(ISO_DEFAULT.centuryOfEra()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23249);assertEquals(2, test.get(ISO_DEFAULT.yearOfCentury()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23250);assertEquals(2002, test.get(ISO_DEFAULT.yearOfEra()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23251);assertEquals(2002, test.get(ISO_DEFAULT.year()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23252);assertEquals(6, test.get(ISO_DEFAULT.monthOfYear()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23253);assertEquals(9, test.get(ISO_DEFAULT.dayOfMonth()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23254);assertEquals(2002, test.get(ISO_DEFAULT.weekyear()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23255);assertEquals(23, test.get(ISO_DEFAULT.weekOfWeekyear()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23256);assertEquals(7, test.get(ISO_DEFAULT.dayOfWeek()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23257);assertEquals(160, test.get(ISO_DEFAULT.dayOfYear()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23258);assertEquals(0, test.get(ISO_DEFAULT.halfdayOfDay()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23259);assertEquals(0, test.get(ISO_DEFAULT.hourOfHalfday()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23260);assertEquals(24, test.get(ISO_DEFAULT.clockhourOfDay()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23261);assertEquals(12, test.get(ISO_DEFAULT.clockhourOfHalfday()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23262);assertEquals(0, test.get(ISO_DEFAULT.hourOfDay()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23263);assertEquals(0, test.get(ISO_DEFAULT.minuteOfHour()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23264);assertEquals(0, test.get(ISO_DEFAULT.minuteOfDay()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23265);assertEquals(0, test.get(ISO_DEFAULT.secondOfMinute()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23266);assertEquals(0, test.get(ISO_DEFAULT.secondOfDay()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23267);assertEquals(0, test.get(ISO_DEFAULT.millisOfSecond()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23268);assertEquals(0, test.get(ISO_DEFAULT.millisOfDay()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23269);try {
            __CLR4_4_1hs9hs9lgchorgi.R.inc(23270);test.get((DateTimeField) null);
            __CLR4_4_1hs9hs9lgchorgi.R.inc(23271);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testGet_DateTimeFieldType() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyir3vhyg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testGet_DateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyir3vhyg(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23272);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23273);DateMidnight test = new DateMidnight();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23274);assertEquals(1, test.get(DateTimeFieldType.era()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23275);assertEquals(20, test.get(DateTimeFieldType.centuryOfEra()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23276);assertEquals(2, test.get(DateTimeFieldType.yearOfCentury()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23277);assertEquals(2002, test.get(DateTimeFieldType.yearOfEra()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23278);assertEquals(2002, test.get(DateTimeFieldType.year()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23279);assertEquals(6, test.get(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23280);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23281);assertEquals(2002, test.get(DateTimeFieldType.weekyear()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23282);assertEquals(23, test.get(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23283);assertEquals(7, test.get(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23284);assertEquals(160, test.get(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23285);assertEquals(0, test.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23286);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23287);assertEquals(24, test.get(DateTimeFieldType.clockhourOfDay()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23288);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23289);assertEquals(0, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23290);assertEquals(0, test.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23291);assertEquals(0, test.get(DateTimeFieldType.minuteOfDay()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23292);assertEquals(0, test.get(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23293);assertEquals(0, test.get(DateTimeFieldType.secondOfDay()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23294);assertEquals(0, test.get(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23295);assertEquals(0, test.get(DateTimeFieldType.millisOfDay()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23296);try {
            __CLR4_4_1hs9hs9lgchorgi.R.inc(23297);test.get((DateTimeFieldType) null);
            __CLR4_4_1hs9hs9lgchorgi.R.inc(23298);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetters() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jiqsv7hz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testGetters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jiqsv7hz7(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23299);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23300);DateMidnight test = new DateMidnight();

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23301);assertEquals(ISO_DEFAULT, test.getChronology());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23302);assertEquals(LONDON, test.getZone());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23303);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23304);assertEquals(1, test.getEra());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23305);assertEquals(20, test.getCenturyOfEra());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23306);assertEquals(2, test.getYearOfCentury());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23307);assertEquals(2002, test.getYearOfEra());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23308);assertEquals(2002, test.getYear());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23309);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23310);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23311);assertEquals(2002, test.getWeekyear());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23312);assertEquals(23, test.getWeekOfWeekyear());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23313);assertEquals(7, test.getDayOfWeek());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23314);assertEquals(160, test.getDayOfYear());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23315);assertEquals(0, test.getHourOfDay());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23316);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23317);assertEquals(0, test.getMinuteOfDay());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23318);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23319);assertEquals(0, test.getSecondOfDay());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23320);assertEquals(0, test.getMillisOfSecond());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23321);assertEquals(0, test.getMillisOfDay());
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testWithers() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn9jzphzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn9jzphzu(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23322);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23323);DateMidnight test = new DateMidnight(1970, 6, 9, GJ_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23324);check(test.withYear(2000), 2000, 6, 9);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23325);check(test.withMonthOfYear(2), 1970, 2, 9);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23326);check(test.withDayOfMonth(2), 1970, 6, 2);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23327);check(test.withDayOfYear(6), 1970, 1, 6);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23328);check(test.withDayOfWeek(6), 1970, 6, 13);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23329);check(test.withWeekOfWeekyear(6), 1970, 2, 3);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23330);check(test.withWeekyear(1971), 1971, 6, 15);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23331);check(test.withYearOfCentury(60), 1960, 6, 9);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23332);check(test.withCenturyOfEra(21), 2070, 6, 9);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23333);check(test.withYearOfEra(1066), 1066, 6, 9);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23334);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23335);try {
            __CLR4_4_1hs9hs9lgchorgi.R.inc(23336);test.withMonthOfYear(0);
            __CLR4_4_1hs9hs9lgchorgi.R.inc(23337);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23338);try {
            __CLR4_4_1hs9hs9lgchorgi.R.inc(23339);test.withMonthOfYear(13);
            __CLR4_4_1hs9hs9lgchorgi.R.inc(23340);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEqualsHashCode() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77i0d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23341,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77i0d(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23341);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23342);DateMidnight test1 = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23343);DateMidnight test2 = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23344);assertEquals(true, test1.equals(test2));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23345);assertEquals(true, test2.equals(test1));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23346);assertEquals(true, test1.equals(test1));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23347);assertEquals(true, test2.equals(test2));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23348);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23349);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23350);assertEquals(true, test2.hashCode() == test2.hashCode());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23351);DateMidnight test3 = new DateMidnight(TEST_TIME2_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23352);assertEquals(false, test1.equals(test3));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23353);assertEquals(false, test2.equals(test3));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23354);assertEquals(false, test3.equals(test1));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23355);assertEquals(false, test3.equals(test2));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23356);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23357);assertEquals(false, test2.hashCode() == test3.hashCode());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23358);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23359);assertEquals(true, test1.equals(new MockInstant()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23360);assertEquals(false, test1.equals(new DateMidnight(TEST_TIME1_UTC, GREGORIAN_DEFAULT)));
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23361);
            __CLR4_4_1hs9hs9lgchorgi.R.inc(23362);return null;
        }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

        public long getMillis() {try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23363);
            __CLR4_4_1hs9hs9lgchorgi.R.inc(23364);return TEST_TIME1_LONDON;
        }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

        public Chronology getChronology() {try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23365);
            __CLR4_4_1hs9hs9lgchorgi.R.inc(23366);return ISO_DEFAULT;
        }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}
    }

    @Test
    public void testCompareTo() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfvi13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23367,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfvi13(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23367);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23368);DateMidnight test1 = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23369);DateMidnight test1a = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23370);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23371);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23372);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23373);assertEquals(0, test1a.compareTo(test1a));

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23374);DateMidnight test2 = new DateMidnight(TEST_TIME2_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23375);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23376);assertEquals(+1, test2.compareTo(test1));

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23377);DateMidnight test3 = new DateMidnight(TEST_TIME2_UTC, GREGORIAN_PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23378);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23379);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23380);assertEquals(-1, test3.compareTo(test2));  // midnight paris before london

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23381);assertEquals(+1, test2.compareTo(new MockInstant()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23382);assertEquals(0, test1.compareTo(new MockInstant()));

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23383);try {
            __CLR4_4_1hs9hs9lgchorgi.R.inc(23384);test1.compareTo(null);
            __CLR4_4_1hs9hs9lgchorgi.R.inc(23385);fail();
        } catch (NullPointerException ex) {
        }
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testIsEqual() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s9e1z3i1m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testIsEqual",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23386,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s9e1z3i1m(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23386);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23387);DateMidnight test1 = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23388);DateMidnight test1a = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23389);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23390);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23391);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23392);assertEquals(true, test1a.isEqual(test1a));

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23393);DateMidnight test2 = new DateMidnight(TEST_TIME2_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23394);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23395);assertEquals(false, test2.isEqual(test1));

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23396);DateMidnight test3 = new DateMidnight(TEST_TIME2_UTC, GREGORIAN_PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23397);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23398);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23399);assertEquals(false, test3.isEqual(test2));  // midnight paris before london

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23400);assertEquals(false, test2.isEqual(new MockInstant()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23401);assertEquals(true, test1.isEqual(new MockInstant()));

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23402);assertEquals(false, new DateMidnight(TEST_TIME_NOW_UTC + DateTimeConstants.MILLIS_PER_DAY, DateTimeZone.UTC).isEqual(null));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23403);assertEquals(true, new DateMidnight(TEST_TIME_NOW_UTC, DateTimeZone.UTC).isEqual(null));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23404);assertEquals(false, new DateMidnight(TEST_TIME_NOW_UTC - DateTimeConstants.MILLIS_PER_DAY, DateTimeZone.UTC).isEqual(null));

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23405);assertEquals(false, new DateMidnight(2004, 6, 9).isEqual(new DateTime(2004, 6, 8, 23, 59, 59, 999)));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23406);assertEquals(true, new DateMidnight(2004, 6, 9).isEqual(new DateTime(2004, 6, 9, 0, 0, 0, 0)));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23407);assertEquals(false, new DateMidnight(2004, 6, 9).isEqual(new DateTime(2004, 6, 9, 0, 0, 0, 1)));
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testIsBefore() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rmvj2i28();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testIsBefore",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23408,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rmvj2i28(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23408);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23409);DateMidnight test1 = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23410);DateMidnight test1a = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23411);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23412);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23413);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23414);assertEquals(false, test1a.isBefore(test1a));

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23415);DateMidnight test2 = new DateMidnight(TEST_TIME2_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23416);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23417);assertEquals(false, test2.isBefore(test1));

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23418);DateMidnight test3 = new DateMidnight(TEST_TIME2_UTC, GREGORIAN_PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23419);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23420);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23421);assertEquals(true, test3.isBefore(test2));  // midnight paris before london

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23422);assertEquals(false, test2.isBefore(new MockInstant()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23423);assertEquals(false, test1.isBefore(new MockInstant()));

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23424);assertEquals(false, new DateMidnight(TEST_TIME_NOW_UTC + DateTimeConstants.MILLIS_PER_DAY, DateTimeZone.UTC).isBefore(null));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23425);assertEquals(false, new DateMidnight(TEST_TIME_NOW_UTC, DateTimeZone.UTC).isBefore(null));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23426);assertEquals(true, new DateMidnight(TEST_TIME_NOW_UTC - DateTimeConstants.MILLIS_PER_DAY, DateTimeZone.UTC).isBefore(null));

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23427);assertEquals(false, new DateMidnight(2004, 6, 9).isBefore(new DateTime(2004, 6, 8, 23, 59, 59, 999)));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23428);assertEquals(false, new DateMidnight(2004, 6, 9).isBefore(new DateTime(2004, 6, 9, 0, 0, 0, 0)));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23429);assertEquals(true, new DateMidnight(2004, 6, 9).isBefore(new DateTime(2004, 6, 9, 0, 0, 0, 1)));
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testIsAfter() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ax1icni2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testIsAfter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ax1icni2u(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23430);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23431);DateMidnight test1 = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23432);DateMidnight test1a = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23433);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23434);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23435);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23436);assertEquals(false, test1a.isAfter(test1a));

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23437);DateMidnight test2 = new DateMidnight(TEST_TIME2_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23438);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23439);assertEquals(true, test2.isAfter(test1));

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23440);DateMidnight test3 = new DateMidnight(TEST_TIME2_UTC, GREGORIAN_PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23441);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23442);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23443);assertEquals(false, test3.isAfter(test2));  // midnight paris before london

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23444);assertEquals(true, test2.isAfter(new MockInstant()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23445);assertEquals(false, test1.isAfter(new MockInstant()));

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23446);assertEquals(true, new DateMidnight(TEST_TIME_NOW_UTC + DateTimeConstants.MILLIS_PER_DAY, DateTimeZone.UTC).isAfter(null));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23447);assertEquals(false, new DateMidnight(TEST_TIME_NOW_UTC, DateTimeZone.UTC).isAfter(null));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23448);assertEquals(false, new DateMidnight(TEST_TIME_NOW_UTC - DateTimeConstants.MILLIS_PER_DAY, DateTimeZone.UTC).isAfter(null));

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23449);assertEquals(true, new DateMidnight(2004, 6, 9).isAfter(new DateTime(2004, 6, 8, 23, 59, 59, 999)));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23450);assertEquals(false, new DateMidnight(2004, 6, 9).isAfter(new DateTime(2004, 6, 9, 0, 0, 0, 0)));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23451);assertEquals(false, new DateMidnight(2004, 6, 9).isAfter(new DateTime(2004, 6, 9, 0, 0, 0, 1)));
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9i3g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23452,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9i3g() throws Exception{try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23452);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23453);DateMidnight test = new DateMidnight(TEST_TIME_NOW_UTC);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23454);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23455);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23456);oos.writeObject(test);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23457);oos.close();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23458);byte[] bytes = baos.toByteArray();

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23459);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23460);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23461);DateMidnight result = (DateMidnight) ois.readObject();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23462);ois.close();

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23463);assertEquals(test, result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidi3s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidi3s(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23464);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23465);DateMidnight test = new DateMidnight(TEST_TIME_NOW_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23466);assertEquals("2002-06-09T00:00:00.000+01:00", test.toString());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23467);test = new DateMidnight(TEST_TIME_NOW_UTC, PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23468);assertEquals("2002-06-09T00:00:00.000+02:00", test.toString());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23469);test = new DateMidnight(TEST_TIME_NOW_UTC, NEWYORK);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23470);assertEquals("2002-06-08T00:00:00.000-04:00", test.toString());  // the 8th
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testToString_String() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llkh2xi3z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToString_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llkh2xi3z(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23471);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23472);DateMidnight test = new DateMidnight(TEST_TIME_NOW_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23473);assertEquals("2002 00", test.toString("yyyy HH"));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23474);assertEquals("2002-06-09T00:00:00.000+01:00", test.toString((String) null));
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testToString_String_String() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ne197i43();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToString_String_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ne197i43(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23475);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23476);DateMidnight test = new DateMidnight(TEST_TIME_NOW_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23477);assertEquals("Sun 9/6", test.toString("EEE d/M", Locale.ENGLISH));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23478);assertEquals("dim. 9/6", test.toString("EEE d/M", Locale.FRENCH));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23479);assertEquals("2002-06-09T00:00:00.000+01:00", test.toString(null, Locale.ENGLISH));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23480);assertEquals("Sun 9/6", test.toString("EEE d/M", null));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23481);assertEquals("2002-06-09T00:00:00.000+01:00", test.toString(null, null));
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testToString_DTFormatter() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxbkpsi4a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToString_DTFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxbkpsi4a(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23482);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23483);DateMidnight test = new DateMidnight(TEST_TIME_NOW_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23484);assertEquals("2002 00", test.toString(DateTimeFormat.forPattern("yyyy HH")));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23485);assertEquals("2002-06-09T00:00:00.000+01:00", test.toString((DateTimeFormatter) null));
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToInstant() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yip9h7i4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yip9h7i4e(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23486);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23487);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23488);Instant result = test.toInstant();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23489);assertEquals(TEST_TIME1_LONDON, result.getMillis());
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testToDateTime() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hmtfovi4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23490,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hmtfovi4i(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23490);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23491);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23492);DateTime result = test.toDateTime();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23493);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23494);assertEquals(TEST_TIME1_PARIS, result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23495);assertEquals(PARIS, result.getZone());
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testToDateTimeISO() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1udmnxgi4o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToDateTimeISO",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23496,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1udmnxgi4o(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23496);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23497);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23498);DateTime result = test.toDateTimeISO();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23499);assertSame(DateTime.class, result.getClass());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23500);assertSame(ISOChronology.class, result.getChronology().getClass());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23501);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23502);assertEquals(ISO_PARIS, result.getChronology());
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testToDateTime_DateTimeZone() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14hyneti4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToDateTime_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14hyneti4v(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23503);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23504);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23505);DateTime result = test.toDateTime(LONDON);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23506);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23507);assertEquals(TEST_TIME1_LONDON, result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23508);assertEquals(LONDON, result.getZone());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23509);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23510);result = test.toDateTime(PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23511);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23512);assertEquals(TEST_TIME1_LONDON, result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23513);assertEquals(PARIS, result.getZone());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23514);test = new DateMidnight(TEST_TIME1_UTC, PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23515);result = test.toDateTime((DateTimeZone) null);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23516);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23517);assertEquals(TEST_TIME1_PARIS, result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23518);assertEquals(LONDON, result.getZone());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23519);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23520);result = test.toDateTime((DateTimeZone) null);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23521);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23522);assertEquals(TEST_TIME1_LONDON, result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23523);assertEquals(LONDON, result.getZone());
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testToDateTime_Chronology() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fzqjjei5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToDateTime_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fzqjjei5g(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23524);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23525);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23526);DateTime result = test.toDateTime(ISO_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23527);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23528);assertEquals(TEST_TIME1_LONDON, result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23529);assertEquals(LONDON, result.getZone());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23530);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23531);result = test.toDateTime(GREGORIAN_PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23532);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23533);assertEquals(TEST_TIME1_LONDON, result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23534);assertEquals(GREGORIAN_PARIS, result.getChronology());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23535);test = new DateMidnight(TEST_TIME1_UTC, GREGORIAN_PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23536);result = test.toDateTime((Chronology) null);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23537);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23538);assertEquals(TEST_TIME1_PARIS, result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23539);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23540);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23541);result = test.toDateTime((Chronology) null);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23542);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23543);assertEquals(TEST_TIME1_LONDON, result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23544);assertEquals(ISO_DEFAULT, result.getChronology());
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testToMutableDateTime() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c071a3i61();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToMutableDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c071a3i61(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23545);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23546);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23547);MutableDateTime result = test.toMutableDateTime();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23548);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23549);assertEquals(ISO_PARIS, result.getChronology());
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testToMutableDateTimeISO() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c7exd4i66();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToMutableDateTimeISO",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c7exd4i66(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23550);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23551);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23552);MutableDateTime result = test.toMutableDateTimeISO();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23553);assertSame(MutableDateTime.class, result.getClass());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23554);assertSame(ISOChronology.class, result.getChronology().getClass());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23555);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23556);assertEquals(ISO_PARIS, result.getChronology());
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testToMutableDateTime_DateTimeZone() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0i321i6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToMutableDateTime_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0i321i6d(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23557);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23558);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23559);MutableDateTime result = test.toMutableDateTime(LONDON);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23560);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23561);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23562);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23563);result = test.toMutableDateTime(PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23564);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23565);assertEquals(ISO_PARIS, result.getChronology());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23566);test = new DateMidnight(TEST_TIME1_UTC, PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23567);result = test.toMutableDateTime((DateTimeZone) null);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23568);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23569);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23570);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23571);result = test.toMutableDateTime((DateTimeZone) null);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23572);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23573);assertEquals(ISO_DEFAULT, result.getChronology());
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testToMutableDateTime_Chronology() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yi6xe2i6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToMutableDateTime_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yi6xe2i6u(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23574);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23575);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23576);MutableDateTime result = test.toMutableDateTime(ISO_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23577);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23578);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23579);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23580);result = test.toMutableDateTime(GREGORIAN_PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23581);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23582);assertEquals(GREGORIAN_PARIS, result.getChronology());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23583);test = new DateMidnight(TEST_TIME1_UTC, GREGORIAN_PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23584);result = test.toMutableDateTime((Chronology) null);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23585);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23586);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23587);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23588);result = test.toMutableDateTime((Chronology) null);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23589);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23590);assertEquals(ISO_DEFAULT, result.getChronology());
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testToDate() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wvdkgyi7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23591,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wvdkgyi7b(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23591);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23592);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23593);Date result = test.toDate();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23594);assertEquals(test.getMillis(), result.getTime());
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testToCalendar_Locale() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ez8ojvi7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToCalendar_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23595,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ez8ojvi7f(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23595);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23596);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23597);Calendar result = test.toCalendar(null);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23598);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23599);assertEquals(TimeZone.getTimeZone("Europe/London"), result.getTimeZone());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23600);test = new DateMidnight(TEST_TIME1_UTC, PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23601);result = test.toCalendar(null);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23602);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23603);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23604);test = new DateMidnight(TEST_TIME1_UTC, PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23605);result = test.toCalendar(Locale.UK);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23606);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23607);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testToGregorianCalendar() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zoxa6i7s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToGregorianCalendar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23608,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zoxa6i7s(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23608);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23609);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23610);GregorianCalendar result = test.toGregorianCalendar();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23611);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23612);assertEquals(TimeZone.getTimeZone("Europe/London"), result.getTimeZone());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23613);test = new DateMidnight(TEST_TIME1_UTC, PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23614);result = test.toGregorianCalendar();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23615);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23616);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToYearMonthDay() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c6rzn1i81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToYearMonthDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c6rzn1i81(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23617);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23618);DateMidnight base = new DateMidnight(TEST_TIME1_UTC, COPTIC_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23619);YearMonthDay test = base.toYearMonthDay();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23620);assertEquals(new YearMonthDay(TEST_TIME1_UTC, COPTIC_DEFAULT), test);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testToLocalDate() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1oriri85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1oriri85(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23621);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23622);DateMidnight base = new DateMidnight(TEST_TIME1_UTC, COPTIC_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23623);LocalDate test = base.toLocalDate();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23624);assertEquals(new LocalDate(TEST_TIME1_UTC, COPTIC_DEFAULT), test);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testToInterval() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cj50gpi89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testToInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23625,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cj50gpi89(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23625);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23626);DateMidnight base = new DateMidnight(TEST_TIME1_UTC, COPTIC_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23627);Interval test = base.toInterval();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23628);DateMidnight end = base.plus(Period.days(1));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23629);assertEquals(new Interval(base, end), test);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithMillis_long() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n9ypzwi8e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithMillis_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n9ypzwi8e(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23630);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23631);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23632);DateMidnight result = test.withMillis(TEST_TIME2_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23633);assertEquals(TEST_TIME2_LONDON, result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23634);assertEquals(test.getChronology(), result.getChronology());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23635);test = new DateMidnight(TEST_TIME1_UTC, GREGORIAN_PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23636);result = test.withMillis(TEST_TIME2_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23637);assertEquals(TEST_TIME2_PARIS, result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23638);assertEquals(test.getChronology(), result.getChronology());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23639);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23640);result = test.withMillis(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23641);assertSame(test, result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testWithChronology_Chronology() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_133y836i8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithChronology_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_133y836i8q(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23642);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23643);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23644);DateMidnight result = test.withChronology(GREGORIAN_PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23645);assertEquals(TEST_TIME1_LONDON, test.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23646);assertEquals(TEST_TIME1_PARIS, result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23647);assertEquals(GREGORIAN_PARIS, result.getChronology());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23648);test = new DateMidnight(TEST_TIME1_UTC, GREGORIAN_PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23649);result = test.withChronology(null);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23650);assertEquals(TEST_TIME1_PARIS, test.getMillis());
        // midnight Paris is previous day in London
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23651);assertEquals(TEST_TIME1_LONDON - DateTimeConstants.MILLIS_PER_DAY, result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23652);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23653);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23654);result = test.withChronology(null);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23655);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23656);assertEquals(ISO_DEFAULT, result.getChronology());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23657);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23658);result = test.withChronology(ISO_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23659);assertSame(test, result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testWithZoneRetainFields_DateTimeZone() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15pa2s5i98();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithZoneRetainFields_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15pa2s5i98(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23660);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23661);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23662);DateMidnight result = test.withZoneRetainFields(PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23663);assertEquals(TEST_TIME1_LONDON, test.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23664);assertEquals(TEST_TIME1_PARIS, result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23665);assertEquals(ISO_PARIS, result.getChronology());

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23666);test = new DateMidnight(TEST_TIME1_UTC, GREGORIAN_PARIS);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23667);result = test.withZoneRetainFields(null);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23668);assertEquals(TEST_TIME1_PARIS, test.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23669);assertEquals(TEST_TIME1_LONDON, result.getMillis());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23670);assertEquals(GREGORIAN_DEFAULT, result.getChronology());
        
    /*
        test = new DateMidnight(TEST_TIME1_UTC);
        result = test.withZoneRetainFields(LONDON);
        assertSame(test, result);
        
        test = new DateMidnight(TEST_TIME1_UTC);
        result = test.withZoneRetainFields(null);
        assertSame(test, result);
        
        test = new DateMidnight(TEST_TIME1_UTC, new MockNullZoneChronology());
        result = test.withZoneRetainFields(LONDON);
        assertSame(test, result);
    */
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithFields_RPartial() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1812bvoi9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFields_RPartial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23671,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1812bvoi9j(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23671);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23672);DateMidnight test = new DateMidnight(2004, 5, 6);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23673);DateMidnight result = test.withFields(new YearMonthDay(2003, 4, 5));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23674);DateMidnight expected = new DateMidnight(2003, 4, 5);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23675);assertEquals(expected, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23676);test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23677);result = test.withFields(null);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23678);assertSame(test, result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithField1() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lke16yi9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithField1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lke16yi9r(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23679);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23680);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23681);DateMidnight result = test.withField(DateTimeFieldType.year(), 2006);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23682);assertEquals(new DateMidnight(2004, 6, 9), test);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23683);assertEquals(new DateMidnight(2006, 6, 9), result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testWithField2() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ibe2ehi9w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithField2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ibe2ehi9w(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23684);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23685);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23686);try {
            __CLR4_4_1hs9hs9lgchorgi.R.inc(23687);test.withField(null, 6);
            __CLR4_4_1hs9hs9lgchorgi.R.inc(23688);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithFieldAdded1() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rgt22ia1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFieldAdded1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rgt22ia1(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23689);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23690);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23691);DateMidnight result = test.withFieldAdded(DurationFieldType.years(), 6);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23692);assertEquals(new DateMidnight(2004, 6, 9), test);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23693);assertEquals(new DateMidnight(2010, 6, 9), result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded2() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_150grujia6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFieldAdded2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_150grujia6(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23694);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23695);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23696);try {
            __CLR4_4_1hs9hs9lgchorgi.R.inc(23697);test.withFieldAdded(null, 0);
            __CLR4_4_1hs9hs9lgchorgi.R.inc(23698);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded3() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189gqn0iab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFieldAdded3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189gqn0iab(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23699);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23700);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23701);try {
            __CLR4_4_1hs9hs9lgchorgi.R.inc(23702);test.withFieldAdded(null, 6);
            __CLR4_4_1hs9hs9lgchorgi.R.inc(23703);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded4() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bigpfhiag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithFieldAdded4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bigpfhiag(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23704);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23705);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23706);DateMidnight result = test.withFieldAdded(DurationFieldType.years(), 0);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23707);assertSame(test, result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithDurationAdded_long_int() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q11w3iiak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithDurationAdded_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23708,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q11w3iiak(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23708);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23709);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23710);DateMidnight result = test.withDurationAdded(123456789L, 1);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23711);DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23712);assertEquals(expected, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23713);result = test.withDurationAdded(123456789L, 0);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23714);assertSame(test, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23715);result = test.withDurationAdded(123456789L, 2);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23716);expected = new DateMidnight(test.getMillis() + (2L * 123456789L), BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23717);assertEquals(expected, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23718);result = test.withDurationAdded(123456789L, -3);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23719);expected = new DateMidnight(test.getMillis() - (3L * 123456789L), BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23720);assertEquals(expected, result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithDurationAdded_RD_int() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hcnxxoiax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithDurationAdded_RD_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23721,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hcnxxoiax(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23721);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23722);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23723);DateMidnight result = test.withDurationAdded(new Duration(123456789L), 1);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23724);DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23725);assertEquals(expected, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23726);result = test.withDurationAdded(null, 1);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23727);assertSame(test, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23728);result = test.withDurationAdded(new Duration(123456789L), 0);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23729);assertSame(test, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23730);result = test.withDurationAdded(new Duration(123456789L), 2);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23731);expected = new DateMidnight(test.getMillis() + (2L * 123456789L), BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23732);assertEquals(expected, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23733);result = test.withDurationAdded(new Duration(123456789L), -3);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23734);expected = new DateMidnight(test.getMillis() - (3L * 123456789L), BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23735);assertEquals(expected, result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithDurationAdded_RP_int() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1by6igwibc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testWithDurationAdded_RP_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1by6igwibc(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23736);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23737);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23738);DateMidnight result = test.withPeriodAdded(new Period(1, 2, 3, 4, 5, 6, 7, 8), 1);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23739);DateMidnight expected = new DateMidnight(2003, 7, 28, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23740);assertEquals(expected, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23741);result = test.withPeriodAdded(null, 1);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23742);assertSame(test, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23743);result = test.withPeriodAdded(new Period(1, 2, 3, 4, 5, 6, 7, 8), 0);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23744);assertSame(test, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23745);result = test.withPeriodAdded(new Period(1, 2, 0, 4, 5, 6, 7, 8), 3);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23746);expected = new DateMidnight(2005, 11, 15, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23747);assertEquals(expected, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23748);result = test.withPeriodAdded(new Period(1, 2, 0, 1, 1, 2, 3, 4), -1);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23749);expected = new DateMidnight(2001, 3, 1, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23750);assertEquals(expected, result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    //-----------------------------------------------------------------------    
    @Test
    public void testPlus_long() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dfcomibr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlus_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dfcomibr(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23751);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23752);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23753);DateMidnight result = test.plus(123456789L);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23754);DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23755);assertEquals(expected, result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testPlus_RD() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_121wcz0ibw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlus_RD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23756,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_121wcz0ibw(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23756);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23757);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23758);DateMidnight result = test.plus(new Duration(123456789L));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23759);DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23760);assertEquals(expected, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23761);result = test.plus((ReadableDuration) null);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23762);assertSame(test, result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testPlus_RP() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz83igic3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz83igic3(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23763);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23764);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23765);DateMidnight result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23766);DateMidnight expected = new DateMidnight(2003, 7, 28, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23767);assertEquals(expected, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23768);result = test.plus((ReadablePeriod) null);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23769);assertSame(test, result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testPlusYears_int() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mx5kptica();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mx5kptica(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23770);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23771);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23772);DateMidnight result = test.plusYears(1);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23773);DateMidnight expected = new DateMidnight(2003, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23774);assertEquals(expected, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23775);result = test.plusYears(0);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23776);assertSame(test, result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testPlusMonths_int() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170gxaiich();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23777,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170gxaiich(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23777);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23778);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23779);DateMidnight result = test.plusMonths(1);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23780);DateMidnight expected = new DateMidnight(2002, 6, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23781);assertEquals(expected, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23782);result = test.plusMonths(0);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23783);assertSame(test, result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testPlusWeeks_int() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eupheeico();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusWeeks_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eupheeico(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23784);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23785);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23786);DateMidnight result = test.plusWeeks(1);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23787);DateMidnight expected = new DateMidnight(2002, 5, 10, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23788);assertEquals(expected, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23789);result = test.plusWeeks(0);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23790);assertSame(test, result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testPlusDays_int() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpmvkqicv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testPlusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpmvkqicv(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23791);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23792);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23793);DateMidnight result = test.plusDays(1);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23794);DateMidnight expected = new DateMidnight(2002, 5, 4, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23795);assertEquals(expected, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23796);result = test.plusDays(0);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23797);assertSame(test, result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    //-----------------------------------------------------------------------    
    @Test
    public void testMinus_long() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gse7d0id2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinus_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23798,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gse7d0id2(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23798);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23799);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23800);DateMidnight result = test.minus(123456789L);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23801);DateMidnight expected = new DateMidnight(test.getMillis() - 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23802);assertEquals(expected, result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testMinus_RD() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uyrr3uid7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinus_RD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uyrr3uid7(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23803);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23804);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23805);DateMidnight result = test.minus(new Duration(123456789L));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23806);DateMidnight expected = new DateMidnight(test.getMillis() - 123456789L, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23807);assertEquals(expected, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23808);result = test.minus((ReadableDuration) null);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23809);assertSame(test, result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testMinus_RP() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112cpdmide();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112cpdmide(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23810);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23811);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23812);DateMidnight result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23813);DateMidnight expected = new DateMidnight(2001, 3, 25, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23814);assertEquals(expected, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23815);result = test.minus((ReadablePeriod) null);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23816);assertSame(test, result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testMinusYears_int() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9qdinidl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9qdinidl(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23817);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23818);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23819);DateMidnight result = test.minusYears(1);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23820);DateMidnight expected = new DateMidnight(2001, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23821);assertEquals(expected, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23822);result = test.minusYears(0);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23823);assertSame(test, result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testMinusMonths_int() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6k4goids();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23824,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6k4goids(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23824);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23825);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23826);DateMidnight result = test.minusMonths(1);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23827);DateMidnight expected = new DateMidnight(2002, 4, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23828);assertEquals(expected, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23829);result = test.minusMonths(0);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23830);assertSame(test, result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testMinusWeeks_int() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fi4olkidz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusWeeks_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fi4olkidz(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23831);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23832);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23833);DateMidnight result = test.minusWeeks(1);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23834);DateMidnight expected = new DateMidnight(2002, 4, 26, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23835);assertEquals(expected, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23836);result = test.minusWeeks(0);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23837);assertSame(test, result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    @Test
    public void testMinusDays_int() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hpufckie6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testMinusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hpufckie6(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23838);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23839);DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23840);DateMidnight result = test.minusDays(1);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23841);DateMidnight expected = new DateMidnight(2002, 5, 2, BUDDHIST_DEFAULT);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23842);assertEquals(expected, result);

        __CLR4_4_1hs9hs9lgchorgi.R.inc(23843);result = test.minusDays(0);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23844);assertSame(test, result);
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testProperty() {__CLR4_4_1hs9hs9lgchorgi.R.globalSliceStart(getClass().getName(),23845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7neoiied();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hs9hs9lgchorgi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hs9hs9lgchorgi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Basics.testProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23845,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7neoiied(){try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23845);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23846);DateMidnight test = new DateMidnight();
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23847);assertEquals(test.year(), test.property(DateTimeFieldType.year()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23848);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23849);assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23850);assertEquals(test.property(DateTimeFieldType.millisOfSecond()), test.property(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23851);DateTimeFieldType bad = new DateTimeFieldType("bad") {
            private static final long serialVersionUID = 1L;

            public DurationFieldType getDurationType() {try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23852);
                __CLR4_4_1hs9hs9lgchorgi.R.inc(23853);return DurationFieldType.weeks();
            }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

            public DurationFieldType getRangeDurationType() {try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23854);
                __CLR4_4_1hs9hs9lgchorgi.R.inc(23855);return null;
            }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

            public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23856);
                __CLR4_4_1hs9hs9lgchorgi.R.inc(23857);return UnsupportedDateTimeField.getInstance(this, UnsupportedDurationField.getInstance(getDurationType()));
            }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}
        };
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23858);try {
            __CLR4_4_1hs9hs9lgchorgi.R.inc(23859);test.property(bad);
            __CLR4_4_1hs9hs9lgchorgi.R.inc(23860);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23861);try {
            __CLR4_4_1hs9hs9lgchorgi.R.inc(23862);test.property(null);
            __CLR4_4_1hs9hs9lgchorgi.R.inc(23863);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(DateMidnight test, int year, int month, int day) {try{__CLR4_4_1hs9hs9lgchorgi.R.inc(23864);
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23865);assertEquals(year, test.getYear());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23866);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1hs9hs9lgchorgi.R.inc(23867);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1hs9hs9lgchorgi.R.flushNeeded();}}

}
