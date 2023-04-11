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

/**
 * This class is a Junit unit test for TimeOfDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestTimeOfDay_Properties {static class __CLR4_4_117np17nplgchosia{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,57166,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");

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

    public static void main(String[] args) throws Exception {try{__CLR4_4_117np17nplgchosia.R.inc(56581);
        __CLR4_4_117np17nplgchosia.R.inc(56582);TestTimeOfDay_Properties TB = new TestTimeOfDay_Properties();
        __CLR4_4_117np17nplgchosia.R.inc(56583);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56584);TB.testPropertyGetHour();
        __CLR4_4_117np17nplgchosia.R.inc(56585);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56586);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56587);TB.testPropertyGetMaxMinValuesHour();
        __CLR4_4_117np17nplgchosia.R.inc(56588);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56589);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56590);TB.testPropertyAddHour();
        __CLR4_4_117np17nplgchosia.R.inc(56591);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56592);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56593);TB.testPropertyAddNoWrapHour();
        __CLR4_4_117np17nplgchosia.R.inc(56594);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56595);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56596);TB.testPropertyAddWrapFieldHour();
        __CLR4_4_117np17nplgchosia.R.inc(56597);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56598);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56599);TB.testPropertySetHour();
        __CLR4_4_117np17nplgchosia.R.inc(56600);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56601);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56602);TB.testPropertySetTextHour();
        __CLR4_4_117np17nplgchosia.R.inc(56603);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56604);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56605);TB.testPropertyWithMaximumValueHour();
        __CLR4_4_117np17nplgchosia.R.inc(56606);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56607);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56608);TB.testPropertyWithMinimumValueHour();
        __CLR4_4_117np17nplgchosia.R.inc(56609);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56610);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56611);TB.testPropertyCompareToHour();
        __CLR4_4_117np17nplgchosia.R.inc(56612);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56613);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56614);TB.testPropertyGetMinute();
        __CLR4_4_117np17nplgchosia.R.inc(56615);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56616);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56617);TB.testPropertyGetMaxMinValuesMinute();
        __CLR4_4_117np17nplgchosia.R.inc(56618);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56619);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56620);TB.testPropertyAddMinute();
        __CLR4_4_117np17nplgchosia.R.inc(56621);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56622);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56623);TB.testPropertyAddNoWrapMinute();
        __CLR4_4_117np17nplgchosia.R.inc(56624);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56625);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56626);TB.testPropertyAddWrapFieldMinute();
        __CLR4_4_117np17nplgchosia.R.inc(56627);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56628);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56629);TB.testPropertySetMinute();
        __CLR4_4_117np17nplgchosia.R.inc(56630);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56631);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56632);TB.testPropertySetTextMinute();
        __CLR4_4_117np17nplgchosia.R.inc(56633);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56634);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56635);TB.testPropertyCompareToMinute();
        __CLR4_4_117np17nplgchosia.R.inc(56636);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56637);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56638);TB.testPropertyGetSecond();
        __CLR4_4_117np17nplgchosia.R.inc(56639);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56640);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56641);TB.testPropertyGetMaxMinValuesSecond();
        __CLR4_4_117np17nplgchosia.R.inc(56642);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56643);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56644);TB.testPropertyAddSecond();
        __CLR4_4_117np17nplgchosia.R.inc(56645);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56646);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56647);TB.testPropertyAddNoWrapSecond();
        __CLR4_4_117np17nplgchosia.R.inc(56648);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56649);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56650);TB.testPropertyAddWrapFieldSecond();
        __CLR4_4_117np17nplgchosia.R.inc(56651);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56652);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56653);TB.testPropertySetSecond();
        __CLR4_4_117np17nplgchosia.R.inc(56654);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56655);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56656);TB.testPropertySetTextSecond();
        __CLR4_4_117np17nplgchosia.R.inc(56657);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56658);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56659);TB.testPropertyCompareToSecond();
        __CLR4_4_117np17nplgchosia.R.inc(56660);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56661);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56662);TB.testPropertyGetMilli();
        __CLR4_4_117np17nplgchosia.R.inc(56663);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56664);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56665);TB.testPropertyGetMaxMinValuesMilli();
        __CLR4_4_117np17nplgchosia.R.inc(56666);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56667);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56668);TB.testPropertyAddMilli();
        __CLR4_4_117np17nplgchosia.R.inc(56669);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56670);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56671);TB.testPropertyAddNoWrapMilli();
        __CLR4_4_117np17nplgchosia.R.inc(56672);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56673);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56674);TB.testPropertyAddWrapFieldMilli();
        __CLR4_4_117np17nplgchosia.R.inc(56675);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56676);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56677);TB.testPropertySetMilli();
        __CLR4_4_117np17nplgchosia.R.inc(56678);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56679);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56680);TB.testPropertySetTextMilli();
        __CLR4_4_117np17nplgchosia.R.inc(56681);TB.tearDown();
        __CLR4_4_117np17nplgchosia.R.inc(56682);TB.setUp();
        __CLR4_4_117np17nplgchosia.R.inc(56683);TB.testPropertyCompareToMilli();
        __CLR4_4_117np17nplgchosia.R.inc(56684);TB.tearDown();

    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestTimeOfDay_Properties.class);
    }

    public TestTimeOfDay_Properties(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_117np17nplgchosia.R.inc(56685);
        __CLR4_4_117np17nplgchosia.R.inc(56686);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_117np17nplgchosia.R.inc(56687);zone = DateTimeZone.getDefault();
        __CLR4_4_117np17nplgchosia.R.inc(56688);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_117np17nplgchosia.R.inc(56689);
        __CLR4_4_117np17nplgchosia.R.inc(56690);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_117np17nplgchosia.R.inc(56691);DateTimeZone.setDefault(zone);
        __CLR4_4_117np17nplgchosia.R.inc(56692);zone = null;
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetHour() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),56693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mry6ka17qt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mry6ka17qt(){try{__CLR4_4_117np17nplgchosia.R.inc(56693);
        __CLR4_4_117np17nplgchosia.R.inc(56694);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56695);assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField());
        __CLR4_4_117np17nplgchosia.R.inc(56696);assertEquals("hourOfDay", test.hourOfDay().getName());
        __CLR4_4_117np17nplgchosia.R.inc(56697);assertEquals("Property[hourOfDay]", test.hourOfDay().toString());
        __CLR4_4_117np17nplgchosia.R.inc(56698);assertSame(test, test.hourOfDay().getReadablePartial());
        __CLR4_4_117np17nplgchosia.R.inc(56699);assertSame(test, test.hourOfDay().getTimeOfDay());
        __CLR4_4_117np17nplgchosia.R.inc(56700);assertEquals(10, test.hourOfDay().get());
        __CLR4_4_117np17nplgchosia.R.inc(56701);assertEquals("10", test.hourOfDay().getAsString());
        __CLR4_4_117np17nplgchosia.R.inc(56702);assertEquals("10", test.hourOfDay().getAsText());
        __CLR4_4_117np17nplgchosia.R.inc(56703);assertEquals("10", test.hourOfDay().getAsText(Locale.FRENCH));
        __CLR4_4_117np17nplgchosia.R.inc(56704);assertEquals("10", test.hourOfDay().getAsShortText());
        __CLR4_4_117np17nplgchosia.R.inc(56705);assertEquals("10", test.hourOfDay().getAsShortText(Locale.FRENCH));
        __CLR4_4_117np17nplgchosia.R.inc(56706);assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField());
        __CLR4_4_117np17nplgchosia.R.inc(56707);assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField());
        __CLR4_4_117np17nplgchosia.R.inc(56708);assertEquals(2, test.hourOfDay().getMaximumTextLength(null));
        __CLR4_4_117np17nplgchosia.R.inc(56709);assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null));
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesHour() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),56710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13xi8wm17ra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetMaxMinValuesHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56710,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13xi8wm17ra(){try{__CLR4_4_117np17nplgchosia.R.inc(56710);
        __CLR4_4_117np17nplgchosia.R.inc(56711);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56712);assertEquals(0, test.hourOfDay().getMinimumValue());
        __CLR4_4_117np17nplgchosia.R.inc(56713);assertEquals(0, test.hourOfDay().getMinimumValueOverall());
        __CLR4_4_117np17nplgchosia.R.inc(56714);assertEquals(23, test.hourOfDay().getMaximumValue());
        __CLR4_4_117np17nplgchosia.R.inc(56715);assertEquals(23, test.hourOfDay().getMaximumValueOverall());
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertyAddHour() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),56716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15c189x17rg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15c189x17rg(){try{__CLR4_4_117np17nplgchosia.R.inc(56716);
        __CLR4_4_117np17nplgchosia.R.inc(56717);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56718);TimeOfDay copy = test.hourOfDay().addToCopy(9);
        __CLR4_4_117np17nplgchosia.R.inc(56719);check(test, 10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56720);check(copy, 19, 20, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56721);copy = test.hourOfDay().addToCopy(0);
        __CLR4_4_117np17nplgchosia.R.inc(56722);check(copy, 10, 20, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56723);copy = test.hourOfDay().addToCopy(13);
        __CLR4_4_117np17nplgchosia.R.inc(56724);check(copy, 23, 20, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56725);copy = test.hourOfDay().addToCopy(14);
        __CLR4_4_117np17nplgchosia.R.inc(56726);check(copy, 0, 20, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56727);copy = test.hourOfDay().addToCopy(-10);
        __CLR4_4_117np17nplgchosia.R.inc(56728);check(copy, 0, 20, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56729);copy = test.hourOfDay().addToCopy(-11);
        __CLR4_4_117np17nplgchosia.R.inc(56730);check(copy, 23, 20, 30, 40);
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertyAddNoWrapHour() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),56731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dnr3w017rv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddNoWrapHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dnr3w017rv(){try{__CLR4_4_117np17nplgchosia.R.inc(56731);
        __CLR4_4_117np17nplgchosia.R.inc(56732);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56733);TimeOfDay copy = test.hourOfDay().addNoWrapToCopy(9);
        __CLR4_4_117np17nplgchosia.R.inc(56734);check(test, 10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56735);check(copy, 19, 20, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56736);copy = test.hourOfDay().addNoWrapToCopy(0);
        __CLR4_4_117np17nplgchosia.R.inc(56737);check(copy, 10, 20, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56738);copy = test.hourOfDay().addNoWrapToCopy(13);
        __CLR4_4_117np17nplgchosia.R.inc(56739);check(copy, 23, 20, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56740);try {
            __CLR4_4_117np17nplgchosia.R.inc(56741);test.hourOfDay().addNoWrapToCopy(14);
            __CLR4_4_117np17nplgchosia.R.inc(56742);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_117np17nplgchosia.R.inc(56743);check(test, 10, 20, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56744);copy = test.hourOfDay().addNoWrapToCopy(-10);
        __CLR4_4_117np17nplgchosia.R.inc(56745);check(copy, 0, 20, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56746);try {
            __CLR4_4_117np17nplgchosia.R.inc(56747);test.hourOfDay().addNoWrapToCopy(-11);
            __CLR4_4_117np17nplgchosia.R.inc(56748);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_117np17nplgchosia.R.inc(56749);check(test, 10, 20, 30, 40);
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldHour() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),56750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x88om717se();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddWrapFieldHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x88om717se(){try{__CLR4_4_117np17nplgchosia.R.inc(56750);
        __CLR4_4_117np17nplgchosia.R.inc(56751);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56752);TimeOfDay copy = test.hourOfDay().addWrapFieldToCopy(9);
        __CLR4_4_117np17nplgchosia.R.inc(56753);check(test, 10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56754);check(copy, 19, 20, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56755);copy = test.hourOfDay().addWrapFieldToCopy(0);
        __CLR4_4_117np17nplgchosia.R.inc(56756);check(copy, 10, 20, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56757);copy = test.hourOfDay().addWrapFieldToCopy(18);
        __CLR4_4_117np17nplgchosia.R.inc(56758);check(copy, 4, 20, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56759);copy = test.hourOfDay().addWrapFieldToCopy(-15);
        __CLR4_4_117np17nplgchosia.R.inc(56760);check(copy, 19, 20, 30, 40);
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertySetHour() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),56761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hyrp2y17sp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hyrp2y17sp(){try{__CLR4_4_117np17nplgchosia.R.inc(56761);
        __CLR4_4_117np17nplgchosia.R.inc(56762);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56763);TimeOfDay copy = test.hourOfDay().setCopy(12);
        __CLR4_4_117np17nplgchosia.R.inc(56764);check(test, 10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56765);check(copy, 12, 20, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56766);try {
            __CLR4_4_117np17nplgchosia.R.inc(56767);test.hourOfDay().setCopy(24);
            __CLR4_4_117np17nplgchosia.R.inc(56768);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_117np17nplgchosia.R.inc(56769);try {
            __CLR4_4_117np17nplgchosia.R.inc(56770);test.hourOfDay().setCopy(-1);
            __CLR4_4_117np17nplgchosia.R.inc(56771);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertySetTextHour() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),56772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14yha1917t0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetTextHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14yha1917t0(){try{__CLR4_4_117np17nplgchosia.R.inc(56772);
        __CLR4_4_117np17nplgchosia.R.inc(56773);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56774);TimeOfDay copy = test.hourOfDay().setCopy("12");
        __CLR4_4_117np17nplgchosia.R.inc(56775);check(test, 10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56776);check(copy, 12, 20, 30, 40);
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertyWithMaximumValueHour() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),56777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1otnz9317t5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyWithMaximumValueHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56777,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1otnz9317t5(){try{__CLR4_4_117np17nplgchosia.R.inc(56777);
        __CLR4_4_117np17nplgchosia.R.inc(56778);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56779);TimeOfDay copy = test.hourOfDay().withMaximumValue();
        __CLR4_4_117np17nplgchosia.R.inc(56780);check(test, 10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56781);check(copy, 23, 20, 30, 40);
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertyWithMinimumValueHour() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),56782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6uf1h17ta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyWithMinimumValueHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6uf1h17ta(){try{__CLR4_4_117np17nplgchosia.R.inc(56782);
        __CLR4_4_117np17nplgchosia.R.inc(56783);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56784);TimeOfDay copy = test.hourOfDay().withMinimumValue();
        __CLR4_4_117np17nplgchosia.R.inc(56785);check(test, 10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56786);check(copy, 0, 20, 30, 40);
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToHour() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),56787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_174ldgc17tf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyCompareToHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_174ldgc17tf(){try{__CLR4_4_117np17nplgchosia.R.inc(56787);
        __CLR4_4_117np17nplgchosia.R.inc(56788);TimeOfDay test1 = new TimeOfDay(TEST_TIME1);
        __CLR4_4_117np17nplgchosia.R.inc(56789);TimeOfDay test2 = new TimeOfDay(TEST_TIME2);
        __CLR4_4_117np17nplgchosia.R.inc(56790);assertEquals(true, test1.hourOfDay().compareTo(test2) < 0);
        __CLR4_4_117np17nplgchosia.R.inc(56791);assertEquals(true, test2.hourOfDay().compareTo(test1) > 0);
        __CLR4_4_117np17nplgchosia.R.inc(56792);assertEquals(true, test1.hourOfDay().compareTo(test1) == 0);
        __CLR4_4_117np17nplgchosia.R.inc(56793);try {
            __CLR4_4_117np17nplgchosia.R.inc(56794);test1.hourOfDay().compareTo((ReadablePartial) null);
            __CLR4_4_117np17nplgchosia.R.inc(56795);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_117np17nplgchosia.R.inc(56796);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_117np17nplgchosia.R.inc(56797);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_117np17nplgchosia.R.inc(56798);assertEquals(true, test1.hourOfDay().compareTo(dt2) < 0);
        __CLR4_4_117np17nplgchosia.R.inc(56799);assertEquals(true, test2.hourOfDay().compareTo(dt1) > 0);
        __CLR4_4_117np17nplgchosia.R.inc(56800);assertEquals(true, test1.hourOfDay().compareTo(dt1) == 0);
        __CLR4_4_117np17nplgchosia.R.inc(56801);try {
            __CLR4_4_117np17nplgchosia.R.inc(56802);test1.hourOfDay().compareTo((ReadableInstant) null);
            __CLR4_4_117np17nplgchosia.R.inc(56803);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetMinute() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),56804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oej7l617tw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56804,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oej7l617tw(){try{__CLR4_4_117np17nplgchosia.R.inc(56804);
        __CLR4_4_117np17nplgchosia.R.inc(56805);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56806);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField());
        __CLR4_4_117np17nplgchosia.R.inc(56807);assertEquals("minuteOfHour", test.minuteOfHour().getName());
        __CLR4_4_117np17nplgchosia.R.inc(56808);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString());
        __CLR4_4_117np17nplgchosia.R.inc(56809);assertSame(test, test.minuteOfHour().getReadablePartial());
        __CLR4_4_117np17nplgchosia.R.inc(56810);assertSame(test, test.minuteOfHour().getTimeOfDay());
        __CLR4_4_117np17nplgchosia.R.inc(56811);assertEquals(20, test.minuteOfHour().get());
        __CLR4_4_117np17nplgchosia.R.inc(56812);assertEquals("20", test.minuteOfHour().getAsString());
        __CLR4_4_117np17nplgchosia.R.inc(56813);assertEquals("20", test.minuteOfHour().getAsText());
        __CLR4_4_117np17nplgchosia.R.inc(56814);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH));
        __CLR4_4_117np17nplgchosia.R.inc(56815);assertEquals("20", test.minuteOfHour().getAsShortText());
        __CLR4_4_117np17nplgchosia.R.inc(56816);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH));
        __CLR4_4_117np17nplgchosia.R.inc(56817);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField());
        __CLR4_4_117np17nplgchosia.R.inc(56818);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField());
        __CLR4_4_117np17nplgchosia.R.inc(56819);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null));
        __CLR4_4_117np17nplgchosia.R.inc(56820);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null));
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesMinute() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),56821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_110m2u217ud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetMaxMinValuesMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_110m2u217ud(){try{__CLR4_4_117np17nplgchosia.R.inc(56821);
        __CLR4_4_117np17nplgchosia.R.inc(56822);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56823);assertEquals(0, test.minuteOfHour().getMinimumValue());
        __CLR4_4_117np17nplgchosia.R.inc(56824);assertEquals(0, test.minuteOfHour().getMinimumValueOverall());
        __CLR4_4_117np17nplgchosia.R.inc(56825);assertEquals(59, test.minuteOfHour().getMaximumValue());
        __CLR4_4_117np17nplgchosia.R.inc(56826);assertEquals(59, test.minuteOfHour().getMaximumValueOverall());
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertyAddMinute() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),56827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pugv6d17uj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pugv6d17uj(){try{__CLR4_4_117np17nplgchosia.R.inc(56827);
        __CLR4_4_117np17nplgchosia.R.inc(56828);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56829);TimeOfDay copy = test.minuteOfHour().addToCopy(9);
        __CLR4_4_117np17nplgchosia.R.inc(56830);check(test, 10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56831);check(copy, 10, 29, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56832);copy = test.minuteOfHour().addToCopy(39);
        __CLR4_4_117np17nplgchosia.R.inc(56833);check(copy, 10, 59, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56834);copy = test.minuteOfHour().addToCopy(40);
        __CLR4_4_117np17nplgchosia.R.inc(56835);check(copy, 11, 0, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56836);copy = test.minuteOfHour().addToCopy(1 * 60 + 45);
        __CLR4_4_117np17nplgchosia.R.inc(56837);check(copy, 12, 5, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56838);copy = test.minuteOfHour().addToCopy(13 * 60 + 39);
        __CLR4_4_117np17nplgchosia.R.inc(56839);check(copy, 23, 59, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56840);copy = test.minuteOfHour().addToCopy(13 * 60 + 40);
        __CLR4_4_117np17nplgchosia.R.inc(56841);check(copy, 0, 0, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56842);copy = test.minuteOfHour().addToCopy(-9);
        __CLR4_4_117np17nplgchosia.R.inc(56843);check(copy, 10, 11, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56844);copy = test.minuteOfHour().addToCopy(-19);
        __CLR4_4_117np17nplgchosia.R.inc(56845);check(copy, 10, 1, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56846);copy = test.minuteOfHour().addToCopy(-20);
        __CLR4_4_117np17nplgchosia.R.inc(56847);check(copy, 10, 0, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56848);copy = test.minuteOfHour().addToCopy(-21);
        __CLR4_4_117np17nplgchosia.R.inc(56849);check(copy, 9, 59, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56850);copy = test.minuteOfHour().addToCopy(-(10 * 60 + 20));
        __CLR4_4_117np17nplgchosia.R.inc(56851);check(copy, 0, 0, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56852);copy = test.minuteOfHour().addToCopy(-(10 * 60 + 21));
        __CLR4_4_117np17nplgchosia.R.inc(56853);check(copy, 23, 59, 30, 40);
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertyAddNoWrapMinute() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),56854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rgy8w017va();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddNoWrapMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rgy8w017va(){try{__CLR4_4_117np17nplgchosia.R.inc(56854);
        __CLR4_4_117np17nplgchosia.R.inc(56855);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56856);TimeOfDay copy = test.minuteOfHour().addNoWrapToCopy(9);
        __CLR4_4_117np17nplgchosia.R.inc(56857);check(test, 10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56858);check(copy, 10, 29, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56859);copy = test.minuteOfHour().addNoWrapToCopy(39);
        __CLR4_4_117np17nplgchosia.R.inc(56860);check(copy, 10, 59, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56861);copy = test.minuteOfHour().addNoWrapToCopy(40);
        __CLR4_4_117np17nplgchosia.R.inc(56862);check(copy, 11, 0, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56863);copy = test.minuteOfHour().addNoWrapToCopy(1 * 60 + 45);
        __CLR4_4_117np17nplgchosia.R.inc(56864);check(copy, 12, 5, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56865);copy = test.minuteOfHour().addNoWrapToCopy(13 * 60 + 39);
        __CLR4_4_117np17nplgchosia.R.inc(56866);check(copy, 23, 59, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56867);try {
            __CLR4_4_117np17nplgchosia.R.inc(56868);test.minuteOfHour().addNoWrapToCopy(13 * 60 + 40);
            __CLR4_4_117np17nplgchosia.R.inc(56869);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_117np17nplgchosia.R.inc(56870);check(test, 10, 20, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56871);copy = test.minuteOfHour().addNoWrapToCopy(-9);
        __CLR4_4_117np17nplgchosia.R.inc(56872);check(copy, 10, 11, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56873);copy = test.minuteOfHour().addNoWrapToCopy(-19);
        __CLR4_4_117np17nplgchosia.R.inc(56874);check(copy, 10, 1, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56875);copy = test.minuteOfHour().addNoWrapToCopy(-20);
        __CLR4_4_117np17nplgchosia.R.inc(56876);check(copy, 10, 0, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56877);copy = test.minuteOfHour().addNoWrapToCopy(-21);
        __CLR4_4_117np17nplgchosia.R.inc(56878);check(copy, 9, 59, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56879);copy = test.minuteOfHour().addNoWrapToCopy(-(10 * 60 + 20));
        __CLR4_4_117np17nplgchosia.R.inc(56880);check(copy, 0, 0, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56881);try {
            __CLR4_4_117np17nplgchosia.R.inc(56882);test.minuteOfHour().addNoWrapToCopy(-(10 * 60 + 21));
            __CLR4_4_117np17nplgchosia.R.inc(56883);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_117np17nplgchosia.R.inc(56884);check(test, 10, 20, 30, 40);
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldMinute() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),56885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qahkvj17w5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddWrapFieldMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qahkvj17w5(){try{__CLR4_4_117np17nplgchosia.R.inc(56885);
        __CLR4_4_117np17nplgchosia.R.inc(56886);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56887);TimeOfDay copy = test.minuteOfHour().addWrapFieldToCopy(9);
        __CLR4_4_117np17nplgchosia.R.inc(56888);check(test, 10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56889);check(copy, 10, 29, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56890);copy = test.minuteOfHour().addWrapFieldToCopy(49);
        __CLR4_4_117np17nplgchosia.R.inc(56891);check(copy, 10, 9, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56892);copy = test.minuteOfHour().addWrapFieldToCopy(-47);
        __CLR4_4_117np17nplgchosia.R.inc(56893);check(copy, 10, 33, 30, 40);
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertySetMinute() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),56894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_196rp2u17we();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_196rp2u17we(){try{__CLR4_4_117np17nplgchosia.R.inc(56894);
        __CLR4_4_117np17nplgchosia.R.inc(56895);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56896);TimeOfDay copy = test.minuteOfHour().setCopy(12);
        __CLR4_4_117np17nplgchosia.R.inc(56897);check(test, 10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56898);check(copy, 10, 12, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56899);try {
            __CLR4_4_117np17nplgchosia.R.inc(56900);test.minuteOfHour().setCopy(60);
            __CLR4_4_117np17nplgchosia.R.inc(56901);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_117np17nplgchosia.R.inc(56902);try {
            __CLR4_4_117np17nplgchosia.R.inc(56903);test.minuteOfHour().setCopy(-1);
            __CLR4_4_117np17nplgchosia.R.inc(56904);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertySetTextMinute() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),56905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18h1pnn17wp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetTextMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18h1pnn17wp(){try{__CLR4_4_117np17nplgchosia.R.inc(56905);
        __CLR4_4_117np17nplgchosia.R.inc(56906);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56907);TimeOfDay copy = test.minuteOfHour().setCopy("12");
        __CLR4_4_117np17nplgchosia.R.inc(56908);check(test, 10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56909);check(copy, 10, 12, 30, 40);
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToMinute() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),56910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gtzyp817wu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyCompareToMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gtzyp817wu(){try{__CLR4_4_117np17nplgchosia.R.inc(56910);
        __CLR4_4_117np17nplgchosia.R.inc(56911);TimeOfDay test1 = new TimeOfDay(TEST_TIME1);
        __CLR4_4_117np17nplgchosia.R.inc(56912);TimeOfDay test2 = new TimeOfDay(TEST_TIME2);
        __CLR4_4_117np17nplgchosia.R.inc(56913);assertEquals(true, test1.minuteOfHour().compareTo(test2) < 0);
        __CLR4_4_117np17nplgchosia.R.inc(56914);assertEquals(true, test2.minuteOfHour().compareTo(test1) > 0);
        __CLR4_4_117np17nplgchosia.R.inc(56915);assertEquals(true, test1.minuteOfHour().compareTo(test1) == 0);
        __CLR4_4_117np17nplgchosia.R.inc(56916);try {
            __CLR4_4_117np17nplgchosia.R.inc(56917);test1.minuteOfHour().compareTo((ReadablePartial) null);
            __CLR4_4_117np17nplgchosia.R.inc(56918);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_117np17nplgchosia.R.inc(56919);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_117np17nplgchosia.R.inc(56920);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_117np17nplgchosia.R.inc(56921);assertEquals(true, test1.minuteOfHour().compareTo(dt2) < 0);
        __CLR4_4_117np17nplgchosia.R.inc(56922);assertEquals(true, test2.minuteOfHour().compareTo(dt1) > 0);
        __CLR4_4_117np17nplgchosia.R.inc(56923);assertEquals(true, test1.minuteOfHour().compareTo(dt1) == 0);
        __CLR4_4_117np17nplgchosia.R.inc(56924);try {
            __CLR4_4_117np17nplgchosia.R.inc(56925);test1.minuteOfHour().compareTo((ReadableInstant) null);
            __CLR4_4_117np17nplgchosia.R.inc(56926);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetSecond() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),56927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1plsrcm17xb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1plsrcm17xb(){try{__CLR4_4_117np17nplgchosia.R.inc(56927);
        __CLR4_4_117np17nplgchosia.R.inc(56928);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56929);assertSame(test.getChronology().secondOfMinute(), test.secondOfMinute().getField());
        __CLR4_4_117np17nplgchosia.R.inc(56930);assertEquals("secondOfMinute", test.secondOfMinute().getName());
        __CLR4_4_117np17nplgchosia.R.inc(56931);assertEquals("Property[secondOfMinute]", test.secondOfMinute().toString());
        __CLR4_4_117np17nplgchosia.R.inc(56932);assertSame(test, test.secondOfMinute().getReadablePartial());
        __CLR4_4_117np17nplgchosia.R.inc(56933);assertSame(test, test.secondOfMinute().getTimeOfDay());
        __CLR4_4_117np17nplgchosia.R.inc(56934);assertEquals(30, test.secondOfMinute().get());
        __CLR4_4_117np17nplgchosia.R.inc(56935);assertEquals("30", test.secondOfMinute().getAsString());
        __CLR4_4_117np17nplgchosia.R.inc(56936);assertEquals("30", test.secondOfMinute().getAsText());
        __CLR4_4_117np17nplgchosia.R.inc(56937);assertEquals("30", test.secondOfMinute().getAsText(Locale.FRENCH));
        __CLR4_4_117np17nplgchosia.R.inc(56938);assertEquals("30", test.secondOfMinute().getAsShortText());
        __CLR4_4_117np17nplgchosia.R.inc(56939);assertEquals("30", test.secondOfMinute().getAsShortText(Locale.FRENCH));
        __CLR4_4_117np17nplgchosia.R.inc(56940);assertEquals(test.getChronology().seconds(), test.secondOfMinute().getDurationField());
        __CLR4_4_117np17nplgchosia.R.inc(56941);assertEquals(test.getChronology().minutes(), test.secondOfMinute().getRangeDurationField());
        __CLR4_4_117np17nplgchosia.R.inc(56942);assertEquals(2, test.secondOfMinute().getMaximumTextLength(null));
        __CLR4_4_117np17nplgchosia.R.inc(56943);assertEquals(2, test.secondOfMinute().getMaximumShortTextLength(null));
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesSecond() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),56944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1e5ve17xs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetMaxMinValuesSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56944,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1e5ve17xs(){try{__CLR4_4_117np17nplgchosia.R.inc(56944);
        __CLR4_4_117np17nplgchosia.R.inc(56945);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56946);assertEquals(0, test.secondOfMinute().getMinimumValue());
        __CLR4_4_117np17nplgchosia.R.inc(56947);assertEquals(0, test.secondOfMinute().getMinimumValueOverall());
        __CLR4_4_117np17nplgchosia.R.inc(56948);assertEquals(59, test.secondOfMinute().getMaximumValue());
        __CLR4_4_117np17nplgchosia.R.inc(56949);assertEquals(59, test.secondOfMinute().getMaximumValueOverall());
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertyAddSecond() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),56950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o5v3rf17xy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o5v3rf17xy(){try{__CLR4_4_117np17nplgchosia.R.inc(56950);
        __CLR4_4_117np17nplgchosia.R.inc(56951);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56952);TimeOfDay copy = test.secondOfMinute().addToCopy(9);
        __CLR4_4_117np17nplgchosia.R.inc(56953);check(test, 10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56954);check(copy, 10, 20, 39, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56955);copy = test.secondOfMinute().addToCopy(29);
        __CLR4_4_117np17nplgchosia.R.inc(56956);check(copy, 10, 20, 59, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56957);copy = test.secondOfMinute().addToCopy(30);
        __CLR4_4_117np17nplgchosia.R.inc(56958);check(copy, 10, 21, 0, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56959);copy = test.secondOfMinute().addToCopy(39 * 60 + 29);
        __CLR4_4_117np17nplgchosia.R.inc(56960);check(copy, 10, 59, 59, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56961);copy = test.secondOfMinute().addToCopy(39 * 60 + 30);
        __CLR4_4_117np17nplgchosia.R.inc(56962);check(copy, 11, 0, 0, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56963);copy = test.secondOfMinute().addToCopy(13 * 60 * 60 + 39 * 60 + 30);
        __CLR4_4_117np17nplgchosia.R.inc(56964);check(copy, 0, 0, 0, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56965);copy = test.secondOfMinute().addToCopy(-9);
        __CLR4_4_117np17nplgchosia.R.inc(56966);check(copy, 10, 20, 21, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56967);copy = test.secondOfMinute().addToCopy(-30);
        __CLR4_4_117np17nplgchosia.R.inc(56968);check(copy, 10, 20, 0, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56969);copy = test.secondOfMinute().addToCopy(-31);
        __CLR4_4_117np17nplgchosia.R.inc(56970);check(copy, 10, 19, 59, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56971);copy = test.secondOfMinute().addToCopy(-(10 * 60 * 60 + 20 * 60 + 30));
        __CLR4_4_117np17nplgchosia.R.inc(56972);check(copy, 0, 0, 0, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56973);copy = test.secondOfMinute().addToCopy(-(10 * 60 * 60 + 20 * 60 + 31));
        __CLR4_4_117np17nplgchosia.R.inc(56974);check(copy, 23, 59, 59, 40);
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertyAddNoWrapSecond() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),56975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mjdq1s17yn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddNoWrapSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mjdq1s17yn(){try{__CLR4_4_117np17nplgchosia.R.inc(56975);
        __CLR4_4_117np17nplgchosia.R.inc(56976);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56977);TimeOfDay copy = test.secondOfMinute().addNoWrapToCopy(9);
        __CLR4_4_117np17nplgchosia.R.inc(56978);check(test, 10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(56979);check(copy, 10, 20, 39, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56980);copy = test.secondOfMinute().addNoWrapToCopy(29);
        __CLR4_4_117np17nplgchosia.R.inc(56981);check(copy, 10, 20, 59, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56982);copy = test.secondOfMinute().addNoWrapToCopy(30);
        __CLR4_4_117np17nplgchosia.R.inc(56983);check(copy, 10, 21, 0, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56984);copy = test.secondOfMinute().addNoWrapToCopy(39 * 60 + 29);
        __CLR4_4_117np17nplgchosia.R.inc(56985);check(copy, 10, 59, 59, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56986);copy = test.secondOfMinute().addNoWrapToCopy(39 * 60 + 30);
        __CLR4_4_117np17nplgchosia.R.inc(56987);check(copy, 11, 0, 0, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56988);try {
            __CLR4_4_117np17nplgchosia.R.inc(56989);test.secondOfMinute().addNoWrapToCopy(13 * 60 * 60 + 39 * 60 + 30);
            __CLR4_4_117np17nplgchosia.R.inc(56990);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_117np17nplgchosia.R.inc(56991);check(test, 10, 20, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56992);copy = test.secondOfMinute().addNoWrapToCopy(-9);
        __CLR4_4_117np17nplgchosia.R.inc(56993);check(copy, 10, 20, 21, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56994);copy = test.secondOfMinute().addNoWrapToCopy(-30);
        __CLR4_4_117np17nplgchosia.R.inc(56995);check(copy, 10, 20, 0, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56996);copy = test.secondOfMinute().addNoWrapToCopy(-31);
        __CLR4_4_117np17nplgchosia.R.inc(56997);check(copy, 10, 19, 59, 40);

        __CLR4_4_117np17nplgchosia.R.inc(56998);copy = test.secondOfMinute().addNoWrapToCopy(-(10 * 60 * 60 + 20 * 60 + 30));
        __CLR4_4_117np17nplgchosia.R.inc(56999);check(copy, 0, 0, 0, 40);

        __CLR4_4_117np17nplgchosia.R.inc(57000);try {
            __CLR4_4_117np17nplgchosia.R.inc(57001);test.secondOfMinute().addNoWrapToCopy(-(10 * 60 * 60 + 20 * 60 + 31));
            __CLR4_4_117np17nplgchosia.R.inc(57002);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_117np17nplgchosia.R.inc(57003);check(test, 10, 20, 30, 40);
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldSecond() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),57004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_159phu717zg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddWrapFieldSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_159phu717zg(){try{__CLR4_4_117np17nplgchosia.R.inc(57004);
        __CLR4_4_117np17nplgchosia.R.inc(57005);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(57006);TimeOfDay copy = test.secondOfMinute().addWrapFieldToCopy(9);
        __CLR4_4_117np17nplgchosia.R.inc(57007);check(test, 10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(57008);check(copy, 10, 20, 39, 40);

        __CLR4_4_117np17nplgchosia.R.inc(57009);copy = test.secondOfMinute().addWrapFieldToCopy(49);
        __CLR4_4_117np17nplgchosia.R.inc(57010);check(copy, 10, 20, 19, 40);

        __CLR4_4_117np17nplgchosia.R.inc(57011);copy = test.secondOfMinute().addWrapFieldToCopy(-47);
        __CLR4_4_117np17nplgchosia.R.inc(57012);check(copy, 10, 20, 43, 40);
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertySetSecond() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),57013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u7js4617zp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57013,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u7js4617zp(){try{__CLR4_4_117np17nplgchosia.R.inc(57013);
        __CLR4_4_117np17nplgchosia.R.inc(57014);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(57015);TimeOfDay copy = test.secondOfMinute().setCopy(12);
        __CLR4_4_117np17nplgchosia.R.inc(57016);check(test, 10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(57017);check(copy, 10, 20, 12, 40);

        __CLR4_4_117np17nplgchosia.R.inc(57018);try {
            __CLR4_4_117np17nplgchosia.R.inc(57019);test.secondOfMinute().setCopy(60);
            __CLR4_4_117np17nplgchosia.R.inc(57020);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_117np17nplgchosia.R.inc(57021);try {
            __CLR4_4_117np17nplgchosia.R.inc(57022);test.secondOfMinute().setCopy(-1);
            __CLR4_4_117np17nplgchosia.R.inc(57023);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertySetTextSecond() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),57024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thtsoz1800();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetTextSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57024,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thtsoz1800(){try{__CLR4_4_117np17nplgchosia.R.inc(57024);
        __CLR4_4_117np17nplgchosia.R.inc(57025);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(57026);TimeOfDay copy = test.secondOfMinute().setCopy("12");
        __CLR4_4_117np17nplgchosia.R.inc(57027);check(test, 10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(57028);check(copy, 10, 20, 12, 40);
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToSecond() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),57029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_146s4c41805();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyCompareToSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57029,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_146s4c41805(){try{__CLR4_4_117np17nplgchosia.R.inc(57029);
        __CLR4_4_117np17nplgchosia.R.inc(57030);TimeOfDay test1 = new TimeOfDay(TEST_TIME1);
        __CLR4_4_117np17nplgchosia.R.inc(57031);TimeOfDay test2 = new TimeOfDay(TEST_TIME2);
        __CLR4_4_117np17nplgchosia.R.inc(57032);assertEquals(true, test1.secondOfMinute().compareTo(test2) < 0);
        __CLR4_4_117np17nplgchosia.R.inc(57033);assertEquals(true, test2.secondOfMinute().compareTo(test1) > 0);
        __CLR4_4_117np17nplgchosia.R.inc(57034);assertEquals(true, test1.secondOfMinute().compareTo(test1) == 0);
        __CLR4_4_117np17nplgchosia.R.inc(57035);try {
            __CLR4_4_117np17nplgchosia.R.inc(57036);test1.secondOfMinute().compareTo((ReadablePartial) null);
            __CLR4_4_117np17nplgchosia.R.inc(57037);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_117np17nplgchosia.R.inc(57038);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_117np17nplgchosia.R.inc(57039);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_117np17nplgchosia.R.inc(57040);assertEquals(true, test1.secondOfMinute().compareTo(dt2) < 0);
        __CLR4_4_117np17nplgchosia.R.inc(57041);assertEquals(true, test2.secondOfMinute().compareTo(dt1) > 0);
        __CLR4_4_117np17nplgchosia.R.inc(57042);assertEquals(true, test1.secondOfMinute().compareTo(dt1) == 0);
        __CLR4_4_117np17nplgchosia.R.inc(57043);try {
            __CLR4_4_117np17nplgchosia.R.inc(57044);test1.secondOfMinute().compareTo((ReadableInstant) null);
            __CLR4_4_117np17nplgchosia.R.inc(57045);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetMilli() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),57046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15098b180m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57046,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15098b180m(){try{__CLR4_4_117np17nplgchosia.R.inc(57046);
        __CLR4_4_117np17nplgchosia.R.inc(57047);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(57048);assertSame(test.getChronology().millisOfSecond(), test.millisOfSecond().getField());
        __CLR4_4_117np17nplgchosia.R.inc(57049);assertEquals("millisOfSecond", test.millisOfSecond().getName());
        __CLR4_4_117np17nplgchosia.R.inc(57050);assertEquals("Property[millisOfSecond]", test.millisOfSecond().toString());
        __CLR4_4_117np17nplgchosia.R.inc(57051);assertSame(test, test.millisOfSecond().getReadablePartial());
        __CLR4_4_117np17nplgchosia.R.inc(57052);assertSame(test, test.millisOfSecond().getTimeOfDay());
        __CLR4_4_117np17nplgchosia.R.inc(57053);assertEquals(40, test.millisOfSecond().get());
        __CLR4_4_117np17nplgchosia.R.inc(57054);assertEquals("40", test.millisOfSecond().getAsString());
        __CLR4_4_117np17nplgchosia.R.inc(57055);assertEquals("40", test.millisOfSecond().getAsText());
        __CLR4_4_117np17nplgchosia.R.inc(57056);assertEquals("40", test.millisOfSecond().getAsText(Locale.FRENCH));
        __CLR4_4_117np17nplgchosia.R.inc(57057);assertEquals("40", test.millisOfSecond().getAsShortText());
        __CLR4_4_117np17nplgchosia.R.inc(57058);assertEquals("40", test.millisOfSecond().getAsShortText(Locale.FRENCH));
        __CLR4_4_117np17nplgchosia.R.inc(57059);assertEquals(test.getChronology().millis(), test.millisOfSecond().getDurationField());
        __CLR4_4_117np17nplgchosia.R.inc(57060);assertEquals(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField());
        __CLR4_4_117np17nplgchosia.R.inc(57061);assertEquals(3, test.millisOfSecond().getMaximumTextLength(null));
        __CLR4_4_117np17nplgchosia.R.inc(57062);assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null));
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesMilli() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),57063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ob72xh1813();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetMaxMinValuesMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ob72xh1813(){try{__CLR4_4_117np17nplgchosia.R.inc(57063);
        __CLR4_4_117np17nplgchosia.R.inc(57064);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(57065);assertEquals(0, test.millisOfSecond().getMinimumValue());
        __CLR4_4_117np17nplgchosia.R.inc(57066);assertEquals(0, test.millisOfSecond().getMinimumValueOverall());
        __CLR4_4_117np17nplgchosia.R.inc(57067);assertEquals(999, test.millisOfSecond().getMaximumValue());
        __CLR4_4_117np17nplgchosia.R.inc(57068);assertEquals(999, test.millisOfSecond().getMaximumValueOverall());
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertyAddMilli() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),57069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1reinne1819();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57069,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1reinne1819(){try{__CLR4_4_117np17nplgchosia.R.inc(57069);
        __CLR4_4_117np17nplgchosia.R.inc(57070);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(57071);TimeOfDay copy = test.millisOfSecond().addToCopy(9);
        __CLR4_4_117np17nplgchosia.R.inc(57072);check(test, 10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(57073);check(copy, 10, 20, 30, 49);

        __CLR4_4_117np17nplgchosia.R.inc(57074);copy = test.millisOfSecond().addToCopy(959);
        __CLR4_4_117np17nplgchosia.R.inc(57075);check(copy, 10, 20, 30, 999);

        __CLR4_4_117np17nplgchosia.R.inc(57076);copy = test.millisOfSecond().addToCopy(960);
        __CLR4_4_117np17nplgchosia.R.inc(57077);check(copy, 10, 20, 31, 0);

        __CLR4_4_117np17nplgchosia.R.inc(57078);copy = test.millisOfSecond().addToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 959);
        __CLR4_4_117np17nplgchosia.R.inc(57079);check(copy, 23, 59, 59, 999);

        __CLR4_4_117np17nplgchosia.R.inc(57080);copy = test.millisOfSecond().addToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 960);
        __CLR4_4_117np17nplgchosia.R.inc(57081);check(copy, 0, 0, 0, 0);

        __CLR4_4_117np17nplgchosia.R.inc(57082);copy = test.millisOfSecond().addToCopy(-9);
        __CLR4_4_117np17nplgchosia.R.inc(57083);check(copy, 10, 20, 30, 31);

        __CLR4_4_117np17nplgchosia.R.inc(57084);copy = test.millisOfSecond().addToCopy(-40);
        __CLR4_4_117np17nplgchosia.R.inc(57085);check(copy, 10, 20, 30, 0);

        __CLR4_4_117np17nplgchosia.R.inc(57086);copy = test.millisOfSecond().addToCopy(-41);
        __CLR4_4_117np17nplgchosia.R.inc(57087);check(copy, 10, 20, 29, 999);

        __CLR4_4_117np17nplgchosia.R.inc(57088);copy = test.millisOfSecond().addToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 40));
        __CLR4_4_117np17nplgchosia.R.inc(57089);check(copy, 0, 0, 0, 0);

        __CLR4_4_117np17nplgchosia.R.inc(57090);copy = test.millisOfSecond().addToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 41));
        __CLR4_4_117np17nplgchosia.R.inc(57091);check(copy, 23, 59, 59, 999);
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertyAddNoWrapMilli() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),57092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16u0mcv181w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddNoWrapMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16u0mcv181w(){try{__CLR4_4_117np17nplgchosia.R.inc(57092);
        __CLR4_4_117np17nplgchosia.R.inc(57093);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(57094);TimeOfDay copy = test.millisOfSecond().addNoWrapToCopy(9);
        __CLR4_4_117np17nplgchosia.R.inc(57095);check(test, 10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(57096);check(copy, 10, 20, 30, 49);

        __CLR4_4_117np17nplgchosia.R.inc(57097);copy = test.millisOfSecond().addNoWrapToCopy(959);
        __CLR4_4_117np17nplgchosia.R.inc(57098);check(copy, 10, 20, 30, 999);

        __CLR4_4_117np17nplgchosia.R.inc(57099);copy = test.millisOfSecond().addNoWrapToCopy(960);
        __CLR4_4_117np17nplgchosia.R.inc(57100);check(copy, 10, 20, 31, 0);

        __CLR4_4_117np17nplgchosia.R.inc(57101);copy = test.millisOfSecond().addNoWrapToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 959);
        __CLR4_4_117np17nplgchosia.R.inc(57102);check(copy, 23, 59, 59, 999);

        __CLR4_4_117np17nplgchosia.R.inc(57103);try {
            __CLR4_4_117np17nplgchosia.R.inc(57104);test.millisOfSecond().addNoWrapToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 960);
            __CLR4_4_117np17nplgchosia.R.inc(57105);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_117np17nplgchosia.R.inc(57106);check(test, 10, 20, 30, 40);

        __CLR4_4_117np17nplgchosia.R.inc(57107);copy = test.millisOfSecond().addNoWrapToCopy(-9);
        __CLR4_4_117np17nplgchosia.R.inc(57108);check(copy, 10, 20, 30, 31);

        __CLR4_4_117np17nplgchosia.R.inc(57109);copy = test.millisOfSecond().addNoWrapToCopy(-40);
        __CLR4_4_117np17nplgchosia.R.inc(57110);check(copy, 10, 20, 30, 0);

        __CLR4_4_117np17nplgchosia.R.inc(57111);copy = test.millisOfSecond().addNoWrapToCopy(-41);
        __CLR4_4_117np17nplgchosia.R.inc(57112);check(copy, 10, 20, 29, 999);

        __CLR4_4_117np17nplgchosia.R.inc(57113);copy = test.millisOfSecond().addNoWrapToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 40));
        __CLR4_4_117np17nplgchosia.R.inc(57114);check(copy, 0, 0, 0, 0);

        __CLR4_4_117np17nplgchosia.R.inc(57115);try {
            __CLR4_4_117np17nplgchosia.R.inc(57116);test.millisOfSecond().addNoWrapToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 41));
            __CLR4_4_117np17nplgchosia.R.inc(57117);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_117np17nplgchosia.R.inc(57118);check(test, 10, 20, 30, 40);
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldMilli() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),57119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vk7sea182n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddWrapFieldMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vk7sea182n(){try{__CLR4_4_117np17nplgchosia.R.inc(57119);
        __CLR4_4_117np17nplgchosia.R.inc(57120);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(57121);TimeOfDay copy = test.millisOfSecond().addWrapFieldToCopy(9);
        __CLR4_4_117np17nplgchosia.R.inc(57122);check(test, 10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(57123);check(copy, 10, 20, 30, 49);

        __CLR4_4_117np17nplgchosia.R.inc(57124);copy = test.millisOfSecond().addWrapFieldToCopy(995);
        __CLR4_4_117np17nplgchosia.R.inc(57125);check(copy, 10, 20, 30, 35);

        __CLR4_4_117np17nplgchosia.R.inc(57126);copy = test.millisOfSecond().addWrapFieldToCopy(-47);
        __CLR4_4_117np17nplgchosia.R.inc(57127);check(copy, 10, 20, 30, 993);
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertySetMilli() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),57128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1feqhbt182w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1feqhbt182w(){try{__CLR4_4_117np17nplgchosia.R.inc(57128);
        __CLR4_4_117np17nplgchosia.R.inc(57129);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(57130);TimeOfDay copy = test.millisOfSecond().setCopy(12);
        __CLR4_4_117np17nplgchosia.R.inc(57131);check(test, 10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(57132);check(copy, 10, 20, 30, 12);

        __CLR4_4_117np17nplgchosia.R.inc(57133);try {
            __CLR4_4_117np17nplgchosia.R.inc(57134);test.millisOfSecond().setCopy(1000);
            __CLR4_4_117np17nplgchosia.R.inc(57135);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_117np17nplgchosia.R.inc(57136);try {
            __CLR4_4_117np17nplgchosia.R.inc(57137);test.millisOfSecond().setCopy(-1);
            __CLR4_4_117np17nplgchosia.R.inc(57138);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertySetTextMilli() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),57139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17iyw2c1837();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetTextMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17iyw2c1837(){try{__CLR4_4_117np17nplgchosia.R.inc(57139);
        __CLR4_4_117np17nplgchosia.R.inc(57140);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(57141);TimeOfDay copy = test.millisOfSecond().setCopy("12");
        __CLR4_4_117np17nplgchosia.R.inc(57142);check(test, 10, 20, 30, 40);
        __CLR4_4_117np17nplgchosia.R.inc(57143);check(copy, 10, 20, 30, 12);
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToMilli() {__CLR4_4_117np17nplgchosia.R.globalSliceStart(getClass().getName(),57144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13rds2t183c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117np17nplgchosia.R.rethrow($CLV_t2$);}finally{__CLR4_4_117np17nplgchosia.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyCompareToMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57144,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13rds2t183c(){try{__CLR4_4_117np17nplgchosia.R.inc(57144);
        __CLR4_4_117np17nplgchosia.R.inc(57145);TimeOfDay test1 = new TimeOfDay(TEST_TIME1);
        __CLR4_4_117np17nplgchosia.R.inc(57146);TimeOfDay test2 = new TimeOfDay(TEST_TIME2);
        __CLR4_4_117np17nplgchosia.R.inc(57147);assertEquals(true, test1.millisOfSecond().compareTo(test2) < 0);
        __CLR4_4_117np17nplgchosia.R.inc(57148);assertEquals(true, test2.millisOfSecond().compareTo(test1) > 0);
        __CLR4_4_117np17nplgchosia.R.inc(57149);assertEquals(true, test1.millisOfSecond().compareTo(test1) == 0);
        __CLR4_4_117np17nplgchosia.R.inc(57150);try {
            __CLR4_4_117np17nplgchosia.R.inc(57151);test1.millisOfSecond().compareTo((ReadablePartial) null);
            __CLR4_4_117np17nplgchosia.R.inc(57152);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_117np17nplgchosia.R.inc(57153);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_117np17nplgchosia.R.inc(57154);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_117np17nplgchosia.R.inc(57155);assertEquals(true, test1.millisOfSecond().compareTo(dt2) < 0);
        __CLR4_4_117np17nplgchosia.R.inc(57156);assertEquals(true, test2.millisOfSecond().compareTo(dt1) > 0);
        __CLR4_4_117np17nplgchosia.R.inc(57157);assertEquals(true, test1.millisOfSecond().compareTo(dt1) == 0);
        __CLR4_4_117np17nplgchosia.R.inc(57158);try {
            __CLR4_4_117np17nplgchosia.R.inc(57159);test1.millisOfSecond().compareTo((ReadableInstant) null);
            __CLR4_4_117np17nplgchosia.R.inc(57160);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(TimeOfDay test, int hour, int min, int sec, int milli) {try{__CLR4_4_117np17nplgchosia.R.inc(57161);
        __CLR4_4_117np17nplgchosia.R.inc(57162);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_117np17nplgchosia.R.inc(57163);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_117np17nplgchosia.R.inc(57164);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_117np17nplgchosia.R.inc(57165);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_117np17nplgchosia.R.flushNeeded();}}
}
