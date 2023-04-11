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

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalTime_Constructors {static class __CLR4_4_1va6va6lgchos39{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,41212,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final ISOChronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final JulianChronology JULIAN_LONDON = JulianChronology.getInstance(LONDON);
    private static final JulianChronology JULIAN_PARIS = JulianChronology.getInstance(PARIS);
    private static final JulianChronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final int OFFSET_LONDON = LONDON.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;
    private static final int OFFSET_PARIS = PARIS.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;

    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
                    + 20L * DateTimeConstants.MILLIS_PER_MINUTE
                    + 30L * DateTimeConstants.MILLIS_PER_SECOND
                    + 40L;

    private long TEST_TIME1 =
            1L * DateTimeConstants.MILLIS_PER_HOUR
                    + 2L * DateTimeConstants.MILLIS_PER_MINUTE
                    + 3L * DateTimeConstants.MILLIS_PER_SECOND
                    + 4L;

    private long TEST_TIME2 =
            1L * DateTimeConstants.MILLIS_PER_DAY
                    + 5L * DateTimeConstants.MILLIS_PER_HOUR
                    + 6L * DateTimeConstants.MILLIS_PER_MINUTE
                    + 7L * DateTimeConstants.MILLIS_PER_SECOND
                    + 8L;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Throwable {try{__CLR4_4_1va6va6lgchos39.R.inc(40542);
        __CLR4_4_1va6va6lgchos39.R.inc(40543);TestLocalTime_Constructors TB = new TestLocalTime_Constructors();
        __CLR4_4_1va6va6lgchos39.R.inc(40544);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40545);TB.testConstantMidnight();
        __CLR4_4_1va6va6lgchos39.R.inc(40546);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40547);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40548);TB.testParse_noFormatter();
        __CLR4_4_1va6va6lgchos39.R.inc(40549);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40550);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40551);TB.testParse_formatter();
        __CLR4_4_1va6va6lgchos39.R.inc(40552);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40553);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40554);TB.testFactory_FromCalendarFields_Calendar();
        __CLR4_4_1va6va6lgchos39.R.inc(40555);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40556);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40557);TB.testFactory_FromDateFields_after1970();
        __CLR4_4_1va6va6lgchos39.R.inc(40558);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40559);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40560);TB.testFactory_FromDateFields_before1970();
        __CLR4_4_1va6va6lgchos39.R.inc(40561);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40562);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40563);TB.testFactory_FromDateFields_null();
        __CLR4_4_1va6va6lgchos39.R.inc(40564);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40565);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40566);TB.testFactoryMillisOfDay_long();
        __CLR4_4_1va6va6lgchos39.R.inc(40567);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40568);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40569);TB.testFactoryMillisOfDay_long_Chronology();
        __CLR4_4_1va6va6lgchos39.R.inc(40570);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40571);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40572);TB.testFactoryMillisOfDay_long_nullChronology();
        __CLR4_4_1va6va6lgchos39.R.inc(40573);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40574);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40575);TB.testConstructor();
        __CLR4_4_1va6va6lgchos39.R.inc(40576);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40577);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40578);TB.testConstructor_DateTimeZone();
        __CLR4_4_1va6va6lgchos39.R.inc(40579);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40580);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40581);TB.testConstructor_nullDateTimeZone();
        __CLR4_4_1va6va6lgchos39.R.inc(40582);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40583);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40584);TB.testConstructor_Chronology();
        __CLR4_4_1va6va6lgchos39.R.inc(40585);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40586);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40587);TB.testConstructor_nullChronology();
        __CLR4_4_1va6va6lgchos39.R.inc(40588);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40589);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40590);TB.testConstructor_long1();
        __CLR4_4_1va6va6lgchos39.R.inc(40591);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40592);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40593);TB.testConstructor_long2();
        __CLR4_4_1va6va6lgchos39.R.inc(40594);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40595);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40596);TB.testConstructor_long_DateTimeZone();
        __CLR4_4_1va6va6lgchos39.R.inc(40597);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40598);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40599);TB.testConstructor_long_DateTimeZone_2();
        __CLR4_4_1va6va6lgchos39.R.inc(40600);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40601);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40602);TB.testConstructor_long_nullDateTimeZone();
        __CLR4_4_1va6va6lgchos39.R.inc(40603);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40604);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40605);TB.testConstructor_long1_Chronology();
        __CLR4_4_1va6va6lgchos39.R.inc(40606);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40607);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40608);TB.testConstructor_long2_Chronology();
        __CLR4_4_1va6va6lgchos39.R.inc(40609);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40610);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40611);TB.testConstructor_long_nullChronology();
        __CLR4_4_1va6va6lgchos39.R.inc(40612);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40613);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40614);TB.testConstructor_Object1();
        __CLR4_4_1va6va6lgchos39.R.inc(40615);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40616);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40617);TB.testConstructor_Object2();
        __CLR4_4_1va6va6lgchos39.R.inc(40618);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40619);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40620);TB.testConstructor_nullObject();
        __CLR4_4_1va6va6lgchos39.R.inc(40621);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40622);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40623);TB.testConstructor_ObjectString1();
        __CLR4_4_1va6va6lgchos39.R.inc(40624);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40625);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40626);TB.testConstructor_ObjectString1Tokyo();
        __CLR4_4_1va6va6lgchos39.R.inc(40627);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40628);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40629);TB.testConstructor_ObjectString1NewYork();
        __CLR4_4_1va6va6lgchos39.R.inc(40630);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40631);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40632);TB.testConstructor_ObjectString2();
        __CLR4_4_1va6va6lgchos39.R.inc(40633);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40634);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40635);TB.testConstructor_ObjectString3();
        __CLR4_4_1va6va6lgchos39.R.inc(40636);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40637);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40638);TB.testConstructor_ObjectString4();
        __CLR4_4_1va6va6lgchos39.R.inc(40639);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40640);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40641);TB.testConstructor_ObjectStringEx1();
        __CLR4_4_1va6va6lgchos39.R.inc(40642);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40643);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40644);TB.testConstructor_ObjectStringEx2();
        __CLR4_4_1va6va6lgchos39.R.inc(40645);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40646);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40647);TB.testConstructor_ObjectStringEx3();
        __CLR4_4_1va6va6lgchos39.R.inc(40648);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40649);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40650);TB.testConstructor_ObjectStringEx4();
        __CLR4_4_1va6va6lgchos39.R.inc(40651);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40652);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40653);TB.testConstructor_ObjectStringEx5();
        __CLR4_4_1va6va6lgchos39.R.inc(40654);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40655);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40656);TB.testConstructor_ObjectStringEx6();
        __CLR4_4_1va6va6lgchos39.R.inc(40657);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40658);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40659);TB.testConstructor_ObjectLocalTime();
        __CLR4_4_1va6va6lgchos39.R.inc(40660);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40661);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40662);TB.testConstructor_ObjectLocalDate();
        __CLR4_4_1va6va6lgchos39.R.inc(40663);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40664);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40665);TB.testConstructor_ObjectLocalDateTime();
        __CLR4_4_1va6va6lgchos39.R.inc(40666);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40667);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40668);TB.testConstructor_ObjectTimeOfDay();
        __CLR4_4_1va6va6lgchos39.R.inc(40669);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40670);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40671);TB.testConstructor_Object1_DateTimeZone();
        __CLR4_4_1va6va6lgchos39.R.inc(40672);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40673);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40674);TB.testConstructor_ObjectString_DateTimeZoneLondon();
        __CLR4_4_1va6va6lgchos39.R.inc(40675);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40676);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40677);TB.testConstructor_ObjectString_DateTimeZoneTokyo();
        __CLR4_4_1va6va6lgchos39.R.inc(40678);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40679);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40680);TB.testConstructor_ObjectString_DateTimeZoneNewYork();
        __CLR4_4_1va6va6lgchos39.R.inc(40681);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40682);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40683);TB.testConstructor_nullObject_DateTimeZone();
        __CLR4_4_1va6va6lgchos39.R.inc(40684);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40685);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40686);TB.testConstructor_Object_nullDateTimeZone();
        __CLR4_4_1va6va6lgchos39.R.inc(40687);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40688);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40689);TB.testConstructor_nullObject_nullDateTimeZone();
        __CLR4_4_1va6va6lgchos39.R.inc(40690);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40691);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40692);TB.testConstructor_Object1_Chronology();
        __CLR4_4_1va6va6lgchos39.R.inc(40693);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40694);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40695);TB.testConstructor_Object2_Chronology();
        __CLR4_4_1va6va6lgchos39.R.inc(40696);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40697);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40698);TB.testConstructor_nullObject_Chronology();
        __CLR4_4_1va6va6lgchos39.R.inc(40699);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40700);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40701);TB.testConstructor_Object_nullChronology();
        __CLR4_4_1va6va6lgchos39.R.inc(40702);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40703);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40704);TB.testConstructor_nullObject_nullChronology();
        __CLR4_4_1va6va6lgchos39.R.inc(40705);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40706);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40707);TB.testConstructor_int_int();
        __CLR4_4_1va6va6lgchos39.R.inc(40708);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40709);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40710);TB.testConstructor_int_int_int();
        __CLR4_4_1va6va6lgchos39.R.inc(40711);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40712);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40713);TB.testConstructor_int_int_int_int();
        __CLR4_4_1va6va6lgchos39.R.inc(40714);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40715);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40716);TB.testConstructor_int_int_int_int_Chronology();
        __CLR4_4_1va6va6lgchos39.R.inc(40717);TB.tearDown();
        __CLR4_4_1va6va6lgchos39.R.inc(40718);TB.setUp();
        __CLR4_4_1va6va6lgchos39.R.inc(40719);TB.testConstructor_int_int_int_int_nullChronology();
        __CLR4_4_1va6va6lgchos39.R.inc(40720);TB.tearDown();

    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestLocalTime_Constructors.class);
    }

    public TestLocalTime_Constructors(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1va6va6lgchos39.R.inc(40721);
        __CLR4_4_1va6va6lgchos39.R.inc(40722);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1va6va6lgchos39.R.inc(40723);zone = DateTimeZone.getDefault();
        __CLR4_4_1va6va6lgchos39.R.inc(40724);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1va6va6lgchos39.R.inc(40725);java.util.TimeZone.setDefault(LONDON.toTimeZone());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1va6va6lgchos39.R.inc(40726);
        __CLR4_4_1va6va6lgchos39.R.inc(40727);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1va6va6lgchos39.R.inc(40728);DateTimeZone.setDefault(zone);
        __CLR4_4_1va6va6lgchos39.R.inc(40729);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1va6va6lgchos39.R.inc(40730);zone = null;
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor ()
     */
    @Test
    public void testConstantMidnight() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i1ix4jvff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstantMidnight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i1ix4jvff() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40731);
        __CLR4_4_1va6va6lgchos39.R.inc(40732);LocalTime test = LocalTime.MIDNIGHT;
        __CLR4_4_1va6va6lgchos39.R.inc(40733);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40734);assertEquals(0, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40735);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40736);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40737);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqvivfm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqvivfm() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40738);
        __CLR4_4_1va6va6lgchos39.R.inc(40739);assertEquals(new LocalTime(1, 20), LocalTime.parse("01:20"));
        __CLR4_4_1va6va6lgchos39.R.inc(40740);assertEquals(new LocalTime(14, 50, 30, 432), LocalTime.parse("14:50:30.432"));
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testParse_formatter() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wvtnxvfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testParse_formatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wvtnxvfp() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40741);
        __CLR4_4_1va6va6lgchos39.R.inc(40742);DateTimeFormatter f = DateTimeFormat.forPattern("HH mm").withChronology(ISOChronology.getInstance(PARIS));
        __CLR4_4_1va6va6lgchos39.R.inc(40743);assertEquals(new LocalTime(13, 30), LocalTime.parse("13 30", f));
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_FromCalendarFields_Calendar() throws Exception {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19mnvhgvfs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactory_FromCalendarFields_Calendar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19mnvhgvfs() throws Exception{try{__CLR4_4_1va6va6lgchos39.R.inc(40744);
        __CLR4_4_1va6va6lgchos39.R.inc(40745);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_1va6va6lgchos39.R.inc(40746);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1va6va6lgchos39.R.inc(40747);LocalTime expected = new LocalTime(4, 5, 6, 7);
        __CLR4_4_1va6va6lgchos39.R.inc(40748);assertEquals(expected, LocalTime.fromCalendarFields(cal));
        __CLR4_4_1va6va6lgchos39.R.inc(40749);try {
            __CLR4_4_1va6va6lgchos39.R.inc(40750);LocalTime.fromCalendarFields((Calendar) null);
            __CLR4_4_1va6va6lgchos39.R.inc(40751);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_FromDateFields_after1970() throws Exception {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c9oalfvg0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactory_FromDateFields_after1970",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40752,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c9oalfvg0() throws Exception{try{__CLR4_4_1va6va6lgchos39.R.inc(40752);
        __CLR4_4_1va6va6lgchos39.R.inc(40753);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_1va6va6lgchos39.R.inc(40754);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1va6va6lgchos39.R.inc(40755);LocalTime expected = new LocalTime(4, 5, 6, 7);
        __CLR4_4_1va6va6lgchos39.R.inc(40756);assertEquals(expected, LocalTime.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testFactory_FromDateFields_before1970() throws Exception {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bn26q6vg5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactory_FromDateFields_before1970",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40757,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bn26q6vg5() throws Exception{try{__CLR4_4_1va6va6lgchos39.R.inc(40757);
        __CLR4_4_1va6va6lgchos39.R.inc(40758);GregorianCalendar cal = new GregorianCalendar(1969, 1, 3, 4, 5, 6);
        __CLR4_4_1va6va6lgchos39.R.inc(40759);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1va6va6lgchos39.R.inc(40760);LocalTime expected = new LocalTime(4, 5, 6, 7);
        __CLR4_4_1va6va6lgchos39.R.inc(40761);assertEquals(expected, LocalTime.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testFactory_FromDateFields_null() throws Exception {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y25f1xvga();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactory_FromDateFields_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40762,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y25f1xvga() throws Exception{try{__CLR4_4_1va6va6lgchos39.R.inc(40762);
        __CLR4_4_1va6va6lgchos39.R.inc(40763);try {
            __CLR4_4_1va6va6lgchos39.R.inc(40764);LocalTime.fromDateFields((Date) null);
            __CLR4_4_1va6va6lgchos39.R.inc(40765);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactoryMillisOfDay_long() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16afjz9vge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactoryMillisOfDay_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16afjz9vge() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40766);
        __CLR4_4_1va6va6lgchos39.R.inc(40767);LocalTime test = LocalTime.fromMillisOfDay(TEST_TIME1);
        __CLR4_4_1va6va6lgchos39.R.inc(40768);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40769);assertEquals(1, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40770);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40771);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40772);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactoryMillisOfDay_long_Chronology() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k6rryuvgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactoryMillisOfDay_long_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k6rryuvgl() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40773);
        __CLR4_4_1va6va6lgchos39.R.inc(40774);LocalTime test = LocalTime.fromMillisOfDay(TEST_TIME1, JULIAN_LONDON);
        __CLR4_4_1va6va6lgchos39.R.inc(40775);assertEquals(JULIAN_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40776);assertEquals(1, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40777);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40778);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40779);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testFactoryMillisOfDay_long_nullChronology() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nd19g1vgs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testFactoryMillisOfDay_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nd19g1vgs() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40780);
        __CLR4_4_1va6va6lgchos39.R.inc(40781);LocalTime test = LocalTime.fromMillisOfDay(TEST_TIME1, null);
        __CLR4_4_1va6va6lgchos39.R.inc(40782);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40783);assertEquals(1, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40784);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40785);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40786);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8hvgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8hvgz() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40787);
        __CLR4_4_1va6va6lgchos39.R.inc(40788);LocalTime test = new LocalTime();
        __CLR4_4_1va6va6lgchos39.R.inc(40789);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40790);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40791);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40792);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40793);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1va6va6lgchos39.R.inc(40794);assertEquals(test, LocalTime.now());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_DateTimeZone() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4m1k5vh7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4m1k5vh7() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40795);
        __CLR4_4_1va6va6lgchos39.R.inc(40796);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 30, 40, LONDON);
        __CLR4_4_1va6va6lgchos39.R.inc(40797);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris

        __CLR4_4_1va6va6lgchos39.R.inc(40798);LocalTime test = new LocalTime(LONDON);
        __CLR4_4_1va6va6lgchos39.R.inc(40799);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40800);assertEquals(23, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40801);assertEquals(59, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40802);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40803);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1va6va6lgchos39.R.inc(40804);assertEquals(test, LocalTime.now(LONDON));

        __CLR4_4_1va6va6lgchos39.R.inc(40805);test = new LocalTime(PARIS);
        __CLR4_4_1va6va6lgchos39.R.inc(40806);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40807);assertEquals(0, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40808);assertEquals(59, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40809);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40810);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1va6va6lgchos39.R.inc(40811);assertEquals(test, LocalTime.now(PARIS));
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_nullDateTimeZone() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zs1rovho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zs1rovho() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40812);
        __CLR4_4_1va6va6lgchos39.R.inc(40813);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 30, 40, LONDON);
        __CLR4_4_1va6va6lgchos39.R.inc(40814);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris

        __CLR4_4_1va6va6lgchos39.R.inc(40815);LocalTime test = new LocalTime((DateTimeZone) null);
        __CLR4_4_1va6va6lgchos39.R.inc(40816);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40817);assertEquals(23, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40818);assertEquals(59, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40819);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40820);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_Chronology() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15931tivhx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15931tivhx() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40821);
        __CLR4_4_1va6va6lgchos39.R.inc(40822);LocalTime test = new LocalTime(JULIAN_LONDON);
        __CLR4_4_1va6va6lgchos39.R.inc(40823);assertEquals(JULIAN_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40824);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40825);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40826);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40827);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1va6va6lgchos39.R.inc(40828);assertEquals(test, LocalTime.now(JULIAN_LONDON));
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_nullChronology() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qcb6rvi5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qcb6rvi5() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40829);
        __CLR4_4_1va6va6lgchos39.R.inc(40830);LocalTime test = new LocalTime((Chronology) null);
        __CLR4_4_1va6va6lgchos39.R.inc(40831);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40832);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40833);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40834);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40835);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long1() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13crvic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13crvic() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40836);
        __CLR4_4_1va6va6lgchos39.R.inc(40837);LocalTime test = new LocalTime(TEST_TIME1);
        __CLR4_4_1va6va6lgchos39.R.inc(40838);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40839);assertEquals(1 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40840);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40841);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40842);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_long2() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914kavij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914kavij() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40843);
        __CLR4_4_1va6va6lgchos39.R.inc(40844);LocalTime test = new LocalTime(TEST_TIME2);
        __CLR4_4_1va6va6lgchos39.R.inc(40845);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40846);assertEquals(5 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40847);assertEquals(6, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40848);assertEquals(7, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40849);assertEquals(8, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long_DateTimeZone() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kzpm56viq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_long_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40850,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kzpm56viq() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40850);
        __CLR4_4_1va6va6lgchos39.R.inc(40851);LocalTime test = new LocalTime(TEST_TIME1, PARIS);
        __CLR4_4_1va6va6lgchos39.R.inc(40852);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40853);assertEquals(1 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40854);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40855);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40856);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_long_DateTimeZone_2() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17yks19vix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_long_DateTimeZone_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17yks19vix() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40857);
        __CLR4_4_1va6va6lgchos39.R.inc(40858);DateTime dt = new DateTime(2007, 6, 9, 1, 2, 3, 4, PARIS);
        __CLR4_4_1va6va6lgchos39.R.inc(40859);DateTime dtUTC = new DateTime(1970, 1, 1, 1, 2, 3, 4, DateTimeZone.UTC);

        __CLR4_4_1va6va6lgchos39.R.inc(40860);LocalTime test = new LocalTime(dt.getMillis(), PARIS);
        __CLR4_4_1va6va6lgchos39.R.inc(40861);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40862);assertEquals(1, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40863);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40864);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40865);assertEquals(4, test.getMillisOfSecond());
        __CLR4_4_1va6va6lgchos39.R.inc(40866);assertEquals(dtUTC.getMillis(), test.getLocalMillis());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_long_nullDateTimeZone() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uv35a9vj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_long_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uv35a9vj7() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40867);
        __CLR4_4_1va6va6lgchos39.R.inc(40868);LocalTime test = new LocalTime(TEST_TIME1, (DateTimeZone) null);
        __CLR4_4_1va6va6lgchos39.R.inc(40869);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40870);assertEquals(1 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40871);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40872);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40873);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long1_Chronology() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115wn5svje();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_long1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115wn5svje() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40874);
        __CLR4_4_1va6va6lgchos39.R.inc(40875);LocalTime test = new LocalTime(TEST_TIME1, JULIAN_PARIS);
        __CLR4_4_1va6va6lgchos39.R.inc(40876);assertEquals(JULIAN_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40877);assertEquals(1 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40878);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40879);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40880);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_long2_Chronology() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14nqmkhvjl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_long2_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14nqmkhvjl() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40881);
        __CLR4_4_1va6va6lgchos39.R.inc(40882);LocalTime test = new LocalTime(TEST_TIME2, JULIAN_LONDON);
        __CLR4_4_1va6va6lgchos39.R.inc(40883);assertEquals(JULIAN_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40884);assertEquals(5 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40885);assertEquals(6, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40886);assertEquals(7, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40887);assertEquals(8, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_long_nullChronology() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnhckuvjs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40888,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnhckuvjs() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40888);
        __CLR4_4_1va6va6lgchos39.R.inc(40889);LocalTime test = new LocalTime(TEST_TIME1, (Chronology) null);
        __CLR4_4_1va6va6lgchos39.R.inc(40890);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40891);assertEquals(1 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40892);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40893);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40894);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_Object1() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19oqxcyvjz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40895,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19oqxcyvjz() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40895);
        __CLR4_4_1va6va6lgchos39.R.inc(40896);Date date = new Date(TEST_TIME1);
        __CLR4_4_1va6va6lgchos39.R.inc(40897);LocalTime test = new LocalTime(date);
        __CLR4_4_1va6va6lgchos39.R.inc(40898);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40899);assertEquals(1 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40900);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40901);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40902);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_Object2() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxqw5fvk7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_Object2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxqw5fvk7() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40903);
        __CLR4_4_1va6va6lgchos39.R.inc(40904);Calendar cal = new GregorianCalendar();
        __CLR4_4_1va6va6lgchos39.R.inc(40905);cal.setTime(new Date(TEST_TIME1));
        __CLR4_4_1va6va6lgchos39.R.inc(40906);LocalTime test = new LocalTime(cal);
        __CLR4_4_1va6va6lgchos39.R.inc(40907);assertEquals(GJChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40908);assertEquals(1 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40909);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40910);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40911);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_nullObject() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt59ukvkg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_nullObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt59ukvkg() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40912);
        __CLR4_4_1va6va6lgchos39.R.inc(40913);LocalTime test = new LocalTime((Object) null);
        __CLR4_4_1va6va6lgchos39.R.inc(40914);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40915);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40916);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40917);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40918);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString1() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11c2b5dvkn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectString1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40919,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11c2b5dvkn() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40919);
        __CLR4_4_1va6va6lgchos39.R.inc(40920);LocalTime test = new LocalTime("10:20:30.040");
        __CLR4_4_1va6va6lgchos39.R.inc(40921);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40922);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40923);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40924);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40925);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString1Tokyo() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcknmlvku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectString1Tokyo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40926,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcknmlvku() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40926);
        __CLR4_4_1va6va6lgchos39.R.inc(40927);DateTimeZone.setDefault(TOKYO);
        __CLR4_4_1va6va6lgchos39.R.inc(40928);LocalTime test = new LocalTime("10:20:30.040");
        __CLR4_4_1va6va6lgchos39.R.inc(40929);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40930);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40931);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40932);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40933);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString1NewYork() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e193vwvl2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectString1NewYork",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e193vwvl2() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40934);
        __CLR4_4_1va6va6lgchos39.R.inc(40935);DateTimeZone.setDefault(NEW_YORK);
        __CLR4_4_1va6va6lgchos39.R.inc(40936);LocalTime test = new LocalTime("10:20:30.040");
        __CLR4_4_1va6va6lgchos39.R.inc(40937);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40938);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40939);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40940);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40941);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString2() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14l29xuvla();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectString2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40942,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14l29xuvla() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40942);
        __CLR4_4_1va6va6lgchos39.R.inc(40943);LocalTime test = new LocalTime("T10:20:30.040");
        __CLR4_4_1va6va6lgchos39.R.inc(40944);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40945);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40946);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40947);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40948);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString3() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17u28qbvlh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectString3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17u28qbvlh() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40949);
        __CLR4_4_1va6va6lgchos39.R.inc(40950);LocalTime test = new LocalTime("10:20");
        __CLR4_4_1va6va6lgchos39.R.inc(40951);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40952);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40953);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40954);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40955);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString4() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b327isvlo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectString4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b327isvlo() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40956);
        __CLR4_4_1va6va6lgchos39.R.inc(40957);LocalTime test = new LocalTime("10");
        __CLR4_4_1va6va6lgchos39.R.inc(40958);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40959);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40960);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40961);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40962);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx1() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11daulevlv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectStringEx1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11daulevlv() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40963);
        __CLR4_4_1va6va6lgchos39.R.inc(40964);try {
            __CLR4_4_1va6va6lgchos39.R.inc(40965);new LocalTime("1970-04-06");
            __CLR4_4_1va6va6lgchos39.R.inc(40966);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx2() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vp473vlz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectStringEx2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vp473vlz() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40967);
        __CLR4_4_1va6va6lgchos39.R.inc(40968);try {
            __CLR4_4_1va6va6lgchos39.R.inc(40969);new LocalTime("1970-04-06T+14:00");
            __CLR4_4_1va6va6lgchos39.R.inc(40970);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx3() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_154p2zkvm3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectStringEx3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_154p2zkvm3() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40971);
        __CLR4_4_1va6va6lgchos39.R.inc(40972);try {
            __CLR4_4_1va6va6lgchos39.R.inc(40973);new LocalTime("1970-04-06T10:20:30.040");
            __CLR4_4_1va6va6lgchos39.R.inc(40974);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx4() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18dp1s1vm7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectStringEx4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18dp1s1vm7() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40975);
        __CLR4_4_1va6va6lgchos39.R.inc(40976);try {
            __CLR4_4_1va6va6lgchos39.R.inc(40977);new LocalTime("1970-04-06T10:20:30.040+14:00");
            __CLR4_4_1va6va6lgchos39.R.inc(40978);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx5() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bmp0kivmb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectStringEx5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bmp0kivmb() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40979);
        __CLR4_4_1va6va6lgchos39.R.inc(40980);try {
            __CLR4_4_1va6va6lgchos39.R.inc(40981);new LocalTime("T10:20:30.040+04:00");
            __CLR4_4_1va6va6lgchos39.R.inc(40982);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx6() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1evozczvmf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectStringEx6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40983,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1evozczvmf() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40983);
        __CLR4_4_1va6va6lgchos39.R.inc(40984);try {
            __CLR4_4_1va6va6lgchos39.R.inc(40985);new LocalTime("10:20:30.040+04:00");
            __CLR4_4_1va6va6lgchos39.R.inc(40986);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectLocalTime() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18d94w9vmj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectLocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18d94w9vmj() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40987);
        __CLR4_4_1va6va6lgchos39.R.inc(40988);LocalTime time = new LocalTime(10, 20, 30, 40, BUDDHIST_UTC);
        __CLR4_4_1va6va6lgchos39.R.inc(40989);LocalTime test = new LocalTime(time);
        __CLR4_4_1va6va6lgchos39.R.inc(40990);assertEquals(BUDDHIST_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(40991);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(40992);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(40993);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(40994);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectLocalDate() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),40995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1drwkayvmr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40995,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1drwkayvmr() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(40995);
        __CLR4_4_1va6va6lgchos39.R.inc(40996);LocalDate date = new LocalDate(1970, 4, 6, BUDDHIST_UTC);
        __CLR4_4_1va6va6lgchos39.R.inc(40997);try {
            __CLR4_4_1va6va6lgchos39.R.inc(40998);new LocalTime(date);
            __CLR4_4_1va6va6lgchos39.R.inc(40999);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectLocalDateTime() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),41000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kto907vmw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectLocalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kto907vmw() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(41000);
        __CLR4_4_1va6va6lgchos39.R.inc(41001);LocalDateTime dt = new LocalDateTime(1970, 5, 6, 10, 20, 30, 40, BUDDHIST_UTC);
        __CLR4_4_1va6va6lgchos39.R.inc(41002);LocalTime test = new LocalTime(dt);
        __CLR4_4_1va6va6lgchos39.R.inc(41003);assertEquals(BUDDHIST_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(41004);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(41005);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(41006);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(41007);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructor_ObjectTimeOfDay() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),41008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xkvwyxvn4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectTimeOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xkvwyxvn4() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(41008);
        __CLR4_4_1va6va6lgchos39.R.inc(41009);TimeOfDay time = new TimeOfDay(10, 20, 30, 40, BUDDHIST_UTC);
        __CLR4_4_1va6va6lgchos39.R.inc(41010);LocalTime test = new LocalTime(time);
        __CLR4_4_1va6va6lgchos39.R.inc(41011);assertEquals(BUDDHIST_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(41012);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(41013);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(41014);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(41015);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_Object1_DateTimeZone() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),41016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mto1cevnc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_Object1_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mto1cevnc() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(41016);
        __CLR4_4_1va6va6lgchos39.R.inc(41017);Date date = new Date(TEST_TIME1);
        __CLR4_4_1va6va6lgchos39.R.inc(41018);LocalTime test = new LocalTime(date, PARIS);
        __CLR4_4_1va6va6lgchos39.R.inc(41019);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(41020);assertEquals(1 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(41021);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(41022);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(41023);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString_DateTimeZoneLondon() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),41024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1fslavnk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectString_DateTimeZoneLondon",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41024,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1fslavnk() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(41024);
        __CLR4_4_1va6va6lgchos39.R.inc(41025);LocalTime test = new LocalTime("04:20", LONDON);
        __CLR4_4_1va6va6lgchos39.R.inc(41026);assertEquals(4, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(41027);assertEquals(20, test.getMinuteOfHour());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString_DateTimeZoneTokyo() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),41028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uilxbivno();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectString_DateTimeZoneTokyo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41028,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uilxbivno() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(41028);
        __CLR4_4_1va6va6lgchos39.R.inc(41029);LocalTime test = new LocalTime("04:20", TOKYO);
        __CLR4_4_1va6va6lgchos39.R.inc(41030);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(41031);assertEquals(4, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(41032);assertEquals(20, test.getMinuteOfHour());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString_DateTimeZoneNewYork() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),41033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vcrz9lvnt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_ObjectString_DateTimeZoneNewYork",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41033,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vcrz9lvnt() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(41033);
        __CLR4_4_1va6va6lgchos39.R.inc(41034);LocalTime test = new LocalTime("04:20", NEW_YORK);
        __CLR4_4_1va6va6lgchos39.R.inc(41035);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(41036);assertEquals(4, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(41037);assertEquals(20, test.getMinuteOfHour());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_nullObject_DateTimeZone() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),41038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxoowgvny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_nullObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxoowgvny() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(41038);
        __CLR4_4_1va6va6lgchos39.R.inc(41039);LocalTime test = new LocalTime((Object) null, PARIS);
        __CLR4_4_1va6va6lgchos39.R.inc(41040);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(41041);assertEquals(10 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(41042);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(41043);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(41044);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_Object_nullDateTimeZone() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),41045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151w5y6vo5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_Object_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151w5y6vo5() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(41045);
        __CLR4_4_1va6va6lgchos39.R.inc(41046);Date date = new Date(TEST_TIME1);
        __CLR4_4_1va6va6lgchos39.R.inc(41047);LocalTime test = new LocalTime(date, (DateTimeZone) null);
        __CLR4_4_1va6va6lgchos39.R.inc(41048);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(41049);assertEquals(1 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(41050);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(41051);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(41052);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_nullObject_nullDateTimeZone() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),41053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hv60h5vod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_nullObject_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41053,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hv60h5vod() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(41053);
        __CLR4_4_1va6va6lgchos39.R.inc(41054);LocalTime test = new LocalTime((Object) null, (DateTimeZone) null);
        __CLR4_4_1va6va6lgchos39.R.inc(41055);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(41056);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(41057);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(41058);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(41059);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_Object1_Chronology() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),41060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17w29z1vok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_Object1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17w29z1vok() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(41060);
        __CLR4_4_1va6va6lgchos39.R.inc(41061);Date date = new Date(TEST_TIME1);
        __CLR4_4_1va6va6lgchos39.R.inc(41062);LocalTime test = new LocalTime(date, JULIAN_LONDON);
        __CLR4_4_1va6va6lgchos39.R.inc(41063);assertEquals(JULIAN_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(41064);assertEquals(1 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(41065);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(41066);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(41067);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_Object2_Chronology() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),41068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bdw9dqvos();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_Object2_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41068,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bdw9dqvos() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(41068);
        __CLR4_4_1va6va6lgchos39.R.inc(41069);LocalTime test = new LocalTime("T10:20");
        __CLR4_4_1va6va6lgchos39.R.inc(41070);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(41071);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(41072);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(41073);assertEquals(0, test.getMillisOfSecond());

        __CLR4_4_1va6va6lgchos39.R.inc(41074);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41075);new LocalTime("T1020");
            __CLR4_4_1va6va6lgchos39.R.inc(41076);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_nullObject_Chronology() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),41077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q0uynvp1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_nullObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q0uynvp1() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(41077);
        __CLR4_4_1va6va6lgchos39.R.inc(41078);LocalTime test = new LocalTime((Object) null, JULIAN_LONDON);
        __CLR4_4_1va6va6lgchos39.R.inc(41079);assertEquals(JULIAN_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(41080);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(41081);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(41082);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(41083);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_Object_nullChronology() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),41084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yccijzvp8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41084,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yccijzvp8() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(41084);
        __CLR4_4_1va6va6lgchos39.R.inc(41085);Date date = new Date(TEST_TIME1);
        __CLR4_4_1va6va6lgchos39.R.inc(41086);LocalTime test = new LocalTime(date, (Chronology) null);
        __CLR4_4_1va6va6lgchos39.R.inc(41087);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(41088);assertEquals(1 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(41089);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(41090);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(41091);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_nullObject_nullChronology() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),41092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dtve0vpg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_nullObject_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dtve0vpg() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(41092);
        __CLR4_4_1va6va6lgchos39.R.inc(41093);LocalTime test = new LocalTime((Object) null, (Chronology) null);
        __CLR4_4_1va6va6lgchos39.R.inc(41094);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(41095);assertEquals(10 + OFFSET_LONDON, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(41096);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(41097);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(41098);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_int_int() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),41099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5ioxbvpn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5ioxbvpn() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(41099);
        __CLR4_4_1va6va6lgchos39.R.inc(41100);LocalTime test = new LocalTime(10, 20);
        __CLR4_4_1va6va6lgchos39.R.inc(41101);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(41102);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(41103);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(41104);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(41105);assertEquals(0, test.getMillisOfSecond());
        __CLR4_4_1va6va6lgchos39.R.inc(41106);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41107);new LocalTime(-1, 20);
            __CLR4_4_1va6va6lgchos39.R.inc(41108);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1va6va6lgchos39.R.inc(41109);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41110);new LocalTime(24, 20);
            __CLR4_4_1va6va6lgchos39.R.inc(41111);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1va6va6lgchos39.R.inc(41112);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41113);new LocalTime(10, -1);
            __CLR4_4_1va6va6lgchos39.R.inc(41114);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1va6va6lgchos39.R.inc(41115);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41116);new LocalTime(10, 60);
            __CLR4_4_1va6va6lgchos39.R.inc(41117);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_int_int_int() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),41118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bd9uqnvq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bd9uqnvq6() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(41118);
        __CLR4_4_1va6va6lgchos39.R.inc(41119);LocalTime test = new LocalTime(10, 20, 30);
        __CLR4_4_1va6va6lgchos39.R.inc(41120);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(41121);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(41122);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(41123);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(41124);assertEquals(0, test.getMillisOfSecond());
        __CLR4_4_1va6va6lgchos39.R.inc(41125);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41126);new LocalTime(-1, 20, 30);
            __CLR4_4_1va6va6lgchos39.R.inc(41127);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1va6va6lgchos39.R.inc(41128);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41129);new LocalTime(24, 20, 30);
            __CLR4_4_1va6va6lgchos39.R.inc(41130);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1va6va6lgchos39.R.inc(41131);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41132);new LocalTime(10, -1, 30);
            __CLR4_4_1va6va6lgchos39.R.inc(41133);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1va6va6lgchos39.R.inc(41134);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41135);new LocalTime(10, 60, 30);
            __CLR4_4_1va6va6lgchos39.R.inc(41136);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1va6va6lgchos39.R.inc(41137);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41138);new LocalTime(10, 20, -1);
            __CLR4_4_1va6va6lgchos39.R.inc(41139);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1va6va6lgchos39.R.inc(41140);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41141);new LocalTime(10, 20, 60);
            __CLR4_4_1va6va6lgchos39.R.inc(41142);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_int_int_int_int() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),41143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hjvai9vqv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_int_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hjvai9vqv() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(41143);
        __CLR4_4_1va6va6lgchos39.R.inc(41144);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1va6va6lgchos39.R.inc(41145);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(41146);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(41147);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(41148);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(41149);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1va6va6lgchos39.R.inc(41150);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41151);new LocalTime(-1, 20, 30, 40);
            __CLR4_4_1va6va6lgchos39.R.inc(41152);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1va6va6lgchos39.R.inc(41153);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41154);new LocalTime(24, 20, 30, 40);
            __CLR4_4_1va6va6lgchos39.R.inc(41155);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1va6va6lgchos39.R.inc(41156);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41157);new LocalTime(10, -1, 30, 40);
            __CLR4_4_1va6va6lgchos39.R.inc(41158);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1va6va6lgchos39.R.inc(41159);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41160);new LocalTime(10, 60, 30, 40);
            __CLR4_4_1va6va6lgchos39.R.inc(41161);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1va6va6lgchos39.R.inc(41162);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41163);new LocalTime(10, 20, -1, 40);
            __CLR4_4_1va6va6lgchos39.R.inc(41164);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1va6va6lgchos39.R.inc(41165);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41166);new LocalTime(10, 20, 60, 40);
            __CLR4_4_1va6va6lgchos39.R.inc(41167);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1va6va6lgchos39.R.inc(41168);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41169);new LocalTime(10, 20, 30, -1);
            __CLR4_4_1va6va6lgchos39.R.inc(41170);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1va6va6lgchos39.R.inc(41171);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41172);new LocalTime(10, 20, 30, 1000);
            __CLR4_4_1va6va6lgchos39.R.inc(41173);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_int_int_int_int_Chronology() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),41174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152fm4qvrq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_int_int_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152fm4qvrq() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(41174);
        __CLR4_4_1va6va6lgchos39.R.inc(41175);LocalTime test = new LocalTime(10, 20, 30, 40, JULIAN_LONDON);
        __CLR4_4_1va6va6lgchos39.R.inc(41176);assertEquals(JULIAN_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(41177);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(41178);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(41179);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(41180);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1va6va6lgchos39.R.inc(41181);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41182);new LocalTime(-1, 20, 30, 40, JULIAN_LONDON);
            __CLR4_4_1va6va6lgchos39.R.inc(41183);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1va6va6lgchos39.R.inc(41184);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41185);new LocalTime(24, 20, 30, 40, JULIAN_LONDON);
            __CLR4_4_1va6va6lgchos39.R.inc(41186);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1va6va6lgchos39.R.inc(41187);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41188);new LocalTime(10, -1, 30, 40, JULIAN_LONDON);
            __CLR4_4_1va6va6lgchos39.R.inc(41189);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1va6va6lgchos39.R.inc(41190);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41191);new LocalTime(10, 60, 30, 40, JULIAN_LONDON);
            __CLR4_4_1va6va6lgchos39.R.inc(41192);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1va6va6lgchos39.R.inc(41193);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41194);new LocalTime(10, 20, -1, 40, JULIAN_LONDON);
            __CLR4_4_1va6va6lgchos39.R.inc(41195);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1va6va6lgchos39.R.inc(41196);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41197);new LocalTime(10, 20, 60, 40, JULIAN_LONDON);
            __CLR4_4_1va6va6lgchos39.R.inc(41198);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1va6va6lgchos39.R.inc(41199);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41200);new LocalTime(10, 20, 30, -1, JULIAN_LONDON);
            __CLR4_4_1va6va6lgchos39.R.inc(41201);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1va6va6lgchos39.R.inc(41202);try {
            __CLR4_4_1va6va6lgchos39.R.inc(41203);new LocalTime(10, 20, 30, 1000, JULIAN_LONDON);
            __CLR4_4_1va6va6lgchos39.R.inc(41204);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

    @Test
    public void testConstructor_int_int_int_int_nullChronology() throws Throwable {__CLR4_4_1va6va6lgchos39.R.globalSliceStart(getClass().getName(),41205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ah63rxvsl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1va6va6lgchos39.R.rethrow($CLV_t2$);}finally{__CLR4_4_1va6va6lgchos39.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Constructors.testConstructor_int_int_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ah63rxvsl() throws Throwable{try{__CLR4_4_1va6va6lgchos39.R.inc(41205);
        __CLR4_4_1va6va6lgchos39.R.inc(41206);LocalTime test = new LocalTime(10, 20, 30, 40, null);
        __CLR4_4_1va6va6lgchos39.R.inc(41207);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1va6va6lgchos39.R.inc(41208);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1va6va6lgchos39.R.inc(41209);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1va6va6lgchos39.R.inc(41210);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1va6va6lgchos39.R.inc(41211);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1va6va6lgchos39.R.flushNeeded();}}

}
