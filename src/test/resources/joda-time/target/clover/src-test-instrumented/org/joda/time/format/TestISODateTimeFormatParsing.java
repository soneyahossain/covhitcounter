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

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * This class is a Junit unit test for ISODateTimeFormat parsing.
 *
 * @author Stephen Colebourne
 */
public class TestISODateTimeFormatParsing {static class __CLR4_4_11kkz1kkzlgchoszb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,74093,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73331);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73332);TestISODateTimeFormatParsing TB = new TestISODateTimeFormatParsing();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73333);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73334);TB.test_dateParser();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73335);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73336);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73337);TB.test_localDateParser();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73338);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73339);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73340);TB.test_dateElementParser();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73341);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73342);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73343);TB.test_timeParser();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73344);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73345);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73346);TB.test_localTimeParser();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73347);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73348);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73349);TB.test_timeElementParser();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73350);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73351);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73352);TB.test_dateTimeParser();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73353);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73354);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73355);TB.test_dateOptionalTimeParser();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73356);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73357);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73358);TB.test_localDateOptionalTimeParser();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73359);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73360);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73361);TB.test_date();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73362);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73363);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73364);TB.test_time();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73365);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73366);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73367);TB.test_timeNoMillis();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73368);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73369);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73370);TB.test_tTime();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73371);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73372);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73373);TB.test_tTimeNoMillis();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73374);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73375);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73376);TB.test_dateTime();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73377);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73378);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73379);TB.test_dateTimeNoMillis();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73380);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73381);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73382);TB.test_ordinalDate();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73383);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73384);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73385);TB.test_ordinalDateTime();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73386);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73387);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73388);TB.test_ordinalDateTimeNoMillis();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73389);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73390);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73391);TB.test_weekDate();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73392);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73393);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73394);TB.test_weekDateTime();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73395);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73396);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73397);TB.test_weekDateTimeNoMillis();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73398);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73399);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73400);TB.test_basicDate();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73401);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73402);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73403);TB.test_basicTime();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73404);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73405);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73406);TB.test_basicTimeNoMillis();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73407);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73408);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73409);TB.test_basicTTime();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73410);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73411);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73412);TB.test_basicTTimeNoMillis();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73413);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73414);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73415);TB.test_basicDateTime();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73416);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73417);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73418);TB.test_basicDateTimeNoMillis();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73419);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73420);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73421);TB.test_basicOrdinalDate();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73422);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73423);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73424);TB.test_basicOrdinalDateTime();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73425);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73426);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73427);TB.test_basicOrdinalDateTimeNoMillis();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73428);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73429);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73430);TB.test_basicWeekDate();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73431);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73432);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73433);TB.test_basicWeekDateTime();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73434);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73435);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73436);TB.test_basicWeekDateTimeNoMillis();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73437);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73438);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73439);TB.test_hourMinute();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73440);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73441);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73442);TB.test_hourMinuteSecond();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73443);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73444);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73445);TB.test_hourMinuteSecondMillis();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73446);TB.tearDown();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73447);TB.setUp();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73448);TB.test_hourMinuteSecondFraction();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73449);TB.tearDown();

    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestISODateTimeFormatParsing.class);
    }

    public TestISODateTimeFormatParsing(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73450);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73451);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73452);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73453);originalLocale = Locale.getDefault();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73454);DateTimeZone.setDefault(DateTimeZone.forID("Europe/London"));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73455);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73456);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73457);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73458);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73459);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73460);Locale.setDefault(originalLocale);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73461);originalDateTimeZone = null;
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73462);originalTimeZone = null;
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73463);originalLocale = null;
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_dateParser() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t2fznl1koo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t2fznl1koo(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73464);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73465);DateTimeFormatter parser = ISODateTimeFormat.dateParser();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73466);assertParse(parser, true, "2006-06-09");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73467);assertParse(parser, true, "+2006-06-09");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73468);assertParse(parser, true, "2006-W27-3");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73469);assertParse(parser, true, "2006-123");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73470);assertParse(parser, true, "2006-06-09T+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73471);assertParse(parser, true, "2006-W27-3T+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73472);assertParse(parser, true, "2006-123T+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73473);assertParse(parser, false, "2006-06-09T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73474);assertParse(parser, false, "+2006-06-09T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73475);assertParse(parser, false, "2006-W27-3T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73476);assertParse(parser, false, "2006-123T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73477);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73478);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73479);assertParse(parser, false, "2006-123T10:20:30.040+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73480);assertParse(parser, false, "T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73481);assertParse(parser, false, "T10.5");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73482);assertParse(parser, false, "T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73483);assertParse(parser, false, "T10.5+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73484);assertParse(parser, false, "10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73485);assertParse(parser, false, "10.5");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73486);assertParse(parser, false, "10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73487);assertParse(parser, false, "10.5+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73488);assertNoPrint(parser);
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_localDateParser() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lowiuq1kpd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_localDateParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73489,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lowiuq1kpd(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73489);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73490);DateTimeFormatter parser = ISODateTimeFormat.localDateParser();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73491);assertEquals(DateTimeZone.UTC, parser.getZone());
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73492);assertParse(parser, true, "2006-06-09");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73493);assertParse(parser, true, "+2006-06-09");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73494);assertParse(parser, true, "2006-W27-3");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73495);assertParse(parser, true, "2006-123");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73496);assertParse(parser, false, "2006-06-09T+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73497);assertParse(parser, false, "2006-W27-3T+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73498);assertParse(parser, false, "2006-123T+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73499);assertParse(parser, false, "2006-06-09T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73500);assertParse(parser, false, "2006-W27-3T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73501);assertParse(parser, false, "2006-123T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73502);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73503);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73504);assertParse(parser, false, "2006-123T10:20:30.040+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73505);assertParse(parser, false, "T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73506);assertParse(parser, false, "T10.5");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73507);assertParse(parser, false, "T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73508);assertParse(parser, false, "T10.5+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73509);assertParse(parser, false, "10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73510);assertParse(parser, false, "10.5");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73511);assertParse(parser, false, "10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73512);assertParse(parser, false, "10.5+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73513);assertNoPrint(parser);
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_dateElementParser() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ttdd6v1kq2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateElementParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ttdd6v1kq2(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73514);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73515);DateTimeFormatter parser = ISODateTimeFormat.dateElementParser();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73516);assertParse(parser, "2006-06-09", new DateTime(2006, 6, 9, 0, 0, 0, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73517);assertParse(parser, "2006-06-9", new DateTime(2006, 6, 9, 0, 0, 0, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73518);assertParse(parser, "2006-6-09", new DateTime(2006, 6, 9, 0, 0, 0, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73519);assertParse(parser, "2006-6-9", new DateTime(2006, 6, 9, 0, 0, 0, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73520);assertParse(parser, "+2006-06-09", new DateTime(2006, 6, 9, 0, 0, 0, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73521);assertParse(parser, true, "2006-W27-3");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73522);assertParse(parser, true, "2006-123");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73523);assertParse(parser, false, "2006-06-09T+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73524);assertParse(parser, false, "2006-W27-3T+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73525);assertParse(parser, false, "2006-123T+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73526);assertParse(parser, false, "2006-06-09T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73527);assertParse(parser, false, "2006-W27-3T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73528);assertParse(parser, false, "2006-123T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73529);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73530);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73531);assertParse(parser, false, "2006-123T10:20:30.040+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73532);assertParse(parser, false, "T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73533);assertParse(parser, false, "T10.5");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73534);assertParse(parser, false, "T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73535);assertParse(parser, false, "T10.5+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73536);assertParse(parser, false, "10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73537);assertParse(parser, false, "10.5");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73538);assertParse(parser, false, "10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73539);assertParse(parser, false, "10.5+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73540);assertNoPrint(parser);
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_timeParser() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r4werk1kqt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_timeParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73541,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r4werk1kqt(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73541);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73542);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73543);DateTimeFormatter parser = ISODateTimeFormat.timeParser();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73544);assertParse(parser, false, "2006-06-09");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73545);assertParse(parser, false, "2006-W27-3");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73546);assertParse(parser, false, "2006-123");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73547);assertParse(parser, false, "2006-06-09T+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73548);assertParse(parser, false, "2006-W27-3T+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73549);assertParse(parser, false, "2006-123T+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73550);assertParse(parser, false, "2006-06-09T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73551);assertParse(parser, false, "2006-W27-3T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73552);assertParse(parser, false, "2006-123T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73553);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73554);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73555);assertParse(parser, false, "2006-123T10:20:30.040+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73556);assertParse(parser, "T10:20:30.040000000", new DateTime(1970, 1, 1, 10, 20, 30, 40));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73557);assertParse(parser, "T10:20:30.004", new DateTime(1970, 1, 1, 10, 20, 30, 4));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73558);assertParse(parser, "T10:20:30.040", new DateTime(1970, 1, 1, 10, 20, 30, 40));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73559);assertParse(parser, "T10:20:30.400", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73560);assertParse(parser, "T10.5", new DateTime(1970, 1, 1, 10, 30, 0, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73561);assertParse(parser, "T10:20:30.040+02:00", new DateTime(1970, 1, 1, 8, 20, 30, 40));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73562);assertParse(parser, "T10.5+02:00", new DateTime(1970, 1, 1, 8, 30, 0, 0));

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73563);assertParse(parser, true, "10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73564);assertParse(parser, true, "10.5");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73565);assertParse(parser, true, "10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73566);assertParse(parser, true, "10.5+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73567);assertNoPrint(parser);
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_localTimeParser() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yifvkf1krk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_localTimeParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73568,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yifvkf1krk(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73568);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73569);DateTimeFormatter parser = ISODateTimeFormat.localTimeParser();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73570);assertEquals(DateTimeZone.UTC, parser.getZone());
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73571);assertParse(parser, false, "2006-06-09");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73572);assertParse(parser, false, "2006-W27-3");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73573);assertParse(parser, false, "2006-123");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73574);assertParse(parser, false, "2006-06-09T+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73575);assertParse(parser, false, "2006-W27-3T+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73576);assertParse(parser, false, "2006-123T+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73577);assertParse(parser, false, "2006-06-09T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73578);assertParse(parser, false, "2006-W27-3T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73579);assertParse(parser, false, "2006-123T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73580);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73581);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73582);assertParse(parser, false, "2006-123T10:20:30.040+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73583);assertParse(parser, true, "T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73584);assertParse(parser, true, "T10.5");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73585);assertParse(parser, false, "T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73586);assertParse(parser, false, "T10.5+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73587);assertParse(parser, true, "10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73588);assertParse(parser, true, "10.5");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73589);assertParse(parser, false, "10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73590);assertParse(parser, false, "10.5+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73591);assertParse(parser, true, "00:00:10.512345678");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73592);assertEquals(10512, parser.parseMillis("00:00:10.512345678"));

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73593);assertNoPrint(parser);
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_timeElementParser() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14jwhew1ksa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_timeElementParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14jwhew1ksa(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73594);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73595);DateTimeFormatter parser = ISODateTimeFormat.timeElementParser();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73596);assertParse(parser, false, "2006-06-09");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73597);assertParse(parser, false, "2006-W27-3");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73598);assertParse(parser, false, "2006-123");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73599);assertParse(parser, false, "2006-06-09T+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73600);assertParse(parser, false, "2006-W27-3T+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73601);assertParse(parser, false, "2006-123T+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73602);assertParse(parser, false, "2006-06-09T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73603);assertParse(parser, false, "2006-W27-3T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73604);assertParse(parser, false, "2006-123T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73605);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73606);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73607);assertParse(parser, false, "2006-123T10:20:30.040+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73608);assertParse(parser, false, "T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73609);assertParse(parser, false, "T10.5");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73610);assertParse(parser, false, "T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73611);assertParse(parser, false, "T10.5+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73612);assertParse(parser, true, "10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73613);assertParse(parser, true, "10.5");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73614);assertParse(parser, false, "10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73615);assertParse(parser, false, "10.5+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73616);assertParse(parser, true, "00:00:10.512345678");
        // result is offset by London DST in 1970-01-01
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73617);assertEquals(10512, parser.parseMillis("00:00:10.512345678") + DateTimeZone.getDefault().getOffset(0L));

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73618);assertNoPrint(parser);
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_dateTimeParser() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a7ex821ksz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateTimeParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a7ex821ksz(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73619);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73620);DateTimeFormatter parser = ISODateTimeFormat.dateTimeParser();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73621);assertParse(parser, true, "2006-06-09");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73622);assertParse(parser, true, "2006-W27-3");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73623);assertParse(parser, true, "2006-123");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73624);assertParse(parser, true, "2006-06-09T+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73625);assertParse(parser, true, "2006-W27-3T+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73626);assertParse(parser, true, "2006-123T+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73627);assertParse(parser, true, "2006-06-09T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73628);assertParse(parser, true, "2006-W27-3T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73629);assertParse(parser, true, "2006-123T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73630);assertParse(parser, true, "2006-06-09T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73631);assertParse(parser, true, "2006-W27-3T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73632);assertParse(parser, true, "2006-123T10:20:30.040+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73633);assertParse(parser, true, "T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73634);assertParse(parser, true, "T10.5");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73635);assertParse(parser, true, "T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73636);assertParse(parser, true, "T10.5+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73637);assertParse(parser, false, "10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73638);assertParse(parser, false, "10.5");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73639);assertParse(parser, false, "10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73640);assertParse(parser, false, "10.5+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73641);assertNoPrint(parser);
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_dateOptionalTimeParser() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h01rke1ktm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateOptionalTimeParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h01rke1ktm(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73642);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73643);DateTimeFormatter parser = ISODateTimeFormat.dateOptionalTimeParser();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73644);assertParse(parser, true, "2006-06-09");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73645);assertParse(parser, true, "2006-W27-3");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73646);assertParse(parser, true, "2006-123");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73647);assertParse(parser, true, "2006-06-09T+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73648);assertParse(parser, true, "2006-W27-3T+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73649);assertParse(parser, true, "2006-123T+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73650);assertParse(parser, true, "2006-06-09T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73651);assertParse(parser, true, "2006-W27-3T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73652);assertParse(parser, true, "2006-123T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73653);assertParse(parser, true, "2006-06-09T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73654);assertParse(parser, true, "2006-W27-3T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73655);assertParse(parser, true, "2006-123T10:20:30.040+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73656);assertParse(parser, false, "T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73657);assertParse(parser, false, "T10.5");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73658);assertParse(parser, false, "T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73659);assertParse(parser, false, "T10.5+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73660);assertParse(parser, false, "10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73661);assertParse(parser, false, "10.5");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73662);assertParse(parser, false, "10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73663);assertParse(parser, false, "10.5+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73664);assertNoPrint(parser);
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_localDateOptionalTimeParser() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14qvwjl1ku9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_localDateOptionalTimeParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14qvwjl1ku9(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73665);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73666);DateTimeFormatter parser = ISODateTimeFormat.localDateOptionalTimeParser();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73667);assertEquals(DateTimeZone.UTC, parser.getZone());
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73668);assertParse(parser, true, "2006-06-09");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73669);assertParse(parser, true, "2006-W27-3");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73670);assertParse(parser, true, "2006-123");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73671);assertParse(parser, false, "2006-06-09T+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73672);assertParse(parser, false, "2006-W27-3T+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73673);assertParse(parser, false, "2006-123T+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73674);assertParse(parser, true, "2006-06-09T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73675);assertParse(parser, true, "2006-W27-3T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73676);assertParse(parser, true, "2006-123T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73677);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73678);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73679);assertParse(parser, false, "2006-123T10:20:30.040+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73680);assertParse(parser, false, "T10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73681);assertParse(parser, false, "T10.5");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73682);assertParse(parser, false, "T10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73683);assertParse(parser, false, "T10.5+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73684);assertParse(parser, false, "10:20:30.040");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73685);assertParse(parser, false, "10.5");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73686);assertParse(parser, false, "10:20:30.040+02:00");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73687);assertParse(parser, false, "10.5+02:00");

        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73688);assertNoPrint(parser);
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void test_date() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi49um1kux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_date",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi49um1kux(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73689);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73690);DateTimeFormatter parser = ISODateTimeFormat.date();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73691);assertParse(parser, "2006-02-04", new DateTime(2006, 2, 4, 0, 0, 0, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73692);assertParse(parser, "2006-2-04", new DateTime(2006, 2, 4, 0, 0, 0, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73693);assertParse(parser, "2006-02-4", new DateTime(2006, 2, 4, 0, 0, 0, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73694);assertParse(parser, "2006-2-4", new DateTime(2006, 2, 4, 0, 0, 0, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73695);assertParse(parser, "+2006-02-04", new DateTime(2006, 2, 4, 0, 0, 0, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73696);assertParse(parser, false, "2006-02-");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73697);assertParse(parser, false, "2006-02");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73698);assertParse(parser, false, "2006--4");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73699);assertParse(parser, false, "2006-1");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73700);assertParse(parser, false, "2006");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_time() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u4ccpt1kv9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_time",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u4ccpt1kv9(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73701);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73702);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73703);DateTimeFormatter parser = ISODateTimeFormat.time();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73704);assertParse(parser, "10:20:30.400999999Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73705);assertParse(parser, "10:20:30.400Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73706);assertParse(parser, "10:20:30.40Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73707);assertParse(parser, "10:20:30.4Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73708);assertParse(parser, "5:6:7.8Z", new DateTime(1970, 1, 1, 5, 6, 7, 800));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73709);assertParse(parser, false, "10:20.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73710);assertParse(parser, false, "10:2.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73711);assertParse(parser, false, "10.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73712);assertParse(parser, false, "1.400Z");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_timeNoMillis() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17nk7p41kvl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_timeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73713,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17nk7p41kvl(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73713);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73714);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73715);DateTimeFormatter parser = ISODateTimeFormat.timeNoMillis();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73716);assertParse(parser, "10:20:30Z", new DateTime(1970, 1, 1, 10, 20, 30, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73717);assertParse(parser, "5:6:7Z", new DateTime(1970, 1, 1, 5, 6, 7, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73718);assertParse(parser, false, "10:20Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73719);assertParse(parser, false, "10:2Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73720);assertParse(parser, false, "10Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73721);assertParse(parser, false, "1Z");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_tTime() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_183wy0r1kvu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_tTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73722,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_183wy0r1kvu(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73722);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73723);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73724);DateTimeFormatter parser = ISODateTimeFormat.tTime();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73725);assertParse(parser, "T10:20:30.400999999Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73726);assertParse(parser, "T10:20:30.400Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73727);assertParse(parser, "T10:20:30.40Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73728);assertParse(parser, "T10:20:30.4Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73729);assertParse(parser, "T5:6:7.8Z", new DateTime(1970, 1, 1, 5, 6, 7, 800));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73730);assertParse(parser, false, "T10:20.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73731);assertParse(parser, false, "T102.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73732);assertParse(parser, false, "T10.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73733);assertParse(parser, false, "T1.400Z");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_tTimeNoMillis() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vcko2q1kw6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_tTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vcko2q1kw6(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73734);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73735);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73736);DateTimeFormatter parser = ISODateTimeFormat.tTimeNoMillis();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73737);assertParse(parser, "T10:20:30Z", new DateTime(1970, 1, 1, 10, 20, 30, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73738);assertParse(parser, "T5:6:7Z", new DateTime(1970, 1, 1, 5, 6, 7, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73739);assertParse(parser, false, "T10:20Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73740);assertParse(parser, false, "T10:2Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73741);assertParse(parser, false, "T10Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73742);assertParse(parser, false, "T1Z");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_dateTime() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_157joj31kwf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_157joj31kwf(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73743);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73744);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73745);DateTimeFormatter parser = ISODateTimeFormat.dateTime();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73746);assertParse(parser, "2006-02-04T10:20:30.400999999Z", new DateTime(2006, 2, 4, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73747);assertParse(parser, "2006-02-04T10:20:30.400Z", new DateTime(2006, 2, 4, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73748);assertParse(parser, "2006-02-04T10:20:30.40Z", new DateTime(2006, 2, 4, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73749);assertParse(parser, "2006-02-04T10:20:30.4Z", new DateTime(2006, 2, 4, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73750);assertParse(parser, "2006-02-4T10:20:30.400Z", new DateTime(2006, 2, 4, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73751);assertParse(parser, "2006-2-04T10:20:30.400Z", new DateTime(2006, 2, 4, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73752);assertParse(parser, "2006-2-4T10:20:30.400Z", new DateTime(2006, 2, 4, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73753);assertParse(parser, "2006-02-04T5:6:7.800Z", new DateTime(2006, 2, 4, 5, 6, 7, 800));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73754);assertParse(parser, "+2006-02-04T5:6:7.800Z", new DateTime(2006, 2, 4, 5, 6, 7, 800));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73755);assertParse(parser, false, "2006-02-T10:20:30.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73756);assertParse(parser, false, "2006-12T10:20:30.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73757);assertParse(parser, false, "2006-1T10:20:30.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73758);assertParse(parser, false, "2006T10:20:30.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73759);assertParse(parser, false, "200T10:20:30.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73760);assertParse(parser, false, "20T10:20:30.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73761);assertParse(parser, false, "2T10:20:30.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73762);assertParse(parser, false, "2006-02-04T10:20.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73763);assertParse(parser, false, "2006-02-04T10:2.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73764);assertParse(parser, false, "2006-02-04T10.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73765);assertParse(parser, false, "2006-02-04T1.400Z");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_dateTimeNoMillis() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ujii21kx2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ujii21kx2(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73766);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73767);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73768);DateTimeFormatter parser = ISODateTimeFormat.dateTimeNoMillis();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73769);assertParse(parser, "2006-02-04T10:20:30Z", new DateTime(2006, 2, 4, 10, 20, 30, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73770);assertParse(parser, "2006-02-4T10:20:30Z", new DateTime(2006, 2, 4, 10, 20, 30, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73771);assertParse(parser, "2006-2-04T10:20:30Z", new DateTime(2006, 2, 4, 10, 20, 30, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73772);assertParse(parser, "2006-2-4T10:20:30Z", new DateTime(2006, 2, 4, 10, 20, 30, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73773);assertParse(parser, "2006-02-04T5:6:7Z", new DateTime(2006, 2, 4, 5, 6, 7, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73774);assertParse(parser, "+2006-02-04T5:6:7Z", new DateTime(2006, 2, 4, 5, 6, 7, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73775);assertParse(parser, false, "2006-02-T10:20:30Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73776);assertParse(parser, false, "2006-12T10:20:30Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73777);assertParse(parser, false, "2006-1T10:20:30Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73778);assertParse(parser, false, "2006T10:20:30Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73779);assertParse(parser, false, "200T10:20:30Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73780);assertParse(parser, false, "20T10:20:30Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73781);assertParse(parser, false, "2T10:20:30Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73782);assertParse(parser, false, "2006-02-04T10:20Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73783);assertParse(parser, false, "2006-02-04T10:2Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73784);assertParse(parser, false, "2006-02-04T10Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73785);assertParse(parser, false, "2006-02-04T1Z");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_ordinalDate() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pd8z1j1kxm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_ordinalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pd8z1j1kxm(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73786);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73787);DateTimeFormatter parser = ISODateTimeFormat.ordinalDate();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73788);assertParse(parser, "2006-123", new DateTime(2006, 1, 1, 0, 0, 0, 0).withDayOfYear(123));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73789);assertParse(parser, "2006-12", new DateTime(2006, 1, 1, 0, 0, 0, 0).withDayOfYear(12));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73790);assertParse(parser, "2006-1", new DateTime(2006, 1, 1, 0, 0, 0, 0).withDayOfYear(1));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73791);assertParse(parser, "+2006-123", new DateTime(2006, 1, 1, 0, 0, 0, 0).withDayOfYear(123));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73792);assertParse(parser, false, "2006-");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73793);assertParse(parser, false, "2006");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_ordinalDateTime() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z9ufhi1kxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_ordinalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z9ufhi1kxu(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73794);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73795);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73796);DateTimeFormatter parser = ISODateTimeFormat.ordinalDateTime();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73797);assertParse(parser, "2006-123T10:20:30.400999999Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73798);assertParse(parser, "2006-123T10:20:30.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73799);assertParse(parser, "2006-123T10:20:30.40Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73800);assertParse(parser, "2006-123T10:20:30.4Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73801);assertParse(parser, "2006-12T10:20:30.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(12));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73802);assertParse(parser, "2006-1T10:20:30.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(1));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73803);assertParse(parser, "2006-123T5:6:7.800Z", new DateTime(2006, 1, 1, 5, 6, 7, 800).withDayOfYear(123));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73804);assertParse(parser, "+2006-123T5:6:7.800Z", new DateTime(2006, 1, 1, 5, 6, 7, 800).withDayOfYear(123));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73805);assertParse(parser, false, "2006-T10:20:30.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73806);assertParse(parser, false, "2006T10:20:30.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73807);assertParse(parser, false, "2006-123T10:20.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73808);assertParse(parser, false, "2006-123T10:2.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73809);assertParse(parser, false, "2006-123T10.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73810);assertParse(parser, false, "2006-123T1.400Z");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_ordinalDateTimeNoMillis() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13uf7x1kyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_ordinalDateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13uf7x1kyb(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73811);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73812);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73813);DateTimeFormatter parser = ISODateTimeFormat.ordinalDateTimeNoMillis();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73814);assertParse(parser, "2006-123T10:20:30Z", new DateTime(2006, 1, 1, 10, 20, 30, 0).withDayOfYear(123));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73815);assertParse(parser, "2006-12T10:20:30Z", new DateTime(2006, 1, 1, 10, 20, 30, 0).withDayOfYear(12));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73816);assertParse(parser, "2006-1T10:20:30Z", new DateTime(2006, 1, 1, 10, 20, 30, 0).withDayOfYear(1));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73817);assertParse(parser, "2006-123T5:6:7Z", new DateTime(2006, 1, 1, 5, 6, 7, 0).withDayOfYear(123));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73818);assertParse(parser, "+2006-123T5:6:7Z", new DateTime(2006, 1, 1, 5, 6, 7, 0).withDayOfYear(123));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73819);assertParse(parser, false, "2006-T10:20:30Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73820);assertParse(parser, false, "2006T10:20:30Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73821);assertParse(parser, false, "2006-123T10:20Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73822);assertParse(parser, false, "2006-123T10:2Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73823);assertParse(parser, false, "2006-123T10Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73824);assertParse(parser, false, "2006-123T1Z");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_weekDate() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rqiy8a1kyp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_weekDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rqiy8a1kyp(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73825);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73826);DateTimeFormatter parser = ISODateTimeFormat.weekDate();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73827);assertParse(parser, "2006-W27-3", new DateTime(2006, 6, 1, 0, 0, 0, 0).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73828);assertParse(parser, "2006-W2-3", new DateTime(2006, 6, 1, 0, 0, 0, 0).withWeekOfWeekyear(2).withDayOfWeek(3));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73829);assertParse(parser, "+2006-W27-3", new DateTime(2006, 6, 1, 0, 0, 0, 0).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73830);assertParse(parser, false, "2006-W-3");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73831);assertParse(parser, false, "2006-W27-");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73832);assertParse(parser, false, "2006-W27");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73833);assertParse(parser, false, "2006-W2");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73834);assertParse(parser, false, "2006-W");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_weekDateTime() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1euc591kyz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_weekDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1euc591kyz(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73835);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73836);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73837);DateTimeFormatter parser = ISODateTimeFormat.weekDateTime();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73838);assertParse(parser, "2006-W27-3T10:20:30.400999999Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73839);assertParse(parser, "2006-W27-3T10:20:30.400Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73840);assertParse(parser, "2006-W27-3T10:20:30.40Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73841);assertParse(parser, "2006-W27-3T10:20:30.4Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73842);assertParse(parser, "2006-W2-3T10:20:30.400Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(2).withDayOfWeek(3));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73843);assertParse(parser, "2006-W27-3T5:6:7.800Z", new DateTime(2006, 6, 1, 5, 6, 7, 800).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73844);assertParse(parser, "+2006-W27-3T5:6:7.800Z", new DateTime(2006, 6, 1, 5, 6, 7, 800).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73845);assertParse(parser, false, "2006-W27-T10:20:30.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73846);assertParse(parser, false, "2006-W27T10:20:30.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73847);assertParse(parser, false, "2006-W2T10:20:30.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73848);assertParse(parser, false, "2006-W-3T10:20:30.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73849);assertParse(parser, false, "2006-W27-3T10:20.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73850);assertParse(parser, false, "2006-W27-3T10:2.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73851);assertParse(parser, false, "2006-W27-3T10.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73852);assertParse(parser, false, "2006-W27-3T1.400Z");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_weekDateTimeNoMillis() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gabhm1kzh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_weekDateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gabhm1kzh(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73853);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73854);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73855);DateTimeFormatter parser = ISODateTimeFormat.weekDateTimeNoMillis();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73856);assertParse(parser, "2006-W27-3T10:20:30Z", new DateTime(2006, 6, 1, 10, 20, 30, 0).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73857);assertParse(parser, "2006-W2-3T10:20:30Z", new DateTime(2006, 6, 1, 10, 20, 30, 0).withWeekOfWeekyear(2).withDayOfWeek(3));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73858);assertParse(parser, "2006-W27-3T5:6:7Z", new DateTime(2006, 6, 1, 5, 6, 7, 0).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73859);assertParse(parser, "+2006-W27-3T5:6:7Z", new DateTime(2006, 6, 1, 5, 6, 7, 0).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73860);assertParse(parser, false, "2006-W27-T10:20:30Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73861);assertParse(parser, false, "2006-W27T10:20:30Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73862);assertParse(parser, false, "2006-W2T10:20:30Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73863);assertParse(parser, false, "2006-W-3T10:20:30Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73864);assertParse(parser, false, "2006-W27-3T10:20Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73865);assertParse(parser, false, "2006-W27-3T10:2Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73866);assertParse(parser, false, "2006-W27-3T10Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73867);assertParse(parser, false, "2006-W27-3T1Z");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void test_basicDate() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vm22e1kzw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73868,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vm22e1kzw(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73868);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73869);DateTimeFormatter parser = ISODateTimeFormat.basicDate();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73870);assertParse(parser, "20060204", new DateTime(2006, 2, 4, 0, 0, 0, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73871);assertParse(parser, "+20060204", new DateTime(2006, 2, 4, 0, 0, 0, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73872);assertParse(parser, false, "2006024");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73873);assertParse(parser, false, "200602");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73874);assertParse(parser, false, "20061");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73875);assertParse(parser, false, "2006");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_basicTime() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11gymnp1l04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11gymnp1l04(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73876);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73877);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73878);DateTimeFormatter parser = ISODateTimeFormat.basicTime();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73879);assertParse(parser, "102030.400999999Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73880);assertParse(parser, "102030.400Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73881);assertParse(parser, "102030.40Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73882);assertParse(parser, "102030.4Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73883);assertParse(parser, false, "10203.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73884);assertParse(parser, false, "1020.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73885);assertParse(parser, false, "102.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73886);assertParse(parser, false, "10.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73887);assertParse(parser, false, "1.400Z");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_basicTimeNoMillis() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14909gc1l0g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73888,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14909gc1l0g(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73888);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73889);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73890);DateTimeFormatter parser = ISODateTimeFormat.basicTimeNoMillis();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73891);assertParse(parser, "102030Z", new DateTime(1970, 1, 1, 10, 20, 30, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73892);assertParse(parser, false, "10203Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73893);assertParse(parser, false, "1020Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73894);assertParse(parser, false, "102Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73895);assertParse(parser, false, "10Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73896);assertParse(parser, false, "1Z");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_basicTTime() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rnju3d1l0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicTTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rnju3d1l0p(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73897);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73898);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73899);DateTimeFormatter parser = ISODateTimeFormat.basicTTime();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73900);assertParse(parser, "T102030.400999999Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73901);assertParse(parser, "T102030.400Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73902);assertParse(parser, "T102030.40Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73903);assertParse(parser, "T102030.4Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73904);assertParse(parser, false, "T10203.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73905);assertParse(parser, false, "T1020.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73906);assertParse(parser, false, "T102.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73907);assertParse(parser, false, "T10.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73908);assertParse(parser, false, "T1.400Z");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_basicTTimeNoMillis() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1psgw361l11();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicTTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1psgw361l11(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73909);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73910);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73911);DateTimeFormatter parser = ISODateTimeFormat.basicTTimeNoMillis();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73912);assertParse(parser, "T102030Z", new DateTime(1970, 1, 1, 10, 20, 30, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73913);assertParse(parser, false, "T10203Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73914);assertParse(parser, false, "T1020Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73915);assertParse(parser, false, "T102Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73916);assertParse(parser, false, "T10Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73917);assertParse(parser, false, "T1Z");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_basicDateTime() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g7qlvh1l1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g7qlvh1l1a(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73918);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73919);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73920);DateTimeFormatter parser = ISODateTimeFormat.basicDateTime();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73921);assertParse(parser, "20061204T102030.400999999Z", new DateTime(2006, 12, 4, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73922);assertParse(parser, "20061204T102030.400Z", new DateTime(2006, 12, 4, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73923);assertParse(parser, "20061204T102030.40Z", new DateTime(2006, 12, 4, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73924);assertParse(parser, "20061204T102030.4Z", new DateTime(2006, 12, 4, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73925);assertParse(parser, "+20061204T102030.4Z", new DateTime(2006, 12, 4, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73926);assertParse(parser, false, "2006120T102030.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73927);assertParse(parser, false, "200612T102030.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73928);assertParse(parser, false, "20061T102030.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73929);assertParse(parser, false, "2006T102030.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73930);assertParse(parser, false, "200T102030.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73931);assertParse(parser, false, "20T102030.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73932);assertParse(parser, false, "2T102030.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73933);assertParse(parser, false, "20061204T10203.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73934);assertParse(parser, false, "20061204T1020.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73935);assertParse(parser, false, "20061204T102.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73936);assertParse(parser, false, "20061204T10.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73937);assertParse(parser, false, "20061204T1.400Z");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_basicDateTimeNoMillis() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18o9hg61l1u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicDateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18o9hg61l1u(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73938);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73939);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73940);DateTimeFormatter parser = ISODateTimeFormat.basicDateTimeNoMillis();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73941);assertParse(parser, "20061204T102030Z", new DateTime(2006, 12, 4, 10, 20, 30, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73942);assertParse(parser, "+20061204T102030Z", new DateTime(2006, 12, 4, 10, 20, 30, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73943);assertParse(parser, false, "2006120T102030Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73944);assertParse(parser, false, "200612T102030Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73945);assertParse(parser, false, "20061T102030Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73946);assertParse(parser, false, "2006T102030Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73947);assertParse(parser, false, "200T102030Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73948);assertParse(parser, false, "20T102030Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73949);assertParse(parser, false, "2T102030Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73950);assertParse(parser, false, "20061204T10203Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73951);assertParse(parser, false, "20061204T1020Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73952);assertParse(parser, false, "20061204T102Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73953);assertParse(parser, false, "20061204T10Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73954);assertParse(parser, false, "20061204T1Z");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_basicOrdinalDate() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_122js1n1l2b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicOrdinalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_122js1n1l2b(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73955);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73956);DateTimeFormatter parser = ISODateTimeFormat.basicOrdinalDate();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73957);assertParse(parser, "2006123", new DateTime(2006, 1, 1, 0, 0, 0, 0).withDayOfYear(123));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73958);assertParse(parser, "+2006123", new DateTime(2006, 1, 1, 0, 0, 0, 0).withDayOfYear(123));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73959);assertParse(parser, false, "200612");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73960);assertParse(parser, false, "20061");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73961);assertParse(parser, false, "2006");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_basicOrdinalDateTime() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uj9l761l2i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicOrdinalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uj9l761l2i(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73962);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73963);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73964);DateTimeFormatter parser = ISODateTimeFormat.basicOrdinalDateTime();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73965);assertParse(parser, "2006123T102030.400999999Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73966);assertParse(parser, "2006123T102030.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73967);assertParse(parser, "2006123T102030.40Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73968);assertParse(parser, "2006123T102030.4Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73969);assertParse(parser, "+2006123T102030.4Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73970);assertParse(parser, false, "200612T102030.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73971);assertParse(parser, false, "20061T102030.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73972);assertParse(parser, false, "2006T102030.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73973);assertParse(parser, false, "200T102030.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73974);assertParse(parser, false, "20T102030.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73975);assertParse(parser, false, "2T102030.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73976);assertParse(parser, false, "2006123T10203.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73977);assertParse(parser, false, "2006123T1020.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73978);assertParse(parser, false, "2006123T102.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73979);assertParse(parser, false, "2006123T10.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73980);assertParse(parser, false, "2006123T1.400Z");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_basicOrdinalDateTimeNoMillis() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jt5xaf1l31();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicOrdinalDateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jt5xaf1l31(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73981);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73982);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73983);DateTimeFormatter parser = ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73984);assertParse(parser, "2006123T102030Z", new DateTime(2006, 1, 1, 10, 20, 30, 0).withDayOfYear(123));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73985);assertParse(parser, "+2006123T102030Z", new DateTime(2006, 1, 1, 10, 20, 30, 0).withDayOfYear(123));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73986);assertParse(parser, false, "200612T102030Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73987);assertParse(parser, false, "20061T102030Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73988);assertParse(parser, false, "2006T102030Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73989);assertParse(parser, false, "200T102030Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73990);assertParse(parser, false, "20T102030Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73991);assertParse(parser, false, "2T102030Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73992);assertParse(parser, false, "2006123T10203Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73993);assertParse(parser, false, "2006123T1020Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73994);assertParse(parser, false, "2006123T102Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73995);assertParse(parser, false, "2006123T10Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73996);assertParse(parser, false, "2006123T1Z");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_basicWeekDate() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),73997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lvatca1l3h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicWeekDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73997,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lvatca1l3h(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(73997);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73998);DateTimeFormatter parser = ISODateTimeFormat.basicWeekDate();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(73999);assertParse(parser, "2006W273", new DateTime(2006, 6, 1, 0, 0, 0, 0).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74000);assertParse(parser, "+2006W273", new DateTime(2006, 6, 1, 0, 0, 0, 0).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74001);assertParse(parser, false, "2006W27");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74002);assertParse(parser, false, "2006W2");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74003);assertParse(parser, false, "2006W");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_basicWeekDateTime() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),74004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bhq5071l3o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicWeekDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bhq5071l3o(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(74004);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74005);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74006);DateTimeFormatter parser = ISODateTimeFormat.basicWeekDateTime();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74007);assertParse(parser, "2006W273T102030.400999999Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74008);assertParse(parser, "2006W273T102030.400Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74009);assertParse(parser, "2006W273T102030.40Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74010);assertParse(parser, "2006W273T102030.4Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74011);assertParse(parser, "+2006W273T102030.4Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74012);assertParse(parser, false, "2006W27T102030.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74013);assertParse(parser, false, "2006W2T102030.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74014);assertParse(parser, false, "2006W273T10203.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74015);assertParse(parser, false, "2006W273T1020.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74016);assertParse(parser, false, "2006W273T102.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74017);assertParse(parser, false, "2006W273T10.400Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74018);assertParse(parser, false, "2006W273T1.400Z");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_basicWeekDateTimeNoMillis() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),74019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ghq9oe1l43();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicWeekDateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74019,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ghq9oe1l43(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(74019);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74020);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74021);DateTimeFormatter parser = ISODateTimeFormat.basicWeekDateTimeNoMillis();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74022);assertParse(parser, "2006W273T102030Z", new DateTime(2006, 6, 1, 10, 20, 30, 0).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74023);assertParse(parser, "+2006W273T102030Z", new DateTime(2006, 6, 1, 10, 20, 30, 0).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74024);assertParse(parser, false, "2006W27T102030Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74025);assertParse(parser, false, "2006W2T102030Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74026);assertParse(parser, false, "2006W273T10203Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74027);assertParse(parser, false, "2006W273T1020Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74028);assertParse(parser, false, "2006W273T102Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74029);assertParse(parser, false, "2006W273T10Z");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74030);assertParse(parser, false, "2006W273T1Z");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void test_hourMinute() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),74031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ar3bg1l4f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_hourMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74031,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ar3bg1l4f(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(74031);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74032);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74033);DateTimeFormatter parser = ISODateTimeFormat.hourMinute();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74034);assertParse(parser, "10:20", new DateTime(1970, 1, 1, 10, 20, 0, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74035);assertParse(parser, "5:6", new DateTime(1970, 1, 1, 5, 6, 0, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74036);assertParse(parser, false, "10:20:30.400999999");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74037);assertParse(parser, false, "10:20:30.400");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74038);assertParse(parser, false, "10:20:30");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74039);assertParse(parser, false, "10:20.400");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74040);assertParse(parser, false, "10:2.400");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74041);assertParse(parser, false, "10.400");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74042);assertParse(parser, false, "1.400");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_hourMinuteSecond() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),74043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1du5nts1l4r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_hourMinuteSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74043,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1du5nts1l4r(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(74043);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74044);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74045);DateTimeFormatter parser = ISODateTimeFormat.hourMinuteSecond();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74046);assertParse(parser, "10:20:30", new DateTime(1970, 1, 1, 10, 20, 30, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74047);assertParse(parser, "5:6:7", new DateTime(1970, 1, 1, 5, 6, 7, 0));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74048);assertParse(parser, false, "10:20:30.400999999");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74049);assertParse(parser, false, "10:20:30.400");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74050);assertParse(parser, false, "10:20:30.4");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74051);assertParse(parser, false, "10:20.400");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74052);assertParse(parser, false, "10:2.400");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74053);assertParse(parser, false, "10.400");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74054);assertParse(parser, false, "1.400");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_hourMinuteSecondMillis() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),74055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dm3p61l53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_hourMinuteSecondMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74055,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dm3p61l53(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(74055);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74056);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74057);DateTimeFormatter parser = ISODateTimeFormat.hourMinuteSecondMillis();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74058);assertParse(parser, "10:20:30.400", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74059);assertParse(parser, "10:20:30.40", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74060);assertParse(parser, "10:20:30.4", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74061);assertParse(parser, "5:6:7.8", new DateTime(1970, 1, 1, 5, 6, 7, 800));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74062);assertParse(parser, false, "10:20:30.400999999");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74063);assertParse(parser, false, "10:20.400");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74064);assertParse(parser, false, "10:2.400");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74065);assertParse(parser, false, "10.400");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74066);assertParse(parser, false, "1.400");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_hourMinuteSecondFraction() {__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceStart(getClass().getName(),74067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vgzb5q1l5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kkz1kkzlgchoszb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kkz1kkzlgchoszb.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_hourMinuteSecondFraction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vgzb5q1l5f(){try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(74067);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74068);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74069);DateTimeFormatter parser = ISODateTimeFormat.hourMinuteSecondFraction();
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74070);assertParse(parser, "10:20:30.400999999", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74071);assertParse(parser, "10:20:30.400", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74072);assertParse(parser, "10:20:30.40", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74073);assertParse(parser, "10:20:30.4", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74074);assertParse(parser, "5:6:7.8", new DateTime(1970, 1, 1, 5, 6, 7, 800));
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74075);assertParse(parser, false, "10:20.400");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74076);assertParse(parser, false, "10:2.400");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74077);assertParse(parser, false, "10.400");
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74078);assertParse(parser, false, "1.400");
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private void assertParse(DateTimeFormatter parser, boolean expected, String str) {try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(74079);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74080);if ((((expected)&&(__CLR4_4_11kkz1kkzlgchoszb.R.iget(74081)!=0|true))||(__CLR4_4_11kkz1kkzlgchoszb.R.iget(74082)==0&false))) {{
            __CLR4_4_11kkz1kkzlgchoszb.R.inc(74083);parser.parseMillis(str);
        } }else {{
            __CLR4_4_11kkz1kkzlgchoszb.R.inc(74084);try {
                __CLR4_4_11kkz1kkzlgchoszb.R.inc(74085);parser.parseMillis(str);
                __CLR4_4_11kkz1kkzlgchoszb.R.inc(74086);fail();
            } catch (IllegalArgumentException ex) {
                // expected
            }
        }
    }}finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    private void assertParse(DateTimeFormatter parser, String str, DateTime expected) {try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(74087);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74088);DateTime dt = parser.parseDateTime(str);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74089);assertEquals(expected, dt);
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

    private void assertNoPrint(DateTimeFormatter parser) {try{__CLR4_4_11kkz1kkzlgchoszb.R.inc(74090);
        __CLR4_4_11kkz1kkzlgchoszb.R.inc(74091);try {
            __CLR4_4_11kkz1kkzlgchoszb.R.inc(74092);parser.print(new DateTime(2012, 6, 30, 12, 0, 0));
        } catch (UnsupportedOperationException ex) {
            // expected
        }
    }finally{__CLR4_4_11kkz1kkzlgchoszb.R.flushNeeded();}}

}
