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
 * This class is a Junit unit test for PreciseDurationDateTimeField.
 *
 * @author Stephen Colebourne
 */
public class TestPreciseDurationDateTimeField {static class __CLR4_4_11h381h38lgchostj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,69347,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    public static void main(String[] args) throws Exception {try{__CLR4_4_11h381h38lgchostj.R.inc(68804);
        __CLR4_4_11h381h38lgchostj.R.inc(68805);TestPreciseDurationDateTimeField TB = new TestPreciseDurationDateTimeField();

        __CLR4_4_11h381h38lgchostj.R.inc(68806);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68807);TB.test_constructor();
        __CLR4_4_11h381h38lgchostj.R.inc(68808);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68809);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68810);TB.test_getType();
        __CLR4_4_11h381h38lgchostj.R.inc(68811);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68812);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68813);TB.test_getName();
        __CLR4_4_11h381h38lgchostj.R.inc(68814);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68815);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68816);TB.test_toString();
        __CLR4_4_11h381h38lgchostj.R.inc(68817);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68818);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68819);TB.test_isSupported();
        __CLR4_4_11h381h38lgchostj.R.inc(68820);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68821);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68822);TB.test_isLenient();
        __CLR4_4_11h381h38lgchostj.R.inc(68823);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68824);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68825);TB.test_get();
        __CLR4_4_11h381h38lgchostj.R.inc(68826);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68827);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68828);TB.test_getAsText_long_Locale();
        __CLR4_4_11h381h38lgchostj.R.inc(68829);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68830);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68831);TB.test_getAsText_long();
        __CLR4_4_11h381h38lgchostj.R.inc(68832);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68833);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68834);TB.test_getAsText_RP_int_Locale();
        __CLR4_4_11h381h38lgchostj.R.inc(68835);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68836);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68837);TB.test_getAsText_RP_Locale();
        __CLR4_4_11h381h38lgchostj.R.inc(68838);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68839);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68840);TB.test_getAsText_int_Locale();
        __CLR4_4_11h381h38lgchostj.R.inc(68841);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68842);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68843);TB.test_getAsShortText_long_Locale();
        __CLR4_4_11h381h38lgchostj.R.inc(68844);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68845);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68846);TB.test_getAsShortText_long();
        __CLR4_4_11h381h38lgchostj.R.inc(68847);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68848);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68849);TB.test_getAsShortText_RP_int_Locale();
        __CLR4_4_11h381h38lgchostj.R.inc(68850);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68851);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68852);TB.test_getAsShortText_RP_Locale();
        __CLR4_4_11h381h38lgchostj.R.inc(68853);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68854);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68855);TB.test_getAsShortText_int_Locale();
        __CLR4_4_11h381h38lgchostj.R.inc(68856);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68857);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68858);TB.test_add_long_int();
        __CLR4_4_11h381h38lgchostj.R.inc(68859);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68860);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68861);TB.test_add_long_long();
        __CLR4_4_11h381h38lgchostj.R.inc(68862);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68863);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68864);TB.test_add_RP_int_intarray_int();
        __CLR4_4_11h381h38lgchostj.R.inc(68865);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68866);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68867);TB.test_addWrapField_long_int();
        __CLR4_4_11h381h38lgchostj.R.inc(68868);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68869);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68870);TB.test_addWrapField_RP_int_intarray_int();
        __CLR4_4_11h381h38lgchostj.R.inc(68871);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68872);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68873);TB.test_getDifference_long_long();
        __CLR4_4_11h381h38lgchostj.R.inc(68874);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68875);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68876);TB.test_getDifferenceAsLong_long_long();
        __CLR4_4_11h381h38lgchostj.R.inc(68877);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68878);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68879);TB.test_set_long_int();
        __CLR4_4_11h381h38lgchostj.R.inc(68880);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68881);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68882);TB.test_set_RP_int_intarray_int();
        __CLR4_4_11h381h38lgchostj.R.inc(68883);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68884);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68885);TB.test_set_long_String_Locale();
        __CLR4_4_11h381h38lgchostj.R.inc(68886);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68887);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68888);TB.test_set_long_String();
        __CLR4_4_11h381h38lgchostj.R.inc(68889);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68890);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68891);TB.test_set_RP_int_intarray_String_Locale();
        __CLR4_4_11h381h38lgchostj.R.inc(68892);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68893);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68894);TB.test_convertText();
        __CLR4_4_11h381h38lgchostj.R.inc(68895);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68896);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68897);TB.test_isLeap_long();
        __CLR4_4_11h381h38lgchostj.R.inc(68898);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68899);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68900);TB.test_getLeapAmount_long();
        __CLR4_4_11h381h38lgchostj.R.inc(68901);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68902);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68903);TB.test_getLeapDurationField();
        __CLR4_4_11h381h38lgchostj.R.inc(68904);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68905);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68906);TB.test_getMinimumValue();
        __CLR4_4_11h381h38lgchostj.R.inc(68907);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68908);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68909);TB.test_getMinimumValue_long();
        __CLR4_4_11h381h38lgchostj.R.inc(68910);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68911);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68912);TB.test_getMinimumValue_RP();
        __CLR4_4_11h381h38lgchostj.R.inc(68913);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68914);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68915);TB.test_getMinimumValue_RP_intarray();
        __CLR4_4_11h381h38lgchostj.R.inc(68916);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68917);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68918);TB.test_getMaximumValue();
        __CLR4_4_11h381h38lgchostj.R.inc(68919);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68920);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68921);TB.test_getMaximumValue_long();
        __CLR4_4_11h381h38lgchostj.R.inc(68922);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68923);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68924);TB.test_getMaximumValue_RP();
        __CLR4_4_11h381h38lgchostj.R.inc(68925);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68926);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68927);TB.test_getMaximumValue_RP_intarray();
        __CLR4_4_11h381h38lgchostj.R.inc(68928);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68929);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68930);TB.test_getMaximumTextLength_Locale();
        __CLR4_4_11h381h38lgchostj.R.inc(68931);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68932);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68933);TB.test_getMaximumShortTextLength_Locale();
        __CLR4_4_11h381h38lgchostj.R.inc(68934);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68935);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68936);TB.test_roundFloor_long();
        __CLR4_4_11h381h38lgchostj.R.inc(68937);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68938);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68939);TB.test_roundCeiling_long();
        __CLR4_4_11h381h38lgchostj.R.inc(68940);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68941);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68942);TB.test_roundHalfFloor_long();
        __CLR4_4_11h381h38lgchostj.R.inc(68943);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68944);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68945);TB.test_roundHalfCeiling_long();
        __CLR4_4_11h381h38lgchostj.R.inc(68946);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68947);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68948);TB.test_roundHalfEven_long();
        __CLR4_4_11h381h38lgchostj.R.inc(68949);TB.tearDown();
        __CLR4_4_11h381h38lgchostj.R.inc(68950);TB.setUp();
        __CLR4_4_11h381h38lgchostj.R.inc(68951);TB.test_remainder_long();
        __CLR4_4_11h381h38lgchostj.R.inc(68952);TB.tearDown();

    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestPreciseDurationDateTimeField.class);
    }

    public TestPreciseDurationDateTimeField(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11h381h38lgchostj.R.inc(68953);
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11h381h38lgchostj.R.inc(68954);
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_constructor() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),68955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14im07g1h7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_constructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14im07g1h7f(){try{__CLR4_4_11h381h38lgchostj.R.inc(68955);
        __CLR4_4_11h381h38lgchostj.R.inc(68956);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(68957);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType());
        __CLR4_4_11h381h38lgchostj.R.inc(68958);try {
            __CLR4_4_11h381h38lgchostj.R.inc(68959);field = new MockPreciseDurationDateTimeField(null, null);
            __CLR4_4_11h381h38lgchostj.R.inc(68960);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11h381h38lgchostj.R.inc(68961);try {
            __CLR4_4_11h381h38lgchostj.R.inc(68962);field = new MockPreciseDurationDateTimeField(
                    DateTimeFieldType.minuteOfHour(),
                    new MockImpreciseDurationField(DurationFieldType.minutes()));
            __CLR4_4_11h381h38lgchostj.R.inc(68963);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11h381h38lgchostj.R.inc(68964);try {
            __CLR4_4_11h381h38lgchostj.R.inc(68965);field = new MockPreciseDurationDateTimeField(
                    DateTimeFieldType.minuteOfHour(),
                    new MockZeroDurationField(DurationFieldType.minutes()));
            __CLR4_4_11h381h38lgchostj.R.inc(68966);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_getType() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),68967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5v7di1h7r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5v7di1h7r(){try{__CLR4_4_11h381h38lgchostj.R.inc(68967);
        __CLR4_4_11h381h38lgchostj.R.inc(68968);BaseDateTimeField field = new MockPreciseDurationDateTimeField(
                DateTimeFieldType.secondOfDay(), new MockCountingDurationField(DurationFieldType.minutes()));
        __CLR4_4_11h381h38lgchostj.R.inc(68969);assertEquals(DateTimeFieldType.secondOfDay(), field.getType());
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_getName() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),68970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5z5k51h7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68970,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5z5k51h7u(){try{__CLR4_4_11h381h38lgchostj.R.inc(68970);
        __CLR4_4_11h381h38lgchostj.R.inc(68971);BaseDateTimeField field = new MockPreciseDurationDateTimeField(
                DateTimeFieldType.secondOfDay(), new MockCountingDurationField(DurationFieldType.minutes()));
        __CLR4_4_11h381h38lgchostj.R.inc(68972);assertEquals("secondOfDay", field.getName());
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_toString() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),68973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4d7c01h7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_toString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68973,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4d7c01h7x(){try{__CLR4_4_11h381h38lgchostj.R.inc(68973);
        __CLR4_4_11h381h38lgchostj.R.inc(68974);BaseDateTimeField field = new MockPreciseDurationDateTimeField(
                DateTimeFieldType.secondOfDay(), new MockCountingDurationField(DurationFieldType.minutes()));
        __CLR4_4_11h381h38lgchostj.R.inc(68975);assertEquals("DateTimeField[secondOfDay]", field.toString());
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_isSupported() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),68976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189jpwe1h80();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_isSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68976,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189jpwe1h80(){try{__CLR4_4_11h381h38lgchostj.R.inc(68976);
        __CLR4_4_11h381h38lgchostj.R.inc(68977);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(68978);assertEquals(true, field.isSupported());
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_isLenient() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),68979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ljx0zd1h83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_isLenient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ljx0zd1h83(){try{__CLR4_4_11h381h38lgchostj.R.inc(68979);
        __CLR4_4_11h381h38lgchostj.R.inc(68980);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(68981);assertEquals(false, field.isLenient());
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_get() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),68982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17oeyeo1h86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_get",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17oeyeo1h86(){try{__CLR4_4_11h381h38lgchostj.R.inc(68982);
        __CLR4_4_11h381h38lgchostj.R.inc(68983);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(68984);assertEquals(0, field.get(0));
        __CLR4_4_11h381h38lgchostj.R.inc(68985);assertEquals(1, field.get(60));
        __CLR4_4_11h381h38lgchostj.R.inc(68986);assertEquals(2, field.get(123));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getAsText_long_Locale() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),68987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kdirgz1h8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getAsText_long_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kdirgz1h8b(){try{__CLR4_4_11h381h38lgchostj.R.inc(68987);
        __CLR4_4_11h381h38lgchostj.R.inc(68988);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(68989);assertEquals("29", field.getAsText(60L * 29, Locale.ENGLISH));
        __CLR4_4_11h381h38lgchostj.R.inc(68990);assertEquals("29", field.getAsText(60L * 29, null));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_getAsText_long() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),68991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vd3zd21h8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getAsText_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68991,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vd3zd21h8f(){try{__CLR4_4_11h381h38lgchostj.R.inc(68991);
        __CLR4_4_11h381h38lgchostj.R.inc(68992);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(68993);assertEquals("29", field.getAsText(60L * 29));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_getAsText_RP_int_Locale() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),68994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uuft1h1h8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getAsText_RP_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uuft1h1h8i(){try{__CLR4_4_11h381h38lgchostj.R.inc(68994);
        __CLR4_4_11h381h38lgchostj.R.inc(68995);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(68996);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH));
        __CLR4_4_11h381h38lgchostj.R.inc(68997);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, null));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_getAsText_RP_Locale() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),68998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1ywid1h8m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getAsText_RP_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68998,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1ywid1h8m(){try{__CLR4_4_11h381h38lgchostj.R.inc(68998);
        __CLR4_4_11h381h38lgchostj.R.inc(68999);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69000);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH));
        __CLR4_4_11h381h38lgchostj.R.inc(69001);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), null));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_getAsText_int_Locale() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gd8ltk1h8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getAsText_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gd8ltk1h8q(){try{__CLR4_4_11h381h38lgchostj.R.inc(69002);
        __CLR4_4_11h381h38lgchostj.R.inc(69003);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69004);assertEquals("80", field.getAsText(80, Locale.ENGLISH));
        __CLR4_4_11h381h38lgchostj.R.inc(69005);assertEquals("80", field.getAsText(80, null));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getAsShortText_long_Locale() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1loiikt1h8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getAsShortText_long_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1loiikt1h8u(){try{__CLR4_4_11h381h38lgchostj.R.inc(69006);
        __CLR4_4_11h381h38lgchostj.R.inc(69007);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69008);assertEquals("29", field.getAsShortText(60L * 29, Locale.ENGLISH));
        __CLR4_4_11h381h38lgchostj.R.inc(69009);assertEquals("29", field.getAsShortText(60L * 29, null));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_getAsShortText_long() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_121lqfg1h8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getAsShortText_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_121lqfg1h8y(){try{__CLR4_4_11h381h38lgchostj.R.inc(69010);
        __CLR4_4_11h381h38lgchostj.R.inc(69011);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69012);assertEquals("29", field.getAsShortText(60L * 29));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_getAsShortText_RP_int_Locale() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qtetb1h91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getAsShortText_RP_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69013,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qtetb1h91(){try{__CLR4_4_11h381h38lgchostj.R.inc(69013);
        __CLR4_4_11h381h38lgchostj.R.inc(69014);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69015);assertEquals("20", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH));
        __CLR4_4_11h381h38lgchostj.R.inc(69016);assertEquals("20", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), 20, null));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_getAsShortText_RP_Locale() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rxyb9r1h95();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getAsShortText_RP_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69017,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rxyb9r1h95(){try{__CLR4_4_11h381h38lgchostj.R.inc(69017);
        __CLR4_4_11h381h38lgchostj.R.inc(69018);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69019);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH));
        __CLR4_4_11h381h38lgchostj.R.inc(69020);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), null));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_getAsShortText_int_Locale() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ntvlq1h99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getAsShortText_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69021,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ntvlq1h99(){try{__CLR4_4_11h381h38lgchostj.R.inc(69021);
        __CLR4_4_11h381h38lgchostj.R.inc(69022);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69023);assertEquals("80", field.getAsShortText(80, Locale.ENGLISH));
        __CLR4_4_11h381h38lgchostj.R.inc(69024);assertEquals("80", field.getAsShortText(80, null));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_add_long_int() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9umwu1h9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_add_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69025,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9umwu1h9d(){try{__CLR4_4_11h381h38lgchostj.R.inc(69025);
        __CLR4_4_11h381h38lgchostj.R.inc(69026);MockCountingDurationField.add_int = 0;
        __CLR4_4_11h381h38lgchostj.R.inc(69027);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69028);assertEquals(61, field.add(1L, 1));
        __CLR4_4_11h381h38lgchostj.R.inc(69029);assertEquals(1, MockCountingDurationField.add_int);
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_add_long_long() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nn6hgl1h9i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_add_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69030,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nn6hgl1h9i(){try{__CLR4_4_11h381h38lgchostj.R.inc(69030);
        __CLR4_4_11h381h38lgchostj.R.inc(69031);MockCountingDurationField.add_long = 0;
        __CLR4_4_11h381h38lgchostj.R.inc(69032);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69033);assertEquals(61, field.add(1L, 1L));
        __CLR4_4_11h381h38lgchostj.R.inc(69034);assertEquals(1, MockCountingDurationField.add_long);
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_add_RP_int_intarray_int() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e06spl1h9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_add_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69035,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e06spl1h9n(){try{__CLR4_4_11h381h38lgchostj.R.inc(69035);
        __CLR4_4_11h381h38lgchostj.R.inc(69036);int[] values = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69037);int[] expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69038);BaseDateTimeField field = new MockStandardBaseDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69039);int[] result = field.add(new TimeOfDay(), 2, values, 0);
        __CLR4_4_11h381h38lgchostj.R.inc(69040);assertEquals(true, Arrays.equals(expected, result));

        __CLR4_4_11h381h38lgchostj.R.inc(69041);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69042);expected = new int[]{10, 20, 31, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69043);result = field.add(new TimeOfDay(), 2, values, 1);
        __CLR4_4_11h381h38lgchostj.R.inc(69044);assertEquals(true, Arrays.equals(expected, result));

        __CLR4_4_11h381h38lgchostj.R.inc(69045);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69046);expected = new int[]{10, 21, 0, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69047);result = field.add(new TimeOfDay(), 2, values, 30);
        __CLR4_4_11h381h38lgchostj.R.inc(69048);assertEquals(true, Arrays.equals(expected, result));

        __CLR4_4_11h381h38lgchostj.R.inc(69049);values = new int[]{23, 59, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69050);try {
            __CLR4_4_11h381h38lgchostj.R.inc(69051);field.add(new TimeOfDay(), 2, values, 30);
            __CLR4_4_11h381h38lgchostj.R.inc(69052);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11h381h38lgchostj.R.inc(69053);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69054);expected = new int[]{10, 20, 29, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69055);result = field.add(new TimeOfDay(), 2, values, -1);
        __CLR4_4_11h381h38lgchostj.R.inc(69056);assertEquals(true, Arrays.equals(expected, result));

        __CLR4_4_11h381h38lgchostj.R.inc(69057);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69058);expected = new int[]{10, 19, 59, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69059);result = field.add(new TimeOfDay(), 2, values, -31);
        __CLR4_4_11h381h38lgchostj.R.inc(69060);assertEquals(true, Arrays.equals(expected, result));

        __CLR4_4_11h381h38lgchostj.R.inc(69061);values = new int[]{0, 0, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69062);try {
            __CLR4_4_11h381h38lgchostj.R.inc(69063);field.add(new TimeOfDay(), 2, values, -31);
            __CLR4_4_11h381h38lgchostj.R.inc(69064);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_addWrapField_long_int() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdicdy1hah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_addWrapField_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69065,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdicdy1hah(){try{__CLR4_4_11h381h38lgchostj.R.inc(69065);
        __CLR4_4_11h381h38lgchostj.R.inc(69066);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69067);assertEquals(29 * 60L, field.addWrapField(60L * 29, 0));
        __CLR4_4_11h381h38lgchostj.R.inc(69068);assertEquals(59 * 60L, field.addWrapField(60L * 29, 30));
        __CLR4_4_11h381h38lgchostj.R.inc(69069);assertEquals(0 * 60L, field.addWrapField(60L * 29, 31));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_addWrapField_RP_int_intarray_int() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18tdx7z1ham();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_addWrapField_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18tdx7z1ham(){try{__CLR4_4_11h381h38lgchostj.R.inc(69070);
        __CLR4_4_11h381h38lgchostj.R.inc(69071);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69072);int[] values = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69073);int[] expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69074);int[] result = field.addWrapField(new TimeOfDay(), 2, values, 0);
        __CLR4_4_11h381h38lgchostj.R.inc(69075);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11h381h38lgchostj.R.inc(69076);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69077);expected = new int[]{10, 20, 59, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69078);result = field.addWrapField(new TimeOfDay(), 2, values, 29);
        __CLR4_4_11h381h38lgchostj.R.inc(69079);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11h381h38lgchostj.R.inc(69080);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69081);expected = new int[]{10, 20, 0, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69082);result = field.addWrapField(new TimeOfDay(), 2, values, 30);
        __CLR4_4_11h381h38lgchostj.R.inc(69083);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11h381h38lgchostj.R.inc(69084);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69085);expected = new int[]{10, 20, 1, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69086);result = field.addWrapField(new TimeOfDay(), 2, values, 31);
        __CLR4_4_11h381h38lgchostj.R.inc(69087);assertEquals(true, Arrays.equals(result, expected));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getDifference_long_long() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17fh4q51hb4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getDifference_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17fh4q51hb4(){try{__CLR4_4_11h381h38lgchostj.R.inc(69088);
        __CLR4_4_11h381h38lgchostj.R.inc(69089);MockCountingDurationField.difference_long = 0;
        __CLR4_4_11h381h38lgchostj.R.inc(69090);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69091);assertEquals(30, field.getDifference(0L, 0L));
        __CLR4_4_11h381h38lgchostj.R.inc(69092);assertEquals(1, MockCountingDurationField.difference_long);
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_getDifferenceAsLong_long_long() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1m2571hb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getDifferenceAsLong_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1m2571hb9(){try{__CLR4_4_11h381h38lgchostj.R.inc(69093);
        __CLR4_4_11h381h38lgchostj.R.inc(69094);MockCountingDurationField.difference_long = 0;
        __CLR4_4_11h381h38lgchostj.R.inc(69095);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69096);assertEquals(30, field.getDifferenceAsLong(0L, 0L));
        __CLR4_4_11h381h38lgchostj.R.inc(69097);assertEquals(1, MockCountingDurationField.difference_long);
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_set_long_int() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rinawz1hbe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_set_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69098,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rinawz1hbe(){try{__CLR4_4_11h381h38lgchostj.R.inc(69098);
        __CLR4_4_11h381h38lgchostj.R.inc(69099);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69100);assertEquals(0, field.set(120L, 0));
        __CLR4_4_11h381h38lgchostj.R.inc(69101);assertEquals(29 * 60, field.set(120L, 29));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_set_RP_int_intarray_int() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17c085k1hbi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_set_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17c085k1hbi(){try{__CLR4_4_11h381h38lgchostj.R.inc(69102);
        __CLR4_4_11h381h38lgchostj.R.inc(69103);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69104);int[] values = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69105);int[] expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69106);int[] result = field.set(new TimeOfDay(), 2, values, 30);
        __CLR4_4_11h381h38lgchostj.R.inc(69107);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11h381h38lgchostj.R.inc(69108);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69109);expected = new int[]{10, 20, 29, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69110);result = field.set(new TimeOfDay(), 2, values, 29);
        __CLR4_4_11h381h38lgchostj.R.inc(69111);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11h381h38lgchostj.R.inc(69112);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69113);expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69114);try {
            __CLR4_4_11h381h38lgchostj.R.inc(69115);field.set(new TimeOfDay(), 2, values, 60);
            __CLR4_4_11h381h38lgchostj.R.inc(69116);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11h381h38lgchostj.R.inc(69117);assertEquals(true, Arrays.equals(values, expected));

        __CLR4_4_11h381h38lgchostj.R.inc(69118);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69119);expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69120);try {
            __CLR4_4_11h381h38lgchostj.R.inc(69121);field.set(new TimeOfDay(), 2, values, -1);
            __CLR4_4_11h381h38lgchostj.R.inc(69122);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11h381h38lgchostj.R.inc(69123);assertEquals(true, Arrays.equals(values, expected));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_set_long_String_Locale() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1481lrq1hc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_set_long_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1481lrq1hc4(){try{__CLR4_4_11h381h38lgchostj.R.inc(69124);
        __CLR4_4_11h381h38lgchostj.R.inc(69125);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69126);assertEquals(0, field.set(0L, "0", null));
        __CLR4_4_11h381h38lgchostj.R.inc(69127);assertEquals(29 * 60, field.set(0L, "29", Locale.ENGLISH));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_set_long_String() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15o1z691hc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_set_long_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15o1z691hc8(){try{__CLR4_4_11h381h38lgchostj.R.inc(69128);
        __CLR4_4_11h381h38lgchostj.R.inc(69129);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69130);assertEquals(0, field.set(0L, "0"));
        __CLR4_4_11h381h38lgchostj.R.inc(69131);assertEquals(29 * 60, field.set(0L, "29"));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_set_RP_int_intarray_String_Locale() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j885c11hcc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_set_RP_int_intarray_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j885c11hcc(){try{__CLR4_4_11h381h38lgchostj.R.inc(69132);
        __CLR4_4_11h381h38lgchostj.R.inc(69133);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69134);int[] values = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69135);int[] expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69136);int[] result = field.set(new TimeOfDay(), 2, values, "30", null);
        __CLR4_4_11h381h38lgchostj.R.inc(69137);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11h381h38lgchostj.R.inc(69138);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69139);expected = new int[]{10, 20, 29, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69140);result = field.set(new TimeOfDay(), 2, values, "29", Locale.ENGLISH);
        __CLR4_4_11h381h38lgchostj.R.inc(69141);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11h381h38lgchostj.R.inc(69142);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69143);expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69144);try {
            __CLR4_4_11h381h38lgchostj.R.inc(69145);field.set(new TimeOfDay(), 2, values, "60", null);
            __CLR4_4_11h381h38lgchostj.R.inc(69146);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11h381h38lgchostj.R.inc(69147);assertEquals(true, Arrays.equals(values, expected));

        __CLR4_4_11h381h38lgchostj.R.inc(69148);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69149);expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11h381h38lgchostj.R.inc(69150);try {
            __CLR4_4_11h381h38lgchostj.R.inc(69151);field.set(new TimeOfDay(), 2, values, "-1", null);
            __CLR4_4_11h381h38lgchostj.R.inc(69152);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11h381h38lgchostj.R.inc(69153);assertEquals(true, Arrays.equals(values, expected));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_convertText() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qj2ptm1hcy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_convertText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qj2ptm1hcy(){try{__CLR4_4_11h381h38lgchostj.R.inc(69154);
        __CLR4_4_11h381h38lgchostj.R.inc(69155);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69156);assertEquals(0, field.convertText("0", null));
        __CLR4_4_11h381h38lgchostj.R.inc(69157);assertEquals(29, field.convertText("29", null));
        __CLR4_4_11h381h38lgchostj.R.inc(69158);try {
            __CLR4_4_11h381h38lgchostj.R.inc(69159);field.convertText("2A", null);
            __CLR4_4_11h381h38lgchostj.R.inc(69160);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11h381h38lgchostj.R.inc(69161);try {
            __CLR4_4_11h381h38lgchostj.R.inc(69162);field.convertText(null, null);
            __CLR4_4_11h381h38lgchostj.R.inc(69163);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    //------------------------------------------------------------------------
//    public abstract DurationField getDurationField();
//
//    public abstract DurationField getRangeDurationField();

    @Test
    public void test_isLeap_long() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yu5r3x1hd8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_isLeap_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yu5r3x1hd8(){try{__CLR4_4_11h381h38lgchostj.R.inc(69164);
        __CLR4_4_11h381h38lgchostj.R.inc(69165);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69166);assertEquals(false, field.isLeap(0L));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_getLeapAmount_long() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u4dic91hdb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getLeapAmount_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69167,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u4dic91hdb(){try{__CLR4_4_11h381h38lgchostj.R.inc(69167);
        __CLR4_4_11h381h38lgchostj.R.inc(69168);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69169);assertEquals(0, field.getLeapAmount(0L));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_getLeapDurationField() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1geo41hde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getLeapDurationField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1geo41hde(){try{__CLR4_4_11h381h38lgchostj.R.inc(69170);
        __CLR4_4_11h381h38lgchostj.R.inc(69171);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69172);assertEquals(null, field.getLeapDurationField());
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getMinimumValue() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f1f2p91hdh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getMinimumValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69173,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f1f2p91hdh(){try{__CLR4_4_11h381h38lgchostj.R.inc(69173);
        __CLR4_4_11h381h38lgchostj.R.inc(69174);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69175);assertEquals(0, field.getMinimumValue());
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_getMinimumValue_long() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16iyk61hdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getMinimumValue_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16iyk61hdk(){try{__CLR4_4_11h381h38lgchostj.R.inc(69176);
        __CLR4_4_11h381h38lgchostj.R.inc(69177);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69178);assertEquals(0, field.getMinimumValue(0L));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_getMinimumValue_RP() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13tfeiw1hdn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getMinimumValue_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13tfeiw1hdn(){try{__CLR4_4_11h381h38lgchostj.R.inc(69179);
        __CLR4_4_11h381h38lgchostj.R.inc(69180);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69181);assertEquals(0, field.getMinimumValue(new TimeOfDay()));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_getMinimumValue_RP_intarray() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz5kov1hdq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getMinimumValue_RP_intarray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz5kov1hdq(){try{__CLR4_4_11h381h38lgchostj.R.inc(69182);
        __CLR4_4_11h381h38lgchostj.R.inc(69183);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69184);assertEquals(0, field.getMinimumValue(new TimeOfDay(), new int[4]));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_getMaximumValue() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hzocf1hdt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getMaximumValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hzocf1hdt(){try{__CLR4_4_11h381h38lgchostj.R.inc(69185);
        __CLR4_4_11h381h38lgchostj.R.inc(69186);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69187);assertEquals(59, field.getMaximumValue());
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_getMaximumValue_long() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kk6lzc1hdw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getMaximumValue_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kk6lzc1hdw(){try{__CLR4_4_11h381h38lgchostj.R.inc(69188);
        __CLR4_4_11h381h38lgchostj.R.inc(69189);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69190);assertEquals(59, field.getMaximumValue(0L));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_getMaximumValue_RP() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pndze1hdz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getMaximumValue_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69191,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pndze1hdz(){try{__CLR4_4_11h381h38lgchostj.R.inc(69191);
        __CLR4_4_11h381h38lgchostj.R.inc(69192);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69193);assertEquals(59, field.getMaximumValue(new TimeOfDay()));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_getMaximumValue_RP_intarray() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19v2tg31he2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getMaximumValue_RP_intarray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19v2tg31he2(){try{__CLR4_4_11h381h38lgchostj.R.inc(69194);
        __CLR4_4_11h381h38lgchostj.R.inc(69195);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69196);assertEquals(59, field.getMaximumValue(new TimeOfDay(), new int[4]));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getMaximumTextLength_Locale() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1th5m161he5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getMaximumTextLength_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1th5m161he5(){try{__CLR4_4_11h381h38lgchostj.R.inc(69197);
        __CLR4_4_11h381h38lgchostj.R.inc(69198);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69199);assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH));

        __CLR4_4_11h381h38lgchostj.R.inc(69200);field = new MockPreciseDurationDateTimeField() {
            public int getMaximumValue() {try{__CLR4_4_11h381h38lgchostj.R.inc(69201);
                __CLR4_4_11h381h38lgchostj.R.inc(69202);return 5;
            }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}
        };
        __CLR4_4_11h381h38lgchostj.R.inc(69203);assertEquals(1, field.getMaximumTextLength(Locale.ENGLISH));

        __CLR4_4_11h381h38lgchostj.R.inc(69204);field = new MockPreciseDurationDateTimeField() {
            public int getMaximumValue() {try{__CLR4_4_11h381h38lgchostj.R.inc(69205);
                __CLR4_4_11h381h38lgchostj.R.inc(69206);return 555;
            }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}
        };
        __CLR4_4_11h381h38lgchostj.R.inc(69207);assertEquals(3, field.getMaximumTextLength(Locale.ENGLISH));

        __CLR4_4_11h381h38lgchostj.R.inc(69208);field = new MockPreciseDurationDateTimeField() {
            public int getMaximumValue() {try{__CLR4_4_11h381h38lgchostj.R.inc(69209);
                __CLR4_4_11h381h38lgchostj.R.inc(69210);return 5555;
            }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}
        };
        __CLR4_4_11h381h38lgchostj.R.inc(69211);assertEquals(4, field.getMaximumTextLength(Locale.ENGLISH));

        __CLR4_4_11h381h38lgchostj.R.inc(69212);field = new MockPreciseDurationDateTimeField() {
            public int getMaximumValue() {try{__CLR4_4_11h381h38lgchostj.R.inc(69213);
                __CLR4_4_11h381h38lgchostj.R.inc(69214);return -1;
            }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}
        };
        __CLR4_4_11h381h38lgchostj.R.inc(69215);assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_getMaximumShortTextLength_Locale() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyw4ns1heo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getMaximumShortTextLength_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyw4ns1heo(){try{__CLR4_4_11h381h38lgchostj.R.inc(69216);
        __CLR4_4_11h381h38lgchostj.R.inc(69217);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69218);assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    //------------------------------------------------------------------------
    @Test
    public void test_roundFloor_long() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13rvn2v1her();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_roundFloor_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13rvn2v1her(){try{__CLR4_4_11h381h38lgchostj.R.inc(69219);
        __CLR4_4_11h381h38lgchostj.R.inc(69220);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69221);assertEquals(-120L, field.roundFloor(-61L));
        __CLR4_4_11h381h38lgchostj.R.inc(69222);assertEquals(-60L, field.roundFloor(-60L));
        __CLR4_4_11h381h38lgchostj.R.inc(69223);assertEquals(-60L, field.roundFloor(-59L));
        __CLR4_4_11h381h38lgchostj.R.inc(69224);assertEquals(-60L, field.roundFloor(-1L));
        __CLR4_4_11h381h38lgchostj.R.inc(69225);assertEquals(0L, field.roundFloor(0L));
        __CLR4_4_11h381h38lgchostj.R.inc(69226);assertEquals(0L, field.roundFloor(1L));
        __CLR4_4_11h381h38lgchostj.R.inc(69227);assertEquals(0L, field.roundFloor(29L));
        __CLR4_4_11h381h38lgchostj.R.inc(69228);assertEquals(0L, field.roundFloor(30L));
        __CLR4_4_11h381h38lgchostj.R.inc(69229);assertEquals(0L, field.roundFloor(31L));
        __CLR4_4_11h381h38lgchostj.R.inc(69230);assertEquals(60L, field.roundFloor(60L));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_roundCeiling_long() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t61ifu1hf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_roundCeiling_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t61ifu1hf3(){try{__CLR4_4_11h381h38lgchostj.R.inc(69231);
        __CLR4_4_11h381h38lgchostj.R.inc(69232);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69233);assertEquals(-60L, field.roundCeiling(-61L));
        __CLR4_4_11h381h38lgchostj.R.inc(69234);assertEquals(-60L, field.roundCeiling(-60L));
        __CLR4_4_11h381h38lgchostj.R.inc(69235);assertEquals(0L, field.roundCeiling(-59L));
        __CLR4_4_11h381h38lgchostj.R.inc(69236);assertEquals(0L, field.roundCeiling(-1L));
        __CLR4_4_11h381h38lgchostj.R.inc(69237);assertEquals(0L, field.roundCeiling(0L));
        __CLR4_4_11h381h38lgchostj.R.inc(69238);assertEquals(60L, field.roundCeiling(1L));
        __CLR4_4_11h381h38lgchostj.R.inc(69239);assertEquals(60L, field.roundCeiling(29L));
        __CLR4_4_11h381h38lgchostj.R.inc(69240);assertEquals(60L, field.roundCeiling(30L));
        __CLR4_4_11h381h38lgchostj.R.inc(69241);assertEquals(60L, field.roundCeiling(31L));
        __CLR4_4_11h381h38lgchostj.R.inc(69242);assertEquals(60L, field.roundCeiling(60L));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_roundHalfFloor_long() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3wvqu1hff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_roundHalfFloor_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3wvqu1hff(){try{__CLR4_4_11h381h38lgchostj.R.inc(69243);
        __CLR4_4_11h381h38lgchostj.R.inc(69244);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69245);assertEquals(0L, field.roundHalfFloor(0L));
        __CLR4_4_11h381h38lgchostj.R.inc(69246);assertEquals(0L, field.roundHalfFloor(29L));
        __CLR4_4_11h381h38lgchostj.R.inc(69247);assertEquals(0L, field.roundHalfFloor(30L));
        __CLR4_4_11h381h38lgchostj.R.inc(69248);assertEquals(60L, field.roundHalfFloor(31L));
        __CLR4_4_11h381h38lgchostj.R.inc(69249);assertEquals(60L, field.roundHalfFloor(60L));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_roundHalfCeiling_long() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_182e0k91hfm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_roundHalfCeiling_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69250,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_182e0k91hfm(){try{__CLR4_4_11h381h38lgchostj.R.inc(69250);
        __CLR4_4_11h381h38lgchostj.R.inc(69251);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69252);assertEquals(0L, field.roundHalfCeiling(0L));
        __CLR4_4_11h381h38lgchostj.R.inc(69253);assertEquals(0L, field.roundHalfCeiling(29L));
        __CLR4_4_11h381h38lgchostj.R.inc(69254);assertEquals(60L, field.roundHalfCeiling(30L));
        __CLR4_4_11h381h38lgchostj.R.inc(69255);assertEquals(60L, field.roundHalfCeiling(31L));
        __CLR4_4_11h381h38lgchostj.R.inc(69256);assertEquals(60L, field.roundHalfCeiling(60L));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_roundHalfEven_long() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hd20a41hft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_roundHalfEven_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69257,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hd20a41hft(){try{__CLR4_4_11h381h38lgchostj.R.inc(69257);
        __CLR4_4_11h381h38lgchostj.R.inc(69258);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69259);assertEquals(0L, field.roundHalfEven(0L));
        __CLR4_4_11h381h38lgchostj.R.inc(69260);assertEquals(0L, field.roundHalfEven(29L));
        __CLR4_4_11h381h38lgchostj.R.inc(69261);assertEquals(0L, field.roundHalfEven(30L));
        __CLR4_4_11h381h38lgchostj.R.inc(69262);assertEquals(60L, field.roundHalfEven(31L));
        __CLR4_4_11h381h38lgchostj.R.inc(69263);assertEquals(60L, field.roundHalfEven(60L));
        __CLR4_4_11h381h38lgchostj.R.inc(69264);assertEquals(60L, field.roundHalfEven(89L));
        __CLR4_4_11h381h38lgchostj.R.inc(69265);assertEquals(120L, field.roundHalfEven(90L));
        __CLR4_4_11h381h38lgchostj.R.inc(69266);assertEquals(120L, field.roundHalfEven(91L));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    @Test
    public void test_remainder_long() {__CLR4_4_11h381h38lgchostj.R.globalSliceStart(getClass().getName(),69267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6jwja1hg3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h381h38lgchostj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h381h38lgchostj.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_remainder_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6jwja1hg3(){try{__CLR4_4_11h381h38lgchostj.R.inc(69267);
        __CLR4_4_11h381h38lgchostj.R.inc(69268);BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        __CLR4_4_11h381h38lgchostj.R.inc(69269);assertEquals(0L, field.remainder(0L));
        __CLR4_4_11h381h38lgchostj.R.inc(69270);assertEquals(29L, field.remainder(29L));
        __CLR4_4_11h381h38lgchostj.R.inc(69271);assertEquals(30L, field.remainder(30L));
        __CLR4_4_11h381h38lgchostj.R.inc(69272);assertEquals(31L, field.remainder(31L));
        __CLR4_4_11h381h38lgchostj.R.inc(69273);assertEquals(0L, field.remainder(60L));
    }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    static class MockPreciseDurationDateTimeField extends PreciseDurationDateTimeField {
        protected MockPreciseDurationDateTimeField() {
            super(DateTimeFieldType.secondOfMinute(),
                    new MockCountingDurationField(DurationFieldType.seconds()));__CLR4_4_11h381h38lgchostj.R.inc(69275);try{__CLR4_4_11h381h38lgchostj.R.inc(69274);
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        protected MockPreciseDurationDateTimeField(DateTimeFieldType type, DurationField dur) {
            super(type, dur);__CLR4_4_11h381h38lgchostj.R.inc(69277);try{__CLR4_4_11h381h38lgchostj.R.inc(69276);
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public int get(long instant) {try{__CLR4_4_11h381h38lgchostj.R.inc(69278);
            __CLR4_4_11h381h38lgchostj.R.inc(69279);return (int) (instant / 60L);
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public DurationField getRangeDurationField() {try{__CLR4_4_11h381h38lgchostj.R.inc(69280);
            __CLR4_4_11h381h38lgchostj.R.inc(69281);return new MockCountingDurationField(DurationFieldType.minutes());
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public int getMaximumValue() {try{__CLR4_4_11h381h38lgchostj.R.inc(69282);
            __CLR4_4_11h381h38lgchostj.R.inc(69283);return 59;
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}
    }

    static class MockStandardBaseDateTimeField extends MockPreciseDurationDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();__CLR4_4_11h381h38lgchostj.R.inc(69285);try{__CLR4_4_11h381h38lgchostj.R.inc(69284);
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public DurationField getDurationField() {try{__CLR4_4_11h381h38lgchostj.R.inc(69286);
            __CLR4_4_11h381h38lgchostj.R.inc(69287);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public DurationField getRangeDurationField() {try{__CLR4_4_11h381h38lgchostj.R.inc(69288);
            __CLR4_4_11h381h38lgchostj.R.inc(69289);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;

        protected MockCountingDurationField(DurationFieldType type) {
            super(type);__CLR4_4_11h381h38lgchostj.R.inc(69291);try{__CLR4_4_11h381h38lgchostj.R.inc(69290);
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public boolean isPrecise() {try{__CLR4_4_11h381h38lgchostj.R.inc(69292);
            __CLR4_4_11h381h38lgchostj.R.inc(69293);return true;
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public long getUnitMillis() {try{__CLR4_4_11h381h38lgchostj.R.inc(69294);
            __CLR4_4_11h381h38lgchostj.R.inc(69295);return 60;
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_11h381h38lgchostj.R.inc(69296);
            __CLR4_4_11h381h38lgchostj.R.inc(69297);return 0;
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public long getMillis(int value, long instant) {try{__CLR4_4_11h381h38lgchostj.R.inc(69298);
            __CLR4_4_11h381h38lgchostj.R.inc(69299);return 0;
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public long getMillis(long value, long instant) {try{__CLR4_4_11h381h38lgchostj.R.inc(69300);
            __CLR4_4_11h381h38lgchostj.R.inc(69301);return 0;
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public long add(long instant, int value) {try{__CLR4_4_11h381h38lgchostj.R.inc(69302);
            __CLR4_4_11h381h38lgchostj.R.inc(69303);add_int++;
            __CLR4_4_11h381h38lgchostj.R.inc(69304);return instant + (value * 60L);
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public long add(long instant, long value) {try{__CLR4_4_11h381h38lgchostj.R.inc(69305);
            __CLR4_4_11h381h38lgchostj.R.inc(69306);add_long++;
            __CLR4_4_11h381h38lgchostj.R.inc(69307);return instant + (value * 60L);
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_11h381h38lgchostj.R.inc(69308);
            __CLR4_4_11h381h38lgchostj.R.inc(69309);difference_long++;
            __CLR4_4_11h381h38lgchostj.R.inc(69310);return 30;
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);__CLR4_4_11h381h38lgchostj.R.inc(69312);try{__CLR4_4_11h381h38lgchostj.R.inc(69311);
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public boolean isPrecise() {try{__CLR4_4_11h381h38lgchostj.R.inc(69313);
            __CLR4_4_11h381h38lgchostj.R.inc(69314);return true;
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public long getUnitMillis() {try{__CLR4_4_11h381h38lgchostj.R.inc(69315);
            __CLR4_4_11h381h38lgchostj.R.inc(69316);return 0;  // this is zero
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_11h381h38lgchostj.R.inc(69317);
            __CLR4_4_11h381h38lgchostj.R.inc(69318);return 0;
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public long getMillis(int value, long instant) {try{__CLR4_4_11h381h38lgchostj.R.inc(69319);
            __CLR4_4_11h381h38lgchostj.R.inc(69320);return 0;
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public long getMillis(long value, long instant) {try{__CLR4_4_11h381h38lgchostj.R.inc(69321);
            __CLR4_4_11h381h38lgchostj.R.inc(69322);return 0;
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public long add(long instant, int value) {try{__CLR4_4_11h381h38lgchostj.R.inc(69323);
            __CLR4_4_11h381h38lgchostj.R.inc(69324);return 0;
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public long add(long instant, long value) {try{__CLR4_4_11h381h38lgchostj.R.inc(69325);
            __CLR4_4_11h381h38lgchostj.R.inc(69326);return 0;
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_11h381h38lgchostj.R.inc(69327);
            __CLR4_4_11h381h38lgchostj.R.inc(69328);return 0;
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);__CLR4_4_11h381h38lgchostj.R.inc(69330);try{__CLR4_4_11h381h38lgchostj.R.inc(69329);
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public boolean isPrecise() {try{__CLR4_4_11h381h38lgchostj.R.inc(69331);
            __CLR4_4_11h381h38lgchostj.R.inc(69332);return false;  // this is false
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public long getUnitMillis() {try{__CLR4_4_11h381h38lgchostj.R.inc(69333);
            __CLR4_4_11h381h38lgchostj.R.inc(69334);return 0;
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_11h381h38lgchostj.R.inc(69335);
            __CLR4_4_11h381h38lgchostj.R.inc(69336);return 0;
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public long getMillis(int value, long instant) {try{__CLR4_4_11h381h38lgchostj.R.inc(69337);
            __CLR4_4_11h381h38lgchostj.R.inc(69338);return 0;
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public long getMillis(long value, long instant) {try{__CLR4_4_11h381h38lgchostj.R.inc(69339);
            __CLR4_4_11h381h38lgchostj.R.inc(69340);return 0;
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public long add(long instant, int value) {try{__CLR4_4_11h381h38lgchostj.R.inc(69341);
            __CLR4_4_11h381h38lgchostj.R.inc(69342);return 0;
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public long add(long instant, long value) {try{__CLR4_4_11h381h38lgchostj.R.inc(69343);
            __CLR4_4_11h381h38lgchostj.R.inc(69344);return 0;
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}

        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_11h381h38lgchostj.R.inc(69345);
            __CLR4_4_11h381h38lgchostj.R.inc(69346);return 0;
        }finally{__CLR4_4_11h381h38lgchostj.R.flushNeeded();}}
    }

}
