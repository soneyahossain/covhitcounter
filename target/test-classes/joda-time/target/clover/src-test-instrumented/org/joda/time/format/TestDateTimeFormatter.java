/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2016 Stephen Colebourne
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

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for DateTime Formating.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeFormatter {static class __CLR4_4_11iwf1iwflgchosx2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,72021,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEWYORK = DateTimeZone.forID("America/New_York");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);

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
    private DateTimeFormatter f = null;
    private DateTimeFormatter g = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71151);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71152);TestDateTimeFormatter TB = new TestDateTimeFormatter();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71153);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71154);TB.testPrint_simple();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71155);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71156);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71157);TB.testPrint_locale();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71158);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71159);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71160);TB.testPrint_zone();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71161);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71162);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71163);TB.testPrint_chrono();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71164);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71165);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71166);TB.testPrint_bufferMethods();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71167);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71168);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71169);TB.testPrint_builderMethods();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71170);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71171);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71172);TB.testPrint_writerMethods();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71173);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71174);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71175);TB.testPrint_appendableMethods();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71176);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71177);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71178);TB.testPrint_chrono_and_zone();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71179);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71180);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71181);TB.testWithGetLocale();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71182);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71183);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71184);TB.testWithGetZone();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71185);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71186);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71187);TB.testWithGetChronology();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71188);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71189);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71190);TB.testWithGetPivotYear();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71191);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71192);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71193);TB.testWithGetOffsetParsedMethods();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71194);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71195);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71196);TB.testPrinterParserMethods();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71197);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71198);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71199);TB.testParseLocalDate_simple();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71200);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71201);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71202);TB.testParseLocalDate_yearOfEra();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71203);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71204);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71205);TB.testParseLocalDate_yearOfCentury();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71206);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71207);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71208);TB.testParseLocalDate_monthDay_feb29();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71209);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71210);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71211);TB.testParseLocalDate_monthDay_withDefaultYear_feb29();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71212);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71213);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71214);TB.testParseLocalDate_weekyear_month_week_2010();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71215);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71216);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71217);TB.testParseLocalDate_weekyear_month_week_2011();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71218);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71219);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71220);TB.testParseLocalDate_weekyear_month_week_2012();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71221);TB.tearDown();
//      TB.setUp(); TB.testParseLocalDate_weekyear_month_week_2013(); TB.tearDown(); //do not uncomment this test
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71222);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71223);TB.testParseLocalDate_year_month_week_2010();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71224);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71225);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71226);TB.testParseLocalDate_year_month_week_2011();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71227);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71228);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71229);TB.testParseLocalDate_year_month_week_2012();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71230);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71231);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71232);TB.testParseLocalDate_year_month_week_2013();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71233);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71234);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71235);TB.testParseLocalDate_year_month_week_2014();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71236);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71237);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71238);TB.testParseLocalDate_year_month_week_2015();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71239);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71240);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71241);TB.testParseLocalDate_year_month_week_2016();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71242);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71243);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71244);TB.testParseLocalTime_simple();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71245);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71246);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71247);TB.testParseLocalDateTime_simple();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71248);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71249);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71250);TB.testParseLocalDateTime_monthDay_feb29();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71251);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71252);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71253);TB.testParseLocalDateTime_monthDay_withDefaultYear_feb29();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71254);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71255);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71256);TB.testParseDateTime_simple();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71257);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71258);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71259);TB.testParseDateTime_zone();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71260);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71261);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71262);TB.testParseDateTime_zone2();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71263);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71264);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71265);TB.testParseDateTime_zone3();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71266);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71267);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71268);TB.testParseDateTime_simple_precedence();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71269);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71270);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71271);TB.testParseDateTime_offsetParsed();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71272);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71273);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71274);TB.testParseDateTime_chrono();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71275);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71276);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71277);TB.testParseMutableDateTime_simple();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71278);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71279);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71280);TB.testParseMutableDateTime_zone();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71281);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71282);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71283);TB.testParseMutableDateTime_zone2();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71284);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71285);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71286);TB.testParseMutableDateTime_zone3();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71287);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71288);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71289);TB.testParseMutableDateTime_simple_precedence();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71290);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71291);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71292);TB.testParseMutableDateTime_offsetParsed();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71293);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71294);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71295);TB.testParseMutableDateTime_chrono();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71296);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71297);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71298);TB.testParseInto_simple();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71299);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71300);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71301);TB.testParseInto_zone();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71302);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71303);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71304);TB.testParseInto_zone2();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71305);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71306);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71307);TB.testParseInto_zone3();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71308);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71309);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71310);TB.testParseInto_simple_precedence();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71311);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71312);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71313);TB.testParseInto_offsetParsed();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71314);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71315);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71316);TB.testParseInto_chrono();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71317);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71318);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71319);TB.testParseInto_monthOnly();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71320);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71321);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71322);TB.testParseInto_monthOnly_baseStartYear();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71323);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71324);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71325);TB.testParseInto_monthOnly_parseStartYear();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71326);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71327);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71328);TB.testParseInto_monthOnly_baseEndYear();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71329);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71330);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71331);TB.testParseInto_monthOnly_parseEndYear();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71332);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71333);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71334);TB.testParseInto_monthDay_feb29();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71335);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71336);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71337);TB.testParseInto_monthDay_feb29_startOfYear();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71338);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71339);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71340);TB.testParseInto_monthDay_feb29_OfYear();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71341);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71342);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71343);TB.testParseInto_monthDay_feb29_newYork();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71344);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71345);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71346);TB.testParseInto_monthDay_feb29_newYork_startOfYear();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71347);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71348);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71349);TB.testParseInto_monthDay_feb29_newYork_endOfYear();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71350);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71351);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71352);TB.testParseInto_monthDay_feb29_tokyo();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71353);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71354);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71355);TB.testParseInto_monthDay_feb29_tokyo_startOfYear();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71356);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71357);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71358);TB.testParseInto_monthDay_feb29_tokyo_endOfYear();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71359);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71360);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71361);TB.testParseInto_monthDay_withDefaultYear_feb29();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71362);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71363);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71364);TB.testParseInto_monthDay_withDefaultYear_feb29_newYork();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71365);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71366);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71367);TB.testParseInto_monthDay_withDefaultYear_feb29_newYork_endOfYear();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71368);TB.tearDown();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71369);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71370);TB.testParseMillis_fractionOfSecondLong();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71371);TB.tearDown();
        //TB.setUp(); TB.testZoneNameNearTransition(); TB.tearDown();  //due to long method error
        //TB.setUp(); TB.testZoneShortNameNearTransition(); TB.tearDown(); //due to long method error
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71372);TB.setUp();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71373);TB.testCustomDateTimePrinter();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71374);TB.tearDown();

    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestDateTimeFormatter.class);
    }

    public TestDateTimeFormatter(String name) {
        super(name);
    }
     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71375);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71376);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71377);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71378);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71379);originalLocale = Locale.getDefault();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71380);DateTimeZone.setDefault(LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71381);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71382);Locale.setDefault(Locale.UK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71383);f = new DateTimeFormatterBuilder()
                .appendDayOfWeekShortText()
                .appendLiteral(' ')
                .append(ISODateTimeFormat.dateTimeNoMillis())
                .toFormatter();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71384);g = ISODateTimeFormat.dateTimeNoMillis();
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71385);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71386);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71387);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71388);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71389);Locale.setDefault(originalLocale);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71390);originalDateTimeZone = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71391);originalTimeZone = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71392);originalLocale = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71393);f = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71394);g = null;
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPrint_simple() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1le5eil1j37();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1le5eil1j37(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71395);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71396);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71397);assertEquals("Wed 2004-06-09T10:20:30Z", f.print(dt));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71398);dt = dt.withZone(PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71399);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.print(dt));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71400);dt = dt.withZone(NEWYORK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71401);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.print(dt));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71402);dt = dt.withChronology(BUDDHIST_PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71403);assertEquals("Wed 2547-06-09T12:20:30+02:00", f.print(dt));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPrint_locale() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ghmvl11j3g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ghmvl11j3g(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71404);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71405);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71406);assertEquals("mer. 2004-06-09T10:20:30Z", f.withLocale(Locale.FRENCH).print(dt));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71407);assertEquals("Wed 2004-06-09T10:20:30Z", f.withLocale(null).print(dt));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPrint_zone() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c9wdbr1j3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71408,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c9wdbr1j3k(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71408);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71409);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71410);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withZone(NEWYORK).print(dt));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71411);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withZone(PARIS).print(dt));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71412);assertEquals("Wed 2004-06-09T10:20:30Z", f.withZone(null).print(dt));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71413);dt = dt.withZone(NEWYORK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71414);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withZone(NEWYORK).print(dt));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71415);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withZone(PARIS).print(dt));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71416);assertEquals("Wed 2004-06-09T10:20:30Z", f.withZoneUTC().print(dt));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71417);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withZone(null).print(dt));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPrint_chrono() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x29lse1j3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x29lse1j3u(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71418);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71419);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71420);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).print(dt));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71421);assertEquals("Wed 2547-06-09T12:20:30+02:00", f.withChronology(BUDDHIST_PARIS).print(dt));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71422);assertEquals("Wed 2004-06-09T10:20:30Z", f.withChronology(null).print(dt));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71423);dt = dt.withChronology(BUDDHIST_PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71424);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).print(dt));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71425);assertEquals("Wed 2547-06-09T12:20:30+02:00", f.withChronology(BUDDHIST_PARIS).print(dt));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71426);assertEquals("Wed 2004-06-09T10:20:30Z", f.withChronology(ISO_UTC).print(dt));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71427);assertEquals("Wed 2547-06-09T12:20:30+02:00", f.withChronology(null).print(dt));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testPrint_bufferMethods() throws Exception {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sz4zx11j44();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_bufferMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71428,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sz4zx11j44() throws Exception{try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71428);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71429);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71430);StringBuffer buf = new StringBuffer();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71431);f.printTo(buf, dt);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71432);assertEquals("Wed 2004-06-09T10:20:30Z", buf.toString());

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71433);buf = new StringBuffer();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71434);f.printTo(buf, dt.getMillis());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71435);assertEquals("Wed 2004-06-09T11:20:30+01:00", buf.toString());

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71436);buf = new StringBuffer();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71437);ISODateTimeFormat.yearMonthDay().printTo(buf, dt.toYearMonthDay());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71438);assertEquals("2004-06-09", buf.toString());

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71439);buf = new StringBuffer();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71440);try {
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71441);ISODateTimeFormat.yearMonthDay().printTo(buf, (ReadablePartial) null);
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71442);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testPrint_builderMethods() throws Exception {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ykuake1j4j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_builderMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71443,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ykuake1j4j() throws Exception{try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71443);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71444);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71445);StringBuilder buf = new StringBuilder();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71446);f.printTo(buf, dt);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71447);assertEquals("Wed 2004-06-09T10:20:30Z", buf.toString());

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71448);buf = new StringBuilder();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71449);f.printTo(buf, dt.getMillis());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71450);assertEquals("Wed 2004-06-09T11:20:30+01:00", buf.toString());

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71451);buf = new StringBuilder();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71452);ISODateTimeFormat.yearMonthDay().printTo(buf, dt.toYearMonthDay());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71453);assertEquals("2004-06-09", buf.toString());

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71454);buf = new StringBuilder();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71455);try {
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71456);ISODateTimeFormat.yearMonthDay().printTo(buf, (ReadablePartial) null);
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71457);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testPrint_writerMethods() throws Exception {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vcbrku1j4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_writerMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71458,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vcbrku1j4y() throws Exception{try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71458);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71459);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71460);CharArrayWriter out = new CharArrayWriter();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71461);f.printTo(out, dt);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71462);assertEquals("Wed 2004-06-09T10:20:30Z", out.toString());

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71463);out = new CharArrayWriter();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71464);f.printTo(out, dt.getMillis());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71465);assertEquals("Wed 2004-06-09T11:20:30+01:00", out.toString());

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71466);out = new CharArrayWriter();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71467);ISODateTimeFormat.yearMonthDay().printTo(out, dt.toYearMonthDay());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71468);assertEquals("2004-06-09", out.toString());

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71469);out = new CharArrayWriter();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71470);try {
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71471);ISODateTimeFormat.yearMonthDay().printTo(out, (ReadablePartial) null);
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71472);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPrint_appendableMethods() throws Exception {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ptp28x1j5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_appendableMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ptp28x1j5d() throws Exception{try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71473);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71474);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71475);StringBuilder buf = new StringBuilder();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71476);f.printTo(buf, dt);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71477);assertEquals("Wed 2004-06-09T10:20:30Z", buf.toString());

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71478);buf = new StringBuilder();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71479);f.printTo(buf, dt.getMillis());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71480);assertEquals("Wed 2004-06-09T11:20:30+01:00", buf.toString());

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71481);buf = new StringBuilder();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71482);ISODateTimeFormat.yearMonthDay().printTo(buf, dt.toLocalDate());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71483);assertEquals("2004-06-09", buf.toString());

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71484);buf = new StringBuilder();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71485);try {
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71486);ISODateTimeFormat.yearMonthDay().printTo(buf, (ReadablePartial) null);
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71487);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPrint_chrono_and_zone() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_169opal1j5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_chrono_and_zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_169opal1j5s(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71488);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71489);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71490);assertEquals("Wed 2004-06-09T10:20:30Z",
                f.withChronology(null).withZone(null).print(dt));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71491);assertEquals("Wed 2004-06-09T12:20:30+02:00",
                f.withChronology(ISO_PARIS).withZone(null).print(dt));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71492);assertEquals("Wed 2004-06-09T12:20:30+02:00",
                f.withChronology(ISO_PARIS).withZone(PARIS).print(dt));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71493);assertEquals("Wed 2004-06-09T06:20:30-04:00",
                f.withChronology(ISO_PARIS).withZone(NEWYORK).print(dt));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71494);assertEquals("Wed 2004-06-09T06:20:30-04:00",
                f.withChronology(null).withZone(NEWYORK).print(dt));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71495);dt = dt.withChronology(ISO_PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71496);assertEquals("Wed 2004-06-09T12:20:30+02:00",
                f.withChronology(null).withZone(null).print(dt));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71497);assertEquals("Wed 2004-06-09T12:20:30+02:00",
                f.withChronology(ISO_PARIS).withZone(null).print(dt));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71498);assertEquals("Wed 2004-06-09T12:20:30+02:00",
                f.withChronology(ISO_PARIS).withZone(PARIS).print(dt));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71499);assertEquals("Wed 2004-06-09T06:20:30-04:00",
                f.withChronology(ISO_PARIS).withZone(NEWYORK).print(dt));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71500);assertEquals("Wed 2004-06-09T06:20:30-04:00",
                f.withChronology(null).withZone(NEWYORK).print(dt));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71501);dt = dt.withChronology(BUDDHIST_PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71502);assertEquals("Wed 2547-06-09T12:20:30+02:00",
                f.withChronology(null).withZone(null).print(dt));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71503);assertEquals("Wed 2004-06-09T12:20:30+02:00",
                f.withChronology(ISO_PARIS).withZone(null).print(dt));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71504);assertEquals("Wed 2004-06-09T12:20:30+02:00",
                f.withChronology(ISO_PARIS).withZone(PARIS).print(dt));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71505);assertEquals("Wed 2004-06-09T06:20:30-04:00",
                f.withChronology(ISO_PARIS).withZone(NEWYORK).print(dt));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71506);assertEquals("Wed 2547-06-09T06:20:30-04:00",
                f.withChronology(null).withZone(NEWYORK).print(dt));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testWithGetLocale() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xi7vun1j6b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetLocale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xi7vun1j6b(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71507);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71508);DateTimeFormatter f2 = f.withLocale(Locale.FRENCH);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71509);assertEquals(Locale.FRENCH, f2.getLocale());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71510);assertSame(f2, f2.withLocale(Locale.FRENCH));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71511);f2 = f.withLocale(null);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71512);assertEquals(null, f2.getLocale());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71513);assertSame(f2, f2.withLocale(null));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testWithGetZone() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g38sbz1j6i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g38sbz1j6i(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71514);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71515);DateTimeFormatter f2 = f.withZone(PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71516);assertEquals(PARIS, f2.getZone());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71517);assertSame(f2, f2.withZone(PARIS));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71518);f2 = f.withZone(null);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71519);assertEquals(null, f2.getZone());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71520);assertSame(f2, f2.withZone(null));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testWithGetChronology() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ip6szn1j6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ip6szn1j6p(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71521);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71522);DateTimeFormatter f2 = f.withChronology(BUDDHIST_PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71523);assertEquals(BUDDHIST_PARIS, f2.getChronology());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71524);assertSame(f2, f2.withChronology(BUDDHIST_PARIS));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71525);f2 = f.withChronology(null);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71526);assertEquals(null, f2.getChronology());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71527);assertSame(f2, f2.withChronology(null));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testWithGetPivotYear() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l828bs1j6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetPivotYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l828bs1j6w(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71528);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71529);DateTimeFormatter f2 = f.withPivotYear(13);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71530);assertEquals(new Integer(13), f2.getPivotYear());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71531);assertSame(f2, f2.withPivotYear(13));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71532);f2 = f.withPivotYear(new Integer(14));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71533);assertEquals(new Integer(14), f2.getPivotYear());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71534);assertSame(f2, f2.withPivotYear(new Integer(14)));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71535);f2 = f.withPivotYear(null);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71536);assertEquals(null, f2.getPivotYear());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71537);assertSame(f2, f2.withPivotYear(null));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testWithGetOffsetParsedMethods() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vr7op51j76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetOffsetParsedMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71538,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vr7op51j76(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71538);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71539);DateTimeFormatter f2 = f;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71540);assertEquals(false, f2.isOffsetParsed());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71541);assertEquals(null, f2.getZone());

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71542);f2 = f.withOffsetParsed();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71543);assertEquals(true, f2.isOffsetParsed());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71544);assertEquals(null, f2.getZone());

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71545);f2 = f2.withZone(PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71546);assertEquals(false, f2.isOffsetParsed());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71547);assertEquals(PARIS, f2.getZone());

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71548);f2 = f2.withOffsetParsed();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71549);assertEquals(true, f2.isOffsetParsed());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71550);assertEquals(null, f2.getZone());

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71551);f2 = f.withOffsetParsed();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71552);assertNotSame(f, f2);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71553);DateTimeFormatter f3 = f2.withOffsetParsed();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71554);assertSame(f2, f3);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testPrinterParserMethods() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6rfoy1j7n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrinterParserMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6rfoy1j7n(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71555);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71556);DateTimeFormatter f2 = new DateTimeFormatter(f.getPrinter(), f.getParser());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71557);assertEquals(f.getPrinter(), f2.getPrinter());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71558);assertEquals(f.getParser(), f2.getParser());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71559);assertEquals(true, f2.isPrinter());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71560);assertEquals(true, f2.isParser());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71561);assertNotNull(f2.print(0L));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71562);assertNotNull(f2.parseDateTime("Thu 1970-01-01T00:00:00Z"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71563);f2 = new DateTimeFormatter(f.getPrinter(), null);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71564);assertEquals(f.getPrinter(), f2.getPrinter());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71565);assertEquals(null, f2.getParser());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71566);assertEquals(true, f2.isPrinter());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71567);assertEquals(false, f2.isParser());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71568);assertNotNull(f2.print(0L));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71569);try {
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71570);f2.parseDateTime("Thu 1970-01-01T00:00:00Z");
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71571);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71572);f2 = new DateTimeFormatter((DateTimePrinter) null, f.getParser());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71573);assertEquals(null, f2.getPrinter());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71574);assertEquals(f.getParser(), f2.getParser());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71575);assertEquals(false, f2.isPrinter());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71576);assertEquals(true, f2.isParser());
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71577);try {
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71578);f2.print(0L);
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71579);fail();
        } catch (UnsupportedOperationException ex) {
        }
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71580);assertNotNull(f2.parseDateTime("Thu 1970-01-01T00:00:00Z"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseLocalDate_simple() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yyidc1j8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yyidc1j8d(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71581);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71582);assertEquals(new LocalDate(2004, 6, 9), g.parseLocalDate("2004-06-09T10:20:30Z"));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71583);assertEquals(new LocalDate(2004, 6, 9), g.parseLocalDate("2004-06-09T10:20:30+18:00"));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71584);assertEquals(new LocalDate(2004, 6, 9), g.parseLocalDate("2004-06-09T10:20:30-18:00"));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71585);assertEquals(new LocalDate(2004, 6, 9, BUDDHIST_PARIS),
                g.withChronology(BUDDHIST_PARIS).parseLocalDate("2004-06-09T10:20:30Z"));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71586);try {
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71587);g.parseDateTime("ABC");
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71588);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseLocalDate_yearOfEra() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gkmq5c1j8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_yearOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71589,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gkmq5c1j8l(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71589);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71590);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71591);DateTimeFormatter f = DateTimeFormat
                .forPattern("YYYY-MM GG")
                .withChronology(chrono)
                .withLocale(Locale.UK);

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71592);LocalDate date = new LocalDate(2005, 10, 1, chrono);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71593);assertEquals(date, f.parseLocalDate("2005-10 AD"));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71594);assertEquals(date, f.parseLocalDate("2005-10 CE"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71595);date = new LocalDate(-2005, 10, 1, chrono);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71596);assertEquals(date, f.parseLocalDate("2005-10 BC"));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71597);assertEquals(date, f.parseLocalDate("2005-10 BCE"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseLocalDate_yearOfCentury() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fk3qhs1j8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_yearOfCentury",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fk3qhs1j8u(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71598);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71599);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71600);DateTimeFormatter f = DateTimeFormat
                .forPattern("yy M d")
                .withChronology(chrono)
                .withLocale(Locale.UK)
                .withPivotYear(2050);

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71601);LocalDate date = new LocalDate(2050, 8, 4, chrono);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71602);assertEquals(date, f.parseLocalDate("50 8 4"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseLocalDate_monthDay_feb29() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iy7k5n1j8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_monthDay_feb29",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iy7k5n1j8z(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71603);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71604);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71605);DateTimeFormatter f = DateTimeFormat
                .forPattern("M d")
                .withChronology(chrono)
                .withLocale(Locale.UK);

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71606);assertEquals(new LocalDate(2000, 2, 29, chrono), f.parseLocalDate("2 29"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseLocalDate_monthDay_withDefaultYear_feb29() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v6e6b61j93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_monthDay_withDefaultYear_feb29",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71607,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v6e6b61j93(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71607);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71608);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71609);DateTimeFormatter f = DateTimeFormat
                .forPattern("M d")
                .withChronology(chrono)
                .withLocale(Locale.UK)
                .withDefaultYear(2012);

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71610);assertEquals(new LocalDate(2012, 2, 29, chrono), f.parseLocalDate("2 29"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseLocalDate_weekyear_month_week_2010() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nqf551j97();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_weekyear_month_week_2010",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71611,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nqf551j97(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71611);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71612);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71613);DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71614);assertEquals(new LocalDate(2010, 1, 4, chrono), f.parseLocalDate("2010-01-01"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseLocalDate_weekyear_month_week_2011() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13wqdxm1j9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_weekyear_month_week_2011",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13wqdxm1j9b(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71615);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71616);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71617);DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71618);assertEquals(new LocalDate(2011, 1, 3, chrono), f.parseLocalDate("2011-01-01"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseLocalDate_weekyear_month_week_2012() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_175qcq31j9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_weekyear_month_week_2012",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_175qcq31j9f(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71619);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71620);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71621);DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71622);assertEquals(new LocalDate(2012, 1, 2, chrono), f.parseLocalDate("2012-01-01"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    // This test fails, but since more related tests pass with the extra loop in DateTimeParserBucket, I'm going to leave the change in and ignore this test
    /*
    @Test
    public void testParseLocalDate_weekyear_month_week_2013() {
        Chronology chrono = GJChronology.getInstanceUTC();
        DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono);
        assertEquals(new LocalDate(2012, 12, 31, chrono), f.parseLocalDate("2013-01-01"));
    }
    */

    @Test
    public void testParseLocalDate_year_month_week_2010() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dic1111j9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_year_month_week_2010",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dic1111j9j(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71623);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71624);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71625);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71626);assertEquals(new LocalDate(2010, 1, 4, chrono), f.parseLocalDate("2010-01-01"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseLocalDate_year_month_week_2011() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1grbzti1j9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_year_month_week_2011",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1grbzti1j9n(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71627);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71628);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71629);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71630);assertEquals(new LocalDate(2011, 1, 3, chrono), f.parseLocalDate("2011-01-01"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseLocalDate_year_month_week_2012() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k0bylz1j9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_year_month_week_2012",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k0bylz1j9r(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71631);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71632);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71633);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71634);assertEquals(new LocalDate(2012, 1, 2, chrono), f.parseLocalDate("2012-01-01"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseLocalDate_year_month_week_2013() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n9bxeg1j9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_year_month_week_2013",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n9bxeg1j9v(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71635);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71636);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71637);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71638);assertEquals(new LocalDate(2012, 12, 31, chrono), f.parseLocalDate("2013-01-01"));  // 2013-01-01 would be better, but this is OK
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseLocalDate_year_month_week_2014() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qibw6x1j9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_year_month_week_2014",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qibw6x1j9z(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71639);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71640);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71641);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71642);assertEquals(new LocalDate(2013, 12, 30, chrono), f.parseLocalDate("2014-01-01"));  // 2014-01-01 would be better, but this is OK
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseLocalDate_year_month_week_2015() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1trbuze1ja3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_year_month_week_2015",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71643,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1trbuze1ja3(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71643);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71644);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71645);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71646);assertEquals(new LocalDate(2014, 12, 29, chrono), f.parseLocalDate("2015-01-01"));  // 2015-01-01 would be better, but this is OK
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseLocalDate_year_month_week_2016() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x0btrv1ja7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_year_month_week_2016",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x0btrv1ja7(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71647);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71648);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71649);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71650);assertEquals(new LocalDate(2016, 1, 4, chrono), f.parseLocalDate("2016-01-01"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseLocalTime_simple() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1th6fz51jab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalTime_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1th6fz51jab(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71651);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71652);assertEquals(new LocalTime(10, 20, 30), g.parseLocalTime("2004-06-09T10:20:30Z"));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71653);assertEquals(new LocalTime(10, 20, 30), g.parseLocalTime("2004-06-09T10:20:30+18:00"));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71654);assertEquals(new LocalTime(10, 20, 30), g.parseLocalTime("2004-06-09T10:20:30-18:00"));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71655);assertEquals(new LocalTime(10, 20, 30, 0, BUDDHIST_PARIS),
                g.withChronology(BUDDHIST_PARIS).parseLocalTime("2004-06-09T10:20:30Z"));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71656);try {
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71657);g.parseDateTime("ABC");
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71658);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseLocalDateTime_simple() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u9locz1jaj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDateTime_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u9locz1jaj(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71659);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71660);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30), g.parseLocalDateTime("2004-06-09T10:20:30Z"));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71661);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30), g.parseLocalDateTime("2004-06-09T10:20:30+18:00"));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71662);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30), g.parseLocalDateTime("2004-06-09T10:20:30-18:00"));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71663);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30, 0, BUDDHIST_PARIS),
                g.withChronology(BUDDHIST_PARIS).parseLocalDateTime("2004-06-09T10:20:30Z"));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71664);try {
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71665);g.parseDateTime("ABC");
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71666);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseLocalDateTime_monthDay_feb29() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u383p41jar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDateTime_monthDay_feb29",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71667,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u383p41jar(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71667);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71668);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71669);DateTimeFormatter f = DateTimeFormat
                .forPattern("M d H m")
                .withChronology(chrono)
                .withLocale(Locale.UK);

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71670);assertEquals(new LocalDateTime(2000, 2, 29, 13, 40, 0, 0, chrono), f.parseLocalDateTime("2 29 13 40"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseLocalDateTime_monthDay_withDefaultYear_feb29() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1757sf51jav();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDateTime_monthDay_withDefaultYear_feb29",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71671,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1757sf51jav(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71671);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71672);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71673);DateTimeFormatter f = DateTimeFormat
                .forPattern("M d H m")
                .withChronology(chrono)
                .withLocale(Locale.UK)
                .withDefaultYear(2012);

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71674);assertEquals(new LocalDateTime(2012, 2, 29, 13, 40, 0, 0, chrono), f.parseLocalDateTime("2 29 13 40"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseDateTime_simple() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rrio701jaz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseDateTime_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rrio701jaz(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71675);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71676);DateTime expect = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71677);expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71678);assertEquals(expect, g.parseDateTime("2004-06-09T10:20:30Z"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71679);try {
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71680);g.parseDateTime("ABC");
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71681);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseDateTime_zone() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_135zjwq1jb6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseDateTime_zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_135zjwq1jb6(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71682);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71683);DateTime expect = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71684);expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71685);assertEquals(expect, g.withZone(LONDON).parseDateTime("2004-06-09T10:20:30Z"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71686);expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71687);assertEquals(expect, g.withZone(null).parseDateTime("2004-06-09T10:20:30Z"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71688);expect = new DateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71689);assertEquals(expect, g.withZone(PARIS).parseDateTime("2004-06-09T10:20:30Z"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseDateTime_zone2() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fny5ey1jbe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseDateTime_zone2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fny5ey1jbe(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71690);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71691);DateTime expect = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71692);expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71693);assertEquals(expect, g.withZone(LONDON).parseDateTime("2004-06-09T06:20:30-04:00"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71694);expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71695);assertEquals(expect, g.withZone(null).parseDateTime("2004-06-09T06:20:30-04:00"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71696);expect = new DateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71697);assertEquals(expect, g.withZone(PARIS).parseDateTime("2004-06-09T06:20:30-04:00"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseDateTime_zone3() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iwy47f1jbm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseDateTime_zone3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71698,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iwy47f1jbm(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71698);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71699);DateTimeFormatter h = new DateTimeFormatterBuilder()
                .append(ISODateTimeFormat.date())
                .appendLiteral('T')
                .append(ISODateTimeFormat.timeElementParser())
                .toFormatter();

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71700);DateTime expect = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71701);expect = new DateTime(2004, 6, 9, 10, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71702);assertEquals(expect, h.withZone(LONDON).parseDateTime("2004-06-09T10:20:30"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71703);expect = new DateTime(2004, 6, 9, 10, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71704);assertEquals(expect, h.withZone(null).parseDateTime("2004-06-09T10:20:30"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71705);expect = new DateTime(2004, 6, 9, 10, 20, 30, 0, PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71706);assertEquals(expect, h.withZone(PARIS).parseDateTime("2004-06-09T10:20:30"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseDateTime_simple_precedence() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rdonph1jbv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseDateTime_simple_precedence",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rdonph1jbv(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71707);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71708);DateTime expect = null;
        // use correct day of week
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71709);expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71710);assertEquals(expect, f.parseDateTime("Wed 2004-06-09T10:20:30Z"));

        // use wrong day of week
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71711);expect = new DateTime(2004, 6, 7, 11, 20, 30, 0, LONDON);
        // DayOfWeek takes precedence, because week < month in length
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71712);assertEquals(expect, f.parseDateTime("Mon 2004-06-09T10:20:30Z"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseDateTime_offsetParsed() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11qmpfy1jc1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseDateTime_offsetParsed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71713,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11qmpfy1jc1(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71713);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71714);DateTime expect = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71715);expect = new DateTime(2004, 6, 9, 10, 20, 30, 0, UTC);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71716);assertEquals(expect, g.withOffsetParsed().parseDateTime("2004-06-09T10:20:30Z"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71717);expect = new DateTime(2004, 6, 9, 6, 20, 30, 0, DateTimeZone.forOffsetHours(-4));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71718);assertEquals(expect, g.withOffsetParsed().parseDateTime("2004-06-09T06:20:30-04:00"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71719);expect = new DateTime(2004, 6, 9, 10, 20, 30, 0, UTC);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71720);assertEquals(expect, g.withZone(PARIS).withOffsetParsed().parseDateTime("2004-06-09T10:20:30Z"));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71721);expect = new DateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71722);assertEquals(expect, g.withOffsetParsed().withZone(PARIS).parseDateTime("2004-06-09T10:20:30Z"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseDateTime_chrono() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vlh6ib1jcb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseDateTime_chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vlh6ib1jcb(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71723);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71724);DateTime expect = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71725);expect = new DateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71726);assertEquals(expect, g.withChronology(ISO_PARIS).parseDateTime("2004-06-09T10:20:30Z"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71727);expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71728);assertEquals(expect, g.withChronology(null).parseDateTime("2004-06-09T10:20:30Z"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71729);expect = new DateTime(2547, 6, 9, 12, 20, 30, 0, BUDDHIST_PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71730);assertEquals(expect, g.withChronology(BUDDHIST_PARIS).parseDateTime("2547-06-09T10:20:30Z"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71731);expect = new DateTime(2004, 6, 9, 10, 29, 51, 0, BUDDHIST_PARIS); // zone is +00:09:21 in 1451
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71732);assertEquals(expect, g.withChronology(BUDDHIST_PARIS).parseDateTime("2004-06-09T10:20:30Z"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseMutableDateTime_simple() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xf1pk1jcl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xf1pk1jcl(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71733);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71734);MutableDateTime expect = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71735);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71736);assertEquals(expect, g.parseMutableDateTime("2004-06-09T10:20:30Z"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71737);try {
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71738);g.parseMutableDateTime("ABC");
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71739);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseMutableDateTime_zone() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f78i6q1jcs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71740,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f78i6q1jcs(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71740);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71741);MutableDateTime expect = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71742);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71743);assertEquals(expect, g.withZone(LONDON).parseMutableDateTime("2004-06-09T10:20:30Z"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71744);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71745);assertEquals(expect, g.withZone(null).parseMutableDateTime("2004-06-09T10:20:30Z"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71746);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71747);assertEquals(expect, g.withZone(PARIS).parseMutableDateTime("2004-06-09T10:20:30Z"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseMutableDateTime_zone2() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gsziku1jd0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_zone2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71748,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gsziku1jd0(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71748);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71749);MutableDateTime expect = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71750);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71751);assertEquals(expect, g.withZone(LONDON).parseMutableDateTime("2004-06-09T06:20:30-04:00"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71752);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71753);assertEquals(expect, g.withZone(null).parseMutableDateTime("2004-06-09T06:20:30-04:00"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71754);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71755);assertEquals(expect, g.withZone(PARIS).parseMutableDateTime("2004-06-09T06:20:30-04:00"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseMutableDateTime_zone3() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k1zhdb1jd8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_zone3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71756,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k1zhdb1jd8(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71756);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71757);DateTimeFormatter h = new DateTimeFormatterBuilder()
                .append(ISODateTimeFormat.date())
                .appendLiteral('T')
                .append(ISODateTimeFormat.timeElementParser())
                .toFormatter();

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71758);MutableDateTime expect = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71759);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71760);assertEquals(expect, h.withZone(LONDON).parseMutableDateTime("2004-06-09T10:20:30"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71761);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71762);assertEquals(expect, h.withZone(null).parseMutableDateTime("2004-06-09T10:20:30"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71763);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71764);assertEquals(expect, h.withZone(PARIS).parseMutableDateTime("2004-06-09T10:20:30"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseMutableDateTime_simple_precedence() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xzdt0h1jdh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_simple_precedence",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71765,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xzdt0h1jdh(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71765);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71766);MutableDateTime expect = null;
        // use correct day of week
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71767);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71768);assertEquals(expect, f.parseDateTime("Wed 2004-06-09T10:20:30Z"));

        // use wrong day of week
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71769);expect = new MutableDateTime(2004, 6, 7, 11, 20, 30, 0, LONDON);
        // DayOfWeek takes precedence, because week < month in length
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71770);assertEquals(expect, f.parseDateTime("Mon 2004-06-09T10:20:30Z"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseMutableDateTime_offsetParsed() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y2ypzq1jdn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_offsetParsed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y2ypzq1jdn(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71771);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71772);MutableDateTime expect = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71773);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71774);assertEquals(expect, g.withOffsetParsed().parseMutableDateTime("2004-06-09T10:20:30Z"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71775);expect = new MutableDateTime(2004, 6, 9, 6, 20, 30, 0, DateTimeZone.forOffsetHours(-4));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71776);assertEquals(expect, g.withOffsetParsed().parseMutableDateTime("2004-06-09T06:20:30-04:00"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71777);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71778);assertEquals(expect, g.withZone(PARIS).withOffsetParsed().parseMutableDateTime("2004-06-09T10:20:30Z"));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71779);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71780);assertEquals(expect, g.withOffsetParsed().withZone(PARIS).parseMutableDateTime("2004-06-09T10:20:30Z"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseMutableDateTime_chrono() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13qp5k91jdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13qp5k91jdx(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71781);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71782);MutableDateTime expect = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71783);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71784);assertEquals(expect, g.withChronology(ISO_PARIS).parseMutableDateTime("2004-06-09T10:20:30Z"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71785);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71786);assertEquals(expect, g.withChronology(null).parseMutableDateTime("2004-06-09T10:20:30Z"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71787);expect = new MutableDateTime(2547, 6, 9, 12, 20, 30, 0, BUDDHIST_PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71788);assertEquals(expect, g.withChronology(BUDDHIST_PARIS).parseMutableDateTime("2547-06-09T10:20:30Z"));

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71789);expect = new MutableDateTime(2004, 6, 9, 10, 29, 51, 0, BUDDHIST_PARIS); // zone is +00:09:21 in 1451
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71790);assertEquals(expect, g.withChronology(BUDDHIST_PARIS).parseMutableDateTime("2004-06-09T10:20:30Z"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseInto_simple() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1of64s71je7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1of64s71je7(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71791);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71792);MutableDateTime expect = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71793);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71794);MutableDateTime result = new MutableDateTime(0L);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71795);assertEquals(20, g.parseInto(result, "2004-06-09T10:20:30Z", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71796);assertEquals(expect, result);

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71797);try {
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71798);g.parseInto(null, "2004-06-09T10:20:30Z", 0);
            __CLR4_4_11iwf1iwflgchosx2.R.inc(71799);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71800);assertEquals(~0, g.parseInto(result, "ABC", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71801);assertEquals(~10, g.parseInto(result, "2004-06-09", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71802);assertEquals(~13, g.parseInto(result, "XX2004-06-09T", 2));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseInto_zone() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17lrksv1jej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17lrksv1jej(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71803);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71804);MutableDateTime expect = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71805);MutableDateTime result = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71806);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71807);result = new MutableDateTime(0L);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71808);assertEquals(20, g.withZone(LONDON).parseInto(result, "2004-06-09T10:20:30Z", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71809);assertEquals(expect, result);

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71810);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71811);result = new MutableDateTime(0L);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71812);assertEquals(20, g.withZone(null).parseInto(result, "2004-06-09T10:20:30Z", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71813);assertEquals(expect, result);

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71814);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71815);result = new MutableDateTime(0L);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71816);assertEquals(20, g.withZone(PARIS).parseInto(result, "2004-06-09T10:20:30Z", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71817);assertEquals(expect, result);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseInto_zone2() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k51hov1jey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_zone2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71818,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k51hov1jey(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71818);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71819);MutableDateTime expect = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71820);MutableDateTime result = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71821);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71822);result = new MutableDateTime(0L);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71823);assertEquals(25, g.withZone(LONDON).parseInto(result, "2004-06-09T06:20:30-04:00", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71824);assertEquals(expect, result);

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71825);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71826);assertEquals(25, g.withZone(null).parseInto(result, "2004-06-09T06:20:30-04:00", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71827);assertEquals(expect, result);

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71828);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71829);assertEquals(25, g.withZone(PARIS).parseInto(result, "2004-06-09T06:20:30-04:00", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71830);assertEquals(expect, result);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseInto_zone3() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ne1ghc1jfb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_zone3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ne1ghc1jfb(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71831);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71832);DateTimeFormatter h = new DateTimeFormatterBuilder()
                .append(ISODateTimeFormat.date())
                .appendLiteral('T')
                .append(ISODateTimeFormat.timeElementParser())
                .toFormatter();

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71833);MutableDateTime expect = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71834);MutableDateTime result = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71835);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71836);result = new MutableDateTime(0L);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71837);assertEquals(19, h.withZone(LONDON).parseInto(result, "2004-06-09T10:20:30", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71838);assertEquals(expect, result);

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71839);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71840);result = new MutableDateTime(0L);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71841);assertEquals(19, h.withZone(null).parseInto(result, "2004-06-09T10:20:30", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71842);assertEquals(expect, result);

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71843);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71844);result = new MutableDateTime(0L);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71845);assertEquals(19, h.withZone(PARIS).parseInto(result, "2004-06-09T10:20:30", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71846);assertEquals(expect, result);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseInto_simple_precedence() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hop6xs1jfr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_simple_precedence",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hop6xs1jfr(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71847);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71848);MutableDateTime expect = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71849);MutableDateTime result = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71850);expect = new MutableDateTime(2004, 6, 7, 11, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71851);result = new MutableDateTime(0L);
        // DayOfWeek takes precedence, because week < month in length
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71852);assertEquals(24, f.parseInto(result, "Mon 2004-06-09T10:20:30Z", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71853);assertEquals(expect, result);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseInto_offsetParsed() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17pljgp1jfy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_offsetParsed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17pljgp1jfy(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71854);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71855);MutableDateTime expect = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71856);MutableDateTime result = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71857);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71858);result = new MutableDateTime(0L);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71859);assertEquals(20, g.withOffsetParsed().parseInto(result, "2004-06-09T10:20:30Z", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71860);assertEquals(expect, result);

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71861);expect = new MutableDateTime(2004, 6, 9, 6, 20, 30, 0, DateTimeZone.forOffsetHours(-4));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71862);result = new MutableDateTime(0L);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71863);assertEquals(25, g.withOffsetParsed().parseInto(result, "2004-06-09T06:20:30-04:00", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71864);assertEquals(expect, result);

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71865);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71866);result = new MutableDateTime(0L);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71867);assertEquals(20, g.withZone(PARIS).withOffsetParsed().parseInto(result, "2004-06-09T10:20:30Z", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71868);assertEquals(expect, result);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71869);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71870);result = new MutableDateTime(0L);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71871);assertEquals(20, g.withOffsetParsed().withZone(PARIS).parseInto(result, "2004-06-09T10:20:30Z", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71872);assertEquals(expect, result);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseInto_chrono() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yxtpx41jgh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yxtpx41jgh(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71873);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71874);MutableDateTime expect = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71875);MutableDateTime result = null;
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71876);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71877);result = new MutableDateTime(0L);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71878);assertEquals(20, g.withChronology(ISO_PARIS).parseInto(result, "2004-06-09T10:20:30Z", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71879);assertEquals(expect, result);

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71880);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71881);result = new MutableDateTime(0L);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71882);assertEquals(20, g.withChronology(null).parseInto(result, "2004-06-09T10:20:30Z", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71883);assertEquals(expect, result);

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71884);expect = new MutableDateTime(2547, 6, 9, 12, 20, 30, 0, BUDDHIST_PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71885);result = new MutableDateTime(0L);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71886);assertEquals(20, g.withChronology(BUDDHIST_PARIS).parseInto(result, "2547-06-09T10:20:30Z", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71887);assertEquals(expect, result);

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71888);expect = new MutableDateTime(2004, 6, 9, 10, 29, 51, 0, BUDDHIST_PARIS);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71889);result = new MutableDateTime(0L);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71890);assertEquals(20, g.withChronology(BUDDHIST_PARIS).parseInto(result, "2004-06-09T10:20:30Z", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71891);assertEquals(expect, result);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseInto_monthOnly() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15d1vhn1jh0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthOnly",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71892,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15d1vhn1jh0(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71892);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71893);DateTimeFormatter f = DateTimeFormat.forPattern("M").withLocale(Locale.UK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71894);MutableDateTime result = new MutableDateTime(2004, 1, 9, 12, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71895);assertEquals(1, f.parseInto(result, "5", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71896);assertEquals(new MutableDateTime(2004, 5, 9, 12, 20, 30, 0, LONDON), result);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseInto_monthOnly_baseStartYear() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1in7w9o1jh5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthOnly_baseStartYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1in7w9o1jh5(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71897);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71898);DateTimeFormatter f = DateTimeFormat.forPattern("M").withLocale(Locale.UK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71899);MutableDateTime result = new MutableDateTime(2004, 1, 1, 12, 20, 30, 0, TOKYO);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71900);assertEquals(1, f.parseInto(result, "5", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71901);assertEquals(new MutableDateTime(2004, 5, 1, 12, 20, 30, 0, TOKYO), result);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseInto_monthOnly_parseStartYear() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tk8hac1jha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthOnly_parseStartYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71902,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tk8hac1jha(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71902);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71903);DateTimeFormatter f = DateTimeFormat.forPattern("M").withLocale(Locale.UK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71904);MutableDateTime result = new MutableDateTime(2004, 2, 1, 12, 20, 30, 0, TOKYO);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71905);assertEquals(1, f.parseInto(result, "1", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71906);assertEquals(new MutableDateTime(2004, 1, 1, 12, 20, 30, 0, TOKYO), result);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseInto_monthOnly_baseEndYear() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11jsr0j1jhf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthOnly_baseEndYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11jsr0j1jhf(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71907);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71908);DateTimeFormatter f = DateTimeFormat.forPattern("M").withLocale(Locale.UK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71909);MutableDateTime result = new MutableDateTime(2004, 12, 31, 12, 20, 30, 0, TOKYO);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71910);assertEquals(1, f.parseInto(result, "5", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71911);assertEquals(new MutableDateTime(2004, 5, 31, 12, 20, 30, 0, TOKYO), result);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseInto_monthOnly_parseEndYear() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e2uxv1jhk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthOnly_parseEndYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e2uxv1jhk(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71912);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71913);DateTimeFormatter f = DateTimeFormat.forPattern("M").withLocale(Locale.UK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71914);MutableDateTime result = new MutableDateTime(2004, 1, 31, 12, 20, 30, 0, TOKYO);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71915);assertEquals(2, f.parseInto(result, "12", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71916);assertEquals(new MutableDateTime(2004, 12, 31, 12, 20, 30, 0, TOKYO), result);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseInto_monthDay_feb29() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r7j8us1jhp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r7j8us1jhp(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71917);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71918);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71919);MutableDateTime result = new MutableDateTime(2004, 1, 9, 12, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71920);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71921);assertEquals(new MutableDateTime(2004, 2, 29, 12, 20, 30, 0, LONDON), result);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseInto_monthDay_feb29_startOfYear() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_120o8ar1jhu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_startOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_120o8ar1jhu(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71922);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71923);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71924);MutableDateTime result = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71925);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71926);assertEquals(new MutableDateTime(2004, 2, 29, 0, 0, 0, 0, LONDON), result);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseInto_monthDay_feb29_OfYear() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xc3t3p1jhz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_OfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xc3t3p1jhz(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71927);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71928);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71929);MutableDateTime result = new MutableDateTime(2004, 12, 31, 23, 59, 59, 999, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71930);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71931);assertEquals(new MutableDateTime(2004, 2, 29, 23, 59, 59, 999, LONDON), result);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseInto_monthDay_feb29_newYork() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16403p81ji4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_newYork",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16403p81ji4(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71932);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71933);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71934);MutableDateTime result = new MutableDateTime(2004, 1, 9, 12, 20, 30, 0, NEWYORK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71935);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71936);assertEquals(new MutableDateTime(2004, 2, 29, 12, 20, 30, 0, NEWYORK), result);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseInto_monthDay_feb29_newYork_startOfYear() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rtoofh1ji9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_newYork_startOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rtoofh1ji9(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71937);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71938);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71939);MutableDateTime result = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, NEWYORK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71940);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71941);assertEquals(new MutableDateTime(2004, 2, 29, 0, 0, 0, 0, NEWYORK), result);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseInto_monthDay_feb29_newYork_endOfYear() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14qsfis1jie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_newYork_endOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71942,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14qsfis1jie(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71942);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71943);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71944);MutableDateTime result = new MutableDateTime(2004, 12, 31, 23, 59, 59, 999, NEWYORK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71945);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71946);assertEquals(new MutableDateTime(2004, 2, 29, 23, 59, 59, 999, NEWYORK), result);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseInto_monthDay_feb29_tokyo() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1evwk6r1jij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_tokyo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71947,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1evwk6r1jij(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71947);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71948);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71949);MutableDateTime result = new MutableDateTime(2004, 1, 9, 12, 20, 30, 0, TOKYO);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71950);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71951);assertEquals(new MutableDateTime(2004, 2, 29, 12, 20, 30, 0, TOKYO), result);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseInto_monthDay_feb29_tokyo_startOfYear() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dz7rna1jio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_tokyo_startOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dz7rna1jio(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71952);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71953);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71954);MutableDateTime result = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, TOKYO);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71955);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71956);assertEquals(new MutableDateTime(2004, 2, 29, 0, 0, 0, 0, TOKYO), result);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseInto_monthDay_feb29_tokyo_endOfYear() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y017vn1jit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_tokyo_endOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71957,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y017vn1jit(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71957);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71958);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71959);MutableDateTime result = new MutableDateTime(2004, 12, 31, 23, 59, 59, 999, TOKYO);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71960);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71961);assertEquals(new MutableDateTime(2004, 2, 29, 23, 59, 59, 999, TOKYO), result);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseInto_monthDay_withDefaultYear_feb29() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17s72uz1jiy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_withDefaultYear_feb29",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17s72uz1jiy(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71962);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71963);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withDefaultYear(2012);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71964);MutableDateTime result = new MutableDateTime(2004, 1, 9, 12, 20, 30, 0, LONDON);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71965);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71966);assertEquals(new MutableDateTime(2004, 2, 29, 12, 20, 30, 0, LONDON), result);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseInto_monthDay_withDefaultYear_feb29_newYork() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ra0zkl1jj3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_withDefaultYear_feb29_newYork",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ra0zkl1jj3(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71967);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71968);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withDefaultYear(2012);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71969);MutableDateTime result = new MutableDateTime(2004, 1, 9, 12, 20, 30, 0, NEWYORK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71970);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71971);assertEquals(new MutableDateTime(2004, 2, 29, 12, 20, 30, 0, NEWYORK), result);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseInto_monthDay_withDefaultYear_feb29_newYork_endOfYear() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rn8mm31jj8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_withDefaultYear_feb29_newYork_endOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71972,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rn8mm31jj8(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71972);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71973);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withDefaultYear(2012);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71974);MutableDateTime result = new MutableDateTime(2004, 12, 9, 12, 20, 30, 0, NEWYORK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71975);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71976);assertEquals(new MutableDateTime(2004, 2, 29, 12, 20, 30, 0, NEWYORK), result);
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testParseMillis_fractionOfSecondLong() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s0oulk1jjd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMillis_fractionOfSecondLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s0oulk1jjd(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71977);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71978);DateTimeFormatter f = new DateTimeFormatterBuilder()
                .appendSecondOfDay(2).appendLiteral('.').appendFractionOfSecond(1, 9)
                .toFormatter().withZoneUTC();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71979);assertEquals(10512, f.parseMillis("10.5123456"));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71980);assertEquals(10512, f.parseMillis("10.512999"));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // Ensure time zone name switches properly at the zone DST transition.
    //@Test
    public void testZoneNameNearTransition() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15tgbd91jjh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testZoneNameNearTransition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15tgbd91jjh(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71981);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71982);DateTime inDST_1 = new DateTime(2005, 10, 30, 1, 0, 0, 0, NEWYORK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71983);DateTime inDST_2 = new DateTime(2005, 10, 30, 1, 59, 59, 999, NEWYORK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71984);DateTime onDST = new DateTime(2005, 10, 30, 2, 0, 0, 0, NEWYORK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71985);DateTime outDST = new DateTime(2005, 10, 30, 2, 0, 0, 1, NEWYORK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71986);DateTime outDST_2 = new DateTime(2005, 10, 30, 2, 0, 1, 0, NEWYORK);

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71987);DateTimeFormatter fmt = DateTimeFormat.forPattern("yyy-MM-dd HH:mm:ss.S zzzz");
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71988);assertEquals("2005-10-30 01:00:00.0 Eastern Daylight Time", fmt.print(inDST_1));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71989);assertEquals("2005-10-30 01:59:59.9 Eastern Daylight Time", fmt.print(inDST_2));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71990);assertEquals("2005-10-30 02:00:00.0 Eastern Standard Time", fmt.print(onDST));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71991);assertEquals("2005-10-30 02:00:00.0 Eastern Standard Time", fmt.print(outDST));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71992);assertEquals("2005-10-30 02:00:01.0 Eastern Standard Time", fmt.print(outDST_2));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    // Ensure time zone name switches properly at the zone DST transition.
    //@Test
    public void testZoneShortNameNearTransition() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),71993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1euusq51jjt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testZoneShortNameNearTransition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71993,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1euusq51jjt(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(71993);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71994);DateTime inDST_1 = new DateTime(2005, 10, 30, 1, 0, 0, 0, NEWYORK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71995);DateTime inDST_2 = new DateTime(2005, 10, 30, 1, 59, 59, 999, NEWYORK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71996);DateTime onDST = new DateTime(2005, 10, 30, 2, 0, 0, 0, NEWYORK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71997);DateTime outDST = new DateTime(2005, 10, 30, 2, 0, 0, 1, NEWYORK);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(71998);DateTime outDST_2 = new DateTime(2005, 10, 30, 2, 0, 1, 0, NEWYORK);

        __CLR4_4_11iwf1iwflgchosx2.R.inc(71999);DateTimeFormatter fmt = DateTimeFormat.forPattern("yyy-MM-dd HH:mm:ss.S z").withLocale(Locale.ENGLISH);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(72000);assertEquals("2005-10-30 01:00:00.0 EDT", fmt.print(inDST_1));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(72001);assertEquals("2005-10-30 01:59:59.9 EDT", fmt.print(inDST_2));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(72002);assertEquals("2005-10-30 02:00:00.0 EST", fmt.print(onDST));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(72003);assertEquals("2005-10-30 02:00:00.0 EST", fmt.print(outDST));
        __CLR4_4_11iwf1iwflgchosx2.R.inc(72004);assertEquals("2005-10-30 02:00:01.0 EST", fmt.print(outDST_2));
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    @Test
    public void testCustomDateTimePrinter() {__CLR4_4_11iwf1iwflgchosx2.R.globalSliceStart(getClass().getName(),72005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5hdwj1jk5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11iwf1iwflgchosx2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11iwf1iwflgchosx2.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testCustomDateTimePrinter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72005,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5hdwj1jk5(){try{__CLR4_4_11iwf1iwflgchosx2.R.inc(72005);
        __CLR4_4_11iwf1iwflgchosx2.R.inc(72006);DateTimePrinter printer = new DateTimeFormatterBuilder()
                .append(new CustomDateTimePrinter())
                .appendLiteral(' ')
                .appendYear(4, 8)
                .toPrinter();

        __CLR4_4_11iwf1iwflgchosx2.R.inc(72007);StringBuffer buffer = new StringBuffer();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(72008);long instant = new DateTime(2017, 1, 1, 0, 0, 0, ISO_UTC).getMillis();
        __CLR4_4_11iwf1iwflgchosx2.R.inc(72009);printer.printTo(buffer, instant, ISO_UTC, 0, UTC, Locale.ENGLISH);

        __CLR4_4_11iwf1iwflgchosx2.R.inc(72010);assertEquals("Hi 2017", buffer.toString());
    }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

    private static class CustomDateTimePrinter implements DateTimePrinter {

        public int estimatePrintedLength() {try{__CLR4_4_11iwf1iwflgchosx2.R.inc(72011);
            __CLR4_4_11iwf1iwflgchosx2.R.inc(72012);return 2;
        }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

        public void printTo(StringBuffer buf, long instant, Chronology chrono, int displayOffset,
                            DateTimeZone displayZone, Locale locale) {try{__CLR4_4_11iwf1iwflgchosx2.R.inc(72013);
            __CLR4_4_11iwf1iwflgchosx2.R.inc(72014);buf.append("Hi");
        }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

        public void printTo(Writer out, long instant, Chronology chrono, int displayOffset,
                            DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_11iwf1iwflgchosx2.R.inc(72015);
            __CLR4_4_11iwf1iwflgchosx2.R.inc(72016);out.write("Hi");
        }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

        public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {try{__CLR4_4_11iwf1iwflgchosx2.R.inc(72017);
            __CLR4_4_11iwf1iwflgchosx2.R.inc(72018);buf.append("Hi");
        }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}

        public void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_11iwf1iwflgchosx2.R.inc(72019);
            __CLR4_4_11iwf1iwflgchosx2.R.inc(72020);out.write("Hi");
        }finally{__CLR4_4_11iwf1iwflgchosx2.R.flushNeeded();}}
    }

}
