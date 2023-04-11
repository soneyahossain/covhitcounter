/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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
 * This class is a JUnit test for MutableDuration.
 *
 * @author Stephen Colebourne
 */
public class TestMutablePeriod_Constructors {static class __CLR4_4_1110o110olgchosb2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,48827,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
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

    public static void main(String[] args) throws Throwable {try{__CLR4_4_1110o110olgchosb2.R.inc(47976);
        __CLR4_4_1110o110olgchosb2.R.inc(47977);TestMutablePeriod_Constructors TB = new TestMutablePeriod_Constructors();
        __CLR4_4_1110o110olgchosb2.R.inc(47978);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(47979);TB.testParse_noFormatter();
        __CLR4_4_1110o110olgchosb2.R.inc(47980);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(47981);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(47982);TB.testConstructor1();
        __CLR4_4_1110o110olgchosb2.R.inc(47983);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(47984);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(47985);TB.testConstructor_PeriodType1();
        __CLR4_4_1110o110olgchosb2.R.inc(47986);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(47987);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(47988);TB.testConstructor_PeriodType2();
        __CLR4_4_1110o110olgchosb2.R.inc(47989);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(47990);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(47991);TB.testConstructor_long1();
        __CLR4_4_1110o110olgchosb2.R.inc(47992);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(47993);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(47994);TB.testConstructor_long2();
        __CLR4_4_1110o110olgchosb2.R.inc(47995);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(47996);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(47997);TB.testConstructor_long3();
        __CLR4_4_1110o110olgchosb2.R.inc(47998);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(47999);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48000);TB.testConstructor_long_PeriodType1();
        __CLR4_4_1110o110olgchosb2.R.inc(48001);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48002);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48003);TB.testConstructor_long_PeriodType2();
        __CLR4_4_1110o110olgchosb2.R.inc(48004);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48005);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48006);TB.testConstructor_long_PeriodType3();
        __CLR4_4_1110o110olgchosb2.R.inc(48007);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48008);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48009);TB.testConstructor_long_PeriodType4();
        __CLR4_4_1110o110olgchosb2.R.inc(48010);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48011);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48012);TB.testConstructor_long_Chronology1();
        __CLR4_4_1110o110olgchosb2.R.inc(48013);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48014);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48015);TB.testConstructor_long_Chronology2();
        __CLR4_4_1110o110olgchosb2.R.inc(48016);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48017);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48018);TB.testConstructor_long_Chronology3();
        __CLR4_4_1110o110olgchosb2.R.inc(48019);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48020);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48021);TB.testConstructor_long_PeriodType_Chronology1();
        __CLR4_4_1110o110olgchosb2.R.inc(48022);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48023);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48024);TB.testConstructor_long_PeriodType_Chronology2();
        __CLR4_4_1110o110olgchosb2.R.inc(48025);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48026);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48027);TB.testConstructor_long_PeriodType_Chronology3();
        __CLR4_4_1110o110olgchosb2.R.inc(48028);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48029);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48030);TB.testConstructor_long_PeriodType_Chronology4();
        __CLR4_4_1110o110olgchosb2.R.inc(48031);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48032);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48033);TB.testConstructor_4int1();
        __CLR4_4_1110o110olgchosb2.R.inc(48034);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48035);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48036);TB.testConstructor_8int1();
        __CLR4_4_1110o110olgchosb2.R.inc(48037);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48038);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48039);TB.testConstructor_8int__PeriodType1();
        __CLR4_4_1110o110olgchosb2.R.inc(48040);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48041);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48042);TB.testConstructor_8int__PeriodType2();
        __CLR4_4_1110o110olgchosb2.R.inc(48043);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48044);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48045);TB.testConstructor_8int__PeriodType3();
        __CLR4_4_1110o110olgchosb2.R.inc(48046);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48047);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48048);TB.testConstructor_long_long1();
        __CLR4_4_1110o110olgchosb2.R.inc(48049);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48050);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48051);TB.testConstructor_long_long2();
        __CLR4_4_1110o110olgchosb2.R.inc(48052);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48053);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48054);TB.testConstructor_long_long_PeriodType1();
        __CLR4_4_1110o110olgchosb2.R.inc(48055);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48056);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48057);TB.testConstructor_long_long_PeriodType2();
        __CLR4_4_1110o110olgchosb2.R.inc(48058);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48059);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48060);TB.testConstructor_long_long_PeriodType3();
        __CLR4_4_1110o110olgchosb2.R.inc(48061);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48062);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48063);TB.testConstructor_long_long_Chronology1();
        __CLR4_4_1110o110olgchosb2.R.inc(48064);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48065);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48066);TB.testConstructor_long_long_Chronology2();
        __CLR4_4_1110o110olgchosb2.R.inc(48067);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48068);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48069);TB.testConstructor_long_long_PeriodType_Chronology1();
        __CLR4_4_1110o110olgchosb2.R.inc(48070);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48071);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48072);TB.testConstructor_long_long_PeriodType_Chronology2();
        __CLR4_4_1110o110olgchosb2.R.inc(48073);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48074);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48075);TB.testConstructor_RI_RI1();
        __CLR4_4_1110o110olgchosb2.R.inc(48076);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48077);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48078);TB.testConstructor_RI_RI2();
        __CLR4_4_1110o110olgchosb2.R.inc(48079);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48080);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48081);TB.testConstructor_RI_RI3();
        __CLR4_4_1110o110olgchosb2.R.inc(48082);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48083);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48084);TB.testConstructor_RI_RI4();
        __CLR4_4_1110o110olgchosb2.R.inc(48085);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48086);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48087);TB.testConstructor_RI_RI5();
        __CLR4_4_1110o110olgchosb2.R.inc(48088);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48089);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48090);TB.testConstructor_RI_RI_PeriodType1();
        __CLR4_4_1110o110olgchosb2.R.inc(48091);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48092);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48093);TB.testConstructor_RI_RI_PeriodType2();
        __CLR4_4_1110o110olgchosb2.R.inc(48094);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48095);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48096);TB.testConstructor_RI_RI_PeriodType3();
        __CLR4_4_1110o110olgchosb2.R.inc(48097);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48098);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48099);TB.testConstructor_RI_RI_PeriodType4();
        __CLR4_4_1110o110olgchosb2.R.inc(48100);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48101);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48102);TB.testConstructor_RI_RI_PeriodType5();
        __CLR4_4_1110o110olgchosb2.R.inc(48103);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48104);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48105);TB.testConstructor_RI_RD1();
        __CLR4_4_1110o110olgchosb2.R.inc(48106);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48107);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48108);TB.testConstructor_RI_RD2();
        __CLR4_4_1110o110olgchosb2.R.inc(48109);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48110);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48111);TB.testConstructor_RI_RD_PeriodType1();
        __CLR4_4_1110o110olgchosb2.R.inc(48112);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48113);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48114);TB.testConstructor_RI_RD_PeriodType2();
        __CLR4_4_1110o110olgchosb2.R.inc(48115);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48116);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48117);TB.testConstructor_Object1();
        __CLR4_4_1110o110olgchosb2.R.inc(48118);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48119);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48120);TB.testConstructor_Object2();
        __CLR4_4_1110o110olgchosb2.R.inc(48121);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48122);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48123);TB.testConstructor_Object3();
        __CLR4_4_1110o110olgchosb2.R.inc(48124);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48125);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48126);TB.testConstructor_Object4();
        __CLR4_4_1110o110olgchosb2.R.inc(48127);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48128);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48129);TB.testConstructor_Object_PeriodType1();
        __CLR4_4_1110o110olgchosb2.R.inc(48130);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48131);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48132);TB.testConstructor_Object_PeriodType2();
        __CLR4_4_1110o110olgchosb2.R.inc(48133);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48134);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48135);TB.testConstructor_Object_PeriodType3();
        __CLR4_4_1110o110olgchosb2.R.inc(48136);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48137);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48138);TB.testConstructor_Object_PeriodType4();
        __CLR4_4_1110o110olgchosb2.R.inc(48139);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48140);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48141);TB.testConstructor_Object_Chronology1();
        __CLR4_4_1110o110olgchosb2.R.inc(48142);TB.tearDown();
        __CLR4_4_1110o110olgchosb2.R.inc(48143);TB.setUp();
        __CLR4_4_1110o110olgchosb2.R.inc(48144);TB.testConstructor_Object_Chronology2();
        __CLR4_4_1110o110olgchosb2.R.inc(48145);TB.tearDown();

    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestMutablePeriod_Constructors.class);
    }

    public TestMutablePeriod_Constructors(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1110o110olgchosb2.R.inc(48146);
        __CLR4_4_1110o110olgchosb2.R.inc(48147);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1110o110olgchosb2.R.inc(48148);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1110o110olgchosb2.R.inc(48149);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1110o110olgchosb2.R.inc(48150);originalLocale = Locale.getDefault();
        __CLR4_4_1110o110olgchosb2.R.inc(48151);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1110o110olgchosb2.R.inc(48152);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1110o110olgchosb2.R.inc(48153);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1110o110olgchosb2.R.inc(48154);
        __CLR4_4_1110o110olgchosb2.R.inc(48155);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1110o110olgchosb2.R.inc(48156);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1110o110olgchosb2.R.inc(48157);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1110o110olgchosb2.R.inc(48158);Locale.setDefault(originalLocale);
        __CLR4_4_1110o110olgchosb2.R.inc(48159);originalDateTimeZone = null;
        __CLR4_4_1110o110olgchosb2.R.inc(48160);originalTimeZone = null;
        __CLR4_4_1110o110olgchosb2.R.inc(48161);originalLocale = null;
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqvi115u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqvi115u() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48162);
        __CLR4_4_1110o110olgchosb2.R.inc(48163);assertEquals(new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 890), MutablePeriod.parse("P1Y2M3W4DT5H6M7.890S"));
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor ()
     */
    @Test
    public void testConstructor1() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kibo7k115w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kibo7k115w() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48164);
        __CLR4_4_1110o110olgchosb2.R.inc(48165);MutablePeriod test = new MutablePeriod();
        __CLR4_4_1110o110olgchosb2.R.inc(48166);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48167);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48168);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48169);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48170);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48171);assertEquals(0, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48172);assertEquals(0, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48173);assertEquals(0, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48174);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (PeriodType)
     */
    @Test
    public void testConstructor_PeriodType1() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tcd2t61167();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tcd2t61167() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48175);
        __CLR4_4_1110o110olgchosb2.R.inc(48176);MutablePeriod test = new MutablePeriod(PeriodType.yearMonthDayTime());
        __CLR4_4_1110o110olgchosb2.R.inc(48177);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48178);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48179);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48180);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48181);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48182);assertEquals(0, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48183);assertEquals(0, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48184);assertEquals(0, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48185);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_PeriodType2() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q3d40p116i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q3d40p116i() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48186);
        __CLR4_4_1110o110olgchosb2.R.inc(48187);MutablePeriod test = new MutablePeriod((PeriodType) null);
        __CLR4_4_1110o110olgchosb2.R.inc(48188);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48189);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48190);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48191);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48192);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48193);assertEquals(0, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48194);assertEquals(0, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48195);assertEquals(0, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48196);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long1() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13cr116t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13cr116t() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48197);
        __CLR4_4_1110o110olgchosb2.R.inc(48198);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1110o110olgchosb2.R.inc(48199);MutablePeriod test = new MutablePeriod(length);
        __CLR4_4_1110o110olgchosb2.R.inc(48200);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48201);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48202);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48203);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48204);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48205);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48206);assertEquals(6, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48207);assertEquals(7, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48208);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_long2() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914ka1175();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48209,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914ka1175() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48209);
        __CLR4_4_1110o110olgchosb2.R.inc(48210);long length =
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                        6 * DateTimeConstants.MILLIS_PER_MINUTE +
                        7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1110o110olgchosb2.R.inc(48211);MutablePeriod test = new MutablePeriod(length);
        __CLR4_4_1110o110olgchosb2.R.inc(48212);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48213);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48214);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48215);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48216);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48217);assertEquals(5, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48218);assertEquals(6, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48219);assertEquals(7, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48220);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_long3() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q015rt117h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q015rt117h() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48221);
        __CLR4_4_1110o110olgchosb2.R.inc(48222);long length =
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                        5L * DateTimeConstants.MILLIS_PER_HOUR +
                        6L * DateTimeConstants.MILLIS_PER_MINUTE +
                        7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1110o110olgchosb2.R.inc(48223);MutablePeriod test = new MutablePeriod(length);
        __CLR4_4_1110o110olgchosb2.R.inc(48224);assertEquals(PeriodType.standard(), test.getPeriodType());
        // only time fields are precise in AllType
        __CLR4_4_1110o110olgchosb2.R.inc(48225);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
        __CLR4_4_1110o110olgchosb2.R.inc(48226);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48227);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48228);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48229);assertEquals((450 * 24) + 5, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48230);assertEquals(6, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48231);assertEquals(7, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48232);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long_PeriodType1() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dqhe5t117t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dqhe5t117t() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48233);
        __CLR4_4_1110o110olgchosb2.R.inc(48234);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1110o110olgchosb2.R.inc(48235);MutablePeriod test = new MutablePeriod(length, (PeriodType) null);
        __CLR4_4_1110o110olgchosb2.R.inc(48236);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48237);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48238);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48239);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48240);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48241);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48242);assertEquals(6, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48243);assertEquals(7, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48244);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_long_PeriodType2() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gzhcya1185();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48245,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gzhcya1185() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48245);
        __CLR4_4_1110o110olgchosb2.R.inc(48246);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1110o110olgchosb2.R.inc(48247);MutablePeriod test = new MutablePeriod(length, PeriodType.millis());
        __CLR4_4_1110o110olgchosb2.R.inc(48248);assertEquals(PeriodType.millis(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48249);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48250);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48251);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48252);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48253);assertEquals(0, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48254);assertEquals(0, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48255);assertEquals(0, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48256);assertEquals(length, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_long_PeriodType3() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k8hbqr118h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48257,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k8hbqr118h() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48257);
        __CLR4_4_1110o110olgchosb2.R.inc(48258);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1110o110olgchosb2.R.inc(48259);MutablePeriod test = new MutablePeriod(length, PeriodType.standard());
        __CLR4_4_1110o110olgchosb2.R.inc(48260);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48261);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48262);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48263);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48264);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48265);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48266);assertEquals(6, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48267);assertEquals(7, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48268);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_long_PeriodType4() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nhhaj8118t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_PeriodType4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48269,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nhhaj8118t() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48269);
        __CLR4_4_1110o110olgchosb2.R.inc(48270);long length =
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                        6 * DateTimeConstants.MILLIS_PER_MINUTE +
                        7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1110o110olgchosb2.R.inc(48271);MutablePeriod test = new MutablePeriod(length, PeriodType.standard().withMillisRemoved());
        __CLR4_4_1110o110olgchosb2.R.inc(48272);assertEquals(PeriodType.standard().withMillisRemoved(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48273);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48274);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48275);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48276);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48277);assertEquals(5, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48278);assertEquals(6, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48279);assertEquals(7, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48280);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long_Chronology1() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wcl59w1195();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wcl59w1195() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48281);
        __CLR4_4_1110o110olgchosb2.R.inc(48282);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1110o110olgchosb2.R.inc(48283);MutablePeriod test = new MutablePeriod(length, ISOChronology.getInstance());
        __CLR4_4_1110o110olgchosb2.R.inc(48284);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48285);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48286);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48287);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48288);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48289);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48290);assertEquals(6, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48291);assertEquals(7, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48292);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_long_Chronology2() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zfixwr119h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zfixwr119h() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48293);
        __CLR4_4_1110o110olgchosb2.R.inc(48294);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1110o110olgchosb2.R.inc(48295);MutablePeriod test = new MutablePeriod(length, ISOChronology.getInstanceUTC());
        __CLR4_4_1110o110olgchosb2.R.inc(48296);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48297);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48298);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48299);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48300);assertEquals(4, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48301);assertEquals(5, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48302);assertEquals(6, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48303);assertEquals(7, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48304);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_long_Chronology3() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w6iz4a119t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_Chronology3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w6iz4a119t() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48305);
        __CLR4_4_1110o110olgchosb2.R.inc(48306);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1110o110olgchosb2.R.inc(48307);MutablePeriod test = new MutablePeriod(length, (Chronology) null);
        __CLR4_4_1110o110olgchosb2.R.inc(48308);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48309);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48310);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48311);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48312);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48313);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48314);assertEquals(6, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48315);assertEquals(7, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48316);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long_PeriodType_Chronology1() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13o11o811a5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_PeriodType_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48317,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13o11o811a5() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48317);
        __CLR4_4_1110o110olgchosb2.R.inc(48318);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1110o110olgchosb2.R.inc(48319);MutablePeriod test = new MutablePeriod(length, PeriodType.time().withMillisRemoved(), ISOChronology.getInstance());
        __CLR4_4_1110o110olgchosb2.R.inc(48320);assertEquals(PeriodType.time().withMillisRemoved(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48321);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48322);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48323);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48324);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48325);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48326);assertEquals(6, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48327);assertEquals(7, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48328);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_long_PeriodType_Chronology2() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f12vr11ah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_PeriodType_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f12vr11ah() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48329);
        __CLR4_4_1110o110olgchosb2.R.inc(48330);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1110o110olgchosb2.R.inc(48331);MutablePeriod test = new MutablePeriod(length, PeriodType.standard(), ISOChronology.getInstanceUTC());
        __CLR4_4_1110o110olgchosb2.R.inc(48332);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48333);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48334);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48335);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48336);assertEquals(4, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48337);assertEquals(5, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48338);assertEquals(6, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48339);assertEquals(7, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48340);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_long_PeriodType_Chronology3() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12tyvwq11at();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_PeriodType_Chronology3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48341,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12tyvwq11at() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48341);
        __CLR4_4_1110o110olgchosb2.R.inc(48342);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1110o110olgchosb2.R.inc(48343);MutablePeriod test = new MutablePeriod(length, PeriodType.standard(), (Chronology) null);
        __CLR4_4_1110o110olgchosb2.R.inc(48344);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48345);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48346);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48347);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48348);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48349);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48350);assertEquals(6, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48351);assertEquals(7, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48352);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_long_PeriodType_Chronology4() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_162yup711b5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_PeriodType_Chronology4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48353,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_162yup711b5() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48353);
        __CLR4_4_1110o110olgchosb2.R.inc(48354);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1110o110olgchosb2.R.inc(48355);MutablePeriod test = new MutablePeriod(length, (PeriodType) null, (Chronology) null);
        __CLR4_4_1110o110olgchosb2.R.inc(48356);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48357);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48358);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48359);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48360);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48361);assertEquals((4 * 24) + 5, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48362);assertEquals(6, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48363);assertEquals(7, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48364);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (4ints)
     */
    @Test
    public void testConstructor_4int1() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11fk5dm11bh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_4int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11fk5dm11bh() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48365);
        __CLR4_4_1110o110olgchosb2.R.inc(48366);MutablePeriod test = new MutablePeriod(5, 6, 7, 8);
        __CLR4_4_1110o110olgchosb2.R.inc(48367);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48368);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48369);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48370);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48371);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48372);assertEquals(5, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48373);assertEquals(6, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48374);assertEquals(7, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48375);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (8ints)
     */
    @Test
    public void testConstructor_8int1() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w0fcqy11bs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_8int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48376,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w0fcqy11bs() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48376);
        __CLR4_4_1110o110olgchosb2.R.inc(48377);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1110o110olgchosb2.R.inc(48378);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48379);assertEquals(1, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48380);assertEquals(2, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48381);assertEquals(3, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48382);assertEquals(4, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48383);assertEquals(5, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48384);assertEquals(6, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48385);assertEquals(7, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48386);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (8ints)
     */
    @Test
    public void testConstructor_8int__PeriodType1() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mrz59r11c3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_8int__PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48387,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mrz59r11c3() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48387);
        __CLR4_4_1110o110olgchosb2.R.inc(48388);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8, null);
        __CLR4_4_1110o110olgchosb2.R.inc(48389);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48390);assertEquals(1, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48391);assertEquals(2, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48392);assertEquals(3, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48393);assertEquals(4, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48394);assertEquals(5, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48395);assertEquals(6, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48396);assertEquals(7, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48397);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_8int__PeriodType2() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q0z42811ce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_8int__PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48398,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q0z42811ce() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48398);
        __CLR4_4_1110o110olgchosb2.R.inc(48399);MutablePeriod test = new MutablePeriod(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.dayTime());
        __CLR4_4_1110o110olgchosb2.R.inc(48400);assertEquals(PeriodType.dayTime(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48401);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48402);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48403);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48404);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48405);assertEquals(5, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48406);assertEquals(6, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48407);assertEquals(7, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48408);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_8int__PeriodType3() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t9z2up11cp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_8int__PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t9z2up11cp() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48409);
        __CLR4_4_1110o110olgchosb2.R.inc(48410);try {
            __CLR4_4_1110o110olgchosb2.R.inc(48411);new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.dayTime());
            __CLR4_4_1110o110olgchosb2.R.inc(48412);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long_long1() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ifbf411ct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ifbf411ct() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48413);
        __CLR4_4_1110o110olgchosb2.R.inc(48414);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1110o110olgchosb2.R.inc(48415);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1110o110olgchosb2.R.inc(48416);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_1110o110olgchosb2.R.inc(48417);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48418);assertEquals(1, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48419);assertEquals(1, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48420);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48421);assertEquals(1, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48422);assertEquals(1, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48423);assertEquals(1, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48424);assertEquals(1, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48425);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_long_long2() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129fcmn11d6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129fcmn11d6() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48426);
        __CLR4_4_1110o110olgchosb2.R.inc(48427);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1110o110olgchosb2.R.inc(48428);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1110o110olgchosb2.R.inc(48429);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_1110o110olgchosb2.R.inc(48430);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48431);assertEquals(1, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48432);assertEquals(1, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48433);assertEquals(1, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48434);assertEquals(1, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48435);assertEquals(1, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48436);assertEquals(1, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48437);assertEquals(1, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48438);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long_long_PeriodType1() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ifrgre11dj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48439,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ifrgre11dj() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48439);
        __CLR4_4_1110o110olgchosb2.R.inc(48440);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1110o110olgchosb2.R.inc(48441);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1110o110olgchosb2.R.inc(48442);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), (PeriodType) null);
        __CLR4_4_1110o110olgchosb2.R.inc(48443);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48444);assertEquals(1, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48445);assertEquals(1, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48446);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48447);assertEquals(1, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48448);assertEquals(1, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48449);assertEquals(1, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48450);assertEquals(1, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48451);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_long_long_PeriodType2() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6rhyx11dw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48452,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6rhyx11dw() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48452);
        __CLR4_4_1110o110olgchosb2.R.inc(48453);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1110o110olgchosb2.R.inc(48454);DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1110o110olgchosb2.R.inc(48455);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), PeriodType.dayTime());
        __CLR4_4_1110o110olgchosb2.R.inc(48456);assertEquals(PeriodType.dayTime(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48457);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48458);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48459);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48460);assertEquals(31, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48461);assertEquals(1, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48462);assertEquals(1, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48463);assertEquals(1, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48464);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_long_long_PeriodType3() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxrj6g11e9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48465,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxrj6g11e9() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48465);
        __CLR4_4_1110o110olgchosb2.R.inc(48466);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1110o110olgchosb2.R.inc(48467);DateTime dt2 = new DateTime(2004, 6, 9, 1, 1, 1, 1);
        __CLR4_4_1110o110olgchosb2.R.inc(48468);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), PeriodType.standard().withMillisRemoved());
        __CLR4_4_1110o110olgchosb2.R.inc(48469);assertEquals(PeriodType.standard().withMillisRemoved(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48470);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48471);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48472);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48473);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48474);assertEquals(1, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48475);assertEquals(1, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48476);assertEquals(1, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48477);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long_long_Chronology1() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16cacp11em();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48478,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16cacp11em() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48478);
        __CLR4_4_1110o110olgchosb2.R.inc(48479);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance());
        __CLR4_4_1110o110olgchosb2.R.inc(48480);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, CopticChronology.getInstance());
        __CLR4_4_1110o110olgchosb2.R.inc(48481);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), CopticChronology.getInstance());
        __CLR4_4_1110o110olgchosb2.R.inc(48482);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48483);assertEquals(1, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48484);assertEquals(1, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48485);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48486);assertEquals(1, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48487);assertEquals(1, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48488);assertEquals(1, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48489);assertEquals(1, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48490);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_long_long_Chronology2() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13fc95611ez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13fc95611ez() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48491);
        __CLR4_4_1110o110olgchosb2.R.inc(48492);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1110o110olgchosb2.R.inc(48493);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1110o110olgchosb2.R.inc(48494);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), (Chronology) null);
        __CLR4_4_1110o110olgchosb2.R.inc(48495);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48496);assertEquals(1, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48497);assertEquals(1, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48498);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48499);assertEquals(1, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48500);assertEquals(1, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48501);assertEquals(1, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48502);assertEquals(1, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48503);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long_long_PeriodType_Chronology1() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g1lwlp11fc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_PeriodType_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48504,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g1lwlp11fc() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48504);
        __CLR4_4_1110o110olgchosb2.R.inc(48505);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance());
        __CLR4_4_1110o110olgchosb2.R.inc(48506);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, CopticChronology.getInstance());
        __CLR4_4_1110o110olgchosb2.R.inc(48507);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), (PeriodType) null, CopticChronology.getInstance());
        __CLR4_4_1110o110olgchosb2.R.inc(48508);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48509);assertEquals(1, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48510);assertEquals(1, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48511);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48512);assertEquals(1, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48513);assertEquals(1, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48514);assertEquals(1, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48515);assertEquals(1, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48516);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_long_long_PeriodType_Chronology2() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cslxt811fp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_PeriodType_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cslxt811fp() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48517);
        __CLR4_4_1110o110olgchosb2.R.inc(48518);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1110o110olgchosb2.R.inc(48519);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1110o110olgchosb2.R.inc(48520);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), (PeriodType) null, null);
        __CLR4_4_1110o110olgchosb2.R.inc(48521);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48522);assertEquals(1, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48523);assertEquals(1, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48524);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48525);assertEquals(1, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48526);assertEquals(1, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48527);assertEquals(1, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48528);assertEquals(1, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48529);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_RI_RI1() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n7qods11g2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48530,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n7qods11g2() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48530);
        __CLR4_4_1110o110olgchosb2.R.inc(48531);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1110o110olgchosb2.R.inc(48532);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1110o110olgchosb2.R.inc(48533);MutablePeriod test = new MutablePeriod(dt1, dt2);
        __CLR4_4_1110o110olgchosb2.R.inc(48534);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48535);assertEquals(1, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48536);assertEquals(1, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48537);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48538);assertEquals(1, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48539);assertEquals(1, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48540);assertEquals(1, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48541);assertEquals(1, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48542);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI2() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jyqplb11gf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jyqplb11gf() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48543);
        __CLR4_4_1110o110olgchosb2.R.inc(48544);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1110o110olgchosb2.R.inc(48545);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1110o110olgchosb2.R.inc(48546);MutablePeriod test = new MutablePeriod(dt1, dt2);
        __CLR4_4_1110o110olgchosb2.R.inc(48547);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48548);assertEquals(1, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48549);assertEquals(1, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48550);assertEquals(1, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48551);assertEquals(1, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48552);assertEquals(1, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48553);assertEquals(1, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48554);assertEquals(1, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48555);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI3() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gpqqsu11gs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48556,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gpqqsu11gs() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48556);
        __CLR4_4_1110o110olgchosb2.R.inc(48557);DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1110o110olgchosb2.R.inc(48558);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1110o110olgchosb2.R.inc(48559);MutablePeriod test = new MutablePeriod(dt1, dt2);
        __CLR4_4_1110o110olgchosb2.R.inc(48560);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48561);assertEquals(3, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48562);assertEquals(1, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48563);assertEquals(1, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48564);assertEquals(1, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48565);assertEquals(0, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48566);assertEquals(1, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48567);assertEquals(1, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48568);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI4() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dgqs0d11h5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dgqs0d11h5() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48569);
        __CLR4_4_1110o110olgchosb2.R.inc(48570);DateTime dt1 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1110o110olgchosb2.R.inc(48571);DateTime dt2 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1110o110olgchosb2.R.inc(48572);MutablePeriod test = new MutablePeriod(dt1, dt2);
        __CLR4_4_1110o110olgchosb2.R.inc(48573);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48574);assertEquals(-3, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48575);assertEquals(-1, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48576);assertEquals(-1, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48577);assertEquals(-1, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48578);assertEquals(0, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48579);assertEquals(-1, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48580);assertEquals(-1, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48581);assertEquals(-1, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI5() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a7qt7w11hi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a7qt7w11hi() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48582);
        __CLR4_4_1110o110olgchosb2.R.inc(48583);DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1110o110olgchosb2.R.inc(48584);DateTime dt2 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1110o110olgchosb2.R.inc(48585);MutablePeriod test = new MutablePeriod(dt1, dt2);
        __CLR4_4_1110o110olgchosb2.R.inc(48586);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48587);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48588);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48589);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48590);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48591);assertEquals(0, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48592);assertEquals(0, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48593);assertEquals(0, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48594);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_RI_RI_PeriodType1() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bl9f0a11hv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48595,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bl9f0a11hv() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48595);
        __CLR4_4_1110o110olgchosb2.R.inc(48596);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1110o110olgchosb2.R.inc(48597);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1110o110olgchosb2.R.inc(48598);MutablePeriod test = new MutablePeriod(dt1, dt2, null);
        __CLR4_4_1110o110olgchosb2.R.inc(48599);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48600);assertEquals(1, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48601);assertEquals(1, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48602);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48603);assertEquals(1, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48604);assertEquals(1, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48605);assertEquals(1, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48606);assertEquals(1, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48607);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI_PeriodType2() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18c9g7t11i8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48608,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18c9g7t11i8() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48608);
        __CLR4_4_1110o110olgchosb2.R.inc(48609);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1110o110olgchosb2.R.inc(48610);DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1110o110olgchosb2.R.inc(48611);MutablePeriod test = new MutablePeriod(dt1, dt2, PeriodType.dayTime());
        __CLR4_4_1110o110olgchosb2.R.inc(48612);assertEquals(PeriodType.dayTime(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48613);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48614);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48615);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48616);assertEquals(31, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48617);assertEquals(1, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48618);assertEquals(1, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48619);assertEquals(1, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48620);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI_PeriodType3() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1539hfc11il();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI_PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1539hfc11il() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48621);
        __CLR4_4_1110o110olgchosb2.R.inc(48622);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1110o110olgchosb2.R.inc(48623);DateTime dt2 = new DateTime(2004, 6, 9, 1, 1, 1, 1);
        __CLR4_4_1110o110olgchosb2.R.inc(48624);MutablePeriod test = new MutablePeriod(dt1, dt2, PeriodType.standard().withMillisRemoved());
        __CLR4_4_1110o110olgchosb2.R.inc(48625);assertEquals(PeriodType.standard().withMillisRemoved(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48626);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48627);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48628);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48629);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48630);assertEquals(1, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48631);assertEquals(1, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48632);assertEquals(1, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48633);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI_PeriodType4() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11u9imv11iy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI_PeriodType4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11u9imv11iy() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48634);
        __CLR4_4_1110o110olgchosb2.R.inc(48635);DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1110o110olgchosb2.R.inc(48636);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1110o110olgchosb2.R.inc(48637);MutablePeriod test = new MutablePeriod(dt1, dt2, PeriodType.standard());
        __CLR4_4_1110o110olgchosb2.R.inc(48638);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48639);assertEquals(3, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48640);assertEquals(1, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48641);assertEquals(1, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48642);assertEquals(1, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48643);assertEquals(0, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48644);assertEquals(1, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48645);assertEquals(1, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48646);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI_PeriodType5() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11eqg5m11jb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RI_PeriodType5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11eqg5m11jb() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48647);
        __CLR4_4_1110o110olgchosb2.R.inc(48648);DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1110o110olgchosb2.R.inc(48649);DateTime dt2 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1110o110olgchosb2.R.inc(48650);MutablePeriod test = new MutablePeriod(dt1, dt2, PeriodType.standard());
        __CLR4_4_1110o110olgchosb2.R.inc(48651);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48652);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48653);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48654);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48655);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48656);assertEquals(0, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48657);assertEquals(0, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48658);assertEquals(0, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48659);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_RI_RD1() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqt35711jo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RD1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqt35711jo() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48660);
        __CLR4_4_1110o110olgchosb2.R.inc(48661);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1110o110olgchosb2.R.inc(48662);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1110o110olgchosb2.R.inc(48663);Duration dur = new Interval(dt1, dt2).toDuration();
        __CLR4_4_1110o110olgchosb2.R.inc(48664);MutablePeriod test = new MutablePeriod(dt1, dur);
        __CLR4_4_1110o110olgchosb2.R.inc(48665);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48666);assertEquals(1, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48667);assertEquals(1, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48668);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48669);assertEquals(1, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48670);assertEquals(1, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48671);assertEquals(1, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48672);assertEquals(1, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48673);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RD2() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qht4cq11k2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RD2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qht4cq11k2() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48674);
        __CLR4_4_1110o110olgchosb2.R.inc(48675);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1110o110olgchosb2.R.inc(48676);Duration dur = null;
        __CLR4_4_1110o110olgchosb2.R.inc(48677);MutablePeriod test = new MutablePeriod(dt1, dur);
        __CLR4_4_1110o110olgchosb2.R.inc(48678);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48679);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48680);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48681);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48682);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48683);assertEquals(0, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48684);assertEquals(0, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48685);assertEquals(0, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48686);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_RI_RD_PeriodType1() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wz1nfl11kf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RD_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48687,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wz1nfl11kf() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48687);
        __CLR4_4_1110o110olgchosb2.R.inc(48688);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1110o110olgchosb2.R.inc(48689);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1110o110olgchosb2.R.inc(48690);Duration dur = new Interval(dt1, dt2).toDuration();
        __CLR4_4_1110o110olgchosb2.R.inc(48691);MutablePeriod test = new MutablePeriod(dt1, dur, PeriodType.yearDayTime());
        __CLR4_4_1110o110olgchosb2.R.inc(48692);assertEquals(PeriodType.yearDayTime(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48693);assertEquals(1, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48694);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48695);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48696);assertEquals(31, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48697);assertEquals(1, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48698);assertEquals(1, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48699);assertEquals(1, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48700);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RD_PeriodType2() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yt2fr211kt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_RI_RD_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yt2fr211kt() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48701);
        __CLR4_4_1110o110olgchosb2.R.inc(48702);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1110o110olgchosb2.R.inc(48703);Duration dur = null;
        __CLR4_4_1110o110olgchosb2.R.inc(48704);MutablePeriod test = new MutablePeriod(dt1, dur, (PeriodType) null);
        __CLR4_4_1110o110olgchosb2.R.inc(48705);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48706);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48707);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48708);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48709);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48710);assertEquals(0, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48711);assertEquals(0, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48712);assertEquals(0, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48713);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (Object)
     */
    @Test
    public void testConstructor_Object1() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19oqxcy11l6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48714,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19oqxcy11l6() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48714);
        __CLR4_4_1110o110olgchosb2.R.inc(48715);MutablePeriod test = new MutablePeriod("P1Y2M3D");
        __CLR4_4_1110o110olgchosb2.R.inc(48716);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48717);assertEquals(1, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48718);assertEquals(2, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48719);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48720);assertEquals(3, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48721);assertEquals(0, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48722);assertEquals(0, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48723);assertEquals(0, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48724);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_Object2() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxqw5f11lh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxqw5f11lh() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48725);
        __CLR4_4_1110o110olgchosb2.R.inc(48726);MutablePeriod test = new MutablePeriod((Object) null);
        __CLR4_4_1110o110olgchosb2.R.inc(48727);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48728);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48729);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48730);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48731);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48732);assertEquals(0, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48733);assertEquals(0, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48734);assertEquals(0, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48735);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_Object3() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g6quxw11ls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g6quxw11ls() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48736);
        __CLR4_4_1110o110olgchosb2.R.inc(48737);MutablePeriod test = new MutablePeriod(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()));
        __CLR4_4_1110o110olgchosb2.R.inc(48738);assertEquals(PeriodType.dayTime(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48739);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48740);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48741);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48742);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48743);assertEquals(1, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48744);assertEquals(2, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48745);assertEquals(3, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48746);assertEquals(4, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_Object4() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jfqtqd11m3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jfqtqd11m3() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48747);
        __CLR4_4_1110o110olgchosb2.R.inc(48748);Period base = new Period(1, 1, 0, 1, 1, 1, 1, 1, PeriodType.standard());
        __CLR4_4_1110o110olgchosb2.R.inc(48749);MutablePeriod test = new MutablePeriod(base);
        __CLR4_4_1110o110olgchosb2.R.inc(48750);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48751);assertEquals(1, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48752);assertEquals(1, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48753);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48754);assertEquals(1, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48755);assertEquals(1, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48756);assertEquals(1, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48757);assertEquals(1, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48758);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (Object,PeriodType)
     */
    @Test
    public void testConstructor_Object_PeriodType1() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170brck11mf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170brck11mf() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48759);
        __CLR4_4_1110o110olgchosb2.R.inc(48760);MutablePeriod test = new MutablePeriod("P1Y2M3D", PeriodType.yearMonthDayTime());
        __CLR4_4_1110o110olgchosb2.R.inc(48761);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48762);assertEquals(1, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48763);assertEquals(2, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48764);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48765);assertEquals(3, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48766);assertEquals(0, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48767);assertEquals(0, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48768);assertEquals(0, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48769);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_Object_PeriodType2() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9bq5111mq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9bq5111mq() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48770);
        __CLR4_4_1110o110olgchosb2.R.inc(48771);MutablePeriod test = new MutablePeriod((Object) null, PeriodType.yearMonthDayTime());
        __CLR4_4_1110o110olgchosb2.R.inc(48772);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48773);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48774);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48775);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48776);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48777);assertEquals(0, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48778);assertEquals(0, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48779);assertEquals(0, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48780);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_Object_PeriodType3() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1diboxi11n1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object_PeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1diboxi11n1() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48781);
        __CLR4_4_1110o110olgchosb2.R.inc(48782);MutablePeriod test = new MutablePeriod(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()), PeriodType.yearMonthDayTime());
        __CLR4_4_1110o110olgchosb2.R.inc(48783);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48784);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48785);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48786);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48787);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48788);assertEquals(1, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48789);assertEquals(2, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48790);assertEquals(3, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48791);assertEquals(4, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_Object_PeriodType4() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1grbnpz11nc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object_PeriodType4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48792,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1grbnpz11nc() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48792);
        __CLR4_4_1110o110olgchosb2.R.inc(48793);MutablePeriod test = new MutablePeriod(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()), (PeriodType) null);
        __CLR4_4_1110o110olgchosb2.R.inc(48794);assertEquals(PeriodType.dayTime(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48795);assertEquals(0, test.getYears());
        __CLR4_4_1110o110olgchosb2.R.inc(48796);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48797);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48798);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48799);assertEquals(1, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48800);assertEquals(2, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48801);assertEquals(3, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48802);assertEquals(4, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_Object_Chronology1() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pmfign11nn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pmfign11nn() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48803);
        __CLR4_4_1110o110olgchosb2.R.inc(48804);long length =
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                        5L * DateTimeConstants.MILLIS_PER_HOUR +
                        6L * DateTimeConstants.MILLIS_PER_MINUTE +
                        7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1110o110olgchosb2.R.inc(48805);MutablePeriod test = new MutablePeriod(new Duration(length), ISOChronology.getInstance());
        __CLR4_4_1110o110olgchosb2.R.inc(48806);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48807);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
        __CLR4_4_1110o110olgchosb2.R.inc(48808);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48809);assertEquals(0, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48810);assertEquals(0, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48811);assertEquals((450 * 24) + 5, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48812);assertEquals(6, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48813);assertEquals(7, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48814);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

    @Test
    public void testConstructor_Object_Chronology2() throws Throwable {__CLR4_4_1110o110olgchosb2.R.globalSliceStart(getClass().getName(),48815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svfh9411nz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1110o110olgchosb2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1110o110olgchosb2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_Object_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svfh9411nz() throws Throwable{try{__CLR4_4_1110o110olgchosb2.R.inc(48815);
        __CLR4_4_1110o110olgchosb2.R.inc(48816);long length =
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                        5L * DateTimeConstants.MILLIS_PER_HOUR +
                        6L * DateTimeConstants.MILLIS_PER_MINUTE +
                        7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1110o110olgchosb2.R.inc(48817);MutablePeriod test = new MutablePeriod(new Duration(length), ISOChronology.getInstanceUTC());
        __CLR4_4_1110o110olgchosb2.R.inc(48818);assertEquals(PeriodType.standard(), test.getPeriodType());
        __CLR4_4_1110o110olgchosb2.R.inc(48819);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
        __CLR4_4_1110o110olgchosb2.R.inc(48820);assertEquals(0, test.getMonths());
        __CLR4_4_1110o110olgchosb2.R.inc(48821);assertEquals(64, test.getWeeks());
        __CLR4_4_1110o110olgchosb2.R.inc(48822);assertEquals(2, test.getDays());
        __CLR4_4_1110o110olgchosb2.R.inc(48823);assertEquals(5, test.getHours());
        __CLR4_4_1110o110olgchosb2.R.inc(48824);assertEquals(6, test.getMinutes());
        __CLR4_4_1110o110olgchosb2.R.inc(48825);assertEquals(7, test.getSeconds());
        __CLR4_4_1110o110olgchosb2.R.inc(48826);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_1110o110olgchosb2.R.flushNeeded();}}

}
