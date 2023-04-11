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
 * This class is a Junit unit test for TimeOfDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestTimeOfDay_Basics {static class __CLR4_4_116qg16qglgchosh5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,56001,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final int OFFSET = 1;
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();

    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
                    + 20L * DateTimeConstants.MILLIS_PER_MINUTE
                    + 30L * DateTimeConstants.MILLIS_PER_SECOND
                    + 40L;

    private long TEST_TIME2 =
            1L * DateTimeConstants.MILLIS_PER_DAY
                    + 5L * DateTimeConstants.MILLIS_PER_HOUR
                    + 6L * DateTimeConstants.MILLIS_PER_MINUTE
                    + 7L * DateTimeConstants.MILLIS_PER_SECOND
                    + 8L;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_116qg16qglgchosh5.R.inc(55384);
        __CLR4_4_116qg16qglgchosh5.R.inc(55385);TestTimeOfDay_Basics TB = new TestTimeOfDay_Basics();
        __CLR4_4_116qg16qglgchosh5.R.inc(55386);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55387);TB.testGet();
        __CLR4_4_116qg16qglgchosh5.R.inc(55388);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55389);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55390);TB.testSize();
        __CLR4_4_116qg16qglgchosh5.R.inc(55391);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55392);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55393);TB.testGetFieldType();
        __CLR4_4_116qg16qglgchosh5.R.inc(55394);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55395);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55396);TB.testGetFieldTypes();
        __CLR4_4_116qg16qglgchosh5.R.inc(55397);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55398);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55399);TB.testGetField();
        __CLR4_4_116qg16qglgchosh5.R.inc(55400);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55401);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55402);TB.testGetFields();
        __CLR4_4_116qg16qglgchosh5.R.inc(55403);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55404);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55405);TB.testGetValue();
        __CLR4_4_116qg16qglgchosh5.R.inc(55406);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55407);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55408);TB.testGetValues();
        __CLR4_4_116qg16qglgchosh5.R.inc(55409);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55410);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55411);TB.testIsSupported();
        __CLR4_4_116qg16qglgchosh5.R.inc(55412);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55413);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55414);TB.testEqualsHashCode();
        __CLR4_4_116qg16qglgchosh5.R.inc(55415);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55416);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55417);TB.testCompareTo();
        __CLR4_4_116qg16qglgchosh5.R.inc(55418);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55419);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55420);TB.testIsEqual_TOD();
        __CLR4_4_116qg16qglgchosh5.R.inc(55421);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55422);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55423);TB.testIsBefore_TOD();
        __CLR4_4_116qg16qglgchosh5.R.inc(55424);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55425);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55426);TB.testIsAfter_TOD();
        __CLR4_4_116qg16qglgchosh5.R.inc(55427);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55428);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55429);TB.testWithChronologyRetainFields_Chrono();
        __CLR4_4_116qg16qglgchosh5.R.inc(55430);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55431);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55432);TB.testWithChronologyRetainFields_sameChrono();
        __CLR4_4_116qg16qglgchosh5.R.inc(55433);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55434);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55435);TB.testWithChronologyRetainFields_nullChrono();
        __CLR4_4_116qg16qglgchosh5.R.inc(55436);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55437);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55438);TB.testWithField1();
        __CLR4_4_116qg16qglgchosh5.R.inc(55439);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55440);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55441);TB.testWithField2();
        __CLR4_4_116qg16qglgchosh5.R.inc(55442);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55443);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55444);TB.testWithField3();
        __CLR4_4_116qg16qglgchosh5.R.inc(55445);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55446);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55447);TB.testWithField4();
        __CLR4_4_116qg16qglgchosh5.R.inc(55448);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55449);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55450);TB.testWithFieldAdded1();
        __CLR4_4_116qg16qglgchosh5.R.inc(55451);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55452);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55453);TB.testWithFieldAdded2();
        __CLR4_4_116qg16qglgchosh5.R.inc(55454);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55455);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55456);TB.testWithFieldAdded3();
        __CLR4_4_116qg16qglgchosh5.R.inc(55457);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55458);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55459);TB.testWithFieldAdded4();
        __CLR4_4_116qg16qglgchosh5.R.inc(55460);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55461);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55462);TB.testWithFieldAdded5();
        __CLR4_4_116qg16qglgchosh5.R.inc(55463);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55464);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55465);TB.testWithFieldAdded6();
        __CLR4_4_116qg16qglgchosh5.R.inc(55466);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55467);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55468);TB.testWithFieldAdded7();
        __CLR4_4_116qg16qglgchosh5.R.inc(55469);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55470);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55471);TB.testWithFieldAdded8();
        __CLR4_4_116qg16qglgchosh5.R.inc(55472);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55473);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55474);TB.testPlus_RP();
        __CLR4_4_116qg16qglgchosh5.R.inc(55475);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55476);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55477);TB.testPlusHours_int();
        __CLR4_4_116qg16qglgchosh5.R.inc(55478);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55479);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55480);TB.testPlusMinutes_int();
        __CLR4_4_116qg16qglgchosh5.R.inc(55481);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55482);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55483);TB.testPlusSeconds_int();
        __CLR4_4_116qg16qglgchosh5.R.inc(55484);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55485);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55486);TB.testPlusMillis_int();
        __CLR4_4_116qg16qglgchosh5.R.inc(55487);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55488);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55489);TB.testMinus_RP();
        __CLR4_4_116qg16qglgchosh5.R.inc(55490);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55491);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55492);TB.testMinusHours_int();
        __CLR4_4_116qg16qglgchosh5.R.inc(55493);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55494);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55495);TB.testMinusMinutes_int();
        __CLR4_4_116qg16qglgchosh5.R.inc(55496);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55497);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55498);TB.testMinusSeconds_int();
        __CLR4_4_116qg16qglgchosh5.R.inc(55499);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55500);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55501);TB.testMinusMillis_int();
        __CLR4_4_116qg16qglgchosh5.R.inc(55502);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55503);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55504);TB.testToLocalTime();
        __CLR4_4_116qg16qglgchosh5.R.inc(55505);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55506);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55507);TB.testToDateTimeToday();
        __CLR4_4_116qg16qglgchosh5.R.inc(55508);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55509);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55510);TB.testToDateTimeToday_Zone();
        __CLR4_4_116qg16qglgchosh5.R.inc(55511);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55512);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55513);TB.testToDateTimeToday_nullZone();
        __CLR4_4_116qg16qglgchosh5.R.inc(55514);TB.tearDown();
//    TB.setUp(); TB.testToDateTime_YMD(); TB.tearDown();
//    TB.setUp(); TB.testToDateTime_nullYMD(); TB.tearDown();
//    TB.setUp(); TB.testToDateTime_YMD_Zone(); TB.tearDown();
//    TB.setUp(); TB.testToDateTime_YMD_nullZone(); TB.tearDown();
//    TB.setUp(); TB.testToDateTime_nullYMD_Zone(); TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55515);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55516);TB.testToDateTime_RI();
        __CLR4_4_116qg16qglgchosh5.R.inc(55517);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55518);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55519);TB.testToDateTime_nullRI();
        __CLR4_4_116qg16qglgchosh5.R.inc(55520);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55521);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55522);TB.testWithers();
        __CLR4_4_116qg16qglgchosh5.R.inc(55523);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55524);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55525);TB.testProperty();
        __CLR4_4_116qg16qglgchosh5.R.inc(55526);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55527);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55528);TB.testSerialization();
        __CLR4_4_116qg16qglgchosh5.R.inc(55529);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55530);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55531);TB.testToString();
        __CLR4_4_116qg16qglgchosh5.R.inc(55532);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55533);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55534);TB.testToString_String();
        __CLR4_4_116qg16qglgchosh5.R.inc(55535);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55536);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55537);TB.testToString_String_Locale();
        __CLR4_4_116qg16qglgchosh5.R.inc(55538);TB.tearDown();
        __CLR4_4_116qg16qglgchosh5.R.inc(55539);TB.setUp();
        __CLR4_4_116qg16qglgchosh5.R.inc(55540);TB.testToString_DTFormatter();
        __CLR4_4_116qg16qglgchosh5.R.inc(55541);TB.tearDown();

    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestTimeOfDay_Basics.class);
    }

    public TestTimeOfDay_Basics(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_116qg16qglgchosh5.R.inc(55542);
        __CLR4_4_116qg16qglgchosh5.R.inc(55543);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_116qg16qglgchosh5.R.inc(55544);zone = DateTimeZone.getDefault();
        __CLR4_4_116qg16qglgchosh5.R.inc(55545);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_116qg16qglgchosh5.R.inc(55546);
        __CLR4_4_116qg16qglgchosh5.R.inc(55547);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_116qg16qglgchosh5.R.inc(55548);DateTimeZone.setDefault(zone);
        __CLR4_4_116qg16qglgchosh5.R.inc(55549);zone = null;
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGet() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tpje3v16v2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tpje3v16v2(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55550);
        __CLR4_4_116qg16qglgchosh5.R.inc(55551);TimeOfDay test = new TimeOfDay();
        __CLR4_4_116qg16qglgchosh5.R.inc(55552);assertEquals(10 + OFFSET, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_116qg16qglgchosh5.R.inc(55553);assertEquals(20, test.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_116qg16qglgchosh5.R.inc(55554);assertEquals(30, test.get(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_116qg16qglgchosh5.R.inc(55555);assertEquals(40, test.get(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_116qg16qglgchosh5.R.inc(55556);try {
            __CLR4_4_116qg16qglgchosh5.R.inc(55557);test.get(null);
            __CLR4_4_116qg16qglgchosh5.R.inc(55558);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_116qg16qglgchosh5.R.inc(55559);try {
            __CLR4_4_116qg16qglgchosh5.R.inc(55560);test.get(DateTimeFieldType.dayOfMonth());
            __CLR4_4_116qg16qglgchosh5.R.inc(55561);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testSize() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xx12216ve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55562,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xx12216ve(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55562);
        __CLR4_4_116qg16qglgchosh5.R.inc(55563);TimeOfDay test = new TimeOfDay();
        __CLR4_4_116qg16qglgchosh5.R.inc(55564);assertEquals(4, test.size());
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testGetFieldType() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mv16vh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mv16vh(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55565);
        __CLR4_4_116qg16qglgchosh5.R.inc(55566);TimeOfDay test = new TimeOfDay(COPTIC_PARIS);
        __CLR4_4_116qg16qglgchosh5.R.inc(55567);assertSame(DateTimeFieldType.hourOfDay(), test.getFieldType(0));
        __CLR4_4_116qg16qglgchosh5.R.inc(55568);assertSame(DateTimeFieldType.minuteOfHour(), test.getFieldType(1));
        __CLR4_4_116qg16qglgchosh5.R.inc(55569);assertSame(DateTimeFieldType.secondOfMinute(), test.getFieldType(2));
        __CLR4_4_116qg16qglgchosh5.R.inc(55570);assertSame(DateTimeFieldType.millisOfSecond(), test.getFieldType(3));
        __CLR4_4_116qg16qglgchosh5.R.inc(55571);try {
            __CLR4_4_116qg16qglgchosh5.R.inc(55572);test.getFieldType(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_116qg16qglgchosh5.R.inc(55573);try {
            __CLR4_4_116qg16qglgchosh5.R.inc(55574);test.getFieldType(5);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testGetFieldTypes() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5ndvu16vr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGetFieldTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5ndvu16vr(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55575);
        __CLR4_4_116qg16qglgchosh5.R.inc(55576);TimeOfDay test = new TimeOfDay(COPTIC_PARIS);
        __CLR4_4_116qg16qglgchosh5.R.inc(55577);DateTimeFieldType[] fields = test.getFieldTypes();
        __CLR4_4_116qg16qglgchosh5.R.inc(55578);assertSame(DateTimeFieldType.hourOfDay(), fields[0]);
        __CLR4_4_116qg16qglgchosh5.R.inc(55579);assertSame(DateTimeFieldType.minuteOfHour(), fields[1]);
        __CLR4_4_116qg16qglgchosh5.R.inc(55580);assertSame(DateTimeFieldType.secondOfMinute(), fields[2]);
        __CLR4_4_116qg16qglgchosh5.R.inc(55581);assertSame(DateTimeFieldType.millisOfSecond(), fields[3]);
        __CLR4_4_116qg16qglgchosh5.R.inc(55582);assertNotSame(test.getFieldTypes(), test.getFieldTypes());
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testGetField() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lx8n7n16vz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGetField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55583,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lx8n7n16vz(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55583);
        __CLR4_4_116qg16qglgchosh5.R.inc(55584);TimeOfDay test = new TimeOfDay(COPTIC_PARIS);
        __CLR4_4_116qg16qglgchosh5.R.inc(55585);assertSame(CopticChronology.getInstanceUTC().hourOfDay(), test.getField(0));
        __CLR4_4_116qg16qglgchosh5.R.inc(55586);assertSame(CopticChronology.getInstanceUTC().minuteOfHour(), test.getField(1));
        __CLR4_4_116qg16qglgchosh5.R.inc(55587);assertSame(CopticChronology.getInstanceUTC().secondOfMinute(), test.getField(2));
        __CLR4_4_116qg16qglgchosh5.R.inc(55588);assertSame(CopticChronology.getInstanceUTC().millisOfSecond(), test.getField(3));
        __CLR4_4_116qg16qglgchosh5.R.inc(55589);try {
            __CLR4_4_116qg16qglgchosh5.R.inc(55590);test.getField(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_116qg16qglgchosh5.R.inc(55591);try {
            __CLR4_4_116qg16qglgchosh5.R.inc(55592);test.getField(5);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testGetFields() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmeas16w9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGetFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55593,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmeas16w9(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55593);
        __CLR4_4_116qg16qglgchosh5.R.inc(55594);TimeOfDay test = new TimeOfDay(COPTIC_PARIS);
        __CLR4_4_116qg16qglgchosh5.R.inc(55595);DateTimeField[] fields = test.getFields();
        __CLR4_4_116qg16qglgchosh5.R.inc(55596);assertSame(CopticChronology.getInstanceUTC().hourOfDay(), fields[0]);
        __CLR4_4_116qg16qglgchosh5.R.inc(55597);assertSame(CopticChronology.getInstanceUTC().minuteOfHour(), fields[1]);
        __CLR4_4_116qg16qglgchosh5.R.inc(55598);assertSame(CopticChronology.getInstanceUTC().secondOfMinute(), fields[2]);
        __CLR4_4_116qg16qglgchosh5.R.inc(55599);assertSame(CopticChronology.getInstanceUTC().millisOfSecond(), fields[3]);
        __CLR4_4_116qg16qglgchosh5.R.inc(55600);assertNotSame(test.getFields(), test.getFields());
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testGetValue() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcksmk16wh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGetValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55601,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcksmk16wh(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55601);
        __CLR4_4_116qg16qglgchosh5.R.inc(55602);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_116qg16qglgchosh5.R.inc(55603);assertEquals(10, test.getValue(0));
        __CLR4_4_116qg16qglgchosh5.R.inc(55604);assertEquals(20, test.getValue(1));
        __CLR4_4_116qg16qglgchosh5.R.inc(55605);assertEquals(30, test.getValue(2));
        __CLR4_4_116qg16qglgchosh5.R.inc(55606);assertEquals(40, test.getValue(3));
        __CLR4_4_116qg16qglgchosh5.R.inc(55607);try {
            __CLR4_4_116qg16qglgchosh5.R.inc(55608);test.getValue(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_116qg16qglgchosh5.R.inc(55609);try {
            __CLR4_4_116qg16qglgchosh5.R.inc(55610);test.getValue(5);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testGetValues() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gduel16wr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGetValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55611,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gduel16wr(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55611);
        __CLR4_4_116qg16qglgchosh5.R.inc(55612);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_116qg16qglgchosh5.R.inc(55613);int[] values = test.getValues();
        __CLR4_4_116qg16qglgchosh5.R.inc(55614);assertEquals(10, values[0]);
        __CLR4_4_116qg16qglgchosh5.R.inc(55615);assertEquals(20, values[1]);
        __CLR4_4_116qg16qglgchosh5.R.inc(55616);assertEquals(30, values[2]);
        __CLR4_4_116qg16qglgchosh5.R.inc(55617);assertEquals(40, values[3]);
        __CLR4_4_116qg16qglgchosh5.R.inc(55618);assertNotSame(test.getValues(), test.getValues());
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testIsSupported() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hma24n16wz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testIsSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hma24n16wz(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55619);
        __CLR4_4_116qg16qglgchosh5.R.inc(55620);TimeOfDay test = new TimeOfDay(COPTIC_PARIS);
        __CLR4_4_116qg16qglgchosh5.R.inc(55621);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay()));
        __CLR4_4_116qg16qglgchosh5.R.inc(55622);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_116qg16qglgchosh5.R.inc(55623);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_116qg16qglgchosh5.R.inc(55624);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_116qg16qglgchosh5.R.inc(55625);assertEquals(false, test.isSupported(DateTimeFieldType.dayOfMonth()));
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testEqualsHashCode() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in7716x6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in7716x6(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55626);
        __CLR4_4_116qg16qglgchosh5.R.inc(55627);TimeOfDay test1 = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_116qg16qglgchosh5.R.inc(55628);TimeOfDay test2 = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_116qg16qglgchosh5.R.inc(55629);assertEquals(true, test1.equals(test2));
        __CLR4_4_116qg16qglgchosh5.R.inc(55630);assertEquals(true, test2.equals(test1));
        __CLR4_4_116qg16qglgchosh5.R.inc(55631);assertEquals(true, test1.equals(test1));
        __CLR4_4_116qg16qglgchosh5.R.inc(55632);assertEquals(true, test2.equals(test2));
        __CLR4_4_116qg16qglgchosh5.R.inc(55633);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_116qg16qglgchosh5.R.inc(55634);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_116qg16qglgchosh5.R.inc(55635);assertEquals(true, test2.hashCode() == test2.hashCode());

        __CLR4_4_116qg16qglgchosh5.R.inc(55636);TimeOfDay test3 = new TimeOfDay(15, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55637);assertEquals(false, test1.equals(test3));
        __CLR4_4_116qg16qglgchosh5.R.inc(55638);assertEquals(false, test2.equals(test3));
        __CLR4_4_116qg16qglgchosh5.R.inc(55639);assertEquals(false, test3.equals(test1));
        __CLR4_4_116qg16qglgchosh5.R.inc(55640);assertEquals(false, test3.equals(test2));
        __CLR4_4_116qg16qglgchosh5.R.inc(55641);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_116qg16qglgchosh5.R.inc(55642);assertEquals(false, test2.hashCode() == test3.hashCode());

        __CLR4_4_116qg16qglgchosh5.R.inc(55643);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_116qg16qglgchosh5.R.inc(55644);assertEquals(true, test1.equals(new MockInstant()));
        __CLR4_4_116qg16qglgchosh5.R.inc(55645);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE));
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_116qg16qglgchosh5.R.inc(55646);
            __CLR4_4_116qg16qglgchosh5.R.inc(55647);return CopticChronology.getInstanceUTC();
        }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

        public DateTimeField[] getFields() {try{__CLR4_4_116qg16qglgchosh5.R.inc(55648);
            __CLR4_4_116qg16qglgchosh5.R.inc(55649);return new DateTimeField[]{
                    CopticChronology.getInstanceUTC().hourOfDay(),
                    CopticChronology.getInstanceUTC().minuteOfHour(),
                    CopticChronology.getInstanceUTC().secondOfMinute(),
                    CopticChronology.getInstanceUTC().millisOfSecond(),
            };
        }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

        public int[] getValues() {try{__CLR4_4_116qg16qglgchosh5.R.inc(55650);
            __CLR4_4_116qg16qglgchosh5.R.inc(55651);return new int[]{10, 20, 30, 40};
        }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    @Test
    public void testCompareTo() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfv16xw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55652,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfv16xw(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55652);
        __CLR4_4_116qg16qglgchosh5.R.inc(55653);TimeOfDay test1 = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55654);TimeOfDay test1a = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55655);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_116qg16qglgchosh5.R.inc(55656);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_116qg16qglgchosh5.R.inc(55657);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_116qg16qglgchosh5.R.inc(55658);assertEquals(0, test1a.compareTo(test1a));

        __CLR4_4_116qg16qglgchosh5.R.inc(55659);TimeOfDay test2 = new TimeOfDay(10, 20, 35, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55660);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_116qg16qglgchosh5.R.inc(55661);assertEquals(+1, test2.compareTo(test1));

        __CLR4_4_116qg16qglgchosh5.R.inc(55662);TimeOfDay test3 = new TimeOfDay(10, 20, 35, 40, GregorianChronology.getInstanceUTC());
        __CLR4_4_116qg16qglgchosh5.R.inc(55663);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_116qg16qglgchosh5.R.inc(55664);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_116qg16qglgchosh5.R.inc(55665);assertEquals(0, test3.compareTo(test2));

        __CLR4_4_116qg16qglgchosh5.R.inc(55666);DateTimeFieldType[] types = new DateTimeFieldType[]{
                DateTimeFieldType.hourOfDay(),
                DateTimeFieldType.minuteOfHour(),
                DateTimeFieldType.secondOfMinute(),
                DateTimeFieldType.millisOfSecond(),
        };
        __CLR4_4_116qg16qglgchosh5.R.inc(55667);int[] values = new int[]{10, 20, 30, 40};
        __CLR4_4_116qg16qglgchosh5.R.inc(55668);Partial p = new Partial(types, values);
        __CLR4_4_116qg16qglgchosh5.R.inc(55669);assertEquals(0, test1.compareTo(p));
        __CLR4_4_116qg16qglgchosh5.R.inc(55670);try {
            __CLR4_4_116qg16qglgchosh5.R.inc(55671);test1.compareTo(null);
            __CLR4_4_116qg16qglgchosh5.R.inc(55672);fail();
        } catch (NullPointerException ex) {
        }
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsEqual_TOD() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iq9sq116yh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testIsEqual_TOD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iq9sq116yh(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55673);
        __CLR4_4_116qg16qglgchosh5.R.inc(55674);TimeOfDay test1 = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55675);TimeOfDay test1a = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55676);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_116qg16qglgchosh5.R.inc(55677);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_116qg16qglgchosh5.R.inc(55678);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_116qg16qglgchosh5.R.inc(55679);assertEquals(true, test1a.isEqual(test1a));

        __CLR4_4_116qg16qglgchosh5.R.inc(55680);TimeOfDay test2 = new TimeOfDay(10, 20, 35, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55681);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_116qg16qglgchosh5.R.inc(55682);assertEquals(false, test2.isEqual(test1));

        __CLR4_4_116qg16qglgchosh5.R.inc(55683);TimeOfDay test3 = new TimeOfDay(10, 20, 35, 40, GregorianChronology.getInstanceUTC());
        __CLR4_4_116qg16qglgchosh5.R.inc(55684);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_116qg16qglgchosh5.R.inc(55685);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_116qg16qglgchosh5.R.inc(55686);assertEquals(true, test3.isEqual(test2));

        __CLR4_4_116qg16qglgchosh5.R.inc(55687);try {
            __CLR4_4_116qg16qglgchosh5.R.inc(55688);new TimeOfDay(10, 20, 35, 40).isEqual(null);
            __CLR4_4_116qg16qglgchosh5.R.inc(55689);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsBefore_TOD() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqti8c16yy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testIsBefore_TOD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqti8c16yy(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55690);
        __CLR4_4_116qg16qglgchosh5.R.inc(55691);TimeOfDay test1 = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55692);TimeOfDay test1a = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55693);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_116qg16qglgchosh5.R.inc(55694);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_116qg16qglgchosh5.R.inc(55695);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_116qg16qglgchosh5.R.inc(55696);assertEquals(false, test1a.isBefore(test1a));

        __CLR4_4_116qg16qglgchosh5.R.inc(55697);TimeOfDay test2 = new TimeOfDay(10, 20, 35, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55698);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_116qg16qglgchosh5.R.inc(55699);assertEquals(false, test2.isBefore(test1));

        __CLR4_4_116qg16qglgchosh5.R.inc(55700);TimeOfDay test3 = new TimeOfDay(10, 20, 35, 40, GregorianChronology.getInstanceUTC());
        __CLR4_4_116qg16qglgchosh5.R.inc(55701);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_116qg16qglgchosh5.R.inc(55702);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_116qg16qglgchosh5.R.inc(55703);assertEquals(false, test3.isBefore(test2));

        __CLR4_4_116qg16qglgchosh5.R.inc(55704);try {
            __CLR4_4_116qg16qglgchosh5.R.inc(55705);new TimeOfDay(10, 20, 35, 40).isBefore(null);
            __CLR4_4_116qg16qglgchosh5.R.inc(55706);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsAfter_TOD() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_113pdbj16zf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testIsAfter_TOD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_113pdbj16zf(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55707);
        __CLR4_4_116qg16qglgchosh5.R.inc(55708);TimeOfDay test1 = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55709);TimeOfDay test1a = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55710);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_116qg16qglgchosh5.R.inc(55711);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_116qg16qglgchosh5.R.inc(55712);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_116qg16qglgchosh5.R.inc(55713);assertEquals(false, test1a.isAfter(test1a));

        __CLR4_4_116qg16qglgchosh5.R.inc(55714);TimeOfDay test2 = new TimeOfDay(10, 20, 35, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55715);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_116qg16qglgchosh5.R.inc(55716);assertEquals(true, test2.isAfter(test1));

        __CLR4_4_116qg16qglgchosh5.R.inc(55717);TimeOfDay test3 = new TimeOfDay(10, 20, 35, 40, GregorianChronology.getInstanceUTC());
        __CLR4_4_116qg16qglgchosh5.R.inc(55718);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_116qg16qglgchosh5.R.inc(55719);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_116qg16qglgchosh5.R.inc(55720);assertEquals(false, test3.isAfter(test2));

        __CLR4_4_116qg16qglgchosh5.R.inc(55721);try {
            __CLR4_4_116qg16qglgchosh5.R.inc(55722);new TimeOfDay(10, 20, 35, 40).isAfter(null);
            __CLR4_4_116qg16qglgchosh5.R.inc(55723);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithChronologyRetainFields_Chrono() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143gerp16zw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithChronologyRetainFields_Chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55724,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143gerp16zw(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55724);
        __CLR4_4_116qg16qglgchosh5.R.inc(55725);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_116qg16qglgchosh5.R.inc(55726);TimeOfDay test = base.withChronologyRetainFields(BUDDHIST_TOKYO);
        __CLR4_4_116qg16qglgchosh5.R.inc(55727);check(base, 10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55728);assertEquals(COPTIC_UTC, base.getChronology());
        __CLR4_4_116qg16qglgchosh5.R.inc(55729);check(test, 10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55730);assertEquals(BUDDHIST_UTC, test.getChronology());
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testWithChronologyRetainFields_sameChrono() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15b1wdb1703();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithChronologyRetainFields_sameChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15b1wdb1703(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55731);
        __CLR4_4_116qg16qglgchosh5.R.inc(55732);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_116qg16qglgchosh5.R.inc(55733);TimeOfDay test = base.withChronologyRetainFields(COPTIC_TOKYO);
        __CLR4_4_116qg16qglgchosh5.R.inc(55734);assertSame(base, test);
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testWithChronologyRetainFields_nullChrono() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0ft9a1707();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithChronologyRetainFields_nullChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0ft9a1707(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55735);
        __CLR4_4_116qg16qglgchosh5.R.inc(55736);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_116qg16qglgchosh5.R.inc(55737);TimeOfDay test = base.withChronologyRetainFields(null);
        __CLR4_4_116qg16qglgchosh5.R.inc(55738);check(base, 10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55739);assertEquals(COPTIC_UTC, base.getChronology());
        __CLR4_4_116qg16qglgchosh5.R.inc(55740);check(test, 10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55741);assertEquals(ISO_UTC, test.getChronology());
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithField1() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lke16y170e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithField1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lke16y170e(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55742);
        __CLR4_4_116qg16qglgchosh5.R.inc(55743);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55744);TimeOfDay result = test.withField(DateTimeFieldType.hourOfDay(), 15);

        __CLR4_4_116qg16qglgchosh5.R.inc(55745);assertEquals(new TimeOfDay(10, 20, 30, 40), test);
        __CLR4_4_116qg16qglgchosh5.R.inc(55746);assertEquals(new TimeOfDay(15, 20, 30, 40), result);
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testWithField2() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ibe2eh170j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithField2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ibe2eh170j(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55747);
        __CLR4_4_116qg16qglgchosh5.R.inc(55748);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55749);try {
            __CLR4_4_116qg16qglgchosh5.R.inc(55750);test.withField(null, 6);
            __CLR4_4_116qg16qglgchosh5.R.inc(55751);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testWithField3() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2e3m0170o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithField3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55752,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2e3m0170o(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55752);
        __CLR4_4_116qg16qglgchosh5.R.inc(55753);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55754);try {
            __CLR4_4_116qg16qglgchosh5.R.inc(55755);test.withField(DateTimeFieldType.dayOfMonth(), 6);
            __CLR4_4_116qg16qglgchosh5.R.inc(55756);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testWithField4() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bte4tj170t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithField4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55757,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bte4tj170t(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55757);
        __CLR4_4_116qg16qglgchosh5.R.inc(55758);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55759);TimeOfDay result = test.withField(DateTimeFieldType.hourOfDay(), 10);
        __CLR4_4_116qg16qglgchosh5.R.inc(55760);assertSame(test, result);
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithFieldAdded1() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rgt22170x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithFieldAdded1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rgt22170x(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55761);
        __CLR4_4_116qg16qglgchosh5.R.inc(55762);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55763);TimeOfDay result = test.withFieldAdded(DurationFieldType.hours(), 6);

        __CLR4_4_116qg16qglgchosh5.R.inc(55764);assertEquals(new TimeOfDay(10, 20, 30, 40), test);
        __CLR4_4_116qg16qglgchosh5.R.inc(55765);assertEquals(new TimeOfDay(16, 20, 30, 40), result);
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded2() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_150gruj1712();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithFieldAdded2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_150gruj1712(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55766);
        __CLR4_4_116qg16qglgchosh5.R.inc(55767);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55768);try {
            __CLR4_4_116qg16qglgchosh5.R.inc(55769);test.withFieldAdded(null, 0);
            __CLR4_4_116qg16qglgchosh5.R.inc(55770);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded3() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189gqn01717();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithFieldAdded3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189gqn01717(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55771);
        __CLR4_4_116qg16qglgchosh5.R.inc(55772);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55773);try {
            __CLR4_4_116qg16qglgchosh5.R.inc(55774);test.withFieldAdded(null, 6);
            __CLR4_4_116qg16qglgchosh5.R.inc(55775);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded4() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bigpfh171c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithFieldAdded4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bigpfh171c(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55776);
        __CLR4_4_116qg16qglgchosh5.R.inc(55777);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55778);TimeOfDay result = test.withFieldAdded(DurationFieldType.hours(), 0);
        __CLR4_4_116qg16qglgchosh5.R.inc(55779);assertSame(test, result);
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded5() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ergo7y171g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithFieldAdded5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ergo7y171g(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55780);
        __CLR4_4_116qg16qglgchosh5.R.inc(55781);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55782);try {
            __CLR4_4_116qg16qglgchosh5.R.inc(55783);test.withFieldAdded(DurationFieldType.days(), 6);
            __CLR4_4_116qg16qglgchosh5.R.inc(55784);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded6() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0gn0f171l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithFieldAdded6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55785,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0gn0f171l(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55785);
        __CLR4_4_116qg16qglgchosh5.R.inc(55786);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55787);TimeOfDay result = test.withFieldAdded(DurationFieldType.hours(), 16);

        __CLR4_4_116qg16qglgchosh5.R.inc(55788);assertEquals(new TimeOfDay(10, 20, 30, 40), test);
        __CLR4_4_116qg16qglgchosh5.R.inc(55789);assertEquals(new TimeOfDay(2, 20, 30, 40), result);
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded7() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9glsw171q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithFieldAdded7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9glsw171q(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55790);
        __CLR4_4_116qg16qglgchosh5.R.inc(55791);TimeOfDay test = new TimeOfDay(23, 59, 59, 999);
        __CLR4_4_116qg16qglgchosh5.R.inc(55792);TimeOfDay result = test.withFieldAdded(DurationFieldType.millis(), 1);
        __CLR4_4_116qg16qglgchosh5.R.inc(55793);assertEquals(new TimeOfDay(0, 0, 0, 0), result);

        __CLR4_4_116qg16qglgchosh5.R.inc(55794);test = new TimeOfDay(23, 59, 59, 999);
        __CLR4_4_116qg16qglgchosh5.R.inc(55795);result = test.withFieldAdded(DurationFieldType.seconds(), 1);
        __CLR4_4_116qg16qglgchosh5.R.inc(55796);assertEquals(new TimeOfDay(0, 0, 0, 999), result);

        __CLR4_4_116qg16qglgchosh5.R.inc(55797);test = new TimeOfDay(23, 59, 59, 999);
        __CLR4_4_116qg16qglgchosh5.R.inc(55798);result = test.withFieldAdded(DurationFieldType.minutes(), 1);
        __CLR4_4_116qg16qglgchosh5.R.inc(55799);assertEquals(new TimeOfDay(0, 0, 59, 999), result);

        __CLR4_4_116qg16qglgchosh5.R.inc(55800);test = new TimeOfDay(23, 59, 59, 999);
        __CLR4_4_116qg16qglgchosh5.R.inc(55801);result = test.withFieldAdded(DurationFieldType.hours(), 1);
        __CLR4_4_116qg16qglgchosh5.R.inc(55802);assertEquals(new TimeOfDay(0, 59, 59, 999), result);
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded8() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oigkld1723();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithFieldAdded8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oigkld1723(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55803);
        __CLR4_4_116qg16qglgchosh5.R.inc(55804);TimeOfDay test = new TimeOfDay(0, 0, 0, 0);
        __CLR4_4_116qg16qglgchosh5.R.inc(55805);TimeOfDay result = test.withFieldAdded(DurationFieldType.millis(), -1);
        __CLR4_4_116qg16qglgchosh5.R.inc(55806);assertEquals(new TimeOfDay(23, 59, 59, 999), result);

        __CLR4_4_116qg16qglgchosh5.R.inc(55807);test = new TimeOfDay(0, 0, 0, 0);
        __CLR4_4_116qg16qglgchosh5.R.inc(55808);result = test.withFieldAdded(DurationFieldType.seconds(), -1);
        __CLR4_4_116qg16qglgchosh5.R.inc(55809);assertEquals(new TimeOfDay(23, 59, 59, 0), result);

        __CLR4_4_116qg16qglgchosh5.R.inc(55810);test = new TimeOfDay(0, 0, 0, 0);
        __CLR4_4_116qg16qglgchosh5.R.inc(55811);result = test.withFieldAdded(DurationFieldType.minutes(), -1);
        __CLR4_4_116qg16qglgchosh5.R.inc(55812);assertEquals(new TimeOfDay(23, 59, 0, 0), result);

        __CLR4_4_116qg16qglgchosh5.R.inc(55813);test = new TimeOfDay(0, 0, 0, 0);
        __CLR4_4_116qg16qglgchosh5.R.inc(55814);result = test.withFieldAdded(DurationFieldType.hours(), -1);
        __CLR4_4_116qg16qglgchosh5.R.inc(55815);assertEquals(new TimeOfDay(23, 0, 0, 0), result);
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPlus_RP() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz83ig172g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55816,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz83ig172g(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55816);
        __CLR4_4_116qg16qglgchosh5.R.inc(55817);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, BuddhistChronology.getInstance());
        __CLR4_4_116qg16qglgchosh5.R.inc(55818);TimeOfDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        __CLR4_4_116qg16qglgchosh5.R.inc(55819);TimeOfDay expected = new TimeOfDay(15, 26, 37, 48, BuddhistChronology.getInstance());
        __CLR4_4_116qg16qglgchosh5.R.inc(55820);assertEquals(expected, result);

        __CLR4_4_116qg16qglgchosh5.R.inc(55821);result = test.plus((ReadablePeriod) null);
        __CLR4_4_116qg16qglgchosh5.R.inc(55822);assertSame(test, result);
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testPlusHours_int() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s87b5y172n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlusHours_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55823,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s87b5y172n(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55823);
        __CLR4_4_116qg16qglgchosh5.R.inc(55824);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_116qg16qglgchosh5.R.inc(55825);TimeOfDay result = test.plusHours(1);
        __CLR4_4_116qg16qglgchosh5.R.inc(55826);TimeOfDay expected = new TimeOfDay(2, 2, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_116qg16qglgchosh5.R.inc(55827);assertEquals(expected, result);

        __CLR4_4_116qg16qglgchosh5.R.inc(55828);result = test.plusHours(0);
        __CLR4_4_116qg16qglgchosh5.R.inc(55829);assertSame(test, result);
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testPlusMinutes_int() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k0mjqu172u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlusMinutes_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k0mjqu172u(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55830);
        __CLR4_4_116qg16qglgchosh5.R.inc(55831);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_116qg16qglgchosh5.R.inc(55832);TimeOfDay result = test.plusMinutes(1);
        __CLR4_4_116qg16qglgchosh5.R.inc(55833);TimeOfDay expected = new TimeOfDay(1, 3, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_116qg16qglgchosh5.R.inc(55834);assertEquals(expected, result);

        __CLR4_4_116qg16qglgchosh5.R.inc(55835);result = test.plusMinutes(0);
        __CLR4_4_116qg16qglgchosh5.R.inc(55836);assertSame(test, result);
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testPlusSeconds_int() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xx4lre1731();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlusSeconds_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55837,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xx4lre1731(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55837);
        __CLR4_4_116qg16qglgchosh5.R.inc(55838);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_116qg16qglgchosh5.R.inc(55839);TimeOfDay result = test.plusSeconds(1);
        __CLR4_4_116qg16qglgchosh5.R.inc(55840);TimeOfDay expected = new TimeOfDay(1, 2, 4, 4, BuddhistChronology.getInstance());
        __CLR4_4_116qg16qglgchosh5.R.inc(55841);assertEquals(expected, result);

        __CLR4_4_116qg16qglgchosh5.R.inc(55842);result = test.plusSeconds(0);
        __CLR4_4_116qg16qglgchosh5.R.inc(55843);assertSame(test, result);
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testPlusMillis_int() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1blt4471738();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlusMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55844,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1blt4471738(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55844);
        __CLR4_4_116qg16qglgchosh5.R.inc(55845);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_116qg16qglgchosh5.R.inc(55846);TimeOfDay result = test.plusMillis(1);
        __CLR4_4_116qg16qglgchosh5.R.inc(55847);TimeOfDay expected = new TimeOfDay(1, 2, 3, 5, BuddhistChronology.getInstance());
        __CLR4_4_116qg16qglgchosh5.R.inc(55848);assertEquals(expected, result);

        __CLR4_4_116qg16qglgchosh5.R.inc(55849);result = test.plusMillis(0);
        __CLR4_4_116qg16qglgchosh5.R.inc(55850);assertSame(test, result);
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMinus_RP() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112cpdm173f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112cpdm173f(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55851);
        __CLR4_4_116qg16qglgchosh5.R.inc(55852);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, BuddhistChronology.getInstance());
        __CLR4_4_116qg16qglgchosh5.R.inc(55853);TimeOfDay result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        __CLR4_4_116qg16qglgchosh5.R.inc(55854);TimeOfDay expected = new TimeOfDay(9, 19, 29, 39, BuddhistChronology.getInstance());
        __CLR4_4_116qg16qglgchosh5.R.inc(55855);assertEquals(expected, result);

        __CLR4_4_116qg16qglgchosh5.R.inc(55856);result = test.minus((ReadablePeriod) null);
        __CLR4_4_116qg16qglgchosh5.R.inc(55857);assertSame(test, result);
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testMinusHours_int() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svmid4173m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinusHours_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svmid4173m(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55858);
        __CLR4_4_116qg16qglgchosh5.R.inc(55859);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_116qg16qglgchosh5.R.inc(55860);TimeOfDay result = test.minusHours(1);
        __CLR4_4_116qg16qglgchosh5.R.inc(55861);TimeOfDay expected = new TimeOfDay(0, 2, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_116qg16qglgchosh5.R.inc(55862);assertEquals(expected, result);

        __CLR4_4_116qg16qglgchosh5.R.inc(55863);result = test.minusHours(0);
        __CLR4_4_116qg16qglgchosh5.R.inc(55864);assertSame(test, result);
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testMinusMinutes_int() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15zd8a0173t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinusMinutes_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55865,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15zd8a0173t(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55865);
        __CLR4_4_116qg16qglgchosh5.R.inc(55866);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_116qg16qglgchosh5.R.inc(55867);TimeOfDay result = test.minusMinutes(1);
        __CLR4_4_116qg16qglgchosh5.R.inc(55868);TimeOfDay expected = new TimeOfDay(1, 1, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_116qg16qglgchosh5.R.inc(55869);assertEquals(expected, result);

        __CLR4_4_116qg16qglgchosh5.R.inc(55870);result = test.minusMinutes(0);
        __CLR4_4_116qg16qglgchosh5.R.inc(55871);assertSame(test, result);
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testMinusSeconds_int() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n2q4qw1740();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinusSeconds_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n2q4qw1740(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55872);
        __CLR4_4_116qg16qglgchosh5.R.inc(55873);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_116qg16qglgchosh5.R.inc(55874);TimeOfDay result = test.minusSeconds(1);
        __CLR4_4_116qg16qglgchosh5.R.inc(55875);TimeOfDay expected = new TimeOfDay(1, 2, 2, 4, BuddhistChronology.getInstance());
        __CLR4_4_116qg16qglgchosh5.R.inc(55876);assertEquals(expected, result);

        __CLR4_4_116qg16qglgchosh5.R.inc(55877);result = test.minusSeconds(0);
        __CLR4_4_116qg16qglgchosh5.R.inc(55878);assertSame(test, result);
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testMinusMillis_int() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vrwbad1747();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinusMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vrwbad1747(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55879);
        __CLR4_4_116qg16qglgchosh5.R.inc(55880);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_116qg16qglgchosh5.R.inc(55881);TimeOfDay result = test.minusMillis(1);
        __CLR4_4_116qg16qglgchosh5.R.inc(55882);TimeOfDay expected = new TimeOfDay(1, 2, 3, 3, BuddhistChronology.getInstance());
        __CLR4_4_116qg16qglgchosh5.R.inc(55883);assertEquals(expected, result);

        __CLR4_4_116qg16qglgchosh5.R.inc(55884);result = test.minusMillis(0);
        __CLR4_4_116qg16qglgchosh5.R.inc(55885);assertSame(test, result);
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToLocalTime() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mn1c42174e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToLocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55886,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mn1c42174e(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55886);
        __CLR4_4_116qg16qglgchosh5.R.inc(55887);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_UTC);
        __CLR4_4_116qg16qglgchosh5.R.inc(55888);LocalTime test = base.toLocalTime();
        __CLR4_4_116qg16qglgchosh5.R.inc(55889);assertEquals(new LocalTime(10, 20, 30, 40, COPTIC_UTC), test);
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTimeToday() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ggeazk174i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToDateTimeToday",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55890,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ggeazk174i(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55890);
        __CLR4_4_116qg16qglgchosh5.R.inc(55891);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_116qg16qglgchosh5.R.inc(55892);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_116qg16qglgchosh5.R.inc(55893);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());

        __CLR4_4_116qg16qglgchosh5.R.inc(55894);DateTime test = base.toDateTimeToday();
        __CLR4_4_116qg16qglgchosh5.R.inc(55895);check(base, 10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55896);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON);
        __CLR4_4_116qg16qglgchosh5.R.inc(55897);expected = expected.hourOfDay().setCopy(10);
        __CLR4_4_116qg16qglgchosh5.R.inc(55898);expected = expected.minuteOfHour().setCopy(20);
        __CLR4_4_116qg16qglgchosh5.R.inc(55899);expected = expected.secondOfMinute().setCopy(30);
        __CLR4_4_116qg16qglgchosh5.R.inc(55900);expected = expected.millisOfSecond().setCopy(40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55901);assertEquals(expected, test);
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTimeToday_Zone() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1junxpj174u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToDateTimeToday_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55902,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1junxpj174u(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55902);
        __CLR4_4_116qg16qglgchosh5.R.inc(55903);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_116qg16qglgchosh5.R.inc(55904);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_116qg16qglgchosh5.R.inc(55905);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());

        __CLR4_4_116qg16qglgchosh5.R.inc(55906);DateTime test = base.toDateTimeToday(TOKYO);
        __CLR4_4_116qg16qglgchosh5.R.inc(55907);check(base, 10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55908);DateTime expected = new DateTime(dt.getMillis(), COPTIC_TOKYO);
        __CLR4_4_116qg16qglgchosh5.R.inc(55909);expected = expected.hourOfDay().setCopy(10);
        __CLR4_4_116qg16qglgchosh5.R.inc(55910);expected = expected.minuteOfHour().setCopy(20);
        __CLR4_4_116qg16qglgchosh5.R.inc(55911);expected = expected.secondOfMinute().setCopy(30);
        __CLR4_4_116qg16qglgchosh5.R.inc(55912);expected = expected.millisOfSecond().setCopy(40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55913);assertEquals(expected, test);
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testToDateTimeToday_nullZone() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pjvd1c1756();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToDateTimeToday_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pjvd1c1756(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55914);
        __CLR4_4_116qg16qglgchosh5.R.inc(55915);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_116qg16qglgchosh5.R.inc(55916);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_116qg16qglgchosh5.R.inc(55917);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());

        __CLR4_4_116qg16qglgchosh5.R.inc(55918);DateTime test = base.toDateTimeToday((DateTimeZone) null);
        __CLR4_4_116qg16qglgchosh5.R.inc(55919);check(base, 10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55920);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON);
        __CLR4_4_116qg16qglgchosh5.R.inc(55921);expected = expected.hourOfDay().setCopy(10);
        __CLR4_4_116qg16qglgchosh5.R.inc(55922);expected = expected.minuteOfHour().setCopy(20);
        __CLR4_4_116qg16qglgchosh5.R.inc(55923);expected = expected.secondOfMinute().setCopy(30);
        __CLR4_4_116qg16qglgchosh5.R.inc(55924);expected = expected.millisOfSecond().setCopy(40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55925);assertEquals(expected, test);
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    // Removed as too complex
//    /**
//     * Merges two partial together, taking account of the different chronologies.
//     *
//     * @param main  the main partial
//     * @param base  the partial to use as a base to merge on top of
//     * @param instant  the instant to start from and to use for missing fields
//     * @return the merged instant
//     */
//    public long merge(ReadablePartial main, ReadablePartial base, long instant) {
//        DateTimeZone zone = main.getChronology().getZone();
//        instant = base.getChronology().withZone(zone).set(base, instant);
//        return set(main, instant);
//    }
//
//    //-----------------------------------------------------------------------
//    /**
//     * Converts this object to a DateTime using a YearMonthDay to fill in the
//     * missing fields and using the default time zone.
//     * This instance is immutable and unaffected by this method call.
//     * <p>
//     * The resulting chronology is determined by the chronology of this
//     * TimeOfDay plus the time zone.
//     * <p>
//     * This method makes use of the chronology of the specified YearMonthDay
//     * in the calculation. This can be significant when mixing chronologies.
//     * If the YearMonthDay is in the same chronology as this instance the
//     * method will perform exactly as you might expect.
//     * <p>
//     * If the chronologies differ, then both this TimeOfDay and the YearMonthDay
//     * are converted to the destination chronology and then merged. As a result
//     * it may be the case that the year, monthOfYear and dayOfMonth fields on
//     * the result are different from the values returned by the methods on the
//     * YearMonthDay.
//     * <p>
//     * See {@link DateTime#withFields(ReadablePartial)} for an algorithm that
//     * ignores the chronology.
//     *
//     * @param date  the date to use, null means today
//     * @return the DateTime instance
//     */
//    public DateTime toDateTime(YearMonthDay date) {
//        return toDateTime(date, null);
//    }
//
//    /**
//     * Converts this object to a DateTime using a YearMonthDay to fill in the
//     * missing fields.
//     * This instance is immutable and unaffected by this method call.
//     * <p>
//     * The resulting chronology is determined by the chronology of this
//     * TimeOfDay plus the time zone.
//     * <p>
//     * This method makes use of the chronology of the specified YearMonthDay
//     * in the calculation. This can be significant when mixing chronologies.
//     * If the YearMonthDay is in the same chronology as this instance the
//     * method will perform exactly as you might expect.
//     * <p>
//     * If the chronologies differ, then both this TimeOfDay and the YearMonthDay
//     * are converted to the destination chronology and then merged. As a result
//     * it may be the case that the year, monthOfYear and dayOfMonth fields on
//     * the result are different from the values returned by the methods on the
//     * YearMonthDay.
//     * <p>
//     * See {@link DateTime#withFields(ReadablePartial)} for an algorithm that
//     * ignores the chronology and just assigns the fields.
//     *
//     * @param date  the date to use, null means today
//     * @param zone  the zone to get the DateTime in, null means default
//     * @return the DateTime instance
//     */
//    public DateTime toDateTime(YearMonthDay date, DateTimeZone zone) {
//        Chronology chrono = getChronology().withZone(zone);
//        if (date == null) {
//            DateTime dt = new DateTime(chrono);
//            return dt.withFields(this);
//        } else {
//            long millis = chrono.merge(this, date, DateTimeUtils.currentTimeMillis());
//            return new DateTime(millis, chrono);
//        }
//    }
//
//    //-----------------------------------------------------------------------
//    @Test public void testToDateTime_YMD() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        YearMonthDay ymd = new YearMonthDay(new DateMidnight(2004, 6, 9), BUDDHIST_TOKYO);
//        
//        DateTime test = base.toDateTime(ymd);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(ymd.toDateMidnight(LONDON), COPTIC_LONDON);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }
//
//    @Test public void testToDateTime_nullYMD() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        
//        DateTime test = base.toDateTime((YearMonthDay) null);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(COPTIC_LONDON);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }
//
//    //-----------------------------------------------------------------------
//    @Test public void testToDateTime_YMD_Zone() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        YearMonthDay ymd = new YearMonthDay(new DateMidnight(2004, 6, 9), BUDDHIST_LONDON);
//        
//        DateTime test = base.toDateTime(ymd, TOKYO);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(ymd.toDateMidnight(TOKYO), COPTIC_TOKYO);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }
//
//    @Test public void testToDateTime_YMD_nullZone() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        YearMonthDay ymd = new YearMonthDay(new DateMidnight(2004, 6, 9), BUDDHIST_LONDON);
//        
//        DateTime test = base.toDateTime(ymd, null);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(ymd.toDateMidnight(LONDON), COPTIC_LONDON);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }
//
//    @Test public void testToDateTime_nullYMD_Zone() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        
//        DateTime test = base.toDateTime((YearMonthDay) null, TOKYO);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(COPTIC_TOKYO);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTime_RI() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1584tmd175i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToDateTime_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55926,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1584tmd175i(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55926);
        __CLR4_4_116qg16qglgchosh5.R.inc(55927);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_116qg16qglgchosh5.R.inc(55928);DateTime dt = new DateTime(0L); // LONDON zone
        __CLR4_4_116qg16qglgchosh5.R.inc(55929);assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString());

        __CLR4_4_116qg16qglgchosh5.R.inc(55930);DateTime test = base.toDateTime(dt);
        __CLR4_4_116qg16qglgchosh5.R.inc(55931);check(base, 10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55932);assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString());
        __CLR4_4_116qg16qglgchosh5.R.inc(55933);assertEquals("1970-01-01T10:20:30.040+01:00", test.toString());
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    @Test
    public void testToDateTime_nullRI() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xlns4175q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToDateTime_nullRI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xlns4175q(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55934);
        __CLR4_4_116qg16qglgchosh5.R.inc(55935);TimeOfDay base = new TimeOfDay(1, 2, 3, 4);
        __CLR4_4_116qg16qglgchosh5.R.inc(55936);DateTimeUtils.setCurrentMillisFixed(TEST_TIME2);

        __CLR4_4_116qg16qglgchosh5.R.inc(55937);DateTime test = base.toDateTime((ReadableInstant) null);
        __CLR4_4_116qg16qglgchosh5.R.inc(55938);check(base, 1, 2, 3, 4);
        __CLR4_4_116qg16qglgchosh5.R.inc(55939);assertEquals("1970-01-02T01:02:03.004+01:00", test.toString());
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithers() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn9jzp175w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn9jzp175w(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55940);
        __CLR4_4_116qg16qglgchosh5.R.inc(55941);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55942);check(test.withHourOfDay(6), 6, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55943);check(test.withMinuteOfHour(6), 10, 6, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55944);check(test.withSecondOfMinute(6), 10, 20, 6, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55945);check(test.withMillisOfSecond(6), 10, 20, 30, 6);
        __CLR4_4_116qg16qglgchosh5.R.inc(55946);try {
            __CLR4_4_116qg16qglgchosh5.R.inc(55947);test.withHourOfDay(-1);
            __CLR4_4_116qg16qglgchosh5.R.inc(55948);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_116qg16qglgchosh5.R.inc(55949);try {
            __CLR4_4_116qg16qglgchosh5.R.inc(55950);test.withHourOfDay(24);
            __CLR4_4_116qg16qglgchosh5.R.inc(55951);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testProperty() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7neoi1768();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7neoi1768(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55952);
        __CLR4_4_116qg16qglgchosh5.R.inc(55953);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55954);assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay()));
        __CLR4_4_116qg16qglgchosh5.R.inc(55955);assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_116qg16qglgchosh5.R.inc(55956);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_116qg16qglgchosh5.R.inc(55957);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_116qg16qglgchosh5.R.inc(55958);try {
            __CLR4_4_116qg16qglgchosh5.R.inc(55959);test.property(DateTimeFieldType.millisOfDay());
            __CLR4_4_116qg16qglgchosh5.R.inc(55960);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_116qg16qglgchosh5.R.inc(55961);try {
            __CLR4_4_116qg16qglgchosh5.R.inc(55962);test.property(null);
            __CLR4_4_116qg16qglgchosh5.R.inc(55963);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9176k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9176k() throws Exception{try{__CLR4_4_116qg16qglgchosh5.R.inc(55964);
        __CLR4_4_116qg16qglgchosh5.R.inc(55965);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS);

        __CLR4_4_116qg16qglgchosh5.R.inc(55966);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_116qg16qglgchosh5.R.inc(55967);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_116qg16qglgchosh5.R.inc(55968);oos.writeObject(test);
        __CLR4_4_116qg16qglgchosh5.R.inc(55969);oos.close();
        __CLR4_4_116qg16qglgchosh5.R.inc(55970);byte[] bytes = baos.toByteArray();

        __CLR4_4_116qg16qglgchosh5.R.inc(55971);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_116qg16qglgchosh5.R.inc(55972);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_116qg16qglgchosh5.R.inc(55973);TimeOfDay result = (TimeOfDay) ois.readObject();
        __CLR4_4_116qg16qglgchosh5.R.inc(55974);ois.close();

        __CLR4_4_116qg16qglgchosh5.R.inc(55975);assertEquals(test, result);
        __CLR4_4_116qg16qglgchosh5.R.inc(55976);assertTrue(Arrays.equals(test.getValues(), result.getValues()));
        __CLR4_4_116qg16qglgchosh5.R.inc(55977);assertTrue(Arrays.equals(test.getFields(), result.getFields()));
        __CLR4_4_116qg16qglgchosh5.R.inc(55978);assertEquals(test.getChronology(), result.getChronology());
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid176z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid176z(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55979);
        __CLR4_4_116qg16qglgchosh5.R.inc(55980);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55981);assertEquals("T10:20:30.040", test.toString());
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_String() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llkh2x1772();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToString_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llkh2x1772(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55982);
        __CLR4_4_116qg16qglgchosh5.R.inc(55983);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55984);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString("yyyy HH"));
        __CLR4_4_116qg16qglgchosh5.R.inc(55985);assertEquals("T10:20:30.040", test.toString((String) null));
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_String_Locale() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1afd64u1776();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToString_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55986,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1afd64u1776(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55986);
        __CLR4_4_116qg16qglgchosh5.R.inc(55987);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55988);assertEquals("10 20", test.toString("H m", Locale.ENGLISH));
        __CLR4_4_116qg16qglgchosh5.R.inc(55989);assertEquals("T10:20:30.040", test.toString(null, Locale.ENGLISH));
        __CLR4_4_116qg16qglgchosh5.R.inc(55990);assertEquals("10 20", test.toString("H m", null));
        __CLR4_4_116qg16qglgchosh5.R.inc(55991);assertEquals("T10:20:30.040", test.toString(null, null));
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_DTFormatter() {__CLR4_4_116qg16qglgchosh5.R.globalSliceStart(getClass().getName(),55992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxbkps177c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116qg16qglgchosh5.R.rethrow($CLV_t2$);}finally{__CLR4_4_116qg16qglgchosh5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToString_DTFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxbkps177c(){try{__CLR4_4_116qg16qglgchosh5.R.inc(55992);
        __CLR4_4_116qg16qglgchosh5.R.inc(55993);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_116qg16qglgchosh5.R.inc(55994);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString(DateTimeFormat.forPattern("yyyy HH")));
        __CLR4_4_116qg16qglgchosh5.R.inc(55995);assertEquals("T10:20:30.040", test.toString((DateTimeFormatter) null));
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(TimeOfDay test, int hour, int min, int sec, int milli) {try{__CLR4_4_116qg16qglgchosh5.R.inc(55996);
        __CLR4_4_116qg16qglgchosh5.R.inc(55997);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_116qg16qglgchosh5.R.inc(55998);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_116qg16qglgchosh5.R.inc(55999);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_116qg16qglgchosh5.R.inc(56000);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_116qg16qglgchosh5.R.flushNeeded();}}
}
