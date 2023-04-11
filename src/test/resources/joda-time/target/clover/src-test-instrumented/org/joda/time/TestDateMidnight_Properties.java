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

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 * @author Mike Schrag
 */
@SuppressWarnings("deprecation")
public class TestDateMidnight_Properties {static class __CLR4_4_1iqaiqalgchoria{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,24745,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

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

    public static void main(String[] args) throws Exception {try{__CLR4_4_1iqaiqalgchoria.R.inc(24274);
        __CLR4_4_1iqaiqalgchoria.R.inc(24275);TestDateMidnight_Properties TB = new TestDateMidnight_Properties();
        __CLR4_4_1iqaiqalgchoria.R.inc(24276);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24277);TB.testTest();
        __CLR4_4_1iqaiqalgchoria.R.inc(24278);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24279);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24280);TB.testPropertyGetEra();
        __CLR4_4_1iqaiqalgchoria.R.inc(24281);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24282);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24283);TB.testPropertyGetYearOfEra();
        __CLR4_4_1iqaiqalgchoria.R.inc(24284);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24285);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24286);TB.testPropertyGetCenturyOfEra();
        __CLR4_4_1iqaiqalgchoria.R.inc(24287);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24288);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24289);TB.testPropertyGetYearOfCentury();
        __CLR4_4_1iqaiqalgchoria.R.inc(24290);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24291);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24292);TB.testPropertyGetWeekyear();
        __CLR4_4_1iqaiqalgchoria.R.inc(24293);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24294);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24295);TB.testPropertyGetYear();
        __CLR4_4_1iqaiqalgchoria.R.inc(24296);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24297);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24298);TB.testPropertyGetMonthOfYear();
        __CLR4_4_1iqaiqalgchoria.R.inc(24299);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24300);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24301);TB.testPropertySetMonthOfYear();
        __CLR4_4_1iqaiqalgchoria.R.inc(24302);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24303);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24304);TB.testPropertySetTextMonthOfYear();
        __CLR4_4_1iqaiqalgchoria.R.inc(24305);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24306);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24307);TB.testPropertySetTextLocaleMonthOfYear();
        __CLR4_4_1iqaiqalgchoria.R.inc(24308);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24309);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24310);TB.testPropertyAddMonthOfYear();
        __CLR4_4_1iqaiqalgchoria.R.inc(24311);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24312);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24313);TB.testPropertyAddLongMonthOfYear();
        __CLR4_4_1iqaiqalgchoria.R.inc(24314);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24315);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24316);TB.testPropertyAddWrapFieldMonthOfYear();
        __CLR4_4_1iqaiqalgchoria.R.inc(24317);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24318);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24319);TB.testPropertyGetDifferenceMonthOfYear();
        __CLR4_4_1iqaiqalgchoria.R.inc(24320);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24321);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24322);TB.testPropertyRoundFloorMonthOfYear();
        __CLR4_4_1iqaiqalgchoria.R.inc(24323);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24324);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24325);TB.testPropertyRoundCeilingMonthOfYear();
        __CLR4_4_1iqaiqalgchoria.R.inc(24326);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24327);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24328);TB.testPropertyRoundHalfFloorMonthOfYear();
        __CLR4_4_1iqaiqalgchoria.R.inc(24329);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24330);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24331);TB.testPropertyRoundHalfCeilingMonthOfYear();
        __CLR4_4_1iqaiqalgchoria.R.inc(24332);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24333);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24334);TB.testPropertyRoundHalfEvenMonthOfYear();
        __CLR4_4_1iqaiqalgchoria.R.inc(24335);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24336);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24337);TB.testPropertyRemainderMonthOfYear();
        __CLR4_4_1iqaiqalgchoria.R.inc(24338);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24339);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24340);TB.testPropertyGetDayOfMonth();
        __CLR4_4_1iqaiqalgchoria.R.inc(24341);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24342);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24343);TB.testPropertyWithMaximumValueDayOfMonth();
        __CLR4_4_1iqaiqalgchoria.R.inc(24344);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24345);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24346);TB.testPropertyWithMinimumValueDayOfMonth();
        __CLR4_4_1iqaiqalgchoria.R.inc(24347);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24348);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24349);TB.testPropertyGetDayOfYear();
        __CLR4_4_1iqaiqalgchoria.R.inc(24350);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24351);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24352);TB.testPropertyGetWeekOfWeekyear();
        __CLR4_4_1iqaiqalgchoria.R.inc(24353);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24354);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24355);TB.testPropertyGetDayOfWeek();
        __CLR4_4_1iqaiqalgchoria.R.inc(24356);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24357);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24358);TB.testPropertyToIntervalYearOfEra();
        __CLR4_4_1iqaiqalgchoria.R.inc(24359);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24360);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24361);TB.testPropertyToIntervalYearOfCentury();
        __CLR4_4_1iqaiqalgchoria.R.inc(24362);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24363);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24364);TB.testPropertyToIntervalYear();
        __CLR4_4_1iqaiqalgchoria.R.inc(24365);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24366);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24367);TB.testPropertyToIntervalMonthOfYear();
        __CLR4_4_1iqaiqalgchoria.R.inc(24368);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24369);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24370);TB.testPropertyToIntervalDayOfMonth();
        __CLR4_4_1iqaiqalgchoria.R.inc(24371);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24372);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24373);TB.testPropertyEqualsHashCodeLenient();
        __CLR4_4_1iqaiqalgchoria.R.inc(24374);TB.tearDown();
        __CLR4_4_1iqaiqalgchoria.R.inc(24375);TB.setUp();
        __CLR4_4_1iqaiqalgchoria.R.inc(24376);TB.testPropertyEqualsHashCodeStrict();
        __CLR4_4_1iqaiqalgchoria.R.inc(24377);TB.tearDown();

    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestDateMidnight_Properties.class);
    }

    public TestDateMidnight_Properties(String name) {
        super(name);
    }
     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1iqaiqalgchoria.R.inc(24378);
        __CLR4_4_1iqaiqalgchoria.R.inc(24379);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1iqaiqalgchoria.R.inc(24380);zone = DateTimeZone.getDefault();
        __CLR4_4_1iqaiqalgchoria.R.inc(24381);locale = Locale.getDefault();
        __CLR4_4_1iqaiqalgchoria.R.inc(24382);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1iqaiqalgchoria.R.inc(24383);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1iqaiqalgchoria.R.inc(24384);
        __CLR4_4_1iqaiqalgchoria.R.inc(24385);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1iqaiqalgchoria.R.inc(24386);DateTimeZone.setDefault(zone);
        __CLR4_4_1iqaiqalgchoria.R.inc(24387);Locale.setDefault(locale);
        __CLR4_4_1iqaiqalgchoria.R.inc(24388);zone = null;
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjith();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24389,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjith(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24389);
        __CLR4_4_1iqaiqalgchoria.R.inc(24390);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1iqaiqalgchoria.R.inc(24391);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1iqaiqalgchoria.R.inc(24392);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetEra() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19gfrqkitl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24393,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19gfrqkitl(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24393);
        __CLR4_4_1iqaiqalgchoria.R.inc(24394);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24395);assertSame(test.getChronology().era(), test.era().getField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24396);assertEquals("era", test.era().getName());
        __CLR4_4_1iqaiqalgchoria.R.inc(24397);assertEquals("Property[era]", test.era().toString());
        __CLR4_4_1iqaiqalgchoria.R.inc(24398);assertSame(test, test.era().getDateMidnight());
        __CLR4_4_1iqaiqalgchoria.R.inc(24399);assertEquals(1, test.era().get());
        __CLR4_4_1iqaiqalgchoria.R.inc(24400);assertEquals("AD", test.era().getAsText());
        __CLR4_4_1iqaiqalgchoria.R.inc(24401);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24402);assertEquals("AD", test.era().getAsShortText());
        __CLR4_4_1iqaiqalgchoria.R.inc(24403);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24404);assertEquals(test.getChronology().eras(), test.era().getDurationField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24405);assertEquals(null, test.era().getRangeDurationField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24406);assertEquals(2, test.era().getMaximumTextLength(null));
        __CLR4_4_1iqaiqalgchoria.R.inc(24407);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24408);assertEquals(2, test.era().getMaximumShortTextLength(null));
        __CLR4_4_1iqaiqalgchoria.R.inc(24409);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH));
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetYearOfEra() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12tr0dkiu2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetYearOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24410,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12tr0dkiu2(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24410);
        __CLR4_4_1iqaiqalgchoria.R.inc(24411);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24412);assertSame(test.getChronology().yearOfEra(), test.yearOfEra().getField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24413);assertEquals("yearOfEra", test.yearOfEra().getName());
        __CLR4_4_1iqaiqalgchoria.R.inc(24414);assertEquals("Property[yearOfEra]", test.yearOfEra().toString());
        __CLR4_4_1iqaiqalgchoria.R.inc(24415);assertSame(test, test.yearOfEra().getDateMidnight());
        __CLR4_4_1iqaiqalgchoria.R.inc(24416);assertEquals(2004, test.yearOfEra().get());
        __CLR4_4_1iqaiqalgchoria.R.inc(24417);assertEquals("2004", test.yearOfEra().getAsText());
        __CLR4_4_1iqaiqalgchoria.R.inc(24418);assertEquals("2004", test.yearOfEra().getAsText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24419);assertEquals("2004", test.yearOfEra().getAsShortText());
        __CLR4_4_1iqaiqalgchoria.R.inc(24420);assertEquals("2004", test.yearOfEra().getAsShortText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24421);assertEquals(test.getChronology().years(), test.yearOfEra().getDurationField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24422);assertEquals(test.getChronology().eras(), test.yearOfEra().getRangeDurationField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24423);assertEquals(9, test.yearOfEra().getMaximumTextLength(null));
        __CLR4_4_1iqaiqalgchoria.R.inc(24424);assertEquals(9, test.yearOfEra().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetCenturyOfEra() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nozc5diuh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetCenturyOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nozc5diuh(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24425);
        __CLR4_4_1iqaiqalgchoria.R.inc(24426);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24427);assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24428);assertEquals("centuryOfEra", test.centuryOfEra().getName());
        __CLR4_4_1iqaiqalgchoria.R.inc(24429);assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString());
        __CLR4_4_1iqaiqalgchoria.R.inc(24430);assertSame(test, test.centuryOfEra().getDateMidnight());
        __CLR4_4_1iqaiqalgchoria.R.inc(24431);assertEquals(20, test.centuryOfEra().get());
        __CLR4_4_1iqaiqalgchoria.R.inc(24432);assertEquals("20", test.centuryOfEra().getAsText());
        __CLR4_4_1iqaiqalgchoria.R.inc(24433);assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24434);assertEquals("20", test.centuryOfEra().getAsShortText());
        __CLR4_4_1iqaiqalgchoria.R.inc(24435);assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24436);assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24437);assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24438);assertEquals(7, test.centuryOfEra().getMaximumTextLength(null));
        __CLR4_4_1iqaiqalgchoria.R.inc(24439);assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetYearOfCentury() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m6mt7ciuw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetYearOfCentury",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m6mt7ciuw(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24440);
        __CLR4_4_1iqaiqalgchoria.R.inc(24441);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24442);assertSame(test.getChronology().yearOfCentury(), test.yearOfCentury().getField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24443);assertEquals("yearOfCentury", test.yearOfCentury().getName());
        __CLR4_4_1iqaiqalgchoria.R.inc(24444);assertEquals("Property[yearOfCentury]", test.yearOfCentury().toString());
        __CLR4_4_1iqaiqalgchoria.R.inc(24445);assertSame(test, test.yearOfCentury().getDateMidnight());
        __CLR4_4_1iqaiqalgchoria.R.inc(24446);assertEquals(4, test.yearOfCentury().get());
        __CLR4_4_1iqaiqalgchoria.R.inc(24447);assertEquals("4", test.yearOfCentury().getAsText());
        __CLR4_4_1iqaiqalgchoria.R.inc(24448);assertEquals("4", test.yearOfCentury().getAsText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24449);assertEquals("4", test.yearOfCentury().getAsShortText());
        __CLR4_4_1iqaiqalgchoria.R.inc(24450);assertEquals("4", test.yearOfCentury().getAsShortText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24451);assertEquals(test.getChronology().years(), test.yearOfCentury().getDurationField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24452);assertEquals(test.getChronology().centuries(), test.yearOfCentury().getRangeDurationField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24453);assertEquals(2, test.yearOfCentury().getMaximumTextLength(null));
        __CLR4_4_1iqaiqalgchoria.R.inc(24454);assertEquals(2, test.yearOfCentury().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetWeekyear() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izv1ndivb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izv1ndivb(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24455);
        __CLR4_4_1iqaiqalgchoria.R.inc(24456);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24457);assertSame(test.getChronology().weekyear(), test.weekyear().getField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24458);assertEquals("weekyear", test.weekyear().getName());
        __CLR4_4_1iqaiqalgchoria.R.inc(24459);assertEquals("Property[weekyear]", test.weekyear().toString());
        __CLR4_4_1iqaiqalgchoria.R.inc(24460);assertSame(test, test.weekyear().getDateMidnight());
        __CLR4_4_1iqaiqalgchoria.R.inc(24461);assertEquals(2004, test.weekyear().get());
        __CLR4_4_1iqaiqalgchoria.R.inc(24462);assertEquals("2004", test.weekyear().getAsText());
        __CLR4_4_1iqaiqalgchoria.R.inc(24463);assertEquals("2004", test.weekyear().getAsText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24464);assertEquals("2004", test.weekyear().getAsShortText());
        __CLR4_4_1iqaiqalgchoria.R.inc(24465);assertEquals("2004", test.weekyear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24466);assertEquals(test.getChronology().weekyears(), test.weekyear().getDurationField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24467);assertEquals(null, test.weekyear().getRangeDurationField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24468);assertEquals(9, test.weekyear().getMaximumTextLength(null));
        __CLR4_4_1iqaiqalgchoria.R.inc(24469);assertEquals(9, test.weekyear().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetYear() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgqcqbivq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24470,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgqcqbivq(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24470);
        __CLR4_4_1iqaiqalgchoria.R.inc(24471);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24472);assertSame(test.getChronology().year(), test.year().getField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24473);assertEquals("year", test.year().getName());
        __CLR4_4_1iqaiqalgchoria.R.inc(24474);assertEquals("Property[year]", test.year().toString());
        __CLR4_4_1iqaiqalgchoria.R.inc(24475);assertSame(test, test.year().getDateMidnight());
        __CLR4_4_1iqaiqalgchoria.R.inc(24476);assertEquals(2004, test.year().get());
        __CLR4_4_1iqaiqalgchoria.R.inc(24477);assertEquals("2004", test.year().getAsText());
        __CLR4_4_1iqaiqalgchoria.R.inc(24478);assertEquals("2004", test.year().getAsText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24479);assertEquals("2004", test.year().getAsShortText());
        __CLR4_4_1iqaiqalgchoria.R.inc(24480);assertEquals("2004", test.year().getAsShortText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24481);assertEquals(test.getChronology().years(), test.year().getDurationField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24482);assertEquals(null, test.year().getRangeDurationField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24483);assertEquals(9, test.year().getMaximumTextLength(null));
        __CLR4_4_1iqaiqalgchoria.R.inc(24484);assertEquals(9, test.year().getMaximumShortTextLength(null));
        __CLR4_4_1iqaiqalgchoria.R.inc(24485);assertEquals(-292275054, test.year().getMinimumValue());
        __CLR4_4_1iqaiqalgchoria.R.inc(24486);assertEquals(-292275054, test.year().getMinimumValueOverall());
        __CLR4_4_1iqaiqalgchoria.R.inc(24487);assertEquals(292278993, test.year().getMaximumValue());
        __CLR4_4_1iqaiqalgchoria.R.inc(24488);assertEquals(292278993, test.year().getMaximumValueOverall());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetMonthOfYear() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_140q40kiw9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24489,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_140q40kiw9(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24489);
        __CLR4_4_1iqaiqalgchoria.R.inc(24490);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24491);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24492);assertEquals("monthOfYear", test.monthOfYear().getName());
        __CLR4_4_1iqaiqalgchoria.R.inc(24493);assertEquals("Property[monthOfYear]", test.monthOfYear().toString());
        __CLR4_4_1iqaiqalgchoria.R.inc(24494);assertSame(test, test.monthOfYear().getDateMidnight());
        __CLR4_4_1iqaiqalgchoria.R.inc(24495);assertEquals(6, test.monthOfYear().get());
        __CLR4_4_1iqaiqalgchoria.R.inc(24496);assertEquals("6", test.monthOfYear().getAsString());
        __CLR4_4_1iqaiqalgchoria.R.inc(24497);assertEquals("June", test.monthOfYear().getAsText());
        __CLR4_4_1iqaiqalgchoria.R.inc(24498);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24499);assertEquals("Jun", test.monthOfYear().getAsShortText());
        __CLR4_4_1iqaiqalgchoria.R.inc(24500);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24501);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24502);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24503);assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
        __CLR4_4_1iqaiqalgchoria.R.inc(24504);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
        __CLR4_4_1iqaiqalgchoria.R.inc(24505);test = new DateMidnight(2004, 7, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24506);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24507);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24508);assertEquals(1, test.monthOfYear().getMinimumValue());
        __CLR4_4_1iqaiqalgchoria.R.inc(24509);assertEquals(1, test.monthOfYear().getMinimumValueOverall());
        __CLR4_4_1iqaiqalgchoria.R.inc(24510);assertEquals(12, test.monthOfYear().getMaximumValue());
        __CLR4_4_1iqaiqalgchoria.R.inc(24511);assertEquals(12, test.monthOfYear().getMaximumValueOverall());
        __CLR4_4_1iqaiqalgchoria.R.inc(24512);assertEquals(1, test.monthOfYear().getMinimumValue());
        __CLR4_4_1iqaiqalgchoria.R.inc(24513);assertEquals(1, test.monthOfYear().getMinimumValueOverall());
        __CLR4_4_1iqaiqalgchoria.R.inc(24514);assertEquals(12, test.monthOfYear().getMaximumValue());
        __CLR4_4_1iqaiqalgchoria.R.inc(24515);assertEquals(12, test.monthOfYear().getMaximumValueOverall());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    @Test
    public void testPropertySetMonthOfYear() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x2imu8ix0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertySetMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x2imu8ix0(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24516);
        __CLR4_4_1iqaiqalgchoria.R.inc(24517);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24518);DateMidnight copy = test.monthOfYear().setCopy(8);
        __CLR4_4_1iqaiqalgchoria.R.inc(24519);assertEquals(2004, copy.getYear());
        __CLR4_4_1iqaiqalgchoria.R.inc(24520);assertEquals(8, copy.getMonthOfYear());
        __CLR4_4_1iqaiqalgchoria.R.inc(24521);assertEquals(9, copy.getDayOfMonth());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    @Test
    public void testPropertySetTextMonthOfYear() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kzotlfix6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertySetTextMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kzotlfix6(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24522);
        __CLR4_4_1iqaiqalgchoria.R.inc(24523);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24524);DateMidnight copy = test.monthOfYear().setCopy("8");
        __CLR4_4_1iqaiqalgchoria.R.inc(24525);assertEquals(2004, copy.getYear());
        __CLR4_4_1iqaiqalgchoria.R.inc(24526);assertEquals(8, copy.getMonthOfYear());
        __CLR4_4_1iqaiqalgchoria.R.inc(24527);assertEquals(9, copy.getDayOfMonth());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    @Test
    public void testPropertySetTextLocaleMonthOfYear() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yfg7yxixc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertySetTextLocaleMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yfg7yxixc(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24528);
        __CLR4_4_1iqaiqalgchoria.R.inc(24529);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24530);DateMidnight copy = test.monthOfYear().setCopy("mars", Locale.FRENCH);
        __CLR4_4_1iqaiqalgchoria.R.inc(24531);assertEquals(2004, copy.getYear());
        __CLR4_4_1iqaiqalgchoria.R.inc(24532);assertEquals(3, copy.getMonthOfYear());
        __CLR4_4_1iqaiqalgchoria.R.inc(24533);assertEquals(9, copy.getDayOfMonth());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    @Test
    public void testPropertyAddMonthOfYear() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cfd7jixi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyAddMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cfd7jixi(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24534);
        __CLR4_4_1iqaiqalgchoria.R.inc(24535);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24536);DateMidnight copy = test.monthOfYear().addToCopy(8);
        __CLR4_4_1iqaiqalgchoria.R.inc(24537);assertEquals(2005, copy.getYear());
        __CLR4_4_1iqaiqalgchoria.R.inc(24538);assertEquals(2, copy.getMonthOfYear());
        __CLR4_4_1iqaiqalgchoria.R.inc(24539);assertEquals(9, copy.getDayOfMonth());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    @Test
    public void testPropertyAddLongMonthOfYear() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x3wc05ixo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyAddLongMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x3wc05ixo(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24540);
        __CLR4_4_1iqaiqalgchoria.R.inc(24541);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24542);DateMidnight copy = test.monthOfYear().addToCopy(8L);
        __CLR4_4_1iqaiqalgchoria.R.inc(24543);assertEquals(2005, copy.getYear());
        __CLR4_4_1iqaiqalgchoria.R.inc(24544);assertEquals(2, copy.getMonthOfYear());
        __CLR4_4_1iqaiqalgchoria.R.inc(24545);assertEquals(9, copy.getDayOfMonth());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldMonthOfYear() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1phvuslixu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyAddWrapFieldMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1phvuslixu(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24546);
        __CLR4_4_1iqaiqalgchoria.R.inc(24547);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24548);DateMidnight copy = test.monthOfYear().addWrapFieldToCopy(8);
        __CLR4_4_1iqaiqalgchoria.R.inc(24549);assertEquals(2004, copy.getYear());
        __CLR4_4_1iqaiqalgchoria.R.inc(24550);assertEquals(2, copy.getMonthOfYear());
        __CLR4_4_1iqaiqalgchoria.R.inc(24551);assertEquals(9, copy.getDayOfMonth());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    @Test
    public void testPropertyGetDifferenceMonthOfYear() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17u7nyniy0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetDifferenceMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17u7nyniy0(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24552);
        __CLR4_4_1iqaiqalgchoria.R.inc(24553);DateMidnight test1 = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24554);DateMidnight test2 = new DateMidnight(2004, 8, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24555);assertEquals(-2, test1.monthOfYear().getDifference(test2));
        __CLR4_4_1iqaiqalgchoria.R.inc(24556);assertEquals(2, test2.monthOfYear().getDifference(test1));
        __CLR4_4_1iqaiqalgchoria.R.inc(24557);assertEquals(-2L, test1.monthOfYear().getDifferenceAsLong(test2));
        __CLR4_4_1iqaiqalgchoria.R.inc(24558);assertEquals(2L, test2.monthOfYear().getDifferenceAsLong(test1));
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    @Test
    public void testPropertyRoundFloorMonthOfYear() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ofqj5iiy7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundFloorMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ofqj5iiy7(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24559);
        __CLR4_4_1iqaiqalgchoria.R.inc(24560);DateMidnight test = new DateMidnight(2004, 6, 16);
        __CLR4_4_1iqaiqalgchoria.R.inc(24561);DateMidnight copy = test.monthOfYear().roundFloorCopy();
        __CLR4_4_1iqaiqalgchoria.R.inc(24562);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    @Test
    public void testPropertyRoundCeilingMonthOfYear() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h82dtxiyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundCeilingMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24563,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h82dtxiyb(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24563);
        __CLR4_4_1iqaiqalgchoria.R.inc(24564);DateMidnight test = new DateMidnight(2004, 6, 16);
        __CLR4_4_1iqaiqalgchoria.R.inc(24565);DateMidnight copy = test.monthOfYear().roundCeilingCopy();
        __CLR4_4_1iqaiqalgchoria.R.inc(24566);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    @Test
    public void testPropertyRoundHalfFloorMonthOfYear() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i6z9bdiyf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundHalfFloorMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i6z9bdiyf(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24567);
        __CLR4_4_1iqaiqalgchoria.R.inc(24568);DateMidnight test = new DateMidnight(2004, 6, 16);
        __CLR4_4_1iqaiqalgchoria.R.inc(24569);DateMidnight copy = test.monthOfYear().roundHalfFloorCopy();
        __CLR4_4_1iqaiqalgchoria.R.inc(24570);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1iqaiqalgchoria.R.inc(24571);test = new DateMidnight(2004, 6, 17);
        __CLR4_4_1iqaiqalgchoria.R.inc(24572);copy = test.monthOfYear().roundHalfFloorCopy();
        __CLR4_4_1iqaiqalgchoria.R.inc(24573);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1iqaiqalgchoria.R.inc(24574);test = new DateMidnight(2004, 6, 15);
        __CLR4_4_1iqaiqalgchoria.R.inc(24575);copy = test.monthOfYear().roundHalfFloorCopy();
        __CLR4_4_1iqaiqalgchoria.R.inc(24576);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    @Test
    public void testPropertyRoundHalfCeilingMonthOfYear() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fyils8iyp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundHalfCeilingMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24577,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fyils8iyp(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24577);
        __CLR4_4_1iqaiqalgchoria.R.inc(24578);DateMidnight test = new DateMidnight(2004, 6, 16);
        __CLR4_4_1iqaiqalgchoria.R.inc(24579);DateMidnight copy = test.monthOfYear().roundHalfCeilingCopy();
        __CLR4_4_1iqaiqalgchoria.R.inc(24580);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1iqaiqalgchoria.R.inc(24581);test = new DateMidnight(2004, 6, 17);
        __CLR4_4_1iqaiqalgchoria.R.inc(24582);copy = test.monthOfYear().roundHalfCeilingCopy();
        __CLR4_4_1iqaiqalgchoria.R.inc(24583);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1iqaiqalgchoria.R.inc(24584);test = new DateMidnight(2004, 6, 15);
        __CLR4_4_1iqaiqalgchoria.R.inc(24585);copy = test.monthOfYear().roundHalfCeilingCopy();
        __CLR4_4_1iqaiqalgchoria.R.inc(24586);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    @Test
    public void testPropertyRoundHalfEvenMonthOfYear() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c7xynbiyz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundHalfEvenMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24587,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c7xynbiyz(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24587);
        __CLR4_4_1iqaiqalgchoria.R.inc(24588);DateMidnight test = new DateMidnight(2004, 6, 16);
        __CLR4_4_1iqaiqalgchoria.R.inc(24589);DateMidnight copy = test.monthOfYear().roundHalfEvenCopy();
        __CLR4_4_1iqaiqalgchoria.R.inc(24590);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1iqaiqalgchoria.R.inc(24591);test = new DateMidnight(2004, 9, 16);
        __CLR4_4_1iqaiqalgchoria.R.inc(24592);copy = test.monthOfYear().roundHalfEvenCopy();
        __CLR4_4_1iqaiqalgchoria.R.inc(24593);assertEquals("2004-10-01T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1iqaiqalgchoria.R.inc(24594);test = new DateMidnight(2004, 6, 17);
        __CLR4_4_1iqaiqalgchoria.R.inc(24595);copy = test.monthOfYear().roundHalfEvenCopy();
        __CLR4_4_1iqaiqalgchoria.R.inc(24596);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1iqaiqalgchoria.R.inc(24597);test = new DateMidnight(2004, 6, 15);
        __CLR4_4_1iqaiqalgchoria.R.inc(24598);copy = test.monthOfYear().roundHalfEvenCopy();
        __CLR4_4_1iqaiqalgchoria.R.inc(24599);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    @Test
    public void testPropertyRemainderMonthOfYear() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3jhjxizc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRemainderMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24600,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3jhjxizc(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24600);
        __CLR4_4_1iqaiqalgchoria.R.inc(24601);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24602);assertEquals((9L - 1L) * DateTimeConstants.MILLIS_PER_DAY, test.monthOfYear().remainder());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetDayOfMonth() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1198qu5izf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1198qu5izf(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24603);
        __CLR4_4_1iqaiqalgchoria.R.inc(24604);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24605);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24606);assertEquals("dayOfMonth", test.dayOfMonth().getName());
        __CLR4_4_1iqaiqalgchoria.R.inc(24607);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString());
        __CLR4_4_1iqaiqalgchoria.R.inc(24608);assertSame(test, test.dayOfMonth().getDateMidnight());
        __CLR4_4_1iqaiqalgchoria.R.inc(24609);assertEquals(9, test.dayOfMonth().get());
        __CLR4_4_1iqaiqalgchoria.R.inc(24610);assertEquals("9", test.dayOfMonth().getAsText());
        __CLR4_4_1iqaiqalgchoria.R.inc(24611);assertEquals("9", test.dayOfMonth().getAsText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24612);assertEquals("9", test.dayOfMonth().getAsShortText());
        __CLR4_4_1iqaiqalgchoria.R.inc(24613);assertEquals("9", test.dayOfMonth().getAsShortText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24614);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24615);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24616);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null));
        __CLR4_4_1iqaiqalgchoria.R.inc(24617);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null));
        __CLR4_4_1iqaiqalgchoria.R.inc(24618);assertEquals(1, test.dayOfMonth().getMinimumValue());
        __CLR4_4_1iqaiqalgchoria.R.inc(24619);assertEquals(1, test.dayOfMonth().getMinimumValueOverall());
        __CLR4_4_1iqaiqalgchoria.R.inc(24620);assertEquals(30, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1iqaiqalgchoria.R.inc(24621);assertEquals(31, test.dayOfMonth().getMaximumValueOverall());
        __CLR4_4_1iqaiqalgchoria.R.inc(24622);assertEquals(false, test.dayOfMonth().isLeap());
        __CLR4_4_1iqaiqalgchoria.R.inc(24623);assertEquals(0, test.dayOfMonth().getLeapAmount());
        __CLR4_4_1iqaiqalgchoria.R.inc(24624);assertEquals(null, test.dayOfMonth().getLeapDurationField());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    @Test
    public void testPropertyWithMaximumValueDayOfMonth() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2wa9ej01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyWithMaximumValueDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24625,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2wa9ej01(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24625);
        __CLR4_4_1iqaiqalgchoria.R.inc(24626);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24627);DateMidnight copy = test.dayOfMonth().withMaximumValue();
        __CLR4_4_1iqaiqalgchoria.R.inc(24628);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1iqaiqalgchoria.R.inc(24629);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    @Test
    public void testPropertyWithMinimumValueDayOfMonth() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1duofekj06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyWithMinimumValueDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1duofekj06(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24630);
        __CLR4_4_1iqaiqalgchoria.R.inc(24631);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24632);DateMidnight copy = test.dayOfMonth().withMinimumValue();
        __CLR4_4_1iqaiqalgchoria.R.inc(24633);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1iqaiqalgchoria.R.inc(24634);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetDayOfYear() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fvk08j0b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fvk08j0b(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24635);
        // 31+29+31+30+31+9 = 161
        __CLR4_4_1iqaiqalgchoria.R.inc(24636);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24637);assertSame(test.getChronology().dayOfYear(), test.dayOfYear().getField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24638);assertEquals("dayOfYear", test.dayOfYear().getName());
        __CLR4_4_1iqaiqalgchoria.R.inc(24639);assertEquals("Property[dayOfYear]", test.dayOfYear().toString());
        __CLR4_4_1iqaiqalgchoria.R.inc(24640);assertSame(test, test.dayOfYear().getDateMidnight());
        __CLR4_4_1iqaiqalgchoria.R.inc(24641);assertEquals(161, test.dayOfYear().get());
        __CLR4_4_1iqaiqalgchoria.R.inc(24642);assertEquals("161", test.dayOfYear().getAsText());
        __CLR4_4_1iqaiqalgchoria.R.inc(24643);assertEquals("161", test.dayOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24644);assertEquals("161", test.dayOfYear().getAsShortText());
        __CLR4_4_1iqaiqalgchoria.R.inc(24645);assertEquals("161", test.dayOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24646);assertEquals(test.getChronology().days(), test.dayOfYear().getDurationField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24647);assertEquals(test.getChronology().years(), test.dayOfYear().getRangeDurationField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24648);assertEquals(3, test.dayOfYear().getMaximumTextLength(null));
        __CLR4_4_1iqaiqalgchoria.R.inc(24649);assertEquals(3, test.dayOfYear().getMaximumShortTextLength(null));
        __CLR4_4_1iqaiqalgchoria.R.inc(24650);assertEquals(false, test.dayOfYear().isLeap());
        __CLR4_4_1iqaiqalgchoria.R.inc(24651);assertEquals(0, test.dayOfYear().getLeapAmount());
        __CLR4_4_1iqaiqalgchoria.R.inc(24652);assertEquals(null, test.dayOfYear().getLeapDurationField());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetWeekOfWeekyear() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oty2c2j0t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24653,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oty2c2j0t(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24653);
        __CLR4_4_1iqaiqalgchoria.R.inc(24654);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24655);assertSame(test.getChronology().weekOfWeekyear(), test.weekOfWeekyear().getField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24656);assertEquals("weekOfWeekyear", test.weekOfWeekyear().getName());
        __CLR4_4_1iqaiqalgchoria.R.inc(24657);assertEquals("Property[weekOfWeekyear]", test.weekOfWeekyear().toString());
        __CLR4_4_1iqaiqalgchoria.R.inc(24658);assertSame(test, test.weekOfWeekyear().getDateMidnight());
        __CLR4_4_1iqaiqalgchoria.R.inc(24659);assertEquals(24, test.weekOfWeekyear().get());
        __CLR4_4_1iqaiqalgchoria.R.inc(24660);assertEquals("24", test.weekOfWeekyear().getAsText());
        __CLR4_4_1iqaiqalgchoria.R.inc(24661);assertEquals("24", test.weekOfWeekyear().getAsText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24662);assertEquals("24", test.weekOfWeekyear().getAsShortText());
        __CLR4_4_1iqaiqalgchoria.R.inc(24663);assertEquals("24", test.weekOfWeekyear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24664);assertEquals(test.getChronology().weeks(), test.weekOfWeekyear().getDurationField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24665);assertEquals(test.getChronology().weekyears(), test.weekOfWeekyear().getRangeDurationField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24666);assertEquals(2, test.weekOfWeekyear().getMaximumTextLength(null));
        __CLR4_4_1iqaiqalgchoria.R.inc(24667);assertEquals(2, test.weekOfWeekyear().getMaximumShortTextLength(null));
        __CLR4_4_1iqaiqalgchoria.R.inc(24668);assertEquals(false, test.weekOfWeekyear().isLeap());
        __CLR4_4_1iqaiqalgchoria.R.inc(24669);assertEquals(0, test.weekOfWeekyear().getLeapAmount());
        __CLR4_4_1iqaiqalgchoria.R.inc(24670);assertEquals(null, test.weekOfWeekyear().getLeapDurationField());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetDayOfWeek() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ftu28vj1b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24671,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ftu28vj1b(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24671);
        __CLR4_4_1iqaiqalgchoria.R.inc(24672);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24673);assertSame(test.getChronology().dayOfWeek(), test.dayOfWeek().getField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24674);assertEquals("dayOfWeek", test.dayOfWeek().getName());
        __CLR4_4_1iqaiqalgchoria.R.inc(24675);assertEquals("Property[dayOfWeek]", test.dayOfWeek().toString());
        __CLR4_4_1iqaiqalgchoria.R.inc(24676);assertSame(test, test.dayOfWeek().getDateMidnight());
        __CLR4_4_1iqaiqalgchoria.R.inc(24677);assertEquals(3, test.dayOfWeek().get());
        __CLR4_4_1iqaiqalgchoria.R.inc(24678);assertEquals("3", test.dayOfWeek().getAsString());
        __CLR4_4_1iqaiqalgchoria.R.inc(24679);assertEquals("Wednesday", test.dayOfWeek().getAsText());
        __CLR4_4_1iqaiqalgchoria.R.inc(24680);assertEquals("mercredi", test.dayOfWeek().getAsText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24681);assertEquals("Wed", test.dayOfWeek().getAsShortText());
        __CLR4_4_1iqaiqalgchoria.R.inc(24682);assertEquals("mer.", test.dayOfWeek().getAsShortText(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24683);assertEquals(test.getChronology().days(), test.dayOfWeek().getDurationField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24684);assertEquals(test.getChronology().weeks(), test.dayOfWeek().getRangeDurationField());
        __CLR4_4_1iqaiqalgchoria.R.inc(24685);assertEquals(9, test.dayOfWeek().getMaximumTextLength(null));
        __CLR4_4_1iqaiqalgchoria.R.inc(24686);assertEquals(8, test.dayOfWeek().getMaximumTextLength(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24687);assertEquals(3, test.dayOfWeek().getMaximumShortTextLength(null));
        __CLR4_4_1iqaiqalgchoria.R.inc(24688);assertEquals(4, test.dayOfWeek().getMaximumShortTextLength(Locale.FRENCH));
        __CLR4_4_1iqaiqalgchoria.R.inc(24689);assertEquals(1, test.dayOfWeek().getMinimumValue());
        __CLR4_4_1iqaiqalgchoria.R.inc(24690);assertEquals(1, test.dayOfWeek().getMinimumValueOverall());
        __CLR4_4_1iqaiqalgchoria.R.inc(24691);assertEquals(7, test.dayOfWeek().getMaximumValue());
        __CLR4_4_1iqaiqalgchoria.R.inc(24692);assertEquals(7, test.dayOfWeek().getMaximumValueOverall());
        __CLR4_4_1iqaiqalgchoria.R.inc(24693);assertEquals(false, test.dayOfWeek().isLeap());
        __CLR4_4_1iqaiqalgchoria.R.inc(24694);assertEquals(0, test.dayOfWeek().getLeapAmount());
        __CLR4_4_1iqaiqalgchoria.R.inc(24695);assertEquals(null, test.dayOfWeek().getLeapDurationField());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyToIntervalYearOfEra() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dof34j20();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalYearOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dof34j20(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24696);
        __CLR4_4_1iqaiqalgchoria.R.inc(24697);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24698);Interval testInterval = test.yearOfEra().toInterval();
        __CLR4_4_1iqaiqalgchoria.R.inc(24699);assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart());
        __CLR4_4_1iqaiqalgchoria.R.inc(24700);assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    @Test
    public void testPropertyToIntervalYearOfCentury() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h9bdk0j25();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalYearOfCentury",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h9bdk0j25(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24701);
        __CLR4_4_1iqaiqalgchoria.R.inc(24702);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24703);Interval testInterval = test.yearOfCentury().toInterval();
        __CLR4_4_1iqaiqalgchoria.R.inc(24704);assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart());
        __CLR4_4_1iqaiqalgchoria.R.inc(24705);assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    @Test
    public void testPropertyToIntervalYear() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hg1pudj2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hg1pudj2a(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24706);
        __CLR4_4_1iqaiqalgchoria.R.inc(24707);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24708);Interval testInterval = test.year().toInterval();
        __CLR4_4_1iqaiqalgchoria.R.inc(24709);assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart());
        __CLR4_4_1iqaiqalgchoria.R.inc(24710);assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    @Test
    public void testPropertyToIntervalMonthOfYear() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mybaycj2f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mybaycj2f(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24711);
        __CLR4_4_1iqaiqalgchoria.R.inc(24712);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24713);Interval testInterval = test.monthOfYear().toInterval();
        __CLR4_4_1iqaiqalgchoria.R.inc(24714);assertEquals(new DateMidnight(2004, 6, 1), testInterval.getStart());
        __CLR4_4_1iqaiqalgchoria.R.inc(24715);assertEquals(new DateMidnight(2004, 7, 1), testInterval.getEnd());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    @Test
    public void testPropertyToIntervalDayOfMonth() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r3xijfj2k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r3xijfj2k(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24716);
        __CLR4_4_1iqaiqalgchoria.R.inc(24717);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1iqaiqalgchoria.R.inc(24718);Interval testInterval = test.dayOfMonth().toInterval();
        __CLR4_4_1iqaiqalgchoria.R.inc(24719);assertEquals(new DateMidnight(2004, 6, 9), testInterval.getStart());
        __CLR4_4_1iqaiqalgchoria.R.inc(24720);assertEquals(new DateMidnight(2004, 6, 10), testInterval.getEnd());

        __CLR4_4_1iqaiqalgchoria.R.inc(24721);DateMidnight febTest = new DateMidnight(2004, 2, 29);
        __CLR4_4_1iqaiqalgchoria.R.inc(24722);Interval febTestInterval = febTest.dayOfMonth().toInterval();
        __CLR4_4_1iqaiqalgchoria.R.inc(24723);assertEquals(new DateMidnight(2004, 2, 29), febTestInterval.getStart());
        __CLR4_4_1iqaiqalgchoria.R.inc(24724);assertEquals(new DateMidnight(2004, 3, 1), febTestInterval.getEnd());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    @Test
    public void testPropertyEqualsHashCodeLenient() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xoanxfj2t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyEqualsHashCodeLenient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xoanxfj2t(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24725);
        __CLR4_4_1iqaiqalgchoria.R.inc(24726);DateMidnight test1 = new DateMidnight(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1iqaiqalgchoria.R.inc(24727);DateMidnight test2 = new DateMidnight(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1iqaiqalgchoria.R.inc(24728);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1iqaiqalgchoria.R.inc(24729);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1iqaiqalgchoria.R.inc(24730);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1iqaiqalgchoria.R.inc(24731);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1iqaiqalgchoria.R.inc(24732);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1iqaiqalgchoria.R.inc(24733);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1iqaiqalgchoria.R.inc(24734);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

    @Test
    public void testPropertyEqualsHashCodeStrict() {__CLR4_4_1iqaiqalgchoria.R.globalSliceStart(getClass().getName(),24735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ev6icvj33();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqaiqalgchoria.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqaiqalgchoria.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyEqualsHashCodeStrict",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ev6icvj33(){try{__CLR4_4_1iqaiqalgchoria.R.inc(24735);
        __CLR4_4_1iqaiqalgchoria.R.inc(24736);DateMidnight test1 = new DateMidnight(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1iqaiqalgchoria.R.inc(24737);DateMidnight test2 = new DateMidnight(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1iqaiqalgchoria.R.inc(24738);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1iqaiqalgchoria.R.inc(24739);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1iqaiqalgchoria.R.inc(24740);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1iqaiqalgchoria.R.inc(24741);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1iqaiqalgchoria.R.inc(24742);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1iqaiqalgchoria.R.inc(24743);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1iqaiqalgchoria.R.inc(24744);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }finally{__CLR4_4_1iqaiqalgchoria.R.flushNeeded();}}

}
