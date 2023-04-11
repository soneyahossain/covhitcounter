/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2006 Stephen Colebourne
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
package org.joda.time.format;

import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.GJChronology;
import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.NameProvider;

/**
 * This class is a Junit unit test for DateTime Formating.
 *
 * @author Stephen Colebourne
 * @author Fredrik Borgh
 */
public class TestDateTimeFormat {static class __CLR4_4_11i1y1i1ylgchosv4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,70904,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEWYORK = DateTimeZone.forID("America/New_York");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 +
            365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70054);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70055);TestDateTimeFormat TB = new TestDateTimeFormat();

//trace 1 tests---------------------------------------------------------------------------------------------------
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70056);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70057);TB.testSubclassableConstructor();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70058);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70059);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70060);TB.testFormat_era();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70061);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70062);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70063);TB.testFormat_centuryOfEra();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70064);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70065);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70066);TB.testFormat_yearOfEra();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70067);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70068);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70069);TB.testFormat_yearOfEra_twoDigit();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70070);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70071);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70072);TB.testFormat_yearOfEraParse();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70073);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70074);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70075);TB.testFormat_year();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70076);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70077);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70078);TB.testFormat_year_twoDigit();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70079);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70080);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70081);TB.testFormat_year_long();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70082);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70083);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70084);TB.testFormat_weekyear();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70085);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70086);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70087);TB.testFormat_weekyearOfEra_twoDigit();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70088);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70089);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70090);TB.testFormat_weekOfWeekyear();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70091);TB.tearDown();

//trace 2 tests---------------------------------------------------------------------------------------------------

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70092);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70093);TB.testFormat_dayOfWeek();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70094);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70095);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70096);TB.testFormat_dayOfWeekShortText();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70097);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70098);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70099);TB.testFormat_dayOfWeekText();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70100);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70101);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70102);TB.testFormat_dayOfYearText();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70103);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70104);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70105);TB.testFormat_monthOfYear();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70106);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70107);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70108);TB.testFormat_monthOfYearShortText();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70109);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70110);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70111);TB.testFormat_monthOfYearText();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70112);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70113);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70114);TB.testFormat_dayOfMonth();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70115);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70116);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70117);TB.testFormat_halfdayOfDay();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70118);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70119);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70120);TB.testFormat_hourOfHalfday();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70121);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70122);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70123);TB.testFormat_clockhourOfHalfday();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70124);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70125);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70126);TB.testFormat_hourOfDay();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70127);TB.tearDown();

//trace 3 tests---------------------------------------------------------------------------------------------------
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70128);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70129);TB.testFormat_clockhourOfDay();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70130);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70131);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70132);TB.testFormat_minute();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70133);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70134);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70135);TB.testFormat_second();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70136);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70137);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70138);TB.testFormat_fractionOfSecond();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70139);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70140);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70141);TB.testFormat_fractionOfSecondLong();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70142);TB.tearDown();


        //below two tests throw java runtime long method error, excluded them from trace gen -_-
        //TB.setUp(); TB.testFormat_zoneText(); TB.tearDown();
        //TB.setUp(); TB.testFormat_zoneLongText(); TB.tearDown();


//trace 4 tests---------------------------------------------------------------------------------------------------
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70143);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70144);TB.testFormat_zoneAmount();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70145);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70146);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70147);TB.testFormat_zoneAmountColon();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70148);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70149);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70150);TB.testFormat_zoneAmountID();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70151);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70152);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70153);TB.testFormat_other();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70154);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70155);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70156);TB.testFormat_invalid();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70157);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70158);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70159);TB.testFormat_samples();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70160);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70161);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70162);TB.testFormat_shortBasicParse();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70163);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70164);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70165);TB.testParse_pivotYear();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70166);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70167);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70168);TB.testParse_pivotYear_ignored4DigitYear();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70169);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70170);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70171);TB.testFormatParse_textMonthJanShort_UK();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70172);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70173);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70174);TB.testFormatParse_textMonthJanShortLowerCase_UK();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70175);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70176);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70177);TB.testFormatParse_textMonthJanShortUpperCase_UK();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70178);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70179);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70180);TB.testParse_textMonthJanLong_UK();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70181);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70182);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70183);TB.testFormatParse_textMonthJanLongLowerCase_UK();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70184);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70185);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70186);TB.testFormatParse_textMonthJanLongUpperCase_UK();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70187);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70188);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70189);TB.testFormatParse_textMonthJanShort_France();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70190);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70191);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70192);TB.testFormatParse_textMonthJanLong_France();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70193);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70194);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70195);TB.testFormatParse_textMonthApr_France();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70196);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70197);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70198);TB.testFormatParse_textMonthAtEnd_France();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70199);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70200);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70201);TB.testFormatParse_textMonthAtEnd_France_withSpecifiedDefault();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70202);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70203);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70204);TB.testFormatParse_textMonthApr_Korean();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70205);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70206);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70207);TB.testFormatParse_textHalfdayAM_UK();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70208);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70209);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70210);TB.testFormatParse_textHalfdayAM_France();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70211);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70212);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70213);TB.testFormatParse_textEraAD_UK();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70214);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70215);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70216);TB.testFormatParse_textEraAD_France();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70217);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70218);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70219);TB.testFormatParse_textEraBC_France();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70220);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70221);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70222);TB.testFormatParse_textYear_UK();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70223);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70224);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70225);TB.testFormatParse_textYear_France();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70226);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70227);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70228);TB.testFormatParse_textAdjoiningHelloWorld_UK();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70229);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70230);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70231);TB.testFormatParse_textAdjoiningMonthDOW_UK();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70232);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70233);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70234);TB.testFormatParse_zoneId_noColon();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70235);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70236);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70237);TB.testFormatParse_zoneId_noColon_parseZ();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70238);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70239);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70240);TB.testFormatParse_zoneId_colon();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70241);TB.tearDown();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70242);TB.setUp();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70243);TB.testFormatParse_zoneId_colon_parseZ();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70244);TB.tearDown();


    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestDateTimeFormat.class);
    }

    public TestDateTimeFormat(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70245);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70246);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70247);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70248);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70249);originalLocale = Locale.getDefault();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70250);DateTimeZone.setDefault(LONDON);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70251);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70252);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70253);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70254);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70255);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70256);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70257);Locale.setDefault(originalLocale);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70258);originalDateTimeZone = null;
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70259);originalTimeZone = null;
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70260);originalLocale = null;
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSubclassableConstructor() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pm293x1i7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testSubclassableConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pm293x1i7p(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70261);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70262);DateTimeFormat f = new DateTimeFormat() {
            // test constructor is protected
        };
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70263);assertNotNull(f);
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_era() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pcpcmz1i7s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_era",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70264,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pcpcmz1i7s(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70264);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70265);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70266);DateTimeFormatter f = DateTimeFormat.forPattern("G").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70267);assertEquals(dt.toString(), "AD", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70268);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70269);assertEquals(dt.toString(), "AD", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70270);dt = dt.withZone(PARIS);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70271);assertEquals(dt.toString(), "AD", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_centuryOfEra() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f8a7uu1i80();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_centuryOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f8a7uu1i80(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70272);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70273);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70274);DateTimeFormatter f = DateTimeFormat.forPattern("C").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70275);assertEquals(dt.toString(), "20", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70276);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70277);assertEquals(dt.toString(), "20", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70278);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70279);assertEquals(dt.toString(), "20", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70280);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70281);assertEquals(dt.toString(), "1", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_yearOfEra() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e97w351i8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_yearOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e97w351i8a(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70282);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70283);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70284);DateTimeFormatter f = DateTimeFormat.forPattern("Y").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70285);assertEquals(dt.toString(), "2004", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70286);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70287);assertEquals(dt.toString(), "2004", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70288);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70289);assertEquals(dt.toString(), "2004", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70290);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70291);assertEquals(dt.toString(), "124", f.print(dt));  // 124th year of BCE
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormat_yearOfEra_twoDigit() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i612d91i8k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_yearOfEra_twoDigit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i612d91i8k(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70292);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70293);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70294);DateTimeFormatter f = DateTimeFormat.forPattern("YY").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70295);assertEquals(dt.toString(), "04", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70296);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70297);assertEquals(dt.toString(), "23", f.print(dt));

        // current time set to 2002-06-09
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70298);f = f.withZoneUTC();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70299);DateTime expect = null;
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70300);expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70301);assertEquals(expect, f.parseDateTime("04"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70302);expect = new DateTime(1922, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70303);assertEquals(expect, f.parseDateTime("22"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70304);expect = new DateTime(2021, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70305);assertEquals(expect, f.parseDateTime("21"));

        // Added tests to ensure single sign digit parse fails properly
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70306);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70307);f.parseDateTime("-");
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70308);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70309);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70310);f.parseDateTime("+");
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70311);fail();
        } catch (IllegalArgumentException ex) {
        }

        // Added tests for pivot year setting
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70312);f = f.withPivotYear(new Integer(2050));
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70313);expect = new DateTime(2000, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70314);assertEquals(expect, f.parseDateTime("00"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70315);expect = new DateTime(2099, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70316);assertEquals(expect, f.parseDateTime("99"));

        // Added tests to ensure two digit parsing is lenient for DateTimeFormat
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70317);f = DateTimeFormat.forPattern("YY").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70318);f = f.withZoneUTC();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70319);f.parseDateTime("5");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70320);f.parseDateTime("005");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70321);f.parseDateTime("+50");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70322);f.parseDateTime("-50");
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormat_yearOfEraParse() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1skt8a81i9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_yearOfEraParse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1skt8a81i9f(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70323);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70324);Chronology chrono = GJChronology.getInstanceUTC();

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70325);DateTimeFormatter f = DateTimeFormat
                .forPattern("YYYY-MM GG")
                .withChronology(chrono)
                .withLocale(Locale.UK);

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70326);DateTime dt = new DateTime(2005, 10, 1, 0, 0, 0, 0, chrono);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70327);assertEquals(dt, f.parseDateTime("2005-10 AD"));
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70328);assertEquals(dt, f.parseDateTime("2005-10 CE"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70329);dt = new DateTime(-2005, 10, 1, 0, 0, 0, 0, chrono);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70330);assertEquals(dt, f.parseDateTime("2005-10 BC"));
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70331);assertEquals(dt, f.parseDateTime("2005-10 BCE"));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_year() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fu0epm1i9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_year",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fu0epm1i9o(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70332);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70333);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70334);DateTimeFormatter f = DateTimeFormat.forPattern("y").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70335);assertEquals(dt.toString(), "2004", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70336);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70337);assertEquals(dt.toString(), "2004", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70338);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70339);assertEquals(dt.toString(), "2004", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70340);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70341);assertEquals(dt.toString(), "-123", f.print(dt));

        // Added tests to ensure single sign digit parse fails properly
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70342);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70343);f.parseDateTime("-");
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70344);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70345);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70346);f.parseDateTime("+");
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70347);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormat_year_twoDigit() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dsg0k1ia4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_year_twoDigit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dsg0k1ia4(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70348);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70349);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70350);DateTimeFormatter f = DateTimeFormat.forPattern("yy").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70351);assertEquals(dt.toString(), "04", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70352);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70353);assertEquals(dt.toString(), "23", f.print(dt));

        // current time set to 2002-06-09
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70354);f = f.withZoneUTC();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70355);DateTime expect = null;
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70356);expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70357);assertEquals(expect, f.parseDateTime("04"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70358);expect = new DateTime(1922, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70359);assertEquals(expect, f.parseDateTime("22"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70360);expect = new DateTime(2021, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70361);assertEquals(expect, f.parseDateTime("21"));

        // Added tests to ensure single sign digit parse fails properly
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70362);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70363);f.parseDateTime("-");
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70364);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70365);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70366);f.parseDateTime("+");
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70367);fail();
        } catch (IllegalArgumentException ex) {
        }

        // Added tests for pivot year setting
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70368);f = f.withPivotYear(new Integer(2050));
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70369);expect = new DateTime(2000, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70370);assertEquals(expect, f.parseDateTime("00"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70371);expect = new DateTime(2099, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70372);assertEquals(expect, f.parseDateTime("99"));

        // Added tests to ensure two digit parsing is strict by default for
        // DateTimeFormatterBuilder
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70373);f = new DateTimeFormatterBuilder().appendTwoDigitYear(2000).toFormatter();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70374);f = f.withZoneUTC();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70375);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70376);f.parseDateTime("5");
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70377);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70378);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70379);f.parseDateTime("005");
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70380);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70381);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70382);f.parseDateTime("+50");
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70383);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70384);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70385);f.parseDateTime("-50");
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70386);fail();
        } catch (IllegalArgumentException ex) {
        }

        // Added tests to ensure two digit parsing is lenient for DateTimeFormat
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70387);f = DateTimeFormat.forPattern("yy").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70388);f = f.withZoneUTC();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70389);f.parseDateTime("5");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70390);f.parseDateTime("005");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70391);f.parseDateTime("+50");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70392);f.parseDateTime("-50");

        // Added tests for lenient two digit parsing
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70393);f = new DateTimeFormatterBuilder().appendTwoDigitYear(2000, true).toFormatter();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70394);f = f.withZoneUTC();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70395);expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70396);assertEquals(expect, f.parseDateTime("04"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70397);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70398);assertEquals(expect, f.parseDateTime("+04"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70399);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70400);assertEquals(expect, f.parseDateTime("-04"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70401);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70402);assertEquals(expect, f.parseDateTime("4"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70403);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70404);assertEquals(expect, f.parseDateTime("-4"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70405);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70406);assertEquals(expect, f.parseDateTime("004"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70407);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70408);assertEquals(expect, f.parseDateTime("+004"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70409);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70410);assertEquals(expect, f.parseDateTime("-004"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70411);expect = new DateTime(3004, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70412);assertEquals(expect, f.parseDateTime("3004"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70413);expect = new DateTime(3004, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70414);assertEquals(expect, f.parseDateTime("+3004"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70415);expect = new DateTime(-3004, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70416);assertEquals(expect, f.parseDateTime("-3004"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70417);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70418);f.parseDateTime("-");
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70419);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70420);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70421);f.parseDateTime("+");
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70422);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormat_year_long() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bvz1u91ic7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_year_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70423,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bvz1u91ic7(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70423);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70424);DateTime dt = new DateTime(278004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70425);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70426);assertEquals(dt.toString(), "278004", f.print(dt));

        // for coverage
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70427);f = DateTimeFormat.forPattern("yyyyMMdd");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70428);assertEquals(dt.toString(), "2780040609", f.print(dt));

        // for coverage
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70429);f = DateTimeFormat.forPattern("yyyyddMM");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70430);assertEquals(dt.toString(), "2780040906", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_weekyear() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bcb9im1icf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_weekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bcb9im1icf(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70431);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70432);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70433);DateTimeFormatter f = DateTimeFormat.forPattern("x").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70434);assertEquals(dt.toString(), "2004", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70435);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70436);assertEquals(dt.toString(), "2004", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70437);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70438);assertEquals(dt.toString(), "2004", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70439);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70440);assertEquals(dt.toString(), "-123", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormat_weekyearOfEra_twoDigit() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l21qhb1icp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_weekyearOfEra_twoDigit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70441,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l21qhb1icp(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70441);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70442);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70443);DateTimeFormatter f = DateTimeFormat.forPattern("xx").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70444);assertEquals(dt.toString(), "04", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70445);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70446);assertEquals(dt.toString(), "23", f.print(dt));

        // current time set to 2002-06-09
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70447);f = f.withZoneUTC();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70448);DateTime expect = null;
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70449);expect = new DateTime(2003, 12, 29, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70450);assertEquals(expect, f.parseDateTime("04"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70451);expect = new DateTime(1922, 1, 2, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70452);assertEquals(expect, f.parseDateTime("22"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70453);expect = new DateTime(2021, 1, 4, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70454);assertEquals(expect, f.parseDateTime("21"));

        // Added tests to ensure single sign digit parse fails properly
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70455);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70456);f.parseDateTime("-");
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70457);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70458);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70459);f.parseDateTime("+");
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70460);fail();
        } catch (IllegalArgumentException ex) {
        }

        // Added tests for pivot year setting
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70461);f = f.withPivotYear(new Integer(2050));
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70462);expect = new DateTime(2000, 1, 3, 0, 0, 0, 0, DateTimeZone.UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70463);assertEquals(expect, f.parseDateTime("00"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70464);expect = new DateTime(2098, 12, 29, 0, 0, 0, 0, DateTimeZone.UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70465);assertEquals(expect, f.parseDateTime("99"));

        // Added tests to ensure two digit parsing is strict by default for
        // DateTimeFormatterBuilder
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70466);f = new DateTimeFormatterBuilder().appendTwoDigitWeekyear(2000).toFormatter();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70467);f = f.withZoneUTC();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70468);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70469);f.parseDateTime("5");
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70470);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70471);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70472);f.parseDateTime("005");
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70473);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70474);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70475);f.parseDateTime("+50");
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70476);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70477);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70478);f.parseDateTime("-50");
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70479);fail();
        } catch (IllegalArgumentException ex) {
        }

        // Added tests to ensure two digit parsing is lenient for DateTimeFormat
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70480);f = DateTimeFormat.forPattern("xx").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70481);f = f.withZoneUTC();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70482);f.parseDateTime("5");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70483);f.parseDateTime("005");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70484);f.parseDateTime("+50");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70485);f.parseDateTime("-50");

        // Added tests for lenient two digit parsing
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70486);f = new DateTimeFormatterBuilder().appendTwoDigitWeekyear(2000, true).toFormatter();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70487);f = f.withZoneUTC();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70488);expect = new DateTime(2003, 12, 29, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70489);assertEquals(expect, f.parseDateTime("04"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70490);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70491);assertEquals(expect, f.parseDateTime("+04"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70492);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70493);assertEquals(expect, f.parseDateTime("-04"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70494);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70495);assertEquals(expect, f.parseDateTime("4"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70496);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70497);assertEquals(expect, f.parseDateTime("-4"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70498);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70499);assertEquals(expect, f.parseDateTime("004"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70500);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70501);assertEquals(expect, f.parseDateTime("+004"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70502);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70503);assertEquals(expect, f.parseDateTime("-004"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70504);expect = new DateTime(3004, 1, 2, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70505);assertEquals(expect, f.parseDateTime("3004"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70506);expect = new DateTime(3004, 1, 2, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70507);assertEquals(expect, f.parseDateTime("+3004"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70508);expect = new DateTime(-3004, 1, 4, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70509);assertEquals(expect, f.parseDateTime("-3004"));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70510);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70511);f.parseDateTime("-");
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70512);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70513);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70514);f.parseDateTime("+");
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70515);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_weekOfWeekyear() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12gbtgn1ies();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_weekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12gbtgn1ies(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70516);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70517);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70518);DateTimeFormatter f = DateTimeFormat.forPattern("w").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70519);assertEquals(dt.toString(), "24", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70520);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70521);assertEquals(dt.toString(), "24", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70522);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70523);assertEquals(dt.toString(), "24", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_dayOfWeek() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wwsypk1if0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wwsypk1if0(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70524);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70525);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70526);DateTimeFormatter f = DateTimeFormat.forPattern("e").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70527);assertEquals(dt.toString(), "3", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70528);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70529);assertEquals(dt.toString(), "3", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70530);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70531);assertEquals(dt.toString(), "3", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_dayOfWeekShortText() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12s7ekh1if8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfWeekShortText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12s7ekh1if8(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70532);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70533);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70534);DateTimeFormatter f = DateTimeFormat.forPattern("E").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70535);assertEquals(dt.toString(), "Wed", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70536);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70537);assertEquals(dt.toString(), "Wed", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70538);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70539);assertEquals(dt.toString(), "Wed", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70540);f = f.withLocale(Locale.FRENCH);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70541);assertEquals(dt.toString(), "mer.", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_dayOfWeekText() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iu5bs51ifi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfWeekText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iu5bs51ifi(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70542);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70543);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70544);DateTimeFormatter f = DateTimeFormat.forPattern("EEEE").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70545);assertEquals(dt.toString(), "Wednesday", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70546);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70547);assertEquals(dt.toString(), "Wednesday", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70548);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70549);assertEquals(dt.toString(), "Wednesday", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70550);f = f.withLocale(Locale.FRENCH);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70551);assertEquals(dt.toString(), "mercredi", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_dayOfYearText() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19qbmnm1ifs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfYearText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19qbmnm1ifs(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70552);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70553);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70554);DateTimeFormatter f = DateTimeFormat.forPattern("D").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70555);assertEquals(dt.toString(), "161", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70556);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70557);assertEquals(dt.toString(), "161", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70558);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70559);assertEquals(dt.toString(), "161", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_monthOfYear() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143xtc51ig0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_monthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143xtc51ig0(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70560);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70561);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70562);DateTimeFormatter f = DateTimeFormat.forPattern("M").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70563);assertEquals(dt.toString(), "6", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70564);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70565);assertEquals(dt.toString(), "6", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70566);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70567);assertEquals(dt.toString(), "6", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_monthOfYearShortText() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1goku8i1ig8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_monthOfYearShortText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70568,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1goku8i1ig8(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70568);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70569);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70570);DateTimeFormatter f = DateTimeFormat.forPattern("MMM").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70571);assertEquals(dt.toString(), "Jun", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70572);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70573);assertEquals(dt.toString(), "Jun", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70574);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70575);assertEquals(dt.toString(), "Jun", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70576);f = f.withLocale(Locale.FRENCH);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70577);assertEquals(dt.toString(), "juin", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_monthOfYearText() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pm61yq1igi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_monthOfYearText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pm61yq1igi(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70578);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70579);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70580);DateTimeFormatter f = DateTimeFormat.forPattern("MMMM").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70581);assertEquals(dt.toString(), "June", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70582);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70583);assertEquals(dt.toString(), "June", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70584);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70585);assertEquals(dt.toString(), "June", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70586);f = f.withLocale(Locale.FRENCH);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70587);assertEquals(dt.toString(), "juin", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_dayOfMonth() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v30tpm1igs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v30tpm1igs(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70588);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70589);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70590);DateTimeFormatter f = DateTimeFormat.forPattern("d").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70591);assertEquals(dt.toString(), "9", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70592);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70593);assertEquals(dt.toString(), "9", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70594);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70595);assertEquals(dt.toString(), "9", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_halfdayOfDay() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l06d951ih0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_halfdayOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l06d951ih0(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70596);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70597);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70598);DateTimeFormatter f = DateTimeFormat.forPattern("a").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70599);assertEquals(dt.toString(), "AM", f.print(dt).toUpperCase(Locale.ENGLISH));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70600);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70601);assertEquals(dt.toString(), "AM", f.print(dt).toUpperCase(Locale.ENGLISH));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70602);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70603);assertEquals(dt.toString(), "PM", f.print(dt).toUpperCase(Locale.ENGLISH));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_hourOfHalfday() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aoip7l1ih8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_hourOfHalfday",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aoip7l1ih8(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70604);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70605);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70606);DateTimeFormatter f = DateTimeFormat.forPattern("K").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70607);assertEquals(dt.toString(), "10", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70608);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70609);assertEquals(dt.toString(), "6", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70610);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70611);assertEquals(dt.toString(), "7", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70612);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70613);assertEquals(dt.toString(), "0", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_clockhourOfHalfday() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v2d1oj1ihi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_clockhourOfHalfday",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v2d1oj1ihi(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70614);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70615);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70616);DateTimeFormatter f = DateTimeFormat.forPattern("h").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70617);assertEquals(dt.toString(), "10", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70618);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70619);assertEquals(dt.toString(), "6", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70620);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70621);assertEquals(dt.toString(), "7", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70622);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70623);assertEquals(dt.toString(), "12", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_hourOfDay() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z8vwnm1ihs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_hourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70624,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z8vwnm1ihs(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70624);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70625);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70626);DateTimeFormatter f = DateTimeFormat.forPattern("H").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70627);assertEquals(dt.toString(), "10", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70628);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70629);assertEquals(dt.toString(), "6", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70630);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70631);assertEquals(dt.toString(), "19", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70632);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70633);assertEquals(dt.toString(), "0", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_clockhourOfDay() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kwvm9c1ii2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_clockhourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kwvm9c1ii2(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70634);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70635);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70636);DateTimeFormatter f = DateTimeFormat.forPattern("k").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70637);assertEquals(dt.toString(), "10", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70638);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70639);assertEquals(dt.toString(), "6", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70640);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70641);assertEquals(dt.toString(), "19", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70642);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70643);assertEquals(dt.toString(), "24", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_minute() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15fbthr1iic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_minute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70644,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15fbthr1iic(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70644);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70645);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70646);DateTimeFormatter f = DateTimeFormat.forPattern("m").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70647);assertEquals(dt.toString(), "20", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70648);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70649);assertEquals(dt.toString(), "20", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70650);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70651);assertEquals(dt.toString(), "20", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_second() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1flg9jl1iik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_second",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70652,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1flg9jl1iik(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70652);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70653);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70654);DateTimeFormatter f = DateTimeFormat.forPattern("s").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70655);assertEquals(dt.toString(), "30", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70656);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70657);assertEquals(dt.toString(), "30", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70658);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70659);assertEquals(dt.toString(), "30", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_fractionOfSecond() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i5pbq1iis();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_fractionOfSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i5pbq1iis(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70660);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70661);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70662);DateTimeFormatter f = DateTimeFormat.forPattern("SSS").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70663);assertEquals(dt.toString(), "040", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70664);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70665);assertEquals(dt.toString(), "040", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70666);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70667);assertEquals(dt.toString(), "040", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_fractionOfSecondLong() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i1uexy1ij0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_fractionOfSecondLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70668,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i1uexy1ij0(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70668);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70669);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70670);DateTimeFormatter f = DateTimeFormat.forPattern("SSSSSS").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70671);assertEquals(dt.toString(), "040000", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70672);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70673);assertEquals(dt.toString(), "040000", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70674);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70675);assertEquals(dt.toString(), "040000", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //@Test
    public void testFormat_zoneText() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jkb4ga1ij8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_zoneText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jkb4ga1ij8(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70676);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70677);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70678);DateTimeFormatter f = DateTimeFormat.forPattern("z").withLocale(Locale.ENGLISH);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70679);assertEquals(dt.toString(), "UTC", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70680);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70681);assertEquals(dt.toString(), "EDT", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70682);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70683);assertEquals(dt.toString(), "JST", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //@Test
    public void testFormat_zoneLongText() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1srl0u1ijg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_zoneLongText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1srl0u1ijg(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70684);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70685);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70686);DateTimeFormatter f = DateTimeFormat.forPattern("zzzz").withLocale(Locale.ENGLISH);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70687);assertEquals(dt.toString(), "Coordinated Universal Time", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70688);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70689);assertEquals(dt.toString(), "Eastern Daylight Time", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70690);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70691);assertEquals(dt.toString(), "Japan Standard Time", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_zoneAmount() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1myuupr1ijo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_zoneAmount",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70692,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1myuupr1ijo(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70692);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70693);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70694);DateTimeFormatter f = DateTimeFormat.forPattern("Z").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70695);assertEquals(dt.toString(), "+0000", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70696);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70697);assertEquals(dt.toString(), "-0400", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70698);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70699);assertEquals(dt.toString(), "+0900", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormat_zoneAmountColon() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ff4lrg1ijw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_zoneAmountColon",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70700,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ff4lrg1ijw(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70700);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70701);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70702);DateTimeFormatter f = DateTimeFormat.forPattern("ZZ").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70703);assertEquals(dt.toString(), "+00:00", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70704);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70705);assertEquals(dt.toString(), "-04:00", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70706);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70707);assertEquals(dt.toString(), "+09:00", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormat_zoneAmountID() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11hsnus1ik4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_zoneAmountID",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70708,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11hsnus1ik4(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70708);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70709);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70710);DateTimeFormatter f = DateTimeFormat.forPattern("ZZZ").withLocale(Locale.UK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70711);assertEquals(dt.toString(), "UTC", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70712);dt = dt.withZone(NEWYORK);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70713);assertEquals(dt.toString(), "America/New_York", f.print(dt));

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70714);dt = dt.withZone(TOKYO);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70715);assertEquals(dt.toString(), "Asia/Tokyo", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_other() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pmn6v31ikc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_other",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pmn6v31ikc(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70716);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70717);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70718);DateTimeFormatter f = DateTimeFormat.forPattern("'Hello' ''");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70719);assertEquals("Hello '", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormat_invalid() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fjuzug1ikg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_invalid",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70720,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fjuzug1ikg(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70720);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70721);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70722);DateTimeFormat.forPattern(null);
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70723);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70724);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70725);DateTimeFormat.forPattern("");
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70726);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70727);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70728);DateTimeFormat.forPattern("A");
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70729);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70730);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70731);DateTimeFormat.forPattern("dd/mm/AA");
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70732);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormat_samples() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yqqjae1ikt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_samples",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yqqjae1ikt(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70733);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70734);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70735);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH.mm.ss");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70736);assertEquals("2004-06-09 10.20.30", f.print(dt));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormat_shortBasicParse() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fo0mlq1ikx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_shortBasicParse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fo0mlq1ikx(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70737);
        // Tests special two digit parse to make sure it properly switches
        // between lenient and strict parsing.

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70738);DateTime dt = new DateTime(2004, 3, 9, 0, 0, 0, 0);

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70739);DateTimeFormatter f = DateTimeFormat.forPattern("yyMMdd");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70740);assertEquals(dt, f.parseDateTime("040309"));
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70741);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70742);assertEquals(dt, f.parseDateTime("20040309"));
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70743);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70744);f = DateTimeFormat.forPattern("yy/MM/dd");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70745);assertEquals(dt, f.parseDateTime("04/03/09"));
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70746);assertEquals(dt, f.parseDateTime("2004/03/09"));
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParse_pivotYear() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152yvrc1il7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testParse_pivotYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152yvrc1il7(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70747);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70748);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd.MM.yy").withPivotYear(2050).withZoneUTC();

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70749);DateTime date = dateFormatter.parseDateTime("25.12.15");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70750);assertEquals(date.getYear(), 2015);

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70751);date = dateFormatter.parseDateTime("25.12.00");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70752);assertEquals(date.getYear(), 2000);

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70753);date = dateFormatter.parseDateTime("25.12.99");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70754);assertEquals(date.getYear(), 2099);
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testParse_pivotYear_ignored4DigitYear() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1duvqwh1ilf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testParse_pivotYear_ignored4DigitYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1duvqwh1ilf(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70755);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70756);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd.MM.yyyy").withPivotYear(2050).withZoneUTC();

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70757);DateTime date = dateFormatter.parseDateTime("25.12.15");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70758);assertEquals(date.getYear(), 15);

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70759);date = dateFormatter.parseDateTime("25.12.00");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70760);assertEquals(date.getYear(), 0);

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70761);date = dateFormatter.parseDateTime("25.12.99");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70762);assertEquals(date.getYear(), 99);
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormatParse_textMonthJanShort_UK() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wtpmtj1iln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthJanShort_UK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wtpmtj1iln(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70763);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70764);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM yyyy")
                .withLocale(Locale.UK).withZoneUTC();

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70765);String str = new DateTime(2007, 1, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70766);assertEquals(str, "23 Jan 2007");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70767);DateTime date = dateFormatter.parseDateTime(str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70768);check(date, 2007, 1, 23);
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormatParse_textMonthJanShortLowerCase_UK() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_134fcwi1ilt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthJanShortLowerCase_UK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_134fcwi1ilt(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70769);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70770);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM yyyy")
                .withLocale(Locale.UK).withZoneUTC();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70771);DateTime date = dateFormatter.parseDateTime("23 jan 2007");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70772);check(date, 2007, 1, 23);
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormatParse_textMonthJanShortUpperCase_UK() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gh9oi51ilx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthJanShortUpperCase_UK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gh9oi51ilx(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70773);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70774);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM yyyy")
                .withLocale(Locale.UK).withZoneUTC();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70775);DateTime date = dateFormatter.parseDateTime("23 JAN 2007");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70776);check(date, 2007, 1, 23);
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testParse_textMonthJanLong_UK() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r2b3k21im1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testParse_textMonthJanLong_UK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70777,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r2b3k21im1(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70777);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70778);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM yyyy")
                .withLocale(Locale.UK).withZoneUTC();

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70779);DateTime date = dateFormatter.parseDateTime("23 January 2007");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70780);check(date, 2007, 1, 23);
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormatParse_textMonthJanLongLowerCase_UK() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x5ppc01im5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthJanLongLowerCase_UK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x5ppc01im5(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70781);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70782);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM yyyy")
                .withLocale(Locale.UK).withZoneUTC();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70783);DateTime date = dateFormatter.parseDateTime("23 january 2007");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70784);check(date, 2007, 1, 23);
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormatParse_textMonthJanLongUpperCase_UK() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9pb8h1im9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthJanLongUpperCase_UK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70785,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9pb8h1im9(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70785);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70786);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM yyyy")
                .withLocale(Locale.UK).withZoneUTC();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70787);DateTime date = dateFormatter.parseDateTime("23 JANUARY 2007");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70788);check(date, 2007, 1, 23);
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormatParse_textMonthJanShort_France() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z1k8ji1imd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthJanShort_France",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z1k8ji1imd(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70789);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70790);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM yyyy")
                .withLocale(Locale.FRANCE).withZoneUTC();

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70791);String str = new DateTime(2007, 1, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70792);assertEquals("23 janv. 2007", str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70793);DateTime date = dateFormatter.parseDateTime(str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70794);check(date, 2007, 1, 23);
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormatParse_textMonthJanLong_France() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19c05t81imj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthJanLong_France",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19c05t81imj(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70795);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70796);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM yyyy")
                .withLocale(Locale.FRANCE).withZoneUTC();

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70797);DateTime date = dateFormatter.parseDateTime("23 janvier 2007");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70798);check(date, 2007, 1, 23);
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormatParse_textMonthApr_France() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16n76o41imn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthApr_France",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16n76o41imn(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70799);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70800);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM yyyy")
                .withLocale(Locale.FRANCE).withZoneUTC();

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70801);String str = new DateTime(2007, 2, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70802);assertEquals("23 f\u00e9vr. 2007", str);  // e acute
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70803);DateTime date = dateFormatter.parseDateTime(str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70804);check(date, 2007, 2, 23);
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormatParse_textMonthAtEnd_France() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dz0xj1imt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthAtEnd_France",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dz0xj1imt(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70805);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70806);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM")
                .withLocale(Locale.FRANCE).withZoneUTC();

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70807);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70808);assertEquals("23 juin", str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70809);DateTime date = dateFormatter.parseDateTime(str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70810);check(date, 2000, 6, 23);
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormatParse_textMonthAtEnd_France_withSpecifiedDefault() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hy1ldf1imz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthAtEnd_France_withSpecifiedDefault",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hy1ldf1imz(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70811);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70812);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM")
                .withLocale(Locale.FRANCE).withZoneUTC().withDefaultYear(1980);

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70813);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70814);assertEquals("23 juin", str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70815);DateTime date = dateFormatter.parseDateTime(str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70816);check(date, 1980, 6, 23);
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormatParse_textMonthApr_Korean() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dua1171in5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthApr_Korean",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dua1171in5(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70817);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70818);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("EEEE, d MMMM yyyy HH:mm")
                .withLocale(Locale.KOREAN).withZoneUTC();

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70819);String str = new DateTime(2007, 3, 8, 22, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70820);DateTime date = dateFormatter.parseDateTime(str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70821);assertEquals(new DateTime(2007, 3, 8, 22, 0, 0, 0, UTC), date);
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormatParse_textHalfdayAM_UK() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dkhjwp1ina();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textHalfdayAM_UK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dkhjwp1ina(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70822);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70823);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder()
                .appendLiteral('$')
                .appendClockhourOfHalfday(2)
                .appendLiteral('-')
                .appendHalfdayOfDayText()
                .appendLiteral('-')
                .appendYear(4, 4)
                .toFormatter()
                .withLocale(Locale.UK).withZoneUTC();

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70824);String str = new DateTime(2007, 6, 23, 18, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70825);assertEquals("$06-PM-2007", str.toUpperCase(Locale.ENGLISH));
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70826);DateTime date = dateFormatter.parseDateTime(str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70827);check(date, 2007, 1, 1);
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormatParse_textHalfdayAM_France() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffgni1ing();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textHalfdayAM_France",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70828,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffgni1ing(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70828);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70829);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder()
                .appendLiteral('$')
                .appendClockhourOfHalfday(2)
                .appendLiteral('-')
                .appendHalfdayOfDayText()
                .appendLiteral('-')
                .appendYear(4, 4)
                .toFormatter()
                .withLocale(Locale.FRANCE).withZoneUTC();

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70830);String str = new DateTime(2007, 6, 23, 18, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70831);assertEquals("$06-PM-2007", str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70832);DateTime date = dateFormatter.parseDateTime(str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70833);check(date, 2007, 1, 1);
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormatParse_textEraAD_UK() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vdrksn1inm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textEraAD_UK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70834,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vdrksn1inm(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70834);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70835);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder()
                .appendLiteral('$')
                .appendEraText()
                .appendYear(4, 4)
                .toFormatter()
                .withLocale(Locale.UK).withZoneUTC();

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70836);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70837);assertEquals("$AD2007", str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70838);DateTime date = dateFormatter.parseDateTime(str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70839);check(date, 2007, 1, 1);
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormatParse_textEraAD_France() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mnb4dw1ins();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textEraAD_France",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mnb4dw1ins(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70840);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70841);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder()
                .appendLiteral('$')
                .appendEraText()
                .appendYear(4, 4)
                .toFormatter()
                .withLocale(Locale.FRANCE).withZoneUTC();

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70842);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70843);assertEquals("$ap. J.-C.2007", str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70844);DateTime date = dateFormatter.parseDateTime(str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70845);check(date, 2007, 1, 1);
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormatParse_textEraBC_France() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g81q0e1iny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textEraBC_France",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g81q0e1iny(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70846);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70847);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder()
                .appendLiteral('$')
                .appendEraText()
                .appendYear(4, 4)
                .toFormatter()
                .withLocale(Locale.FRANCE).withZoneUTC();

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70848);String str = new DateTime(-1, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70849);assertTrue(str.equals("$BC-0001") || str.equals("$av. J.-C.-0001"));
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70850);DateTime date = dateFormatter.parseDateTime(str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70851);check(date, -1, 1, 1);
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormatParse_textYear_UK() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h09zyb1io4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textYear_UK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h09zyb1io4(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70852);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70853);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder()
                .appendLiteral('$')
                .appendText(DateTimeFieldType.year())
                .toFormatter()
                .withLocale(Locale.UK).withZoneUTC();

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70854);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70855);assertEquals("$2007", str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70856);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70857);dateFormatter.parseDateTime(str);
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70858);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormatParse_textYear_France() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16xxneq1iob();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textYear_France",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16xxneq1iob(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70859);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70860);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder()
                .appendLiteral('$')
                .appendText(DateTimeFieldType.year())
                .toFormatter()
                .withLocale(Locale.FRANCE).withZoneUTC();

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70861);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70862);assertEquals("$2007", str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70863);try {
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70864);dateFormatter.parseDateTime(str);
            __CLR4_4_11i1y1i1ylgchosv4.R.inc(70865);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormatParse_textAdjoiningHelloWorld_UK() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nu8b491ioi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textAdjoiningHelloWorld_UK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nu8b491ioi(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70866);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70867);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder()
                .appendLiteral('$')
                .appendDayOfMonth(2)
                .appendMonthOfYearShortText()
                .appendLiteral("HelloWorld")
                .toFormatter()
                .withLocale(Locale.UK).withZoneUTC();

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70868);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70869);assertEquals("$23JunHelloWorld", str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70870);dateFormatter.parseDateTime(str);
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormatParse_textAdjoiningMonthDOW_UK() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n4uhml1ion();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textAdjoiningMonthDOW_UK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70871,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n4uhml1ion(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70871);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70872);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder()
                .appendLiteral('$')
                .appendDayOfMonth(2)
                .appendMonthOfYearShortText()
                .appendDayOfWeekShortText()
                .toFormatter()
                .withLocale(Locale.UK).withZoneUTC();

        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70873);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70874);assertEquals("$23JunSat", str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70875);dateFormatter.parseDateTime(str);
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormatParse_zoneId_noColon() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17oi26a1ios();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_zoneId_noColon",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17oi26a1ios(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70876);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70877);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("HH:mm Z").withZoneUTC();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70878);String str = new DateTime(2007, 6, 23, 1, 2, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70879);assertEquals("01:02 +0000", str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70880);DateTime parsed = dateFormatter.parseDateTime(str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70881);assertEquals(1, parsed.getHourOfDay());
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70882);assertEquals(2, parsed.getMinuteOfHour());
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormatParse_zoneId_noColon_parseZ() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yuy57y1ioz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_zoneId_noColon_parseZ",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70883,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yuy57y1ioz(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70883);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70884);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("HH:mm Z").withZoneUTC();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70885);DateTime parsed = dateFormatter.parseDateTime("01:02 Z");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70886);assertEquals(1, parsed.getHourOfDay());
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70887);assertEquals(2, parsed.getMinuteOfHour());
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormatParse_zoneId_colon() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wdj0mb1ip4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_zoneId_colon",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70888,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wdj0mb1ip4(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70888);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70889);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("HH:mm ZZ").withZoneUTC();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70890);String str = new DateTime(2007, 6, 23, 1, 2, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70891);assertEquals("01:02 +00:00", str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70892);DateTime parsed = dateFormatter.parseDateTime(str);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70893);assertEquals(1, parsed.getHourOfDay());
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70894);assertEquals(2, parsed.getMinuteOfHour());
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    @Test
    public void testFormatParse_zoneId_colon_parseZ() {__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceStart(getClass().getName(),70895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uydr4h1ipb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i1y1i1ylgchosv4.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i1y1i1ylgchosv4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_zoneId_colon_parseZ",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70895,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uydr4h1ipb(){try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70895);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70896);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("HH:mm ZZ").withZoneUTC();
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70897);DateTime parsed = dateFormatter.parseDateTime("01:02 Z");
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70898);assertEquals(1, parsed.getHourOfDay());
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70899);assertEquals(2, parsed.getMinuteOfHour());
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(DateTime test, int hour, int min, int sec) {try{__CLR4_4_11i1y1i1ylgchosv4.R.inc(70900);
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70901);assertEquals(hour, test.getYear());
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70902);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_11i1y1i1ylgchosv4.R.inc(70903);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_11i1y1i1ylgchosv4.R.flushNeeded();}}

}
