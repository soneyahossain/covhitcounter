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

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Sets {static class __CLR4_4_1zhhzhhlgchos8y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,46590,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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

    public static void main(String[] args) throws Exception {try{__CLR4_4_1zhhzhhlgchos8y.R.inc(45989);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(45990);TestMutableDateTime_Sets TB = new TestMutableDateTime_Sets();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(45991);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(45992);TB.testTest();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(45993);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(45994);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(45995);TB.testSetMillis_long1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(45996);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(45997);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(45998);TB.testSetChronology_Chronology1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(45999);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46000);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46001);TB.testSetChronology_Chronology2();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46002);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46003);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46004);TB.testSetZone_DateTimeZone1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46005);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46006);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46007);TB.testSetZone_DateTimeZone2();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46008);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46009);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46010);TB.testSetZoneRetainFields_DateTimeZone1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46011);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46012);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46013);TB.testSetZoneRetainFields_DateTimeZone2();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46014);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46015);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46016);TB.testSetZoneRetainFields_DateTimeZone3();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46017);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46018);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46019);TB.testSetZoneRetainFields_DateTimeZone4();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46020);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46021);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46022);TB.testSetMillis_RI1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46023);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46024);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46025);TB.testSetMillis_RI2();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46026);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46027);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46028);TB.testSet_DateTimeFieldType_int1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46029);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46030);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46031);TB.testSet_DateTimeFieldType_int2();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46032);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46033);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46034);TB.testSet_DateTimeFieldType_int3();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46035);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46036);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46037);TB.testSetDate_int_int_int1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46038);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46039);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46040);TB.testSetDate_int_int_int2();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46041);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46042);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46043);TB.testSetDate_long1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46044);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46045);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46046);TB.testSetDate_RI1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46047);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46048);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46049);TB.testSetDate_RI2();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46050);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46051);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46052);TB.testSetDate_RI_same();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46053);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46054);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46055);TB.testSetDate_RI_different1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46056);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46057);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46058);TB.testSetDate_RI_different2();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46059);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46060);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46061);TB.testSetTime_int_int_int_int1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46062);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46063);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46064);TB.testSetTime_int_int_int2();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46065);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46066);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46067);TB.testSetTime_long1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46068);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46069);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46070);TB.testSetTime_RI1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46071);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46072);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46073);TB.testSetTime_RI2();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46074);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46075);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46076);TB.testSetTime_Object3();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46077);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46078);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46079);TB.testSetDateTime_int_int_int_int_int_int_int1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46080);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46081);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46082);TB.testSetDateTime_int_int_int_int_int_int_int2();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46083);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46084);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46085);TB.testSetYear_int1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46086);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46087);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46088);TB.testSetMonthOfYear_int1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46089);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46090);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46091);TB.testSetMonthOfYear_int_dstOverlapSummer_addZero();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46092);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46093);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46094);TB.testSetMonthOfYear_int_dstOverlapWinter_addZero();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46095);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46096);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46097);TB.testSetMonthOfYear_int2();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46098);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46099);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46100);TB.testSetDayOfMonth_int1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46101);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46102);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46103);TB.testSetDayOfMonth_int2();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46104);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46105);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46106);TB.testSetDayOfMonth_int_dstOverlapSummer_addZero();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46107);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46108);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46109);TB.testSetDayOfMonth_int_dstOverlapWinter_addZero();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46110);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46111);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46112);TB.testSetDayOfYear_int1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46113);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46114);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46115);TB.testSetDayOfYear_int_dstOverlapSummer_addZero();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46116);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46117);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46118);TB.testSetDayOfYear_int_dstOverlapWinter_addZero();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46119);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46120);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46121);TB.testSetDayOfYear_int2();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46122);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46123);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46124);TB.testSetWeekyear_int1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46125);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46126);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46127);TB.testSetWeekOfWeekyear_int1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46128);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46129);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46130);TB.testSetWeekOfWeekyear_int2();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46131);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46132);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46133);TB.testSetDayOfWeek_int1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46134);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46135);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46136);TB.testSetDayOfWeek_int2();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46137);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46138);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46139);TB.testSetHourOfDay_int1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46140);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46141);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46142);TB.testSetHourOfDay_int2();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46143);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46144);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46145);TB.testSetMinuteOfHour_int1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46146);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46147);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46148);TB.testSetMinuteOfHour_int2();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46149);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46150);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46151);TB.testSetMinuteOfDay_int1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46152);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46153);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46154);TB.testSetMinuteOfDay_int2();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46155);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46156);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46157);TB.testSetSecondOfMinute_int1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46158);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46159);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46160);TB.testSetSecondOfMinute_int2();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46161);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46162);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46163);TB.testSetSecondOfDay_int1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46164);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46165);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46166);TB.testSetSecondOfDay_int2();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46167);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46168);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46169);TB.testSetMilliOfSecond_int1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46170);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46171);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46172);TB.testSetMilliOfSecond_int2();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46173);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46174);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46175);TB.testSetMilliOfDay_int1();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46176);TB.tearDown();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46177);TB.setUp();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46178);TB.testSetMilliOfDay_int2();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46179);TB.tearDown();

    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestMutableDateTime_Sets.class);
    }

    public TestMutableDateTime_Sets(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46180);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46181);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46182);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46183);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46184);originalLocale = Locale.getDefault();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46185);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46186);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46187);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46188);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46189);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46190);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46191);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46192);Locale.setDefault(originalLocale);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46193);originalDateTimeZone = null;
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46194);originalTimeZone = null;
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46195);originalLocale = null;
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjzn8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjzn8(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46196);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46197);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46198);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46199);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetMillis_long1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_191g4a5znc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMillis_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46200,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_191g4a5znc(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46200);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46201);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46202);test.setMillis(TEST_TIME2);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46203);assertEquals(TEST_TIME2, test.getMillis());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46204);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetChronology_Chronology1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lgonbrznh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetChronology_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lgonbrznh(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46205);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46206);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46207);test.setChronology(GregorianChronology.getInstance(PARIS));
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46208);assertEquals(TEST_TIME1, test.getMillis());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46209);assertEquals(GregorianChronology.getInstance(PARIS), test.getChronology());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetChronology_Chronology2() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7oojaznm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetChronology_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7oojaznm(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46210);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46211);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46212);test.setChronology(null);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46213);assertEquals(TEST_TIME1, test.getMillis());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46214);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetZone_DateTimeZone1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xfu442znr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZone_DateTimeZone1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46215,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xfu442znr(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46215);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46216);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46217);test.setZone(PARIS);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46218);assertEquals(TEST_TIME1, test.getMillis());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46219);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetZone_DateTimeZone2() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u6u5blznw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZone_DateTimeZone2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u6u5blznw(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46220);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46221);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46222);test.setZone(null);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46223);assertEquals(TEST_TIME1, test.getMillis());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46224);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetZoneRetainFields_DateTimeZone1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xi37vwzo1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZoneRetainFields_DateTimeZone1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xi37vwzo1(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46225);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46226);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46227);test.setZoneRetainFields(PARIS);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46228);assertEquals(TEST_TIME1 - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46229);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetZoneRetainFields_DateTimeZone2() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ya0varzo6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZoneRetainFields_DateTimeZone2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ya0varzo6(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46230);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46231);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46232);test.setZoneRetainFields(null);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46233);assertEquals(TEST_TIME1, test.getMillis());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46234);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetZoneRetainFields_DateTimeZone3() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v10wiazob();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZoneRetainFields_DateTimeZone3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46235,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v10wiazob(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46235);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46236);MutableDateTime test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46237);test.setZoneRetainFields(null);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46238);assertEquals(TEST_TIME1 + DateTimeConstants.MILLIS_PER_HOUR, test.getMillis());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46239);assertEquals(GregorianChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetZoneRetainFields_DateTimeZone4() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rs0xptzog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZoneRetainFields_DateTimeZone4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rs0xptzog(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46240);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46241);Chronology chrono = new MockNullZoneChronology();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46242);MutableDateTime test = new MutableDateTime(TEST_TIME1, chrono);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46243);test.setZoneRetainFields(PARIS);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46244);assertEquals(TEST_TIME1 - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46245);assertSame(chrono, test.getChronology());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetMillis_RI1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p8b6qwzom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMillis_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p8b6qwzom(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46246);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46247);MutableDateTime test = new MutableDateTime(TEST_TIME1, BuddhistChronology.getInstance());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46248);test.setMillis(new Instant(TEST_TIME2));
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46249);assertEquals(TEST_TIME2, test.getMillis());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46250);assertEquals(BuddhistChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetMillis_RI2() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lzb7yfzor();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMillis_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46251,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lzb7yfzor(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46251);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46252);MutableDateTime test = new MutableDateTime(TEST_TIME1, BuddhistChronology.getInstance());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46253);test.setMillis(null);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46254);assertEquals(TEST_TIME_NOW, test.getMillis());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46255);assertEquals(BuddhistChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSet_DateTimeFieldType_int1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13wf19ezow();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSet_DateTimeFieldType_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13wf19ezow(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46256);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46257);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46258);test.set(DateTimeFieldType.year(), 2010);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46259);assertEquals(2010, test.getYear());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSet_DateTimeFieldType_int2() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nf2gxzp0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSet_DateTimeFieldType_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nf2gxzp0(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46260);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46261);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46262);try {
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46263);test.set(null, 0);
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46264);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46265);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSet_DateTimeFieldType_int3() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12lkwbkzp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSet_DateTimeFieldType_int3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12lkwbkzp6(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46266);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46267);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46268);try {
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46269);test.set(DateTimeFieldType.monthOfYear(), 13);
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46270);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46271);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetDate_int_int_int1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nqr65yzpc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_int_int_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nqr65yzpc(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46272);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46273);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46274);test.setDate(2010, 12, 3);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46275);assertEquals(2010, test.getYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46276);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46277);assertEquals(3, test.getDayOfMonth());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46278);assertEquals(12, test.getHourOfDay());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46279);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46280);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46281);assertEquals(501, test.getMillisOfSecond());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetDate_int_int_int2() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1khr7dhzpm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_int_int_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1khr7dhzpm(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46282);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46283);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46284);try {
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46285);test.setDate(2010, 13, 3);
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46286);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46287);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetDate_long1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aynyd7zps();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46288,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aynyd7zps(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46288);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46289);long setter = new DateTime(2010, 12, 3, 5, 7, 9, 501).getMillis();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46290);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46291);test.setDate(setter);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46292);assertEquals(2010, test.getYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46293);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46294);assertEquals(3, test.getDayOfMonth());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46295);assertEquals(12, test.getHourOfDay());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46296);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46297);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46298);assertEquals(501, test.getMillisOfSecond());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetDate_RI1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1psg874zq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1psg874zq3(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46299);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46300);DateTime setter = new DateTime(2010, 12, 3, 5, 7, 9, 501);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46301);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46302);test.setDate(setter);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46303);assertEquals(2010, test.getYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46304);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46305);assertEquals(3, test.getDayOfMonth());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46306);assertEquals(12, test.getHourOfDay());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46307);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46308);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46309);assertEquals(501, test.getMillisOfSecond());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetDate_RI2() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t1g6zlzqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t1g6zlzqe(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46310);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46311);MutableDateTime test = new MutableDateTime(2010, 7, 8, 12, 24, 48, 501);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46312);test.setDate(null);  // sets to TEST_TIME_NOW
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46313);assertEquals(2002, test.getYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46314);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46315);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46316);assertEquals(12, test.getHourOfDay());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46317);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46318);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46319);assertEquals(501, test.getMillisOfSecond());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetDate_RI_same() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xsc3dgzqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_RI_same",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xsc3dgzqo(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46320);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46321);MutableDateTime setter = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles"));
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46322);MutableDateTime test = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles"));
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46323);test.setDate(setter);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46324);assertEquals(2010, test.getYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46325);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46326);assertEquals(3, test.getDayOfMonth());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46327);assertEquals(2, test.getHourOfDay());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46328);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46329);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46330);assertEquals(501, test.getMillisOfSecond());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetDate_RI_different1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yzmonazqz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_RI_different1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yzmonazqz(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46331);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46332);MutableDateTime setter = new MutableDateTime(2010, 12, 1, 0, 0, 0, 0, DateTimeZone.forID("America/Los_Angeles"));
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46333);MutableDateTime test = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("Europe/Moscow"));
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46334);test.setDate(setter);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46335);assertEquals(2010, test.getYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46336);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46337);assertEquals(1, test.getDayOfMonth());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46338);assertEquals(2, test.getHourOfDay());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46339);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46340);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46341);assertEquals(501, test.getMillisOfSecond());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetDate_RI_different2() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wshejdzra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_RI_different2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wshejdzra(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46342);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46343);MutableDateTime setter = new MutableDateTime(2010, 12, 1, 0, 0, 0, 0, DateTimeZone.forID("Europe/Moscow"));
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46344);MutableDateTime test = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles"));
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46345);test.setDate(setter);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46346);assertEquals(2010, test.getYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46347);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46348);assertEquals(1, test.getDayOfMonth());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46349);assertEquals(2, test.getHourOfDay());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46350);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46351);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46352);assertEquals(501, test.getMillisOfSecond());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetTime_int_int_int_int1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ij3yitzrl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_int_int_int_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46353,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ij3yitzrl(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46353);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46354);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46355);test.setTime(5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46356);assertEquals(2002, test.getYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46357);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46358);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46359);assertEquals(5, test.getHourOfDay());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46360);assertEquals(6, test.getMinuteOfHour());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46361);assertEquals(7, test.getSecondOfMinute());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46362);assertEquals(8, test.getMillisOfSecond());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetTime_int_int_int2() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p9vytozrv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_int_int_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46363,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p9vytozrv(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46363);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46364);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46365);try {
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46366);test.setTime(60, 6, 7, 8);
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46367);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46368);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetTime_long1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1psflx6zs1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1psflx6zs1(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46369);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46370);long setter = new DateTime(2010, 12, 3, 5, 7, 9, 11).getMillis();
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46371);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46372);test.setTime(setter);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46373);assertEquals(2002, test.getYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46374);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46375);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46376);assertEquals(5, test.getHourOfDay());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46377);assertEquals(7, test.getMinuteOfHour());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46378);assertEquals(9, test.getSecondOfMinute());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46379);assertEquals(11, test.getMillisOfSecond());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetTime_RI1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j7h2gxzsc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j7h2gxzsc(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46380);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46381);DateTime setter = new DateTime(2010, 12, 3, 5, 7, 9, 11);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46382);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46383);test.setTime(setter);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46384);assertEquals(2002, test.getYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46385);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46386);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46387);assertEquals(5, test.getHourOfDay());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46388);assertEquals(7, test.getMinuteOfHour());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46389);assertEquals(9, test.getSecondOfMinute());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46390);assertEquals(11, test.getMillisOfSecond());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetTime_RI2() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fyh3ogzsn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fyh3ogzsn(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46391);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46392);MutableDateTime test = new MutableDateTime(2010, 7, 8, 12, 24, 48, 501);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46393);test.setTime(null);  // sets to TEST_TIME_NOW, which has no time part
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46394);assertEquals(2010, test.getYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46395);assertEquals(7, test.getMonthOfYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46396);assertEquals(8, test.getDayOfMonth());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46397);assertEquals(new DateTime(TEST_TIME_NOW).getHourOfDay(), test.getHourOfDay());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46398);assertEquals(new DateTime(TEST_TIME_NOW).getMinuteOfHour(), test.getMinuteOfHour());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46399);assertEquals(new DateTime(TEST_TIME_NOW).getSecondOfMinute(), test.getSecondOfMinute());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46400);assertEquals(new DateTime(TEST_TIME_NOW).getMillisOfSecond(), test.getMillisOfSecond());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetTime_Object3() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19v9puvzsx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_Object3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19v9puvzsx(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46401);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46402);DateTime temp = new DateTime(2010, 12, 3, 5, 7, 9, 11);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46403);DateTime setter = new DateTime(temp.getMillis(), new MockNullZoneChronology());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46404);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46405);test.setTime(setter);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46406);assertEquals(2002, test.getYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46407);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46408);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46409);assertEquals(5, test.getHourOfDay());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46410);assertEquals(7, test.getMinuteOfHour());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46411);assertEquals(9, test.getSecondOfMinute());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46412);assertEquals(11, test.getMillisOfSecond());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetDateTime_int_int_int_int_int_int_int1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18wtfdpzt9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDateTime_int_int_int_int_int_int_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18wtfdpzt9(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46413);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46414);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46415);test.setDateTime(2010, 12, 3, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46416);assertEquals(2010, test.getYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46417);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46418);assertEquals(3, test.getDayOfMonth());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46419);assertEquals(5, test.getHourOfDay());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46420);assertEquals(6, test.getMinuteOfHour());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46421);assertEquals(7, test.getSecondOfMinute());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46422);assertEquals(8, test.getMillisOfSecond());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetDateTime_int_int_int_int_int_int_int2() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c5te66ztj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDateTime_int_int_int_int_int_int_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46423,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c5te66ztj(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46423);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46424);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46425);try {
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46426);test.setDateTime(2010, 13, 3, 5, 6, 7, 8);
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46427);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46428);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetYear_int1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16uv1nfztp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetYear_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46429,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16uv1nfztp(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46429);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46430);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46431);test.setYear(2010);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46432);assertEquals("2010-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetMonthOfYear_int1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vwabtwztt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMonthOfYear_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vwabtwztt(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46433);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46434);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46435);test.setMonthOfYear(12);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46436);assertEquals("2002-12-09T05:06:07.008Z", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetMonthOfYear_int_dstOverlapSummer_addZero() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_177dn3hztx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMonthOfYear_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_177dn3hztx(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46437);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46438);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46439);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46440);test.setMonthOfYear(10);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46441);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetMonthOfYear_int_dstOverlapWinter_addZero() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19l8a65zu2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMonthOfYear_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19l8a65zu2(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46442);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46443);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46444);test.addHours(1);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46445);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46446);test.setMonthOfYear(10);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46447);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetMonthOfYear_int2() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5aamdzu8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMonthOfYear_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46448,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5aamdzu8(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46448);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46449);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46450);try {
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46451);test.setMonthOfYear(13);
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46452);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46453);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetDayOfMonth_int1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17cs3hnzue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfMonth_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17cs3hnzue(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46454);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46455);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46456);test.setDayOfMonth(17);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46457);assertEquals("2002-06-17T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetDayOfMonth_int2() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1als2a4zui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfMonth_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46458,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1als2a4zui(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46458);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46459);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46460);try {
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46461);test.setDayOfMonth(31);
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46462);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46463);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetDayOfMonth_int_dstOverlapSummer_addZero() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17w72wkzuo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfMonth_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17w72wkzuo(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46464);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46465);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46466);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46467);test.setDayOfMonth(30);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46468);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetDayOfMonth_int_dstOverlapWinter_addZero() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18weud2zut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfMonth_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18weud2zut(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46469);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46470);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46471);test.addHours(1);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46472);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46473);test.setDayOfMonth(30);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46474);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetDayOfYear_int1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rpdbjszuz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfYear_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rpdbjszuz(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46475);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46476);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46477);test.setDayOfYear(3);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46478);assertEquals("2002-01-03T05:06:07.008Z", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetDayOfYear_int_dstOverlapSummer_addZero() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jra39tzv3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfYear_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jra39tzv3(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46479);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46480);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46481);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46482);test.setDayOfYear(303);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46483);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetDayOfYear_int_dstOverlapWinter_addZero() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12yo607zv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfYear_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12yo607zv8(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46484);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46485);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46486);test.addHours(1);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46487);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46488);test.setDayOfYear(303);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46489);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetDayOfYear_int2() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ogdcrbzve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfYear_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46490,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ogdcrbzve(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46490);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46491);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46492);try {
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46493);test.setDayOfYear(366);
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46494);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46495);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetWeekyear_int1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wdcbmhzvk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetWeekyear_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46496,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wdcbmhzvk(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46496);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46497);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46498);test.setWeekyear(2001);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46499);assertEquals("2001-06-10T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetWeekOfWeekyear_int1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jgj68szvo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetWeekOfWeekyear_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jgj68szvo(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46500);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46501);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46502);test.setWeekOfWeekyear(2);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46503);assertEquals("2002-01-13T05:06:07.008Z", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetWeekOfWeekyear_int2() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mpj519zvs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetWeekOfWeekyear_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46504,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mpj519zvs(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46504);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46505);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46506);try {
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46507);test.setWeekOfWeekyear(53);
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46508);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46509);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetDayOfWeek_int1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15jvob5zvy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfWeek_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46510,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15jvob5zvy(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46510);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46511);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46512);test.setDayOfWeek(5);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46513);assertEquals("2002-06-07T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetDayOfWeek_int2() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18svn3mzw2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfWeek_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18svn3mzw2(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46514);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46515);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46516);try {
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46517);test.setDayOfWeek(8);
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46518);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46519);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetHourOfDay_int1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14722evzw8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetHourOfDay_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14722evzw8(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46520);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46521);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46522);test.setHourOfDay(13);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46523);assertEquals("2002-06-09T13:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetHourOfDay_int2() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17g217czwc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetHourOfDay_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17g217czwc(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46524);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46525);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46526);try {
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46527);test.setHourOfDay(24);
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46528);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46529);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetMinuteOfHour_int1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zejqnrzwi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMinuteOfHour_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46530,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zejqnrzwi(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46530);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46531);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46532);test.setMinuteOfHour(13);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46533);assertEquals("2002-06-09T05:13:07.008+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetMinuteOfHour_int2() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w5jrvazwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMinuteOfHour_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w5jrvazwm(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46534);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46535);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46536);try {
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46537);test.setMinuteOfHour(60);
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46538);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46539);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetMinuteOfDay_int1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gbf5spzws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMinuteOfDay_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gbf5spzws(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46540);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46541);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46542);test.setMinuteOfDay(13);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46543);assertEquals("2002-06-09T00:13:07.008+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetMinuteOfDay_int2() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d2f708zww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMinuteOfDay_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d2f708zww(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46544);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46545);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46546);try {
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46547);test.setMinuteOfDay(24 * 60);
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46548);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46549);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetSecondOfMinute_int1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hlcpzbzx2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetSecondOfMinute_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hlcpzbzx2(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46550);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46551);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46552);test.setSecondOfMinute(13);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46553);assertEquals("2002-06-09T05:06:13.008+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetSecondOfMinute_int2() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eccr6uzx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetSecondOfMinute_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eccr6uzx6(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46554);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46555);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46556);try {
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46557);test.setSecondOfMinute(60);
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46558);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46559);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetSecondOfDay_int1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ap89qfzxc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetSecondOfDay_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ap89qfzxc(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46560);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46561);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46562);test.setSecondOfDay(13);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46563);assertEquals("2002-06-09T00:00:13.008+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetSecondOfDay_int2() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dy88iwzxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetSecondOfDay_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dy88iwzxg(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46564);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46565);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46566);try {
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46567);test.setSecondOfDay(24 * 60 * 60);
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46568);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46569);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetMilliOfSecond_int1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15cwvc0zxm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMilliOfSecond_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15cwvc0zxm(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46570);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46571);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46572);test.setMillisOfSecond(13);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46573);assertEquals("2002-06-09T05:06:07.013+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetMilliOfSecond_int2() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18lwu4hzxq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMilliOfSecond_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18lwu4hzxq(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46574);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46575);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46576);try {
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46577);test.setMillisOfSecond(1000);
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46578);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46579);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetMilliOfDay_int1() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_155v9i8zxw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMilliOfDay_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46580,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_155v9i8zxw(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46580);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46581);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46582);test.setMillisOfDay(13);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46583);assertEquals("2002-06-09T00:00:00.013+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

    @Test
    public void testSetMilliOfDay_int2() {__CLR4_4_1zhhzhhlgchos8y.R.globalSliceStart(getClass().getName(),46584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11wvaprzy0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhhzhhlgchos8y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhhzhhlgchos8y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMilliOfDay_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11wvaprzy0(){try{__CLR4_4_1zhhzhhlgchos8y.R.inc(46584);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46585);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46586);try {
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46587);test.setMillisOfDay(24 * 60 * 60 * 1000);
            __CLR4_4_1zhhzhhlgchos8y.R.inc(46588);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1zhhzhhlgchos8y.R.inc(46589);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1zhhzhhlgchos8y.R.flushNeeded();}}

}
