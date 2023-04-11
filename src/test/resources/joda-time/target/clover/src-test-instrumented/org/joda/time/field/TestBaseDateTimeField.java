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

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.TimeOfDay;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for BaseDateTimeField.
 *
 * @author Stephen Colebourne
 */
public class TestBaseDateTimeField {static class __CLR4_4_11fn81fn8lgchosrs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,67447,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    public static void main(String[] args) throws Exception {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(66932);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66933);TestBaseDateTimeField TB = new TestBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66934);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66935);TB.test_constructor();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66936);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66937);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66938);TB.test_getType();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66939);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66940);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66941);TB.test_getName();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66942);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66943);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66944);TB.test_toString();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66945);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66946);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66947);TB.test_isSupported();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66948);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66949);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66950);TB.test_get();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66951);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66952);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66953);TB.test_getAsText_long_Locale();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66954);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66955);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66956);TB.test_getAsText_long();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66957);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66958);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66959);TB.test_getAsText_RP_int_Locale();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66960);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66961);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66962);TB.test_getAsText_RP_Locale();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66963);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66964);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66965);TB.test_getAsText_int_Locale();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66966);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66967);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66968);TB.test_getAsShortText_long_Locale();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66969);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66970);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66971);TB.test_getAsShortText_long();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66972);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66973);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66974);TB.test_getAsShortText_RP_int_Locale();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66975);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66976);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66977);TB.test_getAsShortText_RP_Locale();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66978);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66979);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66980);TB.test_getAsShortText_int_Locale();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66981);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66982);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66983);TB.test_add_long_int();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66984);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66985);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66986);TB.test_add_long_long();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66987);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66988);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66989);TB.test_add_RP_int_intarray_int();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66990);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66991);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66992);TB.test_addWrapField_long_int();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66993);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66994);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66995);TB.test_addWrapField_RP_int_intarray_int();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66996);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66997);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66998);TB.test_getDifference_long_long();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(66999);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67000);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67001);TB.test_getDifferenceAsLong_long_long();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67002);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67003);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67004);TB.test_set_long_int();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67005);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67006);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67007);TB.test_set_RP_int_intarray_int();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67008);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67009);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67010);TB.test_set_long_String_Locale();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67011);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67012);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67013);TB.test_set_long_String();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67014);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67015);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67016);TB.test_set_RP_int_intarray_String_Locale();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67017);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67018);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67019);TB.test_convertText();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67020);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67021);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67022);TB.test_isLeap_long();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67023);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67024);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67025);TB.test_getLeapAmount_long();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67026);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67027);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67028);TB.test_getLeapDurationField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67029);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67030);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67031);TB.test_getMinimumValue();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67032);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67033);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67034);TB.test_getMinimumValue_long();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67035);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67036);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67037);TB.test_getMinimumValue_RP();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67038);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67039);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67040);TB.test_getMinimumValue_RP_intarray();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67041);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67042);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67043);TB.test_getMaximumValue();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67044);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67045);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67046);TB.test_getMaximumValue_long();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67047);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67048);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67049);TB.test_getMaximumValue_RP();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67050);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67051);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67052);TB.test_getMaximumValue_RP_intarray();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67053);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67054);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67055);TB.test_getMaximumTextLength_Locale();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67056);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67057);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67058);TB.test_getMaximumShortTextLength_Locale();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67059);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67060);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67061);TB.test_roundFloor_long();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67062);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67063);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67064);TB.test_roundCeiling_long();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67065);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67066);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67067);TB.test_roundHalfFloor_long();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67068);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67069);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67070);TB.test_roundHalfCeiling_long();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67071);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67072);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67073);TB.test_roundHalfEven_long();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67074);TB.tearDown();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67075);TB.setUp();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67076);TB.test_remainder_long();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67077);TB.tearDown();

    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    /*

    public static TestSuite suite() {
        return new TestSuite(TestBaseDateTimeField.class);
    }

    public TestBaseDateTimeField(String name) {
        super(name);
    }
     */
    @Before
    public void setUp() throws Exception {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67078);
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67079);
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_constructor() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14im07g1frc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_constructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67080,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14im07g1frc(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67080);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67081);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67082);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType());
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67083);try {
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67084);field = new MockBaseDateTimeField(null);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67085);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_getType() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5v7di1fri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5v7di1fri(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67086);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67087);BaseDateTimeField field = new MockBaseDateTimeField(DateTimeFieldType.secondOfDay());
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67088);assertEquals(DateTimeFieldType.secondOfDay(), field.getType());
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_getName() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5z5k51frl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67089,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5z5k51frl(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67089);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67090);BaseDateTimeField field = new MockBaseDateTimeField(DateTimeFieldType.secondOfDay());
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67091);assertEquals("secondOfDay", field.getName());
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_toString() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4d7c01fro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_toString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4d7c01fro(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67092);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67093);BaseDateTimeField field = new MockBaseDateTimeField(DateTimeFieldType.secondOfDay());
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67094);assertEquals("DateTimeField[secondOfDay]", field.toString());
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_isSupported() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189jpwe1frr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_isSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67095,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189jpwe1frr(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67095);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67096);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67097);assertEquals(true, field.isSupported());
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_get() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17oeyeo1fru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_get",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67098,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17oeyeo1fru(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67098);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67099);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67100);assertEquals(0, field.get(0));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67101);assertEquals(1, field.get(60));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67102);assertEquals(2, field.get(123));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getAsText_long_Locale() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kdirgz1frz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_long_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kdirgz1frz(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67103);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67104);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67105);assertEquals("29", field.getAsText(60L * 29, Locale.ENGLISH));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67106);assertEquals("29", field.getAsText(60L * 29, null));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_getAsText_long() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vd3zd21fs3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vd3zd21fs3(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67107);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67108);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67109);assertEquals("29", field.getAsText(60L * 29));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_getAsText_RP_int_Locale() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uuft1h1fs6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_RP_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uuft1h1fs6(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67110);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67111);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67112);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67113);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, null));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_getAsText_RP_Locale() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1ywid1fsa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_RP_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1ywid1fsa(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67114);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67115);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67116);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67117);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), null));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_getAsText_int_Locale() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gd8ltk1fse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gd8ltk1fse(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67118);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67119);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67120);assertEquals("80", field.getAsText(80, Locale.ENGLISH));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67121);assertEquals("80", field.getAsText(80, null));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getAsShortText_long_Locale() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1loiikt1fsi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_long_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1loiikt1fsi(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67122);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67123);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67124);assertEquals("29", field.getAsShortText(60L * 29, Locale.ENGLISH));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67125);assertEquals("29", field.getAsShortText(60L * 29, null));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_getAsShortText_long() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_121lqfg1fsm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_121lqfg1fsm(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67126);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67127);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67128);assertEquals("29", field.getAsShortText(60L * 29));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_getAsShortText_RP_int_Locale() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qtetb1fsp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_RP_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67129,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qtetb1fsp(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67129);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67130);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67131);assertEquals("20", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67132);assertEquals("20", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), 20, null));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_getAsShortText_RP_Locale() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rxyb9r1fst();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_RP_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67133,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rxyb9r1fst(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67133);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67134);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67135);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67136);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), null));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_getAsShortText_int_Locale() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ntvlq1fsx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ntvlq1fsx(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67137);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67138);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67139);assertEquals("80", field.getAsShortText(80, Locale.ENGLISH));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67140);assertEquals("80", field.getAsShortText(80, null));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_add_long_int() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9umwu1ft1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_add_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9umwu1ft1(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67141);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67142);MockCountingDurationField.add_int = 0;
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67143);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67144);assertEquals(61, field.add(1L, 1));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67145);assertEquals(1, MockCountingDurationField.add_int);
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_add_long_long() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nn6hgl1ft6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_add_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nn6hgl1ft6(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67146);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67147);MockCountingDurationField.add_long = 0;
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67148);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67149);assertEquals(61, field.add(1L, 1L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67150);assertEquals(1, MockCountingDurationField.add_long);
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_add_RP_int_intarray_int() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e06spl1ftb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_add_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67151,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e06spl1ftb(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67151);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67152);int[] values = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67153);int[] expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67154);BaseDateTimeField field = new MockStandardBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67155);int[] result = field.add(new TimeOfDay(), 2, values, 0);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67156);assertEquals(true, Arrays.equals(expected, result));

        __CLR4_4_11fn81fn8lgchosrs.R.inc(67157);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67158);expected = new int[]{10, 20, 31, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67159);result = field.add(new TimeOfDay(), 2, values, 1);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67160);assertEquals(true, Arrays.equals(expected, result));

        __CLR4_4_11fn81fn8lgchosrs.R.inc(67161);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67162);expected = new int[]{10, 21, 0, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67163);result = field.add(new TimeOfDay(), 2, values, 30);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67164);assertEquals(true, Arrays.equals(expected, result));

        __CLR4_4_11fn81fn8lgchosrs.R.inc(67165);values = new int[]{23, 59, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67166);try {
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67167);field.add(new TimeOfDay(), 2, values, 30);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67168);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11fn81fn8lgchosrs.R.inc(67169);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67170);expected = new int[]{10, 20, 29, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67171);result = field.add(new TimeOfDay(), 2, values, -1);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67172);assertEquals(true, Arrays.equals(expected, result));

        __CLR4_4_11fn81fn8lgchosrs.R.inc(67173);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67174);expected = new int[]{10, 19, 59, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67175);result = field.add(new TimeOfDay(), 2, values, -31);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67176);assertEquals(true, Arrays.equals(expected, result));

        __CLR4_4_11fn81fn8lgchosrs.R.inc(67177);values = new int[]{0, 0, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67178);try {
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67179);field.add(new TimeOfDay(), 2, values, -31);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67180);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11fn81fn8lgchosrs.R.inc(67181);values = new int[]{0, 0};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67182);try {
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67183);field.add(new MockPartial(), 0, values, 1000);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67184);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11fn81fn8lgchosrs.R.inc(67185);values = new int[]{1, 0};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67186);try {
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67187);field.add(new MockPartial(), 0, values, -1000);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67188);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_addWrapField_long_int() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdicdy1fud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_addWrapField_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdicdy1fud(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67189);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67190);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67191);assertEquals(1029, field.addWrapField(60L * 29, 0));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67192);assertEquals(1059, field.addWrapField(60L * 29, 30));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67193);assertEquals(1000, field.addWrapField(60L * 29, 31));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_addWrapField_RP_int_intarray_int() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18tdx7z1fui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_addWrapField_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18tdx7z1fui(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67194);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67195);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67196);int[] values = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67197);int[] expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67198);int[] result = field.addWrapField(new TimeOfDay(), 2, values, 0);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67199);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11fn81fn8lgchosrs.R.inc(67200);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67201);expected = new int[]{10, 20, 59, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67202);result = field.addWrapField(new TimeOfDay(), 2, values, 29);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67203);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11fn81fn8lgchosrs.R.inc(67204);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67205);expected = new int[]{10, 20, 0, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67206);result = field.addWrapField(new TimeOfDay(), 2, values, 30);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67207);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11fn81fn8lgchosrs.R.inc(67208);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67209);expected = new int[]{10, 20, 1, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67210);result = field.addWrapField(new TimeOfDay(), 2, values, 31);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67211);assertEquals(true, Arrays.equals(result, expected));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getDifference_long_long() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17fh4q51fv0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getDifference_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17fh4q51fv0(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67212);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67213);MockCountingDurationField.difference_long = 0;
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67214);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67215);assertEquals(30, field.getDifference(0L, 0L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67216);assertEquals(1, MockCountingDurationField.difference_long);
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_getDifferenceAsLong_long_long() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1m2571fv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getDifferenceAsLong_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1m2571fv5(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67217);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67218);MockCountingDurationField.difference_long = 0;
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67219);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67220);assertEquals(30, field.getDifferenceAsLong(0L, 0L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67221);assertEquals(1, MockCountingDurationField.difference_long);
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_set_long_int() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rinawz1fva();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67222,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rinawz1fva(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67222);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67223);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67224);assertEquals(1000, field.set(0L, 0));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67225);assertEquals(1029, field.set(0L, 29));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_set_RP_int_intarray_int() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17c085k1fve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17c085k1fve(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67226);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67227);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67228);int[] values = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67229);int[] expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67230);int[] result = field.set(new TimeOfDay(), 2, values, 30);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67231);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11fn81fn8lgchosrs.R.inc(67232);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67233);expected = new int[]{10, 20, 29, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67234);result = field.set(new TimeOfDay(), 2, values, 29);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67235);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11fn81fn8lgchosrs.R.inc(67236);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67237);expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67238);try {
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67239);field.set(new TimeOfDay(), 2, values, 60);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67240);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67241);assertEquals(true, Arrays.equals(values, expected));

        __CLR4_4_11fn81fn8lgchosrs.R.inc(67242);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67243);expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67244);try {
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67245);field.set(new TimeOfDay(), 2, values, -1);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67246);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67247);assertEquals(true, Arrays.equals(values, expected));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_set_long_String_Locale() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1481lrq1fw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_long_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67248,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1481lrq1fw0(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67248);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67249);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67250);assertEquals(1000, field.set(0L, "0", null));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67251);assertEquals(1029, field.set(0L, "29", Locale.ENGLISH));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_set_long_String() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15o1z691fw4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_long_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15o1z691fw4(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67252);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67253);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67254);assertEquals(1000, field.set(0L, "0"));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67255);assertEquals(1029, field.set(0L, "29"));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_set_RP_int_intarray_String_Locale() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j885c11fw8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_RP_int_intarray_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j885c11fw8(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67256);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67257);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67258);int[] values = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67259);int[] expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67260);int[] result = field.set(new TimeOfDay(), 2, values, "30", null);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67261);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11fn81fn8lgchosrs.R.inc(67262);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67263);expected = new int[]{10, 20, 29, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67264);result = field.set(new TimeOfDay(), 2, values, "29", Locale.ENGLISH);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67265);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11fn81fn8lgchosrs.R.inc(67266);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67267);expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67268);try {
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67269);field.set(new TimeOfDay(), 2, values, "60", null);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67270);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67271);assertEquals(true, Arrays.equals(values, expected));

        __CLR4_4_11fn81fn8lgchosrs.R.inc(67272);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67273);expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67274);try {
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67275);field.set(new TimeOfDay(), 2, values, "-1", null);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67276);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67277);assertEquals(true, Arrays.equals(values, expected));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_convertText() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qj2ptm1fwu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_convertText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qj2ptm1fwu(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67278);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67279);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67280);assertEquals(0, field.convertText("0", null));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67281);assertEquals(29, field.convertText("29", null));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67282);try {
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67283);field.convertText("2A", null);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67284);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67285);try {
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67286);field.convertText(null, null);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67287);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    //------------------------------------------------------------------------
//    public abstract DurationField getDurationField();
//
//    public abstract DurationField getRangeDurationField();

    @Test
    public void test_isLeap_long() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yu5r3x1fx4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_isLeap_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67288,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yu5r3x1fx4(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67288);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67289);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67290);assertEquals(false, field.isLeap(0L));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_getLeapAmount_long() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u4dic91fx7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getLeapAmount_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u4dic91fx7(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67291);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67292);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67293);assertEquals(0, field.getLeapAmount(0L));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_getLeapDurationField() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1geo41fxa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getLeapDurationField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67294,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1geo41fxa(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67294);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67295);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67296);assertEquals(null, field.getLeapDurationField());
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getMinimumValue() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f1f2p91fxd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMinimumValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f1f2p91fxd(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67297);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67298);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67299);assertEquals(0, field.getMinimumValue());
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_getMinimumValue_long() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16iyk61fxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMinimumValue_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16iyk61fxg(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67300);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67301);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67302);assertEquals(0, field.getMinimumValue(0L));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_getMinimumValue_RP() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13tfeiw1fxj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMinimumValue_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13tfeiw1fxj(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67303);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67304);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67305);assertEquals(0, field.getMinimumValue(new TimeOfDay()));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_getMinimumValue_RP_intarray() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz5kov1fxm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMinimumValue_RP_intarray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz5kov1fxm(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67306);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67307);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67308);assertEquals(0, field.getMinimumValue(new TimeOfDay(), new int[4]));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_getMaximumValue() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hzocf1fxp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67309,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hzocf1fxp(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67309);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67310);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67311);assertEquals(59, field.getMaximumValue());
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_getMaximumValue_long() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kk6lzc1fxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumValue_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67312,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kk6lzc1fxs(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67312);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67313);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67314);assertEquals(59, field.getMaximumValue(0L));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_getMaximumValue_RP() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pndze1fxv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumValue_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pndze1fxv(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67315);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67316);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67317);assertEquals(59, field.getMaximumValue(new TimeOfDay()));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_getMaximumValue_RP_intarray() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19v2tg31fxy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumValue_RP_intarray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67318,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19v2tg31fxy(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67318);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67319);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67320);assertEquals(59, field.getMaximumValue(new TimeOfDay(), new int[4]));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getMaximumTextLength_Locale() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1th5m161fy1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumTextLength_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67321,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1th5m161fy1(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67321);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67322);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67323);assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH));

        __CLR4_4_11fn81fn8lgchosrs.R.inc(67324);field = new MockBaseDateTimeField() {
            public int getMaximumValue() {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67325);
                __CLR4_4_11fn81fn8lgchosrs.R.inc(67326);return 5;
            }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}
        };
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67327);assertEquals(1, field.getMaximumTextLength(Locale.ENGLISH));

        __CLR4_4_11fn81fn8lgchosrs.R.inc(67328);field = new MockBaseDateTimeField() {
            public int getMaximumValue() {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67329);
                __CLR4_4_11fn81fn8lgchosrs.R.inc(67330);return 555;
            }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}
        };
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67331);assertEquals(3, field.getMaximumTextLength(Locale.ENGLISH));

        __CLR4_4_11fn81fn8lgchosrs.R.inc(67332);field = new MockBaseDateTimeField() {
            public int getMaximumValue() {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67333);
                __CLR4_4_11fn81fn8lgchosrs.R.inc(67334);return 5555;
            }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}
        };
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67335);assertEquals(4, field.getMaximumTextLength(Locale.ENGLISH));

        __CLR4_4_11fn81fn8lgchosrs.R.inc(67336);field = new MockBaseDateTimeField() {
            public int getMaximumValue() {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67337);
                __CLR4_4_11fn81fn8lgchosrs.R.inc(67338);return -1;
            }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}
        };
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67339);assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_getMaximumShortTextLength_Locale() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyw4ns1fyk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumShortTextLength_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyw4ns1fyk(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67340);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67341);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67342);assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    //------------------------------------------------------------------------
    @Test
    public void test_roundFloor_long() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13rvn2v1fyn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundFloor_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13rvn2v1fyn(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67343);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67344);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67345);assertEquals(0L, field.roundFloor(0L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67346);assertEquals(0L, field.roundFloor(29L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67347);assertEquals(0L, field.roundFloor(30L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67348);assertEquals(0L, field.roundFloor(31L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67349);assertEquals(60L, field.roundFloor(60L));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_roundCeiling_long() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t61ifu1fyu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundCeiling_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t61ifu1fyu(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67350);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67351);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67352);assertEquals(0L, field.roundCeiling(0L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67353);assertEquals(60L, field.roundCeiling(29L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67354);assertEquals(60L, field.roundCeiling(30L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67355);assertEquals(60L, field.roundCeiling(31L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67356);assertEquals(60L, field.roundCeiling(60L));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_roundHalfFloor_long() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3wvqu1fz1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundHalfFloor_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3wvqu1fz1(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67357);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67358);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67359);assertEquals(0L, field.roundHalfFloor(0L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67360);assertEquals(0L, field.roundHalfFloor(29L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67361);assertEquals(0L, field.roundHalfFloor(30L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67362);assertEquals(60L, field.roundHalfFloor(31L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67363);assertEquals(60L, field.roundHalfFloor(60L));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_roundHalfCeiling_long() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_182e0k91fz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundHalfCeiling_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_182e0k91fz8(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67364);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67365);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67366);assertEquals(0L, field.roundHalfCeiling(0L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67367);assertEquals(0L, field.roundHalfCeiling(29L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67368);assertEquals(60L, field.roundHalfCeiling(30L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67369);assertEquals(60L, field.roundHalfCeiling(31L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67370);assertEquals(60L, field.roundHalfCeiling(60L));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_roundHalfEven_long() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hd20a41fzf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundHalfEven_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hd20a41fzf(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67371);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67372);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67373);assertEquals(0L, field.roundHalfEven(0L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67374);assertEquals(0L, field.roundHalfEven(29L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67375);assertEquals(0L, field.roundHalfEven(30L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67376);assertEquals(60L, field.roundHalfEven(31L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67377);assertEquals(60L, field.roundHalfEven(60L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67378);assertEquals(60L, field.roundHalfEven(89L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67379);assertEquals(120L, field.roundHalfEven(90L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67380);assertEquals(120L, field.roundHalfEven(91L));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    @Test
    public void test_remainder_long() {__CLR4_4_11fn81fn8lgchosrs.R.globalSliceStart(getClass().getName(),67381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6jwja1fzp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fn81fn8lgchosrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fn81fn8lgchosrs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_remainder_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67381,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6jwja1fzp(){try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67381);
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67382);BaseDateTimeField field = new MockBaseDateTimeField();
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67383);assertEquals(0L, field.remainder(0L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67384);assertEquals(29L, field.remainder(29L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67385);assertEquals(30L, field.remainder(30L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67386);assertEquals(31L, field.remainder(31L));
        __CLR4_4_11fn81fn8lgchosrs.R.inc(67387);assertEquals(0L, field.remainder(60L));
    }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    static class MockBaseDateTimeField extends BaseDateTimeField {
        protected MockBaseDateTimeField() {
            super(DateTimeFieldType.secondOfMinute());__CLR4_4_11fn81fn8lgchosrs.R.inc(67389);try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67388);
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

        protected MockBaseDateTimeField(DateTimeFieldType type) {
            super(type);__CLR4_4_11fn81fn8lgchosrs.R.inc(67391);try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67390);
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

        public int get(long instant) {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67392);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67393);return (int) (instant / 60L);
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

        public long set(long instant, int value) {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67394);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67395);return 1000 + value;
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

        public DurationField getDurationField() {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67396);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67397);return new MockCountingDurationField(DurationFieldType.seconds());
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

        public DurationField getRangeDurationField() {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67398);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67399);return new MockCountingDurationField(DurationFieldType.minutes());
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

        public int getMinimumValue() {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67400);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67401);return 0;
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

        public int getMaximumValue() {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67402);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67403);return 59;
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

        public long roundFloor(long instant) {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67404);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67405);return (instant / 60L) * 60L;
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

        public boolean isLenient() {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67406);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67407);return false;
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}
    }

    static class MockStandardBaseDateTimeField extends MockBaseDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();__CLR4_4_11fn81fn8lgchosrs.R.inc(67409);try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67408);
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

        public DurationField getDurationField() {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67410);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67411);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

        public DurationField getRangeDurationField() {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67412);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67413);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;

        protected MockCountingDurationField(DurationFieldType type) {
            super(type);__CLR4_4_11fn81fn8lgchosrs.R.inc(67415);try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67414);
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

        public boolean isPrecise() {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67416);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67417);return false;
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

        public long getUnitMillis() {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67418);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67419);return 0;
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67420);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67421);return 0;
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

        public long getMillis(int value, long instant) {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67422);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67423);return 0;
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

        public long getMillis(long value, long instant) {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67424);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67425);return 0;
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

        public long add(long instant, int value) {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67426);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67427);add_int++;
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67428);return instant + (value * 60L);
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

        public long add(long instant, long value) {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67429);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67430);add_long++;
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67431);return instant + (value * 60L);
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67432);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67433);difference_long++;
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67434);return 30;
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}
    }

    static class MockPartial extends BasePartial {
        protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67435);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67436);if ((((index == 0)&&(__CLR4_4_11fn81fn8lgchosrs.R.iget(67437)!=0|true))||(__CLR4_4_11fn81fn8lgchosrs.R.iget(67438)==0&false))) {{
                __CLR4_4_11fn81fn8lgchosrs.R.inc(67439);return ISOChronology.getInstanceUTC().minuteOfHour();
            }
            }__CLR4_4_11fn81fn8lgchosrs.R.inc(67440);if ((((index == 1)&&(__CLR4_4_11fn81fn8lgchosrs.R.iget(67441)!=0|true))||(__CLR4_4_11fn81fn8lgchosrs.R.iget(67442)==0&false))) {{
                __CLR4_4_11fn81fn8lgchosrs.R.inc(67443);return ISOChronology.getInstanceUTC().millisOfSecond();
            }
            }__CLR4_4_11fn81fn8lgchosrs.R.inc(67444);return null;
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

        public int size() {try{__CLR4_4_11fn81fn8lgchosrs.R.inc(67445);
            __CLR4_4_11fn81fn8lgchosrs.R.inc(67446);return 2;
        }finally{__CLR4_4_11fn81fn8lgchosrs.R.flushNeeded();}}

    }
}
