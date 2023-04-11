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
package org.joda.time;

import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is a Junit unit test for Partial.
 *
 * @author Stephen Colebourne
 */
public class TestPartial_Properties {static class __CLR4_4_113fp13fplgchosde{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,51362,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    private DateTimeZone zone = null;
    private static final DateTimeFieldType[] TYPES = new DateTimeFieldType[]{
            DateTimeFieldType.hourOfDay(),
            DateTimeFieldType.minuteOfHour(),
            DateTimeFieldType.secondOfMinute(),
            DateTimeFieldType.millisOfSecond()
    };
    private static final int[] VALUES = new int[]{10, 20, 30, 40};
    private static final int[] VALUES1 = new int[]{1, 2, 3, 4};
    private static final int[] VALUES2 = new int[]{5, 6, 7, 8};

    //    private long TEST_TIME_NOW =
//        10L * DateTimeConstants.MILLIS_PER_HOUR
//        + 20L * DateTimeConstants.MILLIS_PER_MINUTE
//        + 30L * DateTimeConstants.MILLIS_PER_SECOND
//        + 40L;
//        
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

    public static void main(String[] args) throws Exception {try{__CLR4_4_113fp13fplgchosde.R.inc(51109);
        __CLR4_4_113fp13fplgchosde.R.inc(51110);TestPartial_Properties TB = new TestPartial_Properties();
        __CLR4_4_113fp13fplgchosde.R.inc(51111);TB.setUp();
        __CLR4_4_113fp13fplgchosde.R.inc(51112);TB.testPropertyGetHour();
        __CLR4_4_113fp13fplgchosde.R.inc(51113);TB.tearDown();
        __CLR4_4_113fp13fplgchosde.R.inc(51114);TB.setUp();
        __CLR4_4_113fp13fplgchosde.R.inc(51115);TB.testPropertyGetMaxMinValuesHour();
        __CLR4_4_113fp13fplgchosde.R.inc(51116);TB.tearDown();
        //TB.setUp(); TB.testPropertyAddHour(); TB.tearDown();
        __CLR4_4_113fp13fplgchosde.R.inc(51117);TB.setUp();
        __CLR4_4_113fp13fplgchosde.R.inc(51118);TB.testPropertyAddHour();
        __CLR4_4_113fp13fplgchosde.R.inc(51119);TB.tearDown();
        __CLR4_4_113fp13fplgchosde.R.inc(51120);TB.setUp();
        __CLR4_4_113fp13fplgchosde.R.inc(51121);TB.testPropertyAddWrapFieldHour();
        __CLR4_4_113fp13fplgchosde.R.inc(51122);TB.tearDown();
        __CLR4_4_113fp13fplgchosde.R.inc(51123);TB.setUp();
        __CLR4_4_113fp13fplgchosde.R.inc(51124);TB.testPropertySetHour();
        __CLR4_4_113fp13fplgchosde.R.inc(51125);TB.tearDown();
        __CLR4_4_113fp13fplgchosde.R.inc(51126);TB.setUp();
        __CLR4_4_113fp13fplgchosde.R.inc(51127);TB.testPropertySetTextHour();
        __CLR4_4_113fp13fplgchosde.R.inc(51128);TB.tearDown();
        __CLR4_4_113fp13fplgchosde.R.inc(51129);TB.setUp();
        __CLR4_4_113fp13fplgchosde.R.inc(51130);TB.testPropertyWithMaximumValueHour();
        __CLR4_4_113fp13fplgchosde.R.inc(51131);TB.tearDown();
        __CLR4_4_113fp13fplgchosde.R.inc(51132);TB.setUp();
        __CLR4_4_113fp13fplgchosde.R.inc(51133);TB.testPropertyWithMinimumValueHour();
        __CLR4_4_113fp13fplgchosde.R.inc(51134);TB.tearDown();
        __CLR4_4_113fp13fplgchosde.R.inc(51135);TB.setUp();
        __CLR4_4_113fp13fplgchosde.R.inc(51136);TB.testPropertyCompareToHour();
        __CLR4_4_113fp13fplgchosde.R.inc(51137);TB.tearDown();
        __CLR4_4_113fp13fplgchosde.R.inc(51138);TB.setUp();
        __CLR4_4_113fp13fplgchosde.R.inc(51139);TB.testPropertyGetMinute();
        __CLR4_4_113fp13fplgchosde.R.inc(51140);TB.tearDown();
        __CLR4_4_113fp13fplgchosde.R.inc(51141);TB.setUp();
        __CLR4_4_113fp13fplgchosde.R.inc(51142);TB.testPropertyGetMaxMinValuesMinute();
        __CLR4_4_113fp13fplgchosde.R.inc(51143);TB.tearDown();
        //TB.setUp(); TB.testPropertyAddMinute(); TB.tearDown();
        __CLR4_4_113fp13fplgchosde.R.inc(51144);TB.setUp();
        __CLR4_4_113fp13fplgchosde.R.inc(51145);TB.testPropertyAddMinute();
        __CLR4_4_113fp13fplgchosde.R.inc(51146);TB.tearDown();
        __CLR4_4_113fp13fplgchosde.R.inc(51147);TB.setUp();
        __CLR4_4_113fp13fplgchosde.R.inc(51148);TB.testPropertyAddWrapFieldMinute();
        __CLR4_4_113fp13fplgchosde.R.inc(51149);TB.tearDown();
        __CLR4_4_113fp13fplgchosde.R.inc(51150);TB.setUp();
        __CLR4_4_113fp13fplgchosde.R.inc(51151);TB.testPropertySetMinute();
        __CLR4_4_113fp13fplgchosde.R.inc(51152);TB.tearDown();
        __CLR4_4_113fp13fplgchosde.R.inc(51153);TB.setUp();
        __CLR4_4_113fp13fplgchosde.R.inc(51154);TB.testPropertySetTextMinute();
        __CLR4_4_113fp13fplgchosde.R.inc(51155);TB.tearDown();
        __CLR4_4_113fp13fplgchosde.R.inc(51156);TB.setUp();
        __CLR4_4_113fp13fplgchosde.R.inc(51157);TB.testPropertyCompareToMinute();
        __CLR4_4_113fp13fplgchosde.R.inc(51158);TB.tearDown();

    }finally{__CLR4_4_113fp13fplgchosde.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestPartial_Properties.class);
    }

    public TestPartial_Properties(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_113fp13fplgchosde.R.inc(51159);
        __CLR4_4_113fp13fplgchosde.R.inc(51160);zone = DateTimeZone.getDefault();
        __CLR4_4_113fp13fplgchosde.R.inc(51161);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_113fp13fplgchosde.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_113fp13fplgchosde.R.inc(51162);
        __CLR4_4_113fp13fplgchosde.R.inc(51163);DateTimeZone.setDefault(zone);
        __CLR4_4_113fp13fplgchosde.R.inc(51164);zone = null;
    }finally{__CLR4_4_113fp13fplgchosde.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetHour() {__CLR4_4_113fp13fplgchosde.R.globalSliceStart(getClass().getName(),51165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mry6ka13h9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113fp13fplgchosde.R.rethrow($CLV_t2$);}finally{__CLR4_4_113fp13fplgchosde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyGetHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mry6ka13h9(){try{__CLR4_4_113fp13fplgchosde.R.inc(51165);
        __CLR4_4_113fp13fplgchosde.R.inc(51166);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_113fp13fplgchosde.R.inc(51167);assertSame(test.getChronology().hourOfDay(), test.property(DateTimeFieldType.hourOfDay()).getField());
        __CLR4_4_113fp13fplgchosde.R.inc(51168);assertEquals("hourOfDay", test.property(DateTimeFieldType.hourOfDay()).getName());
        __CLR4_4_113fp13fplgchosde.R.inc(51169);assertEquals("Property[hourOfDay]", test.property(DateTimeFieldType.hourOfDay()).toString());
        __CLR4_4_113fp13fplgchosde.R.inc(51170);assertSame(test, test.property(DateTimeFieldType.hourOfDay()).getReadablePartial());
        __CLR4_4_113fp13fplgchosde.R.inc(51171);assertSame(test, test.property(DateTimeFieldType.hourOfDay()).getPartial());
        __CLR4_4_113fp13fplgchosde.R.inc(51172);assertEquals(10, test.property(DateTimeFieldType.hourOfDay()).get());
        __CLR4_4_113fp13fplgchosde.R.inc(51173);assertEquals("10", test.property(DateTimeFieldType.hourOfDay()).getAsString());
        __CLR4_4_113fp13fplgchosde.R.inc(51174);assertEquals("10", test.property(DateTimeFieldType.hourOfDay()).getAsText());
        __CLR4_4_113fp13fplgchosde.R.inc(51175);assertEquals("10", test.property(DateTimeFieldType.hourOfDay()).getAsText(Locale.FRENCH));
        __CLR4_4_113fp13fplgchosde.R.inc(51176);assertEquals("10", test.property(DateTimeFieldType.hourOfDay()).getAsShortText());
        __CLR4_4_113fp13fplgchosde.R.inc(51177);assertEquals("10", test.property(DateTimeFieldType.hourOfDay()).getAsShortText(Locale.FRENCH));
        __CLR4_4_113fp13fplgchosde.R.inc(51178);assertEquals(test.getChronology().hours(), test.property(DateTimeFieldType.hourOfDay()).getDurationField());
        __CLR4_4_113fp13fplgchosde.R.inc(51179);assertEquals(test.getChronology().days(), test.property(DateTimeFieldType.hourOfDay()).getRangeDurationField());
        __CLR4_4_113fp13fplgchosde.R.inc(51180);assertEquals(2, test.property(DateTimeFieldType.hourOfDay()).getMaximumTextLength(null));
        __CLR4_4_113fp13fplgchosde.R.inc(51181);assertEquals(2, test.property(DateTimeFieldType.hourOfDay()).getMaximumShortTextLength(null));
    }finally{__CLR4_4_113fp13fplgchosde.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesHour() {__CLR4_4_113fp13fplgchosde.R.globalSliceStart(getClass().getName(),51182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13xi8wm13hq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113fp13fplgchosde.R.rethrow($CLV_t2$);}finally{__CLR4_4_113fp13fplgchosde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyGetMaxMinValuesHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13xi8wm13hq(){try{__CLR4_4_113fp13fplgchosde.R.inc(51182);
        __CLR4_4_113fp13fplgchosde.R.inc(51183);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_113fp13fplgchosde.R.inc(51184);assertEquals(0, test.property(DateTimeFieldType.hourOfDay()).getMinimumValue());
        __CLR4_4_113fp13fplgchosde.R.inc(51185);assertEquals(0, test.property(DateTimeFieldType.hourOfDay()).getMinimumValueOverall());
        __CLR4_4_113fp13fplgchosde.R.inc(51186);assertEquals(23, test.property(DateTimeFieldType.hourOfDay()).getMaximumValue());
        __CLR4_4_113fp13fplgchosde.R.inc(51187);assertEquals(23, test.property(DateTimeFieldType.hourOfDay()).getMaximumValueOverall());
    }finally{__CLR4_4_113fp13fplgchosde.R.flushNeeded();}}

    //    @Test public void testPropertyAddHour() {
//        Partial test = new Partial(TYPES, VALUES);
//        Partial copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(9);
//        check(test, 10, 20, 30, 40);
//        check(copy, 19, 20, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(0);
//        check(copy, 10, 20, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(13);
//        check(copy, 23, 20, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(14);
//        check(copy, 0, 20, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(-10);
//        check(copy, 0, 20, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(-11);
//        check(copy, 23, 20, 30, 40);
//    }
//
    @Test
    public void testPropertyAddHour() {__CLR4_4_113fp13fplgchosde.R.globalSliceStart(getClass().getName(),51188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15c189x13hw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113fp13fplgchosde.R.rethrow($CLV_t2$);}finally{__CLR4_4_113fp13fplgchosde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyAddHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15c189x13hw(){try{__CLR4_4_113fp13fplgchosde.R.inc(51188);
        __CLR4_4_113fp13fplgchosde.R.inc(51189);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_113fp13fplgchosde.R.inc(51190);Partial copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(9);
        __CLR4_4_113fp13fplgchosde.R.inc(51191);check(test, 10, 20, 30, 40);
        __CLR4_4_113fp13fplgchosde.R.inc(51192);check(copy, 19, 20, 30, 40);

        __CLR4_4_113fp13fplgchosde.R.inc(51193);copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(0);
        __CLR4_4_113fp13fplgchosde.R.inc(51194);check(copy, 10, 20, 30, 40);

        __CLR4_4_113fp13fplgchosde.R.inc(51195);copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(13);
        __CLR4_4_113fp13fplgchosde.R.inc(51196);check(copy, 23, 20, 30, 40);

        __CLR4_4_113fp13fplgchosde.R.inc(51197);try {
            __CLR4_4_113fp13fplgchosde.R.inc(51198);test.property(DateTimeFieldType.hourOfDay()).addToCopy(14);
            __CLR4_4_113fp13fplgchosde.R.inc(51199);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_113fp13fplgchosde.R.inc(51200);check(test, 10, 20, 30, 40);

        __CLR4_4_113fp13fplgchosde.R.inc(51201);copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(-10);
        __CLR4_4_113fp13fplgchosde.R.inc(51202);check(copy, 0, 20, 30, 40);

        __CLR4_4_113fp13fplgchosde.R.inc(51203);try {
            __CLR4_4_113fp13fplgchosde.R.inc(51204);test.property(DateTimeFieldType.hourOfDay()).addToCopy(-11);
            __CLR4_4_113fp13fplgchosde.R.inc(51205);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_113fp13fplgchosde.R.inc(51206);check(test, 10, 20, 30, 40);
    }finally{__CLR4_4_113fp13fplgchosde.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldHour() {__CLR4_4_113fp13fplgchosde.R.globalSliceStart(getClass().getName(),51207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x88om713if();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113fp13fplgchosde.R.rethrow($CLV_t2$);}finally{__CLR4_4_113fp13fplgchosde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyAddWrapFieldHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x88om713if(){try{__CLR4_4_113fp13fplgchosde.R.inc(51207);
        __CLR4_4_113fp13fplgchosde.R.inc(51208);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_113fp13fplgchosde.R.inc(51209);Partial copy = test.property(DateTimeFieldType.hourOfDay()).addWrapFieldToCopy(9);
        __CLR4_4_113fp13fplgchosde.R.inc(51210);check(test, 10, 20, 30, 40);
        __CLR4_4_113fp13fplgchosde.R.inc(51211);check(copy, 19, 20, 30, 40);

        __CLR4_4_113fp13fplgchosde.R.inc(51212);copy = test.property(DateTimeFieldType.hourOfDay()).addWrapFieldToCopy(0);
        __CLR4_4_113fp13fplgchosde.R.inc(51213);check(copy, 10, 20, 30, 40);

        __CLR4_4_113fp13fplgchosde.R.inc(51214);copy = test.property(DateTimeFieldType.hourOfDay()).addWrapFieldToCopy(18);
        __CLR4_4_113fp13fplgchosde.R.inc(51215);check(copy, 4, 20, 30, 40);

        __CLR4_4_113fp13fplgchosde.R.inc(51216);copy = test.property(DateTimeFieldType.hourOfDay()).addWrapFieldToCopy(-15);
        __CLR4_4_113fp13fplgchosde.R.inc(51217);check(copy, 19, 20, 30, 40);
    }finally{__CLR4_4_113fp13fplgchosde.R.flushNeeded();}}

    @Test
    public void testPropertySetHour() {__CLR4_4_113fp13fplgchosde.R.globalSliceStart(getClass().getName(),51218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hyrp2y13iq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113fp13fplgchosde.R.rethrow($CLV_t2$);}finally{__CLR4_4_113fp13fplgchosde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertySetHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hyrp2y13iq(){try{__CLR4_4_113fp13fplgchosde.R.inc(51218);
        __CLR4_4_113fp13fplgchosde.R.inc(51219);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_113fp13fplgchosde.R.inc(51220);Partial copy = test.property(DateTimeFieldType.hourOfDay()).setCopy(12);
        __CLR4_4_113fp13fplgchosde.R.inc(51221);check(test, 10, 20, 30, 40);
        __CLR4_4_113fp13fplgchosde.R.inc(51222);check(copy, 12, 20, 30, 40);

        __CLR4_4_113fp13fplgchosde.R.inc(51223);try {
            __CLR4_4_113fp13fplgchosde.R.inc(51224);test.property(DateTimeFieldType.hourOfDay()).setCopy(24);
            __CLR4_4_113fp13fplgchosde.R.inc(51225);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_113fp13fplgchosde.R.inc(51226);try {
            __CLR4_4_113fp13fplgchosde.R.inc(51227);test.property(DateTimeFieldType.hourOfDay()).setCopy(-1);
            __CLR4_4_113fp13fplgchosde.R.inc(51228);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_113fp13fplgchosde.R.flushNeeded();}}

    @Test
    public void testPropertySetTextHour() {__CLR4_4_113fp13fplgchosde.R.globalSliceStart(getClass().getName(),51229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14yha1913j1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113fp13fplgchosde.R.rethrow($CLV_t2$);}finally{__CLR4_4_113fp13fplgchosde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertySetTextHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51229,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14yha1913j1(){try{__CLR4_4_113fp13fplgchosde.R.inc(51229);
        __CLR4_4_113fp13fplgchosde.R.inc(51230);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_113fp13fplgchosde.R.inc(51231);Partial copy = test.property(DateTimeFieldType.hourOfDay()).setCopy("12");
        __CLR4_4_113fp13fplgchosde.R.inc(51232);check(test, 10, 20, 30, 40);
        __CLR4_4_113fp13fplgchosde.R.inc(51233);check(copy, 12, 20, 30, 40);
    }finally{__CLR4_4_113fp13fplgchosde.R.flushNeeded();}}

    @Test
    public void testPropertyWithMaximumValueHour() {__CLR4_4_113fp13fplgchosde.R.globalSliceStart(getClass().getName(),51234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1otnz9313j6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113fp13fplgchosde.R.rethrow($CLV_t2$);}finally{__CLR4_4_113fp13fplgchosde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyWithMaximumValueHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1otnz9313j6(){try{__CLR4_4_113fp13fplgchosde.R.inc(51234);
        __CLR4_4_113fp13fplgchosde.R.inc(51235);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_113fp13fplgchosde.R.inc(51236);Partial copy = test.property(DateTimeFieldType.hourOfDay()).withMaximumValue();
        __CLR4_4_113fp13fplgchosde.R.inc(51237);check(test, 10, 20, 30, 40);
        __CLR4_4_113fp13fplgchosde.R.inc(51238);check(copy, 23, 20, 30, 40);
    }finally{__CLR4_4_113fp13fplgchosde.R.flushNeeded();}}

    @Test
    public void testPropertyWithMinimumValueHour() {__CLR4_4_113fp13fplgchosde.R.globalSliceStart(getClass().getName(),51239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6uf1h13jb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113fp13fplgchosde.R.rethrow($CLV_t2$);}finally{__CLR4_4_113fp13fplgchosde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyWithMinimumValueHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51239,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6uf1h13jb(){try{__CLR4_4_113fp13fplgchosde.R.inc(51239);
        __CLR4_4_113fp13fplgchosde.R.inc(51240);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_113fp13fplgchosde.R.inc(51241);Partial copy = test.property(DateTimeFieldType.hourOfDay()).withMinimumValue();
        __CLR4_4_113fp13fplgchosde.R.inc(51242);check(test, 10, 20, 30, 40);
        __CLR4_4_113fp13fplgchosde.R.inc(51243);check(copy, 0, 20, 30, 40);
    }finally{__CLR4_4_113fp13fplgchosde.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToHour() {__CLR4_4_113fp13fplgchosde.R.globalSliceStart(getClass().getName(),51244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_174ldgc13jg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113fp13fplgchosde.R.rethrow($CLV_t2$);}finally{__CLR4_4_113fp13fplgchosde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyCompareToHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51244,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_174ldgc13jg(){try{__CLR4_4_113fp13fplgchosde.R.inc(51244);
        __CLR4_4_113fp13fplgchosde.R.inc(51245);Partial test1 = new Partial(TYPES, VALUES1);
        __CLR4_4_113fp13fplgchosde.R.inc(51246);Partial test2 = new Partial(TYPES, VALUES2);
        __CLR4_4_113fp13fplgchosde.R.inc(51247);assertEquals(true, test1.property(DateTimeFieldType.hourOfDay()).compareTo(test2) < 0);
        __CLR4_4_113fp13fplgchosde.R.inc(51248);assertEquals(true, test2.property(DateTimeFieldType.hourOfDay()).compareTo(test1) > 0);
        __CLR4_4_113fp13fplgchosde.R.inc(51249);assertEquals(true, test1.property(DateTimeFieldType.hourOfDay()).compareTo(test1) == 0);
        __CLR4_4_113fp13fplgchosde.R.inc(51250);try {
            __CLR4_4_113fp13fplgchosde.R.inc(51251);test1.property(DateTimeFieldType.hourOfDay()).compareTo((ReadablePartial) null);
            __CLR4_4_113fp13fplgchosde.R.inc(51252);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_113fp13fplgchosde.R.inc(51253);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_113fp13fplgchosde.R.inc(51254);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_113fp13fplgchosde.R.inc(51255);assertEquals(true, test1.property(DateTimeFieldType.hourOfDay()).compareTo(dt2) < 0);
        __CLR4_4_113fp13fplgchosde.R.inc(51256);assertEquals(true, test2.property(DateTimeFieldType.hourOfDay()).compareTo(dt1) > 0);
        __CLR4_4_113fp13fplgchosde.R.inc(51257);assertEquals(true, test1.property(DateTimeFieldType.hourOfDay()).compareTo(dt1) == 0);
        __CLR4_4_113fp13fplgchosde.R.inc(51258);try {
            __CLR4_4_113fp13fplgchosde.R.inc(51259);test1.property(DateTimeFieldType.hourOfDay()).compareTo((ReadableInstant) null);
            __CLR4_4_113fp13fplgchosde.R.inc(51260);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_113fp13fplgchosde.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetMinute() {__CLR4_4_113fp13fplgchosde.R.globalSliceStart(getClass().getName(),51261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oej7l613jx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113fp13fplgchosde.R.rethrow($CLV_t2$);}finally{__CLR4_4_113fp13fplgchosde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyGetMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oej7l613jx(){try{__CLR4_4_113fp13fplgchosde.R.inc(51261);
        __CLR4_4_113fp13fplgchosde.R.inc(51262);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_113fp13fplgchosde.R.inc(51263);assertSame(test.getChronology().minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour()).getField());
        __CLR4_4_113fp13fplgchosde.R.inc(51264);assertEquals("minuteOfHour", test.property(DateTimeFieldType.minuteOfHour()).getName());
        __CLR4_4_113fp13fplgchosde.R.inc(51265);assertEquals("Property[minuteOfHour]", test.property(DateTimeFieldType.minuteOfHour()).toString());
        __CLR4_4_113fp13fplgchosde.R.inc(51266);assertSame(test, test.property(DateTimeFieldType.minuteOfHour()).getReadablePartial());
        __CLR4_4_113fp13fplgchosde.R.inc(51267);assertSame(test, test.property(DateTimeFieldType.minuteOfHour()).getPartial());
        __CLR4_4_113fp13fplgchosde.R.inc(51268);assertEquals(20, test.property(DateTimeFieldType.minuteOfHour()).get());
        __CLR4_4_113fp13fplgchosde.R.inc(51269);assertEquals("20", test.property(DateTimeFieldType.minuteOfHour()).getAsString());
        __CLR4_4_113fp13fplgchosde.R.inc(51270);assertEquals("20", test.property(DateTimeFieldType.minuteOfHour()).getAsText());
        __CLR4_4_113fp13fplgchosde.R.inc(51271);assertEquals("20", test.property(DateTimeFieldType.minuteOfHour()).getAsText(Locale.FRENCH));
        __CLR4_4_113fp13fplgchosde.R.inc(51272);assertEquals("20", test.property(DateTimeFieldType.minuteOfHour()).getAsShortText());
        __CLR4_4_113fp13fplgchosde.R.inc(51273);assertEquals("20", test.property(DateTimeFieldType.minuteOfHour()).getAsShortText(Locale.FRENCH));
        __CLR4_4_113fp13fplgchosde.R.inc(51274);assertEquals(test.getChronology().minutes(), test.property(DateTimeFieldType.minuteOfHour()).getDurationField());
        __CLR4_4_113fp13fplgchosde.R.inc(51275);assertEquals(test.getChronology().hours(), test.property(DateTimeFieldType.minuteOfHour()).getRangeDurationField());
        __CLR4_4_113fp13fplgchosde.R.inc(51276);assertEquals(2, test.property(DateTimeFieldType.minuteOfHour()).getMaximumTextLength(null));
        __CLR4_4_113fp13fplgchosde.R.inc(51277);assertEquals(2, test.property(DateTimeFieldType.minuteOfHour()).getMaximumShortTextLength(null));
    }finally{__CLR4_4_113fp13fplgchosde.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesMinute() {__CLR4_4_113fp13fplgchosde.R.globalSliceStart(getClass().getName(),51278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_110m2u213ke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113fp13fplgchosde.R.rethrow($CLV_t2$);}finally{__CLR4_4_113fp13fplgchosde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyGetMaxMinValuesMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_110m2u213ke(){try{__CLR4_4_113fp13fplgchosde.R.inc(51278);
        __CLR4_4_113fp13fplgchosde.R.inc(51279);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_113fp13fplgchosde.R.inc(51280);assertEquals(0, test.property(DateTimeFieldType.minuteOfHour()).getMinimumValue());
        __CLR4_4_113fp13fplgchosde.R.inc(51281);assertEquals(0, test.property(DateTimeFieldType.minuteOfHour()).getMinimumValueOverall());
        __CLR4_4_113fp13fplgchosde.R.inc(51282);assertEquals(59, test.property(DateTimeFieldType.minuteOfHour()).getMaximumValue());
        __CLR4_4_113fp13fplgchosde.R.inc(51283);assertEquals(59, test.property(DateTimeFieldType.minuteOfHour()).getMaximumValueOverall());
    }finally{__CLR4_4_113fp13fplgchosde.R.flushNeeded();}}

//    @Test public void testPropertyAddMinute() {
//        Partial test = new Partial(TYPES, VALUES);
//        Partial copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(9);
//        check(test, 10, 20, 30, 40);
//        check(copy, 10, 29, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(39);
//        check(copy, 10, 59, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(40);
//        check(copy, 11, 0, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(1 * 60 + 45);
//        check(copy, 12, 5, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(13 * 60 + 39);
//        check(copy, 23, 59, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(13 * 60 + 40);
//        check(copy, 0, 0, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-9);
//        check(copy, 10, 11, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-19);
//        check(copy, 10, 1, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-20);
//        check(copy, 10, 0, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-21);
//        check(copy, 9, 59, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-(10 * 60 + 20));
//        check(copy, 0, 0, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-(10 * 60 + 21));
//        check(copy, 23, 59, 30, 40);
//    }

    @Test
    public void testPropertyAddMinute() {__CLR4_4_113fp13fplgchosde.R.globalSliceStart(getClass().getName(),51284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pugv6d13kk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113fp13fplgchosde.R.rethrow($CLV_t2$);}finally{__CLR4_4_113fp13fplgchosde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyAddMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pugv6d13kk(){try{__CLR4_4_113fp13fplgchosde.R.inc(51284);
        __CLR4_4_113fp13fplgchosde.R.inc(51285);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_113fp13fplgchosde.R.inc(51286);Partial copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(9);
        __CLR4_4_113fp13fplgchosde.R.inc(51287);check(test, 10, 20, 30, 40);
        __CLR4_4_113fp13fplgchosde.R.inc(51288);check(copy, 10, 29, 30, 40);

        __CLR4_4_113fp13fplgchosde.R.inc(51289);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(39);
        __CLR4_4_113fp13fplgchosde.R.inc(51290);check(copy, 10, 59, 30, 40);

        __CLR4_4_113fp13fplgchosde.R.inc(51291);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(40);
        __CLR4_4_113fp13fplgchosde.R.inc(51292);check(copy, 11, 0, 30, 40);

        __CLR4_4_113fp13fplgchosde.R.inc(51293);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(1 * 60 + 45);
        __CLR4_4_113fp13fplgchosde.R.inc(51294);check(copy, 12, 5, 30, 40);

        __CLR4_4_113fp13fplgchosde.R.inc(51295);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(13 * 60 + 39);
        __CLR4_4_113fp13fplgchosde.R.inc(51296);check(copy, 23, 59, 30, 40);

        __CLR4_4_113fp13fplgchosde.R.inc(51297);try {
            __CLR4_4_113fp13fplgchosde.R.inc(51298);test.property(DateTimeFieldType.minuteOfHour()).addToCopy(13 * 60 + 40);
            __CLR4_4_113fp13fplgchosde.R.inc(51299);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_113fp13fplgchosde.R.inc(51300);check(test, 10, 20, 30, 40);

        __CLR4_4_113fp13fplgchosde.R.inc(51301);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-9);
        __CLR4_4_113fp13fplgchosde.R.inc(51302);check(copy, 10, 11, 30, 40);

        __CLR4_4_113fp13fplgchosde.R.inc(51303);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-19);
        __CLR4_4_113fp13fplgchosde.R.inc(51304);check(copy, 10, 1, 30, 40);

        __CLR4_4_113fp13fplgchosde.R.inc(51305);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-20);
        __CLR4_4_113fp13fplgchosde.R.inc(51306);check(copy, 10, 0, 30, 40);

        __CLR4_4_113fp13fplgchosde.R.inc(51307);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-21);
        __CLR4_4_113fp13fplgchosde.R.inc(51308);check(copy, 9, 59, 30, 40);

        __CLR4_4_113fp13fplgchosde.R.inc(51309);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-(10 * 60 + 20));
        __CLR4_4_113fp13fplgchosde.R.inc(51310);check(copy, 0, 0, 30, 40);

        __CLR4_4_113fp13fplgchosde.R.inc(51311);try {
            __CLR4_4_113fp13fplgchosde.R.inc(51312);test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-(10 * 60 + 21));
            __CLR4_4_113fp13fplgchosde.R.inc(51313);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_113fp13fplgchosde.R.inc(51314);check(test, 10, 20, 30, 40);
    }finally{__CLR4_4_113fp13fplgchosde.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldMinute() {__CLR4_4_113fp13fplgchosde.R.globalSliceStart(getClass().getName(),51315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qahkvj13lf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113fp13fplgchosde.R.rethrow($CLV_t2$);}finally{__CLR4_4_113fp13fplgchosde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyAddWrapFieldMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qahkvj13lf(){try{__CLR4_4_113fp13fplgchosde.R.inc(51315);
        __CLR4_4_113fp13fplgchosde.R.inc(51316);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_113fp13fplgchosde.R.inc(51317);Partial copy = test.property(DateTimeFieldType.minuteOfHour()).addWrapFieldToCopy(9);
        __CLR4_4_113fp13fplgchosde.R.inc(51318);check(test, 10, 20, 30, 40);
        __CLR4_4_113fp13fplgchosde.R.inc(51319);check(copy, 10, 29, 30, 40);

        __CLR4_4_113fp13fplgchosde.R.inc(51320);copy = test.property(DateTimeFieldType.minuteOfHour()).addWrapFieldToCopy(49);
        __CLR4_4_113fp13fplgchosde.R.inc(51321);check(copy, 10, 9, 30, 40);

        __CLR4_4_113fp13fplgchosde.R.inc(51322);copy = test.property(DateTimeFieldType.minuteOfHour()).addWrapFieldToCopy(-47);
        __CLR4_4_113fp13fplgchosde.R.inc(51323);check(copy, 10, 33, 30, 40);
    }finally{__CLR4_4_113fp13fplgchosde.R.flushNeeded();}}

    @Test
    public void testPropertySetMinute() {__CLR4_4_113fp13fplgchosde.R.globalSliceStart(getClass().getName(),51324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_196rp2u13lo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113fp13fplgchosde.R.rethrow($CLV_t2$);}finally{__CLR4_4_113fp13fplgchosde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertySetMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_196rp2u13lo(){try{__CLR4_4_113fp13fplgchosde.R.inc(51324);
        __CLR4_4_113fp13fplgchosde.R.inc(51325);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_113fp13fplgchosde.R.inc(51326);Partial copy = test.property(DateTimeFieldType.minuteOfHour()).setCopy(12);
        __CLR4_4_113fp13fplgchosde.R.inc(51327);check(test, 10, 20, 30, 40);
        __CLR4_4_113fp13fplgchosde.R.inc(51328);check(copy, 10, 12, 30, 40);

        __CLR4_4_113fp13fplgchosde.R.inc(51329);try {
            __CLR4_4_113fp13fplgchosde.R.inc(51330);test.property(DateTimeFieldType.minuteOfHour()).setCopy(60);
            __CLR4_4_113fp13fplgchosde.R.inc(51331);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_113fp13fplgchosde.R.inc(51332);try {
            __CLR4_4_113fp13fplgchosde.R.inc(51333);test.property(DateTimeFieldType.minuteOfHour()).setCopy(-1);
            __CLR4_4_113fp13fplgchosde.R.inc(51334);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_113fp13fplgchosde.R.flushNeeded();}}

    @Test
    public void testPropertySetTextMinute() {__CLR4_4_113fp13fplgchosde.R.globalSliceStart(getClass().getName(),51335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18h1pnn13lz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113fp13fplgchosde.R.rethrow($CLV_t2$);}finally{__CLR4_4_113fp13fplgchosde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertySetTextMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18h1pnn13lz(){try{__CLR4_4_113fp13fplgchosde.R.inc(51335);
        __CLR4_4_113fp13fplgchosde.R.inc(51336);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_113fp13fplgchosde.R.inc(51337);Partial copy = test.property(DateTimeFieldType.minuteOfHour()).setCopy("12");
        __CLR4_4_113fp13fplgchosde.R.inc(51338);check(test, 10, 20, 30, 40);
        __CLR4_4_113fp13fplgchosde.R.inc(51339);check(copy, 10, 12, 30, 40);
    }finally{__CLR4_4_113fp13fplgchosde.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToMinute() {__CLR4_4_113fp13fplgchosde.R.globalSliceStart(getClass().getName(),51340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gtzyp813m4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113fp13fplgchosde.R.rethrow($CLV_t2$);}finally{__CLR4_4_113fp13fplgchosde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyCompareToMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gtzyp813m4(){try{__CLR4_4_113fp13fplgchosde.R.inc(51340);
        __CLR4_4_113fp13fplgchosde.R.inc(51341);Partial test1 = new Partial(TYPES, VALUES1);
        __CLR4_4_113fp13fplgchosde.R.inc(51342);Partial test2 = new Partial(TYPES, VALUES2);
        __CLR4_4_113fp13fplgchosde.R.inc(51343);assertEquals(true, test1.property(DateTimeFieldType.minuteOfHour()).compareTo(test2) < 0);
        __CLR4_4_113fp13fplgchosde.R.inc(51344);assertEquals(true, test2.property(DateTimeFieldType.minuteOfHour()).compareTo(test1) > 0);
        __CLR4_4_113fp13fplgchosde.R.inc(51345);assertEquals(true, test1.property(DateTimeFieldType.minuteOfHour()).compareTo(test1) == 0);
        __CLR4_4_113fp13fplgchosde.R.inc(51346);try {
            __CLR4_4_113fp13fplgchosde.R.inc(51347);test1.property(DateTimeFieldType.minuteOfHour()).compareTo((ReadablePartial) null);
            __CLR4_4_113fp13fplgchosde.R.inc(51348);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_113fp13fplgchosde.R.inc(51349);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_113fp13fplgchosde.R.inc(51350);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_113fp13fplgchosde.R.inc(51351);assertEquals(true, test1.property(DateTimeFieldType.minuteOfHour()).compareTo(dt2) < 0);
        __CLR4_4_113fp13fplgchosde.R.inc(51352);assertEquals(true, test2.property(DateTimeFieldType.minuteOfHour()).compareTo(dt1) > 0);
        __CLR4_4_113fp13fplgchosde.R.inc(51353);assertEquals(true, test1.property(DateTimeFieldType.minuteOfHour()).compareTo(dt1) == 0);
        __CLR4_4_113fp13fplgchosde.R.inc(51354);try {
            __CLR4_4_113fp13fplgchosde.R.inc(51355);test1.property(DateTimeFieldType.minuteOfHour()).compareTo((ReadableInstant) null);
            __CLR4_4_113fp13fplgchosde.R.inc(51356);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_113fp13fplgchosde.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(Partial test, int hour, int min, int sec, int milli) {try{__CLR4_4_113fp13fplgchosde.R.inc(51357);
        __CLR4_4_113fp13fplgchosde.R.inc(51358);assertEquals(hour, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_113fp13fplgchosde.R.inc(51359);assertEquals(min, test.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_113fp13fplgchosde.R.inc(51360);assertEquals(sec, test.get(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_113fp13fplgchosde.R.inc(51361);assertEquals(milli, test.get(DateTimeFieldType.millisOfSecond()));
    }finally{__CLR4_4_113fp13fplgchosde.R.flushNeeded();}}
}
