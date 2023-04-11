/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2010 Stephen Colebourne
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
import java.util.Arrays;
import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for MonthDay. Based on {@link TestYearMonth_Basics}
 */
public class TestMonthDay_Basics {static class __CLR4_4_1wozwozlgchos57{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,43098,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    //    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    //    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
//    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
//    private static final Chronology ISO_TOKYO = ISOChronology.getInstance(TOKYO);
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    //    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);
//    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_1wozwozlgchos57.R.inc(42371);
        __CLR4_4_1wozwozlgchos57.R.inc(42372);TestMonthDay_Basics TB = new TestMonthDay_Basics();
        __CLR4_4_1wozwozlgchos57.R.inc(42373);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42374);TB.testGet();
        __CLR4_4_1wozwozlgchos57.R.inc(42375);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42376);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42377);TB.testSize();
        __CLR4_4_1wozwozlgchos57.R.inc(42378);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42379);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42380);TB.testGetFieldType();
        __CLR4_4_1wozwozlgchos57.R.inc(42381);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42382);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42383);TB.testGetFieldTypes();
        __CLR4_4_1wozwozlgchos57.R.inc(42384);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42385);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42386);TB.testGetField();
        __CLR4_4_1wozwozlgchos57.R.inc(42387);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42388);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42389);TB.testGetFields();
        __CLR4_4_1wozwozlgchos57.R.inc(42390);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42391);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42392);TB.testGetValue();
        __CLR4_4_1wozwozlgchos57.R.inc(42393);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42394);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42395);TB.testGetValues();
        __CLR4_4_1wozwozlgchos57.R.inc(42396);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42397);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42398);TB.testIsSupported();
        __CLR4_4_1wozwozlgchos57.R.inc(42399);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42400);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42401);TB.testEqualsHashCode();
        __CLR4_4_1wozwozlgchos57.R.inc(42402);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42403);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42404);TB.testCompareTo();
        __CLR4_4_1wozwozlgchos57.R.inc(42405);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42406);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42407);TB.testIsEqual_MD();
        __CLR4_4_1wozwozlgchos57.R.inc(42408);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42409);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42410);TB.testIsBefore_MD();
        __CLR4_4_1wozwozlgchos57.R.inc(42411);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42412);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42413);TB.testIsAfter_MD();
        __CLR4_4_1wozwozlgchos57.R.inc(42414);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42415);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42416);TB.testWithChronologyRetainFields_Chrono();
        __CLR4_4_1wozwozlgchos57.R.inc(42417);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42418);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42419);TB.testWithChronologyRetainFields_sameChrono();
        __CLR4_4_1wozwozlgchos57.R.inc(42420);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42421);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42422);TB.testWithChronologyRetainFields_nullChrono();
        __CLR4_4_1wozwozlgchos57.R.inc(42423);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42424);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42425);TB.testWithField();
        __CLR4_4_1wozwozlgchos57.R.inc(42426);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42427);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42428);TB.testWithField_nullField();
        __CLR4_4_1wozwozlgchos57.R.inc(42429);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42430);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42431);TB.testWithField_unknownField();
        __CLR4_4_1wozwozlgchos57.R.inc(42432);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42433);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42434);TB.testWithField_same();
        __CLR4_4_1wozwozlgchos57.R.inc(42435);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42436);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42437);TB.testWithFieldAdded();
        __CLR4_4_1wozwozlgchos57.R.inc(42438);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42439);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42440);TB.testWithFieldAdded_nullField_zero();
        __CLR4_4_1wozwozlgchos57.R.inc(42441);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42442);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42443);TB.testWithFieldAdded_nullField_nonZero();
        __CLR4_4_1wozwozlgchos57.R.inc(42444);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42445);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42446);TB.testWithFieldAdded_zero();
        __CLR4_4_1wozwozlgchos57.R.inc(42447);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42448);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42449);TB.testWithFieldAdded_unknownField();
        __CLR4_4_1wozwozlgchos57.R.inc(42450);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42451);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42452);TB.testPlus_RP();
        __CLR4_4_1wozwozlgchos57.R.inc(42453);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42454);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42455);TB.testPlusMonths_int();
        __CLR4_4_1wozwozlgchos57.R.inc(42456);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42457);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42458);TB.testPlusMonths_int_fromLeap();
        __CLR4_4_1wozwozlgchos57.R.inc(42459);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42460);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42461);TB.testPlusMonths_int_negativeFromLeap();
        __CLR4_4_1wozwozlgchos57.R.inc(42462);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42463);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42464);TB.testPlusMonths_int_endOfMonthAdjust();
        __CLR4_4_1wozwozlgchos57.R.inc(42465);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42466);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42467);TB.testPlusMonths_int_negativeEndOfMonthAdjust();
        __CLR4_4_1wozwozlgchos57.R.inc(42468);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42469);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42470);TB.testPlusMonths_int_same();
        __CLR4_4_1wozwozlgchos57.R.inc(42471);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42472);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42473);TB.testPlusMonths_int_wrap();
        __CLR4_4_1wozwozlgchos57.R.inc(42474);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42475);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42476);TB.testPlusMonths_int_adjust();
        __CLR4_4_1wozwozlgchos57.R.inc(42477);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42478);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42479);TB.testPlusDays_int();
        __CLR4_4_1wozwozlgchos57.R.inc(42480);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42481);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42482);TB.testPlusDays_int_wrapMonth();
        __CLR4_4_1wozwozlgchos57.R.inc(42483);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42484);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42485);TB.testPlusDays_int_wrapMonthTwice();
        __CLR4_4_1wozwozlgchos57.R.inc(42486);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42487);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42488);TB.testPlusDays_int_wrapMonthIntoNextYear();
        __CLR4_4_1wozwozlgchos57.R.inc(42489);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42490);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42491);TB.testPlusDays_int_wrapMonthTwiceIntoNextYear();
        __CLR4_4_1wozwozlgchos57.R.inc(42492);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42493);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42494);TB.testPlusDays_int_wrap50();
        __CLR4_4_1wozwozlgchos57.R.inc(42495);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42496);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42497);TB.testPlusDays_int_toLeap();
        __CLR4_4_1wozwozlgchos57.R.inc(42498);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42499);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42500);TB.testPlusDays_int_fromLeap();
        __CLR4_4_1wozwozlgchos57.R.inc(42501);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42502);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42503);TB.testPlusDays_int_negativeFromLeap();
        __CLR4_4_1wozwozlgchos57.R.inc(42504);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42505);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42506);TB.testPlusDays_same();
        __CLR4_4_1wozwozlgchos57.R.inc(42507);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42508);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42509);TB.testMinus_RP();
        __CLR4_4_1wozwozlgchos57.R.inc(42510);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42511);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42512);TB.testMinusMonths_int();
        __CLR4_4_1wozwozlgchos57.R.inc(42513);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42514);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42515);TB.testMinusMonths_int_fromLeap();
        __CLR4_4_1wozwozlgchos57.R.inc(42516);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42517);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42518);TB.testMinusMonths_int_negativeFromLeap();
        __CLR4_4_1wozwozlgchos57.R.inc(42519);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42520);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42521);TB.testMinusMonths_int_endOfMonthAdjust();
        __CLR4_4_1wozwozlgchos57.R.inc(42522);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42523);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42524);TB.testMinusMonths_int_negativeEndOfMonthAdjust();
        __CLR4_4_1wozwozlgchos57.R.inc(42525);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42526);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42527);TB.testMinusMonths_int_same();
        __CLR4_4_1wozwozlgchos57.R.inc(42528);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42529);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42530);TB.testMinusMonths_int_wrap();
        __CLR4_4_1wozwozlgchos57.R.inc(42531);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42532);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42533);TB.testMinusMonths_int_adjust();
        __CLR4_4_1wozwozlgchos57.R.inc(42534);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42535);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42536);TB.testMinusDays_int();
        __CLR4_4_1wozwozlgchos57.R.inc(42537);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42538);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42539);TB.testMinusDays_int_wrapMonth();
        __CLR4_4_1wozwozlgchos57.R.inc(42540);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42541);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42542);TB.testMinusDays_int_wrapMonthTwice();
        __CLR4_4_1wozwozlgchos57.R.inc(42543);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42544);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42545);TB.testMinusDays_int_wrapMonthIntoLastYear();
        __CLR4_4_1wozwozlgchos57.R.inc(42546);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42547);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42548);TB.testMinusDays_int_wrapMonthTwiceIntoLastYear();
        __CLR4_4_1wozwozlgchos57.R.inc(42549);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42550);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42551);TB.testMinusDays_int_toLeap();
        __CLR4_4_1wozwozlgchos57.R.inc(42552);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42553);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42554);TB.testMinusDays_int_fromLeap();
        __CLR4_4_1wozwozlgchos57.R.inc(42555);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42556);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42557);TB.testMinusDays_int_negativeFromLeap();
        __CLR4_4_1wozwozlgchos57.R.inc(42558);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42559);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42560);TB.testMinusDays_same();
        __CLR4_4_1wozwozlgchos57.R.inc(42561);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42562);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42563);TB.testToLocalDate();
        __CLR4_4_1wozwozlgchos57.R.inc(42564);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42565);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42566);TB.testToDateTime_RI();
        __CLR4_4_1wozwozlgchos57.R.inc(42567);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42568);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42569);TB.testToDateTime_nullRI();
        __CLR4_4_1wozwozlgchos57.R.inc(42570);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42571);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42572);TB.testWithers();
        __CLR4_4_1wozwozlgchos57.R.inc(42573);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42574);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42575);TB.testProperty();
        __CLR4_4_1wozwozlgchos57.R.inc(42576);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42577);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42578);TB.testSerialization();
        __CLR4_4_1wozwozlgchos57.R.inc(42579);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42580);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42581);TB.testToString();
        __CLR4_4_1wozwozlgchos57.R.inc(42582);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42583);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42584);TB.testToString_String();
        __CLR4_4_1wozwozlgchos57.R.inc(42585);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42586);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42587);TB.testToString_String_Locale();
        __CLR4_4_1wozwozlgchos57.R.inc(42588);TB.tearDown();
        __CLR4_4_1wozwozlgchos57.R.inc(42589);TB.setUp();
        __CLR4_4_1wozwozlgchos57.R.inc(42590);TB.testToString_DTFormatter();
        __CLR4_4_1wozwozlgchos57.R.inc(42591);TB.tearDown();

    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestMonthDay_Basics.class);
    }

    public TestMonthDay_Basics(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1wozwozlgchos57.R.inc(42592);
        __CLR4_4_1wozwozlgchos57.R.inc(42593);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1wozwozlgchos57.R.inc(42594);zone = DateTimeZone.getDefault();
        __CLR4_4_1wozwozlgchos57.R.inc(42595);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1wozwozlgchos57.R.inc(42596);
        __CLR4_4_1wozwozlgchos57.R.inc(42597);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1wozwozlgchos57.R.inc(42598);DateTimeZone.setDefault(zone);
        __CLR4_4_1wozwozlgchos57.R.inc(42599);zone = null;
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGet() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tpje3vwvc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42600,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tpje3vwvc(){try{__CLR4_4_1wozwozlgchos57.R.inc(42600);
        __CLR4_4_1wozwozlgchos57.R.inc(42601);MonthDay test = new MonthDay();
        __CLR4_4_1wozwozlgchos57.R.inc(42602);assertEquals(6, test.get(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1wozwozlgchos57.R.inc(42603);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1wozwozlgchos57.R.inc(42604);try {
            __CLR4_4_1wozwozlgchos57.R.inc(42605);test.get(null);
            __CLR4_4_1wozwozlgchos57.R.inc(42606);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1wozwozlgchos57.R.inc(42607);try {
            __CLR4_4_1wozwozlgchos57.R.inc(42608);test.get(DateTimeFieldType.year());
            __CLR4_4_1wozwozlgchos57.R.inc(42609);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testSize() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xx122wvm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xx122wvm(){try{__CLR4_4_1wozwozlgchos57.R.inc(42610);
        __CLR4_4_1wozwozlgchos57.R.inc(42611);MonthDay test = new MonthDay();
        __CLR4_4_1wozwozlgchos57.R.inc(42612);assertEquals(2, test.size());
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testGetFieldType() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mvwvp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42613,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mvwvp(){try{__CLR4_4_1wozwozlgchos57.R.inc(42613);
        __CLR4_4_1wozwozlgchos57.R.inc(42614);MonthDay test = new MonthDay(COPTIC_PARIS);
        __CLR4_4_1wozwozlgchos57.R.inc(42615);assertSame(DateTimeFieldType.monthOfYear(), test.getFieldType(0));
        __CLR4_4_1wozwozlgchos57.R.inc(42616);assertSame(DateTimeFieldType.dayOfMonth(), test.getFieldType(1));

        __CLR4_4_1wozwozlgchos57.R.inc(42617);try {
            __CLR4_4_1wozwozlgchos57.R.inc(42618);test.getFieldType(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_1wozwozlgchos57.R.inc(42619);try {
            __CLR4_4_1wozwozlgchos57.R.inc(42620);test.getFieldType(2);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testGetFieldTypes() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5ndvuwvx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetFieldTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5ndvuwvx(){try{__CLR4_4_1wozwozlgchos57.R.inc(42621);
        __CLR4_4_1wozwozlgchos57.R.inc(42622);MonthDay test = new MonthDay(COPTIC_PARIS);
        __CLR4_4_1wozwozlgchos57.R.inc(42623);DateTimeFieldType[] fields = test.getFieldTypes();
        __CLR4_4_1wozwozlgchos57.R.inc(42624);assertEquals(2, fields.length);
        __CLR4_4_1wozwozlgchos57.R.inc(42625);assertSame(DateTimeFieldType.monthOfYear(), fields[0]);
        __CLR4_4_1wozwozlgchos57.R.inc(42626);assertSame(DateTimeFieldType.dayOfMonth(), fields[1]);
        __CLR4_4_1wozwozlgchos57.R.inc(42627);assertNotSame(test.getFieldTypes(), test.getFieldTypes());
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testGetField() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lx8n7nww4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42628,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lx8n7nww4(){try{__CLR4_4_1wozwozlgchos57.R.inc(42628);
        __CLR4_4_1wozwozlgchos57.R.inc(42629);MonthDay test = new MonthDay(COPTIC_PARIS);
        __CLR4_4_1wozwozlgchos57.R.inc(42630);assertSame(COPTIC_UTC.monthOfYear(), test.getField(0));
        __CLR4_4_1wozwozlgchos57.R.inc(42631);assertSame(COPTIC_UTC.dayOfMonth(), test.getField(1));
        __CLR4_4_1wozwozlgchos57.R.inc(42632);try {
            __CLR4_4_1wozwozlgchos57.R.inc(42633);test.getField(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_1wozwozlgchos57.R.inc(42634);try {
            __CLR4_4_1wozwozlgchos57.R.inc(42635);test.getField(2);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testGetFields() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmeaswwc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42636,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmeaswwc(){try{__CLR4_4_1wozwozlgchos57.R.inc(42636);
        __CLR4_4_1wozwozlgchos57.R.inc(42637);MonthDay test = new MonthDay(COPTIC_PARIS);
        __CLR4_4_1wozwozlgchos57.R.inc(42638);DateTimeField[] fields = test.getFields();
        __CLR4_4_1wozwozlgchos57.R.inc(42639);assertEquals(2, fields.length);
        __CLR4_4_1wozwozlgchos57.R.inc(42640);assertSame(COPTIC_UTC.monthOfYear(), fields[0]);
        __CLR4_4_1wozwozlgchos57.R.inc(42641);assertSame(COPTIC_UTC.dayOfMonth(), fields[1]);
        __CLR4_4_1wozwozlgchos57.R.inc(42642);assertNotSame(test.getFields(), test.getFields());
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testGetValue() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcksmkwwj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42643,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcksmkwwj(){try{__CLR4_4_1wozwozlgchos57.R.inc(42643);
        __CLR4_4_1wozwozlgchos57.R.inc(42644);MonthDay test = new MonthDay();
        __CLR4_4_1wozwozlgchos57.R.inc(42645);assertEquals(6, test.getValue(0));
        __CLR4_4_1wozwozlgchos57.R.inc(42646);assertEquals(9, test.getValue(1));
        __CLR4_4_1wozwozlgchos57.R.inc(42647);try {
            __CLR4_4_1wozwozlgchos57.R.inc(42648);test.getValue(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_1wozwozlgchos57.R.inc(42649);try {
            __CLR4_4_1wozwozlgchos57.R.inc(42650);test.getValue(2);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testGetValues() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gduelwwr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gduelwwr(){try{__CLR4_4_1wozwozlgchos57.R.inc(42651);
        __CLR4_4_1wozwozlgchos57.R.inc(42652);MonthDay test = new MonthDay();
        __CLR4_4_1wozwozlgchos57.R.inc(42653);int[] values = test.getValues();
        __CLR4_4_1wozwozlgchos57.R.inc(42654);assertEquals(2, values.length);
        __CLR4_4_1wozwozlgchos57.R.inc(42655);assertEquals(6, values[0]);
        __CLR4_4_1wozwozlgchos57.R.inc(42656);assertEquals(9, values[1]);
        __CLR4_4_1wozwozlgchos57.R.inc(42657);assertNotSame(test.getValues(), test.getValues());
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testIsSupported() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hma24nwwy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testIsSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42658,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hma24nwwy(){try{__CLR4_4_1wozwozlgchos57.R.inc(42658);
        __CLR4_4_1wozwozlgchos57.R.inc(42659);MonthDay test = new MonthDay(COPTIC_PARIS);
        __CLR4_4_1wozwozlgchos57.R.inc(42660);assertEquals(false, test.isSupported(DateTimeFieldType.year()));
        __CLR4_4_1wozwozlgchos57.R.inc(42661);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1wozwozlgchos57.R.inc(42662);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1wozwozlgchos57.R.inc(42663);assertEquals(false, test.isSupported(DateTimeFieldType.hourOfDay()));
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testEqualsHashCode() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77wx4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42664,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77wx4(){try{__CLR4_4_1wozwozlgchos57.R.inc(42664);
        __CLR4_4_1wozwozlgchos57.R.inc(42665);MonthDay test1 = new MonthDay(10, 6, COPTIC_PARIS);
        __CLR4_4_1wozwozlgchos57.R.inc(42666);MonthDay test2 = new MonthDay(10, 6, COPTIC_PARIS);
        __CLR4_4_1wozwozlgchos57.R.inc(42667);assertEquals(true, test1.equals(test2));
        __CLR4_4_1wozwozlgchos57.R.inc(42668);assertEquals(true, test2.equals(test1));
        __CLR4_4_1wozwozlgchos57.R.inc(42669);assertEquals(true, test1.equals(test1));
        __CLR4_4_1wozwozlgchos57.R.inc(42670);assertEquals(true, test2.equals(test2));
        __CLR4_4_1wozwozlgchos57.R.inc(42671);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1wozwozlgchos57.R.inc(42672);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1wozwozlgchos57.R.inc(42673);assertEquals(true, test2.hashCode() == test2.hashCode());

        __CLR4_4_1wozwozlgchos57.R.inc(42674);MonthDay test3 = new MonthDay(10, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(42675);assertEquals(false, test1.equals(test3));
        __CLR4_4_1wozwozlgchos57.R.inc(42676);assertEquals(false, test2.equals(test3));
        __CLR4_4_1wozwozlgchos57.R.inc(42677);assertEquals(false, test3.equals(test1));
        __CLR4_4_1wozwozlgchos57.R.inc(42678);assertEquals(false, test3.equals(test2));
        __CLR4_4_1wozwozlgchos57.R.inc(42679);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1wozwozlgchos57.R.inc(42680);assertEquals(false, test2.hashCode() == test3.hashCode());

        __CLR4_4_1wozwozlgchos57.R.inc(42681);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1wozwozlgchos57.R.inc(42682);assertEquals(true, test1.equals(new MockMD()));
        __CLR4_4_1wozwozlgchos57.R.inc(42683);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE));
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    class MockMD extends MockPartial {

        @Override
        public Chronology getChronology() {try{__CLR4_4_1wozwozlgchos57.R.inc(42684);
            __CLR4_4_1wozwozlgchos57.R.inc(42685);return COPTIC_UTC;
        }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

        @Override
        public DateTimeField[] getFields() {try{__CLR4_4_1wozwozlgchos57.R.inc(42686);
            __CLR4_4_1wozwozlgchos57.R.inc(42687);return new DateTimeField[]{
                    COPTIC_UTC.monthOfYear(),
                    COPTIC_UTC.dayOfMonth()
            };
        }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

        @Override
        public int[] getValues() {try{__CLR4_4_1wozwozlgchos57.R.inc(42688);
            __CLR4_4_1wozwozlgchos57.R.inc(42689);return new int[]{10, 6};
        }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    @Test
    public void testCompareTo() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfvwxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfvwxu(){try{__CLR4_4_1wozwozlgchos57.R.inc(42690);
        __CLR4_4_1wozwozlgchos57.R.inc(42691);MonthDay test1 = new MonthDay(6, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(42692);MonthDay test1a = new MonthDay(6, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(42693);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_1wozwozlgchos57.R.inc(42694);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_1wozwozlgchos57.R.inc(42695);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_1wozwozlgchos57.R.inc(42696);assertEquals(0, test1a.compareTo(test1a));

        __CLR4_4_1wozwozlgchos57.R.inc(42697);MonthDay test2 = new MonthDay(6, 7);
        __CLR4_4_1wozwozlgchos57.R.inc(42698);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_1wozwozlgchos57.R.inc(42699);assertEquals(+1, test2.compareTo(test1));

        __CLR4_4_1wozwozlgchos57.R.inc(42700);MonthDay test3 = new MonthDay(6, 7, GregorianChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42701);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_1wozwozlgchos57.R.inc(42702);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_1wozwozlgchos57.R.inc(42703);assertEquals(0, test3.compareTo(test2));

        __CLR4_4_1wozwozlgchos57.R.inc(42704);DateTimeFieldType[] types = new DateTimeFieldType[]{
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.dayOfMonth()
        };
        __CLR4_4_1wozwozlgchos57.R.inc(42705);int[] values = new int[]{6, 6};
        __CLR4_4_1wozwozlgchos57.R.inc(42706);Partial p = new Partial(types, values);
        __CLR4_4_1wozwozlgchos57.R.inc(42707);assertEquals(0, test1.compareTo(p));
        __CLR4_4_1wozwozlgchos57.R.inc(42708);try {
            __CLR4_4_1wozwozlgchos57.R.inc(42709);test1.compareTo(null);
            __CLR4_4_1wozwozlgchos57.R.inc(42710);fail();
        } catch (NullPointerException ex) {
        }
        __CLR4_4_1wozwozlgchos57.R.inc(42711);try {
            __CLR4_4_1wozwozlgchos57.R.inc(42712);test1.compareTo(new LocalTime());
            __CLR4_4_1wozwozlgchos57.R.inc(42713);fail();
        } catch (ClassCastException ex) {
        }
        __CLR4_4_1wozwozlgchos57.R.inc(42714);Partial partial = new Partial()
                .with(DateTimeFieldType.centuryOfEra(), 1)
                .with(DateTimeFieldType.halfdayOfDay(), 0)
                .with(DateTimeFieldType.dayOfMonth(), 9);
        __CLR4_4_1wozwozlgchos57.R.inc(42715);try {
            __CLR4_4_1wozwozlgchos57.R.inc(42716);new MonthDay(10, 6).compareTo(partial);
            __CLR4_4_1wozwozlgchos57.R.inc(42717);fail();
        } catch (ClassCastException ex) {
        }
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsEqual_MD() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cq5dvfwym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testIsEqual_MD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cq5dvfwym(){try{__CLR4_4_1wozwozlgchos57.R.inc(42718);
        __CLR4_4_1wozwozlgchos57.R.inc(42719);MonthDay test1 = new MonthDay(6, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(42720);MonthDay test1a = new MonthDay(6, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(42721);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_1wozwozlgchos57.R.inc(42722);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_1wozwozlgchos57.R.inc(42723);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_1wozwozlgchos57.R.inc(42724);assertEquals(true, test1a.isEqual(test1a));

        __CLR4_4_1wozwozlgchos57.R.inc(42725);MonthDay test2 = new MonthDay(6, 7);
        __CLR4_4_1wozwozlgchos57.R.inc(42726);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_1wozwozlgchos57.R.inc(42727);assertEquals(false, test2.isEqual(test1));

        __CLR4_4_1wozwozlgchos57.R.inc(42728);MonthDay test3 = new MonthDay(6, 7, GregorianChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42729);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_1wozwozlgchos57.R.inc(42730);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_1wozwozlgchos57.R.inc(42731);assertEquals(true, test3.isEqual(test2));

        __CLR4_4_1wozwozlgchos57.R.inc(42732);try {
            __CLR4_4_1wozwozlgchos57.R.inc(42733);new MonthDay(6, 7).isEqual(null);
            __CLR4_4_1wozwozlgchos57.R.inc(42734);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsBefore_MD() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1serq9qwz3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testIsBefore_MD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1serq9qwz3(){try{__CLR4_4_1wozwozlgchos57.R.inc(42735);
        __CLR4_4_1wozwozlgchos57.R.inc(42736);MonthDay test1 = new MonthDay(6, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(42737);MonthDay test1a = new MonthDay(6, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(42738);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_1wozwozlgchos57.R.inc(42739);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_1wozwozlgchos57.R.inc(42740);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_1wozwozlgchos57.R.inc(42741);assertEquals(false, test1a.isBefore(test1a));

        __CLR4_4_1wozwozlgchos57.R.inc(42742);MonthDay test2 = new MonthDay(6, 7);
        __CLR4_4_1wozwozlgchos57.R.inc(42743);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_1wozwozlgchos57.R.inc(42744);assertEquals(false, test2.isBefore(test1));

        __CLR4_4_1wozwozlgchos57.R.inc(42745);MonthDay test3 = new MonthDay(6, 7, GregorianChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42746);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_1wozwozlgchos57.R.inc(42747);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_1wozwozlgchos57.R.inc(42748);assertEquals(false, test3.isBefore(test2));

        __CLR4_4_1wozwozlgchos57.R.inc(42749);try {
            __CLR4_4_1wozwozlgchos57.R.inc(42750);new MonthDay(6, 7).isBefore(null);
            __CLR4_4_1wozwozlgchos57.R.inc(42751);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsAfter_MD() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dqs4dwzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testIsAfter_MD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42752,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dqs4dwzk(){try{__CLR4_4_1wozwozlgchos57.R.inc(42752);
        __CLR4_4_1wozwozlgchos57.R.inc(42753);MonthDay test1 = new MonthDay(6, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(42754);MonthDay test1a = new MonthDay(6, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(42755);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_1wozwozlgchos57.R.inc(42756);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_1wozwozlgchos57.R.inc(42757);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_1wozwozlgchos57.R.inc(42758);assertEquals(false, test1a.isAfter(test1a));

        __CLR4_4_1wozwozlgchos57.R.inc(42759);MonthDay test2 = new MonthDay(6, 7);
        __CLR4_4_1wozwozlgchos57.R.inc(42760);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_1wozwozlgchos57.R.inc(42761);assertEquals(true, test2.isAfter(test1));

        __CLR4_4_1wozwozlgchos57.R.inc(42762);MonthDay test3 = new MonthDay(6, 7, GregorianChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42763);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_1wozwozlgchos57.R.inc(42764);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_1wozwozlgchos57.R.inc(42765);assertEquals(false, test3.isAfter(test2));

        __CLR4_4_1wozwozlgchos57.R.inc(42766);try {
            __CLR4_4_1wozwozlgchos57.R.inc(42767);new MonthDay(6, 7).isAfter(null);
            __CLR4_4_1wozwozlgchos57.R.inc(42768);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithChronologyRetainFields_Chrono() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143gerpx01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithChronologyRetainFields_Chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143gerpx01(){try{__CLR4_4_1wozwozlgchos57.R.inc(42769);
        __CLR4_4_1wozwozlgchos57.R.inc(42770);MonthDay base = new MonthDay(6, 6, COPTIC_PARIS);
        __CLR4_4_1wozwozlgchos57.R.inc(42771);MonthDay test = base.withChronologyRetainFields(BUDDHIST_TOKYO);
        __CLR4_4_1wozwozlgchos57.R.inc(42772);check(base, 6, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(42773);assertEquals(COPTIC_UTC, base.getChronology());
        __CLR4_4_1wozwozlgchos57.R.inc(42774);check(test, 6, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(42775);assertEquals(BUDDHIST_UTC, test.getChronology());
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testWithChronologyRetainFields_sameChrono() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15b1wdbx08();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithChronologyRetainFields_sameChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15b1wdbx08(){try{__CLR4_4_1wozwozlgchos57.R.inc(42776);
        __CLR4_4_1wozwozlgchos57.R.inc(42777);MonthDay base = new MonthDay(6, 6, COPTIC_PARIS);
        __CLR4_4_1wozwozlgchos57.R.inc(42778);MonthDay test = base.withChronologyRetainFields(COPTIC_TOKYO);
        __CLR4_4_1wozwozlgchos57.R.inc(42779);assertSame(base, test);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testWithChronologyRetainFields_nullChrono() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0ft9ax0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithChronologyRetainFields_nullChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0ft9ax0c(){try{__CLR4_4_1wozwozlgchos57.R.inc(42780);
        __CLR4_4_1wozwozlgchos57.R.inc(42781);MonthDay base = new MonthDay(6, 6, COPTIC_PARIS);
        __CLR4_4_1wozwozlgchos57.R.inc(42782);MonthDay test = base.withChronologyRetainFields(null);
        __CLR4_4_1wozwozlgchos57.R.inc(42783);check(base, 6, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(42784);assertEquals(COPTIC_UTC, base.getChronology());
        __CLR4_4_1wozwozlgchos57.R.inc(42785);check(test, 6, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(42786);assertEquals(ISO_UTC, test.getChronology());
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithField() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vrat1zx0j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vrat1zx0j(){try{__CLR4_4_1wozwozlgchos57.R.inc(42787);
        __CLR4_4_1wozwozlgchos57.R.inc(42788);MonthDay test = new MonthDay(9, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(42789);MonthDay result = test.withField(DateTimeFieldType.monthOfYear(), 10);

        __CLR4_4_1wozwozlgchos57.R.inc(42790);assertEquals(new MonthDay(9, 6), test);
        __CLR4_4_1wozwozlgchos57.R.inc(42791);assertEquals(new MonthDay(10, 6), result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testWithField_nullField() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xjqkwzx0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithField_nullField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42792,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xjqkwzx0o(){try{__CLR4_4_1wozwozlgchos57.R.inc(42792);
        __CLR4_4_1wozwozlgchos57.R.inc(42793);MonthDay test = new MonthDay(9, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(42794);try {
            __CLR4_4_1wozwozlgchos57.R.inc(42795);test.withField(null, 6);
            __CLR4_4_1wozwozlgchos57.R.inc(42796);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testWithField_unknownField() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y6l5box0t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithField_unknownField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42797,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y6l5box0t(){try{__CLR4_4_1wozwozlgchos57.R.inc(42797);
        __CLR4_4_1wozwozlgchos57.R.inc(42798);MonthDay test = new MonthDay(9, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(42799);try {
            __CLR4_4_1wozwozlgchos57.R.inc(42800);test.withField(DateTimeFieldType.hourOfDay(), 6);
            __CLR4_4_1wozwozlgchos57.R.inc(42801);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testWithField_same() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18fa39mx0y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithField_same",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42802,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18fa39mx0y(){try{__CLR4_4_1wozwozlgchos57.R.inc(42802);
        __CLR4_4_1wozwozlgchos57.R.inc(42803);MonthDay test = new MonthDay(9, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(42804);MonthDay result = test.withField(DateTimeFieldType.monthOfYear(), 9);
        __CLR4_4_1wozwozlgchos57.R.inc(42805);assertEquals(new MonthDay(9, 6), test);
        __CLR4_4_1wozwozlgchos57.R.inc(42806);assertSame(test, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithFieldAdded() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15nlb9hx13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithFieldAdded",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15nlb9hx13(){try{__CLR4_4_1wozwozlgchos57.R.inc(42807);
        __CLR4_4_1wozwozlgchos57.R.inc(42808);MonthDay test = new MonthDay(9, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(42809);MonthDay result = test.withFieldAdded(DurationFieldType.months(), 1);

        __CLR4_4_1wozwozlgchos57.R.inc(42810);assertEquals(new MonthDay(9, 6), test);
        __CLR4_4_1wozwozlgchos57.R.inc(42811);assertEquals(new MonthDay(10, 6), result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded_nullField_zero() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ynb18cx18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithFieldAdded_nullField_zero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ynb18cx18(){try{__CLR4_4_1wozwozlgchos57.R.inc(42812);
        __CLR4_4_1wozwozlgchos57.R.inc(42813);MonthDay test = new MonthDay(9, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(42814);try {
            __CLR4_4_1wozwozlgchos57.R.inc(42815);test.withFieldAdded(null, 0);
            __CLR4_4_1wozwozlgchos57.R.inc(42816);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded_nullField_nonZero() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cciwz5x1d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithFieldAdded_nullField_nonZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cciwz5x1d(){try{__CLR4_4_1wozwozlgchos57.R.inc(42817);
        __CLR4_4_1wozwozlgchos57.R.inc(42818);MonthDay test = new MonthDay(9, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(42819);try {
            __CLR4_4_1wozwozlgchos57.R.inc(42820);test.withFieldAdded(null, 6);
            __CLR4_4_1wozwozlgchos57.R.inc(42821);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded_zero() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h793dcx1i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithFieldAdded_zero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h793dcx1i(){try{__CLR4_4_1wozwozlgchos57.R.inc(42822);
        __CLR4_4_1wozwozlgchos57.R.inc(42823);MonthDay test = new MonthDay(9, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(42824);MonthDay result = test.withFieldAdded(DurationFieldType.months(), 0);
        __CLR4_4_1wozwozlgchos57.R.inc(42825);assertSame(test, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded_unknownField() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vo8btkx1m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithFieldAdded_unknownField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vo8btkx1m(){try{__CLR4_4_1wozwozlgchos57.R.inc(42826);
        __CLR4_4_1wozwozlgchos57.R.inc(42827);MonthDay test = new MonthDay(9, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(42828);try {
            __CLR4_4_1wozwozlgchos57.R.inc(42829);test.withFieldAdded(DurationFieldType.hours(), 6);
            __CLR4_4_1wozwozlgchos57.R.inc(42830);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPlus_RP() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz83igx1r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz83igx1r(){try{__CLR4_4_1wozwozlgchos57.R.inc(42831);
        __CLR4_4_1wozwozlgchos57.R.inc(42832);MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42833);MonthDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        __CLR4_4_1wozwozlgchos57.R.inc(42834);MonthDay expected = new MonthDay(8, 9, BuddhistChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42835);assertEquals(expected, result);

        __CLR4_4_1wozwozlgchos57.R.inc(42836);result = test.plus((ReadablePeriod) null);
        __CLR4_4_1wozwozlgchos57.R.inc(42837);assertSame(test, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testPlusMonths_int() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170gxaix1y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170gxaix1y(){try{__CLR4_4_1wozwozlgchos57.R.inc(42838);
        __CLR4_4_1wozwozlgchos57.R.inc(42839);MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42840);MonthDay result = test.plusMonths(1);
        __CLR4_4_1wozwozlgchos57.R.inc(42841);MonthDay expected = new MonthDay(7, 5, BuddhistChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42842);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testPlusMonths_int_fromLeap() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15vlms7x23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusMonths_int_fromLeap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15vlms7x23(){try{__CLR4_4_1wozwozlgchos57.R.inc(42843);
        __CLR4_4_1wozwozlgchos57.R.inc(42844);MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42845);MonthDay result = test.plusMonths(1);
        __CLR4_4_1wozwozlgchos57.R.inc(42846);MonthDay expected = new MonthDay(3, 29, ISOChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42847);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testPlusMonths_int_negativeFromLeap() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iq4nj2x28();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusMonths_int_negativeFromLeap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iq4nj2x28(){try{__CLR4_4_1wozwozlgchos57.R.inc(42848);
        __CLR4_4_1wozwozlgchos57.R.inc(42849);MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42850);MonthDay result = test.plusMonths(-1);
        __CLR4_4_1wozwozlgchos57.R.inc(42851);MonthDay expected = new MonthDay(1, 29, ISOChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42852);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testPlusMonths_int_endOfMonthAdjust() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e16aukx2d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusMonths_int_endOfMonthAdjust",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e16aukx2d(){try{__CLR4_4_1wozwozlgchos57.R.inc(42853);
        __CLR4_4_1wozwozlgchos57.R.inc(42854);MonthDay test = new MonthDay(3, 31, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42855);MonthDay result = test.plusMonths(1);
        __CLR4_4_1wozwozlgchos57.R.inc(42856);MonthDay expected = new MonthDay(4, 30, ISOChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42857);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testPlusMonths_int_negativeEndOfMonthAdjust() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s0u0mvx2i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusMonths_int_negativeEndOfMonthAdjust",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s0u0mvx2i(){try{__CLR4_4_1wozwozlgchos57.R.inc(42858);
        __CLR4_4_1wozwozlgchos57.R.inc(42859);MonthDay test = new MonthDay(3, 31, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42860);MonthDay result = test.plusMonths(-1);
        __CLR4_4_1wozwozlgchos57.R.inc(42861);MonthDay expected = new MonthDay(2, 29, ISOChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42862);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testPlusMonths_int_same() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hyn4t9x2n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusMonths_int_same",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hyn4t9x2n(){try{__CLR4_4_1wozwozlgchos57.R.inc(42863);
        __CLR4_4_1wozwozlgchos57.R.inc(42864);MonthDay test = new MonthDay(6, 5, ISO_UTC);
        __CLR4_4_1wozwozlgchos57.R.inc(42865);MonthDay result = test.plusMonths(0);
        __CLR4_4_1wozwozlgchos57.R.inc(42866);assertSame(test, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testPlusMonths_int_wrap() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zd511dx2r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusMonths_int_wrap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zd511dx2r(){try{__CLR4_4_1wozwozlgchos57.R.inc(42867);
        __CLR4_4_1wozwozlgchos57.R.inc(42868);MonthDay test = new MonthDay(6, 5, ISO_UTC);
        __CLR4_4_1wozwozlgchos57.R.inc(42869);MonthDay result = test.plusMonths(10);
        __CLR4_4_1wozwozlgchos57.R.inc(42870);MonthDay expected = new MonthDay(4, 5, ISO_UTC);
        __CLR4_4_1wozwozlgchos57.R.inc(42871);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testPlusMonths_int_adjust() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z6h63qx2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusMonths_int_adjust",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z6h63qx2w(){try{__CLR4_4_1wozwozlgchos57.R.inc(42872);
        __CLR4_4_1wozwozlgchos57.R.inc(42873);MonthDay test = new MonthDay(7, 31, ISO_UTC);
        __CLR4_4_1wozwozlgchos57.R.inc(42874);MonthDay result = test.plusMonths(2);
        __CLR4_4_1wozwozlgchos57.R.inc(42875);MonthDay expected = new MonthDay(9, 30, ISO_UTC);
        __CLR4_4_1wozwozlgchos57.R.inc(42876);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    //-------------------------------------------------------------------------
    @Test
    public void testPlusDays_int() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpmvkqx31();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42877,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpmvkqx31(){try{__CLR4_4_1wozwozlgchos57.R.inc(42877);
        __CLR4_4_1wozwozlgchos57.R.inc(42878);MonthDay test = new MonthDay(5, 10, BuddhistChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42879);MonthDay result = test.plusDays(1);
        __CLR4_4_1wozwozlgchos57.R.inc(42880);MonthDay expected = new MonthDay(5, 11, BuddhistChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42881);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testPlusDays_int_wrapMonth() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17hoc4vx36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusDays_int_wrapMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17hoc4vx36(){try{__CLR4_4_1wozwozlgchos57.R.inc(42882);
        __CLR4_4_1wozwozlgchos57.R.inc(42883);MonthDay test = new MonthDay(11, 1, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42884);MonthDay result = test.plusDays(31);
        __CLR4_4_1wozwozlgchos57.R.inc(42885);MonthDay expected = new MonthDay(12, 2, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42886);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testPlusDays_int_wrapMonthTwice() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xq20xxx3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusDays_int_wrapMonthTwice",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42887,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xq20xxx3b(){try{__CLR4_4_1wozwozlgchos57.R.inc(42887);
        __CLR4_4_1wozwozlgchos57.R.inc(42888);MonthDay test = new MonthDay(10, 31, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42889);MonthDay result = test.plusDays(32);
        __CLR4_4_1wozwozlgchos57.R.inc(42890);MonthDay expected = new MonthDay(12, 2, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42891);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testPlusDays_int_wrapMonthIntoNextYear() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15fw2ddx3g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusDays_int_wrapMonthIntoNextYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42892,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15fw2ddx3g(){try{__CLR4_4_1wozwozlgchos57.R.inc(42892);
        __CLR4_4_1wozwozlgchos57.R.inc(42893);MonthDay test = new MonthDay(12, 1, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42894);MonthDay result = test.plusDays(31);
        __CLR4_4_1wozwozlgchos57.R.inc(42895);MonthDay expected = new MonthDay(1, 1, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42896);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testPlusDays_int_wrapMonthTwiceIntoNextYear() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n0380bx3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusDays_int_wrapMonthTwiceIntoNextYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n0380bx3l(){try{__CLR4_4_1wozwozlgchos57.R.inc(42897);
        __CLR4_4_1wozwozlgchos57.R.inc(42898);MonthDay test = new MonthDay(11, 30, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42899);MonthDay result = test.plusDays(32);
        __CLR4_4_1wozwozlgchos57.R.inc(42900);MonthDay expected = new MonthDay(1, 1, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42901);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testPlusDays_int_wrap50() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zcm57cx3q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusDays_int_wrap50",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42902,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zcm57cx3q(){try{__CLR4_4_1wozwozlgchos57.R.inc(42902);
        __CLR4_4_1wozwozlgchos57.R.inc(42903);MonthDay test = new MonthDay(5, 15, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42904);MonthDay result = test.plusDays(50);
        __CLR4_4_1wozwozlgchos57.R.inc(42905);MonthDay expected = new MonthDay(7, 4, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42906);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testPlusDays_int_toLeap() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uln8zax3v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusDays_int_toLeap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uln8zax3v(){try{__CLR4_4_1wozwozlgchos57.R.inc(42907);
        __CLR4_4_1wozwozlgchos57.R.inc(42908);MonthDay test = new MonthDay(2, 28, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42909);MonthDay result = test.plusDays(1);
        __CLR4_4_1wozwozlgchos57.R.inc(42910);MonthDay expected = new MonthDay(2, 29, ISOChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42911);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testPlusDays_int_fromLeap() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_181e70lx40();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusDays_int_fromLeap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_181e70lx40(){try{__CLR4_4_1wozwozlgchos57.R.inc(42912);
        __CLR4_4_1wozwozlgchos57.R.inc(42913);MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42914);MonthDay result = test.plusDays(1);
        __CLR4_4_1wozwozlgchos57.R.inc(42915);MonthDay expected = new MonthDay(3, 1, ISOChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42916);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testPlusDays_int_negativeFromLeap() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f55oe2x45();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusDays_int_negativeFromLeap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f55oe2x45(){try{__CLR4_4_1wozwozlgchos57.R.inc(42917);
        __CLR4_4_1wozwozlgchos57.R.inc(42918);MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42919);MonthDay result = test.plusDays(-1);
        __CLR4_4_1wozwozlgchos57.R.inc(42920);MonthDay expected = new MonthDay(2, 28, ISOChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42921);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testPlusDays_same() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pebzopx4a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusDays_same",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pebzopx4a(){try{__CLR4_4_1wozwozlgchos57.R.inc(42922);
        __CLR4_4_1wozwozlgchos57.R.inc(42923);MonthDay test = new MonthDay(5, 10, BuddhistChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42924);MonthDay result = test.plusDays(0);
        __CLR4_4_1wozwozlgchos57.R.inc(42925);assertSame(test, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMinus_RP() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112cpdmx4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42926,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112cpdmx4e(){try{__CLR4_4_1wozwozlgchos57.R.inc(42926);
        __CLR4_4_1wozwozlgchos57.R.inc(42927);MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42928);MonthDay result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        __CLR4_4_1wozwozlgchos57.R.inc(42929);MonthDay expected = new MonthDay(5, 4, BuddhistChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42930);assertEquals(expected, result);

        __CLR4_4_1wozwozlgchos57.R.inc(42931);result = test.minus((ReadablePeriod) null);
        __CLR4_4_1wozwozlgchos57.R.inc(42932);assertSame(test, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testMinusMonths_int() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6k4gox4l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6k4gox4l(){try{__CLR4_4_1wozwozlgchos57.R.inc(42933);
        __CLR4_4_1wozwozlgchos57.R.inc(42934);MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42935);MonthDay result = test.minusMonths(1);
        __CLR4_4_1wozwozlgchos57.R.inc(42936);MonthDay expected = new MonthDay(5, 5, BuddhistChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42937);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testMinusMonths_int_fromLeap() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nmpydlx4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusMonths_int_fromLeap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nmpydlx4q(){try{__CLR4_4_1wozwozlgchos57.R.inc(42938);
        __CLR4_4_1wozwozlgchos57.R.inc(42939);MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42940);MonthDay result = test.minusMonths(1);
        __CLR4_4_1wozwozlgchos57.R.inc(42941);MonthDay expected = new MonthDay(1, 29, ISOChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42942);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testMinusMonths_int_negativeFromLeap() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sarvccx4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusMonths_int_negativeFromLeap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sarvccx4v(){try{__CLR4_4_1wozwozlgchos57.R.inc(42943);
        __CLR4_4_1wozwozlgchos57.R.inc(42944);MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42945);MonthDay result = test.minusMonths(-1);
        __CLR4_4_1wozwozlgchos57.R.inc(42946);MonthDay expected = new MonthDay(3, 29, ISOChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42947);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testMinusMonths_int_endOfMonthAdjust() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gj31ax50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusMonths_int_endOfMonthAdjust",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42948,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gj31ax50(){try{__CLR4_4_1wozwozlgchos57.R.inc(42948);
        __CLR4_4_1wozwozlgchos57.R.inc(42949);MonthDay test = new MonthDay(3, 31, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42950);MonthDay result = test.minusMonths(1);
        __CLR4_4_1wozwozlgchos57.R.inc(42951);MonthDay expected = new MonthDay(2, 29, ISOChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42952);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testMinusMonths_int_negativeEndOfMonthAdjust() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11yejyvx55();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusMonths_int_negativeEndOfMonthAdjust",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42953,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11yejyvx55(){try{__CLR4_4_1wozwozlgchos57.R.inc(42953);
        __CLR4_4_1wozwozlgchos57.R.inc(42954);MonthDay test = new MonthDay(3, 31, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42955);MonthDay result = test.minusMonths(-1);
        __CLR4_4_1wozwozlgchos57.R.inc(42956);MonthDay expected = new MonthDay(4, 30, ISOChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42957);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testMinusMonths_int_same() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rw5x0rx5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusMonths_int_same",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rw5x0rx5a(){try{__CLR4_4_1wozwozlgchos57.R.inc(42958);
        __CLR4_4_1wozwozlgchos57.R.inc(42959);MonthDay test = new MonthDay(6, 5, ISO_UTC);
        __CLR4_4_1wozwozlgchos57.R.inc(42960);MonthDay result = test.minusMonths(0);
        __CLR4_4_1wozwozlgchos57.R.inc(42961);assertSame(test, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testMinusMonths_int_wrap() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pqg8q9x5e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusMonths_int_wrap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pqg8q9x5e(){try{__CLR4_4_1wozwozlgchos57.R.inc(42962);
        __CLR4_4_1wozwozlgchos57.R.inc(42963);MonthDay test = new MonthDay(6, 5, ISO_UTC);
        __CLR4_4_1wozwozlgchos57.R.inc(42964);MonthDay result = test.minusMonths(10);
        __CLR4_4_1wozwozlgchos57.R.inc(42965);MonthDay expected = new MonthDay(8, 5, ISO_UTC);
        __CLR4_4_1wozwozlgchos57.R.inc(42966);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testMinusMonths_int_adjust() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5b8csx5j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusMonths_int_adjust",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5b8csx5j(){try{__CLR4_4_1wozwozlgchos57.R.inc(42967);
        __CLR4_4_1wozwozlgchos57.R.inc(42968);MonthDay test = new MonthDay(7, 31, ISO_UTC);
        __CLR4_4_1wozwozlgchos57.R.inc(42969);MonthDay result = test.minusMonths(3);
        __CLR4_4_1wozwozlgchos57.R.inc(42970);MonthDay expected = new MonthDay(4, 30, ISO_UTC);
        __CLR4_4_1wozwozlgchos57.R.inc(42971);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    //-------------------------------------------------------------------------
    @Test
    public void testMinusDays_int() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hpufckx5o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42972,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hpufckx5o(){try{__CLR4_4_1wozwozlgchos57.R.inc(42972);
        __CLR4_4_1wozwozlgchos57.R.inc(42973);MonthDay test = new MonthDay(5, 11, BuddhistChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42974);MonthDay result = test.minusDays(1);
        __CLR4_4_1wozwozlgchos57.R.inc(42975);MonthDay expected = new MonthDay(5, 10, BuddhistChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(42976);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testMinusDays_int_wrapMonth() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17z4b5vx5t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusDays_int_wrapMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17z4b5vx5t(){try{__CLR4_4_1wozwozlgchos57.R.inc(42977);
        __CLR4_4_1wozwozlgchos57.R.inc(42978);MonthDay test = new MonthDay(12, 1, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42979);MonthDay result = test.minusDays(30);
        __CLR4_4_1wozwozlgchos57.R.inc(42980);MonthDay expected = new MonthDay(11, 1, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42981);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testMinusDays_int_wrapMonthTwice() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n1inpvx5y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusDays_int_wrapMonthTwice",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n1inpvx5y(){try{__CLR4_4_1wozwozlgchos57.R.inc(42982);
        __CLR4_4_1wozwozlgchos57.R.inc(42983);MonthDay test = new MonthDay(12, 1, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42984);MonthDay result = test.minusDays(31);
        __CLR4_4_1wozwozlgchos57.R.inc(42985);MonthDay expected = new MonthDay(10, 31, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42986);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testMinusDays_int_wrapMonthIntoLastYear() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d6kuyex63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusDays_int_wrapMonthIntoLastYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d6kuyex63(){try{__CLR4_4_1wozwozlgchos57.R.inc(42987);
        __CLR4_4_1wozwozlgchos57.R.inc(42988);MonthDay test = new MonthDay(1, 1, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42989);MonthDay result = test.minusDays(31);
        __CLR4_4_1wozwozlgchos57.R.inc(42990);MonthDay expected = new MonthDay(12, 1, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42991);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testMinusDays_int_wrapMonthTwiceIntoLastYear() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kbqvax68();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusDays_int_wrapMonthTwiceIntoLastYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kbqvax68(){try{__CLR4_4_1wozwozlgchos57.R.inc(42992);
        __CLR4_4_1wozwozlgchos57.R.inc(42993);MonthDay test = new MonthDay(1, 1, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42994);MonthDay result = test.minusDays(32);
        __CLR4_4_1wozwozlgchos57.R.inc(42995);MonthDay expected = new MonthDay(11, 30, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42996);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testMinusDays_int_toLeap() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),42997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uhy0scx6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusDays_int_toLeap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42997,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uhy0scx6d(){try{__CLR4_4_1wozwozlgchos57.R.inc(42997);
        __CLR4_4_1wozwozlgchos57.R.inc(42998);MonthDay test = new MonthDay(3, 1, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(42999);MonthDay result = test.minusDays(1);
        __CLR4_4_1wozwozlgchos57.R.inc(43000);MonthDay expected = new MonthDay(2, 29, ISOChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(43001);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testMinusDays_int_fromLeap() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),43002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xqpuj7x6i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusDays_int_fromLeap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xqpuj7x6i(){try{__CLR4_4_1wozwozlgchos57.R.inc(43002);
        __CLR4_4_1wozwozlgchos57.R.inc(43003);MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(43004);MonthDay result = test.minusDays(1);
        __CLR4_4_1wozwozlgchos57.R.inc(43005);MonthDay expected = new MonthDay(2, 28, ISOChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(43006);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testMinusDays_int_negativeFromLeap() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),43007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lfmf7cx6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusDays_int_negativeFromLeap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43007,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lfmf7cx6n(){try{__CLR4_4_1wozwozlgchos57.R.inc(43007);
        __CLR4_4_1wozwozlgchos57.R.inc(43008);MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        __CLR4_4_1wozwozlgchos57.R.inc(43009);MonthDay result = test.minusDays(-1);
        __CLR4_4_1wozwozlgchos57.R.inc(43010);MonthDay expected = new MonthDay(3, 1, ISOChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(43011);assertEquals(expected, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testMinusDays_same() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),43012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oqwshjx6s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusDays_same",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43012,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oqwshjx6s(){try{__CLR4_4_1wozwozlgchos57.R.inc(43012);
        __CLR4_4_1wozwozlgchos57.R.inc(43013);MonthDay test = new MonthDay(5, 11, BuddhistChronology.getInstance());
        __CLR4_4_1wozwozlgchos57.R.inc(43014);MonthDay result = test.minusDays(0);
        __CLR4_4_1wozwozlgchos57.R.inc(43015);assertSame(test, result);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToLocalDate() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),43016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1orirx6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1orirx6w(){try{__CLR4_4_1wozwozlgchos57.R.inc(43016);
        __CLR4_4_1wozwozlgchos57.R.inc(43017);MonthDay base = new MonthDay(6, 6, COPTIC_UTC);
        __CLR4_4_1wozwozlgchos57.R.inc(43018);LocalDate test = base.toLocalDate(2009);
        __CLR4_4_1wozwozlgchos57.R.inc(43019);assertEquals(new LocalDate(2009, 6, 6, COPTIC_UTC), test);
        __CLR4_4_1wozwozlgchos57.R.inc(43020);try {
            __CLR4_4_1wozwozlgchos57.R.inc(43021);base.toLocalDate(0);
            __CLR4_4_1wozwozlgchos57.R.inc(43022);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTime_RI() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),43023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1584tmdx73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToDateTime_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43023,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1584tmdx73(){try{__CLR4_4_1wozwozlgchos57.R.inc(43023);
        __CLR4_4_1wozwozlgchos57.R.inc(43024);MonthDay base = new MonthDay(6, 6, COPTIC_PARIS);
        __CLR4_4_1wozwozlgchos57.R.inc(43025);DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);

        __CLR4_4_1wozwozlgchos57.R.inc(43026);DateTime test = base.toDateTime(dt);
        __CLR4_4_1wozwozlgchos57.R.inc(43027);check(base, 6, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(43028);DateTime expected = dt;
        __CLR4_4_1wozwozlgchos57.R.inc(43029);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_1wozwozlgchos57.R.inc(43030);expected = expected.dayOfMonth().setCopy(6);
        __CLR4_4_1wozwozlgchos57.R.inc(43031);assertEquals(expected, test);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    @Test
    public void testToDateTime_nullRI() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),43032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xlns4x7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToDateTime_nullRI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43032,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xlns4x7c(){try{__CLR4_4_1wozwozlgchos57.R.inc(43032);
        __CLR4_4_1wozwozlgchos57.R.inc(43033);MonthDay base = new MonthDay(6, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(43034);DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);
        __CLR4_4_1wozwozlgchos57.R.inc(43035);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());

        __CLR4_4_1wozwozlgchos57.R.inc(43036);DateTime test = base.toDateTime((ReadableInstant) null);
        __CLR4_4_1wozwozlgchos57.R.inc(43037);check(base, 6, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(43038);DateTime expected = dt;
        __CLR4_4_1wozwozlgchos57.R.inc(43039);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_1wozwozlgchos57.R.inc(43040);expected = expected.dayOfMonth().setCopy(6);
        __CLR4_4_1wozwozlgchos57.R.inc(43041);assertEquals(expected, test);
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithers() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),43042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn9jzpx7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43042,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn9jzpx7m(){try{__CLR4_4_1wozwozlgchos57.R.inc(43042);
        __CLR4_4_1wozwozlgchos57.R.inc(43043);MonthDay test = new MonthDay(10, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(43044);check(test.withMonthOfYear(5), 5, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(43045);check(test.withDayOfMonth(2), 10, 2);
        __CLR4_4_1wozwozlgchos57.R.inc(43046);try {
            __CLR4_4_1wozwozlgchos57.R.inc(43047);test.withMonthOfYear(0);
            __CLR4_4_1wozwozlgchos57.R.inc(43048);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1wozwozlgchos57.R.inc(43049);try {
            __CLR4_4_1wozwozlgchos57.R.inc(43050);test.withMonthOfYear(13);
            __CLR4_4_1wozwozlgchos57.R.inc(43051);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testProperty() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),43052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7neoix7w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7neoix7w(){try{__CLR4_4_1wozwozlgchos57.R.inc(43052);
        __CLR4_4_1wozwozlgchos57.R.inc(43053);MonthDay test = new MonthDay(6, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(43054);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1wozwozlgchos57.R.inc(43055);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1wozwozlgchos57.R.inc(43056);try {
            __CLR4_4_1wozwozlgchos57.R.inc(43057);test.property(DateTimeFieldType.millisOfDay());
            __CLR4_4_1wozwozlgchos57.R.inc(43058);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1wozwozlgchos57.R.inc(43059);try {
            __CLR4_4_1wozwozlgchos57.R.inc(43060);test.property(null);
            __CLR4_4_1wozwozlgchos57.R.inc(43061);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),43062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9x86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43062,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9x86() throws Exception{try{__CLR4_4_1wozwozlgchos57.R.inc(43062);
        __CLR4_4_1wozwozlgchos57.R.inc(43063);MonthDay test = new MonthDay(5, 6, COPTIC_PARIS);

        __CLR4_4_1wozwozlgchos57.R.inc(43064);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1wozwozlgchos57.R.inc(43065);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1wozwozlgchos57.R.inc(43066);oos.writeObject(test);
        __CLR4_4_1wozwozlgchos57.R.inc(43067);oos.close();
        __CLR4_4_1wozwozlgchos57.R.inc(43068);byte[] bytes = baos.toByteArray();

        __CLR4_4_1wozwozlgchos57.R.inc(43069);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1wozwozlgchos57.R.inc(43070);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1wozwozlgchos57.R.inc(43071);MonthDay result = (MonthDay) ois.readObject();
        __CLR4_4_1wozwozlgchos57.R.inc(43072);ois.close();

        __CLR4_4_1wozwozlgchos57.R.inc(43073);assertEquals(test, result);
        __CLR4_4_1wozwozlgchos57.R.inc(43074);assertTrue(Arrays.equals(test.getValues(), result.getValues()));
        __CLR4_4_1wozwozlgchos57.R.inc(43075);assertTrue(Arrays.equals(test.getFields(), result.getFields()));
        __CLR4_4_1wozwozlgchos57.R.inc(43076);assertEquals(test.getChronology(), result.getChronology());
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),43077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidx8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidx8l(){try{__CLR4_4_1wozwozlgchos57.R.inc(43077);
        __CLR4_4_1wozwozlgchos57.R.inc(43078);MonthDay test = new MonthDay(5, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(43079);assertEquals("--05-06", test.toString());
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_String() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),43080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llkh2xx8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToString_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43080,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llkh2xx8o(){try{__CLR4_4_1wozwozlgchos57.R.inc(43080);
        __CLR4_4_1wozwozlgchos57.R.inc(43081);MonthDay test = new MonthDay(5, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(43082);assertEquals("05 \ufffd\ufffd", test.toString("MM HH"));
        __CLR4_4_1wozwozlgchos57.R.inc(43083);assertEquals("--05-06", test.toString((String) null));
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_String_Locale() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),43084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1afd64ux8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToString_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43084,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1afd64ux8s(){try{__CLR4_4_1wozwozlgchos57.R.inc(43084);
        __CLR4_4_1wozwozlgchos57.R.inc(43085);MonthDay test = new MonthDay(5, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(43086);assertEquals("\ufffd 6/5", test.toString("EEE d/M", Locale.ENGLISH));
        __CLR4_4_1wozwozlgchos57.R.inc(43087);assertEquals("\ufffd 6/5", test.toString("EEE d/M", Locale.FRENCH));
        __CLR4_4_1wozwozlgchos57.R.inc(43088);assertEquals("--05-06", test.toString(null, Locale.ENGLISH));
        __CLR4_4_1wozwozlgchos57.R.inc(43089);assertEquals("\ufffd 6/5", test.toString("EEE d/M", null));
        __CLR4_4_1wozwozlgchos57.R.inc(43090);assertEquals("--05-06", test.toString(null, null));
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_DTFormatter() {__CLR4_4_1wozwozlgchos57.R.globalSliceStart(getClass().getName(),43091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxbkpsx8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wozwozlgchos57.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wozwozlgchos57.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToString_DTFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43091,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxbkpsx8z(){try{__CLR4_4_1wozwozlgchos57.R.inc(43091);
        __CLR4_4_1wozwozlgchos57.R.inc(43092);MonthDay test = new MonthDay(5, 6);
        __CLR4_4_1wozwozlgchos57.R.inc(43093);assertEquals("05 \ufffd\ufffd", test.toString(DateTimeFormat.forPattern("MM HH")));
        __CLR4_4_1wozwozlgchos57.R.inc(43094);assertEquals("--05-06", test.toString((DateTimeFormatter) null));
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(MonthDay test, int month, int day) {try{__CLR4_4_1wozwozlgchos57.R.inc(43095);
        __CLR4_4_1wozwozlgchos57.R.inc(43096);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1wozwozlgchos57.R.inc(43097);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1wozwozlgchos57.R.flushNeeded();}}
}
