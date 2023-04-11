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
package org.joda.time.field;

import java.util.Arrays;
import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for PreciseDateTimeField.
 *
 * @author Stephen Colebourne
 */
public class TestPreciseDateTimeField {static class __CLR4_4_11gok1goklgchost1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,68804,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    public static void main(String[] args) throws Exception {try{__CLR4_4_11gok1goklgchost1.R.inc(68276);
        __CLR4_4_11gok1goklgchost1.R.inc(68277);TestPreciseDateTimeField TB = new TestPreciseDateTimeField();


        __CLR4_4_11gok1goklgchost1.R.inc(68278);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68279);TB.test_constructor();
        __CLR4_4_11gok1goklgchost1.R.inc(68280);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68281);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68282);TB.test_getType();
        __CLR4_4_11gok1goklgchost1.R.inc(68283);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68284);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68285);TB.test_getName();
        __CLR4_4_11gok1goklgchost1.R.inc(68286);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68287);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68288);TB.test_toString();
        __CLR4_4_11gok1goklgchost1.R.inc(68289);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68290);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68291);TB.test_isSupported();
        __CLR4_4_11gok1goklgchost1.R.inc(68292);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68293);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68294);TB.test_getRange();
        __CLR4_4_11gok1goklgchost1.R.inc(68295);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68296);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68297);TB.test_get();
        __CLR4_4_11gok1goklgchost1.R.inc(68298);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68299);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68300);TB.test_getAsText_long_Locale();
        __CLR4_4_11gok1goklgchost1.R.inc(68301);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68302);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68303);TB.test_getAsText_long();
        __CLR4_4_11gok1goklgchost1.R.inc(68304);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68305);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68306);TB.test_getAsText_RP_int_Locale();
        __CLR4_4_11gok1goklgchost1.R.inc(68307);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68308);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68309);TB.test_getAsText_RP_Locale();
        __CLR4_4_11gok1goklgchost1.R.inc(68310);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68311);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68312);TB.test_getAsText_int_Locale();
        __CLR4_4_11gok1goklgchost1.R.inc(68313);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68314);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68315);TB.test_getAsShortText_long_Locale();
        __CLR4_4_11gok1goklgchost1.R.inc(68316);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68317);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68318);TB.test_getAsShortText_long();
        __CLR4_4_11gok1goklgchost1.R.inc(68319);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68320);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68321);TB.test_getAsShortText_RP_int_Locale();
        __CLR4_4_11gok1goklgchost1.R.inc(68322);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68323);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68324);TB.test_getAsShortText_RP_Locale();
        __CLR4_4_11gok1goklgchost1.R.inc(68325);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68326);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68327);TB.test_getAsShortText_int_Locale();
        __CLR4_4_11gok1goklgchost1.R.inc(68328);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68329);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68330);TB.test_add_long_int();
        __CLR4_4_11gok1goklgchost1.R.inc(68331);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68332);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68333);TB.test_add_long_long();
        __CLR4_4_11gok1goklgchost1.R.inc(68334);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68335);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68336);TB.test_add_RP_int_intarray_int();
        __CLR4_4_11gok1goklgchost1.R.inc(68337);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68338);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68339);TB.test_addWrapField_long_int();
        __CLR4_4_11gok1goklgchost1.R.inc(68340);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68341);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68342);TB.test_addWrapField_RP_int_intarray_int();
        __CLR4_4_11gok1goklgchost1.R.inc(68343);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68344);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68345);TB.test_getDifference_long_long();
        __CLR4_4_11gok1goklgchost1.R.inc(68346);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68347);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68348);TB.test_getDifferenceAsLong_long_long();
        __CLR4_4_11gok1goklgchost1.R.inc(68349);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68350);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68351);TB.test_set_long_int();
        __CLR4_4_11gok1goklgchost1.R.inc(68352);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68353);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68354);TB.test_set_RP_int_intarray_int();
        __CLR4_4_11gok1goklgchost1.R.inc(68355);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68356);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68357);TB.test_set_long_String_Locale();
        __CLR4_4_11gok1goklgchost1.R.inc(68358);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68359);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68360);TB.test_set_long_String();
        __CLR4_4_11gok1goklgchost1.R.inc(68361);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68362);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68363);TB.test_set_RP_int_intarray_String_Locale();
        __CLR4_4_11gok1goklgchost1.R.inc(68364);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68365);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68366);TB.test_convertText();
        __CLR4_4_11gok1goklgchost1.R.inc(68367);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68368);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68369);TB.test_isLeap_long();
        __CLR4_4_11gok1goklgchost1.R.inc(68370);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68371);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68372);TB.test_getLeapAmount_long();
        __CLR4_4_11gok1goklgchost1.R.inc(68373);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68374);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68375);TB.test_getLeapDurationField();
        __CLR4_4_11gok1goklgchost1.R.inc(68376);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68377);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68378);TB.test_getMinimumValue();
        __CLR4_4_11gok1goklgchost1.R.inc(68379);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68380);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68381);TB.test_getMinimumValue_long();
        __CLR4_4_11gok1goklgchost1.R.inc(68382);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68383);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68384);TB.test_getMinimumValue_RP();
        __CLR4_4_11gok1goklgchost1.R.inc(68385);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68386);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68387);TB.test_getMinimumValue_RP_intarray();
        __CLR4_4_11gok1goklgchost1.R.inc(68388);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68389);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68390);TB.test_getMaximumValue();
        __CLR4_4_11gok1goklgchost1.R.inc(68391);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68392);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68393);TB.test_getMaximumValue_long();
        __CLR4_4_11gok1goklgchost1.R.inc(68394);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68395);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68396);TB.test_getMaximumValue_RP();
        __CLR4_4_11gok1goklgchost1.R.inc(68397);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68398);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68399);TB.test_getMaximumValue_RP_intarray();
        __CLR4_4_11gok1goklgchost1.R.inc(68400);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68401);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68402);TB.test_getMaximumTextLength_Locale();
        __CLR4_4_11gok1goklgchost1.R.inc(68403);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68404);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68405);TB.test_getMaximumShortTextLength_Locale();
        __CLR4_4_11gok1goklgchost1.R.inc(68406);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68407);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68408);TB.test_roundFloor_long();
        __CLR4_4_11gok1goklgchost1.R.inc(68409);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68410);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68411);TB.test_roundCeiling_long();
        __CLR4_4_11gok1goklgchost1.R.inc(68412);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68413);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68414);TB.test_roundHalfFloor_long();
        __CLR4_4_11gok1goklgchost1.R.inc(68415);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68416);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68417);TB.test_roundHalfCeiling_long();
        __CLR4_4_11gok1goklgchost1.R.inc(68418);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68419);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68420);TB.test_roundHalfEven_long();
        __CLR4_4_11gok1goklgchost1.R.inc(68421);TB.tearDown();
        __CLR4_4_11gok1goklgchost1.R.inc(68422);TB.setUp();
        __CLR4_4_11gok1goklgchost1.R.inc(68423);TB.test_remainder_long();
        __CLR4_4_11gok1goklgchost1.R.inc(68424);TB.tearDown();

    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestPreciseDateTimeField.class);
    }

    public TestPreciseDateTimeField(String name) {
        super(name);
    }
     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11gok1goklgchost1.R.inc(68425);
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11gok1goklgchost1.R.inc(68426);
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_constructor() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14im07g1gsr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_constructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14im07g1gsr(){try{__CLR4_4_11gok1goklgchost1.R.inc(68427);
        __CLR4_4_11gok1goklgchost1.R.inc(68428);BaseDateTimeField field = new PreciseDateTimeField(
                DateTimeFieldType.secondOfMinute(),
                ISOChronology.getInstanceUTC().millis(),
                ISOChronology.getInstanceUTC().hours()
        );
        __CLR4_4_11gok1goklgchost1.R.inc(68429);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType());
        __CLR4_4_11gok1goklgchost1.R.inc(68430);try {
            __CLR4_4_11gok1goklgchost1.R.inc(68431);field = new PreciseDateTimeField(null, null, null);
            __CLR4_4_11gok1goklgchost1.R.inc(68432);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11gok1goklgchost1.R.inc(68433);try {
            __CLR4_4_11gok1goklgchost1.R.inc(68434);field = new PreciseDateTimeField(
                    DateTimeFieldType.minuteOfHour(),
                    new MockImpreciseDurationField(DurationFieldType.minutes()),
                    ISOChronology.getInstanceUTC().hours());
            __CLR4_4_11gok1goklgchost1.R.inc(68435);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11gok1goklgchost1.R.inc(68436);try {
            __CLR4_4_11gok1goklgchost1.R.inc(68437);field = new PreciseDateTimeField(
                    DateTimeFieldType.minuteOfHour(),
                    ISOChronology.getInstanceUTC().hours(),
                    new MockImpreciseDurationField(DurationFieldType.minutes()));
            __CLR4_4_11gok1goklgchost1.R.inc(68438);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11gok1goklgchost1.R.inc(68439);try {
            __CLR4_4_11gok1goklgchost1.R.inc(68440);field = new PreciseDateTimeField(
                    DateTimeFieldType.minuteOfHour(),
                    ISOChronology.getInstanceUTC().hours(),
                    ISOChronology.getInstanceUTC().hours());
            __CLR4_4_11gok1goklgchost1.R.inc(68441);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11gok1goklgchost1.R.inc(68442);try {
            __CLR4_4_11gok1goklgchost1.R.inc(68443);field = new PreciseDateTimeField(
                    DateTimeFieldType.minuteOfHour(),
                    new MockZeroDurationField(DurationFieldType.minutes()),
                    ISOChronology.getInstanceUTC().hours());
            __CLR4_4_11gok1goklgchost1.R.inc(68444);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_getType() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5v7di1gt9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5v7di1gt9(){try{__CLR4_4_11gok1goklgchost1.R.inc(68445);
        __CLR4_4_11gok1goklgchost1.R.inc(68446);BaseDateTimeField field = new PreciseDateTimeField(
                DateTimeFieldType.secondOfDay(),
                ISOChronology.getInstanceUTC().millis(),
                ISOChronology.getInstanceUTC().hours()
        );
        __CLR4_4_11gok1goklgchost1.R.inc(68447);assertEquals(DateTimeFieldType.secondOfDay(), field.getType());
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_getName() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5z5k51gtc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68448,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5z5k51gtc(){try{__CLR4_4_11gok1goklgchost1.R.inc(68448);
        __CLR4_4_11gok1goklgchost1.R.inc(68449);BaseDateTimeField field = new PreciseDateTimeField(
                DateTimeFieldType.secondOfDay(),
                ISOChronology.getInstanceUTC().millis(),
                ISOChronology.getInstanceUTC().hours()
        );
        __CLR4_4_11gok1goklgchost1.R.inc(68450);assertEquals("secondOfDay", field.getName());
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_toString() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4d7c01gtf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_toString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4d7c01gtf(){try{__CLR4_4_11gok1goklgchost1.R.inc(68451);
        __CLR4_4_11gok1goklgchost1.R.inc(68452);BaseDateTimeField field = new PreciseDateTimeField(
                DateTimeFieldType.secondOfDay(),
                ISOChronology.getInstanceUTC().millis(),
                ISOChronology.getInstanceUTC().hours()
        );
        __CLR4_4_11gok1goklgchost1.R.inc(68453);assertEquals("DateTimeField[secondOfDay]", field.toString());
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_isSupported() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189jpwe1gti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_isSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189jpwe1gti(){try{__CLR4_4_11gok1goklgchost1.R.inc(68454);
        __CLR4_4_11gok1goklgchost1.R.inc(68455);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68456);assertEquals(true, field.isSupported());
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_getRange() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sssj391gtl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68457,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sssj391gtl(){try{__CLR4_4_11gok1goklgchost1.R.inc(68457);
        __CLR4_4_11gok1goklgchost1.R.inc(68458);PreciseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68459);assertEquals(60, field.getRange());
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_get() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17oeyeo1gto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_get",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17oeyeo1gto(){try{__CLR4_4_11gok1goklgchost1.R.inc(68460);
        __CLR4_4_11gok1goklgchost1.R.inc(68461);PreciseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68462);assertEquals(0, field.get(0));
        __CLR4_4_11gok1goklgchost1.R.inc(68463);assertEquals(1, field.get(60));
        __CLR4_4_11gok1goklgchost1.R.inc(68464);assertEquals(2, field.get(123));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getAsText_long_Locale() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kdirgz1gtt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsText_long_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68465,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kdirgz1gtt(){try{__CLR4_4_11gok1goklgchost1.R.inc(68465);
        __CLR4_4_11gok1goklgchost1.R.inc(68466);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68467);assertEquals("29", field.getAsText(60L * 29, Locale.ENGLISH));
        __CLR4_4_11gok1goklgchost1.R.inc(68468);assertEquals("29", field.getAsText(60L * 29, null));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_getAsText_long() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vd3zd21gtx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsText_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vd3zd21gtx(){try{__CLR4_4_11gok1goklgchost1.R.inc(68469);
        __CLR4_4_11gok1goklgchost1.R.inc(68470);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68471);assertEquals("29", field.getAsText(60L * 29));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_getAsText_RP_int_Locale() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uuft1h1gu0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsText_RP_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uuft1h1gu0(){try{__CLR4_4_11gok1goklgchost1.R.inc(68472);
        __CLR4_4_11gok1goklgchost1.R.inc(68473);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68474);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH));
        __CLR4_4_11gok1goklgchost1.R.inc(68475);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, null));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_getAsText_RP_Locale() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1ywid1gu4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsText_RP_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1ywid1gu4(){try{__CLR4_4_11gok1goklgchost1.R.inc(68476);
        __CLR4_4_11gok1goklgchost1.R.inc(68477);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68478);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH));
        __CLR4_4_11gok1goklgchost1.R.inc(68479);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), null));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_getAsText_int_Locale() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gd8ltk1gu8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsText_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gd8ltk1gu8(){try{__CLR4_4_11gok1goklgchost1.R.inc(68480);
        __CLR4_4_11gok1goklgchost1.R.inc(68481);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68482);assertEquals("80", field.getAsText(80, Locale.ENGLISH));
        __CLR4_4_11gok1goklgchost1.R.inc(68483);assertEquals("80", field.getAsText(80, null));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getAsShortText_long_Locale() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1loiikt1guc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsShortText_long_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1loiikt1guc(){try{__CLR4_4_11gok1goklgchost1.R.inc(68484);
        __CLR4_4_11gok1goklgchost1.R.inc(68485);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68486);assertEquals("29", field.getAsShortText(60L * 29, Locale.ENGLISH));
        __CLR4_4_11gok1goklgchost1.R.inc(68487);assertEquals("29", field.getAsShortText(60L * 29, null));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_getAsShortText_long() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_121lqfg1gug();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsShortText_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_121lqfg1gug(){try{__CLR4_4_11gok1goklgchost1.R.inc(68488);
        __CLR4_4_11gok1goklgchost1.R.inc(68489);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68490);assertEquals("29", field.getAsShortText(60L * 29));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_getAsShortText_RP_int_Locale() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qtetb1guj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsShortText_RP_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qtetb1guj(){try{__CLR4_4_11gok1goklgchost1.R.inc(68491);
        __CLR4_4_11gok1goklgchost1.R.inc(68492);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68493);assertEquals("20", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH));
        __CLR4_4_11gok1goklgchost1.R.inc(68494);assertEquals("20", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), 20, null));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_getAsShortText_RP_Locale() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rxyb9r1gun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsShortText_RP_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rxyb9r1gun(){try{__CLR4_4_11gok1goklgchost1.R.inc(68495);
        __CLR4_4_11gok1goklgchost1.R.inc(68496);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68497);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH));
        __CLR4_4_11gok1goklgchost1.R.inc(68498);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), null));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_getAsShortText_int_Locale() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ntvlq1gur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsShortText_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ntvlq1gur(){try{__CLR4_4_11gok1goklgchost1.R.inc(68499);
        __CLR4_4_11gok1goklgchost1.R.inc(68500);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68501);assertEquals("80", field.getAsShortText(80, Locale.ENGLISH));
        __CLR4_4_11gok1goklgchost1.R.inc(68502);assertEquals("80", field.getAsShortText(80, null));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_add_long_int() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9umwu1guv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_add_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9umwu1guv(){try{__CLR4_4_11gok1goklgchost1.R.inc(68503);
        __CLR4_4_11gok1goklgchost1.R.inc(68504);MockCountingDurationField.add_int = 0;
        __CLR4_4_11gok1goklgchost1.R.inc(68505);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68506);assertEquals(61, field.add(1L, 1));
        __CLR4_4_11gok1goklgchost1.R.inc(68507);assertEquals(1, MockCountingDurationField.add_int);
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_add_long_long() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nn6hgl1gv0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_add_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nn6hgl1gv0(){try{__CLR4_4_11gok1goklgchost1.R.inc(68508);
        __CLR4_4_11gok1goklgchost1.R.inc(68509);MockCountingDurationField.add_long = 0;
        __CLR4_4_11gok1goklgchost1.R.inc(68510);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68511);assertEquals(61, field.add(1L, 1L));
        __CLR4_4_11gok1goklgchost1.R.inc(68512);assertEquals(1, MockCountingDurationField.add_long);
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_add_RP_int_intarray_int() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e06spl1gv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_add_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e06spl1gv5(){try{__CLR4_4_11gok1goklgchost1.R.inc(68513);
        __CLR4_4_11gok1goklgchost1.R.inc(68514);int[] values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68515);int[] expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68516);BaseDateTimeField field = new MockStandardDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68517);int[] result = field.add(new TimeOfDay(), 2, values, 0);
        __CLR4_4_11gok1goklgchost1.R.inc(68518);assertEquals(true, Arrays.equals(expected, result));

        __CLR4_4_11gok1goklgchost1.R.inc(68519);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68520);expected = new int[]{10, 20, 31, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68521);result = field.add(new TimeOfDay(), 2, values, 1);
        __CLR4_4_11gok1goklgchost1.R.inc(68522);assertEquals(true, Arrays.equals(expected, result));

        __CLR4_4_11gok1goklgchost1.R.inc(68523);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68524);expected = new int[]{10, 21, 0, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68525);result = field.add(new TimeOfDay(), 2, values, 30);
        __CLR4_4_11gok1goklgchost1.R.inc(68526);assertEquals(true, Arrays.equals(expected, result));

        __CLR4_4_11gok1goklgchost1.R.inc(68527);values = new int[]{23, 59, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68528);try {
            __CLR4_4_11gok1goklgchost1.R.inc(68529);field.add(new TimeOfDay(), 2, values, 30);
            __CLR4_4_11gok1goklgchost1.R.inc(68530);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11gok1goklgchost1.R.inc(68531);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68532);expected = new int[]{10, 20, 29, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68533);result = field.add(new TimeOfDay(), 2, values, -1);
        __CLR4_4_11gok1goklgchost1.R.inc(68534);assertEquals(true, Arrays.equals(expected, result));

        __CLR4_4_11gok1goklgchost1.R.inc(68535);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68536);expected = new int[]{10, 19, 59, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68537);result = field.add(new TimeOfDay(), 2, values, -31);
        __CLR4_4_11gok1goklgchost1.R.inc(68538);assertEquals(true, Arrays.equals(expected, result));

        __CLR4_4_11gok1goklgchost1.R.inc(68539);values = new int[]{0, 0, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68540);try {
            __CLR4_4_11gok1goklgchost1.R.inc(68541);field.add(new TimeOfDay(), 2, values, -31);
            __CLR4_4_11gok1goklgchost1.R.inc(68542);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_addWrapField_long_int() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdicdy1gvz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_addWrapField_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdicdy1gvz(){try{__CLR4_4_11gok1goklgchost1.R.inc(68543);
        __CLR4_4_11gok1goklgchost1.R.inc(68544);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68545);assertEquals(29 * 60L, field.addWrapField(60L * 29, 0));
        __CLR4_4_11gok1goklgchost1.R.inc(68546);assertEquals(59 * 60L, field.addWrapField(60L * 29, 30));
        __CLR4_4_11gok1goklgchost1.R.inc(68547);assertEquals(0 * 60L, field.addWrapField(60L * 29, 31));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_addWrapField_RP_int_intarray_int() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18tdx7z1gw4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_addWrapField_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68548,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18tdx7z1gw4(){try{__CLR4_4_11gok1goklgchost1.R.inc(68548);
        __CLR4_4_11gok1goklgchost1.R.inc(68549);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68550);int[] values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68551);int[] expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68552);int[] result = field.addWrapField(new TimeOfDay(), 2, values, 0);
        __CLR4_4_11gok1goklgchost1.R.inc(68553);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11gok1goklgchost1.R.inc(68554);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68555);expected = new int[]{10, 20, 59, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68556);result = field.addWrapField(new TimeOfDay(), 2, values, 29);
        __CLR4_4_11gok1goklgchost1.R.inc(68557);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11gok1goklgchost1.R.inc(68558);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68559);expected = new int[]{10, 20, 0, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68560);result = field.addWrapField(new TimeOfDay(), 2, values, 30);
        __CLR4_4_11gok1goklgchost1.R.inc(68561);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11gok1goklgchost1.R.inc(68562);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68563);expected = new int[]{10, 20, 1, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68564);result = field.addWrapField(new TimeOfDay(), 2, values, 31);
        __CLR4_4_11gok1goklgchost1.R.inc(68565);assertEquals(true, Arrays.equals(result, expected));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getDifference_long_long() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17fh4q51gwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getDifference_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17fh4q51gwm(){try{__CLR4_4_11gok1goklgchost1.R.inc(68566);
        __CLR4_4_11gok1goklgchost1.R.inc(68567);MockCountingDurationField.difference_long = 0;
        __CLR4_4_11gok1goklgchost1.R.inc(68568);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68569);assertEquals(30, field.getDifference(0L, 0L));
        __CLR4_4_11gok1goklgchost1.R.inc(68570);assertEquals(1, MockCountingDurationField.difference_long);
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_getDifferenceAsLong_long_long() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1m2571gwr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getDifferenceAsLong_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68571,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1m2571gwr(){try{__CLR4_4_11gok1goklgchost1.R.inc(68571);
        __CLR4_4_11gok1goklgchost1.R.inc(68572);MockCountingDurationField.difference_long = 0;
        __CLR4_4_11gok1goklgchost1.R.inc(68573);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68574);assertEquals(30, field.getDifferenceAsLong(0L, 0L));
        __CLR4_4_11gok1goklgchost1.R.inc(68575);assertEquals(1, MockCountingDurationField.difference_long);
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_set_long_int() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rinawz1gww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_set_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rinawz1gww(){try{__CLR4_4_11gok1goklgchost1.R.inc(68576);
        __CLR4_4_11gok1goklgchost1.R.inc(68577);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68578);assertEquals(0, field.set(120L, 0));
        __CLR4_4_11gok1goklgchost1.R.inc(68579);assertEquals(29 * 60, field.set(120L, 29));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_set_RP_int_intarray_int() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17c085k1gx0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_set_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68580,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17c085k1gx0(){try{__CLR4_4_11gok1goklgchost1.R.inc(68580);
        __CLR4_4_11gok1goklgchost1.R.inc(68581);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68582);int[] values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68583);int[] expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68584);int[] result = field.set(new TimeOfDay(), 2, values, 30);
        __CLR4_4_11gok1goklgchost1.R.inc(68585);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11gok1goklgchost1.R.inc(68586);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68587);expected = new int[]{10, 20, 29, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68588);result = field.set(new TimeOfDay(), 2, values, 29);
        __CLR4_4_11gok1goklgchost1.R.inc(68589);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11gok1goklgchost1.R.inc(68590);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68591);expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68592);try {
            __CLR4_4_11gok1goklgchost1.R.inc(68593);field.set(new TimeOfDay(), 2, values, 60);
            __CLR4_4_11gok1goklgchost1.R.inc(68594);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11gok1goklgchost1.R.inc(68595);assertEquals(true, Arrays.equals(values, expected));

        __CLR4_4_11gok1goklgchost1.R.inc(68596);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68597);expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68598);try {
            __CLR4_4_11gok1goklgchost1.R.inc(68599);field.set(new TimeOfDay(), 2, values, -1);
            __CLR4_4_11gok1goklgchost1.R.inc(68600);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11gok1goklgchost1.R.inc(68601);assertEquals(true, Arrays.equals(values, expected));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_set_long_String_Locale() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1481lrq1gxm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_set_long_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1481lrq1gxm(){try{__CLR4_4_11gok1goklgchost1.R.inc(68602);
        __CLR4_4_11gok1goklgchost1.R.inc(68603);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68604);assertEquals(0, field.set(0L, "0", null));
        __CLR4_4_11gok1goklgchost1.R.inc(68605);assertEquals(29 * 60, field.set(0L, "29", Locale.ENGLISH));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_set_long_String() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15o1z691gxq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_set_long_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15o1z691gxq(){try{__CLR4_4_11gok1goklgchost1.R.inc(68606);
        __CLR4_4_11gok1goklgchost1.R.inc(68607);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68608);assertEquals(0, field.set(0L, "0"));
        __CLR4_4_11gok1goklgchost1.R.inc(68609);assertEquals(29 * 60, field.set(0L, "29"));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_set_RP_int_intarray_String_Locale() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j885c11gxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_set_RP_int_intarray_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j885c11gxu(){try{__CLR4_4_11gok1goklgchost1.R.inc(68610);
        __CLR4_4_11gok1goklgchost1.R.inc(68611);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68612);int[] values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68613);int[] expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68614);int[] result = field.set(new TimeOfDay(), 2, values, "30", null);
        __CLR4_4_11gok1goklgchost1.R.inc(68615);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11gok1goklgchost1.R.inc(68616);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68617);expected = new int[]{10, 20, 29, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68618);result = field.set(new TimeOfDay(), 2, values, "29", Locale.ENGLISH);
        __CLR4_4_11gok1goklgchost1.R.inc(68619);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11gok1goklgchost1.R.inc(68620);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68621);expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68622);try {
            __CLR4_4_11gok1goklgchost1.R.inc(68623);field.set(new TimeOfDay(), 2, values, "60", null);
            __CLR4_4_11gok1goklgchost1.R.inc(68624);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11gok1goklgchost1.R.inc(68625);assertEquals(true, Arrays.equals(values, expected));

        __CLR4_4_11gok1goklgchost1.R.inc(68626);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68627);expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11gok1goklgchost1.R.inc(68628);try {
            __CLR4_4_11gok1goklgchost1.R.inc(68629);field.set(new TimeOfDay(), 2, values, "-1", null);
            __CLR4_4_11gok1goklgchost1.R.inc(68630);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11gok1goklgchost1.R.inc(68631);assertEquals(true, Arrays.equals(values, expected));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_convertText() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qj2ptm1gyg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_convertText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qj2ptm1gyg(){try{__CLR4_4_11gok1goklgchost1.R.inc(68632);
        __CLR4_4_11gok1goklgchost1.R.inc(68633);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68634);assertEquals(0, field.convertText("0", null));
        __CLR4_4_11gok1goklgchost1.R.inc(68635);assertEquals(29, field.convertText("29", null));
        __CLR4_4_11gok1goklgchost1.R.inc(68636);try {
            __CLR4_4_11gok1goklgchost1.R.inc(68637);field.convertText("2A", null);
            __CLR4_4_11gok1goklgchost1.R.inc(68638);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11gok1goklgchost1.R.inc(68639);try {
            __CLR4_4_11gok1goklgchost1.R.inc(68640);field.convertText(null, null);
            __CLR4_4_11gok1goklgchost1.R.inc(68641);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    //------------------------------------------------------------------------
//    public abstract DurationField getDurationField();
//
//    public abstract DurationField getRangeDurationField();

    @Test
    public void test_isLeap_long() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yu5r3x1gyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_isLeap_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yu5r3x1gyq(){try{__CLR4_4_11gok1goklgchost1.R.inc(68642);
        __CLR4_4_11gok1goklgchost1.R.inc(68643);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68644);assertEquals(false, field.isLeap(0L));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_getLeapAmount_long() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u4dic91gyt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getLeapAmount_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68645,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u4dic91gyt(){try{__CLR4_4_11gok1goklgchost1.R.inc(68645);
        __CLR4_4_11gok1goklgchost1.R.inc(68646);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68647);assertEquals(0, field.getLeapAmount(0L));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_getLeapDurationField() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1geo41gyw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getLeapDurationField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68648,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1geo41gyw(){try{__CLR4_4_11gok1goklgchost1.R.inc(68648);
        __CLR4_4_11gok1goklgchost1.R.inc(68649);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68650);assertEquals(null, field.getLeapDurationField());
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getMinimumValue() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f1f2p91gyz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMinimumValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f1f2p91gyz(){try{__CLR4_4_11gok1goklgchost1.R.inc(68651);
        __CLR4_4_11gok1goklgchost1.R.inc(68652);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68653);assertEquals(0, field.getMinimumValue());
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_getMinimumValue_long() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16iyk61gz2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMinimumValue_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16iyk61gz2(){try{__CLR4_4_11gok1goklgchost1.R.inc(68654);
        __CLR4_4_11gok1goklgchost1.R.inc(68655);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68656);assertEquals(0, field.getMinimumValue(0L));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_getMinimumValue_RP() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13tfeiw1gz5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMinimumValue_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68657,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13tfeiw1gz5(){try{__CLR4_4_11gok1goklgchost1.R.inc(68657);
        __CLR4_4_11gok1goklgchost1.R.inc(68658);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68659);assertEquals(0, field.getMinimumValue(new TimeOfDay()));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_getMinimumValue_RP_intarray() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz5kov1gz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMinimumValue_RP_intarray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz5kov1gz8(){try{__CLR4_4_11gok1goklgchost1.R.inc(68660);
        __CLR4_4_11gok1goklgchost1.R.inc(68661);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68662);assertEquals(0, field.getMinimumValue(new TimeOfDay(), new int[4]));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_getMaximumValue() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hzocf1gzb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMaximumValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68663,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hzocf1gzb(){try{__CLR4_4_11gok1goklgchost1.R.inc(68663);
        __CLR4_4_11gok1goklgchost1.R.inc(68664);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68665);assertEquals(59, field.getMaximumValue());
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_getMaximumValue_long() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kk6lzc1gze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMaximumValue_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kk6lzc1gze(){try{__CLR4_4_11gok1goklgchost1.R.inc(68666);
        __CLR4_4_11gok1goklgchost1.R.inc(68667);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68668);assertEquals(59, field.getMaximumValue(0L));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_getMaximumValue_RP() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pndze1gzh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMaximumValue_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68669,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pndze1gzh(){try{__CLR4_4_11gok1goklgchost1.R.inc(68669);
        __CLR4_4_11gok1goklgchost1.R.inc(68670);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68671);assertEquals(59, field.getMaximumValue(new TimeOfDay()));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_getMaximumValue_RP_intarray() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19v2tg31gzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMaximumValue_RP_intarray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68672,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19v2tg31gzk(){try{__CLR4_4_11gok1goklgchost1.R.inc(68672);
        __CLR4_4_11gok1goklgchost1.R.inc(68673);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68674);assertEquals(59, field.getMaximumValue(new TimeOfDay(), new int[4]));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getMaximumTextLength_Locale() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1th5m161gzn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMaximumTextLength_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1th5m161gzn(){try{__CLR4_4_11gok1goklgchost1.R.inc(68675);
        __CLR4_4_11gok1goklgchost1.R.inc(68676);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68677);assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_getMaximumShortTextLength_Locale() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyw4ns1gzq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMaximumShortTextLength_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyw4ns1gzq(){try{__CLR4_4_11gok1goklgchost1.R.inc(68678);
        __CLR4_4_11gok1goklgchost1.R.inc(68679);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68680);assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    //------------------------------------------------------------------------
    @Test
    public void test_roundFloor_long() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13rvn2v1gzt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_roundFloor_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13rvn2v1gzt(){try{__CLR4_4_11gok1goklgchost1.R.inc(68681);
        __CLR4_4_11gok1goklgchost1.R.inc(68682);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68683);assertEquals(-120L, field.roundFloor(-61L));
        __CLR4_4_11gok1goklgchost1.R.inc(68684);assertEquals(-60L, field.roundFloor(-60L));
        __CLR4_4_11gok1goklgchost1.R.inc(68685);assertEquals(-60L, field.roundFloor(-59L));
        __CLR4_4_11gok1goklgchost1.R.inc(68686);assertEquals(-60L, field.roundFloor(-1L));
        __CLR4_4_11gok1goklgchost1.R.inc(68687);assertEquals(0L, field.roundFloor(0L));
        __CLR4_4_11gok1goklgchost1.R.inc(68688);assertEquals(0L, field.roundFloor(1L));
        __CLR4_4_11gok1goklgchost1.R.inc(68689);assertEquals(0L, field.roundFloor(29L));
        __CLR4_4_11gok1goklgchost1.R.inc(68690);assertEquals(0L, field.roundFloor(30L));
        __CLR4_4_11gok1goklgchost1.R.inc(68691);assertEquals(0L, field.roundFloor(31L));
        __CLR4_4_11gok1goklgchost1.R.inc(68692);assertEquals(60L, field.roundFloor(60L));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_roundCeiling_long() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t61ifu1h05();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_roundCeiling_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t61ifu1h05(){try{__CLR4_4_11gok1goklgchost1.R.inc(68693);
        __CLR4_4_11gok1goklgchost1.R.inc(68694);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68695);assertEquals(-60L, field.roundCeiling(-61L));
        __CLR4_4_11gok1goklgchost1.R.inc(68696);assertEquals(-60L, field.roundCeiling(-60L));
        __CLR4_4_11gok1goklgchost1.R.inc(68697);assertEquals(0L, field.roundCeiling(-59L));
        __CLR4_4_11gok1goklgchost1.R.inc(68698);assertEquals(0L, field.roundCeiling(-1L));
        __CLR4_4_11gok1goklgchost1.R.inc(68699);assertEquals(0L, field.roundCeiling(0L));
        __CLR4_4_11gok1goklgchost1.R.inc(68700);assertEquals(60L, field.roundCeiling(1L));
        __CLR4_4_11gok1goklgchost1.R.inc(68701);assertEquals(60L, field.roundCeiling(29L));
        __CLR4_4_11gok1goklgchost1.R.inc(68702);assertEquals(60L, field.roundCeiling(30L));
        __CLR4_4_11gok1goklgchost1.R.inc(68703);assertEquals(60L, field.roundCeiling(31L));
        __CLR4_4_11gok1goklgchost1.R.inc(68704);assertEquals(60L, field.roundCeiling(60L));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_roundHalfFloor_long() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3wvqu1h0h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_roundHalfFloor_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3wvqu1h0h(){try{__CLR4_4_11gok1goklgchost1.R.inc(68705);
        __CLR4_4_11gok1goklgchost1.R.inc(68706);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68707);assertEquals(0L, field.roundHalfFloor(0L));
        __CLR4_4_11gok1goklgchost1.R.inc(68708);assertEquals(0L, field.roundHalfFloor(29L));
        __CLR4_4_11gok1goklgchost1.R.inc(68709);assertEquals(0L, field.roundHalfFloor(30L));
        __CLR4_4_11gok1goklgchost1.R.inc(68710);assertEquals(60L, field.roundHalfFloor(31L));
        __CLR4_4_11gok1goklgchost1.R.inc(68711);assertEquals(60L, field.roundHalfFloor(60L));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_roundHalfCeiling_long() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_182e0k91h0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_roundHalfCeiling_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68712,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_182e0k91h0o(){try{__CLR4_4_11gok1goklgchost1.R.inc(68712);
        __CLR4_4_11gok1goklgchost1.R.inc(68713);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68714);assertEquals(0L, field.roundHalfCeiling(0L));
        __CLR4_4_11gok1goklgchost1.R.inc(68715);assertEquals(0L, field.roundHalfCeiling(29L));
        __CLR4_4_11gok1goklgchost1.R.inc(68716);assertEquals(60L, field.roundHalfCeiling(30L));
        __CLR4_4_11gok1goklgchost1.R.inc(68717);assertEquals(60L, field.roundHalfCeiling(31L));
        __CLR4_4_11gok1goklgchost1.R.inc(68718);assertEquals(60L, field.roundHalfCeiling(60L));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_roundHalfEven_long() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hd20a41h0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_roundHalfEven_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hd20a41h0v(){try{__CLR4_4_11gok1goklgchost1.R.inc(68719);
        __CLR4_4_11gok1goklgchost1.R.inc(68720);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68721);assertEquals(0L, field.roundHalfEven(0L));
        __CLR4_4_11gok1goklgchost1.R.inc(68722);assertEquals(0L, field.roundHalfEven(29L));
        __CLR4_4_11gok1goklgchost1.R.inc(68723);assertEquals(0L, field.roundHalfEven(30L));
        __CLR4_4_11gok1goklgchost1.R.inc(68724);assertEquals(60L, field.roundHalfEven(31L));
        __CLR4_4_11gok1goklgchost1.R.inc(68725);assertEquals(60L, field.roundHalfEven(60L));
        __CLR4_4_11gok1goklgchost1.R.inc(68726);assertEquals(60L, field.roundHalfEven(89L));
        __CLR4_4_11gok1goklgchost1.R.inc(68727);assertEquals(120L, field.roundHalfEven(90L));
        __CLR4_4_11gok1goklgchost1.R.inc(68728);assertEquals(120L, field.roundHalfEven(91L));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    @Test
    public void test_remainder_long() {__CLR4_4_11gok1goklgchost1.R.globalSliceStart(getClass().getName(),68729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6jwja1h15();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gok1goklgchost1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gok1goklgchost1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_remainder_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68729,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6jwja1h15(){try{__CLR4_4_11gok1goklgchost1.R.inc(68729);
        __CLR4_4_11gok1goklgchost1.R.inc(68730);BaseDateTimeField field = new MockPreciseDateTimeField();
        __CLR4_4_11gok1goklgchost1.R.inc(68731);assertEquals(0L, field.remainder(0L));
        __CLR4_4_11gok1goklgchost1.R.inc(68732);assertEquals(29L, field.remainder(29L));
        __CLR4_4_11gok1goklgchost1.R.inc(68733);assertEquals(30L, field.remainder(30L));
        __CLR4_4_11gok1goklgchost1.R.inc(68734);assertEquals(31L, field.remainder(31L));
        __CLR4_4_11gok1goklgchost1.R.inc(68735);assertEquals(0L, field.remainder(60L));
    }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    static class MockPreciseDateTimeField extends PreciseDateTimeField {
        protected MockPreciseDateTimeField() {
            super(DateTimeFieldType.secondOfMinute(),
                    new MockCountingDurationField(DurationFieldType.seconds(), 60),
                    new MockCountingDurationField(DurationFieldType.minutes(), 60 * 60));__CLR4_4_11gok1goklgchost1.R.inc(68737);try{__CLR4_4_11gok1goklgchost1.R.inc(68736);
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        protected MockPreciseDateTimeField(
                DateTimeFieldType type, DurationField dur, DurationField range) {
            super(type, dur, range);__CLR4_4_11gok1goklgchost1.R.inc(68739);try{__CLR4_4_11gok1goklgchost1.R.inc(68738);
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}
    }

    static class MockStandardDateTimeField extends MockPreciseDateTimeField {
        protected MockStandardDateTimeField() {
            super();__CLR4_4_11gok1goklgchost1.R.inc(68741);try{__CLR4_4_11gok1goklgchost1.R.inc(68740);
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public DurationField getDurationField() {try{__CLR4_4_11gok1goklgchost1.R.inc(68742);
            __CLR4_4_11gok1goklgchost1.R.inc(68743);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public DurationField getRangeDurationField() {try{__CLR4_4_11gok1goklgchost1.R.inc(68744);
            __CLR4_4_11gok1goklgchost1.R.inc(68745);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        int unit;

        protected MockCountingDurationField(DurationFieldType type, int unit) {
            super(type);__CLR4_4_11gok1goklgchost1.R.inc(68747);try{__CLR4_4_11gok1goklgchost1.R.inc(68746);
            __CLR4_4_11gok1goklgchost1.R.inc(68748);this.unit = unit;
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public boolean isPrecise() {try{__CLR4_4_11gok1goklgchost1.R.inc(68749);
            __CLR4_4_11gok1goklgchost1.R.inc(68750);return true;
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public long getUnitMillis() {try{__CLR4_4_11gok1goklgchost1.R.inc(68751);
            __CLR4_4_11gok1goklgchost1.R.inc(68752);return unit;
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_11gok1goklgchost1.R.inc(68753);
            __CLR4_4_11gok1goklgchost1.R.inc(68754);return 0;
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public long getMillis(int value, long instant) {try{__CLR4_4_11gok1goklgchost1.R.inc(68755);
            __CLR4_4_11gok1goklgchost1.R.inc(68756);return 0;
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public long getMillis(long value, long instant) {try{__CLR4_4_11gok1goklgchost1.R.inc(68757);
            __CLR4_4_11gok1goklgchost1.R.inc(68758);return 0;
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public long add(long instant, int value) {try{__CLR4_4_11gok1goklgchost1.R.inc(68759);
            __CLR4_4_11gok1goklgchost1.R.inc(68760);add_int++;
            __CLR4_4_11gok1goklgchost1.R.inc(68761);return instant + (value * 60L);
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public long add(long instant, long value) {try{__CLR4_4_11gok1goklgchost1.R.inc(68762);
            __CLR4_4_11gok1goklgchost1.R.inc(68763);add_long++;
            __CLR4_4_11gok1goklgchost1.R.inc(68764);return instant + (value * 60L);
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_11gok1goklgchost1.R.inc(68765);
            __CLR4_4_11gok1goklgchost1.R.inc(68766);difference_long++;
            __CLR4_4_11gok1goklgchost1.R.inc(68767);return 30;
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);__CLR4_4_11gok1goklgchost1.R.inc(68769);try{__CLR4_4_11gok1goklgchost1.R.inc(68768);
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public boolean isPrecise() {try{__CLR4_4_11gok1goklgchost1.R.inc(68770);
            __CLR4_4_11gok1goklgchost1.R.inc(68771);return true;
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public long getUnitMillis() {try{__CLR4_4_11gok1goklgchost1.R.inc(68772);
            __CLR4_4_11gok1goklgchost1.R.inc(68773);return 0;  // this is zero
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_11gok1goklgchost1.R.inc(68774);
            __CLR4_4_11gok1goklgchost1.R.inc(68775);return 0;
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public long getMillis(int value, long instant) {try{__CLR4_4_11gok1goklgchost1.R.inc(68776);
            __CLR4_4_11gok1goklgchost1.R.inc(68777);return 0;
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public long getMillis(long value, long instant) {try{__CLR4_4_11gok1goklgchost1.R.inc(68778);
            __CLR4_4_11gok1goklgchost1.R.inc(68779);return 0;
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public long add(long instant, int value) {try{__CLR4_4_11gok1goklgchost1.R.inc(68780);
            __CLR4_4_11gok1goklgchost1.R.inc(68781);return 0;
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public long add(long instant, long value) {try{__CLR4_4_11gok1goklgchost1.R.inc(68782);
            __CLR4_4_11gok1goklgchost1.R.inc(68783);return 0;
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_11gok1goklgchost1.R.inc(68784);
            __CLR4_4_11gok1goklgchost1.R.inc(68785);return 0;
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);__CLR4_4_11gok1goklgchost1.R.inc(68787);try{__CLR4_4_11gok1goklgchost1.R.inc(68786);
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public boolean isPrecise() {try{__CLR4_4_11gok1goklgchost1.R.inc(68788);
            __CLR4_4_11gok1goklgchost1.R.inc(68789);return false;  // this is false
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public long getUnitMillis() {try{__CLR4_4_11gok1goklgchost1.R.inc(68790);
            __CLR4_4_11gok1goklgchost1.R.inc(68791);return 0;
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_11gok1goklgchost1.R.inc(68792);
            __CLR4_4_11gok1goklgchost1.R.inc(68793);return 0;
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public long getMillis(int value, long instant) {try{__CLR4_4_11gok1goklgchost1.R.inc(68794);
            __CLR4_4_11gok1goklgchost1.R.inc(68795);return 0;
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public long getMillis(long value, long instant) {try{__CLR4_4_11gok1goklgchost1.R.inc(68796);
            __CLR4_4_11gok1goklgchost1.R.inc(68797);return 0;
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public long add(long instant, int value) {try{__CLR4_4_11gok1goklgchost1.R.inc(68798);
            __CLR4_4_11gok1goklgchost1.R.inc(68799);return 0;
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public long add(long instant, long value) {try{__CLR4_4_11gok1goklgchost1.R.inc(68800);
            __CLR4_4_11gok1goklgchost1.R.inc(68801);return 0;
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}

        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_11gok1goklgchost1.R.inc(68802);
            __CLR4_4_11gok1goklgchost1.R.inc(68803);return 0;
        }finally{__CLR4_4_11gok1goklgchost1.R.flushNeeded();}}
    }

}
