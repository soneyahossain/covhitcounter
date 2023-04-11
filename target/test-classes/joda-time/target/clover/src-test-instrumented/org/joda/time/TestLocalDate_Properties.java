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

import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDate_Properties {static class __CLR4_4_1ufeufelgchos22{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,39881,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    private long TEST_TIME1 =
            (31L + 28L + 31L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 12L * DateTimeConstants.MILLIS_PER_HOUR
                    + 24L * DateTimeConstants.MILLIS_PER_MINUTE;

    private long TEST_TIME2 =
            (365L + 31L + 28L + 31L + 30L + 7L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 14L * DateTimeConstants.MILLIS_PER_HOUR
                    + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_1ufeufelgchos22.R.inc(39434);
        __CLR4_4_1ufeufelgchos22.R.inc(39435);TestLocalDate_Properties TB = new TestLocalDate_Properties();
        __CLR4_4_1ufeufelgchos22.R.inc(39436);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39437);TB.testPropertyGetYear();
        __CLR4_4_1ufeufelgchos22.R.inc(39438);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39439);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39440);TB.testPropertyGetMaxMinValuesYear();
        __CLR4_4_1ufeufelgchos22.R.inc(39441);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39442);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39443);TB.testPropertyAddToCopyYear();
        __CLR4_4_1ufeufelgchos22.R.inc(39444);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39445);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39446);TB.testPropertyAddWrapFieldToCopyYear();
        __CLR4_4_1ufeufelgchos22.R.inc(39447);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39448);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39449);TB.testPropertySetCopyYear();
        __CLR4_4_1ufeufelgchos22.R.inc(39450);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39451);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39452);TB.testPropertySetCopyTextYear();
        __CLR4_4_1ufeufelgchos22.R.inc(39453);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39454);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39455);TB.testPropertyCompareToYear();
        __CLR4_4_1ufeufelgchos22.R.inc(39456);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39457);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39458);TB.testPropertyGetMonth();
        __CLR4_4_1ufeufelgchos22.R.inc(39459);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39460);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39461);TB.testPropertyGetMaxMinValuesMonth();
        __CLR4_4_1ufeufelgchos22.R.inc(39462);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39463);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39464);TB.testPropertyAddToCopyMonth();
        __CLR4_4_1ufeufelgchos22.R.inc(39465);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39466);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39467);TB.testPropertyAddWrapFieldToCopyMonth();
        __CLR4_4_1ufeufelgchos22.R.inc(39468);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39469);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39470);TB.testPropertySetCopyMonth();
        __CLR4_4_1ufeufelgchos22.R.inc(39471);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39472);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39473);TB.testPropertySetCopyTextMonth();
        __CLR4_4_1ufeufelgchos22.R.inc(39474);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39475);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39476);TB.testPropertyCompareToMonth();
        __CLR4_4_1ufeufelgchos22.R.inc(39477);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39478);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39479);TB.testPropertyGetDay();
        __CLR4_4_1ufeufelgchos22.R.inc(39480);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39481);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39482);TB.testPropertyGetMaxMinValuesDay();
        __CLR4_4_1ufeufelgchos22.R.inc(39483);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39484);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39485);TB.testPropertyAddToCopyDay();
        __CLR4_4_1ufeufelgchos22.R.inc(39486);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39487);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39488);TB.testPropertyAddWrapFieldToCopyDay();
        __CLR4_4_1ufeufelgchos22.R.inc(39489);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39490);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39491);TB.testPropertySetCopyDay();
        __CLR4_4_1ufeufelgchos22.R.inc(39492);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39493);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39494);TB.testPropertySetCopyTextDay();
        __CLR4_4_1ufeufelgchos22.R.inc(39495);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39496);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39497);TB.testPropertyWithMaximumValueDayOfMonth();
        __CLR4_4_1ufeufelgchos22.R.inc(39498);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39499);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39500);TB.testPropertyWithMinimumValueDayOfMonth();
        __CLR4_4_1ufeufelgchos22.R.inc(39501);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39502);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39503);TB.testPropertyCompareToDay();
        __CLR4_4_1ufeufelgchos22.R.inc(39504);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39505);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39506);TB.testPropertyEquals();
        __CLR4_4_1ufeufelgchos22.R.inc(39507);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39508);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39509);TB.testPropertyHashCode();
        __CLR4_4_1ufeufelgchos22.R.inc(39510);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39511);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39512);TB.testPropertyEqualsHashCodeLenient();
        __CLR4_4_1ufeufelgchos22.R.inc(39513);TB.tearDown();
        __CLR4_4_1ufeufelgchos22.R.inc(39514);TB.setUp();
        __CLR4_4_1ufeufelgchos22.R.inc(39515);TB.testPropertyEqualsHashCodeStrict();
        __CLR4_4_1ufeufelgchos22.R.inc(39516);TB.tearDown();

    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestLocalDate_Properties.class);
    }

    public TestLocalDate_Properties(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1ufeufelgchos22.R.inc(39517);
        __CLR4_4_1ufeufelgchos22.R.inc(39518);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ufeufelgchos22.R.inc(39519);zone = DateTimeZone.getDefault();
        __CLR4_4_1ufeufelgchos22.R.inc(39520);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1ufeufelgchos22.R.inc(39521);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1ufeufelgchos22.R.inc(39522);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1ufeufelgchos22.R.inc(39523);
        __CLR4_4_1ufeufelgchos22.R.inc(39524);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ufeufelgchos22.R.inc(39525);DateTimeZone.setDefault(zone);
        __CLR4_4_1ufeufelgchos22.R.inc(39526);zone = null;
        __CLR4_4_1ufeufelgchos22.R.inc(39527);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1ufeufelgchos22.R.inc(39528);systemDefaultLocale = null;
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetYear() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgqcqbui1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyGetYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39529,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgqcqbui1(){try{__CLR4_4_1ufeufelgchos22.R.inc(39529);
        __CLR4_4_1ufeufelgchos22.R.inc(39530);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39531);assertSame(test.getChronology().year(), test.year().getField());
        __CLR4_4_1ufeufelgchos22.R.inc(39532);assertEquals("year", test.year().getName());
        __CLR4_4_1ufeufelgchos22.R.inc(39533);assertEquals("Property[year]", test.year().toString());
        __CLR4_4_1ufeufelgchos22.R.inc(39534);assertSame(test, test.year().getLocalDate());
        __CLR4_4_1ufeufelgchos22.R.inc(39535);assertEquals(1972, test.year().get());
        __CLR4_4_1ufeufelgchos22.R.inc(39536);assertEquals("1972", test.year().getAsString());
        __CLR4_4_1ufeufelgchos22.R.inc(39537);assertEquals("1972", test.year().getAsText());
        __CLR4_4_1ufeufelgchos22.R.inc(39538);assertEquals("1972", test.year().getAsText(Locale.FRENCH));
        __CLR4_4_1ufeufelgchos22.R.inc(39539);assertEquals("1972", test.year().getAsShortText());
        __CLR4_4_1ufeufelgchos22.R.inc(39540);assertEquals("1972", test.year().getAsShortText(Locale.FRENCH));
        __CLR4_4_1ufeufelgchos22.R.inc(39541);assertEquals(test.getChronology().years(), test.year().getDurationField());
        __CLR4_4_1ufeufelgchos22.R.inc(39542);assertEquals(null, test.year().getRangeDurationField());
        __CLR4_4_1ufeufelgchos22.R.inc(39543);assertEquals(9, test.year().getMaximumTextLength(null));
        __CLR4_4_1ufeufelgchos22.R.inc(39544);assertEquals(9, test.year().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesYear() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12r9x9fuih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyGetMaxMinValuesYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12r9x9fuih(){try{__CLR4_4_1ufeufelgchos22.R.inc(39545);
        __CLR4_4_1ufeufelgchos22.R.inc(39546);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39547);assertEquals(-292275054, test.year().getMinimumValue());
        __CLR4_4_1ufeufelgchos22.R.inc(39548);assertEquals(-292275054, test.year().getMinimumValueOverall());
        __CLR4_4_1ufeufelgchos22.R.inc(39549);assertEquals(292278993, test.year().getMaximumValue());
        __CLR4_4_1ufeufelgchos22.R.inc(39550);assertEquals(292278993, test.year().getMaximumValueOverall());
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertyAddToCopyYear() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cpejciuin();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyAddToCopyYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cpejciuin(){try{__CLR4_4_1ufeufelgchos22.R.inc(39551);
        __CLR4_4_1ufeufelgchos22.R.inc(39552);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39553);LocalDate copy = test.year().addToCopy(9);
        __CLR4_4_1ufeufelgchos22.R.inc(39554);check(test, 1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39555);check(copy, 1981, 6, 9);

        __CLR4_4_1ufeufelgchos22.R.inc(39556);copy = test.year().addToCopy(0);
        __CLR4_4_1ufeufelgchos22.R.inc(39557);check(copy, 1972, 6, 9);

        __CLR4_4_1ufeufelgchos22.R.inc(39558);copy = test.year().addToCopy(292278993 - 1972);
        __CLR4_4_1ufeufelgchos22.R.inc(39559);check(copy, 292278993, 6, 9);

        __CLR4_4_1ufeufelgchos22.R.inc(39560);try {
            __CLR4_4_1ufeufelgchos22.R.inc(39561);test.year().addToCopy(292278993 - 1972 + 1);
            __CLR4_4_1ufeufelgchos22.R.inc(39562);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1ufeufelgchos22.R.inc(39563);check(test, 1972, 6, 9);

        __CLR4_4_1ufeufelgchos22.R.inc(39564);copy = test.year().addToCopy(-1972);
        __CLR4_4_1ufeufelgchos22.R.inc(39565);check(copy, 0, 6, 9);

        __CLR4_4_1ufeufelgchos22.R.inc(39566);copy = test.year().addToCopy(-1973);
        __CLR4_4_1ufeufelgchos22.R.inc(39567);check(copy, -1, 6, 9);

        __CLR4_4_1ufeufelgchos22.R.inc(39568);try {
            __CLR4_4_1ufeufelgchos22.R.inc(39569);test.year().addToCopy(-292275054 - 1972 - 1);
            __CLR4_4_1ufeufelgchos22.R.inc(39570);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1ufeufelgchos22.R.inc(39571);check(test, 1972, 6, 9);
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldToCopyYear() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1osemkquj8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyAddWrapFieldToCopyYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39572,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1osemkquj8(){try{__CLR4_4_1ufeufelgchos22.R.inc(39572);
        __CLR4_4_1ufeufelgchos22.R.inc(39573);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39574);LocalDate copy = test.year().addWrapFieldToCopy(9);
        __CLR4_4_1ufeufelgchos22.R.inc(39575);check(test, 1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39576);check(copy, 1981, 6, 9);

        __CLR4_4_1ufeufelgchos22.R.inc(39577);copy = test.year().addWrapFieldToCopy(0);
        __CLR4_4_1ufeufelgchos22.R.inc(39578);check(copy, 1972, 6, 9);

        __CLR4_4_1ufeufelgchos22.R.inc(39579);copy = test.year().addWrapFieldToCopy(292278993 - 1972 + 1);
        __CLR4_4_1ufeufelgchos22.R.inc(39580);check(copy, -292275054, 6, 9);

        __CLR4_4_1ufeufelgchos22.R.inc(39581);copy = test.year().addWrapFieldToCopy(-292275054 - 1972 - 1);
        __CLR4_4_1ufeufelgchos22.R.inc(39582);check(copy, 292278993, 6, 9);
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertySetCopyYear() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12egg3wujj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertySetCopyYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39583,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12egg3wujj(){try{__CLR4_4_1ufeufelgchos22.R.inc(39583);
        __CLR4_4_1ufeufelgchos22.R.inc(39584);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39585);LocalDate copy = test.year().setCopy(12);
        __CLR4_4_1ufeufelgchos22.R.inc(39586);check(test, 1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39587);check(copy, 12, 6, 9);
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertySetCopyTextYear() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iwaee7ujo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertySetCopyTextYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iwaee7ujo(){try{__CLR4_4_1ufeufelgchos22.R.inc(39588);
        __CLR4_4_1ufeufelgchos22.R.inc(39589);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39590);LocalDate copy = test.year().setCopy("12");
        __CLR4_4_1ufeufelgchos22.R.inc(39591);check(test, 1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39592);check(copy, 12, 6, 9);
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToYear() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ft7abujt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyCompareToYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39593,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ft7abujt(){try{__CLR4_4_1ufeufelgchos22.R.inc(39593);
        __CLR4_4_1ufeufelgchos22.R.inc(39594);LocalDate test1 = new LocalDate(TEST_TIME1);
        __CLR4_4_1ufeufelgchos22.R.inc(39595);LocalDate test2 = new LocalDate(TEST_TIME2);
        __CLR4_4_1ufeufelgchos22.R.inc(39596);assertEquals(true, test1.year().compareTo(test2) < 0);
        __CLR4_4_1ufeufelgchos22.R.inc(39597);assertEquals(true, test2.year().compareTo(test1) > 0);
        __CLR4_4_1ufeufelgchos22.R.inc(39598);assertEquals(true, test1.year().compareTo(test1) == 0);
        __CLR4_4_1ufeufelgchos22.R.inc(39599);try {
            __CLR4_4_1ufeufelgchos22.R.inc(39600);test1.year().compareTo((ReadablePartial) null);
            __CLR4_4_1ufeufelgchos22.R.inc(39601);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1ufeufelgchos22.R.inc(39602);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1ufeufelgchos22.R.inc(39603);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1ufeufelgchos22.R.inc(39604);assertEquals(true, test1.year().compareTo(dt2) < 0);
        __CLR4_4_1ufeufelgchos22.R.inc(39605);assertEquals(true, test2.year().compareTo(dt1) > 0);
        __CLR4_4_1ufeufelgchos22.R.inc(39606);assertEquals(true, test1.year().compareTo(dt1) == 0);
        __CLR4_4_1ufeufelgchos22.R.inc(39607);try {
            __CLR4_4_1ufeufelgchos22.R.inc(39608);test1.year().compareTo((ReadableInstant) null);
            __CLR4_4_1ufeufelgchos22.R.inc(39609);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetMonth() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ox6q20uka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyGetMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ox6q20uka(){try{__CLR4_4_1ufeufelgchos22.R.inc(39610);
        __CLR4_4_1ufeufelgchos22.R.inc(39611);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39612);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField());
        __CLR4_4_1ufeufelgchos22.R.inc(39613);assertEquals("monthOfYear", test.monthOfYear().getName());
        __CLR4_4_1ufeufelgchos22.R.inc(39614);assertEquals("Property[monthOfYear]", test.monthOfYear().toString());
        __CLR4_4_1ufeufelgchos22.R.inc(39615);assertSame(test, test.monthOfYear().getLocalDate());
        __CLR4_4_1ufeufelgchos22.R.inc(39616);assertEquals(6, test.monthOfYear().get());
        __CLR4_4_1ufeufelgchos22.R.inc(39617);assertEquals("6", test.monthOfYear().getAsString());
        __CLR4_4_1ufeufelgchos22.R.inc(39618);assertEquals("June", test.monthOfYear().getAsText());
        __CLR4_4_1ufeufelgchos22.R.inc(39619);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1ufeufelgchos22.R.inc(39620);assertEquals("Jun", test.monthOfYear().getAsShortText());
        __CLR4_4_1ufeufelgchos22.R.inc(39621);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1ufeufelgchos22.R.inc(39622);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField());
        __CLR4_4_1ufeufelgchos22.R.inc(39623);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField());
        __CLR4_4_1ufeufelgchos22.R.inc(39624);assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
        __CLR4_4_1ufeufelgchos22.R.inc(39625);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
        __CLR4_4_1ufeufelgchos22.R.inc(39626);test = new LocalDate(1972, 7, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39627);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1ufeufelgchos22.R.inc(39628);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH));
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesMonth() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gzdw8ukt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyGetMaxMinValuesMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39629,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gzdw8ukt(){try{__CLR4_4_1ufeufelgchos22.R.inc(39629);
        __CLR4_4_1ufeufelgchos22.R.inc(39630);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39631);assertEquals(1, test.monthOfYear().getMinimumValue());
        __CLR4_4_1ufeufelgchos22.R.inc(39632);assertEquals(1, test.monthOfYear().getMinimumValueOverall());
        __CLR4_4_1ufeufelgchos22.R.inc(39633);assertEquals(12, test.monthOfYear().getMaximumValue());
        __CLR4_4_1ufeufelgchos22.R.inc(39634);assertEquals(12, test.monthOfYear().getMaximumValueOverall());
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertyAddToCopyMonth() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hdqp25ukz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyAddToCopyMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hdqp25ukz(){try{__CLR4_4_1ufeufelgchos22.R.inc(39635);
        __CLR4_4_1ufeufelgchos22.R.inc(39636);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39637);LocalDate copy = test.monthOfYear().addToCopy(6);
        __CLR4_4_1ufeufelgchos22.R.inc(39638);check(test, 1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39639);check(copy, 1972, 12, 9);

        __CLR4_4_1ufeufelgchos22.R.inc(39640);copy = test.monthOfYear().addToCopy(7);
        __CLR4_4_1ufeufelgchos22.R.inc(39641);check(copy, 1973, 1, 9);

        __CLR4_4_1ufeufelgchos22.R.inc(39642);copy = test.monthOfYear().addToCopy(-5);
        __CLR4_4_1ufeufelgchos22.R.inc(39643);check(copy, 1972, 1, 9);

        __CLR4_4_1ufeufelgchos22.R.inc(39644);copy = test.monthOfYear().addToCopy(-6);
        __CLR4_4_1ufeufelgchos22.R.inc(39645);check(copy, 1971, 12, 9);

        __CLR4_4_1ufeufelgchos22.R.inc(39646);test = new LocalDate(1972, 1, 31);
        __CLR4_4_1ufeufelgchos22.R.inc(39647);copy = test.monthOfYear().addToCopy(1);
        __CLR4_4_1ufeufelgchos22.R.inc(39648);check(copy, 1972, 2, 29);

        __CLR4_4_1ufeufelgchos22.R.inc(39649);copy = test.monthOfYear().addToCopy(2);
        __CLR4_4_1ufeufelgchos22.R.inc(39650);check(copy, 1972, 3, 31);

        __CLR4_4_1ufeufelgchos22.R.inc(39651);copy = test.monthOfYear().addToCopy(3);
        __CLR4_4_1ufeufelgchos22.R.inc(39652);check(copy, 1972, 4, 30);

        __CLR4_4_1ufeufelgchos22.R.inc(39653);test = new LocalDate(1971, 1, 31);
        __CLR4_4_1ufeufelgchos22.R.inc(39654);copy = test.monthOfYear().addToCopy(1);
        __CLR4_4_1ufeufelgchos22.R.inc(39655);check(copy, 1971, 2, 28);
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldToCopyMonth() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rt24wvulk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyAddWrapFieldToCopyMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rt24wvulk(){try{__CLR4_4_1ufeufelgchos22.R.inc(39656);
        __CLR4_4_1ufeufelgchos22.R.inc(39657);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39658);LocalDate copy = test.monthOfYear().addWrapFieldToCopy(4);
        __CLR4_4_1ufeufelgchos22.R.inc(39659);check(test, 1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39660);check(copy, 1972, 10, 9);

        __CLR4_4_1ufeufelgchos22.R.inc(39661);copy = test.monthOfYear().addWrapFieldToCopy(8);
        __CLR4_4_1ufeufelgchos22.R.inc(39662);check(copy, 1972, 2, 9);

        __CLR4_4_1ufeufelgchos22.R.inc(39663);copy = test.monthOfYear().addWrapFieldToCopy(-8);
        __CLR4_4_1ufeufelgchos22.R.inc(39664);check(copy, 1972, 10, 9);

        __CLR4_4_1ufeufelgchos22.R.inc(39665);test = new LocalDate(1972, 1, 31);
        __CLR4_4_1ufeufelgchos22.R.inc(39666);copy = test.monthOfYear().addWrapFieldToCopy(1);
        __CLR4_4_1ufeufelgchos22.R.inc(39667);check(copy, 1972, 2, 29);

        __CLR4_4_1ufeufelgchos22.R.inc(39668);copy = test.monthOfYear().addWrapFieldToCopy(2);
        __CLR4_4_1ufeufelgchos22.R.inc(39669);check(copy, 1972, 3, 31);

        __CLR4_4_1ufeufelgchos22.R.inc(39670);copy = test.monthOfYear().addWrapFieldToCopy(3);
        __CLR4_4_1ufeufelgchos22.R.inc(39671);check(copy, 1972, 4, 30);

        __CLR4_4_1ufeufelgchos22.R.inc(39672);test = new LocalDate(1971, 1, 31);
        __CLR4_4_1ufeufelgchos22.R.inc(39673);copy = test.monthOfYear().addWrapFieldToCopy(1);
        __CLR4_4_1ufeufelgchos22.R.inc(39674);check(copy, 1971, 2, 28);
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertySetCopyMonth() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1icgsehum3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertySetCopyMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1icgsehum3(){try{__CLR4_4_1ufeufelgchos22.R.inc(39675);
        __CLR4_4_1ufeufelgchos22.R.inc(39676);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39677);LocalDate copy = test.monthOfYear().setCopy(12);
        __CLR4_4_1ufeufelgchos22.R.inc(39678);check(test, 1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39679);check(copy, 1972, 12, 9);

        __CLR4_4_1ufeufelgchos22.R.inc(39680);test = new LocalDate(1972, 1, 31);
        __CLR4_4_1ufeufelgchos22.R.inc(39681);copy = test.monthOfYear().setCopy(2);
        __CLR4_4_1ufeufelgchos22.R.inc(39682);check(copy, 1972, 2, 29);

        __CLR4_4_1ufeufelgchos22.R.inc(39683);try {
            __CLR4_4_1ufeufelgchos22.R.inc(39684);test.monthOfYear().setCopy(13);
            __CLR4_4_1ufeufelgchos22.R.inc(39685);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1ufeufelgchos22.R.inc(39686);try {
            __CLR4_4_1ufeufelgchos22.R.inc(39687);test.monthOfYear().setCopy(0);
            __CLR4_4_1ufeufelgchos22.R.inc(39688);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertySetCopyTextMonth() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1whgxg6umh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertySetCopyTextMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1whgxg6umh(){try{__CLR4_4_1ufeufelgchos22.R.inc(39689);
        __CLR4_4_1ufeufelgchos22.R.inc(39690);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39691);LocalDate copy = test.monthOfYear().setCopy("12");
        __CLR4_4_1ufeufelgchos22.R.inc(39692);check(test, 1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39693);check(copy, 1972, 12, 9);

        __CLR4_4_1ufeufelgchos22.R.inc(39694);copy = test.monthOfYear().setCopy("December");
        __CLR4_4_1ufeufelgchos22.R.inc(39695);check(test, 1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39696);check(copy, 1972, 12, 9);

        __CLR4_4_1ufeufelgchos22.R.inc(39697);copy = test.monthOfYear().setCopy("Dec");
        __CLR4_4_1ufeufelgchos22.R.inc(39698);check(test, 1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39699);check(copy, 1972, 12, 9);
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToMonth() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sjk8wiums();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyCompareToMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39700,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sjk8wiums(){try{__CLR4_4_1ufeufelgchos22.R.inc(39700);
        __CLR4_4_1ufeufelgchos22.R.inc(39701);LocalDate test1 = new LocalDate(TEST_TIME1);
        __CLR4_4_1ufeufelgchos22.R.inc(39702);LocalDate test2 = new LocalDate(TEST_TIME2);
        __CLR4_4_1ufeufelgchos22.R.inc(39703);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0);
        __CLR4_4_1ufeufelgchos22.R.inc(39704);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0);
        __CLR4_4_1ufeufelgchos22.R.inc(39705);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0);
        __CLR4_4_1ufeufelgchos22.R.inc(39706);try {
            __CLR4_4_1ufeufelgchos22.R.inc(39707);test1.monthOfYear().compareTo((ReadablePartial) null);
            __CLR4_4_1ufeufelgchos22.R.inc(39708);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1ufeufelgchos22.R.inc(39709);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1ufeufelgchos22.R.inc(39710);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1ufeufelgchos22.R.inc(39711);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0);
        __CLR4_4_1ufeufelgchos22.R.inc(39712);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0);
        __CLR4_4_1ufeufelgchos22.R.inc(39713);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0);
        __CLR4_4_1ufeufelgchos22.R.inc(39714);try {
            __CLR4_4_1ufeufelgchos22.R.inc(39715);test1.monthOfYear().compareTo((ReadableInstant) null);
            __CLR4_4_1ufeufelgchos22.R.inc(39716);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetDay() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1akcm7oun9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyGetDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1akcm7oun9(){try{__CLR4_4_1ufeufelgchos22.R.inc(39717);
        __CLR4_4_1ufeufelgchos22.R.inc(39718);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39719);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField());
        __CLR4_4_1ufeufelgchos22.R.inc(39720);assertEquals("dayOfMonth", test.dayOfMonth().getName());
        __CLR4_4_1ufeufelgchos22.R.inc(39721);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString());
        __CLR4_4_1ufeufelgchos22.R.inc(39722);assertSame(test, test.dayOfMonth().getLocalDate());
        __CLR4_4_1ufeufelgchos22.R.inc(39723);assertEquals(9, test.dayOfMonth().get());
        __CLR4_4_1ufeufelgchos22.R.inc(39724);assertEquals("9", test.dayOfMonth().getAsString());
        __CLR4_4_1ufeufelgchos22.R.inc(39725);assertEquals("9", test.dayOfMonth().getAsText());
        __CLR4_4_1ufeufelgchos22.R.inc(39726);assertEquals("9", test.dayOfMonth().getAsText(Locale.FRENCH));
        __CLR4_4_1ufeufelgchos22.R.inc(39727);assertEquals("9", test.dayOfMonth().getAsShortText());
        __CLR4_4_1ufeufelgchos22.R.inc(39728);assertEquals("9", test.dayOfMonth().getAsShortText(Locale.FRENCH));
        __CLR4_4_1ufeufelgchos22.R.inc(39729);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField());
        __CLR4_4_1ufeufelgchos22.R.inc(39730);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField());
        __CLR4_4_1ufeufelgchos22.R.inc(39731);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null));
        __CLR4_4_1ufeufelgchos22.R.inc(39732);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesDay() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_141l7p8unp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyGetMaxMinValuesDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_141l7p8unp(){try{__CLR4_4_1ufeufelgchos22.R.inc(39733);
        __CLR4_4_1ufeufelgchos22.R.inc(39734);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39735);assertEquals(1, test.dayOfMonth().getMinimumValue());
        __CLR4_4_1ufeufelgchos22.R.inc(39736);assertEquals(1, test.dayOfMonth().getMinimumValueOverall());
        __CLR4_4_1ufeufelgchos22.R.inc(39737);assertEquals(30, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1ufeufelgchos22.R.inc(39738);assertEquals(31, test.dayOfMonth().getMaximumValueOverall());
        __CLR4_4_1ufeufelgchos22.R.inc(39739);test = new LocalDate(1972, 7, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39740);assertEquals(31, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1ufeufelgchos22.R.inc(39741);test = new LocalDate(1972, 2, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39742);assertEquals(29, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1ufeufelgchos22.R.inc(39743);test = new LocalDate(1971, 2, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39744);assertEquals(28, test.dayOfMonth().getMaximumValue());
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertyAddToCopyDay() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rja0s9uo1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyAddToCopyDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rja0s9uo1(){try{__CLR4_4_1ufeufelgchos22.R.inc(39745);
        __CLR4_4_1ufeufelgchos22.R.inc(39746);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39747);LocalDate copy = test.dayOfMonth().addToCopy(9);
        __CLR4_4_1ufeufelgchos22.R.inc(39748);check(test, 1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39749);check(copy, 1972, 6, 18);

        __CLR4_4_1ufeufelgchos22.R.inc(39750);copy = test.dayOfMonth().addToCopy(21);
        __CLR4_4_1ufeufelgchos22.R.inc(39751);check(copy, 1972, 6, 30);

        __CLR4_4_1ufeufelgchos22.R.inc(39752);copy = test.dayOfMonth().addToCopy(22);
        __CLR4_4_1ufeufelgchos22.R.inc(39753);check(copy, 1972, 7, 1);

        __CLR4_4_1ufeufelgchos22.R.inc(39754);copy = test.dayOfMonth().addToCopy(22 + 30);
        __CLR4_4_1ufeufelgchos22.R.inc(39755);check(copy, 1972, 7, 31);

        __CLR4_4_1ufeufelgchos22.R.inc(39756);copy = test.dayOfMonth().addToCopy(22 + 31);
        __CLR4_4_1ufeufelgchos22.R.inc(39757);check(copy, 1972, 8, 1);

        __CLR4_4_1ufeufelgchos22.R.inc(39758);copy = test.dayOfMonth().addToCopy(21 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_1ufeufelgchos22.R.inc(39759);check(copy, 1972, 12, 31);

        __CLR4_4_1ufeufelgchos22.R.inc(39760);copy = test.dayOfMonth().addToCopy(22 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_1ufeufelgchos22.R.inc(39761);check(copy, 1973, 1, 1);

        __CLR4_4_1ufeufelgchos22.R.inc(39762);copy = test.dayOfMonth().addToCopy(-8);
        __CLR4_4_1ufeufelgchos22.R.inc(39763);check(copy, 1972, 6, 1);

        __CLR4_4_1ufeufelgchos22.R.inc(39764);copy = test.dayOfMonth().addToCopy(-9);
        __CLR4_4_1ufeufelgchos22.R.inc(39765);check(copy, 1972, 5, 31);

        __CLR4_4_1ufeufelgchos22.R.inc(39766);copy = test.dayOfMonth().addToCopy(-8 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_1ufeufelgchos22.R.inc(39767);check(copy, 1972, 1, 1);

        __CLR4_4_1ufeufelgchos22.R.inc(39768);copy = test.dayOfMonth().addToCopy(-9 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_1ufeufelgchos22.R.inc(39769);check(copy, 1971, 12, 31);
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldToCopyDay() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qgbzr1uoq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyAddWrapFieldToCopyDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qgbzr1uoq(){try{__CLR4_4_1ufeufelgchos22.R.inc(39770);
        __CLR4_4_1ufeufelgchos22.R.inc(39771);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39772);LocalDate copy = test.dayOfMonth().addWrapFieldToCopy(21);
        __CLR4_4_1ufeufelgchos22.R.inc(39773);check(test, 1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39774);check(copy, 1972, 6, 30);

        __CLR4_4_1ufeufelgchos22.R.inc(39775);copy = test.dayOfMonth().addWrapFieldToCopy(22);
        __CLR4_4_1ufeufelgchos22.R.inc(39776);check(copy, 1972, 6, 1);

        __CLR4_4_1ufeufelgchos22.R.inc(39777);copy = test.dayOfMonth().addWrapFieldToCopy(-12);
        __CLR4_4_1ufeufelgchos22.R.inc(39778);check(copy, 1972, 6, 27);

        __CLR4_4_1ufeufelgchos22.R.inc(39779);test = new LocalDate(1972, 7, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39780);copy = test.dayOfMonth().addWrapFieldToCopy(21);
        __CLR4_4_1ufeufelgchos22.R.inc(39781);check(copy, 1972, 7, 30);

        __CLR4_4_1ufeufelgchos22.R.inc(39782);copy = test.dayOfMonth().addWrapFieldToCopy(22);
        __CLR4_4_1ufeufelgchos22.R.inc(39783);check(copy, 1972, 7, 31);

        __CLR4_4_1ufeufelgchos22.R.inc(39784);copy = test.dayOfMonth().addWrapFieldToCopy(23);
        __CLR4_4_1ufeufelgchos22.R.inc(39785);check(copy, 1972, 7, 1);

        __CLR4_4_1ufeufelgchos22.R.inc(39786);copy = test.dayOfMonth().addWrapFieldToCopy(-12);
        __CLR4_4_1ufeufelgchos22.R.inc(39787);check(copy, 1972, 7, 28);
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertySetCopyDay() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b31jxpup8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertySetCopyDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39788,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b31jxpup8(){try{__CLR4_4_1ufeufelgchos22.R.inc(39788);
        __CLR4_4_1ufeufelgchos22.R.inc(39789);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39790);LocalDate copy = test.dayOfMonth().setCopy(12);
        __CLR4_4_1ufeufelgchos22.R.inc(39791);check(test, 1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39792);check(copy, 1972, 6, 12);

        __CLR4_4_1ufeufelgchos22.R.inc(39793);try {
            __CLR4_4_1ufeufelgchos22.R.inc(39794);test.dayOfMonth().setCopy(31);
            __CLR4_4_1ufeufelgchos22.R.inc(39795);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1ufeufelgchos22.R.inc(39796);try {
            __CLR4_4_1ufeufelgchos22.R.inc(39797);test.dayOfMonth().setCopy(0);
            __CLR4_4_1ufeufelgchos22.R.inc(39798);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertySetCopyTextDay() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ty3ke2upj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertySetCopyTextDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ty3ke2upj(){try{__CLR4_4_1ufeufelgchos22.R.inc(39799);
        __CLR4_4_1ufeufelgchos22.R.inc(39800);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39801);LocalDate copy = test.dayOfMonth().setCopy("12");
        __CLR4_4_1ufeufelgchos22.R.inc(39802);check(test, 1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39803);check(copy, 1972, 6, 12);
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertyWithMaximumValueDayOfMonth() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2wa9eupo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyWithMaximumValueDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39804,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2wa9eupo(){try{__CLR4_4_1ufeufelgchos22.R.inc(39804);
        __CLR4_4_1ufeufelgchos22.R.inc(39805);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39806);LocalDate copy = test.dayOfMonth().withMaximumValue();
        __CLR4_4_1ufeufelgchos22.R.inc(39807);check(test, 1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39808);check(copy, 1972, 6, 30);
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertyWithMinimumValueDayOfMonth() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1duofekupt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyWithMinimumValueDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1duofekupt(){try{__CLR4_4_1ufeufelgchos22.R.inc(39809);
        __CLR4_4_1ufeufelgchos22.R.inc(39810);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39811);LocalDate copy = test.dayOfMonth().withMinimumValue();
        __CLR4_4_1ufeufelgchos22.R.inc(39812);check(test, 1972, 6, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39813);check(copy, 1972, 6, 1);
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToDay() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19lmfreupy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyCompareToDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19lmfreupy(){try{__CLR4_4_1ufeufelgchos22.R.inc(39814);
        __CLR4_4_1ufeufelgchos22.R.inc(39815);LocalDate test1 = new LocalDate(TEST_TIME1);
        __CLR4_4_1ufeufelgchos22.R.inc(39816);LocalDate test2 = new LocalDate(TEST_TIME2);
        __CLR4_4_1ufeufelgchos22.R.inc(39817);assertEquals(true, test1.dayOfMonth().compareTo(test2) < 0);
        __CLR4_4_1ufeufelgchos22.R.inc(39818);assertEquals(true, test2.dayOfMonth().compareTo(test1) > 0);
        __CLR4_4_1ufeufelgchos22.R.inc(39819);assertEquals(true, test1.dayOfMonth().compareTo(test1) == 0);
        __CLR4_4_1ufeufelgchos22.R.inc(39820);try {
            __CLR4_4_1ufeufelgchos22.R.inc(39821);test1.dayOfMonth().compareTo((ReadablePartial) null);
            __CLR4_4_1ufeufelgchos22.R.inc(39822);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1ufeufelgchos22.R.inc(39823);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1ufeufelgchos22.R.inc(39824);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1ufeufelgchos22.R.inc(39825);assertEquals(true, test1.dayOfMonth().compareTo(dt2) < 0);
        __CLR4_4_1ufeufelgchos22.R.inc(39826);assertEquals(true, test2.dayOfMonth().compareTo(dt1) > 0);
        __CLR4_4_1ufeufelgchos22.R.inc(39827);assertEquals(true, test1.dayOfMonth().compareTo(dt1) == 0);
        __CLR4_4_1ufeufelgchos22.R.inc(39828);try {
            __CLR4_4_1ufeufelgchos22.R.inc(39829);test1.dayOfMonth().compareTo((ReadableInstant) null);
            __CLR4_4_1ufeufelgchos22.R.inc(39830);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertyEquals() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2ub0zuqf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2ub0zuqf(){try{__CLR4_4_1ufeufelgchos22.R.inc(39831);
        __CLR4_4_1ufeufelgchos22.R.inc(39832);LocalDate test1 = new LocalDate(2005, 11, 8);
        __CLR4_4_1ufeufelgchos22.R.inc(39833);LocalDate test2 = new LocalDate(2005, 11, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39834);LocalDate test3 = new LocalDate(2005, 11, 8, CopticChronology.getInstanceUTC());
        __CLR4_4_1ufeufelgchos22.R.inc(39835);assertEquals(false, test1.dayOfMonth().equals(test1.year()));
        __CLR4_4_1ufeufelgchos22.R.inc(39836);assertEquals(false, test1.dayOfMonth().equals(test1.monthOfYear()));
        __CLR4_4_1ufeufelgchos22.R.inc(39837);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1ufeufelgchos22.R.inc(39838);assertEquals(false, test1.dayOfMonth().equals(test2.year()));
        __CLR4_4_1ufeufelgchos22.R.inc(39839);assertEquals(false, test1.dayOfMonth().equals(test2.monthOfYear()));
        __CLR4_4_1ufeufelgchos22.R.inc(39840);assertEquals(false, test1.dayOfMonth().equals(test2.dayOfMonth()));

        __CLR4_4_1ufeufelgchos22.R.inc(39841);assertEquals(false, test1.monthOfYear().equals(test1.year()));
        __CLR4_4_1ufeufelgchos22.R.inc(39842);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear()));
        __CLR4_4_1ufeufelgchos22.R.inc(39843);assertEquals(false, test1.monthOfYear().equals(test1.dayOfMonth()));
        __CLR4_4_1ufeufelgchos22.R.inc(39844);assertEquals(false, test1.monthOfYear().equals(test2.year()));
        __CLR4_4_1ufeufelgchos22.R.inc(39845);assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear()));
        __CLR4_4_1ufeufelgchos22.R.inc(39846);assertEquals(false, test1.monthOfYear().equals(test2.dayOfMonth()));

        __CLR4_4_1ufeufelgchos22.R.inc(39847);assertEquals(false, test1.dayOfMonth().equals(null));
        __CLR4_4_1ufeufelgchos22.R.inc(39848);assertEquals(false, test1.dayOfMonth().equals("any"));

        // chrono
        __CLR4_4_1ufeufelgchos22.R.inc(39849);assertEquals(false, test1.dayOfMonth().equals(test3.dayOfMonth()));
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertyHashCode() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y278s7uqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39850,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y278s7uqy(){try{__CLR4_4_1ufeufelgchos22.R.inc(39850);
        __CLR4_4_1ufeufelgchos22.R.inc(39851);LocalDate test1 = new LocalDate(2005, 11, 8);
        __CLR4_4_1ufeufelgchos22.R.inc(39852);LocalDate test2 = new LocalDate(2005, 11, 9);
        __CLR4_4_1ufeufelgchos22.R.inc(39853);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1ufeufelgchos22.R.inc(39854);assertEquals(false, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1ufeufelgchos22.R.inc(39855);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode());
        __CLR4_4_1ufeufelgchos22.R.inc(39856);assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertyEqualsHashCodeLenient() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xoanxfur5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyEqualsHashCodeLenient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xoanxfur5(){try{__CLR4_4_1ufeufelgchos22.R.inc(39857);
        __CLR4_4_1ufeufelgchos22.R.inc(39858);LocalDate test1 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1ufeufelgchos22.R.inc(39859);LocalDate test2 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1ufeufelgchos22.R.inc(39860);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1ufeufelgchos22.R.inc(39861);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1ufeufelgchos22.R.inc(39862);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1ufeufelgchos22.R.inc(39863);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1ufeufelgchos22.R.inc(39864);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1ufeufelgchos22.R.inc(39865);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1ufeufelgchos22.R.inc(39866);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    @Test
    public void testPropertyEqualsHashCodeStrict() {__CLR4_4_1ufeufelgchos22.R.globalSliceStart(getClass().getName(),39867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ev6icvurf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ufeufelgchos22.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ufeufelgchos22.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyEqualsHashCodeStrict",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ev6icvurf(){try{__CLR4_4_1ufeufelgchos22.R.inc(39867);
        __CLR4_4_1ufeufelgchos22.R.inc(39868);LocalDate test1 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1ufeufelgchos22.R.inc(39869);LocalDate test2 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1ufeufelgchos22.R.inc(39870);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1ufeufelgchos22.R.inc(39871);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1ufeufelgchos22.R.inc(39872);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1ufeufelgchos22.R.inc(39873);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1ufeufelgchos22.R.inc(39874);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1ufeufelgchos22.R.inc(39875);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1ufeufelgchos22.R.inc(39876);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(LocalDate test, int year, int month, int day) {try{__CLR4_4_1ufeufelgchos22.R.inc(39877);
        __CLR4_4_1ufeufelgchos22.R.inc(39878);assertEquals(year, test.getYear());
        __CLR4_4_1ufeufelgchos22.R.inc(39879);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1ufeufelgchos22.R.inc(39880);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1ufeufelgchos22.R.flushNeeded();}}
}
