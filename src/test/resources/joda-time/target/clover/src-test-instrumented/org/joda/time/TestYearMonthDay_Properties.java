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
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestYearMonthDay_Properties {static class __CLR4_4_1194z194zlgchosju{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,58949,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

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

    public static void main(String[] args) throws Exception {try{__CLR4_4_1194z194zlgchosju.R.inc(58499);
        __CLR4_4_1194z194zlgchosju.R.inc(58500);TestYearMonthDay_Properties TB = new TestYearMonthDay_Properties();
        __CLR4_4_1194z194zlgchosju.R.inc(58501);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58502);TB.testPropertyGetYear();
        __CLR4_4_1194z194zlgchosju.R.inc(58503);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58504);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58505);TB.testPropertyGetMaxMinValuesYear();
        __CLR4_4_1194z194zlgchosju.R.inc(58506);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58507);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58508);TB.testPropertyAddYear();
        __CLR4_4_1194z194zlgchosju.R.inc(58509);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58510);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58511);TB.testPropertyAddWrapFieldYear();
        __CLR4_4_1194z194zlgchosju.R.inc(58512);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58513);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58514);TB.testPropertySetYear();
        __CLR4_4_1194z194zlgchosju.R.inc(58515);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58516);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58517);TB.testPropertySetTextYear();
        __CLR4_4_1194z194zlgchosju.R.inc(58518);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58519);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58520);TB.testPropertyCompareToYear();
        __CLR4_4_1194z194zlgchosju.R.inc(58521);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58522);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58523);TB.testPropertyGetMonth();
        __CLR4_4_1194z194zlgchosju.R.inc(58524);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58525);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58526);TB.testPropertyGetMaxMinValuesMonth();
        __CLR4_4_1194z194zlgchosju.R.inc(58527);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58528);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58529);TB.testPropertyAddMonth();
        __CLR4_4_1194z194zlgchosju.R.inc(58530);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58531);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58532);TB.testPropertyAddWrapFieldMonth();
        __CLR4_4_1194z194zlgchosju.R.inc(58533);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58534);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58535);TB.testPropertySetMonth();
        __CLR4_4_1194z194zlgchosju.R.inc(58536);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58537);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58538);TB.testPropertySetTextMonth();
        __CLR4_4_1194z194zlgchosju.R.inc(58539);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58540);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58541);TB.testPropertyCompareToMonth();
        __CLR4_4_1194z194zlgchosju.R.inc(58542);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58543);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58544);TB.testPropertyGetDay();
        __CLR4_4_1194z194zlgchosju.R.inc(58545);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58546);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58547);TB.testPropertyGetMaxMinValuesDay();
        __CLR4_4_1194z194zlgchosju.R.inc(58548);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58549);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58550);TB.testPropertyAddDay();
        __CLR4_4_1194z194zlgchosju.R.inc(58551);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58552);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58553);TB.testPropertyAddWrapFieldDay();
        __CLR4_4_1194z194zlgchosju.R.inc(58554);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58555);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58556);TB.testPropertySetDay();
        __CLR4_4_1194z194zlgchosju.R.inc(58557);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58558);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58559);TB.testPropertySetTextDay();
        __CLR4_4_1194z194zlgchosju.R.inc(58560);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58561);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58562);TB.testPropertyWithMaximumValueDayOfMonth();
        __CLR4_4_1194z194zlgchosju.R.inc(58563);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58564);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58565);TB.testPropertyWithMinimumValueDayOfMonth();
        __CLR4_4_1194z194zlgchosju.R.inc(58566);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58567);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58568);TB.testPropertyCompareToDay();
        __CLR4_4_1194z194zlgchosju.R.inc(58569);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58570);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58571);TB.testPropertyEquals();
        __CLR4_4_1194z194zlgchosju.R.inc(58572);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58573);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58574);TB.testPropertyHashCode();
        __CLR4_4_1194z194zlgchosju.R.inc(58575);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58576);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58577);TB.testPropertyEqualsHashCodeLenient();
        __CLR4_4_1194z194zlgchosju.R.inc(58578);TB.tearDown();
        __CLR4_4_1194z194zlgchosju.R.inc(58579);TB.setUp();
        __CLR4_4_1194z194zlgchosju.R.inc(58580);TB.testPropertyEqualsHashCodeStrict();
        __CLR4_4_1194z194zlgchosju.R.inc(58581);TB.tearDown();

    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestYearMonthDay_Properties.class);
    }

    public TestYearMonthDay_Properties(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1194z194zlgchosju.R.inc(58582);
        __CLR4_4_1194z194zlgchosju.R.inc(58583);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1194z194zlgchosju.R.inc(58584);zone = DateTimeZone.getDefault();
        __CLR4_4_1194z194zlgchosju.R.inc(58585);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1194z194zlgchosju.R.inc(58586);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1194z194zlgchosju.R.inc(58587);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1194z194zlgchosju.R.inc(58588);
        __CLR4_4_1194z194zlgchosju.R.inc(58589);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1194z194zlgchosju.R.inc(58590);DateTimeZone.setDefault(zone);
        __CLR4_4_1194z194zlgchosju.R.inc(58591);zone = null;
        __CLR4_4_1194z194zlgchosju.R.inc(58592);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1194z194zlgchosju.R.inc(58593);systemDefaultLocale = null;
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetYear() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgqcqb197m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyGetYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgqcqb197m(){try{__CLR4_4_1194z194zlgchosju.R.inc(58594);
        __CLR4_4_1194z194zlgchosju.R.inc(58595);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58596);assertSame(test.getChronology().year(), test.year().getField());
        __CLR4_4_1194z194zlgchosju.R.inc(58597);assertEquals("year", test.year().getName());
        __CLR4_4_1194z194zlgchosju.R.inc(58598);assertEquals("Property[year]", test.year().toString());
        __CLR4_4_1194z194zlgchosju.R.inc(58599);assertSame(test, test.year().getReadablePartial());
        __CLR4_4_1194z194zlgchosju.R.inc(58600);assertSame(test, test.year().getYearMonthDay());
        __CLR4_4_1194z194zlgchosju.R.inc(58601);assertEquals(1972, test.year().get());
        __CLR4_4_1194z194zlgchosju.R.inc(58602);assertEquals("1972", test.year().getAsString());
        __CLR4_4_1194z194zlgchosju.R.inc(58603);assertEquals("1972", test.year().getAsText());
        __CLR4_4_1194z194zlgchosju.R.inc(58604);assertEquals("1972", test.year().getAsText(Locale.FRENCH));
        __CLR4_4_1194z194zlgchosju.R.inc(58605);assertEquals("1972", test.year().getAsShortText());
        __CLR4_4_1194z194zlgchosju.R.inc(58606);assertEquals("1972", test.year().getAsShortText(Locale.FRENCH));
        __CLR4_4_1194z194zlgchosju.R.inc(58607);assertEquals(test.getChronology().years(), test.year().getDurationField());
        __CLR4_4_1194z194zlgchosju.R.inc(58608);assertEquals(null, test.year().getRangeDurationField());
        __CLR4_4_1194z194zlgchosju.R.inc(58609);assertEquals(9, test.year().getMaximumTextLength(null));
        __CLR4_4_1194z194zlgchosju.R.inc(58610);assertEquals(9, test.year().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesYear() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12r9x9f1983();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyGetMaxMinValuesYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58611,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12r9x9f1983(){try{__CLR4_4_1194z194zlgchosju.R.inc(58611);
        __CLR4_4_1194z194zlgchosju.R.inc(58612);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58613);assertEquals(-292275054, test.year().getMinimumValue());
        __CLR4_4_1194z194zlgchosju.R.inc(58614);assertEquals(-292275054, test.year().getMinimumValueOverall());
        __CLR4_4_1194z194zlgchosju.R.inc(58615);assertEquals(292278993, test.year().getMaximumValue());
        __CLR4_4_1194z194zlgchosju.R.inc(58616);assertEquals(292278993, test.year().getMaximumValueOverall());
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertyAddYear() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c0tefy1989();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c0tefy1989(){try{__CLR4_4_1194z194zlgchosju.R.inc(58617);
        __CLR4_4_1194z194zlgchosju.R.inc(58618);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58619);YearMonthDay copy = test.year().addToCopy(9);
        __CLR4_4_1194z194zlgchosju.R.inc(58620);check(test, 1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58621);check(copy, 1981, 6, 9);

        __CLR4_4_1194z194zlgchosju.R.inc(58622);copy = test.year().addToCopy(0);
        __CLR4_4_1194z194zlgchosju.R.inc(58623);check(copy, 1972, 6, 9);

        __CLR4_4_1194z194zlgchosju.R.inc(58624);copy = test.year().addToCopy(292277023 - 1972);
        __CLR4_4_1194z194zlgchosju.R.inc(58625);check(copy, 292277023, 6, 9);

        __CLR4_4_1194z194zlgchosju.R.inc(58626);try {
            __CLR4_4_1194z194zlgchosju.R.inc(58627);test.year().addToCopy(292278993 - 1972 + 1);
            __CLR4_4_1194z194zlgchosju.R.inc(58628);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1194z194zlgchosju.R.inc(58629);check(test, 1972, 6, 9);

        __CLR4_4_1194z194zlgchosju.R.inc(58630);copy = test.year().addToCopy(-1972);
        __CLR4_4_1194z194zlgchosju.R.inc(58631);check(copy, 0, 6, 9);

        __CLR4_4_1194z194zlgchosju.R.inc(58632);copy = test.year().addToCopy(-1973);
        __CLR4_4_1194z194zlgchosju.R.inc(58633);check(copy, -1, 6, 9);

        __CLR4_4_1194z194zlgchosju.R.inc(58634);try {
            __CLR4_4_1194z194zlgchosju.R.inc(58635);test.year().addToCopy(-292275054 - 1972 - 1);
            __CLR4_4_1194z194zlgchosju.R.inc(58636);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1194z194zlgchosju.R.inc(58637);check(test, 1972, 6, 9);
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldYear() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qjgig6198u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddWrapFieldYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qjgig6198u(){try{__CLR4_4_1194z194zlgchosju.R.inc(58638);
        __CLR4_4_1194z194zlgchosju.R.inc(58639);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58640);YearMonthDay copy = test.year().addWrapFieldToCopy(9);
        __CLR4_4_1194z194zlgchosju.R.inc(58641);check(test, 1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58642);check(copy, 1981, 6, 9);

        __CLR4_4_1194z194zlgchosju.R.inc(58643);copy = test.year().addWrapFieldToCopy(0);
        __CLR4_4_1194z194zlgchosju.R.inc(58644);check(copy, 1972, 6, 9);

        __CLR4_4_1194z194zlgchosju.R.inc(58645);copy = test.year().addWrapFieldToCopy(292278993 - 1972 + 1);
        __CLR4_4_1194z194zlgchosju.R.inc(58646);check(copy, -292275054, 6, 9);

        __CLR4_4_1194z194zlgchosju.R.inc(58647);copy = test.year().addWrapFieldToCopy(-292275054 - 1972 - 1);
        __CLR4_4_1194z194zlgchosju.R.inc(58648);check(copy, 292278993, 6, 9);
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertySetYear() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b9ziwx1995();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertySetYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b9ziwx1995(){try{__CLR4_4_1194z194zlgchosju.R.inc(58649);
        __CLR4_4_1194z194zlgchosju.R.inc(58650);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58651);YearMonthDay copy = test.year().setCopy(12);
        __CLR4_4_1194z194zlgchosju.R.inc(58652);check(test, 1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58653);check(copy, 12, 6, 9);
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertySetTextYear() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11qaw4s199a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertySetTextYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11qaw4s199a(){try{__CLR4_4_1194z194zlgchosju.R.inc(58654);
        __CLR4_4_1194z194zlgchosju.R.inc(58655);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58656);YearMonthDay copy = test.year().setCopy("12");
        __CLR4_4_1194z194zlgchosju.R.inc(58657);check(test, 1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58658);check(copy, 12, 6, 9);
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToYear() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ft7ab199f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyCompareToYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ft7ab199f(){try{__CLR4_4_1194z194zlgchosju.R.inc(58659);
        __CLR4_4_1194z194zlgchosju.R.inc(58660);YearMonthDay test1 = new YearMonthDay(TEST_TIME1);
        __CLR4_4_1194z194zlgchosju.R.inc(58661);YearMonthDay test2 = new YearMonthDay(TEST_TIME2);
        __CLR4_4_1194z194zlgchosju.R.inc(58662);assertEquals(true, test1.year().compareTo(test2) < 0);
        __CLR4_4_1194z194zlgchosju.R.inc(58663);assertEquals(true, test2.year().compareTo(test1) > 0);
        __CLR4_4_1194z194zlgchosju.R.inc(58664);assertEquals(true, test1.year().compareTo(test1) == 0);
        __CLR4_4_1194z194zlgchosju.R.inc(58665);try {
            __CLR4_4_1194z194zlgchosju.R.inc(58666);test1.year().compareTo((ReadablePartial) null);
            __CLR4_4_1194z194zlgchosju.R.inc(58667);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1194z194zlgchosju.R.inc(58668);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1194z194zlgchosju.R.inc(58669);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1194z194zlgchosju.R.inc(58670);assertEquals(true, test1.year().compareTo(dt2) < 0);
        __CLR4_4_1194z194zlgchosju.R.inc(58671);assertEquals(true, test2.year().compareTo(dt1) > 0);
        __CLR4_4_1194z194zlgchosju.R.inc(58672);assertEquals(true, test1.year().compareTo(dt1) == 0);
        __CLR4_4_1194z194zlgchosju.R.inc(58673);try {
            __CLR4_4_1194z194zlgchosju.R.inc(58674);test1.year().compareTo((ReadableInstant) null);
            __CLR4_4_1194z194zlgchosju.R.inc(58675);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetMonth() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ox6q20199w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyGetMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ox6q20199w(){try{__CLR4_4_1194z194zlgchosju.R.inc(58676);
        __CLR4_4_1194z194zlgchosju.R.inc(58677);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58678);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField());
        __CLR4_4_1194z194zlgchosju.R.inc(58679);assertEquals("monthOfYear", test.monthOfYear().getName());
        __CLR4_4_1194z194zlgchosju.R.inc(58680);assertEquals("Property[monthOfYear]", test.monthOfYear().toString());
        __CLR4_4_1194z194zlgchosju.R.inc(58681);assertSame(test, test.monthOfYear().getReadablePartial());
        __CLR4_4_1194z194zlgchosju.R.inc(58682);assertSame(test, test.monthOfYear().getYearMonthDay());
        __CLR4_4_1194z194zlgchosju.R.inc(58683);assertEquals(6, test.monthOfYear().get());
        __CLR4_4_1194z194zlgchosju.R.inc(58684);assertEquals("6", test.monthOfYear().getAsString());
        __CLR4_4_1194z194zlgchosju.R.inc(58685);assertEquals("June", test.monthOfYear().getAsText());
        __CLR4_4_1194z194zlgchosju.R.inc(58686);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1194z194zlgchosju.R.inc(58687);assertEquals("Jun", test.monthOfYear().getAsShortText());
        __CLR4_4_1194z194zlgchosju.R.inc(58688);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1194z194zlgchosju.R.inc(58689);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField());
        __CLR4_4_1194z194zlgchosju.R.inc(58690);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField());
        __CLR4_4_1194z194zlgchosju.R.inc(58691);assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
        __CLR4_4_1194z194zlgchosju.R.inc(58692);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
        __CLR4_4_1194z194zlgchosju.R.inc(58693);test = new YearMonthDay(1972, 7, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58694);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1194z194zlgchosju.R.inc(58695);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH));
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesMonth() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gzdw819ag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyGetMaxMinValuesMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gzdw819ag(){try{__CLR4_4_1194z194zlgchosju.R.inc(58696);
        __CLR4_4_1194z194zlgchosju.R.inc(58697);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58698);assertEquals(1, test.monthOfYear().getMinimumValue());
        __CLR4_4_1194z194zlgchosju.R.inc(58699);assertEquals(1, test.monthOfYear().getMinimumValueOverall());
        __CLR4_4_1194z194zlgchosju.R.inc(58700);assertEquals(12, test.monthOfYear().getMaximumValue());
        __CLR4_4_1194z194zlgchosju.R.inc(58701);assertEquals(12, test.monthOfYear().getMaximumValueOverall());
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertyAddMonth() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12mc6tp19am();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12mc6tp19am(){try{__CLR4_4_1194z194zlgchosju.R.inc(58702);
        __CLR4_4_1194z194zlgchosju.R.inc(58703);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58704);YearMonthDay copy = test.monthOfYear().addToCopy(6);
        __CLR4_4_1194z194zlgchosju.R.inc(58705);check(test, 1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58706);check(copy, 1972, 12, 9);

        __CLR4_4_1194z194zlgchosju.R.inc(58707);copy = test.monthOfYear().addToCopy(7);
        __CLR4_4_1194z194zlgchosju.R.inc(58708);check(copy, 1973, 1, 9);

        __CLR4_4_1194z194zlgchosju.R.inc(58709);copy = test.monthOfYear().addToCopy(-5);
        __CLR4_4_1194z194zlgchosju.R.inc(58710);check(copy, 1972, 1, 9);

        __CLR4_4_1194z194zlgchosju.R.inc(58711);copy = test.monthOfYear().addToCopy(-6);
        __CLR4_4_1194z194zlgchosju.R.inc(58712);check(copy, 1971, 12, 9);

        __CLR4_4_1194z194zlgchosju.R.inc(58713);test = new YearMonthDay(1972, 1, 31);
        __CLR4_4_1194z194zlgchosju.R.inc(58714);copy = test.monthOfYear().addToCopy(1);
        __CLR4_4_1194z194zlgchosju.R.inc(58715);check(copy, 1972, 2, 29);

        __CLR4_4_1194z194zlgchosju.R.inc(58716);copy = test.monthOfYear().addToCopy(2);
        __CLR4_4_1194z194zlgchosju.R.inc(58717);check(copy, 1972, 3, 31);

        __CLR4_4_1194z194zlgchosju.R.inc(58718);copy = test.monthOfYear().addToCopy(3);
        __CLR4_4_1194z194zlgchosju.R.inc(58719);check(copy, 1972, 4, 30);

        __CLR4_4_1194z194zlgchosju.R.inc(58720);test = new YearMonthDay(1971, 1, 31);
        __CLR4_4_1194z194zlgchosju.R.inc(58721);copy = test.monthOfYear().addToCopy(1);
        __CLR4_4_1194z194zlgchosju.R.inc(58722);check(copy, 1971, 2, 28);
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldMonth() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eopsr519b7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddWrapFieldMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eopsr519b7(){try{__CLR4_4_1194z194zlgchosju.R.inc(58723);
        __CLR4_4_1194z194zlgchosju.R.inc(58724);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58725);YearMonthDay copy = test.monthOfYear().addWrapFieldToCopy(4);
        __CLR4_4_1194z194zlgchosju.R.inc(58726);check(test, 1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58727);check(copy, 1972, 10, 9);

        __CLR4_4_1194z194zlgchosju.R.inc(58728);copy = test.monthOfYear().addWrapFieldToCopy(8);
        __CLR4_4_1194z194zlgchosju.R.inc(58729);check(copy, 1972, 2, 9);

        __CLR4_4_1194z194zlgchosju.R.inc(58730);copy = test.monthOfYear().addWrapFieldToCopy(-8);
        __CLR4_4_1194z194zlgchosju.R.inc(58731);check(copy, 1972, 10, 9);

        __CLR4_4_1194z194zlgchosju.R.inc(58732);test = new YearMonthDay(1972, 1, 31);
        __CLR4_4_1194z194zlgchosju.R.inc(58733);copy = test.monthOfYear().addWrapFieldToCopy(1);
        __CLR4_4_1194z194zlgchosju.R.inc(58734);check(copy, 1972, 2, 29);

        __CLR4_4_1194z194zlgchosju.R.inc(58735);copy = test.monthOfYear().addWrapFieldToCopy(2);
        __CLR4_4_1194z194zlgchosju.R.inc(58736);check(copy, 1972, 3, 31);

        __CLR4_4_1194z194zlgchosju.R.inc(58737);copy = test.monthOfYear().addWrapFieldToCopy(3);
        __CLR4_4_1194z194zlgchosju.R.inc(58738);check(copy, 1972, 4, 30);

        __CLR4_4_1194z194zlgchosju.R.inc(58739);test = new YearMonthDay(1971, 1, 31);
        __CLR4_4_1194z194zlgchosju.R.inc(58740);copy = test.monthOfYear().addWrapFieldToCopy(1);
        __CLR4_4_1194z194zlgchosju.R.inc(58741);check(copy, 1971, 2, 28);
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertySetMonth() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19dfzhw19bq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertySetMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19dfzhw19bq(){try{__CLR4_4_1194z194zlgchosju.R.inc(58742);
        __CLR4_4_1194z194zlgchosju.R.inc(58743);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58744);YearMonthDay copy = test.monthOfYear().setCopy(12);
        __CLR4_4_1194z194zlgchosju.R.inc(58745);check(test, 1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58746);check(copy, 1972, 12, 9);

        __CLR4_4_1194z194zlgchosju.R.inc(58747);test = new YearMonthDay(1972, 1, 31);
        __CLR4_4_1194z194zlgchosju.R.inc(58748);copy = test.monthOfYear().setCopy(2);
        __CLR4_4_1194z194zlgchosju.R.inc(58749);check(copy, 1972, 2, 29);

        __CLR4_4_1194z194zlgchosju.R.inc(58750);try {
            __CLR4_4_1194z194zlgchosju.R.inc(58751);test.monthOfYear().setCopy(13);
            __CLR4_4_1194z194zlgchosju.R.inc(58752);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1194z194zlgchosju.R.inc(58753);try {
            __CLR4_4_1194z194zlgchosju.R.inc(58754);test.monthOfYear().setCopy(0);
            __CLR4_4_1194z194zlgchosju.R.inc(58755);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertySetTextMonth() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wb5cw119c4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertySetTextMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58756,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wb5cw119c4(){try{__CLR4_4_1194z194zlgchosju.R.inc(58756);
        __CLR4_4_1194z194zlgchosju.R.inc(58757);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58758);YearMonthDay copy = test.monthOfYear().setCopy("12");
        __CLR4_4_1194z194zlgchosju.R.inc(58759);check(test, 1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58760);check(copy, 1972, 12, 9);

        __CLR4_4_1194z194zlgchosju.R.inc(58761);copy = test.monthOfYear().setCopy("December");
        __CLR4_4_1194z194zlgchosju.R.inc(58762);check(test, 1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58763);check(copy, 1972, 12, 9);

        __CLR4_4_1194z194zlgchosju.R.inc(58764);copy = test.monthOfYear().setCopy("Dec");
        __CLR4_4_1194z194zlgchosju.R.inc(58765);check(test, 1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58766);check(copy, 1972, 12, 9);
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToMonth() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sjk8wi19cf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyCompareToMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58767,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sjk8wi19cf(){try{__CLR4_4_1194z194zlgchosju.R.inc(58767);
        __CLR4_4_1194z194zlgchosju.R.inc(58768);YearMonthDay test1 = new YearMonthDay(TEST_TIME1);
        __CLR4_4_1194z194zlgchosju.R.inc(58769);YearMonthDay test2 = new YearMonthDay(TEST_TIME2);
        __CLR4_4_1194z194zlgchosju.R.inc(58770);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0);
        __CLR4_4_1194z194zlgchosju.R.inc(58771);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0);
        __CLR4_4_1194z194zlgchosju.R.inc(58772);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0);
        __CLR4_4_1194z194zlgchosju.R.inc(58773);try {
            __CLR4_4_1194z194zlgchosju.R.inc(58774);test1.monthOfYear().compareTo((ReadablePartial) null);
            __CLR4_4_1194z194zlgchosju.R.inc(58775);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1194z194zlgchosju.R.inc(58776);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1194z194zlgchosju.R.inc(58777);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1194z194zlgchosju.R.inc(58778);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0);
        __CLR4_4_1194z194zlgchosju.R.inc(58779);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0);
        __CLR4_4_1194z194zlgchosju.R.inc(58780);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0);
        __CLR4_4_1194z194zlgchosju.R.inc(58781);try {
            __CLR4_4_1194z194zlgchosju.R.inc(58782);test1.monthOfYear().compareTo((ReadableInstant) null);
            __CLR4_4_1194z194zlgchosju.R.inc(58783);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetDay() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1akcm7o19cw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyGetDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1akcm7o19cw(){try{__CLR4_4_1194z194zlgchosju.R.inc(58784);
        __CLR4_4_1194z194zlgchosju.R.inc(58785);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58786);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField());
        __CLR4_4_1194z194zlgchosju.R.inc(58787);assertEquals("dayOfMonth", test.dayOfMonth().getName());
        __CLR4_4_1194z194zlgchosju.R.inc(58788);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString());
        __CLR4_4_1194z194zlgchosju.R.inc(58789);assertSame(test, test.dayOfMonth().getReadablePartial());
        __CLR4_4_1194z194zlgchosju.R.inc(58790);assertSame(test, test.dayOfMonth().getYearMonthDay());
        __CLR4_4_1194z194zlgchosju.R.inc(58791);assertEquals(9, test.dayOfMonth().get());
        __CLR4_4_1194z194zlgchosju.R.inc(58792);assertEquals("9", test.dayOfMonth().getAsString());
        __CLR4_4_1194z194zlgchosju.R.inc(58793);assertEquals("9", test.dayOfMonth().getAsText());
        __CLR4_4_1194z194zlgchosju.R.inc(58794);assertEquals("9", test.dayOfMonth().getAsText(Locale.FRENCH));
        __CLR4_4_1194z194zlgchosju.R.inc(58795);assertEquals("9", test.dayOfMonth().getAsShortText());
        __CLR4_4_1194z194zlgchosju.R.inc(58796);assertEquals("9", test.dayOfMonth().getAsShortText(Locale.FRENCH));
        __CLR4_4_1194z194zlgchosju.R.inc(58797);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField());
        __CLR4_4_1194z194zlgchosju.R.inc(58798);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField());
        __CLR4_4_1194z194zlgchosju.R.inc(58799);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null));
        __CLR4_4_1194z194zlgchosju.R.inc(58800);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesDay() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_141l7p819dd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyGetMaxMinValuesDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_141l7p819dd(){try{__CLR4_4_1194z194zlgchosju.R.inc(58801);
        __CLR4_4_1194z194zlgchosju.R.inc(58802);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58803);assertEquals(1, test.dayOfMonth().getMinimumValue());
        __CLR4_4_1194z194zlgchosju.R.inc(58804);assertEquals(1, test.dayOfMonth().getMinimumValueOverall());
        __CLR4_4_1194z194zlgchosju.R.inc(58805);assertEquals(30, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1194z194zlgchosju.R.inc(58806);assertEquals(31, test.dayOfMonth().getMaximumValueOverall());
        __CLR4_4_1194z194zlgchosju.R.inc(58807);test = new YearMonthDay(1972, 7, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58808);assertEquals(31, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1194z194zlgchosju.R.inc(58809);test = new YearMonthDay(1972, 2, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58810);assertEquals(29, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1194z194zlgchosju.R.inc(58811);test = new YearMonthDay(1971, 2, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58812);assertEquals(28, test.dayOfMonth().getMaximumValue());
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertyAddDay() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_134mrvt19dp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58813,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_134mrvt19dp(){try{__CLR4_4_1194z194zlgchosju.R.inc(58813);
        __CLR4_4_1194z194zlgchosju.R.inc(58814);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58815);YearMonthDay copy = test.dayOfMonth().addToCopy(9);
        __CLR4_4_1194z194zlgchosju.R.inc(58816);check(test, 1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58817);check(copy, 1972, 6, 18);

        __CLR4_4_1194z194zlgchosju.R.inc(58818);copy = test.dayOfMonth().addToCopy(21);
        __CLR4_4_1194z194zlgchosju.R.inc(58819);check(copy, 1972, 6, 30);

        __CLR4_4_1194z194zlgchosju.R.inc(58820);copy = test.dayOfMonth().addToCopy(22);
        __CLR4_4_1194z194zlgchosju.R.inc(58821);check(copy, 1972, 7, 1);

        __CLR4_4_1194z194zlgchosju.R.inc(58822);copy = test.dayOfMonth().addToCopy(22 + 30);
        __CLR4_4_1194z194zlgchosju.R.inc(58823);check(copy, 1972, 7, 31);

        __CLR4_4_1194z194zlgchosju.R.inc(58824);copy = test.dayOfMonth().addToCopy(22 + 31);
        __CLR4_4_1194z194zlgchosju.R.inc(58825);check(copy, 1972, 8, 1);

        __CLR4_4_1194z194zlgchosju.R.inc(58826);copy = test.dayOfMonth().addToCopy(21 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_1194z194zlgchosju.R.inc(58827);check(copy, 1972, 12, 31);

        __CLR4_4_1194z194zlgchosju.R.inc(58828);copy = test.dayOfMonth().addToCopy(22 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_1194z194zlgchosju.R.inc(58829);check(copy, 1973, 1, 1);

        __CLR4_4_1194z194zlgchosju.R.inc(58830);copy = test.dayOfMonth().addToCopy(-8);
        __CLR4_4_1194z194zlgchosju.R.inc(58831);check(copy, 1972, 6, 1);

        __CLR4_4_1194z194zlgchosju.R.inc(58832);copy = test.dayOfMonth().addToCopy(-9);
        __CLR4_4_1194z194zlgchosju.R.inc(58833);check(copy, 1972, 5, 31);

        __CLR4_4_1194z194zlgchosju.R.inc(58834);copy = test.dayOfMonth().addToCopy(-8 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_1194z194zlgchosju.R.inc(58835);check(copy, 1972, 1, 1);

        __CLR4_4_1194z194zlgchosju.R.inc(58836);copy = test.dayOfMonth().addToCopy(-9 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_1194z194zlgchosju.R.inc(58837);check(copy, 1971, 12, 31);
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldDay() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16gtoml19ee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddWrapFieldDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16gtoml19ee(){try{__CLR4_4_1194z194zlgchosju.R.inc(58838);
        __CLR4_4_1194z194zlgchosju.R.inc(58839);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58840);YearMonthDay copy = test.dayOfMonth().addWrapFieldToCopy(21);
        __CLR4_4_1194z194zlgchosju.R.inc(58841);check(test, 1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58842);check(copy, 1972, 6, 30);

        __CLR4_4_1194z194zlgchosju.R.inc(58843);copy = test.dayOfMonth().addWrapFieldToCopy(22);
        __CLR4_4_1194z194zlgchosju.R.inc(58844);check(copy, 1972, 6, 1);

        __CLR4_4_1194z194zlgchosju.R.inc(58845);copy = test.dayOfMonth().addWrapFieldToCopy(-12);
        __CLR4_4_1194z194zlgchosju.R.inc(58846);check(copy, 1972, 6, 27);

        __CLR4_4_1194z194zlgchosju.R.inc(58847);test = new YearMonthDay(1972, 7, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58848);copy = test.dayOfMonth().addWrapFieldToCopy(21);
        __CLR4_4_1194z194zlgchosju.R.inc(58849);check(copy, 1972, 7, 30);

        __CLR4_4_1194z194zlgchosju.R.inc(58850);copy = test.dayOfMonth().addWrapFieldToCopy(22);
        __CLR4_4_1194z194zlgchosju.R.inc(58851);check(copy, 1972, 7, 31);

        __CLR4_4_1194z194zlgchosju.R.inc(58852);copy = test.dayOfMonth().addWrapFieldToCopy(23);
        __CLR4_4_1194z194zlgchosju.R.inc(58853);check(copy, 1972, 7, 1);

        __CLR4_4_1194z194zlgchosju.R.inc(58854);copy = test.dayOfMonth().addWrapFieldToCopy(-12);
        __CLR4_4_1194z194zlgchosju.R.inc(58855);check(copy, 1972, 7, 28);
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertySetDay() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14hvyxk19ew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertySetDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58856,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14hvyxk19ew(){try{__CLR4_4_1194z194zlgchosju.R.inc(58856);
        __CLR4_4_1194z194zlgchosju.R.inc(58857);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58858);YearMonthDay copy = test.dayOfMonth().setCopy(12);
        __CLR4_4_1194z194zlgchosju.R.inc(58859);check(test, 1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58860);check(copy, 1972, 6, 12);

        __CLR4_4_1194z194zlgchosju.R.inc(58861);try {
            __CLR4_4_1194z194zlgchosju.R.inc(58862);test.dayOfMonth().setCopy(31);
            __CLR4_4_1194z194zlgchosju.R.inc(58863);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1194z194zlgchosju.R.inc(58864);try {
            __CLR4_4_1194z194zlgchosju.R.inc(58865);test.dayOfMonth().setCopy(0);
            __CLR4_4_1194z194zlgchosju.R.inc(58866);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertySetTextDay() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11sallx19f7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertySetTextDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11sallx19f7(){try{__CLR4_4_1194z194zlgchosju.R.inc(58867);
        __CLR4_4_1194z194zlgchosju.R.inc(58868);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58869);YearMonthDay copy = test.dayOfMonth().setCopy("12");
        __CLR4_4_1194z194zlgchosju.R.inc(58870);check(test, 1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58871);check(copy, 1972, 6, 12);
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertyWithMaximumValueDayOfMonth() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2wa9e19fc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyWithMaximumValueDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2wa9e19fc(){try{__CLR4_4_1194z194zlgchosju.R.inc(58872);
        __CLR4_4_1194z194zlgchosju.R.inc(58873);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58874);YearMonthDay copy = test.dayOfMonth().withMaximumValue();
        __CLR4_4_1194z194zlgchosju.R.inc(58875);check(test, 1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58876);check(copy, 1972, 6, 30);
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertyWithMinimumValueDayOfMonth() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1duofek19fh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyWithMinimumValueDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58877,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1duofek19fh(){try{__CLR4_4_1194z194zlgchosju.R.inc(58877);
        __CLR4_4_1194z194zlgchosju.R.inc(58878);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58879);YearMonthDay copy = test.dayOfMonth().withMinimumValue();
        __CLR4_4_1194z194zlgchosju.R.inc(58880);check(test, 1972, 6, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58881);check(copy, 1972, 6, 1);
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToDay() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19lmfre19fm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyCompareToDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19lmfre19fm(){try{__CLR4_4_1194z194zlgchosju.R.inc(58882);
        __CLR4_4_1194z194zlgchosju.R.inc(58883);YearMonthDay test1 = new YearMonthDay(TEST_TIME1);
        __CLR4_4_1194z194zlgchosju.R.inc(58884);YearMonthDay test2 = new YearMonthDay(TEST_TIME2);
        __CLR4_4_1194z194zlgchosju.R.inc(58885);assertEquals(true, test1.dayOfMonth().compareTo(test2) < 0);
        __CLR4_4_1194z194zlgchosju.R.inc(58886);assertEquals(true, test2.dayOfMonth().compareTo(test1) > 0);
        __CLR4_4_1194z194zlgchosju.R.inc(58887);assertEquals(true, test1.dayOfMonth().compareTo(test1) == 0);
        __CLR4_4_1194z194zlgchosju.R.inc(58888);try {
            __CLR4_4_1194z194zlgchosju.R.inc(58889);test1.dayOfMonth().compareTo((ReadablePartial) null);
            __CLR4_4_1194z194zlgchosju.R.inc(58890);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1194z194zlgchosju.R.inc(58891);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1194z194zlgchosju.R.inc(58892);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1194z194zlgchosju.R.inc(58893);assertEquals(true, test1.dayOfMonth().compareTo(dt2) < 0);
        __CLR4_4_1194z194zlgchosju.R.inc(58894);assertEquals(true, test2.dayOfMonth().compareTo(dt1) > 0);
        __CLR4_4_1194z194zlgchosju.R.inc(58895);assertEquals(true, test1.dayOfMonth().compareTo(dt1) == 0);
        __CLR4_4_1194z194zlgchosju.R.inc(58896);try {
            __CLR4_4_1194z194zlgchosju.R.inc(58897);test1.dayOfMonth().compareTo((ReadableInstant) null);
            __CLR4_4_1194z194zlgchosju.R.inc(58898);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertyEquals() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2ub0z19g3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58899,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2ub0z19g3(){try{__CLR4_4_1194z194zlgchosju.R.inc(58899);
        __CLR4_4_1194z194zlgchosju.R.inc(58900);YearMonthDay test1 = new YearMonthDay(2005, 11, 8);
        __CLR4_4_1194z194zlgchosju.R.inc(58901);YearMonthDay test2 = new YearMonthDay(2005, 11, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58902);YearMonthDay test3 = new YearMonthDay(2005, 11, 8, CopticChronology.getInstanceUTC());
        __CLR4_4_1194z194zlgchosju.R.inc(58903);assertEquals(false, test1.dayOfMonth().equals(test1.year()));
        __CLR4_4_1194z194zlgchosju.R.inc(58904);assertEquals(false, test1.dayOfMonth().equals(test1.monthOfYear()));
        __CLR4_4_1194z194zlgchosju.R.inc(58905);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1194z194zlgchosju.R.inc(58906);assertEquals(false, test1.dayOfMonth().equals(test2.year()));
        __CLR4_4_1194z194zlgchosju.R.inc(58907);assertEquals(false, test1.dayOfMonth().equals(test2.monthOfYear()));
        __CLR4_4_1194z194zlgchosju.R.inc(58908);assertEquals(false, test1.dayOfMonth().equals(test2.dayOfMonth()));

        __CLR4_4_1194z194zlgchosju.R.inc(58909);assertEquals(false, test1.monthOfYear().equals(test1.year()));
        __CLR4_4_1194z194zlgchosju.R.inc(58910);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear()));
        __CLR4_4_1194z194zlgchosju.R.inc(58911);assertEquals(false, test1.monthOfYear().equals(test1.dayOfMonth()));
        __CLR4_4_1194z194zlgchosju.R.inc(58912);assertEquals(false, test1.monthOfYear().equals(test2.year()));
        __CLR4_4_1194z194zlgchosju.R.inc(58913);assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear()));
        __CLR4_4_1194z194zlgchosju.R.inc(58914);assertEquals(false, test1.monthOfYear().equals(test2.dayOfMonth()));

        __CLR4_4_1194z194zlgchosju.R.inc(58915);assertEquals(false, test1.dayOfMonth().equals(null));
        __CLR4_4_1194z194zlgchosju.R.inc(58916);assertEquals(false, test1.dayOfMonth().equals("any"));

        // chrono
        __CLR4_4_1194z194zlgchosju.R.inc(58917);assertEquals(false, test1.dayOfMonth().equals(test3.dayOfMonth()));
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertyHashCode() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y278s719gm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y278s719gm(){try{__CLR4_4_1194z194zlgchosju.R.inc(58918);
        __CLR4_4_1194z194zlgchosju.R.inc(58919);YearMonthDay test1 = new YearMonthDay(2005, 11, 8);
        __CLR4_4_1194z194zlgchosju.R.inc(58920);YearMonthDay test2 = new YearMonthDay(2005, 11, 9);
        __CLR4_4_1194z194zlgchosju.R.inc(58921);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1194z194zlgchosju.R.inc(58922);assertEquals(false, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1194z194zlgchosju.R.inc(58923);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode());
        __CLR4_4_1194z194zlgchosju.R.inc(58924);assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertyEqualsHashCodeLenient() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xoanxf19gt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyEqualsHashCodeLenient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xoanxf19gt(){try{__CLR4_4_1194z194zlgchosju.R.inc(58925);
        __CLR4_4_1194z194zlgchosju.R.inc(58926);YearMonthDay test1 = new YearMonthDay(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1194z194zlgchosju.R.inc(58927);YearMonthDay test2 = new YearMonthDay(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1194z194zlgchosju.R.inc(58928);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1194z194zlgchosju.R.inc(58929);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1194z194zlgchosju.R.inc(58930);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1194z194zlgchosju.R.inc(58931);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1194z194zlgchosju.R.inc(58932);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1194z194zlgchosju.R.inc(58933);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1194z194zlgchosju.R.inc(58934);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    @Test
    public void testPropertyEqualsHashCodeStrict() {__CLR4_4_1194z194zlgchosju.R.globalSliceStart(getClass().getName(),58935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ev6icv19h3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1194z194zlgchosju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1194z194zlgchosju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyEqualsHashCodeStrict",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58935,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ev6icv19h3(){try{__CLR4_4_1194z194zlgchosju.R.inc(58935);
        __CLR4_4_1194z194zlgchosju.R.inc(58936);YearMonthDay test1 = new YearMonthDay(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1194z194zlgchosju.R.inc(58937);YearMonthDay test2 = new YearMonthDay(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1194z194zlgchosju.R.inc(58938);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1194z194zlgchosju.R.inc(58939);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1194z194zlgchosju.R.inc(58940);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1194z194zlgchosju.R.inc(58941);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1194z194zlgchosju.R.inc(58942);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1194z194zlgchosju.R.inc(58943);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1194z194zlgchosju.R.inc(58944);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(YearMonthDay test, int year, int month, int day) {try{__CLR4_4_1194z194zlgchosju.R.inc(58945);
        __CLR4_4_1194z194zlgchosju.R.inc(58946);assertEquals(year, test.getYear());
        __CLR4_4_1194z194zlgchosju.R.inc(58947);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1194z194zlgchosju.R.inc(58948);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1194z194zlgchosju.R.flushNeeded();}}
}
