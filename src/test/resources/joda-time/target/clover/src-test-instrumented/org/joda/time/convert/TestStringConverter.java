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
package org.joda.time.convert;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for StringConverter.
 *
 * @author Stephen Colebourne
 */
public class TestStringConverter {static class __CLR4_4_11f9e1f9elgchosrb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,66924,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone ONE_HOUR = DateTimeZone.forOffsetHours(1);
    private static final DateTimeZone SIX = DateTimeZone.forOffsetHours(6);
    private static final DateTimeZone SEVEN = DateTimeZone.forOffsetHours(7);
    private static final DateTimeZone EIGHT = DateTimeZone.forOffsetHours(8);
    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_EIGHT = ISOChronology.getInstance(EIGHT);
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
    private static Chronology ISO;
    private static Chronology JULIAN;

    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66434);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66435);TestStringConverter TB = new TestStringConverter();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66436);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66437);TB.testSingleton();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66438);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66439);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66440);TB.testSupportedType();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66441);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66442);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66443);TB.testGetInstantMillis_Object();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66444);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66445);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66446);TB.testGetInstantMillis_Object_Zone();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66447);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66448);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66449);TB.testGetInstantMillis_Object_Chronology();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66450);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66451);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66452);TB.testGetInstantMillisInvalid();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66453);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66454);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66455);TB.testGetChronology_Object_Zone();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66456);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66457);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66458);TB.testGetChronology_Object_Chronology();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66459);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66460);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66461);TB.testGetPartialValues();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66462);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66463);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66464);TB.testGetDateTime();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66465);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66466);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66467);TB.testGetDateTime1();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66468);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66469);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66470);TB.testGetDateTime2();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66471);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66472);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66473);TB.testGetDateTime3();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66474);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66475);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66476);TB.testGetDateTime4();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66477);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66478);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66479);TB.testGetDateTime5();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66480);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66481);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66482);TB.testGetDateTime6();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66483);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66484);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66485);TB.testGetDurationMillis_Object1();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66486);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66487);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66488);TB.testGetDurationMillis_Object2();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66489);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66490);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66491);TB.testGetPeriodType_Object();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66492);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66493);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66494);TB.testSetIntoPeriod_Object1();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66495);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66496);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66497);TB.testSetIntoPeriod_Object2();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66498);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66499);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66500);TB.testSetIntoPeriod_Object3();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66501);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66502);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66503);TB.testSetIntoPeriod_Object4();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66504);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66505);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66506);TB.testSetIntoPeriod_Object5();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66507);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66508);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66509);TB.testSetIntoPeriod_Object6();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66510);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66511);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66512);TB.testSetIntoPeriod_Object7();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66513);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66514);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66515);TB.testSetIntoPeriod_Object8();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66516);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66517);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66518);TB.testIsReadableInterval_Object_Chronology();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66519);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66520);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66521);TB.testSetIntoInterval_Object_Chronology1();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66522);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66523);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66524);TB.testSetIntoInterval_Object_Chronology2();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66525);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66526);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66527);TB.testSetIntoInterval_Object_Chronology3();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66528);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66529);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66530);TB.testSetIntoInterval_Object_Chronology4();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66531);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66532);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66533);TB.testSetIntoInterval_Object_Chronology5();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66534);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66535);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66536);TB.testSetIntoInterval_Object_Chronology6();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66537);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66538);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66539);TB.testSetIntoInterval_Object_Chronology7();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66540);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66541);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66542);TB.testSetIntoInterval_Object_Chronology8();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66543);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66544);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66545);TB.testSetIntoIntervalEx_Object_Chronology1();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66546);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66547);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66548);TB.testSetIntoIntervalEx_Object_Chronology2();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66549);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66550);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66551);TB.testSetIntoIntervalEx_Object_Chronology3();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66552);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66553);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66554);TB.testSetIntoIntervalEx_Object_Chronology4();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66555);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66556);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66557);TB.testSetIntoIntervalEx_Object_Chronology5();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66558);TB.tearDown();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66559);TB.setUp();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66560);TB.testToString();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66561);TB.tearDown();

    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestStringConverter.class);
    }

    public TestStringConverter(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66562);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66563);zone = DateTimeZone.getDefault();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66564);locale = Locale.getDefault();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66565);DateTimeZone.setDefault(LONDON);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66566);Locale.setDefault(Locale.UK);

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66567);JULIAN = JulianChronology.getInstance();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66568);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66569);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66570);DateTimeZone.setDefault(zone);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66571);Locale.setDefault(locale);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66572);zone = null;
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSingleton() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmk8jk1fd9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSingleton",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmk8jk1fd9() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66573);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66574);Class cls = StringConverter.class;
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66575);assertEquals(false, Modifier.isPublic(cls.getModifiers()));
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66576);assertEquals(false, Modifier.isProtected(cls.getModifiers()));
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66577);assertEquals(false, Modifier.isPrivate(cls.getModifiers()));

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66578);Constructor con = cls.getDeclaredConstructor((Class[]) null);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66579);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66580);assertEquals(true, Modifier.isProtected(con.getModifiers()));

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66581);Field fld = cls.getDeclaredField("INSTANCE");
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66582);assertEquals(false, Modifier.isPublic(fld.getModifiers()));
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66583);assertEquals(false, Modifier.isProtected(fld.getModifiers()));
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66584);assertEquals(false, Modifier.isPrivate(fld.getModifiers()));
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSupportedType() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fthtzx1fdl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSupportedType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66585,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fthtzx1fdl() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66585);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66586);assertEquals(String.class, StringConverter.INSTANCE.getSupportedType());
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetInstantMillis_Object() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1phnr7m1fdn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetInstantMillis_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66587,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1phnr7m1fdn() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66587);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66588);DateTime dt = new DateTime(2004, 6, 9, 12, 24, 48, 501, EIGHT);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66589);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12:24:48.501+08:00", ISO_EIGHT));

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66590);dt = new DateTime(2004, 1, 1, 0, 0, 0, 0, EIGHT);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66591);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004T+08:00", ISO_EIGHT));

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66592);dt = new DateTime(2004, 6, 1, 0, 0, 0, 0, EIGHT);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66593);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06T+08:00", ISO_EIGHT));

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66594);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, EIGHT);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66595);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T+08:00", ISO_EIGHT));

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66596);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, EIGHT);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66597);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-161T+08:00", ISO_EIGHT));

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66598);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, EIGHT);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66599);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-W24-3T+08:00", ISO_EIGHT));

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66600);dt = new DateTime(2004, 6, 7, 0, 0, 0, 0, EIGHT);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66601);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-W24T+08:00", ISO_EIGHT));

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66602);dt = new DateTime(2004, 6, 9, 12, 0, 0, 0, EIGHT);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66603);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12+08:00", ISO_EIGHT));

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66604);dt = new DateTime(2004, 6, 9, 12, 24, 0, 0, EIGHT);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66605);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12:24+08:00", ISO_EIGHT));

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66606);dt = new DateTime(2004, 6, 9, 12, 24, 48, 0, EIGHT);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66607);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12:24:48+08:00", ISO_EIGHT));

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66608);dt = new DateTime(2004, 6, 9, 12, 30, 0, 0, EIGHT);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66609);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12.5+08:00", ISO_EIGHT));

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66610);dt = new DateTime(2004, 6, 9, 12, 24, 30, 0, EIGHT);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66611);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12:24.5+08:00", ISO_EIGHT));

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66612);dt = new DateTime(2004, 6, 9, 12, 24, 48, 500, EIGHT);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66613);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12:24:48.5+08:00", ISO_EIGHT));

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66614);dt = new DateTime(2004, 6, 9, 12, 24, 48, 501);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66615);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12:24:48.501", ISO));
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testGetInstantMillis_Object_Zone() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ane8tz1feg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetInstantMillis_Object_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66616,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ane8tz1feg() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66616);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66617);DateTime dt = new DateTime(2004, 6, 9, 12, 24, 48, 501, PARIS);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66618);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12:24:48.501+02:00", ISO_PARIS));

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66619);dt = new DateTime(2004, 6, 9, 12, 24, 48, 501, PARIS);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66620);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12:24:48.501", ISO_PARIS));

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66621);dt = new DateTime(2004, 6, 9, 12, 24, 48, 501, LONDON);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66622);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12:24:48.501+01:00", ISO_LONDON));

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66623);dt = new DateTime(2004, 6, 9, 12, 24, 48, 501, LONDON);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66624);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12:24:48.501", ISO_LONDON));
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testGetInstantMillis_Object_Chronology() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12gh1ib1fep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetInstantMillis_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66625,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12gh1ib1fep() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66625);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66626);DateTime dt = new DateTime(2004, 6, 9, 12, 24, 48, 501, JulianChronology.getInstance(LONDON));
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66627);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12:24:48.501+01:00", JULIAN));
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testGetInstantMillisInvalid() {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c2dn0b1fes();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetInstantMillisInvalid",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66628,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c2dn0b1fes(){try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66628);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66629);try {
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66630);StringConverter.INSTANCE.getInstantMillis("", (Chronology) null);
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66631);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66632);try {
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66633);StringConverter.INSTANCE.getInstantMillis("X", (Chronology) null);
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66634);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetChronology_Object_Zone() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbwmeo1fez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetChronology_Object_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbwmeo1fez() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66635);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66636);assertEquals(ISOChronology.getInstance(PARIS), StringConverter.INSTANCE.getChronology("2004-06-09T12:24:48.501+01:00", PARIS));
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66637);assertEquals(ISOChronology.getInstance(PARIS), StringConverter.INSTANCE.getChronology("2004-06-09T12:24:48.501", PARIS));
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66638);assertEquals(ISOChronology.getInstance(LONDON), StringConverter.INSTANCE.getChronology("2004-06-09T12:24:48.501+01:00", (DateTimeZone) null));
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66639);assertEquals(ISOChronology.getInstance(LONDON), StringConverter.INSTANCE.getChronology("2004-06-09T12:24:48.501", (DateTimeZone) null));
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testGetChronology_Object_Chronology() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5zpek1ff4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetChronology_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66640,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5zpek1ff4() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66640);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66641);assertEquals(JulianChronology.getInstance(LONDON), StringConverter.INSTANCE.getChronology("2004-06-09T12:24:48.501+01:00", JULIAN));
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66642);assertEquals(JulianChronology.getInstance(LONDON), StringConverter.INSTANCE.getChronology("2004-06-09T12:24:48.501", JULIAN));
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66643);assertEquals(ISOChronology.getInstance(LONDON), StringConverter.INSTANCE.getChronology("2004-06-09T12:24:48.501+01:00", (Chronology) null));
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66644);assertEquals(ISOChronology.getInstance(LONDON), StringConverter.INSTANCE.getChronology("2004-06-09T12:24:48.501", (Chronology) null));
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetPartialValues() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrzqzq1ff9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetPartialValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66645,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrzqzq1ff9() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66645);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66646);TimeOfDay tod = new TimeOfDay();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66647);int[] expected = new int[]{3, 4, 5, 6};
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66648);int[] actual = StringConverter.INSTANCE.getPartialValues(tod, "T03:04:05.006", ISOChronology.getInstance());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66649);assertEquals(true, Arrays.equals(expected, actual));
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetDateTime() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fkmykm1ffe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66650,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fkmykm1ffe() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66650);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66651);DateTime base = new DateTime(2004, 6, 9, 12, 24, 48, 501, PARIS);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66652);DateTime test = new DateTime(base.toString(), PARIS);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66653);assertEquals(base, test);
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testGetDateTime1() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p3fnqx1ffi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDateTime1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p3fnqx1ffi() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66654);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66655);DateTime test = new DateTime("2004-06-09T12:24:48.501+01:00");
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66656);assertEquals(2004, test.getYear());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66657);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66658);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66659);assertEquals(12, test.getHourOfDay());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66660);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66661);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66662);assertEquals(501, test.getMillisOfSecond());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66663);assertEquals(LONDON, test.getZone());
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testGetDateTime2() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1scfmje1ffs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDateTime2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66664,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1scfmje1ffs() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66664);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66665);DateTime test = new DateTime("2004-06-09T12:24:48.501");
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66666);assertEquals(2004, test.getYear());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66667);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66668);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66669);assertEquals(12, test.getHourOfDay());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66670);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66671);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66672);assertEquals(501, test.getMillisOfSecond());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66673);assertEquals(LONDON, test.getZone());
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testGetDateTime3() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vlflbv1fg2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDateTime3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vlflbv1fg2() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66674);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66675);DateTime test = new DateTime("2004-06-09T12:24:48.501+02:00", PARIS);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66676);assertEquals(2004, test.getYear());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66677);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66678);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66679);assertEquals(12, test.getHourOfDay());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66680);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66681);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66682);assertEquals(501, test.getMillisOfSecond());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66683);assertEquals(PARIS, test.getZone());
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testGetDateTime4() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yufk4c1fgc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDateTime4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yufk4c1fgc() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66684);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66685);DateTime test = new DateTime("2004-06-09T12:24:48.501", PARIS);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66686);assertEquals(2004, test.getYear());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66687);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66688);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66689);assertEquals(12, test.getHourOfDay());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66690);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66691);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66692);assertEquals(501, test.getMillisOfSecond());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66693);assertEquals(PARIS, test.getZone());
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testGetDateTime5() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxoj2b1fgm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDateTime5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxoj2b1fgm() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66694);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66695);DateTime test = new DateTime("2004-06-09T12:24:48.501+02:00", JulianChronology.getInstance(PARIS));
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66696);assertEquals(2004, test.getYear());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66697);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66698);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66699);assertEquals(12, test.getHourOfDay());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66700);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66701);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66702);assertEquals(501, test.getMillisOfSecond());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66703);assertEquals(PARIS, test.getZone());
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testGetDateTime6() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1took9u1fgw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDateTime6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1took9u1fgw() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66704);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66705);DateTime test = new DateTime("2004-06-09T12:24:48.501", JulianChronology.getInstance(PARIS));
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66706);assertEquals(2004, test.getYear());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66707);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66708);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66709);assertEquals(12, test.getHourOfDay());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66710);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66711);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66712);assertEquals(501, test.getMillisOfSecond());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66713);assertEquals(PARIS, test.getZone());
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetDurationMillis_Object1() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tjw7bs1fh6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDurationMillis_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66714,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tjw7bs1fh6() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66714);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66715);long millis = StringConverter.INSTANCE.getDurationMillis("PT12.345S");
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66716);assertEquals(12345, millis);

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66717);millis = StringConverter.INSTANCE.getDurationMillis("pt12.345s");
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66718);assertEquals(12345, millis);

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66719);millis = StringConverter.INSTANCE.getDurationMillis("pt12s");
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66720);assertEquals(12000, millis);

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66721);millis = StringConverter.INSTANCE.getDurationMillis("pt12.s");
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66722);assertEquals(12000, millis);

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66723);millis = StringConverter.INSTANCE.getDurationMillis("pt-12.32s");
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66724);assertEquals(-12320, millis);

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66725);millis = StringConverter.INSTANCE.getDurationMillis("pt-0.32s");
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66726);assertEquals(-320, millis);

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66727);millis = StringConverter.INSTANCE.getDurationMillis("pt-0.0s");
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66728);assertEquals(0, millis);

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66729);millis = StringConverter.INSTANCE.getDurationMillis("pt0.0s");
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66730);assertEquals(0, millis);

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66731);millis = StringConverter.INSTANCE.getDurationMillis("pt12.3456s");
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66732);assertEquals(12345, millis);
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testGetDurationMillis_Object2() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wsw6491fhp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDurationMillis_Object2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wsw6491fhp() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66733);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66734);try {
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66735);StringConverter.INSTANCE.getDurationMillis("P2Y6M9DXYZ");
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66736);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66737);try {
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66738);StringConverter.INSTANCE.getDurationMillis("PTS");
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66739);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66740);try {
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66741);StringConverter.INSTANCE.getDurationMillis("XT0S");
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66742);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66743);try {
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66744);StringConverter.INSTANCE.getDurationMillis("PX0S");
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66745);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66746);try {
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66747);StringConverter.INSTANCE.getDurationMillis("PT0X");
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66748);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66749);try {
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66750);StringConverter.INSTANCE.getDurationMillis("PTXS");
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66751);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66752);try {
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66753);StringConverter.INSTANCE.getDurationMillis("PT0.0.0S");
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66754);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66755);try {
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66756);StringConverter.INSTANCE.getDurationMillis("PT0-00S");
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66757);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66758);try {
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66759);StringConverter.INSTANCE.getDurationMillis("PT-.001S");
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66760);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetPeriodType_Object() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nzp2xm1fih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetPeriodType_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nzp2xm1fih() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66761);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66762);assertEquals(PeriodType.standard(),
                StringConverter.INSTANCE.getPeriodType("P2Y6M9D"));
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testSetIntoPeriod_Object1() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oyzab91fij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oyzab91fij() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66763);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66764);MutablePeriod m = new MutablePeriod(PeriodType.yearMonthDayTime());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66765);StringConverter.INSTANCE.setInto(m, "P2Y6M9DT12H24M48S", null);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66766);assertEquals(2, m.getYears());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66767);assertEquals(6, m.getMonths());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66768);assertEquals(9, m.getDays());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66769);assertEquals(12, m.getHours());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66770);assertEquals(24, m.getMinutes());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66771);assertEquals(48, m.getSeconds());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66772);assertEquals(0, m.getMillis());
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testSetIntoPeriod_Object2() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lpzbis1fit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lpzbis1fit() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66773);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66774);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66775);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M48S", null);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66776);assertEquals(2, m.getYears());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66777);assertEquals(4, m.getWeeks());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66778);assertEquals(3, m.getDays());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66779);assertEquals(12, m.getHours());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66780);assertEquals(24, m.getMinutes());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66781);assertEquals(48, m.getSeconds());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66782);assertEquals(0, m.getMillis());
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testSetIntoPeriod_Object3() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1igzcqb1fj3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1igzcqb1fj3() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66783);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66784);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66785);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M48.034S", null);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66786);assertEquals(2, m.getYears());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66787);assertEquals(4, m.getWeeks());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66788);assertEquals(3, m.getDays());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66789);assertEquals(12, m.getHours());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66790);assertEquals(24, m.getMinutes());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66791);assertEquals(48, m.getSeconds());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66792);assertEquals(34, m.getMillis());
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testSetIntoPeriod_Object4() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f7zdxu1fjd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f7zdxu1fjd() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66793);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66794);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66795);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M.056S", null);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66796);assertEquals(2, m.getYears());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66797);assertEquals(4, m.getWeeks());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66798);assertEquals(3, m.getDays());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66799);assertEquals(12, m.getHours());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66800);assertEquals(24, m.getMinutes());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66801);assertEquals(0, m.getSeconds());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66802);assertEquals(56, m.getMillis());
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testSetIntoPeriod_Object5() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1byzf5d1fjn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1byzf5d1fjn() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66803);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66804);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66805);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M56.S", null);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66806);assertEquals(2, m.getYears());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66807);assertEquals(4, m.getWeeks());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66808);assertEquals(3, m.getDays());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66809);assertEquals(12, m.getHours());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66810);assertEquals(24, m.getMinutes());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66811);assertEquals(56, m.getSeconds());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66812);assertEquals(0, m.getMillis());
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testSetIntoPeriod_Object6() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18pzgcw1fjx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66813,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18pzgcw1fjx() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66813);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66814);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66815);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M56.1234567S", null);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66816);assertEquals(2, m.getYears());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66817);assertEquals(4, m.getWeeks());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66818);assertEquals(3, m.getDays());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66819);assertEquals(12, m.getHours());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66820);assertEquals(24, m.getMinutes());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66821);assertEquals(56, m.getSeconds());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66822);assertEquals(123, m.getMillis());
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testSetIntoPeriod_Object7() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gzhkf1fk7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66823,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gzhkf1fk7() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66823);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66824);MutablePeriod m = new MutablePeriod(1, 0, 1, 1, 1, 1, 1, 1, PeriodType.yearWeekDayTime());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66825);StringConverter.INSTANCE.setInto(m, "P2Y4W3D", null);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66826);assertEquals(2, m.getYears());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66827);assertEquals(4, m.getWeeks());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66828);assertEquals(3, m.getDays());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66829);assertEquals(0, m.getHours());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66830);assertEquals(0, m.getMinutes());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66831);assertEquals(0, m.getSeconds());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66832);assertEquals(0, m.getMillis());
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testSetIntoPeriod_Object8() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_127ziry1fkh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_127ziry1fkh() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66833);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66834);MutablePeriod m = new MutablePeriod();
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66835);try {
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66836);StringConverter.INSTANCE.setInto(m, "", null);
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66837);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66838);try {
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66839);StringConverter.INSTANCE.setInto(m, "PXY", null);
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66840);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11f9e1f9elgchosrb.R.inc(66841);try {
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66842);StringConverter.INSTANCE.setInto(m, "PT0SXY", null);
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66843);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66844);try {
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66845);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M48SX", null);
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66846);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsReadableInterval_Object_Chronology() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p8udfz1fkv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testIsReadableInterval_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p8udfz1fkv() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66847);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66848);assertEquals(false, StringConverter.INSTANCE.isReadableInterval("", null));
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testSetIntoInterval_Object_Chronology1() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ecvf9y1fkx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ecvf9y1fkx() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66849);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66850);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66851);StringConverter.INSTANCE.setInto(m, "2004-06-09/P1Y2M", null);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66852);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), m.getStart());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66853);assertEquals(new DateTime(2005, 8, 9, 0, 0, 0, 0), m.getEnd());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66854);assertEquals(ISOChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testSetIntoInterval_Object_Chronology2() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b3vghh1fl3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b3vghh1fl3() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66855);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66856);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66857);StringConverter.INSTANCE.setInto(m, "P1Y2M/2004-06-09", null);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66858);assertEquals(new DateTime(2003, 4, 9, 0, 0, 0, 0), m.getStart());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66859);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), m.getEnd());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66860);assertEquals(ISOChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testSetIntoInterval_Object_Chronology3() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17uvhp01fl9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17uvhp01fl9() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66861);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66862);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66863);StringConverter.INSTANCE.setInto(m, "2003-08-09/2004-06-09", null);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66864);assertEquals(new DateTime(2003, 8, 9, 0, 0, 0, 0), m.getStart());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66865);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), m.getEnd());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66866);assertEquals(ISOChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testSetIntoInterval_Object_Chronology4() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14lviwj1flf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14lviwj1flf() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66867);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66868);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66869);StringConverter.INSTANCE.setInto(m, "2004-06-09T+06:00/P1Y2M", null);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66870);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0, SIX).withChronology(null), m.getStart());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66871);assertEquals(new DateTime(2005, 8, 9, 0, 0, 0, 0, SIX).withChronology(null), m.getEnd());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66872);assertEquals(ISOChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testSetIntoInterval_Object_Chronology5() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11cvk421fll();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11cvk421fll() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66873);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66874);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66875);StringConverter.INSTANCE.setInto(m, "P1Y2M/2004-06-09T+06:00", null);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66876);assertEquals(new DateTime(2003, 4, 9, 0, 0, 0, 0, SIX).withChronology(null), m.getStart());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66877);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0, SIX).withChronology(null), m.getEnd());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66878);assertEquals(ISOChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testSetIntoInterval_Object_Chronology6() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11w4eof1flr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11w4eof1flr() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66879);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66880);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66881);StringConverter.INSTANCE.setInto(m, "2003-08-09T+06:00/2004-06-09T+07:00", null);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66882);assertEquals(new DateTime(2003, 8, 9, 0, 0, 0, 0, SIX).withChronology(null), m.getStart());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66883);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0, SEVEN).withChronology(null), m.getEnd());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66884);assertEquals(ISOChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testSetIntoInterval_Object_Chronology7() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1554dgw1flx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1554dgw1flx() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66885);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66886);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66887);StringConverter.INSTANCE.setInto(m, "2003-08-09/2004-06-09", BuddhistChronology.getInstance());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66888);assertEquals(new DateTime(2003, 8, 9, 0, 0, 0, 0, BuddhistChronology.getInstance()), m.getStart());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66889);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0, BuddhistChronology.getInstance()), m.getEnd());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66890);assertEquals(BuddhistChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testSetIntoInterval_Object_Chronology8() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18e4c9d1fm3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18e4c9d1fm3() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66891);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66892);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66893);StringConverter.INSTANCE.setInto(m, "2003-08-09T+06:00/2004-06-09T+07:00", BuddhistChronology.getInstance(EIGHT));
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66894);assertEquals(new DateTime(2003, 8, 9, 0, 0, 0, 0, BuddhistChronology.getInstance(SIX)).withZone(EIGHT), m.getStart());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66895);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0, BuddhistChronology.getInstance(SEVEN)).withZone(EIGHT), m.getEnd());
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66896);assertEquals(BuddhistChronology.getInstance(EIGHT), m.getChronology());
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testSetIntoIntervalEx_Object_Chronology1() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mdcyqf1fm9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mdcyqf1fm9() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66897);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66898);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66899);try {
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66900);StringConverter.INSTANCE.setInto(m, "", null);
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66901);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testSetIntoIntervalEx_Object_Chronology2() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pmcxiw1fme();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66902,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pmcxiw1fme() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66902);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66903);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66904);try {
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66905);StringConverter.INSTANCE.setInto(m, "/", null);
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66906);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testSetIntoIntervalEx_Object_Chronology3() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svcwbd1fmj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svcwbd1fmj() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66907);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66908);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66909);try {
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66910);StringConverter.INSTANCE.setInto(m, "P1Y/", null);
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66911);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testSetIntoIntervalEx_Object_Chronology4() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w4cv3u1fmo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w4cv3u1fmo() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66912);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66913);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66914);try {
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66915);StringConverter.INSTANCE.setInto(m, "/P1Y", null);
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66916);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    @Test
    public void testSetIntoIntervalEx_Object_Chronology5() throws Exception {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zdctwb1fmt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zdctwb1fmt() throws Exception{try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66917);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66918);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66919);try {
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66920);StringConverter.INSTANCE.setInto(m, "P1Y/P2Y", null);
            __CLR4_4_11f9e1f9elgchosrb.R.inc(66921);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_11f9e1f9elgchosrb.R.globalSliceStart(getClass().getName(),66922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1fmy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9e1f9elgchosrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9e1f9elgchosrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1fmy(){try{__CLR4_4_11f9e1f9elgchosrb.R.inc(66922);
        __CLR4_4_11f9e1f9elgchosrb.R.inc(66923);assertEquals("Converter[java.lang.String]", StringConverter.INSTANCE.toString());
    }finally{__CLR4_4_11f9e1f9elgchosrb.R.flushNeeded();}}

}
