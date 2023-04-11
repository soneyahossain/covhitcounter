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
public class TestLocalTime_Properties {static class __CLR4_4_1vssvsslgchos43{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,41849,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

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

    public static void main(String[] args) throws Exception {try{__CLR4_4_1vssvsslgchos43.R.inc(41212);
        __CLR4_4_1vssvsslgchos43.R.inc(41213);TestLocalTime_Properties TB = new TestLocalTime_Properties();
        __CLR4_4_1vssvsslgchos43.R.inc(41214);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41215);TB.testPropertyGetHour();
        __CLR4_4_1vssvsslgchos43.R.inc(41216);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41217);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41218);TB.testPropertyRoundHour();
        __CLR4_4_1vssvsslgchos43.R.inc(41219);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41220);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41221);TB.testPropertyGetMaxMinValuesHour();
        __CLR4_4_1vssvsslgchos43.R.inc(41222);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41223);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41224);TB.testPropertyWithMaxMinValueHour();
        __CLR4_4_1vssvsslgchos43.R.inc(41225);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41226);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41227);TB.testPropertyPlusHour();
        __CLR4_4_1vssvsslgchos43.R.inc(41228);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41229);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41230);TB.testPropertyPlusNoWrapHour();
        __CLR4_4_1vssvsslgchos43.R.inc(41231);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41232);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41233);TB.testPropertyPlusWrapFieldHour();
        __CLR4_4_1vssvsslgchos43.R.inc(41234);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41235);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41236);TB.testPropertySetHour();
        __CLR4_4_1vssvsslgchos43.R.inc(41237);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41238);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41239);TB.testPropertySetTextHour();
        __CLR4_4_1vssvsslgchos43.R.inc(41240);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41241);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41242);TB.testPropertyWithMaximumValueHour();
        __CLR4_4_1vssvsslgchos43.R.inc(41243);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41244);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41245);TB.testPropertyWithMinimumValueHour();
        __CLR4_4_1vssvsslgchos43.R.inc(41246);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41247);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41248);TB.testPropertyCompareToHour();
        __CLR4_4_1vssvsslgchos43.R.inc(41249);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41250);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41251);TB.testPropertyGetMinute();
        __CLR4_4_1vssvsslgchos43.R.inc(41252);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41253);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41254);TB.testPropertyGetMaxMinValuesMinute();
        __CLR4_4_1vssvsslgchos43.R.inc(41255);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41256);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41257);TB.testPropertyWithMaxMinValueMinute();
        __CLR4_4_1vssvsslgchos43.R.inc(41258);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41259);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41260);TB.testPropertyPlusMinute();
        __CLR4_4_1vssvsslgchos43.R.inc(41261);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41262);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41263);TB.testPropertyPlusNoWrapMinute();
        __CLR4_4_1vssvsslgchos43.R.inc(41264);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41265);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41266);TB.testPropertyPlusWrapFieldMinute();
        __CLR4_4_1vssvsslgchos43.R.inc(41267);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41268);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41269);TB.testPropertySetMinute();
        __CLR4_4_1vssvsslgchos43.R.inc(41270);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41271);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41272);TB.testPropertySetTextMinute();
        __CLR4_4_1vssvsslgchos43.R.inc(41273);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41274);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41275);TB.testPropertyCompareToMinute();
        __CLR4_4_1vssvsslgchos43.R.inc(41276);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41277);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41278);TB.testPropertyGetSecond();
        __CLR4_4_1vssvsslgchos43.R.inc(41279);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41280);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41281);TB.testPropertyGetMaxMinValuesSecond();
        __CLR4_4_1vssvsslgchos43.R.inc(41282);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41283);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41284);TB.testPropertyWithMaxMinValueSecond();
        __CLR4_4_1vssvsslgchos43.R.inc(41285);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41286);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41287);TB.testPropertyPlusSecond();
        __CLR4_4_1vssvsslgchos43.R.inc(41288);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41289);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41290);TB.testPropertyPlusNoWrapSecond();
        __CLR4_4_1vssvsslgchos43.R.inc(41291);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41292);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41293);TB.testPropertyPlusWrapFieldSecond();
        __CLR4_4_1vssvsslgchos43.R.inc(41294);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41295);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41296);TB.testPropertySetSecond();
        __CLR4_4_1vssvsslgchos43.R.inc(41297);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41298);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41299);TB.testPropertySetTextSecond();
        __CLR4_4_1vssvsslgchos43.R.inc(41300);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41301);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41302);TB.testPropertyCompareToSecond();
        __CLR4_4_1vssvsslgchos43.R.inc(41303);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41304);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41305);TB.testPropertyGetMilli();
        __CLR4_4_1vssvsslgchos43.R.inc(41306);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41307);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41308);TB.testPropertyGetMaxMinValuesMilli();
        __CLR4_4_1vssvsslgchos43.R.inc(41309);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41310);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41311);TB.testPropertyWithMaxMinValueMilli();
        __CLR4_4_1vssvsslgchos43.R.inc(41312);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41313);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41314);TB.testPropertyPlusMilli();
        __CLR4_4_1vssvsslgchos43.R.inc(41315);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41316);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41317);TB.testPropertyPlusNoWrapMilli();
        __CLR4_4_1vssvsslgchos43.R.inc(41318);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41319);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41320);TB.testPropertyPlusWrapFieldMilli();
        __CLR4_4_1vssvsslgchos43.R.inc(41321);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41322);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41323);TB.testPropertySetMilli();
        __CLR4_4_1vssvsslgchos43.R.inc(41324);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41325);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41326);TB.testPropertySetTextMilli();
        __CLR4_4_1vssvsslgchos43.R.inc(41327);TB.tearDown();
        __CLR4_4_1vssvsslgchos43.R.inc(41328);TB.setUp();
        __CLR4_4_1vssvsslgchos43.R.inc(41329);TB.testPropertyCompareToMilli();
        __CLR4_4_1vssvsslgchos43.R.inc(41330);TB.tearDown();

    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestLocalTime_Properties.class);
    }

    public TestLocalTime_Properties(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1vssvsslgchos43.R.inc(41331);
        __CLR4_4_1vssvsslgchos43.R.inc(41332);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1vssvsslgchos43.R.inc(41333);zone = DateTimeZone.getDefault();
        __CLR4_4_1vssvsslgchos43.R.inc(41334);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1vssvsslgchos43.R.inc(41335);
        __CLR4_4_1vssvsslgchos43.R.inc(41336);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1vssvsslgchos43.R.inc(41337);DateTimeZone.setDefault(zone);
        __CLR4_4_1vssvsslgchos43.R.inc(41338);zone = null;
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetHour() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mry6kavwb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mry6kavwb(){try{__CLR4_4_1vssvsslgchos43.R.inc(41339);
        __CLR4_4_1vssvsslgchos43.R.inc(41340);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41341);assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField());
        __CLR4_4_1vssvsslgchos43.R.inc(41342);assertEquals("hourOfDay", test.hourOfDay().getName());
        __CLR4_4_1vssvsslgchos43.R.inc(41343);assertEquals("Property[hourOfDay]", test.hourOfDay().toString());
        __CLR4_4_1vssvsslgchos43.R.inc(41344);assertSame(test, test.hourOfDay().getLocalTime());
        __CLR4_4_1vssvsslgchos43.R.inc(41345);assertEquals(10, test.hourOfDay().get());
        __CLR4_4_1vssvsslgchos43.R.inc(41346);assertEquals("10", test.hourOfDay().getAsString());
        __CLR4_4_1vssvsslgchos43.R.inc(41347);assertEquals("10", test.hourOfDay().getAsText());
        __CLR4_4_1vssvsslgchos43.R.inc(41348);assertEquals("10", test.hourOfDay().getAsText(Locale.FRENCH));
        __CLR4_4_1vssvsslgchos43.R.inc(41349);assertEquals("10", test.hourOfDay().getAsShortText());
        __CLR4_4_1vssvsslgchos43.R.inc(41350);assertEquals("10", test.hourOfDay().getAsShortText(Locale.FRENCH));
        __CLR4_4_1vssvsslgchos43.R.inc(41351);assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField());
        __CLR4_4_1vssvsslgchos43.R.inc(41352);assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField());
        __CLR4_4_1vssvsslgchos43.R.inc(41353);assertEquals(2, test.hourOfDay().getMaximumTextLength(null));
        __CLR4_4_1vssvsslgchos43.R.inc(41354);assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyRoundHour() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kobpgyvwr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyRoundHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41355,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kobpgyvwr(){try{__CLR4_4_1vssvsslgchos43.R.inc(41355);
        __CLR4_4_1vssvsslgchos43.R.inc(41356);LocalTime test = new LocalTime(10, 20);
        __CLR4_4_1vssvsslgchos43.R.inc(41357);check(test.hourOfDay().roundCeilingCopy(), 11, 0, 0, 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41358);check(test.hourOfDay().roundFloorCopy(), 10, 0, 0, 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41359);check(test.hourOfDay().roundHalfCeilingCopy(), 10, 0, 0, 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41360);check(test.hourOfDay().roundHalfFloorCopy(), 10, 0, 0, 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41361);check(test.hourOfDay().roundHalfEvenCopy(), 10, 0, 0, 0);

        __CLR4_4_1vssvsslgchos43.R.inc(41362);test = new LocalTime(10, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41363);check(test.hourOfDay().roundCeilingCopy(), 11, 0, 0, 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41364);check(test.hourOfDay().roundFloorCopy(), 10, 0, 0, 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41365);check(test.hourOfDay().roundHalfCeilingCopy(), 11, 0, 0, 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41366);check(test.hourOfDay().roundHalfFloorCopy(), 11, 0, 0, 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41367);check(test.hourOfDay().roundHalfEvenCopy(), 11, 0, 0, 0);

        __CLR4_4_1vssvsslgchos43.R.inc(41368);test = new LocalTime(10, 30);
        __CLR4_4_1vssvsslgchos43.R.inc(41369);check(test.hourOfDay().roundCeilingCopy(), 11, 0, 0, 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41370);check(test.hourOfDay().roundFloorCopy(), 10, 0, 0, 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41371);check(test.hourOfDay().roundHalfCeilingCopy(), 11, 0, 0, 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41372);check(test.hourOfDay().roundHalfFloorCopy(), 10, 0, 0, 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41373);check(test.hourOfDay().roundHalfEvenCopy(), 10, 0, 0, 0);

        __CLR4_4_1vssvsslgchos43.R.inc(41374);test = new LocalTime(11, 30);
        __CLR4_4_1vssvsslgchos43.R.inc(41375);check(test.hourOfDay().roundCeilingCopy(), 12, 0, 0, 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41376);check(test.hourOfDay().roundFloorCopy(), 11, 0, 0, 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41377);check(test.hourOfDay().roundHalfCeilingCopy(), 12, 0, 0, 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41378);check(test.hourOfDay().roundHalfFloorCopy(), 11, 0, 0, 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41379);check(test.hourOfDay().roundHalfEvenCopy(), 12, 0, 0, 0);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesHour() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13xi8wmvxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetMaxMinValuesHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13xi8wmvxg(){try{__CLR4_4_1vssvsslgchos43.R.inc(41380);
        __CLR4_4_1vssvsslgchos43.R.inc(41381);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41382);assertEquals(0, test.hourOfDay().getMinimumValue());
        __CLR4_4_1vssvsslgchos43.R.inc(41383);assertEquals(0, test.hourOfDay().getMinimumValueOverall());
        __CLR4_4_1vssvsslgchos43.R.inc(41384);assertEquals(23, test.hourOfDay().getMaximumValue());
        __CLR4_4_1vssvsslgchos43.R.inc(41385);assertEquals(23, test.hourOfDay().getMaximumValueOverall());
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyWithMaxMinValueHour() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zhdwhvxm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyWithMaxMinValueHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41386,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zhdwhvxm(){try{__CLR4_4_1vssvsslgchos43.R.inc(41386);
        __CLR4_4_1vssvsslgchos43.R.inc(41387);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41388);check(test.hourOfDay().withMaximumValue(), 23, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41389);check(test.hourOfDay().withMinimumValue(), 0, 20, 30, 40);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyPlusHour() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13me904vxq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41390,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13me904vxq(){try{__CLR4_4_1vssvsslgchos43.R.inc(41390);
        __CLR4_4_1vssvsslgchos43.R.inc(41391);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41392);LocalTime copy = test.hourOfDay().addCopy(9);
        __CLR4_4_1vssvsslgchos43.R.inc(41393);check(test, 10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41394);check(copy, 19, 20, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41395);copy = test.hourOfDay().addCopy(0);
        __CLR4_4_1vssvsslgchos43.R.inc(41396);check(copy, 10, 20, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41397);copy = test.hourOfDay().addCopy(13);
        __CLR4_4_1vssvsslgchos43.R.inc(41398);check(copy, 23, 20, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41399);copy = test.hourOfDay().addCopy(14);
        __CLR4_4_1vssvsslgchos43.R.inc(41400);check(copy, 0, 20, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41401);copy = test.hourOfDay().addCopy(-10);
        __CLR4_4_1vssvsslgchos43.R.inc(41402);check(copy, 0, 20, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41403);copy = test.hourOfDay().addCopy(-11);
        __CLR4_4_1vssvsslgchos43.R.inc(41404);check(copy, 23, 20, 30, 40);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyPlusNoWrapHour() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1485edzvy5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusNoWrapHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41405,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1485edzvy5(){try{__CLR4_4_1vssvsslgchos43.R.inc(41405);
        __CLR4_4_1vssvsslgchos43.R.inc(41406);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41407);LocalTime copy = test.hourOfDay().addNoWrapToCopy(9);
        __CLR4_4_1vssvsslgchos43.R.inc(41408);check(test, 10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41409);check(copy, 19, 20, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41410);copy = test.hourOfDay().addNoWrapToCopy(0);
        __CLR4_4_1vssvsslgchos43.R.inc(41411);check(copy, 10, 20, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41412);copy = test.hourOfDay().addNoWrapToCopy(13);
        __CLR4_4_1vssvsslgchos43.R.inc(41413);check(copy, 23, 20, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41414);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41415);test.hourOfDay().addNoWrapToCopy(14);
            __CLR4_4_1vssvsslgchos43.R.inc(41416);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1vssvsslgchos43.R.inc(41417);check(test, 10, 20, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41418);copy = test.hourOfDay().addNoWrapToCopy(-10);
        __CLR4_4_1vssvsslgchos43.R.inc(41419);check(copy, 0, 20, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41420);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41421);test.hourOfDay().addNoWrapToCopy(-11);
            __CLR4_4_1vssvsslgchos43.R.inc(41422);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1vssvsslgchos43.R.inc(41423);check(test, 10, 20, 30, 40);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyPlusWrapFieldHour() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bjwgvuvyo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusWrapFieldHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41424,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bjwgvuvyo(){try{__CLR4_4_1vssvsslgchos43.R.inc(41424);
        __CLR4_4_1vssvsslgchos43.R.inc(41425);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41426);LocalTime copy = test.hourOfDay().addWrapFieldToCopy(9);
        __CLR4_4_1vssvsslgchos43.R.inc(41427);check(test, 10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41428);check(copy, 19, 20, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41429);copy = test.hourOfDay().addWrapFieldToCopy(0);
        __CLR4_4_1vssvsslgchos43.R.inc(41430);check(copy, 10, 20, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41431);copy = test.hourOfDay().addWrapFieldToCopy(18);
        __CLR4_4_1vssvsslgchos43.R.inc(41432);check(copy, 4, 20, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41433);copy = test.hourOfDay().addWrapFieldToCopy(-15);
        __CLR4_4_1vssvsslgchos43.R.inc(41434);check(copy, 19, 20, 30, 40);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertySetHour() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hyrp2yvyz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41435,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hyrp2yvyz(){try{__CLR4_4_1vssvsslgchos43.R.inc(41435);
        __CLR4_4_1vssvsslgchos43.R.inc(41436);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41437);LocalTime copy = test.hourOfDay().setCopy(12);
        __CLR4_4_1vssvsslgchos43.R.inc(41438);check(test, 10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41439);check(copy, 12, 20, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41440);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41441);test.hourOfDay().setCopy(24);
            __CLR4_4_1vssvsslgchos43.R.inc(41442);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1vssvsslgchos43.R.inc(41443);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41444);test.hourOfDay().setCopy(-1);
            __CLR4_4_1vssvsslgchos43.R.inc(41445);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertySetTextHour() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14yha19vza();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetTextHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41446,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14yha19vza(){try{__CLR4_4_1vssvsslgchos43.R.inc(41446);
        __CLR4_4_1vssvsslgchos43.R.inc(41447);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41448);LocalTime copy = test.hourOfDay().setCopy("12");
        __CLR4_4_1vssvsslgchos43.R.inc(41449);check(test, 10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41450);check(copy, 12, 20, 30, 40);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyWithMaximumValueHour() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1otnz93vzf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyWithMaximumValueHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1otnz93vzf(){try{__CLR4_4_1vssvsslgchos43.R.inc(41451);
        __CLR4_4_1vssvsslgchos43.R.inc(41452);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41453);LocalTime copy = test.hourOfDay().withMaximumValue();
        __CLR4_4_1vssvsslgchos43.R.inc(41454);check(test, 10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41455);check(copy, 23, 20, 30, 40);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyWithMinimumValueHour() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6uf1hvzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyWithMinimumValueHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6uf1hvzk(){try{__CLR4_4_1vssvsslgchos43.R.inc(41456);
        __CLR4_4_1vssvsslgchos43.R.inc(41457);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41458);LocalTime copy = test.hourOfDay().withMinimumValue();
        __CLR4_4_1vssvsslgchos43.R.inc(41459);check(test, 10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41460);check(copy, 0, 20, 30, 40);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToHour() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_174ldgcvzp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyCompareToHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_174ldgcvzp(){try{__CLR4_4_1vssvsslgchos43.R.inc(41461);
        __CLR4_4_1vssvsslgchos43.R.inc(41462);LocalTime test1 = new LocalTime(TEST_TIME1);
        __CLR4_4_1vssvsslgchos43.R.inc(41463);LocalTime test2 = new LocalTime(TEST_TIME2);
        __CLR4_4_1vssvsslgchos43.R.inc(41464);assertEquals(true, test1.hourOfDay().compareTo(test2) < 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41465);assertEquals(true, test2.hourOfDay().compareTo(test1) > 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41466);assertEquals(true, test1.hourOfDay().compareTo(test1) == 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41467);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41468);test1.hourOfDay().compareTo((ReadablePartial) null);
            __CLR4_4_1vssvsslgchos43.R.inc(41469);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1vssvsslgchos43.R.inc(41470);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1vssvsslgchos43.R.inc(41471);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1vssvsslgchos43.R.inc(41472);assertEquals(true, test1.hourOfDay().compareTo(dt2) < 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41473);assertEquals(true, test2.hourOfDay().compareTo(dt1) > 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41474);assertEquals(true, test1.hourOfDay().compareTo(dt1) == 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41475);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41476);test1.hourOfDay().compareTo((ReadableInstant) null);
            __CLR4_4_1vssvsslgchos43.R.inc(41477);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetMinute() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oej7l6w06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41478,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oej7l6w06(){try{__CLR4_4_1vssvsslgchos43.R.inc(41478);
        __CLR4_4_1vssvsslgchos43.R.inc(41479);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41480);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField());
        __CLR4_4_1vssvsslgchos43.R.inc(41481);assertEquals("minuteOfHour", test.minuteOfHour().getName());
        __CLR4_4_1vssvsslgchos43.R.inc(41482);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString());
        __CLR4_4_1vssvsslgchos43.R.inc(41483);assertSame(test, test.minuteOfHour().getLocalTime());
        __CLR4_4_1vssvsslgchos43.R.inc(41484);assertEquals(20, test.minuteOfHour().get());
        __CLR4_4_1vssvsslgchos43.R.inc(41485);assertEquals("20", test.minuteOfHour().getAsString());
        __CLR4_4_1vssvsslgchos43.R.inc(41486);assertEquals("20", test.minuteOfHour().getAsText());
        __CLR4_4_1vssvsslgchos43.R.inc(41487);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH));
        __CLR4_4_1vssvsslgchos43.R.inc(41488);assertEquals("20", test.minuteOfHour().getAsShortText());
        __CLR4_4_1vssvsslgchos43.R.inc(41489);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH));
        __CLR4_4_1vssvsslgchos43.R.inc(41490);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField());
        __CLR4_4_1vssvsslgchos43.R.inc(41491);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField());
        __CLR4_4_1vssvsslgchos43.R.inc(41492);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null));
        __CLR4_4_1vssvsslgchos43.R.inc(41493);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesMinute() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_110m2u2w0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetMaxMinValuesMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_110m2u2w0m(){try{__CLR4_4_1vssvsslgchos43.R.inc(41494);
        __CLR4_4_1vssvsslgchos43.R.inc(41495);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41496);assertEquals(0, test.minuteOfHour().getMinimumValue());
        __CLR4_4_1vssvsslgchos43.R.inc(41497);assertEquals(0, test.minuteOfHour().getMinimumValueOverall());
        __CLR4_4_1vssvsslgchos43.R.inc(41498);assertEquals(59, test.minuteOfHour().getMaximumValue());
        __CLR4_4_1vssvsslgchos43.R.inc(41499);assertEquals(59, test.minuteOfHour().getMaximumValueOverall());
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyWithMaxMinValueMinute() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xepr5bw0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyWithMaxMinValueMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xepr5bw0s(){try{__CLR4_4_1vssvsslgchos43.R.inc(41500);
        __CLR4_4_1vssvsslgchos43.R.inc(41501);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41502);check(test.minuteOfHour().withMaximumValue(), 10, 59, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41503);check(test.minuteOfHour().withMinimumValue(), 10, 0, 30, 40);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyPlusMinute() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dhv9i4w0w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41504,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dhv9i4w0w(){try{__CLR4_4_1vssvsslgchos43.R.inc(41504);
        __CLR4_4_1vssvsslgchos43.R.inc(41505);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41506);LocalTime copy = test.minuteOfHour().addCopy(9);
        __CLR4_4_1vssvsslgchos43.R.inc(41507);check(test, 10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41508);check(copy, 10, 29, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41509);copy = test.minuteOfHour().addCopy(39);
        __CLR4_4_1vssvsslgchos43.R.inc(41510);check(copy, 10, 59, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41511);copy = test.minuteOfHour().addCopy(40);
        __CLR4_4_1vssvsslgchos43.R.inc(41512);check(copy, 11, 0, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41513);copy = test.minuteOfHour().addCopy(1 * 60 + 45);
        __CLR4_4_1vssvsslgchos43.R.inc(41514);check(copy, 12, 5, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41515);copy = test.minuteOfHour().addCopy(13 * 60 + 39);
        __CLR4_4_1vssvsslgchos43.R.inc(41516);check(copy, 23, 59, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41517);copy = test.minuteOfHour().addCopy(13 * 60 + 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41518);check(copy, 0, 0, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41519);copy = test.minuteOfHour().addCopy(-9);
        __CLR4_4_1vssvsslgchos43.R.inc(41520);check(copy, 10, 11, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41521);copy = test.minuteOfHour().addCopy(-19);
        __CLR4_4_1vssvsslgchos43.R.inc(41522);check(copy, 10, 1, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41523);copy = test.minuteOfHour().addCopy(-20);
        __CLR4_4_1vssvsslgchos43.R.inc(41524);check(copy, 10, 0, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41525);copy = test.minuteOfHour().addCopy(-21);
        __CLR4_4_1vssvsslgchos43.R.inc(41526);check(copy, 9, 59, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41527);copy = test.minuteOfHour().addCopy(-(10 * 60 + 20));
        __CLR4_4_1vssvsslgchos43.R.inc(41528);check(copy, 0, 0, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41529);copy = test.minuteOfHour().addCopy(-(10 * 60 + 21));
        __CLR4_4_1vssvsslgchos43.R.inc(41530);check(copy, 23, 59, 30, 40);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyPlusNoWrapMinute() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qmgv2fw1n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusNoWrapMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41531,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qmgv2fw1n(){try{__CLR4_4_1vssvsslgchos43.R.inc(41531);
        __CLR4_4_1vssvsslgchos43.R.inc(41532);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41533);LocalTime copy = test.minuteOfHour().addNoWrapToCopy(9);
        __CLR4_4_1vssvsslgchos43.R.inc(41534);check(test, 10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41535);check(copy, 10, 29, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41536);copy = test.minuteOfHour().addNoWrapToCopy(39);
        __CLR4_4_1vssvsslgchos43.R.inc(41537);check(copy, 10, 59, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41538);copy = test.minuteOfHour().addNoWrapToCopy(40);
        __CLR4_4_1vssvsslgchos43.R.inc(41539);check(copy, 11, 0, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41540);copy = test.minuteOfHour().addNoWrapToCopy(1 * 60 + 45);
        __CLR4_4_1vssvsslgchos43.R.inc(41541);check(copy, 12, 5, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41542);copy = test.minuteOfHour().addNoWrapToCopy(13 * 60 + 39);
        __CLR4_4_1vssvsslgchos43.R.inc(41543);check(copy, 23, 59, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41544);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41545);test.minuteOfHour().addNoWrapToCopy(13 * 60 + 40);
            __CLR4_4_1vssvsslgchos43.R.inc(41546);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1vssvsslgchos43.R.inc(41547);check(test, 10, 20, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41548);copy = test.minuteOfHour().addNoWrapToCopy(-9);
        __CLR4_4_1vssvsslgchos43.R.inc(41549);check(copy, 10, 11, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41550);copy = test.minuteOfHour().addNoWrapToCopy(-19);
        __CLR4_4_1vssvsslgchos43.R.inc(41551);check(copy, 10, 1, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41552);copy = test.minuteOfHour().addNoWrapToCopy(-20);
        __CLR4_4_1vssvsslgchos43.R.inc(41553);check(copy, 10, 0, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41554);copy = test.minuteOfHour().addNoWrapToCopy(-21);
        __CLR4_4_1vssvsslgchos43.R.inc(41555);check(copy, 9, 59, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41556);copy = test.minuteOfHour().addNoWrapToCopy(-(10 * 60 + 20));
        __CLR4_4_1vssvsslgchos43.R.inc(41557);check(copy, 0, 0, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41558);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41559);test.minuteOfHour().addNoWrapToCopy(-(10 * 60 + 21));
            __CLR4_4_1vssvsslgchos43.R.inc(41560);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1vssvsslgchos43.R.inc(41561);check(test, 10, 20, 30, 40);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyPlusWrapFieldMinute() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z9x2ayw2i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusWrapFieldMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41562,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z9x2ayw2i(){try{__CLR4_4_1vssvsslgchos43.R.inc(41562);
        __CLR4_4_1vssvsslgchos43.R.inc(41563);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41564);LocalTime copy = test.minuteOfHour().addWrapFieldToCopy(9);
        __CLR4_4_1vssvsslgchos43.R.inc(41565);check(test, 10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41566);check(copy, 10, 29, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41567);copy = test.minuteOfHour().addWrapFieldToCopy(49);
        __CLR4_4_1vssvsslgchos43.R.inc(41568);check(copy, 10, 9, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41569);copy = test.minuteOfHour().addWrapFieldToCopy(-47);
        __CLR4_4_1vssvsslgchos43.R.inc(41570);check(copy, 10, 33, 30, 40);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertySetMinute() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_196rp2uw2r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41571,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_196rp2uw2r(){try{__CLR4_4_1vssvsslgchos43.R.inc(41571);
        __CLR4_4_1vssvsslgchos43.R.inc(41572);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41573);LocalTime copy = test.minuteOfHour().setCopy(12);
        __CLR4_4_1vssvsslgchos43.R.inc(41574);check(test, 10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41575);check(copy, 10, 12, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41576);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41577);test.minuteOfHour().setCopy(60);
            __CLR4_4_1vssvsslgchos43.R.inc(41578);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1vssvsslgchos43.R.inc(41579);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41580);test.minuteOfHour().setCopy(-1);
            __CLR4_4_1vssvsslgchos43.R.inc(41581);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertySetTextMinute() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18h1pnnw32();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetTextMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18h1pnnw32(){try{__CLR4_4_1vssvsslgchos43.R.inc(41582);
        __CLR4_4_1vssvsslgchos43.R.inc(41583);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41584);LocalTime copy = test.minuteOfHour().setCopy("12");
        __CLR4_4_1vssvsslgchos43.R.inc(41585);check(test, 10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41586);check(copy, 10, 12, 30, 40);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToMinute() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gtzyp8w37();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyCompareToMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41587,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gtzyp8w37(){try{__CLR4_4_1vssvsslgchos43.R.inc(41587);
        __CLR4_4_1vssvsslgchos43.R.inc(41588);LocalTime test1 = new LocalTime(TEST_TIME1);
        __CLR4_4_1vssvsslgchos43.R.inc(41589);LocalTime test2 = new LocalTime(TEST_TIME2);
        __CLR4_4_1vssvsslgchos43.R.inc(41590);assertEquals(true, test1.minuteOfHour().compareTo(test2) < 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41591);assertEquals(true, test2.minuteOfHour().compareTo(test1) > 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41592);assertEquals(true, test1.minuteOfHour().compareTo(test1) == 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41593);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41594);test1.minuteOfHour().compareTo((ReadablePartial) null);
            __CLR4_4_1vssvsslgchos43.R.inc(41595);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1vssvsslgchos43.R.inc(41596);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1vssvsslgchos43.R.inc(41597);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1vssvsslgchos43.R.inc(41598);assertEquals(true, test1.minuteOfHour().compareTo(dt2) < 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41599);assertEquals(true, test2.minuteOfHour().compareTo(dt1) > 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41600);assertEquals(true, test1.minuteOfHour().compareTo(dt1) == 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41601);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41602);test1.minuteOfHour().compareTo((ReadableInstant) null);
            __CLR4_4_1vssvsslgchos43.R.inc(41603);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetSecond() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1plsrcmw3o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1plsrcmw3o(){try{__CLR4_4_1vssvsslgchos43.R.inc(41604);
        __CLR4_4_1vssvsslgchos43.R.inc(41605);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41606);assertSame(test.getChronology().secondOfMinute(), test.secondOfMinute().getField());
        __CLR4_4_1vssvsslgchos43.R.inc(41607);assertEquals("secondOfMinute", test.secondOfMinute().getName());
        __CLR4_4_1vssvsslgchos43.R.inc(41608);assertEquals("Property[secondOfMinute]", test.secondOfMinute().toString());
        __CLR4_4_1vssvsslgchos43.R.inc(41609);assertSame(test, test.secondOfMinute().getLocalTime());
        __CLR4_4_1vssvsslgchos43.R.inc(41610);assertEquals(30, test.secondOfMinute().get());
        __CLR4_4_1vssvsslgchos43.R.inc(41611);assertEquals("30", test.secondOfMinute().getAsString());
        __CLR4_4_1vssvsslgchos43.R.inc(41612);assertEquals("30", test.secondOfMinute().getAsText());
        __CLR4_4_1vssvsslgchos43.R.inc(41613);assertEquals("30", test.secondOfMinute().getAsText(Locale.FRENCH));
        __CLR4_4_1vssvsslgchos43.R.inc(41614);assertEquals("30", test.secondOfMinute().getAsShortText());
        __CLR4_4_1vssvsslgchos43.R.inc(41615);assertEquals("30", test.secondOfMinute().getAsShortText(Locale.FRENCH));
        __CLR4_4_1vssvsslgchos43.R.inc(41616);assertEquals(test.getChronology().seconds(), test.secondOfMinute().getDurationField());
        __CLR4_4_1vssvsslgchos43.R.inc(41617);assertEquals(test.getChronology().minutes(), test.secondOfMinute().getRangeDurationField());
        __CLR4_4_1vssvsslgchos43.R.inc(41618);assertEquals(2, test.secondOfMinute().getMaximumTextLength(null));
        __CLR4_4_1vssvsslgchos43.R.inc(41619);assertEquals(2, test.secondOfMinute().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesSecond() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1e5vew44();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetMaxMinValuesSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1e5vew44(){try{__CLR4_4_1vssvsslgchos43.R.inc(41620);
        __CLR4_4_1vssvsslgchos43.R.inc(41621);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41622);assertEquals(0, test.secondOfMinute().getMinimumValue());
        __CLR4_4_1vssvsslgchos43.R.inc(41623);assertEquals(0, test.secondOfMinute().getMinimumValueOverall());
        __CLR4_4_1vssvsslgchos43.R.inc(41624);assertEquals(59, test.secondOfMinute().getMaximumValue());
        __CLR4_4_1vssvsslgchos43.R.inc(41625);assertEquals(59, test.secondOfMinute().getMaximumValueOverall());
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyWithMaxMinValueSecond() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cdxo3zw4a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyWithMaxMinValueSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cdxo3zw4a(){try{__CLR4_4_1vssvsslgchos43.R.inc(41626);
        __CLR4_4_1vssvsslgchos43.R.inc(41627);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41628);check(test.secondOfMinute().withMaximumValue(), 10, 20, 59, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41629);check(test.secondOfMinute().withMinimumValue(), 10, 20, 0, 40);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyPlusSecond() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yincjgw4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yincjgw4e(){try{__CLR4_4_1vssvsslgchos43.R.inc(41630);
        __CLR4_4_1vssvsslgchos43.R.inc(41631);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41632);LocalTime copy = test.secondOfMinute().addCopy(9);
        __CLR4_4_1vssvsslgchos43.R.inc(41633);check(test, 10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41634);check(copy, 10, 20, 39, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41635);copy = test.secondOfMinute().addCopy(29);
        __CLR4_4_1vssvsslgchos43.R.inc(41636);check(copy, 10, 20, 59, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41637);copy = test.secondOfMinute().addCopy(30);
        __CLR4_4_1vssvsslgchos43.R.inc(41638);check(copy, 10, 21, 0, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41639);copy = test.secondOfMinute().addCopy(39 * 60 + 29);
        __CLR4_4_1vssvsslgchos43.R.inc(41640);check(copy, 10, 59, 59, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41641);copy = test.secondOfMinute().addCopy(39 * 60 + 30);
        __CLR4_4_1vssvsslgchos43.R.inc(41642);check(copy, 11, 0, 0, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41643);copy = test.secondOfMinute().addCopy(13 * 60 * 60 + 39 * 60 + 30);
        __CLR4_4_1vssvsslgchos43.R.inc(41644);check(copy, 0, 0, 0, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41645);copy = test.secondOfMinute().addCopy(-9);
        __CLR4_4_1vssvsslgchos43.R.inc(41646);check(copy, 10, 20, 21, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41647);copy = test.secondOfMinute().addCopy(-30);
        __CLR4_4_1vssvsslgchos43.R.inc(41648);check(copy, 10, 20, 0, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41649);copy = test.secondOfMinute().addCopy(-31);
        __CLR4_4_1vssvsslgchos43.R.inc(41650);check(copy, 10, 19, 59, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41651);copy = test.secondOfMinute().addCopy(-(10 * 60 * 60 + 20 * 60 + 30));
        __CLR4_4_1vssvsslgchos43.R.inc(41652);check(copy, 0, 0, 0, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41653);copy = test.secondOfMinute().addCopy(-(10 * 60 * 60 + 20 * 60 + 31));
        __CLR4_4_1vssvsslgchos43.R.inc(41654);check(copy, 23, 59, 59, 40);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyPlusNoWrapSecond() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ndv3vdw53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusNoWrapSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ndv3vdw53(){try{__CLR4_4_1vssvsslgchos43.R.inc(41655);
        __CLR4_4_1vssvsslgchos43.R.inc(41656);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41657);LocalTime copy = test.secondOfMinute().addNoWrapToCopy(9);
        __CLR4_4_1vssvsslgchos43.R.inc(41658);check(test, 10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41659);check(copy, 10, 20, 39, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41660);copy = test.secondOfMinute().addNoWrapToCopy(29);
        __CLR4_4_1vssvsslgchos43.R.inc(41661);check(copy, 10, 20, 59, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41662);copy = test.secondOfMinute().addNoWrapToCopy(30);
        __CLR4_4_1vssvsslgchos43.R.inc(41663);check(copy, 10, 21, 0, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41664);copy = test.secondOfMinute().addNoWrapToCopy(39 * 60 + 29);
        __CLR4_4_1vssvsslgchos43.R.inc(41665);check(copy, 10, 59, 59, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41666);copy = test.secondOfMinute().addNoWrapToCopy(39 * 60 + 30);
        __CLR4_4_1vssvsslgchos43.R.inc(41667);check(copy, 11, 0, 0, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41668);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41669);test.secondOfMinute().addNoWrapToCopy(13 * 60 * 60 + 39 * 60 + 30);
            __CLR4_4_1vssvsslgchos43.R.inc(41670);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1vssvsslgchos43.R.inc(41671);check(test, 10, 20, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41672);copy = test.secondOfMinute().addNoWrapToCopy(-9);
        __CLR4_4_1vssvsslgchos43.R.inc(41673);check(copy, 10, 20, 21, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41674);copy = test.secondOfMinute().addNoWrapToCopy(-30);
        __CLR4_4_1vssvsslgchos43.R.inc(41675);check(copy, 10, 20, 0, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41676);copy = test.secondOfMinute().addNoWrapToCopy(-31);
        __CLR4_4_1vssvsslgchos43.R.inc(41677);check(copy, 10, 19, 59, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41678);copy = test.secondOfMinute().addNoWrapToCopy(-(10 * 60 * 60 + 20 * 60 + 30));
        __CLR4_4_1vssvsslgchos43.R.inc(41679);check(copy, 0, 0, 0, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41680);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41681);test.secondOfMinute().addNoWrapToCopy(-(10 * 60 * 60 + 20 * 60 + 31));
            __CLR4_4_1vssvsslgchos43.R.inc(41682);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1vssvsslgchos43.R.inc(41683);check(test, 10, 20, 30, 40);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyPlusWrapFieldSecond() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eqewmuw5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusWrapFieldSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eqewmuw5w(){try{__CLR4_4_1vssvsslgchos43.R.inc(41684);
        __CLR4_4_1vssvsslgchos43.R.inc(41685);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41686);LocalTime copy = test.secondOfMinute().addWrapFieldToCopy(9);
        __CLR4_4_1vssvsslgchos43.R.inc(41687);check(test, 10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41688);check(copy, 10, 20, 39, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41689);copy = test.secondOfMinute().addWrapFieldToCopy(49);
        __CLR4_4_1vssvsslgchos43.R.inc(41690);check(copy, 10, 20, 19, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41691);copy = test.secondOfMinute().addWrapFieldToCopy(-47);
        __CLR4_4_1vssvsslgchos43.R.inc(41692);check(copy, 10, 20, 43, 40);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertySetSecond() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u7js46w65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u7js46w65(){try{__CLR4_4_1vssvsslgchos43.R.inc(41693);
        __CLR4_4_1vssvsslgchos43.R.inc(41694);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41695);LocalTime copy = test.secondOfMinute().setCopy(12);
        __CLR4_4_1vssvsslgchos43.R.inc(41696);check(test, 10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41697);check(copy, 10, 20, 12, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41698);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41699);test.secondOfMinute().setCopy(60);
            __CLR4_4_1vssvsslgchos43.R.inc(41700);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1vssvsslgchos43.R.inc(41701);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41702);test.secondOfMinute().setCopy(-1);
            __CLR4_4_1vssvsslgchos43.R.inc(41703);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertySetTextSecond() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thtsozw6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetTextSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thtsozw6g(){try{__CLR4_4_1vssvsslgchos43.R.inc(41704);
        __CLR4_4_1vssvsslgchos43.R.inc(41705);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41706);LocalTime copy = test.secondOfMinute().setCopy("12");
        __CLR4_4_1vssvsslgchos43.R.inc(41707);check(test, 10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41708);check(copy, 10, 20, 12, 40);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToSecond() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_146s4c4w6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyCompareToSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_146s4c4w6l(){try{__CLR4_4_1vssvsslgchos43.R.inc(41709);
        __CLR4_4_1vssvsslgchos43.R.inc(41710);LocalTime test1 = new LocalTime(TEST_TIME1);
        __CLR4_4_1vssvsslgchos43.R.inc(41711);LocalTime test2 = new LocalTime(TEST_TIME2);
        __CLR4_4_1vssvsslgchos43.R.inc(41712);assertEquals(true, test1.secondOfMinute().compareTo(test2) < 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41713);assertEquals(true, test2.secondOfMinute().compareTo(test1) > 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41714);assertEquals(true, test1.secondOfMinute().compareTo(test1) == 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41715);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41716);test1.secondOfMinute().compareTo((ReadablePartial) null);
            __CLR4_4_1vssvsslgchos43.R.inc(41717);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1vssvsslgchos43.R.inc(41718);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1vssvsslgchos43.R.inc(41719);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1vssvsslgchos43.R.inc(41720);assertEquals(true, test1.secondOfMinute().compareTo(dt2) < 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41721);assertEquals(true, test2.secondOfMinute().compareTo(dt1) > 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41722);assertEquals(true, test1.secondOfMinute().compareTo(dt1) == 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41723);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41724);test1.secondOfMinute().compareTo((ReadableInstant) null);
            __CLR4_4_1vssvsslgchos43.R.inc(41725);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetMilli() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15098bw72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15098bw72(){try{__CLR4_4_1vssvsslgchos43.R.inc(41726);
        __CLR4_4_1vssvsslgchos43.R.inc(41727);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41728);assertSame(test.getChronology().millisOfSecond(), test.millisOfSecond().getField());
        __CLR4_4_1vssvsslgchos43.R.inc(41729);assertEquals("millisOfSecond", test.millisOfSecond().getName());
        __CLR4_4_1vssvsslgchos43.R.inc(41730);assertEquals("Property[millisOfSecond]", test.millisOfSecond().toString());
        __CLR4_4_1vssvsslgchos43.R.inc(41731);assertSame(test, test.millisOfSecond().getLocalTime());
        __CLR4_4_1vssvsslgchos43.R.inc(41732);assertEquals(40, test.millisOfSecond().get());
        __CLR4_4_1vssvsslgchos43.R.inc(41733);assertEquals("40", test.millisOfSecond().getAsString());
        __CLR4_4_1vssvsslgchos43.R.inc(41734);assertEquals("40", test.millisOfSecond().getAsText());
        __CLR4_4_1vssvsslgchos43.R.inc(41735);assertEquals("40", test.millisOfSecond().getAsText(Locale.FRENCH));
        __CLR4_4_1vssvsslgchos43.R.inc(41736);assertEquals("40", test.millisOfSecond().getAsShortText());
        __CLR4_4_1vssvsslgchos43.R.inc(41737);assertEquals("40", test.millisOfSecond().getAsShortText(Locale.FRENCH));
        __CLR4_4_1vssvsslgchos43.R.inc(41738);assertEquals(test.getChronology().millis(), test.millisOfSecond().getDurationField());
        __CLR4_4_1vssvsslgchos43.R.inc(41739);assertEquals(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField());
        __CLR4_4_1vssvsslgchos43.R.inc(41740);assertEquals(3, test.millisOfSecond().getMaximumTextLength(null));
        __CLR4_4_1vssvsslgchos43.R.inc(41741);assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesMilli() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ob72xhw7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetMaxMinValuesMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ob72xhw7i(){try{__CLR4_4_1vssvsslgchos43.R.inc(41742);
        __CLR4_4_1vssvsslgchos43.R.inc(41743);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41744);assertEquals(0, test.millisOfSecond().getMinimumValue());
        __CLR4_4_1vssvsslgchos43.R.inc(41745);assertEquals(0, test.millisOfSecond().getMinimumValueOverall());
        __CLR4_4_1vssvsslgchos43.R.inc(41746);assertEquals(999, test.millisOfSecond().getMaximumValue());
        __CLR4_4_1vssvsslgchos43.R.inc(41747);assertEquals(999, test.millisOfSecond().getMaximumValueOverall());
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyWithMaxMinValueMilli() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ynnm0uw7o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyWithMaxMinValueMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41748,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ynnm0uw7o(){try{__CLR4_4_1vssvsslgchos43.R.inc(41748);
        __CLR4_4_1vssvsslgchos43.R.inc(41749);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41750);check(test.millisOfSecond().withMaximumValue(), 10, 20, 30, 999);
        __CLR4_4_1vssvsslgchos43.R.inc(41751);check(test.millisOfSecond().withMinimumValue(), 10, 20, 30, 0);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyPlusMilli() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xvmzwzw7s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41752,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xvmzwzw7s(){try{__CLR4_4_1vssvsslgchos43.R.inc(41752);
        __CLR4_4_1vssvsslgchos43.R.inc(41753);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41754);LocalTime copy = test.millisOfSecond().addCopy(9);
        __CLR4_4_1vssvsslgchos43.R.inc(41755);check(test, 10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41756);check(copy, 10, 20, 30, 49);

        __CLR4_4_1vssvsslgchos43.R.inc(41757);copy = test.millisOfSecond().addCopy(959);
        __CLR4_4_1vssvsslgchos43.R.inc(41758);check(copy, 10, 20, 30, 999);

        __CLR4_4_1vssvsslgchos43.R.inc(41759);copy = test.millisOfSecond().addCopy(960);
        __CLR4_4_1vssvsslgchos43.R.inc(41760);check(copy, 10, 20, 31, 0);

        __CLR4_4_1vssvsslgchos43.R.inc(41761);copy = test.millisOfSecond().addCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 959);
        __CLR4_4_1vssvsslgchos43.R.inc(41762);check(copy, 23, 59, 59, 999);

        __CLR4_4_1vssvsslgchos43.R.inc(41763);copy = test.millisOfSecond().addCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 960);
        __CLR4_4_1vssvsslgchos43.R.inc(41764);check(copy, 0, 0, 0, 0);

        __CLR4_4_1vssvsslgchos43.R.inc(41765);copy = test.millisOfSecond().addCopy(-9);
        __CLR4_4_1vssvsslgchos43.R.inc(41766);check(copy, 10, 20, 30, 31);

        __CLR4_4_1vssvsslgchos43.R.inc(41767);copy = test.millisOfSecond().addCopy(-40);
        __CLR4_4_1vssvsslgchos43.R.inc(41768);check(copy, 10, 20, 30, 0);

        __CLR4_4_1vssvsslgchos43.R.inc(41769);copy = test.millisOfSecond().addCopy(-41);
        __CLR4_4_1vssvsslgchos43.R.inc(41770);check(copy, 10, 20, 29, 999);

        __CLR4_4_1vssvsslgchos43.R.inc(41771);copy = test.millisOfSecond().addCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 40));
        __CLR4_4_1vssvsslgchos43.R.inc(41772);check(copy, 0, 0, 0, 0);

        __CLR4_4_1vssvsslgchos43.R.inc(41773);copy = test.millisOfSecond().addCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 41));
        __CLR4_4_1vssvsslgchos43.R.inc(41774);check(copy, 23, 59, 59, 999);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyPlusNoWrapMilli() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16xw2uww8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusNoWrapMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16xw2uww8f(){try{__CLR4_4_1vssvsslgchos43.R.inc(41775);
        __CLR4_4_1vssvsslgchos43.R.inc(41776);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41777);LocalTime copy = test.millisOfSecond().addNoWrapToCopy(9);
        __CLR4_4_1vssvsslgchos43.R.inc(41778);check(test, 10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41779);check(copy, 10, 20, 30, 49);

        __CLR4_4_1vssvsslgchos43.R.inc(41780);copy = test.millisOfSecond().addNoWrapToCopy(959);
        __CLR4_4_1vssvsslgchos43.R.inc(41781);check(copy, 10, 20, 30, 999);

        __CLR4_4_1vssvsslgchos43.R.inc(41782);copy = test.millisOfSecond().addNoWrapToCopy(960);
        __CLR4_4_1vssvsslgchos43.R.inc(41783);check(copy, 10, 20, 31, 0);

        __CLR4_4_1vssvsslgchos43.R.inc(41784);copy = test.millisOfSecond().addNoWrapToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 959);
        __CLR4_4_1vssvsslgchos43.R.inc(41785);check(copy, 23, 59, 59, 999);

        __CLR4_4_1vssvsslgchos43.R.inc(41786);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41787);test.millisOfSecond().addNoWrapToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 960);
            __CLR4_4_1vssvsslgchos43.R.inc(41788);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1vssvsslgchos43.R.inc(41789);check(test, 10, 20, 30, 40);

        __CLR4_4_1vssvsslgchos43.R.inc(41790);copy = test.millisOfSecond().addNoWrapToCopy(-9);
        __CLR4_4_1vssvsslgchos43.R.inc(41791);check(copy, 10, 20, 30, 31);

        __CLR4_4_1vssvsslgchos43.R.inc(41792);copy = test.millisOfSecond().addNoWrapToCopy(-40);
        __CLR4_4_1vssvsslgchos43.R.inc(41793);check(copy, 10, 20, 30, 0);

        __CLR4_4_1vssvsslgchos43.R.inc(41794);copy = test.millisOfSecond().addNoWrapToCopy(-41);
        __CLR4_4_1vssvsslgchos43.R.inc(41795);check(copy, 10, 20, 29, 999);

        __CLR4_4_1vssvsslgchos43.R.inc(41796);copy = test.millisOfSecond().addNoWrapToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 40));
        __CLR4_4_1vssvsslgchos43.R.inc(41797);check(copy, 0, 0, 0, 0);

        __CLR4_4_1vssvsslgchos43.R.inc(41798);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41799);test.millisOfSecond().addNoWrapToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 41));
            __CLR4_4_1vssvsslgchos43.R.inc(41800);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1vssvsslgchos43.R.inc(41801);check(test, 10, 20, 30, 40);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyPlusWrapFieldMilli() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1732wlhw96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusWrapFieldMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41802,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1732wlhw96(){try{__CLR4_4_1vssvsslgchos43.R.inc(41802);
        __CLR4_4_1vssvsslgchos43.R.inc(41803);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41804);LocalTime copy = test.millisOfSecond().addWrapFieldToCopy(9);
        __CLR4_4_1vssvsslgchos43.R.inc(41805);check(test, 10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41806);check(copy, 10, 20, 30, 49);

        __CLR4_4_1vssvsslgchos43.R.inc(41807);copy = test.millisOfSecond().addWrapFieldToCopy(995);
        __CLR4_4_1vssvsslgchos43.R.inc(41808);check(copy, 10, 20, 30, 35);

        __CLR4_4_1vssvsslgchos43.R.inc(41809);copy = test.millisOfSecond().addWrapFieldToCopy(-47);
        __CLR4_4_1vssvsslgchos43.R.inc(41810);check(copy, 10, 20, 30, 993);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertySetMilli() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1feqhbtw9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1feqhbtw9f(){try{__CLR4_4_1vssvsslgchos43.R.inc(41811);
        __CLR4_4_1vssvsslgchos43.R.inc(41812);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41813);LocalTime copy = test.millisOfSecond().setCopy(12);
        __CLR4_4_1vssvsslgchos43.R.inc(41814);check(test, 10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41815);check(copy, 10, 20, 30, 12);

        __CLR4_4_1vssvsslgchos43.R.inc(41816);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41817);test.millisOfSecond().setCopy(1000);
            __CLR4_4_1vssvsslgchos43.R.inc(41818);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1vssvsslgchos43.R.inc(41819);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41820);test.millisOfSecond().setCopy(-1);
            __CLR4_4_1vssvsslgchos43.R.inc(41821);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertySetTextMilli() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17iyw2cw9q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetTextMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17iyw2cw9q(){try{__CLR4_4_1vssvsslgchos43.R.inc(41822);
        __CLR4_4_1vssvsslgchos43.R.inc(41823);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41824);LocalTime copy = test.millisOfSecond().setCopy("12");
        __CLR4_4_1vssvsslgchos43.R.inc(41825);check(test, 10, 20, 30, 40);
        __CLR4_4_1vssvsslgchos43.R.inc(41826);check(copy, 10, 20, 30, 12);
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToMilli() {__CLR4_4_1vssvsslgchos43.R.globalSliceStart(getClass().getName(),41827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13rds2tw9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vssvsslgchos43.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vssvsslgchos43.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyCompareToMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13rds2tw9v(){try{__CLR4_4_1vssvsslgchos43.R.inc(41827);
        __CLR4_4_1vssvsslgchos43.R.inc(41828);LocalTime test1 = new LocalTime(TEST_TIME1);
        __CLR4_4_1vssvsslgchos43.R.inc(41829);LocalTime test2 = new LocalTime(TEST_TIME2);
        __CLR4_4_1vssvsslgchos43.R.inc(41830);assertEquals(true, test1.millisOfSecond().compareTo(test2) < 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41831);assertEquals(true, test2.millisOfSecond().compareTo(test1) > 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41832);assertEquals(true, test1.millisOfSecond().compareTo(test1) == 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41833);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41834);test1.millisOfSecond().compareTo((ReadablePartial) null);
            __CLR4_4_1vssvsslgchos43.R.inc(41835);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1vssvsslgchos43.R.inc(41836);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1vssvsslgchos43.R.inc(41837);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1vssvsslgchos43.R.inc(41838);assertEquals(true, test1.millisOfSecond().compareTo(dt2) < 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41839);assertEquals(true, test2.millisOfSecond().compareTo(dt1) > 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41840);assertEquals(true, test1.millisOfSecond().compareTo(dt1) == 0);
        __CLR4_4_1vssvsslgchos43.R.inc(41841);try {
            __CLR4_4_1vssvsslgchos43.R.inc(41842);test1.millisOfSecond().compareTo((ReadableInstant) null);
            __CLR4_4_1vssvsslgchos43.R.inc(41843);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(LocalTime test, int hour, int min, int sec, int milli) {try{__CLR4_4_1vssvsslgchos43.R.inc(41844);
        __CLR4_4_1vssvsslgchos43.R.inc(41845);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1vssvsslgchos43.R.inc(41846);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1vssvsslgchos43.R.inc(41847);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1vssvsslgchos43.R.inc(41848);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1vssvsslgchos43.R.flushNeeded();}}
}
