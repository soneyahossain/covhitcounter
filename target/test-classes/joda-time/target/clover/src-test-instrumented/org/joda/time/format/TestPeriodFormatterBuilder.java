/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2014 Stephen Colebourne
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

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is a Junit unit test for PeriodFormatterBuilder.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodFormatterBuilder {static class __CLR4_4_11mso1msolgchot2h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,77225,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final Period PERIOD = new Period(1, 2, 3, 4, 5, 6, 7, 8);
    private static final Period EMPTY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0);
    private static final Period YEAR_DAY_PERIOD = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
    private static final Period EMPTY_YEAR_DAY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.yearDayTime());
    private static final Period TIME_PERIOD = new Period(0, 0, 0, 0, 5, 6, 7, 8);
    private static final Period DATE_PERIOD = new Period(1, 2, 3, 4, 0, 0, 0, 0);
    private static final String NULL_STRING = null;
    private static final String[] NULL_STRING_ARRAY = null;

    //private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    //private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

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

    private PeriodFormatterBuilder builder;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11mso1msolgchot2h.R.inc(76200);
        __CLR4_4_11mso1msolgchot2h.R.inc(76201);TestPeriodFormatterBuilder TB = new TestPeriodFormatterBuilder();

        __CLR4_4_11mso1msolgchot2h.R.inc(76202);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76203);TB.testToFormatterPrinterParser();
        __CLR4_4_11mso1msolgchot2h.R.inc(76204);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76205);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76206);TB.testFormatYears();
        __CLR4_4_11mso1msolgchot2h.R.inc(76207);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76208);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76209);TB.testFormatMonths();
        __CLR4_4_11mso1msolgchot2h.R.inc(76210);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76211);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76212);TB.testFormatWeeks();
        __CLR4_4_11mso1msolgchot2h.R.inc(76213);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76214);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76215);TB.testFormatDays();
        __CLR4_4_11mso1msolgchot2h.R.inc(76216);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76217);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76218);TB.testFormatHours();
        __CLR4_4_11mso1msolgchot2h.R.inc(76219);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76220);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76221);TB.testFormatMinutes();
        __CLR4_4_11mso1msolgchot2h.R.inc(76222);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76223);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76224);TB.testFormatSeconds();
        __CLR4_4_11mso1msolgchot2h.R.inc(76225);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76226);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76227);TB.testFormatSecondsWithMillis();
        __CLR4_4_11mso1msolgchot2h.R.inc(76228);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76229);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76230);TB.testFormatSecondsWithOptionalMillis();
        __CLR4_4_11mso1msolgchot2h.R.inc(76231);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76232);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76233);TB.testFormatMillis();
        __CLR4_4_11mso1msolgchot2h.R.inc(76234);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76235);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76236);TB.testFormatMillis3Digit();
        __CLR4_4_11mso1msolgchot2h.R.inc(76237);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76238);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76239);TB.testFormatPrefixSimple1();
        __CLR4_4_11mso1msolgchot2h.R.inc(76240);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76241);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76242);TB.testFormatPrefixSimple2();
        __CLR4_4_11mso1msolgchot2h.R.inc(76243);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76244);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76245);TB.testFormatPrefixSimple3();
        __CLR4_4_11mso1msolgchot2h.R.inc(76246);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76247);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76248);TB.testFormatPrefixSimple4IgnoringPrefix();
        __CLR4_4_11mso1msolgchot2h.R.inc(76249);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76250);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76251);TB.testPluralAffixParseOrder();
        __CLR4_4_11mso1msolgchot2h.R.inc(76252);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76253);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76254);TB.testFormatPrefixPlural1();
        __CLR4_4_11mso1msolgchot2h.R.inc(76255);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76256);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76257);TB.testFormatPrefixPlural2();
        __CLR4_4_11mso1msolgchot2h.R.inc(76258);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76259);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76260);TB.testFormatPrefixPlural3();
        __CLR4_4_11mso1msolgchot2h.R.inc(76261);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76262);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76263);TB.testFormatPrefixPlural4IgnoringPrefix();
        __CLR4_4_11mso1msolgchot2h.R.inc(76264);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76265);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76266);TB.testRegExAffixParseOrder();
        __CLR4_4_11mso1msolgchot2h.R.inc(76267);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76268);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76269);TB.testFormatPrefixRegEx1();
        __CLR4_4_11mso1msolgchot2h.R.inc(76270);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76271);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76272);TB.testFormatPrefixRegEx2();
        __CLR4_4_11mso1msolgchot2h.R.inc(76273);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76274);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76275);TB.testFormatPrefixRegEx3();
        __CLR4_4_11mso1msolgchot2h.R.inc(76276);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76277);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76278);TB.testFormatPrefixRegEx4IgnoringPrefix();
        __CLR4_4_11mso1msolgchot2h.R.inc(76279);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76280);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76281);TB.testFormatPrefixComposite1();
        __CLR4_4_11mso1msolgchot2h.R.inc(76282);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76283);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76284);TB.testFormatSuffixSimple1();
        __CLR4_4_11mso1msolgchot2h.R.inc(76285);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76286);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76287);TB.testFormatSuffixSimple2();
        __CLR4_4_11mso1msolgchot2h.R.inc(76288);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76289);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76290);TB.testFormatSuffixSimple3();
        __CLR4_4_11mso1msolgchot2h.R.inc(76291);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76292);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76293);TB.testFormatSuffixSimple4();
        __CLR4_4_11mso1msolgchot2h.R.inc(76294);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76295);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76296);TB.testFormatPrefixSimple5IgnoringPrefix();
        __CLR4_4_11mso1msolgchot2h.R.inc(76297);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76298);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76299);TB.testFormatPrefixSimple6IgnoringPrefix();
        __CLR4_4_11mso1msolgchot2h.R.inc(76300);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76301);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76302);TB.testFormatSuffixPlural1();
        __CLR4_4_11mso1msolgchot2h.R.inc(76303);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76304);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76305);TB.testFormatSuffixPlural2();
        __CLR4_4_11mso1msolgchot2h.R.inc(76306);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76307);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76308);TB.testFormatSuffixPlural3();
        __CLR4_4_11mso1msolgchot2h.R.inc(76309);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76310);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76311);TB.testFormatSuffixPlural4();
        __CLR4_4_11mso1msolgchot2h.R.inc(76312);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76313);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76314);TB.testFormatSuffixPlural4IgnoringPrefix();
        __CLR4_4_11mso1msolgchot2h.R.inc(76315);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76316);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76317);TB.testFormatSuffixRegEx1();
        __CLR4_4_11mso1msolgchot2h.R.inc(76318);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76319);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76320);TB.testFormatSuffixRegEx2();
        __CLR4_4_11mso1msolgchot2h.R.inc(76321);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76322);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76323);TB.testFormatSuffixRegEx3();
        __CLR4_4_11mso1msolgchot2h.R.inc(76324);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76325);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76326);TB.testFormatSuffixRegEx4();
        __CLR4_4_11mso1msolgchot2h.R.inc(76327);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76328);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76329);TB.testFormatSuffixRegEx5IgnoringAffix();
        __CLR4_4_11mso1msolgchot2h.R.inc(76330);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76331);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76332);TB.testFormatSuffixComposite1();
        __CLR4_4_11mso1msolgchot2h.R.inc(76333);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76334);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76335);TB.testFormatSuffixComposite5IgnoringAffix();
        __CLR4_4_11mso1msolgchot2h.R.inc(76336);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76337);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76338);TB.testFormatPrefixSuffix();
        __CLR4_4_11mso1msolgchot2h.R.inc(76339);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76340);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76341);TB.testFormatSeparatorSimple();
        __CLR4_4_11mso1msolgchot2h.R.inc(76342);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76343);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76344);TB.testFormatSeparatorComplex();
        __CLR4_4_11mso1msolgchot2h.R.inc(76345);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76346);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76347);TB.testFormatSeparatorIfFieldsAfter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76348);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76349);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76350);TB.testFormatSeparatorIfFieldsBefore();
        __CLR4_4_11mso1msolgchot2h.R.inc(76351);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76352);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76353);TB.testFormatLiteral();
        __CLR4_4_11mso1msolgchot2h.R.inc(76354);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76355);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76356);TB.testFormatAppendFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76357);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76358);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76359);TB.testFormatMinDigits();
        __CLR4_4_11mso1msolgchot2h.R.inc(76360);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76361);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76362);TB.testFormatPrintZeroDefault();
        __CLR4_4_11mso1msolgchot2h.R.inc(76363);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76364);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76365);TB.testFormatPrintZeroRarelyLast();
        __CLR4_4_11mso1msolgchot2h.R.inc(76366);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76367);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76368);TB.testFormatPrintZeroRarelyFirst();
        __CLR4_4_11mso1msolgchot2h.R.inc(76369);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76370);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76371);TB.testFormatPrintZeroRarelyFirstYears();
        __CLR4_4_11mso1msolgchot2h.R.inc(76372);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76373);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76374);TB.testFormatPrintZeroRarelyFirstMonths();
        __CLR4_4_11mso1msolgchot2h.R.inc(76375);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76376);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76377);TB.testFormatPrintZeroRarelyFirstWeeks();
        __CLR4_4_11mso1msolgchot2h.R.inc(76378);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76379);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76380);TB.testFormatPrintZeroRarelyFirstDays();
        __CLR4_4_11mso1msolgchot2h.R.inc(76381);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76382);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76383);TB.testFormatPrintZeroRarelyFirstHours();
        __CLR4_4_11mso1msolgchot2h.R.inc(76384);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76385);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76386);TB.testFormatPrintZeroRarelyFirstMinutes();
        __CLR4_4_11mso1msolgchot2h.R.inc(76387);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76388);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76389);TB.testFormatPrintZeroRarelyFirstSeconds();
        __CLR4_4_11mso1msolgchot2h.R.inc(76390);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76391);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76392);TB.testFormatPrintZeroIfSupported();
        __CLR4_4_11mso1msolgchot2h.R.inc(76393);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76394);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76395);TB.testFormatPrintZeroAlways();
        __CLR4_4_11mso1msolgchot2h.R.inc(76396);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76397);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76398);TB.testFormatPrintZeroNever();
        __CLR4_4_11mso1msolgchot2h.R.inc(76399);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76400);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76401);TB.testFormatAppend_PrinterParser_null_null();
        __CLR4_4_11mso1msolgchot2h.R.inc(76402);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76403);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76404);TB.testFormatAppend_PrinterParser_Printer_null();
        __CLR4_4_11mso1msolgchot2h.R.inc(76405);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76406);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76407);TB.testFormatAppend_PrinterParser_null_Parser();
        __CLR4_4_11mso1msolgchot2h.R.inc(76408);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76409);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76410);TB.testFormatAppend_PrinterParser_PrinterParser();
        __CLR4_4_11mso1msolgchot2h.R.inc(76411);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76412);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76413);TB.testFormatAppend_PrinterParser_Printer_null_null_Parser();
        __CLR4_4_11mso1msolgchot2h.R.inc(76414);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76415);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76416);TB.testFormatAppend_PrinterParserThenClear();
        __CLR4_4_11mso1msolgchot2h.R.inc(76417);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76418);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76419);TB.testBug2495455();
        __CLR4_4_11mso1msolgchot2h.R.inc(76420);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76421);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76422);TB.testMonthsAndMinutesAreConsideredSeparateAndCaseIsNotIgnored();
        __CLR4_4_11mso1msolgchot2h.R.inc(76423);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76424);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76425);TB.testAppendSeparatorIfFieldsBeforeThrowsIllegalStateExceptionAndAppendPrefixTakingString();
        __CLR4_4_11mso1msolgchot2h.R.inc(76426);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76427);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76428);TB.testAppendSeparatorIfFieldsBeforeThrowsIllegalStateExceptionAndAppendSeparatorIfFieldsAfter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76429);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76430);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76431);TB.testAppendSeparatorTaking3ArgumentsWithEmptyStringAndNull();
        __CLR4_4_11mso1msolgchot2h.R.inc(76432);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76433);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76434);TB.testAppendSeparatorTaking3ArgumentsWithNullAndNonEmptyArray();
        __CLR4_4_11mso1msolgchot2h.R.inc(76435);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76436);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76437);TB.testAppendSuffixTaking2StringArraysThrowsIllegalStateException();
        __CLR4_4_11mso1msolgchot2h.R.inc(76438);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76439);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76440);TB.testAppendLiteralThrowsIllegalArgumentException();
        __CLR4_4_11mso1msolgchot2h.R.inc(76441);TB.tearDown();
        __CLR4_4_11mso1msolgchot2h.R.inc(76442);TB.setUp();
        __CLR4_4_11mso1msolgchot2h.R.inc(76443);TB.testAppendTakingPeriodFormatterThrowsIllegalArgumentException();
        __CLR4_4_11mso1msolgchot2h.R.inc(76444);TB.tearDown();

    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestPeriodFormatterBuilder.class);
    }

    public TestPeriodFormatterBuilder(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11mso1msolgchot2h.R.inc(76445);
        __CLR4_4_11mso1msolgchot2h.R.inc(76446);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_11mso1msolgchot2h.R.inc(76447);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11mso1msolgchot2h.R.inc(76448);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11mso1msolgchot2h.R.inc(76449);originalLocale = Locale.getDefault();
        __CLR4_4_11mso1msolgchot2h.R.inc(76450);DateTimeZone.setDefault(LONDON);
        __CLR4_4_11mso1msolgchot2h.R.inc(76451);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11mso1msolgchot2h.R.inc(76452);Locale.setDefault(Locale.UK);

        __CLR4_4_11mso1msolgchot2h.R.inc(76453);builder = new PeriodFormatterBuilder();
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11mso1msolgchot2h.R.inc(76454);
        __CLR4_4_11mso1msolgchot2h.R.inc(76455);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_11mso1msolgchot2h.R.inc(76456);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11mso1msolgchot2h.R.inc(76457);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11mso1msolgchot2h.R.inc(76458);Locale.setDefault(originalLocale);
        __CLR4_4_11mso1msolgchot2h.R.inc(76459);originalDateTimeZone = null;
        __CLR4_4_11mso1msolgchot2h.R.inc(76460);originalTimeZone = null;
        __CLR4_4_11mso1msolgchot2h.R.inc(76461);originalLocale = null;
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToFormatterPrinterParser() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16mxk3n1mzy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testToFormatterPrinterParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76462,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16mxk3n1mzy(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76462);
        __CLR4_4_11mso1msolgchot2h.R.inc(76463);builder.appendYears();
        __CLR4_4_11mso1msolgchot2h.R.inc(76464);assertNotNull(builder.toFormatter());
        __CLR4_4_11mso1msolgchot2h.R.inc(76465);assertNotNull(builder.toPrinter());
        __CLR4_4_11mso1msolgchot2h.R.inc(76466);assertNotNull(builder.toParser());
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormatYears() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ugs2xg1n03();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ugs2xg1n03(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76467);
        __CLR4_4_11mso1msolgchot2h.R.inc(76468);PeriodFormatter f = builder.appendYears().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76469);assertEquals("1", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76470);assertEquals(1, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76471);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76472);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76473);assertEquals("0", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76474);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76475);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatMonths() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ymy7nn1n0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ymy7nn1n0c(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76476);
        __CLR4_4_11mso1msolgchot2h.R.inc(76477);PeriodFormatter f = builder.appendMonths().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76478);assertEquals("2", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76479);assertEquals(1, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76480);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76481);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76482);assertEquals("0", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76483);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76484);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatWeeks() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9pejh1n0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76485,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9pejh1n0l(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76485);
        __CLR4_4_11mso1msolgchot2h.R.inc(76486);PeriodFormatter f = builder.appendWeeks().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76487);assertEquals("3", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76488);assertEquals(1, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76489);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76490);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76491);assertEquals("0", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76492);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76493);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatDays() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nd0dqx1n0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nd0dqx1n0u(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76494);
        __CLR4_4_11mso1msolgchot2h.R.inc(76495);PeriodFormatter f = builder.appendDays().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76496);assertEquals("4", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76497);assertEquals(1, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76498);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76499);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76500);assertEquals("0", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76501);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76502);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatHours() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yt94b71n13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yt94b71n13(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76503);
        __CLR4_4_11mso1msolgchot2h.R.inc(76504);PeriodFormatter f = builder.appendHours().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76505);assertEquals("5", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76506);assertEquals(1, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76507);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76508);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76509);assertEquals("0", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76510);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76511);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatMinutes() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ow22gz1n1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ow22gz1n1c(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76512);
        __CLR4_4_11mso1msolgchot2h.R.inc(76513);PeriodFormatter f = builder.appendMinutes().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76514);assertEquals("6", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76515);assertEquals(1, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76516);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76517);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76518);assertEquals("0", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76519);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76520);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatSeconds() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1chvy3n1n1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1chvy3n1n1l(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76521);
        __CLR4_4_11mso1msolgchot2h.R.inc(76522);PeriodFormatter f = builder.appendSeconds().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76523);assertEquals("7", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76524);assertEquals(1, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76525);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76526);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76527);assertEquals("0", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76528);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76529);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatSecondsWithMillis() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1berp1z1n1u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSecondsWithMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76530,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1berp1z1n1u(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76530);
        __CLR4_4_11mso1msolgchot2h.R.inc(76531);PeriodFormatter f = builder.appendSecondsWithMillis().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76532);Period p = new Period(0, 0, 0, 0, 0, 0, 7, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76533);assertEquals("7.000", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76534);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76535);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76536);p = new Period(0, 0, 0, 0, 0, 0, 7, 1);
        __CLR4_4_11mso1msolgchot2h.R.inc(76537);assertEquals("7.001", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76538);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76539);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76540);p = new Period(0, 0, 0, 0, 0, 0, 7, 999);
        __CLR4_4_11mso1msolgchot2h.R.inc(76541);assertEquals("7.999", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76542);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76543);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76544);p = new Period(0, 0, 0, 0, 0, 0, 7, 1000);
        __CLR4_4_11mso1msolgchot2h.R.inc(76545);assertEquals("8.000", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76546);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76547);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76548);p = new Period(0, 0, 0, 0, 0, 0, 7, 1001);
        __CLR4_4_11mso1msolgchot2h.R.inc(76549);assertEquals("8.001", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76550);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76551);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76552);p = new Period(0, 0, 0, 0, 0, 0, 7, -1);
        __CLR4_4_11mso1msolgchot2h.R.inc(76553);assertEquals("6.999", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76554);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76555);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76556);p = new Period(0, 0, 0, 0, 0, 0, -7, 1);
        __CLR4_4_11mso1msolgchot2h.R.inc(76557);assertEquals("-6.999", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76558);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76559);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76560);p = new Period(0, 0, 0, 0, 0, 0, -7, -1);
        __CLR4_4_11mso1msolgchot2h.R.inc(76561);assertEquals("-7.001", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76562);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76563);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76564);p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76565);assertEquals("0.000", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76566);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76567);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatSecondsWithOptionalMillis() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vw33131n2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSecondsWithOptionalMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76568,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vw33131n2w(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76568);
        __CLR4_4_11mso1msolgchot2h.R.inc(76569);PeriodFormatter f = builder.appendSecondsWithOptionalMillis().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76570);Period p = new Period(0, 0, 0, 0, 0, 0, 7, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76571);assertEquals("7", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76572);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76573);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76574);p = new Period(0, 0, 0, 0, 0, 0, 7, 1);
        __CLR4_4_11mso1msolgchot2h.R.inc(76575);assertEquals("7.001", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76576);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76577);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76578);p = new Period(0, 0, 0, 0, 0, 0, 7, 999);
        __CLR4_4_11mso1msolgchot2h.R.inc(76579);assertEquals("7.999", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76580);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76581);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76582);p = new Period(0, 0, 0, 0, 0, 0, 7, 1000);
        __CLR4_4_11mso1msolgchot2h.R.inc(76583);assertEquals("8", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76584);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76585);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76586);p = new Period(0, 0, 0, 0, 0, 0, 7, 1001);
        __CLR4_4_11mso1msolgchot2h.R.inc(76587);assertEquals("8.001", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76588);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76589);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76590);p = new Period(0, 0, 0, 0, 0, 0, 7, -1);
        __CLR4_4_11mso1msolgchot2h.R.inc(76591);assertEquals("6.999", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76592);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76593);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76594);p = new Period(0, 0, 0, 0, 0, 0, -7, 1);
        __CLR4_4_11mso1msolgchot2h.R.inc(76595);assertEquals("-6.999", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76596);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76597);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76598);p = new Period(0, 0, 0, 0, 0, 0, -7, -1);
        __CLR4_4_11mso1msolgchot2h.R.inc(76599);assertEquals("-7.001", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76600);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76601);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76602);p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76603);assertEquals("0", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76604);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76605);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatMillis() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lka3hy1n3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lka3hy1n3y(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76606);
        __CLR4_4_11mso1msolgchot2h.R.inc(76607);PeriodFormatter f = builder.appendMillis().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76608);assertEquals("8", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76609);assertEquals(1, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76610);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76611);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76612);assertEquals("0", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76613);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76614);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatMillis3Digit() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tulg9c1n47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMillis3Digit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tulg9c1n47(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76615);
        __CLR4_4_11mso1msolgchot2h.R.inc(76616);PeriodFormatter f = builder.appendMillis3Digit().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76617);assertEquals("008", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76618);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76619);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76620);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76621);assertEquals("000", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76622);assertEquals(3, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76623);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormatPrefixSimple1() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qnddlh1n4g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixSimple1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76624,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qnddlh1n4g(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76624);
        __CLR4_4_11mso1msolgchot2h.R.inc(76625);PeriodFormatter f = builder.appendPrefix("Years:").appendYears().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76626);assertEquals("Years:1", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76627);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76628);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76629);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76630);assertEquals("Years:0", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76631);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76632);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrefixSimple2() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nedet01n4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixSimple2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nedet01n4p(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76633);
        __CLR4_4_11mso1msolgchot2h.R.inc(76634);PeriodFormatter f = builder.appendPrefix("Hours:").appendHours().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76635);assertEquals("Hours:5", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76636);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76637);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76638);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76639);assertEquals("Hours:0", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76640);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76641);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrefixSimple3() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k5dg0j1n4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixSimple3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k5dg0j1n4y(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76642);
        __CLR4_4_11mso1msolgchot2h.R.inc(76643);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(76644);builder.appendPrefix(null);
            __CLR4_4_11mso1msolgchot2h.R.inc(76645);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrefixSimple4IgnoringPrefix() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vj472n1n52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixSimple4IgnoringPrefix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76646,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vj472n1n52(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76646);
        __CLR4_4_11mso1msolgchot2h.R.inc(76647);PeriodFormatter f = builder.appendPrefix("m").appendMinutes()
                .appendSeparator(" ").appendPrefix("ms").appendMillis().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76648);String oneMS = Period.millis(1).toString(f);
        __CLR4_4_11mso1msolgchot2h.R.inc(76649);assertEquals("ms1", oneMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76650);Period period = f.parsePeriod(oneMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76651);assertEquals(Period.millis(1), period);
        __CLR4_4_11mso1msolgchot2h.R.inc(76652);period = f.parsePeriod(oneMS.toUpperCase(Locale.ENGLISH));
        __CLR4_4_11mso1msolgchot2h.R.inc(76653);assertEquals(Period.millis(1), period);
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testPluralAffixParseOrder() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1koxhus1n5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testPluralAffixParseOrder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1koxhus1n5a(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76654);
        __CLR4_4_11mso1msolgchot2h.R.inc(76655);PeriodFormatter f = builder.appendDays().appendSuffix("day", "days").toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76656);String twoDays = Period.days(2).toString(f);
        __CLR4_4_11mso1msolgchot2h.R.inc(76657);Period period = f.parsePeriod(twoDays);
        __CLR4_4_11mso1msolgchot2h.R.inc(76658);assertEquals(Period.days(2), period);
        __CLR4_4_11mso1msolgchot2h.R.inc(76659);period = f.parsePeriod(twoDays.toUpperCase(Locale.ENGLISH));
        __CLR4_4_11mso1msolgchot2h.R.inc(76660);assertEquals(Period.days(2), period);
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrefixPlural1() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vrj2w71n5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixPlural1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76661,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vrj2w71n5h(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76661);
        __CLR4_4_11mso1msolgchot2h.R.inc(76662);PeriodFormatter f = builder.appendPrefix("Year:", "Years:").appendYears().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76663);assertEquals("Year:1", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76664);assertEquals(6, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76665);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76666);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76667);assertEquals("Years:0", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76668);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76669);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrefixPlural2() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sij43q1n5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixPlural2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sij43q1n5q(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76670);
        __CLR4_4_11mso1msolgchot2h.R.inc(76671);PeriodFormatter f = builder.appendPrefix("Hour:", "Hours:").appendHours().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76672);assertEquals("Hours:5", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76673);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76674);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76675);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76676);assertEquals("Hours:0", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76677);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76678);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrefixPlural3() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p9j5b91n5z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixPlural3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p9j5b91n5z(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76679);
        __CLR4_4_11mso1msolgchot2h.R.inc(76680);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(76681);builder.appendPrefix(null, "");
            __CLR4_4_11mso1msolgchot2h.R.inc(76682);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11mso1msolgchot2h.R.inc(76683);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(76684);builder.appendPrefix("", null);
            __CLR4_4_11mso1msolgchot2h.R.inc(76685);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11mso1msolgchot2h.R.inc(76686);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(76687);builder.appendPrefix(NULL_STRING, null);
            __CLR4_4_11mso1msolgchot2h.R.inc(76688);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrefixPlural4IgnoringPrefix() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wmgpod1n69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixPlural4IgnoringPrefix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wmgpod1n69(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76689);
        __CLR4_4_11mso1msolgchot2h.R.inc(76690);PeriodFormatter f = builder.appendPrefix("m", "ms").appendMinutes()
                .appendSeparator(" ").appendPrefix("mss", "msss").appendMillis().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76691);String oneMS = Period.millis(1).toString(f);
        __CLR4_4_11mso1msolgchot2h.R.inc(76692);assertEquals("mss1", oneMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76693);Period period = f.parsePeriod(oneMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76694);assertEquals(Period.millis(1), period);
        __CLR4_4_11mso1msolgchot2h.R.inc(76695);period = f.parsePeriod(oneMS.toUpperCase(Locale.ENGLISH));
        __CLR4_4_11mso1msolgchot2h.R.inc(76696);assertEquals(Period.millis(1), period);

        __CLR4_4_11mso1msolgchot2h.R.inc(76697);String twoMS = Period.millis(2).toString(f);
        __CLR4_4_11mso1msolgchot2h.R.inc(76698);assertEquals("msss2", twoMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76699);Period period2 = f.parsePeriod(twoMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76700);assertEquals(Period.millis(2), period2);
        __CLR4_4_11mso1msolgchot2h.R.inc(76701);period = f.parsePeriod(twoMS.toUpperCase(Locale.ENGLISH));
        __CLR4_4_11mso1msolgchot2h.R.inc(76702);assertEquals(Period.millis(2), period2);
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testRegExAffixParseOrder() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxklr11n6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testRegExAffixParseOrder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxklr11n6n(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76703);
        __CLR4_4_11mso1msolgchot2h.R.inc(76704);PeriodFormatter f = builder.appendDays()
                .appendSuffix(new String[]{"^1$", "[0-9]*"}, new String[]{"day", "days"}).toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76705);String twoDays = Period.days(2).toString(f);
        __CLR4_4_11mso1msolgchot2h.R.inc(76706);Period period = f.parsePeriod(twoDays);
        __CLR4_4_11mso1msolgchot2h.R.inc(76707);assertEquals(Period.days(2), period);
        __CLR4_4_11mso1msolgchot2h.R.inc(76708);period = f.parsePeriod(twoDays.toUpperCase(Locale.ENGLISH));
        __CLR4_4_11mso1msolgchot2h.R.inc(76709);assertEquals(Period.days(2), period);
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrefixRegEx1() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3tx701n6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixRegEx1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76710,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3tx701n6u(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76710);
        __CLR4_4_11mso1msolgchot2h.R.inc(76711);PeriodFormatter f = builder.appendPrefix(new String[]{"^1$", "^.*$"}, new String[]{"Year:", "Years:"}).appendYears()
                .toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76712);assertEquals("Year:1", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76713);assertEquals(6, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76714);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76715);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76716);assertEquals("Years:0", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76717);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76718);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrefixRegEx2() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ictvzh1n73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixRegEx2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ictvzh1n73(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76719);
        __CLR4_4_11mso1msolgchot2h.R.inc(76720);PeriodFormatter f = builder.appendPrefix(new String[]{"^1$", "^.*$"}, new String[]{"Hour:", "Hours:"}).appendHours()
                .toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76721);assertEquals("Hours:5", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76722);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76723);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76724);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76725);assertEquals("Hours:0", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76726);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76727);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrefixRegEx3() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lltury1n7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixRegEx3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76728,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lltury1n7c(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76728);
        __CLR4_4_11mso1msolgchot2h.R.inc(76729);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(76730);builder.appendPrefix(null, new String[0]);
            __CLR4_4_11mso1msolgchot2h.R.inc(76731);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11mso1msolgchot2h.R.inc(76732);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(76733);builder.appendPrefix(new String[0], null);
            __CLR4_4_11mso1msolgchot2h.R.inc(76734);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11mso1msolgchot2h.R.inc(76735);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(76736);builder.appendPrefix(NULL_STRING_ARRAY, null);
            __CLR4_4_11mso1msolgchot2h.R.inc(76737);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11mso1msolgchot2h.R.inc(76738);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(76739);builder.appendPrefix(new String[0], new String[0]);
            __CLR4_4_11mso1msolgchot2h.R.inc(76740);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11mso1msolgchot2h.R.inc(76741);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(76742);builder.appendPrefix(new String[1], new String[2]);
            __CLR4_4_11mso1msolgchot2h.R.inc(76743);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrefixRegEx4IgnoringPrefix() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m19v8w1n7s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixRegEx4IgnoringPrefix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m19v8w1n7s(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76744);
        __CLR4_4_11mso1msolgchot2h.R.inc(76745);PeriodFormatter f = builder
                .appendPrefix(new String[]{"^1$", "[0-9]*"}, new String[]{"m", "ms"}).appendMinutes()
                .appendSeparator(" ")
                .appendPrefix(new String[]{"^1$", "[0-9]*"}, new String[]{"mss", "msss"}).appendMillis()
                .toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76746);String oneMS = Period.millis(1).toString(f);
        __CLR4_4_11mso1msolgchot2h.R.inc(76747);assertEquals("mss1", oneMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76748);Period period = f.parsePeriod(oneMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76749);assertEquals(Period.millis(1), period);
        __CLR4_4_11mso1msolgchot2h.R.inc(76750);period = f.parsePeriod(oneMS.toUpperCase(Locale.ENGLISH));
        __CLR4_4_11mso1msolgchot2h.R.inc(76751);assertEquals(Period.millis(1), period);

        __CLR4_4_11mso1msolgchot2h.R.inc(76752);String twoMS = Period.millis(2).toString(f);
        __CLR4_4_11mso1msolgchot2h.R.inc(76753);assertEquals("msss2", twoMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76754);Period period2 = f.parsePeriod(twoMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76755);assertEquals(Period.millis(2), period2);
        __CLR4_4_11mso1msolgchot2h.R.inc(76756);period = f.parsePeriod(twoMS.toUpperCase(Locale.ENGLISH));
        __CLR4_4_11mso1msolgchot2h.R.inc(76757);assertEquals(Period.millis(2), period2);
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormatPrefixComposite1() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1id459o1n86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixComposite1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1id459o1n86(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76758);
        __CLR4_4_11mso1msolgchot2h.R.inc(76759);PeriodFormatter f = builder.appendPrefix("d")
                .appendPrefix("a", "ay")
                .appendPrefix(new String[]{"^1$", "^.*$"}, new String[]{"y:", "s:"})
                .appendDays().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76760);String oneMS = Period.days(2).toString(f);
        __CLR4_4_11mso1msolgchot2h.R.inc(76761);assertEquals("days:2", oneMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76762);Period period = f.parsePeriod(oneMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76763);assertEquals(Period.days(2), period);
        __CLR4_4_11mso1msolgchot2h.R.inc(76764);period = f.parsePeriod(oneMS.toUpperCase(Locale.ENGLISH));
        __CLR4_4_11mso1msolgchot2h.R.inc(76765);assertEquals(Period.days(2), period);
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormatSuffixSimple1() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ad0441n8e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixSimple1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ad0441n8e(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76766);
        __CLR4_4_11mso1msolgchot2h.R.inc(76767);PeriodFormatter f = builder.appendYears().appendSuffix(" years").toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76768);assertEquals("1 years", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76769);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76770);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76771);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76772);assertEquals("0 years", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76773);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76774);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatSuffixSimple2() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ymyod1n8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixSimple2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ymyod1n8n(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76775);
        __CLR4_4_11mso1msolgchot2h.R.inc(76776);PeriodFormatter f = builder.appendHours().appendSuffix(" hours").toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76777);assertEquals("5 hours", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76778);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76779);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76780);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76781);assertEquals("0 hours", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76782);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76783);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatSuffixSimple3() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_167mxgu1n8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixSimple3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_167mxgu1n8w(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76784);
        __CLR4_4_11mso1msolgchot2h.R.inc(76785);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(76786);builder.appendSuffix(null);
            __CLR4_4_11mso1msolgchot2h.R.inc(76787);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatSuffixSimple4() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19gmw9b1n90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixSimple4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76788,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19gmw9b1n90(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76788);
        __CLR4_4_11mso1msolgchot2h.R.inc(76789);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(76790);builder.appendSuffix(" hours");
            __CLR4_4_11mso1msolgchot2h.R.inc(76791);fail();
        } catch (IllegalStateException ex) {
        }
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrefixSimple5IgnoringPrefix() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wn0dtc1n94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixSimple5IgnoringPrefix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76792,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wn0dtc1n94(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76792);
        __CLR4_4_11mso1msolgchot2h.R.inc(76793);PeriodFormatter f = builder.appendMinutes().appendSuffix("m")
                .appendSeparator(" ").appendMillis().appendSuffix("ms").toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76794);String oneMS = Period.millis(1).toString(f);
        __CLR4_4_11mso1msolgchot2h.R.inc(76795);assertEquals("1ms", oneMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76796);Period period = f.parsePeriod(oneMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76797);assertEquals(Period.millis(1), period);
        __CLR4_4_11mso1msolgchot2h.R.inc(76798);period = f.parsePeriod(oneMS.toUpperCase(Locale.ENGLISH));
        __CLR4_4_11mso1msolgchot2h.R.inc(76799);assertEquals(Period.millis(1), period);
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrefixSimple6IgnoringPrefix() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xqwkk11n9c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixSimple6IgnoringPrefix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xqwkk11n9c(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76800);
        __CLR4_4_11mso1msolgchot2h.R.inc(76801);PeriodFormatter f = builder.appendMinutes().appendSuffix("M")
                .appendSeparator(" ").appendMillis().appendSuffix("ms").toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76802);String oneMS = Period.millis(1).toString(f);
        __CLR4_4_11mso1msolgchot2h.R.inc(76803);assertEquals("1ms", oneMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76804);Period period = f.parsePeriod(oneMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76805);assertEquals(Period.millis(1), period);
        __CLR4_4_11mso1msolgchot2h.R.inc(76806);period = f.parsePeriod(oneMS.toUpperCase(Locale.ENGLISH));
        __CLR4_4_11mso1msolgchot2h.R.inc(76807);assertEquals(Period.millis(1), period);
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatSuffixPlural1() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15eipeu1n9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76808,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15eipeu1n9k(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76808);
        __CLR4_4_11mso1msolgchot2h.R.inc(76809);PeriodFormatter f = builder.appendYears().appendSuffix(" year", " years").toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76810);assertEquals("1 year", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76811);assertEquals(6, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76812);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76813);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76814);assertEquals("0 years", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76815);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76816);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatSuffixPlural2() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_125iqmd1n9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_125iqmd1n9t(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76817);
        __CLR4_4_11mso1msolgchot2h.R.inc(76818);PeriodFormatter f = builder.appendHours().appendSuffix(" hour", " hours").toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76819);assertEquals("5 hours", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76820);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76821);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76822);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76823);assertEquals("0 hours", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76824);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76825);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatSuffixPlural3() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_113h8641na2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_113h8641na2(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76826);
        __CLR4_4_11mso1msolgchot2h.R.inc(76827);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(76828);builder.appendSuffix(null, "");
            __CLR4_4_11mso1msolgchot2h.R.inc(76829);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11mso1msolgchot2h.R.inc(76830);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(76831);builder.appendSuffix("", null);
            __CLR4_4_11mso1msolgchot2h.R.inc(76832);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11mso1msolgchot2h.R.inc(76833);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(76834);builder.appendSuffix(NULL_STRING, null);
            __CLR4_4_11mso1msolgchot2h.R.inc(76835);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatSuffixPlural4() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ch6yl1nac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ch6yl1nac(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76836);
        __CLR4_4_11mso1msolgchot2h.R.inc(76837);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(76838);builder.appendSuffix(" hour", " hours");
            __CLR4_4_11mso1msolgchot2h.R.inc(76839);fail();
        } catch (IllegalStateException ex) {
        }
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatSuffixPlural4IgnoringPrefix() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1on99qa1nag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural4IgnoringPrefix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1on99qa1nag(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76840);
        __CLR4_4_11mso1msolgchot2h.R.inc(76841);PeriodFormatter f = builder.appendMinutes().appendSuffix("m", "ms")
                .appendSeparator(" ").appendMillis().appendSuffix("mss", "msss").toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76842);String oneMS = Period.millis(1).toString(f);
        __CLR4_4_11mso1msolgchot2h.R.inc(76843);assertEquals("1mss", oneMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76844);Period period = f.parsePeriod(oneMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76845);assertEquals(Period.millis(1), period);
        __CLR4_4_11mso1msolgchot2h.R.inc(76846);period = f.parsePeriod(oneMS.toUpperCase(Locale.ENGLISH));
        __CLR4_4_11mso1msolgchot2h.R.inc(76847);assertEquals(Period.millis(1), period);

        __CLR4_4_11mso1msolgchot2h.R.inc(76848);String twoMS = Period.millis(2).toString(f);
        __CLR4_4_11mso1msolgchot2h.R.inc(76849);assertEquals("2msss", twoMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76850);Period period2 = f.parsePeriod(twoMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76851);assertEquals(Period.millis(2), period2);
        __CLR4_4_11mso1msolgchot2h.R.inc(76852);period = f.parsePeriod(twoMS.toUpperCase(Locale.ENGLISH));
        __CLR4_4_11mso1msolgchot2h.R.inc(76853);assertEquals(Period.millis(2), period);
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatSuffixRegEx1() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w5sjyt1nau();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixRegEx1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w5sjyt1nau(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76854);
        __CLR4_4_11mso1msolgchot2h.R.inc(76855);PeriodFormatter f = builder.appendYears().appendSuffix(new String[]{"^1$", "^2$"}, new String[]{" year", " years"})
                .toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76856);assertEquals("1 year", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76857);assertEquals(6, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76858);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76859);Period p2 = new Period(2, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76860);assertEquals("2 years", f.print(p2));
        __CLR4_4_11mso1msolgchot2h.R.inc(76861);assertEquals(7, f.getPrinter().calculatePrintedLength(p2, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76862);assertEquals(1, f.getPrinter().countFieldsToPrint(p2, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76863);Period p0 = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76864);assertEquals("0 years", f.print(p0));
        __CLR4_4_11mso1msolgchot2h.R.inc(76865);assertEquals(7, f.getPrinter().calculatePrintedLength(p0, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76866);assertEquals(1, f.getPrinter().countFieldsToPrint(p0, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatSuffixRegEx2() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1swsl6c1nb7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixRegEx2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1swsl6c1nb7(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76867);
        __CLR4_4_11mso1msolgchot2h.R.inc(76868);PeriodFormatter f = builder.appendHours().appendSuffix(new String[]{"^1$", "^2$"}, new String[]{" hour", " hours"}).toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76869);assertEquals("5 hours", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76870);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76871);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76872);Period p2 = new Period(0, 0, 0, 0, 2, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76873);assertEquals("2 hours", f.print(p2));
        __CLR4_4_11mso1msolgchot2h.R.inc(76874);assertEquals(7, f.getPrinter().calculatePrintedLength(p2, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76875);assertEquals(1, f.getPrinter().countFieldsToPrint(p2, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76876);Period p0 = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76877);assertEquals("0 hours", f.print(p0));
        __CLR4_4_11mso1msolgchot2h.R.inc(76878);assertEquals(7, f.getPrinter().calculatePrintedLength(p0, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76879);assertEquals(1, f.getPrinter().countFieldsToPrint(p0, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatSuffixRegEx3() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pnsmdv1nbk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixRegEx3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pnsmdv1nbk(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76880);
        __CLR4_4_11mso1msolgchot2h.R.inc(76881);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(76882);builder.appendSuffix(null, new String[0]);
            __CLR4_4_11mso1msolgchot2h.R.inc(76883);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11mso1msolgchot2h.R.inc(76884);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(76885);builder.appendSuffix(new String[0], null);
            __CLR4_4_11mso1msolgchot2h.R.inc(76886);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11mso1msolgchot2h.R.inc(76887);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(76888);builder.appendSuffix(NULL_STRING_ARRAY, null);
            __CLR4_4_11mso1msolgchot2h.R.inc(76889);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11mso1msolgchot2h.R.inc(76890);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(76891);builder.appendSuffix(new String[0], new String[0]);
            __CLR4_4_11mso1msolgchot2h.R.inc(76892);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11mso1msolgchot2h.R.inc(76893);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(76894);builder.appendSuffix(new String[1], new String[2]);
            __CLR4_4_11mso1msolgchot2h.R.inc(76895);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatSuffixRegEx4() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mesnle1nc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixRegEx4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76896,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mesnle1nc0(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76896);
        __CLR4_4_11mso1msolgchot2h.R.inc(76897);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(76898);builder.appendSuffix(new String[]{"^1$", "^.*$"}, new String[]{" hour", " hours"});
            __CLR4_4_11mso1msolgchot2h.R.inc(76899);fail();
        } catch (IllegalStateException ex) {
        }
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatSuffixRegEx5IgnoringAffix() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hnen41nc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixRegEx5IgnoringAffix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hnen41nc4(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76900);
        __CLR4_4_11mso1msolgchot2h.R.inc(76901);PeriodFormatter f = builder
                .appendMinutes().appendSuffix(new String[]{"^1$", "[0-9]*"}, new String[]{"m", "ms"})
                .appendSeparator(" ")
                .appendMillis().appendSuffix(new String[]{"^1$", "[0-9]*"}, new String[]{"mss", "msss"})
                .toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76902);String oneMS = Period.millis(1).toString(f);
        __CLR4_4_11mso1msolgchot2h.R.inc(76903);assertEquals("1mss", oneMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76904);Period period = f.parsePeriod(oneMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76905);assertEquals(Period.millis(1), period);
        __CLR4_4_11mso1msolgchot2h.R.inc(76906);period = f.parsePeriod(oneMS.toUpperCase(Locale.ENGLISH));
        __CLR4_4_11mso1msolgchot2h.R.inc(76907);assertEquals(Period.millis(1), period);

        __CLR4_4_11mso1msolgchot2h.R.inc(76908);String twoMS = Period.millis(2).toString(f);
        __CLR4_4_11mso1msolgchot2h.R.inc(76909);assertEquals("2msss", twoMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76910);Period period2 = f.parsePeriod(twoMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76911);assertEquals(Period.millis(2), period2);
        __CLR4_4_11mso1msolgchot2h.R.inc(76912);period = f.parsePeriod(twoMS.toUpperCase(Locale.ENGLISH));
        __CLR4_4_11mso1msolgchot2h.R.inc(76913);assertEquals(Period.millis(2), period);
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormatSuffixComposite1() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x4qg231nci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixComposite1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x4qg231nci(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76914);
        __CLR4_4_11mso1msolgchot2h.R.inc(76915);PeriodFormatter f = builder.appendDays().appendSuffix("d")
                .appendSuffix("a", "ay")
                .appendSuffix(new String[]{"^1$", "^.*$"}, new String[]{"y", "s"})
                .toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76916);String oneMS = Period.days(2).toString(f);
        __CLR4_4_11mso1msolgchot2h.R.inc(76917);assertEquals("2days", oneMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76918);Period period = f.parsePeriod(oneMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76919);assertEquals(Period.days(2), period);
        __CLR4_4_11mso1msolgchot2h.R.inc(76920);period = f.parsePeriod(oneMS.toUpperCase(Locale.ENGLISH));
        __CLR4_4_11mso1msolgchot2h.R.inc(76921);assertEquals(Period.days(2), period);
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatSuffixComposite5IgnoringAffix() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17woohs1ncq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixComposite5IgnoringAffix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17woohs1ncq(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76922);
        __CLR4_4_11mso1msolgchot2h.R.inc(76923);PeriodFormatter f = builder
                .appendMinutes().appendSuffix("m")
                .appendSeparator(" ")
                .appendMillis().appendSuffix("m").appendSuffix("s")
                .toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76924);String oneMS = Period.millis(1).toString(f);
        __CLR4_4_11mso1msolgchot2h.R.inc(76925);assertEquals("1ms", oneMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76926);Period period = f.parsePeriod(oneMS);
        __CLR4_4_11mso1msolgchot2h.R.inc(76927);assertEquals(Period.millis(1), period);
        __CLR4_4_11mso1msolgchot2h.R.inc(76928);period = f.parsePeriod(oneMS.toUpperCase(Locale.ENGLISH));
        __CLR4_4_11mso1msolgchot2h.R.inc(76929);assertEquals(Period.millis(1), period);
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormatPrefixSuffix() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1obbegd1ncy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixSuffix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1obbegd1ncy(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76930);
        __CLR4_4_11mso1msolgchot2h.R.inc(76931);PeriodFormatter f = builder.appendPrefix("P").appendYears().appendSuffix("Y").toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76932);assertEquals("P1Y", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76933);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76934);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76935);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11mso1msolgchot2h.R.inc(76936);assertEquals("P0Y", f.print(p));
        __CLR4_4_11mso1msolgchot2h.R.inc(76937);assertEquals(3, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76938);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormatSeparatorSimple() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ex7w171nd7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorSimple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ex7w171nd7(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76939);
        __CLR4_4_11mso1msolgchot2h.R.inc(76940);PeriodFormatter f = builder.appendYears().appendSeparator("T").appendHours().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76941);assertEquals("1T5", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76942);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76943);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76944);assertEquals("5", f.print(TIME_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76945);assertEquals(1, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76946);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76947);assertEquals("1", f.print(DATE_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76948);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76949);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatSeparatorComplex() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k7oz6j1ndi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorComplex",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k7oz6j1ndi(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76950);
        __CLR4_4_11mso1msolgchot2h.R.inc(76951);PeriodFormatter f = builder
                .appendYears().appendSeparator(", ", " and ")
                .appendHours().appendSeparator(", ", " and ")
                .appendMinutes().appendSeparator(", ", " and ")
                .toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76952);assertEquals("1, 5 and 6", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76953);assertEquals(10, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76954);assertEquals(3, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76955);assertEquals("5 and 6", f.print(TIME_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76956);assertEquals(7, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76957);assertEquals(2, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76958);assertEquals("1", f.print(DATE_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76959);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76960);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatSeparatorIfFieldsAfter() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rc8anl1ndt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorIfFieldsAfter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76961,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rc8anl1ndt(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76961);
        __CLR4_4_11mso1msolgchot2h.R.inc(76962);PeriodFormatter f = builder.appendYears().appendSeparatorIfFieldsAfter("T").appendHours().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76963);assertEquals("1T5", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76964);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76965);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76966);assertEquals("T5", f.print(TIME_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76967);assertEquals(2, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76968);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76969);assertEquals("1", f.print(DATE_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76970);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76971);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatSeparatorIfFieldsBefore() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a3f42g1ne4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorIfFieldsBefore",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76972,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a3f42g1ne4(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76972);
        __CLR4_4_11mso1msolgchot2h.R.inc(76973);PeriodFormatter f = builder.appendYears().appendSeparatorIfFieldsBefore("T").appendHours().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76974);assertEquals("1T5", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76975);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76976);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76977);assertEquals("5", f.print(TIME_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76978);assertEquals(1, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76979);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(76980);assertEquals("1T", f.print(DATE_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76981);assertEquals(2, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76982);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormatLiteral() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1exmiml1nef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatLiteral",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76983,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1exmiml1nef(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76983);
        __CLR4_4_11mso1msolgchot2h.R.inc(76984);PeriodFormatter f = builder.appendLiteral("HELLO").toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76985);assertEquals("HELLO", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76986);assertEquals(5, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76987);assertEquals(0, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatAppendFormatter() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rn8qwi1nek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppendFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rn8qwi1nek(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76988);
        __CLR4_4_11mso1msolgchot2h.R.inc(76989);PeriodFormatter base = builder.appendYears().appendLiteral("-").toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76990);PeriodFormatter f = new PeriodFormatterBuilder().append(base).appendYears().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76991);assertEquals("1-1", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76992);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76993);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatMinDigits() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wbkw0m1neq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMinDigits",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wbkw0m1neq(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76994);
        __CLR4_4_11mso1msolgchot2h.R.inc(76995);PeriodFormatter f = new PeriodFormatterBuilder().minimumPrintedDigits(4).appendYears().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(76996);assertEquals("0001", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(76997);assertEquals(4, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(76998);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormatPrintZeroDefault() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),76999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tmp0n01nev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroDefault",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76999,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tmp0n01nev(){try{__CLR4_4_11mso1msolgchot2h.R.inc(76999);
        __CLR4_4_11mso1msolgchot2h.R.inc(77000);PeriodFormatter f =
                new PeriodFormatterBuilder()
                        .appendYears().appendLiteral("-")
                        .appendMonths().appendLiteral("-")
                        .appendWeeks().appendLiteral("-")
                        .appendDays().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(77001);assertEquals("1-2-3-4", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77002);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77003);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(77004);assertEquals("---0", f.print(EMPTY_YEAR_DAY_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77005);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77006);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(77007);assertEquals("1---4", f.print(YEAR_DAY_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77008);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77009);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(77010);assertEquals("---0", f.print(EMPTY_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77011);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77012);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null));

        // test only last instance of same field is output
        __CLR4_4_11mso1msolgchot2h.R.inc(77013);f = new PeriodFormatterBuilder()
                .appendYears().appendLiteral("-")
                .appendYears().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(77014);assertEquals("-0", f.print(EMPTY_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77015);assertEquals(2, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77016);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrintZeroRarelyLast() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iewgeg1nfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyLast",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77017,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iewgeg1nfd(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77017);
        __CLR4_4_11mso1msolgchot2h.R.inc(77018);PeriodFormatter f =
                new PeriodFormatterBuilder()
                        .printZeroRarelyLast()
                        .appendYears().appendLiteral("-")
                        .appendMonths().appendLiteral("-")
                        .appendWeeks().appendLiteral("-")
                        .appendDays().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(77019);assertEquals("1-2-3-4", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77020);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77021);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(77022);assertEquals("---0", f.print(EMPTY_YEAR_DAY_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77023);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77024);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(77025);assertEquals("1---4", f.print(YEAR_DAY_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77026);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77027);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(77028);assertEquals("---0", f.print(EMPTY_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77029);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77030);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrintZeroRarelyFirst() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ohv241nfr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirst",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77031,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ohv241nfr(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77031);
        __CLR4_4_11mso1msolgchot2h.R.inc(77032);PeriodFormatter f =
                new PeriodFormatterBuilder()
                        .printZeroRarelyFirst()
                        .appendYears().appendLiteral("-")
                        .appendMonths().appendLiteral("-")
                        .appendWeeks().appendLiteral("-")
                        .appendDays().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(77033);assertEquals("1-2-3-4", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77034);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77035);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(77036);assertEquals("0---", f.print(EMPTY_YEAR_DAY_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77037);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77038);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(77039);assertEquals("1---4", f.print(YEAR_DAY_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77040);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77041);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(77042);assertEquals("0---", f.print(EMPTY_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77043);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77044);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrintZeroRarelyFirstYears() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4ejmg1ng5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirstYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4ejmg1ng5(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77045);
        __CLR4_4_11mso1msolgchot2h.R.inc(77046);PeriodFormatter f = new PeriodFormatterBuilder()
                .printZeroRarelyFirst()
                .appendYears().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(77047);assertEquals("0", f.print(EMPTY_PERIOD));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrintZeroRarelyFirstMonths() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k1ly0f1ng8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirstMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77048,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k1ly0f1ng8(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77048);
        __CLR4_4_11mso1msolgchot2h.R.inc(77049);PeriodFormatter f = new PeriodFormatterBuilder()
                .printZeroRarelyFirst()
                .appendMonths().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(77050);assertEquals("0", f.print(EMPTY_PERIOD));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrintZeroRarelyFirstWeeks() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpmtyp1ngb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirstWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77051,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpmtyp1ngb(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77051);
        __CLR4_4_11mso1msolgchot2h.R.inc(77052);PeriodFormatter f = new PeriodFormatterBuilder()
                .printZeroRarelyFirst()
                .appendWeeks().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(77053);assertEquals("0", f.print(EMPTY_PERIOD));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrintZeroRarelyFirstDays() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mmy54d1nge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirstDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77054,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mmy54d1nge(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77054);
        __CLR4_4_11mso1msolgchot2h.R.inc(77055);PeriodFormatter f = new PeriodFormatterBuilder()
                .printZeroRarelyFirst()
                .appendDays().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(77056);assertEquals("0", f.print(EMPTY_PERIOD));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrintZeroRarelyFirstHours() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cdbovz1ngh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirstHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cdbovz1ngh(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77057);
        __CLR4_4_11mso1msolgchot2h.R.inc(77058);PeriodFormatter f = new PeriodFormatterBuilder()
                .printZeroRarelyFirst()
                .appendHours().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(77059);assertEquals("0", f.print(EMPTY_PERIOD));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrintZeroRarelyFirstMinutes() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jy60cx1ngk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirstMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jy60cx1ngk(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77060);
        __CLR4_4_11mso1msolgchot2h.R.inc(77061);PeriodFormatter f = new PeriodFormatterBuilder()
                .printZeroRarelyFirst()
                .appendMinutes().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(77062);assertEquals("0", f.print(EMPTY_PERIOD));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrintZeroRarelyFirstSeconds() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wcc4q91ngn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirstSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wcc4q91ngn(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77063);
        __CLR4_4_11mso1msolgchot2h.R.inc(77064);PeriodFormatter f = new PeriodFormatterBuilder()
                .printZeroRarelyFirst()
                .appendSeconds().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(77065);assertEquals("0", f.print(EMPTY_PERIOD));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrintZeroIfSupported() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ozv3nw1ngq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroIfSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ozv3nw1ngq(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77066);
        __CLR4_4_11mso1msolgchot2h.R.inc(77067);PeriodFormatter f =
                new PeriodFormatterBuilder()
                        .printZeroIfSupported()
                        .appendYears().appendLiteral("-")
                        .appendMonths().appendLiteral("-")
                        .appendWeeks().appendLiteral("-")
                        .appendDays().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(77068);assertEquals("1-2-3-4", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77069);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77070);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(77071);assertEquals("0---0", f.print(EMPTY_YEAR_DAY_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77072);assertEquals(5, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77073);assertEquals(2, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(77074);assertEquals("1---4", f.print(YEAR_DAY_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77075);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77076);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(77077);assertEquals("0-0-0-0", f.print(EMPTY_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77078);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77079);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrintZeroAlways() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15286ji1nh4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroAlways",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77080,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15286ji1nh4(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77080);
        __CLR4_4_11mso1msolgchot2h.R.inc(77081);PeriodFormatter f =
                new PeriodFormatterBuilder()
                        .printZeroAlways()
                        .appendYears().appendLiteral("-")
                        .appendMonths().appendLiteral("-")
                        .appendWeeks().appendLiteral("-")
                        .appendDays().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(77082);assertEquals("1-2-3-4", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77083);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77084);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(77085);assertEquals("0-0-0-0", f.print(EMPTY_YEAR_DAY_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77086);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77087);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(77088);assertEquals("1-0-0-4", f.print(YEAR_DAY_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77089);assertEquals(7, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77090);assertEquals(4, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(77091);assertEquals("0-0-0-0", f.print(EMPTY_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77092);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77093);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatPrintZeroNever() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18texk71nhi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroNever",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18texk71nhi(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77094);
        __CLR4_4_11mso1msolgchot2h.R.inc(77095);PeriodFormatter f =
                new PeriodFormatterBuilder()
                        .printZeroNever()
                        .appendYears().appendLiteral("-")
                        .appendMonths().appendLiteral("-")
                        .appendWeeks().appendLiteral("-")
                        .appendDays().toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(77096);assertEquals("1-2-3-4", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77097);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77098);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(77099);assertEquals("---", f.print(EMPTY_YEAR_DAY_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77100);assertEquals(3, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77101);assertEquals(0, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(77102);assertEquals("1---4", f.print(YEAR_DAY_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77103);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77104);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));

        __CLR4_4_11mso1msolgchot2h.R.inc(77105);assertEquals("---", f.print(EMPTY_PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77106);assertEquals(3, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null));
        __CLR4_4_11mso1msolgchot2h.R.inc(77107);assertEquals(0, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormatAppend_PrinterParser_null_null() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17oc98c1nhw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_null_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17oc98c1nhw(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77108);
        __CLR4_4_11mso1msolgchot2h.R.inc(77109);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(77110);new PeriodFormatterBuilder().append(null, null);
            __CLR4_4_11mso1msolgchot2h.R.inc(77111);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatAppend_PrinterParser_Printer_null() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kkv8x71ni0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_Printer_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kkv8x71ni0(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77112);
        __CLR4_4_11mso1msolgchot2h.R.inc(77113);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter();
        __CLR4_4_11mso1msolgchot2h.R.inc(77114);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).appendMonths();
        __CLR4_4_11mso1msolgchot2h.R.inc(77115);assertNotNull(bld.toPrinter());
        __CLR4_4_11mso1msolgchot2h.R.inc(77116);assertNull(bld.toParser());

        __CLR4_4_11mso1msolgchot2h.R.inc(77117);PeriodFormatter f = bld.toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(77118);assertEquals("1-2", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77119);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(77120);f.parsePeriod("1-2");
            __CLR4_4_11mso1msolgchot2h.R.inc(77121);fail();
        } catch (UnsupportedOperationException ex) {
        }
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatAppend_PrinterParser_null_Parser() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14orkho1nia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_null_Parser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14orkho1nia(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77122);
        __CLR4_4_11mso1msolgchot2h.R.inc(77123);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser();
        __CLR4_4_11mso1msolgchot2h.R.inc(77124);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(null, parser).appendMonths();
        __CLR4_4_11mso1msolgchot2h.R.inc(77125);assertNull(bld.toPrinter());
        __CLR4_4_11mso1msolgchot2h.R.inc(77126);assertNotNull(bld.toParser());

        __CLR4_4_11mso1msolgchot2h.R.inc(77127);PeriodFormatter f = bld.toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(77128);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(77129);f.print(PERIOD);
            __CLR4_4_11mso1msolgchot2h.R.inc(77130);fail();
        } catch (UnsupportedOperationException ex) {
        }
        __CLR4_4_11mso1msolgchot2h.R.inc(77131);assertEquals(new Period(0, 2, 1, 0, 0, 0, 0, 0), f.parsePeriod("1-2"));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatAppend_PrinterParser_PrinterParser() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_149ksjm1nik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_PrinterParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_149ksjm1nik(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77132);
        __CLR4_4_11mso1msolgchot2h.R.inc(77133);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter();
        __CLR4_4_11mso1msolgchot2h.R.inc(77134);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser();
        __CLR4_4_11mso1msolgchot2h.R.inc(77135);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, parser).appendMonths();
        __CLR4_4_11mso1msolgchot2h.R.inc(77136);assertNotNull(bld.toPrinter());
        __CLR4_4_11mso1msolgchot2h.R.inc(77137);assertNotNull(bld.toParser());

        __CLR4_4_11mso1msolgchot2h.R.inc(77138);PeriodFormatter f = bld.toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(77139);assertEquals("1-2", f.print(PERIOD));
        __CLR4_4_11mso1msolgchot2h.R.inc(77140);assertEquals(new Period(0, 2, 1, 0, 0, 0, 0, 0), f.parsePeriod("1-2"));
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatAppend_PrinterParser_Printer_null_null_Parser() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pks5711nit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_Printer_null_null_Parser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pks5711nit(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77141);
        __CLR4_4_11mso1msolgchot2h.R.inc(77142);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter();
        __CLR4_4_11mso1msolgchot2h.R.inc(77143);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser();
        __CLR4_4_11mso1msolgchot2h.R.inc(77144);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).append(null, parser);
        __CLR4_4_11mso1msolgchot2h.R.inc(77145);assertNull(bld.toPrinter());
        __CLR4_4_11mso1msolgchot2h.R.inc(77146);assertNull(bld.toParser());

        __CLR4_4_11mso1msolgchot2h.R.inc(77147);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(77148);bld.toFormatter();
            __CLR4_4_11mso1msolgchot2h.R.inc(77149);fail();
        } catch (IllegalStateException ex) {
        }
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testFormatAppend_PrinterParserThenClear() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wl76h21nj2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParserThenClear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wl76h21nj2(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77150);
        __CLR4_4_11mso1msolgchot2h.R.inc(77151);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter();
        __CLR4_4_11mso1msolgchot2h.R.inc(77152);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser();
        __CLR4_4_11mso1msolgchot2h.R.inc(77153);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).append(null, parser);
        __CLR4_4_11mso1msolgchot2h.R.inc(77154);assertNull(bld.toPrinter());
        __CLR4_4_11mso1msolgchot2h.R.inc(77155);assertNull(bld.toParser());
        __CLR4_4_11mso1msolgchot2h.R.inc(77156);bld.clear();
        __CLR4_4_11mso1msolgchot2h.R.inc(77157);bld.appendMonths();
        __CLR4_4_11mso1msolgchot2h.R.inc(77158);assertNotNull(bld.toPrinter());
        __CLR4_4_11mso1msolgchot2h.R.inc(77159);assertNotNull(bld.toParser());
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testBug2495455() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qw1fwl1njc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testBug2495455",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77160,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qw1fwl1njc(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77160);
        __CLR4_4_11mso1msolgchot2h.R.inc(77161);PeriodFormatter pfmt1 = new PeriodFormatterBuilder()
                .appendLiteral("P")
                .appendYears()
                .appendSuffix("Y")
                .appendMonths()
                .appendSuffix("M")
                .appendWeeks()
                .appendSuffix("W")
                .appendDays()
                .appendSuffix("D")
                .appendSeparatorIfFieldsAfter("T")
                .appendHours()
                .appendSuffix("H")
                .appendMinutes()
                .appendSuffix("M")
                .appendSecondsWithOptionalMillis()
                .appendSuffix("S")
                .toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(77162);PeriodFormatter pfmt2 = new PeriodFormatterBuilder()
                .append(ISOPeriodFormat.standard())
                .toFormatter();
        __CLR4_4_11mso1msolgchot2h.R.inc(77163);pfmt1.parsePeriod("PT1003199059S");
        __CLR4_4_11mso1msolgchot2h.R.inc(77164);pfmt2.parsePeriod("PT1003199059S");
        __CLR4_4_11mso1msolgchot2h.R.inc(77165);pfmt2.parsePeriod("pt1003199059S");
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testMonthsAndMinutesAreConsideredSeparateAndCaseIsNotIgnored() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5yya31nji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testMonthsAndMinutesAreConsideredSeparateAndCaseIsNotIgnored",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5yya31nji(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77166);
        __CLR4_4_11mso1msolgchot2h.R.inc(77167);PeriodFormatter formatter = builder
                .appendMonths().appendSuffix("M").appendSeparator(" ")
                .appendMinutes().appendSuffix("m").appendSeparator(" ")
                .toFormatter();

        __CLR4_4_11mso1msolgchot2h.R.inc(77168);String oneMonth = Period.months(1).toString(formatter);
        __CLR4_4_11mso1msolgchot2h.R.inc(77169);assertEquals("1M", oneMonth);
        __CLR4_4_11mso1msolgchot2h.R.inc(77170);Period period = formatter.parsePeriod(oneMonth);
        __CLR4_4_11mso1msolgchot2h.R.inc(77171);assertEquals(Period.months(1), period);
        __CLR4_4_11mso1msolgchot2h.R.inc(77172);String oneMinute = Period.minutes(1).toString(formatter);
        __CLR4_4_11mso1msolgchot2h.R.inc(77173);assertEquals("1m", oneMinute);
        __CLR4_4_11mso1msolgchot2h.R.inc(77174);period = formatter.parsePeriod(oneMinute);
        __CLR4_4_11mso1msolgchot2h.R.inc(77175);assertEquals(Period.minutes(1), period);
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testAppendSeparatorIfFieldsBeforeThrowsIllegalStateExceptionAndAppendPrefixTakingString() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14p1ovu1njs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testAppendSeparatorIfFieldsBeforeThrowsIllegalStateExceptionAndAppendPrefixTakingString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14p1ovu1njs(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77176);
        __CLR4_4_11mso1msolgchot2h.R.inc(77177);PeriodFormatterBuilder periodFormatterBuilder = new PeriodFormatterBuilder();
        __CLR4_4_11mso1msolgchot2h.R.inc(77178);periodFormatterBuilder.appendPrefix("=9Z/])WG");

        __CLR4_4_11mso1msolgchot2h.R.inc(77179);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(77180);periodFormatterBuilder.appendSeparatorIfFieldsBefore("=9Z/])WG");
            __CLR4_4_11mso1msolgchot2h.R.inc(77181);fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            __CLR4_4_11mso1msolgchot2h.R.inc(77182);assertEquals(PeriodFormatterBuilder.class.getName(), e.getStackTrace()[0].getClassName());
        }
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testAppendSeparatorIfFieldsBeforeThrowsIllegalStateExceptionAndAppendSeparatorIfFieldsAfter() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1utnurk1njz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testAppendSeparatorIfFieldsBeforeThrowsIllegalStateExceptionAndAppendSeparatorIfFieldsAfter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77183,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1utnurk1njz(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77183);
        __CLR4_4_11mso1msolgchot2h.R.inc(77184);PeriodFormatterBuilder periodFormatterBuilder = new PeriodFormatterBuilder();
        __CLR4_4_11mso1msolgchot2h.R.inc(77185);periodFormatterBuilder.appendSeparatorIfFieldsAfter("3xmZ\"*'Q={=");

        __CLR4_4_11mso1msolgchot2h.R.inc(77186);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(77187);periodFormatterBuilder.appendSeparatorIfFieldsBefore("3xmZ\"*'Q={=");
            __CLR4_4_11mso1msolgchot2h.R.inc(77188);fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            __CLR4_4_11mso1msolgchot2h.R.inc(77189);assertEquals(PeriodFormatterBuilder.class.getName(), e.getStackTrace()[0].getClassName());
        }
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testAppendSeparatorTaking3ArgumentsWithEmptyStringAndNull() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xnvic31nk6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testAppendSeparatorTaking3ArgumentsWithEmptyStringAndNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xnvic31nk6(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77190);
        __CLR4_4_11mso1msolgchot2h.R.inc(77191);PeriodFormatterBuilder periodFormatterBuilder = new PeriodFormatterBuilder();

        __CLR4_4_11mso1msolgchot2h.R.inc(77192);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(77193);periodFormatterBuilder.appendSeparator("", null, null);
            __CLR4_4_11mso1msolgchot2h.R.inc(77194);fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            __CLR4_4_11mso1msolgchot2h.R.inc(77195);assertEquals(PeriodFormatterBuilder.class.getName(), e.getStackTrace()[0].getClassName());
        }
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testAppendSeparatorTaking3ArgumentsWithNullAndNonEmptyArray() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19u3tpy1nkc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testAppendSeparatorTaking3ArgumentsWithNullAndNonEmptyArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19u3tpy1nkc(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77196);
        __CLR4_4_11mso1msolgchot2h.R.inc(77197);PeriodFormatterBuilder periodFormatterBuilder = new PeriodFormatterBuilder();
        __CLR4_4_11mso1msolgchot2h.R.inc(77198);String[] stringArray = new String[3];

        __CLR4_4_11mso1msolgchot2h.R.inc(77199);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(77200);periodFormatterBuilder.appendSeparator(null, null, stringArray);
            __CLR4_4_11mso1msolgchot2h.R.inc(77201);fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            __CLR4_4_11mso1msolgchot2h.R.inc(77202);assertEquals(PeriodFormatterBuilder.class.getName(), e.getStackTrace()[0].getClassName());
        }
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testAppendSuffixTaking2StringArraysThrowsIllegalStateException() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dbji261nkj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testAppendSuffixTaking2StringArraysThrowsIllegalStateException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dbji261nkj(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77203);
        __CLR4_4_11mso1msolgchot2h.R.inc(77204);PeriodFormatterBuilder periodFormatterBuilder = new PeriodFormatterBuilder();
        __CLR4_4_11mso1msolgchot2h.R.inc(77205);String[] stringArray = new String[1];
        __CLR4_4_11mso1msolgchot2h.R.inc(77206);stringArray[0] = "8io`#&*f6&";
        __CLR4_4_11mso1msolgchot2h.R.inc(77207);periodFormatterBuilder.appendSecondsWithMillis();
        __CLR4_4_11mso1msolgchot2h.R.inc(77208);periodFormatterBuilder.appendSeparator("8io`#&*f6&", "NW7");

        __CLR4_4_11mso1msolgchot2h.R.inc(77209);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(77210);periodFormatterBuilder.appendSuffix(stringArray, stringArray);
            __CLR4_4_11mso1msolgchot2h.R.inc(77211);fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            __CLR4_4_11mso1msolgchot2h.R.inc(77212);assertEquals(PeriodFormatterBuilder.class.getName(), e.getStackTrace()[0].getClassName());
        }
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testAppendLiteralThrowsIllegalArgumentException() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xu3cod1nkt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testAppendLiteralThrowsIllegalArgumentException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xu3cod1nkt(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77213);
        __CLR4_4_11mso1msolgchot2h.R.inc(77214);PeriodFormatterBuilder periodFormatterBuilder = new PeriodFormatterBuilder();

        __CLR4_4_11mso1msolgchot2h.R.inc(77215);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(77216);periodFormatterBuilder.appendLiteral(null);
            __CLR4_4_11mso1msolgchot2h.R.inc(77217);fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            __CLR4_4_11mso1msolgchot2h.R.inc(77218);assertEquals(PeriodFormatterBuilder.class.getName(), e.getStackTrace()[0].getClassName());
        }
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

    @Test
    public void testAppendTakingPeriodFormatterThrowsIllegalArgumentException() {__CLR4_4_11mso1msolgchot2h.R.globalSliceStart(getClass().getName(),77219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y7aprr1nkz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mso1msolgchot2h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mso1msolgchot2h.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testAppendTakingPeriodFormatterThrowsIllegalArgumentException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y7aprr1nkz(){try{__CLR4_4_11mso1msolgchot2h.R.inc(77219);
        __CLR4_4_11mso1msolgchot2h.R.inc(77220);PeriodFormatterBuilder periodFormatterBuilder = new PeriodFormatterBuilder();

        __CLR4_4_11mso1msolgchot2h.R.inc(77221);try {
            __CLR4_4_11mso1msolgchot2h.R.inc(77222);periodFormatterBuilder.append(null);
            __CLR4_4_11mso1msolgchot2h.R.inc(77223);fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            __CLR4_4_11mso1msolgchot2h.R.inc(77224);assertEquals(PeriodFormatterBuilder.class.getName(), e.getStackTrace()[0].getClassName());
        }
    }finally{__CLR4_4_11mso1msolgchot2h.R.flushNeeded();}}

}
