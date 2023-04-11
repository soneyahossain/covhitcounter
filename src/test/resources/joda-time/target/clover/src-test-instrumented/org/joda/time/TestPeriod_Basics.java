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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.base.BasePeriod;
import org.joda.time.format.PeriodFormat;
import org.joda.time.format.PeriodFormatter;

/**
 * This class is a Junit unit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestPeriod_Basics {static class __CLR4_4_1147m147mlgchoset{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,53243,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    //private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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

    public static void main(String[] args) throws Exception {try{__CLR4_4_1147m147mlgchoset.R.inc(52114);
        __CLR4_4_1147m147mlgchoset.R.inc(52115);TestPeriod_Basics TB = new TestPeriod_Basics();
        __CLR4_4_1147m147mlgchoset.R.inc(52116);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52117);TB.testTest();
        __CLR4_4_1147m147mlgchoset.R.inc(52118);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52119);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52120);TB.testGetPeriodType();
        __CLR4_4_1147m147mlgchoset.R.inc(52121);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52122);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52123);TB.testGetMethods();
        __CLR4_4_1147m147mlgchoset.R.inc(52124);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52125);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52126);TB.testValueIndexMethods();
        __CLR4_4_1147m147mlgchoset.R.inc(52127);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52128);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52129);TB.testTypeIndexMethods();
        __CLR4_4_1147m147mlgchoset.R.inc(52130);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52131);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52132);TB.testIsSupported();
        __CLR4_4_1147m147mlgchoset.R.inc(52133);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52134);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52135);TB.testIndexOf();
        __CLR4_4_1147m147mlgchoset.R.inc(52136);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52137);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52138);TB.testGet();
        __CLR4_4_1147m147mlgchoset.R.inc(52139);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52140);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52141);TB.testEqualsHashCode();
        __CLR4_4_1147m147mlgchoset.R.inc(52142);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52143);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52144);TB.testSerialization();
        __CLR4_4_1147m147mlgchoset.R.inc(52145);TB.tearDown();
        //    TB.setUp(); TB.testAddTo1(); TB.tearDown();
        //    TB.setUp(); TB.testAddTo2(); TB.tearDown();
        //    TB.setUp(); TB.testAddTo3(); TB.tearDown();
        //    TB.setUp(); TB.testAddTo4(); TB.tearDown();
        //    TB.setUp(); TB.testAddToWithChronology1(); TB.tearDown();
        //    TB.setUp(); TB.testAddToWithChronology2(); TB.tearDown();
        //    TB.setUp(); TB.testAddToWithChronology3(); TB.tearDown();
        //    TB.setUp(); TB.testAddToRI1(); TB.tearDown();
        //    TB.setUp(); TB.testAddToRI2(); TB.tearDown();
        //    TB.setUp(); TB.testAddToRI3(); TB.tearDown();
        //    TB.setUp(); TB.testAddToRI4(); TB.tearDown();
        //    TB.setUp(); TB.testAddToRI5(); TB.tearDown();
        //    TB.setUp(); TB.testAddIntoRWI1(); TB.tearDown();
        //    TB.setUp(); TB.testAddIntoRWI2(); TB.tearDown();
        //    TB.setUp(); TB.testAddIntoRWI3(); TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52146);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52147);TB.testToString();
        __CLR4_4_1147m147mlgchoset.R.inc(52148);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52149);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52150);TB.testToString_PeriodFormatter();
        __CLR4_4_1147m147mlgchoset.R.inc(52151);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52152);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52153);TB.testToString_nullPeriodFormatter();
        __CLR4_4_1147m147mlgchoset.R.inc(52154);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52155);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52156);TB.testToPeriod();
        __CLR4_4_1147m147mlgchoset.R.inc(52157);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52158);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52159);TB.testToMutablePeriod();
        __CLR4_4_1147m147mlgchoset.R.inc(52160);TB.tearDown();
//    TB.setUp(); TB.testToDurationMillisFrom(); TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52161);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52162);TB.testToDurationFrom();
        __CLR4_4_1147m147mlgchoset.R.inc(52163);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52164);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52165);TB.testToDurationTo();
        __CLR4_4_1147m147mlgchoset.R.inc(52166);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52167);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52168);TB.testWithPeriodType1();
        __CLR4_4_1147m147mlgchoset.R.inc(52169);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52170);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52171);TB.testWithPeriodType2();
        __CLR4_4_1147m147mlgchoset.R.inc(52172);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52173);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52174);TB.testWithPeriodType3();
        __CLR4_4_1147m147mlgchoset.R.inc(52175);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52176);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52177);TB.testWithPeriodType4();
        __CLR4_4_1147m147mlgchoset.R.inc(52178);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52179);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52180);TB.testWithPeriodType5();
        __CLR4_4_1147m147mlgchoset.R.inc(52181);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52182);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52183);TB.testWithFields1();
        __CLR4_4_1147m147mlgchoset.R.inc(52184);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52185);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52186);TB.testWithFields2();
        __CLR4_4_1147m147mlgchoset.R.inc(52187);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52188);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52189);TB.testWithFields3();
        __CLR4_4_1147m147mlgchoset.R.inc(52190);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52191);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52192);TB.testWithField1();
        __CLR4_4_1147m147mlgchoset.R.inc(52193);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52194);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52195);TB.testWithField2();
        __CLR4_4_1147m147mlgchoset.R.inc(52196);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52197);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52198);TB.testWithField3();
        __CLR4_4_1147m147mlgchoset.R.inc(52199);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52200);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52201);TB.testWithField4();
        __CLR4_4_1147m147mlgchoset.R.inc(52202);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52203);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52204);TB.testWithFieldAdded1();
        __CLR4_4_1147m147mlgchoset.R.inc(52205);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52206);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52207);TB.testWithFieldAdded2();
        __CLR4_4_1147m147mlgchoset.R.inc(52208);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52209);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52210);TB.testWithFieldAdded3();
        __CLR4_4_1147m147mlgchoset.R.inc(52211);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52212);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52213);TB.testWithFieldAdded4();
        __CLR4_4_1147m147mlgchoset.R.inc(52214);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52215);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52216);TB.testPeriodStatics();
        __CLR4_4_1147m147mlgchoset.R.inc(52217);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52218);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52219);TB.testWith();
        __CLR4_4_1147m147mlgchoset.R.inc(52220);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52221);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52222);TB.testPlus();
        __CLR4_4_1147m147mlgchoset.R.inc(52223);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52224);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52225);TB.testMinus();
        __CLR4_4_1147m147mlgchoset.R.inc(52226);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52227);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52228);TB.testPlusFields();
        __CLR4_4_1147m147mlgchoset.R.inc(52229);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52230);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52231);TB.testPlusFieldsZero();
        __CLR4_4_1147m147mlgchoset.R.inc(52232);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52233);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52234);TB.testMinusFields();
        __CLR4_4_1147m147mlgchoset.R.inc(52235);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52236);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52237);TB.testMultipliedBy();
        __CLR4_4_1147m147mlgchoset.R.inc(52238);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52239);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52240);TB.testNegated();
        __CLR4_4_1147m147mlgchoset.R.inc(52241);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52242);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52243);TB.testToStandardWeeks();
        __CLR4_4_1147m147mlgchoset.R.inc(52244);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52245);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52246);TB.testToStandardWeeks_years();
        __CLR4_4_1147m147mlgchoset.R.inc(52247);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52248);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52249);TB.testToStandardWeeks_months();
        __CLR4_4_1147m147mlgchoset.R.inc(52250);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52251);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52252);TB.testToStandardDays();
        __CLR4_4_1147m147mlgchoset.R.inc(52253);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52254);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52255);TB.testToStandardDays_years();
        __CLR4_4_1147m147mlgchoset.R.inc(52256);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52257);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52258);TB.testToStandardDays_months();
        __CLR4_4_1147m147mlgchoset.R.inc(52259);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52260);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52261);TB.testToStandardHours();
        __CLR4_4_1147m147mlgchoset.R.inc(52262);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52263);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52264);TB.testToStandardHours_years();
        __CLR4_4_1147m147mlgchoset.R.inc(52265);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52266);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52267);TB.testToStandardHours_months();
        __CLR4_4_1147m147mlgchoset.R.inc(52268);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52269);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52270);TB.testToStandardMinutes();
        __CLR4_4_1147m147mlgchoset.R.inc(52271);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52272);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52273);TB.testToStandardMinutes_years();
        __CLR4_4_1147m147mlgchoset.R.inc(52274);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52275);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52276);TB.testToStandardMinutes_months();
        __CLR4_4_1147m147mlgchoset.R.inc(52277);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52278);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52279);TB.testToStandardSeconds();
        __CLR4_4_1147m147mlgchoset.R.inc(52280);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52281);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52282);TB.testToStandardSeconds_years();
        __CLR4_4_1147m147mlgchoset.R.inc(52283);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52284);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52285);TB.testToStandardSeconds_months();
        __CLR4_4_1147m147mlgchoset.R.inc(52286);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52287);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52288);TB.testToStandardDuration();
        __CLR4_4_1147m147mlgchoset.R.inc(52289);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52290);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52291);TB.testToStandardDuration_years();
        __CLR4_4_1147m147mlgchoset.R.inc(52292);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52293);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52294);TB.testToStandardDuration_months();
        __CLR4_4_1147m147mlgchoset.R.inc(52295);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52296);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52297);TB.testNormalizedStandard_yearMonth1();
        __CLR4_4_1147m147mlgchoset.R.inc(52298);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52299);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52300);TB.testNormalizedStandard_yearMonth2();
        __CLR4_4_1147m147mlgchoset.R.inc(52301);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52302);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52303);TB.testNormalizedStandard_weekDay1();
        __CLR4_4_1147m147mlgchoset.R.inc(52304);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52305);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52306);TB.testNormalizedStandard_weekDay2();
        __CLR4_4_1147m147mlgchoset.R.inc(52307);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52308);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52309);TB.testNormalizedStandard_yearMonthWeekDay();
        __CLR4_4_1147m147mlgchoset.R.inc(52310);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52311);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52312);TB.testNormalizedStandard_yearMonthDay();
        __CLR4_4_1147m147mlgchoset.R.inc(52313);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52314);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52315);TB.testNormalizedStandard_negative();
        __CLR4_4_1147m147mlgchoset.R.inc(52316);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52317);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52318);TB.testNormalizedStandard_fullNegative();
        __CLR4_4_1147m147mlgchoset.R.inc(52319);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52320);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52321);TB.testNormalizedStandard_periodType_yearMonth1();
        __CLR4_4_1147m147mlgchoset.R.inc(52322);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52323);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52324);TB.testNormalizedStandard_periodType_yearMonth2();
        __CLR4_4_1147m147mlgchoset.R.inc(52325);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52326);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52327);TB.testNormalizedStandard_periodType_yearMonth3();
        __CLR4_4_1147m147mlgchoset.R.inc(52328);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52329);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52330);TB.testNormalizedStandard_periodType_weekDay1();
        __CLR4_4_1147m147mlgchoset.R.inc(52331);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52332);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52333);TB.testNormalizedStandard_periodType_weekDay2();
        __CLR4_4_1147m147mlgchoset.R.inc(52334);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52335);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52336);TB.testNormalizedStandard_periodType_weekDay3();
        __CLR4_4_1147m147mlgchoset.R.inc(52337);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52338);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52339);TB.testNormalizedStandard_periodType_yearMonthWeekDay();
        __CLR4_4_1147m147mlgchoset.R.inc(52340);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52341);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52342);TB.testNormalizedStandard_periodType_yearMonthDay();
        __CLR4_4_1147m147mlgchoset.R.inc(52343);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52344);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52345);TB.testNormalizedStandard_periodType_months1();
        __CLR4_4_1147m147mlgchoset.R.inc(52346);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52347);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52348);TB.testNormalizedStandard_periodType_months2();
        __CLR4_4_1147m147mlgchoset.R.inc(52349);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52350);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52351);TB.testNormalizedStandard_periodType_months3();
        __CLR4_4_1147m147mlgchoset.R.inc(52352);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52353);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52354);TB.testNormalizedStandard_periodType_years();
        __CLR4_4_1147m147mlgchoset.R.inc(52355);TB.tearDown();
        __CLR4_4_1147m147mlgchoset.R.inc(52356);TB.setUp();
        __CLR4_4_1147m147mlgchoset.R.inc(52357);TB.testNormalizedStandard_periodType_monthsWeeks();
        __CLR4_4_1147m147mlgchoset.R.inc(52358);TB.tearDown();

    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestPeriod_Basics.class);
    }

    public TestPeriod_Basics(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1147m147mlgchoset.R.inc(52359);
        __CLR4_4_1147m147mlgchoset.R.inc(52360);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1147m147mlgchoset.R.inc(52361);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1147m147mlgchoset.R.inc(52362);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1147m147mlgchoset.R.inc(52363);originalLocale = Locale.getDefault();
        __CLR4_4_1147m147mlgchoset.R.inc(52364);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1147m147mlgchoset.R.inc(52365);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1147m147mlgchoset.R.inc(52366);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1147m147mlgchoset.R.inc(52367);
        __CLR4_4_1147m147mlgchoset.R.inc(52368);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1147m147mlgchoset.R.inc(52369);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1147m147mlgchoset.R.inc(52370);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1147m147mlgchoset.R.inc(52371);Locale.setDefault(originalLocale);
        __CLR4_4_1147m147mlgchoset.R.inc(52372);originalDateTimeZone = null;
        __CLR4_4_1147m147mlgchoset.R.inc(52373);originalTimeZone = null;
        __CLR4_4_1147m147mlgchoset.R.inc(52374);originalLocale = null;
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqj14ev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52375,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqj14ev(){try{__CLR4_4_1147m147mlgchoset.R.inc(52375);
        __CLR4_4_1147m147mlgchoset.R.inc(52376);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1147m147mlgchoset.R.inc(52377);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1147m147mlgchoset.R.inc(52378);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetPeriodType() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivat1i14ez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testGetPeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivat1i14ez(){try{__CLR4_4_1147m147mlgchoset.R.inc(52379);
        __CLR4_4_1147m147mlgchoset.R.inc(52380);Period test = new Period(0L);
        __CLR4_4_1147m147mlgchoset.R.inc(52381);assertEquals(PeriodType.standard(), test.getPeriodType());
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testGetMethods() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sjdmz14f2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testGetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52382,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sjdmz14f2(){try{__CLR4_4_1147m147mlgchoset.R.inc(52382);
        __CLR4_4_1147m147mlgchoset.R.inc(52383);Period test = new Period(0L);
        __CLR4_4_1147m147mlgchoset.R.inc(52384);assertEquals(0, test.getYears());
        __CLR4_4_1147m147mlgchoset.R.inc(52385);assertEquals(0, test.getMonths());
        __CLR4_4_1147m147mlgchoset.R.inc(52386);assertEquals(0, test.getWeeks());
        __CLR4_4_1147m147mlgchoset.R.inc(52387);assertEquals(0, test.getDays());
        __CLR4_4_1147m147mlgchoset.R.inc(52388);assertEquals(0, test.getHours());
        __CLR4_4_1147m147mlgchoset.R.inc(52389);assertEquals(0, test.getMinutes());
        __CLR4_4_1147m147mlgchoset.R.inc(52390);assertEquals(0, test.getSeconds());
        __CLR4_4_1147m147mlgchoset.R.inc(52391);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testValueIndexMethods() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c4dda214fc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testValueIndexMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52392,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c4dda214fc(){try{__CLR4_4_1147m147mlgchoset.R.inc(52392);
        __CLR4_4_1147m147mlgchoset.R.inc(52393);Period test = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
        __CLR4_4_1147m147mlgchoset.R.inc(52394);assertEquals(6, test.size());
        __CLR4_4_1147m147mlgchoset.R.inc(52395);assertEquals(1, test.getValue(0));
        __CLR4_4_1147m147mlgchoset.R.inc(52396);assertEquals(4, test.getValue(1));
        __CLR4_4_1147m147mlgchoset.R.inc(52397);assertEquals(5, test.getValue(2));
        __CLR4_4_1147m147mlgchoset.R.inc(52398);assertEquals(6, test.getValue(3));
        __CLR4_4_1147m147mlgchoset.R.inc(52399);assertEquals(7, test.getValue(4));
        __CLR4_4_1147m147mlgchoset.R.inc(52400);assertEquals(8, test.getValue(5));
        __CLR4_4_1147m147mlgchoset.R.inc(52401);assertEquals(true, Arrays.equals(new int[]{1, 4, 5, 6, 7, 8}, test.getValues()));
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testTypeIndexMethods() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i681n714fm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testTypeIndexMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52402,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i681n714fm(){try{__CLR4_4_1147m147mlgchoset.R.inc(52402);
        __CLR4_4_1147m147mlgchoset.R.inc(52403);Period test = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
        __CLR4_4_1147m147mlgchoset.R.inc(52404);assertEquals(6, test.size());
        __CLR4_4_1147m147mlgchoset.R.inc(52405);assertEquals(DurationFieldType.years(), test.getFieldType(0));
        __CLR4_4_1147m147mlgchoset.R.inc(52406);assertEquals(DurationFieldType.days(), test.getFieldType(1));
        __CLR4_4_1147m147mlgchoset.R.inc(52407);assertEquals(DurationFieldType.hours(), test.getFieldType(2));
        __CLR4_4_1147m147mlgchoset.R.inc(52408);assertEquals(DurationFieldType.minutes(), test.getFieldType(3));
        __CLR4_4_1147m147mlgchoset.R.inc(52409);assertEquals(DurationFieldType.seconds(), test.getFieldType(4));
        __CLR4_4_1147m147mlgchoset.R.inc(52410);assertEquals(DurationFieldType.millis(), test.getFieldType(5));
        __CLR4_4_1147m147mlgchoset.R.inc(52411);assertEquals(true, Arrays.equals(new DurationFieldType[]{
                        DurationFieldType.years(), DurationFieldType.days(), DurationFieldType.hours(),
                        DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()},
                test.getFieldTypes()));
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testIsSupported() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hma24n14fw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testIsSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52412,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hma24n14fw(){try{__CLR4_4_1147m147mlgchoset.R.inc(52412);
        __CLR4_4_1147m147mlgchoset.R.inc(52413);Period test = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
        __CLR4_4_1147m147mlgchoset.R.inc(52414);assertEquals(true, test.isSupported(DurationFieldType.years()));
        __CLR4_4_1147m147mlgchoset.R.inc(52415);assertEquals(false, test.isSupported(DurationFieldType.months()));
        __CLR4_4_1147m147mlgchoset.R.inc(52416);assertEquals(false, test.isSupported(DurationFieldType.weeks()));
        __CLR4_4_1147m147mlgchoset.R.inc(52417);assertEquals(true, test.isSupported(DurationFieldType.days()));
        __CLR4_4_1147m147mlgchoset.R.inc(52418);assertEquals(true, test.isSupported(DurationFieldType.hours()));
        __CLR4_4_1147m147mlgchoset.R.inc(52419);assertEquals(true, test.isSupported(DurationFieldType.minutes()));
        __CLR4_4_1147m147mlgchoset.R.inc(52420);assertEquals(true, test.isSupported(DurationFieldType.seconds()));
        __CLR4_4_1147m147mlgchoset.R.inc(52421);assertEquals(true, test.isSupported(DurationFieldType.millis()));
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testIndexOf() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1656tvi14g6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testIndexOf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1656tvi14g6(){try{__CLR4_4_1147m147mlgchoset.R.inc(52422);
        __CLR4_4_1147m147mlgchoset.R.inc(52423);Period test = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
        __CLR4_4_1147m147mlgchoset.R.inc(52424);assertEquals(0, test.indexOf(DurationFieldType.years()));
        __CLR4_4_1147m147mlgchoset.R.inc(52425);assertEquals(-1, test.indexOf(DurationFieldType.months()));
        __CLR4_4_1147m147mlgchoset.R.inc(52426);assertEquals(-1, test.indexOf(DurationFieldType.weeks()));
        __CLR4_4_1147m147mlgchoset.R.inc(52427);assertEquals(1, test.indexOf(DurationFieldType.days()));
        __CLR4_4_1147m147mlgchoset.R.inc(52428);assertEquals(2, test.indexOf(DurationFieldType.hours()));
        __CLR4_4_1147m147mlgchoset.R.inc(52429);assertEquals(3, test.indexOf(DurationFieldType.minutes()));
        __CLR4_4_1147m147mlgchoset.R.inc(52430);assertEquals(4, test.indexOf(DurationFieldType.seconds()));
        __CLR4_4_1147m147mlgchoset.R.inc(52431);assertEquals(5, test.indexOf(DurationFieldType.millis()));
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testGet() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tpje3v14gg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testGet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tpje3v14gg(){try{__CLR4_4_1147m147mlgchoset.R.inc(52432);
        __CLR4_4_1147m147mlgchoset.R.inc(52433);Period test = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
        __CLR4_4_1147m147mlgchoset.R.inc(52434);assertEquals(1, test.get(DurationFieldType.years()));
        __CLR4_4_1147m147mlgchoset.R.inc(52435);assertEquals(0, test.get(DurationFieldType.months()));
        __CLR4_4_1147m147mlgchoset.R.inc(52436);assertEquals(0, test.get(DurationFieldType.weeks()));
        __CLR4_4_1147m147mlgchoset.R.inc(52437);assertEquals(4, test.get(DurationFieldType.days()));
        __CLR4_4_1147m147mlgchoset.R.inc(52438);assertEquals(5, test.get(DurationFieldType.hours()));
        __CLR4_4_1147m147mlgchoset.R.inc(52439);assertEquals(6, test.get(DurationFieldType.minutes()));
        __CLR4_4_1147m147mlgchoset.R.inc(52440);assertEquals(7, test.get(DurationFieldType.seconds()));
        __CLR4_4_1147m147mlgchoset.R.inc(52441);assertEquals(8, test.get(DurationFieldType.millis()));
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testEqualsHashCode() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in7714gq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in7714gq(){try{__CLR4_4_1147m147mlgchoset.R.inc(52442);
        __CLR4_4_1147m147mlgchoset.R.inc(52443);Period test1 = new Period(123L);
        __CLR4_4_1147m147mlgchoset.R.inc(52444);Period test2 = new Period(123L);
        __CLR4_4_1147m147mlgchoset.R.inc(52445);assertEquals(true, test1.equals(test2));
        __CLR4_4_1147m147mlgchoset.R.inc(52446);assertEquals(true, test2.equals(test1));
        __CLR4_4_1147m147mlgchoset.R.inc(52447);assertEquals(true, test1.equals(test1));
        __CLR4_4_1147m147mlgchoset.R.inc(52448);assertEquals(true, test2.equals(test2));
        __CLR4_4_1147m147mlgchoset.R.inc(52449);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1147m147mlgchoset.R.inc(52450);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1147m147mlgchoset.R.inc(52451);assertEquals(true, test2.hashCode() == test2.hashCode());

        __CLR4_4_1147m147mlgchoset.R.inc(52452);Period test3 = new Period(321L);
        __CLR4_4_1147m147mlgchoset.R.inc(52453);assertEquals(false, test1.equals(test3));
        __CLR4_4_1147m147mlgchoset.R.inc(52454);assertEquals(false, test2.equals(test3));
        __CLR4_4_1147m147mlgchoset.R.inc(52455);assertEquals(false, test3.equals(test1));
        __CLR4_4_1147m147mlgchoset.R.inc(52456);assertEquals(false, test3.equals(test2));
        __CLR4_4_1147m147mlgchoset.R.inc(52457);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1147m147mlgchoset.R.inc(52458);assertEquals(false, test2.hashCode() == test3.hashCode());

        __CLR4_4_1147m147mlgchoset.R.inc(52459);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1147m147mlgchoset.R.inc(52460);assertEquals(true, test1.equals(new MockPeriod(123L)));
        __CLR4_4_1147m147mlgchoset.R.inc(52461);assertEquals(false, test1.equals(new Period(123L, PeriodType.dayTime())));
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    class MockPeriod extends BasePeriod {
        private static final long serialVersionUID = 1L;

        public MockPeriod(long value) {
            super(value, null, null);__CLR4_4_1147m147mlgchoset.R.inc(52463);try{__CLR4_4_1147m147mlgchoset.R.inc(52462);
        }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on914hc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on914hc() throws Exception{try{__CLR4_4_1147m147mlgchoset.R.inc(52464);
        __CLR4_4_1147m147mlgchoset.R.inc(52465);Period test = new Period(123L);

        __CLR4_4_1147m147mlgchoset.R.inc(52466);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1147m147mlgchoset.R.inc(52467);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1147m147mlgchoset.R.inc(52468);oos.writeObject(test);
        __CLR4_4_1147m147mlgchoset.R.inc(52469);oos.close();
        __CLR4_4_1147m147mlgchoset.R.inc(52470);byte[] bytes = baos.toByteArray();

        __CLR4_4_1147m147mlgchoset.R.inc(52471);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1147m147mlgchoset.R.inc(52472);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1147m147mlgchoset.R.inc(52473);Period result = (Period) ois.readObject();
        __CLR4_4_1147m147mlgchoset.R.inc(52474);ois.close();

        __CLR4_4_1147m147mlgchoset.R.inc(52475);assertEquals(test, result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

//    //-----------------------------------------------------------------------
//    @Test public void testAddTo1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 1);
//        assertEquals(expected, added);
//    }
//    
//    @Test public void testAddTo2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, -2);
//        assertEquals(expected, added);
//    }
//    
//    @Test public void testAddTo3() {
//        long expected = TEST_TIME_NOW;
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 0);
//        assertEquals(expected, added);
//    }
//    
//    @Test public void testAddTo4() {
//        long expected = TEST_TIME_NOW + 100L;
//        Period test = new Period(100L);
//        long added = test.addTo(TEST_TIME_NOW, 1);
//        assertEquals(expected, added);
//    }
//    
//    //-----------------------------------------------------------------------
//    @Test public void testAddToWithChronology1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 1, ISOChronology.getInstance());
//        assertEquals(expected, added);
//    }
//    
//    @Test public void testAddToWithChronology2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstanceUTC().years().add(expected, -2);
//        expected = ISOChronology.getInstanceUTC().months().add(expected, -4);
//        expected = ISOChronology.getInstanceUTC().weeks().add(expected, -6);
//        expected = ISOChronology.getInstanceUTC().days().add(expected, -8);
//        expected = ISOChronology.getInstanceUTC().hours().add(expected, -10);
//        expected = ISOChronology.getInstanceUTC().minutes().add(expected, -12);
//        expected = ISOChronology.getInstanceUTC().seconds().add(expected, -14);
//        expected = ISOChronology.getInstanceUTC().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        long added = test.addTo(TEST_TIME_NOW, -2, ISOChronology.getInstanceUTC());  // local specified so use it
//        assertEquals(expected, added);
//    }
//    
//    @Test public void testAddToWithChronology3() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        long added = test.addTo(TEST_TIME_NOW, -2, null);  // no chrono specified so use default
//        assertEquals(expected, added);
//    }
//    
//    //-----------------------------------------------------------------------
//    @Test public void testAddToRI1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        DateTime added = test.addTo(new Instant(), 1);  // Instant has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    @Test public void testAddToRI2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new Instant(), -2);  // Instant has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    @Test public void testAddToRI3() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstanceUTC().years().add(expected, -2);
//        expected = ISOChronology.getInstanceUTC().months().add(expected, -4);
//        expected = ISOChronology.getInstanceUTC().weeks().add(expected, -6);
//        expected = ISOChronology.getInstanceUTC().days().add(expected, -8);
//        expected = ISOChronology.getInstanceUTC().hours().add(expected, -10);
//        expected = ISOChronology.getInstanceUTC().minutes().add(expected, -12);
//        expected = ISOChronology.getInstanceUTC().seconds().add(expected, -14);
//        expected = ISOChronology.getInstanceUTC().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new DateTime(ISOChronology.getInstanceUTC()), -2);  // DateTime has UTC time zone
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstanceUTC(), added.getChronology());
//    }
//    
//    @Test public void testAddToRI4() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance(PARIS).years().add(expected, -2);
//        expected = ISOChronology.getInstance(PARIS).months().add(expected, -4);
//        expected = ISOChronology.getInstance(PARIS).weeks().add(expected, -6);
//        expected = ISOChronology.getInstance(PARIS).days().add(expected, -8);
//        expected = ISOChronology.getInstance(PARIS).hours().add(expected, -10);
//        expected = ISOChronology.getInstance(PARIS).minutes().add(expected, -12);
//        expected = ISOChronology.getInstance(PARIS).seconds().add(expected, -14);
//        expected = ISOChronology.getInstance(PARIS).millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new DateTime(PARIS), -2);  // DateTime has PARIS time zone
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(PARIS), added.getChronology());
//    }
//    
//    @Test public void testAddToRI5() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(null, -2);  // null has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    //-----------------------------------------------------------------------
//    @Test public void testAddIntoRWI1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        MutableDateTime mdt = new MutableDateTime();
//        test.addInto(mdt, 1);
//        assertEquals(expected, mdt.getMillis());
//    }
//    
//    @Test public void testAddIntoRWI2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        MutableDateTime mdt = new MutableDateTime();
//        test.addInto(mdt, -2);  // MutableDateTime has a chronology, use it
//        assertEquals(expected, mdt.getMillis());
//    }
//    
//    @Test public void testAddIntoRWI3() {
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        try {
//            test.addInto(null, 1);
//            fail();
//        } catch (IllegalArgumentException ex) {}
//    }

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid14ho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid14ho(){try{__CLR4_4_1147m147mlgchoset.R.inc(52476);
        __CLR4_4_1147m147mlgchoset.R.inc(52477);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1147m147mlgchoset.R.inc(52478);assertEquals("P1Y2M3W4DT5H6M7.008S", test.toString());

        __CLR4_4_1147m147mlgchoset.R.inc(52479);test = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(52480);assertEquals("PT0S", test.toString());

        __CLR4_4_1147m147mlgchoset.R.inc(52481);test = new Period(12345L);
        __CLR4_4_1147m147mlgchoset.R.inc(52482);assertEquals("PT12.345S", test.toString());
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_PeriodFormatter() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xkl5o114hv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToString_PeriodFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xkl5o114hv(){try{__CLR4_4_1147m147mlgchoset.R.inc(52483);
        __CLR4_4_1147m147mlgchoset.R.inc(52484);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1147m147mlgchoset.R.inc(52485);assertEquals("1 year, 2 months, 3 weeks, 4 days, 5 hours, 6 minutes, 7 seconds and 8 milliseconds", test.toString(PeriodFormat.getDefault()));

        __CLR4_4_1147m147mlgchoset.R.inc(52486);test = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(52487);assertEquals("0 milliseconds", test.toString(PeriodFormat.getDefault()));
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testToString_nullPeriodFormatter() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19j49hk14i0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToString_nullPeriodFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19j49hk14i0(){try{__CLR4_4_1147m147mlgchoset.R.inc(52488);
        __CLR4_4_1147m147mlgchoset.R.inc(52489);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1147m147mlgchoset.R.inc(52490);assertEquals("P1Y2M3W4DT5H6M7.008S", test.toString((PeriodFormatter) null));
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToPeriod() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cvhk1714i3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cvhk1714i3(){try{__CLR4_4_1147m147mlgchoset.R.inc(52491);
        __CLR4_4_1147m147mlgchoset.R.inc(52492);Period test = new Period(123L);
        __CLR4_4_1147m147mlgchoset.R.inc(52493);Period result = test.toPeriod();
        __CLR4_4_1147m147mlgchoset.R.inc(52494);assertSame(test, result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testToMutablePeriod() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13v2j3314i7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToMutablePeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13v2j3314i7(){try{__CLR4_4_1147m147mlgchoset.R.inc(52495);
        __CLR4_4_1147m147mlgchoset.R.inc(52496);Period test = new Period(123L);
        __CLR4_4_1147m147mlgchoset.R.inc(52497);MutablePeriod result = test.toMutablePeriod();
        __CLR4_4_1147m147mlgchoset.R.inc(52498);assertEquals(test, result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
//    @Test public void testToDurationMillisFrom() {
//        Period test = new Period(123L);
//        assertEquals(123L, test.toDurationMillisFrom(0L, null));
//    }

    @Test
    public void testToDurationFrom() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nkq83214ib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToDurationFrom",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nkq83214ib(){try{__CLR4_4_1147m147mlgchoset.R.inc(52499);
        __CLR4_4_1147m147mlgchoset.R.inc(52500);Period test = new Period(123L);
        __CLR4_4_1147m147mlgchoset.R.inc(52501);assertEquals(new Duration(123L), test.toDurationFrom(new Instant(0L)));
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testToDurationTo() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l8901v14ie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToDurationTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l8901v14ie(){try{__CLR4_4_1147m147mlgchoset.R.inc(52502);
        __CLR4_4_1147m147mlgchoset.R.inc(52503);Period test = new Period(123L);
        __CLR4_4_1147m147mlgchoset.R.inc(52504);assertEquals(new Duration(123L), test.toDurationTo(new Instant(123L)));
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithPeriodType1() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d5hicb14ih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithPeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d5hicb14ih(){try{__CLR4_4_1147m147mlgchoset.R.inc(52505);
        __CLR4_4_1147m147mlgchoset.R.inc(52506);Period test = new Period(123L);
        __CLR4_4_1147m147mlgchoset.R.inc(52507);Period result = test.withPeriodType(PeriodType.standard());
        __CLR4_4_1147m147mlgchoset.R.inc(52508);assertSame(test, result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testWithPeriodType2() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19whjju14il();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithPeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19whjju14il(){try{__CLR4_4_1147m147mlgchoset.R.inc(52509);
        __CLR4_4_1147m147mlgchoset.R.inc(52510);Period test = new Period(3123L);
        __CLR4_4_1147m147mlgchoset.R.inc(52511);Period result = test.withPeriodType(PeriodType.dayTime());
        __CLR4_4_1147m147mlgchoset.R.inc(52512);assertEquals(3, result.getSeconds());
        __CLR4_4_1147m147mlgchoset.R.inc(52513);assertEquals(123, result.getMillis());
        __CLR4_4_1147m147mlgchoset.R.inc(52514);assertEquals(PeriodType.dayTime(), result.getPeriodType());
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testWithPeriodType3() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16nhkrd14ir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithPeriodType3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52515,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16nhkrd14ir(){try{__CLR4_4_1147m147mlgchoset.R.inc(52515);
        __CLR4_4_1147m147mlgchoset.R.inc(52516);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        __CLR4_4_1147m147mlgchoset.R.inc(52517);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52518);test.withPeriodType(PeriodType.dayTime());
            __CLR4_4_1147m147mlgchoset.R.inc(52519);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testWithPeriodType4() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ehlyw14iw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithPeriodType4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ehlyw14iw(){try{__CLR4_4_1147m147mlgchoset.R.inc(52520);
        __CLR4_4_1147m147mlgchoset.R.inc(52521);Period test = new Period(3123L);
        __CLR4_4_1147m147mlgchoset.R.inc(52522);Period result = test.withPeriodType(null);
        __CLR4_4_1147m147mlgchoset.R.inc(52523);assertEquals(3, result.getSeconds());
        __CLR4_4_1147m147mlgchoset.R.inc(52524);assertEquals(123, result.getMillis());
        __CLR4_4_1147m147mlgchoset.R.inc(52525);assertEquals(PeriodType.standard(), result.getPeriodType());
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testWithPeriodType5() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15hn6f14j2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithPeriodType5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15hn6f14j2(){try{__CLR4_4_1147m147mlgchoset.R.inc(52526);
        __CLR4_4_1147m147mlgchoset.R.inc(52527);Period test = new Period(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.standard());
        __CLR4_4_1147m147mlgchoset.R.inc(52528);Period result = test.withPeriodType(PeriodType.yearMonthDayTime());
        __CLR4_4_1147m147mlgchoset.R.inc(52529);assertEquals(PeriodType.yearMonthDayTime(), result.getPeriodType());
        __CLR4_4_1147m147mlgchoset.R.inc(52530);assertEquals(1, result.getYears());
        __CLR4_4_1147m147mlgchoset.R.inc(52531);assertEquals(2, result.getMonths());
        __CLR4_4_1147m147mlgchoset.R.inc(52532);assertEquals(0, result.getWeeks());
        __CLR4_4_1147m147mlgchoset.R.inc(52533);assertEquals(4, result.getDays());
        __CLR4_4_1147m147mlgchoset.R.inc(52534);assertEquals(5, result.getHours());
        __CLR4_4_1147m147mlgchoset.R.inc(52535);assertEquals(6, result.getMinutes());
        __CLR4_4_1147m147mlgchoset.R.inc(52536);assertEquals(7, result.getSeconds());
        __CLR4_4_1147m147mlgchoset.R.inc(52537);assertEquals(8, result.getMillis());
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithFields1() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h744vt14je();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFields1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52538,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h744vt14je(){try{__CLR4_4_1147m147mlgchoset.R.inc(52538);
        __CLR4_4_1147m147mlgchoset.R.inc(52539);Period test1 = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1147m147mlgchoset.R.inc(52540);Period test2 = new Period(0, 0, 0, 0, 0, 0, 0, 9, PeriodType.millis());
        __CLR4_4_1147m147mlgchoset.R.inc(52541);Period result = test1.withFields(test2);

        __CLR4_4_1147m147mlgchoset.R.inc(52542);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test1);
        __CLR4_4_1147m147mlgchoset.R.inc(52543);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 9, PeriodType.millis()), test2);
        __CLR4_4_1147m147mlgchoset.R.inc(52544);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 9), result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testWithFields2() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dy463c14jl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFields2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dy463c14jl(){try{__CLR4_4_1147m147mlgchoset.R.inc(52545);
        __CLR4_4_1147m147mlgchoset.R.inc(52546);Period test1 = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1147m147mlgchoset.R.inc(52547);Period test2 = null;
        __CLR4_4_1147m147mlgchoset.R.inc(52548);Period result = test1.withFields(test2);

        __CLR4_4_1147m147mlgchoset.R.inc(52549);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test1);
        __CLR4_4_1147m147mlgchoset.R.inc(52550);assertSame(test1, result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testWithFields3() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ap47av14jr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFields3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ap47av14jr(){try{__CLR4_4_1147m147mlgchoset.R.inc(52551);
        __CLR4_4_1147m147mlgchoset.R.inc(52552);Period test1 = new Period(0, 0, 0, 0, 0, 0, 0, 9, PeriodType.millis());
        __CLR4_4_1147m147mlgchoset.R.inc(52553);Period test2 = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1147m147mlgchoset.R.inc(52554);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52555);test1.withFields(test2);
            __CLR4_4_1147m147mlgchoset.R.inc(52556);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1147m147mlgchoset.R.inc(52557);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 9, PeriodType.millis()), test1);
        __CLR4_4_1147m147mlgchoset.R.inc(52558);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test2);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithField1() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lke16y14jz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithField1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lke16y14jz(){try{__CLR4_4_1147m147mlgchoset.R.inc(52559);
        __CLR4_4_1147m147mlgchoset.R.inc(52560);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1147m147mlgchoset.R.inc(52561);Period result = test.withField(DurationFieldType.years(), 6);

        __CLR4_4_1147m147mlgchoset.R.inc(52562);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test);
        __CLR4_4_1147m147mlgchoset.R.inc(52563);assertEquals(new Period(6, 2, 3, 4, 5, 6, 7, 8), result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testWithField2() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ibe2eh14k4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithField2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ibe2eh14k4(){try{__CLR4_4_1147m147mlgchoset.R.inc(52564);
        __CLR4_4_1147m147mlgchoset.R.inc(52565);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1147m147mlgchoset.R.inc(52566);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52567);test.withField(null, 6);
            __CLR4_4_1147m147mlgchoset.R.inc(52568);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testWithField3() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2e3m014k9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithField3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2e3m014k9(){try{__CLR4_4_1147m147mlgchoset.R.inc(52569);
        __CLR4_4_1147m147mlgchoset.R.inc(52570);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time());
        __CLR4_4_1147m147mlgchoset.R.inc(52571);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52572);test.withField(DurationFieldType.years(), 6);
            __CLR4_4_1147m147mlgchoset.R.inc(52573);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testWithField4() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bte4tj14ke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithField4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bte4tj14ke(){try{__CLR4_4_1147m147mlgchoset.R.inc(52574);
        __CLR4_4_1147m147mlgchoset.R.inc(52575);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time());
        __CLR4_4_1147m147mlgchoset.R.inc(52576);Period result = test.withField(DurationFieldType.years(), 0);
        __CLR4_4_1147m147mlgchoset.R.inc(52577);assertEquals(test, result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithFieldAdded1() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rgt2214ki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rgt2214ki(){try{__CLR4_4_1147m147mlgchoset.R.inc(52578);
        __CLR4_4_1147m147mlgchoset.R.inc(52579);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1147m147mlgchoset.R.inc(52580);Period result = test.withFieldAdded(DurationFieldType.years(), 6);

        __CLR4_4_1147m147mlgchoset.R.inc(52581);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test);
        __CLR4_4_1147m147mlgchoset.R.inc(52582);assertEquals(new Period(7, 2, 3, 4, 5, 6, 7, 8), result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded2() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_150gruj14kn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52583,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_150gruj14kn(){try{__CLR4_4_1147m147mlgchoset.R.inc(52583);
        __CLR4_4_1147m147mlgchoset.R.inc(52584);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1147m147mlgchoset.R.inc(52585);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52586);test.withFieldAdded(null, 0);
            __CLR4_4_1147m147mlgchoset.R.inc(52587);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded3() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189gqn014ks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189gqn014ks(){try{__CLR4_4_1147m147mlgchoset.R.inc(52588);
        __CLR4_4_1147m147mlgchoset.R.inc(52589);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time());
        __CLR4_4_1147m147mlgchoset.R.inc(52590);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52591);test.withFieldAdded(DurationFieldType.years(), 6);
            __CLR4_4_1147m147mlgchoset.R.inc(52592);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded4() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bigpfh14kx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52593,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bigpfh14kx(){try{__CLR4_4_1147m147mlgchoset.R.inc(52593);
        __CLR4_4_1147m147mlgchoset.R.inc(52594);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time());
        __CLR4_4_1147m147mlgchoset.R.inc(52595);Period result = test.withFieldAdded(DurationFieldType.years(), 0);
        __CLR4_4_1147m147mlgchoset.R.inc(52596);assertEquals(test, result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPeriodStatics() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19wixcp14l1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testPeriodStatics",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52597,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19wixcp14l1(){try{__CLR4_4_1147m147mlgchoset.R.inc(52597);
        __CLR4_4_1147m147mlgchoset.R.inc(52598);Period test;
        __CLR4_4_1147m147mlgchoset.R.inc(52599);test = Period.years(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52600);assertEquals(test, new Period(1, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard()));
        __CLR4_4_1147m147mlgchoset.R.inc(52601);test = Period.months(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52602);assertEquals(test, new Period(0, 1, 0, 0, 0, 0, 0, 0, PeriodType.standard()));
        __CLR4_4_1147m147mlgchoset.R.inc(52603);test = Period.weeks(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52604);assertEquals(test, new Period(0, 0, 1, 0, 0, 0, 0, 0, PeriodType.standard()));
        __CLR4_4_1147m147mlgchoset.R.inc(52605);test = Period.days(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52606);assertEquals(test, new Period(0, 0, 0, 1, 0, 0, 0, 0, PeriodType.standard()));
        __CLR4_4_1147m147mlgchoset.R.inc(52607);test = Period.hours(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52608);assertEquals(test, new Period(0, 0, 0, 0, 1, 0, 0, 0, PeriodType.standard()));
        __CLR4_4_1147m147mlgchoset.R.inc(52609);test = Period.minutes(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52610);assertEquals(test, new Period(0, 0, 0, 0, 0, 1, 0, 0, PeriodType.standard()));
        __CLR4_4_1147m147mlgchoset.R.inc(52611);test = Period.seconds(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52612);assertEquals(test, new Period(0, 0, 0, 0, 0, 0, 1, 0, PeriodType.standard()));
        __CLR4_4_1147m147mlgchoset.R.inc(52613);test = Period.millis(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52614);assertEquals(test, new Period(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.standard()));
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWith() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uq6yn14lj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWith",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uq6yn14lj(){try{__CLR4_4_1147m147mlgchoset.R.inc(52615);
        __CLR4_4_1147m147mlgchoset.R.inc(52616);Period test;
        __CLR4_4_1147m147mlgchoset.R.inc(52617);test = Period.years(5).withYears(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52618);assertEquals(test, new Period(1, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard()));
        __CLR4_4_1147m147mlgchoset.R.inc(52619);test = Period.months(5).withMonths(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52620);assertEquals(test, new Period(0, 1, 0, 0, 0, 0, 0, 0, PeriodType.standard()));
        __CLR4_4_1147m147mlgchoset.R.inc(52621);test = Period.weeks(5).withWeeks(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52622);assertEquals(test, new Period(0, 0, 1, 0, 0, 0, 0, 0, PeriodType.standard()));
        __CLR4_4_1147m147mlgchoset.R.inc(52623);test = Period.days(5).withDays(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52624);assertEquals(test, new Period(0, 0, 0, 1, 0, 0, 0, 0, PeriodType.standard()));
        __CLR4_4_1147m147mlgchoset.R.inc(52625);test = Period.hours(5).withHours(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52626);assertEquals(test, new Period(0, 0, 0, 0, 1, 0, 0, 0, PeriodType.standard()));
        __CLR4_4_1147m147mlgchoset.R.inc(52627);test = Period.minutes(5).withMinutes(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52628);assertEquals(test, new Period(0, 0, 0, 0, 0, 1, 0, 0, PeriodType.standard()));
        __CLR4_4_1147m147mlgchoset.R.inc(52629);test = Period.seconds(5).withSeconds(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52630);assertEquals(test, new Period(0, 0, 0, 0, 0, 0, 1, 0, PeriodType.standard()));
        __CLR4_4_1147m147mlgchoset.R.inc(52631);test = Period.millis(5).withMillis(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52632);assertEquals(test, new Period(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.standard()));

        __CLR4_4_1147m147mlgchoset.R.inc(52633);test = new Period(0L, PeriodType.millis());
        __CLR4_4_1147m147mlgchoset.R.inc(52634);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52635);test.withYears(1);
            __CLR4_4_1147m147mlgchoset.R.inc(52636);fail();
        } catch (UnsupportedOperationException ex) {
        }
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPlus() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1py855f14m5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testPlus",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52637,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1py855f14m5(){try{__CLR4_4_1147m147mlgchoset.R.inc(52637);
        __CLR4_4_1147m147mlgchoset.R.inc(52638);Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1147m147mlgchoset.R.inc(52639);Period baseDaysOnly = new Period(0, 0, 0, 10, 0, 0, 0, 0, PeriodType.days());

        __CLR4_4_1147m147mlgchoset.R.inc(52640);Period test = base.plus((ReadablePeriod) null);
        __CLR4_4_1147m147mlgchoset.R.inc(52641);assertSame(base, test);

        __CLR4_4_1147m147mlgchoset.R.inc(52642);test = base.plus(Period.years(10));
        __CLR4_4_1147m147mlgchoset.R.inc(52643);assertEquals(11, test.getYears());
        __CLR4_4_1147m147mlgchoset.R.inc(52644);assertEquals(2, test.getMonths());
        __CLR4_4_1147m147mlgchoset.R.inc(52645);assertEquals(3, test.getWeeks());
        __CLR4_4_1147m147mlgchoset.R.inc(52646);assertEquals(4, test.getDays());
        __CLR4_4_1147m147mlgchoset.R.inc(52647);assertEquals(5, test.getHours());
        __CLR4_4_1147m147mlgchoset.R.inc(52648);assertEquals(6, test.getMinutes());
        __CLR4_4_1147m147mlgchoset.R.inc(52649);assertEquals(7, test.getSeconds());
        __CLR4_4_1147m147mlgchoset.R.inc(52650);assertEquals(8, test.getMillis());

        __CLR4_4_1147m147mlgchoset.R.inc(52651);test = base.plus(Years.years(10));
        __CLR4_4_1147m147mlgchoset.R.inc(52652);assertEquals(11, test.getYears());
        __CLR4_4_1147m147mlgchoset.R.inc(52653);assertEquals(2, test.getMonths());
        __CLR4_4_1147m147mlgchoset.R.inc(52654);assertEquals(3, test.getWeeks());
        __CLR4_4_1147m147mlgchoset.R.inc(52655);assertEquals(4, test.getDays());
        __CLR4_4_1147m147mlgchoset.R.inc(52656);assertEquals(5, test.getHours());
        __CLR4_4_1147m147mlgchoset.R.inc(52657);assertEquals(6, test.getMinutes());
        __CLR4_4_1147m147mlgchoset.R.inc(52658);assertEquals(7, test.getSeconds());
        __CLR4_4_1147m147mlgchoset.R.inc(52659);assertEquals(8, test.getMillis());

        __CLR4_4_1147m147mlgchoset.R.inc(52660);test = base.plus(Period.days(10));
        __CLR4_4_1147m147mlgchoset.R.inc(52661);assertEquals(1, test.getYears());
        __CLR4_4_1147m147mlgchoset.R.inc(52662);assertEquals(2, test.getMonths());
        __CLR4_4_1147m147mlgchoset.R.inc(52663);assertEquals(3, test.getWeeks());
        __CLR4_4_1147m147mlgchoset.R.inc(52664);assertEquals(14, test.getDays());
        __CLR4_4_1147m147mlgchoset.R.inc(52665);assertEquals(5, test.getHours());
        __CLR4_4_1147m147mlgchoset.R.inc(52666);assertEquals(6, test.getMinutes());
        __CLR4_4_1147m147mlgchoset.R.inc(52667);assertEquals(7, test.getSeconds());
        __CLR4_4_1147m147mlgchoset.R.inc(52668);assertEquals(8, test.getMillis());

        __CLR4_4_1147m147mlgchoset.R.inc(52669);test = baseDaysOnly.plus(Period.years(0));
        __CLR4_4_1147m147mlgchoset.R.inc(52670);assertEquals(0, test.getYears());
        __CLR4_4_1147m147mlgchoset.R.inc(52671);assertEquals(0, test.getMonths());
        __CLR4_4_1147m147mlgchoset.R.inc(52672);assertEquals(0, test.getWeeks());
        __CLR4_4_1147m147mlgchoset.R.inc(52673);assertEquals(10, test.getDays());
        __CLR4_4_1147m147mlgchoset.R.inc(52674);assertEquals(0, test.getHours());
        __CLR4_4_1147m147mlgchoset.R.inc(52675);assertEquals(0, test.getMinutes());
        __CLR4_4_1147m147mlgchoset.R.inc(52676);assertEquals(0, test.getSeconds());
        __CLR4_4_1147m147mlgchoset.R.inc(52677);assertEquals(0, test.getMillis());

        __CLR4_4_1147m147mlgchoset.R.inc(52678);test = baseDaysOnly.plus(baseDaysOnly);
        __CLR4_4_1147m147mlgchoset.R.inc(52679);assertEquals(0, test.getYears());
        __CLR4_4_1147m147mlgchoset.R.inc(52680);assertEquals(0, test.getMonths());
        __CLR4_4_1147m147mlgchoset.R.inc(52681);assertEquals(0, test.getWeeks());
        __CLR4_4_1147m147mlgchoset.R.inc(52682);assertEquals(20, test.getDays());
        __CLR4_4_1147m147mlgchoset.R.inc(52683);assertEquals(0, test.getHours());
        __CLR4_4_1147m147mlgchoset.R.inc(52684);assertEquals(0, test.getMinutes());
        __CLR4_4_1147m147mlgchoset.R.inc(52685);assertEquals(0, test.getSeconds());
        __CLR4_4_1147m147mlgchoset.R.inc(52686);assertEquals(0, test.getMillis());

        __CLR4_4_1147m147mlgchoset.R.inc(52687);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52688);baseDaysOnly.plus(Period.years(1));
            __CLR4_4_1147m147mlgchoset.R.inc(52689);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(52690);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52691);Period.days(Integer.MAX_VALUE).plus(Period.days(1));
            __CLR4_4_1147m147mlgchoset.R.inc(52692);fail();
        } catch (ArithmeticException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(52693);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52694);Period.days(Integer.MIN_VALUE).plus(Period.days(-1));
            __CLR4_4_1147m147mlgchoset.R.inc(52695);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMinus() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rscqyt14ns();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testMinus",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rscqyt14ns(){try{__CLR4_4_1147m147mlgchoset.R.inc(52696);
        __CLR4_4_1147m147mlgchoset.R.inc(52697);Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1147m147mlgchoset.R.inc(52698);Period baseDaysOnly = new Period(0, 0, 0, 10, 0, 0, 0, 0, PeriodType.days());

        __CLR4_4_1147m147mlgchoset.R.inc(52699);Period test = base.minus((ReadablePeriod) null);
        __CLR4_4_1147m147mlgchoset.R.inc(52700);assertSame(base, test);

        __CLR4_4_1147m147mlgchoset.R.inc(52701);test = base.minus(Period.years(10));
        __CLR4_4_1147m147mlgchoset.R.inc(52702);assertEquals(-9, test.getYears());
        __CLR4_4_1147m147mlgchoset.R.inc(52703);assertEquals(2, test.getMonths());
        __CLR4_4_1147m147mlgchoset.R.inc(52704);assertEquals(3, test.getWeeks());
        __CLR4_4_1147m147mlgchoset.R.inc(52705);assertEquals(4, test.getDays());
        __CLR4_4_1147m147mlgchoset.R.inc(52706);assertEquals(5, test.getHours());
        __CLR4_4_1147m147mlgchoset.R.inc(52707);assertEquals(6, test.getMinutes());
        __CLR4_4_1147m147mlgchoset.R.inc(52708);assertEquals(7, test.getSeconds());
        __CLR4_4_1147m147mlgchoset.R.inc(52709);assertEquals(8, test.getMillis());

        __CLR4_4_1147m147mlgchoset.R.inc(52710);test = base.minus(Years.years(10));
        __CLR4_4_1147m147mlgchoset.R.inc(52711);assertEquals(-9, test.getYears());
        __CLR4_4_1147m147mlgchoset.R.inc(52712);assertEquals(2, test.getMonths());
        __CLR4_4_1147m147mlgchoset.R.inc(52713);assertEquals(3, test.getWeeks());
        __CLR4_4_1147m147mlgchoset.R.inc(52714);assertEquals(4, test.getDays());
        __CLR4_4_1147m147mlgchoset.R.inc(52715);assertEquals(5, test.getHours());
        __CLR4_4_1147m147mlgchoset.R.inc(52716);assertEquals(6, test.getMinutes());
        __CLR4_4_1147m147mlgchoset.R.inc(52717);assertEquals(7, test.getSeconds());
        __CLR4_4_1147m147mlgchoset.R.inc(52718);assertEquals(8, test.getMillis());

        __CLR4_4_1147m147mlgchoset.R.inc(52719);test = base.minus(Period.days(10));
        __CLR4_4_1147m147mlgchoset.R.inc(52720);assertEquals(1, test.getYears());
        __CLR4_4_1147m147mlgchoset.R.inc(52721);assertEquals(2, test.getMonths());
        __CLR4_4_1147m147mlgchoset.R.inc(52722);assertEquals(3, test.getWeeks());
        __CLR4_4_1147m147mlgchoset.R.inc(52723);assertEquals(-6, test.getDays());
        __CLR4_4_1147m147mlgchoset.R.inc(52724);assertEquals(5, test.getHours());
        __CLR4_4_1147m147mlgchoset.R.inc(52725);assertEquals(6, test.getMinutes());
        __CLR4_4_1147m147mlgchoset.R.inc(52726);assertEquals(7, test.getSeconds());
        __CLR4_4_1147m147mlgchoset.R.inc(52727);assertEquals(8, test.getMillis());

        __CLR4_4_1147m147mlgchoset.R.inc(52728);test = baseDaysOnly.minus(Period.years(0));
        __CLR4_4_1147m147mlgchoset.R.inc(52729);assertEquals(0, test.getYears());
        __CLR4_4_1147m147mlgchoset.R.inc(52730);assertEquals(0, test.getMonths());
        __CLR4_4_1147m147mlgchoset.R.inc(52731);assertEquals(0, test.getWeeks());
        __CLR4_4_1147m147mlgchoset.R.inc(52732);assertEquals(10, test.getDays());
        __CLR4_4_1147m147mlgchoset.R.inc(52733);assertEquals(0, test.getHours());
        __CLR4_4_1147m147mlgchoset.R.inc(52734);assertEquals(0, test.getMinutes());
        __CLR4_4_1147m147mlgchoset.R.inc(52735);assertEquals(0, test.getSeconds());
        __CLR4_4_1147m147mlgchoset.R.inc(52736);assertEquals(0, test.getMillis());

        __CLR4_4_1147m147mlgchoset.R.inc(52737);test = baseDaysOnly.minus(baseDaysOnly);
        __CLR4_4_1147m147mlgchoset.R.inc(52738);assertEquals(0, test.getYears());
        __CLR4_4_1147m147mlgchoset.R.inc(52739);assertEquals(0, test.getMonths());
        __CLR4_4_1147m147mlgchoset.R.inc(52740);assertEquals(0, test.getWeeks());
        __CLR4_4_1147m147mlgchoset.R.inc(52741);assertEquals(0, test.getDays());
        __CLR4_4_1147m147mlgchoset.R.inc(52742);assertEquals(0, test.getHours());
        __CLR4_4_1147m147mlgchoset.R.inc(52743);assertEquals(0, test.getMinutes());
        __CLR4_4_1147m147mlgchoset.R.inc(52744);assertEquals(0, test.getSeconds());
        __CLR4_4_1147m147mlgchoset.R.inc(52745);assertEquals(0, test.getMillis());

        __CLR4_4_1147m147mlgchoset.R.inc(52746);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52747);baseDaysOnly.minus(Period.years(1));
            __CLR4_4_1147m147mlgchoset.R.inc(52748);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(52749);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52750);Period.days(Integer.MAX_VALUE).minus(Period.days(-1));
            __CLR4_4_1147m147mlgchoset.R.inc(52751);fail();
        } catch (ArithmeticException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(52752);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52753);Period.days(Integer.MIN_VALUE).minus(Period.days(1));
            __CLR4_4_1147m147mlgchoset.R.inc(52754);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPlusFields() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_121hlfw14pf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testPlusFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_121hlfw14pf(){try{__CLR4_4_1147m147mlgchoset.R.inc(52755);
        __CLR4_4_1147m147mlgchoset.R.inc(52756);Period test;
        __CLR4_4_1147m147mlgchoset.R.inc(52757);test = Period.years(1).plusYears(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52758);assertEquals(new Period(2, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1147m147mlgchoset.R.inc(52759);test = Period.months(1).plusMonths(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52760);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1147m147mlgchoset.R.inc(52761);test = Period.weeks(1).plusWeeks(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52762);assertEquals(new Period(0, 0, 2, 0, 0, 0, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1147m147mlgchoset.R.inc(52763);test = Period.days(1).plusDays(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52764);assertEquals(new Period(0, 0, 0, 2, 0, 0, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1147m147mlgchoset.R.inc(52765);test = Period.hours(1).plusHours(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52766);assertEquals(new Period(0, 0, 0, 0, 2, 0, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1147m147mlgchoset.R.inc(52767);test = Period.minutes(1).plusMinutes(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52768);assertEquals(new Period(0, 0, 0, 0, 0, 2, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1147m147mlgchoset.R.inc(52769);test = Period.seconds(1).plusSeconds(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52770);assertEquals(new Period(0, 0, 0, 0, 0, 0, 2, 0, PeriodType.standard()), test);
        __CLR4_4_1147m147mlgchoset.R.inc(52771);test = Period.millis(1).plusMillis(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52772);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 2, PeriodType.standard()), test);

        __CLR4_4_1147m147mlgchoset.R.inc(52773);test = new Period(0L, PeriodType.millis());
        __CLR4_4_1147m147mlgchoset.R.inc(52774);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52775);test.plusYears(1);
            __CLR4_4_1147m147mlgchoset.R.inc(52776);fail();
        } catch (UnsupportedOperationException ex) {
        }
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testPlusFieldsZero() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p9eju414q1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testPlusFieldsZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52777,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p9eju414q1(){try{__CLR4_4_1147m147mlgchoset.R.inc(52777);
        __CLR4_4_1147m147mlgchoset.R.inc(52778);Period test, result;
        __CLR4_4_1147m147mlgchoset.R.inc(52779);test = Period.years(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52780);result = test.plusYears(0);
        __CLR4_4_1147m147mlgchoset.R.inc(52781);assertSame(test, result);
        __CLR4_4_1147m147mlgchoset.R.inc(52782);test = Period.months(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52783);result = test.plusMonths(0);
        __CLR4_4_1147m147mlgchoset.R.inc(52784);assertSame(test, result);
        __CLR4_4_1147m147mlgchoset.R.inc(52785);test = Period.weeks(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52786);result = test.plusWeeks(0);
        __CLR4_4_1147m147mlgchoset.R.inc(52787);assertSame(test, result);
        __CLR4_4_1147m147mlgchoset.R.inc(52788);test = Period.days(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52789);result = test.plusDays(0);
        __CLR4_4_1147m147mlgchoset.R.inc(52790);assertSame(test, result);
        __CLR4_4_1147m147mlgchoset.R.inc(52791);test = Period.hours(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52792);result = test.plusHours(0);
        __CLR4_4_1147m147mlgchoset.R.inc(52793);assertSame(test, result);
        __CLR4_4_1147m147mlgchoset.R.inc(52794);test = Period.minutes(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52795);result = test.plusMinutes(0);
        __CLR4_4_1147m147mlgchoset.R.inc(52796);assertSame(test, result);
        __CLR4_4_1147m147mlgchoset.R.inc(52797);test = Period.seconds(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52798);result = test.plusSeconds(0);
        __CLR4_4_1147m147mlgchoset.R.inc(52799);assertSame(test, result);
        __CLR4_4_1147m147mlgchoset.R.inc(52800);test = Period.millis(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52801);result = test.plusMillis(0);
        __CLR4_4_1147m147mlgchoset.R.inc(52802);assertSame(test, result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testMinusFields() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vrxqke14qr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testMinusFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vrxqke14qr(){try{__CLR4_4_1147m147mlgchoset.R.inc(52803);
        __CLR4_4_1147m147mlgchoset.R.inc(52804);Period test;
        __CLR4_4_1147m147mlgchoset.R.inc(52805);test = Period.years(3).minusYears(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52806);assertEquals(new Period(2, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1147m147mlgchoset.R.inc(52807);test = Period.months(3).minusMonths(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52808);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1147m147mlgchoset.R.inc(52809);test = Period.weeks(3).minusWeeks(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52810);assertEquals(new Period(0, 0, 2, 0, 0, 0, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1147m147mlgchoset.R.inc(52811);test = Period.days(3).minusDays(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52812);assertEquals(new Period(0, 0, 0, 2, 0, 0, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1147m147mlgchoset.R.inc(52813);test = Period.hours(3).minusHours(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52814);assertEquals(new Period(0, 0, 0, 0, 2, 0, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1147m147mlgchoset.R.inc(52815);test = Period.minutes(3).minusMinutes(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52816);assertEquals(new Period(0, 0, 0, 0, 0, 2, 0, 0, PeriodType.standard()), test);
        __CLR4_4_1147m147mlgchoset.R.inc(52817);test = Period.seconds(3).minusSeconds(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52818);assertEquals(new Period(0, 0, 0, 0, 0, 0, 2, 0, PeriodType.standard()), test);
        __CLR4_4_1147m147mlgchoset.R.inc(52819);test = Period.millis(3).minusMillis(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52820);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 2, PeriodType.standard()), test);

        __CLR4_4_1147m147mlgchoset.R.inc(52821);test = new Period(0L, PeriodType.millis());
        __CLR4_4_1147m147mlgchoset.R.inc(52822);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52823);test.minusYears(1);
            __CLR4_4_1147m147mlgchoset.R.inc(52824);fail();
        } catch (UnsupportedOperationException ex) {
        }
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMultipliedBy() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxhdzx14rd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testMultipliedBy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxhdzx14rd(){try{__CLR4_4_1147m147mlgchoset.R.inc(52825);
        __CLR4_4_1147m147mlgchoset.R.inc(52826);Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8);

        __CLR4_4_1147m147mlgchoset.R.inc(52827);Period test = base.multipliedBy(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52828);assertSame(base, test);

        __CLR4_4_1147m147mlgchoset.R.inc(52829);test = base.multipliedBy(0);
        __CLR4_4_1147m147mlgchoset.R.inc(52830);assertEquals(Period.ZERO, test);

        __CLR4_4_1147m147mlgchoset.R.inc(52831);test = base.multipliedBy(2);
        __CLR4_4_1147m147mlgchoset.R.inc(52832);assertEquals(2, test.getYears());
        __CLR4_4_1147m147mlgchoset.R.inc(52833);assertEquals(4, test.getMonths());
        __CLR4_4_1147m147mlgchoset.R.inc(52834);assertEquals(6, test.getWeeks());
        __CLR4_4_1147m147mlgchoset.R.inc(52835);assertEquals(8, test.getDays());
        __CLR4_4_1147m147mlgchoset.R.inc(52836);assertEquals(10, test.getHours());
        __CLR4_4_1147m147mlgchoset.R.inc(52837);assertEquals(12, test.getMinutes());
        __CLR4_4_1147m147mlgchoset.R.inc(52838);assertEquals(14, test.getSeconds());
        __CLR4_4_1147m147mlgchoset.R.inc(52839);assertEquals(16, test.getMillis());

        __CLR4_4_1147m147mlgchoset.R.inc(52840);test = base.multipliedBy(3);
        __CLR4_4_1147m147mlgchoset.R.inc(52841);assertEquals(3, test.getYears());
        __CLR4_4_1147m147mlgchoset.R.inc(52842);assertEquals(6, test.getMonths());
        __CLR4_4_1147m147mlgchoset.R.inc(52843);assertEquals(9, test.getWeeks());
        __CLR4_4_1147m147mlgchoset.R.inc(52844);assertEquals(12, test.getDays());
        __CLR4_4_1147m147mlgchoset.R.inc(52845);assertEquals(15, test.getHours());
        __CLR4_4_1147m147mlgchoset.R.inc(52846);assertEquals(18, test.getMinutes());
        __CLR4_4_1147m147mlgchoset.R.inc(52847);assertEquals(21, test.getSeconds());
        __CLR4_4_1147m147mlgchoset.R.inc(52848);assertEquals(24, test.getMillis());

        __CLR4_4_1147m147mlgchoset.R.inc(52849);test = base.multipliedBy(-4);
        __CLR4_4_1147m147mlgchoset.R.inc(52850);assertEquals(-4, test.getYears());
        __CLR4_4_1147m147mlgchoset.R.inc(52851);assertEquals(-8, test.getMonths());
        __CLR4_4_1147m147mlgchoset.R.inc(52852);assertEquals(-12, test.getWeeks());
        __CLR4_4_1147m147mlgchoset.R.inc(52853);assertEquals(-16, test.getDays());
        __CLR4_4_1147m147mlgchoset.R.inc(52854);assertEquals(-20, test.getHours());
        __CLR4_4_1147m147mlgchoset.R.inc(52855);assertEquals(-24, test.getMinutes());
        __CLR4_4_1147m147mlgchoset.R.inc(52856);assertEquals(-28, test.getSeconds());
        __CLR4_4_1147m147mlgchoset.R.inc(52857);assertEquals(-32, test.getMillis());

        __CLR4_4_1147m147mlgchoset.R.inc(52858);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52859);Period.days(Integer.MAX_VALUE).multipliedBy(2);
            __CLR4_4_1147m147mlgchoset.R.inc(52860);fail();
        } catch (ArithmeticException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(52861);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52862);Period.days(Integer.MIN_VALUE).multipliedBy(2);
            __CLR4_4_1147m147mlgchoset.R.inc(52863);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNegated() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av330714sg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNegated",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av330714sg(){try{__CLR4_4_1147m147mlgchoset.R.inc(52864);
        __CLR4_4_1147m147mlgchoset.R.inc(52865);Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8);

        __CLR4_4_1147m147mlgchoset.R.inc(52866);Period test = Period.ZERO.negated();
        __CLR4_4_1147m147mlgchoset.R.inc(52867);assertEquals(Period.ZERO, test);

        __CLR4_4_1147m147mlgchoset.R.inc(52868);test = base.negated();
        __CLR4_4_1147m147mlgchoset.R.inc(52869);assertEquals(-1, test.getYears());
        __CLR4_4_1147m147mlgchoset.R.inc(52870);assertEquals(-2, test.getMonths());
        __CLR4_4_1147m147mlgchoset.R.inc(52871);assertEquals(-3, test.getWeeks());
        __CLR4_4_1147m147mlgchoset.R.inc(52872);assertEquals(-4, test.getDays());
        __CLR4_4_1147m147mlgchoset.R.inc(52873);assertEquals(-5, test.getHours());
        __CLR4_4_1147m147mlgchoset.R.inc(52874);assertEquals(-6, test.getMinutes());
        __CLR4_4_1147m147mlgchoset.R.inc(52875);assertEquals(-7, test.getSeconds());
        __CLR4_4_1147m147mlgchoset.R.inc(52876);assertEquals(-8, test.getMillis());

        __CLR4_4_1147m147mlgchoset.R.inc(52877);test = Period.days(Integer.MAX_VALUE).negated();
        __CLR4_4_1147m147mlgchoset.R.inc(52878);assertEquals(-Integer.MAX_VALUE, test.getDays());

        __CLR4_4_1147m147mlgchoset.R.inc(52879);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52880);Period.days(Integer.MIN_VALUE).negated();
            __CLR4_4_1147m147mlgchoset.R.inc(52881);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToStandardWeeks() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pfkyx014sy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pfkyx014sy(){try{__CLR4_4_1147m147mlgchoset.R.inc(52882);
        __CLR4_4_1147m147mlgchoset.R.inc(52883);Period test = new Period(0, 0, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1147m147mlgchoset.R.inc(52884);assertEquals(3, test.toStandardWeeks().getWeeks());

        __CLR4_4_1147m147mlgchoset.R.inc(52885);test = new Period(0, 0, 3, 7, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(52886);assertEquals(4, test.toStandardWeeks().getWeeks());

        __CLR4_4_1147m147mlgchoset.R.inc(52887);test = new Period(0, 0, 0, 6, 23, 59, 59, 1000);
        __CLR4_4_1147m147mlgchoset.R.inc(52888);assertEquals(1, test.toStandardWeeks().getWeeks());

        __CLR4_4_1147m147mlgchoset.R.inc(52889);test = new Period(0, 0, Integer.MAX_VALUE, 0, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(52890);assertEquals(Integer.MAX_VALUE, test.toStandardWeeks().getWeeks());

        __CLR4_4_1147m147mlgchoset.R.inc(52891);test = new Period(0, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        __CLR4_4_1147m147mlgchoset.R.inc(52892);long intMax = Integer.MAX_VALUE;
        __CLR4_4_1147m147mlgchoset.R.inc(52893);BigInteger expected = BigInteger.valueOf(intMax);
        __CLR4_4_1147m147mlgchoset.R.inc(52894);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_SECOND));
        __CLR4_4_1147m147mlgchoset.R.inc(52895);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_MINUTE));
        __CLR4_4_1147m147mlgchoset.R.inc(52896);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_HOUR));
        __CLR4_4_1147m147mlgchoset.R.inc(52897);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_1147m147mlgchoset.R.inc(52898);expected = expected.divide(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_WEEK));
        __CLR4_4_1147m147mlgchoset.R.inc(52899);assertTrue(expected.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0);
        __CLR4_4_1147m147mlgchoset.R.inc(52900);assertEquals(expected.longValue(), test.toStandardWeeks().getWeeks());

        __CLR4_4_1147m147mlgchoset.R.inc(52901);test = new Period(0, 0, Integer.MAX_VALUE, 7, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(52902);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52903);test.toStandardWeeks();
            __CLR4_4_1147m147mlgchoset.R.inc(52904);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testToStandardWeeks_years() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yq1a4t14tl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardWeeks_years",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yq1a4t14tl(){try{__CLR4_4_1147m147mlgchoset.R.inc(52905);
        __CLR4_4_1147m147mlgchoset.R.inc(52906);Period test = Period.years(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52907);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52908);test.toStandardWeeks();
            __CLR4_4_1147m147mlgchoset.R.inc(52909);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(52910);test = Period.years(-1);
        __CLR4_4_1147m147mlgchoset.R.inc(52911);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52912);test.toStandardWeeks();
            __CLR4_4_1147m147mlgchoset.R.inc(52913);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(52914);test = Period.years(0);
        __CLR4_4_1147m147mlgchoset.R.inc(52915);assertEquals(0, test.toStandardWeeks().getWeeks());
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testToStandardWeeks_months() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12mti1014tw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardWeeks_months",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52916,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12mti1014tw(){try{__CLR4_4_1147m147mlgchoset.R.inc(52916);
        __CLR4_4_1147m147mlgchoset.R.inc(52917);Period test = Period.months(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52918);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52919);test.toStandardWeeks();
            __CLR4_4_1147m147mlgchoset.R.inc(52920);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(52921);test = Period.months(-1);
        __CLR4_4_1147m147mlgchoset.R.inc(52922);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52923);test.toStandardWeeks();
            __CLR4_4_1147m147mlgchoset.R.inc(52924);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(52925);test = Period.months(0);
        __CLR4_4_1147m147mlgchoset.R.inc(52926);assertEquals(0, test.toStandardWeeks().getWeeks());
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToStandardDays() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eftdm014u7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eftdm014u7(){try{__CLR4_4_1147m147mlgchoset.R.inc(52927);
        __CLR4_4_1147m147mlgchoset.R.inc(52928);Period test = new Period(0, 0, 0, 4, 5, 6, 7, 8);
        __CLR4_4_1147m147mlgchoset.R.inc(52929);assertEquals(4, test.toStandardDays().getDays());

        __CLR4_4_1147m147mlgchoset.R.inc(52930);test = new Period(0, 0, 1, 4, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(52931);assertEquals(11, test.toStandardDays().getDays());

        __CLR4_4_1147m147mlgchoset.R.inc(52932);test = new Period(0, 0, 0, 0, 23, 59, 59, 1000);
        __CLR4_4_1147m147mlgchoset.R.inc(52933);assertEquals(1, test.toStandardDays().getDays());

        __CLR4_4_1147m147mlgchoset.R.inc(52934);test = new Period(0, 0, 0, Integer.MAX_VALUE, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(52935);assertEquals(Integer.MAX_VALUE, test.toStandardDays().getDays());

        __CLR4_4_1147m147mlgchoset.R.inc(52936);test = new Period(0, 0, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        __CLR4_4_1147m147mlgchoset.R.inc(52937);long intMax = Integer.MAX_VALUE;
        __CLR4_4_1147m147mlgchoset.R.inc(52938);BigInteger expected = BigInteger.valueOf(intMax);
        __CLR4_4_1147m147mlgchoset.R.inc(52939);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_SECOND));
        __CLR4_4_1147m147mlgchoset.R.inc(52940);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_MINUTE));
        __CLR4_4_1147m147mlgchoset.R.inc(52941);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_HOUR));
        __CLR4_4_1147m147mlgchoset.R.inc(52942);expected = expected.divide(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_1147m147mlgchoset.R.inc(52943);assertTrue(expected.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0);
        __CLR4_4_1147m147mlgchoset.R.inc(52944);assertEquals(expected.longValue(), test.toStandardDays().getDays());

        __CLR4_4_1147m147mlgchoset.R.inc(52945);test = new Period(0, 0, 0, Integer.MAX_VALUE, 24, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(52946);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52947);test.toStandardDays();
            __CLR4_4_1147m147mlgchoset.R.inc(52948);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testToStandardDays_years() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ealftr14ut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDays_years",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ealftr14ut(){try{__CLR4_4_1147m147mlgchoset.R.inc(52949);
        __CLR4_4_1147m147mlgchoset.R.inc(52950);Period test = Period.years(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52951);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52952);test.toStandardDays();
            __CLR4_4_1147m147mlgchoset.R.inc(52953);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(52954);test = Period.years(-1);
        __CLR4_4_1147m147mlgchoset.R.inc(52955);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52956);test.toStandardDays();
            __CLR4_4_1147m147mlgchoset.R.inc(52957);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(52958);test = Period.years(0);
        __CLR4_4_1147m147mlgchoset.R.inc(52959);assertEquals(0, test.toStandardDays().getDays());
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testToStandardDays_months() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uj0paw14v4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDays_months",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uj0paw14v4(){try{__CLR4_4_1147m147mlgchoset.R.inc(52960);
        __CLR4_4_1147m147mlgchoset.R.inc(52961);Period test = Period.months(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52962);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52963);test.toStandardDays();
            __CLR4_4_1147m147mlgchoset.R.inc(52964);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(52965);test = Period.months(-1);
        __CLR4_4_1147m147mlgchoset.R.inc(52966);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52967);test.toStandardDays();
            __CLR4_4_1147m147mlgchoset.R.inc(52968);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(52969);test = Period.months(0);
        __CLR4_4_1147m147mlgchoset.R.inc(52970);assertEquals(0, test.toStandardDays().getDays());
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToStandardHours() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ikk7g14vf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ikk7g14vf(){try{__CLR4_4_1147m147mlgchoset.R.inc(52971);
        __CLR4_4_1147m147mlgchoset.R.inc(52972);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8);
        __CLR4_4_1147m147mlgchoset.R.inc(52973);assertEquals(5, test.toStandardHours().getHours());

        __CLR4_4_1147m147mlgchoset.R.inc(52974);test = new Period(0, 0, 0, 1, 5, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(52975);assertEquals(29, test.toStandardHours().getHours());

        __CLR4_4_1147m147mlgchoset.R.inc(52976);test = new Period(0, 0, 0, 0, 0, 59, 59, 1000);
        __CLR4_4_1147m147mlgchoset.R.inc(52977);assertEquals(1, test.toStandardHours().getHours());

        __CLR4_4_1147m147mlgchoset.R.inc(52978);test = new Period(0, 0, 0, 0, Integer.MAX_VALUE, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(52979);assertEquals(Integer.MAX_VALUE, test.toStandardHours().getHours());

        __CLR4_4_1147m147mlgchoset.R.inc(52980);test = new Period(0, 0, 0, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        __CLR4_4_1147m147mlgchoset.R.inc(52981);long intMax = Integer.MAX_VALUE;
        __CLR4_4_1147m147mlgchoset.R.inc(52982);BigInteger expected = BigInteger.valueOf(intMax);
        __CLR4_4_1147m147mlgchoset.R.inc(52983);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_SECOND));
        __CLR4_4_1147m147mlgchoset.R.inc(52984);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_MINUTE));
        __CLR4_4_1147m147mlgchoset.R.inc(52985);expected = expected.divide(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_HOUR));
        __CLR4_4_1147m147mlgchoset.R.inc(52986);assertTrue(expected.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0);
        __CLR4_4_1147m147mlgchoset.R.inc(52987);assertEquals(expected.longValue(), test.toStandardHours().getHours());

        __CLR4_4_1147m147mlgchoset.R.inc(52988);test = new Period(0, 0, 0, 0, Integer.MAX_VALUE, 60, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(52989);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52990);test.toStandardHours();
            __CLR4_4_1147m147mlgchoset.R.inc(52991);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testToStandardHours_years() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),52992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vdix6l14w0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardHours_years",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vdix6l14w0(){try{__CLR4_4_1147m147mlgchoset.R.inc(52992);
        __CLR4_4_1147m147mlgchoset.R.inc(52993);Period test = Period.years(1);
        __CLR4_4_1147m147mlgchoset.R.inc(52994);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52995);test.toStandardHours();
            __CLR4_4_1147m147mlgchoset.R.inc(52996);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(52997);test = Period.years(-1);
        __CLR4_4_1147m147mlgchoset.R.inc(52998);try {
            __CLR4_4_1147m147mlgchoset.R.inc(52999);test.toStandardHours();
            __CLR4_4_1147m147mlgchoset.R.inc(53000);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(53001);test = Period.years(0);
        __CLR4_4_1147m147mlgchoset.R.inc(53002);assertEquals(0, test.toStandardHours().getHours());
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testToStandardHours_months() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zdilis14wb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardHours_months",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53003,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zdilis14wb(){try{__CLR4_4_1147m147mlgchoset.R.inc(53003);
        __CLR4_4_1147m147mlgchoset.R.inc(53004);Period test = Period.months(1);
        __CLR4_4_1147m147mlgchoset.R.inc(53005);try {
            __CLR4_4_1147m147mlgchoset.R.inc(53006);test.toStandardHours();
            __CLR4_4_1147m147mlgchoset.R.inc(53007);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(53008);test = Period.months(-1);
        __CLR4_4_1147m147mlgchoset.R.inc(53009);try {
            __CLR4_4_1147m147mlgchoset.R.inc(53010);test.toStandardHours();
            __CLR4_4_1147m147mlgchoset.R.inc(53011);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(53012);test = Period.months(0);
        __CLR4_4_1147m147mlgchoset.R.inc(53013);assertEquals(0, test.toStandardHours().getHours());
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToStandardMinutes() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0kt4414wm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53014,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0kt4414wm(){try{__CLR4_4_1147m147mlgchoset.R.inc(53014);
        __CLR4_4_1147m147mlgchoset.R.inc(53015);Period test = new Period(0, 0, 0, 0, 0, 6, 7, 8);
        __CLR4_4_1147m147mlgchoset.R.inc(53016);assertEquals(6, test.toStandardMinutes().getMinutes());

        __CLR4_4_1147m147mlgchoset.R.inc(53017);test = new Period(0, 0, 0, 0, 1, 6, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53018);assertEquals(66, test.toStandardMinutes().getMinutes());

        __CLR4_4_1147m147mlgchoset.R.inc(53019);test = new Period(0, 0, 0, 0, 0, 0, 59, 1000);
        __CLR4_4_1147m147mlgchoset.R.inc(53020);assertEquals(1, test.toStandardMinutes().getMinutes());

        __CLR4_4_1147m147mlgchoset.R.inc(53021);test = new Period(0, 0, 0, 0, 0, Integer.MAX_VALUE, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53022);assertEquals(Integer.MAX_VALUE, test.toStandardMinutes().getMinutes());

        __CLR4_4_1147m147mlgchoset.R.inc(53023);test = new Period(0, 0, 0, 0, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE);
        __CLR4_4_1147m147mlgchoset.R.inc(53024);long intMax = Integer.MAX_VALUE;
        __CLR4_4_1147m147mlgchoset.R.inc(53025);BigInteger expected = BigInteger.valueOf(intMax);
        __CLR4_4_1147m147mlgchoset.R.inc(53026);expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_SECOND));
        __CLR4_4_1147m147mlgchoset.R.inc(53027);expected = expected.divide(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_MINUTE));
        __CLR4_4_1147m147mlgchoset.R.inc(53028);assertTrue(expected.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53029);assertEquals(expected.longValue(), test.toStandardMinutes().getMinutes());

        __CLR4_4_1147m147mlgchoset.R.inc(53030);test = new Period(0, 0, 0, 0, 0, Integer.MAX_VALUE, 60, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53031);try {
            __CLR4_4_1147m147mlgchoset.R.inc(53032);test.toStandardMinutes();
            __CLR4_4_1147m147mlgchoset.R.inc(53033);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testToStandardMinutes_years() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4rglv14x6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardMinutes_years",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4rglv14x6(){try{__CLR4_4_1147m147mlgchoset.R.inc(53034);
        __CLR4_4_1147m147mlgchoset.R.inc(53035);Period test = Period.years(1);
        __CLR4_4_1147m147mlgchoset.R.inc(53036);try {
            __CLR4_4_1147m147mlgchoset.R.inc(53037);test.toStandardMinutes();
            __CLR4_4_1147m147mlgchoset.R.inc(53038);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(53039);test = Period.years(-1);
        __CLR4_4_1147m147mlgchoset.R.inc(53040);try {
            __CLR4_4_1147m147mlgchoset.R.inc(53041);test.toStandardMinutes();
            __CLR4_4_1147m147mlgchoset.R.inc(53042);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(53043);test = Period.years(0);
        __CLR4_4_1147m147mlgchoset.R.inc(53044);assertEquals(0, test.toStandardMinutes().getMinutes());
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testToStandardMinutes_months() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jncwd814xh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardMinutes_months",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jncwd814xh(){try{__CLR4_4_1147m147mlgchoset.R.inc(53045);
        __CLR4_4_1147m147mlgchoset.R.inc(53046);Period test = Period.months(1);
        __CLR4_4_1147m147mlgchoset.R.inc(53047);try {
            __CLR4_4_1147m147mlgchoset.R.inc(53048);test.toStandardMinutes();
            __CLR4_4_1147m147mlgchoset.R.inc(53049);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(53050);test = Period.months(-1);
        __CLR4_4_1147m147mlgchoset.R.inc(53051);try {
            __CLR4_4_1147m147mlgchoset.R.inc(53052);test.toStandardMinutes();
            __CLR4_4_1147m147mlgchoset.R.inc(53053);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(53054);test = Period.months(0);
        __CLR4_4_1147m147mlgchoset.R.inc(53055);assertEquals(0, test.toStandardMinutes().getMinutes());
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToStandardSeconds() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1emeoqs14xs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1emeoqs14xs(){try{__CLR4_4_1147m147mlgchoset.R.inc(53056);
        __CLR4_4_1147m147mlgchoset.R.inc(53057);Period test = new Period(0, 0, 0, 0, 0, 0, 7, 8);
        __CLR4_4_1147m147mlgchoset.R.inc(53058);assertEquals(7, test.toStandardSeconds().getSeconds());

        __CLR4_4_1147m147mlgchoset.R.inc(53059);test = new Period(0, 0, 0, 0, 0, 1, 3, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53060);assertEquals(63, test.toStandardSeconds().getSeconds());

        __CLR4_4_1147m147mlgchoset.R.inc(53061);test = new Period(0, 0, 0, 0, 0, 0, 0, 1000);
        __CLR4_4_1147m147mlgchoset.R.inc(53062);assertEquals(1, test.toStandardSeconds().getSeconds());

        __CLR4_4_1147m147mlgchoset.R.inc(53063);test = new Period(0, 0, 0, 0, 0, 0, Integer.MAX_VALUE, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53064);assertEquals(Integer.MAX_VALUE, test.toStandardSeconds().getSeconds());

        __CLR4_4_1147m147mlgchoset.R.inc(53065);test = new Period(0, 0, 0, 0, 0, 0, 20, Integer.MAX_VALUE);
        __CLR4_4_1147m147mlgchoset.R.inc(53066);long expected = 20;
        __CLR4_4_1147m147mlgchoset.R.inc(53067);expected += ((long) Integer.MAX_VALUE) / DateTimeConstants.MILLIS_PER_SECOND;
        __CLR4_4_1147m147mlgchoset.R.inc(53068);assertEquals(expected, test.toStandardSeconds().getSeconds());

        __CLR4_4_1147m147mlgchoset.R.inc(53069);test = new Period(0, 0, 0, 0, 0, 0, Integer.MAX_VALUE, 1000);
        __CLR4_4_1147m147mlgchoset.R.inc(53070);try {
            __CLR4_4_1147m147mlgchoset.R.inc(53071);test.toStandardSeconds();
            __CLR4_4_1147m147mlgchoset.R.inc(53072);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testToStandardSeconds_years() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15mde2b14y9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardSeconds_years",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53073,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15mde2b14y9(){try{__CLR4_4_1147m147mlgchoset.R.inc(53073);
        __CLR4_4_1147m147mlgchoset.R.inc(53074);Period test = Period.years(1);
        __CLR4_4_1147m147mlgchoset.R.inc(53075);try {
            __CLR4_4_1147m147mlgchoset.R.inc(53076);test.toStandardSeconds();
            __CLR4_4_1147m147mlgchoset.R.inc(53077);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(53078);test = Period.years(-1);
        __CLR4_4_1147m147mlgchoset.R.inc(53079);try {
            __CLR4_4_1147m147mlgchoset.R.inc(53080);test.toStandardSeconds();
            __CLR4_4_1147m147mlgchoset.R.inc(53081);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(53082);test = Period.years(0);
        __CLR4_4_1147m147mlgchoset.R.inc(53083);assertEquals(0, test.toStandardSeconds().getSeconds());
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testToStandardSeconds_months() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p8knek14yk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardSeconds_months",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53084,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p8knek14yk(){try{__CLR4_4_1147m147mlgchoset.R.inc(53084);
        __CLR4_4_1147m147mlgchoset.R.inc(53085);Period test = Period.months(1);
        __CLR4_4_1147m147mlgchoset.R.inc(53086);try {
            __CLR4_4_1147m147mlgchoset.R.inc(53087);test.toStandardSeconds();
            __CLR4_4_1147m147mlgchoset.R.inc(53088);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(53089);test = Period.months(-1);
        __CLR4_4_1147m147mlgchoset.R.inc(53090);try {
            __CLR4_4_1147m147mlgchoset.R.inc(53091);test.toStandardSeconds();
            __CLR4_4_1147m147mlgchoset.R.inc(53092);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(53093);test = Period.months(0);
        __CLR4_4_1147m147mlgchoset.R.inc(53094);assertEquals(0, test.toStandardSeconds().getSeconds());
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToStandardDuration() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izmvnp14yv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53095,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izmvnp14yv(){try{__CLR4_4_1147m147mlgchoset.R.inc(53095);
        __CLR4_4_1147m147mlgchoset.R.inc(53096);Period test = new Period(0, 0, 0, 0, 0, 0, 0, 8);
        __CLR4_4_1147m147mlgchoset.R.inc(53097);assertEquals(8, test.toStandardDuration().getMillis());

        __CLR4_4_1147m147mlgchoset.R.inc(53098);test = new Period(0, 0, 0, 0, 0, 0, 1, 20);
        __CLR4_4_1147m147mlgchoset.R.inc(53099);assertEquals(1020, test.toStandardDuration().getMillis());

        __CLR4_4_1147m147mlgchoset.R.inc(53100);test = new Period(0, 0, 0, 0, 0, 0, 0, Integer.MAX_VALUE);
        __CLR4_4_1147m147mlgchoset.R.inc(53101);assertEquals(Integer.MAX_VALUE, test.toStandardDuration().getMillis());

        __CLR4_4_1147m147mlgchoset.R.inc(53102);test = new Period(0, 0, 0, 0, 0, 10, 20, Integer.MAX_VALUE);
        __CLR4_4_1147m147mlgchoset.R.inc(53103);long expected = Integer.MAX_VALUE;
        __CLR4_4_1147m147mlgchoset.R.inc(53104);expected += 10L * ((long) DateTimeConstants.MILLIS_PER_MINUTE);
        __CLR4_4_1147m147mlgchoset.R.inc(53105);expected += 20L * ((long) DateTimeConstants.MILLIS_PER_SECOND);
        __CLR4_4_1147m147mlgchoset.R.inc(53106);assertEquals(expected, test.toStandardDuration().getMillis());

        // proof that overflow does not occur
        __CLR4_4_1147m147mlgchoset.R.inc(53107);BigInteger intMax = BigInteger.valueOf(Integer.MAX_VALUE);
        __CLR4_4_1147m147mlgchoset.R.inc(53108);BigInteger exp = intMax;
        __CLR4_4_1147m147mlgchoset.R.inc(53109);exp = exp.add(intMax.multiply(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_SECOND)));
        __CLR4_4_1147m147mlgchoset.R.inc(53110);exp = exp.add(intMax.multiply(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_MINUTE)));
        __CLR4_4_1147m147mlgchoset.R.inc(53111);exp = exp.add(intMax.multiply(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_HOUR)));
        __CLR4_4_1147m147mlgchoset.R.inc(53112);exp = exp.add(intMax.multiply(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_DAY)));
        __CLR4_4_1147m147mlgchoset.R.inc(53113);exp = exp.add(intMax.multiply(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_WEEK)));
        __CLR4_4_1147m147mlgchoset.R.inc(53114);assertTrue(exp.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0);
//        test = new Period(0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
//        try {
//            test.toStandardDuration();
//            fail();
//        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testToStandardDuration_years() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_194yw5814zf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDuration_years",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53115,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_194yw5814zf(){try{__CLR4_4_1147m147mlgchoset.R.inc(53115);
        __CLR4_4_1147m147mlgchoset.R.inc(53116);Period test = Period.years(1);
        __CLR4_4_1147m147mlgchoset.R.inc(53117);try {
            __CLR4_4_1147m147mlgchoset.R.inc(53118);test.toStandardDuration();
            __CLR4_4_1147m147mlgchoset.R.inc(53119);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(53120);test = Period.years(-1);
        __CLR4_4_1147m147mlgchoset.R.inc(53121);try {
            __CLR4_4_1147m147mlgchoset.R.inc(53122);test.toStandardDuration();
            __CLR4_4_1147m147mlgchoset.R.inc(53123);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(53124);test = Period.years(0);
        __CLR4_4_1147m147mlgchoset.R.inc(53125);assertEquals(0, test.toStandardDuration().getMillis());
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testToStandardDuration_months() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cqtv4r14zq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDuration_months",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cqtv4r14zq(){try{__CLR4_4_1147m147mlgchoset.R.inc(53126);
        __CLR4_4_1147m147mlgchoset.R.inc(53127);Period test = Period.months(1);
        __CLR4_4_1147m147mlgchoset.R.inc(53128);try {
            __CLR4_4_1147m147mlgchoset.R.inc(53129);test.toStandardDuration();
            __CLR4_4_1147m147mlgchoset.R.inc(53130);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(53131);test = Period.months(-1);
        __CLR4_4_1147m147mlgchoset.R.inc(53132);try {
            __CLR4_4_1147m147mlgchoset.R.inc(53133);test.toStandardDuration();
            __CLR4_4_1147m147mlgchoset.R.inc(53134);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_1147m147mlgchoset.R.inc(53135);test = Period.months(0);
        __CLR4_4_1147m147mlgchoset.R.inc(53136);assertEquals(0, test.toStandardDuration().getMillis());
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNormalizedStandard_yearMonth1() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16rolfy1501();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_yearMonth1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16rolfy1501(){try{__CLR4_4_1147m147mlgchoset.R.inc(53137);
        __CLR4_4_1147m147mlgchoset.R.inc(53138);Period test = new Period(1, 15, 0, 0, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53139);Period result = test.normalizedStandard();
        __CLR4_4_1147m147mlgchoset.R.inc(53140);assertEquals(new Period(1, 15, 0, 0, 0, 0, 0, 0), test);
        __CLR4_4_1147m147mlgchoset.R.inc(53141);assertEquals(new Period(2, 3, 0, 0, 0, 0, 0, 0), result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testNormalizedStandard_yearMonth2() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a0ok8f1506();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_yearMonth2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a0ok8f1506(){try{__CLR4_4_1147m147mlgchoset.R.inc(53142);
        __CLR4_4_1147m147mlgchoset.R.inc(53143);Period test = new Period(Integer.MAX_VALUE, 15, 0, 0, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53144);try {
            __CLR4_4_1147m147mlgchoset.R.inc(53145);test.normalizedStandard();
            __CLR4_4_1147m147mlgchoset.R.inc(53146);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testNormalizedStandard_weekDay1() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxhpkn150b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_weekDay1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53147,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxhpkn150b(){try{__CLR4_4_1147m147mlgchoset.R.inc(53147);
        __CLR4_4_1147m147mlgchoset.R.inc(53148);Period test = new Period(0, 0, 1, 12, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53149);Period result = test.normalizedStandard();
        __CLR4_4_1147m147mlgchoset.R.inc(53150);assertEquals(new Period(0, 0, 1, 12, 0, 0, 0, 0), test);
        __CLR4_4_1147m147mlgchoset.R.inc(53151);assertEquals(new Period(0, 0, 2, 5, 0, 0, 0, 0), result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testNormalizedStandard_weekDay2() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ohqs6150g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_weekDay2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53152,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ohqs6150g(){try{__CLR4_4_1147m147mlgchoset.R.inc(53152);
        __CLR4_4_1147m147mlgchoset.R.inc(53153);Period test = new Period(0, 0, Integer.MAX_VALUE, 7, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53154);try {
            __CLR4_4_1147m147mlgchoset.R.inc(53155);test.normalizedStandard();
            __CLR4_4_1147m147mlgchoset.R.inc(53156);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testNormalizedStandard_yearMonthWeekDay() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nedo85150l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_yearMonthWeekDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nedo85150l(){try{__CLR4_4_1147m147mlgchoset.R.inc(53157);
        __CLR4_4_1147m147mlgchoset.R.inc(53158);Period test = new Period(1, 15, 1, 12, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53159);Period result = test.normalizedStandard();
        __CLR4_4_1147m147mlgchoset.R.inc(53160);assertEquals(new Period(1, 15, 1, 12, 0, 0, 0, 0), test);
        __CLR4_4_1147m147mlgchoset.R.inc(53161);assertEquals(new Period(2, 3, 2, 5, 0, 0, 0, 0), result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testNormalizedStandard_yearMonthDay() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e43qwp150q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_yearMonthDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e43qwp150q(){try{__CLR4_4_1147m147mlgchoset.R.inc(53162);
        __CLR4_4_1147m147mlgchoset.R.inc(53163);Period test = new Period(1, 15, 0, 36, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53164);Period result = test.normalizedStandard();
        __CLR4_4_1147m147mlgchoset.R.inc(53165);assertEquals(new Period(1, 15, 0, 36, 0, 0, 0, 0), test);
        __CLR4_4_1147m147mlgchoset.R.inc(53166);assertEquals(new Period(2, 3, 5, 1, 0, 0, 0, 0), result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testNormalizedStandard_negative() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14g6syz150v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_negative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53167,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14g6syz150v(){try{__CLR4_4_1147m147mlgchoset.R.inc(53167);
        __CLR4_4_1147m147mlgchoset.R.inc(53168);Period test = new Period(0, 0, 0, 0, 2, -10, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53169);Period result = test.normalizedStandard();
        __CLR4_4_1147m147mlgchoset.R.inc(53170);assertEquals(new Period(0, 0, 0, 0, 2, -10, 0, 0), test);
        __CLR4_4_1147m147mlgchoset.R.inc(53171);assertEquals(new Period(0, 0, 0, 0, 1, 50, 0, 0), result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testNormalizedStandard_fullNegative() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jqm57g1510();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_fullNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53172,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jqm57g1510(){try{__CLR4_4_1147m147mlgchoset.R.inc(53172);
        __CLR4_4_1147m147mlgchoset.R.inc(53173);Period test = new Period(0, 0, 0, 0, 1, -70, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53174);Period result = test.normalizedStandard();
        __CLR4_4_1147m147mlgchoset.R.inc(53175);assertEquals(new Period(0, 0, 0, 0, 1, -70, 0, 0), test);
        __CLR4_4_1147m147mlgchoset.R.inc(53176);assertEquals(new Period(0, 0, 0, 0, 0, -10, 0, 0), result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNormalizedStandard_periodType_yearMonth1() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vlwps1515();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_yearMonth1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vlwps1515(){try{__CLR4_4_1147m147mlgchoset.R.inc(53177);
        __CLR4_4_1147m147mlgchoset.R.inc(53178);Period test = new Period(1, 15, 0, 0, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53179);Period result = test.normalizedStandard((PeriodType) null);
        __CLR4_4_1147m147mlgchoset.R.inc(53180);assertEquals(new Period(1, 15, 0, 0, 0, 0, 0, 0), test);
        __CLR4_4_1147m147mlgchoset.R.inc(53181);assertEquals(new Period(2, 3, 0, 0, 0, 0, 0, 0), result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testNormalizedStandard_periodType_yearMonth2() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13mlxxb151a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_yearMonth2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13mlxxb151a(){try{__CLR4_4_1147m147mlgchoset.R.inc(53182);
        __CLR4_4_1147m147mlgchoset.R.inc(53183);Period test = new Period(Integer.MAX_VALUE, 15, 0, 0, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53184);try {
            __CLR4_4_1147m147mlgchoset.R.inc(53185);test.normalizedStandard((PeriodType) null);
            __CLR4_4_1147m147mlgchoset.R.inc(53186);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testNormalizedStandard_periodType_yearMonth3() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dlz4u151f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_yearMonth3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dlz4u151f(){try{__CLR4_4_1147m147mlgchoset.R.inc(53187);
        __CLR4_4_1147m147mlgchoset.R.inc(53188);Period test = new Period(1, 15, 3, 4, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53189);try {
            __CLR4_4_1147m147mlgchoset.R.inc(53190);test.normalizedStandard(PeriodType.dayTime());
            __CLR4_4_1147m147mlgchoset.R.inc(53191);fail();
        } catch (UnsupportedOperationException ex) {
        }
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testNormalizedStandard_periodType_weekDay1() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fifs63151k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_weekDay1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fifs63151k(){try{__CLR4_4_1147m147mlgchoset.R.inc(53192);
        __CLR4_4_1147m147mlgchoset.R.inc(53193);Period test = new Period(0, 0, 1, 12, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53194);Period result = test.normalizedStandard((PeriodType) null);
        __CLR4_4_1147m147mlgchoset.R.inc(53195);assertEquals(new Period(0, 0, 1, 12, 0, 0, 0, 0), test);
        __CLR4_4_1147m147mlgchoset.R.inc(53196);assertEquals(new Period(0, 0, 2, 5, 0, 0, 0, 0), result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testNormalizedStandard_periodType_weekDay2() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1irfqyk151p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_weekDay2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1irfqyk151p(){try{__CLR4_4_1147m147mlgchoset.R.inc(53197);
        __CLR4_4_1147m147mlgchoset.R.inc(53198);Period test = new Period(0, 0, Integer.MAX_VALUE, 7, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53199);try {
            __CLR4_4_1147m147mlgchoset.R.inc(53200);test.normalizedStandard((PeriodType) null);
            __CLR4_4_1147m147mlgchoset.R.inc(53201);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testNormalizedStandard_periodType_weekDay3() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m0fpr1151u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_weekDay3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m0fpr1151u(){try{__CLR4_4_1147m147mlgchoset.R.inc(53202);
        __CLR4_4_1147m147mlgchoset.R.inc(53203);Period test = new Period(0, 0, 1, 12, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53204);Period result = test.normalizedStandard(PeriodType.dayTime());
        __CLR4_4_1147m147mlgchoset.R.inc(53205);assertEquals(new Period(0, 0, 1, 12, 0, 0, 0, 0), test);
        __CLR4_4_1147m147mlgchoset.R.inc(53206);assertEquals(new Period(0, 0, 0, 19, 0, 0, 0, 0, PeriodType.dayTime()), result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testNormalizedStandard_periodType_yearMonthWeekDay() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fyd2bb151z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_yearMonthWeekDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fyd2bb151z(){try{__CLR4_4_1147m147mlgchoset.R.inc(53207);
        __CLR4_4_1147m147mlgchoset.R.inc(53208);Period test = new Period(1, 15, 1, 12, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53209);Period result = test.normalizedStandard(PeriodType.yearMonthDayTime());
        __CLR4_4_1147m147mlgchoset.R.inc(53210);assertEquals(new Period(1, 15, 1, 12, 0, 0, 0, 0), test);
        __CLR4_4_1147m147mlgchoset.R.inc(53211);assertEquals(new Period(2, 3, 0, 19, 0, 0, 0, 0, PeriodType.yearMonthDayTime()), result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testNormalizedStandard_periodType_yearMonthDay() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uykwdx1524();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_yearMonthDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uykwdx1524(){try{__CLR4_4_1147m147mlgchoset.R.inc(53212);
        __CLR4_4_1147m147mlgchoset.R.inc(53213);Period test = new Period(1, 15, 0, 36, 27, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53214);Period result = test.normalizedStandard(PeriodType.yearMonthDayTime());
        __CLR4_4_1147m147mlgchoset.R.inc(53215);assertEquals(new Period(1, 15, 0, 36, 27, 0, 0, 0), test);
        __CLR4_4_1147m147mlgchoset.R.inc(53216);assertEquals(new Period(2, 3, 0, 37, 3, 0, 0, 0, PeriodType.yearMonthDayTime()), result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testNormalizedStandard_periodType_months1() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1efzdxi1529();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_months1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1efzdxi1529(){try{__CLR4_4_1147m147mlgchoset.R.inc(53217);
        __CLR4_4_1147m147mlgchoset.R.inc(53218);Period test = new Period(1, 15, 0, 0, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53219);Period result = test.normalizedStandard(PeriodType.months());
        __CLR4_4_1147m147mlgchoset.R.inc(53220);assertEquals(new Period(1, 15, 0, 0, 0, 0, 0, 0), test);
        __CLR4_4_1147m147mlgchoset.R.inc(53221);assertEquals(new Period(0, 27, 0, 0, 0, 0, 0, 0, PeriodType.months()), result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testNormalizedStandard_periodType_months2() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b6zf51152e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_months2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53222,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b6zf51152e(){try{__CLR4_4_1147m147mlgchoset.R.inc(53222);
        __CLR4_4_1147m147mlgchoset.R.inc(53223);Period test = new Period(-2, 15, 0, 0, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53224);Period result = test.normalizedStandard(PeriodType.months());
        __CLR4_4_1147m147mlgchoset.R.inc(53225);assertEquals(new Period(-2, 15, 0, 0, 0, 0, 0, 0), test);
        __CLR4_4_1147m147mlgchoset.R.inc(53226);assertEquals(new Period(0, -9, 0, 0, 0, 0, 0, 0, PeriodType.months()), result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testNormalizedStandard_periodType_months3() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xzgck152j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_months3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53227,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xzgck152j(){try{__CLR4_4_1147m147mlgchoset.R.inc(53227);
        __CLR4_4_1147m147mlgchoset.R.inc(53228);Period test = new Period(0, 4, 0, 0, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53229);Period result = test.normalizedStandard(PeriodType.months());
        __CLR4_4_1147m147mlgchoset.R.inc(53230);assertEquals(new Period(0, 4, 0, 0, 0, 0, 0, 0), test);
        __CLR4_4_1147m147mlgchoset.R.inc(53231);assertEquals(new Period(0, 4, 0, 0, 0, 0, 0, 0, PeriodType.months()), result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testNormalizedStandard_periodType_years() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0o4ky152o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_years",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53232,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0o4ky152o(){try{__CLR4_4_1147m147mlgchoset.R.inc(53232);
        __CLR4_4_1147m147mlgchoset.R.inc(53233);Period test = new Period(1, 15, 0, 0, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53234);try {
            __CLR4_4_1147m147mlgchoset.R.inc(53235);test.normalizedStandard(PeriodType.years());
            __CLR4_4_1147m147mlgchoset.R.inc(53236);fail();
        } catch (UnsupportedOperationException ex) {
            // expected
        }
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

    @Test
    public void testNormalizedStandard_periodType_monthsWeeks() {__CLR4_4_1147m147mlgchoset.R.globalSliceStart(getClass().getName(),53237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fd3dt4152t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147m147mlgchoset.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147m147mlgchoset.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testNormalizedStandard_periodType_monthsWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53237,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fd3dt4152t(){try{__CLR4_4_1147m147mlgchoset.R.inc(53237);
        __CLR4_4_1147m147mlgchoset.R.inc(53238);PeriodType type = PeriodType.forFields(new DurationFieldType[]{
                DurationFieldType.months(),
                DurationFieldType.weeks(),
                DurationFieldType.days()});
        __CLR4_4_1147m147mlgchoset.R.inc(53239);Period test = new Period(2, 4, 6, 0, 0, 0, 0, 0);
        __CLR4_4_1147m147mlgchoset.R.inc(53240);Period result = test.normalizedStandard(type);
        __CLR4_4_1147m147mlgchoset.R.inc(53241);assertEquals(new Period(2, 4, 6, 0, 0, 0, 0, 0), test);
        __CLR4_4_1147m147mlgchoset.R.inc(53242);assertEquals(new Period(0, 28, 6, 0, 0, 0, 0, 0, type), result);
    }finally{__CLR4_4_1147m147mlgchoset.R.flushNeeded();}}

}
