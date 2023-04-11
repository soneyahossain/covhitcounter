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
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDateTime_Constructors {static class __CLR4_4_1rzurzulgchorys{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,36992,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone MOSCOW = DateTimeZone.forID("Europe/Moscow");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    private static final Chronology GREGORIAN_MOSCOW = GregorianChronology.getInstance(MOSCOW);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final int OFFSET_PARIS = PARIS.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;
    private static final int OFFSET_MOSCOW = MOSCOW.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;

    private long MILLIS_OF_DAY =
            10L * DateTimeConstants.MILLIS_PER_HOUR
                    + 20L * DateTimeConstants.MILLIS_PER_MINUTE
                    + 30L * DateTimeConstants.MILLIS_PER_SECOND
                    + 40L;
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + MILLIS_OF_DAY;

    private long TEST_TIME1 =
            (31L + 28L + 31L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 12L * DateTimeConstants.MILLIS_PER_HOUR
                    + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME2 =
            (365L + 31L + 28L + 31L + 30L + 7L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 14L * DateTimeConstants.MILLIS_PER_HOUR
                    + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Throwable {try{__CLR4_4_1rzurzulgchorys.R.inc(36282);
        __CLR4_4_1rzurzulgchorys.R.inc(36283);TestLocalDateTime_Constructors TB = new TestLocalDateTime_Constructors();
        __CLR4_4_1rzurzulgchorys.R.inc(36284);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36285);TB.testParse_noFormatter();
        __CLR4_4_1rzurzulgchorys.R.inc(36286);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36287);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36288);TB.testParse_formatter();
        __CLR4_4_1rzurzulgchorys.R.inc(36289);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36290);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36291);TB.testFactory_fromCalendarFields();
        __CLR4_4_1rzurzulgchorys.R.inc(36292);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36293);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36294);TB.testFactory_fromCalendarFields_beforeYearZero1();
        __CLR4_4_1rzurzulgchorys.R.inc(36295);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36296);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36297);TB.testFactory_fromCalendarFields_beforeYearZero3();
        __CLR4_4_1rzurzulgchorys.R.inc(36298);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36299);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36300);TB.testFactory_fromCalendarFields_null();
        __CLR4_4_1rzurzulgchorys.R.inc(36301);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36302);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36303);TB.testFactory_fromDateFields_after1970();
        __CLR4_4_1rzurzulgchorys.R.inc(36304);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36305);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36306);TB.testFactory_fromDateFields_before1970();
        __CLR4_4_1rzurzulgchorys.R.inc(36307);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36308);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36309);TB.testFactory_fromDateFields_beforeYearZero1();
        __CLR4_4_1rzurzulgchorys.R.inc(36310);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36311);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36312);TB.testFactory_fromDateFields_beforeYearZero3();
        __CLR4_4_1rzurzulgchorys.R.inc(36313);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36314);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36315);TB.testFactory_fromDateFields_null();
        __CLR4_4_1rzurzulgchorys.R.inc(36316);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36317);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36318);TB.testConstructor();
        __CLR4_4_1rzurzulgchorys.R.inc(36319);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36320);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36321);TB.testConstructor_DateTimeZone();
        __CLR4_4_1rzurzulgchorys.R.inc(36322);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36323);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36324);TB.testConstructor_nullDateTimeZone();
        __CLR4_4_1rzurzulgchorys.R.inc(36325);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36326);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36327);TB.testConstructor_Chronology();
        __CLR4_4_1rzurzulgchorys.R.inc(36328);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36329);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36330);TB.testConstructor_nullChronology();
        __CLR4_4_1rzurzulgchorys.R.inc(36331);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36332);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36333);TB.testConstructor_long1();
        __CLR4_4_1rzurzulgchorys.R.inc(36334);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36335);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36336);TB.testConstructor_long2();
        __CLR4_4_1rzurzulgchorys.R.inc(36337);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36338);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36339);TB.testConstructor_long1_DateTimeZone();
        __CLR4_4_1rzurzulgchorys.R.inc(36340);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36341);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36342);TB.testConstructor_long2_DateTimeZone();
        __CLR4_4_1rzurzulgchorys.R.inc(36343);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36344);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36345);TB.testConstructor_long_nullDateTimeZone();
        __CLR4_4_1rzurzulgchorys.R.inc(36346);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36347);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36348);TB.testConstructor_long1_Chronology();
        __CLR4_4_1rzurzulgchorys.R.inc(36349);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36350);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36351);TB.testConstructor_long2_Chronology();
        __CLR4_4_1rzurzulgchorys.R.inc(36352);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36353);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36354);TB.testConstructor_long_nullChronology();
        __CLR4_4_1rzurzulgchorys.R.inc(36355);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36356);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36357);TB.testConstructor_Object1();
        __CLR4_4_1rzurzulgchorys.R.inc(36358);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36359);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36360);TB.testConstructor_nullObject();
        __CLR4_4_1rzurzulgchorys.R.inc(36361);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36362);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36363);TB.testConstructor_ObjectString1();
        __CLR4_4_1rzurzulgchorys.R.inc(36364);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36365);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36366);TB.testConstructor_ObjectString2();
        __CLR4_4_1rzurzulgchorys.R.inc(36367);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36368);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36369);TB.testConstructor_ObjectString3();
        __CLR4_4_1rzurzulgchorys.R.inc(36370);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36371);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36372);TB.testConstructor_ObjectString4();
        __CLR4_4_1rzurzulgchorys.R.inc(36373);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36374);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36375);TB.testConstructor_ObjectStringEx1();
        __CLR4_4_1rzurzulgchorys.R.inc(36376);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36377);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36378);TB.testConstructor_ObjectStringEx2();
        __CLR4_4_1rzurzulgchorys.R.inc(36379);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36380);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36381);TB.testConstructor_ObjectStringEx3();
        __CLR4_4_1rzurzulgchorys.R.inc(36382);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36383);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36384);TB.testConstructor_ObjectStringEx4();
        __CLR4_4_1rzurzulgchorys.R.inc(36385);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36386);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36387);TB.testConstructor_ObjectStringEx5();
        __CLR4_4_1rzurzulgchorys.R.inc(36388);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36389);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36390);TB.testConstructor_ObjectStringEx6();
        __CLR4_4_1rzurzulgchorys.R.inc(36391);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36392);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36393);TB.testConstructor_ObjectLocalDateTime();
        __CLR4_4_1rzurzulgchorys.R.inc(36394);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36395);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36396);TB.testConstructor_ObjectLocalDate();
        __CLR4_4_1rzurzulgchorys.R.inc(36397);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36398);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36399);TB.testConstructor_ObjectLocalTime();
        __CLR4_4_1rzurzulgchorys.R.inc(36400);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36401);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36402);TB.testConstructor_Object_DateTimeZone();
        __CLR4_4_1rzurzulgchorys.R.inc(36403);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36404);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36405);TB.testConstructor_Object_DateTimeZoneMoscow();
        __CLR4_4_1rzurzulgchorys.R.inc(36406);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36407);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36408);TB.testConstructor_Object_DateTimeZoneMoscowBadDateTime();
        __CLR4_4_1rzurzulgchorys.R.inc(36409);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36410);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36411);TB.testConstructor_nullObject_DateTimeZone();
        __CLR4_4_1rzurzulgchorys.R.inc(36412);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36413);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36414);TB.testConstructor_Object_nullDateTimeZone();
        __CLR4_4_1rzurzulgchorys.R.inc(36415);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36416);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36417);TB.testConstructor_nullObject_nullDateTimeZone();
        __CLR4_4_1rzurzulgchorys.R.inc(36418);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36419);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36420);TB.testConstructor_Object_Chronology();
        __CLR4_4_1rzurzulgchorys.R.inc(36421);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36422);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36423);TB.testConstructor_Object_Chronology_crossChronology();
        __CLR4_4_1rzurzulgchorys.R.inc(36424);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36425);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36426);TB.testConstructor_Object_ChronologyMoscow();
        __CLR4_4_1rzurzulgchorys.R.inc(36427);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36428);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36429);TB.testConstructor_Object_ChronologyMoscowBadDateTime();
        __CLR4_4_1rzurzulgchorys.R.inc(36430);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36431);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36432);TB.testConstructor_nullObject_Chronology();
        __CLR4_4_1rzurzulgchorys.R.inc(36433);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36434);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36435);TB.testConstructor_Object_nullChronology();
        __CLR4_4_1rzurzulgchorys.R.inc(36436);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36437);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36438);TB.testConstructor_nullObject_nullChronology();
        __CLR4_4_1rzurzulgchorys.R.inc(36439);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36440);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36441);TB.testConstructor_int_int_int_int_int();
        __CLR4_4_1rzurzulgchorys.R.inc(36442);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36443);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36444);TB.testConstructor_int_int_int_int_int_int();
        __CLR4_4_1rzurzulgchorys.R.inc(36445);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36446);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36447);TB.testConstructor_int_int_int_int_int_int_int();
        __CLR4_4_1rzurzulgchorys.R.inc(36448);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36449);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36450);TB.testConstructor_int_int_int_Chronology();
        __CLR4_4_1rzurzulgchorys.R.inc(36451);TB.tearDown();
        __CLR4_4_1rzurzulgchorys.R.inc(36452);TB.setUp();
        __CLR4_4_1rzurzulgchorys.R.inc(36453);TB.testConstructor_int_int_int_nullChronology();
        __CLR4_4_1rzurzulgchorys.R.inc(36454);TB.tearDown();

    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestLocalDateTime_Constructors.class);
    }

    public TestLocalDateTime_Constructors(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1rzurzulgchorys.R.inc(36455);
        __CLR4_4_1rzurzulgchorys.R.inc(36456);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1rzurzulgchorys.R.inc(36457);zone = DateTimeZone.getDefault();
        __CLR4_4_1rzurzulgchorys.R.inc(36458);DateTimeZone.setDefault(MOSCOW);
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1rzurzulgchorys.R.inc(36459);
        __CLR4_4_1rzurzulgchorys.R.inc(36460);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1rzurzulgchorys.R.inc(36461);DateTimeZone.setDefault(zone);
        __CLR4_4_1rzurzulgchorys.R.inc(36462);zone = null;
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqvis4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqvis4v() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36463);
        __CLR4_4_1rzurzulgchorys.R.inc(36464);assertEquals(new LocalDateTime(2010, 6, 30, 1, 20), LocalDateTime.parse("2010-06-30T01:20"));
        __CLR4_4_1rzurzulgchorys.R.inc(36465);assertEquals(new LocalDateTime(2010, 1, 2, 14, 50, 30, 432), LocalDateTime.parse("2010-002T14:50:30.432"));
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testParse_formatter() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wvtnxs4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testParse_formatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wvtnxs4y() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36466);
        __CLR4_4_1rzurzulgchorys.R.inc(36467);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--dd MM HH").withChronology(ISOChronology.getInstance(PARIS));
        __CLR4_4_1rzurzulgchorys.R.inc(36468);assertEquals(new LocalDateTime(2010, 6, 30, 13, 0), LocalDateTime.parse("2010--30 06 13", f));
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_fromCalendarFields() throws Exception {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l8hq5rs51();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromCalendarFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l8hq5rs51() throws Exception{try{__CLR4_4_1rzurzulgchorys.R.inc(36469);
        __CLR4_4_1rzurzulgchorys.R.inc(36470);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_1rzurzulgchorys.R.inc(36471);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1rzurzulgchorys.R.inc(36472);LocalDateTime expected = new LocalDateTime(1970, 2, 3, 4, 5, 6, 7);
        __CLR4_4_1rzurzulgchorys.R.inc(36473);assertEquals(expected, LocalDateTime.fromCalendarFields(cal));
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testFactory_fromCalendarFields_beforeYearZero1() throws Exception {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_146vol9s56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromCalendarFields_beforeYearZero1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36474,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_146vol9s56() throws Exception{try{__CLR4_4_1rzurzulgchorys.R.inc(36474);
        __CLR4_4_1rzurzulgchorys.R.inc(36475);GregorianCalendar cal = new GregorianCalendar(1, 1, 3, 4, 5, 6);
        __CLR4_4_1rzurzulgchorys.R.inc(36476);cal.set(Calendar.ERA, GregorianCalendar.BC);
        __CLR4_4_1rzurzulgchorys.R.inc(36477);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1rzurzulgchorys.R.inc(36478);LocalDateTime expected = new LocalDateTime(0, 2, 3, 4, 5, 6, 7);
        __CLR4_4_1rzurzulgchorys.R.inc(36479);assertEquals(expected, LocalDateTime.fromCalendarFields(cal));
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testFactory_fromCalendarFields_beforeYearZero3() throws Exception {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aovm67s5c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromCalendarFields_beforeYearZero3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aovm67s5c() throws Exception{try{__CLR4_4_1rzurzulgchorys.R.inc(36480);
        __CLR4_4_1rzurzulgchorys.R.inc(36481);GregorianCalendar cal = new GregorianCalendar(3, 1, 3, 4, 5, 6);
        __CLR4_4_1rzurzulgchorys.R.inc(36482);cal.set(Calendar.ERA, GregorianCalendar.BC);
        __CLR4_4_1rzurzulgchorys.R.inc(36483);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1rzurzulgchorys.R.inc(36484);LocalDateTime expected = new LocalDateTime(-2, 2, 3, 4, 5, 6, 7);
        __CLR4_4_1rzurzulgchorys.R.inc(36485);assertEquals(expected, LocalDateTime.fromCalendarFields(cal));
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testFactory_fromCalendarFields_null() throws Exception {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcawzfs5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromCalendarFields_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcawzfs5i() throws Exception{try{__CLR4_4_1rzurzulgchorys.R.inc(36486);
        __CLR4_4_1rzurzulgchorys.R.inc(36487);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36488);LocalDateTime.fromCalendarFields((Calendar) null);
            __CLR4_4_1rzurzulgchorys.R.inc(36489);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_fromDateFields_after1970() throws Exception {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vvmm5s5m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromDateFields_after1970",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36490,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vvmm5s5m() throws Exception{try{__CLR4_4_1rzurzulgchorys.R.inc(36490);
        __CLR4_4_1rzurzulgchorys.R.inc(36491);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_1rzurzulgchorys.R.inc(36492);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1rzurzulgchorys.R.inc(36493);LocalDateTime expected = new LocalDateTime(1970, 2, 3, 4, 5, 6, 7);
        __CLR4_4_1rzurzulgchorys.R.inc(36494);assertEquals(expected, LocalDateTime.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testFactory_fromDateFields_before1970() throws Exception {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xuspjms5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromDateFields_before1970",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xuspjms5r() throws Exception{try{__CLR4_4_1rzurzulgchorys.R.inc(36495);
        __CLR4_4_1rzurzulgchorys.R.inc(36496);GregorianCalendar cal = new GregorianCalendar(1969, 1, 3, 4, 5, 6);
        __CLR4_4_1rzurzulgchorys.R.inc(36497);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1rzurzulgchorys.R.inc(36498);LocalDateTime expected = new LocalDateTime(1969, 2, 3, 4, 5, 6, 7);
        __CLR4_4_1rzurzulgchorys.R.inc(36499);assertEquals(expected, LocalDateTime.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testFactory_fromDateFields_beforeYearZero1() throws Exception {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tr9m3xs5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromDateFields_beforeYearZero1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tr9m3xs5w() throws Exception{try{__CLR4_4_1rzurzulgchorys.R.inc(36500);
        __CLR4_4_1rzurzulgchorys.R.inc(36501);GregorianCalendar cal = new GregorianCalendar(1, 1, 3, 4, 5, 6);
        __CLR4_4_1rzurzulgchorys.R.inc(36502);cal.set(Calendar.ERA, GregorianCalendar.BC);
        __CLR4_4_1rzurzulgchorys.R.inc(36503);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1rzurzulgchorys.R.inc(36504);LocalDateTime expected = new LocalDateTime(0, 2, 3, 4, 5, 6, 7);
        __CLR4_4_1rzurzulgchorys.R.inc(36505);assertEquals(expected, LocalDateTime.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testFactory_fromDateFields_beforeYearZero3() throws Exception {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yruia9s62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromDateFields_beforeYearZero3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yruia9s62() throws Exception{try{__CLR4_4_1rzurzulgchorys.R.inc(36506);
        __CLR4_4_1rzurzulgchorys.R.inc(36507);GregorianCalendar cal = new GregorianCalendar(3, 1, 3, 4, 5, 6);
        __CLR4_4_1rzurzulgchorys.R.inc(36508);cal.set(Calendar.ERA, GregorianCalendar.BC);
        __CLR4_4_1rzurzulgchorys.R.inc(36509);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1rzurzulgchorys.R.inc(36510);LocalDateTime expected = new LocalDateTime(-2, 2, 3, 4, 5, 6, 7);
        __CLR4_4_1rzurzulgchorys.R.inc(36511);assertEquals(expected, LocalDateTime.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testFactory_fromDateFields_null() throws Exception {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qt5qc5s68();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromDateFields_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qt5qc5s68() throws Exception{try{__CLR4_4_1rzurzulgchorys.R.inc(36512);
        __CLR4_4_1rzurzulgchorys.R.inc(36513);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36514);LocalDateTime.fromDateFields((Date) null);
            __CLR4_4_1rzurzulgchorys.R.inc(36515);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8hs6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8hs6c() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36516);
        __CLR4_4_1rzurzulgchorys.R.inc(36517);LocalDateTime test = new LocalDateTime();
        __CLR4_4_1rzurzulgchorys.R.inc(36518);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36519);assertEquals(1970, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36520);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36521);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36522);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36523);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36524);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36525);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1rzurzulgchorys.R.inc(36526);assertEquals(test, LocalDateTime.now());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_DateTimeZone() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4m1k5s6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36527,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4m1k5s6n() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36527);
        __CLR4_4_1rzurzulgchorys.R.inc(36528);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON);
        __CLR4_4_1rzurzulgchorys.R.inc(36529);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris

        __CLR4_4_1rzurzulgchorys.R.inc(36530);LocalDateTime test = new LocalDateTime(LONDON);
        __CLR4_4_1rzurzulgchorys.R.inc(36531);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36532);assertEquals(2005, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36533);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36534);assertEquals(8, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36535);assertEquals(23, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36536);assertEquals(59, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36537);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36538);assertEquals(0, test.getMillisOfSecond());
        __CLR4_4_1rzurzulgchorys.R.inc(36539);assertEquals(test, LocalDateTime.now(LONDON));

        __CLR4_4_1rzurzulgchorys.R.inc(36540);test = new LocalDateTime(PARIS);
        __CLR4_4_1rzurzulgchorys.R.inc(36541);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36542);assertEquals(2005, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36543);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36544);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36545);assertEquals(0, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36546);assertEquals(59, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36547);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36548);assertEquals(0, test.getMillisOfSecond());
        __CLR4_4_1rzurzulgchorys.R.inc(36549);assertEquals(test, LocalDateTime.now(PARIS));
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_nullDateTimeZone() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zs1ros7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zs1ros7a() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36550);
        __CLR4_4_1rzurzulgchorys.R.inc(36551);LocalDateTime test = new LocalDateTime((DateTimeZone) null);
        __CLR4_4_1rzurzulgchorys.R.inc(36552);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36553);assertEquals(1970, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36554);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36555);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36556);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36557);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36558);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36559);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_Chronology() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15931tis7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15931tis7k() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36560);
        __CLR4_4_1rzurzulgchorys.R.inc(36561);LocalDateTime test = new LocalDateTime(GREGORIAN_PARIS);
        __CLR4_4_1rzurzulgchorys.R.inc(36562);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36563);assertEquals(1970, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36564);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36565);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36566);assertEquals(10 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36567);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36568);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36569);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1rzurzulgchorys.R.inc(36570);assertEquals(test, LocalDateTime.now(GREGORIAN_PARIS));
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_nullChronology() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qcb6rs7v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36571,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qcb6rs7v() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36571);
        __CLR4_4_1rzurzulgchorys.R.inc(36572);LocalDateTime test = new LocalDateTime((Chronology) null);
        __CLR4_4_1rzurzulgchorys.R.inc(36573);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36574);assertEquals(1970, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36575);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36576);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36577);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36578);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36579);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36580);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long1() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13crs85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13crs85() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36581);
        __CLR4_4_1rzurzulgchorys.R.inc(36582);LocalDateTime test = new LocalDateTime(TEST_TIME1);
        __CLR4_4_1rzurzulgchorys.R.inc(36583);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36584);assertEquals(1970, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36585);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36586);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36587);assertEquals(12 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36588);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36589);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36590);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_long2() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914kas8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36591,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914kas8f() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36591);
        __CLR4_4_1rzurzulgchorys.R.inc(36592);LocalDateTime test = new LocalDateTime(TEST_TIME2);
        __CLR4_4_1rzurzulgchorys.R.inc(36593);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36594);assertEquals(1971, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36595);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36596);assertEquals(7, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36597);assertEquals(14 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36598);assertEquals(28, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36599);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36600);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long1_DateTimeZone() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mej2a9s8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_long1_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36601,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mej2a9s8p() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36601);
        __CLR4_4_1rzurzulgchorys.R.inc(36602);LocalDateTime test = new LocalDateTime(TEST_TIME1, PARIS);
        __CLR4_4_1rzurzulgchorys.R.inc(36603);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36604);assertEquals(1970, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36605);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36606);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36607);assertEquals(12 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36608);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36609);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36610);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_long2_DateTimeZone() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1hd9qs8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_long2_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36611,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1hd9qs8z() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36611);
        __CLR4_4_1rzurzulgchorys.R.inc(36612);LocalDateTime test = new LocalDateTime(TEST_TIME2, PARIS);
        __CLR4_4_1rzurzulgchorys.R.inc(36613);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36614);assertEquals(1971, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36615);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36616);assertEquals(7, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36617);assertEquals(14 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36618);assertEquals(28, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36619);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36620);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_long_nullDateTimeZone() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uv35a9s99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_long_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uv35a9s99() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36621);
        __CLR4_4_1rzurzulgchorys.R.inc(36622);LocalDateTime test = new LocalDateTime(TEST_TIME1, (DateTimeZone) null);
        __CLR4_4_1rzurzulgchorys.R.inc(36623);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36624);assertEquals(1970, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36625);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36626);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36627);assertEquals(12 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36628);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36629);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36630);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long1_Chronology() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115wn5ss9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_long1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115wn5ss9j() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36631);
        __CLR4_4_1rzurzulgchorys.R.inc(36632);LocalDateTime test = new LocalDateTime(TEST_TIME1, GREGORIAN_PARIS);
        __CLR4_4_1rzurzulgchorys.R.inc(36633);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36634);assertEquals(1970, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36635);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36636);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36637);assertEquals(12 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36638);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36639);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36640);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_long2_Chronology() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14nqmkhs9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_long2_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14nqmkhs9t() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36641);
        __CLR4_4_1rzurzulgchorys.R.inc(36642);LocalDateTime test = new LocalDateTime(TEST_TIME2, GREGORIAN_PARIS);
        __CLR4_4_1rzurzulgchorys.R.inc(36643);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36644);assertEquals(1971, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36645);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36646);assertEquals(7, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36647);assertEquals(14 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36648);assertEquals(28, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36649);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36650);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_long_nullChronology() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnhckusa3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnhckusa3() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36651);
        __CLR4_4_1rzurzulgchorys.R.inc(36652);LocalDateTime test = new LocalDateTime(TEST_TIME1, (Chronology) null);
        __CLR4_4_1rzurzulgchorys.R.inc(36653);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36654);assertEquals(1970, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36655);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36656);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36657);assertEquals(12 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36658);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36659);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36660);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_Object1() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19oqxcysad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36661,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19oqxcysad() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36661);
        __CLR4_4_1rzurzulgchorys.R.inc(36662);Date date = new Date(TEST_TIME1);
        __CLR4_4_1rzurzulgchorys.R.inc(36663);LocalDateTime test = new LocalDateTime(date);
        __CLR4_4_1rzurzulgchorys.R.inc(36664);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36665);assertEquals(1970, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36666);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36667);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36668);assertEquals(12 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36669);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36670);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36671);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_nullObject() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt59uksao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_nullObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36672,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt59uksao() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36672);
        __CLR4_4_1rzurzulgchorys.R.inc(36673);LocalDateTime test = new LocalDateTime((Object) null);
        __CLR4_4_1rzurzulgchorys.R.inc(36674);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36675);assertEquals(1970, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36676);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36677);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36678);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36679);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36680);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36681);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString1() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11c2b5dsay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectString1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11c2b5dsay() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36682);
        __CLR4_4_1rzurzulgchorys.R.inc(36683);LocalDateTime test = new LocalDateTime("1972-04-06");
        __CLR4_4_1rzurzulgchorys.R.inc(36684);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36685);assertEquals(1972, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36686);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36687);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36688);assertEquals(0, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36689);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36690);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36691);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString2() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14l29xusb8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectString2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36692,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14l29xusb8() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36692);
        __CLR4_4_1rzurzulgchorys.R.inc(36693);LocalDateTime test = new LocalDateTime("1972-037");
        __CLR4_4_1rzurzulgchorys.R.inc(36694);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36695);assertEquals(1972, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36696);assertEquals(2, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36697);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36698);assertEquals(0, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36699);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36700);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36701);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString3() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17u28qbsbi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectString3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17u28qbsbi() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36702);
        __CLR4_4_1rzurzulgchorys.R.inc(36703);LocalDateTime test = new LocalDateTime("1972-04-06T10:20:30.040");
        __CLR4_4_1rzurzulgchorys.R.inc(36704);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36705);assertEquals(1972, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36706);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36707);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36708);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36709);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36710);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36711);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString4() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b327issbs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectString4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36712,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b327issbs() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36712);
        __CLR4_4_1rzurzulgchorys.R.inc(36713);LocalDateTime test = new LocalDateTime("1972-04-06T10:20");
        __CLR4_4_1rzurzulgchorys.R.inc(36714);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36715);assertEquals(1972, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36716);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36717);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36718);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36719);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36720);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36721);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx1() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11daulesc2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectStringEx1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36722,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11daulesc2() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36722);
        __CLR4_4_1rzurzulgchorys.R.inc(36723);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36724);new LocalDateTime("1970-04-06T+14:00");
            __CLR4_4_1rzurzulgchorys.R.inc(36725);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx2() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vp473sc6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectStringEx2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vp473sc6() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36726);
        __CLR4_4_1rzurzulgchorys.R.inc(36727);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36728);new LocalDateTime("1970-04-06T10:20:30.040+14:00");
            __CLR4_4_1rzurzulgchorys.R.inc(36729);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx3() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_154p2zksca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectStringEx3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_154p2zksca() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36730);
        __CLR4_4_1rzurzulgchorys.R.inc(36731);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36732);new LocalDateTime("T10:20:30.040");
            __CLR4_4_1rzurzulgchorys.R.inc(36733);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx4() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18dp1s1sce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectStringEx4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18dp1s1sce() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36734);
        __CLR4_4_1rzurzulgchorys.R.inc(36735);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36736);new LocalDateTime("T10:20:30.040+14:00");
            __CLR4_4_1rzurzulgchorys.R.inc(36737);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx5() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bmp0kisci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectStringEx5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bmp0kisci() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36738);
        __CLR4_4_1rzurzulgchorys.R.inc(36739);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36740);new LocalDateTime("10:20:30.040");
            __CLR4_4_1rzurzulgchorys.R.inc(36741);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx6() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1evozczscm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectStringEx6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1evozczscm() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36742);
        __CLR4_4_1rzurzulgchorys.R.inc(36743);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36744);new LocalDateTime("10:20:30.040+14:00");
            __CLR4_4_1rzurzulgchorys.R.inc(36745);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectLocalDateTime() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kto907scq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectLocalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36746,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kto907scq() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36746);
        __CLR4_4_1rzurzulgchorys.R.inc(36747);LocalDateTime dt = new LocalDateTime(1970, 5, 6, 10, 20, 30, 40, BUDDHIST_UTC);
        __CLR4_4_1rzurzulgchorys.R.inc(36748);LocalDateTime test = new LocalDateTime(dt);
        __CLR4_4_1rzurzulgchorys.R.inc(36749);assertEquals(BUDDHIST_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36750);assertEquals(1970, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36751);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36752);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36753);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36754);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36755);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36756);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectLocalDate() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1drwkaysd1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36757,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1drwkaysd1() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36757);
        __CLR4_4_1rzurzulgchorys.R.inc(36758);LocalDate date = new LocalDate(1970, 5, 6);
        __CLR4_4_1rzurzulgchorys.R.inc(36759);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36760);new LocalDateTime(date);
            __CLR4_4_1rzurzulgchorys.R.inc(36761);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectLocalTime() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18d94w9sd6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectLocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36762,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18d94w9sd6() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36762);
        __CLR4_4_1rzurzulgchorys.R.inc(36763);LocalTime time = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rzurzulgchorys.R.inc(36764);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36765);new LocalDateTime(time);
            __CLR4_4_1rzurzulgchorys.R.inc(36766);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_Object_DateTimeZone() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pk74vrsdb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Object_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36767,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pk74vrsdb() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36767);
        __CLR4_4_1rzurzulgchorys.R.inc(36768);Date date = new Date(TEST_TIME1);
        __CLR4_4_1rzurzulgchorys.R.inc(36769);LocalDateTime test = new LocalDateTime(date, PARIS);
        __CLR4_4_1rzurzulgchorys.R.inc(36770);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36771);assertEquals(1970, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36772);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36773);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36774);assertEquals(12 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36775);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36776);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36777);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_Object_DateTimeZoneMoscow() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1opb0hdsdm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Object_DateTimeZoneMoscow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1opb0hdsdm() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36778);
        __CLR4_4_1rzurzulgchorys.R.inc(36779);LocalDateTime test = new LocalDateTime("1970-04-06T12:24:00", MOSCOW);
        __CLR4_4_1rzurzulgchorys.R.inc(36780);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36781);assertEquals(1970, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36782);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36783);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36784);assertEquals(12, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36785);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36786);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36787);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_Object_DateTimeZoneMoscowBadDateTime() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gk2d6rsdw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Object_DateTimeZoneMoscowBadDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36788,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gk2d6rsdw() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36788);
        // 1981-03-31T23:59:59.999+03:00 followed by 1981-04-01T01:00:00.000+04:00
        // 1981-09-30T23:59:59.999+04:00 followed by 1981-09-30T23:00:00.000+03:00

        // when a DST non-existing time is passed in, it should still work (ie. zone ignored)
        __CLR4_4_1rzurzulgchorys.R.inc(36789);LocalDateTime test = new LocalDateTime("1981-04-01T00:30:00", MOSCOW);  // doesnt exist
        __CLR4_4_1rzurzulgchorys.R.inc(36790);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36791);assertEquals(1981, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36792);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36793);assertEquals(1, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36794);assertEquals(0, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36795);assertEquals(30, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36796);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36797);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_nullObject_DateTimeZone() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxoowgse6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_nullObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36798,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxoowgse6() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36798);
        __CLR4_4_1rzurzulgchorys.R.inc(36799);LocalDateTime test = new LocalDateTime((Object) null, PARIS);
        __CLR4_4_1rzurzulgchorys.R.inc(36800);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36801);assertEquals(1970, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36802);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36803);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36804);assertEquals(10 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36805);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36806);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36807);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_Object_nullDateTimeZone() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151w5y6seg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Object_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36808,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151w5y6seg() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36808);
        __CLR4_4_1rzurzulgchorys.R.inc(36809);Date date = new Date(TEST_TIME1);
        __CLR4_4_1rzurzulgchorys.R.inc(36810);LocalDateTime test = new LocalDateTime(date, (DateTimeZone) null);
        __CLR4_4_1rzurzulgchorys.R.inc(36811);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36812);assertEquals(1970, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36813);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36814);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36815);assertEquals(12 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36816);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36817);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36818);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_nullObject_nullDateTimeZone() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hv60h5ser();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_nullObject_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hv60h5ser() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36819);
        __CLR4_4_1rzurzulgchorys.R.inc(36820);LocalDateTime test = new LocalDateTime((Object) null, (DateTimeZone) null);
        __CLR4_4_1rzurzulgchorys.R.inc(36821);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36822);assertEquals(1970, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36823);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36824);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36825);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36826);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36827);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36828);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_Object_Chronology() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vmnvd4sf1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vmnvd4sf1() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36829);
        __CLR4_4_1rzurzulgchorys.R.inc(36830);Date date = new Date(TEST_TIME1);
        __CLR4_4_1rzurzulgchorys.R.inc(36831);LocalDateTime test = new LocalDateTime(date, GREGORIAN_PARIS);
        __CLR4_4_1rzurzulgchorys.R.inc(36832);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36833);assertEquals(1970, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36834);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36835);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36836);assertEquals(12 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36837);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36838);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36839);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_Object_Chronology_crossChronology() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15vy7vlsfc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Object_Chronology_crossChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15vy7vlsfc() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36840);
        __CLR4_4_1rzurzulgchorys.R.inc(36841);LocalDateTime input = new LocalDateTime(1970, 4, 6, 12, 30, 0, 0, ISO_UTC);
        __CLR4_4_1rzurzulgchorys.R.inc(36842);LocalDateTime test = new LocalDateTime(input, BUDDHIST_UTC);
        __CLR4_4_1rzurzulgchorys.R.inc(36843);assertEquals(BUDDHIST_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36844);assertEquals(1970, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36845);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36846);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36847);assertEquals(12, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36848);assertEquals(30, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36849);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36850);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_Object_ChronologyMoscow() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sthuv6sfn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Object_ChronologyMoscow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sthuv6sfn() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36851);
        __CLR4_4_1rzurzulgchorys.R.inc(36852);LocalDateTime test = new LocalDateTime("1970-04-06T12:24:00", GREGORIAN_MOSCOW);
        __CLR4_4_1rzurzulgchorys.R.inc(36853);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36854);assertEquals(1970, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36855);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36856);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36857);assertEquals(12, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36858);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36859);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36860);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_Object_ChronologyMoscowBadDateTime() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rbdrg4sfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Object_ChronologyMoscowBadDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rbdrg4sfx() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36861);
        // 1981-03-31T23:59:59.999+03:00 followed by 1981-04-01T01:00:00.000+04:00
        // 1981-09-30T23:59:59.999+04:00 followed by 1981-09-30T23:00:00.000+03:00

        // when a DST non-existing time is passed in, it should still work (ie. zone ignored)
        __CLR4_4_1rzurzulgchorys.R.inc(36862);LocalDateTime test = new LocalDateTime("1981-04-01T00:30:00", GREGORIAN_MOSCOW);  // doesnt exist
        __CLR4_4_1rzurzulgchorys.R.inc(36863);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36864);assertEquals(1981, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36865);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36866);assertEquals(1, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36867);assertEquals(0, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36868);assertEquals(30, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36869);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36870);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_nullObject_Chronology() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q0uynsg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_nullObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36871,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q0uynsg7() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36871);
        __CLR4_4_1rzurzulgchorys.R.inc(36872);LocalDateTime test = new LocalDateTime((Object) null, GREGORIAN_PARIS);
        __CLR4_4_1rzurzulgchorys.R.inc(36873);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36874);assertEquals(1970, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36875);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36876);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36877);assertEquals(10 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36878);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36879);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36880);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_Object_nullChronology() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yccijzsgh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yccijzsgh() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36881);
        __CLR4_4_1rzurzulgchorys.R.inc(36882);Date date = new Date(TEST_TIME1);
        __CLR4_4_1rzurzulgchorys.R.inc(36883);LocalDateTime test = new LocalDateTime(date, (Chronology) null);
        __CLR4_4_1rzurzulgchorys.R.inc(36884);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36885);assertEquals(1970, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36886);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36887);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36888);assertEquals(12 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36889);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36890);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36891);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_nullObject_nullChronology() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dtve0sgs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_nullObject_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36892,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dtve0sgs() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36892);
        __CLR4_4_1rzurzulgchorys.R.inc(36893);LocalDateTime test = new LocalDateTime((Object) null, (Chronology) null);
        __CLR4_4_1rzurzulgchorys.R.inc(36894);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36895);assertEquals(1970, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36896);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36897);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36898);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36899);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36900);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36901);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_int_int_int_int_int() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14wtbr5sh2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_int_int_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36902,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14wtbr5sh2() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36902);
        __CLR4_4_1rzurzulgchorys.R.inc(36903);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20);
        __CLR4_4_1rzurzulgchorys.R.inc(36904);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36905);assertEquals(2005, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36906);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36907);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36908);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36909);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36910);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36911);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_int_int_int_int_int_int() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tj7janshc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_int_int_int_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tj7janshc() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36912);
        __CLR4_4_1rzurzulgchorys.R.inc(36913);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30);
        __CLR4_4_1rzurzulgchorys.R.inc(36914);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36915);assertEquals(2005, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36916);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36917);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36918);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36919);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36920);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36921);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_int_int_int_int_int_int_int() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ofcjttshm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_int_int_int_int_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ofcjttshm() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36922);
        __CLR4_4_1rzurzulgchorys.R.inc(36923);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1rzurzulgchorys.R.inc(36924);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36925);assertEquals(2005, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36926);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36927);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36928);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1rzurzulgchorys.R.inc(36929);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36930);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36931);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1rzurzulgchorys.R.inc(36932);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36933);new LocalDateTime(Integer.MIN_VALUE, 6, 9, 10, 20, 30, 40);
            __CLR4_4_1rzurzulgchorys.R.inc(36934);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1rzurzulgchorys.R.inc(36935);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36936);new LocalDateTime(Integer.MAX_VALUE, 6, 9, 10, 20, 30, 40);
            __CLR4_4_1rzurzulgchorys.R.inc(36937);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1rzurzulgchorys.R.inc(36938);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36939);new LocalDateTime(2005, 0, 9, 10, 20, 30, 40);
            __CLR4_4_1rzurzulgchorys.R.inc(36940);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1rzurzulgchorys.R.inc(36941);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36942);new LocalDateTime(2005, 13, 9, 10, 20, 30, 40);
            __CLR4_4_1rzurzulgchorys.R.inc(36943);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1rzurzulgchorys.R.inc(36944);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36945);new LocalDateTime(2005, 6, 0, 10, 20, 30, 40);
            __CLR4_4_1rzurzulgchorys.R.inc(36946);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1rzurzulgchorys.R.inc(36947);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36948);new LocalDateTime(2005, 6, 31, 10, 20, 30, 40);
            __CLR4_4_1rzurzulgchorys.R.inc(36949);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1rzurzulgchorys.R.inc(36950);new LocalDateTime(2005, 7, 31, 10, 20, 30, 40);
        __CLR4_4_1rzurzulgchorys.R.inc(36951);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36952);new LocalDateTime(2005, 7, 32, 10, 20, 30, 40);
            __CLR4_4_1rzurzulgchorys.R.inc(36953);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_int_int_int_Chronology() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o62uzqsii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_int_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o62uzqsii() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36954);
        __CLR4_4_1rzurzulgchorys.R.inc(36955);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40, GREGORIAN_PARIS);
        __CLR4_4_1rzurzulgchorys.R.inc(36956);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36957);assertEquals(2005, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36958);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36959);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1rzurzulgchorys.R.inc(36960);assertEquals(10, test.getHourOfDay());  // PARIS has no effect
        __CLR4_4_1rzurzulgchorys.R.inc(36961);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1rzurzulgchorys.R.inc(36962);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1rzurzulgchorys.R.inc(36963);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1rzurzulgchorys.R.inc(36964);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36965);new LocalDateTime(Integer.MIN_VALUE, 6, 9, 10, 20, 30, 40, GREGORIAN_PARIS);
            __CLR4_4_1rzurzulgchorys.R.inc(36966);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1rzurzulgchorys.R.inc(36967);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36968);new LocalDateTime(Integer.MAX_VALUE, 6, 9, 10, 20, 30, 40, GREGORIAN_PARIS);
            __CLR4_4_1rzurzulgchorys.R.inc(36969);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1rzurzulgchorys.R.inc(36970);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36971);new LocalDateTime(2005, 0, 9, 10, 20, 30, 40, GREGORIAN_PARIS);
            __CLR4_4_1rzurzulgchorys.R.inc(36972);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1rzurzulgchorys.R.inc(36973);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36974);new LocalDateTime(2005, 13, 9, 10, 20, 30, 40, GREGORIAN_PARIS);
            __CLR4_4_1rzurzulgchorys.R.inc(36975);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1rzurzulgchorys.R.inc(36976);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36977);new LocalDateTime(2005, 6, 0, 10, 20, 30, 40, GREGORIAN_PARIS);
            __CLR4_4_1rzurzulgchorys.R.inc(36978);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1rzurzulgchorys.R.inc(36979);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36980);new LocalDateTime(2005, 6, 31, 10, 20, 30, 40, GREGORIAN_PARIS);
            __CLR4_4_1rzurzulgchorys.R.inc(36981);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1rzurzulgchorys.R.inc(36982);new LocalDateTime(2005, 7, 31, 10, 20, 30, 40, GREGORIAN_PARIS);
        __CLR4_4_1rzurzulgchorys.R.inc(36983);try {
            __CLR4_4_1rzurzulgchorys.R.inc(36984);new LocalDateTime(2005, 7, 32, 10, 20, 30, 40, GREGORIAN_PARIS);
            __CLR4_4_1rzurzulgchorys.R.inc(36985);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

    @Test
    public void testConstructor_int_int_int_nullChronology() throws Throwable {__CLR4_4_1rzurzulgchorys.R.globalSliceStart(getClass().getName(),36986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uph3gtsje();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rzurzulgchorys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rzurzulgchorys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_int_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36986,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uph3gtsje() throws Throwable{try{__CLR4_4_1rzurzulgchorys.R.inc(36986);
        __CLR4_4_1rzurzulgchorys.R.inc(36987);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40, null);
        __CLR4_4_1rzurzulgchorys.R.inc(36988);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1rzurzulgchorys.R.inc(36989);assertEquals(2005, test.getYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36990);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1rzurzulgchorys.R.inc(36991);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1rzurzulgchorys.R.flushNeeded();}}

}
