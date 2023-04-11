/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2011 Stephen Colebourne
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
 * This class is a Junit unit test for MonthDay. Based on {@link TestYearMonth_Propeties}
 */
public class TestMonthDay_Properties {static class __CLR4_4_1xgzxgzlgchos5r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,43648,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

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
    private Locale locale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_1xgzxgzlgchos5r.R.inc(43379);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43380);TestMonthDay_Properties TB = new TestMonthDay_Properties();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43381);TB.setUp();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43382);TB.testPropertyGetMonthOfYear();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43383);TB.tearDown();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43384);TB.setUp();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43385);TB.testPropertyGetMaxMinValuesMonthOfYear();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43386);TB.tearDown();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43387);TB.setUp();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43388);TB.testPropertyAddMonthOfYear();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43389);TB.tearDown();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43390);TB.setUp();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43391);TB.testPropertyAddWrapFieldMonthOfYear();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43392);TB.tearDown();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43393);TB.setUp();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43394);TB.testPropertySetMonthOfYear();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43395);TB.tearDown();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43396);TB.setUp();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43397);TB.testPropertySetTextMonthOfYear();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43398);TB.tearDown();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43399);TB.setUp();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43400);TB.testPropertyCompareToMonthOfYear();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43401);TB.tearDown();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43402);TB.setUp();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43403);TB.testPropertyGetDayOfMonth();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43404);TB.tearDown();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43405);TB.setUp();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43406);TB.testPropertyGetMaxMinValuesDayOfMonth();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43407);TB.tearDown();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43408);TB.setUp();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43409);TB.testPropertyAddDayOfMonth();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43410);TB.tearDown();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43411);TB.setUp();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43412);TB.testPropertyAddWrapFieldDayOfMonth();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43413);TB.tearDown();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43414);TB.setUp();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43415);TB.testPropertySetDayOfMonth();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43416);TB.tearDown();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43417);TB.setUp();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43418);TB.testPropertySetTextDayOfMonth();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43419);TB.tearDown();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43420);TB.setUp();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43421);TB.testPropertyCompareToDayOfMonth();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43422);TB.tearDown();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43423);TB.setUp();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43424);TB.testPropertyEquals();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43425);TB.tearDown();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43426);TB.setUp();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43427);TB.testPropertyHashCode();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43428);TB.tearDown();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43429);TB.setUp();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43430);TB.testPropertyEqualsHashCodeLenient();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43431);TB.tearDown();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43432);TB.setUp();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43433);TB.testPropertyEqualsHashCodeStrict();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43434);TB.tearDown();

    }finally{__CLR4_4_1xgzxgzlgchos5r.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestMonthDay_Properties.class);
    }

    public TestMonthDay_Properties(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1xgzxgzlgchos5r.R.inc(43435);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43436);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43437);zone = DateTimeZone.getDefault();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43438);locale = Locale.getDefault();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43439);Locale.setDefault(Locale.UK);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43440);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_1xgzxgzlgchos5r.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1xgzxgzlgchos5r.R.inc(43441);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43442);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43443);DateTimeZone.setDefault(zone);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43444);zone = null;
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43445);Locale.setDefault(locale);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43446);locale = null;
    }finally{__CLR4_4_1xgzxgzlgchos5r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetMonthOfYear() {__CLR4_4_1xgzxgzlgchos5r.R.globalSliceStart(getClass().getName(),43447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_140q40kxiv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xgzxgzlgchos5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xgzxgzlgchos5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyGetMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_140q40kxiv(){try{__CLR4_4_1xgzxgzlgchos5r.R.inc(43447);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43448);MonthDay test = new MonthDay(9, 6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43449);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43450);assertEquals("monthOfYear", test.monthOfYear().getName());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43451);assertEquals("Property[monthOfYear]", test.monthOfYear().toString());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43452);assertSame(test, test.monthOfYear().getReadablePartial());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43453);assertSame(test, test.monthOfYear().getMonthDay());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43454);assertEquals(9, test.monthOfYear().get());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43455);assertEquals("9", test.monthOfYear().getAsString());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43456);assertEquals("September", test.monthOfYear().getAsText());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43457);assertEquals("septembre", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43458);assertEquals("Sep", test.monthOfYear().getAsShortText());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43459);assertEquals("sept.", test.monthOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43460);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField());
        // assertEquals(test.getChronology().days(), test.dayOfMonth().getRangeDurationField());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43461);assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43462);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1xgzxgzlgchos5r.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesMonthOfYear() {__CLR4_4_1xgzxgzlgchos5r.R.globalSliceStart(getClass().getName(),43463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hpcsqsxjb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xgzxgzlgchos5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xgzxgzlgchos5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyGetMaxMinValuesMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hpcsqsxjb(){try{__CLR4_4_1xgzxgzlgchos5r.R.inc(43463);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43464);MonthDay test = new MonthDay(10, 6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43465);assertEquals(1, test.monthOfYear().getMinimumValue());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43466);assertEquals(1, test.monthOfYear().getMinimumValueOverall());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43467);assertEquals(12, test.monthOfYear().getMaximumValue());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43468);assertEquals(12, test.monthOfYear().getMaximumValueOverall());
    }finally{__CLR4_4_1xgzxgzlgchos5r.R.flushNeeded();}}

    @Test
    public void testPropertyAddMonthOfYear() {__CLR4_4_1xgzxgzlgchos5r.R.globalSliceStart(getClass().getName(),43469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cfd7jxjh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xgzxgzlgchos5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xgzxgzlgchos5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cfd7jxjh(){try{__CLR4_4_1xgzxgzlgchos5r.R.inc(43469);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43470);MonthDay test = new MonthDay(3, 6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43471);MonthDay copy = test.monthOfYear().addToCopy(9);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43472);check(test, 3, 6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43473);check(copy, 12, 6);

        __CLR4_4_1xgzxgzlgchos5r.R.inc(43474);copy = test.monthOfYear().addToCopy(0);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43475);check(copy, 3, 6);

        __CLR4_4_1xgzxgzlgchos5r.R.inc(43476);check(test, 3, 6);

        __CLR4_4_1xgzxgzlgchos5r.R.inc(43477);copy = test.monthOfYear().addToCopy(-3);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43478);check(copy, 12, 6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43479);check(test, 3, 6);
    }finally{__CLR4_4_1xgzxgzlgchos5r.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldMonthOfYear() {__CLR4_4_1xgzxgzlgchos5r.R.globalSliceStart(getClass().getName(),43480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1phvuslxjs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xgzxgzlgchos5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xgzxgzlgchos5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddWrapFieldMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1phvuslxjs(){try{__CLR4_4_1xgzxgzlgchos5r.R.inc(43480);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43481);MonthDay test = new MonthDay(5, 6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43482);MonthDay copy = test.monthOfYear().addWrapFieldToCopy(2);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43483);check(test, 5, 6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43484);check(copy, 7, 6);

        __CLR4_4_1xgzxgzlgchos5r.R.inc(43485);copy = test.monthOfYear().addWrapFieldToCopy(2);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43486);check(copy, 7, 6);

        __CLR4_4_1xgzxgzlgchos5r.R.inc(43487);copy = test.monthOfYear().addWrapFieldToCopy(292278993 - 4 + 1);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43488);check(copy, 11, 6);

        __CLR4_4_1xgzxgzlgchos5r.R.inc(43489);copy = test.monthOfYear().addWrapFieldToCopy(-292275054 - 4 - 1);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43490);check(copy, 6, 6);
    }finally{__CLR4_4_1xgzxgzlgchos5r.R.flushNeeded();}}

    @Test
    public void testPropertySetMonthOfYear() {__CLR4_4_1xgzxgzlgchos5r.R.globalSliceStart(getClass().getName(),43491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x2imu8xk3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xgzxgzlgchos5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xgzxgzlgchos5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertySetMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x2imu8xk3(){try{__CLR4_4_1xgzxgzlgchos5r.R.inc(43491);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43492);MonthDay test = new MonthDay(10, 6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43493);MonthDay copy = test.monthOfYear().setCopy(12);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43494);check(test, 10, 6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43495);check(copy, 12, 6);
    }finally{__CLR4_4_1xgzxgzlgchos5r.R.flushNeeded();}}

    @Test
    public void testPropertySetTextMonthOfYear() {__CLR4_4_1xgzxgzlgchos5r.R.globalSliceStart(getClass().getName(),43496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kzotlfxk8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xgzxgzlgchos5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xgzxgzlgchos5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertySetTextMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43496,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kzotlfxk8(){try{__CLR4_4_1xgzxgzlgchos5r.R.inc(43496);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43497);MonthDay test = new MonthDay(10, 6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43498);MonthDay copy = test.monthOfYear().setCopy("12");
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43499);check(test, 10, 6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43500);check(copy, 12, 6);
    }finally{__CLR4_4_1xgzxgzlgchos5r.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToMonthOfYear() {__CLR4_4_1xgzxgzlgchos5r.R.globalSliceStart(getClass().getName(),43501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9bnr6xkd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xgzxgzlgchos5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xgzxgzlgchos5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyCompareToMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43501,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9bnr6xkd(){try{__CLR4_4_1xgzxgzlgchos5r.R.inc(43501);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43502);MonthDay test1 = new MonthDay(TEST_TIME1);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43503);MonthDay test2 = new MonthDay(TEST_TIME2);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43504);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43505);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43506);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43507);try {
            __CLR4_4_1xgzxgzlgchos5r.R.inc(43508);test1.monthOfYear().compareTo((ReadablePartial) null);
            __CLR4_4_1xgzxgzlgchos5r.R.inc(43509);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1xgzxgzlgchos5r.R.inc(43510);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43511);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43512);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43513);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43514);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43515);try {
            __CLR4_4_1xgzxgzlgchos5r.R.inc(43516);test1.monthOfYear().compareTo((ReadableInstant) null);
            __CLR4_4_1xgzxgzlgchos5r.R.inc(43517);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1xgzxgzlgchos5r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetDayOfMonth() {__CLR4_4_1xgzxgzlgchos5r.R.globalSliceStart(getClass().getName(),43518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1198qu5xku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xgzxgzlgchos5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xgzxgzlgchos5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyGetDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1198qu5xku(){try{__CLR4_4_1xgzxgzlgchos5r.R.inc(43518);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43519);MonthDay test = new MonthDay(4, 6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43520);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43521);assertEquals("dayOfMonth", test.dayOfMonth().getName());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43522);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43523);assertSame(test, test.dayOfMonth().getReadablePartial());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43524);assertSame(test, test.dayOfMonth().getMonthDay());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43525);assertEquals(6, test.dayOfMonth().get());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43526);assertEquals("6", test.dayOfMonth().getAsString());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43527);assertEquals("6", test.dayOfMonth().getAsText());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43528);assertEquals("6", test.dayOfMonth().getAsText(Locale.FRENCH));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43529);assertEquals("6", test.dayOfMonth().getAsShortText());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43530);assertEquals("6", test.dayOfMonth().getAsShortText(Locale.FRENCH));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43531);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43532);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43533);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43534);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43535);test = new MonthDay(4, 7);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43536);assertEquals("7", test.dayOfMonth().getAsText(Locale.FRENCH));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43537);assertEquals("7", test.dayOfMonth().getAsShortText(Locale.FRENCH));
    }finally{__CLR4_4_1xgzxgzlgchos5r.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesDayOfMonth() {__CLR4_4_1xgzxgzlgchos5r.R.globalSliceStart(getClass().getName(),43538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zmdrhxle();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xgzxgzlgchos5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xgzxgzlgchos5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyGetMaxMinValuesDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43538,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zmdrhxle(){try{__CLR4_4_1xgzxgzlgchos5r.R.inc(43538);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43539);MonthDay test = new MonthDay(4, 6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43540);assertEquals(1, test.dayOfMonth().getMinimumValue());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43541);assertEquals(1, test.dayOfMonth().getMinimumValueOverall());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43542);assertEquals(30, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43543);assertEquals(31, test.dayOfMonth().getMaximumValueOverall());
    }finally{__CLR4_4_1xgzxgzlgchos5r.R.flushNeeded();}}

    @Test
    public void testPropertyAddDayOfMonth() {__CLR4_4_1xgzxgzlgchos5r.R.globalSliceStart(getClass().getName(),43544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o1ulyqxlk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xgzxgzlgchos5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xgzxgzlgchos5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o1ulyqxlk(){try{__CLR4_4_1xgzxgzlgchos5r.R.inc(43544);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43545);MonthDay test = new MonthDay(4, 6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43546);MonthDay copy = test.dayOfMonth().addToCopy(6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43547);check(test, 4, 6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43548);check(copy, 4, 12);

        __CLR4_4_1xgzxgzlgchos5r.R.inc(43549);copy = test.dayOfMonth().addToCopy(7);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43550);check(copy, 4, 13);

        __CLR4_4_1xgzxgzlgchos5r.R.inc(43551);copy = test.dayOfMonth().addToCopy(-5);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43552);check(copy, 4, 1);

        __CLR4_4_1xgzxgzlgchos5r.R.inc(43553);copy = test.dayOfMonth().addToCopy(-6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43554);check(copy, 3, 31);
    }finally{__CLR4_4_1xgzxgzlgchos5r.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldDayOfMonth() {__CLR4_4_1xgzxgzlgchos5r.R.globalSliceStart(getClass().getName(),43555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dfyjyixlv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xgzxgzlgchos5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xgzxgzlgchos5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddWrapFieldDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dfyjyixlv(){try{__CLR4_4_1xgzxgzlgchos5r.R.inc(43555);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43556);MonthDay test = new MonthDay(4, 6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43557);MonthDay copy = test.dayOfMonth().addWrapFieldToCopy(4);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43558);check(test, 4, 6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43559);check(copy, 4, 10);

        __CLR4_4_1xgzxgzlgchos5r.R.inc(43560);copy = test.dayOfMonth().addWrapFieldToCopy(8);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43561);check(copy, 4, 14);

        __CLR4_4_1xgzxgzlgchos5r.R.inc(43562);copy = test.dayOfMonth().addWrapFieldToCopy(-8);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43563);check(copy, 4, 28);
    }finally{__CLR4_4_1xgzxgzlgchos5r.R.flushNeeded();}}

    @Test
    public void testPropertySetDayOfMonth() {__CLR4_4_1xgzxgzlgchos5r.R.globalSliceStart(getClass().getName(),43564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mz1n4hxm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xgzxgzlgchos5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xgzxgzlgchos5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertySetDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mz1n4hxm4(){try{__CLR4_4_1xgzxgzlgchos5r.R.inc(43564);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43565);MonthDay test = new MonthDay(4, 6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43566);MonthDay copy = test.dayOfMonth().setCopy(12);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43567);check(test, 4, 6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43568);check(copy, 4, 12);

        __CLR4_4_1xgzxgzlgchos5r.R.inc(43569);try {
            __CLR4_4_1xgzxgzlgchos5r.R.inc(43570);test.dayOfMonth().setCopy(33);
            __CLR4_4_1xgzxgzlgchos5r.R.inc(43571);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43572);try {
            __CLR4_4_1xgzxgzlgchos5r.R.inc(43573);test.dayOfMonth().setCopy(0);
            __CLR4_4_1xgzxgzlgchos5r.R.inc(43574);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1xgzxgzlgchos5r.R.flushNeeded();}}

    @Test
    public void testPropertySetTextDayOfMonth() {__CLR4_4_1xgzxgzlgchos5r.R.globalSliceStart(getClass().getName(),43575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_144rzx8xmf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xgzxgzlgchos5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xgzxgzlgchos5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertySetTextDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_144rzx8xmf(){try{__CLR4_4_1xgzxgzlgchos5r.R.inc(43575);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43576);MonthDay test = new MonthDay(4, 6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43577);MonthDay copy = test.dayOfMonth().setCopy("12");
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43578);check(test, 4, 6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43579);check(copy, 4, 12);

        __CLR4_4_1xgzxgzlgchos5r.R.inc(43580);copy = test.dayOfMonth().setCopy("2");
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43581);check(test, 4, 6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43582);check(copy, 4, 2);

        __CLR4_4_1xgzxgzlgchos5r.R.inc(43583);copy = test.dayOfMonth().setCopy("4");
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43584);check(test, 4, 6);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43585);check(copy, 4, 4);
    }finally{__CLR4_4_1xgzxgzlgchos5r.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToDayOfMonth() {__CLR4_4_1xgzxgzlgchos5r.R.globalSliceStart(getClass().getName(),43586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wcwl0zxmq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xgzxgzlgchos5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xgzxgzlgchos5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyCompareToDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wcwl0zxmq(){try{__CLR4_4_1xgzxgzlgchos5r.R.inc(43586);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43587);MonthDay test1 = new MonthDay(TEST_TIME1);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43588);MonthDay test2 = new MonthDay(TEST_TIME2);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43589);assertEquals(true, test1.dayOfMonth().compareTo(test2) < 0);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43590);assertEquals(true, test2.dayOfMonth().compareTo(test1) > 0);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43591);assertEquals(true, test1.dayOfMonth().compareTo(test1) == 0);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43592);try {
            __CLR4_4_1xgzxgzlgchos5r.R.inc(43593);test1.dayOfMonth().compareTo((ReadablePartial) null);
            __CLR4_4_1xgzxgzlgchos5r.R.inc(43594);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1xgzxgzlgchos5r.R.inc(43595);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43596);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43597);assertEquals(true, test1.dayOfMonth().compareTo(dt2) < 0);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43598);assertEquals(true, test2.dayOfMonth().compareTo(dt1) > 0);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43599);assertEquals(true, test1.dayOfMonth().compareTo(dt1) == 0);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43600);try {
            __CLR4_4_1xgzxgzlgchos5r.R.inc(43601);test1.dayOfMonth().compareTo((ReadableInstant) null);
            __CLR4_4_1xgzxgzlgchos5r.R.inc(43602);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1xgzxgzlgchos5r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyEquals() {__CLR4_4_1xgzxgzlgchos5r.R.globalSliceStart(getClass().getName(),43603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2ub0zxn7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xgzxgzlgchos5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xgzxgzlgchos5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2ub0zxn7(){try{__CLR4_4_1xgzxgzlgchos5r.R.inc(43603);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43604);MonthDay test1 = new MonthDay(11, 11);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43605);MonthDay test2 = new MonthDay(11, 12);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43606);MonthDay test3 = new MonthDay(11, 11, CopticChronology.getInstanceUTC());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43607);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43608);assertEquals(false, test1.dayOfMonth().equals(test1.monthOfYear()));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43609);assertEquals(false, test1.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43610);assertEquals(false, test1.dayOfMonth().equals(test2.monthOfYear()));

        __CLR4_4_1xgzxgzlgchos5r.R.inc(43611);assertEquals(false, test1.monthOfYear().equals(test1.dayOfMonth()));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43612);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear()));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43613);assertEquals(false, test1.monthOfYear().equals(test2.dayOfMonth()));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43614);assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear()));

        __CLR4_4_1xgzxgzlgchos5r.R.inc(43615);assertEquals(false, test1.dayOfMonth().equals(null));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43616);assertEquals(false, test1.dayOfMonth().equals("any"));

        // chrono
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43617);assertEquals(false, test1.dayOfMonth().equals(test3.dayOfMonth()));
    }finally{__CLR4_4_1xgzxgzlgchos5r.R.flushNeeded();}}

    @Test
    public void testPropertyHashCode() {__CLR4_4_1xgzxgzlgchos5r.R.globalSliceStart(getClass().getName(),43618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y278s7xnm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xgzxgzlgchos5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xgzxgzlgchos5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43618,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y278s7xnm(){try{__CLR4_4_1xgzxgzlgchos5r.R.inc(43618);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43619);MonthDay test1 = new MonthDay(5, 11);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43620);MonthDay test2 = new MonthDay(5, 12);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43621);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43622);assertEquals(false, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43623);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43624);assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
    }finally{__CLR4_4_1xgzxgzlgchos5r.R.flushNeeded();}}

    @Test
    public void testPropertyEqualsHashCodeLenient() {__CLR4_4_1xgzxgzlgchos5r.R.globalSliceStart(getClass().getName(),43625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xoanxfxnt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xgzxgzlgchos5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xgzxgzlgchos5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyEqualsHashCodeLenient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43625,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xoanxfxnt(){try{__CLR4_4_1xgzxgzlgchos5r.R.inc(43625);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43626);MonthDay test1 = new MonthDay(5, 6, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43627);MonthDay test2 = new MonthDay(5, 6, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43628);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43629);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43630);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43631);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43632);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43633);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43634);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }finally{__CLR4_4_1xgzxgzlgchos5r.R.flushNeeded();}}

    @Test
    public void testPropertyEqualsHashCodeStrict() {__CLR4_4_1xgzxgzlgchos5r.R.globalSliceStart(getClass().getName(),43635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ev6icvxo3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xgzxgzlgchos5r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xgzxgzlgchos5r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyEqualsHashCodeStrict",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ev6icvxo3(){try{__CLR4_4_1xgzxgzlgchos5r.R.inc(43635);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43636);MonthDay test1 = new MonthDay(5, 6, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43637);MonthDay test2 = new MonthDay(5, 6, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43638);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43639);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43640);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43641);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43642);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43643);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43644);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }finally{__CLR4_4_1xgzxgzlgchos5r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(MonthDay test, int monthOfYear, int dayOfMonth) {try{__CLR4_4_1xgzxgzlgchos5r.R.inc(43645);
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43646);assertEquals(monthOfYear, test.getMonthOfYear());
        __CLR4_4_1xgzxgzlgchos5r.R.inc(43647);assertEquals(dayOfMonth, test.getDayOfMonth());
    }finally{__CLR4_4_1xgzxgzlgchos5r.R.flushNeeded();}}
}
