/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2015 Stephen Colebourne
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

import java.util.Date;
import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.MockZeroNullIntegerConverter;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 */
public class TestDateTime_Constructors {static class __CLR4_4_1mk5mk5lgchorq7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,29819,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
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

    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) throws Throwable {try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29237);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29238);TestDateTime_Constructors TB = new TestDateTime_Constructors();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29239);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29240);TB.testTest();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29241);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29242);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29243);TB.test_now();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29244);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29245);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29246);TB.test_now_DateTimeZone();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29247);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29248);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29249);TB.test_now_nullDateTimeZone();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29250);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29251);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29252);TB.test_now_Chronology();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29253);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29254);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29255);TB.test_now_nullChronology();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29256);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29257);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29258);TB.testParse_noFormatter();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29259);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29260);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29261);TB.testParse_noFormatter_vs_constructor_noOffset();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29262);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29263);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29264);TB.testParse_noFormatter_vs_constructor_correctOffset();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29265);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29266);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29267);TB.testParse_formatter();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29268);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29269);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29270);TB.testConstructor();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29271);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29272);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29273);TB.testConstructor_DateTimeZone();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29274);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29275);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29276);TB.testConstructor_nullDateTimeZone();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29277);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29278);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29279);TB.testConstructor_Chronology();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29280);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29281);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29282);TB.testConstructor_nullChronology();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29283);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29284);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29285);TB.testConstructor_long1();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29286);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29287);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29288);TB.testConstructor_long2();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29289);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29290);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29291);TB.testConstructor_long1_DateTimeZone();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29292);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29293);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29294);TB.testConstructor_long2_DateTimeZone();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29295);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29296);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29297);TB.testConstructor_long_nullDateTimeZone();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29298);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29299);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29300);TB.testConstructor_long1_Chronology();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29301);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29302);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29303);TB.testConstructor_long2_Chronology();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29304);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29305);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29306);TB.testConstructor_long_nullChronology();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29307);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29308);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29309);TB.testConstructor_Object();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29310);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29311);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29312);TB.testConstructor_invalidObject();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29313);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29314);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29315);TB.testConstructor_nullObject();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29316);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29317);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29318);TB.testConstructor_badconverterObject();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29319);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29320);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29321);TB.testConstructor_ObjectString1();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29322);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29323);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29324);TB.testConstructor_ObjectString2();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29325);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29326);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29327);TB.testConstructor_ObjectString3();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29328);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29329);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29330);TB.testConstructor_ObjectString4();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29331);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29332);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29333);TB.testConstructor_ObjectString5();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29334);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29335);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29336);TB.testConstructor_ObjectString6();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29337);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29338);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29339);TB.testConstructor_ObjectString7();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29340);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29341);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29342);TB.testConstructor_ObjectStringEx1();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29343);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29344);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29345);TB.testConstructor_ObjectStringEx2();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29346);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29347);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29348);TB.testConstructor_Object_DateTimeZone();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29349);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29350);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29351);TB.testConstructor_invalidObject_DateTimeZone();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29352);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29353);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29354);TB.testConstructor_nullObject_DateTimeZone();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29355);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29356);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29357);TB.testConstructor_Object_nullDateTimeZone();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29358);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29359);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29360);TB.testConstructor_nullObject_nullDateTimeZone();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29361);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29362);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29363);TB.testConstructor_badconverterObject_DateTimeZone();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29364);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29365);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29366);TB.testConstructor_Object_Chronology();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29367);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29368);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29369);TB.testConstructor_invalidObject_Chronology();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29370);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29371);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29372);TB.testConstructor_nullObject_Chronology();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29373);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29374);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29375);TB.testConstructor_Object_nullChronology();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29376);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29377);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29378);TB.testConstructor_nullObject_nullChronology();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29379);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29380);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29381);TB.testConstructor_badconverterObject_Chronology();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29382);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29383);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29384);TB.testConstructor_int_int_int_int_int();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29385);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29386);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29387);TB.testConstructor_int_int_int_int_int_DateTimeZone();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29388);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29389);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29390);TB.testConstructor_int_int_int_int_int_nullDateTimeZone();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29391);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29392);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29393);TB.testConstructor_int_int_int_int_int_Chronology();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29394);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29395);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29396);TB.testConstructor_int_int_int_int_int_nullChronology();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29397);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29398);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29399);TB.testConstructor_int_int_int_int_int_int();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29400);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29401);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29402);TB.testConstructor_int_int_int_int_int_int_DateTimeZone();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29403);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29404);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29405);TB.testConstructor_int_int_int_int_int_int_nullDateTimeZone();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29406);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29407);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29408);TB.testConstructor_int_int_int_int_int_int_Chronology();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29409);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29410);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29411);TB.testConstructor_int_int_int_int_int_int_nullChronology();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29412);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29413);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29414);TB.testConstructor_int_int_int_int_int_int_int();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29415);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29416);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29417);TB.testConstructor_int_int_int_int_int_int_int_DateTimeZone();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29418);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29419);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29420);TB.testConstructor_int_int_int_int_int_int_int_nullDateTimeZone();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29421);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29422);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29423);TB.testConstructor_int_int_int_int_int_int_int_Chronology();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29424);TB.tearDown();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29425);TB.setUp();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29426);TB.testConstructor_int_int_int_int_int_int_int_nullChronology();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29427);TB.tearDown();

    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestDateTime_Constructors.class);
    }

    public TestDateTime_Constructors(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29428);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29429);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29430);zone = DateTimeZone.getDefault();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29431);locale = Locale.getDefault();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29432);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29433);java.util.TimeZone.setDefault(LONDON.toTimeZone());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29434);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29435);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29436);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29437);DateTimeZone.setDefault(zone);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29438);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29439);Locale.setDefault(locale);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29440);zone = null;
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjmpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29441,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjmpt(){try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29441);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29442);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29443);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29444);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test now ()
     */
    @Test
    public void test_now() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qxg0mpx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qxg0mpx() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29445);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29446);DateTime test = DateTime.now();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29447);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29448);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test now (DateTimeZone)
     */
    @Test
    public void test_now_DateTimeZone() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yqbptomq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yqbptomq1() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29449);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29450);DateTime test = DateTime.now(PARIS);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29451);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29452);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test now (DateTimeZone=null)
     */
    @Test
    public void test_now_nullDateTimeZone() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1odm0k5mq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1odm0k5mq5() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29453);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29454);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29455);DateTime.now((DateTimeZone) null);
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29456);fail();
        } catch (NullPointerException ex) {
        }
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test now (Chronology)
     */
    @Test
    public void test_now_Chronology() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16n9ve3mq9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29457,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16n9ve3mq9() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29457);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29458);DateTime test = DateTime.now(GregorianChronology.getInstance());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29459);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29460);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test now (Chronology=null)
     */
    @Test
    public void test_now_nullChronology() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ge4g1wmqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ge4g1wmqd() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29461);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29462);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29463);DateTime.now((Chronology) null);
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29464);fail();
        } catch (NullPointerException ex) {
        }
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqvimqh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29465,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqvimqh() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29465);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29466);assertEquals(new DateTime(2010, 6, 30, 1, 20, ISOChronology.getInstance(DateTimeZone.forOffsetHours(2))), DateTime.parse("2010-06-30T01:20+02:00"));
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29467);assertEquals(new DateTime(2010, 1, 2, 14, 50, ISOChronology.getInstance(LONDON)), DateTime.parse("2010-002T14:50"));
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    @Test
    public void testParse_noFormatter_vs_constructor_noOffset() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vak53imqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testParse_noFormatter_vs_constructor_noOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vak53imqk() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29468);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29469);DateTime parsed = DateTime.parse("2010-06-30T01:20");
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29470);DateTime constructed = new DateTime("2010-06-30T01:20");
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29471);assertEquals(constructed, parsed);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29472);assertEquals(DateTimeZone.getDefault(), constructed.getZone());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29473);assertEquals(DateTimeZone.getDefault(), parsed.getZone());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    @Test
    public void testParse_noFormatter_vs_constructor_correctOffset() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v8ya7jmqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testParse_noFormatter_vs_constructor_correctOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29474,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v8ya7jmqq() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29474);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29475);DateTime parsed = DateTime.parse("2010-06-30T01:20+01:00");
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29476);DateTime constructed = new DateTime("2010-06-30T01:20+01:00");
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29477);assertEquals(DateTimeZone.getDefault(), constructed.getZone());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29478);assertEquals(DateTimeZone.forOffsetHours(1), parsed.getZone());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    @Test
    public void testParse_formatter() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wvtnxmqv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testParse_formatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wvtnxmqv() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29479);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29480);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--dd MM HH").withChronology(ISOChronology.getInstance(PARIS));
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29481);assertEquals(new DateTime(2010, 6, 30, 13, 0, ISOChronology.getInstance(PARIS)), DateTime.parse("2010--30 06 13", f));
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor ()
     */
    @Test
    public void testConstructor() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8hmqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8hmqy() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29482);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29483);DateTime test = new DateTime();
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29484);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29485);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone)
     */
    @Test
    public void testConstructor_DateTimeZone() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4m1k5mr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4m1k5mr2() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29486);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29487);DateTime test = new DateTime(PARIS);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29488);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29489);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone=null)
     */
    @Test
    public void testConstructor_nullDateTimeZone() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zs1romr6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29490,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zs1romr6() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29490);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29491);DateTime test = new DateTime((DateTimeZone) null);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29492);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29493);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (Chronology)
     */
    @Test
    public void testConstructor_Chronology() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15931timra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15931timra() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29494);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29495);DateTime test = new DateTime(GregorianChronology.getInstance());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29496);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29497);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (Chronology=null)
     */
    @Test
    public void testConstructor_nullChronology() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qcb6rmre();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qcb6rmre() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29498);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29499);DateTime test = new DateTime((Chronology) null);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29500);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29501);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (long)
     */
    @Test
    public void testConstructor_long1() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13crmri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13crmri() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29502);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29503);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29504);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29505);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (long)
     */
    @Test
    public void testConstructor_long2() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914kamrm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914kamrm() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29506);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29507);DateTime test = new DateTime(TEST_TIME2);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29508);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29509);assertEquals(TEST_TIME2, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (long, DateTimeZone)
     */
    @Test
    public void testConstructor_long1_DateTimeZone() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mej2a9mrq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_long1_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29510,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mej2a9mrq() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29510);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29511);DateTime test = new DateTime(TEST_TIME1, PARIS);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29512);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29513);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (long, DateTimeZone)
     */
    @Test
    public void testConstructor_long2_DateTimeZone() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1hd9qmru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_long2_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1hd9qmru() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29514);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29515);DateTime test = new DateTime(TEST_TIME2, PARIS);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29516);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29517);assertEquals(TEST_TIME2, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (long, DateTimeZone=null)
     */
    @Test
    public void testConstructor_long_nullDateTimeZone() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uv35a9mry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_long_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uv35a9mry() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29518);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29519);DateTime test = new DateTime(TEST_TIME1, (DateTimeZone) null);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29520);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29521);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    @Test
    public void testConstructor_long1_Chronology() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115wn5sms2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_long1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115wn5sms2() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29522);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29523);DateTime test = new DateTime(TEST_TIME1, GregorianChronology.getInstance());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29524);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29525);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    @Test
    public void testConstructor_long2_Chronology() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14nqmkhms6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_long2_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14nqmkhms6() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29526);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29527);DateTime test = new DateTime(TEST_TIME2, GregorianChronology.getInstance());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29528);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29529);assertEquals(TEST_TIME2, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology=null)
     */
    @Test
    public void testConstructor_long_nullChronology() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnhckumsa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29530,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnhckumsa() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29530);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29531);DateTime test = new DateTime(TEST_TIME1, (Chronology) null);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29532);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29533);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (Object)
     */
    @Test
    public void testConstructor_Object() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eplcebmse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eplcebmse() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29534);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29535);Date date = new Date(TEST_TIME1);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29536);DateTime test = new DateTime(date);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29537);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29538);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (Object)
     */
    @Test
    public void testConstructor_invalidObject() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x7unaymsj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_invalidObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x7unaymsj() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29539);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29540);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29541);new DateTime(new Object());
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29542);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (Object=null)
     */
    @Test
    public void testConstructor_nullObject() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt59ukmsn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_nullObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt59ukmsn() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29543);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29544);DateTime test = new DateTime((Object) null);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29545);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29546);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (Object=null)
     */
    @Test
    public void testConstructor_badconverterObject() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1opptygmsr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_badconverterObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1opptygmsr() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29547);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29548);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29549);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29550);DateTime test = new DateTime(new Integer(0));
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29551);assertEquals(ISOChronology.getInstance(), test.getChronology());
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29552);assertEquals(0L, test.getMillis());
        } finally {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29553);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString1() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11c2b5dmsy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_ObjectString1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11c2b5dmsy() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29554);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29555);DateTime test = new DateTime("1972-12-03");
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29556);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29557);assertEquals(1972, test.getYear());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29558);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29559);assertEquals(3, test.getDayOfMonth());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29560);assertEquals(0, test.getHourOfDay());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29561);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29562);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29563);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString2() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14l29xumt8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_ObjectString2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14l29xumt8() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29564);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29565);DateTime test = new DateTime("2006-06-03T+14:00");
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29566);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29567);assertEquals(2006, test.getYear());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29568);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29569);assertEquals(2, test.getDayOfMonth());  // timezone
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29570);assertEquals(11, test.getHourOfDay());  // test zone is +1, so shift back (14 - 1) hours from midnight
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29571);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29572);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29573);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString3() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17u28qbmti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_ObjectString3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17u28qbmti() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29574);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29575);DateTime test = new DateTime("1972-12-03T10:20:30.040");
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29576);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29577);assertEquals(1972, test.getYear());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29578);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29579);assertEquals(3, test.getDayOfMonth());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29580);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29581);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29582);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29583);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString4() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b327ismts();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_ObjectString4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b327ismts() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29584);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29585);DateTime test = new DateTime("2006-06-03T10:20:30.040+14:00");
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29586);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29587);assertEquals(2006, test.getYear());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29588);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29589);assertEquals(2, test.getDayOfMonth());  // timezone
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29590);assertEquals(21, test.getHourOfDay());  // test zone is +1, so shift back (14 - 1) hours from 10am
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29591);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29592);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29593);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString5() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ec26b9mu2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_ObjectString5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ec26b9mu2() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29594);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29595);DateTime test = new DateTime("T10:20:30.040");
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29596);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29597);assertEquals(1970, test.getYear());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29598);assertEquals(1, test.getMonthOfYear());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29599);assertEquals(1, test.getDayOfMonth());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29600);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29601);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29602);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29603);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString6() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hl253qmuc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_ObjectString6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hl253qmuc() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29604);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29605);DateTime test = new DateTime("T10:20:30.040+14:00");
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29606);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29607);assertEquals(1969, test.getYear());  // timezone
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29608);assertEquals(12, test.getMonthOfYear());  // timezone
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29609);assertEquals(31, test.getDayOfMonth());  // timezone
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29610);assertEquals(21, test.getHourOfDay());  // test zone is +1, so shift back (14 - 1) hours from 10am
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29611);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29612);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29613);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString7() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ku23w7mum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_ObjectString7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ku23w7mum() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29614);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29615);DateTime test = new DateTime("10");
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29616);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29617);assertEquals(10, test.getYear());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29618);assertEquals(1, test.getMonthOfYear());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29619);assertEquals(1, test.getDayOfMonth());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29620);assertEquals(0, test.getHourOfDay());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29621);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29622);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29623);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx1() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11daulemuw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_ObjectStringEx1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29624,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11daulemuw() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29624);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29625);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29626);new DateTime("10:20:30.040");
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29627);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx2() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vp473mv0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_ObjectStringEx2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29628,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vp473mv0() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29628);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29629);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29630);new DateTime("10:20:30.040+14:00");
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29631);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (Object, DateTimeZone)
     */
    @Test
    public void testConstructor_Object_DateTimeZone() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pk74vrmv4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_Object_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pk74vrmv4() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29632);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29633);Date date = new Date(TEST_TIME1);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29634);DateTime test = new DateTime(date, PARIS);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29635);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29636);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (Object, DateTimeZone)
     */
    @Test
    public void testConstructor_invalidObject_DateTimeZone() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1un7r02mv9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_invalidObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29637,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1un7r02mv9() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29637);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29638);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29639);new DateTime(new Object(), PARIS);
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29640);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, DateTimeZone)
     */
    @Test
    public void testConstructor_nullObject_DateTimeZone() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxoowgmvd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_nullObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxoowgmvd() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29641);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29642);DateTime test = new DateTime((Object) null, PARIS);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29643);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29644);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (Object, DateTimeZone=null)
     */
    @Test
    public void testConstructor_Object_nullDateTimeZone() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151w5y6mvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_Object_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29645,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151w5y6mvh() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29645);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29646);Date date = new Date(TEST_TIME1);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29647);DateTime test = new DateTime(date, (DateTimeZone) null);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29648);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29649);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, DateTimeZone=null)
     */
    @Test
    public void testConstructor_nullObject_nullDateTimeZone() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hv60h5mvm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_nullObject_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29650,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hv60h5mvm() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29650);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29651);DateTime test = new DateTime((Object) null, (DateTimeZone) null);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29652);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29653);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (Object, DateTimeZone)
     */
    @Test
    public void testConstructor_badconverterObject_DateTimeZone() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bp24vwmvq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_badconverterObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bp24vwmvq() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29654);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29655);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29656);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29657);DateTime test = new DateTime(new Integer(0), GregorianChronology.getInstance());
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29658);assertEquals(ISOChronology.getInstance(), test.getChronology());
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29659);assertEquals(0L, test.getMillis());
        } finally {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29660);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology)
     */
    @Test
    public void testConstructor_Object_Chronology() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vmnvd4mvx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29661,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vmnvd4mvx() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29661);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29662);Date date = new Date(TEST_TIME1);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29663);DateTime test = new DateTime(date, GregorianChronology.getInstance());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29664);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29665);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology)
     */
    @Test
    public void testConstructor_invalidObject_Chronology() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fl36oxmw2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_invalidObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fl36oxmw2() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29666);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29667);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29668);new DateTime(new Object(), GregorianChronology.getInstance());
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29669);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology)
     */
    @Test
    public void testConstructor_nullObject_Chronology() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q0uynmw6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_nullObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q0uynmw6() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29670);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29671);DateTime test = new DateTime((Object) null, GregorianChronology.getInstance());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29672);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29673);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology=null)
     */
    @Test
    public void testConstructor_Object_nullChronology() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yccijzmwa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yccijzmwa() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29674);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29675);Date date = new Date(TEST_TIME1);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29676);DateTime test = new DateTime(date, (Chronology) null);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29677);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29678);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    @Test
    public void testConstructor_nullObject_nullChronology() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dtve0mwf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_nullObject_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dtve0mwf() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29679);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29680);DateTime test = new DateTime((Object) null, (Chronology) null);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29681);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29682);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology)
     */
    @Test
    public void testConstructor_badconverterObject_Chronology() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyoqybmwj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_badconverterObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyoqybmwj() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29683);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29684);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29685);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29686);DateTime test = new DateTime(new Integer(0), GregorianChronology.getInstance());
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29687);assertEquals(ISOChronology.getInstance(), test.getChronology());
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29688);assertEquals(0L, test.getMillis());
        } finally {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29689);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (int, int, int, int, int)
     */
    @Test
    public void testConstructor_int_int_int_int_int() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14wtbr5mwq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14wtbr5mwq() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29690);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29691);DateTime test = new DateTime(2002, 6, 9, 1, 0);  // +01:00
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29692);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29693);assertEquals(LONDON, test.getZone());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29694);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, int, int, DateTimeZone)
     */
    @Test
    public void testConstructor_int_int_int_int_int_DateTimeZone() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bpglf9mwv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bpglf9mwv() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29695);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29696);DateTime test = new DateTime(2002, 6, 9, 2, 0, PARIS);  // +02:00
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29697);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29698);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, int, int, DateTimeZone=null)
     */
    @Test
    public void testConstructor_int_int_int_int_int_nullDateTimeZone() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iltt0cmwz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iltt0cmwz() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29699);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29700);DateTime test = new DateTime(2002, 6, 9, 1, 0, (DateTimeZone) null);  // +01:00
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29701);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29702);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, int, int, Chronology)
     */
    @Test
    public void testConstructor_int_int_int_int_int_Chronology() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1paqltmmx3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1paqltmmx3() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29703);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29704);DateTime test = new DateTime(2002, 6, 9, 1, 0, GregorianChronology.getInstance());  // +01:00
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29705);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29706);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, int, int, Chronology=null)
     */
    @Test
    public void testConstructor_int_int_int_int_int_nullChronology() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13lxch9mx7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13lxch9mx7() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29707);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29708);DateTime test = new DateTime(2002, 6, 9, 1, 0, (Chronology) null);  // +01:00
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29709);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29710);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (int, int, int, int, int, int)
     */
    @Test
    public void testConstructor_int_int_int_int_int_int() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tj7janmxb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tj7janmxb() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29711);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29712);DateTime test = new DateTime(2002, 6, 9, 1, 0, 0);  // +01:00
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29713);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29714);assertEquals(LONDON, test.getZone());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29715);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, int, int, int, DateTimeZone)
     */
    @Test
    public void testConstructor_int_int_int_int_int_int_DateTimeZone() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hk51dxmxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hk51dxmxg() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29716);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29717);DateTime test = new DateTime(2002, 6, 9, 2, 0, 0, PARIS);  // +02:00
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29718);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29719);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, int, int, int, DateTimeZone=null)
     */
    @Test
    public void testConstructor_int_int_int_int_int_int_nullDateTimeZone() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rzpiqcmxk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29720,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rzpiqcmxk() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29720);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29721);DateTime test = new DateTime(2002, 6, 9, 1, 0, 0, (DateTimeZone) null);  // +01:00
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29722);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29723);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, int, int, int, Chronology)
     */
    @Test
    public void testConstructor_int_int_int_int_int_int_Chronology() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w5zd4amxo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29724,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w5zd4amxo() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29724);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29725);DateTime test = new DateTime(2002, 6, 9, 1, 0, 0, GregorianChronology.getInstance());  // +01:00
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29726);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29727);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, int, int, int, Chronology=null)
     */
    @Test
    public void testConstructor_int_int_int_int_int_int_nullChronology() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g4j4u5mxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29728,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g4j4u5mxs() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29728);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29729);DateTime test = new DateTime(2002, 6, 9, 1, 0, 0, (Chronology) null);  // +01:00
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29730);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29731);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (int, int, int)
     */
    @Test
    public void testConstructor_int_int_int_int_int_int_int() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ofcjttmxw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29732,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ofcjttmxw() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29732);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29733);DateTime test = new DateTime(2002, 6, 9, 1, 0, 0, 0);  // +01:00
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29734);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29735);assertEquals(LONDON, test.getZone());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29736);assertEquals(TEST_TIME_NOW, test.getMillis());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29737);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29738);new DateTime(Integer.MIN_VALUE, 6, 9, 0, 0, 0, 0);
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29739);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29740);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29741);new DateTime(Integer.MAX_VALUE, 6, 9, 0, 0, 0, 0);
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29742);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29743);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29744);new DateTime(2002, 0, 9, 0, 0, 0, 0);
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29745);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29746);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29747);new DateTime(2002, 13, 9, 0, 0, 0, 0);
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29748);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29749);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29750);new DateTime(2002, 6, 0, 0, 0, 0, 0);
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29751);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29752);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29753);new DateTime(2002, 6, 31, 0, 0, 0, 0);
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29754);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29755);new DateTime(2002, 7, 31, 0, 0, 0, 0);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29756);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29757);new DateTime(2002, 7, 32, 0, 0, 0, 0);
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29758);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, DateTimeZone)
     */
    @Test
    public void testConstructor_int_int_int_int_int_int_int_DateTimeZone() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t1eacrmyn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int_int_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t1eacrmyn() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29759);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29760);DateTime test = new DateTime(2002, 6, 9, 2, 0, 0, 0, PARIS);  // +02:00
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29761);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29762);assertEquals(TEST_TIME_NOW, test.getMillis());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29763);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29764);new DateTime(Integer.MIN_VALUE, 6, 9, 0, 0, 0, 0, PARIS);
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29765);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29766);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29767);new DateTime(Integer.MAX_VALUE, 6, 9, 0, 0, 0, 0, PARIS);
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29768);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29769);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29770);new DateTime(2002, 0, 9, 0, 0, 0, 0, PARIS);
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29771);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29772);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29773);new DateTime(2002, 13, 9, 0, 0, 0, 0, PARIS);
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29774);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29775);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29776);new DateTime(2002, 6, 0, 0, 0, 0, 0, PARIS);
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29777);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29778);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29779);new DateTime(2002, 6, 31, 0, 0, 0, 0, PARIS);
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29780);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29781);new DateTime(2002, 7, 31, 0, 0, 0, 0, PARIS);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29782);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29783);new DateTime(2002, 7, 32, 0, 0, 0, 0, PARIS);
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29784);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, DateTimeZone=null)
     */
    @Test
    public void testConstructor_int_int_int_int_int_int_int_nullDateTimeZone() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ent58cmzd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int_int_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29785,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ent58cmzd() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29785);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29786);DateTime test = new DateTime(2002, 6, 9, 1, 0, 0, 0, (DateTimeZone) null);  // +01:00
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29787);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29788);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology)
     */
    @Test
    public void testConstructor_int_int_int_int_int_int_int_Chronology() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jndkremzh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jndkremzh() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29789);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29790);DateTime test = new DateTime(2002, 6, 9, 1, 0, 0, 0, GregorianChronology.getInstance());  // +01:00
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29791);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29792);assertEquals(TEST_TIME_NOW, test.getMillis());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29793);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29794);new DateTime(Integer.MIN_VALUE, 6, 9, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29795);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29796);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29797);new DateTime(Integer.MAX_VALUE, 6, 9, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29798);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29799);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29800);new DateTime(2002, 0, 9, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29801);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29802);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29803);new DateTime(2002, 13, 9, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29804);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29805);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29806);new DateTime(2002, 6, 0, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29807);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29808);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29809);new DateTime(2002, 6, 31, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29810);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29811);new DateTime(2002, 7, 31, 0, 0, 0, 0, GregorianChronology.getInstance());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29812);try {
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29813);new DateTime(2002, 7, 32, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1mk5mk5lgchorq7.R.inc(29814);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    @Test
    public void testConstructor_int_int_int_int_int_int_int_nullChronology() throws Throwable {__CLR4_4_1mk5mk5lgchorq7.R.globalSliceStart(getClass().getName(),29815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fbepkjn07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mk5mk5lgchorq7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mk5mk5lgchorq7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fbepkjn07() throws Throwable{try{__CLR4_4_1mk5mk5lgchorq7.R.inc(29815);
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29816);DateTime test = new DateTime(2002, 6, 9, 1, 0, 0, 0, (Chronology) null);  // +01:00
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29817);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1mk5mk5lgchorq7.R.inc(29818);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mk5mk5lgchorq7.R.flushNeeded();}}

}
