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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 * @author Mike Schrag
 */
public class TestMutableDateTime_Properties {static class __CLR4_4_1yxsyxslgchos85{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,45989,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
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

    // 2002-04-05 Fri
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 12L * DateTimeConstants.MILLIS_PER_HOUR
                    + 24L * DateTimeConstants.MILLIS_PER_MINUTE;

    // 2003-05-06 Tue
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 14L * DateTimeConstants.MILLIS_PER_HOUR
                    + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_1yxsyxslgchos85.R.inc(45280);
        __CLR4_4_1yxsyxslgchos85.R.inc(45281);TestMutableDateTime_Properties TB = new TestMutableDateTime_Properties();
        __CLR4_4_1yxsyxslgchos85.R.inc(45282);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45283);TB.testTest();
        __CLR4_4_1yxsyxslgchos85.R.inc(45284);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45285);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45286);TB.testPropertyGetEra();
        __CLR4_4_1yxsyxslgchos85.R.inc(45287);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45288);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45289);TB.testPropertyGetYearOfEra();
        __CLR4_4_1yxsyxslgchos85.R.inc(45290);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45291);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45292);TB.testPropertyGetCenturyOfEra();
        __CLR4_4_1yxsyxslgchos85.R.inc(45293);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45294);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45295);TB.testPropertyGetYearOfCentury();
        __CLR4_4_1yxsyxslgchos85.R.inc(45296);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45297);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45298);TB.testPropertyGetWeekyear();
        __CLR4_4_1yxsyxslgchos85.R.inc(45299);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45300);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45301);TB.testPropertyGetYear();
        __CLR4_4_1yxsyxslgchos85.R.inc(45302);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45303);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45304);TB.testPropertyAddYear();
        __CLR4_4_1yxsyxslgchos85.R.inc(45305);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45306);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45307);TB.testPropertyAddWrapFieldYear();
        __CLR4_4_1yxsyxslgchos85.R.inc(45308);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45309);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45310);TB.testPropertySetYear();
        __CLR4_4_1yxsyxslgchos85.R.inc(45311);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45312);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45313);TB.testPropertySetTextYear();
        __CLR4_4_1yxsyxslgchos85.R.inc(45314);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45315);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45316);TB.testPropertyGetMonthOfYear();
        __CLR4_4_1yxsyxslgchos85.R.inc(45317);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45318);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45319);TB.testPropertyAddMonthOfYear();
        __CLR4_4_1yxsyxslgchos85.R.inc(45320);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45321);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45322);TB.testPropertyAddWrapFieldMonthOfYear();
        __CLR4_4_1yxsyxslgchos85.R.inc(45323);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45324);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45325);TB.testPropertySetMonthOfYear();
        __CLR4_4_1yxsyxslgchos85.R.inc(45326);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45327);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45328);TB.testPropertySetTextMonthOfYear();
        __CLR4_4_1yxsyxslgchos85.R.inc(45329);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45330);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45331);TB.testPropertyGetDayOfMonth();
        __CLR4_4_1yxsyxslgchos85.R.inc(45332);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45333);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45334);TB.testPropertyAddDayOfMonth();
        __CLR4_4_1yxsyxslgchos85.R.inc(45335);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45336);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45337);TB.testPropertyAddWrapFieldDayOfMonth();
        __CLR4_4_1yxsyxslgchos85.R.inc(45338);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45339);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45340);TB.testPropertySetDayOfMonth();
        __CLR4_4_1yxsyxslgchos85.R.inc(45341);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45342);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45343);TB.testPropertySetTextDayOfMonth();
        __CLR4_4_1yxsyxslgchos85.R.inc(45344);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45345);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45346);TB.testPropertyGetDayOfYear();
        __CLR4_4_1yxsyxslgchos85.R.inc(45347);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45348);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45349);TB.testPropertyAddDayOfYear();
        __CLR4_4_1yxsyxslgchos85.R.inc(45350);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45351);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45352);TB.testPropertyAddWrapFieldDayOfYear();
        __CLR4_4_1yxsyxslgchos85.R.inc(45353);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45354);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45355);TB.testPropertySetDayOfYear();
        __CLR4_4_1yxsyxslgchos85.R.inc(45356);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45357);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45358);TB.testPropertySetTextDayOfYear();
        __CLR4_4_1yxsyxslgchos85.R.inc(45359);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45360);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45361);TB.testPropertyGetWeekOfWeekyear();
        __CLR4_4_1yxsyxslgchos85.R.inc(45362);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45363);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45364);TB.testPropertyAddWeekOfWeekyear();
        __CLR4_4_1yxsyxslgchos85.R.inc(45365);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45366);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45367);TB.testPropertyAddWrapFieldWeekOfWeekyear();
        __CLR4_4_1yxsyxslgchos85.R.inc(45368);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45369);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45370);TB.testPropertySetWeekOfWeekyear();
        __CLR4_4_1yxsyxslgchos85.R.inc(45371);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45372);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45373);TB.testPropertySetTextWeekOfWeekyear();
        __CLR4_4_1yxsyxslgchos85.R.inc(45374);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45375);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45376);TB.testPropertyGetDayOfWeek();
        __CLR4_4_1yxsyxslgchos85.R.inc(45377);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45378);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45379);TB.testPropertyAddDayOfWeek();
        __CLR4_4_1yxsyxslgchos85.R.inc(45380);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45381);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45382);TB.testPropertyAddLongDayOfWeek();
        __CLR4_4_1yxsyxslgchos85.R.inc(45383);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45384);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45385);TB.testPropertyAddWrapFieldDayOfWeek();
        __CLR4_4_1yxsyxslgchos85.R.inc(45386);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45387);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45388);TB.testPropertySetDayOfWeek();
        __CLR4_4_1yxsyxslgchos85.R.inc(45389);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45390);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45391);TB.testPropertySetTextDayOfWeek();
        __CLR4_4_1yxsyxslgchos85.R.inc(45392);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45393);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45394);TB.testPropertyGetHourOfDay();
        __CLR4_4_1yxsyxslgchos85.R.inc(45395);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45396);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45397);TB.testPropertyRoundFloorHourOfDay();
        __CLR4_4_1yxsyxslgchos85.R.inc(45398);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45399);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45400);TB.testPropertyRoundCeilingHourOfDay();
        __CLR4_4_1yxsyxslgchos85.R.inc(45401);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45402);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45403);TB.testPropertyRoundHalfFloorHourOfDay();
        __CLR4_4_1yxsyxslgchos85.R.inc(45404);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45405);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45406);TB.testPropertyRoundHalfCeilingHourOfDay();
        __CLR4_4_1yxsyxslgchos85.R.inc(45407);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45408);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45409);TB.testPropertyRoundHalfEvenHourOfDay();
        __CLR4_4_1yxsyxslgchos85.R.inc(45410);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45411);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45412);TB.testPropertyRemainderHourOfDay();
        __CLR4_4_1yxsyxslgchos85.R.inc(45413);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45414);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45415);TB.testPropertyGetMinuteOfHour();
        __CLR4_4_1yxsyxslgchos85.R.inc(45416);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45417);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45418);TB.testPropertyGetMinuteOfDay();
        __CLR4_4_1yxsyxslgchos85.R.inc(45419);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45420);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45421);TB.testPropertyGetSecondOfMinute();
        __CLR4_4_1yxsyxslgchos85.R.inc(45422);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45423);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45424);TB.testPropertyGetSecondOfDay();
        __CLR4_4_1yxsyxslgchos85.R.inc(45425);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45426);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45427);TB.testPropertyGetMillisOfSecond();
        __CLR4_4_1yxsyxslgchos85.R.inc(45428);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45429);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45430);TB.testPropertyGetMillisOfDay();
        __CLR4_4_1yxsyxslgchos85.R.inc(45431);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45432);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45433);TB.testPropertyToIntervalYearOfEra();
        __CLR4_4_1yxsyxslgchos85.R.inc(45434);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45435);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45436);TB.testPropertyToIntervalYearOfCentury();
        __CLR4_4_1yxsyxslgchos85.R.inc(45437);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45438);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45439);TB.testPropertyToIntervalYear();
        __CLR4_4_1yxsyxslgchos85.R.inc(45440);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45441);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45442);TB.testPropertyToIntervalMonthOfYear();
        __CLR4_4_1yxsyxslgchos85.R.inc(45443);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45444);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45445);TB.testPropertyToIntervalDayOfMonth();
        __CLR4_4_1yxsyxslgchos85.R.inc(45446);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45447);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45448);TB.testPropertyToIntervalHourOfDay();
        __CLR4_4_1yxsyxslgchos85.R.inc(45449);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45450);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45451);TB.testPropertyToIntervalMinuteOfHour();
        __CLR4_4_1yxsyxslgchos85.R.inc(45452);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45453);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45454);TB.testPropertyToIntervalSecondOfMinute();
        __CLR4_4_1yxsyxslgchos85.R.inc(45455);TB.tearDown();
        __CLR4_4_1yxsyxslgchos85.R.inc(45456);TB.setUp();
        __CLR4_4_1yxsyxslgchos85.R.inc(45457);TB.testPropertyToIntervalMillisOfSecond();
        __CLR4_4_1yxsyxslgchos85.R.inc(45458);TB.tearDown();

    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}


    @Before
    public void setUp() throws Exception {try{__CLR4_4_1yxsyxslgchos85.R.inc(45459);
        __CLR4_4_1yxsyxslgchos85.R.inc(45460);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1yxsyxslgchos85.R.inc(45461);zone = DateTimeZone.getDefault();
        __CLR4_4_1yxsyxslgchos85.R.inc(45462);locale = Locale.getDefault();
        __CLR4_4_1yxsyxslgchos85.R.inc(45463);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1yxsyxslgchos85.R.inc(45464);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1yxsyxslgchos85.R.inc(45465);
        __CLR4_4_1yxsyxslgchos85.R.inc(45466);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1yxsyxslgchos85.R.inc(45467);DateTimeZone.setDefault(zone);
        __CLR4_4_1yxsyxslgchos85.R.inc(45468);Locale.setDefault(locale);
        __CLR4_4_1yxsyxslgchos85.R.inc(45469);zone = null;
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjz32();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45470,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjz32(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45470);
        __CLR4_4_1yxsyxslgchos85.R.inc(45471);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1yxsyxslgchos85.R.inc(45472);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1yxsyxslgchos85.R.inc(45473);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetEra() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19gfrqkz36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45474,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19gfrqkz36(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45474);
        __CLR4_4_1yxsyxslgchos85.R.inc(45475);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45476);assertSame(test.getChronology().era(), test.era().getField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45477);assertEquals("era", test.era().getName());
        __CLR4_4_1yxsyxslgchos85.R.inc(45478);assertEquals("Property[era]", test.era().toString());
        __CLR4_4_1yxsyxslgchos85.R.inc(45479);assertSame(test, test.era().getMutableDateTime());
        __CLR4_4_1yxsyxslgchos85.R.inc(45480);assertEquals(1, test.era().get());
        __CLR4_4_1yxsyxslgchos85.R.inc(45481);assertEquals("AD", test.era().getAsText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45482);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45483);assertEquals("AD", test.era().getAsShortText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45484);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45485);assertEquals(test.getChronology().eras(), test.era().getDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45486);assertEquals(null, test.era().getRangeDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45487);assertEquals(2, test.era().getMaximumTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45488);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45489);assertEquals(2, test.era().getMaximumShortTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45490);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH));
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetYearOfEra() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12tr0dkz3n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetYearOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12tr0dkz3n(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45491);
        __CLR4_4_1yxsyxslgchos85.R.inc(45492);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45493);assertSame(test.getChronology().yearOfEra(), test.yearOfEra().getField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45494);assertEquals("yearOfEra", test.yearOfEra().getName());
        __CLR4_4_1yxsyxslgchos85.R.inc(45495);assertEquals("Property[yearOfEra]", test.yearOfEra().toString());
        __CLR4_4_1yxsyxslgchos85.R.inc(45496);assertEquals(2004, test.yearOfEra().get());
        __CLR4_4_1yxsyxslgchos85.R.inc(45497);assertEquals("2004", test.yearOfEra().getAsText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45498);assertEquals("2004", test.yearOfEra().getAsText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45499);assertEquals("2004", test.yearOfEra().getAsShortText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45500);assertEquals("2004", test.yearOfEra().getAsShortText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45501);assertEquals(test.getChronology().years(), test.yearOfEra().getDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45502);assertEquals(test.getChronology().eras(), test.yearOfEra().getRangeDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45503);assertEquals(9, test.yearOfEra().getMaximumTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45504);assertEquals(9, test.yearOfEra().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetCenturyOfEra() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nozc5dz41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetCenturyOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nozc5dz41(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45505);
        __CLR4_4_1yxsyxslgchos85.R.inc(45506);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45507);assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45508);assertEquals("centuryOfEra", test.centuryOfEra().getName());
        __CLR4_4_1yxsyxslgchos85.R.inc(45509);assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString());
        __CLR4_4_1yxsyxslgchos85.R.inc(45510);assertEquals(20, test.centuryOfEra().get());
        __CLR4_4_1yxsyxslgchos85.R.inc(45511);assertEquals("20", test.centuryOfEra().getAsText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45512);assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45513);assertEquals("20", test.centuryOfEra().getAsShortText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45514);assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45515);assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45516);assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45517);assertEquals(7, test.centuryOfEra().getMaximumTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45518);assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetYearOfCentury() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m6mt7cz4f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetYearOfCentury",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m6mt7cz4f(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45519);
        __CLR4_4_1yxsyxslgchos85.R.inc(45520);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45521);assertSame(test.getChronology().yearOfCentury(), test.yearOfCentury().getField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45522);assertEquals("yearOfCentury", test.yearOfCentury().getName());
        __CLR4_4_1yxsyxslgchos85.R.inc(45523);assertEquals("Property[yearOfCentury]", test.yearOfCentury().toString());
        __CLR4_4_1yxsyxslgchos85.R.inc(45524);assertEquals(4, test.yearOfCentury().get());
        __CLR4_4_1yxsyxslgchos85.R.inc(45525);assertEquals("4", test.yearOfCentury().getAsText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45526);assertEquals("4", test.yearOfCentury().getAsText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45527);assertEquals("4", test.yearOfCentury().getAsShortText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45528);assertEquals("4", test.yearOfCentury().getAsShortText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45529);assertEquals(test.getChronology().years(), test.yearOfCentury().getDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45530);assertEquals(test.getChronology().centuries(), test.yearOfCentury().getRangeDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45531);assertEquals(2, test.yearOfCentury().getMaximumTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45532);assertEquals(2, test.yearOfCentury().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetWeekyear() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izv1ndz4t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izv1ndz4t(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45533);
        __CLR4_4_1yxsyxslgchos85.R.inc(45534);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45535);assertSame(test.getChronology().weekyear(), test.weekyear().getField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45536);assertEquals("weekyear", test.weekyear().getName());
        __CLR4_4_1yxsyxslgchos85.R.inc(45537);assertEquals("Property[weekyear]", test.weekyear().toString());
        __CLR4_4_1yxsyxslgchos85.R.inc(45538);assertEquals(2004, test.weekyear().get());
        __CLR4_4_1yxsyxslgchos85.R.inc(45539);assertEquals("2004", test.weekyear().getAsText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45540);assertEquals("2004", test.weekyear().getAsText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45541);assertEquals("2004", test.weekyear().getAsShortText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45542);assertEquals("2004", test.weekyear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45543);assertEquals(test.getChronology().weekyears(), test.weekyear().getDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45544);assertEquals(null, test.weekyear().getRangeDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45545);assertEquals(9, test.weekyear().getMaximumTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45546);assertEquals(9, test.weekyear().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetYear() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgqcqbz57();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgqcqbz57(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45547);
        __CLR4_4_1yxsyxslgchos85.R.inc(45548);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45549);assertSame(test.getChronology().year(), test.year().getField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45550);assertEquals("year", test.year().getName());
        __CLR4_4_1yxsyxslgchos85.R.inc(45551);assertEquals("Property[year]", test.year().toString());
        __CLR4_4_1yxsyxslgchos85.R.inc(45552);assertEquals(2004, test.year().get());
        __CLR4_4_1yxsyxslgchos85.R.inc(45553);assertEquals("2004", test.year().getAsText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45554);assertEquals("2004", test.year().getAsText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45555);assertEquals("2004", test.year().getAsShortText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45556);assertEquals("2004", test.year().getAsShortText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45557);assertEquals(test.getChronology().years(), test.year().getDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45558);assertEquals(null, test.year().getRangeDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45559);assertEquals(9, test.year().getMaximumTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45560);assertEquals(9, test.year().getMaximumShortTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45561);assertEquals(-292275054, test.year().getMinimumValue());
        __CLR4_4_1yxsyxslgchos85.R.inc(45562);assertEquals(-292275054, test.year().getMinimumValueOverall());
        __CLR4_4_1yxsyxslgchos85.R.inc(45563);assertEquals(292278993, test.year().getMaximumValue());
        __CLR4_4_1yxsyxslgchos85.R.inc(45564);assertEquals(292278993, test.year().getMaximumValueOverall());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyAddYear() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c0tefyz5p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c0tefyz5p(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45565);
        __CLR4_4_1yxsyxslgchos85.R.inc(45566);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45567);test.year().add(9);
        __CLR4_4_1yxsyxslgchos85.R.inc(45568);assertEquals("2013-06-09T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldYear() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qjgig6z5t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWrapFieldYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qjgig6z5t(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45569);
        __CLR4_4_1yxsyxslgchos85.R.inc(45570);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45571);test.year().addWrapField(9);
        __CLR4_4_1yxsyxslgchos85.R.inc(45572);assertEquals("2013-06-09T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertySetYear() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b9ziwxz5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b9ziwxz5x(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45573);
        __CLR4_4_1yxsyxslgchos85.R.inc(45574);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45575);test.year().set(1960);
        __CLR4_4_1yxsyxslgchos85.R.inc(45576);assertEquals("1960-06-09T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertySetTextYear() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11qaw4sz61();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45577,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11qaw4sz61(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45577);
        __CLR4_4_1yxsyxslgchos85.R.inc(45578);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45579);test.year().set("1960");
        __CLR4_4_1yxsyxslgchos85.R.inc(45580);assertEquals("1960-06-09T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetMonthOfYear() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_140q40kz65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_140q40kz65(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45581);
        __CLR4_4_1yxsyxslgchos85.R.inc(45582);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45583);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45584);assertEquals("monthOfYear", test.monthOfYear().getName());
        __CLR4_4_1yxsyxslgchos85.R.inc(45585);assertEquals("Property[monthOfYear]", test.monthOfYear().toString());
        __CLR4_4_1yxsyxslgchos85.R.inc(45586);assertEquals(6, test.monthOfYear().get());
        __CLR4_4_1yxsyxslgchos85.R.inc(45587);assertEquals("June", test.monthOfYear().getAsText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45588);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45589);assertEquals("Jun", test.monthOfYear().getAsShortText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45590);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45591);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45592);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45593);assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45594);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45595);test = new MutableDateTime(2004, 7, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45596);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45597);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45598);assertEquals(1, test.monthOfYear().getMinimumValue());
        __CLR4_4_1yxsyxslgchos85.R.inc(45599);assertEquals(1, test.monthOfYear().getMinimumValueOverall());
        __CLR4_4_1yxsyxslgchos85.R.inc(45600);assertEquals(12, test.monthOfYear().getMaximumValue());
        __CLR4_4_1yxsyxslgchos85.R.inc(45601);assertEquals(12, test.monthOfYear().getMaximumValueOverall());
        __CLR4_4_1yxsyxslgchos85.R.inc(45602);assertEquals(1, test.monthOfYear().getMinimumValue());
        __CLR4_4_1yxsyxslgchos85.R.inc(45603);assertEquals(1, test.monthOfYear().getMinimumValueOverall());
        __CLR4_4_1yxsyxslgchos85.R.inc(45604);assertEquals(12, test.monthOfYear().getMaximumValue());
        __CLR4_4_1yxsyxslgchos85.R.inc(45605);assertEquals(12, test.monthOfYear().getMaximumValueOverall());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyAddMonthOfYear() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cfd7jz6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cfd7jz6u(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45606);
        __CLR4_4_1yxsyxslgchos85.R.inc(45607);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45608);test.monthOfYear().add(6);
        __CLR4_4_1yxsyxslgchos85.R.inc(45609);assertEquals("2004-12-09T00:00:00.000Z", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldMonthOfYear() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1phvuslz6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWrapFieldMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1phvuslz6y(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45610);
        __CLR4_4_1yxsyxslgchos85.R.inc(45611);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45612);test.monthOfYear().addWrapField(8);
        __CLR4_4_1yxsyxslgchos85.R.inc(45613);assertEquals("2004-02-09T00:00:00.000Z", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertySetMonthOfYear() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x2imu8z72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x2imu8z72(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45614);
        __CLR4_4_1yxsyxslgchos85.R.inc(45615);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45616);test.monthOfYear().set(12);
        __CLR4_4_1yxsyxslgchos85.R.inc(45617);assertEquals("2004-12-09T00:00:00.000Z", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertySetTextMonthOfYear() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kzotlfz76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45618,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kzotlfz76(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45618);
        __CLR4_4_1yxsyxslgchos85.R.inc(45619);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45620);test.monthOfYear().set("12");
        __CLR4_4_1yxsyxslgchos85.R.inc(45621);assertEquals("2004-12-09T00:00:00.000Z", test.toString());

        __CLR4_4_1yxsyxslgchos85.R.inc(45622);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45623);test.monthOfYear().set("December");
        __CLR4_4_1yxsyxslgchos85.R.inc(45624);assertEquals("2004-12-09T00:00:00.000Z", test.toString());

        __CLR4_4_1yxsyxslgchos85.R.inc(45625);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45626);test.monthOfYear().set("Dec");
        __CLR4_4_1yxsyxslgchos85.R.inc(45627);assertEquals("2004-12-09T00:00:00.000Z", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetDayOfMonth() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1198qu5z7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45628,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1198qu5z7g(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45628);
        __CLR4_4_1yxsyxslgchos85.R.inc(45629);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45630);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45631);assertEquals("dayOfMonth", test.dayOfMonth().getName());
        __CLR4_4_1yxsyxslgchos85.R.inc(45632);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString());
        __CLR4_4_1yxsyxslgchos85.R.inc(45633);assertEquals(9, test.dayOfMonth().get());
        __CLR4_4_1yxsyxslgchos85.R.inc(45634);assertEquals("9", test.dayOfMonth().getAsText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45635);assertEquals("9", test.dayOfMonth().getAsText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45636);assertEquals("9", test.dayOfMonth().getAsShortText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45637);assertEquals("9", test.dayOfMonth().getAsShortText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45638);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45639);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45640);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45641);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45642);assertEquals(1, test.dayOfMonth().getMinimumValue());
        __CLR4_4_1yxsyxslgchos85.R.inc(45643);assertEquals(1, test.dayOfMonth().getMinimumValueOverall());
        __CLR4_4_1yxsyxslgchos85.R.inc(45644);assertEquals(30, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1yxsyxslgchos85.R.inc(45645);assertEquals(31, test.dayOfMonth().getMaximumValueOverall());
        __CLR4_4_1yxsyxslgchos85.R.inc(45646);assertEquals(false, test.dayOfMonth().isLeap());
        __CLR4_4_1yxsyxslgchos85.R.inc(45647);assertEquals(0, test.dayOfMonth().getLeapAmount());
        __CLR4_4_1yxsyxslgchos85.R.inc(45648);assertEquals(null, test.dayOfMonth().getLeapDurationField());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyAddDayOfMonth() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o1ulyqz81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o1ulyqz81(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45649);
        __CLR4_4_1yxsyxslgchos85.R.inc(45650);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45651);test.dayOfMonth().add(9);
        __CLR4_4_1yxsyxslgchos85.R.inc(45652);assertEquals("2004-06-18T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldDayOfMonth() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dfyjyiz85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWrapFieldDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45653,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dfyjyiz85(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45653);
        __CLR4_4_1yxsyxslgchos85.R.inc(45654);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45655);test.dayOfMonth().addWrapField(22);
        __CLR4_4_1yxsyxslgchos85.R.inc(45656);assertEquals("2004-06-01T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertySetDayOfMonth() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mz1n4hz89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45657,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mz1n4hz89(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45657);
        __CLR4_4_1yxsyxslgchos85.R.inc(45658);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45659);test.dayOfMonth().set(12);
        __CLR4_4_1yxsyxslgchos85.R.inc(45660);assertEquals("2004-06-12T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertySetTextDayOfMonth() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_144rzx8z8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45661,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_144rzx8z8d(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45661);
        __CLR4_4_1yxsyxslgchos85.R.inc(45662);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45663);test.dayOfMonth().set("12");
        __CLR4_4_1yxsyxslgchos85.R.inc(45664);assertEquals("2004-06-12T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetDayOfYear() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fvk08z8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fvk08z8h(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45665);
        // 31+29+31+30+31+9 = 161
        __CLR4_4_1yxsyxslgchos85.R.inc(45666);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45667);assertSame(test.getChronology().dayOfYear(), test.dayOfYear().getField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45668);assertEquals("dayOfYear", test.dayOfYear().getName());
        __CLR4_4_1yxsyxslgchos85.R.inc(45669);assertEquals("Property[dayOfYear]", test.dayOfYear().toString());
        __CLR4_4_1yxsyxslgchos85.R.inc(45670);assertEquals(161, test.dayOfYear().get());
        __CLR4_4_1yxsyxslgchos85.R.inc(45671);assertEquals("161", test.dayOfYear().getAsText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45672);assertEquals("161", test.dayOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45673);assertEquals("161", test.dayOfYear().getAsShortText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45674);assertEquals("161", test.dayOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45675);assertEquals(test.getChronology().days(), test.dayOfYear().getDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45676);assertEquals(test.getChronology().years(), test.dayOfYear().getRangeDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45677);assertEquals(3, test.dayOfYear().getMaximumTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45678);assertEquals(3, test.dayOfYear().getMaximumShortTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45679);assertEquals(false, test.dayOfYear().isLeap());
        __CLR4_4_1yxsyxslgchos85.R.inc(45680);assertEquals(0, test.dayOfYear().getLeapAmount());
        __CLR4_4_1yxsyxslgchos85.R.inc(45681);assertEquals(null, test.dayOfYear().getLeapDurationField());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyAddDayOfYear() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14adoxpz8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14adoxpz8y(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45682);
        __CLR4_4_1yxsyxslgchos85.R.inc(45683);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45684);test.dayOfYear().add(9);
        __CLR4_4_1yxsyxslgchos85.R.inc(45685);assertEquals("2004-06-18T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldDayOfYear() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_137fnwhz92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWrapFieldDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45686,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_137fnwhz92(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45686);
        __CLR4_4_1yxsyxslgchos85.R.inc(45687);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45688);test.dayOfYear().addWrapField(206);
        __CLR4_4_1yxsyxslgchos85.R.inc(45689);assertEquals("2004-01-01T00:00:00.000Z", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertySetDayOfYear() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tizt30z96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tizt30z96(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45690);
        __CLR4_4_1yxsyxslgchos85.R.inc(45691);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45692);test.dayOfYear().set(12);
        __CLR4_4_1yxsyxslgchos85.R.inc(45693);assertEquals("2004-01-12T00:00:00.000Z", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertySetTextDayOfYear() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hprj4hz9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hprj4hz9a(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45694);
        __CLR4_4_1yxsyxslgchos85.R.inc(45695);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45696);test.dayOfYear().set("12");
        __CLR4_4_1yxsyxslgchos85.R.inc(45697);assertEquals("2004-01-12T00:00:00.000Z", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetWeekOfWeekyear() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oty2c2z9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45698,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oty2c2z9e(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45698);
        // 2002-01-01 = Thu
        // 2002-12-31 = Thu (+364 days)
        // 2003-12-30 = Thu (+364 days)
        // 2004-01-03 = Mon             W1
        // 2004-01-31 = Mon (+28 days)  W5
        // 2004-02-28 = Mon (+28 days)  W9
        // 2004-03-27 = Mon (+28 days)  W13
        // 2004-04-24 = Mon (+28 days)  W17
        // 2004-05-23 = Mon (+28 days)  W21
        // 2004-06-05 = Mon (+14 days)  W23
        // 2004-06-09 = Fri
        // 2004-12-25 = Mon             W52
        // 2005-01-01 = Mon             W1
        __CLR4_4_1yxsyxslgchos85.R.inc(45699);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45700);assertSame(test.getChronology().weekOfWeekyear(), test.weekOfWeekyear().getField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45701);assertEquals("weekOfWeekyear", test.weekOfWeekyear().getName());
        __CLR4_4_1yxsyxslgchos85.R.inc(45702);assertEquals("Property[weekOfWeekyear]", test.weekOfWeekyear().toString());
        __CLR4_4_1yxsyxslgchos85.R.inc(45703);assertEquals(24, test.weekOfWeekyear().get());
        __CLR4_4_1yxsyxslgchos85.R.inc(45704);assertEquals("24", test.weekOfWeekyear().getAsText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45705);assertEquals("24", test.weekOfWeekyear().getAsText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45706);assertEquals("24", test.weekOfWeekyear().getAsShortText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45707);assertEquals("24", test.weekOfWeekyear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45708);assertEquals(test.getChronology().weeks(), test.weekOfWeekyear().getDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45709);assertEquals(test.getChronology().weekyears(), test.weekOfWeekyear().getRangeDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45710);assertEquals(2, test.weekOfWeekyear().getMaximumTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45711);assertEquals(2, test.weekOfWeekyear().getMaximumShortTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45712);assertEquals(false, test.weekOfWeekyear().isLeap());
        __CLR4_4_1yxsyxslgchos85.R.inc(45713);assertEquals(0, test.weekOfWeekyear().getLeapAmount());
        __CLR4_4_1yxsyxslgchos85.R.inc(45714);assertEquals(null, test.weekOfWeekyear().getLeapDurationField());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyAddWeekOfWeekyear() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o69karz9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45715,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o69karz9v(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45715);
        __CLR4_4_1yxsyxslgchos85.R.inc(45716);MutableDateTime test = new MutableDateTime(2004, 6, 7, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45717);test.weekOfWeekyear().add(1);
        __CLR4_4_1yxsyxslgchos85.R.inc(45718);assertEquals("2004-06-14T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldWeekOfWeekyear() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11nrj95z9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWrapFieldWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11nrj95z9z(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45719);
        __CLR4_4_1yxsyxslgchos85.R.inc(45720);MutableDateTime test = new MutableDateTime(2004, 6, 7, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45721);test.weekOfWeekyear().addWrapField(30);
        __CLR4_4_1yxsyxslgchos85.R.inc(45722);assertEquals("2003-12-29T00:00:00.000Z", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertySetWeekOfWeekyear() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iobpweza3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iobpweza3(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45723);
        __CLR4_4_1yxsyxslgchos85.R.inc(45724);MutableDateTime test = new MutableDateTime(2004, 6, 7, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45725);test.weekOfWeekyear().set(4);
        __CLR4_4_1yxsyxslgchos85.R.inc(45726);assertEquals("2004-01-19T00:00:00.000Z", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertySetTextWeekOfWeekyear() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1swdyyzza7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45727,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1swdyyzza7(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45727);
        __CLR4_4_1yxsyxslgchos85.R.inc(45728);MutableDateTime test = new MutableDateTime(2004, 6, 7, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45729);test.weekOfWeekyear().set("4");
        __CLR4_4_1yxsyxslgchos85.R.inc(45730);assertEquals("2004-01-19T00:00:00.000Z", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetDayOfWeek() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ftu28vzab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ftu28vzab(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45731);
        __CLR4_4_1yxsyxslgchos85.R.inc(45732);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45733);assertSame(test.getChronology().dayOfWeek(), test.dayOfWeek().getField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45734);assertEquals("dayOfWeek", test.dayOfWeek().getName());
        __CLR4_4_1yxsyxslgchos85.R.inc(45735);assertEquals("Property[dayOfWeek]", test.dayOfWeek().toString());
        __CLR4_4_1yxsyxslgchos85.R.inc(45736);assertEquals(3, test.dayOfWeek().get());
        __CLR4_4_1yxsyxslgchos85.R.inc(45737);assertEquals("Wednesday", test.dayOfWeek().getAsText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45738);assertEquals("mercredi", test.dayOfWeek().getAsText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45739);assertEquals("Wed", test.dayOfWeek().getAsShortText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45740);assertEquals("mer.", test.dayOfWeek().getAsShortText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45741);assertEquals(test.getChronology().days(), test.dayOfWeek().getDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45742);assertEquals(test.getChronology().weeks(), test.dayOfWeek().getRangeDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45743);assertEquals(9, test.dayOfWeek().getMaximumTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45744);assertEquals(8, test.dayOfWeek().getMaximumTextLength(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45745);assertEquals(3, test.dayOfWeek().getMaximumShortTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45746);assertEquals(4, test.dayOfWeek().getMaximumShortTextLength(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45747);assertEquals(1, test.dayOfWeek().getMinimumValue());
        __CLR4_4_1yxsyxslgchos85.R.inc(45748);assertEquals(1, test.dayOfWeek().getMinimumValueOverall());
        __CLR4_4_1yxsyxslgchos85.R.inc(45749);assertEquals(7, test.dayOfWeek().getMaximumValue());
        __CLR4_4_1yxsyxslgchos85.R.inc(45750);assertEquals(7, test.dayOfWeek().getMaximumValueOverall());
        __CLR4_4_1yxsyxslgchos85.R.inc(45751);assertEquals(false, test.dayOfWeek().isLeap());
        __CLR4_4_1yxsyxslgchos85.R.inc(45752);assertEquals(0, test.dayOfWeek().getLeapAmount());
        __CLR4_4_1yxsyxslgchos85.R.inc(45753);assertEquals(null, test.dayOfWeek().getLeapDurationField());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyAddDayOfWeek() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1joc76czay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1joc76czay(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45754);
        __CLR4_4_1yxsyxslgchos85.R.inc(45755);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45756);test.dayOfWeek().add(1);
        __CLR4_4_1yxsyxslgchos85.R.inc(45757);assertEquals("2004-06-10T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyAddLongDayOfWeek() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_166ne0ozb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddLongDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_166ne0ozb2(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45758);
        __CLR4_4_1yxsyxslgchos85.R.inc(45759);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45760);test.dayOfWeek().add(1L);
        __CLR4_4_1yxsyxslgchos85.R.inc(45761);assertEquals("2004-06-10T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldDayOfWeek() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ile654zb6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWrapFieldDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45762,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ile654zb6(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45762);
        __CLR4_4_1yxsyxslgchos85.R.inc(45763);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);  // Wed
        __CLR4_4_1yxsyxslgchos85.R.inc(45764);test.dayOfWeek().addWrapField(5);
        __CLR4_4_1yxsyxslgchos85.R.inc(45765);assertEquals("2004-06-07T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertySetDayOfWeek() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q45qnhzba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q45qnhzba(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45766);
        __CLR4_4_1yxsyxslgchos85.R.inc(45767);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45768);test.dayOfWeek().set(4);
        __CLR4_4_1yxsyxslgchos85.R.inc(45769);assertEquals("2004-06-10T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertySetTextDayOfWeek() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12bt0vuzbe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12bt0vuzbe(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45770);
        __CLR4_4_1yxsyxslgchos85.R.inc(45771);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45772);test.dayOfWeek().set("4");
        __CLR4_4_1yxsyxslgchos85.R.inc(45773);assertEquals("2004-06-10T00:00:00.000+01:00", test.toString());

        __CLR4_4_1yxsyxslgchos85.R.inc(45774);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45775);test.dayOfWeek().set("Mon");
        __CLR4_4_1yxsyxslgchos85.R.inc(45776);assertEquals("2004-06-07T00:00:00.000+01:00", test.toString());

        __CLR4_4_1yxsyxslgchos85.R.inc(45777);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45778);test.dayOfWeek().set("Tuesday");
        __CLR4_4_1yxsyxslgchos85.R.inc(45779);assertEquals("2004-06-08T00:00:00.000+01:00", test.toString());

        __CLR4_4_1yxsyxslgchos85.R.inc(45780);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45781);test.dayOfWeek().set("lundi", Locale.FRENCH);
        __CLR4_4_1yxsyxslgchos85.R.inc(45782);assertEquals("2004-06-07T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetHourOfDay() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i5x06xzbr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i5x06xzbr(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45783);
        __CLR4_4_1yxsyxslgchos85.R.inc(45784);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1yxsyxslgchos85.R.inc(45785);assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45786);assertEquals("hourOfDay", test.hourOfDay().getName());
        __CLR4_4_1yxsyxslgchos85.R.inc(45787);assertEquals("Property[hourOfDay]", test.hourOfDay().toString());
        __CLR4_4_1yxsyxslgchos85.R.inc(45788);assertEquals(13, test.hourOfDay().get());
        __CLR4_4_1yxsyxslgchos85.R.inc(45789);assertEquals("13", test.hourOfDay().getAsText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45790);assertEquals("13", test.hourOfDay().getAsText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45791);assertEquals("13", test.hourOfDay().getAsShortText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45792);assertEquals("13", test.hourOfDay().getAsShortText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45793);assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45794);assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45795);assertEquals(2, test.hourOfDay().getMaximumTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45796);assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyRoundFloorHourOfDay() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rs37ctzc5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundFloorHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45797,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rs37ctzc5(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45797);
        __CLR4_4_1yxsyxslgchos85.R.inc(45798);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45799);test.hourOfDay().roundFloor();
        __CLR4_4_1yxsyxslgchos85.R.inc(45800);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyRoundCeilingHourOfDay() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r72lguzc9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundCeilingHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r72lguzc9(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45801);
        __CLR4_4_1yxsyxslgchos85.R.inc(45802);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45803);test.hourOfDay().roundCeiling();
        __CLR4_4_1yxsyxslgchos85.R.inc(45804);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyRoundHalfFloorHourOfDay() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pcihmyzcd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundHalfFloorHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pcihmyzcd(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45805);
        __CLR4_4_1yxsyxslgchos85.R.inc(45806);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45807);test.hourOfDay().roundHalfFloor();
        __CLR4_4_1yxsyxslgchos85.R.inc(45808);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString());

        __CLR4_4_1yxsyxslgchos85.R.inc(45809);test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1);
        __CLR4_4_1yxsyxslgchos85.R.inc(45810);test.hourOfDay().roundHalfFloor();
        __CLR4_4_1yxsyxslgchos85.R.inc(45811);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString());

        __CLR4_4_1yxsyxslgchos85.R.inc(45812);test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999);
        __CLR4_4_1yxsyxslgchos85.R.inc(45813);test.hourOfDay().roundHalfFloor();
        __CLR4_4_1yxsyxslgchos85.R.inc(45814);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyRoundHalfCeilingHourOfDay() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xftvazzcn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundHalfCeilingHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xftvazzcn(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45815);
        __CLR4_4_1yxsyxslgchos85.R.inc(45816);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45817);test.hourOfDay().roundHalfCeiling();
        __CLR4_4_1yxsyxslgchos85.R.inc(45818);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString());

        __CLR4_4_1yxsyxslgchos85.R.inc(45819);test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1);
        __CLR4_4_1yxsyxslgchos85.R.inc(45820);test.hourOfDay().roundHalfCeiling();
        __CLR4_4_1yxsyxslgchos85.R.inc(45821);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString());

        __CLR4_4_1yxsyxslgchos85.R.inc(45822);test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999);
        __CLR4_4_1yxsyxslgchos85.R.inc(45823);test.hourOfDay().roundHalfCeiling();
        __CLR4_4_1yxsyxslgchos85.R.inc(45824);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyRoundHalfEvenHourOfDay() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_136gyoczcx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundHalfEvenHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_136gyoczcx(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45825);
        __CLR4_4_1yxsyxslgchos85.R.inc(45826);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45827);test.hourOfDay().roundHalfEven();
        __CLR4_4_1yxsyxslgchos85.R.inc(45828);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString());

        __CLR4_4_1yxsyxslgchos85.R.inc(45829);test = new MutableDateTime(2004, 6, 9, 14, 30, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45830);test.hourOfDay().roundHalfEven();
        __CLR4_4_1yxsyxslgchos85.R.inc(45831);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString());

        __CLR4_4_1yxsyxslgchos85.R.inc(45832);test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1);
        __CLR4_4_1yxsyxslgchos85.R.inc(45833);test.hourOfDay().roundHalfEven();
        __CLR4_4_1yxsyxslgchos85.R.inc(45834);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString());

        __CLR4_4_1yxsyxslgchos85.R.inc(45835);test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999);
        __CLR4_4_1yxsyxslgchos85.R.inc(45836);test.hourOfDay().roundHalfEven();
        __CLR4_4_1yxsyxslgchos85.R.inc(45837);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyRemainderHourOfDay() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sd0idyzda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRemainderHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sd0idyzda(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45838);
        __CLR4_4_1yxsyxslgchos85.R.inc(45839);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1yxsyxslgchos85.R.inc(45840);assertEquals(30L * DateTimeConstants.MILLIS_PER_MINUTE, test.hourOfDay().remainder());
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetMinuteOfHour() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jby1vfzdd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMinuteOfHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45841,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jby1vfzdd(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45841);
        __CLR4_4_1yxsyxslgchos85.R.inc(45842);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1yxsyxslgchos85.R.inc(45843);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45844);assertEquals("minuteOfHour", test.minuteOfHour().getName());
        __CLR4_4_1yxsyxslgchos85.R.inc(45845);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString());
        __CLR4_4_1yxsyxslgchos85.R.inc(45846);assertEquals(23, test.minuteOfHour().get());
        __CLR4_4_1yxsyxslgchos85.R.inc(45847);assertEquals("23", test.minuteOfHour().getAsText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45848);assertEquals("23", test.minuteOfHour().getAsText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45849);assertEquals("23", test.minuteOfHour().getAsShortText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45850);assertEquals("23", test.minuteOfHour().getAsShortText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45851);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45852);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45853);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45854);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetMinuteOfDay() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p5v12vzdr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMinuteOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p5v12vzdr(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45855);
        __CLR4_4_1yxsyxslgchos85.R.inc(45856);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1yxsyxslgchos85.R.inc(45857);assertSame(test.getChronology().minuteOfDay(), test.minuteOfDay().getField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45858);assertEquals("minuteOfDay", test.minuteOfDay().getName());
        __CLR4_4_1yxsyxslgchos85.R.inc(45859);assertEquals("Property[minuteOfDay]", test.minuteOfDay().toString());
        __CLR4_4_1yxsyxslgchos85.R.inc(45860);assertEquals(803, test.minuteOfDay().get());
        __CLR4_4_1yxsyxslgchos85.R.inc(45861);assertEquals("803", test.minuteOfDay().getAsText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45862);assertEquals("803", test.minuteOfDay().getAsText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45863);assertEquals("803", test.minuteOfDay().getAsShortText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45864);assertEquals("803", test.minuteOfDay().getAsShortText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45865);assertEquals(test.getChronology().minutes(), test.minuteOfDay().getDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45866);assertEquals(test.getChronology().days(), test.minuteOfDay().getRangeDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45867);assertEquals(4, test.minuteOfDay().getMaximumTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45868);assertEquals(4, test.minuteOfDay().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetSecondOfMinute() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ul2igbze5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetSecondOfMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45869,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ul2igbze5(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45869);
        __CLR4_4_1yxsyxslgchos85.R.inc(45870);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1yxsyxslgchos85.R.inc(45871);assertSame(test.getChronology().secondOfMinute(), test.secondOfMinute().getField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45872);assertEquals("secondOfMinute", test.secondOfMinute().getName());
        __CLR4_4_1yxsyxslgchos85.R.inc(45873);assertEquals("Property[secondOfMinute]", test.secondOfMinute().toString());
        __CLR4_4_1yxsyxslgchos85.R.inc(45874);assertEquals(43, test.secondOfMinute().get());
        __CLR4_4_1yxsyxslgchos85.R.inc(45875);assertEquals("43", test.secondOfMinute().getAsText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45876);assertEquals("43", test.secondOfMinute().getAsText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45877);assertEquals("43", test.secondOfMinute().getAsShortText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45878);assertEquals("43", test.secondOfMinute().getAsShortText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45879);assertEquals(test.getChronology().seconds(), test.secondOfMinute().getDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45880);assertEquals(test.getChronology().minutes(), test.secondOfMinute().getRangeDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45881);assertEquals(2, test.secondOfMinute().getMaximumTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45882);assertEquals(2, test.secondOfMinute().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetSecondOfDay() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1srw4fdzej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetSecondOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45883,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1srw4fdzej(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45883);
        __CLR4_4_1yxsyxslgchos85.R.inc(45884);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1yxsyxslgchos85.R.inc(45885);assertSame(test.getChronology().secondOfDay(), test.secondOfDay().getField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45886);assertEquals("secondOfDay", test.secondOfDay().getName());
        __CLR4_4_1yxsyxslgchos85.R.inc(45887);assertEquals("Property[secondOfDay]", test.secondOfDay().toString());
        __CLR4_4_1yxsyxslgchos85.R.inc(45888);assertEquals(48223, test.secondOfDay().get());
        __CLR4_4_1yxsyxslgchos85.R.inc(45889);assertEquals("48223", test.secondOfDay().getAsText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45890);assertEquals("48223", test.secondOfDay().getAsText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45891);assertEquals("48223", test.secondOfDay().getAsShortText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45892);assertEquals("48223", test.secondOfDay().getAsShortText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45893);assertEquals(test.getChronology().seconds(), test.secondOfDay().getDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45894);assertEquals(test.getChronology().days(), test.secondOfDay().getRangeDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45895);assertEquals(5, test.secondOfDay().getMaximumTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45896);assertEquals(5, test.secondOfDay().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetMillisOfSecond() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1je93bbzex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMillisOfSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1je93bbzex(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45897);
        __CLR4_4_1yxsyxslgchos85.R.inc(45898);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1yxsyxslgchos85.R.inc(45899);assertSame(test.getChronology().millisOfSecond(), test.millisOfSecond().getField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45900);assertEquals("millisOfSecond", test.millisOfSecond().getName());
        __CLR4_4_1yxsyxslgchos85.R.inc(45901);assertEquals("Property[millisOfSecond]", test.millisOfSecond().toString());
        __CLR4_4_1yxsyxslgchos85.R.inc(45902);assertEquals(53, test.millisOfSecond().get());
        __CLR4_4_1yxsyxslgchos85.R.inc(45903);assertEquals("53", test.millisOfSecond().getAsText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45904);assertEquals("53", test.millisOfSecond().getAsText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45905);assertEquals("53", test.millisOfSecond().getAsShortText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45906);assertEquals("53", test.millisOfSecond().getAsShortText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45907);assertEquals(test.getChronology().millis(), test.millisOfSecond().getDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45908);assertEquals(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45909);assertEquals(3, test.millisOfSecond().getMaximumTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45910);assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetMillisOfDay() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eihskpzfb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMillisOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eihskpzfb(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45911);
        __CLR4_4_1yxsyxslgchos85.R.inc(45912);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1yxsyxslgchos85.R.inc(45913);assertSame(test.getChronology().millisOfDay(), test.millisOfDay().getField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45914);assertEquals("millisOfDay", test.millisOfDay().getName());
        __CLR4_4_1yxsyxslgchos85.R.inc(45915);assertEquals("Property[millisOfDay]", test.millisOfDay().toString());
        __CLR4_4_1yxsyxslgchos85.R.inc(45916);assertEquals(48223053, test.millisOfDay().get());
        __CLR4_4_1yxsyxslgchos85.R.inc(45917);assertEquals("48223053", test.millisOfDay().getAsText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45918);assertEquals("48223053", test.millisOfDay().getAsText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45919);assertEquals("48223053", test.millisOfDay().getAsShortText());
        __CLR4_4_1yxsyxslgchos85.R.inc(45920);assertEquals("48223053", test.millisOfDay().getAsShortText(Locale.FRENCH));
        __CLR4_4_1yxsyxslgchos85.R.inc(45921);assertEquals(test.getChronology().millis(), test.millisOfDay().getDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45922);assertEquals(test.getChronology().days(), test.millisOfDay().getRangeDurationField());
        __CLR4_4_1yxsyxslgchos85.R.inc(45923);assertEquals(8, test.millisOfDay().getMaximumTextLength(null));
        __CLR4_4_1yxsyxslgchos85.R.inc(45924);assertEquals(8, test.millisOfDay().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyToIntervalYearOfEra() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dof34zfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyToIntervalYearOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dof34zfp(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45925);
        __CLR4_4_1yxsyxslgchos85.R.inc(45926);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1yxsyxslgchos85.R.inc(45927);Interval testInterval = test.yearOfEra().toInterval();
        __CLR4_4_1yxsyxslgchos85.R.inc(45928);assertEquals(new MutableDateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart());
        __CLR4_4_1yxsyxslgchos85.R.inc(45929);assertEquals(new MutableDateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd());
        __CLR4_4_1yxsyxslgchos85.R.inc(45930);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyToIntervalYearOfCentury() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h9bdk0zfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyToIntervalYearOfCentury",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45931,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h9bdk0zfv(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45931);
        __CLR4_4_1yxsyxslgchos85.R.inc(45932);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1yxsyxslgchos85.R.inc(45933);Interval testInterval = test.yearOfCentury().toInterval();
        __CLR4_4_1yxsyxslgchos85.R.inc(45934);assertEquals(new MutableDateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart());
        __CLR4_4_1yxsyxslgchos85.R.inc(45935);assertEquals(new MutableDateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd());
        __CLR4_4_1yxsyxslgchos85.R.inc(45936);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyToIntervalYear() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hg1pudzg1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyToIntervalYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hg1pudzg1(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45937);
        __CLR4_4_1yxsyxslgchos85.R.inc(45938);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1yxsyxslgchos85.R.inc(45939);Interval testInterval = test.year().toInterval();
        __CLR4_4_1yxsyxslgchos85.R.inc(45940);assertEquals(new MutableDateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart());
        __CLR4_4_1yxsyxslgchos85.R.inc(45941);assertEquals(new MutableDateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd());
        __CLR4_4_1yxsyxslgchos85.R.inc(45942);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyToIntervalMonthOfYear() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mybayczg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyToIntervalMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mybayczg7(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45943);
        __CLR4_4_1yxsyxslgchos85.R.inc(45944);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1yxsyxslgchos85.R.inc(45945);Interval testInterval = test.monthOfYear().toInterval();
        __CLR4_4_1yxsyxslgchos85.R.inc(45946);assertEquals(new MutableDateTime(2004, 6, 1, 0, 0, 0, 0), testInterval.getStart());
        __CLR4_4_1yxsyxslgchos85.R.inc(45947);assertEquals(new MutableDateTime(2004, 7, 1, 0, 0, 0, 0), testInterval.getEnd());
        __CLR4_4_1yxsyxslgchos85.R.inc(45948);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyToIntervalDayOfMonth() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r3xijfzgd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyToIntervalDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r3xijfzgd(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45949);
        __CLR4_4_1yxsyxslgchos85.R.inc(45950);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1yxsyxslgchos85.R.inc(45951);Interval testInterval = test.dayOfMonth().toInterval();
        __CLR4_4_1yxsyxslgchos85.R.inc(45952);assertEquals(new MutableDateTime(2004, 6, 9, 0, 0, 0, 0), testInterval.getStart());
        __CLR4_4_1yxsyxslgchos85.R.inc(45953);assertEquals(new MutableDateTime(2004, 6, 10, 0, 0, 0, 0), testInterval.getEnd());
        __CLR4_4_1yxsyxslgchos85.R.inc(45954);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);

        __CLR4_4_1yxsyxslgchos85.R.inc(45955);MutableDateTime febTest = new MutableDateTime(2004, 2, 29, 13, 23, 43, 53);
        __CLR4_4_1yxsyxslgchos85.R.inc(45956);Interval febTestInterval = febTest.dayOfMonth().toInterval();
        __CLR4_4_1yxsyxslgchos85.R.inc(45957);assertEquals(new MutableDateTime(2004, 2, 29, 0, 0, 0, 0), febTestInterval.getStart());
        __CLR4_4_1yxsyxslgchos85.R.inc(45958);assertEquals(new MutableDateTime(2004, 3, 1, 0, 0, 0, 0), febTestInterval.getEnd());
        __CLR4_4_1yxsyxslgchos85.R.inc(45959);assertEquals(new MutableDateTime(2004, 2, 29, 13, 23, 43, 53), febTest);
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyToIntervalHourOfDay() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ldcfnlzgo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyToIntervalHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ldcfnlzgo(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45960);
        __CLR4_4_1yxsyxslgchos85.R.inc(45961);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1yxsyxslgchos85.R.inc(45962);Interval testInterval = test.hourOfDay().toInterval();
        __CLR4_4_1yxsyxslgchos85.R.inc(45963);assertEquals(new MutableDateTime(2004, 6, 9, 13, 0, 0, 0), testInterval.getStart());
        __CLR4_4_1yxsyxslgchos85.R.inc(45964);assertEquals(new MutableDateTime(2004, 6, 9, 14, 0, 0, 0), testInterval.getEnd());
        __CLR4_4_1yxsyxslgchos85.R.inc(45965);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);

        __CLR4_4_1yxsyxslgchos85.R.inc(45966);MutableDateTime midnightTest = new MutableDateTime(2004, 6, 9, 23, 23, 43, 53);
        __CLR4_4_1yxsyxslgchos85.R.inc(45967);Interval midnightTestInterval = midnightTest.hourOfDay().toInterval();
        __CLR4_4_1yxsyxslgchos85.R.inc(45968);assertEquals(new MutableDateTime(2004, 6, 9, 23, 0, 0, 0), midnightTestInterval.getStart());
        __CLR4_4_1yxsyxslgchos85.R.inc(45969);assertEquals(new MutableDateTime(2004, 6, 10, 0, 0, 0, 0), midnightTestInterval.getEnd());
        __CLR4_4_1yxsyxslgchos85.R.inc(45970);assertEquals(new MutableDateTime(2004, 6, 9, 23, 23, 43, 53), midnightTest);
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyToIntervalMinuteOfHour() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi18fxzgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyToIntervalMinuteOfHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi18fxzgz(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45971);
        __CLR4_4_1yxsyxslgchos85.R.inc(45972);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1yxsyxslgchos85.R.inc(45973);Interval testInterval = test.minuteOfHour().toInterval();
        __CLR4_4_1yxsyxslgchos85.R.inc(45974);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 0, 0), testInterval.getStart());
        __CLR4_4_1yxsyxslgchos85.R.inc(45975);assertEquals(new MutableDateTime(2004, 6, 9, 13, 24, 0, 0), testInterval.getEnd());
        __CLR4_4_1yxsyxslgchos85.R.inc(45976);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyToIntervalSecondOfMinute() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ttf6dpzh5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyToIntervalSecondOfMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ttf6dpzh5(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45977);
        __CLR4_4_1yxsyxslgchos85.R.inc(45978);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1yxsyxslgchos85.R.inc(45979);Interval testInterval = test.secondOfMinute().toInterval();
        __CLR4_4_1yxsyxslgchos85.R.inc(45980);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 0), testInterval.getStart());
        __CLR4_4_1yxsyxslgchos85.R.inc(45981);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 44, 0), testInterval.getEnd());
        __CLR4_4_1yxsyxslgchos85.R.inc(45982);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

    @Test
    public void testPropertyToIntervalMillisOfSecond() {__CLR4_4_1yxsyxslgchos85.R.globalSliceStart(getClass().getName(),45983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18rmq67zhb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yxsyxslgchos85.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yxsyxslgchos85.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyToIntervalMillisOfSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45983,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18rmq67zhb(){try{__CLR4_4_1yxsyxslgchos85.R.inc(45983);
        __CLR4_4_1yxsyxslgchos85.R.inc(45984);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1yxsyxslgchos85.R.inc(45985);Interval testInterval = test.millisOfSecond().toInterval();
        __CLR4_4_1yxsyxslgchos85.R.inc(45986);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), testInterval.getStart());
        __CLR4_4_1yxsyxslgchos85.R.inc(45987);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 54), testInterval.getEnd());
        __CLR4_4_1yxsyxslgchos85.R.inc(45988);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);
    }finally{__CLR4_4_1yxsyxslgchos85.R.flushNeeded();}}

}
